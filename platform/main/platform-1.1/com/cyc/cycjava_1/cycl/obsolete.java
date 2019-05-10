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

package  com.cyc.cycjava_1.cycl;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.czer_utilities;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.kb_accessors;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.nart_handles;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.system_info;
import com.cyc.cycjava_1.cycl.term;

public  final class obsolete extends SubLTranslatedFile {

  //// Constructor

  private obsolete() {}
  public static final SubLFile me = new obsolete();
  public static final String myName = "com.cyc.cycjava_1.cycl.obsolete";

  //// Definitions

  /** obsolete -- use CYC-REVISION-NUMBERS */
  @SubL(source = "cycl/obsolete.lisp", position = 1380) 
  public static final SubLObject cycl_system_number() {
    {
      SubLObject number = system_info.cyc_revision_numbers().first();
      return (number.isInteger() ? ((SubLObject) number) : ZERO_INTEGER);
    }
  }

  /** obsolete -- use CYC-REVISION-NUMBERS */
  @SubL(source = "cycl/obsolete.lisp", position = 1616) 
  public static final SubLObject cycl_patch_number() {
    {
      SubLObject number = conses_high.second(system_info.cyc_revision_numbers());
      return (number.isInteger() ? ((SubLObject) number) : ZERO_INTEGER);
    }
  }

  @SubL(source = "cycl/obsolete.lisp", position = 2643) 
  public static final SubLObject reifiable_natP(SubLObject v_term, SubLObject varP, SubLObject mt) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym20$CYC_VAR_);
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return czer_utilities.reifiable_nautP(v_term, varP, mt);
  }

  @SubL(source = "cycl/obsolete.lisp", position = 3461) 
  public static final SubLObject cnat_p(SubLObject object, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym20$CYC_VAR_);
    }
    return term.closed_nautP(object, varP);
  }

  public static final SubLObject declare_obsolete_file() {
    declareFunction(myName, "nat_p", "NAT-P", 1, 0, false);
    declareFunction(myName, "find_nat", "FIND-NAT", 1, 0, false);
    declareFunction(myName, "cycl_system_number", "CYCL-SYSTEM-NUMBER", 0, 0, false);
    declareFunction(myName, "cycl_patch_number", "CYCL-PATCH-NUMBER", 0, 0, false);
    declareFunction(myName, "el_template_argP", "EL-TEMPLATE-ARG?", 2, 1, false);
    declareFunction(myName, "natP", "NAT?", 1, 1, false);
    declareFunction(myName, "relationshipP", "RELATIONSHIP?", 1, 0, false);
    declareFunction(myName, "reified_natP", "REIFIED-NAT?", 1, 0, false);
    declareFunction(myName, "reifiable_natP", "REIFIABLE-NAT?", 1, 2, false);
    declareFunction(myName, "kb_natP", "KB-NAT?", 1, 1, false);
    declareFunction(myName, "naut_in_mtP", "NAUT-IN-MT?", 1, 2, false);
    declareFunction(myName, "gnatP", "GNAT?", 1, 1, false);
    declareFunction(myName, "gnat_p", "GNAT-P", 1, 0, false);
    declareFunction(myName, "find_gnat", "FIND-GNAT", 1, 0, false);
    declareFunction(myName, "cnat_p", "CNAT-P", 1, 1, false);
    declareFunction(myName, "closed_nat_p", "CLOSED-NAT-P", 1, 1, false);
    declareFunction(myName, "reify_arg_when_cnat", "REIFY-ARG-WHEN-CNAT", 2, 0, false);
    declareFunction(myName, "reify_when_cnat", "REIFY-WHEN-CNAT", 1, 0, false);
    declareFunction(myName, "fortify", "FORTIFY", 1, 0, false);
    declareFunction(myName, "find_when_cnat", "FIND-WHEN-CNAT", 1, 0, false);
    declareFunction(myName, "find_cnat", "FIND-CNAT", 1, 0, false);
    declareFunction(myName, "open_nat_p", "OPEN-NAT-P", 1, 1, false);
    declareFunction(myName, "fo_natP", "FO-NAT?", 1, 0, false);
    declareFunction(myName, "nat_not_gnat", "NAT-NOT-GNAT", 1, 1, false);
    declareFunction(myName, "formula_free_variables", "FORMULA-FREE-VARIABLES", 1, 3, false);
    declareFunction(myName, "formula_variables", "FORMULA-VARIABLES", 1, 2, false);
    declareFunction(myName, "complete_collection_extent", "COMPLETE-COLLECTION-EXTENT", 1, 1, false);
    declareFunction(myName, "complete_extent_known", "COMPLETE-EXTENT-KNOWN", 1, 1, false);
    declareFunction(myName, "booleanP", "BOOLEAN?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_obsolete_file() {
    return NIL;
  }

  public static final SubLObject setup_obsolete_file() {
    // CVS_ID("Id: obsolete.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.define_obsolete_register($sym0$NAT_P, $list1);
    access_macros.define_obsolete_register($sym3$FIND_NAT, $list4);
    access_macros.define_obsolete_register($sym6$CYCL_SYSTEM_NUMBER, $list7);
    access_macros.define_obsolete_register($sym8$CYCL_PATCH_NUMBER, $list7);
    access_macros.define_obsolete_register($sym9$EL_TEMPLATE_ARG_, $list10);
    access_macros.define_obsolete_register($sym11$NAT_, $list12);
    access_macros.define_obsolete_register($sym14$RELATIONSHIP_, $list15);
    access_macros.define_obsolete_register($sym16$REIFIED_NAT_, $list17);
    access_macros.define_obsolete_register($sym18$REIFIABLE_NAT_, $list19);
    access_macros.define_obsolete_register($sym21$KB_NAT_, $list22);
    access_macros.define_obsolete_register($sym24$NAUT_IN_MT_, NIL);
    access_macros.define_obsolete_register($sym26$GNAT_, $list27);
    access_macros.define_obsolete_register($sym28$GNAT_P, $list29);
    access_macros.define_obsolete_register($sym30$FIND_GNAT, $list31);
    access_macros.define_obsolete_register($sym32$CNAT_P, $list33);
    access_macros.define_obsolete_register($sym34$CLOSED_NAT_P, $list33);
    access_macros.define_obsolete_register($sym35$REIFY_ARG_WHEN_CNAT, $list36);
    access_macros.define_obsolete_register($sym37$REIFY_WHEN_CNAT, $list38);
    access_macros.define_obsolete_register($sym39$FORTIFY, $list38);
    access_macros.define_obsolete_register($sym40$FIND_WHEN_CNAT, $list41);
    access_macros.define_obsolete_register($sym42$FIND_CNAT, $list43);
    access_macros.define_obsolete_register($sym44$OPEN_NAT_P, $list45);
    access_macros.define_obsolete_register($sym46$FO_NAT_, $list47);
    access_macros.define_obsolete_register($sym48$NAT_NOT_GNAT, $list49);
    access_macros.define_obsolete_register($sym50$FORMULA_FREE_VARIABLES, $list51);
    access_macros.define_obsolete_register($sym52$FORMULA_VARIABLES, $list53);
    access_macros.define_obsolete_register($sym54$COMPLETE_COLLECTION_EXTENT, $list55);
    access_macros.define_obsolete_register($sym56$COMPLETE_EXTENT_KNOWN, $list57);
    access_macros.define_obsolete_register($sym58$BOOLEAN_, $list59);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$NAT_P = makeSymbol("NAT-P");
  public static final SubLList $list1 = list(makeSymbol("NART-P"), makeSymbol("CYCL-NAT-P"));
  public static final SubLString $str2$NAT_P_is_obsolete___use_NART_P_or = makeString("NAT-P is obsolete ; use NART-P or CYCL-NAT-P");
  public static final SubLSymbol $sym3$FIND_NAT = makeSymbol("FIND-NAT");
  public static final SubLList $list4 = list(makeSymbol("NART-P"));
  public static final SubLString $str5$FIND_NAT_is_obsolete___use_FIND_N = makeString("FIND-NAT is obsolete ; use FIND-NART");
  public static final SubLSymbol $sym6$CYCL_SYSTEM_NUMBER = makeSymbol("CYCL-SYSTEM-NUMBER");
  public static final SubLList $list7 = list(makeSymbol("CYC-REVISION-NUMBERS"));
  public static final SubLSymbol $sym8$CYCL_PATCH_NUMBER = makeSymbol("CYCL-PATCH-NUMBER");
  public static final SubLSymbol $sym9$EL_TEMPLATE_ARG_ = makeSymbol("EL-TEMPLATE-ARG?");
  public static final SubLList $list10 = list(makeSymbol("LEAVE-SOME-TERMS-AT-EL-FOR-ARG?"));
  public static final SubLSymbol $sym11$NAT_ = makeSymbol("NAT?");
  public static final SubLList $list12 = list(makeSymbol("NAUT?"));
  public static final SubLSymbol $sym13$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym14$RELATIONSHIP_ = makeSymbol("RELATIONSHIP?");
  public static final SubLList $list15 = list(makeSymbol("RELATION?"));
  public static final SubLSymbol $sym16$REIFIED_NAT_ = makeSymbol("REIFIED-NAT?");
  public static final SubLList $list17 = list(makeSymbol("NAUT-WITH-CORRESPONDING-NART?"));
  public static final SubLSymbol $sym18$REIFIABLE_NAT_ = makeSymbol("REIFIABLE-NAT?");
  public static final SubLList $list19 = list(makeSymbol("REIFIABLE-NAUT?"));
  public static final SubLSymbol $sym20$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $sym21$KB_NAT_ = makeSymbol("KB-NAT?");
  public static final SubLList $list22 = list(makeSymbol("KB-NAUT?"));
  public static final SubLSymbol $sym23$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $sym24$NAUT_IN_MT_ = makeSymbol("NAUT-IN-MT?");
  public static final SubLSymbol $sym25$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym26$GNAT_ = makeSymbol("GNAT?");
  public static final SubLList $list27 = list(makeSymbol("GROUND-NAUT?"));
  public static final SubLSymbol $sym28$GNAT_P = makeSymbol("GNAT-P");
  public static final SubLList $list29 = list(makeSymbol("HL-GROUND-NAUT?"));
  public static final SubLSymbol $sym30$FIND_GNAT = makeSymbol("FIND-GNAT");
  public static final SubLList $list31 = list(makeSymbol("FIND-GROUND-NAUT"));
  public static final SubLSymbol $sym32$CNAT_P = makeSymbol("CNAT-P");
  public static final SubLList $list33 = list(makeSymbol("CLOSED-NAUT?"));
  public static final SubLSymbol $sym34$CLOSED_NAT_P = makeSymbol("CLOSED-NAT-P");
  public static final SubLSymbol $sym35$REIFY_ARG_WHEN_CNAT = makeSymbol("REIFY-ARG-WHEN-CNAT");
  public static final SubLList $list36 = list(makeSymbol("REIFY-ARG-WHEN-CLOSED-NAUT"));
  public static final SubLSymbol $sym37$REIFY_WHEN_CNAT = makeSymbol("REIFY-WHEN-CNAT");
  public static final SubLList $list38 = list(makeSymbol("REIFY-WHEN-CLOSED-NAUT"));
  public static final SubLSymbol $sym39$FORTIFY = makeSymbol("FORTIFY");
  public static final SubLSymbol $sym40$FIND_WHEN_CNAT = makeSymbol("FIND-WHEN-CNAT");
  public static final SubLList $list41 = list(makeSymbol("FIND-WHEN-CLOSED-NAUT"));
  public static final SubLSymbol $sym42$FIND_CNAT = makeSymbol("FIND-CNAT");
  public static final SubLList $list43 = list(makeSymbol("FIND-CLOSED-NAUT"));
  public static final SubLSymbol $sym44$OPEN_NAT_P = makeSymbol("OPEN-NAT-P");
  public static final SubLList $list45 = list(makeSymbol("OPEN-NAUT?"));
  public static final SubLSymbol $sym46$FO_NAT_ = makeSymbol("FO-NAT?");
  public static final SubLList $list47 = list(makeSymbol("FIRST-ORDER-NAUT?"));
  public static final SubLSymbol $sym48$NAT_NOT_GNAT = makeSymbol("NAT-NOT-GNAT");
  public static final SubLList $list49 = list(makeSymbol("UNGROUND-NAUT?"));
  public static final SubLSymbol $sym50$FORMULA_FREE_VARIABLES = makeSymbol("FORMULA-FREE-VARIABLES");
  public static final SubLList $list51 = list(makeSymbol("SENTENCE-FREE-VARIABLES"));
  public static final SubLSymbol $sym52$FORMULA_VARIABLES = makeSymbol("FORMULA-VARIABLES");
  public static final SubLList $list53 = list(makeSymbol("SENTENCE-VARIABLES"));
  public static final SubLSymbol $sym54$COMPLETE_COLLECTION_EXTENT = makeSymbol("COMPLETE-COLLECTION-EXTENT");
  public static final SubLList $list55 = list(makeSymbol("COMPLETELY-ENUMERABLE-COLLECTION?"));
  public static final SubLSymbol $sym56$COMPLETE_EXTENT_KNOWN = makeSymbol("COMPLETE-EXTENT-KNOWN");
  public static final SubLList $list57 = list(makeSymbol("COMPLETE-EXTENT-ENUMERABLE?"));
  public static final SubLSymbol $sym58$BOOLEAN_ = makeSymbol("BOOLEAN?");
  public static final SubLList $list59 = list(makeSymbol("BOOLEANP"));

  //// Initializers

  public void declareFunctions() {
    declare_obsolete_file();
  }

  public void initializeVariables() {
    init_obsolete_file();
  }

  public void runTopLevelForms() {
    setup_obsolete_file();
  }

}
