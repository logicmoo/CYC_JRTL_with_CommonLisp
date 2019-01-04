package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sparql_removal_module_generation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation";
    public static final String myFingerPrint = "57a19de48f9da7b22071bd7df7716858e50cf2bbd1813c856b1f52f06b379830";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 947L)
    private static SubLSymbol $sksi_sparql_removal_modules$;
    private static final SubLSymbol $sym0$_SKSI_SPARQL_REMOVAL_MODULES_;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$DO_DICTIONARY;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$SKS;
    private static final SubLSymbol $sym6$DO_SKSI_SPARQL_REMOVAL_MODULES_BY_SKS;
    private static final SubLSymbol $sym7$IGNORE;
    private static final SubLObject $const8$RDFTripleStore_Physical;
    private static final SubLString $str9$SKSI_sparql____ist_Graph__variabl;
    private static final SubLString $str10$_;
    private static final SubLSymbol $kw11$PREDICATE;
    private static final SubLObject $const12$ist_Graph;
    private static final SubLSymbol $kw13$MODULE_SUBTYPE;
    private static final SubLSymbol $kw14$SKSI;
    private static final SubLSymbol $kw15$MODULE_SOURCE;
    private static final SubLSymbol $kw16$SENSE;
    private static final SubLSymbol $kw17$POS;
    private static final SubLSymbol $kw18$REQUIRED_PATTERN;
    private static final SubLSymbol $kw19$AND;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$TEST;
    private static final SubLSymbol $sym22$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY;
    private static final SubLSymbol $kw23$COST_PATTERN;
    private static final SubLSymbol $kw24$CALL;
    private static final SubLSymbol $sym25$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST;
    private static final SubLSymbol $kw26$INPUT;
    private static final SubLSymbol $kw27$COMPLETENESS_PATTERN;
    private static final SubLSymbol $sym28$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS;
    private static final SubLSymbol $kw29$EXPAND_PATTERN;
    private static final SubLSymbol $sym30$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE;
    private static final SubLSymbol $kw31$DOCUMENTATION;
    private static final SubLString $str32$_;
    private static final SubLString $str33$_;
    private static final SubLString $str34$REMOVAL_SKSI_;
    private static final SubLString $str35$_SPARQL_IST_GRAPH_POS_LITS;
    private static final SubLObject $const36$ThePhysicalFieldValueFn;
    private static final SubLList $list37;
    private static final SubLSymbol $kw38$DECODE;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1146L)
    public static SubLObject note_sksi_sparql_removal_module(final SubLObject hl_module, final SubLObject sks) {
        return dictionary.dictionary_enter(sksi_sparql_removal_module_generation.$sksi_sparql_removal_modules$.getGlobalValue(), sks, hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1283L)
    public static SubLObject un_note_sksi_sparql_removal_module(final SubLObject hl_module) {
        return dictionary.dictionary_remove(sksi_sparql_removal_module_generation.$sksi_sparql_removal_modules$.getGlobalValue(), hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1416L)
    public static SubLObject clear_sksi_sparql_removal_modules() {
        return dictionary.clear_dictionary(sksi_sparql_removal_module_generation.$sksi_sparql_removal_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1528L)
    public static SubLObject look_up_sksi_sparql_removal_module(final SubLObject hl_module) {
        return dictionary.dictionary_lookup(sksi_sparql_removal_module_generation.$sksi_sparql_removal_modules$.getGlobalValue(), hl_module, (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1661L)
    public static SubLObject sksi_sparql_removal_modules_count() {
        return dictionary.dictionary_length(sksi_sparql_removal_module_generation.$sksi_sparql_removal_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1776L)
    public static SubLObject some_sksi_sparql_removal_modules_registeredP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sparql_removal_module_generation.NIL == dictionary.dictionary_empty_p(sksi_sparql_removal_module_generation.$sksi_sparql_removal_modules$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 1910L)
    public static SubLObject do_sksi_sparql_removal_modules_by_sks(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sparql_removal_module_generation.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sks = (SubLObject)sksi_sparql_removal_module_generation.NIL;
        SubLObject hl_module = (SubLObject)sksi_sparql_removal_module_generation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sparql_removal_module_generation.$list1);
        sks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sparql_removal_module_generation.$list1);
        hl_module = current.first();
        current = current.rest();
        if (sksi_sparql_removal_module_generation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_sparql_removal_module_generation.$sym2$DO_DICTIONARY, (SubLObject)ConsesLow.listS(sks, hl_module, (SubLObject)sksi_sparql_removal_module_generation.$list3), ConsesLow.append(body, (SubLObject)sksi_sparql_removal_module_generation.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sparql_removal_module_generation.$list1);
        return (SubLObject)sksi_sparql_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 2080L)
    public static SubLObject do_sksi_sparql_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sparql_removal_module_generation.$list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)sksi_sparql_removal_module_generation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sparql_removal_module_generation.$list4);
        hl_module = current.first();
        current = current.rest();
        if (sksi_sparql_removal_module_generation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject sks = (SubLObject)sksi_sparql_removal_module_generation.$sym5$SKS;
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_sparql_removal_module_generation.$sym6$DO_SKSI_SPARQL_REMOVAL_MODULES_BY_SKS, (SubLObject)ConsesLow.list(sks, hl_module), (SubLObject)ConsesLow.list((SubLObject)sksi_sparql_removal_module_generation.$sym7$IGNORE, sks), ConsesLow.append(body, (SubLObject)sksi_sparql_removal_module_generation.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sparql_removal_module_generation.$list4);
        return (SubLObject)sksi_sparql_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 2281L)
    public static SubLObject register_sksi_sparql_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == sksi_sparql_removal_module_generation.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_sparql_removal_module_generation.NIL;
        }
        if (reclassifyP == sksi_sparql_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_sparql_removal_module_generation.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_sparql_removal_module_generation.ZERO_INTEGER;
        if (sksi_sparql_removal_module_generation.NIL == mapping_mt) {
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
            SubLObject ks = (SubLObject)sksi_sparql_removal_module_generation.NIL;
            ks = cdolist_list_var.first();
            while (sksi_sparql_removal_module_generation.NIL != cdolist_list_var) {
                count = Numbers.add(count, register_sksi_sparql_removal_modules_for_just_sks(ks, (SubLObject)sksi_sparql_removal_module_generation.NIL, (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (sksi_sparql_removal_module_generation.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 2845L)
    public static SubLObject register_sksi_sparql_removal_modules_for_just_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == sksi_sparql_removal_module_generation.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_sparql_removal_module_generation.NIL;
        }
        if (reclassifyP == sksi_sparql_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_sparql_removal_module_generation.T;
        }
        SubLObject count = (SubLObject)sksi_sparql_removal_module_generation.ZERO_INTEGER;
        if (sksi_sparql_removal_module_generation.NIL != kb_utilities.kbeq(sksi_sks_accessors.sks_get_type(sks), sksi_sparql_removal_module_generation.$const8$RDFTripleStore_Physical)) {
            if (sksi_sparql_removal_module_generation.NIL == mapping_mt) {
                mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
            }
            deregister_sksi_sparql_removal_modules_for_just_sks(sks, (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED);
            count = register_sksi_sparql_removal_modules_for_just_sks_int(sks, mapping_mt);
            if (sksi_sparql_removal_module_generation.NIL != reclassifyP) {
                inference_modules.reclassify_removal_modules();
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 3344L)
    public static SubLObject deregister_sksi_sparql_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == sksi_sparql_removal_module_generation.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_sparql_removal_module_generation.NIL;
        }
        if (reclassifyP == sksi_sparql_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_sparql_removal_module_generation.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_sparql_removal_module_generation.ZERO_INTEGER;
        if (sksi_sparql_removal_module_generation.NIL == mapping_mt) {
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
            SubLObject ks = (SubLObject)sksi_sparql_removal_module_generation.NIL;
            ks = cdolist_list_var.first();
            while (sksi_sparql_removal_module_generation.NIL != cdolist_list_var) {
                count = Numbers.add(count, deregister_sksi_sparql_removal_modules_for_just_sks(ks, (SubLObject)sksi_sparql_removal_module_generation.NIL));
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (sksi_sparql_removal_module_generation.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 3830L)
    public static SubLObject deregister_sksi_sparql_removal_modules_for_just_sks(final SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == sksi_sparql_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_sparql_removal_module_generation.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_sparql_removal_module_generation.ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_sparql_removal_module_generation.$sksi_sparql_removal_modules$.getGlobalValue())); sksi_sparql_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject module_sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject hl_module = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (module_sks.equal(sks)) {
                final SubLObject name = inference_modules.hl_module_name(hl_module);
                un_note_sksi_sparql_removal_module(sks);
                inference_modules.undeclare_inference_removal_module(name, (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED);
                count = Numbers.add(count, (SubLObject)sksi_sparql_removal_module_generation.ONE_INTEGER);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (sksi_sparql_removal_module_generation.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 4283L)
    public static SubLObject deregister_all_sksi_sparql_removal_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_sparql_removal_module_generation.ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_sparql_removal_module_generation.$sksi_sparql_removal_modules$.getGlobalValue())); sksi_sparql_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject hl_module = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            inference_modules.undeclare_inference_removal_module(name, (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED);
            count = Numbers.add(count, (SubLObject)sksi_sparql_removal_module_generation.ONE_INTEGER);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        clear_sksi_sparql_removal_modules();
        inference_modules.reclassify_removal_modules();
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 4707L)
    public static SubLObject register_sksi_sparql_removal_modules_for_just_sks_int(final SubLObject sks, final SubLObject mapping_mt) {
        final SubLObject sks_profile = sksi_query_datastructures.new_sks_profile(sks, mapping_mt, (SubLObject)sksi_sparql_removal_module_generation.T);
        SubLObject count = (SubLObject)sksi_sparql_removal_module_generation.ZERO_INTEGER;
        SubLObject hl_module = (SubLObject)sksi_sparql_removal_module_generation.NIL;
        if (sksi_sparql_removal_module_generation.NIL != sksi_query_datastructures.valid_and_supported_sks_profile(sks_profile)) {
            final SubLObject name = determine_sparql_ist_graph_removal_module_name(sks);
            final SubLObject doc_string = Sequences.cconcatenate((SubLObject)sksi_sparql_removal_module_generation.$str9$SKSI_sparql____ist_Graph__variabl, new SubLObject[] { format_nil.format_nil_s_no_copy(sks), sksi_sparql_removal_module_generation.$str10$_ });
            final SubLObject plist = (SubLObject)ConsesLow.list(new SubLObject[] { sksi_sparql_removal_module_generation.$kw11$PREDICATE, sksi_sparql_removal_module_generation.$const12$ist_Graph, sksi_sparql_removal_module_generation.$kw13$MODULE_SUBTYPE, sksi_sparql_removal_module_generation.$kw14$SKSI, sksi_sparql_removal_module_generation.$kw15$MODULE_SOURCE, sks, sksi_sparql_removal_module_generation.$kw16$SENSE, sksi_sparql_removal_module_generation.$kw17$POS, sksi_sparql_removal_module_generation.$kw18$REQUIRED_PATTERN, ConsesLow.list((SubLObject)sksi_sparql_removal_module_generation.$kw19$AND, (SubLObject)sksi_sparql_removal_module_generation.$list20, (SubLObject)ConsesLow.list((SubLObject)sksi_sparql_removal_module_generation.$kw21$TEST, (SubLObject)sksi_sparql_removal_module_generation.$sym22$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY, sks_profile)), sksi_sparql_removal_module_generation.$kw23$COST_PATTERN, ConsesLow.list((SubLObject)sksi_sparql_removal_module_generation.$kw24$CALL, (SubLObject)sksi_sparql_removal_module_generation.$sym25$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST, (SubLObject)sksi_sparql_removal_module_generation.$kw26$INPUT, sks_profile), sksi_sparql_removal_module_generation.$kw27$COMPLETENESS_PATTERN, ConsesLow.list((SubLObject)sksi_sparql_removal_module_generation.$kw24$CALL, (SubLObject)sksi_sparql_removal_module_generation.$sym28$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS, (SubLObject)sksi_sparql_removal_module_generation.$kw26$INPUT, sks_profile), sksi_sparql_removal_module_generation.$kw29$EXPAND_PATTERN, ConsesLow.list((SubLObject)sksi_sparql_removal_module_generation.$kw24$CALL, (SubLObject)sksi_sparql_removal_module_generation.$sym30$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE, (SubLObject)sksi_sparql_removal_module_generation.$kw26$INPUT, sks_profile), sksi_sparql_removal_module_generation.$kw31$DOCUMENTATION, doc_string });
            hl_module = inference_modules.inference_removal_module(name, plist);
            note_sksi_sparql_removal_module(hl_module, sks);
            count = Numbers.add(count, (SubLObject)sksi_sparql_removal_module_generation.ONE_INTEGER);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 6120L)
    public static SubLObject determine_sparql_ist_graph_removal_module_name(final SubLObject sks) {
        if (sksi_sparql_removal_module_generation.NIL == sks) {
            return (SubLObject)sksi_sparql_removal_module_generation.NIL;
        }
        final SubLObject sks_name = sksi_kb_accessors.sk_source_name(sks);
        final SubLObject core_name_string = (SubLObject)((sksi_sparql_removal_module_generation.NIL != sks_name) ? string_utilities.string_substitute((SubLObject)sksi_sparql_removal_module_generation.$str32$_, (SubLObject)sksi_sparql_removal_module_generation.$str33$_, Strings.string_upcase(sks_name, (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED, (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED), (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED) : sksi_sparql_removal_module_generation.NIL);
        final SubLObject core_name_symbol = Symbols.gensym(core_name_string);
        final SubLObject name_string = Sequences.cconcatenate((SubLObject)sksi_sparql_removal_module_generation.$str34$REMOVAL_SKSI_, new SubLObject[] { format_nil.format_nil_a_no_copy(core_name_symbol), sksi_sparql_removal_module_generation.$str35$_SPARQL_IST_GRAPH_POS_LITS });
        final SubLObject name = Symbols.make_keyword(name_string);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 6667L)
    public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_applicability(final SubLObject asent, final SubLObject sks_profile) {
        return (SubLObject)sksi_sparql_removal_module_generation.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 6903L)
    public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_cost(final SubLObject asent, final SubLObject sks_profile) {
        return (SubLObject)sksi_sparql_removal_module_generation.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 7032L)
    public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_completeness(final SubLObject asent, final SubLObject sks_profile) {
        final SubLObject mapping_mt = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
        return sksi_removal_module_generation.sksi_removal_module_completeness(asent, (SubLObject)ConsesLow.list(sksi_kb_accessors.logical_schema_for_meaning_sentence_predicate(sksi_sparql_removal_module_generation.$const12$ist_Graph, mapping_mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 7349L)
    public static SubLObject removal_sksi_sparql_ist_graph_pos_lits_output_generate(final SubLObject asent, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject ist_graph = el_utilities.unmake_binary_formula(asent);
        final SubLObject variable = thread.secondMultipleValue();
        final SubLObject subsentence = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        final SubLObject _prev_bind_0 = sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.currentBinding(thread);
        try {
            sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.bind(variable, thread);
            final SubLObject sksi_sparql_ist_graph_result_set = (SubLObject)sksi_sparql_removal_module_generation.NIL;
            thread.resetMultipleValues();
            final SubLObject results = ask_utilities.inference_recursive_query(subsentence, mt, (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED);
            final SubLObject halt_reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_sparql_removal_module_generation.NIL == inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason) && sksi_sparql_removal_module_generation.NIL != sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.getDynamicValue(thread) && sksi_sparql_removal_module_generation.NIL != results) {
                final SubLObject v_graph = sksi_sparql_decode_ist_graph_arg1(sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.getDynamicValue(thread), sks_profile);
                final SubLObject support = arguments.make_hl_support((SubLObject)sksi_sparql_removal_module_generation.$kw14$SKSI, el_utilities.make_ternary_formula(sksi_sparql_removal_module_generation.$const12$ist_Graph, v_graph, subsentence, mt), (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED, (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED);
                backward.removal_add_node(support, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.getDynamicValue(thread), v_graph)), (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED);
            }
        }
        finally {
            sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_sparql_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-sparql-removal-module-generation.lisp", position = 8354L)
    public static SubLObject sksi_sparql_decode_ist_graph_arg1(final SubLObject graph_result, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        final SubLObject mapping_mt = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
        SubLObject result = (SubLObject)sksi_sparql_removal_module_generation.NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject ls = sksi_kb_accessors.logical_schema_for_meaning_sentence_predicate(sksi_sparql_removal_module_generation.$const12$ist_Graph, (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED);
            final SubLObject ps = sksi_kb_accessors.logical_schema_physical_schemata(ls).first();
            final SubLObject pfi = narts_high.find_nart((SubLObject)ConsesLow.listS(sksi_sparql_removal_module_generation.$const36$ThePhysicalFieldValueFn, ps, (SubLObject)sksi_sparql_removal_module_generation.$list37));
            final SubLObject fd = sksi_field_translation_utilities.get_field_decodings_from_physical_field_indexical(pfi, (SubLObject)ConsesLow.list(ls), (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED).first();
            result = sksi_reformulate.sksi_reformulate(list_utilities.tree_substitute(fd, pfi, graph_result), (SubLObject)sksi_sparql_removal_module_generation.$kw38$DECODE, sks);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    public static SubLObject declare_sksi_sparql_removal_module_generation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "note_sksi_sparql_removal_module", "NOTE-SKSI-SPARQL-REMOVAL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "un_note_sksi_sparql_removal_module", "UN-NOTE-SKSI-SPARQL-REMOVAL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "clear_sksi_sparql_removal_modules", "CLEAR-SKSI-SPARQL-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "look_up_sksi_sparql_removal_module", "LOOK-UP-SKSI-SPARQL-REMOVAL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "sksi_sparql_removal_modules_count", "SKSI-SPARQL-REMOVAL-MODULES-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "some_sksi_sparql_removal_modules_registeredP", "SOME-SKSI-SPARQL-REMOVAL-MODULES-REGISTERED?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "do_sksi_sparql_removal_modules_by_sks", "DO-SKSI-SPARQL-REMOVAL-MODULES-BY-SKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "do_sksi_sparql_removal_modules", "DO-SKSI-SPARQL-REMOVAL-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "register_sksi_sparql_removal_modules_for_sks", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "register_sksi_sparql_removal_modules_for_just_sks", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "deregister_sksi_sparql_removal_modules_for_sks", "DEREGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "deregister_sksi_sparql_removal_modules_for_just_sks", "DEREGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "deregister_all_sksi_sparql_removal_modules", "DEREGISTER-ALL-SKSI-SPARQL-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "register_sksi_sparql_removal_modules_for_just_sks_int", "REGISTER-SKSI-SPARQL-REMOVAL-MODULES-FOR-JUST-SKS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "determine_sparql_ist_graph_removal_module_name", "DETERMINE-SPARQL-IST-GRAPH-REMOVAL-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "removal_sksi_sparql_ist_graph_pos_lits_applicability", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-APPLICABILITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "removal_sksi_sparql_ist_graph_pos_lits_cost", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "removal_sksi_sparql_ist_graph_pos_lits_completeness", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "removal_sksi_sparql_ist_graph_pos_lits_output_generate", "REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-OUTPUT-GENERATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_sparql_removal_module_generation", "sksi_sparql_decode_ist_graph_arg1", "SKSI-SPARQL-DECODE-IST-GRAPH-ARG1", 2, 0, false);
        return (SubLObject)sksi_sparql_removal_module_generation.NIL;
    }
    
    public static SubLObject init_sksi_sparql_removal_module_generation_file() {
        sksi_sparql_removal_module_generation.$sksi_sparql_removal_modules$ = SubLFiles.deflexical("*SKSI-SPARQL-REMOVAL-MODULES*", (sksi_sparql_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_sparql_removal_module_generation.$sym0$_SKSI_SPARQL_REMOVAL_MODULES_)) ? sksi_sparql_removal_module_generation.$sksi_sparql_removal_modules$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_sparql_removal_module_generation.EQUAL), (SubLObject)sksi_sparql_removal_module_generation.UNPROVIDED));
        return (SubLObject)sksi_sparql_removal_module_generation.NIL;
    }
    
    public static SubLObject setup_sksi_sparql_removal_module_generation_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sparql_removal_module_generation.$sym0$_SKSI_SPARQL_REMOVAL_MODULES_);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_sparql_removal_module_generation.$sym22$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_sparql_removal_module_generation.$sym25$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_sparql_removal_module_generation.$sym28$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_sparql_removal_module_generation.$sym30$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE);
        return (SubLObject)sksi_sparql_removal_module_generation.NIL;
    }
    
    public void declareFunctions() {
        declare_sksi_sparql_removal_module_generation_file();
    }
    
    public void initializeVariables() {
        init_sksi_sparql_removal_module_generation_file();
    }
    
    public void runTopLevelForms() {
        setup_sksi_sparql_removal_module_generation_file();
    }
    
    static {
        me = (SubLFile)new sksi_sparql_removal_module_generation();
        sksi_sparql_removal_module_generation.$sksi_sparql_removal_modules$ = null;
        $sym0$_SKSI_SPARQL_REMOVAL_MODULES_ = SubLObjectFactory.makeSymbol("*SKSI-SPARQL-REMOVAL-MODULES*");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym2$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SPARQL-REMOVAL-MODULES*"));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym5$SKS = SubLObjectFactory.makeUninternedSymbol("SKS");
        $sym6$DO_SKSI_SPARQL_REMOVAL_MODULES_BY_SKS = SubLObjectFactory.makeSymbol("DO-SKSI-SPARQL-REMOVAL-MODULES-BY-SKS");
        $sym7$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $const8$RDFTripleStore_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTripleStore-Physical"));
        $str9$SKSI_sparql____ist_Graph__variabl = SubLObjectFactory.makeString("SKSI sparql (#$ist-Graph :variable . :fully-bound) removal module for ");
        $str10$_ = SubLObjectFactory.makeString(".");
        $kw11$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $const12$ist_Graph = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Graph"));
        $kw13$MODULE_SUBTYPE = SubLObjectFactory.makeKeyword("MODULE-SUBTYPE");
        $kw14$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $kw15$MODULE_SOURCE = SubLObjectFactory.makeKeyword("MODULE-SOURCE");
        $kw16$SENSE = SubLObjectFactory.makeKeyword("SENSE");
        $kw17$POS = SubLObjectFactory.makeKeyword("POS");
        $kw18$REQUIRED_PATTERN = SubLObjectFactory.makeKeyword("REQUIRED-PATTERN");
        $kw19$AND = SubLObjectFactory.makeKeyword("AND");
        $list20 = ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Graph")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"));
        $kw21$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym22$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_APPLICABILITY = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-APPLICABILITY");
        $kw23$COST_PATTERN = SubLObjectFactory.makeKeyword("COST-PATTERN");
        $kw24$CALL = SubLObjectFactory.makeKeyword("CALL");
        $sym25$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COST = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COST");
        $kw26$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw27$COMPLETENESS_PATTERN = SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN");
        $sym28$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_COMPLETENESS = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-COMPLETENESS");
        $kw29$EXPAND_PATTERN = SubLObjectFactory.makeKeyword("EXPAND-PATTERN");
        $sym30$REMOVAL_SKSI_SPARQL_IST_GRAPH_POS_LITS_OUTPUT_GENERATE = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-SPARQL-IST-GRAPH-POS-LITS-OUTPUT-GENERATE");
        $kw31$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $str32$_ = SubLObjectFactory.makeString("-");
        $str33$_ = SubLObjectFactory.makeString("_");
        $str34$REMOVAL_SKSI_ = SubLObjectFactory.makeString("REMOVAL-SKSI-");
        $str35$_SPARQL_IST_GRAPH_POS_LITS = SubLObjectFactory.makeString("-SPARQL-IST-GRAPH-POS-LITS");
        $const36$ThePhysicalFieldValueFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThePhysicalFieldValueFn"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subject"));
        $kw38$DECODE = SubLObjectFactory.makeKeyword("DECODE");
    }
}

/*

	Total time: 136 ms
	
*/