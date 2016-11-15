package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class InlinedPrimitiveRegistry {
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	public @interface InlinableMethod {
		public String name() default InlinedPrimitiveRegistry.MISSING;

		public String parms() default InlinedPrimitiveRegistry.MISSING;

		public String pkg() default InlinedPrimitiveRegistry.MISSING;
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ElementType.FIELD })
	public @interface InlineSymbol {
	}

	public class InlineThrows extends RuntimeException {
	}

	public static class MethodDescr {

		protected int uses = 0;

		Method method;

		SubLSymbol symbol;

		String name = InlinedPrimitiveRegistry.MISSING;

		String pkg = InlinedPrimitiveRegistry.MISSING;

		String parms = InlinedPrimitiveRegistry.MISSING;

		int requiredArgs = 0;
		int optionsArgs = 0;
		boolean allowsRest = false;

		public boolean equals(Object obj) {
			if (!(obj instanceof MethodDescr))
				return false;
			MethodDescr md = (MethodDescr) obj;
			if (md.method != this.method)
				return false;
			if (md.requiredArgs != this.requiredArgs)
				return false;
			if (md.allowsRest != this.allowsRest)
				return false;

			if (md.symbol != this.symbol)
				return false;

			if (this.name == InlinedPrimitiveRegistry.MISSING)
				return false;

			if (!md.name.equals(this.name))
				return false;

			return true;
		}

		public Class[] getParameterTypes() {
			if (this.method != null)
				return this.method.getParameterTypes();
			ArrayList<Class> pts = new ArrayList<Class>();
			int add = this.requiredArgs;
			while (add-- > 0)
				pts.add(SubLObject.class);
			add = this.optionsArgs;
			while (add-- > 0)
				pts.add(SubLObject.class);
			if (this.allowsRest)
				pts.add(SubLObject[].class);
			return pts.toArray(new Class[this.requiredArgs + this.optionsArgs + (this.allowsRest ? 1 : 0)]);
		}

		public boolean matches(SubLSymbol sym) {
			if (this.symbol != null)
				return sym == this.symbol;

			String named = sym.getJavaSymbolName();
			if (!named.equals(this.name))
				return false;

			if (this.pkg != InlinedPrimitiveRegistry.MISSING) {
				SubLObject pk = sym.getLispPackage();
				if (pk == Lisp.NIL)
					return false;
				if (!((SubLPackage) pk).getJavaName().equals(this.pkg))
					return false;
			}
			return true;
		}

		public boolean matches(SubLSymbol name2, int arity) {
			if (!this.matches(name2))
				return false;

			int overflow = arity - this.requiredArgs;
			// underflow
			if (overflow < 0)
				return false;
			// good enough
			if (overflow == 0)
				return true;
			// consider optional on an overflow
			overflow = overflow - this.optionsArgs;
			if (overflow <= 0)
				return true;
			// overflow ok?
			return this.allowsRest;
		}

		public String toString() {
			return this.symbol.writeToString() + "/" + this.requiredArgs + " "
					+ ((this.allowsRest ? "&rest" : "") + " " + this.method)
							.replace("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.", "")
					+ " (" + this.uses + ")";
		}
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
	public @interface NoInline {
	}

	public @interface WrongNumberOfArguments {
	}

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

	private static Primitive INLINED_PRIMITIVE_METHOD = new JavaPrimitive("INLINED-PRIMITIVE-METHOD",
			Lisp.PACKAGE_SYS) {
		public SubLObject execute(SubLObject primitive, SubLObject nargs) {
			final int i = nargs.intValue();
			final SubLSymbol sym = InlinedPrimitiveRegistry.extractSymbol(primitive);
			// if (!sym.getName().equals("COPY-TREE")) {
			// return NIL;
			// }
			final MethodDescr m = InlinedPrimitiveRegistry.getMethodForSymbol(sym, i);
			if (m == null)
				return Lisp.NIL;
			if (m.getParameterTypes().length != i) {
				Lisp.error(new WrongNumberOfArgumentsException((Operator) primitive));
				return Lisp.NIL;
			}
			((LispSymbolImpl) sym).hasInlined = true;
			m.uses++;
			InlinedPrimitiveRegistry.inlinedCount++;
			return new ABCLJavaObject(m.method);

		}
	};

	//
	// private static Primitive INLINED_PRIMITIVE_METHOD =
	// InlinedPrimitive.get(InlinedPrimitive.class, "inlinedPrimitiveMethod",
	// "INLINED-PRIMITIVE-METHOD", PACKAGE_SYS);
	// public static LispObject inlinedPrimitiveP(LispObject obj) {
	// return (obj instanceof InlinedPrimitive) ? T : NIL;
	// }

	// (sys::INLINE-PRIMITIVE-REPORT)
	private static Primitive INLINED_PRIMITIVE_REPORT = new JavaPrimitive("INLINE-PRIMITIVE-REPORT", Lisp.PACKAGE_SYS) {
		public SubLObject execute() {
			InlinedPrimitiveRegistry.inlineReport();
			for (Iterator iterator = InlinedPrimitiveRegistry.inlineDecls.iterator(); iterator.hasNext();) {
				MethodDescr type = (MethodDescr) iterator.next();
				Debug.trace("" + type);
			}
			return Lisp.NIL;
		}
	};

	private static Primitive INLINED_PRIMITIVE_P = new JavaPrimitive("INLINED-PRIMITIVE-P", Lisp.PACKAGE_SYS) {

		public SubLObject execute(SubLObject primitive, SubLObject nargs) {
			if (InlinedPrimitiveRegistry.disableInlining)
				return Lisp.NIL;
			final int i = nargs.intValue();
			final SubLSymbol sym = InlinedPrimitiveRegistry.extractSymbol(primitive);
			if (InlinedPrimitiveRegistry.neverInline(sym))
				return Lisp.NIL;
			final MethodDescr m = InlinedPrimitiveRegistry.getMethodForSymbol(sym, i);
			if (m == null)
				return Lisp.NIL;
			if (m.getParameterTypes().length != i) {
				InlinedPrimitiveRegistry.wishfullCount++;
				InlinedPrimitiveRegistry.debugInline(";; Wishfull " + sym.getName() + "/" + i);
				return Lisp.NIL;
			}
			return Lisp.T;
		}
	};

	final static String MISSING = "#:MISSING";

	// / This is a registry of static methods that may be used by the compiler
	static Set<MethodDescr> inlineDecls = new HashSet<MethodDescr>();

	final static HashMap<String, Object> inlinedMethods = new HashMap<String, Object>();
	final static Object NOSUCHMETHOD = new Object();
	static boolean registryUpToDate = false;

	public static void createRegistry() {
		if (InlinedPrimitiveRegistry.registryUpToDate)
			return;
		InlinedPrimitiveRegistry.registryUpToDate = true;
		for (Class c : InlinedPrimitiveRegistry.staticsToDo
				.toArray(new Class[InlinedPrimitiveRegistry.staticsToDo.size()]))
			InlinedPrimitiveRegistry.inlineStaticsNow(c);
		InlinedPrimitiveRegistry.inlineReport();
	}

	private static void debug(String string) {
		if (InlinedPrimitiveRegistry.showInlineDebug)
			InlinedPrimitiveRegistry.debugInline(";; INLINE DEBUG: " + string);
	}

	public static void debugInline(String string) {
		if (false)
			Debug.trace(string);
	}

	private static SubLSymbol extractSymbol(Method method) {
		String mname = method.getName();
		mname = InlinedPrimitiveRegistry.undressMethodName(mname);
		Class dc = method.getDeclaringClass();
		for (Field f : dc.getDeclaredFields())
			if (Operator.class.isAssignableFrom(f.getType())) {
				String fname = f.getName();
				if (fname.equals(mname))
					try {
						if (!f.isAccessible())
							f.setAccessible(true);
						Operator op = (Operator) f.get(null);
						return (SubLSymbol) op.getLambdaName();
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		return null;
	}

	protected static SubLSymbol extractSymbol(SubLObject primitive) {
		if (primitive instanceof SubLSymbol)
			return (SubLSymbol) primitive;
		else
			return (SubLSymbol) ((Operator) primitive).getLambdaName();
	}

	public static Operator getCurrentOperator() {
		// just a workarr9ound for testing
		return InlinedPrimitiveRegistry.INLINED_PRIMITIVE_P;
	}

	public static MethodDescr getMethodForSymbol(SubLSymbol name, int arity) {
		InlinedPrimitiveRegistry.createRegistry();
		String symname = name.getJavaSymbolName();
		SubLObject pname = name.getLispPackage();
		String key = null;
		if (pname instanceof SubLPackage) {
			String pkname = ((SubLPackage) pname).getJavaName();
			key = symname + ":" + arity + "-" + pkname;
			Object m = InlinedPrimitiveRegistry.inlinedMethods.get(key);
			if (m != null) {
				if (InlinedPrimitiveRegistry.NOSUCHMETHOD == m || m instanceof Integer)
					return null;
				return (MethodDescr) m;
			}
		}
		MethodDescr inexact = null;
		for (MethodDescr desc : InlinedPrimitiveRegistry.inlineDecls)
			if (desc.matches(name, arity)) {
				if (desc.allowsRest || desc.optionsArgs > 0) {
					inexact = desc;
					continue;
				}
				InlinedPrimitiveRegistry.debugInline("Inline: " + desc);
				InlinedPrimitiveRegistry.inlineReport();
				if (key != null)
					InlinedPrimitiveRegistry.inlinedMethods.put(key, desc);
				return desc;
			}
		if (inexact == null) {
			if (key != null) {
				InlinedPrimitiveRegistry.missingCount++;
				// debugInline(";;;;; Cannot inline = " + key);
				InlinedPrimitiveRegistry.inlinedMethods.put(key, InlinedPrimitiveRegistry.NOSUCHMETHOD);
			}
			return null;
		}
		// right now only inline exact matches
		if (key != null)
			InlinedPrimitiveRegistry.inlinedMethods.put(key, InlinedPrimitiveRegistry.NOSUCHMETHOD);
		if (true)
			return null;
		return inexact == null ? null : inexact;
	}

	private static Operator getOperator(Method method) {
		if (InlinedPrimitiveRegistry.memberNoInline(method))
			return null;
		String mname = method.getName();
		if (mname.startsWith("sf_")) {
			mname = mname.substring(3);
			return null;
		}
		if (false && mname.contains("__"))
			return null;
		mname = InlinedPrimitiveRegistry.undressMethodName(mname);
		try {
			Field f = method.getDeclaringClass().getDeclaredField(mname.toUpperCase());
			/// .NET can return null fields
			if (InlinedPrimitiveRegistry.memberNoInline(f))
				return null;
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

	private static String guessName(Method method) {
		String mname = method.getName();
		mname = InlinedPrimitiveRegistry.undressMethodName(mname);
		try {
			Operator op = InlinedPrimitiveRegistry.getOperator(method);
			return op.getLambdaName().STRING().getString();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mname;
	}

	static void inlineReport() {
		InlinedPrimitiveRegistry.debugInline(";; INLINE REPORT total=" + InlinedPrimitiveRegistry.inlineDecls.size()
				+ " cannot=" + InlinedPrimitiveRegistry.missingCount + " soon=" + InlinedPrimitiveRegistry.wishfullCount
				+ " inlined-calls=" + InlinedPrimitiveRegistry.inlinedCount);

	}

	public static void inlineStaticNow(Class<?> class1, SubLSymbol list, String methodName, int req, int opt,
			boolean rest) {
		try {
			MethodDescr md = new MethodDescr();
			md.requiredArgs = req;
			md.optionsArgs = opt;
			md.allowsRest = rest;
			Class[] c = md.getParameterTypes();
			md.method = class1.getMethod(methodName, c);
			if (!md.method.isAccessible())
				md.method.setAccessible(true);
			md.symbol = list;
			md.pkg = ((SubLPackage) md.symbol.getLispPackage()).getJavaName();
			md.name = list.getJavaSymbolName();
			InlinedPrimitiveRegistry.inlineDecls.add(md);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void inlineStatics(Class tramp) {
		if (tramp == null)
			return;
		if (InlinedPrimitiveRegistry.staticsDone.contains(tramp))
			return;
		InlinedPrimitiveRegistry.staticsToDo.add(tramp);
		InlinedPrimitiveRegistry.registryUpToDate = false;
	}

	public synchronized static void inlineStaticsNow(Class tramp) {
		InlinedPrimitiveRegistry.inlineStaticsNow(tramp, true);
	}

	public static void inlineStaticsNow(Class tramp, boolean doStatics) {
		if (tramp == null)
			return;

		InlinedPrimitiveRegistry.staticsToDo.remove(tramp);
		boolean needsDoing = InlinedPrimitiveRegistry.staticsDone.add(tramp);
		// if (!needsDoing) return;

		for (Field f : tramp.getDeclaredFields()) {
			if (!Operator.class.isAssignableFrom(f.getType()))
				continue;
			if (!f.isAccessible())
				f.setAccessible(true);
			try {
				Operator p = (Operator) f.get(null);
				SubLSymbol sym = (SubLSymbol) p.getLambdaName();
				if (InlinedPrimitiveRegistry.memberNoInline(f)) {
					InlinedPrimitiveRegistry.neverInlineSymbol.add(sym);
					InlinedPrimitiveRegistry.debug("Never inlining " + sym.writeToString());
				}
				if (f.getAnnotation(InlineSymbol.class) != null) {
					InlinedPrimitiveRegistry.alwaysInlineSymbol.add(sym);
					InlinedPrimitiveRegistry.debug("Always inlining " + sym.writeToString());
				}
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Class inlineMethodClass = InlinableMethod.class;

		for (Method method : tramp.getDeclaredMethods()) {

			if (InlinedPrimitiveRegistry.memberNoInline(method))
				continue;

			final MethodDescr md;

			InlinableMethod annotation = (InlinableMethod) method.getAnnotation(inlineMethodClass);
			final int mods = method.getModifiers();

			SubLSymbol sym;
			if (annotation != null) {
				md = new MethodDescr();
				md.name = annotation.name();
				if (md.name == InlinedPrimitiveRegistry.MISSING)
					md.name = InlinedPrimitiveRegistry.guessName(method);
				md.pkg = annotation.pkg();
				md.parms = annotation.parms();
				sym = InlinedPrimitiveRegistry.extractSymbol(method);
			} else {
				if (Modifier.isPrivate(mods) || !Modifier.isStatic(mods))
					continue;
				if (method.getReturnType() != SubLObject.class)
					continue;
				Operator op = InlinedPrimitiveRegistry.getOperator(method);
				if (op == null)
					continue;
				sym = (SubLSymbol) op.getLambdaName();
				if (op instanceof SpecialOperator) {
					if (sym != null)
						InlinedPrimitiveRegistry.neverInlineSymbol.add(sym);
					continue;
				}
				boolean mustInline = InlinedPrimitiveRegistry.alwaysInlineSymbol.contains(sym);
				if (!mustInline && !doStatics)
					continue;
				md = new MethodDescr();
				String guessName = InlinedPrimitiveRegistry.guessName(method);
				md.name = guessName;
			}

			md.method = method;
			md.symbol = sym;
			if (md.symbol == null)
				return;
			md.pkg = ((SubLPackage) md.symbol.getLispPackage()).getJavaName();
			boolean skip = false;
			Class[] argTypes = method.getParameterTypes();
			for (Class class1 : argTypes)
				if (class1 == SubLObject.class)
					md.requiredArgs++;
				else if (class1 == SubLObject[].class)
					md.allowsRest = true;
				else {
					skip = true;
					break;
				}
			if (skip)
				continue;
			if (!InlinedPrimitiveRegistry.inlineDecls.contains(md)) {
				if (!method.isAccessible())
					method.setAccessible(true);
				InlinedPrimitiveRegistry.inlineDecls.add(md);
				// debugInline(";; INLINABLE: " + md);
			}
		}
	}

	private static boolean memberNoInline(AccessibleObject f) {
		if (f == null)
			return true;
		if (f.getAnnotation(NoInline.class) != null)
			return true;
		if (f.getAnnotation(InlineSymbol.class) != null)
			return false;
		String mname = f.toString();
		if (false && mname.contains("__"))
			return true;
		return false;
	}

	protected static boolean neverInline(SubLSymbol sym) {
		// just test code right now .. nothing solid
		if (sym == LispSymbols.APPLY)
			return true;
		if (sym == null)
			return true;
		if (InlinedPrimitiveRegistry.definedInLisp.contains(sym))
			return true;
		if (((LispSymbolImpl) sym).neverInline) {
			InlinedPrimitiveRegistry.definedInLisp.add(sym);
			InlinedPrimitiveRegistry.debug(";; defined in lisp " + sym);
			return true;
		}
		return InlinedPrimitiveRegistry.neverInlineSymbol.contains(sym);
	}

	public static void registerSubClass(Operator operator) {
		InlinedPrimitiveRegistry.inlineStatics(operator.getClass());
		InlinedPrimitiveRegistry.inlineStatics(operator.getClass().getDeclaringClass());
	}

	private static String undressMethodName(String mname) {
		if (mname.endsWith("_execute"))
			mname = mname.substring(0, mname.length() - 8);
		if (mname.startsWith("sf_"))
			mname = mname.substring(3).toUpperCase();
		else if (mname.startsWith("pf_"))
			mname = mname.substring(3).toUpperCase();
		return mname;
	}

	public static SubLObject wrongNumberOfArguments() throws InlineThrows {
		return Lisp.error(new WrongNumberOfArgumentsException(InlinedPrimitiveRegistry.getCurrentOperator()));
	}

}
