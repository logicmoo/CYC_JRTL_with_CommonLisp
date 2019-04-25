package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class noun_compound_caching extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.noun_compound_caching";
    public static final String myFingerPrint = "f1e006ca2a4ebd8375fbd08deb8cbf1b9a6030b3a5fc5e1ed2a01413e34c8d81";
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 2053L)
    private static SubLSymbol $nc_rule_semantic_mappings$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 2823L)
    private static SubLSymbol $nc_rule_semantic_constraint_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 2971L)
    private static SubLSymbol $current_nc_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 10984L)
    private static SubLSymbol $ncr_inference_rule_var_table$;
    private static final SubLSymbol $kw0$DEFAULT;
    private static final SubLSymbol $kw1$BACKWARD;
    private static final SubLObject $const2$inferenceRuleForNounCompoundRule;
    private static final SubLObject $const3$pragmaticRequirement;
    private static final SubLSymbol $kw4$FORWARD;
    private static final SubLObject $const5$forwardParseNounCompound;
    private static final SubLObject $const6$GeneralEnglishMt;
    private static final SubLSymbol $sym7$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const8$EverythingPSC;
    private static final SubLSymbol $kw9$GAF;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLObject $const12$TheNCArgIsas;
    private static final SubLString $str13$Couldn_t_construct_inference_rule;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$_HEAD_WORD;
    private static final SubLObject $const17$Noun;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$_HEAD_DENOT;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$_HEAD_POS;
    private static final SubLObject $const22$speechPartPreds;
    private static final SubLList $list23;
    private static final SubLObject $const24$parsedNounCompound;
    private static final SubLSymbol $sym25$_MOD_STRING;
    private static final SubLSymbol $sym26$_HEAD_STRING;
    private static final SubLObject $const27$NounCompoundParseFn;
    private static final SubLString $str28$Pragma_var__S_not_in_____S;
    private static final SubLSymbol $sym29$EL_VAR_;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$PATTERN_MATCHES_FORMULA;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$_MOD_DENOT;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLString $str40$No_semantic_literals_for__S;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$TERM;
    private static final SubLObject $const43$TheNCHead;
    private static final SubLObject $const44$TheNCModifier;
    private static final SubLSymbol $kw45$TERM;
    private static final SubLString $str46$Incompatible_constraint_mts_for__;
    private static final SubLObject $const47$ncRuleConstraint;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$VALUE;
    private static final SubLSymbol $sym51$FN;
    private static final SubLObject $const52$NCPOSConstraintFn;
    private static final SubLObject $const53$NCPOSPredConstraintFn;
    private static final SubLObject $const54$NCWordUnitConstraintFn;
    private static final SubLSymbol $kw55$MODIFIER;
    private static final SubLSymbol $kw56$HEAD;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$WORD;
    private static final SubLSymbol $sym60$PRED;
    private static final SubLSymbol $kw61$STRING;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$POS;
    private static final SubLObject $const64$wordForms;
    private static final SubLSymbol $kw65$PRED;
    private static final SubLSymbol $sym66$_SPEC_POS;
    private static final SubLObject $const67$genls;
    private static final SubLList $list68;
    private static final SubLObject $const69$wordStrings;
    private static final SubLList $list70;
    private static final SubLObject $const71$termPhrases;
    private static final SubLSymbol $kw72$DENOT;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLObject $const77$termStrings;
    private static final SubLSymbol $kw78$POS;
    private static final SubLList $list79;
    private static final SubLSymbol $kw80$WORD;
    private static final SubLString $str81$Can_t_get_literals_from__S;
    private static final SubLString $str82$_S_already_has_value__D___S;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$CONSTRAINT;
    private static final SubLString $str85$_S_is_not_compatible_with__S;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$WORD_UNIT;
    private static final SubLString $str88$_S_has_both__S_and__S;
    private static final SubLList $list89;
    private static final SubLString $str90$Disconnected_var_____S_in__S;
    private static final SubLSymbol $sym91$EL_IMPLICATION_P;
    private static final SubLObject $const92$EnglishMt;
    private static final SubLObject $const93$parseFodder;
    private static final SubLSymbol $sym94$FILE_EXISTS_;
    private static final SubLString $str95$Gathering_bigram_fodder___;
    private static final SubLSymbol $kw96$INPUT;
    private static final SubLString $str97$Unable_to_open__S;
    private static final SubLList $list98;
    private static final SubLObject $const99$nonPlural_Generic;
    private static final SubLString $str100$_;
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 855L)
    public static SubLObject assert_inference_rule_for_ncr(final SubLObject ncr_fort, SubLObject cyclist) {
        if (cyclist == noun_compound_caching.UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject inference_rule = construct_inference_rule_for_ncr(ncr_fort);
        final SubLObject pragmatic_requirements = thread.secondMultipleValue();
        final SubLObject mt = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (noun_compound_caching.NIL != inference_rule && noun_compound_caching.NIL != mt) {
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind((SubLObject)noun_compound_caching.NIL, thread);
                operation_communication.set_the_cyclist(cyclist);
                ke.ke_assert(inference_rule, mt, (SubLObject)noun_compound_caching.$kw0$DEFAULT, (SubLObject)noun_compound_caching.$kw1$BACKWARD);
                ke.ke_assert((SubLObject)ConsesLow.list(noun_compound_caching.$const2$inferenceRuleForNounCompoundRule, ncr_fort, inference_rule), mt, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                SubLObject cdolist_list_var = pragmatic_requirements;
                SubLObject pragmatic_requirement = (SubLObject)noun_compound_caching.NIL;
                pragmatic_requirement = cdolist_list_var.first();
                while (noun_compound_caching.NIL != cdolist_list_var) {
                    ke.ke_assert((SubLObject)ConsesLow.list(noun_compound_caching.$const3$pragmaticRequirement, pragmatic_requirement, inference_rule), mt, (SubLObject)noun_compound_caching.$kw0$DEFAULT, (SubLObject)noun_compound_caching.$kw1$BACKWARD);
                    cdolist_list_var = cdolist_list_var.rest();
                    pragmatic_requirement = cdolist_list_var.first();
                }
                ke.ke_assert(inference_rule, mt, (SubLObject)noun_compound_caching.$kw0$DEFAULT, (SubLObject)noun_compound_caching.$kw4$FORWARD);
            }
            finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        return ncr_fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 1676L)
    public static SubLObject precache_noun_compound(final SubLObject modifier_string, final SubLObject head_string, SubLObject ncr_fort) {
        if (ncr_fort == noun_compound_caching.UNPROVIDED) {
            ncr_fort = (SubLObject)noun_compound_caching.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (noun_compound_caching.NIL != ncr_fort) {
            ke.ke_assert((SubLObject)ConsesLow.list(noun_compound_caching.$const5$forwardParseNounCompound, modifier_string, head_string), noun_compound_caching.$const6$GeneralEnglishMt, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)noun_compound_caching.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(noun_compound_caching.$const8$EverythingPSC, thread);
                SubLObject rule = (SubLObject)noun_compound_caching.NIL;
                final SubLObject pred_var = noun_compound_caching.$const2$inferenceRuleForNounCompoundRule;
                if (noun_compound_caching.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(ncr_fort, (SubLObject)noun_compound_caching.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(ncr_fort, (SubLObject)noun_compound_caching.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)noun_compound_caching.NIL;
                    final SubLObject token_var = (SubLObject)noun_compound_caching.NIL;
                    while (noun_compound_caching.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (noun_compound_caching.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)noun_compound_caching.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_caching.$kw9$GAF, (SubLObject)noun_compound_caching.NIL, (SubLObject)noun_compound_caching.NIL);
                                SubLObject done_var_$1 = (SubLObject)noun_compound_caching.NIL;
                                final SubLObject token_var_$2 = (SubLObject)noun_compound_caching.NIL;
                                while (noun_compound_caching.NIL == done_var_$1) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                    if (noun_compound_caching.NIL != valid_$3) {
                                        rule = assertions_high.gaf_arg(assertion, (SubLObject)noun_compound_caching.TWO_INTEGER);
                                        ke.ke_repropagate_assertion(rule);
                                    }
                                    done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_caching.NIL == valid_$3);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_caching.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (noun_compound_caching.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_caching.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return ncr_fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 3029L)
    public static SubLObject construct_inference_rule_for_ncr(final SubLObject ncr_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference_rule = (SubLObject)noun_compound_caching.NIL;
        SubLObject pragmatic_requirements = (SubLObject)noun_compound_caching.NIL;
        SubLObject assert_mt = (SubLObject)noun_compound_caching.NIL;
        final SubLObject _prev_bind_0 = noun_compound_caching.$current_nc_rule$.currentBinding(thread);
        try {
            noun_compound_caching.$current_nc_rule$.bind(ncr_fort, thread);
            thread.resetMultipleValues();
            final SubLObject antecedent_literals = accumulate_nc_rule_antecedent_literals(ncr_fort);
            final SubLObject mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (noun_compound_caching.NIL != mt) {
                assert_mt = mt;
                final SubLObject head_pos = find_head_pos_for_ncr(ncr_fort, antecedent_literals);
                final SubLObject denot = find_denot_for_ncr(ncr_fort, mt);
                if (noun_compound_caching.NIL != denot && noun_compound_caching.NIL == cycl_utilities.expression_find(noun_compound_caching.$const12$TheNCArgIsas, denot, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED)) {
                    final SubLObject head_word = find_head_word_for_ncr(ncr_fort, antecedent_literals);
                    thread.resetMultipleValues();
                    final SubLObject inference_rule_$5 = construct_inference_rule_for_ncr_internal(antecedent_literals, head_word, head_pos, denot, ncr_fort);
                    final SubLObject pragmatic_requirements_$6 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    inference_rule = inference_rule_$5;
                    pragmatic_requirements = pragmatic_requirements_$6;
                    if (noun_compound_caching.NIL == inference_rule) {
                        Errors.sublisp_break((SubLObject)noun_compound_caching.$str13$Couldn_t_construct_inference_rule, new SubLObject[] { ncr_fort });
                    }
                }
            }
        }
        finally {
            noun_compound_caching.$current_nc_rule$.rebind(_prev_bind_0, thread);
        }
        return Values.values(inference_rule, pragmatic_requirements, assert_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 3951L)
    public static SubLObject construct_inference_rule_for_ncr_internal(SubLObject antecedent_literals, SubLObject head_word, SubLObject head_pos, final SubLObject denot, final SubLObject ncr) {
        SubLObject inference_rule = (SubLObject)noun_compound_caching.NIL;
        SubLObject pragmatic_requirements = (SubLObject)noun_compound_caching.$list14;
        if (noun_compound_caching.NIL != antecedent_literals && noun_compound_caching.NIL != denot) {
            if (noun_compound_caching.NIL == head_word) {
                final SubLObject item_var = (SubLObject)noun_compound_caching.$list15;
                if (noun_compound_caching.NIL == conses_high.member(item_var, antecedent_literals, Symbols.symbol_function((SubLObject)noun_compound_caching.EQL), Symbols.symbol_function((SubLObject)noun_compound_caching.IDENTITY))) {
                    antecedent_literals = (SubLObject)ConsesLow.cons(item_var, antecedent_literals);
                }
                head_word = (SubLObject)noun_compound_caching.$sym16$_HEAD_WORD;
            }
            if (head_pos.eql(noun_compound_caching.$const17$Noun) || noun_compound_caching.NIL == head_pos) {
                SubLObject cdolist_list_var = (SubLObject)noun_compound_caching.$list18;
                SubLObject new_literal = (SubLObject)noun_compound_caching.NIL;
                new_literal = cdolist_list_var.first();
                while (noun_compound_caching.NIL != cdolist_list_var) {
                    final SubLObject item_var2 = new_literal;
                    if (noun_compound_caching.NIL == conses_high.member(item_var2, antecedent_literals, Symbols.symbol_function((SubLObject)noun_compound_caching.EQUAL), Symbols.symbol_function((SubLObject)noun_compound_caching.IDENTITY))) {
                        antecedent_literals = (SubLObject)ConsesLow.cons(item_var2, antecedent_literals);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    new_literal = cdolist_list_var.first();
                }
                if (noun_compound_caching.NIL != cycl_utilities.expression_find((SubLObject)noun_compound_caching.$sym19$_HEAD_DENOT, denot, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED)) {
                    final SubLObject item_var = (SubLObject)noun_compound_caching.$list20;
                    if (noun_compound_caching.NIL == conses_high.member(item_var, antecedent_literals, Symbols.symbol_function((SubLObject)noun_compound_caching.EQL), Symbols.symbol_function((SubLObject)noun_compound_caching.IDENTITY))) {
                        antecedent_literals = (SubLObject)ConsesLow.cons(item_var, antecedent_literals);
                    }
                }
                head_pos = (SubLObject)noun_compound_caching.$sym21$_HEAD_POS;
            }
            else {
                final SubLObject item_var = (SubLObject)ConsesLow.listS(noun_compound_caching.$const22$speechPartPreds, head_pos, (SubLObject)noun_compound_caching.$list23);
                if (noun_compound_caching.NIL == conses_high.member(item_var, antecedent_literals, Symbols.symbol_function((SubLObject)noun_compound_caching.EQUAL), Symbols.symbol_function((SubLObject)noun_compound_caching.IDENTITY))) {
                    antecedent_literals = (SubLObject)ConsesLow.cons(item_var, antecedent_literals);
                }
                pragmatic_requirements = conses_high.subst(head_pos, (SubLObject)noun_compound_caching.$sym21$_HEAD_POS, conses_high.copy_tree(pragmatic_requirements), (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
            }
            final SubLObject consequent = (SubLObject)ConsesLow.list(noun_compound_caching.$const24$parsedNounCompound, ncr, (SubLObject)noun_compound_caching.$sym25$_MOD_STRING, (SubLObject)noun_compound_caching.$sym26$_HEAD_STRING, (SubLObject)ConsesLow.list(noun_compound_caching.$const27$NounCompoundParseFn, head_word, head_pos, denot));
            antecedent_literals = add_term_strings_literals(antecedent_literals, consequent);
            SubLObject cdolist_list_var2 = pragmatic_requirements;
            SubLObject pragma = (SubLObject)noun_compound_caching.NIL;
            pragma = cdolist_list_var2.first();
            while (noun_compound_caching.NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$7 = cycl_utilities.expression_gather(pragma, (SubLObject)noun_compound_caching.$sym29$EL_VAR_, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                SubLObject var = (SubLObject)noun_compound_caching.NIL;
                var = cdolist_list_var_$7.first();
                while (noun_compound_caching.NIL != cdolist_list_var_$7) {
                    if (noun_compound_caching.NIL == list_utilities.tree_find(var, antecedent_literals, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED)) {
                        Errors.sublisp_break((SubLObject)noun_compound_caching.$str28$Pragma_var__S_not_in_____S, new SubLObject[] { var, antecedent_literals });
                    }
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    var = cdolist_list_var_$7.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                pragma = cdolist_list_var2.first();
            }
            if (noun_compound_caching.NIL != no_disconnected_ncr_varsP(antecedent_literals, consequent)) {
                inference_rule = el_utilities.make_implication(el_utilities.make_conjunction(antecedent_literals), consequent);
            }
        }
        return Values.values(inference_rule, pragmatic_requirements);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 5721L)
    public static SubLObject add_term_strings_literals(SubLObject antecedent_literals, final SubLObject consequent) {
        if (noun_compound_caching.NIL == conses_high.member((SubLObject)noun_compound_caching.$list30, antecedent_literals, (SubLObject)noun_compound_caching.$sym31$PATTERN_MATCHES_FORMULA, (SubLObject)noun_compound_caching.UNPROVIDED) && noun_compound_caching.NIL == conses_high.member((SubLObject)noun_compound_caching.$list32, antecedent_literals, (SubLObject)noun_compound_caching.$sym31$PATTERN_MATCHES_FORMULA, (SubLObject)noun_compound_caching.UNPROVIDED) && (noun_compound_caching.NIL == conses_high.member((SubLObject)noun_compound_caching.$list33, antecedent_literals, (SubLObject)noun_compound_caching.$sym31$PATTERN_MATCHES_FORMULA, (SubLObject)noun_compound_caching.UNPROVIDED) || noun_compound_caching.NIL != cycl_utilities.expression_find((SubLObject)noun_compound_caching.$sym34$_MOD_DENOT, consequent, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED))) {
            final SubLObject item_var = (SubLObject)noun_compound_caching.$list35;
            if (noun_compound_caching.NIL == conses_high.member(item_var, antecedent_literals, Symbols.symbol_function((SubLObject)noun_compound_caching.EQUAL), Symbols.symbol_function((SubLObject)noun_compound_caching.IDENTITY))) {
                antecedent_literals = (SubLObject)ConsesLow.cons(item_var, antecedent_literals);
            }
        }
        if (noun_compound_caching.NIL == conses_high.member((SubLObject)noun_compound_caching.$list36, antecedent_literals, (SubLObject)noun_compound_caching.$sym31$PATTERN_MATCHES_FORMULA, (SubLObject)noun_compound_caching.UNPROVIDED) && noun_compound_caching.NIL == conses_high.member((SubLObject)noun_compound_caching.$list37, antecedent_literals, (SubLObject)noun_compound_caching.$sym31$PATTERN_MATCHES_FORMULA, (SubLObject)noun_compound_caching.UNPROVIDED) && (noun_compound_caching.NIL == conses_high.member((SubLObject)noun_compound_caching.$list38, antecedent_literals, (SubLObject)noun_compound_caching.$sym31$PATTERN_MATCHES_FORMULA, (SubLObject)noun_compound_caching.UNPROVIDED) || noun_compound_caching.NIL != cycl_utilities.expression_find((SubLObject)noun_compound_caching.$sym19$_HEAD_DENOT, consequent, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED))) {
            final SubLObject item_var = (SubLObject)noun_compound_caching.$list39;
            if (noun_compound_caching.NIL == conses_high.member(item_var, antecedent_literals, Symbols.symbol_function((SubLObject)noun_compound_caching.EQUAL), Symbols.symbol_function((SubLObject)noun_compound_caching.IDENTITY))) {
                antecedent_literals = (SubLObject)ConsesLow.cons(item_var, antecedent_literals);
            }
        }
        return antecedent_literals;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 6829L)
    public static SubLObject current_nc_ruleP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.equal(v_object, noun_compound_caching.$current_nc_rule$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 6914L)
    public static SubLObject accumulate_nc_rule_antecedent_literals(final SubLObject ncr_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject semantic_literals = accumulate_nc_rule_semantic_antecedent_literals(ncr_fort);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject literals = (SubLObject)noun_compound_caching.NIL;
        SubLObject final_mt = (SubLObject)noun_compound_caching.NIL;
        if (noun_compound_caching.NIL == semantic_literals) {
            Errors.warn((SubLObject)noun_compound_caching.$str40$No_semantic_literals_for__S, ncr_fort);
        }
        if (noun_compound_caching.NIL != semantic_literals) {
            thread.resetMultipleValues();
            final SubLObject syntactic_literals = accumulate_nc_rule_syntactic_antecedent_literals(ncr_fort, mt);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (noun_compound_caching.NIL != new_mt) {
                literals = ConsesLow.append(syntactic_literals, semantic_literals);
                final_mt = new_mt;
            }
        }
        return Values.values(literals, final_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 7510L)
    public static SubLObject accumulate_nc_rule_semantic_antecedent_literals(final SubLObject ncr_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject literals = (SubLObject)noun_compound_caching.NIL;
        SubLObject mt = (SubLObject)noun_compound_caching.NIL;
        SubLObject abortP = (SubLObject)noun_compound_caching.NIL;
        final SubLObject _prev_bind_0 = noun_compound_caching.$current_nc_rule$.currentBinding(thread);
        try {
            noun_compound_caching.$current_nc_rule$.bind(ncr_fort, thread);
            if (noun_compound_caching.NIL == abortP) {
                SubLObject csome_list_var = noun_compound_caching.$nc_rule_semantic_constraint_preds$.getGlobalValue();
                SubLObject pred = (SubLObject)noun_compound_caching.NIL;
                pred = csome_list_var.first();
                while (noun_compound_caching.NIL == abortP && noun_compound_caching.NIL != csome_list_var) {
                    final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)noun_compound_caching.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(noun_compound_caching.$const8$EverythingPSC, thread);
                        final SubLObject pred_var = pred;
                        if (noun_compound_caching.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(ncr_fort, (SubLObject)noun_compound_caching.NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(ncr_fort, (SubLObject)noun_compound_caching.NIL, pred_var);
                            SubLObject done_var = abortP;
                            final SubLObject token_var = (SubLObject)noun_compound_caching.NIL;
                            while (noun_compound_caching.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (noun_compound_caching.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)noun_compound_caching.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_caching.$kw9$GAF, (SubLObject)noun_compound_caching.NIL, (SubLObject)noun_compound_caching.NIL);
                                        SubLObject done_var_$9 = abortP;
                                        final SubLObject token_var_$10 = (SubLObject)noun_compound_caching.NIL;
                                        while (noun_compound_caching.NIL == done_var_$9) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                            final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(gaf));
                                            if (noun_compound_caching.NIL != valid_$11) {
                                                SubLObject cdolist_list_var = noun_compound_caching.$nc_rule_semantic_mappings$.getGlobalValue();
                                                SubLObject pair = (SubLObject)noun_compound_caching.NIL;
                                                pair = cdolist_list_var.first();
                                                while (noun_compound_caching.NIL != cdolist_list_var) {
                                                    SubLObject current;
                                                    final SubLObject datum = current = pair;
                                                    SubLObject pattern = (SubLObject)noun_compound_caching.NIL;
                                                    SubLObject transform = (SubLObject)noun_compound_caching.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_caching.$list41);
                                                    pattern = current.first();
                                                    current = current.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_caching.$list41);
                                                    transform = current.first();
                                                    current = current.rest();
                                                    if (noun_compound_caching.NIL == current) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject success = formula_pattern_match.formula_matches_pattern(assertions_high.gaf_hl_formula(gaf), pattern);
                                                        final SubLObject v_bindings = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (noun_compound_caching.NIL != success) {
                                                            SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym42$TERM, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt_$12 = check_ncr_constraint_mt(ncr_fort, gaf, mt);
                                                            final SubLObject abortP_$13 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            mt = mt_$12;
                                                            abortP = abortP_$13;
                                                            if (noun_compound_caching.NIL == abortP) {
                                                                final SubLObject pcase_var = v_term;
                                                                if (pcase_var.eql(noun_compound_caching.$const43$TheNCHead)) {
                                                                    v_term = (SubLObject)noun_compound_caching.$sym19$_HEAD_DENOT;
                                                                }
                                                                else if (pcase_var.eql(noun_compound_caching.$const44$TheNCModifier)) {
                                                                    v_term = (SubLObject)noun_compound_caching.$sym34$_MOD_DENOT;
                                                                }
                                                                literals = (SubLObject)ConsesLow.cons(conses_high.subst(v_term, (SubLObject)noun_compound_caching.$kw45$TERM, el_utilities.copy_expression(transform), (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED), literals);
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_caching.$list41);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    pair = cdolist_list_var.first();
                                                }
                                            }
                                            done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_caching.NIL == valid_$11 || noun_compound_caching.NIL != abortP);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_caching.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (noun_compound_caching.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_caching.NIL == valid || noun_compound_caching.NIL != abortP);
                            }
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$8, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    pred = csome_list_var.first();
                }
            }
        }
        finally {
            noun_compound_caching.$current_nc_rule$.rebind(_prev_bind_0, thread);
        }
        return (noun_compound_caching.NIL != abortP) ? Values.values((SubLObject)noun_compound_caching.NIL, (SubLObject)noun_compound_caching.NIL) : Values.values(literals, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 8367L)
    public static SubLObject check_ncr_constraint_mt(final SubLObject ncr_fort, final SubLObject gaf, final SubLObject mt) {
        SubLObject new_mt = mt;
        SubLObject abortP = (SubLObject)noun_compound_caching.NIL;
        if (noun_compound_caching.NIL == new_mt) {
            new_mt = assertions_high.assertion_mt(gaf);
        }
        else if (noun_compound_caching.NIL != genl_mts.genl_mtP(assertions_high.assertion_mt(gaf), new_mt, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED)) {
            new_mt = assertions_high.assertion_mt(gaf);
        }
        else if (noun_compound_caching.NIL == genl_mts.genl_mtP(new_mt, assertions_high.assertion_mt(gaf), (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED)) {
            Errors.warn((SubLObject)noun_compound_caching.$str46$Incompatible_constraint_mts_for__, ncr_fort, assertions_high.assertion_mt(gaf), new_mt);
            abortP = (SubLObject)noun_compound_caching.T;
        }
        return Values.values(new_mt, abortP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 8850L)
    public static SubLObject accumulate_nc_rule_syntactic_antecedent_literals(final SubLObject ncr_fort, final SubLObject semantic_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject literals = (SubLObject)noun_compound_caching.NIL;
        SubLObject abortP = (SubLObject)noun_compound_caching.NIL;
        SubLObject head_constraint = (SubLObject)noun_compound_caching.NIL;
        SubLObject mod_constraint = (SubLObject)noun_compound_caching.NIL;
        thread.resetMultipleValues();
        final SubLObject head_constraint_$15 = head_syntactic_constraint_for_ncr(ncr_fort, semantic_mt);
        final SubLObject abortP_$16 = thread.secondMultipleValue();
        final SubLObject mt_$17 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        head_constraint = head_constraint_$15;
        abortP = abortP_$16;
        SubLObject mt = mt_$17;
        if (noun_compound_caching.NIL == abortP) {
            thread.resetMultipleValues();
            final SubLObject mod_constraint_$18 = mod_syntactic_constraint_for_ncr(ncr_fort, mt);
            final SubLObject abortP_$17 = thread.secondMultipleValue();
            final SubLObject mt_$18 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            mod_constraint = mod_constraint_$18;
            abortP = abortP_$17;
            mt = mt_$18;
            if (noun_compound_caching.NIL == abortP) {
                literals = ncr_syntactic_antecedent_literals_from_constraints(mod_constraint, head_constraint, mt);
            }
        }
        return (noun_compound_caching.NIL != abortP) ? Values.values((SubLObject)noun_compound_caching.NIL, (SubLObject)noun_compound_caching.NIL) : Values.values(literals, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 9462L)
    public static SubLObject head_syntactic_constraint_for_ncr(final SubLObject ncr_fort, final SubLObject mt) {
        final SubLObject indexical = noun_compound_caching.$const43$TheNCHead;
        return syntactic_constraint_for_ncr(ncr_fort, indexical, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 9626L)
    public static SubLObject mod_syntactic_constraint_for_ncr(final SubLObject ncr_fort, final SubLObject mt) {
        final SubLObject indexical = noun_compound_caching.$const44$TheNCModifier;
        return syntactic_constraint_for_ncr(ncr_fort, indexical, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 9793L)
    public static SubLObject syntactic_constraint_for_ncr(final SubLObject ncr_fort, final SubLObject indexical, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraint = (SubLObject)ConsesLow.make_list((SubLObject)noun_compound_caching.THREE_INTEGER, (SubLObject)noun_compound_caching.NIL);
        SubLObject new_mt = mt;
        SubLObject abortP = (SubLObject)noun_compound_caching.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)noun_compound_caching.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(noun_compound_caching.$const8$EverythingPSC, thread);
            final SubLObject pred_var = noun_compound_caching.$const47$ncRuleConstraint;
            if (noun_compound_caching.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(ncr_fort, (SubLObject)noun_compound_caching.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(ncr_fort, (SubLObject)noun_compound_caching.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)noun_compound_caching.NIL;
                final SubLObject token_var = (SubLObject)noun_compound_caching.NIL;
                while (noun_compound_caching.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (noun_compound_caching.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)noun_compound_caching.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)noun_compound_caching.$kw9$GAF, (SubLObject)noun_compound_caching.NIL, (SubLObject)noun_compound_caching.NIL);
                            SubLObject done_var_$21 = (SubLObject)noun_compound_caching.NIL;
                            final SubLObject token_var_$22 = (SubLObject)noun_compound_caching.NIL;
                            while (noun_compound_caching.NIL == done_var_$21) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$22);
                                final SubLObject valid_$23 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$22.eql(gaf));
                                if (noun_compound_caching.NIL != valid_$23) {
                                    thread.resetMultipleValues();
                                    final SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_utilities.hl_to_el(assertions_high.gaf_arg2(gaf)), (SubLObject)ConsesLow.listS((SubLObject)noun_compound_caching.$list48, indexical, (SubLObject)noun_compound_caching.$list49));
                                    final SubLObject v_bindings = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (noun_compound_caching.NIL != success) {
                                        final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym50$VALUE, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                                        final SubLObject fn = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym51$FN, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                                        thread.resetMultipleValues();
                                        final SubLObject new_mt_$24 = check_ncr_constraint_mt(ncr_fort, gaf, new_mt);
                                        final SubLObject abortP_$25 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        new_mt = new_mt_$24;
                                        abortP = abortP_$25;
                                        if (noun_compound_caching.NIL == abortP) {
                                            final SubLObject pcase_var = fn;
                                            if (pcase_var.eql(noun_compound_caching.$const52$NCPOSConstraintFn)) {
                                                set_ncr_constraint_value(constraint, (SubLObject)noun_compound_caching.ZERO_INTEGER, value);
                                            }
                                            else if (pcase_var.eql(noun_compound_caching.$const53$NCPOSPredConstraintFn)) {
                                                set_ncr_constraint_value(constraint, (SubLObject)noun_compound_caching.ONE_INTEGER, value);
                                            }
                                            else if (pcase_var.eql(noun_compound_caching.$const54$NCWordUnitConstraintFn)) {
                                                set_ncr_constraint_value(constraint, (SubLObject)noun_compound_caching.TWO_INTEGER, value);
                                            }
                                        }
                                    }
                                }
                                done_var_$21 = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_caching.NIL == valid_$23);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_caching.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (noun_compound_caching.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_caching.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Values.values(constraint, abortP, new_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 10697L)
    public static SubLObject ncr_syntactic_antecedent_literals_from_constraints(final SubLObject mod_constraint, final SubLObject head_constraint, final SubLObject mt) {
        return ConsesLow.append(ncr_syntactic_antecedent_literals_from_constraint(mod_constraint, (SubLObject)noun_compound_caching.$kw55$MODIFIER, mt), ncr_syntactic_antecedent_literals_from_constraint(head_constraint, (SubLObject)noun_compound_caching.$kw56$HEAD, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 11326L)
    public static SubLObject get_ncr_var(final SubLObject indexical, final SubLObject type) {
        return list_utilities.alist_lookup_without_values(list_utilities.alist_lookup_without_values(noun_compound_caching.$ncr_inference_rule_var_table$.getGlobalValue(), indexical, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED), type, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 11488L)
    public static SubLObject ncr_syntactic_antecedent_literals_from_constraint(final SubLObject constraint, final SubLObject type, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject literals = (SubLObject)noun_compound_caching.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            thread.resetMultipleValues();
            SubLObject success = pattern_match.tree_matches_pattern(constraint, (SubLObject)noun_compound_caching.$list58);
            SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (noun_compound_caching.NIL != success) {
                final SubLObject word = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym59$WORD, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                final SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym60$PRED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                literals = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred, word, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw61$STRING)));
            }
            thread.resetMultipleValues();
            success = pattern_match.tree_matches_pattern(constraint, (SubLObject)noun_compound_caching.$list62);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (noun_compound_caching.NIL != success) {
                final SubLObject word = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym59$WORD, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                final SubLObject pos = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym63$POS, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                literals = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(noun_compound_caching.$const64$wordForms, word, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw65$PRED), get_ncr_var(type, (SubLObject)noun_compound_caching.$kw61$STRING)), (SubLObject)ConsesLow.list(noun_compound_caching.$const22$speechPartPreds, (SubLObject)noun_compound_caching.$sym66$_SPEC_POS, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw65$PRED)), (SubLObject)ConsesLow.list(noun_compound_caching.$const67$genls, (SubLObject)noun_compound_caching.$sym66$_SPEC_POS, pos));
            }
            thread.resetMultipleValues();
            success = pattern_match.tree_matches_pattern(constraint, (SubLObject)noun_compound_caching.$list68);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (noun_compound_caching.NIL != success) {
                final SubLObject word = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym59$WORD, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                literals = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(noun_compound_caching.$const69$wordStrings, word, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw61$STRING)));
            }
            thread.resetMultipleValues();
            success = pattern_match.tree_matches_pattern(constraint, (SubLObject)noun_compound_caching.$list70);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (noun_compound_caching.NIL != success) {
                final SubLObject pred2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym60$PRED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                literals = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(noun_compound_caching.$const71$termPhrases, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw72$DENOT), pred2, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw61$STRING)));
            }
            thread.resetMultipleValues();
            success = pattern_match.tree_matches_pattern(constraint, (SubLObject)noun_compound_caching.$list73);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (noun_compound_caching.NIL != success) {
                final SubLObject pred2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym60$PRED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                final SubLObject pos = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym63$POS, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                literals = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(noun_compound_caching.$const71$termPhrases, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw72$DENOT), pred2, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw61$STRING)), (SubLObject)ConsesLow.list(noun_compound_caching.$const71$termPhrases, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw72$DENOT), pos, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw61$STRING)));
            }
            thread.resetMultipleValues();
            success = pattern_match.tree_matches_pattern(constraint, (SubLObject)noun_compound_caching.$list74);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (noun_compound_caching.NIL != success) {
                final SubLObject pred2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym60$PRED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                literals = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred2, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw72$DENOT), get_ncr_var(type, (SubLObject)noun_compound_caching.$kw61$STRING)));
            }
            thread.resetMultipleValues();
            success = pattern_match.tree_matches_pattern(constraint, (SubLObject)noun_compound_caching.$list75);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (noun_compound_caching.NIL != success) {
                final SubLObject pos2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym63$POS, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                literals = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(noun_compound_caching.$const71$termPhrases, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw72$DENOT), pos2, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw61$STRING)));
            }
            if (constraint.equal((SubLObject)noun_compound_caching.$list76)) {
                literals = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(noun_compound_caching.$const77$termStrings, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw72$DENOT), get_ncr_var(type, (SubLObject)noun_compound_caching.$kw61$STRING)));
                if (noun_compound_caching.$kw56$HEAD == type) {
                    literals = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(noun_compound_caching.$const67$genls, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw78$POS), (SubLObject)noun_compound_caching.$list79), literals);
                    literals = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(noun_compound_caching.$const64$wordForms, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw80$WORD), get_ncr_var(type, (SubLObject)noun_compound_caching.$kw65$PRED), get_ncr_var(type, (SubLObject)noun_compound_caching.$kw61$STRING)), literals);
                    literals = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(noun_compound_caching.$const22$speechPartPreds, get_ncr_var(type, (SubLObject)noun_compound_caching.$kw78$POS), get_ncr_var(type, (SubLObject)noun_compound_caching.$kw65$PRED)), literals);
                }
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        if (noun_compound_caching.NIL != list_utilities.empty_list_p(literals)) {
            Errors.sublisp_break((SubLObject)noun_compound_caching.$str81$Can_t_get_literals_from__S, new SubLObject[] { constraint });
        }
        return literals;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 14193L)
    public static SubLObject set_ncr_constraint_value(final SubLObject constraint, final SubLObject n, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!ConsesLow.nth(n, constraint).equal(value)) {
            if (noun_compound_caching.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && noun_compound_caching.NIL != ConsesLow.nth(n, constraint)) {
                Errors.error((SubLObject)noun_compound_caching.$str82$_S_already_has_value__D___S, constraint, n, ConsesLow.nth(n, constraint));
            }
            ConsesLow.set_nth(n, constraint, value);
        }
        return constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 14462L)
    public static SubLObject find_head_pos_for_ncr(final SubLObject ncr_fort, final SubLObject antecedent_literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject head_pos = noun_compound_caching.$const17$Noun;
        SubLObject abortP = (SubLObject)noun_compound_caching.NIL;
        if (noun_compound_caching.NIL == abortP) {
            SubLObject csome_list_var = antecedent_literals;
            SubLObject literal = (SubLObject)noun_compound_caching.NIL;
            literal = csome_list_var.first();
            while (noun_compound_caching.NIL == abortP && noun_compound_caching.NIL != csome_list_var) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(literal, (SubLObject)noun_compound_caching.$list83);
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (noun_compound_caching.NIL != success) {
                    final SubLObject constraint = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym84$CONSTRAINT, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                    final SubLObject pos = (SubLObject)((noun_compound_caching.NIL != lexicon_accessors.speech_part_predP(constraint, (SubLObject)noun_compound_caching.UNPROVIDED)) ? lexicon_accessors.pos_of_pred(constraint) : ((noun_compound_caching.NIL != lexicon_accessors.speech_partP(constraint, (SubLObject)noun_compound_caching.UNPROVIDED)) ? constraint : noun_compound_caching.NIL));
                    if (noun_compound_caching.NIL != lexicon_accessors.genl_posP(pos, head_pos, (SubLObject)noun_compound_caching.UNPROVIDED)) {
                        head_pos = pos;
                    }
                    else if (noun_compound_caching.NIL != pos) {
                        if (noun_compound_caching.NIL == lexicon_accessors.genl_posP(head_pos, pos, (SubLObject)noun_compound_caching.UNPROVIDED)) {
                            Errors.sublisp_break((SubLObject)noun_compound_caching.$str85$_S_is_not_compatible_with__S, new SubLObject[] { pos, head_pos });
                            abortP = (SubLObject)noun_compound_caching.T;
                        }
                    }
                }
                csome_list_var = csome_list_var.rest();
                literal = csome_list_var.first();
            }
        }
        return (SubLObject)((noun_compound_caching.NIL != abortP) ? noun_compound_caching.NIL : head_pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 15211L)
    public static SubLObject find_head_word_for_ncr(final SubLObject ncr_fort, final SubLObject antecedent_literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject head_word = (SubLObject)noun_compound_caching.NIL;
        SubLObject abortP = (SubLObject)noun_compound_caching.NIL;
        if (noun_compound_caching.NIL == abortP) {
            SubLObject csome_list_var = antecedent_literals;
            SubLObject literal = (SubLObject)noun_compound_caching.NIL;
            literal = csome_list_var.first();
            while (noun_compound_caching.NIL == abortP && noun_compound_caching.NIL != csome_list_var) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(literal, (SubLObject)noun_compound_caching.$list86);
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (noun_compound_caching.NIL != success) {
                    final SubLObject word_unit = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)noun_compound_caching.$sym87$WORD_UNIT, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                    if (noun_compound_caching.NIL == head_word) {
                        head_word = word_unit;
                    }
                    else if (!head_word.equal(word_unit)) {
                        Errors.warn((SubLObject)noun_compound_caching.$str88$_S_has_both__S_and__S, ncr_fort, head_word, word_unit);
                        abortP = (SubLObject)noun_compound_caching.T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                literal = csome_list_var.first();
            }
        }
        return (SubLObject)((noun_compound_caching.NIL != abortP) ? noun_compound_caching.NIL : head_word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 15798L)
    public static SubLObject no_disconnected_ncr_varsP(final SubLObject antecedent_juncts, final SubLObject consequent) {
        SubLObject okP = (SubLObject)noun_compound_caching.T;
        SubLObject cdolist_list_var = antecedent_juncts;
        SubLObject junct = (SubLObject)noun_compound_caching.NIL;
        junct = cdolist_list_var.first();
        while (noun_compound_caching.NIL != cdolist_list_var) {
            final SubLObject var = ncr_junct_find_disconnected_var(junct, antecedent_juncts, consequent);
            if (noun_compound_caching.NIL != var && noun_compound_caching.NIL == conses_high.member(var, (SubLObject)noun_compound_caching.$list89, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED)) {
                okP = (SubLObject)noun_compound_caching.NIL;
                Errors.sublisp_break((SubLObject)noun_compound_caching.$str90$Disconnected_var_____S_in__S, new SubLObject[] { var, junct });
            }
            cdolist_list_var = cdolist_list_var.rest();
            junct = cdolist_list_var.first();
        }
        if (noun_compound_caching.NIL != okP && noun_compound_caching.NIL != ncr_junct_find_disconnected_var(consequent, antecedent_juncts, (SubLObject)noun_compound_caching.UNPROVIDED)) {
            okP = (SubLObject)noun_compound_caching.NIL;
            Errors.sublisp_break((SubLObject)noun_compound_caching.$str90$Disconnected_var_____S_in__S, new SubLObject[] { ncr_junct_find_disconnected_var(consequent, antecedent_juncts, (SubLObject)noun_compound_caching.UNPROVIDED), consequent });
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 16402L)
    public static SubLObject ncr_junct_find_disconnected_var(final SubLObject junct, final SubLObject antecedent_juncts, SubLObject consequent) {
        if (consequent == noun_compound_caching.UNPROVIDED) {
            consequent = (SubLObject)noun_compound_caching.NIL;
        }
        SubLObject disconnected_var = (SubLObject)noun_compound_caching.NIL;
        final SubLObject other_antecedent_juncts = Sequences.remove(junct, antecedent_juncts, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
        final SubLObject vars = obsolete.formula_free_variables(junct, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
        if (noun_compound_caching.NIL == disconnected_var) {
            SubLObject csome_list_var = vars;
            SubLObject var = (SubLObject)noun_compound_caching.NIL;
            var = csome_list_var.first();
            while (noun_compound_caching.NIL == disconnected_var && noun_compound_caching.NIL != csome_list_var) {
                if (noun_compound_caching.NIL != ncr_disconnected_varP(var, other_antecedent_juncts, consequent)) {
                    disconnected_var = var;
                }
                csome_list_var = csome_list_var.rest();
                var = csome_list_var.first();
            }
        }
        return disconnected_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 16808L)
    public static SubLObject ncr_implication_disconnected_varP(final SubLObject var, final SubLObject implication) {
        assert noun_compound_caching.NIL != el_utilities.el_implication_p(implication) : implication;
        SubLObject ans = (SubLObject)noun_compound_caching.NIL;
        final SubLObject antecedent = cycl_utilities.formula_arg1(implication, (SubLObject)noun_compound_caching.UNPROVIDED);
        final SubLObject antecedent_juncts = cycl_utilities.formula_args(antecedent, (SubLObject)noun_compound_caching.UNPROVIDED);
        final SubLObject consequent = cycl_utilities.formula_arg2(implication, (SubLObject)noun_compound_caching.UNPROVIDED);
        if (noun_compound_caching.NIL == ans) {
            SubLObject csome_list_var = antecedent_juncts;
            SubLObject junct = (SubLObject)noun_compound_caching.NIL;
            junct = csome_list_var.first();
            while (noun_compound_caching.NIL == ans && noun_compound_caching.NIL != csome_list_var) {
                if (noun_compound_caching.NIL != cycl_utilities.expression_find(var, junct, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED) && noun_compound_caching.NIL != ncr_disconnected_varP(var, Sequences.remove(junct, antecedent_juncts, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED), consequent)) {
                    ans = (SubLObject)noun_compound_caching.T;
                }
                csome_list_var = csome_list_var.rest();
                junct = csome_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 17272L)
    public static SubLObject ncr_disconnected_varP(final SubLObject var, final SubLObject other_antecedent_juncts, final SubLObject consequent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(noun_compound_caching.NIL == list_utilities.tree_find(var, other_antecedent_juncts, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED) && (noun_compound_caching.NIL == el_utilities.el_formula_p(consequent) || noun_compound_caching.NIL == cycl_utilities.expression_find(var, consequent, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 17487L)
    public static SubLObject find_denot_for_ncr(final SubLObject ncr_fort, final SubLObject mt) {
        final SubLObject keywordy_template = noun_compound_parser.rbp_rule_cycl_semx(ncr_fort, mt);
        return cycl_utilities.expression_subst((SubLObject)noun_compound_caching.$sym19$_HEAD_DENOT, (SubLObject)noun_compound_caching.$kw56$HEAD, cycl_utilities.expression_subst((SubLObject)noun_compound_caching.$sym34$_MOD_DENOT, (SubLObject)noun_compound_caching.$kw55$MODIFIER, keywordy_template, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED), (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 17723L)
    public static SubLObject precache_noun_compound_parses(final SubLObject string, SubLObject mt) {
        if (mt == noun_compound_caching.UNPROVIDED) {
            mt = noun_compound_caching.$const92$EnglishMt;
        }
        return ke.ke_assert((SubLObject)ConsesLow.list(noun_compound_caching.$const93$parseFodder, string), mt, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 17894L)
    public static SubLObject find_bigram_fodder(final SubLObject filename, SubLObject mt) {
        if (mt == noun_compound_caching.UNPROVIDED) {
            mt = noun_compound_caching.$const92$EnglishMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert noun_compound_caching.NIL != file_utilities.file_existsP(filename) : filename;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)noun_compound_caching.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)noun_compound_caching.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)noun_compound_caching.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)noun_compound_caching.$str95$Gathering_bigram_fodder___);
                SubLObject stream = (SubLObject)noun_compound_caching.NIL;
                try {
                    final SubLObject _prev_bind_0_$27 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)noun_compound_caching.NIL, thread);
                        stream = compatibility.open_text(filename, (SubLObject)noun_compound_caching.$kw96$INPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$27, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)noun_compound_caching.$str97$Unable_to_open__S, filename);
                    }
                    final SubLObject stream_var = stream;
                    if (stream_var.isStream()) {
                        final SubLObject length_var = streams_high.file_length(stream_var);
                        final SubLObject stream_var_$28 = stream_var;
                        SubLObject line_number_var = (SubLObject)noun_compound_caching.NIL;
                        SubLObject line = (SubLObject)noun_compound_caching.NIL;
                        line_number_var = (SubLObject)noun_compound_caching.ZERO_INTEGER;
                        for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$28); noun_compound_caching.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$28)) {
                            final SubLObject strings = string_utilities.string_tokenize(line, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED);
                            if (noun_compound_caching.NIL != list_utilities.lengthGE(strings, (SubLObject)noun_compound_caching.TWO_INTEGER, (SubLObject)noun_compound_caching.UNPROVIDED)) {
                                SubLObject current;
                                final SubLObject datum = current = list_utilities.first_n((SubLObject)noun_compound_caching.TWO_INTEGER, strings);
                                SubLObject mod_string = (SubLObject)noun_compound_caching.NIL;
                                SubLObject head_string = (SubLObject)noun_compound_caching.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_caching.$list98);
                                mod_string = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)noun_compound_caching.$list98);
                                head_string = current.first();
                                current = current.rest();
                                if (noun_compound_caching.NIL == current) {
                                    if (noun_compound_caching.NIL != lexicon_accessors.string_is_posP(head_string, noun_compound_caching.$const17$Noun, (SubLObject)noun_compound_caching.NIL, mt, (SubLObject)noun_compound_caching.UNPROVIDED) && (noun_compound_caching.NIL != list_utilities.non_empty_list_p(lexicon_accessors.denots_of_stringXpred(mod_string, noun_compound_caching.$const99$nonPlural_Generic, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED)) || noun_compound_caching.NIL != list_utilities.non_empty_list_p(lexicon_accessors.denots_of_name_string(mod_string, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED, (SubLObject)noun_compound_caching.UNPROVIDED)))) {
                                        precache_noun_compound_parses(Sequences.cconcatenate(mod_string, new SubLObject[] { noun_compound_caching.$str100$_, head_string }), (SubLObject)noun_compound_caching.UNPROVIDED);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)noun_compound_caching.$list98);
                                }
                            }
                            utilities_macros.note_percent_progress(streams_high.file_position(stream_var, (SubLObject)noun_compound_caching.UNPROVIDED), length_var);
                            line_number_var = number_utilities.f_1X(line_number_var);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_caching.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)noun_compound_caching.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)noun_compound_caching.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)noun_compound_caching.NIL;
    }
    
    public static SubLObject declare_noun_compound_caching_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "assert_inference_rule_for_ncr", "ASSERT-INFERENCE-RULE-FOR-NCR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "precache_noun_compound", "PRECACHE-NOUN-COMPOUND", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "construct_inference_rule_for_ncr", "CONSTRUCT-INFERENCE-RULE-FOR-NCR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "construct_inference_rule_for_ncr_internal", "CONSTRUCT-INFERENCE-RULE-FOR-NCR-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "add_term_strings_literals", "ADD-TERM-STRINGS-LITERALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "current_nc_ruleP", "CURRENT-NC-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "accumulate_nc_rule_antecedent_literals", "ACCUMULATE-NC-RULE-ANTECEDENT-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "accumulate_nc_rule_semantic_antecedent_literals", "ACCUMULATE-NC-RULE-SEMANTIC-ANTECEDENT-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "check_ncr_constraint_mt", "CHECK-NCR-CONSTRAINT-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "accumulate_nc_rule_syntactic_antecedent_literals", "ACCUMULATE-NC-RULE-SYNTACTIC-ANTECEDENT-LITERALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "head_syntactic_constraint_for_ncr", "HEAD-SYNTACTIC-CONSTRAINT-FOR-NCR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "mod_syntactic_constraint_for_ncr", "MOD-SYNTACTIC-CONSTRAINT-FOR-NCR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "syntactic_constraint_for_ncr", "SYNTACTIC-CONSTRAINT-FOR-NCR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "ncr_syntactic_antecedent_literals_from_constraints", "NCR-SYNTACTIC-ANTECEDENT-LITERALS-FROM-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "get_ncr_var", "GET-NCR-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "ncr_syntactic_antecedent_literals_from_constraint", "NCR-SYNTACTIC-ANTECEDENT-LITERALS-FROM-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "set_ncr_constraint_value", "SET-NCR-CONSTRAINT-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "find_head_pos_for_ncr", "FIND-HEAD-POS-FOR-NCR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "find_head_word_for_ncr", "FIND-HEAD-WORD-FOR-NCR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "no_disconnected_ncr_varsP", "NO-DISCONNECTED-NCR-VARS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "ncr_junct_find_disconnected_var", "NCR-JUNCT-FIND-DISCONNECTED-VAR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "ncr_implication_disconnected_varP", "NCR-IMPLICATION-DISCONNECTED-VAR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "ncr_disconnected_varP", "NCR-DISCONNECTED-VAR?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "find_denot_for_ncr", "FIND-DENOT-FOR-NCR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "precache_noun_compound_parses", "PRECACHE-NOUN-COMPOUND-PARSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.noun_compound_caching", "find_bigram_fodder", "FIND-BIGRAM-FODDER", 1, 1, false);
        return (SubLObject)noun_compound_caching.NIL;
    }
    
    public static SubLObject init_noun_compound_caching_file() {
        noun_compound_caching.$nc_rule_semantic_mappings$ = SubLFiles.deflexical("*NC-RULE-SEMANTIC-MAPPINGS*", (SubLObject)noun_compound_caching.$list10);
        noun_compound_caching.$nc_rule_semantic_constraint_preds$ = SubLFiles.deflexical("*NC-RULE-SEMANTIC-CONSTRAINT-PREDS*", (SubLObject)noun_compound_caching.$list11);
        noun_compound_caching.$current_nc_rule$ = SubLFiles.defparameter("*CURRENT-NC-RULE*", misc_utilities.uninitialized());
        noun_compound_caching.$ncr_inference_rule_var_table$ = SubLFiles.deflexical("*NCR-INFERENCE-RULE-VAR-TABLE*", (SubLObject)noun_compound_caching.$list57);
        return (SubLObject)noun_compound_caching.NIL;
    }
    
    public static SubLObject setup_noun_compound_caching_file() {
        return (SubLObject)noun_compound_caching.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_noun_compound_caching_file();
    }
    
    @Override
	public void initializeVariables() {
        init_noun_compound_caching_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_noun_compound_caching_file();
    }
    
    static {
        me = (SubLFile)new noun_compound_caching();
        noun_compound_caching.$nc_rule_semantic_mappings$ = null;
        noun_compound_caching.$nc_rule_semantic_constraint_preds$ = null;
        noun_compound_caching.$current_nc_rule$ = null;
        noun_compound_caching.$ncr_inference_rule_var_table$ = null;
        $kw0$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw1$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $const2$inferenceRuleForNounCompoundRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inferenceRuleForNounCompoundRule"));
        $const3$pragmaticRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pragmaticRequirement"));
        $kw4$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $const5$forwardParseNounCompound = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forwardParseNounCompound"));
        $const6$GeneralEnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $sym7$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const8$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw9$GAF = SubLObjectFactory.makeKeyword("GAF");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlsConstraintForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-NC-RULE?")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCModifier")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-DENOT"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlsConstraintForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-NC-RULE?")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCHead")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-DENOT"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isaConstraintForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-NC-RULE?")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCModifier")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-DENOT"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isaConstraintForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-NC-RULE?")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCHead")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-DENOT"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalsConstraintForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-NC-RULE?")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCModifier")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-DENOT"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalsConstraintForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-NC-RULE?")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCHead")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-DENOT"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"))));
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalsConstraintForNCR")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlsConstraintForNCR")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isaConstraintForNCR")));
        $const12$TheNCArgIsas = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCArgIsas"));
        $str13$Couldn_t_construct_inference_rule = SubLObjectFactory.makeString("Couldn't construct inference rule for ~S");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forwardParseNounCompound")), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-STRING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mostSpecificSpeechPartPreds")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-POS"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-PRED"))));
        $list15 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-STRING"));
        $sym16$_HEAD_WORD = SubLObjectFactory.makeSymbol("?HEAD-WORD");
        $const17$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-POS"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-PRED")));
        $sym19$_HEAD_DENOT = SubLObjectFactory.makeSymbol("?HEAD-DENOT");
        $list20 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-POS"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-STRING"));
        $sym21$_HEAD_POS = SubLObjectFactory.makeSymbol("?HEAD-POS");
        $const22$speechPartPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?HEAD-PRED"));
        $const24$parsedNounCompound = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parsedNounCompound"));
        $sym25$_MOD_STRING = SubLObjectFactory.makeSymbol("?MOD-STRING");
        $sym26$_HEAD_STRING = SubLObjectFactory.makeSymbol("?HEAD-STRING");
        $const27$NounCompoundParseFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounCompoundParseFn"));
        $str28$Pragma_var__S_not_in_____S = SubLObjectFactory.makeString("Pragma var ~S not in ~% ~S");
        $sym29$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-STRING"));
        $sym31$PATTERN_MATCHES_FORMULA = SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NAME-STRING-PRED?")), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-STRING"));
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-STRING"));
        $sym34$_MOD_DENOT = SubLObjectFactory.makeSymbol("?MOD-DENOT");
        $list35 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-STRING"));
        $list36 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-DENOT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-STRING"));
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NAME-STRING-PRED?")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-STRING"));
        $list38 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-STRING"));
        $list39 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-STRING"));
        $str40$No_semantic_literals_for__S = SubLObjectFactory.makeString("No semantic literals for ~S");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFORM"));
        $sym42$TERM = SubLObjectFactory.makeSymbol("TERM");
        $const43$TheNCHead = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCHead"));
        $const44$TheNCModifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCModifier"));
        $kw45$TERM = SubLObjectFactory.makeKeyword("TERM");
        $str46$Incompatible_constraint_mts_for__ = SubLObjectFactory.makeString("Incompatible constraint mts for ~S:~% ~S and ~S");
        $const47$ncRuleConstraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ncRuleConstraint"));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCPOSConstraintFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCPOSPredConstraintFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCWordUnitConstraintFn"))));
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")));
        $sym50$VALUE = SubLObjectFactory.makeSymbol("VALUE");
        $sym51$FN = SubLObjectFactory.makeSymbol("FN");
        $const52$NCPOSConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCPOSConstraintFn"));
        $const53$NCPOSPredConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCPOSPredConstraintFn"));
        $const54$NCWordUnitConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCWordUnitConstraintFn"));
        $kw55$MODIFIER = SubLObjectFactory.makeKeyword("MODIFIER");
        $kw56$HEAD = SubLObjectFactory.makeKeyword("HEAD");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HEAD"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-DENOT")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-STRING")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-PRED")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-WORD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-POS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODIFIER"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-DENOT")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-STRING")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-PRED")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-POS"))));
        $list58 = ConsesLow.list((SubLObject)noun_compound_caching.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"))));
        $sym59$WORD = SubLObjectFactory.makeSymbol("WORD");
        $sym60$PRED = SubLObjectFactory.makeSymbol("PRED");
        $kw61$STRING = SubLObjectFactory.makeKeyword("STRING");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART?"))), (SubLObject)noun_compound_caching.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("QUICK-LEXICAL-WORD?"))));
        $sym63$POS = SubLObjectFactory.makeSymbol("POS");
        $const64$wordForms = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms"));
        $kw65$PRED = SubLObjectFactory.makeKeyword("PRED");
        $sym66$_SPEC_POS = SubLObjectFactory.makeSymbol("?SPEC-POS");
        $const67$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list68 = ConsesLow.list((SubLObject)noun_compound_caching.NIL, (SubLObject)noun_compound_caching.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"))));
        $const69$wordStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordStrings"));
        $list70 = ConsesLow.list((SubLObject)noun_compound_caching.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?"))), (SubLObject)noun_compound_caching.NIL);
        $const71$termPhrases = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases"));
        $kw72$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART?"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?"))), (SubLObject)noun_compound_caching.NIL);
        $list74 = ConsesLow.list((SubLObject)noun_compound_caching.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NAME-STRING-PRED?"))), (SubLObject)noun_compound_caching.NIL);
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART?"))), (SubLObject)noun_compound_caching.NIL, (SubLObject)noun_compound_caching.NIL);
        $list76 = ConsesLow.list((SubLObject)noun_compound_caching.NIL, (SubLObject)noun_compound_caching.NIL, (SubLObject)noun_compound_caching.NIL);
        $const77$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $kw78$POS = SubLObjectFactory.makeKeyword("POS");
        $list79 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")));
        $kw80$WORD = SubLObjectFactory.makeKeyword("WORD");
        $str81$Can_t_get_literals_from__S = SubLObjectFactory.makeString("Can't get literals from ~S");
        $str82$_S_already_has_value__D___S = SubLObjectFactory.makeString("~S already has value ~D: ~S");
        $list83 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym84$CONSTRAINT = SubLObjectFactory.makeSymbol("CONSTRAINT");
        $str85$_S_is_not_compatible_with__S = SubLObjectFactory.makeString("~S is not compatible with ~S");
        $list86 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("QUICK-LEXICAL-WORD?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-UNIT"))), (SubLObject)SubLObjectFactory.makeSymbol("?HEAD-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym87$WORD_UNIT = SubLObjectFactory.makeSymbol("WORD-UNIT");
        $str88$_S_has_both__S_and__S = SubLObjectFactory.makeString("~S has both ~S and ~S");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?HEAD-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("?MOD-STRING"));
        $str90$Disconnected_var_____S_in__S = SubLObjectFactory.makeString("Disconnected var:~% ~S in ~S");
        $sym91$EL_IMPLICATION_P = SubLObjectFactory.makeSymbol("EL-IMPLICATION-P");
        $const92$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $const93$parseFodder = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parseFodder"));
        $sym94$FILE_EXISTS_ = SubLObjectFactory.makeSymbol("FILE-EXISTS?");
        $str95$Gathering_bigram_fodder___ = SubLObjectFactory.makeString("Gathering bigram fodder...");
        $kw96$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str97$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-STRING"));
        $const99$nonPlural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $str100$_ = SubLObjectFactory.makeString(" ");
    }
}

/*

	Total time: 427 ms
	
*/