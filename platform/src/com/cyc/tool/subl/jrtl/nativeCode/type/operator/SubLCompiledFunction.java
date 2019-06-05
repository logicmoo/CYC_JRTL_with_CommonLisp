//
////
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import org.armedbear.lisp.ControlTransfer;
import org.armedbear.lisp.Fixnum;
import org.armedbear.lisp.Function;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.LispThread;
import org.armedbear.lisp.SpecialBindingsMark;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.Unhandleable;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.PatchFileLoader;
public class SubLCompiledFunction extends Function implements SubLFunction {
	public class FuncallCounts {
		FuncallCounts() {
			Arrays.fill(counts = new int[51], 0);
			SubLCompiledFunction.funcallCountsArray.add(this);
		}

		public int[] counts;

		public String getMethodName() {
			return method.getName();
		}

		synchronized void incCount(int arity) {
			if (arity > 50) {
				return;
			}
			final int[] counts = this.counts;
			++counts[arity];
		}
	}

	@Override
	public boolean isSubLispBased() {
		return true;
	}

	SubLCompiledFunction(Method method, SubLSymbol functionSymbol, int requiredArgCount, int optionalArgCount,
			boolean allowsRest) {
		super(functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
		//argList = null;
		funcallCounts = new FuncallCounts();
		if (method == null) {
			Errors.error("Got null native method for: " + functionSymbol);
		}
		setMethod(method);
		functionSymbol.setFunction(this);
	}

	SubLCompiledFunction(String methodClassStr, String methodName, Class[] methodParameters, Class returnType,
			SubLSymbol functionSymbol, int requiredArgCount, int optionalArgCount, boolean allowsRest) {
		super(functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
		//argList = null;
		funcallCounts = new FuncallCounts();
		this.methodClassStr = methodClassStr;
		this.methodName = methodName;
		this.methodParameters = methodParameters;
		this.returnType = returnType;
		functionSymbol.setFunction(this);
	}

    @Override
	public String printObject()
    {
    	return super.printObject();
    }
	@Override
	protected void extraInfo(StringBuilder sb) {
		Method prev = method;
		Class methodClassPrev = methodClass;
		if (methodClass == null || method == null)
		{
		  method = getMethod();
		  if(method!=null)
			methodClass = method.getDeclaringClass();
		}
		if (methodClass != null)
		{
			sb.append(Lisp.getDotName(methodClass));
		}
		if (method != null)
		{
			sb.append("::" + method.getName());
		}
		final SubLList subLArgs = getArglist();
		sb.append(subLArgs);
		method = prev;
		methodClass = methodClassPrev;
	}

	private Method method;
	private Class methodClass;
	private Class returnType;
	private String methodClassStr;
	private String methodName;
	private Class[] methodParameters;
	//private final SubLList argList;
	public volatile FuncallCounts funcallCounts;
	//public static String FUNCTION_TYPE_NAME;
	public static boolean SHOULD_MAINTAIN_FUNCALL_COUNTS = true;
	public static int MAX_ARITY_TO_MAINTAIN_COUNTS_FOR = 50;
	public static int MIN_FUNCALL_COUNTS_TO_CARE_ABOUT = 100;
	public static ArrayList<FuncallCounts> funcallCountsArray;
	public static boolean USE_DIRECT_CALLING_MECHANISM = false;
	static {
		SubLCompiledFunction.FUNCTION_TYPE_NAME = "FUNCTION";
		funcallCountsArray = new ArrayList<FuncallCounts>();
	}

	private void setMethod(Method method) {
		if (method == null) {
			Errors.error("Got null native method for: " + this);
		}
		methodClassStr = method.getDeclaringClass().getName();
		methodName = method.getName();
		methodParameters = method.getParameterTypes();
		returnType = method.getReturnType();
	}
	@Override
	public LispObject arrayify(LispObject... args) {
		return (LispObject) applyObject(args);
	}
	public SubLObject applyObject(SubLObject... args) {
		return funcall(args);
	}
	@Override
	public SubLObject apply(Object[] args) {
		int arity = 0;
		for (int i = 0, size = args.length; i < size; ++i) {
			if (args[i] != CommonSymbols.UNPROVIDED) {
				if (args[i] instanceof SubLObject[]) {
					arity += ((SubLObject[]) args[i]).length;
				} else {
					++arity;
				}
			}
		}
		Method m = getMethod();
		funcallCounts.incCount(arity);
		SubLObject result = null;
		try {
			result = (SubLObject) m.invoke(null, args);
			return Values.setFirstMultipleValue(result);
		} catch (final InvocationTargetException ite) {
			final Throwable e = ite.getCause();
			if (e instanceof Unhandleable) {
				throw (Unhandleable) e;
			}
			if (e instanceof ControlTransfer) {
				throw (ControlTransfer) e;
			}
			if (e instanceof Error) {
				throw (Error) e;
			}
			e.printStackTrace();

			try {
				result = (SubLObject) m.invoke(null, args);
			} catch (Throwable e1) {
				// TODO Auto-generated catch block
			}
			Errors.error("Error calling " + methodName + ".", e);

		} catch (final Throwable e2) {
			if (e2 instanceof Unhandleable) {
				throw (Unhandleable) e2;
			}
			if (e2 instanceof CatchableThrow) {
				throw (CatchableThrow) e2;
			}
			if (e2 instanceof Error) {
				throw (Error) e2;
			}
			Errors.error("Error calling " + methodName + ".", e2);
		}
		return NIL;
	}

	@Override
	public int applyArity() {
		return getRequiredArgCount() + getOptionalArgCount();
	}

	@Override
	public SubLList getArglist() {
		final SubLList existing = argList;
		if (existing != null) {
			return existing;
		}
		final int required = getRequiredArgCount();
		final int optional = getOptionalArgCount();
		final boolean rest = allowsRest();
		final int size = required + (optional > 0 ? optional + 1 : 0) + (rest ? 2 : 0);
		SubLObject current;
		final SubLList arglist = (SubLList) (current = SubLObjectFactory.makeList(size, CommonSymbols.NIL));
		final SubLPackage sublispPackage = SubLPackage.findPackageNamed("SUBLISP");
		int i;
		for (i = 0; i < required; ++i, current = current.rest()) {
			final SubLSymbol sym = SubLObjectFactory.makeSymbol("REQ-" + i, sublispPackage);
			current.setFirst(sym);
		}
		if (optional > 0) {
			current.setFirst(CommonSymbols.OPTIONAL_SYMBOL);
			for (current = current.rest(); i < (required + optional); ++i, current = current.rest()) {
				final SubLSymbol sym = SubLObjectFactory.makeSymbol("OPT-" + i, sublispPackage);
				current.setFirst(sym);
			}
		}
		if (rest) {
			current.setFirst(CommonSymbols.REST_SYMBOL);
			current = current.rest();
			final SubLSymbol sym = SubLObjectFactory.makeSymbol("REST-LIST", sublispPackage);
			current.setFirst(sym);
		}
		this.argList = arglist;
		return arglist;
	}

	@Override
	public boolean equal(SubLObject obj) {
		if (this == obj) return true;
		if (obj instanceof SubLCompiledFunction)
		{
			SubLCompiledFunction other = (SubLCompiledFunction) obj;
			Method om = other.getMethod();
			Method tm = this.getMethod();
			if (!om.equals(tm)) return false;
			if (getRequiredArgCount() != other.getRequiredArgCount()) return false;
			if (getOptionalArgCount() != other.getOptionalArgCount()) return false;
			if (isSubLispBased() != other.isSubLispBased()) return false;
			//if (getOptionalArgCount() != other.getOptionalArgCount()) return false;
			return true;
		}
		return super.equal(obj);
	}

	public Method getMethod() {
		if (method == null) {
			try {
				final Class theClass = PatchFileLoader.PATCH_FILE_LOADER.loadClass(methodClassStr);
				method = theClass.getMethod(methodName, methodParameters);
			} catch (final Exception e) {
			  if(SubLMain.TINY_KB) return null;
			  e.printStackTrace();
				Errors.error("Problem initializing function: " + methodClassStr + "." + methodName);
			}
		}
		return method;
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8) {
			final Method method2 = getMethod();
      if(method2!=null)return method2.hashCode();
		}
		return 0;
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return true;
	}

	@Override
	public boolean isFunctionSpec() {
		return true;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isInterpreted() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return false;
	}

	@Override
	public boolean isSpecial() {
		return false;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	@Override
	public String toTypeName() {
		return SubLCompiledFunction.FUNCTION_TYPE_NAME;
	}
}
