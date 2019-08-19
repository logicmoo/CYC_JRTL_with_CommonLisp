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
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class kb_access_metering extends SubLTranslatedFile {

  //// Constructor

  private kb_access_metering() {}
  public static final SubLFile me = new kb_access_metering();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_access_metering";

  //// Definitions

  /** A control variable that gates whether KB access metering is enabled. */
  @SubL(source = "cycl/kb-access-metering.lisp", position = 1049) 
  public static SubLSymbol $kb_access_metering_enabledP$ = null;

  @SubL(source = "cycl/kb-access-metering.lisp", position = 1184) 
  public static SubLSymbol $kb_access_metering_domains$ = null;

  @SubL(source = "cycl/kb-access-metering.lisp", position = 1287) 
  public static SubLSymbol $kb_access_metering_table$ = null;

  @SubL(source = "cycl/kb-access-metering.lisp", position = 3776) 
  public static final SubLObject possibly_note_kb_access_assertion(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $kb_access_metering_enabledP$.getGlobalValue())) {
        if ((NIL != list_utilities.member_eqP($kw22$ASSERTION, $kb_access_metering_domains$.getDynamicValue(thread)))) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7966");
        }
      }
      return NIL;
    }
  }

  public static final SubLObject declare_kb_access_metering_file() {
    //declareMacro("with_kb_access_metering", "WITH-KB-ACCESS-METERING");
    //declareFunction("eval_with_kb_access_metering", "EVAL-WITH-KB-ACCESS-METERING", 1, 2, false);
    //declareFunction("new_kb_access_metering_table", "NEW-KB-ACCESS-METERING-TABLE", 2, 0, false);
    //declareFunction("postprocess_kb_access_metering_table", "POSTPROCESS-KB-ACCESS-METERING-TABLE", 3, 0, false);
    //declareFunction("possibly_note_kb_access_constant", "POSSIBLY-NOTE-KB-ACCESS-CONSTANT", 1, 0, false);
    //declareFunction("possibly_note_kb_access_nart", "POSSIBLY-NOTE-KB-ACCESS-NART", 1, 0, false);
    declareFunction("possibly_note_kb_access_assertion", "POSSIBLY-NOTE-KB-ACCESS-ASSERTION", 1, 0, false);
    //declareFunction("note_kb_access_assertion", "NOTE-KB-ACCESS-ASSERTION", 1, 0, false);
    //declareMacro("possibly_note_kb_access_sbhl_link", "POSSIBLY-NOTE-KB-ACCESS-SBHL-LINK");
    //declareFunction("note_kb_access_sbhlP", "NOTE-KB-ACCESS-SBHL?", 0, 0, false);
    //declareFunction("kb_access_metering_asserted_assertions", "KB-ACCESS-METERING-ASSERTED-ASSERTIONS", 1, 0, false);
    //declareFunction("mean_asserted_assertion_dates", "MEAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
    //declareFunction("median_asserted_assertion_dates", "MEDIAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
    //declareFunction("weighted_mean_asserted_assertion_dates", "WEIGHTED-MEAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
    //declareFunction("weighted_median_asserted_assertion_dates", "WEIGHTED-MEDIAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
    //declareFunction("percent_before_date", "PERCENT-BEFORE-DATE", 2, 0, false);
    //declareFunction("weighted_percent_before_date", "WEIGHTED-PERCENT-BEFORE-DATE", 2, 0, false);
    //declareFunction("print_asserted_assertions_by_date", "PRINT-ASSERTED-ASSERTIONS-BY-DATE", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_kb_access_metering_file() {
    $kb_access_metering_enabledP$ = deflexical("*KB-ACCESS-METERING-ENABLED?*", maybeDefault( $sym0$_KB_ACCESS_METERING_ENABLED__, $kb_access_metering_enabledP$, NIL));
    $kb_access_metering_domains$ = defparameter("*KB-ACCESS-METERING-DOMAINS*", NIL);
    $kb_access_metering_table$ = defparameter("*KB-ACCESS-METERING-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_kb_access_metering_file() {
        subl_macro_promotions.declare_defglobal($sym0$_KB_ACCESS_METERING_ENABLED__);
    access_macros.register_macro_helper($sym11$NEW_KB_ACCESS_METERING_TABLE, $sym19$WITH_KB_ACCESS_METERING);
    access_macros.register_macro_helper($sym17$POSTPROCESS_KB_ACCESS_METERING_TABLE, $sym19$WITH_KB_ACCESS_METERING);
    access_macros.register_macro_helper($sym27$NOTE_KB_ACCESS_SBHL_, $sym28$POSSIBLY_NOTE_KB_ACCESS_SBHL_LINK);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_KB_ACCESS_METERING_ENABLED__ = makeSymbol("*KB-ACCESS-METERING-ENABLED?*");
  public static final SubLList $list1 = list(list(makeSymbol("RESULT-VAR"), makeSymbol("&KEY"), list(makeSymbol("DOMAINS"), list(makeSymbol("QUOTE"), list(makeSymbol("QUOTE"), list(makeKeyword("ASSERTION"))))), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list2 = list(makeKeyword("DOMAINS"), makeKeyword("OPTIONS"));
  public static final SubLSymbol $kw3$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw4$DOMAINS = makeKeyword("DOMAINS");
  public static final SubLList $list5 = list(makeSymbol("QUOTE"), list(makeKeyword("ASSERTION")));
  public static final SubLSymbol $kw6$OPTIONS = makeKeyword("OPTIONS");
  public static final SubLSymbol $sym7$DOMAINS_VAR = makeUninternedSymbol("DOMAINS-VAR");
  public static final SubLSymbol $sym8$OPTIONS_VAR = makeUninternedSymbol("OPTIONS-VAR");
  public static final SubLSymbol $sym9$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");
  public static final SubLSymbol $sym10$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym11$NEW_KB_ACCESS_METERING_TABLE = makeSymbol("NEW-KB-ACCESS-METERING-TABLE");
  public static final SubLSymbol $sym12$_KB_ACCESS_METERING_DOMAINS_ = makeSymbol("*KB-ACCESS-METERING-DOMAINS*");
  public static final SubLSymbol $sym13$_KB_ACCESS_METERING_TABLE_ = makeSymbol("*KB-ACCESS-METERING-TABLE*");
  public static final SubLSymbol $sym14$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym15$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym16$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym17$POSTPROCESS_KB_ACCESS_METERING_TABLE = makeSymbol("POSTPROCESS-KB-ACCESS-METERING-TABLE");
  public static final SubLList $list18 = list(makeKeyword("ASSERTION"));
  public static final SubLSymbol $sym19$WITH_KB_ACCESS_METERING = makeSymbol("WITH-KB-ACCESS-METERING");
  public static final SubLSymbol $kw20$CONSTANT = makeKeyword("CONSTANT");
  public static final SubLSymbol $kw21$NART = makeKeyword("NART");
  public static final SubLSymbol $kw22$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLList $list23 = list(makeSymbol("NODE"), makeSymbol("LINK-NODE"));
  public static final SubLSymbol $sym24$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list25 = list(makeSymbol("CAND"), makeSymbol("*KB-ACCESS-METERING-ENABLED?*"), list(makeSymbol("NOTE-KB-ACCESS-SBHL?")));
  public static final SubLSymbol $sym26$NOTE_KB_ACCESS_SBHL_LINK = makeSymbol("NOTE-KB-ACCESS-SBHL-LINK");
  public static final SubLSymbol $sym27$NOTE_KB_ACCESS_SBHL_ = makeSymbol("NOTE-KB-ACCESS-SBHL?");
  public static final SubLSymbol $sym28$POSSIBLY_NOTE_KB_ACCESS_SBHL_LINK = makeSymbol("POSSIBLY-NOTE-KB-ACCESS-SBHL-LINK");
  public static final SubLSymbol $kw29$SBHL = makeKeyword("SBHL");
  public static final SubLSymbol $sym30$ASSERTED_WHEN = makeSymbol("ASSERTED-WHEN");
  public static final SubLSymbol $sym31$UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE = makeSymbol("UNIVERSAL-TIME-FOR-START-OF-UNIVERSAL-DATE");
  public static final SubLSymbol $sym32$_ = makeSymbol("<");
  public static final SubLSymbol $sym33$__ = makeSymbol("<=");
  public static final SubLSymbol $sym34$SECOND = makeSymbol("SECOND");
  public static final SubLList $list35 = list(makeSymbol("ASSERTION"), makeSymbol("DATE"), makeSymbol("COUNT"));
  public static final SubLString $str36$______A = makeString("~%;; ~A");

  //// Initializers

  public void declareFunctions() {
    declare_kb_access_metering_file();
  }

  public void initializeVariables() {
    init_kb_access_metering_file();
  }

  public void runTopLevelForms() {
    setup_kb_access_metering_file();
  }

}
