package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.rdf.rdf_graph;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_methods_rdf extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_methods_rdf";
    public static final String myFingerPrint = "dd593fac679a117a9a30fab3f5982fff50cdb701cae919bfe769089c83af239b";
    private static final SubLSymbol $kw0$ANY;
    private static final SubLSymbol $sym1$RDF_LABEL_METHOD;
    private static final SubLSymbol $sym2$GENERATE_RDF;
    private static final SubLSymbol $kw3$SKSI_SUPPORTED_EXTERNAL_TERM;
    private static final SubLSymbol $kw4$BEST;
    private static final SubLSymbol $kw5$RESOURCE_WITH_URI;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PPH_RESOURCE_WITH_URI_;
    private static final SubLSymbol $sym8$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const9$InferencePSC;
    private static final SubLString $str10$en;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-rdf.lisp", position = 902L)
    public static SubLObject rdf_label_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == pph_methods_rdf.UNPROVIDED) {
            nl_preds = (SubLObject)pph_methods_rdf.$kw0$ANY;
        }
        SubLObject results = (SubLObject)pph_methods_rdf.NIL;
        if (pph_methods_rdf.NIL != pph_use_rdfP()) {
            SubLObject doneP = (SubLObject)pph_methods_rdf.NIL;
            final SubLObject max_number = (SubLObject)((pph_methods_rdf.NIL != pph_vars.pph_generate_alternative_phrasesP()) ? pph_methods_rdf.NIL : pph_methods_rdf.ONE_INTEGER);
            if (pph_methods_rdf.NIL == doneP) {
                SubLObject csome_list_var = Sequences.nreverse(pph_rdf_labels_for_term(v_term, max_number));
                SubLObject label = (SubLObject)pph_methods_rdf.NIL;
                label = csome_list_var.first();
                while (pph_methods_rdf.NIL == doneP && pph_methods_rdf.NIL != csome_list_var) {
                    if (label.isString()) {
                        results = (SubLObject)ConsesLow.cons(pph_data_structures.new_pph_phrase_output_item(label, pph_utilities.pph_unknown_arg_position(), v_term, (SubLObject)pph_methods_rdf.UNPROVIDED, (SubLObject)pph_methods_rdf.UNPROVIDED, (SubLObject)pph_methods_rdf.UNPROVIDED), results);
                        if (pph_methods_rdf.NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                            doneP = (SubLObject)pph_methods_rdf.T;
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    label = csome_list_var.first();
                }
            }
        }
        return Values.values(results.first(), results.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-rdf.lisp", position = 1592L)
    public static SubLObject generate_rdf(final SubLObject phrase) {
        final SubLObject v_term = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_rdf.UNPROVIDED);
        if (pph_methods_rdf.NIL != pph_use_rdfP()) {
            SubLObject doneP = (SubLObject)pph_methods_rdf.NIL;
            final SubLObject max_number = (SubLObject)((pph_methods_rdf.NIL != pph_vars.pph_generate_alternative_phrasesP()) ? pph_methods_rdf.NIL : pph_methods_rdf.ONE_INTEGER);
            if (pph_methods_rdf.NIL == doneP) {
                SubLObject csome_list_var = Sequences.nreverse(pph_rdf_labels_for_term(v_term, max_number));
                SubLObject label = (SubLObject)pph_methods_rdf.NIL;
                label = csome_list_var.first();
                while (pph_methods_rdf.NIL == doneP && pph_methods_rdf.NIL != csome_list_var) {
                    if (label.isString()) {
                        if (pph_methods_rdf.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                            pph_phrase.pph_phrase_set_string(phrase, label);
                            doneP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_rdf.NIL == pph_vars.pph_generate_alternative_phrasesP());
                        }
                        else {
                            final SubLObject alternative = pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_methods_rdf.NIL, (SubLObject)pph_methods_rdf.NIL);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-rdf.lisp", position = 2295L)
    public static SubLObject pph_resource_with_uriP(final SubLObject v_term) {
        return formula_pattern_match.formula_matches_pattern(v_term, (SubLObject)pph_methods_rdf.$list6);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-rdf.lisp", position = 2427L)
    public static SubLObject pph_use_rdfP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_rdf.NIL != pph_vars.$pph_use_rdfP$.getDynamicValue(thread) && pph_methods_rdf.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_rdf.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-rdf.lisp", position = 2516L)
    public static SubLObject pph_rdf_labels_for_term(final SubLObject v_term, SubLObject max_number) {
        if (max_number == pph_methods_rdf.UNPROVIDED) {
            max_number = (SubLObject)pph_methods_rdf.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)pph_methods_rdf.NIL;
        SubLObject doneP = (SubLObject)pph_methods_rdf.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_methods_rdf.$sym8$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(pph_methods_rdf.$const9$InferencePSC, thread);
            if (pph_methods_rdf.NIL == doneP) {
                SubLObject csome_list_var = rdf_graph.rdf_labels_for_term(v_term, (SubLObject)pph_methods_rdf.$str10$en, max_number, (SubLObject)pph_methods_rdf.T);
                SubLObject label = (SubLObject)pph_methods_rdf.NIL;
                label = csome_list_var.first();
                while (pph_methods_rdf.NIL == doneP && pph_methods_rdf.NIL != csome_list_var) {
                    if (label.isString()) {
                        results = (SubLObject)ConsesLow.cons(label, results);
                        if (pph_methods_rdf.NIL != max_number && pph_methods_rdf.NIL != list_utilities.lengthGE(results, max_number, (SubLObject)pph_methods_rdf.UNPROVIDED)) {
                            doneP = (SubLObject)pph_methods_rdf.T;
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    label = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    public static SubLObject declare_pph_methods_rdf_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_rdf", "rdf_label_method", "RDF-LABEL-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_rdf", "generate_rdf", "GENERATE-RDF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_rdf", "pph_resource_with_uriP", "PPH-RESOURCE-WITH-URI?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_rdf", "pph_use_rdfP", "PPH-USE-RDF?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_rdf", "pph_rdf_labels_for_term", "PPH-RDF-LABELS-FOR-TERM", 1, 1, false);
        return (SubLObject)pph_methods_rdf.NIL;
    }
    
    public static SubLObject init_pph_methods_rdf_file() {
        return (SubLObject)pph_methods_rdf.NIL;
    }
    
    public static SubLObject setup_pph_methods_rdf_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)pph_methods_rdf.$sym1$RDF_LABEL_METHOD);
        pph_types.pph_register_method((SubLObject)pph_methods_rdf.$sym2$GENERATE_RDF, (SubLObject)pph_methods_rdf.$kw3$SKSI_SUPPORTED_EXTERNAL_TERM, (SubLObject)pph_methods_rdf.$kw4$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_rdf.$sym2$GENERATE_RDF, (SubLObject)pph_methods_rdf.$kw5$RESOURCE_WITH_URI, (SubLObject)pph_methods_rdf.$kw4$BEST);
        utilities_macros.note_funcall_helper_function((SubLObject)pph_methods_rdf.$sym2$GENERATE_RDF);
        utilities_macros.note_funcall_helper_function((SubLObject)pph_methods_rdf.$sym7$PPH_RESOURCE_WITH_URI_);
        return (SubLObject)pph_methods_rdf.NIL;
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
        me = (SubLFile)new pph_methods_rdf();
        $kw0$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym1$RDF_LABEL_METHOD = SubLObjectFactory.makeSymbol("RDF-LABEL-METHOD");
        $sym2$GENERATE_RDF = SubLObjectFactory.makeSymbol("GENERATE-RDF");
        $kw3$SKSI_SUPPORTED_EXTERNAL_TERM = SubLObjectFactory.makeKeyword("SKSI-SUPPORTED-EXTERNAL-TERM");
        $kw4$BEST = SubLObjectFactory.makeKeyword("BEST");
        $kw5$RESOURCE_WITH_URI = SubLObjectFactory.makeKeyword("RESOURCE-WITH-URI");
        $list6 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResourceWithURIFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("URI-P")));
        $sym7$PPH_RESOURCE_WITH_URI_ = SubLObjectFactory.makeSymbol("PPH-RESOURCE-WITH-URI?");
        $sym8$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const9$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $str10$en = SubLObjectFactory.makeString("en");
    }
}

/*

	Total time: 88 ms
	
*/