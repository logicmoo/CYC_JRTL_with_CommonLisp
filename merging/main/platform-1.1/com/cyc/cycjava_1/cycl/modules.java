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

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class modules extends SubLTranslatedFile {

  //// Constructor

  private modules() {}
  public static final SubLFile me = new modules();
  public static final String myName = "com.cyc.cycjava_1.cycl.modules";

  //// Definitions

  @SubL(source = "cycl/modules.lisp", position = 1244) 
  private static SubLSymbol $module_lock$ = null;

  @SubL(source = "cycl/modules.lisp", position = 1408) 
  private static SubLSymbol $system_lock$ = null;

  public static final class $module_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $basis; }
    public SubLObject getField3() { return $name; }
    public SubLObject getField4() { return $system; }
    public SubLObject getField5() { return $pathname; }
    public SubLObject getField6() { return $test_cases; }
    public SubLObject getField7() { return $test_suites; }
    public SubLObject getField8() { return $provisional_p; }
    public SubLObject setField2(SubLObject value) { return $basis = value; }
    public SubLObject setField3(SubLObject value) { return $name = value; }
    public SubLObject setField4(SubLObject value) { return $system = value; }
    public SubLObject setField5(SubLObject value) { return $pathname = value; }
    public SubLObject setField6(SubLObject value) { return $test_cases = value; }
    public SubLObject setField7(SubLObject value) { return $test_suites = value; }
    public SubLObject setField8(SubLObject value) { return $provisional_p = value; }
    public SubLObject $basis = NIL;
    public SubLObject $name = NIL;
    public SubLObject $system = NIL;
    public SubLObject $pathname = NIL;
    public SubLObject $test_cases = NIL;
    public SubLObject $test_suites = NIL;
    public SubLObject $provisional_p = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($module_native.class, $sym5$MODULE, $sym6$MODULE_P, $list7, $list8, new String[] {"$basis", "$name", "$system", "$pathname", "$test_cases", "$test_suites", "$provisional_p"}, $list9, $list10, $sym11$PRINT_MODULE);
  }

  @SubL(source = "cycl/modules.lisp", position = 2788) 
  public static SubLSymbol $dtp_module$ = null;

  @SubL(source = "cycl/modules.lisp", position = 2788) 
  public static final SubLObject module_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31551");
    return NIL;
  }

  public static final class $module_p$UnaryFunction extends UnaryFunction {
    public $module_p$UnaryFunction() { super(extractFunctionNamed("MODULE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31550"); }
  }

  @SubL(source = "cycl/modules.lisp", position = 2788) 
  public static final SubLObject module_name(SubLObject object) {
    checkType(object, $sym6$MODULE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/modules.lisp", position = 2788) 
  public static final SubLObject module_system(SubLObject object) {
    checkType(object, $sym6$MODULE_P);
    return object.getField4();
  }

  @SubL(source = "cycl/modules.lisp", position = 2788) 
  public static final SubLObject _csetf_module_name(SubLObject object, SubLObject value) {
    checkType(object, $sym6$MODULE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/modules.lisp", position = 2788) 
  public static final SubLObject _csetf_module_system(SubLObject object, SubLObject value) {
    checkType(object, $sym6$MODULE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/modules.lisp", position = 2788) 
  public static final SubLObject make_module(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $module_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw27$BASIS)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31535");
          } else if (pcase_var.eql($kw28$NAME)) {
            _csetf_module_name(v_new, current_value);
          } else if (pcase_var.eql($kw29$SYSTEM)) {
            _csetf_module_system(v_new, current_value);
          } else if (pcase_var.eql($kw30$PATHNAME)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31536");
          } else if (pcase_var.eql($kw31$TEST_CASES)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31538");
          } else if (pcase_var.eql($kw32$TEST_SUITES)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31541");
          } else if (pcase_var.eql($kw33$PROVISIONAL_P)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31537");
          } else {
            Errors.error($str34$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/modules.lisp", position = 4151) 
  public static final SubLObject sxhash_module_method(SubLObject object) {
    return Numbers.logxor(Sxhash.sxhash(module_get_name(object)), Sxhash.sxhash(module_get_system(object)));
  }

  @SubL(source = "cycl/modules.lisp", position = 4351) 
  private static SubLSymbol $module_index$ = null;

  @SubL(source = "cycl/modules.lisp", position = 4482) 
  public static final SubLObject module_store(SubLObject module) {
    {
      SubLObject entry = list(module_get_name(module), module_get_system(module));
      SubLObject answer = NIL;
      SubLObject lock = $module_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        answer = Hashtables.sethash(entry, $module_index$.getGlobalValue(), module);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return answer;
    }
  }

  @SubL(source = "cycl/modules.lisp", position = 6100) 
  public static final SubLObject module_new(SubLObject name, SubLObject system_name, SubLObject provisional_p, SubLObject pathname) {
    if ((provisional_p == UNPROVIDED)) {
      provisional_p = NIL;
    }
    if ((pathname == UNPROVIDED)) {
      pathname = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(name, $sym42$STRINGP);
      checkType(system_name, $sym42$STRINGP);
      {
        SubLObject system = system_lookup(system_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == system_p(system))) {
            Errors.error($str67$_A_is_not_the_name_of_a_known_sys, system_name);
          }
        }
        name = Strings.string_downcase(name, UNPROVIDED, UNPROVIDED);
        system_name = Strings.string_downcase(system_name, UNPROVIDED, UNPROVIDED);
        {
          SubLObject v_new = make_module(UNPROVIDED);
          _csetf_module_name(v_new, name);
          _csetf_module_system(v_new, system_name);
          module_store(v_new);
          system_add_module(system, v_new);
          return v_new;
        }
      }
    }
  }

  @SubL(source = "cycl/modules.lisp", position = 8560) 
  public static final SubLObject create_module(SubLObject module_name, SubLObject system_name) {
    checkType(module_name, $sym42$STRINGP);
    checkType(system_name, $sym42$STRINGP);
    return module_new(module_name, system_name, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/modules.lisp", position = 8777) 
  public static final SubLObject module_get_name(SubLObject module) {
    checkType(module, $sym6$MODULE_P);
    return module_name(module);
  }

  @SubL(source = "cycl/modules.lisp", position = 9182) 
  public static final SubLObject module_get_system(SubLObject module) {
    checkType(module, $sym6$MODULE_P);
    return module_system(module);
  }

  public static final class $system_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $basis; }
    public SubLObject getField3() { return $name; }
    public SubLObject getField4() { return $default_pathname; }
    public SubLObject getField5() { return $modules; }
    public SubLObject getField6() { return $provisional_p; }
    public SubLObject setField2(SubLObject value) { return $basis = value; }
    public SubLObject setField3(SubLObject value) { return $name = value; }
    public SubLObject setField4(SubLObject value) { return $default_pathname = value; }
    public SubLObject setField5(SubLObject value) { return $modules = value; }
    public SubLObject setField6(SubLObject value) { return $provisional_p = value; }
    public SubLObject $basis = NIL;
    public SubLObject $name = NIL;
    public SubLObject $default_pathname = NIL;
    public SubLObject $modules = NIL;
    public SubLObject $provisional_p = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($system_native.class, $sym69$SYSTEM, $sym54$SYSTEM_P, $list70, $list71, new String[] {"$basis", "$name", "$default_pathname", "$modules", "$provisional_p"}, $list72, $list73, $sym74$PRINT_SYSTEM);
  }

  @SubL(source = "cycl/modules.lisp", position = 12014) 
  public static SubLSymbol $dtp_system$ = null;

  @SubL(source = "cycl/modules.lisp", position = 12014) 
  public static final SubLObject system_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31552");
    return NIL;
  }

  @SubL(source = "cycl/modules.lisp", position = 12014) 
  public static final SubLObject system_p(SubLObject object) {
    return ((object.getClass() == $system_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $system_p$UnaryFunction extends UnaryFunction {
    public $system_p$UnaryFunction() { super(extractFunctionNamed("SYSTEM-P")); }
    public SubLObject processItem(SubLObject arg1) { return system_p(arg1); }
  }

  @SubL(source = "cycl/modules.lisp", position = 12014) 
  public static final SubLObject system_name(SubLObject object) {
    checkType(object, $sym54$SYSTEM_P);
    return object.getField3();
  }

  @SubL(source = "cycl/modules.lisp", position = 12014) 
  public static final SubLObject system_modules(SubLObject object) {
    checkType(object, $sym54$SYSTEM_P);
    return object.getField5();
  }

  @SubL(source = "cycl/modules.lisp", position = 12014) 
  public static final SubLObject _csetf_system_name(SubLObject object, SubLObject value) {
    checkType(object, $sym54$SYSTEM_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/modules.lisp", position = 12014) 
  public static final SubLObject _csetf_system_modules(SubLObject object, SubLObject value) {
    checkType(object, $sym54$SYSTEM_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/modules.lisp", position = 12014) 
  public static final SubLObject make_system(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $system_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw27$BASIS)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31544");
          } else if (pcase_var.eql($kw28$NAME)) {
            _csetf_system_name(v_new, current_value);
          } else if (pcase_var.eql($kw86$DEFAULT_PATHNAME)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31545");
          } else if (pcase_var.eql($kw87$MODULES)) {
            _csetf_system_modules(v_new, current_value);
          } else if (pcase_var.eql($kw33$PROVISIONAL_P)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31546");
          } else {
            Errors.error($str34$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/modules.lisp", position = 12899) 
  public static final SubLObject sxhash_system_method(SubLObject object) {
    return Sxhash.sxhash(system_get_name(object));
  }

  @SubL(source = "cycl/modules.lisp", position = 12983) 
  private static SubLSymbol $system_index$ = null;

  @SubL(source = "cycl/modules.lisp", position = 13085) 
  public static final SubLObject system_store(SubLObject system) {
    {
      SubLObject lock = $system_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        {
          SubLObject item_var = system;
          if ((NIL == conses_high.member(item_var, $system_index$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
            $system_index$.setGlobalValue(cons(item_var, $system_index$.getGlobalValue()));
          }
        }
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/modules.lisp", position = 13327) 
  public static final SubLObject system_lookup(SubLObject system_name) {
    checkType(system_name, $sym42$STRINGP);
    return Sequences.find(system_name, $system_index$.getGlobalValue(), Symbols.symbol_function(EQUAL), Symbols.symbol_function($sym91$SYSTEM_GET_NAME), UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/modules.lisp", position = 13530) 
  public static final SubLObject system_new(SubLObject system_name, SubLObject provisional_p, SubLObject default_pathname) {
    if ((provisional_p == UNPROVIDED)) {
      provisional_p = NIL;
    }
    if ((default_pathname == UNPROVIDED)) {
      default_pathname = NIL;
    }
    checkType(system_name, $sym42$STRINGP);
    system_name = Strings.string_downcase(system_name, UNPROVIDED, UNPROVIDED);
    {
      SubLObject v_new = make_system(UNPROVIDED);
      _csetf_system_name(v_new, system_name);
      system_store(v_new);
      return v_new;
    }
  }

  @SubL(source = "cycl/modules.lisp", position = 15565) 
  public static final SubLObject create_system(SubLObject system_name) {
    checkType(system_name, $sym42$STRINGP);
    return system_new(system_name, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/modules.lisp", position = 15722) 
  public static final SubLObject system_get_name(SubLObject system) {
    checkType(system, $sym54$SYSTEM_P);
    return system_name(system);
  }

  /** This is only called when MODULE is a provisional module, or we 
   are running translated C code! */
  @SubL(source = "cycl/modules.lisp", position = 17161) 
  public static final SubLObject system_add_module(SubLObject system, SubLObject module) {
    checkType(system, $sym54$SYSTEM_P);
    checkType(module, $sym6$MODULE_P);
    {
      SubLObject lock = $system_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        _csetf_system_modules(system, conses_high.adjoin(module, system_modules(system), UNPROVIDED, UNPROVIDED));
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return system_modules(system);
  }

  public static final SubLObject declare_modules_file() {
    declareMacro("with_module_lock", "WITH-MODULE-LOCK");
    declareMacro("with_system_lock", "WITH-SYSTEM-LOCK");
    declareFunction("module_print_function_trampoline", "MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("module_p", "MODULE-P", 1, 0, false); new $module_p$UnaryFunction();
    declareFunction("module_basis", "MODULE-BASIS", 1, 0, false);
    declareFunction("module_name", "MODULE-NAME", 1, 0, false);
    declareFunction("module_system", "MODULE-SYSTEM", 1, 0, false);
    declareFunction("module_pathname", "MODULE-PATHNAME", 1, 0, false);
    declareFunction("module_test_cases", "MODULE-TEST-CASES", 1, 0, false);
    declareFunction("module_test_suites", "MODULE-TEST-SUITES", 1, 0, false);
    declareFunction("module_provisional_p", "MODULE-PROVISIONAL-P", 1, 0, false);
    declareFunction("_csetf_module_basis", "_CSETF-MODULE-BASIS", 2, 0, false);
    declareFunction("_csetf_module_name", "_CSETF-MODULE-NAME", 2, 0, false);
    declareFunction("_csetf_module_system", "_CSETF-MODULE-SYSTEM", 2, 0, false);
    declareFunction("_csetf_module_pathname", "_CSETF-MODULE-PATHNAME", 2, 0, false);
    declareFunction("_csetf_module_test_cases", "_CSETF-MODULE-TEST-CASES", 2, 0, false);
    declareFunction("_csetf_module_test_suites", "_CSETF-MODULE-TEST-SUITES", 2, 0, false);
    declareFunction("_csetf_module_provisional_p", "_CSETF-MODULE-PROVISIONAL-P", 2, 0, false);
    declareFunction("make_module", "MAKE-MODULE", 0, 1, false);
    declareFunction("print_module", "PRINT-MODULE", 3, 0, false);
    declareFunction("sxhash_module_method", "SXHASH-MODULE-METHOD", 1, 0, false);
    declareFunction("module_store", "MODULE-STORE", 1, 0, false);
    declareFunction("module_remove", "MODULE-REMOVE", 1, 0, false);
    declareFunction("module_lookup", "MODULE-LOOKUP", 2, 0, false);
    declareFunction("all_modules", "ALL-MODULES", 0, 0, false);
    declareMacro("do_modules", "DO-MODULES");
    declareFunction("module_get_index", "MODULE-GET-INDEX", 0, 0, false);
    declareFunction("module_new", "MODULE-NEW", 2, 2, false);
    declareFunction("ensure_provisional_module", "ENSURE-PROVISIONAL-MODULE", 3, 0, false);
    declareFunction("create_provisional_module", "CREATE-PROVISIONAL-MODULE", 3, 0, false);
    declareFunction("create_module", "CREATE-MODULE", 2, 0, false);
    declareFunction("module_get_name", "MODULE-GET-NAME", 1, 0, false);
    declareFunction("module_get_system", "MODULE-GET-SYSTEM", 1, 0, false);
    declareFunction("module_get_pathname", "MODULE-GET-PATHNAME", 1, 0, false);
    declareFunction("module_add_test_case", "MODULE-ADD-TEST-CASE", 2, 0, false);
    declareFunction("module_remove_test_case", "MODULE-REMOVE-TEST-CASE", 2, 0, false);
    declareFunction("module_get_test_cases", "MODULE-GET-TEST-CASES", 1, 0, false);
    declareFunction("module_add_test_suite", "MODULE-ADD-TEST-SUITE", 2, 0, false);
    declareFunction("module_remove_test_suite", "MODULE-REMOVE-TEST-SUITE", 2, 0, false);
    declareFunction("module_get_test_suites", "MODULE-GET-TEST-SUITES", 1, 0, false);
    declareFunction("module_get_provisional_p", "MODULE-GET-PROVISIONAL-P", 1, 0, false);
    declareFunction("system_print_function_trampoline", "SYSTEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("system_p", "SYSTEM-P", 1, 0, false); new $system_p$UnaryFunction();
    declareFunction("system_basis", "SYSTEM-BASIS", 1, 0, false);
    declareFunction("system_name", "SYSTEM-NAME", 1, 0, false);
    declareFunction("system_default_pathname", "SYSTEM-DEFAULT-PATHNAME", 1, 0, false);
    declareFunction("system_modules", "SYSTEM-MODULES", 1, 0, false);
    declareFunction("system_provisional_p", "SYSTEM-PROVISIONAL-P", 1, 0, false);
    declareFunction("_csetf_system_basis", "_CSETF-SYSTEM-BASIS", 2, 0, false);
    declareFunction("_csetf_system_name", "_CSETF-SYSTEM-NAME", 2, 0, false);
    declareFunction("_csetf_system_default_pathname", "_CSETF-SYSTEM-DEFAULT-PATHNAME", 2, 0, false);
    declareFunction("_csetf_system_modules", "_CSETF-SYSTEM-MODULES", 2, 0, false);
    declareFunction("_csetf_system_provisional_p", "_CSETF-SYSTEM-PROVISIONAL-P", 2, 0, false);
    declareFunction("make_system", "MAKE-SYSTEM", 0, 1, false);
    declareFunction("print_system", "PRINT-SYSTEM", 3, 0, false);
    declareFunction("sxhash_system_method", "SXHASH-SYSTEM-METHOD", 1, 0, false);
    declareFunction("system_store", "SYSTEM-STORE", 1, 0, false);
    declareFunction("system_remove", "SYSTEM-REMOVE", 1, 0, false);
    declareFunction("system_lookup", "SYSTEM-LOOKUP", 1, 0, false);
    declareFunction("all_systems", "ALL-SYSTEMS", 0, 0, false);
    declareFunction("system_new", "SYSTEM-NEW", 1, 2, false);
    declareFunction("ensure_provisional_system", "ENSURE-PROVISIONAL-SYSTEM", 2, 0, false);
    declareFunction("create_provisional_system", "CREATE-PROVISIONAL-SYSTEM", 2, 0, false);
    declareFunction("create_system", "CREATE-SYSTEM", 1, 0, false);
    declareFunction("system_get_name", "SYSTEM-GET-NAME", 1, 0, false);
    declareFunction("system_get_default_pathname", "SYSTEM-GET-DEFAULT-PATHNAME", 1, 0, false);
    declareFunction("system_get_modules", "SYSTEM-GET-MODULES", 1, 1, false);
    declareFunction("system_add_module", "SYSTEM-ADD-MODULE", 2, 0, false);
    declareFunction("system_remove_module", "SYSTEM-REMOVE-MODULE", 2, 0, false);
    declareFunction("system_get_provisional_p", "SYSTEM-GET-PROVISIONAL-P", 1, 0, false);
    declareFunction("system_module_names", "SYSTEM-MODULE-NAMES", 1, 1, false);
    declareFunction("system_names", "SYSTEM-NAMES", 0, 1, false);
    declareMacro("note_translated_modules", "NOTE-TRANSLATED-MODULES");
    return NIL;
  }

  public static final SubLObject init_modules_file() {
    $module_lock$ = deflexical("*MODULE-LOCK*", Locks.make_lock($str0$Module_Lock));
    $system_lock$ = deflexical("*SYSTEM-LOCK*", Locks.make_lock($str3$System_Lock));
    $dtp_module$ = defconstant("*DTP-MODULE*", $sym5$MODULE);
    $module_index$ = deflexical("*MODULE-INDEX*", maybeDefault( $sym40$_MODULE_INDEX_, $module_index$, ()-> (Hashtables.make_hash_table($int41$1024, Symbols.symbol_function(EQUALP), UNPROVIDED))));
    $dtp_system$ = defconstant("*DTP-SYSTEM*", $sym69$SYSTEM);
    $system_index$ = deflexical("*SYSTEM-INDEX*", maybeDefault( $sym90$_SYSTEM_INDEX_, $system_index$, NIL));
    return NIL;
  }

  public static final SubLObject setup_modules_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_module$.getGlobalValue(), Symbols.symbol_function($sym12$MODULE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym13$MODULE_BASIS, $sym14$_CSETF_MODULE_BASIS);
    Structures.def_csetf($sym15$MODULE_NAME, $sym16$_CSETF_MODULE_NAME);
    Structures.def_csetf($sym17$MODULE_SYSTEM, $sym18$_CSETF_MODULE_SYSTEM);
    Structures.def_csetf($sym19$MODULE_PATHNAME, $sym20$_CSETF_MODULE_PATHNAME);
    Structures.def_csetf($sym21$MODULE_TEST_CASES, $sym22$_CSETF_MODULE_TEST_CASES);
    Structures.def_csetf($sym23$MODULE_TEST_SUITES, $sym24$_CSETF_MODULE_TEST_SUITES);
    Structures.def_csetf($sym25$MODULE_PROVISIONAL_P, $sym26$_CSETF_MODULE_PROVISIONAL_P);
    Equality.identity($sym5$MODULE);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_module$.getGlobalValue(), Symbols.symbol_function($sym39$SXHASH_MODULE_METHOD));
    subl_macro_promotions.declare_defglobal($sym40$_MODULE_INDEX_);
    access_macros.register_macro_helper($sym65$MODULE_GET_INDEX, $sym66$DO_MODULES);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_system$.getGlobalValue(), Symbols.symbol_function($sym75$SYSTEM_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym76$SYSTEM_BASIS, $sym77$_CSETF_SYSTEM_BASIS);
    Structures.def_csetf($sym78$SYSTEM_NAME, $sym79$_CSETF_SYSTEM_NAME);
    Structures.def_csetf($sym80$SYSTEM_DEFAULT_PATHNAME, $sym81$_CSETF_SYSTEM_DEFAULT_PATHNAME);
    Structures.def_csetf($sym82$SYSTEM_MODULES, $sym83$_CSETF_SYSTEM_MODULES);
    Structures.def_csetf($sym84$SYSTEM_PROVISIONAL_P, $sym85$_CSETF_SYSTEM_PROVISIONAL_P);
    Equality.identity($sym69$SYSTEM);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_system$.getGlobalValue(), Symbols.symbol_function($sym89$SXHASH_SYSTEM_METHOD));
    subl_macro_promotions.declare_defglobal($sym90$_SYSTEM_INDEX_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$Module_Lock = makeString("Module Lock");
  public static final SubLSymbol $sym1$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLList $list2 = list(makeSymbol("*MODULE-LOCK*"));
  public static final SubLString $str3$System_Lock = makeString("System Lock");
  public static final SubLList $list4 = list(makeSymbol("*SYSTEM-LOCK*"));
  public static final SubLSymbol $sym5$MODULE = makeSymbol("MODULE");
  public static final SubLSymbol $sym6$MODULE_P = makeSymbol("MODULE-P");
  public static final SubLList $list7 = list(makeSymbol("BASIS"), makeSymbol("NAME"), makeSymbol("SYSTEM"), makeSymbol("PATHNAME"), makeSymbol("TEST-CASES"), makeSymbol("TEST-SUITES"), makeSymbol("PROVISIONAL-P"));
  public static final SubLList $list8 = list(makeKeyword("BASIS"), makeKeyword("NAME"), makeKeyword("SYSTEM"), makeKeyword("PATHNAME"), makeKeyword("TEST-CASES"), makeKeyword("TEST-SUITES"), makeKeyword("PROVISIONAL-P"));
  public static final SubLList $list9 = list(makeSymbol("MODULE-BASIS"), makeSymbol("MODULE-NAME"), makeSymbol("MODULE-SYSTEM"), makeSymbol("MODULE-PATHNAME"), makeSymbol("MODULE-TEST-CASES"), makeSymbol("MODULE-TEST-SUITES"), makeSymbol("MODULE-PROVISIONAL-P"));
  public static final SubLList $list10 = list(makeSymbol("_CSETF-MODULE-BASIS"), makeSymbol("_CSETF-MODULE-NAME"), makeSymbol("_CSETF-MODULE-SYSTEM"), makeSymbol("_CSETF-MODULE-PATHNAME"), makeSymbol("_CSETF-MODULE-TEST-CASES"), makeSymbol("_CSETF-MODULE-TEST-SUITES"), makeSymbol("_CSETF-MODULE-PROVISIONAL-P"));
  public static final SubLSymbol $sym11$PRINT_MODULE = makeSymbol("PRINT-MODULE");
  public static final SubLSymbol $sym12$MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MODULE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym13$MODULE_BASIS = makeSymbol("MODULE-BASIS");
  public static final SubLSymbol $sym14$_CSETF_MODULE_BASIS = makeSymbol("_CSETF-MODULE-BASIS");
  public static final SubLSymbol $sym15$MODULE_NAME = makeSymbol("MODULE-NAME");
  public static final SubLSymbol $sym16$_CSETF_MODULE_NAME = makeSymbol("_CSETF-MODULE-NAME");
  public static final SubLSymbol $sym17$MODULE_SYSTEM = makeSymbol("MODULE-SYSTEM");
  public static final SubLSymbol $sym18$_CSETF_MODULE_SYSTEM = makeSymbol("_CSETF-MODULE-SYSTEM");
  public static final SubLSymbol $sym19$MODULE_PATHNAME = makeSymbol("MODULE-PATHNAME");
  public static final SubLSymbol $sym20$_CSETF_MODULE_PATHNAME = makeSymbol("_CSETF-MODULE-PATHNAME");
  public static final SubLSymbol $sym21$MODULE_TEST_CASES = makeSymbol("MODULE-TEST-CASES");
  public static final SubLSymbol $sym22$_CSETF_MODULE_TEST_CASES = makeSymbol("_CSETF-MODULE-TEST-CASES");
  public static final SubLSymbol $sym23$MODULE_TEST_SUITES = makeSymbol("MODULE-TEST-SUITES");
  public static final SubLSymbol $sym24$_CSETF_MODULE_TEST_SUITES = makeSymbol("_CSETF-MODULE-TEST-SUITES");
  public static final SubLSymbol $sym25$MODULE_PROVISIONAL_P = makeSymbol("MODULE-PROVISIONAL-P");
  public static final SubLSymbol $sym26$_CSETF_MODULE_PROVISIONAL_P = makeSymbol("_CSETF-MODULE-PROVISIONAL-P");
  public static final SubLSymbol $kw27$BASIS = makeKeyword("BASIS");
  public static final SubLSymbol $kw28$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw29$SYSTEM = makeKeyword("SYSTEM");
  public static final SubLSymbol $kw30$PATHNAME = makeKeyword("PATHNAME");
  public static final SubLSymbol $kw31$TEST_CASES = makeKeyword("TEST-CASES");
  public static final SubLSymbol $kw32$TEST_SUITES = makeKeyword("TEST-SUITES");
  public static final SubLSymbol $kw33$PROVISIONAL_P = makeKeyword("PROVISIONAL-P");
  public static final SubLString $str34$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str35$__ = makeString("#<");
  public static final SubLSymbol $kw36$STREAM = makeKeyword("STREAM");
  public static final SubLString $str37$_S_in__S = makeString("~S in ~S");
  public static final SubLSymbol $kw38$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym39$SXHASH_MODULE_METHOD = makeSymbol("SXHASH-MODULE-METHOD");
  public static final SubLSymbol $sym40$_MODULE_INDEX_ = makeSymbol("*MODULE-INDEX*");
  public static final SubLInteger $int41$1024 = makeInteger(1024);
  public static final SubLSymbol $sym42$STRINGP = makeSymbol("STRINGP");
  public static final SubLList $list43 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("SYSTEM"), list(makeSymbol("MESSAGE"), makeString("mapping modules"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list44 = list(makeKeyword("SYSTEM"), makeKeyword("MESSAGE"));
  public static final SubLSymbol $kw45$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw46$MESSAGE = makeKeyword("MESSAGE");
  public static final SubLString $str47$mapping_modules = makeString("mapping modules");
  public static final SubLSymbol $sym48$MODULE_REF = makeUninternedSymbol("MODULE-REF");
  public static final SubLSymbol $sym49$MODULE_NAME = makeUninternedSymbol("MODULE-NAME");
  public static final SubLSymbol $sym50$SYSTEM_NAME = makeUninternedSymbol("SYSTEM-NAME");
  public static final SubLSymbol $sym51$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym52$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym53$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym54$SYSTEM_P = makeSymbol("SYSTEM-P");
  public static final SubLSymbol $sym55$SYSTEM_LOOKUP = makeSymbol("SYSTEM-LOOKUP");
  public static final SubLSymbol $sym56$ERROR = makeSymbol("ERROR");
  public static final SubLString $str57$_A_is_not_a_known_system_name_ = makeString("~A is not a known system name.");
  public static final SubLSymbol $sym58$PROGRESS_CDOHASH = makeSymbol("PROGRESS-CDOHASH");
  public static final SubLList $list59 = list(makeSymbol("MODULE-GET-INDEX"));
  public static final SubLSymbol $sym60$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLSymbol $sym61$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym62$COR = makeSymbol("COR");
  public static final SubLSymbol $sym63$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym64$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym65$MODULE_GET_INDEX = makeSymbol("MODULE-GET-INDEX");
  public static final SubLSymbol $sym66$DO_MODULES = makeSymbol("DO-MODULES");
  public static final SubLString $str67$_A_is_not_the_name_of_a_known_sys = makeString("~A is not the name of a known system.");
  public static final SubLSymbol $sym68$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym69$SYSTEM = makeSymbol("SYSTEM");
  public static final SubLList $list70 = list(makeSymbol("BASIS"), makeSymbol("NAME"), makeSymbol("DEFAULT-PATHNAME"), makeSymbol("MODULES"), makeSymbol("PROVISIONAL-P"));
  public static final SubLList $list71 = list(makeKeyword("BASIS"), makeKeyword("NAME"), makeKeyword("DEFAULT-PATHNAME"), makeKeyword("MODULES"), makeKeyword("PROVISIONAL-P"));
  public static final SubLList $list72 = list(makeSymbol("SYSTEM-BASIS"), makeSymbol("SYSTEM-NAME"), makeSymbol("SYSTEM-DEFAULT-PATHNAME"), makeSymbol("SYSTEM-MODULES"), makeSymbol("SYSTEM-PROVISIONAL-P"));
  public static final SubLList $list73 = list(makeSymbol("_CSETF-SYSTEM-BASIS"), makeSymbol("_CSETF-SYSTEM-NAME"), makeSymbol("_CSETF-SYSTEM-DEFAULT-PATHNAME"), makeSymbol("_CSETF-SYSTEM-MODULES"), makeSymbol("_CSETF-SYSTEM-PROVISIONAL-P"));
  public static final SubLSymbol $sym74$PRINT_SYSTEM = makeSymbol("PRINT-SYSTEM");
  public static final SubLSymbol $sym75$SYSTEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SYSTEM-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym76$SYSTEM_BASIS = makeSymbol("SYSTEM-BASIS");
  public static final SubLSymbol $sym77$_CSETF_SYSTEM_BASIS = makeSymbol("_CSETF-SYSTEM-BASIS");
  public static final SubLSymbol $sym78$SYSTEM_NAME = makeSymbol("SYSTEM-NAME");
  public static final SubLSymbol $sym79$_CSETF_SYSTEM_NAME = makeSymbol("_CSETF-SYSTEM-NAME");
  public static final SubLSymbol $sym80$SYSTEM_DEFAULT_PATHNAME = makeSymbol("SYSTEM-DEFAULT-PATHNAME");
  public static final SubLSymbol $sym81$_CSETF_SYSTEM_DEFAULT_PATHNAME = makeSymbol("_CSETF-SYSTEM-DEFAULT-PATHNAME");
  public static final SubLSymbol $sym82$SYSTEM_MODULES = makeSymbol("SYSTEM-MODULES");
  public static final SubLSymbol $sym83$_CSETF_SYSTEM_MODULES = makeSymbol("_CSETF-SYSTEM-MODULES");
  public static final SubLSymbol $sym84$SYSTEM_PROVISIONAL_P = makeSymbol("SYSTEM-PROVISIONAL-P");
  public static final SubLSymbol $sym85$_CSETF_SYSTEM_PROVISIONAL_P = makeSymbol("_CSETF-SYSTEM-PROVISIONAL-P");
  public static final SubLSymbol $kw86$DEFAULT_PATHNAME = makeKeyword("DEFAULT-PATHNAME");
  public static final SubLSymbol $kw87$MODULES = makeKeyword("MODULES");
  public static final SubLString $str88$System__S = makeString("System ~S");
  public static final SubLSymbol $sym89$SXHASH_SYSTEM_METHOD = makeSymbol("SXHASH-SYSTEM-METHOD");
  public static final SubLSymbol $sym90$_SYSTEM_INDEX_ = makeSymbol("*SYSTEM-INDEX*");
  public static final SubLSymbol $sym91$SYSTEM_GET_NAME = makeSymbol("SYSTEM-GET-NAME");
  public static final SubLString $str92$_A_is_already_the_name_of_a_known = makeString("~A is already the name of a known system.");
  public static final SubLList $list93 = list(makeSymbol("SYSTEM-NAME"));
  public static final SubLList $list94 = list(makeSymbol("PROGN"));

  //// Initializers

  public void declareFunctions() {
    declare_modules_file();
  }

  public void initializeVariables() {
    init_modules_file();
  }

  public void runTopLevelForms() {
    setup_modules_file();
  }

}
