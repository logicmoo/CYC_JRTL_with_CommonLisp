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

package  com.cyc.tool.subl.util;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import java.util.*;
import java.lang.reflect.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLCompiledFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

public  class SubLFiles {
  
  //// Constructors
  
  /** Everything in here should be static */
  private SubLFiles() {
  }
  
  //// Public Area
  
  /**
   * Calls declareFunctions(), initializeVariables(), and runTopLevelForms() in order.
   * Used for all translated files and sporadically used for some handwritten files.
   */
  public static void initialize(SubLFile file) {
    try {
      file.declareFunctions();
      file.initializeVariables();
      file.runTopLevelForms();
    } catch (Exception e) {
      Errors.cerror("Continue.", "Error initializing SubL file: "
        + file.getClass().getName(), e);
    }
  }
  
  public static void initialize(String className) {
    try {
      Class clazz = PatchFileLoader.PATCH_FILE_LOADER.loadClass(className, true);
      ClassLoader loader = clazz.getClassLoader();
      Field meField = clazz.getDeclaredField("me");
      if (meField == null) {
        throw new RuntimeException("Bad SubLFile: " + className);
      }
      SubLFile file = (SubLFile)meField.get(null);
      file.declareFunctions();
      file.initializeVariables();
      file.runTopLevelForms();
    } catch (Exception e) {
      e.printStackTrace();
      Errors.cerror("Continue.", "Error initializing SubL file: " + className, e);
    }
  }
  
  /** implicitly dependent on the current package, @todo extend to support non-sublisp functions.
   * We need this helper function to be non-static so that we can access this.getClass()
   * without having to pass it as an argument
   */
  public static final void declareFunction(SubLFile file, String methodName, 
      String functionName, int requiredArgCount, int optionalArgCount, boolean allowsRest) {
    try {
      List<Class> parameterTypes = new ArrayList<Class>();
      for (int i = 0; i < requiredArgCount + optionalArgCount; i++) {
        parameterTypes.add(SubLObject.class);
      }
      if (allowsRest) {
        parameterTypes.add(SubLObject[].class);
      }
      Class[] parameterArray = (Class[])parameterTypes.
        toArray(new Class[parameterTypes.size()]);
      Method meth = file.getClass().getMethod(methodName, parameterArray);
      SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
      if (functionSymbol.fboundp()) {
        Errors.warn("Attempt to redefine: " + functionSymbol);
        return;
      }
      SubLFunction func = SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, 
        requiredArgCount, optionalArgCount, allowsRest);
    } catch (Exception e) {
      Errors.cerror("Continue.", "Error while declaring function: " + functionName, e);
    }
  }
  
  public static final void declareFunction(String className, String methodName, 
      String functionName, int requiredArgCount, int optionalArgCount, boolean allowsRest) {
    try {
      List<Class> parameterTypes = new ArrayList<Class>();
      for (int i = 0; i < requiredArgCount + optionalArgCount; i++) {
        parameterTypes.add(SubLObject.class);
      }
      if (allowsRest) {
        parameterTypes.add(SubLObject[].class);
      }
      Class[] parameterArray = (Class[])parameterTypes.
        toArray(new Class[parameterTypes.size()]);
      SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
      if (functionSymbol.fboundp()) {
        Errors.warn("Attempt to redefine: " + functionSymbol);
        return;
      }
      SubLFunction func = SubLObjectFactory.makeCompiledFunction(className, 
        methodName, parameterArray, SubLObject.class, functionSymbol, requiredArgCount, 
        optionalArgCount, allowsRest);
    } catch (Exception e) {
      Errors.cerror("Continue.", "Error while declaring function: " + functionName, e);
    }
  }

  public static final void declareMacro(SubLFile file, String methodName, String functionName) {
    try {
      Class[] parameterArray = new Class[] {SubLObject.class, SubLObject.class};
      Method meth = file.getClass().getMethod(methodName, parameterArray);
      SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
      SubLCompiledFunction macroExpander = SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, 2, 0, false);
      SubLMacro macro = SubLObjectFactory.makeMacro(macroExpander);
      functionSymbol.setFunction(macro);
    } catch (Exception e) {
      Errors.cerror("Continue.", "Error while declaring macro: " + functionName, e);
    }
  }  

  public static final void declareMacro(String className, String methodName, String functionName) {
    try {
      Class[] parameterArray = new Class[] {SubLObject.class, SubLObject.class};
      SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
      SubLCompiledFunction macroExpander = SubLObjectFactory.makeCompiledFunction(className,
        methodName, parameterArray, SubLObject.class, functionSymbol, 2, 0, false);
      SubLMacro macro = SubLObjectFactory.makeMacro(macroExpander);
      functionSymbol.setFunction(macro);
    } catch (Exception e) {
      Errors.cerror("Continue.", "Error while declaring macro: " + functionName, e);
    }
  }  
  
  // @todo get rid of references to file -APB
  public static final SubLSymbol defconstant(SubLFile file, String variableName, SubLObject initialValue) {
    /* SubL defconstant : constant lexical global */
    return declareGlobal(variableName, initialValue, VariableAccessMode.CONSTANT, true);
  }
  
   public static final SubLSymbol defconstant(String variableName, SubLObject initialValue) {
    /* SubL defconstant : constant lexical global */
    return declareGlobal(variableName, initialValue, VariableAccessMode.CONSTANT, true);
  }
  
  // @todo get rid of references to file -APB
  public static final SubLSymbol defconstant(SubLFile file, String variableName, SubLObject initialValue, 
      SubLPackage thePackage) {
    /* SubL defconstant : constant lexical global */
    return declareGlobal(variableName, initialValue, VariableAccessMode.CONSTANT, true, 
      thePackage);
  }
   
  // @todo get rid of references to file -APB
  public static final SubLSymbol deflexical(SubLFile file, String variableName, SubLObject initialValue) {
    /* SubL deflexical : mutable lexical global */
    return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, true);
  }
  
  public static final SubLSymbol deflexical(String variableName, SubLObject initialValue) {
    /* SubL deflexical : mutable lexical global */
    return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, true);
  }
  
  public static final SubLSymbol deflexical(SubLFile file, String variableName, SubLObject initialValue, 
      SubLPackage thePackage) {
    /* SubL deflexical : mutable lexical global */
    return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, true, 
      thePackage);
  }
   
  // @todo get rid of references to file -APB
  public static final SubLSymbol defglobal(SubLFile file, String variableName, SubLObject initialValue) {
    /* SubL defglobal : mutable lexical global, not re-initialized on re-evaluation */
    return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, false);
  }
  
  public static final SubLSymbol defglobal(String variableName, SubLObject initialValue) {
    /* SubL defglobal : mutable lexical global, not re-initialized on re-evaluation */
    return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, false);
  }
  
  public static final SubLSymbol defglobal(SubLFile file, String variableName, SubLObject initialValue, 
      SubLPackage thePackage) {
    /* SubL defglobal : mutable lexical global, not re-initialized on re-evaluation */
    return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, false, 
      thePackage);
  }
   
  // @todo get rid of references to file -APB
  public static final SubLSymbol defparameter(SubLFile file, String variableName, SubLObject initialValue) {
    /* SubL defparameter : mutable dynamic global */
    return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, true);
  }
  
  public static final SubLSymbol defparameter(String variableName, SubLObject initialValue) {
    /* SubL defparameter : mutable dynamic global */
    return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, true);
  }
  
  public static final SubLSymbol defparameter(SubLFile file, String variableName, SubLObject initialValue, 
      SubLPackage thePackage) {
    /* SubL defparameter : mutable dynamic global */
    return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, true, 
      thePackage);
  }
   
  // @todo get rid of references to file -APB
  public static final SubLSymbol defvar(SubLFile file, String variableName, SubLObject initialValue) {
    /* SubL defvar : mutable dynamic global, not re-initialized on re-evaluation */
    return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, false);
  }
  
  public static final SubLSymbol defvar(String variableName, SubLObject initialValue) {
    /* SubL defvar : mutable dynamic global, not re-initialized on re-evaluation */
    return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, false);
  }
  
  public static final SubLSymbol defvar(SubLFile file, String variableName, SubLObject initialValue, 
      SubLPackage thePackage) {
    /* SubL defvar : mutable dynamic global, not re-initialized on re-evaluation */
    return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, false, 
      thePackage);
  }
  
  //// Protected Area
  
  //// Private Area
  
  public static abstract class VariableAccessMode {
    public final String toString() { return toSymbol().toString(); }
    public abstract SubLSymbol toSymbol();
    
    public static final VariableAccessMode CONSTANT = new VariableAccessMode() {
      public final SubLSymbol toSymbol() { return CommonSymbols.CONSTANT; }
    };
    public static final VariableAccessMode LEXICAL  = new VariableAccessMode()  {
      public final SubLSymbol toSymbol() { return CommonSymbols.LEXICAL; }
    };
    public static final VariableAccessMode DYNAMIC  = new VariableAccessMode() {
      public final SubLSymbol toSymbol() { return CommonSymbols.DYNAMIC; }
    };
    public static final VariableAccessMode UNDECLARED  = new VariableAccessMode() {
      public final SubLSymbol toSymbol() { return CommonSymbols.UNDECLARED; }
    };
  }
  
  private static final SubLSymbol declareGlobal(
      String variableName, SubLObject initialValue,
      VariableAccessMode accessMode, boolean isReinitialized) {
    return declareGlobal(variableName, initialValue, accessMode, 
      isReinitialized, (SubLPackage)Packages.$package$.getDynamicValue());
  }
  
  private static final SubLSymbol declareGlobal(
      String variableName, SubLObject initialValue,
      VariableAccessMode accessMode, boolean isReinitialized, 
      SubLPackage thePackage) {
    try {
      SubLSymbol symbol = SubLObjectFactory.makeSymbol(variableName, thePackage);
      symbol.setAccessMode(accessMode);
      if (isReinitialized || !symbol.boundp()) {
        symbol.forceGlobalValue(initialValue);
      }
      // perform symbol annotation -- for initialization type
      final SubLSymbol initializationType = isReinitialized ? CommonSymbols.INITIALIZER : CommonSymbols.WORLD;
      symbol.setProperty(CommonSymbols.INITIALIZATION_TYPE, initializationType);      
      // symbol annotation -- for binding type
      symbol.setProperty(CommonSymbols.BINDING_TYPE, accessMode.toSymbol());
      
      return symbol;
    } catch (Exception e) {
      Errors.cerror("Continue.", "Error while declaring global: " + variableName, e);
    }
    return null;
  }

  public static void handleThrowable() {
    ;
  }
  
  //// Internal Rep
  
  //// Main
  
}
