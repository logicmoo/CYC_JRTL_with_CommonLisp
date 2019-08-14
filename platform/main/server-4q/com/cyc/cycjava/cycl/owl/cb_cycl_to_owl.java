package com.cyc.cycjava.cycl.owl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.html_arghash;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_cycl_to_owl extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new cb_cycl_to_owl();

    public static final String myName = "com.cyc.cycjava_2.cycl.owl.cb_cycl_to_owl";


    // defparameter
    private static final SubLSymbol $cb_owl_export_inference_justification_termsP$ = makeSymbol("*CB-OWL-EXPORT-INFERENCE-JUSTIFICATION-TERMS?*");

    private static final SubLSymbol $CB_CYCL_TO_OWL = makeKeyword("CB-CYCL-TO-OWL");

    private static final SubLString $str1$cb_cycl_to_owl_html = makeString("cb-cycl-to-owl.html");

    private static final SubLString $$$OWL_Exporter = makeString("OWL Exporter");

    private static final SubLSymbol CB_OWL_EXPORT = makeSymbol("CB-OWL-EXPORT");



    private static final SubLSymbol FORT_TO_STRING = makeSymbol("FORT-TO-STRING");

    private static final SubLSymbol TERMS_FOR_BROWSING = makeSymbol("TERMS-FOR-BROWSING");





    private static final SubLSymbol $PREFER_URIS = makeKeyword("PREFER-URIS");



    private static final SubLSymbol $OVERRIDE_ONTOLOGY_BASE_URI = makeKeyword("OVERRIDE-ONTOLOGY-BASE-URI");











    private static final SubLSymbol $TERMS_COUNT = makeKeyword("TERMS-COUNT");

    private static final SubLObject $$Ontology = reader_make_constant_shell(makeString("Ontology"));

    private static final SubLString $$$Export_an_OWL_ontology = makeString("Export an OWL ontology");

    private static final SubLString $str20$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str21$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str26$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str32$cb_owl_export = makeString("cb-owl-export");



    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $str36$Choose_the_method_for_determining = makeString("Choose the method for determining the terms to export:");

    private static final SubLString $str37$Export_an_ontology_defined_in_Cyc = makeString("Export an ontology defined in Cyc :");

    private static final SubLString $str38$Export_a_list_of_terms_ = makeString("Export a list of terms:");

    private static final SubLString $str39$Choose_export_options_ = makeString("Choose export options:");

    private static final SubLSymbol $OVERRIDE_ONTOLOGY_MT = makeKeyword("OVERRIDE-ONTOLOGY-MT");

    private static final SubLString $$$Override_the_ontology_microtheory = makeString("Override the ontology microtheory");



    private static final SubLString $str43$_2 = makeString("+2");

    private static final SubLString $str44$_ = makeString("*");

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

    private static final SubLSymbol $OVERRIDE_ONTOLOGY_URI = makeKeyword("OVERRIDE-ONTOLOGY-URI");

    private static final SubLString $$$Override_the_ontology_URI = makeString("Override the ontology URI");



    private static final SubLString $str49$ = makeString("");

    private static final SubLInteger $int$40 = makeInteger(40);



    private static final SubLString $str52$_Default__Use_the_ontology_Base_U = makeString("(Default) Use the ontology Base URI (from the ");

    private static final SubLObject $$baseNamespaceForSKS = reader_make_constant_shell(makeString("baseNamespaceForSKS"));

    private static final SubLString $str54$_assertion_ = makeString(" assertion)");



    private static final SubLString $$$Override_the_ontology_Base_URI = makeString("Override the ontology Base URI");

    private static final SubLSymbol $ONTOLOGY_BASE_URI = makeKeyword("ONTOLOGY-BASE-URI");

    private static final SubLSymbol $OPENCYC = makeKeyword("OPENCYC");

    private static final SubLString $$$Use_OpenCyc_as_the_Base_URI = makeString("Use OpenCyc as the Base URI");

    private static final SubLString $$$Add_these_URIs_as_ = makeString("Add these URIs as ");

    private static final SubLObject $const61$owl_sameAs = reader_make_constant_shell(makeString("owl:sameAs"));

    private static final SubLString $str62$_triples_ = makeString(" triples:");

    private static final SubLSymbol $SAME_AS_URIS = makeKeyword("SAME-AS-URIS");

    private static final SubLString $str64$_Readable_OpenCyc_URIs__when_appl = makeString(" Readable OpenCyc URIs (when applicable)");



    private static final SubLString $$$_Cyc_Compact_External_ID_URIs = makeString(" Cyc Compact External ID URIs");

    private static final SubLSymbol $DBPEDIA = makeKeyword("DBPEDIA");

    private static final SubLString $str68$_DBpedia_URIs__when_applicable_ = makeString(" DBpedia URIs (when applicable)");

    private static final SubLSymbol $ADD_COMMENTS = makeKeyword("ADD-COMMENTS");

    private static final SubLString $$$Add_ = makeString("Add ");

    private static final SubLObject $$comment = reader_make_constant_shell(makeString("comment"));

    private static final SubLString $$$_triples = makeString(" triples");

    private static final SubLSymbol $ADD_PRETTY_STRINGS = makeKeyword("ADD-PRETTY-STRINGS");

    private static final SubLObject $$prettyString = reader_make_constant_shell(makeString("prettyString"));

    private static final SubLSymbol $ADD_PRETTY_STRING_CANONICAL = makeKeyword("ADD-PRETTY-STRING-CANONICAL");

    private static final SubLObject $$prettyString_Canonical = reader_make_constant_shell(makeString("prettyString-Canonical"));

    private static final SubLString $str77$_Default__Prefer_the_ontology_URI = makeString("(Default) Prefer the ontology URIs ");

    private static final SubLSymbol $SYNONYMOUS_EXTERNAL_CONCEPT = makeKeyword("SYNONYMOUS-EXTERNAL-CONCEPT");

    private static final SubLString $$$Prefer_ = makeString("Prefer ");

    private static final SubLObject $$synonymousExternalConcept = reader_make_constant_shell(makeString("synonymousExternalConcept"));

    private static final SubLString $$$_URIs_over_the_ontology_URIs = makeString(" URIs over the ontology URIs");

    private static final SubLString $str82$Prefer_OpenCyc_URIs_over_the_onto = makeString("Prefer OpenCyc URIs over the ontology URIs");

    private static final SubLSymbol $kw83$RESTRICT_CONTEXT_ = makeKeyword("RESTRICT-CONTEXT?");

    private static final SubLString $str84$Restrict_export_to_only_assertion = makeString("Restrict export to only assertions in the ontology microtheory");

    private static final SubLSymbol $kw85$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_ = makeKeyword("SUPPRESS-EXPORT-OF-DERIVED-KNOWLEDGE?");

    private static final SubLString $str86$Suppress_export_of_derived_knowle = makeString("Suppress export of derived knowledge");

    private static final SubLSymbol $LEGACY_EXPORT = makeKeyword("LEGACY-EXPORT");

    private static final SubLString $str88$Use_legacy_exporter__List_of_term = makeString("Use legacy exporter (List of terms only; does not support above options)");

    private static final SubLString $$$Rebuild_Export_Link = makeString("Rebuild Export Link");

    private static final SubLSymbol $EXPORT = makeKeyword("EXPORT");

    private static final SubLSymbol $CB_OWL_EXPORT_XML = makeKeyword("CB-OWL-EXPORT-XML");

    private static final SubLString $$$Download_Export = makeString("Download Export");

    private static final SubLString $str93$Please_fill_out_the_starred_field = makeString("Please fill out the starred fields");

    private static final SubLString $$$Retry_Get_Export_Link = makeString("Retry Get Export Link");

    private static final SubLString $$$Get_Export_Link = makeString("Get Export Link");

    private static final SubLString $str96$cb_owl_export_xml = makeString("cb-owl-export-xml");

    private static final SubLSymbol CB_LINK_CB_OWL_EXPORT_XML = makeSymbol("CB-LINK-CB-OWL-EXPORT-XML");

    private static final SubLString $str98$window_open__ = makeString("window.open('");

    private static final SubLString $str99$__ = makeString("',");

    private static final SubLString $str100$__A_ = makeString("'~A'");

    private static final SubLString $$$null = makeString("null");

    private static final SubLString $str102$___A____ = makeString(",'~A'); ");

    private static final SubLString $str103$return_false_ = makeString("return false;");

    private static final SubLSymbol $PREFER_OPENCYC_URIS = makeKeyword("PREFER-OPENCYC-URIS");



    private static final SubLString $str106$http___sw_opencyc_org_2009_04_07_ = makeString("http://sw.opencyc.org/2009/04/07/concept/en");

    private static final SubLSymbol CB_OWL_EXPORT_XML = makeSymbol("CB-OWL-EXPORT-XML");



    private static final SubLString $str109$_OWL_Export_ = makeString("[OWL Export]");



    private static final SubLString $str111$__store_id = makeString(":.store-id");

    private static final SubLString $str112$__inference_id = makeString(":.inference-id");

    private static final SubLSymbol $CB_OWL_EXPORT_INFERENCE_ANSWERS = makeKeyword("CB-OWL-EXPORT-INFERENCE-ANSWERS");

    private static final SubLSymbol CB_LINK_CB_OWL_EXPORT_INFERENCE_ANSWERS = makeSymbol("CB-LINK-CB-OWL-EXPORT-INFERENCE-ANSWERS");

    public static SubLObject cb_owl_export(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$OWL_Exporter);
        }
        return cb_owl_export_internal(html_arghash.arglist_to_arghash(args));
    }

    public static SubLObject cb_owl_export_internal(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject debug = NIL;
        final SubLObject generation_fn = symbol_function(FORT_TO_STRING);
        final SubLObject parse_fn = symbol_function(TERMS_FOR_BROWSING);
        SubLObject initial_entryP = NIL;
        SubLObject errors_foundP = NIL;
        if (NIL == html_arghash.get_arghash_value($TYPE, arghash)) {
            initial_entryP = T;
            html_arghash.set_arghash_value($TYPE, arghash, $ONTOLOGY);
            html_arghash.set_arghash_value($PREFER_URIS, arghash, $DEFAULT);
            html_arghash.set_arghash_value($OVERRIDE_ONTOLOGY_BASE_URI, arghash, $DEFAULT);
        }
        final SubLObject store_id = html_arghash.get_arghash_value($STORE_ID, arghash);
        final SubLObject inference_id = html_arghash.get_arghash_value($INFERENCE_ID, arghash);
        SubLObject terms = NIL;
        if (store_id.isInteger() && inference_id.isInteger()) {
            final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(store_id, inference_id);
            if (NIL != inference_datastructures_inference.inference_p(inference)) {
                final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                    final SubLObject idx_$1 = idx;
                    if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$1);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject v_answer;
                        SubLObject cdolist_list_var;
                        SubLObject binding;
                        SubLObject v_term;
                        SubLObject item_var;
                        SubLObject justification;
                        SubLObject supports;
                        SubLObject cdolist_list_var_$2;
                        SubLObject full_justification;
                        SubLObject v_object;
                        SubLObject cdolist_list_var_$3;
                        SubLObject v_term2;
                        SubLObject item_var2;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            v_answer = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(v_answer)) {
                                    v_answer = $SKIP;
                                }
                                cdolist_list_var = inference_datastructures_inference.inference_answer_bindings(v_answer);
                                binding = NIL;
                                binding = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    v_term = binding.rest();
                                    if (NIL != forts.fort_p(v_term)) {
                                        item_var = v_term;
                                        if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            terms = cons(item_var, terms);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    binding = cdolist_list_var.first();
                                } 
                                if (NIL != $cb_owl_export_inference_justification_termsP$.getDynamicValue(thread)) {
                                    cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                    justification = NIL;
                                    justification = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                                        full_justification = cdolist_list_var_$2 = hl_supports.hl_justification_expand(supports);
                                        v_object = NIL;
                                        v_object = cdolist_list_var_$2.first();
                                        while (NIL != cdolist_list_var_$2) {
                                            if (NIL != assertion_handles.assertion_p(v_object)) {
                                                v_object = assertions_high.assertion_formula(v_object);
                                            }
                                            if (v_object.isList()) {
                                                cdolist_list_var_$3 = list_utilities.find_all_if(FORT_P, v_object, UNPROVIDED);
                                                v_term2 = NIL;
                                                v_term2 = cdolist_list_var_$3.first();
                                                while (NIL != cdolist_list_var_$3) {
                                                    item_var2 = v_term2;
                                                    if (NIL == member(item_var2, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        terms = cons(item_var2, terms);
                                                    }
                                                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                                    v_term2 = cdolist_list_var_$3.first();
                                                } 
                                            }
                                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                            v_object = cdolist_list_var_$2.first();
                                        } 
                                        cdolist_list_var = cdolist_list_var.rest();
                                        justification = cdolist_list_var.first();
                                    } 
                                }
                            }
                        }
                    }
                    final SubLObject idx_$2 = idx;
                    if (NIL == id_index_sparse_objects_empty_p(idx_$2)) {
                        final SubLObject cdohash_table = id_index_sparse_objects(idx_$2);
                        SubLObject id2 = NIL;
                        SubLObject v_answer2 = NIL;
                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                id2 = getEntryKey(cdohash_entry);
                                v_answer2 = getEntryValue(cdohash_entry);
                                SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_bindings(v_answer2);
                                SubLObject binding2 = NIL;
                                binding2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    final SubLObject v_term3 = binding2.rest();
                                    if (NIL != forts.fort_p(v_term3)) {
                                        final SubLObject item_var3 = v_term3;
                                        if (NIL == member(item_var3, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            terms = cons(item_var3, terms);
                                        }
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    binding2 = cdolist_list_var2.first();
                                } 
                                if (NIL != $cb_owl_export_inference_justification_termsP$.getDynamicValue(thread)) {
                                    cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                                    SubLObject justification2 = NIL;
                                    justification2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        final SubLObject supports2 = inference_datastructures_inference.inference_answer_justification_supports(justification2);
                                        SubLObject cdolist_list_var_$4;
                                        final SubLObject full_justification2 = cdolist_list_var_$4 = hl_supports.hl_justification_expand(supports2);
                                        SubLObject v_object2 = NIL;
                                        v_object2 = cdolist_list_var_$4.first();
                                        while (NIL != cdolist_list_var_$4) {
                                            if (NIL != assertion_handles.assertion_p(v_object2)) {
                                                v_object2 = assertions_high.assertion_formula(v_object2);
                                            }
                                            if (v_object2.isList()) {
                                                SubLObject cdolist_list_var_$5 = list_utilities.find_all_if(FORT_P, v_object2, UNPROVIDED);
                                                SubLObject v_term4 = NIL;
                                                v_term4 = cdolist_list_var_$5.first();
                                                while (NIL != cdolist_list_var_$5) {
                                                    final SubLObject item_var4 = v_term4;
                                                    if (NIL == member(item_var4, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        terms = cons(item_var4, terms);
                                                    }
                                                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                                    v_term4 = cdolist_list_var_$5.first();
                                                } 
                                            }
                                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                            v_object2 = cdolist_list_var_$4.first();
                                        } 
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        justification2 = cdolist_list_var2.first();
                                    } 
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
        }
        if (NIL != terms) {
            html_arghash.set_arghash_value($TYPE, arghash, $TERMS);
            html_arghash.set_arghash_value($TERMS_COUNT, arghash, length(terms));
            html_arghash.html_arghash_nl_fort_list_input_set_forts(arghash, $TERMS, html_arghash.arghash_fort_key_list(length(terms)), terms, generation_fn);
        }
        html_arghash.html_arghash_nl_fort_input_validate(arghash, $ONTOLOGY, debug, generation_fn, parse_fn, $$Ontology, UNPROVIDED);
        final SubLObject terms_count = (html_arghash.get_arghash_value($TERMS_COUNT, arghash).isInteger()) ? add(ONE_INTEGER, html_arghash.get_arghash_value($TERMS_COUNT, arghash)) : TWO_INTEGER;
        html_arghash.html_arghash_nl_fort_list_input_validate(arghash, $TERMS, html_arghash.arghash_fort_key_list(terms_count), debug, generation_fn, parse_fn, UNPROVIDED, UNPROVIDED);
        final SubLObject title_var = $$$Export_an_OWL_ontology;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str21$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str26$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_script_utilities.cb_hoverover_page_init();
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str32$cb_owl_export, T, UNPROVIDED);
                            cb_help_preamble($CB_CYCL_TO_OWL, NIL, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            cb_back_button($SELF, $$$Back);
                            html_indent(UNPROVIDED);
                            html_reset_input($$$Clear);
                            html_newline(UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str36$Choose_the_method_for_determining);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, $TYPE, $ONTOLOGY);
                            html_indent(UNPROVIDED);
                            html_princ($str37$Export_an_ontology_defined_in_Cyc);
                            html_newline(UNPROVIDED);
                            html_indent(UNPROVIDED);
                            final SubLObject requiredP = makeBoolean((NIL == initial_entryP) && ($ONTOLOGY == html_arghash.get_arghash_value($TYPE, arghash)));
                            html_arghash.html_arghash_nl_fort_input(arghash, $ONTOLOGY, debug, generation_fn, requiredP, T, $$Ontology);
                            html_newline(UNPROVIDED);
                            html_newline(ONE_INTEGER);
                            final SubLObject terms2 = html_arghash.get_arghash_value_list($TERMS, arghash);
                            final SubLObject min_required = ((NIL == initial_entryP) && ($TERMS == html_arghash.get_arghash_value($TYPE, arghash))) ? ONE_INTEGER : ZERO_INTEGER;
                            html_arghash.html_arghash_radio_input(arghash, $TYPE, $TERMS);
                            html_indent(UNPROVIDED);
                            html_princ($str38$Export_a_list_of_terms_);
                            html_arghash.html_arghash_hidden_input_force(arghash, $TERMS_COUNT, length(terms2), UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_arghash.html_arghash_nl_fort_list_input(arghash, $TERMS, html_arghash.arghash_fort_key_list(add(ONE_INTEGER, length(terms2))), debug, generation_fn, min_required, ONE_INTEGER, T, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str39$Choose_export_options_);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, $OVERRIDE_ONTOLOGY_MT, T, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ($$$Override_the_ontology_microtheory);
                            html_newline(ONE_INTEGER);
                            if ((NIL != html_arghash.get_arghash_value($OVERRIDE_ONTOLOGY_MT, arghash)) && (NIL == html_arghash.get_arghash_value($ONTOLOGY_MT, arghash))) {
                                html_indent(UNPROVIDED);
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str43$_2);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str44$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                errors_foundP = T;
                            } else {
                                html_indent(TWO_INTEGER);
                            }
                            html_arghash.html_arghash_nl_fort_input(arghash, $ONTOLOGY_MT, debug, generation_fn, NIL, T, $$Microtheory);
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, $OVERRIDE_ONTOLOGY_URI, T, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ($$$Override_the_ontology_URI);
                            html_newline(UNPROVIDED);
                            if ((NIL != html_arghash.get_arghash_value($OVERRIDE_ONTOLOGY_URI, arghash)) && (NIL != string_utilities.empty_string_p(html_arghash.get_arghash_value($ONTOLOGY_URI, arghash)))) {
                                html_indent(UNPROVIDED);
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str43$_2);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str44$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                errors_foundP = T;
                            } else {
                                html_indent(FOUR_INTEGER);
                            }
                            html_arghash.html_arghash_text_input(arghash, $ONTOLOGY_URI, $str49$, $int$40, $STRING);
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, $OVERRIDE_ONTOLOGY_BASE_URI, $DEFAULT);
                            html_indent(UNPROVIDED);
                            html_princ($str52$_Default__Use_the_ontology_Base_U);
                            cb_form($$baseNamespaceForSKS, UNPROVIDED, UNPROVIDED);
                            html_princ($str54$_assertion_);
                            html_newline(UNPROVIDED);
                            html_arghash.html_arghash_radio_input(arghash, $OVERRIDE_ONTOLOGY_BASE_URI, $CUSTOM);
                            html_indent(UNPROVIDED);
                            html_princ($$$Override_the_ontology_Base_URI);
                            html_newline(UNPROVIDED);
                            if (($CUSTOM == html_arghash.get_arghash_value($OVERRIDE_ONTOLOGY_BASE_URI, arghash)) && (NIL != string_utilities.empty_string_p(html_arghash.get_arghash_value($ONTOLOGY_BASE_URI, arghash)))) {
                                html_indent(UNPROVIDED);
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str43$_2);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str44$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                errors_foundP = T;
                            } else {
                                html_indent(FOUR_INTEGER);
                            }
                            html_arghash.html_arghash_text_input(arghash, $ONTOLOGY_BASE_URI, $str49$, $int$40, $STRING);
                            html_newline(UNPROVIDED);
                            html_arghash.html_arghash_radio_input(arghash, $OVERRIDE_ONTOLOGY_BASE_URI, $OPENCYC);
                            html_indent(UNPROVIDED);
                            html_princ($$$Use_OpenCyc_as_the_Base_URI);
                            html_newline(TWO_INTEGER);
                            html_princ($$$Add_these_URIs_as_);
                            cb_form($const61$owl_sameAs, UNPROVIDED, UNPROVIDED);
                            html_princ($str62$_triples_);
                            html_newline(UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, $SAME_AS_URIS, $OPENCYC, UNPROVIDED, UNPROVIDED);
                            html_princ($str64$_Readable_OpenCyc_URIs__when_appl);
                            html_newline(UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, $SAME_AS_URIS, $CYC, UNPROVIDED, UNPROVIDED);
                            html_princ($$$_Cyc_Compact_External_ID_URIs);
                            html_newline(UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, $SAME_AS_URIS, $DBPEDIA, UNPROVIDED, UNPROVIDED);
                            html_princ($str68$_DBpedia_URIs__when_applicable_);
                            html_newline(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_arghash.html_arghash_checkbox_input(arghash, $ADD_COMMENTS, T, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ($$$Add_);
                            cb_form($$comment, UNPROVIDED, UNPROVIDED);
                            html_princ($$$_triples);
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, $ADD_PRETTY_STRINGS, T, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ($$$Add_);
                            cb_form($$prettyString, UNPROVIDED, UNPROVIDED);
                            html_princ($$$_triples);
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, $ADD_PRETTY_STRING_CANONICAL, T, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ($$$Add_);
                            cb_form($$prettyString_Canonical, UNPROVIDED, UNPROVIDED);
                            html_princ($$$_triples);
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, $PREFER_URIS, $DEFAULT);
                            html_indent(UNPROVIDED);
                            html_princ($str77$_Default__Prefer_the_ontology_URI);
                            html_newline(UNPROVIDED);
                            html_arghash.html_arghash_radio_input(arghash, $PREFER_URIS, $SYNONYMOUS_EXTERNAL_CONCEPT);
                            html_indent(UNPROVIDED);
                            html_princ($$$Prefer_);
                            cb_form($$synonymousExternalConcept, UNPROVIDED, UNPROVIDED);
                            html_princ($$$_URIs_over_the_ontology_URIs);
                            html_newline(UNPROVIDED);
                            html_arghash.html_arghash_radio_input(arghash, $PREFER_URIS, $OPENCYC);
                            html_indent(UNPROVIDED);
                            html_princ($str82$Prefer_OpenCyc_URIs_over_the_onto);
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, $kw83$RESTRICT_CONTEXT_, T, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ($str84$Restrict_export_to_only_assertion);
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, $kw85$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_, T, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ($str86$Suppress_export_of_derived_knowle);
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, $LEGACY_EXPORT, T, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_princ($str88$Use_legacy_exporter__List_of_term);
                            html_newline(TWO_INTEGER);
                            if ((NIL == errors_foundP) && ((($ONTOLOGY == html_arghash.get_arghash_value($TYPE, arghash)) && (NIL != forts.fort_p(html_arghash.get_arghash_value($ONTOLOGY, arghash)))) || (($TERMS == html_arghash.get_arghash_value($TYPE, arghash)) && (NIL != list_utilities.sublisp_boolean(html_arghash.get_arghash_value_list($TERMS, arghash)))))) {
                                html_arghash.html_arghash_submit_input(arghash, $$$Rebuild_Export_Link, $EXPORT, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                cb_link($CB_OWL_EXPORT_XML, $$$Download_Export, arghash, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if ((NIL == initial_entryP) || (NIL != errors_foundP)) {
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str93$Please_fill_out_the_starred_field);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    html_newline(TWO_INTEGER);
                                    html_arghash.html_arghash_submit_input(arghash, $$$Retry_Get_Export_Link, $EXPORT, UNPROVIDED);
                                } else {
                                    html_arghash.html_arghash_submit_input(arghash, $$$Get_Export_Link, $EXPORT, UNPROVIDED);
                                }

                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_cb_owl_export_xml(final SubLObject linktext, final SubLObject arghash) {
        cb_owl_export_xml_link(arghash, linktext, $str96$cb_owl_export_xml);
        return NIL;
    }

    public static SubLObject cb_owl_export_xml_link(final SubLObject arghash, final SubLObject linktext, SubLObject initialization) {
        if (initialization == UNPROVIDED) {
            initialization = $str96$cb_owl_export_xml;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = NIL;
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ(html_arghash.html_arghash_href(arghash, initialization));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str98$window_open__);
        cyc_cgi_url_int();
        html_princ(html_arghash.html_arghash_href(arghash, initialization));
        format(html_macros.$html_stream$.getDynamicValue(thread), $str99$__);
        format(html_macros.$html_stream$.getDynamicValue(thread), $$$null);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str102$___A____, $str49$);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str103$return_false_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_princ(linktext);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_owl_export_xml(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        SubLObject exporter_options = NIL;
        if (NIL != html_arghash.get_arghash_value($PREFER_OPENCYC_URIS, arghash)) {
            exporter_options = putf(exporter_options, $PREFER_OPENCYC_URIS, html_arghash.get_arghash_value($PREFER_OPENCYC_URIS, arghash));
        }
        if (NIL != html_arghash.get_arghash_value_list($SAME_AS_URIS, arghash)) {
            exporter_options = putf(exporter_options, $SAME_AS_URIS, html_arghash.get_arghash_value_list($SAME_AS_URIS, arghash));
        }
        if (NIL != html_arghash.get_arghash_value($OVERRIDE_ONTOLOGY_MT, arghash)) {
            exporter_options = putf(exporter_options, $ONTOLOGY_MT, html_arghash.get_arghash_value($ONTOLOGY_MT, arghash));
        }
        if (NIL != html_arghash.get_arghash_value($OVERRIDE_ONTOLOGY_URI, arghash)) {
            exporter_options = putf(exporter_options, $ONTOLOGY_URI, html_arghash.get_arghash_value($ONTOLOGY_URI, arghash));
        }
        if ($OPENCYC == html_arghash.get_arghash_value($OVERRIDE_ONTOLOGY_BASE_URI, arghash)) {
            exporter_options = putf(exporter_options, $BASE_URI, $str106$http___sw_opencyc_org_2009_04_07_);
        }
        if ($CUSTOM == html_arghash.get_arghash_value($OVERRIDE_ONTOLOGY_BASE_URI, arghash)) {
            exporter_options = putf(exporter_options, $BASE_URI, html_arghash.get_arghash_value($ONTOLOGY_BASE_URI, arghash));
        }
        if (NIL != html_arghash.get_arghash_value($ADD_COMMENTS, arghash)) {
            exporter_options = putf(exporter_options, $ADD_COMMENTS, T);
        }
        if (NIL != html_arghash.get_arghash_value($ADD_PRETTY_STRINGS, arghash)) {
            exporter_options = putf(exporter_options, $ADD_PRETTY_STRINGS, T);
        }
        if (NIL != html_arghash.get_arghash_value($ADD_PRETTY_STRING_CANONICAL, arghash)) {
            exporter_options = putf(exporter_options, $ADD_PRETTY_STRING_CANONICAL, T);
        }
        exporter_options = putf(exporter_options, $PREFER_URIS, html_arghash.get_arghash_value($PREFER_URIS, arghash));
        if (NIL != html_arghash.get_arghash_value($kw83$RESTRICT_CONTEXT_, arghash)) {
            exporter_options = putf(exporter_options, $kw83$RESTRICT_CONTEXT_, T);
        }
        if (NIL != html_arghash.get_arghash_value($kw85$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_, arghash)) {
            exporter_options = putf(exporter_options, $kw85$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_, T);
        }
        if (($ONTOLOGY == html_arghash.get_arghash_value($TYPE, arghash)) && (NIL != forts.fort_p(html_arghash.get_arghash_value($ONTOLOGY, arghash)))) {
            owl_exporter2.owl_export_ontology_to_stream(html_arghash.get_arghash_value($ONTOLOGY, arghash), html_macros.$html_stream$.getDynamicValue(thread), exporter_options);
        } else
            if (($TERMS == html_arghash.get_arghash_value($TYPE, arghash)) && (NIL != list_utilities.sublisp_boolean(html_arghash.get_arghash_value_list($TERMS, arghash)))) {
                if (NIL != html_arghash.get_arghash_value($LEGACY_EXPORT, arghash)) {
                    owl_cycl_to_xml.owl_export_terms(html_arghash.get_arghash_value_list($TERMS, arghash), html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                } else {
                    owl_exporter2.owl_export_terms_to_stream(html_arghash.get_arghash_value_list($TERMS, arghash), html_macros.$html_stream$.getDynamicValue(thread), exporter_options);
                }
            }

        return NIL;
    }

    public static SubLObject cb_link_cb_owl_export_inference_answers(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            linktext = $str109$_OWL_Export_;
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject arghash = html_arghash.arglist_to_arghash(list(list($str111$__store_id, format_nil.format_nil_a(inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(inference)))), list($str112$__inference_id, format_nil.format_nil_a(inference_datastructures_inference.inference_suid(inference)))));
        final SubLObject url = html_arghash.html_arghash_href(arghash, $str32$cb_owl_export);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ(url);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject declare_cb_cycl_to_owl_file() {
        declareFunction("cb_owl_export", "CB-OWL-EXPORT", 0, 1, false);
        declareFunction("cb_owl_export_internal", "CB-OWL-EXPORT-INTERNAL", 1, 0, false);
        declareFunction("cb_link_cb_owl_export_xml", "CB-LINK-CB-OWL-EXPORT-XML", 2, 0, false);
        declareFunction("cb_owl_export_xml_link", "CB-OWL-EXPORT-XML-LINK", 2, 1, false);
        declareFunction("cb_owl_export_xml", "CB-OWL-EXPORT-XML", 1, 0, false);
        declareFunction("cb_link_cb_owl_export_inference_answers", "CB-LINK-CB-OWL-EXPORT-INFERENCE-ANSWERS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_cb_cycl_to_owl_file() {
        defparameter("*CB-OWL-EXPORT-INFERENCE-JUSTIFICATION-TERMS?*", T);
        return NIL;
    }

    public static SubLObject setup_cb_cycl_to_owl_file() {
        sethash($CB_CYCL_TO_OWL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str1$cb_cycl_to_owl_html, NIL));
        html_macros.note_cgi_handler_function(CB_OWL_EXPORT, $HTML_HANDLER);
        setup_cb_link_method($CB_OWL_EXPORT_XML, CB_LINK_CB_OWL_EXPORT_XML, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_OWL_EXPORT_XML, $XML_HANDLER);
        setup_cb_link_method($CB_OWL_EXPORT_INFERENCE_ANSWERS, CB_LINK_CB_OWL_EXPORT_INFERENCE_ANSWERS, TWO_INTEGER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_cycl_to_owl_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_cycl_to_owl_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_cycl_to_owl_file();
    }

    static {





















































































































    }
}

/**
 * Total time: 864 ms
 */
