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

package  com.cyc.cycjava_1.cycl;

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


import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.meta_macros;

public  final class access_macros extends SubLTranslatedFile {

  //// Constructor

  private access_macros() {}
  public static final SubLFile me = new access_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.access_macros";

  //// Definitions

  @SubL(source = "cycl/access-macros.lisp", position = 11270) 
  public static final SubLObject define_obsolete_register(SubLObject v_obsolete, SubLObject replacements) {
    return v_obsolete;
  }

  @SubL(source = "cycl/access-macros.lisp", position = 13012) 
  private static SubLSymbol $external_symbols$ = null;

  @SubL(source = "cycl/access-macros.lisp", position = 13278) 
  public static final SubLObject register_external_symbol(SubLObject symbol) {
    Hashtables.sethash(symbol, $external_symbols$.getGlobalValue(), T);
    return symbol;
  }

  @SubL(source = "cycl/access-macros.lisp", position = 16849) 
  private static SubLSymbol $external_access_methods$ = null;

  @SubL(source = "cycl/access-macros.lisp", position = 17509) 
  public static final SubLObject register_macro_helper(SubLObject helper, SubLObject macro) {
    {
      SubLObject macros = Symbols.get(helper, $kw57$MACRO_HELPER_FOR, UNPROVIDED);
      if (macro.isCons()) {
        {
          SubLObject cdolist_list_var = macro;
          SubLObject one_macro = NIL;
          for (one_macro = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), one_macro = cdolist_list_var.first()) {
            {
              SubLObject item_var = one_macro;
              if ((NIL == conses_high.member(item_var, macros, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                macros = cons(item_var, macros);
              }
            }
          }
        }
      } else {
        {
          SubLObject item_var = macro;
          if ((NIL == conses_high.member(item_var, macros, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
            macros = cons(item_var, macros);
          }
        }
      }
      Symbols.put(helper, $kw57$MACRO_HELPER_FOR, macros);
    }
    return helper;
  }

  public static final SubLObject declare_access_macros_file() {
    //declareMacro(myName, "define_public", "DEFINE-PUBLIC");
    //declareMacro(myName, "define_protected", "DEFINE-PROTECTED");
    //declareMacro(myName, "define_private", "DEFINE-PRIVATE");
    //declareMacro(myName, "define_macro_helper", "DEFINE-MACRO-HELPER");
    //declareFunction(myName, "symbol_or_symbol_list_p", "SYMBOL-OR-SYMBOL-LIST-P", 1, 0, false);
    //declareMacro(myName, "defmacro_public", "DEFMACRO-PUBLIC");
    //declareMacro(myName, "defmacro_protected", "DEFMACRO-PROTECTED");
    //declareMacro(myName, "defmacro_private", "DEFMACRO-PRIVATE");
    //declareMacro(myName, "defmacro_macro_helper", "DEFMACRO-MACRO-HELPER");
    //declareMacro(myName, "defconstant_public", "DEFCONSTANT-PUBLIC");
    //declareMacro(myName, "defconstant_protected", "DEFCONSTANT-PROTECTED");
    //declareMacro(myName, "defconstant_private", "DEFCONSTANT-PRIVATE");
    //declareMacro(myName, "deflexical_public", "DEFLEXICAL-PUBLIC");
    //declareMacro(myName, "deflexical_protected", "DEFLEXICAL-PROTECTED");
    //declareMacro(myName, "deflexical_private", "DEFLEXICAL-PRIVATE");
    //declareMacro(myName, "defparameter_public", "DEFPARAMETER-PUBLIC");
    //declareMacro(myName, "defparameter_protected", "DEFPARAMETER-PROTECTED");
    //declareMacro(myName, "defparameter_private", "DEFPARAMETER-PRIVATE");
    //declareMacro(myName, "defparameter_macro_helper", "DEFPARAMETER-MACRO-HELPER");
    //declareMacro(myName, "defglobal_public", "DEFGLOBAL-PUBLIC");
    //declareMacro(myName, "defglobal_protected", "DEFGLOBAL-PROTECTED");
    //declareMacro(myName, "defglobal_private", "DEFGLOBAL-PRIVATE");
    //declareMacro(myName, "defvar_public", "DEFVAR-PUBLIC");
    //declareMacro(myName, "defvar_protected", "DEFVAR-PROTECTED");
    //declareMacro(myName, "defvar_private", "DEFVAR-PRIVATE");
    //declareMacro(myName, "define_obsolete", "DEFINE-OBSOLETE");
    declareFunction(myName, "define_obsolete_register", "DEFINE-OBSOLETE-REGISTER", 2, 0, false);
    //declareMacro(myName, "defmacro_obsolete", "DEFMACRO-OBSOLETE");
    //declareFunction(myName, "defmacro_obsolete_warning", "DEFMACRO-OBSOLETE-WARNING", 2, 0, false);
    declareFunction(myName, "register_external_symbol", "REGISTER-EXTERNAL-SYMBOL", 1, 0, false);
    //declareFunction(myName, "external_symbol_p", "EXTERNAL-SYMBOL-P", 1, 0, false);
    //declareFunction(myName, "external_function_p", "EXTERNAL-FUNCTION-P", 1, 0, false);
    //declareFunction(myName, "external_macro_p", "EXTERNAL-MACRO-P", 1, 0, false);
    //declareFunction(myName, "all_external_symbols", "ALL-EXTERNAL-SYMBOLS", 0, 0, false);
    //declareMacro(myName, "define_external", "DEFINE-EXTERNAL");
    //declareMacro(myName, "defmacro_external", "DEFMACRO-EXTERNAL");
    //declareMacro(myName, "defconstant_external", "DEFCONSTANT-EXTERNAL");
    //declareMacro(myName, "deflexical_external", "DEFLEXICAL-EXTERNAL");
    //declareMacro(myName, "defparameter_external", "DEFPARAMETER-EXTERNAL");
    //declareMacro(myName, "defglobal_external", "DEFGLOBAL-EXTERNAL");
    //declareMacro(myName, "defvar_external", "DEFVAR-EXTERNAL");
    declareFunction(myName, "register_macro_helper", "REGISTER-MACRO-HELPER", 2, 0, false);
    //declareFunction(myName, "macro_helper_for_macroP", "MACRO-HELPER-FOR-MACRO?", 2, 0, false);
    //declareFunction(myName, "macro_helper_for_any_of_macrosP", "MACRO-HELPER-FOR-ANY-OF-MACROS?", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_access_macros_file() {
    $external_symbols$ = deflexical("*EXTERNAL-SYMBOLS*", ((NIL != Symbols.boundp($sym44$_EXTERNAL_SYMBOLS_)) ? ((SubLObject) $external_symbols$.getGlobalValue()) : Hashtables.make_hash_table($int45$400, Symbols.symbol_function(EQ), UNPROVIDED)));
    $external_access_methods$ = deflexical("*EXTERNAL-ACCESS-METHODS*", $list56);
    return NIL;
  }

  public static final SubLObject setup_access_macros_file() {
    // CVS_ID("Id: access-macros.lisp 126640 2008-12-04 13:39:36Z builder ");
    meta_macros.declare_indention_pattern($sym28$DEFPARAMETER_MACRO_HELPER, $list29);
    {
      SubLObject cdolist_list_var = $external_access_methods$.getGlobalValue();
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        register_external_symbol(symbol);
      }
    }
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym2$PROCLAIM = makeSymbol("PROCLAIM");
  public static final SubLSymbol $sym3$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym4$FACCESS = makeSymbol("FACCESS");
  public static final SubLSymbol $sym5$PUBLIC = makeSymbol("PUBLIC");
  public static final SubLSymbol $sym6$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym7$PROTECTED = makeSymbol("PROTECTED");
  public static final SubLSymbol $sym8$PRIVATE = makeSymbol("PRIVATE");
  public static final SubLList $list9 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list10 = list(makeKeyword("MACRO"));
  public static final SubLSymbol $kw11$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw12$MACRO = makeKeyword("MACRO");
  public static final SubLString $str13$Macro_or_list_of_macros_must_be_s = makeString("Macro or list of macros must be specified, not ~a");
  public static final SubLSymbol $sym14$REGISTER_MACRO_HELPER = makeSymbol("REGISTER-MACRO-HELPER");
  public static final SubLSymbol $sym15$DEFINE_PROTECTED = makeSymbol("DEFINE-PROTECTED");
  public static final SubLList $list16 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym17$DEFMACRO = makeSymbol("DEFMACRO");
  public static final SubLList $list18 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym19$DEFMACRO_PROTECTED = makeSymbol("DEFMACRO-PROTECTED");
  public static final SubLList $list20 = list(makeSymbol("VARIABLE"), makeSymbol("INITIALIZATION"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));
  public static final SubLSymbol $sym21$VACCESS = makeSymbol("VACCESS");
  public static final SubLSymbol $sym22$DEFCONSTANT = makeSymbol("DEFCONSTANT");
  public static final SubLList $list23 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));
  public static final SubLSymbol $sym24$DEFLEXICAL = makeSymbol("DEFLEXICAL");
  public static final SubLSymbol $sym25$DEFPARAMETER = makeSymbol("DEFPARAMETER");
  public static final SubLList $list26 = list(makeSymbol("VARIABLE"), list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));
  public static final SubLSymbol $sym27$DEFPARAMETER_PROTECTED = makeSymbol("DEFPARAMETER-PROTECTED");
  public static final SubLSymbol $sym28$DEFPARAMETER_MACRO_HELPER = makeSymbol("DEFPARAMETER-MACRO-HELPER");
  public static final SubLList $list29 = list(makeSymbol("VARIABLE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym30$DEFGLOBAL = makeSymbol("DEFGLOBAL");
  public static final SubLSymbol $sym31$DEFVAR = makeSymbol("DEFVAR");
  public static final SubLList $list32 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), list(makeSymbol("&KEY"), makeSymbol("REPLACEMENTS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list33 = list(makeKeyword("REPLACEMENTS"));
  public static final SubLSymbol $kw34$REPLACEMENTS = makeKeyword("REPLACEMENTS");
  public static final SubLString $str35$Method_or_list_of_methods_must_be = makeString("Method or list of methods must be specified, not ~a");
  public static final SubLSymbol $sym36$DEFINE_OBSOLETE_REGISTER = makeSymbol("DEFINE-OBSOLETE-REGISTER");
  public static final SubLList $list37 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), list(makeSymbol("&KEY"), makeSymbol("REPLACEMENTS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym38$DEFMACRO_OBSOLETE_WARNING = makeSymbol("DEFMACRO-OBSOLETE-WARNING");
  public static final SubLString $str39$Macro__S_is_obsolete = makeString("Macro ~S is obsolete");
  public static final SubLString $str40$____use_ = makeString(" -- use ");
  public static final SubLString $str41$_S_ = makeString("~S ");
  public static final SubLString $str42$instead_ = makeString("instead.");
  public static final SubLString $str43$_A = makeString("~A");
  public static final SubLSymbol $sym44$_EXTERNAL_SYMBOLS_ = makeSymbol("*EXTERNAL-SYMBOLS*");
  public static final SubLInteger $int45$400 = makeInteger(400);
  public static final SubLSymbol $sym46$STRING_LESSP = makeSymbol("STRING-LESSP");
  public static final SubLSymbol $sym47$SYMBOL_NAME = makeSymbol("SYMBOL-NAME");
  public static final SubLSymbol $sym48$REGISTER_EXTERNAL_SYMBOL = makeSymbol("REGISTER-EXTERNAL-SYMBOL");
  public static final SubLSymbol $sym49$DEFINE_PUBLIC = makeSymbol("DEFINE-PUBLIC");
  public static final SubLSymbol $sym50$DEFMACRO_PUBLIC = makeSymbol("DEFMACRO-PUBLIC");
  public static final SubLSymbol $sym51$DEFCONSTANT_PUBLIC = makeSymbol("DEFCONSTANT-PUBLIC");
  public static final SubLSymbol $sym52$DEFLEXICAL_PUBLIC = makeSymbol("DEFLEXICAL-PUBLIC");
  public static final SubLSymbol $sym53$DEFPARAMETER_PUBLIC = makeSymbol("DEFPARAMETER-PUBLIC");
  public static final SubLSymbol $sym54$DEFGLOBAL_PUBLIC = makeSymbol("DEFGLOBAL-PUBLIC");
  public static final SubLSymbol $sym55$DEFVAR_PUBLIC = makeSymbol("DEFVAR-PUBLIC");
  public static final SubLList $list56 = list(new SubLObject[] {makeSymbol("DEFINE-PRIVATE"), makeSymbol("DEFINE-PROTECTED"), makeSymbol("DEFINE-PUBLIC"), makeSymbol("DEFINE-MACRO-HELPER"), makeSymbol("DEFMACRO-PRIVATE"), makeSymbol("DEFMACRO-PROTECTED"), makeSymbol("DEFMACRO-PUBLIC"), makeSymbol("DEFMACRO-MACRO-HELPER"), makeSymbol("DEFCONSTANT-PRIVATE"), makeSymbol("DEFCONSTANT-PROTECTED"), makeSymbol("DEFCONSTANT-PUBLIC"), makeSymbol("DEFLEXICAL-PRIVATE"), makeSymbol("DEFLEXICAL-PROTECTED"), makeSymbol("DEFLEXICAL-PUBLIC"), makeSymbol("DEFGLOBAL-PRIVATE"), makeSymbol("DEFGLOBAL-PROTECTED"), makeSymbol("DEFGLOBAL-PUBLIC"), makeSymbol("DEFPARAMETER-PRIVATE"), makeSymbol("DEFPARAMETER-PROTECTED"), makeSymbol("DEFPARAMETER-PUBLIC"), makeSymbol("DEFVAR-PRIVATE"), makeSymbol("DEFVAR-PROTECTED"), makeSymbol("DEFVAR-PUBLIC")});
  public static final SubLSymbol $kw57$MACRO_HELPER_FOR = makeKeyword("MACRO-HELPER-FOR");

  //// Initializers

  public void declareFunctions() {
    declare_access_macros_file();
  }

  public void initializeVariables() {
    init_access_macros_file();
  }

  public void runTopLevelForms() {
    setup_access_macros_file();
  }

}
