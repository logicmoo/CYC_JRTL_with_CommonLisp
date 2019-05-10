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

package com.cyc.cycjava_1.cycl.sbhl;
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
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class sbhl_link_vars extends SubLTranslatedFile {

  //// Constructor

  private sbhl_link_vars() {}
  public static final SubLFile me = new sbhl_link_vars();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars";

  //// Definitions

  /** valid sbhl link directions */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 759) 
  private static SubLSymbol $sbhl_directions$ = null;

  /** valid sbhl link directions for sbhl directed links */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 954) 
  private static SubLSymbol $sbhl_directed_directions$ = null;

  /** valid sbhl link direction for forward direction of sbhl-directed-links. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1081) 
  private static SubLSymbol $sbhl_forward_directed_direction$ = null;

  /** valid sbhl link direction for forward direction of sbhl-directed-links as a list. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1224) 
  private static SubLSymbol $sbhl_forward_directed_direction_as_list$ = null;

  /** valid sbhl link direction for backward direction of sbhl-directed-links. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1389) 
  private static SubLSymbol $sbhl_backward_directed_direction$ = null;

  /** valid sbhl link direction for backward direction of sbhl-directed-links as a list. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1532) 
  private static SubLSymbol $sbhl_backward_directed_direction_as_list$ = null;

  /** valid sbhl link direction for undirected links */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1696) 
  private static SubLSymbol $sbhl_undirected_direction$ = null;

  /** valid sbhl link direction for undirected links in list form */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1803) 
  private static SubLSymbol $sbhl_undirected_direction_as_list$ = null;

  /** @return booleanp; is DIRECTION a member of *sbhl-directed-directions*? */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 2770) 
  public static final SubLObject sbhl_directed_direction_p(SubLObject direction) {
    return makeBoolean(((direction == $sbhl_forward_directed_direction$.getGlobalValue())
          || (direction == $sbhl_backward_directed_direction$.getGlobalValue())));
  }

  /** @return listp; *sbhl-directed-directions* */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 3213) 
  public static final SubLObject get_sbhl_directed_directions() {
    return $sbhl_directed_directions$.getGlobalValue();
  }

  /** @return keywordp; the keyword for the forward direction of @see *sbhl-directed-directions*. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 3346) 
  public static final SubLObject get_sbhl_forward_directed_direction() {
    return $sbhl_forward_directed_direction$.getGlobalValue();
  }

  /** @return booleanp; whether DIRECTION is the @see get-sbhl-forward-directed-direction. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 3543) 
  public static final SubLObject sbhl_forward_directed_direction_p(SubLObject direction) {
    return Equality.eq(direction, get_sbhl_forward_directed_direction());
  }

  /** @return keywordp; the keyword for the backward direction of @see *sbhl-directed-directions*. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 3943) 
  public static final SubLObject get_sbhl_backward_directed_direction() {
    return $sbhl_backward_directed_direction$.getGlobalValue();
  }

  /** @return keywordp; @see *sbhl-undirected-direction* */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 4549) 
  public static final SubLObject get_sbhl_undirected_direction() {
    return $sbhl_undirected_direction$.getGlobalValue();
  }

  /** @return listp; *sbhl-undirected-direction-as-list* */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 4693) 
  public static final SubLObject get_sbhl_undirected_direction_as_list() {
    return $sbhl_undirected_direction_as_list$.getGlobalValue();
  }

  /** used to specify sbhl-link-direction */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 4853) 
  public static SubLSymbol $sbhl_link_direction$ = null;

  /** Accessor. @return sbhl-link-direction-p. @see *sbhl-link-direction* */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 5028) 
  public static final SubLObject get_sbhl_link_direction() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_link_direction$.getDynamicValue(thread);
    }
  }

  /** Accessor. @return sbhl-link-direction-p; the opposite direction for directed links. Undirected links still return undirected direction. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 5177) 
  public static final SubLObject get_sbhl_opposite_link_direction() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((get_sbhl_link_direction() == get_sbhl_forward_directed_direction())) {
        return get_sbhl_backward_directed_direction();
      } else if ((get_sbhl_link_direction() == get_sbhl_backward_directed_direction())) {
        return get_sbhl_forward_directed_direction();
      } else if ((get_sbhl_link_direction() == get_sbhl_undirected_direction())) {
        return get_sbhl_undirected_direction();
      } else {
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
          if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2482"))) {
            {
              SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
              if (pcase_var.eql($kw8$ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), $sym10$SBHL_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              } else if (pcase_var.eql($kw11$CERROR)) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2171");
              } else if (pcase_var.eql($kw13$WARN)) {
                Errors.warn($str9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), $sym10$SBHL_DIRECTION_P);
              } else {
                Errors.warn($str14$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror($str12$continue_anyway, $str9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), $sym10$SBHL_DIRECTION_P);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** valid sbhl link truth values */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 7638) 
  private static SubLSymbol $sbhl_link_truth_values$ = null;

  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 7867) 
  public static SubLSymbol $sbhl_true_link_truth_values$ = null;

  /** @return fort-p; the the #$HLTruthValue corresponding to TRUTH and STRENGTH */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 8135) 
  public static final SubLObject truth_strength_to_sbhl_tv(SubLObject truth, SubLObject strength) {
    if (((truth == $kw29$TRUE)
         && (strength == $kw30$MONOTONIC))) {
      return $const31$MonotonicallyTrue;
    } else if (((truth == $kw29$TRUE)
         && (strength == $kw32$DEFAULT))) {
      return $const33$DefaultTrue;
    } else if (((truth == $kw34$FALSE)
         && (strength == $kw30$MONOTONIC))) {
      return $const35$MonotonicallyFalse;
    } else if (((truth == $kw34$FALSE)
         && (strength == $kw32$DEFAULT))) {
      return $const36$DefaultFalse;
    } else if ((truth == $kw37$UNKNOWN)) {
      return $kw37$UNKNOWN;
    } else {
      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$could_not_compute_an_SBHL_tv_from, truth, strength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** @return fort-p; the #$HLTruthValue corresponding to SUPPORT-TV. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 8766) 
  public static final SubLObject support_tv_to_sbhl_tv(SubLObject support_tv) {
    {
      SubLObject truth = enumeration_types.tv_truth(support_tv);
      SubLObject strength = enumeration_types.tv_strength(support_tv);
      return truth_strength_to_sbhl_tv(truth, strength);
    }
  }

  /** @return booleanp; whether TRUTH is a member of *sbhl-link-truth-values* */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 9021) 
  public static final SubLObject sbhl_link_truth_value_p(SubLObject truth) {
    return subl_promotions.memberP(truth, $sbhl_link_truth_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
  }

  /** Accessor: @return booleanp; whether OBJECT has valid structure to be an sbhl node */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 9596) 
  public static final SubLObject sbhl_node_object_p(SubLObject object) {
    return forts.fort_p(object);
  }

  /** Accessor: @return booleanp; whether OBJECT has valid structure to be an sbhl mt */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 9820) 
  public static final SubLObject sbhl_mt_object_p(SubLObject object) {
    return hlmt.chlmt_p(object);
  }

  /** Determines whether to iterate over sbhl links in random order */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 9975) 
  public static SubLSymbol $sbhl_randomize_lists_p$ = null;

  /** Accessor: @return booleanp; @see *sbhl-randomize-lists-p* */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 10303) 
  public static final SubLObject sbhl_randomize_lists_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_randomize_lists_p$.getDynamicValue(thread);
    }
  }

  /** Parameter for link mt, rebound during link iteration. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 10902) 
  public static SubLSymbol $sbhl_link_mt$ = null;

  /** Accessor: @return sbhl-node-object-p; @see *sbhl-link-mt* */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11077) 
  public static final SubLObject get_sbhl_link_mt() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_link_mt$.getDynamicValue(thread);
    }
  }

  /** Parameter for link tv, rebound during link iteration. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11203) 
  public static SubLSymbol $sbhl_link_tv$ = null;

  /** Accessor: @return sbhl-node-object-p; @see *sbhl-link-tv* */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11304) 
  public static final SubLObject get_sbhl_link_tv() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_link_tv$.getDynamicValue(thread);
    }
  }

  /** Parameter for the saving the information for which function which was used to create the current link-node. */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11429) 
  public static SubLSymbol $sbhl_link_generator$ = null;

  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11734) 
  public static SubLSymbol $sbhl_rw_lock$ = null;

  /** obsolete */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 12104) 
  public static SubLSymbol $added_assertion$ = null;

  /** obsolete */
  @SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 12189) 
  public static SubLSymbol $added_source$ = null;

  public static final SubLObject declare_sbhl_link_vars_file() {
    //declareFunction(myName, "sbhl_direction_p", "SBHL-DIRECTION-P", 1, 0, false);
    declareFunction(myName, "sbhl_directed_direction_p", "SBHL-DIRECTED-DIRECTION-P", 1, 0, false);
    //declareFunction(myName, "sbhl_undirected_direction_p", "SBHL-UNDIRECTED-DIRECTION-P", 1, 0, false);
    declareFunction(myName, "get_sbhl_directed_directions", "GET-SBHL-DIRECTED-DIRECTIONS", 0, 0, false);
    declareFunction(myName, "get_sbhl_forward_directed_direction", "GET-SBHL-FORWARD-DIRECTED-DIRECTION", 0, 0, false);
    declareFunction(myName, "sbhl_forward_directed_direction_p", "SBHL-FORWARD-DIRECTED-DIRECTION-P", 1, 0, false);
    //declareFunction(myName, "get_sbhl_forward_directed_direction_as_list", "GET-SBHL-FORWARD-DIRECTED-DIRECTION-AS-LIST", 0, 0, false);
    declareFunction(myName, "get_sbhl_backward_directed_direction", "GET-SBHL-BACKWARD-DIRECTED-DIRECTION", 0, 0, false);
    //declareFunction(myName, "sbhl_backward_directed_direction_p", "SBHL-BACKWARD-DIRECTED-DIRECTION-P", 1, 0, false);
    //declareFunction(myName, "get_sbhl_backward_directed_direction_as_list", "GET-SBHL-BACKWARD-DIRECTED-DIRECTION-AS-LIST", 0, 0, false);
    declareFunction(myName, "get_sbhl_undirected_direction", "GET-SBHL-UNDIRECTED-DIRECTION", 0, 0, false);
    declareFunction(myName, "get_sbhl_undirected_direction_as_list", "GET-SBHL-UNDIRECTED-DIRECTION-AS-LIST", 0, 0, false);
    declareFunction(myName, "get_sbhl_link_direction", "GET-SBHL-LINK-DIRECTION", 0, 0, false);
    declareFunction(myName, "get_sbhl_opposite_link_direction", "GET-SBHL-OPPOSITE-LINK-DIRECTION", 0, 0, false);
    //declareFunction(myName, "get_sbhl_link_direction_as_list", "GET-SBHL-LINK-DIRECTION-AS-LIST", 0, 0, false);
    //declareMacro(myName, "with_sbhl_link_direction", "WITH-SBHL-LINK-DIRECTION");
    //declareMacro(myName, "with_sbhl_opposite_link_direction", "WITH-SBHL-OPPOSITE-LINK-DIRECTION");
    //declareMacro(myName, "with_sbhl_forward_link_direction", "WITH-SBHL-FORWARD-LINK-DIRECTION");
    //declareMacro(myName, "with_sbhl_forward_link_direction_for_module", "WITH-SBHL-FORWARD-LINK-DIRECTION-FOR-MODULE");
    //declareMacro(myName, "with_sbhl_backward_link_direction", "WITH-SBHL-BACKWARD-LINK-DIRECTION");
    //declareMacro(myName, "do_sbhl_true_link_truths", "DO-SBHL-TRUE-LINK-TRUTHS");
    declareFunction(myName, "truth_strength_to_sbhl_tv", "TRUTH-STRENGTH-TO-SBHL-TV", 2, 0, false);
    declareFunction(myName, "support_tv_to_sbhl_tv", "SUPPORT-TV-TO-SBHL-TV", 1, 0, false);
    declareFunction(myName, "sbhl_link_truth_value_p", "SBHL-LINK-TRUTH-VALUE-P", 1, 0, false);
    //declareFunction(myName, "sbhl_link_nodes_object_p", "SBHL-LINK-NODES-OBJECT-P", 1, 0, false);
    declareFunction(myName, "sbhl_node_object_p", "SBHL-NODE-OBJECT-P", 1, 0, false);
    declareFunction(myName, "sbhl_mt_object_p", "SBHL-MT-OBJECT-P", 1, 0, false);
    //declareMacro(myName, "with_sbhl_randomized", "WITH-SBHL-RANDOMIZED");
    declareFunction(myName, "sbhl_randomize_lists_p", "SBHL-RANDOMIZE-LISTS-P", 0, 0, false);
    //declareMacro(myName, "sbhl_csome", "SBHL-CSOME");
    declareFunction(myName, "get_sbhl_link_mt", "GET-SBHL-LINK-MT", 0, 0, false);
    declareFunction(myName, "get_sbhl_link_tv", "GET-SBHL-LINK-TV", 0, 0, false);
    //declareFunction(myName, "get_sbhl_link_generator", "GET-SBHL-LINK-GENERATOR", 0, 0, false);
    //declareMacro(myName, "with_sbhl_writer_lock", "WITH-SBHL-WRITER-LOCK");
    //declareMacro(myName, "with_sbhl_reader_lock", "WITH-SBHL-READER-LOCK");
    return NIL;
  }

  public static final SubLObject init_sbhl_link_vars_file() {
    $sbhl_directions$ = deflexical("*SBHL-DIRECTIONS*", $list0);
    $sbhl_directed_directions$ = deflexical("*SBHL-DIRECTED-DIRECTIONS*", $list1);
    $sbhl_forward_directed_direction$ = deflexical("*SBHL-FORWARD-DIRECTED-DIRECTION*", $kw2$PREDICATE);
    $sbhl_forward_directed_direction_as_list$ = deflexical("*SBHL-FORWARD-DIRECTED-DIRECTION-AS-LIST*", $list3);
    $sbhl_backward_directed_direction$ = deflexical("*SBHL-BACKWARD-DIRECTED-DIRECTION*", $kw4$INVERSE);
    $sbhl_backward_directed_direction_as_list$ = deflexical("*SBHL-BACKWARD-DIRECTED-DIRECTION-AS-LIST*", $list5);
    $sbhl_undirected_direction$ = deflexical("*SBHL-UNDIRECTED-DIRECTION*", $kw6$LINK);
    $sbhl_undirected_direction_as_list$ = deflexical("*SBHL-UNDIRECTED-DIRECTION-AS-LIST*", $list7);
    $sbhl_link_direction$ = defparameter("*SBHL-LINK-DIRECTION*", NIL);
    $sbhl_link_truth_values$ = deflexical("*SBHL-LINK-TRUTH-VALUES*", $list24);
    $sbhl_true_link_truth_values$ = deflexical("*SBHL-TRUE-LINK-TRUTH-VALUES*", $list25);
    $sbhl_randomize_lists_p$ = defparameter("*SBHL-RANDOMIZE-LISTS-P*", NIL);
    $sbhl_link_mt$ = defparameter("*SBHL-LINK-MT*", NIL);
    $sbhl_link_tv$ = defparameter("*SBHL-LINK-TV*", NIL);
    $sbhl_link_generator$ = defparameter("*SBHL-LINK-GENERATOR*", NIL);
    $sbhl_rw_lock$ = deflexical("*SBHL-RW-LOCK*", ReadWriteLocks.new_rw_lock($str45$SBHL));
    $added_assertion$ = defparameter("*ADDED-ASSERTION*", NIL);
    $added_source$ = defparameter("*ADDED-SOURCE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_sbhl_link_vars_file() {
    // CVS_ID("Id: sbhl-link-vars.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("PREDICATE"), makeKeyword("INVERSE"), makeKeyword("LINK"));
  public static final SubLList $list1 = list(makeKeyword("PREDICATE"), makeKeyword("INVERSE"));
  public static final SubLSymbol $kw2$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLList $list3 = list(makeKeyword("PREDICATE"));
  public static final SubLSymbol $kw4$INVERSE = makeKeyword("INVERSE");
  public static final SubLList $list5 = list(makeKeyword("INVERSE"));
  public static final SubLSymbol $kw6$LINK = makeKeyword("LINK");
  public static final SubLList $list7 = list(makeKeyword("LINK"));
  public static final SubLSymbol $kw8$ERROR = makeKeyword("ERROR");
  public static final SubLString $str9$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym10$SBHL_DIRECTION_P = makeSymbol("SBHL-DIRECTION-P");
  public static final SubLSymbol $kw11$CERROR = makeKeyword("CERROR");
  public static final SubLString $str12$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw13$WARN = makeKeyword("WARN");
  public static final SubLString $str14$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLList $list15 = list(makeSymbol("DIRECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym16$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym17$_SBHL_LINK_DIRECTION_ = makeSymbol("*SBHL-LINK-DIRECTION*");
  public static final SubLList $list18 = list(list(makeSymbol("*SBHL-LINK-DIRECTION*"), list(makeSymbol("GET-SBHL-OPPOSITE-LINK-DIRECTION"))));
  public static final SubLSymbol $sym19$WITH_SBHL_LINK_DIRECTION = makeSymbol("WITH-SBHL-LINK-DIRECTION");
  public static final SubLList $list20 = list(makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE")));
  public static final SubLList $list21 = list(makeSymbol("MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym22$GET_SBHL_MODULE_FORWARD_DIRECTION = makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION");
  public static final SubLList $list23 = list(makeSymbol("GET-SBHL-MODULE-BACKWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE")));
  public static final SubLList $list24 = list(constant_handles.reader_make_constant_shell(makeString("MonotonicallyTrue")), constant_handles.reader_make_constant_shell(makeString("DefaultTrue")), constant_handles.reader_make_constant_shell(makeString("MonotonicallyFalse")), constant_handles.reader_make_constant_shell(makeString("DefaultFalse")));
  public static final SubLList $list25 = list(constant_handles.reader_make_constant_shell(makeString("MonotonicallyTrue")), constant_handles.reader_make_constant_shell(makeString("DefaultTrue")));
  public static final SubLList $list26 = list(list(makeSymbol("TRUTH-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym27$SMART_CSOME = makeSymbol("SMART-CSOME");
  public static final SubLSymbol $sym28$_SBHL_TRUE_LINK_TRUTH_VALUES_ = makeSymbol("*SBHL-TRUE-LINK-TRUTH-VALUES*");
  public static final SubLSymbol $kw29$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw30$MONOTONIC = makeKeyword("MONOTONIC");
  public static final SubLObject $const31$MonotonicallyTrue = constant_handles.reader_make_constant_shell(makeString("MonotonicallyTrue"));
  public static final SubLSymbol $kw32$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLObject $const33$DefaultTrue = constant_handles.reader_make_constant_shell(makeString("DefaultTrue"));
  public static final SubLSymbol $kw34$FALSE = makeKeyword("FALSE");
  public static final SubLObject $const35$MonotonicallyFalse = constant_handles.reader_make_constant_shell(makeString("MonotonicallyFalse"));
  public static final SubLObject $const36$DefaultFalse = constant_handles.reader_make_constant_shell(makeString("DefaultFalse"));
  public static final SubLSymbol $kw37$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLString $str38$could_not_compute_an_SBHL_tv_from = makeString("could not compute an SBHL tv from ~s and ~s");
  public static final SubLList $list39 = list(list(makeSymbol("*SBHL-RANDOMIZE-LISTS-P*"), T));
  public static final SubLList $list40 = list(list(makeSymbol("ELT-VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym41$NEW_LIST = makeUninternedSymbol("NEW-LIST");
  public static final SubLSymbol $sym42$FIF = makeSymbol("FIF");
  public static final SubLList $list43 = list(makeSymbol("SBHL-RANDOMIZE-LISTS-P"));
  public static final SubLSymbol $sym44$RANDOMIZE_LIST = makeSymbol("RANDOMIZE-LIST");
  public static final SubLString $str45$SBHL = makeString("SBHL");
  public static final SubLSymbol $sym46$WITH_WRITER_LOCK = makeSymbol("WITH-WRITER-LOCK");
  public static final SubLList $list47 = list(makeSymbol("*SBHL-RW-LOCK*"));
  public static final SubLSymbol $sym48$WITH_READER_LOCK = makeSymbol("WITH-READER-LOCK");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_link_vars_file();
  }

  public void initializeVariables() {
    init_sbhl_link_vars_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_link_vars_file();
  }

}
