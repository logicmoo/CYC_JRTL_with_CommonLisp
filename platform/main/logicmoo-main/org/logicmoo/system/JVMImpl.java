package org.logicmoo.system;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Hashtable;

import org.armedbear.lisp.ControlTransfer;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;

/*
* Transform the bytecode not to care if this is really a
* Throwable or not (we remove CHECKCAST)

public class ThrowerImpl implements JVMImpl.Thrower {
	public ThrowerImpl() {
	}

	public RuntimeException doThrow(Throwable throwable) {
		throw (RuntimeException) throwable;
	}
}

*/

public /*abstract*/ class JVMImpl {
    private static final String COM_CYC_TOOL_SUBL_JRTL_NATIVE_CODE_SUB_LISP_CATCHABLE_THROW = "com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow";

    public static interface Thrower {
        public abstract RuntimeException doThrow(final Throwable throwable) throws Error;
    }


    static class ThrowerLoader extends ClassLoader implements Opcodes {
        public static byte[] dump() {
            //   groovyjarjarasm.asm.
            final ClassWriter cw = getClassWriter();
            //groovyjarjarasm.asm.
            MethodVisitor mv;
            cw.visit(Opcodes.V1_5, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, JVMImpl.THROWERNAME, null, "java/lang/Object",
                    new String[] { "org/logicmoo/system/JVMImpl$Thrower" });
            cw.visitSource("JVMImpl.java", null);
            cw.visitInnerClass("org/logicmoo/system/JVMImpl$Thrower", "org/logicmoo/system/JVMImpl", "Thrower", Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC
                    + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE);
            {
                mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
                mv.visitCode();
                //Label l0 = new Label();
                //mv.visitLabel(l0);
                //mv.visitLineNumber(20, l0);
                mv.visitVarInsn(Opcodes.ALOAD, 0);
                mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
                //Label l1 = new Label();
                //mv.visitLabel(l1);
                //mv.visitLineNumber(22, l1);
                mv.visitInsn(Opcodes.RETURN);
                //Label l2 = new Label();
                ////mv.visitLabel(l2);
                //mv.visitLocalVariable("this", "L" + THROWERNAME + ";", null, l0, l2, 0);
                mv.visitMaxs(1, 1);
                mv.visitEnd();
            }
            {
                mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "doThrow", "(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;", null, null);
                mv.visitCode();
                //	Label l0 = new Label();
                //	mv.visitLabel(l0);
                //	mv.visitLineNumber(24, l0);
                mv.visitVarInsn(Opcodes.ALOAD, 1);
                mv.visitInsn(Opcodes.ATHROW);
                // Label l1 = new Label();
                //		mv.visitLabel(l1);
                //	mv.visitLocalVariable("this", "L" + THROWERNAME + ";", null, l0, l1, 0);
                //	mv.visitLocalVariable("throwable", "Ljava/lang/Object;", null, l0, l1, 1);
                mv.visitMaxs(1, 2);
                mv.visitEnd();
            }
            cw.visitEnd();

            return cw.toByteArray();
        }

        private static ClassWriter getClassWriter() {
            ClassWriter cw = null;
            final Constructor[] cons = ClassWriter.class.getConstructors();
            for (int i = 0; i < cons.length; i++) {
                final Class[] pts = cons[i].getParameterTypes();
                if (pts.length == 1) {
                    final Class c = pts[0];
                    if (c == boolean.class) {
                        try {
                            cw = (ClassWriter) cons[i].newInstance(new Boolean(false));
                            break;
                        } catch (final IllegalArgumentException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        } catch (final InstantiationException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        } catch (final IllegalAccessException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        } catch (final InvocationTargetException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }

                    } else if (c == int.class) {
                        try {
                            cw = (ClassWriter) cons[i].newInstance(new Integer(0));
                            break;
                        } catch (final IllegalArgumentException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        } catch (final InstantiationException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        } catch (final IllegalAccessException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        } catch (final InvocationTargetException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            }
            return cw;
        }

        //  @SuppressWarnings("deprecation")
        //    @SuppressWarnings("deprecation")
        ThrowerLoader() {
            JVMImpl.cache = new Hashtable();
            final byte[] data = ThrowerLoader.dump();
            JVMImpl.throwerClass = this.defineClass(data, 0, data.length);
            JVMImpl.cache.put(JVMImpl.THROWERNAME, JVMImpl.throwerClass);
            this.resolveClass(JVMImpl.throwerClass);
        }

        void exec() throws Exception {
            JVMImpl.thrower = (Thrower) JVMImpl.throwerClass.newInstance();
        }

        @Override
		public synchronized Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
            Class c = (Class) JVMImpl.cache.get(name);
            if (c == null) {
                c = this.findSystemClass(name);
                JVMImpl.cache.put(name, c);
            }
            if (resolve) this.resolveClass(c);
            return c; // *;//
        }
    }

    static final String  THROWERNAME   = "org/logicmoo/system/JVMImpl$ThrowerImpl";
    static Hashtable     cache         = new Hashtable();
    static Class         throwerClass  = null;

    static Thrower       thrower       = null;

    static ThrowerLoader throwerloader = null;

    //    public static Error doThrow(final Error throwable, final Object nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables) throws Error {
    //        return throwable;//doThrowObject(throwable, nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables);
    //    }
    //
    //    public static IOException doThrow(final IOException throwable, final Object nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables) throws IOException {
    //        return throwable;//doThrowObject(throwable, nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables);
    //    }
    //    public static RuntimeException doThrow(Object throwable, Object nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables) {
    //        // TODO Auto-generated method stub
    //        return (RuntimeException)doThrowObject(throwable, nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables);
    //    }


    public static RuntimeException doThrow(Object throwable) {    	
        return doThrow((Throwable) throwable);
    }

	@SuppressWarnings("unchecked")
	static <T extends Exception, R> R sneakyThrow(Throwable t) throws T {
	    throw (T) t; // ( ͡° ͜ʖ ͡°)
	}

    public static RuntimeException doThrow(Throwable throwable) {
    	if (throwable instanceof ControlTransfer) {
    		throw (ControlTransfer) throwable;
    	}	
    	if (throwable instanceof Error) {
    		throw (Error) throwable;
    	}	
        if (throwable instanceof RuntimeException) {
            final RuntimeException runtimeException = (RuntimeException) throwable;
            return doThrow(runtimeException);
        }
        sneakyThrow(throwable);
        final Thrower theThrower = JVMImpl.getThrower();
		return theThrower.doThrow(throwable);
    }

    static Throwable lastThrowable;

    public static RuntimeException doThrow(RuntimeException throwable) {
//        if (throwable instanceof CatchableThrow) {
//            final CatchableThrow runtimeException = (CatchableThrow) throwable;
//            return runtimeException;
//        }
    	if (throwable instanceof SubLProcess.TerminationRequest) return throwable;
        if (JVMImpl.lastThrowable != throwable) {
            //throwable.printStackTrace();
        }
        JVMImpl.lastThrowable = throwable;
        sneakyThrow(throwable);
        if(true) {
        	throw throwable; 
        }
        return throwable;//JVMImpl.getThrower().doThrow((Throwable) throwable);
    }

    /**
     * @param throwable
     * @param nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables
     *            Or OneDeclaredThowable Class OrArrayOfDeclaredThrowable
     *            Classes
     *
     * @return RuntimeException? or supposedly something safe to throw at the
     *         time of invocation.. or perhaps stores it for later moment that
     *         we are out of critical code
     */
    public static Throwable doThrowObject_hide(final Object throwable, final Object nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables) throws Error {
        Throwable t = null;
        if (throwable == null) {
            t = new RuntimeException("NULL throwable!?!");
            t.printStackTrace();
            throw (RuntimeException) t;
        } else if (!(throwable instanceof Throwable)) {
            t = new ClassCastException("not throwable!?! " + throwable);
            t.printStackTrace();
            throw (RuntimeException) t;
        }
        t = (Throwable) throwable;
        //      if (t instanceof com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow) return (com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow)t;
        //      t.printStackTrace();
        if (t instanceof Error) throw (Error) t;
        //    if (t instanceof RuntimeException) throw (RuntimeException) t;
        if (t instanceof RuntimeException) return (RuntimeException) t;

        if (nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables == null) return new UndeclaredThrowableException(t);

        if (nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables instanceof Class) {
            if (((Class) nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables).isInstance(t)) {
                return JVMImpl.doThrow(t);
            } else {
                return JVMImpl.doThrow(t);
            }
        } else {
            final Class[] classes = (Class[]) nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables;
            for (int i = 0; i < classes.length; i++) {
                if (classes[i].isInstance(t)) {
                    return JVMImpl.doThrow((Throwable) throwable);
                }
            }
            return new RuntimeException(t);
        }
    }

    /*

    Here was it working successfully in GCJ!

    Using built-in specs.
    Reading specs from t:/cyc/top/external/msys-1.0/local/bin/../lib/gcc/i686-pc-mingw32/4.3.0/../../../../i686-pc-mingw32/lib/libgcj.spec
    rename spec startfile to startfileorig
    rename spec lib to liborig
    Target: i686-pc-mingw32
    Configured with: /datal/gcc/gcc/configure --prefix=/datal/gcc/build/wingcc --with-sysroot=/datal/gcc/build/wingcc/sys-root --with-build-sysroot=/datal/gcc/build/wingcc/sys-root --build=i686-pc-linux-gnu --host=i686-pc-mingw32 --target=i686-pc-mingw32 --enable-languages=c,c++,java
     --with-gcc --with-gnu-as --with-gnu-ld --with-mpfr=/datal/gcc/gmp_mpfr_win32 --with-gmp=/datal/gcc/gmp_mpfr_win32 --with-as=/datal/gcc/build/crossgcc/bin/i686-pc-mingw32-as --with-ld=/datal/gcc/build/crossgcc/bin/i686-pc-mingw32-ld --enable-threads=win32 --disable-nls --disable-
    win32-registry --disable-shared --disable-debug --without-newlib --disable-checking --with-gcj=i686-pc-mingw32-gcj --enable-libgcj --disable-java-awt --without-x --enable-java-gc=boehm --disable-libgcj-debug --enable-interpreter --enable-hash-synchronization --enable-sjlj-excepti
    ons --enable-libgcj-multifile --enable-libgcj-mingw-osapi=ansi
    Thread model: win32
    gcc version 4.3.0 20061108 (gcj-eclipse experimental)
     t:/cyc/top/external/msys-1.0/local/bin/../libexec/gcc/i686-pc-mingw32/4.3.0/jvgenmain.exe dmiles.transform.sublisp.JVMImplmain C:/DOCUME~1/ADMINI~1/LOCALS~1/Temp/ccSQaaaa.i
     t:/cyc/top/external/msys-1.0/local/bin/../libexec/gcc/i686-pc-mingw32/4.3.0/cc1.exe C:/DOCUME~1/ADMINI~1/LOCALS~1/Temp/ccSQaaaa.i -quiet -dumpbase dmiles.transform.sublisp.JVMImplmain.c -mno-ieee-fp -mtune=generic -O2 -version -p -ffast-math -funroll-loops -fdollars-in-identifie
    rs -o C:/DOCUME~1/ADMINI~1/LOCALS~1/Temp/ccAxbaaa.s
    GNU C version 4.3.0 20061108 (gcj-eclipse experimental) (i686-pc-mingw32)
    		compiled by GNU C version 4.3.0 20061108 (gcj-eclipse experimental).
    GGC heuristics: --param ggc-min-expand=99 --param ggc-min-heapsize=131006
    Compiler executable checksum: c9dd90c537b1050dec4c5819f26025cf
     t:/cyc/top/external/msys-1.0/local/bin/../lib/gcc/i686-pc-mingw32/4.3.0/../../../../i686-pc-mingw32/bin/as.exe -o C:/DOCUME~1/ADMINI~1/LOCALS~1/Temp/cciecaaa.o C:/DOCUME~1/ADMINI~1/LOCALS~1/Temp/ccAxbaaa.s
     t:/cyc/top/external/msys-1.0/local/bin/../libexec/gcc/i686-pc-mingw32/4.3.0/collect2.exe --sysroot=t:\cyc\top\external\msys-1.0\local\bin\../sys-root -Bdynamic -o JVMImpl.exe t:/cyc/top/external/msys-1.0/local/bin/../lib/gcc/i686-pc-mingw32/4.3.0/../../../../i686-pc-mingw32/lib/
    crtmt.o t:/cyc/top/external/msys-1.0/local/bin/../lib/gcc/i686-pc-mingw32/4.3.0/../../../../i686-pc-mingw32/lib/crt2.o t:/cyc/top/external/msys-1.0/local/bin/../lib/gcc/i686-pc-mingw32/4.3.0/../../../../i686-pc-mingw32/lib/gcrt2.o -Lt:/cyc/top/external/msys-1.0/local/bin/../lib/g
    cc/i686-pc-mingw32/4.3.0 -Lt:/cyc/top/external/msys-1.0/local/bin/../lib/gcc -Lt:/cyc/top/external/msys-1.0/local/bin/../lib/gcc/i686-pc-mingw32/4.3.0/../../../../i686-pc-mingw32/lib -Lt:/cyc/top/external/msys-1.0/local/bin/../lib/gcc/i686-pc-mingw32/4.3.0/../../.. -Lt:/cyc/top/e
    xternal/msys-1.0/local/bin/../sys-root/mingw/lib C:/DOCUME~1/ADMINI~1/LOCALS~1/Temp/cciecaaa.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.AnnotationVisitor.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.AnnotationWriter.o objects/SubLInteractor.ObjectWeb.org.objectw
    eb.asm.Attribute.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.ByteVector.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.ClassAdapter.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.ClassReader.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.ClassVisitor.o
    objects/SubLInteractor.ObjectWeb.org.objectweb.asm.ClassWriter.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.Edge.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.FieldVisitor.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.FieldWriter.o objects/SubLInteractor.Obj/SubLInteractor.ObjectWeb.org.objectweb.asm.util.TraceClassVisitor.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.util.TraceFieldVisitor.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.util.TraceMethodVisitor.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.util.Tr
    aceSignatureVisitor.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.util.Traceable.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.xml.ASMContentHandler.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.xml.Processor.o objects/SubLInteractor.ObjectWeb.org.objectweb.a
    sm.xml.SAXAdapter.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.xml.SAXAnnotationAdapter.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.xml.SAXClassAdapter.o objects/SubLInteractor.ObjectWeb.org.objectweb.asm.xml.SAXCodeAdapter.o objects/SubLInteractor.ObjectWeb.org.
    objectweb.asm.xml.SAXFieldAdapter.o objects/SubLInteractor.trans-src.dmiles.transform.sublisp.CPPClassInfo.o objects/SubLInteractor.trans-src.dmiles.transform.sublisp.JTypeInfo.o objects/SubLInteractor.trans-src.dmiles.transform.sublisp.JVMImpl.o -lmingw32 -lgcc -lmoldname -lming
    wex -lmsvcrt -lgcj -lm -liconv -lgdi32 -lws2_32 -lmingw32 -lgcc -lmoldname -lmingwex -lmsvcrt -lgmon -luser32 -lkernel32 -ladvapi32 -lshell32 -lmingw32 -lgcc -lmoldname -lmingwex -lmsvcrt

    ./JVMImpl.EXE

    java.io.IOException: declared!
       at dmiles.transform.sublisp.JVMImpl.throwDeclaredIOExcetion(ccBTxcajjx:0)
       at dmiles.transform.sublisp.JVMImpl.main(ccBTxcajjx:0)
    java.io.IOException: good catch!
       at dmiles.transform.sublisp.JVMImpl.throwUndeclaredIOExcetion(ccBTxcajjx:0)
       at dmiles.transform.sublisp.JVMImpl.main(ccBTxcajjx:0)
    java.lang.Error: might return?
       at dmiles.transform.sublisp.JVMImpl.returnThrowable(ccBTxcajjx:0)
       at dmiles.transform.sublisp.JVMImpl.main(ccBTxcajjx:0)
    Result is 0  java.io.IOException: undeclared can return?
       at dmiles.transform.sublisp.JVMImpl.returnUndeclaredIOExcetion(ccBTxcajjx:0)
       at dmiles.transform.sublisp.JVMImpl.main(ccBTxcajjx:0)
    Result is 0Exception in thread "main" java.io.IOException: Reuslts are 0
       at dmiles.transform.sublisp.JVMImpl.main(ccBTxcajjx:0)

    Administrator@LOTUS /cyc/top/external/Translation-Runtime$

    */

    //    public static RuntimeException doThrow(final RuntimeException throwable, final Object nullOrOneDeclaredThowableOrArrayOfDeclaredThrowables) throws RuntimeException {
    //        return throwable;
    //    }
    public static int getMethodNumber(final Class clazz, final String s) {
        return -1;

    }

    public static Object getStaticFieldValue(String clazz, String fieldName, Class type) {
        try {
            return (Object) Class.forName(clazz).getField(fieldName).get(null);
        } catch (final IllegalArgumentException e) {
            e.printStackTrace();
        } catch (final SecurityException e) {
            e.printStackTrace();
        } catch (final IllegalAccessException e) {
            e.printStackTrace();
        } catch (final NoSuchFieldException e) {
            e.printStackTrace();
        } catch (final ClassNotFoundException e) {
            e.printStackTrace();
        }
        // TODO Auto-generated method stub
        return null;
    }

    public static Thrower getThrower() {
    	return new Thrower() {
			
			@Override
			public RuntimeException doThrow(Throwable throwable) throws Error {
				sneakyThrow(throwable);
				return (RuntimeException) throwable;
			}
		}; 
    }
    /**
     * @return
     */
    public static Thrower getThrowerOld() {
        if (JVMImpl.thrower == null) {
            if (JVMImpl.throwerClass == null) {
                if (JVMImpl.throwerloader == null) JVMImpl.throwerloader = new ThrowerLoader();
                if (JVMImpl.throwerClass == null) try {
                    JVMImpl.throwerClass = JVMImpl.throwerloader.loadClass(JVMImpl.THROWERNAME, true);
                } catch (final ClassNotFoundException e) {

                    e.printStackTrace();
                }
            }
            if (JVMImpl.thrower == null) try {
                JVMImpl.thrower = (Thrower) JVMImpl.throwerClass.newInstance();
            } catch (final InstantiationException e) {

                e.printStackTrace();
            } catch (final IllegalAccessException e) {

                e.printStackTrace();
            }

            if (JVMImpl.thrower == null) try {
                JVMImpl.thrower = (Thrower) JVMImpl.throwerClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (final IllegalArgumentException e) {

                e.printStackTrace();
            } catch (final SecurityException e) {

                e.printStackTrace();
            } catch (final InstantiationException e) {

                e.printStackTrace();
            } catch (final IllegalAccessException e) {

                e.printStackTrace();
            } catch (final InvocationTargetException e) {

                e.printStackTrace();
            } catch (final NoSuchMethodException e) {

                e.printStackTrace();
            }
        }
        return JVMImpl.thrower;
    }

    static public void main(String[] i) {
        int result = 0;
        try {
            JVMImpl.throwDeclaredIOExcetion();
        } catch (final IOException e) {
            e.printStackTrace();
        }
        try {
            JVMImpl.throwUndeclaredIOExcetion();
        } catch (final Exception e) {
            e.printStackTrace();
        }
        try {
            result = JVMImpl.returnThrowable();
        } catch (final Throwable e) {
            e.printStackTrace();
        } finally {
            System.err.print("Result is " + result + "  ");
        }
        try {
            result = JVMImpl.returnUndeclaredIOExcetion();
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            System.err.print("Result is " + result + "  ");
        }
        JVMImpl.doThrow(new IOException("Reuslts are " + result + "  "));
    }

    static public int returnThrowable() throws Throwable {
        JVMImpl.doThrow(new Error("might return?"));
        return 666;
    }

    static public int returnUndeclaredIOExcetion() {
        JVMImpl.doThrow(new IOException("undeclared can return?"));
        return -666;
    }

    static public int throwDeclaredIOExcetion() throws IOException {
        throw JVMImpl.doThrow(new IOException("declared!"));
    }

    static public int throwUndeclaredIOExcetion() {
        throw JVMImpl.doThrow(new IOException("good catch!"));
    }

    /**
     *
     */
    public JVMImpl(Class clazz, Object thizClazzDefault) {
        // TODO Auto-generated constructor stub
    }

    public JVMImpl(Object thizClazzDefault) {
        // TODO Auto-generated constructor stub
    }

    public boolean[] CallBooleanArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public boolean CallBooleanMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public byte[] CallByteArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public byte CallByteMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public char[] CallCharArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public char CallCharMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public Class CallClassMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public double[] CallDoubleArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public double CallDoubleMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public float CallFloatMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public int[] CallIntArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public int CallIntMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public long[] CallLongArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public long CallLongMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public Object[] CallObjectArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public Object CallObjectMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public short[] CallShortArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public short CallShortMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public boolean[] CallStaticBooleanArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public boolean CallStaticBooleanMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public byte[] CallStaticByteArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public byte CallStaticByteMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public char[] CallStaticCharArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public char CallStaticCharMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public Class CallStaticClassMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public double[] CallStaticDoubleArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public double CallStaticDoubleMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public float CallStaticFloatMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public int[] CallStaticIntArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public int CallStaticIntMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public long[] CallStaticLongArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public long CallStaticLongMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public Object[] CallStaticObjectArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public Object CallStaticObjectMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public short[] CallStaticShortArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public short CallStaticShortMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public String CallStaticStringMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {

            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public void CallStaticVoidMethod(Class clazz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public String CallStringMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {

            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }

    public void CallVoidMethod(Object thiz, int methodint, Object[] args) throws Throwable {
        switch (methodint) {
            default:
                throw new NoSuchMethodError(" method number was " + methodint + " ");
        }
    }
/*
    // SubLFiles.declareFunction(me, "sxhash_rot", "SXHASH-ROT", 2, 0, false);
    abstract int findCallSubLMethod(String me, String javaMethodName, String lispSymbolName, int minArgs, int optionalArgs, boolean usesRest);

    public abstract String[] getFieldNames();

    public abstract String[] getMethodsNames();

    public abstract boolean isInstance(Object object);
    */

}
