/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_extensional_set_p;
import static com.cyc.cycjava.cycl.el_utilities.extensional_set_elements;
import static com.cyc.cycjava.cycl.el_utilities.make_el_set;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      COLLECTION-INTERSECTION
 * source file: /cyc/top/cycl/inference/collection-intersection.lisp
 * created:     2019/07/03 17:37:48
 */
public final class collection_intersection extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new collection_intersection();

 public static final String myName = "com.cyc.cycjava.cycl.inference.collection_intersection";


    // defparameter
    // Definitions
    // Whether this support is enabled
    /**
     * Whether this support is enabled
     */
    @LispMethod(comment = "Whether this support is enabled\ndefparameter")
    private static final SubLSymbol $collection_intersection_genls_support_enabledP$ = makeSymbol("*COLLECTION-INTERSECTION-GENLS-SUPPORT-ENABLED?*");

    // deflexical
    /**
     * This would only ever need to be T if you were pasting this code into an older
     * image that didn't have the nart indexing bug fixed.
     */
    @LispMethod(comment = "This would only ever need to be T if you were pasting this code into an older\r\nimage that didn\'t have the nart indexing bug fixed.\ndeflexical\nThis would only ever need to be T if you were pasting this code into an older\nimage that didn\'t have the nart indexing bug fixed.")
    private static final SubLSymbol $nart_indexing_bug_workaround_enabledP$ = makeSymbol("*NART-INDEXING-BUG-WORKAROUND-ENABLED?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $collection_intersection_defining_mt$ = makeSymbol("*COLLECTION-INTERSECTION-DEFINING-MT*");

    // deflexical
    // The rule used to justify each collectionIntersection genl of ?SPEC
    /**
     * The rule used to justify each collectionIntersection genl of ?SPEC
     */
    @LispMethod(comment = "The rule used to justify each collectionIntersection genl of ?SPEC\ndeflexical")
    private static final SubLSymbol $collection_intersection_genls_rule$ = makeSymbol("*COLLECTION-INTERSECTION-GENLS-RULE*");

    // deflexical
    // The rule used to justify each spec of ?GENL
    /**
     * The rule used to justify each spec of ?GENL
     */
    @LispMethod(comment = "The rule used to justify each spec of ?GENL\ndeflexical")
    private static final SubLSymbol $collection_intersection_specs_rule$ = makeSymbol("*COLLECTION-INTERSECTION-SPECS-RULE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CYC_COLLECTION_INTERSECTION_AFTER_ADDING = makeSymbol("CYC-COLLECTION-INTERSECTION-AFTER-ADDING");

    private static final SubLSymbol CYC_COLLECTION_INTERSECTION_2_AFTER_ADDING = makeSymbol("CYC-COLLECTION-INTERSECTION-2-AFTER-ADDING");



    static private final SubLList $list3 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("MT"), makeSymbol("TV"));



    static private final SubLList $list6 = cons(makeSymbol("ASENT"), makeSymbol("ANY-MT-JUSTIFICATION"));

    static private final SubLString $str9$Computing___genls_between_collect = makeString("Computing #$genls between collection intersection narts...");

    private static final SubLString $$$cdolist = makeString("cdolist");



    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list13 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLString $str16$_A = makeString("~A");

    private static final SubLSymbol $sym17$VALID_NART_ = makeSymbol("VALID-NART?");



    private static final SubLSymbol $sym20$_NART = makeSymbol("?NART");

    private static final SubLString $str21$_s_did_not_contain_a_variable_nam = makeString("~s did not contain a variable named ?NART");



    private static final SubLList $list23 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLString $str24$Found__a_narts_for_a_total_of__a_ = makeString("Found ~a narts for a total of ~a pairs.~%");





    private static final SubLSymbol FULLY_BOUND_COLLECTION_INTERSECTION_NAT_P = makeSymbol("FULLY-BOUND-COLLECTION-INTERSECTION-NAT-P");

    private static final SubLSymbol COLLECTION_INTERSECTION_NART_P = makeSymbol("COLLECTION-INTERSECTION-NART-P");

    private static final SubLString $str31$Unexpected_collection_intersectio = makeString("Unexpected collection intersection nat ~s");

    private static final SubLList $list33 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("collectionIntersection"), makeSymbol("?SPEC"), makeSymbol("?SPEC-CONSTITUENT-COLS")), list(reader_make_constant_shell("collectionIntersection"), makeSymbol("?GENL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(reader_make_constant_shell("forAll"), makeSymbol("?GENL-CONSTIT-COL"), list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("elementOf"), makeSymbol("?GENL-CONSTIT-COL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(reader_make_constant_shell("thereExists"), makeSymbol("?SPEC-CONSTIT-COL"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("elementOf"), makeSymbol("?SPEC-CONSTIT-COL"), makeSymbol("?SPEC-CONSTITUENT-COLS")), list(reader_make_constant_shell("genls"), makeSymbol("?SPEC-CONSTIT-COL"), makeSymbol("?GENL-CONSTIT-COL"))))))), list(reader_make_constant_shell("genls"), makeSymbol("?SPEC"), makeSymbol("?GENL")));

    private static final SubLList $list34 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("collectionIntersection"), makeSymbol("?GENL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(reader_make_constant_shell("isa"), makeSymbol("?SPEC"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("forAll"), makeSymbol("?GENL-CONSTIT-COL"), list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("elementOf"), makeSymbol("?GENL-CONSTIT-COL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(reader_make_constant_shell("genls"), makeSymbol("?SPEC"), makeSymbol("?GENL-CONSTIT-COL"))))), list(reader_make_constant_shell("genls"), makeSymbol("?SPEC"), makeSymbol("?GENL")));



    private static final SubLSymbol JUSTIFY_COLLECTION_INTERSECTION_GENLS_ASENT = makeSymbol("JUSTIFY-COLLECTION-INTERSECTION-GENLS-ASENT");

    public static final SubLObject cyc_collection_intersection_after_adding_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $collection_intersection_genls_support_enabledP$.getDynamicValue(thread)) {
                {
                    SubLObject nart = assertions_high.gaf_arg1(assertion);
                    return com.cyc.cycjava.cycl.inference.collection_intersection.possibly_add_collection_intersection_nart(nart);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cyc_collection_intersection_after_adding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $collection_intersection_genls_support_enabledP$.getDynamicValue(thread)) {
            final SubLObject nart = assertions_high.gaf_arg1(assertion);
            return possibly_add_collection_intersection_nart(nart);
        }
        return NIL;
    }

    public static final SubLObject cyc_collection_intersection_2_after_adding_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $collection_intersection_genls_support_enabledP$.getDynamicValue(thread)) {
                {
                    SubLObject nart = assertions_high.gaf_arg1(assertion);
                    return com.cyc.cycjava.cycl.inference.collection_intersection.possibly_add_collection_intersection_nart(nart);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cyc_collection_intersection_2_after_adding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $collection_intersection_genls_support_enabledP$.getDynamicValue(thread)) {
            final SubLObject nart = assertions_high.gaf_arg1(assertion);
            return possibly_add_collection_intersection_nart(nart);
        }
        return NIL;
    }

    public static final SubLObject possibly_add_collection_intersection_nart_alt(SubLObject nart) {
        if (NIL != com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nart_p(nart)) {
            return com.cyc.cycjava.cycl.inference.collection_intersection.add_collection_intersection_nart(nart);
        }
        return NIL;
    }

    public static SubLObject possibly_add_collection_intersection_nart(final SubLObject nart) {
        if (NIL != collection_intersection_nart_p(nart)) {
            return add_collection_intersection_nart(nart);
        }
        return NIL;
    }

    public static final SubLObject add_collection_intersection_nart_alt(SubLObject nart) {
        com.cyc.cycjava.cycl.inference.collection_intersection.add_collection_intersection_nart_genls_links(nart);
        com.cyc.cycjava.cycl.inference.collection_intersection.add_collection_intersection_nart_specs_links(nart);
        return NIL;
    }

    public static SubLObject add_collection_intersection_nart(final SubLObject nart) {
        add_collection_intersection_nart_genls_links(nart);
        add_collection_intersection_nart_specs_links(nart);
        return NIL;
    }

    public static final SubLObject add_collection_intersection_nart_genls_links_alt(SubLObject spec_nart) {
        {
            SubLObject genls_narts = com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nat_max_proper_genls(spec_nart);
            SubLObject any_mt_justified_asents = com.cyc.cycjava.cycl.inference.collection_intersection.justify_collection_intersection_genls_narts(spec_nart, genls_narts, $$InferencePSC);
            return com.cyc.cycjava.cycl.inference.collection_intersection.add_collection_intersection_nart_genls_links_int(any_mt_justified_asents);
        }
    }

    public static SubLObject add_collection_intersection_nart_genls_links(final SubLObject spec_nart) {
        final SubLObject genls_narts = collection_intersection_nat_max_proper_genls(spec_nart);
        final SubLObject any_mt_justified_asents = justify_collection_intersection_genls_narts(spec_nart, genls_narts, $$InferencePSC);
        return add_collection_intersection_nart_genls_links_int(any_mt_justified_asents);
    }

    public static final SubLObject add_collection_intersection_nart_specs_links_alt(SubLObject genl_nart) {
        {
            SubLObject specs = com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nat_max_proper_specs(genl_nart);
            specs = list_utilities.fast_set_difference(specs, genls.all_specs(genl_nart, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            {
                SubLObject any_mt_justified_asents = com.cyc.cycjava.cycl.inference.collection_intersection.justify_collection_intersection_specs(specs, genl_nart, $$InferencePSC);
                return com.cyc.cycjava.cycl.inference.collection_intersection.add_collection_intersection_nart_genls_links_int(any_mt_justified_asents);
            }
        }
    }

    public static SubLObject add_collection_intersection_nart_specs_links(final SubLObject genl_nart) {
        SubLObject specs = collection_intersection_nat_max_proper_specs(genl_nart);
        specs = list_utilities.fast_set_difference(specs, genls.all_specs(genl_nart, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject any_mt_justified_asents = justify_collection_intersection_specs(specs, genl_nart, $$InferencePSC);
        return add_collection_intersection_nart_genls_links_int(any_mt_justified_asents);
    }

    public static final SubLObject add_collection_intersection_nart_genls_links_int_alt(SubLObject any_mt_justified_asents) {
        {
            SubLObject v_hl_supports = com.cyc.cycjava.cycl.inference.collection_intersection.compute_mt_placement_for_collection_intersection_genls_justified_asents(any_mt_justified_asents);
            SubLObject cdolist_list_var = v_hl_supports;
            SubLObject hl_support = NIL;
            for (hl_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_support = cdolist_list_var.first()) {
                {
                    SubLObject datum = hl_support;
                    SubLObject current = datum;
                    SubLObject hl_module = NIL;
                    SubLObject asent = NIL;
                    SubLObject mt = NIL;
                    SubLObject tv = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    hl_module = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    asent = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tv = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject mt_specific_justification = com.cyc.cycjava.cycl.inference.collection_intersection.compute_mt_specific_justification_for_collection_intersection_genls_asent(asent, mt);
                            com.cyc.cycjava.cycl.inference.collection_intersection.assert_collection_intersection_genls_link(asent, mt, mt_specific_justification);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt3);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject add_collection_intersection_nart_genls_links_int(final SubLObject any_mt_justified_asents) {
        SubLObject cdolist_list_var;
        final SubLObject v_hl_supports = cdolist_list_var = compute_mt_placement_for_collection_intersection_genls_justified_asents(any_mt_justified_asents);
        SubLObject hl_support = NIL;
        hl_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = hl_support;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject mt_specific_justification = compute_mt_specific_justification_for_collection_intersection_genls_asent(asent, mt);
                assert_collection_intersection_genls_link(asent, mt, mt_specific_justification);
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_support = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject compute_mt_specific_justification_for_collection_intersection_genls_asent_alt(SubLObject asent, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_specific_justification = NIL;
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
                            SubLObject mt_specific_justified_asent = com.cyc.cycjava.cycl.inference.collection_intersection.justify_collection_intersection_genls_asent(asent);
                            mt_specific_justification = mt_specific_justified_asent.rest();
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject items_var = com.cyc.cycjava.cycl.inference.collection_intersection.compute_more_supports_for_collection_intersection_genls_asent(asent);
                    if (items_var.isVector()) {
                        {
                            SubLObject vector_var = com.cyc.cycjava.cycl.inference.collection_intersection.compute_more_supports_for_collection_intersection_genls_asent(asent);
                            SubLObject backwardP_var = NIL;
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject item = aref(vector_var, element_num);
                                    mt_specific_justification = cons(item, mt_specific_justification);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.collection_intersection.compute_more_supports_for_collection_intersection_genls_asent(asent);
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                mt_specific_justification = cons(item, mt_specific_justification);
                            }
                        }
                    }
                }
                return nreverse(mt_specific_justification);
            }
        }
    }

    public static SubLObject compute_mt_specific_justification_for_collection_intersection_genls_asent(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_specific_justification = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject mt_specific_justified_asent = justify_collection_intersection_genls_asent(asent);
            mt_specific_justification = mt_specific_justified_asent.rest();
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        final SubLObject items_var = compute_more_supports_for_collection_intersection_genls_asent(asent);
        if (items_var.isVector()) {
            final SubLObject vector_var = items_var;
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject item;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                item = aref(vector_var, element_num);
                mt_specific_justification = cons(item, mt_specific_justification);
            }
        } else {
            SubLObject cdolist_list_var = items_var;
            SubLObject item2 = NIL;
            item2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                mt_specific_justification = cons(item2, mt_specific_justification);
                cdolist_list_var = cdolist_list_var.rest();
                item2 = cdolist_list_var.first();
            } 
        }
        return nreverse(mt_specific_justification);
    }

    public static final SubLObject compute_more_supports_for_collection_intersection_genls_asent_alt(SubLObject asent) {
        {
            SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject genl_cols = com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nat_collections(genl);
            SubLObject genl_cols_set = make_el_set(genl_cols, UNPROVIDED);
            SubLObject genl_ci_support = arguments.make_hl_support($CODE, list($$collectionIntersection, genl, genl_cols_set), $collection_intersection_defining_mt$.getGlobalValue(), UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.inference.collection_intersection.fully_bound_collection_intersection_nat_p(spec)) {
                {
                    SubLObject spec_cols = com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nat_collections(spec);
                    SubLObject spec_cols_set = make_el_set(spec_cols, UNPROVIDED);
                    return list(genl_ci_support, arguments.make_hl_support($CODE, list($$collectionIntersection, spec, spec_cols_set), $collection_intersection_defining_mt$.getGlobalValue(), UNPROVIDED), com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_genls_rule_support());
                }
            } else {
                return list(genl_ci_support, com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_specs_rule_support());
            }
        }
    }

    public static SubLObject compute_more_supports_for_collection_intersection_genls_asent(final SubLObject asent) {
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject genl_cols = collection_intersection_nat_collections(genl);
        final SubLObject genl_cols_set = make_el_set(genl_cols, UNPROVIDED);
        final SubLObject genl_ci_support = arguments.make_hl_support($CODE, list($$collectionIntersection, genl, genl_cols_set), $collection_intersection_defining_mt$.getGlobalValue(), UNPROVIDED);
        if (NIL != fully_bound_collection_intersection_nat_p(spec)) {
            final SubLObject spec_cols = collection_intersection_nat_collections(spec);
            final SubLObject spec_cols_set = make_el_set(spec_cols, UNPROVIDED);
            return list(genl_ci_support, arguments.make_hl_support($CODE, list($$collectionIntersection, spec, spec_cols_set), $collection_intersection_defining_mt$.getGlobalValue(), UNPROVIDED), collection_intersection_genls_rule_support());
        }
        return list(genl_ci_support, collection_intersection_specs_rule_support());
    }

    public static final SubLObject compute_mt_placement_for_collection_intersection_genls_justified_asents_alt(SubLObject any_mt_justified_asents) {
        {
            SubLObject v_hl_supports = NIL;
            SubLObject cdolist_list_var = any_mt_justified_asents;
            SubLObject any_mt_justified_asent = NIL;
            for (any_mt_justified_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , any_mt_justified_asent = cdolist_list_var.first()) {
                {
                    SubLObject datum = any_mt_justified_asent;
                    SubLObject current = datum;
                    SubLObject asent = NIL;
                    SubLObject any_mt_justification = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    asent = current.first();
                    current = current.rest();
                    any_mt_justification = current;
                    {
                        SubLObject mts = com.cyc.cycjava.cycl.inference.collection_intersection.max_floor_mts_of_genls_justification(any_mt_justification);
                        SubLObject cdolist_list_var_1 = mts;
                        SubLObject mt = NIL;
                        for (mt = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , mt = cdolist_list_var_1.first()) {
                            v_hl_supports = cons(arguments.make_hl_support($GENLS, asent, mt, UNPROVIDED), v_hl_supports);
                        }
                    }
                }
            }
            return com.cyc.cycjava.cycl.inference.collection_intersection.minimize_genls_hl_supports(v_hl_supports);
        }
    }

    public static SubLObject compute_mt_placement_for_collection_intersection_genls_justified_asents(final SubLObject any_mt_justified_asents) {
        SubLObject v_hl_supports = NIL;
        SubLObject cdolist_list_var = any_mt_justified_asents;
        SubLObject any_mt_justified_asent = NIL;
        any_mt_justified_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = any_mt_justified_asent;
            SubLObject asent = NIL;
            SubLObject any_mt_justification = NIL;
            destructuring_bind_must_consp(current, datum, $list6);
            asent = current.first();
            current = any_mt_justification = current.rest();
            SubLObject cdolist_list_var_$1;
            final SubLObject mts = cdolist_list_var_$1 = max_floor_mts_of_genls_justification(any_mt_justification);
            SubLObject mt = NIL;
            mt = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                v_hl_supports = cons(arguments.make_hl_support($GENLS, asent, mt, UNPROVIDED), v_hl_supports);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                mt = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            any_mt_justified_asent = cdolist_list_var.first();
        } 
        return minimize_genls_hl_supports(v_hl_supports);
    }

    /**
     * Eliminate redundant HL supports from HL-SUPPORTS.
     */
    @LispMethod(comment = "Eliminate redundant HL supports from HL-SUPPORTS.")
    public static final SubLObject minimize_genls_hl_supports_alt(SubLObject v_hl_supports) {
        return v_hl_supports;
    }

    /**
     * Eliminate redundant HL supports from HL-SUPPORTS.
     */
    @LispMethod(comment = "Eliminate redundant HL supports from HL-SUPPORTS.")
    public static SubLObject minimize_genls_hl_supports(final SubLObject v_hl_supports) {
        return v_hl_supports;
    }

    public static final SubLObject max_floor_mts_of_genls_justification_alt(SubLObject any_mt_justification) {
        {
            SubLObject mts = NIL;
            SubLObject cdolist_list_var = any_mt_justification;
            SubLObject hl_support = NIL;
            for (hl_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_support = cdolist_list_var.first()) {
                {
                    SubLObject datum = hl_support;
                    SubLObject current = datum;
                    SubLObject hl_module = NIL;
                    SubLObject asent = NIL;
                    SubLObject mt = NIL;
                    SubLObject tv = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    hl_module = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    asent = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tv = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                            SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                            SubLObject items_var = genls.max_floor_mts_of_genls_paths(spec, genl, UNPROVIDED);
                            if (items_var.isVector()) {
                                {
                                    SubLObject vector_var = genls.max_floor_mts_of_genls_paths(spec, genl, UNPROVIDED);
                                    SubLObject backwardP_var = NIL;
                                    SubLObject length = length(vector_var);
                                    SubLObject v_iteration = NIL;
                                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        {
                                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                            SubLObject item = aref(vector_var, element_num);
                                            mts = cons(item, mts);
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject cdolist_list_var_2 = genls.max_floor_mts_of_genls_paths(spec, genl, UNPROVIDED);
                                    SubLObject item = NIL;
                                    for (item = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , item = cdolist_list_var_2.first()) {
                                        mts = cons(item, mts);
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt3);
                    }
                }
            }
            return genl_mts.min_mts(mts, UNPROVIDED);
        }
    }

    public static SubLObject max_floor_mts_of_genls_justification(final SubLObject any_mt_justification) {
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = any_mt_justification;
        SubLObject hl_support = NIL;
        hl_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = hl_support;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                final SubLObject items_var = genls.max_floor_mts_of_genls_paths(spec, genl, UNPROVIDED);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        item = aref(vector_var, element_num);
                        mts = cons(item, mts);
                    }
                } else {
                    SubLObject cdolist_list_var_$2 = items_var;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        mts = cons(item2, mts);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        item2 = cdolist_list_var_$2.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_support = cdolist_list_var.first();
        } 
        return genl_mts.min_mts(mts, UNPROVIDED);
    }

    public static final SubLObject assert_collection_intersection_genls_link_alt(SubLObject asent, SubLObject mt, SubLObject justification) {
        {
            SubLObject deduction_spec = deductions_high.create_deduction_spec(justification);
            return hl_storage_modules.hl_add_argument(deduction_spec, clause_utilities.make_gaf_cnf(asent), mt, $FORWARD, UNPROVIDED);
        }
    }

    public static SubLObject assert_collection_intersection_genls_link(final SubLObject asent, final SubLObject mt, final SubLObject justification) {
        return hl_storage_modules.hl_add_deduction(clause_utilities.make_gaf_cnf(asent), mt, justification, $FORWARD, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject genls_collection_intersection_after_adding_int_alt(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $collection_intersection_genls_support_enabledP$.getDynamicValue(thread)) {
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(gaf));
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            {
                                SubLObject spec = assertions_high.gaf_arg1(gaf);
                                SubLObject genl = assertions_high.gaf_arg2(gaf);
                                SubLObject specs = genls.all_specs(spec, UNPROVIDED, UNPROVIDED);
                                SubLObject v_genls = genls.all_genls(genl, UNPROVIDED, UNPROVIDED);
                                SubLObject candidate_spec_narts = set.new_set(symbol_function(EQ), UNPROVIDED);
                                SubLObject candidate_genl_narts = set.new_set(symbol_function(EQ), UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var = specs;
                                    SubLObject candidate_spec = NIL;
                                    for (candidate_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_spec = cdolist_list_var.first()) {
                                        set_utilities.set_add_all(com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_narts_with_constituent_collection(candidate_spec), candidate_spec_narts);
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var = v_genls;
                                    SubLObject candidate_genl = NIL;
                                    for (candidate_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_genl = cdolist_list_var.first()) {
                                        set_utilities.set_add_all(com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_narts_with_constituent_collection(candidate_genl), candidate_genl_narts);
                                    }
                                }
                                com.cyc.cycjava.cycl.inference.collection_intersection.consider_all_combinations_for_genls_collection_intersection(set.set_element_list(candidate_spec_narts), set.set_element_list(candidate_genl_narts), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                {
                                    SubLObject set_contents_var = set.do_set_internal(candidate_genl_narts);
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject candidate_genl_nart = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, candidate_genl_nart)) {
                                                com.cyc.cycjava.cycl.inference.collection_intersection.add_collection_intersection_nart_specs_links(candidate_genl_nart);
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
            }
            return NIL;
        }
    }

    public static SubLObject genls_collection_intersection_after_adding_int(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $collection_intersection_genls_support_enabledP$.getDynamicValue(thread)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(gaf));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject spec = assertions_high.gaf_arg1(gaf);
                final SubLObject genl = assertions_high.gaf_arg2(gaf);
                final SubLObject specs = genls.all_specs(spec, UNPROVIDED, UNPROVIDED);
                final SubLObject v_genls = genls.all_genls(genl, UNPROVIDED, UNPROVIDED);
                final SubLObject candidate_spec_narts = set.new_set(symbol_function(EQL), UNPROVIDED);
                final SubLObject candidate_genl_narts = set.new_set(symbol_function(EQL), UNPROVIDED);
                SubLObject cdolist_list_var = specs;
                SubLObject candidate_spec = NIL;
                candidate_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    set_utilities.set_add_all(collection_intersection_narts_with_constituent_collection(candidate_spec), candidate_spec_narts);
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate_spec = cdolist_list_var.first();
                } 
                cdolist_list_var = v_genls;
                SubLObject candidate_genl = NIL;
                candidate_genl = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    set_utilities.set_add_all(collection_intersection_narts_with_constituent_collection(candidate_genl), candidate_genl_narts);
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate_genl = cdolist_list_var.first();
                } 
                consider_all_combinations_for_genls_collection_intersection(set.set_element_list(candidate_spec_narts), set.set_element_list(candidate_genl_narts), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject set_contents_var = set.do_set_internal(candidate_genl_narts);
                SubLObject basis_object;
                SubLObject state;
                SubLObject candidate_genl_nart;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    candidate_genl_nart = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, candidate_genl_nart)) {
                        add_collection_intersection_nart_specs_links(candidate_genl_nart);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject consider_all_combinations_for_genls_collection_intersection_alt(SubLObject candidate_spec_narts, SubLObject candidate_genl_narts, SubLObject show_progressP, SubLObject warn_on_errorsP, SubLObject skip_collection_intersection_fn_pairsP) {
        if (show_progressP == UNPROVIDED) {
            show_progressP = NIL;
        }
        if (warn_on_errorsP == UNPROVIDED) {
            warn_on_errorsP = NIL;
        }
        if (skip_collection_intersection_fn_pairsP == UNPROVIDED) {
            skip_collection_intersection_fn_pairsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                if (NIL != show_progressP) {
                    {
                        SubLObject list_var = candidate_spec_narts;
                        $progress_note$.setDynamicValue($str_alt9$Computing___genls_between_collect, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(length(list_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject candidate_spec_nart = NIL;
                                    for (candidate_spec_nart = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , candidate_spec_nart = csome_list_var.first()) {
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        count = add(count, com.cyc.cycjava.cycl.inference.collection_intersection.consider_all_genl_narts_for_genls_collection_intersection(candidate_spec_nart, candidate_genl_narts, warn_on_errorsP, skip_collection_intersection_fn_pairsP));
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = candidate_spec_narts;
                        SubLObject candidate_spec_nart = NIL;
                        for (candidate_spec_nart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_spec_nart = cdolist_list_var.first()) {
                            count = add(count, com.cyc.cycjava.cycl.inference.collection_intersection.consider_all_genl_narts_for_genls_collection_intersection(candidate_spec_nart, candidate_genl_narts, warn_on_errorsP, skip_collection_intersection_fn_pairsP));
                        }
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject consider_all_combinations_for_genls_collection_intersection(final SubLObject candidate_spec_narts, final SubLObject candidate_genl_narts, SubLObject show_progressP, SubLObject warn_on_errorsP, SubLObject skip_collection_intersection_fn_pairsP) {
        if (show_progressP == UNPROVIDED) {
            show_progressP = NIL;
        }
        if (warn_on_errorsP == UNPROVIDED) {
            warn_on_errorsP = NIL;
        }
        if (skip_collection_intersection_fn_pairsP == UNPROVIDED) {
            skip_collection_intersection_fn_pairsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        if (NIL != show_progressP) {
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str9$Computing___genls_between_collect, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(candidate_spec_narts), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = candidate_spec_narts;
                    SubLObject candidate_spec_nart = NIL;
                    candidate_spec_nart = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        count = add(count, consider_all_genl_narts_for_genls_collection_intersection(candidate_spec_nart, candidate_genl_narts, warn_on_errorsP, skip_collection_intersection_fn_pairsP));
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        candidate_spec_nart = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
        } else {
            SubLObject cdolist_list_var = candidate_spec_narts;
            SubLObject candidate_spec_nart2 = NIL;
            candidate_spec_nart2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                count = add(count, consider_all_genl_narts_for_genls_collection_intersection(candidate_spec_nart2, candidate_genl_narts, warn_on_errorsP, skip_collection_intersection_fn_pairsP));
                cdolist_list_var = cdolist_list_var.rest();
                candidate_spec_nart2 = cdolist_list_var.first();
            } 
        }
        return count;
    }

    public static final SubLObject consider_all_genl_narts_for_genls_collection_intersection_alt(SubLObject candidate_spec_nart, SubLObject candidate_genl_narts, SubLObject warn_on_errorsP, SubLObject skip_collection_intersection_fn_pairsP) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject all_genls_set = set_utilities.construct_set_from_list(genls.all_genls(candidate_spec_nart, UNPROVIDED, UNPROVIDED), symbol_function(EQ), UNPROVIDED);
            SubLObject cdolist_list_var = candidate_genl_narts;
            SubLObject candidate_genl_nart = NIL;
            for (candidate_genl_nart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_genl_nart = cdolist_list_var.first()) {
                if (candidate_spec_nart != candidate_genl_nart) {
                    if (NIL == set.set_memberP(candidate_genl_nart, all_genls_set)) {
                        if (!(((NIL != skip_collection_intersection_fn_pairsP) && (NIL != narts_high.nart_with_functor_p($$CollectionIntersectionFn, candidate_spec_nart))) && (NIL != narts_high.nart_with_functor_p($$CollectionIntersectionFn, candidate_genl_nart)))) {
                            {
                                SubLObject genlsP = NIL;
                                if (NIL != warn_on_errorsP) {
                                    {
                                        SubLObject message_var = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                                try {
                                                    bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                                    try {
                                                        genlsP = com.cyc.cycjava.cycl.inference.collection_intersection.genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt(candidate_spec_nart, candidate_genl_nart);
                                                    } catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    rebind(Errors.$error_handler$, _prev_bind_0);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                        }
                                        if (message_var.isString()) {
                                            Errors.warn($str_alt12$_A, message_var);
                                        }
                                    }
                                } else {
                                    genlsP = com.cyc.cycjava.cycl.inference.collection_intersection.genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt(candidate_spec_nart, candidate_genl_nart);
                                }
                                if (NIL != genlsP) {
                                    count = add(count, ONE_INTEGER);
                                    {
                                        SubLObject any_mt_justified_asents = NIL;
                                        if (NIL != warn_on_errorsP) {
                                            {
                                                SubLObject message_var = NIL;
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                                        try {
                                                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                                            try {
                                                                any_mt_justified_asents = com.cyc.cycjava.cycl.inference.collection_intersection.justify_collection_intersection_genls_link_in_any_mt(candidate_spec_nart, candidate_genl_nart);
                                                            } catch (Throwable catch_var) {
                                                                Errors.handleThrowable(catch_var, NIL);
                                                            }
                                                        } finally {
                                                            rebind(Errors.$error_handler$, _prev_bind_0);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                }
                                                if (message_var.isString()) {
                                                    Errors.warn($str_alt12$_A, message_var);
                                                }
                                            }
                                        } else {
                                            any_mt_justified_asents = com.cyc.cycjava.cycl.inference.collection_intersection.justify_collection_intersection_genls_link_in_any_mt(candidate_spec_nart, candidate_genl_nart);
                                        }
                                        if (NIL != warn_on_errorsP) {
                                            {
                                                SubLObject message_var = NIL;
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                                        try {
                                                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                                            try {
                                                                com.cyc.cycjava.cycl.inference.collection_intersection.add_collection_intersection_nart_genls_links_int(any_mt_justified_asents);
                                                            } catch (Throwable catch_var) {
                                                                Errors.handleThrowable(catch_var, NIL);
                                                            }
                                                        } finally {
                                                            rebind(Errors.$error_handler$, _prev_bind_0);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                }
                                                if (message_var.isString()) {
                                                    Errors.warn($str_alt12$_A, message_var);
                                                }
                                            }
                                        } else {
                                            com.cyc.cycjava.cycl.inference.collection_intersection.add_collection_intersection_nart_genls_links_int(any_mt_justified_asents);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return count;
        }
    }

    public static SubLObject consider_all_genl_narts_for_genls_collection_intersection(final SubLObject candidate_spec_nart, final SubLObject candidate_genl_narts, final SubLObject warn_on_errorsP, final SubLObject skip_collection_intersection_fn_pairsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject all_genls_set = set_utilities.construct_set_from_list(genls.all_genls(candidate_spec_nart, UNPROVIDED, UNPROVIDED), symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = candidate_genl_narts;
        SubLObject candidate_genl_nart = NIL;
        candidate_genl_nart = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((!candidate_spec_nart.eql(candidate_genl_nart)) && (NIL == set.set_memberP(candidate_genl_nart, all_genls_set))) && (((NIL == skip_collection_intersection_fn_pairsP) || (NIL == narts_high.nart_with_functor_p($$CollectionIntersectionFn, candidate_spec_nart))) || (NIL == narts_high.nart_with_functor_p($$CollectionIntersectionFn, candidate_genl_nart)))) {
                SubLObject genlsP = NIL;
                if (NIL != warn_on_errorsP) {
                    SubLObject message_var = NIL;
                    final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
                    eval($list13);
                    try {
                        try {
                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    genlsP = genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt(candidate_spec_nart, candidate_genl_nart);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                    if (message_var.isString()) {
                        Errors.warn($str16$_A, message_var);
                    }
                } else {
                    genlsP = genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt(candidate_spec_nart, candidate_genl_nart);
                }
                if (NIL != genlsP) {
                    count = add(count, ONE_INTEGER);
                    SubLObject any_mt_justified_asents = NIL;
                    if (NIL != warn_on_errorsP) {
                        SubLObject message_var2 = NIL;
                        final SubLObject was_appendingP2 = eval($append_stack_traces_to_error_messagesP$);
                        eval($list13);
                        try {
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        any_mt_justified_asents = justify_collection_intersection_genls_link_in_any_mt(candidate_spec_nart, candidate_genl_nart);
                                    } catch (final Throwable catch_var2) {
                                        Errors.handleThrowable(catch_var2, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_3, thread);
                                }
                            } catch (final Throwable ccatch_env_var2) {
                                message_var2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                        } finally {
                            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP2));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                            }
                        }
                        if (message_var2.isString()) {
                            Errors.warn($str16$_A, message_var2);
                        }
                    } else {
                        any_mt_justified_asents = justify_collection_intersection_genls_link_in_any_mt(candidate_spec_nart, candidate_genl_nart);
                    }
                    if (NIL != warn_on_errorsP) {
                        SubLObject message_var2 = NIL;
                        final SubLObject was_appendingP2 = eval($append_stack_traces_to_error_messagesP$);
                        eval($list13);
                        try {
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        add_collection_intersection_nart_genls_links_int(any_mt_justified_asents);
                                    } catch (final Throwable catch_var2) {
                                        Errors.handleThrowable(catch_var2, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_3, thread);
                                }
                            } catch (final Throwable ccatch_env_var2) {
                                message_var2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                        } finally {
                            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP2));
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                            }
                        }
                        if (message_var2.isString()) {
                            Errors.warn($str16$_A, message_var2);
                        }
                    } else {
                        add_collection_intersection_nart_genls_links_int(any_mt_justified_asents);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_genl_nart = cdolist_list_var.first();
        } 
        return count;
    }

    public static final SubLObject collection_intersection_genls_sweep_part_1_alt(SubLObject warn_on_errorsP) {
        if (warn_on_errorsP == UNPROVIDED) {
            warn_on_errorsP = T;
        }
        {
            SubLObject narts = list_utilities.remove_if_not($sym13$VALID_NART_, Mapping.mapcar(symbol_function(GAF_ARG1), kb_mapping.gather_function_extent_index($$CollectionIntersectionFn)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.inference.collection_intersection.consider_all_combinations_for_genls_collection_intersection(narts, narts, T, warn_on_errorsP, NIL);
        }
    }

    public static SubLObject collection_intersection_genls_sweep_part_1(SubLObject warn_on_errorsP) {
        if (warn_on_errorsP == UNPROVIDED) {
            warn_on_errorsP = T;
        }
        final SubLObject narts = list_utilities.remove_if_not($sym17$VALID_NART_, Mapping.mapcar(symbol_function(GAF_ARG1), kb_mapping.gather_function_extent_index($$CollectionIntersectionFn)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return consider_all_combinations_for_genls_collection_intersection(narts, narts, T, warn_on_errorsP, NIL);
    }

    public static final SubLObject collection_intersection_genls_sweep_part_2_alt(SubLObject warn_on_errorsP) {
        if (warn_on_errorsP == UNPROVIDED) {
            warn_on_errorsP = T;
        }
        {
            SubLObject narts = list_utilities.remove_if_not($sym13$VALID_NART_, Mapping.mapcar(symbol_function(GAF_ARG1), append(kb_mapping.gather_function_extent_index($$CollectionIntersectionFn), kb_mapping.gather_function_extent_index($$CollectionIntersection2Fn))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.inference.collection_intersection.consider_all_combinations_for_genls_collection_intersection(narts, narts, T, warn_on_errorsP, T);
        }
    }

    public static SubLObject collection_intersection_genls_sweep_part_2(SubLObject warn_on_errorsP) {
        if (warn_on_errorsP == UNPROVIDED) {
            warn_on_errorsP = T;
        }
        final SubLObject narts = list_utilities.remove_if_not($sym17$VALID_NART_, Mapping.mapcar(symbol_function(GAF_ARG1), append(kb_mapping.gather_function_extent_index($$CollectionIntersectionFn), kb_mapping.gather_function_extent_index($$CollectionIntersection2Fn))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return consider_all_combinations_for_genls_collection_intersection(narts, narts, T, warn_on_errorsP, T);
    }

    public static final SubLObject collection_intersection_genls_sweep_by_query_alt(SubLObject cycl_query, SubLObject warn_on_errorsP) {
        if (warn_on_errorsP == UNPROVIDED) {
            warn_on_errorsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == list_utilities.tree_find($sym16$_NART, cycl_query, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt17$_s_did_not_contain_a_variable_nam, cycl_query);
                }
            }
            {
                SubLObject narts = list_utilities.remove_if_not($sym13$VALID_NART_, ask_utilities.query_variable($sym16$_NART, cycl_query, $$EverythingPSC, $list_alt19), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject count = length(narts);
                format_nil.force_format(T, $str_alt20$Found__a_narts_for_a_total_of__a_, count, expt(count, TWO_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return com.cyc.cycjava.cycl.inference.collection_intersection.consider_all_combinations_for_genls_collection_intersection(narts, narts, T, warn_on_errorsP, NIL);
            }
        }
    }

    public static SubLObject collection_intersection_genls_sweep_by_query(final SubLObject cycl_query, SubLObject warn_on_errorsP) {
        if (warn_on_errorsP == UNPROVIDED) {
            warn_on_errorsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.tree_find($sym20$_NART, cycl_query, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str21$_s_did_not_contain_a_variable_nam, cycl_query);
        }
        final SubLObject narts = list_utilities.remove_if_not($sym17$VALID_NART_, ask_utilities.query_variable($sym20$_NART, cycl_query, $$EverythingPSC, $list23), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject count = length(narts);
        format_nil.force_format(T, $str24$Found__a_narts_for_a_total_of__a_, count, expt(count, TWO_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return consider_all_combinations_for_genls_collection_intersection(narts, narts, T, warn_on_errorsP, NIL);
    }

    /**
     * We manifest all the genls in #$InferencePSC but then do the minimization in #$UniversalVocabularyMt to be conservative
     */
    @LispMethod(comment = "We manifest all the genls in #$InferencePSC but then do the minimization in #$UniversalVocabularyMt to be conservative")
    public static final SubLObject collection_intersection_nat_max_proper_genls_alt(SubLObject spec_nat) {
        return genls.min_cols(com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nat_proper_genls(spec_nat, $$InferencePSC), $$UniversalVocabularyMt, UNPROVIDED);
    }

    /**
     * We manifest all the genls in #$InferencePSC but then do the minimization in #$UniversalVocabularyMt to be conservative
     */
    @LispMethod(comment = "We manifest all the genls in #$InferencePSC but then do the minimization in #$UniversalVocabularyMt to be conservative")
    public static SubLObject collection_intersection_nat_max_proper_genls(final SubLObject spec_nat) {
        return genls.min_cols(collection_intersection_nat_proper_genls(spec_nat, $$InferencePSC), $$UniversalVocabularyMt, UNPROVIDED);
    }

    /**
     * Returns all the proper genls of SPEC-NAT that are collection intersection narts.
     * Say for example we want to find all the genls of (#$CollectionIntersectionFn (#$TheSet (#$CitizenFn #$Israel) #$HumanAdult #$Bass-Singer)).
     * The only tricky genls to find are other #$CollectionIntersectionFn nats, for instance (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Bass-Singer))
     * or (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Male #$Singer)), assuming such nats are already reified.  Obviously we can't return
     * not-yet-reified nats because there would be an explosive if not infinite number of them.
     * So we first obtain the candidate collections as follows.  We take each of the collections (#$CitizenFn #$Israel), #$HumanAdult, and #$Bass-Singer,
     * and add all its genls to a set.  This is the set of 'candidate collections'.  Any collection intersection nart that is a genl of SPEC-NAT
     * must have at least one candidate collection as one of its constituents.  So now we perform a syntactic indexing step.
     * For each candidate collection, we use indexing to obtain all collection intersection narts that mention that collection.
     * These narts are added to a new set called the 'candidate narts'.  Then each candidate nart is tested to see if it is really a genl of SPEC-NAT,
     * using the same internals as the fully bound removal module for #$genls collection intersection.
     */
    @LispMethod(comment = "Returns all the proper genls of SPEC-NAT that are collection intersection narts.\r\nSay for example we want to find all the genls of (#$CollectionIntersectionFn (#$TheSet (#$CitizenFn #$Israel) #$HumanAdult #$Bass-Singer)).\r\nThe only tricky genls to find are other #$CollectionIntersectionFn nats, for instance (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Bass-Singer))\r\nor (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Male #$Singer)), assuming such nats are already reified.  Obviously we can\'t return\r\nnot-yet-reified nats because there would be an explosive if not infinite number of them.\r\nSo we first obtain the candidate collections as follows.  We take each of the collections (#$CitizenFn #$Israel), #$HumanAdult, and #$Bass-Singer,\r\nand add all its genls to a set.  This is the set of \'candidate collections\'.  Any collection intersection nart that is a genl of SPEC-NAT\r\nmust have at least one candidate collection as one of its constituents.  So now we perform a syntactic indexing step.\r\nFor each candidate collection, we use indexing to obtain all collection intersection narts that mention that collection.\r\nThese narts are added to a new set called the \'candidate narts\'.  Then each candidate nart is tested to see if it is really a genl of SPEC-NAT,\r\nusing the same internals as the fully bound removal module for #$genls collection intersection.\nReturns all the proper genls of SPEC-NAT that are collection intersection narts.\nSay for example we want to find all the genls of (#$CollectionIntersectionFn (#$TheSet (#$CitizenFn #$Israel) #$HumanAdult #$Bass-Singer)).\nThe only tricky genls to find are other #$CollectionIntersectionFn nats, for instance (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Bass-Singer))\nor (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Male #$Singer)), assuming such nats are already reified.  Obviously we can\'t return\nnot-yet-reified nats because there would be an explosive if not infinite number of them.\nSo we first obtain the candidate collections as follows.  We take each of the collections (#$CitizenFn #$Israel), #$HumanAdult, and #$Bass-Singer,\nand add all its genls to a set.  This is the set of \'candidate collections\'.  Any collection intersection nart that is a genl of SPEC-NAT\nmust have at least one candidate collection as one of its constituents.  So now we perform a syntactic indexing step.\nFor each candidate collection, we use indexing to obtain all collection intersection narts that mention that collection.\nThese narts are added to a new set called the \'candidate narts\'.  Then each candidate nart is tested to see if it is really a genl of SPEC-NAT,\nusing the same internals as the fully bound removal module for #$genls collection intersection.")
    public static final SubLObject collection_intersection_nat_proper_genls_alt(SubLObject spec_nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject constituent_cols = com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nat_collections(spec_nat);
                            SubLObject candidate_collections = genls.union_all_genls(constituent_cols, UNPROVIDED, UNPROVIDED);
                            SubLObject candidate_narts = set.new_set(symbol_function(EQ), UNPROVIDED);
                            SubLObject cdolist_list_var = candidate_collections;
                            SubLObject candidate_col = NIL;
                            for (candidate_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_col = cdolist_list_var.first()) {
                                set_utilities.set_add_all(com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_narts_with_constituent_collection(candidate_col), candidate_narts);
                            }
                            {
                                SubLObject set_contents_var = set.do_set_internal(candidate_narts);
                                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                SubLObject state = NIL;
                                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    {
                                        SubLObject candidate_nart = set_contents.do_set_contents_next(basis_object, state);
                                        if (NIL != set_contents.do_set_contents_element_validP(state, candidate_nart)) {
                                            {
                                                SubLObject candidate_nat = (NIL != nart_handles.nart_p(spec_nat)) ? ((SubLObject) (candidate_nart)) : narts_high.nart_hl_formula(candidate_nart);
                                                if (!candidate_nat.equal(spec_nat)) {
                                                    if (NIL != com.cyc.cycjava.cycl.inference.collection_intersection.genls_collection_intersection_fn_collection_intersection_fn_pos_check(spec_nat, candidate_nart)) {
                                                        result = cons(candidate_nart, result);
                                                    }
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
                return result;
            }
        }
    }

    /**
     * Returns all the proper genls of SPEC-NAT that are collection intersection narts.
     * Say for example we want to find all the genls of (#$CollectionIntersectionFn (#$TheSet (#$CitizenFn #$Israel) #$HumanAdult #$Bass-Singer)).
     * The only tricky genls to find are other #$CollectionIntersectionFn nats, for instance (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Bass-Singer))
     * or (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Male #$Singer)), assuming such nats are already reified.  Obviously we can't return
     * not-yet-reified nats because there would be an explosive if not infinite number of them.
     * So we first obtain the candidate collections as follows.  We take each of the collections (#$CitizenFn #$Israel), #$HumanAdult, and #$Bass-Singer,
     * and add all its genls to a set.  This is the set of 'candidate collections'.  Any collection intersection nart that is a genl of SPEC-NAT
     * must have at least one candidate collection as one of its constituents.  So now we perform a syntactic indexing step.
     * For each candidate collection, we use indexing to obtain all collection intersection narts that mention that collection.
     * These narts are added to a new set called the 'candidate narts'.  Then each candidate nart is tested to see if it is really a genl of SPEC-NAT,
     * using the same internals as the fully bound removal module for #$genls collection intersection.
     */
    @LispMethod(comment = "Returns all the proper genls of SPEC-NAT that are collection intersection narts.\r\nSay for example we want to find all the genls of (#$CollectionIntersectionFn (#$TheSet (#$CitizenFn #$Israel) #$HumanAdult #$Bass-Singer)).\r\nThe only tricky genls to find are other #$CollectionIntersectionFn nats, for instance (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Bass-Singer))\r\nor (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Male #$Singer)), assuming such nats are already reified.  Obviously we can\'t return\r\nnot-yet-reified nats because there would be an explosive if not infinite number of them.\r\nSo we first obtain the candidate collections as follows.  We take each of the collections (#$CitizenFn #$Israel), #$HumanAdult, and #$Bass-Singer,\r\nand add all its genls to a set.  This is the set of \'candidate collections\'.  Any collection intersection nart that is a genl of SPEC-NAT\r\nmust have at least one candidate collection as one of its constituents.  So now we perform a syntactic indexing step.\r\nFor each candidate collection, we use indexing to obtain all collection intersection narts that mention that collection.\r\nThese narts are added to a new set called the \'candidate narts\'.  Then each candidate nart is tested to see if it is really a genl of SPEC-NAT,\r\nusing the same internals as the fully bound removal module for #$genls collection intersection.\nReturns all the proper genls of SPEC-NAT that are collection intersection narts.\nSay for example we want to find all the genls of (#$CollectionIntersectionFn (#$TheSet (#$CitizenFn #$Israel) #$HumanAdult #$Bass-Singer)).\nThe only tricky genls to find are other #$CollectionIntersectionFn nats, for instance (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Bass-Singer))\nor (#$CollectionIntersectionFn (#$TheSet #$HumanAdult #$Male #$Singer)), assuming such nats are already reified.  Obviously we can\'t return\nnot-yet-reified nats because there would be an explosive if not infinite number of them.\nSo we first obtain the candidate collections as follows.  We take each of the collections (#$CitizenFn #$Israel), #$HumanAdult, and #$Bass-Singer,\nand add all its genls to a set.  This is the set of \'candidate collections\'.  Any collection intersection nart that is a genl of SPEC-NAT\nmust have at least one candidate collection as one of its constituents.  So now we perform a syntactic indexing step.\nFor each candidate collection, we use indexing to obtain all collection intersection narts that mention that collection.\nThese narts are added to a new set called the \'candidate narts\'.  Then each candidate nart is tested to see if it is really a genl of SPEC-NAT,\nusing the same internals as the fully bound removal module for #$genls collection intersection.")
    public static SubLObject collection_intersection_nat_proper_genls(final SubLObject spec_nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject constituent_cols = collection_intersection_nat_collections(spec_nat);
            final SubLObject candidate_collections = genls.union_all_genls(constituent_cols, UNPROVIDED, UNPROVIDED);
            final SubLObject candidate_narts = set.new_set(symbol_function(EQL), UNPROVIDED);
            SubLObject cdolist_list_var = candidate_collections;
            SubLObject candidate_col = NIL;
            candidate_col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set_utilities.set_add_all(collection_intersection_narts_with_constituent_collection(candidate_col), candidate_narts);
                cdolist_list_var = cdolist_list_var.rest();
                candidate_col = cdolist_list_var.first();
            } 
            final SubLObject set_contents_var = set.do_set_internal(candidate_narts);
            SubLObject basis_object;
            SubLObject state;
            SubLObject candidate_nart;
            SubLObject candidate_nat;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                candidate_nart = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, candidate_nart)) {
                    candidate_nat = (NIL != nart_handles.nart_p(spec_nat)) ? candidate_nart : narts_high.nart_hl_formula(candidate_nart);
                    if ((!candidate_nat.equal(spec_nat)) && (NIL != genls_collection_intersection_fn_collection_intersection_fn_pos_check(spec_nat, candidate_nart))) {
                        result = cons(candidate_nart, result);
                    }
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * We manifest all the specs in #$InferencePSC but then do the minimization in #$UniversalVocabularyMt to be conservative
     */
    @LispMethod(comment = "We manifest all the specs in #$InferencePSC but then do the minimization in #$UniversalVocabularyMt to be conservative")
    public static final SubLObject collection_intersection_nat_max_proper_specs_alt(SubLObject genl_nat) {
        return genls.max_cols(com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nat_proper_specs(genl_nat, $$InferencePSC), $$UniversalVocabularyMt, UNPROVIDED);
    }

    /**
     * We manifest all the specs in #$InferencePSC but then do the minimization in #$UniversalVocabularyMt to be conservative
     */
    @LispMethod(comment = "We manifest all the specs in #$InferencePSC but then do the minimization in #$UniversalVocabularyMt to be conservative")
    public static SubLObject collection_intersection_nat_max_proper_specs(final SubLObject genl_nat) {
        return genls.max_cols(collection_intersection_nat_proper_specs(genl_nat, $$InferencePSC), $$UniversalVocabularyMt, UNPROVIDED);
    }

    /**
     * Returns all the proper specs of GENL-NAT.
     * The algorithm is much simpler -- it just computes the common specs of the constituent collections of GENL-NAT.
     */
    @LispMethod(comment = "Returns all the proper specs of GENL-NAT.\r\nThe algorithm is much simpler -- it just computes the common specs of the constituent collections of GENL-NAT.\nReturns all the proper specs of GENL-NAT.\nThe algorithm is much simpler -- it just computes the common specs of the constituent collections of GENL-NAT.")
    public static final SubLObject collection_intersection_nat_proper_specs_alt(SubLObject genl_nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject constituent_cols = com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nat_collections(genl_nat);
                            SubLObject candidate_collections = genls.all_common_specs(constituent_cols, UNPROVIDED, UNPROVIDED);
                            result = delete(genl_nat, candidate_collections, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns all the proper specs of GENL-NAT.
     * The algorithm is much simpler -- it just computes the common specs of the constituent collections of GENL-NAT.
     */
    @LispMethod(comment = "Returns all the proper specs of GENL-NAT.\r\nThe algorithm is much simpler -- it just computes the common specs of the constituent collections of GENL-NAT.\nReturns all the proper specs of GENL-NAT.\nThe algorithm is much simpler -- it just computes the common specs of the constituent collections of GENL-NAT.")
    public static SubLObject collection_intersection_nat_proper_specs(final SubLObject genl_nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject constituent_cols = collection_intersection_nat_collections(genl_nat);
            final SubLObject candidate_collections = genls.all_common_specs(constituent_cols, UNPROVIDED, UNPROVIDED);
            result = delete(genl_nat, candidate_collections, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Uses indexing to gather a list of collection intersection narts with COL as one of their constituent collections.
     */
    @LispMethod(comment = "Uses indexing to gather a list of collection intersection narts with COL as one of their constituent collections.")
    public static final SubLObject collection_intersection_narts_with_constituent_collection_alt(SubLObject col) {
        return nconc(com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_2_fn_narts_with_constituent_collection(col), com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_fn_narts_with_constituent_collection(col));
    }

    /**
     * Uses indexing to gather a list of collection intersection narts with COL as one of their constituent collections.
     */
    @LispMethod(comment = "Uses indexing to gather a list of collection intersection narts with COL as one of their constituent collections.")
    public static SubLObject collection_intersection_narts_with_constituent_collection(final SubLObject col) {
        return nconc(collection_intersection_2_fn_narts_with_constituent_collection(col), collection_intersection_fn_narts_with_constituent_collection(col));
    }

    /**
     * Assumes that there are no ill-formed sets (multisets) in the KB.
     */
    @LispMethod(comment = "Assumes that there are no ill-formed sets (multisets) in the KB.")
    public static final SubLObject collection_intersection_2_fn_narts_with_constituent_collection_alt(SubLObject col) {
        {
            SubLObject narts = NIL;
            if (NIL != $nart_indexing_bug_workaround_enabledP$.getGlobalValue()) {
                if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(col, ONE_INTEGER, $$CollectionIntersection2Fn)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(col, ONE_INTEGER, $$CollectionIntersection2Fn);
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
                                                SubLObject done_var_3 = NIL;
                                                SubLObject token_var_4 = NIL;
                                                while (NIL == done_var_3) {
                                                    {
                                                        SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                        SubLObject valid_5 = makeBoolean(token_var_4 != tou_gaf);
                                                        if (NIL != valid_5) {
                                                            narts = cons(assertions_high.gaf_arg1(tou_gaf), narts);
                                                        }
                                                        done_var_3 = makeBoolean(NIL == valid_5);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
                if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(col, TWO_INTEGER, $$CollectionIntersection2Fn)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(col, TWO_INTEGER, $$CollectionIntersection2Fn);
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
                                                SubLObject done_var_6 = NIL;
                                                SubLObject token_var_7 = NIL;
                                                while (NIL == done_var_6) {
                                                    {
                                                        SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_7);
                                                        SubLObject valid_8 = makeBoolean(token_var_7 != tou_gaf);
                                                        if (NIL != valid_8) {
                                                            narts = cons(assertions_high.gaf_arg1(tou_gaf), narts);
                                                        }
                                                        done_var_6 = makeBoolean(NIL == valid_8);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            } else {
                if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(col, NIL, $$CollectionIntersection2Fn)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(col, NIL, $$CollectionIntersection2Fn);
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
                                                SubLObject done_var_9 = NIL;
                                                SubLObject token_var_10 = NIL;
                                                while (NIL == done_var_9) {
                                                    {
                                                        SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                        SubLObject valid_11 = makeBoolean(token_var_10 != tou_gaf);
                                                        if (NIL != valid_11) {
                                                            narts = cons(assertions_high.gaf_arg1(tou_gaf), narts);
                                                        }
                                                        done_var_9 = makeBoolean(NIL == valid_11);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            return nreverse(list_utilities.remove_if_not($sym13$VALID_NART_, narts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    /**
     * Assumes that there are no ill-formed sets (multisets) in the KB.
     */
    @LispMethod(comment = "Assumes that there are no ill-formed sets (multisets) in the KB.")
    public static SubLObject collection_intersection_2_fn_narts_with_constituent_collection(final SubLObject col) {
        SubLObject narts = NIL;
        if (NIL != $nart_indexing_bug_workaround_enabledP$.getGlobalValue()) {
            if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(col, ONE_INTEGER, $$CollectionIntersection2Fn)) {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(col, ONE_INTEGER, $$CollectionIntersection2Fn);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$4 = NIL;
                            final SubLObject token_var_$5 = NIL;
                            while (NIL == done_var_$4) {
                                final SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(tou_gaf));
                                if (NIL != valid_$6) {
                                    narts = cons(assertions_high.gaf_arg1(tou_gaf), narts);
                                }
                                done_var_$4 = makeBoolean(NIL == valid_$6);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(col, TWO_INTEGER, $$CollectionIntersection2Fn)) {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(col, TWO_INTEGER, $$CollectionIntersection2Fn);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$5 = NIL;
                            final SubLObject token_var_$6 = NIL;
                            while (NIL == done_var_$5) {
                                final SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(tou_gaf));
                                if (NIL != valid_$7) {
                                    narts = cons(assertions_high.gaf_arg1(tou_gaf), narts);
                                }
                                done_var_$5 = makeBoolean(NIL == valid_$7);
                            } 
                        } finally {
                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } else
            if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(col, NIL, $$CollectionIntersection2Fn)) {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(col, NIL, $$CollectionIntersection2Fn);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$6 = NIL;
                            final SubLObject token_var_$7 = NIL;
                            while (NIL == done_var_$6) {
                                final SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(tou_gaf));
                                if (NIL != valid_$8) {
                                    narts = cons(assertions_high.gaf_arg1(tou_gaf), narts);
                                }
                                done_var_$6 = makeBoolean(NIL == valid_$8);
                            } 
                        } finally {
                            final SubLObject _prev_bind_3 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values3 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values3);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_3);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }

        return nreverse(list_utilities.remove_if_not($sym17$VALID_NART_, narts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject collection_intersection_fn_narts_with_constituent_collection_alt(SubLObject col) {
        {
            SubLObject narts = NIL;
            if (NIL != kb_mapping_macros.do_other_index_key_validator(col, $GAF)) {
                {
                    SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec(col);
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        {
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                {
                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                    SubLObject valid = makeBoolean(token_var != gaf);
                                    if (NIL != valid) {
                                        if (NIL != kb_mapping_macros.do_other_index_assertion_match_p(gaf)) {
                                            if (NIL != assertion_utilities.gaf_assertion_with_pred_p(gaf, $$termOfUnit)) {
                                                {
                                                    SubLObject nart = assertions_high.gaf_arg1(gaf);
                                                    if (NIL != com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nart_p(nart)) {
                                                        narts = cons(nart, narts);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            } 
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            return nreverse(narts);
        }
    }

    public static SubLObject collection_intersection_fn_narts_with_constituent_collection(final SubLObject col) {
        SubLObject narts = NIL;
        if (NIL != kb_mapping_macros.do_other_index_key_validator(col, $GAF)) {
            final SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec(col);
            SubLObject final_index_iterator = NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(gaf));
                    if (((NIL != valid) && (NIL != kb_mapping_macros.do_other_index_assertion_match_p(gaf))) && (NIL != assertion_utilities.gaf_assertion_with_pred_p(gaf, $$termOfUnit))) {
                        final SubLObject nart = assertions_high.gaf_arg1(gaf);
                        if (NIL != collection_intersection_nart_p(nart)) {
                            narts = cons(nart, narts);
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != final_index_iterator) {
                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return nreverse(narts);
    }

    public static final SubLObject fully_bound_collection_intersection_nat_p_alt(SubLObject v_object) {
        if (NIL != nart_handles.nart_p(v_object)) {
            return com.cyc.cycjava.cycl.inference.collection_intersection.fully_bound_collection_intersection_nat_formula_p(narts_high.nart_hl_formula(v_object));
        } else {
            if ((NIL != possibly_naut_p(v_object)) && (NIL != variables.fully_bound_p(v_object))) {
                return com.cyc.cycjava.cycl.inference.collection_intersection.fully_bound_collection_intersection_nat_formula_p(v_object);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject fully_bound_collection_intersection_nat_p(final SubLObject v_object) {
        if (NIL != nart_handles.nart_p(v_object)) {
            return fully_bound_collection_intersection_nat_formula_p(narts_high.nart_hl_formula(v_object));
        }
        if ((NIL != possibly_naut_p(v_object)) && (NIL != variables.fully_bound_p(v_object))) {
            return fully_bound_collection_intersection_nat_formula_p(v_object);
        }
        return NIL;
    }

    public static final SubLObject collection_intersection_nart_p_alt(SubLObject v_object) {
        if (NIL != nart_handles.valid_nartP(v_object, UNPROVIDED)) {
            {
                SubLObject formula = narts_high.nart_hl_formula(v_object);
                return com.cyc.cycjava.cycl.inference.collection_intersection.fully_bound_collection_intersection_nat_formula_p(formula);
            }
        }
        return NIL;
    }

    public static SubLObject collection_intersection_nart_p(final SubLObject v_object) {
        if (NIL != nart_handles.valid_nartP(v_object, UNPROVIDED)) {
            final SubLObject formula = narts_high.nart_hl_formula(v_object);
            return fully_bound_collection_intersection_nat_formula_p(formula);
        }
        return NIL;
    }

    public static final SubLObject fully_bound_collection_intersection_nat_formula_p_alt(SubLObject formula) {
        {
            SubLObject functor = cycl_utilities.formula_operator(formula);
            SubLObject pcase_var = functor;
            if (pcase_var.eql($$CollectionIntersectionFn)) {
                return el_extensional_set_p(cycl_utilities.formula_arg1(formula, UNPROVIDED));
            } else {
                if (pcase_var.eql($$CollectionIntersection2Fn)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject fully_bound_collection_intersection_nat_formula_p(final SubLObject formula) {
        final SubLObject pcase_var;
        final SubLObject functor = pcase_var = cycl_utilities.formula_operator(formula);
        if (pcase_var.eql($$CollectionIntersectionFn)) {
            return el_extensional_set_p(cycl_utilities.formula_arg1(formula, UNPROVIDED));
        }
        if (pcase_var.eql($$CollectionIntersection2Fn)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject collection_intersection_nat_collections_alt(SubLObject nat) {
        {
            SubLObject functor = cycl_utilities.nat_functor(nat);
            SubLObject pcase_var = functor;
            if (pcase_var.eql($$CollectionIntersectionFn)) {
                return extensional_set_elements(cycl_utilities.nat_arg1(nat, UNPROVIDED));
            } else {
                if (pcase_var.eql($$CollectionIntersection2Fn)) {
                    return cycl_utilities.nat_args(nat, UNPROVIDED);
                } else {
                    return Errors.error($str_alt27$Unexpected_collection_intersectio, nat);
                }
            }
        }
    }

    public static SubLObject collection_intersection_nat_collections(final SubLObject nat) {
        final SubLObject pcase_var;
        final SubLObject functor = pcase_var = cycl_utilities.nat_functor(nat);
        if (pcase_var.eql($$CollectionIntersectionFn)) {
            return extensional_set_elements(cycl_utilities.nat_arg1(nat, UNPROVIDED));
        }
        if (pcase_var.eql($$CollectionIntersection2Fn)) {
            return cycl_utilities.nat_args(nat, UNPROVIDED);
        }
        return Errors.error($str31$Unexpected_collection_intersectio, nat);
    }

    /**
     * If TERM is a collection intersection nat, returns its constituent collections,
     * otherwise just returns the singleton list of TERM.
     */
    @LispMethod(comment = "If TERM is a collection intersection nat, returns its constituent collections,\r\notherwise just returns the singleton list of TERM.\nIf TERM is a collection intersection nat, returns its constituent collections,\notherwise just returns the singleton list of TERM.")
    public static final SubLObject term_constituent_collections_alt(SubLObject v_term) {
        return NIL != com.cyc.cycjava.cycl.inference.collection_intersection.fully_bound_collection_intersection_nat_formula_p(v_term) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nat_collections(v_term))) : list(v_term);
    }

    @LispMethod(comment = "If TERM is a collection intersection nat, returns its constituent collections,\r\notherwise just returns the singleton list of TERM.\nIf TERM is a collection intersection nat, returns its constituent collections,\notherwise just returns the singleton list of TERM.")
    public static SubLObject term_constituent_collections(final SubLObject v_term) {
        return NIL != fully_bound_collection_intersection_nat_formula_p(v_term) ? collection_intersection_nat_collections(v_term) : list(v_term);
    }/**
     * If TERM is a collection intersection nat, returns its constituent collections,
     * otherwise just returns the singleton list of TERM.
     */


    public static final SubLObject genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt_alt(SubLObject spec_nat, SubLObject genl_nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject genlsP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        genlsP = com.cyc.cycjava.cycl.inference.collection_intersection.genls_collection_intersection_fn_collection_intersection_fn_pos_check(spec_nat, genl_nat);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return genlsP;
            }
        }
    }

    public static SubLObject genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt(final SubLObject spec_nat, final SubLObject genl_nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject genlsP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            genlsP = genls_collection_intersection_fn_collection_intersection_fn_pos_check(spec_nat, genl_nat);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return genlsP;
    }

    public static final SubLObject genls_collection_intersection_fn_collection_intersection_fn_pos_check_alt(SubLObject spec_nat, SubLObject genl_nat) {
        {
            SubLObject spec_cols = com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nat_collections(spec_nat);
            SubLObject genl_cols = com.cyc.cycjava.cycl.inference.collection_intersection.collection_intersection_nat_collections(genl_nat);
            return com.cyc.cycjava.cycl.inference.collection_intersection.genls_collection_intersection_fn_pos_check(spec_cols, genl_cols);
        }
    }

    public static SubLObject genls_collection_intersection_fn_collection_intersection_fn_pos_check(final SubLObject spec_nat, final SubLObject genl_nat) {
        final SubLObject spec_cols = collection_intersection_nat_collections(spec_nat);
        final SubLObject genl_cols = collection_intersection_nat_collections(genl_nat);
        return genls_collection_intersection_fn_pos_check(spec_cols, genl_cols);
    }

    public static final SubLObject genls_collection_intersection_fn_pos_check_alt(SubLObject spec_cols, SubLObject genl_cols) {
        return list_utilities.fast_subsetP(genl_cols, genls.union_all_genls(spec_cols, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL));
    }

    public static SubLObject genls_collection_intersection_fn_pos_check(final SubLObject spec_cols, final SubLObject genl_cols) {
        return list_utilities.fast_subsetP(genl_cols, genls.union_all_genls(spec_cols, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL));
    }

    public static final SubLObject collection_intersection_genls_rule_support_alt() {
        return arguments.make_hl_support($CODE, $collection_intersection_genls_rule$.getGlobalValue(), $collection_intersection_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject collection_intersection_genls_rule_support() {
        return arguments.make_hl_support($CODE, $collection_intersection_genls_rule$.getGlobalValue(), $collection_intersection_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static final SubLObject collection_intersection_specs_rule_support_alt() {
        return arguments.make_hl_support($CODE, $collection_intersection_specs_rule$.getGlobalValue(), $collection_intersection_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject collection_intersection_specs_rule_support() {
        return arguments.make_hl_support($CODE, $collection_intersection_specs_rule$.getGlobalValue(), $collection_intersection_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static final SubLObject justify_collection_intersection_genls_narts_alt(SubLObject spec, SubLObject v_genls, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject justified_asents = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject genls_asents = NIL;
                            SubLObject cdolist_list_var = v_genls;
                            SubLObject genl = NIL;
                            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                genls_asents = cons(list($$genls, spec, genl), genls_asents);
                            }
                            justified_asents = Mapping.mapcar(JUSTIFY_COLLECTION_INTERSECTION_GENLS_ASENT, nreverse(genls_asents));
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return justified_asents;
            }
        }
    }

    public static SubLObject justify_collection_intersection_genls_narts(final SubLObject spec, final SubLObject v_genls, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justified_asents = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject genls_asents = NIL;
            SubLObject cdolist_list_var = v_genls;
            SubLObject genl = NIL;
            genl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                genls_asents = cons(list($$genls, spec, genl), genls_asents);
                cdolist_list_var = cdolist_list_var.rest();
                genl = cdolist_list_var.first();
            } 
            justified_asents = Mapping.mapcar(JUSTIFY_COLLECTION_INTERSECTION_GENLS_ASENT, nreverse(genls_asents));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return justified_asents;
    }

    public static final SubLObject justify_collection_intersection_specs_alt(SubLObject specs, SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject justified_asents = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject genls_asents = NIL;
                            SubLObject cdolist_list_var = specs;
                            SubLObject spec = NIL;
                            for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                                genls_asents = cons(list($$genls, spec, genl), genls_asents);
                            }
                            justified_asents = Mapping.mapcar(JUSTIFY_COLLECTION_INTERSECTION_GENLS_ASENT, nreverse(genls_asents));
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return justified_asents;
            }
        }
    }

    public static SubLObject justify_collection_intersection_specs(final SubLObject specs, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justified_asents = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject genls_asents = NIL;
            SubLObject cdolist_list_var = specs;
            SubLObject spec = NIL;
            spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                genls_asents = cons(list($$genls, spec, genl), genls_asents);
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            } 
            justified_asents = Mapping.mapcar(JUSTIFY_COLLECTION_INTERSECTION_GENLS_ASENT, nreverse(genls_asents));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return justified_asents;
    }

    public static final SubLObject justify_collection_intersection_genls_link_in_any_mt_alt(SubLObject spec_nart, SubLObject genl_nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        result = list(com.cyc.cycjava.cycl.inference.collection_intersection.justify_collection_intersection_genls_asent(list($$genls, spec_nart, genl_nart)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject justify_collection_intersection_genls_link_in_any_mt(final SubLObject spec_nart, final SubLObject genl_nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            result = list(justify_collection_intersection_genls_asent(list($$genls, spec_nart, genl_nart)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject justify_collection_intersection_genls_asent_alt(SubLObject genls_asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject spec = cycl_utilities.formula_arg1(genls_asent, UNPROVIDED);
                SubLObject genl = cycl_utilities.formula_arg2(genls_asent, UNPROVIDED);
                SubLObject spec_cols = com.cyc.cycjava.cycl.inference.collection_intersection.term_constituent_collections(spec);
                SubLObject genl_cols = com.cyc.cycjava.cycl.inference.collection_intersection.term_constituent_collections(genl);
                SubLObject genls_asents = com.cyc.cycjava.cycl.inference.collection_intersection.why_genls_collection_intersection_fn(spec_cols, genl_cols);
                SubLObject v_hl_supports = NIL;
                SubLObject cdolist_list_var = genls_asents;
                SubLObject asent = NIL;
                for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                    v_hl_supports = cons(arguments.make_hl_support($GENLS, asent, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED), v_hl_supports);
                }
                {
                    SubLObject justified_asent = cons(genls_asent, nreverse(v_hl_supports));
                    return justified_asent;
                }
            }
        }
    }

    public static SubLObject justify_collection_intersection_genls_asent(final SubLObject genls_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spec = cycl_utilities.formula_arg1(genls_asent, UNPROVIDED);
        final SubLObject genl = cycl_utilities.formula_arg2(genls_asent, UNPROVIDED);
        final SubLObject spec_cols = term_constituent_collections(spec);
        final SubLObject genl_cols = term_constituent_collections(genl);
        final SubLObject genls_asents = why_genls_collection_intersection_fn(spec_cols, genl_cols);
        SubLObject v_hl_supports = NIL;
        SubLObject cdolist_list_var = genls_asents;
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_hl_supports = cons(arguments.make_hl_support($GENLS, asent, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED), v_hl_supports);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        final SubLObject justified_asent = cons(genls_asent, nreverse(v_hl_supports));
        return justified_asent;
    }

    public static final SubLObject why_genls_collection_intersection_fn_alt(SubLObject spec_cols, SubLObject genl_cols) {
        {
            SubLObject genls_asents = NIL;
            SubLObject cdolist_list_var = genl_cols;
            SubLObject genl = NIL;
            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                {
                    SubLObject done_with_this_genl_colP = NIL;
                    SubLObject low_mt_genls_asent = NIL;
                    if (NIL == done_with_this_genl_colP) {
                        {
                            SubLObject csome_list_var = spec_cols;
                            SubLObject spec = NIL;
                            for (spec = csome_list_var.first(); !((NIL != done_with_this_genl_colP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , spec = csome_list_var.first()) {
                                if (NIL != genls.genlsP(spec, genl, UNPROVIDED, UNPROVIDED)) {
                                    if ((NIL != mt_relevance_macros.any_mt_is_relevantP()) && (NIL == genls.genlsP(spec, genl, $$UniversalVocabularyMt, UNPROVIDED))) {
                                        low_mt_genls_asent = list($$genls, spec, genl);
                                    } else {
                                        genls_asents = cons(list($$genls, spec, genl), genls_asents);
                                        done_with_this_genl_colP = T;
                                    }
                                }
                            }
                        }
                    }
                    if ((NIL != low_mt_genls_asent) && (NIL == done_with_this_genl_colP)) {
                        genls_asents = cons(low_mt_genls_asent, genls_asents);
                    }
                }
            }
            return nreverse(genls_asents);
        }
    }

    public static SubLObject why_genls_collection_intersection_fn(final SubLObject spec_cols, final SubLObject genl_cols) {
        SubLObject genls_asents = NIL;
        SubLObject cdolist_list_var = genl_cols;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject done_with_this_genl_colP = NIL;
            SubLObject low_mt_genls_asent = NIL;
            if (NIL == done_with_this_genl_colP) {
                SubLObject csome_list_var = spec_cols;
                SubLObject spec = NIL;
                spec = csome_list_var.first();
                while ((NIL == done_with_this_genl_colP) && (NIL != csome_list_var)) {
                    if (NIL != genls.genlsP(spec, genl, UNPROVIDED, UNPROVIDED)) {
                        if ((NIL != mt_relevance_macros.any_mt_is_relevantP()) && (NIL == genls.genlsP(spec, genl, $$UniversalVocabularyMt, UNPROVIDED))) {
                            low_mt_genls_asent = list($$genls, spec, genl);
                        } else {
                            genls_asents = cons(list($$genls, spec, genl), genls_asents);
                            done_with_this_genl_colP = T;
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    spec = csome_list_var.first();
                } 
            }
            if ((NIL != low_mt_genls_asent) && (NIL == done_with_this_genl_colP)) {
                genls_asents = cons(low_mt_genls_asent, genls_asents);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return nreverse(genls_asents);
    }

    public static SubLObject declare_collection_intersection_file() {
        declareFunction("cyc_collection_intersection_after_adding", "CYC-COLLECTION-INTERSECTION-AFTER-ADDING", 2, 0, false);
        declareFunction("cyc_collection_intersection_2_after_adding", "CYC-COLLECTION-INTERSECTION-2-AFTER-ADDING", 2, 0, false);
        declareFunction("possibly_add_collection_intersection_nart", "POSSIBLY-ADD-COLLECTION-INTERSECTION-NART", 1, 0, false);
        declareFunction("add_collection_intersection_nart", "ADD-COLLECTION-INTERSECTION-NART", 1, 0, false);
        declareFunction("add_collection_intersection_nart_genls_links", "ADD-COLLECTION-INTERSECTION-NART-GENLS-LINKS", 1, 0, false);
        declareFunction("add_collection_intersection_nart_specs_links", "ADD-COLLECTION-INTERSECTION-NART-SPECS-LINKS", 1, 0, false);
        declareFunction("add_collection_intersection_nart_genls_links_int", "ADD-COLLECTION-INTERSECTION-NART-GENLS-LINKS-INT", 1, 0, false);
        declareFunction("compute_mt_specific_justification_for_collection_intersection_genls_asent", "COMPUTE-MT-SPECIFIC-JUSTIFICATION-FOR-COLLECTION-INTERSECTION-GENLS-ASENT", 2, 0, false);
        declareFunction("compute_more_supports_for_collection_intersection_genls_asent", "COMPUTE-MORE-SUPPORTS-FOR-COLLECTION-INTERSECTION-GENLS-ASENT", 1, 0, false);
        declareFunction("compute_mt_placement_for_collection_intersection_genls_justified_asents", "COMPUTE-MT-PLACEMENT-FOR-COLLECTION-INTERSECTION-GENLS-JUSTIFIED-ASENTS", 1, 0, false);
        declareFunction("minimize_genls_hl_supports", "MINIMIZE-GENLS-HL-SUPPORTS", 1, 0, false);
        declareFunction("max_floor_mts_of_genls_justification", "MAX-FLOOR-MTS-OF-GENLS-JUSTIFICATION", 1, 0, false);
        declareFunction("assert_collection_intersection_genls_link", "ASSERT-COLLECTION-INTERSECTION-GENLS-LINK", 3, 0, false);
        declareFunction("genls_collection_intersection_after_adding_int", "GENLS-COLLECTION-INTERSECTION-AFTER-ADDING-INT", 1, 0, false);
        declareFunction("consider_all_combinations_for_genls_collection_intersection", "CONSIDER-ALL-COMBINATIONS-FOR-GENLS-COLLECTION-INTERSECTION", 2, 3, false);
        declareFunction("consider_all_genl_narts_for_genls_collection_intersection", "CONSIDER-ALL-GENL-NARTS-FOR-GENLS-COLLECTION-INTERSECTION", 4, 0, false);
        declareFunction("collection_intersection_genls_sweep_part_1", "COLLECTION-INTERSECTION-GENLS-SWEEP-PART-1", 0, 1, false);
        declareFunction("collection_intersection_genls_sweep_part_2", "COLLECTION-INTERSECTION-GENLS-SWEEP-PART-2", 0, 1, false);
        declareFunction("collection_intersection_genls_sweep_by_query", "COLLECTION-INTERSECTION-GENLS-SWEEP-BY-QUERY", 1, 1, false);
        declareFunction("collection_intersection_nat_max_proper_genls", "COLLECTION-INTERSECTION-NAT-MAX-PROPER-GENLS", 1, 0, false);
        declareFunction("collection_intersection_nat_proper_genls", "COLLECTION-INTERSECTION-NAT-PROPER-GENLS", 1, 1, false);
        declareFunction("collection_intersection_nat_max_proper_specs", "COLLECTION-INTERSECTION-NAT-MAX-PROPER-SPECS", 1, 0, false);
        declareFunction("collection_intersection_nat_proper_specs", "COLLECTION-INTERSECTION-NAT-PROPER-SPECS", 1, 1, false);
        declareFunction("collection_intersection_narts_with_constituent_collection", "COLLECTION-INTERSECTION-NARTS-WITH-CONSTITUENT-COLLECTION", 1, 0, false);
        declareFunction("collection_intersection_2_fn_narts_with_constituent_collection", "COLLECTION-INTERSECTION-2-FN-NARTS-WITH-CONSTITUENT-COLLECTION", 1, 0, false);
        declareFunction("collection_intersection_fn_narts_with_constituent_collection", "COLLECTION-INTERSECTION-FN-NARTS-WITH-CONSTITUENT-COLLECTION", 1, 0, false);
        declareFunction("fully_bound_collection_intersection_nat_p", "FULLY-BOUND-COLLECTION-INTERSECTION-NAT-P", 1, 0, false);
        declareFunction("collection_intersection_nart_p", "COLLECTION-INTERSECTION-NART-P", 1, 0, false);
        declareFunction("fully_bound_collection_intersection_nat_formula_p", "FULLY-BOUND-COLLECTION-INTERSECTION-NAT-FORMULA-P", 1, 0, false);
        declareFunction("collection_intersection_nat_collections", "COLLECTION-INTERSECTION-NAT-COLLECTIONS", 1, 0, false);
        declareFunction("term_constituent_collections", "TERM-CONSTITUENT-COLLECTIONS", 1, 0, false);
        declareFunction("genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt", "GENLS-COLLECTION-INTERSECTION-FN-COLLECTION-INTERSECTION-FN-POS-CHECK-IN-ANY-MT", 2, 0, false);
        declareFunction("genls_collection_intersection_fn_collection_intersection_fn_pos_check", "GENLS-COLLECTION-INTERSECTION-FN-COLLECTION-INTERSECTION-FN-POS-CHECK", 2, 0, false);
        declareFunction("genls_collection_intersection_fn_pos_check", "GENLS-COLLECTION-INTERSECTION-FN-POS-CHECK", 2, 0, false);
        declareFunction("collection_intersection_genls_rule_support", "COLLECTION-INTERSECTION-GENLS-RULE-SUPPORT", 0, 0, false);
        declareFunction("collection_intersection_specs_rule_support", "COLLECTION-INTERSECTION-SPECS-RULE-SUPPORT", 0, 0, false);
        declareFunction("justify_collection_intersection_genls_narts", "JUSTIFY-COLLECTION-INTERSECTION-GENLS-NARTS", 2, 1, false);
        declareFunction("justify_collection_intersection_specs", "JUSTIFY-COLLECTION-INTERSECTION-SPECS", 2, 1, false);
        declareFunction("justify_collection_intersection_genls_link_in_any_mt", "JUSTIFY-COLLECTION-INTERSECTION-GENLS-LINK-IN-ANY-MT", 2, 0, false);
        declareFunction("justify_collection_intersection_genls_asent", "JUSTIFY-COLLECTION-INTERSECTION-GENLS-ASENT", 1, 0, false);
        declareFunction("why_genls_collection_intersection_fn", "WHY-GENLS-COLLECTION-INTERSECTION-FN", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_collection_intersection_file_alt() {
        defparameter("*COLLECTION-INTERSECTION-GENLS-SUPPORT-ENABLED?*", NIL);
        deflexical("*NART-INDEXING-BUG-WORKAROUND-ENABLED?*", NIL);
        deflexical("*COLLECTION-INTERSECTION-DEFINING-MT*", $$UniversalVocabularyMt);
        deflexical("*COLLECTION-INTERSECTION-GENLS-RULE*", $list_alt29);
        deflexical("*COLLECTION-INTERSECTION-SPECS-RULE*", $list_alt30);
        return NIL;
    }

    public static SubLObject init_collection_intersection_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*COLLECTION-INTERSECTION-GENLS-SUPPORT-ENABLED?*", NIL);
            deflexical("*NART-INDEXING-BUG-WORKAROUND-ENABLED?*", NIL);
            deflexical("*COLLECTION-INTERSECTION-DEFINING-MT*", $$UniversalVocabularyMt);
            deflexical("*COLLECTION-INTERSECTION-GENLS-RULE*", $list33);
            deflexical("*COLLECTION-INTERSECTION-SPECS-RULE*", $list34);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*COLLECTION-INTERSECTION-GENLS-RULE*", $list_alt29);
            deflexical("*COLLECTION-INTERSECTION-SPECS-RULE*", $list_alt30);
        }
        return NIL;
    }

    public static SubLObject init_collection_intersection_file_Previous() {
        defparameter("*COLLECTION-INTERSECTION-GENLS-SUPPORT-ENABLED?*", NIL);
        deflexical("*NART-INDEXING-BUG-WORKAROUND-ENABLED?*", NIL);
        deflexical("*COLLECTION-INTERSECTION-DEFINING-MT*", $$UniversalVocabularyMt);
        deflexical("*COLLECTION-INTERSECTION-GENLS-RULE*", $list33);
        deflexical("*COLLECTION-INTERSECTION-SPECS-RULE*", $list34);
        return NIL;
    }

    public static SubLObject setup_collection_intersection_file() {
        register_kb_function(CYC_COLLECTION_INTERSECTION_AFTER_ADDING);
        register_kb_function(CYC_COLLECTION_INTERSECTION_2_AFTER_ADDING);
        note_funcall_helper_function(FULLY_BOUND_COLLECTION_INTERSECTION_NAT_P);
        note_funcall_helper_function(COLLECTION_INTERSECTION_NART_P);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_collection_intersection_file();
    }

    @Override
    public void initializeVariables() {
        init_collection_intersection_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_collection_intersection_file();
    }

    

    static private final SubLList $list_alt3 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLList $list_alt6 = cons(makeSymbol("ASENT"), makeSymbol("ANY-MT-JUSTIFICATION"));

    static private final SubLString $str_alt9$Computing___genls_between_collect = makeString("Computing #$genls between collection intersection narts...");

    static private final SubLString $str_alt12$_A = makeString("~A");

    static private final SubLSymbol $sym13$VALID_NART_ = makeSymbol("VALID-NART?");

    static private final SubLSymbol $sym16$_NART = makeSymbol("?NART");

    static private final SubLString $str_alt17$_s_did_not_contain_a_variable_nam = makeString("~s did not contain a variable named ?NART");

    static private final SubLList $list_alt19 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    static private final SubLString $str_alt20$Found__a_narts_for_a_total_of__a_ = makeString("Found ~a narts for a total of ~a pairs.~%");

    static private final SubLString $str_alt27$Unexpected_collection_intersectio = makeString("Unexpected collection intersection nat ~s");

    static private final SubLList $list_alt29 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("collectionIntersection"), makeSymbol("?SPEC"), makeSymbol("?SPEC-CONSTITUENT-COLS")), list(reader_make_constant_shell("collectionIntersection"), makeSymbol("?GENL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(reader_make_constant_shell("forAll"), makeSymbol("?GENL-CONSTIT-COL"), list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("elementOf"), makeSymbol("?GENL-CONSTIT-COL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(reader_make_constant_shell("thereExists"), makeSymbol("?SPEC-CONSTIT-COL"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("elementOf"), makeSymbol("?SPEC-CONSTIT-COL"), makeSymbol("?SPEC-CONSTITUENT-COLS")), list(reader_make_constant_shell("genls"), makeSymbol("?SPEC-CONSTIT-COL"), makeSymbol("?GENL-CONSTIT-COL"))))))), list(reader_make_constant_shell("genls"), makeSymbol("?SPEC"), makeSymbol("?GENL")));

    static private final SubLList $list_alt30 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("collectionIntersection"), makeSymbol("?GENL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(reader_make_constant_shell("isa"), makeSymbol("?SPEC"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("forAll"), makeSymbol("?GENL-CONSTIT-COL"), list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("elementOf"), makeSymbol("?GENL-CONSTIT-COL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(reader_make_constant_shell("genls"), makeSymbol("?SPEC"), makeSymbol("?GENL-CONSTIT-COL"))))), list(reader_make_constant_shell("genls"), makeSymbol("?SPEC"), makeSymbol("?GENL")));
}

/**
 * Total time: 429 ms
 */
