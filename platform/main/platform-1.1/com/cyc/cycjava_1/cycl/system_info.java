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
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.system_parameters;
//dm import com.cyc.cycjava_1.cycl.system_version;

public  final class system_info extends SubLTranslatedFile {

  //// Constructor

  private system_info() {}
  public static final SubLFile me = new system_info();
  public static final String myName = "com.cyc.cycjava_1.cycl.system_info";

  //// Definitions

  /** The pathname for the cyc home directory (suitable for use with RELATIVE-FILENAME) */
  @SubL(source = "cycl/system-info.lisp", position = 504) 
  public static SubLSymbol $cyc_home_directory$ = null;

  @SubL(source = "cycl/system-info.lisp", position = 876) 
  public static SubLSymbol $available_cyc_features$ = null;

  @SubL(source = "cycl/system-info.lisp", position = 3700) 
  public static final SubLObject cyc_opencyc_feature() {
    return NIL;
  }

  /** Returns the current Cyc revision numbers expressed as a period-delimited string */
  @SubL(source = "cycl/system-info.lisp", position = 4342) 
  public static final SubLObject cyc_revision_string() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return system_version.$cyc_revision_string$.getDynamicValue(thread);
    }
  }

  /** Returns a list of the current Cyc revision numbers */
  @SubL(source = "cycl/system-info.lisp", position = 4621) 
  public static final SubLObject cyc_revision_numbers() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return system_version.$cyc_revision_numbers$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/system-info.lisp", position = 5037) 
  private static SubLSymbol $cycl_start_time$ = null;

  @SubL(source = "cycl/system-info.lisp", position = 5080) 
  public static final SubLObject reset_cycl_start_time(SubLObject universal_time) {
    if ((universal_time == UNPROVIDED)) {
      universal_time = Time.get_universal_time();
    }
    $cycl_start_time$.setGlobalValue(universal_time);
    return $cycl_start_time$.getGlobalValue();
  }

  /** Backpointer for the original SubL initial continuation. */
  @SubL(source = "cycl/system-info.lisp", position = 5585) 
  private static SubLSymbol $subl_initial_continuation$ = null;

  public static final SubLObject declare_system_info_file() {
    declareFunction(myName, "note_translation_feature", "NOTE-TRANSLATION-FEATURE", 1, 0, false);
    declareMacro(myName, "note_translation_features", "NOTE-TRANSLATION-FEATURES");
    declareMacro(myName, "check_for_feature", "CHECK-FOR-FEATURE");
    declareFunction(myName, "cyc_html_feature", "CYC-HTML-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_date_feature", "CYC-DATE-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_quant_feature", "CYC-QUANT-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_pph_feature", "CYC-PPH-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_lexicon_feature", "CYC-LEXICON-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_nl_feature", "CYC-NL-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_hpsg_feature", "CYC-HPSG-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_external_feature", "CYC-EXTERNAL-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_wordnet_feature", "CYC-WORDNET-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_retrieval_feature", "CYC-RETRIEVAL-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_thesaurus_feature", "CYC-THESAURUS-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_maint_feature", "CYC-MAINT-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_secure_feature", "CYC-SECURE-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_hitek_feature", "CYC-HITEK-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_hpkb_feature", "CYC-HPKB-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_qa_feature", "CYC-QA-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_kbi_feature", "CYC-KBI-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_opencyc_feature", "CYC-OPENCYC-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_researchcyc_feature", "CYC-RESEARCHCYC-FEATURE", 0, 0, false);
    declareFunction(myName, "cyc_sksi_feature", "CYC-SKSI-FEATURE", 0, 0, false);
    declareFunction(myName, "matches_execution_context_p", "MATCHES-EXECUTION-CONTEXT-P", 1, 0, false);
    declareFunction(myName, "cycorp_execution_context_p", "CYCORP-EXECUTION-CONTEXT-P", 0, 0, false);
    declareFunction(myName, "cyc_revision_string", "CYC-REVISION-STRING", 0, 0, false);
    declareFunction(myName, "cyc_revision_string_s1p_format", "CYC-REVISION-STRING-S1P-FORMAT", 0, 0, false);
    declareFunction(myName, "cyc_revision_numbers", "CYC-REVISION-NUMBERS", 0, 0, false);
    declareFunction(myName, "reset_cycl_start_time", "RESET-CYCL-START-TIME", 0, 1, false);
    declareFunction(myName, "cycl_start_time", "CYCL-START-TIME", 0, 0, false);
    declareFunction(myName, "cycl_uptime", "CYCL-UPTIME", 0, 0, false);
    declareFunction(myName, "cyc_initial_continuation", "CYC-INITIAL-CONTINUATION", 4, 0, false);
    declareFunction(myName, "cyc_initialization", "CYC-INITIALIZATION", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_system_info_file() {
    $cyc_home_directory$ = deflexical("*CYC-HOME-DIRECTORY*", Filesys.construct_filename(NIL, NIL, NIL, T));
    $available_cyc_features$ = deflexical("*AVAILABLE-CYC-FEATURES*", maybeDefault( $sym0$_AVAILABLE_CYC_FEATURES_, $available_cyc_features$, NIL));
    $cycl_start_time$ = deflexical("*CYCL-START-TIME*", maybeDefault( $sym11$_CYCL_START_TIME_, $cycl_start_time$, NIL));
    $subl_initial_continuation$ = deflexical("*SUBL-INITIAL-CONTINUATION*", maybeDefault( $sym13$_SUBL_INITIAL_CONTINUATION_, $subl_initial_continuation$, NIL));
    return NIL;
  }

  public static final SubLObject setup_system_info_file() {
    // CVS_ID("Id: system-info.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_external_symbol($sym7$CYC_REVISION_STRING);
    access_macros.register_external_symbol($sym8$CYC_REVISION_STRING_S1P_FORMAT);
    access_macros.register_external_symbol($sym10$CYC_REVISION_NUMBERS);
    subl_macro_promotions.declare_defglobal($sym11$_CYCL_START_TIME_);
    access_macros.register_external_symbol($sym12$CYCL_START_TIME);
    subl_macro_promotions.declare_defglobal($sym13$_SUBL_INITIAL_CONTINUATION_);
    $subl_initial_continuation$.setGlobalValue(Eval.get_initial_continuation());
    Eval.set_initial_continuation($sym14$CYC_INITIAL_CONTINUATION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_AVAILABLE_CYC_FEATURES_ = makeSymbol("*AVAILABLE-CYC-FEATURES*");
  public static final SubLSymbol $sym1$STRING_ = makeSymbol("STRING<");
  public static final SubLSymbol $sym2$SYMBOL_NAME = makeSymbol("SYMBOL-NAME");
  public static final SubLSymbol $sym3$NOTE_TRANSLATION_FEATURE = makeSymbol("NOTE-TRANSLATION-FEATURE");
  public static final SubLSymbol $sym4$PROGN = makeSymbol("PROGN");
  public static final SubLList $list5 = list(makeSymbol("FEATURE"));
  public static final SubLSymbol $kw6$CYCORP = makeKeyword("CYCORP");
  public static final SubLSymbol $sym7$CYC_REVISION_STRING = makeSymbol("CYC-REVISION-STRING");
  public static final SubLSymbol $sym8$CYC_REVISION_STRING_S1P_FORMAT = makeSymbol("CYC-REVISION-STRING-S1P-FORMAT");
  public static final SubLString $str9$s = makeString("s");
  public static final SubLSymbol $sym10$CYC_REVISION_NUMBERS = makeSymbol("CYC-REVISION-NUMBERS");
  public static final SubLSymbol $sym11$_CYCL_START_TIME_ = makeSymbol("*CYCL-START-TIME*");
  public static final SubLSymbol $sym12$CYCL_START_TIME = makeSymbol("CYCL-START-TIME");
  public static final SubLSymbol $sym13$_SUBL_INITIAL_CONTINUATION_ = makeSymbol("*SUBL-INITIAL-CONTINUATION*");
  public static final SubLSymbol $sym14$CYC_INITIAL_CONTINUATION = makeSymbol("CYC-INITIAL-CONTINUATION");
  public static final SubLString $str15$CYC = makeString("CYC");
  public static final SubLString $str16$Process_ID___D__ = makeString("Process ID: ~D~%");
  public static final SubLString $str17$System_____unknown_______A______K = makeString("System ~:[<unknown>~;~:*~A~]~@[ KB ~D~].~%");

  //// Initializers

  public void declareFunctions() {
    declare_system_info_file();
  }

  public void initializeVariables() {
    init_system_info_file();
  }

  public void runTopLevelForms() {
    setup_system_info_file();
  }

}
