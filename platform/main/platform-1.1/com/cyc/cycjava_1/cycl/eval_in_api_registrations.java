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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.eval_in_api;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class eval_in_api_registrations extends SubLTranslatedFile {

  //// Constructor

  private eval_in_api_registrations() {}
  public static final SubLFile me = new eval_in_api_registrations();
  public static final String myName = "com.cyc.cycjava_1.cycl.eval_in_api_registrations";

  //// Definitions

  @SubL(source = "cycl/eval-in-api-registrations.lisp", position = 4374) 
  private static SubLSymbol $sublisp_api_predefined_functions$ = null;

  @SubL(source = "cycl/eval-in-api-registrations.lisp", position = 22657) 
  private static SubLSymbol $api_host_access_functions$ = null;

  public static final SubLObject declare_eval_in_api_registrations_file() {
    declareMacro(myName, "api_bq_list", "API-BQ-LIST");
    return NIL;
  }

  public static final SubLObject init_eval_in_api_registrations_file() {
    $sublisp_api_predefined_functions$ = deflexical("*SUBLISP-API-PREDEFINED-FUNCTIONS*", $list62);
    $api_host_access_functions$ = deflexical("*API-HOST-ACCESS-FUNCTIONS*", $list151);
    return NIL;
  }

  public static final SubLObject setup_eval_in_api_registrations_file() {
    // CVS_ID("Id: eval-in-api-registrations.lisp 128642 2009-08-27 01:08:04Z rck ");
    eval_in_api.register_api_immutable_global($sym0$_NULL_OUTPUT_);
    eval_in_api.register_api_mutable_global($sym1$_IT_VERBOSE_);
    eval_in_api.register_api_mutable_global($sym2$_PROGRESS_NOTE_);
    eval_in_api.register_api_mutable_global($sym3$_PROGRESS_SOFAR_);
    eval_in_api.register_api_mutable_global($sym4$_PROGRESS_START_TIME_);
    eval_in_api.register_api_mutable_global($sym5$_PROGRESS_TOTAL_);
    eval_in_api.register_api_mutable_global($sym6$_EVAL_WITH_BINDINGS_);
    eval_in_api.register_api_mutable_global($sym7$_ERROR_OUTPUT_);
    eval_in_api.register_api_mutable_global($sym8$_STANDARD_OUTPUT_);
    eval_in_api.register_api_mutable_global($sym9$_CONTINUE_CERROR__);
    eval_in_api.register_api_mutable_global($sym10$_SILENT_PROGRESS__);
    eval_in_api.register_api_mutable_global($sym11$_IGNORE_BREAKS__);
    eval_in_api.register_api_mutable_global($sym12$_IGNORE_WARNS__);
    eval_in_api.register_api_mutable_global($sym13$_EVAL_IN_API_TRACE_LOG_);
    eval_in_api.register_api_mutable_global($sym14$_EVAL_IN_API_TRACED_FNS_);
    eval_in_api.register_api_mutable_global($sym15$_EVAL_IN_API_ENV_);
    eval_in_api.register_api_mutable_global($sym16$_API_OUTPUT_PROTOCOL_);
    eval_in_api.register_api_mutable_global($sym17$_API_RESULT_METHOD_);
    eval_in_api.register_api_mutable_global($sym18$_API_INPUT_PROTOCOL_);
    eval_in_api.register_api_mutable_global($sym19$_KE_PURPOSE_);
    eval_in_api.register_api_mutable_global($sym20$_THE_CYCLIST_);
    eval_in_api.register_api_mutable_global($sym21$_USE_LOCAL_QUEUE__);
    eval_in_api.register_api_mutable_global($sym22$_RELEVANT_MT_FUNCTION_);
    eval_in_api.register_api_mutable_global($sym23$_CYC_BOOKKEEPING_INFO_);
    eval_in_api.register_api_mutable_global($sym24$_SUPPRESS_SBHL_RECACHING__);
    eval_in_api.register_api_mutable_global($sym25$_PARAPHRASE_PRECISION_);
    eval_in_api.register_api_mutable_global($sym26$_EVAL_IN_API_LEVEL_);
    eval_in_api.register_api_mutable_global($sym27$_SUSPEND_SBHL_TYPE_CHECKING__);
    eval_in_api.register_api_mutable_global($sym28$_REQUIRE_CASE_INSENSITIVE_NAME_UNIQUENESS_);
    eval_in_api.register_api_mutable_global($sym29$_TASK_PROCESSOR_VERBOSITY_);
    utilities_macros.register_api_predefined_macro($sym30$BQ_APPEND);
    utilities_macros.register_api_predefined_macro($sym31$BQ_LIST);
    utilities_macros.register_api_predefined_macro($sym32$BQ_LIST_);
    utilities_macros.register_api_predefined_macro($sym33$BQ_NCONC);
    utilities_macros.register_api_predefined_macro($sym34$BQ_VECTOR_APPEND);
    utilities_macros.register_api_predefined_macro($sym36$API_BQ_LIST);
    utilities_macros.register_api_predefined_macro($sym37$CDESTRUCTURING_BIND);
    utilities_macros.register_api_predefined_macro($sym38$WITH_PRECISE_PARAPHRASE_ON);
    utilities_macros.register_api_predefined_macro($sym39$WITH_PARAPHRASE_PRECISION);
    utilities_macros.register_api_predefined_macro($sym40$WITH_BOOKKEEPING_INFO);
    utilities_macros.register_api_predefined_macro($sym41$WITH_MT_FUNCTION);
    utilities_macros.register_api_predefined_macro($sym42$WITH_GENL_MTS);
    utilities_macros.register_api_predefined_macro($sym43$WITH_INFERENCE_MT_RELEVANCE);
    utilities_macros.register_api_predefined_macro($sym44$WITH_ALL_MTS);
    utilities_macros.register_api_predefined_macro($sym45$DO_PREDICATE_RULE_INDEX);
    utilities_macros.register_api_predefined_macro($sym46$DO_RULE_INDEX);
    utilities_macros.register_api_predefined_macro($sym47$WITHOUT_WFF_SEMANTICS);
    utilities_macros.register_api_predefined_macro($sym48$CDOLIST_DONE);
    utilities_macros.register_api_predefined_macro($sym49$DO_DICTIONARY);
    utilities_macros.register_api_predefined_macro($sym50$PROGRESS_CDOTIMES);
    utilities_macros.register_api_predefined_macro($sym51$DO_KB_SUID_TABLE);
    utilities_macros.register_api_predefined_macro($sym52$DO_ID_INDEX);
    utilities_macros.register_api_predefined_macro($sym53$OLD_DO_ID_INDEX);
    utilities_macros.register_api_predefined_macro($sym54$DO_CONSTANTS);
    utilities_macros.register_api_predefined_macro($sym55$CWITH_OUTPUT_TO_STRING);
    utilities_macros.register_api_predefined_macro($sym56$WITH_INPUT_FROM_STRING);
    utilities_macros.register_api_predefined_macro($sym57$DO_VECTOR_INDEX);
    utilities_macros.register_api_predefined_macro($sym58$IN_MT);
    utilities_macros.register_api_predefined_host_macro($sym59$WITH_OPEN_STREAM);
    utilities_macros.register_api_predefined_host_macro($sym60$WITH_OPEN_FILE);
    utilities_macros.register_api_predefined_host_macro($sym61$WITH_TCP_CONNECTION);
    {
      SubLObject cdolist_list_var = $sublisp_api_predefined_functions$.getGlobalValue();
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $list63;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $list64;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    utilities_macros.register_api_predefined_function($sym65$STRING_TO_GUID);
    utilities_macros.register_api_predefined_function($sym66$GUID_TO_STRING);
    utilities_macros.register_api_predefined_function($sym67$REMOVE_DUPLICATES);
    utilities_macros.register_api_predefined_function($sym68$NEW_BOOKKEEPING_INFO);
    utilities_macros.register_api_predefined_function($sym69$STRING_SUBSTITUTE);
    utilities_macros.register_api_predefined_function($sym70$GENERATE_PHRASE);
    utilities_macros.register_api_predefined_function($sym71$THE_DATE);
    utilities_macros.register_api_predefined_function($sym72$THE_SECOND);
    utilities_macros.register_api_predefined_function($sym73$ISA);
    utilities_macros.register_api_predefined_function($sym74$GENLS);
    utilities_macros.register_api_predefined_function($sym75$WHY_COLLECTIONS_INTERSECT_);
    utilities_macros.register_api_predefined_function($sym76$ARG1_FORMAT);
    utilities_macros.register_api_predefined_function($sym77$ARG2_FORMAT);
    utilities_macros.register_api_predefined_function($sym78$SPECS);
    utilities_macros.register_api_predefined_function($sym79$COLLECTION_LEAVES);
    utilities_macros.register_api_predefined_function($sym80$SIMPLE_INDEXED_TERM_P);
    utilities_macros.register_api_predefined_function($sym81$MAX_SPECS);
    utilities_macros.register_api_predefined_function($sym82$MIN_ISA);
    utilities_macros.register_api_predefined_function($sym83$LOCAL_DISJOINT_WITH);
    utilities_macros.register_api_predefined_function($sym84$DISJOINT_WITH_);
    utilities_macros.register_api_predefined_function($sym85$GENL_SIBLINGS);
    utilities_macros.register_api_predefined_function($sym86$SPEC_SIBLINGS);
    utilities_macros.register_api_predefined_function($sym87$ARG1_ISA);
    utilities_macros.register_api_predefined_function($sym88$ARG2_ISA);
    utilities_macros.register_api_predefined_function($sym89$ARGN_ISA);
    utilities_macros.register_api_predefined_function($sym89$ARGN_ISA);
    utilities_macros.register_api_predefined_function($sym90$ARGN_GENL);
    utilities_macros.register_api_predefined_function($sym91$ALL_GENLS_IN_ANY_MT);
    utilities_macros.register_api_predefined_function($sym92$ALL_ISA_IN_ANY_MT);
    utilities_macros.register_api_predefined_function($sym93$ALL_FORT_INSTANCES_IN_ALL_MTS);
    utilities_macros.register_api_predefined_function($sym94$ISA_IN_ANY_MT_);
    utilities_macros.register_api_predefined_function($sym95$GENL_IN_ANY_MT_);
    utilities_macros.register_api_predefined_function($sym96$NEW_CONSTANT_NAME_SPEC_P);
    utilities_macros.register_api_predefined_function($sym97$DO_RULE_INDEX_RULES);
    utilities_macros.register_api_predefined_function($sym98$BT_LOWER);
    utilities_macros.register_api_predefined_function($sym99$BT_HIGHER);
    utilities_macros.register_api_predefined_function($sym100$SAMPLE_LEAF_SPECS);
    utilities_macros.register_api_predefined_function($sym101$TACIT_COEXTENSIONAL_);
    utilities_macros.register_api_predefined_function($sym102$EL_WFF_);
    utilities_macros.register_api_predefined_function($sym103$EVALUATABLE_PREDICATE_);
    utilities_macros.register_api_predefined_function($sym104$HIERARCHICAL_COLLECTIONS_);
    utilities_macros.register_api_predefined_function($sym105$NUM_BEST_GAF_LOOKUP_INDEX);
    utilities_macros.register_api_predefined_function($sym106$API_QUIT);
    utilities_macros.register_api_predefined_function($sym107$NART_P);
    utilities_macros.register_api_predefined_function($sym108$EL_VARIABLE_P);
    utilities_macros.register_api_predefined_function($sym109$PPH_PRECISION_P);
    utilities_macros.register_api_predefined_function($sym110$FORT_FOR_STRING);
    utilities_macros.register_api_predefined_function($sym111$RTP_PARSE_EXP_W_VPP);
    utilities_macros.register_api_predefined_function($sym112$GET_UNIVERSAL_TIME);
    utilities_macros.register_api_predefined_function($sym113$DECODE_UNIVERSAL_TIME);
    utilities_macros.register_api_predefined_function($sym114$FIND_NART);
    utilities_macros.register_api_predefined_function($sym115$CONSTANT_GUID);
    utilities_macros.register_api_predefined_function($sym116$RKF_PHRASE_READER);
    utilities_macros.register_api_predefined_function($sym117$GENERATE_DISAMBIGUATION_PHRASES_AND_TYPES);
    utilities_macros.register_api_predefined_function($sym118$LOAD_TRANSCRIPT_FILE);
    utilities_macros.register_api_predefined_function($sym119$KB_STATISTICS);
    utilities_macros.register_api_predefined_function($sym120$GENL_MT_);
    utilities_macros.register_api_predefined_function($sym121$ALL_SPEC_MTS);
    utilities_macros.register_api_predefined_function($sym122$REMOVAL_ASK);
    utilities_macros.register_api_predefined_function($sym123$DO_NARTS_TABLE);
    utilities_macros.register_api_predefined_function($sym124$ID_INDEX_COUNT);
    utilities_macros.register_api_predefined_function($sym125$ID_INDEX_OLD_OBJECTS);
    utilities_macros.register_api_predefined_function($sym126$ID_INDEX_EMPTY_P);
    utilities_macros.register_api_predefined_function($sym127$ID_INDEX_NEW_ID_THRESHOLD);
    utilities_macros.register_api_predefined_function($sym128$ID_INDEX_NEXT_ID);
    utilities_macros.register_api_predefined_function($sym129$CYCL_NART_P);
    utilities_macros.register_api_predefined_function($sym130$CYCL_NAUT_P);
    utilities_macros.register_api_predefined_function($sym131$RESOLVE_NEW_CONSTANTS);
    utilities_macros.register_api_predefined_function($sym132$CYC_OPENCYC_FEATURE);
    utilities_macros.register_api_predefined_function($sym133$CYC_RESEARCHCYC_FEATURE);
    utilities_macros.register_api_predefined_function($sym134$CANONICALIZE_HLMT);
    utilities_macros.register_api_predefined_function($sym135$NEW_CYC_QUERY);
    utilities_macros.register_api_predefined_function($sym136$REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE);
    utilities_macros.register_api_predefined_function($sym137$INFERENCE_REMOVAL_MODULE);
    utilities_macros.register_api_predefined_function($sym138$UNDECLARE_INFERENCE_REMOVAL_MODULE);
    {
      SubLObject cdolist_list_var = $list139;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $list140;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $list141;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $list142;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $list143;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $list144;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $list145;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $list146;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $list147;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_macro(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $list148;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        eval_in_api.register_api_mutable_global(symbol);
      }
    }
    access_macros.register_external_symbol($sym149$__);
    {
      SubLObject cdolist_list_var = $list150;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $api_host_access_functions$.getGlobalValue();
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_host_function(symbol);
      }
    }
    utilities_macros.register_api_predefined_function($sym152$PHRASE_FOR_MT);
    utilities_macros.register_api_predefined_function($sym153$BEST_STRING_OF_NL_PHRASE_DEFN);
    utilities_macros.register_api_predefined_function($sym154$CYC_1_BYTE_INTEGER);
    utilities_macros.register_api_predefined_function($sym155$CYC_2_BYTE_INTEGER);
    utilities_macros.register_api_predefined_function($sym156$CYC_4_BYTE_INTEGER);
    utilities_macros.register_api_predefined_function($sym157$CYC_8_BYTE_INTEGER);
    utilities_macros.register_api_predefined_function($sym158$CYC_ABSOLUTE_VALUE);
    utilities_macros.register_api_predefined_function($sym159$CYC_ADD_ENGLISH_SUFFIX);
    utilities_macros.register_api_predefined_function($sym160$CYC_ARC_COSECANT);
    utilities_macros.register_api_predefined_function($sym161$CYC_ARC_COSINE);
    utilities_macros.register_api_predefined_function($sym162$CYC_ARC_COTANGENT);
    utilities_macros.register_api_predefined_function($sym163$CYC_ARC_SECANT);
    utilities_macros.register_api_predefined_function($sym164$CYC_ARC_SINE);
    utilities_macros.register_api_predefined_function($sym165$CYC_ARC_TANGENT);
    utilities_macros.register_api_predefined_function($sym166$CYC_ASCII_STRING_P);
    utilities_macros.register_api_predefined_function($sym167$CYC_AVERAGE);
    utilities_macros.register_api_predefined_function($sym168$CYC_BIT_DATATYPE);
    utilities_macros.register_api_predefined_function($sym169$CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR);
    utilities_macros.register_api_predefined_function($sym170$CYC_COSECANT);
    utilities_macros.register_api_predefined_function($sym171$CYC_COSINE);
    utilities_macros.register_api_predefined_function($sym172$CYC_COTANGENT);
    utilities_macros.register_api_predefined_function($sym173$CYC_DATE_AFTER);
    utilities_macros.register_api_predefined_function($sym174$CYC_DATE_BEFORE);
    utilities_macros.register_api_predefined_function($sym175$CYC_DATE_DECODE_STRING);
    utilities_macros.register_api_predefined_function($sym176$CYC_DATE_ENCODE_STRING);
    utilities_macros.register_api_predefined_function($sym177$CYC_DATE_FROM_INTEGER);
    utilities_macros.register_api_predefined_function($sym178$CYC_DATE_FROM_STRING);
    utilities_macros.register_api_predefined_function($sym179$CYC_DATE_SUBSUMES);
    utilities_macros.register_api_predefined_function($sym180$CYC_DAY_OF_DATE);
    utilities_macros.register_api_predefined_function($sym181$CYC_DAY_OF_WEEK_AFTER_DATE);
    utilities_macros.register_api_predefined_function($sym182$CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE);
    utilities_macros.register_api_predefined_function($sym183$CYC_DAY_OF_WEEK_DEFN);
    utilities_macros.register_api_predefined_function($sym184$CYC_DAY_OF_WEEK_OF_DATE);
    utilities_macros.register_api_predefined_function($sym185$CYC_DAY_OF_WEEK_PRIOR_TO_DATE);
    utilities_macros.register_api_predefined_function($sym186$CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE);
    utilities_macros.register_api_predefined_function($sym187$CYC_DIFFERENCE);
    utilities_macros.register_api_predefined_function($sym188$CYC_DIFFERENT);
    utilities_macros.register_api_predefined_function($sym189$CYC_DIFFERENT_SYMBOLS);
    utilities_macros.register_api_predefined_function($sym190$CYC_EVALUATE_SUBL);
    utilities_macros.register_api_predefined_function($sym191$CYC_EVEN_NUMBER);
    utilities_macros.register_api_predefined_function($sym192$CYC_EXP);
    utilities_macros.register_api_predefined_function($sym193$CYC_EXPONENT);
    utilities_macros.register_api_predefined_function($sym194$CYC_EXTENDED_NUMBER_P);
    utilities_macros.register_api_predefined_function($sym195$CYC_GREATER_THAN);
    utilities_macros.register_api_predefined_function($sym196$CYC_GREATER_THAN_OR_EQUAL_TO);
    utilities_macros.register_api_predefined_function($sym197$CYC_GROUND_TERM);
    utilities_macros.register_api_predefined_function($sym198$CYC_GUID_STRING_P);
    utilities_macros.register_api_predefined_function($sym199$CYC_HTTP_URL_ENCODE);
    utilities_macros.register_api_predefined_function($sym200$CYC_IDENTITY);
    utilities_macros.register_api_predefined_function($sym201$CYC_INDEXICAL_REFERENT);
    utilities_macros.register_api_predefined_function($sym202$CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR);
    utilities_macros.register_api_predefined_function($sym203$CYC_INDIVIDUAL_NECESSARY);
    utilities_macros.register_api_predefined_function($sym204$CYC_INTEGER);
    utilities_macros.register_api_predefined_function($sym205$CYC_INTEGER_RANGE);
    utilities_macros.register_api_predefined_function($sym205$CYC_INTEGER_RANGE);
    utilities_macros.register_api_predefined_function($sym206$CYC_INTEGER_TO_STRING);
    utilities_macros.register_api_predefined_function($sym207$CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE);
    utilities_macros.register_api_predefined_function($sym208$CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE);
    utilities_macros.register_api_predefined_function($sym209$CYC_INVERSE);
    utilities_macros.register_api_predefined_function($sym210$CYC_IP4_ADDRESS);
    utilities_macros.register_api_predefined_function($sym211$CYC_IP4_NETWORK_ADDRESS);
    utilities_macros.register_api_predefined_function($sym212$CYC_LATER_THAN);
    utilities_macros.register_api_predefined_function($sym213$CYC_LESS_THAN);
    utilities_macros.register_api_predefined_function($sym214$CYC_LESS_THAN_OR_EQUAL_TO);
    utilities_macros.register_api_predefined_function($sym215$CYC_LIST_CONCATENATE);
    utilities_macros.register_api_predefined_function($sym216$CYC_LIST_FIRST);
    utilities_macros.register_api_predefined_function($sym217$CYC_LIST_LAST);
    utilities_macros.register_api_predefined_function($sym218$CYC_LIST_LENGTH);
    utilities_macros.register_api_predefined_function($sym219$CYC_LIST_MEMBER_SET);
    utilities_macros.register_api_predefined_function($sym220$CYC_LIST_NTH);
    utilities_macros.register_api_predefined_function($sym221$CYC_LIST_OF_TYPE_NECESSARY);
    utilities_macros.register_api_predefined_function($sym222$CYC_LIST_OF_TYPE_SUFFICIENT);
    utilities_macros.register_api_predefined_function($sym223$CYC_LIST_REST);
    utilities_macros.register_api_predefined_function($sym224$CYC_LIST_REVERSE);
    utilities_macros.register_api_predefined_function($sym225$CYC_LIST_SEARCH);
    utilities_macros.register_api_predefined_function($sym226$CYC_LIST_SUBSEQ);
    utilities_macros.register_api_predefined_function($sym227$CYC_LIST_WITHOUT_REPETITION);
    utilities_macros.register_api_predefined_function($sym228$CYC_LOG);
    utilities_macros.register_api_predefined_function($sym229$CYC_LOGARITHM);
    utilities_macros.register_api_predefined_function($sym230$CYC_MAKE_FORMULA);
    utilities_macros.register_api_predefined_function($sym231$CYC_MAP_FUNCTION_OVER_LIST);
    utilities_macros.register_api_predefined_function($sym232$CYC_MAX_RANGE);
    utilities_macros.register_api_predefined_function($sym233$CYC_MAXIMUM);
    utilities_macros.register_api_predefined_function($sym234$CYC_MIN_RANGE);
    utilities_macros.register_api_predefined_function($sym235$CYC_MINIMUM);
    utilities_macros.register_api_predefined_function($sym236$CYC_MINUS);
    utilities_macros.register_api_predefined_function($sym237$CYC_NEGATIVE_INTEGER);
    utilities_macros.register_api_predefined_function($sym238$CYC_NEGATIVE_NUMBER);
    utilities_macros.register_api_predefined_function($sym239$CYC_NEXT_ITERATED_CYCLIC_INTERVAL);
    utilities_macros.register_api_predefined_function($sym240$CYC_NON_NEGATIVE_INTEGER);
    utilities_macros.register_api_predefined_function($sym241$CYC_NON_NEGATIVE_NUMBER);
    utilities_macros.register_api_predefined_function($sym242$CYC_NON_POSITIVE_INTEGER);
    utilities_macros.register_api_predefined_function($sym243$CYC_NON_POSITIVE_NUMBER);
    utilities_macros.register_api_predefined_function($sym244$CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE);
    utilities_macros.register_api_predefined_function($sym245$CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE);
    utilities_macros.register_api_predefined_function($sym246$CYC_NUMBER_STRING);
    utilities_macros.register_api_predefined_function($sym247$CYC_NUMERAL_STRING);
    utilities_macros.register_api_predefined_function($sym248$CYC_NUMERIC_STRING_NECESSARY);
    utilities_macros.register_api_predefined_function($sym249$CYC_NUMERICALLY_EQUAL);
    utilities_macros.register_api_predefined_function($sym250$CYC_ODD_NUMBER);
    utilities_macros.register_api_predefined_function($sym251$CYC_PERCENT);
    utilities_macros.register_api_predefined_function($sym252$CYC_PLUS);
    utilities_macros.register_api_predefined_function($sym253$CYC_PLUS_ALL);
    utilities_macros.register_api_predefined_function($sym254$CYC_POSITION);
    utilities_macros.register_api_predefined_function($sym255$CYC_POSITIVE_INTEGER);
    utilities_macros.register_api_predefined_function($sym256$CYC_POSITIVE_NUMBER);
    utilities_macros.register_api_predefined_function($sym257$CYC_POST_REMOVE);
    utilities_macros.register_api_predefined_function($sym258$CYC_PRE_REMOVE);
    utilities_macros.register_api_predefined_function($sym259$CYC_PREFIX_SUBSTRING);
    utilities_macros.register_api_predefined_function($sym260$CYC_PRIME_NUMBER_);
    utilities_macros.register_api_predefined_function($sym261$CYC_QUANTITY_CONVERSION);
    utilities_macros.register_api_predefined_function($sym262$CYC_QUANTITY_INTERSECTS);
    utilities_macros.register_api_predefined_function($sym263$CYC_QUANTITY_SUBSUMES);
    utilities_macros.register_api_predefined_function($sym264$CYC_QUOTIENT);
    utilities_macros.register_api_predefined_function($sym265$CYC_RATIONAL_NUMBER);
    utilities_macros.register_api_predefined_function($sym266$CYC_REAL_0_1);
    utilities_macros.register_api_predefined_function($sym267$CYC_REAL_1_INFINITY);
    utilities_macros.register_api_predefined_function($sym268$CYC_REAL_NUMBER);
    utilities_macros.register_api_predefined_function($sym269$CYC_RECAPITALIZE_SMART);
    utilities_macros.register_api_predefined_function($sym270$CYC_RELATION_ARG);
    utilities_macros.register_api_predefined_function($sym271$CYC_RELATION_ARG_SET);
    utilities_macros.register_api_predefined_function($sym272$CYC_RELATION_ARGS_LIST);
    utilities_macros.register_api_predefined_function($sym273$CYC_RELATION_EXPRESSION_ARITY);
    utilities_macros.register_api_predefined_function($sym274$CYC_REPLACE_SUBSTRING);
    utilities_macros.register_api_predefined_function($sym275$CYC_ROUND_CLOSEST);
    utilities_macros.register_api_predefined_function($sym276$CYC_ROUND_DOWN);
    utilities_macros.register_api_predefined_function($sym277$CYC_ROUND_UP);
    utilities_macros.register_api_predefined_function($sym278$CYC_SCIENTIFIC_NUMBER_FROM_STRING);
    utilities_macros.register_api_predefined_function($sym279$CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL);
    utilities_macros.register_api_predefined_function($sym280$CYC_SCIENTIFIC_NUMBER_P);
    utilities_macros.register_api_predefined_function($sym281$CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT);
    utilities_macros.register_api_predefined_function($sym282$CYC_SCIENTIFIC_NUMBER_TO_STRING);
    utilities_macros.register_api_predefined_function($sym283$CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL);
    utilities_macros.register_api_predefined_function($sym284$CYC_SECANT);
    utilities_macros.register_api_predefined_function($sym285$CYC_SET_DIFFERENCE);
    utilities_macros.register_api_predefined_function($sym286$CYC_SET_EXTENT);
    utilities_macros.register_api_predefined_function($sym287$CYC_SET_OF_TYPE_NECESSARY);
    utilities_macros.register_api_predefined_function($sym288$CYC_SET_OF_TYPE_SUFFICIENT);
    utilities_macros.register_api_predefined_function($sym289$CYC_SIGNIFICANT_DIGITS);
    utilities_macros.register_api_predefined_function($sym290$CYC_SINE);
    utilities_macros.register_api_predefined_function($sym291$CYC_SKSI_SOURCE_ACCESSIBLE);
    utilities_macros.register_api_predefined_function($sym292$CYC_SKSI_SOURCE_ACTIVATED);
    utilities_macros.register_api_predefined_function($sym293$CYC_SKSI_SOURCE_QUERYABLE);
    utilities_macros.register_api_predefined_function($sym294$CYC_SKSI_SOURCE_REGISTERED);
    utilities_macros.register_api_predefined_function($sym295$CYC_SQRT);
    utilities_macros.register_api_predefined_function($sym296$CYC_STRING_CONCAT);
    utilities_macros.register_api_predefined_function($sym297$CYC_STRING_TO_INTEGER);
    utilities_macros.register_api_predefined_function($sym298$CYC_STRING_TO_REAL_NUMBER);
    utilities_macros.register_api_predefined_function($sym299$CYC_STRING_TOKENIZE_NEW);
    utilities_macros.register_api_predefined_function($sym300$CYC_STRING_UPCASE);
    utilities_macros.register_api_predefined_function($sym301$CYC_STRINGS_TO_PHRASE);
    utilities_macros.register_api_predefined_function($sym302$CYC_SUBL_ESCAPE);
    utilities_macros.register_api_predefined_function($sym303$CYC_SUBL_EXPRESSION);
    utilities_macros.register_api_predefined_function($sym304$CYC_SUBL_TEMPLATE);
    utilities_macros.register_api_predefined_function($sym305$CYC_SUBLIST_);
    utilities_macros.register_api_predefined_function($sym306$CYC_SUBSTITUTE_FORMULA);
    utilities_macros.register_api_predefined_function($sym307$CYC_SUBSTITUTE_FORMULA_ARG);
    utilities_macros.register_api_predefined_function($sym308$CYC_SUBSTITUTE_FORMULA_ARG_POSITION);
    utilities_macros.register_api_predefined_function($sym309$CYC_SUBSTRING);
    utilities_macros.register_api_predefined_function($sym310$CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE);
    utilities_macros.register_api_predefined_function($sym311$CYC_SUBSTRING_PREDICATE);
    utilities_macros.register_api_predefined_function($sym312$CYC_SUBWORD_PREDICATE);
    utilities_macros.register_api_predefined_function($sym313$CYC_SUFFIX_SUBSTRING);
    utilities_macros.register_api_predefined_function($sym314$CYC_SYSTEM_ATOM);
    utilities_macros.register_api_predefined_function($sym315$CYC_SYSTEM_CHARACTER_P);
    utilities_macros.register_api_predefined_function($sym316$CYC_SYSTEM_INTEGER);
    utilities_macros.register_api_predefined_function($sym317$CYC_SYSTEM_NON_VARIABLE_SYMBOL_P);
    utilities_macros.register_api_predefined_function($sym318$CYC_SYSTEM_REAL_NUMBER_P);
    utilities_macros.register_api_predefined_function($sym319$CYC_SYSTEM_STRING_P);
    utilities_macros.register_api_predefined_function($sym320$CYC_SYSTEM_TERM_P);
    utilities_macros.register_api_predefined_function($sym321$CYC_TANGENT);
    utilities_macros.register_api_predefined_function($sym322$CYC_TIME_ELAPSED);
    utilities_macros.register_api_predefined_function($sym323$CYC_TIME_ELAPSED_DECODE_STRING);
    utilities_macros.register_api_predefined_function($sym324$CYC_TIME_ELAPSED_ENCODE_STRING);
    utilities_macros.register_api_predefined_function($sym325$CYC_TIMES);
    utilities_macros.register_api_predefined_function($sym326$CYC_TRIM_WHITESPACE);
    utilities_macros.register_api_predefined_function($sym327$CYC_TRUE_SUBL);
    utilities_macros.register_api_predefined_function($sym328$CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL);
    utilities_macros.register_api_predefined_function($sym329$CYC_UNICODE_DENOTING_ASCII_STRING_P);
    utilities_macros.register_api_predefined_function($sym330$CYC_ZIP_CODE_FIVE_DIGIT);
    utilities_macros.register_api_predefined_function($sym331$CYC_ZIP_CODE_NINE_DIGIT);
    utilities_macros.register_api_predefined_function($sym332$CYCL_ASSERTED_ASSERTION_);
    utilities_macros.register_api_predefined_function($sym333$CYCL_ASSERTION_);
    utilities_macros.register_api_predefined_function($sym334$CYCL_ATOMIC_ASSERTION_);
    utilities_macros.register_api_predefined_function($sym335$CYCL_ATOMIC_SENTENCE_);
    utilities_macros.register_api_predefined_function($sym336$CYCL_ATOMIC_TERM_P);
    utilities_macros.register_api_predefined_function($sym337$CYCL_CLOSED_ATOMIC_SENTENCE_);
    utilities_macros.register_api_predefined_function($sym338$CYCL_CLOSED_ATOMIC_TERM_P);
    utilities_macros.register_api_predefined_function($sym339$CYCL_CLOSED_DENOTATIONAL_TERM_);
    utilities_macros.register_api_predefined_function($sym340$CYCL_CLOSED_EXPRESSION_);
    utilities_macros.register_api_predefined_function($sym341$CYCL_CLOSED_FORMULA_);
    utilities_macros.register_api_predefined_function($sym342$CYCL_CLOSED_NON_ATOMIC_TERM_);
    utilities_macros.register_api_predefined_function($sym343$CYCL_CLOSED_SENTENCE_);
    utilities_macros.register_api_predefined_function($sym344$CYCL_CONSTANT_P);
    utilities_macros.register_api_predefined_function($sym345$CYCL_DEDUCED_ASSERTION_);
    utilities_macros.register_api_predefined_function($sym346$CYCL_DENOTATIONAL_TERM_P);
    utilities_macros.register_api_predefined_function($sym347$CYCL_EXPRESSION_ASKABLE_);
    utilities_macros.register_api_predefined_function($sym348$CYCL_EXPRESSION_ASSERTIBLE_);
    utilities_macros.register_api_predefined_function($sym349$CYCL_EXPRESSION_);
    utilities_macros.register_api_predefined_function($sym350$CYCL_FORMULA_);
    utilities_macros.register_api_predefined_function($sym351$CYCL_GAF_ASSERTION_);
    utilities_macros.register_api_predefined_function($sym352$CYCL_INDEXED_TERM_);
    utilities_macros.register_api_predefined_function($sym353$CYCL_NL_SEMANTIC_ASSERTION_);
    utilities_macros.register_api_predefined_function($sym354$CYCL_NON_ATOMIC_REIFIED_TERM_);
    utilities_macros.register_api_predefined_function($sym355$CYCL_NON_ATOMIC_TERM_ASKABLE_);
    utilities_macros.register_api_predefined_function($sym356$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_);
    utilities_macros.register_api_predefined_function($sym357$CYCL_NON_ATOMIC_TERM_);
    utilities_macros.register_api_predefined_function($sym358$CYCL_OPEN_DENOTATIONAL_TERM_);
    utilities_macros.register_api_predefined_function($sym359$CYCL_OPEN_EXPRESSION_);
    utilities_macros.register_api_predefined_function($sym360$CYCL_OPEN_FORMULA_);
    utilities_macros.register_api_predefined_function($sym361$CYCL_OPEN_NON_ATOMIC_TERM_);
    utilities_macros.register_api_predefined_function($sym362$CYCL_OPEN_SENTENCE_);
    utilities_macros.register_api_predefined_function($sym363$CYCL_PROPOSITIONAL_SENTENCE_);
    utilities_macros.register_api_predefined_function($sym364$CYCL_REFORMULATOR_RULE_);
    utilities_macros.register_api_predefined_function($sym365$CYCL_REIFIABLE_DENOTATIONAL_TERM_);
    utilities_macros.register_api_predefined_function($sym366$CYCL_REIFIABLE_NON_ATOMIC_TERM_);
    utilities_macros.register_api_predefined_function($sym367$CYCL_REIFIED_DENOTATIONAL_TERM_);
    utilities_macros.register_api_predefined_function($sym368$CYCL_REPRESENTED_ATOMIC_TERM_P);
    utilities_macros.register_api_predefined_function($sym369$CYCL_REPRESENTED_TERM_);
    utilities_macros.register_api_predefined_function($sym370$CYCL_RULE_ASSERTION_);
    utilities_macros.register_api_predefined_function($sym371$CYCL_SENTENCE_ASKABLE_);
    utilities_macros.register_api_predefined_function($sym372$CYCL_SENTENCE_ASSERTIBLE_);
    utilities_macros.register_api_predefined_function($sym373$CYCL_SENTENCE_);
    utilities_macros.register_api_predefined_function($sym374$CYCL_SUBL_SYMBOL_P);
    utilities_macros.register_api_predefined_function($sym375$CYCL_UNBOUND_RELATION_FORMULA_P);
    utilities_macros.register_api_predefined_function($sym376$CYCL_VAR_LIST_);
    utilities_macros.register_api_predefined_function($sym377$CYCL_VARIABLE_P);
    utilities_macros.register_api_predefined_function($sym378$CYCSECURE_SUB_SOFTWARE_OBJECTS_);
    utilities_macros.register_api_predefined_function($sym379$CYCSECURE_VERSION_OF_SOFTWARE_);
    utilities_macros.register_api_predefined_function($sym380$GAF_);
    utilities_macros.register_api_predefined_function($sym381$GEN_TEMPLATE_RECIPE_P);
    utilities_macros.register_api_predefined_function($sym382$GENERATE_NAMES_FOR_TERM);
    utilities_macros.register_api_predefined_function($sym383$GENERATE_PHRASE_DEFN);
    utilities_macros.register_api_predefined_function($sym384$HL_EXTERNAL_ID_STRING_P);
    utilities_macros.register_api_predefined_function($sym385$IBQE_);
    utilities_macros.register_api_predefined_function($sym386$INTEGERP);
    utilities_macros.register_api_predefined_function($sym387$KEYWORDP);
    utilities_macros.register_api_predefined_function($sym388$KWTE_);
    utilities_macros.register_api_predefined_function($sym389$LISTP);
    utilities_macros.register_api_predefined_function($sym390$MONAD_CYCL_MT_);
    utilities_macros.register_api_predefined_function($sym391$NON_NEGATIVE_SCALAR_INTERVAL_);
    utilities_macros.register_api_predefined_function($sym392$POSITIVE_SCALAR_INTERVAL_);
    utilities_macros.register_api_predefined_function($sym393$PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING);
    utilities_macros.register_api_predefined_function($sym394$RTP_SYNTACTIC_CONSTRAINT);
    utilities_macros.register_api_predefined_function($sym395$SCALAR_POINT_VALUE_);
    utilities_macros.register_api_predefined_function($sym396$STRING_W_O_CONTROL_CHARS_);
    utilities_macros.register_api_predefined_function($sym397$STRINGP);
    utilities_macros.register_api_predefined_function($sym398$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P);
    utilities_macros.register_api_predefined_function($sym399$SYMBOLP);
    utilities_macros.register_api_predefined_function($sym400$TEMPORAL_DIMENSION_MT_P);
    utilities_macros.register_api_predefined_function($sym401$TRUE);
    utilities_macros.register_api_predefined_function($sym402$URL_P);
    {
      SubLObject cdolist_list_var = $list403;
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_api_predefined_function(symbol);
      }
    }
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_NULL_OUTPUT_ = makeSymbol("*NULL-OUTPUT*");
  public static final SubLSymbol $sym1$_IT_VERBOSE_ = makeSymbol("*IT-VERBOSE*");
  public static final SubLSymbol $sym2$_PROGRESS_NOTE_ = makeSymbol("*PROGRESS-NOTE*");
  public static final SubLSymbol $sym3$_PROGRESS_SOFAR_ = makeSymbol("*PROGRESS-SOFAR*");
  public static final SubLSymbol $sym4$_PROGRESS_START_TIME_ = makeSymbol("*PROGRESS-START-TIME*");
  public static final SubLSymbol $sym5$_PROGRESS_TOTAL_ = makeSymbol("*PROGRESS-TOTAL*");
  public static final SubLSymbol $sym6$_EVAL_WITH_BINDINGS_ = makeSymbol("*EVAL-WITH-BINDINGS*");
  public static final SubLSymbol $sym7$_ERROR_OUTPUT_ = makeSymbol("*ERROR-OUTPUT*");
  public static final SubLSymbol $sym8$_STANDARD_OUTPUT_ = makeSymbol("*STANDARD-OUTPUT*");
  public static final SubLSymbol $sym9$_CONTINUE_CERROR__ = makeSymbol("*CONTINUE-CERROR?*");
  public static final SubLSymbol $sym10$_SILENT_PROGRESS__ = makeSymbol("*SILENT-PROGRESS?*");
  public static final SubLSymbol $sym11$_IGNORE_BREAKS__ = makeSymbol("*IGNORE-BREAKS?*");
  public static final SubLSymbol $sym12$_IGNORE_WARNS__ = makeSymbol("*IGNORE-WARNS?*");
  public static final SubLSymbol $sym13$_EVAL_IN_API_TRACE_LOG_ = makeSymbol("*EVAL-IN-API-TRACE-LOG*");
  public static final SubLSymbol $sym14$_EVAL_IN_API_TRACED_FNS_ = makeSymbol("*EVAL-IN-API-TRACED-FNS*");
  public static final SubLSymbol $sym15$_EVAL_IN_API_ENV_ = makeSymbol("*EVAL-IN-API-ENV*");
  public static final SubLSymbol $sym16$_API_OUTPUT_PROTOCOL_ = makeSymbol("*API-OUTPUT-PROTOCOL*");
  public static final SubLSymbol $sym17$_API_RESULT_METHOD_ = makeSymbol("*API-RESULT-METHOD*");
  public static final SubLSymbol $sym18$_API_INPUT_PROTOCOL_ = makeSymbol("*API-INPUT-PROTOCOL*");
  public static final SubLSymbol $sym19$_KE_PURPOSE_ = makeSymbol("*KE-PURPOSE*");
  public static final SubLSymbol $sym20$_THE_CYCLIST_ = makeSymbol("*THE-CYCLIST*");
  public static final SubLSymbol $sym21$_USE_LOCAL_QUEUE__ = makeSymbol("*USE-LOCAL-QUEUE?*");
  public static final SubLSymbol $sym22$_RELEVANT_MT_FUNCTION_ = makeSymbol("*RELEVANT-MT-FUNCTION*");
  public static final SubLSymbol $sym23$_CYC_BOOKKEEPING_INFO_ = makeSymbol("*CYC-BOOKKEEPING-INFO*");
  public static final SubLSymbol $sym24$_SUPPRESS_SBHL_RECACHING__ = makeSymbol("*SUPPRESS-SBHL-RECACHING?*");
  public static final SubLSymbol $sym25$_PARAPHRASE_PRECISION_ = makeSymbol("*PARAPHRASE-PRECISION*");
  public static final SubLSymbol $sym26$_EVAL_IN_API_LEVEL_ = makeSymbol("*EVAL-IN-API-LEVEL*");
  public static final SubLSymbol $sym27$_SUSPEND_SBHL_TYPE_CHECKING__ = makeSymbol("*SUSPEND-SBHL-TYPE-CHECKING?*");
  public static final SubLSymbol $sym28$_REQUIRE_CASE_INSENSITIVE_NAME_UNIQUENESS_ = makeSymbol("*REQUIRE-CASE-INSENSITIVE-NAME-UNIQUENESS*");
  public static final SubLSymbol $sym29$_TASK_PROCESSOR_VERBOSITY_ = makeSymbol("*TASK-PROCESSOR-VERBOSITY*");
  public static final SubLSymbol $sym30$BQ_APPEND = makeSymbol("BQ-APPEND");
  public static final SubLSymbol $sym31$BQ_LIST = makeSymbol("BQ-LIST");
  public static final SubLSymbol $sym32$BQ_LIST_ = makeSymbol("BQ-LIST*");
  public static final SubLSymbol $sym33$BQ_NCONC = makeSymbol("BQ-NCONC");
  public static final SubLSymbol $sym34$BQ_VECTOR_APPEND = makeSymbol("BQ-VECTOR-APPEND");
  public static final SubLSymbol $sym35$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym36$API_BQ_LIST = makeSymbol("API-BQ-LIST");
  public static final SubLSymbol $sym37$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLSymbol $sym38$WITH_PRECISE_PARAPHRASE_ON = makeSymbol("WITH-PRECISE-PARAPHRASE-ON");
  public static final SubLSymbol $sym39$WITH_PARAPHRASE_PRECISION = makeSymbol("WITH-PARAPHRASE-PRECISION");
  public static final SubLSymbol $sym40$WITH_BOOKKEEPING_INFO = makeSymbol("WITH-BOOKKEEPING-INFO");
  public static final SubLSymbol $sym41$WITH_MT_FUNCTION = makeSymbol("WITH-MT-FUNCTION");
  public static final SubLSymbol $sym42$WITH_GENL_MTS = makeSymbol("WITH-GENL-MTS");
  public static final SubLSymbol $sym43$WITH_INFERENCE_MT_RELEVANCE = makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
  public static final SubLSymbol $sym44$WITH_ALL_MTS = makeSymbol("WITH-ALL-MTS");
  public static final SubLSymbol $sym45$DO_PREDICATE_RULE_INDEX = makeSymbol("DO-PREDICATE-RULE-INDEX");
  public static final SubLSymbol $sym46$DO_RULE_INDEX = makeSymbol("DO-RULE-INDEX");
  public static final SubLSymbol $sym47$WITHOUT_WFF_SEMANTICS = makeSymbol("WITHOUT-WFF-SEMANTICS");
  public static final SubLSymbol $sym48$CDOLIST_DONE = makeSymbol("CDOLIST-DONE");
  public static final SubLSymbol $sym49$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLSymbol $sym50$PROGRESS_CDOTIMES = makeSymbol("PROGRESS-CDOTIMES");
  public static final SubLSymbol $sym51$DO_KB_SUID_TABLE = makeSymbol("DO-KB-SUID-TABLE");
  public static final SubLSymbol $sym52$DO_ID_INDEX = makeSymbol("DO-ID-INDEX");
  public static final SubLSymbol $sym53$OLD_DO_ID_INDEX = makeSymbol("OLD-DO-ID-INDEX");
  public static final SubLSymbol $sym54$DO_CONSTANTS = makeSymbol("DO-CONSTANTS");
  public static final SubLSymbol $sym55$CWITH_OUTPUT_TO_STRING = makeSymbol("CWITH-OUTPUT-TO-STRING");
  public static final SubLSymbol $sym56$WITH_INPUT_FROM_STRING = makeSymbol("WITH-INPUT-FROM-STRING");
  public static final SubLSymbol $sym57$DO_VECTOR_INDEX = makeSymbol("DO-VECTOR-INDEX");
  public static final SubLSymbol $sym58$IN_MT = makeSymbol("IN-MT");
  public static final SubLSymbol $sym59$WITH_OPEN_STREAM = makeSymbol("WITH-OPEN-STREAM");
  public static final SubLSymbol $sym60$WITH_OPEN_FILE = makeSymbol("WITH-OPEN-FILE");
  public static final SubLSymbol $sym61$WITH_TCP_CONNECTION = makeSymbol("WITH-TCP-CONNECTION");
  public static final SubLObject $list62 = _constant_62_initializer();
  public static final SubLList $list63 = list(new SubLObject[] {makeSymbol("ADD1"), makeSymbol("ADD2"), makeSymbol("API-DYNAMIC-VARIABLE-P"), makeSymbol("API-LEXICAL-VARIABLE-P"), makeSymbol("API-TEST-FN"), makeSymbol("B-VERIFY"), makeSymbol("BOOLEANP"), makeSymbol("CFASL-LOAD"), makeSymbol("COPY-HASH-TABLE"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("CYCL-PATCH-NUMBER"), makeSymbol("CYCL-SYSTEM-NUMBER"), makeSymbol("DEF-INFERENCE-TEST"), makeSymbol("DEFINE-INFERENCE-TEST"), makeSymbol("DIV2"), makeSymbol("EVAL-IN-API-PREDEFINED-FN?"), makeSymbol("EVAL-IN-API-USER-FN?"), makeSymbol("FLOAT-PARSE-INTEGER"), makeSymbol("FLONUM-DIGIT-LIST"), makeSymbol("FROB-CASE"), makeSymbol("GENERATE-STALE-DOCUMENTATION-REPORT"), makeSymbol("GET-TIME"), makeSymbol("GET-TIMEZONE"), makeSymbol("HALT-CYC-IMAGE"), makeSymbol("HERALD-START"), makeSymbol("KB-LOADED"), makeSymbol("LOAD-WORLD"), makeSymbol("LOCK-LOCKER"), makeSymbol("LOCK-NAME"), makeSymbol("MACROP"), makeSymbol("MAX2"), makeSymbol("MEMBER?"), makeSymbol("MIN2"), makeSymbol("MINUS"), makeSymbol("MULT2"), makeSymbol("NAME-CHARACTER"), makeSymbol("NCONC2"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeSymbol("NON-TERMINATING-MACRO-SYNTAXP"), makeSymbol("NOT-A-LIST-ARGUMENT"), makeSymbol("POSSIBLY-GC"), makeSymbol("POTENTIAL-NUMBER-P"), makeSymbol("PRINT-ASSERT"), makeSymbol("PRINT-CREATE"), makeSymbol("PRINT-KILL"), makeSymbol("PROCESS-VALID-P"), makeSymbol("PROCESS-YIELD"), makeSymbol("QUIT"), makeSymbol("RANDOM-ASSERTION"), makeSymbol("RANDOM-CONSTANT"), makeSymbol("RANDOM-NART"), makeSymbol("RELEASE-LOCK"), makeSymbol("ROUND-DIGITS"), makeSymbol("RUN-TEST"), makeSymbol("SEIZE-LOCK"), makeSymbol("SFORMP"), makeSymbol("SINGLE-BYTE-P"), makeSymbol("STRING-DESIGNATORP"), makeSymbol("SUB1"), makeSymbol("SUB2"), makeSymbol("UPDATE-TEST-RESULTS"), makeSymbol("WHITESPACE-1-CHAR-P"), makeSymbol("WHITESPACE-2-CHAR-P")});
  public static final SubLList $list64 = list(new SubLObject[] {makeSymbol("NEW-DICTIONARY"), makeSymbol("DICTIONARY-LENGTH"), makeSymbol("CLEAR-DICTIONARY"), makeSymbol("DICTIONARY-ENTER"), makeSymbol("DICTIONARY-PUSH"), makeSymbol("DICTIONARY-PUSHNEW"), makeSymbol("DICTIONARY-REMOVE-FROM-VALUE"), makeSymbol("DICTIONARY-REMOVE"), makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("DICTIONARY-KEYS"), makeSymbol("DICTIONARY-VALUES")});
  public static final SubLSymbol $sym65$STRING_TO_GUID = makeSymbol("STRING-TO-GUID");
  public static final SubLSymbol $sym66$GUID_TO_STRING = makeSymbol("GUID-TO-STRING");
  public static final SubLSymbol $sym67$REMOVE_DUPLICATES = makeSymbol("REMOVE-DUPLICATES");
  public static final SubLSymbol $sym68$NEW_BOOKKEEPING_INFO = makeSymbol("NEW-BOOKKEEPING-INFO");
  public static final SubLSymbol $sym69$STRING_SUBSTITUTE = makeSymbol("STRING-SUBSTITUTE");
  public static final SubLSymbol $sym70$GENERATE_PHRASE = makeSymbol("GENERATE-PHRASE");
  public static final SubLSymbol $sym71$THE_DATE = makeSymbol("THE-DATE");
  public static final SubLSymbol $sym72$THE_SECOND = makeSymbol("THE-SECOND");
  public static final SubLSymbol $sym73$ISA = makeSymbol("ISA");
  public static final SubLSymbol $sym74$GENLS = makeSymbol("GENLS");
  public static final SubLSymbol $sym75$WHY_COLLECTIONS_INTERSECT_ = makeSymbol("WHY-COLLECTIONS-INTERSECT?");
  public static final SubLSymbol $sym76$ARG1_FORMAT = makeSymbol("ARG1-FORMAT");
  public static final SubLSymbol $sym77$ARG2_FORMAT = makeSymbol("ARG2-FORMAT");
  public static final SubLSymbol $sym78$SPECS = makeSymbol("SPECS");
  public static final SubLSymbol $sym79$COLLECTION_LEAVES = makeSymbol("COLLECTION-LEAVES");
  public static final SubLSymbol $sym80$SIMPLE_INDEXED_TERM_P = makeSymbol("SIMPLE-INDEXED-TERM-P");
  public static final SubLSymbol $sym81$MAX_SPECS = makeSymbol("MAX-SPECS");
  public static final SubLSymbol $sym82$MIN_ISA = makeSymbol("MIN-ISA");
  public static final SubLSymbol $sym83$LOCAL_DISJOINT_WITH = makeSymbol("LOCAL-DISJOINT-WITH");
  public static final SubLSymbol $sym84$DISJOINT_WITH_ = makeSymbol("DISJOINT-WITH?");
  public static final SubLSymbol $sym85$GENL_SIBLINGS = makeSymbol("GENL-SIBLINGS");
  public static final SubLSymbol $sym86$SPEC_SIBLINGS = makeSymbol("SPEC-SIBLINGS");
  public static final SubLSymbol $sym87$ARG1_ISA = makeSymbol("ARG1-ISA");
  public static final SubLSymbol $sym88$ARG2_ISA = makeSymbol("ARG2-ISA");
  public static final SubLSymbol $sym89$ARGN_ISA = makeSymbol("ARGN-ISA");
  public static final SubLSymbol $sym90$ARGN_GENL = makeSymbol("ARGN-GENL");
  public static final SubLSymbol $sym91$ALL_GENLS_IN_ANY_MT = makeSymbol("ALL-GENLS-IN-ANY-MT");
  public static final SubLSymbol $sym92$ALL_ISA_IN_ANY_MT = makeSymbol("ALL-ISA-IN-ANY-MT");
  public static final SubLSymbol $sym93$ALL_FORT_INSTANCES_IN_ALL_MTS = makeSymbol("ALL-FORT-INSTANCES-IN-ALL-MTS");
  public static final SubLSymbol $sym94$ISA_IN_ANY_MT_ = makeSymbol("ISA-IN-ANY-MT?");
  public static final SubLSymbol $sym95$GENL_IN_ANY_MT_ = makeSymbol("GENL-IN-ANY-MT?");
  public static final SubLSymbol $sym96$NEW_CONSTANT_NAME_SPEC_P = makeSymbol("NEW-CONSTANT-NAME-SPEC-P");
  public static final SubLSymbol $sym97$DO_RULE_INDEX_RULES = makeSymbol("DO-RULE-INDEX-RULES");
  public static final SubLSymbol $sym98$BT_LOWER = makeSymbol("BT-LOWER");
  public static final SubLSymbol $sym99$BT_HIGHER = makeSymbol("BT-HIGHER");
  public static final SubLSymbol $sym100$SAMPLE_LEAF_SPECS = makeSymbol("SAMPLE-LEAF-SPECS");
  public static final SubLSymbol $sym101$TACIT_COEXTENSIONAL_ = makeSymbol("TACIT-COEXTENSIONAL?");
  public static final SubLSymbol $sym102$EL_WFF_ = makeSymbol("EL-WFF?");
  public static final SubLSymbol $sym103$EVALUATABLE_PREDICATE_ = makeSymbol("EVALUATABLE-PREDICATE?");
  public static final SubLSymbol $sym104$HIERARCHICAL_COLLECTIONS_ = makeSymbol("HIERARCHICAL-COLLECTIONS?");
  public static final SubLSymbol $sym105$NUM_BEST_GAF_LOOKUP_INDEX = makeSymbol("NUM-BEST-GAF-LOOKUP-INDEX");
  public static final SubLSymbol $sym106$API_QUIT = makeSymbol("API-QUIT");
  public static final SubLSymbol $sym107$NART_P = makeSymbol("NART-P");
  public static final SubLSymbol $sym108$EL_VARIABLE_P = makeSymbol("EL-VARIABLE-P");
  public static final SubLSymbol $sym109$PPH_PRECISION_P = makeSymbol("PPH-PRECISION-P");
  public static final SubLSymbol $sym110$FORT_FOR_STRING = makeSymbol("FORT-FOR-STRING");
  public static final SubLSymbol $sym111$RTP_PARSE_EXP_W_VPP = makeSymbol("RTP-PARSE-EXP-W/VPP");
  public static final SubLSymbol $sym112$GET_UNIVERSAL_TIME = makeSymbol("GET-UNIVERSAL-TIME");
  public static final SubLSymbol $sym113$DECODE_UNIVERSAL_TIME = makeSymbol("DECODE-UNIVERSAL-TIME");
  public static final SubLSymbol $sym114$FIND_NART = makeSymbol("FIND-NART");
  public static final SubLSymbol $sym115$CONSTANT_GUID = makeSymbol("CONSTANT-GUID");
  public static final SubLSymbol $sym116$RKF_PHRASE_READER = makeSymbol("RKF-PHRASE-READER");
  public static final SubLSymbol $sym117$GENERATE_DISAMBIGUATION_PHRASES_AND_TYPES = makeSymbol("GENERATE-DISAMBIGUATION-PHRASES-AND-TYPES");
  public static final SubLSymbol $sym118$LOAD_TRANSCRIPT_FILE = makeSymbol("LOAD-TRANSCRIPT-FILE");
  public static final SubLSymbol $sym119$KB_STATISTICS = makeSymbol("KB-STATISTICS");
  public static final SubLSymbol $sym120$GENL_MT_ = makeSymbol("GENL-MT?");
  public static final SubLSymbol $sym121$ALL_SPEC_MTS = makeSymbol("ALL-SPEC-MTS");
  public static final SubLSymbol $sym122$REMOVAL_ASK = makeSymbol("REMOVAL-ASK");
  public static final SubLSymbol $sym123$DO_NARTS_TABLE = makeSymbol("DO-NARTS-TABLE");
  public static final SubLSymbol $sym124$ID_INDEX_COUNT = makeSymbol("ID-INDEX-COUNT");
  public static final SubLSymbol $sym125$ID_INDEX_OLD_OBJECTS = makeSymbol("ID-INDEX-OLD-OBJECTS");
  public static final SubLSymbol $sym126$ID_INDEX_EMPTY_P = makeSymbol("ID-INDEX-EMPTY-P");
  public static final SubLSymbol $sym127$ID_INDEX_NEW_ID_THRESHOLD = makeSymbol("ID-INDEX-NEW-ID-THRESHOLD");
  public static final SubLSymbol $sym128$ID_INDEX_NEXT_ID = makeSymbol("ID-INDEX-NEXT-ID");
  public static final SubLSymbol $sym129$CYCL_NART_P = makeSymbol("CYCL-NART-P");
  public static final SubLSymbol $sym130$CYCL_NAUT_P = makeSymbol("CYCL-NAUT-P");
  public static final SubLSymbol $sym131$RESOLVE_NEW_CONSTANTS = makeSymbol("RESOLVE-NEW-CONSTANTS");
  public static final SubLSymbol $sym132$CYC_OPENCYC_FEATURE = makeSymbol("CYC-OPENCYC-FEATURE");
  public static final SubLSymbol $sym133$CYC_RESEARCHCYC_FEATURE = makeSymbol("CYC-RESEARCHCYC-FEATURE");
  public static final SubLSymbol $sym134$CANONICALIZE_HLMT = makeSymbol("CANONICALIZE-HLMT");
  public static final SubLSymbol $sym135$NEW_CYC_QUERY = makeSymbol("NEW-CYC-QUERY");
  public static final SubLSymbol $sym136$REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE = makeSymbol("REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE");
  public static final SubLSymbol $sym137$INFERENCE_REMOVAL_MODULE = makeSymbol("INFERENCE-REMOVAL-MODULE");
  public static final SubLSymbol $sym138$UNDECLARE_INFERENCE_REMOVAL_MODULE = makeSymbol("UNDECLARE-INFERENCE-REMOVAL-MODULE");
  public static final SubLList $list139 = list(new SubLObject[] {makeSymbol("UIA-TERM-PHRASE-MEMOIZED"), makeSymbol("BLUE-FETCH-UIA-BLUE-EVENT"), makeSymbol("BBF-RTV-ALL-EDGES-FROM-NODE"), makeSymbol("BBF-MIN-FORWARD-AND-BACKWARD-TRUE"), makeSymbol("BBF-RTV-ALL-EDGES-BETWEEN"), makeSymbol("BBF-ALL-EDGES-SUBSUMED-BY-PREDS"), makeSymbol("BBF-FORWARD-TRUE"), makeSymbol("BBF-BACKWARD-TRUE"), makeSymbol("BBF-MIN-FORWARD-TRUE"), makeSymbol("BBF-MIN-BACKWARD-TRUE"), makeSymbol("BBF-MIN-CEILINGS-FORWARD-TRUE"), makeSymbol("BBF-SCRIPT"), makeSymbol("BFF-EELD-IRRELEVANT-TERMS"), makeSymbol("BFF-CYC-KB-SUBSET-COLLECTIONS"), makeSymbol("BFF-ARBITRARY-UNIONS"), makeSymbol("BFF-MOST-GENERAL-5"), makeSymbol("BFF-MOST-GENERAL-10"), makeSymbol("BFF-MOST-GENERAL-20")});
  public static final SubLList $list140 = list(new SubLObject[] {makeSymbol("GET-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT"), makeSymbol("GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT"), makeSymbol("GET-ORIGINAL-STRING-FOR-QUERY"), makeSymbol("PARSED-QUERY-TEMPLATE-P"), makeSymbol("CLEAR-INVERTED-INDEX"), makeSymbol("INDEX-QUERIES-FROM-NODE"), makeSymbol("ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS"), makeSymbol("SUGGEST-LOADING-MT-FOR-CYCL-QUERY"), makeSymbol("CREATE-MINIMAL-FORMULA-TEMPLATE-WITH-QUERY"), makeSymbol("CREATE-NEW-FORMULA-TEMPLATE-WITH-QUERY"), makeSymbol("GET-VARIABLE-MAPPINGS-FOR-QUERIES-IN-XML"), makeSymbol("GET-VARIABLE-MAPPINGS-FOR-FORMULAS-IN-XML"), makeSymbol("JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS"), makeSymbol("JOIN-QUERIES-ALONG-VARIABLE-MAPPINGS"), makeSymbol("MAIL-TO-USER"), makeSymbol("MAIL-TO-USER-WITH-CONTENT-TYPE"), makeSymbol("APPLICABLE-TEMPLATE-TOPICS-FOR-TERM"), makeSymbol("FOCAL-TERM-TYPE-FOR-TOPIC-TYPE"), makeSymbol("WFF?")});
  public static final SubLList $list141 = list(new SubLObject[] {makeSymbol("PPH-INFERENCE-ANSWER-PROOFS"), makeSymbol("GKE-START-CONTINUABLE-QUERY"), makeSymbol("GKE-CONTINUE-QUERY"), makeSymbol("GKE-STOP-CONTINUABLE-QUERY"), makeSymbol("GKE-GET-INFERENCE-RESULTS"), makeSymbol("GKE-GET-ONE-INFERENCE-RESULT"), makeSymbol("GKE-GET-INFERENCE-STATUS"), makeSymbol("GKE-GET-INFERENCE-SUSPEND-STATUS"), makeSymbol("GKE-INFERENCE-COMPLETE?"), makeSymbol("GKE-RELEASE-INFERENCE-RESOURCES"), makeSymbol("INFERENCE-ANSWER-MINIMAL-ABDUCTION-COUNT")});
  public static final SubLList $list142 = list(makeSymbol("GENERATE-PHRASE-FOR-JAVA"), makeSymbol("GET-TERM-LIST-AS-RENDERINGS"), makeSymbol("GET-EXAMPLE-INSTANCES-AS-RENDERINGS"), makeSymbol("GET-EXAMPLE-INSTANCES-AS-RENDERINGS-NEW"), makeSymbol("GET-INSTANCES-AS-RENDERINGS"), makeSymbol("DENOTS-OF-STRING"));
  public static final SubLList $list143 = list(makeSymbol("REFORMULATE-UNKNOWN-FET-TERM"), makeSymbol("CLEAR-GET-SOURCE-CONCEPTUAL-WORKS-FOR-PROJECT"), makeSymbol("GET-SOURCE-CONCEPTUAL-WORKS-FOR-PROJECT"), makeSymbol("GET-TEMPLATE-TOPIC-IN-XML"), makeSymbol("FIND-TEMPLATE-TOPIC-MATCHES-FOR-CONSTRAINT"), makeSymbol("GET-TEMPLATE-TOPIC-ASSERTIONS-FOR-MATCH-IN-XML"));
  public static final SubLList $list144 = list(makeSymbol("CONSTANT-VIA-STAR-COMPLETION"), makeSymbol("DELETE-IF"), makeSymbol("EL-NEGATE"), makeSymbol("RELATION-P"), makeSymbol("ALL-RELATION-CONSTRAINT-SENTENCES"));
  public static final SubLList $list145 = list(new SubLObject[] {makeSymbol("ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS"), makeSymbol("ANSWER-GUI-QUESTION"), makeSymbol("CLEAR-INVERTED-INDEX"), makeSymbol("FIND-INFERENCE-BY-ID"), makeSymbol("FIND-PROBLEM-STORE-BY-ID"), makeSymbol("FLATTEN"), makeSymbol("GET-ORIGINAL-STRING-FOR-QUERY"), makeSymbol("INDEX-QUERIES-FROM-NODE"), makeSymbol("INDEXED-QUERIES-FROM-STRING"), makeSymbol("INFERENCE-INPUT-EL-QUERY"), makeSymbol("NART-SUBSTITUTE"), makeSymbol("PARSED-QUERY-TEMPLATE-P"), makeSymbol("POSITIVE-INFINITY"), makeSymbol("PREDICATE-P"), makeSymbol("REMOVE-IF-NOT"), makeSymbol("SKSI-SUPPORTED-EXTERNAL-TERM?")});
  public static final SubLList $list146 = list(new SubLObject[] {makeSymbol("ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("ALIST-ENTER"), makeSymbol("ANSWER-GUI-QUESTION"), makeSymbol("AUGMENTED-QUERY-STRING-FOR-CYCL-TERMS"), makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("CREATE-KB-MODIFICATION-EVENT-FILTER"), makeSymbol("CYCLIST-NOTES"), makeSymbol("DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("DELETE-KB-MODIFICATION-EVENT-FILTER"), makeSymbol("EXPLANATION-OF-WHY-NOT-WFF"), makeSymbol("EXPLANATION-OF-WHY-NOT-WFF-ASK"), makeSymbol("FIND-ASSERTION-CYCL"), makeSymbol("FIND-CONSTANT-BY-GUID"), makeSymbol("FIND-INFERENCE-ANSWER-BY-IDS"), makeSymbol("FIND-VALID-FET-TOPIC"), makeSymbol("GED-TO-XML-STRING"), makeSymbol("GET-FOLLOWUPS-FOR-ENTITY"), makeSymbol("GET-PASSAGES-FOR-ENTITY"), makeSymbol("HLMT-MONAD-MT"), makeSymbol("HLMT-TEMPORAL-MT"), makeSymbol("HTML-VAR-VALUE"), makeSymbol("IDENTIFY-ALL-GEQ-ENTITIES"), makeSymbol("MAKE-INDUCED-TOPIC-TYPE-FOR-TERM"), makeSymbol("MYSENTIENT-ARE-VERSIONS-SUPPORTED?"), makeSymbol("PPH-INFERENCE-ANSWER-JUSTIFICATION-FOR-JAVA"), makeSymbol("PPH-PROOF-DEPTH"), makeSymbol("PPH-SUMMARIZE-TERM"), makeSymbol("PROOF-SUID"), makeSymbol("REGISTER-CYCLIFY-PARSER"), makeSymbol("REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("RETURN-DOCUMENT-AS-STRING"), makeSymbol("SENTENCIFY-REMOTELY"), makeSymbol("TEMPLATE-TYPE-FOR-FOCAL-TERM-TYPE"), makeSymbol("TOPICS-RELATED-TO-ENTITY"), makeSymbol("WFF-QUERY?")});
  public static final SubLList $list147 = list(makeSymbol("WITH-PARAPHRASE-MAPPINGS"), makeSymbol("WITHIN-ASSERT"));
  public static final SubLList $list148 = list(new SubLObject[] {makeSymbol("*CB-ASSERTION-HISTORY*"), makeSymbol("*CB-CONSTANT-HISTORY*"), makeSymbol("*CB-NAT-HISTORY*"), makeSymbol("*CB-SENTENCE-HISTORY*"), makeSymbol("*PARAPHRASE-PRECISION*"), makeSymbol("*PPH-ADDRESSEE*"), makeSymbol("*PPH-DEMERIT-CUTOFF*"), makeSymbol("*PPH-DOMAIN-MT*"), makeSymbol("*PPH-LANGUAGE-MT*"), makeSymbol("*PPH-LINK-ARG0?*"), makeSymbol("*PPH-MAXIMIZE-LINKS?*"), makeSymbol("*PPH-REPLACE-BULLETED-LIST-TAGS?*"), makeSymbol("*PPH-SPEAKER*"), makeSymbol("*PPH-SUGGESTED-DEMERIT-CUTOFF*"), makeSymbol("*PPH-TERSE-MT-SCOPE?*"), makeSymbol("*PPH-USE-BULLETED-LISTS?*"), makeSymbol("*PPH-USE-INDEXICAL-DATES?*"), makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*")});
  public static final SubLSymbol $sym149$__ = makeSymbol("<>");
  public static final SubLList $list150 = list(makeSymbol("FI-CREATE-SKOLEM"), makeSymbol("FI-MERGE"), makeSymbol("FI-REASSERT"), makeSymbol("FI-JUSTIFY"), makeSymbol("FI-DENOTATION"), makeSymbol("FI-TIMESTAMP-CONSTANT"), makeSymbol("FI-TIMESTAMP-ASSERTION"));
  public static final SubLList $list151 = list(new SubLObject[] {makeSymbol("BROADCAST-STREAM-STREAMS"), makeSymbol("CLEAR-INPUT"), makeSymbol("CLEAR-OUTPUT"), makeSymbol("CLOSE"), makeSymbol("CONCATENATED-STREAM-STREAMS"), makeSymbol("CONSTRUCT-FILENAME"), makeSymbol("CURRENT-PROCESS"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("DIRECTORY"), makeSymbol("DIRECTORY-P"), makeSymbol("ECHO-STREAM-INPUT-STREAM"), makeSymbol("ECHO-STREAM-OUTPUT-STREAM"), makeSymbol("ENDP"), makeSymbol("FILE-AUTHOR"), makeSymbol("FILE-LENGTH"), makeSymbol("FILE-POSITION"), makeSymbol("FILE-STRING-LENGTH"), makeSymbol("FILE-WRITE-DATE"), makeSymbol("FINISH-OUTPUT"), makeSymbol("GETF"), makeSymbol("GET-FILE-POSITION"), makeSymbol("GET-MACHINE-NAME"), makeSymbol("GET-NETWORK-NAME"), makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("GET-PROCESS-ID"), makeSymbol("GET-STRING-FROM-USER"), makeSymbol("GET-USER-NAME"), makeSymbol("INPUT-STREAM-P"), makeSymbol("INTERACTIVE-STREAM-P"), makeSymbol("INTERN"), makeSymbol("INTERRUPT-PROCESS"), makeSymbol("KEYWORDP"), makeSymbol("KILL-PROCESS"), makeSymbol("LISP-IMPLEMENTATION-TYPE"), makeSymbol("LISP-IMPLEMENTATION-VERSION"), makeSymbol("LISTEN"), makeSymbol("LONG-SITE-NAME"), makeSymbol("MACHINE-INSTANCE"), makeSymbol("MACHINE-TYPE"), makeSymbol("MACHINE-VERSION"), makeSymbol("MAKE-BROADCAST-STREAM"), makeSymbol("MAKE-CONCATENATED-STREAM"), makeSymbol("MAKE-DIRECTORY"), makeSymbol("MAKE-ECHO-STREAM"), makeSymbol("MAKE-KEYWORD"), makeSymbol("MAKE-LIST"), makeSymbol("MAKE-LOCK"), makeSymbol("MAKE-PACKAGE"), makeSymbol("MAKE-PROCESS"), makeSymbol("MAKE-STRING-INPUT-STREAM"), makeSymbol("MAKE-STRING-OUTPUT-STREAM"), makeSymbol("MAKE-SYNONYM-STREAM"), makeSymbol("MAKE-TWO-WAY-STREAM"), makeSymbol("OPEN"), makeSymbol("OPEN-BINARY"), makeSymbol("OPEN-STREAM-P"), makeSymbol("OPEN-TCP-STREAM"), makeSymbol("OPEN-TCP-STREAM-WITH-TIMEOUT"), makeSymbol("OPEN-TEXT"), makeSymbol("OUTPUT-STREAM-P"), makeSymbol("PACKAGE-LOCKED-P"), makeSymbol("PACKAGE-NAME"), makeSymbol("PACKAGE-NICKNAMES"), makeSymbol("PACKAGEP"), makeSymbol("PACKAGE-USED-BY-LIST"), makeSymbol("PACKAGE-USE-LIST"), makeSymbol("PEEK-CHAR"), makeSymbol("PROBE-FILE"), makeSymbol("PROCESS-ACTIVE-P"), makeSymbol("PROCESS-BLOCK"), makeSymbol("PROCESS-NAME"), makeSymbol("PROCESSP"), makeSymbol("PROCESS-STATE"), makeSymbol("PROCESS-UNBLOCK"), makeSymbol("PROCESS-WAIT"), makeSymbol("PROCESS-WAIT-WITH-TIMEOUT"), makeSymbol("PROCESS-WHOSTATE"), makeSymbol("PUT"), makeSymbol("PUTF"), makeSymbol("READ"), makeSymbol("READ-BYTE"), makeSymbol("READ-CHAR"), makeSymbol("READ-CHAR-NO-HANG"), makeSymbol("READ-DELIMITED-LIST"), makeSymbol("READ-IGNORING-ERRORS"), makeSymbol("READ-LINE"), makeSymbol("READ-PRESERVING-WHITESPACE"), makeSymbol("READ-SEQUENCE"), makeSymbol("REMPROP"), makeSymbol("RENAME-FILE"), makeSymbol("SHORT-SITE-NAME"), makeSymbol("SERVER-SUMMARY"), makeSymbol("SHOW-PROCESSES"), makeSymbol("SIMPLE-READER-ERROR"), makeSymbol("SOFTWARE-TYPE"), makeSymbol("SOFTWARE-VERSION"), makeSymbol("STREAMP"), makeSymbol("SYNONYM-STREAM-SYMBOL"), makeSymbol("TWO-WAY-STREAM-INPUT-STREAM"), makeSymbol("TWO-WAY-STREAM-OUTPUT-STREAM"), makeSymbol("UNREAD-CHAR"), makeSymbol("USER-CONFIRM"), makeSymbol("VALID-PROCESS-P"), makeSymbol("WRITE"), makeSymbol("WRITE-BYTE"), makeSymbol("WRITE-CHAR"), makeSymbol("WRITE-LINE"), makeSymbol("WRITE-SEQUENCE"), makeSymbol("WRITE-STRING"), makeSymbol("WRITE-TO-STRING")});
  public static final SubLSymbol $sym152$PHRASE_FOR_MT = makeSymbol("PHRASE-FOR-MT");
  public static final SubLSymbol $sym153$BEST_STRING_OF_NL_PHRASE_DEFN = makeSymbol("BEST-STRING-OF-NL-PHRASE-DEFN");
  public static final SubLSymbol $sym154$CYC_1_BYTE_INTEGER = makeSymbol("CYC-1-BYTE-INTEGER");
  public static final SubLSymbol $sym155$CYC_2_BYTE_INTEGER = makeSymbol("CYC-2-BYTE-INTEGER");
  public static final SubLSymbol $sym156$CYC_4_BYTE_INTEGER = makeSymbol("CYC-4-BYTE-INTEGER");
  public static final SubLSymbol $sym157$CYC_8_BYTE_INTEGER = makeSymbol("CYC-8-BYTE-INTEGER");
  public static final SubLSymbol $sym158$CYC_ABSOLUTE_VALUE = makeSymbol("CYC-ABSOLUTE-VALUE");
  public static final SubLSymbol $sym159$CYC_ADD_ENGLISH_SUFFIX = makeSymbol("CYC-ADD-ENGLISH-SUFFIX");
  public static final SubLSymbol $sym160$CYC_ARC_COSECANT = makeSymbol("CYC-ARC-COSECANT");
  public static final SubLSymbol $sym161$CYC_ARC_COSINE = makeSymbol("CYC-ARC-COSINE");
  public static final SubLSymbol $sym162$CYC_ARC_COTANGENT = makeSymbol("CYC-ARC-COTANGENT");
  public static final SubLSymbol $sym163$CYC_ARC_SECANT = makeSymbol("CYC-ARC-SECANT");
  public static final SubLSymbol $sym164$CYC_ARC_SINE = makeSymbol("CYC-ARC-SINE");
  public static final SubLSymbol $sym165$CYC_ARC_TANGENT = makeSymbol("CYC-ARC-TANGENT");
  public static final SubLSymbol $sym166$CYC_ASCII_STRING_P = makeSymbol("CYC-ASCII-STRING-P");
  public static final SubLSymbol $sym167$CYC_AVERAGE = makeSymbol("CYC-AVERAGE");
  public static final SubLSymbol $sym168$CYC_BIT_DATATYPE = makeSymbol("CYC-BIT-DATATYPE");
  public static final SubLSymbol $sym169$CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR = makeSymbol("CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR");
  public static final SubLSymbol $sym170$CYC_COSECANT = makeSymbol("CYC-COSECANT");
  public static final SubLSymbol $sym171$CYC_COSINE = makeSymbol("CYC-COSINE");
  public static final SubLSymbol $sym172$CYC_COTANGENT = makeSymbol("CYC-COTANGENT");
  public static final SubLSymbol $sym173$CYC_DATE_AFTER = makeSymbol("CYC-DATE-AFTER");
  public static final SubLSymbol $sym174$CYC_DATE_BEFORE = makeSymbol("CYC-DATE-BEFORE");
  public static final SubLSymbol $sym175$CYC_DATE_DECODE_STRING = makeSymbol("CYC-DATE-DECODE-STRING");
  public static final SubLSymbol $sym176$CYC_DATE_ENCODE_STRING = makeSymbol("CYC-DATE-ENCODE-STRING");
  public static final SubLSymbol $sym177$CYC_DATE_FROM_INTEGER = makeSymbol("CYC-DATE-FROM-INTEGER");
  public static final SubLSymbol $sym178$CYC_DATE_FROM_STRING = makeSymbol("CYC-DATE-FROM-STRING");
  public static final SubLSymbol $sym179$CYC_DATE_SUBSUMES = makeSymbol("CYC-DATE-SUBSUMES");
  public static final SubLSymbol $sym180$CYC_DAY_OF_DATE = makeSymbol("CYC-DAY-OF-DATE");
  public static final SubLSymbol $sym181$CYC_DAY_OF_WEEK_AFTER_DATE = makeSymbol("CYC-DAY-OF-WEEK-AFTER-DATE");
  public static final SubLSymbol $sym182$CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE = makeSymbol("CYC-DAY-OF-WEEK-AFTER-DATE-INCLUSIVE");
  public static final SubLSymbol $sym183$CYC_DAY_OF_WEEK_DEFN = makeSymbol("CYC-DAY-OF-WEEK-DEFN");
  public static final SubLSymbol $sym184$CYC_DAY_OF_WEEK_OF_DATE = makeSymbol("CYC-DAY-OF-WEEK-OF-DATE");
  public static final SubLSymbol $sym185$CYC_DAY_OF_WEEK_PRIOR_TO_DATE = makeSymbol("CYC-DAY-OF-WEEK-PRIOR-TO-DATE");
  public static final SubLSymbol $sym186$CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE = makeSymbol("CYC-DAY-OF-WEEK-PRIOR-TO-DATE-INCLUSIVE");
  public static final SubLSymbol $sym187$CYC_DIFFERENCE = makeSymbol("CYC-DIFFERENCE");
  public static final SubLSymbol $sym188$CYC_DIFFERENT = makeSymbol("CYC-DIFFERENT");
  public static final SubLSymbol $sym189$CYC_DIFFERENT_SYMBOLS = makeSymbol("CYC-DIFFERENT-SYMBOLS");
  public static final SubLSymbol $sym190$CYC_EVALUATE_SUBL = makeSymbol("CYC-EVALUATE-SUBL");
  public static final SubLSymbol $sym191$CYC_EVEN_NUMBER = makeSymbol("CYC-EVEN-NUMBER");
  public static final SubLSymbol $sym192$CYC_EXP = makeSymbol("CYC-EXP");
  public static final SubLSymbol $sym193$CYC_EXPONENT = makeSymbol("CYC-EXPONENT");
  public static final SubLSymbol $sym194$CYC_EXTENDED_NUMBER_P = makeSymbol("CYC-EXTENDED-NUMBER-P");
  public static final SubLSymbol $sym195$CYC_GREATER_THAN = makeSymbol("CYC-GREATER-THAN");
  public static final SubLSymbol $sym196$CYC_GREATER_THAN_OR_EQUAL_TO = makeSymbol("CYC-GREATER-THAN-OR-EQUAL-TO");
  public static final SubLSymbol $sym197$CYC_GROUND_TERM = makeSymbol("CYC-GROUND-TERM");
  public static final SubLSymbol $sym198$CYC_GUID_STRING_P = makeSymbol("CYC-GUID-STRING-P");
  public static final SubLSymbol $sym199$CYC_HTTP_URL_ENCODE = makeSymbol("CYC-HTTP-URL-ENCODE");
  public static final SubLSymbol $sym200$CYC_IDENTITY = makeSymbol("CYC-IDENTITY");
  public static final SubLSymbol $sym201$CYC_INDEXICAL_REFERENT = makeSymbol("CYC-INDEXICAL-REFERENT");
  public static final SubLSymbol $sym202$CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR = makeSymbol("CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR");
  public static final SubLSymbol $sym203$CYC_INDIVIDUAL_NECESSARY = makeSymbol("CYC-INDIVIDUAL-NECESSARY");
  public static final SubLSymbol $sym204$CYC_INTEGER = makeSymbol("CYC-INTEGER");
  public static final SubLSymbol $sym205$CYC_INTEGER_RANGE = makeSymbol("CYC-INTEGER-RANGE");
  public static final SubLSymbol $sym206$CYC_INTEGER_TO_STRING = makeSymbol("CYC-INTEGER-TO-STRING");
  public static final SubLSymbol $sym207$CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE");
  public static final SubLSymbol $sym208$CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE");
  public static final SubLSymbol $sym209$CYC_INVERSE = makeSymbol("CYC-INVERSE");
  public static final SubLSymbol $sym210$CYC_IP4_ADDRESS = makeSymbol("CYC-IP4-ADDRESS");
  public static final SubLSymbol $sym211$CYC_IP4_NETWORK_ADDRESS = makeSymbol("CYC-IP4-NETWORK-ADDRESS");
  public static final SubLSymbol $sym212$CYC_LATER_THAN = makeSymbol("CYC-LATER-THAN");
  public static final SubLSymbol $sym213$CYC_LESS_THAN = makeSymbol("CYC-LESS-THAN");
  public static final SubLSymbol $sym214$CYC_LESS_THAN_OR_EQUAL_TO = makeSymbol("CYC-LESS-THAN-OR-EQUAL-TO");
  public static final SubLSymbol $sym215$CYC_LIST_CONCATENATE = makeSymbol("CYC-LIST-CONCATENATE");
  public static final SubLSymbol $sym216$CYC_LIST_FIRST = makeSymbol("CYC-LIST-FIRST");
  public static final SubLSymbol $sym217$CYC_LIST_LAST = makeSymbol("CYC-LIST-LAST");
  public static final SubLSymbol $sym218$CYC_LIST_LENGTH = makeSymbol("CYC-LIST-LENGTH");
  public static final SubLSymbol $sym219$CYC_LIST_MEMBER_SET = makeSymbol("CYC-LIST-MEMBER-SET");
  public static final SubLSymbol $sym220$CYC_LIST_NTH = makeSymbol("CYC-LIST-NTH");
  public static final SubLSymbol $sym221$CYC_LIST_OF_TYPE_NECESSARY = makeSymbol("CYC-LIST-OF-TYPE-NECESSARY");
  public static final SubLSymbol $sym222$CYC_LIST_OF_TYPE_SUFFICIENT = makeSymbol("CYC-LIST-OF-TYPE-SUFFICIENT");
  public static final SubLSymbol $sym223$CYC_LIST_REST = makeSymbol("CYC-LIST-REST");
  public static final SubLSymbol $sym224$CYC_LIST_REVERSE = makeSymbol("CYC-LIST-REVERSE");
  public static final SubLSymbol $sym225$CYC_LIST_SEARCH = makeSymbol("CYC-LIST-SEARCH");
  public static final SubLSymbol $sym226$CYC_LIST_SUBSEQ = makeSymbol("CYC-LIST-SUBSEQ");
  public static final SubLSymbol $sym227$CYC_LIST_WITHOUT_REPETITION = makeSymbol("CYC-LIST-WITHOUT-REPETITION");
  public static final SubLSymbol $sym228$CYC_LOG = makeSymbol("CYC-LOG");
  public static final SubLSymbol $sym229$CYC_LOGARITHM = makeSymbol("CYC-LOGARITHM");
  public static final SubLSymbol $sym230$CYC_MAKE_FORMULA = makeSymbol("CYC-MAKE-FORMULA");
  public static final SubLSymbol $sym231$CYC_MAP_FUNCTION_OVER_LIST = makeSymbol("CYC-MAP-FUNCTION-OVER-LIST");
  public static final SubLSymbol $sym232$CYC_MAX_RANGE = makeSymbol("CYC-MAX-RANGE");
  public static final SubLSymbol $sym233$CYC_MAXIMUM = makeSymbol("CYC-MAXIMUM");
  public static final SubLSymbol $sym234$CYC_MIN_RANGE = makeSymbol("CYC-MIN-RANGE");
  public static final SubLSymbol $sym235$CYC_MINIMUM = makeSymbol("CYC-MINIMUM");
  public static final SubLSymbol $sym236$CYC_MINUS = makeSymbol("CYC-MINUS");
  public static final SubLSymbol $sym237$CYC_NEGATIVE_INTEGER = makeSymbol("CYC-NEGATIVE-INTEGER");
  public static final SubLSymbol $sym238$CYC_NEGATIVE_NUMBER = makeSymbol("CYC-NEGATIVE-NUMBER");
  public static final SubLSymbol $sym239$CYC_NEXT_ITERATED_CYCLIC_INTERVAL = makeSymbol("CYC-NEXT-ITERATED-CYCLIC-INTERVAL");
  public static final SubLSymbol $sym240$CYC_NON_NEGATIVE_INTEGER = makeSymbol("CYC-NON-NEGATIVE-INTEGER");
  public static final SubLSymbol $sym241$CYC_NON_NEGATIVE_NUMBER = makeSymbol("CYC-NON-NEGATIVE-NUMBER");
  public static final SubLSymbol $sym242$CYC_NON_POSITIVE_INTEGER = makeSymbol("CYC-NON-POSITIVE-INTEGER");
  public static final SubLSymbol $sym243$CYC_NON_POSITIVE_NUMBER = makeSymbol("CYC-NON-POSITIVE-NUMBER");
  public static final SubLSymbol $sym244$CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE");
  public static final SubLSymbol $sym245$CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE");
  public static final SubLSymbol $sym246$CYC_NUMBER_STRING = makeSymbol("CYC-NUMBER-STRING");
  public static final SubLSymbol $sym247$CYC_NUMERAL_STRING = makeSymbol("CYC-NUMERAL-STRING");
  public static final SubLSymbol $sym248$CYC_NUMERIC_STRING_NECESSARY = makeSymbol("CYC-NUMERIC-STRING-NECESSARY");
  public static final SubLSymbol $sym249$CYC_NUMERICALLY_EQUAL = makeSymbol("CYC-NUMERICALLY-EQUAL");
  public static final SubLSymbol $sym250$CYC_ODD_NUMBER = makeSymbol("CYC-ODD-NUMBER");
  public static final SubLSymbol $sym251$CYC_PERCENT = makeSymbol("CYC-PERCENT");
  public static final SubLSymbol $sym252$CYC_PLUS = makeSymbol("CYC-PLUS");
  public static final SubLSymbol $sym253$CYC_PLUS_ALL = makeSymbol("CYC-PLUS-ALL");
  public static final SubLSymbol $sym254$CYC_POSITION = makeSymbol("CYC-POSITION");
  public static final SubLSymbol $sym255$CYC_POSITIVE_INTEGER = makeSymbol("CYC-POSITIVE-INTEGER");
  public static final SubLSymbol $sym256$CYC_POSITIVE_NUMBER = makeSymbol("CYC-POSITIVE-NUMBER");
  public static final SubLSymbol $sym257$CYC_POST_REMOVE = makeSymbol("CYC-POST-REMOVE");
  public static final SubLSymbol $sym258$CYC_PRE_REMOVE = makeSymbol("CYC-PRE-REMOVE");
  public static final SubLSymbol $sym259$CYC_PREFIX_SUBSTRING = makeSymbol("CYC-PREFIX-SUBSTRING");
  public static final SubLSymbol $sym260$CYC_PRIME_NUMBER_ = makeSymbol("CYC-PRIME-NUMBER?");
  public static final SubLSymbol $sym261$CYC_QUANTITY_CONVERSION = makeSymbol("CYC-QUANTITY-CONVERSION");
  public static final SubLSymbol $sym262$CYC_QUANTITY_INTERSECTS = makeSymbol("CYC-QUANTITY-INTERSECTS");
  public static final SubLSymbol $sym263$CYC_QUANTITY_SUBSUMES = makeSymbol("CYC-QUANTITY-SUBSUMES");
  public static final SubLSymbol $sym264$CYC_QUOTIENT = makeSymbol("CYC-QUOTIENT");
  public static final SubLSymbol $sym265$CYC_RATIONAL_NUMBER = makeSymbol("CYC-RATIONAL-NUMBER");
  public static final SubLSymbol $sym266$CYC_REAL_0_1 = makeSymbol("CYC-REAL-0-1");
  public static final SubLSymbol $sym267$CYC_REAL_1_INFINITY = makeSymbol("CYC-REAL-1-INFINITY");
  public static final SubLSymbol $sym268$CYC_REAL_NUMBER = makeSymbol("CYC-REAL-NUMBER");
  public static final SubLSymbol $sym269$CYC_RECAPITALIZE_SMART = makeSymbol("CYC-RECAPITALIZE-SMART");
  public static final SubLSymbol $sym270$CYC_RELATION_ARG = makeSymbol("CYC-RELATION-ARG");
  public static final SubLSymbol $sym271$CYC_RELATION_ARG_SET = makeSymbol("CYC-RELATION-ARG-SET");
  public static final SubLSymbol $sym272$CYC_RELATION_ARGS_LIST = makeSymbol("CYC-RELATION-ARGS-LIST");
  public static final SubLSymbol $sym273$CYC_RELATION_EXPRESSION_ARITY = makeSymbol("CYC-RELATION-EXPRESSION-ARITY");
  public static final SubLSymbol $sym274$CYC_REPLACE_SUBSTRING = makeSymbol("CYC-REPLACE-SUBSTRING");
  public static final SubLSymbol $sym275$CYC_ROUND_CLOSEST = makeSymbol("CYC-ROUND-CLOSEST");
  public static final SubLSymbol $sym276$CYC_ROUND_DOWN = makeSymbol("CYC-ROUND-DOWN");
  public static final SubLSymbol $sym277$CYC_ROUND_UP = makeSymbol("CYC-ROUND-UP");
  public static final SubLSymbol $sym278$CYC_SCIENTIFIC_NUMBER_FROM_STRING = makeSymbol("CYC-SCIENTIFIC-NUMBER-FROM-STRING");
  public static final SubLSymbol $sym279$CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL = makeSymbol("CYC-SCIENTIFIC-NUMBER-FROM-SUBL-REAL");
  public static final SubLSymbol $sym280$CYC_SCIENTIFIC_NUMBER_P = makeSymbol("CYC-SCIENTIFIC-NUMBER-P");
  public static final SubLSymbol $sym281$CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT = makeSymbol("CYC-SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT");
  public static final SubLSymbol $sym282$CYC_SCIENTIFIC_NUMBER_TO_STRING = makeSymbol("CYC-SCIENTIFIC-NUMBER-TO-STRING");
  public static final SubLSymbol $sym283$CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL = makeSymbol("CYC-SCIENTIFIC-NUMBER-TO-SUBL-REAL");
  public static final SubLSymbol $sym284$CYC_SECANT = makeSymbol("CYC-SECANT");
  public static final SubLSymbol $sym285$CYC_SET_DIFFERENCE = makeSymbol("CYC-SET-DIFFERENCE");
  public static final SubLSymbol $sym286$CYC_SET_EXTENT = makeSymbol("CYC-SET-EXTENT");
  public static final SubLSymbol $sym287$CYC_SET_OF_TYPE_NECESSARY = makeSymbol("CYC-SET-OF-TYPE-NECESSARY");
  public static final SubLSymbol $sym288$CYC_SET_OF_TYPE_SUFFICIENT = makeSymbol("CYC-SET-OF-TYPE-SUFFICIENT");
  public static final SubLSymbol $sym289$CYC_SIGNIFICANT_DIGITS = makeSymbol("CYC-SIGNIFICANT-DIGITS");
  public static final SubLSymbol $sym290$CYC_SINE = makeSymbol("CYC-SINE");
  public static final SubLSymbol $sym291$CYC_SKSI_SOURCE_ACCESSIBLE = makeSymbol("CYC-SKSI-SOURCE-ACCESSIBLE");
  public static final SubLSymbol $sym292$CYC_SKSI_SOURCE_ACTIVATED = makeSymbol("CYC-SKSI-SOURCE-ACTIVATED");
  public static final SubLSymbol $sym293$CYC_SKSI_SOURCE_QUERYABLE = makeSymbol("CYC-SKSI-SOURCE-QUERYABLE");
  public static final SubLSymbol $sym294$CYC_SKSI_SOURCE_REGISTERED = makeSymbol("CYC-SKSI-SOURCE-REGISTERED");
  public static final SubLSymbol $sym295$CYC_SQRT = makeSymbol("CYC-SQRT");
  public static final SubLSymbol $sym296$CYC_STRING_CONCAT = makeSymbol("CYC-STRING-CONCAT");
  public static final SubLSymbol $sym297$CYC_STRING_TO_INTEGER = makeSymbol("CYC-STRING-TO-INTEGER");
  public static final SubLSymbol $sym298$CYC_STRING_TO_REAL_NUMBER = makeSymbol("CYC-STRING-TO-REAL-NUMBER");
  public static final SubLSymbol $sym299$CYC_STRING_TOKENIZE_NEW = makeSymbol("CYC-STRING-TOKENIZE-NEW");
  public static final SubLSymbol $sym300$CYC_STRING_UPCASE = makeSymbol("CYC-STRING-UPCASE");
  public static final SubLSymbol $sym301$CYC_STRINGS_TO_PHRASE = makeSymbol("CYC-STRINGS-TO-PHRASE");
  public static final SubLSymbol $sym302$CYC_SUBL_ESCAPE = makeSymbol("CYC-SUBL-ESCAPE");
  public static final SubLSymbol $sym303$CYC_SUBL_EXPRESSION = makeSymbol("CYC-SUBL-EXPRESSION");
  public static final SubLSymbol $sym304$CYC_SUBL_TEMPLATE = makeSymbol("CYC-SUBL-TEMPLATE");
  public static final SubLSymbol $sym305$CYC_SUBLIST_ = makeSymbol("CYC-SUBLIST?");
  public static final SubLSymbol $sym306$CYC_SUBSTITUTE_FORMULA = makeSymbol("CYC-SUBSTITUTE-FORMULA");
  public static final SubLSymbol $sym307$CYC_SUBSTITUTE_FORMULA_ARG = makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG");
  public static final SubLSymbol $sym308$CYC_SUBSTITUTE_FORMULA_ARG_POSITION = makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG-POSITION");
  public static final SubLSymbol $sym309$CYC_SUBSTRING = makeSymbol("CYC-SUBSTRING");
  public static final SubLSymbol $sym310$CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE = makeSymbol("CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE");
  public static final SubLSymbol $sym311$CYC_SUBSTRING_PREDICATE = makeSymbol("CYC-SUBSTRING-PREDICATE");
  public static final SubLSymbol $sym312$CYC_SUBWORD_PREDICATE = makeSymbol("CYC-SUBWORD-PREDICATE");
  public static final SubLSymbol $sym313$CYC_SUFFIX_SUBSTRING = makeSymbol("CYC-SUFFIX-SUBSTRING");
  public static final SubLSymbol $sym314$CYC_SYSTEM_ATOM = makeSymbol("CYC-SYSTEM-ATOM");
  public static final SubLSymbol $sym315$CYC_SYSTEM_CHARACTER_P = makeSymbol("CYC-SYSTEM-CHARACTER-P");
  public static final SubLSymbol $sym316$CYC_SYSTEM_INTEGER = makeSymbol("CYC-SYSTEM-INTEGER");
  public static final SubLSymbol $sym317$CYC_SYSTEM_NON_VARIABLE_SYMBOL_P = makeSymbol("CYC-SYSTEM-NON-VARIABLE-SYMBOL-P");
  public static final SubLSymbol $sym318$CYC_SYSTEM_REAL_NUMBER_P = makeSymbol("CYC-SYSTEM-REAL-NUMBER-P");
  public static final SubLSymbol $sym319$CYC_SYSTEM_STRING_P = makeSymbol("CYC-SYSTEM-STRING-P");
  public static final SubLSymbol $sym320$CYC_SYSTEM_TERM_P = makeSymbol("CYC-SYSTEM-TERM-P");
  public static final SubLSymbol $sym321$CYC_TANGENT = makeSymbol("CYC-TANGENT");
  public static final SubLSymbol $sym322$CYC_TIME_ELAPSED = makeSymbol("CYC-TIME-ELAPSED");
  public static final SubLSymbol $sym323$CYC_TIME_ELAPSED_DECODE_STRING = makeSymbol("CYC-TIME-ELAPSED-DECODE-STRING");
  public static final SubLSymbol $sym324$CYC_TIME_ELAPSED_ENCODE_STRING = makeSymbol("CYC-TIME-ELAPSED-ENCODE-STRING");
  public static final SubLSymbol $sym325$CYC_TIMES = makeSymbol("CYC-TIMES");
  public static final SubLSymbol $sym326$CYC_TRIM_WHITESPACE = makeSymbol("CYC-TRIM-WHITESPACE");
  public static final SubLSymbol $sym327$CYC_TRUE_SUBL = makeSymbol("CYC-TRUE-SUBL");
  public static final SubLSymbol $sym328$CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL = makeSymbol("CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL");
  public static final SubLSymbol $sym329$CYC_UNICODE_DENOTING_ASCII_STRING_P = makeSymbol("CYC-UNICODE-DENOTING-ASCII-STRING-P");
  public static final SubLSymbol $sym330$CYC_ZIP_CODE_FIVE_DIGIT = makeSymbol("CYC-ZIP-CODE-FIVE-DIGIT");
  public static final SubLSymbol $sym331$CYC_ZIP_CODE_NINE_DIGIT = makeSymbol("CYC-ZIP-CODE-NINE-DIGIT");
  public static final SubLSymbol $sym332$CYCL_ASSERTED_ASSERTION_ = makeSymbol("CYCL-ASSERTED-ASSERTION?");
  public static final SubLSymbol $sym333$CYCL_ASSERTION_ = makeSymbol("CYCL-ASSERTION?");
  public static final SubLSymbol $sym334$CYCL_ATOMIC_ASSERTION_ = makeSymbol("CYCL-ATOMIC-ASSERTION?");
  public static final SubLSymbol $sym335$CYCL_ATOMIC_SENTENCE_ = makeSymbol("CYCL-ATOMIC-SENTENCE?");
  public static final SubLSymbol $sym336$CYCL_ATOMIC_TERM_P = makeSymbol("CYCL-ATOMIC-TERM-P");
  public static final SubLSymbol $sym337$CYCL_CLOSED_ATOMIC_SENTENCE_ = makeSymbol("CYCL-CLOSED-ATOMIC-SENTENCE?");
  public static final SubLSymbol $sym338$CYCL_CLOSED_ATOMIC_TERM_P = makeSymbol("CYCL-CLOSED-ATOMIC-TERM-P");
  public static final SubLSymbol $sym339$CYCL_CLOSED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-CLOSED-DENOTATIONAL-TERM?");
  public static final SubLSymbol $sym340$CYCL_CLOSED_EXPRESSION_ = makeSymbol("CYCL-CLOSED-EXPRESSION?");
  public static final SubLSymbol $sym341$CYCL_CLOSED_FORMULA_ = makeSymbol("CYCL-CLOSED-FORMULA?");
  public static final SubLSymbol $sym342$CYCL_CLOSED_NON_ATOMIC_TERM_ = makeSymbol("CYCL-CLOSED-NON-ATOMIC-TERM?");
  public static final SubLSymbol $sym343$CYCL_CLOSED_SENTENCE_ = makeSymbol("CYCL-CLOSED-SENTENCE?");
  public static final SubLSymbol $sym344$CYCL_CONSTANT_P = makeSymbol("CYCL-CONSTANT-P");
  public static final SubLSymbol $sym345$CYCL_DEDUCED_ASSERTION_ = makeSymbol("CYCL-DEDUCED-ASSERTION?");
  public static final SubLSymbol $sym346$CYCL_DENOTATIONAL_TERM_P = makeSymbol("CYCL-DENOTATIONAL-TERM-P");
  public static final SubLSymbol $sym347$CYCL_EXPRESSION_ASKABLE_ = makeSymbol("CYCL-EXPRESSION-ASKABLE?");
  public static final SubLSymbol $sym348$CYCL_EXPRESSION_ASSERTIBLE_ = makeSymbol("CYCL-EXPRESSION-ASSERTIBLE?");
  public static final SubLSymbol $sym349$CYCL_EXPRESSION_ = makeSymbol("CYCL-EXPRESSION?");
  public static final SubLSymbol $sym350$CYCL_FORMULA_ = makeSymbol("CYCL-FORMULA?");
  public static final SubLSymbol $sym351$CYCL_GAF_ASSERTION_ = makeSymbol("CYCL-GAF-ASSERTION?");
  public static final SubLSymbol $sym352$CYCL_INDEXED_TERM_ = makeSymbol("CYCL-INDEXED-TERM?");
  public static final SubLSymbol $sym353$CYCL_NL_SEMANTIC_ASSERTION_ = makeSymbol("CYCL-NL-SEMANTIC-ASSERTION?");
  public static final SubLSymbol $sym354$CYCL_NON_ATOMIC_REIFIED_TERM_ = makeSymbol("CYCL-NON-ATOMIC-REIFIED-TERM?");
  public static final SubLSymbol $sym355$CYCL_NON_ATOMIC_TERM_ASKABLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASKABLE?");
  public static final SubLSymbol $sym356$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASSERTIBLE?");
  public static final SubLSymbol $sym357$CYCL_NON_ATOMIC_TERM_ = makeSymbol("CYCL-NON-ATOMIC-TERM?");
  public static final SubLSymbol $sym358$CYCL_OPEN_DENOTATIONAL_TERM_ = makeSymbol("CYCL-OPEN-DENOTATIONAL-TERM?");
  public static final SubLSymbol $sym359$CYCL_OPEN_EXPRESSION_ = makeSymbol("CYCL-OPEN-EXPRESSION?");
  public static final SubLSymbol $sym360$CYCL_OPEN_FORMULA_ = makeSymbol("CYCL-OPEN-FORMULA?");
  public static final SubLSymbol $sym361$CYCL_OPEN_NON_ATOMIC_TERM_ = makeSymbol("CYCL-OPEN-NON-ATOMIC-TERM?");
  public static final SubLSymbol $sym362$CYCL_OPEN_SENTENCE_ = makeSymbol("CYCL-OPEN-SENTENCE?");
  public static final SubLSymbol $sym363$CYCL_PROPOSITIONAL_SENTENCE_ = makeSymbol("CYCL-PROPOSITIONAL-SENTENCE?");
  public static final SubLSymbol $sym364$CYCL_REFORMULATOR_RULE_ = makeSymbol("CYCL-REFORMULATOR-RULE?");
  public static final SubLSymbol $sym365$CYCL_REIFIABLE_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIABLE-DENOTATIONAL-TERM?");
  public static final SubLSymbol $sym366$CYCL_REIFIABLE_NON_ATOMIC_TERM_ = makeSymbol("CYCL-REIFIABLE-NON-ATOMIC-TERM?");
  public static final SubLSymbol $sym367$CYCL_REIFIED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIED-DENOTATIONAL-TERM?");
  public static final SubLSymbol $sym368$CYCL_REPRESENTED_ATOMIC_TERM_P = makeSymbol("CYCL-REPRESENTED-ATOMIC-TERM-P");
  public static final SubLSymbol $sym369$CYCL_REPRESENTED_TERM_ = makeSymbol("CYCL-REPRESENTED-TERM?");
  public static final SubLSymbol $sym370$CYCL_RULE_ASSERTION_ = makeSymbol("CYCL-RULE-ASSERTION?");
  public static final SubLSymbol $sym371$CYCL_SENTENCE_ASKABLE_ = makeSymbol("CYCL-SENTENCE-ASKABLE?");
  public static final SubLSymbol $sym372$CYCL_SENTENCE_ASSERTIBLE_ = makeSymbol("CYCL-SENTENCE-ASSERTIBLE?");
  public static final SubLSymbol $sym373$CYCL_SENTENCE_ = makeSymbol("CYCL-SENTENCE?");
  public static final SubLSymbol $sym374$CYCL_SUBL_SYMBOL_P = makeSymbol("CYCL-SUBL-SYMBOL-P");
  public static final SubLSymbol $sym375$CYCL_UNBOUND_RELATION_FORMULA_P = makeSymbol("CYCL-UNBOUND-RELATION-FORMULA-P");
  public static final SubLSymbol $sym376$CYCL_VAR_LIST_ = makeSymbol("CYCL-VAR-LIST?");
  public static final SubLSymbol $sym377$CYCL_VARIABLE_P = makeSymbol("CYCL-VARIABLE-P");
  public static final SubLSymbol $sym378$CYCSECURE_SUB_SOFTWARE_OBJECTS_ = makeSymbol("CYCSECURE-SUB-SOFTWARE-OBJECTS?");
  public static final SubLSymbol $sym379$CYCSECURE_VERSION_OF_SOFTWARE_ = makeSymbol("CYCSECURE-VERSION-OF-SOFTWARE?");
  public static final SubLSymbol $sym380$GAF_ = makeSymbol("GAF?");
  public static final SubLSymbol $sym381$GEN_TEMPLATE_RECIPE_P = makeSymbol("GEN-TEMPLATE-RECIPE-P");
  public static final SubLSymbol $sym382$GENERATE_NAMES_FOR_TERM = makeSymbol("GENERATE-NAMES-FOR-TERM");
  public static final SubLSymbol $sym383$GENERATE_PHRASE_DEFN = makeSymbol("GENERATE-PHRASE-DEFN");
  public static final SubLSymbol $sym384$HL_EXTERNAL_ID_STRING_P = makeSymbol("HL-EXTERNAL-ID-STRING-P");
  public static final SubLSymbol $sym385$IBQE_ = makeSymbol("IBQE?");
  public static final SubLSymbol $sym386$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym387$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym388$KWTE_ = makeSymbol("KWTE?");
  public static final SubLSymbol $sym389$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym390$MONAD_CYCL_MT_ = makeSymbol("MONAD-CYCL-MT?");
  public static final SubLSymbol $sym391$NON_NEGATIVE_SCALAR_INTERVAL_ = makeSymbol("NON-NEGATIVE-SCALAR-INTERVAL?");
  public static final SubLSymbol $sym392$POSITIVE_SCALAR_INTERVAL_ = makeSymbol("POSITIVE-SCALAR-INTERVAL?");
  public static final SubLSymbol $sym393$PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING = makeSymbol("PRE-REMOVE-DEFINITE-ARTICLE-FROM-STRING");
  public static final SubLSymbol $sym394$RTP_SYNTACTIC_CONSTRAINT = makeSymbol("RTP-SYNTACTIC-CONSTRAINT");
  public static final SubLSymbol $sym395$SCALAR_POINT_VALUE_ = makeSymbol("SCALAR-POINT-VALUE?");
  public static final SubLSymbol $sym396$STRING_W_O_CONTROL_CHARS_ = makeSymbol("STRING-W/O-CONTROL-CHARS?");
  public static final SubLSymbol $sym397$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym398$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");
  public static final SubLSymbol $sym399$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym400$TEMPORAL_DIMENSION_MT_P = makeSymbol("TEMPORAL-DIMENSION-MT-P");
  public static final SubLSymbol $sym401$TRUE = makeSymbol("TRUE");
  public static final SubLSymbol $sym402$URL_P = makeSymbol("URL-P");
  public static final SubLList $list403 = list(makeSymbol("NEW-CYC-QUERY"), makeSymbol("NTH-VALUE"), makeSymbol("INFERENCE-ALL-ANSWERS"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATIONS"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS"), makeSymbol("HL-JUSTIFY"), makeSymbol("HL-JUSTIFY-EXPANDED"));

  //// Internal Constant Initializer Methods

  private static final SubLObject _constant_62_initializer() {
    return list(new SubLObject[] {makeSymbol("*"), makeSymbol("+"), makeSymbol("-"), makeSymbol("/"), makeSymbol("/="), makeSymbol("<"), makeSymbol("<="), makeSymbol("="), makeSymbol(">"), makeSymbol(">"), makeSymbol(">="), makeSymbol("ABS"), makeSymbol("ACONS"), makeSymbol("ACOS"), makeSymbol("ADJOIN"), makeSymbol("ALPHA-CHAR-P"), makeSymbol("ALPHANUMERICP"), makeSymbol("APPEND"), makeSymbol("AREF"), makeSymbol("ASH"), makeSymbol("ASIN"), makeSymbol("ASSOC"), makeSymbol("ASSOC-IF"), makeSymbol("ATAN"), makeSymbol("ATOM"), makeSymbol("BOOLE"), makeSymbol("BOOLEAN"), makeSymbol("BOTH-CASE-P"), makeSymbol("BQ-CONS"), makeSymbol("BQ-VECTOR"), makeSymbol("BUTLAST"), makeSymbol("BYTE"), makeSymbol("CAAR"), makeSymbol("CADR"), makeSymbol("CAR"), makeSymbol("CCONCATENATE"), makeSymbol("CDAR"), makeSymbol("CDDR"), makeSymbol("CDR"), makeSymbol("CEILING"), makeSymbol("CERROR"), makeSymbol("CHAR"), makeSymbol("CHAR-CODE"), makeSymbol("CHAR-DOWNCASE"), makeSymbol("CHAR-EQUAL"), makeSymbol("CHAR-GREATERP"), makeSymbol("CHAR-LESSP"), makeSymbol("CHAR-NOT-EQUAL"), makeSymbol("CHAR-NOT-GREATERP"), makeSymbol("CHAR-NOT-LESSP"), makeSymbol("CHAR-UPCASE"), makeSymbol("CHAR/="), makeSymbol("CHAR<"), makeSymbol("CHAR<="), makeSymbol("CHAR="), makeSymbol("CHAR>"), makeSymbol("CHAR>="), makeSymbol("CHARACTERP"), makeSymbol("CLRHASH"), makeSymbol("CMERGE"), makeSymbol("CODE-CHAR"), makeSymbol("CONS"), makeSymbol("CONSP"), makeSymbol("CONSTANTP"), makeSymbol("CONSTRUCT-FILENAME"), makeSymbol("COPY-ALIST"), makeSymbol("COPY-LIST"), makeSymbol("COPY-SEQ"), makeSymbol("COPY-TREE"), makeSymbol("COS"), makeSymbol("COUNT"), makeSymbol("COUNT-IF"), makeSymbol("CREDUCE"), makeSymbol("CURRENT-PROCESS"), makeSymbol("DATE-RELATIVE-GUID-P"), makeSymbol("DECODE-FLOAT"), makeSymbol("DECODE-UNIVERSAL-TIME"), makeSymbol("DELETE"), makeSymbol("DELETE-DUPLICATES"), makeSymbol("DELETE-IF"), makeSymbol("DIGIT-CHAR"), makeSymbol("DIGIT-CHAR-P"), makeSymbol("DISASSEMBLE-INTEGER-TO-FIXNUMS"), makeSymbol("DPB"), makeSymbol("EIGHTH"), makeSymbol("ELT"), makeSymbol("ENCODE-UNIVERSAL-TIME"), makeSymbol("ENDP"), EQ, EQL, EQUAL, EQUALP, makeSymbol("EVENP"), makeSymbol("EXIT"), makeSymbol("EXP"), makeSymbol("EXPT"), makeSymbol("FALSE"), makeSymbol("FIFTH"), makeSymbol("FILL"), makeSymbol("FIND"), makeSymbol("FIND-IF"), makeSymbol("FIND-PACKAGE"), makeSymbol("FIND-SYMBOL"), makeSymbol("FIRST"), makeSymbol("FIXNUMP"), makeSymbol("FLOAT"), makeSymbol("FLOAT-DIGITS"), makeSymbol("FLOAT-RADIX"), makeSymbol("FLOAT-SIGN"), makeSymbol("FLOATP"), makeSymbol("FLOOR"), makeSymbol("FORCE-OUTPUT"), makeSymbol("FORMAT"), makeSymbol("FOURTH"), makeSymbol("FRESH-LINE"), makeSymbol("FUNCTION-SPEC-P"), makeSymbol("FUNCTIONP"), makeSymbol("GC"), makeSymbol("GC-DYNAMIC"), makeSymbol("GC-EPHEMERAL"), makeSymbol("GC-FULL"), makeSymbol("GENSYM"), makeSymbol("GENTEMP"), makeSymbol("GET"), makeSymbol("GET-DECODED-TIME"), makeSymbol("GET-INTERNAL-REAL-TIME"), makeSymbol("GET-INTERNAL-REAL-TIME"), makeSymbol("GET-INTERNAL-RUN-TIME"), makeSymbol("GET-UNIVERSAL-TIME"), makeSymbol("GET-UNIVERSAL-TIME"), makeSymbol("GETF"), makeSymbol("GETHASH"), makeSymbol("GETHASH-WITHOUT-VALUES"), makeSymbol("GUID-P"), makeSymbol("GUID-STRING-P"), makeSymbol("GUID-TO-STRING"), makeSymbol("GUID/="), makeSymbol("GUID<"), makeSymbol("GUID<="), makeSymbol("GUID="), makeSymbol("GUID>"), makeSymbol("GUID>="), makeSymbol("HASH-TABLE-COUNT"), makeSymbol("HASH-TABLE-P"), makeSymbol("HASH-TABLE-SIZE"), makeSymbol("HASH-TABLE-TEST"), IDENTITY, makeSymbol("IGNORE"), makeSymbol("INFINITY-P"), makeSymbol("INT/"), makeSymbol("INTEGER-DECODE-FLOAT"), makeSymbol("INTEGER-LENGTH"), makeSymbol("INTEGERP"), makeSymbol("INTERN"), makeSymbol("INTERRUPT-PROCESS"), makeSymbol("INTERSECTION"), makeSymbol("ISQRT"), makeSymbol("KEYWORDP"), makeSymbol("KILL-PROCESS"), makeSymbol("LAST"), makeSymbol("LDB"), makeSymbol("LDIFF"), makeSymbol("LENGTH"), makeSymbol("LISP-IMPLEMENTATION-TYPE"), makeSymbol("LISP-IMPLEMENTATION-VERSION"), makeSymbol("LIST"), makeSymbol("LIST*"), makeSymbol("LIST-ALL-PACKAGES"), makeSymbol("LIST-LENGTH"), makeSymbol("LISTP"), makeSymbol("LISTP"), makeSymbol("LOCK-IDLE-P"), makeSymbol("LOCK-P"), makeSymbol("LOG"), makeSymbol("LOGAND"), makeSymbol("LOGANDC1"), makeSymbol("LOGANDC2"), makeSymbol("LOGBITP"), makeSymbol("LOGCOUNT"), makeSymbol("LOGEQV"), makeSymbol("LOGIOR"), makeSymbol("LOGNAND"), makeSymbol("LOGNOR"), makeSymbol("LOGNOT"), makeSymbol("LOGORC1"), makeSymbol("LOGORC2"), makeSymbol("LOGTEST"), makeSymbol("LOGXOR"), makeSymbol("LOWER-CASE-P"), makeSymbol("MAKE-HASH-TABLE"), makeSymbol("MAKE-LOCK"), makeSymbol("MAKE-LOCK"), makeSymbol("MAKE-STRING"), makeSymbol("MAKUNBOUND"), makeSymbol("MAX"), makeSymbol("MEMBER"), makeSymbol("MEMBER-IF"), makeSymbol("MIN"), makeSymbol("MINUSP"), makeSymbol("MISMATCH"), makeSymbol("MOD"), makeSymbol("NBUTLAST"), makeSymbol("NCONC"), makeSymbol("NEW-GUID"), makeSymbol("NINTERSECTION"), makeSymbol("NINTH"), makeSymbol("NOT-A-NUMBER-P"), makeSymbol("NOTE-PERCENT-PROGRESS"), makeSymbol("NOTIFY"), makeSymbol("NRECONC"), makeSymbol("NREVERSE"), makeSymbol("NSET-DIFFERENCE"), makeSymbol("NSET-EXCLUSIVE-OR"), makeSymbol("NSTRING-CAPITALIZE"), makeSymbol("NSTRING-DOWNCASE"), makeSymbol("NSTRING-UPCASE"), makeSymbol("NSUBLIS"), makeSymbol("NSUBST"), makeSymbol("NSUBST-IF"), makeSymbol("NSUBSTITUTE"), makeSymbol("NSUBSTITUTE-IF"), makeSymbol("NTH"), makeSymbol("NTHCDR"), makeSymbol("NULL"), makeSymbol("NUMBERP"), makeSymbol("NUMBERP"), makeSymbol("NUNION"), makeSymbol("ODDP"), makeSymbol("PAIRLIS"), makeSymbol("PEEK-CHAR"), makeSymbol("PLUSP"), makeSymbol("POSITION"), makeSymbol("POSITION-IF"), makeSymbol("PRIN1"), makeSymbol("PRIN1-TO-STRING"), makeSymbol("PRINC"), makeSymbol("PRINC-TO-STRING"), makeSymbol("PRINT"), makeSymbol("PROCESS-ACTIVE-P"), makeSymbol("PROCESS-BLOCK"), makeSymbol("PROCESS-NAME"), makeSymbol("PROCESS-STATE"), makeSymbol("PROCESS-UNBLOCK"), makeSymbol("PROCESS-WAIT"), makeSymbol("PROCESS-WAIT-WITH-TIMEOUT"), makeSymbol("PROCESS-WHOSTATE"), makeSymbol("PROCESSP"), makeSymbol("RANDOM"), makeSymbol("RASSOC"), makeSymbol("RASSOC-IF"), makeSymbol("READ-FROM-STRING"), makeSymbol("READ-FROM-STRING-IGNORING-ERRORS"), makeSymbol("REM"), makeSymbol("REMF"), makeSymbol("REMHASH"), makeSymbol("REMOVE"), makeSymbol("REMOVE-DUPLICATES"), makeSymbol("REMOVE-IF"), makeSymbol("REPLACE"), makeSymbol("REST"), makeSymbol("REVAPPEND"), makeSymbol("REVERSE"), makeSymbol("REVERSE"), makeSymbol("ROOM"), makeSymbol("ROUND"), makeSymbol("RPLACA"), makeSymbol("RPLACD"), makeSymbol("SCALE-FLOAT"), makeSymbol("SEARCH"), makeSymbol("SECOND"), makeSymbol("SEED-RANDOM"), makeSymbol("SEQUENCEP"), makeSymbol("SET-AREF"), makeSymbol("SET-CONSING-STATE"), makeSymbol("SET-DIFFERENCE"), makeSymbol("SET-NTH"), makeSymbol("SEVENTH"), makeSymbol("SHOW-PROCESSES"), makeSymbol("SIN"), makeSymbol("SIXTH"), makeSymbol("QUIT", "SUBLISP"), makeSymbol("SLEEP"), makeSymbol("SORT"), makeSymbol("SQRT"), makeSymbol("STABLE-SORT"), makeSymbol("STRING"), makeSymbol("STRING-CAPITALIZE"), makeSymbol("STRING-DOWNCASE"), makeSymbol("STRING-EQUAL"), makeSymbol("STRING-GREATERP"), makeSymbol("STRING-LEFT-TRIM"), makeSymbol("STRING-LESSP"), makeSymbol("STRING-NOT-EQUAL"), makeSymbol("STRING-NOT-GREATERP"), makeSymbol("STRING-NOT-LESSP"), makeSymbol("STRING-RIGHT-TRIM"), makeSymbol("STRING-TO-GUID"), makeSymbol("STRING-TRIM"), makeSymbol("STRING-UPCASE"), makeSymbol("STRING/="), makeSymbol("STRING<"), makeSymbol("STRING<="), makeSymbol("STRING="), makeSymbol("STRING>"), makeSymbol("STRING>="), makeSymbol("STRINGP"), makeSymbol("SUBLIS"), makeSymbol("SUBSEQ"), makeSymbol("SUBSETP"), makeSymbol("SUBST"), makeSymbol("SUBST-IF"), makeSymbol("SUBSTITUTE"), makeSymbol("SUBSTITUTE-IF"), makeSymbol("SXHASH"), makeSymbol("SYMBOL-FUNCTION"), makeSymbol("SYMBOL-NAME"), makeSymbol("SYMBOLP"), makeSymbol("SYMBOLP"), makeSymbol("TAILP"), makeSymbol("TAN"), makeSymbol("TENTH"), makeSymbol("TERPRI"), makeSymbol("THIRD"), makeSymbol("TREE-EQUAL"), makeSymbol("TRUE"), makeSymbol("TRUNCATE"), makeSymbol("TYPE-OF"), makeSymbol("UNINTERN"), makeSymbol("UNION"), makeSymbol("UPPER-CASE-P"), makeSymbol("VALID-PROCESS-P"), makeSymbol("VALUES"), makeSymbol("VECTOR"), makeSymbol("VECTORP"), makeSymbol("WARN"), makeSymbol("WRITE-IMAGE"), 
    		 makeSymbol("Y-OR-N-P"), makeSymbol("YES-OR-NO-P"), 
    		 makeSymbol("ZEROP"), makeSymbol("PROPERTY-LIST-MEMBER", "SUBLISP"), makeSymbol("CDESTRUCTURING-BIND-ERROR", "SUBLISP"), makeSymbol("DESTRUCTURING-BIND-MUST-CONSP", "SUBLISP"), makeSymbol("DESTRUCTURING-BIND-MUST-LISTP", "SUBLISP")});
  }

  //// Initializers

  public void declareFunctions() {
    declare_eval_in_api_registrations_file();
  }

  public void initializeVariables() {
    init_eval_in_api_registrations_file();
  }

  public void runTopLevelForms() {
    setup_eval_in_api_registrations_file();
  }

}
