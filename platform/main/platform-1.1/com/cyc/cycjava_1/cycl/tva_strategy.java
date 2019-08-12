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
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.ghl_search_methods;
//dm import com.cyc.cycjava_1.cycl.gt_utilities;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.tva_inference;
//dm import com.cyc.cycjava_1.cycl.tva_tactic;
//dm import com.cyc.cycjava_1.cycl.tva_utilities;

public  final class tva_strategy extends SubLTranslatedFile {

  //// Constructor

  private tva_strategy() {}
  public static final SubLFile me = new tva_strategy();
  public static final String myName = "com.cyc.cycjava_1.cycl.tva_strategy";

  //// Definitions

  public static final class $tva_strategy_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $inverse_mode_p; }
    public SubLObject getField3() { return $argnums_unified; }
    public SubLObject getField4() { return $argnums_remaining; }
    public SubLObject getField5() { return $tactics; }
    public SubLObject getField6() { return $tactics_considered; }
    public SubLObject setField2(SubLObject value) { return $inverse_mode_p = value; }
    public SubLObject setField3(SubLObject value) { return $argnums_unified = value; }
    public SubLObject setField4(SubLObject value) { return $argnums_remaining = value; }
    public SubLObject setField5(SubLObject value) { return $tactics = value; }
    public SubLObject setField6(SubLObject value) { return $tactics_considered = value; }
    public SubLObject $inverse_mode_p = NIL;
    public SubLObject $argnums_unified = NIL;
    public SubLObject $argnums_remaining = NIL;
    public SubLObject $tactics = NIL;
    public SubLObject $tactics_considered = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($tva_strategy_native.class, $sym0$TVA_STRATEGY, $sym1$TVA_STRATEGY_P, $list2, $list3, new String[] {"$inverse_mode_p", "$argnums_unified", "$argnums_remaining", "$tactics", "$tactics_considered"}, $list4, $list5, $sym6$PRINT_TVA_STRATEGY);
  }

  @SubL(source = "cycl/tva-strategy.lisp", position = 904) 
  public static SubLSymbol $dtp_tva_strategy$ = null;

  @SubL(source = "cycl/tva-strategy.lisp", position = 904) 
  public static final SubLObject tva_strategy_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4330");
    return NIL;
  }

  public static final class $tva_strategy_p$UnaryFunction extends UnaryFunction {
    public $tva_strategy_p$UnaryFunction() { super(extractFunctionNamed("TVA-STRATEGY-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4353"); }
  }

  public static final SubLObject declare_tva_strategy_file() {
    declareFunction(myName, "tva_strategy_print_function_trampoline", "TVA-STRATEGY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "tva_strategy_p", "TVA-STRATEGY-P", 1, 0, false); new $tva_strategy_p$UnaryFunction();
    //declareFunction(myName, "tva_strat_inverse_mode_p", "TVA-STRAT-INVERSE-MODE-P", 1, 0, false);
    //declareFunction(myName, "tva_strat_argnums_unified", "TVA-STRAT-ARGNUMS-UNIFIED", 1, 0, false);
    //declareFunction(myName, "tva_strat_argnums_remaining", "TVA-STRAT-ARGNUMS-REMAINING", 1, 0, false);
    //declareFunction(myName, "tva_strat_tactics", "TVA-STRAT-TACTICS", 1, 0, false);
    //declareFunction(myName, "tva_strat_tactics_considered", "TVA-STRAT-TACTICS-CONSIDERED", 1, 0, false);
    //declareFunction(myName, "_csetf_tva_strat_inverse_mode_p", "_CSETF-TVA-STRAT-INVERSE-MODE-P", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_strat_argnums_unified", "_CSETF-TVA-STRAT-ARGNUMS-UNIFIED", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_strat_argnums_remaining", "_CSETF-TVA-STRAT-ARGNUMS-REMAINING", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_strat_tactics", "_CSETF-TVA-STRAT-TACTICS", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_strat_tactics_considered", "_CSETF-TVA-STRAT-TACTICS-CONSIDERED", 2, 0, false);
    //declareFunction(myName, "make_tva_strategy", "MAKE-TVA-STRATEGY", 0, 1, false);
    //declareFunction(myName, "print_tva_strategy", "PRINT-TVA-STRATEGY", 3, 0, false);
    //declareFunction(myName, "show_tva_strategy", "SHOW-TVA-STRATEGY", 1, 1, false);
    //declareFunction(myName, "new_tacticless_strategy", "NEW-TACTICLESS-STRATEGY", 0, 0, false);
    //declareFunction(myName, "new_strategy_with_tactics", "NEW-STRATEGY-WITH-TACTICS", 1, 0, false);
    //declareFunction(myName, "strategy_inverse_mode_p", "STRATEGY-INVERSE-MODE-P", 1, 0, false);
    //declareFunction(myName, "strategy_tactics", "STRATEGY-TACTICS", 1, 0, false);
    //declareFunction(myName, "strategy_considered_tactics", "STRATEGY-CONSIDERED-TACTICS", 1, 0, false);
    //declareFunction(myName, "strategy_argnums_unified", "STRATEGY-ARGNUMS-UNIFIED", 1, 0, false);
    //declareFunction(myName, "strategy_argnums_remaining", "STRATEGY-ARGNUMS-REMAINING", 1, 0, false);
    //declareMacro(myName, "do_strategy_remaining_argnums", "DO-STRATEGY-REMAINING-ARGNUMS");
    //declareMacro(myName, "do_strategy_tactics", "DO-STRATEGY-TACTICS");
    //declareMacro(myName, "do_strategy_tactics_after_tactic", "DO-STRATEGY-TACTICS-AFTER-TACTIC");
    //declareMacro(myName, "do_strategy_remaining_tactics", "DO-STRATEGY-REMAINING-TACTICS");
    //declareFunction(myName, "tva_strategy_inverse_mode_p", "TVA-STRATEGY-INVERSE-MODE-P", 1, 0, false);
    //declareFunction(myName, "tva_strategy_initial_tactic", "TVA-STRATEGY-INITIAL-TACTIC", 1, 0, false);
    //declareFunction(myName, "tva_strategy_tacticlessP", "TVA-STRATEGY-TACTICLESS?", 1, 0, false);
    //declareFunction(myName, "strategy_considered_tacticP", "STRATEGY-CONSIDERED-TACTIC?", 2, 0, false);
    //declareFunction(myName, "strategy_unified_tactic_argnumP", "STRATEGY-UNIFIED-TACTIC-ARGNUM?", 2, 0, false);
    //declareFunction(myName, "tva_strategy_subsumes_strategy_p", "TVA-STRATEGY-SUBSUMES-STRATEGY-P", 2, 0, false);
    //declareFunction(myName, "tactic_subsumed_in_strategyP", "TACTIC-SUBSUMED-IN-STRATEGY?", 2, 0, false);
    //declareFunction(myName, "last_tactic_for_argnumP", "LAST-TACTIC-FOR-ARGNUM?", 2, 0, false);
    //declareFunction(myName, "no_strategy_argnums_remainingP", "NO-STRATEGY-ARGNUMS-REMAINING?", 1, 0, false);
    //declareFunction(myName, "strategy_complete_p", "STRATEGY-COMPLETE-P", 1, 0, false);
    //declareFunction(myName, "strategy_considered_all_tacticsP", "STRATEGY-CONSIDERED-ALL-TACTICS?", 1, 0, false);
    //declareFunction(myName, "strategy_unified_all_tva_asent_argsP", "STRATEGY-UNIFIED-ALL-TVA-ASENT-ARGS?", 1, 0, false);
    //declareFunction(myName, "arg_matching_tactics_remain_in_strategyP", "ARG-MATCHING-TACTICS-REMAIN-IN-STRATEGY?", 1, 0, false);
    //declareFunction(myName, "set_strategy_inverse_mode", "SET-STRATEGY-INVERSE-MODE", 2, 0, false);
    //declareFunction(myName, "set_strategy_argnums_unified", "SET-STRATEGY-ARGNUMS-UNIFIED", 2, 0, false);
    //declareFunction(myName, "set_strategy_argnums_remaining", "SET-STRATEGY-ARGNUMS-REMAINING", 2, 0, false);
    //declareFunction(myName, "remove_tva_strategy_tactic", "REMOVE-TVA-STRATEGY-TACTIC", 2, 0, false);
    //declareFunction(myName, "set_strategy_tactics", "SET-STRATEGY-TACTICS", 2, 0, false);
    //declareFunction(myName, "push_tva_tactic_onto_strategy", "PUSH-TVA-TACTIC-ONTO-STRATEGY", 2, 0, false);
    //declareFunction(myName, "revert_strategy_argnums_and_tactics", "REVERT-STRATEGY-ARGNUMS-AND-TACTICS", 4, 0, false);
    //declareFunction(myName, "note_strategy_considered_tactic", "NOTE-STRATEGY-CONSIDERED-TACTIC", 2, 0, false);
    //declareFunction(myName, "add_strategy_argnum_to_remaining", "ADD-STRATEGY-ARGNUM-TO-REMAINING", 2, 0, false);
    //declareFunction(myName, "delete_strategy_argnum_from_remaining", "DELETE-STRATEGY-ARGNUM-FROM-REMAINING", 2, 0, false);
    //declareFunction(myName, "add_strategy_argnum_to_unified", "ADD-STRATEGY-ARGNUM-TO-UNIFIED", 2, 0, false);
    //declareFunction(myName, "delete_strategy_argnum_from_unified", "DELETE-STRATEGY-ARGNUM-FROM-UNIFIED", 2, 0, false);
    //declareFunction(myName, "note_strategy_argnum_unified", "NOTE-STRATEGY-ARGNUM-UNIFIED", 2, 0, false);
    //declareFunction(myName, "note_strategy_argnum_remaining", "NOTE-STRATEGY-ARGNUM-REMAINING", 2, 0, false);
    //declareFunction(myName, "remove_tactics_subsumed_by_tactic", "REMOVE-TACTICS-SUBSUMED-BY-TACTIC", 2, 0, false);
    //declareFunction(myName, "remove_tactics_for_matching_args", "REMOVE-TACTICS-FOR-MATCHING-ARGS", 2, 0, false);
    //declareFunction(myName, "copy_strategy_possibly_flip_argnums", "COPY-STRATEGY-POSSIBLY-FLIP-ARGNUMS", 3, 0, false);
    //declareFunction(myName, "make_tva_simple_strategy", "MAKE-TVA-SIMPLE-STRATEGY", 0, 0, false);
    //declareMacro(myName, "with_new_tva_strategy", "WITH-NEW-TVA-STRATEGY");
    //declareFunction(myName, "make_tva_default_strategy", "MAKE-TVA-DEFAULT-STRATEGY", 0, 0, false);
    //declareFunction(myName, "insert_new_tactic_into_strategy", "INSERT-NEW-TACTIC-INTO-STRATEGY", 2, 0, false);
    //declareFunction(myName, "remove_lookup_tactic_for_argnum", "REMOVE-LOOKUP-TACTIC-FOR-ARGNUM", 2, 0, false);
    //declareFunction(myName, "tva_restrategize", "TVA-RESTRATEGIZE", 3, 0, false);
    //declareFunction(myName, "possibly_modify_strategy_tactics", "POSSIBLY-MODIFY-STRATEGY-TACTICS", 5, 0, false);
    //declareFunction(myName, "add_sentence_to_justs", "ADD-SENTENCE-TO-JUSTS", 3, 0, false);
    //declareFunction(myName, "add_subsumptions_to_justs", "ADD-SUBSUMPTIONS-TO-JUSTS", 5, 0, false);
    //declareFunction(myName, "proceed_with_tva_strategy", "PROCEED-WITH-TVA-STRATEGY", 1, 0, false);
    //declareFunction(myName, "sentence_subsumes_tva_asent_with_strategy", "SENTENCE-SUBSUMES-TVA-ASENT-WITH-STRATEGY", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_tva_strategy_file() {
    $dtp_tva_strategy$ = defconstant("*DTP-TVA-STRATEGY*", $sym0$TVA_STRATEGY);
    return NIL;
  }

  public static final SubLObject setup_tva_strategy_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_tva_strategy$.getGlobalValue(), Symbols.symbol_function($sym7$TVA_STRATEGY_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$TVA_STRAT_INVERSE_MODE_P, $sym9$_CSETF_TVA_STRAT_INVERSE_MODE_P);
    Structures.def_csetf($sym10$TVA_STRAT_ARGNUMS_UNIFIED, $sym11$_CSETF_TVA_STRAT_ARGNUMS_UNIFIED);
    Structures.def_csetf($sym12$TVA_STRAT_ARGNUMS_REMAINING, $sym13$_CSETF_TVA_STRAT_ARGNUMS_REMAINING);
    Structures.def_csetf($sym14$TVA_STRAT_TACTICS, $sym15$_CSETF_TVA_STRAT_TACTICS);
    Structures.def_csetf($sym16$TVA_STRAT_TACTICS_CONSIDERED, $sym17$_CSETF_TVA_STRAT_TACTICS_CONSIDERED);
    Equality.identity($sym0$TVA_STRATEGY);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$TVA_STRATEGY = makeSymbol("TVA-STRATEGY");
  public static final SubLSymbol $sym1$TVA_STRATEGY_P = makeSymbol("TVA-STRATEGY-P");
  public static final SubLList $list2 = list(makeSymbol("INVERSE-MODE-P"), makeSymbol("ARGNUMS-UNIFIED"), makeSymbol("ARGNUMS-REMAINING"), makeSymbol("TACTICS"), makeSymbol("TACTICS-CONSIDERED"));
  public static final SubLList $list3 = list(makeKeyword("INVERSE-MODE-P"), makeKeyword("ARGNUMS-UNIFIED"), makeKeyword("ARGNUMS-REMAINING"), makeKeyword("TACTICS"), makeKeyword("TACTICS-CONSIDERED"));
  public static final SubLList $list4 = list(makeSymbol("TVA-STRAT-INVERSE-MODE-P"), makeSymbol("TVA-STRAT-ARGNUMS-UNIFIED"), makeSymbol("TVA-STRAT-ARGNUMS-REMAINING"), makeSymbol("TVA-STRAT-TACTICS"), makeSymbol("TVA-STRAT-TACTICS-CONSIDERED"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-TVA-STRAT-INVERSE-MODE-P"), makeSymbol("_CSETF-TVA-STRAT-ARGNUMS-UNIFIED"), makeSymbol("_CSETF-TVA-STRAT-ARGNUMS-REMAINING"), makeSymbol("_CSETF-TVA-STRAT-TACTICS"), makeSymbol("_CSETF-TVA-STRAT-TACTICS-CONSIDERED"));
  public static final SubLSymbol $sym6$PRINT_TVA_STRATEGY = makeSymbol("PRINT-TVA-STRATEGY");
  public static final SubLSymbol $sym7$TVA_STRATEGY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TVA-STRATEGY-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$TVA_STRAT_INVERSE_MODE_P = makeSymbol("TVA-STRAT-INVERSE-MODE-P");
  public static final SubLSymbol $sym9$_CSETF_TVA_STRAT_INVERSE_MODE_P = makeSymbol("_CSETF-TVA-STRAT-INVERSE-MODE-P");
  public static final SubLSymbol $sym10$TVA_STRAT_ARGNUMS_UNIFIED = makeSymbol("TVA-STRAT-ARGNUMS-UNIFIED");
  public static final SubLSymbol $sym11$_CSETF_TVA_STRAT_ARGNUMS_UNIFIED = makeSymbol("_CSETF-TVA-STRAT-ARGNUMS-UNIFIED");
  public static final SubLSymbol $sym12$TVA_STRAT_ARGNUMS_REMAINING = makeSymbol("TVA-STRAT-ARGNUMS-REMAINING");
  public static final SubLSymbol $sym13$_CSETF_TVA_STRAT_ARGNUMS_REMAINING = makeSymbol("_CSETF-TVA-STRAT-ARGNUMS-REMAINING");
  public static final SubLSymbol $sym14$TVA_STRAT_TACTICS = makeSymbol("TVA-STRAT-TACTICS");
  public static final SubLSymbol $sym15$_CSETF_TVA_STRAT_TACTICS = makeSymbol("_CSETF-TVA-STRAT-TACTICS");
  public static final SubLSymbol $sym16$TVA_STRAT_TACTICS_CONSIDERED = makeSymbol("TVA-STRAT-TACTICS-CONSIDERED");
  public static final SubLSymbol $sym17$_CSETF_TVA_STRAT_TACTICS_CONSIDERED = makeSymbol("_CSETF-TVA-STRAT-TACTICS-CONSIDERED");
  public static final SubLSymbol $kw18$INVERSE_MODE_P = makeKeyword("INVERSE-MODE-P");
  public static final SubLSymbol $kw19$ARGNUMS_UNIFIED = makeKeyword("ARGNUMS-UNIFIED");
  public static final SubLSymbol $kw20$ARGNUMS_REMAINING = makeKeyword("ARGNUMS-REMAINING");
  public static final SubLSymbol $kw21$TACTICS = makeKeyword("TACTICS");
  public static final SubLSymbol $kw22$TACTICS_CONSIDERED = makeKeyword("TACTICS-CONSIDERED");
  public static final SubLString $str23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str24$__ = makeString("#<");
  public static final SubLSymbol $kw25$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw26$BASE = makeKeyword("BASE");
  public static final SubLString $str27$__Strategy____a__ = makeString("~%Strategy : ~a~%");
  public static final SubLString $str28$Strategy_Inverse_Mode_____a__ = makeString("Strategy Inverse Mode? : ~a~%");
  public static final SubLString $str29$Argnums_Unified___________a__ = makeString("Argnums Unified :        ~a~%");
  public static final SubLString $str30$Argnums_Remaining_________a__ = makeString("Argnums Remaining :      ~a~%");
  public static final SubLString $str31$Tactics_Considered________a____ = makeString("Tactics Considered :     ~a~%~%");
  public static final SubLString $str32$Strategy_Tactic__a___a__ = makeString("Strategy Tactic ~a: ~a~%");
  public static final SubLString $str33$____ = makeString("~%~%");
  public static final SubLList $list34 = list(list(makeSymbol("ARGNUM-VAR"), makeSymbol("STRATEGY")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym35$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym36$STRATEGY_ARGNUMS_REMAINING = makeSymbol("STRATEGY-ARGNUMS-REMAINING");
  public static final SubLList $list37 = list(list(makeSymbol("TACTIC-VAR"), makeSymbol("STRATEGY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list38 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw39$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw40$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym41$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym42$STRATEGY_TACTICS = makeSymbol("STRATEGY-TACTICS");
  public static final SubLList $list43 = list(list(makeSymbol("TACTIC-VAR"), makeSymbol("START-TACTIC"), makeSymbol("STRATEGY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym44$CDR = makeSymbol("CDR");
  public static final SubLSymbol $sym45$MEMBER = makeSymbol("MEMBER");
  public static final SubLList $list46 = list(list(makeSymbol("TACTIC-VAR"), makeSymbol("STRATEGY-ARGNUM-VAR"), makeSymbol("STRATEGY"), makeSymbol("DONE?-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym47$SUBSTRATEGY = makeUninternedSymbol("SUBSTRATEGY");
  public static final SubLSymbol $sym48$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym49$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym50$COR = makeSymbol("COR");
  public static final SubLSymbol $sym51$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym52$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym53$STRATEGY_CONSIDERED_TACTIC_ = makeSymbol("STRATEGY-CONSIDERED-TACTIC?");
  public static final SubLSymbol $sym54$STRATEGY_UNIFIED_TACTIC_ARGNUM_ = makeSymbol("STRATEGY-UNIFIED-TACTIC-ARGNUM?");
  public static final SubLSymbol $sym55$NOTE_STRATEGY_CONSIDERED_TACTIC = makeSymbol("NOTE-STRATEGY-CONSIDERED-TACTIC");
  public static final SubLSymbol $sym56$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym57$TVA_TACTIC_ARGNUM_TO_STRATEGY_ARGNUM = makeSymbol("TVA-TACTIC-ARGNUM-TO-STRATEGY-ARGNUM");
  public static final SubLSymbol $sym58$STRATEGY_INVERSE_MODE_P = makeSymbol("STRATEGY-INVERSE-MODE-P");
  public static final SubLSymbol $kw59$LOOKUP = makeKeyword("LOOKUP");
  public static final SubLSymbol $kw60$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLList $list61 = list(makeSymbol("STRATEGY-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list62 = list(list(makeSymbol("MAKE-TVA-DEFAULT-STRATEGY")));
  public static final SubLObject $const63$transitiveViaArg = constant_handles.reader_make_constant_shell(makeString("transitiveViaArg"));
  public static final SubLObject $const64$transitiveViaArgInverse = constant_handles.reader_make_constant_shell(makeString("transitiveViaArgInverse"));
  public static final SubLSymbol $kw65$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw66$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw67$DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");
  public static final SubLObject $const68$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw69$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw70$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw71$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym72$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw73$ERROR = makeKeyword("ERROR");
  public static final SubLString $str74$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym75$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw76$CERROR = makeKeyword("CERROR");
  public static final SubLString $str77$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw78$WARN = makeKeyword("WARN");
  public static final SubLString $str79$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str80$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str81$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $kw82$DEPTH_FIRST = makeKeyword("DEPTH-FIRST");

  //// Initializers

  public void declareFunctions() {
    declare_tva_strategy_file();
  }

  public void initializeVariables() {
    init_tva_strategy_file();
  }

  public void runTopLevelForms() {
    setup_tva_strategy_file();
  }

}
