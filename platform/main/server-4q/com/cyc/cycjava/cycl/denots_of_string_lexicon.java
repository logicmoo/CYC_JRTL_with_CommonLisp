/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class denots_of_string_lexicon extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new denots_of_string_lexicon();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol LEXICON_FOR_DENOTS_OF_STRING = makeSymbol("LEXICON-FOR-DENOTS-OF-STRING");

    static private final SubLSymbol $sym3$CONVERT_TO_EL_ = makeSymbol("CONVERT-TO-EL?");

    private static final SubLSymbol SET_BASE_MT = makeSymbol("SET-BASE-MT");

    private static final SubLSymbol INITIALIZE_ALLOWED_MTS = makeSymbol("INITIALIZE-ALLOWED-MTS");



    private static final SubLSymbol INITIALIZE_EXCLUDED_PREDS = makeSymbol("INITIALIZE-EXCLUDED-PREDS");

    private static final SubLList $list11 = list(makeSymbol("PRED"), makeSymbol("VALUE"));

    // Definitions
    /**
     *
     *
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations;
     * 		if it includes :acronyms, include acronyms
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @return TERM-LEXICON-P suitable for getting denots with the specified parameters.
     */
    @LispMethod(comment = "@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations;\r\n\t\tif it includes :acronyms, include acronyms\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@return TERM-LEXICON-P suitable for getting denots with the specified parameters.")
    public static final SubLObject lexicon_for_denots_of_string_internal_alt(SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            SubLObject lexicon = term_lexicon.new_term_lexicon();
            methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, case_sensitivity);
            instances.set_slot(lexicon, $sym3$CONVERT_TO_EL_, NIL);
            instances.set_slot(lexicon, DEFAULT_EXCLUDE_MTS, NIL);
            methods.funcall_instance_method_with_1_args(lexicon, SET_BASE_MT, lookup_mt);
            methods.funcall_instance_method_with_0_args(lexicon, INITIALIZE_ALLOWED_MTS);
            if (NIL != misspellingsP) {
                methods.funcall_instance_method_with_1_args(lexicon, ALLOW_MT, $$CommonEnglishMisspellingsMt);
            } else {
                methods.funcall_instance_method_with_1_args(lexicon, FORBID_MT, $$CommonEnglishMisspellingsMt);
            }
            methods.funcall_instance_method_with_1_args(lexicon, INITIALIZE_EXCLUDED_PREDS, NIL);
            if (NIL != skip_namestringsP) {
                {
                    SubLObject set_contents_var = set.do_set_internal(lexicon_vars.name_string_preds_set(UNPROVIDED));
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject pred = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, pred);
                            }
                        }
                    }
                }
                {
                    SubLObject set_contents_var = set.do_set_internal(lexicon_vars.term_strings_preds_set(UNPROVIDED));
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject pred = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, pred);
                            }
                        }
                    }
                }
            }
            if (NIL == subl_promotions.memberP($ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject cdolist_list_var = lexicon_vars.acronym_predicates();
                    SubLObject pred = NIL;
                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, pred);
                    }
                }
            }
            if (NIL == subl_promotions.memberP($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject cdolist_list_var = lexicon_vars.abbreviation_predicates();
                    SubLObject pred = NIL;
                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, pred);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = lexicon_accessors.determine_denotation_preds($ANY);
                SubLObject denotation_pred = NIL;
                for (denotation_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denotation_pred = cdolist_list_var.first()) {
                    methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, denotation_pred);
                }
            }
            {
                SubLObject cdolist_list_var = lexicon_accessors.determine_denotation_preds(denot_type);
                SubLObject denotation_pred = NIL;
                for (denotation_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denotation_pred = cdolist_list_var.first()) {
                    methods.funcall_instance_method_with_1_args(lexicon, ALLOW_PREDICATE, denotation_pred);
                }
            }
            return lexicon;
        }
    }

    // Definitions
    /**
     *
     *
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations;
     * 		if it includes :acronyms, include acronyms
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @return TERM-LEXICON-P suitable for getting denots with the specified parameters.
     */
    @LispMethod(comment = "@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations;\r\n\t\tif it includes :acronyms, include acronyms\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@return TERM-LEXICON-P suitable for getting denots with the specified parameters.")
    public static SubLObject lexicon_for_denots_of_string_internal(SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lexicon = term_lexicon.new_term_lexicon();
        methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, case_sensitivity);
        instances.set_slot(lexicon, $sym3$CONVERT_TO_EL_, NIL);
        instances.set_slot(lexicon, DEFAULT_EXCLUDE_MTS, NIL);
        methods.funcall_instance_method_with_1_args(lexicon, SET_BASE_MT, lookup_mt);
        methods.funcall_instance_method_with_0_args(lexicon, INITIALIZE_ALLOWED_MTS);
        if (NIL != misspellingsP) {
            methods.funcall_instance_method_with_1_args(lexicon, ALLOW_MT, $$CommonEnglishMisspellingsMt);
        } else {
            methods.funcall_instance_method_with_1_args(lexicon, FORBID_MT, $$CommonEnglishMisspellingsMt);
        }
        methods.funcall_instance_method_with_1_args(lexicon, INITIALIZE_EXCLUDED_PREDS, NIL);
        if (NIL != skip_namestringsP) {
            SubLObject iterator = map_utilities.new_map_iterator(lexicon_vars.name_string_preds_set(UNPROVIDED));
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject pred = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list11);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list11);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, pred);
                    } else {
                        cdestructuring_bind_error(datum, $list11);
                    }
                }
            }
            iterator = map_utilities.new_map_iterator(lexicon_vars.term_strings_preds_set(UNPROVIDED));
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject pred = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list11);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list11);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, pred);
                    } else {
                        cdestructuring_bind_error(datum, $list11);
                    }
                }
            }
        }
        if (NIL == subl_promotions.memberP($ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = lexicon_vars.acronym_predicates();
            SubLObject pred2 = NIL;
            pred2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, pred2);
                cdolist_list_var = cdolist_list_var.rest();
                pred2 = cdolist_list_var.first();
            } 
        }
        if (NIL == subl_promotions.memberP($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = lexicon_vars.abbreviation_predicates();
            SubLObject pred2 = NIL;
            pred2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, pred2);
                cdolist_list_var = cdolist_list_var.rest();
                pred2 = cdolist_list_var.first();
            } 
        }
        SubLObject cdolist_list_var = lexicon_accessors.determine_denotation_preds($ANY);
        SubLObject denotation_pred = NIL;
        denotation_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, denotation_pred);
            cdolist_list_var = cdolist_list_var.rest();
            denotation_pred = cdolist_list_var.first();
        } 
        cdolist_list_var = lexicon_accessors.determine_denotation_preds(denot_type);
        denotation_pred = NIL;
        denotation_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            methods.funcall_instance_method_with_1_args(lexicon, ALLOW_PREDICATE, denotation_pred);
            cdolist_list_var = cdolist_list_var.rest();
            denotation_pred = cdolist_list_var.first();
        } 
        return lexicon;
    }

    public static final SubLObject lexicon_for_denots_of_string_alt(SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.denots_of_string_lexicon.lexicon_for_denots_of_string_internal(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LEXICON_FOR_DENOTS_OF_STRING, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LEXICON_FOR_DENOTS_OF_STRING, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, LEXICON_FOR_DENOTS_OF_STRING, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_6(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw16$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (abbrev_types.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (denot_type.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (misspellingsP.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (skip_namestringsP.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (lookup_mt.equal(cached_args.first())) {
                                                        cached_args = cached_args.rest();
                                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && case_sensitivity.equal(cached_args.first())) {
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
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.denots_of_string_lexicon.lexicon_for_denots_of_string_internal(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject lexicon_for_denots_of_string(SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return lexicon_for_denots_of_string_internal(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LEXICON_FOR_DENOTS_OF_STRING, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LEXICON_FOR_DENOTS_OF_STRING, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, LEXICON_FOR_DENOTS_OF_STRING, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (abbrev_types.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (denot_type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (misspellingsP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (skip_namestringsP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (lookup_mt.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && case_sensitivity.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(lexicon_for_denots_of_string_internal(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject lexicon_denots_of_string_alt(SubLObject string, SubLObject lexicon) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denots = NIL;
                SubLObject pred_lists = NIL;
                SubLObject results_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lexicon, GET, string);
                SubLObject lex_entry = NIL;
                for (lex_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex_entry = cdolist_list_var.first()) {
                    {
                        SubLObject denot = methods.funcall_instance_method_with_1_args(lex_entry, GET, $DENOT);
                        if (NIL != denot) {
                            {
                                SubLObject predicate = methods.funcall_instance_method_with_1_args(lex_entry, GET, $PREDICATE);
                                if ((NIL != lexicon_vars.name_string_predP(predicate)) || (NIL != lexicon_vars.term_strings_predP(predicate))) {
                                    dictionary_utilities.dictionary_pushnew(results_dictionary, denot, predicate, UNPROVIDED, UNPROVIDED);
                                } else {
                                    {
                                        SubLObject cdolist_list_var_1 = methods.funcall_instance_method_with_1_args(lex_entry, GET, $INFLECTIONS);
                                        SubLObject pred = NIL;
                                        for (pred = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , pred = cdolist_list_var_1.first()) {
                                            dictionary_utilities.dictionary_pushnew(results_dictionary, denot, pred, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(results_dictionary));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject denot = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject preds = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            denots = cons(denot, denots);
                            pred_lists = cons(preds, pred_lists);
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return values(denots, pred_lists);
            }
        }
    }

    public static SubLObject lexicon_denots_of_string(final SubLObject string, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = NIL;
        SubLObject pred_lists = NIL;
        final SubLObject results_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lexicon, GET, string);
        SubLObject lex_entry = NIL;
        lex_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject denot = methods.funcall_instance_method_with_1_args(lex_entry, GET, $DENOT);
            if (NIL != denot) {
                final SubLObject predicate = methods.funcall_instance_method_with_1_args(lex_entry, GET, $PREDICATE);
                if ((NIL != lexicon_vars.name_string_predP(predicate)) || (NIL != lexicon_vars.term_strings_predP(predicate))) {
                    dictionary_utilities.dictionary_pushnew(results_dictionary, denot, predicate, UNPROVIDED, UNPROVIDED);
                } else {
                    SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_1_args(lex_entry, GET, $INFLECTIONS);
                    SubLObject pred = NIL;
                    pred = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        dictionary_utilities.dictionary_pushnew(results_dictionary, denot, pred, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        pred = cdolist_list_var_$1.first();
                    } 
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex_entry = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(results_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject denot2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject preds = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = cons(denot2, denots);
            pred_lists = cons(preds, pred_lists);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return values(denots, pred_lists);
    }

    public static SubLObject declare_denots_of_string_lexicon_file() {
        declareFunction("lexicon_for_denots_of_string_internal", "LEXICON-FOR-DENOTS-OF-STRING-INTERNAL", 0, 6, false);
        declareFunction("lexicon_for_denots_of_string", "LEXICON-FOR-DENOTS-OF-STRING", 0, 6, false);
        declareFunction("lexicon_denots_of_string", "LEXICON-DENOTS-OF-STRING", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_denots_of_string_lexicon_file() {
        return NIL;
    }

    public static SubLObject setup_denots_of_string_lexicon_file() {
        memoization_state.note_memoized_function(LEXICON_FOR_DENOTS_OF_STRING);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_denots_of_string_lexicon_file();
    }

    @Override
    public void initializeVariables() {
        init_denots_of_string_lexicon_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_denots_of_string_lexicon_file();
    }

    static {
    }

    public static final SubLSymbol $kw16$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 117 ms
 */
