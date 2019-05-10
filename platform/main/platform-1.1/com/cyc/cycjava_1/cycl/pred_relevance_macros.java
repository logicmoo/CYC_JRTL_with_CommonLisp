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
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.ghl_link_iterators;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.negation_predicate;
import com.cyc.cycjava_1.cycl.predicate_relevance_cache;

public  final class pred_relevance_macros extends SubLTranslatedFile {

  //// Constructor

  private pred_relevance_macros() {}
  public static final SubLFile me = new pred_relevance_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.pred_relevance_macros";

  //// Definitions

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 1129) 
  public static SubLSymbol $pred$ = null;

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 1220) 
  public static SubLSymbol $relevant_preds$ = null;

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 1256) 
  public static SubLSymbol $relevant_pred_function$ = null;

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 1692) 
  public static final SubLObject relevant_pred_is_eq(SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq($pred$.getDynamicValue(thread), pred);
    }
  }

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 1956) 
  public static final SubLObject relevant_pred_is_spec_pred(SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != relevant_pred_is_eq(pred))
            || (NIL != predicate_relevance_cache.cached_spec_predP($pred$.getDynamicValue(thread), pred, UNPROVIDED))));
    }
  }

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 2144) 
  public static final SubLObject relevant_pred_is_spec_inverse(SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return predicate_relevance_cache.cached_spec_inverseP($pred$.getDynamicValue(thread), pred, UNPROVIDED);
    }
  }

  /** return T iff PRED is a relevant predicate at this point */
  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 2481) 
  public static final SubLObject relevant_predP(SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != pred_relevance_undefined_p())) {
        return T;
      }
      {
        SubLObject pcase_var = $relevant_pred_function$.getDynamicValue(thread);
        if (pcase_var.eql($sym0$RELEVANT_PRED_IS_EVERYTHING)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30220");
        } else if (pcase_var.eql($sym1$RELEVANT_PRED_IS_EQ)) {
          return relevant_pred_is_eq(pred);
        } else if (pcase_var.eql($sym2$RELEVANT_PRED_IS_IN_LIST)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30222");
        } else if (pcase_var.eql($sym3$RELEVANT_PRED_IS_NOT_IN_LIST)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30223");
        } else if (pcase_var.eql($sym4$RELEVANT_PRED_IS_SPEC_PRED)) {
          return relevant_pred_is_spec_pred(pred);
        } else if (pcase_var.eql($sym5$RELEVANT_PRED_IS_SPEC_INVERSE)) {
          return relevant_pred_is_spec_inverse(pred);
        } else if (pcase_var.eql($sym6$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30224");
        } else if (pcase_var.eql($sym7$RELEVANT_PRED_WRT_GT_)) {
          return ghl_link_iterators.relevant_pred_wrt_gtP(pred);
        } else if (pcase_var.eql($sym8$INFERENCE_GENL_PREDICATE_OF_)) {
          return inference_genl_predicate_ofP(pred);
        } else if (pcase_var.eql($sym9$INFERENCE_GENL_INVERSE_OF_)) {
          return inference_genl_inverse_ofP(pred);
        } else if (pcase_var.eql($sym10$INFERENCE_GENL_PREDICATE_)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30213");
        } else if (pcase_var.eql($sym11$INFERENCE_GENL_INVERSE_)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30212");
        } else if (pcase_var.eql($sym12$INFERENCE_NEGATION_PREDICATE_)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30214");
        }
      }
      return Functions.funcall($relevant_pred_function$.getDynamicValue(thread), pred);
    }
  }

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 3902) 
  public static final SubLObject pred_relevance_undefined_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((NIL == $relevant_pred_function$.getDynamicValue(thread)));
    }
  }

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 3990) 
  public static final SubLObject all_preds_are_relevantP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != pred_relevance_undefined_p())
            || ($sym0$RELEVANT_PRED_IS_EVERYTHING == $relevant_pred_function$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 8972) 
  public static final SubLObject inference_genl_predicate_ofP(SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject inference_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), UNPROVIDED);
        return makeBoolean(((NIL != inference_pred)
               && (pred != inference_pred)
               && (NIL != predicate_relevance_cache.cached_spec_predP(inference_pred, pred, UNPROVIDED))));
      }
    }
  }

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 9588) 
  public static final SubLObject inference_genl_inverse_ofP(SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject inference_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), UNPROVIDED);
        return makeBoolean(((NIL != inference_pred)
               && (pred != inference_pred)
               && (NIL != predicate_relevance_cache.cached_spec_inverseP(inference_pred, pred, UNPROVIDED))));
      }
    }
  }

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 11162) 
  public static final SubLObject determine_inference_genl_or_spec_pred_relevance(SubLObject sense) {
    return (($kw46$POS == sense) ? ((SubLObject) $sym8$INFERENCE_GENL_PREDICATE_OF_) : $sym10$INFERENCE_GENL_PREDICATE_);
  }

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 11392) 
  public static final SubLObject determine_inference_genl_or_spec_inverse_relevance(SubLObject sense) {
    return (($kw46$POS == sense) ? ((SubLObject) $sym9$INFERENCE_GENL_INVERSE_OF_) : $sym11$INFERENCE_GENL_INVERSE_);
  }

  public static final class $pred_info_object_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $pred; }
    public SubLObject getField3() { return $relevance_function; }
    public SubLObject setField2(SubLObject value) { return $pred = value; }
    public SubLObject setField3(SubLObject value) { return $relevance_function = value; }
    public SubLObject $pred = NIL;
    public SubLObject $relevance_function = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($pred_info_object_native.class, $sym48$PRED_INFO_OBJECT, $sym49$PRED_INFO_OBJECT_P, $list50, $list51, new String[] {"$pred", "$relevance_function"}, $list52, $list53, $sym54$PRINT_PRED_INFO_OBJECT);
  }

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 11836) 
  public static SubLSymbol $dtp_pred_info_object$ = null;

  @SubL(source = "cycl/pred-relevance-macros.lisp", position = 11836) 
  public static final SubLObject pred_info_object_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30219");
    return NIL;
  }

  public static final class $pred_info_object_p$UnaryFunction extends UnaryFunction {
    public $pred_info_object_p$UnaryFunction() { super(extractFunctionNamed("PRED-INFO-OBJECT-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30216"); }
  }

  public static final SubLObject declare_pred_relevance_macros_file() {
    declareFunction(myName, "relevant_pred_is_everything", "RELEVANT-PRED-IS-EVERYTHING", 1, 0, false);
    declareFunction(myName, "relevant_pred_is_eq", "RELEVANT-PRED-IS-EQ", 1, 0, false);
    declareFunction(myName, "relevant_pred_is_in_list", "RELEVANT-PRED-IS-IN-LIST", 1, 0, false);
    declareFunction(myName, "relevant_pred_is_not_in_list", "RELEVANT-PRED-IS-NOT-IN-LIST", 1, 0, false);
    declareFunction(myName, "relevant_pred_is_spec_pred", "RELEVANT-PRED-IS-SPEC-PRED", 1, 0, false);
    declareFunction(myName, "relevant_pred_is_spec_inverse", "RELEVANT-PRED-IS-SPEC-INVERSE", 1, 0, false);
    declareFunction(myName, "relevant_pred_is_spec_pred_or_inverse", "RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE", 1, 0, false);
    declareFunction(myName, "relevant_predP", "RELEVANT-PRED?", 1, 0, false);
    declareFunction(myName, "pred_relevance_undefined_p", "PRED-RELEVANCE-UNDEFINED-P", 0, 0, false);
    declareFunction(myName, "all_preds_are_relevantP", "ALL-PREDS-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "only_specified_pred_is_relevantP", "ONLY-SPECIFIED-PRED-IS-RELEVANT?", 0, 0, false);
    declareMacro(myName, "with_predicate_function", "WITH-PREDICATE-FUNCTION");
    declareMacro(myName, "with_all_predicates", "WITH-ALL-PREDICATES");
    declareMacro(myName, "with_just_predicate", "WITH-JUST-PREDICATE");
    declareMacro(myName, "with_predicate_list", "WITH-PREDICATE-LIST");
    declareMacro(myName, "with_predicates_not_in_list", "WITH-PREDICATES-NOT-IN-LIST");
    declareMacro(myName, "with_all_spec_predicates", "WITH-ALL-SPEC-PREDICATES");
    declareMacro(myName, "with_all_spec_inverses", "WITH-ALL-SPEC-INVERSES");
    declareMacro(myName, "with_all_spec_predicates_and_inverses", "WITH-ALL-SPEC-PREDICATES-AND-INVERSES");
    declareMacro(myName, "with_pred_and_relevance", "WITH-PRED-AND-RELEVANCE");
    declareMacro(myName, "possibly_with_just_predicate", "POSSIBLY-WITH-JUST-PREDICATE");
    declareFunction(myName, "possibly_with_just_predicate_determine_function", "POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-FUNCTION", 1, 0, false);
    declareFunction(myName, "possibly_with_just_predicate_determine_predicate", "POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-PREDICATE", 1, 0, false);
    declareFunction(myName, "spec_preds_are_relevantP", "SPEC-PREDS-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "spec_inverses_are_relevantP", "SPEC-INVERSES-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "spec_preds_and_inverses_are_relevantP", "SPEC-PREDS-AND-INVERSES-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "inference_spec_preds_are_relevantP", "INFERENCE-SPEC-PREDS-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "inference_spec_inverses_are_relevantP", "INFERENCE-SPEC-INVERSES-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "inference_genl_preds_are_relevantP", "INFERENCE-GENL-PREDS-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "inference_genl_inverses_are_relevantP", "INFERENCE-GENL-INVERSES-ARE-RELEVANT?", 0, 0, false);
    declareFunction(myName, "inference_genl_predicate_ofP", "INFERENCE-GENL-PREDICATE-OF?", 1, 0, false);
    declareFunction(myName, "inference_genl_predicateP", "INFERENCE-GENL-PREDICATE?", 1, 0, false);
    declareFunction(myName, "inference_genl_inverse_ofP", "INFERENCE-GENL-INVERSE-OF?", 1, 0, false);
    declareFunction(myName, "inference_genl_inverseP", "INFERENCE-GENL-INVERSE?", 1, 0, false);
    declareFunction(myName, "inference_negation_predicateP", "INFERENCE-NEGATION-PREDICATE?", 1, 0, false);
    declareFunction(myName, "inference_negation_inverseP", "INFERENCE-NEGATION-INVERSE?", 1, 0, false);
    declareMacro(myName, "with_inference_genl_or_spec_pred_relevance", "WITH-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE");
    declareMacro(myName, "with_inference_genl_or_spec_inverse_relevance", "WITH-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE");
    declareFunction(myName, "determine_inference_genl_or_spec_pred_relevance", "DETERMINE-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE", 1, 0, false);
    declareFunction(myName, "determine_inference_genl_or_spec_inverse_relevance", "DETERMINE-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE", 1, 0, false);
    declareFunction(myName, "pred_info_object_print_function_trampoline", "PRED-INFO-OBJECT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "pred_info_object_p", "PRED-INFO-OBJECT-P", 1, 0, false); new $pred_info_object_p$UnaryFunction();
    declareFunction(myName, "pred_info_pred", "PRED-INFO-PRED", 1, 0, false);
    declareFunction(myName, "pred_info_relevance_function", "PRED-INFO-RELEVANCE-FUNCTION", 1, 0, false);
    declareFunction(myName, "_csetf_pred_info_pred", "_CSETF-PRED-INFO-PRED", 2, 0, false);
    declareFunction(myName, "_csetf_pred_info_relevance_function", "_CSETF-PRED-INFO-RELEVANCE-FUNCTION", 2, 0, false);
    declareFunction(myName, "make_pred_info_object", "MAKE-PRED-INFO-OBJECT", 0, 1, false);
    declareFunction(myName, "print_pred_info_object", "PRINT-PRED-INFO-OBJECT", 3, 0, false);
    declareFunction(myName, "pred_info_internal", "PRED-INFO-INTERNAL", 0, 2, false);
    declareFunction(myName, "pred_info", "PRED-INFO", 0, 2, false);
    return NIL;
  }

  public static final SubLObject init_pred_relevance_macros_file() {
    $pred$ = defparameter("*PRED*", NIL);
    $relevant_preds$ = defparameter("*RELEVANT-PREDS*", NIL);
    $relevant_pred_function$ = defparameter("*RELEVANT-PRED-FUNCTION*", NIL);
    $dtp_pred_info_object$ = defconstant("*DTP-PRED-INFO-OBJECT*", $sym48$PRED_INFO_OBJECT);
    return NIL;
  }

  public static final SubLObject setup_pred_relevance_macros_file() {
    // CVS_ID("Id: pred-relevance-macros.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_macro_helper($sym36$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION, $sym38$POSSIBLY_WITH_JUST_PREDICATE);
    access_macros.register_macro_helper($sym37$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE, $sym38$POSSIBLY_WITH_JUST_PREDICATE);
    access_macros.register_macro_helper($sym41$DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE, $sym45$WITH_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE);
    access_macros.register_macro_helper($sym44$DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE, $sym47$WITH_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_pred_info_object$.getGlobalValue(), Symbols.symbol_function($sym55$PRED_INFO_OBJECT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym56$PRED_INFO_PRED, $sym57$_CSETF_PRED_INFO_PRED);
    Structures.def_csetf($sym58$PRED_INFO_RELEVANCE_FUNCTION, $sym59$_CSETF_PRED_INFO_RELEVANCE_FUNCTION);
    Equality.identity($sym48$PRED_INFO_OBJECT);
    memoization_state.note_memoized_function($sym64$PRED_INFO);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$RELEVANT_PRED_IS_EVERYTHING = makeSymbol("RELEVANT-PRED-IS-EVERYTHING");
  public static final SubLSymbol $sym1$RELEVANT_PRED_IS_EQ = makeSymbol("RELEVANT-PRED-IS-EQ");
  public static final SubLSymbol $sym2$RELEVANT_PRED_IS_IN_LIST = makeSymbol("RELEVANT-PRED-IS-IN-LIST");
  public static final SubLSymbol $sym3$RELEVANT_PRED_IS_NOT_IN_LIST = makeSymbol("RELEVANT-PRED-IS-NOT-IN-LIST");
  public static final SubLSymbol $sym4$RELEVANT_PRED_IS_SPEC_PRED = makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
  public static final SubLSymbol $sym5$RELEVANT_PRED_IS_SPEC_INVERSE = makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
  public static final SubLSymbol $sym6$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE = makeSymbol("RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE");
  public static final SubLSymbol $sym7$RELEVANT_PRED_WRT_GT_ = makeSymbol("RELEVANT-PRED-WRT-GT?");
  public static final SubLSymbol $sym8$INFERENCE_GENL_PREDICATE_OF_ = makeSymbol("INFERENCE-GENL-PREDICATE-OF?");
  public static final SubLSymbol $sym9$INFERENCE_GENL_INVERSE_OF_ = makeSymbol("INFERENCE-GENL-INVERSE-OF?");
  public static final SubLSymbol $sym10$INFERENCE_GENL_PREDICATE_ = makeSymbol("INFERENCE-GENL-PREDICATE?");
  public static final SubLSymbol $sym11$INFERENCE_GENL_INVERSE_ = makeSymbol("INFERENCE-GENL-INVERSE?");
  public static final SubLSymbol $sym12$INFERENCE_NEGATION_PREDICATE_ = makeSymbol("INFERENCE-NEGATION-PREDICATE?");
  public static final SubLList $list13 = list(makeSymbol("FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym14$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym15$_RELEVANT_PRED_FUNCTION_ = makeSymbol("*RELEVANT-PRED-FUNCTION*");
  public static final SubLSymbol $sym16$WITH_PREDICATE_FUNCTION = makeSymbol("WITH-PREDICATE-FUNCTION");
  public static final SubLList $list17 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-EVERYTHING"));
  public static final SubLList $list18 = list(makeSymbol("PREDICATE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list19 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-EQ"));
  public static final SubLSymbol $sym20$_PRED_ = makeSymbol("*PRED*");
  public static final SubLList $list21 = list(makeSymbol("PREDICATES"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list22 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-IN-LIST"));
  public static final SubLSymbol $sym23$_RELEVANT_PREDS_ = makeSymbol("*RELEVANT-PREDS*");
  public static final SubLList $list24 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-NOT-IN-LIST"));
  public static final SubLList $list25 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-SPEC-PRED"));
  public static final SubLList $list26 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE"));
  public static final SubLList $list27 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE"));
  public static final SubLList $list28 = list(makeSymbol("PREDICATE"), makeSymbol("RELEVANCE-FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym29$PCASE = makeSymbol("PCASE");
  public static final SubLSymbol $sym30$WITH_JUST_PREDICATE = makeSymbol("WITH-JUST-PREDICATE");
  public static final SubLSymbol $sym31$WITH_ALL_SPEC_PREDICATES = makeSymbol("WITH-ALL-SPEC-PREDICATES");
  public static final SubLSymbol $sym32$WITH_ALL_SPEC_INVERSES = makeSymbol("WITH-ALL-SPEC-INVERSES");
  public static final SubLSymbol $sym33$WITH_ALL_SPEC_PREDICATES_AND_INVERSES = makeSymbol("WITH-ALL-SPEC-PREDICATES-AND-INVERSES");
  public static final SubLSymbol $sym34$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym35$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");
  public static final SubLSymbol $sym36$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION = makeSymbol("POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-FUNCTION");
  public static final SubLSymbol $sym37$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE = makeSymbol("POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-PREDICATE");
  public static final SubLSymbol $sym38$POSSIBLY_WITH_JUST_PREDICATE = makeSymbol("POSSIBLY-WITH-JUST-PREDICATE");
  public static final SubLSymbol $sym39$FORT_P = makeSymbol("FORT-P");
  public static final SubLList $list40 = list(makeSymbol("SENSE"), makeSymbol("LITERAL"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym41$DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE = makeSymbol("DETERMINE-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE");
  public static final SubLSymbol $sym42$_INFERENCE_LITERAL_ = makeSymbol("*INFERENCE-LITERAL*");
  public static final SubLSymbol $sym43$_INFERENCE_SENSE_ = makeSymbol("*INFERENCE-SENSE*");
  public static final SubLSymbol $sym44$DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE = makeSymbol("DETERMINE-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE");
  public static final SubLSymbol $sym45$WITH_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE = makeSymbol("WITH-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE");
  public static final SubLSymbol $kw46$POS = makeKeyword("POS");
  public static final SubLSymbol $sym47$WITH_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE = makeSymbol("WITH-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE");
  public static final SubLSymbol $sym48$PRED_INFO_OBJECT = makeSymbol("PRED-INFO-OBJECT");
  public static final SubLSymbol $sym49$PRED_INFO_OBJECT_P = makeSymbol("PRED-INFO-OBJECT-P");
  public static final SubLList $list50 = list(makeSymbol("PRED"), makeSymbol("RELEVANCE-FUNCTION"));
  public static final SubLList $list51 = list(makeKeyword("PRED"), makeKeyword("RELEVANCE-FUNCTION"));
  public static final SubLList $list52 = list(makeSymbol("PRED-INFO-PRED"), makeSymbol("PRED-INFO-RELEVANCE-FUNCTION"));
  public static final SubLList $list53 = list(makeSymbol("_CSETF-PRED-INFO-PRED"), makeSymbol("_CSETF-PRED-INFO-RELEVANCE-FUNCTION"));
  public static final SubLSymbol $sym54$PRINT_PRED_INFO_OBJECT = makeSymbol("PRINT-PRED-INFO-OBJECT");
  public static final SubLSymbol $sym55$PRED_INFO_OBJECT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PRED-INFO-OBJECT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym56$PRED_INFO_PRED = makeSymbol("PRED-INFO-PRED");
  public static final SubLSymbol $sym57$_CSETF_PRED_INFO_PRED = makeSymbol("_CSETF-PRED-INFO-PRED");
  public static final SubLSymbol $sym58$PRED_INFO_RELEVANCE_FUNCTION = makeSymbol("PRED-INFO-RELEVANCE-FUNCTION");
  public static final SubLSymbol $sym59$_CSETF_PRED_INFO_RELEVANCE_FUNCTION = makeSymbol("_CSETF-PRED-INFO-RELEVANCE-FUNCTION");
  public static final SubLSymbol $kw60$PRED = makeKeyword("PRED");
  public static final SubLSymbol $kw61$RELEVANCE_FUNCTION = makeKeyword("RELEVANCE-FUNCTION");
  public static final SubLString $str62$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str63$__PRED_INFO__s__s_ = makeString("#<PRED-INFO:~s:~s>");
  public static final SubLSymbol $sym64$PRED_INFO = makeSymbol("PRED-INFO");
  public static final SubLSymbol $kw65$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

  //// Initializers

  public void declareFunctions() {
    declare_pred_relevance_macros_file();
  }

  public void initializeVariables() {
    init_pred_relevance_macros_file();
  }

  public void runTopLevelForms() {
    setup_pred_relevance_macros_file();
  }

}
