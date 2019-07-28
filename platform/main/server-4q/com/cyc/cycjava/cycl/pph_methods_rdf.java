package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.pph_methods_rdf;
import com.cyc.cycjava.cycl.rdf.rdf_graph;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.pph_methods_rdf.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class pph_methods_rdf extends SubLTranslatedFile {
    public static final SubLFile me = new pph_methods_rdf();

    public static final String myName = "com.cyc.cycjava.cycl.pph_methods_rdf";

    public static final String myFingerPrint = "dd593fac679a117a9a30fab3f5982fff50cdb701cae919bfe769089c83af239b";



    public static final SubLSymbol RDF_LABEL_METHOD = makeSymbol("RDF-LABEL-METHOD");

    public static final SubLSymbol GENERATE_RDF = makeSymbol("GENERATE-RDF");

    private static final SubLSymbol $SKSI_SUPPORTED_EXTERNAL_TERM = makeKeyword("SKSI-SUPPORTED-EXTERNAL-TERM");



    private static final SubLSymbol $RESOURCE_WITH_URI = makeKeyword("RESOURCE-WITH-URI");

    private static final SubLList $list6 = list(reader_make_constant_shell(makeString("ResourceWithURIFn")), list(makeKeyword("TEST"), makeSymbol("URI-P")));

    private static final SubLSymbol $sym7$PPH_RESOURCE_WITH_URI_ = makeSymbol("PPH-RESOURCE-WITH-URI?");



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLString $$$en = makeString("en");

    public static SubLObject rdf_label_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        SubLObject results = NIL;
        if (NIL != pph_use_rdfP()) {
            SubLObject doneP = NIL;
            final SubLObject max_number = (NIL != pph_vars.pph_generate_alternative_phrasesP()) ? NIL : ONE_INTEGER;
            if (NIL == doneP) {
                SubLObject csome_list_var = nreverse(pph_rdf_labels_for_term(v_term, max_number));
                SubLObject label = NIL;
                label = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (label.isString()) {
                        results = cons(pph_data_structures.new_pph_phrase_output_item(label, pph_utilities.pph_unknown_arg_position(), v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), results);
                        if (NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                            doneP = T;
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    label = csome_list_var.first();
                } 
            }
        }
        return values(results.first(), results.rest());
    }

    public static SubLObject generate_rdf(final SubLObject phrase) {
        final SubLObject v_term = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if (NIL != pph_use_rdfP()) {
            SubLObject doneP = NIL;
            final SubLObject max_number = (NIL != pph_vars.pph_generate_alternative_phrasesP()) ? NIL : ONE_INTEGER;
            if (NIL == doneP) {
                SubLObject csome_list_var = nreverse(pph_rdf_labels_for_term(v_term, max_number));
                SubLObject label = NIL;
                label = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (label.isString()) {
                        if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                            pph_phrase.pph_phrase_set_string(phrase, label);
                            doneP = makeBoolean(NIL == pph_vars.pph_generate_alternative_phrasesP());
                        } else {
                            final SubLObject alternative = pph_phrase.pph_phrase_copy(phrase, NIL, NIL);
                            pph_phrase.pph_phrase_set_string(alternative, label);
                            pph_phrase.pph_phrase_add_alternative(phrase, alternative);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    label = csome_list_var.first();
                } 
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_resource_with_uriP(final SubLObject v_term) {
        return formula_pattern_match.formula_matches_pattern(v_term, $list6);
    }

    public static SubLObject pph_use_rdfP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != pph_vars.$pph_use_rdfP$.getDynamicValue(thread)) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)));
    }

    public static SubLObject pph_rdf_labels_for_term(final SubLObject v_term, SubLObject max_number) {
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            if (NIL == doneP) {
                SubLObject csome_list_var = rdf_graph.rdf_labels_for_term(v_term, $$$en, max_number, T);
                SubLObject label = NIL;
                label = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (label.isString()) {
                        results = cons(label, results);
                        if ((NIL != max_number) && (NIL != list_utilities.lengthGE(results, max_number, UNPROVIDED))) {
                            doneP = T;
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    label = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static SubLObject declare_pph_methods_rdf_file() {
        declareFunction(me, "rdf_label_method", "RDF-LABEL-METHOD", 1, 1, false);
        declareFunction(me, "generate_rdf", "GENERATE-RDF", 1, 0, false);
        declareFunction(me, "pph_resource_with_uriP", "PPH-RESOURCE-WITH-URI?", 1, 0, false);
        declareFunction(me, "pph_use_rdfP", "PPH-USE-RDF?", 0, 0, false);
        declareFunction(me, "pph_rdf_labels_for_term", "PPH-RDF-LABELS-FOR-TERM", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_pph_methods_rdf_file() {
        return NIL;
    }

    public static SubLObject setup_pph_methods_rdf_file() {
        note_funcall_helper_function(RDF_LABEL_METHOD);
        pph_types.pph_register_method(GENERATE_RDF, $SKSI_SUPPORTED_EXTERNAL_TERM, $BEST);
        pph_types.pph_register_method(GENERATE_RDF, $RESOURCE_WITH_URI, $BEST);
        note_funcall_helper_function(GENERATE_RDF);
        note_funcall_helper_function($sym7$PPH_RESOURCE_WITH_URI_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_methods_rdf_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_methods_rdf_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_methods_rdf_file();
    }

    static {












    }
}

/**
 * Total time: 88 ms
 */
