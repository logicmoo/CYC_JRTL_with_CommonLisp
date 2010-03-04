/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.nativeCode.type.operator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import java.lang.reflect.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.Unhandleable;
import com.cyc.tool.subl.util.PatchFileLoader;
import java.util.ArrayList;
import java.util.Arrays;

public  final class SubLCompiledFunction extends AbstractSubLFunction implements SubLFunction {
  
  //// Constructors
  
  SubLCompiledFunction(Method method, SubLSymbol functionSymbol, int requiredArgCount,
          int optionalArgCount, boolean allowsRest) {
    super(functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
    if (method == null) {
      Errors.error("Got null native method for: " + functionSymbol);
    }
    setMethod(method);
    functionSymbol.setFunction(this);
  }
  
  SubLCompiledFunction(String methodClassStr, String methodName,
          Class[] methodParameters, Class returnType, SubLSymbol functionSymbol, int requiredArgCount,
          int optionalArgCount, boolean allowsRest) {
    super(functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
    this.methodClassStr = methodClassStr;
    this.methodName = methodName;
    this.methodParameters = methodParameters;
    this.returnType = returnType;
    functionSymbol.setFunction(this);
  }
  
  //// Public Area
  
  public Method getMethod() {
    if (method == null) {
      try {
        method =  PatchFileLoader.PATCH_FILE_LOADER.loadClass(methodClassStr, true).getMethod(methodName, methodParameters);
      } catch (Exception e) {
        Errors.error("Problem initializing function: " + methodClassStr + "." + methodName);
      }
    }
    return method;
  }
  
  public int applyArity() {
    return getRequiredArgCount() + getOptionalArgCount();
  }
  
  public final boolean isInterpreted() { return false; }
  
  public final SubLObject apply(Object[] args) {
    if (SHOULD_MAINTAIN_FUNCALL_COUNTS) {
      int arity = 0;
      for (int i = 0, size = args.length; i < size; i++) {
        if (args[i] != CommonSymbols.UNPROVIDED) {
          if (args[i] instanceof SubLObject[]) {
            arity += ((SubLObject[])args[i]).length;
          } else {
            arity++;
          }
        }
      }
      funcallCounts.incCount(arity);
    }
    SubLObject result = null;
    try {
      if (USE_DIRECT_CALLING_MECHANISM) {
        Errors.unimplementedMethod("Direct funcalls not currently implemented.");
        // @todo potential future optimization -- not needed atm because of better optimization elsewhere
        //result = makeInstance().invoke(args);
      } else {
        result = (SubLObject)getMethod().invoke(null, args);
      }
      return Values.setFirstMultipleValue(result);
    } catch (InvocationTargetException ite) {
      Throwable e = USE_DIRECT_CALLING_MECHANISM ? ite : ite.getCause();
      if (e instanceof Unhandleable) {
        throw (Unhandleable)e;
      }
      if (e instanceof CatchableThrow) {
        throw (CatchableThrow)e;
      }
      if (e instanceof Error) {
        //e.printStackTrace();
        throw (Error)e;
      }
      Errors.error("Error calling " + methodName + ".", e);
    } catch (Throwable e) {
      if (e instanceof Unhandleable) {
        throw (Unhandleable)e;
      }
      if (e instanceof CatchableThrow) {
        throw (CatchableThrow)e;
      }
      if (e instanceof Error) {
        //e.printStackTrace();
        throw (Error)e;
      }
      Errors.error("Error calling " + methodName + ".", e);
    }
      return NIL; // should never get here
  }
  
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return getMethod().hashCode();
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  
  public static String FUNCTION_TYPE_NAME = "FUNCTION";
  
  public String toTypeName() {
    return FUNCTION_TYPE_NAME;
  }
  
  public SubLList getArglist() {
    SubLList existing = arglist;
    if (existing != null) {
      return existing;
    } else {
      int required = getRequiredArgCount();
      int optional = getOptionalArgCount();
      boolean rest = allowsRest();
      int size = required + (optional > 0 ? (optional + 1) : 0) + (rest ? 2 : 0);
      SubLList arglist = SubLObjectFactory.makeList(size, NIL); // variable shadowing
      SubLObject current = arglist;
      int i;
      SubLPackage sublispPackage = SubLPackage.findPackageNamed("SUBLISP");
      for (i = 0; i < required; i++, current = current.rest()) {
        SubLSymbol sym = SubLObjectFactory.makeSymbol("REQ-" + i, sublispPackage);
        current.setFirst(sym);
      }
      if (optional > 0) {
        current.setFirst(OPTIONAL_SYMBOL);
        current = current.rest();
        for (; i < required + optional; i++, current = current.rest()) {
          SubLSymbol sym = SubLObjectFactory.makeSymbol("OPT-" + i, sublispPackage);
          current.setFirst(sym);
        }
      }
      if (rest) {
        current.setFirst(REST_SYMBOL);
        current = current.rest();
        SubLSymbol sym = SubLObjectFactory.makeSymbol("REST-LIST", sublispPackage);
        current.setFirst(sym);
      }
      return arglist;
    }    
  }
  
  public final boolean isSpecial() { return false; }
    
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return false; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return false; }
  public final boolean isFunction() { return true; }
  public final boolean isFunctionSpec() { return true; }
  public final boolean isMacroOperator() { return false; }
  public final boolean isHashtable() { return false; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  //// Protected Area
  
  //// Private Area
  
  private void setMethod(Method method) {
    if (method == null) {
      Errors.error("Got null native method for: " + this);
    }
    this.methodClassStr = method.getDeclaringClass().getName();
    this.methodName = method.getName();
    this.methodParameters = method.getParameterTypes();
    this.returnType = method.getReturnType();
  }
  
  /* @todo potential future optimization -- not needed atm because of better optimization elsewhere
  private synchronized GenMethod makeInstance() {
       if (staticMethodInstance == null) {
           SingleMethodClass mc = new SingleMethodClass();
           try {
               staticMethodInstance = mc.genGenMethod();
           } catch (Exception e) {
               Errors.error("Problem initializing function: " + this.methodClassStr + "." + this.methodName, e);
           } catch (Throwable t) {
               t.printStackTrace();
               Errors.error("Problem initializing function: " + this.methodClassStr + "." + this.methodName, new SubLException(t));
           }
       }
       return staticMethodInstance;
   } 
  
  public interface GenMethod {

    SubLObject invoke(Object[] args);// throws InvocationTargetException;
  }

  public byte[] byteCode() {

    ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_FRAMES);
    MethodVisitor mv;

    cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, "com/cyc/tool/subl/jrtl/nativeCode/type/operator/GenMethod$" + serial, null, "java/lang/Object",
        new String[]{"com/cyc/tool/subl/jrtl/nativeCode/type/operator/SubLCompiledFunction$GenMethod"});

    cw.visitSource("SubLCompiledFunction_gen.java", null);

    cw.visitInnerClass("com/cyc/tool/subl/jrtl/nativeCode/type/operator/SubLCompiledFunction$GenMethod",
        "com/cyc/tool/subl/jrtl/nativeCode/type/operator/SubLCompiledFunction", "GenMethod", ACC_PUBLIC + ACC_STATIC + ACC_ABSTRACT + ACC_INTERFACE);
    {
      mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
      mv.visitCode();
      mv.visitVarInsn(ALOAD, 0);
      mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
      mv.visitInsn(RETURN);
      mv.visitMaxs(1, 1);
      mv.visitEnd();
    }
    /// Class[] ptypes = methodParameters;// method.getParameterTypes();
    {
      mv = cw.visitMethod(ACC_PUBLIC, "invoke", "([Ljava/lang/Object;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;", null, null);
      mv.visitCode();
      Type[] ptypes = new Type[SubLCompiledFunction.this.methodParameters == null ? 0 : SubLCompiledFunction.this.methodParameters.length];
      for (int i = 0; i < ptypes.length; i++) {
        ptypes[i] = Type.getType(methodParameters[i]);
        mv.visitVarInsn(ALOAD, 1);
        switch (i) {
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
            mv.visitIntInsn(BIPUSH, i);
        }
        mv.visitInsn(AALOAD);
        mv.visitTypeInsn(CHECKCAST, Type.getInternalName(methodParameters[i]));
      }
      mv.visitMethodInsn(INVOKESTATIC, methodClassStr.replace(".", "/"), 
          methodName, Type.getMethodDescriptor(Type.getType(returnType), ptypes));
      mv.visitInsn(ARETURN);
      mv.visitMaxs(ptypes.length + 2, 2);
      mv.visitEnd();
    }
    cw.visitEnd();
    return cw.toByteArray();
  }

  public Object coerce(Class t) {
    if (t.isInstance(this)) {
      return this;
    }
    if (CharSequence.class.isAssignableFrom(t)) {
      return "(" + getFunctionSymbol() + " " + this.getArglist() + ")";
    // if (Number.class.isAssignableFrom(t)) return t.cast(this.hashCode());
    }
    return this;//.getMethod();
  }

  private class SingleMethodClass extends ClassLoader {

    public GenMethod genGenMethod() throws InstantiationException, IllegalAccessException {
      final byte[] data = byteCode();
      Class<GenMethod> mgenClass;
      mgenClass = (Class<GenMethod>) this.defineClass(data, 0, data.length);
      this.resolveClass(mgenClass);
      staticMethodInstance = mgenClass.newInstance();
      return staticMethodInstance;
    }

    public synchronized Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
      Class c = (Class) classLoaderCache.get(name);
      if (c == null) {
        c = this.findSystemClass(name);
        classLoaderCache.put(name, c);
      }
      if (resolve) {
        this.resolveClass(c);
      }
      return c; // *;//
    }
  }
  */
  
  //// Internal Rep
  
  private Method method;
  private Class methodClass;
  private Class returnType;
  private String methodClassStr;
  private String methodName;
  private Class[] methodParameters;
  private SubLList arglist = null;
  public static final boolean SHOULD_MAINTAIN_FUNCALL_COUNTS = true;
  public static final int MAX_ARITY_TO_MAINTAIN_COUNTS_FOR = 50;
  public static final int MIN_FUNCALL_COUNTS_TO_CARE_ABOUT = 100;
  public final class FuncallCounts {
    public int counts[] = new int[MAX_ARITY_TO_MAINTAIN_COUNTS_FOR + 1];
    FuncallCounts() {
      Arrays.fill(counts, 0);
      funcallCountsArray.add(this);
    }
    public String getMethodName() {
      return method.getName();
    }
    synchronized void incCount(int arity) {
      if (arity > MAX_ARITY_TO_MAINTAIN_COUNTS_FOR) {
        return;
      }
      counts[arity]++;
    }
  }
  public volatile FuncallCounts funcallCounts = SHOULD_MAINTAIN_FUNCALL_COUNTS ? new FuncallCounts() : null;
  public static final ArrayList<FuncallCounts> funcallCountsArray = SHOULD_MAINTAIN_FUNCALL_COUNTS ? new ArrayList<FuncallCounts>() : null;
  
  public static final boolean USE_DIRECT_CALLING_MECHANISM = false;
    
  /* @todo potential future optimization -- not needed atm because of better optimization elsewhere
  private static int serial = 0;
  private static final Map classLoaderCache = new HashMap();
  private GenMethod staticMethodInstance;
  */

}
