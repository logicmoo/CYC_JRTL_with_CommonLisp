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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.IsolatedClassLoader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLPatcher;
import java.io.File;

//// Internal Imports

//// External Imports

public  class Eval implements SubLFile {
  
  //// Constructors
  
  /** Creates a new instance of Eval. */
  public Eval() {}
  public static final SubLFile me = new Eval();
  
  //// Public Area
  
  public static SubLSymbol $star$;
  public static SubLSymbol $star_star$;
  public static SubLSymbol $star_star_star$;
  public static SubLSymbol $evaluator_method$;
  
  public static final SubLObject eval(SubLObject form) {
    return form.eval(SubLEnvironment.currentEnvironment());
  }
  
  public static final SubLObject macroexpand_1(SubLObject form, SubLObject env) {
    if (env == UNPROVIDED) { env = SubLEnvironment.currentEnvironment(); }
    if (form.isCons()) {
      SubLObject operatorSymbol = form.first();
      if (operatorSymbol.isSymbol()) {
        SubLOperator operator = operatorSymbol.toSymbol().getFunction();
        if (operator.isMacroOperator()) {
          SubLFunction macroExpander = operator.toMacro().getMacroExpander();
          SubLObject expandedForm = macroExpander.apply(form.toCons(), env.toEnv());
          return Values.values(expandedForm, T);
        }
      }
    }
    return Values.values(form, NIL);
  }
  
  private static final SubLSymbol EOF_KEYWORD = SubLObjectFactory.makeKeyword("EOF");
  private static final SubLString LOAD_ERROR_STRING_1 = SubLObjectFactory.makeString("Read error occured at position ~S of file ~S");
  private static final SubLString LOAD_ERROR_STRING_2 = SubLObjectFactory.makeString("Could not load file ~S.");
  
  
  public static final SubLObject load(SubLObject filename) {
    boolean success = false;
    SubLObject stream = NIL;
    try {
      stream = SubLStreamFactory.makeFileStream(filename.getString(), INPUT_KEYWORD,
        TEXT_KEYWORD, NIL, ERROR_KEYWORD, NIL);
      boolean done = false;
      while (!done) {
        Values.resetMultipleValues();
        SubLObject form = reader.read_ignoring_errors(stream, NIL, EOF_KEYWORD);
        SubLObject error = SubLProcess.nthMultipleValue(ONE_INTEGER);
        Values.resetMultipleValues();
        if (error == ERROR_KEYWORD) {
          if (form != EOF_KEYWORD) {
            Errors.error(LOAD_ERROR_STRING_1, streams_high.file_position(stream, UNPROVIDED), filename);
          } else {
            success = true;
          }
          done = true;
        } else {
          Eval.eval(form);
        }
      }
    } finally {
      if (stream.isStream()) {
        streams_high.close(stream, UNPROVIDED);
      }
    }
    if (success) { return T; }
    Errors.error(LOAD_ERROR_STRING_2, filename);
    return NIL;
  }
  
  
  // @todo move this somewhere more appropriate -APB
  public static final File openFileForReading(String filename) {
    // @todo convert filename to Java format before opening -APB
    File file = new File(filename);
    if (!file.exists()) {
      Errors.error("File doesn't exist: " + filename);
    }
    if (file.isDirectory()) {
      Errors.error("Expected file but got directory: " + filename);
    }
    if (!file.canRead()) {
      Errors.error("File is unreadable: " + filename);
    }
    return file;
  }
  
  public static final SubLObject function_information(SubLObject function, SubLObject environment) {
    return Errors.unimplementedMethod("function-information");
  }
  
  public static final SubLObject macroexpand(SubLObject form, SubLObject env) {
    if (env == UNPROVIDED) { env = SubLEnvironment.currentEnvironment(); }
    int i = -1;
    SubLObject expandedForm = form;
    SubLObject expanded_p = NIL;
    do {
      Values.resetMultipleValues();
      expandedForm = macroexpand_1(expandedForm, env);
      expanded_p = SubLProcess.nthMultipleValue(ONE_INTEGER);
      Values.resetMultipleValues();      
      i++;
    } while (expanded_p != NIL);

    // figure out how often expansion was done
    expanded_p = i == 0 ? NIL : T;
    Values.resetMultipleValues();
    return Values.values(expandedForm, expanded_p);
  }
  
  public static final SubLObject variable_information(SubLObject variable, SubLObject environment) {
    return Errors.unimplementedMethod("variable-information");
  }
  
  public static final SubLObject constantp(SubLObject object, SubLObject env) {
    if (object.isSymbol()) {
      SubLSymbol symbol = object.toSymbol();
      if (symbol.isConstantSymbol()) { return T; }
      return NIL;
    } else {
      if (!object.isCons()) { return T; }
      return NIL;
    }
  }
  
  public static final SubLObject get_initial_continuation() {
    return UNPROVIDED;
  }
  
  public static final SubLObject set_initial_continuation(SubLObject continuation) {
    return continuation;
  }  
  /**
   * #'INITIALIZE-SUBL-INTERFACE-FILE
   * 
   * Initializes a class that is already in the system 
   * @param className (stringp) in the form of "com.cyc.myproject.SubLTrampolines"
   * @return T if successful otherwise throws a {@link SubLException}
   */
  public static final SubLObject initialize_subl_interface_file(SubLObject className) {
    String stringTyped = className.getString();
    try {
      // ensure loadable
      if (!SubLFile.class.isAssignableFrom(Class.forName(stringTyped, false, isolatedClassLoader))) {
        Errors.error(stringTyped + " is not a SubLFile.");
      }
    } catch (ClassNotFoundException e) {
      Errors.error("Not found: " + stringTyped, e);
    }
    Class fileClass = null;
    try { // ensure <clinit>        
      fileClass = Class.forName(stringTyped, true, isolatedClassLoader);
    } catch (Exception e) {
      Errors.error("Error loading " + stringTyped, e);
      return NIL;
    }
    Object file = null;
    try { // In the case of SL2J generated classes <clinit> already populated a field called "me"
      // We rather reuse this instance instead of trying to create our own
      java.lang.reflect.Field field = fileClass.getDeclaredField("me");
      field.setAccessible(true);
      if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) file = field.get(null);
    } catch (IllegalArgumentException e) {
    } catch (IllegalAccessException e) {
    } catch (SecurityException e) {
    } catch (NoSuchFieldException e) {
    }
    // No static "me" field was accessible 
    if (file == null) try { // This is for non translated use-cases
      file = fileClass.newInstance();
    } catch (InstantiationException e) {
      Errors.error("Error creating " + stringTyped, e);
    } catch (IllegalAccessException e) {
      Errors.error("Error accessing " + stringTyped, e);
    }
    if (file instanceof SubLFile) {
      SubLFiles.initialize((SubLFile) file);
      return T; // LOAD- functions traditionally return T
    } else {
      Errors.error(stringTyped + " in not a SubLFile.");
    }
    return NIL;
  }

  /**
   * #'LOAD-EXTERNAL-CODE
   * 
   * Prepares a .class file for initialization.
   * Or Adds a .jar file to the CLASSPATH
   * Or Adds a Directory to the CLASSPATH
   * 
   * @param path (stringp) in the form of a java resource specifier
   * @return T if successful otherwise throws a {@link SubLException}
   *    
   */
  public static final SubLObject load_external_code(SubLObject path) {
    if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE) {
      Errors.error("Dynamic loading of code is not currently allowed.");
    }
    String stringTyped = path.getString();
    try {
      isolatedClassLoader.addCode(stringTyped);
      return T;
    } catch (Exception e) {
      Errors.error("Error loading jar!class: " + stringTyped, e);
      return NIL;
    }
  }
  
  public static final SubLObject patchSubLFile(SubLObject fullClassName) {
    initialize_subl_interface_file(fullClassName);
    return NIL;
  }

  public static final SubLObject loadSubLPatch(SubLObject jarOrClassFilePath, SubLObject patcherFileName) {
    if (patcherFileName == UNPROVIDED) {
      Errors.unimplementedMethod("loadSubLPatch: Loading a patch without patcher file name.");
    }
    load_external_code(jarOrClassFilePath);
    try {
      Class patcherClass = Class.forName(patcherFileName.getString());
      SubLPatcher patcher = (SubLPatcher)patcherClass.getConstructor().newInstance();
      patcher.doPatch();
    } catch (Exception e) {
      Errors.error("Unable to load patch: jarOrClassFilePath" + e);
    }
    return NIL;
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "constantp", "CONSTANTP", 1, 1, false);
    SubLFiles.declareFunction(me, "eval",          "EVAL",          1, 0, false);
    SubLFiles.declareFunction(me, "macroexpand_1", "MACROEXPAND-1", 1, 1, false);
    SubLFiles.declareFunction(me, "load", "LOAD", 1, 0, false);
    SubLFiles.declareFunction(me, "function_information", "FUNCTION-INFORMATION", 1, 1, false);
    SubLFiles.declareFunction(me, "macroexpand", "MACROEXPAND", 1, 1, false);
    SubLFiles.declareFunction(me, "variable_information", "VARIABLE-INFORMATION", 1, 1, false);
    
    SubLFiles.declareFunction(me, "get_initial_continuation", "GET-INITIAL-CONTINUATION", 0, 0, false);
    SubLFiles.declareFunction(me, "set_initial_continuation", "SET-INITIAL-CONTINUATION", 1, 0, false);
    SubLFiles.declareFunction(me, "initialize_subl_interface_file", "INITIALIZE-SUBL-INTERFACE-FILE", 1, 0, false);
    SubLFiles.declareFunction(me, "load_external_code", "LOAD-EXTERNAL-CODE", 1, 0, false);
    SubLFiles.declareFunction(me, "patchSubLFile", "PATCH-SUBL-FILE", 1, 0, false);
    SubLFiles.declareFunction(me, "loadSubLPatch", "LOAD-SUBL-PATCH", 1, 1, false);
  }
  
  public void initializeVariables() {
    $star$           = SubLFiles.defvar(me, "*",   NIL);
    $star_star$      = SubLFiles.defvar(me, "**",  NIL);
    $star_star_star$ = SubLFiles.defvar(me, "***", NIL);
    
    $evaluator_method$ = SubLFiles.defvar(me, "*%EVALUATOR-METHOD*", NIL);
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  private static final IsolatedClassLoader isolatedClassLoader = new IsolatedClassLoader();
  
  //// Internal Rep
  
  //// Main
  
}
