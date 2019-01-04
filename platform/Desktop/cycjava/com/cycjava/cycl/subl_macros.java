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
import com.cyc.cycjava.cycl.meta_macros;

public  final class subl_macros extends SubLTranslatedFile {

  //// Constructor

  private subl_macros() {}
  public static final SubLFile me = new subl_macros();
  public static final String myName = "com.cyc.cycjava.cycl.subl_macros";

  //// Definitions

  @SubL(source = "cycl/subl-macros.lisp", position = 14186) 
  public static final SubLObject do_sequence_index_doneP(SubLObject index, SubLObject end_index, SubLObject sequence) {
    if (sequence.isList()) {
      return Types.sublisp_null(sequence);
    } else {
      return Numbers.numE(index, end_index);
    }
  }

  /** When non-NIL, ASSERT-TYPE and ASSERT-MUST statements are ignored.
Otherwise, they expand into CHECK-TYPE and MUST statements, respectively. */
  @SubL(source = "cycl/subl-macros.lisp", position = 18699) 
  public static SubLSymbol $ignore_assert_typesP$ = null;

  /** Replace the last cdr of NON-EMPTY-LIST with NEW-LAST-CDR */
  @SubL(source = "cycl/subl-macros.lisp", position = 27221) 
  public static final SubLObject rplacd_last(SubLObject non_empty_list, SubLObject new_last_cdr) {
    return ConsesLow.rplacd(conses_high.last(non_empty_list, UNPROVIDED), new_last_cdr);
  }

  public static final SubLObject declare_subl_macros_file() {
    //declareMacro(myName, "until", "UNTIL");
    //declareMacro(myName, "sublisp_while", "WHILE");
    //declareMacro(myName, "repeat_forever", "REPEAT-FOREVER");
    //declareMacro(myName, "do_numbers", "DO-NUMBERS");
    //declareMacro(myName, "do_numbers_endtest_macro", "DO-NUMBERS-ENDTEST-MACRO");
    //declareFunction(myName, "do_numbers_endtest", "DO-NUMBERS-ENDTEST", 3, 0, false);
    //declareMacro(myName, "do_list", "DO-LIST");
    //declareMacro(myName, "do_list_index", "DO-LIST-INDEX");
    //declareMacro(myName, "do_alist", "DO-ALIST");
    //declareMacro(myName, "do_alist_values", "DO-ALIST-VALUES");
    //declareMacro(myName, "do_alist_keys", "DO-ALIST-KEYS");
    //declareMacro(myName, "cinc_alist", "CINC-ALIST");
    //declareMacro(myName, "cdec_alist", "CDEC-ALIST");
    //declareMacro(myName, "do_plist", "DO-PLIST");
    //declareMacro(myName, "do_plist_properties", "DO-PLIST-PROPERTIES");
    //declareMacro(myName, "do_plist_values", "DO-PLIST-VALUES");
    //declareMacro(myName, "smart_csome", "SMART-CSOME");
    //declareMacro(myName, "cdocons", "CDOCONS");
    //declareMacro(myName, "do_pairs", "DO-PAIRS");
    //declareMacro(myName, "do_list_with_tail", "DO-LIST-WITH-TAIL");
    //declareMacro(myName, "dolists", "DOLISTS");
    //declareMacro(myName, "do_string", "DO-STRING");
    //declareMacro(myName, "do_string_index", "DO-STRING-INDEX");
    //declareMacro(myName, "do_vector", "DO-VECTOR");
    //declareMacro(myName, "do_vector_index", "DO-VECTOR-INDEX");
    //declareMacro(myName, "cdovector", "CDOVECTOR");
    //declareMacro(myName, "csome_vector", "CSOME-VECTOR");
    //declareMacro(myName, "smart_csomevector", "SMART-CSOMEVECTOR");
    //declareMacro(myName, "do_sequence", "DO-SEQUENCE");
    //declareMacro(myName, "do_sequence_index", "DO-SEQUENCE-INDEX");
    declareFunction(myName, "do_sequence_index_doneP", "DO-SEQUENCE-INDEX-DONE?", 3, 0, false);
    //declareFunction(myName, "do_sequence_index_valueP", "DO-SEQUENCE-INDEX-VALUE?", 2, 0, false);
    //declareFunction(myName, "do_sequence_index_update", "DO-SEQUENCE-INDEX-UPDATE", 1, 0, false);
    //declareMacro(myName, "do_hash_table", "DO-HASH-TABLE");
    //declareFunction(myName, "do_hash_table_done_check", "DO-HASH-TABLE-DONE-CHECK", 1, 0, false);
    //declareMacro(myName, "ccatch_ignore", "CCATCH-IGNORE");
    //declareMacro(myName, "punless_error", "PUNLESS-ERROR");
    //declareMacro(myName, "pwhen_error", "PWHEN-ERROR");
    //declareMacro(myName, "warn_on_errors", "WARN-ON-ERRORS");
    //declareMacro(myName, "possibly_warn_on_errors", "POSSIBLY-WARN-ON-ERRORS");
    //declareMacro(myName, "possibly_ignore_errors", "POSSIBLY-IGNORE-ERRORS");
    //declareMacro(myName, "with_default_error_handling", "WITH-DEFAULT-ERROR-HANDLING");
    //declareMacro(myName, "cunwind_on_failure", "CUNWIND-ON-FAILURE");
    //declareMacro(myName, "cunwind_protect_with_fail_clause", "CUNWIND-PROTECT-WITH-FAIL-CLAUSE");
    //declareMacro(myName, "assert_type", "ASSERT-TYPE");
    //declareMacro(myName, "assert_type_if_present", "ASSERT-TYPE-IF-PRESENT");
    //declareMacro(myName, "assert_list_type", "ASSERT-LIST-TYPE");
    //declareMacro(myName, "assert_plist_type", "ASSERT-PLIST-TYPE");
    //declareMacro(myName, "assert_must", "ASSERT-MUST");
    //declareMacro(myName, "pcase_feature", "PCASE-FEATURE");
    //declareMacro(myName, "pif_feature", "PIF-FEATURE");
    //declareMacro(myName, "pwhen_feature", "PWHEN-FEATURE");
    //declareMacro(myName, "punless_feature", "PUNLESS-FEATURE");
    //declareMacro(myName, "fcase_feature", "FCASE-FEATURE");
    //declareMacro(myName, "fif_feature", "FIF-FEATURE");
    //declareMacro(myName, "fwhen_feature", "FWHEN-FEATURE");
    //declareMacro(myName, "funless_feature", "FUNLESS-FEATURE");
    //declareMacro(myName, "fimplies_feature", "FIMPLIES-FEATURE");
    //declareFunction(myName, "atomic_feature_match", "ATOMIC-FEATURE-MATCH", 1, 0, false);
    //declareFunction(myName, "feature_expression_match", "FEATURE-EXPRESSION-MATCH", 1, 0, false);
    //declareMacro(myName, "funcall_if", "FUNCALL-IF");
    //declareMacro(myName, "cpush_if", "CPUSH-IF");
    //declareMacro(myName, "cpushnew_if", "CPUSHNEW-IF");
    //declareMacro(myName, "cpush_all", "CPUSH-ALL");
    //declareMacro(myName, "cpushnew_all", "CPUSHNEW-ALL");
    //declareMacro(myName, "csetf_delete", "CSETF-DELETE");
    //declareMacro(myName, "cpush_end", "CPUSH-END");
    //declareMacro(myName, "cpushnew_end", "CPUSHNEW-END");
    declareFunction(myName, "rplacd_last", "RPLACD-LAST", 2, 0, false);
    //declareMacro(myName, "silently", "SILENTLY");
    //declareMacro(myName, "fimplies", "FIMPLIES");
    //declareMacro(myName, "fxor", "FXOR");
    //declareMacro(myName, "fequiv", "FEQUIV");
    //declareMacro(myName, "possibly_with_static_area", "POSSIBLY-WITH-STATIC-AREA");
    return NIL;
  }

  public static final SubLObject init_subl_macros_file() {
    $ignore_assert_typesP$ = deflexical("*IGNORE-ASSERT-TYPES?*", T);
    return NIL;
  }

  public static final SubLObject setup_subl_macros_file() {
    // CVS_ID("Id: subl-macros.lisp 127877 2009-05-27 15:07:45Z pace ");
    access_macros.register_macro_helper($sym17$DO_NUMBERS_ENDTEST_MACRO, $sym21$DO_NUMBERS);
    access_macros.register_macro_helper($sym26$DO_NUMBERS_ENDTEST, $sym21$DO_NUMBERS);
    access_macros.register_external_symbol($sym27$DO_LIST);
    access_macros.register_macro_helper($sym137$DO_SEQUENCE_INDEX_DONE_, $sym129$DO_SEQUENCE_INDEX);
    access_macros.register_macro_helper($sym138$DO_SEQUENCE_INDEX_VALUE_, $sym129$DO_SEQUENCE_INDEX);
    access_macros.register_macro_helper($sym140$DO_SEQUENCE_INDEX_UPDATE, $sym129$DO_SEQUENCE_INDEX);
    access_macros.register_external_symbol($sym141$DO_HASH_TABLE);
    access_macros.register_macro_helper($sym155$DO_HASH_TABLE_DONE_CHECK, $sym141$DO_HASH_TABLE);
    meta_macros.declare_indention_pattern($sym194$PIF_FEATURE, $list195);
    meta_macros.declare_indention_pattern($sym199$FIF_FEATURE, $list195);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym2$UNTIL = makeSymbol("UNTIL");
  public static final SubLSymbol $sym3$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym4$WHILE = makeSymbol("WHILE");
  public static final SubLList $list5 = list(list(makeSymbol("NUMBER-VAR"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), list(makeSymbol("DELTA"), ONE_INTEGER), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list6 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("DELTA"), makeKeyword("DONE"));
  public static final SubLSymbol $kw7$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw8$START = makeKeyword("START");
  public static final SubLSymbol $kw9$END = makeKeyword("END");
  public static final SubLSymbol $kw10$DELTA = makeKeyword("DELTA");
  public static final SubLSymbol $kw11$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym12$CDOTIMES = makeSymbol("CDOTIMES");
  public static final SubLSymbol $sym13$1_ = makeSymbol("1+");
  public static final SubLSymbol $sym14$_ = makeSymbol("+");
  public static final SubLSymbol $sym15$DELTA_VAR = makeUninternedSymbol("DELTA-VAR");
  public static final SubLSymbol $sym16$END_VAR = makeUninternedSymbol("END-VAR");
  public static final SubLSymbol $sym17$DO_NUMBERS_ENDTEST_MACRO = makeSymbol("DO-NUMBERS-ENDTEST-MACRO");
  public static final SubLSymbol $sym18$COR = makeSymbol("COR");
  public static final SubLSymbol $sym19$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym20$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym21$DO_NUMBERS = makeSymbol("DO-NUMBERS");
  public static final SubLList $list22 = list(makeSymbol("NUMBER-VAR"), makeSymbol("DELTA-FORM"), makeSymbol("END-VAR"));
  public static final SubLSymbol $sym23$__ = makeSymbol(">=");
  public static final SubLSymbol $sym24$__ = makeSymbol("<=");
  public static final SubLSymbol $sym25$_ = makeSymbol("=");
  public static final SubLSymbol $sym26$DO_NUMBERS_ENDTEST = makeSymbol("DO-NUMBERS-ENDTEST");
  public static final SubLSymbol $sym27$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLList $list28 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list29 = list(makeKeyword("DONE"), makeKeyword("PROGRESS-MESSAGE"));
  public static final SubLSymbol $kw30$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $sym31$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");
  public static final SubLSymbol $sym32$LIST_VAR = makeUninternedSymbol("LIST-VAR");
  public static final SubLSymbol $sym33$SOFAR = makeUninternedSymbol("SOFAR");
  public static final SubLSymbol $sym34$TOTAL = makeUninternedSymbol("TOTAL");
  public static final SubLList $list35 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym36$LENGTH = makeSymbol("LENGTH");
  public static final SubLSymbol $sym37$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym38$NOTE_PERCENT_PROGRESS = makeSymbol("NOTE-PERCENT-PROGRESS");
  public static final SubLSymbol $sym39$CINC = makeSymbol("CINC");
  public static final SubLSymbol $sym40$REST = makeUninternedSymbol("REST");
  public static final SubLSymbol $sym41$CDR = makeSymbol("CDR");
  public static final SubLSymbol $sym42$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym43$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym44$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLList $list45 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("LIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list46 = list(makeKeyword("DONE"));
  public static final SubLSymbol $sym47$LIST_VAR = makeUninternedSymbol("LIST-VAR");
  public static final SubLList $list48 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list49 = list(makeKeyword("INDEX"), makeKeyword("DONE"));
  public static final SubLSymbol $kw50$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $sym51$DO_ALIST = makeSymbol("DO-ALIST");
  public static final SubLSymbol $sym52$CONS = makeUninternedSymbol("CONS");
  public static final SubLSymbol $sym53$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLList $list54 = list(list(makeSymbol("VALUE"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym55$KEY = makeUninternedSymbol("KEY");
  public static final SubLSymbol $sym56$IGNORE = makeSymbol("IGNORE");
  public static final SubLList $list57 = list(list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym58$VALUE = makeUninternedSymbol("VALUE");
  public static final SubLList $list59 = list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("INCREMENT"), ONE_INTEGER));
  public static final SubLSymbol $sym60$ENTRY = makeUninternedSymbol("ENTRY");
  public static final SubLSymbol $sym61$ASSOC = makeSymbol("ASSOC");
  public static final SubLSymbol $sym62$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym63$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym64$CONS = makeSymbol("CONS");
  public static final SubLSymbol $sym65$CPUSH = makeSymbol("CPUSH");
  public static final SubLSymbol $sym66$RPLACD = makeSymbol("RPLACD");
  public static final SubLList $list67 = list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("DECREMENT"), ONE_INTEGER));
  public static final SubLSymbol $sym68$CINC_ALIST = makeSymbol("CINC-ALIST");
  public static final SubLList $list69 = list(list(makeSymbol("PROPERTY"), makeSymbol("VALUE"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym70$REMAINDER = makeUninternedSymbol("REMAINDER");
  public static final SubLSymbol $sym71$CDDR = makeSymbol("CDDR");
  public static final SubLSymbol $sym72$CADR = makeSymbol("CADR");
  public static final SubLList $list73 = list(list(makeSymbol("PROPERTY"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym74$VALUE = makeUninternedSymbol("VALUE");
  public static final SubLSymbol $sym75$DO_PLIST = makeSymbol("DO-PLIST");
  public static final SubLList $list76 = list(list(makeSymbol("VALUE"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym77$PROPERTY = makeUninternedSymbol("PROPERTY");
  public static final SubLList $list78 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("DONEVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list79 = list(list(makeSymbol("VAR"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym80$ATOM = makeSymbol("ATOM");
  public static final SubLList $list81 = list(list(makeSymbol("VAR1"), makeSymbol("VAR2"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym82$LIST = makeUninternedSymbol("LIST");
  public static final SubLSymbol $sym83$CDOCONS = makeSymbol("CDOCONS");
  public static final SubLSymbol $sym84$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym85$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym86$REST = makeSymbol("REST");
  public static final SubLList $list87 = list(list(makeSymbol("ITEM"), makeSymbol("TAIL"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym88$CDR_VAR = makeUninternedSymbol("CDR-VAR");
  public static final SubLList $list89 = list(list(makeSymbol("&REST"), makeSymbol("SPECS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str90$CURRENT__A = makeString("CURRENT-~A");
  public static final SubLSymbol $sym91$CAND = makeSymbol("CAND");
  public static final SubLList $list92 = list(list(makeSymbol("CHAR"), makeSymbol("STRING"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("CHAR-NUM"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list93 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("CHAR-NUM"), makeKeyword("DONE"));
  public static final SubLSymbol $kw94$CHAR_NUM = makeKeyword("CHAR-NUM");
  public static final SubLSymbol $sym95$DO_STRING_INDEX = makeSymbol("DO-STRING-INDEX");
  public static final SubLSymbol $sym96$CHAR_NUM = makeUninternedSymbol("CHAR-NUM");
  public static final SubLSymbol $sym97$DO_STRING = makeSymbol("DO-STRING");
  public static final SubLList $list98 = list(list(makeSymbol("CHAR-NUM"), makeSymbol("CHAR"), makeSymbol("STRING"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list99 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("DONE"));
  public static final SubLSymbol $sym100$STRING_VAR = makeUninternedSymbol("STRING-VAR");
  public static final SubLSymbol $sym101$END_VAR = makeUninternedSymbol("END-VAR");
  public static final SubLSymbol $sym102$FIF = makeSymbol("FIF");
  public static final SubLSymbol $sym103$CHAR = makeSymbol("CHAR");
  public static final SubLList $list104 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR"), makeSymbol("&KEY"), makeSymbol("ELEMENT-NUM"), makeSymbol("DONE"), makeSymbol("BACKWARD?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list105 = list(makeKeyword("ELEMENT-NUM"), makeKeyword("DONE"), makeKeyword("BACKWARD?"));
  public static final SubLSymbol $kw106$ELEMENT_NUM = makeKeyword("ELEMENT-NUM");
  public static final SubLSymbol $kw107$BACKWARD_ = makeKeyword("BACKWARD?");
  public static final SubLSymbol $sym108$DO_VECTOR_INDEX = makeSymbol("DO-VECTOR-INDEX");
  public static final SubLSymbol $sym109$ELEMENT_NUM = makeUninternedSymbol("ELEMENT-NUM");
  public static final SubLList $list110 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("VECTOR"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("BACKWARD?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list111 = list(makeKeyword("DONE"), makeKeyword("BACKWARD?"));
  public static final SubLSymbol $sym112$VECTOR_VAR = makeUninternedSymbol("VECTOR-VAR");
  public static final SubLSymbol $sym113$BACKWARD__VAR = makeUninternedSymbol("BACKWARD?-VAR");
  public static final SubLSymbol $sym114$LENGTH = makeUninternedSymbol("LENGTH");
  public static final SubLSymbol $sym115$START = makeUninternedSymbol("START");
  public static final SubLSymbol $sym116$END = makeUninternedSymbol("END");
  public static final SubLSymbol $sym117$DELTA = makeUninternedSymbol("DELTA");
  public static final SubLSymbol $sym118$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym119$_ = makeSymbol("-");
  public static final SubLList $list120 = list(ONE_INTEGER);
  public static final SubLList $list121 = list(MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);
  public static final SubLSymbol $sym122$AREF = makeSymbol("AREF");
  public static final SubLSymbol $sym123$ITERATION = makeUninternedSymbol("ITERATION");
  public static final SubLList $list124 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym125$DO_VECTOR = makeSymbol("DO-VECTOR");
  public static final SubLList $list126 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR"), makeSymbol("DONEVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list127 = list(list(makeSymbol("VAR"), makeSymbol("SEQUENCE"), makeSymbol("&KEY"), makeSymbol("ELEMENT-NUM"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list128 = list(makeKeyword("ELEMENT-NUM"), makeKeyword("DONE"));
  public static final SubLSymbol $sym129$DO_SEQUENCE_INDEX = makeSymbol("DO-SEQUENCE-INDEX");
  public static final SubLSymbol $sym130$ELEMENT_NUM = makeUninternedSymbol("ELEMENT-NUM");
  public static final SubLList $list131 = list(list(makeSymbol("KEY-VAR"), makeSymbol("VALUE-VAR"), makeSymbol("SEQUENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym132$SEQUENCE_VAR = makeUninternedSymbol("SEQUENCE-VAR");
  public static final SubLSymbol $sym133$END_INDEX = makeUninternedSymbol("END-INDEX");
  public static final SubLSymbol $sym134$SEQUENCE_DONE_ = makeUninternedSymbol("SEQUENCE-DONE?");
  public static final SubLSymbol $sym135$FUNLESS = makeSymbol("FUNLESS");
  public static final SubLSymbol $sym136$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym137$DO_SEQUENCE_INDEX_DONE_ = makeSymbol("DO-SEQUENCE-INDEX-DONE?");
  public static final SubLSymbol $sym138$DO_SEQUENCE_INDEX_VALUE_ = makeSymbol("DO-SEQUENCE-INDEX-VALUE?");
  public static final SubLSymbol $sym139$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym140$DO_SEQUENCE_INDEX_UPDATE = makeSymbol("DO-SEQUENCE-INDEX-UPDATE");
  public static final SubLSymbol $sym141$DO_HASH_TABLE = makeSymbol("DO-HASH-TABLE");
  public static final SubLList $list142 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("HASH-TABLE"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym143$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");
  public static final SubLSymbol $sym144$SILENT_ = makeUninternedSymbol("SILENT?");
  public static final SubLSymbol $sym145$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");
  public static final SubLSymbol $sym146$INDEX_VAR = makeUninternedSymbol("INDEX-VAR");
  public static final SubLSymbol $sym147$COUNT_VAR = makeUninternedSymbol("COUNT-VAR");
  public static final SubLList $list148 = list(makeSymbol("*SILENT-PROGRESS?*"));
  public static final SubLSymbol $sym149$_SILENT_PROGRESS__ = makeSymbol("*SILENT-PROGRESS?*");
  public static final SubLSymbol $sym150$FIRST_OF = makeSymbol("FIRST-OF");
  public static final SubLList $list151 = list(makeString(""));
  public static final SubLSymbol $sym152$HASH_TABLE_COUNT = makeSymbol("HASH-TABLE-COUNT");
  public static final SubLSymbol $sym153$CCATCH_IGNORE = makeSymbol("CCATCH-IGNORE");
  public static final SubLSymbol $kw154$DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");
  public static final SubLSymbol $sym155$DO_HASH_TABLE_DONE_CHECK = makeSymbol("DO-HASH-TABLE-DONE-CHECK");
  public static final SubLSymbol $sym156$CDOHASH = makeSymbol("CDOHASH");
  public static final SubLList $list157 = list(makeSymbol("TAG"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym158$CATCH_VAR = makeUninternedSymbol("CATCH-VAR");
  public static final SubLSymbol $sym159$CCATCH = makeSymbol("CCATCH");
  public static final SubLList $list160 = list(makeSymbol("FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym161$ERROR = makeUninternedSymbol("ERROR");
  public static final SubLSymbol $sym162$CATCH_ERROR_MESSAGE = makeSymbol("CATCH-ERROR-MESSAGE");
  public static final SubLSymbol $sym163$ERROR = makeUninternedSymbol("ERROR");
  public static final SubLSymbol $sym164$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym165$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");
  public static final SubLSymbol $sym166$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym167$WARN = makeSymbol("WARN");
  public static final SubLString $str168$_A = makeString("~A");
  public static final SubLList $list169 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym170$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym171$WARN_ON_ERRORS = makeSymbol("WARN-ON-ERRORS");
  public static final SubLSymbol $sym172$IGNORE_ERRORS = makeSymbol("IGNORE-ERRORS");
  public static final SubLSymbol $sym173$WITH_ERROR_HANDLER = makeSymbol("WITH-ERROR-HANDLER");
  public static final SubLList $list174 = list(makeSymbol("PROTECTED-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym175$SUCCESS_VAR = makeUninternedSymbol("SUCCESS-VAR");
  public static final SubLSymbol $sym176$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLList $list177 = list(T);
  public static final SubLList $list178 = list(makeSymbol("PROTECTED-FORM"), makeSymbol("FAILURE-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym179$SUCCESS_VAR = makeUninternedSymbol("SUCCESS-VAR");
  public static final SubLList $list180 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));
  public static final SubLSymbol $sym181$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLSymbol $sym182$CHECK_TYPE_IF_PRESENT = makeSymbol("CHECK-TYPE-IF-PRESENT");
  public static final SubLList $list183 = list(makeSymbol("LIST"), makeSymbol("PRED"));
  public static final SubLSymbol $sym184$CHECK_LIST_TYPE = makeSymbol("CHECK-LIST-TYPE");
  public static final SubLList $list185 = list(makeSymbol("PLIST"), makeSymbol("PRED"));
  public static final SubLSymbol $sym186$CHECK_PLIST_TYPE = makeSymbol("CHECK-PLIST-TYPE");
  public static final SubLList $list187 = list(makeSymbol("FORM"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));
  public static final SubLList $list188 = list(makeSymbol("PROGN"));
  public static final SubLSymbol $sym189$MUST = makeSymbol("MUST");
  public static final SubLList $list190 = cons(makeSymbol("FEATURE-EXPRESSION"), makeSymbol("BODY"));
  public static final SubLSymbol $sym191$OTHERWISE = makeSymbol("OTHERWISE");
  public static final SubLList $list192 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("ACTION"), makeSymbol("ELSE-ACTION"));
  public static final SubLSymbol $sym193$PCASE_FEATURE = makeSymbol("PCASE-FEATURE");
  public static final SubLSymbol $sym194$PIF_FEATURE = makeSymbol("PIF-FEATURE");
  public static final SubLList $list195 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("&BODY"), makeSymbol("FEATURE-CLAUSES"));
  public static final SubLList $list196 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list197 = list(makeSymbol("FEATURE-EXPRESSION"), makeSymbol("FORM"));
  public static final SubLSymbol $sym198$FCASE_FEATURE = makeSymbol("FCASE-FEATURE");
  public static final SubLSymbol $sym199$FIF_FEATURE = makeSymbol("FIF-FEATURE");
  public static final SubLList $list200 = list(NIL);
  public static final SubLList $list201 = list(list(makeSymbol("OTHERWISE"), T));
  public static final SubLList $list202 = cons(makeSymbol("OPERATOR"), makeSymbol("SUBEXPRESSIONS"));
  public static final SubLSymbol $kw203$NOT = makeKeyword("NOT");
  public static final SubLSymbol $sym204$NOT = makeSymbol("NOT");
  public static final SubLSymbol $kw205$OR = makeKeyword("OR");
  public static final SubLSymbol $sym206$OR = makeSymbol("OR");
  public static final SubLSymbol $kw207$AND = makeKeyword("AND");
  public static final SubLSymbol $sym208$AND = makeSymbol("AND");
  public static final SubLString $str209$_S_is_not_a_well_formed_feature_e = makeString("~S is not a well-formed feature expression");
  public static final SubLList $list210 = list(makeSymbol("FUNC"), makeSymbol("&REST"), makeSymbol("ARGS"));
  public static final SubLList $list211 = list(makeSymbol("FALSE"));
  public static final SubLSymbol $sym212$FWHEN = makeSymbol("FWHEN");
  public static final SubLSymbol $sym213$FUNCALL = makeSymbol("FUNCALL");
  public static final SubLList $list214 = list(makeSymbol("ITEM"), makeSymbol("PLACE"));
  public static final SubLSymbol $sym215$VAR = makeUninternedSymbol("VAR");
  public static final SubLList $list216 = list(makeSymbol("ITEM"), makeSymbol("PLACE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), IDENTITY))));
  public static final SubLList $list217 = list(makeSymbol("FUNCTION"), EQL);
  public static final SubLList $list218 = list(makeSymbol("FUNCTION"), IDENTITY);
  public static final SubLSymbol $sym219$VAR = makeUninternedSymbol("VAR");
  public static final SubLSymbol $sym220$CPUSHNEW = makeSymbol("CPUSHNEW");
  public static final SubLList $list221 = list(makeSymbol("ITEMS"), makeSymbol("PLACE"));
  public static final SubLSymbol $sym222$ITEM = makeUninternedSymbol("ITEM");
  public static final SubLSymbol $sym223$ITEMS_VAR = makeUninternedSymbol("ITEMS-VAR");
  public static final SubLSymbol $sym224$VECTORP = makeSymbol("VECTORP");
  public static final SubLList $list225 = list(makeSymbol("ITEMS"), makeSymbol("PLACE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), IDENTITY))));
  public static final SubLSymbol $sym226$ITEM = makeUninternedSymbol("ITEM");
  public static final SubLSymbol $sym227$ITEMS_VAR = makeUninternedSymbol("ITEMS-VAR");
  public static final SubLList $list228 = list(makeSymbol("ITEM"), makeSymbol("PLACE"), makeSymbol("&KEY"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), IDENTITY))));
  public static final SubLList $list229 = list(makeKeyword("TEST"), makeKeyword("KEY"));
  public static final SubLSymbol $kw230$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw231$KEY = makeKeyword("KEY");
  public static final SubLSymbol $sym232$CSETF = makeSymbol("CSETF");
  public static final SubLSymbol $sym233$DELETE = makeSymbol("DELETE");
  public static final SubLSymbol $sym234$NEW_CONS = makeUninternedSymbol("NEW-CONS");
  public static final SubLSymbol $sym235$LIST = makeUninternedSymbol("LIST");
  public static final SubLSymbol $sym236$RPLACD_LAST = makeSymbol("RPLACD-LAST");
  public static final SubLSymbol $sym237$ITEM_VAR = makeUninternedSymbol("ITEM-VAR");
  public static final SubLSymbol $sym238$MEMBER = makeSymbol("MEMBER");
  public static final SubLSymbol $sym239$CPUSH_END = makeSymbol("CPUSH-END");
  public static final SubLList $list240 = list(list(makeSymbol("*IGNORE-WARNS?*"), T), list(makeSymbol("*IGNORE-BREAKS?*"), T), list(makeSymbol("*SILENT-PROGRESS?*"), T), list(makeSymbol("*CONTINUE-CERROR?*"), T), list(makeSymbol("*STANDARD-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*ERROR-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")));
  public static final SubLList $list241 = list(makeSymbol("LHS"), makeSymbol("RHS"));
  public static final SubLList $list242 = list(makeSymbol("A"), makeSymbol("B"));
  public static final SubLList $list243 = list(makeSymbol("VAR?"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $kw244$SL2JAVA = makeKeyword("SL2JAVA");
  public static final SubLSymbol $sym245$WITH_STATIC_AREA = makeSymbol("WITH-STATIC-AREA");

  //// Initializers

  public void declareFunctions() {
    declare_subl_macros_file();
  }

  public void initializeVariables() {
    init_subl_macros_file();
  }

  public void runTopLevelForms() {
    setup_subl_macros_file();
  }

}
