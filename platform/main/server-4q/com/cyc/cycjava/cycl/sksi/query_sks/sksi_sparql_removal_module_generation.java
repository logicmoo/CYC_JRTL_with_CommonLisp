/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
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

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_sparql_removal_module_generation extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_sparql_removal_module_generation();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $sksi_sparql_removal_modules$ = makeSymbol("*SKSI-SPARQL-REMOVAL-MODULES*");

    static private final SubLList $list1 = list(list(makeSymbol("SKS"), makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list3 = list(makeSymbol("*SKSI-SPARQL-REMOVAL-MODULES*"));

    static private final SubLList $list4 = list(list(makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym5$SKS = makeUninternedSymbol("SKS");

    private static final SubLSymbol DO_SKSI_SPARQL_REMOVAL_MODULES_BY_SKS = makeSymbol("DO-SKSI-SPARQL-REMOVAL-MODULES-BY-SKS");

    private static final SubLObject $$RDFTripleStore_Physical = reader_make_constant_shell("RDFTripleStore-Physical");

    static private final SubLString $str9$SKSI_sparql____ist_Graph__variabl = makeString("SKSI sparql (#$ist-Graph :variable . :fully-bound) removal module for ");

    static private final SubLString $str10$_ = makeString(".");

    private static final SubLObject $$ist_Graph = reader_make_constant_shell("ist-Graph");

    static private final SubLList $list20 = listS(reader_make_constant_shell("ist-Graph"), makeKeyword("VARIABLE"), makeKeyword("FULLY-BOUND"));

    private static final SubLSymbol REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY = makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-APPLICABILITY");

    private static final SubLSymbol REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST = makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COST");

    private static final SubLSymbol REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS = makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COMPLETENESS");

    private static final SubLSymbol REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE = makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-OUTPUT-GENERATE");

    static private final SubLString $str32$_ = makeString("-");

    static private final SubLString $str33$_ = makeString("_");

    static private final SubLString $str34$REMOVAL_SKSI_ = makeString("REMOVAL-SKSI-");

    static private final SubLString $str35$_SPARQL_IST_GRAPH_POS_LITS = makeString("-SPARQL-IST-GRAPH-POS-LITS");



    static private final SubLList $list37 = list(makeString("subject"));

    public static final SubLObject note_sksi_sparql_removal_module_alt(SubLObject hl_module, SubLObject sks) {
        return dictionary.dictionary_enter($sksi_sparql_removal_modules$.getGlobalValue(), sks, hl_module);
    }

    public static SubLObject note_sksi_sparql_removal_module(final SubLObject hl_module, final SubLObject sks) {
        return dictionary.dictionary_enter($sksi_sparql_removal_modules$.getGlobalValue(), sks, hl_module);
    }

    public static final SubLObject un_note_sksi_sparql_removal_module_alt(SubLObject hl_module) {
        return dictionary.dictionary_remove($sksi_sparql_removal_modules$.getGlobalValue(), hl_module);
    }

    public static SubLObject un_note_sksi_sparql_removal_module(final SubLObject hl_module) {
        return dictionary.dictionary_remove($sksi_sparql_removal_modules$.getGlobalValue(), hl_module);
    }

    public static final SubLObject clear_sksi_sparql_removal_modules_alt() {
        return dictionary.clear_dictionary($sksi_sparql_removal_modules$.getGlobalValue());
    }

    public static SubLObject clear_sksi_sparql_removal_modules() {
        return dictionary.clear_dictionary($sksi_sparql_removal_modules$.getGlobalValue());
    }

    public static final SubLObject look_up_sksi_sparql_removal_module_alt(SubLObject hl_module) {
        return dictionary.dictionary_lookup($sksi_sparql_removal_modules$.getGlobalValue(), hl_module, UNPROVIDED);
    }

    public static SubLObject look_up_sksi_sparql_removal_module(final SubLObject hl_module) {
        return dictionary.dictionary_lookup($sksi_sparql_removal_modules$.getGlobalValue(), hl_module, UNPROVIDED);
    }

    public static final SubLObject sksi_sparql_removal_modules_count_alt() {
        return dictionary.dictionary_length($sksi_sparql_removal_modules$.getGlobalValue());
    }

    public static SubLObject sksi_sparql_removal_modules_count() {
        return dictionary.dictionary_length($sksi_sparql_removal_modules$.getGlobalValue());
    }

    public static final SubLObject some_sksi_sparql_removal_modules_registeredP_alt() {
        return makeBoolean(NIL == dictionary.dictionary_empty_p($sksi_sparql_removal_modules$.getGlobalValue()));
    }

    public static SubLObject some_sksi_sparql_removal_modules_registeredP() {
        return makeBoolean(NIL == dictionary.dictionary_empty_p($sksi_sparql_removal_modules$.getGlobalValue()));
    }

    public static final SubLObject do_sksi_sparql_removal_modules_by_sks_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sks = NIL;
                    SubLObject hl_module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    sks = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    hl_module = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_DICTIONARY, listS(sks, hl_module, $list_alt3), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt1);
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject do_sksi_sparql_removal_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject hl_module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    hl_module = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject sks = $sym5$SKS;
                            return listS(DO_SKSI_SPARQL_REMOVAL_MODULES_BY_SKS, list(sks, hl_module), list(IGNORE, sks), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt4);
                    }
                }
            }
        }
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

    public static final SubLObject register_sksi_sparql_removal_modules_for_sks_alt(SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                if (NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                {
                    SubLObject mt_var = mapping_mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject sub_ks_closure = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                                SubLObject cdolist_list_var = sub_ks_closure;
                                SubLObject ks = NIL;
                                for (ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks = cdolist_list_var.first()) {
                                    count = add(count, com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation.register_sksi_sparql_removal_modules_for_just_sks(ks, NIL, UNPROVIDED));
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != reclassifyP) {
                    inference_modules.reclassify_removal_modules();
                }
                return count;
            }
        }
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

    public static final SubLObject register_sksi_sparql_removal_modules_for_just_sks_alt(SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            SubLObject count = ZERO_INTEGER;
            if (sksi_sks_accessors.sks_get_type(sks) == $$RDFTripleStore_Physical) {
                if (NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation.deregister_sksi_sparql_removal_modules_for_just_sks(sks, UNPROVIDED);
                count = com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation.register_sksi_sparql_removal_modules_for_just_sks_int(sks, mapping_mt);
                if (NIL != reclassifyP) {
                    inference_modules.reclassify_removal_modules();
                }
            }
            return count;
        }
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

    public static final SubLObject deregister_sksi_sparql_removal_modules_for_sks_alt(SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                if (NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                {
                    SubLObject mt_var = mapping_mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject sub_ks_closure = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                                SubLObject cdolist_list_var = sub_ks_closure;
                                SubLObject ks = NIL;
                                for (ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks = cdolist_list_var.first()) {
                                    count = add(count, com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation.deregister_sksi_sparql_removal_modules_for_just_sks(ks, NIL));
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != reclassifyP) {
                    inference_modules.reclassify_removal_modules();
                }
                return count;
            }
        }
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

    public static final SubLObject deregister_sksi_sparql_removal_modules_for_just_sks_alt(SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($sksi_sparql_removal_modules$.getGlobalValue()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject module_sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject hl_module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (module_sks.equal(sks)) {
                            {
                                SubLObject name = inference_modules.hl_module_name(hl_module);
                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation.un_note_sksi_sparql_removal_module(sks);
                                inference_modules.undeclare_inference_removal_module(name, UNPROVIDED);
                            }
                            count = add(count, ONE_INTEGER);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                if (NIL != reclassifyP) {
                    inference_modules.reclassify_removal_modules();
                }
                return count;
            }
        }
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

    /**
     * Deregisters all SKSI sparql removal modules.
     * Returns a count of the modules deregistered.
     */
    @LispMethod(comment = "Deregisters all SKSI sparql removal modules.\r\nReturns a count of the modules deregistered.\nDeregisters all SKSI sparql removal modules.\nReturns a count of the modules deregistered.")
    public static final SubLObject deregister_all_sksi_sparql_removal_modules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($sksi_sparql_removal_modules$.getGlobalValue()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject hl_module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject name = inference_modules.hl_module_name(hl_module);
                            inference_modules.undeclare_inference_removal_module(name, UNPROVIDED);
                        }
                        count = add(count, ONE_INTEGER);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation.clear_sksi_sparql_removal_modules();
                inference_modules.reclassify_removal_modules();
                return count;
            }
        }
    }

    /**
     * Deregisters all SKSI sparql removal modules.
     * Returns a count of the modules deregistered.
     */
    @LispMethod(comment = "Deregisters all SKSI sparql removal modules.\r\nReturns a count of the modules deregistered.\nDeregisters all SKSI sparql removal modules.\nReturns a count of the modules deregistered.")
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

    public static final SubLObject register_sksi_sparql_removal_modules_for_just_sks_int_alt(SubLObject sks, SubLObject mapping_mt) {
        {
            SubLObject sks_profile = sksi_query_datastructures.new_sks_profile(sks, mapping_mt, T);
            SubLObject count = ZERO_INTEGER;
            SubLObject hl_module = NIL;
            if (NIL != sksi_query_datastructures.valid_and_supported_sks_profile(sks_profile)) {
                {
                    SubLObject name = com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation.determine_sparql_ist_graph_removal_module_name(sks);
                    SubLObject doc_string = cconcatenate($str_alt9$SKSI_sparql____ist_Graph__variabl, new SubLObject[]{ format_nil.format_nil_s_no_copy(sks), $str_alt10$_ });
                    SubLObject plist = list(new SubLObject[]{ $PREDICATE, $$ist_Graph, $MODULE_SUBTYPE, $SKSI, $MODULE_SOURCE, sks, $SENSE, $POS, $REQUIRED_PATTERN, list($AND, $list_alt20, list($TEST, REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY, sks_profile)), $COST_PATTERN, list($CALL, REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST, $INPUT, sks_profile), $COMPLETENESS_PATTERN, list($CALL, REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS, $INPUT, sks_profile), $EXPAND_PATTERN, list($CALL, REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE, $INPUT, sks_profile), $DOCUMENTATION, doc_string });
                    hl_module = inference_modules.inference_removal_module(name, plist);
                    com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation.note_sksi_sparql_removal_module(hl_module, sks);
                    count = add(count, ONE_INTEGER);
                }
            }
            return count;
        }
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

    /**
     * This determines a unique name string for the module based on the name of the knowledge source.
     */
    @LispMethod(comment = "This determines a unique name string for the module based on the name of the knowledge source.")
    public static final SubLObject determine_sparql_ist_graph_removal_module_name_alt(SubLObject sks) {
        if (NIL == sks) {
            return NIL;
        }
        {
            SubLObject sks_name = sksi_kb_accessors.sk_source_name(sks);
            SubLObject core_name_string = (NIL != sks_name) ? ((SubLObject) (string_utilities.string_substitute($str_alt32$_, $str_alt33$_, Strings.string_upcase(sks_name, UNPROVIDED, UNPROVIDED), UNPROVIDED))) : NIL;
            SubLObject core_name_symbol = gensym(core_name_string);
            SubLObject name_string = cconcatenate($str_alt34$REMOVAL_SKSI_, new SubLObject[]{ format_nil.format_nil_a_no_copy(core_name_symbol), $str_alt35$_SPARQL_IST_GRAPH_POS_LITS });
            SubLObject name = make_keyword(name_string);
            return name;
        }
    }

    /**
     * This determines a unique name string for the module based on the name of the knowledge source.
     */
    @LispMethod(comment = "This determines a unique name string for the module based on the name of the knowledge source.")
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

    public static final SubLObject removal_sksi_sparql_ist_graph_pos_lits_applicability_alt(SubLObject asent, SubLObject sks_profile) {
        return T;
    }

    public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_applicability(final SubLObject asent, final SubLObject sks_profile) {
        return T;
    }

    public static final SubLObject removal_sksi_sparql_ist_graph_pos_lits_cost_alt(SubLObject asent, SubLObject sks_profile) {
        return ZERO_INTEGER;
    }

    public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_cost(final SubLObject asent, final SubLObject sks_profile) {
        return ZERO_INTEGER;
    }

    public static final SubLObject removal_sksi_sparql_ist_graph_pos_lits_completeness_alt(SubLObject asent, SubLObject sks_profile) {
        {
            SubLObject mapping_mt = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
            return sksi_removal_module_generation.sksi_removal_module_completeness(asent, list(sksi_kb_accessors.logical_schema_for_meaning_sentence_predicate($$ist_Graph, mapping_mt)));
        }
    }

    public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_completeness(final SubLObject asent, final SubLObject sks_profile) {
        final SubLObject mapping_mt = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
        return sksi_removal_module_generation.sksi_removal_module_completeness(asent, list(sksi_kb_accessors.logical_schema_for_meaning_sentence_predicate($$ist_Graph, mapping_mt)));
    }

    public static final SubLObject removal_sksi_sparql_ist_graph_pos_lits_output_generate_alt(SubLObject asent, SubLObject sks_profile) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject ist_graph = unmake_binary_formula(asent);
                SubLObject variable = thread.secondMultipleValue();
                SubLObject subsentence = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
                    {
                        SubLObject _prev_bind_0 = sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.currentBinding(thread);
                        try {
                            sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.bind(variable, thread);
                            {
                                SubLObject sksi_sparql_ist_graph_result_set = NIL;
                                thread.resetMultipleValues();
                                {
                                    SubLObject results = ask_utilities.inference_recursive_query(subsentence, mt, UNPROVIDED);
                                    SubLObject halt_reason = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (((NIL == inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason)) && (NIL != sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.getDynamicValue(thread))) && (NIL != results)) {
                                        {
                                            SubLObject v_graph = com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation.sksi_sparql_decode_ist_graph_arg1(sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.getDynamicValue(thread), sks_profile);
                                            SubLObject support = arguments.make_hl_support($SKSI, make_ternary_formula($$ist_Graph, v_graph, subsentence, mt), UNPROVIDED, UNPROVIDED);
                                            backward.removal_add_node(support, list(cons(sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.getDynamicValue(thread), v_graph)), UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        } finally {
                            sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject sksi_sparql_decode_ist_graph_arg1_alt(SubLObject graph_result, SubLObject sks_profile) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
                SubLObject mapping_mt = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
                SubLObject result = NIL;
                SubLObject mt_var = mapping_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject ls = sksi_kb_accessors.logical_schema_for_meaning_sentence_predicate($$ist_Graph, UNPROVIDED);
                            SubLObject ps = sksi_kb_accessors.logical_schema_physical_schemata(ls).first();
                            SubLObject pfi = narts_high.find_nart(listS($$ThePhysicalFieldValueFn, ps, $list_alt37));
                            SubLObject fd = sksi_field_translation_utilities.get_field_decodings_from_physical_field_indexical(pfi, list(ls), UNPROVIDED).first();
                            result = sksi_reformulate.sksi_reformulate(list_utilities.tree_substitute(fd, pfi, graph_result), $DECODE, sks);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
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
        declareFunction("note_sksi_sparql_removal_module", "NOTE-SKSI-SPARQL-REMOVAL-MODULE", 2, 0, false);
        declareFunction("un_note_sksi_sparql_removal_module", "UN-NOTE-SKSI-SPARQL-REMOVAL-MODULE", 1, 0, false);
        declareFunction("clear_sksi_sparql_removal_modules", "CLEAR-SKSI-SPARQL-REMOVAL-MODULES", 0, 0, false);
        declareFunction("look_up_sksi_sparql_removal_module", "LOOK-UP-SKSI-SPARQL-REMOVAL-MODULE", 1, 0, false);
        declareFunction("sksi_sparql_removal_modules_count", "SKSI-SPARQL-REMOVAL-MODULES-COUNT", 0, 0, false);
        declareFunction("some_sksi_sparql_removal_modules_registeredP", "SOME-SKSI-SPARQL-REMOVAL-MODULES-REGISTERED?", 0, 0, false);
        declareMacro("do_sksi_sparql_removal_modules_by_sks", "DO-SKSI-SPARQL-REMOVAL-MODULES-BY-SKS");
        declareMacro("do_sksi_sparql_removal_modules", "DO-SKSI-SPARQL-REMOVAL-MODULES");
        declareFunction("register_sksi_sparql_removal_modules_for_sks", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        declareFunction("register_sksi_sparql_removal_modules_for_just_sks", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS", 1, 2, false);
        declareFunction("deregister_sksi_sparql_removal_modules_for_sks", "DEREGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        declareFunction("deregister_sksi_sparql_removal_modules_for_just_sks", "DEREGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS", 1, 1, false);
        declareFunction("deregister_all_sksi_sparql_removal_modules", "DEREGISTER-ALL-SKSI-SPARQL-REMOVAL-MODULES", 0, 0, false);
        declareFunction("register_sksi_sparql_removal_modules_for_just_sks_int", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS-INT", 2, 0, false);
        declareFunction("determine_sparql_ist_graph_removal_module_name", "DETERMINE-SPARQL-IST-GRAPH-REMOVAL-MODULE-NAME", 1, 0, false);
        declareFunction("removal_sksi_sparql_ist_graph_pos_lits_applicability", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-APPLICABILITY", 2, 0, false);
        declareFunction("removal_sksi_sparql_ist_graph_pos_lits_cost", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COST", 2, 0, false);
        declareFunction("removal_sksi_sparql_ist_graph_pos_lits_completeness", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COMPLETENESS", 2, 0, false);
        declareFunction("removal_sksi_sparql_ist_graph_pos_lits_output_generate", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-OUTPUT-GENERATE", 2, 0, false);
        declareFunction("sksi_sparql_decode_ist_graph_arg1", "SKSI-SPARQL-DECODE-IST-GRAPH-ARG1", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_sksi_sparql_removal_module_generation_file_alt() {
        deflexical("*SKSI-SPARQL-REMOVAL-MODULES*", NIL != boundp($sksi_sparql_removal_modules$) ? ((SubLObject) ($sksi_sparql_removal_modules$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_sksi_sparql_removal_module_generation_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SKSI-SPARQL-REMOVAL-MODULES*", SubLTrampolineFile.maybeDefault($sksi_sparql_removal_modules$, $sksi_sparql_removal_modules$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SKSI-SPARQL-REMOVAL-MODULES*", NIL != boundp($sksi_sparql_removal_modules$) ? ((SubLObject) ($sksi_sparql_removal_modules$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_sksi_sparql_removal_module_generation_file_Previous() {
        deflexical("*SKSI-SPARQL-REMOVAL-MODULES*", SubLTrampolineFile.maybeDefault($sksi_sparql_removal_modules$, $sksi_sparql_removal_modules$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
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

    static {
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("SKS"), makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt3 = list(makeSymbol("*SKSI-SPARQL-REMOVAL-MODULES*"));

    static private final SubLList $list_alt4 = list(list(makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt9$SKSI_sparql____ist_Graph__variabl = makeString("SKSI sparql (#$ist-Graph :variable . :fully-bound) removal module for ");

    static private final SubLString $str_alt10$_ = makeString(".");

    static private final SubLList $list_alt20 = listS(reader_make_constant_shell("ist-Graph"), makeKeyword("VARIABLE"), makeKeyword("FULLY-BOUND"));

    static private final SubLString $str_alt32$_ = makeString("-");

    static private final SubLString $str_alt33$_ = makeString("_");

    static private final SubLString $str_alt34$REMOVAL_SKSI_ = makeString("REMOVAL-SKSI-");

    static private final SubLString $str_alt35$_SPARQL_IST_GRAPH_POS_LITS = makeString("-SPARQL-IST-GRAPH-POS-LITS");

    static private final SubLList $list_alt37 = list(makeString("subject"));
}

/**
 * Total time: 136 ms
 */
