package com.cyc.cycjava.cycl.sksi.query_sks;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_sparql_removal_module_generation extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_sparql_removal_module_generation();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation";

    public static final String myFingerPrint = "57a19de48f9da7b22071bd7df7716858e50cf2bbd1813c856b1f52f06b379830";



    // Internal Constants
    public static final SubLSymbol $sksi_sparql_removal_modules$ = makeSymbol("*SKSI-SPARQL-REMOVAL-MODULES*");

    public static final SubLList $list1 = list(list(makeSymbol("SKS"), makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list3 = list(makeSymbol("*SKSI-SPARQL-REMOVAL-MODULES*"));

    public static final SubLList $list4 = list(list(makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym5$SKS = makeUninternedSymbol("SKS");

    public static final SubLSymbol DO_SKSI_SPARQL_REMOVAL_MODULES_BY_SKS = makeSymbol("DO-SKSI-SPARQL-REMOVAL-MODULES-BY-SKS");



    private static final SubLObject $$RDFTripleStore_Physical = reader_make_constant_shell(makeString("RDFTripleStore-Physical"));

    public static final SubLString $str9$SKSI_sparql____ist_Graph__variabl = makeString("SKSI sparql (#$ist-Graph :variable . :fully-bound) removal module for ");

    public static final SubLString $str10$_ = makeString(".");



    private static final SubLObject $$ist_Graph = reader_make_constant_shell(makeString("ist-Graph"));















    public static final SubLList $list20 = listS(reader_make_constant_shell(makeString("ist-Graph")), makeKeyword("VARIABLE"), makeKeyword("FULLY-BOUND"));



    public static final SubLSymbol REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY = makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-APPLICABILITY");





    public static final SubLSymbol REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST = makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COST");





    public static final SubLSymbol REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS = makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COMPLETENESS");



    public static final SubLSymbol REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE = makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-OUTPUT-GENERATE");



    public static final SubLString $str32$_ = makeString("-");

    public static final SubLString $str33$_ = makeString("_");

    public static final SubLString $str34$REMOVAL_SKSI_ = makeString("REMOVAL-SKSI-");

    public static final SubLString $str35$_SPARQL_IST_GRAPH_POS_LITS = makeString("-SPARQL-IST-GRAPH-POS-LITS");

    private static final SubLObject $$ThePhysicalFieldValueFn = reader_make_constant_shell(makeString("ThePhysicalFieldValueFn"));

    public static final SubLList $list37 = list(makeString("subject"));



    public static SubLObject note_sksi_sparql_removal_module(final SubLObject hl_module, final SubLObject sks) {
        return dictionary.dictionary_enter($sksi_sparql_removal_modules$.getGlobalValue(), sks, hl_module);
    }

    public static SubLObject un_note_sksi_sparql_removal_module(final SubLObject hl_module) {
        return dictionary.dictionary_remove($sksi_sparql_removal_modules$.getGlobalValue(), hl_module);
    }

    public static SubLObject clear_sksi_sparql_removal_modules() {
        return dictionary.clear_dictionary($sksi_sparql_removal_modules$.getGlobalValue());
    }

    public static SubLObject look_up_sksi_sparql_removal_module(final SubLObject hl_module) {
        return dictionary.dictionary_lookup($sksi_sparql_removal_modules$.getGlobalValue(), hl_module, UNPROVIDED);
    }

    public static SubLObject sksi_sparql_removal_modules_count() {
        return dictionary.dictionary_length($sksi_sparql_removal_modules$.getGlobalValue());
    }

    public static SubLObject some_sksi_sparql_removal_modules_registeredP() {
        return makeBoolean(NIL == dictionary.dictionary_empty_p($sksi_sparql_removal_modules$.getGlobalValue()));
    }

    public static SubLObject do_sksi_sparql_removal_modules_by_sks(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sks = NIL;
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        sks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        hl_module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_DICTIONARY, listS(sks, hl_module, $list3), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list1);
        return NIL;
    }

    public static SubLObject do_sksi_sparql_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        hl_module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject sks = $sym5$SKS;
            return listS(DO_SKSI_SPARQL_REMOVAL_MODULES_BY_SKS, list(sks, hl_module), list(IGNORE, sks), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    public static SubLObject register_sksi_sparql_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        if (NIL == mapping_mt) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            SubLObject ks = NIL;
            ks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                count = add(count, register_sksi_sparql_removal_modules_for_just_sks(ks, NIL, UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }

    public static SubLObject register_sksi_sparql_removal_modules_for_just_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        SubLObject count = ZERO_INTEGER;
        if (NIL != kb_utilities.kbeq(sksi_sks_accessors.sks_get_type(sks), $$RDFTripleStore_Physical)) {
            if (NIL == mapping_mt) {
                mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
            }
            deregister_sksi_sparql_removal_modules_for_just_sks(sks, UNPROVIDED);
            count = register_sksi_sparql_removal_modules_for_just_sks_int(sks, mapping_mt);
            if (NIL != reclassifyP) {
                inference_modules.reclassify_removal_modules();
            }
        }
        return count;
    }

    public static SubLObject deregister_sksi_sparql_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        if (NIL == mapping_mt) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            SubLObject ks = NIL;
            ks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                count = add(count, deregister_sksi_sparql_removal_modules_for_just_sks(ks, NIL));
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }

    public static SubLObject deregister_sksi_sparql_removal_modules_for_just_sks(final SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($sksi_sparql_removal_modules$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject module_sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject hl_module = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (module_sks.equal(sks)) {
                final SubLObject name = inference_modules.hl_module_name(hl_module);
                un_note_sksi_sparql_removal_module(sks);
                inference_modules.undeclare_inference_removal_module(name, UNPROVIDED);
                count = add(count, ONE_INTEGER);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }

    public static SubLObject deregister_all_sksi_sparql_removal_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($sksi_sparql_removal_modules$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject hl_module = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            inference_modules.undeclare_inference_removal_module(name, UNPROVIDED);
            count = add(count, ONE_INTEGER);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        clear_sksi_sparql_removal_modules();
        inference_modules.reclassify_removal_modules();
        return count;
    }

    public static SubLObject register_sksi_sparql_removal_modules_for_just_sks_int(final SubLObject sks, final SubLObject mapping_mt) {
        final SubLObject sks_profile = sksi_query_datastructures.new_sks_profile(sks, mapping_mt, T);
        SubLObject count = ZERO_INTEGER;
        SubLObject hl_module = NIL;
        if (NIL != sksi_query_datastructures.valid_and_supported_sks_profile(sks_profile)) {
            final SubLObject name = determine_sparql_ist_graph_removal_module_name(sks);
            final SubLObject doc_string = cconcatenate($str9$SKSI_sparql____ist_Graph__variabl, new SubLObject[]{ format_nil.format_nil_s_no_copy(sks), $str10$_ });
            final SubLObject plist = list(new SubLObject[]{ $PREDICATE, $$ist_Graph, $MODULE_SUBTYPE, $SKSI, $MODULE_SOURCE, sks, $SENSE, $POS, $REQUIRED_PATTERN, list($AND, $list20, list($TEST, REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY, sks_profile)), $COST_PATTERN, list($CALL, REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST, $INPUT, sks_profile), $COMPLETENESS_PATTERN, list($CALL, REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS, $INPUT, sks_profile), $EXPAND_PATTERN, list($CALL, REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE, $INPUT, sks_profile), $DOCUMENTATION, doc_string });
            hl_module = inference_modules.inference_removal_module(name, plist);
            note_sksi_sparql_removal_module(hl_module, sks);
            count = add(count, ONE_INTEGER);
        }
        return count;
    }

    public static SubLObject determine_sparql_ist_graph_removal_module_name(final SubLObject sks) {
        if (NIL == sks) {
            return NIL;
        }
        final SubLObject sks_name = sksi_kb_accessors.sk_source_name(sks);
        final SubLObject core_name_string = (NIL != sks_name) ? string_utilities.string_substitute($str32$_, $str33$_, Strings.string_upcase(sks_name, UNPROVIDED, UNPROVIDED), UNPROVIDED) : NIL;
        final SubLObject core_name_symbol = gensym(core_name_string);
        final SubLObject name_string = cconcatenate($str34$REMOVAL_SKSI_, new SubLObject[]{ format_nil.format_nil_a_no_copy(core_name_symbol), $str35$_SPARQL_IST_GRAPH_POS_LITS });
        final SubLObject name = make_keyword(name_string);
        return name;
    }

    public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_applicability(final SubLObject asent, final SubLObject sks_profile) {
        return T;
    }

    public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_cost(final SubLObject asent, final SubLObject sks_profile) {
        return ZERO_INTEGER;
    }

    public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_completeness(final SubLObject asent, final SubLObject sks_profile) {
        final SubLObject mapping_mt = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
        return sksi_removal_module_generation.sksi_removal_module_completeness(asent, list(sksi_kb_accessors.logical_schema_for_meaning_sentence_predicate($$ist_Graph, mapping_mt)));
    }

    public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_output_generate(final SubLObject asent, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject ist_graph = unmake_binary_formula(asent);
        final SubLObject variable = thread.secondMultipleValue();
        final SubLObject subsentence = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        final SubLObject _prev_bind_0 = sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.currentBinding(thread);
        try {
            sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.bind(variable, thread);
            final SubLObject sksi_sparql_ist_graph_result_set = NIL;
            thread.resetMultipleValues();
            final SubLObject results = ask_utilities.inference_recursive_query(subsentence, mt, UNPROVIDED);
            final SubLObject halt_reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (((NIL == inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason)) && (NIL != sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.getDynamicValue(thread))) && (NIL != results)) {
                final SubLObject v_graph = sksi_sparql_decode_ist_graph_arg1(sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.getDynamicValue(thread), sks_profile);
                final SubLObject support = arguments.make_hl_support($SKSI, make_ternary_formula($$ist_Graph, v_graph, subsentence, mt), UNPROVIDED, UNPROVIDED);
                backward.removal_add_node(support, list(cons(sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.getDynamicValue(thread), v_graph)), UNPROVIDED);
            }
        } finally {
            sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_sparql_decode_ist_graph_arg1(final SubLObject graph_result, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        final SubLObject mapping_mt = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
        SubLObject result = NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject ls = sksi_kb_accessors.logical_schema_for_meaning_sentence_predicate($$ist_Graph, UNPROVIDED);
            final SubLObject ps = sksi_kb_accessors.logical_schema_physical_schemata(ls).first();
            final SubLObject pfi = narts_high.find_nart(listS($$ThePhysicalFieldValueFn, ps, $list37));
            final SubLObject fd = sksi_field_translation_utilities.get_field_decodings_from_physical_field_indexical(pfi, list(ls), UNPROVIDED).first();
            result = sksi_reformulate.sksi_reformulate(list_utilities.tree_substitute(fd, pfi, graph_result), $DECODE, sks);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject declare_sksi_sparql_removal_module_generation_file() {
        declareFunction(me, "note_sksi_sparql_removal_module", "NOTE-SKSI-SPARQL-REMOVAL-MODULE", 2, 0, false);
        declareFunction(me, "un_note_sksi_sparql_removal_module", "UN-NOTE-SKSI-SPARQL-REMOVAL-MODULE", 1, 0, false);
        declareFunction(me, "clear_sksi_sparql_removal_modules", "CLEAR-SKSI-SPARQL-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "look_up_sksi_sparql_removal_module", "LOOK-UP-SKSI-SPARQL-REMOVAL-MODULE", 1, 0, false);
        declareFunction(me, "sksi_sparql_removal_modules_count", "SKSI-SPARQL-REMOVAL-MODULES-COUNT", 0, 0, false);
        declareFunction(me, "some_sksi_sparql_removal_modules_registeredP", "SOME-SKSI-SPARQL-REMOVAL-MODULES-REGISTERED?", 0, 0, false);
        declareMacro(me, "do_sksi_sparql_removal_modules_by_sks", "DO-SKSI-SPARQL-REMOVAL-MODULES-BY-SKS");
        declareMacro(me, "do_sksi_sparql_removal_modules", "DO-SKSI-SPARQL-REMOVAL-MODULES");
        declareFunction(me, "register_sksi_sparql_removal_modules_for_sks", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        declareFunction(me, "register_sksi_sparql_removal_modules_for_just_sks", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS", 1, 2, false);
        declareFunction(me, "deregister_sksi_sparql_removal_modules_for_sks", "DEREGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        declareFunction(me, "deregister_sksi_sparql_removal_modules_for_just_sks", "DEREGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS", 1, 1, false);
        declareFunction(me, "deregister_all_sksi_sparql_removal_modules", "DEREGISTER-ALL-SKSI-SPARQL-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "register_sksi_sparql_removal_modules_for_just_sks_int", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS-INT", 2, 0, false);
        declareFunction(me, "determine_sparql_ist_graph_removal_module_name", "DETERMINE-SPARQL-IST-GRAPH-REMOVAL-MODULE-NAME", 1, 0, false);
        declareFunction(me, "removal_sksi_sparql_ist_graph_pos_lits_applicability", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-APPLICABILITY", 2, 0, false);
        declareFunction(me, "removal_sksi_sparql_ist_graph_pos_lits_cost", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COST", 2, 0, false);
        declareFunction(me, "removal_sksi_sparql_ist_graph_pos_lits_completeness", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COMPLETENESS", 2, 0, false);
        declareFunction(me, "removal_sksi_sparql_ist_graph_pos_lits_output_generate", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-OUTPUT-GENERATE", 2, 0, false);
        declareFunction(me, "sksi_sparql_decode_ist_graph_arg1", "SKSI-SPARQL-DECODE-IST-GRAPH-ARG1", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_sparql_removal_module_generation_file() {
        deflexical("*SKSI-SPARQL-REMOVAL-MODULES*", SubLSystemTrampolineFile.maybeDefault($sksi_sparql_removal_modules$, $sksi_sparql_removal_modules$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_sksi_sparql_removal_module_generation_file() {
        declare_defglobal($sksi_sparql_removal_modules$);
        note_funcall_helper_function(REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY);
        note_funcall_helper_function(REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST);
        note_funcall_helper_function(REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS);
        note_funcall_helper_function(REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_sparql_removal_module_generation_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_sparql_removal_module_generation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_sparql_removal_module_generation_file();
    }

    
}

/**
 * Total time: 136 ms
 */
