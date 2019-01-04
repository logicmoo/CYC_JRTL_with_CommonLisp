package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class term extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.term";
    public static final String myFingerPrint = "1d3c6c322b3ee925f4a29a397af3fafac82a2798300139c9fea6a5d855fe0ad6";
    private static final SubLSymbol $sym0$EL_FORT_P;
    private static final SubLList $list1;
    private static final SubLString $str2$Returns_t_iff_OBJECT_is_a_fort_or;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$HL_TERM_P;
    private static final SubLList $list5;
    private static final SubLString $str6$Returns_T_if_the_OBJ_is_a_valid_C;
    private static final SubLObject $const7$Relation;
    private static final SubLObject $const8$isa;
    private static final SubLObject $const9$SkolemFuncN;
    private static final SubLObject $const10$SkolemFunction;
    private static final SubLString $str11$SKF;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$CYC_VAR_;
    private static final SubLSymbol $sym14$VARIABLE_P;
    private static final SubLSymbol $sym15$EL_VAR_;
    private static final SubLSymbol $sym16$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const17$EverythingPSC;
    private static final SubLObject $const18$Function_Denotational;
    private static final SubLSymbol $sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_;
    private static final SubLSymbol $kw20$MAL_FN_NESTING;
    private static final SubLSymbol $sym21$FORMULA_WITH_NON_CONSTANT_OPERATOR_P;
    private static final SubLSymbol $kw22$NEG;
    private static final SubLSymbol $kw23$POS;
    private static final SubLObject $const24$ScalarInterval;
    private static final SubLSymbol $sym25$VAR_SPEC_;

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 580L)
    public static SubLObject el_fort_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != forts.fort_p(v_object) || term.NIL == v_object || term.NIL != el_utilities.el_formula_p(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 1010L)
    public static SubLObject kb_assertionP(final SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 1096L)
    public static SubLObject lisp_itemP(final SubLObject symbol) {
        return (SubLObject)SubLObjectFactory.makeBoolean(symbol.isChar() || symbol.isString() || symbol.isNumber() || symbol.isSymbol() || symbol.isCons());
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 1294L)
    public static SubLObject kb_predicateP(final SubLObject symbol) {
        if (term.NIL != forts.fort_p(symbol)) {
            return fort_types_interface.predicateP(symbol);
        }
        return represented_first_order_termP(symbol);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 1489L)
    public static SubLObject mt_designating_relationP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != forts.fort_p(v_term) && term.NIL != fort_types_interface.microtheory_designating_relation_p(v_term));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 1668L)
    public static SubLObject represented_first_order_termP(final SubLObject v_term) {
        if (term.NIL != v_term) {
            return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != forts.fort_p(v_term) || term.NIL != cycl_variables.el_varP(v_term) || term.NIL != function_termP(v_term));
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 1887L)
    public static SubLObject hl_term_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != cycl_utilities.reified_term_p(obj) || term.NIL != narts_high.naut_p(obj) || term.NIL != variables.variable_p(obj) || term.NIL != lisp_itemP(obj));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 2218L)
    public static SubLObject canonical_hl_termP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != hl_term_p(obj) && term.NIL == czer_utilities.reifiable_nautP(obj, (SubLObject)term.UNPROVIDED, (SubLObject)term.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 2391L)
    public static SubLObject first_order_termP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != represented_first_order_termP(v_term) || term.NIL != cycl_grammar.subl_atomic_term_p(v_term));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 2515L)
    public static SubLObject second_order_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == term.UNPROVIDED) {
            mt = (SubLObject)term.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != first_order_termP(v_term) || term.NIL != wff.el_wff_syntaxP(v_term, mt));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 2635L)
    public static SubLObject kb_relationP(final SubLObject v_object) {
        if (term.NIL != forts.fort_p(v_object)) {
            return kb_accessors.relationP(v_object);
        }
        if (term.NIL != nautP(v_object, (SubLObject)term.UNPROVIDED)) {
            return isa.nat_isaP(v_object, term.$const7$Relation, mt_vars.$anect_mt$.getGlobalValue(), (SubLObject)term.UNPROVIDED);
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 2862L)
    public static SubLObject reified_skolem_termP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != el_utilities.el_formula_p(v_term) && term.NIL != reified_skolem_fnP(cycl_utilities.formula_arg0(v_term)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 3082L)
    public static SubLObject reified_skolem_constant_termP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != reified_skolem_termP(v_term) && term.NIL == cycl_utilities.nat_args(v_term, (SubLObject)term.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 3230L)
    public static SubLObject skolem_constantP(final SubLObject v_term) {
        return reified_skolem_constant_termP(function_terms.term_of_unit(v_term));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 3418L)
    public static SubLObject reified_skolem_function_termP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != reified_skolem_termP(v_term) && term.NIL != cycl_utilities.nat_args(v_term, (SubLObject)term.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 3537L)
    public static SubLObject reified_skolem_fnP(final SubLObject func) {
        if (term.NIL != forts.fort_p(func)) {
            return fort_types_interface.skolem_function_p(func);
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 3716L)
    public static SubLObject reified_skolem_fn_in_any_mtP(final SubLObject fn, SubLObject robustP, SubLObject assumeP) {
        if (robustP == term.UNPROVIDED) {
            robustP = (SubLObject)term.NIL;
        }
        if (assumeP == term.UNPROVIDED) {
            assumeP = (SubLObject)term.NIL;
        }
        if (term.NIL != forts.fort_p(fn)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != fort_types_interface.skolem_function_p(fn) || term.NIL != ((term.NIL != robustP) ? kb_mapping_utilities.pred_u_v_holds_in_any_mt(term.$const8$isa, fn, term.$const9$SkolemFuncN, (SubLObject)term.UNPROVIDED, (SubLObject)term.UNPROVIDED, (SubLObject)term.UNPROVIDED) : term.NIL) || term.NIL != ((term.NIL != robustP) ? kb_mapping_utilities.pred_u_v_holds_in_any_mt(term.$const8$isa, fn, term.$const10$SkolemFunction, (SubLObject)term.UNPROVIDED, (SubLObject)term.UNPROVIDED, (SubLObject)term.UNPROVIDED) : term.NIL) || term.NIL != ((term.NIL != assumeP) ? ((term.NIL != sbhl_links.any_sbhl_predicate_links_p(fn, term.$const8$isa)) ? term.NIL : has_skolem_nameP(fn)) : term.NIL));
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 4218L)
    public static SubLObject has_skolem_nameP(final SubLObject fort) {
        if (term.NIL != constant_handles.constant_p(fort)) {
            final SubLObject name = constants_high.constant_name(fort);
            if (name.isString()) {
                return string_utilities.starts_with(name, (SubLObject)term.$str11$SKF);
            }
        }
        else if (term.NIL != nart_handles.nart_p(fort)) {
            return has_skolem_nameP(cycl_utilities.nat_functor(fort));
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 4462L)
    public static SubLObject fast_reified_skolemP(final SubLObject fort) {
        if (term.NIL != nart_handles.nart_p(fort)) {
            return fast_reified_skolemP(cycl_utilities.nat_functor(fort));
        }
        if (term.NIL != constant_handles.constant_p(fort) && term.NIL != has_skolem_nameP(fort)) {
            return reified_skolem_fn_in_any_mtP(fort, (SubLObject)term.UNPROVIDED, (SubLObject)term.UNPROVIDED);
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 4741L)
    public static SubLObject skolem_nartP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != nart_handles.nart_p(v_term) && term.NIL != reified_skolem_fnP(cycl_utilities.nat_functor(v_term)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 4937L)
    public static SubLObject fast_skolem_nartP(final SubLObject v_term) {
        if (term.NIL != nart_handles.nart_p(v_term)) {
            final SubLObject functor = cycl_utilities.nat_functor(v_term);
            if (term.NIL != has_skolem_nameP(functor)) {
                return skolem_nartP(v_term);
            }
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 5490L)
    public static SubLObject fast_skolem_natP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != fast_skolem_nartP(v_term) || (term.NIL != el_utilities.possibly_naut_p(v_term) && term.NIL != has_skolem_nameP(cycl_utilities.nat_functor(v_term)) && term.NIL != narts_high.naut_p(v_term)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 5757L)
    public static SubLObject skolem_termP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != reified_skolem_termP(v_term) || term.NIL != unreified_skolem_termP(v_term));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 5871L)
    public static SubLObject unreified_skolem_termP(final SubLObject v_term) {
        return unreified_skolem_fn_termP(v_term);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 5959L)
    public static SubLObject unreified_skolem_fn_termP(final SubLObject v_term) {
        if (term.NIL != list_utilities.proper_list_p(v_term) && Sequences.length(v_term).numGE((SubLObject)term.FOUR_INTEGER) && Sequences.length(v_term).numLE((SubLObject)term.FIVE_INTEGER)) {
            SubLObject fn = (SubLObject)term.NIL;
            SubLObject var_list = (SubLObject)term.NIL;
            SubLObject var = (SubLObject)term.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_term, v_term, (SubLObject)term.$list12);
            fn = v_term.first();
            SubLObject current = v_term.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_term, (SubLObject)term.$list12);
            var_list = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_term, (SubLObject)term.$list12);
            var = current.first();
            current = current.rest();
            final SubLObject seqvar = (SubLObject)(current.isCons() ? current.first() : term.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, v_term, (SubLObject)term.$list12);
            current = current.rest();
            final SubLObject num = (SubLObject)(current.isCons() ? current.first() : term.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, v_term, (SubLObject)term.$list12);
            current = current.rest();
            if (term.NIL == current) {
                return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != skolem_fn_functionP(fn) && var_list.isList() && term.NIL != cycl_variables.el_varP(var));
            }
            cdestructuring_bind.cdestructuring_bind_error(v_term, (SubLObject)term.$list12);
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 6347L)
    public static SubLObject unreified_skolem_term_vars(final SubLObject sk_term) {
        if (sk_term.isCons()) {
            return conses_high.second(sk_term);
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 6454L)
    public static SubLObject skolem_fn_functionP(final SubLObject symbol) {
        return subl_promotions.memberP(symbol, czer_vars.$skolem_function_functions$.getGlobalValue(), (SubLObject)term.UNPROVIDED, (SubLObject)term.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 6553L)
    public static SubLObject ground_nautP(final SubLObject naut, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym13$CYC_VAR_);
        }
        if (term.NIL != el_utilities.possibly_naut_p(naut) && term.NIL == el_utilities.sequence_var(naut, (SubLObject)term.UNPROVIDED) && term.NIL == list_utilities.cons_tree_find_if(varP, naut, (SubLObject)term.UNPROVIDED)) {
            return nautP(naut, varP);
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 6826L)
    public static SubLObject hl_ground_nautP(final SubLObject v_object) {
        return ground_nautP(v_object, Symbols.symbol_function((SubLObject)term.$sym14$VARIABLE_P));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 7016L)
    public static SubLObject closed_nautP(final SubLObject v_object, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym13$CYC_VAR_);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != nautP(v_object, varP) && term.NIL != el_utilities.closedP(v_object, varP));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 7146L)
    public static SubLObject open_nautP(final SubLObject v_object, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym13$CYC_VAR_);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != nautP(v_object, varP) && term.NIL == el_utilities.closedP(v_object, varP));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 7281L)
    public static SubLObject unground_nautP(final SubLObject nat, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym15$EL_VAR_);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != nautP(nat, varP) && term.NIL == ground_nautP(nat, varP));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 7415L)
    public static SubLObject first_order_nautP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != el_utilities.possibly_naut_p(v_object) && term.NIL != fort_types_interface.non_predicate_functionP(cycl_utilities.nat_functor(v_object)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 7603L)
    public static SubLObject kb_nautP(final SubLObject nat, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym14$VARIABLE_P);
        }
        return nautP(nat, varP);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 7690L)
    public static SubLObject nautP(final SubLObject nat, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym15$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (term.NIL != el_utilities.possibly_naut_p(nat)) {
            final SubLObject functor = cycl_utilities.nat_functor(nat);
            SubLObject nautP = Functions.funcall(varP, functor);
            if (term.NIL == nautP) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)term.$sym16$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(term.$const17$EverythingPSC, thread);
                    nautP = (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != fort_types_interface.non_predicate_functionP(functor) || term.NIL != ((term.NIL != forts.fort_p(functor)) ? term.NIL : meta_functionP(functor, (SubLObject)term.NIL)));
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return nautP;
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 8202L)
    public static SubLObject meta_functionP(final SubLObject functor, SubLObject mt) {
        if (mt == term.UNPROVIDED) {
            mt = (SubLObject)term.NIL;
        }
        if (term.NIL != forts.fort_p(functor)) {
            return meta_functionP(function_terms.term_of_unit(functor), mt);
        }
        if (term.NIL != nautP(functor, (SubLObject)term.UNPROVIDED)) {
            return genls.any_specP(term.$const18$Function_Denotational, kb_accessors.result_isa(cycl_utilities.nat_functor(functor), mt), (SubLObject)term.UNPROVIDED, (SubLObject)term.UNPROVIDED);
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 8482L)
    public static SubLObject function_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((term.NIL != relation_syntaxP(v_term, (SubLObject)term.UNPROVIDED) && (term.NIL != cycl_variables.cyc_varP(cycl_utilities.nat_functor(v_term)) || term.NIL != function_symbolP(cycl_utilities.nat_functor(v_term))) && (term.NIL == wff_vars.$within_wffP$.getDynamicValue(thread) || term.NIL != memoized_valid_fn_term_wrt_nestingP(v_term))) || term.NIL != cycl_utilities.find_ground_naut(v_term));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 8870L)
    public static SubLObject function_symbolP(final SubLObject symbol) {
        if (term.NIL != forts.fort_p(symbol)) {
            return fort_types_interface.functionP(symbol);
        }
        return represented_first_order_termP(symbol);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 9057L)
    public static SubLObject memoized_valid_fn_term_wrt_nestingP_internal(final SubLObject v_term) {
        return valid_fn_term_wrt_nestingP(v_term);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 9057L)
    public static SubLObject memoized_valid_fn_term_wrt_nestingP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)term.NIL;
        if (term.NIL == v_memoization_state) {
            return memoized_valid_fn_term_wrt_nestingP_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)term.$sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_, (SubLObject)term.UNPROVIDED);
        if (term.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)term.$sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_, (SubLObject)term.ONE_INTEGER, (SubLObject)term.NIL, (SubLObject)term.EQUAL, (SubLObject)term.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)term.$sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(memoized_valid_fn_term_wrt_nestingP_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)term.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 9177L)
    public static SubLObject valid_fn_term_wrt_nestingP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (term.NIL != function_terms.within_term_functional_complexity_cutoffP(v_term)) {
            return (SubLObject)term.T;
        }
        if (term.NIL != wff_vars.$within_wffP$.getDynamicValue(thread)) {
            wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)term.$kw20$MAL_FN_NESTING, v_term));
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 9373L)
    public static SubLObject sentenceP(final SubLObject formula, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym15$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (term.NIL != el_utilities.possibly_sentence_p(formula)) {
            final SubLObject predicate = cycl_utilities.formula_arg0(formula);
            SubLObject sentenceP = Functions.funcall(varP, predicate);
            if (term.NIL == sentenceP) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)term.$sym16$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(term.$const17$EverythingPSC, thread);
                    sentenceP = (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != fort_types_interface.sentential_relation_p(predicate) || term.NIL != fort_types_interface.predicateP(predicate) || term.NIL != fort_types_interface.isa_predicateP(predicate, (SubLObject)term.UNPROVIDED));
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return sentenceP;
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 9816L)
    public static SubLObject first_order_formula_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL == cycl_utilities.expression_find_if((SubLObject)term.$sym21$FORMULA_WITH_NON_CONSTANT_OPERATOR_P, v_object, (SubLObject)term.UNPROVIDED, (SubLObject)term.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 10345L)
    public static SubLObject formula_with_constant_operator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != el_utilities.el_formula_p(v_object) && term.NIL != constant_handles.constant_p(cycl_utilities.formula_operator(v_object)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 10486L)
    public static SubLObject formula_with_non_constant_operator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != el_utilities.el_formula_p(v_object) && term.NIL == constant_handles.constant_p(cycl_utilities.formula_operator(v_object)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 10638L)
    public static SubLObject first_order_clause_p(final SubLObject clause) {
        SubLObject index_var = (SubLObject)term.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject asent = (SubLObject)term.NIL;
        asent = cdolist_list_var.first();
        while (term.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)term.$kw22$NEG;
            if (term.NIL != higher_order_formula_p(asent)) {
                return (SubLObject)term.NIL;
            }
            index_var = Numbers.add(index_var, (SubLObject)term.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        index_var = (SubLObject)term.ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(clause);
        asent = (SubLObject)term.NIL;
        asent = cdolist_list_var.first();
        while (term.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)term.$kw23$POS;
            if (term.NIL != higher_order_formula_p(asent)) {
                return (SubLObject)term.NIL;
            }
            index_var = Numbers.add(index_var, (SubLObject)term.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        return (SubLObject)term.T;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 10921L)
    public static SubLObject first_order_assertion_p(final SubLObject assertion) {
        if (term.NIL != assertions_high.gaf_assertionP(assertion)) {
            return first_order_formula_p(assertions_high.gaf_hl_formula(assertion));
        }
        return first_order_clause_p(assertions_high.assertion_cnf(assertion));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 11269L)
    public static SubLObject higher_order_formula_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL == first_order_formula_p(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 11699L)
    public static SubLObject higher_order_clause_p(final SubLObject clause) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL == first_order_clause_p(clause));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 11903L)
    public static SubLObject higher_order_assertion_p(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL == first_order_assertion_p(assertion));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 12122L)
    public static SubLObject relation_syntaxP(final SubLObject v_term, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym13$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((term.NIL != czer_vars.$el_supports_dot_syntaxP$.getDynamicValue(thread) && term.NIL != dotted_argsP(v_term, varP) && term.NIL != el_utilities.wf_wrt_sequence_varsP(v_term)) || term.NIL != list_utilities.proper_list_p(v_term));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 12385L)
    public static SubLObject dotted_argsP(final SubLObject args, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym13$CYC_VAR_);
        }
        if (!args.isCons()) {
            return (SubLObject)term.NIL;
        }
        final SubLObject cdr = args.rest();
        if (cdr.isCons()) {
            return dotted_argsP(cdr, varP);
        }
        if (term.NIL == cdr) {
            return (SubLObject)term.NIL;
        }
        return Functions.funcall(varP, cdr);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 12638L)
    public static SubLObject scalar_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == term.UNPROVIDED) {
            mt = (SubLObject)term.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != collection_defns.ibqeP(v_term, mt) || (term.NIL != kb_control_vars.quant_kb_loaded_p() && term.NIL != isa.isaP(v_term, term.$const24$ScalarInterval, mt, (SubLObject)term.UNPROVIDED)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 12786L)
    public static SubLObject ground_fn_termP(final SubLObject fn_term) {
        return closed_fn_termP(fn_term);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 12994L)
    public static SubLObject closed_fn_termP(final SubLObject fn_term) {
        return closed_functional_expressionP(fn_term);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 13085L)
    public static SubLObject closed_functional_expressionP(final SubLObject v_object) {
        return el_utilities.closedP(v_object, (SubLObject)term.$sym25$VAR_SPEC_);
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 13177L)
    public static SubLObject var_specP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != cycl_variables.el_varP(v_object) || term.NIL != cycl_variables.kb_varP(v_object) || term.NIL != cycl_variables.permissible_keyword_varP(v_object) || term.NIL != cycl_variables.generic_arg_varP(v_object) || term.NIL != unreified_skolem_termP(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 13373L)
    public static SubLObject termP(final SubLObject v_object, SubLObject mt) {
        if (mt == term.UNPROVIDED) {
            mt = (SubLObject)term.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL != hl_term_p(v_object) || term.NIL != second_order_termP(v_object, mt));
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 13487L)
    public static SubLObject ground_termP(final SubLObject v_object, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym13$CYC_VAR_);
        }
        if (term.NIL != assertion_handles.assertion_p(v_object)) {
            return assertions_high.ground_assertionP(v_object);
        }
        if (term.NIL != nart_handles.nart_p(v_object)) {
            return ground_termP(narts_high.nart_el_formula(v_object), (SubLObject)term.UNPROVIDED);
        }
        if (v_object.isAtom()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL == Functions.funcall(varP, v_object));
        }
        if (term.NIL != second_order_termP(v_object, (SubLObject)term.UNPROVIDED)) {
            return el_utilities.groundP(v_object, varP);
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 13880L)
    public static SubLObject closed_termP(final SubLObject v_object, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym13$CYC_VAR_);
        }
        if (term.NIL != assertion_handles.assertion_p(v_object)) {
            return el_utilities.closedP(uncanonicalizer.assertion_el_formula(v_object), (SubLObject)term.UNPROVIDED);
        }
        if (term.NIL != nart_handles.nart_p(v_object)) {
            return closed_nautP(narts_high.nart_el_formula(v_object), (SubLObject)term.UNPROVIDED);
        }
        if (v_object.isAtom()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL == Functions.funcall(varP, v_object));
        }
        if (term.NIL != second_order_termP(v_object, (SubLObject)term.UNPROVIDED)) {
            return el_utilities.closedP(v_object, varP);
        }
        return (SubLObject)term.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/term.lisp", position = 14273L)
    public static SubLObject open_termP(final SubLObject v_object, SubLObject varP) {
        if (varP == term.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)term.$sym13$CYC_VAR_);
        }
        if (term.NIL != assertion_handles.assertion_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL == el_utilities.closedP(uncanonicalizer.assertion_el_formula(v_object), (SubLObject)term.UNPROVIDED));
        }
        if (term.NIL != nart_handles.nart_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL == closed_nautP(narts_high.nart_el_formula(v_object), (SubLObject)term.UNPROVIDED));
        }
        if (v_object.isAtom()) {
            return Functions.funcall(varP, v_object);
        }
        if (term.NIL != second_order_termP(v_object, (SubLObject)term.UNPROVIDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(term.NIL == el_utilities.closedP(v_object, varP));
        }
        return (SubLObject)term.NIL;
    }

    public static SubLObject declare_term_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "el_fort_p", "EL-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "kb_assertionP", "KB-ASSERTION?", 1, 0, false);
        new $kb_assertionP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "lisp_itemP", "LISP-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "kb_predicateP", "KB-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "mt_designating_relationP", "MT-DESIGNATING-RELATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "represented_first_order_termP", "REPRESENTED-FIRST-ORDER-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "hl_term_p", "HL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "canonical_hl_termP", "CANONICAL-HL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "first_order_termP", "FIRST-ORDER-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "second_order_termP", "SECOND-ORDER-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "kb_relationP", "KB-RELATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "reified_skolem_termP", "REIFIED-SKOLEM-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "reified_skolem_constant_termP", "REIFIED-SKOLEM-CONSTANT-TERM?", 1, 0, false);
        new $reified_skolem_constant_termP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "skolem_constantP", "SKOLEM-CONSTANT?", 1, 0, false);
        new $skolem_constantP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "reified_skolem_function_termP", "REIFIED-SKOLEM-FUNCTION-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "reified_skolem_fnP", "REIFIED-SKOLEM-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "reified_skolem_fn_in_any_mtP", "REIFIED-SKOLEM-FN-IN-ANY-MT?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "has_skolem_nameP", "HAS-SKOLEM-NAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "fast_reified_skolemP", "FAST-REIFIED-SKOLEM?", 1, 0, false);
        new $fast_reified_skolemP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "skolem_nartP", "SKOLEM-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "fast_skolem_nartP", "FAST-SKOLEM-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "fast_skolem_natP", "FAST-SKOLEM-NAT?", 1, 0, false);
        new $fast_skolem_natP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "skolem_termP", "SKOLEM-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "unreified_skolem_termP", "UNREIFIED-SKOLEM-TERM?", 1, 0, false);
        new $unreified_skolem_termP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "unreified_skolem_fn_termP", "UNREIFIED-SKOLEM-FN-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "unreified_skolem_term_vars", "UNREIFIED-SKOLEM-TERM-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "skolem_fn_functionP", "SKOLEM-FN-FUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "ground_nautP", "GROUND-NAUT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "hl_ground_nautP", "HL-GROUND-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "closed_nautP", "CLOSED-NAUT?", 1, 1, false);
        new $closed_nautP$UnaryFunction();
        new $closed_nautP$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "open_nautP", "OPEN-NAUT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "unground_nautP", "UNGROUND-NAUT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "first_order_nautP", "FIRST-ORDER-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "kb_nautP", "KB-NAUT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "nautP", "NAUT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "meta_functionP", "META-FUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "function_termP", "FUNCTION-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "function_symbolP", "FUNCTION-SYMBOL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "memoized_valid_fn_term_wrt_nestingP_internal", "MEMOIZED-VALID-FN-TERM-WRT-NESTING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "memoized_valid_fn_term_wrt_nestingP", "MEMOIZED-VALID-FN-TERM-WRT-NESTING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "valid_fn_term_wrt_nestingP", "VALID-FN-TERM-WRT-NESTING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "sentenceP", "SENTENCE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "first_order_formula_p", "FIRST-ORDER-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "formula_with_constant_operator_p", "FORMULA-WITH-CONSTANT-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "formula_with_non_constant_operator_p", "FORMULA-WITH-NON-CONSTANT-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "first_order_clause_p", "FIRST-ORDER-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "first_order_assertion_p", "FIRST-ORDER-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "higher_order_formula_p", "HIGHER-ORDER-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "higher_order_clause_p", "HIGHER-ORDER-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "higher_order_assertion_p", "HIGHER-ORDER-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "relation_syntaxP", "RELATION-SYNTAX?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "dotted_argsP", "DOTTED-ARGS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "scalar_termP", "SCALAR-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "ground_fn_termP", "GROUND-FN-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "closed_fn_termP", "CLOSED-FN-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "closed_functional_expressionP", "CLOSED-FUNCTIONAL-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "var_specP", "VAR-SPEC?", 1, 0, false);
        new $var_specP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "termP", "TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "ground_termP", "GROUND-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "closed_termP", "CLOSED-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term", "open_termP", "OPEN-TERM?", 1, 1, false);
        return (SubLObject)term.NIL;
    }

    public static SubLObject init_term_file() {
        return (SubLObject)term.NIL;
    }

    public static SubLObject setup_term_file() {
        utilities_macros.register_cyc_api_function((SubLObject)term.$sym0$EL_FORT_P, (SubLObject)term.$list1, (SubLObject)term.$str2$Returns_t_iff_OBJECT_is_a_fort_or, (SubLObject)term.NIL, (SubLObject)term.$list3);
        utilities_macros.register_cyc_api_function((SubLObject)term.$sym4$HL_TERM_P, (SubLObject)term.$list5, (SubLObject)term.$str6$Returns_T_if_the_OBJ_is_a_valid_C, (SubLObject)term.NIL, (SubLObject)term.$list3);
        memoization_state.note_memoized_function((SubLObject)term.$sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_);
        return (SubLObject)term.NIL;
    }

    public void declareFunctions() {
        declare_term_file();
    }

    public void initializeVariables() {
        init_term_file();
    }

    public void runTopLevelForms() {
        setup_term_file();
    }

    static {
        me = (SubLFile)new term();
        $sym0$EL_FORT_P = SubLObjectFactory.makeSymbol("EL-FORT-P");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str2$Returns_t_iff_OBJECT_is_a_fort_or = SubLObjectFactory.makeString("Returns t iff OBJECT is a fort or an EL formula.");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym4$HL_TERM_P = SubLObjectFactory.makeSymbol("HL-TERM-P");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJ"));
        $str6$Returns_T_if_the_OBJ_is_a_valid_C = SubLObjectFactory.makeString("Returns T if the OBJ is a valid CycL HL term.");
        $const7$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $const8$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const9$SkolemFuncN = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFuncN"));
        $const10$SkolemFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunction"));
        $str11$SKF = SubLObjectFactory.makeString("SKF");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("SEQVAR"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"));
        $sym13$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $sym14$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym15$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym16$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const17$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const18$Function_Denotational = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_ = SubLObjectFactory.makeSymbol("MEMOIZED-VALID-FN-TERM-WRT-NESTING?");
        $kw20$MAL_FN_NESTING = SubLObjectFactory.makeKeyword("MAL-FN-NESTING");
        $sym21$FORMULA_WITH_NON_CONSTANT_OPERATOR_P = SubLObjectFactory.makeSymbol("FORMULA-WITH-NON-CONSTANT-OPERATOR-P");
        $kw22$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw23$POS = SubLObjectFactory.makeKeyword("POS");
        $const24$ScalarInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScalarInterval"));
        $sym25$VAR_SPEC_ = SubLObjectFactory.makeSymbol("VAR-SPEC?");
    }

    public static final class $kb_assertionP$UnaryFunction extends UnaryFunction
    {
        public $kb_assertionP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KB-ASSERTION?"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return term.kb_assertionP(arg1);
        }
    }

    public static final class $reified_skolem_constant_termP$UnaryFunction extends UnaryFunction
    {
        public $reified_skolem_constant_termP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REIFIED-SKOLEM-CONSTANT-TERM?"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return term.reified_skolem_constant_termP(arg1);
        }
    }

    public static final class $skolem_constantP$UnaryFunction extends UnaryFunction
    {
        public $skolem_constantP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKOLEM-CONSTANT?"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return term.skolem_constantP(arg1);
        }
    }

    public static final class $fast_reified_skolemP$UnaryFunction extends UnaryFunction
    {
        public $fast_reified_skolemP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FAST-REIFIED-SKOLEM?"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return term.fast_reified_skolemP(arg1);
        }
    }

    public static final class $fast_skolem_natP$UnaryFunction extends UnaryFunction
    {
        public $fast_skolem_natP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FAST-SKOLEM-NAT?"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return term.fast_skolem_natP(arg1);
        }
    }

    public static final class $unreified_skolem_termP$UnaryFunction extends UnaryFunction
    {
        public $unreified_skolem_termP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("UNREIFIED-SKOLEM-TERM?"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return term.unreified_skolem_termP(arg1);
        }
    }

    public static final class $closed_nautP$UnaryFunction extends UnaryFunction
    {
        public $closed_nautP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLOSED-NAUT?"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return term.closed_nautP(arg1, (SubLObject)UNPROVIDED);
        }
    }

    public static final class $closed_nautP$BinaryFunction extends BinaryFunction
    {
        public $closed_nautP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLOSED-NAUT?"));
        }

        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return term.closed_nautP(arg1, arg2);
        }
    }

    public static final class $var_specP$UnaryFunction extends UnaryFunction
    {
        public $var_specP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VAR-SPEC?"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return term.var_specP(arg1);
        }
    }
}

/*

	Total time: 357 ms

*/