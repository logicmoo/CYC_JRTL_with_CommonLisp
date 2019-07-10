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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.red_api;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class red_infrastructure extends SubLTranslatedFile {

  //// Constructor

  private red_infrastructure() {}
  public static final SubLFile me = new red_infrastructure();
  public static final String myName = "com.cyc.cycjava_1.cycl.red_infrastructure";

  //// Definitions

  /** The list of red symbols  by DEFINE-red-ltype. */
  @SubL(source = "cycl/red-infrastructure.lisp", position = 915) 
  public static SubLSymbol $red_variables_dictionary$ = null;

  /** The list of all known red-symbols. */
  @SubL(source = "cycl/red-infrastructure.lisp", position = 1196) 
  public static SubLSymbol $red_symbols_list$ = null;

  /** a dictionary whose keys are all known red-keys and whose values are lists of red symbols */
  @SubL(source = "cycl/red-infrastructure.lisp", position = 1286) 
  public static SubLSymbol $red_keys_dictionary$ = null;

  /** a dictionary whose keys are monikers(keywords) and whose values are lists of callback routines */
  @SubL(source = "cycl/red-infrastructure.lisp", position = 1445) 
  public static SubLSymbol $red_reload_callback_moniker_dictionary$ = null;

  /** Set by def-red-set-vars to T */
  @SubL(source = "cycl/red-infrastructure.lisp", position = 1629) 
  public static SubLSymbol $repositories_loaded$ = null;

  public static final class $red_symbol_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $name; }
    public SubLObject getField3() { return $red_key; }
    public SubLObject getField4() { return $default_value; }
    public SubLObject getField5() { return $ltype; }
    public SubLObject getField6() { return $set_from_red; }
    public SubLObject getField7() { return $valuetype; }
    public SubLObject setField2(SubLObject value) { return $name = value; }
    public SubLObject setField3(SubLObject value) { return $red_key = value; }
    public SubLObject setField4(SubLObject value) { return $default_value = value; }
    public SubLObject setField5(SubLObject value) { return $ltype = value; }
    public SubLObject setField6(SubLObject value) { return $set_from_red = value; }
    public SubLObject setField7(SubLObject value) { return $valuetype = value; }
    public SubLObject $name = NIL;
    public SubLObject $red_key = NIL;
    public SubLObject $default_value = NIL;
    public SubLObject $ltype = NIL;
    public SubLObject $set_from_red = NIL;
    public SubLObject $valuetype = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($red_symbol_native.class, $sym5$RED_SYMBOL, $sym6$RED_SYMBOL_P, $list7, $list8, new String[] {"$name", "$red_key", "$default_value", "$ltype", "$set_from_red", "$valuetype"}, $list9, $list10, $sym11$PRINT_RED_SYMBOL);
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static SubLSymbol $dtp_red_symbol$ = null;

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static final SubLObject red_symbol_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30850");
    return NIL;
  }

  public static final class $red_symbol_p$UnaryFunction extends UnaryFunction {
    public $red_symbol_p$UnaryFunction() { super(extractFunctionNamed("RED-SYMBOL-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30857"); }
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static final SubLObject red_symbol_name(SubLObject object) {
    checkType(object, $sym6$RED_SYMBOL_P);
    return object.getField2();
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static final SubLObject red_symbol_red_key(SubLObject object) {
    checkType(object, $sym6$RED_SYMBOL_P);
    return object.getField3();
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static final SubLObject red_symbol_default_value(SubLObject object) {
    checkType(object, $sym6$RED_SYMBOL_P);
    return object.getField4();
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static final SubLObject _csetf_red_symbol_name(SubLObject object, SubLObject value) {
    checkType(object, $sym6$RED_SYMBOL_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static final SubLObject _csetf_red_symbol_red_key(SubLObject object, SubLObject value) {
    checkType(object, $sym6$RED_SYMBOL_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static final SubLObject _csetf_red_symbol_default_value(SubLObject object, SubLObject value) {
    checkType(object, $sym6$RED_SYMBOL_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static final SubLObject _csetf_red_symbol_ltype(SubLObject object, SubLObject value) {
    checkType(object, $sym6$RED_SYMBOL_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static final SubLObject _csetf_red_symbol_set_from_red(SubLObject object, SubLObject value) {
    checkType(object, $sym6$RED_SYMBOL_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static final SubLObject _csetf_red_symbol_valuetype(SubLObject object, SubLObject value) {
    checkType(object, $sym6$RED_SYMBOL_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 1715) 
  public static final SubLObject make_red_symbol(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $red_symbol_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw25$NAME)) {
            _csetf_red_symbol_name(v_new, current_value);
          } else if (pcase_var.eql($kw26$RED_KEY)) {
            _csetf_red_symbol_red_key(v_new, current_value);
          } else if (pcase_var.eql($kw27$DEFAULT_VALUE)) {
            _csetf_red_symbol_default_value(v_new, current_value);
          } else if (pcase_var.eql($kw28$LTYPE)) {
            _csetf_red_symbol_ltype(v_new, current_value);
          } else if (pcase_var.eql($kw29$SET_FROM_RED)) {
            _csetf_red_symbol_set_from_red(v_new, current_value);
          } else if (pcase_var.eql($kw30$VALUETYPE)) {
            _csetf_red_symbol_valuetype(v_new, current_value);
          } else {
            Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 2003) 
  public static final SubLObject new_red_symbol(SubLObject red_key, SubLObject name, SubLObject defaultval, SubLObject ltype, SubLObject valuetype) {
    if ((valuetype == UNPROVIDED)) {
      valuetype = $kw32$SIMPLE;
    }
    {
      SubLObject red_sym_obj = make_red_symbol(UNPROVIDED);
      _csetf_red_symbol_name(red_sym_obj, name);
      _csetf_red_symbol_red_key(red_sym_obj, red_key);
      _csetf_red_symbol_default_value(red_sym_obj, defaultval);
      _csetf_red_symbol_ltype(red_sym_obj, ltype);
      _csetf_red_symbol_set_from_red(red_sym_obj, NIL);
      _csetf_red_symbol_valuetype(red_sym_obj, valuetype);
      return red_sym_obj;
    }
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 4243) 
  public static final SubLObject register_red(SubLObject red_sym) {
    {
      SubLObject red_sym_q = dictionary.dictionary_lookup($red_variables_dictionary$.getGlobalValue(), red_symbol_name(red_sym), UNPROVIDED);
      if ((NIL != red_sym_q)) {
        _csetf_red_symbol_default_value(red_sym_q, red_symbol_default_value(red_sym));
        if ((!(red_symbol_red_key(red_sym_q).equal(red_symbol_red_key(red_sym))))) {
          {
            SubLObject oldkey = red_symbol_red_key(red_sym_q);
            SubLObject newkey = red_symbol_red_key(red_sym);
            SubLObject oldkeydictentry = dictionary.dictionary_lookup($red_keys_dictionary$.getGlobalValue(), oldkey, UNPROVIDED);
            SubLObject newkeydictentry = dictionary.dictionary_lookup($red_keys_dictionary$.getGlobalValue(), newkey, UNPROVIDED);
            SubLObject newlist = NIL;
            SubLObject cdolist_list_var = oldkeydictentry;
            SubLObject elt = NIL;
            for (elt = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elt = cdolist_list_var.first()) {
              if ((elt != red_sym_q)) {
                newlist = cons(elt, newlist);
              }
            }
            if ((NIL != newlist)) {
              dictionary.dictionary_enter($red_keys_dictionary$.getGlobalValue(), oldkey, newlist);
            } else {
              dictionary.dictionary_remove($red_keys_dictionary$.getGlobalValue(), oldkey);
            }
            _csetf_red_symbol_red_key(red_sym_q, newkey);
            if ((NIL != newkeydictentry)) {
              newkeydictentry = cons(red_sym_q, newkeydictentry);
            } else {
              newkeydictentry = list(red_sym_q);
            }
            dictionary.dictionary_enter($red_keys_dictionary$.getGlobalValue(), newkey, newkeydictentry);
          }
        }
        return NIL;
      }
      $red_symbols_list$.setGlobalValue(cons(red_sym, $red_symbols_list$.getGlobalValue()));
      dictionary.dictionary_enter($red_variables_dictionary$.getGlobalValue(), red_symbol_name(red_sym), red_sym);
      {
        SubLObject newkey = red_symbol_red_key(red_sym);
        SubLObject newkeydictentry = dictionary.dictionary_lookup($red_keys_dictionary$.getGlobalValue(), newkey, UNPROVIDED);
        if ((NIL != newkeydictentry)) {
          newkeydictentry = cons(red_sym, newkeydictentry);
        } else {
          newkeydictentry = list(red_sym);
        }
        dictionary.dictionary_enter($red_keys_dictionary$.getGlobalValue(), newkey, newkeydictentry);
      }
      return red_sym;
    }
  }

  @SubL(source = "cycl/red-infrastructure.lisp", position = 6965) 
  public static final SubLObject red_value(SubLObject red_sym) {
    return red_symbol_default_value(red_sym);
  }

  public static final SubLObject declare_red_infrastructure_file() {
    declareFunction(myName, "red_symbol_print_function_trampoline", "RED-SYMBOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "red_symbol_p", "RED-SYMBOL-P", 1, 0, false); new $red_symbol_p$UnaryFunction();
    declareFunction(myName, "red_symbol_name", "RED-SYMBOL-NAME", 1, 0, false);
    declareFunction(myName, "red_symbol_red_key", "RED-SYMBOL-RED-KEY", 1, 0, false);
    declareFunction(myName, "red_symbol_default_value", "RED-SYMBOL-DEFAULT-VALUE", 1, 0, false);
    declareFunction(myName, "red_symbol_ltype", "RED-SYMBOL-LTYPE", 1, 0, false);
    declareFunction(myName, "red_symbol_set_from_red", "RED-SYMBOL-SET-FROM-RED", 1, 0, false);
    declareFunction(myName, "red_symbol_valuetype", "RED-SYMBOL-VALUETYPE", 1, 0, false);
    declareFunction(myName, "_csetf_red_symbol_name", "_CSETF-RED-SYMBOL-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_red_symbol_red_key", "_CSETF-RED-SYMBOL-RED-KEY", 2, 0, false);
    declareFunction(myName, "_csetf_red_symbol_default_value", "_CSETF-RED-SYMBOL-DEFAULT-VALUE", 2, 0, false);
    declareFunction(myName, "_csetf_red_symbol_ltype", "_CSETF-RED-SYMBOL-LTYPE", 2, 0, false);
    declareFunction(myName, "_csetf_red_symbol_set_from_red", "_CSETF-RED-SYMBOL-SET-FROM-RED", 2, 0, false);
    declareFunction(myName, "_csetf_red_symbol_valuetype", "_CSETF-RED-SYMBOL-VALUETYPE", 2, 0, false);
    declareFunction(myName, "make_red_symbol", "MAKE-RED-SYMBOL", 0, 1, false);
    declareFunction(myName, "new_red_symbol", "NEW-RED-SYMBOL", 4, 1, false);
    declareFunction(myName, "print_red_symbol", "PRINT-RED-SYMBOL", 3, 0, false);
    declareFunction(myName, "set_red_symbols", "SET-RED-SYMBOLS", 0, 0, false);
    declareFunction(myName, "list_def_red_non_repository_initialized_variables", "LIST-DEF-RED-NON-REPOSITORY-INITIALIZED-VARIABLES", 0, 0, false);
    declareFunction(myName, "list_def_red_variables", "LIST-DEF-RED-VARIABLES", 0, 0, false);
    declareFunction(myName, "red_utilities_initialization", "RED-UTILITIES-INITIALIZATION", 0, 0, false);
    declareFunction(myName, "register_red", "REGISTER-RED", 1, 0, false);
    declareFunction(myName, "red_conditional_set", "RED-CONDITIONAL-SET", 1, 0, false);
    declareFunction(myName, "red_ordered_var_list", "RED-ORDERED-VAR-LIST", 0, 0, false);
    declareFunction(myName, "def_red_should_be_set", "DEF-RED-SHOULD-BE-SET", 1, 0, false);
    declareFunction(myName, "red_value", "RED-VALUE", 1, 0, false);
    declareFunction(myName, "red_make_list", "RED-MAKE-LIST", 1, 0, false);
    declareFunction(myName, "red_get_relative_key", "RED-GET-RELATIVE-KEY", 1, 0, false);
    declareFunction(myName, "redu_translate_to_key", "REDU-TRANSLATE-TO-KEY", 1, 0, false);
    declareFunction(myName, "red_reload_repository", "RED-RELOAD-REPOSITORY", 2, 0, false);
    declareFunction(myName, "red_update_def_red_from_repository", "RED-UPDATE-DEF-RED-FROM-REPOSITORY", 1, 0, false);
    declareFunction(myName, "red_execute_callbacks", "RED-EXECUTE-CALLBACKS", 2, 0, false);
    declareMacro(myName, "red_repository_register_reload_callback", "RED-REPOSITORY-REGISTER-RELOAD-CALLBACK");
    declareMacro(myName, "red_repository_unregister_reload_callback", "RED-REPOSITORY-UNREGISTER-RELOAD-CALLBACK");
    declareMacro(myName, "red_reload_callback_define", "RED-RELOAD-CALLBACK-DEFINE");
    return NIL;
  }

  public static final SubLObject init_red_infrastructure_file() {
    $red_variables_dictionary$ = deflexical("*RED-VARIABLES-DICTIONARY*", maybeDefault( $sym0$_RED_VARIABLES_DICTIONARY_, $red_variables_dictionary$, ()-> (dictionary.new_dictionary(UNPROVIDED, UNPROVIDED))));
    $red_symbols_list$ = deflexical("*RED-SYMBOLS-LIST*", maybeDefault( $sym1$_RED_SYMBOLS_LIST_, $red_symbols_list$, NIL));
    $red_keys_dictionary$ = deflexical("*RED-KEYS-DICTIONARY*", maybeDefault( $sym2$_RED_KEYS_DICTIONARY_, $red_keys_dictionary$, ()-> (dictionary.new_dictionary(UNPROVIDED, UNPROVIDED))));
    $red_reload_callback_moniker_dictionary$ = deflexical("*RED-RELOAD-CALLBACK-MONIKER-DICTIONARY*", maybeDefault( $sym3$_RED_RELOAD_CALLBACK_MONIKER_DICTIONARY_, $red_reload_callback_moniker_dictionary$, ()-> (dictionary.new_dictionary(UNPROVIDED, UNPROVIDED))));
    $repositories_loaded$ = deflexical("*REPOSITORIES-LOADED*", maybeDefault( $sym4$_REPOSITORIES_LOADED_, $repositories_loaded$, NIL));
    $dtp_red_symbol$ = defconstant("*DTP-RED-SYMBOL*", $sym5$RED_SYMBOL);
    return NIL;
  }

  public static final SubLObject setup_red_infrastructure_file() {
    // CVS_ID("Id: red-infrastructure.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_RED_VARIABLES_DICTIONARY_);
    subl_macro_promotions.declare_defglobal($sym1$_RED_SYMBOLS_LIST_);
    subl_macro_promotions.declare_defglobal($sym2$_RED_KEYS_DICTIONARY_);
    subl_macro_promotions.declare_defglobal($sym3$_RED_RELOAD_CALLBACK_MONIKER_DICTIONARY_);
    subl_macro_promotions.declare_defglobal($sym4$_REPOSITORIES_LOADED_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_red_symbol$.getGlobalValue(), Symbols.symbol_function($sym12$RED_SYMBOL_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym13$RED_SYMBOL_NAME, $sym14$_CSETF_RED_SYMBOL_NAME);
    Structures.def_csetf($sym15$RED_SYMBOL_RED_KEY, $sym16$_CSETF_RED_SYMBOL_RED_KEY);
    Structures.def_csetf($sym17$RED_SYMBOL_DEFAULT_VALUE, $sym18$_CSETF_RED_SYMBOL_DEFAULT_VALUE);
    Structures.def_csetf($sym19$RED_SYMBOL_LTYPE, $sym20$_CSETF_RED_SYMBOL_LTYPE);
    Structures.def_csetf($sym21$RED_SYMBOL_SET_FROM_RED, $sym22$_CSETF_RED_SYMBOL_SET_FROM_RED);
    Structures.def_csetf($sym23$RED_SYMBOL_VALUETYPE, $sym24$_CSETF_RED_SYMBOL_VALUETYPE);
    Equality.identity($sym5$RED_SYMBOL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_RED_VARIABLES_DICTIONARY_ = makeSymbol("*RED-VARIABLES-DICTIONARY*");
  public static final SubLSymbol $sym1$_RED_SYMBOLS_LIST_ = makeSymbol("*RED-SYMBOLS-LIST*");
  public static final SubLSymbol $sym2$_RED_KEYS_DICTIONARY_ = makeSymbol("*RED-KEYS-DICTIONARY*");
  public static final SubLSymbol $sym3$_RED_RELOAD_CALLBACK_MONIKER_DICTIONARY_ = makeSymbol("*RED-RELOAD-CALLBACK-MONIKER-DICTIONARY*");
  public static final SubLSymbol $sym4$_REPOSITORIES_LOADED_ = makeSymbol("*REPOSITORIES-LOADED*");
  public static final SubLSymbol $sym5$RED_SYMBOL = makeSymbol("RED-SYMBOL");
  public static final SubLSymbol $sym6$RED_SYMBOL_P = makeSymbol("RED-SYMBOL-P");
  public static final SubLList $list7 = list(makeSymbol("NAME"), makeSymbol("RED-KEY"), makeSymbol("DEFAULT-VALUE"), makeSymbol("LTYPE"), makeSymbol("SET-FROM-RED"), makeSymbol("VALUETYPE"));
  public static final SubLList $list8 = list(makeKeyword("NAME"), makeKeyword("RED-KEY"), makeKeyword("DEFAULT-VALUE"), makeKeyword("LTYPE"), makeKeyword("SET-FROM-RED"), makeKeyword("VALUETYPE"));
  public static final SubLList $list9 = list(makeSymbol("RED-SYMBOL-NAME"), makeSymbol("RED-SYMBOL-RED-KEY"), makeSymbol("RED-SYMBOL-DEFAULT-VALUE"), makeSymbol("RED-SYMBOL-LTYPE"), makeSymbol("RED-SYMBOL-SET-FROM-RED"), makeSymbol("RED-SYMBOL-VALUETYPE"));
  public static final SubLList $list10 = list(makeSymbol("_CSETF-RED-SYMBOL-NAME"), makeSymbol("_CSETF-RED-SYMBOL-RED-KEY"), makeSymbol("_CSETF-RED-SYMBOL-DEFAULT-VALUE"), makeSymbol("_CSETF-RED-SYMBOL-LTYPE"), makeSymbol("_CSETF-RED-SYMBOL-SET-FROM-RED"), makeSymbol("_CSETF-RED-SYMBOL-VALUETYPE"));
  public static final SubLSymbol $sym11$PRINT_RED_SYMBOL = makeSymbol("PRINT-RED-SYMBOL");
  public static final SubLSymbol $sym12$RED_SYMBOL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RED-SYMBOL-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym13$RED_SYMBOL_NAME = makeSymbol("RED-SYMBOL-NAME");
  public static final SubLSymbol $sym14$_CSETF_RED_SYMBOL_NAME = makeSymbol("_CSETF-RED-SYMBOL-NAME");
  public static final SubLSymbol $sym15$RED_SYMBOL_RED_KEY = makeSymbol("RED-SYMBOL-RED-KEY");
  public static final SubLSymbol $sym16$_CSETF_RED_SYMBOL_RED_KEY = makeSymbol("_CSETF-RED-SYMBOL-RED-KEY");
  public static final SubLSymbol $sym17$RED_SYMBOL_DEFAULT_VALUE = makeSymbol("RED-SYMBOL-DEFAULT-VALUE");
  public static final SubLSymbol $sym18$_CSETF_RED_SYMBOL_DEFAULT_VALUE = makeSymbol("_CSETF-RED-SYMBOL-DEFAULT-VALUE");
  public static final SubLSymbol $sym19$RED_SYMBOL_LTYPE = makeSymbol("RED-SYMBOL-LTYPE");
  public static final SubLSymbol $sym20$_CSETF_RED_SYMBOL_LTYPE = makeSymbol("_CSETF-RED-SYMBOL-LTYPE");
  public static final SubLSymbol $sym21$RED_SYMBOL_SET_FROM_RED = makeSymbol("RED-SYMBOL-SET-FROM-RED");
  public static final SubLSymbol $sym22$_CSETF_RED_SYMBOL_SET_FROM_RED = makeSymbol("_CSETF-RED-SYMBOL-SET-FROM-RED");
  public static final SubLSymbol $sym23$RED_SYMBOL_VALUETYPE = makeSymbol("RED-SYMBOL-VALUETYPE");
  public static final SubLSymbol $sym24$_CSETF_RED_SYMBOL_VALUETYPE = makeSymbol("_CSETF-RED-SYMBOL-VALUETYPE");
  public static final SubLSymbol $kw25$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw26$RED_KEY = makeKeyword("RED-KEY");
  public static final SubLSymbol $kw27$DEFAULT_VALUE = makeKeyword("DEFAULT-VALUE");
  public static final SubLSymbol $kw28$LTYPE = makeKeyword("LTYPE");
  public static final SubLSymbol $kw29$SET_FROM_RED = makeKeyword("SET-FROM-RED");
  public static final SubLSymbol $kw30$VALUETYPE = makeKeyword("VALUETYPE");
  public static final SubLString $str31$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw32$SIMPLE = makeKeyword("SIMPLE");
  public static final SubLString $str33$__red_symbol_name___s__red_key___ = makeString("#<red-symbol name: ~s  red-key = ~s  default value = ~s ltype = ~s set-from-red = ~s value-type = ~s>");
  public static final SubLString $str34$_s____s__ = makeString("~s = ~s~%");
  public static final SubLSymbol $kw35$PARAMETER = makeKeyword("PARAMETER");
  public static final SubLSymbol $kw36$LEXICAL = makeKeyword("LEXICAL");
  public static final SubLSymbol $kw37$GLOBAL = makeKeyword("GLOBAL");
  public static final SubLSymbol $kw38$VAR = makeKeyword("VAR");
  public static final SubLSymbol $kw39$LEAST_PRIVILEGED = makeKeyword("LEAST-PRIVILEGED");
  public static final SubLSymbol $kw40$LIST = makeKeyword("LIST");
  public static final SubLString $str41$_ = makeString(".");
  public static final SubLSymbol $sym42$CCONCATENATE = makeSymbol("CCONCATENATE");
  public static final SubLString $str43$ = makeString("");
  public static final SubLSymbol $sym44$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym45$STRINGP = makeSymbol("STRINGP");
  public static final SubLList $list46 = list(makeSymbol("MONIKER"), makeSymbol("FUNCSPEC"));
  public static final SubLSymbol $sym47$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym48$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list49 = list(makeSymbol("KEYWORDP"));
  public static final SubLList $list50 = list(makeSymbol("FUNCTION-SPEC-P"));
  public static final SubLSymbol $sym51$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym52$MONIKER_FUN_LIST = makeSymbol("MONIKER-FUN-LIST");
  public static final SubLSymbol $sym53$DICTIONARY_LOOKUP = makeSymbol("DICTIONARY-LOOKUP");
  public static final SubLSymbol $sym54$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym55$CPUSH = makeSymbol("CPUSH");
  public static final SubLList $list56 = list(makeSymbol("MONIKER-FUN-LIST"));
  public static final SubLSymbol $sym57$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym58$LIST = makeSymbol("LIST");
  public static final SubLList $list59 = list(list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("*RED-RELOAD-CALLBACK-MONIKER-DICTIONARY*"), makeSymbol("MONIKER"), makeSymbol("MONIKER-FUN-LIST")));
  public static final SubLSymbol $sym60$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLList $list61 = list(makeSymbol("PROGN"));
  public static final SubLList $list62 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("MONIKERS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str63$RED_reload_callback__A_has_an_inv = makeString("RED reload callback ~A has an invalid arglist of:~%  ~S~%Use DEFINE instead.");
  public static final SubLSymbol $sym64$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym65$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym66$MONIKER = makeSymbol("MONIKER");
  public static final SubLSymbol $sym67$RED_REPOSITORY_REGISTER_RELOAD_CALLBACK = makeSymbol("RED-REPOSITORY-REGISTER-RELOAD-CALLBACK");
  public static final SubLSymbol $sym68$QUOTE = makeSymbol("QUOTE");

  //// Initializers

  public void declareFunctions() {
    declare_red_infrastructure_file();
  }

  public void initializeVariables() {
    init_red_infrastructure_file();
  }

  public void runTopLevelForms() {
    setup_red_infrastructure_file();
  }

}
