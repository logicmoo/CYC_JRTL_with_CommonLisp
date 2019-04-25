package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class indexing_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.indexing_utilities";
    public static final String myFingerPrint = "d815a6d669d071fa9ee02018d7bd6118ae714a61ac31542196d5fff34e6d8cb2";
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 5734L)
    private static SubLSymbol $term_being_removed$;
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLSymbol $dtp_complex_index_visitor$;
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 14910L)
    public static SubLSymbol $swap_out_intermediate_index_levelsP$;
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 28553L)
    private static SubLSymbol $precache_term_set$;
    private static final SubLSymbol $sym0$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const1$EverythingPSC;
    private static final SubLSymbol $kw2$RULE;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$FORT_P;
    private static final SubLSymbol $kw5$GAF;
    private static final SubLInteger $int6$_2;
    private static final SubLSymbol $kw7$IGNORE;
    private static final SubLSymbol $kw8$UNINITIALIZED;
    private static final SubLSymbol $sym9$_EXIT;
    private static final SubLSymbol $sym10$GAF_REMOVE_BEFORE_;
    private static final SubLObject $const11$termOfUnit;
    private static final SubLObject $const12$isa;
    private static final SubLObject $const13$genls;
    private static final SubLSymbol $sym14$COMPLEX_INDEX_VISITOR;
    private static final SubLSymbol $sym15$COMPLEX_INDEX_VISITOR_P;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$PRINT_COMPLEX_INDEX_VISITOR;
    private static final SubLSymbol $sym21$COMPLEX_INDEX_VISITOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$COMPINX_VISIT_BEGIN_SUBINDEX_FN;
    private static final SubLSymbol $sym24$_CSETF_COMPINX_VISIT_BEGIN_SUBINDEX_FN;
    private static final SubLSymbol $sym25$COMPINX_VISIT_END_SUBINDEX_FN;
    private static final SubLSymbol $sym26$_CSETF_COMPINX_VISIT_END_SUBINDEX_FN;
    private static final SubLSymbol $sym27$COMPINX_VISIT_NOTE_FINAL_INDEX_FN;
    private static final SubLSymbol $sym28$_CSETF_COMPINX_VISIT_NOTE_FINAL_INDEX_FN;
    private static final SubLSymbol $sym29$COMPINX_VISIT_BEGIN_VISIT_FN;
    private static final SubLSymbol $sym30$_CSETF_COMPINX_VISIT_BEGIN_VISIT_FN;
    private static final SubLSymbol $sym31$COMPINX_VISIT_END_VISIT_FN;
    private static final SubLSymbol $sym32$_CSETF_COMPINX_VISIT_END_VISIT_FN;
    private static final SubLSymbol $sym33$COMPINX_VISIT_PARAM;
    private static final SubLSymbol $sym34$_CSETF_COMPINX_VISIT_PARAM;
    private static final SubLSymbol $kw35$BEGIN_SUBINDEX_FN;
    private static final SubLSymbol $kw36$END_SUBINDEX_FN;
    private static final SubLSymbol $kw37$NOTE_FINAL_INDEX_FN;
    private static final SubLSymbol $kw38$BEGIN_VISIT_FN;
    private static final SubLSymbol $kw39$END_VISIT_FN;
    private static final SubLSymbol $kw40$PARAM;
    private static final SubLString $str41$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw42$BEGIN;
    private static final SubLSymbol $sym43$MAKE_COMPLEX_INDEX_VISITOR;
    private static final SubLSymbol $kw44$SLOT;
    private static final SubLSymbol $kw45$END;
    private static final SubLSymbol $sym46$VISIT_DEFSTRUCT_OBJECT_COMPLEX_INDEX_VISITOR_METHOD;
    private static final SubLString $str47$__CompInxVisit__;
    private static final SubLString $str48$__SubIndex__;
    private static final SubLString $str49$_FinalIndex__;
    private static final SubLString $str50$_;
    private static final SubLString $str51$__;
    private static final SubLString $str52$__Param__;
    private static final SubLSymbol $kw53$INDEX_ROOT;
    private static final SubLList $list54;
    private static final SubLString $str55$Illegal_state_exception__Index_co;
    private static final SubLSymbol $kw56$ENTIRE;
    private static final SubLSymbol $kw57$CHANGED;
    private static final SubLSymbol $sym58$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_VISIT;
    private static final SubLSymbol $sym59$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_SUBINDEX;
    private static final SubLSymbol $sym60$DUMP_SWAPPABLE_KB_INDEX_VISITOR_NOTE_FINAL_INDEX;
    private static final SubLSymbol $sym61$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_SUBINDEX;
    private static final SubLSymbol $sym62$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_VISIT;
    private static final SubLString $str63$The_swappable_KB_index_visitor_is;
    private static final SubLSymbol $kw64$FILE_VECTOR;
    private static final SubLSymbol $kw65$INDEX_STACK;
    private static final SubLSymbol $kw66$NEW_INDEX;
    private static final SubLSymbol $kw67$FVECTOR_INDEXICAL;
    private static final SubLSymbol $kw68$STYLE;
    private static final SubLSymbol $kw69$KEY_STACK;
    private static final SubLSymbol $kw70$NONE;
    private static final SubLString $str71$The_swappable_KB_index_visitor_di;
    private static final SubLString $str72$Invalid_state_transition__the_ind;
    private static final SubLSymbol $sym73$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str74$Failed_to_sanity_check_key__A_s_s;
    private static final SubLString $str75$Conversion_error__newly_created_m;
    private static final SubLSymbol $kw76$SWAPPED_OUT;
    private static final SubLSymbol $kw77$COMPACT;
    private static final SubLString $str78$Invalid_state_transition__index_d;
    private static final SubLString $str79$Dumpable_index_construction_faile;
    private static final SubLString $str80$____Key__A_was_not_copied_over_to;
    private static final SubLString $str81$_A__Key__A_is_in_write_out_map_bu;
    private static final SubLString $str82$Path_mis_alignment__trying_to_pop;
    private static final SubLSymbol $sym83$NOTE_PRECACHE_TERM;
    private static final SubLString $str84$Gathering_assertions;
    private static final SubLString $str85$Precaching_assertions_and_gatheri;
    private static final SubLString $str86$cdolist;
    private static final SubLSymbol $sym87$_;
    private static final SubLSymbol $sym88$CONSTANT_INTERNAL_ID;
    private static final SubLSymbol $sym89$NART_ID;
    private static final SubLSymbol $sym90$UNREPRESENTED_TERM_SUID;
    private static final SubLString $str91$Precaching_constant_indexes;
    private static final SubLString $str92$Precaching_NART_indexes_and_formu;
    private static final SubLString $str93$Precaching_unrepresented_term_ind;
    private static final SubLSymbol $kw94$ASSERTION_COUNT;
    private static final SubLSymbol $kw95$CONSTANT_COUNT;
    private static final SubLSymbol $kw96$NART_COUNT;
    private static final SubLSymbol $kw97$UNREPRESENTED_TERM_COUNT;
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 831L)
    public static SubLObject rule_with_some_pragmatic_somewhereP(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)indexing_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)indexing_utilities.$sym0$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(indexing_utilities.$const1$EverythingPSC, thread);
            result = rule_with_some_pragmaticP(rule, (SubLObject)indexing_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 1243L)
    public static SubLObject rule_with_some_pragmaticP(final SubLObject rule, SubLObject mt) {
        if (mt == indexing_utilities.UNPROVIDED) {
            mt = (SubLObject)indexing_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pragmas_foundP = (SubLObject)indexing_utilities.NIL;
        if (indexing_utilities.NIL != assertions_high.rule_assertionP(rule)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (indexing_utilities.NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, (SubLObject)indexing_utilities.NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, (SubLObject)indexing_utilities.NIL);
                    SubLObject done_var = pragmas_foundP;
                    final SubLObject token_var = (SubLObject)indexing_utilities.NIL;
                    while (indexing_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (indexing_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)indexing_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)indexing_utilities.$kw2$RULE, (SubLObject)indexing_utilities.NIL, (SubLObject)indexing_utilities.NIL);
                                SubLObject done_var_$1 = pragmas_foundP;
                                final SubLObject token_var_$2 = (SubLObject)indexing_utilities.NIL;
                                while (indexing_utilities.NIL == done_var_$1) {
                                    final SubLObject pragma = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(pragma));
                                    if (indexing_utilities.NIL != valid_$3) {
                                        final SubLObject pragma_pred = cycl_utilities.atomic_sentence_predicate(clauses.neg_lits(assertions_high.assertion_cnf(pragma)).first());
                                        if (indexing_utilities.NIL == list_utilities.member_kbeqP(pragma_pred, (SubLObject)indexing_utilities.$list3)) {
                                            pragmas_foundP = (SubLObject)indexing_utilities.T;
                                        }
                                    }
                                    done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL == valid_$3 || indexing_utilities.NIL != pragmas_foundP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)indexing_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (indexing_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL == valid || indexing_utilities.NIL != pragmas_foundP);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return pragmas_foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 1942L)
    public static SubLObject rule_with_some_asserted_more_specifically_pragmaticP(final SubLObject rule, SubLObject mt) {
        if (mt == indexing_utilities.UNPROVIDED) {
            mt = (SubLObject)indexing_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pragmas_foundP = (SubLObject)indexing_utilities.NIL;
        if (indexing_utilities.NIL != assertions_high.rule_assertionP(rule)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (indexing_utilities.NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, (SubLObject)indexing_utilities.NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, (SubLObject)indexing_utilities.NIL);
                    SubLObject done_var = pragmas_foundP;
                    final SubLObject token_var = (SubLObject)indexing_utilities.NIL;
                    while (indexing_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (indexing_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)indexing_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)indexing_utilities.$kw2$RULE, (SubLObject)indexing_utilities.NIL, (SubLObject)indexing_utilities.NIL);
                                SubLObject done_var_$5 = pragmas_foundP;
                                final SubLObject token_var_$6 = (SubLObject)indexing_utilities.NIL;
                                while (indexing_utilities.NIL == done_var_$5) {
                                    final SubLObject pragma = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                    final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(pragma));
                                    if (indexing_utilities.NIL != valid_$7) {
                                        pragmas_foundP = assertion_utilities.assertion_mentions_asserted_more_specificallyP(pragma);
                                    }
                                    done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL == valid_$7 || indexing_utilities.NIL != pragmas_foundP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)indexing_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (indexing_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL == valid || indexing_utilities.NIL != pragmas_foundP);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return pragmas_foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 2601L)
    public static SubLObject find_all_assertions_genl_mts(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_indexing.find_all_assertions(cnf);
        SubLObject visible_assertions = (SubLObject)indexing_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = all_assertions;
            SubLObject ass = (SubLObject)indexing_utilities.NIL;
            ass = cdolist_list_var.first();
            while (indexing_utilities.NIL != cdolist_list_var) {
                if (indexing_utilities.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
                    visible_assertions = (SubLObject)ConsesLow.cons(ass, visible_assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(visible_assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 3147L)
    public static SubLObject dependent_narts(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert indexing_utilities.NIL != forts.fort_p(fort) : fort;
        SubLObject v_answer = (SubLObject)indexing_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_vars.$tou_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (indexing_utilities.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(fort, (SubLObject)indexing_utilities.NIL, (SubLObject)indexing_utilities.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(fort, (SubLObject)indexing_utilities.NIL, (SubLObject)indexing_utilities.NIL);
                SubLObject done_var = (SubLObject)indexing_utilities.NIL;
                final SubLObject token_var = (SubLObject)indexing_utilities.NIL;
                while (indexing_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (indexing_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)indexing_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)indexing_utilities.$kw5$GAF, (SubLObject)indexing_utilities.NIL, (SubLObject)indexing_utilities.NIL);
                            SubLObject done_var_$9 = (SubLObject)indexing_utilities.NIL;
                            final SubLObject token_var_$10 = (SubLObject)indexing_utilities.NIL;
                            while (indexing_utilities.NIL == done_var_$9) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(assertion));
                                if (indexing_utilities.NIL != valid_$11) {
                                    v_answer = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg1(assertion), v_answer);
                                }
                                done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL == valid_$11);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)indexing_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (indexing_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL == valid);
                }
            }
            if (indexing_utilities.NIL != kb_mapping_macros.do_function_extent_index_key_validator(fort)) {
                final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec(fort);
                SubLObject final_index_iterator2 = (SubLObject)indexing_utilities.NIL;
                try {
                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)indexing_utilities.$kw5$GAF, (SubLObject)indexing_utilities.NIL, (SubLObject)indexing_utilities.NIL);
                    SubLObject done_var2 = (SubLObject)indexing_utilities.NIL;
                    final SubLObject token_var2 = (SubLObject)indexing_utilities.NIL;
                    while (indexing_utilities.NIL == done_var2) {
                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(assertion2));
                        if (indexing_utilities.NIL != valid2) {
                            v_answer = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg1(assertion2), v_answer);
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL == valid2);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)indexing_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (indexing_utilities.NIL != final_index_iterator2) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            }
            if (indexing_utilities.NIL != kb_mapping_macros.do_other_index_key_validator(fort, (SubLObject)indexing_utilities.NIL)) {
                final SubLObject final_index_spec2 = kb_mapping_macros.other_final_index_spec(fort);
                SubLObject final_index_iterator2 = (SubLObject)indexing_utilities.NIL;
                try {
                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)indexing_utilities.NIL, (SubLObject)indexing_utilities.NIL, (SubLObject)indexing_utilities.NIL);
                    SubLObject done_var2 = (SubLObject)indexing_utilities.NIL;
                    final SubLObject token_var2 = (SubLObject)indexing_utilities.NIL;
                    while (indexing_utilities.NIL == done_var2) {
                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(assertion2));
                        if (indexing_utilities.NIL != valid2 && indexing_utilities.NIL != kb_mapping_macros.do_other_index_assertion_match_p(assertion2) && indexing_utilities.NIL != term_of_unit_assertion_mentioning_fortP(assertion2, fort)) {
                            v_answer = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg1(assertion2), v_answer);
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL == valid2);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)indexing_utilities.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        if (indexing_utilities.NIL != final_index_iterator2) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                        }
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(v_answer, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 4107L)
    public static SubLObject term_of_unit_assertion_mentioning_fortP(final SubLObject assertion, final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL != function_terms.tou_assertionP(assertion) && indexing_utilities.NIL != cycl_utilities.expression_find(fort, assertions_high.gaf_arg2(assertion), (SubLObject)indexing_utilities.T, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 4276L)
    public static SubLObject nested_non_atomic_terms(final SubLObject v_object, SubLObject depth) {
        if (depth == indexing_utilities.UNPROVIDED) {
            depth = (SubLObject)indexing_utilities.$int6$_2;
        }
        SubLObject result = (SubLObject)indexing_utilities.NIL;
        if (indexing_utilities.NIL != assertions_high.rule_assertionP(v_object)) {
            if (depth.numGE((SubLObject)indexing_utilities.ZERO_INTEGER) && indexing_utilities.NIL == conses_high.member(v_object, result, (SubLObject)indexing_utilities.EQUAL, Symbols.symbol_function((SubLObject)indexing_utilities.IDENTITY))) {
                result = (SubLObject)ConsesLow.cons(v_object, result);
            }
            SubLObject cdolist_list_var = clauses.neg_lits(assertions_high.assertion_cnf(v_object));
            SubLObject lit = (SubLObject)indexing_utilities.NIL;
            lit = cdolist_list_var.first();
            while (indexing_utilities.NIL != cdolist_list_var) {
                if (depth.numGE((SubLObject)indexing_utilities.MINUS_ONE_INTEGER)) {
                    final SubLObject item_var = lit;
                    if (indexing_utilities.NIL == conses_high.member(item_var, result, (SubLObject)indexing_utilities.EQUAL, Symbols.symbol_function((SubLObject)indexing_utilities.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var, result);
                    }
                }
                SubLObject cdolist_list_var_$15 = nested_non_atomic_terms(lit, depth);
                SubLObject nested_object = (SubLObject)indexing_utilities.NIL;
                nested_object = cdolist_list_var_$15.first();
                while (indexing_utilities.NIL != cdolist_list_var_$15) {
                    final SubLObject item_var2 = nested_object;
                    if (indexing_utilities.NIL == conses_high.member(item_var2, result, (SubLObject)indexing_utilities.EQUAL, Symbols.symbol_function((SubLObject)indexing_utilities.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var2, result);
                    }
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    nested_object = cdolist_list_var_$15.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            }
            cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(v_object));
            lit = (SubLObject)indexing_utilities.NIL;
            lit = cdolist_list_var.first();
            while (indexing_utilities.NIL != cdolist_list_var) {
                if (depth.numGE((SubLObject)indexing_utilities.MINUS_ONE_INTEGER)) {
                    final SubLObject item_var = lit;
                    if (indexing_utilities.NIL == conses_high.member(item_var, result, (SubLObject)indexing_utilities.EQUAL, Symbols.symbol_function((SubLObject)indexing_utilities.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var, result);
                    }
                }
                SubLObject cdolist_list_var_$16 = nested_non_atomic_terms(lit, depth);
                SubLObject nested_object = (SubLObject)indexing_utilities.NIL;
                nested_object = cdolist_list_var_$16.first();
                while (indexing_utilities.NIL != cdolist_list_var_$16) {
                    final SubLObject item_var2 = nested_object;
                    if (indexing_utilities.NIL == conses_high.member(item_var2, result, (SubLObject)indexing_utilities.EQUAL, Symbols.symbol_function((SubLObject)indexing_utilities.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var2, result);
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    nested_object = cdolist_list_var_$16.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            }
        }
        else if (indexing_utilities.NIL != assertions_high.gaf_assertionP(v_object)) {
            if (depth.numGE((SubLObject)indexing_utilities.ZERO_INTEGER) && indexing_utilities.NIL == conses_high.member(v_object, result, (SubLObject)indexing_utilities.EQUAL, Symbols.symbol_function((SubLObject)indexing_utilities.IDENTITY))) {
                result = (SubLObject)ConsesLow.cons(v_object, result);
            }
            SubLObject cdolist_list_var2;
            final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args(assertions_high.gaf_hl_formula(v_object), (SubLObject)indexing_utilities.$kw7$IGNORE);
            SubLObject arg = (SubLObject)indexing_utilities.NIL;
            arg = cdolist_list_var2.first();
            while (indexing_utilities.NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$17 = nested_non_atomic_terms(arg, Numbers.add(depth, (SubLObject)indexing_utilities.ONE_INTEGER));
                SubLObject nested_object2 = (SubLObject)indexing_utilities.NIL;
                nested_object2 = cdolist_list_var_$17.first();
                while (indexing_utilities.NIL != cdolist_list_var_$17) {
                    final SubLObject item_var3 = nested_object2;
                    if (indexing_utilities.NIL == conses_high.member(item_var3, result, (SubLObject)indexing_utilities.EQUAL, Symbols.symbol_function((SubLObject)indexing_utilities.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var3, result);
                    }
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    nested_object2 = cdolist_list_var_$17.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                arg = cdolist_list_var2.first();
            }
        }
        else if (indexing_utilities.NIL != nart_handles.nart_p(v_object)) {
            if (depth.numGE((SubLObject)indexing_utilities.ZERO_INTEGER) && indexing_utilities.NIL == conses_high.member(v_object, result, (SubLObject)indexing_utilities.EQUAL, Symbols.symbol_function((SubLObject)indexing_utilities.IDENTITY))) {
                result = (SubLObject)ConsesLow.cons(v_object, result);
            }
            SubLObject cdolist_list_var2;
            final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args(narts_high.nart_hl_formula(v_object), (SubLObject)indexing_utilities.$kw7$IGNORE);
            SubLObject nart_arg = (SubLObject)indexing_utilities.NIL;
            nart_arg = cdolist_list_var2.first();
            while (indexing_utilities.NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$18 = nested_non_atomic_terms(nart_arg, Numbers.add(depth, (SubLObject)indexing_utilities.ONE_INTEGER));
                SubLObject nested_object2 = (SubLObject)indexing_utilities.NIL;
                nested_object2 = cdolist_list_var_$18.first();
                while (indexing_utilities.NIL != cdolist_list_var_$18) {
                    final SubLObject item_var3 = nested_object2;
                    if (indexing_utilities.NIL == conses_high.member(item_var3, result, (SubLObject)indexing_utilities.EQUAL, Symbols.symbol_function((SubLObject)indexing_utilities.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var3, result);
                    }
                    cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                    nested_object2 = cdolist_list_var_$18.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                nart_arg = cdolist_list_var2.first();
            }
        }
        else if (v_object.isCons()) {
            if (depth.numGE((SubLObject)indexing_utilities.ZERO_INTEGER) && indexing_utilities.NIL == conses_high.member(v_object, result, (SubLObject)indexing_utilities.EQUAL, Symbols.symbol_function((SubLObject)indexing_utilities.IDENTITY))) {
                result = (SubLObject)ConsesLow.cons(v_object, result);
            }
            SubLObject cdolist_list_var2;
            final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args(v_object, (SubLObject)indexing_utilities.$kw7$IGNORE);
            SubLObject arg = (SubLObject)indexing_utilities.NIL;
            arg = cdolist_list_var2.first();
            while (indexing_utilities.NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$19 = nested_non_atomic_terms(arg, Numbers.add(depth, (SubLObject)indexing_utilities.ONE_INTEGER));
                SubLObject nested_object2 = (SubLObject)indexing_utilities.NIL;
                nested_object2 = cdolist_list_var_$19.first();
                while (indexing_utilities.NIL != cdolist_list_var_$19) {
                    final SubLObject item_var3 = nested_object2;
                    if (indexing_utilities.NIL == conses_high.member(item_var3, result, (SubLObject)indexing_utilities.EQUAL, Symbols.symbol_function((SubLObject)indexing_utilities.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var3, result);
                    }
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    nested_object2 = cdolist_list_var_$19.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                arg = cdolist_list_var2.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 5794L)
    public static SubLObject sort_gafs_for_removal(final SubLObject gafs, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = indexing_utilities.$term_being_removed$.currentBinding(thread);
        try {
            indexing_utilities.$term_being_removed$.bind(v_term, thread);
            return Sort.sort(gafs, (SubLObject)indexing_utilities.$sym10$GAF_REMOVE_BEFORE_, (SubLObject)indexing_utilities.UNPROVIDED);
        }
        finally {
            indexing_utilities.$term_being_removed$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 6010L)
    public static SubLObject gaf_remove_beforeP(final SubLObject gaf1, final SubLObject gaf2) {
        return Numbers.numL(gaf_removal_order(gaf1), gaf_removal_order(gaf2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 6221L)
    public static SubLObject gaf_removal_order(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = assertions_high.gaf_arg1(gaf);
        if (indexing_utilities.NIL == kb_utilities.kbeq(arg1, indexing_utilities.$term_being_removed$.getDynamicValue(thread))) {
            return (SubLObject)indexing_utilities.ONE_INTEGER;
        }
        final SubLObject pcase_var;
        final SubLObject pred = pcase_var = assertions_high.gaf_predicate(gaf);
        if (pcase_var.eql(indexing_utilities.$const11$termOfUnit)) {
            return (SubLObject)indexing_utilities.FIVE_INTEGER;
        }
        if (pcase_var.eql(indexing_utilities.$const12$isa)) {
            return (SubLObject)indexing_utilities.FOUR_INTEGER;
        }
        if (pcase_var.eql(indexing_utilities.$const13$genls)) {
            return (SubLObject)indexing_utilities.THREE_INTEGER;
        }
        return (SubLObject)indexing_utilities.TWO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject complex_index_visitor_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_complex_index_visitor(v_object, stream, (SubLObject)indexing_utilities.ZERO_INTEGER);
        return (SubLObject)indexing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject complex_index_visitor_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $complex_index_visitor_native.class) ? indexing_utilities.T : indexing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject compinx_visit_begin_subindex_fn(final SubLObject v_object) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject compinx_visit_end_subindex_fn(final SubLObject v_object) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject compinx_visit_note_final_index_fn(final SubLObject v_object) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject compinx_visit_begin_visit_fn(final SubLObject v_object) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject compinx_visit_end_visit_fn(final SubLObject v_object) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject compinx_visit_param(final SubLObject v_object) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject _csetf_compinx_visit_begin_subindex_fn(final SubLObject v_object, final SubLObject value) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject _csetf_compinx_visit_end_subindex_fn(final SubLObject v_object, final SubLObject value) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject _csetf_compinx_visit_note_final_index_fn(final SubLObject v_object, final SubLObject value) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject _csetf_compinx_visit_begin_visit_fn(final SubLObject v_object, final SubLObject value) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject _csetf_compinx_visit_end_visit_fn(final SubLObject v_object, final SubLObject value) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject _csetf_compinx_visit_param(final SubLObject v_object, final SubLObject value) {
        assert indexing_utilities.NIL != complex_index_visitor_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject make_complex_index_visitor(SubLObject arglist) {
        if (arglist == indexing_utilities.UNPROVIDED) {
            arglist = (SubLObject)indexing_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $complex_index_visitor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)indexing_utilities.NIL, next = arglist; indexing_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)indexing_utilities.$kw35$BEGIN_SUBINDEX_FN)) {
                _csetf_compinx_visit_begin_subindex_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)indexing_utilities.$kw36$END_SUBINDEX_FN)) {
                _csetf_compinx_visit_end_subindex_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)indexing_utilities.$kw37$NOTE_FINAL_INDEX_FN)) {
                _csetf_compinx_visit_note_final_index_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)indexing_utilities.$kw38$BEGIN_VISIT_FN)) {
                _csetf_compinx_visit_begin_visit_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)indexing_utilities.$kw39$END_VISIT_FN)) {
                _csetf_compinx_visit_end_visit_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)indexing_utilities.$kw40$PARAM)) {
                _csetf_compinx_visit_param(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)indexing_utilities.$str41$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject visit_defstruct_complex_index_visitor(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)indexing_utilities.$kw42$BEGIN, (SubLObject)indexing_utilities.$sym43$MAKE_COMPLEX_INDEX_VISITOR, (SubLObject)indexing_utilities.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)indexing_utilities.$kw44$SLOT, (SubLObject)indexing_utilities.$kw35$BEGIN_SUBINDEX_FN, compinx_visit_begin_subindex_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)indexing_utilities.$kw44$SLOT, (SubLObject)indexing_utilities.$kw36$END_SUBINDEX_FN, compinx_visit_end_subindex_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)indexing_utilities.$kw44$SLOT, (SubLObject)indexing_utilities.$kw37$NOTE_FINAL_INDEX_FN, compinx_visit_note_final_index_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)indexing_utilities.$kw44$SLOT, (SubLObject)indexing_utilities.$kw38$BEGIN_VISIT_FN, compinx_visit_begin_visit_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)indexing_utilities.$kw44$SLOT, (SubLObject)indexing_utilities.$kw39$END_VISIT_FN, compinx_visit_end_visit_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)indexing_utilities.$kw44$SLOT, (SubLObject)indexing_utilities.$kw40$PARAM, compinx_visit_param(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)indexing_utilities.$kw45$END, (SubLObject)indexing_utilities.$sym43$MAKE_COMPLEX_INDEX_VISITOR, (SubLObject)indexing_utilities.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
    public static SubLObject visit_defstruct_object_complex_index_visitor_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_complex_index_visitor(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7574L)
    public static SubLObject print_complex_index_visitor(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (indexing_utilities.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)indexing_utilities.T, (SubLObject)indexing_utilities.T);
            streams_high.write_string((SubLObject)indexing_utilities.$str47$__CompInxVisit__, stream, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED);
            print_high.princ(compinx_visit_begin_visit_fn(v_object), stream);
            streams_high.write_string((SubLObject)indexing_utilities.$str48$__SubIndex__, stream, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED);
            print_high.princ(compinx_visit_begin_subindex_fn(v_object), stream);
            streams_high.write_string((SubLObject)indexing_utilities.$str49$_FinalIndex__, stream, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED);
            print_high.princ(compinx_visit_note_final_index_fn(v_object), stream);
            streams_high.write_string((SubLObject)indexing_utilities.$str50$_, stream, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED);
            print_high.princ(compinx_visit_end_subindex_fn(v_object), stream);
            streams_high.write_string((SubLObject)indexing_utilities.$str51$__, stream, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED);
            print_high.princ(compinx_visit_end_visit_fn(v_object), stream);
            streams_high.write_string((SubLObject)indexing_utilities.$str52$__Param__, stream, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED);
            print_high.princ(compinx_visit_param(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)indexing_utilities.T, (SubLObject)indexing_utilities.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 8310L)
    public static SubLObject new_complex_index_visitor(final SubLObject begin_visit_fn, final SubLObject begin_subindex_fn, final SubLObject note_final_index_fn, final SubLObject end_subindex_fn, final SubLObject end_visit_fn, SubLObject param) {
        if (param == indexing_utilities.UNPROVIDED) {
            param = (SubLObject)indexing_utilities.NIL;
        }
        final SubLObject compinx_visit = make_complex_index_visitor((SubLObject)indexing_utilities.UNPROVIDED);
        _csetf_compinx_visit_begin_visit_fn(compinx_visit, begin_visit_fn);
        _csetf_compinx_visit_begin_subindex_fn(compinx_visit, begin_subindex_fn);
        _csetf_compinx_visit_note_final_index_fn(compinx_visit, note_final_index_fn);
        _csetf_compinx_visit_end_subindex_fn(compinx_visit, end_subindex_fn);
        _csetf_compinx_visit_end_visit_fn(compinx_visit, end_visit_fn);
        _csetf_compinx_visit_param(compinx_visit, param);
        return compinx_visit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 9069L)
    public static SubLObject complex_index_visitor_begin_visit(final SubLObject compinx_visitor, final SubLObject complex_index) {
        return Functions.funcall(compinx_visit_begin_visit_fn(compinx_visitor), compinx_visitor, complex_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 9388L)
    public static SubLObject complex_index_visitor_end_visit(final SubLObject compinx_visitor, final SubLObject complex_index) {
        return Functions.funcall(compinx_visit_end_visit_fn(compinx_visitor), compinx_visitor, complex_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 9703L)
    public static SubLObject show_complex_index_visitor_final_index(final SubLObject compinx_visitor, final SubLObject final_key, final SubLObject final_index) {
        return Functions.funcall(compinx_visit_note_final_index_fn(compinx_visitor), compinx_visitor, final_key, final_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 10039L)
    public static SubLObject show_complex_index_visitor_subindex_begin(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index) {
        return Functions.funcall(compinx_visit_begin_subindex_fn(compinx_visitor), compinx_visitor, sub_key, sub_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 10399L)
    public static SubLObject show_complex_index_visitor_subindex_end(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index) {
        return Functions.funcall(compinx_visit_end_subindex_fn(compinx_visitor), compinx_visitor, sub_key, sub_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 10755L)
    public static SubLObject set_complex_index_visitor_parameter(final SubLObject compinx_visitor, final SubLObject new_param) {
        final SubLObject old_param = get_complex_index_visitor_parameter(compinx_visitor);
        _csetf_compinx_visit_param(compinx_visitor, new_param);
        return old_param;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 11267L)
    public static SubLObject get_complex_index_visitor_parameter(final SubLObject compinx_visitor) {
        return compinx_visit_param(compinx_visitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 11616L)
    public static SubLObject visit_complex_index(final SubLObject complex_index, final SubLObject compinx_visitor) {
        complex_index_visitor_begin_visit(compinx_visitor, complex_index);
        visit_complex_subindex(compinx_visitor, (SubLObject)indexing_utilities.$kw53$INDEX_ROOT, complex_index);
        complex_index_visitor_end_visit(compinx_visitor, complex_index);
        return compinx_visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 12023L)
    public static SubLObject visit_complex_subindex(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        show_complex_index_visitor_subindex_begin(compinx_visitor, sub_key, sub_index);
        if (indexing_utilities.NIL != kb_indexing_datastructures.do_intermediate_index_valid_index_p(sub_index)) {
            final SubLObject iterator = map_utilities.new_map_iterator(kb_indexing_datastructures.intermediate_index_map(sub_index));
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)indexing_utilities.NIL; indexing_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (indexing_utilities.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject i_key = (SubLObject)indexing_utilities.NIL;
                    SubLObject i_index = (SubLObject)indexing_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)indexing_utilities.$list54);
                    i_key = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)indexing_utilities.$list54);
                    i_index = current.first();
                    current = current.rest();
                    if (indexing_utilities.NIL == current) {
                        if (indexing_utilities.NIL != kb_indexing_datastructures.final_index_p(i_index)) {
                            show_complex_index_visitor_final_index(compinx_visitor, i_key, i_index);
                        }
                        else if (indexing_utilities.NIL != kb_indexing_datastructures.intermediate_index_p(i_index)) {
                            visit_complex_subindex(compinx_visitor, i_key, i_index);
                        }
                        else {
                            Errors.error((SubLObject)indexing_utilities.$str55$Illegal_state_exception__Index_co, i_index, i_key);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)indexing_utilities.$list54);
                    }
                }
            }
        }
        show_complex_index_visitor_subindex_end(compinx_visitor, sub_key, sub_index);
        return compinx_visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 12907L)
    public static SubLObject visit_changed_complex_index(final SubLObject complex_index, final SubLObject compinx_visitor) {
        complex_index_visitor_begin_visit(compinx_visitor, complex_index);
        visit_changed_complex_subindex(compinx_visitor, (SubLObject)indexing_utilities.$kw53$INDEX_ROOT, complex_index);
        complex_index_visitor_end_visit(compinx_visitor, complex_index);
        return compinx_visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 13376L)
    public static SubLObject visit_changed_complex_subindex(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject changed_keys = (SubLObject)indexing_utilities.ZERO_INTEGER;
        SubLObject unchanged_sub_index = (SubLObject)indexing_utilities.NIL;
        if (indexing_utilities.NIL != kb_indexing_datastructures.do_intermediate_index_valid_index_p(sub_index)) {
            SubLObject key_set = (SubLObject)indexing_utilities.NIL;
            thread.resetMultipleValues();
            final SubLObject key_set_$20 = kb_indexing_datastructures.segregate_index_changes_and_pristines(sub_index);
            final SubLObject unchanged_sub_index_$21 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            key_set = key_set_$20;
            unchanged_sub_index = unchanged_sub_index_$21;
            SubLObject csome_list_var = key_set;
            SubLObject i_key = (SubLObject)indexing_utilities.NIL;
            i_key = csome_list_var.first();
            while (indexing_utilities.NIL != csome_list_var) {
                final SubLObject i_index = kb_indexing_datastructures.intermediate_index_lookup(sub_index, i_key);
                if (changed_keys.isZero()) {
                    show_complex_index_visitor_subindex_begin(compinx_visitor, sub_key, unchanged_sub_index);
                }
                changed_keys = Numbers.add(changed_keys, (SubLObject)indexing_utilities.ONE_INTEGER);
                if (indexing_utilities.NIL != kb_indexing_datastructures.final_index_p(i_index)) {
                    show_complex_index_visitor_final_index(compinx_visitor, i_key, i_index);
                }
                else if (indexing_utilities.NIL != kb_indexing_datastructures.intermediate_index_p(i_index)) {
                    visit_changed_complex_subindex(compinx_visitor, i_key, i_index);
                }
                else {
                    Errors.error((SubLObject)indexing_utilities.$str55$Illegal_state_exception__Index_co, i_index, i_key);
                }
                csome_list_var = csome_list_var.rest();
                i_key = csome_list_var.first();
            }
        }
        if (changed_keys.isZero()) {
            show_complex_index_visitor_subindex_begin(compinx_visitor, sub_key, unchanged_sub_index);
        }
        show_complex_index_visitor_subindex_end(compinx_visitor, sub_key, sub_index);
        return compinx_visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 15429L)
    public static SubLObject dump_entire_swappable_complex_index(final SubLObject complex_index, final SubLObject fvector, final SubLObject indexical) {
        final SubLObject v_context = dump_swappable_kb_index_new_context(fvector, indexical, (SubLObject)indexing_utilities.$kw56$ENTIRE);
        final SubLObject visitor = new_swappable_kb_index_dump_visitor(v_context);
        visit_complex_index(complex_index, visitor);
        return dump_swappable_kb_index_get_final_result(v_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 16074L)
    public static SubLObject dump_changed_swappable_complex_index(final SubLObject complex_index, final SubLObject fvector, final SubLObject indexical) {
        final SubLObject v_context = dump_swappable_kb_index_new_context(fvector, indexical, (SubLObject)indexing_utilities.$kw57$CHANGED);
        final SubLObject visitor = new_swappable_kb_index_dump_visitor(v_context);
        visit_changed_complex_index(complex_index, visitor);
        return dump_swappable_kb_index_get_final_result(v_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 16699L)
    public static SubLObject new_swappable_kb_index_dump_visitor(final SubLObject v_context) {
        return new_complex_index_visitor((SubLObject)indexing_utilities.$sym58$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_VISIT, (SubLObject)indexing_utilities.$sym59$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_SUBINDEX, (SubLObject)indexing_utilities.$sym60$DUMP_SWAPPABLE_KB_INDEX_VISITOR_NOTE_FINAL_INDEX, (SubLObject)indexing_utilities.$sym61$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_SUBINDEX, (SubLObject)indexing_utilities.$sym62$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_VISIT, v_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 17277L)
    public static SubLObject dump_swappable_kb_index_visitor_begin_visit(final SubLObject visitor, final SubLObject complex_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        if (indexing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && indexing_utilities.NIL == dump_swappable_kb_index_valid_initial_context(v_context)) {
            Errors.error((SubLObject)indexing_utilities.$str63$The_swappable_KB_index_visitor_is, v_context);
        }
        dump_swappable_kb_index_push_current_index(v_context, kb_indexing_datastructures.clone_intermediate_index(complex_index));
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 17741L)
    public static SubLObject dump_swappable_kb_index_new_context(final SubLObject fvector, final SubLObject indexical, final SubLObject style) {
        return list_utilities.make_plist((SubLObject)ConsesLow.list((SubLObject)indexing_utilities.$kw64$FILE_VECTOR, (SubLObject)indexing_utilities.$kw65$INDEX_STACK, (SubLObject)indexing_utilities.$kw66$NEW_INDEX, (SubLObject)indexing_utilities.$kw67$FVECTOR_INDEXICAL, (SubLObject)indexing_utilities.$kw68$STYLE, (SubLObject)indexing_utilities.$kw69$KEY_STACK), (SubLObject)ConsesLow.list(fvector, stacks.create_stack(), (SubLObject)indexing_utilities.$kw70$NONE, indexical, style, stacks.create_stack()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 18097L)
    public static SubLObject dump_swappable_kb_index_valid_initial_context(final SubLObject v_context) {
        return (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL != list_utilities.property_list_p(v_context) && indexing_utilities.NIL != file_vector.file_vector_p(conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw64$FILE_VECTOR, (SubLObject)indexing_utilities.UNPROVIDED)) && indexing_utilities.NIL != stacks.stack_empty_p(conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw65$INDEX_STACK, (SubLObject)indexing_utilities.UNPROVIDED)) && indexing_utilities.$kw70$NONE == conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw66$NEW_INDEX, (SubLObject)indexing_utilities.UNPROVIDED) && indexing_utilities.NIL != file_vector_utilities.file_vector_indexical_p(conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw67$FVECTOR_INDEXICAL, (SubLObject)indexing_utilities.UNPROVIDED)) && (indexing_utilities.NIL != dumping_swappable_changed_kb_indexP(v_context) || indexing_utilities.NIL != dumping_swappable_entire_kb_indexP(v_context)) && indexing_utilities.NIL != stacks.stack_empty_p(conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw69$KEY_STACK, (SubLObject)indexing_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 18768L)
    public static SubLObject dumping_swappable_changed_kb_indexP(final SubLObject v_context) {
        return Equality.eq((SubLObject)indexing_utilities.$kw57$CHANGED, conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw68$STYLE, (SubLObject)indexing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 18876L)
    public static SubLObject dumping_swappable_entire_kb_indexP(final SubLObject v_context) {
        return Equality.eq((SubLObject)indexing_utilities.$kw56$ENTIRE, conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw68$STYLE, (SubLObject)indexing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 18982L)
    public static SubLObject dump_swappable_kb_index_visitor_end_visit(final SubLObject visitor, final SubLObject complex_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        if (indexing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && indexing_utilities.NIL == dump_swappable_kb_index_valid_final_context(v_context)) {
            Errors.error((SubLObject)indexing_utilities.$str71$The_swappable_KB_index_visitor_di, v_context);
        }
        dump_swappable_kb_index_set_final_result(v_context);
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 19505L)
    public static SubLObject dump_swappable_kb_index_valid_final_context(final SubLObject v_context) {
        return (SubLObject)SubLObjectFactory.makeBoolean(indexing_utilities.NIL != list_utilities.property_list_p(v_context) && indexing_utilities.NIL != file_vector.file_vector_p(conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw64$FILE_VECTOR, (SubLObject)indexing_utilities.UNPROVIDED)) && indexing_utilities.ONE_INTEGER.numE(stacks.stack_size(conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw65$INDEX_STACK, (SubLObject)indexing_utilities.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 19834L)
    public static SubLObject dump_swappable_kb_index_visitor_begin_subindex(final SubLObject visitor, final SubLObject sub_key, final SubLObject sub_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        dump_swappable_kb_index_push_current_key(v_context, sub_key);
        if (indexing_utilities.NIL != dumping_swappable_entire_kb_indexP(v_context)) {
            dump_swappable_kb_index_push_current_index(v_context, kb_indexing_datastructures.clone_intermediate_index(sub_index));
        }
        else if (indexing_utilities.NIL != dumping_swappable_changed_kb_indexP(v_context)) {
            dump_swappable_kb_index_push_current_index(v_context, sub_index);
        }
        else {
            Errors.error((SubLObject)indexing_utilities.$str72$Invalid_state_transition__the_ind);
        }
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 20704L)
    public static SubLObject dump_swappable_kb_index_visitor_note_final_index(final SubLObject visitor, final SubLObject final_key, SubLObject final_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject curr_index = dump_swappable_kb_index_get_current_index(v_context);
        if (indexing_utilities.NIL == kb_indexing_datastructures.final_topn_index_p(final_index)) {
            if (indexing_utilities.NIL != kb_indexing_datastructures.final_sharded_index_p(final_index)) {
                final SubLObject sharded_index = dump_swappable_kb_index_possibly_reshard_final_sharded_index(visitor, final_index);
                final_index = dump_swappable_kb_index_serialize_sharded_index(visitor, sharded_index);
            }
            else if (indexing_utilities.NIL != kb_indexing_datastructures.final_unified_index_p(final_index) && indexing_utilities.NIL != kb_indexing_datastructures.final_unified_index_is_shardableP(final_index)) {
                final SubLObject sharded_index = kb_indexing_datastructures.convert_final_simple_index_to_sharded_index(final_index);
                final_index = dump_swappable_kb_index_serialize_sharded_index(visitor, sharded_index);
            }
        }
        kb_indexing_datastructures.intermediate_index_set(curr_index, final_key, final_index);
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 21951L)
    public static SubLObject dump_swappable_kb_index_visitor_end_subindex(final SubLObject visitor, final SubLObject sub_key, final SubLObject sub_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject curr_index = dump_swappable_kb_index_pop_current_index(v_context);
        final SubLObject fvector = dump_swappable_kb_index_get_file_vector(v_context);
        final SubLObject indexical = dump_swappable_kb_index_get_file_vector_indexical(v_context);
        dump_swappable_kb_index_pop_current_key(v_context, sub_key);
        SubLObject msg = (SubLObject)indexing_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)indexing_utilities.$sym73$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    sanity_check_constructed_index_equivalence(sub_index, curr_index);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)indexing_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (msg.isString()) {
            Errors.error((SubLObject)indexing_utilities.$str74$Failed_to_sanity_check_key__A_s_s, sub_key, sub_index, curr_index);
        }
        if (indexing_utilities.NIL != indexing_utilities.$swap_out_intermediate_index_levelsP$.getDynamicValue(thread)) {
            final SubLObject curr_map = kb_indexing_datastructures.intermediate_index_map(curr_index);
            if (indexing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && indexing_utilities.NIL != file_vector_utilities.backed_map_p(curr_map)) {
                Errors.error((SubLObject)indexing_utilities.$str75$Conversion_error__newly_created_m);
            }
            if (indexing_utilities.NIL != dumping_swappable_changed_kb_indexP(v_context)) {
                file_vector_utilities.upgrade_map_to_file_vector_backed_map(curr_map, fvector, (SubLObject)indexing_utilities.$kw76$SWAPPED_OUT);
            }
            else if (indexing_utilities.NIL != dumping_swappable_entire_kb_indexP(v_context)) {
                file_vector_utilities.convert_map_to_file_vector_backed_map(curr_map, fvector, (SubLObject)indexing_utilities.$kw76$SWAPPED_OUT, (SubLObject)indexing_utilities.$kw77$COMPACT);
            }
            else {
                Errors.error((SubLObject)indexing_utilities.$str78$Invalid_state_transition__index_d);
            }
            final SubLObject backed_map = file_vector_utilities.new_indexical_backed_map(curr_map, indexical);
            kb_indexing_datastructures.intermediate_index_replace_map(curr_index, backed_map);
        }
        final SubLObject parent_index = dump_swappable_kb_index_get_current_index(v_context);
        kb_indexing_datastructures.intermediate_index_set(parent_index, sub_key, curr_index);
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 23999L)
    public static SubLObject dump_swappable_kb_index_serialize_sharded_index(final SubLObject visitor, final SubLObject sharded_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject fvector = dump_swappable_kb_index_get_file_vector(v_context);
        final SubLObject indexical = dump_swappable_kb_index_get_file_vector_indexical(v_context);
        if (indexing_utilities.NIL != dumping_swappable_entire_kb_indexP(v_context)) {
            return kb_indexing_datastructures.final_sharded_index_to_fvector_backed_sharded_index(sharded_index, fvector, indexical);
        }
        if (indexing_utilities.NIL != dumping_swappable_changed_kb_indexP(v_context)) {
            return kb_indexing_datastructures.update_fvector_backed_final_sharded_index(sharded_index, fvector, indexical);
        }
        Errors.error((SubLObject)indexing_utilities.$str78$Invalid_state_transition__index_d);
        return sharded_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 24743L)
    public static SubLObject dump_swappable_kb_index_possibly_reshard_final_sharded_index(final SubLObject visitor, final SubLObject final_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        if (indexing_utilities.NIL != dumping_swappable_entire_kb_indexP(v_context)) {
            return kb_indexing_datastructures.reshard_final_sharded_index(final_index);
        }
        if (indexing_utilities.NIL != dumping_swappable_changed_kb_indexP(v_context)) {
            return kb_indexing_datastructures.reorganize_modified_final_sharded_index(final_index);
        }
        Errors.error((SubLObject)indexing_utilities.$str78$Invalid_state_transition__index_d);
        return final_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 25268L)
    public static SubLObject sanity_check_constructed_index_equivalence(final SubLObject sub_index, final SubLObject curr_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject in_sub = map_utilities.maps_differ_in_keys(kb_indexing_datastructures.intermediate_index_map(sub_index), kb_indexing_datastructures.intermediate_index_map(curr_index), (SubLObject)indexing_utilities.T);
        final SubLObject in_curr = thread.secondMultipleValue();
        final SubLObject shared = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (indexing_utilities.NIL == set.empty_set_p(in_sub) || indexing_utilities.NIL == set.empty_set_p(in_curr)) {
            SubLObject msg = (SubLObject)indexing_utilities.NIL;
            SubLObject stream = (SubLObject)indexing_utilities.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                streams_high.write_string((SubLObject)indexing_utilities.$str79$Dumpable_index_construction_faile, stream, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED);
                SubLObject set_contents_var = set.do_set_internal(in_sub);
                SubLObject basis_object;
                SubLObject state;
                SubLObject sub_key;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)indexing_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); indexing_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    sub_key = set_contents.do_set_contents_next(basis_object, state);
                    if (indexing_utilities.NIL != set_contents.do_set_contents_element_validP(state, sub_key)) {
                        PrintLow.format(stream, (SubLObject)indexing_utilities.$str80$____Key__A_was_not_copied_over_to, sub_key);
                    }
                }
                set_contents_var = set.do_set_internal(in_curr);
                SubLObject curr_key;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)indexing_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); indexing_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    curr_key = set_contents.do_set_contents_next(basis_object, state);
                    if (indexing_utilities.NIL != set_contents.do_set_contents_element_validP(state, curr_key)) {
                        PrintLow.format(stream, (SubLObject)indexing_utilities.$str81$_A__Key__A_is_in_write_out_map_bu, curr_key);
                    }
                }
                msg = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)indexing_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)indexing_utilities.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            Errors.error(msg);
        }
        return (SubLObject)indexing_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 26027L)
    public static SubLObject dump_swappable_kb_index_get_file_vector(final SubLObject v_context) {
        return conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw64$FILE_VECTOR, (SubLObject)indexing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 26194L)
    public static SubLObject dump_swappable_kb_index_get_file_vector_indexical(final SubLObject v_context) {
        return conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw67$FVECTOR_INDEXICAL, (SubLObject)indexing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 26389L)
    public static SubLObject dump_swappable_kb_index_pop_current_index(final SubLObject v_context) {
        final SubLObject index_stack = conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw65$INDEX_STACK, (SubLObject)indexing_utilities.UNPROVIDED);
        return stacks.stack_pop(index_stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 26587L)
    public static SubLObject dump_swappable_kb_index_push_current_index(final SubLObject v_context, final SubLObject sub_index_copy) {
        final SubLObject index_stack = conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw65$INDEX_STACK, (SubLObject)indexing_utilities.UNPROVIDED);
        stacks.stack_push(sub_index_copy, index_stack);
        return v_context;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 26854L)
    public static SubLObject dump_swappable_kb_index_get_current_index(final SubLObject v_context) {
        final SubLObject index_stack = conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw65$INDEX_STACK, (SubLObject)indexing_utilities.UNPROVIDED);
        return stacks.stack_peek(index_stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 27062L)
    public static SubLObject dump_swappable_kb_index_push_current_key(final SubLObject v_context, final SubLObject sub_key) {
        final SubLObject key_stack = conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw69$KEY_STACK, (SubLObject)indexing_utilities.UNPROVIDED);
        stacks.stack_push(sub_key, key_stack);
        return v_context;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 27371L)
    public static SubLObject dump_swappable_kb_index_pop_current_key(final SubLObject v_context, final SubLObject sub_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key_stack = conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw69$KEY_STACK, (SubLObject)indexing_utilities.UNPROVIDED);
        final SubLObject curr_top = stacks.stack_peek(key_stack);
        if (indexing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !sub_key.eql(curr_top)) {
            Errors.error((SubLObject)indexing_utilities.$str82$Path_mis_alignment__trying_to_pop, sub_key, curr_top);
        }
        stacks.stack_pop(key_stack);
        return v_context;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 27831L)
    public static SubLObject dump_swappable_kb_index_get_current_key_path(final SubLObject v_context) {
        final SubLObject key_stack = conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw69$KEY_STACK, (SubLObject)indexing_utilities.UNPROVIDED);
        final SubLObject contents = stacks.stack_elements(key_stack);
        return Sequences.nreverse(contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 28036L)
    public static SubLObject dump_swappable_kb_index_get_final_result(final SubLObject v_context) {
        return conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw66$NEW_INDEX, (SubLObject)indexing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 28178L)
    public static SubLObject dump_swappable_kb_index_set_final_result(final SubLObject v_context) {
        final SubLObject index_stack = conses_high.getf(v_context, (SubLObject)indexing_utilities.$kw65$INDEX_STACK, (SubLObject)indexing_utilities.UNPROVIDED);
        final SubLObject top_index = stacks.stack_peek(index_stack);
        conses_high.putf(v_context, (SubLObject)indexing_utilities.$kw66$NEW_INDEX, kb_indexing_datastructures.intermediate_index_lookup(top_index, (SubLObject)indexing_utilities.$kw53$INDEX_ROOT));
        return dump_swappable_kb_index_get_final_result(v_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 28761L)
    public static SubLObject note_precache_term(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (indexing_utilities.NIL != forts.fort_p(v_object) || indexing_utilities.NIL != kb_indexing_datastructures.indexed_unrepresented_term_p(v_object)) {
            return set.set_add(v_object, indexing_utilities.$precache_term_set$.getDynamicValue(thread));
        }
        return (SubLObject)indexing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 28939L)
    public static SubLObject precache_predicate_extent(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)indexing_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)indexing_utilities.$sym0$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(indexing_utilities.$const1$EverythingPSC, thread);
            final SubLObject message_var = (SubLObject)indexing_utilities.$str84$Gathering_assertions;
            final SubLObject start_time = utilities_macros.noting_elapsed_time_preamble(message_var);
            assertions = kb_mapping.gather_predicate_extent_index(predicate, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED);
            assertions = assertion_utilities.sort_assertions(assertions);
            utilities_macros.noting_elapsed_time_postamble(message_var, start_time);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject term_set = set.new_set(Symbols.symbol_function((SubLObject)indexing_utilities.EQUAL), number_utilities.f_2X(Sequences.length(assertions)));
        final SubLObject _prev_bind_3 = indexing_utilities.$precache_term_set$.currentBinding(thread);
        try {
            indexing_utilities.$precache_term_set$.bind(term_set, thread);
            final SubLObject list_var = assertions;
            final SubLObject _prev_bind_0_$22 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_9 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)indexing_utilities.$str85$Precaching_assertions_and_gatheri, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)indexing_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)indexing_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)indexing_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)indexing_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject ass = (SubLObject)indexing_utilities.NIL;
                    ass = csome_list_var.first();
                    while (indexing_utilities.NIL != csome_list_var) {
                        cycl_utilities.assertion_map(Symbols.symbol_function((SubLObject)indexing_utilities.$sym83$NOTE_PRECACHE_TERM), ass, (SubLObject)indexing_utilities.UNPROVIDED, (SubLObject)indexing_utilities.UNPROVIDED);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)indexing_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ass = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)indexing_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_10, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_9, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_8, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$22, thread);
            }
        }
        finally {
            indexing_utilities.$precache_term_set$.rebind(_prev_bind_3, thread);
        }
        SubLObject constants = (SubLObject)indexing_utilities.NIL;
        SubLObject narts = (SubLObject)indexing_utilities.NIL;
        SubLObject v_unrepresented_terms = (SubLObject)indexing_utilities.NIL;
        final SubLObject set_contents_var = set.do_set_internal(term_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject v_term;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)indexing_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); indexing_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            v_term = set_contents.do_set_contents_next(basis_object, state);
            if (indexing_utilities.NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                if (indexing_utilities.NIL != constant_handles.constant_p(v_term)) {
                    constants = (SubLObject)ConsesLow.cons(v_term, constants);
                }
                else if (indexing_utilities.NIL != nart_handles.nart_p(v_term)) {
                    narts = (SubLObject)ConsesLow.cons(v_term, narts);
                }
                else if (indexing_utilities.NIL != kb_indexing_datastructures.indexed_unrepresented_term_p(v_term)) {
                    v_unrepresented_terms = (SubLObject)ConsesLow.cons(v_term, v_unrepresented_terms);
                }
            }
        }
        constants = Sort.sort(constants, Symbols.symbol_function((SubLObject)indexing_utilities.$sym87$_), Symbols.symbol_function((SubLObject)indexing_utilities.$sym88$CONSTANT_INTERNAL_ID));
        narts = Sort.sort(narts, Symbols.symbol_function((SubLObject)indexing_utilities.$sym87$_), Symbols.symbol_function((SubLObject)indexing_utilities.$sym89$NART_ID));
        v_unrepresented_terms = Sort.sort(v_unrepresented_terms, Symbols.symbol_function((SubLObject)indexing_utilities.$sym87$_), Symbols.symbol_function((SubLObject)indexing_utilities.$sym90$UNREPRESENTED_TERM_SUID));
        if (indexing_utilities.NIL != constants) {
            final SubLObject list_var2 = constants;
            final SubLObject _prev_bind_11 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_13 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_15 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_16 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_17 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_18 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)indexing_utilities.$str91$Precaching_constant_indexes, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var2), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)indexing_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)indexing_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)indexing_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)indexing_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var2 = list_var2;
                    SubLObject constant = (SubLObject)indexing_utilities.NIL;
                    constant = csome_list_var2.first();
                    while (indexing_utilities.NIL != csome_list_var2) {
                        kb_indexing_datastructures.term_index(constant);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)indexing_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var2 = csome_list_var2.rest();
                        constant = csome_list_var2.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)indexing_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_18, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_17, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_16, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_15, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_14, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_13, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_11, thread);
            }
        }
        if (indexing_utilities.NIL != narts) {
            final SubLObject list_var2 = narts;
            final SubLObject _prev_bind_11 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_13 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_15 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_16 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_17 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_18 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)indexing_utilities.$str92$Precaching_NART_indexes_and_formu, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var2), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)indexing_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)indexing_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)indexing_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)indexing_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var2 = list_var2;
                    SubLObject nart = (SubLObject)indexing_utilities.NIL;
                    nart = csome_list_var2.first();
                    while (indexing_utilities.NIL != csome_list_var2) {
                        kb_indexing_datastructures.term_index(nart);
                        narts_high.nart_hl_formula(nart);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)indexing_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var2 = csome_list_var2.rest();
                        nart = csome_list_var2.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)indexing_utilities.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_18, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_17, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_16, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_15, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_14, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_13, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_11, thread);
            }
        }
        if (indexing_utilities.NIL != v_unrepresented_terms) {
            final SubLObject list_var2 = v_unrepresented_terms;
            final SubLObject _prev_bind_11 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_13 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_15 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_16 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_17 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_18 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)indexing_utilities.$str93$Precaching_unrepresented_term_ind, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var2), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)indexing_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)indexing_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)indexing_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)indexing_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var2 = list_var2;
                    SubLObject urt = (SubLObject)indexing_utilities.NIL;
                    urt = csome_list_var2.first();
                    while (indexing_utilities.NIL != csome_list_var2) {
                        kb_indexing_datastructures.term_index(urt);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)indexing_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var2 = csome_list_var2.rest();
                        urt = csome_list_var2.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)indexing_utilities.T, thread);
                        final SubLObject _values4 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values4);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_18, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_17, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_16, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_15, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_14, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_13, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_11, thread);
            }
        }
        return (SubLObject)ConsesLow.list((SubLObject)indexing_utilities.$kw94$ASSERTION_COUNT, Sequences.length(assertions), (SubLObject)indexing_utilities.$kw95$CONSTANT_COUNT, Sequences.length(constants), (SubLObject)indexing_utilities.$kw96$NART_COUNT, Sequences.length(narts), (SubLObject)indexing_utilities.$kw97$UNREPRESENTED_TERM_COUNT, Sequences.length(v_unrepresented_terms));
    }
    
    public static SubLObject declare_indexing_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "rule_with_some_pragmatic_somewhereP", "RULE-WITH-SOME-PRAGMATIC-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "rule_with_some_pragmaticP", "RULE-WITH-SOME-PRAGMATIC?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "rule_with_some_asserted_more_specifically_pragmaticP", "RULE-WITH-SOME-ASSERTED-MORE-SPECIFICALLY-PRAGMATIC?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "find_all_assertions_genl_mts", "FIND-ALL-ASSERTIONS-GENL-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dependent_narts", "DEPENDENT-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "term_of_unit_assertion_mentioning_fortP", "TERM-OF-UNIT-ASSERTION-MENTIONING-FORT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "nested_non_atomic_terms", "NESTED-NON-ATOMIC-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "sort_gafs_for_removal", "SORT-GAFS-FOR-REMOVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "gaf_remove_beforeP", "GAF-REMOVE-BEFORE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "gaf_removal_order", "GAF-REMOVAL-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "complex_index_visitor_print_function_trampoline", "COMPLEX-INDEX-VISITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "complex_index_visitor_p", "COMPLEX-INDEX-VISITOR-P", 1, 0, false);
        new $complex_index_visitor_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "compinx_visit_begin_subindex_fn", "COMPINX-VISIT-BEGIN-SUBINDEX-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "compinx_visit_end_subindex_fn", "COMPINX-VISIT-END-SUBINDEX-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "compinx_visit_note_final_index_fn", "COMPINX-VISIT-NOTE-FINAL-INDEX-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "compinx_visit_begin_visit_fn", "COMPINX-VISIT-BEGIN-VISIT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "compinx_visit_end_visit_fn", "COMPINX-VISIT-END-VISIT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "compinx_visit_param", "COMPINX-VISIT-PARAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "_csetf_compinx_visit_begin_subindex_fn", "_CSETF-COMPINX-VISIT-BEGIN-SUBINDEX-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "_csetf_compinx_visit_end_subindex_fn", "_CSETF-COMPINX-VISIT-END-SUBINDEX-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "_csetf_compinx_visit_note_final_index_fn", "_CSETF-COMPINX-VISIT-NOTE-FINAL-INDEX-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "_csetf_compinx_visit_begin_visit_fn", "_CSETF-COMPINX-VISIT-BEGIN-VISIT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "_csetf_compinx_visit_end_visit_fn", "_CSETF-COMPINX-VISIT-END-VISIT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "_csetf_compinx_visit_param", "_CSETF-COMPINX-VISIT-PARAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "make_complex_index_visitor", "MAKE-COMPLEX-INDEX-VISITOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "visit_defstruct_complex_index_visitor", "VISIT-DEFSTRUCT-COMPLEX-INDEX-VISITOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "visit_defstruct_object_complex_index_visitor_method", "VISIT-DEFSTRUCT-OBJECT-COMPLEX-INDEX-VISITOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "print_complex_index_visitor", "PRINT-COMPLEX-INDEX-VISITOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "new_complex_index_visitor", "NEW-COMPLEX-INDEX-VISITOR", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "complex_index_visitor_begin_visit", "COMPLEX-INDEX-VISITOR-BEGIN-VISIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "complex_index_visitor_end_visit", "COMPLEX-INDEX-VISITOR-END-VISIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "show_complex_index_visitor_final_index", "SHOW-COMPLEX-INDEX-VISITOR-FINAL-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "show_complex_index_visitor_subindex_begin", "SHOW-COMPLEX-INDEX-VISITOR-SUBINDEX-BEGIN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "show_complex_index_visitor_subindex_end", "SHOW-COMPLEX-INDEX-VISITOR-SUBINDEX-END", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "set_complex_index_visitor_parameter", "SET-COMPLEX-INDEX-VISITOR-PARAMETER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "get_complex_index_visitor_parameter", "GET-COMPLEX-INDEX-VISITOR-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "visit_complex_index", "VISIT-COMPLEX-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "visit_complex_subindex", "VISIT-COMPLEX-SUBINDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "visit_changed_complex_index", "VISIT-CHANGED-COMPLEX-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "visit_changed_complex_subindex", "VISIT-CHANGED-COMPLEX-SUBINDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_entire_swappable_complex_index", "DUMP-ENTIRE-SWAPPABLE-COMPLEX-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_changed_swappable_complex_index", "DUMP-CHANGED-SWAPPABLE-COMPLEX-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "new_swappable_kb_index_dump_visitor", "NEW-SWAPPABLE-KB-INDEX-DUMP-VISITOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_visitor_begin_visit", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-VISIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_new_context", "DUMP-SWAPPABLE-KB-INDEX-NEW-CONTEXT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_valid_initial_context", "DUMP-SWAPPABLE-KB-INDEX-VALID-INITIAL-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dumping_swappable_changed_kb_indexP", "DUMPING-SWAPPABLE-CHANGED-KB-INDEX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dumping_swappable_entire_kb_indexP", "DUMPING-SWAPPABLE-ENTIRE-KB-INDEX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_visitor_end_visit", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-VISIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_valid_final_context", "DUMP-SWAPPABLE-KB-INDEX-VALID-FINAL-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_visitor_begin_subindex", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-SUBINDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_visitor_note_final_index", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-NOTE-FINAL-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_visitor_end_subindex", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-SUBINDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_serialize_sharded_index", "DUMP-SWAPPABLE-KB-INDEX-SERIALIZE-SHARDED-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_possibly_reshard_final_sharded_index", "DUMP-SWAPPABLE-KB-INDEX-POSSIBLY-RESHARD-FINAL-SHARDED-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "sanity_check_constructed_index_equivalence", "SANITY-CHECK-CONSTRUCTED-INDEX-EQUIVALENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_get_file_vector", "DUMP-SWAPPABLE-KB-INDEX-GET-FILE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_get_file_vector_indexical", "DUMP-SWAPPABLE-KB-INDEX-GET-FILE-VECTOR-INDEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_pop_current_index", "DUMP-SWAPPABLE-KB-INDEX-POP-CURRENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_push_current_index", "DUMP-SWAPPABLE-KB-INDEX-PUSH-CURRENT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_get_current_index", "DUMP-SWAPPABLE-KB-INDEX-GET-CURRENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_push_current_key", "DUMP-SWAPPABLE-KB-INDEX-PUSH-CURRENT-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_pop_current_key", "DUMP-SWAPPABLE-KB-INDEX-POP-CURRENT-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_get_current_key_path", "DUMP-SWAPPABLE-KB-INDEX-GET-CURRENT-KEY-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_get_final_result", "DUMP-SWAPPABLE-KB-INDEX-GET-FINAL-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "dump_swappable_kb_index_set_final_result", "DUMP-SWAPPABLE-KB-INDEX-SET-FINAL-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "note_precache_term", "NOTE-PRECACHE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.indexing_utilities", "precache_predicate_extent", "PRECACHE-PREDICATE-EXTENT", 1, 0, false);
        return (SubLObject)indexing_utilities.NIL;
    }
    
    public static SubLObject init_indexing_utilities_file() {
        indexing_utilities.$term_being_removed$ = SubLFiles.defparameter("*TERM-BEING-REMOVED*", (SubLObject)indexing_utilities.$kw8$UNINITIALIZED);
        indexing_utilities.$dtp_complex_index_visitor$ = SubLFiles.defconstant("*DTP-COMPLEX-INDEX-VISITOR*", (SubLObject)indexing_utilities.$sym14$COMPLEX_INDEX_VISITOR);
        indexing_utilities.$swap_out_intermediate_index_levelsP$ = SubLFiles.defparameter("*SWAP-OUT-INTERMEDIATE-INDEX-LEVELS?*", (SubLObject)indexing_utilities.T);
        indexing_utilities.$precache_term_set$ = SubLFiles.defparameter("*PRECACHE-TERM-SET*", (SubLObject)indexing_utilities.$kw8$UNINITIALIZED);
        return (SubLObject)indexing_utilities.NIL;
    }
    
    public static SubLObject setup_indexing_utilities_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), indexing_utilities.$dtp_complex_index_visitor$.getGlobalValue(), Symbols.symbol_function((SubLObject)indexing_utilities.$sym21$COMPLEX_INDEX_VISITOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)indexing_utilities.$list22);
        Structures.def_csetf((SubLObject)indexing_utilities.$sym23$COMPINX_VISIT_BEGIN_SUBINDEX_FN, (SubLObject)indexing_utilities.$sym24$_CSETF_COMPINX_VISIT_BEGIN_SUBINDEX_FN);
        Structures.def_csetf((SubLObject)indexing_utilities.$sym25$COMPINX_VISIT_END_SUBINDEX_FN, (SubLObject)indexing_utilities.$sym26$_CSETF_COMPINX_VISIT_END_SUBINDEX_FN);
        Structures.def_csetf((SubLObject)indexing_utilities.$sym27$COMPINX_VISIT_NOTE_FINAL_INDEX_FN, (SubLObject)indexing_utilities.$sym28$_CSETF_COMPINX_VISIT_NOTE_FINAL_INDEX_FN);
        Structures.def_csetf((SubLObject)indexing_utilities.$sym29$COMPINX_VISIT_BEGIN_VISIT_FN, (SubLObject)indexing_utilities.$sym30$_CSETF_COMPINX_VISIT_BEGIN_VISIT_FN);
        Structures.def_csetf((SubLObject)indexing_utilities.$sym31$COMPINX_VISIT_END_VISIT_FN, (SubLObject)indexing_utilities.$sym32$_CSETF_COMPINX_VISIT_END_VISIT_FN);
        Structures.def_csetf((SubLObject)indexing_utilities.$sym33$COMPINX_VISIT_PARAM, (SubLObject)indexing_utilities.$sym34$_CSETF_COMPINX_VISIT_PARAM);
        Equality.identity((SubLObject)indexing_utilities.$sym14$COMPLEX_INDEX_VISITOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), indexing_utilities.$dtp_complex_index_visitor$.getGlobalValue(), Symbols.symbol_function((SubLObject)indexing_utilities.$sym46$VISIT_DEFSTRUCT_OBJECT_COMPLEX_INDEX_VISITOR_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)indexing_utilities.$sym83$NOTE_PRECACHE_TERM);
        return (SubLObject)indexing_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_indexing_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_indexing_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_indexing_utilities_file();
    }
    
    static {
        me = (SubLFile)new indexing_utilities();
        indexing_utilities.$term_being_removed$ = null;
        indexing_utilities.$dtp_complex_index_visitor$ = null;
        indexing_utilities.$swap_out_intermediate_index_levelsP$ = null;
        indexing_utilities.$precache_term_set$ = null;
        $sym0$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const1$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw2$RULE = SubLObjectFactory.makeKeyword("RULE");
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forwardNonTriggerLiteral")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forwardTriggerLiteral")));
        $sym4$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw5$GAF = SubLObjectFactory.makeKeyword("GAF");
        $int6$_2 = SubLObjectFactory.makeInteger(-2);
        $kw7$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw8$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym9$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym10$GAF_REMOVE_BEFORE_ = SubLObjectFactory.makeSymbol("GAF-REMOVE-BEFORE?");
        $const11$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $const12$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const13$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym14$COMPLEX_INDEX_VISITOR = SubLObjectFactory.makeSymbol("COMPLEX-INDEX-VISITOR");
        $sym15$COMPLEX_INDEX_VISITOR_P = SubLObjectFactory.makeSymbol("COMPLEX-INDEX-VISITOR-P");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BEGIN-SUBINDEX-FN"), (SubLObject)SubLObjectFactory.makeSymbol("END-SUBINDEX-FN"), (SubLObject)SubLObjectFactory.makeSymbol("NOTE-FINAL-INDEX-FN"), (SubLObject)SubLObjectFactory.makeSymbol("BEGIN-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("END-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PARAM"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BEGIN-SUBINDEX-FN"), (SubLObject)SubLObjectFactory.makeKeyword("END-SUBINDEX-FN"), (SubLObject)SubLObjectFactory.makeKeyword("NOTE-FINAL-INDEX-FN"), (SubLObject)SubLObjectFactory.makeKeyword("BEGIN-VISIT-FN"), (SubLObject)SubLObjectFactory.makeKeyword("END-VISIT-FN"), (SubLObject)SubLObjectFactory.makeKeyword("PARAM"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPINX-VISIT-BEGIN-SUBINDEX-FN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPINX-VISIT-END-SUBINDEX-FN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPINX-VISIT-NOTE-FINAL-INDEX-FN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPINX-VISIT-BEGIN-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPINX-VISIT-END-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPINX-VISIT-PARAM"));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-BEGIN-SUBINDEX-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-END-SUBINDEX-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-NOTE-FINAL-INDEX-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-BEGIN-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-END-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-PARAM"));
        $sym20$PRINT_COMPLEX_INDEX_VISITOR = SubLObjectFactory.makeSymbol("PRINT-COMPLEX-INDEX-VISITOR");
        $sym21$COMPLEX_INDEX_VISITOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("COMPLEX-INDEX-VISITOR-PRINT-FUNCTION-TRAMPOLINE");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-INDEX-VISITOR-P"));
        $sym23$COMPINX_VISIT_BEGIN_SUBINDEX_FN = SubLObjectFactory.makeSymbol("COMPINX-VISIT-BEGIN-SUBINDEX-FN");
        $sym24$_CSETF_COMPINX_VISIT_BEGIN_SUBINDEX_FN = SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-BEGIN-SUBINDEX-FN");
        $sym25$COMPINX_VISIT_END_SUBINDEX_FN = SubLObjectFactory.makeSymbol("COMPINX-VISIT-END-SUBINDEX-FN");
        $sym26$_CSETF_COMPINX_VISIT_END_SUBINDEX_FN = SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-END-SUBINDEX-FN");
        $sym27$COMPINX_VISIT_NOTE_FINAL_INDEX_FN = SubLObjectFactory.makeSymbol("COMPINX-VISIT-NOTE-FINAL-INDEX-FN");
        $sym28$_CSETF_COMPINX_VISIT_NOTE_FINAL_INDEX_FN = SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-NOTE-FINAL-INDEX-FN");
        $sym29$COMPINX_VISIT_BEGIN_VISIT_FN = SubLObjectFactory.makeSymbol("COMPINX-VISIT-BEGIN-VISIT-FN");
        $sym30$_CSETF_COMPINX_VISIT_BEGIN_VISIT_FN = SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-BEGIN-VISIT-FN");
        $sym31$COMPINX_VISIT_END_VISIT_FN = SubLObjectFactory.makeSymbol("COMPINX-VISIT-END-VISIT-FN");
        $sym32$_CSETF_COMPINX_VISIT_END_VISIT_FN = SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-END-VISIT-FN");
        $sym33$COMPINX_VISIT_PARAM = SubLObjectFactory.makeSymbol("COMPINX-VISIT-PARAM");
        $sym34$_CSETF_COMPINX_VISIT_PARAM = SubLObjectFactory.makeSymbol("_CSETF-COMPINX-VISIT-PARAM");
        $kw35$BEGIN_SUBINDEX_FN = SubLObjectFactory.makeKeyword("BEGIN-SUBINDEX-FN");
        $kw36$END_SUBINDEX_FN = SubLObjectFactory.makeKeyword("END-SUBINDEX-FN");
        $kw37$NOTE_FINAL_INDEX_FN = SubLObjectFactory.makeKeyword("NOTE-FINAL-INDEX-FN");
        $kw38$BEGIN_VISIT_FN = SubLObjectFactory.makeKeyword("BEGIN-VISIT-FN");
        $kw39$END_VISIT_FN = SubLObjectFactory.makeKeyword("END-VISIT-FN");
        $kw40$PARAM = SubLObjectFactory.makeKeyword("PARAM");
        $str41$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw42$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym43$MAKE_COMPLEX_INDEX_VISITOR = SubLObjectFactory.makeSymbol("MAKE-COMPLEX-INDEX-VISITOR");
        $kw44$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw45$END = SubLObjectFactory.makeKeyword("END");
        $sym46$VISIT_DEFSTRUCT_OBJECT_COMPLEX_INDEX_VISITOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-COMPLEX-INDEX-VISITOR-METHOD");
        $str47$__CompInxVisit__ = SubLObjectFactory.makeString(" (CompInxVisit: ");
        $str48$__SubIndex__ = SubLObjectFactory.makeString(" (SubIndex: ");
        $str49$_FinalIndex__ = SubLObjectFactory.makeString(" FinalIndex: ");
        $str50$_ = SubLObjectFactory.makeString(" ");
        $str51$__ = SubLObjectFactory.makeString(") ");
        $str52$__Param__ = SubLObjectFactory.makeString(") Param: ");
        $kw53$INDEX_ROOT = SubLObjectFactory.makeKeyword("INDEX-ROOT");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("I-INDEX"));
        $str55$Illegal_state_exception__Index_co = SubLObjectFactory.makeString("Illegal state exception: Index contains object ~A under ~A, which is neither a FINAL nor an INTERMEDIATE index.");
        $kw56$ENTIRE = SubLObjectFactory.makeKeyword("ENTIRE");
        $kw57$CHANGED = SubLObjectFactory.makeKeyword("CHANGED");
        $sym58$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_VISIT = SubLObjectFactory.makeSymbol("DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-VISIT");
        $sym59$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_SUBINDEX = SubLObjectFactory.makeSymbol("DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-SUBINDEX");
        $sym60$DUMP_SWAPPABLE_KB_INDEX_VISITOR_NOTE_FINAL_INDEX = SubLObjectFactory.makeSymbol("DUMP-SWAPPABLE-KB-INDEX-VISITOR-NOTE-FINAL-INDEX");
        $sym61$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_SUBINDEX = SubLObjectFactory.makeSymbol("DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-SUBINDEX");
        $sym62$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_VISIT = SubLObjectFactory.makeSymbol("DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-VISIT");
        $str63$The_swappable_KB_index_visitor_is = SubLObjectFactory.makeString("The swappable KB index visitor is not properly setup; initial context ~S is bogus.");
        $kw64$FILE_VECTOR = SubLObjectFactory.makeKeyword("FILE-VECTOR");
        $kw65$INDEX_STACK = SubLObjectFactory.makeKeyword("INDEX-STACK");
        $kw66$NEW_INDEX = SubLObjectFactory.makeKeyword("NEW-INDEX");
        $kw67$FVECTOR_INDEXICAL = SubLObjectFactory.makeKeyword("FVECTOR-INDEXICAL");
        $kw68$STYLE = SubLObjectFactory.makeKeyword("STYLE");
        $kw69$KEY_STACK = SubLObjectFactory.makeKeyword("KEY-STACK");
        $kw70$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str71$The_swappable_KB_index_visitor_di = SubLObjectFactory.makeString("The swappable KB index visitor did not complete properly; final context ~S is bogus.");
        $str72$Invalid_state_transition__the_ind = SubLObjectFactory.makeString("Invalid state transition--the index dump style is neither changed nor entire???");
        $sym73$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str74$Failed_to_sanity_check_key__A_s_s = SubLObjectFactory.makeString("Failed to sanity check key ~A's sub-index ~A against recreated ~A.~%");
        $str75$Conversion_error__newly_created_m = SubLObjectFactory.makeString("Conversion error--newly created maps should not be backed already.");
        $kw76$SWAPPED_OUT = SubLObjectFactory.makeKeyword("SWAPPED-OUT");
        $kw77$COMPACT = SubLObjectFactory.makeKeyword("COMPACT");
        $str78$Invalid_state_transition__index_d = SubLObjectFactory.makeString("Invalid state transition--index dump style is neither changed nor entire???");
        $str79$Dumpable_index_construction_faile = SubLObjectFactory.makeString("Dumpable index-construction failed:");
        $str80$____Key__A_was_not_copied_over_to = SubLObjectFactory.makeString("~&  Key ~A was not copied over to write-out map.~%");
        $str81$_A__Key__A_is_in_write_out_map_bu = SubLObjectFactory.makeString("~A  Key ~A is in write-out map but not in sub-index.~%");
        $str82$Path_mis_alignment__trying_to_pop = SubLObjectFactory.makeString("Path mis-alignment; trying to pop ~A but top of stack is ~A.~%");
        $sym83$NOTE_PRECACHE_TERM = SubLObjectFactory.makeSymbol("NOTE-PRECACHE-TERM");
        $str84$Gathering_assertions = SubLObjectFactory.makeString("Gathering assertions");
        $str85$Precaching_assertions_and_gatheri = SubLObjectFactory.makeString("Precaching assertions and gathering terms");
        $str86$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym87$_ = SubLObjectFactory.makeSymbol("<");
        $sym88$CONSTANT_INTERNAL_ID = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID");
        $sym89$NART_ID = SubLObjectFactory.makeSymbol("NART-ID");
        $sym90$UNREPRESENTED_TERM_SUID = SubLObjectFactory.makeSymbol("UNREPRESENTED-TERM-SUID");
        $str91$Precaching_constant_indexes = SubLObjectFactory.makeString("Precaching constant indexes");
        $str92$Precaching_NART_indexes_and_formu = SubLObjectFactory.makeString("Precaching NART indexes and formulas");
        $str93$Precaching_unrepresented_term_ind = SubLObjectFactory.makeString("Precaching unrepresented term indexes");
        $kw94$ASSERTION_COUNT = SubLObjectFactory.makeKeyword("ASSERTION-COUNT");
        $kw95$CONSTANT_COUNT = SubLObjectFactory.makeKeyword("CONSTANT-COUNT");
        $kw96$NART_COUNT = SubLObjectFactory.makeKeyword("NART-COUNT");
        $kw97$UNREPRESENTED_TERM_COUNT = SubLObjectFactory.makeKeyword("UNREPRESENTED-TERM-COUNT");
    }
    
    public static final class $complex_index_visitor_native extends SubLStructNative
    {
        public SubLObject $begin_subindex_fn;
        public SubLObject $end_subindex_fn;
        public SubLObject $note_final_index_fn;
        public SubLObject $begin_visit_fn;
        public SubLObject $end_visit_fn;
        public SubLObject $param;
        private static final SubLStructDeclNative structDecl;
        
        public $complex_index_visitor_native() {
            this.$begin_subindex_fn = (SubLObject)CommonSymbols.NIL;
            this.$end_subindex_fn = (SubLObject)CommonSymbols.NIL;
            this.$note_final_index_fn = (SubLObject)CommonSymbols.NIL;
            this.$begin_visit_fn = (SubLObject)CommonSymbols.NIL;
            this.$end_visit_fn = (SubLObject)CommonSymbols.NIL;
            this.$param = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$complex_index_visitor_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$begin_subindex_fn;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$end_subindex_fn;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$note_final_index_fn;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$begin_visit_fn;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$end_visit_fn;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$param;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$begin_subindex_fn = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$end_subindex_fn = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$note_final_index_fn = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$begin_visit_fn = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$end_visit_fn = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$param = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$complex_index_visitor_native.class, indexing_utilities.$sym14$COMPLEX_INDEX_VISITOR, indexing_utilities.$sym15$COMPLEX_INDEX_VISITOR_P, indexing_utilities.$list16, indexing_utilities.$list17, new String[] { "$begin_subindex_fn", "$end_subindex_fn", "$note_final_index_fn", "$begin_visit_fn", "$end_visit_fn", "$param" }, indexing_utilities.$list18, indexing_utilities.$list19, indexing_utilities.$sym20$PRINT_COMPLEX_INDEX_VISITOR);
        }
    }
    
    public static final class $complex_index_visitor_p$UnaryFunction extends UnaryFunction
    {
        public $complex_index_visitor_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("COMPLEX-INDEX-VISITOR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return indexing_utilities.complex_index_visitor_p(arg1);
        }
    }
}

/*

	Total time: 696 ms
	
*/