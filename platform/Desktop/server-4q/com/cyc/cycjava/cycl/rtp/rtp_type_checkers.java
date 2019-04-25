package com.cyc.cycjava.cycl.rtp;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.term;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rtp_type_checkers extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_type_checkers";
    public static final String myFingerPrint = "57e0dec36048cb0a66539a0adae0e3e07a227455c224a73cb37750ef3ea62323";
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 854L)
    public static SubLSymbol $allow_vars_in_this_parsing_template$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 1344L)
    private static SubLSymbol $rtp_template_categoryP_caching_state$;
    private static final SubLSymbol $kw0$ANY;
    private static final SubLSymbol $sym1$RTP_TEMPLATE_CATEGORY_;
    private static final SubLObject $const2$ParsingTemplateCategory;
    private static final SubLSymbol $sym3$_RTP_TEMPLATE_CATEGORY__CACHING_STATE_;
    private static final SubLInteger $int4$32;
    private static final SubLObject $const5$NLPattern_Template;
    private static final SubLObject $const6$TokenTemplate;
    private static final SubLObject $const7$NLPattern_Word;
    private static final SubLSymbol $sym8$_;
    private static final SubLObject $const9$OptionalSome;
    private static final SubLObject $const10$OptionalOne;
    private static final SubLSymbol $sym11$_;
    private static final SubLObject $const12$RequireSome;
    private static final SubLObject $const13$RequireOne;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLObject $const16$WordSequence;
    private static final SubLObject $const17$NLPattern_Exact;
    private static final SubLSymbol $kw18$SEQUENCE;
    private static final SubLObject $const19$TermPOSPair;
    private static final SubLObject $const20$NLPattern_Term;
    private static final SubLObject $const21$NLPattern_Term_Optional;
    private static final SubLObject $const22$NLPattern_TermPred;
    private static final SubLObject $const23$NLPatternList;
    private static final SubLString $str24$__Invalid_Syntactic_Template_Item;
    private static final SubLObject $const25$NLParsingSlot;
    private static final SubLSymbol $kw26$IGNORE;
    private static final SubLList $list27;
    private static final SubLObject $const28$SpeechPartPredicate;
    private static final SubLObject $const29$LexicalWord;
    private static final SubLObject $const30$NLWordForm;
    private static final SubLObject $const31$TemplateSententialMarker;
    private static final SubLObject $const32$NLPattern_POS;
    private static final SubLObject $const33$NLPattern_Agr;
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 1344L)
    public static SubLObject clear_rtp_template_categoryP() {
        final SubLObject cs = rtp_type_checkers.$rtp_template_categoryP_caching_state$.getGlobalValue();
        if (rtp_type_checkers.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 1344L)
    public static SubLObject remove_rtp_template_categoryP(final SubLObject item, SubLObject mt) {
        if (mt == rtp_type_checkers.UNPROVIDED) {
            mt = (SubLObject)rtp_type_checkers.$kw0$ANY;
        }
        return memoization_state.caching_state_remove_function_results_with_args(rtp_type_checkers.$rtp_template_categoryP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(item, mt), (SubLObject)rtp_type_checkers.UNPROVIDED, (SubLObject)rtp_type_checkers.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 1344L)
    public static SubLObject rtp_template_categoryP_internal(final SubLObject item, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != forts.fort_p(item) && rtp_type_checkers.NIL != ((mt == rtp_type_checkers.$kw0$ANY) ? genls.genl_in_any_mtP(item, rtp_type_checkers.$const2$ParsingTemplateCategory) : genls.genlP(item, rtp_type_checkers.$const2$ParsingTemplateCategory, mt, (SubLObject)rtp_type_checkers.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 1344L)
    public static SubLObject rtp_template_categoryP(final SubLObject item, SubLObject mt) {
        if (mt == rtp_type_checkers.UNPROVIDED) {
            mt = (SubLObject)rtp_type_checkers.$kw0$ANY;
        }
        SubLObject caching_state = rtp_type_checkers.$rtp_template_categoryP_caching_state$.getGlobalValue();
        if (rtp_type_checkers.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rtp_type_checkers.$sym1$RTP_TEMPLATE_CATEGORY_, (SubLObject)rtp_type_checkers.$sym3$_RTP_TEMPLATE_CATEGORY__CACHING_STATE_, (SubLObject)rtp_type_checkers.NIL, (SubLObject)rtp_type_checkers.EQL, (SubLObject)rtp_type_checkers.TWO_INTEGER, (SubLObject)rtp_type_checkers.$int4$32);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(item, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rtp_type_checkers.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rtp_type_checkers.NIL;
            collision = cdolist_list_var.first();
            while (rtp_type_checkers.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (item.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rtp_type_checkers.NIL != cached_args && rtp_type_checkers.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rtp_template_categoryP_internal(item, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(item, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 1594L)
    public static SubLObject rtp_recursive_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(template_item.isList() && rtp_type_checkers.NIL != rtp_template_categoryP(template_item.first(), (SubLObject)rtp_type_checkers.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 1950L)
    public static SubLObject recursive_item_template_category(final SubLObject template_item) {
        if (rtp_type_checkers.NIL != rtp_recursive_itemP(template_item)) {
            return template_item.first();
        }
        if (template_item.first().eql(rtp_type_checkers.$const5$NLPattern_Template)) {
            return conses_high.second(template_item);
        }
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 2313L)
    public static SubLObject rtp_speech_part_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(template_item.isList() && rtp_type_checkers.NIL != forts.fort_p(template_item.first()) && rtp_type_checkers.NIL != lexicon_accessors.speech_partP(template_item.first(), (SubLObject)rtp_type_checkers.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 2628L)
    public static SubLObject rtp_nl_agr_pred_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(template_item.isList() && rtp_type_checkers.NIL != forts.fort_p(template_item.first()) && rtp_type_checkers.NIL != lexicon_vars.nl_agr_predP(template_item.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 2967L)
    public static SubLObject rtp_token_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(template_item.isList() && template_item.first().eql(rtp_type_checkers.$const6$TokenTemplate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 3106L)
    public static SubLObject rtp_word_itemP(final SubLObject template_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (template_item.isList() && rtp_type_checkers.NIL != forts.fort_p(template_item.first())) {
            return lexicon_accessors.quick_lexical_wordP(rtp_word_item_word(template_item), rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
        }
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 3571L)
    public static SubLObject rtp_word_pos_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != rtp_word_itemP(template_item) && rtp_type_checkers.NIL != lexicon_accessors.speech_partP(rtp_word_item_syntactic_constraint(template_item), (SubLObject)rtp_type_checkers.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 3878L)
    public static SubLObject rtp_word_pos_pred_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != rtp_word_itemP(template_item) && rtp_type_checkers.NIL != lexicon_accessors.speech_part_predP(rtp_word_item_syntactic_constraint(template_item), (SubLObject)rtp_type_checkers.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 4203L)
    public static SubLObject rtp_word_item_word(final SubLObject template_item) {
        if (template_item.first().eql(rtp_type_checkers.$const7$NLPattern_Word)) {
            return conses_high.second(template_item);
        }
        return template_item.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 4381L)
    public static SubLObject rtp_word_item_syntactic_constraint(final SubLObject template_item) {
        if (template_item.first().eql(rtp_type_checkers.$const7$NLPattern_Word)) {
            return conses_high.third(template_item);
        }
        return conses_high.second(template_item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 4575L)
    public static SubLObject new_rtp_word_item(final SubLObject wu, final SubLObject pos) {
        return (SubLObject)ConsesLow.list(rtp_type_checkers.$const7$NLPattern_Word, wu, pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 4661L)
    public static SubLObject rtp_optional_some_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(template_item.isList() && (template_item.first() == rtp_type_checkers.$sym8$_ || template_item.first().eql(rtp_type_checkers.$const9$OptionalSome)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 4992L)
    public static SubLObject rtp_optional_one_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(template_item.isList() && template_item.first().eql(rtp_type_checkers.$const10$OptionalOne));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 5277L)
    public static SubLObject rtp_required_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != rtp_require_one_itemP(template_item) || rtp_type_checkers.NIL != rtp_require_some_itemP(template_item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 5428L)
    public static SubLObject rtp_require_some_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(template_item.isList() && (template_item.first() == rtp_type_checkers.$sym11$_ || template_item.first().eql(rtp_type_checkers.$const12$RequireSome)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 5772L)
    public static SubLObject rtp_require_one_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(template_item.isList() && template_item.first().eql(rtp_type_checkers.$const13$RequireOne));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 6056L)
    public static SubLObject rtp_optional_template_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(template_item.isList() && rtp_type_checkers.NIL != conses_high.member(template_item.first(), (SubLObject)rtp_type_checkers.$list14, (SubLObject)rtp_type_checkers.UNPROVIDED, (SubLObject)rtp_type_checkers.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 6226L)
    public static SubLObject optional_template_item(final SubLObject template_item) {
        if (template_item.isList() && rtp_type_checkers.NIL != conses_high.member(template_item.first(), (SubLObject)rtp_type_checkers.$list15, (SubLObject)rtp_type_checkers.UNPROVIDED, (SubLObject)rtp_type_checkers.UNPROVIDED)) {
            return template_item.first();
        }
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 6667L)
    public static SubLObject rtp_word_sequence_itemP(final SubLObject template_item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(template_item.isCons() && (template_item.first().eql(rtp_type_checkers.$const16$WordSequence) || template_item.first().eql(rtp_type_checkers.$const17$NLPattern_Exact) || template_item.first() == rtp_type_checkers.$kw18$SEQUENCE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 6908L)
    public static SubLObject rtp_rule_terminalP(final SubLObject item) {
        return Types.stringp(item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 7099L)
    public static SubLObject new_rtp_string_item(final SubLObject string) {
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 7163L)
    public static SubLObject rtp_grouped_itemP(final SubLObject item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(item.isList() && (item.first().eql(rtp_type_checkers.$const16$WordSequence) || item.first().eql(rtp_type_checkers.$const17$NLPattern_Exact) || item.first() == rtp_type_checkers.$kw18$SEQUENCE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 7367L)
    public static SubLObject grouped_words(final SubLObject item) {
        if (rtp_type_checkers.NIL != rtp_grouped_itemP(item)) {
            return item.rest();
        }
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 7483L)
    public static SubLObject rtp_cyc_term_item(final SubLObject item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(item.isCons() && (item.first().eql(rtp_type_checkers.$const19$TermPOSPair) || item.first().eql(rtp_type_checkers.$const20$NLPattern_Term) || item.first().eql(rtp_type_checkers.$const21$NLPattern_Term_Optional) || item.first().eql(rtp_type_checkers.$const22$NLPattern_TermPred)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 8162L)
    public static SubLObject valid_rtp_syntactic_constraintP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rtp_type_checkers.NIL == list_utilities.proper_list_p(formula)) {
            return (SubLObject)rtp_type_checkers.NIL;
        }
        SubLObject badP = (SubLObject)rtp_type_checkers.NIL;
        if (rtp_type_checkers.NIL == badP) {
            SubLObject csome_list_var = formula;
            SubLObject item = (SubLObject)rtp_type_checkers.NIL;
            item = csome_list_var.first();
            while (rtp_type_checkers.NIL == badP && rtp_type_checkers.NIL != csome_list_var) {
                if (!item.eql(rtp_type_checkers.$const23$NLPatternList) && rtp_type_checkers.NIL == valid_rtp_syntactic_itemP(item)) {
                    badP = (SubLObject)rtp_type_checkers.T;
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)rtp_type_checkers.ONE_INTEGER)) {
                        recognition.rtp_tracer_output((SubLObject)rtp_type_checkers.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)rtp_type_checkers.$str24$__Invalid_Syntactic_Template_Item, item, formula));
                    }
                }
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 9651L)
    public static SubLObject valid_rtp_syntactic_itemP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rtp_type_checkers.NIL != slotted_constraint_p(formula)) {
            return valid_rtp_slotted_itemP(formula);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((rtp_type_checkers.NIL != rtp_type_checkers.$allow_vars_in_this_parsing_template$.getDynamicValue(thread) && rtp_type_checkers.NIL != cycl_grammar.el_variable_p(formula)) || rtp_type_checkers.NIL != valid_rtp_string_itemP(formula) || rtp_type_checkers.NIL != valid_rtp_word_itemP(formula) || rtp_type_checkers.NIL != valid_rtp_recursive_itemP(formula, (SubLObject)rtp_type_checkers.UNPROVIDED) || rtp_type_checkers.NIL != valid_rtp_cyc_term_pairP(formula) || rtp_type_checkers.NIL != valid_rtp_accept_one_itemP(formula) || rtp_type_checkers.NIL != valid_rtp_accept_some_itemP(formula) || rtp_type_checkers.NIL != valid_rtp_exact_patternP(formula) || rtp_type_checkers.NIL != valid_rtp_speech_part_itemP(formula) || rtp_type_checkers.NIL != valid_rtp_agr_pred_itemP(formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 10212L)
    public static SubLObject slotted_constraint_p(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(formula.isList() && rtp_type_checkers.NIL != isa.isaP(cycl_utilities.formula_arg0(formula), rtp_type_checkers.$const25$NLParsingSlot, (SubLObject)rtp_type_checkers.UNPROVIDED, (SubLObject)rtp_type_checkers.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 10344L)
    public static SubLObject valid_rtp_slotted_itemP(final SubLObject formula) {
        if (rtp_type_checkers.NIL != isa.isaP(cycl_utilities.formula_arg0(formula), rtp_type_checkers.$const25$NLParsingSlot, (SubLObject)rtp_type_checkers.UNPROVIDED, (SubLObject)rtp_type_checkers.UNPROVIDED)) {
            SubLObject invalidP = (SubLObject)rtp_type_checkers.NIL;
            final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)rtp_type_checkers.$kw26$IGNORE);
            SubLObject rest;
            SubLObject this_arg;
            for (rest = (SubLObject)rtp_type_checkers.NIL, rest = args; rtp_type_checkers.NIL == invalidP && rtp_type_checkers.NIL != rest; invalidP = (SubLObject)SubLObjectFactory.makeBoolean(this_arg.isList() && rtp_type_checkers.NIL == valid_rtp_syntactic_itemP(this_arg)), rest = rest.rest()) {
                this_arg = rest.first();
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL == invalidP);
        }
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 11017L)
    public static SubLObject valid_rtp_cyc_term_pairP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rtp_type_checkers.NIL == el_utilities.formula_arityE(formula, (SubLObject)rtp_type_checkers.TWO_INTEGER, (SubLObject)rtp_type_checkers.UNPROVIDED)) {
            return (SubLObject)rtp_type_checkers.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(formula, (SubLObject)rtp_type_checkers.UNPROVIDED);
        SubLObject function = (SubLObject)rtp_type_checkers.NIL;
        SubLObject v_term = (SubLObject)rtp_type_checkers.NIL;
        SubLObject v_class = (SubLObject)rtp_type_checkers.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rtp_type_checkers.$list27);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rtp_type_checkers.$list27);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rtp_type_checkers.$list27);
        v_class = current.first();
        current = current.rest();
        if (rtp_type_checkers.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rtp_type_checkers.$list27);
            return (SubLObject)rtp_type_checkers.NIL;
        }
        if (rtp_type_checkers.NIL == forts.fort_p(v_term) && (rtp_type_checkers.NIL == rtp_type_checkers.$allow_vars_in_this_parsing_template$.getDynamicValue(thread) || rtp_type_checkers.NIL == cycl_grammar.el_variable_p(v_term))) {
            return (SubLObject)rtp_type_checkers.NIL;
        }
        if (function.eql(rtp_type_checkers.$const19$TermPOSPair) || function.eql(rtp_type_checkers.$const20$NLPattern_Term) || function.eql(rtp_type_checkers.$const21$NLPattern_Term_Optional)) {
            return (SubLObject)SubLObjectFactory.makeBoolean((rtp_type_checkers.NIL != term.el_fort_p(v_class) && (rtp_type_checkers.NIL != lexicon_accessors.speech_part_predP(v_class, (SubLObject)rtp_type_checkers.UNPROVIDED) || rtp_type_checkers.NIL != lexicon_accessors.speech_partP(v_class, (SubLObject)rtp_type_checkers.UNPROVIDED) || rtp_type_checkers.NIL != lexicon_vars.name_string_predP(v_class))) || (rtp_type_checkers.NIL != rtp_type_checkers.$allow_vars_in_this_parsing_template$.getDynamicValue(thread) && rtp_type_checkers.NIL != cycl_grammar.el_variable_p(v_class)));
        }
        if (function.eql(rtp_type_checkers.$const22$NLPattern_TermPred)) {
            return (SubLObject)SubLObjectFactory.makeBoolean((rtp_type_checkers.NIL != term.el_fort_p(v_class) && rtp_type_checkers.NIL != isa.isa_in_any_mtP(v_class, rtp_type_checkers.$const28$SpeechPartPredicate)) || (rtp_type_checkers.NIL != rtp_type_checkers.$allow_vars_in_this_parsing_template$.getDynamicValue(thread) && rtp_type_checkers.NIL != cycl_grammar.el_variable_p(v_class)));
        }
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 11904L)
    public static SubLObject valid_rtp_word_itemP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject the_word = (SubLObject)rtp_type_checkers.NIL;
        SubLObject the_pos = (SubLObject)rtp_type_checkers.NIL;
        if (rtp_type_checkers.NIL != el_utilities.formula_arityE(obj, (SubLObject)rtp_type_checkers.TWO_INTEGER, (SubLObject)rtp_type_checkers.UNPROVIDED) && cycl_utilities.formula_arg0(obj).eql(rtp_type_checkers.$const7$NLPattern_Word)) {
            the_word = cycl_utilities.formula_arg1(obj, (SubLObject)rtp_type_checkers.UNPROVIDED);
            the_pos = cycl_utilities.formula_arg2(obj, (SubLObject)rtp_type_checkers.UNPROVIDED);
        }
        else {
            if (rtp_type_checkers.NIL == el_utilities.formula_arityE(obj, (SubLObject)rtp_type_checkers.ONE_INTEGER, (SubLObject)rtp_type_checkers.UNPROVIDED)) {
                return (SubLObject)rtp_type_checkers.NIL;
            }
            the_word = cycl_utilities.formula_arg0(obj);
            the_pos = cycl_utilities.formula_arg1(obj, (SubLObject)rtp_type_checkers.UNPROVIDED);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(((rtp_type_checkers.NIL != term.el_fort_p(the_word) && rtp_type_checkers.NIL != isa.isa_in_any_mtP(the_word, rtp_type_checkers.$const29$LexicalWord)) || (rtp_type_checkers.NIL != rtp_type_checkers.$allow_vars_in_this_parsing_template$.getDynamicValue(thread) && rtp_type_checkers.NIL != cycl_grammar.el_variable_p(the_word))) && ((rtp_type_checkers.NIL != term.el_fort_p(the_pos) && (rtp_type_checkers.NIL != genls.genl_in_any_mtP(the_pos, rtp_type_checkers.$const30$NLWordForm) || rtp_type_checkers.NIL != isa.isa_in_any_mtP(the_pos, rtp_type_checkers.$const28$SpeechPartPredicate))) || (rtp_type_checkers.NIL != rtp_type_checkers.$allow_vars_in_this_parsing_template$.getDynamicValue(thread) && rtp_type_checkers.NIL != cycl_grammar.el_variable_p(the_pos))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 12859L)
    public static SubLObject valid_rtp_string_itemP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isString() || rtp_type_checkers.NIL != conses_high.member(obj, isa.all_fort_instances_in_all_mts(rtp_type_checkers.$const31$TemplateSententialMarker), (SubLObject)rtp_type_checkers.UNPROVIDED, (SubLObject)rtp_type_checkers.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 13023L)
    public static SubLObject valid_rtp_accept_one_itemP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != el_utilities.el_formula_p(obj) && (cycl_utilities.formula_arg0(obj).eql(rtp_type_checkers.$const13$RequireOne) || cycl_utilities.formula_arg0(obj).eql(rtp_type_checkers.$const10$OptionalOne)) && rtp_type_checkers.NIL != valid_accept_one_argsP(cycl_utilities.formula_args(obj, (SubLObject)rtp_type_checkers.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 13261L)
    public static SubLObject valid_accept_one_argsP(final SubLObject args) {
        SubLObject bad_argP = (SubLObject)rtp_type_checkers.NIL;
        if (rtp_type_checkers.NIL == bad_argP) {
            SubLObject csome_list_var = args;
            SubLObject arg = (SubLObject)rtp_type_checkers.NIL;
            arg = csome_list_var.first();
            while (rtp_type_checkers.NIL == bad_argP && rtp_type_checkers.NIL != csome_list_var) {
                if (rtp_type_checkers.NIL == valid_accept_one_argP(arg)) {
                    bad_argP = (SubLObject)rtp_type_checkers.T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL == bad_argP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 13453L)
    public static SubLObject valid_accept_one_argP(final SubLObject arg) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != valid_rtp_string_itemP(arg) || rtp_type_checkers.NIL != valid_rtp_word_itemP(arg) || rtp_type_checkers.NIL != valid_rtp_word_sequenceP(arg) || rtp_type_checkers.NIL != valid_rtp_exact_patternP(arg) || rtp_type_checkers.NIL != valid_rtp_cyc_term_pairP(arg));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 13683L)
    public static SubLObject valid_rtp_accept_some_itemP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != el_utilities.el_formula_p(obj) && (cycl_utilities.formula_arg0(obj).eql(rtp_type_checkers.$const12$RequireSome) || cycl_utilities.formula_arg0(obj).eql(rtp_type_checkers.$const9$OptionalSome)) && rtp_type_checkers.NIL != valid_accept_some_argsP(cycl_utilities.formula_args(obj, (SubLObject)rtp_type_checkers.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 13925L)
    public static SubLObject valid_accept_some_argsP(final SubLObject args) {
        SubLObject bad_argP = (SubLObject)rtp_type_checkers.NIL;
        if (rtp_type_checkers.NIL == bad_argP) {
            SubLObject csome_list_var = args;
            SubLObject arg = (SubLObject)rtp_type_checkers.NIL;
            arg = csome_list_var.first();
            while (rtp_type_checkers.NIL == bad_argP && rtp_type_checkers.NIL != csome_list_var) {
                if (rtp_type_checkers.NIL == valid_accept_some_argP(arg)) {
                    bad_argP = (SubLObject)rtp_type_checkers.T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL == bad_argP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 14119L)
    public static SubLObject valid_accept_some_argP(final SubLObject arg) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != valid_rtp_string_itemP(arg) || rtp_type_checkers.NIL != valid_rtp_word_itemP(arg) || rtp_type_checkers.NIL != valid_rtp_cyc_term_pairP(arg));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 14282L)
    public static SubLObject valid_rtp_word_sequenceP(final SubLObject arg) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != el_utilities.el_formula_p(arg) && cycl_utilities.formula_arg0(arg).eql(rtp_type_checkers.$const16$WordSequence) && rtp_type_checkers.NIL != valid_word_sequence_args(cycl_utilities.formula_args(arg, (SubLObject)rtp_type_checkers.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 14462L)
    public static SubLObject valid_rtp_exact_patternP(final SubLObject arg) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != el_utilities.el_formula_p(arg) && cycl_utilities.formula_arg0(arg).eql(rtp_type_checkers.$const17$NLPattern_Exact) && rtp_type_checkers.NIL != valid_word_sequence_args(cycl_utilities.formula_args(arg, (SubLObject)rtp_type_checkers.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 14645L)
    public static SubLObject valid_word_sequence_args(final SubLObject args) {
        SubLObject bad_argP = (SubLObject)rtp_type_checkers.NIL;
        if (rtp_type_checkers.NIL == bad_argP) {
            SubLObject csome_list_var = args;
            SubLObject arg = (SubLObject)rtp_type_checkers.NIL;
            arg = csome_list_var.first();
            while (rtp_type_checkers.NIL == bad_argP && rtp_type_checkers.NIL != csome_list_var) {
                if (rtp_type_checkers.NIL == valid_rtp_string_itemP(arg) && rtp_type_checkers.NIL == valid_rtp_word_itemP(arg) && rtp_type_checkers.NIL == valid_rtp_cyc_term_pairP(arg)) {
                    bad_argP = (SubLObject)rtp_type_checkers.T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL == bad_argP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 14914L)
    public static SubLObject valid_rtp_recursive_itemP(final SubLObject obj, SubLObject specific_keyword) {
        if (specific_keyword == rtp_type_checkers.UNPROVIDED) {
            specific_keyword = (SubLObject)rtp_type_checkers.NIL;
        }
        if (rtp_type_checkers.NIL == el_utilities.el_formula_p(obj)) {
            return Values.values((SubLObject)rtp_type_checkers.NIL, (SubLObject)rtp_type_checkers.NIL);
        }
        SubLObject the_template = (SubLObject)rtp_type_checkers.NIL;
        SubLObject the_keyword = (SubLObject)rtp_type_checkers.NIL;
        if (rtp_type_checkers.NIL != el_utilities.formula_arityE(obj, (SubLObject)rtp_type_checkers.TWO_INTEGER, (SubLObject)rtp_type_checkers.UNPROVIDED) && cycl_utilities.formula_arg0(obj).eql(rtp_type_checkers.$const5$NLPattern_Template)) {
            the_template = cycl_utilities.formula_arg1(obj, (SubLObject)rtp_type_checkers.UNPROVIDED);
            the_keyword = cycl_utilities.formula_arg2(obj, (SubLObject)rtp_type_checkers.UNPROVIDED);
        }
        else {
            if (rtp_type_checkers.NIL == el_utilities.formula_arityE(obj, (SubLObject)rtp_type_checkers.ONE_INTEGER, (SubLObject)rtp_type_checkers.UNPROVIDED)) {
                return Values.values((SubLObject)rtp_type_checkers.NIL, (SubLObject)rtp_type_checkers.NIL);
            }
            the_template = cycl_utilities.formula_arg0(obj);
            the_keyword = cycl_utilities.formula_arg1(obj, (SubLObject)rtp_type_checkers.UNPROVIDED);
        }
        if (rtp_type_checkers.NIL != rtp_template_categoryP(the_template, (SubLObject)rtp_type_checkers.UNPROVIDED) && the_keyword.isKeyword() && (rtp_type_checkers.NIL == specific_keyword || the_keyword.equal(specific_keyword))) {
            return Values.values(the_template, the_keyword);
        }
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 15876L)
    public static SubLObject valid_rtp_speech_part_itemP(final SubLObject obj) {
        if (rtp_type_checkers.NIL == el_utilities.el_formula_p(obj)) {
            return (SubLObject)rtp_type_checkers.NIL;
        }
        if (rtp_type_checkers.NIL != el_utilities.formula_arityE(obj, (SubLObject)rtp_type_checkers.TWO_INTEGER, (SubLObject)rtp_type_checkers.UNPROVIDED) && cycl_utilities.formula_arg0(obj).eql(rtp_type_checkers.$const32$NLPattern_POS)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != forts.fort_p(cycl_utilities.formula_arg2(obj, (SubLObject)rtp_type_checkers.UNPROVIDED)) && rtp_type_checkers.NIL != lexicon_accessors.speech_partP(cycl_utilities.formula_arg2(obj, (SubLObject)rtp_type_checkers.UNPROVIDED), (SubLObject)rtp_type_checkers.UNPROVIDED) && cycl_utilities.formula_arg1(obj, (SubLObject)rtp_type_checkers.UNPROVIDED).isKeyword());
        }
        if (rtp_type_checkers.NIL != el_utilities.formula_arityE(obj, (SubLObject)rtp_type_checkers.ONE_INTEGER, (SubLObject)rtp_type_checkers.UNPROVIDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != forts.fort_p(cycl_utilities.formula_arg0(obj)) && rtp_type_checkers.NIL != lexicon_accessors.speech_partP(cycl_utilities.formula_arg0(obj), (SubLObject)rtp_type_checkers.UNPROVIDED) && cycl_utilities.formula_arg1(obj, (SubLObject)rtp_type_checkers.UNPROVIDED).isKeyword());
        }
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-type-checkers.lisp", position = 16519L)
    public static SubLObject valid_rtp_agr_pred_itemP(final SubLObject obj) {
        if (rtp_type_checkers.NIL == el_utilities.el_formula_p(obj)) {
            return (SubLObject)rtp_type_checkers.NIL;
        }
        if (rtp_type_checkers.NIL != el_utilities.formula_arityE(obj, (SubLObject)rtp_type_checkers.TWO_INTEGER, (SubLObject)rtp_type_checkers.UNPROVIDED) && cycl_utilities.formula_arg0(obj).eql(rtp_type_checkers.$const33$NLPattern_Agr)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != forts.fort_p(cycl_utilities.formula_arg2(obj, (SubLObject)rtp_type_checkers.UNPROVIDED)) && rtp_type_checkers.NIL != lexicon_vars.nl_agr_predP(cycl_utilities.formula_arg2(obj, (SubLObject)rtp_type_checkers.UNPROVIDED)) && cycl_utilities.formula_arg1(obj, (SubLObject)rtp_type_checkers.UNPROVIDED).isKeyword());
        }
        if (rtp_type_checkers.NIL != el_utilities.formula_arityE(obj, (SubLObject)rtp_type_checkers.ONE_INTEGER, (SubLObject)rtp_type_checkers.UNPROVIDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(rtp_type_checkers.NIL != forts.fort_p(cycl_utilities.formula_arg0(obj)) && rtp_type_checkers.NIL != lexicon_vars.nl_agr_predP(cycl_utilities.formula_arg0(obj)) && cycl_utilities.formula_arg1(obj, (SubLObject)rtp_type_checkers.UNPROVIDED).isKeyword());
        }
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    public static SubLObject declare_rtp_type_checkers_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "clear_rtp_template_categoryP", "CLEAR-RTP-TEMPLATE-CATEGORY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "remove_rtp_template_categoryP", "REMOVE-RTP-TEMPLATE-CATEGORY?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_template_categoryP_internal", "RTP-TEMPLATE-CATEGORY?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_template_categoryP", "RTP-TEMPLATE-CATEGORY?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_recursive_itemP", "RTP-RECURSIVE-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "recursive_item_template_category", "RECURSIVE-ITEM-TEMPLATE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_speech_part_itemP", "RTP-SPEECH-PART-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_nl_agr_pred_itemP", "RTP-NL-AGR-PRED-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_token_itemP", "RTP-TOKEN-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_word_itemP", "RTP-WORD-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_word_pos_itemP", "RTP-WORD-POS-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_word_pos_pred_itemP", "RTP-WORD-POS-PRED-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_word_item_word", "RTP-WORD-ITEM-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_word_item_syntactic_constraint", "RTP-WORD-ITEM-SYNTACTIC-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "new_rtp_word_item", "NEW-RTP-WORD-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_optional_some_itemP", "RTP-OPTIONAL-SOME-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_optional_one_itemP", "RTP-OPTIONAL-ONE-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_required_itemP", "RTP-REQUIRED-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_require_some_itemP", "RTP-REQUIRE-SOME-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_require_one_itemP", "RTP-REQUIRE-ONE-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_optional_template_itemP", "RTP-OPTIONAL-TEMPLATE-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "optional_template_item", "OPTIONAL-TEMPLATE-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_word_sequence_itemP", "RTP-WORD-SEQUENCE-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_rule_terminalP", "RTP-RULE-TERMINAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "new_rtp_string_item", "NEW-RTP-STRING-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_grouped_itemP", "RTP-GROUPED-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "grouped_words", "GROUPED-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "rtp_cyc_term_item", "RTP-CYC-TERM-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_syntactic_constraintP", "VALID-RTP-SYNTACTIC-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_syntactic_itemP", "VALID-RTP-SYNTACTIC-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "slotted_constraint_p", "SLOTTED-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_slotted_itemP", "VALID-RTP-SLOTTED-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_cyc_term_pairP", "VALID-RTP-CYC-TERM-PAIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_word_itemP", "VALID-RTP-WORD-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_string_itemP", "VALID-RTP-STRING-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_accept_one_itemP", "VALID-RTP-ACCEPT-ONE-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_accept_one_argsP", "VALID-ACCEPT-ONE-ARGS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_accept_one_argP", "VALID-ACCEPT-ONE-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_accept_some_itemP", "VALID-RTP-ACCEPT-SOME-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_accept_some_argsP", "VALID-ACCEPT-SOME-ARGS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_accept_some_argP", "VALID-ACCEPT-SOME-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_word_sequenceP", "VALID-RTP-WORD-SEQUENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_exact_patternP", "VALID-RTP-EXACT-PATTERN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_word_sequence_args", "VALID-WORD-SEQUENCE-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_recursive_itemP", "VALID-RTP-RECURSIVE-ITEM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_speech_part_itemP", "VALID-RTP-SPEECH-PART-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_type_checkers", "valid_rtp_agr_pred_itemP", "VALID-RTP-AGR-PRED-ITEM?", 1, 0, false);
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    public static SubLObject init_rtp_type_checkers_file() {
        rtp_type_checkers.$allow_vars_in_this_parsing_template$ = SubLFiles.defparameter("*ALLOW-VARS-IN-THIS-PARSING-TEMPLATE*", (SubLObject)rtp_type_checkers.T);
        rtp_type_checkers.$rtp_template_categoryP_caching_state$ = SubLFiles.deflexical("*RTP-TEMPLATE-CATEGORY?-CACHING-STATE*", (SubLObject)rtp_type_checkers.NIL);
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    public static SubLObject setup_rtp_type_checkers_file() {
        memoization_state.note_globally_cached_function((SubLObject)rtp_type_checkers.$sym1$RTP_TEMPLATE_CATEGORY_);
        return (SubLObject)rtp_type_checkers.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rtp_type_checkers_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rtp_type_checkers_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rtp_type_checkers_file();
    }
    
    static {
        me = (SubLFile)new rtp_type_checkers();
        rtp_type_checkers.$allow_vars_in_this_parsing_template$ = null;
        rtp_type_checkers.$rtp_template_categoryP_caching_state$ = null;
        $kw0$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym1$RTP_TEMPLATE_CATEGORY_ = SubLObjectFactory.makeSymbol("RTP-TEMPLATE-CATEGORY?");
        $const2$ParsingTemplateCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParsingTemplateCategory"));
        $sym3$_RTP_TEMPLATE_CATEGORY__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RTP-TEMPLATE-CATEGORY?-CACHING-STATE*");
        $int4$32 = SubLObjectFactory.makeInteger(32);
        $const5$NLPattern_Template = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-Template"));
        $const6$TokenTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TokenTemplate"));
        $const7$NLPattern_Word = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-Word"));
        $sym8$_ = SubLObjectFactory.makeSymbol("*");
        $const9$OptionalSome = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OptionalSome"));
        $const10$OptionalOne = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OptionalOne"));
        $sym11$_ = SubLObjectFactory.makeSymbol("+");
        $const12$RequireSome = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RequireSome"));
        $const13$RequireOne = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RequireOne"));
        $list14 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OptionalOne")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OptionalSome")));
        $list15 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RequireOne")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RequireSome")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OptionalOne")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OptionalSome")));
        $const16$WordSequence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordSequence"));
        $const17$NLPattern_Exact = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-Exact"));
        $kw18$SEQUENCE = SubLObjectFactory.makeKeyword("SEQUENCE");
        $const19$TermPOSPair = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TermPOSPair"));
        $const20$NLPattern_Term = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-Term"));
        $const21$NLPattern_Term_Optional = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-Term-Optional"));
        $const22$NLPattern_TermPred = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-TermPred"));
        $const23$NLPatternList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPatternList"));
        $str24$__Invalid_Syntactic_Template_Item = SubLObjectFactory.makeString(";;Invalid Syntactic Template Item: ~S~%From: ~S~%");
        $const25$NLParsingSlot = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLParsingSlot"));
        $kw26$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"));
        $const28$SpeechPartPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpeechPartPredicate"));
        $const29$LexicalWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LexicalWord"));
        $const30$NLWordForm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLWordForm"));
        $const31$TemplateSententialMarker = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemplateSententialMarker"));
        $const32$NLPattern_POS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-POS"));
        $const33$NLPattern_Agr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-Agr"));
    }
}

/*

	Total time: 103 ms
	
*/