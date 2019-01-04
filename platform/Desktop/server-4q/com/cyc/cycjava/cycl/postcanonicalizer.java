package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class postcanonicalizer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.postcanonicalizer";
    public static final String myFingerPrint = "0e3dd0b5cb17997b8d3f346f16db2abb487e496707cc87323ea4f97fa655d943";
    private static final SubLSymbol $sym0$EL_MEETS_PRAGMATIC_REQUIREMENT_P;
    private static final SubLSymbol $kw1$IGNORE;
    private static final SubLSymbol $kw2$DISJUNCT_IN_PRAGMATIC_REQUIREMENT;
    private static final SubLList $list3;
    
    @SubLTranslatedFile.SubL(source = "cycl/postcanonicalizer.lisp", position = 642L)
    public static SubLObject postcanonicalizations(final SubLObject sentence, final SubLObject mt) {
        return postcanonicalizations_int(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/postcanonicalizer.lisp", position = 948L)
    public static SubLObject postcanonicalizations_int(SubLObject sentence, final SubLObject mt) {
        if (postcanonicalizer.NIL == list_utilities.tree_find_if((SubLObject)postcanonicalizer.$sym0$EL_MEETS_PRAGMATIC_REQUIREMENT_P, cycl_utilities.sentence_args(sentence, (SubLObject)postcanonicalizer.UNPROVIDED), (SubLObject)postcanonicalizer.UNPROVIDED)) {
            return Values.values(sentence, mt);
        }
        if (postcanonicalizer.NIL != el_utilities.el_conjunction_p(sentence)) {
            SubLObject conjuncts = (SubLObject)postcanonicalizer.NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)postcanonicalizer.$kw1$IGNORE);
            SubLObject conjunct = (SubLObject)postcanonicalizer.NIL;
            conjunct = cdolist_list_var.first();
            while (postcanonicalizer.NIL != cdolist_list_var) {
                conjuncts = (SubLObject)ConsesLow.cons(postcanonicalize_possible_disjunction(conjunct, mt), conjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            sentence = el_utilities.make_conjunction(Sequences.nreverse(conjuncts));
        }
        else if (postcanonicalizer.NIL != el_utilities.el_disjunction_p(sentence)) {
            sentence = postcanonicalize_possible_disjunction(sentence, mt);
        }
        return Values.values(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/postcanonicalizer.lisp", position = 1712L)
    public static SubLObject postcanonicalize_possible_disjunction(SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (postcanonicalizer.NIL != el_utilities.el_disjunction_p(sentence)) {
            SubLObject disjuncts = (SubLObject)postcanonicalizer.NIL;
            SubLObject canonicalized_disjunct = (SubLObject)postcanonicalizer.NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)postcanonicalizer.$kw1$IGNORE);
            SubLObject disjunct = (SubLObject)postcanonicalizer.NIL;
            disjunct = cdolist_list_var.first();
            while (postcanonicalizer.NIL != cdolist_list_var) {
                if (postcanonicalizer.NIL != el_utilities.el_negation_p(disjunct) && postcanonicalizer.NIL != el_utilities.el_query_sentence_p(cycl_utilities.sentence_arg1(disjunct, (SubLObject)postcanonicalizer.UNPROVIDED))) {
                    final SubLObject pragmatic_condition = cycl_utilities.sentence_arg1(cycl_utilities.sentence_arg1(disjunct, (SubLObject)postcanonicalizer.UNPROVIDED), (SubLObject)postcanonicalizer.UNPROVIDED);
                    canonicalized_disjunct = czer_main.canonicalize_ask(pragmatic_condition, (SubLObject)postcanonicalizer.UNPROVIDED);
                    if (postcanonicalizer.NIL == list_utilities.singletonP(canonicalized_disjunct)) {
                        if (postcanonicalizer.NIL != wff_macros.within_wffP() && postcanonicalizer.NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                            wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)postcanonicalizer.$kw2$DISJUNCT_IN_PRAGMATIC_REQUIREMENT, pragmatic_condition, clausifier.clausifier_input_sentence(), clausifier.clausifier_input_mt()));
                            return Values.values(sentence, mt);
                        }
                        return Values.values((SubLObject)postcanonicalizer.NIL, (SubLObject)postcanonicalizer.NIL);
                    }
                    else {
                        disjuncts = (SubLObject)ConsesLow.cons(transform_dnf_and_binding_list_to_negated_el(canonicalized_disjunct), disjuncts);
                    }
                }
                else {
                    disjuncts = (SubLObject)ConsesLow.cons(disjunct, disjuncts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
            sentence = el_utilities.make_disjunction(Sequences.nreverse(disjuncts));
        }
        return Values.values(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/postcanonicalizer.lisp", position = 3045L)
    public static SubLObject transform_dnf_and_binding_list_to_negated_el(final SubLObject clause_with_binding_list) {
        final SubLObject dnf_clause = czer_utilities.extract_el_clauses(clause_with_binding_list).first();
        SubLObject current;
        final SubLObject datum = current = dnf_clause;
        SubLObject neg_lits = (SubLObject)postcanonicalizer.NIL;
        SubLObject pos_lits = (SubLObject)postcanonicalizer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)postcanonicalizer.$list3);
        neg_lits = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)postcanonicalizer.$list3);
        pos_lits = current.first();
        current = current.rest();
        if (postcanonicalizer.NIL == current) {
            final SubLObject swapped_clause = clauses.make_dnf(pos_lits, neg_lits);
            return czer_utilities.unpackage_cnf_clause(swapped_clause);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)postcanonicalizer.$list3);
        return (SubLObject)postcanonicalizer.NIL;
    }
    
    public static SubLObject declare_postcanonicalizer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.postcanonicalizer", "postcanonicalizations", "POSTCANONICALIZATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.postcanonicalizer", "postcanonicalizations_int", "POSTCANONICALIZATIONS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.postcanonicalizer", "postcanonicalize_possible_disjunction", "POSTCANONICALIZE-POSSIBLE-DISJUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.postcanonicalizer", "transform_dnf_and_binding_list_to_negated_el", "TRANSFORM-DNF-AND-BINDING-LIST-TO-NEGATED-EL", 1, 0, false);
        return (SubLObject)postcanonicalizer.NIL;
    }
    
    public static SubLObject init_postcanonicalizer_file() {
        return (SubLObject)postcanonicalizer.NIL;
    }
    
    public static SubLObject setup_postcanonicalizer_file() {
        return (SubLObject)postcanonicalizer.NIL;
    }
    
    public void declareFunctions() {
        declare_postcanonicalizer_file();
    }
    
    public void initializeVariables() {
        init_postcanonicalizer_file();
    }
    
    public void runTopLevelForms() {
        setup_postcanonicalizer_file();
    }
    
    static {
        me = (SubLFile)new postcanonicalizer();
        $sym0$EL_MEETS_PRAGMATIC_REQUIREMENT_P = SubLObjectFactory.makeSymbol("EL-MEETS-PRAGMATIC-REQUIREMENT-P");
        $kw1$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw2$DISJUNCT_IN_PRAGMATIC_REQUIREMENT = SubLObjectFactory.makeKeyword("DISJUNCT-IN-PRAGMATIC-REQUIREMENT");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
    }
}

/*

	Total time: 124 ms
	
*/