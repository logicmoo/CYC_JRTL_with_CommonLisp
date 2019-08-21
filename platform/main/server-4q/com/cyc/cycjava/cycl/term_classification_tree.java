package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.term_classification_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.term_classification_tree.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class term_classification_tree extends SubLTranslatedFile {
    public static final SubLFile me = new term_classification_tree();

    public static final String myName = "com.cyc.cycjava.cycl.term_classification_tree";

    public static final String myFingerPrint = "75ac80145c9762079103c7e7e9deed49dfb51d6da3fddf7856074d82ac3702c0";

    // defparameter
    public static final SubLSymbol $term_classification_tree_collections$ = makeSymbol("*TERM-CLASSIFICATION-TREE-COLLECTIONS*");

    // defparameter
    /**
     * The microtheory used to compute the isas and genls of the term for the term
     * classification tree.
     */
    public static final SubLSymbol $term_classification_tree_mt$ = makeSymbol("*TERM-CLASSIFICATION-TREE-MT*");

    // defparameter
    public static final SubLSymbol $term_classification_tree$ = makeSymbol("*TERM-CLASSIFICATION-TREE*");

    // deflexical
    private static final SubLSymbol $term_good_wrt_classification_treeP_caching_state$ = makeSymbol("*TERM-GOOD-WRT-CLASSIFICATION-TREE?-CACHING-STATE*");



    public static final SubLString $str1$ISA_ = makeString("ISA_");

    public static final SubLString $str2$QUOTEDISA_ = makeString("QUOTEDISA_");

    public static final SubLString $str3$GENLS_ = makeString("GENLS_");

    public static final SubLString $str4$Unexpected_term_classification_tr = makeString("Unexpected term classification tree property ~s");

    public static final SubLString $str5$Creation_of_collections_from_a_Te = makeString("Creation of collections from a Term Classification Tree failed due to the following errors: ~%~A~%");

    public static final SubLString $str6$CU2FN_ = makeString("CU2FN_");

    public static final SubLList $list7 = list(CHAR_underbar);

    public static final SubLSymbol $sym8$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $$CollectionUnionFn = reader_make_constant_shell(makeString("CollectionUnionFn"));

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    public static final SubLString $str11$CU3FN_ = makeString("CU3FN_");

    public static final SubLString $str12$Unable_to_find_a_constant_when_ex = makeString("Unable to find a constant when executing (CONSTANT-FROM-TREE-TERM ~S)");

    public static final SubLString $str13$CU2FN_1 = makeString("CU2FN_1");

    public static final SubLString $str14$_2 = makeString("_2");

    public static final SubLString $str15$CU3FN_1 = makeString("CU3FN_1");

    public static final SubLString $str16$_3 = makeString("_3");

    public static final SubLString $str17$Invalid_NAT_being_converted_to_tr = makeString("Invalid NAT being converted to tree-term: ~S");

    private static final SubLObject $const18$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric"));

    public static final SubLSymbol TERM_CLASSIFICATION_TREE_MT = makeSymbol("TERM-CLASSIFICATION-TREE-MT");

    public static final SubLSymbol SET_TERM_CLASSIFICATION_TREE_MT = makeSymbol("SET-TERM-CLASSIFICATION-TREE-MT");





    public static final SubLSymbol RESET_TERM_CLASSIFICATION_TREE = makeSymbol("RESET-TERM-CLASSIFICATION-TREE");

    public static final SubLSymbol $sym24$TERM_GOOD_WRT_CLASSIFICATION_TREE_ = makeSymbol("TERM-GOOD-WRT-CLASSIFICATION-TREE?");







    public static final SubLSymbol GOOD = makeSymbol("GOOD");

    public static final SubLSymbol BAD = makeSymbol("BAD");

    public static final SubLString $str30$Unexpected_term_classification_tr = makeString("Unexpected term classification tree evaluation ~s");

    public static final SubLSymbol $sym31$_TERM_GOOD_WRT_CLASSIFICATION_TREE__CACHING_STATE_ = makeSymbol("*TERM-GOOD-WRT-CLASSIFICATION-TREE?-CACHING-STATE*");

    private static final SubLInteger $int$5000 = makeInteger(5000);

    public static final SubLSymbol $sym33$CLEAR_TERM_GOOD_WRT_CLASSIFICATION_TREE_ = makeSymbol("CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?");

    public static SubLObject create_term_classification_tree_collections(final SubLObject v_term_classification_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = decision_tree.decision_tree_properties(v_term_classification_tree);
        final SubLObject collections = set.new_set(symbol_function(EQ), UNPROVIDED);
        SubLObject error_messages = NIL;
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject symbol_name = symbol_name(property);
            SubLObject error_message = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (NIL != string_utilities.starts_with(symbol_name, $str1$ISA_)) {
                            final SubLObject col_name = string_utilities.substring(symbol_name, length($str1$ISA_), UNPROVIDED);
                            set.set_add(constant_from_tree_term(col_name), collections);
                        } else
                            if (NIL != string_utilities.starts_with(symbol_name, $str2$QUOTEDISA_)) {
                                final SubLObject col_name = string_utilities.substring(symbol_name, length($str2$QUOTEDISA_), UNPROVIDED);
                                set.set_add(constant_from_tree_term(col_name), collections);
                            } else
                                if (NIL != string_utilities.starts_with(symbol_name, $str3$GENLS_)) {
                                    final SubLObject col_name = string_utilities.substring(symbol_name, length($str3$GENLS_), UNPROVIDED);
                                    set.set_add(constant_from_tree_term(col_name), collections);
                                } else {
                                    Errors.error($str4$Unexpected_term_classification_tr, property);
                                }


                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != error_message) {
                error_messages = cons(error_message, error_messages);
            }
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        if (NIL != error_messages) {
            Errors.error($str5$Creation_of_collections_from_a_Te, error_messages);
        }
        return copy_list(set.set_element_list(collections));
    }

    public static SubLObject initialize_term_classification_tree_collections() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $term_classification_tree_collections$.setDynamicValue(create_term_classification_tree_collections($term_classification_tree$.getDynamicValue(thread)), thread);
        return $term_classification_tree_collections$.getDynamicValue(thread);
    }

    public static SubLObject constant_from_tree_term(final SubLObject tree_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL != string_utilities.starts_with(tree_term, $str6$CU2FN_)) {
                        final SubLObject col_union_parts = string_utilities.split_string(tree_term, $list7);
                        final SubLObject term1 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(second(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                        final SubLObject term2 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(third(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                        return narts_high.nart_substitute(list($$CollectionUnionFn, list($$TheSet, term1, term2)));
                    }
                    if (NIL != string_utilities.starts_with(tree_term, $str11$CU3FN_)) {
                        final SubLObject col_union_parts = string_utilities.split_string(tree_term, $list7);
                        final SubLObject term1 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(second(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                        final SubLObject term2 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(third(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                        final SubLObject term3 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(fourth(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                        return narts_high.nart_substitute(list($$CollectionUnionFn, list($$TheSet, term1, term2, term3)));
                    }
                    return list_utilities.only_one(constant_completion_high.constant_complete(tree_term, NIL, T, UNPROVIDED, UNPROVIDED));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            Errors.error($str12$Unable_to_find_a_constant_when_ex, tree_term);
        }
        return NIL;
    }

    public static SubLObject tree_term_from_constant(final SubLObject cycl_term) {
        if (NIL != nart_handles.nart_p(cycl_term)) {
            if (cycl_utilities.nat_arg0(cycl_term).eql($$CollectionUnionFn)) {
                final SubLObject col_union_parts = cycl_utilities.nat_arg1(cycl_term, UNPROVIDED).rest();
                final SubLObject pcase_var;
                final SubLObject col_union_size = pcase_var = length(col_union_parts);
                if (pcase_var.eql(TWO_INTEGER)) {
                    return cconcatenate($str13$CU2FN_1, new SubLObject[]{ format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(col_union_parts.first()), UNPROVIDED)), $str14$_2, format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(second(col_union_parts)), UNPROVIDED)) });
                }
                if (pcase_var.eql(THREE_INTEGER)) {
                    return cconcatenate($str15$CU3FN_1, new SubLObject[]{ format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(col_union_parts.first()), UNPROVIDED)), $str14$_2, format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(second(col_union_parts)), UNPROVIDED)), $str16$_3, format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(third(col_union_parts)), UNPROVIDED)) });
                }
                Errors.error($str17$Invalid_NAT_being_converted_to_tr, cycl_term);
            }
            return NIL;
        }
        return string_utilities.make_valid_constant_name(kb_paths.fort_name(cycl_term), UNPROVIDED);
    }

    public static SubLObject term_classification_tree_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $term_classification_tree_mt$.getDynamicValue(thread);
    }

    public static SubLObject set_term_classification_tree_mt(final SubLObject mt) {
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        $term_classification_tree_mt$.setDynamicValue(mt);
        return term_classification_tree_mt();
    }

    public static SubLObject initialize_term_classification_tree(final SubLObject v_decision_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(v_decision_tree) : "Types.stringp(v_decision_tree) " + "CommonSymbols.NIL != Types.stringp(v_decision_tree) " + v_decision_tree;
        $term_classification_tree$.setDynamicValue(decision_tree.new_decision_tree_from_weka_j48_format(v_decision_tree), thread);
        return $term_classification_tree$.getDynamicValue(thread);
    }

    public static SubLObject reset_term_classification_tree() {
        $term_classification_tree$.setDynamicValue(NIL);
        $term_classification_tree_collections$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject clear_term_good_wrt_classification_treeP() {
        final SubLObject cs = $term_good_wrt_classification_treeP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_good_wrt_classification_treeP(final SubLObject v_term, final SubLObject v_decision_tree, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $term_classification_tree_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($term_good_wrt_classification_treeP_caching_state$.getGlobalValue(), list(v_term, v_decision_tree, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_good_wrt_classification_treeP_internal(final SubLObject v_term, final SubLObject v_decision_tree, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_term_p(v_term) : "cycl_grammar.cycl_term_p(v_term) " + "CommonSymbols.NIL != cycl_grammar.cycl_term_p(v_term) " + v_term;
        if (NIL == $term_classification_tree$.getDynamicValue(thread)) {
            initialize_term_classification_tree(v_decision_tree);
        }
        if (NIL == $term_classification_tree_collections$.getDynamicValue(thread)) {
            initialize_term_classification_tree_collections();
        }
        final SubLObject cols = $term_classification_tree_collections$.getDynamicValue(thread);
        final SubLObject isas = set_utilities.construct_set_from_list(isa.all_isa_among(v_term, cols, mt, UNPROVIDED), symbol_function(EQ), UNPROVIDED);
        final SubLObject quoted_isas = set_utilities.construct_set_from_list(NIL != term.hl_term_p(v_term) ? isa.all_quoted_isa_among(v_term, cols, mt, UNPROVIDED) : NIL, symbol_function(EQ), UNPROVIDED);
        final SubLObject v_genls = set_utilities.construct_set_from_list(NIL != term.el_fort_p(v_term) ? genls.all_genls_among(v_term, cols, mt, UNPROVIDED) : NIL, symbol_function(EQ), UNPROVIDED);
        SubLObject plist = NIL;
        SubLObject cdolist_list_var = cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject col_str = tree_term_from_constant(col);
            final SubLObject isa_property = make_keyword(Strings.string_upcase(cconcatenate($str1$ISA_, col_str), UNPROVIDED, UNPROVIDED));
            final SubLObject quoted_isa_property = make_keyword(Strings.string_upcase(cconcatenate($str2$QUOTEDISA_, col_str), UNPROVIDED, UNPROVIDED));
            final SubLObject genls_property = make_keyword(Strings.string_upcase(cconcatenate($str3$GENLS_, col_str), UNPROVIDED, UNPROVIDED));
            final SubLObject isa_value = (NIL != set.set_memberP(col, isas)) ? $T : $F;
            final SubLObject quoted_isa_value = (NIL != set.set_memberP(col, quoted_isas)) ? $T : $F;
            final SubLObject genls_value = (NIL != set.set_memberP(col, v_genls)) ? $T : $F;
            plist = putf(plist, isa_property, isa_value);
            plist = putf(plist, quoted_isa_property, quoted_isa_value);
            plist = putf(plist, genls_property, genls_value);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        final SubLObject pcase_var;
        final SubLObject evaluation = pcase_var = decision_tree.evaluate_decision_tree($term_classification_tree$.getDynamicValue(thread), plist);
        if (pcase_var.eql(GOOD)) {
            return T;
        }
        if (pcase_var.eql(BAD)) {
            return NIL;
        }
        return Errors.error($str30$Unexpected_term_classification_tr, evaluation);
    }

    public static SubLObject term_good_wrt_classification_treeP(final SubLObject v_term, final SubLObject v_decision_tree, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $term_classification_tree_mt$.getDynamicValue();
        }
        SubLObject caching_state = $term_good_wrt_classification_treeP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym24$TERM_GOOD_WRT_CLASSIFICATION_TREE_, $sym31$_TERM_GOOD_WRT_CLASSIFICATION_TREE__CACHING_STATE_, $int$5000, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym33$CLEAR_TERM_GOOD_WRT_CLASSIFICATION_TREE_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, v_decision_tree, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_decision_tree.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_good_wrt_classification_treeP_internal(v_term, v_decision_tree, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, v_decision_tree, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject declare_term_classification_tree_file() {
        declareFunction(me, "create_term_classification_tree_collections", "CREATE-TERM-CLASSIFICATION-TREE-COLLECTIONS", 1, 0, false);
        declareFunction(me, "initialize_term_classification_tree_collections", "INITIALIZE-TERM-CLASSIFICATION-TREE-COLLECTIONS", 0, 0, false);
        declareFunction(me, "constant_from_tree_term", "CONSTANT-FROM-TREE-TERM", 1, 0, false);
        declareFunction(me, "tree_term_from_constant", "TREE-TERM-FROM-CONSTANT", 1, 0, false);
        declareFunction(me, "term_classification_tree_mt", "TERM-CLASSIFICATION-TREE-MT", 0, 0, false);
        declareFunction(me, "set_term_classification_tree_mt", "SET-TERM-CLASSIFICATION-TREE-MT", 1, 0, false);
        declareFunction(me, "initialize_term_classification_tree", "INITIALIZE-TERM-CLASSIFICATION-TREE", 1, 0, false);
        declareFunction(me, "reset_term_classification_tree", "RESET-TERM-CLASSIFICATION-TREE", 0, 0, false);
        declareFunction(me, "clear_term_good_wrt_classification_treeP", "CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?", 0, 0, false);
        declareFunction(me, "remove_term_good_wrt_classification_treeP", "REMOVE-TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 1, false);
        declareFunction(me, "term_good_wrt_classification_treeP_internal", "TERM-GOOD-WRT-CLASSIFICATION-TREE?-INTERNAL", 3, 0, false);
        declareFunction(me, "term_good_wrt_classification_treeP", "TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_term_classification_tree_file() {
        defparameter("*TERM-CLASSIFICATION-TREE-COLLECTIONS*", NIL);
        defparameter("*TERM-CLASSIFICATION-TREE-MT*", $const18$CurrentWorldDataCollectorMt_NonHo);
        defparameter("*TERM-CLASSIFICATION-TREE*", NIL);
        deflexical("*TERM-GOOD-WRT-CLASSIFICATION-TREE?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_term_classification_tree_file() {
        register_external_symbol(TERM_CLASSIFICATION_TREE_MT);
        register_external_symbol(SET_TERM_CLASSIFICATION_TREE_MT);
        register_external_symbol(RESET_TERM_CLASSIFICATION_TREE);
        memoization_state.note_globally_cached_function($sym24$TERM_GOOD_WRT_CLASSIFICATION_TREE_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_term_classification_tree_file();
    }

    @Override
    public void initializeVariables() {
        init_term_classification_tree_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_term_classification_tree_file();
    }

    static {







































    }
}

/**
 * Total time: 93 ms
 */
