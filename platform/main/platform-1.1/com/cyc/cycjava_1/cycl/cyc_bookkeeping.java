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
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;

public  final class cyc_bookkeeping extends SubLTranslatedFile {

  //// Constructor

  private cyc_bookkeeping() {}
  public static final SubLFile me = new cyc_bookkeeping();
  public static final String myName = "com.cyc.cycjava_1.cycl.cyc_bookkeeping";

  //// Definitions

  /** If T, bookkeeping information, if any, is considered.
  Can be set to nil by applications that don't care about bookkeeping. */
  @SubL(source = "cycl/cyc-bookkeeping.lisp", position = 761) 
  public static SubLSymbol $bookkeeping_enabledP$ = null;

  /** Can be dynamically bound to the right bookkeeping information (a plist). */
  @SubL(source = "cycl/cyc-bookkeeping.lisp", position = 993) 
  public static SubLSymbol $cyc_bookkeeping_info$ = null;

  /** Binds *cyc-bookkeeping-info* to BOOKKEEPING-INFO, which must
   be a plist.  The cyc-* functions will use this bookkeeping info
   if it is bound.  Supported bookkeeping properties for the plist include:
   :who      The Cyclist who performed the operation
   :when     The universal date on which the operation was performed
   :purpose  The #$Cyc-BasedProject for which the operation was performed
   :second   The universal second at which the operation was performed */
  @SubL(source = "cycl/cyc-bookkeeping.lisp", position = 1155) 
  public static final SubLObject with_bookkeeping_info(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject bookkeeping_info = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
      bookkeeping_info = current.first();
      current = current.rest();
      {
        SubLObject body = current;
        return listS($sym3$CLET, list(list($sym4$_CYC_BOOKKEEPING_INFO_, bookkeeping_info)), ConsesLow.append(body, NIL));
      }
    }
  }

  /** Public accessor for *cyc-bookkeeping-info* */
  @SubL(source = "cycl/cyc-bookkeeping.lisp", position = 3092) 
  public static final SubLObject cyc_bookkeeping_info() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $cyc_bookkeeping_info$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/cyc-bookkeeping.lisp", position = 3211) 
  public static final SubLObject do_bookkeepingP() {
    return makeBoolean(((NIL != $bookkeeping_enabledP$.getGlobalValue())
           && (NIL != cyc_bookkeeping_info())));
  }

  /** Constructs a plist from any or all of the arguments passed in,
   suitable for passing to @xref with-bookkeeping-info */
  @SubL(source = "cycl/cyc-bookkeeping.lisp", position = 3315) 
  public static final SubLObject new_bookkeeping_info(SubLObject who, SubLObject when, SubLObject why, SubLObject when_sec) {
    if ((who == UNPROVIDED)) {
      who = NIL;
    }
    if ((when == UNPROVIDED)) {
      when = NIL;
    }
    if ((why == UNPROVIDED)) {
      why = NIL;
    }
    if ((when_sec == UNPROVIDED)) {
      when_sec = NIL;
    }
    {
      SubLObject plist = NIL;
      if ((NIL != when_sec)) {
        plist = ConsesLow.nconc(list($kw19$SECOND, when_sec), plist);
      }
      if ((NIL != why)) {
        plist = ConsesLow.nconc(list($kw20$PURPOSE, why), plist);
      }
      if ((NIL != when)) {
        plist = ConsesLow.nconc(list($kw21$WHEN, when), plist);
      }
      if ((NIL != who)) {
        plist = ConsesLow.nconc(list($kw22$WHO, who), plist);
      }
      return plist;
    }
  }

  /** Assumes that equality of WHAT can be tested with #'eql. */
  @SubL(source = "cycl/cyc-bookkeeping.lisp", position = 4262) 
  public static final SubLObject cyc_bookkeeping_info_for(SubLObject what) {
    return conses_high.getf(cyc_bookkeeping_info(), what, UNPROVIDED);
  }

  @SubL(source = "cycl/cyc-bookkeeping.lisp", position = 4415) 
  public static final SubLObject perform_constant_bookkeeping(SubLObject constant) {
    if ((NIL != do_bookkeepingP())) {
      {
        SubLObject who = cyc_bookkeeping_info_for($kw22$WHO);
        SubLObject when = cyc_bookkeeping_info_for($kw21$WHEN);
        SubLObject purpose = cyc_bookkeeping_info_for($kw20$PURPOSE);
        SubLObject when_sec = cyc_bookkeeping_info_for($kw19$SECOND);
        return fi.fi_timestamp_constant_int(who, when, purpose, when_sec);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/cyc-bookkeeping.lisp", position = 4794) 
  public static final SubLObject perform_assertion_bookkeeping(SubLObject assertion) {
    if ((NIL != do_bookkeepingP())) {
      {
        SubLObject who = cyc_bookkeeping_info_for($kw22$WHO);
        SubLObject when = cyc_bookkeeping_info_for($kw21$WHEN);
        SubLObject purpose = cyc_bookkeeping_info_for($kw20$PURPOSE);
        SubLObject when_sec = cyc_bookkeeping_info_for($kw19$SECOND);
        return fi.fi_timestamp_assertion_int(who, when, purpose, when_sec);
      }
    }
    return NIL;
  }

  public static final SubLObject declare_cyc_bookkeeping_file() {
    declareMacro(myName, "with_bookkeeping_info", "WITH-BOOKKEEPING-INFO");
    declareMacro(myName, "with_assertion_bookkeeping_info", "WITH-ASSERTION-BOOKKEEPING-INFO");
    declareMacro(myName, "possibly_with_bookkeeping_info", "POSSIBLY-WITH-BOOKKEEPING-INFO");
    declareMacro(myName, "without_bookkeeping", "WITHOUT-BOOKKEEPING");
    declareFunction(myName, "cyc_bookkeeping_info", "CYC-BOOKKEEPING-INFO", 0, 0, false);
    declareFunction(myName, "do_bookkeepingP", "DO-BOOKKEEPING?", 0, 0, false);
    declareFunction(myName, "new_bookkeeping_info", "NEW-BOOKKEEPING-INFO", 0, 4, false);
    declareFunction(myName, "assertion_bookkeeping_info", "ASSERTION-BOOKKEEPING-INFO", 1, 0, false);
    declareFunction(myName, "cyc_bookkeeping_info_for", "CYC-BOOKKEEPING-INFO-FOR", 1, 0, false);
    declareFunction(myName, "perform_constant_bookkeeping", "PERFORM-CONSTANT-BOOKKEEPING", 1, 0, false);
    declareFunction(myName, "perform_assertion_bookkeeping", "PERFORM-ASSERTION-BOOKKEEPING", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_cyc_bookkeeping_file() {
    $bookkeeping_enabledP$ = deflexical("*BOOKKEEPING-ENABLED?*", maybeDefault( $sym0$_BOOKKEEPING_ENABLED__, $bookkeeping_enabledP$, T));
    $cyc_bookkeeping_info$ = defparameter("*CYC-BOOKKEEPING-INFO*", NIL);
    return NIL;
  }

  public static final SubLObject setup_cyc_bookkeeping_file() {
    // CVS_ID("Id: cyc-bookkeeping.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_BOOKKEEPING_ENABLED__);
    access_macros.register_external_symbol($sym1$WITH_BOOKKEEPING_INFO);
    access_macros.register_external_symbol($sym18$NEW_BOOKKEEPING_INFO);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_BOOKKEEPING_ENABLED__ = makeSymbol("*BOOKKEEPING-ENABLED?*");
  public static final SubLSymbol $sym1$WITH_BOOKKEEPING_INFO = makeSymbol("WITH-BOOKKEEPING-INFO");
  public static final SubLList $list2 = list(makeSymbol("BOOKKEEPING-INFO"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym3$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym4$_CYC_BOOKKEEPING_INFO_ = makeSymbol("*CYC-BOOKKEEPING-INFO*");
  public static final SubLList $list5 = list(makeSymbol("ASSERTION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym6$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");
  public static final SubLSymbol $sym7$_THE_CYCLIST_ = makeSymbol("*THE-CYCLIST*");
  public static final SubLSymbol $sym8$ASSERTED_BY = makeSymbol("ASSERTED-BY");
  public static final SubLSymbol $sym9$_THE_DATE_ = makeSymbol("*THE-DATE*");
  public static final SubLSymbol $sym10$ASSERTED_WHEN = makeSymbol("ASSERTED-WHEN");
  public static final SubLSymbol $sym11$_KE_PURPOSE_ = makeSymbol("*KE-PURPOSE*");
  public static final SubLSymbol $sym12$ASSERTED_WHY = makeSymbol("ASSERTED-WHY");
  public static final SubLSymbol $sym13$_THE_SECOND_ = makeSymbol("*THE-SECOND*");
  public static final SubLSymbol $sym14$ASSERTED_SECOND = makeSymbol("ASSERTED-SECOND");
  public static final SubLList $list15 = list(makeSymbol("NEW-BOOKKEEPING-INFO"), makeSymbol("*THE-CYCLIST*"), makeSymbol("*THE-DATE*"), makeSymbol("*KE-PURPOSE*"), makeSymbol("*THE-SECOND*"));
  public static final SubLSymbol $sym16$PROGN = makeSymbol("PROGN");
  public static final SubLList $list17 = list(list(makeSymbol("*CYC-BOOKKEEPING-INFO*"), NIL));
  public static final SubLSymbol $sym18$NEW_BOOKKEEPING_INFO = makeSymbol("NEW-BOOKKEEPING-INFO");
  public static final SubLSymbol $kw19$SECOND = makeKeyword("SECOND");
  public static final SubLSymbol $kw20$PURPOSE = makeKeyword("PURPOSE");
  public static final SubLSymbol $kw21$WHEN = makeKeyword("WHEN");
  public static final SubLSymbol $kw22$WHO = makeKeyword("WHO");
  public static final SubLSymbol $sym23$ASSERTION_P = makeSymbol("ASSERTION-P");

  //// Initializers

  public void declareFunctions() {
    declare_cyc_bookkeeping_file();
  }

  public void initializeVariables() {
    init_cyc_bookkeeping_file();
  }

  public void runTopLevelForms() {
    setup_cyc_bookkeeping_file();
  }

}
