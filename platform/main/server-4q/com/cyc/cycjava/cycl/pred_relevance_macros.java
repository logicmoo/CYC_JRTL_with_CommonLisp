package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.pred_relevance_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.pred_relevance_macros.*; 
 public final class pred_relevance_macros extends SubLTranslatedFile {
    public static final SubLFile me = new pred_relevance_macros();

    public static final String myName = "com.cyc.cycjava.cycl.pred_relevance_macros";

    public static final String myFingerPrint = "8ccd0e6721bdc936becbf3d2cfa92d586e9b76931acc373ed833495408716764";







    // defconstant
    public static final SubLSymbol $dtp_pred_info_object$ = makeSymbol("*DTP-PRED-INFO-OBJECT*");

    private static final SubLList $list0 = list(makeSymbol("INLINE"), makeSymbol("RELEVANT-PRED-IS-EVERYTHING"), makeSymbol("RELEVANT-PRED-IS-EQ"), makeSymbol("RELEVANT-PRED-IS-IN-LIST"), makeSymbol("RELEVANT-PRED-IS-NOT-IN-LIST"), makeSymbol("RELEVANT-PRED-IS-SPEC-PRED"), makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE"), makeSymbol("RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE"));

    private static final SubLSymbol RELEVANT_PRED_IS_EVERYTHING = makeSymbol("RELEVANT-PRED-IS-EVERYTHING");



    private static final SubLSymbol RELEVANT_PRED_IS_IN_LIST = makeSymbol("RELEVANT-PRED-IS-IN-LIST");

    private static final SubLSymbol RELEVANT_PRED_IS_NOT_IN_LIST = makeSymbol("RELEVANT-PRED-IS-NOT-IN-LIST");





    private static final SubLSymbol RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE = makeSymbol("RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE");

    private static final SubLSymbol $sym8$RELEVANT_PRED_WRT_GT_ = makeSymbol("RELEVANT-PRED-WRT-GT?");

    private static final SubLSymbol $sym9$INFERENCE_GENL_PREDICATE_OF_ = makeSymbol("INFERENCE-GENL-PREDICATE-OF?");

    private static final SubLSymbol $sym10$INFERENCE_GENL_INVERSE_OF_ = makeSymbol("INFERENCE-GENL-INVERSE-OF?");

    private static final SubLSymbol $sym11$INFERENCE_GENL_PREDICATE_ = makeSymbol("INFERENCE-GENL-PREDICATE?");

    private static final SubLSymbol $sym12$INFERENCE_GENL_INVERSE_ = makeSymbol("INFERENCE-GENL-INVERSE?");

    private static final SubLSymbol $sym13$INFERENCE_NEGATION_PREDICATE_ = makeSymbol("INFERENCE-NEGATION-PREDICATE?");



    private static final SubLSymbol $UNABLE_TO_DETERMINE = makeKeyword("UNABLE-TO-DETERMINE");

    private static final SubLList $list16 = list(makeSymbol("FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $relevant_pred_function$ = makeSymbol("*RELEVANT-PRED-FUNCTION*");

    private static final SubLSymbol WITH_PREDICATE_FUNCTION = makeSymbol("WITH-PREDICATE-FUNCTION");

    private static final SubLList $list20 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-EVERYTHING"));

    public static final SubLList $list21 = list(makeSymbol("PREDICATE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list22 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-EQ"));

    public static final SubLSymbol $pred$ = makeSymbol("*PRED*");

    public static final SubLList $list24 = list(makeSymbol("PREDICATES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list25 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-IN-LIST"));

    public static final SubLSymbol $relevant_preds$ = makeSymbol("*RELEVANT-PREDS*");

    public static final SubLList $list27 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-NOT-IN-LIST"));

    public static final SubLList $list28 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-SPEC-PRED"));

    private static final SubLList $list29 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE"));

    private static final SubLList $list30 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE"));

    private static final SubLList $list31 = list(makeSymbol("PREDICATE"), makeSymbol("RELEVANCE-FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol WITH_JUST_PREDICATE = makeSymbol("WITH-JUST-PREDICATE");

    private static final SubLSymbol WITH_ALL_SPEC_PREDICATES = makeSymbol("WITH-ALL-SPEC-PREDICATES");

    private static final SubLSymbol WITH_ALL_SPEC_INVERSES = makeSymbol("WITH-ALL-SPEC-INVERSES");

    private static final SubLSymbol WITH_ALL_SPEC_PREDICATES_AND_INVERSES = makeSymbol("WITH-ALL-SPEC-PREDICATES-AND-INVERSES");



    private static final SubLSymbol $sym38$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");

    private static final SubLSymbol POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION = makeSymbol("POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-FUNCTION");

    private static final SubLSymbol POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE = makeSymbol("POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-PREDICATE");

    private static final SubLSymbol POSSIBLY_WITH_JUST_PREDICATE = makeSymbol("POSSIBLY-WITH-JUST-PREDICATE");



    private static final SubLList $list43 = list(makeSymbol("INLINE"), makeSymbol("SPEC-PREDS-ARE-RELEVANT?"), makeSymbol("SPEC-INVERSES-ARE-RELEVANT?"), makeSymbol("SPEC-PREDS-AND-INVERSES-ARE-RELEVANT?"), makeSymbol("INFERENCE-SPEC-PREDS-ARE-RELEVANT?"), makeSymbol("INFERENCE-SPEC-INVERSES-ARE-RELEVANT?"), makeSymbol("INFERENCE-GENL-PREDS-ARE-RELEVANT?"), makeSymbol("INFERENCE-GENL-INVERSES-ARE-RELEVANT?"));

    private static final SubLList $list44 = list(makeSymbol("SENSE"), makeSymbol("LITERAL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE = makeSymbol("DETERMINE-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE");

    private static final SubLSymbol $inference_literal$ = makeSymbol("*INFERENCE-LITERAL*");

    private static final SubLSymbol $inference_sense$ = makeSymbol("*INFERENCE-SENSE*");

    private static final SubLSymbol DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE = makeSymbol("DETERMINE-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE");

    private static final SubLSymbol WITH_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE = makeSymbol("WITH-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE");



    private static final SubLSymbol WITH_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE = makeSymbol("WITH-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE");

    private static final SubLSymbol PRED_INFO_OBJECT = makeSymbol("PRED-INFO-OBJECT");

    private static final SubLSymbol PRED_INFO_OBJECT_P = makeSymbol("PRED-INFO-OBJECT-P");

    private static final SubLList $list54 = list(makeSymbol("PRED"), makeSymbol("RELEVANCE-FUNCTION"));

    private static final SubLList $list55 = list(makeKeyword("PRED"), makeKeyword("RELEVANCE-FUNCTION"));

    private static final SubLList $list56 = list(makeSymbol("PRED-INFO-PRED"), makeSymbol("PRED-INFO-RELEVANCE-FUNCTION"));

    private static final SubLList $list57 = list(makeSymbol("_CSETF-PRED-INFO-PRED"), makeSymbol("_CSETF-PRED-INFO-RELEVANCE-FUNCTION"));

    private static final SubLSymbol PRINT_PRED_INFO_OBJECT = makeSymbol("PRINT-PRED-INFO-OBJECT");

    private static final SubLSymbol PRED_INFO_OBJECT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PRED-INFO-OBJECT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list60 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PRED-INFO-OBJECT-P"));

    private static final SubLSymbol PRED_INFO_PRED = makeSymbol("PRED-INFO-PRED");

    private static final SubLSymbol _CSETF_PRED_INFO_PRED = makeSymbol("_CSETF-PRED-INFO-PRED");

    private static final SubLSymbol PRED_INFO_RELEVANCE_FUNCTION = makeSymbol("PRED-INFO-RELEVANCE-FUNCTION");

    private static final SubLSymbol _CSETF_PRED_INFO_RELEVANCE_FUNCTION = makeSymbol("_CSETF-PRED-INFO-RELEVANCE-FUNCTION");





    private static final SubLString $str67$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_PRED_INFO_OBJECT = makeSymbol("MAKE-PRED-INFO-OBJECT");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PRED_INFO_OBJECT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PRED-INFO-OBJECT-METHOD");

    private static final SubLString $str73$__PRED_INFO__s__s_ = makeString("#<PRED-INFO:~s:~s>");

    private static final SubLSymbol PRED_INFO = makeSymbol("PRED-INFO");

    public static SubLObject relevant_pred_is_everything(final SubLObject pred) {
        return T;
    }

    public static SubLObject relevant_pred_is_eq(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eql($pred$.getDynamicValue(thread), pred);
    }

    public static SubLObject relevant_pred_is_in_list(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(pred, $relevant_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject relevant_pred_is_not_in_list(final SubLObject pred) {
        return makeBoolean(NIL == relevant_pred_is_in_list(pred));
    }

    public static SubLObject relevant_pred_is_spec_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != relevant_pred_is_eq(pred)) || (NIL != predicate_relevance_cache.cached_spec_predP($pred$.getDynamicValue(thread), pred, UNPROVIDED)));
    }

    public static SubLObject relevant_pred_is_spec_inverse(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return predicate_relevance_cache.cached_spec_inverseP($pred$.getDynamicValue(thread), pred, UNPROVIDED);
    }

    public static SubLObject relevant_pred_is_spec_pred_or_inverse(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != relevant_pred_is_eq(pred)) || (NIL != predicate_relevance_cache.cached_spec_predP($pred$.getDynamicValue(thread), pred, UNPROVIDED))) || (NIL != predicate_relevance_cache.cached_spec_inverseP($pred$.getDynamicValue(thread), pred, UNPROVIDED)));
    }

    public static SubLObject relevant_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pred_relevance_undefined_p()) {
            return T;
        }
        final SubLObject pcase_var = $relevant_pred_function$.getDynamicValue(thread);
        if (pcase_var.eql(RELEVANT_PRED_IS_EVERYTHING)) {
            return relevant_pred_is_everything(pred);
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_EQ)) {
            return relevant_pred_is_eq(pred);
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_IN_LIST)) {
            return relevant_pred_is_in_list(pred);
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_NOT_IN_LIST)) {
            return relevant_pred_is_not_in_list(pred);
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_SPEC_PRED)) {
            return relevant_pred_is_spec_pred(pred);
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_SPEC_INVERSE)) {
            return relevant_pred_is_spec_inverse(pred);
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE)) {
            return relevant_pred_is_spec_pred_or_inverse(pred);
        }
        if (pcase_var.eql($sym8$RELEVANT_PRED_WRT_GT_)) {
            return ghl_link_iterators.relevant_pred_wrt_gtP(pred);
        }
        if (pcase_var.eql($sym9$INFERENCE_GENL_PREDICATE_OF_)) {
            return inference_genl_predicate_ofP(pred);
        }
        if (pcase_var.eql($sym10$INFERENCE_GENL_INVERSE_OF_)) {
            return inference_genl_inverse_ofP(pred);
        }
        if (pcase_var.eql($sym11$INFERENCE_GENL_PREDICATE_)) {
            return inference_genl_predicateP(pred);
        }
        if (pcase_var.eql($sym12$INFERENCE_GENL_INVERSE_)) {
            return inference_genl_inverseP(pred);
        }
        if (pcase_var.eql($sym13$INFERENCE_NEGATION_PREDICATE_)) {
            return inference_negation_predicateP(pred);
        }
        return funcall($relevant_pred_function$.getDynamicValue(thread), pred);
    }

    public static SubLObject all_possibly_relevant_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pred_relevance_undefined_p()) {
            return $ALL;
        }
        final SubLObject pred = $pred$.getDynamicValue(thread);
        final SubLObject pcase_var = $relevant_pred_function$.getDynamicValue(thread);
        if (pcase_var.eql(RELEVANT_PRED_IS_EVERYTHING)) {
            return $ALL;
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_EQ)) {
            return list(pred);
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_IN_LIST)) {
            return $relevant_preds$.getDynamicValue(thread);
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_NOT_IN_LIST)) {
            return $UNABLE_TO_DETERMINE;
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_SPEC_PRED)) {
            return genl_predicates.all_spec_preds(pred, UNPROVIDED, UNPROVIDED);
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_SPEC_INVERSE)) {
            return genl_predicates.all_spec_inverses(pred, UNPROVIDED, UNPROVIDED);
        }
        if (pcase_var.eql(RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE)) {
            return append(genl_predicates.all_spec_preds(pred, UNPROVIDED, UNPROVIDED), genl_predicates.all_spec_inverses(pred, UNPROVIDED, UNPROVIDED));
        }
        if (pcase_var.eql($sym8$RELEVANT_PRED_WRT_GT_)) {
            return ghl_link_iterators.all_possibly_relevant_gt_preds();
        }
        if (pcase_var.eql($sym9$INFERENCE_GENL_PREDICATE_OF_)) {
            final SubLObject inference_pred = literal_predicate($inference_literal$.getDynamicValue(thread), UNPROVIDED);
            if (NIL != inference_pred) {
                return remove(inference_pred, genl_predicates.all_spec_preds(inference_pred, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return $ALL;
        } else
            if (pcase_var.eql($sym10$INFERENCE_GENL_INVERSE_OF_)) {
                final SubLObject inference_pred = literal_predicate($inference_literal$.getDynamicValue(thread), UNPROVIDED);
                if (NIL != inference_pred) {
                    return remove(inference_pred, genl_predicates.all_spec_inverses(inference_pred, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return $ALL;
            } else
                if (pcase_var.eql($sym11$INFERENCE_GENL_PREDICATE_)) {
                    final SubLObject inference_pred = literal_predicate($inference_literal$.getDynamicValue(thread), UNPROVIDED);
                    if (NIL != inference_pred) {
                        return remove(inference_pred, genl_predicates.all_genl_preds(inference_pred, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return $ALL;
                } else
                    if (pcase_var.eql($sym12$INFERENCE_GENL_INVERSE_)) {
                        final SubLObject inference_pred = literal_predicate($inference_literal$.getDynamicValue(thread), UNPROVIDED);
                        if (NIL != inference_pred) {
                            return remove(inference_pred, genl_predicates.all_genl_inverses(inference_pred, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        return $ALL;
                    } else {
                        if (!pcase_var.eql($sym13$INFERENCE_NEGATION_PREDICATE_)) {
                            return $UNABLE_TO_DETERMINE;
                        }
                        final SubLObject inference_pred = literal_predicate($inference_literal$.getDynamicValue(thread), UNPROVIDED);
                        if (NIL != inference_pred) {
                            return remove(inference_pred, negation_predicate.all_negation_preds(inference_pred, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        return $ALL;
                    }



    }

    public static SubLObject pred_relevance_undefined_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == $relevant_pred_function$.getDynamicValue(thread));
    }

    public static SubLObject all_preds_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != pred_relevance_undefined_p()) || (RELEVANT_PRED_IS_EVERYTHING == $relevant_pred_function$.getDynamicValue(thread)));
    }

    public static SubLObject only_specified_pred_is_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq(RELEVANT_PRED_IS_EQ, $relevant_pred_function$.getDynamicValue(thread));
    }

    public static SubLObject only_specified_predicate_list_is_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq(RELEVANT_PRED_IS_IN_LIST, $relevant_pred_function$.getDynamicValue(thread));
    }

    public static SubLObject with_predicate_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        function = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($relevant_pred_function$, function)), append(body, NIL));
    }

    public static SubLObject with_all_predicates(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_PREDICATE_FUNCTION, $list20, append(body, NIL));
    }

    public static SubLObject with_just_predicate(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        predicate = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_PREDICATE_FUNCTION, $list22, listS(CLET, list(list($pred$, predicate)), append(body, NIL)));
    }

    public static SubLObject with_predicate_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicates = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        predicates = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_PREDICATE_FUNCTION, $list25, listS(CLET, list(list($relevant_preds$, predicates)), append(body, NIL)));
    }

    public static SubLObject with_predicates_not_in_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicates = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        predicates = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_PREDICATE_FUNCTION, $list27, listS(CLET, list(list($relevant_preds$, predicates)), append(body, NIL)));
    }

    public static SubLObject with_all_spec_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        predicate = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_PREDICATE_FUNCTION, $list28, listS(CLET, list(list($pred$, predicate)), append(body, NIL)));
    }

    public static SubLObject with_all_spec_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        predicate = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_PREDICATE_FUNCTION, $list29, listS(CLET, list(list($pred$, predicate)), append(body, NIL)));
    }

    public static SubLObject with_all_spec_predicates_and_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        predicate = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_PREDICATE_FUNCTION, $list30, listS(CLET, list(list($pred$, predicate)), append(body, NIL)));
    }

    public static SubLObject with_pred_and_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = NIL;
        SubLObject relevance_function = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        relevance_function = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PCASE, relevance_function, list(RELEVANT_PRED_IS_EQ, listS(WITH_JUST_PREDICATE, predicate, append(body, NIL))), list(RELEVANT_PRED_IS_SPEC_PRED, listS(WITH_ALL_SPEC_PREDICATES, predicate, append(body, NIL))), list(RELEVANT_PRED_IS_SPEC_INVERSE, listS(WITH_ALL_SPEC_INVERSES, predicate, append(body, NIL))), list(RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE, listS(WITH_ALL_SPEC_PREDICATES_AND_INVERSES, predicate, append(body, NIL))));
    }

    public static SubLObject possibly_with_just_predicate(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        predicate = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL == predicate) {
            return bq_cons(PROGN, append(body, NIL));
        }
        final SubLObject predicate_var = $sym38$PREDICATE_VAR;
        return list(CLET, list(list(predicate_var, predicate)), list(WITH_PREDICATE_FUNCTION, list(POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION, predicate_var), listS(CLET, list(list($pred$, list(POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE, predicate_var))), append(body, NIL))));
    }

    public static SubLObject possibly_with_just_predicate_determine_function(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == predicate) {
            return $relevant_pred_function$.getDynamicValue(thread);
        }
        assert NIL != forts.fort_p(predicate) : "forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) " + predicate;
        return RELEVANT_PRED_IS_EQ;
    }

    public static SubLObject possibly_with_just_predicate_determine_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != predicate ? predicate : $pred$.getDynamicValue(thread);
    }

    public static SubLObject spec_preds_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($relevant_pred_function$.getDynamicValue(thread), RELEVANT_PRED_IS_SPEC_PRED);
    }

    public static SubLObject spec_inverses_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($relevant_pred_function$.getDynamicValue(thread), RELEVANT_PRED_IS_SPEC_INVERSE);
    }

    public static SubLObject spec_preds_and_inverses_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($relevant_pred_function$.getDynamicValue(thread), RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE);
    }

    public static SubLObject inference_spec_preds_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($relevant_pred_function$.getDynamicValue(thread), $sym9$INFERENCE_GENL_PREDICATE_OF_);
    }

    public static SubLObject inference_spec_inverses_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($relevant_pred_function$.getDynamicValue(thread), $sym10$INFERENCE_GENL_INVERSE_OF_);
    }

    public static SubLObject inference_genl_preds_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($relevant_pred_function$.getDynamicValue(thread), $sym11$INFERENCE_GENL_PREDICATE_);
    }

    public static SubLObject inference_genl_inverses_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($relevant_pred_function$.getDynamicValue(thread), $sym12$INFERENCE_GENL_INVERSE_);
    }

    public static SubLObject inference_genl_predicate_ofP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = literal_predicate($inference_literal$.getDynamicValue(thread), UNPROVIDED);
        return makeBoolean(((NIL != inference_pred) && (!pred.eql(inference_pred))) && (NIL != predicate_relevance_cache.cached_spec_predP(inference_pred, pred, UNPROVIDED)));
    }

    public static SubLObject inference_genl_predicateP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = literal_predicate($inference_literal$.getDynamicValue(thread), UNPROVIDED);
        return makeBoolean(((NIL != inference_pred) && (!pred.eql(inference_pred))) && (NIL != predicate_relevance_cache.cached_genl_predP(inference_pred, pred, UNPROVIDED)));
    }

    public static SubLObject inference_genl_inverse_ofP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = literal_predicate($inference_literal$.getDynamicValue(thread), UNPROVIDED);
        return makeBoolean(((NIL != inference_pred) && (!pred.eql(inference_pred))) && (NIL != predicate_relevance_cache.cached_spec_inverseP(inference_pred, pred, UNPROVIDED)));
    }

    public static SubLObject inference_genl_inverseP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = literal_predicate($inference_literal$.getDynamicValue(thread), UNPROVIDED);
        return makeBoolean(((NIL != inference_pred) && (!pred.eql(inference_pred))) && (NIL != predicate_relevance_cache.cached_genl_inverseP(inference_pred, pred, UNPROVIDED)));
    }

    public static SubLObject inference_negation_predicateP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = cycl_utilities.atomic_sentence_predicate($inference_literal$.getDynamicValue(thread));
        return makeBoolean((NIL != inference_pred) && (NIL != negation_predicate.negation_predicateP(inference_pred, pred, NIL, UNPROVIDED)));
    }

    public static SubLObject inference_negation_inverseP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = cycl_utilities.atomic_sentence_predicate($inference_literal$.getDynamicValue(thread));
        return makeBoolean((NIL != inference_pred) && (NIL != negation_predicate.negation_inverseP(inference_pred, pred, NIL, UNPROVIDED)));
    }

    public static SubLObject with_inference_genl_or_spec_pred_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sense = NIL;
        SubLObject literal = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        literal = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_PREDICATE_FUNCTION, list(DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE, sense), listS(CLET, list(list($inference_literal$, literal), list($inference_sense$, sense)), append(body, NIL)));
    }

    public static SubLObject with_inference_genl_or_spec_inverse_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sense = NIL;
        SubLObject literal = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        literal = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_PREDICATE_FUNCTION, list(DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE, sense), listS(CLET, list(list($inference_literal$, literal), list($inference_sense$, sense)), append(body, NIL)));
    }

    public static SubLObject determine_inference_genl_or_spec_pred_relevance(final SubLObject sense) {
        return $POS.eql(sense) ? $sym9$INFERENCE_GENL_PREDICATE_OF_ : $sym11$INFERENCE_GENL_PREDICATE_;
    }

    public static SubLObject determine_inference_genl_or_spec_inverse_relevance(final SubLObject sense) {
        return $POS.eql(sense) ? $sym10$INFERENCE_GENL_INVERSE_OF_ : $sym12$INFERENCE_GENL_INVERSE_;
    }

    public static SubLObject pred_info_object_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_pred_info_object(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject pred_info_object_p(final SubLObject v_object) {
        return v_object.getClass() == $pred_info_object_native.class ? T : NIL;
    }

    public static SubLObject pred_info_pred(final SubLObject v_object) {
        assert NIL != pred_info_object_p(v_object) : "pred_relevance_macros.pred_info_object_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject pred_info_relevance_function(final SubLObject v_object) {
        assert NIL != pred_info_object_p(v_object) : "pred_relevance_macros.pred_info_object_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_pred_info_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != pred_info_object_p(v_object) : "pred_relevance_macros.pred_info_object_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pred_info_relevance_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != pred_info_object_p(v_object) : "pred_relevance_macros.pred_info_object_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_pred_info_object(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $pred_info_object_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PRED)) {
                _csetf_pred_info_pred(v_new, current_value);
            } else
                if (pcase_var.eql($RELEVANCE_FUNCTION)) {
                    _csetf_pred_info_relevance_function(v_new, current_value);
                } else {
                    Errors.error($str67$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_pred_info_object(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PRED_INFO_OBJECT, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PRED, pred_info_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $RELEVANCE_FUNCTION, pred_info_relevance_function(obj));
        funcall(visitor_fn, obj, $END, MAKE_PRED_INFO_OBJECT, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_pred_info_object_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pred_info_object(obj, visitor_fn);
    }

    public static SubLObject print_pred_info_object(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str73$__PRED_INFO__s__s_, pred_info_pred(v_object), pred_info_relevance_function(v_object));
        return NIL;
    }

    public static SubLObject pred_info_internal(SubLObject pred, SubLObject relevance_function) {
        if (pred == UNPROVIDED) {
            pred = $pred$.getDynamicValue();
        }
        if (relevance_function == UNPROVIDED) {
            relevance_function = $relevant_pred_function$.getDynamicValue();
        }
        final SubLObject pred_info_object = make_pred_info_object(UNPROVIDED);
        _csetf_pred_info_pred(pred_info_object, pred);
        _csetf_pred_info_relevance_function(pred_info_object, relevance_function);
        return pred_info_object;
    }

    public static SubLObject pred_info(SubLObject pred, SubLObject relevance_function) {
        if (pred == UNPROVIDED) {
            pred = $pred$.getDynamicValue();
        }
        if (relevance_function == UNPROVIDED) {
            relevance_function = $relevant_pred_function$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pred_info_internal(pred, relevance_function);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PRED_INFO, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PRED_INFO, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PRED_INFO, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, relevance_function);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && relevance_function.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pred_info_internal(pred, relevance_function)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, relevance_function));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject declare_pred_relevance_macros_file() {
        declareFunction(me, "relevant_pred_is_everything", "RELEVANT-PRED-IS-EVERYTHING", 1, 0, false);
        declareFunction(me, "relevant_pred_is_eq", "RELEVANT-PRED-IS-EQ", 1, 0, false);
        declareFunction(me, "relevant_pred_is_in_list", "RELEVANT-PRED-IS-IN-LIST", 1, 0, false);
        declareFunction(me, "relevant_pred_is_not_in_list", "RELEVANT-PRED-IS-NOT-IN-LIST", 1, 0, false);
        declareFunction(me, "relevant_pred_is_spec_pred", "RELEVANT-PRED-IS-SPEC-PRED", 1, 0, false);
        declareFunction(me, "relevant_pred_is_spec_inverse", "RELEVANT-PRED-IS-SPEC-INVERSE", 1, 0, false);
        declareFunction(me, "relevant_pred_is_spec_pred_or_inverse", "RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE", 1, 0, false);
        declareFunction(me, "relevant_predP", "RELEVANT-PRED?", 1, 0, false);
        declareFunction(me, "all_possibly_relevant_preds", "ALL-POSSIBLY-RELEVANT-PREDS", 0, 0, false);
        declareFunction(me, "pred_relevance_undefined_p", "PRED-RELEVANCE-UNDEFINED-P", 0, 0, false);
        declareFunction(me, "all_preds_are_relevantP", "ALL-PREDS-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "only_specified_pred_is_relevantP", "ONLY-SPECIFIED-PRED-IS-RELEVANT?", 0, 0, false);
        declareFunction(me, "only_specified_predicate_list_is_relevantP", "ONLY-SPECIFIED-PREDICATE-LIST-IS-RELEVANT?", 0, 0, false);
        declareMacro(me, "with_predicate_function", "WITH-PREDICATE-FUNCTION");
        declareMacro(me, "with_all_predicates", "WITH-ALL-PREDICATES");
        declareMacro(me, "with_just_predicate", "WITH-JUST-PREDICATE");
        declareMacro(me, "with_predicate_list", "WITH-PREDICATE-LIST");
        declareMacro(me, "with_predicates_not_in_list", "WITH-PREDICATES-NOT-IN-LIST");
        declareMacro(me, "with_all_spec_predicates", "WITH-ALL-SPEC-PREDICATES");
        declareMacro(me, "with_all_spec_inverses", "WITH-ALL-SPEC-INVERSES");
        declareMacro(me, "with_all_spec_predicates_and_inverses", "WITH-ALL-SPEC-PREDICATES-AND-INVERSES");
        declareMacro(me, "with_pred_and_relevance", "WITH-PRED-AND-RELEVANCE");
        declareMacro(me, "possibly_with_just_predicate", "POSSIBLY-WITH-JUST-PREDICATE");
        declareFunction(me, "possibly_with_just_predicate_determine_function", "POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-FUNCTION", 1, 0, false);
        declareFunction(me, "possibly_with_just_predicate_determine_predicate", "POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-PREDICATE", 1, 0, false);
        declareFunction(me, "spec_preds_are_relevantP", "SPEC-PREDS-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "spec_inverses_are_relevantP", "SPEC-INVERSES-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "spec_preds_and_inverses_are_relevantP", "SPEC-PREDS-AND-INVERSES-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "inference_spec_preds_are_relevantP", "INFERENCE-SPEC-PREDS-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "inference_spec_inverses_are_relevantP", "INFERENCE-SPEC-INVERSES-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "inference_genl_preds_are_relevantP", "INFERENCE-GENL-PREDS-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "inference_genl_inverses_are_relevantP", "INFERENCE-GENL-INVERSES-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "inference_genl_predicate_ofP", "INFERENCE-GENL-PREDICATE-OF?", 1, 0, false);
        declareFunction(me, "inference_genl_predicateP", "INFERENCE-GENL-PREDICATE?", 1, 0, false);
        declareFunction(me, "inference_genl_inverse_ofP", "INFERENCE-GENL-INVERSE-OF?", 1, 0, false);
        declareFunction(me, "inference_genl_inverseP", "INFERENCE-GENL-INVERSE?", 1, 0, false);
        declareFunction(me, "inference_negation_predicateP", "INFERENCE-NEGATION-PREDICATE?", 1, 0, false);
        declareFunction(me, "inference_negation_inverseP", "INFERENCE-NEGATION-INVERSE?", 1, 0, false);
        declareMacro(me, "with_inference_genl_or_spec_pred_relevance", "WITH-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE");
        declareMacro(me, "with_inference_genl_or_spec_inverse_relevance", "WITH-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE");
        declareFunction(me, "determine_inference_genl_or_spec_pred_relevance", "DETERMINE-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE", 1, 0, false);
        declareFunction(me, "determine_inference_genl_or_spec_inverse_relevance", "DETERMINE-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE", 1, 0, false);
        declareFunction(me, "pred_info_object_print_function_trampoline", "PRED-INFO-OBJECT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "pred_info_object_p", "PRED-INFO-OBJECT-P", 1, 0, false);
        new pred_relevance_macros.$pred_info_object_p$UnaryFunction();
        declareFunction(me, "pred_info_pred", "PRED-INFO-PRED", 1, 0, false);
        declareFunction(me, "pred_info_relevance_function", "PRED-INFO-RELEVANCE-FUNCTION", 1, 0, false);
        declareFunction(me, "_csetf_pred_info_pred", "_CSETF-PRED-INFO-PRED", 2, 0, false);
        declareFunction(me, "_csetf_pred_info_relevance_function", "_CSETF-PRED-INFO-RELEVANCE-FUNCTION", 2, 0, false);
        declareFunction(me, "make_pred_info_object", "MAKE-PRED-INFO-OBJECT", 0, 1, false);
        declareFunction(me, "visit_defstruct_pred_info_object", "VISIT-DEFSTRUCT-PRED-INFO-OBJECT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_pred_info_object_method", "VISIT-DEFSTRUCT-OBJECT-PRED-INFO-OBJECT-METHOD", 2, 0, false);
        declareFunction(me, "print_pred_info_object", "PRINT-PRED-INFO-OBJECT", 3, 0, false);
        declareFunction(me, "pred_info_internal", "PRED-INFO-INTERNAL", 0, 2, false);
        declareFunction(me, "pred_info", "PRED-INFO", 0, 2, false);
        return NIL;
    }

    public static SubLObject init_pred_relevance_macros_file() {
        defparameter("*PRED*", NIL);
        defparameter("*RELEVANT-PREDS*", NIL);
        defparameter("*RELEVANT-PRED-FUNCTION*", NIL);
        defconstant("*DTP-PRED-INFO-OBJECT*", PRED_INFO_OBJECT);
        return NIL;
    }

    public static SubLObject setup_pred_relevance_macros_file() {
        SubLSpecialOperatorDeclarations.proclaim($list0);
        register_macro_helper(POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION, POSSIBLY_WITH_JUST_PREDICATE);
        register_macro_helper(POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE, POSSIBLY_WITH_JUST_PREDICATE);
        SubLSpecialOperatorDeclarations.proclaim($list43);
        register_macro_helper(DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE, WITH_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE);
        register_macro_helper(DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE, WITH_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pred_info_object$.getGlobalValue(), symbol_function(PRED_INFO_OBJECT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list60);
        def_csetf(PRED_INFO_PRED, _CSETF_PRED_INFO_PRED);
        def_csetf(PRED_INFO_RELEVANCE_FUNCTION, _CSETF_PRED_INFO_RELEVANCE_FUNCTION);
        identity(PRED_INFO_OBJECT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pred_info_object$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PRED_INFO_OBJECT_METHOD));
        memoization_state.note_memoized_function(PRED_INFO);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pred_relevance_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_pred_relevance_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pred_relevance_macros_file();
    }

    static {
















































































    }

    public static final class $pred_info_object_native extends SubLStructNative {
        public SubLObject $pred;

        public SubLObject $relevance_function;

        private static final SubLStructDeclNative structDecl;

        private $pred_info_object_native() {
            this.$pred = Lisp.NIL;
            this.$relevance_function = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$pred;
        }

        @Override
        public SubLObject getField3() {
            return this.$relevance_function;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$pred = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$relevance_function = value;
        }

        static {
            structDecl = makeStructDeclNative($pred_info_object_native.class, PRED_INFO_OBJECT, PRED_INFO_OBJECT_P, $list54, $list55, new String[]{ "$pred", "$relevance_function" }, $list56, $list57, PRINT_PRED_INFO_OBJECT);
        }
    }

    public static final class $pred_info_object_p$UnaryFunction extends UnaryFunction {
        public $pred_info_object_p$UnaryFunction() {
            super(extractFunctionNamed("PRED-INFO-OBJECT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pred_info_object_p(arg1);
        }
    }
}

/**
 * Total time: 255 ms
 */
