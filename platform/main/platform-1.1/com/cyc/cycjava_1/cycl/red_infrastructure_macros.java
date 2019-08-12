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
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.red_infrastructure;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class red_infrastructure_macros extends SubLTranslatedFile {

  //// Constructor

  private red_infrastructure_macros() {}
  public static final SubLFile me = new red_infrastructure_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.red_infrastructure_macros";

  //// Definitions

  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 17262) 
  public static final SubLObject red_def_helper(SubLObject key, SubLObject name, SubLObject defaultvalue, SubLObject ltype, SubLObject valuetype) {
    if ((valuetype == UNPROVIDED)) {
      valuetype = $kw29$SIMPLE;
    }
    {
      SubLObject red_sym = red_infrastructure.new_red_symbol(key, name, defaultvalue, ltype, valuetype);
      red_infrastructure.register_red(red_sym);
      return red_infrastructure.red_value(red_sym);
    }
  }

  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 18844) 
  private static SubLSymbol $red_infrastructure_test_key$ = null;

  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20452) 
  private static SubLSymbol $red_infrastructure_test_default$ = null;

  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20515) 
  private static SubLSymbol $red_infrastructure_test_red_value$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20622) 
  private static SubLSymbol $reddef_lex_prvt_2$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20741) 
  private static SubLSymbol $reddef_lex_prvt$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20889) 
  public static SubLSymbol $reddef_lex_prot$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21034) 
  public static SubLSymbol $reddef_lex_publ$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21179) 
  private static SubLSymbol $reddef_par_prvt$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21321) 
  public static SubLSymbol $reddef_par_prot$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21468) 
  public static SubLSymbol $reddef_par_publ$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21615) 
  private static SubLSymbol $reddef_var_prvt$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21754) 
  public static SubLSymbol $reddef_var_prot$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21895) 
  public static SubLSymbol $reddef_var_publ$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 22036) 
  private static SubLSymbol $reddef_gbl_prvt$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 22178) 
  public static SubLSymbol $reddef_gbl_prot$ = null;

  /** dummy doc info */
  @SubL(source = "cycl/red-infrastructure-macros.lisp", position = 22322) 
  public static SubLSymbol $reddef_gbl_publ$ = null;

  public static final SubLObject declare_red_infrastructure_macros_file() {
    //declareMacro(myName, "define_red_parameter_public", "DEFINE-RED-PARAMETER-PUBLIC");
    //declareMacro(myName, "define_red_parameter_protected", "DEFINE-RED-PARAMETER-PROTECTED");
    //declareMacro(myName, "define_red_parameter_private", "DEFINE-RED-PARAMETER-PRIVATE");
    //declareMacro(myName, "define_red_lexical_public", "DEFINE-RED-LEXICAL-PUBLIC");
    //declareMacro(myName, "define_red_lexical_protected", "DEFINE-RED-LEXICAL-PROTECTED");
    //declareMacro(myName, "define_red_lexical_private", "DEFINE-RED-LEXICAL-PRIVATE");
    //declareMacro(myName, "define_red_global_public", "DEFINE-RED-GLOBAL-PUBLIC");
    //declareMacro(myName, "define_red_global_protected", "DEFINE-RED-GLOBAL-PROTECTED");
    //declareMacro(myName, "define_red_global_private", "DEFINE-RED-GLOBAL-PRIVATE");
    //declareMacro(myName, "define_red_var_public", "DEFINE-RED-VAR-PUBLIC");
    //declareMacro(myName, "define_red_var_protected", "DEFINE-RED-VAR-PROTECTED");
    //declareMacro(myName, "define_red_var_private", "DEFINE-RED-VAR-PRIVATE");
    //declareMacro(myName, "define_red_list_parameter_public", "DEFINE-RED-LIST-PARAMETER-PUBLIC");
    //declareMacro(myName, "define_red_list_parameter_protected", "DEFINE-RED-LIST-PARAMETER-PROTECTED");
    //declareMacro(myName, "define_red_list_parameter_private", "DEFINE-RED-LIST-PARAMETER-PRIVATE");
    //declareMacro(myName, "define_red_list_lexical_public", "DEFINE-RED-LIST-LEXICAL-PUBLIC");
    //declareMacro(myName, "define_red_list_lexical_protected", "DEFINE-RED-LIST-LEXICAL-PROTECTED");
    //declareMacro(myName, "define_red_list_lexical_private", "DEFINE-RED-LIST-LEXICAL-PRIVATE");
    //declareMacro(myName, "define_red_list_global_public", "DEFINE-RED-LIST-GLOBAL-PUBLIC");
    //declareMacro(myName, "define_red_list_global_protected", "DEFINE-RED-LIST-GLOBAL-PROTECTED");
    //declareMacro(myName, "define_red_list_global_private", "DEFINE-RED-LIST-GLOBAL-PRIVATE");
    //declareMacro(myName, "define_red_list_var_public", "DEFINE-RED-LIST-VAR-PUBLIC");
    //declareMacro(myName, "define_red_list_var_protected", "DEFINE-RED-LIST-VAR-PROTECTED");
    //declareMacro(myName, "define_red_list_var_private", "DEFINE-RED-LIST-VAR-PRIVATE");
    //declareMacro(myName, "red_reinitialize_variable", "RED-REINITIALIZE-VARIABLE");
    declareFunction(myName, "red_def_helper", "RED-DEF-HELPER", 4, 1, false);
    //declareFunction(myName, "red_reinitialize_variable_helper", "RED-REINITIALIZE-VARIABLE-HELPER", 1, 0, false);
    //declareFunction(myName, "red_infa_unit_test", "RED-INFA-UNIT-TEST", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_red_infrastructure_macros_file() {
    $red_infrastructure_test_key$ = defconstant("*RED-INFRASTRUCTURE-TEST-KEY*", $list31);
    $red_infrastructure_test_default$ = defconstant("*RED-INFRASTRUCTURE-TEST-DEFAULT*", $str32$dflt);
    $red_infrastructure_test_red_value$ = defconstant("*RED-INFRASTRUCTURE-TEST-RED-VALUE*", $str33$_cyc_CycC_Linux_head_run_world_la);
    $reddef_lex_prvt_2$ = deflexical("REDDEF-LEX-PRVT-2", red_def_helper(($list31.isSymbol() ? ((SubLObject) Symbols.symbol_value($list31)) : $list31), $sym34$REDDEF_LEX_PRVT_2, ($str32$dflt.isSymbol() ? ((SubLObject) Symbols.symbol_value($str32$dflt)) : $str32$dflt), $kw35$LEXICAL, UNPROVIDED));
    $reddef_lex_prvt$ = deflexical("REDDEF-LEX-PRVT", red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym37$REDDEF_LEX_PRVT, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw35$LEXICAL, UNPROVIDED));
    $reddef_lex_prot$ = deflexical("REDDEF-LEX-PROT", red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym39$REDDEF_LEX_PROT, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw35$LEXICAL, UNPROVIDED));
    $reddef_lex_publ$ = deflexical("REDDEF-LEX-PUBL", red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym40$REDDEF_LEX_PUBL, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw35$LEXICAL, UNPROVIDED));
    $reddef_par_prvt$ = defparameter("REDDEF-PAR-PRVT", red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym41$REDDEF_PAR_PRVT, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw42$PARAMETER, UNPROVIDED));
    $reddef_par_prot$ = defparameter("REDDEF-PAR-PROT", red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym43$REDDEF_PAR_PROT, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw42$PARAMETER, UNPROVIDED));
    $reddef_par_publ$ = defparameter("REDDEF-PAR-PUBL", red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym44$REDDEF_PAR_PUBL, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw42$PARAMETER, UNPROVIDED));
    $reddef_var_prvt$ = defvar("REDDEF-VAR-PRVT", red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym45$REDDEF_VAR_PRVT, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw46$VAR, UNPROVIDED));
    $reddef_var_prot$ = defvar("REDDEF-VAR-PROT", red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym47$REDDEF_VAR_PROT, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw46$VAR, UNPROVIDED));
    $reddef_var_publ$ = defvar("REDDEF-VAR-PUBL", red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym48$REDDEF_VAR_PUBL, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw46$VAR, UNPROVIDED));
    $reddef_gbl_prvt$ = deflexical("REDDEF-GBL-PRVT", maybeDefault( $sym49$REDDEF_GBL_PRVT, $reddef_gbl_prvt$, ()-> (red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym49$REDDEF_GBL_PRVT, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw50$GLOBAL, UNPROVIDED))));
    $reddef_gbl_prot$ = deflexical("REDDEF-GBL-PROT", maybeDefault( $sym51$REDDEF_GBL_PROT, $reddef_gbl_prot$, ()-> (red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym51$REDDEF_GBL_PROT, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw50$GLOBAL, UNPROVIDED))));
    $reddef_gbl_publ$ = deflexical("REDDEF-GBL-PUBL", maybeDefault( $sym52$REDDEF_GBL_PUBL, $reddef_gbl_publ$, ()-> (red_def_helper(($sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym36$_RED_INFRASTRUCTURE_TEST_KEY_)) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_), $sym52$REDDEF_GBL_PUBL, ($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? ((SubLObject) Symbols.symbol_value($sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_)) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), $kw50$GLOBAL, UNPROVIDED))));
    return NIL;
  }

  public static final SubLObject setup_red_infrastructure_macros_file() {
        access_macros.register_macro_helper($sym2$RED_DEF_HELPER, $list28);
    access_macros.register_macro_helper($sym27$RED_REINITIALIZE_VARIABLE_HELPER, $sym30$RED_REINITIALIZE_VARIABLE);
    subl_macro_promotions.declare_defglobal($sym49$REDDEF_GBL_PRVT);
    subl_macro_promotions.declare_defglobal($sym51$REDDEF_GBL_PROT);
    subl_macro_promotions.declare_defglobal($sym52$REDDEF_GBL_PUBL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("KEY"), makeSymbol("NAME"), makeSymbol("DEFAULTVALUE"), makeSymbol("DESCRIPTION"));
  public static final SubLSymbol $sym1$DEFPARAMETER_PUBLIC = makeSymbol("DEFPARAMETER-PUBLIC");
  public static final SubLSymbol $sym2$RED_DEF_HELPER = makeSymbol("RED-DEF-HELPER");
  public static final SubLSymbol $sym3$FIF = makeSymbol("FIF");
  public static final SubLSymbol $sym4$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym5$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym6$SYMBOL_VALUE = makeSymbol("SYMBOL-VALUE");
  public static final SubLList $list7 = list(makeKeyword("PARAMETER"));
  public static final SubLSymbol $sym8$DEFPARAMETER_PROTECTED = makeSymbol("DEFPARAMETER-PROTECTED");
  public static final SubLSymbol $sym9$DEFPARAMETER_PRIVATE = makeSymbol("DEFPARAMETER-PRIVATE");
  public static final SubLSymbol $sym10$DEFLEXICAL_PUBLIC = makeSymbol("DEFLEXICAL-PUBLIC");
  public static final SubLList $list11 = list(makeKeyword("LEXICAL"));
  public static final SubLSymbol $sym12$DEFLEXICAL_PROTECTED = makeSymbol("DEFLEXICAL-PROTECTED");
  public static final SubLSymbol $sym13$DEFLEXICAL_PRIVATE = makeSymbol("DEFLEXICAL-PRIVATE");
  public static final SubLSymbol $sym14$DEFGLOBAL_PUBLIC = makeSymbol("DEFGLOBAL-PUBLIC");
  public static final SubLList $list15 = list(makeKeyword("GLOBAL"));
  public static final SubLSymbol $sym16$DEFGLOBAL_PROTECTED = makeSymbol("DEFGLOBAL-PROTECTED");
  public static final SubLSymbol $sym17$DEFGLOBAL_PRIVATE = makeSymbol("DEFGLOBAL-PRIVATE");
  public static final SubLSymbol $sym18$DEFVAR_PUBLIC = makeSymbol("DEFVAR-PUBLIC");
  public static final SubLList $list19 = list(makeKeyword("VAR"));
  public static final SubLSymbol $sym20$DEFVAR_PROTECTED = makeSymbol("DEFVAR-PROTECTED");
  public static final SubLSymbol $sym21$DEFVAR_PRIVATE = makeSymbol("DEFVAR-PRIVATE");
  public static final SubLList $list22 = list(makeKeyword("PARAMETER"), makeKeyword("LIST"));
  public static final SubLList $list23 = list(makeKeyword("LEXICAL"), makeKeyword("LIST"));
  public static final SubLList $list24 = list(makeKeyword("GLOBAL"), makeKeyword("LIST"));
  public static final SubLList $list25 = list(makeKeyword("VAR"), makeKeyword("LIST"));
  public static final SubLList $list26 = list(makeSymbol("NAME"));
  public static final SubLSymbol $sym27$RED_REINITIALIZE_VARIABLE_HELPER = makeSymbol("RED-REINITIALIZE-VARIABLE-HELPER");
  public static final SubLList $list28 = list(new SubLObject[] {makeSymbol("DEFINE-RED-PARAMETER-PUBLIC"), makeSymbol("DEFINE-RED-PARAMETER-PROTECTED"), makeSymbol("DEFINE-RED-PARAMETER-PRIVATE"), makeSymbol("DEFINE-RED-LEXICAL-PUBLIC"), makeSymbol("DEFINE-RED-LEXICAL-PROTECTED"), makeSymbol("DEFINE-RED-LEXICAL-PRIVATE"), makeSymbol("DEFINE-RED-GLOBAL-PUBLIC"), makeSymbol("DEFINE-RED-GLOBAL-PROTECTED"), makeSymbol("DEFINE-RED-GLOBAL-PRIVATE"), makeSymbol("DEFINE-RED-VAR-PUBLIC"), makeSymbol("DEFINE-RED-VAR-PROTECTED"), makeSymbol("DEFINE-RED-VAR-PRIVATE"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PUBLIC"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PROTECTED"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PRIVATE"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PUBLIC"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PROTECTED"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PRIVATE"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PUBLIC"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PROTECTED"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PRIVATE"), makeSymbol("DEFINE-RED-LIST-VAR-PUBLIC"), makeSymbol("DEFINE-RED-LIST-VAR-PROTECTED"), makeSymbol("DEFINE-RED-LIST-VAR-PRIVATE")});
  public static final SubLSymbol $kw29$SIMPLE = makeKeyword("SIMPLE");
  public static final SubLSymbol $sym30$RED_REINITIALIZE_VARIABLE = makeSymbol("RED-REINITIALIZE-VARIABLE");
  public static final SubLList $list31 = list(makeString("redtest.crtl.worldfile"));
  public static final SubLString $str32$dflt = makeString("dflt");
  public static final SubLString $str33$_cyc_CycC_Linux_head_run_world_la = makeString("/cyc/CycC/Linux/head/run/world/latest.load");
  public static final SubLSymbol $sym34$REDDEF_LEX_PRVT_2 = makeSymbol("REDDEF-LEX-PRVT-2");
  public static final SubLSymbol $kw35$LEXICAL = makeKeyword("LEXICAL");
  public static final SubLSymbol $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ = makeSymbol("*RED-INFRASTRUCTURE-TEST-KEY*");
  public static final SubLSymbol $sym37$REDDEF_LEX_PRVT = makeSymbol("REDDEF-LEX-PRVT");
  public static final SubLSymbol $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ = makeSymbol("*RED-INFRASTRUCTURE-TEST-DEFAULT*");
  public static final SubLSymbol $sym39$REDDEF_LEX_PROT = makeSymbol("REDDEF-LEX-PROT");
  public static final SubLSymbol $sym40$REDDEF_LEX_PUBL = makeSymbol("REDDEF-LEX-PUBL");
  public static final SubLSymbol $sym41$REDDEF_PAR_PRVT = makeSymbol("REDDEF-PAR-PRVT");
  public static final SubLSymbol $kw42$PARAMETER = makeKeyword("PARAMETER");
  public static final SubLSymbol $sym43$REDDEF_PAR_PROT = makeSymbol("REDDEF-PAR-PROT");
  public static final SubLSymbol $sym44$REDDEF_PAR_PUBL = makeSymbol("REDDEF-PAR-PUBL");
  public static final SubLSymbol $sym45$REDDEF_VAR_PRVT = makeSymbol("REDDEF-VAR-PRVT");
  public static final SubLSymbol $kw46$VAR = makeKeyword("VAR");
  public static final SubLSymbol $sym47$REDDEF_VAR_PROT = makeSymbol("REDDEF-VAR-PROT");
  public static final SubLSymbol $sym48$REDDEF_VAR_PUBL = makeSymbol("REDDEF-VAR-PUBL");
  public static final SubLSymbol $sym49$REDDEF_GBL_PRVT = makeSymbol("REDDEF-GBL-PRVT");
  public static final SubLSymbol $kw50$GLOBAL = makeKeyword("GLOBAL");
  public static final SubLSymbol $sym51$REDDEF_GBL_PROT = makeSymbol("REDDEF-GBL-PROT");
  public static final SubLSymbol $sym52$REDDEF_GBL_PUBL = makeSymbol("REDDEF-GBL-PUBL");
  public static final SubLString $str53$reddef_gbl_publ_didn_t_have_the_d = makeString("reddef-gbl-publ didn't have the default value(~s) ~s~%");
  public static final SubLString $str54$reddef_gbl_prot_didn_t_have_the_d = makeString("reddef-gbl-prot didn't have the default value(~s) ~s~%");
  public static final SubLString $str55$reddef_gbl_prvt_didn_t_have_the_d = makeString("reddef-gbl-prvt didn't have the default value(~s) ~s~%");
  public static final SubLString $str56$reddef_var_publ_didn_t_have_the_d = makeString("reddef-var-publ didn't have the default value(~s) ~s~%");
  public static final SubLString $str57$reddef_var_prot_didn_t_have_the_d = makeString("reddef-var-prot didn't have the default value(~s) ~s~%");
  public static final SubLString $str58$reddef_var_prvt_didn_t_have_the_d = makeString("reddef-var-prvt didn't have the default value(~s) ~s~%");
  public static final SubLString $str59$reddef_lex_publ_didn_t_have_the_d = makeString("reddef-lex-publ didn't have the default value(~s) ~s~%");
  public static final SubLString $str60$reddef_lex_prot_didn_t_have_the_d = makeString("reddef-lex-prot didn't have the default value(~s) ~s~%");
  public static final SubLString $str61$reddef_lex_prvt_didn_t_have_the_d = makeString("reddef-lex-prvt didn't have the default value(~s) ~s~%");
  public static final SubLString $str62$reddef_lex_prvt_2_didn_t_have_the = makeString("reddef-lex-prvt-2 didn't have the default value(~s) ~s~%");
  public static final SubLString $str63$reddef_par_publ_didn_t_have_the_d = makeString("reddef-par-publ didn't have the default value(~s) ~s~%");
  public static final SubLString $str64$reddef_par_prot_didn_t_have_the_d = makeString("reddef-par-prot didn't have the default value(~s) ~s~%");
  public static final SubLString $str65$reddef_par_prvt_didn_t_have_the_d = makeString("reddef-par-prvt didn't have the default value(~s) ~s~%");
  public static final SubLString $str66$reddef_gbl_publ_didn_t_have_the_v = makeString("reddef-gbl-publ didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str67$reddef_gbl_prot_didn_t_have_the_v = makeString("reddef-gbl-prot didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str68$reddef_gbl_prvt_didn_t_have_the_v = makeString("reddef-gbl-prvt didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str69$reddef_var_publ_didn_t_have_the_v = makeString("reddef-var-publ didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str70$reddef_var_prot_didn_t_have_the_v = makeString("reddef-var-prot didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str71$reddef_var_prvt_didn_t_have_the_v = makeString("reddef-var-prvt didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str72$reddef_lex_publ_didn_t_have_the_v = makeString("reddef-lex-publ didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str73$reddef_lex_prot_didn_t_have_the_v = makeString("reddef-lex-prot didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str74$reddef_lex_prvt_didn_t_have_the_v = makeString("reddef-lex-prvt didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str75$reddef_lex_prvt_2_didn_t_have_the = makeString("reddef-lex-prvt-2 didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str76$reddef_par_publ_didn_t_have_the_v = makeString("reddef-par-publ didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str77$reddef_par_prot_didn_t_have_the_v = makeString("reddef-par-prot didn't have the value from the red repository(~s) ~s~%");
  public static final SubLString $str78$reddef_par_prvt_didn_t_have_the_v = makeString("reddef-par-prvt didn't have the value from the red repository(~s) ~s~%");

  //// Initializers

  public void declareFunctions() {
    declare_red_infrastructure_macros_file();
  }

  public void initializeVariables() {
    init_red_infrastructure_macros_file();
  }

  public void runTopLevelForms() {
    setup_red_infrastructure_macros_file();
  }

}
