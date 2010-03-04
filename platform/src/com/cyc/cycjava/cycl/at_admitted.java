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
import com.cyc.cycjava.cycl.arg_type;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.at_macros;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.wff_macros;
import com.cyc.cycjava.cycl.wff_utilities;
import com.cyc.cycjava.cycl.wff_vars;

public  final class at_admitted extends SubLTranslatedFile {

  //// Constructor

  private at_admitted() {}
  public static final SubLFile me = new at_admitted();
  public static final String myName = "com.cyc.cycjava.cycl.at_admitted";

  //// Definitions

  public static final class $generic_arg_p$UnaryFunction extends UnaryFunction {
    public $generic_arg_p$UnaryFunction() { super(extractFunctionNamed("GENERIC-ARG-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3470"); }
  }

  @SubL(source = "cycl/at-admitted.lisp", position = 9468) 
  private static SubLSymbol $at_candidate_relations_table$ = null;

  @SubL(source = "cycl/at-admitted.lisp", position = 9666) 
  private static SubLSymbol $at_candidate_relations_argnums_table$ = null;

  @SubL(source = "cycl/at-admitted.lisp", position = 9732) 
  private static SubLSymbol $at_candidate_relations_sbhl_space$ = null;

  @SubL(source = "cycl/at-admitted.lisp", position = 9795) 
  private static SubLSymbol $at_cr_mapping_result$ = null;

  @SubL(source = "cycl/at-admitted.lisp", position = 9845) 
  private static SubLSymbol $at_cr_arg_isa_pred$ = null;

  @SubL(source = "cycl/at-admitted.lisp", position = 9893) 
  private static SubLSymbol $at_cr_argnum$ = null;

  /** estimated max number of candidate relations */
  @SubL(source = "cycl/at-admitted.lisp", position = 9935) 
  private static SubLSymbol $at_candidate_relations_max$ = null;

  /** hashtable mapping relations -> boolean */
  @SubL(source = "cycl/at-admitted.lisp", position = 14175) 
  private static SubLSymbol $ira_table$ = null;

  /** an integer */
  @SubL(source = "cycl/at-admitted.lisp", position = 14462) 
  private static SubLSymbol $ira_argnum$ = null;

  /** estimated number of applicable relations */
  @SubL(source = "cycl/at-admitted.lisp", position = 14517) 
  private static SubLSymbol $ira_relations_estimate$ = null;

  @SubL(source = "cycl/at-admitted.lisp", position = 14614) 
  private static SubLSymbol $ira_isa_sbhl_space$ = null;

  /** one of #$arg1Isa, #$arg2Isa, etc. */
  @SubL(source = "cycl/at-admitted.lisp", position = 14662) 
  private static SubLSymbol $ira_arg_isa_pred$ = null;

  @SubL(source = "cycl/at-admitted.lisp", position = 14746) 
  private static SubLSymbol $ira_genl_sbhl_space$ = null;

  /** one of #$arg1Genl, #$arg2Genl, etc. */
  @SubL(source = "cycl/at-admitted.lisp", position = 14795) 
  private static SubLSymbol $ira_arg_genl_pred$ = null;

  @SubL(source = "cycl/at-admitted.lisp", position = 14882) 
  private static SubLSymbol $ira_mapping_result$ = null;

  public static final SubLObject declare_at_admitted_file() {
    //declareFunction(myName, "admitted_argumentP_internal", "ADMITTED-ARGUMENT?-INTERNAL", 3, 1, false);
    //declareFunction(myName, "admitted_argumentP", "ADMITTED-ARGUMENT?", 3, 1, false);
    //declareFunction(myName, "admitted_argument_intP", "ADMITTED-ARGUMENT-INT?", 4, 0, false);
    //declareFunction(myName, "admitted_formulaP", "ADMITTED-FORMULA?", 1, 1, false);
    //declareFunction(myName, "admitted_sentenceP", "ADMITTED-SENTENCE?", 1, 1, false);
    //declareFunction(myName, "admitted_sentence_wrt_asent_arg_constraintsP", "ADMITTED-SENTENCE-WRT-ASENT-ARG-CONSTRAINTS?", 1, 0, false);
    //declareFunction(myName, "admitted_atomic_sentence_wrt_arg_constraintsP", "ADMITTED-ATOMIC-SENTENCE-WRT-ARG-CONSTRAINTS?", 1, 0, false);
    //declareFunction(myName, "admitted_argument_plus_inter_arg_isaP", "ADMITTED-ARGUMENT-PLUS-INTER-ARG-ISA?", 3, 0, false);
    //declareFunction(myName, "generic_arg_p", "GENERIC-ARG-P", 1, 0, false); new $generic_arg_p$UnaryFunction();
    //declareFunction(myName, "relations_admitting_fort_as_arg", "RELATIONS-ADMITTING-FORT-AS-ARG", 2, 2, false);
    //declareFunction(myName, "relations_admitting_fort_as_any_of_args", "RELATIONS-ADMITTING-FORT-AS-ANY-OF-ARGS", 2, 1, false);
    //declareFunction(myName, "at_candidate_relations_admitting_fort", "AT-CANDIDATE-RELATIONS-ADMITTING-FORT", 2, 1, false);
    //declareFunction(myName, "at_cr_hash_relations", "AT-CR-HASH-RELATIONS", 1, 0, false);
    //declareFunction(myName, "at_cr_hash_relations_by_argnum", "AT-CR-HASH-RELATIONS-BY-ARGNUM", 1, 0, false);
    //declareFunction(myName, "at_cr_all_arg_isa_cachedP", "AT-CR-ALL-ARG-ISA-CACHED?", 2, 0, false);
    //declareFunction(myName, "at_cr_argisa_col_searchedP", "AT-CR-ARGISA-COL-SEARCHED?", 1, 0, false);
    //declareFunction(myName, "inference_relations_admitting_fort_as_arg", "INFERENCE-RELATIONS-ADMITTING-FORT-AS-ARG", 2, 1, false);
    //declareFunction(myName, "inference_relations_admitting_naut_as_arg", "INFERENCE-RELATIONS-ADMITTING-NAUT-AS-ARG", 2, 1, false);
    //declareFunction(myName, "inference_relations_admitting_term_as_arg_int", "INFERENCE-RELATIONS-ADMITTING-TERM-AS-ARG-INT", 1, 0, false);
    //declareFunction(myName, "ira_isa_hash_relations", "IRA-ISA-HASH-RELATIONS", 1, 0, false);
    //declareFunction(myName, "ira_all_arg_isa_cachedP", "IRA-ALL-ARG-ISA-CACHED?", 1, 0, false);
    //declareFunction(myName, "ira_argisa_col_searchedP", "IRA-ARGISA-COL-SEARCHED?", 1, 0, false);
    //declareFunction(myName, "ira_genl_hash_relations", "IRA-GENL-HASH-RELATIONS", 1, 0, false);
    //declareFunction(myName, "ira_all_arg_genl_cachedP", "IRA-ALL-ARG-GENL-CACHED?", 1, 0, false);
    //declareFunction(myName, "ira_arggenl_col_searchedP", "IRA-ARGGENL-COL-SEARCHED?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_at_admitted_file() {
    $at_candidate_relations_table$ = defparameter("*AT-CANDIDATE-RELATIONS-TABLE*", NIL);
    $at_candidate_relations_argnums_table$ = defparameter("*AT-CANDIDATE-RELATIONS-ARGNUMS-TABLE*", NIL);
    $at_candidate_relations_sbhl_space$ = defparameter("*AT-CANDIDATE-RELATIONS-SBHL-SPACE*", NIL);
    $at_cr_mapping_result$ = defparameter("*AT-CR-MAPPING-RESULT*", NIL);
    $at_cr_arg_isa_pred$ = defparameter("*AT-CR-ARG-ISA-PRED*", NIL);
    $at_cr_argnum$ = defparameter("*AT-CR-ARGNUM*", NIL);
    $at_candidate_relations_max$ = deflexical("*AT-CANDIDATE-RELATIONS-MAX*", $int10$512);
    $ira_table$ = defparameter("*IRA-TABLE*", NIL);
    $ira_argnum$ = defparameter("*IRA-ARGNUM*", NIL);
    $ira_relations_estimate$ = defparameter("*IRA-RELATIONS-ESTIMATE*", $int10$512);
    $ira_isa_sbhl_space$ = defparameter("*IRA-ISA-SBHL-SPACE*", NIL);
    $ira_arg_isa_pred$ = defparameter("*IRA-ARG-ISA-PRED*", NIL);
    $ira_genl_sbhl_space$ = defparameter("*IRA-GENL-SBHL-SPACE*", NIL);
    $ira_arg_genl_pred$ = defparameter("*IRA-ARG-GENL-PRED*", NIL);
    $ira_mapping_result$ = defparameter("*IRA-MAPPING-RESULT*", NIL);
    return NIL;
  }

  public static final SubLObject setup_at_admitted_file() {
    // CVS_ID("Id: at-admitted.lisp 126640 2008-12-04 13:39:36Z builder ");
    memoization_state.note_memoized_function($sym0$ADMITTED_ARGUMENT_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$ADMITTED_ARGUMENT_ = makeSymbol("ADMITTED-ARGUMENT?");
  public static final SubLSymbol $sym1$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $kw2$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $kw3$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $sym4$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $kw5$STRONG_FORT = makeKeyword("STRONG-FORT");
  public static final SubLSymbol $kw6$ISA = makeKeyword("ISA");
  public static final SubLObject $const7$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const8$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLSymbol $kw9$GENLS = makeKeyword("GENLS");
  public static final SubLInteger $int10$512 = makeInteger(512);
  public static final SubLSymbol $sym11$CONSP = makeSymbol("CONSP");
  public static final SubLSymbol $sym12$AT_CR_HASH_RELATIONS = makeSymbol("AT-CR-HASH-RELATIONS");
  public static final SubLSymbol $sym13$AT_CR_HASH_RELATIONS_BY_ARGNUM = makeSymbol("AT-CR-HASH-RELATIONS-BY-ARGNUM");
  public static final SubLString $str14$no_mapping_method_defiend_for_sbh = makeString("no mapping method defiend for sbhl-table ~s");
  public static final SubLSymbol $kw15$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw16$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const17$argsIsa = constant_handles.reader_make_constant_shell(makeString("argsIsa"));
  public static final SubLObject $const18$argIsa = constant_handles.reader_make_constant_shell(makeString("argIsa"));
  public static final SubLSymbol $sym19$AT_CR_ARGISA_COL_SEARCHED_ = makeSymbol("AT-CR-ARGISA-COL-SEARCHED?");
  public static final SubLSymbol $sym20$NAUT_ = makeSymbol("NAUT?");
  public static final SubLSymbol $sym21$IRA_ARGISA_COL_SEARCHED_ = makeSymbol("IRA-ARGISA-COL-SEARCHED?");
  public static final SubLObject $const22$argsGenl = constant_handles.reader_make_constant_shell(makeString("argsGenl"));
  public static final SubLSymbol $sym23$IRA_ARGGENL_COL_SEARCHED_ = makeSymbol("IRA-ARGGENL-COL-SEARCHED?");

  //// Initializers

  public void declareFunctions() {
    declare_at_admitted_file();
  }

  public void initializeVariables() {
    init_at_admitted_file();
  }

  public void runTopLevelForms() {
    setup_at_admitted_file();
  }

}
