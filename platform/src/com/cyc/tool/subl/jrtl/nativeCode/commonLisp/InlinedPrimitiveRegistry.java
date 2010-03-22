package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_SYS;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.T;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.error;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class InlinedPrimitiveRegistry {
	static boolean disableInlining = false;
	final static HashSet<Class> staticsDone = new HashSet<Class>();
	final static HashSet<Class> staticsToDo = new HashSet<Class>();
	final static HashSet<SubLSymbol> neverInlineSymbol = new HashSet<SubLSymbol>();
	final static HashSet<SubLSymbol> alwaysInlineSymbol = new HashSet<SubLSymbol>();
	final static HashSet<SubLSymbol> definedInLisp = new HashSet<SubLSymbol>();
	static int inlinedCount = 0;
	static int missingCount = 0;
	static int wishfullCount = 0;
	static boolean showInlineDebug = false;

	public static SubLObject wrongNumberOfArguments() throws InlineThrows {
		return error(new WrongNumberOfArgumentsException(InlinedPrimitiveRegistry.getCurrentOperator()));
	}

	public class InlineThrows extends RuntimeException {
	}

	public @interface WrongNumberOfArguments {
	}

	private static final Primitive INLINED_PRIMITIVE_METHOD = new JavaPrimitive("INLINED-PRIMITIVE-METHOD", PACKAGE_SYS) {
		public final SubLObject execute(SubLObject primitive, SubLObject nargs) {
			final int i = nargs.intValue();
			final SubLSymbol sym = extractSymbol(primitive);
			//      if (!sym.getName().equals("COPY-TREE")) {
			//        return NIL;
			//      }
			final MethodDescr m = getMethodForSymbol(sym, i);
			if (m == null)
				return NIL;
			if (m.getParameterTypes().length != i) {
				error(new WrongNumberOfArgumentsException((Operator) primitive));
				return NIL;
			}
			((LispSymbolImpl)sym).hasInlined = true;
			m.uses++;
			inlinedCount++;
			return new ABCLJavaObject(m.method);

		}
	};

	protected static SubLSymbol extractSymbol(SubLObject primitive) {
		if (primitive instanceof SubLSymbol) {
			return (SubLSymbol) primitive;
		} else {
			return (SubLSymbol) ((Operator) primitive).getLambdaName();
		}
	}

	// (sys::INLINE-PRIMITIVE-REPORT)
	private static final Primitive INLINED_PRIMITIVE_REPORT = new JavaPrimitive("INLINE-PRIMITIVE-REPORT", PACKAGE_SYS) {
		public SubLObject execute() {
			inlineReport();
			for (Iterator iterator = inlineDecls.iterator(); iterator.hasNext();) {
				MethodDescr type = (MethodDescr) iterator.next();
				Debug.trace("" + type);
			}
			return NIL;
		}
	};

	private static final Primitive INLINED_PRIMITIVE_P = new JavaPrimitive("INLINED-PRIMITIVE-P", PACKAGE_SYS) {

		public SubLObject execute(SubLObject primitive, SubLObject nargs) {
			if (disableInlining)
				return NIL;
			final int i = nargs.intValue();
			final SubLSymbol sym = extractSymbol(primitive);
			if (neverInline(sym))
				return NIL;
			final MethodDescr m = getMethodForSymbol(sym, i);
			if (m == null)
				return NIL;
			if (m.getParameterTypes().length != i) {
				wishfullCount++;
				debugInline(";; Wishfull " + sym.getName() + "/" + i);
				return NIL;
			}
			return T;
		}
	};

	//
	// private static final Primitive INLINED_PRIMITIVE_METHOD =
	// InlinedPrimitive.get(InlinedPrimitive.class, "inlinedPrimitiveMethod",
	// "INLINED-PRIMITIVE-METHOD", PACKAGE_SYS);
	// public static final LispObject inlinedPrimitiveP(LispObject obj) {
	// return (obj instanceof InlinedPrimitive) ? T : NIL;
	// }

	final static String MISSING = "#:MISSING";

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	public @interface InlinableMethod {
		public String name() default MISSING;

		public String pkg() default MISSING;

		public String parms() default MISSING;
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target( { ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
	public @interface NoInline {
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target( { ElementType.FIELD })
	public @interface InlineSymbol {
	}

	// / This is a registry of static methods that may be used by the compiler
	static Set<MethodDescr> inlineDecls = new HashSet<MethodDescr>();
	final static HashMap<String, Object> inlinedMethods = new HashMap<String, Object>();
	final static Object NOSUCHMETHOD = new Object();

	public static MethodDescr getMethodForSymbol(SubLSymbol name, int arity) {
		createRegistry();
		String symname = name.getJavaSymbolName();
		SubLObject pname = name.getLispPackage();
		String key = null;
		if (pname instanceof SubLPackage) {
			String pkname = ((SubLPackage) pname).getJavaName();
			key = symname + ":" + arity + "-" + pkname;
			Object m = inlinedMethods.get(key);
			if (m != null) {
				if (NOSUCHMETHOD == m || m instanceof Integer)
					return null;
				return (MethodDescr) m;
			}
		}
		MethodDescr inexact = null;
		for (MethodDescr desc : inlineDecls) {
			if (desc.matches(name, arity)) {
				if (desc.allowsRest || desc.optionsArgs > 0) {
					inexact = desc;
					continue;
				}
				debugInline("Inline: " + desc);
				inlineReport();
				if (key != null) {
					inlinedMethods.put(key, desc);
				}
				return desc;
			}
		}
		if (inexact == null) {
			if (key != null) {
				missingCount++;
				// debugInline(";;;;; Cannot inline = " + key);
				inlinedMethods.put(key, NOSUCHMETHOD);
			}
			return null;
		}
		// right now only inline exact matches
		if (key != null) {
			inlinedMethods.put(key, NOSUCHMETHOD);
		}
		if (true)
			return null;
		return inexact == null ? null : inexact;
	}

	protected static boolean neverInline(SubLSymbol sym) {
		// just test code right now .. nothing solid
		if (sym == LispSymbols.APPLY)
			return true;
		if (sym == null)
			return true;
		if (definedInLisp.contains(sym))
			return true;
		if (((LispSymbolImpl) sym).neverInline) {
			definedInLisp.add(sym);
			debug(";; defined in lisp " + sym);
			return true;
		}
		return neverInlineSymbol.contains(sym);
	}

	public static void inlineStaticNow(Class<?> class1, SubLSymbol list, String methodName, int req, int opt, boolean rest) {
		try {
			MethodDescr md = new MethodDescr();
			md.requiredArgs = req;
			md.optionsArgs = opt;
			md.allowsRest = rest;
			Class[] c = md.getParameterTypes();
			md.method = class1.getMethod(methodName, c);
			if (!md.method.isAccessible()) {
				md.method.setAccessible(true);
			}
			md.symbol = list;
			md.pkg = ((SubLPackage) md.symbol.getLispPackage()).getJavaName();
			md.name = list.getJavaSymbolName();
			inlineDecls.add(md);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static class MethodDescr {

		protected int uses = 0;

		public boolean equals(Object obj) {
			if (!(obj instanceof MethodDescr))
				return false;
			MethodDescr md = (MethodDescr) obj;
			if (md.method != method)
				return false;
			if (md.requiredArgs != requiredArgs)
				return false;
			if (md.allowsRest != allowsRest)
				return false;

			if (md.symbol != symbol)
				return false;

			if (name == MISSING)
				return false;

			if (!md.name.equals(name))
				return false;

			return true;
		}

		public Class[] getParameterTypes() {
			if (method != null)
				return method.getParameterTypes();
			ArrayList<Class> pts = new ArrayList<Class>();
			int add = requiredArgs;
			while (add-- > 0)
				pts.add(SubLObject.class);
			add = optionsArgs;
			while (add-- > 0)
				pts.add(SubLObject.class);
			if (allowsRest)
				pts.add(SubLObject[].class);
			return pts.toArray(new Class[requiredArgs + optionsArgs + (allowsRest ? 1 : 0)]);
		}

		public boolean matches(SubLSymbol sym) {
			if (symbol != null)
				return sym == symbol;

			String named = sym.getJavaSymbolName();
			if (!named.equals(name))
				return false;

			if (pkg != MISSING) {
				SubLObject pk = sym.getLispPackage();
				if (pk == NIL)
					return false;
				if (!((SubLPackage) pk).getJavaName().equals(pkg))
					return false;
			}
			return true;
		}

		public boolean matches(SubLSymbol name2, int arity) {
			if (!matches(name2))
				return false;

			int overflow = arity - requiredArgs;
			// underflow
			if (overflow < 0)
				return false;
			// good enough
			if (overflow == 0) {
				return true;
			}
			// consider optional on an overflow
			overflow = overflow - optionsArgs;
			if (overflow <= 0) {
				return true;
			}
			// overflow ok?
			return allowsRest;
		}

		public String toString() {
			return symbol.writeToString() + "/" + requiredArgs + " "
					+ ((allowsRest ? "&rest" : "") + " " + method).replace("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.", "") + " (" + uses + ")";
		}

		Method method;
		SubLSymbol symbol;
		String name = MISSING;
		String pkg = MISSING;
		String parms = MISSING;
		int requiredArgs = 0;
		int optionsArgs = 0;
		boolean allowsRest = false;
	}

	private static Operator getOperator(Method method) {
		if (memberNoInline(method)) {
			return null;
		}
		String mname = method.getName();
		if (mname.startsWith("sf_")) {
			mname = mname.substring(3);
			return null;
		}
		if (false && mname.contains("__")) {
			return null;
		}
		mname = undressMethodName(mname);
		try {
			Field f = method.getDeclaringClass().getDeclaredField(mname.toUpperCase());
			/// .NET can return null fields
			if (memberNoInline(f)) {
				return null;
			}
			if (!f.isAccessible())
				f.setAccessible(true);
			return (Operator) f.get(null);
		} catch (NoSuchFieldException e1) {
			return null;
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}

	private static boolean memberNoInline(AccessibleObject f) {
		if (f == null)
			return true;
		if (f.getAnnotation(NoInline.class) != null) {
			return true;
		}
		if (f.getAnnotation(InlineSymbol.class) != null) {
			return false;
		}
		String mname = f.toString();
		if (false && mname.contains("__")) {
			return true;
		}
		return false;
	}

	private static String guessName(Method method) {
		String mname = method.getName();
		mname = undressMethodName(mname);
		try {
			Operator op = getOperator(method);
			return op.getLambdaName().STRING().getString();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mname;
	}

	private static String undressMethodName(String mname) {
		if (mname.endsWith("_execute")) {
			mname = mname.substring(0, mname.length() - 8);
		}
		if (mname.startsWith("sf_")) {
			mname = mname.substring(3).toUpperCase();
		} else if (mname.startsWith("pf_")) {
			mname = mname.substring(3).toUpperCase();
		}
		return mname;
	}

	private static SubLSymbol extractSymbol(Method method) {
		String mname = method.getName();
		mname = undressMethodName(mname);
		Class dc = method.getDeclaringClass();
		for (Field f : dc.getDeclaredFields()) {
			if (Operator.class.isAssignableFrom(f.getType())) {
				String fname = f.getName();
				if (fname.equals(mname)) {
					try {
						if (!f.isAccessible()) {
							f.setAccessible(true);
						}
						Operator op = (Operator) f.get(null);
						return (SubLSymbol) op.getLambdaName();
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}

	public static void inlineStatics(Class tramp) {
		if (tramp == null)
			return;
		if (staticsDone.contains(tramp))
			return;
		staticsToDo.add(tramp);
		registryUpToDate = false;
	}

	static boolean registryUpToDate = false;

	public static void createRegistry() {
		if (registryUpToDate)
			return;
		registryUpToDate = true;
		for (Class c : staticsToDo.toArray(new Class[staticsToDo.size()])) {
			inlineStaticsNow(c);
		}
		inlineReport();
	}

	static void inlineReport() {
		debugInline(";; INLINE REPORT total=" + inlineDecls.size() + " cannot=" + missingCount + " soon=" + wishfullCount
				+ " inlined-calls=" + inlinedCount);

	}

	public synchronized static void inlineStaticsNow(Class tramp) {
		inlineStaticsNow(tramp, true);
	}

	public static void inlineStaticsNow(Class tramp, boolean doStatics) {
		if (tramp == null)
			return;

		staticsToDo.remove(tramp);
		boolean needsDoing = staticsDone.add(tramp);
		// if (!needsDoing) return;

		for (Field f : tramp.getDeclaredFields()) {
			if (!Operator.class.isAssignableFrom(f.getType()))
				continue;
			if (!f.isAccessible())
				f.setAccessible(true);
			try {
				Operator p = (Operator) f.get(null);
				SubLSymbol sym = (SubLSymbol) p.getLambdaName();
				if (memberNoInline(f)) {
					neverInlineSymbol.add(sym);
					debug("Never inlining " + sym.writeToString());
				}
				if (f.getAnnotation(InlineSymbol.class) != null) {
					alwaysInlineSymbol.add(sym);
					debug("Always inlining " + sym.writeToString());
				}
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Class inlineMethodClass = InlinableMethod.class;

		for (Method method : tramp.getDeclaredMethods()) {

			if (memberNoInline(method))
				continue;

			final MethodDescr md;

			InlinableMethod annotation = (InlinableMethod) method.getAnnotation(inlineMethodClass);
			final int mods = method.getModifiers();

			SubLSymbol sym;
			if (annotation != null) {
				md = new MethodDescr();
				md.name = annotation.name();
				if (md.name == MISSING)
					md.name = guessName(method);
				md.pkg = annotation.pkg();
				md.parms = annotation.parms();
				sym = extractSymbol(method);
			} else {
				if (Modifier.isPrivate(mods) || !Modifier.isStatic(mods))
					continue;
				if (method.getReturnType() != SubLObject.class)
					continue;
				Operator op = getOperator(method);
				if (op == null)
					continue;
				sym = (SubLSymbol) op.getLambdaName();
				if (op instanceof SpecialOperator) {
					if (sym != null)
						neverInlineSymbol.add(sym);
					continue;
				}
				boolean mustInline = alwaysInlineSymbol.contains(sym);
				if (!mustInline && !doStatics)
					continue;
				md = new MethodDescr();
				String guessName = guessName(method);
				md.name = guessName;
			}

			md.method = method;
			md.symbol = sym;
			if (md.symbol == null) {
				return;
			}
			md.pkg = ((SubLPackage) md.symbol.getLispPackage()).getJavaName();
			boolean skip = false;
			Class[] argTypes = method.getParameterTypes();
			for (Class class1 : argTypes) {
				if (class1 == SubLObject.class) {
					md.requiredArgs++;
				} else if (class1 == SubLObject[].class) {
					md.allowsRest = true;
				} else {
					skip = true;
					break;
				}
			}
			if (skip)
				continue;
			if (!inlineDecls.contains(md)) {
				if (!method.isAccessible())
					method.setAccessible(true);
				inlineDecls.add(md);
				// debugInline(";; INLINABLE: " + md);
			}
		}
	}

	private static void debug(String string) {
		if (showInlineDebug)
			debugInline(";; INLINE DEBUG: " + string);
	}

	public static void debugInline(String string) {
		if (false)
			Debug.trace(string);
	}

	public static Operator getCurrentOperator() {
		// just a workarr9ound for testing
		return INLINED_PRIMITIVE_P;
	}

	public static void registerSubClass(Operator operator) {
		inlineStatics(operator.getClass());
		inlineStatics(operator.getClass().getDeclaringClass());
	}

}
