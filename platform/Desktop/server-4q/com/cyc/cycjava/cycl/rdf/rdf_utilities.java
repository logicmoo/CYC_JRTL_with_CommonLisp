package com.cyc.cycjava.cycl.rdf;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rdf_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_utilities";
    public static final String myFingerPrint = "c342421c101ae817d0c4f62ceffde617aaeb22190f2ca2ccaafa0af0100d34ea";
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1432L)
    private static SubLSymbol $rdf_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1577L)
    private static SubLSymbol $rdf_expanded_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1716L)
    private static SubLSymbol $rdf_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1972L)
    private static SubLSymbol $xsd_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2107L)
    private static SubLSymbol $xsd_expanded_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2246L)
    private static SubLSymbol $xsd_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2502L)
    private static SubLSymbol $rdfs_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2644L)
    private static SubLSymbol $rdfs_expanded_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2785L)
    private static SubLSymbol $rdfs_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3045L)
    private static SubLSymbol $skos_core_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3201L)
    private static SubLSymbol $skos_expanded_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3347L)
    private static SubLSymbol $skos_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3617L)
    private static SubLSymbol $foaf_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3748L)
    private static SubLSymbol $foaf_expanded_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3889L)
    private static SubLSymbol $foaf_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 4700L)
    private static SubLSymbol $rdf_standard_prefix_for_namespace_caching_state$;
    private static final SubLString $str0$http___www_w3_org_1999_02_22_rdf_;
    private static final SubLSymbol $sym1$RDF_EXPANDED_NAME;
    private static final SubLSymbol $sym2$_RDF_EXPANDED_NAME_CACHING_STATE_;
    private static final SubLSymbol $sym3$RDF_NAME;
    private static final SubLString $str4$rdf_;
    private static final SubLSymbol $sym5$_RDF_NAME_CACHING_STATE_;
    private static final SubLString $str6$http___www_w3_org_2001_XMLSchema_;
    private static final SubLSymbol $sym7$XSD_EXPANDED_NAME;
    private static final SubLSymbol $sym8$_XSD_EXPANDED_NAME_CACHING_STATE_;
    private static final SubLSymbol $sym9$XSD_NAME;
    private static final SubLString $str10$xsd_;
    private static final SubLSymbol $sym11$_XSD_NAME_CACHING_STATE_;
    private static final SubLString $str12$http___www_w3_org_2000_01_rdf_sch;
    private static final SubLSymbol $sym13$RDFS_EXPANDED_NAME;
    private static final SubLSymbol $sym14$_RDFS_EXPANDED_NAME_CACHING_STATE_;
    private static final SubLSymbol $sym15$RDFS_NAME;
    private static final SubLString $str16$rdfs_;
    private static final SubLSymbol $sym17$_RDFS_NAME_CACHING_STATE_;
    private static final SubLString $str18$http___www_w3_org_2004_02_skos_co;
    private static final SubLSymbol $sym19$SKOS_EXPANDED_NAME;
    private static final SubLSymbol $sym20$_SKOS_EXPANDED_NAME_CACHING_STATE_;
    private static final SubLSymbol $sym21$SKOS_NAME;
    private static final SubLString $str22$skos_;
    private static final SubLSymbol $sym23$_SKOS_NAME_CACHING_STATE_;
    private static final SubLString $str24$http___xmlns_com_foaf_0_1_;
    private static final SubLSymbol $sym25$FOAF_EXPANDED_NAME;
    private static final SubLSymbol $sym26$_FOAF_EXPANDED_NAME_CACHING_STATE_;
    private static final SubLSymbol $sym27$FOAF_NAME;
    private static final SubLString $str28$foaf_;
    private static final SubLSymbol $sym29$_FOAF_NAME_CACHING_STATE_;
    private static final SubLString $str30$name;
    private static final SubLString $str31$prefLabel;
    private static final SubLString $str32$label;
    private static final SubLString $str33$altLabel;
    private static final SubLObject $const34$prettyString;
    private static final SubLSymbol $sym35$RDF_STANDARD_PREFIX_FOR_NAMESPACE;
    private static final SubLSymbol $sym36$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const37$EverythingPSC;
    private static final SubLObject $const38$uriString;
    private static final SubLSymbol $kw39$GAF;
    private static final SubLSymbol $kw40$TRUE;
    private static final SubLObject $const41$standardPrefixForURI;
    private static final SubLSymbol $sym42$_RDF_STANDARD_PREFIX_FOR_NAMESPACE_CACHING_STATE_;
    private static final SubLString $str43$xmlns_;
    private static final SubLString $str44$xmlns;
    private static final SubLSymbol $sym45$STRING_;
    private static final SubLString $str46$Can_t_find_or_create_term_for__S;
    private static final SubLObject $const47$ResourceWithURIFn;
    private static final SubLString $str48$type;
    private static final SubLObject $const49$isa;
    private static final SubLSymbol $sym50$_TERM;
    private static final SubLObject $const51$rdfURI;
    private static final SubLObject $const52$InferencePSC;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLObject $const55$True;
    private static final SubLList $list56;
    private static final SubLObject $const57$False;
    private static final SubLString $str58$literal_is_a__S;
    private static final SubLString $str59$_S_is_not_a_list_node_;
    private static final SubLString $str60$nil;
    private static final SubLObject $const61$TheEmptyList;
    private static final SubLObject $const62$TheList;
    private static final SubLString $str63$first;
    private static final SubLSymbol $sym64$RDF_TRIPLE_PREDICATE;
    private static final SubLString $str65$rest;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$RDF_URI_P;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$CYC_TERM_FROM_OTHER_URI;
    private static final SubLString $str70$_;
    private static final SubLObject $const71$rdf_type;
    private static final SubLSymbol $sym72$STRINGIFY_CYC_URI;
    private static final SubLSymbol $sym73$STARTS_WITH;
    private static final SubLList $list74;
    private static final SubLString $str75$_;
    private static final SubLString $str76$_;
    private static final SubLList $list77;
    private static final SubLString $str78$opencyc;
    private static final SubLList $list79;
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 832L)
    public static SubLObject clear_rdf_caches() {
        rdf_graph.clear_rdf_graph_get_blank_node_cached();
        rdf_graph.clear_rdf_graph_get_literal_cached();
        rdf_graph.clear_rdf_graph_index_sub_indexes();
        rdf_parser.clear_resolve_rdfXxml_uri_internal();
        rdf_parser.clear_expand_rdf_xml_uri_namespace_prefix();
        rdf_uri.clear_rdf_find_base_uri();
        rdf_uri.clear_get_rdf_uri_internal();
        clear_rdf_expanded_name();
        clear_rdf_name();
        clear_xsd_expanded_name();
        clear_xsd_name();
        clear_rdfs_expanded_name();
        clear_rdfs_name();
        clear_skos_expanded_name();
        clear_skos_name();
        clear_foaf_expanded_name();
        clear_foaf_name();
        clear_rdf_standard_prefix_for_namespace();
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1516L)
    public static SubLObject rdf_namespace() {
        return rdf_utilities.$rdf_namespace$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1577L)
    public static SubLObject clear_rdf_expanded_name() {
        final SubLObject cs = rdf_utilities.$rdf_expanded_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1577L)
    public static SubLObject remove_rdf_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_utilities.$rdf_expanded_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1577L)
    public static SubLObject rdf_expanded_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate(rdf_utilities.$rdf_namespace$.getGlobalValue(), local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1577L)
    public static SubLObject rdf_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = rdf_utilities.$rdf_expanded_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_utilities.$sym1$RDF_EXPANDED_NAME, (SubLObject)rdf_utilities.$sym2$_RDF_EXPANDED_NAME_CACHING_STATE_, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rdf_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1716L)
    public static SubLObject clear_rdf_name() {
        final SubLObject cs = rdf_utilities.$rdf_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1716L)
    public static SubLObject remove_rdf_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_utilities.$rdf_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1716L)
    public static SubLObject rdf_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate((SubLObject)rdf_utilities.$str4$rdf_, local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1716L)
    public static SubLObject rdf_name(final SubLObject local_name) {
        SubLObject caching_state = rdf_utilities.$rdf_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_utilities.$sym3$RDF_NAME, (SubLObject)rdf_utilities.$sym5$_RDF_NAME_CACHING_STATE_, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rdf_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 1837L)
    public static SubLObject rdf_namespace_uriP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_utilities.NIL != rdf_uri.rdf_uri_p(v_object) && rdf_utilities.NIL != rdf_uri.rdf_uri_base_matchesP(v_object, rdf_namespace()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2046L)
    public static SubLObject xsd_namespace() {
        return rdf_utilities.$xsd_namespace$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2107L)
    public static SubLObject clear_xsd_expanded_name() {
        final SubLObject cs = rdf_utilities.$xsd_expanded_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2107L)
    public static SubLObject remove_xsd_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_utilities.$xsd_expanded_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2107L)
    public static SubLObject xsd_expanded_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate(rdf_utilities.$xsd_namespace$.getGlobalValue(), local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2107L)
    public static SubLObject xsd_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = rdf_utilities.$xsd_expanded_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_utilities.$sym7$XSD_EXPANDED_NAME, (SubLObject)rdf_utilities.$sym8$_XSD_EXPANDED_NAME_CACHING_STATE_, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(xsd_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2246L)
    public static SubLObject clear_xsd_name() {
        final SubLObject cs = rdf_utilities.$xsd_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2246L)
    public static SubLObject remove_xsd_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_utilities.$xsd_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2246L)
    public static SubLObject xsd_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate((SubLObject)rdf_utilities.$str10$xsd_, local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2246L)
    public static SubLObject xsd_name(final SubLObject local_name) {
        SubLObject caching_state = rdf_utilities.$xsd_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_utilities.$sym9$XSD_NAME, (SubLObject)rdf_utilities.$sym11$_XSD_NAME_CACHING_STATE_, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(xsd_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2367L)
    public static SubLObject xsd_namespace_uriP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_utilities.NIL != rdf_uri.rdf_uri_p(v_object) && rdf_utilities.NIL != rdf_uri.rdf_uri_base_matchesP(v_object, xsd_namespace()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2581L)
    public static SubLObject rdfs_namespace() {
        return rdf_utilities.$rdfs_namespace$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2644L)
    public static SubLObject clear_rdfs_expanded_name() {
        final SubLObject cs = rdf_utilities.$rdfs_expanded_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2644L)
    public static SubLObject remove_rdfs_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_utilities.$rdfs_expanded_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2644L)
    public static SubLObject rdfs_expanded_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate(rdf_utilities.$rdfs_namespace$.getGlobalValue(), local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2644L)
    public static SubLObject rdfs_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = rdf_utilities.$rdfs_expanded_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_utilities.$sym13$RDFS_EXPANDED_NAME, (SubLObject)rdf_utilities.$sym14$_RDFS_EXPANDED_NAME_CACHING_STATE_, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rdfs_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2785L)
    public static SubLObject clear_rdfs_name() {
        final SubLObject cs = rdf_utilities.$rdfs_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2785L)
    public static SubLObject remove_rdfs_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_utilities.$rdfs_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2785L)
    public static SubLObject rdfs_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate((SubLObject)rdf_utilities.$str16$rdfs_, local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2785L)
    public static SubLObject rdfs_name(final SubLObject local_name) {
        SubLObject caching_state = rdf_utilities.$rdfs_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_utilities.$sym15$RDFS_NAME, (SubLObject)rdf_utilities.$sym17$_RDFS_NAME_CACHING_STATE_, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rdfs_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 2908L)
    public static SubLObject rdfs_namespace_uriP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_utilities.NIL != rdf_uri.rdf_uri_p(v_object) && rdf_utilities.NIL != rdf_uri.rdf_uri_base_matchesP(v_object, rdfs_namespace()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3128L)
    public static SubLObject skos_core_namespace() {
        return rdf_utilities.$skos_core_namespace$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3201L)
    public static SubLObject clear_skos_expanded_name() {
        final SubLObject cs = rdf_utilities.$skos_expanded_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3201L)
    public static SubLObject remove_skos_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_utilities.$skos_expanded_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3201L)
    public static SubLObject skos_expanded_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate(skos_core_namespace(), local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3201L)
    public static SubLObject skos_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = rdf_utilities.$skos_expanded_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_utilities.$sym19$SKOS_EXPANDED_NAME, (SubLObject)rdf_utilities.$sym20$_SKOS_EXPANDED_NAME_CACHING_STATE_, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(skos_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3347L)
    public static SubLObject clear_skos_name() {
        final SubLObject cs = rdf_utilities.$skos_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3347L)
    public static SubLObject remove_skos_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_utilities.$skos_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3347L)
    public static SubLObject skos_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate((SubLObject)rdf_utilities.$str22$skos_, local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3347L)
    public static SubLObject skos_name(final SubLObject local_name) {
        SubLObject caching_state = rdf_utilities.$skos_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_utilities.$sym21$SKOS_NAME, (SubLObject)rdf_utilities.$sym23$_SKOS_NAME_CACHING_STATE_, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(skos_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3470L)
    public static SubLObject skos_core_namespace_uriP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_utilities.NIL != rdf_uri.rdf_uri_p(v_object) && rdf_utilities.NIL != rdf_uri.rdf_uri_base_matchesP(v_object, skos_core_namespace()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3685L)
    public static SubLObject foaf_namespace() {
        return rdf_utilities.$foaf_namespace$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3748L)
    public static SubLObject clear_foaf_expanded_name() {
        final SubLObject cs = rdf_utilities.$foaf_expanded_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3748L)
    public static SubLObject remove_foaf_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_utilities.$foaf_expanded_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3748L)
    public static SubLObject foaf_expanded_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate(foaf_namespace(), local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3748L)
    public static SubLObject foaf_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = rdf_utilities.$foaf_expanded_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_utilities.$sym25$FOAF_EXPANDED_NAME, (SubLObject)rdf_utilities.$sym26$_FOAF_EXPANDED_NAME_CACHING_STATE_, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(foaf_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3889L)
    public static SubLObject clear_foaf_name() {
        final SubLObject cs = rdf_utilities.$foaf_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3889L)
    public static SubLObject remove_foaf_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_utilities.$foaf_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3889L)
    public static SubLObject foaf_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate((SubLObject)rdf_utilities.$str28$foaf_, local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 3889L)
    public static SubLObject foaf_name(final SubLObject local_name) {
        SubLObject caching_state = rdf_utilities.$foaf_name_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_utilities.$sym27$FOAF_NAME, (SubLObject)rdf_utilities.$sym29$_FOAF_NAME_CACHING_STATE_, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(foaf_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 4012L)
    public static SubLObject foaf_namespace_uriP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_utilities.NIL != rdf_uri.rdf_uri_p(v_object) && rdf_utilities.NIL != rdf_uri.rdf_uri_base_matchesP(v_object, foaf_namespace()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 4149L)
    public static SubLObject rdf_label_properties(SubLObject allow_alternate_labelsP) {
        if (allow_alternate_labelsP == rdf_utilities.UNPROVIDED) {
            allow_alternate_labelsP = (SubLObject)rdf_utilities.NIL;
        }
        SubLObject v_properties = (SubLObject)ConsesLow.list(foaf_expanded_name((SubLObject)rdf_utilities.$str30$name), skos_expanded_name((SubLObject)rdf_utilities.$str31$prefLabel), rdfs_expanded_name((SubLObject)rdf_utilities.$str32$label));
        SubLObject cdolist_list_var = cyc_pretty_string_uris();
        SubLObject property = (SubLObject)rdf_utilities.NIL;
        property = cdolist_list_var.first();
        while (rdf_utilities.NIL != cdolist_list_var) {
            v_properties = list_utilities.nadd_to_end(property, v_properties);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        if (rdf_utilities.NIL != allow_alternate_labelsP) {
            v_properties = list_utilities.nadd_to_end(skos_expanded_name((SubLObject)rdf_utilities.$str33$altLabel), v_properties);
        }
        return v_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 4607L)
    public static SubLObject cyc_pretty_string_uris() {
        return rdf_uris_for_cyc_term(rdf_utilities.$const34$prettyString, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 4700L)
    public static SubLObject clear_rdf_standard_prefix_for_namespace() {
        final SubLObject cs = rdf_utilities.$rdf_standard_prefix_for_namespace_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 4700L)
    public static SubLObject remove_rdf_standard_prefix_for_namespace(final SubLObject namespace) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_utilities.$rdf_standard_prefix_for_namespace_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(namespace), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 4700L)
    public static SubLObject rdf_standard_prefix_for_namespace_internal(final SubLObject namespace) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject prefix = (SubLObject)rdf_utilities.NIL;
        if (rdf_utilities.NIL != control_vars.kb_loaded()) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rdf_utilities.$sym36$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(rdf_utilities.$const37$EverythingPSC, thread);
                final SubLObject pred_var = rdf_utilities.$const38$uriString;
                if (rdf_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(namespace, (SubLObject)rdf_utilities.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(namespace, (SubLObject)rdf_utilities.TWO_INTEGER, pred_var);
                    SubLObject done_var = prefix;
                    final SubLObject token_var = (SubLObject)rdf_utilities.NIL;
                    while (rdf_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (rdf_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)rdf_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rdf_utilities.$kw39$GAF, (SubLObject)rdf_utilities.$kw40$TRUE, (SubLObject)rdf_utilities.NIL);
                                SubLObject done_var_$1 = prefix;
                                final SubLObject token_var_$2 = (SubLObject)rdf_utilities.NIL;
                                while (rdf_utilities.NIL == done_var_$1) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(gaf));
                                    if (rdf_utilities.NIL != valid_$3) {
                                        final SubLObject reified_namespace = assertions_high.gaf_arg1(gaf);
                                        prefix = kb_mapping_utilities.fpred_value(reified_namespace, rdf_utilities.$const41$standardPrefixForURI, (SubLObject)rdf_utilities.TWO_INTEGER, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.UNPROVIDED);
                                    }
                                    done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(rdf_utilities.NIL == valid_$3 || rdf_utilities.NIL != prefix);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (rdf_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(rdf_utilities.NIL == valid || rdf_utilities.NIL != prefix);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return prefix;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 4700L)
    public static SubLObject rdf_standard_prefix_for_namespace(final SubLObject namespace) {
        SubLObject caching_state = rdf_utilities.$rdf_standard_prefix_for_namespace_caching_state$.getGlobalValue();
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_utilities.$sym35$RDF_STANDARD_PREFIX_FOR_NAMESPACE, (SubLObject)rdf_utilities.$sym42$_RDF_STANDARD_PREFIX_FOR_NAMESPACE_CACHING_STATE_, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, namespace, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rdf_standard_prefix_for_namespace_internal(namespace)));
            memoization_state.caching_state_put(caching_state, namespace, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 5091L)
    public static SubLObject rdf_canonicalize_xml_string(final SubLObject xml) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = xml_parsing_utilities.xml_string_tokenize(xml, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
        SubLObject sexprs = (SubLObject)rdf_utilities.NIL;
        while (rdf_utilities.NIL != list_utilities.non_empty_list_p(tokens)) {
            thread.resetMultipleValues();
            final SubLObject sexpr = xml_parsing_utilities.xml_tokens_to_sexpr(tokens);
            final SubLObject remaining = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sexprs = (SubLObject)ConsesLow.cons(sexpr, sexprs);
            tokens = remaining;
        }
        return exclusive_canonical_xml_from_sexprs(Sequences.nreverse(sexprs), (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 5433L)
    public static SubLObject exclusive_canonical_xml_from_sexprs(final SubLObject xml_sexprs, SubLObject attribute_lists) {
        if (attribute_lists == rdf_utilities.UNPROVIDED) {
            attribute_lists = (SubLObject)rdf_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rdf_utilities.NIL != list_utilities.singletonP(xml_sexprs) && list_utilities.only_one(xml_sexprs).isString()) {
            return list_utilities.only_one(xml_sexprs);
        }
        SubLObject xml_string = (SubLObject)rdf_utilities.NIL;
        SubLObject stream = (SubLObject)rdf_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                SubLObject cdolist_list_var = exclusive_canonicalize_xml_sexprs(xml_sexprs, attribute_lists);
                SubLObject sexpr = (SubLObject)rdf_utilities.NIL;
                sexpr = cdolist_list_var.first();
                while (rdf_utilities.NIL != cdolist_list_var) {
                    xml_utilities.xml_sexpr_output_as_xml(sexpr);
                    cdolist_list_var = cdolist_list_var.rest();
                    sexpr = cdolist_list_var.first();
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            xml_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)rdf_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return string_utilities.trim_whitespace(xml_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 5980L)
    public static SubLObject exclusive_canonicalize_xml_sexprs(final SubLObject xml_sexprs, SubLObject attribute_lists) {
        if (attribute_lists == rdf_utilities.UNPROVIDED) {
            attribute_lists = (SubLObject)rdf_utilities.NIL;
        }
        SubLObject canonicalized = (SubLObject)rdf_utilities.NIL;
        SubLObject cdolist_list_var = xml_sexprs;
        SubLObject sexpr = (SubLObject)rdf_utilities.NIL;
        sexpr = cdolist_list_var.first();
        while (rdf_utilities.NIL != cdolist_list_var) {
            canonicalized = (SubLObject)ConsesLow.cons(exclusive_canonicalize_xml_sexpr(sexpr, attribute_lists), canonicalized);
            cdolist_list_var = cdolist_list_var.rest();
            sexpr = cdolist_list_var.first();
        }
        return Sequences.nreverse(canonicalized);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 6339L)
    public static SubLObject exclusive_canonicalize_xml_sexpr(final SubLObject sexpr, SubLObject attribute_lists) {
        if (attribute_lists == rdf_utilities.UNPROVIDED) {
            attribute_lists = (SubLObject)rdf_utilities.NIL;
        }
        return sexpr.isList() ? exclusive_canonicalize_xml_sexpr_internal(conses_high.copy_tree(sexpr), attribute_lists) : sexpr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 6546L)
    public static SubLObject exclusive_canonicalize_xml_sexpr_internal(final SubLObject sexpr, final SubLObject attribute_lists) {
        if (sexpr.isList()) {
            final SubLObject ns_key = get_namespace_key(xml_parsing_utilities.xml_sexpr_type(sexpr));
            final SubLObject xmlns = xmlns_from_attribute_lists(ns_key, attribute_lists);
            if (rdf_utilities.NIL != xmlns) {
                if (rdf_utilities.NIL == xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, ns_key)) {
                    xml_parsing_utilities.xml_sexpr_set_attribute(sexpr, ns_key, xmlns);
                }
            }
            final SubLObject augmented = (SubLObject)ConsesLow.cons(xml_parsing_utilities.xml_sexpr_attributes(sexpr), attribute_lists);
            SubLObject cdolist_list_var = xml_parsing_utilities.xml_sexpr_daughters(sexpr, (SubLObject)rdf_utilities.UNPROVIDED);
            SubLObject dtr = (SubLObject)rdf_utilities.NIL;
            dtr = cdolist_list_var.first();
            while (rdf_utilities.NIL != cdolist_list_var) {
                exclusive_canonicalize_xml_sexpr_internal(dtr, augmented);
                cdolist_list_var = cdolist_list_var.rest();
                dtr = cdolist_list_var.first();
            }
        }
        return sexpr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 7113L)
    public static SubLObject get_namespace_key(final SubLObject xml_sexpr_type) {
        final SubLObject colon_pos = Sequences.position((SubLObject)Characters.CHAR_colon, xml_sexpr_type, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
        return (SubLObject)((rdf_utilities.NIL != colon_pos) ? Sequences.cconcatenate((SubLObject)rdf_utilities.$str43$xmlns_, string_utilities.substring(xml_sexpr_type, (SubLObject)rdf_utilities.ZERO_INTEGER, colon_pos)) : rdf_utilities.$str44$xmlns);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 7331L)
    public static SubLObject xmlns_from_attribute_lists(final SubLObject ns_key, final SubLObject attribute_lists) {
        SubLObject xmlns = (SubLObject)rdf_utilities.NIL;
        if (rdf_utilities.NIL == xmlns) {
            SubLObject csome_list_var;
            SubLObject attribute_list;
            for (csome_list_var = attribute_lists, attribute_list = (SubLObject)rdf_utilities.NIL, attribute_list = csome_list_var.first(); rdf_utilities.NIL == xmlns && rdf_utilities.NIL != csome_list_var; xmlns = list_utilities.alist_lookup_without_values(attribute_list, ns_key, Symbols.symbol_function((SubLObject)rdf_utilities.$sym45$STRING_), (SubLObject)rdf_utilities.UNPROVIDED), csome_list_var = csome_list_var.rest(), attribute_list = csome_list_var.first()) {}
        }
        return xmlns;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 7573L)
    public static SubLObject rdf_find_or_create_term_for_node(final SubLObject node, final SubLObject v_graph) {
        if (rdf_utilities.NIL != rdf_uri.rdf_uri_p(node)) {
            return rdf_find_or_create_term_for_uri(node);
        }
        if (rdf_utilities.NIL != rdf_literal.rdf_literal_p(node)) {
            return rdf_find_or_create_term_for_literal(node);
        }
        if (rdf_utilities.NIL != rdf_list_p(node, v_graph)) {
            return rdf_find_or_create_term_for_list_node(node, v_graph);
        }
        Errors.error((SubLObject)rdf_utilities.$str46$Can_t_find_or_create_term_for__S, node);
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 7944L)
    public static SubLObject rdf_find_or_create_term_for_uri(final SubLObject uri) {
        final SubLObject v_term = rdf_find_term_for_uri(uri);
        return (rdf_utilities.NIL != forts.fort_p(v_term)) ? v_term : czer_main.cyc_find_or_create_nart(el_utilities.make_unary_formula(rdf_utilities.$const47$ResourceWithURIFn, rdf_uri.rdf_uri_utf8_string(uri)), (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 8200L)
    public static SubLObject rdf_find_term_for_uri(final SubLObject uri) {
        final SubLObject uri_string = rdf_uri.rdf_uri_utf8_string(uri);
        if (uri_string.equal(rdf_expanded_name((SubLObject)rdf_utilities.$str48$type))) {
            return rdf_utilities.$const49$isa;
        }
        return ask_utilities.query_variable((SubLObject)rdf_utilities.$sym50$_TERM, (SubLObject)ConsesLow.list(rdf_utilities.$const51$rdfURI, (SubLObject)rdf_utilities.$sym50$_TERM, uri_string), rdf_utilities.$const52$InferencePSC, (SubLObject)rdf_utilities.$list53).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 8687L)
    public static SubLObject rdf_find_or_create_term_for_literal(final SubLObject literal) {
        if (rdf_utilities.NIL == rdf_literal.rdf_literal_datatype(literal)) {
            return rdf_literal.rdf_literal_utf8_lexical_form(literal);
        }
        if (rdf_utilities.NIL != rdf_literal.rdf_boolean_literal_p(literal)) {
            final SubLObject value = rdf_literal.rdf_literal_utf8_lexical_form(literal);
            if (rdf_utilities.NIL != list_utilities.member_equalP(value, (SubLObject)rdf_utilities.$list54)) {
                return rdf_utilities.$const55$True;
            }
            if (rdf_utilities.NIL != list_utilities.member_equalP(value, (SubLObject)rdf_utilities.$list56)) {
                return rdf_utilities.$const57$False;
            }
        }
        else {
            if (rdf_utilities.NIL != rdf_literal.rdf_string_literal_p(literal)) {
                return rdf_literal.rdf_literal_utf8_lexical_form(literal);
            }
            if (rdf_utilities.NIL != rdf_literal.rdf_date_literal_p(literal)) {
                return cycl_date_from_rdf_date(rdf_literal.rdf_literal_utf8_lexical_form(literal));
            }
            if (rdf_utilities.NIL != rdf_literal.rdf_integer_literal_p(literal)) {
                return reader.read_from_string_ignoring_errors(rdf_literal.rdf_literal_utf8_lexical_form(literal), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
            }
            if (rdf_utilities.NIL != rdf_literal.rdf_double_literal_p(literal)) {
                return reader.read_from_string_ignoring_errors(rdf_literal.rdf_literal_utf8_lexical_form(literal), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
            }
            if (rdf_utilities.NIL != rdf_literal.rdf_uri_literal_p(literal) && rdf_utilities.NIL != web_utilities.uri_p(rdf_literal.rdf_literal_utf8_lexical_form(literal), (SubLObject)rdf_utilities.UNPROVIDED)) {
                return rdf_find_or_create_term_for_uri(rdf_uri.get_rdf_uri(rdf_literal.rdf_literal_utf8_lexical_form(literal), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED));
            }
            Errors.warn((SubLObject)rdf_utilities.$str58$literal_is_a__S, rdf_literal.rdf_literal_datatype(literal));
            Errors.error((SubLObject)rdf_utilities.$str46$Can_t_find_or_create_term_for__S, literal);
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 9883L)
    public static SubLObject rdf_find_or_create_term_for_list_node(final SubLObject list_node, final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rdf_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && rdf_utilities.NIL == rdf_list_p(list_node, v_graph)) {
            Errors.error((SubLObject)rdf_utilities.$str59$_S_is_not_a_list_node_, list_node);
        }
        if (rdf_utilities.NIL != rdf_uri.rdf_uri_p(list_node) && rdf_utilities.NIL != rdf_uri.rdf_uri_matchesP(list_node, rdf_expanded_name((SubLObject)rdf_utilities.$str60$nil))) {
            return rdf_utilities.$const61$TheEmptyList;
        }
        return czer_main.canonicalize_term(el_utilities.make_el_formula(rdf_utilities.$const62$TheList, rdf_list_node_terms(list_node, v_graph), (SubLObject)rdf_utilities.UNPROVIDED), (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 10257L)
    public static SubLObject rdf_list_node_terms(final SubLObject node, final SubLObject v_graph) {
        if (rdf_utilities.NIL != rdf_uri.rdf_uri_p(node) && rdf_utilities.NIL != rdf_uri.rdf_uri_matchesP(node, rdf_expanded_name((SubLObject)rdf_utilities.$str60$nil))) {
            return (SubLObject)rdf_utilities.NIL;
        }
        final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, (SubLObject)rdf_utilities.UNPROVIDED);
        final SubLObject first_triple = Sequences.find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name((SubLObject)rdf_utilities.$str63$first), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED), triples, (SubLObject)rdf_utilities.EQ, (SubLObject)rdf_utilities.$sym64$RDF_TRIPLE_PREDICATE, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
        final SubLObject first_term = rdf_find_or_create_term_for_node(rdf_triple.rdf_triple_object(first_triple), v_graph);
        final SubLObject rest_triple = Sequences.find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name((SubLObject)rdf_utilities.$str65$rest), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED), triples, (SubLObject)rdf_utilities.EQ, (SubLObject)rdf_utilities.$sym64$RDF_TRIPLE_PREDICATE, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
        final SubLObject rest_terms = rdf_list_node_terms(rdf_triple.rdf_triple_object(rest_triple), v_graph);
        return (SubLObject)ConsesLow.cons(first_term, rest_terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 10908L)
    public static SubLObject rdf_list_nodes(final SubLObject node, final SubLObject v_graph) {
        if (rdf_utilities.NIL != rdf_uri.rdf_uri_p(node) && rdf_utilities.NIL != rdf_uri.rdf_uri_matchesP(node, rdf_expanded_name((SubLObject)rdf_utilities.$str60$nil))) {
            return (SubLObject)rdf_utilities.NIL;
        }
        final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, (SubLObject)rdf_utilities.UNPROVIDED);
        final SubLObject first_triple = Sequences.find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name((SubLObject)rdf_utilities.$str63$first), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED), triples, (SubLObject)rdf_utilities.EQ, (SubLObject)rdf_utilities.$sym64$RDF_TRIPLE_PREDICATE, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
        final SubLObject first_node = rdf_triple.rdf_triple_object(first_triple);
        final SubLObject rest_triple = Sequences.find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name((SubLObject)rdf_utilities.$str65$rest), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED), triples, (SubLObject)rdf_utilities.EQ, (SubLObject)rdf_utilities.$sym64$RDF_TRIPLE_PREDICATE, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
        final SubLObject rest_nodes = rdf_list_nodes(rdf_triple.rdf_triple_object(rest_triple), v_graph);
        return (SubLObject)ConsesLow.cons(first_node, rest_nodes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 11508L)
    public static SubLObject rdf_list_p(final SubLObject node, final SubLObject v_graph) {
        if (rdf_utilities.NIL != rdf_uri.rdf_uri_p(node) && rdf_utilities.NIL != rdf_uri.rdf_uri_matchesP(node, rdf_expanded_name((SubLObject)rdf_utilities.$str60$nil))) {
            return (SubLObject)rdf_utilities.T;
        }
        if (rdf_utilities.NIL == rdf_blank_node.rdf_blank_node_p(node)) {
            return (SubLObject)rdf_utilities.NIL;
        }
        final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, (SubLObject)rdf_utilities.UNPROVIDED);
        if ((rdf_utilities.NIL == list_utilities.doubletonP(triples) && rdf_utilities.NIL == list_utilities.tripleP(triples)) || rdf_utilities.NIL == Sequences.find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name((SubLObject)rdf_utilities.$str63$first), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED), triples, (SubLObject)rdf_utilities.EQ, (SubLObject)rdf_utilities.$sym64$RDF_TRIPLE_PREDICATE, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED)) {
            return (SubLObject)rdf_utilities.NIL;
        }
        final SubLObject rest_triple = Sequences.find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name((SubLObject)rdf_utilities.$str65$rest), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED), triples, (SubLObject)rdf_utilities.EQ, (SubLObject)rdf_utilities.$sym64$RDF_TRIPLE_PREDICATE, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_utilities.NIL != rest_triple && rdf_utilities.NIL != rdf_list_p(rdf_triple.rdf_triple_object(rest_triple), v_graph));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 12156L)
    public static SubLObject rdf_graph_remove_node(final SubLObject v_graph, final SubLObject node) {
        if (rdf_utilities.NIL != rdf_graph.valid_rdf_subject_p(node)) {
            SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, (SubLObject)rdf_utilities.UNPROVIDED);
            SubLObject triple = (SubLObject)rdf_utilities.NIL;
            triple = cdolist_list_var.first();
            while (rdf_utilities.NIL != cdolist_list_var) {
                rdf_graph.rdf_graph_remove_triple(v_graph, rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple));
                cdolist_list_var = cdolist_list_var.rest();
                triple = cdolist_list_var.first();
            }
        }
        if (rdf_utilities.NIL != rdf_graph.valid_rdf_predicate_p(node)) {
            SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples(v_graph, node);
            SubLObject triple = (SubLObject)rdf_utilities.NIL;
            triple = cdolist_list_var.first();
            while (rdf_utilities.NIL != cdolist_list_var) {
                rdf_graph.rdf_graph_remove_triple(v_graph, rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple));
                cdolist_list_var = cdolist_list_var.rest();
                triple = cdolist_list_var.first();
            }
        }
        if (rdf_utilities.NIL != rdf_graph.valid_rdf_object_p(node)) {
            SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_object_triples(v_graph, node, (SubLObject)rdf_utilities.UNPROVIDED);
            SubLObject triple = (SubLObject)rdf_utilities.NIL;
            triple = cdolist_list_var.first();
            while (rdf_utilities.NIL != cdolist_list_var) {
                rdf_graph.rdf_graph_remove_triple(v_graph, rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple));
                cdolist_list_var = cdolist_list_var.rest();
                triple = cdolist_list_var.first();
            }
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 12981L)
    public static SubLObject rdf_graph_remove_list(final SubLObject v_graph, final SubLObject list) {
        if (rdf_utilities.NIL != rdf_blank_node.rdf_blank_node_p(list)) {
            final SubLObject first_node_triple = rdf_graph.rdf_graph_find_subject_triples(v_graph, list, rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name((SubLObject)rdf_utilities.$str63$first), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED)).first();
            final SubLObject rest_node_triple = rdf_graph.rdf_graph_find_subject_triples(v_graph, list, rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name((SubLObject)rdf_utilities.$str65$rest), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED)).first();
            if (rdf_utilities.NIL != rdf_triple.rdf_triple_p(first_node_triple, (SubLObject)rdf_utilities.UNPROVIDED) && rdf_utilities.NIL != rdf_triple.rdf_triple_p(rest_node_triple, (SubLObject)rdf_utilities.UNPROVIDED)) {
                rdf_graph_remove_list(v_graph, rdf_triple.rdf_triple_object(first_node_triple));
                rdf_graph_remove_list(v_graph, rdf_triple.rdf_triple_object(rest_node_triple));
                rdf_graph.rdf_graph_remove_known_triple(v_graph, first_node_triple);
                rdf_graph.rdf_graph_remove_known_triple(v_graph, rest_node_triple);
                rdf_graph_remove_node(v_graph, list);
            }
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 13751L)
    public static SubLObject download_rdf_url(final SubLObject url, SubLObject source_file) {
        if (source_file == rdf_utilities.UNPROVIDED) {
            source_file = (SubLObject)rdf_utilities.NIL;
        }
        return xml_utilities.download_xml_url(url, source_file, (SubLObject)rdf_utilities.$list66, (SubLObject)rdf_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 13925L)
    public static SubLObject rdf_uri_to_cyc_term(final SubLObject v_rdf_uri) {
        assert rdf_utilities.NIL != rdf_uri.rdf_uri_p(v_rdf_uri) : v_rdf_uri;
        final SubLObject uri_cyc_string = rdf_uri.rdf_uri_cyc_string(v_rdf_uri);
        SubLObject v_term = (SubLObject)rdf_utilities.NIL;
        if (rdf_utilities.NIL != owl_cycl_to_xml.cyc_uri_p(v_rdf_uri)) {
            v_term = cyc_term_from_cyc_rdf_uri(v_rdf_uri);
        }
        else {
            v_term = cyc_term_from_other_uri(uri_cyc_string);
        }
        if (rdf_utilities.NIL == v_term) {
            v_term = el_utilities.make_unary_formula(rdf_utilities.$const47$ResourceWithURIFn, uri_cyc_string);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 14412L)
    public static SubLObject cycl_date_from_rdf_date(final SubLObject date_string) {
        final SubLObject date_tokens = string_utilities.string_tokenize(date_string, (SubLObject)rdf_utilities.$list68, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
        final SubLObject year = string_utilities.string_to_integer(date_tokens.first());
        final SubLObject month = (SubLObject)((rdf_utilities.NIL != conses_high.second(date_tokens)) ? string_utilities.string_to_integer(conses_high.second(date_tokens)) : rdf_utilities.NIL);
        final SubLObject day = (SubLObject)((rdf_utilities.NIL != conses_high.third(date_tokens)) ? string_utilities.string_to_integer(conses_high.third(date_tokens)) : rdf_utilities.NIL);
        final SubLObject hour = (SubLObject)((rdf_utilities.NIL != conses_high.fourth(date_tokens)) ? reader.read_from_string_ignoring_errors(conses_high.fourth(date_tokens), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED) : rdf_utilities.NIL);
        final SubLObject minute = (SubLObject)((rdf_utilities.NIL != conses_high.fifth(date_tokens)) ? reader.read_from_string_ignoring_errors(conses_high.fifth(date_tokens), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED) : rdf_utilities.NIL);
        final SubLObject second = (SubLObject)((rdf_utilities.NIL != conses_high.sixth(date_tokens)) ? reader.read_from_string_ignoring_errors(conses_high.sixth(date_tokens), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED) : rdf_utilities.NIL);
        final SubLObject millisecond = (SubLObject)((rdf_utilities.NIL != conses_high.seventh(date_tokens)) ? reader.read_from_string_ignoring_errors(conses_high.seventh(date_tokens), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED) : rdf_utilities.NIL);
        return (rdf_utilities.NIL != millisecond) ? date_utilities.construct_calendar_date(year, month, day, hour, minute, second, millisecond) : date_utilities.construct_reduced_cycl_date(second, minute, hour, day, month, year);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 15360L)
    public static SubLObject cyc_term_from_other_uri_internal(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rdf_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rdf_utilities.$sym36$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rdf_utilities.$const37$EverythingPSC, thread);
            result = kb_mapping_utilities.fpred_value_in_any_mt(uri, rdf_utilities.$const51$rdfURI, (SubLObject)rdf_utilities.TWO_INTEGER, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 15360L)
    public static SubLObject cyc_term_from_other_uri(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rdf_utilities.NIL;
        if (rdf_utilities.NIL == v_memoization_state) {
            return cyc_term_from_other_uri_internal(uri);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rdf_utilities.$sym69$CYC_TERM_FROM_OTHER_URI, (SubLObject)rdf_utilities.UNPROVIDED);
        if (rdf_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rdf_utilities.$sym69$CYC_TERM_FROM_OTHER_URI, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.NIL, (SubLObject)rdf_utilities.EQUAL, (SubLObject)rdf_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rdf_utilities.$sym69$CYC_TERM_FROM_OTHER_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, uri, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cyc_term_from_other_uri_internal(uri)));
            memoization_state.caching_state_put(caching_state, uri, results, (SubLObject)rdf_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 15560L)
    public static SubLObject cyc_term_from_cyc_rdf_uri(final SubLObject cyc_uri) {
        assert rdf_utilities.NIL != rdf_uri.rdf_uri_p(cyc_uri) : cyc_uri;
        final SubLObject id = find_id_from_cyc_uri_string(rdf_uri.rdf_uri_local_part(cyc_uri));
        SubLObject cyc_term = constants_high.find_constant(id);
        if (rdf_utilities.NIL == cyc_term) {
            cyc_term = kb_utilities.find_object_by_compact_hl_external_id_string(id);
        }
        if (rdf_utilities.NIL != cycl_grammar.cycl_denotational_term_p(cyc_term)) {
            return cyc_term;
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 15939L)
    public static SubLObject find_id_from_cyc_uri_string(final SubLObject uri) {
        final SubLObject slash_position = conses_high.last(string_utilities.search_all((SubLObject)rdf_utilities.$str70$_, uri, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED), (SubLObject)rdf_utilities.UNPROVIDED).first();
        final SubLObject uri_after_slash = string_utilities.substring(uri, (SubLObject)((rdf_utilities.NIL != slash_position) ? slash_position : rdf_utilities.ZERO_INTEGER), (SubLObject)rdf_utilities.UNPROVIDED);
        final SubLObject id = Strings.string_right_trim((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_greater), uri_after_slash);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 16200L)
    public static SubLObject rdf_uris_for_cyc_term(final SubLObject v_term, SubLObject namespace, SubLObject external_onlyP) {
        if (namespace == rdf_utilities.UNPROVIDED) {
            namespace = (SubLObject)rdf_utilities.NIL;
        }
        if (external_onlyP == rdf_utilities.UNPROVIDED) {
            external_onlyP = (SubLObject)rdf_utilities.NIL;
        }
        SubLObject uris = (SubLObject)rdf_utilities.NIL;
        if (v_term.eql(rdf_utilities.$const71$rdf_type)) {
            uris = (SubLObject)ConsesLow.cons(rdf_expanded_name((SubLObject)rdf_utilities.$str48$type), uris);
        }
        if (rdf_utilities.NIL != kb_indexing_datastructures.indexed_term_p(v_term)) {
            final SubLObject all_uris = Sequences.remove((SubLObject)rdf_utilities.NIL, Mapping.mapcar((SubLObject)rdf_utilities.$sym72$STRINGIFY_CYC_URI, kb_mapping_utilities.pred_values(v_term, rdf_utilities.$const51$rdfURI, (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)rdf_utilities.TWO_INTEGER, (SubLObject)rdf_utilities.$kw40$TRUE)), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
            final SubLObject items_var = (rdf_utilities.NIL != namespace) ? list_utilities.find_all(namespace, all_uris, (SubLObject)rdf_utilities.$sym73$STARTS_WITH, (SubLObject)rdf_utilities.UNPROVIDED) : all_uris;
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = (SubLObject)rdf_utilities.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)rdf_utilities.NIL, v_iteration = (SubLObject)rdf_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)rdf_utilities.ONE_INTEGER)) {
                    element_num = ((rdf_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)rdf_utilities.ONE_INTEGER) : v_iteration);
                    item = Vectors.aref(vector_var, element_num);
                    uris = (SubLObject)ConsesLow.cons(item, uris);
                }
            }
            else {
                SubLObject cdolist_list_var = items_var;
                SubLObject item2 = (SubLObject)rdf_utilities.NIL;
                item2 = cdolist_list_var.first();
                while (rdf_utilities.NIL != cdolist_list_var) {
                    uris = (SubLObject)ConsesLow.cons(item2, uris);
                    cdolist_list_var = cdolist_list_var.rest();
                    item2 = cdolist_list_var.first();
                }
            }
        }
        if (rdf_utilities.NIL != formula_pattern_match.formula_matches_pattern(v_term, (SubLObject)rdf_utilities.$list74) && rdf_utilities.NIL != web_utilities.uri_p(string_utilities.post_remove(string_utilities.pre_remove(cycl_utilities.nat_arg2(v_term, (SubLObject)rdf_utilities.UNPROVIDED), (SubLObject)rdf_utilities.$str75$_, (SubLObject)rdf_utilities.UNPROVIDED), (SubLObject)rdf_utilities.$str76$_, (SubLObject)rdf_utilities.UNPROVIDED), (SubLObject)rdf_utilities.UNPROVIDED)) {
            uris = (SubLObject)ConsesLow.cons(string_utilities.post_remove(string_utilities.pre_remove(cycl_utilities.nat_arg2(v_term, (SubLObject)rdf_utilities.UNPROVIDED), (SubLObject)rdf_utilities.$str75$_, (SubLObject)rdf_utilities.UNPROVIDED), (SubLObject)rdf_utilities.$str76$_, (SubLObject)rdf_utilities.UNPROVIDED), uris);
        }
        if (rdf_utilities.NIL != formula_pattern_match.formula_matches_pattern(v_term, (SubLObject)rdf_utilities.$list77)) {
            uris = (SubLObject)ConsesLow.cons(cycl_utilities.nat_arg1(v_term, (SubLObject)rdf_utilities.UNPROVIDED), uris);
        }
        if (rdf_utilities.NIL == external_onlyP && rdf_utilities.NIL != forts.fort_p(v_term) && (rdf_utilities.NIL == namespace || rdf_utilities.NIL != Sequences.search((SubLObject)rdf_utilities.$str78$opencyc, namespace, Symbols.symbol_function((SubLObject)rdf_utilities.EQUAL), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED))) {
            uris = (SubLObject)ConsesLow.cons(owl_cycl_to_xml.owl_opencyc_latest_uri_for_fort(v_term), uris);
            uris = (SubLObject)ConsesLow.cons(owl_cycl_to_xml.owl_opencyc_versioned_uri_for_fort(v_term, (SubLObject)rdf_utilities.UNPROVIDED), uris);
            uris = (SubLObject)ConsesLow.cons(owl_cycl_to_xml.owl_opencyc_readable_uri_for_fort(v_term, (SubLObject)rdf_utilities.UNPROVIDED), uris);
            if (rdf_utilities.NIL != namespace) {
                uris = list_utilities.find_all(namespace, uris, Symbols.symbol_function((SubLObject)rdf_utilities.EQUAL), (SubLObject)rdf_utilities.UNPROVIDED);
            }
        }
        return Sequences.delete_duplicates(uris, Symbols.symbol_function((SubLObject)rdf_utilities.EQUAL), (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-utilities.lisp", position = 17549L)
    public static SubLObject stringify_cyc_uri(final SubLObject cyc_uri) {
        if (cyc_uri.isString()) {
            return cyc_uri;
        }
        if (rdf_utilities.NIL != conses_high.member(cycl_utilities.nat_functor(cyc_uri), (SubLObject)rdf_utilities.$list79, (SubLObject)rdf_utilities.UNPROVIDED, (SubLObject)rdf_utilities.UNPROVIDED)) {
            return stringify_cyc_uri(cycl_utilities.nat_arg1(cyc_uri, (SubLObject)rdf_utilities.UNPROVIDED));
        }
        return (SubLObject)rdf_utilities.NIL;
    }
    
    public static SubLObject declare_rdf_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_rdf_caches", "CLEAR-RDF-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_namespace", "RDF-NAMESPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_rdf_expanded_name", "CLEAR-RDF-EXPANDED-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "remove_rdf_expanded_name", "REMOVE-RDF-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_expanded_name_internal", "RDF-EXPANDED-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_expanded_name", "RDF-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_rdf_name", "CLEAR-RDF-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "remove_rdf_name", "REMOVE-RDF-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_name_internal", "RDF-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_name", "RDF-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_namespace_uriP", "RDF-NAMESPACE-URI?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "xsd_namespace", "XSD-NAMESPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_xsd_expanded_name", "CLEAR-XSD-EXPANDED-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "remove_xsd_expanded_name", "REMOVE-XSD-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "xsd_expanded_name_internal", "XSD-EXPANDED-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "xsd_expanded_name", "XSD-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_xsd_name", "CLEAR-XSD-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "remove_xsd_name", "REMOVE-XSD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "xsd_name_internal", "XSD-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "xsd_name", "XSD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "xsd_namespace_uriP", "XSD-NAMESPACE-URI?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdfs_namespace", "RDFS-NAMESPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_rdfs_expanded_name", "CLEAR-RDFS-EXPANDED-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "remove_rdfs_expanded_name", "REMOVE-RDFS-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdfs_expanded_name_internal", "RDFS-EXPANDED-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdfs_expanded_name", "RDFS-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_rdfs_name", "CLEAR-RDFS-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "remove_rdfs_name", "REMOVE-RDFS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdfs_name_internal", "RDFS-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdfs_name", "RDFS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdfs_namespace_uriP", "RDFS-NAMESPACE-URI?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "skos_core_namespace", "SKOS-CORE-NAMESPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_skos_expanded_name", "CLEAR-SKOS-EXPANDED-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "remove_skos_expanded_name", "REMOVE-SKOS-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "skos_expanded_name_internal", "SKOS-EXPANDED-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "skos_expanded_name", "SKOS-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_skos_name", "CLEAR-SKOS-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "remove_skos_name", "REMOVE-SKOS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "skos_name_internal", "SKOS-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "skos_name", "SKOS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "skos_core_namespace_uriP", "SKOS-CORE-NAMESPACE-URI?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "foaf_namespace", "FOAF-NAMESPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_foaf_expanded_name", "CLEAR-FOAF-EXPANDED-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "remove_foaf_expanded_name", "REMOVE-FOAF-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "foaf_expanded_name_internal", "FOAF-EXPANDED-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "foaf_expanded_name", "FOAF-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_foaf_name", "CLEAR-FOAF-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "remove_foaf_name", "REMOVE-FOAF-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "foaf_name_internal", "FOAF-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "foaf_name", "FOAF-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "foaf_namespace_uriP", "FOAF-NAMESPACE-URI?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_label_properties", "RDF-LABEL-PROPERTIES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "cyc_pretty_string_uris", "CYC-PRETTY-STRING-URIS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "clear_rdf_standard_prefix_for_namespace", "CLEAR-RDF-STANDARD-PREFIX-FOR-NAMESPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "remove_rdf_standard_prefix_for_namespace", "REMOVE-RDF-STANDARD-PREFIX-FOR-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_standard_prefix_for_namespace_internal", "RDF-STANDARD-PREFIX-FOR-NAMESPACE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_standard_prefix_for_namespace", "RDF-STANDARD-PREFIX-FOR-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_canonicalize_xml_string", "RDF-CANONICALIZE-XML-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "exclusive_canonical_xml_from_sexprs", "EXCLUSIVE-CANONICAL-XML-FROM-SEXPRS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "exclusive_canonicalize_xml_sexprs", "EXCLUSIVE-CANONICALIZE-XML-SEXPRS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "exclusive_canonicalize_xml_sexpr", "EXCLUSIVE-CANONICALIZE-XML-SEXPR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "exclusive_canonicalize_xml_sexpr_internal", "EXCLUSIVE-CANONICALIZE-XML-SEXPR-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "get_namespace_key", "GET-NAMESPACE-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "xmlns_from_attribute_lists", "XMLNS-FROM-ATTRIBUTE-LISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_find_or_create_term_for_node", "RDF-FIND-OR-CREATE-TERM-FOR-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_find_or_create_term_for_uri", "RDF-FIND-OR-CREATE-TERM-FOR-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_find_term_for_uri", "RDF-FIND-TERM-FOR-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_find_or_create_term_for_literal", "RDF-FIND-OR-CREATE-TERM-FOR-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_find_or_create_term_for_list_node", "RDF-FIND-OR-CREATE-TERM-FOR-LIST-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_list_node_terms", "RDF-LIST-NODE-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_list_nodes", "RDF-LIST-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_list_p", "RDF-LIST-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_graph_remove_node", "RDF-GRAPH-REMOVE-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_graph_remove_list", "RDF-GRAPH-REMOVE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "download_rdf_url", "DOWNLOAD-RDF-URL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_uri_to_cyc_term", "RDF-URI-TO-CYC-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "cycl_date_from_rdf_date", "CYCL-DATE-FROM-RDF-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "cyc_term_from_other_uri_internal", "CYC-TERM-FROM-OTHER-URI-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "cyc_term_from_other_uri", "CYC-TERM-FROM-OTHER-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "cyc_term_from_cyc_rdf_uri", "CYC-TERM-FROM-CYC-RDF-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "find_id_from_cyc_uri_string", "FIND-ID-FROM-CYC-URI-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "rdf_uris_for_cyc_term", "RDF-URIS-FOR-CYC-TERM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_utilities", "stringify_cyc_uri", "STRINGIFY-CYC-URI", 1, 0, false);
        return (SubLObject)rdf_utilities.NIL;
    }
    
    public static SubLObject init_rdf_utilities_file() {
        rdf_utilities.$rdf_namespace$ = SubLFiles.deflexical("*RDF-NAMESPACE*", (SubLObject)rdf_utilities.$str0$http___www_w3_org_1999_02_22_rdf_);
        rdf_utilities.$rdf_expanded_name_caching_state$ = SubLFiles.deflexical("*RDF-EXPANDED-NAME-CACHING-STATE*", (SubLObject)rdf_utilities.NIL);
        rdf_utilities.$rdf_name_caching_state$ = SubLFiles.deflexical("*RDF-NAME-CACHING-STATE*", (SubLObject)rdf_utilities.NIL);
        rdf_utilities.$xsd_namespace$ = SubLFiles.deflexical("*XSD-NAMESPACE*", (SubLObject)rdf_utilities.$str6$http___www_w3_org_2001_XMLSchema_);
        rdf_utilities.$xsd_expanded_name_caching_state$ = SubLFiles.deflexical("*XSD-EXPANDED-NAME-CACHING-STATE*", (SubLObject)rdf_utilities.NIL);
        rdf_utilities.$xsd_name_caching_state$ = SubLFiles.deflexical("*XSD-NAME-CACHING-STATE*", (SubLObject)rdf_utilities.NIL);
        rdf_utilities.$rdfs_namespace$ = SubLFiles.deflexical("*RDFS-NAMESPACE*", (SubLObject)rdf_utilities.$str12$http___www_w3_org_2000_01_rdf_sch);
        rdf_utilities.$rdfs_expanded_name_caching_state$ = SubLFiles.deflexical("*RDFS-EXPANDED-NAME-CACHING-STATE*", (SubLObject)rdf_utilities.NIL);
        rdf_utilities.$rdfs_name_caching_state$ = SubLFiles.deflexical("*RDFS-NAME-CACHING-STATE*", (SubLObject)rdf_utilities.NIL);
        rdf_utilities.$skos_core_namespace$ = SubLFiles.deflexical("*SKOS-CORE-NAMESPACE*", (SubLObject)rdf_utilities.$str18$http___www_w3_org_2004_02_skos_co);
        rdf_utilities.$skos_expanded_name_caching_state$ = SubLFiles.deflexical("*SKOS-EXPANDED-NAME-CACHING-STATE*", (SubLObject)rdf_utilities.NIL);
        rdf_utilities.$skos_name_caching_state$ = SubLFiles.deflexical("*SKOS-NAME-CACHING-STATE*", (SubLObject)rdf_utilities.NIL);
        rdf_utilities.$foaf_namespace$ = SubLFiles.deflexical("*FOAF-NAMESPACE*", (SubLObject)rdf_utilities.$str24$http___xmlns_com_foaf_0_1_);
        rdf_utilities.$foaf_expanded_name_caching_state$ = SubLFiles.deflexical("*FOAF-EXPANDED-NAME-CACHING-STATE*", (SubLObject)rdf_utilities.NIL);
        rdf_utilities.$foaf_name_caching_state$ = SubLFiles.deflexical("*FOAF-NAME-CACHING-STATE*", (SubLObject)rdf_utilities.NIL);
        rdf_utilities.$rdf_standard_prefix_for_namespace_caching_state$ = SubLFiles.deflexical("*RDF-STANDARD-PREFIX-FOR-NAMESPACE-CACHING-STATE*", (SubLObject)rdf_utilities.NIL);
        return (SubLObject)rdf_utilities.NIL;
    }
    
    public static SubLObject setup_rdf_utilities_file() {
        memoization_state.note_globally_cached_function((SubLObject)rdf_utilities.$sym1$RDF_EXPANDED_NAME);
        memoization_state.note_globally_cached_function((SubLObject)rdf_utilities.$sym3$RDF_NAME);
        memoization_state.note_globally_cached_function((SubLObject)rdf_utilities.$sym7$XSD_EXPANDED_NAME);
        memoization_state.note_globally_cached_function((SubLObject)rdf_utilities.$sym9$XSD_NAME);
        memoization_state.note_globally_cached_function((SubLObject)rdf_utilities.$sym13$RDFS_EXPANDED_NAME);
        memoization_state.note_globally_cached_function((SubLObject)rdf_utilities.$sym15$RDFS_NAME);
        memoization_state.note_globally_cached_function((SubLObject)rdf_utilities.$sym19$SKOS_EXPANDED_NAME);
        memoization_state.note_globally_cached_function((SubLObject)rdf_utilities.$sym21$SKOS_NAME);
        memoization_state.note_globally_cached_function((SubLObject)rdf_utilities.$sym25$FOAF_EXPANDED_NAME);
        memoization_state.note_globally_cached_function((SubLObject)rdf_utilities.$sym27$FOAF_NAME);
        memoization_state.note_globally_cached_function((SubLObject)rdf_utilities.$sym35$RDF_STANDARD_PREFIX_FOR_NAMESPACE);
        memoization_state.note_memoized_function((SubLObject)rdf_utilities.$sym69$CYC_TERM_FROM_OTHER_URI);
        return (SubLObject)rdf_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rdf_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rdf_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rdf_utilities_file();
    }
    
    static {
        me = (SubLFile)new rdf_utilities();
        rdf_utilities.$rdf_namespace$ = null;
        rdf_utilities.$rdf_expanded_name_caching_state$ = null;
        rdf_utilities.$rdf_name_caching_state$ = null;
        rdf_utilities.$xsd_namespace$ = null;
        rdf_utilities.$xsd_expanded_name_caching_state$ = null;
        rdf_utilities.$xsd_name_caching_state$ = null;
        rdf_utilities.$rdfs_namespace$ = null;
        rdf_utilities.$rdfs_expanded_name_caching_state$ = null;
        rdf_utilities.$rdfs_name_caching_state$ = null;
        rdf_utilities.$skos_core_namespace$ = null;
        rdf_utilities.$skos_expanded_name_caching_state$ = null;
        rdf_utilities.$skos_name_caching_state$ = null;
        rdf_utilities.$foaf_namespace$ = null;
        rdf_utilities.$foaf_expanded_name_caching_state$ = null;
        rdf_utilities.$foaf_name_caching_state$ = null;
        rdf_utilities.$rdf_standard_prefix_for_namespace_caching_state$ = null;
        $str0$http___www_w3_org_1999_02_22_rdf_ = SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        $sym1$RDF_EXPANDED_NAME = SubLObjectFactory.makeSymbol("RDF-EXPANDED-NAME");
        $sym2$_RDF_EXPANDED_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RDF-EXPANDED-NAME-CACHING-STATE*");
        $sym3$RDF_NAME = SubLObjectFactory.makeSymbol("RDF-NAME");
        $str4$rdf_ = SubLObjectFactory.makeString("rdf:");
        $sym5$_RDF_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RDF-NAME-CACHING-STATE*");
        $str6$http___www_w3_org_2001_XMLSchema_ = SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#");
        $sym7$XSD_EXPANDED_NAME = SubLObjectFactory.makeSymbol("XSD-EXPANDED-NAME");
        $sym8$_XSD_EXPANDED_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*XSD-EXPANDED-NAME-CACHING-STATE*");
        $sym9$XSD_NAME = SubLObjectFactory.makeSymbol("XSD-NAME");
        $str10$xsd_ = SubLObjectFactory.makeString("xsd:");
        $sym11$_XSD_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*XSD-NAME-CACHING-STATE*");
        $str12$http___www_w3_org_2000_01_rdf_sch = SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#");
        $sym13$RDFS_EXPANDED_NAME = SubLObjectFactory.makeSymbol("RDFS-EXPANDED-NAME");
        $sym14$_RDFS_EXPANDED_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RDFS-EXPANDED-NAME-CACHING-STATE*");
        $sym15$RDFS_NAME = SubLObjectFactory.makeSymbol("RDFS-NAME");
        $str16$rdfs_ = SubLObjectFactory.makeString("rdfs:");
        $sym17$_RDFS_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RDFS-NAME-CACHING-STATE*");
        $str18$http___www_w3_org_2004_02_skos_co = SubLObjectFactory.makeString("http://www.w3.org/2004/02/skos/core#");
        $sym19$SKOS_EXPANDED_NAME = SubLObjectFactory.makeSymbol("SKOS-EXPANDED-NAME");
        $sym20$_SKOS_EXPANDED_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SKOS-EXPANDED-NAME-CACHING-STATE*");
        $sym21$SKOS_NAME = SubLObjectFactory.makeSymbol("SKOS-NAME");
        $str22$skos_ = SubLObjectFactory.makeString("skos:");
        $sym23$_SKOS_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SKOS-NAME-CACHING-STATE*");
        $str24$http___xmlns_com_foaf_0_1_ = SubLObjectFactory.makeString("http://xmlns.com/foaf/0.1/");
        $sym25$FOAF_EXPANDED_NAME = SubLObjectFactory.makeSymbol("FOAF-EXPANDED-NAME");
        $sym26$_FOAF_EXPANDED_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FOAF-EXPANDED-NAME-CACHING-STATE*");
        $sym27$FOAF_NAME = SubLObjectFactory.makeSymbol("FOAF-NAME");
        $str28$foaf_ = SubLObjectFactory.makeString("foaf:");
        $sym29$_FOAF_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FOAF-NAME-CACHING-STATE*");
        $str30$name = SubLObjectFactory.makeString("name");
        $str31$prefLabel = SubLObjectFactory.makeString("prefLabel");
        $str32$label = SubLObjectFactory.makeString("label");
        $str33$altLabel = SubLObjectFactory.makeString("altLabel");
        $const34$prettyString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prettyString"));
        $sym35$RDF_STANDARD_PREFIX_FOR_NAMESPACE = SubLObjectFactory.makeSymbol("RDF-STANDARD-PREFIX-FOR-NAMESPACE");
        $sym36$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const37$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const38$uriString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("uriString"));
        $kw39$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw40$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const41$standardPrefixForURI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("standardPrefixForURI"));
        $sym42$_RDF_STANDARD_PREFIX_FOR_NAMESPACE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RDF-STANDARD-PREFIX-FOR-NAMESPACE-CACHING-STATE*");
        $str43$xmlns_ = SubLObjectFactory.makeString("xmlns:");
        $str44$xmlns = SubLObjectFactory.makeString("xmlns");
        $sym45$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $str46$Can_t_find_or_create_term_for__S = SubLObjectFactory.makeString("Can't find or create term for ~S");
        $const47$ResourceWithURIFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResourceWithURIFn"));
        $str48$type = SubLObjectFactory.makeString("type");
        $const49$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym50$_TERM = SubLObjectFactory.makeSymbol("?TERM");
        $const51$rdfURI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfURI"));
        $const52$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)rdf_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("T"), (SubLObject)SubLObjectFactory.makeString("1"), (SubLObject)SubLObjectFactory.makeString("true"), (SubLObject)SubLObjectFactory.makeString("True"), (SubLObject)SubLObjectFactory.makeString("TRUE"));
        $const55$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NIL"), (SubLObject)SubLObjectFactory.makeString("0"), (SubLObject)SubLObjectFactory.makeString("false"), (SubLObject)SubLObjectFactory.makeString("False"), (SubLObject)SubLObjectFactory.makeString("FALSE"));
        $const57$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $str58$literal_is_a__S = SubLObjectFactory.makeString("literal is a ~S");
        $str59$_S_is_not_a_list_node_ = SubLObjectFactory.makeString("~S is not a list node.");
        $str60$nil = SubLObjectFactory.makeString("nil");
        $const61$TheEmptyList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheEmptyList"));
        $const62$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $str63$first = SubLObjectFactory.makeString("first");
        $sym64$RDF_TRIPLE_PREDICATE = SubLObjectFactory.makeSymbol("RDF-TRIPLE-PREDICATE");
        $str65$rest = SubLObjectFactory.makeString("rest");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application/rdf+xml"), (SubLObject)SubLObjectFactory.makeString("*/*;q=0.5"));
        $sym67$RDF_URI_P = SubLObjectFactory.makeSymbol("RDF-URI-P");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-"), (SubLObject)SubLObjectFactory.makeString("T"), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeString("."));
        $sym69$CYC_TERM_FROM_OTHER_URI = SubLObjectFactory.makeSymbol("CYC-TERM-FROM-OTHER-URI");
        $str70$_ = SubLObjectFactory.makeString("/");
        $const71$rdf_type = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdf-type"));
        $sym72$STRINGIFY_CYC_URI = SubLObjectFactory.makeSymbol("STRINGIFY-CYC-URI");
        $sym73$STARTS_WITH = SubLObjectFactory.makeSymbol("STARTS-WITH");
        $list74 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"));
        $str75$_ = SubLObjectFactory.makeString("<");
        $str76$_ = SubLObjectFactory.makeString(">");
        $list77 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResourceWithURIFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("URI-P")));
        $str78$opencyc = SubLObjectFactory.makeString("opencyc");
        $list79 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URLFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn")));
    }
}

/*

	Total time: 312 ms
	
*/