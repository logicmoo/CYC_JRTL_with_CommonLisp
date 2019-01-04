package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pred_relevance_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pred_relevance_macros";
    public static final String myFingerPrint = "8ccd0e6721bdc936becbf3d2cfa92d586e9b76931acc373ed833495408716764";
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1130L)
    public static SubLSymbol $pred$;
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1221L)
    public static SubLSymbol $relevant_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1257L)
    public static SubLSymbol $relevant_pred_function$;
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
    public static SubLSymbol $dtp_pred_info_object$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$RELEVANT_PRED_IS_EVERYTHING;
    private static final SubLSymbol $sym2$RELEVANT_PRED_IS_EQ;
    private static final SubLSymbol $sym3$RELEVANT_PRED_IS_IN_LIST;
    private static final SubLSymbol $sym4$RELEVANT_PRED_IS_NOT_IN_LIST;
    private static final SubLSymbol $sym5$RELEVANT_PRED_IS_SPEC_PRED;
    private static final SubLSymbol $sym6$RELEVANT_PRED_IS_SPEC_INVERSE;
    private static final SubLSymbol $sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE;
    private static final SubLSymbol $sym8$RELEVANT_PRED_WRT_GT_;
    private static final SubLSymbol $sym9$INFERENCE_GENL_PREDICATE_OF_;
    private static final SubLSymbol $sym10$INFERENCE_GENL_INVERSE_OF_;
    private static final SubLSymbol $sym11$INFERENCE_GENL_PREDICATE_;
    private static final SubLSymbol $sym12$INFERENCE_GENL_INVERSE_;
    private static final SubLSymbol $sym13$INFERENCE_NEGATION_PREDICATE_;
    private static final SubLSymbol $kw14$ALL;
    private static final SubLSymbol $kw15$UNABLE_TO_DETERMINE;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$CLET;
    private static final SubLSymbol $sym18$_RELEVANT_PRED_FUNCTION_;
    private static final SubLSymbol $sym19$WITH_PREDICATE_FUNCTION;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$_PRED_;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$_RELEVANT_PREDS_;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$PCASE;
    private static final SubLSymbol $sym33$WITH_JUST_PREDICATE;
    private static final SubLSymbol $sym34$WITH_ALL_SPEC_PREDICATES;
    private static final SubLSymbol $sym35$WITH_ALL_SPEC_INVERSES;
    private static final SubLSymbol $sym36$WITH_ALL_SPEC_PREDICATES_AND_INVERSES;
    private static final SubLSymbol $sym37$PROGN;
    private static final SubLSymbol $sym38$PREDICATE_VAR;
    private static final SubLSymbol $sym39$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION;
    private static final SubLSymbol $sym40$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE;
    private static final SubLSymbol $sym41$POSSIBLY_WITH_JUST_PREDICATE;
    private static final SubLSymbol $sym42$FORT_P;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE;
    private static final SubLSymbol $sym46$_INFERENCE_LITERAL_;
    private static final SubLSymbol $sym47$_INFERENCE_SENSE_;
    private static final SubLSymbol $sym48$DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE;
    private static final SubLSymbol $sym49$WITH_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE;
    private static final SubLSymbol $kw50$POS;
    private static final SubLSymbol $sym51$WITH_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE;
    private static final SubLSymbol $sym52$PRED_INFO_OBJECT;
    private static final SubLSymbol $sym53$PRED_INFO_OBJECT_P;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$PRINT_PRED_INFO_OBJECT;
    private static final SubLSymbol $sym59$PRED_INFO_OBJECT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$PRED_INFO_PRED;
    private static final SubLSymbol $sym62$_CSETF_PRED_INFO_PRED;
    private static final SubLSymbol $sym63$PRED_INFO_RELEVANCE_FUNCTION;
    private static final SubLSymbol $sym64$_CSETF_PRED_INFO_RELEVANCE_FUNCTION;
    private static final SubLSymbol $kw65$PRED;
    private static final SubLSymbol $kw66$RELEVANCE_FUNCTION;
    private static final SubLString $str67$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw68$BEGIN;
    private static final SubLSymbol $sym69$MAKE_PRED_INFO_OBJECT;
    private static final SubLSymbol $kw70$SLOT;
    private static final SubLSymbol $kw71$END;
    private static final SubLSymbol $sym72$VISIT_DEFSTRUCT_OBJECT_PRED_INFO_OBJECT_METHOD;
    private static final SubLString $str73$__PRED_INFO__s__s_;
    private static final SubLSymbol $sym74$PRED_INFO;
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1614L)
    public static SubLObject relevant_pred_is_everything(final SubLObject pred) {
        return (SubLObject)pred_relevance_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1693L)
    public static SubLObject relevant_pred_is_eq(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eql(pred_relevance_macros.$pred$.getDynamicValue(thread), pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1764L)
    public static SubLObject relevant_pred_is_in_list(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(pred, pred_relevance_macros.$relevant_preds$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1854L)
    public static SubLObject relevant_pred_is_not_in_list(final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pred_relevance_macros.NIL == relevant_pred_is_in_list(pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1955L)
    public static SubLObject relevant_pred_is_spec_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pred_relevance_macros.NIL != relevant_pred_is_eq(pred) || pred_relevance_macros.NIL != predicate_relevance_cache.cached_spec_predP(pred_relevance_macros.$pred$.getDynamicValue(thread), pred, (SubLObject)pred_relevance_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 2143L)
    public static SubLObject relevant_pred_is_spec_inverse(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return predicate_relevance_cache.cached_spec_inverseP(pred_relevance_macros.$pred$.getDynamicValue(thread), pred, (SubLObject)pred_relevance_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 2241L)
    public static SubLObject relevant_pred_is_spec_pred_or_inverse(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pred_relevance_macros.NIL != relevant_pred_is_eq(pred) || pred_relevance_macros.NIL != predicate_relevance_cache.cached_spec_predP(pred_relevance_macros.$pred$.getDynamicValue(thread), pred, (SubLObject)pred_relevance_macros.UNPROVIDED) || pred_relevance_macros.NIL != predicate_relevance_cache.cached_spec_inverseP(pred_relevance_macros.$pred$.getDynamicValue(thread), pred, (SubLObject)pred_relevance_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 2480L)
    public static SubLObject relevant_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pred_relevance_macros.NIL != pred_relevance_undefined_p()) {
            return (SubLObject)pred_relevance_macros.T;
        }
        final SubLObject pcase_var = pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym1$RELEVANT_PRED_IS_EVERYTHING)) {
            return relevant_pred_is_everything(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym2$RELEVANT_PRED_IS_EQ)) {
            return relevant_pred_is_eq(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym3$RELEVANT_PRED_IS_IN_LIST)) {
            return relevant_pred_is_in_list(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym4$RELEVANT_PRED_IS_NOT_IN_LIST)) {
            return relevant_pred_is_not_in_list(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym5$RELEVANT_PRED_IS_SPEC_PRED)) {
            return relevant_pred_is_spec_pred(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym6$RELEVANT_PRED_IS_SPEC_INVERSE)) {
            return relevant_pred_is_spec_inverse(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE)) {
            return relevant_pred_is_spec_pred_or_inverse(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym8$RELEVANT_PRED_WRT_GT_)) {
            return ghl_link_iterators.relevant_pred_wrt_gtP(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym9$INFERENCE_GENL_PREDICATE_OF_)) {
            return inference_genl_predicate_ofP(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym10$INFERENCE_GENL_INVERSE_OF_)) {
            return inference_genl_inverse_ofP(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym11$INFERENCE_GENL_PREDICATE_)) {
            return inference_genl_predicateP(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym12$INFERENCE_GENL_INVERSE_)) {
            return inference_genl_inverseP(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym13$INFERENCE_NEGATION_PREDICATE_)) {
            return inference_negation_predicateP(pred);
        }
        return Functions.funcall(pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread), pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 3901L)
    public static SubLObject all_possibly_relevant_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pred_relevance_macros.NIL != pred_relevance_undefined_p()) {
            return (SubLObject)pred_relevance_macros.$kw14$ALL;
        }
        final SubLObject pred = pred_relevance_macros.$pred$.getDynamicValue(thread);
        final SubLObject pcase_var = pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym1$RELEVANT_PRED_IS_EVERYTHING)) {
            return (SubLObject)pred_relevance_macros.$kw14$ALL;
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym2$RELEVANT_PRED_IS_EQ)) {
            return (SubLObject)ConsesLow.list(pred);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym3$RELEVANT_PRED_IS_IN_LIST)) {
            return pred_relevance_macros.$relevant_preds$.getDynamicValue(thread);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym4$RELEVANT_PRED_IS_NOT_IN_LIST)) {
            return (SubLObject)pred_relevance_macros.$kw15$UNABLE_TO_DETERMINE;
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym5$RELEVANT_PRED_IS_SPEC_PRED)) {
            return genl_predicates.all_spec_preds(pred, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym6$RELEVANT_PRED_IS_SPEC_INVERSE)) {
            return genl_predicates.all_spec_inverses(pred, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE)) {
            return ConsesLow.append(genl_predicates.all_spec_preds(pred, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED), genl_predicates.all_spec_inverses(pred, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED));
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym8$RELEVANT_PRED_WRT_GT_)) {
            return ghl_link_iterators.all_possibly_relevant_gt_preds();
        }
        if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym9$INFERENCE_GENL_PREDICATE_OF_)) {
            final SubLObject inference_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.UNPROVIDED);
            if (pred_relevance_macros.NIL != inference_pred) {
                return Sequences.remove(inference_pred, genl_predicates.all_spec_preds(inference_pred, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED), (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED);
            }
            return (SubLObject)pred_relevance_macros.$kw14$ALL;
        }
        else if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym10$INFERENCE_GENL_INVERSE_OF_)) {
            final SubLObject inference_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.UNPROVIDED);
            if (pred_relevance_macros.NIL != inference_pred) {
                return Sequences.remove(inference_pred, genl_predicates.all_spec_inverses(inference_pred, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED), (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED);
            }
            return (SubLObject)pred_relevance_macros.$kw14$ALL;
        }
        else if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym11$INFERENCE_GENL_PREDICATE_)) {
            final SubLObject inference_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.UNPROVIDED);
            if (pred_relevance_macros.NIL != inference_pred) {
                return Sequences.remove(inference_pred, genl_predicates.all_genl_preds(inference_pred, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED), (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED);
            }
            return (SubLObject)pred_relevance_macros.$kw14$ALL;
        }
        else if (pcase_var.eql((SubLObject)pred_relevance_macros.$sym12$INFERENCE_GENL_INVERSE_)) {
            final SubLObject inference_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.UNPROVIDED);
            if (pred_relevance_macros.NIL != inference_pred) {
                return Sequences.remove(inference_pred, genl_predicates.all_genl_inverses(inference_pred, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED), (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED);
            }
            return (SubLObject)pred_relevance_macros.$kw14$ALL;
        }
        else {
            if (!pcase_var.eql((SubLObject)pred_relevance_macros.$sym13$INFERENCE_NEGATION_PREDICATE_)) {
                return (SubLObject)pred_relevance_macros.$kw15$UNABLE_TO_DETERMINE;
            }
            final SubLObject inference_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.UNPROVIDED);
            if (pred_relevance_macros.NIL != inference_pred) {
                return Sequences.remove(inference_pred, negation_predicate.all_negation_preds(inference_pred, (SubLObject)pred_relevance_macros.UNPROVIDED), (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED, (SubLObject)pred_relevance_macros.UNPROVIDED);
            }
            return (SubLObject)pred_relevance_macros.$kw14$ALL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 6289L)
    public static SubLObject pred_relevance_undefined_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pred_relevance_macros.NIL == pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 6377L)
    public static SubLObject all_preds_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pred_relevance_macros.NIL != pred_relevance_undefined_p() || pred_relevance_macros.$sym1$RELEVANT_PRED_IS_EVERYTHING == pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 6528L)
    public static SubLObject only_specified_pred_is_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)pred_relevance_macros.$sym2$RELEVANT_PRED_IS_EQ, pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 6640L)
    public static SubLObject only_specified_predicate_list_is_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)pred_relevance_macros.$sym3$RELEVANT_PRED_IS_IN_LIST, pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 6767L)
    public static SubLObject with_predicate_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)pred_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list16);
        function = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym18$_RELEVANT_PRED_FUNCTION_, function)), ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 7053L)
    public static SubLObject with_all_predicates(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym19$WITH_PREDICATE_FUNCTION, (SubLObject)pred_relevance_macros.$list20, ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 7224L)
    public static SubLObject with_just_predicate(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = (SubLObject)pred_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list21);
        predicate = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym19$WITH_PREDICATE_FUNCTION, (SubLObject)pred_relevance_macros.$list22, (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym23$_PRED_, predicate)), ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 7440L)
    public static SubLObject with_predicate_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicates = (SubLObject)pred_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list24);
        predicates = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym19$WITH_PREDICATE_FUNCTION, (SubLObject)pred_relevance_macros.$list25, (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym26$_RELEVANT_PREDS_, predicates)), ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 7685L)
    public static SubLObject with_predicates_not_in_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicates = (SubLObject)pred_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list24);
        predicates = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym19$WITH_PREDICATE_FUNCTION, (SubLObject)pred_relevance_macros.$list27, (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym26$_RELEVANT_PREDS_, predicates)), ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 7933L)
    public static SubLObject with_all_spec_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = (SubLObject)pred_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list21);
        predicate = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym19$WITH_PREDICATE_FUNCTION, (SubLObject)pred_relevance_macros.$list28, (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym23$_PRED_, predicate)), ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 8174L)
    public static SubLObject with_all_spec_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = (SubLObject)pred_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list21);
        predicate = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym19$WITH_PREDICATE_FUNCTION, (SubLObject)pred_relevance_macros.$list29, (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym23$_PRED_, predicate)), ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 8414L)
    public static SubLObject with_all_spec_predicates_and_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = (SubLObject)pred_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list21);
        predicate = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym19$WITH_PREDICATE_FUNCTION, (SubLObject)pred_relevance_macros.$list30, (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym23$_PRED_, predicate)), ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 8706L)
    public static SubLObject with_pred_and_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = (SubLObject)pred_relevance_macros.NIL;
        SubLObject relevance_function = (SubLObject)pred_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list31);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list31);
        relevance_function = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym32$PCASE, relevance_function, (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym2$RELEVANT_PRED_IS_EQ, (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym33$WITH_JUST_PREDICATE, predicate, ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym5$RELEVANT_PRED_IS_SPEC_PRED, (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym34$WITH_ALL_SPEC_PREDICATES, predicate, ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym6$RELEVANT_PRED_IS_SPEC_INVERSE, (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym35$WITH_ALL_SPEC_INVERSES, predicate, ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE, (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym36$WITH_ALL_SPEC_PREDICATES_AND_INVERSES, predicate, ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 9272L)
    public static SubLObject possibly_with_just_predicate(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = (SubLObject)pred_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list21);
        predicate = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (pred_relevance_macros.NIL == predicate) {
            return reader.bq_cons((SubLObject)pred_relevance_macros.$sym37$PROGN, ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL));
        }
        final SubLObject predicate_var = (SubLObject)pred_relevance_macros.$sym38$PREDICATE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(predicate_var, predicate)), (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym19$WITH_PREDICATE_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym39$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION, predicate_var), (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym23$_PRED_, (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym40$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE, predicate_var))), ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 9834L)
    public static SubLObject possibly_with_just_predicate_determine_function(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pred_relevance_macros.NIL == predicate) {
            return pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread);
        }
        assert pred_relevance_macros.NIL != forts.fort_p(predicate) : predicate;
        return (SubLObject)pred_relevance_macros.$sym2$RELEVANT_PRED_IS_EQ;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 10087L)
    public static SubLObject possibly_with_just_predicate_determine_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (pred_relevance_macros.NIL != predicate) ? predicate : pred_relevance_macros.$pred$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 10614L)
    public static SubLObject spec_preds_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.$sym5$RELEVANT_PRED_IS_SPEC_PRED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 10728L)
    public static SubLObject spec_inverses_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.$sym6$RELEVANT_PRED_IS_SPEC_INVERSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 10848L)
    public static SubLObject spec_preds_and_inverses_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.$sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 10986L)
    public static SubLObject inference_spec_preds_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.$sym9$INFERENCE_GENL_PREDICATE_OF_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 11112L)
    public static SubLObject inference_spec_inverses_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.$sym10$INFERENCE_GENL_INVERSE_OF_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 11239L)
    public static SubLObject inference_genl_preds_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.$sym11$INFERENCE_GENL_PREDICATE_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 11362L)
    public static SubLObject inference_genl_inverses_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(pred_relevance_macros.$relevant_pred_function$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.$sym12$INFERENCE_GENL_INVERSE_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 11486L)
    public static SubLObject inference_genl_predicate_ofP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(pred_relevance_macros.NIL != inference_pred && !pred.eql(inference_pred) && pred_relevance_macros.NIL != predicate_relevance_cache.cached_spec_predP(inference_pred, pred, (SubLObject)pred_relevance_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 11862L)
    public static SubLObject inference_genl_predicateP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(pred_relevance_macros.NIL != inference_pred && !pred.eql(inference_pred) && pred_relevance_macros.NIL != predicate_relevance_cache.cached_genl_predP(inference_pred, pred, (SubLObject)pred_relevance_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 12104L)
    public static SubLObject inference_genl_inverse_ofP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(pred_relevance_macros.NIL != inference_pred && !pred.eql(inference_pred) && pred_relevance_macros.NIL != predicate_relevance_cache.cached_spec_inverseP(inference_pred, pred, (SubLObject)pred_relevance_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 12395L)
    public static SubLObject inference_genl_inverseP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = el_utilities.literal_predicate(control_vars.$inference_literal$.getDynamicValue(thread), (SubLObject)pred_relevance_macros.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(pred_relevance_macros.NIL != inference_pred && !pred.eql(inference_pred) && pred_relevance_macros.NIL != predicate_relevance_cache.cached_genl_inverseP(inference_pred, pred, (SubLObject)pred_relevance_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 12638L)
    public static SubLObject inference_negation_predicateP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = cycl_utilities.atomic_sentence_predicate(control_vars.$inference_literal$.getDynamicValue(thread));
        return (SubLObject)SubLObjectFactory.makeBoolean(pred_relevance_macros.NIL != inference_pred && pred_relevance_macros.NIL != negation_predicate.negation_predicateP(inference_pred, pred, (SubLObject)pred_relevance_macros.NIL, (SubLObject)pred_relevance_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 12857L)
    public static SubLObject inference_negation_inverseP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_pred = cycl_utilities.atomic_sentence_predicate(control_vars.$inference_literal$.getDynamicValue(thread));
        return (SubLObject)SubLObjectFactory.makeBoolean(pred_relevance_macros.NIL != inference_pred && pred_relevance_macros.NIL != negation_predicate.negation_inverseP(inference_pred, pred, (SubLObject)pred_relevance_macros.NIL, (SubLObject)pred_relevance_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 13072L)
    public static SubLObject with_inference_genl_or_spec_pred_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sense = (SubLObject)pred_relevance_macros.NIL;
        SubLObject literal = (SubLObject)pred_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list44);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list44);
        literal = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym19$WITH_PREDICATE_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym45$DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE, sense), (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym46$_INFERENCE_LITERAL_, literal), (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym47$_INFERENCE_SENSE_, sense)), ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 13408L)
    public static SubLObject with_inference_genl_or_spec_inverse_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sense = (SubLObject)pred_relevance_macros.NIL;
        SubLObject literal = (SubLObject)pred_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list44);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pred_relevance_macros.$list44);
        literal = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym19$WITH_PREDICATE_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym48$DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE, sense), (SubLObject)ConsesLow.listS((SubLObject)pred_relevance_macros.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym46$_INFERENCE_LITERAL_, literal), (SubLObject)ConsesLow.list((SubLObject)pred_relevance_macros.$sym47$_INFERENCE_SENSE_, sense)), ConsesLow.append(body, (SubLObject)pred_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 13680L)
    public static SubLObject determine_inference_genl_or_spec_pred_relevance(final SubLObject sense) {
        return (SubLObject)(pred_relevance_macros.$kw50$POS.eql(sense) ? pred_relevance_macros.$sym9$INFERENCE_GENL_PREDICATE_OF_ : pred_relevance_macros.$sym11$INFERENCE_GENL_PREDICATE_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 13911L)
    public static SubLObject determine_inference_genl_or_spec_inverse_relevance(final SubLObject sense) {
        return (SubLObject)(pred_relevance_macros.$kw50$POS.eql(sense) ? pred_relevance_macros.$sym10$INFERENCE_GENL_INVERSE_OF_ : pred_relevance_macros.$sym12$INFERENCE_GENL_INVERSE_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
    public static SubLObject pred_info_object_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_pred_info_object(v_object, stream, (SubLObject)pred_relevance_macros.ZERO_INTEGER);
        return (SubLObject)pred_relevance_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
    public static SubLObject pred_info_object_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $pred_info_object_native.class) ? pred_relevance_macros.T : pred_relevance_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
    public static SubLObject pred_info_pred(final SubLObject v_object) {
        assert pred_relevance_macros.NIL != pred_info_object_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
    public static SubLObject pred_info_relevance_function(final SubLObject v_object) {
        assert pred_relevance_macros.NIL != pred_info_object_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
    public static SubLObject _csetf_pred_info_pred(final SubLObject v_object, final SubLObject value) {
        assert pred_relevance_macros.NIL != pred_info_object_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
    public static SubLObject _csetf_pred_info_relevance_function(final SubLObject v_object, final SubLObject value) {
        assert pred_relevance_macros.NIL != pred_info_object_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
    public static SubLObject make_pred_info_object(SubLObject arglist) {
        if (arglist == pred_relevance_macros.UNPROVIDED) {
            arglist = (SubLObject)pred_relevance_macros.NIL;
        }
        final SubLObject v_new = (SubLObject)new $pred_info_object_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pred_relevance_macros.NIL, next = arglist; pred_relevance_macros.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pred_relevance_macros.$kw65$PRED)) {
                _csetf_pred_info_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pred_relevance_macros.$kw66$RELEVANCE_FUNCTION)) {
                _csetf_pred_info_relevance_function(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pred_relevance_macros.$str67$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
    public static SubLObject visit_defstruct_pred_info_object(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pred_relevance_macros.$kw68$BEGIN, (SubLObject)pred_relevance_macros.$sym69$MAKE_PRED_INFO_OBJECT, (SubLObject)pred_relevance_macros.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pred_relevance_macros.$kw70$SLOT, (SubLObject)pred_relevance_macros.$kw65$PRED, pred_info_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pred_relevance_macros.$kw70$SLOT, (SubLObject)pred_relevance_macros.$kw66$RELEVANCE_FUNCTION, pred_info_relevance_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pred_relevance_macros.$kw71$END, (SubLObject)pred_relevance_macros.$sym69$MAKE_PRED_INFO_OBJECT, (SubLObject)pred_relevance_macros.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
    public static SubLObject visit_defstruct_object_pred_info_object_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pred_info_object(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14495L)
    public static SubLObject print_pred_info_object(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)pred_relevance_macros.$str73$__PRED_INFO__s__s_, pred_info_pred(v_object), pred_info_relevance_function(v_object));
        return (SubLObject)pred_relevance_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14739L)
    public static SubLObject pred_info_internal(SubLObject pred, SubLObject relevance_function) {
        if (pred == pred_relevance_macros.UNPROVIDED) {
            pred = pred_relevance_macros.$pred$.getDynamicValue();
        }
        if (relevance_function == pred_relevance_macros.UNPROVIDED) {
            relevance_function = pred_relevance_macros.$relevant_pred_function$.getDynamicValue();
        }
        final SubLObject pred_info_object = make_pred_info_object((SubLObject)pred_relevance_macros.UNPROVIDED);
        _csetf_pred_info_pred(pred_info_object, pred);
        _csetf_pred_info_relevance_function(pred_info_object, relevance_function);
        return pred_info_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14739L)
    public static SubLObject pred_info(SubLObject pred, SubLObject relevance_function) {
        if (pred == pred_relevance_macros.UNPROVIDED) {
            pred = pred_relevance_macros.$pred$.getDynamicValue();
        }
        if (relevance_function == pred_relevance_macros.UNPROVIDED) {
            relevance_function = pred_relevance_macros.$relevant_pred_function$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pred_relevance_macros.NIL;
        if (pred_relevance_macros.NIL == v_memoization_state) {
            return pred_info_internal(pred, relevance_function);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pred_relevance_macros.$sym74$PRED_INFO, (SubLObject)pred_relevance_macros.UNPROVIDED);
        if (pred_relevance_macros.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pred_relevance_macros.$sym74$PRED_INFO, (SubLObject)pred_relevance_macros.TWO_INTEGER, (SubLObject)pred_relevance_macros.NIL, (SubLObject)pred_relevance_macros.EQL, (SubLObject)pred_relevance_macros.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pred_relevance_macros.$sym74$PRED_INFO, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, relevance_function);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pred_relevance_macros.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pred_relevance_macros.NIL;
            collision = cdolist_list_var.first();
            while (pred_relevance_macros.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred_relevance_macros.NIL != cached_args && pred_relevance_macros.NIL == cached_args.rest() && relevance_function.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pred_info_internal(pred, relevance_function)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, relevance_function));
        return memoization_state.caching_results(results3);
    }
    
    public static SubLObject declare_pred_relevance_macros_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "relevant_pred_is_everything", "RELEVANT-PRED-IS-EVERYTHING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "relevant_pred_is_eq", "RELEVANT-PRED-IS-EQ", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "relevant_pred_is_in_list", "RELEVANT-PRED-IS-IN-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "relevant_pred_is_not_in_list", "RELEVANT-PRED-IS-NOT-IN-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "relevant_pred_is_spec_pred", "RELEVANT-PRED-IS-SPEC-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "relevant_pred_is_spec_inverse", "RELEVANT-PRED-IS-SPEC-INVERSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "relevant_pred_is_spec_pred_or_inverse", "RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "relevant_predP", "RELEVANT-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "all_possibly_relevant_preds", "ALL-POSSIBLY-RELEVANT-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "pred_relevance_undefined_p", "PRED-RELEVANCE-UNDEFINED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "all_preds_are_relevantP", "ALL-PREDS-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "only_specified_pred_is_relevantP", "ONLY-SPECIFIED-PRED-IS-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "only_specified_predicate_list_is_relevantP", "ONLY-SPECIFIED-PREDICATE-LIST-IS-RELEVANT?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "with_predicate_function", "WITH-PREDICATE-FUNCTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "with_all_predicates", "WITH-ALL-PREDICATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "with_just_predicate", "WITH-JUST-PREDICATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "with_predicate_list", "WITH-PREDICATE-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "with_predicates_not_in_list", "WITH-PREDICATES-NOT-IN-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "with_all_spec_predicates", "WITH-ALL-SPEC-PREDICATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "with_all_spec_inverses", "WITH-ALL-SPEC-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "with_all_spec_predicates_and_inverses", "WITH-ALL-SPEC-PREDICATES-AND-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "with_pred_and_relevance", "WITH-PRED-AND-RELEVANCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "possibly_with_just_predicate", "POSSIBLY-WITH-JUST-PREDICATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "possibly_with_just_predicate_determine_function", "POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "possibly_with_just_predicate_determine_predicate", "POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "spec_preds_are_relevantP", "SPEC-PREDS-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "spec_inverses_are_relevantP", "SPEC-INVERSES-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "spec_preds_and_inverses_are_relevantP", "SPEC-PREDS-AND-INVERSES-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "inference_spec_preds_are_relevantP", "INFERENCE-SPEC-PREDS-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "inference_spec_inverses_are_relevantP", "INFERENCE-SPEC-INVERSES-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "inference_genl_preds_are_relevantP", "INFERENCE-GENL-PREDS-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "inference_genl_inverses_are_relevantP", "INFERENCE-GENL-INVERSES-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "inference_genl_predicate_ofP", "INFERENCE-GENL-PREDICATE-OF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "inference_genl_predicateP", "INFERENCE-GENL-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "inference_genl_inverse_ofP", "INFERENCE-GENL-INVERSE-OF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "inference_genl_inverseP", "INFERENCE-GENL-INVERSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "inference_negation_predicateP", "INFERENCE-NEGATION-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "inference_negation_inverseP", "INFERENCE-NEGATION-INVERSE?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "with_inference_genl_or_spec_pred_relevance", "WITH-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pred_relevance_macros", "with_inference_genl_or_spec_inverse_relevance", "WITH-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "determine_inference_genl_or_spec_pred_relevance", "DETERMINE-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "determine_inference_genl_or_spec_inverse_relevance", "DETERMINE-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "pred_info_object_print_function_trampoline", "PRED-INFO-OBJECT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "pred_info_object_p", "PRED-INFO-OBJECT-P", 1, 0, false);
        new $pred_info_object_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "pred_info_pred", "PRED-INFO-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "pred_info_relevance_function", "PRED-INFO-RELEVANCE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "_csetf_pred_info_pred", "_CSETF-PRED-INFO-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "_csetf_pred_info_relevance_function", "_CSETF-PRED-INFO-RELEVANCE-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "make_pred_info_object", "MAKE-PRED-INFO-OBJECT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "visit_defstruct_pred_info_object", "VISIT-DEFSTRUCT-PRED-INFO-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "visit_defstruct_object_pred_info_object_method", "VISIT-DEFSTRUCT-OBJECT-PRED-INFO-OBJECT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "print_pred_info_object", "PRINT-PRED-INFO-OBJECT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "pred_info_internal", "PRED-INFO-INTERNAL", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pred_relevance_macros", "pred_info", "PRED-INFO", 0, 2, false);
        return (SubLObject)pred_relevance_macros.NIL;
    }
    
    public static SubLObject init_pred_relevance_macros_file() {
        pred_relevance_macros.$pred$ = SubLFiles.defparameter("*PRED*", (SubLObject)pred_relevance_macros.NIL);
        pred_relevance_macros.$relevant_preds$ = SubLFiles.defparameter("*RELEVANT-PREDS*", (SubLObject)pred_relevance_macros.NIL);
        pred_relevance_macros.$relevant_pred_function$ = SubLFiles.defparameter("*RELEVANT-PRED-FUNCTION*", (SubLObject)pred_relevance_macros.NIL);
        pred_relevance_macros.$dtp_pred_info_object$ = SubLFiles.defconstant("*DTP-PRED-INFO-OBJECT*", (SubLObject)pred_relevance_macros.$sym52$PRED_INFO_OBJECT);
        return (SubLObject)pred_relevance_macros.NIL;
    }
    
    public static SubLObject setup_pred_relevance_macros_file() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pred_relevance_macros.$list0);
        access_macros.register_macro_helper((SubLObject)pred_relevance_macros.$sym39$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION, (SubLObject)pred_relevance_macros.$sym41$POSSIBLY_WITH_JUST_PREDICATE);
        access_macros.register_macro_helper((SubLObject)pred_relevance_macros.$sym40$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE, (SubLObject)pred_relevance_macros.$sym41$POSSIBLY_WITH_JUST_PREDICATE);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pred_relevance_macros.$list43);
        access_macros.register_macro_helper((SubLObject)pred_relevance_macros.$sym45$DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE, (SubLObject)pred_relevance_macros.$sym49$WITH_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE);
        access_macros.register_macro_helper((SubLObject)pred_relevance_macros.$sym48$DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE, (SubLObject)pred_relevance_macros.$sym51$WITH_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pred_relevance_macros.$dtp_pred_info_object$.getGlobalValue(), Symbols.symbol_function((SubLObject)pred_relevance_macros.$sym59$PRED_INFO_OBJECT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pred_relevance_macros.$list60);
        Structures.def_csetf((SubLObject)pred_relevance_macros.$sym61$PRED_INFO_PRED, (SubLObject)pred_relevance_macros.$sym62$_CSETF_PRED_INFO_PRED);
        Structures.def_csetf((SubLObject)pred_relevance_macros.$sym63$PRED_INFO_RELEVANCE_FUNCTION, (SubLObject)pred_relevance_macros.$sym64$_CSETF_PRED_INFO_RELEVANCE_FUNCTION);
        Equality.identity((SubLObject)pred_relevance_macros.$sym52$PRED_INFO_OBJECT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pred_relevance_macros.$dtp_pred_info_object$.getGlobalValue(), Symbols.symbol_function((SubLObject)pred_relevance_macros.$sym72$VISIT_DEFSTRUCT_OBJECT_PRED_INFO_OBJECT_METHOD));
        memoization_state.note_memoized_function((SubLObject)pred_relevance_macros.$sym74$PRED_INFO);
        return (SubLObject)pred_relevance_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_pred_relevance_macros_file();
    }
    
    public void initializeVariables() {
        init_pred_relevance_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_pred_relevance_macros_file();
    }
    
    static {
        me = (SubLFile)new pred_relevance_macros();
        pred_relevance_macros.$pred$ = null;
        pred_relevance_macros.$relevant_preds$ = null;
        pred_relevance_macros.$relevant_pred_function$ = null;
        pred_relevance_macros.$dtp_pred_info_object$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EVERYTHING"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EQ"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-IN-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-NOT-IN-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE"));
        $sym1$RELEVANT_PRED_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EVERYTHING");
        $sym2$RELEVANT_PRED_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EQ");
        $sym3$RELEVANT_PRED_IS_IN_LIST = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-IN-LIST");
        $sym4$RELEVANT_PRED_IS_NOT_IN_LIST = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-NOT-IN-LIST");
        $sym5$RELEVANT_PRED_IS_SPEC_PRED = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
        $sym6$RELEVANT_PRED_IS_SPEC_INVERSE = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
        $sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE");
        $sym8$RELEVANT_PRED_WRT_GT_ = SubLObjectFactory.makeSymbol("RELEVANT-PRED-WRT-GT?");
        $sym9$INFERENCE_GENL_PREDICATE_OF_ = SubLObjectFactory.makeSymbol("INFERENCE-GENL-PREDICATE-OF?");
        $sym10$INFERENCE_GENL_INVERSE_OF_ = SubLObjectFactory.makeSymbol("INFERENCE-GENL-INVERSE-OF?");
        $sym11$INFERENCE_GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("INFERENCE-GENL-PREDICATE?");
        $sym12$INFERENCE_GENL_INVERSE_ = SubLObjectFactory.makeSymbol("INFERENCE-GENL-INVERSE?");
        $sym13$INFERENCE_NEGATION_PREDICATE_ = SubLObjectFactory.makeSymbol("INFERENCE-NEGATION-PREDICATE?");
        $kw14$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw15$UNABLE_TO_DETERMINE = SubLObjectFactory.makeKeyword("UNABLE-TO-DETERMINE");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym17$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym18$_RELEVANT_PRED_FUNCTION_ = SubLObjectFactory.makeSymbol("*RELEVANT-PRED-FUNCTION*");
        $sym19$WITH_PREDICATE_FUNCTION = SubLObjectFactory.makeSymbol("WITH-PREDICATE-FUNCTION");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EVERYTHING"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EQ"));
        $sym23$_PRED_ = SubLObjectFactory.makeSymbol("*PRED*");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATES"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-IN-LIST"));
        $sym26$_RELEVANT_PREDS_ = SubLObjectFactory.makeSymbol("*RELEVANT-PREDS*");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-NOT-IN-LIST"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANCE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym32$PCASE = SubLObjectFactory.makeSymbol("PCASE");
        $sym33$WITH_JUST_PREDICATE = SubLObjectFactory.makeSymbol("WITH-JUST-PREDICATE");
        $sym34$WITH_ALL_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("WITH-ALL-SPEC-PREDICATES");
        $sym35$WITH_ALL_SPEC_INVERSES = SubLObjectFactory.makeSymbol("WITH-ALL-SPEC-INVERSES");
        $sym36$WITH_ALL_SPEC_PREDICATES_AND_INVERSES = SubLObjectFactory.makeSymbol("WITH-ALL-SPEC-PREDICATES-AND-INVERSES");
        $sym37$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym38$PREDICATE_VAR = SubLObjectFactory.makeUninternedSymbol("PREDICATE-VAR");
        $sym39$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-FUNCTION");
        $sym40$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-PREDICATE");
        $sym41$POSSIBLY_WITH_JUST_PREDICATE = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-JUST-PREDICATE");
        $sym42$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-PREDS-ARE-RELEVANT?"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-INVERSES-ARE-RELEVANT?"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-PREDS-AND-INVERSES-ARE-RELEVANT?"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SPEC-PREDS-ARE-RELEVANT?"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SPEC-INVERSES-ARE-RELEVANT?"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-GENL-PREDS-ARE-RELEVANT?"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-GENL-INVERSES-ARE-RELEVANT?"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym45$DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE = SubLObjectFactory.makeSymbol("DETERMINE-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE");
        $sym46$_INFERENCE_LITERAL_ = SubLObjectFactory.makeSymbol("*INFERENCE-LITERAL*");
        $sym47$_INFERENCE_SENSE_ = SubLObjectFactory.makeSymbol("*INFERENCE-SENSE*");
        $sym48$DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE = SubLObjectFactory.makeSymbol("DETERMINE-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE");
        $sym49$WITH_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE = SubLObjectFactory.makeSymbol("WITH-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE");
        $kw50$POS = SubLObjectFactory.makeKeyword("POS");
        $sym51$WITH_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE = SubLObjectFactory.makeSymbol("WITH-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE");
        $sym52$PRED_INFO_OBJECT = SubLObjectFactory.makeSymbol("PRED-INFO-OBJECT");
        $sym53$PRED_INFO_OBJECT_P = SubLObjectFactory.makeSymbol("PRED-INFO-OBJECT-P");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANCE-FUNCTION"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("RELEVANCE-FUNCTION"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-INFO-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-INFO-RELEVANCE-FUNCTION"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PRED-INFO-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PRED-INFO-RELEVANCE-FUNCTION"));
        $sym58$PRINT_PRED_INFO_OBJECT = SubLObjectFactory.makeSymbol("PRINT-PRED-INFO-OBJECT");
        $sym59$PRED_INFO_OBJECT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PRED-INFO-OBJECT-PRINT-FUNCTION-TRAMPOLINE");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-INFO-OBJECT-P"));
        $sym61$PRED_INFO_PRED = SubLObjectFactory.makeSymbol("PRED-INFO-PRED");
        $sym62$_CSETF_PRED_INFO_PRED = SubLObjectFactory.makeSymbol("_CSETF-PRED-INFO-PRED");
        $sym63$PRED_INFO_RELEVANCE_FUNCTION = SubLObjectFactory.makeSymbol("PRED-INFO-RELEVANCE-FUNCTION");
        $sym64$_CSETF_PRED_INFO_RELEVANCE_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-PRED-INFO-RELEVANCE-FUNCTION");
        $kw65$PRED = SubLObjectFactory.makeKeyword("PRED");
        $kw66$RELEVANCE_FUNCTION = SubLObjectFactory.makeKeyword("RELEVANCE-FUNCTION");
        $str67$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw68$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym69$MAKE_PRED_INFO_OBJECT = SubLObjectFactory.makeSymbol("MAKE-PRED-INFO-OBJECT");
        $kw70$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw71$END = SubLObjectFactory.makeKeyword("END");
        $sym72$VISIT_DEFSTRUCT_OBJECT_PRED_INFO_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PRED-INFO-OBJECT-METHOD");
        $str73$__PRED_INFO__s__s_ = SubLObjectFactory.makeString("#<PRED-INFO:~s:~s>");
        $sym74$PRED_INFO = SubLObjectFactory.makeSymbol("PRED-INFO");
    }
    
    public static final class $pred_info_object_native extends SubLStructNative
    {
        public SubLObject $pred;
        public SubLObject $relevance_function;
        private static final SubLStructDeclNative structDecl;
        
        public $pred_info_object_native() {
            this.$pred = (SubLObject)CommonSymbols.NIL;
            this.$relevance_function = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$pred_info_object_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$pred;
        }
        
        public SubLObject getField3() {
            return this.$relevance_function;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$pred = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$relevance_function = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$pred_info_object_native.class, pred_relevance_macros.$sym52$PRED_INFO_OBJECT, pred_relevance_macros.$sym53$PRED_INFO_OBJECT_P, pred_relevance_macros.$list54, pred_relevance_macros.$list55, new String[] { "$pred", "$relevance_function" }, pred_relevance_macros.$list56, pred_relevance_macros.$list57, pred_relevance_macros.$sym58$PRINT_PRED_INFO_OBJECT);
        }
    }
    
    public static final class $pred_info_object_p$UnaryFunction extends UnaryFunction
    {
        public $pred_info_object_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PRED-INFO-OBJECT-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pred_relevance_macros.pred_info_object_p(arg1);
        }
    }
}

/*

	Total time: 255 ms
	
*/