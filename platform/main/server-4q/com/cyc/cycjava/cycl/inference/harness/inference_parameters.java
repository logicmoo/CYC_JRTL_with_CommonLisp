package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_alist;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.proof_view;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.modules.transformation_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inference_parameters extends SubLTranslatedFile {
    public static final SubLFile me = new inference_parameters();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_parameters";

    public static final String myFingerPrint = "e5b9b94ec29269dddbc0da7cbbafa4c9115167d6bd9980415cdfff340c9ad69e";

    // deflexical
    /**
     * The query properties (and some others) to be gathered for inference answer
     * strongest query property value.
     */
    private static final SubLSymbol $gather_inference_answer_query_properties$ = makeSymbol("*GATHER-INFERENCE-ANSWER-QUERY-PROPERTIES*");

    // deflexical
    /**
     * The boolean query properties which should be included when two sets of query
     * properties are merged if it happens to be present in in either set.
     */
    private static final SubLSymbol $boolean_query_properties_to_include_on_merge$ = makeSymbol("*BOOLEAN-QUERY-PROPERTIES-TO-INCLUDE-ON-MERGE*");

    // deflexical
    /**
     * The query properties (and some others) to be gathered for inference answer
     * strongest query property value.
     */
    private static final SubLSymbol $query_properties_efficiency_hierarchy$ = makeSymbol("*QUERY-PROPERTIES-EFFICIENCY-HIERARCHY*");

    // deflexical
    /**
     * The query properties which have numeric values. For all of these, the lower
     * the value, the better the efficiency
     */
    private static final SubLSymbol $numeric_query_properties$ = makeSymbol("*NUMERIC-QUERY-PROPERTIES*");

    // deflexical
    /**
     * The numeric query properties that have a maximum value of :positive-infinity
     * instead of dwimming NIL
     */
    private static final SubLSymbol $numeric_query_properties_that_max_out_at_positive_infinity$ = makeSymbol("*NUMERIC-QUERY-PROPERTIES-THAT-MAX-OUT-AT-POSITIVE-INFINITY*");

    // deflexical
    /**
     * Query properties computed by @xref
     * inference-answer-compute-inference-answer-query-properties-int that should
     * override the values in PROOF-PROPERTIES.
     */
    private static final SubLSymbol $proof_query_properties_to_override$ = makeSymbol("*PROOF-QUERY-PROPERTIES-TO-OVERRIDE*");

    // deflexical
    // triq-4-clusters-15
    private static final SubLSymbol $inference_mode_query_properties_table$ = makeSymbol("*INFERENCE-MODE-QUERY-PROPERTIES-TABLE*");



    private static final SubLSymbol $kw1$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));







    public static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("BINDINGS"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PRODUCTIVITY-LIMIT") });

    public static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?") });

    public static final SubLList $list8 = list(new SubLObject[]{ list(makeKeyword("ABDUCTION-ALLOWED?"), NIL, T), list(makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), NIL, T), list(makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), NIL, T), list(makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, T), list(makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, T), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T, NIL), list(makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, T), list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("EL")), list(makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), T, NIL), list(makeKeyword("EVALUATE-SUBL-ALLOWED?"), NIL, T), list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("SHALLOW"), makeKeyword("EXTENDED"), makeKeyword("MAXIMAL"), makeKeyword("CUSTOM")), list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("NONE"), makeKeyword("MINIMAL"), makeKeyword("ARG-TYPE"), makeKeyword("ALL")), list(makeKeyword("NEGATION-BY-FAILURE?"), T, NIL), list(makeKeyword("NEW-TERMS-ALLOWED?"), NIL, T), list(makeKeyword("REWRITE-ALLOWED?"), NIL, T), list(makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, T), list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("FOCUSED"), makeKeyword("ALL")) });



    public static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PRODUCTIVITY-LIMIT") });

    public static final SubLList $list11 = list(makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));

    public static final SubLString $str12$Invalid_value_for_the_properties_ = makeString("Invalid value for the properties ~a : ~a");

    public static final SubLString $str13$unexpected_property__s = makeString("unexpected property ~s");





    public static final SubLList $list16 = list(makeKeyword("MAX-TIME"), ZERO_INTEGER);

    public static final SubLList $list17 = cons(makeSymbol("FIRST"), makeSymbol("REST"));



    private static final SubLSymbol $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");





    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);





    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");



    private static final SubLFloat $float$1_1 = makeDouble(1.1);

    private static final SubLSymbol $kw29$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");







    public static final SubLList $list33 = list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("BINDINGS"));





    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $kw37$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    private static final SubLSymbol $kw38$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw39$REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");

    private static final SubLSymbol $kw40$ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");

    private static final SubLSymbol $kw41$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $TRANS_ISA_POS = makeKeyword("TRANS-ISA-POS");

    private static final SubLSymbol $kw43$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $REMOVAL_TVA_UNIFY_CLOSURE = makeKeyword("REMOVAL-TVA-UNIFY-CLOSURE");

    private static final SubLSymbol $TRANSITIVE_CLOSURE_MODE = makeKeyword("TRANSITIVE-CLOSURE-MODE");

    private static final SubLSymbol $kw46$EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");

    private static final SubLSymbol $kw47$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");



    private static final SubLSymbol $kw49$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");



    private static final SubLSymbol $kw51$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");

    private static final SubLSymbol $kw52$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    private static final SubLList $list54 = cons(makeSymbol("PROPERTY"), makeSymbol("HIERARCHY"));

    private static final SubLSymbol $sym55$QUERY_PROPERTIES_MORE_EFFICIENT_ = makeSymbol("QUERY-PROPERTIES-MORE-EFFICIENT?");

    private static final SubLSymbol $sym56$QUERY_PROPERTIES_LESS_EFFICIENT_ = makeSymbol("QUERY-PROPERTIES-LESS-EFFICIENT?");

    private static final SubLList $list57 = list(list(new SubLObject[]{ makeKeyword("MINIMAL"), makeKeyword("NEW-TERMS-ALLOWED?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), FIFTEEN_INTEGER, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL }), list(new SubLObject[]{ makeKeyword("SHALLOW"), makeKeyword("NEW-TERMS-ALLOWED?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), T }), list(new SubLObject[]{ makeKeyword("EXTENDED"), makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), T }), list(new SubLObject[]{ makeKeyword("MAXIMAL"), makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("ALL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), T, makeKeyword("MAX-TRANSFORMATION-DEPTH"), NIL, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), T }));

    private static final SubLSymbol INFERENCE_MODE_P = makeSymbol("INFERENCE-MODE-P");

    private static final SubLSymbol $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");

    private static final SubLSymbol INFERENCE_MERGE_QUERY_PROPERTIES = makeSymbol("INFERENCE-MERGE-QUERY-PROPERTIES");













    private static final SubLList $list67 = list(new SubLObject[]{ list(list(list(makeKeyword("MAX-TIME"), TEN_INTEGER), list(makeKeyword("MAX-TIME"), TWENTY_INTEGER)), list(makeKeyword("MAX-TIME"), TWENTY_INTEGER)), list(list(list(makeKeyword("MAX-TIME"), TWENTY_INTEGER), list(makeKeyword("MAX-TIME"), TEN_INTEGER)), list(makeKeyword("MAX-TIME"), TWENTY_INTEGER)), list(list(list(makeKeyword("MAX-TIME"), TEN_INTEGER), NIL), list(makeKeyword("MAX-TIME"), NIL)), list(list(NIL, list(makeKeyword("MAX-TIME"), TEN_INTEGER)), list(makeKeyword("MAX-TIME"), NIL)), list(list(list(makeKeyword("MAX-STEP"), TEN_INTEGER), list(makeKeyword("MAX-STEP"), TWENTY_INTEGER)), list(makeKeyword("MAX-STEP"), TWENTY_INTEGER)), list(list(list(makeKeyword("MAX-STEP"), TWENTY_INTEGER), list(makeKeyword("MAX-STEP"), TEN_INTEGER)), list(makeKeyword("MAX-STEP"), TWENTY_INTEGER)), list(list(list(makeKeyword("MAX-STEP"), TEN_INTEGER), NIL), list(makeKeyword("MAX-STEP"), NIL)), list(list(NIL, list(makeKeyword("MAX-STEP"), TEN_INTEGER)), list(makeKeyword("MAX-STEP"), NIL)), list(list(list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL)), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T)), list(list(list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T)), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T)), list(list(list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL")), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"))), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"))), list(list(list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW")), list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"))), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"))), list(list(NIL, list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"))), list(new SubLObject[]{ makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("TRANSFORMATION-ALLOWED?"), T, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("INFERENCE-MODE"), makeKeyword("CUSTOM"), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000) })), list(list(list(makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T, makeKeyword("MAX-TIME"), makeInteger(60)), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"))), list(new SubLObject[]{ makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("TRANSFORMATION-ALLOWED?"), T, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("MAX-TIME"), NIL, makeKeyword("INFERENCE-MODE"), makeKeyword("CUSTOM"), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000) })) });

    public static SubLObject explicify_inference_engine_query_property_defaults(final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject explicified_query_properties = NIL;
        final SubLObject strengthened_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
        SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_query_properties();
        SubLObject query_property = NIL;
        query_property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_default = inference_datastructures_enumerated_types.inference_engine_default_for_property(query_property);
            final SubLObject default_specifiedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject current = getf(strengthened_query_properties, query_property, $UNSPECIFIED);
            if (current != $UNSPECIFIED) {
                explicified_query_properties = putf(explicified_query_properties, query_property, current);
            } else
                if (NIL != default_specifiedP) {
                    explicified_query_properties = putf(explicified_query_properties, query_property, v_default);
                }

            cdolist_list_var = cdolist_list_var.rest();
            query_property = cdolist_list_var.first();
        } 
        return explicified_query_properties;
    }

    public static SubLObject explicify_query_tool_query_property_defaults(final SubLObject query_properties, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject explicified_query_properties = NIL;
        final SubLObject strengthened_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
        SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_query_properties();
        SubLObject query_property = NIL;
        query_property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_default = cb_query.query_tool_default_for_property(query_property);
            SubLObject default_specifiedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ($kw1$CONDITIONAL_SENTENCE_ == query_property) {
                thread.resetMultipleValues();
                final SubLObject right_sentence = czer_utilities.unwrap_if_ist_permissive(sentence, $$BaseKB);
                final SubLObject right_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != el_implication_p(right_sentence)) {
                    v_default = T;
                    default_specifiedP = T;
                }
            }
            final SubLObject current = getf(strengthened_query_properties, query_property, $UNSPECIFIED);
            if (current != $UNSPECIFIED) {
                explicified_query_properties = putf(explicified_query_properties, query_property, current);
            } else
                if (NIL != default_specifiedP) {
                    explicified_query_properties = putf(explicified_query_properties, query_property, v_default);
                }

            cdolist_list_var = cdolist_list_var.rest();
            query_property = cdolist_list_var.first();
        } 
        return explicified_query_properties;
    }

    public static SubLObject remove_inference_engine_query_property_defaults(final SubLObject query_properties) {
        SubLObject implicified_query_properties = NIL;
        final SubLObject weakened_query_properties = inference_strategist.implicify_inference_mode_defaults(query_properties);
        SubLObject remainder;
        SubLObject query_property;
        SubLObject value;
        for (remainder = NIL, remainder = weakened_query_properties; NIL != remainder; remainder = cddr(remainder)) {
            query_property = remainder.first();
            value = cadr(remainder);
            if (!value.equal(inference_datastructures_enumerated_types.inference_engine_default_for_property(query_property))) {
                implicified_query_properties = putf(implicified_query_properties, query_property, value);
            }
        }
        return implicified_query_properties;
    }

    public static SubLObject inference_merge_query_properties(SubLObject query_properties_1, SubLObject query_properties_2) {
        assert NIL != inference_datastructures_enumerated_types.query_properties_p(query_properties_1) : "inference_datastructures_enumerated_types.query_properties_p(query_properties_1) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_properties_p(query_properties_1) " + query_properties_1;
        assert NIL != inference_datastructures_enumerated_types.query_properties_p(query_properties_2) : "inference_datastructures_enumerated_types.query_properties_p(query_properties_2) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_properties_p(query_properties_2) " + query_properties_2;
        final SubLObject mode1 = inference_datastructures_enumerated_types.inference_query_property_lookup(query_properties_1, $INFERENCE_MODE);
        final SubLObject mode2 = inference_datastructures_enumerated_types.inference_query_property_lookup(query_properties_2, $INFERENCE_MODE);
        if (!makeBoolean(mode1 != $CUSTOM).eql(makeBoolean(mode2 != $CUSTOM))) {
            query_properties_1 = inference_strategist.explicify_inference_mode_defaults(query_properties_1);
            query_properties_2 = inference_strategist.explicify_inference_mode_defaults(query_properties_2);
        }
        final SubLObject relevant_properties = union_plist_properties(query_properties_1, query_properties_2);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = relevant_properties;
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value1 = inference_datastructures_enumerated_types.inference_query_property_lookup(query_properties_1, property);
            final SubLObject value2 = inference_datastructures_enumerated_types.inference_query_property_lookup(query_properties_2, property);
            final SubLObject conservative_value = inference_conservatively_select_property_value_for_merge(property, value1, value2);
            result = putf(result, property, conservative_value);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        result = list_utilities.sort_plist_via_position(result, inference_datastructures_enumerated_types.all_query_properties(), UNPROVIDED);
        return result;
    }

    public static SubLObject union_plist_properties(final SubLObject plist1, final SubLObject plist2) {
        return nunion(list_utilities.plist_properties(plist1), list_utilities.plist_properties(plist2), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_conservatively_select_property_value_for_merge(final SubLObject property, final SubLObject value1, final SubLObject value2) {
        if (NIL != boolean_query_property_to_include_on_mergeP(property)) {
            return makeBoolean((NIL != value1) || (NIL != value2));
        }
        return NIL != query_property_value_at_least_as_completeP(property, value1, value2) ? value1 : value2;
    }

    public static SubLObject gather_inference_answer_query_propertyP(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $gather_inference_answer_query_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gather_inference_answer_query_properties() {
        return copy_list($gather_inference_answer_query_properties$.getGlobalValue());
    }

    public static SubLObject boolean_query_property_to_include_on_mergeP(final SubLObject property) {
        return list_utilities.member_eqP(property, $boolean_query_properties_to_include_on_merge$.getGlobalValue());
    }

    public static SubLObject query_property_in_efficiency_hierarchyP(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $query_properties_efficiency_hierarchy$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR));
    }

    public static SubLObject query_properties_efficiency_hierarchy() {
        return copy_alist($query_properties_efficiency_hierarchy$.getGlobalValue());
    }

    public static SubLObject numeric_query_properties() {
        return copy_list($numeric_query_properties$.getGlobalValue());
    }

    public static SubLObject numeric_query_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $numeric_query_properties$.getGlobalValue());
    }

    public static SubLObject numeric_query_property_max(final SubLObject numeric_query_property) {
        if (NIL != list_utilities.member_eqP(numeric_query_property, $numeric_query_properties_that_max_out_at_positive_infinity$.getGlobalValue())) {
            return number_utilities.positive_infinity();
        }
        return NIL;
    }

    public static SubLObject query_property_value_more_efficientP(final SubLObject property, SubLObject value1, SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.member_eqP(property, $numeric_query_properties$.getGlobalValue())) {
            if (NIL == value1) {
                value1 = number_utilities.positive_infinity();
            }
            if (NIL == value2) {
                value2 = number_utilities.positive_infinity();
            }
            return number_utilities.potentially_infinite_number_L(value1, value2);
        }
        final SubLObject hierarchy = list_utilities.alist_lookup($query_properties_efficiency_hierarchy$.getGlobalValue(), property, UNPROVIDED, UNPROVIDED);
        if (NIL != hierarchy) {
            final SubLObject value1_rank = position(value1, hierarchy, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject value2_rank = position(value2, hierarchy, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == value1_rank)) {
                Errors.error($str12$Invalid_value_for_the_properties_, property, value1);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == value2_rank)) {
                Errors.error($str12$Invalid_value_for_the_properties_, property, value2);
            }
            return numL(value1_rank, value2_rank);
        }
        return NIL;
    }

    public static SubLObject query_property_value_more_completeP(final SubLObject property, final SubLObject value1, final SubLObject value2) {
        return query_property_value_more_efficientP(property, value2, value1);
    }

    public static SubLObject query_property_value_at_least_as_efficientP(final SubLObject property, final SubLObject value1, final SubLObject value2) {
        return makeBoolean(value1.equal(value2) || (NIL != query_property_value_more_efficientP(property, value1, value2)));
    }

    public static SubLObject query_property_value_at_least_as_completeP(final SubLObject property, final SubLObject value1, final SubLObject value2) {
        return makeBoolean(value1.equal(value2) || (NIL != query_property_value_more_completeP(property, value1, value2)));
    }

    public static SubLObject most_efficient_value_for_query_property(final SubLObject property) {
        if (NIL != query_property_in_efficiency_hierarchyP(property)) {
            final SubLObject values = list_utilities.alist_lookup($query_properties_efficiency_hierarchy$.getGlobalValue(), property, UNPROVIDED, UNPROVIDED);
            return values.first();
        }
        if (NIL != numeric_query_property_p(property)) {
            return ZERO_INTEGER;
        }
        return Errors.error($str13$unexpected_property__s, property);
    }

    public static SubLObject most_efficient_value_for_query_propertyP(final SubLObject property, final SubLObject value) {
        return equal(value, most_efficient_value_for_query_property(property));
    }

    public static SubLObject most_complete_value_for_query_property(final SubLObject property) {
        if (NIL != query_property_in_efficiency_hierarchyP(property)) {
            final SubLObject values = list_utilities.alist_lookup($query_properties_efficiency_hierarchy$.getGlobalValue(), property, UNPROVIDED, UNPROVIDED);
            return list_utilities.last_one(values);
        }
        if (NIL != numeric_query_property_p(property)) {
            return numeric_query_property_max(property);
        }
        return Errors.error($str13$unexpected_property__s, property);
    }

    public static SubLObject most_complete_value_for_query_propertyP(final SubLObject property, final SubLObject value) {
        return equal(value, most_complete_value_for_query_property(property));
    }

    public static SubLObject problem_store_allows_reuse_wrt_query_propertiesP(final SubLObject store, final SubLObject query_properties) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) " + store;
        final SubLObject problem_store_static_properties = inference_datastructures_enumerated_types.extract_problem_store_static_properties(query_properties);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = problem_store_static_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            if (NIL == problem_store_allows_reuse_wrt_query_property(store, property, value)) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject problem_store_allows_reuse_wrt_query_property(final SubLObject store, final SubLObject query_property, final SubLObject value) {
        if (NIL != inference_datastructures_enumerated_types.problem_store_static_property_p(query_property)) {
            final SubLObject store_value = inference_utilities.problem_store_property_lookup(store, query_property, $UNDETERMINED);
            if (($UNDETERMINED != store_value) && (!store_value.equal(value))) {
                if (NIL != boolean_query_property_to_include_on_mergeP(query_property)) {
                    return makeBoolean((NIL == value) || (NIL != store_value));
                }
                if (NIL != query_property_in_efficiency_hierarchyP(query_property)) {
                    return query_property_value_at_least_as_completeP(query_property, store_value, value);
                }
            }
        }
        return T;
    }

    public static SubLObject inference_compute_all_answers_query_properties(final SubLObject inference) {
        final SubLObject property_sets = inference_compute_inference_answer_query_properties(inference);
        if (NIL == property_sets) {
            return $list16;
        }
        SubLObject current;
        final SubLObject datum = current = property_sets;
        SubLObject first = NIL;
        SubLObject rest = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        first = current.first();
        current = rest = current.rest();
        SubLObject running_result;
        final SubLObject first_query_properties = running_result = remf(first, $BINDINGS);
        SubLObject cdolist_list_var = rest;
        SubLObject next = NIL;
        next = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject next_query_properties = remf(next, $BINDINGS);
            running_result = inference_merge_query_properties(running_result, next_query_properties);
            cdolist_list_var = cdolist_list_var.rest();
            next = cdolist_list_var.first();
        } 
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject max_problem_count = inference_datastructures_problem_store.problem_store_historical_problem_count(store);
        SubLObject max_time = inference_datastructures_inference.inference_last_answer_elapsed_time(inference);
        final SubLObject max_step = inference_datastructures_inference.inference_last_answer_step_count(inference);
        max_time = ceiling(max_time, UNPROVIDED);
        running_result = putf(running_result, $MAX_PROBLEM_COUNT, max_problem_count);
        running_result = putf(running_result, $MAX_TIME, max_time);
        running_result = putf(running_result, $MAX_STEP, max_step);
        running_result = putf(running_result, $PROBABLY_APPROXIMATELY_DONE, $float$1_0);
        return running_result;
    }

    public static SubLObject inference_compute_some_answer_query_properties(final SubLObject inference) {
        return compute_most_efficient_query_properties(inference_compute_inference_answer_query_properties(inference));
    }

    public static SubLObject inference_compute_proof_query_properties(final SubLObject inference) {
        return inference_compute_inference_answer_query_properties_int(inference, T);
    }

    public static SubLObject inference_compute_inference_answer_query_properties(final SubLObject inference) {
        return inference_compute_inference_answer_query_properties_int(inference, NIL);
    }

    public static SubLObject compute_most_complete_query_properties(final SubLObject query_properties_list) {
        return compute_extremal_query_properties_int(query_properties_list, T);
    }

    public static SubLObject compute_most_efficient_query_properties(final SubLObject query_properties_list) {
        return compute_extremal_query_properties_int(query_properties_list, NIL);
    }

    public static SubLObject compute_extremal_query_properties_int(final SubLObject query_properties_list, final SubLObject most_completeP) {
        SubLObject extremal_properties = NIL;
        SubLObject max_time = ZERO_INTEGER;
        SubLObject max_step = ZERO_INTEGER;
        SubLObject time = NIL;
        SubLObject step = NIL;
        SubLObject cdolist_list_var = copy_tree(query_properties_list);
        SubLObject v_properties = NIL;
        v_properties = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            time = getf(v_properties, $MAX_TIME, ZERO_INTEGER);
            step = getf(v_properties, $MAX_STEP, ZERO_INTEGER);
            remf(v_properties, $MAX_TIME);
            remf(v_properties, $MAX_STEP);
            if (time.numG(max_time)) {
                max_time = time;
            }
            if (step.numG(max_step)) {
                max_step = step;
            }
            extremal_properties = (NIL != most_completeP) ? get_least_efficient_query_properties(extremal_properties, v_properties) : get_most_efficient_query_properties(extremal_properties, v_properties);
            cdolist_list_var = cdolist_list_var.rest();
            v_properties = cdolist_list_var.first();
        } 
        putf(extremal_properties, $MAX_TIME, max_time);
        putf(extremal_properties, $MAX_STEP, max_step);
        return remf(copy_list(extremal_properties), $BINDINGS);
    }

    public static SubLObject inference_compute_inference_answer_query_properties_int(final SubLObject inference, final SubLObject include_proof_propertiesP) {
        SubLObject inference_answer_query_properties_list = NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$1 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$1);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference_answer;
                SubLObject answer_properties;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference_answer)) {
                            inference_answer = $SKIP;
                        }
                        answer_properties = inference_answer_compute_inference_answer_query_properties(inference_answer, inference, include_proof_propertiesP);
                        if (NIL != include_proof_propertiesP) {
                            inference_answer_query_properties_list = nconc(answer_properties, inference_answer_query_properties_list);
                        } else {
                            inference_answer_query_properties_list = cons(answer_properties, inference_answer_query_properties_list);
                        }
                    }
                }
            }
            final SubLObject idx_$2 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$2)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$2);
                SubLObject id2 = NIL;
                SubLObject inference_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference_answer2 = getEntryValue(cdohash_entry);
                        final SubLObject answer_properties2 = inference_answer_compute_inference_answer_query_properties(inference_answer2, inference, include_proof_propertiesP);
                        if (NIL != include_proof_propertiesP) {
                            inference_answer_query_properties_list = nconc(answer_properties2, inference_answer_query_properties_list);
                        } else {
                            inference_answer_query_properties_list = cons(answer_properties2, inference_answer_query_properties_list);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return nreverse(inference_answer_query_properties_list);
    }

    public static SubLObject inference_answer_compute_inference_answer_query_properties(final SubLObject inference_answer, final SubLObject inference, final SubLObject include_proof_propertiesP) {
        final SubLObject proof_properties_list = compute_proof_query_properties_list(inference_answer, inference);
        final SubLObject answer_properties = inference_answer_compute_inference_answer_query_properties_int(proof_properties_list, inference_answer);
        if (NIL == include_proof_propertiesP) {
            return answer_properties;
        }
        return distribute_answer_properties_over_proof_properties_list(answer_properties, proof_properties_list);
    }

    public static SubLObject inference_answer_compute_inference_answer_query_properties_int(final SubLObject proof_properties_list, final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answer_properties = most_efficient_query_properties(proof_properties_list);
        final SubLObject store = inference_datastructures_inference.inference_answer_problem_store(inference_answer);
        SubLObject rejected_proofs = NIL;
        SubLObject doneP = NIL;
        if (NIL != inference_datastructures_problem_store.problem_store_some_rejected_proofsP(store)) {
            rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rejected_proofs)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject proof = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (reason == $ILL_FORMED) {
                    answer_properties = putf(answer_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(store));
                    doneP = T;
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        answer_properties = putf(answer_properties, $MAX_NUMBER, add(ONE_INTEGER, inference_datastructures_inference.inference_answer_suid(inference_answer)));
        final SubLObject elapsed_time = add(ONE_INTEGER, multiply($float$1_1, inference_datastructures_inference.inference_answer_elapsed_time(inference_answer, NIL)));
        final SubLObject pad = inference_datastructures_inference.compute_pad_from_time(elapsed_time);
        answer_properties = putf(answer_properties, $MAX_TIME, elapsed_time);
        if (NIL != pad) {
            answer_properties = putf(answer_properties, $PROBABLY_APPROXIMATELY_DONE, pad);
        }
        final SubLObject total_steps = inference_datastructures_inference.inference_answer_step_count(inference_answer);
        answer_properties = putf(answer_properties, $MAX_STEP, total_steps);
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
        if (NIL != inference_strategist.some_answer_bindings_are_indeterminateP(v_bindings)) {
            answer_properties = putf(answer_properties, $kw29$ALLOW_INDETERMINATE_RESULTS_, T);
        }
        if (NIL != inference_strategist.some_answer_bindings_are_hlP(v_bindings)) {
            answer_properties = putf(answer_properties, $ANSWER_LANGUAGE, $HL);
        } else {
            answer_properties = putf(answer_properties, $ANSWER_LANGUAGE, $EL);
        }
        answer_properties = putf(answer_properties, $BINDINGS, v_bindings);
        return answer_properties;
    }

    public static SubLObject distribute_answer_properties_over_proof_properties_list(final SubLObject answer_properties, final SubLObject proof_properties_list) {
        SubLObject new_proof_properties_list = NIL;
        SubLObject cdolist_list_var = proof_properties_list;
        SubLObject proof_properties = NIL;
        proof_properties = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            proof_properties = copy_list(proof_properties);
            SubLObject cdolist_list_var_$3 = $proof_query_properties_to_override$.getGlobalValue();
            SubLObject property = NIL;
            property = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                final SubLObject overriding_value = getf(answer_properties, property, UNPROVIDED);
                proof_properties = putf(proof_properties, property, overriding_value);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                property = cdolist_list_var_$3.first();
            } 
            new_proof_properties_list = cons(proof_properties, new_proof_properties_list);
            cdolist_list_var = cdolist_list_var.rest();
            proof_properties = cdolist_list_var.first();
        } 
        return nreverse(new_proof_properties_list);
    }

    public static SubLObject compute_proof_query_properties_list(final SubLObject inference_answer, final SubLObject inference) {
        SubLObject proof_properties_list = NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
            SubLObject proof = NIL;
            proof = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                final SubLObject proof_properties = proof_query_properties(proof, prepare_proof_query_properties(), inference);
                proof_properties_list = cons(proof_properties, proof_properties_list);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                proof = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        return proof_properties_list;
    }

    public static SubLObject proof_query_properties(final SubLObject proof, SubLObject v_properties, final SubLObject inference) {
        final SubLObject v_hl_supports = list_utilities.tree_gather(inference_datastructures_proof.proof_supports(proof), symbol_function(HL_SUPPORT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject link = inference_datastructures_proof.proof_link(proof);
        SubLObject tactic = NIL;
        SubLObject problem = NIL;
        SubLObject hl_module = NIL;
        SubLObject module_name = NIL;
        if (NIL != inference_worker.content_link_p(link)) {
            tactic = inference_worker.content_link_tactic(link);
        } else
            if (NIL != inference_worker.connected_conjunction_link_p(link)) {
                tactic = inference_worker.connected_conjunction_link_tactic(link);
            }

        problem = (NIL != tactic) ? inference_datastructures_tactic.tactic_problem(tactic) : NIL;
        hl_module = (NIL != tactic) ? inference_datastructures_tactic.tactic_hl_module(tactic) : NIL;
        module_name = (NIL != hl_module) ? inference_modules.hl_module_name(hl_module) : NIL;
        if (NIL != problem) {
            final SubLObject max_problem_id = getf(v_properties, $MAX_PROBLEM_COUNT, UNPROVIDED);
            final SubLObject problem_id = add(TWO_INTEGER, inference_datastructures_problem.problem_suid(problem));
            if (problem_id.numG(max_problem_id)) {
                v_properties = putf(v_properties, $MAX_PROBLEM_COUNT, problem_id);
            }
        }
        if (NIL != tactic) {
            final SubLObject max_productivity_limit = getf(v_properties, $PRODUCTIVITY_LIMIT, UNPROVIDED);
            final SubLObject tactic_productivity = inference_datastructures_tactic.tactic_original_productivity(tactic);
            if (NIL != list_utilities.safe_G(tactic_productivity, max_productivity_limit)) {
                v_properties = putf(v_properties, $PRODUCTIVITY_LIMIT, tactic_productivity);
            }
            if (((NIL != problem) && (NIL != hl_module)) && (NIL != inference_worker_transformation.transformation_tactic_p(tactic))) {
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                SubLObject trans_tactic = NIL;
                trans_tactic = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (((NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(trans_tactic, hl_module)) && (NIL != inference_worker_transformation.transformation_tactic_p(trans_tactic))) && (NIL == inference_worker_transformation.transformation_rule_tactic_p(trans_tactic))) {
                        final SubLObject max_productivity_limit2 = getf(v_properties, $PRODUCTIVITY_LIMIT, UNPROVIDED);
                        final SubLObject tactic_productivity2 = inference_datastructures_tactic.tactic_original_productivity(trans_tactic);
                        if (tactic_productivity2.numG(max_productivity_limit2)) {
                            v_properties = putf(v_properties, $PRODUCTIVITY_LIMIT, tactic_productivity2);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    trans_tactic = cdolist_list_var.first();
                } 
            }
        }
        final SubLObject transformation_linkP = inference_worker_transformation.transformation_link_p(link);
        if ((NIL != transformation_linkP) || (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link))) {
            v_properties = putf(v_properties, $MAX_TRANSFORMATION_DEPTH, add(inference_worker.transformation_depth_increment(link, inference), getf(v_properties, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED)));
            v_properties = putf(v_properties, $kw37$TRANSFORMATION_ALLOWED_, T);
        }
        if (((NIL != transformation_linkP) && (NIL != problem)) && (NIL != inference_tactician_strategic_uninterestingness.problem_uses_hl_predicateP(problem))) {
            v_properties = putf(v_properties, $kw38$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, T);
        }
        if (NIL != inference_worker_rewrite.rewrite_link_p(link)) {
            v_properties = putf(v_properties, $kw39$REWRITE_ALLOWED_, T);
        }
        if (NIL != hl_module) {
            if (NIL != removal_modules_abduction.abductive_removal_moduleP(module_name)) {
                v_properties = putf(v_properties, $kw40$ABDUCTION_ALLOWED_, T);
            }
            if (NIL != transformation_modules.module_requires_unbound_predicate_transformationP(module_name)) {
                v_properties = putf(v_properties, $kw41$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, T);
            }
            if ((NIL != transformation_modules.module_requires_hl_predicate_transformationP(module_name)) && ((($TRANS_ISA_POS != module_name) || (NIL == inference_tactician_strategic_uninterestingness.problem_uses_hl_predicateP(problem))) || (NIL == inference_tactician_strategic_uninterestingness.collection_backchain_encouraged_problemP(problem)))) {
                v_properties = putf(v_properties, $kw43$ALLOW_HL_PREDICATE_TRANSFORMATION_, T);
            }
            if (NIL != removal_modules_abduction.abductive_removal_moduleP(module_name)) {
                v_properties = putf(v_properties, $kw40$ABDUCTION_ALLOWED_, T);
            }
            if ($REMOVAL_TVA_UNIFY_CLOSURE == module_name) {
                v_properties = putf(v_properties, $TRANSITIVE_CLOSURE_MODE, inference_datastructures_inference.inference_transitive_closure_mode(inference));
            }
            if (NIL != removal_module_utilities.module_requires_evaluate_sublP(module_name)) {
                v_properties = putf(v_properties, $kw46$EVALUATE_SUBL_ALLOWED_, T);
            }
            if (NIL != removal_module_utilities.module_requires_new_terms_allowedP(module_name)) {
                v_properties = putf(v_properties, $kw47$NEW_TERMS_ALLOWED_, T);
            }
            SubLObject cdolist_list_var = v_hl_supports;
            SubLObject hl_support = NIL;
            hl_support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject hl_support_module = arguments.hl_support_module(hl_support);
                if ((hl_support_module == $MINIMIZE) && (NIL != removal_module_utilities.module_requires_negation_by_failureP(module_name))) {
                    v_properties = putf(v_properties, $kw49$NEGATION_BY_FAILURE_, T);
                }
                if (hl_support_module == $ABNORMAL) {
                    v_properties = putf(v_properties, $kw51$ALLOW_ABNORMALITY_CHECKING_, T);
                }
                if (NIL != removal_module_utilities.module_requires_completeness_minimization_for_supportP(module_name, hl_support_module)) {
                    v_properties = putf(v_properties, $kw52$COMPLETENESS_MINIMIZATION_ALLOWED_, T);
                }
                cdolist_list_var = cdolist_list_var.rest();
                hl_support = cdolist_list_var.first();
            } 
        }
        final SubLObject proof_depth = proof_view.inference_proof_get_depth_memoized(proof);
        if (proof_depth.numG(getf(v_properties, $MAX_PROOF_DEPTH, UNPROVIDED))) {
            v_properties = putf(v_properties, $MAX_PROOF_DEPTH, proof_depth);
        }
        SubLObject cdolist_list_var2 = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            v_properties = proof_query_properties(subproof, v_properties, inference);
            cdolist_list_var2 = cdolist_list_var2.rest();
            subproof = cdolist_list_var2.first();
        } 
        return v_properties;
    }

    public static SubLObject prepare_proof_query_properties() {
        SubLObject proof_properties = NIL;
        SubLObject cdolist_list_var = numeric_query_properties();
        SubLObject numeric_property = NIL;
        numeric_property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            proof_properties = putf(proof_properties, numeric_property, ZERO_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            numeric_property = cdolist_list_var.first();
        } 
        proof_properties = putf(proof_properties, $PROBABLY_APPROXIMATELY_DONE, ONE_INTEGER);
        cdolist_list_var = query_properties_efficiency_hierarchy();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject property = NIL;
            SubLObject hierarchy = NIL;
            destructuring_bind_must_consp(current, datum, $list54);
            property = current.first();
            current = hierarchy = current.rest();
            proof_properties = putf(proof_properties, property, hierarchy.first());
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return proof_properties;
    }

    public static SubLObject get_most_efficient_query_properties(final SubLObject properties1, final SubLObject properties2) {
        SubLObject p1 = NIL;
        SubLObject p2 = NIL;
        if (length(properties2).numG(length(properties1))) {
            p1 = properties2;
            p2 = properties1;
        } else {
            p1 = properties1;
            p2 = properties2;
        }
        if (NIL == p2) {
            return p1;
        }
        if (NIL != query_properties_more_efficientP(p1, p2)) {
            return p1;
        }
        return p2;
    }

    public static SubLObject get_least_efficient_query_properties(final SubLObject properties1, final SubLObject properties2) {
        SubLObject p1 = NIL;
        SubLObject p2 = NIL;
        if (length(properties2).numG(length(properties1))) {
            p1 = properties2;
            p2 = properties1;
        } else {
            p1 = properties1;
            p2 = properties2;
        }
        if (NIL == p2) {
            return p1;
        }
        if (NIL != query_properties_more_efficientP(p1, p2)) {
            return p2;
        }
        return p1;
    }

    public static SubLObject query_properties_more_efficientP(final SubLObject p1, final SubLObject p2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject count1 = get_query_properties_efficiency_count(p1, p2);
        final SubLObject count2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return numG(count1, count2);
    }

    public static SubLObject query_properties_less_efficientP(final SubLObject p1, final SubLObject p2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject count1 = get_query_properties_efficiency_count(p1, p2);
        final SubLObject count2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return numL(count1, count2);
    }

    public static SubLObject get_query_properties_efficiency_count(final SubLObject p1, final SubLObject p2) {
        SubLObject count1 = ZERO_INTEGER;
        SubLObject count2 = ZERO_INTEGER;
        SubLObject remainder;
        SubLObject property;
        SubLObject value1;
        SubLObject value2;
        for (remainder = NIL, remainder = p1; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value1 = cadr(remainder);
            value2 = getf(p2, property, UNPROVIDED);
            if (!value1.eql(value2)) {
                if (NIL != query_property_value_more_efficientP(property, value1, value2)) {
                    count1 = add(count1, ONE_INTEGER);
                } else {
                    count2 = add(count2, ONE_INTEGER);
                }
            }
        }
        return values(count1, count2);
    }

    public static SubLObject most_efficient_query_properties(final SubLObject query_properties_list) {
        return list_utilities.extremal(query_properties_list, $sym55$QUERY_PROPERTIES_MORE_EFFICIENT_, UNPROVIDED);
    }

    public static SubLObject most_complete_query_properties(final SubLObject query_properties_list) {
        return list_utilities.extremal(query_properties_list, $sym56$QUERY_PROPERTIES_LESS_EFFICIENT_, UNPROVIDED);
    }

    public static SubLObject least_efficient_query_properties(final SubLObject query_properties_list) {
        return most_complete_query_properties(query_properties_list);
    }

    public static SubLObject least_complete_query_properties(final SubLObject query_properties_list) {
        return most_efficient_query_properties(query_properties_list);
    }

    public static SubLObject query_properties_for_inference_mode(final SubLObject inference_mode) {
        assert NIL != inference_datastructures_enumerated_types.inference_mode_p(inference_mode) : "inference_datastructures_enumerated_types.inference_mode_p(inference_mode) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.inference_mode_p(inference_mode) " + inference_mode;
        return list_utilities.alist_lookup_without_values($inference_mode_query_properties_table$.getGlobalValue(), inference_mode, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_property_for_inference_mode(final SubLObject inference_mode, final SubLObject query_property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(query_properties_for_inference_mode(inference_mode), query_property, v_default);
    }

    public static SubLObject min_rule_utility_for_inference_mode(final SubLObject inference_mode) {
        return query_property_for_inference_mode(inference_mode, $MIN_RULE_UTILITY, UNPROVIDED);
    }

    public static SubLObject declare_inference_parameters_file() {
        declareFunction(me, "explicify_inference_engine_query_property_defaults", "EXPLICIFY-INFERENCE-ENGINE-QUERY-PROPERTY-DEFAULTS", 1, 0, false);
        declareFunction(me, "explicify_query_tool_query_property_defaults", "EXPLICIFY-QUERY-TOOL-QUERY-PROPERTY-DEFAULTS", 2, 0, false);
        declareFunction(me, "remove_inference_engine_query_property_defaults", "REMOVE-INFERENCE-ENGINE-QUERY-PROPERTY-DEFAULTS", 1, 0, false);
        declareFunction(me, "inference_merge_query_properties", "INFERENCE-MERGE-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(me, "union_plist_properties", "UNION-PLIST-PROPERTIES", 2, 0, false);
        declareFunction(me, "inference_conservatively_select_property_value_for_merge", "INFERENCE-CONSERVATIVELY-SELECT-PROPERTY-VALUE-FOR-MERGE", 3, 0, false);
        declareFunction(me, "gather_inference_answer_query_propertyP", "GATHER-INFERENCE-ANSWER-QUERY-PROPERTY?", 1, 0, false);
        declareFunction(me, "gather_inference_answer_query_properties", "GATHER-INFERENCE-ANSWER-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(me, "boolean_query_property_to_include_on_mergeP", "BOOLEAN-QUERY-PROPERTY-TO-INCLUDE-ON-MERGE?", 1, 0, false);
        declareFunction(me, "query_property_in_efficiency_hierarchyP", "QUERY-PROPERTY-IN-EFFICIENCY-HIERARCHY?", 1, 0, false);
        declareFunction(me, "query_properties_efficiency_hierarchy", "QUERY-PROPERTIES-EFFICIENCY-HIERARCHY", 0, 0, false);
        declareFunction(me, "numeric_query_properties", "NUMERIC-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(me, "numeric_query_property_p", "NUMERIC-QUERY-PROPERTY-P", 1, 0, false);
        declareFunction(me, "numeric_query_property_max", "NUMERIC-QUERY-PROPERTY-MAX", 1, 0, false);
        declareFunction(me, "query_property_value_more_efficientP", "QUERY-PROPERTY-VALUE-MORE-EFFICIENT?", 3, 0, false);
        declareFunction(me, "query_property_value_more_completeP", "QUERY-PROPERTY-VALUE-MORE-COMPLETE?", 3, 0, false);
        declareFunction(me, "query_property_value_at_least_as_efficientP", "QUERY-PROPERTY-VALUE-AT-LEAST-AS-EFFICIENT?", 3, 0, false);
        declareFunction(me, "query_property_value_at_least_as_completeP", "QUERY-PROPERTY-VALUE-AT-LEAST-AS-COMPLETE?", 3, 0, false);
        declareFunction(me, "most_efficient_value_for_query_property", "MOST-EFFICIENT-VALUE-FOR-QUERY-PROPERTY", 1, 0, false);
        declareFunction(me, "most_efficient_value_for_query_propertyP", "MOST-EFFICIENT-VALUE-FOR-QUERY-PROPERTY?", 2, 0, false);
        declareFunction(me, "most_complete_value_for_query_property", "MOST-COMPLETE-VALUE-FOR-QUERY-PROPERTY", 1, 0, false);
        declareFunction(me, "most_complete_value_for_query_propertyP", "MOST-COMPLETE-VALUE-FOR-QUERY-PROPERTY?", 2, 0, false);
        declareFunction(me, "problem_store_allows_reuse_wrt_query_propertiesP", "PROBLEM-STORE-ALLOWS-REUSE-WRT-QUERY-PROPERTIES?", 2, 0, false);
        declareFunction(me, "problem_store_allows_reuse_wrt_query_property", "PROBLEM-STORE-ALLOWS-REUSE-WRT-QUERY-PROPERTY", 3, 0, false);
        declareFunction(me, "inference_compute_all_answers_query_properties", "INFERENCE-COMPUTE-ALL-ANSWERS-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "inference_compute_some_answer_query_properties", "INFERENCE-COMPUTE-SOME-ANSWER-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "inference_compute_proof_query_properties", "INFERENCE-COMPUTE-PROOF-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "inference_compute_inference_answer_query_properties", "INFERENCE-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "compute_most_complete_query_properties", "COMPUTE-MOST-COMPLETE-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "compute_most_efficient_query_properties", "COMPUTE-MOST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "compute_extremal_query_properties_int", "COMPUTE-EXTREMAL-QUERY-PROPERTIES-INT", 2, 0, false);
        declareFunction(me, "inference_compute_inference_answer_query_properties_int", "INFERENCE-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES-INT", 2, 0, false);
        declareFunction(me, "inference_answer_compute_inference_answer_query_properties", "INFERENCE-ANSWER-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES", 3, 0, false);
        declareFunction(me, "inference_answer_compute_inference_answer_query_properties_int", "INFERENCE-ANSWER-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES-INT", 2, 0, false);
        declareFunction(me, "distribute_answer_properties_over_proof_properties_list", "DISTRIBUTE-ANSWER-PROPERTIES-OVER-PROOF-PROPERTIES-LIST", 2, 0, false);
        declareFunction(me, "compute_proof_query_properties_list", "COMPUTE-PROOF-QUERY-PROPERTIES-LIST", 2, 0, false);
        declareFunction(me, "proof_query_properties", "PROOF-QUERY-PROPERTIES", 3, 0, false);
        declareFunction(me, "prepare_proof_query_properties", "PREPARE-PROOF-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(me, "get_most_efficient_query_properties", "GET-MOST-EFFICIENT-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(me, "get_least_efficient_query_properties", "GET-LEAST-EFFICIENT-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(me, "query_properties_more_efficientP", "QUERY-PROPERTIES-MORE-EFFICIENT?", 2, 0, false);
        declareFunction(me, "query_properties_less_efficientP", "QUERY-PROPERTIES-LESS-EFFICIENT?", 2, 0, false);
        declareFunction(me, "get_query_properties_efficiency_count", "GET-QUERY-PROPERTIES-EFFICIENCY-COUNT", 2, 0, false);
        declareFunction(me, "most_efficient_query_properties", "MOST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "most_complete_query_properties", "MOST-COMPLETE-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "least_efficient_query_properties", "LEAST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "least_complete_query_properties", "LEAST-COMPLETE-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "query_properties_for_inference_mode", "QUERY-PROPERTIES-FOR-INFERENCE-MODE", 1, 0, false);
        declareFunction(me, "query_property_for_inference_mode", "QUERY-PROPERTY-FOR-INFERENCE-MODE", 2, 1, false);
        declareFunction(me, "min_rule_utility_for_inference_mode", "MIN-RULE-UTILITY-FOR-INFERENCE-MODE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_parameters_file() {
        deflexical("*GATHER-INFERENCE-ANSWER-QUERY-PROPERTIES*", $list6);
        deflexical("*BOOLEAN-QUERY-PROPERTIES-TO-INCLUDE-ON-MERGE*", $list7);
        deflexical("*QUERY-PROPERTIES-EFFICIENCY-HIERARCHY*", $list8);
        deflexical("*NUMERIC-QUERY-PROPERTIES*", $list10);
        deflexical("*NUMERIC-QUERY-PROPERTIES-THAT-MAX-OUT-AT-POSITIVE-INFINITY*", $list11);
        deflexical("*PROOF-QUERY-PROPERTIES-TO-OVERRIDE*", $list33);
        deflexical("*INFERENCE-MODE-QUERY-PROPERTIES-TABLE*", $list57);
        return NIL;
    }

    public static SubLObject setup_inference_parameters_file() {
        define_test_case_table_int(INFERENCE_MERGE_QUERY_PROPERTIES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list67);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_parameters_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_parameters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_parameters_file();
    }

    
}

/**
 * Total time: 388 ms
 */
