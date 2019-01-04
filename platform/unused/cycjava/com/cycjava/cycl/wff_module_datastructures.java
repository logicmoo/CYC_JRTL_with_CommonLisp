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

package  com.cyc.cycjava.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;

public  final class wff_module_datastructures extends SubLTranslatedFile {

  //// Constructor

  private wff_module_datastructures() {}
  public static final SubLFile me = new wff_module_datastructures();
  public static final String myName = "com.cyc.cycjava.cycl.wff_module_datastructures";

  //// Definitions

  public static final class $wff_module_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $name; }
    public SubLObject getField3() { return $plist; }
    public SubLObject setField2(SubLObject value) { return $name = value; }
    public SubLObject setField3(SubLObject value) { return $plist = value; }
    public SubLObject $name = NIL;
    public SubLObject $plist = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($wff_module_native.class, $sym0$WFF_MODULE, $sym1$WFF_MODULE_P, $list2, $list3, new String[] {"$name", "$plist"}, $list4, $list5, $sym6$PRINT_WFF_MODULE);
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 8196) 
  public static final SubLObject wff_violation_explanation_function(SubLObject wff_violation_name) {
    return wff_module_property(find_wff_module_by_name(wff_violation_name), $kw35$EXPLAIN_FUNC, NIL);
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 8388) 
  public static final SubLObject wff_violation_explanation_function_args(SubLObject wff_violation_name) {
    return wff_module_property(find_wff_module_by_name(wff_violation_name), $kw36$EXPLAIN_ARGS, NIL);
  }


  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 2926) 
  public static final SubLObject wff_module_property(SubLObject wff_module, SubLObject property, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    checkType(wff_module, $sym1$WFF_MODULE_P);
    {
      SubLObject plist = wff_module_plist(wff_module);
      return conses_high.getf(plist, property, v_default);
    }
  }


  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 2804) 
  public static final SubLObject wff_module_plist(SubLObject wff_module) {
    checkType(wff_module, $sym1$WFF_MODULE_P);
    return wff_mod_plist(wff_module);
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315) 
  public static final SubLObject wff_mod_plist(SubLObject object) {
    checkType(object, $sym1$WFF_MODULE_P);
    return object.getField3();
  }


  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315) 
  public static SubLSymbol $dtp_wff_module$ = null;

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315) 
  public static final SubLObject wff_module_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31864");
    return NIL;
  }

  public static final class $wff_module_p$UnaryFunction extends UnaryFunction {
    public $wff_module_p$UnaryFunction() { super(extractFunctionNamed("WFF-MODULE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31867"); }
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315) 
  public static final SubLObject wff_mod_name(SubLObject object) {
    checkType(object, $sym1$WFF_MODULE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315) 
  public static final SubLObject _csetf_wff_mod_name(SubLObject object, SubLObject value) {
    checkType(object, $sym1$WFF_MODULE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315) 
  public static final SubLObject _csetf_wff_mod_plist(SubLObject object, SubLObject value) {
    checkType(object, $sym1$WFF_MODULE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315) 
  public static final SubLObject make_wff_module(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $wff_module_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw12$NAME)) {
            _csetf_wff_mod_name(v_new, current_value);
          } else if (pcase_var.eql($kw13$PLIST)) {
            _csetf_wff_mod_plist(v_new, current_value);
          } else {
            Errors.error($str14$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** @return wff-module-p; a new WFF module with NAME and properties PLIST */
  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 1791) 
  public static final SubLObject new_wff_module(SubLObject name, SubLObject plist) {
    checkType(plist, $sym16$PROPERTY_LIST_P);
    {
      SubLObject wff_module = allocate_wff_module(name);
      _csetf_wff_mod_plist(wff_module, plist);
      add_wff_module(wff_module);
      return wff_module;
    }
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 2139) 
  public static final SubLObject allocate_wff_module(SubLObject name) {
    {
      SubLObject wff_module = find_wff_module_by_name(name);
      if ((NIL != wff_module)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31865");
      } else {
        wff_module = make_wff_module(UNPROVIDED);
        _csetf_wff_mod_name(wff_module, name);
      }
      _csetf_wff_mod_plist(wff_module, NIL);
      return wff_module;
    }
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 2604) 
  public static final SubLObject wff_module_name(SubLObject wff_module) {
    checkType(wff_module, $sym1$WFF_MODULE_P);
    return wff_mod_name(wff_module);
  }

  /** An index mapping WFF module names to modules themselves */
  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 3314) 
  private static SubLSymbol $wff_module_store$ = null;

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 3850) 
  public static final SubLObject find_wff_module_by_name(SubLObject name) {
    {
      SubLObject wff_module = Hashtables.gethash(name, $wff_module_store$.getGlobalValue(), UNPROVIDED);
      return wff_module;
    }
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 3990) 
  public static final SubLObject add_wff_module(SubLObject wff_module) {
    checkType(wff_module, $sym1$WFF_MODULE_P);
    {
      SubLObject name = wff_module_name(wff_module);
      Hashtables.sethash(name, $wff_module_store$.getGlobalValue(), wff_module);
    }
    return wff_module;
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 4395) 
  public static final SubLObject setup_wff_module(SubLObject name, SubLObject type, SubLObject plist) {
    {
      SubLObject new_plist = conses_high.copy_list(plist);
      new_plist = conses_high.putf(plist, $kw30$MODULE_TYPE, type);
      {
        SubLObject wff_module = new_wff_module(name, new_plist);
        return wff_module;
      }
    }
  }

  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 4815) 
  private static SubLSymbol $wff_module_properties$ = null;

  /** Declare and wff module named NAME with properties in PLIST. */
  @SubL(source = "cycl/wff-module-datastructures.lisp", position = 6306) 
  public static final SubLObject wff_violation_module(SubLObject name, SubLObject plist) {
    checkType(plist, $sym33$WFF_MODULE_PROPERTY_LIST_P);
    {
      SubLObject wff_module = setup_wff_module(name, $kw34$VIOLATION, plist);
      return wff_module;
    }
  }

  public static final SubLObject declare_wff_module_datastructures_file() {
    declareFunction(myName, "wff_module_print_function_trampoline", "WFF-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "wff_module_p", "WFF-MODULE-P", 1, 0, false); new $wff_module_p$UnaryFunction();
    declareFunction(myName, "wff_mod_name", "WFF-MOD-NAME", 1, 0, false);
    declareFunction(myName, "wff_mod_plist", "WFF-MOD-PLIST", 1, 0, false);
    declareFunction(myName, "_csetf_wff_mod_name", "_CSETF-WFF-MOD-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_wff_mod_plist", "_CSETF-WFF-MOD-PLIST", 2, 0, false);
    declareFunction(myName, "make_wff_module", "MAKE-WFF-MODULE", 0, 1, false);
    declareFunction(myName, "print_wff_module", "PRINT-WFF-MODULE", 3, 0, false);
    declareFunction(myName, "new_wff_module", "NEW-WFF-MODULE", 2, 0, false);
    declareFunction(myName, "allocate_wff_module", "ALLOCATE-WFF-MODULE", 1, 0, false);
    declareFunction(myName, "destroy_wff_module", "DESTROY-WFF-MODULE", 1, 0, false);
    declareFunction(myName, "wff_module_name", "WFF-MODULE-NAME", 1, 0, false);
    declareFunction(myName, "wff_module_plist", "WFF-MODULE-PLIST", 1, 0, false);
    declareFunction(myName, "wff_module_property", "WFF-MODULE-PROPERTY", 2, 1, false);
    declareMacro(myName, "do_wff_modules", "DO-WFF-MODULES");
    declareFunction(myName, "wff_module_store", "WFF-MODULE-STORE", 0, 0, false);
    declareFunction(myName, "find_wff_module_by_name", "FIND-WFF-MODULE-BY-NAME", 1, 0, false);
    declareFunction(myName, "add_wff_module", "ADD-WFF-MODULE", 1, 0, false);
    declareFunction(myName, "remove_wff_module", "REMOVE-WFF-MODULE", 1, 0, false);
    declareFunction(myName, "setup_wff_module", "SETUP-WFF-MODULE", 3, 0, false);
    declareFunction(myName, "wff_module_type", "WFF-MODULE-TYPE", 1, 0, false);
    declareFunction(myName, "wff_violation_type_p", "WFF-VIOLATION-TYPE-P", 1, 0, false);
    declareFunction(myName, "wff_violation_p", "WFF-VIOLATION-P", 1, 0, false);
    declareFunction(myName, "wff_module_property_p", "WFF-MODULE-PROPERTY-P", 2, 0, false);
    declareFunction(myName, "wff_module_property_list_p", "WFF-MODULE-PROPERTY-LIST-P", 1, 0, false);
    declareFunction(myName, "wff_violation_module", "WFF-VIOLATION-MODULE", 2, 0, false);
    declareFunction(myName, "wff_violation_explanation_function", "WFF-VIOLATION-EXPLANATION-FUNCTION", 1, 0, false);
    declareFunction(myName, "wff_violation_explanation_function_args", "WFF-VIOLATION-EXPLANATION-FUNCTION-ARGS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_wff_module_datastructures_file() {
    $dtp_wff_module$ = defconstant("*DTP-WFF-MODULE*", $sym0$WFF_MODULE);
    $wff_module_store$ = deflexical("*WFF-MODULE-STORE*", ((NIL != Symbols.boundp($sym18$_WFF_MODULE_STORE_)) ? ((SubLObject) $wff_module_store$.getGlobalValue()) : Hashtables.make_hash_table($int19$212, Symbols.symbol_function(EQUAL), UNPROVIDED)));
    $wff_module_properties$ = deflexical("*WFF-MODULE-PROPERTIES*", $list31);
    return NIL;
  }

  public static final SubLObject setup_wff_module_datastructures_file() {
    // CVS_ID("Id: wff-module-datastructures.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_wff_module$.getGlobalValue(), Symbols.symbol_function($sym7$WFF_MODULE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$WFF_MOD_NAME, $sym9$_CSETF_WFF_MOD_NAME);
    Structures.def_csetf($sym10$WFF_MOD_PLIST, $sym11$_CSETF_WFF_MOD_PLIST);
    Equality.identity($sym0$WFF_MODULE);
    subl_macro_promotions.declare_defglobal($sym18$_WFF_MODULE_STORE_);
    access_macros.register_macro_helper($sym28$WFF_MODULE_STORE, $sym29$DO_WFF_MODULES);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$WFF_MODULE = makeSymbol("WFF-MODULE");
  public static final SubLSymbol $sym1$WFF_MODULE_P = makeSymbol("WFF-MODULE-P");
  public static final SubLList $list2 = list(makeSymbol("NAME"), makeSymbol("PLIST"));
  public static final SubLList $list3 = list(makeKeyword("NAME"), makeKeyword("PLIST"));
  public static final SubLList $list4 = list(makeSymbol("WFF-MOD-NAME"), makeSymbol("WFF-MOD-PLIST"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-WFF-MOD-NAME"), makeSymbol("_CSETF-WFF-MOD-PLIST"));
  public static final SubLSymbol $sym6$PRINT_WFF_MODULE = makeSymbol("PRINT-WFF-MODULE");
  public static final SubLSymbol $sym7$WFF_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("WFF-MODULE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$WFF_MOD_NAME = makeSymbol("WFF-MOD-NAME");
  public static final SubLSymbol $sym9$_CSETF_WFF_MOD_NAME = makeSymbol("_CSETF-WFF-MOD-NAME");
  public static final SubLSymbol $sym10$WFF_MOD_PLIST = makeSymbol("WFF-MOD-PLIST");
  public static final SubLSymbol $sym11$_CSETF_WFF_MOD_PLIST = makeSymbol("_CSETF-WFF-MOD-PLIST");
  public static final SubLSymbol $kw12$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw13$PLIST = makeKeyword("PLIST");
  public static final SubLString $str14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str15$_WFF_Module___a_ = makeString("[WFF Module: ~a]");
  public static final SubLSymbol $sym16$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $kw17$FREE = makeKeyword("FREE");
  public static final SubLSymbol $sym18$_WFF_MODULE_STORE_ = makeSymbol("*WFF-MODULE-STORE*");
  public static final SubLInteger $int19$212 = makeInteger(212);
  public static final SubLList $list20 = list(list(makeSymbol("WFF-MODULE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list21 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw22$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw23$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym24$NAME_VAR = makeUninternedSymbol("NAME-VAR");
  public static final SubLSymbol $sym25$DO_HASH_TABLE = makeSymbol("DO-HASH-TABLE");
  public static final SubLList $list26 = list(makeSymbol("WFF-MODULE-STORE"));
  public static final SubLSymbol $sym27$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym28$WFF_MODULE_STORE = makeSymbol("WFF-MODULE-STORE");
  public static final SubLSymbol $sym29$DO_WFF_MODULES = makeSymbol("DO-WFF-MODULES");
  public static final SubLSymbol $kw30$MODULE_TYPE = makeKeyword("MODULE-TYPE");
  public static final SubLList $list31 = list(cons(makeKeyword("EXPLAIN-FUNC"), makeSymbol("SYMBOLP")), cons(makeKeyword("COMMENT"), makeSymbol("STRINGP")));
  public static final SubLSymbol $sym32$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym33$WFF_MODULE_PROPERTY_LIST_P = makeSymbol("WFF-MODULE-PROPERTY-LIST-P");
  public static final SubLSymbol $kw34$VIOLATION = makeKeyword("VIOLATION");
  public static final SubLSymbol $kw35$EXPLAIN_FUNC = makeKeyword("EXPLAIN-FUNC");
  public static final SubLSymbol $kw36$EXPLAIN_ARGS = makeKeyword("EXPLAIN-ARGS");

  //// Initializers

  public void declareFunctions() {
    declare_wff_module_datastructures_file();
  }

  public void initializeVariables() {
    init_wff_module_datastructures_file();
  }

  public void runTopLevelForms() {
    setup_wff_module_datastructures_file();
  }

}
