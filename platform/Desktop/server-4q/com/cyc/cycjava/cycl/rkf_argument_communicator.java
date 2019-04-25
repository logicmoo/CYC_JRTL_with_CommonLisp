package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_argument_communicator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_argument_communicator";
    public static final String myFingerPrint = "80ae33048fe012aa5da31ef125d93851c2e83e15b818caa253ebe875a4fed878";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-argument-communicator.lisp", position = 1260L)
    private static SubLSymbol $rkf_irrelevant_hl_support_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-argument-communicator.lisp", position = 1666L)
    private static SubLSymbol $rkf_irrelevant_hl_support_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-argument-communicator.lisp", position = 1839L)
    private static SubLSymbol $rkf_irrelevant_hl_support_predicate_types$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$SUPPORT_MODULE;
    private static final SubLSymbol $sym2$ASSERTION_P;
    private static final SubLSymbol $sym3$RULE_ASSERTION_;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$SUPPORT_P;
    private static final SubLSymbol $sym8$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const9$EverythingPSC;
    private static final SubLSymbol $kw10$GENLS;
    private static final SubLSymbol $kw11$GENLPREDS;
    private static final SubLSymbol $kw12$GENLMT;
    private static final SubLSymbol $kw13$TRANSITIVITY;
    private static final SubLSymbol $kw14$SUBSETOF;
    private static final SubLSymbol $sym15$HL_VAR_;
    private static final SubLSymbol $sym16$FORMULA_OPERATOR;
    private static final SubLSymbol $sym17$RELN_OR_COL_VAR_LIT_;
    private static final SubLObject $const18$Relation;
    private static final SubLObject $const19$Collection;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-argument-communicator.lisp", position = 850L)
    public static SubLObject rkf_sort_supports(SubLObject supports) {
        supports = list_utilities.sort_via_position(supports, (SubLObject)rkf_argument_communicator.$list0, Symbols.symbol_function((SubLObject)rkf_argument_communicator.EQ), Symbols.symbol_function((SubLObject)rkf_argument_communicator.$sym1$SUPPORT_MODULE));
        supports = list_utilities.stable_sort_via_test(supports, Symbols.symbol_function((SubLObject)rkf_argument_communicator.$sym2$ASSERTION_P), (SubLObject)rkf_argument_communicator.UNPROVIDED);
        supports = list_utilities.stable_sort_via_test(supports, Symbols.symbol_function((SubLObject)rkf_argument_communicator.$sym3$RULE_ASSERTION_), (SubLObject)rkf_argument_communicator.UNPROVIDED);
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-argument-communicator.lisp", position = 1994L)
    public static SubLObject rkf_irrelevant_support_p(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_argument_communicator.NIL != arguments.support_p(support) : support;
        if (rkf_argument_communicator.NIL != rkf_relevance_utilities.rkf_irrelevant_formula(arguments.support_sentence(support), arguments.support_mt(support))) {
            return (SubLObject)rkf_argument_communicator.T;
        }
        if (rkf_argument_communicator.NIL != assertions_high.gaf_assertionP(support)) {
            final SubLObject pred = assertions_high.gaf_predicate(support);
            if (rkf_argument_communicator.NIL != Sequences.find(pred, rkf_argument_communicator.$rkf_irrelevant_hl_support_predicates$.getDynamicValue(thread), (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED)) {
                return (SubLObject)rkf_argument_communicator.T;
            }
            SubLObject badP = (SubLObject)rkf_argument_communicator.NIL;
            if (rkf_argument_communicator.NIL == badP) {
                SubLObject csome_list_var = rkf_argument_communicator.$rkf_irrelevant_hl_support_predicate_types$.getDynamicValue(thread);
                SubLObject pred_type = (SubLObject)rkf_argument_communicator.NIL;
                pred_type = csome_list_var.first();
                while (rkf_argument_communicator.NIL == badP && rkf_argument_communicator.NIL != csome_list_var) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_argument_communicator.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(rkf_argument_communicator.$const9$EverythingPSC, thread);
                        badP = isa.isaP(pred, pred_type, (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    pred_type = csome_list_var.first();
                }
            }
            return badP;
        }
        else {
            if (rkf_argument_communicator.NIL != assertion_handles.assertion_p(support)) {
                return rkf_irrelevant_non_gaf_assertionP(support);
            }
            final SubLObject module = arguments.support_module(support);
            final SubLObject formula = arguments.support_formula(support);
            if (rkf_argument_communicator.NIL != Sequences.find(module, rkf_argument_communicator.$rkf_irrelevant_hl_support_modules$.getDynamicValue(thread), (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED)) {
                return (SubLObject)rkf_argument_communicator.T;
            }
            final SubLObject pcase_var = module;
            if ((pcase_var.eql((SubLObject)rkf_argument_communicator.$kw10$GENLS) || pcase_var.eql((SubLObject)rkf_argument_communicator.$kw11$GENLPREDS) || pcase_var.eql((SubLObject)rkf_argument_communicator.$kw12$GENLMT) || pcase_var.eql((SubLObject)rkf_argument_communicator.$kw13$TRANSITIVITY) || pcase_var.eql((SubLObject)rkf_argument_communicator.$kw14$SUBSETOF)) && el_utilities.literal_arg1(formula, (SubLObject)rkf_argument_communicator.UNPROVIDED).equal(el_utilities.literal_arg2(formula, (SubLObject)rkf_argument_communicator.UNPROVIDED))) {
                return (SubLObject)rkf_argument_communicator.T;
            }
            return (SubLObject)rkf_argument_communicator.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-argument-communicator.lisp", position = 3117L)
    public static SubLObject rkf_irrelevant_non_gaf_assertionP(final SubLObject as) {
        if (rkf_argument_communicator.NIL != assertions_high.invalid_assertion(as, (SubLObject)rkf_argument_communicator.UNPROVIDED)) {
            return (SubLObject)rkf_argument_communicator.NIL;
        }
        if (rkf_argument_communicator.NIL != second_order_cnfP(assertions_high.assertion_cnf(as))) {
            return (SubLObject)rkf_argument_communicator.T;
        }
        if (rkf_argument_communicator.NIL != reln_or_col_var_cnfP(assertions_high.assertion_cnf(as))) {
            return (SubLObject)rkf_argument_communicator.T;
        }
        return (SubLObject)rkf_argument_communicator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-argument-communicator.lisp", position = 3358L)
    public static SubLObject second_order_cnfP(final SubLObject cnf) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_argument_communicator.NIL != Sequences.find_if((SubLObject)rkf_argument_communicator.$sym15$HL_VAR_, clauses.neg_lits(cnf), Symbols.symbol_function((SubLObject)rkf_argument_communicator.$sym16$FORMULA_OPERATOR), (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED) || rkf_argument_communicator.NIL != Sequences.find_if((SubLObject)rkf_argument_communicator.$sym15$HL_VAR_, clauses.pos_lits(cnf), Symbols.symbol_function((SubLObject)rkf_argument_communicator.$sym16$FORMULA_OPERATOR), (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-argument-communicator.lisp", position = 3525L)
    public static SubLObject reln_or_col_var_cnfP(final SubLObject cnf) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_argument_communicator.NIL != Sequences.find_if((SubLObject)rkf_argument_communicator.$sym17$RELN_OR_COL_VAR_LIT_, clauses.neg_lits(cnf), (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED) || rkf_argument_communicator.NIL != Sequences.find_if((SubLObject)rkf_argument_communicator.$sym17$RELN_OR_COL_VAR_LIT_, clauses.pos_lits(cnf), (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-argument-communicator.lisp", position = 3683L)
    public static SubLObject reln_or_col_var_litP(final SubLObject lit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_operator(lit);
        SubLObject ans = (SubLObject)rkf_argument_communicator.NIL;
        SubLObject list_var = (SubLObject)rkf_argument_communicator.NIL;
        SubLObject arg = (SubLObject)rkf_argument_communicator.NIL;
        SubLObject i = (SubLObject)rkf_argument_communicator.NIL;
        list_var = cycl_utilities.formula_args(lit, (SubLObject)rkf_argument_communicator.UNPROVIDED);
        arg = list_var.first();
        for (i = (SubLObject)rkf_argument_communicator.ZERO_INTEGER; rkf_argument_communicator.NIL == ans && rkf_argument_communicator.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), i = Numbers.add((SubLObject)rkf_argument_communicator.ONE_INTEGER, i)) {
            if (rkf_argument_communicator.NIL != cycl_variables.hl_varP(arg)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_argument_communicator.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(rkf_argument_communicator.$const9$EverythingPSC, thread);
                    final SubLObject argnum = number_utilities.f_1X(i);
                    final SubLObject argtypes = kb_accessors.argn_isa(pred, argnum, (SubLObject)rkf_argument_communicator.UNPROVIDED);
                    if (rkf_argument_communicator.NIL == ans) {
                        SubLObject csome_list_var;
                        SubLObject type;
                        for (csome_list_var = argtypes, type = (SubLObject)rkf_argument_communicator.NIL, type = csome_list_var.first(); rkf_argument_communicator.NIL == ans && rkf_argument_communicator.NIL != csome_list_var; ans = (SubLObject)SubLObjectFactory.makeBoolean(rkf_argument_communicator.NIL != genls.genlP(type, rkf_argument_communicator.$const18$Relation, (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED) || rkf_argument_communicator.NIL != genls.genlP(type, rkf_argument_communicator.$const19$Collection, (SubLObject)rkf_argument_communicator.UNPROVIDED, (SubLObject)rkf_argument_communicator.UNPROVIDED)), csome_list_var = csome_list_var.rest(), type = csome_list_var.first()) {}
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }
    
    public static SubLObject declare_rkf_argument_communicator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_argument_communicator", "rkf_sort_supports", "RKF-SORT-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_argument_communicator", "rkf_irrelevant_support_p", "RKF-IRRELEVANT-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_argument_communicator", "rkf_irrelevant_non_gaf_assertionP", "RKF-IRRELEVANT-NON-GAF-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_argument_communicator", "second_order_cnfP", "SECOND-ORDER-CNF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_argument_communicator", "reln_or_col_var_cnfP", "RELN-OR-COL-VAR-CNF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_argument_communicator", "reln_or_col_var_litP", "RELN-OR-COL-VAR-LIT?", 1, 0, false);
        return (SubLObject)rkf_argument_communicator.NIL;
    }
    
    public static SubLObject init_rkf_argument_communicator_file() {
        rkf_argument_communicator.$rkf_irrelevant_hl_support_modules$ = SubLFiles.defparameter("*RKF-IRRELEVANT-HL-SUPPORT-MODULES*", (SubLObject)rkf_argument_communicator.$list4);
        rkf_argument_communicator.$rkf_irrelevant_hl_support_predicates$ = SubLFiles.defparameter("*RKF-IRRELEVANT-HL-SUPPORT-PREDICATES*", (SubLObject)rkf_argument_communicator.$list5);
        rkf_argument_communicator.$rkf_irrelevant_hl_support_predicate_types$ = SubLFiles.defparameter("*RKF-IRRELEVANT-HL-SUPPORT-PREDICATE-TYPES*", (SubLObject)rkf_argument_communicator.$list6);
        return (SubLObject)rkf_argument_communicator.NIL;
    }
    
    public static SubLObject setup_rkf_argument_communicator_file() {
        return (SubLObject)rkf_argument_communicator.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_argument_communicator_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_argument_communicator_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_argument_communicator_file();
    }
    
    static {
        me = (SubLFile)new rkf_argument_communicator();
        rkf_argument_communicator.$rkf_irrelevant_hl_support_modules$ = null;
        rkf_argument_communicator.$rkf_irrelevant_hl_support_predicates$ = null;
        rkf_argument_communicator.$rkf_irrelevant_hl_support_predicate_types$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeKeyword("GENLS"), (SubLObject)SubLObjectFactory.makeKeyword("EVAL"));
        $sym1$SUPPORT_MODULE = SubLObjectFactory.makeSymbol("SUPPORT-MODULE");
        $sym2$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym3$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CODE"), (SubLObject)SubLObjectFactory.makeKeyword("EQUALITY"), (SubLObject)SubLObjectFactory.makeKeyword("GENLPREDS"), (SubLObject)SubLObjectFactory.makeKeyword("EVAL"));
        $list5 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $list6 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MetaPredicate")));
        $sym7$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $sym8$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const9$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw10$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $kw11$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $kw12$GENLMT = SubLObjectFactory.makeKeyword("GENLMT");
        $kw13$TRANSITIVITY = SubLObjectFactory.makeKeyword("TRANSITIVITY");
        $kw14$SUBSETOF = SubLObjectFactory.makeKeyword("SUBSETOF");
        $sym15$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $sym16$FORMULA_OPERATOR = SubLObjectFactory.makeSymbol("FORMULA-OPERATOR");
        $sym17$RELN_OR_COL_VAR_LIT_ = SubLObjectFactory.makeSymbol("RELN-OR-COL-VAR-LIT?");
        $const18$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $const19$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
    }
}

/*

	Total time: 105 ms
	
*/