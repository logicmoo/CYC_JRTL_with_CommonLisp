package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ke_coherence extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ke_coherence";
    public static final String myFingerPrint = "eb3602fd68e2e5add82ea9423822791c32ccf3d26f30b85f12446ae53164ba0f";
    private static final SubLSymbol $sym0$VARIABLE_P;
    private static final SubLSymbol $sym1$EL_VAR_;
    private static final SubLObject $const2$True;
    private static final SubLObject $const3$False;
    private static final SubLSymbol $kw4$ISOLATED_TERMS;
    private static final SubLSymbol $sym5$ALL_LITERAL_TERMS;
    private static final SubLSymbol $sym6$CDR;
    private static final SubLSymbol $kw7$IRRELEVANT_LITERALS;
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 443L)
    public static SubLObject connected_kb_formulaP(final SubLObject formula) {
        return connected_formulaP(formula, Symbols.symbol_function((SubLObject)ke_coherence.$sym0$VARIABLE_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 721L)
    public static SubLObject connected_formulaP(final SubLObject formula, SubLObject varP) {
        if (varP == ke_coherence.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)ke_coherence.$sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnfs = clausifier.cnf_clausal_form(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject unconnectedP = (SubLObject)ke_coherence.NIL;
        final SubLObject pcase_var = cnfs;
        if (!pcase_var.eql(ke_coherence.$const2$True)) {
            if (!pcase_var.eql(ke_coherence.$const3$False)) {
                if (ke_coherence.NIL == unconnectedP) {
                    SubLObject csome_list_var;
                    SubLObject cnf;
                    for (csome_list_var = cnfs, cnf = (SubLObject)ke_coherence.NIL, cnf = csome_list_var.first(); ke_coherence.NIL == unconnectedP && ke_coherence.NIL != csome_list_var; unconnectedP = (SubLObject)SubLObjectFactory.makeBoolean(ke_coherence.NIL == connected_cnfP(cnf, varP)), csome_list_var = csome_list_var.rest(), cnf = csome_list_var.first()) {}
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(ke_coherence.NIL == unconnectedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 1122L)
    public static SubLObject connected_cnfP(final SubLObject cnf, SubLObject varP) {
        if (varP == ke_coherence.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)ke_coherence.$sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unconnectedP = (SubLObject)ke_coherence.NIL;
        if (ke_coherence.NIL == el_utilities.closedP(cnf, varP) && ke_coherence.NIL == connected_cnf_intP(cnf, varP)) {
            unconnectedP = (SubLObject)ke_coherence.T;
        }
        if (ke_coherence.NIL != unconnectedP && ke_coherence.NIL != wff_vars.$within_wffP$.getDynamicValue(thread) && ke_coherence.NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread)) {
            note_unconnected_cnf(cnf, (SubLObject)ke_coherence.UNPROVIDED);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(ke_coherence.NIL == unconnectedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 1434L)
    public static SubLObject note_unconnected_cnfs(final SubLObject cnfs, SubLObject varP) {
        if (varP == ke_coherence.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)ke_coherence.$sym1$EL_VAR_);
        }
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = (SubLObject)ke_coherence.NIL;
        cnf = cdolist_list_var.first();
        while (ke_coherence.NIL != cdolist_list_var) {
            note_unconnected_cnf(cnf, varP);
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        }
        return (SubLObject)ke_coherence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 1567L)
    public static SubLObject note_unconnected_cnf(final SubLObject cnf, SubLObject varP) {
        if (varP == ke_coherence.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)ke_coherence.$sym1$EL_VAR_);
        }
        final SubLObject isolated = unconnected_cnf_terms(cnf, varP);
        if (ke_coherence.NIL != isolated) {
            wff.note_coherence_violation((SubLObject)ConsesLow.list((SubLObject)ke_coherence.$kw4$ISOLATED_TERMS, clauses.cnf_formula(cnf, (SubLObject)ke_coherence.UNPROVIDED), isolated));
        }
        return (SubLObject)ke_coherence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 1803L)
    public static SubLObject ground_cnfP(final SubLObject cnf, SubLObject var, SubLObject dummy) {
        if (var == ke_coherence.UNPROVIDED) {
            var = Symbols.symbol_function((SubLObject)ke_coherence.$sym0$VARIABLE_P);
        }
        if (dummy == ke_coherence.UNPROVIDED) {
            dummy = (SubLObject)ke_coherence.NIL;
        }
        return (SubLObject)ke_coherence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 1903L)
    public static SubLObject connected_cnf_intP(final SubLObject cnf, SubLObject termP) {
        if (termP == ke_coherence.UNPROVIDED) {
            termP = (SubLObject)ke_coherence.NIL;
        }
        SubLObject connectedP = (SubLObject)ke_coherence.NIL;
        final SubLObject literals = clause_utilities.cnf_literals(cnf);
        SubLObject unconnected = (SubLObject)ke_coherence.NIL;
        SubLObject connected = (SubLObject)ke_coherence.NIL;
        SubLObject reachable = (SubLObject)ke_coherence.NIL;
        unconnected = selected_literals_terms(literals, termP);
        for (connected = (reachable = (SubLObject)ConsesLow.list(unconnected.first())); ke_coherence.NIL == connectedP && ke_coherence.NIL != connected; connected = connected_nodes(reachable, literals, termP, Symbols.symbol_function((SubLObject)ke_coherence.EQUAL)), reachable = conses_high.union(reachable, connected, Symbols.symbol_function((SubLObject)ke_coherence.EQUAL), (SubLObject)ke_coherence.UNPROVIDED)) {
            unconnected = conses_high.set_difference(unconnected, reachable, Symbols.symbol_function((SubLObject)ke_coherence.EQUAL), (SubLObject)ke_coherence.UNPROVIDED);
        }
        connectedP = Types.sublisp_null(unconnected);
        return connectedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 2375L)
    public static SubLObject selected_literals_terms(final SubLObject literals, SubLObject termP) {
        if (termP == ke_coherence.UNPROVIDED) {
            termP = (SubLObject)ke_coherence.NIL;
        }
        if (ke_coherence.NIL != termP) {
            return list_utilities.remove_if_not(termP, list_utilities.mapunion((SubLObject)ke_coherence.$sym5$ALL_LITERAL_TERMS, literals, Symbols.symbol_function((SubLObject)ke_coherence.EQUAL)), (SubLObject)ke_coherence.UNPROVIDED, (SubLObject)ke_coherence.UNPROVIDED, (SubLObject)ke_coherence.UNPROVIDED, (SubLObject)ke_coherence.UNPROVIDED);
        }
        return list_utilities.mapunion((SubLObject)ke_coherence.$sym5$ALL_LITERAL_TERMS, literals, Symbols.symbol_function((SubLObject)ke_coherence.EQUAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 2592L)
    public static SubLObject connected_nodes(final SubLObject nodes, final SubLObject links, SubLObject accessor, SubLObject test) {
        if (accessor == ke_coherence.UNPROVIDED) {
            accessor = Symbols.symbol_function((SubLObject)ke_coherence.$sym6$CDR);
        }
        if (test == ke_coherence.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)ke_coherence.EQL);
        }
        SubLObject result = (SubLObject)ke_coherence.NIL;
        SubLObject cdolist_list_var = links;
        SubLObject link = (SubLObject)ke_coherence.NIL;
        link = cdolist_list_var.first();
        while (ke_coherence.NIL != cdolist_list_var) {
            if (ke_coherence.NIL != connected_linkP(nodes, link, test)) {
                result = conses_high.union(result, list_utilities.cons_tree_gather(link, accessor, (SubLObject)ke_coherence.UNPROVIDED, (SubLObject)ke_coherence.UNPROVIDED, (SubLObject)ke_coherence.UNPROVIDED), (SubLObject)ke_coherence.UNPROVIDED, (SubLObject)ke_coherence.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return conses_high.set_difference(result, nodes, test, (SubLObject)ke_coherence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 2874L)
    public static SubLObject connected_linkP(final SubLObject nodes, final SubLObject link, SubLObject test) {
        if (test == ke_coherence.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)ke_coherence.EQL);
        }
        SubLObject connectedP = (SubLObject)ke_coherence.NIL;
        if (ke_coherence.NIL == connectedP) {
            SubLObject csome_list_var;
            SubLObject node;
            for (csome_list_var = nodes, node = (SubLObject)ke_coherence.NIL, node = csome_list_var.first(); ke_coherence.NIL == connectedP && ke_coherence.NIL != csome_list_var; connectedP = list_utilities.cons_tree_find(node, link, test, (SubLObject)ke_coherence.UNPROVIDED), csome_list_var = csome_list_var.rest(), node = csome_list_var.first()) {}
        }
        return connectedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 3072L)
    public static SubLObject old_connected_nodes(final SubLObject nodes, final SubLObject links, SubLObject accessor, SubLObject test) {
        if (accessor == ke_coherence.UNPROVIDED) {
            accessor = Symbols.symbol_function((SubLObject)ke_coherence.$sym6$CDR);
        }
        if (test == ke_coherence.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)ke_coherence.EQL);
        }
        SubLObject result = (SubLObject)ke_coherence.NIL;
        SubLObject cdolist_list_var = links;
        SubLObject link = (SubLObject)ke_coherence.NIL;
        link = cdolist_list_var.first();
        while (ke_coherence.NIL != cdolist_list_var) {
            final SubLObject link_nodes = Functions.funcall(accessor, link);
            if (ke_coherence.NIL != list_utilities.intersectP(nodes, link_nodes, test, (SubLObject)ke_coherence.UNPROVIDED)) {
                result = conses_high.union(result, link_nodes, (SubLObject)ke_coherence.UNPROVIDED, (SubLObject)ke_coherence.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return conses_high.set_difference(result, nodes, test, (SubLObject)ke_coherence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 3386L)
    public static SubLObject unconnected_cnf_terms(final SubLObject cnf, SubLObject termP) {
        if (termP == ke_coherence.UNPROVIDED) {
            termP = (SubLObject)ke_coherence.NIL;
        }
        SubLObject result = (SubLObject)ke_coherence.NIL;
        SubLObject literals;
        SubLObject unconnected;
        SubLObject connected;
        SubLObject reachable;
        for (literals = clause_utilities.cnf_literals(cnf), unconnected = (SubLObject)ke_coherence.NIL, connected = (SubLObject)ke_coherence.NIL, reachable = (SubLObject)ke_coherence.NIL, unconnected = selected_literals_terms(literals, termP), connected = (reachable = (SubLObject)ConsesLow.list(unconnected.first())); ke_coherence.NIL != unconnected && ke_coherence.NIL != connected; unconnected = conses_high.set_difference(unconnected, reachable, Symbols.symbol_function((SubLObject)ke_coherence.EQUAL), (SubLObject)ke_coherence.UNPROVIDED), connected = connected_nodes(reachable, literals, termP, Symbols.symbol_function((SubLObject)ke_coherence.EQUAL)), reachable = conses_high.union(reachable, connected, Symbols.symbol_function((SubLObject)ke_coherence.EQUAL), (SubLObject)ke_coherence.UNPROVIDED)) {}
        result = unconnected;
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 3849L)
    public static SubLObject formula_relevant_only_literalsP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnfs = clausifier.cnf_clausal_form(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject irrelevantP = (SubLObject)ke_coherence.NIL;
        final SubLObject pcase_var = cnfs;
        if (!pcase_var.eql(ke_coherence.$const2$True)) {
            if (!pcase_var.eql(ke_coherence.$const3$False)) {
                if (ke_coherence.NIL == irrelevantP) {
                    SubLObject csome_list_var;
                    SubLObject cnf;
                    for (csome_list_var = cnfs, cnf = (SubLObject)ke_coherence.NIL, cnf = csome_list_var.first(); ke_coherence.NIL == irrelevantP && ke_coherence.NIL != csome_list_var; irrelevantP = cnf_irrelevant_literalsP(cnf), csome_list_var = csome_list_var.rest(), cnf = csome_list_var.first()) {}
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(ke_coherence.NIL == irrelevantP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 4327L)
    public static SubLObject cnf_relevant_only_literalsP(final SubLObject cnf) {
        return (SubLObject)SubLObjectFactory.makeBoolean(ke_coherence.NIL == cnf_irrelevant_literalsP(cnf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 4417L)
    public static SubLObject cnf_irrelevant_literalsP(final SubLObject cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject irrelevantP = cnf_irrelevant_literals_intP(cnf);
        if (ke_coherence.NIL != irrelevantP && ke_coherence.NIL != wff_vars.$within_wffP$.getDynamicValue(thread) && ke_coherence.NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread)) {
            note_irrelevant_cnf(cnf);
        }
        return irrelevantP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 4640L)
    public static SubLObject note_irrelevant_cnfs(final SubLObject cnfs) {
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = (SubLObject)ke_coherence.NIL;
        cnf = cdolist_list_var.first();
        while (ke_coherence.NIL != cdolist_list_var) {
            note_irrelevant_cnf(cnf);
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        }
        return (SubLObject)ke_coherence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 4743L)
    public static SubLObject note_irrelevant_cnf(final SubLObject cnf) {
        final SubLObject irrelevant = cnf_irrelevant_literals(cnf);
        if (ke_coherence.NIL != irrelevant) {
            wff.note_coherence_violation((SubLObject)ConsesLow.list((SubLObject)ke_coherence.$kw7$IRRELEVANT_LITERALS, clauses.cnf_formula(cnf, (SubLObject)ke_coherence.UNPROVIDED), irrelevant));
        }
        return (SubLObject)ke_coherence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 4958L)
    public static SubLObject cnf_irrelevant_literals_intP(final SubLObject cnf) {
        return list_utilities.intersectP(clauses.pos_lits(cnf), clauses.neg_lits(cnf), Symbols.symbol_function((SubLObject)ke_coherence.EQUAL), (SubLObject)ke_coherence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-coherence.lisp", position = 5062L)
    public static SubLObject cnf_irrelevant_literals(final SubLObject cnf) {
        return conses_high.intersection(clauses.pos_lits(cnf), clauses.neg_lits(cnf), Symbols.symbol_function((SubLObject)ke_coherence.EQUAL), (SubLObject)ke_coherence.UNPROVIDED);
    }
    
    public static SubLObject declare_ke_coherence_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "connected_kb_formulaP", "CONNECTED-KB-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "connected_formulaP", "CONNECTED-FORMULA?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "connected_cnfP", "CONNECTED-CNF?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "note_unconnected_cnfs", "NOTE-UNCONNECTED-CNFS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "note_unconnected_cnf", "NOTE-UNCONNECTED-CNF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "ground_cnfP", "GROUND-CNF?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "connected_cnf_intP", "CONNECTED-CNF-INT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "selected_literals_terms", "SELECTED-LITERALS-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "connected_nodes", "CONNECTED-NODES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "connected_linkP", "CONNECTED-LINK?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "old_connected_nodes", "OLD-CONNECTED-NODES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "unconnected_cnf_terms", "UNCONNECTED-CNF-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "formula_relevant_only_literalsP", "FORMULA-RELEVANT-ONLY-LITERALS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "cnf_relevant_only_literalsP", "CNF-RELEVANT-ONLY-LITERALS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "cnf_irrelevant_literalsP", "CNF-IRRELEVANT-LITERALS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "note_irrelevant_cnfs", "NOTE-IRRELEVANT-CNFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "note_irrelevant_cnf", "NOTE-IRRELEVANT-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "cnf_irrelevant_literals_intP", "CNF-IRRELEVANT-LITERALS-INT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_coherence", "cnf_irrelevant_literals", "CNF-IRRELEVANT-LITERALS", 1, 0, false);
        return (SubLObject)ke_coherence.NIL;
    }
    
    public static SubLObject init_ke_coherence_file() {
        return (SubLObject)ke_coherence.NIL;
    }
    
    public static SubLObject setup_ke_coherence_file() {
        return (SubLObject)ke_coherence.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_ke_coherence_file();
    }
    
    @Override
	public void initializeVariables() {
        init_ke_coherence_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_ke_coherence_file();
    }
    
    static {
        me = (SubLFile)new ke_coherence();
        $sym0$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym1$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $const2$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $const3$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $kw4$ISOLATED_TERMS = SubLObjectFactory.makeKeyword("ISOLATED-TERMS");
        $sym5$ALL_LITERAL_TERMS = SubLObjectFactory.makeSymbol("ALL-LITERAL-TERMS");
        $sym6$CDR = SubLObjectFactory.makeSymbol("CDR");
        $kw7$IRRELEVANT_LITERALS = SubLObjectFactory.makeKeyword("IRRELEVANT-LITERALS");
    }
}

/*

	Total time: 99 ms
	
*/