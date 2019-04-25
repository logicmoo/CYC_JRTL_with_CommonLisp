package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class golem_satisfaction extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.golem_satisfaction";
    public static final String myFingerPrint = "8cc8b1b802684ecf998a273ca02b1c34c6f70f45da3a58b7745566605982cfe4";
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 1886L)
    private static SubLSymbol $golem_debugP$;
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 1923L)
    private static SubLSymbol $golem_node$;
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8188L)
    private static SubLSymbol $golem_correspondence_result_tuples$;
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8278L)
    private static SubLSymbol $golem_current_correspondence$;
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8347L)
    private static SubLSymbol $golem_handled_roles$;
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8416L)
    private static SubLSymbol $golem_handled_sentences$;
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8485L)
    private static SubLSymbol $golem_remaining_roles$;
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8554L)
    private static SubLSymbol $golem_remaining_sentences$;
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8623L)
    private static SubLSymbol $golem_candidate_count_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 23969L)
    private static SubLSymbol $relevant_golems$;
    private static final SubLString $str0$__Attempting_match______model___S;
    private static final SubLString $str1$____node___S;
    private static final SubLString $str2$__Model_has_no_preconditions___S;
    private static final SubLString $str3$Vacuous_correspondence_ignored___;
    private static final SubLString $str4$__Not_a_recognized_node_type___S;
    private static final SubLSymbol $sym5$_EXIT;
    private static final SubLString $str6$__chosen_correspondence___S;
    private static final SubLSymbol $sym7$_;
    private static final SubLSymbol $sym8$LENGTH;
    private static final SubLString $str9$__candidate_correspondence___S;
    private static final SubLSymbol $kw10$UNINITIALIZED;
    private static final SubLSymbol $sym11$REVERSE;
    private static final SubLSymbol $sym12$FIRST;
    private static final SubLList $list13;
    private static final SubLString $str14$__prior_role_inapplicable_wrt_typ;
    private static final SubLString $str15$__handled_already___S;
    private static final SubLString $str16$__role_inapplicable_wrt_types____;
    private static final SubLString $str17$________;
    private static final SubLString $str18$A_correspondence___S__;
    private static final SubLString $str19$A_handled_role__S__;
    private static final SubLString $str20$A_remaining_role__S__;
    private static final SubLString $str21$A_remaining_sentence__S__;
    private static final SubLString $str22$A_handled_sentence__S__;
    private static final SubLString $str23$__handled___S;
    private static final SubLSymbol $sym24$THIRD;
    private static final SubLString $str25$__A_candidate_data___S__;
    private static final SubLString $str26$__Maximal_candidate_data___S__;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$POSSIBLY_GOLEM_TERM_;
    private static final SubLString $str29$__Extending_sentence____S;
    private static final SubLList $list30;
    private static final SubLString $str31$__WARNING__More_than__A_candidate;
    private static final SubLString $str32$A_candidate_data__role__object___;
    private static final SubLList $list33;
    private static final SubLString $str34$__Unsatisfied_precondition____S;
    private static final SubLObject $const35$SomeFn;
    private static final SubLSymbol $sym36$GOLEM_CANDIDATE_EXTENSION_QUERY;
    private static final SubLString $str37$____Asking___ROLE__S__SENTENCE__S;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$GOLEM_SENTENCE_SATISFIED_;
    private static final SubLObject $const40$preconditionFor_PropSit;
    private static final SubLSymbol $sym41$_SENTENCE;
    private static final SubLSymbol $kw42$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw43$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw44$HL;
    private static final SubLSymbol $kw45$RETURN;
    private static final SubLList $list46;
    private static final SubLObject $const47$problemNodeRoleForEventFilledByVa;
    private static final SubLSymbol $kw48$IGNORE;
    private static final SubLSymbol $sym49$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $kw50$GAF;
    private static final SubLSymbol $kw51$TRUE;
    private static final SubLObject $const52$primaryGolemOfModelMt;
    private static final SubLObject $const53$relevantTermForGolemSatisfiabilit;
    private static final SubLSymbol $sym54$KBEQ;
    private static final SubLString $str55$No___primaryGolemInModel_for__S;
    private static final SubLString $str56$__irrelevant_precondition___S;
    private static final SubLSymbol $kw57$MT;
    private static final SubLSymbol $kw58$BROAD_MT;
    private static final SubLString $str59$do_broad_mt_index;
    private static final SubLSymbol $sym60$STRINGP;
    private static final SubLSymbol $kw61$SKIP;
    private static final SubLSymbol $sym62$GOLEM_GAF_FORMULA;
    private static final SubLSymbol $sym63$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym64$GOLEM_GAF_RELEVANT_WITNESS_;
    private static final SubLSymbol $sym65$GOLEM_GAF_IRRELEVANT_WITNESS_;
    private static final SubLObject $const66$golemSentence;
    private static final SubLObject $const67$satisfiableGolemInModel;
    private static final SubLSymbol $kw68$POS;
    private static final SubLSymbol $kw69$REMOVAL_SATISFIABLE_GOLEM_IN_MODEL_CHECK_POS;
    private static final SubLList $list70;
    private static final SubLObject $const71$satisfyingGolemInModelProducesCor;
    private static final SubLSymbol $kw72$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_CHECK_POS;
    private static final SubLList $list73;
    private static final SubLSymbol $kw74$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_GENERATE_POS;
    private static final SubLList $list75;
    private static final SubLObject $const76$satisfiableGolemInModelGivenParti;
    private static final SubLSymbol $kw77$REMOVAL_GOLEM_SATISFACTION_GIVEN_PARTIAL_CORRESPONDENCE_CHECK_POS;
    private static final SubLList $list78;
    private static final SubLObject $const79$satisfiableGolemInModelAtNode;
    private static final SubLSymbol $kw80$REMOVAL_GOLEM_SATISFACTION_AT_NODE_CHECK_POS;
    private static final SubLList $list81;
    private static final SubLObject $const82$golemOfModelMt;
    private static final SubLSymbol $kw83$REMOVAL_GOLEMOFMODELMT;
    private static final SubLList $list84;
    private static final SubLObject $const85$GolemModelMicrotheory;
    private static final SubLObject $const86$TheTerm;
    private static final SubLSymbol $sym87$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const88$EverythingPSC;
    private static final SubLSymbol $sym89$POSSIBLE_GOLEM_OF_A_MODEL_MT_;
    private static final SubLSymbol $kw90$MAPPING_DONE;
    private static final SubLSymbol $kw91$ISA;
    private static final SubLObject $const92$quotedIsa;
    private static final SubLObject $const93$BaseKB;
    private static final SubLObject $const94$isa;
    private static final SubLObject $const95$InferencePSC;
    private static final SubLSymbol $kw96$QUERY;
    private static final SubLObject $const97$thereExists;
    private static final SubLSymbol $sym98$_N;
    private static final SubLObject $const99$and;
    private static final SubLObject $const100$argN;
    private static final SubLList $list101;
    private static final SubLObject $const102$ist_Asserted;
    private static final SubLList $list103;
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 1964L)
    public static SubLObject golem_satisfiableP(final SubLObject golem_mt, final SubLObject golem, final SubLObject v_object, SubLObject object_mt) {
        if (object_mt == golem_satisfaction.UNPROVIDED) {
            object_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (golem_satisfaction.NIL != golem_satisfaction_produces_correspondence(golem_mt, golem, v_object, (SubLObject)golem_satisfaction.NIL, object_mt)) {
            return (SubLObject)golem_satisfaction.T;
        }
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 2369L)
    public static SubLObject golem_satisfaction_produces_correspondence(final SubLObject golem_mt, final SubLObject golem, final SubLObject v_object, SubLObject partial_correspondence, SubLObject object_mt) {
        if (partial_correspondence == golem_satisfaction.UNPROVIDED) {
            partial_correspondence = (SubLObject)golem_satisfaction.NIL;
        }
        if (object_mt == golem_satisfaction.UNPROVIDED) {
            object_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str0$__Attempting_match______model___S, golem_mt, golem, v_object, object_mt, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
            if (golem_satisfaction.NIL != golem_satisfaction.$golem_node$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str1$____node___S, golem_satisfaction.$golem_node$.getDynamicValue(thread), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
            }
        }
        final SubLObject preconditions = golem_precondition_sentences(golem, golem_mt);
        if (golem_satisfaction.NIL == preconditions && golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str2$__Model_has_no_preconditions___S, golem_mt, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
        }
        if (golem_satisfaction.NIL != preconditions) {
            final SubLObject correspondence = golem_to_object_arbitrary_maximal_correspondence(golem, golem_mt, v_object, partial_correspondence, object_mt);
            if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread) && golem_satisfaction.NIL != list_utilities.lengthE(correspondence, (SubLObject)golem_satisfaction.ONE_INTEGER, (SubLObject)golem_satisfaction.UNPROVIDED)) {
                format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str3$Vacuous_correspondence_ignored___, correspondence, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
            }
            if (golem_satisfaction.NIL != list_utilities.lengthGE(correspondence, (SubLObject)golem_satisfaction.TWO_INTEGER, (SubLObject)golem_satisfaction.UNPROVIDED) && golem_satisfaction.NIL != golem_correspondence_satisfies_preconditions(correspondence, preconditions, object_mt)) {
                return correspondence;
            }
        }
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 4004L)
    public static SubLObject golem_satisfiable_with_partial_correspondenceP(final SubLObject golem_mt, final SubLObject golem, final SubLObject v_object, final SubLObject partial_correspondence, SubLObject object_mt) {
        if (object_mt == golem_satisfaction.UNPROVIDED) {
            object_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (golem_satisfaction.NIL != golem_satisfaction_produces_correspondence(golem_mt, golem, v_object, partial_correspondence, object_mt)) {
            return (SubLObject)golem_satisfaction.T;
        }
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 4529L)
    public static SubLObject golem_satisfiable_at_nodeP(final SubLObject golem_mt, final SubLObject golem, final SubLObject v_object, final SubLObject node, SubLObject object_mt) {
        if (object_mt == golem_satisfaction.UNPROVIDED) {
            object_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (golem_satisfaction.NIL == term.nautP(node, (SubLObject)golem_satisfaction.UNPROVIDED)) {
            if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str4$__Not_a_recognized_node_type___S, node, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
            }
            return (SubLObject)golem_satisfaction.NIL;
        }
        final SubLObject _prev_bind_0 = golem_satisfaction.$golem_node$.currentBinding(thread);
        try {
            golem_satisfaction.$golem_node$.bind(node, thread);
            if (golem_satisfaction.NIL != golem_satisfaction_produces_correspondence(golem_mt, golem, v_object, (SubLObject)golem_satisfaction.NIL, object_mt)) {
                return (SubLObject)golem_satisfaction.T;
            }
        }
        finally {
            golem_satisfaction.$golem_node$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 5026L)
    public static SubLObject golem_to_object_arbitrary_maximal_correspondence(final SubLObject golem, final SubLObject golem_mt, final SubLObject v_object, final SubLObject partial_correspondence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject maximal_correspondences = golem_to_object_maximal_correspondences(golem, golem_mt, v_object, partial_correspondence, mt);
        if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str6$__chosen_correspondence___S, maximal_correspondences.first(), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
        }
        return maximal_correspondences.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 5733L)
    public static SubLObject golem_to_object_maximal_correspondences(final SubLObject golem, final SubLObject golem_mt, final SubLObject v_object, final SubLObject partial_correspondence, final SubLObject mt) {
        final SubLObject all_correspondences = golem_to_object_correspondences(golem, golem_mt, v_object, partial_correspondence, mt);
        final SubLObject sorted_correspondences = Sort.sort(all_correspondences, Symbols.symbol_function((SubLObject)golem_satisfaction.$sym7$_), Symbols.symbol_function((SubLObject)golem_satisfaction.$sym8$LENGTH));
        final SubLObject maximal_correspondence_size = Sequences.length(sorted_correspondences.first());
        final SubLObject maximal_correspondences = Sequences.remove(maximal_correspondence_size, sorted_correspondences, Symbols.symbol_function((SubLObject)golem_satisfaction.$sym7$_), Symbols.symbol_function((SubLObject)golem_satisfaction.$sym8$LENGTH), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
        return maximal_correspondences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 6424L)
    public static SubLObject golem_to_object_correspondences(final SubLObject golem, final SubLObject golem_mt, final SubLObject v_object, final SubLObject partial_correspondence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject golem_terms = golem_roles_relevant_to_satisfiability(golem_mt);
        final SubLObject golem_sentences = all_golem_sentences_wrt_roles(golem_terms, golem_mt);
        final SubLObject correspondences = (golem_satisfaction.NIL != partial_correspondence) ? golem_to_object_correspondences_from_partial(golem, golem_terms, golem_sentences, v_object, partial_correspondence, mt) : golem_to_object_correspondences_among(golem, golem_terms, golem_sentences, v_object, mt);
        if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = correspondences;
            SubLObject correspondence = (SubLObject)golem_satisfaction.NIL;
            correspondence = cdolist_list_var.first();
            while (golem_satisfaction.NIL != cdolist_list_var) {
                format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str9$__candidate_correspondence___S, correspondence, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                correspondence = cdolist_list_var.first();
            }
        }
        return correspondences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8681L)
    public static SubLObject golem_to_object_correspondences_among(final SubLObject golem, final SubLObject golem_terms, final SubLObject golem_sentences, final SubLObject v_object, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_tuples = (SubLObject)golem_satisfaction.NIL;
        final SubLObject _prev_bind_0 = golem_satisfaction.$golem_correspondence_result_tuples$.currentBinding(thread);
        final SubLObject _prev_bind_2 = golem_satisfaction.$golem_handled_roles$.currentBinding(thread);
        final SubLObject _prev_bind_3 = golem_satisfaction.$golem_handled_sentences$.currentBinding(thread);
        try {
            golem_satisfaction.$golem_correspondence_result_tuples$.bind((SubLObject)golem_satisfaction.NIL, thread);
            golem_satisfaction.$golem_handled_roles$.bind((SubLObject)golem_satisfaction.NIL, thread);
            golem_satisfaction.$golem_handled_sentences$.bind((SubLObject)golem_satisfaction.NIL, thread);
            golem_extend_correspondence_recursive(golem, v_object, mt, (SubLObject)golem_satisfaction.NIL, golem_terms, golem_sentences);
            result_tuples = golem_satisfaction.$golem_correspondence_result_tuples$.getDynamicValue(thread);
        }
        finally {
            golem_satisfaction.$golem_handled_sentences$.rebind(_prev_bind_3, thread);
            golem_satisfaction.$golem_handled_roles$.rebind(_prev_bind_2, thread);
            golem_satisfaction.$golem_correspondence_result_tuples$.rebind(_prev_bind_0, thread);
        }
        final SubLObject correspondences = Mapping.mapcar(Symbols.symbol_function((SubLObject)golem_satisfaction.$sym11$REVERSE), Mapping.mapcar(Symbols.symbol_function((SubLObject)golem_satisfaction.$sym12$FIRST), result_tuples));
        return correspondences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 9285L)
    public static SubLObject golem_to_object_correspondences_from_partial(final SubLObject golem, final SubLObject golem_roles, final SubLObject golem_sentences, final SubLObject v_object, final SubLObject partial_correspondence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_tuples = (SubLObject)golem_satisfaction.NIL;
        thread.resetMultipleValues();
        final SubLObject verified = verify_partial_correspondence(golem_roles, golem_sentences, mt, partial_correspondence);
        final SubLObject remaining_roles = thread.secondMultipleValue();
        final SubLObject remaining_sentences = thread.thirdMultipleValue();
        final SubLObject handled_roles = thread.fourthMultipleValue();
        final SubLObject handled_sentences = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (golem_satisfaction.NIL != verified) {
            final SubLObject _prev_bind_0 = golem_satisfaction.$golem_correspondence_result_tuples$.currentBinding(thread);
            final SubLObject _prev_bind_2 = golem_satisfaction.$golem_handled_roles$.currentBinding(thread);
            final SubLObject _prev_bind_3 = golem_satisfaction.$golem_handled_sentences$.currentBinding(thread);
            try {
                golem_satisfaction.$golem_correspondence_result_tuples$.bind((SubLObject)golem_satisfaction.NIL, thread);
                golem_satisfaction.$golem_handled_roles$.bind(handled_roles, thread);
                golem_satisfaction.$golem_handled_sentences$.bind(handled_sentences, thread);
                if (golem_satisfaction.NIL != conses_high.member(golem, remaining_roles, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED)) {
                    golem_extend_correspondence_recursive(golem, v_object, mt, partial_correspondence, remaining_roles, remaining_sentences);
                }
                else {
                    golem_find_next_candidate_and_extend_correspondence(mt, partial_correspondence, remaining_roles, remaining_sentences);
                }
                result_tuples = golem_satisfaction.$golem_correspondence_result_tuples$.getDynamicValue(thread);
            }
            finally {
                golem_satisfaction.$golem_handled_sentences$.rebind(_prev_bind_3, thread);
                golem_satisfaction.$golem_handled_roles$.rebind(_prev_bind_2, thread);
                golem_satisfaction.$golem_correspondence_result_tuples$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject correspondences = Mapping.mapcar(Symbols.symbol_function((SubLObject)golem_satisfaction.$sym11$REVERSE), Mapping.mapcar(Symbols.symbol_function((SubLObject)golem_satisfaction.$sym12$FIRST), result_tuples));
        return correspondences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 10528L)
    public static SubLObject verify_partial_correspondence(final SubLObject golem_roles, final SubLObject golem_sentences, final SubLObject mt, final SubLObject partial_correspondence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject remaining_roles = golem_roles;
        SubLObject handled_roles = (SubLObject)golem_satisfaction.NIL;
        SubLObject cdolist_list_var = partial_correspondence;
        SubLObject binding = (SubLObject)golem_satisfaction.NIL;
        binding = cdolist_list_var.first();
        while (golem_satisfaction.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject role = (SubLObject)golem_satisfaction.NIL;
            SubLObject v_object = (SubLObject)golem_satisfaction.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)golem_satisfaction.$list13);
            role = current.first();
            current = (v_object = current.rest());
            if (golem_satisfaction.NIL == golem_binding_valid_wrt_typesP(role, v_object, mt)) {
                if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str14$__prior_role_inapplicable_wrt_typ, role, v_object, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
                }
                return (SubLObject)golem_satisfaction.NIL;
            }
            final SubLObject item_var = role;
            if (golem_satisfaction.NIL == conses_high.member(item_var, handled_roles, Symbols.symbol_function((SubLObject)golem_satisfaction.EQL), Symbols.symbol_function((SubLObject)golem_satisfaction.IDENTITY))) {
                handled_roles = (SubLObject)ConsesLow.cons(item_var, handled_roles);
            }
            remaining_roles = Sequences.remove(role, remaining_roles, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        SubLObject remaining_sentences = bindings.apply_bindings(partial_correspondence, golem_sentences);
        SubLObject handled_sentences = (SubLObject)golem_satisfaction.NIL;
        SubLObject cdolist_list_var2 = remaining_sentences;
        SubLObject golem_sentence = (SubLObject)golem_satisfaction.NIL;
        golem_sentence = cdolist_list_var2.first();
        while (golem_satisfaction.NIL != cdolist_list_var2) {
            if (golem_sentence_role_count(golem_sentence, (SubLObject)golem_satisfaction.UNPROVIDED).isZero() && golem_satisfaction.NIL != golem_sentence_satisfiedP(golem_sentence, mt, (SubLObject)golem_satisfaction.UNPROVIDED)) {
                if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str15$__handled_already___S, golem_sentence, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
                }
                handled_sentences = (SubLObject)ConsesLow.cons(golem_sentence, handled_sentences);
                remaining_sentences = Sequences.delete(golem_sentence, remaining_sentences, Symbols.symbol_function((SubLObject)golem_satisfaction.EQUAL), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            golem_sentence = cdolist_list_var2.first();
        }
        return Values.values((SubLObject)golem_satisfaction.T, remaining_roles, remaining_sentences, handled_roles, handled_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 12138L)
    public static SubLObject golem_extend_correspondence_recursive(final SubLObject role, final SubLObject v_object, final SubLObject mt, final SubLObject correspondence, final SubLObject golem_roles, final SubLObject golem_sentences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (golem_satisfaction.NIL == golem_binding_valid_wrt_typesP(role, v_object, mt)) {
            if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str16$__role_inapplicable_wrt_types____, role, v_object, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
            }
            return (SubLObject)golem_satisfaction.NIL;
        }
        final SubLObject _prev_bind_0 = golem_satisfaction.$golem_current_correspondence$.currentBinding(thread);
        final SubLObject _prev_bind_2 = golem_satisfaction.$golem_handled_roles$.currentBinding(thread);
        final SubLObject _prev_bind_3 = golem_satisfaction.$golem_remaining_roles$.currentBinding(thread);
        final SubLObject _prev_bind_4 = golem_satisfaction.$golem_remaining_sentences$.currentBinding(thread);
        final SubLObject _prev_bind_5 = golem_satisfaction.$golem_handled_sentences$.currentBinding(thread);
        try {
            golem_satisfaction.$golem_current_correspondence$.bind(conses_high.adjoin(bindings.make_variable_binding(role, v_object), correspondence, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED), thread);
            golem_satisfaction.$golem_handled_roles$.bind(conses_high.adjoin(role, conses_high.copy_list(golem_satisfaction.$golem_handled_roles$.getDynamicValue(thread)), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED), thread);
            golem_satisfaction.$golem_remaining_roles$.bind(Sequences.remove(role, golem_roles, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED), thread);
            golem_satisfaction.$golem_remaining_sentences$.bind(bindings.apply_bindings(golem_satisfaction.$golem_current_correspondence$.getDynamicValue(thread), golem_sentences), thread);
            golem_satisfaction.$golem_handled_sentences$.bind(conses_high.copy_list(golem_satisfaction.$golem_handled_sentences$.getDynamicValue(thread)), thread);
            if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str17$________);
                SubLObject cdolist_list_var = golem_satisfaction.$golem_current_correspondence$.getDynamicValue(thread);
                SubLObject a_correspondence = (SubLObject)golem_satisfaction.NIL;
                a_correspondence = cdolist_list_var.first();
                while (golem_satisfaction.NIL != cdolist_list_var) {
                    PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str18$A_correspondence___S__, a_correspondence);
                    cdolist_list_var = cdolist_list_var.rest();
                    a_correspondence = cdolist_list_var.first();
                }
                cdolist_list_var = golem_satisfaction.$golem_handled_roles$.getDynamicValue(thread);
                SubLObject a_handled_role = (SubLObject)golem_satisfaction.NIL;
                a_handled_role = cdolist_list_var.first();
                while (golem_satisfaction.NIL != cdolist_list_var) {
                    PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str19$A_handled_role__S__, a_handled_role);
                    cdolist_list_var = cdolist_list_var.rest();
                    a_handled_role = cdolist_list_var.first();
                }
                cdolist_list_var = golem_satisfaction.$golem_remaining_roles$.getDynamicValue(thread);
                SubLObject a_remaining_role = (SubLObject)golem_satisfaction.NIL;
                a_remaining_role = cdolist_list_var.first();
                while (golem_satisfaction.NIL != cdolist_list_var) {
                    PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str20$A_remaining_role__S__, a_remaining_role);
                    cdolist_list_var = cdolist_list_var.rest();
                    a_remaining_role = cdolist_list_var.first();
                }
                cdolist_list_var = golem_satisfaction.$golem_remaining_sentences$.getDynamicValue(thread);
                SubLObject a_remaining_sentence = (SubLObject)golem_satisfaction.NIL;
                a_remaining_sentence = cdolist_list_var.first();
                while (golem_satisfaction.NIL != cdolist_list_var) {
                    PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str21$A_remaining_sentence__S__, a_remaining_sentence);
                    cdolist_list_var = cdolist_list_var.rest();
                    a_remaining_sentence = cdolist_list_var.first();
                }
                cdolist_list_var = golem_satisfaction.$golem_handled_sentences$.getDynamicValue(thread);
                SubLObject a_handled_sentence = (SubLObject)golem_satisfaction.NIL;
                a_handled_sentence = cdolist_list_var.first();
                while (golem_satisfaction.NIL != cdolist_list_var) {
                    PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str22$A_handled_sentence__S__, a_handled_sentence);
                    cdolist_list_var = cdolist_list_var.rest();
                    a_handled_sentence = cdolist_list_var.first();
                }
                PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str17$________);
            }
            SubLObject cdolist_list_var = conses_high.copy_list(golem_satisfaction.$golem_remaining_sentences$.getDynamicValue(thread));
            SubLObject golem_sentence = (SubLObject)golem_satisfaction.NIL;
            golem_sentence = cdolist_list_var.first();
            while (golem_satisfaction.NIL != cdolist_list_var) {
                if (golem_sentence_role_count(golem_sentence, (SubLObject)golem_satisfaction.UNPROVIDED).isZero() && golem_satisfaction.NIL != golem_sentence_satisfiedP(golem_sentence, mt, (SubLObject)golem_satisfaction.UNPROVIDED)) {
                    if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
                        format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str23$__handled___S, golem_sentence, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
                    }
                    golem_satisfaction.$golem_handled_sentences$.setDynamicValue((SubLObject)ConsesLow.cons(golem_sentence, golem_satisfaction.$golem_handled_sentences$.getDynamicValue(thread)), thread);
                    golem_satisfaction.$golem_remaining_sentences$.setDynamicValue(Sequences.delete(golem_sentence, golem_satisfaction.$golem_remaining_sentences$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)golem_satisfaction.EQUAL), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED), thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                golem_sentence = cdolist_list_var.first();
            }
            golem_find_next_candidate_and_extend_correspondence(mt, golem_satisfaction.$golem_current_correspondence$.getDynamicValue(thread), golem_satisfaction.$golem_remaining_roles$.getDynamicValue(thread), golem_satisfaction.$golem_remaining_sentences$.getDynamicValue(thread));
        }
        finally {
            golem_satisfaction.$golem_handled_sentences$.rebind(_prev_bind_5, thread);
            golem_satisfaction.$golem_remaining_sentences$.rebind(_prev_bind_4, thread);
            golem_satisfaction.$golem_remaining_roles$.rebind(_prev_bind_3, thread);
            golem_satisfaction.$golem_handled_roles$.rebind(_prev_bind_2, thread);
            golem_satisfaction.$golem_current_correspondence$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 14087L)
    public static SubLObject golem_find_next_candidate_and_extend_correspondence(final SubLObject mt, final SubLObject correspondence, final SubLObject remaining_roles, final SubLObject remaining_sentences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject extension_candidate_data = golem_compute_candidate_extension_map(remaining_roles, remaining_sentences, mt);
        final SubLObject maximal_extension_datum = list_utilities.extremal(extension_candidate_data, Symbols.symbol_function((SubLObject)golem_satisfaction.$sym7$_), Symbols.symbol_function((SubLObject)golem_satisfaction.$sym24$THIRD));
        if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str17$________);
            SubLObject cdolist_list_var = extension_candidate_data;
            SubLObject a_candidate = (SubLObject)golem_satisfaction.NIL;
            a_candidate = cdolist_list_var.first();
            while (golem_satisfaction.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str25$__A_candidate_data___S__, a_candidate);
                cdolist_list_var = cdolist_list_var.rest();
                a_candidate = cdolist_list_var.first();
            }
            PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str26$__Maximal_candidate_data___S__, maximal_extension_datum);
        }
        if (golem_satisfaction.NIL != maximal_extension_datum) {
            SubLObject current;
            final SubLObject datum = current = maximal_extension_datum;
            SubLObject next_role = (SubLObject)golem_satisfaction.NIL;
            SubLObject next_object = (SubLObject)golem_satisfaction.NIL;
            SubLObject handled_count = (SubLObject)golem_satisfaction.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)golem_satisfaction.$list27);
            next_role = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)golem_satisfaction.$list27);
            next_object = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)golem_satisfaction.$list27);
            handled_count = current.first();
            current = current.rest();
            if (golem_satisfaction.NIL == current) {
                golem_extend_correspondence_recursive(next_role, next_object, mt, correspondence, remaining_roles, remaining_sentences);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)golem_satisfaction.$list27);
            }
        }
        else {
            final SubLObject result_tuple = (SubLObject)ConsesLow.list(correspondence, Sequences.length(golem_satisfaction.$golem_handled_roles$.getDynamicValue(thread)), Sequences.length(golem_satisfaction.$golem_handled_sentences$.getDynamicValue(thread)));
            golem_satisfaction.$golem_correspondence_result_tuples$.setDynamicValue((SubLObject)ConsesLow.cons(result_tuple, golem_satisfaction.$golem_correspondence_result_tuples$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 15226L)
    public static SubLObject golem_compute_candidate_extension_map(final SubLObject golem_roles, final SubLObject golem_sentences, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject candidates_mapping = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)golem_satisfaction.EQUAL), (SubLObject)golem_satisfaction.UNPROVIDED);
        SubLObject cdolist_list_var = golem_sentences;
        SubLObject golem_sentence = (SubLObject)golem_satisfaction.NIL;
        golem_sentence = cdolist_list_var.first();
        while (golem_satisfaction.NIL != cdolist_list_var) {
            final SubLObject remaining_roles = conses_high.intersection(golem_roles, cycl_utilities.expression_gather(golem_sentence, (SubLObject)golem_satisfaction.$sym28$POSSIBLY_GOLEM_TERM_, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
            if (golem_satisfaction.NIL != list_utilities.singletonP(remaining_roles)) {
                if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str29$__Extending_sentence____S, golem_sentence, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
                }
                SubLObject current;
                final SubLObject datum = current = remaining_roles;
                SubLObject candidate_role = (SubLObject)golem_satisfaction.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)golem_satisfaction.$list30);
                candidate_role = current.first();
                current = current.rest();
                if (golem_satisfaction.NIL == current) {
                    final SubLObject candidate_objects = golem_candidate_extension_query(candidate_role, golem_sentence, mt, (SubLObject)golem_satisfaction.UNPROVIDED);
                    if (Sequences.length(candidate_objects).numG(golem_satisfaction.$golem_candidate_count_limit$.getDynamicValue(thread))) {
                        if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
                            PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str31$__WARNING__More_than__A_candidate, new SubLObject[] { golem_satisfaction.$golem_candidate_count_limit$.getDynamicValue(thread), candidate_role, golem_sentence });
                        }
                    }
                    else {
                        SubLObject cdolist_list_var_$1 = candidate_objects;
                        SubLObject candidate_object = (SubLObject)golem_satisfaction.NIL;
                        candidate_object = cdolist_list_var_$1.first();
                        while (golem_satisfaction.NIL != cdolist_list_var_$1) {
                            if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
                                PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str32$A_candidate_data__role__object___, candidate_role, candidate_object);
                            }
                            final SubLObject candidate_binding = bindings.make_variable_binding(candidate_role, candidate_object);
                            dictionary_utilities.dictionary_increment(candidates_mapping, candidate_binding, (SubLObject)golem_satisfaction.UNPROVIDED);
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            candidate_object = cdolist_list_var_$1.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)golem_satisfaction.$list30);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            golem_sentence = cdolist_list_var.first();
        }
        SubLObject result_map = (SubLObject)golem_satisfaction.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(candidates_mapping)); golem_satisfaction.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject candidate_binding2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject current2;
            final SubLObject datum2 = current2 = candidate_binding2;
            SubLObject candidate_role2 = (SubLObject)golem_satisfaction.NIL;
            SubLObject candidate_object2 = (SubLObject)golem_satisfaction.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)golem_satisfaction.$list33);
            candidate_role2 = current2.first();
            current2 = (candidate_object2 = current2.rest());
            result_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(candidate_role2, candidate_object2, count), result_map);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sort.sort(result_map, Symbols.symbol_function((SubLObject)golem_satisfaction.$sym7$_), Symbols.symbol_function((SubLObject)golem_satisfaction.$sym24$THIRD));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 17002L)
    public static SubLObject golem_correspondence_satisfies_preconditions(final SubLObject correspondence, final SubLObject preconditions, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject situated_preconditions = bindings.apply_bindings(correspondence, preconditions);
        SubLObject unsatisfied_witness = (SubLObject)golem_satisfaction.NIL;
        if (golem_satisfaction.NIL == unsatisfied_witness) {
            SubLObject csome_list_var = situated_preconditions;
            SubLObject situated_precondition = (SubLObject)golem_satisfaction.NIL;
            situated_precondition = csome_list_var.first();
            while (golem_satisfaction.NIL == unsatisfied_witness && golem_satisfaction.NIL != csome_list_var) {
                if (golem_satisfaction.NIL == golem_precondition_satisfiedP(situated_precondition, mt)) {
                    unsatisfied_witness = situated_precondition;
                }
                csome_list_var = csome_list_var.rest();
                situated_precondition = csome_list_var.first();
            }
        }
        if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread) && golem_satisfaction.NIL != unsatisfied_witness) {
            format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str34$__Unsatisfied_precondition____S, unsatisfied_witness, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
        }
        return Values.values((SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL == unsatisfied_witness), unsatisfied_witness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 17939L)
    public static SubLObject golem_binding_valid_wrt_typesP(final SubLObject role, final SubLObject v_object, final SubLObject mt) {
        if (golem_satisfaction.NIL == cycl_grammar.cycl_unrepresented_term_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL != isa.min_isa(v_object, mt, (SubLObject)golem_satisfaction.UNPROVIDED) && golem_satisfaction.NIL == disjoint_with.instances_of_disjoint_collectionsP(role, v_object, mt, (SubLObject)golem_satisfaction.UNPROVIDED));
        }
        final SubLObject object_types = defns.min_defn_admits(v_object, mt);
        SubLObject witness = (SubLObject)golem_satisfaction.NIL;
        if (golem_satisfaction.NIL == witness) {
            SubLObject csome_list_var = object_types;
            SubLObject object_type = (SubLObject)golem_satisfaction.NIL;
            object_type = csome_list_var.first();
            while (golem_satisfaction.NIL == witness && golem_satisfaction.NIL != csome_list_var) {
                if (golem_satisfaction.NIL != disjoint_with.instances_of_disjoint_collectionsP(role, (SubLObject)ConsesLow.list(golem_satisfaction.$const35$SomeFn, object_type), mt, (SubLObject)golem_satisfaction.UNPROVIDED)) {
                    witness = object_type;
                }
                csome_list_var = csome_list_var.rest();
                object_type = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL == witness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 18779L)
    public static SubLObject golem_candidate_extension_query_internal(final SubLObject golem_role, final SubLObject golem_sentence, final SubLObject mt, SubLObject node) {
        if (node == golem_satisfaction.UNPROVIDED) {
            node = golem_satisfaction.$golem_node$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str37$____Asking___ROLE__S__SENTENCE__S, golem_role, golem_sentence, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
        }
        SubLObject result = (SubLObject)golem_satisfaction.NIL;
        final SubLObject parameters = (SubLObject)golem_satisfaction.$list38;
        result = ask_utilities.query_variable(golem_role, golem_sentence, mt, parameters);
        if (golem_satisfaction.NIL == result && golem_satisfaction.NIL != node && golem_satisfaction.NIL != el_utilities.el_binary_formula_p(golem_sentence)) {
            result = ask_utilities.query_variable(golem_role, golem_sentence_relative_to_node(golem_sentence, golem_satisfaction.$golem_node$.getDynamicValue(thread)), mt, parameters);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 18779L)
    public static SubLObject golem_candidate_extension_query(final SubLObject golem_role, final SubLObject golem_sentence, final SubLObject mt, SubLObject node) {
        if (node == golem_satisfaction.UNPROVIDED) {
            node = golem_satisfaction.$golem_node$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)golem_satisfaction.NIL;
        if (golem_satisfaction.NIL == v_memoization_state) {
            return golem_candidate_extension_query_internal(golem_role, golem_sentence, mt, node);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)golem_satisfaction.$sym36$GOLEM_CANDIDATE_EXTENSION_QUERY, (SubLObject)golem_satisfaction.UNPROVIDED);
        if (golem_satisfaction.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)golem_satisfaction.$sym36$GOLEM_CANDIDATE_EXTENSION_QUERY, (SubLObject)golem_satisfaction.FOUR_INTEGER, (SubLObject)golem_satisfaction.NIL, (SubLObject)golem_satisfaction.EQUAL, (SubLObject)golem_satisfaction.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)golem_satisfaction.$sym36$GOLEM_CANDIDATE_EXTENSION_QUERY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(golem_role, golem_sentence, mt, node);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)golem_satisfaction.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)golem_satisfaction.NIL;
            collision = cdolist_list_var.first();
            while (golem_satisfaction.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (golem_role.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (golem_sentence.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (golem_satisfaction.NIL != cached_args && golem_satisfaction.NIL == cached_args.rest() && node.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(golem_candidate_extension_query_internal(golem_role, golem_sentence, mt, node)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(golem_role, golem_sentence, mt, node));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 19431L)
    public static SubLObject golem_sentence_satisfiedP_internal(final SubLObject golem_sentence, final SubLObject mt, SubLObject node) {
        if (node == golem_satisfaction.UNPROVIDED) {
            node = golem_satisfaction.$golem_node$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)golem_satisfaction.NIL;
        result = inference_kernel.new_cyc_query(golem_sentence, mt, (SubLObject)golem_satisfaction.UNPROVIDED);
        if (golem_satisfaction.NIL == result && golem_satisfaction.NIL != node && golem_satisfaction.NIL != el_utilities.el_binary_formula_p(golem_sentence)) {
            result = inference_kernel.new_cyc_query(golem_sentence_relative_to_node(golem_sentence, golem_satisfaction.$golem_node$.getDynamicValue(thread)), mt, (SubLObject)golem_satisfaction.UNPROVIDED);
        }
        return list_utilities.sublisp_boolean(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 19431L)
    public static SubLObject golem_sentence_satisfiedP(final SubLObject golem_sentence, final SubLObject mt, SubLObject node) {
        if (node == golem_satisfaction.UNPROVIDED) {
            node = golem_satisfaction.$golem_node$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)golem_satisfaction.NIL;
        if (golem_satisfaction.NIL == v_memoization_state) {
            return golem_sentence_satisfiedP_internal(golem_sentence, mt, node);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)golem_satisfaction.$sym39$GOLEM_SENTENCE_SATISFIED_, (SubLObject)golem_satisfaction.UNPROVIDED);
        if (golem_satisfaction.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)golem_satisfaction.$sym39$GOLEM_SENTENCE_SATISFIED_, (SubLObject)golem_satisfaction.THREE_INTEGER, (SubLObject)golem_satisfaction.NIL, (SubLObject)golem_satisfaction.EQ, (SubLObject)golem_satisfaction.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)golem_satisfaction.$sym39$GOLEM_SENTENCE_SATISFIED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(golem_sentence, mt, node);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)golem_satisfaction.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)golem_satisfaction.NIL;
            collision = cdolist_list_var.first();
            while (golem_satisfaction.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (golem_sentence.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (golem_satisfaction.NIL != cached_args && golem_satisfaction.NIL == cached_args.rest() && node.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(golem_sentence_satisfiedP_internal(golem_sentence, mt, node)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(golem_sentence, mt, node));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 19853L)
    public static SubLObject golem_precondition_sentences(final SubLObject golem, final SubLObject golem_mt) {
        final SubLObject preconditions_query = (SubLObject)ConsesLow.list(golem_satisfaction.$const40$preconditionFor_PropSit, (SubLObject)golem_satisfaction.$sym41$_SENTENCE, golem);
        SubLObject precondition_sentences = inference_kernel.new_cyc_query(preconditions_query, golem_mt, (SubLObject)ConsesLow.list((SubLObject)golem_satisfaction.$kw42$MAX_TRANSFORMATION_DEPTH, (SubLObject)golem_satisfaction.ZERO_INTEGER, (SubLObject)golem_satisfaction.$kw43$ANSWER_LANGUAGE, (SubLObject)golem_satisfaction.$kw44$HL, (SubLObject)golem_satisfaction.$kw45$RETURN, (SubLObject)golem_satisfaction.$list46));
        precondition_sentences = golem_preconditions_filtered_wrt_relevant_roles(precondition_sentences, golem_mt);
        precondition_sentences = kb_utilities.sort_terms(precondition_sentences, (SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.NIL, (SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
        return precondition_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 20466L)
    public static SubLObject golem_precondition_satisfiedP(final SubLObject precondition_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (golem_sentence_role_count(precondition_sentence, mt).isZero()) {
            SubLObject result = inference_kernel.new_cyc_query(precondition_sentence, mt, (SubLObject)golem_satisfaction.UNPROVIDED);
            if (golem_satisfaction.NIL == result && golem_satisfaction.NIL != golem_satisfaction.$golem_node$.getDynamicValue(thread) && golem_satisfaction.NIL != el_utilities.el_binary_formula_p(precondition_sentence)) {
                result = inference_kernel.new_cyc_query(golem_sentence_relative_to_node(precondition_sentence, golem_satisfaction.$golem_node$.getDynamicValue(thread)), mt, (SubLObject)golem_satisfaction.UNPROVIDED);
            }
            return result;
        }
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 20912L)
    public static SubLObject golem_sentence_relative_to_node(final SubLObject golem_sentence, final SubLObject node) {
        final SubLObject problem = cycl_utilities.formula_arg1(node, (SubLObject)golem_satisfaction.UNPROVIDED);
        final SubLObject arg0 = cycl_utilities.formula_arg0(golem_sentence);
        final SubLObject arg2 = cycl_utilities.formula_arg1(golem_sentence, (SubLObject)golem_satisfaction.UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.formula_arg2(golem_sentence, (SubLObject)golem_satisfaction.UNPROVIDED);
        return el_utilities.make_el_formula(golem_satisfaction.$const47$problemNodeRoleForEventFilledByVa, (SubLObject)ConsesLow.list(problem, node, arg2, arg0, arg3), (SubLObject)golem_satisfaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 21270L)
    public static SubLObject all_golem_roles(final SubLObject golem, final SubLObject golem_mt) {
        final SubLObject role_set = set_utilities.make_set_from_list((SubLObject)ConsesLow.list(golem), Symbols.symbol_function((SubLObject)golem_satisfaction.EQL));
        final SubLObject role_queue = queues.enqueue(golem, queues.create_queue((SubLObject)golem_satisfaction.UNPROVIDED));
        while (golem_satisfaction.NIL == queues.queue_empty_p(role_queue)) {
            final SubLObject role = queues.dequeue(role_queue);
            SubLObject cdolist_list_var;
            final SubLObject role_gafs = cdolist_list_var = all_golem_gafs_in_golem_mt(role, golem_mt);
            SubLObject gaf = (SubLObject)golem_satisfaction.NIL;
            gaf = cdolist_list_var.first();
            while (golem_satisfaction.NIL != cdolist_list_var) {
                final SubLObject formula = assertions_high.gaf_formula(gaf);
                SubLObject cdolist_list_var_$2;
                final SubLObject terms = cdolist_list_var_$2 = cycl_utilities.formula_terms(formula, (SubLObject)golem_satisfaction.$kw48$IGNORE);
                SubLObject candidate = (SubLObject)golem_satisfaction.NIL;
                candidate = cdolist_list_var_$2.first();
                while (golem_satisfaction.NIL != cdolist_list_var_$2) {
                    if (golem_satisfaction.NIL != possibly_golem_termP(candidate, golem_mt) && golem_satisfaction.NIL == set.set_memberP(candidate, role_set)) {
                        set.set_add(candidate, role_set);
                        queues.enqueue(candidate, role_queue);
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    candidate = cdolist_list_var_$2.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                gaf = cdolist_list_var.first();
            }
        }
        return set.set_element_list(role_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 22120L)
    public static SubLObject all_golem_gafs_in_golem_mt(final SubLObject golem, final SubLObject golem_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gafs = (SubLObject)golem_satisfaction.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)golem_satisfaction.$sym49$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(golem_mt, thread);
            final SubLObject pred_var = (SubLObject)golem_satisfaction.NIL;
            if (golem_satisfaction.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(golem, (SubLObject)golem_satisfaction.NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(golem, (SubLObject)golem_satisfaction.NIL, pred_var);
                SubLObject done_var = (SubLObject)golem_satisfaction.NIL;
                final SubLObject token_var = (SubLObject)golem_satisfaction.NIL;
                while (golem_satisfaction.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (golem_satisfaction.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)golem_satisfaction.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)golem_satisfaction.$kw50$GAF, (SubLObject)golem_satisfaction.$kw51$TRUE, (SubLObject)golem_satisfaction.NIL);
                            SubLObject done_var_$3 = (SubLObject)golem_satisfaction.NIL;
                            final SubLObject token_var_$4 = (SubLObject)golem_satisfaction.NIL;
                            while (golem_satisfaction.NIL == done_var_$3) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(gaf));
                                if (golem_satisfaction.NIL != valid_$5) {
                                    final SubLObject item_var = gaf;
                                    if (golem_satisfaction.NIL == conses_high.member(item_var, gafs, Symbols.symbol_function((SubLObject)golem_satisfaction.EQL), Symbols.symbol_function((SubLObject)golem_satisfaction.IDENTITY))) {
                                        gafs = (SubLObject)ConsesLow.cons(item_var, gafs);
                                    }
                                }
                                done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL == valid_$5);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)golem_satisfaction.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (golem_satisfaction.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 22343L)
    public static SubLObject golem_roles_relevant_to_satisfiability(final SubLObject golem_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject primary_golem = kb_mapping_utilities.fpred_value_in_any_mt(golem_mt, golem_satisfaction.$const52$primaryGolemOfModelMt, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
        final SubLObject other_roles = kb_mapping_utilities.pred_values_in_any_mt(golem_mt, golem_satisfaction.$const53$relevantTermForGolemSatisfiabilit, (SubLObject)golem_satisfaction.ONE_INTEGER, (SubLObject)golem_satisfaction.TWO_INTEGER, (SubLObject)golem_satisfaction.$kw51$TRUE);
        if (golem_satisfaction.NIL != primary_golem) {
            return conses_high.adjoin(primary_golem, other_roles, Symbols.symbol_function((SubLObject)golem_satisfaction.$sym54$KBEQ), (SubLObject)golem_satisfaction.UNPROVIDED);
        }
        if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)golem_satisfaction.$str55$No___primaryGolemInModel_for__S, golem_mt);
        }
        return other_roles;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 22876L)
    public static SubLObject golem_preconditions_filtered_wrt_relevant_roles(final SubLObject preconditions, final SubLObject golem_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject relevant_roles = golem_roles_relevant_to_satisfiability(golem_mt);
        SubLObject relevant_preconditions = (SubLObject)golem_satisfaction.NIL;
        SubLObject cdolist_list_var = preconditions;
        SubLObject precondition = (SubLObject)golem_satisfaction.NIL;
        precondition = cdolist_list_var.first();
        while (golem_satisfaction.NIL != cdolist_list_var) {
            final SubLObject golem_roles = gather_golem_terms(precondition, golem_mt);
            final SubLObject irrelevant_roles = conses_high.set_difference(golem_roles, relevant_roles, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
            if (golem_satisfaction.NIL != irrelevant_roles) {
                if (golem_satisfaction.NIL != golem_satisfaction.$golem_debugP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)golem_satisfaction.T, (SubLObject)golem_satisfaction.$str56$__irrelevant_precondition___S, precondition);
                }
            }
            else {
                relevant_preconditions = (SubLObject)ConsesLow.cons(precondition, relevant_preconditions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            precondition = cdolist_list_var.first();
        }
        return Sequences.nreverse(relevant_preconditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 23475L)
    public static SubLObject all_golem_sentences_wrt_roles(final SubLObject golem_terms, final SubLObject golem_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gafs = (SubLObject)golem_satisfaction.NIL;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(golem_mt);
        if (pcase_var.eql((SubLObject)golem_satisfaction.$kw57$MT)) {
            if (golem_satisfaction.NIL != kb_mapping_macros.do_mt_index_key_validator(golem_mt, (SubLObject)golem_satisfaction.$kw50$GAF)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(golem_mt);
                SubLObject final_index_iterator = (SubLObject)golem_satisfaction.NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)golem_satisfaction.$kw50$GAF, (SubLObject)golem_satisfaction.$kw51$TRUE, (SubLObject)golem_satisfaction.NIL);
                    SubLObject done_var = (SubLObject)golem_satisfaction.NIL;
                    final SubLObject token_var = (SubLObject)golem_satisfaction.NIL;
                    while (golem_satisfaction.NIL == done_var) {
                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(gaf));
                        if (golem_satisfaction.NIL != valid && golem_satisfaction.NIL != golem_gaf_relevant_wrt_golemsP(gaf, golem_terms, golem_mt)) {
                            gafs = (SubLObject)ConsesLow.cons(gaf, gafs);
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL == valid);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)golem_satisfaction.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (golem_satisfaction.NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)golem_satisfaction.$kw58$BROAD_MT) && golem_satisfaction.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(golem_mt, (SubLObject)golem_satisfaction.$kw50$GAF)) {
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)golem_satisfaction.$str59$do_broad_mt_index;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)golem_satisfaction.ZERO_INTEGER;
            assert golem_satisfaction.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)golem_satisfaction.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)golem_satisfaction.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)golem_satisfaction.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$7 = idx;
                    if (golem_satisfaction.NIL == id_index.id_index_objects_empty_p(idx_$7, (SubLObject)golem_satisfaction.$kw61$SKIP)) {
                        final SubLObject idx_$8 = idx_$7;
                        if (golem_satisfaction.NIL == id_index.id_index_dense_objects_empty_p(idx_$8, (SubLObject)golem_satisfaction.$kw61$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$8);
                            final SubLObject backwardP_var = (SubLObject)golem_satisfaction.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject gaf2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)golem_satisfaction.NIL, v_iteration = (SubLObject)golem_satisfaction.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)golem_satisfaction.ONE_INTEGER)) {
                                a_id = ((golem_satisfaction.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)golem_satisfaction.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (golem_satisfaction.NIL == id_index.id_index_tombstone_p(a_handle) || golem_satisfaction.NIL == id_index.id_index_skip_tombstones_p((SubLObject)golem_satisfaction.$kw61$SKIP)) {
                                    if (golem_satisfaction.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)golem_satisfaction.$kw61$SKIP;
                                    }
                                    gaf2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (golem_satisfaction.NIL != kb_mapping_macros.do_broad_mt_index_match_p(gaf2, golem_mt, (SubLObject)golem_satisfaction.$kw50$GAF, (SubLObject)golem_satisfaction.$kw51$TRUE) && golem_satisfaction.NIL != golem_gaf_relevant_wrt_golemsP(gaf2, golem_terms, golem_mt)) {
                                        gafs = (SubLObject)ConsesLow.cons(gaf2, gafs);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)golem_satisfaction.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$9 = idx_$7;
                        if (golem_satisfaction.NIL == id_index.id_index_sparse_objects_empty_p(idx_$9) || golem_satisfaction.NIL == id_index.id_index_skip_tombstones_p((SubLObject)golem_satisfaction.$kw61$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$9);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$9);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$9);
                            final SubLObject v_default = (SubLObject)((golem_satisfaction.NIL != id_index.id_index_skip_tombstones_p((SubLObject)golem_satisfaction.$kw61$SKIP)) ? golem_satisfaction.NIL : golem_satisfaction.$kw61$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (golem_satisfaction.NIL == id_index.id_index_skip_tombstones_p((SubLObject)golem_satisfaction.$kw61$SKIP) || golem_satisfaction.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject gaf3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (golem_satisfaction.NIL != kb_mapping_macros.do_broad_mt_index_match_p(gaf3, golem_mt, (SubLObject)golem_satisfaction.$kw50$GAF, (SubLObject)golem_satisfaction.$kw51$TRUE) && golem_satisfaction.NIL != golem_gaf_relevant_wrt_golemsP(gaf3, golem_terms, golem_mt)) {
                                        gafs = (SubLObject)ConsesLow.cons(gaf3, gafs);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)golem_satisfaction.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)golem_satisfaction.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)golem_satisfaction.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)golem_satisfaction.$sym62$GOLEM_GAF_FORMULA), gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 24040L)
    public static SubLObject golem_gaf_relevant_wrt_golemsP(final SubLObject gaf, final SubLObject golem_terms, final SubLObject golem_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relevant_witness = (SubLObject)golem_satisfaction.NIL;
        SubLObject irrelevant_witness = (SubLObject)golem_satisfaction.NIL;
        final SubLObject _prev_bind_0 = golem_satisfaction.$relevant_golems$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            golem_satisfaction.$relevant_golems$.bind(golem_terms, thread);
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)golem_satisfaction.$sym63$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(golem_mt, thread);
            relevant_witness = golem_gaf_first_relevant_witness(gaf);
            irrelevant_witness = golem_gaf_first_irrelevant_witness(gaf);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            golem_satisfaction.$relevant_golems$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL != relevant_witness && golem_satisfaction.NIL == irrelevant_witness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 24437L)
    public static SubLObject golem_gaf_first_relevant_witness(final SubLObject gaf) {
        return cycl_utilities.expression_find_if((SubLObject)golem_satisfaction.$sym64$GOLEM_GAF_RELEVANT_WITNESS_, assertions_high.gaf_formula(gaf), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 24570L)
    public static SubLObject golem_gaf_first_irrelevant_witness(final SubLObject gaf) {
        return cycl_utilities.expression_find_if((SubLObject)golem_satisfaction.$sym65$GOLEM_GAF_IRRELEVANT_WITNESS_, assertions_high.gaf_formula(gaf), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 24707L)
    public static SubLObject golem_gaf_relevant_witnessP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL != forts.fort_p(v_object) && golem_satisfaction.NIL != subl_promotions.memberP(v_object, golem_satisfaction.$relevant_golems$.getDynamicValue(thread), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 24842L)
    public static SubLObject golem_gaf_irrelevant_witnessP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL != possibly_golem_termP(v_object, (SubLObject)golem_satisfaction.UNPROVIDED) && golem_satisfaction.NIL == subl_promotions.memberP(v_object, golem_satisfaction.$relevant_golems$.getDynamicValue(thread), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 25000L)
    public static SubLObject golem_gaf_formula(final SubLObject gaf) {
        if (assertions_high.gaf_arg0(gaf).eql(golem_satisfaction.$const66$golemSentence)) {
            return assertions_high.gaf_arg1(gaf);
        }
        return assertions_high.gaf_formula(gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 25145L)
    public static SubLObject possibly_golem_termP(final SubLObject v_object, SubLObject mt) {
        if (mt == golem_satisfaction.UNPROVIDED) {
            mt = (SubLObject)golem_satisfaction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (golem_satisfaction.NIL != forts.fort_p(v_object)) {
            SubLObject result = (SubLObject)golem_satisfaction.NIL;
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                result = (SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL != kb_accessors.indeterminate_termP(v_object) && golem_satisfaction.NIL == kb_accessors.hypothetical_term_p(v_object));
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 25475L)
    public static SubLObject gather_golem_terms(final SubLObject golem_sentence, SubLObject mt) {
        if (mt == golem_satisfaction.UNPROVIDED) {
            mt = (SubLObject)golem_satisfaction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject terms = (SubLObject)golem_satisfaction.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            terms = cycl_utilities.expression_gather(golem_sentence, (SubLObject)golem_satisfaction.$sym28$POSSIBLY_GOLEM_TERM_, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 25698L)
    public static SubLObject golem_sentence_role_count(final SubLObject golem_sentence, SubLObject mt) {
        if (mt == golem_satisfaction.UNPROVIDED) {
            mt = (SubLObject)golem_satisfaction.NIL;
        }
        return Sequences.length(gather_golem_terms(golem_sentence, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 35493L)
    public static SubLObject removal_golemofmodelmt_cost(final SubLObject asent, SubLObject sense) {
        if (sense == golem_satisfaction.UNPROVIDED) {
            sense = (SubLObject)golem_satisfaction.NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)golem_satisfaction.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)golem_satisfaction.UNPROVIDED);
        if (golem_satisfaction.NIL != variables.fully_bound_p(arg2)) {
            return control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
        }
        if (golem_satisfaction.NIL != isa.isa_in_any_mtP(arg1, golem_satisfaction.$const85$GolemModelMicrotheory)) {
            return kb_indexing.num_mt_contents(arg1);
        }
        return (SubLObject)golem_satisfaction.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 35861L)
    public static SubLObject possible_golem_of_a_model_mtP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL != forts.fort_p(v_object) && golem_satisfaction.NIL != isa.quoted_isa_in_any_mtP(v_object, golem_satisfaction.$const86$TheTerm));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 35996L)
    public static SubLObject removal_golemofmodelmt_expand(final SubLObject asent, SubLObject sense) {
        if (sense == golem_satisfaction.UNPROVIDED) {
            sense = (SubLObject)golem_satisfaction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)golem_satisfaction.$sym87$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(golem_satisfaction.$const88$EverythingPSC, thread);
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)golem_satisfaction.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)golem_satisfaction.UNPROVIDED);
            SubLObject results = (SubLObject)golem_satisfaction.NIL;
            SubLObject doneP = (SubLObject)golem_satisfaction.NIL;
            final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(arg1);
            if (pcase_var.eql((SubLObject)golem_satisfaction.$kw57$MT)) {
                if (golem_satisfaction.NIL != kb_mapping_macros.do_mt_index_key_validator(arg1, (SubLObject)golem_satisfaction.$kw50$GAF)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(arg1);
                    SubLObject final_index_iterator = (SubLObject)golem_satisfaction.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)golem_satisfaction.$kw50$GAF, (SubLObject)golem_satisfaction.$kw51$TRUE, (SubLObject)golem_satisfaction.NIL);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = (SubLObject)golem_satisfaction.NIL;
                        while (golem_satisfaction.NIL == done_var) {
                            final SubLObject a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(a));
                            if (golem_satisfaction.NIL != valid) {
                                if (golem_satisfaction.NIL != variables.fully_bound_p(arg2)) {
                                    if (golem_satisfaction.NIL != cycl_utilities.expression_find(arg2, fi.assertion_hl_formula(a, (SubLObject)golem_satisfaction.UNPROVIDED), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED)) {
                                        results = (SubLObject)ConsesLow.list(arg2);
                                        doneP = (SubLObject)golem_satisfaction.T;
                                    }
                                }
                                else {
                                    SubLObject cdolist_list_var = cycl_utilities.expression_gather(fi.assertion_hl_formula(a, (SubLObject)golem_satisfaction.UNPROVIDED), (SubLObject)golem_satisfaction.$sym89$POSSIBLE_GOLEM_OF_A_MODEL_MT_, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
                                    SubLObject v_term = (SubLObject)golem_satisfaction.NIL;
                                    v_term = cdolist_list_var.first();
                                    while (golem_satisfaction.NIL != cdolist_list_var) {
                                        final SubLObject item_var = v_term;
                                        if (golem_satisfaction.NIL == conses_high.member(item_var, results, Symbols.symbol_function((SubLObject)golem_satisfaction.EQL), Symbols.symbol_function((SubLObject)golem_satisfaction.IDENTITY))) {
                                            results = (SubLObject)ConsesLow.cons(item_var, results);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        v_term = cdolist_list_var.first();
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(golem_satisfaction.NIL == valid || golem_satisfaction.NIL != doneP);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)golem_satisfaction.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (golem_satisfaction.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)golem_satisfaction.$kw58$BROAD_MT) && golem_satisfaction.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(arg1, (SubLObject)golem_satisfaction.$kw50$GAF)) {
                SubLObject catch_var = (SubLObject)golem_satisfaction.NIL;
                try {
                    thread.throwStack.push(golem_satisfaction.$kw90$MAPPING_DONE);
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = (SubLObject)golem_satisfaction.$str59$do_broad_mt_index;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)golem_satisfaction.ZERO_INTEGER;
                    assert golem_satisfaction.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$12 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$13 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)golem_satisfaction.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)golem_satisfaction.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)golem_satisfaction.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$14 = idx;
                            if (golem_satisfaction.NIL == id_index.id_index_objects_empty_p(idx_$14, (SubLObject)golem_satisfaction.$kw61$SKIP)) {
                                final SubLObject idx_$15 = idx_$14;
                                if (golem_satisfaction.NIL == id_index.id_index_dense_objects_empty_p(idx_$15, (SubLObject)golem_satisfaction.$kw61$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$15);
                                    final SubLObject backwardP_var = (SubLObject)golem_satisfaction.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject a2;
                                    SubLObject cdolist_list_var2;
                                    SubLObject v_term2;
                                    SubLObject item_var2;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)golem_satisfaction.NIL, v_iteration = (SubLObject)golem_satisfaction.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)golem_satisfaction.ONE_INTEGER)) {
                                        a_id = ((golem_satisfaction.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)golem_satisfaction.ONE_INTEGER) : v_iteration);
                                        a_handle = Vectors.aref(vector_var, a_id);
                                        if (golem_satisfaction.NIL == id_index.id_index_tombstone_p(a_handle) || golem_satisfaction.NIL == id_index.id_index_skip_tombstones_p((SubLObject)golem_satisfaction.$kw61$SKIP)) {
                                            if (golem_satisfaction.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                                a_handle = (SubLObject)golem_satisfaction.$kw61$SKIP;
                                            }
                                            a2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (golem_satisfaction.NIL != doneP) {
                                                utilities_macros.mapping_finished();
                                            }
                                            if (golem_satisfaction.NIL != kb_mapping_macros.do_broad_mt_index_match_p(a2, arg1, (SubLObject)golem_satisfaction.$kw50$GAF, (SubLObject)golem_satisfaction.$kw51$TRUE)) {
                                                if (golem_satisfaction.NIL != variables.fully_bound_p(arg2)) {
                                                    if (golem_satisfaction.NIL != cycl_utilities.expression_find(arg2, fi.assertion_hl_formula(a2, (SubLObject)golem_satisfaction.UNPROVIDED), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED)) {
                                                        results = (SubLObject)ConsesLow.list(arg2);
                                                        doneP = (SubLObject)golem_satisfaction.T;
                                                    }
                                                }
                                                else {
                                                    cdolist_list_var2 = cycl_utilities.expression_gather(fi.assertion_hl_formula(a2, (SubLObject)golem_satisfaction.UNPROVIDED), (SubLObject)golem_satisfaction.$sym89$POSSIBLE_GOLEM_OF_A_MODEL_MT_, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
                                                    v_term2 = (SubLObject)golem_satisfaction.NIL;
                                                    v_term2 = cdolist_list_var2.first();
                                                    while (golem_satisfaction.NIL != cdolist_list_var2) {
                                                        item_var2 = v_term2;
                                                        if (golem_satisfaction.NIL == conses_high.member(item_var2, results, Symbols.symbol_function((SubLObject)golem_satisfaction.EQL), Symbols.symbol_function((SubLObject)golem_satisfaction.IDENTITY))) {
                                                            results = (SubLObject)ConsesLow.cons(item_var2, results);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        v_term2 = cdolist_list_var2.first();
                                                    }
                                                }
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)golem_satisfaction.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$16 = idx_$14;
                                if (golem_satisfaction.NIL == id_index.id_index_sparse_objects_empty_p(idx_$16) || golem_satisfaction.NIL == id_index.id_index_skip_tombstones_p((SubLObject)golem_satisfaction.$kw61$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$16);
                                    SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$16);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$16);
                                    final SubLObject v_default = (SubLObject)((golem_satisfaction.NIL != id_index.id_index_skip_tombstones_p((SubLObject)golem_satisfaction.$kw61$SKIP)) ? golem_satisfaction.NIL : golem_satisfaction.$kw61$SKIP);
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                        if (golem_satisfaction.NIL == id_index.id_index_skip_tombstones_p((SubLObject)golem_satisfaction.$kw61$SKIP) || golem_satisfaction.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                            final SubLObject a3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (golem_satisfaction.NIL != doneP) {
                                                utilities_macros.mapping_finished();
                                            }
                                            if (golem_satisfaction.NIL != kb_mapping_macros.do_broad_mt_index_match_p(a3, arg1, (SubLObject)golem_satisfaction.$kw50$GAF, (SubLObject)golem_satisfaction.$kw51$TRUE)) {
                                                if (golem_satisfaction.NIL != variables.fully_bound_p(arg2)) {
                                                    if (golem_satisfaction.NIL != cycl_utilities.expression_find(arg2, fi.assertion_hl_formula(a3, (SubLObject)golem_satisfaction.UNPROVIDED), (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED)) {
                                                        results = (SubLObject)ConsesLow.list(arg2);
                                                        doneP = (SubLObject)golem_satisfaction.T;
                                                    }
                                                }
                                                else {
                                                    SubLObject cdolist_list_var3 = cycl_utilities.expression_gather(fi.assertion_hl_formula(a3, (SubLObject)golem_satisfaction.UNPROVIDED), (SubLObject)golem_satisfaction.$sym89$POSSIBLE_GOLEM_OF_A_MODEL_MT_, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
                                                    SubLObject v_term3 = (SubLObject)golem_satisfaction.NIL;
                                                    v_term3 = cdolist_list_var3.first();
                                                    while (golem_satisfaction.NIL != cdolist_list_var3) {
                                                        final SubLObject item_var3 = v_term3;
                                                        if (golem_satisfaction.NIL == conses_high.member(item_var3, results, Symbols.symbol_function((SubLObject)golem_satisfaction.EQL), Symbols.symbol_function((SubLObject)golem_satisfaction.IDENTITY))) {
                                                            results = (SubLObject)ConsesLow.cons(item_var3, results);
                                                        }
                                                        cdolist_list_var3 = cdolist_list_var3.rest();
                                                        v_term3 = cdolist_list_var3.first();
                                                    }
                                                }
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)golem_satisfaction.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        a_id2 = Numbers.add(a_id2, (SubLObject)golem_satisfaction.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)golem_satisfaction.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$13, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$12, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)golem_satisfaction.$kw90$MAPPING_DONE);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            SubLObject cdolist_list_var4 = results;
            SubLObject result = (SubLObject)golem_satisfaction.NIL;
            result = cdolist_list_var4.first();
            while (golem_satisfaction.NIL != cdolist_list_var4) {
                final SubLObject answer_asent = el_utilities.make_binary_formula(golem_satisfaction.$const82$golemOfModelMt, arg1, result);
                final SubLObject v_bindings = unification_utilities.term_unify(answer_asent, asent, (SubLObject)golem_satisfaction.UNPROVIDED, (SubLObject)golem_satisfaction.UNPROVIDED);
                if (golem_satisfaction.NIL != v_bindings) {
                    SubLObject supports = (SubLObject)golem_satisfaction.NIL;
                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)golem_satisfaction.$kw91$ISA, el_utilities.make_binary_formula(golem_satisfaction.$const92$quotedIsa, result, golem_satisfaction.$const86$TheTerm), golem_satisfaction.$const93$BaseKB, (SubLObject)golem_satisfaction.UNPROVIDED), supports);
                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)golem_satisfaction.$kw91$ISA, el_utilities.make_binary_formula(golem_satisfaction.$const94$isa, arg1, golem_satisfaction.$const85$GolemModelMicrotheory), golem_satisfaction.$const95$InferencePSC, (SubLObject)golem_satisfaction.UNPROVIDED), supports);
                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)golem_satisfaction.$kw96$QUERY, (SubLObject)ConsesLow.list(golem_satisfaction.$const97$thereExists, (SubLObject)golem_satisfaction.$sym41$_SENTENCE, (SubLObject)ConsesLow.list(golem_satisfaction.$const97$thereExists, (SubLObject)golem_satisfaction.$sym98$_N, (SubLObject)ConsesLow.list(golem_satisfaction.$const99$and, (SubLObject)ConsesLow.listS(golem_satisfaction.$const100$argN, result, (SubLObject)golem_satisfaction.$list101), (SubLObject)ConsesLow.listS(golem_satisfaction.$const102$ist_Asserted, arg1, (SubLObject)golem_satisfaction.$list103)))), golem_satisfaction.$const93$BaseKB, (SubLObject)golem_satisfaction.UNPROVIDED), supports);
                    backward.removal_add_node(supports.first(), v_bindings, supports.rest());
                }
                cdolist_list_var4 = cdolist_list_var4.rest();
                result = cdolist_list_var4.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    public static SubLObject declare_golem_satisfaction_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_satisfiableP", "GOLEM-SATISFIABLE?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_satisfaction_produces_correspondence", "GOLEM-SATISFACTION-PRODUCES-CORRESPONDENCE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_satisfiable_with_partial_correspondenceP", "GOLEM-SATISFIABLE-WITH-PARTIAL-CORRESPONDENCE?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_satisfiable_at_nodeP", "GOLEM-SATISFIABLE-AT-NODE?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_to_object_arbitrary_maximal_correspondence", "GOLEM-TO-OBJECT-ARBITRARY-MAXIMAL-CORRESPONDENCE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_to_object_maximal_correspondences", "GOLEM-TO-OBJECT-MAXIMAL-CORRESPONDENCES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_to_object_correspondences", "GOLEM-TO-OBJECT-CORRESPONDENCES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_to_object_correspondences_among", "GOLEM-TO-OBJECT-CORRESPONDENCES-AMONG", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_to_object_correspondences_from_partial", "GOLEM-TO-OBJECT-CORRESPONDENCES-FROM-PARTIAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "verify_partial_correspondence", "VERIFY-PARTIAL-CORRESPONDENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_extend_correspondence_recursive", "GOLEM-EXTEND-CORRESPONDENCE-RECURSIVE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_find_next_candidate_and_extend_correspondence", "GOLEM-FIND-NEXT-CANDIDATE-AND-EXTEND-CORRESPONDENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_compute_candidate_extension_map", "GOLEM-COMPUTE-CANDIDATE-EXTENSION-MAP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_correspondence_satisfies_preconditions", "GOLEM-CORRESPONDENCE-SATISFIES-PRECONDITIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_binding_valid_wrt_typesP", "GOLEM-BINDING-VALID-WRT-TYPES?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_candidate_extension_query_internal", "GOLEM-CANDIDATE-EXTENSION-QUERY-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_candidate_extension_query", "GOLEM-CANDIDATE-EXTENSION-QUERY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_sentence_satisfiedP_internal", "GOLEM-SENTENCE-SATISFIED?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_sentence_satisfiedP", "GOLEM-SENTENCE-SATISFIED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_precondition_sentences", "GOLEM-PRECONDITION-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_precondition_satisfiedP", "GOLEM-PRECONDITION-SATISFIED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_sentence_relative_to_node", "GOLEM-SENTENCE-RELATIVE-TO-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "all_golem_roles", "ALL-GOLEM-ROLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "all_golem_gafs_in_golem_mt", "ALL-GOLEM-GAFS-IN-GOLEM-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_roles_relevant_to_satisfiability", "GOLEM-ROLES-RELEVANT-TO-SATISFIABILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_preconditions_filtered_wrt_relevant_roles", "GOLEM-PRECONDITIONS-FILTERED-WRT-RELEVANT-ROLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "all_golem_sentences_wrt_roles", "ALL-GOLEM-SENTENCES-WRT-ROLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_gaf_relevant_wrt_golemsP", "GOLEM-GAF-RELEVANT-WRT-GOLEMS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_gaf_first_relevant_witness", "GOLEM-GAF-FIRST-RELEVANT-WITNESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_gaf_first_irrelevant_witness", "GOLEM-GAF-FIRST-IRRELEVANT-WITNESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_gaf_relevant_witnessP", "GOLEM-GAF-RELEVANT-WITNESS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_gaf_irrelevant_witnessP", "GOLEM-GAF-IRRELEVANT-WITNESS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_gaf_formula", "GOLEM-GAF-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "possibly_golem_termP", "POSSIBLY-GOLEM-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "gather_golem_terms", "GATHER-GOLEM-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "golem_sentence_role_count", "GOLEM-SENTENCE-ROLE-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "removal_golemofmodelmt_cost", "REMOVAL-GOLEMOFMODELMT-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "possible_golem_of_a_model_mtP", "POSSIBLE-GOLEM-OF-A-MODEL-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.golem_satisfaction", "removal_golemofmodelmt_expand", "REMOVAL-GOLEMOFMODELMT-EXPAND", 1, 1, false);
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    public static SubLObject init_golem_satisfaction_file() {
        golem_satisfaction.$golem_debugP$ = SubLFiles.defvar("*GOLEM-DEBUG?*", (SubLObject)golem_satisfaction.NIL);
        golem_satisfaction.$golem_node$ = SubLFiles.defparameter("*GOLEM-NODE*", (SubLObject)golem_satisfaction.NIL);
        golem_satisfaction.$golem_correspondence_result_tuples$ = SubLFiles.defparameter("*GOLEM-CORRESPONDENCE-RESULT-TUPLES*", (SubLObject)golem_satisfaction.$kw10$UNINITIALIZED);
        golem_satisfaction.$golem_current_correspondence$ = SubLFiles.defparameter("*GOLEM-CURRENT-CORRESPONDENCE*", (SubLObject)golem_satisfaction.$kw10$UNINITIALIZED);
        golem_satisfaction.$golem_handled_roles$ = SubLFiles.defparameter("*GOLEM-HANDLED-ROLES*", (SubLObject)golem_satisfaction.$kw10$UNINITIALIZED);
        golem_satisfaction.$golem_handled_sentences$ = SubLFiles.defparameter("*GOLEM-HANDLED-SENTENCES*", (SubLObject)golem_satisfaction.$kw10$UNINITIALIZED);
        golem_satisfaction.$golem_remaining_roles$ = SubLFiles.defparameter("*GOLEM-REMAINING-ROLES*", (SubLObject)golem_satisfaction.$kw10$UNINITIALIZED);
        golem_satisfaction.$golem_remaining_sentences$ = SubLFiles.defparameter("*GOLEM-REMAINING-SENTENCES*", (SubLObject)golem_satisfaction.$kw10$UNINITIALIZED);
        golem_satisfaction.$golem_candidate_count_limit$ = SubLFiles.defparameter("*GOLEM-CANDIDATE-COUNT-LIMIT*", (SubLObject)golem_satisfaction.TEN_INTEGER);
        golem_satisfaction.$relevant_golems$ = SubLFiles.defparameter("*RELEVANT-GOLEMS*", (SubLObject)golem_satisfaction.$kw10$UNINITIALIZED);
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    public static SubLObject setup_golem_satisfaction_file() {
        memoization_state.note_memoized_function((SubLObject)golem_satisfaction.$sym36$GOLEM_CANDIDATE_EXTENSION_QUERY);
        memoization_state.note_memoized_function((SubLObject)golem_satisfaction.$sym39$GOLEM_SENTENCE_SATISFIED_);
        utilities_macros.note_funcall_helper_function((SubLObject)golem_satisfaction.$sym64$GOLEM_GAF_RELEVANT_WITNESS_);
        utilities_macros.note_funcall_helper_function((SubLObject)golem_satisfaction.$sym65$GOLEM_GAF_IRRELEVANT_WITNESS_);
        inference_modules.register_solely_specific_removal_module_predicate(golem_satisfaction.$const67$satisfiableGolemInModel);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const67$satisfiableGolemInModel, (SubLObject)golem_satisfaction.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const67$satisfiableGolemInModel, (SubLObject)golem_satisfaction.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const67$satisfiableGolemInModel, (SubLObject)golem_satisfaction.THREE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)golem_satisfaction.$kw69$REMOVAL_SATISFIABLE_GOLEM_IN_MODEL_CHECK_POS, (SubLObject)golem_satisfaction.$list70);
        inference_modules.register_solely_specific_removal_module_predicate(golem_satisfaction.$const71$satisfyingGolemInModelProducesCor);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const71$satisfyingGolemInModelProducesCor, (SubLObject)golem_satisfaction.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const71$satisfyingGolemInModelProducesCor, (SubLObject)golem_satisfaction.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const71$satisfyingGolemInModelProducesCor, (SubLObject)golem_satisfaction.THREE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)golem_satisfaction.$kw72$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_CHECK_POS, (SubLObject)golem_satisfaction.$list73);
        inference_modules.inference_removal_module((SubLObject)golem_satisfaction.$kw74$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_GENERATE_POS, (SubLObject)golem_satisfaction.$list75);
        inference_modules.register_solely_specific_removal_module_predicate(golem_satisfaction.$const76$satisfiableGolemInModelGivenParti);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const76$satisfiableGolemInModelGivenParti, (SubLObject)golem_satisfaction.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const76$satisfiableGolemInModelGivenParti, (SubLObject)golem_satisfaction.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const76$satisfiableGolemInModelGivenParti, (SubLObject)golem_satisfaction.THREE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const76$satisfiableGolemInModelGivenParti, (SubLObject)golem_satisfaction.FOUR_INTEGER);
        inference_modules.inference_removal_module((SubLObject)golem_satisfaction.$kw77$REMOVAL_GOLEM_SATISFACTION_GIVEN_PARTIAL_CORRESPONDENCE_CHECK_POS, (SubLObject)golem_satisfaction.$list78);
        inference_modules.register_solely_specific_removal_module_predicate(golem_satisfaction.$const79$satisfiableGolemInModelAtNode);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const79$satisfiableGolemInModelAtNode, (SubLObject)golem_satisfaction.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const79$satisfiableGolemInModelAtNode, (SubLObject)golem_satisfaction.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const79$satisfiableGolemInModelAtNode, (SubLObject)golem_satisfaction.THREE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const79$satisfiableGolemInModelAtNode, (SubLObject)golem_satisfaction.FOUR_INTEGER);
        inference_modules.inference_removal_module((SubLObject)golem_satisfaction.$kw80$REMOVAL_GOLEM_SATISFACTION_AT_NODE_CHECK_POS, (SubLObject)golem_satisfaction.$list81);
        preference_modules.doomed_unless_arg_bindable((SubLObject)golem_satisfaction.$kw68$POS, golem_satisfaction.$const82$golemOfModelMt, (SubLObject)golem_satisfaction.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)golem_satisfaction.$kw83$REMOVAL_GOLEMOFMODELMT, (SubLObject)golem_satisfaction.$list84);
        return (SubLObject)golem_satisfaction.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_golem_satisfaction_file();
    }
    
    @Override
	public void initializeVariables() {
        init_golem_satisfaction_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_golem_satisfaction_file();
    }
    
    static {
        me = (SubLFile)new golem_satisfaction();
        golem_satisfaction.$golem_debugP$ = null;
        golem_satisfaction.$golem_node$ = null;
        golem_satisfaction.$golem_correspondence_result_tuples$ = null;
        golem_satisfaction.$golem_current_correspondence$ = null;
        golem_satisfaction.$golem_handled_roles$ = null;
        golem_satisfaction.$golem_handled_sentences$ = null;
        golem_satisfaction.$golem_remaining_roles$ = null;
        golem_satisfaction.$golem_remaining_sentences$ = null;
        golem_satisfaction.$golem_candidate_count_limit$ = null;
        golem_satisfaction.$relevant_golems$ = null;
        $str0$__Attempting_match______model___S = SubLObjectFactory.makeString("~%Attempting match: ~%  model: ~S ~%  golem: ~S ~%  object: ~S ~%  object-mt: ~S");
        $str1$____node___S = SubLObjectFactory.makeString("~%  node: ~S");
        $str2$__Model_has_no_preconditions___S = SubLObjectFactory.makeString("~%Model has no preconditions: ~S");
        $str3$Vacuous_correspondence_ignored___ = SubLObjectFactory.makeString("Vacuous correspondence ignored:~%~S");
        $str4$__Not_a_recognized_node_type___S = SubLObjectFactory.makeString("~%Not a recognized node type: ~S");
        $sym5$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str6$__chosen_correspondence___S = SubLObjectFactory.makeString("~%chosen correspondence: ~S");
        $sym7$_ = SubLObjectFactory.makeSymbol(">");
        $sym8$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $str9$__candidate_correspondence___S = SubLObjectFactory.makeString("~%candidate correspondence: ~S");
        $kw10$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym11$REVERSE = SubLObjectFactory.makeSymbol("REVERSE");
        $sym12$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list13 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str14$__prior_role_inapplicable_wrt_typ = SubLObjectFactory.makeString("~%prior role inapplicable wrt types:~%~S~%~S");
        $str15$__handled_already___S = SubLObjectFactory.makeString("~%handled already: ~S");
        $str16$__role_inapplicable_wrt_types____ = SubLObjectFactory.makeString("~%role inapplicable wrt types:~%~S~%~S");
        $str17$________ = SubLObjectFactory.makeString("~%~%~%~%");
        $str18$A_correspondence___S__ = SubLObjectFactory.makeString("A correspondence: ~S~%");
        $str19$A_handled_role__S__ = SubLObjectFactory.makeString("A handled role ~S~%");
        $str20$A_remaining_role__S__ = SubLObjectFactory.makeString("A remaining role ~S~%");
        $str21$A_remaining_sentence__S__ = SubLObjectFactory.makeString("A remaining sentence ~S~%");
        $str22$A_handled_sentence__S__ = SubLObjectFactory.makeString("A handled sentence ~S~%");
        $str23$__handled___S = SubLObjectFactory.makeString("~%handled: ~S");
        $sym24$THIRD = SubLObjectFactory.makeSymbol("THIRD");
        $str25$__A_candidate_data___S__ = SubLObjectFactory.makeString("~%A candidate data: ~S~%");
        $str26$__Maximal_candidate_data___S__ = SubLObjectFactory.makeString("~%Maximal candidate data: ~S~%");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLED-COUNT"));
        $sym28$POSSIBLY_GOLEM_TERM_ = SubLObjectFactory.makeSymbol("POSSIBLY-GOLEM-TERM?");
        $str29$__Extending_sentence____S = SubLObjectFactory.makeString("~%Extending sentence:~%~S");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ROLE"));
        $str31$__WARNING__More_than__A_candidate = SubLObjectFactory.makeString("~%WARNING: More than ~A candidates for ~S in sentence ~S. Skipping.~%");
        $str32$A_candidate_data__role__object___ = SubLObjectFactory.makeString("A candidate data (role, object): ~S = ~S~%");
        $list33 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-OBJECT"));
        $str34$__Unsatisfied_precondition____S = SubLObjectFactory.makeString("~%Unsatisfied precondition:~%~S");
        $const35$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $sym36$GOLEM_CANDIDATE_EXTENSION_QUERY = SubLObjectFactory.makeSymbol("GOLEM-CANDIDATE-EXTENSION-QUERY");
        $str37$____Asking___ROLE__S__SENTENCE__S = SubLObjectFactory.makeString("~%~%Asking:~%ROLE ~S~%SENTENCE ~S");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), (SubLObject)golem_satisfaction.NIL);
        $sym39$GOLEM_SENTENCE_SATISFIED_ = SubLObjectFactory.makeSymbol("GOLEM-SENTENCE-SATISFIED?");
        $const40$preconditionFor_PropSit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preconditionFor-PropSit"));
        $sym41$_SENTENCE = SubLObjectFactory.makeSymbol("?SENTENCE");
        $kw42$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw43$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw44$HL = SubLObjectFactory.makeKeyword("HL");
        $kw45$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE"));
        $const47$problemNodeRoleForEventFilledByVa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("problemNodeRoleForEventFilledByValue"));
        $kw48$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym49$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $kw50$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw51$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const52$primaryGolemOfModelMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("primaryGolemOfModelMt"));
        $const53$relevantTermForGolemSatisfiabilit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relevantTermForGolemSatisfiability"));
        $sym54$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $str55$No___primaryGolemInModel_for__S = SubLObjectFactory.makeString("No #$primaryGolemInModel for ~S");
        $str56$__irrelevant_precondition___S = SubLObjectFactory.makeString("~%irrelevant precondition: ~S");
        $kw57$MT = SubLObjectFactory.makeKeyword("MT");
        $kw58$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $str59$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
        $sym60$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw61$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym62$GOLEM_GAF_FORMULA = SubLObjectFactory.makeSymbol("GOLEM-GAF-FORMULA");
        $sym63$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym64$GOLEM_GAF_RELEVANT_WITNESS_ = SubLObjectFactory.makeSymbol("GOLEM-GAF-RELEVANT-WITNESS?");
        $sym65$GOLEM_GAF_IRRELEVANT_WITNESS_ = SubLObjectFactory.makeSymbol("GOLEM-GAF-IRRELEVANT-WITNESS?");
        $const66$golemSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("golemSentence"));
        $const67$satisfiableGolemInModel = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModel"));
        $kw68$POS = SubLObjectFactory.makeKeyword("POS");
        $kw69$REMOVAL_SATISFIABLE_GOLEM_IN_MODEL_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-SATISFIABLE-GOLEM-IN-MODEL-CHECK-POS");
        $list70 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModel")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModel")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModel")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-SATISFIABLE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiableGolemInModel <golem-mt> <golem> <object>)") });
        $const71$satisfyingGolemInModelProducesCor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfyingGolemInModelProducesCorrespondence"));
        $kw72$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-GOLEM-SATISFACTION-PRODUCES-CORRESPONDENCE-CHECK-POS");
        $list73 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfyingGolemInModelProducesCorrespondence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfyingGolemInModelProducesCorrespondence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfyingGolemInModelProducesCorrespondence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE")))), SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCIFY-KB-BINDING-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE"))))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-SATISFACTION-PRODUCES-CORRESPONDENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))))), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("KBIFY-BINDING-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE"))))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-CORRESPONDENCE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfyingGolemInModelProducesCorrespondence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-CORRESPONDENCE")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfyingGolemInModelProducesCorrespondence <golem-mt> <golem> <object> <correspondence>)") });
        $kw74$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_GENERATE_POS = SubLObjectFactory.makeKeyword("REMOVAL-GOLEM-SATISFACTION-PRODUCES-CORRESPONDENCE-GENERATE-POS");
        $list75 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfyingGolemInModelProducesCorrespondence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfyingGolemInModelProducesCorrespondence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfyingGolemInModelProducesCorrespondence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-SATISFACTION-PRODUCES-CORRESPONDENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))))), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("KBIFY-BINDING-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE"))))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-CORRESPONDENCE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfyingGolemInModelProducesCorrespondence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-CORRESPONDENCE")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfyingGolemInModelProducesCorrespondence <golem-mt> <golem> <object> <not-fully-bound>)") });
        $const76$satisfiableGolemInModelGivenParti = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModelGivenPartialCorrespondence"));
        $kw77$REMOVAL_GOLEM_SATISFACTION_GIVEN_PARTIAL_CORRESPONDENCE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-GOLEM-SATISFACTION-GIVEN-PARTIAL-CORRESPONDENCE-CHECK-POS");
        $list78 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModelGivenPartialCorrespondence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModelGivenPartialCorrespondence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModelGivenPartialCorrespondence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE")))), SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCIFY-KB-BINDING-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE"))))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-CORRESPONDENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-SATISFIABLE-WITH-PARTIAL-CORRESPONDENCE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HL-CORRESPONDENCE")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiableGolemInModelGivenPartialCorrespondence <golem-mt> <golem> <object> <correspondence>)") });
        $const79$satisfiableGolemInModelAtNode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModelAtNode"));
        $kw80$REMOVAL_GOLEM_SATISFACTION_AT_NODE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-GOLEM-SATISFACTION-AT-NODE-CHECK-POS");
        $list81 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModelAtNode")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModelAtNode")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiableGolemInModelAtNode")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-SATISFIABLE-AT-NODE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GOLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiableGolemInModelAtNode <golem-mt> <golem> <object> <node>)") });
        $const82$golemOfModelMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("golemOfModelMt"));
        $kw83$REMOVAL_GOLEMOFMODELMT = SubLObjectFactory.makeKeyword("REMOVAL-GOLEMOFMODELMT");
        $list84 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("golemOfModelMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("golemOfModelMt")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-GOLEMOFMODELMT-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GOLEMOFMODELMT-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$golemOfModelMt <fully-bound-p> <anything>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(golemOfModelMt\n (CanonicalProcessForProblemTypeMtFn MultiplyingADecimalAndAnInteger)\n (The PlacingADecimalPoint))") });
        $const85$GolemModelMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GolemModelMicrotheory"));
        $const86$TheTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheTerm"));
        $sym87$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const88$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym89$POSSIBLE_GOLEM_OF_A_MODEL_MT_ = SubLObjectFactory.makeSymbol("POSSIBLE-GOLEM-OF-A-MODEL-MT?");
        $kw90$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $kw91$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const92$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const93$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const94$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const95$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw96$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $const97$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym98$_N = SubLObjectFactory.makeSymbol("?N");
        $const99$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const100$argN = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argN"));
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?N"), (SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE"));
        $const102$ist_Asserted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE"));
    }
}

/*

	Total time: 785 ms
	
*/