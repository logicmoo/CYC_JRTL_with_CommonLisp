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
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_declarations;
//dm import com.cyc.cycjava_1.cycl.meta_macros;

public  final class kb_indexing_macros extends SubLTranslatedFile {

  //// Constructor

  private kb_indexing_macros() {}
  public static final SubLFile me = new kb_indexing_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_indexing_macros";

  //// Definitions

  @SubL(source = "cycl/kb-indexing-macros.lisp", position = 4224) 
  public static final SubLObject number_has_reached_cutoffP(SubLObject number, SubLObject cutoff) {
    return Numbers.numGE(number, cutoff);
  }

  /** stops counting if it hits a null one */
  @SubL(source = "cycl/kb-indexing-macros.lisp", position = 12138) 
  public static final SubLObject number_of_non_null_args_in_order(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
    if ((arg1 == UNPROVIDED)) {
      arg1 = NIL;
    }
    if ((arg2 == UNPROVIDED)) {
      arg2 = NIL;
    }
    if ((arg3 == UNPROVIDED)) {
      arg3 = NIL;
    }
    if ((arg4 == UNPROVIDED)) {
      arg4 = NIL;
    }
    if ((arg5 == UNPROVIDED)) {
      arg5 = NIL;
    }
    {
      SubLObject count = ZERO_INTEGER;
      if ((NIL == arg1)) {
        return count;
      }
      count = Numbers.add(count, ONE_INTEGER);
      if ((NIL == arg2)) {
        return count;
      }
      count = Numbers.add(count, ONE_INTEGER);
      if ((NIL == arg3)) {
        return count;
      }
      count = Numbers.add(count, ONE_INTEGER);
      if ((NIL == arg4)) {
        return count;
      }
      count = Numbers.add(count, ONE_INTEGER);
      if ((NIL == arg5)) {
        return count;
      }
      count = Numbers.add(count, ONE_INTEGER);
      return count;
    }
  }

  public static final SubLObject declare_kb_indexing_macros_file() {
    //declareMacro("set_num_arbitrary_index", "SET-NUM-ARBITRARY-INDEX");
    //declareMacro("set_relevant_simple_index_count", "SET-RELEVANT-SIMPLE-INDEX-COUNT");
    //declareMacro("set_relevant_complex_index_count", "SET-RELEVANT-COMPLEX-INDEX-COUNT");
    //declareMacro("set_relevant_num_arbitrary_index", "SET-RELEVANT-NUM-ARBITRARY-INDEX");
    declareFunction("number_has_reached_cutoffP", "NUMBER-HAS-REACHED-CUTOFF?", 2, 0, false);
    //declareMacro("set_relevant_simple_index_count_with_cutoff", "SET-RELEVANT-SIMPLE-INDEX-COUNT-WITH-CUTOFF");
    //declareMacro("set_relevant_complex_index_count_with_cutoff", "SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF");
    //declareMacro("set_relevant_num_arbitrary_index_with_cutoff", "SET-RELEVANT-NUM-ARBITRARY-INDEX-WITH-CUTOFF");
    //declareMacro("set_key_arbitrary_index", "SET-KEY-ARBITRARY-INDEX");
    //declareMacro("set_relevant_key_simple_index", "SET-RELEVANT-KEY-SIMPLE-INDEX");
    //declareMacro("set_relevant_key_complex_index", "SET-RELEVANT-KEY-COMPLEX-INDEX");
    //declareMacro("set_relevant_key_arbitrary_index", "SET-RELEVANT-KEY-ARBITRARY-INDEX");
    //declareFunction("mt_key_level", "MT-KEY-LEVEL", 1, 0, false);
    //declareFunction("list_of_first_n_args", "LIST-OF-FIRST-N-ARGS", 1, 5, false);
    declareFunction("number_of_non_null_args_in_order", "NUMBER-OF-NON-NULL-ARGS-IN-ORDER", 0, 5, false);
    //declareMacro("do_gaf_arg_indices", "DO-GAF-ARG-INDICES");
    //declareMacro("do_gaf_arg_index_keys", "DO-GAF-ARG-INDEX-KEYS");
    //declareFunction("term_gaf_arg_index", "TERM-GAF-ARG-INDEX", 1, 0, false);
    //declareFunction("valid_gaf_arg_index_keyP", "VALID-GAF-ARG-INDEX-KEY?", 1, 0, false);
    //declareMacro("do_nart_arg_indices", "DO-NART-ARG-INDICES");
    //declareMacro("do_nart_arg_index_keys", "DO-NART-ARG-INDEX-KEYS");
    //declareFunction("term_nart_arg_index", "TERM-NART-ARG-INDEX", 1, 0, false);
    //declareFunction("valid_nart_arg_index_keyP", "VALID-NART-ARG-INDEX-KEY?", 1, 0, false);
    //declareMacro("do_predicate_rule_indices", "DO-PREDICATE-RULE-INDICES");
    //declareMacro("do_predicate_rule_index_keys", "DO-PREDICATE-RULE-INDEX-KEYS");
    //declareFunction("term_predicate_rule_index", "TERM-PREDICATE-RULE-INDEX", 1, 0, false);
    //declareFunction("valid_predicate_rule_index_keyP", "VALID-PREDICATE-RULE-INDEX-KEY?", 1, 0, false);
    //declareMacro("do_decontextualized_ist_predicate_rule_indices", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDICES");
    //declareMacro("do_decontextualized_ist_predicate_rule_index_keys", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEYS");
    //declareFunction("term_decontextualized_ist_predicate_rule_index", "TERM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 0, false);
    //declareFunction("valid_decontextualized_ist_predicate_rule_index_keyP", "VALID-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY?", 1, 0, false);
    //declareMacro("do_isa_rule_indices", "DO-ISA-RULE-INDICES");
    //declareMacro("do_isa_rule_index_keys", "DO-ISA-RULE-INDEX-KEYS");
    //declareFunction("term_isa_rule_index", "TERM-ISA-RULE-INDEX", 1, 0, false);
    //declareFunction("valid_isa_rule_index_keyP", "VALID-ISA-RULE-INDEX-KEY?", 1, 0, false);
    //declareMacro("do_genls_rule_indices", "DO-GENLS-RULE-INDICES");
    //declareMacro("do_genls_rule_index_keys", "DO-GENLS-RULE-INDEX-KEYS");
    //declareFunction("term_genls_rule_index", "TERM-GENLS-RULE-INDEX", 1, 0, false);
    //declareFunction("valid_genls_rule_index_keyP", "VALID-GENLS-RULE-INDEX-KEY?", 1, 0, false);
    //declareMacro("do_genl_mt_rule_indices", "DO-GENL-MT-RULE-INDICES");
    //declareMacro("do_genl_mt_rule_index_keys", "DO-GENL-MT-RULE-INDEX-KEYS");
    //declareFunction("term_genl_mt_rule_index", "TERM-GENL-MT-RULE-INDEX", 1, 0, false);
    //declareFunction("valid_genl_mt_rule_index_keyP", "VALID-GENL-MT-RULE-INDEX-KEY?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_kb_indexing_macros_file() {
    return NIL;
  }

  public static final SubLObject setup_kb_indexing_macros_file() {
        access_macros.register_macro_helper($sym15$SET_RELEVANT_SIMPLE_INDEX_COUNT, $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX);
    access_macros.register_macro_helper($sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT, $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX);
    access_macros.register_macro_helper($sym43$SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF, $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX);
    access_macros.register_macro_helper($sym47$SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF, $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX);
    access_macros.register_macro_helper($sym65$SET_RELEVANT_KEY_SIMPLE_INDEX, $sym66$SET_RELEVANT_KEY_ARBITRARY_INDEX);
    access_macros.register_macro_helper($sym71$SET_RELEVANT_KEY_COMPLEX_INDEX, $sym66$SET_RELEVANT_KEY_ARBITRARY_INDEX);
    access_macros.register_macro_helper($sym80$MT_KEY_LEVEL, $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT);
    access_macros.register_macro_helper($sym35$LIST_OF_FIRST_N_ARGS, $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT);
    access_macros.register_macro_helper($sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER, $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT);
    access_macros.register_macro_helper($sym88$TERM_GAF_ARG_INDEX, $sym92$DO_GAF_ARG_INDICES);
    access_macros.register_macro_helper($sym89$VALID_GAF_ARG_INDEX_KEY_, $sym92$DO_GAF_ARG_INDICES);
    access_macros.register_macro_helper($sym95$TERM_NART_ARG_INDEX, $sym98$DO_NART_ARG_INDICES);
    access_macros.register_macro_helper($sym96$VALID_NART_ARG_INDEX_KEY_, $sym98$DO_NART_ARG_INDICES);
    access_macros.register_macro_helper($sym101$TERM_PREDICATE_RULE_INDEX, $sym105$DO_PREDICATE_RULE_INDICES);
    access_macros.register_macro_helper($sym102$VALID_PREDICATE_RULE_INDEX_KEY_, $sym105$DO_PREDICATE_RULE_INDICES);
    access_macros.register_macro_helper($sym107$TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, $sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES);
    access_macros.register_macro_helper($sym111$VALID_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_, $sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES);
    access_macros.register_macro_helper($sym113$TERM_ISA_RULE_INDEX, $sym117$DO_ISA_RULE_INDICES);
    access_macros.register_macro_helper($sym114$VALID_ISA_RULE_INDEX_KEY_, $sym117$DO_ISA_RULE_INDICES);
    access_macros.register_macro_helper($sym119$TERM_GENLS_RULE_INDEX, $sym122$DO_GENLS_RULE_INDICES);
    access_macros.register_macro_helper($sym120$VALID_GENLS_RULE_INDEX_KEY_, $sym122$DO_GENLS_RULE_INDICES);
    access_macros.register_macro_helper($sym124$TERM_GENL_MT_RULE_INDEX, $sym127$DO_GENL_MT_RULE_INDICES);
    access_macros.register_macro_helper($sym125$VALID_GENL_MT_RULE_INDEX_KEY_, $sym127$DO_GENL_MT_RULE_INDICES);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("RESULT"), makeSymbol("INDEX"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("KEYS"));
  public static final SubLSymbol $kw1$SIMPLE_MATCH_FUNCTION = makeKeyword("SIMPLE-MATCH-FUNCTION");
  public static final SubLSymbol $kw2$GET_SUBINDEX_FUNCTION = makeKeyword("GET-SUBINDEX-FUNCTION");
  public static final SubLSymbol $sym3$COUNT = makeUninternedSymbol("COUNT");
  public static final SubLSymbol $sym4$ASS = makeUninternedSymbol("ASS");
  public static final SubLSymbol $sym5$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym6$SIMPLE_INDEXED_TERM_P = makeSymbol("SIMPLE-INDEXED-TERM-P");
  public static final SubLSymbol $sym7$CLET = makeSymbol("CLET");
  public static final SubLList $list8 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym9$DO_SIMPLE_INDEX = makeSymbol("DO-SIMPLE-INDEX");
  public static final SubLSymbol $sym10$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym11$CINC = makeSymbol("CINC");
  public static final SubLSymbol $sym12$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym13$SUBINDEX = makeSymbol("SUBINDEX");
  public static final SubLList $list14 = list(list(makeSymbol("FIF"), makeSymbol("SUBINDEX"), list(makeSymbol("SUBINDEX-LEAF-COUNT"), makeSymbol("SUBINDEX")), ZERO_INTEGER));
  public static final SubLSymbol $sym15$SET_RELEVANT_SIMPLE_INDEX_COUNT = makeSymbol("SET-RELEVANT-SIMPLE-INDEX-COUNT");
  public static final SubLSymbol $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX = makeSymbol("SET-RELEVANT-NUM-ARBITRARY-INDEX");
  public static final SubLList $list17 = list(makeSymbol("COUNT-VAR"), list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("ARGS")));
  public static final SubLSymbol $sym18$ASS = makeSymbol("ASS");
  public static final SubLList $list19 = list(makeSymbol("RELEVANT-MT?"), list(makeSymbol("ASSERTION-MT"), makeSymbol("ASS")));
  public static final SubLSymbol $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT = makeSymbol("SET-RELEVANT-COMPLEX-INDEX-COUNT");
  public static final SubLSymbol $kw21$KEY_FUNCTION = makeKeyword("KEY-FUNCTION");
  public static final SubLSymbol $kw22$RELEVANT_NUM_FUNCTION = makeKeyword("RELEVANT-NUM-FUNCTION");
  public static final SubLString $str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called on an index (~s) without an mt layer");
  public static final SubLString $str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called with too many arguments");
  public static final SubLSymbol $sym25$GOOD_KEY_COUNT = makeUninternedSymbol("GOOD-KEY-COUNT");
  public static final SubLSymbol $sym26$GOOD_KEYS = makeUninternedSymbol("GOOD-KEYS");
  public static final SubLSymbol $sym27$MT_SUBINDEX = makeUninternedSymbol("MT-SUBINDEX");
  public static final SubLSymbol $sym28$NEXT_LEVEL_KEYS = makeUninternedSymbol("NEXT-LEVEL-KEYS");
  public static final SubLSymbol $sym29$NEXT_KEY = makeUninternedSymbol("NEXT-KEY");
  public static final SubLSymbol $sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER = makeSymbol("NUMBER-OF-NON-NULL-ARGS-IN-ORDER");
  public static final SubLSymbol $sym31$_ = makeSymbol("=");
  public static final SubLSymbol $sym32$_ = makeSymbol("-");
  public static final SubLList $list33 = list(ONE_INTEGER);
  public static final SubLSymbol $sym34$RELEVANT_MT_SUBINDEX_COUNT = makeSymbol("RELEVANT-MT-SUBINDEX-COUNT");
  public static final SubLSymbol $sym35$LIST_OF_FIRST_N_ARGS = makeSymbol("LIST-OF-FIRST-N-ARGS");
  public static final SubLSymbol $sym36$APPLY = makeSymbol("APPLY");
  public static final SubLSymbol $sym37$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym38$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym39$APPEND = makeSymbol("APPEND");
  public static final SubLSymbol $sym40$LIST = makeSymbol("LIST");
  public static final SubLSymbol $kw41$NUM_FUNCTION = makeKeyword("NUM-FUNCTION");
  public static final SubLList $list42 = list(makeSymbol("ALL-MT-SUBINDEX-KEYS-RELEVANT-P"));
  public static final SubLSymbol $sym43$SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF = makeSymbol("SET-RELEVANT-SIMPLE-INDEX-COUNT-WITH-CUTOFF");
  public static final SubLList $list44 = list(makeSymbol("COUNT-VAR"), makeSymbol("CUTOFF"), list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("ARGS")));
  public static final SubLSymbol $sym45$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym46$NUMBER_HAS_REACHED_CUTOFF_ = makeSymbol("NUMBER-HAS-REACHED-CUTOFF?");
  public static final SubLSymbol $sym47$SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF = makeSymbol("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF");
  public static final SubLList $list48 = list(makeSymbol("RESULT"), makeSymbol("CUTOFF"), makeSymbol("INDEX"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("KEYS"));
  public static final SubLSymbol $kw49$RELEVANT_NUM_FUNCTION_WITH_CUTOFF = makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF");
  public static final SubLString $str50$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called on an index (~s) without an mt layer");
  public static final SubLString $str51$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called with too many arguments");
  public static final SubLSymbol $sym52$GOOD_KEY_COUNT = makeUninternedSymbol("GOOD-KEY-COUNT");
  public static final SubLSymbol $sym53$GOOD_KEYS = makeUninternedSymbol("GOOD-KEYS");
  public static final SubLSymbol $sym54$MT_SUBINDEX = makeUninternedSymbol("MT-SUBINDEX");
  public static final SubLSymbol $sym55$NEXT_LEVEL_KEYS = makeUninternedSymbol("NEXT-LEVEL-KEYS");
  public static final SubLSymbol $sym56$NEXT_KEY = makeUninternedSymbol("NEXT-KEY");
  public static final SubLSymbol $sym57$RELEVANT_MT_SUBINDEX_COUNT_WITH_CUTOFF = makeSymbol("RELEVANT-MT-SUBINDEX-COUNT-WITH-CUTOFF");
  public static final SubLSymbol $sym58$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $kw59$SIMPLE_KEY_FUNCTION = makeKeyword("SIMPLE-KEY-FUNCTION");
  public static final SubLSymbol $sym60$KEYS_ACCUM = makeUninternedSymbol("KEYS-ACCUM");
  public static final SubLSymbol $sym61$ASS = makeUninternedSymbol("ASS");
  public static final SubLList $list62 = list(NIL);
  public static final SubLSymbol $sym63$NEXT_LEVEL_SUBINDEX = makeSymbol("NEXT-LEVEL-SUBINDEX");
  public static final SubLList $list64 = list(list(makeSymbol("FWHEN"), list(makeSymbol("INTERMEDIATE-INDEX-P"), makeSymbol("NEXT-LEVEL-SUBINDEX")), list(makeSymbol("INTERMEDIATE-INDEX-KEYS"), makeSymbol("NEXT-LEVEL-SUBINDEX"))));
  public static final SubLSymbol $sym65$SET_RELEVANT_KEY_SIMPLE_INDEX = makeSymbol("SET-RELEVANT-KEY-SIMPLE-INDEX");
  public static final SubLSymbol $sym66$SET_RELEVANT_KEY_ARBITRARY_INDEX = makeSymbol("SET-RELEVANT-KEY-ARBITRARY-INDEX");
  public static final SubLSymbol $sym67$KEYS_ACCUM = makeUninternedSymbol("KEYS-ACCUM");
  public static final SubLSymbol $sym68$ASS = makeUninternedSymbol("ASS");
  public static final SubLSymbol $sym69$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");
  public static final SubLSymbol $sym70$ASSERTION_MT = makeSymbol("ASSERTION-MT");
  public static final SubLSymbol $sym71$SET_RELEVANT_KEY_COMPLEX_INDEX = makeSymbol("SET-RELEVANT-KEY-COMPLEX-INDEX");
  public static final SubLSymbol $sym72$GOOD_KEY_COUNT = makeUninternedSymbol("GOOD-KEY-COUNT");
  public static final SubLSymbol $sym73$GOOD_KEYS = makeUninternedSymbol("GOOD-KEYS");
  public static final SubLSymbol $sym74$MT_SUBINDEX = makeUninternedSymbol("MT-SUBINDEX");
  public static final SubLSymbol $sym75$NEXT_LEVEL_KEYS = makeUninternedSymbol("NEXT-LEVEL-KEYS");
  public static final SubLSymbol $sym76$NEXT_KEY = makeUninternedSymbol("NEXT-KEY");
  public static final SubLSymbol $sym77$RELEVANT_MT_SUBINDEX_KEYS = makeSymbol("RELEVANT-MT-SUBINDEX-KEYS");
  public static final SubLSymbol $sym78$PLUSP = makeSymbol("PLUSP");
  public static final SubLSymbol $sym79$CPUSH = makeSymbol("CPUSH");
  public static final SubLSymbol $sym80$MT_KEY_LEVEL = makeSymbol("MT-KEY-LEVEL");
  public static final SubLSymbol $kw81$KEYS = makeKeyword("KEYS");
  public static final SubLSymbol $kw82$MT_ = makeKeyword("MT?");
  public static final SubLList $list83 = list(list(makeSymbol("ARGNUM"), makeSymbol("SUBINDEX"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list84 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw85$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw86$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym87$DO_INTERMEDIATE_INDEX = makeSymbol("DO-INTERMEDIATE-INDEX");
  public static final SubLSymbol $sym88$TERM_GAF_ARG_INDEX = makeSymbol("TERM-GAF-ARG-INDEX");
  public static final SubLSymbol $sym89$VALID_GAF_ARG_INDEX_KEY_ = makeSymbol("VALID-GAF-ARG-INDEX-KEY?");
  public static final SubLList $list90 = list(list(makeSymbol("ARGNUM"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym91$SUBINDEX = makeUninternedSymbol("SUBINDEX");
  public static final SubLSymbol $sym92$DO_GAF_ARG_INDICES = makeSymbol("DO-GAF-ARG-INDICES");
  public static final SubLSymbol $sym93$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $kw94$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $sym95$TERM_NART_ARG_INDEX = makeSymbol("TERM-NART-ARG-INDEX");
  public static final SubLSymbol $sym96$VALID_NART_ARG_INDEX_KEY_ = makeSymbol("VALID-NART-ARG-INDEX-KEY?");
  public static final SubLSymbol $sym97$SUBINDEX = makeUninternedSymbol("SUBINDEX");
  public static final SubLSymbol $sym98$DO_NART_ARG_INDICES = makeSymbol("DO-NART-ARG-INDICES");
  public static final SubLSymbol $kw99$NART_ARG = makeKeyword("NART-ARG");
  public static final SubLList $list100 = list(list(makeSymbol("SENSE"), makeSymbol("SUBINDEX"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym101$TERM_PREDICATE_RULE_INDEX = makeSymbol("TERM-PREDICATE-RULE-INDEX");
  public static final SubLSymbol $sym102$VALID_PREDICATE_RULE_INDEX_KEY_ = makeSymbol("VALID-PREDICATE-RULE-INDEX-KEY?");
  public static final SubLList $list103 = list(list(makeSymbol("SENSE"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym104$SUBINDEX = makeUninternedSymbol("SUBINDEX");
  public static final SubLSymbol $sym105$DO_PREDICATE_RULE_INDICES = makeSymbol("DO-PREDICATE-RULE-INDICES");
  public static final SubLSymbol $kw106$PREDICATE_RULE = makeKeyword("PREDICATE-RULE");
  public static final SubLSymbol $sym107$TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = makeSymbol("TERM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
  public static final SubLSymbol $sym108$SUBINDEX = makeUninternedSymbol("SUBINDEX");
  public static final SubLSymbol $sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES = makeSymbol("DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDICES");
  public static final SubLSymbol $kw110$DECONTEXTUALIZED_IST_PREDICATE_RULE = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
  public static final SubLSymbol $sym111$VALID_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_ = makeSymbol("VALID-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY?");
  public static final SubLList $list112 = list(list(makeSymbol("SENSE"), makeSymbol("SUBINDEX"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym113$TERM_ISA_RULE_INDEX = makeSymbol("TERM-ISA-RULE-INDEX");
  public static final SubLSymbol $sym114$VALID_ISA_RULE_INDEX_KEY_ = makeSymbol("VALID-ISA-RULE-INDEX-KEY?");
  public static final SubLList $list115 = list(list(makeSymbol("SENSE"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym116$SUBINDEX = makeUninternedSymbol("SUBINDEX");
  public static final SubLSymbol $sym117$DO_ISA_RULE_INDICES = makeSymbol("DO-ISA-RULE-INDICES");
  public static final SubLSymbol $kw118$ISA_RULE = makeKeyword("ISA-RULE");
  public static final SubLSymbol $sym119$TERM_GENLS_RULE_INDEX = makeSymbol("TERM-GENLS-RULE-INDEX");
  public static final SubLSymbol $sym120$VALID_GENLS_RULE_INDEX_KEY_ = makeSymbol("VALID-GENLS-RULE-INDEX-KEY?");
  public static final SubLSymbol $sym121$SUBINDEX = makeUninternedSymbol("SUBINDEX");
  public static final SubLSymbol $sym122$DO_GENLS_RULE_INDICES = makeSymbol("DO-GENLS-RULE-INDICES");
  public static final SubLSymbol $kw123$GENLS_RULE = makeKeyword("GENLS-RULE");
  public static final SubLSymbol $sym124$TERM_GENL_MT_RULE_INDEX = makeSymbol("TERM-GENL-MT-RULE-INDEX");
  public static final SubLSymbol $sym125$VALID_GENL_MT_RULE_INDEX_KEY_ = makeSymbol("VALID-GENL-MT-RULE-INDEX-KEY?");
  public static final SubLSymbol $sym126$SUBINDEX = makeUninternedSymbol("SUBINDEX");
  public static final SubLSymbol $sym127$DO_GENL_MT_RULE_INDICES = makeSymbol("DO-GENL-MT-RULE-INDICES");
  public static final SubLSymbol $kw128$GENL_MT_RULE = makeKeyword("GENL-MT-RULE");

  //// Initializers

  public void declareFunctions() {
    declare_kb_indexing_macros_file();
  }

  public void initializeVariables() {
    init_kb_indexing_macros_file();
  }

  public void runTopLevelForms() {
    setup_kb_indexing_macros_file();
  }

}
