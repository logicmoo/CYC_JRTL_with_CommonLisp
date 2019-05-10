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
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.hlmt_czer;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.mt_relevance_cache;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.psc;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class mt_relevance_macros extends SubLTranslatedFile {

  //// Constructor

  private mt_relevance_macros() {}
  public static final SubLFile me = new mt_relevance_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.mt_relevance_macros";

  //// Definitions

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 812) 
  public static SubLSymbol $relevant_mt_function$ = null;

  /** Return T iff relevant-mt function MT-FUNCTION matches that specified by SYMBOL */
  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 1059) 
  public static final SubLObject mt_function_eq(SubLObject mt_function, SubLObject symbol) {
    return Equality.eq(mt_function, symbol);
  }

  /** Return T iff the currently relevant mt-function matches that specified by SYMBOL */
  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 1230) 
  public static final SubLObject relevant_mt_function_eq(SubLObject symbol) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return mt_function_eq($relevant_mt_function$.getDynamicValue(thread), symbol);
    }
  }

  /** A ubiquitous parameter used to dynamically bind the current mt assumptions, if they can be expressed by a single mt. */
  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 1423) 
  public static SubLSymbol $mt$ = null;

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 1749) 
  public static SubLSymbol $relevant_mts$ = null;

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 2239) 
  public static final SubLObject current_mt_relevance_mt() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $mt$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 2789) 
  public static final SubLObject relevant_mt_is_everything(SubLObject mt) {
    return T;
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 2862) 
  public static final SubLObject relevant_mt_is_any_mt(SubLObject mt) {
    return T;
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 3154) 
  public static final SubLObject relevant_mt_is_eq(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return hlmt.hlmt_equal($mt$.getDynamicValue(thread), mt);
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 3626) 
  public static final SubLObject relevant_mt_is_genl_mt(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((mt == $mt$.getDynamicValue(thread))) {
        return T;
      }
      {
        SubLObject spec_coreP = mt_vars.core_microtheory_p($mt$.getDynamicValue(thread));
        SubLObject genl_coreP = mt_vars.core_microtheory_p(mt);
        if (((NIL != spec_coreP)
             && (NIL != genl_coreP))) {
          return mt_vars.core_genl_mtP(mt, $mt$.getDynamicValue(thread));
        } else if ((NIL != genl_coreP)) {
          return T;
        } else if ((NIL != spec_coreP)) {
          return NIL;
        } else {
          return mt_relevance_cache.basemtP($mt$.getDynamicValue(thread), mt);
        }
      }
    }
  }

  /** Return T iff MT is relevant with respect to the current dynamic mt scope. */
  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 6198) 
  public static final SubLObject relevant_mtP(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject function = $relevant_mt_function$.getDynamicValue(thread);
        if ((NIL == function)) {
          return relevant_mt_is_genl_mt(mt);
        }
        {
          SubLObject pcase_var = function;
          if (pcase_var.eql($sym12$RELEVANT_MT_IS_GENL_MT)) {
            return relevant_mt_is_genl_mt(mt);
          } else if (pcase_var.eql($sym13$RELEVANT_MT_IS_ANY_MT)) {
            return relevant_mt_is_any_mt(mt);
          } else if (pcase_var.eql($sym14$RELEVANT_MT_IS_EVERYTHING)) {
            return relevant_mt_is_everything(mt);
          } else if (pcase_var.eql($sym15$RELEVANT_MT_IS_EQ)) {
            return relevant_mt_is_eq(mt);
          } else if (pcase_var.eql($sym16$RELEVANT_MT_IS_IN_LIST)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31127");
          } else if (pcase_var.eql($sym17$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31125");
          } else if (pcase_var.eql($sym18$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31126");
          }
        }
        return Functions.funcall(function, mt);
      }
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 7739) 
  public static final SubLObject genl_mts_are_relevantP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL == $relevant_mt_function$.getDynamicValue(thread))
            || (NIL != relevant_mt_function_eq($sym12$RELEVANT_MT_IS_GENL_MT))));
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 7884) 
  public static final SubLObject any_mt_is_relevantP() {
    return relevant_mt_function_eq($sym13$RELEVANT_MT_IS_ANY_MT);
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 7984) 
  public static final SubLObject all_mts_are_relevantP() {
    return relevant_mt_function_eq($sym14$RELEVANT_MT_IS_EVERYTHING);
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 8090) 
  public static final SubLObject any_or_all_mts_are_relevantP() {
    return makeBoolean(((NIL != relevant_mt_function_eq($sym14$RELEVANT_MT_IS_EVERYTHING))
          || (NIL != relevant_mt_function_eq($sym13$RELEVANT_MT_IS_ANY_MT))));
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 8369) 
  public static final SubLObject genl_mts_of_listed_mts_are_relevantP() {
    return relevant_mt_function_eq($sym17$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER);
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 8502) 
  public static final SubLObject any_time_is_relevantP() {
    return relevant_mt_function_eq($sym18$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME);
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 8723) 
  public static final SubLObject only_specified_mt_is_relevantP() {
    return relevant_mt_function_eq($sym15$RELEVANT_MT_IS_EQ);
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 11643) 
  public static final SubLObject possibly_in_mt_determine_function(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL == mt)
          || (NIL != with_inference_any_mt_relevanceP(mt))
          || (NIL != with_inference_mt_relevance_all_mtsP(mt))
          || (NIL != genl_mts_of_listed_mts_are_relevantP())
          || (NIL != any_time_is_relevantP()))) {
        return $relevant_mt_function$.getDynamicValue(thread);
      }
      return $sym12$RELEVANT_MT_IS_GENL_MT;
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 12031) 
  public static final SubLObject possibly_in_mt_determine_mt(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ((NIL != mt) ? ((SubLObject) mt) : $mt$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 12708) 
  public static final SubLObject possibly_with_just_mt_determine_function(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == mt)) {
        return $relevant_mt_function$.getDynamicValue(thread);
      }
      checkType(mt, $sym58$HLMT_P);
      return $sym15$RELEVANT_MT_IS_EQ;
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 12922) 
  public static final SubLObject possibly_with_just_mt_determine_mt(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ((NIL != mt) ? ((SubLObject) mt) : $mt$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 13893) 
  public static final SubLObject with_inference_mt_relevance_validate(SubLObject mt) {
    return ((NIL != mt) ? ((SubLObject) mt) : Errors.error($str64$No_microtheory_was_specified_));
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 15619) 
  public static final SubLObject update_inference_mt_relevance_mt(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != mt)) {
        checkType(mt, $sym58$HLMT_P);
      }
      if ((NIL == mt)) {
        return $mt$.getDynamicValue(thread);
      } else {
        return mt;
      }
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 15839) 
  public static final SubLObject update_inference_mt_relevance_function(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == mt)) {
        return $relevant_mt_function$.getDynamicValue(thread);
      } else if ((NIL != with_inference_any_mt_relevanceP(mt))) {
        return $sym13$RELEVANT_MT_IS_ANY_MT;
      } else if ((NIL != with_inference_mt_relevance_all_mtsP(mt))) {
        return $sym14$RELEVANT_MT_IS_EVERYTHING;
      } else if ((NIL != with_mt_union_relevanceP(mt))) {
        return $sym17$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
      } else if ((NIL != with_inference_anytime_relevanceP(mt))) {
        return $sym18$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME;
      } else {
        return $sym12$RELEVANT_MT_IS_GENL_MT;
      }
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 16384) 
  public static final SubLObject update_inference_mt_relevance_mt_list(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == mt)) {
        return $relevant_mts$.getDynamicValue(thread);
      } else if ((NIL != with_mt_union_relevanceP(mt))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12317");
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 17019) 
  public static final SubLObject with_inference_any_mt_relevanceP(SubLObject mt) {
    return Equality.eq($sym76$PSC_INFERENCE, psc.mt_inference_function(mt));
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 17819) 
  public static final SubLObject with_inference_mt_relevance_all_mtsP(SubLObject mt) {
    return Equality.eq($sym78$ALL_MTS_INFERENCE, psc.mt_inference_function(mt));
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 18017) 
  public static final SubLObject with_mt_union_relevanceP(SubLObject mt) {
    return Equality.eq($sym80$MT_UNION_INFERENCE, psc.mt_inference_function(mt));
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 18204) 
  public static final SubLObject with_inference_anytime_relevanceP(SubLObject mt) {
    return Equality.eq($sym82$ANYTIME_PSC_INFERENCE, psc.mt_inference_function(mt));
  }

  /** From the dynamic mt context, return an mt suitable for passing to
@xref with-inference-mt-relevance.  Using this is usually preferable to
referencing *mt* directly. */
  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 18403) 
  public static final SubLObject inference_relevant_mt() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != all_mts_are_relevantP())) {
        return $const29$EverythingPSC;
      } else if ((NIL != any_mt_is_relevantP())) {
        return $const34$InferencePSC;
      } else if ((NIL != genl_mts_of_listed_mts_are_relevantP())) {
        return el_utilities.make_formula($const83$MtUnionFn, $relevant_mts$.getDynamicValue(thread), UNPROVIDED);
      } else if ((NIL != genl_mts_are_relevantP())) {
        return $mt$.getDynamicValue(thread);
      } else {
        return $mt$.getDynamicValue(thread);
      }
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 18959) 
  public static final SubLObject mt_info(SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != all_mts_are_relevantP())) {
        return $relevant_mt_function$.getDynamicValue(thread);
      } else if ((NIL != any_mt_is_relevantP())) {
        return $relevant_mt_function$.getDynamicValue(thread);
      } else if ((NIL != genl_mts_of_listed_mts_are_relevantP())) {
        return el_utilities.make_formula($const83$MtUnionFn, $relevant_mts$.getDynamicValue(thread), UNPROVIDED);
      } else if ((NIL != mt)) {
        return mt;
      } else if ((NIL != $mt$.getDynamicValue(thread))) {
        return $mt$.getDynamicValue(thread);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 20027) 
  public static final SubLObject any_or_all_mts_relevant_to_mtP(SubLObject mt) {
    return makeBoolean(((NIL != with_inference_any_mt_relevanceP(mt))
          || (NIL != with_inference_mt_relevance_all_mtsP(mt))));
  }

  /** Assuming that relevance is being established from MT, and we are imposing a constraint
about which we need to be conservative, return the mt in which we should look for such constraints. */
  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 20179) 
  public static final SubLObject conservative_constraint_mt(SubLObject mt) {
    if ((NIL != any_or_all_mts_relevant_to_mtP(mt))) {
      return mt_vars.$core_mt_floor$.getGlobalValue();
    } else {
      return mt;
    }
  }

  @SubL(source = "cycl/mt-relevance-macros.lisp", position = 20755) 
  public static final SubLObject any_relevant_mtP(SubLObject mts) {
    {
      SubLObject relevantP = NIL;
      if ((NIL == relevantP)) {
        {
          SubLObject csome_list_var = mts;
          SubLObject mt = NIL;
          for (mt = csome_list_var.first(); (!(((NIL != relevantP)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), mt = csome_list_var.first()) {
            if ((NIL != relevant_mtP(mt))) {
              relevantP = T;
            }
          }
        }
      }
      return relevantP;
    }
  }

  public static final SubLObject declare_mt_relevance_macros_file() {
    declareMacro(myName, "with_mt_function", "WITH-MT-FUNCTION");
    declareFunction(myName, "mt_function_eq", "MT-FUNCTION-EQ", 2, 0, false);
    declareFunction(myName, "relevant_mt_function_eq", "RELEVANT-MT-FUNCTION-EQ", 1, 0, false);
    declareMacro(myName, "in_mt", "IN-MT");
    declareMacro(myName, "in_mt_list", "IN-MT-LIST");
    declareFunction(myName, "current_mt_relevance_mt_context", "CURRENT-MT-RELEVANCE-MT-CONTEXT", 0, 0, false);
    declareFunction(myName, "current_mt_relevance_mt", "CURRENT-MT-RELEVANCE-MT", 0, 0, false);
    declareFunction(myName, "current_mt_relevance_mt_list", "CURRENT-MT-RELEVANCE-MT-LIST", 0, 0, false);
    declareFunction(myName, "current_mt_relevance_test", "CURRENT-MT-RELEVANCE-TEST", 0, 0, false);
    declareFunction(myName, "relevant_mt_is_everything", "RELEVANT-MT-IS-EVERYTHING", 1, 0, false);
    declareFunction(myName, "relevant_mt_is_any_mt", "RELEVANT-MT-IS-ANY-MT", 1, 0, false);
    declareFunction(myName, "relevant_mt_is_eq", "RELEVANT-MT-IS-EQ", 1, 0, false);
    declareFunction(myName, "relevant_mt_is_in_list", "RELEVANT-MT-IS-IN-LIST", 1, 0, false);
    declareFunction(myName, "relevant_mt_is_genl_mt", "RELEVANT-MT-IS-GENL-MT", 1, 0, false);
    declareFunction(myName, "relevant_mt_is_spec_mt", "RELEVANT-MT-IS-SPEC-MT", 1, 0, false);
    declareFunction(myName, "relevant_mt_is_genl_mt_of_list_member", "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER", 1, 0, false);
    declareFunction(myName, "relevant_mt_is_genl_mt_with_any_time", "RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME", 1, 0, false);
    declareFunction(myName, "relevant_mtP", "RELEVANT-MT?", 1, 0, false);
    declareFunction(myName, "relevant_assertionP", "RELEVANT-ASSERTION?", 1, 0, false);
    declareFunction(myName, "mt_relevance_unspecifiedP", "MT-RELEVANCE-UNSPECIFIED?", 0, 0, false);
    declareFunction(myName, "genl_mts_are_relevantP", "GENL-MTS-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "any_mt_is_relevantP", "ANY-MT-IS-RELEVANT?", 0, 0, false);
    declareFunction(myName, "all_mts_are_relevantP", "ALL-MTS-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "any_or_all_mts_are_relevantP", "ANY-OR-ALL-MTS-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "listed_mts_are_relevantP", "LISTED-MTS-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "genl_mts_of_listed_mts_are_relevantP", "GENL-MTS-OF-LISTED-MTS-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "any_time_is_relevantP", "ANY-TIME-IS-RELEVANT?", 0, 0, false);
    declareFunction(myName, "spec_mts_are_relevantP", "SPEC-MTS-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "only_specified_mt_is_relevantP", "ONLY-SPECIFIED-MT-IS-RELEVANT?", 0, 0, false);
    declareMacro(myName, "with_genl_mts", "WITH-GENL-MTS");
    declareMacro(myName, "with_genl_mts_el", "WITH-GENL-MTS-EL");
    declareMacro(myName, "with_mt", "WITH-MT");
    declareMacro(myName, "with_all_mts", "WITH-ALL-MTS");
    declareMacro(myName, "with_any_mt", "WITH-ANY-MT");
    declareMacro(myName, "with_just_mt", "WITH-JUST-MT");
    declareMacro(myName, "with_mt_list", "WITH-MT-LIST");
    declareMacro(myName, "with_mt_list_and_genl_mts", "WITH-MT-LIST-AND-GENL-MTS");
    declareMacro(myName, "with_genl_mts_of_union", "WITH-GENL-MTS-OF-UNION");
    declareMacro(myName, "with_any_time_relevance", "WITH-ANY-TIME-RELEVANCE");
    declareMacro(myName, "with_spec_mts", "WITH-SPEC-MTS");
    declareMacro(myName, "possibly_in_mt", "POSSIBLY-IN-MT");
    declareFunction(myName, "possibly_in_mt_determine_function", "POSSIBLY-IN-MT-DETERMINE-FUNCTION", 1, 0, false);
    declareFunction(myName, "possibly_in_mt_determine_mt", "POSSIBLY-IN-MT-DETERMINE-MT", 1, 0, false);
    declareMacro(myName, "possibly_with_just_mt", "POSSIBLY-WITH-JUST-MT");
    declareFunction(myName, "possibly_with_just_mt_determine_function", "POSSIBLY-WITH-JUST-MT-DETERMINE-FUNCTION", 1, 0, false);
    declareFunction(myName, "possibly_with_just_mt_determine_mt", "POSSIBLY-WITH-JUST-MT-DETERMINE-MT", 1, 0, false);
    declareMacro(myName, "with_inference_mt_relevance", "WITH-INFERENCE-MT-RELEVANCE");
    declareMacro(myName, "with_inference_mt_relevance_el", "WITH-INFERENCE-MT-RELEVANCE-EL");
    declareFunction(myName, "with_inference_mt_relevance_validate", "WITH-INFERENCE-MT-RELEVANCE-VALIDATE", 1, 0, false);
    declareFunction(myName, "determine_inference_mt_relevance_el_spec", "DETERMINE-INFERENCE-MT-RELEVANCE-EL-SPEC", 1, 0, false);
    declareMacro(myName, "possibly_with_inference_mt_relevance", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
    declareMacro(myName, "possibly_with_inference_mt_relevance_internal", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL");
    declareMacro(myName, "possibly_with_inference_mt_relevance_el", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-EL");
    declareFunction(myName, "update_inference_mt_relevance_mt", "UPDATE-INFERENCE-MT-RELEVANCE-MT", 1, 0, false);
    declareFunction(myName, "update_inference_mt_relevance_function", "UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION", 1, 0, false);
    declareFunction(myName, "update_inference_mt_relevance_mt_list", "UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST", 1, 0, false);
    declareFunction(myName, "determine_possibly_with_inference_mt_relevance_mt_and_spec", "DETERMINE-POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-MT-AND-SPEC", 1, 0, false);
    declareFunction(myName, "with_inference_any_mt_relevanceP", "WITH-INFERENCE-ANY-MT-RELEVANCE?", 1, 0, false);
    declareFunction(myName, "with_inference_mt_relevance_all_mtsP", "WITH-INFERENCE-MT-RELEVANCE-ALL-MTS?", 1, 0, false);
    declareFunction(myName, "with_mt_union_relevanceP", "WITH-MT-UNION-RELEVANCE?", 1, 0, false);
    declareFunction(myName, "with_inference_anytime_relevanceP", "WITH-INFERENCE-ANYTIME-RELEVANCE?", 1, 0, false);
    declareFunction(myName, "inference_relevant_mt", "INFERENCE-RELEVANT-MT", 0, 0, false);
    declareFunction(myName, "mt_info", "MT-INFO", 0, 1, false);
    declareFunction(myName, "mt_to_mt_info", "MT-TO-MT-INFO", 1, 0, false);
    declareMacro(myName, "with_mt_info", "WITH-MT-INFO");
    declareFunction(myName, "in_one_of_these_mtsP", "IN-ONE-OF-THESE-MTS?", 2, 0, false);
    declareFunction(myName, "any_or_all_mts_relevant_to_mtP", "ANY-OR-ALL-MTS-RELEVANT-TO-MT?", 1, 0, false);
    declareFunction(myName, "conservative_constraint_mt", "CONSERVATIVE-CONSTRAINT-MT", 1, 0, false);
    declareFunction(myName, "mt_relevant_to_mtP", "MT-RELEVANT-TO-MT?", 2, 0, false);
    declareFunction(myName, "any_relevant_mtP", "ANY-RELEVANT-MT?", 1, 0, false);
    declareMacro(myName, "map_mts", "MAP-MTS");
    return NIL;
  }

  public static final SubLObject init_mt_relevance_macros_file() {
    $relevant_mt_function$ = defparameter("*RELEVANT-MT-FUNCTION*", NIL);
    $mt$ = defparameter("*MT*", mt_vars.$assertible_theory_mt_root$.getGlobalValue());
    $relevant_mts$ = defparameter("*RELEVANT-MTS*", NIL);
    return NIL;
  }

  public static final SubLObject setup_mt_relevance_macros_file() {
    // CVS_ID("Id: mt-relevance-macros.lisp 128436 2009-07-28 22:59:45Z goolsbey ");
    mt_vars.note_mt_var($mt$.getDynamicValue(), UNPROVIDED);
    access_macros.register_macro_helper($sym5$IN_MT_LIST, $list6);
    utilities_macros.register_cyc_api_macro($sym23$WITH_GENL_MTS, $list3, $str24$MT_and_all_its_genl_mts_are_relev);
    utilities_macros.register_cyc_api_macro($sym27$WITH_MT, $list3, $str24$MT_and_all_its_genl_mts_are_relev);
    utilities_macros.register_cyc_api_macro($sym30$WITH_ALL_MTS, $list31, $str32$All_mts_are_relevant_within_BODY_);
    utilities_macros.register_cyc_api_macro($sym35$WITH_ANY_MT, $list31, $str36$Any_mt_can_be_used_for_relevance_);
    utilities_macros.register_cyc_api_macro($sym38$WITH_JUST_MT, $list3, $str39$Only_MT_is_relevant_within_BODY__);
    utilities_macros.register_cyc_api_macro($sym41$WITH_MT_LIST, $list7, $str42$Each_mt_in_the_list_MT_LIST_is_re);
    access_macros.register_macro_helper($sym51$POSSIBLY_IN_MT_DETERMINE_FUNCTION, $sym53$POSSIBLY_IN_MT);
    access_macros.register_macro_helper($sym52$POSSIBLY_IN_MT_DETERMINE_MT, $sym53$POSSIBLY_IN_MT);
    access_macros.register_macro_helper($sym55$POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION, $sym57$POSSIBLY_WITH_JUST_MT);
    access_macros.register_macro_helper($sym56$POSSIBLY_WITH_JUST_MT_DETERMINE_MT, $sym57$POSSIBLY_WITH_JUST_MT);
    utilities_macros.register_cyc_api_macro($sym61$WITH_INFERENCE_MT_RELEVANCE, $list3, $str62$BODY_evaluated_with_the_same_rele);
    access_macros.register_macro_helper($sym60$WITH_INFERENCE_MT_RELEVANCE_VALIDATE, $sym61$WITH_INFERENCE_MT_RELEVANCE);
    access_macros.register_macro_helper($sym63$DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC, $sym65$WITH_INFERENCE_MT_RELEVANCE_EL);
    access_macros.register_macro_helper($sym59$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, $list66);
    access_macros.register_macro_helper($sym68$UPDATE_INFERENCE_MT_RELEVANCE_MT, $sym59$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
    access_macros.register_macro_helper($sym69$UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION, $sym59$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
    access_macros.register_macro_helper($sym70$UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST, $sym59$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
    access_macros.define_obsolete_register($sym72$DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC, $list73);
    access_macros.register_macro_helper($sym74$WITH_INFERENCE_ANY_MT_RELEVANCE_, $list75);
    access_macros.register_macro_helper($sym77$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_, $list75);
    access_macros.register_macro_helper($sym79$WITH_MT_UNION_RELEVANCE_, $list75);
    access_macros.register_macro_helper($sym81$WITH_INFERENCE_ANYTIME_RELEVANCE_, $list75);
    utilities_macros.register_cyc_api_macro($sym94$MAP_MTS, $list91, $str95$Iterate_over_all_microtheories__b);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym2$_RELEVANT_MT_FUNCTION_ = makeSymbol("*RELEVANT-MT-FUNCTION*");
  public static final SubLList $list3 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym4$_MT_ = makeSymbol("*MT*");
  public static final SubLSymbol $sym5$IN_MT_LIST = makeSymbol("IN-MT-LIST");
  public static final SubLList $list6 = list(makeSymbol("WITH-MT-LIST"), makeSymbol("WITH-MT-LIST-AND-GENL-MTS"), makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL"));
  public static final SubLList $list7 = list(makeSymbol("MT-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym8$_RELEVANT_MTS_ = makeSymbol("*RELEVANT-MTS*");
  public static final SubLSymbol $sym9$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
  public static final SubLSymbol $sym10$SPECIAL_CORE_LOOP_MT_P = makeSymbol("SPECIAL-CORE-LOOP-MT-P");
  public static final SubLSymbol $sym11$CORE_MICROTHEORY_P = makeSymbol("CORE-MICROTHEORY-P");
  public static final SubLSymbol $sym12$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym13$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
  public static final SubLSymbol $sym14$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLSymbol $sym15$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLSymbol $sym16$RELEVANT_MT_IS_IN_LIST = makeSymbol("RELEVANT-MT-IS-IN-LIST");
  public static final SubLSymbol $sym17$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
  public static final SubLSymbol $sym18$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME = makeSymbol("RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME");
  public static final SubLSymbol $sym19$RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");
  public static final SubLSymbol $sym20$WITH_MT_FUNCTION = makeSymbol("WITH-MT-FUNCTION");
  public static final SubLList $list21 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-GENL-MT"));
  public static final SubLSymbol $sym22$IN_MT = makeSymbol("IN-MT");
  public static final SubLSymbol $sym23$WITH_GENL_MTS = makeSymbol("WITH-GENL-MTS");
  public static final SubLString $str24$MT_and_all_its_genl_mts_are_relev = makeString("MT and all its genl mts are relevant within BODY.");
  public static final SubLList $list25 = list(makeSymbol("ELMT"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym26$CANONICALIZE_HLMT = makeSymbol("CANONICALIZE-HLMT");
  public static final SubLSymbol $sym27$WITH_MT = makeSymbol("WITH-MT");
  public static final SubLList $list28 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-EVERYTHING"));
  public static final SubLObject $const29$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym30$WITH_ALL_MTS = makeSymbol("WITH-ALL-MTS");
  public static final SubLList $list31 = list(makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str32$All_mts_are_relevant_within_BODY_ = makeString("All mts are relevant within BODY.");
  public static final SubLList $list33 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-ANY-MT"));
  public static final SubLObject $const34$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $sym35$WITH_ANY_MT = makeSymbol("WITH-ANY-MT");
  public static final SubLString $str36$Any_mt_can_be_used_for_relevance_ = makeString("Any mt can be used for relevance for a particular inference within &BODY.");
  public static final SubLList $list37 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-EQ"));
  public static final SubLSymbol $sym38$WITH_JUST_MT = makeSymbol("WITH-JUST-MT");
  public static final SubLString $str39$Only_MT_is_relevant_within_BODY__ = makeString("Only MT is relevant within BODY (no genl mts).");
  public static final SubLList $list40 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-IN-LIST"));
  public static final SubLSymbol $sym41$WITH_MT_LIST = makeSymbol("WITH-MT-LIST");
  public static final SubLString $str42$Each_mt_in_the_list_MT_LIST_is_re = makeString("Each mt in the list MT-LIST is relevant within BODY (no genl mts).");
  public static final SubLList $list43 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER"));
  public static final SubLList $list44 = list(makeSymbol("MT-UNION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym45$WITH_MT_LIST_AND_GENL_MTS = makeSymbol("WITH-MT-LIST-AND-GENL-MTS");
  public static final SubLSymbol $sym46$MT_UNION_MTS = makeSymbol("MT-UNION-MTS");
  public static final SubLList $list47 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME"));
  public static final SubLList $list48 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-SPEC-MT"));
  public static final SubLSymbol $sym49$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym50$MT_VAR = makeUninternedSymbol("MT-VAR");
  public static final SubLSymbol $sym51$POSSIBLY_IN_MT_DETERMINE_FUNCTION = makeSymbol("POSSIBLY-IN-MT-DETERMINE-FUNCTION");
  public static final SubLSymbol $sym52$POSSIBLY_IN_MT_DETERMINE_MT = makeSymbol("POSSIBLY-IN-MT-DETERMINE-MT");
  public static final SubLSymbol $sym53$POSSIBLY_IN_MT = makeSymbol("POSSIBLY-IN-MT");
  public static final SubLSymbol $sym54$MT_VAR = makeUninternedSymbol("MT-VAR");
  public static final SubLSymbol $sym55$POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION = makeSymbol("POSSIBLY-WITH-JUST-MT-DETERMINE-FUNCTION");
  public static final SubLSymbol $sym56$POSSIBLY_WITH_JUST_MT_DETERMINE_MT = makeSymbol("POSSIBLY-WITH-JUST-MT-DETERMINE-MT");
  public static final SubLSymbol $sym57$POSSIBLY_WITH_JUST_MT = makeSymbol("POSSIBLY-WITH-JUST-MT");
  public static final SubLSymbol $sym58$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym59$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL = makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL");
  public static final SubLSymbol $sym60$WITH_INFERENCE_MT_RELEVANCE_VALIDATE = makeSymbol("WITH-INFERENCE-MT-RELEVANCE-VALIDATE");
  public static final SubLSymbol $sym61$WITH_INFERENCE_MT_RELEVANCE = makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
  public static final SubLString $str62$BODY_evaluated_with_the_same_rele = makeString("BODY evaluated with the same relevance used for inferences in MT.\n   This is like @xref with-genl-mts, except it is special-cased to\n   @xref with-all-mts when the mt is #$EverythingPSC,\n   @xref with-any-mt when the mt is #$InferencePSC.\n   Also, with-inference-mt-relevance errors if passed NIL for an mt.");
  public static final SubLSymbol $sym63$DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC = makeSymbol("DETERMINE-INFERENCE-MT-RELEVANCE-EL-SPEC");
  public static final SubLString $str64$No_microtheory_was_specified_ = makeString("No microtheory was specified.");
  public static final SubLSymbol $sym65$WITH_INFERENCE_MT_RELEVANCE_EL = makeSymbol("WITH-INFERENCE-MT-RELEVANCE-EL");
  public static final SubLList $list66 = list(makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE"));
  public static final SubLSymbol $sym67$MT_VAR = makeUninternedSymbol("MT-VAR");
  public static final SubLSymbol $sym68$UPDATE_INFERENCE_MT_RELEVANCE_MT = makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT");
  public static final SubLSymbol $sym69$UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION = makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION");
  public static final SubLSymbol $sym70$UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST = makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST");
  public static final SubLSymbol $sym71$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
  public static final SubLSymbol $sym72$DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC = makeSymbol("DETERMINE-POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-MT-AND-SPEC");
  public static final SubLList $list73 = list(makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION"), makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT"), makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST"));
  public static final SubLSymbol $sym74$WITH_INFERENCE_ANY_MT_RELEVANCE_ = makeSymbol("WITH-INFERENCE-ANY-MT-RELEVANCE?");
  public static final SubLList $list75 = list(makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL"), makeSymbol("POSSIBLY-IN-MT"));
  public static final SubLSymbol $sym76$PSC_INFERENCE = makeSymbol("PSC-INFERENCE");
  public static final SubLSymbol $sym77$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_ = makeSymbol("WITH-INFERENCE-MT-RELEVANCE-ALL-MTS?");
  public static final SubLSymbol $sym78$ALL_MTS_INFERENCE = makeSymbol("ALL-MTS-INFERENCE");
  public static final SubLSymbol $sym79$WITH_MT_UNION_RELEVANCE_ = makeSymbol("WITH-MT-UNION-RELEVANCE?");
  public static final SubLSymbol $sym80$MT_UNION_INFERENCE = makeSymbol("MT-UNION-INFERENCE");
  public static final SubLSymbol $sym81$WITH_INFERENCE_ANYTIME_RELEVANCE_ = makeSymbol("WITH-INFERENCE-ANYTIME-RELEVANCE?");
  public static final SubLSymbol $sym82$ANYTIME_PSC_INFERENCE = makeSymbol("ANYTIME-PSC-INFERENCE");
  public static final SubLObject $const83$MtUnionFn = constant_handles.reader_make_constant_shell(makeString("MtUnionFn"));
  public static final SubLList $list84 = list(makeSymbol("MT-INFO"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym85$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym86$MT_FUNCTION_EQ = makeSymbol("MT-FUNCTION-EQ");
  public static final SubLList $list87 = list(list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-EVERYTHING")));
  public static final SubLList $list88 = list(list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-ANY-MT")));
  public static final SubLSymbol $sym89$MT_UNION_NAUT_P = makeSymbol("MT-UNION-NAUT-P");
  public static final SubLSymbol $sym90$WITH_GENL_MTS_OF_UNION = makeSymbol("WITH-GENL-MTS-OF-UNION");
  public static final SubLList $list91 = list(list(makeSymbol("VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym92$DO_ALL_FORT_INSTANCES = makeSymbol("DO-ALL-FORT-INSTANCES");
  public static final SubLList $list93 = list(constant_handles.reader_make_constant_shell(makeString("Microtheory")));
  public static final SubLSymbol $sym94$MAP_MTS = makeSymbol("MAP-MTS");
  public static final SubLString $str95$Iterate_over_all_microtheories__b = makeString("Iterate over all microtheories, binding VAR to an mt and executing BODY.");

  //// Initializers

  public void declareFunctions() {
    declare_mt_relevance_macros_file();
  }

  public void initializeVariables() {
    init_mt_relevance_macros_file();
  }

  public void runTopLevelForms() {
    setup_mt_relevance_macros_file();
  }

}
