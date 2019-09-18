package org.logicmoo.system;

import static org.logicmoo.system.BeanShellCntrl.object_to_term;
import static org.logicmoo.system.Startup.EMPTY_LISP_OBJECT;
import static org.logicmoo.system.Startup.createStackTraceString;
import static org.logicmoo.system.Startup.invokeM;
import static org.logicmoo.system.Startup.terms_to_lisp_objects;
import static org.logicmoo.system.Startup.with_jpl_catcher;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Callable;

import org.armedbear.lisp.Cons;
import org.armedbear.lisp.Environment;
import org.armedbear.lisp.Java;
import org.armedbear.lisp.JavaObject;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispError;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Main;
import org.jpl7.JPLException;
import org.jpl7.Term;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;

public class JMultiMethodSelector {

	JMultiMethodSelector(JMultiMethod mm) {
		jMultiMethod = mm;
	}

	private final JMultiMethod jMultiMethod;
	private boolean evalArgs = true;
	final private int[] methodsPerArity = new int[10];
	private Method[] methodByArity;
	private Method macro;
	private int methodCount;
	final java.util.List<Method> jMethods = new ArrayList(1);

	public void addMethod(Method m) {
		if (m != null) {
			addMethod0(m);

			Class[] pt = m.getParameterTypes();
			if (pt.length == 0) {
				if (methodCount != 1) {
					Startup.bp();
				}
				isSpecial();
			}

		}
	}

	synchronized private void addMethod0(Method m) {

		if (jMethods.contains(m)) {
			jMethods.remove(m);
			jMethods.add(0, m);
			return;
		} else {
			jMethods.add(0, m);
		}
		
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

		if (paramLen == 2 && (pt[1] == Environment.class || pt[1] == SubLEnvironment.class)) {
			evalArgs = false;
			macro = m;
			return;
		}

		final int forThisarity = methodsPerArity[paramLen];

		if (forThisarity == 0) {
			if (methodByArity == null) {
				methodByArity = new Method[10];
			}
			methodByArity[paramLen] = m;
			methodsPerArity[paramLen] = 1;
			methodCount++;
			return;
		}

		Method was = methodByArity[paramLen];

		if (was == m)
			return;

		methodByArity[paramLen] = null;
		methodsPerArity[paramLen]++;
		methodCount++;
		return;
	}

	// Special operator
	public LispObject executeOP(LispObject form, Environment env) {
		if (jMultiMethod.isSubLispBased()) {
			SubLObject toEval = jMultiMethod.superApply((SubLCons) form, env);
			return (LispObject) toEval;// (LispObject) toEval.eval(env);
		}
		return Lisp.eval(form, env);
	}

	public LispObject executeAE(LispObject args, Environment env) {
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
		if (args == Lisp.NIL) {
			return executeEVA(env, EMPTY_LISP_OBJECT);
		}
		return executeEVA(env, args.copyToArray());
	}

	private LispObject executeEML(Environment env, int paramLen, boolean tryPTLArityFirst, LispObject[] args) {
		Method[] methodsArray = methodByArity;
		Method m = findMethod(methodsArray, args);
		if (m == null) {
			if (jMethods != null && jMethods.size() > 0) {
				methodsArray = jMethods.toArray(new Method[jMethods.size()]);
				m = findMethod(methodsArray, args);
				if (m == null) {
					m = findMethod(methodsArray, args);
				}
			}
		}
		if (m == null)
			Lisp.error(new LispError("no such method"));
		return invokeArgs(m, env, args);
	}

	public LispObject executeEVA(Environment env, LispObject[] args) {
		int paramLen = args.length;
		if (methodByArity == null || methodsPerArity[paramLen] != 1) {
			return executeEML(env, paramLen, true, args);
		}
		Method m = methodByArity[paramLen];
		if (m == null) {
			Startup.bp();
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
			} else if (false && Lisp.T == arg) {
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

	public static Method findMethod(Method[] staticMethods, Object[] javaArgs) {
		int argCount = javaArgs.length;
		Method result = null;
		Method macro = null;
		for (int i = staticMethods.length; i-- > 0;) {
			Method method = staticMethods[i];
			if (method == null) {
				continue;
			}
			final Class<?>[] parameterTypes = method.getParameterTypes();
			final int parameterTypeslength = parameterTypes.length;
			if (parameterTypeslength != argCount) {
				continue;
			}
			Class<?>[] methodTypes = parameterTypes;
			if (!Java.isApplicableMethod(methodTypes, javaArgs)) {
				continue;
			}
			if (result == null || Java.isMoreSpecialized(methodTypes, result.getParameterTypes())) {
				result = method;
			}
		}
		if (result == null)
			return macro;
		return result;
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
				final boolean hasStaticMethods = jMethods != null && jMethods.size() > 0;
				if (hasStaticMethods) {
					methodsArray = jMethods.toArray(new Method[jMethods.size()]);
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
					Lisp.error(new LispError("no such method"));
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

	public boolean isFunction() {
		return evalArgs;
	}

	public boolean isSpecial() {
		if (evalArgs) {
			//	bp();
		}
		return !evalArgs;
	}

}
