//
////
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import bsh.org.objectweb.asm.ClassWriter;
import bsh.org.objectweb.asm.FieldVisitor;
import bsh.org.objectweb.asm.MethodVisitor;
import bsh.org.objectweb.asm.Label;
import bsh.org.objectweb.asm.Type;

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

public abstract class FixedArityFunctor implements CommonSymbols {
	public interface Arity10Funct {
		SubLObject processItem(SubLObject p0, SubLObject p1, SubLObject p2, SubLObject p3, SubLObject p4, SubLObject p5, SubLObject p6, SubLObject p7, SubLObject p8, SubLObject p9);
	}

	public interface Arity6Funct {
		SubLObject processItem(SubLObject p0, SubLObject p1, SubLObject p2, SubLObject p3, SubLObject p4, SubLObject p5);
	}

	public interface Arity7Funct {
		SubLObject processItem(SubLObject p0, SubLObject p1, SubLObject p2, SubLObject p3, SubLObject p4, SubLObject p5, SubLObject p6);
	}

	public interface Arity8Funct {
		SubLObject processItem(SubLObject p0, SubLObject p1, SubLObject p2, SubLObject p3, SubLObject p4, SubLObject p5, SubLObject p6, SubLObject p7);
	}

	public interface Arity9Funct {
		SubLObject processItem(SubLObject p0, SubLObject p1, SubLObject p2, SubLObject p3, SubLObject p4, SubLObject p5, SubLObject p6, SubLObject p7, SubLObject p8);
	}

	static class SingleMethodClass extends ClassLoader {
		public SingleMethodClass() {
			super(PatchFileLoader.PATCH_FILE_LOADER);
			classLoaderCache = new HashMap<String, Class>();
		}

		public HashMap<String, Class> classLoaderCache;

		public Class defClass(byte[] data) {
			try {
				final Class c = super.defineClass(null, data, 0, data.length);
				resolveClass(c);
				return c;
			} catch (final Error err) {
				throw err;
			} catch (final Throwable t) {
				Errors.error("defClass " + t, t);
				return null;
			}
		}

		@Override
		public synchronized Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
			Class c = classLoaderCache.get(name);
			if (c == null) {
				c = getParent().loadClass(name);
				classLoaderCache.put(name, c);
			}
			if (resolve) {
				resolveClass(c);
			}
			return c;
		}
	}

	private static void addCount(Map<String, Integer> map, String signature, int i) {
		if (map != null) {
			Integer sig = map.get(signature);
			if (sig == null) {
				sig = i;
			} else {
				sig += i;
			}
			map.put(signature, sig == 0 ? null : sig);
		}
	}

	private static void pushIntConst(MethodVisitor mv, int i) {
		switch (i) {
		case -1:
			mv.visitInsn(2);
			break;
		case 0:
			mv.visitInsn(3);
			break;
		case 1:
			mv.visitInsn(4);
			break;
		case 2:
			mv.visitInsn(5);
			break;
		case 3:
			mv.visitInsn(6);
			break;
		case 4:
			mv.visitInsn(7);
			break;
		case 5:
			mv.visitInsn(8);
			break;
		default:
			if ((i < 127) && (i > -128)) {
				mv.visitIntInsn(16, i);
				break;
			}
			if ((i < 32767) && (i > -32768)) {
				mv.visitIntInsn(17, i);
				break;
			}
			if ((i < Integer.MAX_VALUE) && (i > Integer.MIN_VALUE)) {
				mv.visitIntInsn(18, i);
				break;
			}
			Errors.unimplementedMethod("pushIntConst " + i);
			break;
		}
	}

	public static SubLObject dump_instances() {
		System.out.println("#|*********************************************************************");
		int totalC = 0;
		for (final Map.Entry<String, Integer> e : FixedArityFunctor.signaturesCoded.entrySet()) {
			final Integer v = e.getValue();
			if (v != null) {
				if (v == 0) {
					continue;
				}
				totalC += v;
				System.out.println("Coded " + v + " instance(s) of " + e.getKey());
			}
		}
		int totalU = 0;
		for (final Map.Entry<String, Integer> e2 : FixedArityFunctor.signaturesUncoded.entrySet()) {
			final Integer v2 = e2.getValue();
			if (v2 != null) {
				if (v2 == 0) {
					continue;
				}
				totalU += v2;
				System.out.println("skipped " + v2 + " instance(s) of " + e2.getKey());
			}
		}
		System.out.println("makeInstance " + totalC + " bytecoded versions of " + (totalC + totalU));
		System.out.println("" + (FixedArityFunctor.directCallCount - FixedArityFunctor.funcallCount) + " dirrect apply w/o funcall out of " + FixedArityFunctor.funcallCount + " non-bytecoded funcalls");
		System.out.println("*********************************************************************|#");
		return NIL;
	}

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
		default:
			Errors.warn("no base class for compiling arity " + i);
			return null;
		}
	}

	public static <F extends FixedArityFunctor> F makeInstanceDirect(int arity, Class<F> superClazz, SubLFunction targetFunction) {
		if (targetFunction.isInterpreted()) {
			return null;
		}
		if (!(targetFunction instanceof SubLCompiledFunction)) {
			return null;
		}
		if (targetFunction.isMacroOperator()) {
			Errors.error("makeInstanceDirect on MACRO " + targetFunction);
			targetFunction = targetFunction.toMacro().getMacroExpander();
			return null;
		}
		final int required = targetFunction.getRequiredArgCount();
		if (required > arity) {
			Errors.error("Cannot make an arity " + arity + " function from " + targetFunction + " {req=" + required + " ...} ");
			return null;
		}
		final int optional = targetFunction.getOptionalArgCount();
		final boolean allowsRest = targetFunction.allowsRest();
		final int restLength = arity - required - optional;
		if ((restLength > 0) && !allowsRest) {
			Errors.error("Cannot make an arity " + arity + " function from " + targetFunction + " {req=" + required + " opt=" + optional + " allowsrest=" + allowsRest + "} ");
			return null;
		}
		final SubLCompiledFunction subLFunctionTyped = (SubLCompiledFunction) targetFunction;
		final int unprovidedPadding = -restLength;
		F result = null;
		final Method method = subLFunctionTyped.getMethod();

		final String signature = "arity=" + arity + " req=" + required + " opt=" + optional + " &rest=" + allowsRest;
		if (method == null) {
			return null;
		}
		final ClassWriter cw = new ClassWriter(3);
		final String cname = method.getName() + nextSerial();
		if (superClazz.isInterface()) {
			visitIFacConstructor(cw, superClazz, cname);
		} else {
			visitClassConstructor(cw, superClazz, cname);
		}
		if (unprovidedPadding >= 0) {
			addCount(FixedArityFunctor.signaturesCoded, signature, 1);
			visitArityWithOptional(cw, method, arity, unprovidedPadding, allowsRest);
		} else {
			if (!allowsRest) {
				addCount(FixedArityFunctor.signaturesUncoded, signature, 1);
				final String info = "makeInstance " + signature + " " + method + " for " + targetFunction;
				final RuntimeException st = new RuntimeException(info);
				showShortStackTrace(st, 5);
				FixedArityFunctor.makeInstanceTraces.add(st);
				Errors.unimplementedMethod(info);
				return null;
			}
			addCount(FixedArityFunctor.signaturesCoded, signature, 1);
			visitRest(cw, method, arity, required + optional);
		}
		cw.visitEnd();
		final byte[] data = cw.toByteArray();
		final Class<F> mgenClass = FixedArityFunctor.smc.defClass(data);
		try {
			final Constructor cons = mgenClass.getConstructors()[0];
			cons.setAccessible(true);
			result = (F) cons.newInstance(targetFunction);
		} catch (final Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}

	public static synchronized int nextSerial() {
		return FixedArityFunctor.serial++;
	}

	public static void showShortStackTrace(RuntimeException st, int isd) {
	}

	public static void visitRest(ClassWriter cw, Method method, int arity, int left) {
		final ArrayList<Object> frameArray = new ArrayList<Object>();
		frameArray.add(FixedArityFunctor.FIX_ARITY_FUNCTOR_INAME);
		final int rest = arity - left;
		String args = "";
		for (int i = 0; i < arity; ++i) {
			args += FixedArityFunctor.SUBLOBJECT_LNAME;
			frameArray.add(FixedArityFunctor.SUBLOBJECT_INAME);
		}
		final MethodVisitor mv = cw.visitMethod(17, "processItem", "(" + args + ")" + FixedArityFunctor.SUBLOBJECT_LNAME, null, null);
		mv.visitCode();
		final Label l0 = new Label();
		final Label l2 = new Label();
		final Label l3 = new Label();
		mv.visitTryCatchBlock(l0, l2, l3, null);
		final Label l4 = new Label();
		mv.visitLabel(l4);
		mv.visitLineNumber(512, l4);
		mv.visitMethodInsn(184, FixedArityFunctor.RESOURCER_INAME, "getInstance", "()L" + FixedArityFunctor.RESOURCER_INAME + ";");
		mv.visitVarInsn(58, arity + 1);
		final Label l5 = new Label();
		mv.visitLabel(l5);
		mv.visitLineNumber(513, l5);
		mv.visitVarInsn(25, arity + 1);
		pushIntConst(mv, rest);
		mv.visitMethodInsn(182, FixedArityFunctor.RESOURCER_INAME, "acquireSubLObjectArray", "(I)[" + FixedArityFunctor.SUBLOBJECT_LNAME);
		mv.visitVarInsn(58, arity + 2);
		final Label l6 = new Label();
		mv.visitLabel(l6);
		mv.visitLineNumber(514, l6);
		for (int j = 0; j < rest; ++j) {
			mv.visitVarInsn(25, arity + 2);
			pushIntConst(mv, j);
			mv.visitVarInsn(25, j + left + 1);
			mv.visitInsn(83);
			mv.visitLabel(l0);
			mv.visitLineNumber(519, l0);
		}
		for (int j = 0; j < left; ++j) {
			mv.visitVarInsn(25, j + 1);
		}
		mv.visitVarInsn(25, arity + 2);
		mv.visitMethodInsn(184, Type.getInternalName(method.getDeclaringClass()), method.getName(), Type.getMethodDescriptor(method));
		mv.visitVarInsn(58, arity + 4);
		mv.visitLabel(l2);
		mv.visitLineNumber(521, l2);
		mv.visitVarInsn(25, arity + 1);
		mv.visitVarInsn(25, arity + 2);
		mv.visitMethodInsn(182, FixedArityFunctor.RESOURCER_INAME, "releaseSubLObjectArray", "([" + FixedArityFunctor.SUBLOBJECT_LNAME + ")V");
		final Label l7 = new Label();
		mv.visitLabel(l7);
		mv.visitLineNumber(519, l7);
		mv.visitVarInsn(25, arity + 4);
		mv.visitInsn(176);
		mv.visitLabel(l3);
		mv.visitLineNumber(520, l3);
		frameArray.add(FixedArityFunctor.RESOURCER_INAME);
		frameArray.add("[" + FixedArityFunctor.SUBLOBJECT_LNAME);
		mv.visitFrame(0, arity + 3, frameArray.toArray(), 1, new Object[] { "java/lang/Throwable" });
		mv.visitVarInsn(58, arity + 3);
		final Label l8 = new Label();
		mv.visitLabel(l8);
		mv.visitLineNumber(521, l8);
		mv.visitVarInsn(25, arity + 1);
		mv.visitVarInsn(25, arity + 2);
		mv.visitMethodInsn(182, FixedArityFunctor.RESOURCER_INAME, "releaseSubLObjectArray", "([" + FixedArityFunctor.SUBLOBJECT_LNAME + ")V");
		final Label l9 = new Label();
		mv.visitLabel(l9);
		mv.visitLineNumber(522, l9);
		mv.visitVarInsn(25, arity + 3);
		mv.visitInsn(191);
		final Label l10 = new Label();
		mv.visitLabel(l10);
		mv.visitLocalVariable("this", "L" + FixedArityFunctor.FIX_ARITY_FUNCTOR_INAME + ";", null, l4, l10, 0);
		mv.visitLocalVariable("resourcer", "L" + FixedArityFunctor.RESOURCER_INAME + ";", null, l5, l10, 6);
		mv.visitLocalVariable("rest", "[" + FixedArityFunctor.SUBLOBJECT_LNAME, null, l6, l10, 7);
		mv.visitMaxs(3, arity + 5);
		mv.visitEnd();
	}

	static void visitArityWithOptional(ClassWriter cw, Method method, int arity, int unprovideds, boolean needsRest) {
		String args = "";
		for (int i = 0; i < arity; ++i) {
			args += FixedArityFunctor.SUBLOBJECT_LNAME;
		}
		final MethodVisitor mv = cw.visitMethod(17, "processItem", "(" + args + ")" + FixedArityFunctor.SUBLOBJECT_LNAME, null, null);
		mv.visitCode();
		for (int j = 1; j <= arity; ++j) {
			mv.visitVarInsn(25, j);
		}
		while (unprovideds-- > 0) {
			mv.visitFieldInsn(178, "com/cyc/tool/subl/jrtl/nativeCode/subLisp/CommonSymbols", "UNPROVIDED_SYM", "Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;");
		}
		if (needsRest) {
			mv.visitFieldInsn(178, FixedArityFunctor.RESOURCER_INAME, "EMPTY_SUBL_OBJECT_ARRAY", "[" + FixedArityFunctor.SUBLOBJECT_LNAME);
		}
		mv.visitMethodInsn(184, Type.getInternalName(method.getDeclaringClass()), method.getName(), Type.getMethodDescriptor(method));
		mv.visitInsn(176);
		mv.visitMaxs(2, 2);
		mv.visitEnd();
	}

	static void visitClassConstructor(ClassWriter cw, Class fixedType, String methodNameSerial) {
		final String fixedTypename = Type.getInternalName(fixedType);
		final String myName = fixedTypename + "_" + methodNameSerial;
		cw.visit(49, 48, myName, null, Type.getInternalName(fixedType), null);
		final MethodVisitor mv = cw.visitMethod(1, "<init>", "(" + FixedArityFunctor.SUBLFUNCTION_LNAME + ")V", null, null);
		mv.visitCode();
		final Label l0 = new Label();
		mv.visitLabel(l0);
		mv.visitVarInsn(25, 0);
		mv.visitVarInsn(25, 1);
		mv.visitMethodInsn(183, fixedTypename, "<init>", "(" + FixedArityFunctor.SUBLFUNCTION_LNAME + ")V");
		final Label l2 = new Label();
		mv.visitLabel(l2);
		mv.visitInsn(177);
		final Label l3 = new Label();
		mv.visitLabel(l3);
		mv.visitLocalVariable("this", "L" + myName + ";", null, l0, l3, 0);
		mv.visitLocalVariable("func", FixedArityFunctor.SUBLFUNCTION_LNAME, null, l0, l3, 1);
		mv.visitMaxs(2, 2);
		mv.visitEnd();
	}

	static void visitIFacConstructor(ClassWriter cw, Class fixedTypeInterface, String methodNameSerial) {
		final Class fixedType = FixedArityFunctor.class;
		final String fixedTypename = Type.getInternalName(fixedType);
		final String myName = fixedTypename + "_" + methodNameSerial;
		final int version = 49;
		final int access = 48;
		final String name = myName;
		final String signature = null;
		final String internalName = Type.getInternalName(fixedType);
		String[] interfaces = null;
		if (fixedTypeInterface != null) {
			interfaces = new String[] { Type.getInternalName(fixedTypeInterface) };
		}
		cw.visit(version, access, name, signature, internalName, interfaces);
		cw.visitSource("java", null);
		cw.visitInnerClass(myName, FixedArityFunctor.FIX_ARITY_FUNCTOR_INAME, methodNameSerial, 8);
		cw.visitInnerClass(Type.getInternalName(fixedTypeInterface), FixedArityFunctor.FIX_ARITY_FUNCTOR_INAME, fixedTypeInterface.getName(), 1545);
		final FieldVisitor fv = cw.visitField(0, "func", FixedArityFunctor.SUBLFUNCTION_LNAME, null, null);
		fv.visitEnd();
		MethodVisitor mv = cw.visitMethod(1, "<init>", "(" + FixedArityFunctor.SUBLFUNCTION_LNAME + ")V", null, null);
		mv.visitCode();
		Label l0 = new Label();
		mv.visitLabel(l0);
		mv.visitLineNumber(131, l0);
		mv.visitVarInsn(25, 0);
		mv.visitMethodInsn(183, FixedArityFunctor.FIX_ARITY_FUNCTOR_INAME, "<init>", "()V");
		Label l2 = new Label();
		mv.visitLabel(l2);
		mv.visitLineNumber(132, l2);
		mv.visitVarInsn(25, 0);
		mv.visitVarInsn(25, 1);
		mv.visitFieldInsn(181, myName, "func", FixedArityFunctor.SUBLFUNCTION_LNAME);
		final Label l3 = new Label();
		mv.visitLabel(l3);
		mv.visitLineNumber(133, l3);
		mv.visitInsn(177);
		final Label l4 = new Label();
		mv.visitLabel(l4);
		mv.visitLocalVariable("this", "L" + myName + ";", null, l0, l4, 0);
		mv.visitLocalVariable("f", FixedArityFunctor.SUBLFUNCTION_LNAME, null, l0, l4, 1);
		mv.visitMaxs(2, 2);
		mv.visitEnd();
		mv = cw.visitMethod(1, "getFunction", "()" + FixedArityFunctor.SUBLFUNCTION_LNAME + "", null, null);
		mv.visitCode();
		l0 = new Label();
		mv.visitLabel(l0);
		mv.visitLineNumber(150, l0);
		mv.visitVarInsn(25, 0);
		mv.visitFieldInsn(180, myName, "func", FixedArityFunctor.SUBLFUNCTION_LNAME);
		mv.visitInsn(176);
		l2 = new Label();
		mv.visitLabel(l2);
		mv.visitLocalVariable("this", "L" + myName + ";", null, l0, l2, 0);
		mv.visitMaxs(1, 1);
		mv.visitEnd();
	}

	private static String FIX_ARITY_FUNCTOR_INAME;
	private static String RESOURCER_INAME;
	private static String SUBLOBJECT_INAME;
	private static String SUBLOBJECT_LNAME;
	private static String SUBLFUNCTION_LNAME;
	static SingleMethodClass smc;
	public static boolean USE_FUNCTOR_GENERATOR = true;
	public static HashMap<String, Integer> signaturesUncoded;
	public static HashMap<String, Integer> signaturesCoded;
	public static ArrayList<RuntimeException> makeInstanceTraces;
	static boolean lineNumbers = false;
	private static int serial;
	public static int directCallCount;
	public static int funcallCount;
	static {
		FIX_ARITY_FUNCTOR_INAME = Type.getInternalName(FixedArityFunctor.class);
		RESOURCER_INAME = Type.getInternalName(Resourcer.class);
		SUBLOBJECT_INAME = Type.getInternalName(SubLObject.class);
		SUBLOBJECT_LNAME = "L" + FixedArityFunctor.SUBLOBJECT_INAME + ";";
		SUBLFUNCTION_LNAME = "L" + Type.getInternalName(SubLFunction.class) + ";";
		smc = new SingleMethodClass();
		signaturesUncoded = new HashMap<String, Integer>();
		signaturesCoded = new HashMap<String, Integer>();
		makeInstanceTraces = new ArrayList<RuntimeException>();
		FixedArityFunctor.serial = 0;
		FixedArityFunctor.directCallCount = 0;
		FixedArityFunctor.funcallCount = 0;
	}

	public abstract SubLFunction getFunction();
}
