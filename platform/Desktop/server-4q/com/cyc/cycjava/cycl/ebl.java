package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ebl extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ebl";
    public static final String myFingerPrint = "e82d432d8f6f2c1e711c7057cd764a3a7ba7dea0bc9b1ce5d99c8a86bcb157e5";
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 1814L)
    public static SubLSymbol $ebl_justs$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$EBL_RULE;
    private static final SubLSymbol $sym4$ASSERTION_P;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$POS;
    private static final SubLSymbol $sym8$SUB_JUSTS;
    private static final SubLList $list9;
    private static final SubLString $str10$sub_justs____s;
    private static final SubLString $str11$ebl_rule___mts_____s____s;
    private static final SubLString $str12$____ebl_rule___mts_____s____s;
    private static final SubLSymbol $sym13$ASSERTION_MT;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$NEG;
    private static final SubLSymbol $sym18$INTERN;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLString $str21$___cnf_1____s;
    private static final SubLString $str22$___cnf_2____s;
    private static final SubLString $str23$___lit_1____s;
    private static final SubLString $str24$___lit_2____s;
    private static final SubLString $str25$___blist____s;
    private static final SubLString $str26$___pos_lits_1____s;
    private static final SubLString $str27$___new_neg_lits_1____s;
    private static final SubLString $str28$___neg_lits_2____s;
    private static final SubLString $str29$_____parent_to_unify_bindings____;
    private static final SubLString $str30$___unify_to_child_bindings____s;
    private static final SubLString $str31$___parent_to_child_bindings____s;
    private static final SubLString $str32$___new_cnf____s;
    private static final SubLString $str33$___vnames_1____s;
    private static final SubLString $str34$___vnames_2____s;
    private static final SubLString $str35$___new_names____s;
    private static final SubLString $str36$___new_rule____s;
    private static final SubLString $str37$stop;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$PROOF_TREE_COMPILATIONS;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$CAR;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLString $str45$cnf_not_fully_bound__s;
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 394L)
    public static SubLObject compile_assertion_list(final SubLObject assertions) {
        return compile_rule_list(ebl_rules(assertions));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 514L)
    public static SubLObject compile_rule_list(final SubLObject rules) {
        if (ebl.NIL == rules) {
            return (SubLObject)ebl.NIL;
        }
        if (ebl.NIL != list_utilities.singletonP(rules)) {
            return rules.first();
        }
        SubLObject rule_1 = (SubLObject)ebl.NIL;
        SubLObject rule_2 = (SubLObject)ebl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(rules, rules, (SubLObject)ebl.$list0);
        rule_1 = rules.first();
        SubLObject current = rules.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, rules, (SubLObject)ebl.$list0);
        rule_2 = current.first();
        final SubLObject more_rules;
        current = (more_rules = current.rest());
        final SubLObject mega_rule = compile_rule_pair(rule_1, rule_2);
        return compile_rule_list((SubLObject)ConsesLow.cons(mega_rule, more_rules));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 859L)
    public static SubLObject compile_rule_pair(final SubLObject rule_1, final SubLObject rule_2) {
        SubLObject mt_1 = (SubLObject)ebl.NIL;
        SubLObject cnf_1 = (SubLObject)ebl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(rule_1, rule_1, (SubLObject)ebl.$list1);
        mt_1 = rule_1.first();
        SubLObject current = rule_1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, rule_1, (SubLObject)ebl.$list1);
        cnf_1 = current.first();
        current = current.rest();
        if (ebl.NIL == current) {
            SubLObject mt_2 = (SubLObject)ebl.NIL;
            SubLObject cnf_2 = (SubLObject)ebl.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(rule_2, rule_2, (SubLObject)ebl.$list2);
            mt_2 = rule_2.first();
            SubLObject current_$2 = rule_2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, rule_2, (SubLObject)ebl.$list2);
            cnf_2 = current_$2.first();
            current_$2 = current_$2.rest();
            if (ebl.NIL == current_$2) {
                final SubLObject new_cnf = unify_cnf(cnf_1, cnf_2);
                final SubLObject new_mt = genl_mts.max_floor_mts((SubLObject)ConsesLow.list(mt_1, mt_2), (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED).first();
                if (ebl.NIL != new_cnf && ebl.NIL != new_mt) {
                    return (SubLObject)ConsesLow.list(new_mt, new_cnf);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(rule_2, (SubLObject)ebl.$list2);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(rule_1, (SubLObject)ebl.$list1);
        }
        return (SubLObject)ebl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 1160L)
    public static SubLObject unify_cnf(final SubLObject cnf_1, final SubLObject cnf_2) {
        final SubLObject neg_lits_1 = clauses.neg_lits(cnf_1);
        final SubLObject pos_lits_1 = clauses.pos_lits(cnf_1);
        final SubLObject neg_lits_2 = clauses.neg_lits(cnf_2);
        final SubLObject pos_lits_2 = clauses.pos_lits(cnf_2);
        final SubLObject v_bindings = unification.unify(neg_lits_1, pos_lits_2, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED);
        unification_utilities.parent_to_child_bindings(unification_utilities.parent_to_unify_bindings(cnf_1, v_bindings), unification_utilities.unify_to_child_bindings(cnf_2));
        if (ebl.NIL != v_bindings) {
            return clauses.make_cnf(neg_lits_2, bindings.subst_bindings(v_bindings, pos_lits_1));
        }
        return (SubLObject)ebl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 1583L)
    public static SubLObject ebl_rules(final SubLObject assertions) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)ebl.$sym3$EBL_RULE), assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 1680L)
    public static SubLObject ebl_rule(final SubLObject assertion) {
        assert ebl.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return (SubLObject)ConsesLow.list(assertions_high.assertion_mt(assertion), assertions_high.assertion_cnf(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 1877L)
    public static SubLObject construct_one_inference_result_tree(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = (SubLObject)ebl.NIL;
        SubLObject neg_justs = (SubLObject)ebl.NIL;
        SubLObject pos_justs = (SubLObject)ebl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(result, result, (SubLObject)ebl.$list5);
        v_bindings = result.first();
        SubLObject current = result.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, result, (SubLObject)ebl.$list5);
        neg_justs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, result, (SubLObject)ebl.$list5);
        pos_justs = current.first();
        current = current.rest();
        if (ebl.NIL == current) {
            SubLObject tree = (SubLObject)ebl.NIL;
            final SubLObject justs = Sequences.reverse(pos_justs);
            final SubLObject root = justs.first();
            final SubLObject _prev_bind_0 = ebl.$ebl_justs$.currentBinding(thread);
            try {
                ebl.$ebl_justs$.bind(justs.rest(), thread);
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = root;
                SubLObject lit = (SubLObject)ebl.NIL;
                SubLObject support = (SubLObject)ebl.NIL;
                SubLObject sub_lits = (SubLObject)ebl.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)ebl.$list6);
                lit = current_$4.first();
                current_$4 = current_$4.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)ebl.$list6);
                support = current_$4.first();
                current_$4 = current_$4.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)ebl.$list6);
                sub_lits = current_$4.first();
                current_$4 = current_$4.rest();
                if (ebl.NIL == current_$4) {
                    tree = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(lit, (SubLObject)ebl.$kw7$POS), support, Mapping.mapcar(Symbols.symbol_function((SubLObject)ebl.$sym8$SUB_JUSTS), sub_lits));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$3, (SubLObject)ebl.$list6);
                }
            }
            finally {
                ebl.$ebl_justs$.rebind(_prev_bind_0, thread);
            }
            return tree;
        }
        cdestructuring_bind.cdestructuring_bind_error(result, (SubLObject)ebl.$list5);
        return (SubLObject)ebl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 2290L)
    public static SubLObject sub_justs(final SubLObject lit, SubLObject justs) {
        if (justs == ebl.UNPROVIDED) {
            justs = ebl.$ebl_justs$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tree = (SubLObject)ebl.NIL;
        final SubLObject just = conses_high.assoc(lit.first(), justs, Symbols.symbol_function((SubLObject)ebl.EQUAL), (SubLObject)ebl.UNPROVIDED);
        final SubLObject _prev_bind_0 = ebl.$ebl_justs$.currentBinding(thread);
        try {
            ebl.$ebl_justs$.bind(Sequences.remove(just, justs, Symbols.symbol_function((SubLObject)ebl.EQUAL), (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED), thread);
            if (ebl.NIL != just) {
                SubLObject current;
                final SubLObject datum = current = just;
                SubLObject literal = (SubLObject)ebl.NIL;
                SubLObject support = (SubLObject)ebl.NIL;
                SubLObject sub_lits = (SubLObject)ebl.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebl.$list9);
                literal = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebl.$list9);
                support = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebl.$list9);
                sub_lits = current.first();
                final SubLObject more_supports;
                current = (more_supports = current.rest());
                tree = (SubLObject)ConsesLow.list(lit, support, Mapping.mapcar(Symbols.symbol_function((SubLObject)ebl.$sym8$SUB_JUSTS), sub_lits));
            }
        }
        finally {
            ebl.$ebl_justs$.rebind(_prev_bind_0, thread);
        }
        if (ebl.NIL != tree) {
            return tree;
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FOUR_INTEGER)) {
            Errors.sublisp_break((SubLObject)ebl.$str10$sub_justs____s, new SubLObject[] { tree });
        }
        else if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.THREE_INTEGER)) {
            Errors.warn((SubLObject)ebl.$str10$sub_justs____s, tree);
        }
        return (SubLObject)ebl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 2794L)
    public static SubLObject collect_justification_compilations(final SubLObject results) {
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)ebl.NIL;
        result = cdolist_list_var.first();
        while (ebl.NIL != cdolist_list_var) {
            collect_justification_compilation(result);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return (SubLObject)ebl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 2933L)
    public static SubLObject collect_justification_compilation(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proof_tree = construct_one_inference_result_tree(result);
        final SubLObject var = compile_proof_tree(proof_tree);
        if (ebl.NIL != var) {
            control_vars.$justification_compilations$.setDynamicValue((SubLObject)ConsesLow.cons(var, control_vars.$justification_compilations$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)ebl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 3143L)
    public static SubLObject compile_proof_tree(final SubLObject proof_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject compilations = Sequences.nreverse(proof_tree_compilations(proof_tree));
        if (ebl.NIL != compilations) {
            thread.resetMultipleValues();
            final SubLObject rule = perform_ebl_compilations(compilations);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FOUR_INTEGER)) {
                Errors.sublisp_break((SubLObject)ebl.$str11$ebl_rule___mts_____s____s, new SubLObject[] { rule, mts });
            }
            else if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.ONE_INTEGER)) {
                PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str12$____ebl_rule___mts_____s____s, rule, mts);
            }
            return (SubLObject)ConsesLow.list(rule, mts);
        }
        return (SubLObject)ebl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 3546L)
    public static SubLObject perform_ebl_compilations(final SubLObject compilations) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mts = ebl_mts(Mapping.mapcar(Symbols.symbol_function((SubLObject)ebl.$sym13$ASSERTION_MT), list_utilities.cons_tree_gather(compilations, Symbols.symbol_function((SubLObject)ebl.$sym4$ASSERTION_P), (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED)));
        SubLObject rule = (SubLObject)ebl.NIL;
        SubLObject cnf = (SubLObject)ebl.NIL;
        SubLObject vnames = (SubLObject)ebl.NIL;
        SubLObject prior = (SubLObject)ebl.NIL;
        if (ebl.NIL != mts) {
            SubLObject cdolist_list_var = compilations;
            SubLObject compilation = (SubLObject)ebl.NIL;
            compilation = cdolist_list_var.first();
            while (ebl.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = compilation;
                SubLObject support_1 = (SubLObject)ebl.NIL;
                SubLObject support_2 = (SubLObject)ebl.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebl.$list14);
                support_1 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebl.$list14);
                support_2 = current.first();
                current = current.rest();
                if (ebl.NIL == current) {
                    SubLObject current_$6;
                    final SubLObject datum_$5 = current_$6 = support_1;
                    SubLObject assertion_1 = (SubLObject)ebl.NIL;
                    SubLObject sense_1 = (SubLObject)ebl.NIL;
                    SubLObject psn_1 = (SubLObject)ebl.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)ebl.$list15);
                    assertion_1 = current_$6.first();
                    current_$6 = current_$6.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)ebl.$list15);
                    sense_1 = current_$6.first();
                    current_$6 = current_$6.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)ebl.$list15);
                    psn_1 = current_$6.first();
                    current_$6 = current_$6.rest();
                    if (ebl.NIL == current_$6) {
                        SubLObject current_$7;
                        final SubLObject datum_$6 = current_$7 = support_2;
                        SubLObject assertion_2 = (SubLObject)ebl.NIL;
                        SubLObject sense_2 = (SubLObject)ebl.NIL;
                        SubLObject psn_2 = (SubLObject)ebl.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)ebl.$list16);
                        assertion_2 = current_$7.first();
                        current_$7 = current_$7.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)ebl.$list16);
                        sense_2 = current_$7.first();
                        current_$7 = current_$7.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)ebl.$list16);
                        psn_2 = current_$7.first();
                        current_$7 = current_$7.rest();
                        if (ebl.NIL == current_$7) {
                            if (sense_1.eql((SubLObject)ebl.$kw17$NEG) && sense_2.eql((SubLObject)ebl.$kw7$POS) && (ebl.NIL == prior || prior.eql(assertion_2))) {
                                prior = assertion_1;
                                final SubLObject cnf_1 = conses_high.copy_tree(assertions_high.assertion_cnf(assertion_1));
                                final SubLObject cnf_2 = (ebl.NIL != cnf) ? cnf : conses_high.copy_tree(assertions_high.assertion_cnf(assertion_2));
                                final SubLObject vnames_1 = conses_high.copy_list(assertions_high.assertion_variable_names(assertion_1));
                                final SubLObject vnames_2 = (ebl.NIL != vnames) ? vnames : conses_high.copy_list(assertions_high.assertion_variable_names(assertion_2));
                                thread.resetMultipleValues();
                                final SubLObject new_cnf = generalize_support((SubLObject)ConsesLow.listS(cnf_1, vnames_1, sense_1, psn_1), (SubLObject)ConsesLow.listS(cnf_2, vnames_2, sense_2, psn_2));
                                final SubLObject new_vnames = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                cnf = new_cnf;
                                vnames = new_vnames;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$6, (SubLObject)ebl.$list16);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$5, (SubLObject)ebl.$list15);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ebl.$list14);
                }
                cdolist_list_var = cdolist_list_var.rest();
                compilation = cdolist_list_var.first();
            }
        }
        if (ebl.NIL != cnf) {
            rule = fi.perform_fi_substitutions(clauses.cnf_formula(cnf, (SubLObject)ebl.UNPROVIDED), Mapping.mapcar(Symbols.symbol_function((SubLObject)ebl.$sym18$INTERN), vnames));
        }
        return Values.values(rule, mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 4714L)
    public static SubLObject generalize_support(final SubLObject cnf_vnames_senseXpsn_1, final SubLObject cnf_vnames_senseXpsn_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnf_1 = (SubLObject)ebl.NIL;
        SubLObject vnames_1 = (SubLObject)ebl.NIL;
        SubLObject sense_1 = (SubLObject)ebl.NIL;
        SubLObject psn_1 = (SubLObject)ebl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(cnf_vnames_senseXpsn_1, cnf_vnames_senseXpsn_1, (SubLObject)ebl.$list19);
        cnf_1 = cnf_vnames_senseXpsn_1.first();
        SubLObject current = cnf_vnames_senseXpsn_1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, cnf_vnames_senseXpsn_1, (SubLObject)ebl.$list19);
        vnames_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, cnf_vnames_senseXpsn_1, (SubLObject)ebl.$list19);
        sense_1 = current.first();
        current = (psn_1 = current.rest());
        SubLObject cnf_2 = (SubLObject)ebl.NIL;
        SubLObject vnames_2 = (SubLObject)ebl.NIL;
        SubLObject sense_2 = (SubLObject)ebl.NIL;
        SubLObject psn_2 = (SubLObject)ebl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(cnf_vnames_senseXpsn_2, cnf_vnames_senseXpsn_2, (SubLObject)ebl.$list20);
        cnf_2 = cnf_vnames_senseXpsn_2.first();
        SubLObject current_$10 = cnf_vnames_senseXpsn_2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current_$10, cnf_vnames_senseXpsn_2, (SubLObject)ebl.$list20);
        vnames_2 = current_$10.first();
        current_$10 = current_$10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current_$10, cnf_vnames_senseXpsn_2, (SubLObject)ebl.$list20);
        sense_2 = current_$10.first();
        current_$10 = (psn_2 = current_$10.rest());
        final SubLObject pos_lits_1 = clauses.pos_lits(cnf_1);
        final SubLObject neg_lits_1 = clauses.neg_lits(cnf_1);
        final SubLObject pos_lits_2 = clauses.pos_lits(cnf_2);
        final SubLObject neg_lits_2 = clauses.neg_lits(cnf_2);
        final SubLObject lit_1 = cnf_literal(cnf_1, sense_1, psn_1);
        final SubLObject lit_2 = cnf_literal(cnf_2, sense_2, psn_2);
        final SubLObject blist = unification.unify(lit_1, lit_2, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED);
        final SubLObject parent_to_unify_bindings = unification_utilities.parent_to_unify_bindings(cnf_1, blist);
        final SubLObject new_neg_lits_1 = conses_high.sublis(parent_to_unify_bindings, Sequences.remove(lit_1, neg_lits_1, Symbols.symbol_function((SubLObject)ebl.EQUAL), (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED), (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED);
        final SubLObject new_pos_lits = conses_high.sublis(parent_to_unify_bindings, pos_lits_1, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED);
        final SubLObject new_cnf = clauses.make_cnf(conses_high.union(new_neg_lits_1, neg_lits_2, Symbols.symbol_function((SubLObject)ebl.EQUAL), (SubLObject)ebl.UNPROVIDED), new_pos_lits);
        final SubLObject unify_to_child_bindings = unification_utilities.unify_to_child_bindings(new_cnf);
        final SubLObject parent_to_child_bindings = unification_utilities.parent_to_child_bindings(parent_to_unify_bindings, unify_to_child_bindings);
        final SubLObject cnf = conses_high.sublis(unify_to_child_bindings, new_cnf, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED);
        final SubLObject vnames = ebl_merge_vnames(vnames_1, vnames_2, parent_to_child_bindings);
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str21$___cnf_1____s, cnf_1);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str22$___cnf_2____s, cnf_2);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str23$___lit_1____s, lit_1);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str24$___lit_2____s, lit_2);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str25$___blist____s, blist);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str26$___pos_lits_1____s, pos_lits_1);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str27$___new_neg_lits_1____s, new_neg_lits_1);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str28$___neg_lits_2____s, neg_lits_2);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str29$_____parent_to_unify_bindings____, parent_to_unify_bindings);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str30$___unify_to_child_bindings____s, unify_to_child_bindings);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str31$___parent_to_child_bindings____s, parent_to_child_bindings);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str32$___new_cnf____s, cnf);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str33$___vnames_1____s, vnames_1);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str34$___vnames_2____s, vnames_2);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str35$___new_names____s, vnames);
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.THREE_INTEGER)) {
            PrintLow.format((SubLObject)ebl.T, (SubLObject)ebl.$str36$___new_rule____s, fi.perform_fi_substitutions(clauses.cnf_formula(conses_high.copy_tree(cnf), (SubLObject)ebl.UNPROVIDED), vnames));
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FIVE_INTEGER)) {
            Errors.sublisp_break((SubLObject)ebl.$str37$stop, ebl.EMPTY_SUBL_OBJECT_ARRAY);
        }
        return Values.values(cnf, vnames);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 7177L)
    public static SubLObject ebl_merge_vnames(final SubLObject vnames_1, final SubLObject vnames_2, final SubLObject v_bindings) {
        SubLObject names = (SubLObject)ebl.NIL;
        final SubLObject n = Sequences.length(vnames_2);
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)ebl.NIL;
        binding = cdolist_list_var.first();
        while (ebl.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject v1 = (SubLObject)ebl.NIL;
            SubLObject v2 = (SubLObject)ebl.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebl.$list38);
            v1 = current.first();
            current = (v2 = current.rest());
            if (variables.variable_id(v2).numGE(n)) {
                names = (SubLObject)ConsesLow.cons(ConsesLow.nth(variables.variable_id(v1), vnames_1), names);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return ConsesLow.nconc(vnames_2, Sequences.nreverse(names));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 7477L)
    public static SubLObject ebl_mts(final SubLObject mts) {
        return genl_mts.max_floor_mts(mts, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 7529L)
    public static SubLObject cnf_literal(final SubLObject cnf, final SubLObject pos_neg, final SubLObject psn) {
        if (pos_neg.eql((SubLObject)ebl.$kw7$POS)) {
            return ConsesLow.nth(psn, clauses.pos_lits(cnf));
        }
        if (pos_neg.eql((SubLObject)ebl.$kw17$NEG)) {
            return ConsesLow.nth(psn, clauses.neg_lits(cnf));
        }
        return (SubLObject)ebl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 7671L)
    public static SubLObject proof_trees_compilations(final SubLObject proof_trees) {
        return Sequences.remove((SubLObject)ebl.NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)ebl.$sym39$PROOF_TREE_COMPILATIONS), proof_trees), (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 7788L)
    public static SubLObject proof_tree_compilations(final SubLObject proof_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject compilations = (SubLObject)ebl.NIL;
        if (ebl.THREE_INTEGER.numE(Sequences.length(proof_tree))) {
            SubLObject pos_lit_gafXtruth = (SubLObject)ebl.NIL;
            SubLObject assertion = (SubLObject)ebl.NIL;
            SubLObject sub_trees = (SubLObject)ebl.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(proof_tree, proof_tree, (SubLObject)ebl.$list40);
            pos_lit_gafXtruth = proof_tree.first();
            SubLObject current = proof_tree.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, proof_tree, (SubLObject)ebl.$list40);
            assertion = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, proof_tree, (SubLObject)ebl.$list40);
            sub_trees = current.first();
            current = current.rest();
            if (ebl.NIL == current) {
                SubLObject current_$12;
                final SubLObject datum_$11 = current_$12 = pos_lit_gafXtruth;
                SubLObject pos_lit_gaf = (SubLObject)ebl.NIL;
                SubLObject truth = (SubLObject)ebl.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$12, datum_$11, (SubLObject)ebl.$list41);
                pos_lit_gaf = current_$12.first();
                current_$12 = (truth = current_$12.rest());
                if (ebl.NIL != assertion_handles.assertion_p(assertion)) {
                    thread.resetMultipleValues();
                    final SubLObject pos_gafs = supporting_gafs(Mapping.mapcar(Symbols.symbol_function((SubLObject)ebl.$sym42$CAR), sub_trees));
                    final SubLObject neg_gafs = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject cnf = assertions_high.assertion_cnf(assertion);
                    final SubLObject ground_cnf = bind_cnf_with_gafs(cnf, pos_lit_gaf, pos_gafs, neg_gafs);
                    final SubLObject ground_pos_lits = clauses.pos_lits(ground_cnf);
                    final SubLObject ground_neg_lits = clauses.neg_lits(ground_cnf);
                    SubLObject cdolist_list_var = sub_trees;
                    SubLObject sub_tree = (SubLObject)ebl.NIL;
                    sub_tree = cdolist_list_var.first();
                    while (ebl.NIL != cdolist_list_var) {
                        if (Sequences.length(sub_tree).numGE((SubLObject)ebl.THREE_INTEGER)) {
                            SubLObject current_$13;
                            final SubLObject datum_$12 = current_$13 = sub_tree;
                            SubLObject literalXtruth = (SubLObject)ebl.NIL;
                            SubLObject support = (SubLObject)ebl.NIL;
                            SubLObject sub_lits = (SubLObject)ebl.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$12, (SubLObject)ebl.$list43);
                            literalXtruth = current_$13.first();
                            current_$13 = current_$13.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$12, (SubLObject)ebl.$list43);
                            support = current_$13.first();
                            current_$13 = current_$13.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$12, (SubLObject)ebl.$list43);
                            sub_lits = current_$13.first();
                            final SubLObject more_supports;
                            current_$13 = (more_supports = current_$13.rest());
                            if (ebl.NIL != assertion_handles.assertion_p(support) && ebl.NIL == assertions_high.gaf_assertionP(support)) {
                                SubLObject current_$14;
                                final SubLObject datum_$13 = current_$14 = literalXtruth;
                                SubLObject literal = (SubLObject)ebl.NIL;
                                SubLObject truth_$17 = (SubLObject)ebl.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$14, datum_$13, (SubLObject)ebl.$list44);
                                literal = current_$14.first();
                                current_$14 = (truth_$17 = current_$14.rest());
                                SubLObject psn = (SubLObject)ebl.NIL;
                                SubLObject tv = (SubLObject)ebl.NIL;
                                final SubLObject pcase_var = truth_$17;
                                if (pcase_var.eql((SubLObject)ebl.$kw7$POS)) {
                                    tv = (SubLObject)ebl.$kw17$NEG;
                                    psn = Sequences.position(literal, ground_neg_lits, Symbols.symbol_function((SubLObject)ebl.EQUAL), (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)ebl.$kw17$NEG)) {
                                    tv = (SubLObject)ebl.$kw7$POS;
                                    psn = Sequences.position(literal, ground_pos_lits, Symbols.symbol_function((SubLObject)ebl.EQUAL), (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED, (SubLObject)ebl.UNPROVIDED);
                                }
                                compilations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(assertion, tv, psn), (SubLObject)ConsesLow.list(support, (SubLObject)ebl.$kw7$POS, (SubLObject)ebl.ZERO_INTEGER)), compilations);
                                compilations = ConsesLow.append(compilations, proof_tree_compilations(sub_tree));
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        sub_tree = cdolist_list_var.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(proof_tree, (SubLObject)ebl.$list40);
            }
        }
        return compilations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 9254L)
    public static SubLObject supporting_gafs(final SubLObject supports) {
        SubLObject pos_gafs = (SubLObject)ebl.NIL;
        SubLObject neg_gafs = (SubLObject)ebl.NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)ebl.NIL;
        support = cdolist_list_var.first();
        while (ebl.NIL != cdolist_list_var) {
            final SubLObject pcase_var = support.rest();
            if (pcase_var.eql((SubLObject)ebl.$kw7$POS)) {
                pos_gafs = (SubLObject)ConsesLow.cons(support.first(), pos_gafs);
            }
            else if (pcase_var.eql((SubLObject)ebl.$kw17$NEG)) {
                neg_gafs = (SubLObject)ConsesLow.cons(support.first(), neg_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(pos_gafs), Sequences.nreverse(neg_gafs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebl.lisp", position = 9518L)
    public static SubLObject bind_cnf_with_gafs(final SubLObject cnf, final SubLObject gaf_pos_lit, final SubLObject pos_support_gafs, SubLObject neg_support_gafs) {
        if (neg_support_gafs == ebl.UNPROVIDED) {
            neg_support_gafs = (SubLObject)ebl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        final SubLObject blist = unification.unify(pos_lits, (SubLObject)ConsesLow.cons(gaf_pos_lit, neg_support_gafs), (SubLObject)ebl.T, (SubLObject)ebl.UNPROVIDED);
        final SubLObject neg_lits = bindings.subst_bindings(blist, clauses.neg_lits(cnf));
        final SubLObject blist_2 = unification.unify(neg_lits, pos_support_gafs, (SubLObject)ebl.T, (SubLObject)ebl.UNPROVIDED);
        final SubLObject bound_cnf = bindings.subst_bindings(blist_2, bindings.subst_bindings(blist, cnf));
        if (ebl.NIL != bound_cnf && ebl.NIL != variables.fully_bound_p(bound_cnf)) {
            return bound_cnf;
        }
        if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.FOUR_INTEGER)) {
            Errors.sublisp_break((SubLObject)ebl.$str45$cnf_not_fully_bound__s, new SubLObject[] { bound_cnf });
        }
        else if (control_vars.$ebl_trace$.getDynamicValue(thread).numGE((SubLObject)ebl.THREE_INTEGER)) {
            Errors.warn((SubLObject)ebl.$str45$cnf_not_fully_bound__s, bound_cnf);
        }
        return (SubLObject)ebl.NIL;
    }
    
    public static SubLObject declare_ebl_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "compile_assertion_list", "COMPILE-ASSERTION-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "compile_rule_list", "COMPILE-RULE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "compile_rule_pair", "COMPILE-RULE-PAIR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "unify_cnf", "UNIFY-CNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "ebl_rules", "EBL-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "ebl_rule", "EBL-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "construct_one_inference_result_tree", "CONSTRUCT-ONE-INFERENCE-RESULT-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "sub_justs", "SUB-JUSTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "collect_justification_compilations", "COLLECT-JUSTIFICATION-COMPILATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "collect_justification_compilation", "COLLECT-JUSTIFICATION-COMPILATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "compile_proof_tree", "COMPILE-PROOF-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "perform_ebl_compilations", "PERFORM-EBL-COMPILATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "generalize_support", "GENERALIZE-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "ebl_merge_vnames", "EBL-MERGE-VNAMES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "ebl_mts", "EBL-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "cnf_literal", "CNF-LITERAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "proof_trees_compilations", "PROOF-TREES-COMPILATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "proof_tree_compilations", "PROOF-TREE-COMPILATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "supporting_gafs", "SUPPORTING-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebl", "bind_cnf_with_gafs", "BIND-CNF-WITH-GAFS", 3, 1, false);
        return (SubLObject)ebl.NIL;
    }
    
    public static SubLObject init_ebl_file() {
        ebl.$ebl_justs$ = SubLFiles.defparameter("*EBL-JUSTS*", (SubLObject)ebl.NIL);
        return (SubLObject)ebl.NIL;
    }
    
    public static SubLObject setup_ebl_file() {
        return (SubLObject)ebl.NIL;
    }
    
    public void declareFunctions() {
        declare_ebl_file();
    }
    
    public void initializeVariables() {
        init_ebl_file();
    }
    
    public void runTopLevelForms() {
        setup_ebl_file();
    }
    
    static {
        me = (SubLFile)new ebl();
        ebl.$ebl_justs$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-1"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-2"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-RULES"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT-1"), (SubLObject)SubLObjectFactory.makeSymbol("CNF-1"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT-2"), (SubLObject)SubLObjectFactory.makeSymbol("CNF-2"));
        $sym3$EBL_RULE = SubLObjectFactory.makeSymbol("EBL-RULE");
        $sym4$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("NEG-JUSTS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-JUSTS"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-LITS"));
        $kw7$POS = SubLObjectFactory.makeKeyword("POS");
        $sym8$SUB_JUSTS = SubLObjectFactory.makeSymbol("SUB-JUSTS");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-SUPPORTS"));
        $str10$sub_justs____s = SubLObjectFactory.makeString("sub-justs = ~s");
        $str11$ebl_rule___mts_____s____s = SubLObjectFactory.makeString("ebl rule & mts: ~%~s ~%~s");
        $str12$____ebl_rule___mts_____s____s = SubLObjectFactory.makeString("~%~%ebl rule & mts: ~%~s ~%~s");
        $sym13$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-1"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-2"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-1"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-1"), (SubLObject)SubLObjectFactory.makeSymbol("PSN-1"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-2"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-2"), (SubLObject)SubLObjectFactory.makeSymbol("PSN-2"));
        $kw17$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym18$INTERN = SubLObjectFactory.makeSymbol("INTERN");
        $list19 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("CNF-1"), (SubLObject)SubLObjectFactory.makeSymbol("VNAMES-1"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-1"), (SubLObject)SubLObjectFactory.makeSymbol("PSN-1"));
        $list20 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("CNF-2"), (SubLObject)SubLObjectFactory.makeSymbol("VNAMES-2"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-2"), (SubLObject)SubLObjectFactory.makeSymbol("PSN-2"));
        $str21$___cnf_1____s = SubLObjectFactory.makeString("~% cnf-1 : ~s");
        $str22$___cnf_2____s = SubLObjectFactory.makeString("~% cnf-2 : ~s");
        $str23$___lit_1____s = SubLObjectFactory.makeString("~% lit-1 : ~s");
        $str24$___lit_2____s = SubLObjectFactory.makeString("~% lit-2 : ~s");
        $str25$___blist____s = SubLObjectFactory.makeString("~% blist : ~s");
        $str26$___pos_lits_1____s = SubLObjectFactory.makeString("~% pos-lits-1 : ~s");
        $str27$___new_neg_lits_1____s = SubLObjectFactory.makeString("~% new-neg-lits-1 : ~s");
        $str28$___neg_lits_2____s = SubLObjectFactory.makeString("~% neg-lits-2 : ~s");
        $str29$_____parent_to_unify_bindings____ = SubLObjectFactory.makeString("~%~% parent-to-unify-bindings : ~s");
        $str30$___unify_to_child_bindings____s = SubLObjectFactory.makeString("~% unify-to-child-bindings : ~s");
        $str31$___parent_to_child_bindings____s = SubLObjectFactory.makeString("~% parent-to-child-bindings : ~s");
        $str32$___new_cnf____s = SubLObjectFactory.makeString("~% new-cnf : ~s");
        $str33$___vnames_1____s = SubLObjectFactory.makeString("~% vnames-1 : ~s");
        $str34$___vnames_2____s = SubLObjectFactory.makeString("~% vnames-2 : ~s");
        $str35$___new_names____s = SubLObjectFactory.makeString("~% new names : ~s");
        $str36$___new_rule____s = SubLObjectFactory.makeString("~% new rule : ~s");
        $str37$stop = SubLObjectFactory.makeString("stop");
        $list38 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("V1"), (SubLObject)SubLObjectFactory.makeSymbol("V2"));
        $sym39$PROOF_TREE_COMPILATIONS = SubLObjectFactory.makeSymbol("PROOF-TREE-COMPILATIONS");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-LIT-GAF.TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-TREES"));
        $list41 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("POS-LIT-GAF"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"));
        $sym42$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL.TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-SUPPORTS"));
        $list44 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"));
        $str45$cnf_not_fully_bound__s = SubLObjectFactory.makeString("cnf not fully bound ~s");
    }
}

/*

	Total time: 191 ms
	
*/