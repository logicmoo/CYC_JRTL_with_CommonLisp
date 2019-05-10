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
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.clausifier;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.wff;
//dm import com.cyc.cycjava_1.cycl.wff_macros;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class postcanonicalizer extends SubLTranslatedFile {

  //// Constructor

  private postcanonicalizer() {}
  public static final SubLFile me = new postcanonicalizer();
  public static final String myName = "com.cyc.cycjava_1.cycl.postcanonicalizer";

  //// Definitions

  /** @return 0 EL sentence
   @return 1 mt
   Performs some canonicalizations which could not be handled by the canonicalizer.
   Canonicalizes the pragmatic requirement condition as a high level query. */
  @SubL(source = "cycl/postcanonicalizer.lisp", position = 642) 
  public static final SubLObject postcanonicalizations(SubLObject sentence, SubLObject mt) {
    return postcanonicalizations_int(sentence, mt);
  }

  /** @return 0 EL sentence
   @return 1 mt */
  @SubL(source = "cycl/postcanonicalizer.lisp", position = 948) 
  public static final SubLObject postcanonicalizations_int(SubLObject sentence, SubLObject mt) {
    if ((NIL == list_utilities.tree_find_if($sym0$EL_MEETS_PRAGMATIC_REQUIREMENT_P, cycl_utilities.sentence_args(sentence, UNPROVIDED), UNPROVIDED))) {
      return Values.values(sentence, mt);
    }
    if ((NIL != el_utilities.el_conjunction_p(sentence))) {
      {
        SubLObject conjuncts = NIL;
        SubLObject args = cycl_utilities.formula_args(sentence, $kw1$IGNORE);
        SubLObject cdolist_list_var = args;
        SubLObject conjunct = NIL;
        for (conjunct = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), conjunct = cdolist_list_var.first()) {
          conjuncts = cons(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8556"), conjuncts);
        }
        sentence = el_utilities.make_conjunction(Sequences.nreverse(conjuncts));
      }
    } else if ((NIL != el_utilities.el_disjunction_p(sentence))) {
      sentence = Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8557");
    }
    return Values.values(sentence, mt);
  }

  public static final SubLObject declare_postcanonicalizer_file() {
    declareFunction(myName, "postcanonicalizations", "POSTCANONICALIZATIONS", 2, 0, false);
    declareFunction(myName, "postcanonicalizations_int", "POSTCANONICALIZATIONS-INT", 2, 0, false);
    //declareFunction(myName, "postcanonicalize_possible_disjunction", "POSTCANONICALIZE-POSSIBLE-DISJUNCTION", 2, 0, false);
    //declareFunction(myName, "transform_dnf_and_binding_list_to_negated_el", "TRANSFORM-DNF-AND-BINDING-LIST-TO-NEGATED-EL", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_postcanonicalizer_file() {
    return NIL;
  }

  public static final SubLObject setup_postcanonicalizer_file() {
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$EL_MEETS_PRAGMATIC_REQUIREMENT_P = makeSymbol("EL-MEETS-PRAGMATIC-REQUIREMENT-P");
  public static final SubLSymbol $kw1$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $kw2$DISJUNCT_IN_PRAGMATIC_REQUIREMENT = makeKeyword("DISJUNCT-IN-PRAGMATIC-REQUIREMENT");
  public static final SubLList $list3 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

  //// Initializers

  public void declareFunctions() {
    declare_postcanonicalizer_file();
  }

  public void initializeVariables() {
    init_postcanonicalizer_file();
  }

  public void runTopLevelForms() {
    setup_postcanonicalizer_file();
  }

}
