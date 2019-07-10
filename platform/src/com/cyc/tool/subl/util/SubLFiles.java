//
// For LarKC
//
package com.cyc.tool.subl.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Supplier;

import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ResumeException;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLCompiledFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLFiles {
  public static boolean DO_STATIC_CL_INIT = true;

  public abstract static class VariableAccessMode {
    public static final VariableAccessMode CONSTANT = new VariableAccessMode("CONSTANT") {
      @Override
      public SubLSymbol toSymbol() {
        return CommonSymbols.CONSTANT;
      }
    };
    public static final VariableAccessMode LEXICAL = new VariableAccessMode("LEXICAL") {
      @Override
      public SubLSymbol toSymbol() {
        return CommonSymbols.LEXICAL;
      }
    };
    public static final VariableAccessMode DYNAMIC = new VariableAccessMode("DYNAMIC") {
      @Override
      public SubLSymbol toSymbol() {
        return CommonSymbols.DYNAMIC;
      }
    };
    public static final VariableAccessMode UNDECLARED = new VariableAccessMode("UNDECLARED") {
      @Override
      public SubLSymbol toSymbol() {
        return CommonSymbols.UNDECLARED;
      }
    };
    /* Global */
    public static final VariableAccessMode GLOBAL_TOP_LEVEL = new VariableAccessMode("GLOBAL-TOP-LEVEL") {
      @Override
      public SubLSymbol toSymbol() {
        return Keyword.TOP_LEVEL;
      }
    };
    /* Process Local */
    public static final VariableAccessMode PROCESS_LOCAL = new VariableAccessMode("PROCESS-LOCAL") {
      @Override
      public SubLSymbol toSymbol() {
        return Keyword.TOP_LEVEL;
      }
    };
    /* Process Local/Iherited from parent */
    public static final VariableAccessMode INHERITED_ENV = new VariableAccessMode("INHERITED-ENV") {
      @Override
      public SubLSymbol toSymbol() {
        return Keyword.INHERITED;
      }
    };
    private final String toStr;

    public VariableAccessMode(String string) {
      toStr = string;
    }

    @Override
    public String toString() {
      if (toStr != null)
        return toStr;
      return toSymbol().princToString();
    }

    public abstract SubLSymbol toSymbol();
  }

  //// Public Area
  public static List<String> skippedClasses = new ArrayList<String>();
  static {
    skippedClasses.add("com.cyc.cycjava.cycl.kbi_.*");
  }

  public static List<String> notAgain = new ArrayList<String>();
  public static List<String> shouldOverride = new ArrayList<String>();

  public static void declareFunction(String className, String methodName, String functionName, int requiredArgCount, int optionalArgCount, boolean allowsRest) {
    declareFunction(null, className, methodName, functionName, requiredArgCount, optionalArgCount, allowsRest);
  }

  /**
   * implicitly dependent on the current package, @todo extend to support
   * non-sublisp functions. We need this helper function to be non-static so that
   * we can access this.getClass() without having to pass it as an argument
   */
  public static void declareFunction(SubLFile file, String methodName, String functionName, int requiredArgCount, int optionalArgCount, boolean allowsRest) {
    declareFunction(file.getClass(), null, methodName, functionName, requiredArgCount, optionalArgCount, allowsRest);
  }

  public static void declareFunction(Class file, String className, String methodName, String functionName, int requiredArgCount, int optionalArgCount, boolean allowsRest) {
    final boolean neverRedefine = SubLMain.Never_REDEFINE;
    try {
      List<Class> parameterTypes = new ArrayList<Class>();
      for (int i = 0; i < requiredArgCount + optionalArgCount; i++)
        parameterTypes.add(SubLObject.class);
      if (allowsRest)
        parameterTypes.add(SubLObject[].class);
      Class[] parameterArray = parameterTypes.toArray(new Class[parameterTypes.size()]);
      Method meth = null;

      if (file != null) {
        meth = file.getMethod(methodName, parameterArray);
      }

      SubLPackage currentPackage = Packages.$package$.getDynamicValue().toPackage();
      SubLSymbol found = null;
      SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);

      SubLFunction previous = null;
      if (functionSymbol.fboundp()) {
        if (false)
          return;
        previous = functionSymbol.getFunc();
        if (parameterArray.length <= previous.applyArity() + (previous.allowsRest() ? 1 : 0)) {
          Errors.warn("Attempt to redefine: " + functionSymbol);
          return;
        }
        found = functionSymbol;
        final SubLPackage package1 = found.getPackage();
        if (currentPackage == Lisp.PACKAGE_CYC || currentPackage == Lisp.PACKAGE_SUBLISP) {
          if (package1 != Lisp.PACKAGE_SUBLISP && package1 != Lisp.PACKAGE_CYC) {
            currentPackage.unintern(found);
            functionSymbol = currentPackage.findAccessibleSymbol(functionName);
            if (functionSymbol == null)
              functionSymbol = Lisp.PACKAGE_SUBLISP.findAccessibleSymbol(functionName);
            if (functionSymbol == null)
              functionSymbol = Lisp.PACKAGE_CYC.findAccessibleSymbol(functionName);
            if (functionSymbol == null) {
              functionSymbol = currentPackage.internAndExport(functionName);
            }
            if (meth == null) {
              SubLObjectFactory.makeCompiledFunction(className, methodName, parameterArray, SubLObject.class, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
            } else {
              SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
            }
            Errors.warn("Defining " + functionSymbol + " not using " + found);
            return;
          }
        }
        if (neverRedefine) {
          Errors.warn("NEVER Redefining " + functionSymbol);
          return;
        }
      }
      // SubLFunction func =
      if (meth == null) {
        SubLObjectFactory.makeCompiledFunction(className, methodName, parameterArray, SubLObject.class, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
      } else {
        SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
      }
    } catch (Exception e) {
      Errors.cerror("Continue.", "Error while declaring function: " + functionName, e);
    }
  }

  private static SubLSymbol declareSymbol(Object variableName, SubLObject initialValue, VariableAccessMode accessMode, boolean isReinitialized) {
    final SubLPackage dynamicValue = (SubLPackage) Packages.$package$.getDynamicValue();
    return declareSymbol(variableName, initialValue, accessMode, isReinitialized, dynamicValue);
  }

  private static SubLSymbol declareSymbol(Object variableName, SubLObject initialValue, VariableAccessMode accessMode, boolean isReinitialized, SubLPackage thePackage) {
    try {
      SubLSymbol symbol = asSymbol(variableName, thePackage.toPackage());
      symbol.setAccessMode(accessMode);
      if (!symbol.boundp())
        symbol.forceGlobalValue(initialValue);
      else {
        if (isReinitialized) { // make a discesion about some things
          symbol.forceGlobalValue(initialValue);
        }
      }
      // perform symbol annotation -- for initialization type
      SubLSymbol initializationType = isReinitialized ? CommonSymbols.INITIALIZER : CommonSymbols.WORLD;
      symbol.setProperty(CommonSymbols.INITIALIZATION_TYPE, initializationType);
      // symbol annotation -- for binding type
      symbol.setProperty(CommonSymbols.BINDING_TYPE, accessMode.toSymbol());
      synchronized (SubLFiles.symbolInitializationOrder) {
        SubLFiles.symbolInitializationOrder.add(symbol);
      }
      return symbol;
    } catch (Exception e) {
      Errors.cerror("Continue.", "Error while declaring global: " + variableName, e);
    }
    return null;
  }

  public static LispObject findKeyword(int start, LispObject args[], Symbol kw, Supplier<LispObject> otherwise) {
    for (int i = start; i < args.length; i++) {
      if (args[i].equal(kw)) {
        return args[i + 1];
      }
    }
    return otherwise.get();
  }

  private static SubLSymbol asSymbol(Object variableName, SubLPackage package1) {
    if (variableName instanceof SubLSymbol)
      return (SubLSymbol) variableName;
    if (variableName instanceof SubLObject) {
      variableName = ((SubLObject) variableName).princToString();
    }
    final String string = variableName.toString();
    return SubLObjectFactory.makeSymbol(string, package1);
  }

  public static void declareMacro(String className, String methodName, String functionName) {
    try {
      Class[] parameterArray = { SubLObject.class, SubLObject.class };
      SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
      SubLCompiledFunction macroExpander = SubLObjectFactory.makeCompiledFunction(className, methodName, parameterArray, SubLObject.class, functionSymbol, 2, 0, false);
      SubLMacro macro = SubLObjectFactory.makeMacro(macroExpander);
      functionSymbol.setFunction(macro);
    } catch (Exception e) {
      Errors.cerror("Continue.", "Error while declaring macro: " + functionName, e);
    }
  }

  public static void declareMacro(SubLFile file, String methodName, String functionName) {
    try {
      Class[] parameterArray = { SubLObject.class, SubLObject.class };
      Method meth = file.getClass().getMethod(methodName, parameterArray);
      SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
      SubLCompiledFunction macroExpander = SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, 2, 0, false);
      SubLMacro macro = SubLObjectFactory.makeMacro(macroExpander);
      functionSymbol.setFunction(macro);
    } catch (Exception e) {
      Errors.cerror("Continue.", "Error while declaring macro: " + functionName, e);
    }
  }

  public static SubLSymbol defconstant(String variableName, SubLObject initialValue) {
    /* SubL defconstant : constant lexical global */
    return declareSymbol(variableName, initialValue, VariableAccessMode.CONSTANT, true);
  }

  public static SubLSymbol defconstant(Object variableName, SubLObject initialValue) {
    /* SubL defconstant : constant lexical global */
    return declareSymbol(variableName, initialValue, VariableAccessMode.CONSTANT, true);
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol defconstant(SubLFile file, Object variableName, SubLObject initialValue) {
    /* SubL defconstant : constant lexical global */
    return declareSymbol(variableName, initialValue, VariableAccessMode.CONSTANT, true);
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol defconstant(SubLFile file, Object variableName, SubLObject initialValue, SubLPackage thePackage) {
    /* SubL defconstant : constant lexical global */
    return declareSymbol(variableName, initialValue, VariableAccessMode.CONSTANT, true, thePackage);
  }

  public static SubLSymbol defglobal(Object variableName, SubLObject initialValue) {
    /*
     * SubL defglobal : mutable lexical global, not re-initialized on re-evaluation
     */
    return declareSymbol(variableName, initialValue, VariableAccessMode.LEXICAL, false);
  }

  public static SubLSymbol defglobal(String variableName, SubLObject initialValue) {
    /*
     * SubL defglobal : mutable lexical global, not re-initialized on re-evaluation
     */
    return declareSymbol(variableName, initialValue, VariableAccessMode.LEXICAL, false);
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol defglobal(SubLFile file, Object variableName, SubLObject initialValue) {
    /*
     * SubL defglobal : mutable lexical global, not re-initialized on re-evaluation
     */
    return declareSymbol(variableName, initialValue, VariableAccessMode.LEXICAL, false);
  }

  public static SubLSymbol defglobal(SubLFile file, Object variableName, SubLObject initialValue, SubLPackage thePackage) {
    /*
     * SubL defglobal : mutable lexical global, not re-initialized on re-evaluation
     */
    return declareSymbol(variableName, initialValue, VariableAccessMode.LEXICAL, false, thePackage);
  }

  public static SubLSymbol deflexical(Object variableName, SubLObject initialValue) {
    /* SubL deflexical : mutable lexical global */
    return declareSymbol(variableName, initialValue, VariableAccessMode.LEXICAL, false);
  }

  public static SubLSymbol deflexical(String variableName, SubLObject initialValue) {
    /*
     * SubL defglobal : mutable lexical global, not re-initialized on re-evaluation
     */
    return declareSymbol(variableName, initialValue, VariableAccessMode.LEXICAL, false);
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol deflexical(SubLFile file, Object variableName, SubLObject initialValue) {
    /* SubL deflexical : mutable lexical global */
    return declareSymbol(variableName, initialValue, VariableAccessMode.LEXICAL, true);
  }

  public static SubLSymbol deflexical(SubLFile file, Object variableName, SubLObject initialValue, SubLPackage thePackage) {
    /* SubL deflexical : mutable lexical global */
    return declareSymbol(variableName, initialValue, VariableAccessMode.LEXICAL, true, thePackage);
  }

  public static SubLSymbol defparameter(String variableName, SubLObject initialValue) {
    /* SubL defparameter : mutable dynamic global */
    return declareSymbol(variableName, initialValue, VariableAccessMode.DYNAMIC, true);
  }

  public static SubLSymbol defparameter(Object variableName, SubLObject initialValue) {
    /* SubL defparameter : mutable dynamic global */
    return declareSymbol(variableName, initialValue, VariableAccessMode.DYNAMIC, true);
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol defparameter(SubLFile file, Object variableName, SubLObject initialValue) {
    /* SubL defparameter : mutable dynamic global */
    return declareSymbol(variableName, initialValue, VariableAccessMode.DYNAMIC, true);
  }

  public static SubLSymbol defparameter(SubLFile file, Object variableName, SubLObject initialValue, SubLPackage thePackage) {
    /* SubL defparameter : mutable dynamic global */
    return declareSymbol(variableName, initialValue, VariableAccessMode.DYNAMIC, true, thePackage);
  }

  public static SubLSymbol defvar(String variableName, SubLObject initialValue) {
    /*
     * SubL defvar : mutable dynamic global, not re-initialized on re-evaluation
     */
    return declareSymbol(variableName, initialValue, VariableAccessMode.DYNAMIC, false);
  }

  /**
   * TODO Describe the purpose of this method.
   * 
   * @param string
   * @param nil
   * @return
   */
  public static SubLSymbol defvarCheckCL(String string, SubLObject v) {
    Symbol s = null;
    SubLPackage pack = SubLPackage.getCurrentPackage();
    s = pack.findAccessibleSymbol(string);
    if (s == null) {
      final Package packageCl = Lisp.PACKAGE_CL;
      s = packageCl.findAccessibleSymbol(string);
      if (s != null) {
        if (packageCl != pack) {
          pack.importSymbol(s);
        }
        if (!s.boundp()) {
          defvar(s, v);
        }
        return s;
      }
    }
    return defvar(string, v);
  }

  public static SubLSymbol defvar(Object variableName, SubLObject initialValue) {
    /*
     * SubL defvar : mutable dynamic global, not re-initialized on re-evaluation
     */
    return declareSymbol(variableName, initialValue, VariableAccessMode.DYNAMIC, false);
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol defvar(SubLFile file, Object variableName, SubLObject initialValue) {
    /*
     * SubL defvar : mutable dynamic global, not re-initialized on re-evaluation
     */
    return declareSymbol(variableName, initialValue, VariableAccessMode.DYNAMIC, false);
  }

  public static SubLSymbol defProcessVar(SubLFile file, Object variableName, SubLObject initialValue) {
    /*
     * SubL defvar : mutable dynamic global, not re-initialized on re-evaluation
     */
    return declareSymbol(variableName, initialValue, VariableAccessMode.DYNAMIC, false).toLispObject().setProcessScope(true);
  }

  public static SubLSymbol defvar(SubLFile file, Object variableName, SubLObject initialValue, SubLPackage thePackage) {
    /*
     * SubL defvar : mutable dynamic global, not re-initialized on re-evaluation
     */
    return declareSymbol(variableName, initialValue, VariableAccessMode.DYNAMIC, false, thePackage);
  }

  public static void handleThrowable() {
  }

  public static void initialize(String className) {
    if (skippedClasses.contains(className)) {
      return;
    }

    if (baseCheck != null) {
      if (isClassStem(className)) {
        className = baseCheck + "." + className;
      }
    }

    for (String sc : skippedClasses) {
      if (className.matches(sc)) {
        skippedClasses.add(className);
        return;
      }
    }

    org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();

    boolean removeAgain = true;

    if (baseCheck == null) {
      if (notAgain.contains(className)) {
        return;
      } else {
        notAgain.add(className);
      }
    }

    try {
      if (p != Lisp.PACKAGE_SUBLISP && p != Lisp.PACKAGE_CYC)
        SubLPackage.setCurrentPackage("CYC");
      try {
        final ClassLoader pATCH_FILE_LOADER = PatchFileLoader.PATCH_FILE_LOADER;
        Class clazz = null;
        try {
          if (clazz == null)
            clazz = pATCH_FILE_LOADER.loadClass(className);
        } catch (ClassNotFoundException e) {
          // try for inner
          String cl2className = className.replace(".cycjava_2.", ".cycjava.");
          if (!cl2className.equals(className))
            clazz = pATCH_FILE_LOADER.loadClass(cl2className);
        }
        notAgain.add(clazz.getName());

       // ClassLoader loader = clazz.getClassLoader();

        Field meField = null;
        try {
          meField = clazz.getDeclaredField("me");
        } catch (java.lang.NoSuchFieldException e) {
          meField = clazz.getField("me");
        }
        if (meField == null)
          throw new RuntimeException("Bad SubLFile: " + className);
        meField.setAccessible(true);
        SubLFile file = (SubLFile) meField.get(null);
        if (file == null) {
          file = (SubLFile) clazz.newInstance();
        }
        initialize(file);
        removeAgain = false;
      } catch (Throwable e) {
        e.printStackTrace();
        Errors.cerror("Continue.", "Error initializing SubL file: " + className, e);
      }
    } finally {
      if (removeAgain)
        notAgain.remove(className);
      SubLPackage.setCurrentPackage(p);
    }
  }

  /**
   * TODO Describe the purpose of this method.
   * @param className
   * @return
   */
  private static boolean isClassStem(String className) {
    return !className.contains("cycjava");
  }

  public static void initialize(Class clazz) {
    org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();
    final String className = clazz.getName();
    try {
      if (p != Lisp.PACKAGE_SUBLISP && p != Lisp.PACKAGE_CYC)
        SubLPackage.setCurrentPackage("CYC");
      try {
        ClassLoader loader = clazz.getClassLoader();
        Field meField = clazz.getDeclaredField("me");
        if (meField == null)
          throw new RuntimeException("Bad SubLFile: " + className);
        SubLFile file = (SubLFile) meField.get(null);
        initialize(file);
      } catch (Throwable e) {
        e.printStackTrace();
        Errors.cerror("Continue.", "Error initializing SubL file: " + className, e);
      }
    } finally {
      SubLPackage.setCurrentPackage(p);
    }
  }

  public static void initialize(SubLFile file) {
    org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();
    try {
      file.declareFunctions();
      file.initializeVariables();
      initializeFns();
      file.runTopLevelForms();
    } catch (Throwable e) {
      e.printStackTrace();
      try {
        Errors.cerror("Continue.", "Error initializing SubL file: " + file.getClass().getName(), e);
      } catch (ResumeException re) {
      }
    } finally {
      SubLPackage.setCurrentPackage(p);
    }
  }

  /**
   *
   */
  private static void initializeFns() {
    for (Iterator iterator = functionMap.keySet().iterator(); iterator.hasNext();) {
      String string = (String) iterator.next();
      createFunction(string, functionMap.get(string));
    }
  }

  /**
   * @param string
   * @param integer
   */
  public static void createFunction(String string, Integer integer) {
    // com.cyc.cycjava.cycl.module0004.$f106$UnaryFunction.class.toString();
    String classname = string;
    switch (integer) {
      case 1:
        classname += "$UnaryFunction";
        break;
      case 0:
        classname += "$ZeroArityFunction";
        break;
      case 2:
        classname += "$BinaryFunction";
        break;
      default:
        // TODO Auto-generated method stub
        if (true)
          throw new AbstractMethodError("SubLFiles.createFunction");
        break;
    }
    try {
      Class c = Class.forName(classname);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      if (true)
        throw new AbstractMethodError("SubLFiles.createFunction throw ClassNotFoundException");
    }
  }

  public static List<SubLSymbol> symbolInitializationOrder() {
    List<SubLSymbol> symbols = new ArrayList<SubLSymbol>();
    synchronized (symbolInitializationOrder) {
      symbols.addAll(symbolInitializationOrder);
    }
    return symbols;
  }

  private static LinkedHashSet<SubLSymbol> symbolInitializationOrder;
  public static HashMap<String, Integer> functionMap = new HashMap();
  public static String baseCheck = null;
  static {
    symbolInitializationOrder = new LinkedHashSet<SubLSymbol>();
  }

  /**
   * @param string
   */
  public static void declareOverridable(String string) {
    shouldOverride.add(string);
  }

  /**
   * TODO Describe the purpose of this method.
   * @param b
   */
  public static void setBase(String b) {
    baseCheck = b;

  }

}
