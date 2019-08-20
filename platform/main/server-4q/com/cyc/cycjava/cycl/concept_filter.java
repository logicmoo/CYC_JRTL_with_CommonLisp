/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONCEPT-FILTER
 * source file: /cyc/top/cycl/concept-filter.lisp
 * created:     2019/07/03 17:38:52
 */
public final class concept_filter extends SubLTranslatedFile implements V12 {
    public static final SubLObject prepare_text_file_for_decision_tree_filter_annotation(SubLObject in_file, SubLObject v_concept_filter) {
        if (v_concept_filter == UNPROVIDED) {
            v_concept_filter = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_document = NIL;
                SubLObject sentence_number = ZERO_INTEGER;
                SubLObject out_file = cconcatenate(in_file, $str_alt105$_out);
                if (NIL == Filesys.probe_file(in_file)) {
                    Errors.warn($str_alt106$can_t_find_file__S__, in_file);
                }
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_text(in_file, $INPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt108$Unable_to_open__S, in_file);
                        }
                        {
                            SubLObject s = stream;
                            v_document = document.new_document(s, UNPROVIDED);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_text(out_file, $OUTPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt108$Unable_to_open__S, out_file);
                        }
                        {
                            SubLObject out = stream;
                            SubLObject iterator_var = concept_tagger.tag_concepts(v_document, list($FILTER, v_concept_filter));
                            SubLObject done_var = NIL;
                            while (NIL == done_var) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject sent = iteration.iteration_next(iterator_var);
                                    SubLObject valid = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != valid) {
                                        sentence_number = add(sentence_number, ONE_INTEGER);
                                        format(out, $str_alt111$_A___A__, sentence_number, document.sentence_string(sent));
                                        Errors.warn($str_alt112$sentence___S__, document.sentence_string(sent));
                                        {
                                            SubLObject vector_var = document.sentence_yield(sent);
                                            SubLObject backwardP_var = NIL;
                                            SubLObject length = length(vector_var);
                                            SubLObject v_iteration = NIL;
                                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                {
                                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                    SubLObject word = aref(vector_var, element_num);
                                                    if (NIL != document.word_cycls(word)) {
                                                        format(out, $str_alt113$_____A__, document.word_string(word));
                                                        {
                                                            SubLObject cdolist_list_var = document.word_cycls(word);
                                                            SubLObject concept = NIL;
                                                            for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                                                                format(out, $str_alt114$_A_, concept);
                                                            }
                                                        }
                                                        terpri(out);
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
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return out_file;
            }
        }
    }

    public static final SubLObject decompose_concept_filter_spec_old(SubLObject filter_spec, SubLObject default_mt) {
        filter_spec = narts_high.nart_substitute(filter_spec);
        {
            SubLObject filter = NIL;
            SubLObject allow_specs = NIL;
            SubLObject allow_instances = NIL;
            SubLObject return_instances = NIL;
            SubLObject mt = NIL;
            if (cycl_utilities.nat_functor(filter_spec) == $$ConceptFilterSpecificationFn) {
                {
                    SubLObject datum = cycl_utilities.nat_args(filter_spec, UNPROVIDED);
                    SubLObject current = datum;
                    SubLObject this_filter = NIL;
                    SubLObject mode = NIL;
                    SubLObject trigger = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt87);
                    this_filter = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt87);
                    mode = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt87);
                    trigger = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        filter = this_filter;
                        allow_specs = subl_promotions.memberP(trigger, $list_alt81, UNPROVIDED, UNPROVIDED);
                        allow_instances = subl_promotions.memberP(trigger, $list_alt82, UNPROVIDED, UNPROVIDED);
                        return_instances = eq(mode, $const86$ConceptAndInstancesFilterParamete);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt87);
                    }
                }
            } else {
                {
                    SubLObject result = ask_utilities.query_template($list_alt88, list($$specificationForConceptFilter, $sym90$_FILTER, $sym83$_MODE, $sym78$_TRIGGER, filter_spec), $$InferencePSC, $list_alt91).first();
                    SubLObject datum = result;
                    SubLObject current = datum;
                    SubLObject this_filter = NIL;
                    SubLObject mode = NIL;
                    SubLObject trigger = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt87);
                    this_filter = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt87);
                    mode = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt87);
                    trigger = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        filter = this_filter;
                        allow_specs = subl_promotions.memberP(trigger, $list_alt81, UNPROVIDED, UNPROVIDED);
                        allow_instances = subl_promotions.memberP(trigger, $list_alt82, UNPROVIDED, UNPROVIDED);
                        return_instances = eq(mode, $const86$ConceptAndInstancesFilterParamete);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt87);
                    }
                }
            }
            if (NIL != forts.fort_p(filter_spec)) {
                mt = ask_utilities.query_variable($sym74$_MT, listS($const75$conceptFilterSpecificationDefinin, filter_spec, $list_alt76), $$InferencePSC, UNPROVIDED).first();
            }
            if (NIL == mt) {
                mt = default_mt;
            }
            return list(filter, allow_specs, allow_instances, return_instances, mt);
        }
    }

    public static final SubLFile me = new concept_filter();



    // defparameter
    /**
     * If no mt is specified, what Mt should be used for semantic tests for a
     * concept-filter
     */
    @LispMethod(comment = "If no mt is specified, what Mt should be used for semantic tests for a\r\nconcept-filter\ndefparameter\nIf no mt is specified, what Mt should be used for semantic tests for a\nconcept-filter")
    private static final SubLSymbol $concept_filter_default_mt$ = makeSymbol("*CONCEPT-FILTER-DEFAULT-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_concept_filter$ = makeSymbol("*DEFAULT-CONCEPT-FILTER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_concept_filter_specification$ = makeSymbol("*DEFAULT-CONCEPT-FILTER-SPECIFICATION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $concept_filter_memoization_state$ = makeSymbol("*CONCEPT-FILTER-MEMOIZATION-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $bad_for_taggingP_caching_state$ = makeSymbol("*BAD-FOR-TAGGING?-CACHING-STATE*");



    private static final SubLObject $const1$TaxonomyOfEasilyUnderstandableCon = reader_make_constant_shell("TaxonomyOfEasilyUnderstandableConcepts");

    static private final SubLList $list3 = list(list(makeSymbol("*CONCEPT-FILTER-MEMOIZATION-STATE*"), list(makeSymbol("NEW-MEMOIZATION-STATE"))));

    static private final SubLList $list5 = list(makeSymbol("*CONCEPT-FILTER-MEMOIZATION-STATE*"));

    private static final SubLSymbol CONCEPT_FILTER_SPECIFICATION_P = makeSymbol("CONCEPT-FILTER-SPECIFICATION-P");





    static private final SubLList $list9 = list(reader_make_constant_shell("ConceptFilterSpecification"));

    public static final SubLSymbol $concept_filter_specification_p_caching_state$ = makeSymbol("*CONCEPT-FILTER-SPECIFICATION-P-CACHING-STATE*");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLList $list12 = list(reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept"));

    private static final SubLSymbol NODES_FOR_CONCEPT_FILTER_AFTER_ADDING = makeSymbol("NODES-FOR-CONCEPT-FILTER-AFTER-ADDING");

    private static final SubLSymbol NODES_FOR_CONCEPT_FILTER_AFTER_REMOVING = makeSymbol("NODES-FOR-CONCEPT-FILTER-AFTER-REMOVING");

    private static final SubLSymbol CONCEPT_FILTER_ALL_ISA = makeSymbol("CONCEPT-FILTER-ALL-ISA");

    private static final SubLSymbol NART_SUBSTITUTE = makeSymbol("NART-SUBSTITUTE");

    private static final SubLSymbol $sym17$_VAR0 = makeSymbol("?VAR0");

    private static final SubLList $list18 = list(makeSymbol("?VAR0"));

    private static final SubLSymbol $concept_filter_all_isa_caching_state$ = makeSymbol("*CONCEPT-FILTER-ALL-ISA-CACHING-STATE*");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLSymbol CLEAR_CONCEPT_FILTER_ALL_ISA = makeSymbol("CLEAR-CONCEPT-FILTER-ALL-ISA");

    private static final SubLSymbol SPECIFIED_NODES_IN_FILTER = makeSymbol("SPECIFIED-NODES-IN-FILTER");

    private static final SubLSymbol $sym23$_X = makeSymbol("?X");



    private static final SubLList $list25 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLString $$$collectionAndSpecsInConceptFilter = makeString("collectionAndSpecsInConceptFilter");

    private static final SubLString $str34$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str39$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLString $str41$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    static private final SubLString $str42$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str43$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    public static final SubLSymbol $specified_nodes_in_filter_caching_state$ = makeSymbol("*SPECIFIED-NODES-IN-FILTER-CACHING-STATE*");





    private static final SubLSymbol NODES_SUPPRESSED_FROM_FILTER = makeSymbol("NODES-SUPPRESSED-FROM-FILTER");

    private static final SubLSymbol $sym48$_NODE = makeSymbol("?NODE");



    private static final SubLList $list50 = list(makeSymbol("?NODE"));

    private static final SubLSymbol $nodes_suppressed_from_filter_caching_state$ = makeSymbol("*NODES-SUPPRESSED-FROM-FILTER-CACHING-STATE*");

    private static final SubLSymbol CLEAR_NODES_SUPPRESSED_FROM_FILTER = makeSymbol("CLEAR-NODES-SUPPRESSED-FROM-FILTER");

    private static final SubLSymbol ORGANIZING_NODES_FOR_FILTER = makeSymbol("ORGANIZING-NODES-FOR-FILTER");



    private static final SubLSymbol $organizing_nodes_for_filter_caching_state$ = makeSymbol("*ORGANIZING-NODES-FOR-FILTER-CACHING-STATE*");



    private static final SubLSymbol FILTER_DEFN = makeSymbol("FILTER-DEFN");

    private static final SubLSymbol BAD_FOR_TAGGING_DEFN = makeSymbol("BAD-FOR-TAGGING-DEFN");



    private static final SubLSymbol PREDICATE_FILTER_TAGGING_DEFN = makeSymbol("PREDICATE-FILTER-TAGGING-DEFN");



    private static final SubLSymbol $sym63$TERM_FAILS_CLASSIFICATION_TREE_FILTER_ = makeSymbol("TERM-FAILS-CLASSIFICATION-TREE-FILTER?");

    private static final SubLSymbol $filter_defn_caching_state$ = makeSymbol("*FILTER-DEFN-CACHING-STATE*");

    private static final SubLSymbol $sym65$CONCEPT_TAGGING_IRRELEVANT_TERM_ = makeSymbol("CONCEPT-TAGGING-IRRELEVANT-TERM?");

    private static final SubLSymbol $sym66$BAD_FOR_TAGGING_ = makeSymbol("BAD-FOR-TAGGING?");

    private static final SubLList $list67 = list(reader_make_constant_shell("InstanceNamedFn"), reader_make_constant_shell("InstanceNamedFn-Ternary"), reader_make_constant_shell("ThingDescribableAsFn"), reader_make_constant_shell("Kappa"));

    private static final SubLSymbol $sym68$_BAD_FOR_TAGGING__CACHING_STATE_ = makeSymbol("*BAD-FOR-TAGGING?-CACHING-STATE*");

    private static final SubLSymbol VALID_CONCEPT_FILTER_NODES_MEMOIZED = makeSymbol("VALID-CONCEPT-FILTER-NODES-MEMOIZED");

    static private final SubLList $list70 = list(makeSymbol("CONCEPT-FILTER"), makeSymbol("ALLOW-SPECS"), makeSymbol("ALLOW-INSTANCES"), makeSymbol("RETURN-INSTANCES"), makeSymbol("MT"));

    private static final SubLSymbol DECOMPOSE_CONCEPT_FILTER_SPEC = makeSymbol("DECOMPOSE-CONCEPT-FILTER-SPEC");

    private static final SubLSymbol $decompose_concept_filter_spec_caching_state$ = makeSymbol("*DECOMPOSE-CONCEPT-FILTER-SPEC-CACHING-STATE*");

    private static final SubLSymbol $sym73$_MT = makeSymbol("?MT");

    private static final SubLObject $const74$conceptFilterSpecificationDefinin = reader_make_constant_shell("conceptFilterSpecificationDefiningMt");

    private static final SubLList $list75 = list(makeSymbol("?MT"));

    private static final SubLSymbol $sym77$_TRIGGER = makeSymbol("?TRIGGER");



    private static final SubLList $list79 = list(makeSymbol("?TRIGGER"));

    static private final SubLList $list80 = list(reader_make_constant_shell("TriggerFromConceptOrSpec"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"));

    static private final SubLList $list81 = list(reader_make_constant_shell("TriggerFromConceptOrInstance"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"));

    private static final SubLSymbol $sym82$_MODE = makeSymbol("?MODE");



    private static final SubLList $list84 = list(makeSymbol("?MODE"));

    private static final SubLObject $const85$ConceptAndInstancesFilterParamete = reader_make_constant_shell("ConceptAndInstancesFilterParameter");

    private static final SubLSymbol $sym86$_FILTER = makeSymbol("?FILTER");



    static private final SubLList $list88 = list(makeSymbol("?FILTER"));

    private static final SubLSymbol NEW_ADHOC_CONCEPT_FILTER_SPEC = makeSymbol("NEW-ADHOC-CONCEPT-FILTER-SPEC");

    private static final SubLObject $const92$ConceptFilterSpecificationWithMtF = reader_make_constant_shell("ConceptFilterSpecificationWithMtFn");

    private static final SubLList $list93 = list(reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept"), makeSymbol("MT"));

    private static final SubLSymbol NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC = makeSymbol("NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC");

    private static final SubLSymbol $sym95$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");

    private static final SubLSymbol $sym96$_TERM = makeSymbol("?TERM");







    private static final SubLSymbol NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC = makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC");

    private static final SubLSymbol VALID_CONCEPT_FILTER_NODES = makeSymbol("VALID-CONCEPT-FILTER-NODES");

    private static final SubLList $list108 = list(list(list(reader_make_constant_shell("Iran")), list(reader_make_constant_shell("Iran"))), list(list(reader_make_constant_shell("RussiasOfferToEnrichUraniumForIran")), list(reader_make_constant_shell("RussiasOfferToEnrichUraniumForIran"))), list(list(reader_make_constant_shell("Refusing-CommunicationAct")), list(reader_make_constant_shell("Refusing-CommunicationAct"))), list(list(list(reader_make_constant_shell("ResearchingAndDevelopingFn"), reader_make_constant_shell("NuclearWeapon"))), list(list(reader_make_constant_shell("ResearchingAndDevelopingFn"), reader_make_constant_shell("NuclearWeapon")))), list(list(reader_make_constant_shell("Collection")), NIL), list(list(reader_make_constant_shell("PartiallyTangible")), NIL));

    // Definitions
    public static final SubLObject clear_concept_filter_caches_alt() {
        com.cyc.cycjava.cycl.concept_filter.clear_concept_filter_specification_p();
        com.cyc.cycjava.cycl.concept_filter.clear_concept_filter_all_isa();
        com.cyc.cycjava.cycl.concept_filter.clear_specified_nodes_in_filter();
        com.cyc.cycjava.cycl.concept_filter.clear_organizing_nodes_for_filter();
        com.cyc.cycjava.cycl.concept_filter.clear_decompose_concept_filter_spec();
        com.cyc.cycjava.cycl.concept_filter.clear_bad_for_taggingP();
        return NIL;
    }

    // Definitions
    public static SubLObject clear_concept_filter_caches() {
        clear_concept_filter_specification_p();
        clear_concept_filter_all_isa();
        clear_specified_nodes_in_filter();
        clear_organizing_nodes_for_filter();
        clear_decompose_concept_filter_spec();
        clear_bad_for_taggingP();
        return NIL;
    }

    public static final SubLObject with_new_concept_filter_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt3, append(body, NIL));
        }
    }

    public static SubLObject with_new_concept_filter_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list3, append(body, NIL));
    }

    public static final SubLObject with_concept_filter_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_MEMOIZATION_STATE, $list_alt5, append(body, NIL));
        }
    }

    public static SubLObject with_concept_filter_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_MEMOIZATION_STATE, $list5, append(body, NIL));
    }

    public static final SubLObject clear_concept_filter_specification_p_alt() {
        {
            SubLObject cs = $concept_filter_specification_p_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_concept_filter_specification_p() {
        final SubLObject cs = $concept_filter_specification_p_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_concept_filter_specification_p_alt(SubLObject obj) {
        return memoization_state.caching_state_remove_function_results_with_args($concept_filter_specification_p_caching_state$.getGlobalValue(), list(obj), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_concept_filter_specification_p(final SubLObject obj) {
        return memoization_state.caching_state_remove_function_results_with_args($concept_filter_specification_p_caching_state$.getGlobalValue(), list(obj), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject concept_filter_specification_p_internal_alt(SubLObject obj) {
        return makeBoolean((NIL != cycl_grammar.cycl_denotational_term_p(obj)) && ((cycl_utilities.formula_arg0(obj) == $$ConceptFilterSpecificationFn) || (NIL != ask_utilities.query_boolean(listS($$isa, obj, $list_alt9), $$InferencePSC, UNPROVIDED))));
    }

    public static SubLObject concept_filter_specification_p_internal(final SubLObject obj) {
        return makeBoolean((NIL != cycl_grammar.cycl_denotational_term_p(obj)) && ((NIL != el_formula_with_operator_p(obj, $$ConceptFilterSpecificationFn)) || (NIL != ask_utilities.query_boolean(listS($$isa, obj, $list9), $$InferencePSC, UNPROVIDED))));
    }

    public static final SubLObject concept_filter_specification_p_alt(SubLObject obj) {
        {
            SubLObject caching_state = $concept_filter_specification_p_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CONCEPT_FILTER_SPECIFICATION_P, $concept_filter_specification_p_caching_state$, $int$50, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.concept_filter.concept_filter_specification_p_internal(obj)));
                    memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject concept_filter_specification_p(final SubLObject obj) {
        SubLObject caching_state = $concept_filter_specification_p_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CONCEPT_FILTER_SPECIFICATION_P, $concept_filter_specification_p_caching_state$, $int$50, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(concept_filter_specification_p_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject get_default_concept_filter_specification_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $default_concept_filter_specification$.getDynamicValue(thread)) {
                $default_concept_filter_specification$.setDynamicValue(listS($$ConceptFilterSpecificationFn, $default_concept_filter$.getDynamicValue(thread), $list_alt13), thread);
            }
            return $default_concept_filter_specification$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_default_concept_filter_specification() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $default_concept_filter_specification$.getDynamicValue(thread)) {
            $default_concept_filter_specification$.setDynamicValue(listS($$ConceptFilterSpecificationFn, $default_concept_filter$.getDynamicValue(thread), $list12), thread);
        }
        return $default_concept_filter_specification$.getDynamicValue(thread);
    }

    /**
     * keep concept-filter caches up-to-date
     *
     * @unknown this could be smarter and just clear the caches that mention the particular filter
     */
    @LispMethod(comment = "keep concept-filter caches up-to-date\r\n\r\n@unknown this could be smarter and just clear the caches that mention the particular filter")
    public static final SubLObject nodes_for_concept_filter_after_adding_alt(SubLObject argument, SubLObject assertion) {
        com.cyc.cycjava.cycl.concept_filter.clear_specified_nodes_in_filter();
        com.cyc.cycjava.cycl.concept_filter.clear_organizing_nodes_for_filter();
        return NIL;
    }

    /**
     * keep concept-filter caches up-to-date
     *
     * @unknown this could be smarter and just clear the caches that mention the particular filter
     */
    @LispMethod(comment = "keep concept-filter caches up-to-date\r\n\r\n@unknown this could be smarter and just clear the caches that mention the particular filter")
    public static SubLObject nodes_for_concept_filter_after_adding(final SubLObject argument, final SubLObject assertion) {
        clear_specified_nodes_in_filter();
        clear_organizing_nodes_for_filter();
        return NIL;
    }

    /**
     * keep concept-filter caches up-to-date
     *
     * @unknown this could be smarter and just clear the caches that mention the particular filter
     */
    @LispMethod(comment = "keep concept-filter caches up-to-date\r\n\r\n@unknown this could be smarter and just clear the caches that mention the particular filter")
    public static final SubLObject nodes_for_concept_filter_after_removing_alt(SubLObject argument, SubLObject assertion) {
        com.cyc.cycjava.cycl.concept_filter.clear_specified_nodes_in_filter();
        com.cyc.cycjava.cycl.concept_filter.clear_organizing_nodes_for_filter();
        return NIL;
    }

    /**
     * keep concept-filter caches up-to-date
     *
     * @unknown this could be smarter and just clear the caches that mention the particular filter
     */
    @LispMethod(comment = "keep concept-filter caches up-to-date\r\n\r\n@unknown this could be smarter and just clear the caches that mention the particular filter")
    public static SubLObject nodes_for_concept_filter_after_removing(final SubLObject argument, final SubLObject assertion) {
        clear_specified_nodes_in_filter();
        clear_organizing_nodes_for_filter();
        return NIL;
    }

    public static final SubLObject clear_concept_filter_all_isa_alt() {
        {
            SubLObject cs = $concept_filter_all_isa_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_concept_filter_all_isa() {
        final SubLObject cs = $concept_filter_all_isa_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_concept_filter_all_isa_alt(SubLObject v_term, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($concept_filter_all_isa_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_concept_filter_all_isa(final SubLObject v_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($concept_filter_all_isa_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     * return all the isas for TERM, regardless of whether it's a NAUT, NART, or Constant.  This should be done by ALL-ISA, but
     * that doesn't work properly for NAUTs.
     *
     * @return set-p
     */
    @LispMethod(comment = "return all the isas for TERM, regardless of whether it\'s a NAUT, NART, or Constant.  This should be done by ALL-ISA, but\r\nthat doesn\'t work properly for NAUTs.\r\n\r\n@return set-p\nreturn all the isas for TERM, regardless of whether it\'s a NAUT, NART, or Constant.  This should be done by ALL-ISA, but\nthat doesn\'t work properly for NAUTs.")
    public static final SubLObject concept_filter_all_isa_internal_alt(SubLObject v_term, SubLObject mt) {
        return NIL != forts.fort_p(v_term) ? ((SubLObject) (set_utilities.construct_set_from_list(isa.all_isa(v_term, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED))) : set_utilities.construct_set_from_list(Mapping.mapcar(NART_SUBSTITUTE, backward.removal_ask_variable($sym18$_VAR0, listS($$isa, v_term, $list_alt19), mt, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
    }

    /**
     * return all the isas for TERM, regardless of whether it's a NAUT, NART, or Constant.  This should be done by ALL-ISA, but
     * that doesn't work properly for NAUTs.
     *
     * @return set-p
     */
    @LispMethod(comment = "return all the isas for TERM, regardless of whether it\'s a NAUT, NART, or Constant.  This should be done by ALL-ISA, but\r\nthat doesn\'t work properly for NAUTs.\r\n\r\n@return set-p\nreturn all the isas for TERM, regardless of whether it\'s a NAUT, NART, or Constant.  This should be done by ALL-ISA, but\nthat doesn\'t work properly for NAUTs.")
    public static SubLObject concept_filter_all_isa_internal(final SubLObject v_term, final SubLObject mt) {
        return NIL != forts.fort_p(v_term) ? set_utilities.construct_set_from_list(isa.all_isa(v_term, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED) : set_utilities.construct_set_from_list(Mapping.mapcar(NART_SUBSTITUTE, backward.removal_ask_variable($sym17$_VAR0, listS($$isa, v_term, $list18), mt, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject concept_filter_all_isa_alt(SubLObject v_term, SubLObject mt) {
        {
            SubLObject caching_state = $concept_filter_all_isa_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CONCEPT_FILTER_ALL_ISA, $concept_filter_all_isa_caching_state$, $int$500, EQUAL, TWO_INTEGER, ZERO_INTEGER);
                memoization_state.register_isa_dependent_cache_clear_callback(CLEAR_CONCEPT_FILTER_ALL_ISA);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_term.equal(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.concept_filter.concept_filter_all_isa_internal(v_term, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject concept_filter_all_isa(final SubLObject v_term, final SubLObject mt) {
        SubLObject caching_state = $concept_filter_all_isa_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CONCEPT_FILTER_ALL_ISA, $concept_filter_all_isa_caching_state$, $int$500, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback(CLEAR_CONCEPT_FILTER_ALL_ISA);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(concept_filter_all_isa_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_specified_nodes_in_filter_alt() {
        {
            SubLObject cs = $specified_nodes_in_filter_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_specified_nodes_in_filter() {
        final SubLObject cs = $specified_nodes_in_filter_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_specified_nodes_in_filter_alt(SubLObject filter, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($specified_nodes_in_filter_caching_state$.getGlobalValue(), list(filter, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_specified_nodes_in_filter(final SubLObject filter, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($specified_nodes_in_filter_caching_state$.getGlobalValue(), list(filter, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject specified_nodes_in_filter_internal_alt(SubLObject filter, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_results = ask_utilities.query_variable($sym24$_X, list($$nodeInSystem, $sym24$_X, filter), mt, $list_alt26);
                SubLObject nodes = set_utilities.construct_set_from_list(query_results, EQUAL, UNPROVIDED);
                SubLObject pred = constants_high.find_constant($$$collectionAndSpecsInConceptFilter);
                if (NIL != valid_constantP(pred, UNPROVIDED)) {
                    {
                        SubLObject collection = NIL;
                        SubLObject pred_var = pred;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(filter, TWO_INTEGER, pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(filter, TWO_INTEGER, pred_var);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                    {
                                                        SubLObject done_var_1 = NIL;
                                                        SubLObject token_var_2 = NIL;
                                                        while (NIL == done_var_1) {
                                                            {
                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                if (NIL != valid_3) {
                                                                    collection = assertions_high.gaf_arg(assertion, ONE_INTEGER);
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
                                                                                    SubLObject node_var = collection;
                                                                                    SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                                                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                            {
                                                                                                SubLObject tv_var = NIL;
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_5 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                                                        if (NIL != tv_var) {
                                                                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                                    {
                                                                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                                                        if (pcase_var.eql($ERROR)) {
                                                                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt35$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        } else {
                                                                                                                            if (pcase_var.eql($CERROR)) {
                                                                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt35$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            } else {
                                                                                                                                if (pcase_var.eql($WARN)) {
                                                                                                                                    Errors.warn($str_alt35$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                                                } else {
                                                                                                                                    Errors.warn($str_alt40$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                                                    Errors.cerror($$$continue_anyway, $str_alt35$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_1_8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_2_9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_10 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                                                        SubLObject _prev_bind_1_11 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                                                        SubLObject _prev_bind_2_12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                                                            while (NIL != node_var) {
                                                                                                                                {
                                                                                                                                    SubLObject spec = node_var;
                                                                                                                                    set.set_add(spec, nodes);
                                                                                                                                }
                                                                                                                                {
                                                                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                                                                    SubLObject module_var = NIL;
                                                                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                                            SubLObject _prev_bind_1_14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                                            if (NIL != d_link) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                                                    if (NIL != mt_links) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject mt_15 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_15)) {
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject _prev_bind_0_16 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                                                            try {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_15, thread);
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject iteration_state_17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_17)) {
                                                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                                                        {
                                                                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_17);
                                                                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                                                {
                                                                                                                                                                                                                    SubLObject _prev_bind_0_18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                                                        {
                                                                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                                                            SubLObject cdolist_list_var_19 = new_list;
                                                                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest() , node_vars_link_node = cdolist_list_var_19.first()) {
                                                                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } finally {
                                                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_18, thread);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            iteration_state_17 = dictionary_contents.do_dictionary_contents_next(iteration_state_17);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } 
                                                                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_17);
                                                                                                                                                                                                }
                                                                                                                                                                                            } finally {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_16, thread);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                                                }
                                                                                                                                                                            } 
                                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                                                SubLObject cdolist_list_var_20 = new_list;
                                                                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                                                                for (generating_fn = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , generating_fn = cdolist_list_var_20.first()) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_21 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                                                SubLObject new_list_22 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_23 = new_list_22;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , node_vars_link_node = cdolist_list_var_23.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_21, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_14, thread);
                                                                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_13, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                node_var = deck.deck_pop(recur_deck);
                                                                                                                            } 
                                                                                                                        } finally {
                                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_12, thread);
                                                                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_11, thread);
                                                                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_10, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt43$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_9, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_8, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_7, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_6, thread);
                                                                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_5, thread);
                                                                                                    }
                                                                                                }
                                                                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_4, thread);
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
                                                                done_var_1 = makeBoolean(NIL == valid_3);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                }
                return nodes;
            }
        }
    }

    public static SubLObject specified_nodes_in_filter_internal(final SubLObject filter, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_results = ask_utilities.query_variable($sym23$_X, list($$nodeInSystem, $sym23$_X, filter), mt, $list25);
        final SubLObject nodes = set_utilities.construct_set_from_list(query_results, EQUAL, UNPROVIDED);
        final SubLObject pred = constants_high.find_constant($$$collectionAndSpecsInConceptFilter);
        if (NIL != valid_constantP(pred, UNPROVIDED)) {
            SubLObject collection = NIL;
            final SubLObject pred_var = pred;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(filter, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(filter, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$1 = NIL;
                            final SubLObject token_var_$2 = NIL;
                            while (NIL == done_var_$1) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                if (NIL != valid_$3) {
                                    collection = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        SubLObject node_var = collection;
                                        final SubLObject deck_type = $STACK;
                                        final SubLObject recur_deck = deck.create_deck(deck_type);
                                        final SubLObject _prev_bind_0_$4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                final SubLObject tv_var = NIL;
                                                final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                        if (pcase_var.eql($ERROR)) {
                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else
                                                            if (pcase_var.eql($CERROR)) {
                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else
                                                                if (pcase_var.eql($WARN)) {
                                                                    Errors.warn($str34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                } else {
                                                                    Errors.warn($str39$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                    Errors.cerror($$$continue_anyway, $str34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                }


                                                    }
                                                    final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                while (NIL != node_var) {
                                                                    final SubLObject spec = node_var;
                                                                    set.set_add(spec, nodes);
                                                                    SubLObject cdolist_list_var;
                                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                    SubLObject module_var = NIL;
                                                                    module_var = cdolist_list_var.first();
                                                                    while (NIL != cdolist_list_var) {
                                                                        final SubLObject _prev_bind_0_$8 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                if (NIL != d_link) {
                                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                    if (NIL != mt_links) {
                                                                                        SubLObject iteration_state;
                                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject mt_$15 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$15)) {
                                                                                                final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$15, thread);
                                                                                                    SubLObject iteration_state_$17;
                                                                                                    for (iteration_state_$17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$17); iteration_state_$17 = dictionary_contents.do_dictionary_contents_next(iteration_state_$17)) {
                                                                                                        thread.resetMultipleValues();
                                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$17);
                                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                            final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                final SubLObject sol = link_nodes;
                                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                                    SubLObject basis_object;
                                                                                                                    SubLObject state;
                                                                                                                    SubLObject node_vars_link_node;
                                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else
                                                                                                                    if (sol.isList()) {
                                                                                                                        SubLObject csome_list_var = sol;
                                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                                        while (NIL != csome_list_var) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                            }
                                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                                        } 
                                                                                                                    } else {
                                                                                                                        Errors.error($str41$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                    }

                                                                                                            } finally {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$10, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$17);
                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$9, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                    }
                                                                                } else {
                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                }
                                                                            } else
                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                    SubLObject cdolist_list_var_$19;
                                                                                    final SubLObject new_list = cdolist_list_var_$19 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                    SubLObject generating_fn = NIL;
                                                                                    generating_fn = cdolist_list_var_$19.first();
                                                                                    while (NIL != cdolist_list_var_$19) {
                                                                                        final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                            final SubLObject sol2;
                                                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                            if (NIL != set.set_p(sol2)) {
                                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                                SubLObject basis_object2;
                                                                                                SubLObject state2;
                                                                                                SubLObject node_vars_link_node3;
                                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol2.isList()) {
                                                                                                    SubLObject csome_list_var2 = sol2;
                                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                                    while (NIL != csome_list_var2) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str41$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$11, thread);
                                                                                        }
                                                                                        cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                                                                                        generating_fn = cdolist_list_var_$19.first();
                                                                                    } 
                                                                                }

                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$9, thread);
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$8, thread);
                                                                        }
                                                                        cdolist_list_var = cdolist_list_var.rest();
                                                                        module_var = cdolist_list_var.first();
                                                                    } 
                                                                    node_var = deck.deck_pop(recur_deck);
                                                                } 
                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$10, thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$8, thread);
                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$7, thread);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str43$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$9, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$7, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$6, thread);
                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$5, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                done_var_$1 = makeBoolean(NIL == valid_$3);
                            } 
                        } finally {
                            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        }
        return nodes;
    }

    public static final SubLObject specified_nodes_in_filter_alt(SubLObject filter, SubLObject mt) {
        {
            SubLObject caching_state = $specified_nodes_in_filter_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(SPECIFIED_NODES_IN_FILTER, $specified_nodes_in_filter_caching_state$, TWENTY_INTEGER, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(filter, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (filter.equal(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.concept_filter.specified_nodes_in_filter_internal(filter, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(filter, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject specified_nodes_in_filter(final SubLObject filter, final SubLObject mt) {
        SubLObject caching_state = $specified_nodes_in_filter_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SPECIFIED_NODES_IN_FILTER, $specified_nodes_in_filter_caching_state$, TWENTY_INTEGER, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(filter, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (filter.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(specified_nodes_in_filter_internal(filter, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(filter, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return BOOLEANP; Is the result of calling SPECIFIED-NODES-IN-FILTER on FILTER and MT already cached?
     */
    @LispMethod(comment = "@return BOOLEANP; Is the result of calling SPECIFIED-NODES-IN-FILTER on FILTER and MT already cached?")
    public static final SubLObject specified_nodes_in_filter_cached_p_alt(SubLObject filter, SubLObject mt) {
        {
            SubLObject state = memoization_state.get_caching_state_for_globally_cached_function(SPECIFIED_NODES_IN_FILTER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject args = list(filter, mt);
            return memoization_state.caching_state_multi_key_n_is_cached(state, args);
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is the result of calling SPECIFIED-NODES-IN-FILTER on FILTER and MT already cached?
     */
    @LispMethod(comment = "@return BOOLEANP; Is the result of calling SPECIFIED-NODES-IN-FILTER on FILTER and MT already cached?")
    public static SubLObject specified_nodes_in_filter_cached_p(final SubLObject filter, final SubLObject mt) {
        final SubLObject state = memoization_state.get_caching_state_for_globally_cached_function(SPECIFIED_NODES_IN_FILTER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject args = list(filter, mt);
        return memoization_state.caching_state_multi_key_n_is_cached(state, args);
    }

    /**
     * is TERM a node in FILTER-TAXONOMY, as seen from MT?
     */
    @LispMethod(comment = "is TERM a node in FILTER-TAXONOMY, as seen from MT?")
    public static final SubLObject specified_node_in_filterP_alt(SubLObject v_term, SubLObject v_concept_filter, SubLObject mt) {
        if (v_concept_filter == UNPROVIDED) {
            v_concept_filter = $default_concept_filter$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = $concept_filter_default_mt$.getDynamicValue();
        }
        if ((NIL != com.cyc.cycjava.cycl.concept_filter.specified_nodes_in_filter_cached_p(v_concept_filter, mt)) && (NIL != set.set_memberP(v_term, com.cyc.cycjava.cycl.concept_filter.specified_nodes_in_filter(v_concept_filter, mt)))) {
            return T;
        } else {
            if (NIL != com.cyc.cycjava.cycl.concept_filter.query_for_individual_terms_from_filterP(v_concept_filter)) {
                return ask_utilities.query_boolean(list($$nodeInSystem, v_term, v_concept_filter), mt, UNPROVIDED);
            } else {
                if ((NIL == indexed_term_p(v_term)) && (NIL == narts_high.find_nart(v_term))) {
                    {
                        SubLObject in_filterP = ask_utilities.query_boolean(list($$nodeInSystem, v_term, v_concept_filter), mt, UNPROVIDED);
                        if (((NIL != in_filterP) && (NIL != narts_high.naut_p(v_term))) && (NIL != narts_high.find_nart(v_term))) {
                            set.set_add(narts_high.find_nart(v_term), com.cyc.cycjava.cycl.concept_filter.specified_nodes_in_filter(v_concept_filter, mt));
                        }
                        return in_filterP;
                    }
                } else {
                    {
                        SubLObject non_terminals = com.cyc.cycjava.cycl.concept_filter.specified_nodes_in_filter(v_concept_filter, mt);
                        return set.set_memberP(narts_high.nart_substitute(v_term), non_terminals);
                    }
                }
            }
        }
    }

    /**
     * is TERM a node in FILTER-TAXONOMY, as seen from MT?
     */
    @LispMethod(comment = "is TERM a node in FILTER-TAXONOMY, as seen from MT?")
    public static SubLObject specified_node_in_filterP(final SubLObject v_term, SubLObject v_concept_filter, SubLObject mt) {
        if (v_concept_filter == UNPROVIDED) {
            v_concept_filter = $default_concept_filter$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = $concept_filter_default_mt$.getDynamicValue();
        }
        if ((NIL != specified_nodes_in_filter_cached_p(v_concept_filter, mt)) && (NIL != set.set_memberP(v_term, specified_nodes_in_filter(v_concept_filter, mt)))) {
            return T;
        }
        if (NIL != query_for_individual_terms_from_filterP(v_concept_filter)) {
            return ask_utilities.query_boolean(list($$elementOf, v_term, v_concept_filter), mt, UNPROVIDED);
        }
        if ((NIL == indexed_term_p(v_term)) && (NIL == narts_high.find_nart(v_term))) {
            final SubLObject in_filterP = ask_utilities.query_boolean(list($$nodeInSystem, v_term, v_concept_filter), mt, UNPROVIDED);
            if (((NIL != in_filterP) && (NIL != narts_high.naut_p(v_term))) && (NIL != narts_high.find_nart(v_term))) {
                set.set_add(narts_high.find_nart(v_term), specified_nodes_in_filter(v_concept_filter, mt));
            }
            return in_filterP;
        }
        final SubLObject non_terminals = specified_nodes_in_filter(v_concept_filter, mt);
        return set.set_memberP(narts_high.nart_substitute(v_term), non_terminals);
    }/**
     * is TERM a node in FILTER-TAXONOMY, as seen from MT?
     */


    /**
     * With this filter, should we always just ask Cyc if a term is a member?
     */
    @LispMethod(comment = "With this filter, should we always just ask Cyc if a term is a member?")
    public static final SubLObject query_for_individual_terms_from_filterP_alt(SubLObject filter) {
        return eq(cycl_utilities.formula_arg0(filter), $$TheSetOf);
    }

    /**
     * With this filter, should we always just ask Cyc if a term is a member?
     */
    @LispMethod(comment = "With this filter, should we always just ask Cyc if a term is a member?")
    public static SubLObject query_for_individual_terms_from_filterP(final SubLObject filter) {
        return el_formula_with_operator_p(filter, $$TheSetOf);
    }/**
     * With this filter, should we always just ask Cyc if a term is a member?
     */


    public static final SubLObject node_suppressed_from_filterP_alt(SubLObject node, SubLObject filter, SubLObject mt) {
        if (NIL != com.cyc.cycjava.cycl.concept_filter.complete_extent_should_be_queried_from_kbP(filter)) {
            return set.set_memberP(node, com.cyc.cycjava.cycl.concept_filter.nodes_suppressed_from_filter(filter, mt));
        } else {
            if (NIL != com.cyc.cycjava.cycl.concept_filter.filter_defn(filter, mt)) {
                return funcall(com.cyc.cycjava.cycl.concept_filter.filter_defn(filter, mt), filter, narts_high.nart_substitute(node), mt);
            }
        }
        return NIL;
    }

    public static SubLObject node_suppressed_from_filterP(final SubLObject node, final SubLObject filter, final SubLObject mt) {
        if (NIL != complete_extent_should_be_queried_from_kbP(filter)) {
            return set.set_memberP(node, nodes_suppressed_from_filter(filter, mt));
        }
        if (NIL != filter_defn(filter, mt)) {
            return funcall(filter_defn(filter, mt), filter, narts_high.nart_substitute(node), mt);
        }
        return NIL;
    }

    public static final SubLObject clear_nodes_suppressed_from_filter_alt() {
        {
            SubLObject cs = $nodes_suppressed_from_filter_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_nodes_suppressed_from_filter() {
        final SubLObject cs = $nodes_suppressed_from_filter_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_nodes_suppressed_from_filter_alt(SubLObject filter, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($nodes_suppressed_from_filter_caching_state$.getGlobalValue(), list(filter, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_nodes_suppressed_from_filter(final SubLObject filter, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($nodes_suppressed_from_filter_caching_state$.getGlobalValue(), list(filter, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject nodes_suppressed_from_filter_internal_alt(SubLObject filter, SubLObject mt) {
        return set_utilities.construct_set_from_list(ask_utilities.query_variable($sym47$_NODE, listS($$suppressIndividualNode, filter, $list_alt49), mt, UNPROVIDED), EQUAL, UNPROVIDED);
    }

    public static SubLObject nodes_suppressed_from_filter_internal(final SubLObject filter, final SubLObject mt) {
        return set_utilities.construct_set_from_list(ask_utilities.query_variable($sym48$_NODE, listS($$suppressIndividualNode, filter, $list50), mt, UNPROVIDED), EQUAL, UNPROVIDED);
    }

    public static final SubLObject nodes_suppressed_from_filter_alt(SubLObject filter, SubLObject mt) {
        {
            SubLObject caching_state = $nodes_suppressed_from_filter_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(NODES_SUPPRESSED_FROM_FILTER, $nodes_suppressed_from_filter_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_NODES_SUPPRESSED_FROM_FILTER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(filter, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (filter.equal(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.concept_filter.nodes_suppressed_from_filter_internal(filter, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(filter, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject nodes_suppressed_from_filter(final SubLObject filter, final SubLObject mt) {
        SubLObject caching_state = $nodes_suppressed_from_filter_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NODES_SUPPRESSED_FROM_FILTER, $nodes_suppressed_from_filter_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_NODES_SUPPRESSED_FROM_FILTER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(filter, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (filter.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(nodes_suppressed_from_filter_internal(filter, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(filter, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_organizing_nodes_for_filter_alt() {
        {
            SubLObject cs = $organizing_nodes_for_filter_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_organizing_nodes_for_filter() {
        final SubLObject cs = $organizing_nodes_for_filter_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_organizing_nodes_for_filter_alt(SubLObject filter, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($organizing_nodes_for_filter_caching_state$.getGlobalValue(), list(filter, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_organizing_nodes_for_filter(final SubLObject filter, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($organizing_nodes_for_filter_caching_state$.getGlobalValue(), list(filter, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject organizing_nodes_for_filter_internal_alt(SubLObject filter, SubLObject mt) {
        return set_utilities.construct_set_from_list(ask_utilities.query_variable($sym24$_X, list($$classifyingNodeInFilter, $sym24$_X, filter), mt, $list_alt26), EQUAL, UNPROVIDED);
    }

    public static SubLObject organizing_nodes_for_filter_internal(final SubLObject filter, final SubLObject mt) {
        return set_utilities.construct_set_from_list(ask_utilities.query_variable($sym23$_X, list($$classifyingNodeInFilter, $sym23$_X, filter), mt, $list25), EQUAL, UNPROVIDED);
    }

    public static final SubLObject organizing_nodes_for_filter_alt(SubLObject filter, SubLObject mt) {
        {
            SubLObject caching_state = $organizing_nodes_for_filter_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ORGANIZING_NODES_FOR_FILTER, $organizing_nodes_for_filter_caching_state$, TWENTY_INTEGER, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(filter, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (filter.equal(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.concept_filter.organizing_nodes_for_filter_internal(filter, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(filter, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject organizing_nodes_for_filter(final SubLObject filter, final SubLObject mt) {
        SubLObject caching_state = $organizing_nodes_for_filter_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ORGANIZING_NODES_FOR_FILTER, $organizing_nodes_for_filter_caching_state$, TWENTY_INTEGER, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(filter, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (filter.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(organizing_nodes_for_filter_internal(filter, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(filter, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject complete_extent_should_be_queried_from_kbP_alt(SubLObject obj) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.concept_filter.filter_defn(obj, $$InferencePSC));
    }

    public static SubLObject complete_extent_should_be_queried_from_kbP(final SubLObject obj) {
        return makeBoolean(NIL == filter_defn(obj, $$InferencePSC));
    }

    public static final SubLObject decision_tree_filterP_alt(SubLObject obj) {
        return isa.isa_in_any_mtP(obj, $$DecisionTreeConceptFilter);
    }

    public static SubLObject decision_tree_filterP(final SubLObject obj) {
        return isa.isa_in_any_mtP(obj, $$DecisionTreeConceptFilter);
    }

    public static final SubLObject clear_filter_defn_alt() {
        {
            SubLObject cs = $filter_defn_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_filter_defn() {
        final SubLObject cs = $filter_defn_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_filter_defn_alt(SubLObject obj, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($filter_defn_caching_state$.getGlobalValue(), list(obj, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_filter_defn(final SubLObject obj, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($filter_defn_caching_state$.getGlobalValue(), list(obj, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject filter_defn_internal_alt(SubLObject obj, SubLObject mt) {
        {
            SubLObject pcase_var = obj;
            if (pcase_var.eql($const1$TaxonomyOfEasilyUnderstandableCon)) {
                return BAD_FOR_TAGGING_DEFN;
            } else {
                if (pcase_var.eql($$PredicateTaxonomy)) {
                    return PREDICATE_FILTER_TAGGING_DEFN;
                } else {
                    if (pcase_var.eql($$TheCycOntology)) {
                        return IGNORE;
                    }
                }
            }
        }
        if (NIL != com.cyc.cycjava.cycl.concept_filter.decision_tree_filterP(obj)) {
            return $sym62$TERM_FAILS_CLASSIFICATION_TREE_FILTER_;
        }
        return NIL;
    }

    public static SubLObject filter_defn_internal(final SubLObject obj, final SubLObject mt) {
        if (obj.eql($const1$TaxonomyOfEasilyUnderstandableCon)) {
            return BAD_FOR_TAGGING_DEFN;
        }
        if (obj.eql($$PredicateTaxonomy)) {
            return PREDICATE_FILTER_TAGGING_DEFN;
        }
        if (obj.eql($$TheCycOntology)) {
            return IGNORE;
        }
        if (NIL != decision_tree_filterP(obj)) {
            return $sym63$TERM_FAILS_CLASSIFICATION_TREE_FILTER_;
        }
        return NIL;
    }

    public static final SubLObject filter_defn_alt(SubLObject obj, SubLObject mt) {
        {
            SubLObject caching_state = $filter_defn_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(FILTER_DEFN, $filter_defn_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(obj, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (obj.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.concept_filter.filter_defn_internal(obj, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(obj, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject filter_defn(final SubLObject obj, final SubLObject mt) {
        SubLObject caching_state = $filter_defn_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FILTER_DEFN, $filter_defn_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(obj, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (obj.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(filter_defn_internal(obj, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(obj, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject concept_tagging_irrelevant_termP_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.concept_filter.bad_for_taggingP(v_object, UNPROVIDED);
    }

    public static SubLObject concept_tagging_irrelevant_termP(final SubLObject v_object) {
        return bad_for_taggingP(v_object, UNPROVIDED);
    }

    public static final SubLObject predicate_filter_tagging_defn_alt(SubLObject filter, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fort_types_interface.predicate_p(v_term);
    }

    public static SubLObject predicate_filter_tagging_defn(final SubLObject filter, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fort_types_interface.predicate_p(v_term);
    }

    public static final SubLObject bad_for_tagging_defn_alt(SubLObject filter, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.concept_filter.bad_for_taggingP(v_term, mt);
    }

    public static SubLObject bad_for_tagging_defn(final SubLObject filter, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return bad_for_taggingP(v_term, mt);
    }

    public static final SubLObject clear_bad_for_taggingP_alt() {
        {
            SubLObject cs = $bad_for_taggingP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_bad_for_taggingP() {
        final SubLObject cs = $bad_for_taggingP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_bad_for_taggingP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($bad_for_taggingP_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_bad_for_taggingP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($bad_for_taggingP_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject bad_for_taggingP_internal_alt(SubLObject v_term, SubLObject mt) {
        if (NIL != cycl_grammar.cycl_nat_p(v_term)) {
            {
                SubLObject operator = cycl_utilities.formula_arg0(v_term);
                if (NIL != subl_promotions.memberP(operator, $list_alt66, UNPROVIDED, UNPROVIDED)) {
                    return T;
                }
            }
        }
        if (NIL != forts.fort_p(narts_high.nart_substitute(v_term))) {
            return rkf_relevance_utilities.rkf_irrelevant_term(narts_high.nart_substitute(v_term), mt);
        }
        return NIL;
    }

    public static SubLObject bad_for_taggingP_internal(final SubLObject v_term, final SubLObject mt) {
        if (NIL != cycl_grammar.cycl_nat_p(v_term)) {
            final SubLObject operator = cycl_utilities.formula_arg0(v_term);
            if (NIL != subl_promotions.memberP(operator, $list67, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        if (NIL != forts.fort_p(narts_high.nart_substitute(v_term))) {
            return rkf_relevance_utilities.rkf_irrelevant_term(narts_high.nart_substitute(v_term), mt);
        }
        return NIL;
    }

    public static final SubLObject bad_for_taggingP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject caching_state = $bad_for_taggingP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym65$BAD_FOR_TAGGING_, $sym67$_BAD_FOR_TAGGING__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_term.equal(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.concept_filter.bad_for_taggingP_internal(v_term, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject bad_for_taggingP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject caching_state = $bad_for_taggingP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym66$BAD_FOR_TAGGING_, $sym68$_BAD_FOR_TAGGING__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(bad_for_taggingP_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * is TERM an organizing node in FILTER-TAXONOMY, as seen from MT?
     */
    @LispMethod(comment = "is TERM an organizing node in FILTER-TAXONOMY, as seen from MT?")
    public static final SubLObject organizing_node_for_filterP_alt(SubLObject v_term, SubLObject v_concept_filter, SubLObject mt) {
        if (v_concept_filter == UNPROVIDED) {
            v_concept_filter = $default_concept_filter$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = $concept_filter_default_mt$.getDynamicValue();
        }
        {
            SubLObject non_terminals = com.cyc.cycjava.cycl.concept_filter.organizing_nodes_for_filter(v_concept_filter, mt);
            return set.set_memberP(narts_high.nart_substitute(v_term), non_terminals);
        }
    }

    /**
     * is TERM an organizing node in FILTER-TAXONOMY, as seen from MT?
     */
    @LispMethod(comment = "is TERM an organizing node in FILTER-TAXONOMY, as seen from MT?")
    public static SubLObject organizing_node_for_filterP(final SubLObject v_term, SubLObject v_concept_filter, SubLObject mt) {
        if (v_concept_filter == UNPROVIDED) {
            v_concept_filter = $default_concept_filter$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = $concept_filter_default_mt$.getDynamicValue();
        }
        final SubLObject non_terminals = organizing_nodes_for_filter(v_concept_filter, mt);
        return set.set_memberP(narts_high.nart_substitute(v_term), non_terminals);
    }/**
     * is TERM an organizing node in FILTER-TAXONOMY, as seen from MT?
     */


    /**
     * What, if anything, does CONCEPT-FILTER return for TERM?
     * Depending on the details of the filter, this may return TERM itself or a generalization of TERM, provided
     * that the generalization is a valid node in CONCEPT-FILTER
     *
     * @return LISTP; a list of terms that pass the filter based on TERM
     */
    @LispMethod(comment = "What, if anything, does CONCEPT-FILTER return for TERM?\r\nDepending on the details of the filter, this may return TERM itself or a generalization of TERM, provided\r\nthat the generalization is a valid node in CONCEPT-FILTER\r\n\r\n@return LISTP; a list of terms that pass the filter based on TERM\nWhat, if anything, does CONCEPT-FILTER return for TERM?\nDepending on the details of the filter, this may return TERM itself or a generalization of TERM, provided\nthat the generalization is a valid node in CONCEPT-FILTER")
    public static final SubLObject valid_concept_filter_nodes_alt(SubLObject v_term, SubLObject concept_filter_spec) {
        if (concept_filter_spec == UNPROVIDED) {
            concept_filter_spec = com.cyc.cycjava.cycl.concept_filter.get_default_concept_filter_specification();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject return_value = NIL;
                SubLObject local_state = $concept_filter_memoization_state$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                            Errors.error($str_alt68$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                return_value = com.cyc.cycjava.cycl.concept_filter.valid_concept_filter_nodes_memoized(v_term, concept_filter_spec);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return return_value;
            }
        }
    }

    /**
     * What, if anything, does CONCEPT-FILTER return for TERM?
     * Depending on the details of the filter, this may return TERM itself or a generalization of TERM, provided
     * that the generalization is a valid node in CONCEPT-FILTER
     *
     * @return LISTP; a list of terms that pass the filter based on TERM
     */
    @LispMethod(comment = "What, if anything, does CONCEPT-FILTER return for TERM?\r\nDepending on the details of the filter, this may return TERM itself or a generalization of TERM, provided\r\nthat the generalization is a valid node in CONCEPT-FILTER\r\n\r\n@return LISTP; a list of terms that pass the filter based on TERM\nWhat, if anything, does CONCEPT-FILTER return for TERM?\nDepending on the details of the filter, this may return TERM itself or a generalization of TERM, provided\nthat the generalization is a valid node in CONCEPT-FILTER")
    public static SubLObject valid_concept_filter_nodes(final SubLObject v_term, SubLObject concept_filter_spec) {
        if (concept_filter_spec == UNPROVIDED) {
            concept_filter_spec = get_default_concept_filter_specification();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject return_value = NIL;
        final SubLObject local_state = $concept_filter_memoization_state$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return_value = valid_concept_filter_nodes_memoized(v_term, concept_filter_spec);
            } finally {
                final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return return_value;
    }/**
     * What, if anything, does CONCEPT-FILTER return for TERM?
     * Depending on the details of the filter, this may return TERM itself or a generalization of TERM, provided
     * that the generalization is a valid node in CONCEPT-FILTER
     *
     * @return LISTP; a list of terms that pass the filter based on TERM
     */


    public static final SubLObject valid_concept_filter_nodes_memoized_internal_alt(SubLObject v_term, SubLObject concept_filter_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject return_value = NIL;
                SubLObject datum = com.cyc.cycjava.cycl.concept_filter.decompose_concept_filter_spec(concept_filter_spec, UNPROVIDED);
                SubLObject current = datum;
                SubLObject v_concept_filter = NIL;
                SubLObject allow_specs = NIL;
                SubLObject allow_instances = NIL;
                SubLObject return_instances = NIL;
                SubLObject mt = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt70);
                v_concept_filter = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt70);
                allow_specs = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt70);
                allow_instances = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt70);
                return_instances = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt70);
                mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == com.cyc.cycjava.cycl.concept_filter.complete_extent_should_be_queried_from_kbP(v_concept_filter)) {
                        if (NIL != com.cyc.cycjava.cycl.concept_filter.node_suppressed_from_filterP(v_term, v_concept_filter, mt)) {
                            return NIL;
                        } else {
                            return list(v_term);
                        }
                    }
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
                                if (NIL != com.cyc.cycjava.cycl.concept_filter.specified_node_in_filterP(v_term, v_concept_filter, mt)) {
                                    return_value = list(v_term);
                                }
                                if (((NIL == return_value) && (NIL != allow_specs)) && (NIL != fort_types_interface.collection_p(v_term))) {
                                    {
                                        SubLObject my_genls_in_filter = genls.min_genls_among(v_term, set.set_element_list(com.cyc.cycjava.cycl.concept_filter.specified_nodes_in_filter(v_concept_filter, mt)), UNPROVIDED, UNPROVIDED);
                                        if (NIL != my_genls_in_filter) {
                                            return_value = my_genls_in_filter;
                                        }
                                    }
                                }
                                if ((NIL == return_value) && (NIL != allow_instances)) {
                                    {
                                        SubLObject term_isas = com.cyc.cycjava.cycl.concept_filter.concept_filter_all_isa(v_term, mt);
                                        SubLObject specified_filter_terms = com.cyc.cycjava.cycl.concept_filter.specified_nodes_in_filter(v_concept_filter, mt);
                                        SubLObject isas_in_filter = set_utilities.set_intersection(list(specified_filter_terms, term_isas), UNPROVIDED);
                                        if (NIL != set.non_empty_set_p(isas_in_filter)) {
                                            if (NIL != return_instances) {
                                                return_value = list(v_term);
                                            } else {
                                                return_value = genls.min_ceiling_cols(set.set_element_list(isas_in_filter), NIL, mt, UNPROVIDED);
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
                    return return_value;
                } else {
                    cdestructuring_bind_error(datum, $list_alt70);
                }
            }
            return NIL;
        }
    }

    public static SubLObject valid_concept_filter_nodes_memoized_internal(final SubLObject v_term, final SubLObject concept_filter_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject return_value = NIL;
        SubLObject current;
        final SubLObject datum = current = decompose_concept_filter_spec(concept_filter_spec, UNPROVIDED);
        SubLObject v_concept_filter = NIL;
        SubLObject allow_specs = NIL;
        SubLObject allow_instances = NIL;
        SubLObject return_instances = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list70);
        v_concept_filter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list70);
        allow_specs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list70);
        allow_instances = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list70);
        return_instances = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list70);
        mt = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list70);
            return NIL;
        }
        if (NIL != complete_extent_should_be_queried_from_kbP(v_concept_filter)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL != specified_node_in_filterP(v_term, v_concept_filter, mt)) {
                    return_value = list(v_term);
                }
                if (((NIL == return_value) && (NIL != allow_specs)) && (NIL != fort_types_interface.collection_p(v_term))) {
                    final SubLObject my_genls_in_filter = genls.min_genls_among(v_term, set.set_element_list(specified_nodes_in_filter(v_concept_filter, mt)), UNPROVIDED, UNPROVIDED);
                    if (NIL != my_genls_in_filter) {
                        return_value = my_genls_in_filter;
                    }
                }
                if ((NIL == return_value) && (NIL != allow_instances)) {
                    final SubLObject term_isas = concept_filter_all_isa(v_term, mt);
                    final SubLObject specified_filter_terms = specified_nodes_in_filter(v_concept_filter, mt);
                    final SubLObject isas_in_filter = set_utilities.set_intersection(list(specified_filter_terms, term_isas), UNPROVIDED);
                    if (NIL != set.non_empty_set_p(isas_in_filter)) {
                        if (NIL != return_instances) {
                            return_value = list(v_term);
                        } else {
                            return_value = genls.min_ceiling_cols(set.set_element_list(isas_in_filter), NIL, mt, UNPROVIDED);
                        }
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return return_value;
        }
        if (NIL != node_suppressed_from_filterP(v_term, v_concept_filter, mt)) {
            return NIL;
        }
        return list(v_term);
    }

    public static final SubLObject valid_concept_filter_nodes_memoized_alt(SubLObject v_term, SubLObject concept_filter_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.concept_filter.valid_concept_filter_nodes_memoized_internal(v_term, concept_filter_spec);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, VALID_CONCEPT_FILTER_NODES_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), VALID_CONCEPT_FILTER_NODES_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, VALID_CONCEPT_FILTER_NODES_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, concept_filter_spec);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && concept_filter_spec.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.concept_filter.valid_concept_filter_nodes_memoized_internal(v_term, concept_filter_spec)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, concept_filter_spec));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject valid_concept_filter_nodes_memoized(final SubLObject v_term, final SubLObject concept_filter_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return valid_concept_filter_nodes_memoized_internal(v_term, concept_filter_spec);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, VALID_CONCEPT_FILTER_NODES_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), VALID_CONCEPT_FILTER_NODES_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, VALID_CONCEPT_FILTER_NODES_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, concept_filter_spec);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && concept_filter_spec.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(valid_concept_filter_nodes_memoized_internal(v_term, concept_filter_spec)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, concept_filter_spec));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_decompose_concept_filter_spec_alt() {
        {
            SubLObject cs = $decompose_concept_filter_spec_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_decompose_concept_filter_spec() {
        final SubLObject cs = $decompose_concept_filter_spec_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_decompose_concept_filter_spec_alt(SubLObject filter_spec, SubLObject default_mt) {
        if (default_mt == UNPROVIDED) {
            default_mt = $concept_filter_default_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($decompose_concept_filter_spec_caching_state$.getGlobalValue(), list(filter_spec, default_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_decompose_concept_filter_spec(final SubLObject filter_spec, SubLObject default_mt) {
        if (default_mt == UNPROVIDED) {
            default_mt = $concept_filter_default_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($decompose_concept_filter_spec_caching_state$.getGlobalValue(), list(filter_spec, default_mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject decompose_concept_filter_spec_internal_alt(SubLObject filter_spec, SubLObject default_mt) {
        {
            SubLObject filter = NIL;
            SubLObject allow_specs = NIL;
            SubLObject allow_instances = NIL;
            SubLObject return_instances = NIL;
            SubLObject mt = NIL;
            if (NIL == filter_spec) {
                return list(filter, allow_specs, allow_instances, return_instances, mt);
            } else {
                if (NIL != valid_constantP($$conceptFilterSpecificationFilter, UNPROVIDED)) {
                    return com.cyc.cycjava.cycl.concept_filter.decompose_concept_filter_spec_new(filter_spec, default_mt);
                } else {
                    return com.cyc.cycjava.cycl.concept_filter.decompose_concept_filter_spec_old(filter_spec, default_mt);
                }
            }
        }
    }

    public static SubLObject decompose_concept_filter_spec_internal(final SubLObject filter_spec, final SubLObject default_mt) {
        final SubLObject filter = NIL;
        final SubLObject allow_specs = NIL;
        final SubLObject allow_instances = NIL;
        final SubLObject return_instances = NIL;
        final SubLObject mt = NIL;
        if (NIL == filter_spec) {
            return list(filter, allow_specs, allow_instances, return_instances, mt);
        }
        return decompose_concept_filter_spec_new(filter_spec, default_mt);
    }

    public static final SubLObject decompose_concept_filter_spec_alt(SubLObject filter_spec, SubLObject default_mt) {
        if (default_mt == UNPROVIDED) {
            default_mt = $concept_filter_default_mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $decompose_concept_filter_spec_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(DECOMPOSE_CONCEPT_FILTER_SPEC, $decompose_concept_filter_spec_caching_state$, TEN_INTEGER, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(filter_spec, default_mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (filter_spec.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && default_mt.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.concept_filter.decompose_concept_filter_spec_internal(filter_spec, default_mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(filter_spec, default_mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject decompose_concept_filter_spec(final SubLObject filter_spec, SubLObject default_mt) {
        if (default_mt == UNPROVIDED) {
            default_mt = $concept_filter_default_mt$.getDynamicValue();
        }
        SubLObject caching_state = $decompose_concept_filter_spec_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DECOMPOSE_CONCEPT_FILTER_SPEC, $decompose_concept_filter_spec_caching_state$, TEN_INTEGER, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(filter_spec, default_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (filter_spec.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && default_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(decompose_concept_filter_spec_internal(filter_spec, default_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(filter_spec, default_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject decompose_concept_filter_spec_new_alt(SubLObject filter_spec, SubLObject default_mt) {
        {
            SubLObject filter = NIL;
            SubLObject allow_specs = NIL;
            SubLObject allow_instances = NIL;
            SubLObject return_instances = NIL;
            SubLObject mt = NIL;
            SubLObject store = NIL;
            try {
                store = inference_datastructures_problem_store.new_problem_store(NIL);
                filter = com.cyc.cycjava.cycl.concept_filter.concept_filter_specification_filter(filter_spec, store);
                mt = ask_utilities.query_variable($sym74$_MT, listS($const75$conceptFilterSpecificationDefinin, filter_spec, $list_alt76), $$InferencePSC, list($PROBLEM_STORE, store)).first();
                {
                    SubLObject trigger = ask_utilities.query_variable($sym78$_TRIGGER, listS($$conceptFilterSpecificationTrigger, filter_spec, $list_alt80), $$InferencePSC, list($PROBLEM_STORE, store)).first();
                    allow_specs = subl_promotions.memberP(trigger, $list_alt81, UNPROVIDED, UNPROVIDED);
                    allow_instances = subl_promotions.memberP(trigger, $list_alt82, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject mode = ask_utilities.query_variable($sym83$_MODE, listS($$conceptFilterSpecificationMode, filter_spec, $list_alt85), $$InferencePSC, list($PROBLEM_STORE, store)).first();
                    return_instances = eq(mode, $const86$ConceptAndInstancesFilterParamete);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        inference_datastructures_problem_store.destroy_problem_store(store);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            if (NIL == mt) {
                mt = default_mt;
            }
            return list(filter, allow_specs, allow_instances, return_instances, mt);
        }
    }

    public static SubLObject decompose_concept_filter_spec_new(final SubLObject filter_spec, final SubLObject default_mt) {
        SubLObject filter = NIL;
        SubLObject allow_specs = NIL;
        SubLObject allow_instances = NIL;
        SubLObject return_instances = NIL;
        SubLObject mt = NIL;
        SubLObject store = NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store(NIL);
            filter = concept_filter_specification_filter(filter_spec, store);
            mt = ask_utilities.query_variable($sym73$_MT, listS($const74$conceptFilterSpecificationDefinin, filter_spec, $list75), $$InferencePSC, list($PROBLEM_STORE, store)).first();
            final SubLObject trigger = ask_utilities.query_variable($sym77$_TRIGGER, listS($$conceptFilterSpecificationTrigger, filter_spec, $list79), $$InferencePSC, list($PROBLEM_STORE, store)).first();
            allow_specs = subl_promotions.memberP(trigger, $list80, UNPROVIDED, UNPROVIDED);
            allow_instances = subl_promotions.memberP(trigger, $list81, UNPROVIDED, UNPROVIDED);
            final SubLObject mode = ask_utilities.query_variable($sym82$_MODE, listS($$conceptFilterSpecificationMode, filter_spec, $list84), $$InferencePSC, list($PROBLEM_STORE, store)).first();
            return_instances = eql(mode, $const85$ConceptAndInstancesFilterParamete);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        if (NIL == mt) {
            mt = default_mt;
        }
        return list(filter, allow_specs, allow_instances, return_instances, mt);
    }

    public static final SubLObject concept_filter_specification_filter_alt(SubLObject filter_spec, SubLObject store) {
        if (store == UNPROVIDED) {
            store = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != valid_constantP($$conceptFilterSpecificationFilter, UNPROVIDED)) {
                return ask_utilities.query_variable($sym90$_FILTER, listS($$conceptFilterSpecificationFilter, filter_spec, $list_alt92), $$InferencePSC, list($PROBLEM_STORE, store)).first();
            } else {
                return com.cyc.cycjava.cycl.concept_filter.decompose_concept_filter_spec_old(filter_spec, $concept_filter_default_mt$.getDynamicValue(thread)).first();
            }
        }
    }

    public static SubLObject concept_filter_specification_filter(final SubLObject filter_spec, SubLObject store) {
        if (store == UNPROVIDED) {
            store = NIL;
        }
        return ask_utilities.query_variable($sym86$_FILTER, listS($$conceptFilterSpecificationFilter, filter_spec, $list88), $$InferencePSC, list($PROBLEM_STORE, store)).first();
    }

    /**
     * Produce a new concept filter specification that allows in only the concepts that are elements of SET, as determined
     * from MT.  If MT is not specified, #$InferencePSC will be used
     */
    @LispMethod(comment = "Produce a new concept filter specification that allows in only the concepts that are elements of SET, as determined\r\nfrom MT.  If MT is not specified, #$InferencePSC will be used\nProduce a new concept filter specification that allows in only the concepts that are elements of SET, as determined\nfrom MT.  If MT is not specified, #$InferencePSC will be used")
    public static final SubLObject new_adhoc_concept_filter_spec_alt(SubLObject v_set, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $concept_filter_default_mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(v_set, CYCL_TERM_P);
        SubLTrampolineFile.checkType(mt, HLMT_P);
        if (NIL != valid_constantP($const96$ConceptFilterSpecificationWithMtF, UNPROVIDED)) {
            return listS($const96$ConceptFilterSpecificationWithMtF, v_set, $list_alt97);
        } else {
            return listS($$ConceptFilterSpecificationFn, v_set, $list_alt13);
        }
    }

    @LispMethod(comment = "Produce a new concept filter specification that allows in only the concepts that are elements of SET, as determined\r\nfrom MT.  If MT is not specified, #$InferencePSC will be used\nProduce a new concept filter specification that allows in only the concepts that are elements of SET, as determined\nfrom MT.  If MT is not specified, #$InferencePSC will be used")
    public static SubLObject new_adhoc_concept_filter_spec(final SubLObject v_set, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $concept_filter_default_mt$.getDynamicValue();
        }
        SubLTrampolineFile.enforceType(v_set, CYCL_TERM_P);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        if (NIL != valid_constantP($const92$ConceptFilterSpecificationWithMtF, UNPROVIDED)) {
            return listS($const92$ConceptFilterSpecificationWithMtF, v_set, $list93);
        }
        return listS($$ConceptFilterSpecificationFn, v_set, $list12);
    }/**
     * Produce a new concept filter specification that allows in only the concepts that are elements of SET, as determined
     * from MT.  If MT is not specified, #$InferencePSC will be used
     */


    /**
     * Produce a new concept filter specification that allows in only the concepts that are instances of collection,
     * as determined from MT.  If MT is not specified, #$InferencePSC will be used
     */
    @LispMethod(comment = "Produce a new concept filter specification that allows in only the concepts that are instances of collection,\r\nas determined from MT.  If MT is not specified, #$InferencePSC will be used\nProduce a new concept filter specification that allows in only the concepts that are instances of collection,\nas determined from MT.  If MT is not specified, #$InferencePSC will be used")
    public static final SubLObject new_adhoc_isa_concept_filter_spec_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $concept_filter_default_mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(collection, $sym99$ISA_COLLECTION_);
        SubLTrampolineFile.checkType(mt, HLMT_P);
        if (NIL != valid_constantP($const96$ConceptFilterSpecificationWithMtF, UNPROVIDED)) {
            return list($const96$ConceptFilterSpecificationWithMtF, list($$TheSetOf, $sym100$_TERM, list($$isa, $sym100$_TERM, collection)), $$ConceptOnlyFilterParameter, $$TriggerFromConcept, mt);
        } else {
            return listS($$ConceptFilterSpecificatioFn, list($$TheSetOf, $sym100$_TERM, list($$isa, $sym100$_TERM, collection)), $list_alt13);
        }
    }

    @LispMethod(comment = "Produce a new concept filter specification that allows in only the concepts that are instances of collection,\r\nas determined from MT.  If MT is not specified, #$InferencePSC will be used\nProduce a new concept filter specification that allows in only the concepts that are instances of collection,\nas determined from MT.  If MT is not specified, #$InferencePSC will be used")
    public static SubLObject new_adhoc_isa_concept_filter_spec(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $concept_filter_default_mt$.getDynamicValue();
        }
        SubLTrampolineFile.enforceType(collection, $sym95$ISA_COLLECTION_);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        if (NIL != valid_constantP($const92$ConceptFilterSpecificationWithMtF, UNPROVIDED)) {
            return list($const92$ConceptFilterSpecificationWithMtF, list($$TheSetOf, $sym96$_TERM, list($$isa, $sym96$_TERM, collection)), $$ConceptOnlyFilterParameter, $$TriggerFromConcept, mt);
        }
        return listS($$ConceptFilterSpecificatioFn, list($$TheSetOf, $sym96$_TERM, list($$isa, $sym96$_TERM, collection)), $list12);
    }/**
     * Produce a new concept filter specification that allows in only the concepts that are instances of collection,
     * as determined from MT.  If MT is not specified, #$InferencePSC will be used
     */


    /**
     * Produce a new concept filter specification that allows in only the concepts that are specs of GENL, as determined
     * from MT.  If MT is not specified, #$InferencePSC will be used
     */
    @LispMethod(comment = "Produce a new concept filter specification that allows in only the concepts that are specs of GENL, as determined\r\nfrom MT.  If MT is not specified, #$InferencePSC will be used\nProduce a new concept filter specification that allows in only the concepts that are specs of GENL, as determined\nfrom MT.  If MT is not specified, #$InferencePSC will be used")
    public static final SubLObject new_adhoc_genls_concept_filter_spec_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $concept_filter_default_mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(collection, $sym99$ISA_COLLECTION_);
        SubLTrampolineFile.checkType(mt, HLMT_P);
        if (NIL != valid_constantP($const96$ConceptFilterSpecificationWithMtF, UNPROVIDED)) {
            return listS($const96$ConceptFilterSpecificationWithMtF, list($$TheSetOf, $sym100$_TERM, list($$genls, $sym100$_TERM, collection)), $list_alt97);
        } else {
            return listS($$ConceptFilterSpecificationFn, list($$TheSetOf, $sym100$_TERM, list($$genls, $sym100$_TERM, collection)), $list_alt13);
        }
    }

    @LispMethod(comment = "Produce a new concept filter specification that allows in only the concepts that are specs of GENL, as determined\r\nfrom MT.  If MT is not specified, #$InferencePSC will be used\nProduce a new concept filter specification that allows in only the concepts that are specs of GENL, as determined\nfrom MT.  If MT is not specified, #$InferencePSC will be used")
    public static SubLObject new_adhoc_genls_concept_filter_spec(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $concept_filter_default_mt$.getDynamicValue();
        }
        SubLTrampolineFile.enforceType(collection, $sym95$ISA_COLLECTION_);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        if (NIL != valid_constantP($const92$ConceptFilterSpecificationWithMtF, UNPROVIDED)) {
            return list($const92$ConceptFilterSpecificationWithMtF, list($$TheSetOf, $sym96$_TERM, list($$genls, $sym96$_TERM, collection)), $$ConceptOnlyFilterParameter, $$TriggerFromConcept, mt);
        }
        return listS($$ConceptFilterSpecificationFn, list($$TheSetOf, $sym96$_TERM, list($$genls, $sym96$_TERM, collection)), $list12);
    }/**
     * Produce a new concept filter specification that allows in only the concepts that are specs of GENL, as determined
     * from MT.  If MT is not specified, #$InferencePSC will be used
     */


    public static final SubLObject declare_concept_filter_file_alt() {
        declareFunction("clear_concept_filter_caches", "CLEAR-CONCEPT-FILTER-CACHES", 0, 0, false);
        declareMacro("with_new_concept_filter_memoization_state", "WITH-NEW-CONCEPT-FILTER-MEMOIZATION-STATE");
        declareMacro("with_concept_filter_memoization_state", "WITH-CONCEPT-FILTER-MEMOIZATION-STATE");
        declareFunction("clear_concept_filter_specification_p", "CLEAR-CONCEPT-FILTER-SPECIFICATION-P", 0, 0, false);
        declareFunction("remove_concept_filter_specification_p", "REMOVE-CONCEPT-FILTER-SPECIFICATION-P", 1, 0, false);
        declareFunction("concept_filter_specification_p_internal", "CONCEPT-FILTER-SPECIFICATION-P-INTERNAL", 1, 0, false);
        declareFunction("concept_filter_specification_p", "CONCEPT-FILTER-SPECIFICATION-P", 1, 0, false);
        declareFunction("get_default_concept_filter_specification", "GET-DEFAULT-CONCEPT-FILTER-SPECIFICATION", 0, 0, false);
        declareFunction("nodes_for_concept_filter_after_adding", "NODES-FOR-CONCEPT-FILTER-AFTER-ADDING", 2, 0, false);
        declareFunction("nodes_for_concept_filter_after_removing", "NODES-FOR-CONCEPT-FILTER-AFTER-REMOVING", 2, 0, false);
        declareFunction("clear_concept_filter_all_isa", "CLEAR-CONCEPT-FILTER-ALL-ISA", 0, 0, false);
        new com.cyc.cycjava.cycl.concept_filter.$clear_concept_filter_all_isa$ZeroArityFunction();
        declareFunction("remove_concept_filter_all_isa", "REMOVE-CONCEPT-FILTER-ALL-ISA", 2, 0, false);
        declareFunction("concept_filter_all_isa_internal", "CONCEPT-FILTER-ALL-ISA-INTERNAL", 2, 0, false);
        declareFunction("concept_filter_all_isa", "CONCEPT-FILTER-ALL-ISA", 2, 0, false);
        declareFunction("clear_specified_nodes_in_filter", "CLEAR-SPECIFIED-NODES-IN-FILTER", 0, 0, false);
        declareFunction("remove_specified_nodes_in_filter", "REMOVE-SPECIFIED-NODES-IN-FILTER", 2, 0, false);
        declareFunction("specified_nodes_in_filter_internal", "SPECIFIED-NODES-IN-FILTER-INTERNAL", 2, 0, false);
        declareFunction("specified_nodes_in_filter", "SPECIFIED-NODES-IN-FILTER", 2, 0, false);
        declareFunction("specified_nodes_in_filter_cached_p", "SPECIFIED-NODES-IN-FILTER-CACHED-P", 2, 0, false);
        declareFunction("specified_node_in_filterP", "SPECIFIED-NODE-IN-FILTER?", 1, 2, false);
        declareFunction("query_for_individual_terms_from_filterP", "QUERY-FOR-INDIVIDUAL-TERMS-FROM-FILTER?", 1, 0, false);
        declareFunction("node_suppressed_from_filterP", "NODE-SUPPRESSED-FROM-FILTER?", 3, 0, false);
        declareFunction("clear_nodes_suppressed_from_filter", "CLEAR-NODES-SUPPRESSED-FROM-FILTER", 0, 0, false);
        new com.cyc.cycjava.cycl.concept_filter.$clear_nodes_suppressed_from_filter$ZeroArityFunction();
        declareFunction("remove_nodes_suppressed_from_filter", "REMOVE-NODES-SUPPRESSED-FROM-FILTER", 2, 0, false);
        declareFunction("nodes_suppressed_from_filter_internal", "NODES-SUPPRESSED-FROM-FILTER-INTERNAL", 2, 0, false);
        declareFunction("nodes_suppressed_from_filter", "NODES-SUPPRESSED-FROM-FILTER", 2, 0, false);
        declareFunction("clear_organizing_nodes_for_filter", "CLEAR-ORGANIZING-NODES-FOR-FILTER", 0, 0, false);
        declareFunction("remove_organizing_nodes_for_filter", "REMOVE-ORGANIZING-NODES-FOR-FILTER", 2, 0, false);
        declareFunction("organizing_nodes_for_filter_internal", "ORGANIZING-NODES-FOR-FILTER-INTERNAL", 2, 0, false);
        declareFunction("organizing_nodes_for_filter", "ORGANIZING-NODES-FOR-FILTER", 2, 0, false);
        declareFunction("complete_extent_should_be_queried_from_kbP", "COMPLETE-EXTENT-SHOULD-BE-QUERIED-FROM-KB?", 1, 0, false);
        declareFunction("decision_tree_filterP", "DECISION-TREE-FILTER?", 1, 0, false);
        declareFunction("clear_filter_defn", "CLEAR-FILTER-DEFN", 0, 0, false);
        declareFunction("remove_filter_defn", "REMOVE-FILTER-DEFN", 2, 0, false);
        declareFunction("filter_defn_internal", "FILTER-DEFN-INTERNAL", 2, 0, false);
        declareFunction("filter_defn", "FILTER-DEFN", 2, 0, false);
        declareFunction("concept_tagging_irrelevant_termP", "CONCEPT-TAGGING-IRRELEVANT-TERM?", 1, 0, false);
        declareFunction("predicate_filter_tagging_defn", "PREDICATE-FILTER-TAGGING-DEFN", 2, 1, false);
        declareFunction("bad_for_tagging_defn", "BAD-FOR-TAGGING-DEFN", 2, 1, false);
        declareFunction("clear_bad_for_taggingP", "CLEAR-BAD-FOR-TAGGING?", 0, 0, false);
        declareFunction("remove_bad_for_taggingP", "REMOVE-BAD-FOR-TAGGING?", 1, 1, false);
        declareFunction("bad_for_taggingP_internal", "BAD-FOR-TAGGING?-INTERNAL", 2, 0, false);
        declareFunction("bad_for_taggingP", "BAD-FOR-TAGGING?", 1, 1, false);
        declareFunction("organizing_node_for_filterP", "ORGANIZING-NODE-FOR-FILTER?", 1, 2, false);
        declareFunction("valid_concept_filter_nodes", "VALID-CONCEPT-FILTER-NODES", 1, 1, false);
        declareFunction("valid_concept_filter_nodes_memoized_internal", "VALID-CONCEPT-FILTER-NODES-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("valid_concept_filter_nodes_memoized", "VALID-CONCEPT-FILTER-NODES-MEMOIZED", 2, 0, false);
        declareFunction("clear_decompose_concept_filter_spec", "CLEAR-DECOMPOSE-CONCEPT-FILTER-SPEC", 0, 0, false);
        declareFunction("remove_decompose_concept_filter_spec", "REMOVE-DECOMPOSE-CONCEPT-FILTER-SPEC", 1, 1, false);
        declareFunction("decompose_concept_filter_spec_internal", "DECOMPOSE-CONCEPT-FILTER-SPEC-INTERNAL", 2, 0, false);
        declareFunction("decompose_concept_filter_spec", "DECOMPOSE-CONCEPT-FILTER-SPEC", 1, 1, false);
        declareFunction("decompose_concept_filter_spec_new", "DECOMPOSE-CONCEPT-FILTER-SPEC-NEW", 2, 0, false);
        declareFunction("decompose_concept_filter_spec_old", "DECOMPOSE-CONCEPT-FILTER-SPEC-OLD", 2, 0, false);
        declareFunction("concept_filter_specification_filter", "CONCEPT-FILTER-SPECIFICATION-FILTER", 1, 1, false);
        declareFunction("new_adhoc_concept_filter_spec", "NEW-ADHOC-CONCEPT-FILTER-SPEC", 1, 1, false);
        declareFunction("new_adhoc_isa_concept_filter_spec", "NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC", 1, 1, false);
        declareFunction("new_adhoc_genls_concept_filter_spec", "NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC", 1, 1, false);
        declareFunction("prepare_text_file_for_decision_tree_filter_annotation", "PREPARE-TEXT-FILE-FOR-DECISION-TREE-FILTER-ANNOTATION", 1, 1, false);
        return NIL;
    }

    public static SubLObject declare_concept_filter_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("clear_concept_filter_caches", "CLEAR-CONCEPT-FILTER-CACHES", 0, 0, false);
            declareMacro("with_new_concept_filter_memoization_state", "WITH-NEW-CONCEPT-FILTER-MEMOIZATION-STATE");
            declareMacro("with_concept_filter_memoization_state", "WITH-CONCEPT-FILTER-MEMOIZATION-STATE");
            declareFunction("clear_concept_filter_specification_p", "CLEAR-CONCEPT-FILTER-SPECIFICATION-P", 0, 0, false);
            declareFunction("remove_concept_filter_specification_p", "REMOVE-CONCEPT-FILTER-SPECIFICATION-P", 1, 0, false);
            declareFunction("concept_filter_specification_p_internal", "CONCEPT-FILTER-SPECIFICATION-P-INTERNAL", 1, 0, false);
            declareFunction("concept_filter_specification_p", "CONCEPT-FILTER-SPECIFICATION-P", 1, 0, false);
            declareFunction("get_default_concept_filter_specification", "GET-DEFAULT-CONCEPT-FILTER-SPECIFICATION", 0, 0, false);
            declareFunction("nodes_for_concept_filter_after_adding", "NODES-FOR-CONCEPT-FILTER-AFTER-ADDING", 2, 0, false);
            declareFunction("nodes_for_concept_filter_after_removing", "NODES-FOR-CONCEPT-FILTER-AFTER-REMOVING", 2, 0, false);
            declareFunction("clear_concept_filter_all_isa", "CLEAR-CONCEPT-FILTER-ALL-ISA", 0, 0, false);
            new concept_filter.$clear_concept_filter_all_isa$ZeroArityFunction();
            declareFunction("remove_concept_filter_all_isa", "REMOVE-CONCEPT-FILTER-ALL-ISA", 2, 0, false);
            declareFunction("concept_filter_all_isa_internal", "CONCEPT-FILTER-ALL-ISA-INTERNAL", 2, 0, false);
            declareFunction("concept_filter_all_isa", "CONCEPT-FILTER-ALL-ISA", 2, 0, false);
            declareFunction("clear_specified_nodes_in_filter", "CLEAR-SPECIFIED-NODES-IN-FILTER", 0, 0, false);
            declareFunction("remove_specified_nodes_in_filter", "REMOVE-SPECIFIED-NODES-IN-FILTER", 2, 0, false);
            declareFunction("specified_nodes_in_filter_internal", "SPECIFIED-NODES-IN-FILTER-INTERNAL", 2, 0, false);
            declareFunction("specified_nodes_in_filter", "SPECIFIED-NODES-IN-FILTER", 2, 0, false);
            declareFunction("specified_nodes_in_filter_cached_p", "SPECIFIED-NODES-IN-FILTER-CACHED-P", 2, 0, false);
            declareFunction("specified_node_in_filterP", "SPECIFIED-NODE-IN-FILTER?", 1, 2, false);
            declareFunction("query_for_individual_terms_from_filterP", "QUERY-FOR-INDIVIDUAL-TERMS-FROM-FILTER?", 1, 0, false);
            declareFunction("node_suppressed_from_filterP", "NODE-SUPPRESSED-FROM-FILTER?", 3, 0, false);
            declareFunction("clear_nodes_suppressed_from_filter", "CLEAR-NODES-SUPPRESSED-FROM-FILTER", 0, 0, false);
            new concept_filter.$clear_nodes_suppressed_from_filter$ZeroArityFunction();
            declareFunction("remove_nodes_suppressed_from_filter", "REMOVE-NODES-SUPPRESSED-FROM-FILTER", 2, 0, false);
            declareFunction("nodes_suppressed_from_filter_internal", "NODES-SUPPRESSED-FROM-FILTER-INTERNAL", 2, 0, false);
            declareFunction("nodes_suppressed_from_filter", "NODES-SUPPRESSED-FROM-FILTER", 2, 0, false);
            declareFunction("clear_organizing_nodes_for_filter", "CLEAR-ORGANIZING-NODES-FOR-FILTER", 0, 0, false);
            declareFunction("remove_organizing_nodes_for_filter", "REMOVE-ORGANIZING-NODES-FOR-FILTER", 2, 0, false);
            declareFunction("organizing_nodes_for_filter_internal", "ORGANIZING-NODES-FOR-FILTER-INTERNAL", 2, 0, false);
            declareFunction("organizing_nodes_for_filter", "ORGANIZING-NODES-FOR-FILTER", 2, 0, false);
            declareFunction("complete_extent_should_be_queried_from_kbP", "COMPLETE-EXTENT-SHOULD-BE-QUERIED-FROM-KB?", 1, 0, false);
            declareFunction("decision_tree_filterP", "DECISION-TREE-FILTER?", 1, 0, false);
            declareFunction("clear_filter_defn", "CLEAR-FILTER-DEFN", 0, 0, false);
            declareFunction("remove_filter_defn", "REMOVE-FILTER-DEFN", 2, 0, false);
            declareFunction("filter_defn_internal", "FILTER-DEFN-INTERNAL", 2, 0, false);
            declareFunction("filter_defn", "FILTER-DEFN", 2, 0, false);
            declareFunction("concept_tagging_irrelevant_termP", "CONCEPT-TAGGING-IRRELEVANT-TERM?", 1, 0, false);
            declareFunction("predicate_filter_tagging_defn", "PREDICATE-FILTER-TAGGING-DEFN", 2, 1, false);
            declareFunction("bad_for_tagging_defn", "BAD-FOR-TAGGING-DEFN", 2, 1, false);
            declareFunction("clear_bad_for_taggingP", "CLEAR-BAD-FOR-TAGGING?", 0, 0, false);
            declareFunction("remove_bad_for_taggingP", "REMOVE-BAD-FOR-TAGGING?", 1, 1, false);
            declareFunction("bad_for_taggingP_internal", "BAD-FOR-TAGGING?-INTERNAL", 2, 0, false);
            declareFunction("bad_for_taggingP", "BAD-FOR-TAGGING?", 1, 1, false);
            declareFunction("organizing_node_for_filterP", "ORGANIZING-NODE-FOR-FILTER?", 1, 2, false);
            declareFunction("valid_concept_filter_nodes", "VALID-CONCEPT-FILTER-NODES", 1, 1, false);
            declareFunction("valid_concept_filter_nodes_memoized_internal", "VALID-CONCEPT-FILTER-NODES-MEMOIZED-INTERNAL", 2, 0, false);
            declareFunction("valid_concept_filter_nodes_memoized", "VALID-CONCEPT-FILTER-NODES-MEMOIZED", 2, 0, false);
            declareFunction("clear_decompose_concept_filter_spec", "CLEAR-DECOMPOSE-CONCEPT-FILTER-SPEC", 0, 0, false);
            declareFunction("remove_decompose_concept_filter_spec", "REMOVE-DECOMPOSE-CONCEPT-FILTER-SPEC", 1, 1, false);
            declareFunction("decompose_concept_filter_spec_internal", "DECOMPOSE-CONCEPT-FILTER-SPEC-INTERNAL", 2, 0, false);
            declareFunction("decompose_concept_filter_spec", "DECOMPOSE-CONCEPT-FILTER-SPEC", 1, 1, false);
            declareFunction("decompose_concept_filter_spec_new", "DECOMPOSE-CONCEPT-FILTER-SPEC-NEW", 2, 0, false);
            declareFunction("concept_filter_specification_filter", "CONCEPT-FILTER-SPECIFICATION-FILTER", 1, 1, false);
            declareFunction("new_adhoc_concept_filter_spec", "NEW-ADHOC-CONCEPT-FILTER-SPEC", 1, 1, false);
            declareFunction("new_adhoc_isa_concept_filter_spec", "NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC", 1, 1, false);
            declareFunction("new_adhoc_genls_concept_filter_spec", "NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("decompose_concept_filter_spec_old", "DECOMPOSE-CONCEPT-FILTER-SPEC-OLD", 2, 0, false);
            declareFunction("prepare_text_file_for_decision_tree_filter_annotation", "PREPARE-TEXT-FILE-FOR-DECISION-TREE-FILTER-ANNOTATION", 1, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_concept_filter_file_Previous() {
        declareFunction("clear_concept_filter_caches", "CLEAR-CONCEPT-FILTER-CACHES", 0, 0, false);
        declareMacro("with_new_concept_filter_memoization_state", "WITH-NEW-CONCEPT-FILTER-MEMOIZATION-STATE");
        declareMacro("with_concept_filter_memoization_state", "WITH-CONCEPT-FILTER-MEMOIZATION-STATE");
        declareFunction("clear_concept_filter_specification_p", "CLEAR-CONCEPT-FILTER-SPECIFICATION-P", 0, 0, false);
        declareFunction("remove_concept_filter_specification_p", "REMOVE-CONCEPT-FILTER-SPECIFICATION-P", 1, 0, false);
        declareFunction("concept_filter_specification_p_internal", "CONCEPT-FILTER-SPECIFICATION-P-INTERNAL", 1, 0, false);
        declareFunction("concept_filter_specification_p", "CONCEPT-FILTER-SPECIFICATION-P", 1, 0, false);
        declareFunction("get_default_concept_filter_specification", "GET-DEFAULT-CONCEPT-FILTER-SPECIFICATION", 0, 0, false);
        declareFunction("nodes_for_concept_filter_after_adding", "NODES-FOR-CONCEPT-FILTER-AFTER-ADDING", 2, 0, false);
        declareFunction("nodes_for_concept_filter_after_removing", "NODES-FOR-CONCEPT-FILTER-AFTER-REMOVING", 2, 0, false);
        declareFunction("clear_concept_filter_all_isa", "CLEAR-CONCEPT-FILTER-ALL-ISA", 0, 0, false);
        new concept_filter.$clear_concept_filter_all_isa$ZeroArityFunction();
        declareFunction("remove_concept_filter_all_isa", "REMOVE-CONCEPT-FILTER-ALL-ISA", 2, 0, false);
        declareFunction("concept_filter_all_isa_internal", "CONCEPT-FILTER-ALL-ISA-INTERNAL", 2, 0, false);
        declareFunction("concept_filter_all_isa", "CONCEPT-FILTER-ALL-ISA", 2, 0, false);
        declareFunction("clear_specified_nodes_in_filter", "CLEAR-SPECIFIED-NODES-IN-FILTER", 0, 0, false);
        declareFunction("remove_specified_nodes_in_filter", "REMOVE-SPECIFIED-NODES-IN-FILTER", 2, 0, false);
        declareFunction("specified_nodes_in_filter_internal", "SPECIFIED-NODES-IN-FILTER-INTERNAL", 2, 0, false);
        declareFunction("specified_nodes_in_filter", "SPECIFIED-NODES-IN-FILTER", 2, 0, false);
        declareFunction("specified_nodes_in_filter_cached_p", "SPECIFIED-NODES-IN-FILTER-CACHED-P", 2, 0, false);
        declareFunction("specified_node_in_filterP", "SPECIFIED-NODE-IN-FILTER?", 1, 2, false);
        declareFunction("query_for_individual_terms_from_filterP", "QUERY-FOR-INDIVIDUAL-TERMS-FROM-FILTER?", 1, 0, false);
        declareFunction("node_suppressed_from_filterP", "NODE-SUPPRESSED-FROM-FILTER?", 3, 0, false);
        declareFunction("clear_nodes_suppressed_from_filter", "CLEAR-NODES-SUPPRESSED-FROM-FILTER", 0, 0, false);
        new concept_filter.$clear_nodes_suppressed_from_filter$ZeroArityFunction();
        declareFunction("remove_nodes_suppressed_from_filter", "REMOVE-NODES-SUPPRESSED-FROM-FILTER", 2, 0, false);
        declareFunction("nodes_suppressed_from_filter_internal", "NODES-SUPPRESSED-FROM-FILTER-INTERNAL", 2, 0, false);
        declareFunction("nodes_suppressed_from_filter", "NODES-SUPPRESSED-FROM-FILTER", 2, 0, false);
        declareFunction("clear_organizing_nodes_for_filter", "CLEAR-ORGANIZING-NODES-FOR-FILTER", 0, 0, false);
        declareFunction("remove_organizing_nodes_for_filter", "REMOVE-ORGANIZING-NODES-FOR-FILTER", 2, 0, false);
        declareFunction("organizing_nodes_for_filter_internal", "ORGANIZING-NODES-FOR-FILTER-INTERNAL", 2, 0, false);
        declareFunction("organizing_nodes_for_filter", "ORGANIZING-NODES-FOR-FILTER", 2, 0, false);
        declareFunction("complete_extent_should_be_queried_from_kbP", "COMPLETE-EXTENT-SHOULD-BE-QUERIED-FROM-KB?", 1, 0, false);
        declareFunction("decision_tree_filterP", "DECISION-TREE-FILTER?", 1, 0, false);
        declareFunction("clear_filter_defn", "CLEAR-FILTER-DEFN", 0, 0, false);
        declareFunction("remove_filter_defn", "REMOVE-FILTER-DEFN", 2, 0, false);
        declareFunction("filter_defn_internal", "FILTER-DEFN-INTERNAL", 2, 0, false);
        declareFunction("filter_defn", "FILTER-DEFN", 2, 0, false);
        declareFunction("concept_tagging_irrelevant_termP", "CONCEPT-TAGGING-IRRELEVANT-TERM?", 1, 0, false);
        declareFunction("predicate_filter_tagging_defn", "PREDICATE-FILTER-TAGGING-DEFN", 2, 1, false);
        declareFunction("bad_for_tagging_defn", "BAD-FOR-TAGGING-DEFN", 2, 1, false);
        declareFunction("clear_bad_for_taggingP", "CLEAR-BAD-FOR-TAGGING?", 0, 0, false);
        declareFunction("remove_bad_for_taggingP", "REMOVE-BAD-FOR-TAGGING?", 1, 1, false);
        declareFunction("bad_for_taggingP_internal", "BAD-FOR-TAGGING?-INTERNAL", 2, 0, false);
        declareFunction("bad_for_taggingP", "BAD-FOR-TAGGING?", 1, 1, false);
        declareFunction("organizing_node_for_filterP", "ORGANIZING-NODE-FOR-FILTER?", 1, 2, false);
        declareFunction("valid_concept_filter_nodes", "VALID-CONCEPT-FILTER-NODES", 1, 1, false);
        declareFunction("valid_concept_filter_nodes_memoized_internal", "VALID-CONCEPT-FILTER-NODES-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("valid_concept_filter_nodes_memoized", "VALID-CONCEPT-FILTER-NODES-MEMOIZED", 2, 0, false);
        declareFunction("clear_decompose_concept_filter_spec", "CLEAR-DECOMPOSE-CONCEPT-FILTER-SPEC", 0, 0, false);
        declareFunction("remove_decompose_concept_filter_spec", "REMOVE-DECOMPOSE-CONCEPT-FILTER-SPEC", 1, 1, false);
        declareFunction("decompose_concept_filter_spec_internal", "DECOMPOSE-CONCEPT-FILTER-SPEC-INTERNAL", 2, 0, false);
        declareFunction("decompose_concept_filter_spec", "DECOMPOSE-CONCEPT-FILTER-SPEC", 1, 1, false);
        declareFunction("decompose_concept_filter_spec_new", "DECOMPOSE-CONCEPT-FILTER-SPEC-NEW", 2, 0, false);
        declareFunction("concept_filter_specification_filter", "CONCEPT-FILTER-SPECIFICATION-FILTER", 1, 1, false);
        declareFunction("new_adhoc_concept_filter_spec", "NEW-ADHOC-CONCEPT-FILTER-SPEC", 1, 1, false);
        declareFunction("new_adhoc_isa_concept_filter_spec", "NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC", 1, 1, false);
        declareFunction("new_adhoc_genls_concept_filter_spec", "NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_concept_filter_file() {
        defparameter("*CONCEPT-FILTER-DEFAULT-MT*", $$InferencePSC);
        defparameter("*DEFAULT-CONCEPT-FILTER*", $const1$TaxonomyOfEasilyUnderstandableCon);
        defparameter("*DEFAULT-CONCEPT-FILTER-SPECIFICATION*", NIL);
        defparameter("*CONCEPT-FILTER-MEMOIZATION-STATE*", NIL);
        deflexical("*CONCEPT-FILTER-SPECIFICATION-P-CACHING-STATE*", NIL);
        deflexical("*CONCEPT-FILTER-ALL-ISA-CACHING-STATE*", NIL);
        deflexical("*SPECIFIED-NODES-IN-FILTER-CACHING-STATE*", NIL);
        deflexical("*NODES-SUPPRESSED-FROM-FILTER-CACHING-STATE*", NIL);
        deflexical("*ORGANIZING-NODES-FOR-FILTER-CACHING-STATE*", NIL);
        deflexical("*FILTER-DEFN-CACHING-STATE*", NIL);
        deflexical("*BAD-FOR-TAGGING?-CACHING-STATE*", NIL);
        deflexical("*DECOMPOSE-CONCEPT-FILTER-SPEC-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_concept_filter_file_alt() {
        memoization_state.note_globally_cached_function(CONCEPT_FILTER_SPECIFICATION_P);
        register_kb_function(NODES_FOR_CONCEPT_FILTER_AFTER_ADDING);
        register_kb_function(NODES_FOR_CONCEPT_FILTER_AFTER_REMOVING);
        memoization_state.note_globally_cached_function(CONCEPT_FILTER_ALL_ISA);
        memoization_state.note_globally_cached_function(SPECIFIED_NODES_IN_FILTER);
        memoization_state.note_globally_cached_function(NODES_SUPPRESSED_FROM_FILTER);
        memoization_state.note_globally_cached_function(ORGANIZING_NODES_FOR_FILTER);
        memoization_state.note_globally_cached_function(FILTER_DEFN);
        register_kb_function($sym64$CONCEPT_TAGGING_IRRELEVANT_TERM_);
        memoization_state.note_globally_cached_function($sym65$BAD_FOR_TAGGING_);
        memoization_state.note_memoized_function(VALID_CONCEPT_FILTER_NODES_MEMOIZED);
        memoization_state.note_globally_cached_function(DECOMPOSE_CONCEPT_FILTER_SPEC);
        register_external_symbol(NEW_ADHOC_CONCEPT_FILTER_SPEC);
        register_external_symbol(NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC);
        register_external_symbol(NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC);
        define_test_case_table_int(VALID_CONCEPT_FILTER_NODES, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt123);
        return NIL;
    }

    public static SubLObject setup_concept_filter_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function(CONCEPT_FILTER_SPECIFICATION_P);
            register_kb_function(NODES_FOR_CONCEPT_FILTER_AFTER_ADDING);
            register_kb_function(NODES_FOR_CONCEPT_FILTER_AFTER_REMOVING);
            memoization_state.note_globally_cached_function(CONCEPT_FILTER_ALL_ISA);
            memoization_state.note_globally_cached_function(SPECIFIED_NODES_IN_FILTER);
            memoization_state.note_globally_cached_function(NODES_SUPPRESSED_FROM_FILTER);
            memoization_state.note_globally_cached_function(ORGANIZING_NODES_FOR_FILTER);
            memoization_state.note_globally_cached_function(FILTER_DEFN);
            register_kb_function($sym65$CONCEPT_TAGGING_IRRELEVANT_TERM_);
            memoization_state.note_globally_cached_function($sym66$BAD_FOR_TAGGING_);
            memoization_state.note_memoized_function(VALID_CONCEPT_FILTER_NODES_MEMOIZED);
            memoization_state.note_globally_cached_function(DECOMPOSE_CONCEPT_FILTER_SPEC);
            register_external_symbol(NEW_ADHOC_CONCEPT_FILTER_SPEC);
            register_external_symbol(NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC);
            register_external_symbol(NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC);
            define_test_case_table_int(VALID_CONCEPT_FILTER_NODES, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list108);
        }
        if (SubLFiles.USE_V2) {
            register_kb_function($sym64$CONCEPT_TAGGING_IRRELEVANT_TERM_);
            memoization_state.note_globally_cached_function($sym65$BAD_FOR_TAGGING_);
            define_test_case_table_int(VALID_CONCEPT_FILTER_NODES, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt123);
        }
        return NIL;
    }

    public static SubLObject setup_concept_filter_file_Previous() {
        memoization_state.note_globally_cached_function(CONCEPT_FILTER_SPECIFICATION_P);
        register_kb_function(NODES_FOR_CONCEPT_FILTER_AFTER_ADDING);
        register_kb_function(NODES_FOR_CONCEPT_FILTER_AFTER_REMOVING);
        memoization_state.note_globally_cached_function(CONCEPT_FILTER_ALL_ISA);
        memoization_state.note_globally_cached_function(SPECIFIED_NODES_IN_FILTER);
        memoization_state.note_globally_cached_function(NODES_SUPPRESSED_FROM_FILTER);
        memoization_state.note_globally_cached_function(ORGANIZING_NODES_FOR_FILTER);
        memoization_state.note_globally_cached_function(FILTER_DEFN);
        register_kb_function($sym65$CONCEPT_TAGGING_IRRELEVANT_TERM_);
        memoization_state.note_globally_cached_function($sym66$BAD_FOR_TAGGING_);
        memoization_state.note_memoized_function(VALID_CONCEPT_FILTER_NODES_MEMOIZED);
        memoization_state.note_globally_cached_function(DECOMPOSE_CONCEPT_FILTER_SPEC);
        register_external_symbol(NEW_ADHOC_CONCEPT_FILTER_SPEC);
        register_external_symbol(NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC);
        register_external_symbol(NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC);
        define_test_case_table_int(VALID_CONCEPT_FILTER_NODES, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list108);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_concept_filter_file();
    }

    @Override
    public void initializeVariables() {
        init_concept_filter_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_concept_filter_file();
    }

    static {
    }

    public static final class $clear_concept_filter_all_isa$ZeroArityFunction extends ZeroArityFunction {
        public $clear_concept_filter_all_isa$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-CONCEPT-FILTER-ALL-ISA"));
        }

        @Override
        public SubLObject processItem() {
            return clear_concept_filter_all_isa();
        }
    }

    public static final class $clear_nodes_suppressed_from_filter$ZeroArityFunction extends ZeroArityFunction {
        public $clear_nodes_suppressed_from_filter$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-NODES-SUPPRESSED-FROM-FILTER"));
        }

        @Override
        public SubLObject processItem() {
            return clear_nodes_suppressed_from_filter();
        }
    }

    static private final SubLList $list_alt3 = list(list(makeSymbol("*CONCEPT-FILTER-MEMOIZATION-STATE*"), list(makeSymbol("NEW-MEMOIZATION-STATE"))));

    static private final SubLList $list_alt5 = list(makeSymbol("*CONCEPT-FILTER-MEMOIZATION-STATE*"));

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("ConceptFilterSpecification"));

    public static final SubLSymbol $kw12$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt13 = list(reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept"));

    static private final SubLSymbol $sym18$_VAR0 = makeSymbol("?VAR0");

    static private final SubLList $list_alt19 = list(makeSymbol("?VAR0"));

    static private final SubLSymbol $sym24$_X = makeSymbol("?X");

    static private final SubLList $list_alt26 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    static private final SubLString $str_alt35$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt40$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt42$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt43$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLSymbol $sym47$_NODE = makeSymbol("?NODE");

    static private final SubLList $list_alt49 = list(makeSymbol("?NODE"));

    static private final SubLSymbol $sym62$TERM_FAILS_CLASSIFICATION_TREE_FILTER_ = makeSymbol("TERM-FAILS-CLASSIFICATION-TREE-FILTER?");

    static private final SubLSymbol $sym64$CONCEPT_TAGGING_IRRELEVANT_TERM_ = makeSymbol("CONCEPT-TAGGING-IRRELEVANT-TERM?");

    static private final SubLSymbol $sym65$BAD_FOR_TAGGING_ = makeSymbol("BAD-FOR-TAGGING?");

    static private final SubLList $list_alt66 = list(reader_make_constant_shell("InstanceNamedFn"), reader_make_constant_shell("InstanceNamedFn-Ternary"), reader_make_constant_shell("ThingDescribableAsFn"), reader_make_constant_shell("Kappa"));

    static private final SubLSymbol $sym67$_BAD_FOR_TAGGING__CACHING_STATE_ = makeSymbol("*BAD-FOR-TAGGING?-CACHING-STATE*");

    static private final SubLString $str_alt68$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt70 = list(makeSymbol("CONCEPT-FILTER"), makeSymbol("ALLOW-SPECS"), makeSymbol("ALLOW-INSTANCES"), makeSymbol("RETURN-INSTANCES"), makeSymbol("MT"));

    static private final SubLSymbol $sym74$_MT = makeSymbol("?MT");

    public static final SubLObject $const75$conceptFilterSpecificationDefinin = reader_make_constant_shell("conceptFilterSpecificationDefiningMt");

    static private final SubLList $list_alt76 = list(makeSymbol("?MT"));

    static private final SubLSymbol $sym78$_TRIGGER = makeSymbol("?TRIGGER");

    static private final SubLList $list_alt80 = list(makeSymbol("?TRIGGER"));

    static private final SubLList $list_alt81 = list(reader_make_constant_shell("TriggerFromConceptOrSpec"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"));

    static private final SubLList $list_alt82 = list(reader_make_constant_shell("TriggerFromConceptOrInstance"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"));

    static private final SubLSymbol $sym83$_MODE = makeSymbol("?MODE");

    static private final SubLList $list_alt85 = list(makeSymbol("?MODE"));

    public static final SubLObject $const86$ConceptAndInstancesFilterParamete = reader_make_constant_shell("ConceptAndInstancesFilterParameter");

    static private final SubLList $list_alt87 = list(makeSymbol("THIS-FILTER"), makeSymbol("MODE"), makeSymbol("TRIGGER"));

    static private final SubLList $list_alt88 = list(makeSymbol("?FILTER"), makeSymbol("?MODE"), makeSymbol("?TRIGGER"));



    static private final SubLSymbol $sym90$_FILTER = makeSymbol("?FILTER");

    static private final SubLList $list_alt91 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"));

    static private final SubLList $list_alt92 = list(makeSymbol("?FILTER"));

    public static final SubLObject $const96$ConceptFilterSpecificationWithMtF = reader_make_constant_shell("ConceptFilterSpecificationWithMtFn");

    static private final SubLList $list_alt97 = list(reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept"), makeSymbol("MT"));

    static private final SubLSymbol $sym99$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");

    static private final SubLSymbol $sym100$_TERM = makeSymbol("?TERM");

    static private final SubLString $str_alt105$_out = makeString(".out");

    static private final SubLString $str_alt106$can_t_find_file__S__ = makeString("can't find file ~S~%");

    static private final SubLString $str_alt108$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt111$_A___A__ = makeString("~A. ~A~%");

    static private final SubLString $str_alt112$sentence___S__ = makeString("sentence: ~S~%");

    static private final SubLString $str_alt113$_____A__ = makeString("    ~A: ");

    static private final SubLString $str_alt114$_A_ = makeString("~A ");

    static private final SubLString $$$daves = makeString("daves");

    static private final SubLList $list_alt123 = list(list(list(reader_make_constant_shell("Iran")), list(reader_make_constant_shell("Iran"))), list(list(reader_make_constant_shell("RussiasOfferToEnrichUraniumForIran")), list(reader_make_constant_shell("RussiasOfferToEnrichUraniumForIran"))), list(list(reader_make_constant_shell("Refusing-CommunicationAct")), list(reader_make_constant_shell("Refusing-CommunicationAct"))), list(list(list(reader_make_constant_shell("ResearchingAndDevelopingFn"), reader_make_constant_shell("NuclearWeapon"))), list(list(reader_make_constant_shell("ResearchingAndDevelopingFn"), reader_make_constant_shell("NuclearWeapon")))), list(list(reader_make_constant_shell("Collection")), NIL), list(list(reader_make_constant_shell("PartiallyTangible")), NIL));
}

/**
 * Total time: 743 ms
 */
