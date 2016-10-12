package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuataryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuintaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.TernaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.PatchFileLoader;

/**
 *
 * NnaryFunction is helper class
 *
 * @see {@link BinaryFunction, UnaryFunction, ZeroArityFunction or
 *      TernaryFunction}
 *
 */
public abstract class FixedArityFunctor implements CommonSymbols {

	public static interface Arity10Funct {

		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4,
				SubLObject obj5, SubLObject obj6, SubLObject obj7, SubLObject obj8, SubLObject obj9, SubLObject obj10);
	}

	public static interface Arity6Funct {

		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4,
				SubLObject obj5, SubLObject obj6);
	}

	public static interface Arity7Funct {

		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4,
				SubLObject obj5, SubLObject obj6, SubLObject obj7);
	}

	public static interface Arity8Funct {

		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4,
				SubLObject obj5, SubLObject obj6, SubLObject obj7, SubLObject obj8);
	}

	public static interface Arity9Funct {

		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4,
				SubLObject obj5, SubLObject obj6, SubLObject obj7, SubLObject obj8, SubLObject obj9);
	}

	static class SingleMethodClass extends ClassLoader {

		public HashMap<String, Class> classLoaderCache = new HashMap<String, Class>();

		public SingleMethodClass() {
			super(PatchFileLoader.PATCH_FILE_LOADER);
		}

		/**
		 * @param data
		 * @return
		 */
		public Class defClass(byte[] data) {

			try {
				// TODO Auto-generated method stub
				Class c = super.defineClass(null, data, 0, data.length);
				this.resolveClass(c);
				// getParent().resolveClass(c);
				/// Compiler.compileClass(c);
				return c;
			} catch (Error err) {
				throw err;
			} catch (Throwable t) {
				t.printStackTrace();
				Errors.error("defClass " + t);
				return null;
			}
		}

		public synchronized Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
			Class c = this.classLoaderCache.get(name);
			if (c == null) {
				c = this.getParent().loadClass(name);// this.findSystemClass(name);
				this.classLoaderCache.put(name, c);
			}
			if (resolve)
				this.resolveClass(c);
			return c;
		}
	}

	static private String FIX_AIRTY_FUNCTOR_INAME = Type.getInternalName(FixedArityFunctor.class);
	static private String RESOURCER_INAME = Type.getInternalName(Resourcer.class);
	static private String SUBLOBJECT_INAME = Type.getInternalName(SubLObject.class);
	static private String SUBLOBJECT_LNAME = "L" + FixedArityFunctor.SUBLOBJECT_INAME + ";";
	static private String SUBLFUNCTION_LNAME = "L" + Type.getInternalName(SubLFunction.class) + ";"; // maybe
	// for
	// later
	// abstract
	// public
	// int
	// getArity();
	static SingleMethodClass smc = new SingleMethodClass();
	/**
	 * Set USE_FUNCTOR_GENERATOR
	 *
	 * @false to turn this experimental feature off
	 */
	public static boolean USE_FUNCTOR_GENERATOR = true;
	public static HashMap<String, Integer> signaturesUncoded = new HashMap<String, Integer>();

	public static HashMap<String, Integer> signaturesCoded = new HashMap<String, Integer>();

	public static ArrayList<RuntimeException> makeInstanceTraces = new ArrayList<RuntimeException>();

	static boolean lineNumbers = false;

	private static int serial = 0;

	public static int directCallCount = 0;

	public static int funcallCount = 0;

	/**
	 * @param signamtures2
	 * @param signature
	 * @param i
	 */
	private static void addCount(Map<String, Integer> map, String signature, int i) {
		// TODO Auto-generated method stub
		if (map != null) {
			Integer sig = map.get(signature);// .hashCode();
			if (sig == null)
				sig = Integer.valueOf(i);
			else
				sig = Integer.valueOf(i + sig.intValue());
			map.put(signature, sig == 0 ? null : sig);
		}
	}

	static public SubLObject dump_instances() {
		System.out.println("#|*********************************************************************");

		int totalC = 0;
		Iterator<Map.Entry<String, Integer>> inIteratorC = FixedArityFunctor.signaturesCoded.entrySet().iterator();
		while (inIteratorC.hasNext()) {
			Entry<String, Integer> e = inIteratorC.next();
			Integer v = e.getValue();
			if (v == null || v == 0)
				continue;
			totalC += v.intValue();
			System.out.println("Coded " + v + " instance(s) of " + e.getKey());
		}

		int totalU = 0;
		Iterator<Map.Entry<String, Integer>> inIteratorU = FixedArityFunctor.signaturesUncoded.entrySet().iterator();
		while (inIteratorU.hasNext()) {
			Entry<String, Integer> e = inIteratorU.next();
			Integer v = e.getValue();
			if (v == null || v == 0)
				continue;
			totalU += v.intValue();
			System.out.println("skipped " + v + " instance(s) of " + e.getKey());
		}

		System.out.println("makeInstance " + totalC + " bytecoded versions of " + (totalC + totalU));
		System.out.println("" + (FixedArityFunctor.directCallCount - FixedArityFunctor.funcallCount)
				+ " dirrect apply w/o funcall out of " + FixedArityFunctor.funcallCount + " non-bytecoded funcalls");
		/// Functions.funcall_stats(UNPROVIDED);
		System.out.println("*********************************************************************|#");

		return CommonSymbols.NIL;
	}

	/**
	 * @param i
	 * @return
	 */
	public static Class getArityBaseClass(int i) {
		switch (i) {
		case 0:
			return ZeroArityFunction.class;
		case 1:
			return UnaryFunction.class;
		case 2:
			return BinaryFunction.class;
		case 3:
			return TernaryFunction.class;
		case 4:
			return QuataryFunction.class;
		case 5:
			return QuintaryFunction.class;
		case 6:
			return Arity6Funct.class;
		case 7:
			return Arity7Funct.class;
		case 8:
			return Arity8Funct.class;
		case 9:
			return Arity9Funct.class;
		case 10:
			return Arity10Funct.class;
		}
		Errors.warn("no base class for compiling arity " + i);
		return null;
	}

	/**
	 * @param arity
	 *            of the processItems
	 * @param superClazz
	 *            (usually the type to return)
	 * @param function
	 * @return a {@link BinaryFunction, UnaryFunction, ZeroArityFunction or
	 *         TernaryFunction} or just @null if we cannot reliably make one
	 */
	public static <F extends FixedArityFunctor> F makeInstanceDirect(int arity, Class<F> superClazz,
			SubLFunction targetFunction) {
		if (!FixedArityFunctor.USE_FUNCTOR_GENERATOR)
			return null;
		if (targetFunction.isMacroOperator()) {
			Errors.error("makeInstanceDirect on MACRO " + targetFunction);
			targetFunction = targetFunction.toMacro().getMacroExpander();
			return null;
		}

		// if (targetFunction.isSpecialOperator()) {
		// Errors.error("makeInstanceDirect on SPECIAL-OPERATOR " +
		// targetFunction);
		// targetFunction =
		// targetFunction.toSpecialOperator().getEvaluationFunction();
		// return null;
		// }
		// Check if a java trampoline should exist
		if (targetFunction.isInterpreted())
			// this might happen but not to worry about this today
			// Errors.warn("makeInstanceDirect not supported for Interpreted
			// functions yet " + targetFunction);
			return null;
		int required = targetFunction.getRequiredArgCount();
		if (required > arity) {
			// this underflow should never happen?
			Errors.error("Cannot make an arity " + arity + " function from " + targetFunction + " {req=" + required
					+ " ...} ");
			return null;
		}
		int optional = targetFunction.getOptionalArgCount();
		boolean allowsRest = targetFunction.allowsRest();

		int restLength = arity - required - optional;
		if (restLength > 0 && !allowsRest) {
			// this overflow should never happen?
			Errors.error("Cannot make an arity " + arity + " function from " + targetFunction + " {req=" + required
					+ " opt=" + optional + " allowsrest=" + allowsRest + "} ");
			return null;
		}
		if (!(targetFunction instanceof SubLCompiledFunction))
			// SubLCompledFunction is the only SubLFunction subclass maintaining
			// trampoline data
			return null;
		SubLCompiledFunction subLFunctionTyped = (SubLCompiledFunction) targetFunction;

		int unprovidedPadding = -restLength;
		F result = null;

		Method method = subLFunctionTyped.getMethod();

		String signature = "arity=" + arity + " req=" + required + " opt=" + optional + " &rest=" + allowsRest;

		String info = "makeInstance " + signature + " " + method + " for " + targetFunction;
		// if (!info.contains("com.cyc.cycjava")) {
		RuntimeException st = new RuntimeException(info);
		FixedArityFunctor.showShortStackTrace(st, 5);
		FixedArityFunctor.makeInstanceTraces.add(st);
		/// }

		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);

		String cname = method.getName() + FixedArityFunctor.nextSerial();
		if (superClazz.isInterface())
			FixedArityFunctor.visitIFacConstructor(cw, superClazz, cname);
		else
			FixedArityFunctor.visitClassConstructor(cw, superClazz, cname);
		// if ((required + optional) == arity && !allowsRest) {
		// visitSimple(cw, method, arity);
		// addCount(signaturesCoded, signature, 1);
		// } else
		if (unprovidedPadding >= 0) {
			FixedArityFunctor.addCount(FixedArityFunctor.signaturesCoded, signature, 1);
			FixedArityFunctor.visitArityWithOptional(cw, method, arity, unprovidedPadding, allowsRest);
		} else if (allowsRest) {
			FixedArityFunctor.addCount(FixedArityFunctor.signaturesCoded, signature, 1);
			FixedArityFunctor.visitRest(cw, method, arity, required + optional);
		} else {
			FixedArityFunctor.addCount(FixedArityFunctor.signaturesUncoded, signature, 1);
			Errors.unimplementedMethod(info);
			if (true)
				return null;
		}
		cw.visitEnd();
		byte[] data = cw.toByteArray();
		Class<F> mgenClass = FixedArityFunctor.smc.defClass(data);

		try {
			Constructor cons = mgenClass.getConstructors()[0];
			cons.setAccessible(true);
			result = (F) cons.newInstance(targetFunction);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}

	public static synchronized int nextSerial() {
		return FixedArityFunctor.serial++;
	}

	/**
	 * 0-5 have a shorten alias others bave to be pushed nomrally
	 *
	 * @param mv
	 *            Method Visitor for Const ints
	 * @param i
	 */
	private static void pushIntConst(MethodVisitor mv, int i) {
		switch (i) {
		case -1:
			mv.visitInsn(Opcodes.ICONST_M1);
			break;
		case 0:
			mv.visitInsn(Opcodes.ICONST_0);
			break;
		case 1:
			mv.visitInsn(Opcodes.ICONST_1);
			break;
		case 2:
			mv.visitInsn(Opcodes.ICONST_2);
			break;
		case 3:
			mv.visitInsn(Opcodes.ICONST_3);
			break;
		case 4:
			mv.visitInsn(Opcodes.ICONST_4);
			break;
		case 5:
			mv.visitInsn(Opcodes.ICONST_5);
			break;
		default:
			if (i < Byte.MAX_VALUE && i > Byte.MIN_VALUE)
				mv.visitIntInsn(Opcodes.BIPUSH, i);
			else if (i < Short.MAX_VALUE && i > Short.MIN_VALUE)
				mv.visitIntInsn(Opcodes.SIPUSH, i);
			else if (i < Integer.MAX_VALUE && i > Integer.MIN_VALUE)
				mv.visitIntInsn(Opcodes.LDC, i);
			else
				Errors.unimplementedMethod("pushIntConst " + i);
		}
	}

	/**
	 * @param st
	 * @param i
	 */
	public static void showShortStackTrace(RuntimeException st, int isd) {
		if (true)
			return;
		String info = st.getMessage();
		info = info.replace("com.cyc.tool.subl.jrtl.nativeCode.type.core.", "");
		info = info.replace("public static final", "");
		System.out.println(info);
		isd += 2;
		// TODO Auto-generated method stub
		StackTraceElement[] eles = st.getStackTrace();
		for (int i = 2; i < isd; i++)
			System.out.println(";; " + eles[i]);
	}

	/**
	 *
	 * <pre>
	 * public SubLObject processItem(SubLObject arg1) {
	 * 	return Class.Method(arg1, UNPROVIDED);
	 * }
	 *
	 * </pre>
	 */
	static void visitArityWithOptional(ClassWriter cw, Method method, int arity, int unprovideds, boolean needsRest) {
		String args = "";
		for (int i = 0; i < arity; i++)
			args += FixedArityFunctor.SUBLOBJECT_LNAME;
		MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL, "processItem",
				"(" + args + ")" + FixedArityFunctor.SUBLOBJECT_LNAME, null, null);
		mv.visitCode();
		// Label l0 = new Label();
		// mv.visitLabel(l0);
		// mv.visitLineNumber(168, l0);
		for (int i = 1; i <= arity; i++)
			mv.visitVarInsn(Opcodes.ALOAD, i);
		while (unprovideds-- > 0)
			mv.visitFieldInsn(Opcodes.GETSTATIC, "com/cyc/tool/subl/jrtl/nativeCode/subLisp/CommonSymbols",
					"UNPROVIDED", "Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;");
		if (needsRest)
			mv.visitFieldInsn(Opcodes.GETSTATIC, FixedArityFunctor.RESOURCER_INAME, "EMPTY_SUBL_OBJECT_ARRAY",
					"[" + FixedArityFunctor.SUBLOBJECT_LNAME);
		mv.visitMethodInsn(Opcodes.INVOKESTATIC, Type.getInternalName(method.getDeclaringClass()), method.getName(),
				Type.getMethodDescriptor(method));
		mv.visitInsn(Opcodes.ARETURN);
		// Label l1 = new Label();
		// mv.visitLabel(l1);
		// mv.visitLocalVariable("this",
		// "Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/FixedArityFunctor;",
		// null, l0, l1, 0);
		// mv.visitLocalVariable("arg1", SUBLOBJECT_LNAME, null, l0, l1, 1);
		mv.visitMaxs(2, 2);
		mv.visitEnd();

	}

	// Classfile header plus default constructor
	static void visitClassConstructor(ClassWriter cw, Class fixedType, String methodNameSerial) {
		String fixedTypename = Type.getInternalName(fixedType);
		String myName = fixedTypename + "_" + methodNameSerial;

		cw.visit(Opcodes.V1_5, Opcodes.ACC_FINAL + Opcodes.ACC_SUPER, myName, null, Type.getInternalName(fixedType),
				null);
		// cw.visitInnerClass(methodNameSerial, fixedTypename, myName,
		// directCallCount)
		// would be wrong sourcefile anyways: cw.visitSource("" + suffiz +
		// ".java", null);
		MethodVisitor mv;
		mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "(" + FixedArityFunctor.SUBLFUNCTION_LNAME + ")V", null,
				null);
		mv.visitCode();
		Label l0 = new Label();
		mv.visitLabel(l0);
		// would be wrong: mv.visitLineNumber(176, l0);
		mv.visitVarInsn(Opcodes.ALOAD, 0);
		mv.visitVarInsn(Opcodes.ALOAD, 1);
		mv.visitMethodInsn(Opcodes.INVOKESPECIAL, fixedTypename, "<init>",
				"(" + FixedArityFunctor.SUBLFUNCTION_LNAME + ")V");
		Label l1 = new Label();
		mv.visitLabel(l1);
		// would be wrong: mv.visitLineNumber(177, l1);
		mv.visitInsn(Opcodes.RETURN);
		Label l2 = new Label();
		mv.visitLabel(l2);
		mv.visitLocalVariable("this", "L" + myName + ";", null, l0, l2, 0);
		mv.visitLocalVariable("func", FixedArityFunctor.SUBLFUNCTION_LNAME, null, l0, l2, 1);
		mv.visitMaxs(2, 2);
		mv.visitEnd();

	}

	static void visitIFacConstructor(ClassWriter cw, Class fixedTypeInterface, String methodNameSerial) {
		Class fixedType = FixedArityFunctor.class;

		String fixedTypename = Type.getInternalName(fixedType);
		String myName = fixedTypename + "_" + methodNameSerial;

		FieldVisitor fv;
		MethodVisitor mv;

		cw.visit(Opcodes.V1_5, Opcodes.ACC_FINAL + Opcodes.ACC_SUPER, myName, null, Type.getInternalName(fixedType),
				fixedTypeInterface == null ? null : new String[] { Type.getInternalName(fixedTypeInterface) });

		cw.visitSource("java", null);

		cw.visitInnerClass(myName, FixedArityFunctor.FIX_AIRTY_FUNCTOR_INAME, methodNameSerial, Opcodes.ACC_STATIC);

		cw.visitInnerClass(Type.getInternalName(fixedTypeInterface), FixedArityFunctor.FIX_AIRTY_FUNCTOR_INAME,
				fixedTypeInterface.getName(),
				Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE);

		{
			fv = cw.visitField(0, "func", FixedArityFunctor.SUBLFUNCTION_LNAME, null, null);
			fv.visitEnd();
		}
		{
			mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "(" + FixedArityFunctor.SUBLFUNCTION_LNAME + ")V", null,
					null);
			mv.visitCode();
			Label l0 = new Label();
			mv.visitLabel(l0);
			mv.visitLineNumber(131, l0);
			mv.visitVarInsn(Opcodes.ALOAD, 0);
			mv.visitMethodInsn(Opcodes.INVOKESPECIAL, FixedArityFunctor.FIX_AIRTY_FUNCTOR_INAME, "<init>", "()V");
			Label l1 = new Label();
			mv.visitLabel(l1);
			mv.visitLineNumber(132, l1);
			mv.visitVarInsn(Opcodes.ALOAD, 0);
			mv.visitVarInsn(Opcodes.ALOAD, 1);
			mv.visitFieldInsn(Opcodes.PUTFIELD, myName, "func", FixedArityFunctor.SUBLFUNCTION_LNAME);
			Label l2 = new Label();
			mv.visitLabel(l2);
			mv.visitLineNumber(133, l2);
			mv.visitInsn(Opcodes.RETURN);
			Label l3 = new Label();
			mv.visitLabel(l3);
			mv.visitLocalVariable("this", "L" + myName + ";", null, l0, l3, 0);
			mv.visitLocalVariable("f", FixedArityFunctor.SUBLFUNCTION_LNAME, null, l0, l3, 1);
			mv.visitMaxs(2, 2);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "getFunction", "()" + FixedArityFunctor.SUBLFUNCTION_LNAME + "",
					null, null);
			mv.visitCode();
			Label l0 = new Label();
			mv.visitLabel(l0);
			mv.visitLineNumber(150, l0);
			mv.visitVarInsn(Opcodes.ALOAD, 0);
			mv.visitFieldInsn(Opcodes.GETFIELD, myName, "func", FixedArityFunctor.SUBLFUNCTION_LNAME);
			mv.visitInsn(Opcodes.ARETURN);
			Label l1 = new Label();
			mv.visitLabel(l1);
			mv.visitLocalVariable("this", "L" + myName + ";", null, l0, l1, 0);
			mv.visitMaxs(1, 1);
			mv.visitEnd();
		}

	}

	/**
	 * Bytecode template for functions arity > required+optional
	 *
	 * allowsRest = true;
	 *
	 * <pre>
	 *
	 public   SubLObject procesItem(SubLObject a1, SubLObject a2, SubLObject a3) {
	 Resourcer resourcer = Resourcer.getInstance();
	 SubLObject[] rest = resourcer.acquireSubLObjectArray(2);
	 rest[0]=a2;
	 rest[1]=a3;
	 try {
	 return SubLObjectFactory.makeListS(a1,rest);
	 }  ly {
	 resourcer.releaseSubLObjectArray(rest);
	 }
	
	 }
	 * </pre>
	 */
	public static void visitRest(ClassWriter cw, Method method, int arity, int left) {
		{
			ArrayList<Object> frameArray = new ArrayList<Object>();
			frameArray.add(FixedArityFunctor.FIX_AIRTY_FUNCTOR_INAME);
			int rest = arity - left;
			String args = "";
			for (int i = 0; i < arity; i++) {
				args += FixedArityFunctor.SUBLOBJECT_LNAME;
				frameArray.add(FixedArityFunctor.SUBLOBJECT_INAME);
			}
			MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL, "processItem",
					"(" + args + ")" + FixedArityFunctor.SUBLOBJECT_LNAME, null, null);

			mv.visitCode();
			Label l0 = new Label();
			Label l1 = new Label();
			Label l2 = new Label();
			mv.visitTryCatchBlock(l0, l1, l2, null);
			Label l3 = new Label();
			mv.visitLabel(l3);
			mv.visitLineNumber(512, l3);
			mv.visitMethodInsn(Opcodes.INVOKESTATIC, FixedArityFunctor.RESOURCER_INAME, "getInstance",
					"()L" + FixedArityFunctor.RESOURCER_INAME + ";");
			mv.visitVarInsn(Opcodes.ASTORE, arity + 1);
			Label l4 = new Label();
			mv.visitLabel(l4);
			mv.visitLineNumber(513, l4);

			mv.visitVarInsn(Opcodes.ALOAD, arity + 1);
			FixedArityFunctor.pushIntConst(mv, rest);
			mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, FixedArityFunctor.RESOURCER_INAME, "acquireSubLObjectArray",
					"(I)[" + FixedArityFunctor.SUBLOBJECT_LNAME);
			mv.visitVarInsn(Opcodes.ASTORE, arity + 2);
			Label l5 = new Label();
			mv.visitLabel(l5);
			mv.visitLineNumber(514, l5);

			for (int i = 0; i < rest; i++) {
				mv.visitVarInsn(Opcodes.ALOAD, arity + 2);
				FixedArityFunctor.pushIntConst(mv, i);
				mv.visitVarInsn(Opcodes.ALOAD, i + left + 1);
				mv.visitInsn(Opcodes.AASTORE);
				mv.visitLabel(l0);
				mv.visitLineNumber(519, l0);
			}

			for (int i = 0; i < left; i++)
				mv.visitVarInsn(Opcodes.ALOAD, i + 1);

			mv.visitVarInsn(Opcodes.ALOAD, arity + 2);
			mv.visitMethodInsn(Opcodes.INVOKESTATIC, Type.getInternalName(method.getDeclaringClass()), method.getName(),
					org.objectweb.asm.Type.getMethodDescriptor(method));
			mv.visitVarInsn(Opcodes.ASTORE, arity + 4);
			mv.visitLabel(l1);
			mv.visitLineNumber(521, l1);
			mv.visitVarInsn(Opcodes.ALOAD, arity + 1);
			mv.visitVarInsn(Opcodes.ALOAD, arity + 2);
			mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, FixedArityFunctor.RESOURCER_INAME, "releaseSubLObjectArray",
					"([" + FixedArityFunctor.SUBLOBJECT_LNAME + ")V");
			Label l9 = new Label();
			mv.visitLabel(l9);
			mv.visitLineNumber(519, l9);
			mv.visitVarInsn(Opcodes.ALOAD, arity + 4);
			mv.visitInsn(Opcodes.ARETURN);
			mv.visitLabel(l2);
			mv.visitLineNumber(520, l2);

			frameArray.add(FixedArityFunctor.RESOURCER_INAME);
			frameArray.add("[" + FixedArityFunctor.SUBLOBJECT_LNAME);
			mv.visitFrame(Opcodes.F_FULL, arity + 3, frameArray.toArray(), 1, new Object[] { "java/lang/Throwable" });
			mv.visitVarInsn(Opcodes.ASTORE, arity + 3);
			Label l10 = new Label();
			mv.visitLabel(l10);
			mv.visitLineNumber(521, l10);
			mv.visitVarInsn(Opcodes.ALOAD, arity + 1);
			mv.visitVarInsn(Opcodes.ALOAD, arity + 2);
			mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, FixedArityFunctor.RESOURCER_INAME, "releaseSubLObjectArray",
					"([" + FixedArityFunctor.SUBLOBJECT_LNAME + ")V");
			Label l11 = new Label();
			mv.visitLabel(l11);
			mv.visitLineNumber(522, l11);
			mv.visitVarInsn(Opcodes.ALOAD, arity + 3);
			mv.visitInsn(Opcodes.ATHROW);
			Label l12 = new Label();
			mv.visitLabel(l12);
			mv.visitLocalVariable("this", "L" + FixedArityFunctor.FIX_AIRTY_FUNCTOR_INAME + ";", null, l3, l12, 0);
			// mv.visitLocalVariable("a1", SUBLOBJECT_LNAME, null, l3, l12, 1);
			// mv.visitLocalVariable("a2", SUBLOBJECT_LNAME, null, l3, l12, 2);
			// mv.visitLocalVariable("a3", SUBLOBJECT_LNAME, null, l3, l12, 3);
			// mv.visitLocalVariable("a4", SUBLOBJECT_LNAME, null, l3, l12, 4);
			// mv.visitLocalVariable("a5", SUBLOBJECT_LNAME, null, l3, l12, 5);
			mv.visitLocalVariable("resourcer", "L" + FixedArityFunctor.RESOURCER_INAME + ";", null, l4, l12, 6);
			mv.visitLocalVariable("rest", "[" + FixedArityFunctor.SUBLOBJECT_LNAME, null, l5, l12, 7);
			mv.visitMaxs(3, arity + 5);
			mv.visitEnd();
		}
	}

	//
	abstract public SubLFunction getFunction();
	//
	// public SubLObject processItem(SubLObject... args) {
	// Resourcer resourcer = Resourcer.getInstance();
	// SubLObject[] rest = resourcer.acquireSubLObjectArray(args.length);
	// rest[0] = args[1];
	// try {
	// return SubLObjectFactory.makeListS(args[0], rest);
	// } finally {
	// resourcer.releaseSubLObjectArray(rest);
	// }
	// }
}
