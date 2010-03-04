package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import static org.objectweb.asm.Opcodes.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuarternaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuintenaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.TernaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.PatchFileLoader;

/**
 *
 *  NnaryFunction is helper class
 *
 * @see  {@link BinaryFunction, UnaryFunction, ZeroArityFunction or TernaryFunction}
 *
 */
public abstract class FixedArityFunctor implements CommonSymbols {

  final static private String FIX_AIRTY_FUNCTOR_INAME = Type.getInternalName(FixedArityFunctor.class);
  final static private String RESOURCER_INAME = Type.getInternalName(Resourcer.class);
  final static private String SUBLOBJECT_INAME = Type.getInternalName(SubLObject.class);
  final static private String SUBLOBJECT_LNAME = "L" + SUBLOBJECT_INAME + ";";
  final static private String SUBLFUNCTION_LNAME = "L" + Type.getInternalName(SubLFunction.class) + ";";  // maybe for later   abstract public int getArity();
  final static SingleMethodClass smc = new SingleMethodClass();
  /**
   * Set USE_FUNCTOR_GENERATOR
   *   @false to turn this experimental feature off
   */
  final public static boolean USE_FUNCTOR_GENERATOR = true;
  final public static HashMap<String, Integer> signaturesUncoded = new HashMap<String, Integer>();
  final public static HashMap<String, Integer> signaturesCoded = new HashMap<String, Integer>();
  final public static ArrayList<RuntimeException> makeInstanceTraces = new ArrayList<RuntimeException>();
  final static boolean lineNumbers = false;
  private static int serial = 0;
  public static int directCallCount = 0;
  public static int funcallCount = 0;
  
  public static synchronized int nextSerial() {
    return serial++;
  }

  public static interface Arity6Funct {

    public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5, SubLObject obj6);
  }

  public static interface Arity7Funct {

    public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5, SubLObject obj6, SubLObject obj7);
  }

  public static interface Arity8Funct {

    public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5, SubLObject obj6, SubLObject obj7, SubLObject obj8);
  }

  public static interface Arity9Funct {

    public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5, SubLObject obj6, SubLObject obj7, SubLObject obj8, SubLObject obj9);
  }

  public static interface Arity10Funct {

    public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5, SubLObject obj6, SubLObject obj7, SubLObject obj8, SubLObject obj9, SubLObject obj10);
  }

  static class SingleMethodClass extends ClassLoader {
    
    public SingleMethodClass() {
      super(PatchFileLoader.PATCH_FILE_LOADER);
    }

    public HashMap<String, Class> classLoaderCache = new HashMap<String, Class>();

    /**
     * @param data
     * @return
     */
    public Class defClass(byte[] data) {

      try {
        // TODO Auto-generated method stub
        Class c = super.defineClass(null, data, 0, data.length);
        this.resolveClass(c);
        //   getParent().resolveClass(c);
        ///Compiler.compileClass(c);
        return c;
      } catch (Error err) {
        throw err;
      } catch (Throwable t) {
        t.printStackTrace();
        Errors.error("defClass " + t);
        return null;
      }
    }

    @Override
    public synchronized Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
      Class c = (Class) this.classLoaderCache.get(name);
      if (c == null) {
        c = this.getParent().loadClass(name);//this.findSystemClass(name);
        this.classLoaderCache.put(name, c);
      }
      if (resolve) {
        this.resolveClass(c);
      }
      return c;
    }
  }

  /**
   * @param signamtures2
   * @param signature
   * @param i
   */
  private static void addCount(Map<String, Integer> map, String signature, int i) {
    // TODO Auto-generated method stub
    if (map != null) {
      Integer sig = (Integer) map.get(signature);//.hashCode();
      if (sig == null) {
        sig = Integer.valueOf(i);
      } else {
        sig = Integer.valueOf(i + sig.intValue());
      }
      map.put(signature, sig == 0 ? null : sig);
    }
  }

  static public SubLObject dump_instances() {
    System.out.println("#|*********************************************************************");

    int totalC = 0;
    Iterator<Map.Entry<String, Integer>> inIteratorC = signaturesCoded.entrySet().iterator();
    while (inIteratorC.hasNext()) {
      Entry<String, Integer> e = inIteratorC.next();
      Integer v = e.getValue();
      if (v == null || v == 0) {
        continue;
      }
      totalC += v.intValue();
      System.out.println("Coded " + v + " instance(s) of " + e.getKey());
    }

    int totalU = 0;
    Iterator<Map.Entry<String, Integer>> inIteratorU = signaturesUncoded.entrySet().iterator();
    while (inIteratorU.hasNext()) {
      Entry<String, Integer> e = inIteratorU.next();
      Integer v = e.getValue();
      if (v == null || v == 0) {
        continue;
      }
      totalU += v.intValue();
      System.out.println("skipped " + v + " instance(s) of " + e.getKey());
    }

    System.out.println("makeInstance " + totalC + " bytecoded versions of " + (totalC + totalU));
    System.out.println("" + (directCallCount - funcallCount) 
        + " dirrect apply w/o funcall out of " + funcallCount + " non-bytecoded funcalls");
    /// Functions.funcall_stats(UNPROVIDED);
    System.out.println("*********************************************************************|#");

    return NIL;
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
        return QuarternaryFunction.class;
      case 5:
        return QuintenaryFunction.class;
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
   * @param arity of the processItems
   * @param superClazz (usually the type to return)
   * @param function
   * @return a {@link BinaryFunction, UnaryFunction, ZeroArityFunction or TernaryFunction} or just @null if we cannot reliably make one
   */
  public static <F extends FixedArityFunctor> F makeInstanceDirect(int arity, Class<F> superClazz, SubLFunction targetFunction) {
    if (!USE_FUNCTOR_GENERATOR) {
      return null;
    }
    if (targetFunction.isMacroOperator()) {
      Errors.error("makeInstanceDirect on MACRO " + targetFunction);
      targetFunction = targetFunction.toMacro().getMacroExpander();
      return null;
    }

    //        if (targetFunction.isSpecialOperator()) {
    //            Errors.error("makeInstanceDirect on SPECIAL-OPERATOR " + targetFunction);
    //            targetFunction = targetFunction.toSpecialOperator().getEvaluationFunction();
    //            return null;
    //        }
    // Check if a java trampoline should exist
    if (targetFunction.isInterpreted()) {
      // this might happen but not to worry about this today
      //Errors.warn("makeInstanceDirect not supported for Interpreted functions yet " + targetFunction);
      return null;
    }
    int required = targetFunction.getRequiredArgCount();
    if (required > arity) {
      // this underflow should never happen?
      Errors.error("Cannot make an arity " + arity + " function from " + targetFunction + " {req=" + required + " ...} ");
      return null;
    }
    int optional = targetFunction.getOptionalArgCount();
    boolean allowsRest = targetFunction.allowsRest();

    int restLength = arity - required - optional;
    if ((restLength > 0) && !allowsRest) {
      // this overflow should never happen?
      Errors.error("Cannot make an arity " + arity + " function from " + targetFunction + " {req=" + required + " opt=" + optional + " allowsrest=" + allowsRest + "} ");
      return null;
    }
    if (!(targetFunction instanceof SubLCompiledFunction)) {
      // SubLCompledFunction is the only SubLFunction subclass maintaining trampoline data
      return null;
    }
    SubLCompiledFunction subLFunctionTyped = (SubLCompiledFunction) targetFunction;

    int unprovidedPadding = -restLength;
    F result = null;

    Method method = subLFunctionTyped.getMethod();

    String signature = "arity=" + arity + " req=" + required + " opt=" + optional + " &rest=" + allowsRest;

    String info = "makeInstance " + signature + " " + method + " for " + targetFunction;
    // if (!info.contains("com.cyc.cycjava")) {
    RuntimeException st = new RuntimeException(info);
    showShortStackTrace(st, 5);
    makeInstanceTraces.add(st);
    ///  }

    ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);

    String cname = method.getName() + nextSerial();
    if (superClazz.isInterface()) {
      visitIFacConstructor(cw, superClazz, cname);
    } else {
      visitClassConstructor(cw, superClazz, cname);
    }
    //        if ((required + optional) == arity && !allowsRest) {
    //            visitSimple(cw, method, arity);
    //            addCount(signaturesCoded, signature, 1);
    //        } else 
    if (unprovidedPadding >= 0) {
      addCount(signaturesCoded, signature, 1);
      visitArityWithOptional(cw, method, arity, unprovidedPadding, allowsRest);
    } else if (allowsRest) {
      addCount(signaturesCoded, signature, 1);
      visitRest(cw, method, arity, required + optional);
    } else {
      addCount(signaturesUncoded, signature, 1);
      Errors.unimplementedMethod(info);
      if (true) {
        return null;
      }
    }
    cw.visitEnd();
    byte[] data = cw.toByteArray();
    Class<F> mgenClass = (Class<F>) smc.defClass(data);

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

  /**
   * 0-5 have a shorten alias  
   * others bave to be pushed nomrally
   * 
   * @param mv Method Visitor for Const ints
   * @param i
   */
  private static void pushIntConst(MethodVisitor mv, int i) {
    switch (i) {
      case -1:
        mv.visitInsn(ICONST_M1);
        break;
      case 0:
        mv.visitInsn(ICONST_0);
        break;
      case 1:
        mv.visitInsn(ICONST_1);
        break;
      case 2:
        mv.visitInsn(ICONST_2);
        break;
      case 3:
        mv.visitInsn(ICONST_3);
        break;
      case 4:
        mv.visitInsn(ICONST_4);
        break;
      case 5:
        mv.visitInsn(ICONST_5);
        break;
      default:
        if (i < Byte.MAX_VALUE && i > Byte.MIN_VALUE) {
          mv.visitIntInsn(BIPUSH, i);
        } else if (i < Short.MAX_VALUE && i > Short.MIN_VALUE) {
          mv.visitIntInsn(SIPUSH, i);
        } else if (i < Integer.MAX_VALUE && i > Integer.MIN_VALUE) {
          mv.visitIntInsn(LDC, i);
        } else {
          Errors.unimplementedMethod("pushIntConst " + i);
        }
    }
  }

  /**
   * @param st
   * @param i
   */
  public static void showShortStackTrace(RuntimeException st, int isd) {
    if (true) {
      return;
    }
    String info = st.getMessage();
    info = info.replace("com.cyc.tool.subl.jrtl.nativeCode.type.core.", "");
    info = info.replace("public static final", "");
    System.out.println(info);
    isd += 2;
    // TODO Auto-generated method stub
    StackTraceElement[] eles = st.getStackTrace();
    for (int i = 2; i < isd; i++) {
      System.out.println(";; " + eles[i]);
    }
  }

  /**
   *
  <pre>
  public   SubLObject processItem(SubLObject arg1) {    
  return Class.Method(arg1, UNPROVIDED);
  }
  
  </pre>
   */
  static void visitArityWithOptional(ClassWriter cw, Method method, int arity, int unprovideds, boolean needsRest) {
    String args = "";
    for (int i = 0; i < arity; i++) {
      args += SUBLOBJECT_LNAME;
    }
    MethodVisitor mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "processItem", "(" + args + ")" + SUBLOBJECT_LNAME, null, null);
    mv.visitCode();
    //        Label l0 = new Label();
    //        mv.visitLabel(l0);
    //        mv.visitLineNumber(168, l0);
    for (int i = 1; i <= arity; i++) {
      mv.visitVarInsn(ALOAD, i);
    }
    while (unprovideds-- > 0) {
      mv.visitFieldInsn(GETSTATIC, "com/cyc/tool/subl/jrtl/nativeCode/subLisp/CommonSymbols", "UNPROVIDED", "Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;");
    }
    if (needsRest) {
      mv.visitFieldInsn(GETSTATIC, RESOURCER_INAME, "EMPTY_SUBL_OBJECT_ARRAY", "[" + SUBLOBJECT_LNAME);
    }
    mv.visitMethodInsn(INVOKESTATIC, Type.getInternalName(method.getDeclaringClass()), method.getName(), Type.getMethodDescriptor(method));
    mv.visitInsn(ARETURN);
    //        Label l1 = new Label();
    //        mv.visitLabel(l1);
    //        mv.visitLocalVariable("this", "Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/FixedArityFunctor;", null, l0, l1, 0);
    //        mv.visitLocalVariable("arg1", SUBLOBJECT_LNAME, null, l0, l1, 1);
    mv.visitMaxs(2, 2);
    mv.visitEnd();

  }

  static void visitIFacConstructor(ClassWriter cw, Class fixedTypeInterface, String methodNameSerial) {
    Class fixedType = FixedArityFunctor.class;

    String fixedTypename = Type.getInternalName(fixedType);
    String myName = fixedTypename + "_" + methodNameSerial;

    FieldVisitor fv;
    MethodVisitor mv;

    cw.visit(V1_5, ACC_FINAL + ACC_SUPER, myName, null, Type.getInternalName(fixedType), fixedTypeInterface == null ? null : new String[]{Type.getInternalName(fixedTypeInterface)});

    cw.visitSource("java", null);

    cw.visitInnerClass(myName, FIX_AIRTY_FUNCTOR_INAME, methodNameSerial, ACC_STATIC);

    cw.visitInnerClass(Type.getInternalName(fixedTypeInterface), FIX_AIRTY_FUNCTOR_INAME, fixedTypeInterface.getName(), ACC_PUBLIC + ACC_STATIC + ACC_ABSTRACT + ACC_INTERFACE);

    {
      fv = cw.visitField(0, "func", SUBLFUNCTION_LNAME, null, null);
      fv.visitEnd();
    }
    {
      mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(" + SUBLFUNCTION_LNAME + ")V", null, null);
      mv.visitCode();
      Label l0 = new Label();
      mv.visitLabel(l0);
      mv.visitLineNumber(131, l0);
      mv.visitVarInsn(ALOAD, 0);
      mv.visitMethodInsn(INVOKESPECIAL, FIX_AIRTY_FUNCTOR_INAME, "<init>", "()V");
      Label l1 = new Label();
      mv.visitLabel(l1);
      mv.visitLineNumber(132, l1);
      mv.visitVarInsn(ALOAD, 0);
      mv.visitVarInsn(ALOAD, 1);
      mv.visitFieldInsn(PUTFIELD, myName, "func", SUBLFUNCTION_LNAME);
      Label l2 = new Label();
      mv.visitLabel(l2);
      mv.visitLineNumber(133, l2);
      mv.visitInsn(RETURN);
      Label l3 = new Label();
      mv.visitLabel(l3);
      mv.visitLocalVariable("this", "L" + myName + ";", null, l0, l3, 0);
      mv.visitLocalVariable("f", SUBLFUNCTION_LNAME, null, l0, l3, 1);
      mv.visitMaxs(2, 2);
      mv.visitEnd();
    }
    {
      mv = cw.visitMethod(ACC_PUBLIC, "getFunction", "()" + SUBLFUNCTION_LNAME + "", null, null);
      mv.visitCode();
      Label l0 = new Label();
      mv.visitLabel(l0);
      mv.visitLineNumber(150, l0);
      mv.visitVarInsn(ALOAD, 0);
      mv.visitFieldInsn(GETFIELD, myName, "func", SUBLFUNCTION_LNAME);
      mv.visitInsn(ARETURN);
      Label l1 = new Label();
      mv.visitLabel(l1);
      mv.visitLocalVariable("this", "L" + myName + ";", null, l0, l1, 0);
      mv.visitMaxs(1, 1);
      mv.visitEnd();
    }

  }

  // Classfile header plus default constructor
  static void visitClassConstructor(ClassWriter cw, Class fixedType, String methodNameSerial) {
    String fixedTypename = Type.getInternalName(fixedType);
    String myName = fixedTypename + "_" + methodNameSerial;

    cw.visit(V1_5, ACC_FINAL + ACC_SUPER, myName, null, Type.getInternalName(fixedType), null);
    //   cw.visitInnerClass(methodNameSerial, fixedTypename, myName, directCallCount)
    //would be wrong sourcefile anyways:  cw.visitSource("" + suffiz + ".java", null);
    MethodVisitor mv;
    mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(" + SUBLFUNCTION_LNAME + ")V", null, null);
    mv.visitCode();
    Label l0 = new Label();
    mv.visitLabel(l0);
    //would be wrong: mv.visitLineNumber(176, l0);
    mv.visitVarInsn(ALOAD, 0);
    mv.visitVarInsn(ALOAD, 1);
    mv.visitMethodInsn(INVOKESPECIAL, fixedTypename, "<init>", "(" + SUBLFUNCTION_LNAME + ")V");
    Label l1 = new Label();
    mv.visitLabel(l1);
    //would be wrong: mv.visitLineNumber(177, l1);
    mv.visitInsn(RETURN);
    Label l2 = new Label();
    mv.visitLabel(l2);
    mv.visitLocalVariable("this", "L" + myName + ";", null, l0, l2, 0);
    mv.visitLocalVariable("func", SUBLFUNCTION_LNAME, null, l0, l2, 1);
    mv.visitMaxs(2, 2);
    mv.visitEnd();

  }

  /**
   * Bytecode template for functions  arity > required+optional
   * 
   * allowsRest = true;
   *  
  <pre>   
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
  </pre>
   */
  public static void visitRest(ClassWriter cw, Method method, int arity, int left) {
    {
      ArrayList<Object> frameArray = new ArrayList<Object>();
      frameArray.add(FIX_AIRTY_FUNCTOR_INAME);
      int rest = arity - left;
      String args = "";
      for (int i = 0; i < arity; i++) {
        args += SUBLOBJECT_LNAME;
        frameArray.add(SUBLOBJECT_INAME);
      }
      MethodVisitor mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "processItem", "(" + args + ")" + SUBLOBJECT_LNAME, null, null);

      mv.visitCode();
      Label l0 = new Label();
      Label l1 = new Label();
      Label l2 = new Label();
      mv.visitTryCatchBlock(l0, l1, l2, null);
      Label l3 = new Label();
      mv.visitLabel(l3);
      mv.visitLineNumber(512, l3);
      mv.visitMethodInsn(INVOKESTATIC, RESOURCER_INAME, "getInstance", "()L" + RESOURCER_INAME + ";");
      mv.visitVarInsn(ASTORE, arity + 1);
      Label l4 = new Label();
      mv.visitLabel(l4);
      mv.visitLineNumber(513, l4);

      mv.visitVarInsn(ALOAD, arity + 1);
      pushIntConst(mv, rest);
      mv.visitMethodInsn(INVOKEVIRTUAL, RESOURCER_INAME, "acquireSubLObjectArray", "(I)[" + SUBLOBJECT_LNAME);
      mv.visitVarInsn(ASTORE, arity + 2);
      Label l5 = new Label();
      mv.visitLabel(l5);
      mv.visitLineNumber(514, l5);

      for (int i = 0; i < rest; i++) {
        mv.visitVarInsn(ALOAD, arity + 2);
        pushIntConst(mv, i);
        mv.visitVarInsn(ALOAD, i + left + 1);
        mv.visitInsn(AASTORE);
        mv.visitLabel(l0);
        mv.visitLineNumber(519, l0);
      }

      for (int i = 0; i < left; i++) {
        mv.visitVarInsn(ALOAD, i + 1);
      }

      mv.visitVarInsn(ALOAD, arity + 2);
      mv.visitMethodInsn(INVOKESTATIC, Type.getInternalName(method.getDeclaringClass()), method.getName(), org.objectweb.asm.Type.getMethodDescriptor(method));
      mv.visitVarInsn(ASTORE, arity + 4);
      mv.visitLabel(l1);
      mv.visitLineNumber(521, l1);
      mv.visitVarInsn(ALOAD, arity + 1);
      mv.visitVarInsn(ALOAD, arity + 2);
      mv.visitMethodInsn(INVOKEVIRTUAL, RESOURCER_INAME, "releaseSubLObjectArray", "([" + SUBLOBJECT_LNAME + ")V");
      Label l9 = new Label();
      mv.visitLabel(l9);
      mv.visitLineNumber(519, l9);
      mv.visitVarInsn(ALOAD, arity + 4);
      mv.visitInsn(ARETURN);
      mv.visitLabel(l2);
      mv.visitLineNumber(520, l2);

      frameArray.add(RESOURCER_INAME);
      frameArray.add("[" + SUBLOBJECT_LNAME);
      mv.visitFrame(F_FULL, arity + 3, frameArray.toArray(), 1, new Object[]{"java/lang/Throwable"});
      mv.visitVarInsn(ASTORE, arity + 3);
      Label l10 = new Label();
      mv.visitLabel(l10);
      mv.visitLineNumber(521, l10);
      mv.visitVarInsn(ALOAD, arity + 1);
      mv.visitVarInsn(ALOAD, arity + 2);
      mv.visitMethodInsn(INVOKEVIRTUAL, RESOURCER_INAME, "releaseSubLObjectArray", "([" + SUBLOBJECT_LNAME + ")V");
      Label l11 = new Label();
      mv.visitLabel(l11);
      mv.visitLineNumber(522, l11);
      mv.visitVarInsn(ALOAD, arity + 3);
      mv.visitInsn(ATHROW);
      Label l12 = new Label();
      mv.visitLabel(l12);
      mv.visitLocalVariable("this", "L" + FIX_AIRTY_FUNCTOR_INAME + ";", null, l3, l12, 0);
      //            mv.visitLocalVariable("a1", SUBLOBJECT_LNAME, null, l3, l12, 1);
      //            mv.visitLocalVariable("a2", SUBLOBJECT_LNAME, null, l3, l12, 2);
      //            mv.visitLocalVariable("a3", SUBLOBJECT_LNAME, null, l3, l12, 3);
      //            mv.visitLocalVariable("a4", SUBLOBJECT_LNAME, null, l3, l12, 4);
      //            mv.visitLocalVariable("a5", SUBLOBJECT_LNAME, null, l3, l12, 5);
      mv.visitLocalVariable("resourcer", "L" + RESOURCER_INAME + ";", null, l4, l12, 6);
      mv.visitLocalVariable("rest", "[" + SUBLOBJECT_LNAME, null, l5, l12, 7);
      mv.visitMaxs(3, arity + 5);
      mv.visitEnd();
    }
  }

  //
  abstract public SubLFunction getFunction();
  //
  //    public SubLObject processItem(SubLObject... args) {
  //        Resourcer resourcer = Resourcer.getInstance();
  //        SubLObject[] rest = resourcer.acquireSubLObjectArray(args.length);
  //        rest[0] = args[1];
  //        try {
  //            return SubLObjectFactory.makeListS(args[0], rest);
  //        } finally {
  //            resourcer.releaseSubLObjectArray(rest);
  //        }
  //    }
}
