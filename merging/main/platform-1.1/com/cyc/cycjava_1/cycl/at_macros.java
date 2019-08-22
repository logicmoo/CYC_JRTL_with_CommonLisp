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
//dm import com.cyc.cycjava_1.cycl.arg_type;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;

public  final class at_macros extends SubLTranslatedFile {

  //// Constructor

  private at_macros() {}
  public static final SubLFile me = new at_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.at_macros";

  //// Definitions

  @SubL(source = "cycl/at-macros.lisp", position = 1540) 
  public static final SubLObject make_defn_fn_history_table() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Hashtables.make_hash_table(at_vars.$defn_fn_history_default_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/at-macros.lisp", position = 1809) 
  public static final SubLObject make_defn_col_history_table() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Hashtables.make_hash_table(at_vars.$defn_col_history_default_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/at-macros.lisp", position = 2082) 
  public static final SubLObject possibly_make_defn_fn_history_table() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != misc_utilities.uninitialized_p(at_vars.$defn_fn_history$.getDynamicValue(thread)))) {
        return make_defn_fn_history_table();
      } else {
        return at_vars.$defn_fn_history$.getDynamicValue(thread);
      }
    }
  }

  @SubL(source = "cycl/at-macros.lisp", position = 2301) 
  public static final SubLObject possibly_make_quoted_defn_fn_history_table() {
    return possibly_make_defn_fn_history_table();
  }

  @SubL(source = "cycl/at-macros.lisp", position = 2456) 
  public static final SubLObject possibly_make_defn_col_history_table() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != misc_utilities.uninitialized_p(at_vars.$defn_col_history$.getDynamicValue(thread)))) {
        return make_defn_col_history_table();
      } else {
        return at_vars.$defn_col_history$.getDynamicValue(thread);
      }
    }
  }

  @SubL(source = "cycl/at-macros.lisp", position = 2679) 
  public static final SubLObject possibly_make_quoted_defn_col_history_table() {
    return possibly_make_defn_col_history_table();
  }

  public static final SubLObject declare_at_macros_file() {
    declareMacro(myName, "with_new_defn_space", "WITH-NEW-DEFN-SPACE");
    declareMacro(myName, "with_possibly_new_defn_space", "WITH-POSSIBLY-NEW-DEFN-SPACE");
    declareFunction(myName, "make_defn_fn_history_table", "MAKE-DEFN-FN-HISTORY-TABLE", 0, 0, false);
    declareFunction(myName, "make_quoted_defn_fn_history_table", "MAKE-QUOTED-DEFN-FN-HISTORY-TABLE", 0, 0, false);
    declareFunction(myName, "make_defn_col_history_table", "MAKE-DEFN-COL-HISTORY-TABLE", 0, 0, false);
    declareFunction(myName, "make_quoted_defn_col_history_table", "MAKE-QUOTED-DEFN-COL-HISTORY-TABLE", 0, 0, false);
    declareFunction(myName, "possibly_make_defn_fn_history_table", "POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE", 0, 0, false);
    declareFunction(myName, "possibly_make_quoted_defn_fn_history_table", "POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE", 0, 0, false);
    declareFunction(myName, "possibly_make_defn_col_history_table", "POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE", 0, 0, false);
    declareFunction(myName, "possibly_make_quoted_defn_col_history_table", "POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE", 0, 0, false);
    declareMacro(myName, "with_at_defns", "WITH-AT-DEFNS");
    declareMacro(myName, "with_at_defn", "WITH-AT-DEFN");
    declareMacro(myName, "with_at_functions", "WITH-AT-FUNCTIONS");
    declareMacro(myName, "with_at_function", "WITH-AT-FUNCTION");
    declareMacro(myName, "with_at_result", "WITH-AT-RESULT");
    declareMacro(myName, "with_some_at_arg_isa_var", "WITH-SOME-AT-ARG-ISA-VAR");
    declareMacro(myName, "with_at_mode", "WITH-AT-MODE");
    declareMacro(myName, "with_at_ind_isa", "WITH-AT-IND-ISA");
    declareMacro(myName, "with_at_ind_genl", "WITH-AT-IND-GENL");
    declareMacro(myName, "with_at_pred", "WITH-AT-PRED");
    declareMacro(myName, "with_at_inverse", "WITH-AT-INVERSE");
    declareMacro(myName, "with_at_mapping_inverses", "WITH-AT-MAPPING-INVERSES");
    declareMacro(myName, "with_at_reln", "WITH-AT-RELN");
    declareMacro(myName, "with_at_arg", "WITH-AT-ARG");
    declareMacro(myName, "with_at_type", "WITH-AT-TYPE");
    declareMacro(myName, "with_at_argnum", "WITH-AT-ARGNUM");
    declareMacro(myName, "with_at_ind_arg", "WITH-AT-IND-ARG");
    declareMacro(myName, "with_at_ind_argnum", "WITH-AT-IND-ARGNUM");
    declareMacro(myName, "with_at_arg_isa", "WITH-AT-ARG-ISA");
    declareMacro(myName, "with_at_base_fn", "WITH-AT-BASE-FN");
    declareMacro(myName, "with_at_source", "WITH-AT-SOURCE");
    declareMacro(myName, "with_at_constraint_gaf", "WITH-AT-CONSTRAINT-GAF");
    declareMacro(myName, "at_test", "AT-TEST");
    declareMacro(myName, "at_trace", "AT-TRACE");
    declareMacro(myName, "defn_test", "DEFN-TEST");
    declareMacro(myName, "defn_trace", "DEFN-TRACE");
    declareMacro(myName, "gathering_at_constraints", "GATHERING-AT-CONSTRAINTS");
    declareMacro(myName, "gathering_at_assertions", "GATHERING-AT-ASSERTIONS");
    declareMacro(myName, "gathering_at_format_violations", "GATHERING-AT-FORMAT-VIOLATIONS");
    declareMacro(myName, "gathering_at_different_violations", "GATHERING-AT-DIFFERENT-VIOLATIONS");
    declareMacro(myName, "gathering_at_predicate_violations", "GATHERING-AT-PREDICATE-VIOLATIONS");
    declareMacro(myName, "until_at_mapping_finished", "UNTIL-AT-MAPPING-FINISHED");
    declareMacro(myName, "declare_collection_specific_defn", "DECLARE-COLLECTION-SPECIFIC-DEFN");
    declareMacro(myName, "define_defn_metered", "DEFINE-DEFN-METERED");
    declareMacro(myName, "do_all_top_level_arg_constraints", "DO-ALL-TOP-LEVEL-ARG-CONSTRAINTS");
    declareFunction(myName, "dtlac_list_generator", "DTLAC-LIST-GENERATOR", 1, 0, false);
    declareMacro(myName, "do_all_arg_constraints_inside_out", "DO-ALL-ARG-CONSTRAINTS-INSIDE-OUT");
    declareFunction(myName, "daacio_list_generator", "DAACIO-LIST-GENERATOR", 1, 0, false);
    declareMacro(myName, "gather_wff_violations", "GATHER-WFF-VIOLATIONS");
    declareMacro(myName, "dont_gather_wff_violations", "DONT-GATHER-WFF-VIOLATIONS");
    declareMacro(myName, "dont_gather_wff_violations_or_suggestions", "DONT-GATHER-WFF-VIOLATIONS-OR-SUGGESTIONS");
    return NIL;
  }

  public static final SubLObject init_at_macros_file() {
    return NIL;
  }

  public static final SubLObject setup_at_macros_file() {
        access_macros.register_macro_helper($sym5$MAKE_DEFN_FN_HISTORY_TABLE, $sym6$WITH_NEW_DEFN_SPACE);
    access_macros.register_macro_helper($sym7$MAKE_QUOTED_DEFN_FN_HISTORY_TABLE, $sym6$WITH_NEW_DEFN_SPACE);
    access_macros.register_macro_helper($sym8$MAKE_DEFN_COL_HISTORY_TABLE, $sym6$WITH_NEW_DEFN_SPACE);
    access_macros.register_macro_helper($sym9$MAKE_QUOTED_DEFN_COL_HISTORY_TABLE, $sym6$WITH_NEW_DEFN_SPACE);
    access_macros.register_macro_helper($sym10$POSSIBLY_MAKE_DEFN_FN_HISTORY_TABLE, $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE);
    access_macros.register_macro_helper($sym12$POSSIBLY_MAKE_QUOTED_DEFN_FN_HISTORY_TABLE, $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE);
    access_macros.register_macro_helper($sym13$POSSIBLY_MAKE_DEFN_COL_HISTORY_TABLE, $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE);
    access_macros.register_macro_helper($sym14$POSSIBLY_MAKE_QUOTED_DEFN_COL_HISTORY_TABLE, $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE);
    access_macros.register_macro_helper($sym133$DTLAC_LIST_GENERATOR, $sym135$DO_ALL_TOP_LEVEL_ARG_CONSTRAINTS);
    access_macros.register_macro_helper($sym139$DAACIO_LIST_GENERATOR, $sym140$DO_ALL_ARG_CONSTRAINTS_INSIDE_OUT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLET = makeSymbol("CLET");
  public static final SubLList $list1 = list(list(makeSymbol("*DEFN-FN-HISTORY*"), list(makeSymbol("MAKE-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-FN-HISTORY*"), list(makeSymbol("MAKE-QUOTED-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*DEFN-COL-HISTORY*"), list(makeSymbol("MAKE-DEFN-COL-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-COL-HISTORY*"), list(makeSymbol("MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"))));
  public static final SubLSymbol $sym2$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLList $list3 = list(list(makeSymbol("CLEAR-DEFN-SPACE")));
  public static final SubLList $list4 = list(list(makeSymbol("*DEFN-FN-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-FN-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*DEFN-COL-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-COL-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"))));
  public static final SubLSymbol $sym5$MAKE_DEFN_FN_HISTORY_TABLE = makeSymbol("MAKE-DEFN-FN-HISTORY-TABLE");
  public static final SubLSymbol $sym6$WITH_NEW_DEFN_SPACE = makeSymbol("WITH-NEW-DEFN-SPACE");
  public static final SubLSymbol $sym7$MAKE_QUOTED_DEFN_FN_HISTORY_TABLE = makeSymbol("MAKE-QUOTED-DEFN-FN-HISTORY-TABLE");
  public static final SubLSymbol $sym8$MAKE_DEFN_COL_HISTORY_TABLE = makeSymbol("MAKE-DEFN-COL-HISTORY-TABLE");
  public static final SubLSymbol $sym9$MAKE_QUOTED_DEFN_COL_HISTORY_TABLE = makeSymbol("MAKE-QUOTED-DEFN-COL-HISTORY-TABLE");
  public static final SubLSymbol $sym10$POSSIBLY_MAKE_DEFN_FN_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE");
  public static final SubLSymbol $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE = makeSymbol("WITH-POSSIBLY-NEW-DEFN-SPACE");
  public static final SubLSymbol $sym12$POSSIBLY_MAKE_QUOTED_DEFN_FN_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE");
  public static final SubLSymbol $sym13$POSSIBLY_MAKE_DEFN_COL_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE");
  public static final SubLSymbol $sym14$POSSIBLY_MAKE_QUOTED_DEFN_COL_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE");
  public static final SubLList $list15 = list(makeSymbol("DEFNS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym16$_AT_DEFNS_ = makeSymbol("*AT-DEFNS*");
  public static final SubLList $list17 = list(makeSymbol("DEFN"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym18$_AT_DEFN_ = makeSymbol("*AT-DEFN*");
  public static final SubLSymbol $sym19$_AT_FUNCTIONS_ = makeSymbol("*AT-FUNCTIONS*");
  public static final SubLSymbol $sym20$_AT_FUNCTION_ = makeSymbol("*AT-FUNCTION*");
  public static final SubLList $list21 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list22 = list(makeSymbol("*AT-RESULT*"));
  public static final SubLSymbol $sym23$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list24 = list(makeSymbol("BOOLEAN-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list25 = list(makeSymbol("*AT-SOME-ARG-ISA?*"));
  public static final SubLList $list26 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym27$_AT_MODE_ = makeSymbol("*AT-MODE*");
  public static final SubLList $list28 = list(makeSymbol("COL"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym29$_AT_IND_ISA_ = makeSymbol("*AT-IND-ISA*");
  public static final SubLList $list30 = list(makeSymbol("TERM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym31$_AT_IND_GENL_ = makeSymbol("*AT-IND-GENL*");
  public static final SubLList $list32 = list(makeSymbol("CONSTRAINT-PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym33$_AT_PRED_ = makeSymbol("*AT-PRED*");
  public static final SubLSymbol $sym34$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym35$_AT_INVERSE_ = makeSymbol("*AT-INVERSE*");
  public static final SubLList $list36 = list(makeSymbol("CAND"), makeSymbol("*AT-CHECK-GENL-INVERSES?*"), makeSymbol("*AT-INVERSE*"));
  public static final SubLList $list37 = list(list(makeSymbol("*AT-MAPPING-GENL-INVERSES?*"), T));
  public static final SubLList $list38 = list(makeSymbol("RELN"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym39$ASSERTED_GENL_SOMETHING_ = makeUninternedSymbol("ASSERTED-GENL-SOMETHING?");
  public static final SubLSymbol $sym40$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym41$FWHEN = makeSymbol("FWHEN");
  public static final SubLSymbol $sym42$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym43$COR = makeSymbol("COR");
  public static final SubLSymbol $sym44$ASSERTED_GENL_PREDICATES_ = makeSymbol("ASSERTED-GENL-PREDICATES?");
  public static final SubLSymbol $sym45$ASSERTED_GENL_INVERSES_ = makeSymbol("ASSERTED-GENL-INVERSES?");
  public static final SubLSymbol $sym46$_AT_RELN_ = makeSymbol("*AT-RELN*");
  public static final SubLSymbol $sym47$_AT_SEARCH_GENL_PREDS__ = makeSymbol("*AT-SEARCH-GENL-PREDS?*");
  public static final SubLSymbol $sym48$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym49$_AT_CHECK_GENL_PREDS__ = makeSymbol("*AT-CHECK-GENL-PREDS?*");
  public static final SubLSymbol $sym50$_AT_SEARCH_GENL_INVERSES__ = makeSymbol("*AT-SEARCH-GENL-INVERSES?*");
  public static final SubLSymbol $sym51$_AT_CHECK_GENL_INVERSES__ = makeSymbol("*AT-CHECK-GENL-INVERSES?*");
  public static final SubLSymbol $sym52$_AT_ARG_ = makeSymbol("*AT-ARG*");
  public static final SubLList $list53 = list(makeSymbol("TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym54$_AT_ARG_TYPE_ = makeSymbol("*AT-ARG-TYPE*");
  public static final SubLList $list55 = list(makeSymbol("INTEGER"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym56$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list57 = list(makeSymbol("INTEGERP"));
  public static final SubLSymbol $sym58$_AT_ARGNUM_ = makeSymbol("*AT-ARGNUM*");
  public static final SubLSymbol $sym59$_AT_IND_ARG_ = makeSymbol("*AT-IND-ARG*");
  public static final SubLSymbol $sym60$_AT_IND_ARGNUM_ = makeSymbol("*AT-IND-ARGNUM*");
  public static final SubLList $list61 = list(makeSymbol("COLLECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list62 = list(makeSymbol("FORT-P"));
  public static final SubLSymbol $sym63$_AT_ARG_ISA_ = makeSymbol("*AT-ARG-ISA*");
  public static final SubLList $list64 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list65 = list(makeSymbol("FUNCTION-SPEC-P"));
  public static final SubLSymbol $sym66$_AT_BASE_FN_ = makeSymbol("*AT-BASE-FN*");
  public static final SubLSymbol $sym67$_AT_SOURCE_ = makeSymbol("*AT-SOURCE*");
  public static final SubLList $list68 = list(makeSymbol("GAF"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym69$_AT_CONSTRAINT_GAF_ = makeSymbol("*AT-CONSTRAINT-GAF*");
  public static final SubLList $list70 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym71$__ = makeSymbol(">=");
  public static final SubLSymbol $sym72$_AT_TEST_LEVEL_ = makeSymbol("*AT-TEST-LEVEL*");
  public static final SubLSymbol $sym73$_AT_TRACE_LEVEL_ = makeSymbol("*AT-TRACE-LEVEL*");
  public static final SubLSymbol $sym74$_DEFN_TEST_LEVEL_ = makeSymbol("*DEFN-TEST-LEVEL*");
  public static final SubLSymbol $sym75$_DEFN_TRACE_LEVEL_ = makeSymbol("*DEFN-TRACE-LEVEL*");
  public static final SubLList $list76 = list(list(makeSymbol("*GATHER-AT-CONSTRAINTS?*"), T));
  public static final SubLList $list77 = list(list(makeSymbol("CLRHASH"), makeSymbol("*AT-ISA-CONSTRAINTS*")), list(makeSymbol("CLRHASH"), makeSymbol("*AT-GENL-CONSTRAINTS*")));
  public static final SubLList $list78 = list(list(makeSymbol("*GATHER-AT-ASSERTIONS?*"), T));
  public static final SubLList $list79 = list(list(makeSymbol("CLRHASH"), makeSymbol("*AT-ISA-ASSERTIONS*")), list(makeSymbol("CLRHASH"), makeSymbol("*AT-GENL-ASSERTIONS*")));
  public static final SubLList $list80 = list(list(makeSymbol("*GATHER-AT-FORMAT-VIOLATIONS?*"), T), makeSymbol("*AT-FORMAT-VIOLATIONS*"));
  public static final SubLList $list81 = list(list(makeSymbol("*GATHER-AT-DIFFERENT-VIOLATIONS?*"), T), makeSymbol("*AT-DIFFERENT-VIOLATIONS*"));
  public static final SubLList $list82 = list(list(makeSymbol("*GATHER-AT-PREDICATE-VIOLATIONS?*"), T), makeSymbol("*AT-PREDICATE-VIOLATIONS*"));
  public static final SubLSymbol $sym83$CCATCH_IGNORE = makeSymbol("CCATCH-IGNORE");
  public static final SubLSymbol $kw84$AT_MAPPING_DONE = makeKeyword("AT-MAPPING-DONE");
  public static final SubLList $list85 = list(list(makeSymbol("*WITHIN-AT-MAPPING?*"), T));
  public static final SubLList $list86 = list(makeSymbol("SYMBOL"));
  public static final SubLSymbol $sym87$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym88$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym89$CPUSHNEW = makeSymbol("CPUSHNEW");
  public static final SubLList $list90 = list(makeSymbol("*AT-COLLECTION-SPECIFIC-DEFNS*"));
  public static final SubLList $list91 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARG-LIST")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str92$__a_METERS_ = makeString("*~a-METERS*");
  public static final SubLString $str93$_a_METERED = makeString("~a-METERED");
  public static final SubLString $str94$RESET__a_METERS = makeString("RESET-~a-METERS");
  public static final SubLSymbol $sym95$DEFVAR_DEFN = makeSymbol("DEFVAR-DEFN");
  public static final SubLList $list96 = list(makeSymbol("MAKE-HASH-TABLE"), EIGHT_INTEGER);
  public static final SubLString $str97$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function ~a");
  public static final SubLSymbol $sym98$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym99$CSETF = makeSymbol("CSETF");
  public static final SubLSymbol $sym100$GETHASH = makeSymbol("GETHASH");
  public static final SubLSymbol $kw101$CALLS = makeKeyword("CALLS");
  public static final SubLList $list102 = list(ZERO_INTEGER);
  public static final SubLSymbol $kw103$TIMES = makeKeyword("TIMES");
  public static final SubLList $list104 = list(NIL);
  public static final SubLSymbol $kw105$RESULTS = makeKeyword("RESULTS");
  public static final SubLSymbol $kw106$ARGS = makeKeyword("ARGS");
  public static final SubLSymbol $sym107$SETHASH = makeSymbol("SETHASH");
  public static final SubLSymbol $kw108$ARG_LIST = makeKeyword("ARG-LIST");
  public static final SubLSymbol $kw109$FUNCTION = makeKeyword("FUNCTION");
  public static final SubLList $list110 = list(list(makeSymbol("RET"), NIL));
  public static final SubLSymbol $kw111$RESET = makeKeyword("RESET");
  public static final SubLSymbol $sym112$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLList $list113 = list(makeSymbol("CACHE"), makeSymbol("*DEFN-METER-CACHES*"));
  public static final SubLList $list114 = list(list(makeSymbol("GETHASH"), makeKeyword("FUNCTION"), makeSymbol("CACHE")));
  public static final SubLList $list115 = list(list(makeSymbol("CSETQ"), makeSymbol("*DEFN-METER-CACHES*"), list(makeSymbol("DELETE"), makeSymbol("CACHE"), makeSymbol("*DEFN-METER-CACHES*"))), list(makeSymbol("CLRHASH"), makeSymbol("CACHE")));
  public static final SubLSymbol $sym116$CPUSH = makeSymbol("CPUSH");
  public static final SubLList $list117 = list(makeSymbol("*DEFN-METER-CACHES*"));
  public static final SubLSymbol $sym118$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym119$_DEFN_METERS__ = makeSymbol("*DEFN-METERS?*");
  public static final SubLList $list120 = list(makeSymbol("RESULT"), makeSymbol("RUN-TIME"));
  public static final SubLSymbol $sym121$CTIME = makeSymbol("CTIME");
  public static final SubLSymbol $sym122$RUN_TIME = makeSymbol("RUN-TIME");
  public static final SubLSymbol $sym123$RESULT = makeSymbol("RESULT");
  public static final SubLSymbol $sym124$CINC = makeSymbol("CINC");
  public static final SubLSymbol $sym125$LIST = makeSymbol("LIST");
  public static final SubLList $list126 = list(list(makeSymbol("RET"), makeSymbol("RESULT")));
  public static final SubLSymbol $sym127$RET = makeSymbol("RET");
  public static final SubLList $list128 = list(list(makeSymbol("CONSTRAINT-VAR"), makeSymbol("FORMULA"), makeSymbol("&KEY"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list129 = list(makeKeyword("DONE-VAR"));
  public static final SubLSymbol $kw130$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw131$DONE_VAR = makeKeyword("DONE-VAR");
  public static final SubLSymbol $sym132$ALL_ARG_CONSTRAINTS = makeUninternedSymbol("ALL-ARG-CONSTRAINTS");
  public static final SubLSymbol $sym133$DTLAC_LIST_GENERATOR = makeSymbol("DTLAC-LIST-GENERATOR");
  public static final SubLSymbol $sym134$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym135$DO_ALL_TOP_LEVEL_ARG_CONSTRAINTS = makeSymbol("DO-ALL-TOP-LEVEL-ARG-CONSTRAINTS");
  public static final SubLSymbol $sym136$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const137$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym138$ALL_ARG_CONSTRAINTS = makeUninternedSymbol("ALL-ARG-CONSTRAINTS");
  public static final SubLSymbol $sym139$DAACIO_LIST_GENERATOR = makeSymbol("DAACIO-LIST-GENERATOR");
  public static final SubLSymbol $sym140$DO_ALL_ARG_CONSTRAINTS_INSIDE_OUT = makeSymbol("DO-ALL-ARG-CONSTRAINTS-INSIDE-OUT");
  public static final SubLList $list141 = list(list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), T), list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), T));
  public static final SubLList $list142 = list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), makeSymbol("*NOTING-WFF-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"));
  public static final SubLList $list143 = list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), makeSymbol("*NOTING-WFF-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), makeSymbol("*PROVIDE-WFF-SUGGESTIONS?*"));

  //// Initializers

  public void declareFunctions() {
    declare_at_macros_file();
  }

  public void initializeVariables() {
    init_at_macros_file();
  }

  public void runTopLevelForms() {
    setup_at_macros_file();
  }

}
