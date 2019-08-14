/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.owl;


import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_predicate_triples;
import static com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subjects;
import static com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_subject_triple_count;
import static com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_p;
import static com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_utf8_string;
import static com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name;
import static com.cyc.cycjava.cycl.rdf.rdf_utilities.rdfs_expanded_name;
import static com.cyc.cycjava.cycl.rdf.rdf_utilities.skos_expanded_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.rkf_assertion_utilities;
import com.cyc.cycjava.cycl.rkf_term_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_blank_node;
import com.cyc.cycjava.cycl.rdf.rdf_graph;
import com.cyc.cycjava.cycl.rdf.rdf_triple;
import com.cyc.cycjava.cycl.rdf.rdf_uri;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      OWL-UTILITIES
 * source file: /cyc/top/cycl/owl/owl-utilities.lisp
 * created:     2019/07/03 17:38:13
 */
public final class owl_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new owl_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.owl.owl_utilities";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_namespace$ = makeSymbol("*OWL-NAMESPACE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl11_namespace$ = makeSymbol("*OWL11-NAMESPACE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $owl_warnP$ = makeSymbol("*OWL-WARN?*");



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl11_name_caching_state$ = makeSymbol("*OWL11-NAME-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl11_expanded_name_caching_state$ = makeSymbol("*OWL11-EXPANDED-NAME-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $owl_importer_use_rkfP$ = makeSymbol("*OWL-IMPORTER-USE-RKF?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$http___www_w3_org_2002_07_owl_ = makeString("http://www.w3.org/2002/07/owl#");

    private static final SubLString $str1$http___www_w3_org_2006_12_owl11_ = makeString("http://www.w3.org/2006/12/owl11#");

    private static final SubLList $list2 = list(makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLList $list4 = list(makeSymbol("OWL-WARN?"));

    public static final SubLSymbol $owl_verboseP$ = makeSymbol("*OWL-VERBOSE?*");

    private static final SubLString $str9$__ = makeString("~&");

    static private final SubLList $list10 = list(makeString("~%"));

    private static final SubLList $list11 = list(list(makeSymbol("FORCE-OUTPUT")));

    private static final SubLSymbol OWL_NAME = makeSymbol("OWL-NAME");

    private static final SubLString $str13$owl_ = makeString("owl:");

    private static final SubLSymbol $owl_name_caching_state$ = makeSymbol("*OWL-NAME-CACHING-STATE*");

    private static final SubLSymbol OWL_EXPANDED_NAME = makeSymbol("OWL-EXPANDED-NAME");

    public static final SubLSymbol $owl_expanded_name_caching_state$ = makeSymbol("*OWL-EXPANDED-NAME-CACHING-STATE*");

    private static final SubLSymbol OWL11_NAME = makeSymbol("OWL11-NAME");

    private static final SubLString $str18$owl11_ = makeString("owl11:");

    private static final SubLSymbol $sym19$_OWL11_NAME_CACHING_STATE_ = makeSymbol("*OWL11-NAME-CACHING-STATE*");

    private static final SubLSymbol OWL11_EXPANDED_NAME = makeSymbol("OWL11-EXPANDED-NAME");

    private static final SubLSymbol $sym21$_OWL11_EXPANDED_NAME_CACHING_STATE_ = makeSymbol("*OWL11-EXPANDED-NAME-CACHING-STATE*");

    private static final SubLString $str23$_ = makeString("-");



    private static final SubLSymbol OWL_ASSERT_WFF = makeSymbol("OWL-ASSERT-WFF");

    private static final SubLSymbol $sym28$CYCLIST_ = makeSymbol("CYCLIST?");

    private static final SubLSymbol NON_ASCII_STRING_P = makeSymbol("NON-ASCII-STRING-P");

    private static final SubLSymbol NON_ASCII_STRING_TO_UNICODE = makeSymbol("NON-ASCII-STRING-TO-UNICODE");

    private static final SubLString $str31$Already_know__S___in__S = makeString("Already know ~S~% in ~S");

    private static final SubLString $str32$__ = makeString("~%");

    private static final SubLString $str33$Failed_to_assert__S__ = makeString("Failed to assert ~S~%");

    private static final SubLList $list34 = cons(makeSymbol("P"), makeSymbol("V"));

    private static final SubLString $$$xmlns = makeString("xmlns");

    private static final SubLString $str36$xmlns_ = makeString("xmlns:");

    private static final SubLSymbol RDF_URI_P = makeSymbol("RDF-URI-P");

    private static final SubLList $list38 = cons(makeSymbol("PREFIX"), makeSymbol("NAMESPACE"));

    private static final SubLString $str39$_ = makeString(":");

    private static final SubLSymbol NOTE_TERM_ACTED_ON_DURING_IMPORT = makeSymbol("NOTE-TERM-ACTED-ON-DURING-IMPORT");





    private static final SubLSymbol RDF_GRAPH_P = makeSymbol("RDF-GRAPH-P");

    private static final SubLString $$$subClassOf = makeString("subClassOf");

    private static final SubLString $$$type = makeString("type");

    private static final SubLString $$$Class = makeString("Class");

    private static final SubLString $$$broader = makeString("broader");

    private static final SubLString $$$range = makeString("range");

    private static final SubLString $$$ObjectProperty = makeString("ObjectProperty");

    private static final SubLString $str50$sw_opencyc_org = makeString("sw.opencyc.org");

    private static final SubLString $str51$sw_cyc_com = makeString("sw.cyc.com");

    private static final SubLString $$$sameAs = makeString("sameAs");

    private static final SubLSymbol $sym54$_ = makeSymbol(">");

    private static final SubLString $str55$http___ = makeString("http://");

    private static final SubLString $$$intersectionOf = makeString("intersectionOf");

    private static final SubLSymbol RDF_TRIPLE_PREDICATE = makeSymbol("RDF-TRIPLE-PREDICATE");

    private static final SubLString $$$unionOf = makeString("unionOf");

    private static final SubLString $$$complementOf = makeString("complementOf");

    private static final SubLString $$$Restriction = makeString("Restriction");

    private static final SubLString $$$onProperty = makeString("onProperty");

    private static final SubLString $$$oneOf = makeString("oneOf");

    private static final SubLString $str63$Using_options___ = makeString("Using options:~%");

    private static final SubLString $str64$___S_____S__ = makeString("  ~S -> ~S~%");

    private static final SubLString $str65$___A_nodes____A_triples___ = makeString("~&~A nodes / ~A triples.~%");

    private static final SubLString $str66$___S__ = makeString("  ~S~%");

    private static final SubLString $str67$___A__ = makeString("  ~A: ");

    private static final SubLString $str68$TESTING_LOUDLY__ = makeString("TESTING LOUDLY~%");



    private static final SubLString $str72$_________________________________ = makeString("~&--------------------------------------------------------------------------------~%");

    private static final SubLString $str75$_A__import____export___A__ = makeString("~A: import -> export: ~A~%");

    private static final SubLString $str76$_A_ = makeString("~A ");

    private static final SubLString $str77$_A__export____import2___A__ = makeString("~A: export -> import2: ~A~%");

    private static final SubLString $str78$_A__import____import2___A__ = makeString("~A: import -> import2: ~A~%");

    private static final SubLString $str79$_A__ = makeString("~A~%");

    private static final SubLSymbol $sym80$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str81$_cyc_projects_EnterpriseCyc_OWL_I = makeString("/cyc/projects/EnterpriseCyc/OWL-Import-Export/tests/OWLDLImportTestSuiteOntologies/ontology~3,'0D.owl");

    private static final SubLSymbol $kw82$RESTRICT_CONTEXT_ = makeKeyword("RESTRICT-CONTEXT?");

    private static final SubLSymbol $kw83$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_ = makeKeyword("SUPPRESS-EXPORT-OF-DERIVED-KNOWLEDGE?");

    private static final SubLSymbol $kw84$SUPPRESS_ADDITIONAL_TYPE_TRIPLES_ = makeKeyword("SUPPRESS-ADDITIONAL-TYPE-TRIPLES?");

    private static final SubLString $str85$_A__A__A__ = makeString("~A(~A ~A) ");

    private static final SubLString $str86$_A__A__ = makeString("~A ~A~%");

    public static SubLObject clear_owl_caches() {
        owl_cycl_to_xml.clear_owl_tag_attributes();
        owl_cycl_to_xml.clear_forts_with_exported_owl_opencyc_content();
        owl_cycl_to_xml.clear_compact_hl_external_id_strings_with_exported_owl_opencyc_content();
        owl_cycl_to_xml.clear_owl_predicate_types_for_export();
        owlification.clear_owl_cycl_predicate_table();
        owl_to_cycl.clear_xml_tokens_from_file();
        owl_to_cycl.clear_owl_import_parameters_ontology_context();
        owl_to_cycl.clear_find_or_create_owl_ontology_for_uri();
        owl_to_cycl.clear_owl_property_element_names();
        owl_to_cycl.clear_owl_class_element_names();
        owl_to_cycl.clear_note_found_term_resolution();
        owl_to_cycl.clear_xml_name();
        clear_owl_name();
        clear_owl_expanded_name();
        clear_owl11_name();
        clear_owl11_expanded_name();
        return NIL;
    }

    public static final SubLObject owl_namespace_alt() {
        return $owl_namespace$.getGlobalValue();
    }

    public static SubLObject owl_namespace() {
        return $owl_namespace$.getGlobalValue();
    }

    public static SubLObject owl11_namespace() {
        return $owl11_namespace$.getGlobalValue();
    }

    public static SubLObject owl_namespace_uriP(final SubLObject v_object) {
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(v_object)) && (NIL != rdf_uri.rdf_uri_base_matchesP(v_object, owl_namespace())));
    }

    public static final SubLObject owl_warnP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $owl_verboseP$.getDynamicValue(thread)) || (NIL != $owl_warnP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject owl_warnP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $owl_verboseP$.getDynamicValue(thread)) || (NIL != $owl_warnP$.getDynamicValue(thread)));
    }

    /**
     * Report warnings.
     */
    @LispMethod(comment = "Report warnings.")
    public static final SubLObject owl_warn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(PWHEN, $list_alt3, listS(WARN, format_str, append(args, NIL)));
            }
        }
    }

    /**
     * Report warnings.
     */
    @LispMethod(comment = "Report warnings.")
    public static SubLObject owl_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PWHEN, $list4, listS(WARN, format_str, append(args, NIL)));
    }

    /**
     * Report warnings.
     */
    @LispMethod(comment = "Report warnings.")
    public static final SubLObject owl_note_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(PWHEN, $owl_verboseP$, listS(FORMAT, T, listS(CCONCATENATE, $str_alt8$__, format_str, $list_alt9), append(args, NIL)), $list_alt10);
            }
        }
    }

    /**
     * Report warnings.
     */
    @LispMethod(comment = "Report warnings.")
    public static SubLObject owl_note(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(PWHEN, $owl_verboseP$, listS(FORMAT, T, listS(CCONCATENATE, $str9$__, format_str, $list10), append(args, NIL)), $list11);
    }

    public static final SubLObject clear_owl_name_alt() {
        {
            SubLObject cs = $owl_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_owl_name() {
        final SubLObject cs = $owl_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_owl_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($owl_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_owl_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($owl_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject owl_name_internal_alt(SubLObject local_name) {
        return cconcatenate($str_alt12$owl_, local_name);
    }

    public static SubLObject owl_name_internal(final SubLObject local_name) {
        return cconcatenate($str13$owl_, local_name);
    }

    public static final SubLObject owl_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $owl_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(OWL_NAME, $owl_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw14$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw14$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owl_utilities.owl_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject owl_name(final SubLObject local_name) {
        SubLObject caching_state = $owl_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(OWL_NAME, $owl_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(owl_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_owl_expanded_name_alt() {
        {
            SubLObject cs = $owl_expanded_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_owl_expanded_name() {
        final SubLObject cs = $owl_expanded_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_owl_expanded_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($owl_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_owl_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($owl_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject owl_expanded_name_internal_alt(SubLObject local_name) {
        return cconcatenate($owl_namespace$.getGlobalValue(), local_name);
    }

    public static SubLObject owl_expanded_name_internal(final SubLObject local_name) {
        return cconcatenate(owl_namespace(), local_name);
    }

    public static final SubLObject owl_expanded_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $owl_expanded_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(OWL_EXPANDED_NAME, $owl_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw14$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw14$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owl_utilities.owl_expanded_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject owl_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = $owl_expanded_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(OWL_EXPANDED_NAME, $owl_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(owl_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_owl11_name() {
        final SubLObject cs = $owl11_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_owl11_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($owl11_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject owl11_name_internal(final SubLObject local_name) {
        return cconcatenate($str18$owl11_, local_name);
    }

    public static SubLObject owl11_name(final SubLObject local_name) {
        SubLObject caching_state = $owl11_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(OWL11_NAME, $sym19$_OWL11_NAME_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(owl11_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_owl11_expanded_name() {
        final SubLObject cs = $owl11_expanded_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_owl11_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($owl11_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject owl11_expanded_name_internal(final SubLObject local_name) {
        return cconcatenate(owl11_namespace(), local_name);
    }

    public static SubLObject owl11_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = $owl11_expanded_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(OWL11_EXPANDED_NAME, $sym21$_OWL11_EXPANDED_NAME_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(owl11_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject owl_create_wff_alt(SubLObject name, SubLObject isas, SubLObject defining_mt, SubLObject prefix, SubLObject capitalizeP, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_term = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                        operation_communication.set_the_cyclist(cyclist);
                        new_term = com.cyc.cycjava.cycl.owl.owl_utilities.owl_create_new_constant_wff(name, isas, defining_mt, prefix, capitalizeP);
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_term;
            }
        }
    }

    public static SubLObject owl_create_wff(final SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject capitalizeP, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_term = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(NIL, thread);
            operation_communication.set_the_cyclist(cyclist);
            new_term = owl_create_new_constant_wff(name, isas, defining_mt, prefix, capitalizeP);
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return new_term;
    }

    public static final SubLObject owl_create_new_constant_wff_alt(SubLObject name, SubLObject isas, SubLObject defining_mt, SubLObject prefix, SubLObject capitalizeP) {
        if (NIL != com.cyc.cycjava.cycl.owl.owl_utilities.owl_importer_use_rkfP()) {
            return rkf_term_utilities.create_new_constant(name, isas, NIL, defining_mt, prefix, NIL, capitalizeP, T, T);
        }
        return com.cyc.cycjava.cycl.owl.owl_utilities.owl_create_new_constant_wff_non_rkf(name, isas, defining_mt, prefix, capitalizeP);
    }

    public static SubLObject owl_create_new_constant_wff(final SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject set_caseP) {
        if (NIL != owl_importer_use_rkfP()) {
            return rkf_term_utilities.create_new_constant(name, isas, NIL, defining_mt, prefix, NIL, set_caseP, T, T);
        }
        return owl_create_new_constant_wff_non_rkf(name, isas, defining_mt, prefix, set_caseP);
    }

    public static final SubLObject owl_create_new_constant_wff_non_rkf_alt(SubLObject name, SubLObject known_collections, SubLObject defining_mt, SubLObject prefix, SubLObject capitalizeP) {
        {
            SubLObject full_name = list_utilities.remove_if_not(VALID_CONSTANT_NAME_CHAR_P, NIL != string_utilities.non_empty_string_p(prefix) ? ((SubLObject) (cconcatenate(prefix, new SubLObject[]{ $str_alt18$_, name }))) : name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject new_constant = ke.ke_create_now(NIL != capitalizeP ? ((SubLObject) (string_utilities.upcase_leading(full_name))) : string_utilities.downcase_leading(full_name), UNPROVIDED);
            SubLObject cdolist_list_var = known_collections;
            SubLObject v_isa = NIL;
            for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.owl.owl_utilities.owl_assert_low_wff(make_binary_formula($$isa, new_constant, v_isa), defining_mt);
            }
            return new_constant;
        }
    }

    public static SubLObject owl_create_new_constant_wff_non_rkf(final SubLObject name, final SubLObject known_collections, final SubLObject defining_mt, final SubLObject prefix, final SubLObject set_caseP) {
        final SubLObject full_name = list_utilities.remove_if_not(VALID_CONSTANT_NAME_CHAR_P, NIL != string_utilities.non_empty_string_p(prefix) ? cconcatenate(prefix, new SubLObject[]{ $str23$_, name }) : name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject new_constant = ke.ke_create_now(set_caseP == $UPCASE ? string_utilities.upcase_leading(full_name) : set_caseP == $DOWNCASE ? string_utilities.downcase_leading(full_name) : full_name, UNPROVIDED);
        SubLObject cdolist_list_var = known_collections;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            owl_assert_low_wff(make_binary_formula($$isa, new_constant, v_isa), defining_mt);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return new_constant;
    }

    public static final SubLObject owl_assert_wff_internal_alt(SubLObject formula, SubLObject mt, SubLObject import_term, SubLObject cyclist, SubLObject utf_8P) {
        if (import_term == UNPROVIDED) {
            import_term = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (utf_8P == UNPROVIDED) {
            utf_8P = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(cyclist, $sym21$CYCLIST_);
            if ((NIL != utf_8P) && (NIL != cycl_utilities.expression_find_if(NON_ASCII_STRING_P, formula, UNPROVIDED, UNPROVIDED))) {
                {
                    SubLObject transformed = cycl_utilities.expression_transform(formula, NON_ASCII_STRING_P, NON_ASCII_STRING_TO_UNICODE, UNPROVIDED, UNPROVIDED);
                    if (NIL == cycl_utilities.expression_find_if(NON_ASCII_STRING_P, transformed, UNPROVIDED, UNPROVIDED)) {
                        formula = transformed;
                    }
                }
            }
            {
                SubLObject successP = NIL;
                if (NIL != czer_meta.el_asserted_assertion_specP(formula, mt)) {
                    if (NIL != $owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str_alt8$__, new SubLObject[]{ $str_alt24$Already_know__S___in__S, $str_alt25$__ }), formula, mt);
                        force_output(UNPROVIDED);
                    }
                    successP = T;
                } else {
                    {
                        SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                        try {
                            api_control_vars.$the_cyclist$.bind(NIL, thread);
                            operation_communication.set_the_cyclist(cyclist);
                            thread.resetMultipleValues();
                            {
                                SubLObject assertedP = com.cyc.cycjava.cycl.owl.owl_utilities.owl_assert_low_wff(formula, mt);
                                SubLObject problematic_formula = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != assertedP) {
                                    successP = T;
                                } else {
                                    if (NIL != $owl_verboseP$.getDynamicValue(thread)) {
                                        format(T, cconcatenate($str_alt8$__, new SubLObject[]{ $str_alt26$Failed_to_assert__S__, $str_alt25$__ }), problematic_formula);
                                        force_output(UNPROVIDED);
                                    }
                                }
                            }
                        } finally {
                            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != successP) {
                    com.cyc.cycjava.cycl.owl.owl_utilities.note_sentence_asserted(formula, mt, import_term);
                }
                return successP;
            }
        }
    }

    public static SubLObject owl_assert_wff_internal(SubLObject formula, final SubLObject mt, SubLObject import_term, SubLObject cyclist, SubLObject utf_8P) {
        if (import_term == UNPROVIDED) {
            import_term = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (utf_8P == UNPROVIDED) {
            utf_8P = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != kb_accessors.cyclistP(cyclist) : "! kb_accessors.cyclistP(cyclist) " + ("kb_accessors.cyclistP(cyclist) " + "CommonSymbols.NIL != kb_accessors.cyclistP(cyclist) ") + cyclist;
        formula = narts_high.nart_expand(formula);
        if ((NIL != utf_8P) && (NIL != cycl_utilities.expression_find_if(NON_ASCII_STRING_P, formula, UNPROVIDED, UNPROVIDED))) {
            final SubLObject transformed = cycl_utilities.expression_transform(formula, NON_ASCII_STRING_P, NON_ASCII_STRING_TO_UNICODE, UNPROVIDED, UNPROVIDED);
            if (NIL == cycl_utilities.expression_find_if(NON_ASCII_STRING_P, transformed, UNPROVIDED, UNPROVIDED)) {
                formula = transformed;
            }
        }
        SubLObject successP = NIL;
        if (NIL != czer_meta.el_asserted_assertion_specP(formula, mt)) {
            if (NIL != $owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str9$__, new SubLObject[]{ $str31$Already_know__S___in__S, $str32$__ }), formula, mt);
                force_output(UNPROVIDED);
            }
            successP = T;
        } else {
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(NIL, thread);
                operation_communication.set_the_cyclist(cyclist);
                thread.resetMultipleValues();
                final SubLObject assertedP = owl_assert_low_wff(formula, mt);
                final SubLObject problematic_formula = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != assertedP) {
                    successP = T;
                } else
                    if (NIL != $owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str9$__, new SubLObject[]{ $str33$Failed_to_assert__S__, $str32$__ }), problematic_formula);
                        force_output(UNPROVIDED);
                    }

            } finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != successP) {
            note_sentence_asserted(formula, mt, import_term);
        }
        return successP;
    }

    public static final SubLObject owl_assert_wff_alt(SubLObject formula, SubLObject mt, SubLObject import_term, SubLObject cyclist, SubLObject utf_8P) {
        if (import_term == UNPROVIDED) {
            import_term = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (utf_8P == UNPROVIDED) {
            utf_8P = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owl_utilities.owl_assert_wff_internal(formula, mt, import_term, cyclist, utf_8P);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_ASSERT_WFF, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_ASSERT_WFF, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, OWL_ASSERT_WFF, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_5(formula, mt, import_term, cyclist, utf_8P);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw14$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (formula.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (import_term.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (cyclist.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && utf_8P.equal(cached_args.first())) {
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
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owl_utilities.owl_assert_wff_internal(formula, mt, import_term, cyclist, utf_8P)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, mt, import_term, cyclist, utf_8P));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject owl_assert_wff(final SubLObject formula, final SubLObject mt, SubLObject import_term, SubLObject cyclist, SubLObject utf_8P) {
        if (import_term == UNPROVIDED) {
            import_term = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (utf_8P == UNPROVIDED) {
            utf_8P = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_assert_wff_internal(formula, mt, import_term, cyclist, utf_8P);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_ASSERT_WFF, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_ASSERT_WFF, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_ASSERT_WFF, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(formula, mt, import_term, cyclist, utf_8P);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (import_term.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (cyclist.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && utf_8P.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(owl_assert_wff_internal(formula, mt, import_term, cyclist, utf_8P)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, mt, import_term, cyclist, utf_8P));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject implementation_uriP(final SubLObject v_object) {
        return makeBoolean((((NIL != rdf_utilities.rdf_namespace_uriP(v_object)) || (NIL != rdf_utilities.rdfs_namespace_uriP(v_object))) || (NIL != owl_namespace_uriP(v_object))) || (NIL != rdf_utilities.xsd_namespace_uriP(v_object)));
    }

    public static SubLObject rdf_graph_xmlns_plist(final SubLObject v_graph) {
        final SubLObject prefix_map = rdf_graph.rdf_graph_prefix_map(v_graph);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = prefix_map;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject p = NIL;
            SubLObject v = NIL;
            destructuring_bind_must_consp(current, datum, $list34);
            p = current.first();
            current = v = current.rest();
            if (NIL != string_utilities.empty_string_p(p)) {
                result = putf(result, cconcatenate($$$xmlns, p), v);
            } else {
                result = putf(result, cconcatenate($str36$xmlns_, p), v);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject rdf_abbrev_prefix_and_name_for_uri(final SubLObject prefix_map, final SubLObject uri) {
        assert NIL != rdf_uri.rdf_uri_p(uri) : "! rdf_uri.rdf_uri_p(uri) " + ("rdf_uri.rdf_uri_p(uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(uri) ") + uri;
        final SubLObject connector = format_nil.format_nil_a(rdf_uri.rdf_uri_connector(uri));
        final SubLObject abbrev_string = rdf_uri.rdf_uri_utf8_string(uri);
        final SubLObject uri_string = rdf_uri.rdf_uri_utf8_string(uri);
        SubLObject found_prefix = NIL;
        SubLObject found_name = NIL;
        SubLObject found_namespace = NIL;
        SubLObject cdolist_list_var = prefix_map;
        SubLObject prefix_namespace = NIL;
        prefix_namespace = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = prefix_namespace;
            SubLObject prefix = NIL;
            SubLObject namespace = NIL;
            destructuring_bind_must_consp(current, datum, $list38);
            prefix = current.first();
            current = namespace = current.rest();
            if (((NIL != string_utilities.starts_with(abbrev_string, namespace)) && (NIL == string_utilities.empty_string_p(prefix))) && (NIL == string_utilities.substringP(connector, string_utilities.pre_remove(uri_string, namespace, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                if (NIL != found_prefix) {
                    if (NIL != string_utilities.string_length_L(prefix, found_prefix)) {
                        found_prefix = prefix;
                        found_namespace = namespace;
                    }
                } else {
                    found_prefix = prefix;
                    found_namespace = namespace;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            prefix_namespace = cdolist_list_var.first();
        } 
        found_name = string_utilities.pre_remove(uri_string, found_namespace, UNPROVIDED);
        return values(found_prefix, found_name);
    }

    public static SubLObject rdf_graph_node_abbreviation_string(final SubLObject v_graph, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prefix_map = rdf_graph.rdf_graph_prefix_map(v_graph);
        if (NIL != rdf_uri.rdf_uri_p(node)) {
            thread.resetMultipleValues();
            final SubLObject found_prefix = rdf_abbrev_prefix_and_name_for_uri(prefix_map, node);
            final SubLObject found_name = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != string_utilities.non_empty_string_p(found_prefix)) && (NIL != string_utilities.non_empty_string_p(found_name))) {
                return cconcatenate(found_prefix, new SubLObject[]{ $str39$_, found_name });
            }
        }
        return format_nil.format_nil_s(node);
    }

    public static final SubLObject owl_importer_use_rkfP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $owl_importer_use_rkfP$.getDynamicValue(thread);
        }
    }

    public static SubLObject owl_importer_use_rkfP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $owl_importer_use_rkfP$.getDynamicValue(thread);
    }

    public static final SubLObject owl_assert_low_wff_alt(SubLObject formula, SubLObject mt) {
        if (NIL != com.cyc.cycjava.cycl.owl.owl_utilities.owl_importer_use_rkfP()) {
            return rkf_assertion_utilities.rkf_assert_with_implicature(formula, mt, T);
        }
        return values(cyc_kernel.cyc_assert_wff(formula, mt, UNPROVIDED), NIL);
    }

    public static SubLObject owl_assert_low_wff(final SubLObject formula, final SubLObject mt) {
        if (NIL != owl_importer_use_rkfP()) {
            return rkf_assertion_utilities.rkf_assert_with_implicature(formula, mt, T);
        }
        return values(ke.ke_assert_wff_now(formula, mt, UNPROVIDED, UNPROVIDED), NIL);
    }

    public static final SubLObject note_sentence_asserted_alt(SubLObject formula, SubLObject mt, SubLObject import_term) {
        {
            SubLObject assertion = czer_meta.find_assertion_cycl(formula, mt);
            return assertion;
        }
    }

    public static SubLObject note_sentence_asserted(final SubLObject formula, final SubLObject mt, final SubLObject import_term) {
        return NIL;
    }

    public static final SubLObject note_term_acted_on_during_import_internal_alt(SubLObject v_term, SubLObject import_term, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        return NIL != import_term ? ((SubLObject) (com.cyc.cycjava.cycl.owl.owl_utilities.owl_assert_wff(list($$termActedOnDuringOWLImport, import_term, v_term), $$BaseKB, import_term, cyclist, UNPROVIDED))) : NIL;
    }

    public static SubLObject note_term_acted_on_during_import_internal(final SubLObject v_term, final SubLObject import_term, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        return NIL != import_term ? owl_assert_wff(list($$termActedOnDuringOWLImport, import_term, v_term), $$BaseKB, import_term, cyclist, UNPROVIDED) : NIL;
    }

    public static final SubLObject note_term_acted_on_during_import_alt(SubLObject v_term, SubLObject import_term, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owl_utilities.note_term_acted_on_during_import_internal(v_term, import_term, cyclist);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NOTE_TERM_ACTED_ON_DURING_IMPORT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NOTE_TERM_ACTED_ON_DURING_IMPORT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, NOTE_TERM_ACTED_ON_DURING_IMPORT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, import_term, cyclist);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw14$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (import_term.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && cyclist.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owl_utilities.note_term_acted_on_during_import_internal(v_term, import_term, cyclist)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, import_term, cyclist));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject note_term_acted_on_during_import(final SubLObject v_term, final SubLObject import_term, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return note_term_acted_on_during_import_internal(v_term, import_term, cyclist);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NOTE_TERM_ACTED_ON_DURING_IMPORT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NOTE_TERM_ACTED_ON_DURING_IMPORT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NOTE_TERM_ACTED_ON_DURING_IMPORT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, import_term, cyclist);
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
                    if (import_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && cyclist.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(note_term_acted_on_during_import_internal(v_term, import_term, cyclist)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, import_term, cyclist));
        return memoization_state.caching_results(results3);
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$http___www_w3_org_2002_07_owl_ = makeString("http://www.w3.org/2002/07/owl#");

    static private final SubLList $list_alt1 = list(makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt3 = list(makeSymbol("OWL-WARN?"));

    static private final SubLString $str_alt8$__ = makeString("~&");

    static private final SubLList $list_alt9 = list(makeString("~%"));

    static private final SubLList $list_alt10 = list(list(makeSymbol("FORCE-OUTPUT")));

    static private final SubLString $str_alt12$owl_ = makeString("owl:");

    public static final SubLSymbol $kw14$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    /**
     *
     *
     * @return LISTP of URIs of all instances of owl:Class that have no rdfs:subClassOf values.
     */
    @LispMethod(comment = "@return LISTP of URIs of all instances of owl:Class that have no rdfs:subClassOf values.")
    public static final SubLObject rdf_graph_root_classes_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        {
            SubLObject root_classes = NIL;
            SubLObject cdolist_list_var = rdf_graph_find_subjects(v_graph, rdf_expanded_name($$$type), com.cyc.cycjava.cycl.owl.owl_utilities.owl_expanded_name($$$Class));
            SubLObject v_class = NIL;
            for (v_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_class = cdolist_list_var.first()) {
                if (rdf_graph_subject_triple_count(v_graph, v_class, rdfs_expanded_name($$$subClassOf)).isZero()) {
                    root_classes = cons(v_class, root_classes);
                }
            }
            return root_classes;
        }
    }

    /**
     *
     *
     * @return LISTP of URIs of all instances of owl:Class that have no rdfs:subClassOf values.
     */
    @LispMethod(comment = "@return LISTP of URIs of all instances of owl:Class that have no rdfs:subClassOf values.")
    public static SubLObject rdf_graph_root_classes(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        SubLObject root_classes = NIL;
        SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_subjects(v_graph, rdf_utilities.rdf_expanded_name($$$type), owl_expanded_name($$$Class));
        SubLObject v_class = NIL;
        v_class = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (rdf_graph.rdf_graph_subject_triple_count(v_graph, v_class, rdf_utilities.rdfs_expanded_name($$$subClassOf)).isZero()) {
                root_classes = cons(v_class, root_classes);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_class = cdolist_list_var.first();
        } 
        return root_classes;
    }

    static private final SubLString $str_alt18$_ = makeString("-");

    static private final SubLSymbol $sym21$CYCLIST_ = makeSymbol("CYCLIST?");

    static private final SubLString $str_alt24$Already_know__S___in__S = makeString("Already know ~S~% in ~S");

    static private final SubLString $str_alt25$__ = makeString("~%");

    static private final SubLString $str_alt26$Failed_to_assert__S__ = makeString("Failed to assert ~S~%");

    /**
     *
     *
     * @return LISTP of URIs of all instances of skos:Concept that have no skos:broader values.
     */
    @LispMethod(comment = "@return LISTP of URIs of all instances of skos:Concept that have no skos:broader values.")
    public static final SubLObject rdf_graph_root_concepts_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        {
            SubLObject root_concepts = NIL;
            SubLObject cdolist_list_var = rdf_graph_find_predicate_triples(v_graph, skos_expanded_name($$$broader));
            SubLObject triple = NIL;
            for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                {
                    SubLObject concept = rdf_triple.rdf_triple_object(triple);
                    if (rdf_graph_subject_triple_count(v_graph, concept, skos_expanded_name($$$broader)).isZero()) {
                        {
                            SubLObject item_var = concept;
                            if (NIL == member(item_var, root_concepts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                root_concepts = cons(item_var, root_concepts);
                            }
                        }
                    }
                }
            }
            return root_concepts;
        }
    }

    /**
     *
     *
     * @return LISTP of URIs of all instances of skos:Concept that have no skos:broader values.
     */
    @LispMethod(comment = "@return LISTP of URIs of all instances of skos:Concept that have no skos:broader values.")
    public static SubLObject rdf_graph_root_concepts(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        SubLObject root_concepts = NIL;
        SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples(v_graph, rdf_utilities.skos_expanded_name($$$broader));
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject concept = rdf_triple.rdf_triple_object(triple);
            if (rdf_graph.rdf_graph_subject_triple_count(v_graph, concept, rdf_utilities.skos_expanded_name($$$broader)).isZero()) {
                final SubLObject item_var = concept;
                if (NIL == member(item_var, root_concepts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    root_concepts = cons(item_var, root_concepts);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return root_concepts;
    }

    static private final SubLString $str_alt37$sw_opencyc_org = makeString("sw.opencyc.org");

    static private final SubLString $str_alt38$sw_cyc_com = makeString("sw.cyc.com");

    static private final SubLSymbol $sym41$_ = makeSymbol(">");

    /**
     *
     *
     * @return LISTP of URIs of all instances of owl:ObjectProperty that have no rdfs:range values.
     */
    @LispMethod(comment = "@return LISTP of URIs of all instances of owl:ObjectProperty that have no rdfs:range values.")
    public static final SubLObject rdf_graph_object_properties_without_ranges_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        {
            SubLObject v_properties = NIL;
            SubLObject cdolist_list_var = rdf_graph_find_subjects(v_graph, rdf_expanded_name($$$type), com.cyc.cycjava.cycl.owl.owl_utilities.owl_expanded_name($$$ObjectProperty));
            SubLObject property = NIL;
            for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                if (rdf_graph_subject_triple_count(v_graph, property, rdfs_expanded_name($$$range)).isZero()) {
                    v_properties = cons(property, v_properties);
                }
            }
            return v_properties;
        }
    }

    /**
     *
     *
     * @return LISTP of URIs of all instances of owl:ObjectProperty that have no rdfs:range values.
     */
    @LispMethod(comment = "@return LISTP of URIs of all instances of owl:ObjectProperty that have no rdfs:range values.")
    public static SubLObject rdf_graph_object_properties_without_ranges(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        SubLObject v_properties = NIL;
        SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_subjects(v_graph, rdf_utilities.rdf_expanded_name($$$type), owl_expanded_name($$$ObjectProperty));
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (rdf_graph.rdf_graph_subject_triple_count(v_graph, property, rdf_utilities.rdfs_expanded_name($$$range)).isZero()) {
                v_properties = cons(property, v_properties);
            }
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        return v_properties;
    }

    static private final SubLString $str_alt42$http___ = makeString("http://");

    public static final SubLObject count_outgoing_sameas_links_alt(SubLObject v_graph) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = rdf_graph_find_predicate_triples(v_graph, com.cyc.cycjava.cycl.owl.owl_utilities.owl_expanded_name($$$sameAs));
            SubLObject triple = NIL;
            for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                {
                    SubLObject other = rdf_triple.rdf_triple_object(triple);
                    if (!(((NIL == rdf_uri_p(other)) || (NIL != search($str_alt37$sw_opencyc_org, rdf_uri_utf8_string(other), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != search($str_alt38$sw_cyc_com, rdf_uri_utf8_string(other), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                        count = add(count, ONE_INTEGER);
                    }
                }
            }
            return count;
        }
    }

    public static SubLObject count_outgoing_sameas_links(final SubLObject v_graph) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples(v_graph, owl_expanded_name($$$sameAs));
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject other = rdf_triple.rdf_triple_object(triple);
            if (((NIL != rdf_uri.rdf_uri_p(other)) && (NIL == search($str50$sw_opencyc_org, rdf_uri.rdf_uri_utf8_string(other), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == search($str51$sw_cyc_com, rdf_uri.rdf_uri_utf8_string(other), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return count;
    }

    public static final SubLObject count_all_sameas_links_alt(SubLObject v_graph) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = rdf_graph_find_predicate_triples(v_graph, com.cyc.cycjava.cycl.owl.owl_utilities.owl_expanded_name($$$sameAs));
            SubLObject triple = NIL;
            for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                count = add(count, ONE_INTEGER);
            }
            return count;
        }
    }

    public static SubLObject count_all_sameas_links(final SubLObject v_graph) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples(v_graph, owl_expanded_name($$$sameAs));
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            count = add(count, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return count;
    }

    public static final SubLObject classify_sameas_links_by_namespace_alt(SubLObject v_graph) {
        {
            SubLObject result = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = rdf_graph_find_predicate_triples(v_graph, com.cyc.cycjava.cycl.owl.owl_utilities.owl_expanded_name($$$sameAs));
            SubLObject triple = NIL;
            for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                {
                    SubLObject other = rdf_triple.rdf_triple_object(triple);
                    if (NIL != rdf_uri_p(other)) {
                        {
                            SubLObject other_uri_string = rdf_uri_utf8_string(other);
                            SubLObject last_hash_pos = list_utilities.position_from_end(CHAR_hash, other_uri_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject last_slash_pos = list_utilities.position_from_end(CHAR_slash, other_uri_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject namespace = string_utilities.substring(other_uri_string, ZERO_INTEGER, number_utilities.minimum(list_utilities.delete_if_not(NUMBERP, list(last_hash_pos, last_slash_pos), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED));
                            dictionary_utilities.dictionary_increment(result, namespace, UNPROVIDED);
                        }
                    }
                }
            }
            return dictionary_utilities.sort_dictionary_by_values(result, symbol_function($sym41$_));
        }
    }

    public static SubLObject classify_sameas_links_by_namespace(final SubLObject v_graph) {
        final SubLObject result = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples(v_graph, owl_expanded_name($$$sameAs));
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject other = rdf_triple.rdf_triple_object(triple);
            if (NIL != rdf_uri.rdf_uri_p(other)) {
                final SubLObject other_uri_string = rdf_uri.rdf_uri_utf8_string(other);
                final SubLObject last_hash_pos = list_utilities.position_from_end(CHAR_hash, other_uri_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject last_slash_pos = list_utilities.position_from_end(CHAR_slash, other_uri_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject namespace = string_utilities.substring(other_uri_string, ZERO_INTEGER, number_utilities.minimum(list_utilities.delete_if_not(NUMBERP, list(last_hash_pos, last_slash_pos), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED));
                dictionary_utilities.dictionary_increment(result, namespace, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return dictionary_utilities.sort_dictionary_by_values(result, symbol_function($sym54$_));
    }

    public static final SubLObject classify_sameas_links_by_domain_alt(SubLObject v_graph) {
        {
            SubLObject result = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = rdf_graph_find_predicate_triples(v_graph, com.cyc.cycjava.cycl.owl.owl_utilities.owl_expanded_name($$$sameAs));
            SubLObject triple = NIL;
            for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                {
                    SubLObject other = rdf_triple.rdf_triple_object(triple);
                    if (NIL != rdf_uri_p(other)) {
                        {
                            SubLObject other_uri_string = rdf_uri_utf8_string(other);
                            if (NIL != string_utilities.starts_with(other_uri_string, $str_alt42$http___)) {
                                {
                                    SubLObject slash_position = position(CHAR_slash, other_uri_string, symbol_function(EQL), symbol_function(IDENTITY), SEVEN_INTEGER, UNPROVIDED);
                                    SubLObject domain = string_utilities.substring(other_uri_string, SEVEN_INTEGER, slash_position);
                                    dictionary_utilities.dictionary_increment(result, domain, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            return dictionary_utilities.sort_dictionary_by_values(result, symbol_function($sym41$_));
        }
    }

    public static SubLObject classify_sameas_links_by_domain(final SubLObject v_graph) {
        final SubLObject result = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples(v_graph, owl_expanded_name($$$sameAs));
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject other = rdf_triple.rdf_triple_object(triple);
            if (NIL != rdf_uri.rdf_uri_p(other)) {
                final SubLObject other_uri_string = rdf_uri.rdf_uri_utf8_string(other);
                if (NIL != string_utilities.starts_with(other_uri_string, $str55$http___)) {
                    final SubLObject slash_position = position(CHAR_slash, other_uri_string, symbol_function(EQL), symbol_function(IDENTITY), SEVEN_INTEGER, UNPROVIDED);
                    final SubLObject domain = string_utilities.substring(other_uri_string, SEVEN_INTEGER, slash_position);
                    dictionary_utilities.dictionary_increment(result, domain, UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return dictionary_utilities.sort_dictionary_by_values(result, symbol_function($sym54$_));
    }

    public static final SubLObject find_weird_sameas_links_alt(SubLObject v_graph) {
        {
            SubLObject cdolist_list_var = rdf_graph_find_predicate_triples(v_graph, com.cyc.cycjava.cycl.owl.owl_utilities.owl_expanded_name($$$sameAs));
            SubLObject triple = NIL;
            for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                {
                    SubLObject other = rdf_triple.rdf_triple_object(triple);
                    if (NIL == rdf_uri_p(other)) {
                        print(triple, UNPROVIDED);
                    }
                }
            }
        }
        return v_graph;
    }

    public static SubLObject find_weird_sameas_links(final SubLObject v_graph) {
        SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples(v_graph, owl_expanded_name($$$sameAs));
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject other = rdf_triple.rdf_triple_object(triple);
            if (NIL == rdf_uri.rdf_uri_p(other)) {
                print(triple, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return v_graph;
    }

    public static SubLObject owl_intersection_of_node_p(final SubLObject node, final SubLObject v_graph) {
        if (NIL == rdf_blank_node.rdf_blank_node_p(node)) {
            return NIL;
        }
        final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
        if (((NIL == list_utilities.doubletonP(triples)) && (NIL == list_utilities.tripleP(triples))) || (NIL == find(rdf_graph.rdf_graph_get_uri(v_graph, owl_expanded_name($$$intersectionOf), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        final SubLObject type_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdf_expanded_name($$$type), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
        return makeBoolean(((NIL != type_triple) && (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_subject(type_triple), node))) && (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_object(type_triple), rdf_graph.rdf_graph_get_uri(v_graph, owl_expanded_name($$$Class), UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject owl_union_of_node_p(final SubLObject node, final SubLObject v_graph) {
        if (NIL == rdf_blank_node.rdf_blank_node_p(node)) {
            return NIL;
        }
        final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
        if (((NIL == list_utilities.doubletonP(triples)) && (NIL == list_utilities.tripleP(triples))) || (NIL == find(rdf_graph.rdf_graph_get_uri(v_graph, owl_expanded_name($$$unionOf), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        final SubLObject type_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdf_expanded_name($$$type), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
        return makeBoolean(((NIL != type_triple) && (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_subject(type_triple), node))) && (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_object(type_triple), rdf_graph.rdf_graph_get_uri(v_graph, owl_expanded_name($$$Class), UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject owl_complement_of_node_p(final SubLObject node, final SubLObject v_graph) {
        if (NIL == rdf_blank_node.rdf_blank_node_p(node)) {
            return NIL;
        }
        final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
        if (((NIL == list_utilities.doubletonP(triples)) && (NIL == list_utilities.tripleP(triples))) || (NIL == find(rdf_graph.rdf_graph_get_uri(v_graph, owl_expanded_name($$$complementOf), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        final SubLObject type_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdf_expanded_name($$$type), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
        return makeBoolean(((NIL != type_triple) && (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_subject(type_triple), node))) && (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_object(type_triple), rdf_graph.rdf_graph_get_uri(v_graph, owl_expanded_name($$$Class), UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject owl_restriction_node_p(final SubLObject node, final SubLObject v_graph) {
        if (NIL != rdf_blank_node.rdf_blank_node_p(node)) {
            final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
            if ((NIL != list_utilities.tripleP(triples)) || (NIL != list_utilities.lengthE(triples, FOUR_INTEGER, UNPROVIDED))) {
                final SubLObject type_node = rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdf_expanded_name($$$type), UNPROVIDED, UNPROVIDED);
                final SubLObject restriction_node = rdf_graph.rdf_graph_get_uri(v_graph, owl_expanded_name($$$Restriction), UNPROVIDED, UNPROVIDED);
                final SubLObject on_property_node = rdf_graph.rdf_graph_get_uri(v_graph, owl_expanded_name($$$onProperty), UNPROVIDED, UNPROVIDED);
                if ((NIL != rdf_graph.rdf_graph_find_triple(v_graph, node, type_node, restriction_node)) && (NIL != list_utilities.singletonP(rdf_graph.rdf_graph_find_subject_triples(v_graph, node, on_property_node)))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject owl_one_of_node_p(final SubLObject node, final SubLObject v_graph) {
        if (NIL != rdf_blank_node.rdf_blank_node_p(node)) {
            final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
            if ((NIL != list_utilities.doubletonP(triples)) || (NIL != list_utilities.tripleP(triples))) {
                final SubLObject type_node = rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdf_expanded_name($$$type), UNPROVIDED, UNPROVIDED);
                final SubLObject one_of_node = rdf_graph.rdf_graph_get_uri(v_graph, owl_expanded_name($$$oneOf), UNPROVIDED, UNPROVIDED);
                if ((NIL != list_utilities.singletonP(rdf_graph.rdf_graph_find_subject_triples(v_graph, node, type_node))) && (NIL != list_utilities.singletonP(rdf_graph.rdf_graph_find_subject_triples(v_graph, node, one_of_node)))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject owl_debug_show_options(final SubLObject option_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), $str63$Using_options___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = option_plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), $str64$___S_____S__, property, value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject owl_debug_show_graph(final SubLObject v_graph) {
        owl_debug_show_triples(set.set_element_list(rdf_graph.rdf_graph_triples(v_graph)));
        return NIL;
    }

    public static SubLObject owl_debug_show_graph_info(final SubLObject v_graph) {
        format_nil.force_format(T, $str65$___A_nodes____A_triples___, rdf_graph.rdf_graph_node_count(v_graph), rdf_graph.rdf_graph_triple_count(v_graph), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject owl_debug_show_triples(final SubLObject triples) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = triples;
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), $str66$___S__, triple, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject owl_import_file_round_trip_test(final SubLObject filename, SubLObject verboseP, SubLObject keep_kbP, SubLObject keep_fileP, SubLObject exporter_options, SubLObject importer_options) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (keep_kbP == UNPROVIDED) {
            keep_kbP = NIL;
        }
        if (keep_fileP == UNPROVIDED) {
            keep_fileP = NIL;
        }
        if (exporter_options == UNPROVIDED) {
            exporter_options = NIL;
        }
        if (importer_options == UNPROVIDED) {
            importer_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format_nil.force_format(T, $str67$___A__, file_utilities.pathstring_filename(filename), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != verboseP) {
            format_nil.force_format(T, $str68$TESTING_LOUDLY__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            importer_options = putf(importer_options, $VERBOSE_, verboseP);
            exporter_options = putf(exporter_options, $VERBOSE_, verboseP);
        }
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind($$CycAdministrator, thread);
            final SubLObject importer = owl_importer2.owl_import_file(filename, importer_options);
            final SubLObject import_graph = owl_importer2.owl_importer2_graph(importer);
            final SubLObject ontology_term = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_TERM, UNPROVIDED);
            final SubLObject exporter_filename = file_utilities.make_temp_filename(file_utilities.temp_directory());
            final SubLObject exporter = owl_exporter2.owl_export_ontology_to_file(ontology_term, exporter_filename, exporter_options);
            final SubLObject export_graph = owl_exporter2.owl_exporter2_graph(exporter);
            final SubLObject importer2 = owl_importer2.owl_import_file_to_graph_only(exporter_filename, importer_options);
            final SubLObject import2_graph = owl_importer2.owl_importer2_graph(importer2);
            SubLObject result1 = NIL;
            SubLObject result2 = NIL;
            thread.resetMultipleValues();
            SubLObject import_extra_triples = rdf_graph.rdf_graph_compare(import_graph, export_graph, verboseP);
            final SubLObject export_extra_triples = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != verboseP) {
                format_nil.force_format(T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                owl_debug_show_triples(import_extra_triples);
                format_nil.force_format(T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                owl_debug_show_triples(export_extra_triples);
                format_nil.force_format(T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                format_nil.force_format(T, $str32$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL != import_extra_triples) || (NIL != export_extra_triples)) {
                result1 = $FAIL;
            } else {
                result1 = $OK;
            }
            if (NIL != verboseP) {
                format_nil.force_format(T, $str75$_A__import____export___A__, filename, result1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                format_nil.force_format(T, $str76$_A_, result1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            thread.resetMultipleValues();
            final SubLObject export_extra_triples2 = rdf_graph.rdf_graph_compare(export_graph, import2_graph, verboseP);
            SubLObject import2_extra_triples = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != verboseP) {
                format_nil.force_format(T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                owl_debug_show_triples(export_extra_triples2);
                format_nil.force_format(T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                owl_debug_show_triples(import2_extra_triples);
                format_nil.force_format(T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                format_nil.force_format(T, $str32$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL != export_extra_triples2) || (NIL != import2_extra_triples)) {
                result2 = $FAIL;
            } else {
                result2 = $OK;
            }
            if (NIL != verboseP) {
                format_nil.force_format(T, $str77$_A__export____import2___A__, filename, result2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                format_nil.force_format(T, $str76$_A_, result2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            thread.resetMultipleValues();
            import_extra_triples = rdf_graph.rdf_graph_compare(import_graph, import2_graph, verboseP);
            import2_extra_triples = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != verboseP) {
                format_nil.force_format(T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                owl_debug_show_triples(import_extra_triples);
                format_nil.force_format(T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                owl_debug_show_triples(import2_extra_triples);
                format_nil.force_format(T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                format_nil.force_format(T, $str32$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL != import_extra_triples) || (NIL != import2_extra_triples)) {
                result2 = $FAIL;
            } else {
                result2 = $OK;
            }
            if (NIL != verboseP) {
                format_nil.force_format(T, $str78$_A__import____import2___A__, filename, result2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                format_nil.force_format(T, $str79$_A__, result2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == keep_kbP) {
                ke.ke_kill_now(ontology_term);
            }
            if (NIL == keep_fileP) {
                Filesys.delete_file(exporter_filename);
            }
            return ($OK == result1) && ($OK == result2) ? $OK : $FAIL;
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject owl_import_file_round_trip_test_owl_dl(final SubLObject file_number, SubLObject verboseP, SubLObject keep_kbP, SubLObject keep_fileP, SubLObject exporter_options, SubLObject importer_options) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (keep_kbP == UNPROVIDED) {
            keep_kbP = NIL;
        }
        if (keep_fileP == UNPROVIDED) {
            keep_fileP = NIL;
        }
        if (exporter_options == UNPROVIDED) {
            exporter_options = NIL;
        }
        if (importer_options == UNPROVIDED) {
            importer_options = NIL;
        }
        final SubLObject filename = format(NIL, $str81$_cyc_projects_EnterpriseCyc_OWL_I, file_number);
        return owl_import_file_round_trip_test(filename, verboseP, keep_kbP, keep_fileP, list_utilities.merge_plist(exporter_options, list($kw82$RESTRICT_CONTEXT_, T, $kw83$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_, T, $kw84$SUPPRESS_ADDITIONAL_TYPE_TRIPLES_, T)), importer_options);
    }

    public static SubLObject owl_import_file_quiescence_test(final SubLObject filename, SubLObject verboseP, SubLObject keep_kbP, SubLObject keep_filesP, SubLObject exporter_options, SubLObject importer_options) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (keep_kbP == UNPROVIDED) {
            keep_kbP = NIL;
        }
        if (keep_filesP == UNPROVIDED) {
            keep_filesP = NIL;
        }
        if (exporter_options == UNPROVIDED) {
            exporter_options = NIL;
        }
        if (importer_options == UNPROVIDED) {
            importer_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind($$CycAdministrator, thread);
            final SubLObject max_iterations = THREE_INTEGER;
            SubLObject next_import_filename = filename;
            SubLObject last_export_filename = NIL;
            SubLObject last_import_graph = NIL;
            SubLObject last_export_graph = NIL;
            format_nil.force_format(T, $str67$___A__, file_utilities.pathstring_filename(filename), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != verboseP) {
                format_nil.force_format(T, $str68$TESTING_LOUDLY__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                importer_options = putf(importer_options, $VERBOSE_, verboseP);
                exporter_options = putf(exporter_options, $VERBOSE_, verboseP);
            }
            SubLObject iteration_num;
            SubLObject importer;
            SubLObject import_graph;
            SubLObject ontology_term;
            SubLObject exporter_filename;
            SubLObject exporter;
            SubLObject export_graph;
            for (iteration_num = NIL, iteration_num = ZERO_INTEGER; iteration_num.numL(max_iterations); iteration_num = add(iteration_num, ONE_INTEGER)) {
                importer = owl_importer2.owl_import_file(next_import_filename, importer_options);
                import_graph = owl_importer2.owl_importer2_graph(importer);
                ontology_term = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_TERM, UNPROVIDED);
                exporter_filename = file_utilities.make_temp_filename(file_utilities.temp_directory());
                exporter = owl_exporter2.owl_export_ontology_to_file(ontology_term, exporter_filename, exporter_options);
                export_graph = owl_exporter2.owl_exporter2_graph(exporter);
                format_nil.force_format(T, $str85$_A__A__A__, iteration_num, rdf_graph.rdf_graph_triple_count(import_graph), rdf_graph.rdf_graph_triple_count(export_graph), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (((((NIL != rdf_graph.rdf_graph_p(last_export_graph)) && (NIL != rdf_graph.rdf_graph_p(last_import_graph))) && rdf_graph.rdf_graph_triple_count(last_export_graph).eql(rdf_graph.rdf_graph_triple_count(last_import_graph))) && rdf_graph.rdf_graph_triple_count(last_import_graph).eql(rdf_graph.rdf_graph_triple_count(import_graph))) && rdf_graph.rdf_graph_triple_count(import_graph).eql(rdf_graph.rdf_graph_triple_count(export_graph))) {
                    format_nil.force_format(T, $str86$_A__A__, $OK, iteration_num, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return values($OK, iteration_num);
                }
                last_import_graph = import_graph;
                last_export_graph = export_graph;
                if (NIL == keep_kbP) {
                    ke.ke_kill_now(ontology_term);
                }
                if ((NIL == keep_filesP) && (NIL == Strings.stringE(next_import_filename, filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    Filesys.delete_file(next_import_filename);
                }
                next_import_filename = exporter_filename;
                last_export_filename = exporter_filename;
            }
            if ((NIL == keep_filesP) && (NIL == Strings.stringE(last_export_filename, filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                Filesys.delete_file(last_export_filename);
            }
            format_nil.force_format(T, $str79$_A__, $FAIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return values($FAIL, max_iterations);
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject owl_import_file_quiescence_test_owl_dl(final SubLObject file_number, SubLObject verboseP, SubLObject keep_kbP, SubLObject keep_fileP, SubLObject exporter_options, SubLObject importer_options) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (keep_kbP == UNPROVIDED) {
            keep_kbP = NIL;
        }
        if (keep_fileP == UNPROVIDED) {
            keep_fileP = NIL;
        }
        if (exporter_options == UNPROVIDED) {
            exporter_options = NIL;
        }
        if (importer_options == UNPROVIDED) {
            importer_options = NIL;
        }
        final SubLObject filename = format(NIL, $str81$_cyc_projects_EnterpriseCyc_OWL_I, file_number);
        return owl_import_file_quiescence_test(filename, verboseP, keep_kbP, keep_fileP, exporter_options, importer_options);
    }

    public static SubLObject declare_owl_utilities_file() {
        declareFunction("clear_owl_caches", "CLEAR-OWL-CACHES", 0, 0, false);
        declareFunction("owl_namespace", "OWL-NAMESPACE", 0, 0, false);
        declareFunction("owl11_namespace", "OWL11-NAMESPACE", 0, 0, false);
        declareFunction("owl_namespace_uriP", "OWL-NAMESPACE-URI?", 1, 0, false);
        declareFunction("owl_warnP", "OWL-WARN?", 0, 0, false);
        declareMacro("owl_warn", "OWL-WARN");
        declareMacro("owl_note", "OWL-NOTE");
        declareFunction("clear_owl_name", "CLEAR-OWL-NAME", 0, 0, false);
        declareFunction("remove_owl_name", "REMOVE-OWL-NAME", 1, 0, false);
        declareFunction("owl_name_internal", "OWL-NAME-INTERNAL", 1, 0, false);
        declareFunction("owl_name", "OWL-NAME", 1, 0, false);
        declareFunction("clear_owl_expanded_name", "CLEAR-OWL-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_owl_expanded_name", "REMOVE-OWL-EXPANDED-NAME", 1, 0, false);
        declareFunction("owl_expanded_name_internal", "OWL-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("owl_expanded_name", "OWL-EXPANDED-NAME", 1, 0, false);
        declareFunction("clear_owl11_name", "CLEAR-OWL11-NAME", 0, 0, false);
        declareFunction("remove_owl11_name", "REMOVE-OWL11-NAME", 1, 0, false);
        declareFunction("owl11_name_internal", "OWL11-NAME-INTERNAL", 1, 0, false);
        declareFunction("owl11_name", "OWL11-NAME", 1, 0, false);
        declareFunction("clear_owl11_expanded_name", "CLEAR-OWL11-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_owl11_expanded_name", "REMOVE-OWL11-EXPANDED-NAME", 1, 0, false);
        declareFunction("owl11_expanded_name_internal", "OWL11-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("owl11_expanded_name", "OWL11-EXPANDED-NAME", 1, 0, false);
        declareFunction("owl_create_wff", "OWL-CREATE-WFF", 5, 1, false);
        declareFunction("owl_create_new_constant_wff", "OWL-CREATE-NEW-CONSTANT-WFF", 5, 0, false);
        declareFunction("owl_create_new_constant_wff_non_rkf", "OWL-CREATE-NEW-CONSTANT-WFF-NON-RKF", 5, 0, false);
        declareFunction("owl_assert_wff_internal", "OWL-ASSERT-WFF-INTERNAL", 2, 3, false);
        declareFunction("owl_assert_wff", "OWL-ASSERT-WFF", 2, 3, false);
        declareFunction("implementation_uriP", "IMPLEMENTATION-URI?", 1, 0, false);
        declareFunction("rdf_graph_xmlns_plist", "RDF-GRAPH-XMLNS-PLIST", 1, 0, false);
        declareFunction("rdf_abbrev_prefix_and_name_for_uri", "RDF-ABBREV-PREFIX-AND-NAME-FOR-URI", 2, 0, false);
        declareFunction("rdf_graph_node_abbreviation_string", "RDF-GRAPH-NODE-ABBREVIATION-STRING", 2, 0, false);
        declareFunction("owl_importer_use_rkfP", "OWL-IMPORTER-USE-RKF?", 0, 0, false);
        declareFunction("owl_assert_low_wff", "OWL-ASSERT-LOW-WFF", 2, 0, false);
        declareFunction("note_sentence_asserted", "NOTE-SENTENCE-ASSERTED", 3, 0, false);
        declareFunction("note_term_acted_on_during_import_internal", "NOTE-TERM-ACTED-ON-DURING-IMPORT-INTERNAL", 2, 1, false);
        declareFunction("note_term_acted_on_during_import", "NOTE-TERM-ACTED-ON-DURING-IMPORT", 2, 1, false);
        declareFunction("rdf_graph_root_classes", "RDF-GRAPH-ROOT-CLASSES", 1, 0, false);
        declareFunction("rdf_graph_root_concepts", "RDF-GRAPH-ROOT-CONCEPTS", 1, 0, false);
        declareFunction("rdf_graph_object_properties_without_ranges", "RDF-GRAPH-OBJECT-PROPERTIES-WITHOUT-RANGES", 1, 0, false);
        declareFunction("count_outgoing_sameas_links", "COUNT-OUTGOING-SAMEAS-LINKS", 1, 0, false);
        declareFunction("count_all_sameas_links", "COUNT-ALL-SAMEAS-LINKS", 1, 0, false);
        declareFunction("classify_sameas_links_by_namespace", "CLASSIFY-SAMEAS-LINKS-BY-NAMESPACE", 1, 0, false);
        declareFunction("classify_sameas_links_by_domain", "CLASSIFY-SAMEAS-LINKS-BY-DOMAIN", 1, 0, false);
        declareFunction("find_weird_sameas_links", "FIND-WEIRD-SAMEAS-LINKS", 1, 0, false);
        declareFunction("owl_intersection_of_node_p", "OWL-INTERSECTION-OF-NODE-P", 2, 0, false);
        declareFunction("owl_union_of_node_p", "OWL-UNION-OF-NODE-P", 2, 0, false);
        declareFunction("owl_complement_of_node_p", "OWL-COMPLEMENT-OF-NODE-P", 2, 0, false);
        declareFunction("owl_restriction_node_p", "OWL-RESTRICTION-NODE-P", 2, 0, false);
        declareFunction("owl_one_of_node_p", "OWL-ONE-OF-NODE-P", 2, 0, false);
        declareFunction("owl_debug_show_options", "OWL-DEBUG-SHOW-OPTIONS", 1, 0, false);
        declareFunction("owl_debug_show_graph", "OWL-DEBUG-SHOW-GRAPH", 1, 0, false);
        declareFunction("owl_debug_show_graph_info", "OWL-DEBUG-SHOW-GRAPH-INFO", 1, 0, false);
        declareFunction("owl_debug_show_triples", "OWL-DEBUG-SHOW-TRIPLES", 1, 0, false);
        declareFunction("owl_import_file_round_trip_test", "OWL-IMPORT-FILE-ROUND-TRIP-TEST", 1, 5, false);
        declareFunction("owl_import_file_round_trip_test_owl_dl", "OWL-IMPORT-FILE-ROUND-TRIP-TEST-OWL-DL", 1, 5, false);
        declareFunction("owl_import_file_quiescence_test", "OWL-IMPORT-FILE-QUIESCENCE-TEST", 1, 5, false);
        declareFunction("owl_import_file_quiescence_test_owl_dl", "OWL-IMPORT-FILE-QUIESCENCE-TEST-OWL-DL", 1, 5, false);
        return NIL;
    }

    public static SubLObject init_owl_utilities_file() {
        deflexical("*OWL-NAMESPACE*", $str0$http___www_w3_org_2002_07_owl_);
        deflexical("*OWL11-NAMESPACE*", $str1$http___www_w3_org_2006_12_owl11_);
        defparameter("*OWL-WARN?*", T);
        defparameter("*OWL-VERBOSE?*", NIL);
        deflexical("*OWL-NAME-CACHING-STATE*", NIL);
        deflexical("*OWL-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*OWL11-NAME-CACHING-STATE*", NIL);
        deflexical("*OWL11-EXPANDED-NAME-CACHING-STATE*", NIL);
        defparameter("*OWL-IMPORTER-USE-RKF?*", T);
        return NIL;
    }

    public static SubLObject setup_owl_utilities_file() {
        memoization_state.note_globally_cached_function(OWL_NAME);
        memoization_state.note_globally_cached_function(OWL_EXPANDED_NAME);
        memoization_state.note_globally_cached_function(OWL11_NAME);
        memoization_state.note_globally_cached_function(OWL11_EXPANDED_NAME);
        memoization_state.note_memoized_function(OWL_ASSERT_WFF);
        memoization_state.note_memoized_function(NOTE_TERM_ACTED_ON_DURING_IMPORT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_owl_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_owl_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_owl_utilities_file();
    }

    static {
    }
}

/**
 * Total time: 412 ms
 */
