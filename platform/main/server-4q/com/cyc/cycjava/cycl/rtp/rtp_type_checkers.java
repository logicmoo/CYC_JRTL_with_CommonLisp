package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.term;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rtp_type_checkers extends SubLTranslatedFile {
    public static final SubLFile me = new rtp_type_checkers();

    public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_type_checkers";

    public static final String myFingerPrint = "57e0dec36048cb0a66539a0adae0e3e07a227455c224a73cb37750ef3ea62323";

    // defparameter
    // Definitions
    /**
     * A kludge to permit variables inside templates for purposes of writing rules,
     * but not to allow them when actually storing templates. This can presumably go
     * away once proper wff-checking is enabled for templates.
     */
    public static final SubLSymbol $allow_vars_in_this_parsing_template$ = makeSymbol("*ALLOW-VARS-IN-THIS-PARSING-TEMPLATE*");

    // deflexical
    private static final SubLSymbol $rtp_template_categoryP_caching_state$ = makeSymbol("*RTP-TEMPLATE-CATEGORY?-CACHING-STATE*");



    public static final SubLSymbol $sym1$RTP_TEMPLATE_CATEGORY_ = makeSymbol("RTP-TEMPLATE-CATEGORY?");

    private static final SubLObject $$ParsingTemplateCategory = reader_make_constant_shell(makeString("ParsingTemplateCategory"));

    public static final SubLSymbol $sym3$_RTP_TEMPLATE_CATEGORY__CACHING_STATE_ = makeSymbol("*RTP-TEMPLATE-CATEGORY?-CACHING-STATE*");



    private static final SubLObject $$NLPattern_Template = reader_make_constant_shell(makeString("NLPattern-Template"));

    private static final SubLObject $$TokenTemplate = reader_make_constant_shell(makeString("TokenTemplate"));

    private static final SubLObject $$NLPattern_Word = reader_make_constant_shell(makeString("NLPattern-Word"));

    private static final SubLSymbol $sym8$_ = makeSymbol("*");

    private static final SubLObject $$OptionalSome = reader_make_constant_shell(makeString("OptionalSome"));

    private static final SubLObject $$OptionalOne = reader_make_constant_shell(makeString("OptionalOne"));

    private static final SubLSymbol $sym11$_ = makeSymbol("+");

    private static final SubLObject $$RequireSome = reader_make_constant_shell(makeString("RequireSome"));

    private static final SubLObject $$RequireOne = reader_make_constant_shell(makeString("RequireOne"));

    private static final SubLList $list14 = list(reader_make_constant_shell(makeString("OptionalOne")), reader_make_constant_shell(makeString("OptionalSome")));

    public static final SubLList $list15 = list(reader_make_constant_shell(makeString("RequireOne")), reader_make_constant_shell(makeString("RequireSome")), reader_make_constant_shell(makeString("OptionalOne")), reader_make_constant_shell(makeString("OptionalSome")));

    private static final SubLObject $$WordSequence = reader_make_constant_shell(makeString("WordSequence"));

    private static final SubLObject $$NLPattern_Exact = reader_make_constant_shell(makeString("NLPattern-Exact"));



    private static final SubLObject $$TermPOSPair = reader_make_constant_shell(makeString("TermPOSPair"));

    private static final SubLObject $$NLPattern_Term = reader_make_constant_shell(makeString("NLPattern-Term"));

    private static final SubLObject $$NLPattern_Term_Optional = reader_make_constant_shell(makeString("NLPattern-Term-Optional"));

    private static final SubLObject $$NLPattern_TermPred = reader_make_constant_shell(makeString("NLPattern-TermPred"));

    private static final SubLObject $$NLPatternList = reader_make_constant_shell(makeString("NLPatternList"));

    private static final SubLString $str24$__Invalid_Syntactic_Template_Item = makeString(";;Invalid Syntactic Template Item: ~S~%From: ~S~%");

    private static final SubLObject $$NLParsingSlot = reader_make_constant_shell(makeString("NLParsingSlot"));



    private static final SubLList $list27 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("CLASS"));

    private static final SubLObject $$SpeechPartPredicate = reader_make_constant_shell(makeString("SpeechPartPredicate"));

    private static final SubLObject $$LexicalWord = reader_make_constant_shell(makeString("LexicalWord"));

    private static final SubLObject $$NLWordForm = reader_make_constant_shell(makeString("NLWordForm"));

    private static final SubLObject $$TemplateSententialMarker = reader_make_constant_shell(makeString("TemplateSententialMarker"));

    private static final SubLObject $$NLPattern_POS = reader_make_constant_shell(makeString("NLPattern-POS"));

    private static final SubLObject $$NLPattern_Agr = reader_make_constant_shell(makeString("NLPattern-Agr"));

    public static SubLObject clear_rtp_template_categoryP() {
        final SubLObject cs = $rtp_template_categoryP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rtp_template_categoryP(final SubLObject item, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        return memoization_state.caching_state_remove_function_results_with_args($rtp_template_categoryP_caching_state$.getGlobalValue(), list(item, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rtp_template_categoryP_internal(final SubLObject item, final SubLObject mt) {
        return makeBoolean((NIL != forts.fort_p(item)) && (NIL != (mt == $ANY ? genls.genl_in_any_mtP(item, $$ParsingTemplateCategory) : genls.genlP(item, $$ParsingTemplateCategory, mt, UNPROVIDED))));
    }

    public static SubLObject rtp_template_categoryP(final SubLObject item, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        SubLObject caching_state = $rtp_template_categoryP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym1$RTP_TEMPLATE_CATEGORY_, $sym3$_RTP_TEMPLATE_CATEGORY__CACHING_STATE_, NIL, EQL, TWO_INTEGER, $int$32);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(item, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (item.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rtp_template_categoryP_internal(item, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(item, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rtp_recursive_itemP(final SubLObject template_item) {
        return makeBoolean(template_item.isList() && (NIL != rtp_template_categoryP(template_item.first(), UNPROVIDED)));
    }

    public static SubLObject recursive_item_template_category(final SubLObject template_item) {
        if (NIL != rtp_recursive_itemP(template_item)) {
            return template_item.first();
        }
        if (template_item.first().eql($$NLPattern_Template)) {
            return second(template_item);
        }
        return NIL;
    }

    public static SubLObject rtp_speech_part_itemP(final SubLObject template_item) {
        return makeBoolean((template_item.isList() && (NIL != forts.fort_p(template_item.first()))) && (NIL != lexicon_accessors.speech_partP(template_item.first(), UNPROVIDED)));
    }

    public static SubLObject rtp_nl_agr_pred_itemP(final SubLObject template_item) {
        return makeBoolean((template_item.isList() && (NIL != forts.fort_p(template_item.first()))) && (NIL != lexicon_vars.nl_agr_predP(template_item.first())));
    }

    public static SubLObject rtp_token_itemP(final SubLObject template_item) {
        return makeBoolean(template_item.isList() && template_item.first().eql($$TokenTemplate));
    }

    public static SubLObject rtp_word_itemP(final SubLObject template_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (template_item.isList() && (NIL != forts.fort_p(template_item.first()))) {
            return lexicon_accessors.quick_lexical_wordP(rtp_word_item_word(template_item), rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject rtp_word_pos_itemP(final SubLObject template_item) {
        return makeBoolean((NIL != rtp_word_itemP(template_item)) && (NIL != lexicon_accessors.speech_partP(rtp_word_item_syntactic_constraint(template_item), UNPROVIDED)));
    }

    public static SubLObject rtp_word_pos_pred_itemP(final SubLObject template_item) {
        return makeBoolean((NIL != rtp_word_itemP(template_item)) && (NIL != lexicon_accessors.speech_part_predP(rtp_word_item_syntactic_constraint(template_item), UNPROVIDED)));
    }

    public static SubLObject rtp_word_item_word(final SubLObject template_item) {
        if (template_item.first().eql($$NLPattern_Word)) {
            return second(template_item);
        }
        return template_item.first();
    }

    public static SubLObject rtp_word_item_syntactic_constraint(final SubLObject template_item) {
        if (template_item.first().eql($$NLPattern_Word)) {
            return third(template_item);
        }
        return second(template_item);
    }

    public static SubLObject new_rtp_word_item(final SubLObject wu, final SubLObject pos) {
        return list($$NLPattern_Word, wu, pos);
    }

    public static SubLObject rtp_optional_some_itemP(final SubLObject template_item) {
        return makeBoolean(template_item.isList() && ((template_item.first() == $sym8$_) || template_item.first().eql($$OptionalSome)));
    }

    public static SubLObject rtp_optional_one_itemP(final SubLObject template_item) {
        return makeBoolean(template_item.isList() && template_item.first().eql($$OptionalOne));
    }

    public static SubLObject rtp_required_itemP(final SubLObject template_item) {
        return makeBoolean((NIL != rtp_require_one_itemP(template_item)) || (NIL != rtp_require_some_itemP(template_item)));
    }

    public static SubLObject rtp_require_some_itemP(final SubLObject template_item) {
        return makeBoolean(template_item.isList() && ((template_item.first() == $sym11$_) || template_item.first().eql($$RequireSome)));
    }

    public static SubLObject rtp_require_one_itemP(final SubLObject template_item) {
        return makeBoolean(template_item.isList() && template_item.first().eql($$RequireOne));
    }

    public static SubLObject rtp_optional_template_itemP(final SubLObject template_item) {
        return makeBoolean(template_item.isList() && (NIL != member(template_item.first(), $list14, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject optional_template_item(final SubLObject template_item) {
        if (template_item.isList() && (NIL != member(template_item.first(), $list15, UNPROVIDED, UNPROVIDED))) {
            return template_item.first();
        }
        return NIL;
    }

    public static SubLObject rtp_word_sequence_itemP(final SubLObject template_item) {
        return makeBoolean(template_item.isCons() && ((template_item.first().eql($$WordSequence) || template_item.first().eql($$NLPattern_Exact)) || (template_item.first() == $SEQUENCE)));
    }

    public static SubLObject rtp_rule_terminalP(final SubLObject item) {
        return stringp(item);
    }

    public static SubLObject new_rtp_string_item(final SubLObject string) {
        return string;
    }

    public static SubLObject rtp_grouped_itemP(final SubLObject item) {
        return makeBoolean(item.isList() && ((item.first().eql($$WordSequence) || item.first().eql($$NLPattern_Exact)) || (item.first() == $SEQUENCE)));
    }

    public static SubLObject grouped_words(final SubLObject item) {
        if (NIL != rtp_grouped_itemP(item)) {
            return item.rest();
        }
        return NIL;
    }

    public static SubLObject rtp_cyc_term_item(final SubLObject item) {
        return makeBoolean(item.isCons() && (((item.first().eql($$TermPOSPair) || item.first().eql($$NLPattern_Term)) || item.first().eql($$NLPattern_Term_Optional)) || item.first().eql($$NLPattern_TermPred)));
    }

    public static SubLObject valid_rtp_syntactic_constraintP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == list_utilities.proper_list_p(formula)) {
            return NIL;
        }
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var = formula;
            SubLObject item = NIL;
            item = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                if ((!item.eql($$NLPatternList)) && (NIL == valid_rtp_syntactic_itemP(item))) {
                    badP = T;
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        recognition.rtp_tracer_output(ONE_INTEGER, list($str24$__Invalid_Syntactic_Template_Item, item, formula));
                    }
                }
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == badP);
    }

    public static SubLObject valid_rtp_syntactic_itemP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != slotted_constraint_p(formula)) {
            return valid_rtp_slotted_itemP(formula);
        }
        return makeBoolean(((((((((((NIL != $allow_vars_in_this_parsing_template$.getDynamicValue(thread)) && (NIL != cycl_grammar.el_variable_p(formula))) || (NIL != valid_rtp_string_itemP(formula))) || (NIL != valid_rtp_word_itemP(formula))) || (NIL != valid_rtp_recursive_itemP(formula, UNPROVIDED))) || (NIL != valid_rtp_cyc_term_pairP(formula))) || (NIL != valid_rtp_accept_one_itemP(formula))) || (NIL != valid_rtp_accept_some_itemP(formula))) || (NIL != valid_rtp_exact_patternP(formula))) || (NIL != valid_rtp_speech_part_itemP(formula))) || (NIL != valid_rtp_agr_pred_itemP(formula)));
    }

    public static SubLObject slotted_constraint_p(final SubLObject formula) {
        return makeBoolean(formula.isList() && (NIL != isa.isaP(cycl_utilities.formula_arg0(formula), $$NLParsingSlot, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject valid_rtp_slotted_itemP(final SubLObject formula) {
        if (NIL != isa.isaP(cycl_utilities.formula_arg0(formula), $$NLParsingSlot, UNPROVIDED, UNPROVIDED)) {
            SubLObject invalidP = NIL;
            final SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
            SubLObject rest;
            SubLObject this_arg;
            for (rest = NIL, rest = args; (NIL == invalidP) && (NIL != rest); invalidP = makeBoolean(this_arg.isList() && (NIL == valid_rtp_syntactic_itemP(this_arg))) , rest = rest.rest()) {
                this_arg = rest.first();
            }
            return makeBoolean(NIL == invalidP);
        }
        return NIL;
    }

    public static SubLObject valid_rtp_cyc_term_pairP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == formula_arityE(formula, TWO_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(formula, UNPROVIDED);
        SubLObject function = NIL;
        SubLObject v_term = NIL;
        SubLObject v_class = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        v_class = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list27);
            return NIL;
        }
        if ((NIL == forts.fort_p(v_term)) && ((NIL == $allow_vars_in_this_parsing_template$.getDynamicValue(thread)) || (NIL == cycl_grammar.el_variable_p(v_term)))) {
            return NIL;
        }
        if ((function.eql($$TermPOSPair) || function.eql($$NLPattern_Term)) || function.eql($$NLPattern_Term_Optional)) {
            return makeBoolean(((NIL != term.el_fort_p(v_class)) && (((NIL != lexicon_accessors.speech_part_predP(v_class, UNPROVIDED)) || (NIL != lexicon_accessors.speech_partP(v_class, UNPROVIDED))) || (NIL != lexicon_vars.name_string_predP(v_class)))) || ((NIL != $allow_vars_in_this_parsing_template$.getDynamicValue(thread)) && (NIL != cycl_grammar.el_variable_p(v_class))));
        }
        if (function.eql($$NLPattern_TermPred)) {
            return makeBoolean(((NIL != term.el_fort_p(v_class)) && (NIL != isa.isa_in_any_mtP(v_class, $$SpeechPartPredicate))) || ((NIL != $allow_vars_in_this_parsing_template$.getDynamicValue(thread)) && (NIL != cycl_grammar.el_variable_p(v_class))));
        }
        return NIL;
    }

    public static SubLObject valid_rtp_word_itemP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject the_word = NIL;
        SubLObject the_pos = NIL;
        if ((NIL != formula_arityE(obj, TWO_INTEGER, UNPROVIDED)) && cycl_utilities.formula_arg0(obj).eql($$NLPattern_Word)) {
            the_word = cycl_utilities.formula_arg1(obj, UNPROVIDED);
            the_pos = cycl_utilities.formula_arg2(obj, UNPROVIDED);
        } else {
            if (NIL == formula_arityE(obj, ONE_INTEGER, UNPROVIDED)) {
                return NIL;
            }
            the_word = cycl_utilities.formula_arg0(obj);
            the_pos = cycl_utilities.formula_arg1(obj, UNPROVIDED);
        }
        return makeBoolean((((NIL != term.el_fort_p(the_word)) && (NIL != isa.isa_in_any_mtP(the_word, $$LexicalWord))) || ((NIL != $allow_vars_in_this_parsing_template$.getDynamicValue(thread)) && (NIL != cycl_grammar.el_variable_p(the_word)))) && (((NIL != term.el_fort_p(the_pos)) && ((NIL != genls.genl_in_any_mtP(the_pos, $$NLWordForm)) || (NIL != isa.isa_in_any_mtP(the_pos, $$SpeechPartPredicate)))) || ((NIL != $allow_vars_in_this_parsing_template$.getDynamicValue(thread)) && (NIL != cycl_grammar.el_variable_p(the_pos)))));
    }

    public static SubLObject valid_rtp_string_itemP(final SubLObject obj) {
        return makeBoolean(obj.isString() || (NIL != member(obj, isa.all_fort_instances_in_all_mts($$TemplateSententialMarker), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject valid_rtp_accept_one_itemP(final SubLObject obj) {
        return makeBoolean(((NIL != el_formula_p(obj)) && (cycl_utilities.formula_arg0(obj).eql($$RequireOne) || cycl_utilities.formula_arg0(obj).eql($$OptionalOne))) && (NIL != valid_accept_one_argsP(cycl_utilities.formula_args(obj, UNPROVIDED))));
    }

    public static SubLObject valid_accept_one_argsP(final SubLObject args) {
        SubLObject bad_argP = NIL;
        if (NIL == bad_argP) {
            SubLObject csome_list_var = args;
            SubLObject arg = NIL;
            arg = csome_list_var.first();
            while ((NIL == bad_argP) && (NIL != csome_list_var)) {
                if (NIL == valid_accept_one_argP(arg)) {
                    bad_argP = T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == bad_argP);
    }

    public static SubLObject valid_accept_one_argP(final SubLObject arg) {
        return makeBoolean(((((NIL != valid_rtp_string_itemP(arg)) || (NIL != valid_rtp_word_itemP(arg))) || (NIL != valid_rtp_word_sequenceP(arg))) || (NIL != valid_rtp_exact_patternP(arg))) || (NIL != valid_rtp_cyc_term_pairP(arg)));
    }

    public static SubLObject valid_rtp_accept_some_itemP(final SubLObject obj) {
        return makeBoolean(((NIL != el_formula_p(obj)) && (cycl_utilities.formula_arg0(obj).eql($$RequireSome) || cycl_utilities.formula_arg0(obj).eql($$OptionalSome))) && (NIL != valid_accept_some_argsP(cycl_utilities.formula_args(obj, UNPROVIDED))));
    }

    public static SubLObject valid_accept_some_argsP(final SubLObject args) {
        SubLObject bad_argP = NIL;
        if (NIL == bad_argP) {
            SubLObject csome_list_var = args;
            SubLObject arg = NIL;
            arg = csome_list_var.first();
            while ((NIL == bad_argP) && (NIL != csome_list_var)) {
                if (NIL == valid_accept_some_argP(arg)) {
                    bad_argP = T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == bad_argP);
    }

    public static SubLObject valid_accept_some_argP(final SubLObject arg) {
        return makeBoolean(((NIL != valid_rtp_string_itemP(arg)) || (NIL != valid_rtp_word_itemP(arg))) || (NIL != valid_rtp_cyc_term_pairP(arg)));
    }

    public static SubLObject valid_rtp_word_sequenceP(final SubLObject arg) {
        return makeBoolean(((NIL != el_formula_p(arg)) && cycl_utilities.formula_arg0(arg).eql($$WordSequence)) && (NIL != valid_word_sequence_args(cycl_utilities.formula_args(arg, UNPROVIDED))));
    }

    public static SubLObject valid_rtp_exact_patternP(final SubLObject arg) {
        return makeBoolean(((NIL != el_formula_p(arg)) && cycl_utilities.formula_arg0(arg).eql($$NLPattern_Exact)) && (NIL != valid_word_sequence_args(cycl_utilities.formula_args(arg, UNPROVIDED))));
    }

    public static SubLObject valid_word_sequence_args(final SubLObject args) {
        SubLObject bad_argP = NIL;
        if (NIL == bad_argP) {
            SubLObject csome_list_var = args;
            SubLObject arg = NIL;
            arg = csome_list_var.first();
            while ((NIL == bad_argP) && (NIL != csome_list_var)) {
                if (((NIL == valid_rtp_string_itemP(arg)) && (NIL == valid_rtp_word_itemP(arg))) && (NIL == valid_rtp_cyc_term_pairP(arg))) {
                    bad_argP = T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == bad_argP);
    }

    public static SubLObject valid_rtp_recursive_itemP(final SubLObject obj, SubLObject specific_keyword) {
        if (specific_keyword == UNPROVIDED) {
            specific_keyword = NIL;
        }
        if (NIL == el_formula_p(obj)) {
            return values(NIL, NIL);
        }
        SubLObject the_template = NIL;
        SubLObject the_keyword = NIL;
        if ((NIL != formula_arityE(obj, TWO_INTEGER, UNPROVIDED)) && cycl_utilities.formula_arg0(obj).eql($$NLPattern_Template)) {
            the_template = cycl_utilities.formula_arg1(obj, UNPROVIDED);
            the_keyword = cycl_utilities.formula_arg2(obj, UNPROVIDED);
        } else {
            if (NIL == formula_arityE(obj, ONE_INTEGER, UNPROVIDED)) {
                return values(NIL, NIL);
            }
            the_template = cycl_utilities.formula_arg0(obj);
            the_keyword = cycl_utilities.formula_arg1(obj, UNPROVIDED);
        }
        if (((NIL != rtp_template_categoryP(the_template, UNPROVIDED)) && the_keyword.isKeyword()) && ((NIL == specific_keyword) || the_keyword.equal(specific_keyword))) {
            return values(the_template, the_keyword);
        }
        return NIL;
    }

    public static SubLObject valid_rtp_speech_part_itemP(final SubLObject obj) {
        if (NIL == el_formula_p(obj)) {
            return NIL;
        }
        if ((NIL != formula_arityE(obj, TWO_INTEGER, UNPROVIDED)) && cycl_utilities.formula_arg0(obj).eql($$NLPattern_POS)) {
            return makeBoolean(((NIL != forts.fort_p(cycl_utilities.formula_arg2(obj, UNPROVIDED))) && (NIL != lexicon_accessors.speech_partP(cycl_utilities.formula_arg2(obj, UNPROVIDED), UNPROVIDED))) && cycl_utilities.formula_arg1(obj, UNPROVIDED).isKeyword());
        }
        if (NIL != formula_arityE(obj, ONE_INTEGER, UNPROVIDED)) {
            return makeBoolean(((NIL != forts.fort_p(cycl_utilities.formula_arg0(obj))) && (NIL != lexicon_accessors.speech_partP(cycl_utilities.formula_arg0(obj), UNPROVIDED))) && cycl_utilities.formula_arg1(obj, UNPROVIDED).isKeyword());
        }
        return NIL;
    }

    public static SubLObject valid_rtp_agr_pred_itemP(final SubLObject obj) {
        if (NIL == el_formula_p(obj)) {
            return NIL;
        }
        if ((NIL != formula_arityE(obj, TWO_INTEGER, UNPROVIDED)) && cycl_utilities.formula_arg0(obj).eql($$NLPattern_Agr)) {
            return makeBoolean(((NIL != forts.fort_p(cycl_utilities.formula_arg2(obj, UNPROVIDED))) && (NIL != lexicon_vars.nl_agr_predP(cycl_utilities.formula_arg2(obj, UNPROVIDED)))) && cycl_utilities.formula_arg1(obj, UNPROVIDED).isKeyword());
        }
        if (NIL != formula_arityE(obj, ONE_INTEGER, UNPROVIDED)) {
            return makeBoolean(((NIL != forts.fort_p(cycl_utilities.formula_arg0(obj))) && (NIL != lexicon_vars.nl_agr_predP(cycl_utilities.formula_arg0(obj)))) && cycl_utilities.formula_arg1(obj, UNPROVIDED).isKeyword());
        }
        return NIL;
    }

    public static SubLObject declare_rtp_type_checkers_file() {
        declareFunction(me, "clear_rtp_template_categoryP", "CLEAR-RTP-TEMPLATE-CATEGORY?", 0, 0, false);
        declareFunction(me, "remove_rtp_template_categoryP", "REMOVE-RTP-TEMPLATE-CATEGORY?", 1, 1, false);
        declareFunction(me, "rtp_template_categoryP_internal", "RTP-TEMPLATE-CATEGORY?-INTERNAL", 2, 0, false);
        declareFunction(me, "rtp_template_categoryP", "RTP-TEMPLATE-CATEGORY?", 1, 1, false);
        declareFunction(me, "rtp_recursive_itemP", "RTP-RECURSIVE-ITEM?", 1, 0, false);
        declareFunction(me, "recursive_item_template_category", "RECURSIVE-ITEM-TEMPLATE-CATEGORY", 1, 0, false);
        declareFunction(me, "rtp_speech_part_itemP", "RTP-SPEECH-PART-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_nl_agr_pred_itemP", "RTP-NL-AGR-PRED-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_token_itemP", "RTP-TOKEN-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_word_itemP", "RTP-WORD-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_word_pos_itemP", "RTP-WORD-POS-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_word_pos_pred_itemP", "RTP-WORD-POS-PRED-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_word_item_word", "RTP-WORD-ITEM-WORD", 1, 0, false);
        declareFunction(me, "rtp_word_item_syntactic_constraint", "RTP-WORD-ITEM-SYNTACTIC-CONSTRAINT", 1, 0, false);
        declareFunction(me, "new_rtp_word_item", "NEW-RTP-WORD-ITEM", 2, 0, false);
        declareFunction(me, "rtp_optional_some_itemP", "RTP-OPTIONAL-SOME-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_optional_one_itemP", "RTP-OPTIONAL-ONE-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_required_itemP", "RTP-REQUIRED-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_require_some_itemP", "RTP-REQUIRE-SOME-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_require_one_itemP", "RTP-REQUIRE-ONE-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_optional_template_itemP", "RTP-OPTIONAL-TEMPLATE-ITEM?", 1, 0, false);
        declareFunction(me, "optional_template_item", "OPTIONAL-TEMPLATE-ITEM", 1, 0, false);
        declareFunction(me, "rtp_word_sequence_itemP", "RTP-WORD-SEQUENCE-ITEM?", 1, 0, false);
        declareFunction(me, "rtp_rule_terminalP", "RTP-RULE-TERMINAL?", 1, 0, false);
        declareFunction(me, "new_rtp_string_item", "NEW-RTP-STRING-ITEM", 1, 0, false);
        declareFunction(me, "rtp_grouped_itemP", "RTP-GROUPED-ITEM?", 1, 0, false);
        declareFunction(me, "grouped_words", "GROUPED-WORDS", 1, 0, false);
        declareFunction(me, "rtp_cyc_term_item", "RTP-CYC-TERM-ITEM", 1, 0, false);
        declareFunction(me, "valid_rtp_syntactic_constraintP", "VALID-RTP-SYNTACTIC-CONSTRAINT?", 1, 0, false);
        declareFunction(me, "valid_rtp_syntactic_itemP", "VALID-RTP-SYNTACTIC-ITEM?", 1, 0, false);
        declareFunction(me, "slotted_constraint_p", "SLOTTED-CONSTRAINT-P", 1, 0, false);
        declareFunction(me, "valid_rtp_slotted_itemP", "VALID-RTP-SLOTTED-ITEM?", 1, 0, false);
        declareFunction(me, "valid_rtp_cyc_term_pairP", "VALID-RTP-CYC-TERM-PAIR?", 1, 0, false);
        declareFunction(me, "valid_rtp_word_itemP", "VALID-RTP-WORD-ITEM?", 1, 0, false);
        declareFunction(me, "valid_rtp_string_itemP", "VALID-RTP-STRING-ITEM?", 1, 0, false);
        declareFunction(me, "valid_rtp_accept_one_itemP", "VALID-RTP-ACCEPT-ONE-ITEM?", 1, 0, false);
        declareFunction(me, "valid_accept_one_argsP", "VALID-ACCEPT-ONE-ARGS?", 1, 0, false);
        declareFunction(me, "valid_accept_one_argP", "VALID-ACCEPT-ONE-ARG?", 1, 0, false);
        declareFunction(me, "valid_rtp_accept_some_itemP", "VALID-RTP-ACCEPT-SOME-ITEM?", 1, 0, false);
        declareFunction(me, "valid_accept_some_argsP", "VALID-ACCEPT-SOME-ARGS?", 1, 0, false);
        declareFunction(me, "valid_accept_some_argP", "VALID-ACCEPT-SOME-ARG?", 1, 0, false);
        declareFunction(me, "valid_rtp_word_sequenceP", "VALID-RTP-WORD-SEQUENCE?", 1, 0, false);
        declareFunction(me, "valid_rtp_exact_patternP", "VALID-RTP-EXACT-PATTERN?", 1, 0, false);
        declareFunction(me, "valid_word_sequence_args", "VALID-WORD-SEQUENCE-ARGS", 1, 0, false);
        declareFunction(me, "valid_rtp_recursive_itemP", "VALID-RTP-RECURSIVE-ITEM?", 1, 1, false);
        declareFunction(me, "valid_rtp_speech_part_itemP", "VALID-RTP-SPEECH-PART-ITEM?", 1, 0, false);
        declareFunction(me, "valid_rtp_agr_pred_itemP", "VALID-RTP-AGR-PRED-ITEM?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rtp_type_checkers_file() {
        defparameter("*ALLOW-VARS-IN-THIS-PARSING-TEMPLATE*", T);
        deflexical("*RTP-TEMPLATE-CATEGORY?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_rtp_type_checkers_file() {
        memoization_state.note_globally_cached_function($sym1$RTP_TEMPLATE_CATEGORY_);
        return NIL;
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

    
}

/**
 * Total time: 103 ms
 */
