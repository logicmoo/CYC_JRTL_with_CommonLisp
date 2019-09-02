/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.logicmoo.system;

import static org.logicmoo.system.BeanShellCntrl.multiMethod;
import static org.logicmoo.system.BeanShellCntrl.object_to_term;
import static org.logicmoo.system.Startup.EMPTY_LISP_OBJECT;
import static org.logicmoo.system.Startup.bp;
import static org.logicmoo.system.Startup.createStackTraceString;
import static org.logicmoo.system.Startup.findMethod;
import static org.logicmoo.system.Startup.invokeM;
import static org.logicmoo.system.Startup.terms_to_lisp_objects;
import static org.logicmoo.system.Startup.with_jpl_catcher;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.concurrent.Callable;

import org.armedbear.lisp.Cons;
import org.armedbear.lisp.Environment;
import org.armedbear.lisp.JavaObject;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispError;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.SpecialOperator;
import org.armedbear.lisp.Symbol;
import org.jpl7.JPLException;
import org.jpl7.Term;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
public class SpecialMethod extends SpecialOperator {
	boolean evalArgs = true;
	// LispMethod lispMethod;
	Method[] methodByArity;
	Method macro;
	int methodCount;
	java.util.Set<Method> staticMethods;

	public SpecialMethod(Symbol sym) {
		super(sym, "&rest any");
	}

	synchronized public void addMethod(Method m) {
		if (m != null) {
			Class[] pt = m.getParameterTypes();
			addMethod0(m);
			if (pt.length == 0) {
				if (methodCount != 1) {
					bp();
				}
				isSpecial();
			}

		}
	}

	void addMethod0(Method m) {
		LispMethod lm = m.getAnnotation(LispMethod.class);
		if (lm != null) {
			if (!lm.evalArgs()) {
				evalArgs = false;
			} else {
				evalArgs = true;
			}
		}
		Class[] pt = m.getParameterTypes();
		int paramLen = pt.length;
		if (paramLen == 0) {
			evalArgs = true;
		}
		if (paramLen == 2 && (pt[1] == Environment.class || pt[1] == SubLEnvironment.class)) {
			evalArgs = false;
			macro = m;
			return;
		}
		if (methodByArity == null) {
			methodByArity = new Method[10];
			methodByArity[paramLen] = m;
			methodCount++;
			return;
		}
		Method was = methodByArity[paramLen];
		if (was == m)
			return;
		if (was == null) {
			methodByArity[paramLen] = m;
			methodCount++;
			return;
		}
		if (staticMethods == null)
			staticMethods = new HashSet<Method>();
		if (was == multiMethod) {
			staticMethods.add(m);
			methodCount++;
			return;
		}
		methodByArity[paramLen] = multiMethod;
		methodCount++;
		staticMethods.add(m);
		staticMethods.add(was);
	}

	@Override
	public LispObject arrayify(LispObject... args) {
		return executeEVA(null, args);
	}

	@Override
	public LispObject execute(LispObject args, Environment env) {
		if (methodByArity != null) {
			Method m = methodByArity[2];
			if (m != null) {
				Class[] parameterTypes = m.getParameterTypes();
				Class class1 = parameterTypes[1];
				if (class1 == Environment.class || class1 == SubLEnvironment.class) {
					final Object result = invokeM(m, null, args, env);
					return JavaObject.getInstance(result, true, m.getReturnType());
				}
			}
		}
		if (args == NIL) {
			return executeEVA(env, EMPTY_LISP_OBJECT);
		}
		return executeEVA(env, args.copyToArray());
	}

	// Special operator
	public LispObject executeOP(LispObject form, Environment env) {
		if (isSubLispBased()) {
			SubLObject toEval = super.apply((SubLCons) form, env);
			return (LispObject) toEval;// (LispObject) toEval.eval(env);
		}
		return Lisp.eval(form, env);
	}

	@Override
	public LispObject execute(LispObject[] args) {
		return executeEVA(Environment.currentLispEnvironment(), args);
	}

	private LispObject executeEML(Environment env, int paramLen, boolean tryPTLArityFirst, LispObject[] args) {
		Method[] methodsArray = methodByArity;
		Method m = findMethod(methodsArray, args);
		if (m == null) {
			if (staticMethods != null && staticMethods.size() > 0) {
				methodsArray = staticMethods.toArray(new Method[staticMethods.size()]);
				m = findMethod(methodsArray, args);
				if (m == null) {
					m = findMethod(methodsArray, args);
				}
			}
		}
		if (m == null)
			error(new LispError("no such method"));
		return invokeArgs(m, env, args);
	}

	public LispObject executeEVA(Environment env, LispObject[] args) {
		int paramLen = args.length;
		if (methodByArity == null)
			executeEML(env, paramLen, true, args);
		Method m = methodByArity[paramLen];
		if (m == multiMethod) {
			return executeEML(env, paramLen, true, args);
		}
		if (m == null) {
			return executeEML(env, paramLen, false, args);
		}
		return invokeArgs(m, env, args);
	}

	private LispObject invokeArgs(Method m, Environment env, LispObject[] args) {
		Class[] argTypes = m.getParameterTypes();
		int argTypesLen = argTypes.length;
		int usedLen = args.length;
		if (argTypesLen == 2 && SubLEnvironment.class.isAssignableFrom(argTypes[1])) {
			LispObject invokeWith;
			assert env != null;
			if (usedLen == 1) {
				invokeWith = new Cons(args[0]);
			} else {
				invokeWith = Lisp.list(args);
			}
			return (LispObject) invokeM(m, null, invokeWith, env);
		}
		Object[] methodArgs = new Object[argTypesLen];
		for (int i = 0; i < usedLen; i++) {
			LispObject arg = args[i];
			if (evalArgs) {
				LispObject sarg = Lisp.eval(arg, env);
				arg = sarg;
			}
			if (false && Lisp.NULL(arg)) {
				methodArgs[i] = false;
			} else if (false && T == arg) {
				methodArgs[i] = true;
			} else {
				Class type = argTypes[i];
				if (type == LispObject.class) {
					methodArgs[i] = arg;
				} else if (type == Term.class) {
					methodArgs[i] = object_to_term(arg);
				} else {
					methodArgs[i] = arg.javaInstance(type);
				}
			}
		}
		m.setAccessible(true);
		Object result = invokeM(m, null, methodArgs);
		if (LispObject.class.isAssignableFrom(m.getReturnType()))
			return (LispObject) result;
		if (result instanceof Boolean)
			return (LispObject) SubLObjectFactory.makeBoolean((Boolean) result);
		return JavaObject.getInstance(result, true, m.getReturnType());
	}

	@Override
	public SubLObject apply(SubLCons p0, SubLEnvironment p1) {
		return getBinaryFunction().processItem(p0, p1);
		// return Lisp.eval(cons, env);
		// Errors.unimplementedMethod("Auto-generated method stub:
		// SubLFunction.apply");
		// return null;
	}

	@Override
	public LispObject funcallCL(LispObject... args) {
		return this.execute(args);
	}

	@Override
	public SubLObject evalViaApply(SubLCons form, SubLEnvironment env) {
		if (isSubLispBased()) {
			return super.evalViaApply(form, env);
		}
		return Lisp.eval((Cons) form, (Environment) env);
	}

	@Override
	public boolean isInterpreted() {
		return true;
	}

	@Override
	public boolean isFunction() {
		return evalArgs;
	}

	@Override
	public boolean isSpecial() {
		if (evalArgs) {
			bp();
		}
		return !evalArgs;
	}

	@Override
	public boolean isSpecialRestOnly() {
		return super.isSpecialRestOnly();
	}

	public void setEvalArgsFirst(boolean evalArgsFirst) {
		evalArgs = evalArgsFirst;
	}

	public Object invokeFromProlog(final Term list, final Term result) throws Exception {
		return with_jpl_catcher(new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				return invokeFromProlog0(list, result);
			}
		}).call();
	}

	public Object invokeFromProlog0(Term list, Term result) {
		boolean wasNoDebug = Main.isNoDebug();
		try {
			final Term[] args = list.args();
			Method m = null;
			Object[] javaArgs = args;
			do {
				if (methodByArity != null) {
					if ((m = findMethod(methodByArity, javaArgs)) != null)
						break;
				}
				Method[] methodsArray = null;
				final boolean hasStaticMethods = staticMethods != null && staticMethods.size() > 0;
				if (hasStaticMethods) {
					methodsArray = staticMethods.toArray(new Method[staticMethods.size()]);
					if ((m = findMethod(methodsArray, javaArgs)) != null)
						break;
				}
				javaArgs = terms_to_lisp_objects(args);
				if ((m = findMethod(methodByArity, javaArgs)) != null)
					break;
				if (hasStaticMethods) {
					if ((m = findMethod(methodsArray, javaArgs)) != null)
						break;
				}
				if ((m = macro) == null)
					error(new LispError("no such method"));
				break;
			} while (true);
			if (!wasNoDebug) {
				Main.setNoDebug(true);
			}
			Object o = invokeM(m, null, javaArgs);
			if (!result.isVariable()) {
				return result;
			}
			Class rt = m.getReturnType();
			if (Term.class.isAssignableFrom(rt)) { //
				return o;
			} else if (LispObject.class.isAssignableFrom(rt) || SubLObject.class.isAssignableFrom(rt)) {
				Term t = object_to_term(o);
				return t;
			} else {
				Term t = object_to_term(o);
				return t;
			}
		} catch (Throwable e) {
			if (!wasNoDebug) {
				Main.setNoDebug(false);
			}
			e.printStackTrace();
			System.err.println("" + e.getMessage());
			if (e instanceof JPLException) {
				throw (JPLException) e;
			}
			throw new JPLException(createStackTraceString(e));
		} finally {
			Main.setNoDebug(wasNoDebug);
		}
	}

}