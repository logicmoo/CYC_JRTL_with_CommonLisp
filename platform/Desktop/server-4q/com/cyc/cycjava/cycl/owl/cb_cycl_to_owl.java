package com.cyc.cycjava.cycl.owl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.html_arghash;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_cycl_to_owl extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.owl.cb_cycl_to_owl";
    public static final String myFingerPrint = "5b8f42c4887d30956244a867a1cb2c84d24315cc1267fed1296d5a450de0b915";
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-cycl-to-owl.lisp", position = 1078L)
    private static SubLSymbol $cb_owl_export_inference_justification_termsP$;
    private static final SubLSymbol $kw0$CB_CYCL_TO_OWL;
    private static final SubLString $str1$cb_cycl_to_owl_html;
    private static final SubLString $str2$OWL_Exporter;
    private static final SubLSymbol $sym3$CB_OWL_EXPORT;
    private static final SubLSymbol $kw4$HTML_HANDLER;
    private static final SubLSymbol $sym5$FORT_TO_STRING;
    private static final SubLSymbol $sym6$TERMS_FOR_BROWSING;
    private static final SubLSymbol $kw7$TYPE;
    private static final SubLSymbol $kw8$ONTOLOGY;
    private static final SubLSymbol $kw9$PREFER_URIS;
    private static final SubLSymbol $kw10$DEFAULT;
    private static final SubLSymbol $kw11$OVERRIDE_ONTOLOGY_BASE_URI;
    private static final SubLSymbol $kw12$STORE_ID;
    private static final SubLSymbol $kw13$INFERENCE_ID;
    private static final SubLSymbol $kw14$SKIP;
    private static final SubLSymbol $sym15$FORT_P;
    private static final SubLSymbol $kw16$TERMS;
    private static final SubLSymbol $kw17$TERMS_COUNT;
    private static final SubLObject $const18$Ontology;
    private static final SubLString $str19$Export_an_OWL_ontology;
    private static final SubLString $str20$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str21$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw22$UNINITIALIZED;
    private static final SubLSymbol $kw23$CB_CYC;
    private static final SubLSymbol $kw24$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw25$SHA1;
    private static final SubLString $str26$yui_skin_sam;
    private static final SubLString $str27$reloadFrameButton;
    private static final SubLString $str28$button;
    private static final SubLString $str29$reload;
    private static final SubLString $str30$Refresh_Frames;
    private static final SubLString $str31$post;
    private static final SubLString $str32$cb_owl_export;
    private static final SubLSymbol $kw33$SELF;
    private static final SubLString $str34$Back;
    private static final SubLString $str35$Clear;
    private static final SubLString $str36$Choose_the_method_for_determining;
    private static final SubLString $str37$Export_an_ontology_defined_in_Cyc;
    private static final SubLString $str38$Export_a_list_of_terms_;
    private static final SubLString $str39$Choose_export_options_;
    private static final SubLSymbol $kw40$OVERRIDE_ONTOLOGY_MT;
    private static final SubLString $str41$Override_the_ontology_microtheory;
    private static final SubLSymbol $kw42$ONTOLOGY_MT;
    private static final SubLString $str43$_2;
    private static final SubLString $str44$_;
    private static final SubLObject $const45$Microtheory;
    private static final SubLSymbol $kw46$OVERRIDE_ONTOLOGY_URI;
    private static final SubLString $str47$Override_the_ontology_URI;
    private static final SubLSymbol $kw48$ONTOLOGY_URI;
    private static final SubLString $str49$;
    private static final SubLInteger $int50$40;
    private static final SubLSymbol $kw51$STRING;
    private static final SubLString $str52$_Default__Use_the_ontology_Base_U;
    private static final SubLObject $const53$baseNamespaceForSKS;
    private static final SubLString $str54$_assertion_;
    private static final SubLSymbol $kw55$CUSTOM;
    private static final SubLString $str56$Override_the_ontology_Base_URI;
    private static final SubLSymbol $kw57$ONTOLOGY_BASE_URI;
    private static final SubLSymbol $kw58$OPENCYC;
    private static final SubLString $str59$Use_OpenCyc_as_the_Base_URI;
    private static final SubLString $str60$Add_these_URIs_as_;
    private static final SubLObject $const61$owl_sameAs;
    private static final SubLString $str62$_triples_;
    private static final SubLSymbol $kw63$SAME_AS_URIS;
    private static final SubLString $str64$_Readable_OpenCyc_URIs__when_appl;
    private static final SubLSymbol $kw65$CYC;
    private static final SubLString $str66$_Cyc_Compact_External_ID_URIs;
    private static final SubLSymbol $kw67$DBPEDIA;
    private static final SubLString $str68$_DBpedia_URIs__when_applicable_;
    private static final SubLSymbol $kw69$ADD_COMMENTS;
    private static final SubLString $str70$Add_;
    private static final SubLObject $const71$comment;
    private static final SubLString $str72$_triples;
    private static final SubLSymbol $kw73$ADD_PRETTY_STRINGS;
    private static final SubLObject $const74$prettyString;
    private static final SubLSymbol $kw75$ADD_PRETTY_STRING_CANONICAL;
    private static final SubLObject $const76$prettyString_Canonical;
    private static final SubLString $str77$_Default__Prefer_the_ontology_URI;
    private static final SubLSymbol $kw78$SYNONYMOUS_EXTERNAL_CONCEPT;
    private static final SubLString $str79$Prefer_;
    private static final SubLObject $const80$synonymousExternalConcept;
    private static final SubLString $str81$_URIs_over_the_ontology_URIs;
    private static final SubLString $str82$Prefer_OpenCyc_URIs_over_the_onto;
    private static final SubLSymbol $kw83$RESTRICT_CONTEXT_;
    private static final SubLString $str84$Restrict_export_to_only_assertion;
    private static final SubLSymbol $kw85$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_;
    private static final SubLString $str86$Suppress_export_of_derived_knowle;
    private static final SubLSymbol $kw87$LEGACY_EXPORT;
    private static final SubLString $str88$Use_legacy_exporter__List_of_term;
    private static final SubLString $str89$Rebuild_Export_Link;
    private static final SubLSymbol $kw90$EXPORT;
    private static final SubLSymbol $kw91$CB_OWL_EXPORT_XML;
    private static final SubLString $str92$Download_Export;
    private static final SubLString $str93$Please_fill_out_the_starred_field;
    private static final SubLString $str94$Retry_Get_Export_Link;
    private static final SubLString $str95$Get_Export_Link;
    private static final SubLString $str96$cb_owl_export_xml;
    private static final SubLSymbol $sym97$CB_LINK_CB_OWL_EXPORT_XML;
    private static final SubLString $str98$window_open__;
    private static final SubLString $str99$__;
    private static final SubLString $str100$__A_;
    private static final SubLString $str101$null;
    private static final SubLString $str102$___A____;
    private static final SubLString $str103$return_false_;
    private static final SubLSymbol $kw104$PREFER_OPENCYC_URIS;
    private static final SubLSymbol $kw105$BASE_URI;
    private static final SubLString $str106$http___sw_opencyc_org_2009_04_07_;
    private static final SubLSymbol $sym107$CB_OWL_EXPORT_XML;
    private static final SubLSymbol $kw108$XML_HANDLER;
    private static final SubLString $str109$_OWL_Export_;
    private static final SubLSymbol $sym110$INFERENCE_P;
    private static final SubLString $str111$__store_id;
    private static final SubLString $str112$__inference_id;
    private static final SubLSymbol $kw113$CB_OWL_EXPORT_INFERENCE_ANSWERS;
    private static final SubLSymbol $sym114$CB_LINK_CB_OWL_EXPORT_INFERENCE_ANSWERS;
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-cycl-to-owl.lisp", position = 898L)
    public static SubLObject cb_owl_export(SubLObject args) {
        if (args == cb_cycl_to_owl.UNPROVIDED) {
            args = (SubLObject)cb_cycl_to_owl.NIL;
        }
        if (cb_cycl_to_owl.NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn((SubLObject)cb_cycl_to_owl.$str2$OWL_Exporter);
        }
        return cb_owl_export_internal(html_arghash.arglist_to_arghash(args));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-cycl-to-owl.lisp", position = 1151L)
    public static SubLObject cb_owl_export_internal(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject debug = (SubLObject)cb_cycl_to_owl.NIL;
        final SubLObject generation_fn = Symbols.symbol_function((SubLObject)cb_cycl_to_owl.$sym5$FORT_TO_STRING);
        final SubLObject parse_fn = Symbols.symbol_function((SubLObject)cb_cycl_to_owl.$sym6$TERMS_FOR_BROWSING);
        SubLObject initial_entryP = (SubLObject)cb_cycl_to_owl.NIL;
        SubLObject errors_foundP = (SubLObject)cb_cycl_to_owl.NIL;
        if (cb_cycl_to_owl.NIL == html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw7$TYPE, arghash)) {
            initial_entryP = (SubLObject)cb_cycl_to_owl.T;
            html_arghash.set_arghash_value((SubLObject)cb_cycl_to_owl.$kw7$TYPE, arghash, (SubLObject)cb_cycl_to_owl.$kw8$ONTOLOGY);
            html_arghash.set_arghash_value((SubLObject)cb_cycl_to_owl.$kw9$PREFER_URIS, arghash, (SubLObject)cb_cycl_to_owl.$kw10$DEFAULT);
            html_arghash.set_arghash_value((SubLObject)cb_cycl_to_owl.$kw11$OVERRIDE_ONTOLOGY_BASE_URI, arghash, (SubLObject)cb_cycl_to_owl.$kw10$DEFAULT);
        }
        final SubLObject store_id = html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw12$STORE_ID, arghash);
        final SubLObject inference_id = html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw13$INFERENCE_ID, arghash);
        SubLObject terms = (SubLObject)cb_cycl_to_owl.NIL;
        if (store_id.isInteger() && inference_id.isInteger()) {
            final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(store_id, inference_id);
            if (cb_cycl_to_owl.NIL != inference_datastructures_inference.inference_p(inference)) {
                final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                if (cb_cycl_to_owl.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)cb_cycl_to_owl.$kw14$SKIP)) {
                    final SubLObject idx_$1 = idx;
                    if (cb_cycl_to_owl.NIL == id_index.id_index_dense_objects_empty_p(idx_$1, (SubLObject)cb_cycl_to_owl.$kw14$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                        final SubLObject backwardP_var = (SubLObject)cb_cycl_to_owl.NIL;
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
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_cycl_to_owl.NIL, v_iteration = (SubLObject)cb_cycl_to_owl.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_cycl_to_owl.ONE_INTEGER)) {
                            id = ((cb_cycl_to_owl.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_cycl_to_owl.ONE_INTEGER) : v_iteration);
                            v_answer = Vectors.aref(vector_var, id);
                            if (cb_cycl_to_owl.NIL == id_index.id_index_tombstone_p(v_answer) || cb_cycl_to_owl.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_cycl_to_owl.$kw14$SKIP)) {
                                if (cb_cycl_to_owl.NIL != id_index.id_index_tombstone_p(v_answer)) {
                                    v_answer = (SubLObject)cb_cycl_to_owl.$kw14$SKIP;
                                }
                                cdolist_list_var = inference_datastructures_inference.inference_answer_bindings(v_answer);
                                binding = (SubLObject)cb_cycl_to_owl.NIL;
                                binding = cdolist_list_var.first();
                                while (cb_cycl_to_owl.NIL != cdolist_list_var) {
                                    v_term = binding.rest();
                                    if (cb_cycl_to_owl.NIL != forts.fort_p(v_term)) {
                                        item_var = v_term;
                                        if (cb_cycl_to_owl.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)cb_cycl_to_owl.EQL), Symbols.symbol_function((SubLObject)cb_cycl_to_owl.IDENTITY))) {
                                            terms = (SubLObject)ConsesLow.cons(item_var, terms);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    binding = cdolist_list_var.first();
                                }
                                if (cb_cycl_to_owl.NIL != cb_cycl_to_owl.$cb_owl_export_inference_justification_termsP$.getDynamicValue(thread)) {
                                    cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                    justification = (SubLObject)cb_cycl_to_owl.NIL;
                                    justification = cdolist_list_var.first();
                                    while (cb_cycl_to_owl.NIL != cdolist_list_var) {
                                        supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                                        full_justification = (cdolist_list_var_$2 = hl_supports.hl_justification_expand(supports));
                                        v_object = (SubLObject)cb_cycl_to_owl.NIL;
                                        v_object = cdolist_list_var_$2.first();
                                        while (cb_cycl_to_owl.NIL != cdolist_list_var_$2) {
                                            if (cb_cycl_to_owl.NIL != assertion_handles.assertion_p(v_object)) {
                                                v_object = assertions_high.assertion_formula(v_object);
                                            }
                                            if (v_object.isList()) {
                                                cdolist_list_var_$3 = list_utilities.find_all_if((SubLObject)cb_cycl_to_owl.$sym15$FORT_P, v_object, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                                v_term2 = (SubLObject)cb_cycl_to_owl.NIL;
                                                v_term2 = cdolist_list_var_$3.first();
                                                while (cb_cycl_to_owl.NIL != cdolist_list_var_$3) {
                                                    item_var2 = v_term2;
                                                    if (cb_cycl_to_owl.NIL == conses_high.member(item_var2, terms, Symbols.symbol_function((SubLObject)cb_cycl_to_owl.EQL), Symbols.symbol_function((SubLObject)cb_cycl_to_owl.IDENTITY))) {
                                                        terms = (SubLObject)ConsesLow.cons(item_var2, terms);
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
                    if (cb_cycl_to_owl.NIL == id_index.id_index_sparse_objects_empty_p(idx_$2)) {
                        final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$2);
                        SubLObject id2 = (SubLObject)cb_cycl_to_owl.NIL;
                        SubLObject v_answer2 = (SubLObject)cb_cycl_to_owl.NIL;
                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                id2 = Hashtables.getEntryKey(cdohash_entry);
                                v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                                SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_bindings(v_answer2);
                                SubLObject binding2 = (SubLObject)cb_cycl_to_owl.NIL;
                                binding2 = cdolist_list_var2.first();
                                while (cb_cycl_to_owl.NIL != cdolist_list_var2) {
                                    final SubLObject v_term3 = binding2.rest();
                                    if (cb_cycl_to_owl.NIL != forts.fort_p(v_term3)) {
                                        final SubLObject item_var3 = v_term3;
                                        if (cb_cycl_to_owl.NIL == conses_high.member(item_var3, terms, Symbols.symbol_function((SubLObject)cb_cycl_to_owl.EQL), Symbols.symbol_function((SubLObject)cb_cycl_to_owl.IDENTITY))) {
                                            terms = (SubLObject)ConsesLow.cons(item_var3, terms);
                                        }
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    binding2 = cdolist_list_var2.first();
                                }
                                if (cb_cycl_to_owl.NIL != cb_cycl_to_owl.$cb_owl_export_inference_justification_termsP$.getDynamicValue(thread)) {
                                    cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                                    SubLObject justification2 = (SubLObject)cb_cycl_to_owl.NIL;
                                    justification2 = cdolist_list_var2.first();
                                    while (cb_cycl_to_owl.NIL != cdolist_list_var2) {
                                        final SubLObject supports2 = inference_datastructures_inference.inference_answer_justification_supports(justification2);
                                        SubLObject cdolist_list_var_$4;
                                        final SubLObject full_justification2 = cdolist_list_var_$4 = hl_supports.hl_justification_expand(supports2);
                                        SubLObject v_object2 = (SubLObject)cb_cycl_to_owl.NIL;
                                        v_object2 = cdolist_list_var_$4.first();
                                        while (cb_cycl_to_owl.NIL != cdolist_list_var_$4) {
                                            if (cb_cycl_to_owl.NIL != assertion_handles.assertion_p(v_object2)) {
                                                v_object2 = assertions_high.assertion_formula(v_object2);
                                            }
                                            if (v_object2.isList()) {
                                                SubLObject cdolist_list_var_$5 = list_utilities.find_all_if((SubLObject)cb_cycl_to_owl.$sym15$FORT_P, v_object2, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                                SubLObject v_term4 = (SubLObject)cb_cycl_to_owl.NIL;
                                                v_term4 = cdolist_list_var_$5.first();
                                                while (cb_cycl_to_owl.NIL != cdolist_list_var_$5) {
                                                    final SubLObject item_var4 = v_term4;
                                                    if (cb_cycl_to_owl.NIL == conses_high.member(item_var4, terms, Symbols.symbol_function((SubLObject)cb_cycl_to_owl.EQL), Symbols.symbol_function((SubLObject)cb_cycl_to_owl.IDENTITY))) {
                                                        terms = (SubLObject)ConsesLow.cons(item_var4, terms);
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
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
        }
        if (cb_cycl_to_owl.NIL != terms) {
            html_arghash.set_arghash_value((SubLObject)cb_cycl_to_owl.$kw7$TYPE, arghash, (SubLObject)cb_cycl_to_owl.$kw16$TERMS);
            html_arghash.set_arghash_value((SubLObject)cb_cycl_to_owl.$kw17$TERMS_COUNT, arghash, Sequences.length(terms));
            html_arghash.html_arghash_nl_fort_list_input_set_forts(arghash, (SubLObject)cb_cycl_to_owl.$kw16$TERMS, html_arghash.arghash_fort_key_list(Sequences.length(terms)), terms, generation_fn);
        }
        html_arghash.html_arghash_nl_fort_input_validate(arghash, (SubLObject)cb_cycl_to_owl.$kw8$ONTOLOGY, debug, generation_fn, parse_fn, cb_cycl_to_owl.$const18$Ontology, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        final SubLObject terms_count = (SubLObject)(html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw17$TERMS_COUNT, arghash).isInteger() ? Numbers.add((SubLObject)cb_cycl_to_owl.ONE_INTEGER, html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw17$TERMS_COUNT, arghash)) : cb_cycl_to_owl.TWO_INTEGER);
        html_arghash.html_arghash_nl_fort_list_input_validate(arghash, (SubLObject)cb_cycl_to_owl.$kw16$TERMS, html_arghash.arghash_fort_key_list(terms_count), debug, generation_fn, parse_fn, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        final SubLObject title_var = (SubLObject)cb_cycl_to_owl.$str19$Export_an_OWL_ontology;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_cycl_to_owl.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_cycl_to_owl.$str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_cycl_to_owl.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_cycl_to_owl.$str21$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_cycl_to_owl.UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_cycl_to_owl.$kw22$UNINITIALIZED) ? ConsesLow.list(cb_cycl_to_owl.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_cycl_to_owl.$kw23$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_cycl_to_owl.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_cycl_to_owl.$kw24$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_cycl_to_owl.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_cycl_to_owl.$str26$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_cycl_to_owl.$str27$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_cycl_to_owl.$str28$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_cycl_to_owl.$str29$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str30$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            if (cb_cycl_to_owl.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_cycl_to_owl.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        }
                        html_script_utilities.cb_hoverover_page_init();
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_cycl_to_owl.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_cycl_to_owl.$str31$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        if (cb_cycl_to_owl.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_cycl_to_owl.$str32$cb_owl_export, (SubLObject)cb_cycl_to_owl.T, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_cycl_to_owl.$kw0$CB_CYCL_TO_OWL, (SubLObject)cb_cycl_to_owl.NIL, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            cb_utilities.cb_back_button((SubLObject)cb_cycl_to_owl.$kw33$SELF, (SubLObject)cb_cycl_to_owl.$str34$Back);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_cycl_to_owl.$str35$Clear);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str36$Choose_the_method_for_determining);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_cycl_to_owl.$kw7$TYPE, (SubLObject)cb_cycl_to_owl.$kw8$ONTOLOGY);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str37$Export_an_ontology_defined_in_Cyc);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            final SubLObject requiredP = (SubLObject)SubLObjectFactory.makeBoolean(cb_cycl_to_owl.NIL == initial_entryP && cb_cycl_to_owl.$kw8$ONTOLOGY == html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw7$TYPE, arghash));
                            html_arghash.html_arghash_nl_fort_input(arghash, (SubLObject)cb_cycl_to_owl.$kw8$ONTOLOGY, debug, generation_fn, requiredP, (SubLObject)cb_cycl_to_owl.T, cb_cycl_to_owl.$const18$Ontology);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.ONE_INTEGER);
                            final SubLObject terms2 = html_arghash.get_arghash_value_list((SubLObject)cb_cycl_to_owl.$kw16$TERMS, arghash);
                            final SubLObject min_required = (SubLObject)((cb_cycl_to_owl.NIL == initial_entryP && cb_cycl_to_owl.$kw16$TERMS == html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw7$TYPE, arghash)) ? cb_cycl_to_owl.ONE_INTEGER : cb_cycl_to_owl.ZERO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_cycl_to_owl.$kw7$TYPE, (SubLObject)cb_cycl_to_owl.$kw16$TERMS);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str38$Export_a_list_of_terms_);
                            html_arghash.html_arghash_hidden_input_force(arghash, (SubLObject)cb_cycl_to_owl.$kw17$TERMS_COUNT, Sequences.length(terms2), (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_arghash.html_arghash_nl_fort_list_input(arghash, (SubLObject)cb_cycl_to_owl.$kw16$TERMS, html_arghash.arghash_fort_key_list(Numbers.add((SubLObject)cb_cycl_to_owl.ONE_INTEGER, Sequences.length(terms2))), debug, generation_fn, min_required, (SubLObject)cb_cycl_to_owl.ONE_INTEGER, (SubLObject)cb_cycl_to_owl.T, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str39$Choose_export_options_);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_cycl_to_owl.$kw40$OVERRIDE_ONTOLOGY_MT, (SubLObject)cb_cycl_to_owl.T, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str41$Override_the_ontology_microtheory);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.ONE_INTEGER);
                            if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw40$OVERRIDE_ONTOLOGY_MT, arghash) && cb_cycl_to_owl.NIL == html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw42$ONTOLOGY_MT, arghash)) {
                                html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_cycl_to_owl.$str43$_2);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_cycl_to_owl.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str44$_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                errors_foundP = (SubLObject)cb_cycl_to_owl.T;
                            }
                            else {
                                html_utilities.html_indent((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            }
                            html_arghash.html_arghash_nl_fort_input(arghash, (SubLObject)cb_cycl_to_owl.$kw42$ONTOLOGY_MT, debug, generation_fn, (SubLObject)cb_cycl_to_owl.NIL, (SubLObject)cb_cycl_to_owl.T, cb_cycl_to_owl.$const45$Microtheory);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_cycl_to_owl.$kw46$OVERRIDE_ONTOLOGY_URI, (SubLObject)cb_cycl_to_owl.T, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str47$Override_the_ontology_URI);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw46$OVERRIDE_ONTOLOGY_URI, arghash) && cb_cycl_to_owl.NIL != string_utilities.empty_string_p(html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw48$ONTOLOGY_URI, arghash))) {
                                html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_cycl_to_owl.$str43$_2);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_cycl_to_owl.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str44$_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                errors_foundP = (SubLObject)cb_cycl_to_owl.T;
                            }
                            else {
                                html_utilities.html_indent((SubLObject)cb_cycl_to_owl.FOUR_INTEGER);
                            }
                            html_arghash.html_arghash_text_input(arghash, (SubLObject)cb_cycl_to_owl.$kw48$ONTOLOGY_URI, (SubLObject)cb_cycl_to_owl.$str49$, (SubLObject)cb_cycl_to_owl.$int50$40, (SubLObject)cb_cycl_to_owl.$kw51$STRING);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_cycl_to_owl.$kw11$OVERRIDE_ONTOLOGY_BASE_URI, (SubLObject)cb_cycl_to_owl.$kw10$DEFAULT);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str52$_Default__Use_the_ontology_Base_U);
                            cb_utilities.cb_form(cb_cycl_to_owl.$const53$baseNamespaceForSKS, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str54$_assertion_);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_cycl_to_owl.$kw11$OVERRIDE_ONTOLOGY_BASE_URI, (SubLObject)cb_cycl_to_owl.$kw55$CUSTOM);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str56$Override_the_ontology_Base_URI);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            if (cb_cycl_to_owl.$kw55$CUSTOM == html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw11$OVERRIDE_ONTOLOGY_BASE_URI, arghash) && cb_cycl_to_owl.NIL != string_utilities.empty_string_p(html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw57$ONTOLOGY_BASE_URI, arghash))) {
                                html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_cycl_to_owl.$str43$_2);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_cycl_to_owl.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str44$_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                errors_foundP = (SubLObject)cb_cycl_to_owl.T;
                            }
                            else {
                                html_utilities.html_indent((SubLObject)cb_cycl_to_owl.FOUR_INTEGER);
                            }
                            html_arghash.html_arghash_text_input(arghash, (SubLObject)cb_cycl_to_owl.$kw57$ONTOLOGY_BASE_URI, (SubLObject)cb_cycl_to_owl.$str49$, (SubLObject)cb_cycl_to_owl.$int50$40, (SubLObject)cb_cycl_to_owl.$kw51$STRING);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_cycl_to_owl.$kw11$OVERRIDE_ONTOLOGY_BASE_URI, (SubLObject)cb_cycl_to_owl.$kw58$OPENCYC);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str59$Use_OpenCyc_as_the_Base_URI);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str60$Add_these_URIs_as_);
                            cb_utilities.cb_form(cb_cycl_to_owl.$const61$owl_sameAs, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str62$_triples_);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_cycl_to_owl.$kw63$SAME_AS_URIS, (SubLObject)cb_cycl_to_owl.$kw58$OPENCYC, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str64$_Readable_OpenCyc_URIs__when_appl);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_cycl_to_owl.$kw63$SAME_AS_URIS, (SubLObject)cb_cycl_to_owl.$kw65$CYC, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str66$_Cyc_Compact_External_ID_URIs);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_cycl_to_owl.$kw63$SAME_AS_URIS, (SubLObject)cb_cycl_to_owl.$kw67$DBPEDIA, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str68$_DBpedia_URIs__when_applicable_);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_cycl_to_owl.$kw69$ADD_COMMENTS, (SubLObject)cb_cycl_to_owl.T, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str70$Add_);
                            cb_utilities.cb_form(cb_cycl_to_owl.$const71$comment, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str72$_triples);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_cycl_to_owl.$kw73$ADD_PRETTY_STRINGS, (SubLObject)cb_cycl_to_owl.T, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str70$Add_);
                            cb_utilities.cb_form(cb_cycl_to_owl.$const74$prettyString, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str72$_triples);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_cycl_to_owl.$kw75$ADD_PRETTY_STRING_CANONICAL, (SubLObject)cb_cycl_to_owl.T, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str70$Add_);
                            cb_utilities.cb_form(cb_cycl_to_owl.$const76$prettyString_Canonical, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str72$_triples);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_cycl_to_owl.$kw9$PREFER_URIS, (SubLObject)cb_cycl_to_owl.$kw10$DEFAULT);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str77$_Default__Prefer_the_ontology_URI);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_cycl_to_owl.$kw9$PREFER_URIS, (SubLObject)cb_cycl_to_owl.$kw78$SYNONYMOUS_EXTERNAL_CONCEPT);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str79$Prefer_);
                            cb_utilities.cb_form(cb_cycl_to_owl.$const80$synonymousExternalConcept, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str81$_URIs_over_the_ontology_URIs);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_cycl_to_owl.$kw9$PREFER_URIS, (SubLObject)cb_cycl_to_owl.$kw58$OPENCYC);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str82$Prefer_OpenCyc_URIs_over_the_onto);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_cycl_to_owl.$kw83$RESTRICT_CONTEXT_, (SubLObject)cb_cycl_to_owl.T, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str84$Restrict_export_to_only_assertion);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_cycl_to_owl.$kw85$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_, (SubLObject)cb_cycl_to_owl.T, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str86$Suppress_export_of_derived_knowle);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_cycl_to_owl.$kw87$LEGACY_EXPORT, (SubLObject)cb_cycl_to_owl.T, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str88$Use_legacy_exporter__List_of_term);
                            html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                            if (cb_cycl_to_owl.NIL == errors_foundP && ((cb_cycl_to_owl.$kw8$ONTOLOGY == html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw7$TYPE, arghash) && cb_cycl_to_owl.NIL != forts.fort_p(html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw8$ONTOLOGY, arghash))) || (cb_cycl_to_owl.$kw16$TERMS == html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw7$TYPE, arghash) && cb_cycl_to_owl.NIL != list_utilities.sublisp_boolean(html_arghash.get_arghash_value_list((SubLObject)cb_cycl_to_owl.$kw16$TERMS, arghash))))) {
                                html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_cycl_to_owl.$str89$Rebuild_Export_Link, (SubLObject)cb_cycl_to_owl.$kw90$EXPORT, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                                cb_utilities.cb_link((SubLObject)cb_cycl_to_owl.$kw91$CB_OWL_EXPORT_XML, (SubLObject)cb_cycl_to_owl.$str92$Download_Export, arghash, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            }
                            else if (cb_cycl_to_owl.NIL == initial_entryP || cb_cycl_to_owl.NIL != errors_foundP) {
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_cycl_to_owl.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_cycl_to_owl.$str93$Please_fill_out_the_starred_field);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_cycl_to_owl.TWO_INTEGER);
                                html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_cycl_to_owl.$str94$Retry_Get_Export_Link, (SubLObject)cb_cycl_to_owl.$kw90$EXPORT, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            }
                            else {
                                html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_cycl_to_owl.$str95$Get_Export_Link, (SubLObject)cb_cycl_to_owl.$kw90$EXPORT, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_cycl_to_owl.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_cycl_to_owl.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_cycl_to_owl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-cycl-to-owl.lisp", position = 11221L)
    public static SubLObject cb_link_cb_owl_export_xml(final SubLObject linktext, final SubLObject arghash) {
        cb_owl_export_xml_link(arghash, linktext, (SubLObject)cb_cycl_to_owl.$str96$cb_owl_export_xml);
        return (SubLObject)cb_cycl_to_owl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-cycl-to-owl.lisp", position = 11442L)
    public static SubLObject cb_owl_export_xml_link(final SubLObject arghash, final SubLObject linktext, SubLObject initialization) {
        if (initialization == cb_cycl_to_owl.UNPROVIDED) {
            initialization = (SubLObject)cb_cycl_to_owl.$str96$cb_owl_export_xml;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = (SubLObject)cb_cycl_to_owl.NIL;
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ(html_arghash.html_arghash_href(arghash, initialization));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        if (cb_cycl_to_owl.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_cycl_to_owl.$str98$window_open__);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ(html_arghash.html_arghash_href(arghash, initialization));
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_cycl_to_owl.$str99$__);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_cycl_to_owl.$str101$null);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_cycl_to_owl.$str102$___A____, (SubLObject)cb_cycl_to_owl.$str49$);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_cycl_to_owl.$str103$return_false_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_princ(linktext);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_cycl_to_owl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-cycl-to-owl.lisp", position = 11683L)
    public static SubLObject cb_owl_export_xml(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        SubLObject exporter_options = (SubLObject)cb_cycl_to_owl.NIL;
        if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw104$PREFER_OPENCYC_URIS, arghash)) {
            exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw104$PREFER_OPENCYC_URIS, html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw104$PREFER_OPENCYC_URIS, arghash));
        }
        if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value_list((SubLObject)cb_cycl_to_owl.$kw63$SAME_AS_URIS, arghash)) {
            exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw63$SAME_AS_URIS, html_arghash.get_arghash_value_list((SubLObject)cb_cycl_to_owl.$kw63$SAME_AS_URIS, arghash));
        }
        if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw40$OVERRIDE_ONTOLOGY_MT, arghash)) {
            exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw42$ONTOLOGY_MT, html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw42$ONTOLOGY_MT, arghash));
        }
        if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw46$OVERRIDE_ONTOLOGY_URI, arghash)) {
            exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw48$ONTOLOGY_URI, html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw48$ONTOLOGY_URI, arghash));
        }
        if (cb_cycl_to_owl.$kw58$OPENCYC == html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw11$OVERRIDE_ONTOLOGY_BASE_URI, arghash)) {
            exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw105$BASE_URI, (SubLObject)cb_cycl_to_owl.$str106$http___sw_opencyc_org_2009_04_07_);
        }
        if (cb_cycl_to_owl.$kw55$CUSTOM == html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw11$OVERRIDE_ONTOLOGY_BASE_URI, arghash)) {
            exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw105$BASE_URI, html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw57$ONTOLOGY_BASE_URI, arghash));
        }
        if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw69$ADD_COMMENTS, arghash)) {
            exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw69$ADD_COMMENTS, (SubLObject)cb_cycl_to_owl.T);
        }
        if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw73$ADD_PRETTY_STRINGS, arghash)) {
            exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw73$ADD_PRETTY_STRINGS, (SubLObject)cb_cycl_to_owl.T);
        }
        if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw75$ADD_PRETTY_STRING_CANONICAL, arghash)) {
            exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw75$ADD_PRETTY_STRING_CANONICAL, (SubLObject)cb_cycl_to_owl.T);
        }
        exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw9$PREFER_URIS, html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw9$PREFER_URIS, arghash));
        if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw83$RESTRICT_CONTEXT_, arghash)) {
            exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw83$RESTRICT_CONTEXT_, (SubLObject)cb_cycl_to_owl.T);
        }
        if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw85$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_, arghash)) {
            exporter_options = conses_high.putf(exporter_options, (SubLObject)cb_cycl_to_owl.$kw85$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_, (SubLObject)cb_cycl_to_owl.T);
        }
        if (cb_cycl_to_owl.$kw8$ONTOLOGY == html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw7$TYPE, arghash) && cb_cycl_to_owl.NIL != forts.fort_p(html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw8$ONTOLOGY, arghash))) {
            owl_exporter2.owl_export_ontology_to_stream(html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw8$ONTOLOGY, arghash), html_macros.$html_stream$.getDynamicValue(thread), exporter_options);
        }
        else if (cb_cycl_to_owl.$kw16$TERMS == html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw7$TYPE, arghash) && cb_cycl_to_owl.NIL != list_utilities.sublisp_boolean(html_arghash.get_arghash_value_list((SubLObject)cb_cycl_to_owl.$kw16$TERMS, arghash))) {
            if (cb_cycl_to_owl.NIL != html_arghash.get_arghash_value((SubLObject)cb_cycl_to_owl.$kw87$LEGACY_EXPORT, arghash)) {
                owl_cycl_to_xml.owl_export_terms(html_arghash.get_arghash_value_list((SubLObject)cb_cycl_to_owl.$kw16$TERMS, arghash), html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_cycl_to_owl.UNPROVIDED);
            }
            else {
                owl_exporter2.owl_export_terms_to_stream(html_arghash.get_arghash_value_list((SubLObject)cb_cycl_to_owl.$kw16$TERMS, arghash), html_macros.$html_stream$.getDynamicValue(thread), exporter_options);
            }
        }
        return (SubLObject)cb_cycl_to_owl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-cycl-to-owl.lisp", position = 14547L)
    public static SubLObject cb_link_cb_owl_export_inference_answers(final SubLObject inference, SubLObject linktext) {
        if (linktext == cb_cycl_to_owl.UNPROVIDED) {
            linktext = (SubLObject)cb_cycl_to_owl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_cycl_to_owl.NIL == linktext) {
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            linktext = (SubLObject)cb_cycl_to_owl.$str109$_OWL_Export_;
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        assert cb_cycl_to_owl.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject arghash = html_arghash.arglist_to_arghash((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_cycl_to_owl.$str111$__store_id, format_nil.format_nil_a(inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(inference)))), (SubLObject)ConsesLow.list((SubLObject)cb_cycl_to_owl.$str112$__inference_id, format_nil.format_nil_a(inference_datastructures_inference.inference_suid(inference)))));
        final SubLObject url = html_arghash.html_arghash_href(arghash, (SubLObject)cb_cycl_to_owl.$str32$cb_owl_export);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_cycl_to_owl.$kw33$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ(url);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        if (cb_cycl_to_owl.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_cycl_to_owl.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_cycl_to_owl.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_cycl_to_owl.NIL;
    }
    
    public static SubLObject declare_cb_cycl_to_owl_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_cycl_to_owl", "cb_owl_export", "CB-OWL-EXPORT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_cycl_to_owl", "cb_owl_export_internal", "CB-OWL-EXPORT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_cycl_to_owl", "cb_link_cb_owl_export_xml", "CB-LINK-CB-OWL-EXPORT-XML", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_cycl_to_owl", "cb_owl_export_xml_link", "CB-OWL-EXPORT-XML-LINK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_cycl_to_owl", "cb_owl_export_xml", "CB-OWL-EXPORT-XML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_cycl_to_owl", "cb_link_cb_owl_export_inference_answers", "CB-LINK-CB-OWL-EXPORT-INFERENCE-ANSWERS", 1, 1, false);
        return (SubLObject)cb_cycl_to_owl.NIL;
    }
    
    public static SubLObject init_cb_cycl_to_owl_file() {
        cb_cycl_to_owl.$cb_owl_export_inference_justification_termsP$ = SubLFiles.defparameter("*CB-OWL-EXPORT-INFERENCE-JUSTIFICATION-TERMS?*", (SubLObject)cb_cycl_to_owl.T);
        return (SubLObject)cb_cycl_to_owl.NIL;
    }
    
    public static SubLObject setup_cb_cycl_to_owl_file() {
        Hashtables.sethash((SubLObject)cb_cycl_to_owl.$kw0$CB_CYCL_TO_OWL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_cycl_to_owl.$str1$cb_cycl_to_owl_html, (SubLObject)cb_cycl_to_owl.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_cycl_to_owl.$sym3$CB_OWL_EXPORT, (SubLObject)cb_cycl_to_owl.$kw4$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_cycl_to_owl.$kw91$CB_OWL_EXPORT_XML, (SubLObject)cb_cycl_to_owl.$sym97$CB_LINK_CB_OWL_EXPORT_XML, (SubLObject)cb_cycl_to_owl.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_cycl_to_owl.$sym107$CB_OWL_EXPORT_XML, (SubLObject)cb_cycl_to_owl.$kw108$XML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_cycl_to_owl.$kw113$CB_OWL_EXPORT_INFERENCE_ANSWERS, (SubLObject)cb_cycl_to_owl.$sym114$CB_LINK_CB_OWL_EXPORT_INFERENCE_ANSWERS, (SubLObject)cb_cycl_to_owl.TWO_INTEGER);
        return (SubLObject)cb_cycl_to_owl.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_cycl_to_owl_file();
    }
    
    public void initializeVariables() {
        init_cb_cycl_to_owl_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_cycl_to_owl_file();
    }
    
    static {
        me = (SubLFile)new cb_cycl_to_owl();
        cb_cycl_to_owl.$cb_owl_export_inference_justification_termsP$ = null;
        $kw0$CB_CYCL_TO_OWL = SubLObjectFactory.makeKeyword("CB-CYCL-TO-OWL");
        $str1$cb_cycl_to_owl_html = SubLObjectFactory.makeString("cb-cycl-to-owl.html");
        $str2$OWL_Exporter = SubLObjectFactory.makeString("OWL Exporter");
        $sym3$CB_OWL_EXPORT = SubLObjectFactory.makeSymbol("CB-OWL-EXPORT");
        $kw4$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym5$FORT_TO_STRING = SubLObjectFactory.makeSymbol("FORT-TO-STRING");
        $sym6$TERMS_FOR_BROWSING = SubLObjectFactory.makeSymbol("TERMS-FOR-BROWSING");
        $kw7$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw8$ONTOLOGY = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $kw9$PREFER_URIS = SubLObjectFactory.makeKeyword("PREFER-URIS");
        $kw10$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw11$OVERRIDE_ONTOLOGY_BASE_URI = SubLObjectFactory.makeKeyword("OVERRIDE-ONTOLOGY-BASE-URI");
        $kw12$STORE_ID = SubLObjectFactory.makeKeyword("STORE-ID");
        $kw13$INFERENCE_ID = SubLObjectFactory.makeKeyword("INFERENCE-ID");
        $kw14$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym15$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw16$TERMS = SubLObjectFactory.makeKeyword("TERMS");
        $kw17$TERMS_COUNT = SubLObjectFactory.makeKeyword("TERMS-COUNT");
        $const18$Ontology = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ontology"));
        $str19$Export_an_OWL_ontology = SubLObjectFactory.makeString("Export an OWL ontology");
        $str20$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str21$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw22$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw23$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw24$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw25$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str26$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str27$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str28$button = SubLObjectFactory.makeString("button");
        $str29$reload = SubLObjectFactory.makeString("reload");
        $str30$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str31$post = SubLObjectFactory.makeString("post");
        $str32$cb_owl_export = SubLObjectFactory.makeString("cb-owl-export");
        $kw33$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str34$Back = SubLObjectFactory.makeString("Back");
        $str35$Clear = SubLObjectFactory.makeString("Clear");
        $str36$Choose_the_method_for_determining = SubLObjectFactory.makeString("Choose the method for determining the terms to export:");
        $str37$Export_an_ontology_defined_in_Cyc = SubLObjectFactory.makeString("Export an ontology defined in Cyc :");
        $str38$Export_a_list_of_terms_ = SubLObjectFactory.makeString("Export a list of terms:");
        $str39$Choose_export_options_ = SubLObjectFactory.makeString("Choose export options:");
        $kw40$OVERRIDE_ONTOLOGY_MT = SubLObjectFactory.makeKeyword("OVERRIDE-ONTOLOGY-MT");
        $str41$Override_the_ontology_microtheory = SubLObjectFactory.makeString("Override the ontology microtheory");
        $kw42$ONTOLOGY_MT = SubLObjectFactory.makeKeyword("ONTOLOGY-MT");
        $str43$_2 = SubLObjectFactory.makeString("+2");
        $str44$_ = SubLObjectFactory.makeString("*");
        $const45$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $kw46$OVERRIDE_ONTOLOGY_URI = SubLObjectFactory.makeKeyword("OVERRIDE-ONTOLOGY-URI");
        $str47$Override_the_ontology_URI = SubLObjectFactory.makeString("Override the ontology URI");
        $kw48$ONTOLOGY_URI = SubLObjectFactory.makeKeyword("ONTOLOGY-URI");
        $str49$ = SubLObjectFactory.makeString("");
        $int50$40 = SubLObjectFactory.makeInteger(40);
        $kw51$STRING = SubLObjectFactory.makeKeyword("STRING");
        $str52$_Default__Use_the_ontology_Base_U = SubLObjectFactory.makeString("(Default) Use the ontology Base URI (from the ");
        $const53$baseNamespaceForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("baseNamespaceForSKS"));
        $str54$_assertion_ = SubLObjectFactory.makeString(" assertion)");
        $kw55$CUSTOM = SubLObjectFactory.makeKeyword("CUSTOM");
        $str56$Override_the_ontology_Base_URI = SubLObjectFactory.makeString("Override the ontology Base URI");
        $kw57$ONTOLOGY_BASE_URI = SubLObjectFactory.makeKeyword("ONTOLOGY-BASE-URI");
        $kw58$OPENCYC = SubLObjectFactory.makeKeyword("OPENCYC");
        $str59$Use_OpenCyc_as_the_Base_URI = SubLObjectFactory.makeString("Use OpenCyc as the Base URI");
        $str60$Add_these_URIs_as_ = SubLObjectFactory.makeString("Add these URIs as ");
        $const61$owl_sameAs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:sameAs"));
        $str62$_triples_ = SubLObjectFactory.makeString(" triples:");
        $kw63$SAME_AS_URIS = SubLObjectFactory.makeKeyword("SAME-AS-URIS");
        $str64$_Readable_OpenCyc_URIs__when_appl = SubLObjectFactory.makeString(" Readable OpenCyc URIs (when applicable)");
        $kw65$CYC = SubLObjectFactory.makeKeyword("CYC");
        $str66$_Cyc_Compact_External_ID_URIs = SubLObjectFactory.makeString(" Cyc Compact External ID URIs");
        $kw67$DBPEDIA = SubLObjectFactory.makeKeyword("DBPEDIA");
        $str68$_DBpedia_URIs__when_applicable_ = SubLObjectFactory.makeString(" DBpedia URIs (when applicable)");
        $kw69$ADD_COMMENTS = SubLObjectFactory.makeKeyword("ADD-COMMENTS");
        $str70$Add_ = SubLObjectFactory.makeString("Add ");
        $const71$comment = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment"));
        $str72$_triples = SubLObjectFactory.makeString(" triples");
        $kw73$ADD_PRETTY_STRINGS = SubLObjectFactory.makeKeyword("ADD-PRETTY-STRINGS");
        $const74$prettyString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prettyString"));
        $kw75$ADD_PRETTY_STRING_CANONICAL = SubLObjectFactory.makeKeyword("ADD-PRETTY-STRING-CANONICAL");
        $const76$prettyString_Canonical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prettyString-Canonical"));
        $str77$_Default__Prefer_the_ontology_URI = SubLObjectFactory.makeString("(Default) Prefer the ontology URIs ");
        $kw78$SYNONYMOUS_EXTERNAL_CONCEPT = SubLObjectFactory.makeKeyword("SYNONYMOUS-EXTERNAL-CONCEPT");
        $str79$Prefer_ = SubLObjectFactory.makeString("Prefer ");
        $const80$synonymousExternalConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $str81$_URIs_over_the_ontology_URIs = SubLObjectFactory.makeString(" URIs over the ontology URIs");
        $str82$Prefer_OpenCyc_URIs_over_the_onto = SubLObjectFactory.makeString("Prefer OpenCyc URIs over the ontology URIs");
        $kw83$RESTRICT_CONTEXT_ = SubLObjectFactory.makeKeyword("RESTRICT-CONTEXT?");
        $str84$Restrict_export_to_only_assertion = SubLObjectFactory.makeString("Restrict export to only assertions in the ontology microtheory");
        $kw85$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_ = SubLObjectFactory.makeKeyword("SUPPRESS-EXPORT-OF-DERIVED-KNOWLEDGE?");
        $str86$Suppress_export_of_derived_knowle = SubLObjectFactory.makeString("Suppress export of derived knowledge");
        $kw87$LEGACY_EXPORT = SubLObjectFactory.makeKeyword("LEGACY-EXPORT");
        $str88$Use_legacy_exporter__List_of_term = SubLObjectFactory.makeString("Use legacy exporter (List of terms only; does not support above options)");
        $str89$Rebuild_Export_Link = SubLObjectFactory.makeString("Rebuild Export Link");
        $kw90$EXPORT = SubLObjectFactory.makeKeyword("EXPORT");
        $kw91$CB_OWL_EXPORT_XML = SubLObjectFactory.makeKeyword("CB-OWL-EXPORT-XML");
        $str92$Download_Export = SubLObjectFactory.makeString("Download Export");
        $str93$Please_fill_out_the_starred_field = SubLObjectFactory.makeString("Please fill out the starred fields");
        $str94$Retry_Get_Export_Link = SubLObjectFactory.makeString("Retry Get Export Link");
        $str95$Get_Export_Link = SubLObjectFactory.makeString("Get Export Link");
        $str96$cb_owl_export_xml = SubLObjectFactory.makeString("cb-owl-export-xml");
        $sym97$CB_LINK_CB_OWL_EXPORT_XML = SubLObjectFactory.makeSymbol("CB-LINK-CB-OWL-EXPORT-XML");
        $str98$window_open__ = SubLObjectFactory.makeString("window.open('");
        $str99$__ = SubLObjectFactory.makeString("',");
        $str100$__A_ = SubLObjectFactory.makeString("'~A'");
        $str101$null = SubLObjectFactory.makeString("null");
        $str102$___A____ = SubLObjectFactory.makeString(",'~A'); ");
        $str103$return_false_ = SubLObjectFactory.makeString("return false;");
        $kw104$PREFER_OPENCYC_URIS = SubLObjectFactory.makeKeyword("PREFER-OPENCYC-URIS");
        $kw105$BASE_URI = SubLObjectFactory.makeKeyword("BASE-URI");
        $str106$http___sw_opencyc_org_2009_04_07_ = SubLObjectFactory.makeString("http://sw.opencyc.org/2009/04/07/concept/en");
        $sym107$CB_OWL_EXPORT_XML = SubLObjectFactory.makeSymbol("CB-OWL-EXPORT-XML");
        $kw108$XML_HANDLER = SubLObjectFactory.makeKeyword("XML-HANDLER");
        $str109$_OWL_Export_ = SubLObjectFactory.makeString("[OWL Export]");
        $sym110$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $str111$__store_id = SubLObjectFactory.makeString(":.store-id");
        $str112$__inference_id = SubLObjectFactory.makeString(":.inference-id");
        $kw113$CB_OWL_EXPORT_INFERENCE_ANSWERS = SubLObjectFactory.makeKeyword("CB-OWL-EXPORT-INFERENCE-ANSWERS");
        $sym114$CB_LINK_CB_OWL_EXPORT_INFERENCE_ANSWERS = SubLObjectFactory.makeSymbol("CB-LINK-CB-OWL-EXPORT-INFERENCE-ANSWERS");
    }
}

/*

	Total time: 864 ms
	
*/