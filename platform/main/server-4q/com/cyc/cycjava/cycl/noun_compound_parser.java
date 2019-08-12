/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.nl_stats.verb_argument_lookups;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NOUN-COMPOUND-PARSER
 * source file: /cyc/top/cycl/noun-compound-parser.lisp
 * created:     2019/07/03 17:38:24
 */
public final class noun_compound_parser extends SubLTranslatedFile implements V12 {
    public static final SubLObject remove_ncp_preds_of_pos_count(SubLObject pos) {
	return memoization_state.caching_state_remove_function_results_with_args($ncp_preds_of_pos_count_caching_state$.getGlobalValue(), list(pos), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject remove_ncp_count_pos_assertions_cached(SubLObject pos) {
	return memoization_state.caching_state_remove_function_results_with_args($ncp_count_pos_assertions_cached_caching_state$.getGlobalValue(), list(pos), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param STRINGP
     * 		- the verb root we want, e.g., processing
     * @param STRINGP
     * 		- the corresponding noun root, e.g., data; compounds are allowed, but tend to not get results
     * @param KEYWORD
     * 		- the role we want, i.e., :subj or :obj
     * @return values LIST SCORE ; a LIST of viable nauts using the best match of noun to verb, SCORE is of that comparison
     * @unknown the noun string can be null, in which case the @see typical-arg is used
     */
    @LispMethod(comment = "@param STRINGP\r\n\t\t- the verb root we want, e.g., processing\r\n@param STRINGP\r\n\t\t- the corresponding noun root, e.g., data; compounds are allowed, but tend to not get results\r\n@param KEYWORD\r\n\t\t- the role we want, i.e., :subj or :obj\r\n@return values LIST SCORE ; a LIST of viable nauts using the best match of noun to verb, SCORE is of that comparison\r\n@unknown the noun string can be null, in which case the @see typical-arg is used")
    public static final SubLObject rbp_generate_nauts_via_pointwise_analysis(SubLObject verb, SubLObject noun, SubLObject relation) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(verb, STRINGP);
	    if (NIL != noun) {
		SubLTrampolineFile.checkType(noun, STRINGP);
	    }
	    SubLTrampolineFile.checkType(relation, KEYWORDP);
	    {
		SubLObject best_col = NIL;
		SubLObject best_score = ZERO_INTEGER;
		SubLObject answers = NIL;
		{
		    SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
		    try {
			lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($ON, thread);
			{
			    SubLObject cdolist_list_var = (NIL == noun) ? ((SubLObject) (verb_argument_lookups.typical_arg(verb, relation, UNPROVIDED))) : lexicon_accessors.denots_of_stringXpos(noun, $NOUN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    SubLObject this_col = NIL;
			    for (this_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), this_col = cdolist_list_var.first()) {
				if (NIL != fort_types_interface.collection_p(this_col)) {
				    {
					SubLObject this_score = verb_argument_lookups.adjusted_pointwise_mutual_information(verb, this_col, relation);
					if (((NIL != this_score) && this_score.numG(ZERO_INTEGER)) && this_score.numG(best_score)) {
					    best_col = this_col;
					    best_score = this_score;
					}
				    }
				}
			    }
			}
		    } finally {
			lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
		    }
		}
		if (NIL == fort_types_interface.collection_p(best_col)) {
		    return values(NIL, NIL);
		}
		{
		    SubLObject grammatical_pred = (relation.eql($SUBJ)) ? ((SubLObject) ($$playsActiveSubjectRole)) : $$patient_GenericDirect;
		    SubLObject motivation = (relation.eql($SUBJ)) ? ((SubLObject) ($$$best_statistical_subject)) : $$$best_statistical_object;
		    SubLObject cdolist_list_var = lexicon_accessors.denots_of_stringXpos(verb, $VERB, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    SubLObject verbal_denot = NIL;
		    for (verbal_denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), verbal_denot = cdolist_list_var.first()) {
			{
			    SubLObject cdolist_list_var_76 = ncp_ask_variable($sym361$_PRED, list($$and, listS($$keStrongSuggestionPreds, verbal_denot, $list_alt363), list($$genlPreds, $sym361$_PRED, grammatical_pred)), $$InferencePSC, UNPROVIDED);
			    SubLObject this_pred = NIL;
			    for (this_pred = cdolist_list_var_76.first(); NIL != cdolist_list_var_76; cdolist_list_var_76 = cdolist_list_var_76.rest(), this_pred = cdolist_list_var_76.first()) {
				{
				    SubLObject this_naut = list($const359$SubcollectionOfWithRelationToType, verbal_denot, this_pred, best_col);
				    if ((NIL != rbp_wff.rbp_wf_natP(this_naut, TWO_INTEGER)) && (NIL != rbp_wff.rbp_wf_natP(this_naut, ONE_INTEGER))) {
					if (NIL == rbp_fails_wff_workaroundsP($FALLBACK, this_naut, UNPROVIDED)) {
					    answers = cons(list(this_naut, motivation), answers);
					}
				    }
				}
			    }
			}
		    }
		}
		if (NIL == answers) {
		    return values(NIL, NIL);
		}
		return values(parsing_utilities.eliminate_genl_subcollection_nauts(answers), best_score);
	    }
	}
    }

    public static final SubLObject rbp_deverbal_fallback(SubLObject string) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL != just_one_spaceP(string)) && (NIL != rbp_deverbal_candidateP(string))) {
		{
		    SubLObject exploded = string_utilities.split_string(string, UNPROVIDED);
		    if (NIL == list_utilities.lengthE(exploded, TWO_INTEGER, UNPROVIDED)) {
			return NIL;
		    }
		    {
			SubLObject datum = exploded;
			SubLObject current = datum;
			SubLObject mod = NIL;
			SubLObject head = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt323);
			mod = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt323);
			head = current.first();
			current = current.rest();
			if (NIL == current) {
			    if (!((NIL != list_utilities.lengthE(mod, ONE_INTEGER, UNPROVIDED)) || (NIL != list_utilities.lengthE(head, ONE_INTEGER, UNPROVIDED)))) {
				{
				    SubLObject the_root = rbp_get_deverbal_root(head, UNPROVIDED);
				    if (NIL == lexicon_accessors.denots_of_stringXpos(the_root, $VERB, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
					return values(NIL, NIL);
				    }
				    thread.resetMultipleValues();
				    {
					SubLObject object_nauts = rbp_generate_nauts_via_pointwise_analysis(the_root, mod, $SUBJ);
					SubLObject object_score = thread.secondMultipleValue();
					thread.resetMultipleValues();
					thread.resetMultipleValues();
					{
					    SubLObject subject_nauts = rbp_generate_nauts_via_pointwise_analysis(the_root, mod, $OBJ);
					    SubLObject subject_score = thread.secondMultipleValue();
					    thread.resetMultipleValues();
					    if ((NIL == subject_nauts) && (NIL == object_nauts)) {
						return values(NIL, NIL);
					    } else {
						if ((NIL != object_score) && ((NIL == subject_score) || object_score.numGE(subject_score))) {
						    return values(object_nauts, object_score);
						} else {
						    return values(subject_nauts, subject_score);
						}
					    }
					}
				    }
				}
			    }
			} else {
			    cdestructuring_bind_error(datum, $list_alt323);
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject rbp_cncb_reset() {
	$rbp_cncb_calls$.setGlobalValue(ZERO_INTEGER);
	$rbp_cncb_calls_redundant$.setGlobalValue(ZERO_INTEGER);
	$rbp_cncb_calls_backwards$.setGlobalValue(ZERO_INTEGER);
	$rbp_cncb_hash$.setGlobalValue(make_hash_table($int$1024, symbol_function(EQUALP), UNPROVIDED));
	return $rbp_cncb_calls$.getGlobalValue();
    }

    public static final SubLObject rbp_cncb_report() {
	format(T, $str_alt82$__COMBINE_NOUN_COMPOUND_BLOCKS_wa, $rbp_cncb_calls$.getGlobalValue());
	if ($rbp_cncb_calls_redundant$.getGlobalValue().isPositive()) {
	    format(T, $str_alt83$_____D_of_which_were_repeats_of_p, $rbp_cncb_calls_redundant$.getGlobalValue(), $rbp_cncb_calls_backwards$.getGlobalValue().isPositive() ? ((SubLObject) ($str_alt84$__and)) : $str_alt85$);
	}
	if ($rbp_cncb_calls_backwards$.getGlobalValue().isPositive()) {
	    format(T, $str_alt86$____D_of_which_were_non_adjacent_, $rbp_cncb_calls_backwards$.getGlobalValue());
	}
	princ($str_alt87$_, T);
	return T;
    }

    public static final SubLObject proper_noun_genls() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == $proper_noun_genls$.getGlobalValue()) {
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		    try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			$proper_noun_genls$.setGlobalValue(cons(lexicon_accessors.$most_general_speech_part$.getGlobalValue(), set_difference(genls.all_genls($$ProperNoun, UNPROVIDED, UNPROVIDED), lexicon_accessors.all_speech_parts(UNPROVIDED), UNPROVIDED, UNPROVIDED)));
		    } finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return $proper_noun_genls$.getGlobalValue();
	}
    }

    /**
     *
     *
     * @return 0 KEYWORDP or LISTP of terms meeting O-TYPE constraints from RULE.
    Possible keywords: :no-constraints :abort
     * @return 1 POS
     */
    @LispMethod(comment = "@return 0 KEYWORDP or LISTP of terms meeting O-TYPE constraints from RULE.\r\nPossible keywords: :no-constraints :abort\r\n@return 1 POS")
    public static final SubLObject ncp_terms_meeting_rule_and_type(SubLObject rule, SubLObject o_type, SubLObject verboseP) {
	if (verboseP == UNPROVIDED) {
	    verboseP = T;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject constraints = rbp_rule_bank.rbp_rule_constraints(rule);
		SubLObject pos = lexicon_accessors.$most_general_speech_part$.getGlobalValue();
		SubLObject terms = NIL;
		SubLObject exact_match = NIL;
		SubLObject abortP = NIL;
		SubLObject doneP = NIL;
		SubLObject no_constraintsP = makeBoolean(NIL == find(o_type, constraints, symbol_function(EQL), SECOND, UNPROVIDED, UNPROVIDED));
		if (NIL != no_constraintsP) {
		    if (NIL != verboseP) {
			format(T, $str_alt299$__No_semantic_constraints_on__S__, o_type);
		    }
		    return values($NO_CONSTRAINTS, NIL);
		}
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		    try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			if (NIL == doneP) {
			    {
				SubLObject csome_list_var = constraints;
				SubLObject constraint = NIL;
				for (constraint = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), constraint = csome_list_var.first()) {
				    {
					SubLObject datum = constraint;
					SubLObject current = datum;
					SubLObject type = NIL;
					SubLObject o = NIL;
					SubLObject target = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt300);
					type = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt300);
					o = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt300);
					target = current.first();
					current = current.rest();
					if (NIL == current) {
					    if (o == o_type) {
						if (NIL == forts.fort_p(target)) {
						    if (NIL != verboseP) {
							format(T, $str_alt301$__Can_t_handle_non_fort_target___, target);
						    }
						    abortP = T;
						    doneP = T;
						} else {
						    {
							SubLObject pcase_var = type;
							if (pcase_var.eql($POS)) {
							    pos = target;
							} else {
							    if (pcase_var.eql($PRED)) {
								pos = (NIL != lexicon_accessors.speech_part_predP(target, UNPROVIDED)) ? ((SubLObject) (lexicon_accessors.pos_of_pred(target))) : NIL != lexicon_vars.name_string_predP(target) ? ((SubLObject) ($$ProperCountNoun)) : NIL;
							    } else {
								if (pcase_var.eql($EQL)) {
								    exact_match = target;
								    doneP = T;
								    terms = list(target);
								} else {
								    if (pcase_var.eql($ISA)) {
									{
									    SubLObject new_terms = isa.all_fort_instances(target, UNPROVIDED, UNPROVIDED);
									    if (NIL == new_terms) {
										format(T, $str_alt303$__No_instances_of__S___);
									    }
									    terms = (NIL != terms) ? ((SubLObject) (keyhash_utilities.fast_intersection(terms, new_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : new_terms;
									}
								    } else {
									if (pcase_var.eql($GENL)) {
									    {
										SubLObject new_terms = genls.all_specs(target, UNPROVIDED, UNPROVIDED);
										if (NIL == new_terms) {
										    format(T, $str_alt304$__No_specs_of__S___);
										}
										terms = (NIL != terms) ? ((SubLObject) (keyhash_utilities.fast_intersection(terms, new_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : new_terms;
									    }
									}
								    }
								}
							    }
							}
						    }
						    if ((NIL != verboseP) && (NIL != member(type, $list_alt305, UNPROVIDED, UNPROVIDED))) {
							format(T, $str_alt306$____S____D_term_A_meet_A_constrai, new SubLObject[] { constraint, length(terms), NIL != list_utilities.lengthE(terms, ONE_INTEGER, UNPROVIDED) ? ((SubLObject) ($str_alt85$)) : $$$s,
								NIL != list_utilities.lengthE(terms, ONE_INTEGER, UNPROVIDED) ? ((SubLObject) ($$$s)) : $str_alt85$ });
						    }
						}
					    }
					} else {
					    cdestructuring_bind_error(datum, $list_alt300);
					}
				    }
				}
			    }
			}
		    } finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		    }
		}
		if (NIL != abortP) {
		    return values($ABORT, NIL);
		}
		if (NIL != verboseP) {
		    format(T, $str_alt308$__Found___D_term_A_for__S___, new SubLObject[] { NIL != exact_match ? ((SubLObject) (ONE_INTEGER)) : length(terms), NIL != exact_match ? ((SubLObject) ($str_alt85$)) : $$$s, o_type });
		}
		return values(terms, pos);
	    }
	}
    }

    public static final SubLObject ncp_term_count(SubLObject v_object) {
	if (v_object == $ALL) {
	    return forts.fort_count();
	} else {
	    if (v_object.isCons()) {
		return length(v_object);
	    }
	}
	return NIL;
    }

    public static final SubLObject ncp_preds_of_pos_count_internal(SubLObject pos) {
	return length(lexicon_accessors.all_preds_of_pos(pos));
    }

    public static final SubLObject ncp_preds_of_pos_count(SubLObject pos) {
	{
	    SubLObject caching_state = $ncp_preds_of_pos_count_caching_state$.getGlobalValue();
	    if (NIL == caching_state) {
		caching_state = memoization_state.create_global_caching_state_for_name(NCP_PREDS_OF_POS_COUNT, $ncp_preds_of_pos_count_caching_state$, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
	    }
	    {
		SubLObject results = memoization_state.caching_state_lookup(caching_state, pos, $kw93$_MEMOIZED_ITEM_NOT_FOUND_);
		if (results == $kw93$_MEMOIZED_ITEM_NOT_FOUND_) {
		    results = arg2(resetMultipleValues(), multiple_value_list(ncp_preds_of_pos_count_internal(pos)));
		    memoization_state.caching_state_put(caching_state, pos, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	    }
	}
    }

    public static final SubLObject ncp_merge_pos(SubLObject pos1, SubLObject pos2) {
	if (pos1 == pos2) {
	    return pos1;
	} else {
	    if (NIL != genls.genlP(pos1, pos2, $$EnglishMt, UNPROVIDED)) {
		return pos1;
	    } else {
		if (NIL != genls.genlP(pos2, pos1, $$EnglishMt, UNPROVIDED)) {
		    return pos2;
		} else {
		    return NIL;
		}
	    }
	}
    }

    public static final SubLObject ncp_intersect_rule_lists(SubLObject list1, SubLObject list2) {
	if (($ABORT == list1) || ($ABORT == list2)) {
	    return $ABORT;
	} else {
	    if (($NO_CONSTRAINTS == list1) && ($NO_CONSTRAINTS == list2)) {
		return $ALL;
	    } else {
		if ($NO_CONSTRAINTS == list1) {
		    return list2;
		} else {
		    if ($NO_CONSTRAINTS == list2) {
			return list1;
		    } else {
			return keyhash_utilities.fast_intersection(list1, list2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		}
	    }
	}
    }

    public static final SubLObject ncp_count_strings_name_preds() {
	if (NIL == $ncp_count_strings_name_preds$.getGlobalValue()) {
	    $ncp_count_strings_name_preds$.setGlobalValue(isa.all_fort_instances($$ProperNamePredicate_General, UNPROVIDED, UNPROVIDED));
	}
	return $ncp_count_strings_name_preds$.getGlobalValue();
    }

    /**
     * Estimate the number of strings that Cyc knows can refer to terms meeting
     * TYPE constraints on the noun compound rule whose rule-cycl is RULE-CYCL.
     */
    @LispMethod(comment = "Estimate the number of strings that Cyc knows can refer to terms meeting\r\nTYPE constraints on the noun compound rule whose rule-cycl is RULE-CYCL.\nEstimate the number of strings that Cyc knows can refer to terms meeting\nTYPE constraints on the noun compound rule whose rule-cycl is RULE-CYCL.")
    public static final SubLObject ncp_count_strings_for_rule_and_type(SubLObject rule_cycl, SubLObject type, SubLObject verboseP) {
	if (verboseP == UNPROVIDED) {
	    verboseP = T;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl(rule_cycl, UNPROVIDED);
		SubLObject count = ZERO_INTEGER;
		thread.resetMultipleValues();
		{
		    SubLObject result = ncp_terms_meeting_rule_and_type(rule, type, verboseP);
		    SubLObject pos = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    {
			SubLObject pcase_var = result;
			if (pcase_var.eql($NO_CONSTRAINTS)) {
			    count = ncp_count_pos_assertions_cached(pos);
			} else {
			    if (pcase_var.eql($ABORT)) {
				return $ABORT;
			    } else {
				{
				    SubLObject cdolist_list_var = result;
				    SubLObject v_term = NIL;
				    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
					count = add(count, ncp_count_strings(v_term, pos));
				    }
				}
			    }
			}
		    }
		    if (NIL != verboseP) {
			format(T, $str_alt291$__Found___D__A_lexical_assertions, new SubLObject[] { count, pos == lexicon_accessors.$most_general_speech_part$.getGlobalValue() ? ((SubLObject) ($$$total)) : pos, type });
		    }
		}
		return count;
	    }
	}
    }

    /**
     * Estimate the number of binary noun compounds that can be parsed with RULE-CYCL.
     */
    @LispMethod(comment = "Estimate the number of binary noun compounds that can be parsed with RULE-CYCL.")
    public static final SubLObject ncp_count_strings_for_rule(SubLObject rule_cycl, SubLObject verboseP) {
	if (verboseP == UNPROVIDED) {
	    verboseP = T;
	}
	if (NIL != verboseP) {
	    format(T, $str_alt286$_________________________________);
	    format(T, $str_alt287$__Rule__S___, rule_cycl);
	}
	{
	    SubLObject head_count = ncp_count_strings_for_rule_and_type(rule_cycl, $HEAD, verboseP);
	    SubLObject mod_count = (head_count.isInteger()) ? ((SubLObject) (ncp_count_strings_for_rule_and_type(rule_cycl, $MODIFIER, verboseP))) : NIL;
	    SubLObject count = (mod_count.isInteger()) ? ((SubLObject) (multiply(head_count, mod_count))) : NIL;
	    if (!count.isInteger()) {
		if (NIL != verboseP) {
		    format(T, $str_alt288$__Couldn_t_estimate_string_count_, rule_cycl);
		}
		return $ABORT;
	    }
	    if (NIL != verboseP) {
		format(T, $str_alt289$__Estimated_string_count____D___, count);
		format(T, $str_alt286$_________________________________);
	    }
	    return count;
	}
    }

    /**
     * Estimate the number of binary noun compounds that can be parsed.
     */
    @LispMethod(comment = "Estimate the number of binary noun compounds that can be parsed.")
    public static final SubLObject ncp_count_strings_for_all_rules(SubLObject verboseP) {
	if (verboseP == UNPROVIDED) {
	    verboseP = T;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject rule_counts = NIL;
		SubLObject total = ZERO_INTEGER;
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		    try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			{
			    SubLObject all_rules = isa.all_fort_instances($$NounCompoundRule, UNPROVIDED, UNPROVIDED);
			    SubLObject number_of_rules = length(all_rules);
			    SubLObject list_var = NIL;
			    SubLObject rule_cycl = NIL;
			    SubLObject i = NIL;
			    for (list_var = all_rules, rule_cycl = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), rule_cycl = list_var.first(), i = add(ONE_INTEGER, i)) {
				if (NIL != verboseP) {
				    format(T, $str_alt276$__Doing_Rule__D_of__D_____, number_utilities.f_1X(i), number_of_rules);
				}
				{
				    SubLObject curr_count = ncp_count_strings_for_rule(rule_cycl, verboseP);
				    if (curr_count != $ABORT) {
					total = add(total, curr_count);
					if (NIL != verboseP) {
					    format(T, $str_alt278$__Current_subtotal_for_first__D_r, number_utilities.f_1X(i), total);
					}
					rule_counts = cons(list(rule_cycl, curr_count), rule_counts);
				    }
				}
			    }
			}
		    } finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		    }
		}
		rule_counts = Sort.sort(rule_counts, symbol_function($sym129$_), symbol_function(SECOND));
		{
		    SubLObject cdolist_list_var = rule_counts;
		    SubLObject rule_count = NIL;
		    for (rule_count = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rule_count = cdolist_list_var.first()) {
			{
			    SubLObject datum = rule_count;
			    SubLObject current = datum;
			    SubLObject rule = NIL;
			    SubLObject count = NIL;
			    destructuring_bind_must_consp(current, datum, $list_alt280);
			    rule = current.first();
			    current = current.rest();
			    destructuring_bind_must_consp(current, datum, $list_alt280);
			    count = current.first();
			    current = current.rest();
			    if (NIL == current) {
				format(T, $str_alt281$__Rule__45S__10D__, rule, count);
			    } else {
				cdestructuring_bind_error(datum, $list_alt280);
			    }
			}
		    }
		}
		format(T, $str_alt282$____D__, total);
		format(T, $str_alt283$Analyzed__D_noun_compound_rules__, length(rule_counts));
		format(T, $str_alt284$Average_strings_per_rule___4_1F__, number_utilities.mean(Mapping.mapcar(symbol_function(SECOND), rule_counts)));
		format(T, $str_alt285$Median_strings_per_rule____D___, number_utilities.median(Mapping.mapcar(symbol_function(SECOND), rule_counts), UNPROVIDED));
		return total;
	    }
	}
    }

    public static final SubLObject ncp_count_strings(SubLObject v_term, SubLObject pos) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject count = ZERO_INTEGER;
		if (NIL != forts.fort_p(v_term)) {
		    {
			SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
			    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			    {
				SubLObject cdolist_list_var = $ncp_count_strings_denot_preds$.getGlobalValue();
				SubLObject denot_pred = NIL;
				for (denot_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), denot_pred = cdolist_list_var.first()) {
				    {
					SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(denot_pred);
					SubLObject cdolist_list_var_55 = kb_mapping_utilities.pred_values(v_term, denot_pred, FOUR_INTEGER, pos_arg, UNPROVIDED);
					SubLObject as_pos = NIL;
					for (as_pos = cdolist_list_var_55.first(); NIL != cdolist_list_var_55; cdolist_list_var_55 = cdolist_list_var_55.rest(), as_pos = cdolist_list_var_55.first()) {
					    if (NIL != genls.genlP(as_pos, pos, UNPROVIDED, UNPROVIDED)) {
						count = add(count, ncp_preds_of_pos_count(as_pos));
					    }
					}
				    }
				}
			    }
			    if (NIL != subl_promotions.memberP(pos, proper_noun_genls(), UNPROVIDED, UNPROVIDED)) {
				{
				    SubLObject cdolist_list_var = ncp_count_strings_name_preds();
				    SubLObject name_pred = NIL;
				    for (name_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), name_pred = cdolist_list_var.first()) {
					count = add(count, kb_indexing.num_gaf_arg_index(v_term, ONE_INTEGER, name_pred, UNPROVIDED));
				    }
				}
			    }
			} finally {
			    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
		    }
		}
		return count;
	    }
	}
    }

    /**
     * How many lexical assertions for POS are there total?
     */
    @LispMethod(comment = "How many lexical assertions for POS are there total?")
    public static final SubLObject ncp_count_pos_assertions_cached_internal(SubLObject pos) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject count = ZERO_INTEGER;
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		    try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			{
			    SubLObject cdolist_list_var = genls.all_specs(pos, UNPROVIDED, UNPROVIDED);
			    SubLObject spec_pos = NIL;
			    for (spec_pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), spec_pos = cdolist_list_var.first()) {
				{
				    SubLObject cdolist_list_var_54 = $ncp_count_strings_denot_preds$.getGlobalValue();
				    SubLObject denot_pred = NIL;
				    for (denot_pred = cdolist_list_var_54.first(); NIL != cdolist_list_var_54; cdolist_list_var_54 = cdolist_list_var_54.rest(), denot_pred = cdolist_list_var_54.first()) {
					{
					    SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(denot_pred);
					    count = add(count, kb_indexing.num_gaf_arg_index(spec_pos, pos_arg, denot_pred, UNPROVIDED));
					}
				    }
				}
			    }
			}
		    } finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		    }
		}
		return count;
	    }
	}
    }

    public static final SubLObject ncp_count_pos_assertions_cached(SubLObject pos) {
	{
	    SubLObject caching_state = $ncp_count_pos_assertions_cached_caching_state$.getGlobalValue();
	    if (NIL == caching_state) {
		caching_state = memoization_state.create_global_caching_state_for_name(NCP_COUNT_POS_ASSERTIONS_CACHED, $ncp_count_pos_assertions_cached_caching_state$, NIL, EQL, ONE_INTEGER, $int$256);
	    }
	    {
		SubLObject results = memoization_state.caching_state_lookup(caching_state, pos, $kw93$_MEMOIZED_ITEM_NOT_FOUND_);
		if (results == $kw93$_MEMOIZED_ITEM_NOT_FOUND_) {
		    results = arg2(resetMultipleValues(), multiple_value_list(ncp_count_pos_assertions_cached_internal(pos)));
		    memoization_state.caching_state_put(caching_state, pos, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	    }
	}
    }

    /**
     * Compute the number of binary noun compounds that can be parsed by both the
     * noun compound rule whose rule-cycl is RULE-CYCL1 and that rule-cyclled RULE-CYCL2.
     *
     * @param RULE-CYCL1
     * 		stringp; a noun compound rule rule-cycl.
     * @param RULE-CYCL2
     * 		stringp; a noun compound rule rule-cycl.
     * @return INTEGERP.
     */
    @LispMethod(comment = "Compute the number of binary noun compounds that can be parsed by both the\r\nnoun compound rule whose rule-cycl is RULE-CYCL1 and that rule-cyclled RULE-CYCL2.\r\n\r\n@param RULE-CYCL1\r\n\t\tstringp; a noun compound rule rule-cycl.\r\n@param RULE-CYCL2\r\n\t\tstringp; a noun compound rule rule-cycl.\r\n@return INTEGERP.\nCompute the number of binary noun compounds that can be parsed by both the\nnoun compound rule whose rule-cycl is RULE-CYCL1 and that rule-cyclled RULE-CYCL2.")
    public static final SubLObject ncp_compute_rule_overlap(SubLObject rule_cycl1, SubLObject rule_cycl2, SubLObject verboseP) {
	if (verboseP == UNPROVIDED) {
	    verboseP = T;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject rule1 = rbp_rule_bank.rbp_find_rule_from_cycl(rule_cycl1, UNPROVIDED);
		SubLObject rule2 = rbp_rule_bank.rbp_find_rule_from_cycl(rule_cycl2, UNPROVIDED);
		thread.resetMultipleValues();
		{
		    SubLObject rule1_head_terms = ncp_terms_meeting_rule_and_type(rule1, $HEAD, verboseP);
		    SubLObject rule1_head_pos = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    thread.resetMultipleValues();
		    {
			SubLObject rule2_head_terms = ncp_terms_meeting_rule_and_type(rule2, $HEAD, verboseP);
			SubLObject rule2_head_pos = thread.secondMultipleValue();
			thread.resetMultipleValues();
			{
			    SubLObject head_pos = ncp_merge_pos(rule1_head_pos, rule2_head_pos);
			    SubLObject overlapping_head_terms = (NIL != head_pos) ? ((SubLObject) (ncp_intersect_rule_lists(rule1_head_terms, rule2_head_terms))) : NIL;
			    if ((NIL == overlapping_head_terms) || (overlapping_head_terms == $ABORT)) {
				return ZERO_INTEGER;
			    }
			    thread.resetMultipleValues();
			    {
				SubLObject rule1_modifier_terms = ncp_terms_meeting_rule_and_type(rule1, $MODIFIER, verboseP);
				SubLObject rule1_modifier_pos = thread.secondMultipleValue();
				thread.resetMultipleValues();
				thread.resetMultipleValues();
				{
				    SubLObject rule2_modifier_terms = ncp_terms_meeting_rule_and_type(rule2, $MODIFIER, verboseP);
				    SubLObject rule2_modifier_pos = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    {
					SubLObject modifier_pos = ncp_merge_pos(rule1_modifier_pos, rule2_modifier_pos);
					SubLObject overlapping_modifier_terms = (NIL != modifier_pos) ? ((SubLObject) (ncp_intersect_rule_lists(rule1_modifier_terms, rule2_modifier_terms))) : NIL;
					if ((NIL == overlapping_modifier_terms) || (overlapping_modifier_terms == $ABORT)) {
					    return ZERO_INTEGER;
					}
					{
					    SubLObject overlapping_term_pair_count = multiply(ncp_term_count(overlapping_head_terms), ncp_term_count(overlapping_modifier_terms));
					    SubLObject head_string_count = ZERO_INTEGER;
					    SubLObject modifier_string_count = ZERO_INTEGER;
					    if (NIL != verboseP) {
						format(T, $str_alt311$__Found__D_overlapping_term_pairs, overlapping_term_pair_count);
					    }
					    {
						SubLObject cdolist_list_var = overlapping_head_terms;
						SubLObject v_term = NIL;
						for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
						    head_string_count = add(head_string_count, ncp_count_strings(v_term, head_pos));
						}
					    }
					    if (!head_string_count.isPositive()) {
						return ZERO_INTEGER;
					    }
					    {
						SubLObject cdolist_list_var = overlapping_modifier_terms;
						SubLObject v_term = NIL;
						for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
						    modifier_string_count = add(modifier_string_count, ncp_count_strings(v_term, modifier_pos));
						}
					    }
					    {
						SubLObject overlapping_string_pair_count = multiply(head_string_count, modifier_string_count);
						return values(overlapping_string_pair_count, overlapping_term_pair_count);
					    }
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }

    public static final SubLObject clear_ncp_preds_of_pos_count() {
	{
	    SubLObject cs = $ncp_preds_of_pos_count_caching_state$.getGlobalValue();
	    if (NIL != cs) {
		memoization_state.caching_state_clear(cs);
	    }
	}
	return NIL;
    }

    public static final SubLObject clear_ncp_count_pos_assertions_cached() {
	{
	    SubLObject cs = $ncp_count_pos_assertions_cached_caching_state$.getGlobalValue();
	    if (NIL != cs) {
		memoization_state.caching_state_clear(cs);
	    }
	}
	return NIL;
    }

    public static final SubLSymbol $ncp_preds_of_pos_count_caching_state$ = makeSymbol("*NCP-PREDS-OF-POS-COUNT-CACHING-STATE*");

    public static final SubLSymbol $ncp_count_pos_assertions_cached_caching_state$ = makeSymbol("*NCP-COUNT-POS-ASSERTIONS-CACHED-CACHING-STATE*");

    public static final SubLSymbol $proper_noun_genls$ = makeSymbol("*PROPER-NOUN-GENLS*");

    public static final SubLSymbol $ncp_count_strings_name_preds$ = makeSymbol("*NCP-COUNT-STRINGS-NAME-PREDS*");

    static private final SubLString $str_alt85$ = makeString("");

    public static final SubLSymbol $rbp_cncb_hash$ = makeSymbol("*RBP-CNCB-HASH*");

    public static final SubLSymbol $rbp_cncb_calls_backwards$ = makeSymbol("*RBP-CNCB-CALLS-BACKWARDS*");

    public static final SubLSymbol $rbp_cncb_calls_redundant$ = makeSymbol("*RBP-CNCB-CALLS-REDUNDANT*");

    public static final SubLSymbol $rbp_cncb_calls$ = makeSymbol("*RBP-CNCB-CALLS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ncp_count_strings_denot_preds$ = makeSymbol("*NCP-COUNT-STRINGS-DENOT-PREDS*");

    public static final class $date_parse_block_native extends SubLStructNative {
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	public SubLObject getField2() {
	    return com.cyc.cycjava.cycl.noun_compound_parser.$date_parse_block_native.this.$subcol_naut;
	}

	public SubLObject getField3() {
	    return com.cyc.cycjava.cycl.noun_compound_parser.$date_parse_block_native.this.$confidence;
	}

	public SubLObject setField2(SubLObject value) {
	    return com.cyc.cycjava.cycl.noun_compound_parser.$date_parse_block_native.this.$subcol_naut = value;
	}

	public SubLObject setField3(SubLObject value) {
	    return com.cyc.cycjava.cycl.noun_compound_parser.$date_parse_block_native.this.$confidence = value;
	}

	public SubLObject $subcol_naut = Lisp.NIL;

	public SubLObject $confidence = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.noun_compound_parser.$date_parse_block_native.class, DATE_PARSE_BLOCK, DATE_PARSE_BLOCK_P, $list_alt329, $list_alt330, new String[] { "$subcol_naut", "$confidence" }, $list_alt331, $list_alt332,
		DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new noun_compound_parser();

 public static final String myName = "com.cyc.cycjava.cycl.noun_compound_parser";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_noun_compound_parse$ = makeSymbol("*DTP-NOUN-COMPOUND-PARSE*");

    // defparameter
    // Should RBP report how long it spent parsing?
    /**
     * Should RBP report how long it spent parsing?
     */
    @LispMethod(comment = "Should RBP report how long it spent parsing?\ndefparameter")
    private static final SubLSymbol $rbp_report_parse_timeP$ = makeSymbol("*RBP-REPORT-PARSE-TIME?*");

    // defparameter
    /**
     * BOOLEANP; when t, add the rule id to the list of information returned for a
     * successful parse
     */
    @LispMethod(comment = "BOOLEANP; when t, add the rule id to the list of information returned for a\r\nsuccessful parse\ndefparameter\nBOOLEANP; when t, add the rule id to the list of information returned for a\nsuccessful parse")
    public static final SubLSymbol $rbp_shadow_rulesP$ = makeSymbol("*RBP-SHADOW-RULES?*");

    // defparameter
    /**
     * Dictionary for storing rules ID -> parse pairs so we don't have to sling them
     * around
     */
    @LispMethod(comment = "Dictionary for storing rules ID -> parse pairs so we don\'t have to sling them\r\naround\ndefparameter\nDictionary for storing rules ID -> parse pairs so we don\'t have to sling them\naround")
    public static final SubLSymbol $rbp_rules_to_parses_shadow$ = makeSymbol("*RBP-RULES-TO-PARSES-SHADOW*");

    // defparameter
    /**
     * BOOLEANP: when set to t, adds the each parse's confidence to the list, after
     * the pos-pred
     */
    @LispMethod(comment = "BOOLEANP: when set to t, adds the each parse\'s confidence to the list, after\r\nthe pos-pred\ndefparameter\nBOOLEANP: when set to t, adds the each parse\'s confidence to the list, after\nthe pos-pred")
    public static final SubLSymbol $rbp_return_confidenceP$ = makeSymbol("*RBP-RETURN-CONFIDENCE?*");

    // defparameter
    // List of rules to report uses of
    /**
     * List of rules to report uses of
     */
    @LispMethod(comment = "List of rules to report uses of\ndefparameter")
    private static final SubLSymbol $rbp_traced_rules$ = makeSymbol("*RBP-TRACED-RULES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_noun_compound_block$ = makeSymbol("*DTP-NOUN-COMPOUND-BLOCK*");

    // defparameter
    /**
     * Non-negative numberp ; typically .5 ; default multiplier to confidence level
     * when a filter is failed
     */
    @LispMethod(comment = "Non-negative numberp ; typically .5 ; default multiplier to confidence level\r\nwhen a filter is failed\ndefparameter\nNon-negative numberp ; typically .5 ; default multiplier to confidence level\nwhen a filter is failed")
    private static final SubLSymbol $rbp_default_confidence_multiplier_for_failing_a_filter$ = makeSymbol("*RBP-DEFAULT-CONFIDENCE-MULTIPLIER-FOR-FAILING-A-FILTER*");

    // defparameter
    // Filters to be applied to individual nc parses regardless of their nature
    /**
     * Filters to be applied to individual nc parses regardless of their nature
     */
    @LispMethod(comment = "Filters to be applied to individual nc parses regardless of their nature\ndefparameter")
    private static final SubLSymbol $rbp_universal_boolean_filters$ = makeSymbol("*RBP-UNIVERSAL-BOOLEAN-FILTERS*");

    // defparameter
    /**
     * Filters to be applied to individual nc parses only when the head is
     * 'deverbal'... or *rbp-apply-all-filters-regardless?* is t
     */
    @LispMethod(comment = "Filters to be applied to individual nc parses only when the head is\r\n\'deverbal\'... or *rbp-apply-all-filters-regardless?* is t\ndefparameter\nFilters to be applied to individual nc parses only when the head is\n\'deverbal\'... or *rbp-apply-all-filters-regardless?* is t")
    private static final SubLSymbol $rbp_deverbal_boolean_filters$ = makeSymbol("*RBP-DEVERBAL-BOOLEAN-FILTERS*");

    // defparameter
    /**
     * Filters to be applied to groups of nc parses only when the head is
     * 'deverbal'... or *rbp-apply-all-filters-regardless?* is t
     */
    @LispMethod(comment = "Filters to be applied to groups of nc parses only when the head is\r\n\'deverbal\'... or *rbp-apply-all-filters-regardless?* is t\ndefparameter\nFilters to be applied to groups of nc parses only when the head is\n\'deverbal\'... or *rbp-apply-all-filters-regardless?* is t")
    private static final SubLSymbol $rbp_deverbal_macroscopic_filters$ = makeSymbol("*RBP-DEVERBAL-MACROSCOPIC-FILTERS*");

    // defparameter
    /**
     * Filters to be applied to groups of nc parses only when the head is
     * 'deverbal'... or *rbp-apply-all-filters-regardless?* is t
     */
    @LispMethod(comment = "Filters to be applied to groups of nc parses only when the head is\r\n\'deverbal\'... or *rbp-apply-all-filters-regardless?* is t\ndefparameter\nFilters to be applied to groups of nc parses only when the head is\n\'deverbal\'... or *rbp-apply-all-filters-regardless?* is t")
    private static final SubLSymbol $rbp_deverbal_macroscopic_block_filters$ = makeSymbol("*RBP-DEVERBAL-MACROSCOPIC-BLOCK-FILTERS*");

    // defparameter
    /**
     * Holds the tokenized version of the input string. Useful to check
     * capitalization against.
     */
    @LispMethod(comment = "Holds the tokenized version of the input string. Useful to check\r\ncapitalization against.\ndefparameter\nHolds the tokenized version of the input string. Useful to check\ncapitalization against.")
    private static final SubLSymbol $rbp_input_strings$ = makeSymbol("*RBP-INPUT-STRINGS*");

    // defparameter
    /**
     * Determines whether or not
     *
     * @see parse-noun-compound is allowed to use non-nominal denotations of
    individual strings. The default value -- t -- does not allow this, the
    alternative value nil does.
     */
    @LispMethod(comment = "Determines whether or not\r\n\r\n@see parse-noun-compound is allowed to use non-nominal denotations of\r\nindividual strings. The default value -- t -- does not allow this, the\r\nalternative value nil does.\ndefparameter")
    public static final SubLSymbol $nominal_interpretations_only$ = makeSymbol("*NOMINAL-INTERPRETATIONS-ONLY*");

    // defparameter
    // Only return parses that combine at least this many blocks.
    /**
     * Only return parses that combine at least this many blocks.
     */
    @LispMethod(comment = "Only return parses that combine at least this many blocks.\ndefparameter")
    public static final SubLSymbol $rbp_minimum_component_count$ = makeSymbol("*RBP-MINIMUM-COMPONENT-COUNT*");

    // defparameter
    // Only return parses that combine at most this many blocks.
    /**
     * Only return parses that combine at most this many blocks.
     */
    @LispMethod(comment = "Only return parses that combine at most this many blocks.\ndefparameter")
    public static final SubLSymbol $rbp_maximum_component_count$ = makeSymbol("*RBP-MAXIMUM-COMPONENT-COUNT*");

    // defparameter
    /**
     * BOOLEANP; when t, sort blocks by confidence, then complexity; when nil, do it
     * the old way
     */
    @LispMethod(comment = "BOOLEANP; when t, sort blocks by confidence, then complexity; when nil, do it\r\nthe old way\ndefparameter\nBOOLEANP; when t, sort blocks by confidence, then complexity; when nil, do it\nthe old way")
    private static final SubLSymbol $rbp_sort_blocks_confidence_firstP$ = makeSymbol("*RBP-SORT-BLOCKS-CONFIDENCE-FIRST?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rbp_reliability_high$ = makeSymbol("*RBP-RELIABILITY-HIGH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rbp_reliability_medium$ = makeSymbol("*RBP-RELIABILITY-MEDIUM*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rbp_reliability_low$ = makeSymbol("*RBP-RELIABILITY-LOW*");

    // deflexical
    // Should we exclude certain subsumed blocks from the initial chart seeding?
    /**
     * Should we exclude certain subsumed blocks from the initial chart seeding?
     */
    @LispMethod(comment = "Should we exclude certain subsumed blocks from the initial chart seeding?\ndeflexical")
    private static final SubLSymbol $rbp_chart_filterP$ = makeSymbol("*RBP-CHART-FILTER?*");

    // defparameter
    // Cache for name-pred-denot triples to check for redundancy
    /**
     * Cache for name-pred-denot triples to check for redundancy
     */
    @LispMethod(comment = "Cache for name-pred-denot triples to check for redundancy\ndefparameter")
    private static final SubLSymbol $rbp_name_cache$ = makeSymbol("*RBP-NAME-CACHE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rbp_ok_name_cachedP_caching_state$ = makeSymbol("*RBP-OK-NAME-CACHED?-CACHING-STATE*");

    // defparameter
    // I think RBP-WFF gets these, so there's no need to do them here.
    /**
     * I think RBP-WFF gets these, so there's no need to do them here.
     */
    @LispMethod(comment = "I think RBP-WFF gets these, so there\'s no need to do them here.\ndefparameter")
    private static final SubLSymbol $rbp_use_inter_arg_isa_filtersP$ = makeSymbol("*RBP-USE-INTER-ARG-ISA-FILTERS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rbp_use_inter_arg_not_isa_filtersP$ = makeSymbol("*RBP-USE-INTER-ARG-NOT-ISA-FILTERS?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $rbp_rb_closed_class_filter_keys$ = makeSymbol("*RBP-RB-CLOSED-CLASS-FILTER-KEYS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rbp_high_date_confidence$ = makeSymbol("*RBP-HIGH-DATE-CONFIDENCE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rbp_low_date_confidence$ = makeSymbol("*RBP-LOW-DATE-CONFIDENCE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rbp_date_fallback_identifier$ = makeSymbol("*RBP-DATE-FALLBACK-IDENTIFIER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rbp_date_fallback_test$ = makeSymbol("*RBP-DATE-FALLBACK-TEST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_date_parse_block$ = makeSymbol("*DTP-DATE-PARSE-BLOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rbp_rae_max_time$ = makeSymbol("*RBP-RAE-MAX-TIME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rbp_unlikely_subcollection_nautP_caching_state$ = makeSymbol("*RBP-UNLIKELY-SUBCOLLECTION-NAUT?-CACHING-STATE*");

    // defparameter
    // Dictionary of format strings, initalized depending on output mode
    /**
     * Dictionary of format strings, initalized depending on output mode
     */
    @LispMethod(comment = "Dictionary of format strings, initalized depending on output mode\ndefparameter")
    private static final SubLSymbol $ncs_formats$ = makeSymbol("*NCS-FORMATS*");

    // defparameter
    /**
     * BOOLEANP ; when non-nil, only do deverbal compounds in @see
     * noun-compound-statistics
     */
    @LispMethod(comment = "BOOLEANP ; when non-nil, only do deverbal compounds in @see\r\nnoun-compound-statistics\ndefparameter\nBOOLEANP ; when non-nil, only do deverbal compounds in @see\nnoun-compound-statistics")
    private static final SubLSymbol $ncs_deverbals_onlyP$ = makeSymbol("*NCS-DEVERBALS-ONLY?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol ADD_NC_RULE_CONSTRAINT = makeSymbol("ADD-NC-RULE-CONSTRAINT");

    private static final SubLSymbol REMOVE_NC_RULE_CONSTRAINT = makeSymbol("REMOVE-NC-RULE-CONSTRAINT");

    private static final SubLSymbol ADD_NC_RULE_TEMPLATE = makeSymbol("ADD-NC-RULE-TEMPLATE");

    private static final SubLSymbol REMOVE_NC_RULE_TEMPLATE = makeSymbol("REMOVE-NC-RULE-TEMPLATE");

    private static final SubLSymbol NOUN_COMPOUND_PARSE = makeSymbol("NOUN-COMPOUND-PARSE");

    private static final SubLSymbol NOUN_COMPOUND_PARSE_P = makeSymbol("NOUN-COMPOUND-PARSE-P");

    static private final SubLList $list6 = list(makeSymbol("UNIQUE-ID"), makeSymbol("INPUT-STRING"), makeSymbol("INPUT-STRINGS"), makeSymbol("CHART"));

    static private final SubLList $list7 = list(makeKeyword("UNIQUE-ID"), makeKeyword("INPUT-STRING"), makeKeyword("INPUT-STRINGS"), makeKeyword("CHART"));

    static private final SubLList $list8 = list(makeSymbol("NC-PARSE-UNIQUE-ID"), makeSymbol("NC-PARSE-INPUT-STRING"), makeSymbol("NC-PARSE-INPUT-STRINGS"), makeSymbol("NC-PARSE-CHART"));

    static private final SubLList $list9 = list(makeSymbol("_CSETF-NC-PARSE-UNIQUE-ID"), makeSymbol("_CSETF-NC-PARSE-INPUT-STRING"), makeSymbol("_CSETF-NC-PARSE-INPUT-STRINGS"), makeSymbol("_CSETF-NC-PARSE-CHART"));

    private static final SubLSymbol PPRINT_NC_PARSE = makeSymbol("PPRINT-NC-PARSE");

    private static final SubLSymbol NOUN_COMPOUND_PARSE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NOUN-COMPOUND-PARSE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list12 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NOUN-COMPOUND-PARSE-P"));

    private static final SubLSymbol NC_PARSE_UNIQUE_ID = makeSymbol("NC-PARSE-UNIQUE-ID");

    private static final SubLSymbol _CSETF_NC_PARSE_UNIQUE_ID = makeSymbol("_CSETF-NC-PARSE-UNIQUE-ID");

    private static final SubLSymbol NC_PARSE_INPUT_STRING = makeSymbol("NC-PARSE-INPUT-STRING");

    private static final SubLSymbol _CSETF_NC_PARSE_INPUT_STRING = makeSymbol("_CSETF-NC-PARSE-INPUT-STRING");

    private static final SubLSymbol NC_PARSE_INPUT_STRINGS = makeSymbol("NC-PARSE-INPUT-STRINGS");

    private static final SubLSymbol _CSETF_NC_PARSE_INPUT_STRINGS = makeSymbol("_CSETF-NC-PARSE-INPUT-STRINGS");

    private static final SubLSymbol NC_PARSE_CHART = makeSymbol("NC-PARSE-CHART");

    private static final SubLSymbol _CSETF_NC_PARSE_CHART = makeSymbol("_CSETF-NC-PARSE-CHART");

    private static final SubLString $str25$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_NOUN_COMPOUND_PARSE = makeSymbol("MAKE-NOUN-COMPOUND-PARSE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_PARSE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-PARSE-METHOD");

    private static final SubLSymbol $nc_parse_id_counter$ = makeSymbol("*NC-PARSE-ID-COUNTER*");

    private static final SubLString $str32$____NC_PARSE__ID___S__ = makeString("~&#<NC-PARSE: ID: ~S~%");

    private static final SubLString $str33$__Input_string___S__ = makeString("  Input string: ~S~%");

    private static final SubLString $str34$_Input_strings___S__ = makeString(" Input strings: ~S~%");

    private static final SubLString $str35$_________Chart___S__ = makeString("         Chart: ~S~%");

    static private final SubLList $list37 = list(list(makeSymbol("*RBP-SHOW-SUCCESSFUL-RULES?*"), T));

    private static final SubLSymbol RBP_RULE_CYCL = makeSymbol("RBP-RULE-CYCL");

    private static final SubLSymbol NOUN_COMPOUND_BLOCK = makeSymbol("NOUN-COMPOUND-BLOCK");

    private static final SubLSymbol NOUN_COMPOUND_BLOCK_P = makeSymbol("NOUN-COMPOUND-BLOCK-P");

    private static final SubLList $list41 = list(new SubLObject[] { makeSymbol("UNIQUE-ID"), makeSymbol("SPAN-INDEX"), makeSymbol("CONFIDENCE"), makeSymbol("DENOT"), makeSymbol("FILTERS"), makeSymbol("SPANNED-STRING"), makeSymbol("HEAD"), makeSymbol("HEAD-POS"), makeSymbol("HEAD-STRING-PRED"),
	    makeSymbol("SUB-TREE"), makeSymbol("PLIST") });

    private static final SubLList $list42 = list(new SubLObject[] { makeKeyword("UNIQUE-ID"), makeKeyword("SPAN-INDEX"), makeKeyword("CONFIDENCE"), makeKeyword("DENOT"), makeKeyword("FILTERS"), makeKeyword("SPANNED-STRING"), $HEAD, makeKeyword("HEAD-POS"),
	    makeKeyword("HEAD-STRING-PRED"), makeKeyword("SUB-TREE"), makeKeyword("PLIST") });

    private static final SubLList $list43 = list(new SubLObject[] { makeSymbol("NC-BLOCK-UNIQUE-ID"), makeSymbol("NC-BLOCK-SPAN-INDEX"), makeSymbol("NC-BLOCK-CONFIDENCE"), makeSymbol("NC-BLOCK-DENOT"), makeSymbol("NC-BLOCK-FILTERS"), makeSymbol("NC-BLOCK-SPANNED-STRING"),
	    makeSymbol("NC-BLOCK-HEAD"), makeSymbol("NC-BLOCK-HEAD-POS"), makeSymbol("NC-BLOCK-HEAD-STRING-PRED"), makeSymbol("NC-BLOCK-SUB-TREE"), makeSymbol("NC-BLOCK-PLIST") });

    private static final SubLList $list44 = list(new SubLObject[] { makeSymbol("_CSETF-NC-BLOCK-UNIQUE-ID"), makeSymbol("_CSETF-NC-BLOCK-SPAN-INDEX"), makeSymbol("_CSETF-NC-BLOCK-CONFIDENCE"), makeSymbol("_CSETF-NC-BLOCK-DENOT"), makeSymbol("_CSETF-NC-BLOCK-FILTERS"),
	    makeSymbol("_CSETF-NC-BLOCK-SPANNED-STRING"), makeSymbol("_CSETF-NC-BLOCK-HEAD"), makeSymbol("_CSETF-NC-BLOCK-HEAD-POS"), makeSymbol("_CSETF-NC-BLOCK-HEAD-STRING-PRED"), makeSymbol("_CSETF-NC-BLOCK-SUB-TREE"), makeSymbol("_CSETF-NC-BLOCK-PLIST") });

    private static final SubLSymbol PPRINT_NC_BLOCK = makeSymbol("PPRINT-NC-BLOCK");

    private static final SubLSymbol NOUN_COMPOUND_BLOCK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NOUN-COMPOUND-BLOCK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list47 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NOUN-COMPOUND-BLOCK-P"));

    private static final SubLSymbol NC_BLOCK_UNIQUE_ID = makeSymbol("NC-BLOCK-UNIQUE-ID");

    private static final SubLSymbol _CSETF_NC_BLOCK_UNIQUE_ID = makeSymbol("_CSETF-NC-BLOCK-UNIQUE-ID");

    private static final SubLSymbol NC_BLOCK_SPAN_INDEX = makeSymbol("NC-BLOCK-SPAN-INDEX");

    private static final SubLSymbol _CSETF_NC_BLOCK_SPAN_INDEX = makeSymbol("_CSETF-NC-BLOCK-SPAN-INDEX");

    private static final SubLSymbol NC_BLOCK_CONFIDENCE = makeSymbol("NC-BLOCK-CONFIDENCE");

    private static final SubLSymbol _CSETF_NC_BLOCK_CONFIDENCE = makeSymbol("_CSETF-NC-BLOCK-CONFIDENCE");

    private static final SubLSymbol NC_BLOCK_DENOT = makeSymbol("NC-BLOCK-DENOT");

    private static final SubLSymbol _CSETF_NC_BLOCK_DENOT = makeSymbol("_CSETF-NC-BLOCK-DENOT");

    private static final SubLSymbol NC_BLOCK_FILTERS = makeSymbol("NC-BLOCK-FILTERS");

    private static final SubLSymbol _CSETF_NC_BLOCK_FILTERS = makeSymbol("_CSETF-NC-BLOCK-FILTERS");

    private static final SubLSymbol NC_BLOCK_SPANNED_STRING = makeSymbol("NC-BLOCK-SPANNED-STRING");

    private static final SubLSymbol _CSETF_NC_BLOCK_SPANNED_STRING = makeSymbol("_CSETF-NC-BLOCK-SPANNED-STRING");

    private static final SubLSymbol NC_BLOCK_HEAD = makeSymbol("NC-BLOCK-HEAD");

    private static final SubLSymbol _CSETF_NC_BLOCK_HEAD = makeSymbol("_CSETF-NC-BLOCK-HEAD");

    private static final SubLSymbol NC_BLOCK_HEAD_POS = makeSymbol("NC-BLOCK-HEAD-POS");

    private static final SubLSymbol _CSETF_NC_BLOCK_HEAD_POS = makeSymbol("_CSETF-NC-BLOCK-HEAD-POS");

    private static final SubLSymbol NC_BLOCK_HEAD_STRING_PRED = makeSymbol("NC-BLOCK-HEAD-STRING-PRED");

    private static final SubLSymbol _CSETF_NC_BLOCK_HEAD_STRING_PRED = makeSymbol("_CSETF-NC-BLOCK-HEAD-STRING-PRED");

    private static final SubLSymbol NC_BLOCK_SUB_TREE = makeSymbol("NC-BLOCK-SUB-TREE");

    private static final SubLSymbol _CSETF_NC_BLOCK_SUB_TREE = makeSymbol("_CSETF-NC-BLOCK-SUB-TREE");

    private static final SubLSymbol NC_BLOCK_PLIST = makeSymbol("NC-BLOCK-PLIST");

    private static final SubLSymbol _CSETF_NC_BLOCK_PLIST = makeSymbol("_CSETF-NC-BLOCK-PLIST");

    private static final SubLSymbol $HEAD_STRING_PRED = makeKeyword("HEAD-STRING-PRED");

    private static final SubLSymbol MAKE_NOUN_COMPOUND_BLOCK = makeSymbol("MAKE-NOUN-COMPOUND-BLOCK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_BLOCK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-BLOCK-METHOD");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLString $str84$__NCB__S___S__S_ = makeString("#<NCB ~S: ~S ~S>");

    private static final SubLSymbol $nc_block_unique_id_counter$ = makeSymbol("*NC-BLOCK-UNIQUE-ID-COUNTER*");

    private static final SubLSymbol COMBINE_NOUN_COMPOUND_BLOCKS = makeSymbol("COMBINE-NOUN-COMPOUND-BLOCKS");

    private static final SubLList $list87 = list(makeSymbol("RULE"), makeSymbol("DENOT"));

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLFloat $float$1_1 = makeDouble(1.1);

    static private final SubLList $list90 = list(makeSymbol("DENOT"), makeSymbol("POS"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("WU"));

    private static final SubLList $list92 = list(makeSymbol("RBP-PARSE-FILTER-SUBCOLLECTION-ARGS"));

    private static final SubLList $list93 = list(makeSymbol("RBP-PARSE-FILTER-NONAGENTIVE-ACTORS"), makeSymbol("RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS"));

    static private final SubLList $list94 = list(makeSymbol("RBP-UNLIKELY-SUBCOLLECTION-NAUT-WRT-OBJECT?"));

    private static final SubLList $list95 = list(makeSymbol("RBP-UNLIKELY-SUBCOLLECTION-NAUT-BLOCK-WRT-OBJECT?"));

    private static final SubLList $list100 = list(makeSymbol("BLOCK"), makeSymbol("DIAGNOSTICS"));

    private static final SubLString $str101$Abandoning_parse__S_for__S = makeString("Abandoning parse ~S for ~S");

    private static final SubLList $list102 = list(makeSymbol("BLOCK"), makeSymbol("FAILED-THESE-FILTERS"), makeSymbol("DISCONFIDENCE"));

    private static final SubLList $list103 = list(makeSymbol("STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list105 = list(makeSymbol("NCP-INITIALIZE-METRICS"));

    private static final SubLSymbol NCP_HERALD_START = makeSymbol("NCP-HERALD-START");

    static private final SubLList $list107 = list(makeSymbol("TIME"));

    private static final SubLList $list110 = list(list(makeSymbol("NCP-REPORT-METRICS"), makeSymbol("TIME")));

    private static final SubLSymbol RBP_RULE_FORT_P = makeSymbol("RBP-RULE-FORT-P");

    private static final SubLSymbol RBP_FIND_RULE_FROM_CYCL = makeSymbol("RBP-FIND-RULE-FROM-CYCL");

    private static final SubLSymbol $sym117$STORE = makeUninternedSymbol("STORE");

    private static final SubLSymbol WITH_NEW_PROBLEM_STORE = makeSymbol("WITH-NEW-PROBLEM-STORE");

    private static final SubLSymbol $ncp_problem_store$ = makeSymbol("*NCP-PROBLEM-STORE*");

    private static final SubLString $str120$__Total_parse_time___4_2F_seconds = makeString("~&Total parse time: ~4,2F seconds.~%");

    private static final SubLString $str121$__Spent__4_2F_seconds_actually_pa = makeString("~&Spent ~4,2F seconds actually parsing.~%");

    private static final SubLString $str122$__Now_parsing__S___ = makeString("~&Now parsing ~S.~%");

    private static final SubLSymbol $sym123$NPP_TERM_COMPLEXITY__ = makeSymbol("NPP-TERM-COMPLEXITY-<");

    private static final SubLSymbol $sym124$_ = makeSymbol(">");

    private static final SubLString $str125$___S_didn_t_use_the_required_rule = makeString("~&~S didn't use the required rules: ~S.~%~%");

    private static final SubLString $str126$___S_was_too_long_or_too_short___ = makeString("~&~S was too long or too short.~%~%");

    private static final SubLString $str127$__The__S_form_of____S___is_being_ = makeString("~&The ~S form of~% ~S~% is being filtered out because it is not nominal.~%~%");

    private static final SubLFloat $float$1_05 = makeDouble(1.05);

    private static final SubLFloat $float$0_95 = makeDouble(0.95);

    private static final SubLSymbol LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION = makeSymbol("LEXIFICATION-SENTENCE-FROM-PREFERRED-LEXIFICATION-ASSERTION");

    private static final SubLObject $const133$SubcollectionRelationFunction_Typ = reader_make_constant_shell("SubcollectionRelationFunction-TypeLevel");

    private static final SubLSymbol $sym134$NPP_GENL_ = makeSymbol("NPP-GENL?");

    private static final SubLSymbol $sym135$NPP_ISA_ = makeSymbol("NPP-ISA?");

    private static final SubLSymbol SUBCOLLECTION_FUNCTION_NAUT_PRED = makeSymbol("SUBCOLLECTION-FUNCTION-NAUT-PRED");

    private static final SubLString $str139$Strengthening__S_to_use__S = makeString("Strengthening ~S to use ~S");

    private static final SubLList $list141 = list(makeSymbol("DENOT-ARG0"), makeSymbol("DENOT-ARG1"), makeSymbol("DENOT-ARG2"));

    private static final SubLObject $$State_Geopolitical = reader_make_constant_shell("State-Geopolitical");

    private static final SubLSymbol $sym146$STRING_ = makeSymbol("STRING=");

    private static final SubLSymbol $sym152$RBP_PARSE_AND_CONFIDENCE_ = makeSymbol("RBP-PARSE-AND-CONFIDENCE=");

    private static final SubLSymbol $sym153$NPP_PARSE_ = makeSymbol("NPP-PARSE=");

    private static final SubLSymbol $sym154$RBP_PARSE_AND_CONFIDENCE_ = makeSymbol("RBP-PARSE-AND-CONFIDENCE?");

    private static final SubLSymbol INTERVAL_TOKEN_LENGTH = makeSymbol("INTERVAL-TOKEN-LENGTH");

    private static final SubLSymbol RBP_FLOORS_CACHED = makeSymbol("RBP-FLOORS-CACHED");

    private static final SubLSymbol $rbp_floors_cached_caching_state$ = makeSymbol("*RBP-FLOORS-CACHED-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol $sym165$RBP_OK_NAME_CACHED_ = makeSymbol("RBP-OK-NAME-CACHED?");

    private static final SubLString $$$the_ = makeString("the ");

    private static final SubLObject $$abbreviationString_PN = reader_make_constant_shell("abbreviationString-PN");

    private static final SubLSymbol $sym169$_RBP_OK_NAME_CACHED__CACHING_STATE_ = makeSymbol("*RBP-OK-NAME-CACHED?-CACHING-STATE*");

    private static final SubLSymbol $sym172$RBP_NAME_BLOCK_ = makeSymbol("RBP-NAME-BLOCK?");

    private static final SubLSymbol $sym173$RBP_NAME_BLOCK_PRED_AMONG_FLOORS_ = makeSymbol("RBP-NAME-BLOCK-PRED-AMONG-FLOORS?");

    private static final SubLSymbol $sym174$INTERVAL_SPAN_PRECEDES_ = makeSymbol("INTERVAL-SPAN-PRECEDES?");

    private static final SubLList $list176 = list(makeSymbol("RBP-RULE"), makeSymbol("DTR1-ID"), makeSymbol("DTR2-ID"));

    private static final SubLString $str177$_S__ = makeString("~S~%");

    private static final SubLObject $$ncRuleTemplate_Compact = reader_make_constant_shell("ncRuleTemplate-Compact");

    private static final SubLList $list181 = list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("FN")), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("INDEXICAL1")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")),
	    list($BIND, makeSymbol("BIN-PRED")), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("INDEXICAL2")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")));

    private static final SubLSymbol INDEXICAL2 = makeSymbol("INDEXICAL2");

    private static final SubLSymbol INDEXICAL1 = makeSymbol("INDEXICAL1");

    private static final SubLSymbol RBP_SEMANTIC_CONSTRAINT_P = makeSymbol("RBP-SEMANTIC-CONSTRAINT-P");

    private static final SubLSymbol RBP_WORD_UNIT_CONSTRAINT_P = makeSymbol("RBP-WORD-UNIT-CONSTRAINT-P");

    private static final SubLList $list190 = list(makeSymbol("FUNC"), makeSymbol("FOCAL-COL"), makeSymbol("PRED"), makeSymbol("OTHER-COL"));

    private static final SubLObject $const191$SubcollectionRelationFunction_Ins = reader_make_constant_shell("SubcollectionRelationFunction-InstanceLevel");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $sym197$_COL = makeSymbol("?COL");

    private static final SubLList $list199 = list(makeSymbol("?COL"));

    private static final SubLString $str201$____but__A_has_to_be_an_instance_ = makeString("... but ~A has to be an instance of ~A in ~A and isn't");

    private static final SubLString $str202$____but__A_has_to_intersect__A_in = makeString("... but ~A has to intersect ~A in ~A and doesn't");

    private static final SubLString $str203$____but__A_can_t_be_an_instance_o = makeString("... but ~A can't be an instance of ~A in ~A and is");

    private static final SubLString $str204$____but__A_can_t_be_a_spec_of__A_ = makeString("... but ~A can't be a spec of ~A in ~A and is");

    private static final SubLString $str205$interArgIsa_D__D = makeString("interArgIsa~D-~D");

    private static final SubLString $str206$Couldn_t_find_inter_arg_isa_predi = makeString("Couldn't find inter-arg-isa predicate from ~S to ~S");

    private static final SubLString $str207$interArgNotIsa_D__D = makeString("interArgNotIsa~D-~D");

    private static final SubLString $str208$Couldn_t_find_inter_arg_not_isa_p = makeString("Couldn't find inter-arg-not-isa predicate from ~S to ~S");

    private static final SubLList $list209 = list(makeSymbol("SEMX-PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLObject $$interArgIsa1_2 = reader_make_constant_shell("interArgIsa1-2");

    private static final SubLString $str211$___but_it_fails_the_inter_arg_con = makeString("...but it fails the inter-arg constraint:~%   ~A");

    private static final SubLObject $$interArgIsa2_1 = reader_make_constant_shell("interArgIsa2-1");

    private static final SubLObject $$interArgNotIsa1_2 = reader_make_constant_shell("interArgNotIsa1-2");

    private static final SubLList $list214 = list(makeSymbol("FUNC"), makeSymbol("COL1"), makeSymbol("SEMX-PRED"), makeSymbol("COL2"));

    private static final SubLObject $const215$SubcollectionRelationFunction_Can = reader_make_constant_shell("SubcollectionRelationFunction-Canonical");

    private static final SubLString $str217$_A__ = makeString("~A~%");

    private static final SubLString $str221$___but_it_failed_the_groupMembers = makeString("...but it failed the groupMembers wff-workaround (~A are groups of ~A, of which ~A is not a spec)");

    private static final SubLString $str223$___but_the___CityNamedFn_arg2_doe = makeString("...but the #$CityNamedFn arg2 doesn't match the #$cityInState arg2: ~A vs ~A");

    private static final SubLString $str226$___but_it_failed_the_strictly_fun = makeString("...but it failed the strictly-functional test: only (~A ~A ~A) is valid");

    private static final SubLString $str228$__Trying_this_block_pair_____S___ = makeString("~%Trying this block pair:~% ~S (~S) (~S)~% ~S (~S) (~S).~%");

    private static final SubLString $str229$__Rule__S_yielded____a___for__S__ = makeString("~&Rule ~S yielded~% ~a~% for ~S+~S.~%");

    private static final SubLString $str231$___but_it_failed_the_wff_checker_ = makeString("...but it failed the wff-checker.~%");

    private static final SubLList $list233 = list(makeSymbol("JUST-THIS-ARG"), makeSymbol("FORMULA"));

    private static final SubLString $str234$___but_the_desired_FormulaArgFn__ = makeString("...but the desired FormulaArgFn (~D) exceeds the semx arity (~D).~%");

    private static final SubLString $str237$___but_I_was_unable_to_verify__S_ = makeString("...but I was unable to verify ~S~%");

    private static final SubLList $list239 = list(list(makeKeyword("POS"), $HEAD), list($PRED, $HEAD), list(makeKeyword("POS"), makeKeyword("MODIFIER")), list($PRED, makeKeyword("MODIFIER")));

    private static final SubLList $list240 = list(makeSymbol("C-TYPE"), makeSymbol("O-TYPE"));

    private static final SubLSymbol RBP_RB_RULES_MATCHING_CLOSED_SPECS = makeSymbol("RBP-RB-RULES-MATCHING-CLOSED-SPECS");

    private static final SubLSymbol $rbp_rb_rules_matching_closed_specs_caching_state$ = makeSymbol("*RBP-RB-RULES-MATCHING-CLOSED-SPECS-CACHING-STATE*");

    private static final SubLSymbol RBP_VERIFY = makeSymbol("RBP-VERIFY");

    private static final SubLSymbol RBP_RB_INITIAL_SEARCH_NO_TRACING = makeSymbol("RBP-RB-INITIAL-SEARCH-NO-TRACING");

    private static final SubLString $str250$__The_blocks_failed_an_inter_cons = makeString("~%The blocks failed an inter-constraint in ~S on ~S.~%");

    private static final SubLSymbol INTER_CONSTRAINTS_FROM_RULE = makeSymbol("INTER-CONSTRAINTS-FROM-RULE");

    private static final SubLSymbol $inter_constraints_from_rule_caching_state$ = makeSymbol("*INTER-CONSTRAINTS-FROM-RULE-CACHING-STATE*");

    private static final SubLList $list253 = list(makeSymbol("CON-KW"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLList $list254 = list(makeKeyword("modifier"), makeKeyword("MODIFIER"));

    private static final SubLString $str259$__Semantics_are__S_and__S___in_te = makeString("~&Semantics are ~S and ~S~% in template ~S.~%");

    private static final SubLSymbol $sym262$NPP_GENL_PRED_ = makeSymbol("NPP-GENL-PRED?");

    private static final SubLSymbol $sym268$NPP_TYPE_GENL_ = makeSymbol("NPP-TYPE-GENL?");

    private static final SubLSymbol NC_BLOCK_WU = makeSymbol("NC-BLOCK-WU");

    private static final SubLString $$$ing = makeString("ing");

    private static final SubLString $$$ion = makeString("ion");

    private static final SubLObject $$agentive_Sg = reader_make_constant_shell("agentive-Sg");

    private static final SubLString $$$ment = makeString("ment");

    static private final SubLList $list280 = list(makeSymbol("MOD"), makeSymbol("HEAD"));

    private static final SubLFloat $float$0_75 = makeDouble(0.75);

    private static final SubLFloat $float$0_25 = makeDouble(0.25);

    private static final SubLSymbol DATE_PARSE_BLOCK = makeSymbol("DATE-PARSE-BLOCK");

    private static final SubLSymbol DATE_PARSE_BLOCK_P = makeSymbol("DATE-PARSE-BLOCK-P");

    private static final SubLList $list286 = list(makeSymbol("SUBCOL-NAUT"), makeSymbol("CONFIDENCE"));

    private static final SubLList $list287 = list(makeKeyword("SUBCOL-NAUT"), makeKeyword("CONFIDENCE"));

    private static final SubLList $list288 = list(makeSymbol("DATE-PARSE-BLOCK-SUBCOL-NAUT"), makeSymbol("DATE-PARSE-BLOCK-CONFIDENCE"));

    private static final SubLList $list289 = list(makeSymbol("_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT"), makeSymbol("_CSETF-DATE-PARSE-BLOCK-CONFIDENCE"));

    private static final SubLSymbol DATE_PARSE_BLOCK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DATE-PARSE-BLOCK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list292 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DATE-PARSE-BLOCK-P"));

    private static final SubLSymbol DATE_PARSE_BLOCK_SUBCOL_NAUT = makeSymbol("DATE-PARSE-BLOCK-SUBCOL-NAUT");

    private static final SubLSymbol _CSETF_DATE_PARSE_BLOCK_SUBCOL_NAUT = makeSymbol("_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT");

    private static final SubLSymbol DATE_PARSE_BLOCK_CONFIDENCE = makeSymbol("DATE-PARSE-BLOCK-CONFIDENCE");

    private static final SubLSymbol _CSETF_DATE_PARSE_BLOCK_CONFIDENCE = makeSymbol("_CSETF-DATE-PARSE-BLOCK-CONFIDENCE");

    private static final SubLSymbol MAKE_DATE_PARSE_BLOCK = makeSymbol("MAKE-DATE-PARSE-BLOCK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DATE_PARSE_BLOCK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DATE-PARSE-BLOCK-METHOD");

    static private final SubLList $list305 = list(makeSymbol("EVENT"), makeSymbol("DATE-VAR"));

    private static final SubLSymbol $sym306$_EVENT = makeSymbol("?EVENT");

    private static final SubLString $str309$_____todo_handle_dates_with_multi = makeString("*** @todo handle dates with multiple variables");

    private static final SubLSymbol $sym310$DATE_PARSE_COMPLEXITY__ = makeSymbol("DATE-PARSE-COMPLEXITY->");

    private static final SubLObject $$Agent_Generic = reader_make_constant_shell("Agent-Generic");

    private static final SubLString $str314$rbp_parse_filter_nonagentive_acto = makeString("rbp-parse-filter-nonagentive-actors");

    private static final SubLSymbol RBP_ALL_EXISTS_MATCHES = makeSymbol("RBP-ALL-EXISTS-MATCHES");

    private static final SubLSymbol $sym323$_TYPE = makeSymbol("?TYPE");

    private static final SubLString $str324$Timed_out_checking___relationAllE = makeString("Timed out checking #$relationAllExists, etc. after ~S seconds on~% ~S ~S ~S");

    static private final SubLList $list329 = list(makeSymbol("?TYPE"));

    private static final SubLString $str333$rbp_parse_prefer_rmp_matches_had_ = makeString("rbp-parse-prefer-rmp-matches had to punt");

    private static final SubLString $str340$doesn_t_match___relationAllExists = makeString("doesn't match #$relationAllExists expectations for ~A");

    private static final SubLObject $$instrumentType_Generic = reader_make_constant_shell("instrumentType-Generic");

    private static final SubLString $str343$rbp_parse_filter_unlikely_instrum = makeString("rbp-parse-filter-unlikely-instrumentals");

    private static final SubLString $str344$rbp_parse_filter_unlikely_instrum = makeString("rbp-parse-filter-unlikely-instrumentals had to punt");

    private static final SubLString $str345$rbp_parse_filter_subcollection_ar = makeString("rbp-parse-filter-subcollection-args");

    private static final SubLString $$$statistically_unlikely_object = makeString("statistically unlikely object");

    private static final SubLSymbol $sym348$RBP_UNLIKELY_SUBCOLLECTION_NAUT_ = makeSymbol("RBP-UNLIKELY-SUBCOLLECTION-NAUT?");

    private static final SubLSymbol $sym349$_RBP_UNLIKELY_SUBCOLLECTION_NAUT__CACHING_STATE_ = makeSymbol("*RBP-UNLIKELY-SUBCOLLECTION-NAUT?-CACHING-STATE*");

    private static final SubLList $list351 = list(reader_make_constant_shell("nonPlural-Generic"));

    private static final SubLSymbol PARSE_AS_DENOT_OR_NOUN_COMPOUND = makeSymbol("PARSE-AS-DENOT-OR-NOUN-COMPOUND");

    private static final SubLSymbol PARSE_DEVERBAL_COMPOUND_AS_FALLBACK = makeSymbol("PARSE-DEVERBAL-COMPOUND-AS-FALLBACK");

    private static final SubLSymbol PARSE_STRING_AS_DATE_FALLBACK_ESCALATED = makeSymbol("PARSE-STRING-AS-DATE-FALLBACK-ESCALATED");

    private static final SubLSymbol PARSE_ADJ_INITIAL_COMPOUND = makeSymbol("PARSE-ADJ-INITIAL-COMPOUND");

    private static final SubLString $str359$No_mode_specified_for_initialize_ = makeString("No mode specified for initialize-ncs-formats");

    private static final SubLString $str361$investigating___D__A_____ = makeString("investigating #~D ~A...~%");

    private static final SubLString $str363$parse_of__S_yielded___ = makeString("parse of ~S yielded:~%");

    private static final SubLSymbol $FLAG_BAD_PILE = makeKeyword("FLAG-BAD-PILE");

    private static final SubLString $str365$______and_also________ = makeString("..... and also .....~%");

    private static final SubLString $str367$____denots_are__A__ = makeString("... denots are ~A~%");

    private static final SubLString $str369$________________________________ = makeString("==============================~%");

    private static final SubLSymbol $COUNT_WITH_PARSES = makeKeyword("COUNT-WITH-PARSES");

    private static final SubLString $str371$__Total_compounds_with_any_parses = makeString("~%Total compounds with any parses: ~A~%");

    private static final SubLString $str373$Total_parses_found___A__ = makeString("Total parses found: ~A~%");

    private static final SubLString $str375$Percent_of_parses_approved___5_2F = makeString("Percent of parses approved: ~5,2F~%");

    private static final SubLString $str377$Total_violations___A__ = makeString("Total violations: ~A~%");

    private static final SubLString $str379$Note___A_parses_reformulated_to_c = makeString("Note: ~A parses reformulated to constants~%");

    private static final SubLString $str381$Compounds_wanting_denots___A_____ = makeString("Compounds wanting denots: ~A~%... having any: ~A~%... total: ~A~%");

    private static final SubLSymbol $RULES_AND_PARSE = makeKeyword("RULES-AND-PARSE");

    private static final SubLString $str383$from__S___A__ = makeString("from ~S: ~A~%");

    private static final SubLSymbol $FALLBACK_AND_PARSE = makeKeyword("FALLBACK-AND-PARSE");

    private static final SubLString $str385$_A_A__ = makeString("~A~A~%");

    private static final SubLString $str387$_A__ = makeString("~A: ");

    private static final SubLString $str389$Uses_of__A___A_total___A_good___A = makeString("Uses of ~A: ~A total, ~A good, ~A bad~%");

    private static final SubLList $list390 = list(makeSymbol("STREAM"), makeSymbol("CAT"), makeSymbol("&BODY"), makeSymbol("FORMAT-AND-ARGS"));

    private static final SubLSymbol NCS_FORMAT = makeSymbol("NCS-FORMAT");

    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLString $str395$_cyc_departments_nl_doc_stats_src = makeString("/cyc/departments/nl/doc/stats/src/acquaint-10000");

    private static final SubLString $str396$_cyc_departments_nl_doc_stats_kb = makeString("/cyc/departments/nl/doc/stats/kb");

    private static final SubLString $str397$_ = makeString(".");

    private static final SubLString $str398$ = makeString("");

    private static final SubLString $str399$_ = makeString("-");

    private static final SubLString $str400$_ncr_stats = makeString(".ncr.stats");

    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");

    private static final SubLString $str405$Couldn_t_open_output_stream__woul = makeString("Couldn't open output stream, would be ~A");

    private static final SubLString $str406$would_print_to__S__ = makeString("would print to ~S~%");

    private static final SubLString $str407$storing_results_in__S__cutoff_is_ = makeString("storing results in ~S, cutoff is ~A~%");

    private static final SubLString $$$from_fallback = makeString("from fallback");

    private static final SubLList $list413 = cons(makeSymbol("RULE"), makeSymbol("TOTAL-USES"));

    private static final SubLString $str414$_cyc_projects_daml_call_thesaurus = makeString("/cyc/projects/daml/call-thesaurus/parses.txt");

    private static final SubLString $str415$_ = makeString("\"");

    private static final SubLString $str416$_ = makeString("(");

    private static final SubLString $str417$skipping__A______ = makeString("skipping ~A ...  ");

    private static final SubLString $str418$investigating__A______ = makeString("investigating ~A ...~%");

    private static final SubLString $str420$_S_______________________________ = makeString("~S~%==============================~%");

    private static final SubLString $str421$found_something_for__A_of__A_entr = makeString("found something for ~A of ~A entries, ignoring aircraft models");

    private static final SubLList $list422 = list(list(makeSymbol("NAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $rbp_show_successful_rulesP$ = makeSymbol("*RBP-SHOW-SUCCESSFUL-RULES?*");

    private static final SubLString $str427$Skipping_this_test_as__A_doesn_t_ = makeString("Skipping this test as ~A doesn't exist in the KB");

    // Definitions
    /**
     * For #$ncRuleConstraint.
     */
    @LispMethod(comment = "For #$ncRuleConstraint.")
    public static final SubLObject add_nc_rule_constraint_alt(SubLObject argument, SubLObject assertion) {
	clear_inter_constraints_from_rule();
	rbp_rule_bank.clear_noun_compound_constraint_string_specs();
	pph_noun_compound.clear_pph_nc_rule_list();
	return rbp_rule_bank.rbp_clear_rule_bank();
    }

    // Definitions
    /**
     * For #$ncRuleConstraint.
     */
    @LispMethod(comment = "For #$ncRuleConstraint.")
    public static SubLObject add_nc_rule_constraint(final SubLObject argument, final SubLObject assertion) {
	clear_inter_constraints_from_rule();
	rbp_rule_bank.clear_noun_compound_constraint_string_specs();
	pph_noun_compound.clear_pph_nc_rule_list();
	return rbp_rule_bank.rbp_clear_rule_bank();
    }

    /**
     * For #$ncRuleConstraint.
     */
    @LispMethod(comment = "For #$ncRuleConstraint.")
    public static final SubLObject remove_nc_rule_constraint_alt(SubLObject argument, SubLObject assertion) {
	clear_inter_constraints_from_rule();
	pph_noun_compound.clear_pph_nc_rule_list();
	return rbp_rule_bank.rbp_clear_rule_bank();
    }

    /**
     * For #$ncRuleConstraint.
     */
    @LispMethod(comment = "For #$ncRuleConstraint.")
    public static SubLObject remove_nc_rule_constraint(final SubLObject argument, final SubLObject assertion) {
	clear_inter_constraints_from_rule();
	pph_noun_compound.clear_pph_nc_rule_list();
	return rbp_rule_bank.rbp_clear_rule_bank();
    }

    /**
     * For #$ncRuleTemplate
     */
    @LispMethod(comment = "For #$ncRuleTemplate")
    public static final SubLObject add_nc_rule_template_alt(SubLObject argument, SubLObject assertion) {
	clear_inter_constraints_from_rule();
	return rbp_rule_bank.rbp_clear_rule_bank();
    }

    /**
     * For #$ncRuleTemplate
     */
    @LispMethod(comment = "For #$ncRuleTemplate")
    public static SubLObject add_nc_rule_template(final SubLObject argument, final SubLObject assertion) {
	clear_inter_constraints_from_rule();
	return rbp_rule_bank.rbp_clear_rule_bank();
    }

    /**
     * For #$ncRuleTemplate
     */
    @LispMethod(comment = "For #$ncRuleTemplate")
    public static final SubLObject remove_nc_rule_template_alt(SubLObject argument, SubLObject assertion) {
	clear_inter_constraints_from_rule();
	return rbp_rule_bank.rbp_clear_rule_bank();
    }

    /**
     * For #$ncRuleTemplate
     */
    @LispMethod(comment = "For #$ncRuleTemplate")
    public static SubLObject remove_nc_rule_template(final SubLObject argument, final SubLObject assertion) {
	clear_inter_constraints_from_rule();
	return rbp_rule_bank.rbp_clear_rule_bank();
    }

    public static final SubLObject noun_compound_parse_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	pprint_nc_parse(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject noun_compound_parse_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	pprint_nc_parse(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject noun_compound_parse_p_alt(SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_parse_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject noun_compound_parse_p(final SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_parse_native.class ? T : NIL;
    }

    public static final SubLObject nc_parse_unique_id_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_PARSE_P);
	return v_object.getField2();
    }

    public static SubLObject nc_parse_unique_id(final SubLObject v_object) {
	assert NIL != noun_compound_parse_p(v_object) : "! noun_compound_parser.noun_compound_parse_p(v_object) " + "noun_compound_parser.noun_compound_parse_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject nc_parse_input_string_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_PARSE_P);
	return v_object.getField3();
    }

    public static SubLObject nc_parse_input_string(final SubLObject v_object) {
	assert NIL != noun_compound_parse_p(v_object) : "! noun_compound_parser.noun_compound_parse_p(v_object) " + "noun_compound_parser.noun_compound_parse_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject nc_parse_input_strings_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_PARSE_P);
	return v_object.getField4();
    }

    public static SubLObject nc_parse_input_strings(final SubLObject v_object) {
	assert NIL != noun_compound_parse_p(v_object) : "! noun_compound_parser.noun_compound_parse_p(v_object) " + "noun_compound_parser.noun_compound_parse_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject nc_parse_chart_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_PARSE_P);
	return v_object.getField5();
    }

    public static SubLObject nc_parse_chart(final SubLObject v_object) {
	assert NIL != noun_compound_parse_p(v_object) : "! noun_compound_parser.noun_compound_parse_p(v_object) " + "noun_compound_parser.noun_compound_parse_p error :" + v_object;
	return v_object.getField5();
    }

    public static final SubLObject _csetf_nc_parse_unique_id_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_PARSE_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_nc_parse_unique_id(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_parse_p(v_object) : "! noun_compound_parser.noun_compound_parse_p(v_object) " + "noun_compound_parser.noun_compound_parse_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_nc_parse_input_string_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_PARSE_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_nc_parse_input_string(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_parse_p(v_object) : "! noun_compound_parser.noun_compound_parse_p(v_object) " + "noun_compound_parser.noun_compound_parse_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_nc_parse_input_strings_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_PARSE_P);
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_nc_parse_input_strings(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_parse_p(v_object) : "! noun_compound_parser.noun_compound_parse_p(v_object) " + "noun_compound_parser.noun_compound_parse_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_nc_parse_chart_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_PARSE_P);
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_nc_parse_chart(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_parse_p(v_object) : "! noun_compound_parser.noun_compound_parse_p(v_object) " + "noun_compound_parser.noun_compound_parse_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static final SubLObject make_noun_compound_parse_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_parse_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($UNIQUE_ID)) {
			_csetf_nc_parse_unique_id(v_new, current_value);
		    } else {
			if (pcase_var.eql($INPUT_STRING)) {
			    _csetf_nc_parse_input_string(v_new, current_value);
			} else {
			    if (pcase_var.eql($INPUT_STRINGS)) {
				_csetf_nc_parse_input_strings(v_new, current_value);
			    } else {
				if (pcase_var.eql($CHART)) {
				    _csetf_nc_parse_chart(v_new, current_value);
				} else {
				    Errors.error($str_alt24$Invalid_slot__S_for_construction_, current_arg);
				}
			    }
			}
		    }
		}
	    }
	    return v_new;
	}
    }

    public static SubLObject make_noun_compound_parse(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_parse_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($UNIQUE_ID)) {
		_csetf_nc_parse_unique_id(v_new, current_value);
	    } else if (pcase_var.eql($INPUT_STRING)) {
		_csetf_nc_parse_input_string(v_new, current_value);
	    } else if (pcase_var.eql($INPUT_STRINGS)) {
		_csetf_nc_parse_input_strings(v_new, current_value);
	    } else if (pcase_var.eql($CHART)) {
		_csetf_nc_parse_chart(v_new, current_value);
	    } else {
		Errors.error($str25$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_noun_compound_parse(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_NOUN_COMPOUND_PARSE, FOUR_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $UNIQUE_ID, nc_parse_unique_id(obj));
	funcall(visitor_fn, obj, $SLOT, $INPUT_STRING, nc_parse_input_string(obj));
	funcall(visitor_fn, obj, $SLOT, $INPUT_STRINGS, nc_parse_input_strings(obj));
	funcall(visitor_fn, obj, $SLOT, $CHART, nc_parse_chart(obj));
	funcall(visitor_fn, obj, $END, MAKE_NOUN_COMPOUND_PARSE, FOUR_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_noun_compound_parse_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_noun_compound_parse(obj, visitor_fn);
    }

    public static final SubLObject pprint_nc_parse_alt(SubLObject nc_parse, SubLObject stream, SubLObject depth) {
	if (stream == UNPROVIDED) {
	    stream = NIL;
	}
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	format(stream, $str_alt26$____NC_PARSE__ID___S__, nc_parse_unique_id(nc_parse));
	format(stream, $str_alt27$__Input_string___S__, nc_parse_input_string(nc_parse));
	format(stream, $str_alt28$_Input_strings___S__, nc_parse_input_strings(nc_parse));
	format(stream, $str_alt29$_________Chart___S__, nc_parse_chart(nc_parse));
	return nc_parse;
    }

    public static SubLObject pprint_nc_parse(final SubLObject nc_parse, SubLObject stream, SubLObject depth) {
	if (stream == UNPROVIDED) {
	    stream = NIL;
	}
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	format(stream, $str32$____NC_PARSE__ID___S__, nc_parse_unique_id(nc_parse));
	format(stream, $str33$__Input_string___S__, nc_parse_input_string(nc_parse));
	format(stream, $str34$_Input_strings___S__, nc_parse_input_strings(nc_parse));
	format(stream, $str35$_________Chart___S__, nc_parse_chart(nc_parse));
	return nc_parse;
    }

    public static final SubLObject new_nc_parse_alt(SubLObject input_string) {
	if (input_string == UNPROVIDED) {
	    input_string = NIL;
	}
	{
	    SubLObject parse = make_noun_compound_parse(UNPROVIDED);
	    _csetf_nc_parse_unique_id(parse, $nc_parse_id_counter$.getGlobalValue());
	    $nc_parse_id_counter$.setGlobalValue(add($nc_parse_id_counter$.getGlobalValue(), ONE_INTEGER));
	    _csetf_nc_parse_input_string(parse, input_string);
	    return parse;
	}
    }

    public static SubLObject new_nc_parse(SubLObject input_string) {
	if (input_string == UNPROVIDED) {
	    input_string = NIL;
	}
	final SubLObject parse = make_noun_compound_parse(UNPROVIDED);
	_csetf_nc_parse_unique_id(parse, $nc_parse_id_counter$.getGlobalValue());
	$nc_parse_id_counter$.setGlobalValue(add($nc_parse_id_counter$.getGlobalValue(), ONE_INTEGER));
	_csetf_nc_parse_input_string(parse, input_string);
	return parse;
    }

    public static final SubLObject rbp_trace_alt() {
	rbp_show_rules();
	return T;
    }

    public static SubLObject rbp_trace() {
	rbp_show_rules();
	return T;
    }

    public static final SubLObject with_rbp_trace_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject body = current;
	    return listS(CLET, $list_alt31, append(body, NIL));
	}
    }

    public static SubLObject with_rbp_trace(final SubLObject macroform, final SubLObject environment) {
	final SubLObject datum = macroform.rest();
	final SubLObject body;
	final SubLObject current = body = datum;
	return listS(CLET, $list37, append(body, NIL));
    }

    public static final SubLObject rbp_untrace_alt() {
	rbp_hide_rules();
	rbp_untrace_all_rules();
	return NIL;
    }

    public static SubLObject rbp_untrace() {
	rbp_hide_rules();
	rbp_untrace_all_rules();
	return NIL;
    }

    public static final SubLObject rbp_show_rules_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $rbp_show_successful_rulesP$.setDynamicValue(T, thread);
	    return $rbp_show_successful_rulesP$.getDynamicValue(thread);
	}
    }

    public static SubLObject rbp_show_rules() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	$rbp_show_successful_rulesP$.setDynamicValue(T, thread);
	return $rbp_show_successful_rulesP$.getDynamicValue(thread);
    }

    public static final SubLObject rbp_hide_rules_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $rbp_show_successful_rulesP$.setDynamicValue(NIL, thread);
	    return $rbp_show_successful_rulesP$.getDynamicValue(thread);
	}
    }

    public static SubLObject rbp_hide_rules() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	$rbp_show_successful_rulesP$.setDynamicValue(NIL, thread);
	return $rbp_show_successful_rulesP$.getDynamicValue(thread);
    }

    /**
     * Return list of currently traced rule ids.
     */
    @LispMethod(comment = "Return list of currently traced rule ids.")
    public static final SubLObject rbp_traced_rules_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $rbp_traced_rules$.getDynamicValue(thread);
	}
    }

    /**
     * Return list of currently traced rule ids.
     */
    @LispMethod(comment = "Return list of currently traced rule ids.")
    public static SubLObject rbp_traced_rules() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $rbp_traced_rules$.getDynamicValue(thread);
    }

    /**
     * Given RULE-CYCL, start tracing the rule whose CycL that is.
     */
    @LispMethod(comment = "Given RULE-CYCL, start tracing the rule whose CycL that is.")
    public static final SubLObject rbp_trace_rule_alt(SubLObject rule_cycl) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    rbp_rule_bank.rbp_rb_check_initialization();
	    {
		SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl(rule_cycl, UNPROVIDED);
		if (NIL != rbp_rule_bank.recursive_block_parser_rule_p(rule)) {
		    {
			SubLObject item_var = rule;
			if (NIL == member(item_var, $rbp_traced_rules$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
			    $rbp_traced_rules$.setDynamicValue(cons(item_var, $rbp_traced_rules$.getDynamicValue(thread)), thread);
			}
		    }
		}
	    }
	    return Mapping.mapcar(RBP_RULE_CYCL, $rbp_traced_rules$.getDynamicValue(thread));
	}
    }

    /**
     * Given RULE-CYCL, start tracing the rule whose CycL that is.
     */
    @LispMethod(comment = "Given RULE-CYCL, start tracing the rule whose CycL that is.")
    public static SubLObject rbp_trace_rule(final SubLObject rule_cycl) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	rbp_rule_bank.rbp_rb_check_initialization();
	final SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl(rule_cycl, UNPROVIDED);
	if (NIL != rbp_rule_bank.recursive_block_parser_rule_p(rule)) {
	    final SubLObject item_var = rule;
	    if (NIL == member(item_var, $rbp_traced_rules$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
		$rbp_traced_rules$.setDynamicValue(cons(item_var, $rbp_traced_rules$.getDynamicValue(thread)), thread);
	    }
	}
	return Mapping.mapcar(RBP_RULE_CYCL, $rbp_traced_rules$.getDynamicValue(thread));
    }

    /**
     * Stop tracing all rules.
     */
    @LispMethod(comment = "Stop tracing all rules.")
    public static final SubLObject rbp_untrace_all_rules_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $rbp_traced_rules$.setDynamicValue(NIL, thread);
	    return $rbp_traced_rules$.getDynamicValue(thread);
	}
    }

    /**
     * Stop tracing all rules.
     */
    @LispMethod(comment = "Stop tracing all rules.")
    public static SubLObject rbp_untrace_all_rules() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	$rbp_traced_rules$.setDynamicValue(NIL, thread);
	return $rbp_traced_rules$.getDynamicValue(thread);
    }

    /**
     * Given RULE-CYCL, stop tracing the corresponding RPB rule.
     */
    @LispMethod(comment = "Given RULE-CYCL, stop tracing the corresponding RPB rule.")
    public static final SubLObject rbp_untrace_rule_alt(SubLObject rule_cycl) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl(rule_cycl, UNPROVIDED);
		$rbp_traced_rules$.setDynamicValue(remove(rule, $rbp_traced_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
	    }
	    return $rbp_traced_rules$.getDynamicValue(thread);
	}
    }

    /**
     * Given RULE-CYCL, stop tracing the corresponding RPB rule.
     */
    @LispMethod(comment = "Given RULE-CYCL, stop tracing the corresponding RPB rule.")
    public static SubLObject rbp_untrace_rule(final SubLObject rule_cycl) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl(rule_cycl, UNPROVIDED);
	$rbp_traced_rules$.setDynamicValue(remove(rule, $rbp_traced_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
	return $rbp_traced_rules$.getDynamicValue(thread);
    }

    public static final SubLObject just_one_spaceP_alt(SubLObject string) {
	return list_utilities.lengthE(string_utilities.split_string(string, UNPROVIDED), TWO_INTEGER, UNPROVIDED);
    }

    public static SubLObject just_one_spaceP(final SubLObject string) {
	return list_utilities.lengthE(string_utilities.split_string(string, UNPROVIDED), TWO_INTEGER, UNPROVIDED);
    }

    public static final SubLObject noun_compound_block_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	pprint_nc_block(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject noun_compound_block_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	pprint_nc_block(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject noun_compound_block_p_alt(SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_block_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject noun_compound_block_p(final SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_block_native.class ? T : NIL;
    }

    public static final SubLObject nc_block_unique_id_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.getField2();
    }

    public static SubLObject nc_block_unique_id(final SubLObject v_object) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject nc_block_span_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.getField3();
    }

    public static SubLObject nc_block_span_index(final SubLObject v_object) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject nc_block_confidence_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.getField4();
    }

    public static SubLObject nc_block_confidence(final SubLObject v_object) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject nc_block_denot_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.getField5();
    }

    public static SubLObject nc_block_denot(final SubLObject v_object) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.getField5();
    }

    public static final SubLObject nc_block_filters_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.getField6();
    }

    public static SubLObject nc_block_filters(final SubLObject v_object) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.getField6();
    }

    public static final SubLObject nc_block_spanned_string_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.getField7();
    }

    public static SubLObject nc_block_spanned_string(final SubLObject v_object) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.getField7();
    }

    public static final SubLObject nc_block_head_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.getField8();
    }

    public static SubLObject nc_block_head(final SubLObject v_object) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.getField8();
    }

    public static final SubLObject nc_block_head_pos_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.getField9();
    }

    public static SubLObject nc_block_head_pos(final SubLObject v_object) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.getField9();
    }

    public static final SubLObject nc_block_head_string_pred_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.getField10();
    }

    public static SubLObject nc_block_head_string_pred(final SubLObject v_object) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.getField10();
    }

    public static final SubLObject nc_block_sub_tree_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.getField11();
    }

    public static SubLObject nc_block_sub_tree(final SubLObject v_object) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.getField11();
    }

    public static final SubLObject nc_block_plist_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.getField12();
    }

    public static SubLObject nc_block_plist(final SubLObject v_object) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.getField12();
    }

    public static final SubLObject _csetf_nc_block_unique_id_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_nc_block_unique_id(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_nc_block_span_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_nc_block_span_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_nc_block_confidence_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_nc_block_confidence(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_nc_block_denot_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_nc_block_denot(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_nc_block_filters_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_nc_block_filters(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_nc_block_spanned_string_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_nc_block_spanned_string(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static final SubLObject _csetf_nc_block_head_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.setField8(value);
    }

    public static SubLObject _csetf_nc_block_head(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static final SubLObject _csetf_nc_block_head_pos_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.setField9(value);
    }

    public static SubLObject _csetf_nc_block_head_pos(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.setField9(value);
    }

    public static final SubLObject _csetf_nc_block_head_string_pred_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.setField10(value);
    }

    public static SubLObject _csetf_nc_block_head_string_pred(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.setField10(value);
    }

    public static final SubLObject _csetf_nc_block_sub_tree_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.setField11(value);
    }

    public static SubLObject _csetf_nc_block_sub_tree(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.setField11(value);
    }

    public static final SubLObject _csetf_nc_block_plist_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, NOUN_COMPOUND_BLOCK_P);
	return v_object.setField12(value);
    }

    public static SubLObject _csetf_nc_block_plist(final SubLObject v_object, final SubLObject value) {
	assert NIL != noun_compound_block_p(v_object) : "! noun_compound_parser.noun_compound_block_p(v_object) " + "noun_compound_parser.noun_compound_block_p error :" + v_object;
	return v_object.setField12(value);
    }

    public static final SubLObject make_noun_compound_block_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_block_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($UNIQUE_ID)) {
			_csetf_nc_block_unique_id(v_new, current_value);
		    } else {
			if (pcase_var.eql($SPAN_INDEX)) {
			    _csetf_nc_block_span_index(v_new, current_value);
			} else {
			    if (pcase_var.eql($CONFIDENCE)) {
				_csetf_nc_block_confidence(v_new, current_value);
			    } else {
				if (pcase_var.eql($DENOT)) {
				    _csetf_nc_block_denot(v_new, current_value);
				} else {
				    if (pcase_var.eql($FILTERS)) {
					_csetf_nc_block_filters(v_new, current_value);
				    } else {
					if (pcase_var.eql($SPANNED_STRING)) {
					    _csetf_nc_block_spanned_string(v_new, current_value);
					} else {
					    if (pcase_var.eql($HEAD)) {
						_csetf_nc_block_head(v_new, current_value);
					    } else {
						if (pcase_var.eql($HEAD_POS)) {
						    _csetf_nc_block_head_pos(v_new, current_value);
						} else {
						    if (pcase_var.eql($HEAD_STRING_PRED)) {
							_csetf_nc_block_head_string_pred(v_new, current_value);
						    } else {
							if (pcase_var.eql($SUB_TREE)) {
							    _csetf_nc_block_sub_tree(v_new, current_value);
							} else {
							    if (pcase_var.eql($PLIST)) {
								_csetf_nc_block_plist(v_new, current_value);
							    } else {
								Errors.error($str_alt24$Invalid_slot__S_for_construction_, current_arg);
							    }
							}
						    }
						}
					    }
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    return v_new;
	}
    }

    public static SubLObject make_noun_compound_block(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_block_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($UNIQUE_ID)) {
		_csetf_nc_block_unique_id(v_new, current_value);
	    } else if (pcase_var.eql($SPAN_INDEX)) {
		_csetf_nc_block_span_index(v_new, current_value);
	    } else if (pcase_var.eql($CONFIDENCE)) {
		_csetf_nc_block_confidence(v_new, current_value);
	    } else if (pcase_var.eql($DENOT)) {
		_csetf_nc_block_denot(v_new, current_value);
	    } else if (pcase_var.eql($FILTERS)) {
		_csetf_nc_block_filters(v_new, current_value);
	    } else if (pcase_var.eql($SPANNED_STRING)) {
		_csetf_nc_block_spanned_string(v_new, current_value);
	    } else if (pcase_var.eql($HEAD)) {
		_csetf_nc_block_head(v_new, current_value);
	    } else if (pcase_var.eql($HEAD_POS)) {
		_csetf_nc_block_head_pos(v_new, current_value);
	    } else if (pcase_var.eql($HEAD_STRING_PRED)) {
		_csetf_nc_block_head_string_pred(v_new, current_value);
	    } else if (pcase_var.eql($SUB_TREE)) {
		_csetf_nc_block_sub_tree(v_new, current_value);
	    } else if (pcase_var.eql($PLIST)) {
		_csetf_nc_block_plist(v_new, current_value);
	    } else {
		Errors.error($str25$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_noun_compound_block(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_NOUN_COMPOUND_BLOCK, ELEVEN_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $UNIQUE_ID, nc_block_unique_id(obj));
	funcall(visitor_fn, obj, $SLOT, $SPAN_INDEX, nc_block_span_index(obj));
	funcall(visitor_fn, obj, $SLOT, $CONFIDENCE, nc_block_confidence(obj));
	funcall(visitor_fn, obj, $SLOT, $DENOT, nc_block_denot(obj));
	funcall(visitor_fn, obj, $SLOT, $FILTERS, nc_block_filters(obj));
	funcall(visitor_fn, obj, $SLOT, $SPANNED_STRING, nc_block_spanned_string(obj));
	funcall(visitor_fn, obj, $SLOT, $HEAD, nc_block_head(obj));
	funcall(visitor_fn, obj, $SLOT, $HEAD_POS, nc_block_head_pos(obj));
	funcall(visitor_fn, obj, $SLOT, $HEAD_STRING_PRED, nc_block_head_string_pred(obj));
	funcall(visitor_fn, obj, $SLOT, $SUB_TREE, nc_block_sub_tree(obj));
	funcall(visitor_fn, obj, $SLOT, $PLIST, nc_block_plist(obj));
	funcall(visitor_fn, obj, $END, MAKE_NOUN_COMPOUND_BLOCK, ELEVEN_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_noun_compound_block_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_noun_compound_block(obj, visitor_fn);
    }

    /**
     * Return the PROPERTY slot value of BLOCK.
     */
    @LispMethod(comment = "Return the PROPERTY slot value of BLOCK.")
    public static final SubLObject nc_block_plist_lookup_alt(SubLObject block, SubLObject property, SubLObject v_default) {
	if (v_default == UNPROVIDED) {
	    v_default = NIL;
	}
	SubLTrampolineFile.checkType(block, NOUN_COMPOUND_BLOCK_P);
	return getf(nc_block_plist(block), property, v_default);
    }

    /**
     * Return the PROPERTY slot value of BLOCK.
     */
    @LispMethod(comment = "Return the PROPERTY slot value of BLOCK.")
    public static SubLObject nc_block_plist_lookup(final SubLObject block, final SubLObject property, SubLObject v_default) {
	if (v_default == UNPROVIDED) {
	    v_default = NIL;
	}
	assert NIL != noun_compound_block_p(block) : "! noun_compound_parser.noun_compound_block_p(block) " + ("noun_compound_parser.noun_compound_block_p(block) " + "CommonSymbols.NIL != noun_compound_parser.noun_compound_block_p(block) ") + block;
	return getf(nc_block_plist(block), property, v_default);
    }

    /**
     * Set the PROPERTY slot value of BLOCK to VALUE.
     */
    @LispMethod(comment = "Set the PROPERTY slot value of BLOCK to VALUE.")
    public static final SubLObject nc_block_plist_set_alt(SubLObject block, SubLObject property, SubLObject value) {
	SubLTrampolineFile.checkType(block, NOUN_COMPOUND_BLOCK_P);
	_csetf_nc_block_plist(block, putf(nc_block_plist(block), property, value));
	return nc_block_plist_lookup(block, property, UNPROVIDED);
    }

    /**
     * Set the PROPERTY slot value of BLOCK to VALUE.
     */
    @LispMethod(comment = "Set the PROPERTY slot value of BLOCK to VALUE.")
    public static SubLObject nc_block_plist_set(final SubLObject block, final SubLObject property, final SubLObject value) {
	assert NIL != noun_compound_block_p(block) : "! noun_compound_parser.noun_compound_block_p(block) " + ("noun_compound_parser.noun_compound_block_p(block) " + "CommonSymbols.NIL != noun_compound_parser.noun_compound_block_p(block) ") + block;
	_csetf_nc_block_plist(block, putf(nc_block_plist(block), property, value));
	return nc_block_plist_lookup(block, property, UNPROVIDED);
    }

    public static final SubLObject nc_block_wu_alt(SubLObject block) {
	return nc_block_plist_lookup(block, $WU, NIL);
    }

    public static SubLObject nc_block_wu(final SubLObject block) {
	return nc_block_plist_lookup(block, $WU, NIL);
    }

    public static final SubLObject nc_block_set_wu_alt(SubLObject block, SubLObject wu) {
	return nc_block_plist_set(block, $WU, wu);
    }

    public static SubLObject nc_block_set_wu(final SubLObject block, final SubLObject wu) {
	return nc_block_plist_set(block, $WU, wu);
    }

    public static final SubLObject nc_block_rule_alt(SubLObject block) {
	return nc_block_sub_tree(block).first();
    }

    public static SubLObject nc_block_rule(final SubLObject block) {
	return nc_block_sub_tree(block).first();
    }

    public static final SubLObject nc_block_mod_block_alt(SubLObject block, SubLObject block_hash) {
	if (block_hash == UNPROVIDED) {
	    block_hash = NIL;
	}
	{
	    SubLObject ans = second(nc_block_sub_tree(block));
	    if (NIL != block_hash) {
		ans = rbp_chart_parser.rbp_chart_block_hash_lookup(ans, block_hash);
	    }
	    return ans;
	}
    }

    public static SubLObject nc_block_mod_block(final SubLObject block, SubLObject block_hash) {
	if (block_hash == UNPROVIDED) {
	    block_hash = NIL;
	}
	SubLObject ans = second(nc_block_sub_tree(block));
	if (NIL != block_hash) {
	    ans = rbp_chart_parser.rbp_chart_block_hash_lookup(ans, block_hash);
	}
	return ans;
    }

    public static final SubLObject nc_block_head_block_alt(SubLObject block, SubLObject block_hash) {
	if (block_hash == UNPROVIDED) {
	    block_hash = NIL;
	}
	{
	    SubLObject ans = third(nc_block_sub_tree(block));
	    if (NIL != block_hash) {
		ans = rbp_chart_parser.rbp_chart_block_hash_lookup(ans, block_hash);
	    }
	    return ans;
	}
    }

    public static SubLObject nc_block_head_block(final SubLObject block, SubLObject block_hash) {
	if (block_hash == UNPROVIDED) {
	    block_hash = NIL;
	}
	SubLObject ans = third(nc_block_sub_tree(block));
	if (NIL != block_hash) {
	    ans = rbp_chart_parser.rbp_chart_block_hash_lookup(ans, block_hash);
	}
	return ans;
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; How many rules were used to construct BLOCK?
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; How many rules were used to construct BLOCK?")
    public static final SubLObject nc_block_rule_count_alt(SubLObject block, SubLObject block_hash) {
	if (NIL == noun_compound_block_p(block)) {
	    return ZERO_INTEGER;
	} else {
	    if (NIL == nc_block_rule(block)) {
		return ZERO_INTEGER;
	    } else {
		return add(nc_block_rule_count(nc_block_mod_block(block, block_hash), block_hash), nc_block_rule_count(nc_block_head_block(block, block_hash), block_hash), ONE_INTEGER);
	    }
	}
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; How many rules were used to construct BLOCK?
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; How many rules were used to construct BLOCK?")
    public static SubLObject nc_block_rule_count(final SubLObject block, final SubLObject block_hash) {
	if (NIL == noun_compound_block_p(block)) {
	    return ZERO_INTEGER;
	}
	if (NIL == nc_block_rule(block)) {
	    return ZERO_INTEGER;
	}
	return add(nc_block_rule_count(nc_block_mod_block(block, block_hash), block_hash), nc_block_rule_count(nc_block_head_block(block, block_hash), block_hash), ONE_INTEGER);
    }

    /**
     *
     *
     * @param block;
    noun-compound-block
     * 		
     * @param stream;
    stream
     * 		
     * @param depth;
    integer
     * 		
     * @return noun-compound-block
    Pretty printing function for noun-compound-block.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param block;\nnoun-compound-block\r\n\t\t\r\n@param stream;\nstream\r\n\t\t\r\n@param depth;\ninteger\r\n\t\t\r\n@return noun-compound-block\r\nPretty printing function for noun-compound-block.\r\n@unknown bertolo")
    public static final SubLObject pprint_nc_block_alt(SubLObject block, SubLObject stream, SubLObject depth) {
	format(stream, $str_alt75$__NCB__S___S__S_, new SubLObject[] { nc_block_unique_id(block), nc_block_spanned_string(block), nc_block_head_string_pred(block) });
	return block;
    }

    /**
     *
     *
     * @param block;
    noun-compound-block
     * 		
     * @param stream;
    stream
     * 		
     * @param depth;
    integer
     * 		
     * @return noun-compound-block
    Pretty printing function for noun-compound-block.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param block;\nnoun-compound-block\r\n\t\t\r\n@param stream;\nstream\r\n\t\t\r\n@param depth;\ninteger\r\n\t\t\r\n@return noun-compound-block\r\nPretty printing function for noun-compound-block.\r\n@unknown bertolo")
    public static SubLObject pprint_nc_block(final SubLObject block, final SubLObject stream, final SubLObject depth) {
	format(stream, $str84$__NCB__S___S__S_, new SubLObject[] { nc_block_unique_id(block), nc_block_spanned_string(block), nc_block_head_string_pred(block) });
	return block;
    }

    /**
     *
     *
     * @param num1;
    INTEGER
     * 		
     * @param num2;
    INTEGER
     * 		
     * @param confidence;
    FLOAT
     * 		
     * @param string;
    STRING
     * 		
     * @param wu;
     * 		LEXICAL-WORD? or NIL
     * @param head-fort;
    FORT
     * 		
     * @param denot;
     * 		Cyc term
     * @param head-pos;
    FORT
     * 		
     * @param pred;
    FORT
     * 		
     * @param sub-tree;
     * 		LIST (<rule> <block-id> <block-id>) or NIL
     * @return noun-compound-block STRUCTURE
    Function for creating noun-compound-block STRUCTUREs.
     */
    @LispMethod(comment = "@param num1;\nINTEGER\r\n\t\t\r\n@param num2;\nINTEGER\r\n\t\t\r\n@param confidence;\nFLOAT\r\n\t\t\r\n@param string;\nSTRING\r\n\t\t\r\n@param wu;\r\n\t\tLEXICAL-WORD? or NIL\r\n@param head-fort;\nFORT\r\n\t\t\r\n@param denot;\r\n\t\tCyc term\r\n@param head-pos;\nFORT\r\n\t\t\r\n@param pred;\nFORT\r\n\t\t\r\n@param sub-tree;\r\n\t\tLIST (<rule> <block-id> <block-id>) or NIL\r\n@return noun-compound-block STRUCTURE\r\nFunction for creating noun-compound-block STRUCTUREs.")
    public static final SubLObject new_noun_compound_block_alt(SubLObject num1, SubLObject num2, SubLObject confidence, SubLObject string, SubLObject wu, SubLObject head_fort, SubLObject denot, SubLObject head_pos, SubLObject pred, SubLObject sub_tree) {
	if (wu == UNPROVIDED) {
	    wu = NIL;
	}
	if (head_fort == UNPROVIDED) {
	    head_fort = NIL;
	}
	if (denot == UNPROVIDED) {
	    denot = NIL;
	}
	if (head_pos == UNPROVIDED) {
	    head_pos = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (sub_tree == UNPROVIDED) {
	    sub_tree = NIL;
	}
	{
	    SubLObject block = make_noun_compound_block(UNPROVIDED);
	    $nc_block_unique_id_counter$.setGlobalValue(add($nc_block_unique_id_counter$.getGlobalValue(), ONE_INTEGER));
	    _csetf_nc_block_unique_id(block, $nc_block_unique_id_counter$.getGlobalValue());
	    _csetf_nc_block_span_index(block, interval_span.get_interval_span(num1, num2));
	    _csetf_nc_block_confidence(block, confidence);
	    _csetf_nc_block_denot(block, denot);
	    _csetf_nc_block_spanned_string(block, string);
	    _csetf_nc_block_head(block, head_fort);
	    _csetf_nc_block_head_pos(block, head_pos);
	    _csetf_nc_block_head_string_pred(block, pred);
	    _csetf_nc_block_sub_tree(block, sub_tree);
	    nc_block_set_wu(block, wu);
	    return block;
	}
    }

    /**
     *
     *
     * @param num1;
    INTEGER
     * 		
     * @param num2;
    INTEGER
     * 		
     * @param confidence;
    FLOAT
     * 		
     * @param string;
    STRING
     * 		
     * @param wu;
     * 		LEXICAL-WORD? or NIL
     * @param head-fort;
    FORT
     * 		
     * @param denot;
     * 		Cyc term
     * @param head-pos;
    FORT
     * 		
     * @param pred;
    FORT
     * 		
     * @param sub-tree;
     * 		LIST (<rule> <block-id> <block-id>) or NIL
     * @return noun-compound-block STRUCTURE
    Function for creating noun-compound-block STRUCTUREs.
     */
    @LispMethod(comment = "@param num1;\nINTEGER\r\n\t\t\r\n@param num2;\nINTEGER\r\n\t\t\r\n@param confidence;\nFLOAT\r\n\t\t\r\n@param string;\nSTRING\r\n\t\t\r\n@param wu;\r\n\t\tLEXICAL-WORD? or NIL\r\n@param head-fort;\nFORT\r\n\t\t\r\n@param denot;\r\n\t\tCyc term\r\n@param head-pos;\nFORT\r\n\t\t\r\n@param pred;\nFORT\r\n\t\t\r\n@param sub-tree;\r\n\t\tLIST (<rule> <block-id> <block-id>) or NIL\r\n@return noun-compound-block STRUCTURE\r\nFunction for creating noun-compound-block STRUCTUREs.")
    public static SubLObject new_noun_compound_block(final SubLObject num1, final SubLObject num2, final SubLObject confidence, final SubLObject string, SubLObject wu, SubLObject head_fort, SubLObject denot, SubLObject head_pos, SubLObject pred, SubLObject sub_tree) {
	if (wu == UNPROVIDED) {
	    wu = NIL;
	}
	if (head_fort == UNPROVIDED) {
	    head_fort = NIL;
	}
	if (denot == UNPROVIDED) {
	    denot = NIL;
	}
	if (head_pos == UNPROVIDED) {
	    head_pos = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (sub_tree == UNPROVIDED) {
	    sub_tree = NIL;
	}
	final SubLObject block = make_noun_compound_block(UNPROVIDED);
	$nc_block_unique_id_counter$.setGlobalValue(add($nc_block_unique_id_counter$.getGlobalValue(), ONE_INTEGER));
	_csetf_nc_block_unique_id(block, $nc_block_unique_id_counter$.getGlobalValue());
	_csetf_nc_block_span_index(block, interval_span.get_interval_span(num1, num2));
	_csetf_nc_block_confidence(block, confidence);
	_csetf_nc_block_denot(block, denot);
	_csetf_nc_block_spanned_string(block, string);
	_csetf_nc_block_head(block, head_fort);
	_csetf_nc_block_head_pos(block, head_pos);
	_csetf_nc_block_head_string_pred(block, pred);
	_csetf_nc_block_sub_tree(block, sub_tree);
	nc_block_set_wu(block, wu);
	return block;
    }

    public static final SubLObject inference_new_noun_compound_block_alt(SubLObject num1, SubLObject num2, SubLObject confidence, SubLObject string, SubLObject wu, SubLObject head_fort, SubLObject denot, SubLObject head_pos, SubLObject pred, SubLObject sub_tree) {
	if (wu == UNPROVIDED) {
	    wu = NIL;
	}
	if (head_fort == UNPROVIDED) {
	    head_fort = NIL;
	}
	if (denot == UNPROVIDED) {
	    denot = NIL;
	}
	if (head_pos == UNPROVIDED) {
	    head_pos = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (sub_tree == UNPROVIDED) {
	    sub_tree = NIL;
	}
	return new_noun_compound_block(num1, num2, confidence, string, wu, head_fort, denot, head_pos, pred, sub_tree);
    }

    public static SubLObject inference_new_noun_compound_block(final SubLObject num1, final SubLObject num2, final SubLObject confidence, final SubLObject string, SubLObject wu, SubLObject head_fort, SubLObject denot, SubLObject head_pos, SubLObject pred, SubLObject sub_tree) {
	if (wu == UNPROVIDED) {
	    wu = NIL;
	}
	if (head_fort == UNPROVIDED) {
	    head_fort = NIL;
	}
	if (denot == UNPROVIDED) {
	    denot = NIL;
	}
	if (head_pos == UNPROVIDED) {
	    head_pos = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (sub_tree == UNPROVIDED) {
	    sub_tree = NIL;
	}
	return new_noun_compound_block(num1, num2, confidence, string, wu, head_fort, denot, head_pos, pred, sub_tree);
    }

    /**
     *
     *
     * @param block1;
     * 		noun-compound-block STRUCTURE
     * @param block2;
     * 		noun-compound-block STRUCTURE
     * @return LISTP of noun-compound-block STRUCTURES
    Takes two noun-compound-block STRUCTURES and returns a noun-compound-block if they
    are adjacent -- the beginning of the span of the second is one position after
    the end of the span of the first one -- and can be combined into a single
    noun compound.
     */
    @LispMethod(comment = "@param block1;\r\n\t\tnoun-compound-block STRUCTURE\r\n@param block2;\r\n\t\tnoun-compound-block STRUCTURE\r\n@return LISTP of noun-compound-block STRUCTURES\r\nTakes two noun-compound-block STRUCTURES and returns a noun-compound-block if they\r\nare adjacent -- the beginning of the span of the second is one position after\r\nthe end of the span of the first one -- and can be combined into a single\r\nnoun compound.")
    public static final SubLObject combine_noun_compound_blocks_internal_alt(SubLObject block1, SubLObject block2, SubLObject block_hash) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $rbp_cncb_calls$.setGlobalValue(add($rbp_cncb_calls$.getGlobalValue(), ONE_INTEGER));
	    if (NIL != gethash(list(block1, block2), $rbp_cncb_hash$.getGlobalValue(), UNPROVIDED)) {
		if (NIL != $rbp_report_parse_timeP$.getDynamicValue(thread)) {
		    Errors.warn($str_alt89$Redundant_call_____S____S__, block1, block2);
		}
		$rbp_cncb_calls_redundant$.setGlobalValue(add($rbp_cncb_calls_redundant$.getGlobalValue(), ONE_INTEGER));
	    }
	    hash_table_utilities.cinc_hash(list(block1, block2), $rbp_cncb_hash$.getGlobalValue(), ONE_INTEGER, ZERO_INTEGER);
	    if ((NIL == rbp_adj_blockP(block1)) && (NIL != rbp_adj_modified_blockP(block2, block_hash))) {
		return NIL;
	    }
	    {
		SubLObject span1 = nc_block_span_index(block1);
		SubLObject span2 = nc_block_span_index(block2);
		SubLObject beg1 = interval_span.interval_span_start(span1);
		SubLObject end1 = interval_span.interval_span_end(span1);
		SubLObject beg2 = interval_span.interval_span_start(span2);
		SubLObject end2 = interval_span.interval_span_end(span2);
		SubLObject new_blocks = NIL;
		if (!end1.numE(beg2)) {
		    $rbp_cncb_calls_backwards$.setGlobalValue(add($rbp_cncb_calls_backwards$.getGlobalValue(), ONE_INTEGER));
		    return NIL;
		}
		if (NIL != number_utilities.potentially_infinite_number_L(parsing_vars.$npp_max_rules_per_compound$.getDynamicValue(thread), number_utilities.positive_infinity())) {
		    {
			SubLObject input_spannerP = eq(rbp_chart_parser.rbp_chart_max_span(UNPROVIDED), interval_span.get_interval_span(beg1, end2));
			SubLObject new_min_rule_count = add(nc_block_rule_count(block1, block_hash), nc_block_rule_count(block2, block_hash), NIL != input_spannerP ? ((SubLObject) (ZERO_INTEGER)) : ONE_INTEGER);
			if (!new_min_rule_count.numL(parsing_vars.$npp_max_rules_per_compound$.getDynamicValue(thread))) {
			    return NIL;
			}
		    }
		}
		{
		    SubLObject string1 = nc_block_spanned_string(block1);
		    SubLObject string2 = nc_block_spanned_string(block2);
		    SubLObject raw_parses = rbp_rb_combine_noun_compound_blocks(block1, block2);
		    SubLObject cdolist_list_var = raw_parses;
		    SubLObject parse = NIL;
		    for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), parse = cdolist_list_var.first()) {
			{
			    SubLObject datum = parse;
			    SubLObject current = datum;
			    SubLObject rule = NIL;
			    SubLObject denot = NIL;
			    destructuring_bind_must_consp(current, datum, $list_alt90);
			    rule = current.first();
			    current = current.rest();
			    destructuring_bind_must_consp(current, datum, $list_alt90);
			    denot = current.first();
			    current = current.rest();
			    if (NIL == current) {
				{
				    SubLObject rule_confidence = $float$0_5;
				    SubLObject confidence = multiply(rule_confidence, nc_block_confidence(block1), nc_block_confidence(block2));
				    SubLObject new_string = cconcatenate(string1, new SubLObject[] { $str_alt91$_, string2 });
				    SubLObject head_fort = nc_block_head(block2);
				    SubLObject head_pos = nc_block_head_pos(block2);
				    SubLObject head_pos_pred = nc_block_head_string_pred(block2);
				    SubLObject sub_tree = list(rule, nc_block_unique_id(block1), nc_block_unique_id(block2));
				    if (NIL != forts.fort_p(denot)) {
					confidence = multiply(confidence, $float$1_1);
				    }
				    {
					SubLObject wu = NIL;
					SubLObject new_block = new_noun_compound_block(beg1, end2, confidence, new_string, wu, head_fort, denot, head_pos, head_pos_pred, sub_tree);
					new_blocks = cons(new_block, new_blocks);
				    }
				}
			    } else {
				cdestructuring_bind_error(datum, $list_alt90);
			    }
			}
		    }
		}
		return new_blocks;
	    }
	}
    }

    /**
     *
     *
     * @param block1;
     * 		noun-compound-block STRUCTURE
     * @param block2;
     * 		noun-compound-block STRUCTURE
     * @return LISTP of noun-compound-block STRUCTURES
    Takes two noun-compound-block STRUCTURES and returns a noun-compound-block if they
    are adjacent -- the beginning of the span of the second is one position after
    the end of the span of the first one -- and can be combined into a single
    noun compound.
     */
    @LispMethod(comment = "@param block1;\r\n\t\tnoun-compound-block STRUCTURE\r\n@param block2;\r\n\t\tnoun-compound-block STRUCTURE\r\n@return LISTP of noun-compound-block STRUCTURES\r\nTakes two noun-compound-block STRUCTURES and returns a noun-compound-block if they\r\nare adjacent -- the beginning of the span of the second is one position after\r\nthe end of the span of the first one -- and can be combined into a single\r\nnoun compound.")
    public static SubLObject combine_noun_compound_blocks_internal(final SubLObject block1, final SubLObject block2, final SubLObject block_hash) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == rbp_adj_blockP(block1)) && (NIL != rbp_adj_modified_blockP(block2, block_hash))) {
	    return NIL;
	}
	final SubLObject span1 = nc_block_span_index(block1);
	final SubLObject span2 = nc_block_span_index(block2);
	final SubLObject beg1 = interval_span.interval_span_start(span1);
	final SubLObject end1 = interval_span.interval_span_end(span1);
	final SubLObject beg2 = interval_span.interval_span_start(span2);
	final SubLObject end2 = interval_span.interval_span_end(span2);
	SubLObject new_blocks = NIL;
	if (!end1.numE(beg2)) {
	    return NIL;
	}
	if (NIL != number_utilities.potentially_infinite_number_L(parsing_vars.$npp_max_rules_per_compound$.getDynamicValue(thread), number_utilities.positive_infinity())) {
	    final SubLObject input_spannerP = eq(rbp_chart_parser.rbp_chart_max_span(UNPROVIDED), interval_span.get_interval_span(beg1, end2));
	    final SubLObject new_min_rule_count = add(nc_block_rule_count(block1, block_hash), nc_block_rule_count(block2, block_hash), NIL != input_spannerP ? ZERO_INTEGER : ONE_INTEGER);
	    if (!new_min_rule_count.numL(parsing_vars.$npp_max_rules_per_compound$.getDynamicValue(thread))) {
		return NIL;
	    }
	}
	final SubLObject string1 = nc_block_spanned_string(block1);
	final SubLObject string2 = nc_block_spanned_string(block2);
	SubLObject cdolist_list_var;
	final SubLObject raw_parses = cdolist_list_var = rbp_rb_combine_noun_compound_blocks(block1, block2);
	SubLObject parse = NIL;
	parse = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject current;
	    final SubLObject datum = current = parse;
	    SubLObject rule = NIL;
	    SubLObject denot = NIL;
	    destructuring_bind_must_consp(current, datum, $list87);
	    rule = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list87);
	    denot = current.first();
	    current = current.rest();
	    if (NIL == current) {
		final SubLObject rule_confidence = $float$0_5;
		SubLObject confidence = multiply(rule_confidence, nc_block_confidence(block1), nc_block_confidence(block2));
		final SubLObject new_string = cconcatenate(string1, new SubLObject[] { $$$_, string2 });
		final SubLObject head_fort = nc_block_head(block2);
		final SubLObject head_pos = nc_block_head_pos(block2);
		final SubLObject head_pos_pred = nc_block_head_string_pred(block2);
		final SubLObject sub_tree = list(rule, nc_block_unique_id(block1), nc_block_unique_id(block2));
		if (NIL != forts.fort_p(denot)) {
		    confidence = multiply(confidence, $float$1_1);
		}
		final SubLObject wu = NIL;
		final SubLObject new_block = new_noun_compound_block(beg1, end2, confidence, new_string, wu, head_fort, denot, head_pos, head_pos_pred, sub_tree);
		new_blocks = cons(new_block, new_blocks);
	    } else {
		cdestructuring_bind_error(datum, $list87);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    parse = cdolist_list_var.first();
	}
	return new_blocks;
    }

    public static final SubLObject combine_noun_compound_blocks_alt(SubLObject block1, SubLObject block2, SubLObject block_hash) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return combine_noun_compound_blocks_internal(block1, block2, block_hash);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMBINE_NOUN_COMPOUND_BLOCKS, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMBINE_NOUN_COMPOUND_BLOCKS, THREE_INTEGER, NIL, EQ, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, COMBINE_NOUN_COMPOUND_BLOCKS, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_3(block1, block2, block_hash);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw93$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (block1 == cached_args.first()) {
					cached_args = cached_args.rest();
					if (block2 == cached_args.first()) {
					    cached_args = cached_args.rest();
					    if (((NIL != cached_args) && (NIL == cached_args.rest())) && (block_hash == cached_args.first())) {
						return memoization_state.caching_results(results2);
					    }
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(combine_noun_compound_blocks_internal(block1, block2, block_hash)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(block1, block2, block_hash));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject combine_noun_compound_blocks(final SubLObject block1, final SubLObject block2, final SubLObject block_hash) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return combine_noun_compound_blocks_internal(block1, block2, block_hash);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMBINE_NOUN_COMPOUND_BLOCKS, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMBINE_NOUN_COMPOUND_BLOCKS, THREE_INTEGER, NIL, EQ, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, COMBINE_NOUN_COMPOUND_BLOCKS, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_3(block1, block2, block_hash);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (block1.eql(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (block2.eql(cached_args.first())) {
			cached_args = cached_args.rest();
			if (((NIL != cached_args) && (NIL == cached_args.rest())) && block_hash.eql(cached_args.first())) {
			    return memoization_state.caching_results(results2);
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(combine_noun_compound_blocks_internal(block1, block2, block_hash)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(block1, block2, block_hash));
	return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @param token;
     * 		VECTOR #(<start> <end> #(<string> <tuples>))
     * @return LIST;
    Unpacks a lexical token into a list of noun-compound-blocks in the
    format required by the np-parser.
     */
    @LispMethod(comment = "@param token;\r\n\t\tVECTOR #(<start> <end> #(<string> <tuples>))\r\n@return LIST;\r\nUnpacks a lexical token into a list of noun-compound-blocks in the\r\nformat required by the np-parser.")
    public static final SubLObject token_to_blocks_alt(SubLObject token) {
	initialize_rbp_name_cache();
	{
	    SubLObject index_1 = standard_tokenization.interval_token_start(token);
	    SubLObject index_2 = standard_tokenization.interval_token_end(token);
	    SubLObject confidence = ONE_INTEGER;
	    SubLObject entry = standard_tokenization.interval_token_value(token);
	    SubLObject string = standard_tokenization.string_token_string(entry);
	    SubLObject tuples = standard_tokenization.string_token_value(entry);
	    SubLObject blocks = (NIL != tuples) ? ((SubLObject) (NIL)) : list(new_noun_compound_block(index_1, index_2, confidence, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
	    SubLObject cdolist_list_var = tuples;
	    SubLObject tuple = NIL;
	    for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tuple = cdolist_list_var.first()) {
		{
		    SubLObject datum = tuple;
		    SubLObject current = datum;
		    SubLObject denot = NIL;
		    SubLObject pos = NIL;
		    SubLObject pred = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt94);
		    denot = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt94);
		    pos = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt94);
		    pred = current.first();
		    current = current.rest();
		    {
			SubLObject wu = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
			destructuring_bind_must_listp(current, datum, $list_alt94);
			current = current.rest();
			if (NIL == current) {
			    {
				SubLObject denot_fort = function_terms.naut_to_nart(denot);
				SubLObject v_new = new_noun_compound_block(index_1, index_2, confidence, string, wu, denot_fort, denot_fort, pos, pred, UNPROVIDED);
				if (NIL != rbp_ok_blockP(v_new)) {
				    blocks = cons(v_new, blocks);
				}
			    }
			} else {
			    cdestructuring_bind_error(datum, $list_alt94);
			}
		    }
		}
	    }
	    return rbp_filter_redundant_blocks(blocks);
	}
    }

    /**
     *
     *
     * @param token;
     * 		VECTOR #(<start> <end> #(<string> <tuples>))
     * @return LIST;
    Unpacks a lexical token into a list of noun-compound-blocks in the
    format required by the np-parser.
     */
    @LispMethod(comment = "@param token;\r\n\t\tVECTOR #(<start> <end> #(<string> <tuples>))\r\n@return LIST;\r\nUnpacks a lexical token into a list of noun-compound-blocks in the\r\nformat required by the np-parser.")
    public static SubLObject token_to_blocks(final SubLObject token) {
	initialize_rbp_name_cache();
	final SubLObject index_1 = standard_tokenization.interval_token_start(token);
	final SubLObject index_2 = standard_tokenization.interval_token_end(token);
	final SubLObject confidence = ONE_INTEGER;
	final SubLObject entry = standard_tokenization.interval_token_value(token);
	final SubLObject string = standard_tokenization.string_token_string(entry);
	final SubLObject tuples = standard_tokenization.string_token_value(entry);
	SubLObject blocks = (NIL != tuples) ? NIL : list(new_noun_compound_block(index_1, index_2, confidence, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
	SubLObject cdolist_list_var = tuples;
	SubLObject tuple = NIL;
	tuple = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject current;
	    final SubLObject datum = current = tuple;
	    SubLObject denot = NIL;
	    SubLObject pos = NIL;
	    SubLObject pred = NIL;
	    destructuring_bind_must_consp(current, datum, $list90);
	    denot = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list90);
	    pos = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list90);
	    pred = current.first();
	    current = current.rest();
	    final SubLObject wu = (current.isCons()) ? current.first() : NIL;
	    destructuring_bind_must_listp(current, datum, $list90);
	    current = current.rest();
	    if (NIL == current) {
		final SubLObject denot_fort = function_terms.naut_to_nart(denot);
		final SubLObject v_new = new_noun_compound_block(index_1, index_2, confidence, string, wu, denot_fort, denot_fort, pos, pred, UNPROVIDED);
		if (NIL != rbp_ok_blockP(v_new)) {
		    blocks = cons(v_new, blocks);
		}
	    } else {
		cdestructuring_bind_error(datum, $list90);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    tuple = cdolist_list_var.first();
	}
	return rbp_filter_redundant_blocks(blocks);
    }

    /**
     *
     *
     * @return BOOLEAN; Is BLOCK an adjective block?
     */
    @LispMethod(comment = "@return BOOLEAN; Is BLOCK an adjective block?")
    public static final SubLObject rbp_adj_blockP_alt(SubLObject block) {
	{
	    SubLObject pos = nc_block_head_pos(block);
	    return NIL != pos ? ((SubLObject) (rbp_wff.npp_genlP(pos, $$Adjective, UNPROVIDED))) : NIL;
	}
    }

    /**
     *
     *
     * @return BOOLEAN; Is BLOCK an adjective block?
     */
    @LispMethod(comment = "@return BOOLEAN; Is BLOCK an adjective block?")
    public static SubLObject rbp_adj_blockP(final SubLObject block) {
	final SubLObject pos = nc_block_head_pos(block);
	return NIL != pos ? rbp_wff.npp_genlP(pos, $$Adjective, UNPROVIDED) : NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Is the modifier daughter of BLOCK an adjective block?
     */
    @LispMethod(comment = "@return BOOLEAN; Is the modifier daughter of BLOCK an adjective block?")
    public static final SubLObject rbp_adj_modified_blockP_alt(SubLObject block, SubLObject block_hash) {
	{
	    SubLObject mod_dtr_id = nc_block_mod_block(block, block_hash);
	    SubLObject mod_dtr = rbp_chart_parser.rbp_chart_block_hash_lookup(mod_dtr_id, block_hash);
	    SubLObject mod_dtr_pos = (NIL != mod_dtr) ? ((SubLObject) (nc_block_head_pos(mod_dtr))) : NIL;
	    return NIL != mod_dtr_pos ? ((SubLObject) (rbp_wff.npp_genlP(mod_dtr_pos, $$Adjective, UNPROVIDED))) : NIL;
	}
    }

    /**
     *
     *
     * @return BOOLEAN; Is the modifier daughter of BLOCK an adjective block?
     */
    @LispMethod(comment = "@return BOOLEAN; Is the modifier daughter of BLOCK an adjective block?")
    public static SubLObject rbp_adj_modified_blockP(final SubLObject block, final SubLObject block_hash) {
	final SubLObject mod_dtr_id = nc_block_mod_block(block, block_hash);
	final SubLObject mod_dtr = rbp_chart_parser.rbp_chart_block_hash_lookup(mod_dtr_id, block_hash);
	final SubLObject mod_dtr_pos = (NIL != mod_dtr) ? nc_block_head_pos(mod_dtr) : NIL;
	return NIL != mod_dtr_pos ? rbp_wff.npp_genlP(mod_dtr_pos, $$Adjective, UNPROVIDED) : NIL;
    }

    /**
     * Return the base value from BLOCK appropriate for C-TYPE
     */
    @LispMethod(comment = "Return the base value from BLOCK appropriate for C-TYPE")
    public static final SubLObject rbp_base_from_block_alt(SubLObject block, SubLObject c_type) {
	if (NIL != rbp_rule_bank.rbp_semantic_constraint_type_p(c_type)) {
	    return nc_block_denot(block);
	} else {
	    return funcall(rbp_candidate_fn_for_con_kw(c_type), block);
	}
    }

    /**
     * Return the base value from BLOCK appropriate for C-TYPE
     */
    @LispMethod(comment = "Return the base value from BLOCK appropriate for C-TYPE")
    public static SubLObject rbp_base_from_block(final SubLObject block, final SubLObject c_type) {
	if (NIL != rbp_rule_bank.rbp_semantic_constraint_type_p(c_type)) {
	    return nc_block_denot(block);
	}
	return funcall(rbp_candidate_fn_for_con_kw(c_type), block);
    }

    /**
     *
     *
     * @param LISTP
     * 		of parses to be filtered
     * @param KEYWORDP
     * 		- presently groks only :boolean and :macroscopic
     * @param ACCESSOR
     * 		FUNCTION - to extract denot from the parse. not needed for noun-compound-block-p's
     * @param POSITIVE-INTEGER-P
     * 		- parses with (at least) this many violations aren't checked again; @see *rbp-filter-violations-limit*
     */
    @LispMethod(comment = "@param LISTP\r\n\t\tof parses to be filtered\r\n@param KEYWORDP\r\n\t\t- presently groks only :boolean and :macroscopic\r\n@param ACCESSOR\r\n\t\tFUNCTION - to extract denot from the parse. not needed for noun-compound-block-p\'s\r\n@param POSITIVE-INTEGER-P\r\n\t\t- parses with (at least) this many violations aren\'t checked again; @see *rbp-filter-violations-limit*")
    public static final SubLObject rbp_apply_filter_cluster_alt(SubLObject filters_in_cluster, SubLObject filter_type, SubLObject parses, SubLObject accessor, SubLObject old_violations, SubLObject violations_limit) {
	if (accessor == UNPROVIDED) {
	    accessor = symbol_function(IDENTITY);
	}
	if (old_violations == UNPROVIDED) {
	    old_violations = NC_BLOCK_FILTERS;
	}
	if (violations_limit == UNPROVIDED) {
	    violations_limit = parsing_vars.$rbp_filter_violations_limit$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != violations_limit) {
		SubLTrampolineFile.checkType(violations_limit, POSITIVE_INTEGER_P);
	    }
	    {
		SubLObject failures = dictionary.new_dictionary(EQUALP, UNPROVIDED);
		SubLObject multipliers = dictionary.new_dictionary(EQL, UNPROVIDED);
		SubLObject still_checking = set.new_set(EQUALP, length(parses));
		{
		    SubLObject cdolist_list_var = parses;
		    SubLObject block = NIL;
		    for (block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), block = cdolist_list_var.first()) {
			if (old_violations.eql($NONE) || old_violations.eql($SKIP)) {
			    set.set_add(block, still_checking);
			} else {
			    dictionary.dictionary_enter(failures, block, funcall(old_violations, block));
			    dictionary.dictionary_enter(multipliers, block, ONE_INTEGER);
			    if (NIL == list_utilities.lengthGE(funcall(old_violations, block), violations_limit, UNPROVIDED)) {
				set.set_add(block, still_checking);
			    }
			}
		    }
		}
		{
		    SubLObject cdolist_list_var = filters_in_cluster;
		    SubLObject filter = NIL;
		    for (filter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), filter = cdolist_list_var.first()) {
			{
			    SubLObject remaining_parses = set.set_element_list(still_checking);
			    SubLObject failure_list = (filter_type.eql($BOOLEAN)) ? ((SubLObject) (parsing_utilities.apply_boolean_parsing_filter(remaining_parses, filter, accessor, UNPROVIDED))) : parsing_utilities.apply_macroscopic_parsing_filter(remaining_parses, filter, accessor, UNPROVIDED);
			    SubLObject cdolist_list_var_1 = failure_list;
			    SubLObject failure = NIL;
			    for (failure = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest(), failure = cdolist_list_var_1.first()) {
				{
				    SubLObject reason = NIL;
				    SubLObject mult = NIL;
				    SubLObject datum = failure;
				    SubLObject current = datum;
				    SubLObject block = NIL;
				    SubLObject diagnostics = NIL;
				    destructuring_bind_must_consp(current, datum, $list_alt104);
				    block = current.first();
				    current = current.rest();
				    destructuring_bind_must_consp(current, datum, $list_alt104);
				    diagnostics = current.first();
				    current = current.rest();
				    if (NIL == current) {
					if (NIL != list_utilities.proper_list_p(diagnostics)) {
					    thread.resetMultipleValues();
					    {
						SubLObject reason_2 = diagnostics;
						SubLObject mult_3 = thread.secondMultipleValue();
						thread.resetMultipleValues();
						reason = reason_2;
						mult = mult_3;
					    }
					    if (mult.isKeyword()) {
						mult = NIL;
					    }
					} else {
					    if (NIL == diagnostics) {
					    } else {
						reason = diagnostics;
					    }
					}
					if ((NIL == mult) || mult.isKeyword()) {
					    mult = $rbp_default_confidence_multiplier_for_failing_a_filter$.getDynamicValue(thread);
					}
					if (NIL != reason) {
					    {
						SubLObject known_violations = dictionary.dictionary_lookup(failures, block, UNPROVIDED);
						if (NIL == subl_promotions.memberP(reason, known_violations, EQUAL, UNPROVIDED)) {
						    dictionary_utilities.dictionary_push(failures, block, reason);
						    dictionary.dictionary_enter(multipliers, block, multiply(mult, dictionary.dictionary_lookup(multipliers, block, UNPROVIDED)));
						    if (NIL != list_utilities.lengthGE(dictionary.dictionary_lookup(failures, block, UNPROVIDED), violations_limit, UNPROVIDED)) {
							if (NIL != subl_promotions.memberP(nc_block_rule(block), rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) {
							    Errors.warn($str_alt105$Abandoning_parse__S_for__S, nc_block_denot(block), nc_block_spanned_string(block));
							}
							set.set_remove(block, still_checking);
						    }
						}
					    }
					}
				    } else {
					cdestructuring_bind_error(datum, $list_alt104);
				    }
				}
			    }
			}
		    }
		}
		{
		    SubLObject triples = NIL;
		    SubLObject cdolist_list_var = parses;
		    SubLObject block = NIL;
		    for (block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), block = cdolist_list_var.first()) {
			triples = cons(list(block, dictionary.dictionary_lookup(failures, block, UNPROVIDED), dictionary.dictionary_lookup(multipliers, block, UNPROVIDED)), triples);
		    }
		    return reverse(triples);
		}
	    }
	}
    }

    /**
     *
     *
     * @param LISTP
     * 		of parses to be filtered
     * @param KEYWORDP
     * 		- presently groks only :boolean and :macroscopic
     * @param ACCESSOR
     * 		FUNCTION - to extract denot from the parse. not needed for noun-compound-block-p's
     * @param POSITIVE-INTEGER-P
     * 		- parses with (at least) this many violations aren't checked again; @see *rbp-filter-violations-limit*
     */
    @LispMethod(comment = "@param LISTP\r\n\t\tof parses to be filtered\r\n@param KEYWORDP\r\n\t\t- presently groks only :boolean and :macroscopic\r\n@param ACCESSOR\r\n\t\tFUNCTION - to extract denot from the parse. not needed for noun-compound-block-p\'s\r\n@param POSITIVE-INTEGER-P\r\n\t\t- parses with (at least) this many violations aren\'t checked again; @see *rbp-filter-violations-limit*")
    public static SubLObject rbp_apply_filter_cluster(final SubLObject filters_in_cluster, final SubLObject filter_type, final SubLObject parses, SubLObject accessor, SubLObject old_violations, SubLObject violations_limit) {
	if (accessor == UNPROVIDED) {
	    accessor = symbol_function(IDENTITY);
	}
	if (old_violations == UNPROVIDED) {
	    old_violations = NC_BLOCK_FILTERS;
	}
	if (violations_limit == UNPROVIDED) {
	    violations_limit = parsing_vars.$rbp_filter_violations_limit$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (((NIL != violations_limit) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(violations_limit))) {
	    throw new AssertionError(violations_limit);
	}
	final SubLObject failures = dictionary.new_dictionary(EQUALP, UNPROVIDED);
	final SubLObject multipliers = dictionary.new_dictionary(EQL, UNPROVIDED);
	final SubLObject still_checking = set.new_set(EQUALP, length(parses));
	SubLObject cdolist_list_var = parses;
	SubLObject block = NIL;
	block = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (old_violations.eql($NONE) || old_violations.eql($SKIP)) {
		set.set_add(block, still_checking);
	    } else {
		dictionary.dictionary_enter(failures, block, funcall(old_violations, block));
		dictionary.dictionary_enter(multipliers, block, ONE_INTEGER);
		if (NIL == list_utilities.lengthGE(funcall(old_violations, block), violations_limit, UNPROVIDED)) {
		    set.set_add(block, still_checking);
		}
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    block = cdolist_list_var.first();
	}
	cdolist_list_var = filters_in_cluster;
	SubLObject filter = NIL;
	filter = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject remaining_parses = set.set_element_list(still_checking);
	    SubLObject cdolist_list_var_$1;
	    final SubLObject failure_list = cdolist_list_var_$1 = (filter_type.eql($BOOLEAN)) ? parsing_utilities.apply_boolean_parsing_filter(remaining_parses, filter, accessor, UNPROVIDED) : parsing_utilities.apply_macroscopic_parsing_filter(remaining_parses, filter, accessor, UNPROVIDED);
	    SubLObject failure = NIL;
	    failure = cdolist_list_var_$1.first();
	    while (NIL != cdolist_list_var_$1) {
		SubLObject reason = NIL;
		SubLObject mult = NIL;
		SubLObject current;
		final SubLObject datum = current = failure;
		SubLObject block2 = NIL;
		SubLObject diagnostics = NIL;
		destructuring_bind_must_consp(current, datum, $list100);
		block2 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list100);
		diagnostics = current.first();
		current = current.rest();
		if (NIL == current) {
		    if (NIL != list_utilities.proper_list_p(diagnostics)) {
			thread.resetMultipleValues();
			final SubLObject reason_$2 = diagnostics;
			final SubLObject mult_$3 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			reason = reason_$2;
			mult = mult_$3;
			if (mult.isKeyword()) {
			    mult = NIL;
			}
		    } else if (NIL != diagnostics) {
			reason = diagnostics;
		    }

		    if ((NIL == mult) || mult.isKeyword()) {
			mult = $rbp_default_confidence_multiplier_for_failing_a_filter$.getDynamicValue(thread);
		    }
		    if (NIL != reason) {
			final SubLObject known_violations = dictionary.dictionary_lookup(failures, block2, UNPROVIDED);
			if (NIL == subl_promotions.memberP(reason, known_violations, EQUAL, UNPROVIDED)) {
			    dictionary_utilities.dictionary_push(failures, block2, reason);
			    dictionary.dictionary_enter(multipliers, block2, multiply(mult, dictionary.dictionary_lookup(multipliers, block2, UNPROVIDED)));
			    if (NIL != list_utilities.lengthGE(dictionary.dictionary_lookup(failures, block2, UNPROVIDED), violations_limit, UNPROVIDED)) {
				if (NIL != subl_promotions.memberP(nc_block_rule(block2), rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) {
				    Errors.warn($str101$Abandoning_parse__S_for__S, nc_block_denot(block2), nc_block_spanned_string(block2));
				}
				set.set_remove(block2, still_checking);
			    }
			}
		    }
		} else {
		    cdestructuring_bind_error(datum, $list100);
		}
		cdolist_list_var_$1 = cdolist_list_var_$1.rest();
		failure = cdolist_list_var_$1.first();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    filter = cdolist_list_var.first();
	}
	SubLObject triples = NIL;
	SubLObject cdolist_list_var2 = parses;
	SubLObject block3 = NIL;
	block3 = cdolist_list_var2.first();
	while (NIL != cdolist_list_var2) {
	    triples = cons(list(block3, dictionary.dictionary_lookup(failures, block3, UNPROVIDED), dictionary.dictionary_lookup(multipliers, block3, UNPROVIDED)), triples);
	    cdolist_list_var2 = cdolist_list_var2.rest();
	    block3 = cdolist_list_var2.first();
	}
	return reverse(triples);
    }

    public static final SubLObject rbp_process_filter_clusters_alt(SubLObject clusters, SubLObject blocks, SubLObject filter_type) {
	if (filter_type == UNPROVIDED) {
	    filter_type = $BOOLEAN;
	}
	{
	    SubLObject cdolist_list_var = clusters;
	    SubLObject this_cluster = NIL;
	    for (this_cluster = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), this_cluster = cdolist_list_var.first()) {
		{
		    SubLObject cdolist_list_var_4 = rbp_apply_filter_cluster(this_cluster, filter_type, blocks, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    SubLObject triple = NIL;
		    for (triple = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest(), triple = cdolist_list_var_4.first()) {
			{
			    SubLObject datum = triple;
			    SubLObject current = datum;
			    SubLObject block = NIL;
			    SubLObject failed_these_filters = NIL;
			    SubLObject disconfidence = NIL;
			    destructuring_bind_must_consp(current, datum, $list_alt106);
			    block = current.first();
			    current = current.rest();
			    destructuring_bind_must_consp(current, datum, $list_alt106);
			    failed_these_filters = current.first();
			    current = current.rest();
			    destructuring_bind_must_consp(current, datum, $list_alt106);
			    disconfidence = current.first();
			    current = current.rest();
			    if (NIL == current) {
				if (NIL != failed_these_filters) {
				    _csetf_nc_block_filters(block, reverse(failed_these_filters));
				    _csetf_nc_block_confidence(block, multiply(disconfidence, nc_block_confidence(block)));
				}
			    } else {
				cdestructuring_bind_error(datum, $list_alt106);
			    }
			}
		    }
		}
	    }
	}
	return blocks;
    }

    public static SubLObject rbp_process_filter_clusters(final SubLObject clusters, final SubLObject blocks, SubLObject filter_type) {
	if (filter_type == UNPROVIDED) {
	    filter_type = $BOOLEAN;
	}
	SubLObject cdolist_list_var = clusters;
	SubLObject this_cluster = NIL;
	this_cluster = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject cdolist_list_var_$4 = rbp_apply_filter_cluster(this_cluster, filter_type, blocks, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    SubLObject triple = NIL;
	    triple = cdolist_list_var_$4.first();
	    while (NIL != cdolist_list_var_$4) {
		SubLObject current;
		final SubLObject datum = current = triple;
		SubLObject block = NIL;
		SubLObject failed_these_filters = NIL;
		SubLObject disconfidence = NIL;
		destructuring_bind_must_consp(current, datum, $list102);
		block = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list102);
		failed_these_filters = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list102);
		disconfidence = current.first();
		current = current.rest();
		if (NIL == current) {
		    if (NIL != failed_these_filters) {
			_csetf_nc_block_filters(block, reverse(failed_these_filters));
			_csetf_nc_block_confidence(block, multiply(disconfidence, nc_block_confidence(block)));
		    }
		} else {
		    cdestructuring_bind_error(datum, $list102);
		}
		cdolist_list_var_$4 = cdolist_list_var_$4.rest();
		triple = cdolist_list_var_$4.first();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    this_cluster = cdolist_list_var.first();
	}
	return blocks;
    }

    /**
     * Does BLOCK combine too many or too few sub-blocks?
     */
    @LispMethod(comment = "Does BLOCK combine too many or too few sub-blocks?")
    public static final SubLObject rbp_parse_wrong_sizeP_alt(SubLObject block, SubLObject block_hash) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject component_count = rbp_component_count(block, block_hash);
		return makeBoolean(($rbp_minimum_component_count$.getDynamicValue(thread).isNumber() && component_count.numL($rbp_minimum_component_count$.getDynamicValue(thread)))
			|| ($rbp_maximum_component_count$.getDynamicValue(thread).isNumber() && component_count.numG($rbp_maximum_component_count$.getDynamicValue(thread))));
	    }
	}
    }

    /**
     * Does BLOCK combine too many or too few sub-blocks?
     */
    @LispMethod(comment = "Does BLOCK combine too many or too few sub-blocks?")
    public static SubLObject rbp_parse_wrong_sizeP(final SubLObject block, final SubLObject block_hash) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject component_count = rbp_component_count(block, block_hash);
	return makeBoolean(($rbp_minimum_component_count$.getDynamicValue(thread).isNumber() && component_count.numL($rbp_minimum_component_count$.getDynamicValue(thread)))
		|| ($rbp_maximum_component_count$.getDynamicValue(thread).isNumber() && component_count.numG($rbp_maximum_component_count$.getDynamicValue(thread))));
    }

    public static final SubLObject rbp_component_count_alt(SubLObject block, SubLObject block_hash) {
	{
	    SubLObject sub_tree = nc_block_sub_tree(block);
	    if (NIL == sub_tree) {
		return ONE_INTEGER;
	    } else {
		{
		    SubLObject dtr1 = rbp_chart_parser.rbp_chart_block_hash_lookup(second(sub_tree), block_hash);
		    SubLObject dtr2 = rbp_chart_parser.rbp_chart_block_hash_lookup(third(sub_tree), block_hash);
		    return add(rbp_component_count(dtr1, block_hash), rbp_component_count(dtr2, block_hash));
		}
	    }
	}
    }

    public static SubLObject rbp_component_count(final SubLObject block, final SubLObject block_hash) {
	final SubLObject sub_tree = nc_block_sub_tree(block);
	if (NIL == sub_tree) {
	    return ONE_INTEGER;
	}
	final SubLObject dtr1 = rbp_chart_parser.rbp_chart_block_hash_lookup(second(sub_tree), block_hash);
	final SubLObject dtr2 = rbp_chart_parser.rbp_chart_block_hash_lookup(third(sub_tree), block_hash);
	return add(rbp_component_count(dtr1, block_hash), rbp_component_count(dtr2, block_hash));
    }

    public static final SubLObject ncp_reporting_metrics_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject string = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt107);
	    string = current.first();
	    current = current.rest();
	    {
		SubLObject body = current;
		return list(PROGN, $list_alt109, list(NCP_HERALD_START, string), listS(CLET, $list_alt111, listS(CTIME, TIME, append(body, NIL)), $list_alt114));
	    }
	}
    }

    public static SubLObject ncp_reporting_metrics(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject string = NIL;
	destructuring_bind_must_consp(current, datum, $list103);
	string = current.first();
	final SubLObject body;
	current = body = current.rest();
	return list(PROGN, $list105, list(NCP_HERALD_START, string), listS(CLET, $list107, listS(CTIME, TIME, append(body, NIL)), $list110));
    }

    public static final SubLObject parse_noun_compound_alt(SubLObject string, SubLObject complete_onlyP, SubLObject num) {
	if (complete_onlyP == UNPROVIDED) {
	    complete_onlyP = T;
	}
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == rbp_check_initializations()) {
		return NIL;
	    }
	    {
		SubLObject parse = new_nc_parse(string);
		SubLObject good = NIL;
		SubLObject bad = NIL;
		_csetf_nc_parse_input_strings(parse, rbp_string_tokenize(string));
		{
		    SubLObject _prev_bind_0 = $rbp_input_strings$.currentBinding(thread);
		    try {
			$rbp_input_strings$.bind(nc_parse_input_strings(parse), thread);
			_csetf_nc_parse_chart(parse, ncp_chart_init(nc_parse_input_strings(parse), UNPROVIDED));
			thread.resetMultipleValues();
			{
			    SubLObject good_5 = parse_noun_compound_int(parse, complete_onlyP, num, UNPROVIDED);
			    SubLObject bad_6 = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    good = good_5;
			    bad = bad_6;
			}
		    } finally {
			$rbp_input_strings$.rebind(_prev_bind_0, thread);
		    }
		}
		return values(good, bad);
	    }
	}
    }

    public static SubLObject parse_noun_compound(final SubLObject string, SubLObject complete_onlyP, SubLObject num) {
	if (complete_onlyP == UNPROVIDED) {
	    complete_onlyP = T;
	}
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == rbp_check_initializations()) {
	    return NIL;
	}
	final SubLObject parse = new_nc_parse(string);
	SubLObject good = NIL;
	SubLObject bad = NIL;
	_csetf_nc_parse_input_strings(parse, rbp_string_tokenize(string));
	final SubLObject _prev_bind_0 = $rbp_input_strings$.currentBinding(thread);
	try {
	    $rbp_input_strings$.bind(nc_parse_input_strings(parse), thread);
	    _csetf_nc_parse_chart(parse, ncp_chart_init(nc_parse_input_strings(parse), UNPROVIDED));
	    thread.resetMultipleValues();
	    final SubLObject good_$5 = parse_noun_compound_int(parse, complete_onlyP, num, UNPROVIDED);
	    final SubLObject bad_$6 = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    good = good_$5;
	    bad = bad_$6;
	} finally {
	    $rbp_input_strings$.rebind(_prev_bind_0, thread);
	}
	return values(good, bad);
    }

    /**
     *
     *
     * @param REQUIRED-RULE-FORTS;
     * 		LISTP of rule forts *all of which* must be used
     * 		in a successful parse.
     */
    @LispMethod(comment = "@param REQUIRED-RULE-FORTS;\r\n\t\tLISTP of rule forts *all of which* must be used\r\n\t\tin a successful parse.")
    public static final SubLObject parse_noun_compound_with_rules_alt(SubLObject string, SubLObject required_rule_forts, SubLObject complete_onlyP, SubLObject num) {
	if (complete_onlyP == UNPROVIDED) {
	    complete_onlyP = T;
	}
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(required_rule_forts, LISTP);
	    {
		SubLObject list_var = required_rule_forts;
		SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
		{
		    SubLObject cdolist_list_var = list_var;
		    SubLObject elem = NIL;
		    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
			SubLTrampolineFile.checkType(elem, RBP_RULE_FORT_P);
		    }
		}
	    }
	    if (NIL == rbp_check_initializations()) {
		return NIL;
	    }
	    {
		SubLObject parse = new_nc_parse(string);
		SubLObject required_rbp_rules = Mapping.mapcar(RBP_FIND_RULE_FROM_CYCL, required_rule_forts);
		SubLObject good = NIL;
		SubLObject bad = NIL;
		_csetf_nc_parse_input_strings(parse, rbp_string_tokenize(string));
		{
		    SubLObject _prev_bind_0 = $rbp_input_strings$.currentBinding(thread);
		    try {
			$rbp_input_strings$.bind(nc_parse_input_strings(parse), thread);
			_csetf_nc_parse_chart(parse, ncp_chart_init(nc_parse_input_strings(parse), UNPROVIDED));
			thread.resetMultipleValues();
			{
			    SubLObject good_7 = parse_noun_compound_int(parse, complete_onlyP, num, required_rbp_rules);
			    SubLObject bad_8 = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    good = good_7;
			    bad = bad_8;
			}
		    } finally {
			$rbp_input_strings$.rebind(_prev_bind_0, thread);
		    }
		}
		return values(good, bad);
	    }
	}
    }

    /**
     *
     *
     * @param REQUIRED-RULE-FORTS;
     * 		LISTP of rule forts *all of which* must be used
     * 		in a successful parse.
     */
    @LispMethod(comment = "@param REQUIRED-RULE-FORTS;\r\n\t\tLISTP of rule forts *all of which* must be used\r\n\t\tin a successful parse.")
    public static SubLObject parse_noun_compound_with_rules(final SubLObject string, final SubLObject required_rule_forts, SubLObject complete_onlyP, SubLObject num) {
	if (complete_onlyP == UNPROVIDED) {
	    complete_onlyP = T;
	}
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != listp(required_rule_forts) : "! listp(required_rule_forts) " + ("Types.listp(required_rule_forts) " + "CommonSymbols.NIL != Types.listp(required_rule_forts) ") + required_rule_forts;
	assert NIL != list_utilities.non_dotted_list_p(required_rule_forts) : "! list_utilities.non_dotted_list_p(required_rule_forts) " + ("list_utilities.non_dotted_list_p(required_rule_forts) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(required_rule_forts) ") + required_rule_forts;
	SubLObject cdolist_list_var = required_rule_forts;
	SubLObject elem = NIL;
	elem = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    assert NIL != rbp_rule_fort_p(elem) : "! noun_compound_parser.rbp_rule_fort_p(elem) " + ("noun_compound_parser.rbp_rule_fort_p(elem) " + "CommonSymbols.NIL != noun_compound_parser.rbp_rule_fort_p(elem) ") + elem;
	    cdolist_list_var = cdolist_list_var.rest();
	    elem = cdolist_list_var.first();
	}
	if (NIL == rbp_check_initializations()) {
	    return NIL;
	}
	final SubLObject parse = new_nc_parse(string);
	final SubLObject required_rbp_rules = Mapping.mapcar(RBP_FIND_RULE_FROM_CYCL, required_rule_forts);
	SubLObject good = NIL;
	SubLObject bad = NIL;
	_csetf_nc_parse_input_strings(parse, rbp_string_tokenize(string));
	final SubLObject _prev_bind_0 = $rbp_input_strings$.currentBinding(thread);
	try {
	    $rbp_input_strings$.bind(nc_parse_input_strings(parse), thread);
	    _csetf_nc_parse_chart(parse, ncp_chart_init(nc_parse_input_strings(parse), UNPROVIDED));
	    thread.resetMultipleValues();
	    final SubLObject good_$7 = parse_noun_compound_int(parse, complete_onlyP, num, required_rbp_rules);
	    final SubLObject bad_$8 = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    good = good_$7;
	    bad = bad_$8;
	} finally {
	    $rbp_input_strings$.rebind(_prev_bind_0, thread);
	}
	return values(good, bad);
    }

    public static final SubLObject rbp_rule_fort_p_alt(SubLObject v_object) {
	return isa.isa_in_any_mtP(v_object, $$NounCompoundRule);
    }

    public static SubLObject rbp_rule_fort_p(final SubLObject v_object) {
	return isa.isa_in_any_mtP(v_object, $$NounCompoundRule);
    }

    /**
     *
     *
     * @param STRING-TOKENS;
     * 		LISTP of string tokens whose values are lists of (<DENOT> <POS> <POS-PRED>) or  (<DENOT> <POS> <POS-PRED> <WU>) tuples
     */
    @LispMethod(comment = "@param STRING-TOKENS;\r\n\t\tLISTP of string tokens whose values are lists of (<DENOT> <POS> <POS-PRED>) or  (<DENOT> <POS> <POS-PRED> <WU>) tuples")
    public static final SubLObject parse_noun_compound_from_string_tokens_alt(SubLObject string_tokens, SubLObject complete_onlyP, SubLObject num) {
	if (complete_onlyP == UNPROVIDED) {
	    complete_onlyP = T;
	}
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject input_strings = NIL;
		SubLObject string_stack = NIL;
		SubLObject cdolist_list_var = string_tokens;
		SubLObject token = NIL;
		for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), token = cdolist_list_var.first()) {
		    {
			SubLObject string = standard_tokenization.string_token_string(token);
			if (NIL != string_utilities.non_empty_stringP(string)) {
			    string_stack = cons(string, string_stack);
			} else {
			    return NIL;
			}
		    }
		}
		input_strings = nreverse(string_stack);
		{
		    SubLObject input_string = string_utilities.bunge(input_strings, UNPROVIDED);
		    SubLObject nc_parse = new_nc_parse(input_string);
		    _csetf_nc_parse_input_strings(nc_parse, input_strings);
		    {
			SubLObject _prev_bind_0 = $rbp_input_strings$.currentBinding(thread);
			try {
			    $rbp_input_strings$.bind(nc_parse_input_strings(nc_parse), thread);
			    _csetf_nc_parse_chart(nc_parse, ncp_chart_init_from_string_tokens(string_tokens));
			} finally {
			    $rbp_input_strings$.rebind(_prev_bind_0, thread);
			}
		    }
		    return parse_noun_compound_int(nc_parse, complete_onlyP, num, UNPROVIDED);
		}
	    }
	}
    }

    /**
     *
     *
     * @param STRING-TOKENS;
     * 		LISTP of string tokens whose values are lists of (<DENOT> <POS> <POS-PRED>) or  (<DENOT> <POS> <POS-PRED> <WU>) tuples
     */
    @LispMethod(comment = "@param STRING-TOKENS;\r\n\t\tLISTP of string tokens whose values are lists of (<DENOT> <POS> <POS-PRED>) or  (<DENOT> <POS> <POS-PRED> <WU>) tuples")
    public static SubLObject parse_noun_compound_from_string_tokens(final SubLObject string_tokens, SubLObject complete_onlyP, SubLObject num) {
	if (complete_onlyP == UNPROVIDED) {
	    complete_onlyP = T;
	}
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject input_strings = NIL;
	SubLObject string_stack = NIL;
	SubLObject cdolist_list_var = string_tokens;
	SubLObject token = NIL;
	token = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject string = standard_tokenization.string_token_string(token);
	    if (NIL == string_utilities.non_empty_stringP(string)) {
		return NIL;
	    }
	    string_stack = cons(string, string_stack);
	    cdolist_list_var = cdolist_list_var.rest();
	    token = cdolist_list_var.first();
	}
	input_strings = nreverse(string_stack);
	final SubLObject input_string = string_utilities.bunge(input_strings, UNPROVIDED);
	final SubLObject nc_parse = new_nc_parse(input_string);
	_csetf_nc_parse_input_strings(nc_parse, input_strings);
	final SubLObject _prev_bind_0 = $rbp_input_strings$.currentBinding(thread);
	try {
	    $rbp_input_strings$.bind(nc_parse_input_strings(nc_parse), thread);
	    _csetf_nc_parse_chart(nc_parse, ncp_chart_init_from_string_tokens(string_tokens));
	} finally {
	    $rbp_input_strings$.rebind(_prev_bind_0, thread);
	}
	return parse_noun_compound_int(nc_parse, complete_onlyP, num, UNPROVIDED);
    }

    public static final SubLObject with_new_ncp_problem_store_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject body = current;
	    SubLObject store = $sym121$STORE;
	    return list(WITH_NEW_PROBLEM_STORE, list(store), listS(CLET, list(list($ncp_problem_store$, store)), append(body, NIL)));
	}
    }

    public static SubLObject with_new_ncp_problem_store(final SubLObject macroform, final SubLObject environment) {
	final SubLObject datum = macroform.rest();
	final SubLObject body;
	final SubLObject current = body = datum;
	final SubLObject store = $sym117$STORE;
	return list(WITH_NEW_PROBLEM_STORE, list(store), listS(CLET, list(list($ncp_problem_store$, store)), append(body, NIL)));
    }

    /**
     *
     *
     * @param REQUIRED-RBP-RULES;
     * 		:NONE or LISTP of rule ids *all of which* must be used
     * 		in a successful parse.
     */
    @LispMethod(comment = "@param REQUIRED-RBP-RULES;\r\n\t\t:NONE or LISTP of rule ids *all of which* must be used\r\n\t\tin a successful parse.")
    public static final SubLObject parse_noun_compound_int_alt(SubLObject nc_parse, SubLObject complete_onlyP, SubLObject num, SubLObject required_rbp_rules) {
	if (required_rbp_rules == UNPROVIDED) {
	    required_rbp_rules = $NONE;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject good = NIL;
		SubLObject bad = NIL;
		{
		    SubLObject _prev_bind_0 = parsing_vars.$rbp_bypass_deverbal_filtersP$.currentBinding(thread);
		    SubLObject _prev_bind_1 = $rbp_input_strings$.currentBinding(thread);
		    try {
			parsing_vars.$rbp_bypass_deverbal_filtersP$.bind(NIL != complete_onlyP ? ((SubLObject) (parsing_vars.$rbp_bypass_deverbal_filtersP$.getDynamicValue(thread))) : T, thread);
			$rbp_input_strings$.bind(nc_parse_input_strings(nc_parse), thread);
			{
			    SubLObject store = NIL;
			    try {
				store = inference_datastructures_problem_store.new_problem_store(NIL);
				{
				    SubLObject _prev_bind_0_9 = $ncp_problem_store$.currentBinding(thread);
				    try {
					$ncp_problem_store$.bind(store, thread);
					{
					    SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					    SubLObject local_state = state;
					    {
						SubLObject _prev_bind_0_10 = memoization_state.$memoization_state$.currentBinding(thread);
						try {
						    memoization_state.$memoization_state$.bind(local_state, thread);
						    {
							SubLObject original_memoization_process = NIL;
							if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
							    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
							    {
								SubLObject current_proc = current_process();
								if (NIL == original_memoization_process) {
								    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
								} else {
								    if (original_memoization_process != current_proc) {
									Errors.error($str_alt124$Invalid_attempt_to_reuse_memoizat);
								    }
								}
							    }
							}
							try {
							    $rbp_rules_to_parses_shadow$.setDynamicValue(NIL, thread);
							} finally {
							    {
								SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
								try {
								    $is_thread_performing_cleanupP$.bind(T, thread);
								    ncp_initialize_metrics();
								    ncp_herald_start(nc_parse_input_string(nc_parse));
								    {
									SubLObject time = NIL;
									SubLObject time_var = get_internal_real_time();
									{
									    SubLObject chart = nc_parse_chart(nc_parse);
									    SubLObject parses = rbp_filter_and_sort_result_blocks(rbp_chart_parser.rbp_chart_parse(chart), rbp_chart_parser.rbp_chart_block_hash(nc_parse_chart(nc_parse)), required_rbp_rules);
									    if (NIL != complete_onlyP) {
										thread.resetMultipleValues();
										{
										    SubLObject good_pile = display_complete_parses(parses);
										    SubLObject bad_pile = thread.secondMultipleValue();
										    thread.resetMultipleValues();
										    good = list_utilities.first_n(num, good_pile);
										    if (NIL == list_utilities.lengthG(good_pile, num, UNPROVIDED)) {
											bad = list_utilities.first_n(subtract(num, length(good_pile)), bad_pile);
										    }
										}
									    } else {
										good = display_all_parses(nc_parse_chart(nc_parse));
									    }
									}
									time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
									ncp_report_metrics(time);
								    }
								    if ((NIL != local_state) && (NIL == original_memoization_process)) {
									memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
								    }
								} finally {
								    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
								}
							    }
							}
						    }
						} finally {
						    memoization_state.$memoization_state$.rebind(_prev_bind_0_10, thread);
						}
					    }
					}
				    } finally {
					$ncp_problem_store$.rebind(_prev_bind_0_9, thread);
				    }
				}
			    } finally {
				{
				    SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
				    try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					inference_datastructures_problem_store.destroy_problem_store(store);
				    } finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
				    }
				}
			    }
			}
		    } finally {
			$rbp_input_strings$.rebind(_prev_bind_1, thread);
			parsing_vars.$rbp_bypass_deverbal_filtersP$.rebind(_prev_bind_0, thread);
		    }
		}
		return values(good, bad);
	    }
	}
    }

    /**
     *
     *
     * @param REQUIRED-RBP-RULES;
     * 		:NONE or LISTP of rule ids *all of which* must be used
     * 		in a successful parse.
     */
    @LispMethod(comment = "@param REQUIRED-RBP-RULES;\r\n\t\t:NONE or LISTP of rule ids *all of which* must be used\r\n\t\tin a successful parse.")
    public static SubLObject parse_noun_compound_int(final SubLObject nc_parse, final SubLObject complete_onlyP, final SubLObject num, SubLObject required_rbp_rules) {
	if (required_rbp_rules == UNPROVIDED) {
	    required_rbp_rules = $NONE;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject good = NIL;
	SubLObject bad = NIL;
	final SubLObject _prev_bind_0 = parsing_vars.$rbp_bypass_deverbal_filtersP$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $rbp_input_strings$.currentBinding(thread);
	try {
	    parsing_vars.$rbp_bypass_deverbal_filtersP$.bind(NIL != complete_onlyP ? parsing_vars.$rbp_bypass_deverbal_filtersP$.getDynamicValue(thread) : T, thread);
	    $rbp_input_strings$.bind(nc_parse_input_strings(nc_parse), thread);
	    SubLObject store = NIL;
	    try {
		store = inference_datastructures_problem_store.new_problem_store(NIL);
		final SubLObject _prev_bind_0_$9 = $ncp_problem_store$.currentBinding(thread);
		try {
		    $ncp_problem_store$.bind(store, thread);
		    final SubLObject local_state;
		    final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    final SubLObject _prev_bind_0_$10 = memoization_state.$memoization_state$.currentBinding(thread);
		    try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
			    $rbp_rules_to_parses_shadow$.setDynamicValue(NIL, thread);
			    ncp_initialize_metrics();
			    ncp_herald_start(nc_parse_input_string(nc_parse));
			    SubLObject time = NIL;
			    final SubLObject time_var = get_internal_real_time();
			    final SubLObject chart = nc_parse_chart(nc_parse);
			    final SubLObject parses = rbp_filter_and_sort_result_blocks(rbp_chart_parser.rbp_chart_parse(chart), rbp_chart_parser.rbp_chart_block_hash(nc_parse_chart(nc_parse)), required_rbp_rules);
			    if (NIL != complete_onlyP) {
				thread.resetMultipleValues();
				final SubLObject good_pile = display_complete_parses(parses);
				final SubLObject bad_pile = thread.secondMultipleValue();
				thread.resetMultipleValues();
				good = list_utilities.first_n(num, good_pile);
				if (NIL == list_utilities.lengthG(good_pile, num, UNPROVIDED)) {
				    bad = list_utilities.first_n(subtract(num, length(good_pile)), bad_pile);
				}
			    } else {
				good = display_all_parses(nc_parse_chart(nc_parse));
			    }
			    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
			    ncp_report_metrics(time);
			} finally {
			    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
				restoreValuesFromVector(_values);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
			    }
			}
		    } finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0_$10, thread);
		    }
		} finally {
		    $ncp_problem_store$.rebind(_prev_bind_0_$9, thread);
		}
	    } finally {
		final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values2 = getValuesAsVector();
		    inference_datastructures_problem_store.destroy_problem_store(store);
		    restoreValuesFromVector(_values2);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
		}
	    }
	} finally {
	    $rbp_input_strings$.rebind(_prev_bind_2, thread);
	    parsing_vars.$rbp_bypass_deverbal_filtersP$.rebind(_prev_bind_0, thread);
	}
	return values(good, bad);
    }

    public static final SubLObject ncp_initialize_metrics_alt() {
	nl_reformulator.nl_ref_reset_metrics();
	rbp_wff.rbp_wff_reset_metrics();
	rbp_cncb_reset();
	return NIL;
    }

    public static SubLObject ncp_initialize_metrics() {
	nl_reformulator.nl_ref_reset_metrics();
	rbp_wff.rbp_wff_reset_metrics();
	return NIL;
    }

    public static final SubLObject ncp_report_metrics_alt(SubLObject time) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $rbp_report_parse_timeP$.getDynamicValue(thread)) {
		format(T, $str_alt125$__Total_parse_time___4_2F_seconds, time);
		rbp_wff.rbp_wff_report_metrics(T);
		nl_reformulator.nl_ref_report_metrics(T);
		format(T, $str_alt126$__Spent__4_2F_seconds_actually_pa, subtract(time, rbp_wff.$rbp_wff_check_time$.getDynamicValue(thread), nl_reformulator.get_nl_reformulator_time()));
		rbp_cncb_report();
	    }
	    return NIL;
	}
    }

    public static SubLObject ncp_report_metrics(final SubLObject time) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $rbp_report_parse_timeP$.getDynamicValue(thread)) {
	    format(T, $str120$__Total_parse_time___4_2F_seconds, time);
	    rbp_wff.rbp_wff_report_metrics(T);
	    nl_reformulator.nl_ref_report_metrics(T);
	    format(T, $str121$__Spent__4_2F_seconds_actually_pa, subtract(time, rbp_wff.$rbp_wff_check_time$.getDynamicValue(thread), nl_reformulator.get_nl_reformulator_time()));
	}
	return NIL;
    }

    public static final SubLObject ncp_herald_start_alt(SubLObject string) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $rbp_report_parse_timeP$.getDynamicValue(thread)) {
		terpri(T);
		format(T, $str_alt127$__Now_parsing__S___, string);
	    }
	    return NIL;
	}
    }

    public static SubLObject ncp_herald_start(final SubLObject string) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $rbp_report_parse_timeP$.getDynamicValue(thread)) {
	    terpri(T);
	    format(T, $str122$__Now_parsing__S___, string);
	}
	return NIL;
    }

    public static final SubLObject rbp_sort_blocks_complexity_first_alt(SubLObject blocks) {
	{
	    SubLObject sorted = Sort.sort(Sort.sort(blocks, $sym128$NPP_TERM_COMPLEXITY__, NC_BLOCK_DENOT), $sym129$_, NC_BLOCK_CONFIDENCE);
	    return sorted;
	}
    }

    public static SubLObject rbp_sort_blocks_complexity_first(final SubLObject blocks) {
	final SubLObject sorted = Sort.sort(Sort.sort(blocks, $sym123$NPP_TERM_COMPLEXITY__, NC_BLOCK_DENOT), $sym124$_, NC_BLOCK_CONFIDENCE);
	return sorted;
    }

    public static final SubLObject rbp_sort_blocks_confidence_first_alt(SubLObject blocks) {
	{
	    SubLObject sorted = Sort.sort(Sort.sort(blocks, $sym129$_, NC_BLOCK_CONFIDENCE), $sym128$NPP_TERM_COMPLEXITY__, NC_BLOCK_DENOT);
	    return sorted;
	}
    }

    public static SubLObject rbp_sort_blocks_confidence_first(final SubLObject blocks) {
	final SubLObject sorted = Sort.sort(Sort.sort(blocks, $sym124$_, NC_BLOCK_CONFIDENCE), $sym123$NPP_TERM_COMPLEXITY__, NC_BLOCK_DENOT);
	return sorted;
    }

    public static final SubLObject rbp_filter_and_sort_result_blocks_alt(SubLObject blocks, SubLObject block_hash, SubLObject required_rbp_rules) {
	if (required_rbp_rules == UNPROVIDED) {
	    required_rbp_rules = $NONE;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject filtered_blocks = NIL;
		{
		    SubLObject cdolist_list_var = blocks;
		    SubLObject block = NIL;
		    for (block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), block = cdolist_list_var.first()) {
			if (NIL == parsing_macros.parsing_timeout_time_reachedP()) {
			    if (NIL == nc_block_uses_required_rules_p(block, required_rbp_rules, block_hash)) {
				if (NIL != subl_promotions.memberP(nc_block_rule(block), rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) {
				    Errors.warn($str_alt130$___S_didn_t_use_the_required_rule, nc_block_denot(block), required_rbp_rules);
				}
			    } else {
				if (NIL != rbp_parse_wrong_sizeP(block, block_hash)) {
				    if (NIL != subl_promotions.memberP(nc_block_rule(block), rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) {
					Errors.warn($str_alt131$___S_was_too_long_or_too_short___, nc_block_denot(block));
				    }
				} else {
				    if ((NIL != $nominal_interpretations_only$.getDynamicValue(thread)) && (NIL == rbp_nominal_blockP(block))) {
					if (NIL != subl_promotions.memberP(nc_block_rule(block), rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) {
					    Errors.warn($str_alt132$__The__S_form_of____S___is_being_, nc_block_head_string_pred(block), nc_block_denot(block));
					}
				    } else {
					filtered_blocks = cons(block, filtered_blocks);
				    }
				}
			    }
			}
		    }
		}
		filtered_blocks = rbp_unify_city_named_fn_blocks(filtered_blocks);
		if (NIL != list_utilities.lengthG(filtered_blocks, ONE_INTEGER, UNPROVIDED)) {
		    {
			SubLObject boolean_clusters = list($rbp_universal_boolean_filters$.getDynamicValue(thread));
			SubLObject macroscopic_clusters = NIL;
			if ((NIL != parsing_vars.$rbp_apply_all_filters_regardlessP$.getDynamicValue(thread))
				|| ((NIL == parsing_vars.$rbp_bypass_deverbal_filtersP$.getDynamicValue(thread)) && (NIL != rbp_deverbal_candidateP(string_utilities.bunge($rbp_input_strings$.getDynamicValue(thread), UNPROVIDED))))) {
			    boolean_clusters = cons($rbp_deverbal_boolean_filters$.getDynamicValue(thread), boolean_clusters);
			    macroscopic_clusters = cons($rbp_deverbal_macroscopic_block_filters$.getDynamicValue(thread), macroscopic_clusters);
			}
			filtered_blocks = rbp_process_filter_clusters(boolean_clusters, filtered_blocks, $BOOLEAN);
			filtered_blocks = rbp_process_filter_clusters(macroscopic_clusters, filtered_blocks, $MACROSCOPIC);
		    }
		}
		if (NIL == parsing_vars.$rbp_bypass_block_unificationP$.getDynamicValue(thread)) {
		    filtered_blocks = rbp_unify_blocks_to_common_specpreds(filtered_blocks);
		}
		if (NIL != parsing_vars.$rbp_reformulate_resultsP$.getDynamicValue(thread)) {
		    {
			SubLObject cdolist_list_var = filtered_blocks;
			SubLObject block = NIL;
			for (block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), block = cdolist_list_var.first()) {
			    _csetf_nc_block_denot(block, nl_reformulator.nl_reformulate(nc_block_denot(block), UNPROVIDED));
			}
		    }
		} else {
		    filtered_blocks = rbp_unify_rewrite_of_blocks(filtered_blocks);
		}
		{
		    SubLObject cdolist_list_var = filtered_blocks;
		    SubLObject block = NIL;
		    for (block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), block = cdolist_list_var.first()) {
			_csetf_nc_block_confidence(block, multiply(nc_block_confidence(block), rbp_block_reliability_estimate(block, block_hash)));
		    }
		}
		return NIL != $rbp_sort_blocks_confidence_firstP$.getDynamicValue(thread) ? ((SubLObject) (rbp_sort_blocks_confidence_first(filtered_blocks))) : rbp_sort_blocks_complexity_first(filtered_blocks);
	    }
	}
    }

    public static SubLObject rbp_filter_and_sort_result_blocks(final SubLObject blocks, final SubLObject block_hash, SubLObject required_rbp_rules) {
	if (required_rbp_rules == UNPROVIDED) {
	    required_rbp_rules = $NONE;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject filtered_blocks = NIL;
	SubLObject cdolist_list_var = blocks;
	SubLObject block = NIL;
	block = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL == parsing_macros.parsing_timeout_time_reachedP()) {
		if (NIL == nc_block_uses_required_rules_p(block, required_rbp_rules, block_hash)) {
		    if (NIL != subl_promotions.memberP(nc_block_rule(block), rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) {
			Errors.warn($str125$___S_didn_t_use_the_required_rule, nc_block_denot(block), required_rbp_rules);
		    }
		} else if (NIL != rbp_parse_wrong_sizeP(block, block_hash)) {
		    if (NIL != subl_promotions.memberP(nc_block_rule(block), rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) {
			Errors.warn($str126$___S_was_too_long_or_too_short___, nc_block_denot(block));
		    }
		} else if ((NIL != $nominal_interpretations_only$.getDynamicValue(thread)) && (NIL == rbp_nominal_blockP(block))) {
		    if (NIL != subl_promotions.memberP(nc_block_rule(block), rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) {
			Errors.warn($str127$__The__S_form_of____S___is_being_, nc_block_head_string_pred(block), nc_block_denot(block));
		    }
		} else {
		    filtered_blocks = cons(block, filtered_blocks);
		}

	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    block = cdolist_list_var.first();
	}
	filtered_blocks = rbp_unify_city_named_fn_blocks(filtered_blocks);
	if (NIL != list_utilities.lengthG(filtered_blocks, ONE_INTEGER, UNPROVIDED)) {
	    SubLObject boolean_clusters = list($rbp_universal_boolean_filters$.getDynamicValue(thread));
	    SubLObject macroscopic_clusters = NIL;
	    if ((NIL != parsing_vars.$rbp_apply_all_filters_regardlessP$.getDynamicValue(thread)) || ((NIL == parsing_vars.$rbp_bypass_deverbal_filtersP$.getDynamicValue(thread)) && (NIL != rbp_deverbal_candidateP(string_utilities.bunge($rbp_input_strings$.getDynamicValue(thread), UNPROVIDED))))) {
		boolean_clusters = cons($rbp_deverbal_boolean_filters$.getDynamicValue(thread), boolean_clusters);
		macroscopic_clusters = cons($rbp_deverbal_macroscopic_block_filters$.getDynamicValue(thread), macroscopic_clusters);
	    }
	    filtered_blocks = rbp_process_filter_clusters(boolean_clusters, filtered_blocks, $BOOLEAN);
	    filtered_blocks = rbp_process_filter_clusters(macroscopic_clusters, filtered_blocks, $MACROSCOPIC);
	}
	if (NIL == parsing_vars.$rbp_bypass_block_unificationP$.getDynamicValue(thread)) {
	    filtered_blocks = rbp_unify_blocks_to_common_specpreds(filtered_blocks);
	}
	if (NIL != parsing_vars.$rbp_reformulate_resultsP$.getDynamicValue(thread)) {
	    cdolist_list_var = filtered_blocks;
	    block = NIL;
	    block = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		_csetf_nc_block_denot(block, nl_reformulator.nl_reformulate(nc_block_denot(block), UNPROVIDED));
		cdolist_list_var = cdolist_list_var.rest();
		block = cdolist_list_var.first();
	    }
	} else {
	    filtered_blocks = rbp_unify_rewrite_of_blocks(filtered_blocks);
	}
	cdolist_list_var = filtered_blocks;
	block = NIL;
	block = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    _csetf_nc_block_confidence(block, multiply(nc_block_confidence(block), rbp_block_reliability_estimate(block, block_hash)));
	    cdolist_list_var = cdolist_list_var.rest();
	    block = cdolist_list_var.first();
	}
	return NIL != $rbp_sort_blocks_confidence_firstP$.getDynamicValue(thread) ? rbp_sort_blocks_confidence_first(filtered_blocks) : rbp_sort_blocks_complexity_first(filtered_blocks);
    }

    public static final SubLObject rbp_block_reliability_estimate_alt(SubLObject block, SubLObject wrt_block_hash) {
	if (wrt_block_hash == UNPROVIDED) {
	    wrt_block_hash = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != nc_block_sub_tree(block)) {
		return multiply(rbp_block_reliability_estimate(nc_block_mod_block(block, wrt_block_hash), wrt_block_hash), rbp_block_reliability_estimate(nc_block_head_block(block, wrt_block_hash), wrt_block_hash));
	    }
	    {
		SubLObject cdolist_list_var = Mapping.mapcar(LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION, lexicon_utilities.gen_string_assertions_for_term(nc_block_denot(block), UNPROVIDED, UNPROVIDED));
		SubLObject lex = NIL;
		for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex = cdolist_list_var.first()) {
		    if ((NIL != lexicon_utilities.lexical_semantic_formula_genl_posP(lex, $$Noun, UNPROVIDED)) && (NIL != lexicon_utilities.lexical_semantic_formula_matches_head_stringXposP(lex, nc_block_spanned_string(block), $$Noun, UNPROVIDED))) {
			return $rbp_reliability_high$.getDynamicValue(thread);
		    }
		}
	    }
	    if (NIL != string_utilities.substringP($str_alt91$_, nc_block_spanned_string(block), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		return $rbp_reliability_medium$.getDynamicValue(thread);
	    }
	    if (NIL != list_utilities.lengthE(lexicon_utilities.lexifications_for_term(nc_block_denot(block), NIL, UNPROVIDED), ONE_INTEGER, UNPROVIDED)) {
		return $rbp_reliability_medium$.getDynamicValue(thread);
	    }
	    return $rbp_reliability_low$.getDynamicValue(thread);
	}
    }

    public static SubLObject rbp_block_reliability_estimate(final SubLObject block, SubLObject wrt_block_hash) {
	if (wrt_block_hash == UNPROVIDED) {
	    wrt_block_hash = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != nc_block_sub_tree(block)) {
	    return multiply(rbp_block_reliability_estimate(nc_block_mod_block(block, wrt_block_hash), wrt_block_hash), rbp_block_reliability_estimate(nc_block_head_block(block, wrt_block_hash), wrt_block_hash));
	}
	SubLObject cdolist_list_var = Mapping.mapcar(LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION, lexicon_utilities.gen_string_assertions_for_term(nc_block_denot(block), UNPROVIDED, UNPROVIDED));
	SubLObject lex = NIL;
	lex = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if ((NIL != lexicon_utilities.lexical_semantic_formula_genl_posP(lex, $$Noun, UNPROVIDED)) && (NIL != lexicon_utilities.lexical_semantic_formula_matches_head_stringXposP(lex, nc_block_spanned_string(block), $$Noun, UNPROVIDED))) {
		return $rbp_reliability_high$.getDynamicValue(thread);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    lex = cdolist_list_var.first();
	}
	if (NIL != string_utilities.substringP($$$_, nc_block_spanned_string(block), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
	    return $rbp_reliability_medium$.getDynamicValue(thread);
	}
	if (NIL != list_utilities.lengthE(lexicon_utilities.lexifications_for_term(nc_block_denot(block), NIL, UNPROVIDED, UNPROVIDED), ONE_INTEGER, UNPROVIDED)) {
	    return $rbp_reliability_medium$.getDynamicValue(thread);
	}
	return $rbp_reliability_low$.getDynamicValue(thread);
    }

    public static final SubLObject rbp_unify_blocks_to_common_specpreds_alt(SubLObject blocks) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == list_utilities.lengthG(blocks, ONE_INTEGER, UNPROVIDED)) {
		return blocks;
	    }
	    {
		SubLObject blocks_by_codes = dictionary.new_dictionary(EQUAL, UNPROVIDED);
		SubLObject precise_blocks = set_utilities.construct_set_from_list(blocks, UNPROVIDED, UNPROVIDED);
		{
		    SubLObject cdolist_list_var = blocks;
		    SubLObject this_block = NIL;
		    for (this_block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), this_block = cdolist_list_var.first()) {
			if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(nc_block_denot(this_block))) {
			    {
				SubLObject this_code = list(nc_block_head_string_pred(this_block), cycl_utilities.formula_arg0(nc_block_denot(this_block)), nc_block_filters(this_block));
				dictionary_utilities.dictionary_push(blocks_by_codes, this_code, this_block);
			    }
			}
		    }
		}
		{
		    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(blocks_by_codes));
		    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
			thread.resetMultipleValues();
			{
			    SubLObject this_code = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			    SubLObject these_blocks = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    {
				SubLObject subcolfunc = second(this_code);
				SubLObject blocks_by_args = dictionary.new_dictionary(EQUAL, UNPROVIDED);
				SubLObject validity_check = (NIL != isa.isa_in_any_mtP(subcolfunc, $const138$SubcollectionRelationFunction_Typ)) ? ((SubLObject) ($sym139$NPP_GENL_)) : $sym140$NPP_ISA_;
				{
				    SubLObject cdolist_list_var = these_blocks;
				    SubLObject this_block = NIL;
				    for (this_block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), this_block = cdolist_list_var.first()) {
					{
					    SubLObject denot = nc_block_denot(this_block);
					    SubLObject key = list(parsing_utilities.subcollection_function_naut_from_arg(denot), parsing_utilities.subcollection_function_naut_to_arg(denot));
					    dictionary_utilities.dictionary_push(blocks_by_args, key, this_block);
					}
				    }
				}
				{
				    SubLObject iteration_state_13 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(blocks_by_args));
				    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_13)) {
					thread.resetMultipleValues();
					{
					    SubLObject these_args = dictionary_contents.do_dictionary_contents_key_value(iteration_state_13);
					    SubLObject these_blocks_by_args = thread.secondMultipleValue();
					    thread.resetMultipleValues();
					    if (NIL != list_utilities.lengthG(these_blocks_by_args, ONE_INTEGER, UNPROVIDED)) {
						{
						    SubLObject cached_preds = NIL;
						    SubLObject precise_preds = NIL;
						    SubLObject mt = rbp_domain_mt();
						    cached_preds = list_utilities.mapcar_unique(SUBCOLLECTION_FUNCTION_NAUT_PRED, Mapping.mapcar(NC_BLOCK_DENOT, these_blocks_by_args), UNPROVIDED);
						    if (NIL != list_utilities.lengthG(cached_preds, ONE_INTEGER, UNPROVIDED)) {
							{
							    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
							    {
								SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
								SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
								SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
								try {
								    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
								    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
								    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
								    {
									SubLObject pred_var = $$relationAllExists;
									if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(these_args.first(), TWO_INTEGER, pred_var)) {
									    {
										SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(these_args.first(), TWO_INTEGER, pred_var);
										SubLObject done_var = NIL;
										SubLObject token_var = NIL;
										while (NIL == done_var) {
										    {
											SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
											SubLObject valid = makeBoolean(token_var != final_index_spec);
											if (NIL != valid) {
											    {
												SubLObject final_index_iterator = NIL;
												try {
												    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
												    {
													SubLObject done_var_14 = NIL;
													SubLObject token_var_15 = NIL;
													while (NIL == done_var_14) {
													    {
														SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_15);
														SubLObject valid_16 = makeBoolean(token_var_15 != ass);
														if (NIL != valid_16) {
														    {
															SubLObject gaf_pred = cycl_utilities.formula_arg1(ass, UNPROVIDED);
															if ((NIL == subl_promotions.memberP(gaf_pred, cached_preds, UNPROVIDED, UNPROVIDED))
																&& (NIL != funcall(validity_check, second(these_args), cycl_utilities.formula_arg3(ass, UNPROVIDED), mt))) {
															    {
																SubLObject badP = NIL;
																if (NIL == badP) {
																    {
																	SubLObject csome_list_var = cached_preds;
																	SubLObject genl = NIL;
																	for (genl = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), genl = csome_list_var.first()) {
																	    if (NIL == genl_predicates.genl_predicateP(gaf_pred, genl, UNPROVIDED, UNPROVIDED)) {
																		badP = T;
																	    }
																	}
																    }
																}
																if (NIL == badP) {
																    precise_preds = cons(gaf_pred, precise_preds);
																}
															    }
															}
														    }
														}
														done_var_14 = makeBoolean(NIL == valid_16);
													    }
													}
												    }
												} finally {
												    {
													SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
													try {
													    $is_thread_performing_cleanupP$.bind(T, thread);
													    if (NIL != final_index_iterator) {
														kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
													    }
													} finally {
													    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
													}
												    }
												}
											    }
											}
											done_var = makeBoolean(NIL == valid);
										    }
										}
									    }
									}
								    }
								} finally {
								    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
								    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
								    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
								}
							    }
							}
							if (NIL != precise_preds) {
							    {
								SubLObject recycled_block = NIL;
								SubLObject max_confidence = NIL;
								SubLObject cdolist_list_var = these_blocks_by_args;
								SubLObject block = NIL;
								for (block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), block = cdolist_list_var.first()) {
								    if (NIL == precise_preds) {
									max_confidence = max(nc_block_confidence(block), max_confidence);
									set.set_remove(block, precise_blocks);
								    } else {
									{
									    SubLObject precise_pred = precise_preds.first();
									    if ((NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread)) || (NIL != member(nc_block_rule(block), rbp_traced_rules(), UNPROVIDED, UNPROVIDED))) {
										Errors.warn($str_alt144$Strengthening__S_to_use__S, nc_block_denot(block), precise_pred);
									    }
									    _csetf_nc_block_denot(block, replace_formula_arg(TWO_INTEGER, precise_pred, nc_block_denot(block)));
									    recycled_block = block;
									    max_confidence = nc_block_confidence(block);
									    precise_preds = precise_preds.rest();
									}
								    }
								}
								_csetf_nc_block_confidence(recycled_block, max_confidence);
							    }
							}
						    }
						}
					    }
					    iteration_state_13 = dictionary_contents.do_dictionary_contents_next(iteration_state_13);
					}
				    }
				    dictionary_contents.do_dictionary_contents_finalize(iteration_state_13);
				}
			    }
			    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
			}
		    }
		    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		}
		return set.set_element_list(precise_blocks);
	    }
	}
    }

    public static SubLObject rbp_unify_blocks_to_common_specpreds(final SubLObject blocks) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == list_utilities.lengthG(blocks, ONE_INTEGER, UNPROVIDED)) {
	    return blocks;
	}
	final SubLObject blocks_by_codes = dictionary.new_dictionary(EQUAL, UNPROVIDED);
	final SubLObject precise_blocks = set_utilities.construct_set_from_list(blocks, UNPROVIDED, UNPROVIDED);
	SubLObject cdolist_list_var = blocks;
	SubLObject this_block = NIL;
	this_block = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(nc_block_denot(this_block))) {
		final SubLObject this_code = list(nc_block_head_string_pred(this_block), cycl_utilities.formula_arg0(nc_block_denot(this_block)), nc_block_filters(this_block));
		dictionary_utilities.dictionary_push(blocks_by_codes, this_code, this_block);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    this_block = cdolist_list_var.first();
	}
	SubLObject iteration_state;
	for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(blocks_by_codes)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
	    thread.resetMultipleValues();
	    final SubLObject this_code2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
	    final SubLObject these_blocks = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    final SubLObject subcolfunc = second(this_code2);
	    final SubLObject blocks_by_args = dictionary.new_dictionary(EQUAL, UNPROVIDED);
	    final SubLObject validity_check = (NIL != isa.isa_in_any_mtP(subcolfunc, $const133$SubcollectionRelationFunction_Typ)) ? $sym134$NPP_GENL_ : $sym135$NPP_ISA_;
	    SubLObject cdolist_list_var2 = these_blocks;
	    SubLObject this_block2 = NIL;
	    this_block2 = cdolist_list_var2.first();
	    while (NIL != cdolist_list_var2) {
		final SubLObject denot = nc_block_denot(this_block2);
		final SubLObject key = list(parsing_utilities.subcollection_function_naut_from_arg(denot), parsing_utilities.subcollection_function_naut_to_arg(denot));
		dictionary_utilities.dictionary_push(blocks_by_args, key, this_block2);
		cdolist_list_var2 = cdolist_list_var2.rest();
		this_block2 = cdolist_list_var2.first();
	    }
	    SubLObject iteration_state_$13;
	    for (iteration_state_$13 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(blocks_by_args)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$13); iteration_state_$13 = dictionary_contents.do_dictionary_contents_next(
		    iteration_state_$13)) {
		thread.resetMultipleValues();
		final SubLObject these_args = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$13);
		final SubLObject these_blocks_by_args = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != list_utilities.lengthG(these_blocks_by_args, ONE_INTEGER, UNPROVIDED)) {
		    SubLObject cached_preds = NIL;
		    SubLObject precise_preds = NIL;
		    final SubLObject mt = rbp_domain_mt();
		    cached_preds = list_utilities.mapcar_unique(SUBCOLLECTION_FUNCTION_NAUT_PRED, Mapping.mapcar(NC_BLOCK_DENOT, these_blocks_by_args), UNPROVIDED);
		    if (NIL != list_utilities.lengthG(cached_preds, ONE_INTEGER, UNPROVIDED)) {
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
			    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			    final SubLObject pred_var = $$relationAllExists;
			    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(these_args.first(), TWO_INTEGER, pred_var)) {
				final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(these_args.first(), TWO_INTEGER, pred_var);
				SubLObject done_var = NIL;
				final SubLObject token_var = NIL;
				while (NIL == done_var) {
				    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
				    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
				    if (NIL != valid) {
					SubLObject final_index_iterator = NIL;
					try {
					    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
					    SubLObject done_var_$14 = NIL;
					    final SubLObject token_var_$15 = NIL;
					    while (NIL == done_var_$14) {
						final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
						final SubLObject valid_$16 = makeBoolean(!token_var_$15.eql(ass));
						if (NIL != valid_$16) {
						    final SubLObject gaf_pred = cycl_utilities.formula_arg1(ass, UNPROVIDED);
						    if ((NIL == subl_promotions.memberP(gaf_pred, cached_preds, UNPROVIDED, UNPROVIDED)) && (NIL != funcall(validity_check, second(these_args), cycl_utilities.formula_arg3(ass, UNPROVIDED), mt))) {
							SubLObject badP = NIL;
							if (NIL == badP) {
							    SubLObject csome_list_var = cached_preds;
							    SubLObject genl = NIL;
							    genl = csome_list_var.first();
							    while ((NIL == badP) && (NIL != csome_list_var)) {
								if (NIL == genl_predicates.genl_predicateP(gaf_pred, genl, UNPROVIDED, UNPROVIDED)) {
								    badP = T;
								}
								csome_list_var = csome_list_var.rest();
								genl = csome_list_var.first();
							    }
							}
							if (NIL == badP) {
							    precise_preds = cons(gaf_pred, precise_preds);
							}
						    }
						}
						done_var_$14 = makeBoolean(NIL == valid_$16);
					    }
					} finally {
					    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
					    try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						if (NIL != final_index_iterator) {
						    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
						}
						restoreValuesFromVector(_values);
					    } finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
					    }
					}
				    }
				    done_var = makeBoolean(NIL == valid);
				}
			    }
			} finally {
			    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
			if (NIL != precise_preds) {
			    SubLObject recycled_block = NIL;
			    SubLObject max_confidence = NIL;
			    SubLObject cdolist_list_var3 = these_blocks_by_args;
			    SubLObject block = NIL;
			    block = cdolist_list_var3.first();
			    while (NIL != cdolist_list_var3) {
				if (NIL == precise_preds) {
				    max_confidence = max(nc_block_confidence(block), max_confidence);
				    set.set_remove(block, precise_blocks);
				} else {
				    final SubLObject precise_pred = precise_preds.first();
				    if ((NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread)) || (NIL != member(nc_block_rule(block), rbp_traced_rules(), UNPROVIDED, UNPROVIDED))) {
					Errors.warn($str139$Strengthening__S_to_use__S, nc_block_denot(block), precise_pred);
				    }
				    _csetf_nc_block_denot(block, replace_formula_arg(TWO_INTEGER, precise_pred, nc_block_denot(block)));
				    recycled_block = block;
				    max_confidence = nc_block_confidence(block);
				    precise_preds = precise_preds.rest();
				}
				cdolist_list_var3 = cdolist_list_var3.rest();
				block = cdolist_list_var3.first();
			    }
			    _csetf_nc_block_confidence(recycled_block, max_confidence);
			}
		    }
		}
	    }
	    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$13);
	}
	dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	return set.set_element_list(precise_blocks);
    }

    public static final SubLObject rbp_unify_rewrite_of_blocks_alt(SubLObject blocks) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject denots = list_utilities.mapcar_unique(NC_BLOCK_DENOT, blocks, EQUAL);
		SubLObject block_set = set_utilities.construct_set_from_list(blocks, UNPROVIDED, UNPROVIDED);
		SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(rbp_domain_mt());
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		    try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			{
			    SubLObject cdolist_list_var = blocks;
			    SubLObject this_block = NIL;
			    for (this_block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), this_block = cdolist_list_var.first()) {
				{
				    SubLObject removedP = NIL;
				    SubLObject core_fort = NIL;
				    SubLObject pred_var = $$rewriteOf;
				    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(narts_high.nart_substitute(nc_block_denot(this_block)), TWO_INTEGER, pred_var)) {
					{
					    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(narts_high.nart_substitute(nc_block_denot(this_block)), TWO_INTEGER, pred_var);
					    SubLObject done_var = removedP;
					    SubLObject token_var = NIL;
					    while (NIL == done_var) {
						{
						    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
						    SubLObject valid = makeBoolean(token_var != final_index_spec);
						    if (NIL != valid) {
							{
							    SubLObject final_index_iterator = NIL;
							    try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
								{
								    SubLObject done_var_18 = removedP;
								    SubLObject token_var_19 = NIL;
								    while (NIL == done_var_18) {
									{
									    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_19);
									    SubLObject valid_20 = makeBoolean(token_var_19 != assertion);
									    if (NIL != valid_20) {
										core_fort = assertions_high.gaf_arg(assertion, ONE_INTEGER);
										if (NIL != subl_promotions.memberP(core_fort, denots, EQUAL, UNPROVIDED)) {
										    set.set_remove(this_block, block_set);
										    removedP = T;
										}
									    }
									    done_var_18 = makeBoolean((NIL == valid_20) || (NIL != removedP));
									}
								    }
								}
							    } finally {
								{
								    SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
								    try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									if (NIL != final_index_iterator) {
									    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
								    } finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
								    }
								}
							    }
							}
						    }
						    done_var = makeBoolean((NIL == valid) || (NIL != removedP));
						}
					    }
					}
				    }
				}
			    }
			}
		    } finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		    }
		}
		return set.set_element_list(block_set);
	    }
	}
    }

    public static SubLObject rbp_unify_rewrite_of_blocks(final SubLObject blocks) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject denots = list_utilities.mapcar_unique(NC_BLOCK_DENOT, blocks, EQUAL);
	final SubLObject block_set = set_utilities.construct_set_from_list(blocks, UNPROVIDED, UNPROVIDED);
	final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(rbp_domain_mt());
	final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
	final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
	try {
	    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
	    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
	    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
	    SubLObject cdolist_list_var = blocks;
	    SubLObject this_block = NIL;
	    this_block = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject removedP = NIL;
		SubLObject core_fort = NIL;
		final SubLObject pred_var = $$rewriteOf;
		if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(narts_high.nart_substitute(nc_block_denot(this_block)), TWO_INTEGER, pred_var)) {
		    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(narts_high.nart_substitute(nc_block_denot(this_block)), TWO_INTEGER, pred_var);
		    SubLObject done_var = removedP;
		    final SubLObject token_var = NIL;
		    while (NIL == done_var) {
			final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
			final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
			if (NIL != valid) {
			    SubLObject final_index_iterator = NIL;
			    try {
				final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
				SubLObject done_var_$18 = removedP;
				final SubLObject token_var_$19 = NIL;
				while (NIL == done_var_$18) {
				    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
				    final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(assertion));
				    if (NIL != valid_$20) {
					core_fort = assertions_high.gaf_arg(assertion, ONE_INTEGER);
					if (NIL != subl_promotions.memberP(core_fort, denots, EQUAL, UNPROVIDED)) {
					    set.set_remove(this_block, block_set);
					    removedP = T;
					}
				    }
				    done_var_$18 = makeBoolean((NIL == valid_$20) || (NIL != removedP));
				}
			    } finally {
				final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
				    $is_thread_performing_cleanupP$.bind(T, thread);
				    final SubLObject _values = getValuesAsVector();
				    if (NIL != final_index_iterator) {
					kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
				    }
				    restoreValuesFromVector(_values);
				} finally {
				    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
				}
			    }
			}
			done_var = makeBoolean((NIL == valid) || (NIL != removedP));
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		this_block = cdolist_list_var.first();
	    }
	} finally {
	    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
	    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
	    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
	}
	return set.set_element_list(block_set);
    }

    /**
     *
     *
     * @param LISTP
     * 		of nc-blocks
     * @return LISTP of nc-blocks which is a (typically proper) sublist of those nc-blocks, with
    as many CityNamedFn blocks coerced into #$CityInPlace individuals as possible
    by using #$rewriteOf links (explicit and inferred)
     */
    @LispMethod(comment = "@param LISTP\r\n\t\tof nc-blocks\r\n@return LISTP of nc-blocks which is a (typically proper) sublist of those nc-blocks, with\r\nas many CityNamedFn blocks coerced into #$CityInPlace individuals as possible\r\nby using #$rewriteOf links (explicit and inferred)")
    public static final SubLObject rbp_unify_city_named_fn_blocks_alt(SubLObject blocks) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject denots = list_utilities.mapcar_unique(NC_BLOCK_DENOT, blocks, EQUAL);
		SubLObject block_set = set_utilities.construct_set_from_list(blocks, UNPROVIDED, UNPROVIDED);
		SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(rbp_domain_mt());
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		    try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			{
			    SubLObject cdolist_list_var = blocks;
			    SubLObject this_block = NIL;
			    for (this_block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), this_block = cdolist_list_var.first()) {
				{
				    SubLObject expanded = narts_high.nart_expand(nc_block_denot(this_block));
				    if (NIL != formula_arityE(expanded, TWO_INTEGER, UNPROVIDED)) {
					{
					    SubLObject datum = expanded;
					    SubLObject current = datum;
					    SubLObject denot_arg0 = NIL;
					    SubLObject denot_arg1 = NIL;
					    SubLObject denot_arg2 = NIL;
					    destructuring_bind_must_consp(current, datum, $list_alt146);
					    denot_arg0 = current.first();
					    current = current.rest();
					    destructuring_bind_must_consp(current, datum, $list_alt146);
					    denot_arg1 = current.first();
					    current = current.rest();
					    destructuring_bind_must_consp(current, datum, $list_alt146);
					    denot_arg2 = current.first();
					    current = current.rest();
					    if (NIL == current) {
						if (denot_arg0.eql($$CityNamedFn)) {
						    if (NIL != isa.isaP(denot_arg2, $$State_Geopolitical, UNPROVIDED, UNPROVIDED)) {
							{
							    SubLObject removedP = NIL;
							    if (NIL == removedP) {
								{
								    SubLObject csome_list_var = denots;
								    SubLObject denot_from_set = NIL;
								    for (denot_from_set = csome_list_var.first(); !((NIL != removedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), denot_from_set = csome_list_var.first()) {
									if (((NIL != constant_p(denot_from_set)) && (NIL != rbp_wff.npp_search_gafs_gp($$cityInState, denot_from_set, ONE_INTEGER, denot_arg2, TWO_INTEGER, EQL, rbp_domain_mt())))
										&& (NIL != rbp_wff.npp_search_gafs_gp($$nameString, denot_from_set, ONE_INTEGER, denot_arg1, TWO_INTEGER, $sym151$STRING_, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread)))) {
									    set.set_remove(this_block, block_set);
									    removedP = T;
									}
								    }
								}
							    }
							}
						    } else {
							if (NIL != isa.isaP(denot_arg2, $$Country, UNPROVIDED, UNPROVIDED)) {
							    {
								SubLObject removedP = NIL;
								if (NIL == removedP) {
								    {
									SubLObject csome_list_var = denots;
									SubLObject denot_from_set = NIL;
									for (denot_from_set = csome_list_var.first(); !((NIL != removedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), denot_from_set = csome_list_var.first()) {
									    if (((NIL != constant_p(denot_from_set)) && (NIL != rbp_wff.npp_search_gafs_gp($$countryOfCity, denot_from_set, TWO_INTEGER, denot_arg2, ONE_INTEGER, EQL, rbp_domain_mt())))
										    && (NIL != rbp_wff.npp_search_gafs_gp($$nameString, denot_from_set, ONE_INTEGER, denot_arg1, TWO_INTEGER, $sym151$STRING_, rbp_domain_mt()))) {
										set.set_remove(this_block, block_set);
										removedP = T;
									    }
									}
								    }
								}
							    }
							}
						    }
						}
					    } else {
						cdestructuring_bind_error(datum, $list_alt146);
					    }
					}
				    }
				}
			    }
			}
		    } finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		    }
		}
		return set.set_element_list(block_set);
	    }
	}
    }

    /**
     *
     *
     * @param LISTP
     * 		of nc-blocks
     * @return LISTP of nc-blocks which is a (typically proper) sublist of those nc-blocks, with
    as many CityNamedFn blocks coerced into #$CityInPlace individuals as possible
    by using #$rewriteOf links (explicit and inferred)
     */
    @LispMethod(comment = "@param LISTP\r\n\t\tof nc-blocks\r\n@return LISTP of nc-blocks which is a (typically proper) sublist of those nc-blocks, with\r\nas many CityNamedFn blocks coerced into #$CityInPlace individuals as possible\r\nby using #$rewriteOf links (explicit and inferred)")
    public static SubLObject rbp_unify_city_named_fn_blocks(final SubLObject blocks) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject denots = list_utilities.mapcar_unique(NC_BLOCK_DENOT, blocks, EQUAL);
	final SubLObject block_set = set_utilities.construct_set_from_list(blocks, UNPROVIDED, UNPROVIDED);
	final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(rbp_domain_mt());
	final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
	final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
	try {
	    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
	    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
	    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
	    SubLObject cdolist_list_var = blocks;
	    SubLObject this_block = NIL;
	    this_block = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		final SubLObject expanded = narts_high.nart_expand(nc_block_denot(this_block));
		if (NIL != formula_arityE(expanded, TWO_INTEGER, UNPROVIDED)) {
		    SubLObject current;
		    final SubLObject datum = current = expanded;
		    SubLObject denot_arg0 = NIL;
		    SubLObject denot_arg2 = NIL;
		    SubLObject denot_arg3 = NIL;
		    destructuring_bind_must_consp(current, datum, $list141);
		    denot_arg0 = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list141);
		    denot_arg2 = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list141);
		    denot_arg3 = current.first();
		    current = current.rest();
		    if (NIL == current) {
			if (denot_arg0.eql($$CityNamedFn)) {
			    if (NIL != isa.isaP(denot_arg3, $$State_Geopolitical, UNPROVIDED, UNPROVIDED)) {
				SubLObject removedP = NIL;
				if (NIL == removedP) {
				    SubLObject csome_list_var = denots;
				    SubLObject denot_from_set = NIL;
				    denot_from_set = csome_list_var.first();
				    while ((NIL == removedP) && (NIL != csome_list_var)) {
					if (((NIL != constant_p(denot_from_set)) && (NIL != rbp_wff.npp_search_gafs_gp($$cityInState, denot_from_set, ONE_INTEGER, denot_arg3, TWO_INTEGER, EQL, rbp_domain_mt())))
						&& (NIL != rbp_wff.npp_search_gafs_gp($$nameString, denot_from_set, ONE_INTEGER, denot_arg2, TWO_INTEGER, $sym146$STRING_, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread)))) {
					    set.set_remove(this_block, block_set);
					    removedP = T;
					}
					csome_list_var = csome_list_var.rest();
					denot_from_set = csome_list_var.first();
				    }
				}
			    } else if (NIL != isa.isaP(denot_arg3, $$Country, UNPROVIDED, UNPROVIDED)) {
				SubLObject removedP = NIL;
				if (NIL == removedP) {
				    SubLObject csome_list_var = denots;
				    SubLObject denot_from_set = NIL;
				    denot_from_set = csome_list_var.first();
				    while ((NIL == removedP) && (NIL != csome_list_var)) {
					if (((NIL != constant_p(denot_from_set)) && (NIL != rbp_wff.npp_search_gafs_gp($$countryOfCity, denot_from_set, TWO_INTEGER, denot_arg3, ONE_INTEGER, EQL, rbp_domain_mt())))
						&& (NIL != rbp_wff.npp_search_gafs_gp($$nameString, denot_from_set, ONE_INTEGER, denot_arg2, TWO_INTEGER, $sym146$STRING_, rbp_domain_mt()))) {
					    set.set_remove(this_block, block_set);
					    removedP = T;
					}
					csome_list_var = csome_list_var.rest();
					denot_from_set = csome_list_var.first();
				    }
				}
			    }

			}
		    } else {
			cdestructuring_bind_error(datum, $list141);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		this_block = cdolist_list_var.first();
	    }
	} finally {
	    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
	    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
	    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
	}
	return set.set_element_list(block_set);
    }

    public static final SubLObject rbp_nominal_blockP_alt(SubLObject block) {
	return makeBoolean((((NIL != rbp_wff.npp_genlP(nc_block_head_pos(block), $$Noun, UNPROVIDED)) || (NIL != rbp_wff.npp_genlP(nc_block_head_pos(block), $$NounPhrase, UNPROVIDED))) || (nc_block_head_string_pred(block) == $ORIGINAL_STRING))
		|| (NIL != rbp_wff.npp_genl_predP(nc_block_head_string_pred(block), $$gerund)));
    }

    public static SubLObject rbp_nominal_blockP(final SubLObject block) {
	return makeBoolean((((NIL != rbp_wff.npp_genlP(nc_block_head_pos(block), $$Noun, UNPROVIDED)) || (NIL != rbp_wff.npp_genlP(nc_block_head_pos(block), $$NounPhrase, UNPROVIDED))) || (nc_block_head_string_pred(block) == $ORIGINAL_STRING))
		|| (NIL != rbp_wff.npp_genl_predP(nc_block_head_string_pred(block), $$gerund)));
    }

    /**
     *
     *
     * @param list-of-blocks;
    LIST
     * 		
     * @return LIST
    Takes a list of noun-compound blocks already established to be
    complete parses of some input string and returns all the denotations
    of such parses. The actual format of the output is dependent on the
    value of the global @see *nominal-interpretations-only*.
     */
    @LispMethod(comment = "@param list-of-blocks;\nLIST\r\n\t\t\r\n@return LIST\r\nTakes a list of noun-compound blocks already established to be\r\ncomplete parses of some input string and returns all the denotations\r\nof such parses. The actual format of the output is dependent on the\r\nvalue of the global @see *nominal-interpretations-only*.")
    public static final SubLObject display_complete_parses_alt(SubLObject list_of_blocks) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject good_stack = NIL;
		SubLObject bad_stack = NIL;
		SubLObject full_confidence = list_utilities.safe_max(Mapping.mapcar(NC_BLOCK_CONFIDENCE, list_of_blocks), UNPROVIDED);
		SubLObject rules_to_details = (NIL != $rbp_shadow_rulesP$.getDynamicValue(thread)) ? ((SubLObject) (dictionary.new_dictionary(EQUAL, UNPROVIDED))) : NIL;
		SubLObject cdolist_list_var = list_of_blocks;
		SubLObject block = NIL;
		for (block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), block = cdolist_list_var.first()) {
		    {
			SubLObject pred = nc_block_head_string_pred(block);
			SubLObject denot = nc_block_denot(block);
			SubLObject filters = nc_block_filters(block);
			SubLObject rule = nc_block_rule(block);
			SubLObject details = np_parser.make_npp_parse(denot, pred);
			SubLObject non_confidentP = makeBoolean((NIL != filters) && full_confidence.numG(nc_block_confidence(block)));
			if (NIL != non_confidentP) {
			    details = list(details, filters);
			}
			if (NIL != non_confidentP) {
			    {
				SubLObject item_var = (NIL != $rbp_return_confidenceP$.getDynamicValue(thread)) ? ((SubLObject) (append(details, list(nc_block_confidence(block))))) : details;
				if (NIL == member(item_var, bad_stack, EQUAL, symbol_function(IDENTITY))) {
				    bad_stack = cons(item_var, bad_stack);
				}
			    }
			} else {
			    if (NIL != $rbp_return_confidenceP$.getDynamicValue(thread)) {
				{
				    SubLObject item_var = append(details, list(nc_block_confidence(block)));
				    if (NIL == member(item_var, good_stack, $sym157$RBP_PARSE_AND_CONFIDENCE_, symbol_function(IDENTITY))) {
					good_stack = cons(item_var, good_stack);
				    }
				}
			    } else {
				{
				    SubLObject item_var = details;
				    if (NIL == member(item_var, good_stack, $sym158$NPP_PARSE_, symbol_function(IDENTITY))) {
					good_stack = cons(item_var, good_stack);
				    }
				}
			    }
			}
			if (NIL != $rbp_shadow_rulesP$.getDynamicValue(thread)) {
			    dictionary_utilities.dictionary_push(rules_to_details, nc_block_rule(block), details);
			}
		    }
		}
		if (NIL != $rbp_shadow_rulesP$.getDynamicValue(thread)) {
		    $rbp_rules_to_parses_shadow$.setDynamicValue(dictionary_utilities.copy_dictionary(rules_to_details), thread);
		}
		return values(nreverse(good_stack), nreverse(bad_stack));
	    }
	}
    }

    /**
     *
     *
     * @param list-of-blocks;
    LIST
     * 		
     * @return LIST
    Takes a list of noun-compound blocks already established to be
    complete parses of some input string and returns all the denotations
    of such parses. The actual format of the output is dependent on the
    value of the global @see *nominal-interpretations-only*.
     */
    @LispMethod(comment = "@param list-of-blocks;\nLIST\r\n\t\t\r\n@return LIST\r\nTakes a list of noun-compound blocks already established to be\r\ncomplete parses of some input string and returns all the denotations\r\nof such parses. The actual format of the output is dependent on the\r\nvalue of the global @see *nominal-interpretations-only*.")
    public static SubLObject display_complete_parses(final SubLObject list_of_blocks) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject good_stack = NIL;
	SubLObject bad_stack = NIL;
	final SubLObject full_confidence = list_utilities.safe_max(Mapping.mapcar(NC_BLOCK_CONFIDENCE, list_of_blocks), UNPROVIDED);
	final SubLObject rules_to_details = (NIL != $rbp_shadow_rulesP$.getDynamicValue(thread)) ? dictionary.new_dictionary(EQUAL, UNPROVIDED) : NIL;
	SubLObject cdolist_list_var = list_of_blocks;
	SubLObject block = NIL;
	block = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject pred = nc_block_head_string_pred(block);
	    final SubLObject denot = nc_block_denot(block);
	    final SubLObject filters = nc_block_filters(block);
	    final SubLObject rule = nc_block_rule(block);
	    SubLObject details = np_parser.make_npp_parse(denot, pred);
	    final SubLObject non_confidentP = makeBoolean((NIL != filters) && full_confidence.numG(nc_block_confidence(block)));
	    if (NIL != non_confidentP) {
		details = list(details, filters);
	    }
	    if (NIL != non_confidentP) {
		final SubLObject item_var = (NIL != $rbp_return_confidenceP$.getDynamicValue(thread)) ? append(details, list(nc_block_confidence(block))) : details;
		if (NIL == member(item_var, bad_stack, EQUAL, symbol_function(IDENTITY))) {
		    bad_stack = cons(item_var, bad_stack);
		}
	    } else if (NIL != $rbp_return_confidenceP$.getDynamicValue(thread)) {
		final SubLObject item_var = append(details, list(nc_block_confidence(block)));
		if (NIL == member(item_var, good_stack, $sym152$RBP_PARSE_AND_CONFIDENCE_, symbol_function(IDENTITY))) {
		    good_stack = cons(item_var, good_stack);
		}
	    } else {
		final SubLObject item_var = details;
		if (NIL == member(item_var, good_stack, $sym153$NPP_PARSE_, symbol_function(IDENTITY))) {
		    good_stack = cons(item_var, good_stack);
		}
	    }

	    if (NIL != $rbp_shadow_rulesP$.getDynamicValue(thread)) {
		dictionary_utilities.dictionary_push(rules_to_details, nc_block_rule(block), details);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    block = cdolist_list_var.first();
	}
	if (NIL != $rbp_shadow_rulesP$.getDynamicValue(thread)) {
	    $rbp_rules_to_parses_shadow$.setDynamicValue(dictionary_utilities.copy_dictionary(rules_to_details), thread);
	}
	return values(nreverse(good_stack), nreverse(bad_stack));
    }

    /**
     *
     *
     * @param REQUIRED-RBP-RULES;
     * 		:NONE or LISTP of rule ids *all of which* must be used
     * 		in a successful parse.
     */
    @LispMethod(comment = "@param REQUIRED-RBP-RULES;\r\n\t\t:NONE or LISTP of rule ids *all of which* must be used\r\n\t\tin a successful parse.")
    public static final SubLObject nc_block_uses_required_rules_p_alt(SubLObject block, SubLObject required_rbp_rules, SubLObject block_hash) {
	if (required_rbp_rules.isList()) {
	    {
		SubLObject failP = NIL;
		if (NIL == failP) {
		    {
			SubLObject csome_list_var = required_rbp_rules;
			SubLObject required_rbp_rule = NIL;
			for (required_rbp_rule = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), required_rbp_rule = csome_list_var.first()) {
			    if (NIL == nc_block_uses_required_rule_p(block, required_rbp_rule, block_hash)) {
				failP = T;
			    }
			}
		    }
		}
		return makeBoolean(NIL == failP);
	    }
	} else {
	    return T;
	}
    }

    /**
     *
     *
     * @param REQUIRED-RBP-RULES;
     * 		:NONE or LISTP of rule ids *all of which* must be used
     * 		in a successful parse.
     */
    @LispMethod(comment = "@param REQUIRED-RBP-RULES;\r\n\t\t:NONE or LISTP of rule ids *all of which* must be used\r\n\t\tin a successful parse.")
    public static SubLObject nc_block_uses_required_rules_p(final SubLObject block, final SubLObject required_rbp_rules, final SubLObject block_hash) {
	if (required_rbp_rules.isList()) {
	    SubLObject failP = NIL;
	    if (NIL == failP) {
		SubLObject csome_list_var = required_rbp_rules;
		SubLObject required_rbp_rule = NIL;
		required_rbp_rule = csome_list_var.first();
		while ((NIL == failP) && (NIL != csome_list_var)) {
		    if (NIL == nc_block_uses_required_rule_p(block, required_rbp_rule, block_hash)) {
			failP = T;
		    }
		    csome_list_var = csome_list_var.rest();
		    required_rbp_rule = csome_list_var.first();
		}
	    }
	    return makeBoolean(NIL == failP);
	}
	return T;
    }

    public static final SubLObject nc_block_uses_required_rule_p_alt(SubLObject block, SubLObject required_rbp_rule, SubLObject block_hash) {
	if (nc_block_rule(block).eql(required_rbp_rule)) {
	    return T;
	} else {
	    if (NIL == nc_block_sub_tree(block)) {
		return NIL;
	    } else {
		if (NIL != nc_block_uses_required_rule_p(nc_block_mod_block(block, block_hash), required_rbp_rule, block_hash)) {
		    return T;
		} else {
		    if (NIL != nc_block_uses_required_rule_p(nc_block_head_block(block, block_hash), required_rbp_rule, block_hash)) {
			return T;
		    } else {
			return NIL;
		    }
		}
	    }
	}
    }

    public static SubLObject nc_block_uses_required_rule_p(final SubLObject block, final SubLObject required_rbp_rule, final SubLObject block_hash) {
	if (nc_block_rule(block).eql(required_rbp_rule)) {
	    return T;
	}
	if (NIL == nc_block_sub_tree(block)) {
	    return NIL;
	}
	if (NIL != nc_block_uses_required_rule_p(nc_block_mod_block(block, block_hash), required_rbp_rule, block_hash)) {
	    return T;
	}
	if (NIL != nc_block_uses_required_rule_p(nc_block_head_block(block, block_hash), required_rbp_rule, block_hash)) {
	    return T;
	}
	return NIL;
    }

    public static final SubLObject rbp_parse_and_confidenceP_alt(SubLObject obj) {
	return makeBoolean(((obj.isCons() && (NIL != list_utilities.lengthE(obj, THREE_INTEGER, UNPROVIDED))) && (NIL != lexicon_accessors.speech_part_predP(second(obj), UNPROVIDED))) && ((NIL == third(obj)) || third(obj).isNumber()));
    }

    public static SubLObject rbp_parse_and_confidenceP(final SubLObject obj) {
	return makeBoolean(((obj.isCons() && (NIL != list_utilities.lengthE(obj, THREE_INTEGER, UNPROVIDED))) && (NIL != lexicon_accessors.speech_part_predP(second(obj), UNPROVIDED))) && ((NIL == third(obj)) || third(obj).isNumber()));
    }

    public static final SubLObject rbp_parse_and_confidenceE_alt(SubLObject parse1, SubLObject parse2) {
	SubLTrampolineFile.checkType(parse1, $sym159$RBP_PARSE_AND_CONFIDENCE_);
	SubLTrampolineFile.checkType(parse2, $sym159$RBP_PARSE_AND_CONFIDENCE_);
	return makeBoolean((parse1.first().equalp(parse2.first()) && second(parse1).equal(second(parse2))) && third(parse1).eql(third(parse2)));
    }

    public static SubLObject rbp_parse_and_confidenceE(final SubLObject parse1, final SubLObject parse2) {
	assert NIL != rbp_parse_and_confidenceP(parse1) : "! noun_compound_parser.rbp_parse_and_confidenceP(parse1) " + ("noun_compound_parser.rbp_parse_and_confidenceP(parse1) " + "CommonSymbols.NIL != noun_compound_parser.rbp_parse_and_confidenceP(parse1) ") + parse1;
	assert NIL != rbp_parse_and_confidenceP(parse2) : "! noun_compound_parser.rbp_parse_and_confidenceP(parse2) " + ("noun_compound_parser.rbp_parse_and_confidenceP(parse2) " + "CommonSymbols.NIL != noun_compound_parser.rbp_parse_and_confidenceP(parse2) ") + parse2;
	return makeBoolean((parse1.first().equalp(parse2.first()) && second(parse1).equal(second(parse2))) && third(parse1).eql(third(parse2)));
    }

    /**
     *
     *
     * @return RBP-CHART-P, initialized to parse STRINGS
     */
    @LispMethod(comment = "@return RBP-CHART-P, initialized to parse STRINGS")
    public static final SubLObject ncp_chart_init_alt(SubLObject strings, SubLObject filterP) {
	if (strings == UNPROVIDED) {
	    strings = $rbp_input_strings$.getDynamicValue();
	}
	if (filterP == UNPROVIDED) {
	    filterP = $rbp_chart_filterP$.getGlobalValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject value_type = (NIL != parsing_vars.$rbp_include_word_unitsP$.getDynamicValue(thread)) ? ((SubLObject) ($QUADS)) : $TRIPLES;
		SubLObject filter_no_denot_tokensP = makeBoolean(NIL == parsing_vars.$rbp_include_word_unitsP$.getDynamicValue(thread));
		SubLObject raw_tokens = np_parser.npp_tokenize_strings(strings, value_type, filter_no_denot_tokensP);
		SubLObject verbless_tokens = rbp_filter_verbs(raw_tokens);
		SubLObject input_length = length(strings);
		SubLObject tokens = (NIL != filterP) ? ((SubLObject) (rbp_remove_subsumed_tokens(verbless_tokens, input_length))) : verbless_tokens;
		SubLObject chart = new_ncp_chart(input_length);
		return ncp_chart_init_int(chart, tokens);
	    }
	}
    }

    /**
     *
     *
     * @return RBP-CHART-P, initialized to parse STRINGS
     */
    @LispMethod(comment = "@return RBP-CHART-P, initialized to parse STRINGS")
    public static SubLObject ncp_chart_init(SubLObject strings, SubLObject filterP) {
	if (strings == UNPROVIDED) {
	    strings = $rbp_input_strings$.getDynamicValue();
	}
	if (filterP == UNPROVIDED) {
	    filterP = $rbp_chart_filterP$.getGlobalValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject value_type = (NIL != parsing_vars.$rbp_include_word_unitsP$.getDynamicValue(thread)) ? $QUADS : $TRIPLES;
	final SubLObject filter_no_denot_tokensP = makeBoolean(NIL == parsing_vars.$rbp_include_word_unitsP$.getDynamicValue(thread));
	final SubLObject raw_tokens = np_parser.npp_tokenize_strings(strings, value_type, filter_no_denot_tokensP);
	final SubLObject verbless_tokens = rbp_filter_verbs(raw_tokens);
	final SubLObject input_length = length(strings);
	final SubLObject tokens = (NIL != filterP) ? rbp_remove_subsumed_tokens(verbless_tokens, input_length) : verbless_tokens;
	final SubLObject chart = new_ncp_chart(input_length);
	return ncp_chart_init_int(chart, tokens);
    }

    public static final SubLObject ncp_chart_init_from_string_tokens_alt(SubLObject string_tokens) {
	{
	    SubLObject input_length = length(string_tokens);
	    SubLObject chart = new_ncp_chart(input_length);
	    SubLObject interval_tokens = NIL;
	    SubLObject i = NIL;
	    for (i = ZERO_INTEGER; i.numL(input_length); i = add(i, ONE_INTEGER)) {
		{
		    SubLObject s_token = nth(i, string_tokens);
		    interval_tokens = cons(standard_tokenization.new_interval_token(i, number_utilities.f_1X(i), s_token), interval_tokens);
		}
	    }
	    return ncp_chart_init_int(chart, interval_tokens);
	}
    }

    public static SubLObject ncp_chart_init_from_string_tokens(final SubLObject string_tokens) {
	final SubLObject input_length = length(string_tokens);
	final SubLObject chart = new_ncp_chart(input_length);
	SubLObject interval_tokens = NIL;
	SubLObject i;
	SubLObject s_token;
	for (i = NIL, i = ZERO_INTEGER; i.numL(input_length); i = add(i, ONE_INTEGER)) {
	    s_token = nth(i, string_tokens);
	    interval_tokens = cons(standard_tokenization.new_interval_token(i, number_utilities.f_1X(i), s_token), interval_tokens);
	}
	return ncp_chart_init_int(chart, interval_tokens);
    }

    /**
     *
     *
     * @return RBP-CHART-P; An empty chart for an input of length INPUT-LENGTH.
     */
    @LispMethod(comment = "@return RBP-CHART-P; An empty chart for an input of length INPUT-LENGTH.")
    public static final SubLObject new_ncp_chart_alt(SubLObject input_length) {
	{
	    SubLObject edges = make_hash_table($int$256, symbol_function(EQL), UNPROVIDED);
	    SubLObject block_merge_fn = COMBINE_NOUN_COMPOUND_BLOCKS;
	    SubLObject block_hash = make_hash_table($int$256, UNPROVIDED, UNPROVIDED);
	    SubLObject done_spans = make_hash_table($int$256, symbol_function(EQL), UNPROVIDED);
	    return rbp_chart_parser.new_rbp_chart(input_length, edges, done_spans, block_merge_fn, block_hash);
	}
    }

    /**
     *
     *
     * @return RBP-CHART-P; An empty chart for an input of length INPUT-LENGTH.
     */
    @LispMethod(comment = "@return RBP-CHART-P; An empty chart for an input of length INPUT-LENGTH.")
    public static SubLObject new_ncp_chart(final SubLObject input_length) {
	final SubLObject edges = make_hash_table($int$256, symbol_function(EQL), UNPROVIDED);
	final SubLObject block_merge_fn = COMBINE_NOUN_COMPOUND_BLOCKS;
	final SubLObject block_hash = make_hash_table($int$256, UNPROVIDED, UNPROVIDED);
	final SubLObject done_spans = make_hash_table($int$256, symbol_function(EQL), UNPROVIDED);
	return rbp_chart_parser.new_rbp_chart(input_length, edges, done_spans, block_merge_fn, block_hash);
    }

    /**
     *
     *
     * @param TOKENS;
     * 		LISTP of interval tokens.
     */
    @LispMethod(comment = "@param TOKENS;\r\n\t\tLISTP of interval tokens.")
    public static final SubLObject ncp_chart_init_int_alt(SubLObject chart, SubLObject tokens) {
	{
	    SubLObject input_length = rbp_chart_parser.rbp_chart_input_length(chart);
	    SubLObject cdolist_list_var = tokens;
	    SubLObject token = NIL;
	    for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), token = cdolist_list_var.first()) {
		{
		    SubLObject cdolist_list_var_22 = token_to_blocks(token);
		    SubLObject block = NIL;
		    for (block = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest(), block = cdolist_list_var_22.first()) {
			if (!((NIL == nc_block_head(block)) || (NIL != rbp_input_spanning_blockP(block, input_length)))) {
			    rbp_chart_parser.rbp_chart_add(block, chart);
			}
		    }
		}
	    }
	}
	return chart;
    }

    /**
     *
     *
     * @param TOKENS;
     * 		LISTP of interval tokens.
     */
    @LispMethod(comment = "@param TOKENS;\r\n\t\tLISTP of interval tokens.")
    public static SubLObject ncp_chart_init_int(final SubLObject chart, final SubLObject tokens) {
	final SubLObject input_length = rbp_chart_parser.rbp_chart_input_length(chart);
	SubLObject cdolist_list_var = tokens;
	SubLObject token = NIL;
	token = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject cdolist_list_var_$22 = token_to_blocks(token);
	    SubLObject block = NIL;
	    block = cdolist_list_var_$22.first();
	    while (NIL != cdolist_list_var_$22) {
		if ((NIL != nc_block_head(block)) && (NIL == rbp_input_spanning_blockP(block, input_length))) {
		    rbp_chart_parser.rbp_chart_add(block, chart);
		}
		cdolist_list_var_$22 = cdolist_list_var_$22.rest();
		block = cdolist_list_var_$22.first();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    token = cdolist_list_var.first();
	}
	return chart;
    }

    public static final SubLObject rbp_input_spanning_blockP_alt(SubLObject block, SubLObject input_length) {
	{
	    SubLObject span = nc_block_span_index(block);
	    return makeBoolean((NIL != interval_span.interval_span_p(span)) && interval_span.interval_span_length(span).eql(input_length));
	}
    }

    public static SubLObject rbp_input_spanning_blockP(final SubLObject block, final SubLObject input_length) {
	final SubLObject span = nc_block_span_index(block);
	return makeBoolean((NIL != interval_span.interval_span_p(span)) && interval_span.interval_span_length(span).eql(input_length));
    }

    /**
     * For all tokens in TOKENS, make the POS value for #$gerunds be #$MassNoun,
     * for #$pastTense be #$Adjective, and omit any other verb forms.
     */
    @LispMethod(comment = "For all tokens in TOKENS, make the POS value for #$gerunds be #$MassNoun,\r\nfor #$pastTense be #$Adjective, and omit any other verb forms.\nFor all tokens in TOKENS, make the POS value for #$gerunds be #$MassNoun,\nfor #$pastTense be #$Adjective, and omit any other verb forms.")
    public static final SubLObject rbp_filter_verbs_alt(SubLObject tokens) {
	{
	    SubLObject cdolist_list_var = tokens;
	    SubLObject token = NIL;
	    for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), token = cdolist_list_var.first()) {
		standard_tokenization.string_token_value_set(standard_tokenization.interval_token_value(token), rbp_filter_verbs_in_tuples(standard_tokenization.string_token_value(standard_tokenization.interval_token_value(token))));
	    }
	}
	return tokens;
    }

    /**
     * For all tokens in TOKENS, make the POS value for #$gerunds be #$MassNoun,
     * for #$pastTense be #$Adjective, and omit any other verb forms.
     */
    @LispMethod(comment = "For all tokens in TOKENS, make the POS value for #$gerunds be #$MassNoun,\r\nfor #$pastTense be #$Adjective, and omit any other verb forms.\nFor all tokens in TOKENS, make the POS value for #$gerunds be #$MassNoun,\nfor #$pastTense be #$Adjective, and omit any other verb forms.")
    public static SubLObject rbp_filter_verbs(final SubLObject tokens) {
	SubLObject cdolist_list_var = tokens;
	SubLObject token = NIL;
	token = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    standard_tokenization.string_token_value_set(standard_tokenization.interval_token_value(token), rbp_filter_verbs_in_tuples(standard_tokenization.string_token_value(standard_tokenization.interval_token_value(token))));
	    cdolist_list_var = cdolist_list_var.rest();
	    token = cdolist_list_var.first();
	}
	return tokens;
    }

    /**
     * Filter out any verbal lexical items from TUPLES.
     */
    @LispMethod(comment = "Filter out any verbal lexical items from TUPLES.")
    public static final SubLObject rbp_filter_verbs_in_tuples_alt(SubLObject tuples) {
	{
	    SubLObject ans = NIL;
	    SubLObject cdolist_list_var = tuples;
	    SubLObject tuple = NIL;
	    for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tuple = cdolist_list_var.first()) {
		{
		    SubLObject datum = tuple;
		    SubLObject current = datum;
		    SubLObject denot = NIL;
		    SubLObject pos = NIL;
		    SubLObject pred = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt94);
		    denot = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt94);
		    pos = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt94);
		    pred = current.first();
		    current = current.rest();
		    {
			SubLObject wu = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
			destructuring_bind_must_listp(current, datum, $list_alt94);
			current = current.rest();
			if (NIL == current) {
			    if (NIL == lexicon_accessors.genl_posP(pos, $$Verb, UNPROVIDED)) {
				ans = cons(tuple, ans);
			    } else {
				if (pred == $$perfect) {
				    {
					SubLObject item_var = list_utilities.replace_nth(ONE_INTEGER, $$Adjective, tuple);
					if (NIL == member(item_var, ans, symbol_function(EQUALP), symbol_function(IDENTITY))) {
					    ans = cons(item_var, ans);
					}
				    }
				}
			    }
			} else {
			    cdestructuring_bind_error(datum, $list_alt94);
			}
		    }
		}
	    }
	    return ans;
	}
    }

    /**
     * Filter out any verbal lexical items from TUPLES.
     */
    @LispMethod(comment = "Filter out any verbal lexical items from TUPLES.")
    public static SubLObject rbp_filter_verbs_in_tuples(final SubLObject tuples) {
	SubLObject ans = NIL;
	SubLObject cdolist_list_var = tuples;
	SubLObject tuple = NIL;
	tuple = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject current;
	    final SubLObject datum = current = tuple;
	    SubLObject denot = NIL;
	    SubLObject pos = NIL;
	    SubLObject pred = NIL;
	    destructuring_bind_must_consp(current, datum, $list90);
	    denot = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list90);
	    pos = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list90);
	    pred = current.first();
	    current = current.rest();
	    final SubLObject wu = (current.isCons()) ? current.first() : NIL;
	    destructuring_bind_must_listp(current, datum, $list90);
	    current = current.rest();
	    if (NIL == current) {
		if (NIL == lexicon_accessors.genl_posP(pos, $$Verb, UNPROVIDED)) {
		    ans = cons(tuple, ans);
		} else if (pred.eql($$perfect)) {
		    final SubLObject item_var = list_utilities.replace_nth(ONE_INTEGER, $$Adjective, tuple);
		    if (NIL == member(item_var, ans, symbol_function(EQUALP), symbol_function(IDENTITY))) {
			ans = cons(item_var, ans);
		    }
		}

	    } else {
		cdestructuring_bind_error(datum, $list90);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    tuple = cdolist_list_var.first();
	}
	return ans;
    }

    /**
     * Remove any TOKENS whose span is properly subsumed by all other large tokens.
     */
    @LispMethod(comment = "Remove any TOKENS whose span is properly subsumed by all other large tokens.")
    public static final SubLObject rbp_remove_subsumed_tokens_alt(SubLObject tokens, SubLObject input_length) {
	{
	    SubLObject sorted = Sort.sort(tokens, $sym129$_, INTERVAL_TOKEN_LENGTH);
	    SubLObject big_spans = NIL;
	    SubLObject ans = NIL;
	    SubLObject cdolist_list_var = sorted;
	    SubLObject token = NIL;
	    for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), token = cdolist_list_var.first()) {
		{
		    SubLObject span = interval_span.get_interval_span(standard_tokenization.interval_token_start(token), standard_tokenization.interval_token_end(token));
		    SubLObject span_length = interval_span.interval_span_length(span);
		    if (NIL != rbp_span_subsumed_by_all_ofP(span, big_spans)) {
		    } else {
			if (span_length.numE(input_length) || span_length.numL(TWO_INTEGER)) {
			    ans = cons(token, ans);
			} else {
			    big_spans = cons(span, big_spans);
			    ans = cons(token, ans);
			}
		    }
		}
	    }
	    return ans;
	}
    }

    /**
     * Remove any TOKENS whose span is properly subsumed by all other large tokens.
     */
    @LispMethod(comment = "Remove any TOKENS whose span is properly subsumed by all other large tokens.")
    public static SubLObject rbp_remove_subsumed_tokens(final SubLObject tokens, final SubLObject input_length) {
	final SubLObject sorted = Sort.sort(tokens, $sym124$_, INTERVAL_TOKEN_LENGTH);
	SubLObject big_spans = NIL;
	SubLObject ans = NIL;
	SubLObject cdolist_list_var = sorted;
	SubLObject token = NIL;
	token = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject span = interval_span.get_interval_span(standard_tokenization.interval_token_start(token), standard_tokenization.interval_token_end(token));
	    final SubLObject span_length = interval_span.interval_span_length(span);
	    if (NIL == rbp_span_subsumed_by_all_ofP(span, big_spans)) {
		if (span_length.numE(input_length) || span_length.numL(TWO_INTEGER)) {
		    ans = cons(token, ans);
		} else {
		    big_spans = cons(span, big_spans);
		    ans = cons(token, ans);
		}
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    token = cdolist_list_var.first();
	}
	return ans;
    }

    public static final SubLObject rbp_span_subsumed_by_all_ofP_alt(SubLObject span, SubLObject big_spans) {
	if (NIL == big_spans) {
	    return NIL;
	}
	{
	    SubLObject failP = NIL;
	    if (NIL == failP) {
		{
		    SubLObject csome_list_var = big_spans;
		    SubLObject big_span = NIL;
		    for (big_span = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), big_span = csome_list_var.first()) {
			if (NIL == rbp_span_subsumed_byP(span, big_span)) {
			    failP = T;
			}
		    }
		}
	    }
	    return makeBoolean(NIL == failP);
	}
    }

    public static SubLObject rbp_span_subsumed_by_all_ofP(final SubLObject span, final SubLObject big_spans) {
	if (NIL == big_spans) {
	    return NIL;
	}
	SubLObject failP = NIL;
	if (NIL == failP) {
	    SubLObject csome_list_var = big_spans;
	    SubLObject big_span = NIL;
	    big_span = csome_list_var.first();
	    while ((NIL == failP) && (NIL != csome_list_var)) {
		if (NIL == rbp_span_subsumed_byP(span, big_span)) {
		    failP = T;
		}
		csome_list_var = csome_list_var.rest();
		big_span = csome_list_var.first();
	    }
	}
	return makeBoolean(NIL == failP);
    }

    public static final SubLObject rbp_span_subsumed_byP_alt(SubLObject span, SubLObject big_span) {
	return makeBoolean(!((span.equalp(big_span) || interval_span.interval_span_start(span).numL(interval_span.interval_span_start(big_span))) || interval_span.interval_span_end(span).numG(interval_span.interval_span_end(big_span))));
    }

    public static SubLObject rbp_span_subsumed_byP(final SubLObject span, final SubLObject big_span) {
	return makeBoolean(((!span.equalp(big_span)) && (!interval_span.interval_span_start(span).numL(interval_span.interval_span_start(big_span)))) && (!interval_span.interval_span_end(span).numG(interval_span.interval_span_end(big_span))));
    }

    public static final SubLObject initialize_rbp_name_cache_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $rbp_name_cache$.setDynamicValue(make_hash_table(SIXTEEN_INTEGER, symbol_function(EQUALP), UNPROVIDED), thread);
	    return $rbp_name_cache$.getDynamicValue(thread);
	}
    }

    public static SubLObject initialize_rbp_name_cache() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	$rbp_name_cache$.setDynamicValue(make_hash_table(SIXTEEN_INTEGER, symbol_function(EQUALP), UNPROVIDED), thread);
	return $rbp_name_cache$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return BOOLEAN; Is BLOCK a maximally specific name block for its denot?
     */
    @LispMethod(comment = "@return BOOLEAN; Is BLOCK a maximally specific name block for its denot?")
    public static final SubLObject rbp_name_block_pred_among_floorsP_alt(SubLObject block) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject denot = nc_block_head(block);
		SubLObject pred = nc_block_head_string_pred(block);
		SubLObject floor_preds = gethash(denot, $rbp_name_cache$.getDynamicValue(thread), UNPROVIDED);
		return member(pred, floor_preds, UNPROVIDED, UNPROVIDED);
	    }
	}
    }

    /**
     *
     *
     * @return BOOLEAN; Is BLOCK a maximally specific name block for its denot?
     */
    @LispMethod(comment = "@return BOOLEAN; Is BLOCK a maximally specific name block for its denot?")
    public static SubLObject rbp_name_block_pred_among_floorsP(final SubLObject block) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject denot = nc_block_head(block);
	final SubLObject pred = nc_block_head_string_pred(block);
	final SubLObject floor_preds = gethash(denot, $rbp_name_cache$.getDynamicValue(thread), UNPROVIDED);
	return member(pred, floor_preds, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Cache name information from BLOCK
     */
    @LispMethod(comment = "Cache name information from BLOCK")
    public static final SubLObject rbp_cache_name_block_alt(SubLObject block) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject denot = nc_block_head(block);
		SubLObject pred = nc_block_head_string_pred(block);
		SubLObject existing = gethash(denot, $rbp_name_cache$.getDynamicValue(thread), UNPROVIDED);
		if (NIL == subl_promotions.memberP(pred, existing, UNPROVIDED, UNPROVIDED)) {
		    sethash(denot, $rbp_name_cache$.getDynamicValue(thread), rbp_floors_cached(cons(pred, existing)));
		}
	    }
	    return T;
	}
    }

    /**
     * Cache name information from BLOCK
     */
    @LispMethod(comment = "Cache name information from BLOCK")
    public static SubLObject rbp_cache_name_block(final SubLObject block) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject denot = nc_block_head(block);
	final SubLObject pred = nc_block_head_string_pred(block);
	final SubLObject existing = gethash(denot, $rbp_name_cache$.getDynamicValue(thread), UNPROVIDED);
	if (NIL == subl_promotions.memberP(pred, existing, UNPROVIDED, UNPROVIDED)) {
	    sethash(denot, $rbp_name_cache$.getDynamicValue(thread), rbp_floors_cached(cons(pred, existing)));
	}
	return T;
    }

    public static final SubLObject clear_rbp_floors_cached_alt() {
	{
	    SubLObject cs = $rbp_floors_cached_caching_state$.getGlobalValue();
	    if (NIL != cs) {
		memoization_state.caching_state_clear(cs);
	    }
	}
	return NIL;
    }

    public static SubLObject clear_rbp_floors_cached() {
	final SubLObject cs = $rbp_floors_cached_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static final SubLObject remove_rbp_floors_cached_alt(SubLObject v_forts) {
	return memoization_state.caching_state_remove_function_results_with_args($rbp_floors_cached_caching_state$.getGlobalValue(), list(v_forts), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rbp_floors_cached(final SubLObject v_forts) {
	return memoization_state.caching_state_remove_function_results_with_args($rbp_floors_cached_caching_state$.getGlobalValue(), list(v_forts), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rbp_floors_cached_internal_alt(SubLObject v_forts) {
	return genl_predicates.min_predicates(v_forts, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_floors_cached_internal(final SubLObject v_forts) {
	return genl_predicates.min_predicates(v_forts, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rbp_floors_cached_alt(SubLObject v_forts) {
	{
	    SubLObject caching_state = $rbp_floors_cached_caching_state$.getGlobalValue();
	    if (NIL == caching_state) {
		caching_state = memoization_state.create_global_caching_state_for_name(RBP_FLOORS_CACHED, $rbp_floors_cached_caching_state$, NIL, EQL, ONE_INTEGER, $int$128);
	    }
	    {
		SubLObject results = memoization_state.caching_state_lookup(caching_state, v_forts, $kw93$_MEMOIZED_ITEM_NOT_FOUND_);
		if (results == $kw93$_MEMOIZED_ITEM_NOT_FOUND_) {
		    results = arg2(resetMultipleValues(), multiple_value_list(rbp_floors_cached_internal(v_forts)));
		    memoization_state.caching_state_put(caching_state, v_forts, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	    }
	}
    }

    public static SubLObject rbp_floors_cached(final SubLObject v_forts) {
	SubLObject caching_state = $rbp_floors_cached_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name(RBP_FLOORS_CACHED, $rbp_floors_cached_caching_state$, $int$512, EQUAL, ONE_INTEGER, $int$128);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, v_forts, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(resetMultipleValues(), multiple_value_list(rbp_floors_cached_internal(v_forts)));
	    memoization_state.caching_state_put(caching_state, v_forts, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_rbp_ok_name_cachedP_alt() {
	{
	    SubLObject cs = $rbp_ok_name_cachedP_caching_state$.getGlobalValue();
	    if (NIL != cs) {
		memoization_state.caching_state_clear(cs);
	    }
	}
	return NIL;
    }

    public static SubLObject clear_rbp_ok_name_cachedP() {
	final SubLObject cs = $rbp_ok_name_cachedP_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static final SubLObject remove_rbp_ok_name_cachedP_alt(SubLObject block, SubLObject inside_noun_compoundP) {
	return memoization_state.caching_state_remove_function_results_with_args($rbp_ok_name_cachedP_caching_state$.getGlobalValue(), list(block, inside_noun_compoundP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rbp_ok_name_cachedP(final SubLObject block, final SubLObject inside_noun_compoundP) {
	return memoization_state.caching_state_remove_function_results_with_args($rbp_ok_name_cachedP_caching_state$.getGlobalValue(), list(block, inside_noun_compoundP), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEAN; Should we treat the string in BLOCK as a name?
     */
    @LispMethod(comment = "@return BOOLEAN; Should we treat the string in BLOCK as a name?")
    public static final SubLObject rbp_ok_name_cachedP_internal_alt(SubLObject block, SubLObject inside_noun_compoundP) {
	{
	    SubLObject block_string = nc_block_spanned_string(block);
	    SubLObject pred = nc_block_head_string_pred(block);
	    SubLObject denot = function_terms.naut_to_nart(nc_block_head(block));
	    if (NIL != (NIL != inside_noun_compoundP ? ((SubLObject) (string_utilities.starts_with_by_test(block_string, $str_alt170$the_, symbol_function(EQUALP))))
		    : makeBoolean((NIL != indexed_term_p(denot)) && (NIL == subl_promotions.memberP(block_string, kb_mapping_utilities.pred_values_in_any_mt(denot, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED))))) {
		return NIL;
	    }
	    if ((NIL != indexed_term_p(denot)) && ((NIL != lexicon_accessors.closed_lexical_class_stringP(block_string, UNPROVIDED)) || (NIL != lexicon_accessors.denots_of_string(block_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
		{
		    SubLObject block_span = nc_block_span_index(block);
		    SubLObject strings = rbp_strings_for_span(block_span);
		    SubLObject original_string = strings.first();
		    if (NIL != string_utilities.lower_case_string_p(original_string)) {
			{
			    SubLObject abbrevs = kb_mapping_utilities.pred_values_in_any_mt(denot, $$abbreviationString_PN, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    if (NIL == subl_promotions.memberP(original_string, abbrevs, symbol_function($sym151$STRING_), UNPROVIDED)) {
				{
				    SubLObject acronyms = kb_mapping_utilities.pred_values_in_any_mt(denot, $$acronymString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				    return member(original_string, acronyms, symbol_function($sym151$STRING_), UNPROVIDED);
				}
			    }
			}
		    }
		}
	    }
	}
	return T;
    }

    /**
     *
     *
     * @return BOOLEAN; Should we treat the string in BLOCK as a name?
     */
    @LispMethod(comment = "@return BOOLEAN; Should we treat the string in BLOCK as a name?")
    public static SubLObject rbp_ok_name_cachedP_internal(final SubLObject block, final SubLObject inside_noun_compoundP) {
	final SubLObject block_string = nc_block_spanned_string(block);
	final SubLObject pred = nc_block_head_string_pred(block);
	final SubLObject denot = function_terms.naut_to_nart(nc_block_head(block));
	if (NIL != (NIL != inside_noun_compoundP ? string_utilities.starts_with_by_test(block_string, $$$the_, symbol_function(EQUALP))
		: makeBoolean((NIL != indexed_term_p(denot)) && (NIL == subl_promotions.memberP(block_string, kb_mapping_utilities.pred_values_in_any_mt(denot, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED))))) {
	    return NIL;
	}
	if ((NIL != indexed_term_p(denot)) && ((NIL != lexicon_accessors.closed_lexical_class_stringP(block_string, UNPROVIDED)) || (NIL != lexicon_accessors.denots_of_string(block_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
	    final SubLObject block_span = nc_block_span_index(block);
	    final SubLObject strings = rbp_strings_for_span(block_span);
	    final SubLObject original_string = strings.first();
	    if (NIL != string_utilities.lower_case_string_p(original_string)) {
		final SubLObject abbrevs = kb_mapping_utilities.pred_values_in_any_mt(denot, $$abbreviationString_PN, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL == subl_promotions.memberP(original_string, abbrevs, symbol_function($sym146$STRING_), UNPROVIDED)) {
		    final SubLObject acronyms = kb_mapping_utilities.pred_values_in_any_mt(denot, $$acronymString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    return member(original_string, acronyms, symbol_function($sym146$STRING_), UNPROVIDED);
		}
	    }
	}
	return T;
    }

    public static final SubLObject rbp_ok_name_cachedP_alt(SubLObject block, SubLObject inside_noun_compoundP) {
	{
	    SubLObject caching_state = $rbp_ok_name_cachedP_caching_state$.getGlobalValue();
	    if (NIL == caching_state) {
		caching_state = memoization_state.create_global_caching_state_for_name($sym169$RBP_OK_NAME_CACHED_, $sym173$_RBP_OK_NAME_CACHED__CACHING_STATE_, NIL, EQL, TWO_INTEGER, SIXTEEN_INTEGER);
	    }
	    {
		SubLObject sxhash = memoization_state.sxhash_calc_2(block, inside_noun_compoundP);
		SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (collisions != $kw93$_MEMOIZED_ITEM_NOT_FOUND_) {
		    {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
			    {
				SubLObject cached_args = collision.first();
				SubLObject results2 = second(collision);
				if (block.eql(cached_args.first())) {
				    cached_args = cached_args.rest();
				    if (((NIL != cached_args) && (NIL == cached_args.rest())) && inside_noun_compoundP.eql(cached_args.first())) {
					return memoization_state.caching_results(results2);
				    }
				}
			    }
			}
		    }
		}
		{
		    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(rbp_ok_name_cachedP_internal(block, inside_noun_compoundP)));
		    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(block, inside_noun_compoundP));
		    return memoization_state.caching_results(results);
		}
	    }
	}
    }

    public static SubLObject rbp_ok_name_cachedP(final SubLObject block, final SubLObject inside_noun_compoundP) {
	SubLObject caching_state = $rbp_ok_name_cachedP_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name($sym165$RBP_OK_NAME_CACHED_, $sym169$_RBP_OK_NAME_CACHED__CACHING_STATE_, $int$128, EQL, TWO_INTEGER, SIXTEEN_INTEGER);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(block, inside_noun_compoundP);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (block.eql(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && inside_noun_compoundP.eql(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rbp_ok_name_cachedP_internal(block, inside_noun_compoundP)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(block, inside_noun_compoundP));
	return memoization_state.caching_results(results3);
    }

    public static final SubLObject rbp_strings_for_span_alt(SubLObject span) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject start = interval_span.interval_span_start(span);
		SubLObject end = interval_span.interval_span_end(span);
		SubLObject strings = subseq($rbp_input_strings$.getDynamicValue(thread), start, end);
		return strings;
	    }
	}
    }

    public static SubLObject rbp_strings_for_span(final SubLObject span) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject start = interval_span.interval_span_start(span);
	final SubLObject end = interval_span.interval_span_end(span);
	final SubLObject strings = subseq($rbp_input_strings$.getDynamicValue(thread), start, end);
	return strings;
    }

    /**
     * The string tokenizer used by the Recursive Block Parser
     */
    @LispMethod(comment = "The string tokenizer used by the Recursive Block Parser")
    public static final SubLObject rbp_string_tokenize_alt(SubLObject string) {
	return nl_trie.nl_trie_string_tokenize(string);
    }

    /**
     * The string tokenizer used by the Recursive Block Parser
     */
    @LispMethod(comment = "The string tokenizer used by the Recursive Block Parser")
    public static SubLObject rbp_string_tokenize(final SubLObject string) {
	return nl_trie.nl_trie_string_tokenize(string);
    }

    public static final SubLObject rbp_ok_blockP_alt(SubLObject block) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject pred = nc_block_head_string_pred(block);
		if (NIL != parsing_utilities.npp_excluded_name_predP(pred)) {
		    return NIL;
		} else {
		    if (pred == $$atomicSymbol) {
			{
			    SubLObject block_string = nc_block_spanned_string(block);
			    if (NIL == find(block_string, $rbp_input_strings$.getDynamicValue(thread), symbol_function($sym151$STRING_), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
				return NIL;
			    }
			}
		    }
		}
	    }
	    if (NIL != rbp_name_blockP(block)) {
		if (NIL != rbp_bad_name_blockP(block)) {
		    return NIL;
		} else {
		    rbp_cache_name_block(block);
		}
	    }
	    return T;
	}
    }

    public static SubLObject rbp_ok_blockP(final SubLObject block) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject pred = nc_block_head_string_pred(block);
	if (NIL != parsing_utilities.npp_excluded_name_predP(pred)) {
	    return NIL;
	}
	if (pred.eql($$atomicSymbol)) {
	    final SubLObject block_string = nc_block_spanned_string(block);
	    if (NIL == find(block_string, $rbp_input_strings$.getDynamicValue(thread), symbol_function($sym146$STRING_), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		return NIL;
	    }
	}
	if (NIL != rbp_name_blockP(block)) {
	    if (NIL != rbp_bad_name_blockP(block)) {
		return NIL;
	    }
	    rbp_cache_name_block(block);
	}
	return T;
    }

    public static final SubLObject rbp_bad_name_blockP_alt(SubLObject block) {
	return makeBoolean(NIL == rbp_ok_name_cachedP(block, T));
    }

    public static SubLObject rbp_bad_name_blockP(final SubLObject block) {
	return makeBoolean(NIL == rbp_ok_name_cachedP(block, T));
    }

    public static final SubLObject rbp_name_blockP_alt(SubLObject block) {
	return lexicon_accessors.genl_posP(nc_block_head_pos(block), $$ProperNoun, UNPROVIDED);
    }

    public static SubLObject rbp_name_blockP(final SubLObject block) {
	return lexicon_accessors.genl_posP(nc_block_head_pos(block), $$ProperNoun, UNPROVIDED);
    }

    public static final SubLObject rbp_filter_redundant_blocks_alt(SubLObject blocks) {
	{
	    SubLObject non_names = remove_if($sym176$RBP_NAME_BLOCK_, blocks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    SubLObject good_names = list_utilities.remove_if_not($sym177$RBP_NAME_BLOCK_PRED_AMONG_FLOORS_, blocks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    return append(non_names, good_names);
	}
    }

    public static SubLObject rbp_filter_redundant_blocks(final SubLObject blocks) {
	final SubLObject non_names = remove_if($sym172$RBP_NAME_BLOCK_, blocks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	final SubLObject good_names = list_utilities.remove_if_not($sym173$RBP_NAME_BLOCK_PRED_AMONG_FLOORS_, blocks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	return append(non_names, good_names);
    }

    /**
     *
     *
     * @return LIST; ((<span> <parses>)) from the chart.
     * @unknown baxter
     */
    @LispMethod(comment = "@return LIST; ((<span> <parses>)) from the chart.\r\n@unknown baxter")
    public static final SubLObject display_all_parses_alt(SubLObject chart) {
	{
	    SubLObject ans = NIL;
	    SubLObject cdohash_table = rbp_chart_parser.rbp_chart_edges(chart);
	    SubLObject span = NIL;
	    SubLObject block_ids = NIL;
	    {
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			span = getEntryKey(cdohash_entry);
			block_ids = getEntryValue(cdohash_entry);
			{
			    SubLObject parses = NIL;
			    SubLObject cdolist_list_var = block_ids;
			    SubLObject block_id = NIL;
			    for (block_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), block_id = cdolist_list_var.first()) {
				{
				    SubLObject block_hash = rbp_chart_parser.rbp_chart_block_hash(chart);
				    SubLObject block = rbp_chart_parser.rbp_chart_block_hash_lookup(block_id, block_hash);
				    SubLObject pred = nc_block_head_string_pred(block);
				    SubLObject denot = cycl_utilities.hl_to_el(nc_block_denot(block));
				    SubLObject rule = nc_block_rule(block);
				    SubLObject npp_parse = np_parser.make_npp_parse(denot, pred);
				    if (NIL != np_parser.npp_proper_parseP(npp_parse)) {
					{
					    SubLObject item_var = npp_parse;
					    if (NIL == member(item_var, parses, $sym158$NPP_PARSE_, symbol_function(IDENTITY))) {
						parses = cons(item_var, parses);
					    }
					}
				    }
				}
			    }
			    ans = cons(list(span, parses), ans);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	    return Sort.sort(ans, $sym178$INTERVAL_SPAN_PRECEDES_, symbol_function(FIRST));
	}
    }

    /**
     *
     *
     * @return LIST; ((<span> <parses>)) from the chart.
     * @unknown baxter
     */
    @LispMethod(comment = "@return LIST; ((<span> <parses>)) from the chart.\r\n@unknown baxter")
    public static SubLObject display_all_parses(final SubLObject chart) {
	SubLObject ans = NIL;
	final SubLObject cdohash_table = rbp_chart_parser.rbp_chart_edges(chart);
	SubLObject span = NIL;
	SubLObject block_ids = NIL;
	final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
	try {
	    while (iteratorHasNext(cdohash_iterator)) {
		final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
		span = getEntryKey(cdohash_entry);
		block_ids = getEntryValue(cdohash_entry);
		SubLObject parses = NIL;
		SubLObject cdolist_list_var = block_ids;
		SubLObject block_id = NIL;
		block_id = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    final SubLObject block_hash = rbp_chart_parser.rbp_chart_block_hash(chart);
		    final SubLObject block = rbp_chart_parser.rbp_chart_block_hash_lookup(block_id, block_hash);
		    final SubLObject pred = nc_block_head_string_pred(block);
		    final SubLObject denot = cycl_utilities.hl_to_el(nc_block_denot(block));
		    final SubLObject rule = nc_block_rule(block);
		    final SubLObject npp_parse = np_parser.make_npp_parse(denot, pred);
		    if (NIL != np_parser.npp_proper_parseP(npp_parse)) {
			final SubLObject item_var = npp_parse;
			if (NIL == member(item_var, parses, $sym153$NPP_PARSE_, symbol_function(IDENTITY))) {
			    parses = cons(item_var, parses);
			}
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    block_id = cdolist_list_var.first();
		}
		ans = cons(list(span, parses), ans);
	    }
	} finally {
	    releaseEntrySetIterator(cdohash_iterator);
	}
	return Sort.sort(ans, $sym174$INTERVAL_SPAN_PRECEDES_, symbol_function(FIRST));
    }

    public static final SubLObject display_all_trees_alt(SubLObject chart) {
	{
	    SubLObject block_hash = rbp_chart_parser.rbp_chart_block_hash(chart);
	    SubLObject cdolist_list_var = rbp_chart_parser.rbp_chart_lookup(rbp_chart_parser.rbp_chart_max_span(chart), chart);
	    SubLObject block = NIL;
	    for (block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), block = cdolist_list_var.first()) {
		display_tree(block, block_hash);
	    }
	}
	return T;
    }

    public static SubLObject display_all_trees(final SubLObject chart) {
	final SubLObject block_hash = rbp_chart_parser.rbp_chart_block_hash(chart);
	SubLObject cdolist_list_var = rbp_chart_parser.rbp_chart_lookup(rbp_chart_parser.rbp_chart_max_span(chart), chart);
	SubLObject block = NIL;
	block = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    display_tree(block, block_hash);
	    cdolist_list_var = cdolist_list_var.rest();
	    block = cdolist_list_var.first();
	}
	return T;
    }

    public static final SubLObject display_tree_alt(SubLObject block, SubLObject block_hash) {
	princ(block, UNPROVIDED);
	{
	    SubLObject sub_tree = nc_block_sub_tree(block);
	    if (NIL != sub_tree) {
		{
		    SubLObject datum = sub_tree;
		    SubLObject current = datum;
		    SubLObject rbp_rule = NIL;
		    SubLObject dtr1_id = NIL;
		    SubLObject dtr2_id = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt180);
		    rbp_rule = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt180);
		    dtr1_id = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt180);
		    dtr2_id = current.first();
		    current = current.rest();
		    if (NIL == current) {
			format(T, $str_alt181$_S__, rbp_rule_bank.rbp_rule_cycl(rbp_rule));
			display_tree(rbp_chart_parser.rbp_chart_block_hash_lookup(dtr1_id, block_hash), block_hash);
			display_tree(rbp_chart_parser.rbp_chart_block_hash_lookup(dtr2_id, block_hash), block_hash);
		    } else {
			cdestructuring_bind_error(datum, $list_alt180);
		    }
		}
	    }
	}
	return T;
    }

    public static SubLObject display_tree(final SubLObject block, final SubLObject block_hash) {
	princ(block, UNPROVIDED);
	final SubLObject sub_tree = nc_block_sub_tree(block);
	if (NIL != sub_tree) {
	    SubLObject current;
	    final SubLObject datum = current = sub_tree;
	    SubLObject rbp_rule = NIL;
	    SubLObject dtr1_id = NIL;
	    SubLObject dtr2_id = NIL;
	    destructuring_bind_must_consp(current, datum, $list176);
	    rbp_rule = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list176);
	    dtr1_id = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list176);
	    dtr2_id = current.first();
	    current = current.rest();
	    if (NIL == current) {
		format(T, $str177$_S__, rbp_rule_bank.rbp_rule_cycl(rbp_rule));
		display_tree(rbp_chart_parser.rbp_chart_block_hash_lookup(dtr1_id, block_hash), block_hash);
		display_tree(rbp_chart_parser.rbp_chart_block_hash_lookup(dtr2_id, block_hash), block_hash);
	    } else {
		cdestructuring_bind_error(datum, $list176);
	    }
	}
	return T;
    }

    public static final SubLObject rbp_rule_count_alt() {
	return rbp_rule_bank.rbp_rb_rule_count();
    }

    public static SubLObject rbp_rule_count() {
	return rbp_rule_bank.rbp_rb_rule_count();
    }

    /**
     *
     *
     * @return formula; the semantic template from RULE-CYCL
     */
    @LispMethod(comment = "@return formula; the semantic template from RULE-CYCL")
    public static final SubLObject rbp_rule_cycl_semx_alt(SubLObject rule_cycl, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = parsing_vars.$rbp_rule_lookup_mt$.getGlobalValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject ans = NIL;
		SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		    try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			{
			    SubLObject raw_gaf_value = kb_mapping_utilities.fpred_value(rule_cycl, $$ncRuleTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    if (NIL != raw_gaf_value) {
				ans = rbp_rule_bank.rbp_forts_to_keywords(function_terms.nart_to_naut(raw_gaf_value));
			    }
			}
			{
			    SubLObject raw_gaf_value = NIL;
			    SubLObject pred_var = $$ncRuleTemplate_Compact;
			    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(rule_cycl, ONE_INTEGER, pred_var)) {
				{
				    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(rule_cycl, ONE_INTEGER, pred_var);
				    SubLObject done_var = ans;
				    SubLObject token_var = NIL;
				    while (NIL == done_var) {
					{
					    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
					    SubLObject valid = makeBoolean(token_var != final_index_spec);
					    if (NIL != valid) {
						{
						    SubLObject final_index_iterator = NIL;
						    try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
							{
							    SubLObject done_var_23 = ans;
							    SubLObject token_var_24 = NIL;
							    while (NIL == done_var_23) {
								{
								    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_24);
								    SubLObject valid_25 = makeBoolean(token_var_24 != assertion);
								    if (NIL != valid_25) {
									raw_gaf_value = assertions_high.gaf_arg(assertion, TWO_INTEGER);
									thread.resetMultipleValues();
									{
									    SubLObject success = formula_pattern_match.formula_matches_pattern(raw_gaf_value, $list_alt185);
									    SubLObject v_bindings = thread.secondMultipleValue();
									    thread.resetMultipleValues();
									    if (NIL != success) {
										{
										    SubLObject indexical2 = list_utilities.alist_lookup_without_values(v_bindings, INDEXICAL2, UNPROVIDED, UNPROVIDED);
										    SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
										    SubLObject indexical1 = list_utilities.alist_lookup_without_values(v_bindings, INDEXICAL1, UNPROVIDED, UNPROVIDED);
										    SubLObject fn = list_utilities.alist_lookup_without_values(v_bindings, FN, UNPROVIDED, UNPROVIDED);
										    ans = rbp_rule_bank.rbp_forts_to_keywords(make_ternary_formula(fn, indexical1, bin_pred, indexical2));
										}
									    }
									}
								    }
								    done_var_23 = makeBoolean((NIL == valid_25) || (NIL != ans));
								}
							    }
							}
						    } finally {
							{
							    SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
							    try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								if (NIL != final_index_iterator) {
								    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
							    } finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
							    }
							}
						    }
						}
					    }
					    done_var = makeBoolean((NIL == valid) || (NIL != ans));
					}
				    }
				}
			    }
			}
		    } finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		    }
		}
		return ans;
	    }
	}
    }

    /**
     *
     *
     * @return formula; the semantic template from RULE-CYCL
     */
    @LispMethod(comment = "@return formula; the semantic template from RULE-CYCL")
    public static SubLObject rbp_rule_cycl_semx(final SubLObject rule_cycl, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = parsing_vars.$rbp_rule_lookup_mt$.getGlobalValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject ans = NIL;
	final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
	final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
	final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
	try {
	    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
	    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
	    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
	    SubLObject raw_gaf_value = kb_mapping_utilities.fpred_value(rule_cycl, $$ncRuleTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (NIL != raw_gaf_value) {
		ans = rbp_rule_bank.rbp_forts_to_keywords(function_terms.nart_to_naut(raw_gaf_value));
	    }
	    raw_gaf_value = NIL;
	    final SubLObject pred_var = $$ncRuleTemplate_Compact;
	    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(rule_cycl, ONE_INTEGER, pred_var)) {
		final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(rule_cycl, ONE_INTEGER, pred_var);
		SubLObject done_var = ans;
		final SubLObject token_var = NIL;
		while (NIL == done_var) {
		    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
		    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
		    if (NIL != valid) {
			SubLObject final_index_iterator = NIL;
			try {
			    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
			    SubLObject done_var_$23 = ans;
			    final SubLObject token_var_$24 = NIL;
			    while (NIL == done_var_$23) {
				final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
				final SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(assertion));
				if (NIL != valid_$25) {
				    raw_gaf_value = assertions_high.gaf_arg(assertion, TWO_INTEGER);
				    thread.resetMultipleValues();
				    final SubLObject success = formula_pattern_match.formula_matches_pattern(raw_gaf_value, $list181);
				    final SubLObject v_bindings = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    if (NIL != success) {
					final SubLObject indexical2 = list_utilities.alist_lookup_without_values(v_bindings, INDEXICAL2, UNPROVIDED, UNPROVIDED);
					final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
					final SubLObject indexical3 = list_utilities.alist_lookup_without_values(v_bindings, INDEXICAL1, UNPROVIDED, UNPROVIDED);
					final SubLObject fn = list_utilities.alist_lookup_without_values(v_bindings, FN, UNPROVIDED, UNPROVIDED);
					ans = rbp_rule_bank.rbp_forts_to_keywords(make_ternary_formula(fn, indexical3, bin_pred, indexical2));
				    }
				}
				done_var_$23 = makeBoolean((NIL == valid_$25) || (NIL != ans));
			    }
			} finally {
			    final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				if (NIL != final_index_iterator) {
				    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
				}
				restoreValuesFromVector(_values);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
			    }
			}
		    }
		    done_var = makeBoolean((NIL == valid) || (NIL != ans));
		}
	    }
	} finally {
	    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
	    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
	    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
	}
	return ans;
    }

    /**
     *
     *
     * @param RULE-CYCL
     * 		indexed-term-p; an instance of #$NounCompoundRule.
     * @return BOOLEAN; Is RULE-CYCL  well-formed noun compound rule?
     * @unknown Assumes MT visibility is set from outside.
     */
    @LispMethod(comment = "@param RULE-CYCL\r\n\t\tindexed-term-p; an instance of #$NounCompoundRule.\r\n@return BOOLEAN; Is RULE-CYCL  well-formed noun compound rule?\r\n@unknown Assumes MT visibility is set from outside.")
    public static final SubLObject rbp_rule_okP_alt(SubLObject rule_cycl) {
	if (NIL == rbp_rule_cycl_semx(rule_cycl, UNPROVIDED)) {
	    return NIL;
	}
	{
	    SubLObject constraints = rbp_rule_bank.rbp_rule_constraints(rule_cycl);
	    if (NIL == constraints) {
		return NIL;
	    } else {
		if ((NIL == find_if(RBP_SEMANTIC_CONSTRAINT_P, constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find_if(RBP_WORD_UNIT_CONSTRAINT_P, constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
		    return NIL;
		} else {
		    return T;
		}
	    }
	}
    }

    /**
     *
     *
     * @param RULE-CYCL
     * 		indexed-term-p; an instance of #$NounCompoundRule.
     * @return BOOLEAN; Is RULE-CYCL  well-formed noun compound rule?
     * @unknown Assumes MT visibility is set from outside.
     */
    @LispMethod(comment = "@param RULE-CYCL\r\n\t\tindexed-term-p; an instance of #$NounCompoundRule.\r\n@return BOOLEAN; Is RULE-CYCL  well-formed noun compound rule?\r\n@unknown Assumes MT visibility is set from outside.")
    public static SubLObject rbp_rule_okP(final SubLObject rule_cycl) {
	if (NIL == rbp_rule_cycl_semx(rule_cycl, UNPROVIDED)) {
	    return NIL;
	}
	final SubLObject constraints = rbp_rule_bank.rbp_rule_constraints(rule_cycl);
	if (NIL == constraints) {
	    return NIL;
	}
	if ((NIL == find_if(RBP_SEMANTIC_CONSTRAINT_P, constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find_if(RBP_WORD_UNIT_CONSTRAINT_P, constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
	    return NIL;
	}
	return T;
    }

    public static final SubLObject rbp_domain_mt_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return parsing_vars.$parsing_domain_mt$.getDynamicValue(thread);
	}
    }

    public static SubLObject rbp_domain_mt() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return parsing_vars.$parsing_domain_mt$.getDynamicValue(thread);
    }

    public static final SubLObject rbp_get_cognate_from_instance_level_arg_alt(SubLObject pred) {
	{
	    SubLObject cognates = kb_mapping.gather_gaf_arg_index(pred, ONE_INTEGER, $$typeLevelCognates, $$BaseKB, UNPROVIDED);
	    if (NIL != list_utilities.singletonP(cognates)) {
		return cycl_utilities.formula_arg2(cognates.first(), UNPROVIDED);
	    }
	}
	return NIL;
    }

    public static SubLObject rbp_get_cognate_from_instance_level_arg(final SubLObject pred) {
	final SubLObject cognates = kb_mapping.gather_gaf_arg_index(pred, ONE_INTEGER, $$typeLevelCognates, $$BaseKB, UNPROVIDED);
	if (NIL != list_utilities.singletonP(cognates)) {
	    return cycl_utilities.formula_arg2(cognates.first(), UNPROVIDED);
	}
	return NIL;
    }

    public static final SubLObject rbp_get_cognate_from_type_level_arg_alt(SubLObject pred) {
	{
	    SubLObject cognates = kb_mapping.gather_gaf_arg_index(pred, TWO_INTEGER, $$typeLevelCognates, $$BaseKB, UNPROVIDED);
	    if (NIL != list_utilities.singletonP(cognates)) {
		return cycl_utilities.formula_arg1(cognates.first(), UNPROVIDED);
	    }
	}
	return NIL;
    }

    public static SubLObject rbp_get_cognate_from_type_level_arg(final SubLObject pred) {
	final SubLObject cognates = kb_mapping.gather_gaf_arg_index(pred, TWO_INTEGER, $$typeLevelCognates, $$BaseKB, UNPROVIDED);
	if (NIL != list_utilities.singletonP(cognates)) {
	    return cycl_utilities.formula_arg1(cognates.first(), UNPROVIDED);
	}
	return NIL;
    }

    /**
     *
     *
     * @param RBP-SEMX
     * 		; the sort of semantics we use in the NCR's, typically a subcollection function naut
     * @return RBP-SEMX ; if anything appropriate
    This function converts type-level semantics into instance-level semantics, and vice versa, as appropriate.
    E.g., it will convert (#$SubcollectionOfWithRelationToFn #$Travel-TripEvent #$instrumentType-Generic #$Island)
    into (#$SubcollectionOfWithRelationToTypeFn #$Travel-TripEvent #$instrument-Generic #$Island)
     * @unknown presently can return only if there's a unique #$typeLevelCognates match
     */
    @LispMethod(comment = "@param RBP-SEMX\r\n\t\t; the sort of semantics we use in the NCR\'s, typically a subcollection function naut\r\n@return RBP-SEMX ; if anything appropriate\r\nThis function converts type-level semantics into instance-level semantics, and vice versa, as appropriate.\r\nE.g., it will convert (#$SubcollectionOfWithRelationToFn #$Travel-TripEvent #$instrumentType-Generic #$Island)\r\ninto (#$SubcollectionOfWithRelationToTypeFn #$Travel-TripEvent #$instrument-Generic #$Island)\r\n@unknown presently can return only if there\'s a unique #$typeLevelCognates match")
    public static final SubLObject rbp_semx_type_level_cognate_alt(SubLObject semx) {
	if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(semx)) {
	    {
		SubLObject datum = semx;
		SubLObject current = datum;
		SubLObject func = NIL;
		SubLObject focal_col = NIL;
		SubLObject pred = NIL;
		SubLObject other_col = NIL;
		destructuring_bind_must_consp(current, datum, $list_alt194);
		func = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt194);
		focal_col = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt194);
		pred = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt194);
		other_col = current.first();
		current = current.rest();
		if (NIL == current) {
		    if (NIL != isa.isa_in_any_mtP(func, $const195$SubcollectionRelationFunction_Ins)) {
			{
			    SubLObject inst_level_pred = rbp_get_cognate_from_type_level_arg(pred);
			    SubLObject type_level_func = rbp_get_cognate_from_instance_level_arg(func);
			    if (NIL != inst_level_pred) {
				return list(type_level_func, focal_col, inst_level_pred, other_col);
			    }
			}
		    } else {
			{
			    SubLObject type_level_pred = rbp_get_cognate_from_instance_level_arg(pred);
			    SubLObject inst_level_func = rbp_get_cognate_from_type_level_arg(func);
			    if (NIL != type_level_pred) {
				return list(inst_level_func, focal_col, type_level_pred, other_col);
			    }
			}
		    }
		} else {
		    cdestructuring_bind_error(datum, $list_alt194);
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @param RBP-SEMX
     * 		; the sort of semantics we use in the NCR's, typically a subcollection function naut
     * @return RBP-SEMX ; if anything appropriate
    This function converts type-level semantics into instance-level semantics, and vice versa, as appropriate.
    E.g., it will convert (#$SubcollectionOfWithRelationToFn #$Travel-TripEvent #$instrumentType-Generic #$Island)
    into (#$SubcollectionOfWithRelationToTypeFn #$Travel-TripEvent #$instrument-Generic #$Island)
     * @unknown presently can return only if there's a unique #$typeLevelCognates match
     */
    @LispMethod(comment = "@param RBP-SEMX\r\n\t\t; the sort of semantics we use in the NCR\'s, typically a subcollection function naut\r\n@return RBP-SEMX ; if anything appropriate\r\nThis function converts type-level semantics into instance-level semantics, and vice versa, as appropriate.\r\nE.g., it will convert (#$SubcollectionOfWithRelationToFn #$Travel-TripEvent #$instrumentType-Generic #$Island)\r\ninto (#$SubcollectionOfWithRelationToTypeFn #$Travel-TripEvent #$instrument-Generic #$Island)\r\n@unknown presently can return only if there\'s a unique #$typeLevelCognates match")
    public static SubLObject rbp_semx_type_level_cognate(final SubLObject semx) {
	if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(semx)) {
	    SubLObject func = NIL;
	    SubLObject focal_col = NIL;
	    SubLObject pred = NIL;
	    SubLObject other_col = NIL;
	    destructuring_bind_must_consp(semx, semx, $list190);
	    func = semx.first();
	    SubLObject current = semx.rest();
	    destructuring_bind_must_consp(current, semx, $list190);
	    focal_col = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, semx, $list190);
	    pred = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, semx, $list190);
	    other_col = current.first();
	    current = current.rest();
	    if (NIL == current) {
		if (NIL != isa.isa_in_any_mtP(func, $const191$SubcollectionRelationFunction_Ins)) {
		    final SubLObject inst_level_pred = rbp_get_cognate_from_type_level_arg(pred);
		    final SubLObject type_level_func = rbp_get_cognate_from_instance_level_arg(func);
		    if (NIL != inst_level_pred) {
			return list(type_level_func, focal_col, inst_level_pred, other_col);
		    }
		} else {
		    final SubLObject type_level_pred = rbp_get_cognate_from_instance_level_arg(pred);
		    final SubLObject inst_level_func = rbp_get_cognate_from_type_level_arg(func);
		    if (NIL != type_level_pred) {
			return list(inst_level_func, focal_col, type_level_pred, other_col);
		    }
		}
	    } else {
		cdestructuring_bind_error(semx, $list190);
	    }
	}
	return NIL;
    }

    public static final SubLObject ncp_ask_variable_alt(SubLObject var, SubLObject sentence, SubLObject mt, SubLObject backchain) {
	if (backchain == UNPROVIDED) {
	    backchain = ZERO_INTEGER;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject query_properties = list($PROBLEM_STORE, $ncp_problem_store$.getDynamicValue(thread), $MAX_TRANSFORMATION_DEPTH, backchain);
		return ask_utilities.query_variable(var, sentence, mt, query_properties);
	    }
	}
    }

    public static SubLObject ncp_ask_variable(final SubLObject var, final SubLObject sentence, final SubLObject mt, SubLObject backchain) {
	if (backchain == UNPROVIDED) {
	    backchain = ZERO_INTEGER;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject query_properties = list($PROBLEM_STORE, $ncp_problem_store$.getDynamicValue(thread), $MAX_TRANSFORMATION_DEPTH, backchain);
	return ask_utilities.query_variable(var, sentence, mt, query_properties);
    }

    public static final SubLObject rbp_subcol_naut_fails_inter_arg_checksP_alt(SubLObject quasi_gaf, SubLObject from_arg, SubLObject to_arg, SubLObject mt, SubLObject type_level_predP) {
	if (mt == UNPROVIDED) {
	    mt = rbp_domain_mt();
	}
	if (type_level_predP == UNPROVIDED) {
	    type_level_predP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject failure_message = NIL;
		SubLObject pred = cycl_utilities.formula_arg0(quasi_gaf);
		SubLObject to_term = cycl_utilities.formula_arg(quasi_gaf, to_arg, UNPROVIDED);
		SubLObject from_term = cycl_utilities.formula_arg(quasi_gaf, from_arg, UNPROVIDED);
		if (NIL != $rbp_use_inter_arg_isa_filtersP$.getDynamicValue(thread)) {
		    if (NIL == failure_message) {
			{
			    SubLObject csome_list_var = rbp_get_dep_cols(from_arg, to_arg, pred, from_term, mt);
			    SubLObject dep_col = NIL;
			    for (dep_col = csome_list_var.first(); !((NIL != failure_message) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {
				failure_message = rbp_subcol_naut_do_inter_arg_test($ISA, to_term, narts_high.nart_substitute(dep_col), mt, type_level_predP);
			    }
			}
		    }
		    if (NIL == failure_message) {
			{
			    SubLObject csome_list_var = rbp_get_dep_cols(to_arg, from_arg, pred, to_term, mt);
			    SubLObject dep_col = NIL;
			    for (dep_col = csome_list_var.first(); !((NIL != failure_message) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {
				failure_message = rbp_subcol_naut_do_inter_arg_test($ISA, from_term, narts_high.nart_substitute(dep_col), mt, type_level_predP);
			    }
			}
		    }
		}
		if (NIL != $rbp_use_inter_arg_not_isa_filtersP$.getDynamicValue(thread)) {
		    if (!pred.eql($$geopoliticalSubdivision)) {
			if (NIL != indexed_term_p(from_term)) {
			    if (NIL == failure_message) {
				{
				    SubLObject csome_list_var = ncp_ask_variable($sym201$_COL, listS($$interArgNotIsa, pred, from_arg, from_term, to_arg, $list_alt203), mt, ONE_INTEGER);
				    SubLObject dep_col = NIL;
				    for (dep_col = csome_list_var.first(); !((NIL != failure_message) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {
					failure_message = rbp_subcol_naut_do_inter_arg_test($NOT_ISA, to_term, narts_high.nart_substitute(dep_col), mt, type_level_predP);
				    }
				}
			    }
			} else {
			    if (NIL != indexed_term_p(to_term)) {
				if (NIL == failure_message) {
				    {
					SubLObject csome_list_var = ncp_ask_variable($sym201$_COL, listS($$interArgNotIsa, pred, to_arg, to_term, from_arg, $list_alt203), mt, ONE_INTEGER);
					SubLObject dep_col = NIL;
					for (dep_col = csome_list_var.first(); !((NIL != failure_message) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {
					    failure_message = rbp_subcol_naut_do_inter_arg_test($NOT_ISA, from_term, narts_high.nart_substitute(dep_col), mt, type_level_predP);
					}
				    }
				}
			    }
			}
		    }
		}
		if (NIL != failure_message) {
		    Errors.warn(failure_message);
		}
		return failure_message;
	    }
	}
    }

    public static SubLObject rbp_subcol_naut_fails_inter_arg_checksP(final SubLObject quasi_gaf, final SubLObject from_arg, final SubLObject to_arg, SubLObject mt, SubLObject type_level_predP) {
	if (mt == UNPROVIDED) {
	    mt = rbp_domain_mt();
	}
	if (type_level_predP == UNPROVIDED) {
	    type_level_predP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject failure_message = NIL;
	final SubLObject pred = cycl_utilities.formula_arg0(quasi_gaf);
	final SubLObject to_term = cycl_utilities.formula_arg(quasi_gaf, to_arg, UNPROVIDED);
	final SubLObject from_term = cycl_utilities.formula_arg(quasi_gaf, from_arg, UNPROVIDED);
	if (NIL != $rbp_use_inter_arg_isa_filtersP$.getDynamicValue(thread)) {
	    if (NIL == failure_message) {
		SubLObject csome_list_var;
		SubLObject dep_col;
		for (csome_list_var = rbp_get_dep_cols(from_arg, to_arg, pred, from_term, mt), dep_col = NIL, dep_col = csome_list_var.first(); (NIL == failure_message)
			&& (NIL != csome_list_var); failure_message = rbp_subcol_naut_do_inter_arg_test($ISA, to_term, narts_high.nart_substitute(dep_col), mt, type_level_predP), csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {
		}
	    }
	    if (NIL == failure_message) {
		SubLObject csome_list_var;
		SubLObject dep_col;
		for (csome_list_var = rbp_get_dep_cols(to_arg, from_arg, pred, to_term, mt), dep_col = NIL, dep_col = csome_list_var.first(); (NIL == failure_message)
			&& (NIL != csome_list_var); failure_message = rbp_subcol_naut_do_inter_arg_test($ISA, from_term, narts_high.nart_substitute(dep_col), mt, type_level_predP), csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {
		}
	    }
	}
	if ((NIL != $rbp_use_inter_arg_not_isa_filtersP$.getDynamicValue(thread)) && (!pred.eql($$geopoliticalSubdivision))) {
	    if (NIL != indexed_term_p(from_term)) {
		if (NIL == failure_message) {
		    SubLObject csome_list_var;
		    SubLObject dep_col;
		    for (csome_list_var = ncp_ask_variable($sym197$_COL, listS($$interArgNotIsa, pred, from_arg, from_term, to_arg, $list199), mt, ONE_INTEGER), dep_col = NIL, dep_col = csome_list_var.first(); (NIL == failure_message)
			    && (NIL != csome_list_var); failure_message = rbp_subcol_naut_do_inter_arg_test($NOT_ISA, to_term, narts_high.nart_substitute(dep_col), mt, type_level_predP), csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {
		    }
		}
	    } else if ((NIL != indexed_term_p(to_term)) && (NIL == failure_message)) {
		SubLObject csome_list_var;
		SubLObject dep_col;
		for (csome_list_var = ncp_ask_variable($sym197$_COL, listS($$interArgNotIsa, pred, to_arg, to_term, from_arg, $list199), mt, ONE_INTEGER), dep_col = NIL, dep_col = csome_list_var.first(); (NIL == failure_message)
			&& (NIL != csome_list_var); failure_message = rbp_subcol_naut_do_inter_arg_test($NOT_ISA, from_term, narts_high.nart_substitute(dep_col), mt, type_level_predP), csome_list_var = csome_list_var.rest(), dep_col = csome_list_var.first()) {
		}
	    }

	}
	if (NIL != failure_message) {
	    Errors.warn(failure_message);
	}
	return failure_message;
    }

    public static final SubLObject rbp_get_dep_cols_alt(SubLObject ind_arg, SubLObject dep_arg, SubLObject pred, SubLObject ind_term, SubLObject mt) {
	return ncp_ask_variable($sym201$_COL, listS($$interArgIsa, pred, ind_arg, ind_term, dep_arg, $list_alt203), mt, ONE_INTEGER);
    }

    public static SubLObject rbp_get_dep_cols(final SubLObject ind_arg, final SubLObject dep_arg, final SubLObject pred, final SubLObject ind_term, final SubLObject mt) {
	return ncp_ask_variable($sym197$_COL, listS($$interArgIsa, pred, ind_arg, ind_term, dep_arg, $list199), mt, ONE_INTEGER);
    }

    public static final SubLObject rbp_subcol_naut_do_inter_arg_test_alt(SubLObject test_type, SubLObject v_term, SubLObject dep_col, SubLObject mt, SubLObject type_level_predP) {
	{
	    SubLObject failure_message = NIL;
	    SubLObject pcase_var = test_type;
	    if (pcase_var.eql($ISA)) {
		if ((NIL != type_level_predP) && (NIL == rbp_wff.npp_isaP(v_term, dep_col, mt))) {
		    failure_message = format(NIL, $str_alt205$____but__A_has_to_be_an_instance_, new SubLObject[] { v_term, dep_col, mt });
		} else {
		    if ((NIL == type_level_predP) && (NIL == rbp_wff.npp_not_disjointP(v_term, dep_col, mt))) {
			failure_message = format(NIL, $str_alt206$____but__A_has_to_intersect__A_in, new SubLObject[] { v_term, dep_col, mt });
		    }
		}
	    } else {
		if (pcase_var.eql($NOT_ISA)) {
		    if ((NIL != type_level_predP) && (NIL != rbp_wff.npp_isaP(v_term, dep_col, mt))) {
			failure_message = format(NIL, $str_alt207$____but__A_can_t_be_an_instance_o, new SubLObject[] { v_term, dep_col, mt });
		    } else {
			if ((NIL == type_level_predP) && (NIL != rbp_wff.npp_genlP(v_term, dep_col, mt))) {
			    failure_message = format(NIL, $str_alt208$____but__A_can_t_be_a_spec_of__A_, new SubLObject[] { v_term, dep_col, mt });
			}
		    }
		}
	    }
	    return failure_message;
	}
    }

    public static SubLObject rbp_subcol_naut_do_inter_arg_test(final SubLObject test_type, final SubLObject v_term, final SubLObject dep_col, final SubLObject mt, final SubLObject type_level_predP) {
	SubLObject failure_message = NIL;
	if (test_type.eql($ISA)) {
	    if ((NIL != type_level_predP) && (NIL == rbp_wff.npp_isaP(v_term, dep_col, mt))) {
		failure_message = format(NIL, $str201$____but__A_has_to_be_an_instance_, new SubLObject[] { v_term, dep_col, mt });
	    } else if ((NIL == type_level_predP) && (NIL == rbp_wff.npp_not_disjointP(v_term, dep_col, mt))) {
		failure_message = format(NIL, $str202$____but__A_has_to_intersect__A_in, new SubLObject[] { v_term, dep_col, mt });
	    }

	} else if (test_type.eql($NOT_ISA)) {
	    if ((NIL != type_level_predP) && (NIL != rbp_wff.npp_isaP(v_term, dep_col, mt))) {
		failure_message = format(NIL, $str203$____but__A_can_t_be_an_instance_o, new SubLObject[] { v_term, dep_col, mt });
	    } else if ((NIL == type_level_predP) && (NIL != rbp_wff.npp_genlP(v_term, dep_col, mt))) {
		failure_message = format(NIL, $str204$____but__A_can_t_be_a_spec_of__A_, new SubLObject[] { v_term, dep_col, mt });
	    }

	}

	return failure_message;
    }

    public static final SubLObject rbp_inter_arg_isa_pred_alt(SubLObject from_arg, SubLObject to_arg) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject pred = constants_high.find_constant(format(NIL, $str_alt209$interArgIsa_D__D, from_arg, to_arg));
		if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		    if (NIL == valid_constant(pred, UNPROVIDED)) {
			Errors.error($str_alt210$Couldn_t_find_inter_arg_isa_predi, from_arg, to_arg);
		    }
		}
		return pred;
	    }
	}
    }

    public static SubLObject rbp_inter_arg_isa_pred(final SubLObject from_arg, final SubLObject to_arg) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject pred = constants_high.find_constant(format(NIL, $str205$interArgIsa_D__D, from_arg, to_arg));
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == valid_constant(pred, UNPROVIDED))) {
	    Errors.error($str206$Couldn_t_find_inter_arg_isa_predi, from_arg, to_arg);
	}
	return pred;
    }

    public static final SubLObject rbp_inter_arg_not_isa_pred_alt(SubLObject one_arg, SubLObject other_arg) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject pred = constants_high.find_constant(format(NIL, $str_alt211$interArgNotIsa_D__D, one_arg, other_arg));
		if (NIL == valid_constant(pred, UNPROVIDED)) {
		    pred = constants_high.find_constant(format(NIL, $str_alt211$interArgNotIsa_D__D, other_arg, one_arg));
		}
		if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		    if (NIL == valid_constant(pred, UNPROVIDED)) {
			Errors.error($str_alt212$Couldn_t_find_inter_arg_not_isa_p, one_arg, other_arg);
		    }
		}
		return pred;
	    }
	}
    }

    public static SubLObject rbp_inter_arg_not_isa_pred(final SubLObject one_arg, final SubLObject other_arg) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject pred = constants_high.find_constant(format(NIL, $str207$interArgNotIsa_D__D, one_arg, other_arg));
	if (NIL == valid_constant(pred, UNPROVIDED)) {
	    pred = constants_high.find_constant(format(NIL, $str207$interArgNotIsa_D__D, other_arg, one_arg));
	}
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == valid_constant(pred, UNPROVIDED))) {
	    Errors.error($str208$Couldn_t_find_inter_arg_not_isa_p, one_arg, other_arg);
	}
	return pred;
    }

    public static final SubLObject rbp_binary_gaf_fails_inter_arg_checksP_alt(SubLObject gaf, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = rbp_domain_mt();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject diag = NIL;
		SubLObject datum = gaf;
		SubLObject current = datum;
		SubLObject semx_pred = NIL;
		SubLObject arg1 = NIL;
		SubLObject arg2 = NIL;
		destructuring_bind_must_consp(current, datum, $list_alt213);
		semx_pred = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt213);
		arg1 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt213);
		arg2 = current.first();
		current = current.rest();
		if (NIL == current) {
		    {
			SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
			{
			    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			    try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				{
				    SubLObject pred_var = $$interArgIsa1_2;
				    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(semx_pred, ONE_INTEGER, pred_var)) {
					{
					    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(semx_pred, ONE_INTEGER, pred_var);
					    SubLObject done_var = diag;
					    SubLObject token_var = NIL;
					    while (NIL == done_var) {
						{
						    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
						    SubLObject valid = makeBoolean(token_var != final_index_spec);
						    if (NIL != valid) {
							{
							    SubLObject final_index_iterator = NIL;
							    try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
								{
								    SubLObject done_var_27 = diag;
								    SubLObject token_var_28 = NIL;
								    while (NIL == done_var_27) {
									{
									    SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_28);
									    SubLObject valid_29 = makeBoolean(token_var_28 != ia_gaf);
									    if (NIL != valid_29) {
										if ((NIL != isa.isaP(arg1, cycl_utilities.formula_arg2(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED)) && (NIL == isa.isaP(arg2, cycl_utilities.formula_arg3(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
										    diag = format(NIL, $str_alt215$___but_it_fails_the_inter_arg_con, ia_gaf);
										}
									    }
									    done_var_27 = makeBoolean((NIL == valid_29) || (NIL != diag));
									}
								    }
								}
							    } finally {
								{
								    SubLObject _prev_bind_0_30 = $is_thread_performing_cleanupP$.currentBinding(thread);
								    try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									if (NIL != final_index_iterator) {
									    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
								    } finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0_30, thread);
								    }
								}
							    }
							}
						    }
						    done_var = makeBoolean((NIL == valid) || (NIL != diag));
						}
					    }
					}
				    }
				}
				{
				    SubLObject pred_var = $$interArgIsa2_1;
				    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(semx_pred, ONE_INTEGER, pred_var)) {
					{
					    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(semx_pred, ONE_INTEGER, pred_var);
					    SubLObject done_var = diag;
					    SubLObject token_var = NIL;
					    while (NIL == done_var) {
						{
						    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
						    SubLObject valid = makeBoolean(token_var != final_index_spec);
						    if (NIL != valid) {
							{
							    SubLObject final_index_iterator = NIL;
							    try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
								{
								    SubLObject done_var_31 = diag;
								    SubLObject token_var_32 = NIL;
								    while (NIL == done_var_31) {
									{
									    SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_32);
									    SubLObject valid_33 = makeBoolean(token_var_32 != ia_gaf);
									    if (NIL != valid_33) {
										if ((NIL != isa.isaP(arg2, cycl_utilities.formula_arg2(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED)) && (NIL == isa.isaP(arg1, cycl_utilities.formula_arg3(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
										    diag = format(NIL, $str_alt215$___but_it_fails_the_inter_arg_con, ia_gaf);
										}
									    }
									    done_var_31 = makeBoolean((NIL == valid_33) || (NIL != diag));
									}
								    }
								}
							    } finally {
								{
								    SubLObject _prev_bind_0_34 = $is_thread_performing_cleanupP$.currentBinding(thread);
								    try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									if (NIL != final_index_iterator) {
									    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
								    } finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0_34, thread);
								    }
								}
							    }
							}
						    }
						    done_var = makeBoolean((NIL == valid) || (NIL != diag));
						}
					    }
					}
				    }
				}
				if (!semx_pred.eql($$geopoliticalSubdivision)) {
				    {
					SubLObject pred_var = $$interArgNotIsa1_2;
					if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(semx_pred, ONE_INTEGER, pred_var)) {
					    {
						SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(semx_pred, ONE_INTEGER, pred_var);
						SubLObject done_var = diag;
						SubLObject token_var = NIL;
						while (NIL == done_var) {
						    {
							SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
							SubLObject valid = makeBoolean(token_var != final_index_spec);
							if (NIL != valid) {
							    {
								SubLObject final_index_iterator = NIL;
								try {
								    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
								    {
									SubLObject done_var_35 = diag;
									SubLObject token_var_36 = NIL;
									while (NIL == done_var_35) {
									    {
										SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_36);
										SubLObject valid_37 = makeBoolean(token_var_36 != ia_gaf);
										if (NIL != valid_37) {
										    if ((NIL != isa.isaP(arg1, cycl_utilities.formula_arg2(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED)) && (NIL != isa.isaP(arg2, cycl_utilities.formula_arg3(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
											diag = format(NIL, $str_alt215$___but_it_fails_the_inter_arg_con, ia_gaf);
										    }
										}
										done_var_35 = makeBoolean((NIL == valid_37) || (NIL != diag));
									    }
									}
								    }
								} finally {
								    {
									SubLObject _prev_bind_0_38 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
									    $is_thread_performing_cleanupP$.bind(T, thread);
									    if (NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									    }
									} finally {
									    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_38, thread);
									}
								    }
								}
							    }
							}
							done_var = makeBoolean((NIL == valid) || (NIL != diag));
						    }
						}
					    }
					}
				    }
				}
			    } finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		} else {
		    cdestructuring_bind_error(datum, $list_alt213);
		}
		return diag;
	    }
	}
    }

    public static SubLObject rbp_binary_gaf_fails_inter_arg_checksP(final SubLObject gaf, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = rbp_domain_mt();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject diag = NIL;
	SubLObject semx_pred = NIL;
	SubLObject arg1 = NIL;
	SubLObject arg2 = NIL;
	destructuring_bind_must_consp(gaf, gaf, $list209);
	semx_pred = gaf.first();
	SubLObject current = gaf.rest();
	destructuring_bind_must_consp(current, gaf, $list209);
	arg1 = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, gaf, $list209);
	arg2 = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
	    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
	    try {
		mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
		mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
		mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
		SubLObject pred_var = $$interArgIsa1_2;
		if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(semx_pred, ONE_INTEGER, pred_var)) {
		    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(semx_pred, ONE_INTEGER, pred_var);
		    SubLObject done_var = diag;
		    final SubLObject token_var = NIL;
		    while (NIL == done_var) {
			final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
			final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
			if (NIL != valid) {
			    SubLObject final_index_iterator = NIL;
			    try {
				final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
				SubLObject done_var_$27 = diag;
				final SubLObject token_var_$28 = NIL;
				while (NIL == done_var_$27) {
				    final SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$28);
				    final SubLObject valid_$29 = makeBoolean(!token_var_$28.eql(ia_gaf));
				    if (((NIL != valid_$29) && (NIL != isa.isaP(arg1, cycl_utilities.formula_arg2(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED))) && (NIL == isa.isaP(arg2, cycl_utilities.formula_arg3(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
					diag = format(NIL, $str211$___but_it_fails_the_inter_arg_con, ia_gaf);
				    }
				    done_var_$27 = makeBoolean((NIL == valid_$29) || (NIL != diag));
				}
			    } finally {
				final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
				    $is_thread_performing_cleanupP$.bind(T, thread);
				    final SubLObject _values = getValuesAsVector();
				    if (NIL != final_index_iterator) {
					kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
				    }
				    restoreValuesFromVector(_values);
				} finally {
				    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
				}
			    }
			}
			done_var = makeBoolean((NIL == valid) || (NIL != diag));
		    }
		}
		pred_var = $$interArgIsa2_1;
		if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(semx_pred, ONE_INTEGER, pred_var)) {
		    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(semx_pred, ONE_INTEGER, pred_var);
		    SubLObject done_var = diag;
		    final SubLObject token_var = NIL;
		    while (NIL == done_var) {
			final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
			final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
			if (NIL != valid) {
			    SubLObject final_index_iterator = NIL;
			    try {
				final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
				SubLObject done_var_$28 = diag;
				final SubLObject token_var_$29 = NIL;
				while (NIL == done_var_$28) {
				    final SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
				    final SubLObject valid_$30 = makeBoolean(!token_var_$29.eql(ia_gaf));
				    if (((NIL != valid_$30) && (NIL != isa.isaP(arg2, cycl_utilities.formula_arg2(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED))) && (NIL == isa.isaP(arg1, cycl_utilities.formula_arg3(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
					diag = format(NIL, $str211$___but_it_fails_the_inter_arg_con, ia_gaf);
				    }
				    done_var_$28 = makeBoolean((NIL == valid_$30) || (NIL != diag));
				}
			    } finally {
				final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
				    $is_thread_performing_cleanupP$.bind(T, thread);
				    final SubLObject _values2 = getValuesAsVector();
				    if (NIL != final_index_iterator) {
					kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
				    }
				    restoreValuesFromVector(_values2);
				} finally {
				    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
				}
			    }
			}
			done_var = makeBoolean((NIL == valid) || (NIL != diag));
		    }
		}
		if (!semx_pred.eql($$geopoliticalSubdivision)) {
		    pred_var = $$interArgNotIsa1_2;
		    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(semx_pred, ONE_INTEGER, pred_var)) {
			final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(semx_pred, ONE_INTEGER, pred_var);
			SubLObject done_var = diag;
			final SubLObject token_var = NIL;
			while (NIL == done_var) {
			    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
			    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
			    if (NIL != valid) {
				SubLObject final_index_iterator = NIL;
				try {
				    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
				    SubLObject done_var_$29 = diag;
				    final SubLObject token_var_$30 = NIL;
				    while (NIL == done_var_$29) {
					final SubLObject ia_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$30);
					final SubLObject valid_$31 = makeBoolean(!token_var_$30.eql(ia_gaf));
					if (((NIL != valid_$31) && (NIL != isa.isaP(arg1, cycl_utilities.formula_arg2(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED))) && (NIL != isa.isaP(arg2, cycl_utilities.formula_arg3(ia_gaf, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
					    diag = format(NIL, $str211$___but_it_fails_the_inter_arg_con, ia_gaf);
					}
					done_var_$29 = makeBoolean((NIL == valid_$31) || (NIL != diag));
				    }
				} finally {
				    final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
				    try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values3 = getValuesAsVector();
					if (NIL != final_index_iterator) {
					    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
					}
					restoreValuesFromVector(_values3);
				    } finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
				    }
				}
			    }
			    done_var = makeBoolean((NIL == valid) || (NIL != diag));
			}
		    }
		}
	    } finally {
		mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
		mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
		mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
	    }
	} else {
	    cdestructuring_bind_error(gaf, $list209);
	}
	return diag;
    }

    /**
     *
     *
     * @param RBP
     * 		RULE ID ; presently ignored
     * @param SEMX
     * 		; to be checked
     * @param SKIP-COGNATE?
     * 		; optional, do type-cognate checking if nil
     * @return TRUE iff the semx violate the wff tests contained herein (or if the cognate does, if applicable)
     * @unknown probably some or all of these tests really belong in @see rbp-wff.lisp
     */
    @LispMethod(comment = "@param RBP\r\n\t\tRULE ID ; presently ignored\r\n@param SEMX\r\n\t\t; to be checked\r\n@param SKIP-COGNATE?\r\n\t\t; optional, do type-cognate checking if nil\r\n@return TRUE iff the semx violate the wff tests contained herein (or if the cognate does, if applicable)\r\n@unknown probably some or all of these tests really belong in @see rbp-wff.lisp")
    public static final SubLObject rbp_fails_wff_workaroundsP_alt(SubLObject rule, SubLObject semx, SubLObject skip_cognateP) {
	if (skip_cognateP == UNPROVIDED) {
	    skip_cognateP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject verboseP = makeBoolean((NIL != subl_promotions.memberP(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) || (NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread)));
		SubLObject wff_domain = rbp_domain_mt();
		if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(semx)) {
		    {
			SubLObject datum = semx;
			SubLObject current = datum;
			SubLObject func = NIL;
			SubLObject col1 = NIL;
			SubLObject semx_pred = NIL;
			SubLObject col2 = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt218);
			func = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt218);
			col1 = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt218);
			semx_pred = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt218);
			col2 = current.first();
			current = current.rest();
			if (NIL == current) {
			    {
				SubLObject focal_arg = (NIL != isa.isaP(func, $const219$SubcollectionRelationFunction_Can, $$UniversalVocabularyMt, UNPROVIDED)) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
				SubLObject focal_col = narts_high.nart_substitute(focal_arg.numE(ONE_INTEGER) ? ((SubLObject) (col1)) : col2);
				SubLObject other_col = narts_high.nart_substitute(focal_arg.numE(ONE_INTEGER) ? ((SubLObject) (col2)) : col1);
				SubLObject diag = rbp_subcol_naut_fails_inter_arg_checksP(list(semx_pred, focal_col, other_col), ONE_INTEGER, TWO_INTEGER, wff_domain, isa.isa_in_any_mtP(func, $const195$SubcollectionRelationFunction_Ins));
				if (NIL != diag) {
				    if (NIL != verboseP) {
					format(T, $str_alt221$_A__, diag);
				    }
				    return T;
				}
				if ((NIL != forts.fort_p(semx_pred)) && (NIL != rbp_wff.npp_genl_predP(semx_pred, $$groupMembers))) {
				    {
					SubLObject badP = NIL;
					SubLObject focal_possibly_fort = narts_high.nart_substitute(focal_col);
					if (NIL != forts.fort_p(focal_possibly_fort)) {
					    {
						SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(wff_domain);
						{
						    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
						    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
						    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
						    try {
							mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
							mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
							mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
							{
							    SubLObject cdolist_list_var = genls.asserted_genls(focal_possibly_fort, UNPROVIDED);
							    SubLObject genl = NIL;
							    for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), genl = cdolist_list_var.first()) {
								if (cycl_utilities.formula_arg0(genl).eql($$GroupFn) || cycl_utilities.formula_arg0(genl).eql($$GroupOfCardinalityFn)) {
								    if (NIL == genls.genlP(other_col, cycl_utilities.formula_arg1(genl, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
									if (NIL != verboseP) {
									    format(T, $str_alt225$___but_it_failed_the_groupMembers, new SubLObject[] { focal_possibly_fort, cycl_utilities.formula_arg1(genl, UNPROVIDED), other_col });
									}
									badP = T;
								    }
								}
							    }
							}
						    } finally {
							mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
							mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
							mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
						    }
						}
					    }
					}
					if (NIL != badP) {
					    return T;
					}
				    }
				}
				if (NIL == skip_cognateP) {
				    return rbp_fails_wff_workaroundsP(rule, rbp_semx_type_level_cognate(semx), T);
				}
			    }
			} else {
			    cdestructuring_bind_error(datum, $list_alt218);
			}
		    }
		}
		if (NIL != el_binary_formula_p(semx)) {
		    {
			SubLObject datum = semx;
			SubLObject current = datum;
			SubLObject semx_pred = NIL;
			SubLObject arg1 = NIL;
			SubLObject arg2 = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt213);
			semx_pred = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt213);
			arg1 = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt213);
			arg2 = current.first();
			current = current.rest();
			if (NIL == current) {
			    if (NIL != isa.isa_in_any_mtP(semx_pred, $$Predicate)) {
				{
				    SubLObject diag = rbp_binary_gaf_fails_inter_arg_checksP(semx, wff_domain);
				    if (NIL != diag) {
					if (NIL != verboseP) {
					    format(T, $str_alt221$_A__, diag);
					}
					return T;
				    }
				}
			    }
			    if ((NIL != rbp_wff.npp_genl_predP(semx_pred, $$cityInState)) && cycl_utilities.formula_arg0(narts_high.nart_expand(arg1)).eql($$CityNamedFn)) {
				if (!cycl_utilities.formula_arg2(narts_high.nart_expand(arg1), UNPROVIDED).eql(arg2)) {
				    if (NIL != verboseP) {
					format(T, $str_alt227$___but_the___CityNamedFn_arg2_doe, cycl_utilities.formula_arg2(narts_high.nart_expand(arg1), UNPROVIDED), arg2);
				    }
				    return T;
				}
			    }
			    if (NIL != isa.isa_in_any_mtP(semx_pred, $$StrictlyFunctionalSlot)) {
				{
				    SubLObject badP = NIL;
				    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(wff_domain);
				    {
					SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
					    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
					    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
					    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
					    {
						SubLObject _prev_bind_0_39 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
						SubLObject _prev_bind_1_40 = pred_relevance_macros.$pred$.currentBinding(thread);
						try {
						    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
						    pred_relevance_macros.$pred$.bind(semx_pred, thread);
						    {
							SubLObject pred_var = NIL;
							if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg1, ONE_INTEGER, pred_var)) {
							    {
								SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg1, ONE_INTEGER, pred_var);
								SubLObject done_var = badP;
								SubLObject token_var = NIL;
								while (NIL == done_var) {
								    {
									SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
									SubLObject valid = makeBoolean(token_var != final_index_spec);
									if (NIL != valid) {
									    {
										SubLObject final_index_iterator = NIL;
										try {
										    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
										    {
											SubLObject done_var_41 = badP;
											SubLObject token_var_42 = NIL;
											while (NIL == done_var_41) {
											    {
												SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_42);
												SubLObject valid_43 = makeBoolean(token_var_42 != assertion);
												if (NIL != valid_43) {
												    {
													SubLObject should_be = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
													if (!should_be.equal(arg2)) {
													    if (NIL != verboseP) {
														format(T, $str_alt230$___but_it_failed_the_strictly_fun, new SubLObject[] { semx_pred, arg1, should_be });
													    }
													    badP = T;
													}
												    }
												}
												done_var_41 = makeBoolean((NIL == valid_43) || (NIL != badP));
											    }
											}
										    }
										} finally {
										    {
											SubLObject _prev_bind_0_44 = $is_thread_performing_cleanupP$.currentBinding(thread);
											try {
											    $is_thread_performing_cleanupP$.bind(T, thread);
											    if (NIL != final_index_iterator) {
												kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
											    }
											} finally {
											    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_44, thread);
											}
										    }
										}
									    }
									}
									done_var = makeBoolean((NIL == valid) || (NIL != badP));
								    }
								}
							    }
							}
						    }
						} finally {
						    pred_relevance_macros.$pred$.rebind(_prev_bind_1_40, thread);
						    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_39, thread);
						}
					    }
					    if (NIL != kb_gp_mapping.dgaigp_binaryP(semx_pred)) {
						{
						    SubLObject _prev_bind_0_45 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
						    SubLObject _prev_bind_1_46 = pred_relevance_macros.$pred$.currentBinding(thread);
						    try {
							pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
							pred_relevance_macros.$pred$.bind(semx_pred, thread);
							{
							    SubLObject pred_var = NIL;
							    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg1, arity.binary_arg_swap(ONE_INTEGER), pred_var)) {
								{
								    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg1, arity.binary_arg_swap(ONE_INTEGER), pred_var);
								    SubLObject done_var = badP;
								    SubLObject token_var = NIL;
								    while (NIL == done_var) {
									{
									    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
									    SubLObject valid = makeBoolean(token_var != final_index_spec);
									    if (NIL != valid) {
										{
										    SubLObject final_index_iterator = NIL;
										    try {
											final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
											{
											    SubLObject done_var_47 = badP;
											    SubLObject token_var_48 = NIL;
											    while (NIL == done_var_47) {
												{
												    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_48);
												    SubLObject valid_49 = makeBoolean(token_var_48 != assertion);
												    if (NIL != valid_49) {
													{
													    SubLObject _prev_bind_0_50 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
													    try {
														kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
														{
														    SubLObject should_be = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
														    if (!should_be.equal(arg2)) {
															if (NIL != verboseP) {
															    format(T, $str_alt230$___but_it_failed_the_strictly_fun, new SubLObject[] { semx_pred, arg1, should_be });
															}
															badP = T;
														    }
														}
													    } finally {
														kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_50, thread);
													    }
													}
												    }
												    done_var_47 = makeBoolean((NIL == valid_49) || (NIL != badP));
												}
											    }
											}
										    } finally {
											{
											    SubLObject _prev_bind_0_51 = $is_thread_performing_cleanupP$.currentBinding(thread);
											    try {
												$is_thread_performing_cleanupP$.bind(T, thread);
												if (NIL != final_index_iterator) {
												    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
												}
											    } finally {
												$is_thread_performing_cleanupP$.rebind(_prev_bind_0_51, thread);
											    }
											}
										    }
										}
									    }
									    done_var = makeBoolean((NIL == valid) || (NIL != badP));
									}
								    }
								}
							    }
							}
						    } finally {
							pred_relevance_macros.$pred$.rebind(_prev_bind_1_46, thread);
							pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_45, thread);
						    }
						}
					    }
					} finally {
					    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
					    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
					    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
					}
				    }
				    if (NIL != badP) {
					return T;
				    }
				}
			    }
			} else {
			    cdestructuring_bind_error(datum, $list_alt213);
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    /**
     *
     *
     * @param RBP
     * 		RULE ID ; presently ignored
     * @param SEMX
     * 		; to be checked
     * @param SKIP-COGNATE?
     * 		; optional, do type-cognate checking if nil
     * @return TRUE iff the semx violate the wff tests contained herein (or if the cognate does, if applicable)
     * @unknown probably some or all of these tests really belong in @see rbp-wff.lisp
     */
    @LispMethod(comment = "@param RBP\r\n\t\tRULE ID ; presently ignored\r\n@param SEMX\r\n\t\t; to be checked\r\n@param SKIP-COGNATE?\r\n\t\t; optional, do type-cognate checking if nil\r\n@return TRUE iff the semx violate the wff tests contained herein (or if the cognate does, if applicable)\r\n@unknown probably some or all of these tests really belong in @see rbp-wff.lisp")
    public static SubLObject rbp_fails_wff_workaroundsP(final SubLObject rule, final SubLObject semx, SubLObject skip_cognateP) {
	if (skip_cognateP == UNPROVIDED) {
	    skip_cognateP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject verboseP = makeBoolean((NIL != subl_promotions.memberP(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) || (NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread)));
	final SubLObject wff_domain = rbp_domain_mt();
	if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(semx)) {
	    SubLObject func = NIL;
	    SubLObject col1 = NIL;
	    SubLObject semx_pred = NIL;
	    SubLObject col2 = NIL;
	    destructuring_bind_must_consp(semx, semx, $list214);
	    func = semx.first();
	    SubLObject current = semx.rest();
	    destructuring_bind_must_consp(current, semx, $list214);
	    col1 = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, semx, $list214);
	    semx_pred = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, semx, $list214);
	    col2 = current.first();
	    current = current.rest();
	    if (NIL == current) {
		final SubLObject focal_arg = (NIL != isa.isaP(func, $const215$SubcollectionRelationFunction_Can, $$UniversalVocabularyMt, UNPROVIDED)) ? ONE_INTEGER : TWO_INTEGER;
		final SubLObject focal_col = narts_high.nart_substitute(focal_arg.numE(ONE_INTEGER) ? col1 : col2);
		final SubLObject other_col = narts_high.nart_substitute(focal_arg.numE(ONE_INTEGER) ? col2 : col1);
		final SubLObject diag = rbp_subcol_naut_fails_inter_arg_checksP(list(semx_pred, focal_col, other_col), ONE_INTEGER, TWO_INTEGER, wff_domain, isa.isa_in_any_mtP(func, $const191$SubcollectionRelationFunction_Ins));
		if (NIL != diag) {
		    if (NIL != verboseP) {
			format(T, $str217$_A__, diag);
		    }
		    return T;
		}
		if ((NIL != forts.fort_p(semx_pred)) && (NIL != rbp_wff.npp_genl_predP(semx_pred, $$groupMembers))) {
		    SubLObject badP = NIL;
		    final SubLObject focal_possibly_fort = narts_high.nart_substitute(focal_col);
		    if (NIL != forts.fort_p(focal_possibly_fort)) {
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(wff_domain);
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
			    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			    SubLObject cdolist_list_var = genls.asserted_genls(focal_possibly_fort, UNPROVIDED);
			    SubLObject genl = NIL;
			    genl = cdolist_list_var.first();
			    while (NIL != cdolist_list_var) {
				if ((cycl_utilities.formula_arg0(genl).eql($$GroupFn) || cycl_utilities.formula_arg0(genl).eql($$GroupOfCardinalityFn)) && (NIL == genls.genlP(other_col, cycl_utilities.formula_arg1(genl, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
				    if (NIL != verboseP) {
					format(T, $str221$___but_it_failed_the_groupMembers, new SubLObject[] { focal_possibly_fort, cycl_utilities.formula_arg1(genl, UNPROVIDED), other_col });
				    }
				    badP = T;
				}
				cdolist_list_var = cdolist_list_var.rest();
				genl = cdolist_list_var.first();
			    }
			} finally {
			    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
		    }
		    if (NIL != badP) {
			return T;
		    }
		}
		if (NIL == skip_cognateP) {
		    return rbp_fails_wff_workaroundsP(rule, rbp_semx_type_level_cognate(semx), T);
		}
	    } else {
		cdestructuring_bind_error(semx, $list214);
	    }
	}
	if (NIL != el_binary_formula_p(semx)) {
	    SubLObject semx_pred2 = NIL;
	    SubLObject arg1 = NIL;
	    SubLObject arg2 = NIL;
	    destructuring_bind_must_consp(semx, semx, $list209);
	    semx_pred2 = semx.first();
	    SubLObject current = semx.rest();
	    destructuring_bind_must_consp(current, semx, $list209);
	    arg1 = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, semx, $list209);
	    arg2 = current.first();
	    current = current.rest();
	    if (NIL == current) {
		if (NIL != isa.isa_in_any_mtP(semx_pred2, $$Predicate)) {
		    final SubLObject diag2 = rbp_binary_gaf_fails_inter_arg_checksP(semx, wff_domain);
		    if (NIL != diag2) {
			if (NIL != verboseP) {
			    format(T, $str217$_A__, diag2);
			}
			return T;
		    }
		}
		if (((NIL != rbp_wff.npp_genl_predP(semx_pred2, $$cityInState)) && cycl_utilities.formula_arg0(narts_high.nart_expand(arg1)).eql($$CityNamedFn)) && (!cycl_utilities.formula_arg2(narts_high.nart_expand(arg1), UNPROVIDED).eql(arg2))) {
		    if (NIL != verboseP) {
			format(T, $str223$___but_the___CityNamedFn_arg2_doe, cycl_utilities.formula_arg2(narts_high.nart_expand(arg1), UNPROVIDED), arg2);
		    }
		    return T;
		}
		if (NIL != isa.isa_in_any_mtP(semx_pred2, $$StrictlyFunctionalSlot)) {
		    SubLObject badP2 = NIL;
		    final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(wff_domain);
		    final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
		    final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		    try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
			final SubLObject _prev_bind_0_$39 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
			final SubLObject _prev_bind_1_$40 = pred_relevance_macros.$pred$.currentBinding(thread);
			try {
			    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
			    pred_relevance_macros.$pred$.bind(semx_pred2, thread);
			    final SubLObject pred_var = NIL;
			    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg1, ONE_INTEGER, pred_var)) {
				final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg1, ONE_INTEGER, pred_var);
				SubLObject done_var = badP2;
				final SubLObject token_var = NIL;
				while (NIL == done_var) {
				    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
				    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
				    if (NIL != valid) {
					SubLObject final_index_iterator = NIL;
					try {
					    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
					    SubLObject done_var_$41 = badP2;
					    final SubLObject token_var_$42 = NIL;
					    while (NIL == done_var_$41) {
						final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
						final SubLObject valid_$43 = makeBoolean(!token_var_$42.eql(assertion));
						if (NIL != valid_$43) {
						    final SubLObject should_be = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
						    if (!should_be.equal(arg2)) {
							if (NIL != verboseP) {
							    format(T, $str226$___but_it_failed_the_strictly_fun, new SubLObject[] { semx_pred2, arg1, should_be });
							}
							badP2 = T;
						    }
						}
						done_var_$41 = makeBoolean((NIL == valid_$43) || (NIL != badP2));
					    }
					} finally {
					    final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
					    try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						if (NIL != final_index_iterator) {
						    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
						}
						restoreValuesFromVector(_values);
					    } finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
					    }
					}
				    }
				    done_var = makeBoolean((NIL == valid) || (NIL != badP2));
				}
			    }
			} finally {
			    pred_relevance_macros.$pred$.rebind(_prev_bind_1_$40, thread);
			    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$39, thread);
			}
			if (NIL != kb_gp_mapping.dgaigp_binaryP(semx_pred2)) {
			    final SubLObject _prev_bind_0_$41 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
			    final SubLObject _prev_bind_1_$41 = pred_relevance_macros.$pred$.currentBinding(thread);
			    try {
				pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
				pred_relevance_macros.$pred$.bind(semx_pred2, thread);
				final SubLObject pred_var = NIL;
				if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg1, arity.binary_arg_swap(ONE_INTEGER), pred_var)) {
				    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg1, arity.binary_arg_swap(ONE_INTEGER), pred_var);
				    SubLObject done_var = badP2;
				    final SubLObject token_var = NIL;
				    while (NIL == done_var) {
					final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
					final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
					    SubLObject final_index_iterator = NIL;
					    try {
						final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
						SubLObject done_var_$42 = badP2;
						final SubLObject token_var_$43 = NIL;
						while (NIL == done_var_$42) {
						    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
						    final SubLObject valid_$44 = makeBoolean(!token_var_$43.eql(assertion));
						    if (NIL != valid_$44) {
							final SubLObject _prev_bind_0_$42 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
							try {
							    kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
							    final SubLObject should_be2 = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
							    if (!should_be2.equal(arg2)) {
								if (NIL != verboseP) {
								    format(T, $str226$___but_it_failed_the_strictly_fun, new SubLObject[] { semx_pred2, arg1, should_be2 });
								}
								badP2 = T;
							    }
							} finally {
							    kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$42, thread);
							}
						    }
						    done_var_$42 = makeBoolean((NIL == valid_$44) || (NIL != badP2));
						}
					    } finally {
						final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
						    $is_thread_performing_cleanupP$.bind(T, thread);
						    final SubLObject _values2 = getValuesAsVector();
						    if (NIL != final_index_iterator) {
							kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
						    }
						    restoreValuesFromVector(_values2);
						} finally {
						    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
						}
					    }
					}
					done_var = makeBoolean((NIL == valid) || (NIL != badP2));
				    }
				}
			    } finally {
				pred_relevance_macros.$pred$.rebind(_prev_bind_1_$41, thread);
				pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$41, thread);
			    }
			}
		    } finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_6, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
		    }
		    if (NIL != badP2) {
			return T;
		    }
		}
	    } else {
		cdestructuring_bind_error(semx, $list209);
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return LISTP; of parses for the semx of the combination of BLOCK1 and BLOCK2,
    where a parse is a list of the form (<rule> (<CycL>))
     */
    @LispMethod(comment = "@return LISTP; of parses for the semx of the combination of BLOCK1 and BLOCK2,\r\nwhere a parse is a list of the form (<rule> (<CycL>))")
    public static final SubLObject rbp_rb_combine_noun_compound_blocks_alt(SubLObject block1, SubLObject block2) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    rbp_rule_bank.rbp_rb_check_initialization();
	    if (NIL != rbp_traced_rules()) {
		format(T, $str_alt232$__Trying_this_block_pair_____S___, new SubLObject[] { nc_block_spanned_string(block1), nc_block_denot(block1), nc_block_head_string_pred(block1), nc_block_spanned_string(block2), nc_block_denot(block2), nc_block_head_string_pred(block2) });
	    }
	    {
		SubLObject successful_rules = rbp_rb_rules_matching_blocks(block1, block2);
		SubLObject ans = NIL;
		SubLObject cdolist_list_var = successful_rules;
		SubLObject rule = NIL;
		for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rule = cdolist_list_var.first()) {
		    if (NIL != rbp_rb_blocks_pass_inter_constraintsP(block1, block2, rule)) {
			{
			    SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl(rule);
			    SubLObject base_semx = rbp_rule_cycl_semx(rule_cycl, UNPROVIDED);
			    thread.resetMultipleValues();
			    {
				SubLObject semx = combine_blocks_with_template(block1, block2, base_semx, UNPROVIDED);
				SubLObject wff_result = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if ((NIL != subl_promotions.memberP(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) || (NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread))) {
				    format(T, $str_alt233$__Rule__S_yielded____a___for__S__, new SubLObject[] { rule, semx, nc_block_spanned_string(block1), nc_block_spanned_string(block2) });
				}
				if (wff_result != $WFF) {
				    if ((NIL != subl_promotions.memberP(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) || (NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread))) {
					format(T, $str_alt235$___but_it_failed_the_wff_checker_);
					{
					    SubLObject _prev_bind_0 = rbp_wff.$rbp_show_non_wffP$.currentBinding(thread);
					    try {
						rbp_wff.$rbp_show_non_wffP$.bind(T, thread);
						rbp_wff.rbp_wff_clear_caches();
						rbp_wff.rbp_wf_natP(semx, parsing_vars.$np_wff_filter_level$.getDynamicValue(thread));
					    } finally {
						rbp_wff.$rbp_show_non_wffP$.rebind(_prev_bind_0, thread);
					    }
					}
				    }
				} else {
				    if (parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ZERO_INTEGER) && (NIL != rbp_fails_wff_workaroundsP(rule, semx, UNPROVIDED))) {
				    } else {
					{
					    SubLObject formula_arg_fn_nautP = eql(cycl_utilities.formula_arg0(semx), $$FormulaArgFn);
					    while (NIL != formula_arg_fn_nautP) {
						{
						    SubLObject datum = cycl_utilities.formula_args(semx, UNPROVIDED);
						    SubLObject current = datum;
						    SubLObject just_this_arg = NIL;
						    SubLObject formula = NIL;
						    destructuring_bind_must_consp(current, datum, $list_alt237);
						    just_this_arg = current.first();
						    current = current.rest();
						    destructuring_bind_must_consp(current, datum, $list_alt237);
						    formula = current.first();
						    current = current.rest();
						    if (NIL == current) {
							if ((NIL != subl_promotions.positive_integer_p(just_this_arg)) && just_this_arg.numG(formula_arity(semx, UNPROVIDED))) {
							    if ((NIL != subl_promotions.memberP(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) || (NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread))) {
								format(T, $str_alt238$___but_the_desired_FormulaArgFn__, just_this_arg, formula_arity(semx, UNPROVIDED));
								wff_result = $NOT_WFF;
							    }
							}
							formula_arg_fn_nautP = eql(cycl_utilities.formula_arg0(formula), $$FormulaArgFn);
							if (NIL == formula_arg_fn_nautP) {
							    {
								SubLObject verifiedP = rbp_verify(formula, UNPROVIDED);
								if (NIL == verifiedP) {
								    wff_result = $NON_WFF;
								    if ((NIL != subl_promotions.memberP(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) || (NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread))) {
									format(T, $str_alt241$___but_I_was_unable_to_verify__S_, formula);
								    }
								}
							    }
							}
							semx = cycl_utilities.formula_arg(formula, just_this_arg, UNPROVIDED);
						    } else {
							cdestructuring_bind_error(datum, $list_alt237);
						    }
						}
					    }
					}
					if ($WFF == wff_result) {
					    ans = cons(list(rule, semx), ans);
					}
				    }
				}
			    }
			}
		    }
		}
		return ans;
	    }
	}
    }

    /**
     *
     *
     * @return LISTP; of parses for the semx of the combination of BLOCK1 and BLOCK2,
    where a parse is a list of the form (<rule> (<CycL>))
     */
    @LispMethod(comment = "@return LISTP; of parses for the semx of the combination of BLOCK1 and BLOCK2,\r\nwhere a parse is a list of the form (<rule> (<CycL>))")
    public static SubLObject rbp_rb_combine_noun_compound_blocks(final SubLObject block1, final SubLObject block2) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	rbp_rule_bank.rbp_rb_check_initialization();
	if (NIL != rbp_traced_rules()) {
	    format(T, $str228$__Trying_this_block_pair_____S___, new SubLObject[] { nc_block_spanned_string(block1), nc_block_denot(block1), nc_block_head_string_pred(block1), nc_block_spanned_string(block2), nc_block_denot(block2), nc_block_head_string_pred(block2) });
	}
	final SubLObject successful_rules = rbp_rb_rules_matching_blocks(block1, block2);
	SubLObject ans = NIL;
	SubLObject cdolist_list_var = successful_rules;
	SubLObject rule = NIL;
	rule = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != rbp_rb_blocks_pass_inter_constraintsP(block1, block2, rule)) {
		final SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl(rule);
		final SubLObject base_semx = rbp_rule_cycl_semx(rule_cycl, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject semx = combine_blocks_with_template(block1, block2, base_semx, UNPROVIDED);
		SubLObject wff_result = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if ((NIL != subl_promotions.memberP(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) || (NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread))) {
		    format(T, $str229$__Rule__S_yielded____a___for__S__, new SubLObject[] { rule, semx, nc_block_spanned_string(block1), nc_block_spanned_string(block2) });
		}
		if (wff_result != $WFF) {
		    if ((NIL != subl_promotions.memberP(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) || (NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread))) {
			format(T, $str231$___but_it_failed_the_wff_checker_);
			final SubLObject _prev_bind_0 = rbp_wff.$rbp_show_non_wffP$.currentBinding(thread);
			try {
			    rbp_wff.$rbp_show_non_wffP$.bind(T, thread);
			    rbp_wff.rbp_wff_clear_caches();
			    rbp_wff.rbp_wf_natP(semx, parsing_vars.$np_wff_filter_level$.getDynamicValue(thread));
			} finally {
			    rbp_wff.$rbp_show_non_wffP$.rebind(_prev_bind_0, thread);
			}
		    }
		} else if ((!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ZERO_INTEGER)) || (NIL == rbp_fails_wff_workaroundsP(rule, semx, UNPROVIDED))) {
		    SubLObject formula_arg_fn_nautP = eql(cycl_utilities.formula_arg0(semx), $$FormulaArgFn);
		    while (NIL != formula_arg_fn_nautP) {
			SubLObject current;
			final SubLObject datum = current = cycl_utilities.formula_args(semx, UNPROVIDED);
			SubLObject just_this_arg = NIL;
			SubLObject formula = NIL;
			destructuring_bind_must_consp(current, datum, $list233);
			just_this_arg = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list233);
			formula = current.first();
			current = current.rest();
			if (NIL == current) {
			    if (((NIL != subl_promotions.positive_integer_p(just_this_arg)) && just_this_arg.numG(formula_arity(semx, UNPROVIDED)))
				    && ((NIL != subl_promotions.memberP(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) || (NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread)))) {
				format(T, $str234$___but_the_desired_FormulaArgFn__, just_this_arg, formula_arity(semx, UNPROVIDED));
				wff_result = $NOT_WFF;
			    }
			    formula_arg_fn_nautP = eql(cycl_utilities.formula_arg0(formula), $$FormulaArgFn);
			    if (NIL == formula_arg_fn_nautP) {
				final SubLObject verifiedP = rbp_verify(formula, UNPROVIDED);
				if (NIL == verifiedP) {
				    wff_result = $NON_WFF;
				    if ((NIL != subl_promotions.memberP(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED)) || (NIL != $rbp_show_successful_rulesP$.getDynamicValue(thread))) {
					format(T, $str237$___but_I_was_unable_to_verify__S_, formula);
				    }
				}
			    }
			    semx = cycl_utilities.formula_arg(formula, just_this_arg, UNPROVIDED);
			} else {
			    cdestructuring_bind_error(datum, $list233);
			}
		    }
		    if ($WFF == wff_result) {
			ans = cons(list(rule, semx), ans);
		    }
		}

	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    rule = cdolist_list_var.first();
	}
	return ans;
    }

    /**
     *
     *
     * @return LISTP of RPB rules that could be used to combine BLOCK1 and BLOCK2.
     */
    @LispMethod(comment = "@return LISTP of RPB rules that could be used to combine BLOCK1 and BLOCK2.")
    public static final SubLObject rbp_rb_rules_matching_blocks_alt(SubLObject block1, SubLObject block2) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject closed_matches = rbp_rb_rules_matching_blocks_wrt_closed_constraints(block1, block2, UNPROVIDED);
		SubLObject surviving_traced_rules = (NIL != rbp_traced_rules()) ? ((SubLObject) (closed_matches.isList() ? ((SubLObject) (keyhash_utilities.fast_intersection(rbp_traced_rules(), closed_matches, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : rbp_traced_rules())) : NIL;
		thread.resetMultipleValues();
		{
		    SubLObject block1_rules = rbp_rb_search_wrt_open_constraints(block1, $MODIFIER, closed_matches, surviving_traced_rules);
		    SubLObject new_surviving_traced_rules = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    return NIL != block1_rules ? ((SubLObject) (rbp_rb_search_wrt_open_constraints(block2, $HEAD, block1_rules, new_surviving_traced_rules))) : NIL;
		}
	    }
	}
    }

    /**
     *
     *
     * @return LISTP of RPB rules that could be used to combine BLOCK1 and BLOCK2.
     */
    @LispMethod(comment = "@return LISTP of RPB rules that could be used to combine BLOCK1 and BLOCK2.")
    public static SubLObject rbp_rb_rules_matching_blocks(final SubLObject block1, final SubLObject block2) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject closed_matches = rbp_rb_rules_matching_blocks_wrt_closed_constraints(block1, block2, UNPROVIDED);
	final SubLObject surviving_traced_rules = (NIL != rbp_traced_rules()) ? closed_matches.isList() ? keyhash_utilities.fast_intersection(rbp_traced_rules(), closed_matches, UNPROVIDED, UNPROVIDED, UNPROVIDED) : rbp_traced_rules() : NIL;
	thread.resetMultipleValues();
	final SubLObject block1_rules = rbp_rb_search_wrt_open_constraints(block1, $MODIFIER, closed_matches, surviving_traced_rules);
	final SubLObject new_surviving_traced_rules = thread.secondMultipleValue();
	thread.resetMultipleValues();
	return NIL != block1_rules ? rbp_rb_search_wrt_open_constraints(block2, $HEAD, block1_rules, new_surviving_traced_rules) : NIL;
    }

    public static final SubLObject rbp_rb_rules_matching_blocks_wrt_closed_constraints_alt(SubLObject block1, SubLObject block2, SubLObject destructibleP) {
	if (destructibleP == UNPROVIDED) {
	    destructibleP = T;
	}
	{
	    SubLObject bases = make_list(FOUR_INTEGER, UNPROVIDED);
	    SubLObject list_var = NIL;
	    SubLObject filter_key = NIL;
	    SubLObject i = NIL;
	    for (list_var = $rbp_rb_closed_class_filter_keys$.getGlobalValue(), filter_key = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), filter_key = list_var.first(), i = add(ONE_INTEGER, i)) {
		{
		    SubLObject datum = filter_key;
		    SubLObject current = datum;
		    SubLObject c_type = NIL;
		    SubLObject o_type = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt244);
		    c_type = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt244);
		    o_type = current.first();
		    current = current.rest();
		    if (NIL == current) {
			{
			    SubLObject block = (o_type == $MODIFIER) ? ((SubLObject) (block1)) : block2;
			    SubLObject base = rbp_base_from_block(block, c_type);
			    set_nth(i, bases, base);
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt244);
		    }
		}
	    }
	    {
		SubLObject closed_matches = rbp_rb_rules_matching_closed_specs(bases);
		return NIL != destructibleP ? ((SubLObject) (copy_list(closed_matches))) : closed_matches;
	    }
	}
    }

    public static SubLObject rbp_rb_rules_matching_blocks_wrt_closed_constraints(final SubLObject block1, final SubLObject block2, SubLObject destructibleP) {
	if (destructibleP == UNPROVIDED) {
	    destructibleP = T;
	}
	final SubLObject bases = make_list(FOUR_INTEGER, UNPROVIDED);
	SubLObject list_var = NIL;
	SubLObject filter_key = NIL;
	SubLObject i = NIL;
	list_var = $rbp_rb_closed_class_filter_keys$.getGlobalValue();
	filter_key = list_var.first();
	for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), filter_key = list_var.first(), i = add(ONE_INTEGER, i)) {
	    SubLObject current;
	    final SubLObject datum = current = filter_key;
	    SubLObject c_type = NIL;
	    SubLObject o_type = NIL;
	    destructuring_bind_must_consp(current, datum, $list240);
	    c_type = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list240);
	    o_type = current.first();
	    current = current.rest();
	    if (NIL == current) {
		final SubLObject block3 = (o_type == $MODIFIER) ? block1 : block2;
		final SubLObject base = rbp_base_from_block(block3, c_type);
		set_nth(i, bases, base);
	    } else {
		cdestructuring_bind_error(datum, $list240);
	    }
	}
	final SubLObject closed_matches = rbp_rb_rules_matching_closed_specs(bases);
	return NIL != destructibleP ? copy_list(closed_matches) : closed_matches;
    }

    public static final SubLObject clear_rbp_rb_rules_matching_closed_specs_alt() {
	{
	    SubLObject cs = $rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue();
	    if (NIL != cs) {
		memoization_state.caching_state_clear(cs);
	    }
	}
	return NIL;
    }

    public static SubLObject clear_rbp_rb_rules_matching_closed_specs() {
	final SubLObject cs = $rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static final SubLObject remove_rbp_rb_rules_matching_closed_specs_alt(SubLObject bases) {
	return memoization_state.caching_state_remove_function_results_with_args($rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue(), list(bases), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rbp_rb_rules_matching_closed_specs(final SubLObject bases) {
	return memoization_state.caching_state_remove_function_results_with_args($rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue(), list(bases), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rbp_rb_rules_matching_closed_specs_internal_alt(SubLObject bases) {
	{
	    SubLObject no_matchP = NIL;
	    SubLObject candidate_matches = $ALL;
	    SubLObject surviving_traced_rules = NIL;
	    if (NIL == no_matchP) {
		{
		    SubLObject base = NIL;
		    SubLObject base_52 = NIL;
		    SubLObject filter_key = NIL;
		    SubLObject filter_key_53 = NIL;
		    for (base = bases, base_52 = base.first(), filter_key = $rbp_rb_closed_class_filter_keys$.getGlobalValue(), filter_key_53 = filter_key.first(); !((NIL != no_matchP)
			    || ((NIL == filter_key) && (NIL == base))); base = base.rest(), base_52 = base.first(), filter_key = filter_key.rest(), filter_key_53 = filter_key.first()) {
			{
			    SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key_53, base_52);
			    if (NIL != new_candidate_matches) {
				candidate_matches = new_candidate_matches;
			    } else {
				no_matchP = T;
			    }
			}
		    }
		}
	    }
	    return NIL != no_matchP ? ((SubLObject) (NIL)) : candidate_matches;
	}
    }

    public static SubLObject rbp_rb_rules_matching_closed_specs_internal(final SubLObject bases) {
	SubLObject no_matchP = NIL;
	SubLObject candidate_matches = $ALL;
	final SubLObject surviving_traced_rules = NIL;
	if (NIL == no_matchP) {
	    SubLObject base = NIL;
	    SubLObject base_$52 = NIL;
	    SubLObject filter_key = NIL;
	    SubLObject filter_key_$53 = NIL;
	    base = bases;
	    base_$52 = base.first();
	    filter_key = $rbp_rb_closed_class_filter_keys$.getGlobalValue();
	    filter_key_$53 = filter_key.first();
	    while ((NIL == no_matchP) && ((NIL != filter_key) || (NIL != base))) {
		final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key_$53, base_$52);
		if (NIL != new_candidate_matches) {
		    candidate_matches = new_candidate_matches;
		} else {
		    no_matchP = T;
		}
		base = base.rest();
		base_$52 = base.first();
		filter_key = filter_key.rest();
		filter_key_$53 = filter_key.first();
	    }
	}
	return NIL != no_matchP ? NIL : candidate_matches;
    }

    public static final SubLObject rbp_rb_rules_matching_closed_specs_alt(SubLObject bases) {
	{
	    SubLObject caching_state = $rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue();
	    if (NIL == caching_state) {
		caching_state = memoization_state.create_global_caching_state_for_name(RBP_RB_RULES_MATCHING_CLOSED_SPECS, $rbp_rb_rules_matching_closed_specs_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
	    }
	    {
		SubLObject results = memoization_state.caching_state_lookup(caching_state, bases, $kw93$_MEMOIZED_ITEM_NOT_FOUND_);
		if (results == $kw93$_MEMOIZED_ITEM_NOT_FOUND_) {
		    results = arg2(resetMultipleValues(), multiple_value_list(rbp_rb_rules_matching_closed_specs_internal(bases)));
		    memoization_state.caching_state_put(caching_state, bases, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	    }
	}
    }

    public static SubLObject rbp_rb_rules_matching_closed_specs(final SubLObject bases) {
	SubLObject caching_state = $rbp_rb_rules_matching_closed_specs_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name(RBP_RB_RULES_MATCHING_CLOSED_SPECS, $rbp_rb_rules_matching_closed_specs_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, bases, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(resetMultipleValues(), multiple_value_list(rbp_rb_rules_matching_closed_specs_internal(bases)));
	    memoization_state.caching_state_put(caching_state, bases, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static final SubLObject rbp_rb_search_wrt_open_constraints_alt(SubLObject block, SubLObject o_type, SubLObject closed_matches, SubLObject surviving_traced_rules) {
	return rbp_rb_search(block, o_type, closed_matches, $OPEN_CLASS, surviving_traced_rules);
    }

    public static SubLObject rbp_rb_search_wrt_open_constraints(final SubLObject block, final SubLObject o_type, final SubLObject closed_matches, final SubLObject surviving_traced_rules) {
	return rbp_rb_search(block, o_type, closed_matches, $OPEN_CLASS, surviving_traced_rules);
    }

    /**
     *
     *
     * @return BOOLEANP; Can we verify that FORMULA is true?
     */
    @LispMethod(comment = "@return BOOLEANP; Can we verify that FORMULA is true?")
    public static final SubLObject rbp_verify_internal_alt(SubLObject formula, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
	}
	return makeBoolean((NIL != term.closed_termP(formula, UNPROVIDED)) && (NIL != backward.removal_ask(formula, mt, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEANP; Can we verify that FORMULA is true?
     */
    @LispMethod(comment = "@return BOOLEANP; Can we verify that FORMULA is true?")
    public static SubLObject rbp_verify_internal(final SubLObject formula, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
	}
	return makeBoolean((NIL != term.closed_termP(formula, UNPROVIDED)) && (NIL != backward.removal_ask(formula, mt, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject rbp_verify_alt(SubLObject formula, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return rbp_verify_internal(formula, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RBP_VERIFY, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RBP_VERIFY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, RBP_VERIFY, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw93$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (formula.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(rbp_verify_internal(formula, mt)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, mt));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject rbp_verify(final SubLObject formula, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return rbp_verify_internal(formula, mt);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RBP_VERIFY, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RBP_VERIFY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, RBP_VERIFY, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (formula.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rbp_verify_internal(formula, mt)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, mt));
	return memoization_state.caching_results(results3);
    }

    /**
     * Use the rule bank to find rules matching BLOCK and O-TYPE.
     *
     * @param BLOCK;
     * 		a noun compound block
     * @param O-TYPE;
     * 		a constrained object type in *RBP-CONSTRAINED-TYPES*
     * @param CANDIDATE-MATCHES;
     * 		listp of rule IDs or :ALL if all rules are still in play..
     * @param MODE;
     * 		specifies what sorts of constraints (:all. :syntactic, :semantic :open-class, or :closed-class) to consider
     * @return LISTP; of rbp-rules for rules of which BLOCK meets the constraints on
    TYPE
     */
    @LispMethod(comment = "Use the rule bank to find rules matching BLOCK and O-TYPE.\r\n\r\n@param BLOCK;\r\n\t\ta noun compound block\r\n@param O-TYPE;\r\n\t\ta constrained object type in *RBP-CONSTRAINED-TYPES*\r\n@param CANDIDATE-MATCHES;\r\n\t\tlistp of rule IDs or :ALL if all rules are still in play..\r\n@param MODE;\r\n\t\tspecifies what sorts of constraints (:all. :syntactic, :semantic :open-class, or :closed-class) to consider\r\n@return LISTP; of rbp-rules for rules of which BLOCK meets the constraints on\r\nTYPE")
    public static final SubLObject rbp_rb_search_alt(SubLObject block, SubLObject o_type, SubLObject candidate_matches, SubLObject mode, SubLObject traced_rules) {
	if (candidate_matches == UNPROVIDED) {
	    candidate_matches = $ALL;
	}
	if (mode == UNPROVIDED) {
	    mode = $ALL;
	}
	if (traced_rules == UNPROVIDED) {
	    traced_rules = rbp_traced_rules();
	}
	if (((NIL == traced_rules) && mode.equal($ALL)) && (!candidate_matches.isList())) {
	    return copy_list(rbp_rb_initial_search_no_tracing(block, o_type));
	} else {
	    return rbp_rb_search_internal(block, o_type, candidate_matches, mode, traced_rules);
	}
    }

    @LispMethod(comment = "Use the rule bank to find rules matching BLOCK and O-TYPE.\r\n\r\n@param BLOCK;\r\n\t\ta noun compound block\r\n@param O-TYPE;\r\n\t\ta constrained object type in *RBP-CONSTRAINED-TYPES*\r\n@param CANDIDATE-MATCHES;\r\n\t\tlistp of rule IDs or :ALL if all rules are still in play..\r\n@param MODE;\r\n\t\tspecifies what sorts of constraints (:all. :syntactic, :semantic :open-class, or :closed-class) to consider\r\n@return LISTP; of rbp-rules for rules of which BLOCK meets the constraints on\r\nTYPE")
    public static SubLObject rbp_rb_search(final SubLObject block, final SubLObject o_type, SubLObject candidate_matches, SubLObject mode, SubLObject traced_rules) {
	if (candidate_matches == UNPROVIDED) {
	    candidate_matches = $ALL;
	}
	if (mode == UNPROVIDED) {
	    mode = $ALL;
	}
	if (traced_rules == UNPROVIDED) {
	    traced_rules = rbp_traced_rules();
	}
	if (((NIL == traced_rules) && mode.equal($ALL)) && (!candidate_matches.isList())) {
	    return copy_list(rbp_rb_initial_search_no_tracing(block, o_type));
	}
	return rbp_rb_search_internal(block, o_type, candidate_matches, mode, traced_rules);
    }

    /**
    * Use the rule bank to find rules matching BLOCK and O-TYPE.
    *
    * @param BLOCK;
    * 		a noun compound block
    * @param O-TYPE;
    * 		a constrained object type in *RBP-CONSTRAINED-TYPES*
    * @param CANDIDATE-MATCHES;
    * 		listp of rule IDs or :ALL if all rules are still in play..
    * @param MODE;
    * 		specifies what sorts of constraints (:all. :syntactic, :semantic :open-class, or :closed-class) to consider
    * @return LISTP; of rbp-rules for rules of which BLOCK meets the constraints on
    TYPE
    */

    public static final SubLObject inference_rbp_rb_search_alt(SubLObject block, SubLObject o_type, SubLObject candidate_matches, SubLObject mode, SubLObject traced_rules) {
	if (candidate_matches == UNPROVIDED) {
	    candidate_matches = $ALL;
	}
	if (mode == UNPROVIDED) {
	    mode = $ALL;
	}
	if (traced_rules == UNPROVIDED) {
	    traced_rules = rbp_traced_rules();
	}
	return rbp_rb_search(block, o_type, candidate_matches, mode, traced_rules);
    }

    public static SubLObject inference_rbp_rb_search(final SubLObject block, final SubLObject o_type, SubLObject candidate_matches, SubLObject mode, SubLObject traced_rules) {
	if (candidate_matches == UNPROVIDED) {
	    candidate_matches = $ALL;
	}
	if (mode == UNPROVIDED) {
	    mode = $ALL;
	}
	if (traced_rules == UNPROVIDED) {
	    traced_rules = rbp_traced_rules();
	}
	return rbp_rb_search(block, o_type, candidate_matches, mode, traced_rules);
    }

    /**
     * Memoize common case with atomic args and maximum consing.
     */
    @LispMethod(comment = "Memoize common case with atomic args and maximum consing.")
    public static final SubLObject rbp_rb_initial_search_no_tracing_internal_alt(SubLObject block, SubLObject o_type) {
	return rbp_rb_search_internal(block, o_type, $ALL, $ALL, NIL);
    }

    @LispMethod(comment = "Memoize common case with atomic args and maximum consing.")
    public static SubLObject rbp_rb_initial_search_no_tracing_internal(final SubLObject block, final SubLObject o_type) {
	return rbp_rb_search_internal(block, o_type, $ALL, $ALL, NIL);
    }

    /**
    * Memoize common case with atomic args and maximum consing.
    */

    public static final SubLObject rbp_rb_initial_search_no_tracing_alt(SubLObject block, SubLObject o_type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return rbp_rb_initial_search_no_tracing_internal(block, o_type);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RBP_RB_INITIAL_SEARCH_NO_TRACING, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RBP_RB_INITIAL_SEARCH_NO_TRACING, TWO_INTEGER, NIL, EQ, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, RBP_RB_INITIAL_SEARCH_NO_TRACING, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_2(block, o_type);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw93$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (block == cached_args.first()) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && (o_type == cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(rbp_rb_initial_search_no_tracing_internal(block, o_type)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(block, o_type));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject rbp_rb_initial_search_no_tracing(final SubLObject block, final SubLObject o_type) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return rbp_rb_initial_search_no_tracing_internal(block, o_type);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RBP_RB_INITIAL_SEARCH_NO_TRACING, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RBP_RB_INITIAL_SEARCH_NO_TRACING, TWO_INTEGER, NIL, EQ, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, RBP_RB_INITIAL_SEARCH_NO_TRACING, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(block, o_type);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (block.eql(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && o_type.eql(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rbp_rb_initial_search_no_tracing_internal(block, o_type)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(block, o_type));
	return memoization_state.caching_results(results3);
    }

    public static final SubLObject rbp_rb_search_internal_alt(SubLObject block, SubLObject o_type, SubLObject candidate_matches, SubLObject mode, SubLObject traced_rules) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject surviving_traced_rules = (candidate_matches.isList()) ? ((SubLObject) (keyhash_utilities.fast_intersection(traced_rules, candidate_matches, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : traced_rules;
		SubLObject no_matchP = NIL;
		SubLObject syntactic_types = rbp_rule_bank.$rbp_syntactic_constraint_types$.getGlobalValue();
		SubLObject semantic_types = rbp_rule_bank.$rbp_semantic_constraint_types$.getGlobalValue();
		SubLObject open_types = rbp_rule_bank.$rbp_open_class_constraint_types$.getGlobalValue();
		SubLObject closed_types = rbp_rule_bank.$rbp_closed_class_constraint_types$.getGlobalValue();
		if (mode.eql($ALL) || mode.eql($SYNTACTIC)) {
		    if (NIL == no_matchP) {
			{
			    SubLObject csome_list_var = syntactic_types;
			    SubLObject c_type = NIL;
			    for (c_type = csome_list_var.first(); !((NIL != no_matchP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), c_type = csome_list_var.first()) {
				{
				    SubLObject filter_key = list(c_type, o_type);
				    SubLObject base = rbp_base_from_block(block, c_type);
				    thread.resetMultipleValues();
				    {
					SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
					SubLObject new_survivors = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != new_candidate_matches) {
					    candidate_matches = new_candidate_matches;
					    surviving_traced_rules = new_survivors;
					} else {
					    no_matchP = T;
					}
				    }
				}
			    }
			}
		    }
		}
		if (mode.eql($ALL) || mode.eql($SEMANTIC)) {
		    if (NIL == no_matchP) {
			{
			    SubLObject csome_list_var = semantic_types;
			    SubLObject c_type = NIL;
			    for (c_type = csome_list_var.first(); !((NIL != no_matchP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), c_type = csome_list_var.first()) {
				{
				    SubLObject filter_key = list(c_type, o_type);
				    SubLObject base = rbp_base_from_block(block, c_type);
				    thread.resetMultipleValues();
				    {
					SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
					SubLObject new_survivors = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != new_candidate_matches) {
					    candidate_matches = new_candidate_matches;
					    surviving_traced_rules = new_survivors;
					} else {
					    no_matchP = T;
					}
				    }
				}
			    }
			}
		    }
		}
		if (mode.eql($OPEN_CLASS)) {
		    if (NIL == no_matchP) {
			{
			    SubLObject csome_list_var = open_types;
			    SubLObject c_type = NIL;
			    for (c_type = csome_list_var.first(); !((NIL != no_matchP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), c_type = csome_list_var.first()) {
				{
				    SubLObject filter_key = list(c_type, o_type);
				    SubLObject base = rbp_base_from_block(block, c_type);
				    thread.resetMultipleValues();
				    {
					SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
					SubLObject new_survivors = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != new_candidate_matches) {
					    candidate_matches = new_candidate_matches;
					    surviving_traced_rules = new_survivors;
					} else {
					    no_matchP = T;
					}
				    }
				}
			    }
			}
		    }
		}
		if (mode.eql($CLOSED_CLASS)) {
		    if (NIL == no_matchP) {
			{
			    SubLObject csome_list_var = closed_types;
			    SubLObject c_type = NIL;
			    for (c_type = csome_list_var.first(); !((NIL != no_matchP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), c_type = csome_list_var.first()) {
				{
				    SubLObject filter_key = list(c_type, o_type);
				    SubLObject base = rbp_base_from_block(block, c_type);
				    thread.resetMultipleValues();
				    {
					SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
					SubLObject new_survivors = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != new_candidate_matches) {
					    candidate_matches = new_candidate_matches;
					    surviving_traced_rules = new_survivors;
					} else {
					    no_matchP = T;
					}
				    }
				}
			    }
			}
		    }
		}
		return values(NIL != no_matchP ? ((SubLObject) (NIL)) : candidate_matches, surviving_traced_rules);
	    }
	}
    }

    public static SubLObject rbp_rb_search_internal(final SubLObject block, final SubLObject o_type, SubLObject candidate_matches, final SubLObject mode, final SubLObject traced_rules) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject surviving_traced_rules = (candidate_matches.isList()) ? keyhash_utilities.fast_intersection(traced_rules, candidate_matches, UNPROVIDED, UNPROVIDED, UNPROVIDED) : traced_rules;
	SubLObject no_matchP = NIL;
	final SubLObject syntactic_types = rbp_rule_bank.$rbp_syntactic_constraint_types$.getGlobalValue();
	final SubLObject semantic_types = rbp_rule_bank.$rbp_semantic_constraint_types$.getGlobalValue();
	final SubLObject open_types = rbp_rule_bank.$rbp_open_class_constraint_types$.getGlobalValue();
	final SubLObject closed_types = rbp_rule_bank.$rbp_closed_class_constraint_types$.getGlobalValue();
	if ((mode.eql($ALL) || mode.eql($SYNTACTIC)) && (NIL == no_matchP)) {
	    SubLObject csome_list_var = syntactic_types;
	    SubLObject c_type = NIL;
	    c_type = csome_list_var.first();
	    while ((NIL == no_matchP) && (NIL != csome_list_var)) {
		final SubLObject filter_key = list(c_type, o_type);
		final SubLObject base = rbp_base_from_block(block, c_type);
		thread.resetMultipleValues();
		final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
		final SubLObject new_survivors = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != new_candidate_matches) {
		    candidate_matches = new_candidate_matches;
		    surviving_traced_rules = new_survivors;
		} else {
		    no_matchP = T;
		}
		csome_list_var = csome_list_var.rest();
		c_type = csome_list_var.first();
	    }
	}
	if ((mode.eql($ALL) || mode.eql($SEMANTIC)) && (NIL == no_matchP)) {
	    SubLObject csome_list_var = semantic_types;
	    SubLObject c_type = NIL;
	    c_type = csome_list_var.first();
	    while ((NIL == no_matchP) && (NIL != csome_list_var)) {
		final SubLObject filter_key = list(c_type, o_type);
		final SubLObject base = rbp_base_from_block(block, c_type);
		thread.resetMultipleValues();
		final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
		final SubLObject new_survivors = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != new_candidate_matches) {
		    candidate_matches = new_candidate_matches;
		    surviving_traced_rules = new_survivors;
		} else {
		    no_matchP = T;
		}
		csome_list_var = csome_list_var.rest();
		c_type = csome_list_var.first();
	    }
	}
	if (mode.eql($OPEN_CLASS) && (NIL == no_matchP)) {
	    SubLObject csome_list_var = open_types;
	    SubLObject c_type = NIL;
	    c_type = csome_list_var.first();
	    while ((NIL == no_matchP) && (NIL != csome_list_var)) {
		final SubLObject filter_key = list(c_type, o_type);
		final SubLObject base = rbp_base_from_block(block, c_type);
		thread.resetMultipleValues();
		final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
		final SubLObject new_survivors = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != new_candidate_matches) {
		    candidate_matches = new_candidate_matches;
		    surviving_traced_rules = new_survivors;
		} else {
		    no_matchP = T;
		}
		csome_list_var = csome_list_var.rest();
		c_type = csome_list_var.first();
	    }
	}
	if (mode.eql($CLOSED_CLASS) && (NIL == no_matchP)) {
	    SubLObject csome_list_var = closed_types;
	    SubLObject c_type = NIL;
	    c_type = csome_list_var.first();
	    while ((NIL == no_matchP) && (NIL != csome_list_var)) {
		final SubLObject filter_key = list(c_type, o_type);
		final SubLObject base = rbp_base_from_block(block, c_type);
		thread.resetMultipleValues();
		final SubLObject new_candidate_matches = rbp_rule_bank.rbp_rb_filter_rules(candidate_matches, surviving_traced_rules, filter_key, base);
		final SubLObject new_survivors = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != new_candidate_matches) {
		    candidate_matches = new_candidate_matches;
		    surviving_traced_rules = new_survivors;
		} else {
		    no_matchP = T;
		}
		csome_list_var = csome_list_var.rest();
		c_type = csome_list_var.first();
	    }
	}
	return values(NIL != no_matchP ? NIL : candidate_matches, surviving_traced_rules);
    }

    /**
     *
     *
     * @return BOOLEAN; Do BLOCK1 and BLOCK2 pass the inter constraints on RULE?
     */
    @LispMethod(comment = "@return BOOLEAN; Do BLOCK1 and BLOCK2 pass the inter constraints on RULE?")
    public static final SubLObject rbp_rb_blocks_pass_inter_constraintsP_alt(SubLObject block1, SubLObject block2, SubLObject rule) {
	{
	    SubLObject inter_constraints = inter_constraints_from_rule(rule);
	    SubLObject passP = blocks_pass_all_inter_nc_constraintsP(block1, block2, inter_constraints);
	    if ((NIL == passP) && (NIL != member(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED))) {
		format(T, $str_alt254$__The_blocks_failed_an_inter_cons, inter_constraints, rule);
	    }
	    return passP;
	}
    }

    /**
     *
     *
     * @return BOOLEAN; Do BLOCK1 and BLOCK2 pass the inter constraints on RULE?
     */
    @LispMethod(comment = "@return BOOLEAN; Do BLOCK1 and BLOCK2 pass the inter constraints on RULE?")
    public static SubLObject rbp_rb_blocks_pass_inter_constraintsP(final SubLObject block1, final SubLObject block2, final SubLObject rule) {
	final SubLObject inter_constraints = inter_constraints_from_rule(rule);
	final SubLObject passP = blocks_pass_all_inter_nc_constraintsP(block1, block2, inter_constraints);
	if ((NIL == passP) && (NIL != member(rule, rbp_traced_rules(), UNPROVIDED, UNPROVIDED))) {
	    format(T, $str250$__The_blocks_failed_an_inter_cons, inter_constraints, rule);
	}
	return passP;
    }

    public static final SubLObject clear_inter_constraints_from_rule_alt() {
	{
	    SubLObject cs = $inter_constraints_from_rule_caching_state$.getGlobalValue();
	    if (NIL != cs) {
		memoization_state.caching_state_clear(cs);
	    }
	}
	return NIL;
    }

    public static SubLObject clear_inter_constraints_from_rule() {
	final SubLObject cs = $inter_constraints_from_rule_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static final SubLObject remove_inter_constraints_from_rule_alt(SubLObject rbp_rule) {
	return memoization_state.caching_state_remove_function_results_with_args($inter_constraints_from_rule_caching_state$.getGlobalValue(), list(rbp_rule), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_inter_constraints_from_rule(final SubLObject rbp_rule) {
	return memoization_state.caching_state_remove_function_results_with_args($inter_constraints_from_rule_caching_state$.getGlobalValue(), list(rbp_rule), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject inter_constraints_from_rule_internal_alt(SubLObject rbp_rule) {
	{
	    SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl(rbp_rule);
	    SubLObject constraints = rbp_rule_bank.rbp_rule_constraints(rule_cycl);
	    SubLObject ans = NIL;
	    SubLObject cdolist_list_var = constraints;
	    SubLObject constraint = NIL;
	    for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), constraint = cdolist_list_var.first()) {
		if ((NIL != subl_promotions.memberP($MODIFIER, constraint, UNPROVIDED, UNPROVIDED)) && (NIL != member($HEAD, constraint, UNPROVIDED, UNPROVIDED))) {
		    ans = cons(constraint, ans);
		}
	    }
	    return ans;
	}
    }

    public static SubLObject inter_constraints_from_rule_internal(final SubLObject rbp_rule) {
	final SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl(rbp_rule);
	final SubLObject constraints = rbp_rule_bank.rbp_rule_constraints(rule_cycl);
	SubLObject ans = NIL;
	SubLObject cdolist_list_var = constraints;
	SubLObject constraint = NIL;
	constraint = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if ((NIL != subl_promotions.memberP($MODIFIER, constraint, UNPROVIDED, UNPROVIDED)) && (NIL != member($HEAD, constraint, UNPROVIDED, UNPROVIDED))) {
		ans = cons(constraint, ans);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    constraint = cdolist_list_var.first();
	}
	return ans;
    }

    public static final SubLObject inter_constraints_from_rule_alt(SubLObject rbp_rule) {
	{
	    SubLObject caching_state = $inter_constraints_from_rule_caching_state$.getGlobalValue();
	    if (NIL == caching_state) {
		caching_state = memoization_state.create_global_caching_state_for_name(INTER_CONSTRAINTS_FROM_RULE, $inter_constraints_from_rule_caching_state$, NIL, EQL, ONE_INTEGER, $int$128);
	    }
	    {
		SubLObject results = memoization_state.caching_state_lookup(caching_state, rbp_rule, $kw93$_MEMOIZED_ITEM_NOT_FOUND_);
		if (results == $kw93$_MEMOIZED_ITEM_NOT_FOUND_) {
		    results = arg2(resetMultipleValues(), multiple_value_list(inter_constraints_from_rule_internal(rbp_rule)));
		    memoization_state.caching_state_put(caching_state, rbp_rule, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	    }
	}
    }

    public static SubLObject inter_constraints_from_rule(final SubLObject rbp_rule) {
	SubLObject caching_state = $inter_constraints_from_rule_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name(INTER_CONSTRAINTS_FROM_RULE, $inter_constraints_from_rule_caching_state$, $int$512, EQL, ONE_INTEGER, $int$128);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, rbp_rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(resetMultipleValues(), multiple_value_list(inter_constraints_from_rule_internal(rbp_rule)));
	    memoization_state.caching_state_put(caching_state, rbp_rule, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @param ncb1;
    nc-block
     * 		
     * @param ncb2;
    nc-block
     * 		
     * @param constraints;
    LIST
     * 		
     * @return BOOLEAN; Do NCB1 and NCB2 pass CONSTRAINTS?
     */
    @LispMethod(comment = "@param ncb1;\nnc-block\r\n\t\t\r\n@param ncb2;\nnc-block\r\n\t\t\r\n@param constraints;\nLIST\r\n\t\t\r\n@return BOOLEAN; Do NCB1 and NCB2 pass CONSTRAINTS?")
    public static final SubLObject blocks_pass_all_inter_nc_constraintsP_alt(SubLObject ncb1, SubLObject ncb2, SubLObject constraints) {
	if (NIL == constraints) {
	    return T;
	}
	{
	    SubLObject failP = NIL;
	    if (NIL == failP) {
		{
		    SubLObject csome_list_var = constraints;
		    SubLObject constraint = NIL;
		    for (constraint = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), constraint = csome_list_var.first()) {
			failP = makeBoolean(NIL == blocks_pass_inter_nc_constraintP(ncb1, ncb2, constraint));
		    }
		}
	    }
	    return makeBoolean(NIL == failP);
	}
    }

    /**
     *
     *
     * @param ncb1;
    nc-block
     * 		
     * @param ncb2;
    nc-block
     * 		
     * @param constraints;
    LIST
     * 		
     * @return BOOLEAN; Do NCB1 and NCB2 pass CONSTRAINTS?
     */
    @LispMethod(comment = "@param ncb1;\nnc-block\r\n\t\t\r\n@param ncb2;\nnc-block\r\n\t\t\r\n@param constraints;\nLIST\r\n\t\t\r\n@return BOOLEAN; Do NCB1 and NCB2 pass CONSTRAINTS?")
    public static SubLObject blocks_pass_all_inter_nc_constraintsP(final SubLObject ncb1, final SubLObject ncb2, final SubLObject constraints) {
	if (NIL == constraints) {
	    return T;
	}
	SubLObject failP = NIL;
	if (NIL == failP) {
	    SubLObject csome_list_var;
	    SubLObject constraint;
	    for (csome_list_var = constraints, constraint = NIL, constraint = csome_list_var.first(); (NIL == failP)
		    && (NIL != csome_list_var); failP = makeBoolean(NIL == blocks_pass_inter_nc_constraintP(ncb1, ncb2, constraint)), csome_list_var = csome_list_var.rest(), constraint = csome_list_var.first()) {
	    }
	}
	return makeBoolean(NIL == failP);
    }

    /**
     *
     *
     * @param ncb1;
    NOUN-COMPOUND-BLOCK
     * 		
     * @param ncb1;
    NOUN-COMPOUND-BLOCK
     * 		
     * @param constraint;
    LIST
     * 		
     * @return BOOLEAN; Do NCB1 and NCB2 pass CONSTRAINT?
     */
    @LispMethod(comment = "@param ncb1;\nNOUN-COMPOUND-BLOCK\r\n\t\t\r\n@param ncb1;\nNOUN-COMPOUND-BLOCK\r\n\t\t\r\n@param constraint;\nLIST\r\n\t\t\r\n@return BOOLEAN; Do NCB1 and NCB2 pass CONSTRAINT?")
    public static final SubLObject blocks_pass_inter_nc_constraintP_alt(SubLObject ncb1, SubLObject ncb2, SubLObject constraint) {
	{
	    SubLObject datum = constraint;
	    SubLObject current = datum;
	    SubLObject con_kw = NIL;
	    SubLObject arg1 = NIL;
	    SubLObject arg2 = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt257);
	    con_kw = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list_alt257);
	    arg1 = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list_alt257);
	    arg2 = current.first();
	    current = current.rest();
	    if (NIL == current) {
		{
		    SubLObject sem1 = (NIL != member(arg1, $list_alt258, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (nc_block_denot(ncb1))) : nc_block_denot(ncb2);
		    SubLObject sem2 = (NIL != member(arg2, $list_alt258, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (nc_block_denot(ncb1))) : nc_block_denot(ncb2);
		    if (($NO_DENOT == sem1) || ($NO_DENOT == sem2)) {
			return NIL;
		    } else {
			if (NIL != inter_nc_block_test(con_kw, sem1, sem2)) {
			    return T;
			} else {
			    return NIL;
			}
		    }
		}
	    } else {
		cdestructuring_bind_error(datum, $list_alt257);
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @param ncb1;
    NOUN-COMPOUND-BLOCK
     * 		
     * @param ncb1;
    NOUN-COMPOUND-BLOCK
     * 		
     * @param constraint;
    LIST
     * 		
     * @return BOOLEAN; Do NCB1 and NCB2 pass CONSTRAINT?
     */
    @LispMethod(comment = "@param ncb1;\nNOUN-COMPOUND-BLOCK\r\n\t\t\r\n@param ncb1;\nNOUN-COMPOUND-BLOCK\r\n\t\t\r\n@param constraint;\nLIST\r\n\t\t\r\n@return BOOLEAN; Do NCB1 and NCB2 pass CONSTRAINT?")
    public static SubLObject blocks_pass_inter_nc_constraintP(final SubLObject ncb1, final SubLObject ncb2, final SubLObject constraint) {
	SubLObject con_kw = NIL;
	SubLObject arg1 = NIL;
	SubLObject arg2 = NIL;
	destructuring_bind_must_consp(constraint, constraint, $list253);
	con_kw = constraint.first();
	SubLObject current = constraint.rest();
	destructuring_bind_must_consp(current, constraint, $list253);
	arg1 = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, constraint, $list253);
	arg2 = current.first();
	current = current.rest();
	if (NIL != current) {
	    cdestructuring_bind_error(constraint, $list253);
	    return NIL;
	}
	final SubLObject sem1 = (NIL != member(arg1, $list254, UNPROVIDED, UNPROVIDED)) ? nc_block_denot(ncb1) : nc_block_denot(ncb2);
	final SubLObject sem2 = (NIL != member(arg2, $list254, UNPROVIDED, UNPROVIDED)) ? nc_block_denot(ncb1) : nc_block_denot(ncb2);
	if (($NO_DENOT == sem1) || ($NO_DENOT == sem2)) {
	    return NIL;
	}
	if (NIL != inter_nc_block_test(con_kw, sem1, sem2)) {
	    return T;
	}
	return NIL;
    }

    /**
     *
     *
     * @param keyword;
    KEYWORD
     * 		
     * @param item1;
     * 		FORT or NAUT
     * @param item2;
     * 		FORT or NAUT
     * @return BOOLEAN
    Inter head/modifier testing.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param keyword;\nKEYWORD\r\n\t\t\r\n@param item1;\r\n\t\tFORT or NAUT\r\n@param item2;\r\n\t\tFORT or NAUT\r\n@return BOOLEAN\r\nInter head/modifier testing.\r\n@unknown bertolo")
    public static final SubLObject inter_nc_block_test_alt(SubLObject keyword, SubLObject item1, SubLObject item2) {
	{
	    SubLObject pcase_var = keyword;
	    if (pcase_var.eql($isa) || pcase_var.eql($ISA)) {
		return rbp_wff.npp_isaP(item1, item2, UNPROVIDED);
	    } else {
		if (pcase_var.eql($genl) || pcase_var.eql($GENL)) {
		    return rbp_wff.npp_genlP(item1, item2, UNPROVIDED);
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @param keyword;
    KEYWORD
     * 		
     * @param item1;
     * 		FORT or NAUT
     * @param item2;
     * 		FORT or NAUT
     * @return BOOLEAN
    Inter head/modifier testing.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param keyword;\nKEYWORD\r\n\t\t\r\n@param item1;\r\n\t\tFORT or NAUT\r\n@param item2;\r\n\t\tFORT or NAUT\r\n@return BOOLEAN\r\nInter head/modifier testing.\r\n@unknown bertolo")
    public static SubLObject inter_nc_block_test(final SubLObject keyword, final SubLObject item1, final SubLObject item2) {
	if (keyword.eql($isa) || keyword.eql($ISA)) {
	    return rbp_wff.npp_isaP(item1, item2, UNPROVIDED);
	}
	if (keyword.eql($genl) || keyword.eql($GENL)) {
	    return rbp_wff.npp_genlP(item1, item2, UNPROVIDED);
	}
	return NIL;
    }

    public static final SubLObject rbp_check_initializations_alt() {
	rbp_wff.rbp_wff_clear_caches();
	return T;
    }

    public static SubLObject rbp_check_initializations() {
	rbp_wff.rbp_wff_clear_caches();
	return T;
    }

    /**
     *
     *
     * @return 0 CYCL; semx of BLOCK1 and BLOCK2 substituted into RAW-TEMPLATE.
     * @return 1 keywordp; :wff or :non-wff.
     */
    @LispMethod(comment = "@return 0 CYCL; semx of BLOCK1 and BLOCK2 substituted into RAW-TEMPLATE.\r\n@return 1 keywordp; :wff or :non-wff.")
    public static final SubLObject combine_blocks_with_template_alt(SubLObject block1, SubLObject block2, SubLObject raw_template, SubLObject traceP) {
	if (traceP == UNPROVIDED) {
	    traceP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject template = raw_template;
		SubLObject comp_sem1 = nc_block_denot(block1);
		SubLObject comp_sem2 = nc_block_denot(block2);
		SubLObject keyword_bindings = list(bq_cons($MODIFIER, comp_sem1), bq_cons($HEAD, comp_sem2));
		SubLObject new_comp_sem = rbp_wff.rbp_subst_bindings(keyword_bindings, template);
		if (!(((NIL == cycl_utilities.expression_find($NO_DENOT, new_comp_sem, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ZERO_INTEGER)) || (NIL != rbp_wff.rbp_wf_template_argsP(template, keyword_bindings, ONE_INTEGER))))
			&& ((!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ONE_INTEGER)) || (NIL != rbp_wff.rbp_wf_template_argsP(template, keyword_bindings, TWO_INTEGER))))) {
		    return values(new_comp_sem, $NON_WFF);
		}
		if (NIL != traceP) {
		    format(T, $str_alt263$__Semantics_are__S_and__S___in_te, new SubLObject[] { comp_sem1, comp_sem2, template });
		}
		return values(new_comp_sem, $WFF);
	    }
	}
    }

    /**
     *
     *
     * @return 0 CYCL; semx of BLOCK1 and BLOCK2 substituted into RAW-TEMPLATE.
     * @return 1 keywordp; :wff or :non-wff.
     */
    @LispMethod(comment = "@return 0 CYCL; semx of BLOCK1 and BLOCK2 substituted into RAW-TEMPLATE.\r\n@return 1 keywordp; :wff or :non-wff.")
    public static SubLObject combine_blocks_with_template(final SubLObject block1, final SubLObject block2, final SubLObject raw_template, SubLObject traceP) {
	if (traceP == UNPROVIDED) {
	    traceP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject comp_sem1 = nc_block_denot(block1);
	final SubLObject comp_sem2 = nc_block_denot(block2);
	final SubLObject keyword_bindings = list(bq_cons($MODIFIER, comp_sem1), bq_cons($HEAD, comp_sem2));
	final SubLObject new_comp_sem = rbp_wff.rbp_subst_bindings(keyword_bindings, raw_template);
	if (((NIL != cycl_utilities.expression_find($NO_DENOT, new_comp_sem, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ZERO_INTEGER) && (NIL == rbp_wff.rbp_wf_template_argsP(raw_template, keyword_bindings, ONE_INTEGER))))
		|| (parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ONE_INTEGER) && (NIL == rbp_wff.rbp_wf_template_argsP(raw_template, keyword_bindings, TWO_INTEGER)))) {
	    return values(new_comp_sem, $NON_WFF);
	}
	if (NIL != traceP) {
	    format(T, $str259$__Semantics_are__S_and__S___in_te, new SubLObject[] { comp_sem1, comp_sem2, raw_template });
	}
	return values(new_comp_sem, $WFF);
    }

    public static final SubLObject rbp_test_for_con_kw_alt(SubLObject con_kw) {
	{
	    SubLObject pcase_var = con_kw;
	    if (pcase_var.eql($pred) || pcase_var.eql($PRED)) {
		return $sym266$NPP_GENL_PRED_;
	    } else {
		if (pcase_var.eql($pos) || pcase_var.eql($POS)) {
		    return $sym139$NPP_GENL_;
		} else {
		    if ((pcase_var.eql($eql) || pcase_var.eql($EQL)) || pcase_var.eql($WU)) {
			return EQL;
		    } else {
			if (pcase_var.eql($isa) || pcase_var.eql($ISA)) {
			    return $sym140$NPP_ISA_;
			} else {
			    if (pcase_var.eql($genl) || pcase_var.eql($GENL)) {
				return $sym139$NPP_GENL_;
			    } else {
				if (pcase_var.eql($TYPE_GENL)) {
				    return $sym272$NPP_TYPE_GENL_;
				} else {
				    return NIL;
				}
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject rbp_test_for_con_kw(final SubLObject con_kw) {
	if (con_kw.eql($pred) || con_kw.eql($PRED)) {
	    return $sym262$NPP_GENL_PRED_;
	}
	if (con_kw.eql($pos) || con_kw.eql($POS)) {
	    return $sym134$NPP_GENL_;
	}
	if ((con_kw.eql($eql) || con_kw.eql($EQL)) || con_kw.eql($WU)) {
	    return EQL;
	}
	if (con_kw.eql($isa) || con_kw.eql($ISA)) {
	    return $sym135$NPP_ISA_;
	}
	if (con_kw.eql($genl) || con_kw.eql($GENL)) {
	    return $sym134$NPP_GENL_;
	}
	if (con_kw.eql($TYPE_GENL)) {
	    return $sym268$NPP_TYPE_GENL_;
	}
	return NIL;
    }

    public static final SubLObject rbp_candidate_fn_for_con_kw_alt(SubLObject con_kw) {
	{
	    SubLObject pcase_var = con_kw;
	    if (pcase_var.eql($pred) || pcase_var.eql($PRED)) {
		return NC_BLOCK_HEAD_STRING_PRED;
	    } else {
		if (pcase_var.eql($pos) || pcase_var.eql($POS)) {
		    return NC_BLOCK_HEAD_POS;
		} else {
		    if (pcase_var.eql($WU)) {
			return NC_BLOCK_WU;
		    } else {
			return NIL;
		    }
		}
	    }
	}
    }

    public static SubLObject rbp_candidate_fn_for_con_kw(final SubLObject con_kw) {
	if (con_kw.eql($pred) || con_kw.eql($PRED)) {
	    return NC_BLOCK_HEAD_STRING_PRED;
	}
	if (con_kw.eql($pos) || con_kw.eql($POS)) {
	    return NC_BLOCK_HEAD_POS;
	}
	if (con_kw.eql($WU)) {
	    return NC_BLOCK_WU;
	}
	return NIL;
    }

    public static final SubLObject rbp_get_deverbal_root_alt(SubLObject string, SubLObject use_mass_fallback_if_neededP) {
	if (use_mass_fallback_if_neededP == UNPROVIDED) {
	    use_mass_fallback_if_neededP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject the_root = NIL;
		SubLObject has_deverbal_endingP = T;
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		    try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
			mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
			if (NIL != string_utilities.ends_with(string, $$$ing, UNPROVIDED)) {
			    {
				SubLObject _prev_bind_0_56 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				SubLObject _prev_bind_1_57 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
				    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
				    mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
				    if (NIL == the_root) {
					{
					    SubLObject csome_list_var = lexicon_accessors.words_of_stringXpred(string, $$gerund, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					    SubLObject wu = NIL;
					    for (wu = csome_list_var.first(); !((NIL != the_root) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), wu = csome_list_var.first()) {
						{
						    SubLObject inf = NIL;
						    SubLObject pred_var = $$infinitive;
						    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, ONE_INTEGER, pred_var)) {
							{
							    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, ONE_INTEGER, pred_var);
							    SubLObject done_var = the_root;
							    SubLObject token_var = NIL;
							    while (NIL == done_var) {
								{
								    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
								    SubLObject valid = makeBoolean(token_var != final_index_spec);
								    if (NIL != valid) {
									{
									    SubLObject final_index_iterator = NIL;
									    try {
										final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
										{
										    SubLObject done_var_58 = the_root;
										    SubLObject token_var_59 = NIL;
										    while (NIL == done_var_58) {
											{
											    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_59);
											    SubLObject valid_60 = makeBoolean(token_var_59 != assertion);
											    if (NIL != valid_60) {
												inf = assertions_high.gaf_arg(assertion, TWO_INTEGER);
												the_root = inf;
											    }
											    done_var_58 = makeBoolean((NIL == valid_60) || (NIL != the_root));
											}
										    }
										}
									    } finally {
										{
										    SubLObject _prev_bind_0_61 = $is_thread_performing_cleanupP$.currentBinding(thread);
										    try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											if (NIL != final_index_iterator) {
											    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
											}
										    } finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_0_61, thread);
										    }
										}
									    }
									}
								    }
								    done_var = makeBoolean((NIL == valid) || (NIL != the_root));
								}
							    }
							}
						    }
						}
					    }
					}
				    }
				} finally {
				    mt_relevance_macros.$mt$.rebind(_prev_bind_1_57, thread);
				    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_56, thread);
				}
			    }
			} else {
			    if (NIL != string_utilities.ends_with(string, $$$ion, UNPROVIDED)) {
				if (NIL == the_root) {
				    {
					SubLObject csome_list_var = lexicon_accessors.words_of_stringXpred(string, $$singular, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					SubLObject wu = NIL;
					for (wu = csome_list_var.first(); !((NIL != the_root) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), wu = csome_list_var.first()) {
					    if (NIL != kb_mapping.gather_gaf_arg_index(wu, ONE_INTEGER, $$agentive_Sg, UNPROVIDED, UNPROVIDED)) {
						{
						    SubLObject inf = NIL;
						    SubLObject pred_var = $$infinitive;
						    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, ONE_INTEGER, pred_var)) {
							{
							    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, ONE_INTEGER, pred_var);
							    SubLObject done_var = the_root;
							    SubLObject token_var = NIL;
							    while (NIL == done_var) {
								{
								    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
								    SubLObject valid = makeBoolean(token_var != final_index_spec);
								    if (NIL != valid) {
									{
									    SubLObject final_index_iterator = NIL;
									    try {
										final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
										{
										    SubLObject done_var_62 = the_root;
										    SubLObject token_var_63 = NIL;
										    while (NIL == done_var_62) {
											{
											    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_63);
											    SubLObject valid_64 = makeBoolean(token_var_63 != assertion);
											    if (NIL != valid_64) {
												inf = assertions_high.gaf_arg(assertion, TWO_INTEGER);
												the_root = inf;
											    }
											    done_var_62 = makeBoolean((NIL == valid_64) || (NIL != the_root));
											}
										    }
										}
									    } finally {
										{
										    SubLObject _prev_bind_0_65 = $is_thread_performing_cleanupP$.currentBinding(thread);
										    try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											if (NIL != final_index_iterator) {
											    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
											}
										    } finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_0_65, thread);
										    }
										}
									    }
									}
								    }
								    done_var = makeBoolean((NIL == valid) || (NIL != the_root));
								}
							    }
							}
						    }
						}
					    }
					}
				    }
				}
			    } else {
				if (NIL != string_utilities.ends_with(string, $$$ment, UNPROVIDED)) {
				    if (NIL == the_root) {
					{
					    SubLObject csome_list_var = lexicon_accessors.words_of_stringXpred(string, $$nounStrings, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					    SubLObject wu = NIL;
					    for (wu = csome_list_var.first(); !((NIL != the_root) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), wu = csome_list_var.first()) {
						{
						    SubLObject inf = NIL;
						    SubLObject pred_var = $$infinitive;
						    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, ONE_INTEGER, pred_var)) {
							{
							    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, ONE_INTEGER, pred_var);
							    SubLObject done_var = the_root;
							    SubLObject token_var = NIL;
							    while (NIL == done_var) {
								{
								    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
								    SubLObject valid = makeBoolean(token_var != final_index_spec);
								    if (NIL != valid) {
									{
									    SubLObject final_index_iterator = NIL;
									    try {
										final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
										{
										    SubLObject done_var_66 = the_root;
										    SubLObject token_var_67 = NIL;
										    while (NIL == done_var_66) {
											{
											    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_67);
											    SubLObject valid_68 = makeBoolean(token_var_67 != assertion);
											    if (NIL != valid_68) {
												inf = assertions_high.gaf_arg(assertion, TWO_INTEGER);
												the_root = inf;
											    }
											    done_var_66 = makeBoolean((NIL == valid_68) || (NIL != the_root));
											}
										    }
										}
									    } finally {
										{
										    SubLObject _prev_bind_0_69 = $is_thread_performing_cleanupP$.currentBinding(thread);
										    try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											if (NIL != final_index_iterator) {
											    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
											}
										    } finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_0_69, thread);
										    }
										}
									    }
									}
								    }
								    done_var = makeBoolean((NIL == valid) || (NIL != the_root));
								}
							    }
							}
						    }
						}
					    }
					}
				    }
				} else {
				    has_deverbal_endingP = NIL;
				}
			    }
			}
			if (((NIL != use_mass_fallback_if_neededP) || (NIL != has_deverbal_endingP)) && (NIL == the_root)) {
			    if (NIL == the_root) {
				{
				    SubLObject csome_list_var = lexicon_accessors.words_of_stringXpred(string, $$massNumber, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				    SubLObject wu = NIL;
				    for (wu = csome_list_var.first(); !((NIL != the_root) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), wu = csome_list_var.first()) {
					{
					    SubLObject inf = NIL;
					    SubLObject pred_var = $$infinitive;
					    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, ONE_INTEGER, pred_var)) {
						{
						    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, ONE_INTEGER, pred_var);
						    SubLObject done_var = the_root;
						    SubLObject token_var = NIL;
						    while (NIL == done_var) {
							{
							    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
							    SubLObject valid = makeBoolean(token_var != final_index_spec);
							    if (NIL != valid) {
								{
								    SubLObject final_index_iterator = NIL;
								    try {
									final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
									{
									    SubLObject done_var_70 = the_root;
									    SubLObject token_var_71 = NIL;
									    while (NIL == done_var_70) {
										{
										    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_71);
										    SubLObject valid_72 = makeBoolean(token_var_71 != assertion);
										    if (NIL != valid_72) {
											inf = assertions_high.gaf_arg(assertion, TWO_INTEGER);
											the_root = inf;
										    }
										    done_var_70 = makeBoolean((NIL == valid_72) || (NIL != the_root));
										}
									    }
									}
								    } finally {
									{
									    SubLObject _prev_bind_0_73 = $is_thread_performing_cleanupP$.currentBinding(thread);
									    try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if (NIL != final_index_iterator) {
										    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
										}
									    } finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_73, thread);
									    }
									}
								    }
								}
							    }
							    done_var = makeBoolean((NIL == valid) || (NIL != the_root));
							}
						    }
						}
					    }
					}
				    }
				}
			    }
			}
		    } finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		    }
		}
		return the_root;
	    }
	}
    }

    public static SubLObject rbp_get_deverbal_root(final SubLObject string, SubLObject use_mass_fallback_if_neededP) {
	if (use_mass_fallback_if_neededP == UNPROVIDED) {
	    use_mass_fallback_if_neededP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject the_root = NIL;
	SubLObject has_deverbal_endingP = T;
	final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
	try {
	    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
	    mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
	    if (NIL != string_utilities.ends_with(string, $$$ing, UNPROVIDED)) {
		final SubLObject _prev_bind_0_$54 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_1_$55 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
		    mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
		    if (NIL == the_root) {
			SubLObject csome_list_var = lexicon_accessors.words_of_stringXpred(string, $$gerund, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject wu = NIL;
			wu = csome_list_var.first();
			while ((NIL == the_root) && (NIL != csome_list_var)) {
			    SubLObject inf = NIL;
			    final SubLObject pred_var = $$infinitive;
			    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, ONE_INTEGER, pred_var)) {
				final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, ONE_INTEGER, pred_var);
				SubLObject done_var = the_root;
				final SubLObject token_var = NIL;
				while (NIL == done_var) {
				    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
				    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
				    if (NIL != valid) {
					SubLObject final_index_iterator = NIL;
					try {
					    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
					    SubLObject done_var_$56 = the_root;
					    final SubLObject token_var_$57 = NIL;
					    while (NIL == done_var_$56) {
						final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$57);
						final SubLObject valid_$58 = makeBoolean(!token_var_$57.eql(assertion));
						if (NIL != valid_$58) {
						    inf = the_root = assertions_high.gaf_arg(assertion, TWO_INTEGER);
						}
						done_var_$56 = makeBoolean((NIL == valid_$58) || (NIL != the_root));
					    }
					} finally {
					    final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
					    try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						if (NIL != final_index_iterator) {
						    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
						}
						restoreValuesFromVector(_values);
					    } finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
					    }
					}
				    }
				    done_var = makeBoolean((NIL == valid) || (NIL != the_root));
				}
			    }
			    csome_list_var = csome_list_var.rest();
			    wu = csome_list_var.first();
			}
		    }
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$55, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$54, thread);
		}
	    } else if (NIL != string_utilities.ends_with(string, $$$ion, UNPROVIDED)) {
		if (NIL == the_root) {
		    SubLObject csome_list_var2 = lexicon_accessors.words_of_stringXpred(string, $$singular, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    SubLObject wu2 = NIL;
		    wu2 = csome_list_var2.first();
		    while ((NIL == the_root) && (NIL != csome_list_var2)) {
			if (NIL != kb_mapping.gather_gaf_arg_index(wu2, ONE_INTEGER, $$agentive_Sg, UNPROVIDED, UNPROVIDED)) {
			    SubLObject inf2 = NIL;
			    final SubLObject pred_var2 = $$infinitive;
			    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu2, ONE_INTEGER, pred_var2)) {
				final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu2, ONE_INTEGER, pred_var2);
				SubLObject done_var2 = the_root;
				final SubLObject token_var2 = NIL;
				while (NIL == done_var2) {
				    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
				    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
				    if (NIL != valid2) {
					SubLObject final_index_iterator2 = NIL;
					try {
					    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
					    SubLObject done_var_$57 = the_root;
					    final SubLObject token_var_$58 = NIL;
					    while (NIL == done_var_$57) {
						final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$58);
						final SubLObject valid_$59 = makeBoolean(!token_var_$58.eql(assertion2));
						if (NIL != valid_$59) {
						    inf2 = the_root = assertions_high.gaf_arg(assertion2, TWO_INTEGER);
						}
						done_var_$57 = makeBoolean((NIL == valid_$59) || (NIL != the_root));
					    }
					} finally {
					    final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
					    try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL != final_index_iterator2) {
						    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
						}
						restoreValuesFromVector(_values2);
					    } finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
					    }
					}
				    }
				    done_var2 = makeBoolean((NIL == valid2) || (NIL != the_root));
				}
			    }
			}
			csome_list_var2 = csome_list_var2.rest();
			wu2 = csome_list_var2.first();
		    }
		}
	    } else if (NIL != string_utilities.ends_with(string, $$$ment, UNPROVIDED)) {
		if (NIL == the_root) {
		    SubLObject csome_list_var2 = lexicon_accessors.words_of_stringXpred(string, $$nounStrings, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    SubLObject wu2 = NIL;
		    wu2 = csome_list_var2.first();
		    while ((NIL == the_root) && (NIL != csome_list_var2)) {
			SubLObject inf2 = NIL;
			final SubLObject pred_var2 = $$infinitive;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu2, ONE_INTEGER, pred_var2)) {
			    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu2, ONE_INTEGER, pred_var2);
			    SubLObject done_var2 = the_root;
			    final SubLObject token_var2 = NIL;
			    while (NIL == done_var2) {
				final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
				final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
				if (NIL != valid2) {
				    SubLObject final_index_iterator2 = NIL;
				    try {
					final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
					SubLObject done_var_$58 = the_root;
					final SubLObject token_var_$59 = NIL;
					while (NIL == done_var_$58) {
					    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$59);
					    final SubLObject valid_$60 = makeBoolean(!token_var_$59.eql(assertion2));
					    if (NIL != valid_$60) {
						inf2 = the_root = assertions_high.gaf_arg(assertion2, TWO_INTEGER);
					    }
					    done_var_$58 = makeBoolean((NIL == valid_$60) || (NIL != the_root));
					}
				    } finally {
					final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
					    $is_thread_performing_cleanupP$.bind(T, thread);
					    final SubLObject _values3 = getValuesAsVector();
					    if (NIL != final_index_iterator2) {
						kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
					    }
					    restoreValuesFromVector(_values3);
					} finally {
					    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
					}
				    }
				}
				done_var2 = makeBoolean((NIL == valid2) || (NIL != the_root));
			    }
			}
			csome_list_var2 = csome_list_var2.rest();
			wu2 = csome_list_var2.first();
		    }
		}
	    } else {
		has_deverbal_endingP = NIL;
	    }

	    if ((((NIL != use_mass_fallback_if_neededP) || (NIL != has_deverbal_endingP)) && (NIL == the_root)) && (NIL == the_root)) {
		SubLObject csome_list_var2 = lexicon_accessors.words_of_stringXpred(string, $$massNumber, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject wu2 = NIL;
		wu2 = csome_list_var2.first();
		while ((NIL == the_root) && (NIL != csome_list_var2)) {
		    SubLObject inf2 = NIL;
		    final SubLObject pred_var2 = $$infinitive;
		    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu2, ONE_INTEGER, pred_var2)) {
			final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu2, ONE_INTEGER, pred_var2);
			SubLObject done_var2 = the_root;
			final SubLObject token_var2 = NIL;
			while (NIL == done_var2) {
			    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
			    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
			    if (NIL != valid2) {
				SubLObject final_index_iterator2 = NIL;
				try {
				    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
				    SubLObject done_var_$59 = the_root;
				    final SubLObject token_var_$60 = NIL;
				    while (NIL == done_var_$59) {
					final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$60);
					final SubLObject valid_$61 = makeBoolean(!token_var_$60.eql(assertion2));
					if (NIL != valid_$61) {
					    inf2 = the_root = assertions_high.gaf_arg(assertion2, TWO_INTEGER);
					}
					done_var_$59 = makeBoolean((NIL == valid_$61) || (NIL != the_root));
				    }
				} finally {
				    final SubLObject _prev_bind_0_$58 = $is_thread_performing_cleanupP$.currentBinding(thread);
				    try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values4 = getValuesAsVector();
					if (NIL != final_index_iterator2) {
					    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
					}
					restoreValuesFromVector(_values4);
				    } finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
				    }
				}
			    }
			    done_var2 = makeBoolean((NIL == valid2) || (NIL != the_root));
			}
		    }
		    csome_list_var2 = csome_list_var2.rest();
		    wu2 = csome_list_var2.first();
		}
	    }
	} finally {
	    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
	    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
	}
	return the_root;
    }

    /**
     *
     *
     * @param STRINGP
     * 		
     * @return BOOLEANP ; true if the string might be a deverbal, e.g., 'drug smuggling', but not 'pirate smuggling'
     */
    @LispMethod(comment = "@param STRINGP\r\n\t\t\r\n@return BOOLEANP ; true if the string might be a deverbal, e.g., \'drug smuggling\', but not \'pirate smuggling\'")
    public static final SubLObject rbp_deverbal_candidateP_alt(SubLObject string) {
	SubLTrampolineFile.checkType(string, STRINGP);
	{
	    SubLObject exploded = string_utilities.split_string(string, UNPROVIDED);
	    SubLObject okP = NIL;
	    if (NIL == list_utilities.lengthE(exploded, TWO_INTEGER, UNPROVIDED)) {
		return NIL;
	    }
	    {
		SubLObject datum = exploded;
		SubLObject current = datum;
		SubLObject mod = NIL;
		SubLObject head = NIL;
		destructuring_bind_must_consp(current, datum, $list_alt323);
		mod = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt323);
		head = current.first();
		current = current.rest();
		if (NIL == current) {
		    if ((NIL != list_utilities.lengthE(mod, ONE_INTEGER, UNPROVIDED)) || (NIL != list_utilities.lengthE(head, ONE_INTEGER, UNPROVIDED))) {
			okP = NIL;
		    } else {
			okP = list_utilities.sublisp_boolean(rbp_get_deverbal_root(head, UNPROVIDED));
		    }
		} else {
		    cdestructuring_bind_error(datum, $list_alt323);
		}
	    }
	    return okP;
	}
    }

    /**
     *
     *
     * @param STRINGP
     * 		
     * @return BOOLEANP ; true if the string might be a deverbal, e.g., 'drug smuggling', but not 'pirate smuggling'
     */
    @LispMethod(comment = "@param STRINGP\r\n\t\t\r\n@return BOOLEANP ; true if the string might be a deverbal, e.g., \'drug smuggling\', but not \'pirate smuggling\'")
    public static SubLObject rbp_deverbal_candidateP(final SubLObject string) {
	assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
	final SubLObject exploded = string_utilities.split_string(string, UNPROVIDED);
	SubLObject okP = NIL;
	if (NIL == list_utilities.lengthE(exploded, TWO_INTEGER, UNPROVIDED)) {
	    return NIL;
	}
	SubLObject current;
	final SubLObject datum = current = exploded;
	SubLObject mod = NIL;
	SubLObject head = NIL;
	destructuring_bind_must_consp(current, datum, $list280);
	mod = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list280);
	head = current.first();
	current = current.rest();
	if (NIL == current) {
	    if ((NIL != list_utilities.lengthE(mod, ONE_INTEGER, UNPROVIDED)) || (NIL != list_utilities.lengthE(head, ONE_INTEGER, UNPROVIDED))) {
		okP = NIL;
	    } else {
		okP = list_utilities.sublisp_boolean(rbp_get_deverbal_root(head, UNPROVIDED));
	    }
	} else {
	    cdestructuring_bind_error(datum, $list280);
	}
	return okP;
    }

    public static final SubLObject parse_deverbal_compound_as_fallback_alt(SubLObject string, SubLObject limit) {
	if (limit == UNPROVIDED) {
	    limit = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != rbp_deverbal_candidateP(string)) {
		{
		    SubLObject filtered = rbp_apply_filter_cluster($rbp_deverbal_boolean_filters$.getDynamicValue(thread), $BOOLEAN, rbp_deverbal_fallback(string), FIRST, $NONE, UNPROVIDED);
		    filtered = rbp_apply_filter_cluster($rbp_deverbal_macroscopic_filters$.getDynamicValue(thread), $MACROSCOPIC, Mapping.mapcar(FIRST, filtered), FIRST, $NONE, UNPROVIDED);
		    thread.resetMultipleValues();
		    {
			SubLObject bad = list_utilities.partition_list(filtered, SECOND);
			SubLObject good = thread.secondMultipleValue();
			thread.resetMultipleValues();
			return values(Mapping.mapcar(FIRST, good), bad);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject parse_deverbal_compound_as_fallback(final SubLObject string, SubLObject limit) {
	if (limit == UNPROVIDED) {
	    limit = NIL;
	}
	return NIL;
    }

    public static final SubLObject parse_deverbal_compound_with_fallback_alt(SubLObject string, SubLObject complete_onlyP, SubLObject limit) {
	if (complete_onlyP == UNPROVIDED) {
	    complete_onlyP = T;
	}
	if (limit == UNPROVIDED) {
	    limit = $int$1000;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject good = parse_noun_compound(string, complete_onlyP, limit);
		SubLObject bad = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != good) {
		    return values(good, bad);
		}
	    }
	    return parse_deverbal_compound_as_fallback(string, UNPROVIDED);
	}
    }

    public static SubLObject parse_deverbal_compound_with_fallback(final SubLObject string, SubLObject complete_onlyP, SubLObject limit) {
	if (complete_onlyP == UNPROVIDED) {
	    complete_onlyP = T;
	}
	if (limit == UNPROVIDED) {
	    limit = $int$1000;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	thread.resetMultipleValues();
	final SubLObject good = parse_noun_compound(string, complete_onlyP, limit);
	final SubLObject bad = thread.secondMultipleValue();
	thread.resetMultipleValues();
	if (NIL != good) {
	    return values(good, bad);
	}
	return parse_deverbal_compound_as_fallback(string, UNPROVIDED);
    }

    public static final SubLObject date_parse_block_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject date_parse_block_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject date_parse_block_p_alt(SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.noun_compound_parser.$date_parse_block_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject date_parse_block_p(final SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.noun_compound_parser.$date_parse_block_native.class ? T : NIL;
    }

    public static final SubLObject date_parse_block_subcol_naut_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, DATE_PARSE_BLOCK_P);
	return v_object.getField2();
    }

    public static SubLObject date_parse_block_subcol_naut(final SubLObject v_object) {
	assert NIL != date_parse_block_p(v_object) : "! noun_compound_parser.date_parse_block_p(v_object) " + "noun_compound_parser.date_parse_block_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject date_parse_block_confidence_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, DATE_PARSE_BLOCK_P);
	return v_object.getField3();
    }

    public static SubLObject date_parse_block_confidence(final SubLObject v_object) {
	assert NIL != date_parse_block_p(v_object) : "! noun_compound_parser.date_parse_block_p(v_object) " + "noun_compound_parser.date_parse_block_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject _csetf_date_parse_block_subcol_naut_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, DATE_PARSE_BLOCK_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_date_parse_block_subcol_naut(final SubLObject v_object, final SubLObject value) {
	assert NIL != date_parse_block_p(v_object) : "! noun_compound_parser.date_parse_block_p(v_object) " + "noun_compound_parser.date_parse_block_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_date_parse_block_confidence_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, DATE_PARSE_BLOCK_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_date_parse_block_confidence(final SubLObject v_object, final SubLObject value) {
	assert NIL != date_parse_block_p(v_object) : "! noun_compound_parser.date_parse_block_p(v_object) " + "noun_compound_parser.date_parse_block_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject make_date_parse_block_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new com.cyc.cycjava.cycl.noun_compound_parser.$date_parse_block_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($SUBCOL_NAUT)) {
			_csetf_date_parse_block_subcol_naut(v_new, current_value);
		    } else {
			if (pcase_var.eql($CONFIDENCE)) {
			    _csetf_date_parse_block_confidence(v_new, current_value);
			} else {
			    Errors.error($str_alt24$Invalid_slot__S_for_construction_, current_arg);
			}
		    }
		}
	    }
	    return v_new;
	}
    }

    public static SubLObject make_date_parse_block(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new com.cyc.cycjava.cycl.noun_compound_parser.$date_parse_block_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($SUBCOL_NAUT)) {
		_csetf_date_parse_block_subcol_naut(v_new, current_value);
	    } else if (pcase_var.eql($CONFIDENCE)) {
		_csetf_date_parse_block_confidence(v_new, current_value);
	    } else {
		Errors.error($str25$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_date_parse_block(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_DATE_PARSE_BLOCK, TWO_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $SUBCOL_NAUT, date_parse_block_subcol_naut(obj));
	funcall(visitor_fn, obj, $SLOT, $CONFIDENCE, date_parse_block_confidence(obj));
	funcall(visitor_fn, obj, $END, MAKE_DATE_PARSE_BLOCK, TWO_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_date_parse_block_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_date_parse_block(obj, visitor_fn);
    }

    public static final SubLObject new_date_parse_block_alt(SubLObject naut, SubLObject confidence) {
	if ((NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(naut)) && (NIL != rbp_wff.npp_genl_predP(parsing_utilities.subcollection_function_naut_pred(naut), $$dateOfEvent))) {
	    {
		SubLObject block = make_date_parse_block(UNPROVIDED);
		_csetf_date_parse_block_subcol_naut(block, naut);
		_csetf_date_parse_block_confidence(block, confidence);
		return block;
	    }
	}
	return NIL;
    }

    public static SubLObject new_date_parse_block(final SubLObject naut, final SubLObject confidence) {
	if ((NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(naut)) && (NIL != rbp_wff.npp_genl_predP(parsing_utilities.subcollection_function_naut_pred(naut), $$dateOfEvent))) {
	    final SubLObject block = make_date_parse_block(UNPROVIDED);
	    _csetf_date_parse_block_subcol_naut(block, naut);
	    _csetf_date_parse_block_confidence(block, confidence);
	    return block;
	}
	return NIL;
    }

    public static final SubLObject new_date_parse_block_for_denot_and_date_alt(SubLObject denot, SubLObject date, SubLObject base_confidence, SubLObject raw_confidenceP) {
	if (raw_confidenceP == UNPROVIDED) {
	    raw_confidenceP = NIL;
	}
	return new_date_parse_block(list($$SubcollectionOfWithRelationToFn, denot, $$dateOfEvent, date), NIL != raw_confidenceP ? ((SubLObject) (base_confidence)) : date_confidence_adjusted_for_year(base_confidence, date));
    }

    public static SubLObject new_date_parse_block_for_denot_and_date(final SubLObject denot, final SubLObject date, final SubLObject base_confidence, SubLObject raw_confidenceP) {
	if (raw_confidenceP == UNPROVIDED) {
	    raw_confidenceP = NIL;
	}
	return new_date_parse_block(list($$SubcollectionOfWithRelationToFn, denot, $$dateOfEvent, date), NIL != raw_confidenceP ? base_confidence : date_confidence_adjusted_for_year(base_confidence, date));
    }

    public static final SubLObject date_parse_complexity_G_alt(SubLObject parse1, SubLObject parse2) {
	return numG(length(list_utilities.tree_positions($$YearFn, parsing_utilities.subcollection_function_naut_to_arg(parse1), UNPROVIDED, UNPROVIDED).first()),
		length(list_utilities.tree_positions($$YearFn, parsing_utilities.subcollection_function_naut_to_arg(parse2), UNPROVIDED, UNPROVIDED).first()));
    }

    public static SubLObject date_parse_complexity_G(final SubLObject parse1, final SubLObject parse2) {
	return numG(length(list_utilities.tree_positions($$YearFn, parsing_utilities.subcollection_function_naut_to_arg(parse1), UNPROVIDED, UNPROVIDED).first()),
		length(list_utilities.tree_positions($$YearFn, parsing_utilities.subcollection_function_naut_to_arg(parse2), UNPROVIDED, UNPROVIDED).first()));
    }

    public static final SubLObject date_confidence_adjusted_for_year_alt(SubLObject base, SubLObject parse_date) {
	return multiply(base, divide(date_utilities.extract_date_year(parse_date), date_utilities.extract_date_year(date_utilities.universal_time_to_cycl_date(get_universal_time()))));
    }

    public static SubLObject date_confidence_adjusted_for_year(final SubLObject base, final SubLObject parse_date) {
	return multiply(base, divide(date_utilities.extract_date_year(parse_date), date_utilities.extract_date_year(date_utilities.universal_time_to_cycl_date(get_universal_time()))));
    }

    public static final SubLObject date_parse_list_incorporate_frequency_alt(SubLObject blocks, SubLObject parse_counts) {
	{
	    SubLObject avg = number_utilities.average(dictionary.dictionary_values(parse_counts), UNPROVIDED);
	    SubLObject cdolist_list_var = blocks;
	    SubLObject block = NIL;
	    for (block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), block = cdolist_list_var.first()) {
		_csetf_date_parse_block_confidence(block, multiply(date_parse_block_confidence(block), divide(dictionary.dictionary_lookup(parse_counts, parsing_utilities.subcollection_function_naut_to_arg(date_parse_block_subcol_naut(block)), UNPROVIDED), avg)));
	    }
	    return blocks;
	}
    }

    public static SubLObject date_parse_list_incorporate_frequency(final SubLObject blocks, final SubLObject parse_counts) {
	final SubLObject avg = number_utilities.average(dictionary.dictionary_values(parse_counts), UNPROVIDED);
	SubLObject cdolist_list_var = blocks;
	SubLObject block = NIL;
	block = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    _csetf_date_parse_block_confidence(block, multiply(date_parse_block_confidence(block), divide(dictionary.dictionary_lookup(parse_counts, parsing_utilities.subcollection_function_naut_to_arg(date_parse_block_subcol_naut(block)), UNPROVIDED), avg)));
	    cdolist_list_var = cdolist_list_var.rest();
	    block = cdolist_list_var.first();
	}
	return blocks;
    }

    public static final SubLObject parse_string_as_date_fallback_alt(SubLObject string, SubLObject one_answerP, SubLObject incorporate_frequencyP) {
	if (one_answerP == UNPROVIDED) {
	    one_answerP = T;
	}
	if (incorporate_frequencyP == UNPROVIDED) {
	    incorporate_frequencyP = T;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject tokens_reversed = reverse(standard_tokenization.standard_string_tokenize(string));
		SubLObject parse_counts = dictionary.new_dictionary(EQUAL, UNPROVIDED);
		SubLObject blocks = NIL;
		SubLObject v_core = NIL;
		SubLObject answers = NIL;
		while ((NIL != tokens_reversed) && (NIL == blocks)) {
		    v_core = cons(tokens_reversed.first(), v_core);
		    tokens_reversed = tokens_reversed.rest();
		    {
			SubLObject dates = date_utilities.parse_date_from_string_fast(string_utilities.bunge(reverse(tokens_reversed), UNPROVIDED), one_answerP, NIL, T);
			if (NIL != dates) {
			    {
				SubLObject denots = parse_as_denot_or_noun_compound(string_utilities.bunge(v_core, UNPROVIDED), UNPROVIDED);
				if (NIL != denots) {
				    {
					SubLObject cdolist_list_var = dates;
					SubLObject date = NIL;
					for (date = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), date = cdolist_list_var.first()) {
					    {
						SubLObject the_vars = list_utilities.tree_find_all_if(EL_VARIABLE_P, date, UNPROVIDED);
						SubLObject cdolist_list_var_74 = denots;
						SubLObject denot = NIL;
						for (denot = cdolist_list_var_74.first(); NIL != cdolist_list_var_74; cdolist_list_var_74 = cdolist_list_var_74.rest(), denot = cdolist_list_var_74.first()) {
						    if (NIL == genls.genlP(denot, $$Event, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread), UNPROVIDED)) {
						    } else {
							if (NIL == the_vars) {
							    dictionary_utilities.dictionary_increment(parse_counts, date, UNPROVIDED);
							    {
								SubLObject item_var = new_date_parse_block_for_denot_and_date(denot, date, $rbp_high_date_confidence$.getDynamicValue(thread), UNPROVIDED);
								if (NIL == member(item_var, blocks, symbol_function(EQUALP), symbol_function(IDENTITY))) {
								    blocks = cons(item_var, blocks);
								}
							    }
							} else {
							    if (NIL != list_utilities.singletonP(the_vars)) {
								{
								    SubLObject cdolist_list_var_75 = ask_utilities.ask_template(list($sym346$_EVENT, the_vars.first()), list($$and, list($$isa, $sym346$_EVENT, denot), list($$dateOfEvent, $sym346$_EVENT, date)),
									    parsing_vars.$parsing_domain_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								    SubLObject v_answer = NIL;
								    for (v_answer = cdolist_list_var_75.first(); NIL != cdolist_list_var_75; cdolist_list_var_75 = cdolist_list_var_75.rest(), v_answer = cdolist_list_var_75.first()) {
									{
									    SubLObject datum = v_answer;
									    SubLObject current = datum;
									    SubLObject event = NIL;
									    SubLObject date_var = NIL;
									    destructuring_bind_must_consp(current, datum, $list_alt345);
									    event = current.first();
									    current = current.rest();
									    destructuring_bind_must_consp(current, datum, $list_alt345);
									    date_var = current.first();
									    current = current.rest();
									    if (NIL == current) {
										{
										    SubLObject date_nart = list_utilities.tree_substitute(date, the_vars.first(), date_var);
										    dictionary_utilities.dictionary_increment(parse_counts, date_nart, UNPROVIDED);
										    {
											SubLObject item_var = new_date_parse_block_for_denot_and_date(denot, date_nart,
												NIL != constant_p(event) ? ((SubLObject) ($rbp_high_date_confidence$.getDynamicValue(thread))) : $rbp_low_date_confidence$.getDynamicValue(thread), UNPROVIDED);
											if (NIL == member(item_var, blocks, symbol_function(EQUALP), symbol_function(IDENTITY))) {
											    blocks = cons(item_var, blocks);
											}
										    }
										}
									    } else {
										cdestructuring_bind_error(datum, $list_alt345);
									    }
									}
								    }
								}
							    } else {
								Errors.warn($str_alt349$_____todo_handle_dates_with_multi);
							    }
							}
						    }
						}
					    }
					}
				    }
				}
			    }
			}
		    }
		}
		if (NIL != incorporate_frequencyP) {
		    date_parse_list_incorporate_frequency(blocks, parse_counts);
		}
		{
		    SubLObject sorted = Sort.sort(Sort.sort(blocks, $sym129$_, DATE_PARSE_BLOCK_CONFIDENCE), $sym350$DATE_PARSE_COMPLEXITY__, DATE_PARSE_BLOCK_SUBCOL_NAUT);
		    SubLObject cdolist_list_var = sorted;
		    SubLObject parse = NIL;
		    for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), parse = cdolist_list_var.first()) {
			if (NIL != $rbp_return_confidenceP$.getDynamicValue(thread)) {
			    {
				SubLObject item_var = list(date_parse_block_subcol_naut(parse), $rbp_date_fallback_identifier$.getDynamicValue(thread), date_parse_block_confidence(parse));
				if (NIL == member(item_var, answers, EQUALP, symbol_function(IDENTITY))) {
				    answers = cons(item_var, answers);
				}
			    }
			} else {
			    {
				SubLObject item_var = list(date_parse_block_subcol_naut(parse), $rbp_date_fallback_identifier$.getDynamicValue(thread));
				if (NIL == member(item_var, answers, EQUALP, symbol_function(IDENTITY))) {
				    answers = cons(item_var, answers);
				}
			    }
			}
		    }
		}
		return reverse(answers);
	    }
	}
    }

    public static SubLObject parse_string_as_date_fallback(final SubLObject string, SubLObject one_answerP, SubLObject incorporate_frequencyP) {
	if (one_answerP == UNPROVIDED) {
	    one_answerP = T;
	}
	if (incorporate_frequencyP == UNPROVIDED) {
	    incorporate_frequencyP = T;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject tokens_reversed = reverse(standard_tokenization.standard_string_tokenize(string));
	final SubLObject parse_counts = dictionary.new_dictionary(EQUAL, UNPROVIDED);
	SubLObject blocks = NIL;
	SubLObject v_core = NIL;
	SubLObject answers = NIL;
	while ((NIL != tokens_reversed) && (NIL == blocks)) {
	    v_core = cons(tokens_reversed.first(), v_core);
	    tokens_reversed = tokens_reversed.rest();
	    final SubLObject dates = date_utilities.parse_date_from_string_fast(string_utilities.bunge(reverse(tokens_reversed), UNPROVIDED), one_answerP, NIL, T);
	    if (NIL != dates) {
		final SubLObject denots = parse_as_denot_or_noun_compound(string_utilities.bunge(v_core, UNPROVIDED), UNPROVIDED);
		if (NIL == denots) {
		    continue;
		}
		SubLObject cdolist_list_var = dates;
		SubLObject date = NIL;
		date = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    final SubLObject the_vars = list_utilities.tree_find_all_if(EL_VARIABLE_P, date, UNPROVIDED);
		    SubLObject cdolist_list_var_$72 = denots;
		    SubLObject denot = NIL;
		    denot = cdolist_list_var_$72.first();
		    while (NIL != cdolist_list_var_$72) {
			if (NIL != genls.genlP(denot, $$Event, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread), UNPROVIDED)) {
			    if (NIL == the_vars) {
				dictionary_utilities.dictionary_increment(parse_counts, date, UNPROVIDED);
				final SubLObject item_var = new_date_parse_block_for_denot_and_date(denot, date, $rbp_high_date_confidence$.getDynamicValue(thread), UNPROVIDED);
				if (NIL == member(item_var, blocks, symbol_function(EQUALP), symbol_function(IDENTITY))) {
				    blocks = cons(item_var, blocks);
				}
			    } else if (NIL != list_utilities.singletonP(the_vars)) {
				SubLObject cdolist_list_var_$73 = ask_utilities.ask_template(list($sym306$_EVENT, the_vars.first()), list($$and, list($$isa, $sym306$_EVENT, denot), list($$dateOfEvent, $sym306$_EVENT, date)), parsing_vars.$parsing_domain_mt$.getDynamicValue(thread), UNPROVIDED,
					UNPROVIDED, UNPROVIDED, UNPROVIDED);
				SubLObject v_answer = NIL;
				v_answer = cdolist_list_var_$73.first();
				while (NIL != cdolist_list_var_$73) {
				    SubLObject current;
				    final SubLObject datum = current = v_answer;
				    SubLObject event = NIL;
				    SubLObject date_var = NIL;
				    destructuring_bind_must_consp(current, datum, $list305);
				    event = current.first();
				    current = current.rest();
				    destructuring_bind_must_consp(current, datum, $list305);
				    date_var = current.first();
				    current = current.rest();
				    if (NIL == current) {
					final SubLObject date_nart = list_utilities.tree_substitute(date, the_vars.first(), date_var);
					dictionary_utilities.dictionary_increment(parse_counts, date_nart, UNPROVIDED);
					final SubLObject item_var2 = new_date_parse_block_for_denot_and_date(denot, date_nart, NIL != constant_p(event) ? $rbp_high_date_confidence$.getDynamicValue(thread) : $rbp_low_date_confidence$.getDynamicValue(thread), UNPROVIDED);
					if (NIL == member(item_var2, blocks, symbol_function(EQUALP), symbol_function(IDENTITY))) {
					    blocks = cons(item_var2, blocks);
					}
				    } else {
					cdestructuring_bind_error(datum, $list305);
				    }
				    cdolist_list_var_$73 = cdolist_list_var_$73.rest();
				    v_answer = cdolist_list_var_$73.first();
				}
			    } else {
				Errors.warn($str309$_____todo_handle_dates_with_multi);
			    }

			}
			cdolist_list_var_$72 = cdolist_list_var_$72.rest();
			denot = cdolist_list_var_$72.first();
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    date = cdolist_list_var.first();
		}
	    }
	}
	if (NIL != incorporate_frequencyP) {
	    date_parse_list_incorporate_frequency(blocks, parse_counts);
	}
	SubLObject cdolist_list_var2;
	final SubLObject sorted = cdolist_list_var2 = Sort.sort(Sort.sort(blocks, $sym124$_, DATE_PARSE_BLOCK_CONFIDENCE), $sym310$DATE_PARSE_COMPLEXITY__, DATE_PARSE_BLOCK_SUBCOL_NAUT);
	SubLObject parse = NIL;
	parse = cdolist_list_var2.first();
	while (NIL != cdolist_list_var2) {
	    if (NIL != $rbp_return_confidenceP$.getDynamicValue(thread)) {
		final SubLObject item_var3 = list(date_parse_block_subcol_naut(parse), $rbp_date_fallback_identifier$.getDynamicValue(thread), date_parse_block_confidence(parse));
		if (NIL == member(item_var3, answers, EQUALP, symbol_function(IDENTITY))) {
		    answers = cons(item_var3, answers);
		}
	    } else {
		final SubLObject item_var3 = list(date_parse_block_subcol_naut(parse), $rbp_date_fallback_identifier$.getDynamicValue(thread));
		if (NIL == member(item_var3, answers, EQUALP, symbol_function(IDENTITY))) {
		    answers = cons(item_var3, answers);
		}
	    }
	    cdolist_list_var2 = cdolist_list_var2.rest();
	    parse = cdolist_list_var2.first();
	}
	return reverse(answers);
    }

    public static final SubLObject parse_noun_compound_with_date_fallback_alt(SubLObject string, SubLObject complete_onlyP, SubLObject limit) {
	if (complete_onlyP == UNPROVIDED) {
	    complete_onlyP = T;
	}
	if (limit == UNPROVIDED) {
	    limit = $int$1000;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject good = parse_noun_compound(string, complete_onlyP, limit);
		SubLObject bad = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != good) {
		    return values(good, bad);
		}
	    }
	    return parse_string_as_date_fallback(string, UNPROVIDED, UNPROVIDED);
	}
    }

    public static SubLObject parse_noun_compound_with_date_fallback(final SubLObject string, SubLObject complete_onlyP, SubLObject limit) {
	if (complete_onlyP == UNPROVIDED) {
	    complete_onlyP = T;
	}
	if (limit == UNPROVIDED) {
	    limit = $int$1000;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	thread.resetMultipleValues();
	final SubLObject good = parse_noun_compound(string, complete_onlyP, limit);
	final SubLObject bad = thread.secondMultipleValue();
	thread.resetMultipleValues();
	if (NIL != good) {
	    return values(good, bad);
	}
	return parse_string_as_date_fallback(string, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rbp_parse_filter_nonagentive_actors_alt(SubLObject parse_naut) {
	{
	    SubLObject problem = NIL;
	    if (((NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parse_naut)) && (NIL != rbp_wff.npp_genl_predP(parsing_utilities.subcollection_function_naut_pred(parse_naut), $$doneBy)))
		    && (NIL != rbp_wff.npp_not_disjointP(parsing_utilities.subcollection_function_naut_from_arg(parse_naut), $$Action, rbp_domain_mt()))) {
		{
		    SubLObject bogusP = NIL;
		    SubLObject func = cycl_utilities.formula_arg0(parse_naut);
		    if (NIL != isa.isa_in_any_mtP(func, $const195$SubcollectionRelationFunction_Ins)) {
			if (NIL == rbp_wff.npp_isaP(parsing_utilities.subcollection_function_naut_to_arg(parse_naut), $$Agent_Generic, rbp_domain_mt())) {
			    bogusP = T;
			}
		    } else {
			if (NIL != isa.isa_in_any_mtP(func, $const138$SubcollectionRelationFunction_Typ)) {
			    if (NIL == rbp_wff.npp_genlP(parsing_utilities.subcollection_function_naut_to_arg(parse_naut), $$Agent_Generic, rbp_domain_mt())) {
				bogusP = T;
			    }
			}
		    }
		    if (NIL != bogusP) {
			problem = $str_alt371$rbp_parse_filter_nonagentive_acto;
		    }
		}
	    }
	    return problem;
	}
    }

    public static SubLObject rbp_parse_filter_nonagentive_actors(final SubLObject parse_naut) {
	SubLObject problem = NIL;
	if (((NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parse_naut)) && (NIL != rbp_wff.npp_genl_predP(parsing_utilities.subcollection_function_naut_pred(parse_naut), $$doneBy)))
		&& (NIL != rbp_wff.npp_not_disjointP(parsing_utilities.subcollection_function_naut_from_arg(parse_naut), $$Action, rbp_domain_mt()))) {
	    SubLObject bogusP = NIL;
	    final SubLObject func = cycl_utilities.formula_arg0(parse_naut);
	    if (NIL != isa.isa_in_any_mtP(func, $const191$SubcollectionRelationFunction_Ins)) {
		if (NIL == rbp_wff.npp_isaP(parsing_utilities.subcollection_function_naut_to_arg(parse_naut), $$Agent_Generic, rbp_domain_mt())) {
		    bogusP = T;
		}
	    } else if ((NIL != isa.isa_in_any_mtP(func, $const133$SubcollectionRelationFunction_Typ)) && (NIL == rbp_wff.npp_genlP(parsing_utilities.subcollection_function_naut_to_arg(parse_naut), $$Agent_Generic, rbp_domain_mt()))) {
		bogusP = T;
	    }

	    if (NIL != bogusP) {
		problem = $str314$rbp_parse_filter_nonagentive_acto;
	    }
	}
	return problem;
    }

    public static final SubLObject rbp_matches_any_all_exists_gafsP_alt(SubLObject target_pred, SubLObject from_arg, SubLObject to_arg, SubLObject type_level_fromP, SubLObject type_level_toP, SubLObject head) {
	while (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(from_arg)) {
	    from_arg = cycl_utilities.nat_arg1(from_arg, UNPROVIDED);
	}
	while (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(to_arg)) {
	    to_arg = cycl_utilities.nat_arg1(to_arg, UNPROVIDED);
	}
	{
	    SubLObject non_head = (head == $FROM) ? ((SubLObject) ($TO)) : $FROM;
	    return makeBoolean((NIL != rbp_all_exists_matches(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, head, UNPROVIDED)) || (NIL != rbp_all_exists_matches(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, non_head, UNPROVIDED)));
	}
    }

    public static SubLObject rbp_matches_any_all_exists_gafsP(final SubLObject target_pred, SubLObject from_arg, SubLObject to_arg, final SubLObject type_level_fromP, final SubLObject type_level_toP, final SubLObject head) {
	while (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(from_arg)) {
	    from_arg = cycl_utilities.nat_arg1(from_arg, UNPROVIDED);
	}
	while (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(to_arg)) {
	    to_arg = cycl_utilities.nat_arg1(to_arg, UNPROVIDED);
	}
	final SubLObject non_head = (head == $FROM) ? $TO : $FROM;
	return makeBoolean((NIL != rbp_all_exists_matches(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, head, UNPROVIDED)) || (NIL != rbp_all_exists_matches(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, non_head, UNPROVIDED)));
    }

    /**
     * Check whether the FOCUS arg is expected.
     *
     * @return LISTP; of expectations it matches.
     */
    @LispMethod(comment = "Check whether the FOCUS arg is expected.\r\n\r\n@return LISTP; of expectations it matches.")
    public static final SubLObject rbp_all_exists_matches_internal_alt(SubLObject target_pred, SubLObject from_arg, SubLObject to_arg, SubLObject type_level_fromP, SubLObject type_level_toP, SubLObject focus, SubLObject reversedP) {
	if (reversedP == UNPROVIDED) {
	    reversedP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject query_sentence = rbp_matches_any_all_exists_gafs_query_sentence(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus);
		SubLObject mt = $$InferencePSC;
		SubLObject max_time = $rbp_rae_max_time$.getDynamicValue(thread);
		SubLObject query_properties = list($MAX_NUMBER, ONE_INTEGER, $MAX_TIME, max_time, $PROBLEM_STORE, $ncp_problem_store$.getDynamicValue(thread), $RETURN, list($TEMPLATE, $sym379$_TYPE));
		thread.resetMultipleValues();
		{
		    SubLObject types = inference_kernel.new_cyc_query(query_sentence, mt, query_properties);
		    SubLObject exit_status = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if ($MAX_TIME == exit_status) {
			Errors.warn($str_alt380$Timed_out_checking___relationAllE, new SubLObject[] { max_time, target_pred, from_arg, to_arg });
		    }
		    if (((NIL == types) && (NIL == reversedP)) && (NIL != isa.isaP(target_pred, $$SymmetricBinaryPredicate, UNPROVIDED, UNPROVIDED))) {
			types = rbp_all_exists_matches(target_pred, to_arg, from_arg, type_level_toP, type_level_fromP, focus == $FROM ? ((SubLObject) ($TO)) : $FROM, T);
		    }
		    return types;
		}
	    }
	}
    }

    @LispMethod(comment = "Check whether the FOCUS arg is expected.\r\n\r\n@return LISTP; of expectations it matches.")
    public static SubLObject rbp_all_exists_matches_internal(final SubLObject target_pred, final SubLObject from_arg, final SubLObject to_arg, final SubLObject type_level_fromP, final SubLObject type_level_toP, final SubLObject focus, SubLObject reversedP) {
	if (reversedP == UNPROVIDED) {
	    reversedP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject query_sentence = rbp_matches_any_all_exists_gafs_query_sentence(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus);
	final SubLObject mt = $$InferencePSC;
	final SubLObject max_time = $rbp_rae_max_time$.getDynamicValue(thread);
	final SubLObject query_properties = list($MAX_NUMBER, ONE_INTEGER, $MAX_TIME, max_time, $PROBLEM_STORE, $ncp_problem_store$.getDynamicValue(thread), $RETURN, list($TEMPLATE, $sym323$_TYPE));
	thread.resetMultipleValues();
	SubLObject types = inference_kernel.new_cyc_query(query_sentence, mt, query_properties);
	final SubLObject exit_status = thread.secondMultipleValue();
	thread.resetMultipleValues();
	if ($MAX_TIME == exit_status) {
	    Errors.warn($str324$Timed_out_checking___relationAllE, new SubLObject[] { max_time, target_pred, from_arg, to_arg });
	}
	if (((NIL == types) && (NIL == reversedP)) && (NIL != isa.isaP(target_pred, $$SymmetricBinaryPredicate, UNPROVIDED, UNPROVIDED))) {
	    types = rbp_all_exists_matches(target_pred, to_arg, from_arg, type_level_toP, type_level_fromP, focus == $FROM ? $TO : $FROM, T);
	}
	return types;
    }

    /**
    * Check whether the FOCUS arg is expected.
    *
    * @return LISTP; of expectations it matches.
    */

    public static final SubLObject rbp_all_exists_matches_alt(SubLObject target_pred, SubLObject from_arg, SubLObject to_arg, SubLObject type_level_fromP, SubLObject type_level_toP, SubLObject focus, SubLObject reversedP) {
	if (reversedP == UNPROVIDED) {
	    reversedP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return rbp_all_exists_matches_internal(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RBP_ALL_EXISTS_MATCHES, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RBP_ALL_EXISTS_MATCHES, SEVEN_INTEGER, NIL, EQL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, RBP_ALL_EXISTS_MATCHES, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_7(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw93$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (target_pred.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (from_arg.eql(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (to_arg.eql(cached_args.first())) {
						cached_args = cached_args.rest();
						if (type_level_fromP.eql(cached_args.first())) {
						    cached_args = cached_args.rest();
						    if (type_level_toP.eql(cached_args.first())) {
							cached_args = cached_args.rest();
							if (focus.eql(cached_args.first())) {
							    cached_args = cached_args.rest();
							    if (((NIL != cached_args) && (NIL == cached_args.rest())) && reversedP.eql(cached_args.first())) {
								return memoization_state.caching_results(results2);
							    }
							}
						    }
						}
					    }
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(rbp_all_exists_matches_internal(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject rbp_all_exists_matches(final SubLObject target_pred, final SubLObject from_arg, final SubLObject to_arg, final SubLObject type_level_fromP, final SubLObject type_level_toP, final SubLObject focus, SubLObject reversedP) {
	if (reversedP == UNPROVIDED) {
	    reversedP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return rbp_all_exists_matches_internal(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RBP_ALL_EXISTS_MATCHES, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RBP_ALL_EXISTS_MATCHES, SEVEN_INTEGER, NIL, EQL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, RBP_ALL_EXISTS_MATCHES, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_7(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (target_pred.eql(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (from_arg.eql(cached_args.first())) {
			cached_args = cached_args.rest();
			if (to_arg.eql(cached_args.first())) {
			    cached_args = cached_args.rest();
			    if (type_level_fromP.eql(cached_args.first())) {
				cached_args = cached_args.rest();
				if (type_level_toP.eql(cached_args.first())) {
				    cached_args = cached_args.rest();
				    if (focus.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && reversedP.eql(cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rbp_all_exists_matches_internal(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(target_pred, from_arg, to_arg, type_level_fromP, type_level_toP, focus, reversedP));
	return memoization_state.caching_results(results3);
    }

    public static final SubLObject rbp_matches_any_all_exists_gafs_query_sentence_alt(SubLObject target_pred, SubLObject from_arg, SubLObject to_arg, SubLObject type_level_fromP, SubLObject type_level_toP, SubLObject focus) {
	{
	    SubLObject strong_checkingP = NIL;
	    SubLObject type_pred = (NIL != strong_checkingP) ? ((SubLObject) ($$equals)) : $$genls;
	    SubLObject pcase_var = focus;
	    if (pcase_var.eql($TO)) {
		{
		    SubLObject disjuncts = NIL;
		    if (NIL == type_level_toP) {
			{
			    SubLObject junct1 = (NIL != type_level_fromP) ? ((SubLObject) (listS($$relationAllInstance, target_pred, from_arg, $list_alt385))) : listS(target_pred, from_arg, $list_alt385);
			    SubLObject junct2 = listS($$equals, to_arg, $list_alt385);
			    disjuncts = cons(simplifier.conjoin(list(junct1, junct2), UNPROVIDED), disjuncts);
			}
		    }
		    {
			SubLObject rmp = (NIL != type_level_fromP) ? ((SubLObject) ($$relationAllExists)) : $$relationInstanceExists;
			SubLObject junct1 = listS(rmp, target_pred, from_arg, $list_alt385);
			SubLObject junct2 = listS(NIL != type_level_toP ? ((SubLObject) (type_pred)) : $$isa, to_arg, $list_alt385);
			disjuncts = cons(simplifier.conjoin(list(junct1, junct2), UNPROVIDED), disjuncts);
		    }
		    return simplifier.disjoin(disjuncts, UNPROVIDED);
		}
	    } else {
		return list($$and, list(NIL != type_level_toP ? ((SubLObject) ($$relationExistsAll)) : $$relationExistsInstance, target_pred, $sym379$_TYPE, to_arg), listS(NIL != type_level_fromP ? ((SubLObject) (type_pred)) : $$isa, from_arg, $list_alt385));
	    }
	}
    }

    public static SubLObject rbp_matches_any_all_exists_gafs_query_sentence(final SubLObject target_pred, final SubLObject from_arg, final SubLObject to_arg, final SubLObject type_level_fromP, final SubLObject type_level_toP, final SubLObject focus) {
	final SubLObject strong_checkingP = NIL;
	final SubLObject type_pred = (NIL != strong_checkingP) ? $$equals : $$genls;
	if (focus.eql($TO)) {
	    SubLObject disjuncts = NIL;
	    if (NIL == type_level_toP) {
		final SubLObject junct1 = (NIL != type_level_fromP) ? listS($$relationAllInstance, target_pred, from_arg, $list329) : listS(target_pred, from_arg, $list329);
		final SubLObject junct2 = listS($$equals, to_arg, $list329);
		disjuncts = cons(simplifier.conjoin(list(junct1, junct2), UNPROVIDED), disjuncts);
	    }
	    final SubLObject rmp = (NIL != type_level_fromP) ? $$relationAllExists : $$relationInstanceExists;
	    final SubLObject junct3 = listS(rmp, target_pred, from_arg, $list329);
	    final SubLObject junct4 = listS(NIL != type_level_toP ? type_pred : $$isa, to_arg, $list329);
	    disjuncts = cons(simplifier.conjoin(list(junct3, junct4), UNPROVIDED), disjuncts);
	    return simplifier.disjoin(disjuncts, UNPROVIDED);
	}
	return list($$and, list(NIL != type_level_toP ? $$relationExistsAll : $$relationExistsInstance, target_pred, $sym323$_TYPE, to_arg), listS(NIL != type_level_fromP ? type_pred : $$isa, from_arg, $list329));
    }

    public static final SubLObject rbp_parse_prefer_rmp_matches_alt(SubLObject parse, SubLObject skip_cognateP) {
	if (skip_cognateP == UNPROVIDED) {
	    skip_cognateP = NIL;
	}
	{
	    SubLObject parse_naut = nc_block_denot(parse);
	    SubLObject problem = rbp_parse_prefer_rmp_matches_int(parse_naut, skip_cognateP);
	    return problem;
	}
    }

    public static SubLObject rbp_parse_prefer_rmp_matches(final SubLObject parse, SubLObject skip_cognateP) {
	if (skip_cognateP == UNPROVIDED) {
	    skip_cognateP = NIL;
	}
	final SubLObject parse_naut = nc_block_denot(parse);
	final SubLObject problem = rbp_parse_prefer_rmp_matches_int(parse_naut, skip_cognateP);
	return problem;
    }

    public static final SubLObject rbp_parse_prefer_rmp_matches_int_alt(SubLObject parse_naut, SubLObject skip_cognateP) {
	if (skip_cognateP == UNPROVIDED) {
	    skip_cognateP = NIL;
	}
	{
	    SubLObject problem = NIL;
	    if (((NIL == parse_naut) || (NIL != constant_p(parse_naut))) || (NIL != el_formula_with_operator_p(parse_naut, $$CityNamedFn))) {
	    } else {
		if (NIL != indexed_term_p(parse_naut)) {
		} else {
		    if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parse_naut)) {
			problem = rbp_parse_rmp_problem_for_subcol_naut(parse_naut, skip_cognateP);
		    } else {
			{
			    SubLObject ternary_subcollection_naut = rbp_coerce_to_ternary_subcollection_naut(parse_naut);
			    if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(ternary_subcollection_naut)) {
				problem = rbp_parse_prefer_rmp_matches_int(ternary_subcollection_naut, UNPROVIDED);
			    } else {
				problem = $str_alt389$rbp_parse_prefer_rmp_matches_had_;
			    }
			}
		    }
		}
	    }
	    return problem;
	}
    }

    public static SubLObject rbp_parse_prefer_rmp_matches_int(final SubLObject parse_naut, SubLObject skip_cognateP) {
	if (skip_cognateP == UNPROVIDED) {
	    skip_cognateP = NIL;
	}
	SubLObject problem = NIL;
	if ((NIL != parse_naut) && (NIL == constant_p(parse_naut))) {
	    if (NIL == el_formula_with_operator_p(parse_naut, $$CityNamedFn)) {
		if (NIL == indexed_term_p(parse_naut)) {
		    if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parse_naut)) {
			problem = rbp_parse_rmp_problem_for_subcol_naut(parse_naut, skip_cognateP);
		    } else {
			final SubLObject ternary_subcollection_naut = rbp_coerce_to_ternary_subcollection_naut(parse_naut);
			if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(ternary_subcollection_naut)) {
			    problem = rbp_parse_prefer_rmp_matches_int(ternary_subcollection_naut, UNPROVIDED);
			} else {
			    problem = $str333$rbp_parse_prefer_rmp_matches_had_;
			}
		    }
		}
	    }
	}
	return problem;
    }

    public static final SubLObject rbp_parse_rmp_problem_for_subcol_naut_alt(SubLObject parse_naut, SubLObject skip_cognateP) {
	{
	    SubLObject problem = NIL;
	    SubLObject from_arg = parsing_utilities.subcollection_function_naut_from_arg(parse_naut);
	    SubLObject subfn = cycl_utilities.nat_functor(parse_naut);
	    SubLObject head = (NIL != isa.isaP(subfn, $const219$SubcollectionRelationFunction_Can, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($FROM)) : $TO;
	    SubLObject type_level_fromP = parsing_utilities.subcollection_function_type_level_in_from_argP(subfn);
	    SubLObject type_level_toP = parsing_utilities.subcollection_function_type_level_in_to_argP(subfn);
	    SubLObject to_arg = parsing_utilities.subcollection_function_naut_to_arg(parse_naut);
	    SubLObject okP = NIL;
	    if (((NIL != from_arg) && (NIL != to_arg)) && (NIL != rbp_matches_any_all_exists_gafsP(parsing_utilities.subcollection_function_naut_pred(parse_naut), from_arg, to_arg, type_level_fromP, type_level_toP, head))) {
		okP = T;
	    } else {
		if (NIL != skip_cognateP) {
		    okP = NIL;
		} else {
		    {
			SubLObject cognate = rbp_semx_type_level_cognate(parse_naut);
			SubLObject cognate_problem = (NIL != cognate) ? ((SubLObject) (rbp_parse_prefer_rmp_matches_int(rbp_semx_type_level_cognate(parse_naut), T))) : NIL;
			if (NIL != cognate_problem) {
			    problem = cognate_problem;
			} else {
			    if (NIL != cognate) {
				okP = T;
			    }
			}
		    }
		}
	    }
	    if (!((NIL != okP) || (NIL != problem))) {
		problem = rbp_parse_prefer_rmp_matches_failure_message(parse_naut);
	    }
	    return problem;
	}
    }

    public static SubLObject rbp_parse_rmp_problem_for_subcol_naut(final SubLObject parse_naut, final SubLObject skip_cognateP) {
	SubLObject problem = NIL;
	final SubLObject from_arg = parsing_utilities.subcollection_function_naut_from_arg(parse_naut);
	final SubLObject subfn = cycl_utilities.nat_functor(parse_naut);
	final SubLObject head = (NIL != isa.isaP(subfn, $const215$SubcollectionRelationFunction_Can, UNPROVIDED, UNPROVIDED)) ? $FROM : $TO;
	final SubLObject type_level_fromP = parsing_utilities.subcollection_function_type_level_in_from_argP(subfn);
	final SubLObject type_level_toP = parsing_utilities.subcollection_function_type_level_in_to_argP(subfn);
	final SubLObject to_arg = parsing_utilities.subcollection_function_naut_to_arg(parse_naut);
	SubLObject okP = NIL;
	if (((NIL != from_arg) && (NIL != to_arg)) && (NIL != rbp_matches_any_all_exists_gafsP(parsing_utilities.subcollection_function_naut_pred(parse_naut), from_arg, to_arg, type_level_fromP, type_level_toP, head))) {
	    okP = T;
	} else if (NIL != skip_cognateP) {
	    okP = NIL;
	} else {
	    final SubLObject cognate = rbp_semx_type_level_cognate(parse_naut);
	    final SubLObject cognate_problem = (NIL != cognate) ? rbp_parse_prefer_rmp_matches_int(rbp_semx_type_level_cognate(parse_naut), T) : NIL;
	    if (NIL != cognate_problem) {
		problem = cognate_problem;
	    } else if (NIL != cognate) {
		okP = T;
	    }

	}

	if ((NIL == okP) && (NIL == problem)) {
	    problem = rbp_parse_prefer_rmp_matches_failure_message(parse_naut);
	}
	return problem;
    }

    public static final SubLObject rbp_coerce_to_ternary_subcollection_naut_alt(SubLObject parse_naut) {
	if (NIL == narts_high.naut_p(parse_naut)) {
	    return NIL;
	}
	{
	    SubLObject fn = cycl_utilities.nat_functor(parse_naut);
	    SubLObject expansion = kb_mapping_utilities.fpred_value(fn, $$expansion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    SubLObject intersection_type = kb_mapping_utilities.fpred_value(fn, $$intersectionType, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if ((NIL != expansion) && (NIL != isa.isaP(cycl_utilities.nat_functor(expansion), $$SubcollectionRelationFunction, UNPROVIDED, UNPROVIDED))) {
		return cycl_utilities.expression_subst(cycl_utilities.nat_arg1(parse_naut, UNPROVIDED), $ARG1, cycl_utilities.expression_subst(cycl_utilities.nat_arg2(parse_naut, UNPROVIDED), $ARG2, expansion, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
	    } else {
		if (NIL != intersection_type) {
		    return rbp_coerce_to_ternary_subcollection_naut(make_binary_formula($$CollectionIntersection2Fn, cycl_utilities.nat_arg1(parse_naut, UNPROVIDED), intersection_type));
		}
	    }
	    {
		SubLObject pcase_var = fn;
		if (pcase_var.eql($$CollectionIntersection2Fn)) {
		    return make_ternary_formula($$SubcollectionOfWithRelationToFn, cycl_utilities.nat_arg1(parse_naut, UNPROVIDED), $$isa, cycl_utilities.nat_arg2(parse_naut, UNPROVIDED));
		}
	    }
	}
	return NIL;
    }

    public static SubLObject rbp_coerce_to_ternary_subcollection_naut(final SubLObject parse_naut) {
	if (NIL == narts_high.naut_p(parse_naut)) {
	    return NIL;
	}
	final SubLObject fn = cycl_utilities.nat_functor(parse_naut);
	final SubLObject expansion = kb_mapping_utilities.fpred_value(fn, $$expansion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	final SubLObject intersection_type = kb_mapping_utilities.fpred_value(fn, $$intersectionType, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	if ((NIL != expansion) && (NIL != isa.isaP(cycl_utilities.nat_functor(expansion), $$SubcollectionRelationFunction, UNPROVIDED, UNPROVIDED))) {
	    return cycl_utilities.expression_subst(cycl_utilities.nat_arg1(parse_naut, UNPROVIDED), $ARG1, cycl_utilities.expression_subst(cycl_utilities.nat_arg2(parse_naut, UNPROVIDED), $ARG2, expansion, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
	}
	if (NIL != intersection_type) {
	    return rbp_coerce_to_ternary_subcollection_naut(make_binary_formula($$CollectionIntersection2Fn, cycl_utilities.nat_arg1(parse_naut, UNPROVIDED), intersection_type));
	}
	final SubLObject pcase_var = fn;
	if (pcase_var.eql($$CollectionIntersection2Fn)) {
	    return make_ternary_formula($$SubcollectionOfWithRelationToFn, cycl_utilities.nat_arg1(parse_naut, UNPROVIDED), $$isa, cycl_utilities.nat_arg2(parse_naut, UNPROVIDED));
	}
	return NIL;
    }

    public static final SubLObject rbp_parse_prefer_rmp_matches_failure_message_alt(SubLObject parse_naut) {
	return format(NIL, $str_alt396$doesn_t_match___relationAllExists, cycl_utilities.hl_to_el(parsing_utilities.subcollection_function_naut_from_arg(parse_naut)));
    }

    public static SubLObject rbp_parse_prefer_rmp_matches_failure_message(final SubLObject parse_naut) {
	return format(NIL, $str340$doesn_t_match___relationAllExists, cycl_utilities.hl_to_el(parsing_utilities.subcollection_function_naut_from_arg(parse_naut)));
    }

    public static final SubLObject rbp_parse_filter_unlikely_instrumentals_alt(SubLObject parse_or_denot) {
	{
	    SubLObject parse_naut = (NIL != noun_compound_block_p(parse_or_denot)) ? ((SubLObject) (nc_block_denot(parse_or_denot))) : parse_or_denot;
	    SubLObject problem = rbp_parse_filter_unlikely_instrumentals_int(parse_naut);
	    return problem;
	}
    }

    public static SubLObject rbp_parse_filter_unlikely_instrumentals(final SubLObject parse_or_denot) {
	final SubLObject parse_naut = (NIL != noun_compound_block_p(parse_or_denot)) ? nc_block_denot(parse_or_denot) : parse_or_denot;
	final SubLObject problem = rbp_parse_filter_unlikely_instrumentals_int(parse_naut);
	return problem;
    }

    public static final SubLObject rbp_parse_filter_unlikely_instrumentals_int_alt(SubLObject denot) {
	{
	    SubLObject problem = NIL;
	    if (((NIL == denot) || (NIL != constant_p(denot))) || (NIL != el_formula_with_operator_p(denot, $$CityNamedFn))) {
	    } else {
		if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(denot)) {
		    if ((NIL != rbp_wff.npp_genl_predP(parsing_utilities.subcollection_function_naut_pred(denot), $$instrumentType_Generic)) && (NIL == rbp_wff.npp_genlP(parsing_utilities.subcollection_function_naut_to_arg(denot), $$ObjectWithUse, rbp_domain_mt()))) {
			problem = $str_alt399$rbp_parse_filter_unlikely_instrum;
		    }
		} else {
		    problem = $str_alt400$rbp_parse_filter_unlikely_instrum;
		}
	    }
	    return problem;
	}
    }

    public static SubLObject rbp_parse_filter_unlikely_instrumentals_int(final SubLObject denot) {
	SubLObject problem = NIL;
	if ((NIL != denot) && (NIL == constant_p(denot))) {
	    if (NIL == el_formula_with_operator_p(denot, $$CityNamedFn)) {
		if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(denot)) {
		    if ((NIL != rbp_wff.npp_genl_predP(parsing_utilities.subcollection_function_naut_pred(denot), $$instrumentType_Generic)) && (NIL == rbp_wff.npp_genlP(parsing_utilities.subcollection_function_naut_to_arg(denot), $$ObjectWithUse, rbp_domain_mt()))) {
			problem = $str343$rbp_parse_filter_unlikely_instrum;
		    }
		} else {
		    problem = $str344$rbp_parse_filter_unlikely_instrum;
		}
	    }
	}
	return problem;
    }

    public static final SubLObject rbp_parse_filter_subcollection_args_alt(SubLObject parse) {
	{
	    SubLObject parse_naut = nc_block_denot(parse);
	    SubLObject rbp_rule = nc_block_rule(parse);
	    SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl(rbp_rule);
	    SubLObject rule_semx = rbp_rule_cycl_semx(rule_cycl, UNPROVIDED);
	    SubLObject problem = NIL;
	    if ((NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parse_naut)) && ((NIL != rbp_bad_subcollection_to_argP(parse_naut, rule_semx)) || (NIL != rbp_bad_subcollection_from_argP(parse_naut, rule_semx)))) {
		problem = $str_alt401$rbp_parse_filter_subcollection_ar;
	    }
	    return problem;
	}
    }

    public static SubLObject rbp_parse_filter_subcollection_args(final SubLObject parse) {
	final SubLObject parse_naut = nc_block_denot(parse);
	final SubLObject rbp_rule = nc_block_rule(parse);
	final SubLObject rule_cycl = rbp_rule_bank.rbp_rule_cycl(rbp_rule);
	final SubLObject rule_semx = rbp_rule_cycl_semx(rule_cycl, UNPROVIDED);
	SubLObject problem = NIL;
	if ((NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parse_naut)) && ((NIL != rbp_bad_subcollection_to_argP(parse_naut, rule_semx)) || (NIL != rbp_bad_subcollection_from_argP(parse_naut, rule_semx)))) {
	    problem = $str345$rbp_parse_filter_subcollection_ar;
	}
	return problem;
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff the 'to' arg of PARSE-NAUT is a subcollection
    expression not mandated by RULE-SEMX.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff the \'to\' arg of PARSE-NAUT is a subcollection\r\nexpression not mandated by RULE-SEMX.")
    public static final SubLObject rbp_bad_subcollection_to_argP_alt(SubLObject parse_naut, SubLObject rule_semx) {
	return makeBoolean(
		(NIL == parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_to_arg(rule_semx))) && (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_to_arg(parse_naut))));
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff the 'to' arg of PARSE-NAUT is a subcollection
    expression not mandated by RULE-SEMX.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff the \'to\' arg of PARSE-NAUT is a subcollection\r\nexpression not mandated by RULE-SEMX.")
    public static SubLObject rbp_bad_subcollection_to_argP(final SubLObject parse_naut, final SubLObject rule_semx) {
	return makeBoolean(
		(NIL == parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_to_arg(rule_semx))) && (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_to_arg(parse_naut))));
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff the 'from' arg of PARSE-NAUT is a subcollection
    expression not mandated by RULE-SEMX.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff the \'from\' arg of PARSE-NAUT is a subcollection\r\nexpression not mandated by RULE-SEMX.")
    public static final SubLObject rbp_bad_subcollection_from_argP_alt(SubLObject parse_naut, SubLObject rule_semx) {
	return makeBoolean(
		(NIL == parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_from_arg(rule_semx))) && (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_from_arg(parse_naut))));
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff the 'from' arg of PARSE-NAUT is a subcollection
    expression not mandated by RULE-SEMX.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff the \'from\' arg of PARSE-NAUT is a subcollection\r\nexpression not mandated by RULE-SEMX.")
    public static SubLObject rbp_bad_subcollection_from_argP(final SubLObject parse_naut, final SubLObject rule_semx) {
	return makeBoolean(
		(NIL == parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_from_arg(rule_semx))) && (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(parsing_utilities.subcollection_function_naut_from_arg(parse_naut))));
    }

    public static final SubLObject rbp_unlikely_subcollection_naut_block_wrt_objectP_alt(SubLObject key_block, SubLObject list_of_blocks) {
	{
	    SubLObject key_naut = nc_block_denot(key_block);
	    SubLObject list_of_nauts = Mapping.mapcar(NC_BLOCK_DENOT, list_of_blocks);
	    return rbp_unlikely_subcollection_naut_wrt_objectP(key_naut, list_of_nauts);
	}
    }

    public static SubLObject rbp_unlikely_subcollection_naut_block_wrt_objectP(final SubLObject key_block, final SubLObject list_of_blocks) {
	final SubLObject key_naut = nc_block_denot(key_block);
	final SubLObject list_of_nauts = Mapping.mapcar(NC_BLOCK_DENOT, list_of_blocks);
	return rbp_unlikely_subcollection_naut_wrt_objectP(key_naut, list_of_nauts);
    }

    public static final SubLObject rbp_unlikely_subcollection_naut_wrt_objectP_alt(SubLObject key_denot, SubLObject list_of_nauts) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject ans = rbp_unlikely_subcollection_nautP(key_denot, list_of_nauts, list_utilities.last_one($rbp_input_strings$.getDynamicValue(thread)), $OBJ);
		if (NIL != ans) {
		    return $$$statistically_unlikely_object;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject rbp_unlikely_subcollection_naut_wrt_objectP(final SubLObject key_denot, final SubLObject list_of_nauts) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject ans = rbp_unlikely_subcollection_nautP(key_denot, list_of_nauts, list_utilities.last_one($rbp_input_strings$.getDynamicValue(thread)), $OBJ);
	if (NIL != ans) {
	    return $$$statistically_unlikely_object;
	}
	return NIL;
    }

    public static final SubLObject clear_rbp_unlikely_subcollection_nautP_alt() {
	{
	    SubLObject cs = $rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue();
	    if (NIL != cs) {
		memoization_state.caching_state_clear(cs);
	    }
	}
	return NIL;
    }

    public static SubLObject clear_rbp_unlikely_subcollection_nautP() {
	final SubLObject cs = $rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static final SubLObject remove_rbp_unlikely_subcollection_nautP_alt(SubLObject key_naut, SubLObject list_of_nauts, SubLObject verb, SubLObject relation) {
	return memoization_state.caching_state_remove_function_results_with_args($rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue(), list(key_naut, list_of_nauts, verb, relation), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rbp_unlikely_subcollection_nautP(final SubLObject key_naut, final SubLObject list_of_nauts, final SubLObject verb, final SubLObject relation) {
	return memoization_state.caching_state_remove_function_results_with_args($rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue(), list(key_naut, list_of_nauts, verb, relation), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rbp_unlikely_subcollection_nautP_internal_alt(SubLObject key_naut, SubLObject list_of_nauts, SubLObject verb, SubLObject relation) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == parsing_utilities.ternary_parsing_subcollection_function_nautP(key_naut)) {
		return NIL;
	    }
	    if (NIL != genl_predicates.genl_predicate_in_any_mtP(parsing_utilities.subcollection_function_naut_pred(key_naut), $$temporalBoundsSubsume)) {
		return NIL;
	    }
	    if (NIL == rbp_deverbal_candidateP(string_utilities.bunge($rbp_input_strings$.getDynamicValue(thread), UNPROVIDED))) {
		return NIL;
	    }
	    {
		SubLObject best_score = ZERO_INTEGER;
		SubLObject my_score = ZERO_INTEGER;
		SubLObject the_root = rbp_get_deverbal_root(verb, UNPROVIDED);
		SubLObject cdolist_list_var = list_of_nauts;
		SubLObject this_naut = NIL;
		for (this_naut = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), this_naut = cdolist_list_var.first()) {
		    {
			SubLObject relevant_col = parsing_utilities.subcollection_function_naut_to_arg(this_naut);
			SubLObject this_score = (NIL != fort_types_interface.collection_p(relevant_col)) ? ((SubLObject) (verb_argument_lookups.adjusted_pointwise_mutual_information(the_root, relevant_col, relation))) : NIL;
			if (NIL == this_score) {
			} else {
			    if (this_score.numL(ZERO_INTEGER)) {
			    } else {
				if (this_naut.equal(key_naut)) {
				    my_score = this_score;
				} else {
				    best_score = max(this_score, best_score);
				}
			    }
			}
		    }
		}
		{
		    SubLObject badP = NIL;
		    if (NIL == my_score) {
			badP = list_utilities.sublisp_boolean(best_score);
		    } else {
			if (NIL == best_score) {
			    badP = T;
			} else {
			    badP = numG(best_score, multiply(my_score, TEN_INTEGER));
			}
		    }
		    if (NIL != badP) {
			return $str_alt405$statistically_unlikely_combinatio;
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject rbp_unlikely_subcollection_nautP_internal(final SubLObject key_naut, final SubLObject list_of_nauts, final SubLObject verb, final SubLObject relation) {
	return NIL;
    }

    public static final SubLObject rbp_unlikely_subcollection_nautP_alt(SubLObject key_naut, SubLObject list_of_nauts, SubLObject verb, SubLObject relation) {
	{
	    SubLObject caching_state = $rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue();
	    if (NIL == caching_state) {
		caching_state = memoization_state.create_global_caching_state_for_name($sym403$RBP_UNLIKELY_SUBCOLLECTION_NAUT_, $sym406$_RBP_UNLIKELY_SUBCOLLECTION_NAUT__CACHING_STATE_, NIL, EQUAL, FOUR_INTEGER, $int$64);
	    }
	    {
		SubLObject sxhash = memoization_state.sxhash_calc_4(key_naut, list_of_nauts, verb, relation);
		SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (collisions != $kw93$_MEMOIZED_ITEM_NOT_FOUND_) {
		    {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
			    {
				SubLObject cached_args = collision.first();
				SubLObject results2 = second(collision);
				if (key_naut.equal(cached_args.first())) {
				    cached_args = cached_args.rest();
				    if (list_of_nauts.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (verb.equal(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (((NIL != cached_args) && (NIL == cached_args.rest())) && relation.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					    }
					}
				    }
				}
			    }
			}
		    }
		}
		{
		    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(rbp_unlikely_subcollection_nautP_internal(key_naut, list_of_nauts, verb, relation)));
		    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(key_naut, list_of_nauts, verb, relation));
		    return memoization_state.caching_results(results);
		}
	    }
	}
    }

    public static SubLObject rbp_unlikely_subcollection_nautP(final SubLObject key_naut, final SubLObject list_of_nauts, final SubLObject verb, final SubLObject relation) {
	SubLObject caching_state = $rbp_unlikely_subcollection_nautP_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name($sym348$RBP_UNLIKELY_SUBCOLLECTION_NAUT_, $sym349$_RBP_UNLIKELY_SUBCOLLECTION_NAUT__CACHING_STATE_, NIL, EQUAL, FOUR_INTEGER, $int$64);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_4(key_naut, list_of_nauts, verb, relation);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (key_naut.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (list_of_nauts.equal(cached_args.first())) {
			cached_args = cached_args.rest();
			if (verb.equal(cached_args.first())) {
			    cached_args = cached_args.rest();
			    if (((NIL != cached_args) && (NIL == cached_args.rest())) && relation.equal(cached_args.first())) {
				return memoization_state.caching_results(results2);
			    }
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rbp_unlikely_subcollection_nautP_internal(key_naut, list_of_nauts, verb, relation)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(key_naut, list_of_nauts, verb, relation));
	return memoization_state.caching_results(results3);
    }

    public static final SubLObject parse_adj_initial_compound_alt(SubLObject string, SubLObject num) {
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	{
	    SubLObject words = string_utilities.split_string(string, UNPROVIDED);
	    SubLObject mod = words.first();
	    SubLObject noun_conversions = NIL;
	    SubLObject all_compounds = NIL;
	    {
		SubLObject cdolist_list_var = lexicon_accessors.words_of_stringXpred(mod, $$adjStrings, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject wu = NIL;
		for (wu = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), wu = cdolist_list_var.first()) {
		    {
			SubLObject cdolist_list_var_77 = lexicon_accessors.get_strings_of_type(wu, $$Noun, $list_alt408, UNPROVIDED, UNPROVIDED);
			SubLObject string_78 = NIL;
			for (string_78 = cdolist_list_var_77.first(); NIL != cdolist_list_var_77; cdolist_list_var_77 = cdolist_list_var_77.rest(), string_78 = cdolist_list_var_77.first()) {
			    {
				SubLObject item_var = string_78;
				if (NIL == member(item_var, noun_conversions, symbol_function(EQUAL), symbol_function(IDENTITY))) {
				    noun_conversions = cons(item_var, noun_conversions);
				}
			    }
			}
		    }
		}
	    }
	    {
		SubLObject cdolist_list_var = noun_conversions;
		SubLObject this_conversion = NIL;
		for (this_conversion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), this_conversion = cdolist_list_var.first()) {
		    {
			SubLObject complete_onlyP = T;
			SubLObject cdolist_list_var_79 = parse_noun_compound(string_utilities.bunge(cons(this_conversion, words.rest()), UNPROVIDED), complete_onlyP, num);
			SubLObject this_parse = NIL;
			for (this_parse = cdolist_list_var_79.first(); NIL != cdolist_list_var_79; cdolist_list_var_79 = cdolist_list_var_79.rest(), this_parse = cdolist_list_var_79.first()) {
			    {
				SubLObject item_var = this_parse;
				if (NIL == member(item_var, all_compounds, $sym158$NPP_PARSE_, symbol_function(IDENTITY))) {
				    all_compounds = cons(item_var, all_compounds);
				}
			    }
			}
		    }
		}
	    }
	    return all_compounds;
	}
    }

    public static SubLObject parse_adj_initial_compound(final SubLObject string, SubLObject num) {
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	final SubLObject words = string_utilities.split_string(string, UNPROVIDED);
	final SubLObject mod = words.first();
	SubLObject noun_conversions = NIL;
	SubLObject all_compounds = NIL;
	SubLObject cdolist_list_var = lexicon_accessors.words_of_stringXpred(mod, $$adjStrings, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	SubLObject wu = NIL;
	wu = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject cdolist_list_var_$74 = lexicon_accessors.get_strings_of_type(wu, $$Noun, $list351, UNPROVIDED, UNPROVIDED);
	    SubLObject string_$75 = NIL;
	    string_$75 = cdolist_list_var_$74.first();
	    while (NIL != cdolist_list_var_$74) {
		final SubLObject item_var = string_$75;
		if (NIL == member(item_var, noun_conversions, symbol_function(EQUAL), symbol_function(IDENTITY))) {
		    noun_conversions = cons(item_var, noun_conversions);
		}
		cdolist_list_var_$74 = cdolist_list_var_$74.rest();
		string_$75 = cdolist_list_var_$74.first();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    wu = cdolist_list_var.first();
	}
	cdolist_list_var = noun_conversions;
	SubLObject this_conversion = NIL;
	this_conversion = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject complete_onlyP = T;
	    SubLObject cdolist_list_var_$75 = parse_noun_compound(string_utilities.bunge(cons(this_conversion, words.rest()), UNPROVIDED), complete_onlyP, num);
	    SubLObject this_parse = NIL;
	    this_parse = cdolist_list_var_$75.first();
	    while (NIL != cdolist_list_var_$75) {
		final SubLObject item_var2 = this_parse;
		if (NIL == member(item_var2, all_compounds, $sym153$NPP_PARSE_, symbol_function(IDENTITY))) {
		    all_compounds = cons(item_var2, all_compounds);
		}
		cdolist_list_var_$75 = cdolist_list_var_$75.rest();
		this_parse = cdolist_list_var_$75.first();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    this_conversion = cdolist_list_var.first();
	}
	return all_compounds;
    }

    public static final SubLObject rbp_escalating_parse_alt(SubLObject string, SubLObject num) {
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	{
	    SubLObject cdolist_list_var = list(PARSE_AS_DENOT_OR_NOUN_COMPOUND, PARSE_DEVERBAL_COMPOUND_AS_FALLBACK, PARSE_STRING_AS_DATE_FALLBACK_ESCALATED, PARSE_ADJ_INITIAL_COMPOUND);
	    SubLObject func = NIL;
	    for (func = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), func = cdolist_list_var.first()) {
		{
		    SubLObject the_parses = funcall(func, string, num);
		    if (NIL != list_utilities.proper_list_p(the_parses)) {
			return set.set_element_list(set_utilities.construct_set_from_list(the_parses, symbol_function(EQUALP), UNPROVIDED));
		    }
		}
	    }
	}
	{
	    SubLObject singular = lexification_utilities.singularize_word(string_utilities.trim_whitespace(string));
	    if (NIL == Strings.stringE(singular, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		return rbp_escalating_parse(singular, num);
	    }
	}
	return NIL;
    }

    public static SubLObject rbp_escalating_parse(final SubLObject string, SubLObject num) {
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	SubLObject cdolist_list_var = list(PARSE_AS_DENOT_OR_NOUN_COMPOUND, PARSE_DEVERBAL_COMPOUND_AS_FALLBACK, PARSE_STRING_AS_DATE_FALLBACK_ESCALATED, PARSE_ADJ_INITIAL_COMPOUND);
	SubLObject func = NIL;
	func = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject the_parses = funcall(func, string, num);
	    if (NIL != list_utilities.proper_list_p(the_parses)) {
		return set.set_element_list(set_utilities.construct_set_from_list(the_parses, symbol_function(EQUALP), UNPROVIDED));
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    func = cdolist_list_var.first();
	}
	final SubLObject singular = lexification_utilities.singularize_word(string_utilities.trim_whitespace(string), UNPROVIDED);
	if (NIL == Strings.stringE(singular, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
	    return rbp_escalating_parse(singular, num);
	}
	return NIL;
    }

    public static final SubLObject parse_as_denot_or_noun_compound_alt(SubLObject string, SubLObject num) {
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	{
	    SubLObject denots = lexicon_accessors.typed_denots_of_string(string, $$Collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    SubLObject complete_onlyP = T;
	    return NIL != denots ? ((SubLObject) (denots)) : parse_noun_compound(string, complete_onlyP, num);
	}
    }

    public static SubLObject parse_as_denot_or_noun_compound(final SubLObject string, SubLObject num) {
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	final SubLObject denots = lexicon_accessors.typed_denots_of_string(string, $$Collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	final SubLObject complete_onlyP = T;
	return NIL != denots ? denots : parse_noun_compound(string, complete_onlyP, num);
    }

    public static final SubLObject parse_string_as_date_fallback_escalated_alt(SubLObject string, SubLObject num) {
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	{
	    SubLObject one_answerP = numGE(num, ONE_INTEGER);
	    return parse_string_as_date_fallback(string, one_answerP, UNPROVIDED);
	}
    }

    public static SubLObject parse_string_as_date_fallback_escalated(final SubLObject string, SubLObject num) {
	if (num == UNPROVIDED) {
	    num = $int$1000;
	}
	final SubLObject one_answerP = numGE(num, ONE_INTEGER);
	return parse_string_as_date_fallback(string, one_answerP, UNPROVIDED);
    }

    /**
     *
     *
     * @param MODE
     * 		same as @see noun-compound-statistics
     * @return *ncs-formats* initialized per the input mode
     */
    @LispMethod(comment = "@param MODE\r\n\t\tsame as @see noun-compound-statistics\r\n@return *ncs-formats* initialized per the input mode")
    public static final SubLObject initialize_ncs_formats_alt(SubLObject mode) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $ncs_formats$.setDynamicValue(dictionary.new_dictionary(EQL, UNPROVIDED), thread);
	    if (mode.eql($XML)) {
	    } else {
		if (NIL == mode) {
		    Errors.error($str_alt416$No_mode_specified_for_initialize_);
		} else {
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $INVESTIGATING, $str_alt418$investigating___D__A_____);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $PRINT_ME, $str_alt420$parse_of__S_yielded___);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $FLAG_BAD_PILE, $str_alt422$______and_also________);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $DENOTS, $str_alt424$____denots_are__A__);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $BREAK, $str_alt426$________________________________);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $COUNT_WITH_PARSES, $str_alt428$__Total_compounds_with_any_parses);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $ACTUAL_PARSES, $str_alt430$Total_parses_found___A__);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $PERCENT_APPROVED, $str_alt432$Percent_of_parses_approved___5_2F);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $TOTAL_VIOLATIONS, $str_alt434$Total_violations___A__);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $TO_CONSTANTS, $str_alt436$Note___A_parses_reformulated_to_c);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $DENOTS_WANTED, $str_alt438$Compounds_wanting_denots___A_____);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $RULES_AND_PARSE, $str_alt440$from__S___A__);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $FALLBACK_AND_PARSE, $str_alt442$_A_A__);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $LABEL, $str_alt444$_A__);
		    dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $RULE_USES, $str_alt446$Uses_of__A___A_total___A_good___A);
		}
	    }
	    return $ncs_formats$.getDynamicValue(thread);
	}
    }

    /**
     *
     *
     * @param MODE
     * 		same as @see noun-compound-statistics
     * @return *ncs-formats* initialized per the input mode
     */
    @LispMethod(comment = "@param MODE\r\n\t\tsame as @see noun-compound-statistics\r\n@return *ncs-formats* initialized per the input mode")
    public static SubLObject initialize_ncs_formats(final SubLObject mode) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	$ncs_formats$.setDynamicValue(dictionary.new_dictionary(EQL, UNPROVIDED), thread);
	if (!mode.eql($XML)) {
	    if (NIL == mode) {
		Errors.error($str359$No_mode_specified_for_initialize_);
	    } else {
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $INVESTIGATING, $str361$investigating___D__A_____);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $PRINT_ME, $str363$parse_of__S_yielded___);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $FLAG_BAD_PILE, $str365$______and_also________);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $DENOTS, $str367$____denots_are__A__);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $BREAK, $str369$________________________________);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $COUNT_WITH_PARSES, $str371$__Total_compounds_with_any_parses);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $ACTUAL_PARSES, $str373$Total_parses_found___A__);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $PERCENT_APPROVED, $str375$Percent_of_parses_approved___5_2F);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $TOTAL_VIOLATIONS, $str377$Total_violations___A__);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $TO_CONSTANTS, $str379$Note___A_parses_reformulated_to_c);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $DENOTS_WANTED, $str381$Compounds_wanting_denots___A_____);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $RULES_AND_PARSE, $str383$from__S___A__);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $FALLBACK_AND_PARSE, $str385$_A_A__);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $LABEL, $str387$_A__);
		dictionary.dictionary_enter($ncs_formats$.getDynamicValue(thread), $RULE_USES, $str389$Uses_of__A___A_total___A_good___A);
	    }
	}
	return $ncs_formats$.getDynamicValue(thread);
    }

    public static final SubLObject ncs_format_alt(SubLObject key) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return dictionary.dictionary_lookup($ncs_formats$.getDynamicValue(thread), key, UNPROVIDED);
	}
    }

    public static SubLObject ncs_format(final SubLObject key) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return dictionary.dictionary_lookup($ncs_formats$.getDynamicValue(thread), key, UNPROVIDED);
    }

    public static final SubLObject ncs_note_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject stream = NIL;
	    SubLObject cat = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt447);
	    stream = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list_alt447);
	    cat = current.first();
	    current = current.rest();
	    {
		SubLObject format_and_args = current;
		return listS(FORMAT, stream, list(NCS_FORMAT, cat), append(format_and_args, NIL));
	    }
	}
    }

    public static SubLObject ncs_note(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject stream = NIL;
	SubLObject cat = NIL;
	destructuring_bind_must_consp(current, datum, $list390);
	stream = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list390);
	cat = current.first();
	final SubLObject format_and_args;
	current = format_and_args = current.rest();
	return listS(FORMAT, stream, list(NCS_FORMAT, cat), append(format_and_args, NIL));
    }

    /**
     *
     *
     * @param MODE
     * 		- either :stdout, :text, or :xml; modes other than :stdout print to a file in /cyc/departments/nl/doc/stats
     * @param CUTOFF
     * 		- stop after this many compounds. ones which are rejected by the loop, e.g. 'u v', don't count
     * @param INPUT
     * 		FILE - the compounds to be parsed; defaults to /cyc/departments/nl/doc/stats/src/acquaint-10000
     * @return INTEGERP ; the number of parses, over all compounds, which weren't filtered out
     * @unknown should maybe support :csv mode at some point
     */
    @LispMethod(comment = "@param MODE\r\n\t\t- either :stdout, :text, or :xml; modes other than :stdout print to a file in /cyc/departments/nl/doc/stats\r\n@param CUTOFF\r\n\t\t- stop after this many compounds. ones which are rejected by the loop, e.g. \'u v\', don\'t count\r\n@param INPUT\r\n\t\tFILE - the compounds to be parsed; defaults to /cyc/departments/nl/doc/stats/src/acquaint-10000\r\n@return INTEGERP ; the number of parses, over all compounds, which weren\'t filtered out\r\n@unknown should maybe support :csv mode at some point")
    public static final SubLObject noun_compound_statistics_alt(SubLObject mode, SubLObject cutoff, SubLObject from_file) {
	if (mode == UNPROVIDED) {
	    mode = $STDOUT;
	}
	if (cutoff == UNPROVIDED) {
	    cutoff = $int$100000;
	}
	if (from_file == UNPROVIDED) {
	    from_file = $str_alt452$_cyc_departments_nl_doc_stats_src;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    rbp_untrace();
	    {
		SubLObject i = ZERO_INTEGER;
		SubLObject any_matches = ZERO_INTEGER;
		SubLObject total_parses = ZERO_INTEGER;
		SubLObject ok_parses = ZERO_INTEGER;
		SubLObject violations = ZERO_INTEGER;
		SubLObject wanted_denots = ZERO_INTEGER;
		SubLObject had_denots = ZERO_INTEGER;
		SubLObject total_denots = ZERO_INTEGER;
		SubLObject reform_to_denots = ZERO_INTEGER;
		SubLObject output_file = cconcatenate($str_alt453$_cyc_departments_nl_doc_stats_kb,
			new SubLObject[] { string_utilities.str(kb_loaded()), operation_communication.kb_op_number().isPositive() ? ((SubLObject) (cconcatenate($str_alt87$_, string_utilities.str(operation_communication.kb_op_number())))) : $str_alt85$, $str_alt454$_,
				string_utilities.str(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED)), $str_alt455$_ncr_stats });
		SubLObject compound_out = (mode.eql($STDOUT)) ? ((SubLObject) (StreamsLow.$standard_output$.getDynamicValue(thread))) : StreamsLow.open(output_file, new SubLObject[] { $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE });
		SubLObject total_rule_uses = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
		SubLObject good_rule_uses = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
		SubLObject bad_rule_uses = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
		SubLObject already_covered = set.new_set(UNPROVIDED, UNPROVIDED);
		if (NIL == open_stream_p(compound_out)) {
		    Errors.sublisp_break($str_alt460$Couldn_t_open_output_stream__woul, new SubLObject[] { output_file });
		}
		{
		    SubLObject cdolist_list_var = rbp_rule_bank.rbp_rb_all_rules();
		    SubLObject rule = NIL;
		    for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rule = cdolist_list_var.first()) {
			dictionary.dictionary_enter(total_rule_uses, rule, ZERO_INTEGER);
			dictionary.dictionary_enter(good_rule_uses, rule, ZERO_INTEGER);
			dictionary.dictionary_enter(bad_rule_uses, rule, ZERO_INTEGER);
		    }
		}
		{
		    SubLObject stream_var = NIL;
		    try {
			stream_var = StreamsLow.open(from_file, EMPTY_SUBL_OBJECT_ARRAY);
			{
			    SubLObject compound_file = stream_var;
			    if (mode.eql($STDOUT)) {
				format(compound_out, $str_alt461$would_print_to__S__, output_file);
			    } else {
				format(T, $str_alt462$storing_results_in__S__cutoff_is_, output_file, cutoff);
			    }
			    initialize_ncs_formats(mode);
			    {
				SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
				try {
				    lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($ON, thread);
				    {
					SubLObject this_compound = NIL;
					for (this_compound = read_line(compound_file, UNPROVIDED, UNPROVIDED, UNPROVIDED); !((i.numE(cutoff) || (this_compound == $EOF)) || (NIL == this_compound)); this_compound = read_line(compound_file, NIL, UNPROVIDED, UNPROVIDED)) {
					    if ((NIL == $ncs_deverbals_onlyP$.getDynamicValue(thread)) || (NIL != rbp_deverbal_candidateP(this_compound))) {
						{
						    SubLObject exploded = string_utilities.split_string(this_compound, UNPROVIDED);
						    SubLObject denots = lexicon_accessors.denots_of_stringXpos(this_compound, $NOUN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_80 = $rbp_shadow_rulesP$.currentBinding(thread);
							try {
							    $rbp_shadow_rulesP$.bind(T, thread);
							    {
								SubLObject copied_shadow = NIL;
								if (!(((NIL != list_utilities.lengthE(exploded.first(), ONE_INTEGER, UNPROVIDED)) || (NIL != list_utilities.lengthE(second(exploded), ONE_INTEGER, UNPROVIDED)))
									|| (NIL != set.set_memberP(lexification_utilities.singularize_word(this_compound), already_covered)))) {
								    set.set_add(lexification_utilities.singularize_word(this_compound), already_covered);
								    i = add(i, ONE_INTEGER);
								    if (NIL != number_utilities.multiple_ofP($int$1000, i)) {
									Storage.gc(UNPROVIDED);
								    }
								    format(compound_out, ncs_format($INVESTIGATING), i, this_compound);
								    thread.resetMultipleValues();
								    {
									SubLObject good = parse_deverbal_compound_with_fallback(this_compound, UNPROVIDED, UNPROVIDED);
									SubLObject bad = thread.secondMultipleValue();
									thread.resetMultipleValues();
									if (NIL != list_utilities.proper_list_p(good)) {
									    any_matches = add(any_matches, ONE_INTEGER);
									    total_parses = add(total_parses, length(good));
									    ok_parses = add(ok_parses, length(good));
									    total_parses = add(total_parses, length(bad));
									    {
										SubLObject cdolist_list_var = good;
										SubLObject good_one = NIL;
										for (good_one = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), good_one = cdolist_list_var.first()) {
										    if (NIL != constant_p(good_one.first())) {
											reform_to_denots = add(reform_to_denots, ONE_INTEGER);
										    }
										}
									    }
									    {
										SubLObject cdolist_list_var = bad;
										SubLObject baddy = NIL;
										for (baddy = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), baddy = cdolist_list_var.first()) {
										    violations = add(violations, length(second(baddy)));
										}
									    }
									    {
										SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($rbp_rules_to_parses_shadow$.getDynamicValue(thread)));
										while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
										    thread.resetMultipleValues();
										    {
											SubLObject rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
											SubLObject blocks = thread.secondMultipleValue();
											thread.resetMultipleValues();
											dictionary_utilities.dictionary_increment(total_rule_uses, rule, length(blocks));
											{
											    SubLObject cdolist_list_var = blocks;
											    SubLObject parse = NIL;
											    for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), parse = cdolist_list_var.first()) {
												if (NIL != subl_promotions.memberP(parse, good, EQUAL, UNPROVIDED)) {
												    dictionary_utilities.dictionary_increment(good_rule_uses, rule, UNPROVIDED);
												} else {
												    dictionary_utilities.dictionary_increment(bad_rule_uses, rule, UNPROVIDED);
												}
											    }
											}
											iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
										    }
										}
										dictionary_contents.do_dictionary_contents_finalize(iteration_state);
									    }
									    format(compound_out, ncs_format($PRINT_ME), this_compound);
									    copied_shadow = print_rbp_parses_with_sources(compound_out, good, $rbp_rules_to_parses_shadow$.getDynamicValue(thread), $$$from_fallback);
									    if (NIL != bad) {
										format(compound_out, ncs_format($FLAG_BAD_PILE));
										print_rbp_parses_with_sources(compound_out, bad, copied_shadow, $$$from_fallback);
									    }
									}
									if ((NIL == good) || (NIL != list_utilities.lengthG(good, THREE_INTEGER, UNPROVIDED))) {
									    wanted_denots = add(wanted_denots, ONE_INTEGER);
									    if (NIL != list_utilities.proper_list_p(denots)) {
										format(compound_out, ncs_format($DENOTS), denots);
										had_denots = add(had_denots, ONE_INTEGER);
										total_denots = add(total_denots, length(denots));
									    }
									}
									if ((NIL != list_utilities.proper_list_p(good)) || (NIL != list_utilities.proper_list_p(denots))) {
									    format(compound_out, ncs_format($BREAK));
									}
								    }
								}
							    }
							} finally {
							    $rbp_shadow_rulesP$.rebind(_prev_bind_0_80, thread);
							}
						    }
						}
					    }
					}
				    }
				} finally {
				    lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
				}
			    }
			    format(compound_out, ncs_format($COUNT_WITH_PARSES), any_matches);
			    format(compound_out, ncs_format($ACTUAL_PARSES), total_parses);
			    format(compound_out, ncs_format($PERCENT_APPROVED), multiply($int$100, divide(ok_parses, total_parses)));
			    format(compound_out, ncs_format($TOTAL_VIOLATIONS), violations);
			    format(compound_out, ncs_format($TO_CONSTANTS), reform_to_denots);
			    format(compound_out, ncs_format($DENOTS_WANTED), new SubLObject[] { wanted_denots, had_denots, total_denots });
			    {
				SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(total_rule_uses, $sym129$_);
				SubLObject cons = NIL;
				for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
				    {
					SubLObject datum = cons;
					SubLObject current = datum;
					SubLObject rule = NIL;
					SubLObject total_uses = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt466);
					rule = current.first();
					current = current.rest();
					total_uses = current;
					format(compound_out, ncs_format($RULE_USES), new SubLObject[] { rule, total_uses, dictionary.dictionary_lookup(good_rule_uses, rule, UNPROVIDED), dictionary.dictionary_lookup(bad_rule_uses, rule, UNPROVIDED) });
				    }
				}
			    }
			}
		    } finally {
			{
			    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				if (NIL != stream_var) {
				    close(stream_var, UNPROVIDED);
				}
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		}
		return ok_parses;
	    }
	}
    }

    /**
     *
     *
     * @param MODE
     * 		- either :stdout, :text, or :xml; modes other than :stdout print to a file in /cyc/departments/nl/doc/stats
     * @param CUTOFF
     * 		- stop after this many compounds. ones which are rejected by the loop, e.g. 'u v', don't count
     * @param INPUT
     * 		FILE - the compounds to be parsed; defaults to /cyc/departments/nl/doc/stats/src/acquaint-10000
     * @return INTEGERP ; the number of parses, over all compounds, which weren't filtered out
     * @unknown should maybe support :csv mode at some point
     */
    @LispMethod(comment = "@param MODE\r\n\t\t- either :stdout, :text, or :xml; modes other than :stdout print to a file in /cyc/departments/nl/doc/stats\r\n@param CUTOFF\r\n\t\t- stop after this many compounds. ones which are rejected by the loop, e.g. \'u v\', don\'t count\r\n@param INPUT\r\n\t\tFILE - the compounds to be parsed; defaults to /cyc/departments/nl/doc/stats/src/acquaint-10000\r\n@return INTEGERP ; the number of parses, over all compounds, which weren\'t filtered out\r\n@unknown should maybe support :csv mode at some point")
    public static SubLObject noun_compound_statistics(SubLObject mode, SubLObject cutoff, SubLObject from_file) {
	if (mode == UNPROVIDED) {
	    mode = $STDOUT;
	}
	if (cutoff == UNPROVIDED) {
	    cutoff = $int$100000;
	}
	if (from_file == UNPROVIDED) {
	    from_file = $str395$_cyc_departments_nl_doc_stats_src;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	rbp_untrace();
	SubLObject i = ZERO_INTEGER;
	SubLObject any_matches = ZERO_INTEGER;
	SubLObject total_parses = ZERO_INTEGER;
	SubLObject ok_parses = ZERO_INTEGER;
	SubLObject violations = ZERO_INTEGER;
	SubLObject wanted_denots = ZERO_INTEGER;
	SubLObject had_denots = ZERO_INTEGER;
	SubLObject total_denots = ZERO_INTEGER;
	SubLObject reform_to_denots = ZERO_INTEGER;
	final SubLObject output_file = cconcatenate($str396$_cyc_departments_nl_doc_stats_kb, new SubLObject[] { string_utilities.str(kb_loaded()), operation_communication.kb_op_number().isPositive() ? cconcatenate($str397$_, string_utilities.str(operation_communication.kb_op_number())) : $str398$,
		$str399$_, string_utilities.str(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED)), $str400$_ncr_stats });
	final SubLObject compound_out = (mode.eql($STDOUT)) ? StreamsLow.$standard_output$.getDynamicValue(thread) : StreamsLow.open(output_file, new SubLObject[] { $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE });
	final SubLObject total_rule_uses = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
	final SubLObject good_rule_uses = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
	final SubLObject bad_rule_uses = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
	final SubLObject already_covered = set.new_set(UNPROVIDED, UNPROVIDED);
	if (NIL == open_stream_p(compound_out)) {
	    Errors.sublisp_break($str405$Couldn_t_open_output_stream__woul, new SubLObject[] { output_file });
	}
	SubLObject cdolist_list_var = rbp_rule_bank.rbp_rb_all_rules();
	SubLObject rule = NIL;
	rule = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    dictionary.dictionary_enter(total_rule_uses, rule, ZERO_INTEGER);
	    dictionary.dictionary_enter(good_rule_uses, rule, ZERO_INTEGER);
	    dictionary.dictionary_enter(bad_rule_uses, rule, ZERO_INTEGER);
	    cdolist_list_var = cdolist_list_var.rest();
	    rule = cdolist_list_var.first();
	}
	SubLObject stream_var = NIL;
	try {
	    final SubLObject compound_file;
	    stream_var = compound_file = StreamsLow.open(from_file, EMPTY_SUBL_OBJECT_ARRAY);
	    if (mode.eql($STDOUT)) {
		format(compound_out, $str406$would_print_to__S__, output_file);
	    } else {
		format(T, $str407$storing_results_in__S__cutoff_is_, output_file, cutoff);
	    }
	    initialize_ncs_formats(mode);
	    final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
	    try {
		lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($ON, thread);
		SubLObject this_compound;
		SubLObject exploded;
		SubLObject denots;
		SubLObject _prev_bind_0_$77;
		SubLObject copied_shadow;
		SubLObject good;
		SubLObject bad;
		SubLObject cdolist_list_var2;
		SubLObject good_one;
		SubLObject baddy;
		SubLObject iteration_state;
		SubLObject rule2;
		SubLObject blocks;
		SubLObject cdolist_list_var3;
		SubLObject parse;
		for (this_compound = NIL, this_compound = string_utilities.network_read_line(compound_file, UNPROVIDED, UNPROVIDED, UNPROVIDED); ((!i.numE(cutoff)) && (this_compound != $EOF))
			&& (NIL != this_compound); this_compound = string_utilities.network_read_line(compound_file, NIL, UNPROVIDED, UNPROVIDED)) {
		    if ((NIL == $ncs_deverbals_onlyP$.getDynamicValue(thread)) || (NIL != rbp_deverbal_candidateP(this_compound))) {
			exploded = string_utilities.split_string(this_compound, UNPROVIDED);
			denots = lexicon_accessors.denots_of_stringXpos(this_compound, $NOUN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			_prev_bind_0_$77 = $rbp_shadow_rulesP$.currentBinding(thread);
			try {
			    $rbp_shadow_rulesP$.bind(T, thread);
			    copied_shadow = NIL;
			    if (((NIL == list_utilities.lengthE(exploded.first(), ONE_INTEGER, UNPROVIDED)) && (NIL == list_utilities.lengthE(second(exploded), ONE_INTEGER, UNPROVIDED)))
				    && (NIL == set.set_memberP(lexification_utilities.singularize_word(this_compound, UNPROVIDED), already_covered))) {
				set.set_add(lexification_utilities.singularize_word(this_compound, UNPROVIDED), already_covered);
				i = add(i, ONE_INTEGER);
				if (NIL != number_utilities.multiple_ofP($int$1000, i)) {
				    Storage.gc(UNPROVIDED);
				}
				format(compound_out, ncs_format($INVESTIGATING), i, this_compound);
				thread.resetMultipleValues();
				good = parse_deverbal_compound_with_fallback(this_compound, UNPROVIDED, UNPROVIDED);
				bad = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL != list_utilities.proper_list_p(good)) {
				    any_matches = add(any_matches, ONE_INTEGER);
				    total_parses = add(total_parses, length(good));
				    ok_parses = add(ok_parses, length(good));
				    total_parses = add(total_parses, length(bad));
				    cdolist_list_var2 = good;
				    good_one = NIL;
				    good_one = cdolist_list_var2.first();
				    while (NIL != cdolist_list_var2) {
					if (NIL != constant_p(good_one.first())) {
					    reform_to_denots = add(reform_to_denots, ONE_INTEGER);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					good_one = cdolist_list_var2.first();
				    }
				    cdolist_list_var2 = bad;
				    baddy = NIL;
				    baddy = cdolist_list_var2.first();
				    while (NIL != cdolist_list_var2) {
					violations = add(violations, length(second(baddy)));
					cdolist_list_var2 = cdolist_list_var2.rest();
					baddy = cdolist_list_var2.first();
				    }
				    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($rbp_rules_to_parses_shadow$.getDynamicValue(thread))); NIL == dictionary_contents.do_dictionary_contents_doneP(
					    iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
					thread.resetMultipleValues();
					rule2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
					blocks = thread.secondMultipleValue();
					thread.resetMultipleValues();
					dictionary_utilities.dictionary_increment(total_rule_uses, rule2, length(blocks));
					cdolist_list_var3 = blocks;
					parse = NIL;
					parse = cdolist_list_var3.first();
					while (NIL != cdolist_list_var3) {
					    if (NIL != subl_promotions.memberP(parse, good, EQUAL, UNPROVIDED)) {
						dictionary_utilities.dictionary_increment(good_rule_uses, rule2, UNPROVIDED);
					    } else {
						dictionary_utilities.dictionary_increment(bad_rule_uses, rule2, UNPROVIDED);
					    }
					    cdolist_list_var3 = cdolist_list_var3.rest();
					    parse = cdolist_list_var3.first();
					}
				    }
				    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				    format(compound_out, ncs_format($PRINT_ME), this_compound);
				    copied_shadow = print_rbp_parses_with_sources(compound_out, good, $rbp_rules_to_parses_shadow$.getDynamicValue(thread), $$$from_fallback);
				    if (NIL != bad) {
					format(compound_out, ncs_format($FLAG_BAD_PILE));
					print_rbp_parses_with_sources(compound_out, bad, copied_shadow, $$$from_fallback);
				    }
				}
				if ((NIL == good) || (NIL != list_utilities.lengthG(good, THREE_INTEGER, UNPROVIDED))) {
				    wanted_denots = add(wanted_denots, ONE_INTEGER);
				    if (NIL != list_utilities.proper_list_p(denots)) {
					format(compound_out, ncs_format($DENOTS), denots);
					had_denots = add(had_denots, ONE_INTEGER);
					total_denots = add(total_denots, length(denots));
				    }
				}
				if ((NIL != list_utilities.proper_list_p(good)) || (NIL != list_utilities.proper_list_p(denots))) {
				    format(compound_out, ncs_format($BREAK));
				}
			    }
			} finally {
			    $rbp_shadow_rulesP$.rebind(_prev_bind_0_$77, thread);
			}
		    }
		}
	    } finally {
		lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
	    }
	    format(compound_out, ncs_format($COUNT_WITH_PARSES), any_matches);
	    format(compound_out, ncs_format($ACTUAL_PARSES), total_parses);
	    format(compound_out, ncs_format($PERCENT_APPROVED), multiply($int$100, divide(ok_parses, total_parses)));
	    format(compound_out, ncs_format($TOTAL_VIOLATIONS), violations);
	    format(compound_out, ncs_format($TO_CONSTANTS), reform_to_denots);
	    format(compound_out, ncs_format($DENOTS_WANTED), new SubLObject[] { wanted_denots, had_denots, total_denots });
	    SubLObject cdolist_list_var4 = dictionary_utilities.sort_dictionary_by_values(total_rule_uses, $sym124$_);
	    SubLObject cons = NIL;
	    cons = cdolist_list_var4.first();
	    while (NIL != cdolist_list_var4) {
		SubLObject current;
		final SubLObject datum = current = cons;
		SubLObject rule3 = NIL;
		SubLObject total_uses = NIL;
		destructuring_bind_must_consp(current, datum, $list413);
		rule3 = current.first();
		current = total_uses = current.rest();
		format(compound_out, ncs_format($RULE_USES), new SubLObject[] { rule3, total_uses, dictionary.dictionary_lookup(good_rule_uses, rule3, UNPROVIDED), dictionary.dictionary_lookup(bad_rule_uses, rule3, UNPROVIDED) });
		cdolist_list_var4 = cdolist_list_var4.rest();
		cons = cdolist_list_var4.first();
	    }
	} finally {
	    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		if (NIL != stream_var) {
		    close(stream_var, UNPROVIDED);
		}
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
	    }
	}
	return ok_parses;
    }

    public static final SubLObject print_rbp_parses_with_sources_alt(SubLObject stream, SubLObject parses, SubLObject dict, SubLObject label_if_not) {
	if (label_if_not == UNPROVIDED) {
	    label_if_not = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject copied = dictionary_utilities.copy_dictionary(dict);
		SubLObject cdolist_list_var = parses;
		SubLObject parse = NIL;
		for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), parse = cdolist_list_var.first()) {
		    if (NIL != dictionary.non_empty_dictionary_p(copied)) {
			{
			    SubLObject found_it = NIL;
			    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(copied));
			    while (!((NIL != found_it) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
				thread.resetMultipleValues();
				{
				    SubLObject rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
				    SubLObject blocks = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    if (NIL != subl_promotions.memberP(parse, blocks, EQUAL, UNPROVIDED)) {
					found_it = rule;
				    }
				    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
				}
			    }
			    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
			    dictionary_utilities.dictionary_remove_from_value(copied, found_it, parse, EQUAL, UNPROVIDED);
			    format(stream, ncs_format($RULES_AND_PARSE), found_it, parse);
			}
		    } else {
			format(stream, ncs_format($FALLBACK_AND_PARSE), NIL != label_if_not ? ((SubLObject) (format(NIL, ncs_format($LABEL), label_if_not))) : $str_alt85$, parse);
		    }
		}
		return copied;
	    }
	}
    }

    public static SubLObject print_rbp_parses_with_sources(final SubLObject stream, final SubLObject parses, final SubLObject dict, SubLObject label_if_not) {
	if (label_if_not == UNPROVIDED) {
	    label_if_not = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject copied = dictionary_utilities.copy_dictionary(dict);
	SubLObject cdolist_list_var = parses;
	SubLObject parse = NIL;
	parse = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != dictionary.non_empty_dictionary_p(copied)) {
		SubLObject found_it;
		SubLObject iteration_state;
		for (found_it = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(copied)); (NIL == found_it)
			&& (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
		    thread.resetMultipleValues();
		    final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
		    final SubLObject blocks = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if (NIL != subl_promotions.memberP(parse, blocks, EQUAL, UNPROVIDED)) {
			found_it = rule;
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		dictionary_utilities.dictionary_remove_from_value(copied, found_it, parse, EQUAL, UNPROVIDED);
		format(stream, ncs_format($RULES_AND_PARSE), found_it, parse);
	    } else {
		format(stream, ncs_format($FALLBACK_AND_PARSE), NIL != label_if_not ? format(NIL, ncs_format($LABEL), label_if_not) : $str398$, parse);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    parse = cdolist_list_var.first();
	}
	return copied;
    }

    public static final SubLObject daml_process_ontology_file_alt(SubLObject fn) {
	if (fn == UNPROVIDED) {
	    fn = $str_alt467$_cyc_projects_daml_call_thesaurus;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    rbp_untrace();
	    {
		SubLObject not_bogus = ZERO_INTEGER;
		SubLObject not_skipped = ZERO_INTEGER;
		SubLObject work_done = ZERO_INTEGER;
		SubLObject stream_var = NIL;
		try {
		    stream_var = StreamsLow.open(fn, EMPTY_SUBL_OBJECT_ARRAY);
		    {
			SubLObject compound_file = stream_var;
			SubLObject this_compound = NIL;
			for (this_compound = read_line(compound_file, UNPROVIDED, UNPROVIDED, UNPROVIDED); !((this_compound == $EOF) || (NIL == this_compound)); this_compound = read_line(compound_file, NIL, UNPROVIDED, UNPROVIDED)) {
			    this_compound = string_utilities.remove_substring(this_compound, $str_alt468$_);
			    if (NIL == search($str_alt469$_, this_compound, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
				not_bogus = add(not_bogus, ONE_INTEGER);
				if (NIL != string_utilities.empty_string_p(this_compound)) {
				} else {
				    if ((NIL != lexification_utilities.initial_capitalizedP(this_compound)) && (NIL != search($str_alt454$_, this_compound, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
					format(T, $str_alt470$skipping__A______, this_compound);
				    } else {
					format(T, $str_alt471$investigating__A______, this_compound);
					not_skipped = add(not_skipped, ONE_INTEGER);
					{
					    SubLObject _prev_bind_0 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
					    SubLObject _prev_bind_1 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
					    try {
						lexicon_vars.$exclude_slangP$.bind(T, thread);
						lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind(NIL == lexification_utilities.initial_capitalizedP(this_compound) ? ((SubLObject) ($ON)) : $OFF, thread);
						{
						    SubLObject the_parses = rbp_escalating_parse(this_compound, UNPROVIDED);
						    if (NIL != list_utilities.proper_list_p(the_parses)) {
							work_done = add(work_done, ONE_INTEGER);
							format(T, $str_alt473$_S_______________________________, the_parses);
						    }
						}
					    } finally {
						lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_1, thread);
						lexicon_vars.$exclude_slangP$.rebind(_prev_bind_0, thread);
					    }
					}
				    }
				}
			    }
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
			    $is_thread_performing_cleanupP$.bind(T, thread);
			    if (NIL != stream_var) {
				close(stream_var, UNPROVIDED);
			    }
			} finally {
			    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
			}
		    }
		}
		format(T, $str_alt474$found_something_for__A_of__A_entr, work_done, not_skipped);
		return divide(work_done, not_skipped);
	    }
	}
    }

    public static SubLObject daml_process_ontology_file(SubLObject fn) {
	if (fn == UNPROVIDED) {
	    fn = $str414$_cyc_projects_daml_call_thesaurus;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	rbp_untrace();
	SubLObject not_bogus = ZERO_INTEGER;
	SubLObject not_skipped = ZERO_INTEGER;
	SubLObject work_done = ZERO_INTEGER;
	SubLObject stream_var = NIL;
	try {
	    SubLObject compound_file;
	    SubLObject this_compound;
	    SubLObject _prev_bind_0;
	    SubLObject _prev_bind_2;
	    SubLObject the_parses;
	    for (stream_var = compound_file = StreamsLow.open(fn, EMPTY_SUBL_OBJECT_ARRAY), this_compound = NIL, this_compound = string_utilities.network_read_line(compound_file, UNPROVIDED, UNPROVIDED, UNPROVIDED); (this_compound != $EOF)
		    && (NIL != this_compound); this_compound = string_utilities.network_read_line(compound_file, NIL, UNPROVIDED, UNPROVIDED)) {
		this_compound = string_utilities.remove_substring(this_compound, $str415$_);
		if (NIL == search($str416$_, this_compound, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		    not_bogus = add(not_bogus, ONE_INTEGER);
		    if (NIL == string_utilities.empty_string_p(this_compound)) {
			if ((NIL != lexification_utilities.initial_capitalizedP(this_compound)) && (NIL != search($str399$_, this_compound, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
			    format(T, $str417$skipping__A______, this_compound);
			} else {
			    format(T, $str418$investigating__A______, this_compound);
			    not_skipped = add(not_skipped, ONE_INTEGER);
			    _prev_bind_0 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
			    _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
			    try {
				lexicon_vars.$exclude_slangP$.bind(T, thread);
				lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind(NIL == lexification_utilities.initial_capitalizedP(this_compound) ? $ON : $OFF, thread);
				the_parses = rbp_escalating_parse(this_compound, UNPROVIDED);
				if (NIL != list_utilities.proper_list_p(the_parses)) {
				    work_done = add(work_done, ONE_INTEGER);
				    format(T, $str420$_S_______________________________, the_parses);
				}
			    } finally {
				lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_2, thread);
				lexicon_vars.$exclude_slangP$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		}
	    }
	} finally {
	    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		if (NIL != stream_var) {
		    close(stream_var, UNPROVIDED);
		}
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
	    }
	}
	format(T, $str421$found_something_for__A_of__A_entr, work_done, not_skipped);
	return divide(work_done, not_skipped);
    }

    public static final SubLObject with_ncr_for_test_case_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt475);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject name = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt475);
		    name = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    return list(PCOND, bq_cons(list(FIND_CONSTANT, name), append(body, NIL)), list($rbp_show_successful_rulesP$, list(WARN, $str_alt480$Skipping_this_test_as__A_doesn_t_, name)));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt475);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject with_ncr_for_test_case(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list422);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject name = NIL;
	destructuring_bind_must_consp(current, datum, $list422);
	name = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    return list(PCOND, bq_cons(list(FIND_CONSTANT, name), append(body, NIL)), list($rbp_show_successful_rulesP$, list(WARN, $str427$Skipping_this_test_as__A_doesn_t_, name)));
	}
	cdestructuring_bind_error(datum, $list422);
	return NIL;
    }

    public static final SubLObject declare_noun_compound_parser_file_alt() {
	declareFunction("add_nc_rule_constraint", "ADD-NC-RULE-CONSTRAINT", 2, 0, false);
	declareFunction("remove_nc_rule_constraint", "REMOVE-NC-RULE-CONSTRAINT", 2, 0, false);
	declareFunction("add_nc_rule_template", "ADD-NC-RULE-TEMPLATE", 2, 0, false);
	declareFunction("remove_nc_rule_template", "REMOVE-NC-RULE-TEMPLATE", 2, 0, false);
	declareFunction("noun_compound_parse_print_function_trampoline", "NOUN-COMPOUND-PARSE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("noun_compound_parse_p", "NOUN-COMPOUND-PARSE-P", 1, 0, false);
	new com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_parse_p$UnaryFunction();
	declareFunction("nc_parse_unique_id", "NC-PARSE-UNIQUE-ID", 1, 0, false);
	declareFunction("nc_parse_input_string", "NC-PARSE-INPUT-STRING", 1, 0, false);
	declareFunction("nc_parse_input_strings", "NC-PARSE-INPUT-STRINGS", 1, 0, false);
	declareFunction("nc_parse_chart", "NC-PARSE-CHART", 1, 0, false);
	declareFunction("_csetf_nc_parse_unique_id", "_CSETF-NC-PARSE-UNIQUE-ID", 2, 0, false);
	declareFunction("_csetf_nc_parse_input_string", "_CSETF-NC-PARSE-INPUT-STRING", 2, 0, false);
	declareFunction("_csetf_nc_parse_input_strings", "_CSETF-NC-PARSE-INPUT-STRINGS", 2, 0, false);
	declareFunction("_csetf_nc_parse_chart", "_CSETF-NC-PARSE-CHART", 2, 0, false);
	declareFunction("make_noun_compound_parse", "MAKE-NOUN-COMPOUND-PARSE", 0, 1, false);
	declareFunction("pprint_nc_parse", "PPRINT-NC-PARSE", 1, 2, false);
	declareFunction("new_nc_parse", "NEW-NC-PARSE", 0, 1, false);
	declareFunction("rbp_trace", "RBP-TRACE", 0, 0, false);
	declareMacro("with_rbp_trace", "WITH-RBP-TRACE");
	declareFunction("rbp_untrace", "RBP-UNTRACE", 0, 0, false);
	declareFunction("rbp_show_rules", "RBP-SHOW-RULES", 0, 0, false);
	declareFunction("rbp_hide_rules", "RBP-HIDE-RULES", 0, 0, false);
	declareFunction("rbp_traced_rules", "RBP-TRACED-RULES", 0, 0, false);
	declareFunction("rbp_trace_rule", "RBP-TRACE-RULE", 1, 0, false);
	declareFunction("rbp_untrace_all_rules", "RBP-UNTRACE-ALL-RULES", 0, 0, false);
	declareFunction("rbp_untrace_rule", "RBP-UNTRACE-RULE", 1, 0, false);
	declareFunction("just_one_spaceP", "JUST-ONE-SPACE?", 1, 0, false);
	declareFunction("noun_compound_block_print_function_trampoline", "NOUN-COMPOUND-BLOCK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("noun_compound_block_p", "NOUN-COMPOUND-BLOCK-P", 1, 0, false);
	new com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_block_p$UnaryFunction();
	declareFunction("nc_block_unique_id", "NC-BLOCK-UNIQUE-ID", 1, 0, false);
	declareFunction("nc_block_span_index", "NC-BLOCK-SPAN-INDEX", 1, 0, false);
	declareFunction("nc_block_confidence", "NC-BLOCK-CONFIDENCE", 1, 0, false);
	declareFunction("nc_block_denot", "NC-BLOCK-DENOT", 1, 0, false);
	declareFunction("nc_block_filters", "NC-BLOCK-FILTERS", 1, 0, false);
	declareFunction("nc_block_spanned_string", "NC-BLOCK-SPANNED-STRING", 1, 0, false);
	declareFunction("nc_block_head", "NC-BLOCK-HEAD", 1, 0, false);
	declareFunction("nc_block_head_pos", "NC-BLOCK-HEAD-POS", 1, 0, false);
	declareFunction("nc_block_head_string_pred", "NC-BLOCK-HEAD-STRING-PRED", 1, 0, false);
	declareFunction("nc_block_sub_tree", "NC-BLOCK-SUB-TREE", 1, 0, false);
	declareFunction("nc_block_plist", "NC-BLOCK-PLIST", 1, 0, false);
	declareFunction("_csetf_nc_block_unique_id", "_CSETF-NC-BLOCK-UNIQUE-ID", 2, 0, false);
	declareFunction("_csetf_nc_block_span_index", "_CSETF-NC-BLOCK-SPAN-INDEX", 2, 0, false);
	declareFunction("_csetf_nc_block_confidence", "_CSETF-NC-BLOCK-CONFIDENCE", 2, 0, false);
	declareFunction("_csetf_nc_block_denot", "_CSETF-NC-BLOCK-DENOT", 2, 0, false);
	declareFunction("_csetf_nc_block_filters", "_CSETF-NC-BLOCK-FILTERS", 2, 0, false);
	declareFunction("_csetf_nc_block_spanned_string", "_CSETF-NC-BLOCK-SPANNED-STRING", 2, 0, false);
	declareFunction("_csetf_nc_block_head", "_CSETF-NC-BLOCK-HEAD", 2, 0, false);
	declareFunction("_csetf_nc_block_head_pos", "_CSETF-NC-BLOCK-HEAD-POS", 2, 0, false);
	declareFunction("_csetf_nc_block_head_string_pred", "_CSETF-NC-BLOCK-HEAD-STRING-PRED", 2, 0, false);
	declareFunction("_csetf_nc_block_sub_tree", "_CSETF-NC-BLOCK-SUB-TREE", 2, 0, false);
	declareFunction("_csetf_nc_block_plist", "_CSETF-NC-BLOCK-PLIST", 2, 0, false);
	declareFunction("make_noun_compound_block", "MAKE-NOUN-COMPOUND-BLOCK", 0, 1, false);
	declareFunction("nc_block_plist_lookup", "NC-BLOCK-PLIST-LOOKUP", 2, 1, false);
	declareFunction("nc_block_plist_set", "NC-BLOCK-PLIST-SET", 3, 0, false);
	declareFunction("nc_block_wu", "NC-BLOCK-WU", 1, 0, false);
	declareFunction("nc_block_set_wu", "NC-BLOCK-SET-WU", 2, 0, false);
	declareFunction("nc_block_rule", "NC-BLOCK-RULE", 1, 0, false);
	declareFunction("nc_block_mod_block", "NC-BLOCK-MOD-BLOCK", 1, 1, false);
	declareFunction("nc_block_head_block", "NC-BLOCK-HEAD-BLOCK", 1, 1, false);
	declareFunction("nc_block_rule_count", "NC-BLOCK-RULE-COUNT", 2, 0, false);
	declareFunction("pprint_nc_block", "PPRINT-NC-BLOCK", 3, 0, false);
	declareFunction("new_noun_compound_block", "NEW-NOUN-COMPOUND-BLOCK", 4, 6, false);
	declareFunction("inference_new_noun_compound_block", "INFERENCE-NEW-NOUN-COMPOUND-BLOCK", 4, 6, false);
	declareFunction("rbp_cncb_reset", "RBP-CNCB-RESET", 0, 0, false);
	declareFunction("rbp_cncb_report", "RBP-CNCB-REPORT", 0, 0, false);
	declareFunction("combine_noun_compound_blocks_internal", "COMBINE-NOUN-COMPOUND-BLOCKS-INTERNAL", 3, 0, false);
	declareFunction("combine_noun_compound_blocks", "COMBINE-NOUN-COMPOUND-BLOCKS", 3, 0, false);
	declareFunction("token_to_blocks", "TOKEN-TO-BLOCKS", 1, 0, false);
	declareFunction("rbp_adj_blockP", "RBP-ADJ-BLOCK?", 1, 0, false);
	declareFunction("rbp_adj_modified_blockP", "RBP-ADJ-MODIFIED-BLOCK?", 2, 0, false);
	declareFunction("rbp_base_from_block", "RBP-BASE-FROM-BLOCK", 2, 0, false);
	declareFunction("rbp_apply_filter_cluster", "RBP-APPLY-FILTER-CLUSTER", 3, 3, false);
	declareFunction("rbp_process_filter_clusters", "RBP-PROCESS-FILTER-CLUSTERS", 2, 1, false);
	declareFunction("rbp_parse_wrong_sizeP", "RBP-PARSE-WRONG-SIZE?", 2, 0, false);
	declareFunction("rbp_component_count", "RBP-COMPONENT-COUNT", 2, 0, false);
	declareMacro("ncp_reporting_metrics", "NCP-REPORTING-METRICS");
	declareFunction("parse_noun_compound", "PARSE-NOUN-COMPOUND", 1, 2, false);
	declareFunction("parse_noun_compound_with_rules", "PARSE-NOUN-COMPOUND-WITH-RULES", 2, 2, false);
	declareFunction("rbp_rule_fort_p", "RBP-RULE-FORT-P", 1, 0, false);
	declareFunction("parse_noun_compound_from_string_tokens", "PARSE-NOUN-COMPOUND-FROM-STRING-TOKENS", 1, 2, false);
	declareMacro("with_new_ncp_problem_store", "WITH-NEW-NCP-PROBLEM-STORE");
	declareFunction("parse_noun_compound_int", "PARSE-NOUN-COMPOUND-INT", 3, 1, false);
	declareFunction("ncp_initialize_metrics", "NCP-INITIALIZE-METRICS", 0, 0, false);
	declareFunction("ncp_report_metrics", "NCP-REPORT-METRICS", 1, 0, false);
	declareFunction("ncp_herald_start", "NCP-HERALD-START", 1, 0, false);
	declareFunction("rbp_sort_blocks_complexity_first", "RBP-SORT-BLOCKS-COMPLEXITY-FIRST", 1, 0, false);
	declareFunction("rbp_sort_blocks_confidence_first", "RBP-SORT-BLOCKS-CONFIDENCE-FIRST", 1, 0, false);
	declareFunction("rbp_filter_and_sort_result_blocks", "RBP-FILTER-AND-SORT-RESULT-BLOCKS", 2, 1, false);
	declareFunction("rbp_block_reliability_estimate", "RBP-BLOCK-RELIABILITY-ESTIMATE", 1, 1, false);
	declareFunction("rbp_unify_blocks_to_common_specpreds", "RBP-UNIFY-BLOCKS-TO-COMMON-SPECPREDS", 1, 0, false);
	declareFunction("rbp_unify_rewrite_of_blocks", "RBP-UNIFY-REWRITE-OF-BLOCKS", 1, 0, false);
	declareFunction("rbp_unify_city_named_fn_blocks", "RBP-UNIFY-CITY-NAMED-FN-BLOCKS", 1, 0, false);
	declareFunction("rbp_nominal_blockP", "RBP-NOMINAL-BLOCK?", 1, 0, false);
	declareFunction("display_complete_parses", "DISPLAY-COMPLETE-PARSES", 1, 0, false);
	declareFunction("nc_block_uses_required_rules_p", "NC-BLOCK-USES-REQUIRED-RULES-P", 3, 0, false);
	declareFunction("nc_block_uses_required_rule_p", "NC-BLOCK-USES-REQUIRED-RULE-P", 3, 0, false);
	declareFunction("rbp_parse_and_confidenceP", "RBP-PARSE-AND-CONFIDENCE?", 1, 0, false);
	declareFunction("rbp_parse_and_confidenceE", "RBP-PARSE-AND-CONFIDENCE=", 2, 0, false);
	declareFunction("ncp_chart_init", "NCP-CHART-INIT", 0, 2, false);
	declareFunction("ncp_chart_init_from_string_tokens", "NCP-CHART-INIT-FROM-STRING-TOKENS", 1, 0, false);
	declareFunction("new_ncp_chart", "NEW-NCP-CHART", 1, 0, false);
	declareFunction("ncp_chart_init_int", "NCP-CHART-INIT-INT", 2, 0, false);
	declareFunction("rbp_input_spanning_blockP", "RBP-INPUT-SPANNING-BLOCK?", 2, 0, false);
	declareFunction("rbp_filter_verbs", "RBP-FILTER-VERBS", 1, 0, false);
	declareFunction("rbp_filter_verbs_in_tuples", "RBP-FILTER-VERBS-IN-TUPLES", 1, 0, false);
	declareFunction("rbp_remove_subsumed_tokens", "RBP-REMOVE-SUBSUMED-TOKENS", 2, 0, false);
	declareFunction("rbp_span_subsumed_by_all_ofP", "RBP-SPAN-SUBSUMED-BY-ALL-OF?", 2, 0, false);
	declareFunction("rbp_span_subsumed_byP", "RBP-SPAN-SUBSUMED-BY?", 2, 0, false);
	declareFunction("initialize_rbp_name_cache", "INITIALIZE-RBP-NAME-CACHE", 0, 0, false);
	declareFunction("rbp_name_block_pred_among_floorsP", "RBP-NAME-BLOCK-PRED-AMONG-FLOORS?", 1, 0, false);
	declareFunction("rbp_cache_name_block", "RBP-CACHE-NAME-BLOCK", 1, 0, false);
	declareFunction("clear_rbp_floors_cached", "CLEAR-RBP-FLOORS-CACHED", 0, 0, false);
	declareFunction("remove_rbp_floors_cached", "REMOVE-RBP-FLOORS-CACHED", 1, 0, false);
	declareFunction("rbp_floors_cached_internal", "RBP-FLOORS-CACHED-INTERNAL", 1, 0, false);
	declareFunction("rbp_floors_cached", "RBP-FLOORS-CACHED", 1, 0, false);
	declareFunction("clear_rbp_ok_name_cachedP", "CLEAR-RBP-OK-NAME-CACHED?", 0, 0, false);
	declareFunction("remove_rbp_ok_name_cachedP", "REMOVE-RBP-OK-NAME-CACHED?", 2, 0, false);
	declareFunction("rbp_ok_name_cachedP_internal", "RBP-OK-NAME-CACHED?-INTERNAL", 2, 0, false);
	declareFunction("rbp_ok_name_cachedP", "RBP-OK-NAME-CACHED?", 2, 0, false);
	declareFunction("rbp_strings_for_span", "RBP-STRINGS-FOR-SPAN", 1, 0, false);
	declareFunction("rbp_string_tokenize", "RBP-STRING-TOKENIZE", 1, 0, false);
	declareFunction("rbp_ok_blockP", "RBP-OK-BLOCK?", 1, 0, false);
	declareFunction("rbp_bad_name_blockP", "RBP-BAD-NAME-BLOCK?", 1, 0, false);
	declareFunction("rbp_name_blockP", "RBP-NAME-BLOCK?", 1, 0, false);
	declareFunction("rbp_filter_redundant_blocks", "RBP-FILTER-REDUNDANT-BLOCKS", 1, 0, false);
	declareFunction("display_all_parses", "DISPLAY-ALL-PARSES", 1, 0, false);
	declareFunction("display_all_trees", "DISPLAY-ALL-TREES", 1, 0, false);
	declareFunction("display_tree", "DISPLAY-TREE", 2, 0, false);
	declareFunction("rbp_rule_count", "RBP-RULE-COUNT", 0, 0, false);
	declareFunction("rbp_rule_cycl_semx", "RBP-RULE-CYCL-SEMX", 1, 1, false);
	declareFunction("rbp_rule_okP", "RBP-RULE-OK?", 1, 0, false);
	declareFunction("rbp_domain_mt", "RBP-DOMAIN-MT", 0, 0, false);
	declareFunction("rbp_get_cognate_from_instance_level_arg", "RBP-GET-COGNATE-FROM-INSTANCE-LEVEL-ARG", 1, 0, false);
	declareFunction("rbp_get_cognate_from_type_level_arg", "RBP-GET-COGNATE-FROM-TYPE-LEVEL-ARG", 1, 0, false);
	declareFunction("rbp_semx_type_level_cognate", "RBP-SEMX-TYPE-LEVEL-COGNATE", 1, 0, false);
	declareFunction("ncp_ask_variable", "NCP-ASK-VARIABLE", 3, 1, false);
	declareFunction("rbp_subcol_naut_fails_inter_arg_checksP", "RBP-SUBCOL-NAUT-FAILS-INTER-ARG-CHECKS?", 3, 2, false);
	declareFunction("rbp_get_dep_cols", "RBP-GET-DEP-COLS", 5, 0, false);
	declareFunction("rbp_subcol_naut_do_inter_arg_test", "RBP-SUBCOL-NAUT-DO-INTER-ARG-TEST", 5, 0, false);
	declareFunction("rbp_inter_arg_isa_pred", "RBP-INTER-ARG-ISA-PRED", 2, 0, false);
	declareFunction("rbp_inter_arg_not_isa_pred", "RBP-INTER-ARG-NOT-ISA-PRED", 2, 0, false);
	declareFunction("rbp_binary_gaf_fails_inter_arg_checksP", "RBP-BINARY-GAF-FAILS-INTER-ARG-CHECKS?", 1, 1, false);
	declareFunction("rbp_fails_wff_workaroundsP", "RBP-FAILS-WFF-WORKAROUNDS?", 2, 1, false);
	declareFunction("rbp_rb_combine_noun_compound_blocks", "RBP-RB-COMBINE-NOUN-COMPOUND-BLOCKS", 2, 0, false);
	declareFunction("rbp_rb_rules_matching_blocks", "RBP-RB-RULES-MATCHING-BLOCKS", 2, 0, false);
	declareFunction("rbp_rb_rules_matching_blocks_wrt_closed_constraints", "RBP-RB-RULES-MATCHING-BLOCKS-WRT-CLOSED-CONSTRAINTS", 2, 1, false);
	declareFunction("clear_rbp_rb_rules_matching_closed_specs", "CLEAR-RBP-RB-RULES-MATCHING-CLOSED-SPECS", 0, 0, false);
	declareFunction("remove_rbp_rb_rules_matching_closed_specs", "REMOVE-RBP-RB-RULES-MATCHING-CLOSED-SPECS", 1, 0, false);
	declareFunction("rbp_rb_rules_matching_closed_specs_internal", "RBP-RB-RULES-MATCHING-CLOSED-SPECS-INTERNAL", 1, 0, false);
	declareFunction("rbp_rb_rules_matching_closed_specs", "RBP-RB-RULES-MATCHING-CLOSED-SPECS", 1, 0, false);
	declareFunction("rbp_rb_search_wrt_open_constraints", "RBP-RB-SEARCH-WRT-OPEN-CONSTRAINTS", 4, 0, false);
	declareFunction("rbp_verify_internal", "RBP-VERIFY-INTERNAL", 1, 1, false);
	declareFunction("rbp_verify", "RBP-VERIFY", 1, 1, false);
	declareFunction("rbp_rb_search", "RBP-RB-SEARCH", 2, 3, false);
	declareFunction("inference_rbp_rb_search", "INFERENCE-RBP-RB-SEARCH", 2, 3, false);
	declareFunction("rbp_rb_initial_search_no_tracing_internal", "RBP-RB-INITIAL-SEARCH-NO-TRACING-INTERNAL", 2, 0, false);
	declareFunction("rbp_rb_initial_search_no_tracing", "RBP-RB-INITIAL-SEARCH-NO-TRACING", 2, 0, false);
	declareFunction("rbp_rb_search_internal", "RBP-RB-SEARCH-INTERNAL", 5, 0, false);
	declareFunction("rbp_rb_blocks_pass_inter_constraintsP", "RBP-RB-BLOCKS-PASS-INTER-CONSTRAINTS?", 3, 0, false);
	declareFunction("clear_inter_constraints_from_rule", "CLEAR-INTER-CONSTRAINTS-FROM-RULE", 0, 0, false);
	declareFunction("remove_inter_constraints_from_rule", "REMOVE-INTER-CONSTRAINTS-FROM-RULE", 1, 0, false);
	declareFunction("inter_constraints_from_rule_internal", "INTER-CONSTRAINTS-FROM-RULE-INTERNAL", 1, 0, false);
	declareFunction("inter_constraints_from_rule", "INTER-CONSTRAINTS-FROM-RULE", 1, 0, false);
	declareFunction("blocks_pass_all_inter_nc_constraintsP", "BLOCKS-PASS-ALL-INTER-NC-CONSTRAINTS?", 3, 0, false);
	declareFunction("blocks_pass_inter_nc_constraintP", "BLOCKS-PASS-INTER-NC-CONSTRAINT?", 3, 0, false);
	declareFunction("inter_nc_block_test", "INTER-NC-BLOCK-TEST", 3, 0, false);
	declareFunction("rbp_check_initializations", "RBP-CHECK-INITIALIZATIONS", 0, 0, false);
	declareFunction("combine_blocks_with_template", "COMBINE-BLOCKS-WITH-TEMPLATE", 3, 1, false);
	declareFunction("rbp_test_for_con_kw", "RBP-TEST-FOR-CON-KW", 1, 0, false);
	declareFunction("rbp_candidate_fn_for_con_kw", "RBP-CANDIDATE-FN-FOR-CON-KW", 1, 0, false);
	declareFunction("ncp_count_strings_for_all_rules", "NCP-COUNT-STRINGS-FOR-ALL-RULES", 0, 1, false);
	declareFunction("ncp_count_strings_for_rule", "NCP-COUNT-STRINGS-FOR-RULE", 1, 1, false);
	declareFunction("ncp_count_strings_for_rule_and_type", "NCP-COUNT-STRINGS-FOR-RULE-AND-TYPE", 2, 1, false);
	declareFunction("ncp_count_strings_name_preds", "NCP-COUNT-STRINGS-NAME-PREDS", 0, 0, false);
	declareFunction("proper_noun_genls", "PROPER-NOUN-GENLS", 0, 0, false);
	declareFunction("clear_ncp_count_pos_assertions_cached", "CLEAR-NCP-COUNT-POS-ASSERTIONS-CACHED", 0, 0, false);
	declareFunction("remove_ncp_count_pos_assertions_cached", "REMOVE-NCP-COUNT-POS-ASSERTIONS-CACHED", 1, 0, false);
	declareFunction("ncp_count_pos_assertions_cached_internal", "NCP-COUNT-POS-ASSERTIONS-CACHED-INTERNAL", 1, 0, false);
	declareFunction("ncp_count_pos_assertions_cached", "NCP-COUNT-POS-ASSERTIONS-CACHED", 1, 0, false);
	declareFunction("ncp_terms_meeting_rule_and_type", "NCP-TERMS-MEETING-RULE-AND-TYPE", 2, 1, false);
	declareFunction("clear_ncp_preds_of_pos_count", "CLEAR-NCP-PREDS-OF-POS-COUNT", 0, 0, false);
	declareFunction("remove_ncp_preds_of_pos_count", "REMOVE-NCP-PREDS-OF-POS-COUNT", 1, 0, false);
	declareFunction("ncp_preds_of_pos_count_internal", "NCP-PREDS-OF-POS-COUNT-INTERNAL", 1, 0, false);
	declareFunction("ncp_preds_of_pos_count", "NCP-PREDS-OF-POS-COUNT", 1, 0, false);
	declareFunction("ncp_count_strings", "NCP-COUNT-STRINGS", 2, 0, false);
	declareFunction("ncp_compute_rule_overlap", "NCP-COMPUTE-RULE-OVERLAP", 2, 1, false);
	declareFunction("ncp_merge_pos", "NCP-MERGE-POS", 2, 0, false);
	declareFunction("ncp_intersect_rule_lists", "NCP-INTERSECT-RULE-LISTS", 2, 0, false);
	declareFunction("ncp_term_count", "NCP-TERM-COUNT", 1, 0, false);
	declareFunction("rbp_get_deverbal_root", "RBP-GET-DEVERBAL-ROOT", 1, 1, false);
	declareFunction("rbp_deverbal_candidateP", "RBP-DEVERBAL-CANDIDATE?", 1, 0, false);
	declareFunction("parse_deverbal_compound_as_fallback", "PARSE-DEVERBAL-COMPOUND-AS-FALLBACK", 1, 1, false);
	declareFunction("parse_deverbal_compound_with_fallback", "PARSE-DEVERBAL-COMPOUND-WITH-FALLBACK", 1, 2, false);
	declareFunction("date_parse_block_print_function_trampoline", "DATE-PARSE-BLOCK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("date_parse_block_p", "DATE-PARSE-BLOCK-P", 1, 0, false);
	new com.cyc.cycjava.cycl.noun_compound_parser.$date_parse_block_p$UnaryFunction();
	declareFunction("date_parse_block_subcol_naut", "DATE-PARSE-BLOCK-SUBCOL-NAUT", 1, 0, false);
	declareFunction("date_parse_block_confidence", "DATE-PARSE-BLOCK-CONFIDENCE", 1, 0, false);
	declareFunction("_csetf_date_parse_block_subcol_naut", "_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT", 2, 0, false);
	declareFunction("_csetf_date_parse_block_confidence", "_CSETF-DATE-PARSE-BLOCK-CONFIDENCE", 2, 0, false);
	declareFunction("make_date_parse_block", "MAKE-DATE-PARSE-BLOCK", 0, 1, false);
	declareFunction("new_date_parse_block", "NEW-DATE-PARSE-BLOCK", 2, 0, false);
	declareFunction("new_date_parse_block_for_denot_and_date", "NEW-DATE-PARSE-BLOCK-FOR-DENOT-AND-DATE", 3, 1, false);
	declareFunction("date_parse_complexity_G", "DATE-PARSE-COMPLEXITY->", 2, 0, false);
	declareFunction("date_confidence_adjusted_for_year", "DATE-CONFIDENCE-ADJUSTED-FOR-YEAR", 2, 0, false);
	declareFunction("date_parse_list_incorporate_frequency", "DATE-PARSE-LIST-INCORPORATE-FREQUENCY", 2, 0, false);
	declareFunction("parse_string_as_date_fallback", "PARSE-STRING-AS-DATE-FALLBACK", 1, 2, false);
	declareFunction("parse_noun_compound_with_date_fallback", "PARSE-NOUN-COMPOUND-WITH-DATE-FALLBACK", 1, 2, false);
	declareFunction("rbp_generate_nauts_via_pointwise_analysis", "RBP-GENERATE-NAUTS-VIA-POINTWISE-ANALYSIS", 3, 0, false);
	declareFunction("rbp_deverbal_fallback", "RBP-DEVERBAL-FALLBACK", 1, 0, false);
	declareFunction("rbp_parse_filter_nonagentive_actors", "RBP-PARSE-FILTER-NONAGENTIVE-ACTORS", 1, 0, false);
	declareFunction("rbp_matches_any_all_exists_gafsP", "RBP-MATCHES-ANY-ALL-EXISTS-GAFS?", 6, 0, false);
	declareFunction("rbp_all_exists_matches_internal", "RBP-ALL-EXISTS-MATCHES-INTERNAL", 6, 1, false);
	declareFunction("rbp_all_exists_matches", "RBP-ALL-EXISTS-MATCHES", 6, 1, false);
	declareFunction("rbp_matches_any_all_exists_gafs_query_sentence", "RBP-MATCHES-ANY-ALL-EXISTS-GAFS-QUERY-SENTENCE", 6, 0, false);
	declareFunction("rbp_parse_prefer_rmp_matches", "RBP-PARSE-PREFER-RMP-MATCHES", 1, 1, false);
	declareFunction("rbp_parse_prefer_rmp_matches_int", "RBP-PARSE-PREFER-RMP-MATCHES-INT", 1, 1, false);
	declareFunction("rbp_parse_rmp_problem_for_subcol_naut", "RBP-PARSE-RMP-PROBLEM-FOR-SUBCOL-NAUT", 2, 0, false);
	declareFunction("rbp_coerce_to_ternary_subcollection_naut", "RBP-COERCE-TO-TERNARY-SUBCOLLECTION-NAUT", 1, 0, false);
	declareFunction("rbp_parse_prefer_rmp_matches_failure_message", "RBP-PARSE-PREFER-RMP-MATCHES-FAILURE-MESSAGE", 1, 0, false);
	declareFunction("rbp_parse_filter_unlikely_instrumentals", "RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS", 1, 0, false);
	declareFunction("rbp_parse_filter_unlikely_instrumentals_int", "RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS-INT", 1, 0, false);
	declareFunction("rbp_parse_filter_subcollection_args", "RBP-PARSE-FILTER-SUBCOLLECTION-ARGS", 1, 0, false);
	declareFunction("rbp_bad_subcollection_to_argP", "RBP-BAD-SUBCOLLECTION-TO-ARG?", 2, 0, false);
	declareFunction("rbp_bad_subcollection_from_argP", "RBP-BAD-SUBCOLLECTION-FROM-ARG?", 2, 0, false);
	declareFunction("rbp_unlikely_subcollection_naut_block_wrt_objectP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT-BLOCK-WRT-OBJECT?", 2, 0, false);
	declareFunction("rbp_unlikely_subcollection_naut_wrt_objectP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT-WRT-OBJECT?", 2, 0, false);
	declareFunction("clear_rbp_unlikely_subcollection_nautP", "CLEAR-RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 0, 0, false);
	declareFunction("remove_rbp_unlikely_subcollection_nautP", "REMOVE-RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 4, 0, false);
	declareFunction("rbp_unlikely_subcollection_nautP_internal", "RBP-UNLIKELY-SUBCOLLECTION-NAUT?-INTERNAL", 4, 0, false);
	declareFunction("rbp_unlikely_subcollection_nautP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 4, 0, false);
	declareFunction("parse_adj_initial_compound", "PARSE-ADJ-INITIAL-COMPOUND", 1, 1, false);
	declareFunction("rbp_escalating_parse", "RBP-ESCALATING-PARSE", 1, 1, false);
	declareFunction("parse_as_denot_or_noun_compound", "PARSE-AS-DENOT-OR-NOUN-COMPOUND", 1, 1, false);
	declareFunction("parse_string_as_date_fallback_escalated", "PARSE-STRING-AS-DATE-FALLBACK-ESCALATED", 1, 1, false);
	declareFunction("initialize_ncs_formats", "INITIALIZE-NCS-FORMATS", 1, 0, false);
	declareFunction("ncs_format", "NCS-FORMAT", 1, 0, false);
	declareMacro("ncs_note", "NCS-NOTE");
	declareFunction("noun_compound_statistics", "NOUN-COMPOUND-STATISTICS", 0, 3, false);
	declareFunction("print_rbp_parses_with_sources", "PRINT-RBP-PARSES-WITH-SOURCES", 3, 1, false);
	declareFunction("daml_process_ontology_file", "DAML-PROCESS-ONTOLOGY-FILE", 0, 1, false);
	declareMacro("with_ncr_for_test_case", "WITH-NCR-FOR-TEST-CASE");
	return NIL;
    }

    public static SubLObject declare_noun_compound_parser_file() {
	if (SubLFiles.USE_V1) {
	    declareFunction("add_nc_rule_constraint", "ADD-NC-RULE-CONSTRAINT", 2, 0, false);
	    declareFunction("remove_nc_rule_constraint", "REMOVE-NC-RULE-CONSTRAINT", 2, 0, false);
	    declareFunction("add_nc_rule_template", "ADD-NC-RULE-TEMPLATE", 2, 0, false);
	    declareFunction("remove_nc_rule_template", "REMOVE-NC-RULE-TEMPLATE", 2, 0, false);
	    declareFunction("noun_compound_parse_print_function_trampoline", "NOUN-COMPOUND-PARSE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("noun_compound_parse_p", "NOUN-COMPOUND-PARSE-P", 1, 0, false);
	    new noun_compound_parser.$noun_compound_parse_p$UnaryFunction();
	    declareFunction("nc_parse_unique_id", "NC-PARSE-UNIQUE-ID", 1, 0, false);
	    declareFunction("nc_parse_input_string", "NC-PARSE-INPUT-STRING", 1, 0, false);
	    declareFunction("nc_parse_input_strings", "NC-PARSE-INPUT-STRINGS", 1, 0, false);
	    declareFunction("nc_parse_chart", "NC-PARSE-CHART", 1, 0, false);
	    declareFunction("_csetf_nc_parse_unique_id", "_CSETF-NC-PARSE-UNIQUE-ID", 2, 0, false);
	    declareFunction("_csetf_nc_parse_input_string", "_CSETF-NC-PARSE-INPUT-STRING", 2, 0, false);
	    declareFunction("_csetf_nc_parse_input_strings", "_CSETF-NC-PARSE-INPUT-STRINGS", 2, 0, false);
	    declareFunction("_csetf_nc_parse_chart", "_CSETF-NC-PARSE-CHART", 2, 0, false);
	    declareFunction("make_noun_compound_parse", "MAKE-NOUN-COMPOUND-PARSE", 0, 1, false);
	    declareFunction("visit_defstruct_noun_compound_parse", "VISIT-DEFSTRUCT-NOUN-COMPOUND-PARSE", 2, 0, false);
	    declareFunction("visit_defstruct_object_noun_compound_parse_method", "VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-PARSE-METHOD", 2, 0, false);
	    declareFunction("pprint_nc_parse", "PPRINT-NC-PARSE", 1, 2, false);
	    declareFunction("new_nc_parse", "NEW-NC-PARSE", 0, 1, false);
	    declareFunction("rbp_trace", "RBP-TRACE", 0, 0, false);
	    declareMacro("with_rbp_trace", "WITH-RBP-TRACE");
	    declareFunction("rbp_untrace", "RBP-UNTRACE", 0, 0, false);
	    declareFunction("rbp_show_rules", "RBP-SHOW-RULES", 0, 0, false);
	    declareFunction("rbp_hide_rules", "RBP-HIDE-RULES", 0, 0, false);
	    declareFunction("rbp_traced_rules", "RBP-TRACED-RULES", 0, 0, false);
	    declareFunction("rbp_trace_rule", "RBP-TRACE-RULE", 1, 0, false);
	    declareFunction("rbp_untrace_all_rules", "RBP-UNTRACE-ALL-RULES", 0, 0, false);
	    declareFunction("rbp_untrace_rule", "RBP-UNTRACE-RULE", 1, 0, false);
	    declareFunction("just_one_spaceP", "JUST-ONE-SPACE?", 1, 0, false);
	    declareFunction("noun_compound_block_print_function_trampoline", "NOUN-COMPOUND-BLOCK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("noun_compound_block_p", "NOUN-COMPOUND-BLOCK-P", 1, 0, false);
	    new noun_compound_parser.$noun_compound_block_p$UnaryFunction();
	    declareFunction("nc_block_unique_id", "NC-BLOCK-UNIQUE-ID", 1, 0, false);
	    declareFunction("nc_block_span_index", "NC-BLOCK-SPAN-INDEX", 1, 0, false);
	    declareFunction("nc_block_confidence", "NC-BLOCK-CONFIDENCE", 1, 0, false);
	    declareFunction("nc_block_denot", "NC-BLOCK-DENOT", 1, 0, false);
	    declareFunction("nc_block_filters", "NC-BLOCK-FILTERS", 1, 0, false);
	    declareFunction("nc_block_spanned_string", "NC-BLOCK-SPANNED-STRING", 1, 0, false);
	    declareFunction("nc_block_head", "NC-BLOCK-HEAD", 1, 0, false);
	    declareFunction("nc_block_head_pos", "NC-BLOCK-HEAD-POS", 1, 0, false);
	    declareFunction("nc_block_head_string_pred", "NC-BLOCK-HEAD-STRING-PRED", 1, 0, false);
	    declareFunction("nc_block_sub_tree", "NC-BLOCK-SUB-TREE", 1, 0, false);
	    declareFunction("nc_block_plist", "NC-BLOCK-PLIST", 1, 0, false);
	    declareFunction("_csetf_nc_block_unique_id", "_CSETF-NC-BLOCK-UNIQUE-ID", 2, 0, false);
	    declareFunction("_csetf_nc_block_span_index", "_CSETF-NC-BLOCK-SPAN-INDEX", 2, 0, false);
	    declareFunction("_csetf_nc_block_confidence", "_CSETF-NC-BLOCK-CONFIDENCE", 2, 0, false);
	    declareFunction("_csetf_nc_block_denot", "_CSETF-NC-BLOCK-DENOT", 2, 0, false);
	    declareFunction("_csetf_nc_block_filters", "_CSETF-NC-BLOCK-FILTERS", 2, 0, false);
	    declareFunction("_csetf_nc_block_spanned_string", "_CSETF-NC-BLOCK-SPANNED-STRING", 2, 0, false);
	    declareFunction("_csetf_nc_block_head", "_CSETF-NC-BLOCK-HEAD", 2, 0, false);
	    declareFunction("_csetf_nc_block_head_pos", "_CSETF-NC-BLOCK-HEAD-POS", 2, 0, false);
	    declareFunction("_csetf_nc_block_head_string_pred", "_CSETF-NC-BLOCK-HEAD-STRING-PRED", 2, 0, false);
	    declareFunction("_csetf_nc_block_sub_tree", "_CSETF-NC-BLOCK-SUB-TREE", 2, 0, false);
	    declareFunction("_csetf_nc_block_plist", "_CSETF-NC-BLOCK-PLIST", 2, 0, false);
	    declareFunction("make_noun_compound_block", "MAKE-NOUN-COMPOUND-BLOCK", 0, 1, false);
	    declareFunction("visit_defstruct_noun_compound_block", "VISIT-DEFSTRUCT-NOUN-COMPOUND-BLOCK", 2, 0, false);
	    declareFunction("visit_defstruct_object_noun_compound_block_method", "VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-BLOCK-METHOD", 2, 0, false);
	    declareFunction("nc_block_plist_lookup", "NC-BLOCK-PLIST-LOOKUP", 2, 1, false);
	    declareFunction("nc_block_plist_set", "NC-BLOCK-PLIST-SET", 3, 0, false);
	    declareFunction("nc_block_wu", "NC-BLOCK-WU", 1, 0, false);
	    declareFunction("nc_block_set_wu", "NC-BLOCK-SET-WU", 2, 0, false);
	    declareFunction("nc_block_rule", "NC-BLOCK-RULE", 1, 0, false);
	    declareFunction("nc_block_mod_block", "NC-BLOCK-MOD-BLOCK", 1, 1, false);
	    declareFunction("nc_block_head_block", "NC-BLOCK-HEAD-BLOCK", 1, 1, false);
	    declareFunction("nc_block_rule_count", "NC-BLOCK-RULE-COUNT", 2, 0, false);
	    declareFunction("pprint_nc_block", "PPRINT-NC-BLOCK", 3, 0, false);
	    declareFunction("new_noun_compound_block", "NEW-NOUN-COMPOUND-BLOCK", 4, 6, false);
	    declareFunction("inference_new_noun_compound_block", "INFERENCE-NEW-NOUN-COMPOUND-BLOCK", 4, 6, false);
	    declareFunction("combine_noun_compound_blocks_internal", "COMBINE-NOUN-COMPOUND-BLOCKS-INTERNAL", 3, 0, false);
	    declareFunction("combine_noun_compound_blocks", "COMBINE-NOUN-COMPOUND-BLOCKS", 3, 0, false);
	    declareFunction("token_to_blocks", "TOKEN-TO-BLOCKS", 1, 0, false);
	    declareFunction("rbp_adj_blockP", "RBP-ADJ-BLOCK?", 1, 0, false);
	    declareFunction("rbp_adj_modified_blockP", "RBP-ADJ-MODIFIED-BLOCK?", 2, 0, false);
	    declareFunction("rbp_base_from_block", "RBP-BASE-FROM-BLOCK", 2, 0, false);
	    declareFunction("rbp_apply_filter_cluster", "RBP-APPLY-FILTER-CLUSTER", 3, 3, false);
	    declareFunction("rbp_process_filter_clusters", "RBP-PROCESS-FILTER-CLUSTERS", 2, 1, false);
	    declareFunction("rbp_parse_wrong_sizeP", "RBP-PARSE-WRONG-SIZE?", 2, 0, false);
	    declareFunction("rbp_component_count", "RBP-COMPONENT-COUNT", 2, 0, false);
	    declareMacro("ncp_reporting_metrics", "NCP-REPORTING-METRICS");
	    declareFunction("parse_noun_compound", "PARSE-NOUN-COMPOUND", 1, 2, false);
	    declareFunction("parse_noun_compound_with_rules", "PARSE-NOUN-COMPOUND-WITH-RULES", 2, 2, false);
	    declareFunction("rbp_rule_fort_p", "RBP-RULE-FORT-P", 1, 0, false);
	    declareFunction("parse_noun_compound_from_string_tokens", "PARSE-NOUN-COMPOUND-FROM-STRING-TOKENS", 1, 2, false);
	    declareMacro("with_new_ncp_problem_store", "WITH-NEW-NCP-PROBLEM-STORE");
	    declareFunction("parse_noun_compound_int", "PARSE-NOUN-COMPOUND-INT", 3, 1, false);
	    declareFunction("ncp_initialize_metrics", "NCP-INITIALIZE-METRICS", 0, 0, false);
	    declareFunction("ncp_report_metrics", "NCP-REPORT-METRICS", 1, 0, false);
	    declareFunction("ncp_herald_start", "NCP-HERALD-START", 1, 0, false);
	    declareFunction("rbp_sort_blocks_complexity_first", "RBP-SORT-BLOCKS-COMPLEXITY-FIRST", 1, 0, false);
	    declareFunction("rbp_sort_blocks_confidence_first", "RBP-SORT-BLOCKS-CONFIDENCE-FIRST", 1, 0, false);
	    declareFunction("rbp_filter_and_sort_result_blocks", "RBP-FILTER-AND-SORT-RESULT-BLOCKS", 2, 1, false);
	    declareFunction("rbp_block_reliability_estimate", "RBP-BLOCK-RELIABILITY-ESTIMATE", 1, 1, false);
	    declareFunction("rbp_unify_blocks_to_common_specpreds", "RBP-UNIFY-BLOCKS-TO-COMMON-SPECPREDS", 1, 0, false);
	    declareFunction("rbp_unify_rewrite_of_blocks", "RBP-UNIFY-REWRITE-OF-BLOCKS", 1, 0, false);
	    declareFunction("rbp_unify_city_named_fn_blocks", "RBP-UNIFY-CITY-NAMED-FN-BLOCKS", 1, 0, false);
	    declareFunction("rbp_nominal_blockP", "RBP-NOMINAL-BLOCK?", 1, 0, false);
	    declareFunction("display_complete_parses", "DISPLAY-COMPLETE-PARSES", 1, 0, false);
	    declareFunction("nc_block_uses_required_rules_p", "NC-BLOCK-USES-REQUIRED-RULES-P", 3, 0, false);
	    declareFunction("nc_block_uses_required_rule_p", "NC-BLOCK-USES-REQUIRED-RULE-P", 3, 0, false);
	    declareFunction("rbp_parse_and_confidenceP", "RBP-PARSE-AND-CONFIDENCE?", 1, 0, false);
	    declareFunction("rbp_parse_and_confidenceE", "RBP-PARSE-AND-CONFIDENCE=", 2, 0, false);
	    declareFunction("ncp_chart_init", "NCP-CHART-INIT", 0, 2, false);
	    declareFunction("ncp_chart_init_from_string_tokens", "NCP-CHART-INIT-FROM-STRING-TOKENS", 1, 0, false);
	    declareFunction("new_ncp_chart", "NEW-NCP-CHART", 1, 0, false);
	    declareFunction("ncp_chart_init_int", "NCP-CHART-INIT-INT", 2, 0, false);
	    declareFunction("rbp_input_spanning_blockP", "RBP-INPUT-SPANNING-BLOCK?", 2, 0, false);
	    declareFunction("rbp_filter_verbs", "RBP-FILTER-VERBS", 1, 0, false);
	    declareFunction("rbp_filter_verbs_in_tuples", "RBP-FILTER-VERBS-IN-TUPLES", 1, 0, false);
	    declareFunction("rbp_remove_subsumed_tokens", "RBP-REMOVE-SUBSUMED-TOKENS", 2, 0, false);
	    declareFunction("rbp_span_subsumed_by_all_ofP", "RBP-SPAN-SUBSUMED-BY-ALL-OF?", 2, 0, false);
	    declareFunction("rbp_span_subsumed_byP", "RBP-SPAN-SUBSUMED-BY?", 2, 0, false);
	    declareFunction("initialize_rbp_name_cache", "INITIALIZE-RBP-NAME-CACHE", 0, 0, false);
	    declareFunction("rbp_name_block_pred_among_floorsP", "RBP-NAME-BLOCK-PRED-AMONG-FLOORS?", 1, 0, false);
	    declareFunction("rbp_cache_name_block", "RBP-CACHE-NAME-BLOCK", 1, 0, false);
	    declareFunction("clear_rbp_floors_cached", "CLEAR-RBP-FLOORS-CACHED", 0, 0, false);
	    declareFunction("remove_rbp_floors_cached", "REMOVE-RBP-FLOORS-CACHED", 1, 0, false);
	    declareFunction("rbp_floors_cached_internal", "RBP-FLOORS-CACHED-INTERNAL", 1, 0, false);
	    declareFunction("rbp_floors_cached", "RBP-FLOORS-CACHED", 1, 0, false);
	    declareFunction("clear_rbp_ok_name_cachedP", "CLEAR-RBP-OK-NAME-CACHED?", 0, 0, false);
	    declareFunction("remove_rbp_ok_name_cachedP", "REMOVE-RBP-OK-NAME-CACHED?", 2, 0, false);
	    declareFunction("rbp_ok_name_cachedP_internal", "RBP-OK-NAME-CACHED?-INTERNAL", 2, 0, false);
	    declareFunction("rbp_ok_name_cachedP", "RBP-OK-NAME-CACHED?", 2, 0, false);
	    declareFunction("rbp_strings_for_span", "RBP-STRINGS-FOR-SPAN", 1, 0, false);
	    declareFunction("rbp_string_tokenize", "RBP-STRING-TOKENIZE", 1, 0, false);
	    declareFunction("rbp_ok_blockP", "RBP-OK-BLOCK?", 1, 0, false);
	    declareFunction("rbp_bad_name_blockP", "RBP-BAD-NAME-BLOCK?", 1, 0, false);
	    declareFunction("rbp_name_blockP", "RBP-NAME-BLOCK?", 1, 0, false);
	    declareFunction("rbp_filter_redundant_blocks", "RBP-FILTER-REDUNDANT-BLOCKS", 1, 0, false);
	    declareFunction("display_all_parses", "DISPLAY-ALL-PARSES", 1, 0, false);
	    declareFunction("display_all_trees", "DISPLAY-ALL-TREES", 1, 0, false);
	    declareFunction("display_tree", "DISPLAY-TREE", 2, 0, false);
	    declareFunction("rbp_rule_count", "RBP-RULE-COUNT", 0, 0, false);
	    declareFunction("rbp_rule_cycl_semx", "RBP-RULE-CYCL-SEMX", 1, 1, false);
	    declareFunction("rbp_rule_okP", "RBP-RULE-OK?", 1, 0, false);
	    declareFunction("rbp_domain_mt", "RBP-DOMAIN-MT", 0, 0, false);
	    declareFunction("rbp_get_cognate_from_instance_level_arg", "RBP-GET-COGNATE-FROM-INSTANCE-LEVEL-ARG", 1, 0, false);
	    declareFunction("rbp_get_cognate_from_type_level_arg", "RBP-GET-COGNATE-FROM-TYPE-LEVEL-ARG", 1, 0, false);
	    declareFunction("rbp_semx_type_level_cognate", "RBP-SEMX-TYPE-LEVEL-COGNATE", 1, 0, false);
	    declareFunction("ncp_ask_variable", "NCP-ASK-VARIABLE", 3, 1, false);
	    declareFunction("rbp_subcol_naut_fails_inter_arg_checksP", "RBP-SUBCOL-NAUT-FAILS-INTER-ARG-CHECKS?", 3, 2, false);
	    declareFunction("rbp_get_dep_cols", "RBP-GET-DEP-COLS", 5, 0, false);
	    declareFunction("rbp_subcol_naut_do_inter_arg_test", "RBP-SUBCOL-NAUT-DO-INTER-ARG-TEST", 5, 0, false);
	    declareFunction("rbp_inter_arg_isa_pred", "RBP-INTER-ARG-ISA-PRED", 2, 0, false);
	    declareFunction("rbp_inter_arg_not_isa_pred", "RBP-INTER-ARG-NOT-ISA-PRED", 2, 0, false);
	    declareFunction("rbp_binary_gaf_fails_inter_arg_checksP", "RBP-BINARY-GAF-FAILS-INTER-ARG-CHECKS?", 1, 1, false);
	    declareFunction("rbp_fails_wff_workaroundsP", "RBP-FAILS-WFF-WORKAROUNDS?", 2, 1, false);
	    declareFunction("rbp_rb_combine_noun_compound_blocks", "RBP-RB-COMBINE-NOUN-COMPOUND-BLOCKS", 2, 0, false);
	    declareFunction("rbp_rb_rules_matching_blocks", "RBP-RB-RULES-MATCHING-BLOCKS", 2, 0, false);
	    declareFunction("rbp_rb_rules_matching_blocks_wrt_closed_constraints", "RBP-RB-RULES-MATCHING-BLOCKS-WRT-CLOSED-CONSTRAINTS", 2, 1, false);
	    declareFunction("clear_rbp_rb_rules_matching_closed_specs", "CLEAR-RBP-RB-RULES-MATCHING-CLOSED-SPECS", 0, 0, false);
	    declareFunction("remove_rbp_rb_rules_matching_closed_specs", "REMOVE-RBP-RB-RULES-MATCHING-CLOSED-SPECS", 1, 0, false);
	    declareFunction("rbp_rb_rules_matching_closed_specs_internal", "RBP-RB-RULES-MATCHING-CLOSED-SPECS-INTERNAL", 1, 0, false);
	    declareFunction("rbp_rb_rules_matching_closed_specs", "RBP-RB-RULES-MATCHING-CLOSED-SPECS", 1, 0, false);
	    declareFunction("rbp_rb_search_wrt_open_constraints", "RBP-RB-SEARCH-WRT-OPEN-CONSTRAINTS", 4, 0, false);
	    declareFunction("rbp_verify_internal", "RBP-VERIFY-INTERNAL", 1, 1, false);
	    declareFunction("rbp_verify", "RBP-VERIFY", 1, 1, false);
	    declareFunction("rbp_rb_search", "RBP-RB-SEARCH", 2, 3, false);
	    declareFunction("inference_rbp_rb_search", "INFERENCE-RBP-RB-SEARCH", 2, 3, false);
	    declareFunction("rbp_rb_initial_search_no_tracing_internal", "RBP-RB-INITIAL-SEARCH-NO-TRACING-INTERNAL", 2, 0, false);
	    declareFunction("rbp_rb_initial_search_no_tracing", "RBP-RB-INITIAL-SEARCH-NO-TRACING", 2, 0, false);
	    declareFunction("rbp_rb_search_internal", "RBP-RB-SEARCH-INTERNAL", 5, 0, false);
	    declareFunction("rbp_rb_blocks_pass_inter_constraintsP", "RBP-RB-BLOCKS-PASS-INTER-CONSTRAINTS?", 3, 0, false);
	    declareFunction("clear_inter_constraints_from_rule", "CLEAR-INTER-CONSTRAINTS-FROM-RULE", 0, 0, false);
	    declareFunction("remove_inter_constraints_from_rule", "REMOVE-INTER-CONSTRAINTS-FROM-RULE", 1, 0, false);
	    declareFunction("inter_constraints_from_rule_internal", "INTER-CONSTRAINTS-FROM-RULE-INTERNAL", 1, 0, false);
	    declareFunction("inter_constraints_from_rule", "INTER-CONSTRAINTS-FROM-RULE", 1, 0, false);
	    declareFunction("blocks_pass_all_inter_nc_constraintsP", "BLOCKS-PASS-ALL-INTER-NC-CONSTRAINTS?", 3, 0, false);
	    declareFunction("blocks_pass_inter_nc_constraintP", "BLOCKS-PASS-INTER-NC-CONSTRAINT?", 3, 0, false);
	    declareFunction("inter_nc_block_test", "INTER-NC-BLOCK-TEST", 3, 0, false);
	    declareFunction("rbp_check_initializations", "RBP-CHECK-INITIALIZATIONS", 0, 0, false);
	    declareFunction("combine_blocks_with_template", "COMBINE-BLOCKS-WITH-TEMPLATE", 3, 1, false);
	    declareFunction("rbp_test_for_con_kw", "RBP-TEST-FOR-CON-KW", 1, 0, false);
	    declareFunction("rbp_candidate_fn_for_con_kw", "RBP-CANDIDATE-FN-FOR-CON-KW", 1, 0, false);
	    declareFunction("rbp_get_deverbal_root", "RBP-GET-DEVERBAL-ROOT", 1, 1, false);
	    declareFunction("rbp_deverbal_candidateP", "RBP-DEVERBAL-CANDIDATE?", 1, 0, false);
	    declareFunction("parse_deverbal_compound_as_fallback", "PARSE-DEVERBAL-COMPOUND-AS-FALLBACK", 1, 1, false);
	    declareFunction("parse_deverbal_compound_with_fallback", "PARSE-DEVERBAL-COMPOUND-WITH-FALLBACK", 1, 2, false);
	    declareFunction("date_parse_block_print_function_trampoline", "DATE-PARSE-BLOCK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("date_parse_block_p", "DATE-PARSE-BLOCK-P", 1, 0, false);
	    new noun_compound_parser.$date_parse_block_p$UnaryFunction();
	    declareFunction("date_parse_block_subcol_naut", "DATE-PARSE-BLOCK-SUBCOL-NAUT", 1, 0, false);
	    declareFunction("date_parse_block_confidence", "DATE-PARSE-BLOCK-CONFIDENCE", 1, 0, false);
	    declareFunction("_csetf_date_parse_block_subcol_naut", "_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT", 2, 0, false);
	    declareFunction("_csetf_date_parse_block_confidence", "_CSETF-DATE-PARSE-BLOCK-CONFIDENCE", 2, 0, false);
	    declareFunction("make_date_parse_block", "MAKE-DATE-PARSE-BLOCK", 0, 1, false);
	    declareFunction("visit_defstruct_date_parse_block", "VISIT-DEFSTRUCT-DATE-PARSE-BLOCK", 2, 0, false);
	    declareFunction("visit_defstruct_object_date_parse_block_method", "VISIT-DEFSTRUCT-OBJECT-DATE-PARSE-BLOCK-METHOD", 2, 0, false);
	    declareFunction("new_date_parse_block", "NEW-DATE-PARSE-BLOCK", 2, 0, false);
	    declareFunction("new_date_parse_block_for_denot_and_date", "NEW-DATE-PARSE-BLOCK-FOR-DENOT-AND-DATE", 3, 1, false);
	    declareFunction("date_parse_complexity_G", "DATE-PARSE-COMPLEXITY->", 2, 0, false);
	    declareFunction("date_confidence_adjusted_for_year", "DATE-CONFIDENCE-ADJUSTED-FOR-YEAR", 2, 0, false);
	    declareFunction("date_parse_list_incorporate_frequency", "DATE-PARSE-LIST-INCORPORATE-FREQUENCY", 2, 0, false);
	    declareFunction("parse_string_as_date_fallback", "PARSE-STRING-AS-DATE-FALLBACK", 1, 2, false);
	    declareFunction("parse_noun_compound_with_date_fallback", "PARSE-NOUN-COMPOUND-WITH-DATE-FALLBACK", 1, 2, false);
	    declareFunction("rbp_parse_filter_nonagentive_actors", "RBP-PARSE-FILTER-NONAGENTIVE-ACTORS", 1, 0, false);
	    declareFunction("rbp_matches_any_all_exists_gafsP", "RBP-MATCHES-ANY-ALL-EXISTS-GAFS?", 6, 0, false);
	    declareFunction("rbp_all_exists_matches_internal", "RBP-ALL-EXISTS-MATCHES-INTERNAL", 6, 1, false);
	    declareFunction("rbp_all_exists_matches", "RBP-ALL-EXISTS-MATCHES", 6, 1, false);
	    declareFunction("rbp_matches_any_all_exists_gafs_query_sentence", "RBP-MATCHES-ANY-ALL-EXISTS-GAFS-QUERY-SENTENCE", 6, 0, false);
	    declareFunction("rbp_parse_prefer_rmp_matches", "RBP-PARSE-PREFER-RMP-MATCHES", 1, 1, false);
	    declareFunction("rbp_parse_prefer_rmp_matches_int", "RBP-PARSE-PREFER-RMP-MATCHES-INT", 1, 1, false);
	    declareFunction("rbp_parse_rmp_problem_for_subcol_naut", "RBP-PARSE-RMP-PROBLEM-FOR-SUBCOL-NAUT", 2, 0, false);
	    declareFunction("rbp_coerce_to_ternary_subcollection_naut", "RBP-COERCE-TO-TERNARY-SUBCOLLECTION-NAUT", 1, 0, false);
	    declareFunction("rbp_parse_prefer_rmp_matches_failure_message", "RBP-PARSE-PREFER-RMP-MATCHES-FAILURE-MESSAGE", 1, 0, false);
	    declareFunction("rbp_parse_filter_unlikely_instrumentals", "RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS", 1, 0, false);
	    declareFunction("rbp_parse_filter_unlikely_instrumentals_int", "RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS-INT", 1, 0, false);
	    declareFunction("rbp_parse_filter_subcollection_args", "RBP-PARSE-FILTER-SUBCOLLECTION-ARGS", 1, 0, false);
	    declareFunction("rbp_bad_subcollection_to_argP", "RBP-BAD-SUBCOLLECTION-TO-ARG?", 2, 0, false);
	    declareFunction("rbp_bad_subcollection_from_argP", "RBP-BAD-SUBCOLLECTION-FROM-ARG?", 2, 0, false);
	    declareFunction("rbp_unlikely_subcollection_naut_block_wrt_objectP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT-BLOCK-WRT-OBJECT?", 2, 0, false);
	    declareFunction("rbp_unlikely_subcollection_naut_wrt_objectP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT-WRT-OBJECT?", 2, 0, false);
	    declareFunction("clear_rbp_unlikely_subcollection_nautP", "CLEAR-RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 0, 0, false);
	    declareFunction("remove_rbp_unlikely_subcollection_nautP", "REMOVE-RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 4, 0, false);
	    declareFunction("rbp_unlikely_subcollection_nautP_internal", "RBP-UNLIKELY-SUBCOLLECTION-NAUT?-INTERNAL", 4, 0, false);
	    declareFunction("rbp_unlikely_subcollection_nautP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 4, 0, false);
	    declareFunction("parse_adj_initial_compound", "PARSE-ADJ-INITIAL-COMPOUND", 1, 1, false);
	    declareFunction("rbp_escalating_parse", "RBP-ESCALATING-PARSE", 1, 1, false);
	    declareFunction("parse_as_denot_or_noun_compound", "PARSE-AS-DENOT-OR-NOUN-COMPOUND", 1, 1, false);
	    declareFunction("parse_string_as_date_fallback_escalated", "PARSE-STRING-AS-DATE-FALLBACK-ESCALATED", 1, 1, false);
	    declareFunction("initialize_ncs_formats", "INITIALIZE-NCS-FORMATS", 1, 0, false);
	    declareFunction("ncs_format", "NCS-FORMAT", 1, 0, false);
	    declareMacro("ncs_note", "NCS-NOTE");
	    declareFunction("noun_compound_statistics", "NOUN-COMPOUND-STATISTICS", 0, 3, false);
	    declareFunction("print_rbp_parses_with_sources", "PRINT-RBP-PARSES-WITH-SOURCES", 3, 1, false);
	    declareFunction("daml_process_ontology_file", "DAML-PROCESS-ONTOLOGY-FILE", 0, 1, false);
	    declareMacro("with_ncr_for_test_case", "WITH-NCR-FOR-TEST-CASE");
	}
	if (SubLFiles.USE_V2) {
	    declareFunction("rbp_cncb_reset", "RBP-CNCB-RESET", 0, 0, false);
	    declareFunction("rbp_cncb_report", "RBP-CNCB-REPORT", 0, 0, false);
	    declareFunction("ncp_count_strings_for_all_rules", "NCP-COUNT-STRINGS-FOR-ALL-RULES", 0, 1, false);
	    declareFunction("ncp_count_strings_for_rule", "NCP-COUNT-STRINGS-FOR-RULE", 1, 1, false);
	    declareFunction("ncp_count_strings_for_rule_and_type", "NCP-COUNT-STRINGS-FOR-RULE-AND-TYPE", 2, 1, false);
	    declareFunction("ncp_count_strings_name_preds", "NCP-COUNT-STRINGS-NAME-PREDS", 0, 0, false);
	    declareFunction("proper_noun_genls", "PROPER-NOUN-GENLS", 0, 0, false);
	    declareFunction("clear_ncp_count_pos_assertions_cached", "CLEAR-NCP-COUNT-POS-ASSERTIONS-CACHED", 0, 0, false);
	    declareFunction("remove_ncp_count_pos_assertions_cached", "REMOVE-NCP-COUNT-POS-ASSERTIONS-CACHED", 1, 0, false);
	    declareFunction("ncp_count_pos_assertions_cached_internal", "NCP-COUNT-POS-ASSERTIONS-CACHED-INTERNAL", 1, 0, false);
	    declareFunction("ncp_count_pos_assertions_cached", "NCP-COUNT-POS-ASSERTIONS-CACHED", 1, 0, false);
	    declareFunction("ncp_terms_meeting_rule_and_type", "NCP-TERMS-MEETING-RULE-AND-TYPE", 2, 1, false);
	    declareFunction("clear_ncp_preds_of_pos_count", "CLEAR-NCP-PREDS-OF-POS-COUNT", 0, 0, false);
	    declareFunction("remove_ncp_preds_of_pos_count", "REMOVE-NCP-PREDS-OF-POS-COUNT", 1, 0, false);
	    declareFunction("ncp_preds_of_pos_count_internal", "NCP-PREDS-OF-POS-COUNT-INTERNAL", 1, 0, false);
	    declareFunction("ncp_preds_of_pos_count", "NCP-PREDS-OF-POS-COUNT", 1, 0, false);
	    declareFunction("ncp_count_strings", "NCP-COUNT-STRINGS", 2, 0, false);
	    declareFunction("ncp_compute_rule_overlap", "NCP-COMPUTE-RULE-OVERLAP", 2, 1, false);
	    declareFunction("ncp_merge_pos", "NCP-MERGE-POS", 2, 0, false);
	    declareFunction("ncp_intersect_rule_lists", "NCP-INTERSECT-RULE-LISTS", 2, 0, false);
	    declareFunction("ncp_term_count", "NCP-TERM-COUNT", 1, 0, false);
	    declareFunction("rbp_generate_nauts_via_pointwise_analysis", "RBP-GENERATE-NAUTS-VIA-POINTWISE-ANALYSIS", 3, 0, false);
	    declareFunction("rbp_deverbal_fallback", "RBP-DEVERBAL-FALLBACK", 1, 0, false);
	}
	return NIL;
    }

    public static SubLObject declare_noun_compound_parser_file_Previous() {
	declareFunction("add_nc_rule_constraint", "ADD-NC-RULE-CONSTRAINT", 2, 0, false);
	declareFunction("remove_nc_rule_constraint", "REMOVE-NC-RULE-CONSTRAINT", 2, 0, false);
	declareFunction("add_nc_rule_template", "ADD-NC-RULE-TEMPLATE", 2, 0, false);
	declareFunction("remove_nc_rule_template", "REMOVE-NC-RULE-TEMPLATE", 2, 0, false);
	declareFunction("noun_compound_parse_print_function_trampoline", "NOUN-COMPOUND-PARSE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("noun_compound_parse_p", "NOUN-COMPOUND-PARSE-P", 1, 0, false);
	new noun_compound_parser.$noun_compound_parse_p$UnaryFunction();
	declareFunction("nc_parse_unique_id", "NC-PARSE-UNIQUE-ID", 1, 0, false);
	declareFunction("nc_parse_input_string", "NC-PARSE-INPUT-STRING", 1, 0, false);
	declareFunction("nc_parse_input_strings", "NC-PARSE-INPUT-STRINGS", 1, 0, false);
	declareFunction("nc_parse_chart", "NC-PARSE-CHART", 1, 0, false);
	declareFunction("_csetf_nc_parse_unique_id", "_CSETF-NC-PARSE-UNIQUE-ID", 2, 0, false);
	declareFunction("_csetf_nc_parse_input_string", "_CSETF-NC-PARSE-INPUT-STRING", 2, 0, false);
	declareFunction("_csetf_nc_parse_input_strings", "_CSETF-NC-PARSE-INPUT-STRINGS", 2, 0, false);
	declareFunction("_csetf_nc_parse_chart", "_CSETF-NC-PARSE-CHART", 2, 0, false);
	declareFunction("make_noun_compound_parse", "MAKE-NOUN-COMPOUND-PARSE", 0, 1, false);
	declareFunction("visit_defstruct_noun_compound_parse", "VISIT-DEFSTRUCT-NOUN-COMPOUND-PARSE", 2, 0, false);
	declareFunction("visit_defstruct_object_noun_compound_parse_method", "VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-PARSE-METHOD", 2, 0, false);
	declareFunction("pprint_nc_parse", "PPRINT-NC-PARSE", 1, 2, false);
	declareFunction("new_nc_parse", "NEW-NC-PARSE", 0, 1, false);
	declareFunction("rbp_trace", "RBP-TRACE", 0, 0, false);
	declareMacro("with_rbp_trace", "WITH-RBP-TRACE");
	declareFunction("rbp_untrace", "RBP-UNTRACE", 0, 0, false);
	declareFunction("rbp_show_rules", "RBP-SHOW-RULES", 0, 0, false);
	declareFunction("rbp_hide_rules", "RBP-HIDE-RULES", 0, 0, false);
	declareFunction("rbp_traced_rules", "RBP-TRACED-RULES", 0, 0, false);
	declareFunction("rbp_trace_rule", "RBP-TRACE-RULE", 1, 0, false);
	declareFunction("rbp_untrace_all_rules", "RBP-UNTRACE-ALL-RULES", 0, 0, false);
	declareFunction("rbp_untrace_rule", "RBP-UNTRACE-RULE", 1, 0, false);
	declareFunction("just_one_spaceP", "JUST-ONE-SPACE?", 1, 0, false);
	declareFunction("noun_compound_block_print_function_trampoline", "NOUN-COMPOUND-BLOCK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("noun_compound_block_p", "NOUN-COMPOUND-BLOCK-P", 1, 0, false);
	new noun_compound_parser.$noun_compound_block_p$UnaryFunction();
	declareFunction("nc_block_unique_id", "NC-BLOCK-UNIQUE-ID", 1, 0, false);
	declareFunction("nc_block_span_index", "NC-BLOCK-SPAN-INDEX", 1, 0, false);
	declareFunction("nc_block_confidence", "NC-BLOCK-CONFIDENCE", 1, 0, false);
	declareFunction("nc_block_denot", "NC-BLOCK-DENOT", 1, 0, false);
	declareFunction("nc_block_filters", "NC-BLOCK-FILTERS", 1, 0, false);
	declareFunction("nc_block_spanned_string", "NC-BLOCK-SPANNED-STRING", 1, 0, false);
	declareFunction("nc_block_head", "NC-BLOCK-HEAD", 1, 0, false);
	declareFunction("nc_block_head_pos", "NC-BLOCK-HEAD-POS", 1, 0, false);
	declareFunction("nc_block_head_string_pred", "NC-BLOCK-HEAD-STRING-PRED", 1, 0, false);
	declareFunction("nc_block_sub_tree", "NC-BLOCK-SUB-TREE", 1, 0, false);
	declareFunction("nc_block_plist", "NC-BLOCK-PLIST", 1, 0, false);
	declareFunction("_csetf_nc_block_unique_id", "_CSETF-NC-BLOCK-UNIQUE-ID", 2, 0, false);
	declareFunction("_csetf_nc_block_span_index", "_CSETF-NC-BLOCK-SPAN-INDEX", 2, 0, false);
	declareFunction("_csetf_nc_block_confidence", "_CSETF-NC-BLOCK-CONFIDENCE", 2, 0, false);
	declareFunction("_csetf_nc_block_denot", "_CSETF-NC-BLOCK-DENOT", 2, 0, false);
	declareFunction("_csetf_nc_block_filters", "_CSETF-NC-BLOCK-FILTERS", 2, 0, false);
	declareFunction("_csetf_nc_block_spanned_string", "_CSETF-NC-BLOCK-SPANNED-STRING", 2, 0, false);
	declareFunction("_csetf_nc_block_head", "_CSETF-NC-BLOCK-HEAD", 2, 0, false);
	declareFunction("_csetf_nc_block_head_pos", "_CSETF-NC-BLOCK-HEAD-POS", 2, 0, false);
	declareFunction("_csetf_nc_block_head_string_pred", "_CSETF-NC-BLOCK-HEAD-STRING-PRED", 2, 0, false);
	declareFunction("_csetf_nc_block_sub_tree", "_CSETF-NC-BLOCK-SUB-TREE", 2, 0, false);
	declareFunction("_csetf_nc_block_plist", "_CSETF-NC-BLOCK-PLIST", 2, 0, false);
	declareFunction("make_noun_compound_block", "MAKE-NOUN-COMPOUND-BLOCK", 0, 1, false);
	declareFunction("visit_defstruct_noun_compound_block", "VISIT-DEFSTRUCT-NOUN-COMPOUND-BLOCK", 2, 0, false);
	declareFunction("visit_defstruct_object_noun_compound_block_method", "VISIT-DEFSTRUCT-OBJECT-NOUN-COMPOUND-BLOCK-METHOD", 2, 0, false);
	declareFunction("nc_block_plist_lookup", "NC-BLOCK-PLIST-LOOKUP", 2, 1, false);
	declareFunction("nc_block_plist_set", "NC-BLOCK-PLIST-SET", 3, 0, false);
	declareFunction("nc_block_wu", "NC-BLOCK-WU", 1, 0, false);
	declareFunction("nc_block_set_wu", "NC-BLOCK-SET-WU", 2, 0, false);
	declareFunction("nc_block_rule", "NC-BLOCK-RULE", 1, 0, false);
	declareFunction("nc_block_mod_block", "NC-BLOCK-MOD-BLOCK", 1, 1, false);
	declareFunction("nc_block_head_block", "NC-BLOCK-HEAD-BLOCK", 1, 1, false);
	declareFunction("nc_block_rule_count", "NC-BLOCK-RULE-COUNT", 2, 0, false);
	declareFunction("pprint_nc_block", "PPRINT-NC-BLOCK", 3, 0, false);
	declareFunction("new_noun_compound_block", "NEW-NOUN-COMPOUND-BLOCK", 4, 6, false);
	declareFunction("inference_new_noun_compound_block", "INFERENCE-NEW-NOUN-COMPOUND-BLOCK", 4, 6, false);
	declareFunction("combine_noun_compound_blocks_internal", "COMBINE-NOUN-COMPOUND-BLOCKS-INTERNAL", 3, 0, false);
	declareFunction("combine_noun_compound_blocks", "COMBINE-NOUN-COMPOUND-BLOCKS", 3, 0, false);
	declareFunction("token_to_blocks", "TOKEN-TO-BLOCKS", 1, 0, false);
	declareFunction("rbp_adj_blockP", "RBP-ADJ-BLOCK?", 1, 0, false);
	declareFunction("rbp_adj_modified_blockP", "RBP-ADJ-MODIFIED-BLOCK?", 2, 0, false);
	declareFunction("rbp_base_from_block", "RBP-BASE-FROM-BLOCK", 2, 0, false);
	declareFunction("rbp_apply_filter_cluster", "RBP-APPLY-FILTER-CLUSTER", 3, 3, false);
	declareFunction("rbp_process_filter_clusters", "RBP-PROCESS-FILTER-CLUSTERS", 2, 1, false);
	declareFunction("rbp_parse_wrong_sizeP", "RBP-PARSE-WRONG-SIZE?", 2, 0, false);
	declareFunction("rbp_component_count", "RBP-COMPONENT-COUNT", 2, 0, false);
	declareMacro("ncp_reporting_metrics", "NCP-REPORTING-METRICS");
	declareFunction("parse_noun_compound", "PARSE-NOUN-COMPOUND", 1, 2, false);
	declareFunction("parse_noun_compound_with_rules", "PARSE-NOUN-COMPOUND-WITH-RULES", 2, 2, false);
	declareFunction("rbp_rule_fort_p", "RBP-RULE-FORT-P", 1, 0, false);
	declareFunction("parse_noun_compound_from_string_tokens", "PARSE-NOUN-COMPOUND-FROM-STRING-TOKENS", 1, 2, false);
	declareMacro("with_new_ncp_problem_store", "WITH-NEW-NCP-PROBLEM-STORE");
	declareFunction("parse_noun_compound_int", "PARSE-NOUN-COMPOUND-INT", 3, 1, false);
	declareFunction("ncp_initialize_metrics", "NCP-INITIALIZE-METRICS", 0, 0, false);
	declareFunction("ncp_report_metrics", "NCP-REPORT-METRICS", 1, 0, false);
	declareFunction("ncp_herald_start", "NCP-HERALD-START", 1, 0, false);
	declareFunction("rbp_sort_blocks_complexity_first", "RBP-SORT-BLOCKS-COMPLEXITY-FIRST", 1, 0, false);
	declareFunction("rbp_sort_blocks_confidence_first", "RBP-SORT-BLOCKS-CONFIDENCE-FIRST", 1, 0, false);
	declareFunction("rbp_filter_and_sort_result_blocks", "RBP-FILTER-AND-SORT-RESULT-BLOCKS", 2, 1, false);
	declareFunction("rbp_block_reliability_estimate", "RBP-BLOCK-RELIABILITY-ESTIMATE", 1, 1, false);
	declareFunction("rbp_unify_blocks_to_common_specpreds", "RBP-UNIFY-BLOCKS-TO-COMMON-SPECPREDS", 1, 0, false);
	declareFunction("rbp_unify_rewrite_of_blocks", "RBP-UNIFY-REWRITE-OF-BLOCKS", 1, 0, false);
	declareFunction("rbp_unify_city_named_fn_blocks", "RBP-UNIFY-CITY-NAMED-FN-BLOCKS", 1, 0, false);
	declareFunction("rbp_nominal_blockP", "RBP-NOMINAL-BLOCK?", 1, 0, false);
	declareFunction("display_complete_parses", "DISPLAY-COMPLETE-PARSES", 1, 0, false);
	declareFunction("nc_block_uses_required_rules_p", "NC-BLOCK-USES-REQUIRED-RULES-P", 3, 0, false);
	declareFunction("nc_block_uses_required_rule_p", "NC-BLOCK-USES-REQUIRED-RULE-P", 3, 0, false);
	declareFunction("rbp_parse_and_confidenceP", "RBP-PARSE-AND-CONFIDENCE?", 1, 0, false);
	declareFunction("rbp_parse_and_confidenceE", "RBP-PARSE-AND-CONFIDENCE=", 2, 0, false);
	declareFunction("ncp_chart_init", "NCP-CHART-INIT", 0, 2, false);
	declareFunction("ncp_chart_init_from_string_tokens", "NCP-CHART-INIT-FROM-STRING-TOKENS", 1, 0, false);
	declareFunction("new_ncp_chart", "NEW-NCP-CHART", 1, 0, false);
	declareFunction("ncp_chart_init_int", "NCP-CHART-INIT-INT", 2, 0, false);
	declareFunction("rbp_input_spanning_blockP", "RBP-INPUT-SPANNING-BLOCK?", 2, 0, false);
	declareFunction("rbp_filter_verbs", "RBP-FILTER-VERBS", 1, 0, false);
	declareFunction("rbp_filter_verbs_in_tuples", "RBP-FILTER-VERBS-IN-TUPLES", 1, 0, false);
	declareFunction("rbp_remove_subsumed_tokens", "RBP-REMOVE-SUBSUMED-TOKENS", 2, 0, false);
	declareFunction("rbp_span_subsumed_by_all_ofP", "RBP-SPAN-SUBSUMED-BY-ALL-OF?", 2, 0, false);
	declareFunction("rbp_span_subsumed_byP", "RBP-SPAN-SUBSUMED-BY?", 2, 0, false);
	declareFunction("initialize_rbp_name_cache", "INITIALIZE-RBP-NAME-CACHE", 0, 0, false);
	declareFunction("rbp_name_block_pred_among_floorsP", "RBP-NAME-BLOCK-PRED-AMONG-FLOORS?", 1, 0, false);
	declareFunction("rbp_cache_name_block", "RBP-CACHE-NAME-BLOCK", 1, 0, false);
	declareFunction("clear_rbp_floors_cached", "CLEAR-RBP-FLOORS-CACHED", 0, 0, false);
	declareFunction("remove_rbp_floors_cached", "REMOVE-RBP-FLOORS-CACHED", 1, 0, false);
	declareFunction("rbp_floors_cached_internal", "RBP-FLOORS-CACHED-INTERNAL", 1, 0, false);
	declareFunction("rbp_floors_cached", "RBP-FLOORS-CACHED", 1, 0, false);
	declareFunction("clear_rbp_ok_name_cachedP", "CLEAR-RBP-OK-NAME-CACHED?", 0, 0, false);
	declareFunction("remove_rbp_ok_name_cachedP", "REMOVE-RBP-OK-NAME-CACHED?", 2, 0, false);
	declareFunction("rbp_ok_name_cachedP_internal", "RBP-OK-NAME-CACHED?-INTERNAL", 2, 0, false);
	declareFunction("rbp_ok_name_cachedP", "RBP-OK-NAME-CACHED?", 2, 0, false);
	declareFunction("rbp_strings_for_span", "RBP-STRINGS-FOR-SPAN", 1, 0, false);
	declareFunction("rbp_string_tokenize", "RBP-STRING-TOKENIZE", 1, 0, false);
	declareFunction("rbp_ok_blockP", "RBP-OK-BLOCK?", 1, 0, false);
	declareFunction("rbp_bad_name_blockP", "RBP-BAD-NAME-BLOCK?", 1, 0, false);
	declareFunction("rbp_name_blockP", "RBP-NAME-BLOCK?", 1, 0, false);
	declareFunction("rbp_filter_redundant_blocks", "RBP-FILTER-REDUNDANT-BLOCKS", 1, 0, false);
	declareFunction("display_all_parses", "DISPLAY-ALL-PARSES", 1, 0, false);
	declareFunction("display_all_trees", "DISPLAY-ALL-TREES", 1, 0, false);
	declareFunction("display_tree", "DISPLAY-TREE", 2, 0, false);
	declareFunction("rbp_rule_count", "RBP-RULE-COUNT", 0, 0, false);
	declareFunction("rbp_rule_cycl_semx", "RBP-RULE-CYCL-SEMX", 1, 1, false);
	declareFunction("rbp_rule_okP", "RBP-RULE-OK?", 1, 0, false);
	declareFunction("rbp_domain_mt", "RBP-DOMAIN-MT", 0, 0, false);
	declareFunction("rbp_get_cognate_from_instance_level_arg", "RBP-GET-COGNATE-FROM-INSTANCE-LEVEL-ARG", 1, 0, false);
	declareFunction("rbp_get_cognate_from_type_level_arg", "RBP-GET-COGNATE-FROM-TYPE-LEVEL-ARG", 1, 0, false);
	declareFunction("rbp_semx_type_level_cognate", "RBP-SEMX-TYPE-LEVEL-COGNATE", 1, 0, false);
	declareFunction("ncp_ask_variable", "NCP-ASK-VARIABLE", 3, 1, false);
	declareFunction("rbp_subcol_naut_fails_inter_arg_checksP", "RBP-SUBCOL-NAUT-FAILS-INTER-ARG-CHECKS?", 3, 2, false);
	declareFunction("rbp_get_dep_cols", "RBP-GET-DEP-COLS", 5, 0, false);
	declareFunction("rbp_subcol_naut_do_inter_arg_test", "RBP-SUBCOL-NAUT-DO-INTER-ARG-TEST", 5, 0, false);
	declareFunction("rbp_inter_arg_isa_pred", "RBP-INTER-ARG-ISA-PRED", 2, 0, false);
	declareFunction("rbp_inter_arg_not_isa_pred", "RBP-INTER-ARG-NOT-ISA-PRED", 2, 0, false);
	declareFunction("rbp_binary_gaf_fails_inter_arg_checksP", "RBP-BINARY-GAF-FAILS-INTER-ARG-CHECKS?", 1, 1, false);
	declareFunction("rbp_fails_wff_workaroundsP", "RBP-FAILS-WFF-WORKAROUNDS?", 2, 1, false);
	declareFunction("rbp_rb_combine_noun_compound_blocks", "RBP-RB-COMBINE-NOUN-COMPOUND-BLOCKS", 2, 0, false);
	declareFunction("rbp_rb_rules_matching_blocks", "RBP-RB-RULES-MATCHING-BLOCKS", 2, 0, false);
	declareFunction("rbp_rb_rules_matching_blocks_wrt_closed_constraints", "RBP-RB-RULES-MATCHING-BLOCKS-WRT-CLOSED-CONSTRAINTS", 2, 1, false);
	declareFunction("clear_rbp_rb_rules_matching_closed_specs", "CLEAR-RBP-RB-RULES-MATCHING-CLOSED-SPECS", 0, 0, false);
	declareFunction("remove_rbp_rb_rules_matching_closed_specs", "REMOVE-RBP-RB-RULES-MATCHING-CLOSED-SPECS", 1, 0, false);
	declareFunction("rbp_rb_rules_matching_closed_specs_internal", "RBP-RB-RULES-MATCHING-CLOSED-SPECS-INTERNAL", 1, 0, false);
	declareFunction("rbp_rb_rules_matching_closed_specs", "RBP-RB-RULES-MATCHING-CLOSED-SPECS", 1, 0, false);
	declareFunction("rbp_rb_search_wrt_open_constraints", "RBP-RB-SEARCH-WRT-OPEN-CONSTRAINTS", 4, 0, false);
	declareFunction("rbp_verify_internal", "RBP-VERIFY-INTERNAL", 1, 1, false);
	declareFunction("rbp_verify", "RBP-VERIFY", 1, 1, false);
	declareFunction("rbp_rb_search", "RBP-RB-SEARCH", 2, 3, false);
	declareFunction("inference_rbp_rb_search", "INFERENCE-RBP-RB-SEARCH", 2, 3, false);
	declareFunction("rbp_rb_initial_search_no_tracing_internal", "RBP-RB-INITIAL-SEARCH-NO-TRACING-INTERNAL", 2, 0, false);
	declareFunction("rbp_rb_initial_search_no_tracing", "RBP-RB-INITIAL-SEARCH-NO-TRACING", 2, 0, false);
	declareFunction("rbp_rb_search_internal", "RBP-RB-SEARCH-INTERNAL", 5, 0, false);
	declareFunction("rbp_rb_blocks_pass_inter_constraintsP", "RBP-RB-BLOCKS-PASS-INTER-CONSTRAINTS?", 3, 0, false);
	declareFunction("clear_inter_constraints_from_rule", "CLEAR-INTER-CONSTRAINTS-FROM-RULE", 0, 0, false);
	declareFunction("remove_inter_constraints_from_rule", "REMOVE-INTER-CONSTRAINTS-FROM-RULE", 1, 0, false);
	declareFunction("inter_constraints_from_rule_internal", "INTER-CONSTRAINTS-FROM-RULE-INTERNAL", 1, 0, false);
	declareFunction("inter_constraints_from_rule", "INTER-CONSTRAINTS-FROM-RULE", 1, 0, false);
	declareFunction("blocks_pass_all_inter_nc_constraintsP", "BLOCKS-PASS-ALL-INTER-NC-CONSTRAINTS?", 3, 0, false);
	declareFunction("blocks_pass_inter_nc_constraintP", "BLOCKS-PASS-INTER-NC-CONSTRAINT?", 3, 0, false);
	declareFunction("inter_nc_block_test", "INTER-NC-BLOCK-TEST", 3, 0, false);
	declareFunction("rbp_check_initializations", "RBP-CHECK-INITIALIZATIONS", 0, 0, false);
	declareFunction("combine_blocks_with_template", "COMBINE-BLOCKS-WITH-TEMPLATE", 3, 1, false);
	declareFunction("rbp_test_for_con_kw", "RBP-TEST-FOR-CON-KW", 1, 0, false);
	declareFunction("rbp_candidate_fn_for_con_kw", "RBP-CANDIDATE-FN-FOR-CON-KW", 1, 0, false);
	declareFunction("rbp_get_deverbal_root", "RBP-GET-DEVERBAL-ROOT", 1, 1, false);
	declareFunction("rbp_deverbal_candidateP", "RBP-DEVERBAL-CANDIDATE?", 1, 0, false);
	declareFunction("parse_deverbal_compound_as_fallback", "PARSE-DEVERBAL-COMPOUND-AS-FALLBACK", 1, 1, false);
	declareFunction("parse_deverbal_compound_with_fallback", "PARSE-DEVERBAL-COMPOUND-WITH-FALLBACK", 1, 2, false);
	declareFunction("date_parse_block_print_function_trampoline", "DATE-PARSE-BLOCK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("date_parse_block_p", "DATE-PARSE-BLOCK-P", 1, 0, false);
	new noun_compound_parser.$date_parse_block_p$UnaryFunction();
	declareFunction("date_parse_block_subcol_naut", "DATE-PARSE-BLOCK-SUBCOL-NAUT", 1, 0, false);
	declareFunction("date_parse_block_confidence", "DATE-PARSE-BLOCK-CONFIDENCE", 1, 0, false);
	declareFunction("_csetf_date_parse_block_subcol_naut", "_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT", 2, 0, false);
	declareFunction("_csetf_date_parse_block_confidence", "_CSETF-DATE-PARSE-BLOCK-CONFIDENCE", 2, 0, false);
	declareFunction("make_date_parse_block", "MAKE-DATE-PARSE-BLOCK", 0, 1, false);
	declareFunction("visit_defstruct_date_parse_block", "VISIT-DEFSTRUCT-DATE-PARSE-BLOCK", 2, 0, false);
	declareFunction("visit_defstruct_object_date_parse_block_method", "VISIT-DEFSTRUCT-OBJECT-DATE-PARSE-BLOCK-METHOD", 2, 0, false);
	declareFunction("new_date_parse_block", "NEW-DATE-PARSE-BLOCK", 2, 0, false);
	declareFunction("new_date_parse_block_for_denot_and_date", "NEW-DATE-PARSE-BLOCK-FOR-DENOT-AND-DATE", 3, 1, false);
	declareFunction("date_parse_complexity_G", "DATE-PARSE-COMPLEXITY->", 2, 0, false);
	declareFunction("date_confidence_adjusted_for_year", "DATE-CONFIDENCE-ADJUSTED-FOR-YEAR", 2, 0, false);
	declareFunction("date_parse_list_incorporate_frequency", "DATE-PARSE-LIST-INCORPORATE-FREQUENCY", 2, 0, false);
	declareFunction("parse_string_as_date_fallback", "PARSE-STRING-AS-DATE-FALLBACK", 1, 2, false);
	declareFunction("parse_noun_compound_with_date_fallback", "PARSE-NOUN-COMPOUND-WITH-DATE-FALLBACK", 1, 2, false);
	declareFunction("rbp_parse_filter_nonagentive_actors", "RBP-PARSE-FILTER-NONAGENTIVE-ACTORS", 1, 0, false);
	declareFunction("rbp_matches_any_all_exists_gafsP", "RBP-MATCHES-ANY-ALL-EXISTS-GAFS?", 6, 0, false);
	declareFunction("rbp_all_exists_matches_internal", "RBP-ALL-EXISTS-MATCHES-INTERNAL", 6, 1, false);
	declareFunction("rbp_all_exists_matches", "RBP-ALL-EXISTS-MATCHES", 6, 1, false);
	declareFunction("rbp_matches_any_all_exists_gafs_query_sentence", "RBP-MATCHES-ANY-ALL-EXISTS-GAFS-QUERY-SENTENCE", 6, 0, false);
	declareFunction("rbp_parse_prefer_rmp_matches", "RBP-PARSE-PREFER-RMP-MATCHES", 1, 1, false);
	declareFunction("rbp_parse_prefer_rmp_matches_int", "RBP-PARSE-PREFER-RMP-MATCHES-INT", 1, 1, false);
	declareFunction("rbp_parse_rmp_problem_for_subcol_naut", "RBP-PARSE-RMP-PROBLEM-FOR-SUBCOL-NAUT", 2, 0, false);
	declareFunction("rbp_coerce_to_ternary_subcollection_naut", "RBP-COERCE-TO-TERNARY-SUBCOLLECTION-NAUT", 1, 0, false);
	declareFunction("rbp_parse_prefer_rmp_matches_failure_message", "RBP-PARSE-PREFER-RMP-MATCHES-FAILURE-MESSAGE", 1, 0, false);
	declareFunction("rbp_parse_filter_unlikely_instrumentals", "RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS", 1, 0, false);
	declareFunction("rbp_parse_filter_unlikely_instrumentals_int", "RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS-INT", 1, 0, false);
	declareFunction("rbp_parse_filter_subcollection_args", "RBP-PARSE-FILTER-SUBCOLLECTION-ARGS", 1, 0, false);
	declareFunction("rbp_bad_subcollection_to_argP", "RBP-BAD-SUBCOLLECTION-TO-ARG?", 2, 0, false);
	declareFunction("rbp_bad_subcollection_from_argP", "RBP-BAD-SUBCOLLECTION-FROM-ARG?", 2, 0, false);
	declareFunction("rbp_unlikely_subcollection_naut_block_wrt_objectP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT-BLOCK-WRT-OBJECT?", 2, 0, false);
	declareFunction("rbp_unlikely_subcollection_naut_wrt_objectP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT-WRT-OBJECT?", 2, 0, false);
	declareFunction("clear_rbp_unlikely_subcollection_nautP", "CLEAR-RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 0, 0, false);
	declareFunction("remove_rbp_unlikely_subcollection_nautP", "REMOVE-RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 4, 0, false);
	declareFunction("rbp_unlikely_subcollection_nautP_internal", "RBP-UNLIKELY-SUBCOLLECTION-NAUT?-INTERNAL", 4, 0, false);
	declareFunction("rbp_unlikely_subcollection_nautP", "RBP-UNLIKELY-SUBCOLLECTION-NAUT?", 4, 0, false);
	declareFunction("parse_adj_initial_compound", "PARSE-ADJ-INITIAL-COMPOUND", 1, 1, false);
	declareFunction("rbp_escalating_parse", "RBP-ESCALATING-PARSE", 1, 1, false);
	declareFunction("parse_as_denot_or_noun_compound", "PARSE-AS-DENOT-OR-NOUN-COMPOUND", 1, 1, false);
	declareFunction("parse_string_as_date_fallback_escalated", "PARSE-STRING-AS-DATE-FALLBACK-ESCALATED", 1, 1, false);
	declareFunction("initialize_ncs_formats", "INITIALIZE-NCS-FORMATS", 1, 0, false);
	declareFunction("ncs_format", "NCS-FORMAT", 1, 0, false);
	declareMacro("ncs_note", "NCS-NOTE");
	declareFunction("noun_compound_statistics", "NOUN-COMPOUND-STATISTICS", 0, 3, false);
	declareFunction("print_rbp_parses_with_sources", "PRINT-RBP-PARSES-WITH-SOURCES", 3, 1, false);
	declareFunction("daml_process_ontology_file", "DAML-PROCESS-ONTOLOGY-FILE", 0, 1, false);
	declareMacro("with_ncr_for_test_case", "WITH-NCR-FOR-TEST-CASE");
	return NIL;
    }

    public static final SubLObject init_noun_compound_parser_file_alt() {
	defconstant("*DTP-NOUN-COMPOUND-PARSE*", NOUN_COMPOUND_PARSE);
	deflexical("*NC-PARSE-ID-COUNTER*", NIL != boundp($nc_parse_id_counter$) ? ((SubLObject) ($nc_parse_id_counter$.getGlobalValue())) : ZERO_INTEGER);
	defparameter("*RBP-REPORT-PARSE-TIME?*", NIL);
	defparameter("*RBP-SHADOW-RULES?*", NIL);
	defparameter("*RBP-RULES-TO-PARSES-SHADOW*", NIL);
	defparameter("*RBP-RETURN-CONFIDENCE?*", NIL);
	defparameter("*RBP-SHOW-SUCCESSFUL-RULES?*", NIL);
	defparameter("*RBP-TRACED-RULES*", NIL);
	defconstant("*DTP-NOUN-COMPOUND-BLOCK*", NOUN_COMPOUND_BLOCK);
	defparameter("*RBP-DEFAULT-CONFIDENCE-MULTIPLIER-FOR-FAILING-A-FILTER*", $float$0_5);
	deflexical("*NC-BLOCK-UNIQUE-ID-COUNTER*", NIL != boundp($nc_block_unique_id_counter$) ? ((SubLObject) ($nc_block_unique_id_counter$.getGlobalValue())) : ZERO_INTEGER);
	deflexical("*RBP-CNCB-CALLS*", NIL != boundp($rbp_cncb_calls$) ? ((SubLObject) ($rbp_cncb_calls$.getGlobalValue())) : ZERO_INTEGER);
	deflexical("*RBP-CNCB-CALLS-REDUNDANT*", NIL != boundp($rbp_cncb_calls_redundant$) ? ((SubLObject) ($rbp_cncb_calls_redundant$.getGlobalValue())) : ZERO_INTEGER);
	deflexical("*RBP-CNCB-CALLS-BACKWARDS*", NIL != boundp($rbp_cncb_calls_backwards$) ? ((SubLObject) ($rbp_cncb_calls_backwards$.getGlobalValue())) : ZERO_INTEGER);
	deflexical("*RBP-CNCB-HASH*", NIL != boundp($rbp_cncb_hash$) ? ((SubLObject) ($rbp_cncb_hash$.getGlobalValue())) : make_hash_table($int$1024, symbol_function(EQUALP), UNPROVIDED));
	defparameter("*RBP-UNIVERSAL-BOOLEAN-FILTERS*", $list_alt96);
	defparameter("*RBP-DEVERBAL-BOOLEAN-FILTERS*", $list_alt97);
	defparameter("*RBP-DEVERBAL-MACROSCOPIC-FILTERS*", $list_alt98);
	defparameter("*RBP-DEVERBAL-MACROSCOPIC-BLOCK-FILTERS*", $list_alt99);
	defparameter("*RBP-INPUT-STRINGS*", NIL);
	defparameter("*NOMINAL-INTERPRETATIONS-ONLY*", T);
	defparameter("*RBP-MINIMUM-COMPONENT-COUNT*", ONE_INTEGER);
	defparameter("*RBP-MAXIMUM-COMPONENT-COUNT*", NIL);
	defparameter("*NCP-PROBLEM-STORE*", NIL);
	defparameter("*RBP-SORT-BLOCKS-CONFIDENCE-FIRST?*", NIL);
	defparameter("*RBP-RELIABILITY-HIGH*", $float$1_05);
	defparameter("*RBP-RELIABILITY-MEDIUM*", ONE_INTEGER);
	defparameter("*RBP-RELIABILITY-LOW*", $float$0_95);
	deflexical("*RBP-CHART-FILTER?*", NIL);
	defparameter("*RBP-NAME-CACHE*", NIL);
	deflexical("*RBP-FLOORS-CACHED-CACHING-STATE*", NIL);
	deflexical("*RBP-OK-NAME-CACHED?-CACHING-STATE*", NIL);
	defparameter("*RBP-USE-INTER-ARG-ISA-FILTERS?*", NIL);
	defparameter("*RBP-USE-INTER-ARG-NOT-ISA-FILTERS?*", T);
	deflexical("*RBP-RB-CLOSED-CLASS-FILTER-KEYS*", $list_alt243);
	deflexical("*RBP-RB-RULES-MATCHING-CLOSED-SPECS-CACHING-STATE*", NIL);
	deflexical("*INTER-CONSTRAINTS-FROM-RULE-CACHING-STATE*", NIL);
	deflexical("*NCP-COUNT-STRINGS-DENOT-PREDS*", $list_alt293);
	deflexical("*NCP-COUNT-STRINGS-NAME-PREDS*", NIL != boundp($ncp_count_strings_name_preds$) ? ((SubLObject) ($ncp_count_strings_name_preds$.getGlobalValue())) : NIL);
	deflexical("*PROPER-NOUN-GENLS*", NIL != boundp($proper_noun_genls$) ? ((SubLObject) ($proper_noun_genls$.getGlobalValue())) : NIL);
	deflexical("*NCP-COUNT-POS-ASSERTIONS-CACHED-CACHING-STATE*", NIL);
	deflexical("*NCP-PREDS-OF-POS-COUNT-CACHING-STATE*", NIL);
	defparameter("*RBP-HIGH-DATE-CONFIDENCE*", $float$0_75);
	defparameter("*RBP-LOW-DATE-CONFIDENCE*", $float$0_25);
	defparameter("*RBP-DATE-FALLBACK-IDENTIFIER*", $DATE_FALLBACK);
	defparameter("*RBP-DATE-FALLBACK-TEST*", symbol_function(EQL));
	defconstant("*DTP-DATE-PARSE-BLOCK*", DATE_PARSE_BLOCK);
	defparameter("*RBP-RAE-MAX-TIME*", TEN_INTEGER);
	deflexical("*RBP-UNLIKELY-SUBCOLLECTION-NAUT?-CACHING-STATE*", NIL);
	defparameter("*NCS-FORMATS*", NIL);
	defparameter("*NCS-DEVERBALS-ONLY?*", NIL);
	return NIL;
    }

    public static SubLObject init_noun_compound_parser_file() {
	if (SubLFiles.USE_V1) {
	    defconstant("*DTP-NOUN-COMPOUND-PARSE*", NOUN_COMPOUND_PARSE);
	    deflexical("*NC-PARSE-ID-COUNTER*", SubLTrampolineFile.maybeDefault($nc_parse_id_counter$, $nc_parse_id_counter$, ZERO_INTEGER));
	    defparameter("*RBP-REPORT-PARSE-TIME?*", NIL);
	    defparameter("*RBP-SHADOW-RULES?*", NIL);
	    defparameter("*RBP-RULES-TO-PARSES-SHADOW*", NIL);
	    defparameter("*RBP-RETURN-CONFIDENCE?*", NIL);
	    defparameter("*RBP-SHOW-SUCCESSFUL-RULES?*", NIL);
	    defparameter("*RBP-TRACED-RULES*", NIL);
	    defconstant("*DTP-NOUN-COMPOUND-BLOCK*", NOUN_COMPOUND_BLOCK);
	    defparameter("*RBP-DEFAULT-CONFIDENCE-MULTIPLIER-FOR-FAILING-A-FILTER*", $float$0_5);
	    deflexical("*NC-BLOCK-UNIQUE-ID-COUNTER*", SubLTrampolineFile.maybeDefault($nc_block_unique_id_counter$, $nc_block_unique_id_counter$, ZERO_INTEGER));
	    defparameter("*RBP-UNIVERSAL-BOOLEAN-FILTERS*", $list92);
	    defparameter("*RBP-DEVERBAL-BOOLEAN-FILTERS*", $list93);
	    defparameter("*RBP-DEVERBAL-MACROSCOPIC-FILTERS*", $list94);
	    defparameter("*RBP-DEVERBAL-MACROSCOPIC-BLOCK-FILTERS*", $list95);
	    defparameter("*RBP-INPUT-STRINGS*", NIL);
	    defparameter("*NOMINAL-INTERPRETATIONS-ONLY*", T);
	    defparameter("*RBP-MINIMUM-COMPONENT-COUNT*", ONE_INTEGER);
	    defparameter("*RBP-MAXIMUM-COMPONENT-COUNT*", NIL);
	    defparameter("*NCP-PROBLEM-STORE*", NIL);
	    defparameter("*RBP-SORT-BLOCKS-CONFIDENCE-FIRST?*", NIL);
	    defparameter("*RBP-RELIABILITY-HIGH*", $float$1_05);
	    defparameter("*RBP-RELIABILITY-MEDIUM*", ONE_INTEGER);
	    defparameter("*RBP-RELIABILITY-LOW*", $float$0_95);
	    deflexical("*RBP-CHART-FILTER?*", NIL);
	    defparameter("*RBP-NAME-CACHE*", NIL);
	    deflexical("*RBP-FLOORS-CACHED-CACHING-STATE*", NIL);
	    deflexical("*RBP-OK-NAME-CACHED?-CACHING-STATE*", NIL);
	    defparameter("*RBP-USE-INTER-ARG-ISA-FILTERS?*", NIL);
	    defparameter("*RBP-USE-INTER-ARG-NOT-ISA-FILTERS?*", T);
	    deflexical("*RBP-RB-CLOSED-CLASS-FILTER-KEYS*", $list239);
	    deflexical("*RBP-RB-RULES-MATCHING-CLOSED-SPECS-CACHING-STATE*", NIL);
	    deflexical("*INTER-CONSTRAINTS-FROM-RULE-CACHING-STATE*", NIL);
	    defparameter("*RBP-HIGH-DATE-CONFIDENCE*", $float$0_75);
	    defparameter("*RBP-LOW-DATE-CONFIDENCE*", $float$0_25);
	    defparameter("*RBP-DATE-FALLBACK-IDENTIFIER*", $DATE_FALLBACK);
	    defparameter("*RBP-DATE-FALLBACK-TEST*", symbol_function(EQL));
	    defconstant("*DTP-DATE-PARSE-BLOCK*", DATE_PARSE_BLOCK);
	    defparameter("*RBP-RAE-MAX-TIME*", TEN_INTEGER);
	    deflexical("*RBP-UNLIKELY-SUBCOLLECTION-NAUT?-CACHING-STATE*", NIL);
	    defparameter("*NCS-FORMATS*", NIL);
	    defparameter("*NCS-DEVERBALS-ONLY?*", NIL);
	}
	if (SubLFiles.USE_V2) {
	    deflexical("*NC-PARSE-ID-COUNTER*", NIL != boundp($nc_parse_id_counter$) ? ((SubLObject) ($nc_parse_id_counter$.getGlobalValue())) : ZERO_INTEGER);
	    deflexical("*NC-BLOCK-UNIQUE-ID-COUNTER*", NIL != boundp($nc_block_unique_id_counter$) ? ((SubLObject) ($nc_block_unique_id_counter$.getGlobalValue())) : ZERO_INTEGER);
	    deflexical("*RBP-CNCB-CALLS*", NIL != boundp($rbp_cncb_calls$) ? ((SubLObject) ($rbp_cncb_calls$.getGlobalValue())) : ZERO_INTEGER);
	    deflexical("*RBP-CNCB-CALLS-REDUNDANT*", NIL != boundp($rbp_cncb_calls_redundant$) ? ((SubLObject) ($rbp_cncb_calls_redundant$.getGlobalValue())) : ZERO_INTEGER);
	    deflexical("*RBP-CNCB-CALLS-BACKWARDS*", NIL != boundp($rbp_cncb_calls_backwards$) ? ((SubLObject) ($rbp_cncb_calls_backwards$.getGlobalValue())) : ZERO_INTEGER);
	    deflexical("*RBP-CNCB-HASH*", NIL != boundp($rbp_cncb_hash$) ? ((SubLObject) ($rbp_cncb_hash$.getGlobalValue())) : make_hash_table($int$1024, symbol_function(EQUALP), UNPROVIDED));
	    defparameter("*RBP-UNIVERSAL-BOOLEAN-FILTERS*", $list_alt96);
	    defparameter("*RBP-DEVERBAL-BOOLEAN-FILTERS*", $list_alt97);
	    defparameter("*RBP-DEVERBAL-MACROSCOPIC-FILTERS*", $list_alt98);
	    defparameter("*RBP-DEVERBAL-MACROSCOPIC-BLOCK-FILTERS*", $list_alt99);
	    deflexical("*RBP-RB-CLOSED-CLASS-FILTER-KEYS*", $list_alt243);
	    deflexical("*NCP-COUNT-STRINGS-DENOT-PREDS*", $list_alt293);
	    deflexical("*NCP-COUNT-STRINGS-NAME-PREDS*", NIL != boundp($ncp_count_strings_name_preds$) ? ((SubLObject) ($ncp_count_strings_name_preds$.getGlobalValue())) : NIL);
	    deflexical("*PROPER-NOUN-GENLS*", NIL != boundp($proper_noun_genls$) ? ((SubLObject) ($proper_noun_genls$.getGlobalValue())) : NIL);
	    deflexical("*NCP-COUNT-POS-ASSERTIONS-CACHED-CACHING-STATE*", NIL);
	    deflexical("*NCP-PREDS-OF-POS-COUNT-CACHING-STATE*", NIL);
	}
	return NIL;
    }

    public static SubLObject init_noun_compound_parser_file_Previous() {
	defconstant("*DTP-NOUN-COMPOUND-PARSE*", NOUN_COMPOUND_PARSE);
	deflexical("*NC-PARSE-ID-COUNTER*", SubLTrampolineFile.maybeDefault($nc_parse_id_counter$, $nc_parse_id_counter$, ZERO_INTEGER));
	defparameter("*RBP-REPORT-PARSE-TIME?*", NIL);
	defparameter("*RBP-SHADOW-RULES?*", NIL);
	defparameter("*RBP-RULES-TO-PARSES-SHADOW*", NIL);
	defparameter("*RBP-RETURN-CONFIDENCE?*", NIL);
	defparameter("*RBP-SHOW-SUCCESSFUL-RULES?*", NIL);
	defparameter("*RBP-TRACED-RULES*", NIL);
	defconstant("*DTP-NOUN-COMPOUND-BLOCK*", NOUN_COMPOUND_BLOCK);
	defparameter("*RBP-DEFAULT-CONFIDENCE-MULTIPLIER-FOR-FAILING-A-FILTER*", $float$0_5);
	deflexical("*NC-BLOCK-UNIQUE-ID-COUNTER*", SubLTrampolineFile.maybeDefault($nc_block_unique_id_counter$, $nc_block_unique_id_counter$, ZERO_INTEGER));
	defparameter("*RBP-UNIVERSAL-BOOLEAN-FILTERS*", $list92);
	defparameter("*RBP-DEVERBAL-BOOLEAN-FILTERS*", $list93);
	defparameter("*RBP-DEVERBAL-MACROSCOPIC-FILTERS*", $list94);
	defparameter("*RBP-DEVERBAL-MACROSCOPIC-BLOCK-FILTERS*", $list95);
	defparameter("*RBP-INPUT-STRINGS*", NIL);
	defparameter("*NOMINAL-INTERPRETATIONS-ONLY*", T);
	defparameter("*RBP-MINIMUM-COMPONENT-COUNT*", ONE_INTEGER);
	defparameter("*RBP-MAXIMUM-COMPONENT-COUNT*", NIL);
	defparameter("*NCP-PROBLEM-STORE*", NIL);
	defparameter("*RBP-SORT-BLOCKS-CONFIDENCE-FIRST?*", NIL);
	defparameter("*RBP-RELIABILITY-HIGH*", $float$1_05);
	defparameter("*RBP-RELIABILITY-MEDIUM*", ONE_INTEGER);
	defparameter("*RBP-RELIABILITY-LOW*", $float$0_95);
	deflexical("*RBP-CHART-FILTER?*", NIL);
	defparameter("*RBP-NAME-CACHE*", NIL);
	deflexical("*RBP-FLOORS-CACHED-CACHING-STATE*", NIL);
	deflexical("*RBP-OK-NAME-CACHED?-CACHING-STATE*", NIL);
	defparameter("*RBP-USE-INTER-ARG-ISA-FILTERS?*", NIL);
	defparameter("*RBP-USE-INTER-ARG-NOT-ISA-FILTERS?*", T);
	deflexical("*RBP-RB-CLOSED-CLASS-FILTER-KEYS*", $list239);
	deflexical("*RBP-RB-RULES-MATCHING-CLOSED-SPECS-CACHING-STATE*", NIL);
	deflexical("*INTER-CONSTRAINTS-FROM-RULE-CACHING-STATE*", NIL);
	defparameter("*RBP-HIGH-DATE-CONFIDENCE*", $float$0_75);
	defparameter("*RBP-LOW-DATE-CONFIDENCE*", $float$0_25);
	defparameter("*RBP-DATE-FALLBACK-IDENTIFIER*", $DATE_FALLBACK);
	defparameter("*RBP-DATE-FALLBACK-TEST*", symbol_function(EQL));
	defconstant("*DTP-DATE-PARSE-BLOCK*", DATE_PARSE_BLOCK);
	defparameter("*RBP-RAE-MAX-TIME*", TEN_INTEGER);
	deflexical("*RBP-UNLIKELY-SUBCOLLECTION-NAUT?-CACHING-STATE*", NIL);
	defparameter("*NCS-FORMATS*", NIL);
	defparameter("*NCS-DEVERBALS-ONLY?*", NIL);
	return NIL;
    }

    public static final SubLObject setup_noun_compound_parser_file_alt() {
	register_kb_function(ADD_NC_RULE_CONSTRAINT);
	register_kb_function(REMOVE_NC_RULE_CONSTRAINT);
	register_kb_function(ADD_NC_RULE_TEMPLATE);
	register_kb_function(REMOVE_NC_RULE_TEMPLATE);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_noun_compound_parse$.getGlobalValue(), symbol_function(NOUN_COMPOUND_PARSE_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(NC_PARSE_UNIQUE_ID, _CSETF_NC_PARSE_UNIQUE_ID);
	def_csetf(NC_PARSE_INPUT_STRING, _CSETF_NC_PARSE_INPUT_STRING);
	def_csetf(NC_PARSE_INPUT_STRINGS, _CSETF_NC_PARSE_INPUT_STRINGS);
	def_csetf(NC_PARSE_CHART, _CSETF_NC_PARSE_CHART);
	identity(NOUN_COMPOUND_PARSE);
	declare_defglobal($nc_parse_id_counter$);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_noun_compound_block$.getGlobalValue(), symbol_function(NOUN_COMPOUND_BLOCK_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(NC_BLOCK_UNIQUE_ID, _CSETF_NC_BLOCK_UNIQUE_ID);
	def_csetf(NC_BLOCK_SPAN_INDEX, _CSETF_NC_BLOCK_SPAN_INDEX);
	def_csetf(NC_BLOCK_CONFIDENCE, _CSETF_NC_BLOCK_CONFIDENCE);
	def_csetf(NC_BLOCK_DENOT, _CSETF_NC_BLOCK_DENOT);
	def_csetf(NC_BLOCK_FILTERS, _CSETF_NC_BLOCK_FILTERS);
	def_csetf(NC_BLOCK_SPANNED_STRING, _CSETF_NC_BLOCK_SPANNED_STRING);
	def_csetf(NC_BLOCK_HEAD, _CSETF_NC_BLOCK_HEAD);
	def_csetf(NC_BLOCK_HEAD_POS, _CSETF_NC_BLOCK_HEAD_POS);
	def_csetf(NC_BLOCK_HEAD_STRING_PRED, _CSETF_NC_BLOCK_HEAD_STRING_PRED);
	def_csetf(NC_BLOCK_SUB_TREE, _CSETF_NC_BLOCK_SUB_TREE);
	def_csetf(NC_BLOCK_PLIST, _CSETF_NC_BLOCK_PLIST);
	identity(NOUN_COMPOUND_BLOCK);
	declare_defglobal($nc_block_unique_id_counter$);
	declare_defglobal($rbp_cncb_calls$);
	declare_defglobal($rbp_cncb_calls_redundant$);
	declare_defglobal($rbp_cncb_calls_backwards$);
	declare_defglobal($rbp_cncb_hash$);
	memoization_state.note_memoized_function(COMBINE_NOUN_COMPOUND_BLOCKS);
	memoization_state.note_globally_cached_function(RBP_FLOORS_CACHED);
	memoization_state.note_globally_cached_function($sym169$RBP_OK_NAME_CACHED_);
	memoization_state.note_globally_cached_function(RBP_RB_RULES_MATCHING_CLOSED_SPECS);
	memoization_state.note_memoized_function(RBP_VERIFY);
	memoization_state.note_memoized_function(RBP_RB_INITIAL_SEARCH_NO_TRACING);
	memoization_state.note_globally_cached_function(INTER_CONSTRAINTS_FROM_RULE);
	declare_defglobal($ncp_count_strings_name_preds$);
	declare_defglobal($proper_noun_genls$);
	memoization_state.note_globally_cached_function(NCP_COUNT_POS_ASSERTIONS_CACHED);
	memoization_state.note_globally_cached_function(NCP_PREDS_OF_POS_COUNT);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_date_parse_block$.getGlobalValue(), symbol_function(DATE_PARSE_BLOCK_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(DATE_PARSE_BLOCK_SUBCOL_NAUT, _CSETF_DATE_PARSE_BLOCK_SUBCOL_NAUT);
	def_csetf(DATE_PARSE_BLOCK_CONFIDENCE, _CSETF_DATE_PARSE_BLOCK_CONFIDENCE);
	identity(DATE_PARSE_BLOCK);
	memoization_state.note_memoized_function(RBP_ALL_EXISTS_MATCHES);
	memoization_state.note_globally_cached_function($sym403$RBP_UNLIKELY_SUBCOLLECTION_NAUT_);
	return NIL;
    }

    public static SubLObject setup_noun_compound_parser_file() {
	if (SubLFiles.USE_V1) {
	    register_kb_function(ADD_NC_RULE_CONSTRAINT);
	    register_kb_function(REMOVE_NC_RULE_CONSTRAINT);
	    register_kb_function(ADD_NC_RULE_TEMPLATE);
	    register_kb_function(REMOVE_NC_RULE_TEMPLATE);
	    register_method($print_object_method_table$.getGlobalValue(), $dtp_noun_compound_parse$.getGlobalValue(), symbol_function(NOUN_COMPOUND_PARSE_PRINT_FUNCTION_TRAMPOLINE));
	    SubLSpecialOperatorDeclarations.proclaim($list12);
	    def_csetf(NC_PARSE_UNIQUE_ID, _CSETF_NC_PARSE_UNIQUE_ID);
	    def_csetf(NC_PARSE_INPUT_STRING, _CSETF_NC_PARSE_INPUT_STRING);
	    def_csetf(NC_PARSE_INPUT_STRINGS, _CSETF_NC_PARSE_INPUT_STRINGS);
	    def_csetf(NC_PARSE_CHART, _CSETF_NC_PARSE_CHART);
	    identity(NOUN_COMPOUND_PARSE);
	    register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_noun_compound_parse$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_PARSE_METHOD));
	    declare_defglobal($nc_parse_id_counter$);
	    register_method($print_object_method_table$.getGlobalValue(), $dtp_noun_compound_block$.getGlobalValue(), symbol_function(NOUN_COMPOUND_BLOCK_PRINT_FUNCTION_TRAMPOLINE));
	    SubLSpecialOperatorDeclarations.proclaim($list47);
	    def_csetf(NC_BLOCK_UNIQUE_ID, _CSETF_NC_BLOCK_UNIQUE_ID);
	    def_csetf(NC_BLOCK_SPAN_INDEX, _CSETF_NC_BLOCK_SPAN_INDEX);
	    def_csetf(NC_BLOCK_CONFIDENCE, _CSETF_NC_BLOCK_CONFIDENCE);
	    def_csetf(NC_BLOCK_DENOT, _CSETF_NC_BLOCK_DENOT);
	    def_csetf(NC_BLOCK_FILTERS, _CSETF_NC_BLOCK_FILTERS);
	    def_csetf(NC_BLOCK_SPANNED_STRING, _CSETF_NC_BLOCK_SPANNED_STRING);
	    def_csetf(NC_BLOCK_HEAD, _CSETF_NC_BLOCK_HEAD);
	    def_csetf(NC_BLOCK_HEAD_POS, _CSETF_NC_BLOCK_HEAD_POS);
	    def_csetf(NC_BLOCK_HEAD_STRING_PRED, _CSETF_NC_BLOCK_HEAD_STRING_PRED);
	    def_csetf(NC_BLOCK_SUB_TREE, _CSETF_NC_BLOCK_SUB_TREE);
	    def_csetf(NC_BLOCK_PLIST, _CSETF_NC_BLOCK_PLIST);
	    identity(NOUN_COMPOUND_BLOCK);
	    register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_noun_compound_block$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_BLOCK_METHOD));
	    declare_defglobal($nc_block_unique_id_counter$);
	    memoization_state.note_memoized_function(COMBINE_NOUN_COMPOUND_BLOCKS);
	    memoization_state.note_globally_cached_function(RBP_FLOORS_CACHED);
	    memoization_state.note_globally_cached_function($sym165$RBP_OK_NAME_CACHED_);
	    memoization_state.note_globally_cached_function(RBP_RB_RULES_MATCHING_CLOSED_SPECS);
	    memoization_state.note_memoized_function(RBP_VERIFY);
	    memoization_state.note_memoized_function(RBP_RB_INITIAL_SEARCH_NO_TRACING);
	    memoization_state.note_globally_cached_function(INTER_CONSTRAINTS_FROM_RULE);
	    register_method($print_object_method_table$.getGlobalValue(), $dtp_date_parse_block$.getGlobalValue(), symbol_function(DATE_PARSE_BLOCK_PRINT_FUNCTION_TRAMPOLINE));
	    SubLSpecialOperatorDeclarations.proclaim($list292);
	    def_csetf(DATE_PARSE_BLOCK_SUBCOL_NAUT, _CSETF_DATE_PARSE_BLOCK_SUBCOL_NAUT);
	    def_csetf(DATE_PARSE_BLOCK_CONFIDENCE, _CSETF_DATE_PARSE_BLOCK_CONFIDENCE);
	    identity(DATE_PARSE_BLOCK);
	    register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_date_parse_block$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DATE_PARSE_BLOCK_METHOD));
	    memoization_state.note_memoized_function(RBP_ALL_EXISTS_MATCHES);
	    memoization_state.note_globally_cached_function($sym348$RBP_UNLIKELY_SUBCOLLECTION_NAUT_);
	}
	if (SubLFiles.USE_V2) {
	    declare_defglobal($rbp_cncb_calls$);
	    declare_defglobal($rbp_cncb_calls_redundant$);
	    declare_defglobal($rbp_cncb_calls_backwards$);
	    declare_defglobal($rbp_cncb_hash$);
	    memoization_state.note_globally_cached_function($sym169$RBP_OK_NAME_CACHED_);
	    declare_defglobal($ncp_count_strings_name_preds$);
	    declare_defglobal($proper_noun_genls$);
	    memoization_state.note_globally_cached_function(NCP_COUNT_POS_ASSERTIONS_CACHED);
	    memoization_state.note_globally_cached_function(NCP_PREDS_OF_POS_COUNT);
	    memoization_state.note_globally_cached_function($sym403$RBP_UNLIKELY_SUBCOLLECTION_NAUT_);
	}
	return NIL;
    }

    public static SubLObject setup_noun_compound_parser_file_Previous() {
	register_kb_function(ADD_NC_RULE_CONSTRAINT);
	register_kb_function(REMOVE_NC_RULE_CONSTRAINT);
	register_kb_function(ADD_NC_RULE_TEMPLATE);
	register_kb_function(REMOVE_NC_RULE_TEMPLATE);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_noun_compound_parse$.getGlobalValue(), symbol_function(NOUN_COMPOUND_PARSE_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list12);
	def_csetf(NC_PARSE_UNIQUE_ID, _CSETF_NC_PARSE_UNIQUE_ID);
	def_csetf(NC_PARSE_INPUT_STRING, _CSETF_NC_PARSE_INPUT_STRING);
	def_csetf(NC_PARSE_INPUT_STRINGS, _CSETF_NC_PARSE_INPUT_STRINGS);
	def_csetf(NC_PARSE_CHART, _CSETF_NC_PARSE_CHART);
	identity(NOUN_COMPOUND_PARSE);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_noun_compound_parse$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_PARSE_METHOD));
	declare_defglobal($nc_parse_id_counter$);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_noun_compound_block$.getGlobalValue(), symbol_function(NOUN_COMPOUND_BLOCK_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list47);
	def_csetf(NC_BLOCK_UNIQUE_ID, _CSETF_NC_BLOCK_UNIQUE_ID);
	def_csetf(NC_BLOCK_SPAN_INDEX, _CSETF_NC_BLOCK_SPAN_INDEX);
	def_csetf(NC_BLOCK_CONFIDENCE, _CSETF_NC_BLOCK_CONFIDENCE);
	def_csetf(NC_BLOCK_DENOT, _CSETF_NC_BLOCK_DENOT);
	def_csetf(NC_BLOCK_FILTERS, _CSETF_NC_BLOCK_FILTERS);
	def_csetf(NC_BLOCK_SPANNED_STRING, _CSETF_NC_BLOCK_SPANNED_STRING);
	def_csetf(NC_BLOCK_HEAD, _CSETF_NC_BLOCK_HEAD);
	def_csetf(NC_BLOCK_HEAD_POS, _CSETF_NC_BLOCK_HEAD_POS);
	def_csetf(NC_BLOCK_HEAD_STRING_PRED, _CSETF_NC_BLOCK_HEAD_STRING_PRED);
	def_csetf(NC_BLOCK_SUB_TREE, _CSETF_NC_BLOCK_SUB_TREE);
	def_csetf(NC_BLOCK_PLIST, _CSETF_NC_BLOCK_PLIST);
	identity(NOUN_COMPOUND_BLOCK);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_noun_compound_block$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NOUN_COMPOUND_BLOCK_METHOD));
	declare_defglobal($nc_block_unique_id_counter$);
	memoization_state.note_memoized_function(COMBINE_NOUN_COMPOUND_BLOCKS);
	memoization_state.note_globally_cached_function(RBP_FLOORS_CACHED);
	memoization_state.note_globally_cached_function($sym165$RBP_OK_NAME_CACHED_);
	memoization_state.note_globally_cached_function(RBP_RB_RULES_MATCHING_CLOSED_SPECS);
	memoization_state.note_memoized_function(RBP_VERIFY);
	memoization_state.note_memoized_function(RBP_RB_INITIAL_SEARCH_NO_TRACING);
	memoization_state.note_globally_cached_function(INTER_CONSTRAINTS_FROM_RULE);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_date_parse_block$.getGlobalValue(), symbol_function(DATE_PARSE_BLOCK_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list292);
	def_csetf(DATE_PARSE_BLOCK_SUBCOL_NAUT, _CSETF_DATE_PARSE_BLOCK_SUBCOL_NAUT);
	def_csetf(DATE_PARSE_BLOCK_CONFIDENCE, _CSETF_DATE_PARSE_BLOCK_CONFIDENCE);
	identity(DATE_PARSE_BLOCK);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_date_parse_block$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DATE_PARSE_BLOCK_METHOD));
	memoization_state.note_memoized_function(RBP_ALL_EXISTS_MATCHES);
	memoization_state.note_globally_cached_function($sym348$RBP_UNLIKELY_SUBCOLLECTION_NAUT_);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_noun_compound_parser_file();
    }

    @Override
    public void initializeVariables() {
	init_noun_compound_parser_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_noun_compound_parser_file();
    }

    static {
    }

    public static final class $noun_compound_parse_native extends SubLStructNative {
	public SubLObject $unique_id;

	public SubLObject $input_string;

	public SubLObject $input_strings;

	public SubLObject $chart;

	private static final SubLStructDeclNative structDecl;

	public $noun_compound_parse_native() {
	    noun_compound_parser.$noun_compound_parse_native.this.$unique_id = Lisp.NIL;
	    noun_compound_parser.$noun_compound_parse_native.this.$input_string = Lisp.NIL;
	    noun_compound_parser.$noun_compound_parse_native.this.$input_strings = Lisp.NIL;
	    noun_compound_parser.$noun_compound_parse_native.this.$chart = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return noun_compound_parser.$noun_compound_parse_native.this.$unique_id;
	}

	@Override
	public SubLObject getField3() {
	    return noun_compound_parser.$noun_compound_parse_native.this.$input_string;
	}

	@Override
	public SubLObject getField4() {
	    return noun_compound_parser.$noun_compound_parse_native.this.$input_strings;
	}

	@Override
	public SubLObject getField5() {
	    return noun_compound_parser.$noun_compound_parse_native.this.$chart;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_parse_native.this.$unique_id = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_parse_native.this.$input_string = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_parse_native.this.$input_strings = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_parse_native.this.$chart = value;
	}

	static {
	    structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_parse_native.class, NOUN_COMPOUND_PARSE, NOUN_COMPOUND_PARSE_P, $list6, $list7, new String[] { "$unique_id", "$input_string", "$input_strings", "$chart" }, $list8, $list9, PPRINT_NC_PARSE);
	}
    }

    public static final class $noun_compound_parse_p$UnaryFunction extends UnaryFunction {
	public $noun_compound_parse_p$UnaryFunction() {
	    super(extractFunctionNamed("NOUN-COMPOUND-PARSE-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return noun_compound_parse_p(arg1);
	}
    }

    public static final class $noun_compound_block_native extends SubLStructNative {
	public SubLObject $unique_id;

	public SubLObject $span_index;

	public SubLObject $confidence;

	public SubLObject $denot;

	public SubLObject $filters;

	public SubLObject $spanned_string;

	public SubLObject $head;

	public SubLObject $head_pos;

	public SubLObject $head_string_pred;

	public SubLObject $sub_tree;

	public SubLObject $plist;

	private static final SubLStructDeclNative structDecl;

	public $noun_compound_block_native() {
	    noun_compound_parser.$noun_compound_block_native.this.$unique_id = Lisp.NIL;
	    noun_compound_parser.$noun_compound_block_native.this.$span_index = Lisp.NIL;
	    noun_compound_parser.$noun_compound_block_native.this.$confidence = Lisp.NIL;
	    noun_compound_parser.$noun_compound_block_native.this.$denot = Lisp.NIL;
	    noun_compound_parser.$noun_compound_block_native.this.$filters = Lisp.NIL;
	    noun_compound_parser.$noun_compound_block_native.this.$spanned_string = Lisp.NIL;
	    noun_compound_parser.$noun_compound_block_native.this.$head = Lisp.NIL;
	    noun_compound_parser.$noun_compound_block_native.this.$head_pos = Lisp.NIL;
	    noun_compound_parser.$noun_compound_block_native.this.$head_string_pred = Lisp.NIL;
	    noun_compound_parser.$noun_compound_block_native.this.$sub_tree = Lisp.NIL;
	    noun_compound_parser.$noun_compound_block_native.this.$plist = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return noun_compound_parser.$noun_compound_block_native.this.$unique_id;
	}

	@Override
	public SubLObject getField3() {
	    return noun_compound_parser.$noun_compound_block_native.this.$span_index;
	}

	@Override
	public SubLObject getField4() {
	    return noun_compound_parser.$noun_compound_block_native.this.$confidence;
	}

	@Override
	public SubLObject getField5() {
	    return noun_compound_parser.$noun_compound_block_native.this.$denot;
	}

	@Override
	public SubLObject getField6() {
	    return noun_compound_parser.$noun_compound_block_native.this.$filters;
	}

	@Override
	public SubLObject getField7() {
	    return noun_compound_parser.$noun_compound_block_native.this.$spanned_string;
	}

	@Override
	public SubLObject getField8() {
	    return noun_compound_parser.$noun_compound_block_native.this.$head;
	}

	@Override
	public SubLObject getField9() {
	    return noun_compound_parser.$noun_compound_block_native.this.$head_pos;
	}

	@Override
	public SubLObject getField10() {
	    return noun_compound_parser.$noun_compound_block_native.this.$head_string_pred;
	}

	@Override
	public SubLObject getField11() {
	    return noun_compound_parser.$noun_compound_block_native.this.$sub_tree;
	}

	@Override
	public SubLObject getField12() {
	    return noun_compound_parser.$noun_compound_block_native.this.$plist;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_block_native.this.$unique_id = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_block_native.this.$span_index = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_block_native.this.$confidence = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_block_native.this.$denot = value;
	}

	@Override
	public SubLObject setField6(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_block_native.this.$filters = value;
	}

	@Override
	public SubLObject setField7(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_block_native.this.$spanned_string = value;
	}

	@Override
	public SubLObject setField8(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_block_native.this.$head = value;
	}

	@Override
	public SubLObject setField9(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_block_native.this.$head_pos = value;
	}

	@Override
	public SubLObject setField10(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_block_native.this.$head_string_pred = value;
	}

	@Override
	public SubLObject setField11(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_block_native.this.$sub_tree = value;
	}

	@Override
	public SubLObject setField12(final SubLObject value) {
	    return noun_compound_parser.$noun_compound_block_native.this.$plist = value;
	}

	static {
	    structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.noun_compound_parser.$noun_compound_block_native.class, NOUN_COMPOUND_BLOCK, NOUN_COMPOUND_BLOCK_P, $list41, $list42,
		    new String[] { "$unique_id", "$span_index", "$confidence", "$denot", "$filters", "$spanned_string", "$head", "$head_pos", "$head_string_pred", "$sub_tree", "$plist" }, $list43, $list44, PPRINT_NC_BLOCK);
	}
    }

    public static final class $noun_compound_block_p$UnaryFunction extends UnaryFunction {
	public $noun_compound_block_p$UnaryFunction() {
	    super(extractFunctionNamed("NOUN-COMPOUND-BLOCK-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return noun_compound_block_p(arg1);
	}
    }

    public static final class $date_parse_block_p$UnaryFunction extends UnaryFunction {
	public $date_parse_block_p$UnaryFunction() {
	    super(extractFunctionNamed("DATE-PARSE-BLOCK-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return date_parse_block_p(arg1);
	}
    }

    static private final SubLList $list_alt6 = list(makeSymbol("UNIQUE-ID"), makeSymbol("INPUT-STRING"), makeSymbol("INPUT-STRINGS"), makeSymbol("CHART"));

    static private final SubLList $list_alt7 = list(makeKeyword("UNIQUE-ID"), makeKeyword("INPUT-STRING"), makeKeyword("INPUT-STRINGS"), makeKeyword("CHART"));

    static private final SubLList $list_alt8 = list(makeSymbol("NC-PARSE-UNIQUE-ID"), makeSymbol("NC-PARSE-INPUT-STRING"), makeSymbol("NC-PARSE-INPUT-STRINGS"), makeSymbol("NC-PARSE-CHART"));

    static private final SubLList $list_alt9 = list(makeSymbol("_CSETF-NC-PARSE-UNIQUE-ID"), makeSymbol("_CSETF-NC-PARSE-INPUT-STRING"), makeSymbol("_CSETF-NC-PARSE-INPUT-STRINGS"), makeSymbol("_CSETF-NC-PARSE-CHART"));

    static private final SubLString $str_alt24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt26$____NC_PARSE__ID___S__ = makeString("~&#<NC-PARSE: ID: ~S~%");

    static private final SubLString $str_alt27$__Input_string___S__ = makeString("  Input string: ~S~%");

    static private final SubLString $str_alt28$_Input_strings___S__ = makeString(" Input strings: ~S~%");

    static private final SubLString $str_alt29$_________Chart___S__ = makeString("         Chart: ~S~%");

    static private final SubLList $list_alt31 = list(list(makeSymbol("*RBP-SHOW-SUCCESSFUL-RULES?*"), T));

    static private final SubLList $list_alt35 = list(new SubLObject[] { makeSymbol("UNIQUE-ID"), makeSymbol("SPAN-INDEX"), makeSymbol("CONFIDENCE"), makeSymbol("DENOT"), makeSymbol("FILTERS"), makeSymbol("SPANNED-STRING"), makeSymbol("HEAD"), makeSymbol("HEAD-POS"), makeSymbol("HEAD-STRING-PRED"),
	    makeSymbol("SUB-TREE"), makeSymbol("PLIST") });

    static private final SubLList $list_alt36 = list(new SubLObject[] { makeKeyword("UNIQUE-ID"), makeKeyword("SPAN-INDEX"), makeKeyword("CONFIDENCE"), makeKeyword("DENOT"), makeKeyword("FILTERS"), makeKeyword("SPANNED-STRING"), $HEAD, makeKeyword("HEAD-POS"),
	    makeKeyword("HEAD-STRING-PRED"), makeKeyword("SUB-TREE"), makeKeyword("PLIST") });

    static private final SubLList $list_alt37 = list(new SubLObject[] { makeSymbol("NC-BLOCK-UNIQUE-ID"), makeSymbol("NC-BLOCK-SPAN-INDEX"), makeSymbol("NC-BLOCK-CONFIDENCE"), makeSymbol("NC-BLOCK-DENOT"), makeSymbol("NC-BLOCK-FILTERS"), makeSymbol("NC-BLOCK-SPANNED-STRING"),
	    makeSymbol("NC-BLOCK-HEAD"), makeSymbol("NC-BLOCK-HEAD-POS"), makeSymbol("NC-BLOCK-HEAD-STRING-PRED"), makeSymbol("NC-BLOCK-SUB-TREE"), makeSymbol("NC-BLOCK-PLIST") });

    static private final SubLList $list_alt38 = list(new SubLObject[] { makeSymbol("_CSETF-NC-BLOCK-UNIQUE-ID"), makeSymbol("_CSETF-NC-BLOCK-SPAN-INDEX"), makeSymbol("_CSETF-NC-BLOCK-CONFIDENCE"), makeSymbol("_CSETF-NC-BLOCK-DENOT"), makeSymbol("_CSETF-NC-BLOCK-FILTERS"),
	    makeSymbol("_CSETF-NC-BLOCK-SPANNED-STRING"), makeSymbol("_CSETF-NC-BLOCK-HEAD"), makeSymbol("_CSETF-NC-BLOCK-HEAD-POS"), makeSymbol("_CSETF-NC-BLOCK-HEAD-STRING-PRED"), makeSymbol("_CSETF-NC-BLOCK-SUB-TREE"), makeSymbol("_CSETF-NC-BLOCK-PLIST") });

    static private final SubLString $str_alt75$__NCB__S___S__S_ = makeString("#<NCB ~S: ~S ~S>");

    public static final SubLInteger $int$1024 = makeInteger(1024);

    static private final SubLString $str_alt82$__COMBINE_NOUN_COMPOUND_BLOCKS_wa = makeString("~&COMBINE-NOUN-COMPOUND-BLOCKS was called ~D times");

    static private final SubLString $str_alt83$_____D_of_which_were_repeats_of_p = makeString(",~% ~D of which were repeats of previous calls~A");

    static private final SubLString $str_alt84$__and = makeString(", and");

    static private final SubLString $str_alt86$____D_of_which_were_non_adjacent_ = makeString("~% ~D of which were non-adjacent or in the wrong order");

    static private final SubLString $str_alt87$_ = makeString(".");

    static private final SubLString $str_alt89$Redundant_call_____S____S__ = makeString("Redundant call:~% ~S~% ~S~%");

    static private final SubLList $list_alt90 = list(makeSymbol("RULE"), makeSymbol("DENOT"));

    static private final SubLString $str_alt91$_ = makeString(" ");

    public static final SubLSymbol $kw93$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt94 = list(makeSymbol("DENOT"), makeSymbol("POS"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("WU"));

    static private final SubLList $list_alt96 = list(makeSymbol("RBP-PARSE-FILTER-SUBCOLLECTION-ARGS"));

    static private final SubLList $list_alt97 = list(makeSymbol("RBP-PARSE-FILTER-NONAGENTIVE-ACTORS"), makeSymbol("RBP-PARSE-FILTER-UNLIKELY-INSTRUMENTALS"));

    static private final SubLList $list_alt98 = list(makeSymbol("RBP-UNLIKELY-SUBCOLLECTION-NAUT-WRT-OBJECT?"));

    static private final SubLList $list_alt99 = list(makeSymbol("RBP-UNLIKELY-SUBCOLLECTION-NAUT-BLOCK-WRT-OBJECT?"));

    static private final SubLList $list_alt104 = list(makeSymbol("BLOCK"), makeSymbol("DIAGNOSTICS"));

    static private final SubLString $str_alt105$Abandoning_parse__S_for__S = makeString("Abandoning parse ~S for ~S");

    static private final SubLList $list_alt106 = list(makeSymbol("BLOCK"), makeSymbol("FAILED-THESE-FILTERS"), makeSymbol("DISCONFIDENCE"));

    static private final SubLList $list_alt107 = list(makeSymbol("STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt109 = list(makeSymbol("NCP-INITIALIZE-METRICS"));

    static private final SubLList $list_alt111 = list(makeSymbol("TIME"));

    static private final SubLList $list_alt114 = list(list(makeSymbol("NCP-REPORT-METRICS"), makeSymbol("TIME")));

    static private final SubLSymbol $sym121$STORE = makeUninternedSymbol("STORE");

    static private final SubLString $str_alt124$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt125$__Total_parse_time___4_2F_seconds = makeString("~&Total parse time: ~4,2F seconds.~%");

    static private final SubLString $str_alt126$__Spent__4_2F_seconds_actually_pa = makeString("~&Spent ~4,2F seconds actually parsing.~%");

    static private final SubLString $str_alt127$__Now_parsing__S___ = makeString("~&Now parsing ~S.~%");

    static private final SubLSymbol $sym128$NPP_TERM_COMPLEXITY__ = makeSymbol("NPP-TERM-COMPLEXITY-<");

    static private final SubLSymbol $sym129$_ = makeSymbol(">");

    static private final SubLString $str_alt130$___S_didn_t_use_the_required_rule = makeString("~&~S didn't use the required rules: ~S.~%~%");

    static private final SubLString $str_alt131$___S_was_too_long_or_too_short___ = makeString("~&~S was too long or too short.~%~%");

    static private final SubLString $str_alt132$__The__S_form_of____S___is_being_ = makeString("~&The ~S form of~% ~S~% is being filtered out because it is not nominal.~%~%");

    public static final SubLObject $const138$SubcollectionRelationFunction_Typ = reader_make_constant_shell("SubcollectionRelationFunction-TypeLevel");

    static private final SubLSymbol $sym139$NPP_GENL_ = makeSymbol("NPP-GENL?");

    static private final SubLSymbol $sym140$NPP_ISA_ = makeSymbol("NPP-ISA?");

    static private final SubLString $str_alt144$Strengthening__S_to_use__S = makeString("Strengthening ~S to use ~S");

    static private final SubLList $list_alt146 = list(makeSymbol("DENOT-ARG0"), makeSymbol("DENOT-ARG1"), makeSymbol("DENOT-ARG2"));

    static private final SubLSymbol $sym151$STRING_ = makeSymbol("STRING=");

    static private final SubLSymbol $sym157$RBP_PARSE_AND_CONFIDENCE_ = makeSymbol("RBP-PARSE-AND-CONFIDENCE=");

    static private final SubLSymbol $sym158$NPP_PARSE_ = makeSymbol("NPP-PARSE=");

    static private final SubLSymbol $sym159$RBP_PARSE_AND_CONFIDENCE_ = makeSymbol("RBP-PARSE-AND-CONFIDENCE?");

    static private final SubLSymbol $sym169$RBP_OK_NAME_CACHED_ = makeSymbol("RBP-OK-NAME-CACHED?");

    static private final SubLString $str_alt170$the_ = makeString("the ");

    static private final SubLSymbol $sym173$_RBP_OK_NAME_CACHED__CACHING_STATE_ = makeSymbol("*RBP-OK-NAME-CACHED?-CACHING-STATE*");

    static private final SubLSymbol $sym176$RBP_NAME_BLOCK_ = makeSymbol("RBP-NAME-BLOCK?");

    static private final SubLSymbol $sym177$RBP_NAME_BLOCK_PRED_AMONG_FLOORS_ = makeSymbol("RBP-NAME-BLOCK-PRED-AMONG-FLOORS?");

    static private final SubLSymbol $sym178$INTERVAL_SPAN_PRECEDES_ = makeSymbol("INTERVAL-SPAN-PRECEDES?");

    static private final SubLList $list_alt180 = list(makeSymbol("RBP-RULE"), makeSymbol("DTR1-ID"), makeSymbol("DTR2-ID"));

    static private final SubLString $str_alt181$_S__ = makeString("~S~%");

    static private final SubLList $list_alt185 = list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("FN")), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("INDEXICAL1")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")),
	    list($BIND, makeSymbol("BIN-PRED")), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("INDEXICAL2")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")));

    static private final SubLList $list_alt194 = list(makeSymbol("FUNC"), makeSymbol("FOCAL-COL"), makeSymbol("PRED"), makeSymbol("OTHER-COL"));

    public static final SubLObject $const195$SubcollectionRelationFunction_Ins = reader_make_constant_shell("SubcollectionRelationFunction-InstanceLevel");

    static private final SubLSymbol $sym201$_COL = makeSymbol("?COL");

    static private final SubLList $list_alt203 = list(makeSymbol("?COL"));

    static private final SubLString $str_alt205$____but__A_has_to_be_an_instance_ = makeString("... but ~A has to be an instance of ~A in ~A and isn't");

    static private final SubLString $str_alt206$____but__A_has_to_intersect__A_in = makeString("... but ~A has to intersect ~A in ~A and doesn't");

    static private final SubLString $str_alt207$____but__A_can_t_be_an_instance_o = makeString("... but ~A can't be an instance of ~A in ~A and is");

    static private final SubLString $str_alt208$____but__A_can_t_be_a_spec_of__A_ = makeString("... but ~A can't be a spec of ~A in ~A and is");

    static private final SubLString $str_alt209$interArgIsa_D__D = makeString("interArgIsa~D-~D");

    static private final SubLString $str_alt210$Couldn_t_find_inter_arg_isa_predi = makeString("Couldn't find inter-arg-isa predicate from ~S to ~S");

    static private final SubLString $str_alt211$interArgNotIsa_D__D = makeString("interArgNotIsa~D-~D");

    static private final SubLString $str_alt212$Couldn_t_find_inter_arg_not_isa_p = makeString("Couldn't find inter-arg-not-isa predicate from ~S to ~S");

    static private final SubLList $list_alt213 = list(makeSymbol("SEMX-PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLString $str_alt215$___but_it_fails_the_inter_arg_con = makeString("...but it fails the inter-arg constraint:~%   ~A");

    static private final SubLList $list_alt218 = list(makeSymbol("FUNC"), makeSymbol("COL1"), makeSymbol("SEMX-PRED"), makeSymbol("COL2"));

    public static final SubLObject $const219$SubcollectionRelationFunction_Can = reader_make_constant_shell("SubcollectionRelationFunction-Canonical");

    static private final SubLString $str_alt221$_A__ = makeString("~A~%");

    static private final SubLString $str_alt225$___but_it_failed_the_groupMembers = makeString("...but it failed the groupMembers wff-workaround (~A are groups of ~A, of which ~A is not a spec)");

    static private final SubLString $str_alt227$___but_the___CityNamedFn_arg2_doe = makeString("...but the #$CityNamedFn arg2 doesn't match the #$cityInState arg2: ~A vs ~A");

    static private final SubLString $str_alt230$___but_it_failed_the_strictly_fun = makeString("...but it failed the strictly-functional test: only (~A ~A ~A) is valid");

    static private final SubLString $str_alt232$__Trying_this_block_pair_____S___ = makeString("~%Trying this block pair:~% ~S (~S) (~S)~% ~S (~S) (~S).~%");

    static private final SubLString $str_alt233$__Rule__S_yielded____a___for__S__ = makeString("~&Rule ~S yielded~% ~a~% for ~S+~S.~%");

    static private final SubLString $str_alt235$___but_it_failed_the_wff_checker_ = makeString("...but it failed the wff-checker.~%");

    static private final SubLList $list_alt237 = list(makeSymbol("JUST-THIS-ARG"), makeSymbol("FORMULA"));

    static private final SubLString $str_alt238$___but_the_desired_FormulaArgFn__ = makeString("...but the desired FormulaArgFn (~D) exceeds the semx arity (~D).~%");

    static private final SubLString $str_alt241$___but_I_was_unable_to_verify__S_ = makeString("...but I was unable to verify ~S~%");

    static private final SubLList $list_alt243 = list(list(makeKeyword("POS"), $HEAD), list($PRED, $HEAD), list(makeKeyword("POS"), makeKeyword("MODIFIER")), list($PRED, makeKeyword("MODIFIER")));

    static private final SubLList $list_alt244 = list(makeSymbol("C-TYPE"), makeSymbol("O-TYPE"));

    static private final SubLString $str_alt254$__The_blocks_failed_an_inter_cons = makeString("~%The blocks failed an inter-constraint in ~S on ~S.~%");

    static private final SubLList $list_alt257 = list(makeSymbol("CON-KW"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLList $list_alt258 = list(makeKeyword("modifier"), makeKeyword("MODIFIER"));

    static private final SubLString $str_alt263$__Semantics_are__S_and__S___in_te = makeString("~&Semantics are ~S and ~S~% in template ~S.~%");

    static private final SubLSymbol $sym266$NPP_GENL_PRED_ = makeSymbol("NPP-GENL-PRED?");

    static private final SubLSymbol $sym272$NPP_TYPE_GENL_ = makeSymbol("NPP-TYPE-GENL?");

    static private final SubLString $str_alt276$__Doing_Rule__D_of__D_____ = makeString("~&Doing Rule ~D of ~D...~%");

    static private final SubLString $str_alt278$__Current_subtotal_for_first__D_r = makeString("~&Current subtotal for first ~D rules: ~:D~%");

    static private final SubLList $list_alt280 = list(makeSymbol("RULE"), makeSymbol("COUNT"));

    static private final SubLString $str_alt281$__Rule__45S__10D__ = makeString("~&Rule ~45S ~10D~%");

    static private final SubLString $str_alt282$____D__ = makeString("~&~:D~%");

    static private final SubLString $str_alt283$Analyzed__D_noun_compound_rules__ = makeString("Analyzed ~D noun compound rules.~%");

    static private final SubLString $str_alt284$Average_strings_per_rule___4_1F__ = makeString("Average strings per rule: ~4,1F.~%");

    static private final SubLString $str_alt285$Median_strings_per_rule____D___ = makeString("Median strings per rule: ~:D.~%");

    static private final SubLString $str_alt286$_________________________________ = makeString("~&=======================================~%");

    static private final SubLString $str_alt287$__Rule__S___ = makeString("~&Rule ~S:~%");

    static private final SubLString $str_alt288$__Couldn_t_estimate_string_count_ = makeString("~&Couldn't estimate string count for ~S.~%");

    static private final SubLString $str_alt289$__Estimated_string_count____D___ = makeString("~&Estimated string count: ~:D.~%");

    private static final SubLSymbol $NO_CONSTRAINTS = makeKeyword("NO-CONSTRAINTS");

    static private final SubLString $str_alt291$__Found___D__A_lexical_assertions = makeString("~&Found ~:D ~A lexical assertions for ~S terms.~%");

    static private final SubLString $$$total = makeString("total");

    static private final SubLList $list_alt293 = list(reader_make_constant_shell("denotation"), reader_make_constant_shell("multiWordString"), reader_make_constant_shell("compoundString"));

    public static final SubLObject $$ProperNamePredicate_General = reader_make_constant_shell("ProperNamePredicate-General");

    private static final SubLSymbol NCP_COUNT_POS_ASSERTIONS_CACHED = makeSymbol("NCP-COUNT-POS-ASSERTIONS-CACHED");

    static private final SubLString $str_alt299$__No_semantic_constraints_on__S__ = makeString("~&No semantic constraints on ~S.~%");

    static private final SubLList $list_alt300 = list(makeSymbol("TYPE"), makeSymbol("O"), makeSymbol("TARGET"));

    static private final SubLString $str_alt301$__Can_t_handle_non_fort_target___ = makeString("~&Can't handle non-fort target: ~S.~%");

    static private final SubLString $str_alt303$__No_instances_of__S___ = makeString("~&No instances of ~S.~%");

    static private final SubLString $str_alt304$__No_specs_of__S___ = makeString("~&No specs of ~S.~%");

    static private final SubLList $list_alt305 = list(makeKeyword("ISA"), makeKeyword("EQL"), $GENL);

    static private final SubLString $str_alt306$____S____D_term_A_meet_A_constrai = makeString("~& ~S: ~:D term~A meet~A constraints so far.~%");

    static private final SubLString $$$s = makeString("s");

    static private final SubLString $str_alt308$__Found___D_term_A_for__S___ = makeString("~&Found ~:D term~A for ~S.~%");

    private static final SubLSymbol NCP_PREDS_OF_POS_COUNT = makeSymbol("NCP-PREDS-OF-POS-COUNT");

    static private final SubLString $str_alt311$__Found__D_overlapping_term_pairs = makeString("~&Found ~D overlapping term pairs.~%");

    static private final SubLList $list_alt323 = list(makeSymbol("MOD"), makeSymbol("HEAD"));

    static private final SubLList $list_alt329 = list(makeSymbol("SUBCOL-NAUT"), makeSymbol("CONFIDENCE"));

    static private final SubLList $list_alt330 = list(makeKeyword("SUBCOL-NAUT"), makeKeyword("CONFIDENCE"));

    static private final SubLList $list_alt331 = list(makeSymbol("DATE-PARSE-BLOCK-SUBCOL-NAUT"), makeSymbol("DATE-PARSE-BLOCK-CONFIDENCE"));

    static private final SubLList $list_alt332 = list(makeSymbol("_CSETF-DATE-PARSE-BLOCK-SUBCOL-NAUT"), makeSymbol("_CSETF-DATE-PARSE-BLOCK-CONFIDENCE"));

    static private final SubLList $list_alt345 = list(makeSymbol("EVENT"), makeSymbol("DATE-VAR"));

    static private final SubLSymbol $sym346$_EVENT = makeSymbol("?EVENT");

    static private final SubLString $str_alt349$_____todo_handle_dates_with_multi = makeString("*** @todo handle dates with multiple variables");

    static private final SubLSymbol $sym350$DATE_PARSE_COMPLEXITY__ = makeSymbol("DATE-PARSE-COMPLEXITY->");

    public static final SubLObject $$patient_GenericDirect = reader_make_constant_shell("patient-GenericDirect");

    static private final SubLString $$$best_statistical_subject = makeString("best statistical subject");

    static private final SubLString $$$best_statistical_object = makeString("best statistical object");

    public static final SubLObject $const359$SubcollectionOfWithRelationToType = reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn");

    static private final SubLSymbol $sym361$_PRED = makeSymbol("?PRED");

    static private final SubLList $list_alt363 = list(makeSymbol("?PRED"));

    static private final SubLString $str_alt371$rbp_parse_filter_nonagentive_acto = makeString("rbp-parse-filter-nonagentive-actors");

    static private final SubLSymbol $sym379$_TYPE = makeSymbol("?TYPE");

    static private final SubLString $str_alt380$Timed_out_checking___relationAllE = makeString("Timed out checking #$relationAllExists, etc. after ~S seconds on~% ~S ~S ~S");

    static private final SubLList $list_alt385 = list(makeSymbol("?TYPE"));

    static private final SubLString $str_alt389$rbp_parse_prefer_rmp_matches_had_ = makeString("rbp-parse-prefer-rmp-matches had to punt");

    static private final SubLString $str_alt396$doesn_t_match___relationAllExists = makeString("doesn't match #$relationAllExists expectations for ~A");

    static private final SubLString $str_alt399$rbp_parse_filter_unlikely_instrum = makeString("rbp-parse-filter-unlikely-instrumentals");

    static private final SubLString $str_alt400$rbp_parse_filter_unlikely_instrum = makeString("rbp-parse-filter-unlikely-instrumentals had to punt");

    static private final SubLString $str_alt401$rbp_parse_filter_subcollection_ar = makeString("rbp-parse-filter-subcollection-args");

    static private final SubLSymbol $sym403$RBP_UNLIKELY_SUBCOLLECTION_NAUT_ = makeSymbol("RBP-UNLIKELY-SUBCOLLECTION-NAUT?");

    static private final SubLString $str_alt405$statistically_unlikely_combinatio = makeString("statistically unlikely combination");

    static private final SubLSymbol $sym406$_RBP_UNLIKELY_SUBCOLLECTION_NAUT__CACHING_STATE_ = makeSymbol("*RBP-UNLIKELY-SUBCOLLECTION-NAUT?-CACHING-STATE*");

    static private final SubLList $list_alt408 = list(reader_make_constant_shell("nonPlural-Generic"));

    static private final SubLString $str_alt416$No_mode_specified_for_initialize_ = makeString("No mode specified for initialize-ncs-formats");

    static private final SubLString $str_alt418$investigating___D__A_____ = makeString("investigating #~D ~A...~%");

    static private final SubLString $str_alt420$parse_of__S_yielded___ = makeString("parse of ~S yielded:~%");

    static private final SubLString $str_alt422$______and_also________ = makeString("..... and also .....~%");

    static private final SubLString $str_alt424$____denots_are__A__ = makeString("... denots are ~A~%");

    static private final SubLString $str_alt426$________________________________ = makeString("==============================~%");

    static private final SubLString $str_alt428$__Total_compounds_with_any_parses = makeString("~%Total compounds with any parses: ~A~%");

    static private final SubLString $str_alt430$Total_parses_found___A__ = makeString("Total parses found: ~A~%");

    static private final SubLString $str_alt432$Percent_of_parses_approved___5_2F = makeString("Percent of parses approved: ~5,2F~%");

    static private final SubLString $str_alt434$Total_violations___A__ = makeString("Total violations: ~A~%");

    static private final SubLString $str_alt436$Note___A_parses_reformulated_to_c = makeString("Note: ~A parses reformulated to constants~%");

    static private final SubLString $str_alt438$Compounds_wanting_denots___A_____ = makeString("Compounds wanting denots: ~A~%... having any: ~A~%... total: ~A~%");

    static private final SubLString $str_alt440$from__S___A__ = makeString("from ~S: ~A~%");

    static private final SubLString $str_alt442$_A_A__ = makeString("~A~A~%");

    static private final SubLString $str_alt444$_A__ = makeString("~A: ");

    static private final SubLString $str_alt446$Uses_of__A___A_total___A_good___A = makeString("Uses of ~A: ~A total, ~A good, ~A bad~%");

    static private final SubLList $list_alt447 = list(makeSymbol("STREAM"), makeSymbol("CAT"), makeSymbol("&BODY"), makeSymbol("FORMAT-AND-ARGS"));

    static private final SubLString $str_alt452$_cyc_departments_nl_doc_stats_src = makeString("/cyc/departments/nl/doc/stats/src/acquaint-10000");

    static private final SubLString $str_alt453$_cyc_departments_nl_doc_stats_kb = makeString("/cyc/departments/nl/doc/stats/kb");

    static private final SubLString $str_alt454$_ = makeString("-");

    static private final SubLString $str_alt455$_ncr_stats = makeString(".ncr.stats");

    static private final SubLString $str_alt460$Couldn_t_open_output_stream__woul = makeString("Couldn't open output stream, would be ~A");

    static private final SubLString $str_alt461$would_print_to__S__ = makeString("would print to ~S~%");

    static private final SubLString $str_alt462$storing_results_in__S__cutoff_is_ = makeString("storing results in ~S, cutoff is ~A~%");

    static private final SubLList $list_alt466 = cons(makeSymbol("RULE"), makeSymbol("TOTAL-USES"));

    static private final SubLString $str_alt467$_cyc_projects_daml_call_thesaurus = makeString("/cyc/projects/daml/call-thesaurus/parses.txt");

    static private final SubLString $str_alt468$_ = makeString("\"");

    static private final SubLString $str_alt469$_ = makeString("(");

    static private final SubLString $str_alt470$skipping__A______ = makeString("skipping ~A ...  ");

    static private final SubLString $str_alt471$investigating__A______ = makeString("investigating ~A ...~%");

    static private final SubLString $str_alt473$_S_______________________________ = makeString("~S~%==============================~%");

    static private final SubLString $str_alt474$found_something_for__A_of__A_entr = makeString("found something for ~A of ~A entries, ignoring aircraft models");

    static private final SubLList $list_alt475 = list(list(makeSymbol("NAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt480$Skipping_this_test_as__A_doesn_t_ = makeString("Skipping this test as ~A doesn't exist in the KB");
}

/**
 * Total time: 2353 ms synthetic
 */
