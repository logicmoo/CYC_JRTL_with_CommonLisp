package com.cyc.cycjava.cycl.rdf;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.owl.owl_to_cycl;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.owl.owl_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rdf_parser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_parser";
    public static final String myFingerPrint = "b240a92bfa79ec66d578cbd47b93fc6881664e866657f8b386c5df71f6716ff4";
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 919L)
    private static SubLSymbol $rdf_parser_current_lang$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 997L)
    private static SubLSymbol $rdf_parser_node_ids$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 1117L)
    private static SubLSymbol $rdf_parser_blank_node_id_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 1188L)
    private static SubLSymbol $rdf_parser_blank_node_index$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 7000L)
    private static SubLSymbol $rdf_parser_next_list_item_number$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 7123L)
    private static SubLSymbol $rdf_parser_recursedP$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 18967L)
    private static SubLSymbol $resolve_rdfXxml_uri_internal_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 20200L)
    private static SubLSymbol $expand_rdf_xml_uri_namespace_prefix_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 21192L)
    private static SubLSymbol $rdfXxml_core_syntax_uris$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 21653L)
    private static SubLSymbol $rdfXxml_old_term_uris$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 26970L)
    public static SubLSymbol $rdfXxml_parser_test_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 26970L)
    public static SubLSymbol $rdfXxml_parser_test_base_uri$;
    private static final SubLString $str0$file__;
    private static final SubLSymbol $sym1$FILE_EXISTS_;
    private static final SubLSymbol $kw2$INPUT;
    private static final SubLString $str3$Unable_to_open__S;
    private static final SubLString $str4$Ontology;
    private static final SubLString $str5$type;
    private static final SubLSymbol $sym6$URL_P;
    private static final SubLSymbol $kw7$OUTPUT;
    private static final SubLSymbol $sym8$RDF_GRAPH_P;
    private static final SubLString $str9$base;
    private static final SubLString $str10$lang;
    private static final SubLInteger $int11$10000;
    private static final SubLString $str12$Parsing_RDF_XML_stream___;
    private static final SubLInteger $int13$1000;
    private static final SubLString $str14$_;
    private static final SubLSymbol $sym15$VALID_NODE_ELEMENT_RDF_URI_P;
    private static final SubLString $str16$li;
    private static final SubLString $str17$rdf_li_is_not_allowed_as_as_an_at;
    private static final SubLString $str18$Description;
    private static final SubLString $str19$_;
    private static final SubLString $str20$resource;
    private static final SubLString $str21$This_is_not_legal_RDF__specifying;
    private static final SubLString $str22$Resource;
    private static final SubLString $str23$parseType;
    private static final SubLString $str24$Collection;
    private static final SubLString $str25$parseTypeOtherPropertyElt_not_yet;
    private static final SubLString $str26$ID;
    private static final SubLString $str27$Can_t_handle_property_element___A;
    private static final SubLSymbol $sym28$VALID_PROPERTY_ATTRIBUTE_RDF_URI_P;
    private static final SubLString $str29$rdf_parseType__Literal__is_forbid;
    private static final SubLString $str30$datatype;
    private static final SubLString $str31$;
    private static final SubLString $str32$Statement;
    private static final SubLString $str33$subject;
    private static final SubLString $str34$predicate;
    private static final SubLString $str35$object;
    private static final SubLString $str36$nil;
    private static final SubLString $str37$rest;
    private static final SubLString $str38$first;
    private static final SubLString $str39$Literal;
    private static final SubLList $list40;
    private static final SubLString $str41$xml;
    private static final SubLString $str42$_S_has_been_removed_from_the_RDF_;
    private static final SubLSymbol $sym43$RESOLVE_RDF_XML_URI_INTERNAL;
    private static final SubLString $str44$xmlns;
    private static final SubLSymbol $sym45$_RESOLVE_RDF_XML_URI_INTERNAL_CACHING_STATE_;
    private static final SubLSymbol $sym46$EXPAND_RDF_XML_URI_NAMESPACE_PREFIX;
    private static final SubLString $str47$xmlns_;
    private static final SubLSymbol $sym48$_EXPAND_RDF_XML_URI_NAMESPACE_PREFIX_CACHING_STATE_;
    private static final SubLSymbol $kw49$UNINITIALIZED;
    private static final SubLString $str50$RDF;
    private static final SubLString $str51$about;
    private static final SubLString $str52$nodeID;
    private static final SubLString $str53$Unable_to_initialize__A__;
    private static final SubLSymbol $sym54$RDF_URI_MATCHES_;
    private static final SubLString $str55$aboutEach;
    private static final SubLString $str56$aboutEachPrefix;
    private static final SubLString $str57$bagID;
    private static final SubLString $str58$XMLLiteral;
    private static final SubLString $str59$Cannot_have_rdf_nodeID_and_rdf_ID;
    private static final SubLString $str60$Cannot_have_rdf_about_and_rdf_ID_;
    private static final SubLString $str61$Cannot_have_rdf_nodeID_and_rdf_ab;
    private static final SubLString $str62$Cannot_have_rdf_nodeID_and_rdf_re;
    private static final SubLSymbol $sym63$VALID_XML_NAMESPACES_NAME_P;
    private static final SubLString $str64$Name_clash__Graph_already_has_nod;
    private static final SubLSymbol $sym65$VALID_XML_NAME_P;
    private static final SubLString $str66$_;
    private static final SubLString $str67$Couldn_t_resolve_local_name__S;
    private static final SubLString $str68$Output_must_be_to_either_an_RDF_G;
    private static final SubLSymbol $sym69$TEST_RDF_XML_PARSER;
    private static final SubLSymbol $kw70$TEST;
    private static final SubLSymbol $kw71$OWNER;
    private static final SubLSymbol $kw72$CLASSES;
    private static final SubLList $list73;
    private static final SubLSymbol $kw74$KB;
    private static final SubLSymbol $kw75$TINY;
    private static final SubLSymbol $kw76$WORKING_;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$TEST_RDF_TO_N_TRIPLES;
    private static final SubLList $list79;
    private static final SubLString $str80$_home_baxter_owl_rdf_approved_tes;
    private static final SubLString $str81$http___www_w3_org_2000_10_rdf_tes;
    private static final SubLString $str82$Running_;
    private static final SubLString $str83$_RDF_parsing_tests___;
    private static final SubLString $str84$cdolist;
    private static final SubLSymbol $sym85$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str86$error;
    private static final SubLString $str87$__Failed___S__;
    private static final SubLString $str88$__Summary___D_Parsed___D_Rightly_;
    private static final SubLSymbol $sym89$DIRECTORY_P;
    private static final SubLString $str90$_Directory__;
    private static final SubLString $str91$_rdf;
    private static final SubLString $str92$_nt;
    private static final SubLString $str93$Graph_mismatch__Extra___S___Missi;
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 1258L)
    public static SubLObject parse_rdfXxml_file(final SubLObject filename, SubLObject base_uri) {
        if (base_uri == rdf_parser.UNPROVIDED) {
            base_uri = Sequences.cconcatenate((SubLObject)rdf_parser.$str0$file__, filename);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(filename, rdf_parser.$sym1$FILE_EXISTS_);
        SubLObject v_graph = (SubLObject)rdf_parser.NIL;
        SubLObject stream = (SubLObject)rdf_parser.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)rdf_parser.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)rdf_parser.$kw2$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)rdf_parser.$str3$Unable_to_open__S, filename);
            }
            final SubLObject xml_stream = stream;
            v_graph = parse_rdfXxml_stream(xml_stream, base_uri);
            rdf_graph.rdf_graph_note_file_location(v_graph, filename);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_parser.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rdf_parser.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 1619L)
    public static SubLObject parse_rdfXxml_file_with_detail(final SubLObject filename) {
        assert rdf_parser.NIL != file_utilities.file_existsP(filename) : filename;
        final SubLObject v_graph = parse_rdfXxml_file(filename, (SubLObject)rdf_parser.UNPROVIDED);
        final SubLObject ontology_type_triple = rdf_graph.rdf_graph_find_object_triples(v_graph, rdf_graph.rdf_graph_get_uri(v_graph, owl_utilities.owl_expanded_name((SubLObject)rdf_parser.$str4$Ontology), (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED), rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str5$type), (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED)).first();
        final SubLObject uri_node = (SubLObject)((rdf_parser.NIL != ontology_type_triple) ? rdf_triple.rdf_triple_subject(ontology_type_triple) : rdf_parser.NIL);
        if (rdf_parser.NIL != rdf_uri.rdf_uri_p(uri_node)) {
            rdf_graph.rdf_graph_note_topic(v_graph, uri_node);
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 2331L)
    public static SubLObject parse_rdfXxml_from_url(final SubLObject url, SubLObject base_uri) {
        if (base_uri == rdf_parser.UNPROVIDED) {
            base_uri = url;
        }
        assert rdf_parser.NIL != web_utilities.url_p(url) : url;
        final SubLObject tmp_file = rdf_utilities.download_rdf_url(url, (SubLObject)rdf_parser.UNPROVIDED);
        final SubLObject v_graph = (SubLObject)((rdf_parser.NIL != tmp_file) ? parse_rdfXxml_file(tmp_file, base_uri) : rdf_parser.NIL);
        if (rdf_parser.NIL != v_graph) {
            rdf_graph.rdf_graph_note_topic(v_graph, rdf_uri.get_rdf_uri(url, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED));
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 2625L)
    public static SubLObject parse_rdfXxml_stream(final SubLObject xml_stream, final SubLObject base_uri) {
        return parse_rdfXxml_stream_to_graph(xml_stream, base_uri, rdf_graph.new_rdf_graph());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 2761L)
    public static SubLObject rdfXxml_to_n_triples(final SubLObject input_filename, final SubLObject output_filename, SubLObject base_uri) {
        if (base_uri == rdf_parser.UNPROVIDED) {
            base_uri = Sequences.cconcatenate((SubLObject)rdf_parser.$str0$file__, input_filename);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(input_filename, rdf_parser.$sym1$FILE_EXISTS_);
        SubLObject nt_file = (SubLObject)rdf_parser.NIL;
        SubLObject stream = (SubLObject)rdf_parser.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)rdf_parser.NIL, thread);
                stream = compatibility.open_text(input_filename, (SubLObject)rdf_parser.$kw2$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)rdf_parser.$str3$Unable_to_open__S, input_filename);
            }
            final SubLObject xml_stream = stream;
            nt_file = parse_rdfXxml_stream_to_file(xml_stream, base_uri, output_filename);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_parser.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rdf_parser.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return nt_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 3127L)
    public static SubLObject parse_rdfXxml_stream_to_file(final SubLObject xml_stream, final SubLObject base_uri, final SubLObject output_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)rdf_parser.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)rdf_parser.NIL, thread);
                stream = compatibility.open_text(output_file, (SubLObject)rdf_parser.$kw7$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)rdf_parser.$str3$Unable_to_open__S, output_file);
            }
            final SubLObject output_stream = stream;
            final SubLObject _prev_bind_2 = rdf_parser.$rdf_parser_blank_node_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = rdf_parser.$rdf_parser_blank_node_id_isg$.currentBinding(thread);
            try {
                rdf_parser.$rdf_parser_blank_node_index$.bind(id_index.new_id_index((SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED), thread);
                rdf_parser.$rdf_parser_blank_node_id_isg$.bind(integer_sequence_generator.new_integer_sequence_generator((SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED), thread);
                parse_rdfXxml_stream_internal(xml_stream, base_uri, output_stream);
            }
            finally {
                rdf_parser.$rdf_parser_blank_node_id_isg$.rebind(_prev_bind_3, thread);
                rdf_parser.$rdf_parser_blank_node_index$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_parser.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rdf_parser.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return output_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 3614L)
    public static SubLObject parse_rdfXxml_stream_to_graph(final SubLObject xml_stream, final SubLObject base_uri, final SubLObject v_graph) {
        assert rdf_parser.NIL != rdf_graph.rdf_graph_p(v_graph) : v_graph;
        return parse_rdfXxml_stream_internal(xml_stream, base_uri, v_graph);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 3788L)
    public static SubLObject parse_rdfXxml_stream_internal(final SubLObject xml_stream, final SubLObject base_uri, final SubLObject output_destination) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject token_iterator = xml_parsing_utilities.new_xml_token_iterator(xml_stream, (SubLObject)rdf_parser.T, (SubLObject)rdf_parser.T, (SubLObject)rdf_parser.NIL);
        final SubLObject top_attributes = (SubLObject)ConsesLow.list(reader.bq_cons(owl_to_cycl.xml_name((SubLObject)rdf_parser.$str9$base), base_uri));
        if (rdf_parser.NIL == iteration.iteration_done(token_iterator)) {
            xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
            final SubLObject first_token = iteration.xml_token_iterator_peek(token_iterator);
            final SubLObject parsed_first_token = xml_parsing_utilities.parse_xml_token(first_token);
            final SubLObject attributes = parsed_first_token.rest();
            final SubLObject local_lang = list_utilities.alist_lookup_without_values(attributes, owl_to_cycl.xml_name((SubLObject)rdf_parser.$str10$lang), Symbols.symbol_function((SubLObject)rdf_parser.EQUAL), (SubLObject)rdf_parser.UNPROVIDED);
            final SubLObject _prev_bind_0 = rdf_parser.$rdf_parser_current_lang$.currentBinding(thread);
            final SubLObject _prev_bind_2 = rdf_parser.$rdf_parser_node_ids$.currentBinding(thread);
            try {
                rdf_parser.$rdf_parser_current_lang$.bind((rdf_parser.NIL != local_lang) ? local_lang : rdf_parser.$rdf_parser_current_lang$.getDynamicValue(thread), thread);
                rdf_parser.$rdf_parser_node_ids$.bind(set.new_set(Symbols.symbol_function((SubLObject)rdf_parser.EQUAL), (SubLObject)rdf_parser.UNPROVIDED), thread);
                if (rdf_parser.NIL != rdf_graph.rdf_graph_p(output_destination)) {
                    rdf_graph.rdf_graph_note_namespace_prefixes(output_destination, attributes);
                }
                final SubLObject _prev_bind_0_$1 = utilities_macros.$silent_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$silent_progressP$.bind(Numbers.numL(streams_high.file_length(xml_stream), (SubLObject)rdf_parser.$int11$10000), thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)rdf_parser.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rdf_parser.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rdf_parser.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble((SubLObject)rdf_parser.$str12$Parsing_RDF_XML_stream___);
                        if (rdf_parser.NIL != rdf_token_p(first_token)) {
                            iteration.iteration_next(token_iterator);
                            final SubLObject attribute_lists = (SubLObject)ConsesLow.list(attributes, top_attributes);
                            SubLObject doneP = (SubLObject)rdf_parser.NIL;
                            final SubLObject report_interval = (SubLObject)rdf_parser.$int13$1000;
                            final SubLObject full_report_frequency = (SubLObject)rdf_parser.FIVE_INTEGER;
                            SubLObject report_count = (SubLObject)rdf_parser.ZERO_INTEGER;
                            while (rdf_parser.NIL == doneP) {
                                thread.resetMultipleValues();
                                final SubLObject doneP_$3 = parse_next_rdfXxml_element(token_iterator, output_destination, attribute_lists, report_interval, full_report_frequency, report_count);
                                final SubLObject report_count_$4 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                doneP = doneP_$3;
                                report_count = report_count_$4;
                            }
                        }
                        else {
                            final SubLObject sexpr = xml_parsing_utilities.xml_token_iterator_to_sexpr(token_iterator, (SubLObject)rdf_parser.UNPROVIDED);
                            parse_rdfXxml_node_element(sexpr, output_destination, (SubLObject)ConsesLow.list(attributes, top_attributes));
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_parser.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1_$2, thread);
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                rdf_parser.$rdf_parser_node_ids$.rebind(_prev_bind_2, thread);
                rdf_parser.$rdf_parser_current_lang$.rebind(_prev_bind_0, thread);
            }
        }
        return output_destination;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 5454L)
    public static SubLObject parse_next_rdfXxml_element(final SubLObject token_iterator, final SubLObject graph_or_stream, final SubLObject attribute_lists, final SubLObject report_interval, final SubLObject full_report_frequency, SubLObject report_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = iteration.iteration_done(token_iterator);
        if (rdf_parser.NIL == doneP) {
            xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
            if (rdf_parser.NIL != rdf_token_p(iteration.xml_token_iterator_peek(token_iterator)) && rdf_parser.NIL != xml_parsing_utilities.xml_closing_tag_p(iteration.xml_token_iterator_peek(token_iterator))) {
                doneP = (SubLObject)rdf_parser.T;
            }
            else {
                final SubLObject dtr = xml_parsing_utilities.xml_token_iterator_to_sexpr(token_iterator, (SubLObject)rdf_parser.UNPROVIDED);
                parse_rdfXxml_node_element(dtr, graph_or_stream, attribute_lists);
            }
            thread.resetMultipleValues();
            final SubLObject done = xml_parsing_utilities.xml_token_iterator_progress(token_iterator);
            final SubLObject total = thread.secondMultipleValue();
            thread.resetMultipleValues();
            utilities_macros.note_percent_progress(done, total);
            final SubLObject target = Numbers.multiply(report_interval, number_utilities.f_1X(report_count));
            if (set.set_size(rdf_parser.$rdf_parser_node_ids$.getDynamicValue(thread)).numGE(target)) {
                report_count = Numbers.add(report_count, (SubLObject)rdf_parser.ONE_INTEGER);
                if (Numbers.mod(report_count, full_report_frequency).isZero()) {
                    print_high.princ(target, (SubLObject)rdf_parser.UNPROVIDED);
                }
                else {
                    print_high.princ((SubLObject)rdf_parser.$str14$_, (SubLObject)rdf_parser.UNPROVIDED);
                }
                streams_high.force_output((SubLObject)rdf_parser.UNPROVIDED);
            }
        }
        return Values.values(doneP, report_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 6461L)
    public static SubLObject clear_rdf_parser_caches() {
        clear_resolve_rdfXxml_uri_internal();
        clear_expand_rdf_xml_uri_namespace_prefix();
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 6603L)
    public static SubLObject parse_rdfXxml_node_element(final SubLObject sexpr, final SubLObject graph_or_stream, final SubLObject attribute_lists) {
        final SubLObject sexpr_type = xml_parsing_utilities.xml_sexpr_type(sexpr);
        final SubLObject subject = resolve_rdfXxml_subject(sexpr, graph_or_stream, attribute_lists);
        parse_rdfXxml_node_element_internal(subject, graph_or_stream, sexpr_type, xml_parsing_utilities.xml_sexpr_attributes(sexpr), xml_parsing_utilities.xml_sexpr_daughters(sexpr, (SubLObject)rdf_parser.UNPROVIDED), attribute_lists);
        return subject;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 7281L)
    public static SubLObject parse_rdfXxml_node_element_internal(final SubLObject subject, final SubLObject graph_or_stream, final SubLObject sexpr_type, final SubLObject local_attributes, final SubLObject daughters, final SubLObject attribute_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_lang = list_utilities.alist_lookup(local_attributes, owl_to_cycl.xml_name((SubLObject)rdf_parser.$str10$lang), Symbols.symbol_function((SubLObject)rdf_parser.EQUAL), (SubLObject)rdf_parser.UNPROVIDED);
        final SubLObject uri = resolve_rdfXxml_uri(sexpr_type, attribute_lists, (SubLObject)rdf_parser.UNPROVIDED);
        enforceType(uri, rdf_parser.$sym15$VALID_NODE_ELEMENT_RDF_URI_P);
        if (rdf_parser.NIL != list_utilities.alist_lookup(local_attributes, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str16$li), Symbols.symbol_function((SubLObject)rdf_parser.EQUAL), (SubLObject)rdf_parser.UNPROVIDED)) {
            Errors.error((SubLObject)rdf_parser.$str17$rdf_li_is_not_allowed_as_as_an_at);
        }
        if (rdf_parser.NIL == rdf_description_typeP(uri)) {
            note_parsed_triple(graph_or_stream, subject, rdf_type_uri(graph_or_stream), uri);
        }
        if (rdf_parser.NIL != rdf_graph.rdf_graph_p(graph_or_stream) && rdf_parser.NIL == rdf_parser.$rdf_parser_recursedP$.getDynamicValue(thread)) {
            rdf_graph.rdf_graph_note_focal_node(graph_or_stream, rdf_graph.canonicalize_rdf_triple_argument(subject, graph_or_stream));
        }
        final SubLObject _prev_bind_0 = rdf_parser.$rdf_parser_current_lang$.currentBinding(thread);
        final SubLObject _prev_bind_2 = rdf_parser.$rdf_parser_next_list_item_number$.currentBinding(thread);
        final SubLObject _prev_bind_3 = rdf_parser.$rdf_parser_recursedP$.currentBinding(thread);
        try {
            rdf_parser.$rdf_parser_current_lang$.bind((rdf_parser.NIL != local_lang) ? local_lang : rdf_parser.$rdf_parser_current_lang$.getDynamicValue(thread), thread);
            rdf_parser.$rdf_parser_next_list_item_number$.bind((SubLObject)rdf_parser.ONE_INTEGER, thread);
            rdf_parser.$rdf_parser_recursedP$.bind((SubLObject)rdf_parser.T, thread);
            parse_rdfXxml_property_attributes(subject, graph_or_stream, local_attributes, attribute_lists);
            SubLObject cdolist_list_var = daughters;
            SubLObject dtr = (SubLObject)rdf_parser.NIL;
            dtr = cdolist_list_var.first();
            while (rdf_parser.NIL != cdolist_list_var) {
                parse_rdfXxml_property_element(subject, dtr, graph_or_stream, (SubLObject)ConsesLow.cons(local_attributes, attribute_lists));
                cdolist_list_var = cdolist_list_var.rest();
                dtr = cdolist_list_var.first();
            }
        }
        finally {
            rdf_parser.$rdf_parser_recursedP$.rebind(_prev_bind_3, thread);
            rdf_parser.$rdf_parser_next_list_item_number$.rebind(_prev_bind_2, thread);
            rdf_parser.$rdf_parser_current_lang$.rebind(_prev_bind_0, thread);
        }
        return subject;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 8497L)
    public static SubLObject rdf_description_typeP(final SubLObject uri) {
        return rdf_uri.rdf_namespace_uri_with_local_partP(uri, (SubLObject)rdf_parser.$str18$Description);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 8606L)
    public static SubLObject parse_rdfXxml_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sexpr_type = xml_parsing_utilities.xml_sexpr_type(property_sexpr);
        final SubLObject local_lang = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, owl_to_cycl.xml_name((SubLObject)rdf_parser.$str10$lang));
        final SubLObject _prev_bind_0 = rdf_parser.$rdf_parser_current_lang$.currentBinding(thread);
        try {
            rdf_parser.$rdf_parser_current_lang$.bind((rdf_parser.NIL != local_lang) ? local_lang : rdf_parser.$rdf_parser_current_lang$.getDynamicValue(thread), thread);
            SubLObject uri = resolve_rdfXxml_uri(sexpr_type, (SubLObject)ConsesLow.cons(xml_parsing_utilities.xml_sexpr_attributes(property_sexpr), attribute_lists), (SubLObject)rdf_parser.UNPROVIDED);
            if (rdf_parser.NIL != rdf_uri.rdf_namespace_uri_with_local_partP(uri, (SubLObject)rdf_parser.$str16$li)) {
                uri = rdf_parser_get_rdf_namespace_uri(v_graph, Sequences.cconcatenate((SubLObject)rdf_parser.$str19$_, format_nil.format_nil_d_no_copy(rdf_parser.$rdf_parser_next_list_item_number$.getDynamicValue(thread))));
                rdf_parser.$rdf_parser_next_list_item_number$.setDynamicValue(Numbers.add(rdf_parser.$rdf_parser_next_list_item_number$.getDynamicValue(thread), (SubLObject)rdf_parser.ONE_INTEGER), thread);
            }
            if (rdf_parser.NIL != xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str20$resource)) && rdf_parser.NIL != literal_parse_type_sexprP(property_sexpr)) {
                Errors.error((SubLObject)rdf_parser.$str21$This_is_not_legal_RDF__specifying);
            }
            final SubLObject valid_property_elementP = valid_property_element_rdf_uri_p(uri);
            if (rdf_parser.NIL != valid_property_elementP && rdf_parser.NIL != literal_parse_type_sexprP(property_sexpr)) {
                parse_rdfXxml_parse_type_literal_property_element(parent_node, property_sexpr, uri, v_graph, attribute_lists);
            }
            else if (rdf_parser.NIL != valid_property_elementP && rdf_parser.NIL != list_utilities.empty_list_p(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, (SubLObject)rdf_parser.UNPROVIDED))) {
                parse_rdfXxml_empty_property_element(parent_node, property_sexpr, uri, v_graph, attribute_lists);
            }
            else if (rdf_parser.NIL != valid_property_elementP && rdf_parser.$str22$Resource.equal(xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str23$parseType)))) {
                parse_rdfXxml_resource_property_element(parent_node, property_sexpr, uri, v_graph, attribute_lists);
            }
            else if (rdf_parser.NIL != valid_property_elementP && rdf_parser.$str24$Collection.equal(xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str23$parseType)))) {
                parse_rdfXxml_collection_property_element(parent_node, property_sexpr, uri, v_graph, attribute_lists);
            }
            else if (rdf_parser.NIL != valid_property_elementP && rdf_parser.NIL != xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str23$parseType))) {
                Errors.error((SubLObject)rdf_parser.$str25$parseTypeOtherPropertyElt_not_yet);
            }
            else if (rdf_parser.NIL != valid_property_elementP && rdf_parser.NIL != list_utilities.singletonP(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, (SubLObject)rdf_parser.UNPROVIDED)) && list_utilities.only_one(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, (SubLObject)rdf_parser.UNPROVIDED)).isList()) {
                final SubLObject v_object = parse_rdfXxml_node_element(list_utilities.only_one(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, (SubLObject)rdf_parser.UNPROVIDED)), v_graph, attribute_lists);
                final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str26$ID));
                final SubLObject predicate_uri = (rdf_parser.NIL != id) ? resolve_rdf_id(id, attribute_lists) : uri;
                note_parsed_triple(v_graph, parent_node, predicate_uri, v_object);
            }
            else if (rdf_parser.NIL != valid_property_elementP && rdf_parser.NIL != list_utilities.singletonP(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, (SubLObject)rdf_parser.UNPROVIDED)) && list_utilities.only_one(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, (SubLObject)rdf_parser.UNPROVIDED)).isString()) {
                parse_rdfXxml_literal_property_element(parent_node, property_sexpr, uri, v_graph, attribute_lists);
            }
            else {
                SubLObject xml = (SubLObject)rdf_parser.NIL;
                SubLObject stream = (SubLObject)rdf_parser.NIL;
                try {
                    stream = streams_high.make_private_string_output_stream();
                    final SubLObject _prev_bind_0_$6 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(stream, thread);
                        xml_utilities.xml_sexpr_output_as_xml(property_sexpr);
                    }
                    finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0_$6, thread);
                    }
                    xml = streams_high.get_output_stream_string(stream);
                }
                finally {
                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_parser.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        streams_high.close(stream, (SubLObject)rdf_parser.UNPROVIDED);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
                Errors.error((SubLObject)rdf_parser.$str27$Can_t_handle_property_element___A, xml);
            }
        }
        finally {
            rdf_parser.$rdf_parser_current_lang$.rebind(_prev_bind_0, thread);
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 11803L)
    public static SubLObject parse_rdfXxml_parse_type_literal_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject uri, final SubLObject v_graph, final SubLObject attribute_lists) {
        if (rdf_parser.NIL != Sequences.find_if((SubLObject)rdf_parser.$sym28$VALID_PROPERTY_ATTRIBUTE_RDF_URI_P, resolve_rdfXxml_uris(list_utilities.alist_keys(xml_parsing_utilities.xml_sexpr_attributes(property_sexpr)), attribute_lists), (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED)) {
            Errors.error((SubLObject)rdf_parser.$str29$rdf_parseType__Literal__is_forbid);
        }
        final SubLObject v_object = rdf_literal_value(v_graph, xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, (SubLObject)rdf_parser.UNPROVIDED), attribute_lists);
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str26$ID));
        final SubLObject predicate_uri = (rdf_parser.NIL != id) ? resolve_rdf_id(id, attribute_lists) : uri;
        note_parsed_triple(v_graph, parent_node, predicate_uri, v_object);
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 12504L)
    public static SubLObject parse_rdfXxml_literal_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject uri, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject object_lexical_form = list_utilities.only_one(xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, (SubLObject)rdf_parser.UNPROVIDED));
        final SubLObject datatype_uri = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str30$datatype));
        final SubLObject datatype = (SubLObject)((rdf_parser.NIL != datatype_uri) ? datatype_uri : rdf_parser.NIL);
        final SubLObject language = (SubLObject)((rdf_parser.NIL != datatype) ? rdf_parser.NIL : rdf_parser.$rdf_parser_current_lang$.getDynamicValue(thread));
        final SubLObject v_object = rdf_parser_get_literal(v_graph, object_lexical_form, language, datatype);
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str26$ID));
        note_parsed_triple(v_graph, parent_node, uri, v_object);
        if (rdf_parser.NIL != id) {
            reify_rdf_triple(v_graph, resolve_rdf_id(id, attribute_lists), parent_node, uri, v_object);
        }
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 13354L)
    public static SubLObject parse_rdfXxml_resource_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject uri, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLObject blank_node = rdf_parser_get_new_blank_node(v_graph);
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str26$ID));
        final SubLObject predicate_uri = (rdf_parser.NIL != id) ? resolve_rdf_id(id, attribute_lists) : uri;
        note_parsed_triple(v_graph, parent_node, predicate_uri, blank_node);
        if (rdf_parser.NIL == xml_parsing_utilities.xml_sexpr_atomic_p(property_sexpr)) {
            parse_rdfXxml_node_element_internal(blank_node, v_graph, rdf_parser_get_rdf_namespace_uri(v_graph, (SubLObject)rdf_parser.$str18$Description), xml_parsing_utilities.xml_sexpr_attributes(property_sexpr), xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, (SubLObject)rdf_parser.UNPROVIDED), attribute_lists);
        }
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 14057L)
    public static SubLObject parse_rdfXxml_empty_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject uri, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject attributes = xml_parsing_utilities.xml_sexpr_attributes(property_sexpr);
        SubLObject v_object = (SubLObject)rdf_parser.NIL;
        if (rdf_parser.NIL == Sequences.remove(rdf_utilities.rdf_name((SubLObject)rdf_parser.$str26$ID), list_utilities.alist_keys(attributes), Symbols.symbol_function((SubLObject)rdf_parser.EQUAL), (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED)) {
            final SubLObject object_lexical_form = (SubLObject)rdf_parser.$str31$;
            v_object = rdf_parser_get_literal(v_graph, object_lexical_form, rdf_parser.$rdf_parser_current_lang$.getDynamicValue(thread), (SubLObject)rdf_parser.UNPROVIDED);
        }
        else {
            v_object = resolve_rdfXxml_object_from_empty_property_element(property_sexpr, v_graph, attribute_lists);
            final SubLObject added_somethingP = parse_rdfXxml_property_attributes(v_object, v_graph, attributes, attribute_lists);
            if (rdf_parser.NIL != added_somethingP && rdf_parser.NIL != literal_parse_type_sexprP(property_sexpr)) {
                Errors.error((SubLObject)rdf_parser.$str29$rdf_parseType__Literal__is_forbid);
            }
        }
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str26$ID));
        note_parsed_triple(v_graph, parent_node, uri, v_object);
        if (rdf_parser.NIL != id) {
            reify_rdf_triple(v_graph, resolve_rdf_id(id, attribute_lists), parent_node, uri, v_object);
        }
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 15229L)
    public static SubLObject reify_rdf_triple(final SubLObject v_graph, final SubLObject id, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        note_parsed_triple(v_graph, id, rdf_parser_get_rdf_namespace_uri(v_graph, (SubLObject)rdf_parser.$str5$type), rdf_parser_get_rdf_namespace_uri(v_graph, (SubLObject)rdf_parser.$str32$Statement));
        note_parsed_triple(v_graph, id, rdf_parser_get_rdf_namespace_uri(v_graph, (SubLObject)rdf_parser.$str33$subject), subject);
        note_parsed_triple(v_graph, id, rdf_parser_get_rdf_namespace_uri(v_graph, (SubLObject)rdf_parser.$str34$predicate), predicate);
        note_parsed_triple(v_graph, id, rdf_parser_get_rdf_namespace_uri(v_graph, (SubLObject)rdf_parser.$str35$object), v_object);
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 15724L)
    public static SubLObject parse_rdfXxml_collection_property_element(final SubLObject parent_node, final SubLObject property_sexpr, final SubLObject uri, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(property_sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str26$ID));
        final SubLObject predicate_uri = (rdf_parser.NIL != id) ? resolve_rdf_id(id, attribute_lists) : uri;
        if (rdf_parser.NIL != xml_parsing_utilities.xml_sexpr_atomic_p(property_sexpr)) {
            note_parsed_triple(v_graph, parent_node, predicate_uri, rdf_parser_get_rdf_namespace_uri(v_graph, (SubLObject)rdf_parser.$str36$nil));
        }
        else {
            SubLObject previous_blank_node = (SubLObject)rdf_parser.NIL;
            SubLObject cdolist_list_var = xml_parsing_utilities.xml_sexpr_daughters(property_sexpr, (SubLObject)rdf_parser.UNPROVIDED);
            SubLObject node_element_sexpr = (SubLObject)rdf_parser.NIL;
            node_element_sexpr = cdolist_list_var.first();
            while (rdf_parser.NIL != cdolist_list_var) {
                final SubLObject blank_node = rdf_parser_get_new_blank_node(v_graph);
                if (rdf_parser.NIL == previous_blank_node) {
                    note_parsed_triple(v_graph, parent_node, predicate_uri, blank_node);
                }
                else {
                    note_parsed_triple(v_graph, previous_blank_node, rdf_parser_get_rdf_namespace_uri(v_graph, (SubLObject)rdf_parser.$str37$rest), blank_node);
                }
                note_parsed_triple(v_graph, blank_node, rdf_parser_get_rdf_namespace_uri(v_graph, (SubLObject)rdf_parser.$str38$first), parse_rdfXxml_node_element(node_element_sexpr, v_graph, attribute_lists));
                previous_blank_node = blank_node;
                cdolist_list_var = cdolist_list_var.rest();
                node_element_sexpr = cdolist_list_var.first();
            }
            note_parsed_triple(v_graph, previous_blank_node, rdf_parser_get_rdf_namespace_uri(v_graph, (SubLObject)rdf_parser.$str37$rest), rdf_parser_get_rdf_namespace_uri(v_graph, (SubLObject)rdf_parser.$str36$nil));
        }
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 17039L)
    public static SubLObject literal_parse_type_sexprP(final SubLObject sexpr) {
        return Equality.equal((SubLObject)rdf_parser.$str39$Literal, xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str23$parseType)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 17174L)
    public static SubLObject parse_rdfXxml_property_attributes(final SubLObject subject, final SubLObject v_graph, final SubLObject attributes, final SubLObject attribute_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject added_somethingP = (SubLObject)rdf_parser.NIL;
        SubLObject cdolist_list_var = attributes;
        SubLObject cons = (SubLObject)rdf_parser.NIL;
        cons = cdolist_list_var.first();
        while (rdf_parser.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject attribute = (SubLObject)rdf_parser.NIL;
            SubLObject value = (SubLObject)rdf_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rdf_parser.$list40);
            attribute = current.first();
            current = (value = current.rest());
            if (rdf_parser.NIL == string_utilities.starts_with(attribute, (SubLObject)rdf_parser.$str41$xml)) {
                if (rdf_parser.NIL != rdfXxml_old_term_rdf_uri_p(resolve_rdfXxml_uri(attribute, attribute_lists, (SubLObject)rdf_parser.UNPROVIDED))) {
                    Errors.error((SubLObject)rdf_parser.$str42$_S_has_been_removed_from_the_RDF_, attribute);
                }
                else if (attribute.equal(rdf_utilities.rdf_name((SubLObject)rdf_parser.$str5$type))) {
                    final SubLObject type_uri = resolve_rdfXxml_uri(value, attribute_lists, (SubLObject)rdf_parser.UNPROVIDED);
                    note_parsed_triple(v_graph, subject, rdf_type_uri(v_graph), type_uri);
                }
                else if (rdf_parser.NIL != valid_property_attribute_rdf_uri_p(resolve_rdfXxml_uri(attribute, attribute_lists, (SubLObject)rdf_parser.UNPROVIDED))) {
                    final SubLObject predicate_uri = resolve_rdfXxml_uri(attribute, attribute_lists, (SubLObject)rdf_parser.UNPROVIDED);
                    final SubLObject v_object = rdf_parser_get_literal(v_graph, value, rdf_parser.$rdf_parser_current_lang$.getDynamicValue(thread), (SubLObject)rdf_parser.UNPROVIDED);
                    note_parsed_triple(v_graph, subject, predicate_uri, v_object);
                    added_somethingP = (SubLObject)rdf_parser.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return added_somethingP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 18118L)
    public static SubLObject rdf_literal_value(final SubLObject v_graph, final SubLObject xml_sexprs, final SubLObject attribute_lists) {
        final SubLObject xml_string = rdf_utilities.exclusive_canonical_xml_from_sexprs(xml_sexprs, attribute_lists);
        return rdf_parser_get_literal(v_graph, xml_string, (SubLObject)rdf_parser.NIL, rdf_xml_literal_uri());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 18455L)
    public static SubLObject resolve_rdfXxml_uris(final SubLObject uris, final SubLObject attribute_lists) {
        SubLObject resolved = (SubLObject)rdf_parser.NIL;
        SubLObject cdolist_list_var = uris;
        SubLObject uri = (SubLObject)rdf_parser.NIL;
        uri = cdolist_list_var.first();
        while (rdf_parser.NIL != cdolist_list_var) {
            resolved = (SubLObject)ConsesLow.cons(resolve_rdfXxml_uri(uri, attribute_lists, (SubLObject)rdf_parser.UNPROVIDED), resolved);
            cdolist_list_var = cdolist_list_var.rest();
            uri = cdolist_list_var.first();
        }
        return Sequences.nreverse(resolved);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 18662L)
    public static SubLObject resolve_rdfXxml_uri(final SubLObject uri, final SubLObject attribute_lists, SubLObject use_baseP) {
        if (use_baseP == rdf_parser.UNPROVIDED) {
            use_baseP = (SubLObject)rdf_parser.NIL;
        }
        if (rdf_parser.NIL != rdf_uri.rdf_uri_p(uri)) {
            return uri;
        }
        SubLObject resolved = (SubLObject)rdf_parser.NIL;
        if (rdf_parser.NIL == resolved) {
            SubLObject csome_list_var;
            SubLObject attributes;
            for (csome_list_var = attribute_lists, attributes = (SubLObject)rdf_parser.NIL, attributes = csome_list_var.first(); rdf_parser.NIL == resolved && rdf_parser.NIL != csome_list_var; resolved = resolve_rdfXxml_uri_internal(uri, attributes, use_baseP), csome_list_var = csome_list_var.rest(), attributes = csome_list_var.first()) {}
        }
        return (rdf_parser.NIL != resolved) ? resolved : uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 18967L)
    public static SubLObject clear_resolve_rdfXxml_uri_internal() {
        final SubLObject cs = rdf_parser.$resolve_rdfXxml_uri_internal_caching_state$.getGlobalValue();
        if (rdf_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 18967L)
    public static SubLObject remove_resolve_rdfXxml_uri_internal(final SubLObject uri, final SubLObject rdf_attributes, SubLObject use_baseP) {
        if (use_baseP == rdf_parser.UNPROVIDED) {
            use_baseP = (SubLObject)rdf_parser.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(rdf_parser.$resolve_rdfXxml_uri_internal_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(uri, rdf_attributes, use_baseP), (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 18967L)
    public static SubLObject resolve_rdfXxml_uri_internal_internal(final SubLObject uri, final SubLObject rdf_attributes, final SubLObject use_baseP) {
        final SubLObject colon_pos = Sequences.position((SubLObject)Characters.CHAR_colon, uri, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED);
        if (rdf_parser.NIL != subl_promotions.positive_integer_p(colon_pos) && rdf_parser.NIL != list_utilities.lengthG(uri, number_utilities.f_1X(colon_pos), (SubLObject)rdf_parser.UNPROVIDED)) {
            final SubLObject prefix = string_utilities.substring(uri, (SubLObject)rdf_parser.ZERO_INTEGER, colon_pos);
            final SubLObject prefix_expansion = expand_rdf_xml_uri_namespace_prefix(prefix, rdf_attributes);
            final SubLObject relative_uri = string_utilities.substring(uri, number_utilities.f_1X(colon_pos), (SubLObject)rdf_parser.UNPROVIDED);
            return (SubLObject)((rdf_parser.NIL != prefix_expansion) ? rdf_uri.new_rdf_uri_from_two_parts(prefix_expansion, relative_uri) : rdf_parser.NIL);
        }
        if (rdf_parser.NIL == use_baseP) {
            final SubLObject default_namespace = list_utilities.alist_lookup(rdf_attributes, (SubLObject)rdf_parser.$str44$xmlns, Symbols.symbol_function((SubLObject)rdf_parser.EQUAL), (SubLObject)rdf_parser.UNPROVIDED);
            return (SubLObject)((rdf_parser.NIL != default_namespace) ? rdf_uri.resolve_rdf_uri(default_namespace, uri) : rdf_parser.NIL);
        }
        final SubLObject base_uri = possibly_remove_uri_fragment(list_utilities.alist_lookup(rdf_attributes, owl_to_cycl.xml_name((SubLObject)rdf_parser.$str9$base), Symbols.symbol_function((SubLObject)rdf_parser.EQUAL), (SubLObject)rdf_parser.UNPROVIDED));
        if (rdf_parser.NIL != base_uri) {
            return rdf_uri.resolve_rdf_uri(base_uri, uri);
        }
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 18967L)
    public static SubLObject resolve_rdfXxml_uri_internal(final SubLObject uri, final SubLObject rdf_attributes, SubLObject use_baseP) {
        if (use_baseP == rdf_parser.UNPROVIDED) {
            use_baseP = (SubLObject)rdf_parser.NIL;
        }
        SubLObject caching_state = rdf_parser.$resolve_rdfXxml_uri_internal_caching_state$.getGlobalValue();
        if (rdf_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_parser.$sym43$RESOLVE_RDF_XML_URI_INTERNAL, (SubLObject)rdf_parser.$sym45$_RESOLVE_RDF_XML_URI_INTERNAL_CACHING_STATE_, (SubLObject)rdf_parser.NIL, (SubLObject)rdf_parser.EQUAL, (SubLObject)rdf_parser.THREE_INTEGER, (SubLObject)rdf_parser.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(uri, rdf_attributes, use_baseP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rdf_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rdf_parser.NIL;
            collision = cdolist_list_var.first();
            while (rdf_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (uri.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rdf_attributes.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rdf_parser.NIL != cached_args && rdf_parser.NIL == cached_args.rest() && use_baseP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(resolve_rdfXxml_uri_internal_internal(uri, rdf_attributes, use_baseP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(uri, rdf_attributes, use_baseP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 19978L)
    public static SubLObject possibly_remove_uri_fragment(final SubLObject uri) {
        SubLObject ans = uri;
        if (uri.isString()) {
            final SubLObject frag_start = Sequences.position((SubLObject)Characters.CHAR_hash, uri, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED);
            if (rdf_parser.NIL != frag_start) {
                ans = string_utilities.substring(uri, (SubLObject)rdf_parser.ZERO_INTEGER, frag_start);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 20200L)
    public static SubLObject clear_expand_rdf_xml_uri_namespace_prefix() {
        final SubLObject cs = rdf_parser.$expand_rdf_xml_uri_namespace_prefix_caching_state$.getGlobalValue();
        if (rdf_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 20200L)
    public static SubLObject remove_expand_rdf_xml_uri_namespace_prefix(final SubLObject prefix, final SubLObject rdf_attributes) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_parser.$expand_rdf_xml_uri_namespace_prefix_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(prefix, rdf_attributes), (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 20200L)
    public static SubLObject expand_rdf_xml_uri_namespace_prefix_internal(final SubLObject prefix, final SubLObject rdf_attributes) {
        return list_utilities.alist_lookup(rdf_attributes, Sequences.cconcatenate((SubLObject)rdf_parser.$str47$xmlns_, prefix), Symbols.symbol_function((SubLObject)rdf_parser.EQUAL), (SubLObject)rdf_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 20200L)
    public static SubLObject expand_rdf_xml_uri_namespace_prefix(final SubLObject prefix, final SubLObject rdf_attributes) {
        SubLObject caching_state = rdf_parser.$expand_rdf_xml_uri_namespace_prefix_caching_state$.getGlobalValue();
        if (rdf_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_parser.$sym46$EXPAND_RDF_XML_URI_NAMESPACE_PREFIX, (SubLObject)rdf_parser.$sym48$_EXPAND_RDF_XML_URI_NAMESPACE_PREFIX_CACHING_STATE_, (SubLObject)rdf_parser.NIL, (SubLObject)rdf_parser.EQUAL, (SubLObject)rdf_parser.TWO_INTEGER, (SubLObject)rdf_parser.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(prefix, rdf_attributes);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rdf_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rdf_parser.NIL;
            collision = cdolist_list_var.first();
            while (rdf_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (prefix.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rdf_parser.NIL != cached_args && rdf_parser.NIL == cached_args.rest() && rdf_attributes.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(expand_rdf_xml_uri_namespace_prefix_internal(prefix, rdf_attributes)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(prefix, rdf_attributes));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 20397L)
    public static SubLObject valid_node_element_rdf_uri_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_parser.NIL != rdf_uri.rdf_uri_p(v_object) && rdf_parser.NIL == rdf_uri.rdf_namespace_uri_with_local_partP(v_object, (SubLObject)rdf_parser.$str16$li) && rdf_parser.NIL == rdfXxml_core_syntax_rdf_uri_p(v_object) && rdf_parser.NIL == rdfXxml_old_term_rdf_uri_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 20650L)
    public static SubLObject valid_property_attribute_rdf_uri_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_parser.NIL != rdf_uri.rdf_uri_p(v_object) && rdf_parser.NIL == rdf_uri.rdf_namespace_uri_with_local_partP(v_object, (SubLObject)rdf_parser.$str16$li) && rdf_parser.NIL == rdf_description_typeP(v_object) && rdf_parser.NIL == rdfXxml_core_syntax_rdf_uri_p(v_object) && rdf_parser.NIL == rdfXxml_old_term_rdf_uri_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 20953L)
    public static SubLObject valid_property_element_rdf_uri_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_parser.NIL != rdf_uri.rdf_uri_p(v_object) && rdf_parser.NIL == rdf_description_typeP(v_object) && rdf_parser.NIL == rdfXxml_core_syntax_rdf_uri_p(v_object) && rdf_parser.NIL == rdfXxml_old_term_rdf_uri_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 21192L)
    public static SubLObject rdfXxml_core_syntax_uris() {
        if (rdf_parser.$rdfXxml_core_syntax_uris$.getGlobalValue() == rdf_parser.$kw49$UNINITIALIZED) {
            final SubLObject init_value = list_utilities.list2vector((SubLObject)ConsesLow.list(rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str50$RDF), rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str26$ID), rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str51$about), rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str23$parseType), rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str20$resource), rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str52$nodeID), rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str30$datatype)));
            if (init_value == rdf_parser.$kw49$UNINITIALIZED) {
                Errors.error((SubLObject)rdf_parser.$str53$Unable_to_initialize__A__, rdf_parser.$rdfXxml_core_syntax_uris$.getGlobalValue());
            }
            rdf_parser.$rdfXxml_core_syntax_uris$.setGlobalValue(init_value);
        }
        return rdf_parser.$rdfXxml_core_syntax_uris$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 21528L)
    public static SubLObject rdfXxml_core_syntax_rdf_uri_p(final SubLObject v_object) {
        return Sequences.find(v_object, rdfXxml_core_syntax_uris(), Symbols.symbol_function((SubLObject)rdf_parser.$sym54$RDF_URI_MATCHES_), (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 21653L)
    public static SubLObject rdfXxml_old_term_uris() {
        if (rdf_parser.$rdfXxml_old_term_uris$.getGlobalValue() == rdf_parser.$kw49$UNINITIALIZED) {
            final SubLObject init_value = list_utilities.list2vector((SubLObject)ConsesLow.list(rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str55$aboutEach), rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str56$aboutEachPrefix), rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str57$bagID)));
            if (init_value == rdf_parser.$kw49$UNINITIALIZED) {
                Errors.error((SubLObject)rdf_parser.$str53$Unable_to_initialize__A__, rdf_parser.$rdfXxml_old_term_uris$.getGlobalValue());
            }
            rdf_parser.$rdfXxml_old_term_uris$.setGlobalValue(init_value);
        }
        return rdf_parser.$rdfXxml_old_term_uris$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 21866L)
    public static SubLObject rdfXxml_old_term_rdf_uri_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_parser.NIL != rdf_uri.rdf_uri_p(v_object) && rdf_parser.NIL != Sequences.find(v_object, rdfXxml_old_term_uris(), Symbols.symbol_function((SubLObject)rdf_parser.$sym54$RDF_URI_MATCHES_), (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 22017L)
    public static SubLObject rdf_xml_literal_uri() {
        return rdf_utilities.rdf_expanded_name((SubLObject)rdf_parser.$str58$XMLLiteral);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 22099L)
    public static SubLObject rdf_type_uri(final SubLObject graph_or_stream) {
        return rdf_parser_get_rdf_namespace_uri(graph_or_stream, (SubLObject)rdf_parser.$str5$type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 22214L)
    public static SubLObject resolve_rdfXxml_subject(final SubLObject sexpr, final SubLObject graph_or_stream, final SubLObject attribute_lists) {
        final SubLObject id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str26$ID));
        final SubLObject about = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str51$about));
        final SubLObject resource = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str20$resource));
        final SubLObject node_id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str52$nodeID));
        SubLObject subject = (SubLObject)rdf_parser.NIL;
        if (rdf_parser.NIL != id) {
            if (rdf_parser.NIL != node_id) {
                Errors.error((SubLObject)rdf_parser.$str59$Cannot_have_rdf_nodeID_and_rdf_ID);
            }
            if (rdf_parser.NIL != about) {
                Errors.error((SubLObject)rdf_parser.$str60$Cannot_have_rdf_about_and_rdf_ID_);
            }
            final SubLObject subject_uri = resolve_rdf_id(id, (SubLObject)ConsesLow.cons(xml_parsing_utilities.xml_sexpr_attributes(sexpr), attribute_lists));
            verify_rdf_id_is_new(subject_uri);
            subject = subject_uri;
        }
        else if (rdf_parser.NIL != node_id) {
            if (rdf_parser.NIL != id) {
                Errors.error((SubLObject)rdf_parser.$str59$Cannot_have_rdf_nodeID_and_rdf_ID);
            }
            if (rdf_parser.NIL != about) {
                Errors.error((SubLObject)rdf_parser.$str61$Cannot_have_rdf_nodeID_and_rdf_ab);
            }
            if (rdf_parser.NIL != resource) {
                Errors.error((SubLObject)rdf_parser.$str62$Cannot_have_rdf_nodeID_and_rdf_re);
            }
            enforceType(node_id, rdf_parser.$sym63$VALID_XML_NAMESPACES_NAME_P);
            subject = rdf_parser_get_blank_node(graph_or_stream, node_id);
        }
        else if (rdf_parser.NIL != xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str51$about))) {
            if (rdf_parser.NIL != node_id) {
                Errors.error((SubLObject)rdf_parser.$str61$Cannot_have_rdf_nodeID_and_rdf_ab);
            }
            if (rdf_parser.NIL != id) {
                Errors.error((SubLObject)rdf_parser.$str60$Cannot_have_rdf_about_and_rdf_ID_);
            }
            final SubLObject subject_uri = subject = resolve_rdfXxml_uri(xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str51$about)), attribute_lists, (SubLObject)rdf_parser.T);
        }
        else {
            subject = rdf_parser_get_new_blank_node(graph_or_stream);
        }
        return subject;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 23712L)
    public static SubLObject verify_rdf_id_is_new(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject newP = set.set_add(id, rdf_parser.$rdf_parser_node_ids$.getDynamicValue(thread));
        if (rdf_parser.NIL == newP) {
            Errors.error((SubLObject)rdf_parser.$str64$Name_clash__Graph_already_has_nod, id);
        }
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 23896L)
    public static SubLObject resolve_rdfXxml_object_from_empty_property_element(final SubLObject sexpr, final SubLObject v_graph, final SubLObject attribute_lists) {
        final SubLObject resource = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str20$resource));
        final SubLObject node_id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str52$nodeID));
        SubLObject subject = (SubLObject)rdf_parser.NIL;
        if (rdf_parser.NIL != resource) {
            if (rdf_parser.NIL != node_id) {
                Errors.error((SubLObject)rdf_parser.$str62$Cannot_have_rdf_nodeID_and_rdf_re);
            }
            subject = resolve_rdfXxml_uri(resource, attribute_lists, (SubLObject)rdf_parser.T);
        }
        else if (rdf_parser.NIL != node_id) {
            if (rdf_parser.NIL != resource) {
                Errors.error((SubLObject)rdf_parser.$str62$Cannot_have_rdf_nodeID_and_rdf_re);
            }
            enforceType(node_id, rdf_parser.$sym63$VALID_XML_NAMESPACES_NAME_P);
            subject = rdf_parser_get_blank_node(v_graph, node_id);
        }
        else {
            subject = rdf_parser_get_new_blank_node(v_graph);
        }
        return subject;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 24622L)
    public static SubLObject valid_xml_namespaces_name_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_parser.NIL != xml_utilities.valid_xml_name_p(v_object) && rdf_parser.NIL == Sequences.find((SubLObject)Characters.CHAR_colon, v_object, Symbols.symbol_function((SubLObject)rdf_parser.EQL), Symbols.symbol_function((SubLObject)rdf_parser.IDENTITY), (SubLObject)rdf_parser.ONE_INTEGER, (SubLObject)rdf_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 24768L)
    public static SubLObject resolve_rdf_id(final SubLObject local_name, final SubLObject attribute_lists) {
        enforceType(local_name, rdf_parser.$sym65$VALID_XML_NAME_P);
        final SubLObject hash_prefixed = Sequences.cconcatenate((SubLObject)rdf_parser.$str66$_, local_name);
        final SubLObject resolved = resolve_rdfXxml_uri(hash_prefixed, attribute_lists, (SubLObject)rdf_parser.T);
        if (hash_prefixed.equal(resolved)) {
            Errors.error((SubLObject)rdf_parser.$str67$Couldn_t_resolve_local_name__S, local_name);
        }
        return resolved;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 25119L)
    public static SubLObject rdf_sexpr_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_parser.NIL != Strings.stringE(xml_parsing_utilities.xml_sexpr_type(v_object), rdf_utilities.rdf_name((SubLObject)rdf_parser.$str50$RDF), (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED) || rdf_parser.NIL != Strings.stringE(xml_parsing_utilities.xml_sexpr_type(v_object), (SubLObject)rdf_parser.$str50$RDF, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 25267L)
    public static SubLObject rdf_token_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && (rdf_parser.NIL != xml_parsing_utilities.xml_token_element_nameP(v_object, rdf_utilities.rdf_name((SubLObject)rdf_parser.$str50$RDF)) || rdf_parser.NIL != xml_parsing_utilities.xml_token_element_nameP(v_object, (SubLObject)rdf_parser.$str50$RDF)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 25443L)
    public static SubLObject note_parsed_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        if (rdf_parser.NIL != rdf_graph.rdf_graph_p(v_graph)) {
            rdf_graph.rdf_graph_add_triple(v_graph, subject, predicate, v_object);
        }
        else if (rdf_parser.NIL != streams_high.output_stream_p(v_graph)) {
            rdf_n_triples_writer.write_n_triple(rdf_triple.new_rdf_triple(subject, predicate, v_object), v_graph);
        }
        else {
            Errors.error((SubLObject)rdf_parser.$str68$Output_must_be_to_either_an_RDF_G, v_graph);
        }
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 25859L)
    public static SubLObject rdf_parser_get_rdf_namespace_uri(final SubLObject graph_or_stream, final SubLObject local_part) {
        if (rdf_parser.NIL != rdf_graph.rdf_graph_p(graph_or_stream)) {
            return rdf_graph.rdf_graph_get_rdf_namesapce_uri(graph_or_stream, local_part);
        }
        return rdf_uri.get_rdf_uri(rdf_utilities.rdf_namespace(), string_utilities.$empty_string$.getGlobalValue(), local_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 26128L)
    public static SubLObject rdf_parser_get_literal(final SubLObject v_graph, final SubLObject lexical_form, SubLObject language, SubLObject datatype) {
        if (language == rdf_parser.UNPROVIDED) {
            language = (SubLObject)rdf_parser.NIL;
        }
        if (datatype == rdf_parser.UNPROVIDED) {
            datatype = (SubLObject)rdf_parser.NIL;
        }
        if (rdf_parser.NIL != rdf_graph.rdf_graph_p(v_graph)) {
            return rdf_graph.rdf_graph_get_literal(v_graph, lexical_form, language, datatype);
        }
        return rdf_literal.new_rdf_literal(lexical_form, language, datatype);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 26390L)
    public static SubLObject rdf_parser_get_new_blank_node(final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rdf_parser.NIL != rdf_graph.rdf_graph_p(v_graph)) {
            return rdf_graph.rdf_graph_get_new_blank_node(v_graph);
        }
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(rdf_parser.$rdf_parser_blank_node_id_isg$.getDynamicValue(thread));
        final SubLObject node = rdf_blank_node.new_rdf_blank_node(id);
        id_index.id_index_enter(rdf_parser.$rdf_parser_blank_node_index$.getDynamicValue(thread), id, node);
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 26731L)
    public static SubLObject rdf_parser_get_blank_node(final SubLObject v_graph, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rdf_parser.NIL != rdf_graph.rdf_graph_p(v_graph)) {
            return rdf_graph.rdf_graph_get_blank_node(v_graph, id);
        }
        return rdf_blank_node.new_rdf_blank_node(integer_sequence_generator.integer_sequence_generator_next(rdf_parser.$rdf_parser_blank_node_id_isg$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 26970L)
    public static SubLObject test_rdf_to_n_triples() {
        return file_utilities.file_existsP(rdfXxml_to_n_triples(rdf_parser_test_files().first(), file_utilities.make_temp_filename((SubLObject)rdf_parser.UNPROVIDED), (SubLObject)rdf_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 26970L)
    public static SubLObject test_rdfXxml_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_files = rdf_parser_test_files();
        SubLObject parsed = (SubLObject)rdf_parser.NIL;
        SubLObject rightly_errored = (SubLObject)rdf_parser.NIL;
        SubLObject failed = (SubLObject)rdf_parser.NIL;
        final SubLObject list_var = test_files;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((rdf_parser.NIL != Sequences.cconcatenate((SubLObject)rdf_parser.$str82$Running_, new SubLObject[] { format_nil.format_nil_d_no_copy(Sequences.length(test_files)), rdf_parser.$str83$_RDF_parsing_tests___ })) ? Sequences.cconcatenate((SubLObject)rdf_parser.$str82$Running_, new SubLObject[] { format_nil.format_nil_d_no_copy(Sequences.length(test_files)), rdf_parser.$str83$_RDF_parsing_tests___ }) : rdf_parser.$str84$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rdf_parser.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rdf_parser.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rdf_parser.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rdf_parser.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject file = (SubLObject)rdf_parser.NIL;
                file = csome_list_var.first();
                while (rdf_parser.NIL != csome_list_var) {
                    SubLObject error_message = (SubLObject)rdf_parser.NIL;
                    SubLObject v_graph = (SubLObject)rdf_parser.NIL;
                    final SubLObject _prev_bind_0_$8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind((SubLObject)rdf_parser.T, thread);
                        final SubLObject base_uri = web_utilities.resolve_relative_uri(rdf_parser.$rdfXxml_parser_test_base_uri$.getGlobalValue(), string_utilities.pre_remove(file, rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue(), (SubLObject)rdf_parser.UNPROVIDED));
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)rdf_parser.$sym85$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    v_graph = parse_rdfXxml_file(file, base_uri);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)rdf_parser.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        if (rdf_parser.NIL != Sequences.search((SubLObject)rdf_parser.$str86$error, file, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED)) {
                            if (rdf_parser.NIL != rdf_graph.rdf_graph_p(v_graph)) {
                                failed = (SubLObject)ConsesLow.cons(file, failed);
                            }
                            else {
                                rightly_errored = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(file, error_message), rightly_errored);
                            }
                        }
                        else if (rdf_parser.NIL != rdf_graph.rdf_graph_p(v_graph)) {
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)rdf_parser.$sym85$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        validate_rdf_test_graph(v_graph, file);
                                    }
                                    catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, (SubLObject)rdf_parser.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (rdf_parser.NIL == error_message) {
                                parsed = (SubLObject)ConsesLow.cons(file, parsed);
                            }
                            else {
                                failed = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(file, error_message), failed);
                            }
                        }
                        else {
                            failed = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(file, error_message), failed);
                        }
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0_$8, thread);
                    }
                    streams_high.force_output((SubLObject)rdf_parser.UNPROVIDED);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rdf_parser.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    file = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_parser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        PrintLow.format((SubLObject)rdf_parser.T, (SubLObject)rdf_parser.$str87$__Failed___S__, failed);
        PrintLow.format((SubLObject)rdf_parser.T, (SubLObject)rdf_parser.$str88$__Summary___D_Parsed___D_Rightly_, new SubLObject[] { Sequences.length(parsed), Sequences.length(rightly_errored), Sequences.length(failed) });
        return Sequences.length(failed);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 26970L)
    public static SubLObject rdf_parser_test_files() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_files = (SubLObject)rdf_parser.NIL;
        assert rdf_parser.NIL != Filesys.directory_p(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue()) : rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue();
        SubLObject directory_list_var = (SubLObject)ConsesLow.list(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue());
        SubLObject current_directory_var = (SubLObject)rdf_parser.NIL;
        current_directory_var = directory_list_var.first();
        while (rdf_parser.NIL != directory_list_var) {
            directory_list_var = directory_list_var.rest();
            assert rdf_parser.NIL != Filesys.directory_p(current_directory_var) : current_directory_var;
            SubLObject directory_contents_var = Filesys.directory(current_directory_var, (SubLObject)rdf_parser.T);
            final SubLObject progress_message_var = (SubLObject)(rdf_parser.NIL.isString() ? Sequences.cconcatenate((SubLObject)rdf_parser.NIL, Sequences.cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { rdf_parser.$str90$_Directory__, format_nil.format_nil_s_no_copy(current_directory_var) })) : rdf_parser.NIL);
            final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
                if (rdf_parser.NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)rdf_parser.NIL, (SubLObject)rdf_parser.UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$12 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((rdf_parser.NIL != progress_message_var) ? progress_message_var : rdf_parser.$str84$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)rdf_parser.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)rdf_parser.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rdf_parser.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rdf_parser.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject file = (SubLObject)rdf_parser.NIL;
                        file = csome_list_var.first();
                        while (rdf_parser.NIL != csome_list_var) {
                            if (rdf_parser.NIL != Filesys.directory_p(file)) {
                                directory_list_var = (SubLObject)ConsesLow.cons(file, directory_list_var);
                            }
                            else if (rdf_parser.NIL != string_utilities.ends_with(file, (SubLObject)rdf_parser.$str91$_rdf, (SubLObject)rdf_parser.UNPROVIDED)) {
                                test_files = (SubLObject)ConsesLow.cons(file, test_files);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rdf_parser.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            file = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_parser.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$12, thread);
                }
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
            }
            current_directory_var = directory_list_var.first();
        }
        return test_files;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 26970L)
    public static SubLObject test_one_file(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_rdf_parser_caches();
        final SubLObject base_uri = web_utilities.resolve_relative_uri(rdf_parser.$rdfXxml_parser_test_base_uri$.getGlobalValue(), string_utilities.pre_remove(file, rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue(), (SubLObject)rdf_parser.UNPROVIDED));
        SubLObject v_graph = (SubLObject)rdf_parser.NIL;
        SubLObject error_message = (SubLObject)rdf_parser.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)rdf_parser.$sym85$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    v_graph = parse_rdfXxml_file(file, base_uri);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rdf_parser.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (rdf_parser.NIL != Sequences.search((SubLObject)rdf_parser.$str86$error, file, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED, (SubLObject)rdf_parser.UNPROVIDED)) {
            return list_utilities.sublisp_boolean(error_message);
        }
        if (rdf_parser.NIL != v_graph) {
            return validate_rdf_test_graph(v_graph, file);
        }
        Errors.error(error_message);
        return (SubLObject)rdf_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 26970L)
    public static SubLObject validate_rdf_test_graph(final SubLObject v_graph, final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject validP = rdf_graph.rdf_graph_p(v_graph);
        final SubLObject output_spec_file = Sequences.cconcatenate(string_utilities.post_remove(file, (SubLObject)rdf_parser.$str91$_rdf, (SubLObject)rdf_parser.UNPROVIDED), (SubLObject)rdf_parser.$str92$_nt);
        if (rdf_parser.NIL != file_utilities.file_existsP(output_spec_file)) {
            final SubLObject target_graph = rdf_n_triples_parser.rdf_graph_from_n_triples_file(output_spec_file);
            thread.resetMultipleValues();
            final SubLObject extra = rdf_graph.rdf_graph_diff(v_graph, target_graph);
            final SubLObject missing = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (rdf_parser.NIL != extra || rdf_parser.NIL != missing) {
                Errors.error((SubLObject)rdf_parser.$str93$Graph_mismatch__Extra___S___Missi, extra, missing);
            }
        }
        return validP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-parser.lisp", position = 26970L)
    public static SubLObject parse_cyc_owl_for_fort(final SubLObject fort) {
        return parse_rdfXxml_from_url(owl_cycl_to_xml.owl_opencyc_readable_uri_for_fort(fort, (SubLObject)rdf_parser.UNPROVIDED), owl_uris_and_prefixes.owl_english_opencyc_base_uri((SubLObject)rdf_parser.UNPROVIDED));
    }
    
    public static SubLObject declare_rdf_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_file", "PARSE-RDF/XML-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_file_with_detail", "PARSE-RDF/XML-FILE-WITH-DETAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_from_url", "PARSE-RDF/XML-FROM-URL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_stream", "PARSE-RDF/XML-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdfXxml_to_n_triples", "RDF/XML-TO-N-TRIPLES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_stream_to_file", "PARSE-RDF/XML-STREAM-TO-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_stream_to_graph", "PARSE-RDF/XML-STREAM-TO-GRAPH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_stream_internal", "PARSE-RDF/XML-STREAM-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_next_rdfXxml_element", "PARSE-NEXT-RDF/XML-ELEMENT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "clear_rdf_parser_caches", "CLEAR-RDF-PARSER-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_node_element", "PARSE-RDF/XML-NODE-ELEMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_node_element_internal", "PARSE-RDF/XML-NODE-ELEMENT-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdf_description_typeP", "RDF-DESCRIPTION-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_property_element", "PARSE-RDF/XML-PROPERTY-ELEMENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_parse_type_literal_property_element", "PARSE-RDF/XML-PARSE-TYPE-LITERAL-PROPERTY-ELEMENT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_literal_property_element", "PARSE-RDF/XML-LITERAL-PROPERTY-ELEMENT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_resource_property_element", "PARSE-RDF/XML-RESOURCE-PROPERTY-ELEMENT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_empty_property_element", "PARSE-RDF/XML-EMPTY-PROPERTY-ELEMENT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "reify_rdf_triple", "REIFY-RDF-TRIPLE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_collection_property_element", "PARSE-RDF/XML-COLLECTION-PROPERTY-ELEMENT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "literal_parse_type_sexprP", "LITERAL-PARSE-TYPE-SEXPR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_rdfXxml_property_attributes", "PARSE-RDF/XML-PROPERTY-ATTRIBUTES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdf_literal_value", "RDF-LITERAL-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "resolve_rdfXxml_uris", "RESOLVE-RDF/XML-URIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "resolve_rdfXxml_uri", "RESOLVE-RDF/XML-URI", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "clear_resolve_rdfXxml_uri_internal", "CLEAR-RESOLVE-RDF/XML-URI-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "remove_resolve_rdfXxml_uri_internal", "REMOVE-RESOLVE-RDF/XML-URI-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "resolve_rdfXxml_uri_internal_internal", "RESOLVE-RDF/XML-URI-INTERNAL-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "resolve_rdfXxml_uri_internal", "RESOLVE-RDF/XML-URI-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "possibly_remove_uri_fragment", "POSSIBLY-REMOVE-URI-FRAGMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "clear_expand_rdf_xml_uri_namespace_prefix", "CLEAR-EXPAND-RDF-XML-URI-NAMESPACE-PREFIX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "remove_expand_rdf_xml_uri_namespace_prefix", "REMOVE-EXPAND-RDF-XML-URI-NAMESPACE-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "expand_rdf_xml_uri_namespace_prefix_internal", "EXPAND-RDF-XML-URI-NAMESPACE-PREFIX-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "expand_rdf_xml_uri_namespace_prefix", "EXPAND-RDF-XML-URI-NAMESPACE-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "valid_node_element_rdf_uri_p", "VALID-NODE-ELEMENT-RDF-URI-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "valid_property_attribute_rdf_uri_p", "VALID-PROPERTY-ATTRIBUTE-RDF-URI-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "valid_property_element_rdf_uri_p", "VALID-PROPERTY-ELEMENT-RDF-URI-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdfXxml_core_syntax_uris", "RDF/XML-CORE-SYNTAX-URIS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdfXxml_core_syntax_rdf_uri_p", "RDF/XML-CORE-SYNTAX-RDF-URI-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdfXxml_old_term_uris", "RDF/XML-OLD-TERM-URIS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdfXxml_old_term_rdf_uri_p", "RDF/XML-OLD-TERM-RDF-URI-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdf_xml_literal_uri", "RDF-XML-LITERAL-URI", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdf_type_uri", "RDF-TYPE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "resolve_rdfXxml_subject", "RESOLVE-RDF/XML-SUBJECT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "verify_rdf_id_is_new", "VERIFY-RDF-ID-IS-NEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "resolve_rdfXxml_object_from_empty_property_element", "RESOLVE-RDF/XML-OBJECT-FROM-EMPTY-PROPERTY-ELEMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "valid_xml_namespaces_name_p", "VALID-XML-NAMESPACES-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "resolve_rdf_id", "RESOLVE-RDF-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdf_sexpr_p", "RDF-SEXPR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdf_token_p", "RDF-TOKEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "note_parsed_triple", "NOTE-PARSED-TRIPLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdf_parser_get_rdf_namespace_uri", "RDF-PARSER-GET-RDF-NAMESPACE-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdf_parser_get_literal", "RDF-PARSER-GET-LITERAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdf_parser_get_new_blank_node", "RDF-PARSER-GET-NEW-BLANK-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdf_parser_get_blank_node", "RDF-PARSER-GET-BLANK-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "test_rdf_to_n_triples", "TEST-RDF-TO-N-TRIPLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "test_rdfXxml_parser", "TEST-RDF/XML-PARSER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "rdf_parser_test_files", "RDF-PARSER-TEST-FILES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "test_one_file", "TEST-ONE-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "validate_rdf_test_graph", "VALIDATE-RDF-TEST-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_parser", "parse_cyc_owl_for_fort", "PARSE-CYC-OWL-FOR-FORT", 1, 0, false);
        return (SubLObject)rdf_parser.NIL;
    }
    
    public static SubLObject init_rdf_parser_file() {
        rdf_parser.$rdf_parser_current_lang$ = SubLFiles.defparameter("*RDF-PARSER-CURRENT-LANG*", (SubLObject)rdf_parser.NIL);
        rdf_parser.$rdf_parser_node_ids$ = SubLFiles.defparameter("*RDF-PARSER-NODE-IDS*", misc_utilities.uninitialized());
        rdf_parser.$rdf_parser_blank_node_id_isg$ = SubLFiles.defparameter("*RDF-PARSER-BLANK-NODE-ID-ISG*", misc_utilities.uninitialized());
        rdf_parser.$rdf_parser_blank_node_index$ = SubLFiles.defparameter("*RDF-PARSER-BLANK-NODE-INDEX*", misc_utilities.uninitialized());
        rdf_parser.$rdf_parser_next_list_item_number$ = SubLFiles.defparameter("*RDF-PARSER-NEXT-LIST-ITEM-NUMBER*", misc_utilities.uninitialized());
        rdf_parser.$rdf_parser_recursedP$ = SubLFiles.defparameter("*RDF-PARSER-RECURSED?*", (SubLObject)rdf_parser.NIL);
        rdf_parser.$resolve_rdfXxml_uri_internal_caching_state$ = SubLFiles.deflexical("*RESOLVE-RDF/XML-URI-INTERNAL-CACHING-STATE*", (SubLObject)rdf_parser.NIL);
        rdf_parser.$expand_rdf_xml_uri_namespace_prefix_caching_state$ = SubLFiles.deflexical("*EXPAND-RDF-XML-URI-NAMESPACE-PREFIX-CACHING-STATE*", (SubLObject)rdf_parser.NIL);
        rdf_parser.$rdfXxml_core_syntax_uris$ = SubLFiles.deflexical("*RDF/XML-CORE-SYNTAX-URIS*", (SubLObject)rdf_parser.$kw49$UNINITIALIZED);
        rdf_parser.$rdfXxml_old_term_uris$ = SubLFiles.deflexical("*RDF/XML-OLD-TERM-URIS*", (SubLObject)rdf_parser.$kw49$UNINITIALIZED);
        rdf_parser.$rdfXxml_parser_test_directory$ = SubLFiles.deflexical("*RDF/XML-PARSER-TEST-DIRECTORY*", (SubLObject)rdf_parser.$str80$_home_baxter_owl_rdf_approved_tes);
        rdf_parser.$rdfXxml_parser_test_base_uri$ = SubLFiles.deflexical("*RDF/XML-PARSER-TEST-BASE-URI*", (SubLObject)rdf_parser.$str81$http___www_w3_org_2000_10_rdf_tes);
        return (SubLObject)rdf_parser.NIL;
    }
    
    public static SubLObject setup_rdf_parser_file() {
        memoization_state.note_globally_cached_function((SubLObject)rdf_parser.$sym43$RESOLVE_RDF_XML_URI_INTERNAL);
        memoization_state.note_globally_cached_function((SubLObject)rdf_parser.$sym46$EXPAND_RDF_XML_URI_NAMESPACE_PREFIX);
        generic_testing.define_test_case_table_int((SubLObject)rdf_parser.$sym69$TEST_RDF_XML_PARSER, (SubLObject)ConsesLow.list(new SubLObject[] { rdf_parser.$kw70$TEST, rdf_parser.NIL, rdf_parser.$kw71$OWNER, rdf_parser.NIL, rdf_parser.$kw72$CLASSES, rdf_parser.$list73, rdf_parser.$kw74$KB, rdf_parser.$kw75$TINY, rdf_parser.$kw76$WORKING_, rdf_parser.T }), (SubLObject)rdf_parser.$list77);
        generic_testing.define_test_case_table_int((SubLObject)rdf_parser.$sym78$TEST_RDF_TO_N_TRIPLES, (SubLObject)ConsesLow.list(new SubLObject[] { rdf_parser.$kw70$TEST, rdf_parser.NIL, rdf_parser.$kw71$OWNER, rdf_parser.NIL, rdf_parser.$kw72$CLASSES, rdf_parser.$list73, rdf_parser.$kw74$KB, rdf_parser.$kw75$TINY, rdf_parser.$kw76$WORKING_, rdf_parser.T }), (SubLObject)rdf_parser.$list79);
        return (SubLObject)rdf_parser.NIL;
    }
    
    public void declareFunctions() {
        declare_rdf_parser_file();
    }
    
    public void initializeVariables() {
        init_rdf_parser_file();
    }
    
    public void runTopLevelForms() {
        setup_rdf_parser_file();
    }
    
    static {
        me = (SubLFile)new rdf_parser();
        rdf_parser.$rdf_parser_current_lang$ = null;
        rdf_parser.$rdf_parser_node_ids$ = null;
        rdf_parser.$rdf_parser_blank_node_id_isg$ = null;
        rdf_parser.$rdf_parser_blank_node_index$ = null;
        rdf_parser.$rdf_parser_next_list_item_number$ = null;
        rdf_parser.$rdf_parser_recursedP$ = null;
        rdf_parser.$resolve_rdfXxml_uri_internal_caching_state$ = null;
        rdf_parser.$expand_rdf_xml_uri_namespace_prefix_caching_state$ = null;
        rdf_parser.$rdfXxml_core_syntax_uris$ = null;
        rdf_parser.$rdfXxml_old_term_uris$ = null;
        rdf_parser.$rdfXxml_parser_test_directory$ = null;
        rdf_parser.$rdfXxml_parser_test_base_uri$ = null;
        $str0$file__ = SubLObjectFactory.makeString("file:/");
        $sym1$FILE_EXISTS_ = SubLObjectFactory.makeSymbol("FILE-EXISTS?");
        $kw2$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str3$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str4$Ontology = SubLObjectFactory.makeString("Ontology");
        $str5$type = SubLObjectFactory.makeString("type");
        $sym6$URL_P = SubLObjectFactory.makeSymbol("URL-P");
        $kw7$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $sym8$RDF_GRAPH_P = SubLObjectFactory.makeSymbol("RDF-GRAPH-P");
        $str9$base = SubLObjectFactory.makeString("base");
        $str10$lang = SubLObjectFactory.makeString("lang");
        $int11$10000 = SubLObjectFactory.makeInteger(10000);
        $str12$Parsing_RDF_XML_stream___ = SubLObjectFactory.makeString("Parsing RDF/XML stream...");
        $int13$1000 = SubLObjectFactory.makeInteger(1000);
        $str14$_ = SubLObjectFactory.makeString(".");
        $sym15$VALID_NODE_ELEMENT_RDF_URI_P = SubLObjectFactory.makeSymbol("VALID-NODE-ELEMENT-RDF-URI-P");
        $str16$li = SubLObjectFactory.makeString("li");
        $str17$rdf_li_is_not_allowed_as_as_an_at = SubLObjectFactory.makeString("rdf:li is not allowed as as an attribute");
        $str18$Description = SubLObjectFactory.makeString("Description");
        $str19$_ = SubLObjectFactory.makeString("_");
        $str20$resource = SubLObjectFactory.makeString("resource");
        $str21$This_is_not_legal_RDF__specifying = SubLObjectFactory.makeString("This is not legal RDF; specifying an rdf:parseType of \"Literal\" and an rdf:resource attribute at the same time is an error.");
        $str22$Resource = SubLObjectFactory.makeString("Resource");
        $str23$parseType = SubLObjectFactory.makeString("parseType");
        $str24$Collection = SubLObjectFactory.makeString("Collection");
        $str25$parseTypeOtherPropertyElt_not_yet = SubLObjectFactory.makeString("parseTypeOtherPropertyElt not yet implemented (7.2.20).");
        $str26$ID = SubLObjectFactory.makeString("ID");
        $str27$Can_t_handle_property_element___A = SubLObjectFactory.makeString("Can't handle property element: ~A");
        $sym28$VALID_PROPERTY_ATTRIBUTE_RDF_URI_P = SubLObjectFactory.makeSymbol("VALID-PROPERTY-ATTRIBUTE-RDF-URI-P");
        $str29$rdf_parseType__Literal__is_forbid = SubLObjectFactory.makeString("rdf:parseType=\"Literal\" is forbidden here since we're creating an additional resource node.");
        $str30$datatype = SubLObjectFactory.makeString("datatype");
        $str31$ = SubLObjectFactory.makeString("");
        $str32$Statement = SubLObjectFactory.makeString("Statement");
        $str33$subject = SubLObjectFactory.makeString("subject");
        $str34$predicate = SubLObjectFactory.makeString("predicate");
        $str35$object = SubLObjectFactory.makeString("object");
        $str36$nil = SubLObjectFactory.makeString("nil");
        $str37$rest = SubLObjectFactory.makeString("rest");
        $str38$first = SubLObjectFactory.makeString("first");
        $str39$Literal = SubLObjectFactory.makeString("Literal");
        $list40 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str41$xml = SubLObjectFactory.makeString("xml");
        $str42$_S_has_been_removed_from_the_RDF_ = SubLObjectFactory.makeString("~S has been removed from the RDF specification.");
        $sym43$RESOLVE_RDF_XML_URI_INTERNAL = SubLObjectFactory.makeSymbol("RESOLVE-RDF/XML-URI-INTERNAL");
        $str44$xmlns = SubLObjectFactory.makeString("xmlns");
        $sym45$_RESOLVE_RDF_XML_URI_INTERNAL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RESOLVE-RDF/XML-URI-INTERNAL-CACHING-STATE*");
        $sym46$EXPAND_RDF_XML_URI_NAMESPACE_PREFIX = SubLObjectFactory.makeSymbol("EXPAND-RDF-XML-URI-NAMESPACE-PREFIX");
        $str47$xmlns_ = SubLObjectFactory.makeString("xmlns:");
        $sym48$_EXPAND_RDF_XML_URI_NAMESPACE_PREFIX_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*EXPAND-RDF-XML-URI-NAMESPACE-PREFIX-CACHING-STATE*");
        $kw49$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str50$RDF = SubLObjectFactory.makeString("RDF");
        $str51$about = SubLObjectFactory.makeString("about");
        $str52$nodeID = SubLObjectFactory.makeString("nodeID");
        $str53$Unable_to_initialize__A__ = SubLObjectFactory.makeString("Unable to initialize ~A~%");
        $sym54$RDF_URI_MATCHES_ = SubLObjectFactory.makeSymbol("RDF-URI-MATCHES?");
        $str55$aboutEach = SubLObjectFactory.makeString("aboutEach");
        $str56$aboutEachPrefix = SubLObjectFactory.makeString("aboutEachPrefix");
        $str57$bagID = SubLObjectFactory.makeString("bagID");
        $str58$XMLLiteral = SubLObjectFactory.makeString("XMLLiteral");
        $str59$Cannot_have_rdf_nodeID_and_rdf_ID = SubLObjectFactory.makeString("Cannot have rdf:nodeID and rdf:ID.");
        $str60$Cannot_have_rdf_about_and_rdf_ID_ = SubLObjectFactory.makeString("Cannot have rdf:about and rdf:ID.");
        $str61$Cannot_have_rdf_nodeID_and_rdf_ab = SubLObjectFactory.makeString("Cannot have rdf:nodeID and rdf:about");
        $str62$Cannot_have_rdf_nodeID_and_rdf_re = SubLObjectFactory.makeString("Cannot have rdf:nodeID and rdf:resource");
        $sym63$VALID_XML_NAMESPACES_NAME_P = SubLObjectFactory.makeSymbol("VALID-XML-NAMESPACES-NAME-P");
        $str64$Name_clash__Graph_already_has_nod = SubLObjectFactory.makeString("Name clash: Graph already has node with ID ~S");
        $sym65$VALID_XML_NAME_P = SubLObjectFactory.makeSymbol("VALID-XML-NAME-P");
        $str66$_ = SubLObjectFactory.makeString("#");
        $str67$Couldn_t_resolve_local_name__S = SubLObjectFactory.makeString("Couldn't resolve local name ~S");
        $str68$Output_must_be_to_either_an_RDF_G = SubLObjectFactory.makeString("Output must be to either an RDF Graph or an output stream, not ~S");
        $sym69$TEST_RDF_XML_PARSER = SubLObjectFactory.makeSymbol("TEST-RDF/XML-PARSER");
        $kw70$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw71$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw72$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RDF-TEST-CASE-TABLES"));
        $kw74$KB = SubLObjectFactory.makeKeyword("KB");
        $kw75$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw76$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rdf_parser.NIL, (SubLObject)rdf_parser.ZERO_INTEGER));
        $sym78$TEST_RDF_TO_N_TRIPLES = SubLObjectFactory.makeSymbol("TEST-RDF-TO-N-TRIPLES");
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rdf_parser.NIL, (SubLObject)rdf_parser.T));
        $str80$_home_baxter_owl_rdf_approved_tes = SubLObjectFactory.makeString("/home/baxter/owl/rdf-approved-tests/");
        $str81$http___www_w3_org_2000_10_rdf_tes = SubLObjectFactory.makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/");
        $str82$Running_ = SubLObjectFactory.makeString("Running ");
        $str83$_RDF_parsing_tests___ = SubLObjectFactory.makeString(" RDF parsing tests...");
        $str84$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym85$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str86$error = SubLObjectFactory.makeString("error");
        $str87$__Failed___S__ = SubLObjectFactory.makeString("~&Failed: ~S~%");
        $str88$__Summary___D_Parsed___D_Rightly_ = SubLObjectFactory.makeString("~&Summary: ~D Parsed. ~D Rightly errored. ~D Failed~%");
        $sym89$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str90$_Directory__ = SubLObjectFactory.makeString(" Directory: ");
        $str91$_rdf = SubLObjectFactory.makeString(".rdf");
        $str92$_nt = SubLObjectFactory.makeString(".nt");
        $str93$Graph_mismatch__Extra___S___Missi = SubLObjectFactory.makeString("Graph mismatch. Extra: ~S~% Missing ~S~%");
    }
}

/*

	Total time: 468 ms
	
*/