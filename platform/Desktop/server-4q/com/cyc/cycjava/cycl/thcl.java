package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class thcl extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.thcl";
    public static final String myFingerPrint = "4606d88bb56ce1d7dfda906cf0f6e6fc2655b39fdd176840ffd903312bbd3cb1";
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 1717L)
    private static SubLSymbol $thcl_generality_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 1892L)
    private static SubLSymbol $thcl_kb_subset_collection$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 2039L)
    public static SubLSymbol $thcl_forts_by_fiat$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 8935L)
    private static SubLSymbol $thcl_pred_argument_types_for_non_definitional_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 10244L)
    private static SubLSymbol $fort_passes_cached_thcl_testsP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 10394L)
    private static SubLSymbol $thcl_filter_collections$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 10914L)
    private static SubLSymbol $thcl_nart_filter_collections$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 10971L)
    private static SubLSymbol $thcl_quoted_filter_collections$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 11143L)
    private static SubLSymbol $thcl_quoted_filter_exceptions$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 11210L)
    private static SubLSymbol $thcl_genls_filter_collections$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 13168L)
    private static SubLSymbol $random_thcl_assertion_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 14707L)
    private static SubLSymbol $ke_irrelevant_termP_via_inference_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 14904L)
    private static SubLSymbol $clarifying_collectionP_caching_state$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$MESSAGE;
    private static final SubLSymbol $sym4$DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE;
    private static final SubLSymbol $sym5$DO_FORTS;
    private static final SubLSymbol $sym6$PWHEN;
    private static final SubLSymbol $sym7$THCL_FORT_;
    private static final SubLSymbol $sym8$PCOND;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$STRINGP;
    private static final SubLInteger $int11$1000;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$CLET;
    private static final SubLSymbol $sym14$_THCL_FORTS_BY_FIAT_;
    private static final SubLSymbol $sym15$CONS;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$FIF;
    private static final SubLSymbol $sym19$FORT_P;
    private static final SubLSymbol $sym20$EASILY_UNDERSTOOD_BY_HUMANS;
    private static final SubLString $str21$_is_a_THCL_FORT_by_fiat__cf___THC;
    private static final SubLString $str22$_is_not_a_FORT_;
    private static final SubLString $str23$RKF_irrelevance_cache_says_;
    private static final SubLString $str24$_is_not_THCL_;
    private static final SubLSymbol $sym25$COMPUTE_THCL_STATUS_OF_FORT;
    private static final SubLString $str26$_is_a_predicate;
    private static final SubLString $str27$_is_a_functor;
    private static final SubLString $str28$_is_a_logical_operator;
    private static final SubLString $str29$_is_a_microtheory;
    private static final SubLString $str30$Allowing_;
    private static final SubLString $str31$__because_it_is_a_ClarifyingColle;
    private static final SubLString $str32$_is_too_general__generality___;
    private static final SubLString $str33$__vs_cutoff_of_;
    private static final SubLString $str34$_;
    private static final SubLString $str35$_fails_the_THCL_KB_subset_test;
    private static final SubLString $str36$_fails_a_cached_test;
    private static final SubLString $str37$Sentence_arity_is_less_than_2____;
    private static final SubLString $str38$Sentence_uses_a_function_and_its_;
    private static final SubLObject $const39$CandidateForPredicatePopulation;
    private static final SubLString $str40$Non_THCL_arg___S;
    private static final SubLList $list41;
    private static final SubLObject $const42$UniversalVocabularyMt;
    private static final SubLObject $const43$QuantificationalRuleMacroPredicat;
    private static final SubLObject $const44$valueOfFunctionForArgs;
    private static final SubLSymbol $sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE;
    private static final SubLObject $const46$InferencePSC;
    private static final SubLSymbol $sym47$_FN;
    private static final SubLObject $const48$functionCorrespondingPredicate_Ge;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLObject $const51$BaseKB;
    private static final SubLString $str52$_S_is_RKF_irrelevant_in___BaseKB_;
    private static final SubLObject $const53$IntermediateVocabPredicate;
    private static final SubLString $str54$_S_is_an___IntermediateVocabPredi;
    private static final SubLObject $const55$CycLTerm;
    private static final SubLSymbol $sym56$GENL_;
    private static final SubLList $list57;
    private static final SubLString $str58$_S_has_a_quoted___CycLTerm_argume;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$NON_THCL_ARG_;
    private static final SubLObject $const61$ResearchCycDefinitionalPredicate;
    private static final SubLString $str62$Allowing__S_as_arg_of_non_definit;
    private static final SubLObject $const63$genlPreds;
    private static final SubLInteger $int64$500;
    private static final SubLString $str65$Allowing__S_as_arg_of___genlPreds;
    private static final SubLString $str66$Non_thcl_arg___S;
    private static final SubLSymbol $sym67$FORT_PASSES_CACHED_THCL_TESTS_;
    private static final SubLSymbol $sym68$_FORT_PASSES_CACHED_THCL_TESTS__CACHING_STATE_;
    private static final SubLList $list69;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLObject $const73$highlyRelevantTerm;
    private static final SubLString $str74$_S_is_a___highlyRelevantTerm__so_;
    private static final SubLObject $const75$True_JustificationTruth;
    private static final SubLString $str76$_S_is_an_instance_of____S;
    private static final SubLString $str77$_S_is_a_NART_and_is_an_instance_o;
    private static final SubLString $str78$_S_is_a_lexical_word;
    private static final SubLString $str79$_S_is_a_quoted_instance_of_one_of;
    private static final SubLList $list80;
    private static final SubLString $str81$_S_was_created_by__S;
    private static final SubLObject $const82$CollectionType;
    private static final SubLString $str83$_S_is_either_a___CollectionType_o;
    private static final SubLObject $const84$CurrentWorldDataCollectorMt_NonHo;
    private static final SubLSymbol $sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE;
    private static final SubLObject $const86$keIrrelevantTerm;
    private static final SubLSymbol $sym87$_KE_IRRELEVANT_TERM__VIA_INFERENCE_CACHING_STATE_;
    private static final SubLInteger $int88$10000;
    private static final SubLSymbol $sym89$CLARIFYING_COLLECTION_;
    private static final SubLObject $const90$ClarifyingCollectionType;
    private static final SubLSymbol $sym91$_CLARIFYING_COLLECTION__CACHING_STATE_;
    private static final SubLSymbol $sym92$CLEAR_CLARIFYING_COLLECTION_;
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 844L)
    public static SubLObject do_thcl_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)thcl.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = (SubLObject)thcl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)thcl.$list0);
        fort = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)thcl.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)thcl.NIL;
        SubLObject current_$1 = (SubLObject)thcl.NIL;
        while (thcl.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)thcl.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)thcl.$list0);
            if (thcl.NIL == conses_high.member(current_$1, (SubLObject)thcl.$list1, (SubLObject)thcl.UNPROVIDED, (SubLObject)thcl.UNPROVIDED)) {
                bad = (SubLObject)thcl.T;
            }
            if (current_$1 == thcl.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (thcl.NIL != bad && thcl.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)thcl.$list0);
        }
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)thcl.$kw3$MESSAGE, current);
        final SubLObject message = (SubLObject)((thcl.NIL != message_tail) ? conses_high.cadr(message_tail) : thcl.NIL);
        final SubLObject body;
        current = (body = temp);
        if (thcl.NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_supports_thclP()) {
            return (SubLObject)ConsesLow.listS((SubLObject)thcl.$sym4$DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE, (SubLObject)ConsesLow.list(fort, message), ConsesLow.append(body, (SubLObject)thcl.NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)thcl.$sym5$DO_FORTS, (SubLObject)ConsesLow.list(fort, message), (SubLObject)ConsesLow.listS((SubLObject)thcl.$sym6$PWHEN, (SubLObject)ConsesLow.list((SubLObject)thcl.$sym7$THCL_FORT_, fort), ConsesLow.append(body, (SubLObject)thcl.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 1238L)
    public static SubLObject do_thcl_forts_2(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)thcl.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = (SubLObject)thcl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)thcl.$list0);
        fort = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)thcl.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)thcl.NIL;
        SubLObject current_$2 = (SubLObject)thcl.NIL;
        while (thcl.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)thcl.$list0);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)thcl.$list0);
            if (thcl.NIL == conses_high.member(current_$2, (SubLObject)thcl.$list1, (SubLObject)thcl.UNPROVIDED, (SubLObject)thcl.UNPROVIDED)) {
                bad = (SubLObject)thcl.T;
            }
            if (current_$2 == thcl.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (thcl.NIL != bad && thcl.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)thcl.$list0);
        }
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)thcl.$kw3$MESSAGE, current);
        final SubLObject message = (SubLObject)((thcl.NIL != message_tail) ? conses_high.cadr(message_tail) : thcl.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)thcl.$sym8$PCOND, (SubLObject)ConsesLow.list((SubLObject)thcl.$list9, (SubLObject)ConsesLow.listS((SubLObject)thcl.$sym4$DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE, (SubLObject)ConsesLow.list(fort, message), ConsesLow.append(body, (SubLObject)thcl.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)thcl.$sym10$STRINGP, message), (SubLObject)ConsesLow.list((SubLObject)thcl.$sym5$DO_FORTS, (SubLObject)ConsesLow.list(fort, message), (SubLObject)ConsesLow.listS((SubLObject)thcl.$sym6$PWHEN, (SubLObject)ConsesLow.list((SubLObject)thcl.$sym7$THCL_FORT_, fort), ConsesLow.append(body, (SubLObject)thcl.NIL)))), (SubLObject)ConsesLow.list((SubLObject)thcl.T, (SubLObject)ConsesLow.list((SubLObject)thcl.$sym5$DO_FORTS, (SubLObject)ConsesLow.list(fort), (SubLObject)ConsesLow.listS((SubLObject)thcl.$sym6$PWHEN, (SubLObject)ConsesLow.list((SubLObject)thcl.$sym7$THCL_FORT_, fort), ConsesLow.append(body, (SubLObject)thcl.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 2088L)
    public static SubLObject with_thcl_fort(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)thcl.$list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = (SubLObject)thcl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)thcl.$list12);
        fort = current.first();
        current = current.rest();
        if (thcl.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)thcl.$sym13$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)thcl.$sym14$_THCL_FORTS_BY_FIAT_, (SubLObject)ConsesLow.listS((SubLObject)thcl.$sym15$CONS, fort, (SubLObject)thcl.$list16))), ConsesLow.append(body, (SubLObject)thcl.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)thcl.$list12);
        return (SubLObject)thcl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 2229L)
    public static SubLObject possibly_with_thcl_fort(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)thcl.$list17);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject maybe_fort = (SubLObject)thcl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)thcl.$list17);
        maybe_fort = current.first();
        current = current.rest();
        if (thcl.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)thcl.$sym13$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)thcl.$sym14$_THCL_FORTS_BY_FIAT_, (SubLObject)ConsesLow.listS((SubLObject)thcl.$sym18$FIF, (SubLObject)ConsesLow.list((SubLObject)thcl.$sym19$FORT_P, maybe_fort), (SubLObject)ConsesLow.listS((SubLObject)thcl.$sym15$CONS, maybe_fort, (SubLObject)thcl.$list16), (SubLObject)thcl.$list16))), ConsesLow.append(body, (SubLObject)thcl.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)thcl.$list17);
        return (SubLObject)thcl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 2454L)
    public static SubLObject thcl_constantP(final SubLObject v_object, SubLObject warnP) {
        if (warnP == thcl.UNPROVIDED) {
            warnP = (SubLObject)thcl.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(thcl.NIL != constant_handles.constant_p(v_object) && thcl.NIL != thcl_fortP(v_object, warnP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 2668L)
    public static SubLObject easily_understood_by_humans(final SubLObject v_object) {
        return thcl_fortP(v_object, (SubLObject)thcl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 2759L)
    public static SubLObject not_thcl_fortP(final SubLObject obj, final SubLObject mt, SubLObject warnP) {
        if (warnP == thcl.UNPROVIDED) {
            warnP = (SubLObject)thcl.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(thcl.NIL == thcl_fortP(obj, warnP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 2871L)
    public static SubLObject thcl_fortP(final SubLObject v_object, SubLObject warnP) {
        if (warnP == thcl.UNPROVIDED) {
            warnP = (SubLObject)thcl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject thcl_fortP = (SubLObject)thcl.NIL;
        SubLObject reason = (SubLObject)thcl.NIL;
        if (thcl.NIL != list_utilities.member_equalP(v_object, thcl.$thcl_forts_by_fiat$.getDynamicValue(thread))) {
            if (thcl.NIL != warnP) {
                reason = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(v_object), (SubLObject)thcl.$str21$_is_a_THCL_FORT_by_fiat__cf___THC);
            }
            thcl_fortP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL == forts.fort_p(v_object)) {
            if (thcl.NIL != warnP) {
                reason = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(v_object), (SubLObject)thcl.$str22$_is_not_a_FORT_);
            }
        }
        else if (thcl.NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_supports_thclP()) {
            if (thcl.NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_thclP(v_object)) {
                thcl_fortP = (SubLObject)thcl.T;
            }
            else if (thcl.NIL != warnP) {
                reason = Sequences.cconcatenate((SubLObject)thcl.$str23$RKF_irrelevance_cache_says_, new SubLObject[] { format_nil.format_nil_s_no_copy(v_object), thcl.$str24$_is_not_THCL_ });
            }
        }
        else {
            thread.resetMultipleValues();
            final SubLObject thcl_fortP_$3 = compute_thcl_status_of_fort(v_object, warnP, (SubLObject)thcl.NIL, (SubLObject)thcl.UNPROVIDED);
            final SubLObject reason_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thcl_fortP = thcl_fortP_$3;
            reason = reason_$4;
        }
        if (thcl.NIL != warnP && reason.isString()) {
            Errors.warn(reason);
        }
        return thcl_fortP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 3793L)
    public static SubLObject compute_thcl_status_of_fort_internal(final SubLObject fort, final SubLObject warnP, SubLObject assume_ke_relevantP, SubLObject generality_cutoff) {
        if (assume_ke_relevantP == thcl.UNPROVIDED) {
            assume_ke_relevantP = (SubLObject)thcl.NIL;
        }
        if (generality_cutoff == thcl.UNPROVIDED) {
            generality_cutoff = thcl.$thcl_generality_cutoff$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert thcl.NIL != forts.fort_p(fort) : fort;
        SubLObject thcl_fortP = (SubLObject)thcl.NIL;
        SubLObject reason = (SubLObject)thcl.NIL;
        if (thcl.NIL != fort_types_interface.predicate_p(fort)) {
            if (thcl.NIL != warnP) {
                reason = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(fort), (SubLObject)thcl.$str26$_is_a_predicate);
            }
        }
        else if (thcl.NIL != fort_types_interface.functor_p(fort)) {
            if (thcl.NIL != warnP) {
                reason = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(fort), (SubLObject)thcl.$str27$_is_a_functor);
            }
        }
        else if (thcl.NIL != cycl_grammar.cycl_logical_operator_p(fort)) {
            if (thcl.NIL != warnP) {
                reason = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(fort), (SubLObject)thcl.$str28$_is_a_logical_operator);
            }
        }
        else if (thcl.NIL != fort_types_interface.microtheory_p(fort)) {
            if (thcl.NIL != warnP) {
                reason = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(fort), (SubLObject)thcl.$str29$_is_a_microtheory);
            }
        }
        else if (thcl.NIL != clarifying_collectionP(fort, (SubLObject)thcl.UNPROVIDED)) {
            thcl_fortP = (SubLObject)thcl.T;
            if (thcl.NIL != warnP) {
                reason = Sequences.cconcatenate((SubLObject)thcl.$str30$Allowing_, new SubLObject[] { format_nil.format_nil_s_no_copy(fort), thcl.$str31$__because_it_is_a_ClarifyingColle });
            }
        }
        else if (cardinality_estimates.generality_estimate(fort).numG(generality_cutoff)) {
            if (thcl.NIL != warnP) {
                reason = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(fort), new SubLObject[] { thcl.$str32$_is_too_general__generality___, format_nil.format_nil_s_no_copy(cardinality_estimates.generality_estimate(fort)), thcl.$str33$__vs_cutoff_of_, format_nil.format_nil_s_no_copy(thcl.$thcl_generality_cutoff$.getDynamicValue(thread)), thcl.$str34$_ });
            }
        }
        else if (thcl.NIL == fort_passes_thcl_kb_subset_testP(fort)) {
            if (thcl.NIL != warnP) {
                reason = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(fort), (SubLObject)thcl.$str35$_fails_the_THCL_KB_subset_test);
            }
        }
        else if (thcl.NIL == fort_passes_cached_thcl_testsP(fort)) {
            if (thcl.NIL != warnP) {
                reason = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(fort), (SubLObject)thcl.$str36$_fails_a_cached_test);
                thcl_filter_fortP(fort, (SubLObject)thcl.T);
            }
        }
        else {
            thcl_fortP = (SubLObject)thcl.T;
        }
        return Values.values(thcl_fortP, reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 3793L)
    public static SubLObject compute_thcl_status_of_fort(final SubLObject fort, final SubLObject warnP, SubLObject assume_ke_relevantP, SubLObject generality_cutoff) {
        if (assume_ke_relevantP == thcl.UNPROVIDED) {
            assume_ke_relevantP = (SubLObject)thcl.NIL;
        }
        if (generality_cutoff == thcl.UNPROVIDED) {
            generality_cutoff = thcl.$thcl_generality_cutoff$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)thcl.NIL;
        if (thcl.NIL == v_memoization_state) {
            return compute_thcl_status_of_fort_internal(fort, warnP, assume_ke_relevantP, generality_cutoff);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)thcl.$sym25$COMPUTE_THCL_STATUS_OF_FORT, (SubLObject)thcl.UNPROVIDED);
        if (thcl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)thcl.$sym25$COMPUTE_THCL_STATUS_OF_FORT, (SubLObject)thcl.FOUR_INTEGER, (SubLObject)thcl.NIL, (SubLObject)thcl.EQL, (SubLObject)thcl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)thcl.$sym25$COMPUTE_THCL_STATUS_OF_FORT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(fort, warnP, assume_ke_relevantP, generality_cutoff);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)thcl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)thcl.NIL;
            collision = cdolist_list_var.first();
            while (thcl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (warnP.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (assume_ke_relevantP.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (thcl.NIL != cached_args && thcl.NIL == cached_args.rest() && generality_cutoff.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(compute_thcl_status_of_fort_internal(fort, warnP, assume_ke_relevantP, generality_cutoff)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(fort, warnP, assume_ke_relevantP, generality_cutoff));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 5494L)
    public static SubLObject fort_passes_thcl_kb_subset_testP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(thcl.NIL == constant_handles.valid_constantP(thcl.$thcl_kb_subset_collection$.getDynamicValue(thread), (SubLObject)thcl.UNPROVIDED) || thcl.NIL != isa.quoted_isa_in_any_mtP(fort, thcl.$thcl_kb_subset_collection$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 5677L)
    public static SubLObject thcl_formulaP(final SubLObject formula, SubLObject warnP) {
        if (warnP == thcl.UNPROVIDED) {
            warnP = (SubLObject)thcl.NIL;
        }
        SubLObject badP = (SubLObject)thcl.NIL;
        if (thcl.NIL != collection_defns.cycl_sentenceP(formula) && el_utilities.formula_arity(formula, (SubLObject)thcl.UNPROVIDED).numL((SubLObject)thcl.TWO_INTEGER)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str37$Sentence_arity_is_less_than_2____, formula);
            }
            badP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL != function_corresponding_predicate_sentenceP(formula)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str38$Sentence_uses_a_function_and_its_, formula);
            }
            badP = (SubLObject)thcl.T;
        }
        SubLObject list_var = (SubLObject)thcl.NIL;
        SubLObject arg = (SubLObject)thcl.NIL;
        SubLObject argnum = (SubLObject)thcl.NIL;
        list_var = cycl_utilities.formula_terms(formula, (SubLObject)thcl.UNPROVIDED);
        arg = list_var.first();
        for (argnum = (SubLObject)thcl.ZERO_INTEGER; thcl.NIL == badP && thcl.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = Numbers.add((SubLObject)thcl.ONE_INTEGER, argnum)) {
            if (argnum.isZero() && thcl.NIL != isa.isa_in_any_mtP(arg, thcl.$const39$CandidateForPredicatePopulation)) {
                return (SubLObject)thcl.T;
            }
            if (thcl.NIL != thcl_functor_argP(arg, argnum, formula, warnP)) {
                badP = non_thcl_functorP(arg, warnP);
            }
            else {
                badP = non_thcl_argP(arg, argnum, formula, warnP);
            }
            if (thcl.NIL != badP && thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str40$Non_THCL_arg___S, arg);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(thcl.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 6642L)
    public static SubLObject thcl_functor_argP(final SubLObject arg, final SubLObject argnum, final SubLObject formula, final SubLObject warnP) {
        if (argnum.isZero()) {
            return (SubLObject)thcl.T;
        }
        if (argnum.eql((SubLObject)thcl.THREE_INTEGER) && thcl.NIL != isa.isa_anyP(cycl_utilities.formula_arg0(formula), (SubLObject)thcl.$list41, thcl.$const42$UniversalVocabularyMt, (SubLObject)thcl.UNPROVIDED)) {
            return (SubLObject)thcl.T;
        }
        if (thcl.NIL != fort_types_interface.rule_macro_predicate_p(cycl_utilities.formula_arg0(formula)) && thcl.NIL != forts.fort_p(arg) && thcl.NIL != fort_types_interface.predicate_p(arg) && thcl.ONE_INTEGER.eql(argnum) && thcl.NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg0(formula), thcl.$const43$QuantificationalRuleMacroPredicat)) {
            return (SubLObject)thcl.T;
        }
        if (thcl.ONE_INTEGER.eql(argnum) && thcl.$const44$valueOfFunctionForArgs.eql(cycl_utilities.formula_arg0(formula))) {
            return (SubLObject)thcl.T;
        }
        return (SubLObject)thcl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 7340L)
    public static SubLObject function_corresponding_predicate_sentenceP(final SubLObject formula) {
        SubLObject ans = (SubLObject)thcl.NIL;
        if (thcl.NIL != collection_defns.cycl_sentenceP(formula) && thcl.NIL != el_utilities.groundP(formula, (SubLObject)thcl.UNPROVIDED) && (thcl.NIL != assertions_high.atomic_assertionP(formula) || thcl.NIL != el_utilities.atomic_sentenceP(formula)) && thcl.NIL == ans) {
            SubLObject csome_list_var = functions_corresponding_to_predicate(cycl_utilities.formula_arg0(formula), (SubLObject)thcl.UNPROVIDED);
            SubLObject fn = (SubLObject)thcl.NIL;
            fn = csome_list_var.first();
            while (thcl.NIL == ans && thcl.NIL != csome_list_var) {
                if (thcl.NIL != cycl_utilities.expression_find(fn, formula, (SubLObject)thcl.T, (SubLObject)thcl.UNPROVIDED, (SubLObject)thcl.UNPROVIDED)) {
                    ans = (SubLObject)thcl.T;
                }
                csome_list_var = csome_list_var.rest();
                fn = csome_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 7729L)
    public static SubLObject functions_corresponding_to_predicate_internal(final SubLObject predicate, SubLObject mt) {
        if (mt == thcl.UNPROVIDED) {
            mt = thcl.$const46$InferencePSC;
        }
        return ask_utilities.query_variable((SubLObject)thcl.$sym47$_FN, (SubLObject)ConsesLow.listS(thcl.$const48$functionCorrespondingPredicate_Ge, (SubLObject)thcl.$sym47$_FN, predicate, (SubLObject)thcl.$list49), mt, (SubLObject)thcl.$list50);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 7729L)
    public static SubLObject functions_corresponding_to_predicate(final SubLObject predicate, SubLObject mt) {
        if (mt == thcl.UNPROVIDED) {
            mt = thcl.$const46$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)thcl.NIL;
        if (thcl.NIL == v_memoization_state) {
            return functions_corresponding_to_predicate_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)thcl.$sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE, (SubLObject)thcl.UNPROVIDED);
        if (thcl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)thcl.$sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE, (SubLObject)thcl.TWO_INTEGER, (SubLObject)thcl.NIL, (SubLObject)thcl.EQUAL, (SubLObject)thcl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)thcl.$sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)thcl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)thcl.NIL;
            collision = cdolist_list_var.first();
            while (thcl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (thcl.NIL != cached_args && thcl.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(functions_corresponding_to_predicate_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 8007L)
    public static SubLObject non_thcl_functorP(final SubLObject functor, SubLObject warnP) {
        if (warnP == thcl.UNPROVIDED) {
            warnP = (SubLObject)thcl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (thcl.NIL != list_utilities.member_equalP(functor, thcl.$thcl_forts_by_fiat$.getDynamicValue(thread))) {
            return (SubLObject)thcl.NIL;
        }
        if (thcl.NIL == forts.fort_p(functor)) {
            return (SubLObject)thcl.T;
        }
        if (thcl.NIL != rkf_relevance_utilities.rkf_irrelevant_term(functor, thcl.$const51$BaseKB)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str52$_S_is_RKF_irrelevant_in___BaseKB_, functor);
            }
            return (SubLObject)thcl.T;
        }
        if (thcl.NIL != lexicon_vars.name_string_predP(functor)) {
            return (SubLObject)thcl.T;
        }
        if (thcl.NIL != lexicon_accessors.speech_part_predP(functor, (SubLObject)thcl.UNPROVIDED)) {
            return (SubLObject)thcl.T;
        }
        if (thcl.NIL != isa.isa_in_any_mtP(functor, thcl.$const53$IntermediateVocabPredicate)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str54$_S_is_an___IntermediateVocabPredi, functor);
            }
            return (SubLObject)thcl.T;
        }
        if (thcl.NIL == fort_passes_thcl_kb_subset_testP(functor)) {
            return (SubLObject)thcl.T;
        }
        if (thcl.NIL != kb_accessors.some_quoted_argumentP(functor) && thcl.NIL != conses_high.member(thcl.$const55$CycLTerm, kb_accessors.arg_isa(functor, (SubLObject)thcl.UNPROVIDED), Symbols.symbol_function((SubLObject)thcl.$sym56$GENL_), (SubLObject)thcl.UNPROVIDED) && thcl.NIL == conses_high.member(functor, (SubLObject)thcl.$list57, Symbols.symbol_function((SubLObject)thcl.EQL), (SubLObject)thcl.UNPROVIDED)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str58$_S_has_a_quoted___CycLTerm_argume, functor);
            }
            return (SubLObject)thcl.T;
        }
        return (SubLObject)thcl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 9108L)
    public static SubLObject non_thcl_argP_internal(final SubLObject arg, final SubLObject argnum, final SubLObject formula, SubLObject warnP) {
        if (warnP == thcl.UNPROVIDED) {
            warnP = (SubLObject)thcl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject thclP = (SubLObject)thcl.NIL;
        if (thcl.NIL != thcl_fortP(arg, (SubLObject)SubLObjectFactory.makeBoolean(thcl.NIL != warnP && thcl.NIL != forts.fort_p(arg)))) {
            thclP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL != fort_types_interface.predicate_p(arg) && thcl.NIL != isa.isa_anyP(arg, thcl.$thcl_pred_argument_types_for_non_definitional_preds$.getDynamicValue(thread), thcl.$const42$UniversalVocabularyMt, (SubLObject)thcl.UNPROVIDED) && thcl.NIL == isa.isa_in_any_mtP(cycl_utilities.formula_arg0(formula), thcl.$const61$ResearchCycDefinitionalPredicate)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str62$Allowing__S_as_arg_of_non_definit, arg, cycl_utilities.formula_arg0(formula));
            }
            thclP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL != fort_types_interface.predicate_p(arg) && cycl_utilities.formula_arg0(formula).eql(thcl.$const63$genlPreds) && cardinality_estimates.generality_estimate(arg).numL((SubLObject)thcl.$int64$500)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str65$Allowing__S_as_arg_of___genlPreds, arg);
            }
            thclP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL != forts.fort_p(arg)) {
            thclP = (SubLObject)thcl.NIL;
        }
        else if (arg.isString()) {
            thclP = (SubLObject)thcl.T;
        }
        else if (arg.isNumber()) {
            thclP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL != cycl_variables.el_varP(arg)) {
            thclP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL != el_utilities.el_formula_p(arg)) {
            thclP = thcl_formulaP(arg, warnP);
        }
        if (thcl.NIL == thclP && thcl.NIL != warnP) {
            Errors.warn((SubLObject)thcl.$str66$Non_thcl_arg___S, arg);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(thcl.NIL == thclP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 9108L)
    public static SubLObject non_thcl_argP(final SubLObject arg, final SubLObject argnum, final SubLObject formula, SubLObject warnP) {
        if (warnP == thcl.UNPROVIDED) {
            warnP = (SubLObject)thcl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)thcl.NIL;
        if (thcl.NIL == v_memoization_state) {
            return non_thcl_argP_internal(arg, argnum, formula, warnP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)thcl.$sym60$NON_THCL_ARG_, (SubLObject)thcl.UNPROVIDED);
        if (thcl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)thcl.$sym60$NON_THCL_ARG_, (SubLObject)thcl.FOUR_INTEGER, (SubLObject)thcl.NIL, (SubLObject)thcl.EQUAL, (SubLObject)thcl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)thcl.$sym60$NON_THCL_ARG_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(arg, argnum, formula, warnP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)thcl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)thcl.NIL;
            collision = cdolist_list_var.first();
            while (thcl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (arg.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (formula.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (thcl.NIL != cached_args && thcl.NIL == cached_args.rest() && warnP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(non_thcl_argP_internal(arg, argnum, formula, warnP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(arg, argnum, formula, warnP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 10244L)
    public static SubLObject clear_fort_passes_cached_thcl_testsP() {
        final SubLObject cs = thcl.$fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue();
        if (thcl.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)thcl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 10244L)
    public static SubLObject remove_fort_passes_cached_thcl_testsP(final SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args(thcl.$fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(fort), (SubLObject)thcl.UNPROVIDED, (SubLObject)thcl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 10244L)
    public static SubLObject fort_passes_cached_thcl_testsP_internal(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(thcl.NIL == thcl_filter_fortP(fort, (SubLObject)thcl.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 10244L)
    public static SubLObject fort_passes_cached_thcl_testsP(final SubLObject fort) {
        SubLObject caching_state = thcl.$fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue();
        if (thcl.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)thcl.$sym67$FORT_PASSES_CACHED_THCL_TESTS_, (SubLObject)thcl.$sym68$_FORT_PASSES_CACHED_THCL_TESTS__CACHING_STATE_, (SubLObject)thcl.$int64$500, (SubLObject)thcl.EQL, (SubLObject)thcl.ONE_INTEGER, (SubLObject)thcl.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(fort_passes_cached_thcl_testsP_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, (SubLObject)thcl.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 11378L)
    public static SubLObject thcl_filter_fortP(final SubLObject fort, SubLObject warnP) {
        if (warnP == thcl.UNPROVIDED) {
            warnP = (SubLObject)thcl.NIL;
        }
        SubLObject filterP = (SubLObject)thcl.NIL;
        if (thcl.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(fort, thcl.$const73$highlyRelevantTerm, (SubLObject)thcl.UNPROVIDED, (SubLObject)thcl.UNPROVIDED)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str74$_S_is_a___highlyRelevantTerm__so_, fort);
            }
        }
        else if (thcl.NIL != isa.isa_anyP(fort, thcl.$thcl_filter_collections$.getGlobalValue(), thcl.$const46$InferencePSC, thcl.$const75$True_JustificationTruth)) {
            if (thcl.NIL != warnP) {
                SubLObject cdolist_list_var = thcl.$thcl_filter_collections$.getGlobalValue();
                SubLObject col = (SubLObject)thcl.NIL;
                col = cdolist_list_var.first();
                while (thcl.NIL != cdolist_list_var) {
                    if (thcl.NIL != isa.isaP(fort, col, thcl.$const46$InferencePSC, thcl.$const75$True_JustificationTruth)) {
                        Errors.warn((SubLObject)thcl.$str76$_S_is_an_instance_of____S, fort, col);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    col = cdolist_list_var.first();
                }
            }
            filterP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL != nart_handles.nart_p(fort) && thcl.NIL != isa.isa_anyP(fort, thcl.$thcl_nart_filter_collections$.getGlobalValue(), thcl.$const46$InferencePSC, thcl.$const75$True_JustificationTruth)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str77$_S_is_a_NART_and_is_an_instance_o, fort, thcl.$thcl_nart_filter_collections$.getGlobalValue());
            }
            filterP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL != lexicon_accessors.quick_lexical_wordP(fort, (SubLObject)thcl.UNPROVIDED)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str78$_S_is_a_lexical_word, fort);
            }
            filterP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL != isa.any_quoted_isaP(fort, thcl.$thcl_quoted_filter_collections$.getGlobalValue(), thcl.$const46$InferencePSC, thcl.$const75$True_JustificationTruth) && thcl.NIL == subl_promotions.memberP(fort, thcl.$thcl_quoted_filter_exceptions$.getGlobalValue(), Symbols.symbol_function((SubLObject)thcl.EQL), (SubLObject)thcl.UNPROVIDED)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str79$_S_is_a_quoted_instance_of_one_of, fort, thcl.$thcl_quoted_filter_collections$.getGlobalValue());
            }
            filterP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL != conses_high.member(bookkeeping_store.creator(fort, (SubLObject)thcl.UNPROVIDED), (SubLObject)thcl.$list80, (SubLObject)thcl.UNPROVIDED, (SubLObject)thcl.UNPROVIDED)) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str81$_S_was_created_by__S, bookkeeping_store.creator(fort, (SubLObject)thcl.UNPROVIDED));
            }
            filterP = (SubLObject)thcl.T;
        }
        else if (thcl.NIL != fort_types_interface.collection_p(fort) && (thcl.NIL != isa.isaP(fort, thcl.$const82$CollectionType, (SubLObject)thcl.UNPROVIDED, (SubLObject)thcl.UNPROVIDED) || thcl.NIL != genls.any_genlP(fort, thcl.$thcl_genls_filter_collections$.getGlobalValue(), thcl.$const46$InferencePSC, thcl.$const75$True_JustificationTruth))) {
            if (thcl.NIL != warnP) {
                Errors.warn((SubLObject)thcl.$str83$_S_is_either_a___CollectionType_o, thcl.$thcl_genls_filter_collections$.getGlobalValue());
            }
            filterP = (SubLObject)thcl.T;
        }
        return filterP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 13318L)
    public static SubLObject random_thcl_assertion_mt() {
        return thcl.$random_thcl_assertion_mt$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 13401L)
    public static SubLObject random_thcl_constant_and_assertion(SubLObject cyclist) {
        if (cyclist == thcl.UNPROVIDED) {
            cyclist = (SubLObject)thcl.NIL;
        }
        return random_thcl_constant_and_assertion_int(cyclist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 13533L)
    public static SubLObject random_thcl_constant_and_assertion_int(final SubLObject cyclist) {
        SubLObject constant = (SubLObject)thcl.NIL;
        SubLObject assertion = (SubLObject)thcl.NIL;
        for (SubLObject abortP = (SubLObject)thcl.NIL; (thcl.NIL == constant || thcl.NIL == assertion) && thcl.NIL == abortP; assertion = random_thcl_assertion(constant, cyclist)) {
            constant = constants_high.random_constant((SubLObject)thcl.UNPROVIDED);
            if (thcl.NIL != thcl_constantP(constant, (SubLObject)thcl.UNPROVIDED)) {}
        }
        return Values.values(constant, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 13889L)
    public static SubLObject random_thcl_assertion(final SubLObject fort, SubLObject cyclist) {
        if (cyclist == thcl.UNPROVIDED) {
            cyclist = (SubLObject)thcl.NIL;
        }
        final SubLObject thcl_assertion = (SubLObject)thcl.NIL;
        final SubLObject all_assertions = (SubLObject)thcl.NIL;
        return thcl_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 14500L)
    public static SubLObject ke_irrelevant_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == thcl.UNPROVIDED) {
            mt = thcl.$const46$InferencePSC;
        }
        return rkf_relevance_utilities.rkf_irrelevant_term(v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 14707L)
    public static SubLObject clear_ke_irrelevant_termP_via_inference() {
        final SubLObject cs = thcl.$ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue();
        if (thcl.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)thcl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 14707L)
    public static SubLObject remove_ke_irrelevant_termP_via_inference(final SubLObject v_term, SubLObject mt) {
        if (mt == thcl.UNPROVIDED) {
            mt = thcl.$const46$InferencePSC;
        }
        return memoization_state.caching_state_remove_function_results_with_args(thcl.$ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, mt), (SubLObject)thcl.UNPROVIDED, (SubLObject)thcl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 14707L)
    public static SubLObject ke_irrelevant_termP_via_inference_internal(final SubLObject v_term, final SubLObject mt) {
        return ask_utilities.query_boolean((SubLObject)ConsesLow.list(thcl.$const86$keIrrelevantTerm, v_term), mt, (SubLObject)thcl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 14707L)
    public static SubLObject ke_irrelevant_termP_via_inference(final SubLObject v_term, SubLObject mt) {
        if (mt == thcl.UNPROVIDED) {
            mt = thcl.$const46$InferencePSC;
        }
        SubLObject caching_state = thcl.$ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue();
        if (thcl.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)thcl.$sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE, (SubLObject)thcl.$sym87$_KE_IRRELEVANT_TERM__VIA_INFERENCE_CACHING_STATE_, (SubLObject)thcl.$int88$10000, (SubLObject)thcl.EQUAL, (SubLObject)thcl.TWO_INTEGER, (SubLObject)thcl.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)thcl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)thcl.NIL;
            collision = cdolist_list_var.first();
            while (thcl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (thcl.NIL != cached_args && thcl.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(ke_irrelevant_termP_via_inference_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 14904L)
    public static SubLObject clear_clarifying_collectionP() {
        final SubLObject cs = thcl.$clarifying_collectionP_caching_state$.getGlobalValue();
        if (thcl.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)thcl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 14904L)
    public static SubLObject remove_clarifying_collectionP(final SubLObject v_object, SubLObject mt) {
        if (mt == thcl.UNPROVIDED) {
            mt = thcl.$const46$InferencePSC;
        }
        return memoization_state.caching_state_remove_function_results_with_args(thcl.$clarifying_collectionP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_object, mt), (SubLObject)thcl.UNPROVIDED, (SubLObject)thcl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 14904L)
    public static SubLObject clarifying_collectionP_internal(final SubLObject v_object, final SubLObject mt) {
        return isa.isaP(v_object, thcl.$const90$ClarifyingCollectionType, mt, (SubLObject)thcl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/thcl.lisp", position = 14904L)
    public static SubLObject clarifying_collectionP(final SubLObject v_object, SubLObject mt) {
        if (mt == thcl.UNPROVIDED) {
            mt = thcl.$const46$InferencePSC;
        }
        SubLObject caching_state = thcl.$clarifying_collectionP_caching_state$.getGlobalValue();
        if (thcl.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)thcl.$sym89$CLARIFYING_COLLECTION_, (SubLObject)thcl.$sym91$_CLARIFYING_COLLECTION__CACHING_STATE_, (SubLObject)thcl.$int88$10000, (SubLObject)thcl.EQUAL, (SubLObject)thcl.TWO_INTEGER, (SubLObject)thcl.ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback((SubLObject)thcl.$sym92$CLEAR_CLARIFYING_COLLECTION_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_object, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)thcl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)thcl.NIL;
            collision = cdolist_list_var.first();
            while (thcl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_object.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (thcl.NIL != cached_args && thcl.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(clarifying_collectionP_internal(v_object, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_object, mt));
        return memoization_state.caching_results(results3);
    }
    
    public static SubLObject declare_thcl_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.thcl", "do_thcl_forts", "DO-THCL-FORTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.thcl", "do_thcl_forts_2", "DO-THCL-FORTS-2");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.thcl", "with_thcl_fort", "WITH-THCL-FORT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.thcl", "possibly_with_thcl_fort", "POSSIBLY-WITH-THCL-FORT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "thcl_constantP", "THCL-CONSTANT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "easily_understood_by_humans", "EASILY-UNDERSTOOD-BY-HUMANS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "not_thcl_fortP", "NOT-THCL-FORT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "thcl_fortP", "THCL-FORT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "compute_thcl_status_of_fort_internal", "COMPUTE-THCL-STATUS-OF-FORT-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "compute_thcl_status_of_fort", "COMPUTE-THCL-STATUS-OF-FORT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "fort_passes_thcl_kb_subset_testP", "FORT-PASSES-THCL-KB-SUBSET-TEST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "thcl_formulaP", "THCL-FORMULA?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "thcl_functor_argP", "THCL-FUNCTOR-ARG?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "function_corresponding_predicate_sentenceP", "FUNCTION-CORRESPONDING-PREDICATE-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "functions_corresponding_to_predicate_internal", "FUNCTIONS-CORRESPONDING-TO-PREDICATE-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "functions_corresponding_to_predicate", "FUNCTIONS-CORRESPONDING-TO-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "non_thcl_functorP", "NON-THCL-FUNCTOR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "non_thcl_argP_internal", "NON-THCL-ARG?-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "non_thcl_argP", "NON-THCL-ARG?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "clear_fort_passes_cached_thcl_testsP", "CLEAR-FORT-PASSES-CACHED-THCL-TESTS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "remove_fort_passes_cached_thcl_testsP", "REMOVE-FORT-PASSES-CACHED-THCL-TESTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "fort_passes_cached_thcl_testsP_internal", "FORT-PASSES-CACHED-THCL-TESTS?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "fort_passes_cached_thcl_testsP", "FORT-PASSES-CACHED-THCL-TESTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "thcl_filter_fortP", "THCL-FILTER-FORT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "random_thcl_assertion_mt", "RANDOM-THCL-ASSERTION-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "random_thcl_constant_and_assertion", "RANDOM-THCL-CONSTANT-AND-ASSERTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "random_thcl_constant_and_assertion_int", "RANDOM-THCL-CONSTANT-AND-ASSERTION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "random_thcl_assertion", "RANDOM-THCL-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "ke_irrelevant_termP", "KE-IRRELEVANT-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "clear_ke_irrelevant_termP_via_inference", "CLEAR-KE-IRRELEVANT-TERM?-VIA-INFERENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "remove_ke_irrelevant_termP_via_inference", "REMOVE-KE-IRRELEVANT-TERM?-VIA-INFERENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "ke_irrelevant_termP_via_inference_internal", "KE-IRRELEVANT-TERM?-VIA-INFERENCE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "ke_irrelevant_termP_via_inference", "KE-IRRELEVANT-TERM?-VIA-INFERENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "clear_clarifying_collectionP", "CLEAR-CLARIFYING-COLLECTION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "remove_clarifying_collectionP", "REMOVE-CLARIFYING-COLLECTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "clarifying_collectionP_internal", "CLARIFYING-COLLECTION?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.thcl", "clarifying_collectionP", "CLARIFYING-COLLECTION?", 1, 1, false);
        return (SubLObject)thcl.NIL;
    }
    
    public static SubLObject init_thcl_file() {
        thcl.$thcl_generality_cutoff$ = SubLFiles.defparameter("*THCL-GENERALITY-CUTOFF*", (SubLObject)thcl.$int11$1000);
        thcl.$thcl_kb_subset_collection$ = SubLFiles.defparameter("*THCL-KB-SUBSET-COLLECTION*", (SubLObject)thcl.NIL);
        thcl.$thcl_forts_by_fiat$ = SubLFiles.defparameter("*THCL-FORTS-BY-FIAT*", (SubLObject)thcl.NIL);
        thcl.$thcl_pred_argument_types_for_non_definitional_preds$ = SubLFiles.defparameter("*THCL-PRED-ARGUMENT-TYPES-FOR-NON-DEFINITIONAL-PREDS*", (SubLObject)thcl.$list59);
        thcl.$fort_passes_cached_thcl_testsP_caching_state$ = SubLFiles.deflexical("*FORT-PASSES-CACHED-THCL-TESTS?-CACHING-STATE*", (SubLObject)thcl.NIL);
        thcl.$thcl_filter_collections$ = SubLFiles.deflexical("*THCL-FILTER-COLLECTIONS*", (SubLObject)thcl.$list69);
        thcl.$thcl_nart_filter_collections$ = SubLFiles.deflexical("*THCL-NART-FILTER-COLLECTIONS*", (SubLObject)thcl.NIL);
        thcl.$thcl_quoted_filter_collections$ = SubLFiles.deflexical("*THCL-QUOTED-FILTER-COLLECTIONS*", (SubLObject)thcl.$list70);
        thcl.$thcl_quoted_filter_exceptions$ = SubLFiles.deflexical("*THCL-QUOTED-FILTER-EXCEPTIONS*", (SubLObject)thcl.$list71);
        thcl.$thcl_genls_filter_collections$ = SubLFiles.deflexical("*THCL-GENLS-FILTER-COLLECTIONS*", (SubLObject)thcl.$list72);
        thcl.$random_thcl_assertion_mt$ = SubLFiles.deflexical("*RANDOM-THCL-ASSERTION-MT*", thcl.$const84$CurrentWorldDataCollectorMt_NonHo);
        thcl.$ke_irrelevant_termP_via_inference_caching_state$ = SubLFiles.deflexical("*KE-IRRELEVANT-TERM?-VIA-INFERENCE-CACHING-STATE*", (SubLObject)thcl.NIL);
        thcl.$clarifying_collectionP_caching_state$ = SubLFiles.deflexical("*CLARIFYING-COLLECTION?-CACHING-STATE*", (SubLObject)thcl.NIL);
        return (SubLObject)thcl.NIL;
    }
    
    public static SubLObject setup_thcl_file() {
        utilities_macros.register_kb_function((SubLObject)thcl.$sym20$EASILY_UNDERSTOOD_BY_HUMANS);
        memoization_state.note_memoized_function((SubLObject)thcl.$sym25$COMPUTE_THCL_STATUS_OF_FORT);
        memoization_state.note_memoized_function((SubLObject)thcl.$sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE);
        memoization_state.note_memoized_function((SubLObject)thcl.$sym60$NON_THCL_ARG_);
        memoization_state.note_globally_cached_function((SubLObject)thcl.$sym67$FORT_PASSES_CACHED_THCL_TESTS_);
        memoization_state.note_globally_cached_function((SubLObject)thcl.$sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE);
        memoization_state.note_globally_cached_function((SubLObject)thcl.$sym89$CLARIFYING_COLLECTION_);
        return (SubLObject)thcl.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_thcl_file();
    }
    
    @Override
	public void initializeVariables() {
        init_thcl_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_thcl_file();
    }
    
    static {
        me = (SubLFile)new thcl();
        thcl.$thcl_generality_cutoff$ = null;
        thcl.$thcl_kb_subset_collection$ = null;
        thcl.$thcl_forts_by_fiat$ = null;
        thcl.$thcl_pred_argument_types_for_non_definitional_preds$ = null;
        thcl.$fort_passes_cached_thcl_testsP_caching_state$ = null;
        thcl.$thcl_filter_collections$ = null;
        thcl.$thcl_nart_filter_collections$ = null;
        thcl.$thcl_quoted_filter_collections$ = null;
        thcl.$thcl_quoted_filter_exceptions$ = null;
        thcl.$thcl_genls_filter_collections$ = null;
        thcl.$random_thcl_assertion_mt$ = null;
        thcl.$ke_irrelevant_termP_via_inference_caching_state$ = null;
        thcl.$clarifying_collectionP_caching_state$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $sym4$DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE = SubLObjectFactory.makeSymbol("DO-THCL-FORTS-FROM-RKF-IRRELEVANCE-CACHE");
        $sym5$DO_FORTS = SubLObjectFactory.makeSymbol("DO-FORTS");
        $sym6$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym7$THCL_FORT_ = SubLObjectFactory.makeSymbol("THCL-FORT?");
        $sym8$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-RKF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-IRRELEVANT-CACHE-SUPPORTS-THCL?")));
        $sym10$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $int11$1000 = SubLObjectFactory.makeInteger(1000);
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym13$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym14$_THCL_FORTS_BY_FIAT_ = SubLObjectFactory.makeSymbol("*THCL-FORTS-BY-FIAT*");
        $sym15$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*THCL-FORTS-BY-FIAT*"));
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAYBE-FORT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym18$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym19$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym20$EASILY_UNDERSTOOD_BY_HUMANS = SubLObjectFactory.makeSymbol("EASILY-UNDERSTOOD-BY-HUMANS");
        $str21$_is_a_THCL_FORT_by_fiat__cf___THC = SubLObjectFactory.makeString(" is a THCL FORT by fiat (cf. *THCL-FORTS-BY-FIAT*)");
        $str22$_is_not_a_FORT_ = SubLObjectFactory.makeString(" is not a FORT.");
        $str23$RKF_irrelevance_cache_says_ = SubLObjectFactory.makeString("RKF irrelevance cache says ");
        $str24$_is_not_THCL_ = SubLObjectFactory.makeString(" is not THCL.");
        $sym25$COMPUTE_THCL_STATUS_OF_FORT = SubLObjectFactory.makeSymbol("COMPUTE-THCL-STATUS-OF-FORT");
        $str26$_is_a_predicate = SubLObjectFactory.makeString(" is a predicate");
        $str27$_is_a_functor = SubLObjectFactory.makeString(" is a functor");
        $str28$_is_a_logical_operator = SubLObjectFactory.makeString(" is a logical operator");
        $str29$_is_a_microtheory = SubLObjectFactory.makeString(" is a microtheory");
        $str30$Allowing_ = SubLObjectFactory.makeString("Allowing ");
        $str31$__because_it_is_a_ClarifyingColle = SubLObjectFactory.makeString(", because it is a ClarifyingCollectionType");
        $str32$_is_too_general__generality___ = SubLObjectFactory.makeString(" is too general (generality = ");
        $str33$__vs_cutoff_of_ = SubLObjectFactory.makeString(", vs cutoff of ");
        $str34$_ = SubLObjectFactory.makeString(")");
        $str35$_fails_the_THCL_KB_subset_test = SubLObjectFactory.makeString(" fails the THCL KB subset test");
        $str36$_fails_a_cached_test = SubLObjectFactory.makeString(" fails a cached test");
        $str37$Sentence_arity_is_less_than_2____ = SubLObjectFactory.makeString("Sentence arity is less than 2:~% ~S");
        $str38$Sentence_uses_a_function_and_its_ = SubLObjectFactory.makeString("Sentence uses a function and its corresponding predicate:~% ~S");
        $const39$CandidateForPredicatePopulation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CandidateForPredicatePopulation"));
        $str40$Non_THCL_arg___S = SubLObjectFactory.makeString("Non-THCL arg: ~S");
        $list41 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CapabilityPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IncapabilityPredicate")));
        $const42$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const43$QuantificationalRuleMacroPredicat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantificationalRuleMacroPredicate-Canonical"));
        $const44$valueOfFunctionForArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("valueOfFunctionForArgs"));
        $sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE = SubLObjectFactory.makeSymbol("FUNCTIONS-CORRESPONDING-TO-PREDICATE");
        $const46$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym47$_FN = SubLObjectFactory.makeSymbol("?FN");
        $const48$functionCorrespondingPredicate_Ge = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionCorrespondingPredicate-Generic"));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?N"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $const51$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $str52$_S_is_RKF_irrelevant_in___BaseKB_ = SubLObjectFactory.makeString("~S is RKF-irrelevant in #$BaseKB.");
        $const53$IntermediateVocabPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntermediateVocabPredicate"));
        $str54$_S_is_an___IntermediateVocabPredi = SubLObjectFactory.makeString("~S is an #$IntermediateVocabPredicate.");
        $const55$CycLTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLTerm"));
        $sym56$GENL_ = SubLObjectFactory.makeSymbol("GENL?");
        $list57 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")));
        $str58$_S_has_a_quoted___CycLTerm_argume = SubLObjectFactory.makeString("~S has a quoted #$CycLTerm argument.");
        $list59 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryRolePredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VectorOrQuantitySlot")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KindLevelPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CapabilityPredicate")));
        $sym60$NON_THCL_ARG_ = SubLObjectFactory.makeSymbol("NON-THCL-ARG?");
        $const61$ResearchCycDefinitionalPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResearchCycDefinitionalPredicate"));
        $str62$Allowing__S_as_arg_of_non_definit = SubLObjectFactory.makeString("Allowing ~S as arg of non-definitional predicate ~S");
        $const63$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $int64$500 = SubLObjectFactory.makeInteger(500);
        $str65$Allowing__S_as_arg_of___genlPreds = SubLObjectFactory.makeString("Allowing ~S as arg of #$genlPreds");
        $str66$Non_thcl_arg___S = SubLObjectFactory.makeString("Non-thcl arg: ~S");
        $sym67$FORT_PASSES_CACHED_THCL_TESTS_ = SubLObjectFactory.makeSymbol("FORT-PASSES-CACHED-THCL-TESTS?");
        $sym68$_FORT_PASSES_CACHED_THCL_TESTS__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FORT-PASSES-CACHED-THCL-TESTS?-CACHING-STATE*");
        $list69 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DocumentationConstant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Format")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComputerCode")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLQuerySpecification")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Assignment-Specification")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Allotment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Evaluating")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KEInteractionResource")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KBContentTest")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComputerVulnerabilityReport-CW")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BugReport")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BugzillaBugReportType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Allotment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynset")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DealingWithAStringInNounLearnerTool")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SoftwareAgentCommunicating")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KBContentTest")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoaDiagramObject")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReferenceWorkEntry")) });
        $list70 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DocumentationConstant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplementationConstant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndexicalConcept")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UMLFORT")));
        $list71 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now")));
        $list72 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationalStructure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Set-Mathematical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression")));
        $const73$highlyRelevantTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("highlyRelevantTerm"));
        $str74$_S_is_a___highlyRelevantTerm__so_ = SubLObjectFactory.makeString("~S is a #$highlyRelevantTerm, so not filtering...");
        $const75$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $str76$_S_is_an_instance_of____S = SubLObjectFactory.makeString("~S is an instance of~% ~S");
        $str77$_S_is_a_NART_and_is_an_instance_o = SubLObjectFactory.makeString("~S is a NART and is an instance of one of~% ~S");
        $str78$_S_is_a_lexical_word = SubLObjectFactory.makeString("~S is a lexical word");
        $str79$_S_is_a_quoted_instance_of_one_of = SubLObjectFactory.makeString("~S is a quoted instance of one of~% ~S");
        $list80 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BUTLERAgent")));
        $str81$_S_was_created_by__S = SubLObjectFactory.makeString("~S was created by ~S");
        $const82$CollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionType"));
        $str83$_S_is_either_a___CollectionType_o = SubLObjectFactory.makeString("~S is either a #$CollectionType or a spec of one of~% ~S");
        $const84$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE = SubLObjectFactory.makeSymbol("KE-IRRELEVANT-TERM?-VIA-INFERENCE");
        $const86$keIrrelevantTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantTerm"));
        $sym87$_KE_IRRELEVANT_TERM__VIA_INFERENCE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*KE-IRRELEVANT-TERM?-VIA-INFERENCE-CACHING-STATE*");
        $int88$10000 = SubLObjectFactory.makeInteger(10000);
        $sym89$CLARIFYING_COLLECTION_ = SubLObjectFactory.makeSymbol("CLARIFYING-COLLECTION?");
        $const90$ClarifyingCollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ClarifyingCollectionType"));
        $sym91$_CLARIFYING_COLLECTION__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CLARIFYING-COLLECTION?-CACHING-STATE*");
        $sym92$CLEAR_CLARIFYING_COLLECTION_ = SubLObjectFactory.makeSymbol("CLEAR-CLARIFYING-COLLECTION?");
    }
}

/*

	Total time: 359 ms
	
*/