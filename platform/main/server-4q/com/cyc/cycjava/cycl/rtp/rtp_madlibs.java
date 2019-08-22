package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.pph_functions;
import com.cyc.cycjava.cycl.pph_methods;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rtp_madlibs extends SubLTranslatedFile {
    public static final SubLFile me = new rtp_madlibs();

    public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_madlibs";

    public static final String myFingerPrint = "0decf2a5592c6b7a21007505a46bc2b752058cdd8f8268b9143cc4fa2ed7c727";



    private static final SubLObject $$assertTemplate_Reln = reader_make_constant_shell(makeString("assertTemplate-Reln"));

    private static final SubLObject $$queryTemplate_Reln = reader_make_constant_shell(makeString("queryTemplate-Reln"));

    public static final SubLList $list2 = list(makeSymbol("PRED"), makeSymbol("TEMPLATE-TYPE"), makeSymbol("RELN"), makeSymbol("SYNTAX"), makeSymbol("SEMANTICS"));

    public static final SubLString $str3$MAD_LIBS_NOTE__temporarily_puntin = makeString("MAD LIBS NOTE: temporarily punting cases where semantics' arg0 isn't the reln");



    private static final SubLObject $$CycLSentence_Assertible = reader_make_constant_shell(makeString("CycLSentence-Assertible"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    public static final SubLSymbol MADLIB_GET_INSTANCES = makeSymbol("MADLIB-GET-INSTANCES");

    private static final SubLObject $$PositiveInteger = reader_make_constant_shell(makeString("PositiveInteger"));

    private static final SubLObject $$PositiveNumber = reader_make_constant_shell(makeString("PositiveNumber"));

    private static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLSymbol GENERATE_RANDOM_NONZERO_NUMBER = makeSymbol("GENERATE-RANDOM-NONZERO-NUMBER");



    private static final SubLObject $$NonNegativeInteger = reader_make_constant_shell(makeString("NonNegativeInteger"));

    private static final SubLObject $$NonNegativeNumber = reader_make_constant_shell(makeString("NonNegativeNumber"));

    public static final SubLSymbol RANDOM = makeSymbol("RANDOM");



    private static final SubLObject $$GenericInstanceFn = reader_make_constant_shell(makeString("GenericInstanceFn"));

    public static final SubLSymbol $madlib_get_instances_caching_state$ = makeSymbol("*MADLIB-GET-INSTANCES-CACHING-STATE*");

    private static final SubLList $list21 = list(makeSymbol("SYNTAX"), makeSymbol("SEMANTICS"));

    private static final SubLObject $$NLPatternList = reader_make_constant_shell(makeString("NLPatternList"));

    private static final SubLObject $$NPTemplate = reader_make_constant_shell(makeString("NPTemplate"));

    private static final SubLObject $$City = reader_make_constant_shell(makeString("City"));

    private static final SubLObject $$County = reader_make_constant_shell(makeString("County"));

    private static final SubLObject $$STemplate = reader_make_constant_shell(makeString("STemplate"));

    private static final SubLObject $$SomeExampleFn = reader_make_constant_shell(makeString("SomeExampleFn"));

    private static final SubLObject $$NumberTemplate = reader_make_constant_shell(makeString("NumberTemplate"));

    private static final SubLObject $$NLPattern_Term = reader_make_constant_shell(makeString("NLPattern-Term"));

    private static final SubLObject $$posPredForTemplateCategory = reader_make_constant_shell(makeString("posPredForTemplateCategory"));

    private static final SubLObject $$TemplateParsingMt = reader_make_constant_shell(makeString("TemplateParsingMt"));

    private static final SubLObject $$NLPattern_Word = reader_make_constant_shell(makeString("NLPattern-Word"));

    private static final SubLObject $$TemplateSententialMarker = reader_make_constant_shell(makeString("TemplateSententialMarker"));

    private static final SubLList $list34 = list(makeSymbol("FUNC"), makeSymbol("TERM"));

    private static final SubLList $list35 = list(makeSymbol("FUNC"), makeSymbol("WORD"), makeSymbol("POS"));

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLObject $$infinitive = reader_make_constant_shell(makeString("infinitive"));

    private static final SubLObject $$SpeechPartPredicate = reader_make_constant_shell(makeString("SpeechPartPredicate"));

    public static final SubLList $list39 = list(reader_make_constant_shell(makeString("simplePresent-Generic")), reader_make_constant_shell(makeString("simplePast-Generic")));

    private static final SubLObject $$ThirdPerson_NLAttr = reader_make_constant_shell(makeString("ThirdPerson-NLAttr"));

    private static final SubLObject $$Singular_NLAttr = reader_make_constant_shell(makeString("Singular-NLAttr"));

    private static final SubLObject $$thirdPersonSg_Generic = reader_make_constant_shell(makeString("thirdPersonSg-Generic"));

    public static SubLObject rtp_madlibs_formula_p(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != el_formula_p(formula)) {
            final SubLObject operator = cycl_utilities.formula_operator(formula);
            return makeBoolean((NIL != forts.fort_p(operator)) && ((NIL != genl_predicates.genl_predicateP(operator, $$assertTemplate_Reln, mt, UNPROVIDED)) || (NIL != genl_predicates.genl_predicateP(operator, $$queryTemplate_Reln, mt, UNPROVIDED))));
        }
        return NIL;
    }

    public static SubLObject rtp_generate_madlibs_via_defn(final SubLObject passed) {
        return rtp_generate_madlibs(cycl_utilities.formula_arg1(passed, UNPROVIDED), cycl_utilities.formula_arg2(passed, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject rtp_generate_madlibs(final SubLObject spec, final SubLObject this_many, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = (NIL != assertion_handles.assertion_p(spec)) ? assertions_high.assertion_formula(spec) : spec;
        if (NIL == rtp_madlibs_formula_p(formula, mt)) {
            return NIL;
        }
        final SubLObject ret_pairs = set.new_set(symbol_function(EQUALP), this_many);
        SubLObject current;
        final SubLObject datum = current = formula;
        SubLObject pred = NIL;
        SubLObject template_type = NIL;
        SubLObject reln = NIL;
        SubLObject syntax = NIL;
        SubLObject semantics = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        template_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        syntax = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        semantics = current.first();
        current = current.rest();
        if (NIL == current) {
            if (!cycl_utilities.formula_arg0(semantics).equal(reln)) {
                Errors.warn($str3$MAD_LIBS_NOTE__temporarily_puntin);
                return NIL;
            }
            final SubLObject keywords_found = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject reln_arity = arity.arity(reln);
            SubLObject number = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(semantics, $IGNORE);
            SubLObject this_key = NIL;
            this_key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                number = add(number, ONE_INTEGER);
                if (this_key.isKeyword()) {
                    dictionary.dictionary_enter(keywords_found, number, this_key);
                }
                cdolist_list_var = cdolist_list_var.rest();
                this_key = cdolist_list_var.first();
            } 
            if (reln_arity.numE(ZERO_INTEGER)) {
                reln_arity = max(dictionary.dictionary_keys(keywords_found), EMPTY_SUBL_OBJECT_ARRAY);
            }
            SubLObject i;
            SubLObject synsem_pair;
            SubLObject this_arg;
            SubLObject the_syn;
            SubLObject the_sem;
            for (i = NIL, i = ZERO_INTEGER; i.numL(this_many); i = add(i, ONE_INTEGER)) {
                synsem_pair = list(syntax, semantics);
                cdolist_list_var = dictionary.dictionary_keys(keywords_found);
                this_arg = NIL;
                this_arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    the_syn = madlib_prep(synsem_pair, dictionary.dictionary_lookup(keywords_found, this_arg, UNPROVIDED), NIL != subl_promotions.memberP($$CycLSentence_Assertible, kb_accessors.argn_isa(reln, this_arg, UNPROVIDED), UNPROVIDED, UNPROVIDED) ? madlib_random_sentence_for_reln(reln, this_arg) : list_utilities.random_element(madlib_get_instances(kb_accessors.argn_isa(reln, this_arg, UNPROVIDED), kb_accessors.argn_genl(reln, this_arg, UNPROVIDED), mt)));
                    the_sem = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    synsem_pair = list(the_syn, the_sem);
                    cdolist_list_var = cdolist_list_var.rest();
                    this_arg = cdolist_list_var.first();
                } 
                set.set_add(list(madlib_complete(synsem_pair.first(), UNPROVIDED), second(synsem_pair)), ret_pairs);
            }
        } else {
            cdestructuring_bind_error(datum, $list2);
        }
        return ret_pairs;
    }

    public static SubLObject madlib_random_sentence_for_reln(final SubLObject reln, final SubLObject arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject the_extent = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            the_extent = kb_mapping.gather_predicate_extent_index(reln, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != list_utilities.proper_list_p(the_extent)) {
            return cycl_utilities.formula_arg(assertions_high.assertion_formula(list_utilities.random_element(the_extent)), arg, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject madlib_list_of_n_numbers_using(final SubLObject n, final SubLObject the_func, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = $int$100;
        }
        SubLObject numbers = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            numbers = cons(funcall(the_func, limit), numbers);
        }
        return numbers;
    }

    public static SubLObject clear_madlib_get_instances() {
        final SubLObject cs = $madlib_get_instances_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_madlib_get_instances(final SubLObject isas, final SubLObject v_genls, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($madlib_get_instances_caching_state$.getGlobalValue(), list(isas, v_genls, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject madlib_get_instances_internal(SubLObject isas, SubLObject v_genls, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != subl_promotions.memberP($$PositiveInteger, isas, UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP($$PositiveNumber, isas, UNPROVIDED, UNPROVIDED))) {
            return list_utilities.flatten(list(madlib_list_of_n_numbers_using($int$30, symbol_function(GENERATE_RANDOM_NONZERO_NUMBER), FIVE_INTEGER), madlib_list_of_n_numbers_using(FIVE_INTEGER, symbol_function(GENERATE_RANDOM_NONZERO_NUMBER), $int$1000)));
        }
        if ((NIL != subl_promotions.memberP($$NonNegativeInteger, isas, UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP($$NonNegativeNumber, isas, UNPROVIDED, UNPROVIDED))) {
            return list_utilities.flatten(list(madlib_list_of_n_numbers_using($int$30, symbol_function(RANDOM), FIVE_INTEGER), madlib_list_of_n_numbers_using(FIVE_INTEGER, symbol_function(RANDOM), $int$1000)));
        }
        isas = cardinality_estimates.sort_by_generality_estimate(isas, $ASCENDING);
        if (NIL != v_genls) {
            v_genls = cardinality_estimates.sort_by_generality_estimate(v_genls, $ASCENDING);
        }
        final SubLObject tmp = (mt.eql($$EverythingPSC) || mt.eql(pph_vars.$pph_domain_mt$.getDynamicValue(thread))) ? isa.all_fort_instances_in_all_mts(isas.first()) : isa.instances(isas.first(), mt, UNPROVIDED);
        SubLObject tmp_list = NIL;
        final SubLObject single_isasP = numE(length(isas), ONE_INTEGER);
        SubLObject cdolist_list_var = tmp;
        SubLObject this_isa = NIL;
        this_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL != single_isasP) || (NIL != isa.all_isaP(this_isa, isas.rest(), mt, UNPROVIDED))) && ((NIL == v_genls) || (NIL != isa.all_isaP(this_isa, v_genls, mt, UNPROVIDED)))) {
                tmp_list = cons(this_isa, tmp_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_isa = cdolist_list_var.first();
        } 
        return NIL != tmp_list ? tmp_list : list(list($$GenericInstanceFn, NIL != list_utilities.proper_list_p(v_genls) ? v_genls.first() : isas.first()));
    }

    public static SubLObject madlib_get_instances(final SubLObject isas, final SubLObject v_genls, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        SubLObject caching_state = $madlib_get_instances_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MADLIB_GET_INSTANCES, $madlib_get_instances_caching_state$, NIL, EQUALP, THREE_INTEGER, EIGHT_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(isas, v_genls, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (isas.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_genls.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equalp(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(madlib_get_instances_internal(isas, v_genls, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(isas, v_genls, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject madlib_prep(final SubLObject pair, final SubLObject keyword, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!pair.isList()) || (!pair.first().isList())) {
            return pair;
        }
        SubLObject syntax = NIL;
        SubLObject semantics = NIL;
        destructuring_bind_must_consp(pair, pair, $list21);
        syntax = pair.first();
        SubLObject current = pair.rest();
        destructuring_bind_must_consp(current, pair, $list21);
        semantics = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = syntax;
            SubLObject branch = NIL;
            branch = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!branch.eql($$NLPatternList)) {
                    if (!branch.isList()) {
                        result = cons(branch, result);
                    } else
                        if (NIL != rtp_type_checkers.valid_rtp_slotted_itemP(branch)) {
                            SubLObject cdolist_list_var_$1;
                            final SubLObject args = cdolist_list_var_$1 = cycl_utilities.formula_args(branch, $IGNORE);
                            SubLObject this_twig = NIL;
                            this_twig = cdolist_list_var_$1.first();
                            while (NIL != cdolist_list_var_$1) {
                                thread.resetMultipleValues();
                                final SubLObject the_syn = madlib_prep(list(list(this_twig), semantics), keyword, v_term);
                                final SubLObject the_sem = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject cdolist_list_var_$2 = the_syn;
                                SubLObject this_syn = NIL;
                                this_syn = cdolist_list_var_$2.first();
                                while (NIL != cdolist_list_var_$2) {
                                    result = cons(this_syn, result);
                                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                    this_syn = cdolist_list_var_$2.first();
                                } 
                                semantics = the_sem;
                                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                this_twig = cdolist_list_var_$1.first();
                            } 
                        } else
                            if (NIL != rtp_type_checkers.valid_rtp_recursive_itemP(branch, keyword)) {
                                final SubLObject template = rtp_type_checkers.recursive_item_template_category(branch);
                                if (template.eql($$NPTemplate)) {
                                    if (NIL != pph_utilities.pph_isaP(v_term, $$City, UNPROVIDED)) {
                                        result = cons(make_unary_formula(pph_functions.termparaphrasefn_citywithstateorprovinceabbreviation(), v_term), result);
                                    } else
                                        if (NIL != pph_utilities.pph_isaP(v_term, $$County, UNPROVIDED)) {
                                            result = cons(make_unary_formula(pph_functions.termparaphrasefn_countywithstateorprovincename(), v_term), result);
                                        } else {
                                            result = cons(make_unary_formula(pph_functions.termparaphrasefn_np(), v_term), result);
                                        }

                                } else
                                    if (template.eql($$STemplate)) {
                                        if (NIL != v_term) {
                                            result = cons(make_unary_formula(pph_functions.termparaphrasefn(), v_term), result);
                                        } else {
                                            result = cons(make_unary_formula(pph_functions.termparaphrasefn(), list($$SomeExampleFn, $$STemplate)), result);
                                        }
                                    } else
                                        if (template.eql($$NumberTemplate)) {
                                            result = cons(make_unary_formula(pph_functions.termparaphrasefn(), v_term), result);
                                        } else {
                                            result = cons(cons($$NLPattern_Term, list(v_term, cycl_utilities.formula_arg1(assertions_high.assertion_formula(kb_mapping.gather_gaf_arg_index(template, TWO_INTEGER, $$posPredForTemplateCategory, $$TemplateParsingMt, UNPROVIDED).first()), UNPROVIDED))), result);
                                        }


                            } else
                                if (NIL != rtp_type_checkers.rtp_word_itemP(branch)) {
                                    result = cons(cons($$NLPattern_Word, branch), result);
                                } else
                                    if (cycl_utilities.formula_arg0(branch).eql($$NLPattern_Word)) {
                                        result = cons(branch, result);
                                    } else
                                        if (NIL != rtp_type_checkers.optional_template_item(branch)) {
                                            SubLObject relevant = NIL;
                                            SubLObject cdolist_list_var_$3 = cycl_utilities.formula_args(branch, UNPROVIDED);
                                            SubLObject this_option = NIL;
                                            this_option = cdolist_list_var_$3.first();
                                            while (NIL != cdolist_list_var_$3) {
                                                if (NIL == pph_utilities.pph_isaP(this_option, $$TemplateSententialMarker, UNPROVIDED)) {
                                                    relevant = cons(this_option, relevant);
                                                }
                                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                                this_option = cdolist_list_var_$3.first();
                                            } 
                                            if (NIL != relevant) {
                                                result = cons(madlib_prep(list(cons(cycl_utilities.formula_arg0(branch), relevant), semantics), keyword, v_term), result);
                                            }
                                        } else {
                                            result = cons(branch, result);
                                        }





                }
                cdolist_list_var = cdolist_list_var.rest();
                branch = cdolist_list_var.first();
            } 
            return values(reverse(result), substitute(v_term, keyword, semantics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        cdestructuring_bind_error(pair, $list21);
        return NIL;
    }

    public static SubLObject madlib_complete(final SubLObject this_template, SubLObject nested) {
        if (nested == UNPROVIDED) {
            nested = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject for_gen = (NIL != nested) ? NIL : list(pph_functions.concatenatephrasesfn());
        SubLObject found_tensed_verbP = NIL;
        SubLObject main_subject_guess = NIL;
        if (NIL == nested) {
            final SubLObject terms = cycl_utilities.formula_terms(this_template, $IGNORE);
            SubLObject rest;
            SubLObject this_item;
            SubLObject current;
            SubLObject datum;
            SubLObject func;
            SubLObject v_term;
            for (rest = NIL, rest = terms; (NIL == main_subject_guess) && (NIL != rest); rest = rest.rest()) {
                this_item = rest.first();
                if (this_item.isList() && (NIL != list_utilities.lengthE(this_item, TWO_INTEGER, UNPROVIDED))) {
                    datum = current = this_item;
                    func = NIL;
                    v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list34);
                    func = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list34);
                    v_term = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (func.eql(pph_functions.termparaphrasefn_np())) {
                            main_subject_guess = v_term;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list34);
                    }
                }
            }
        }
        SubLObject cdolist_list_var = this_template;
        SubLObject this_item2 = NIL;
        this_item2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (this_item2.isString()) {
                if (NIL == pph_utilities.pph_final_punctuation_string_p(this_item2)) {
                    for_gen = cons(make_unary_formula(pph_functions.bestnlphraseofstringfn(), this_item2), for_gen);
                }
            } else
                if (NIL == pph_utilities.pph_isaP(this_item2, $$TemplateSententialMarker, UNPROVIDED)) {
                    if (NIL != rtp_type_checkers.rtp_word_sequence_itemP(this_item2)) {
                        if (NIL != nested) {
                            SubLObject the_sequence = NIL;
                            SubLObject the_completion = NIL;
                            SubLObject cdolist_list_var_$4 = cycl_utilities.formula_args(this_item2, UNPROVIDED);
                            SubLObject this_bit = NIL;
                            this_bit = cdolist_list_var_$4.first();
                            while (NIL != cdolist_list_var_$4) {
                                the_completion = madlib_complete(NIL != rtp_type_checkers.rtp_word_itemP(this_bit) ? cons($$NLPattern_Word, this_bit) : list(this_bit), T).first();
                                if (NIL != the_completion) {
                                    the_sequence = cons(the_completion, the_sequence);
                                }
                                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                this_bit = cdolist_list_var_$4.first();
                            } 
                            return the_sequence;
                        }
                        SubLObject the_completion2 = NIL;
                        SubLObject cdolist_list_var_$5 = cycl_utilities.formula_args(this_item2, UNPROVIDED);
                        SubLObject this_bit2 = NIL;
                        this_bit2 = cdolist_list_var_$5.first();
                        while (NIL != cdolist_list_var_$5) {
                            the_completion2 = madlib_complete(NIL != rtp_type_checkers.rtp_word_itemP(this_bit2) ? cons($$NLPattern_Word, this_bit2) : list(this_bit2), T).first();
                            if (NIL != the_completion2) {
                                for_gen = cons(the_completion2, for_gen);
                            }
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            this_bit2 = cdolist_list_var_$5.first();
                        } 
                    } else
                        if (cycl_utilities.formula_arg0(this_item2).eql(pph_functions.termparaphrasefn_np())) {
                            for_gen = cons(this_item2, for_gen);
                        } else
                            if (NIL != rtp_type_checkers.rtp_cyc_term_item(this_item2)) {
                                for_gen = cons(make_binary_formula(pph_functions.termparaphrasefn_constrained(), madlib_complete_choose_pospred(cycl_utilities.formula_arg2(this_item2, UNPROVIDED)), cycl_utilities.formula_arg1(this_item2, UNPROVIDED)), for_gen);
                            } else
                                if (cycl_utilities.formula_arg0(this_item2).eql($$NLPattern_Word)) {
                                    SubLObject current2;
                                    final SubLObject datum2 = current2 = this_item2;
                                    SubLObject func2 = NIL;
                                    SubLObject word = NIL;
                                    SubLObject pos = NIL;
                                    destructuring_bind_must_consp(current2, datum2, $list35);
                                    func2 = current2.first();
                                    current2 = current2.rest();
                                    destructuring_bind_must_consp(current2, datum2, $list35);
                                    word = current2.first();
                                    current2 = current2.rest();
                                    destructuring_bind_must_consp(current2, datum2, $list35);
                                    pos = current2.first();
                                    current2 = current2.rest();
                                    if (NIL == current2) {
                                        final SubLObject the_pred = madlib_complete_choose_pospred(pos);
                                        if ((NIL != found_tensed_verbP) && (NIL != pph_utilities.pph_genlP(pos, $$Verb, UNPROVIDED))) {
                                            for_gen = cons(make_binary_formula(pph_functions.bestnlwordformoflexemefn_constrained(), $$infinitive, word), for_gen);
                                        } else
                                            if (NIL != pph_utilities.pph_genlP(pos, $$Verb, UNPROVIDED)) {
                                                for_gen = cons(make_binary_formula(pph_functions.bestnlwordformoflexemefn_constrained(), madlib_best_pred_for_term_and_tense(main_subject_guess, the_pred), word), for_gen);
                                                found_tensed_verbP = T;
                                            } else {
                                                for_gen = cons(make_binary_formula(pph_functions.bestnlwordformoflexemefn_constrained(), the_pred, cycl_utilities.formula_arg1(this_item2, UNPROVIDED)), for_gen);
                                            }

                                    } else {
                                        cdestructuring_bind_error(datum2, $list35);
                                    }
                                } else
                                    if (NIL != rtp_type_checkers.rtp_word_itemP(this_item2)) {
                                        thread.resetMultipleValues();
                                        final SubLObject main_result = madlib_complete(list(cons($$NLPattern_Word, this_item2)), T);
                                        final SubLObject found_verbP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        for_gen = cons(main_result.first(), for_gen);
                                        if (NIL != found_verbP) {
                                            found_tensed_verbP = T;
                                        }
                                    } else
                                        if (NIL != rtp_type_checkers.rtp_optional_template_itemP(this_item2)) {
                                            if (random.random(TWO_INTEGER).numE(ZERO_INTEGER)) {
                                                final SubLObject chosen = cycl_utilities.formula_arg(this_item2, number_utilities.f_1X(random.random(formula_arity(this_item2, UNPROVIDED))), UNPROVIDED);
                                                thread.resetMultipleValues();
                                                final SubLObject returned = madlib_complete(list(chosen), T);
                                                final SubLObject verbP = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != rtp_type_checkers.rtp_word_sequence_itemP(chosen)) {
                                                    SubLObject cdolist_list_var_$6 = reverse(returned);
                                                    SubLObject this_bit3 = NIL;
                                                    this_bit3 = cdolist_list_var_$6.first();
                                                    while (NIL != cdolist_list_var_$6) {
                                                        for_gen = cons(this_bit3, for_gen);
                                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                                        this_bit3 = cdolist_list_var_$6.first();
                                                    } 
                                                } else {
                                                    for_gen = cons(returned.first(), for_gen);
                                                }
                                                if (NIL != verbP) {
                                                    found_tensed_verbP = T;
                                                }
                                            }
                                        } else
                                            if (NIL != rtp_type_checkers.rtp_required_itemP(this_item2)) {
                                                final SubLObject chosen = cycl_utilities.formula_arg(this_item2, number_utilities.f_1X(random.random(formula_arity(this_item2, UNPROVIDED))), UNPROVIDED);
                                                thread.resetMultipleValues();
                                                final SubLObject returned = madlib_complete(list(chosen), T);
                                                final SubLObject verbP = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != rtp_type_checkers.rtp_word_sequence_itemP(chosen)) {
                                                    SubLObject cdolist_list_var_$7 = reverse(returned);
                                                    SubLObject this_bit3 = NIL;
                                                    this_bit3 = cdolist_list_var_$7.first();
                                                    while (NIL != cdolist_list_var_$7) {
                                                        for_gen = cons(this_bit3, for_gen);
                                                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                                        this_bit3 = cdolist_list_var_$7.first();
                                                    } 
                                                } else {
                                                    for_gen = cons(returned.first(), for_gen);
                                                }
                                                if (NIL != verbP) {
                                                    found_tensed_verbP = T;
                                                }
                                            } else {
                                                for_gen = cons(this_item2, for_gen);
                                            }






                }

            cdolist_list_var = cdolist_list_var.rest();
            this_item2 = cdolist_list_var.first();
        } 
        if (NIL == nested) {
            main_subject_guess = NIL;
        }
        return values(reverse(for_gen), found_tensed_verbP);
    }

    public static SubLObject madlib_complete_choose_pospred(final SubLObject pos) {
        if (NIL != isa.isa_in_any_mtP(pos, $$SpeechPartPredicate)) {
            return pos;
        }
        if (NIL != pph_utilities.pph_genlP(pos, $$Verb, UNPROVIDED)) {
            return list_utilities.random_element($list39);
        }
        return pos;
    }

    public static SubLObject madlib_best_pred_for_term_and_tense(final SubLObject v_term, final SubLObject tense) {
        if (pph_methods.pph_person(v_term).eql($$ThirdPerson_NLAttr) && pph_methods.pph_number(v_term).eql($$Singular_NLAttr)) {
            return pph_utilities.pph_unify_speech_part_preds(list($$thirdPersonSg_Generic, tense));
        }
        return tense;
    }

    public static SubLObject declare_rtp_madlibs_file() {
        declareFunction(me, "rtp_madlibs_formula_p", "RTP-MADLIBS-FORMULA-P", 1, 1, false);
        declareFunction(me, "rtp_generate_madlibs_via_defn", "RTP-GENERATE-MADLIBS-VIA-DEFN", 1, 0, false);
        declareFunction(me, "rtp_generate_madlibs", "RTP-GENERATE-MADLIBS", 2, 1, false);
        declareFunction(me, "madlib_random_sentence_for_reln", "MADLIB-RANDOM-SENTENCE-FOR-RELN", 2, 0, false);
        declareFunction(me, "madlib_list_of_n_numbers_using", "MADLIB-LIST-OF-N-NUMBERS-USING", 2, 1, false);
        declareFunction(me, "clear_madlib_get_instances", "CLEAR-MADLIB-GET-INSTANCES", 0, 0, false);
        declareFunction(me, "remove_madlib_get_instances", "REMOVE-MADLIB-GET-INSTANCES", 2, 1, false);
        declareFunction(me, "madlib_get_instances_internal", "MADLIB-GET-INSTANCES-INTERNAL", 3, 0, false);
        declareFunction(me, "madlib_get_instances", "MADLIB-GET-INSTANCES", 2, 1, false);
        declareFunction(me, "madlib_prep", "MADLIB-PREP", 3, 0, false);
        declareFunction(me, "madlib_complete", "MADLIB-COMPLETE", 1, 1, false);
        declareFunction(me, "madlib_complete_choose_pospred", "MADLIB-COMPLETE-CHOOSE-POSPRED", 1, 0, false);
        declareFunction(me, "madlib_best_pred_for_term_and_tense", "MADLIB-BEST-PRED-FOR-TERM-AND-TENSE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rtp_madlibs_file() {
        deflexical("*MADLIB-GET-INSTANCES-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_rtp_madlibs_file() {
        memoization_state.note_globally_cached_function(MADLIB_GET_INSTANCES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rtp_madlibs_file();
    }

    @Override
    public void initializeVariables() {
        init_rtp_madlibs_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rtp_madlibs_file();
    }

    
}

/**
 * Total time: 137 ms
 */
