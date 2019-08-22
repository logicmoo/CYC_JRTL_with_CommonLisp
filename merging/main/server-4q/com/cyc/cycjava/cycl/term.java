/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.wf_wrt_sequence_varsP;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class term extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new term();

 public static final String myName = "com.cyc.cycjava.cycl.term";


    static private final SubLList $list1 = list(makeSymbol("OBJECT"));

    static private final SubLString $str2$Returns_t_iff_OBJECT_is_a_fort_or = makeString("Returns t iff OBJECT is a fort or an EL formula.");

    static private final SubLList $list3 = list(makeSymbol("BOOLEANP"));

    static private final SubLList $list5 = list(makeSymbol("OBJ"));

    static private final SubLString $str6$Returns_T_if_the_OBJ_is_a_valid_C = makeString("Returns T if the OBJ is a valid CycL HL ");









    static private final SubLString $$$SKF = makeString("SKF");

    static private final SubLList $list12 = list(makeSymbol("FN"), makeSymbol("VAR-LIST"), makeSymbol("VAR"), makeSymbol("&OPTIONAL"), makeSymbol("SEQVAR"), makeSymbol("NUM"));

    static private final SubLSymbol $sym13$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLSymbol $sym15$EL_VAR_ = makeSymbol("EL-VAR?");



    private static final SubLObject $$Function_Denotational = reader_make_constant_shell("Function-Denotational");

    static private final SubLSymbol $sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_ = makeSymbol("MEMOIZED-VALID-FN-TERM-WRT-NESTING?");

    private static final SubLSymbol $MAL_FN_NESTING = makeKeyword("MAL-FN-NESTING");

    private static final SubLSymbol FORMULA_WITH_NON_CONSTANT_OPERATOR_P = makeSymbol("FORMULA-WITH-NON-CONSTANT-OPERATOR-P");



    private static final SubLSymbol $sym25$VAR_SPEC_ = makeSymbol("VAR-SPEC?");

    // Definitions
    /**
     * Returns t iff OBJECT is a fort or an EL formula.
     */
    @LispMethod(comment = "Returns t iff OBJECT is a fort or an EL formula.")
    public static final SubLObject el_fort_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) || (NIL == v_object)) || (NIL != el_formula_p(v_object)));
    }

    // Definitions
    /**
     * Returns t iff OBJECT is a fort or an EL formula.
     */
    @LispMethod(comment = "Returns t iff OBJECT is a fort or an EL formula.")
    public static SubLObject el_fort_p(final SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) || (NIL == v_object)) || (NIL != el_formula_p(v_object)));
    }

    public static final SubLObject kb_assertionP_alt(SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }

    public static SubLObject kb_assertionP(final SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }

    public static final SubLObject lisp_itemP_alt(SubLObject symbol) {
        return makeBoolean((((symbol.isChar() || symbol.isString()) || symbol.isNumber()) || symbol.isSymbol()) || symbol.isCons());
    }

    public static SubLObject lisp_itemP(final SubLObject symbol) {
        return makeBoolean((((symbol.isChar() || symbol.isString()) || symbol.isNumber()) || symbol.isSymbol()) || symbol.isCons());
    }

    public static final SubLObject kb_predicateP_alt(SubLObject symbol) {
        if (NIL != forts.fort_p(symbol)) {
            return fort_types_interface.predicateP(symbol);
        } else {
            return com.cyc.cycjava.cycl.term.represented_first_order_termP(symbol);
        }
    }

    public static SubLObject kb_predicateP(final SubLObject symbol) {
        if (NIL != forts.fort_p(symbol)) {
            return fort_types_interface.predicateP(symbol);
        }
        return represented_first_order_termP(symbol);
    }

    public static final SubLObject mt_designating_relationP_alt(SubLObject v_term) {
        return makeBoolean((NIL != forts.fort_p(v_term)) && (NIL != fort_types_interface.microtheory_designating_relation_p(v_term)));
    }

    public static SubLObject mt_designating_relationP(final SubLObject v_term) {
        return makeBoolean((NIL != forts.fort_p(v_term)) && (NIL != fort_types_interface.microtheory_designating_relation_p(v_term)));
    }

    public static final SubLObject represented_first_order_termP_alt(SubLObject v_term) {
        if (NIL != v_term) {
            return makeBoolean(((NIL != forts.fort_p(v_term)) || (NIL != cycl_variables.el_varP(v_term))) || (NIL != com.cyc.cycjava.cycl.term.function_termP(v_term)));
        }
        return NIL;
    }

    public static SubLObject represented_first_order_termP(final SubLObject v_term) {
        if (NIL != v_term) {
            return makeBoolean(((NIL != forts.fort_p(v_term)) || (NIL != cycl_variables.el_varP(v_term))) || (NIL != function_termP(v_term)));
        }
        return NIL;
    }

    /**
     * Returns T if the OBJ is a valid CycL HL term.
     */
    @LispMethod(comment = "Returns T if the OBJ is a valid CycL HL term.")
    public static final SubLObject hl_term_p_alt(SubLObject obj) {
        return makeBoolean((((NIL != cycl_utilities.reified_term_p(obj)) || (NIL != narts_high.naut_p(obj))) || (NIL != variables.variable_p(obj))) || (NIL != com.cyc.cycjava.cycl.term.lisp_itemP(obj)));
    }

    /**
     * Returns T if the OBJ is a valid CycL HL term.
     */
    @LispMethod(comment = "Returns T if the OBJ is a valid CycL HL term.")
    public static SubLObject hl_term_p(final SubLObject obj) {
        return makeBoolean((((NIL != cycl_utilities.reified_term_p(obj)) || (NIL != narts_high.naut_p(obj))) || (NIL != variables.variable_p(obj))) || (NIL != lisp_itemP(obj)));
    }

    public static SubLObject canonical_hl_termP(final SubLObject obj) {
        return makeBoolean((NIL != hl_term_p(obj)) && (NIL == czer_utilities.reifiable_nautP(obj, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject first_order_termP_alt(SubLObject v_term) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.term.represented_first_order_termP(v_term)) || (NIL != cycl_grammar.subl_atomic_term_p(v_term)));
    }

    public static SubLObject first_order_termP(final SubLObject v_term) {
        return makeBoolean((NIL != represented_first_order_termP(v_term)) || (NIL != cycl_grammar.subl_atomic_term_p(v_term)));
    }

    public static final SubLObject second_order_termP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.term.first_order_termP(v_term)) || (NIL != wff.el_wff_syntaxP(v_term, mt)));
    }

    public static SubLObject second_order_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != first_order_termP(v_term)) || (NIL != wff.el_wff_syntaxP(v_term, mt)));
    }

    public static final SubLObject kb_relationP_alt(SubLObject v_object) {
        if (NIL != forts.fort_p(v_object)) {
            return kb_accessors.relationP(v_object);
        } else {
            if (NIL != com.cyc.cycjava.cycl.term.nautP(v_object, UNPROVIDED)) {
                return isa.nat_isaP(v_object, $$Relation, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject kb_relationP(final SubLObject v_object) {
        if (NIL != forts.fort_p(v_object)) {
            return kb_accessors.relationP(v_object);
        }
        if (NIL != nautP(v_object, UNPROVIDED)) {
            return isa.nat_isaP(v_object, $$Relation, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * e.g. (#$SKF-1234 #$Muffet)
     */
    @LispMethod(comment = "e.g. (#$SKF-1234 #$Muffet)")
    public static final SubLObject reified_skolem_termP_alt(SubLObject v_term) {
        return makeBoolean((NIL != el_formula_p(v_term)) && (NIL != com.cyc.cycjava.cycl.term.reified_skolem_fnP(cycl_utilities.formula_arg0(v_term))));
    }

    /**
     * e.g. (#$SKF-1234 #$Muffet)
     */
    @LispMethod(comment = "e.g. (#$SKF-1234 #$Muffet)")
    public static SubLObject reified_skolem_termP(final SubLObject v_term) {
        return makeBoolean((NIL != el_formula_p(v_term)) && (NIL != reified_skolem_fnP(cycl_utilities.formula_arg0(v_term))));
    }

    /**
     * e.g. (#$SKF-1234)
     */
    @LispMethod(comment = "e.g. (#$SKF-1234)")
    public static final SubLObject reified_skolem_constant_termP_alt(SubLObject v_term) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.term.reified_skolem_termP(v_term)) && (NIL == cycl_utilities.nat_args(v_term, UNPROVIDED)));
    }

    /**
     * e.g. (#$SKF-1234)
     */
    @LispMethod(comment = "e.g. (#$SKF-1234)")
    public static SubLObject reified_skolem_constant_termP(final SubLObject v_term) {
        return makeBoolean((NIL != reified_skolem_termP(v_term)) && (NIL == cycl_utilities.nat_args(v_term, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff TERM is a reified skolem function (a nart) with zero arity.
     */
    @LispMethod(comment = "@return boolean; t iff TERM is a reified skolem function (a nart) with zero arity.")
    public static final SubLObject skolem_constantP_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.term.reified_skolem_constant_termP(function_terms.term_of_unit(v_term));
    }

    /**
     *
     *
     * @return boolean; t iff TERM is a reified skolem function (a nart) with zero arity.
     */
    @LispMethod(comment = "@return boolean; t iff TERM is a reified skolem function (a nart) with zero arity.")
    public static SubLObject skolem_constantP(final SubLObject v_term) {
        return reified_skolem_constant_termP(function_terms.term_of_unit(v_term));
    }

    public static final SubLObject reified_skolem_function_termP_alt(SubLObject v_term) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.term.reified_skolem_termP(v_term)) && (NIL != cycl_utilities.nat_args(v_term, UNPROVIDED)));
    }

    public static SubLObject reified_skolem_function_termP(final SubLObject v_term) {
        return makeBoolean((NIL != reified_skolem_termP(v_term)) && (NIL != cycl_utilities.nat_args(v_term, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff FUNC (a fort) is an instance of #$SkolemFunction.
     */
    @LispMethod(comment = "@return boolean; t iff FUNC (a fort) is an instance of #$SkolemFunction.")
    public static final SubLObject reified_skolem_fnP_alt(SubLObject func) {
        if (NIL != forts.fort_p(func)) {
            return fort_types_interface.skolem_function_p(func);
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff FUNC (a fort) is an instance of #$SkolemFunction.
     */
    @LispMethod(comment = "@return boolean; t iff FUNC (a fort) is an instance of #$SkolemFunction.")
    public static SubLObject reified_skolem_fnP(final SubLObject func) {
        if (NIL != forts.fort_p(func)) {
            return fort_types_interface.skolem_function_p(func);
        }
        return NIL;
    }

    public static final SubLObject reified_skolem_fn_in_any_mtP_alt(SubLObject fn, SubLObject robustP, SubLObject assumeP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        if (assumeP == UNPROVIDED) {
            assumeP = NIL;
        }
        if (NIL != forts.fort_p(fn)) {
            return makeBoolean((((NIL != fort_types_interface.skolem_function_p(fn)) || (NIL != (NIL != robustP ? ((SubLObject) (kb_mapping_utilities.pred_u_v_holds_in_any_mt($$isa, fn, $$SkolemFuncN, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL))) || (NIL != (NIL != robustP ? ((SubLObject) (kb_mapping_utilities.pred_u_v_holds_in_any_mt($$isa, fn, $$SkolemFunction, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL))) || (NIL != (NIL != assumeP ? ((SubLObject) (NIL != sbhl_links.any_sbhl_predicate_links_p(fn, $$isa) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.term.has_skolem_nameP(fn))) : NIL)));
        }
        return NIL;
    }

    public static SubLObject reified_skolem_fn_in_any_mtP(final SubLObject fn, SubLObject robustP, SubLObject assumeP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        if (assumeP == UNPROVIDED) {
            assumeP = NIL;
        }
        if (NIL != forts.fort_p(fn)) {
            return makeBoolean((((NIL != fort_types_interface.skolem_function_p(fn)) || (NIL != (NIL != robustP ? kb_mapping_utilities.pred_u_v_holds_in_any_mt($$isa, fn, $$SkolemFuncN, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL))) || (NIL != (NIL != robustP ? kb_mapping_utilities.pred_u_v_holds_in_any_mt($$isa, fn, $$SkolemFunction, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL))) || (NIL != (NIL != assumeP ? NIL != sbhl_links.any_sbhl_predicate_links_p(fn, $$isa) ? NIL : has_skolem_nameP(fn) : NIL)));
        }
        return NIL;
    }

    public static final SubLObject has_skolem_nameP_alt(SubLObject fort) {
        if (NIL != constant_p(fort)) {
            {
                SubLObject name = constants_high.constant_name(fort);
                if (name.isString()) {
                    return string_utilities.starts_with(name, $$$SKF);
                }
            }
        } else {
            if (NIL != nart_handles.nart_p(fort)) {
                return com.cyc.cycjava.cycl.term.has_skolem_nameP(cycl_utilities.nat_functor(fort));
            }
        }
        return NIL;
    }

    public static SubLObject has_skolem_nameP(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            final SubLObject name = constants_high.constant_name(fort);
            if (name.isString()) {
                return string_utilities.starts_with(name, $$$SKF);
            }
        } else
            if (NIL != nart_handles.nart_p(fort)) {
                return has_skolem_nameP(cycl_utilities.nat_functor(fort));
            }

        return NIL;
    }

    public static final SubLObject fast_reified_skolemP_alt(SubLObject fort) {
        if (NIL != nart_handles.nart_p(fort)) {
            return com.cyc.cycjava.cycl.term.fast_reified_skolemP(cycl_utilities.nat_functor(fort));
        } else {
            if (NIL != constant_p(fort)) {
                if (NIL != com.cyc.cycjava.cycl.term.has_skolem_nameP(fort)) {
                    return com.cyc.cycjava.cycl.term.reified_skolem_fn_in_any_mtP(fort, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject fast_reified_skolemP(final SubLObject fort) {
        if (NIL != nart_handles.nart_p(fort)) {
            return fast_reified_skolemP(cycl_utilities.nat_functor(fort));
        }
        if ((NIL != constant_p(fort)) && (NIL != has_skolem_nameP(fort))) {
            return reified_skolem_fn_in_any_mtP(fort, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether TERM is a nart with a skolem function as its functor.
     */
    @LispMethod(comment = "@return booleanp; whether TERM is a nart with a skolem function as its functor.")
    public static final SubLObject skolem_nartP_alt(SubLObject v_term) {
        return makeBoolean((NIL != nart_handles.nart_p(v_term)) && (NIL != com.cyc.cycjava.cycl.term.reified_skolem_fnP(cycl_utilities.nat_functor(v_term))));
    }

    /**
     *
     *
     * @return booleanp; whether TERM is a nart with a skolem function as its functor.
     */
    @LispMethod(comment = "@return booleanp; whether TERM is a nart with a skolem function as its functor.")
    public static SubLObject skolem_nartP(final SubLObject v_term) {
        return makeBoolean((NIL != nart_handles.nart_p(v_term)) && (NIL != reified_skolem_fnP(cycl_utilities.nat_functor(v_term))));
    }

    /**
     * Like @xref skolem-nart except this assumes that all skolem functions begin with SKF.
     */
    @LispMethod(comment = "Like @xref skolem-nart except this assumes that all skolem functions begin with SKF.")
    public static final SubLObject fast_skolem_nartP_alt(SubLObject v_term) {
        if (NIL != nart_handles.nart_p(v_term)) {
            {
                SubLObject functor = cycl_utilities.nat_functor(v_term);
                if (NIL != com.cyc.cycjava.cycl.term.has_skolem_nameP(functor)) {
                    return com.cyc.cycjava.cycl.term.skolem_nartP(v_term);
                }
            }
        }
        return NIL;
    }

    /**
     * Like @xref skolem-nart except this assumes that all skolem functions begin with SKF.
     */
    @LispMethod(comment = "Like @xref skolem-nart except this assumes that all skolem functions begin with SKF.")
    public static SubLObject fast_skolem_nartP(final SubLObject v_term) {
        if (NIL != nart_handles.nart_p(v_term)) {
            final SubLObject functor = cycl_utilities.nat_functor(v_term);
            if (NIL != has_skolem_nameP(functor)) {
                return skolem_nartP(v_term);
            }
        }
        return NIL;
    }

    /**
     * Like @xref skolem-nart except this assumes that all skolem functions begin with SKF.
     */
    @LispMethod(comment = "Like @xref skolem-nart except this assumes that all skolem functions begin with SKF.")
    public static final SubLObject fast_skolem_natP_alt(SubLObject v_term) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.term.fast_skolem_nartP(v_term)) || ((NIL != narts_high.naut_p(v_term)) && (NIL != com.cyc.cycjava.cycl.term.has_skolem_nameP(cycl_utilities.nat_functor(v_term)))));
    }

    @LispMethod(comment = "Like @xref skolem-nart except this assumes that all skolem functions begin with SKF.")
    public static SubLObject fast_skolem_natP(final SubLObject v_term) {
        return makeBoolean((NIL != fast_skolem_nartP(v_term)) || (((NIL != possibly_naut_p(v_term)) && (NIL != has_skolem_nameP(cycl_utilities.nat_functor(v_term)))) && (NIL != narts_high.naut_p(v_term))));
    }

    public static final SubLObject skolem_termP_alt(SubLObject v_term) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.term.reified_skolem_termP(v_term)) || (NIL != com.cyc.cycjava.cycl.term.unreified_skolem_termP(v_term)));
    }

    public static SubLObject skolem_termP(final SubLObject v_term) {
        return makeBoolean((NIL != reified_skolem_termP(v_term)) || (NIL != unreified_skolem_termP(v_term)));
    }

    public static final SubLObject unreified_skolem_termP_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.term.unreified_skolem_fn_termP(v_term);
    }

    public static SubLObject unreified_skolem_termP(final SubLObject v_term) {
        return unreified_skolem_fn_termP(v_term);
    }

    public static final SubLObject unreified_skolem_fn_termP_alt(SubLObject v_term) {
        if (((NIL != list_utilities.proper_list_p(v_term)) && length(v_term).numGE(FOUR_INTEGER)) && length(v_term).numLE(FIVE_INTEGER)) {
            {
                SubLObject datum = v_term;
                SubLObject current = datum;
                SubLObject fn = NIL;
                SubLObject var_list = NIL;
                SubLObject var = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt12);
                fn = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt12);
                var_list = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt12);
                var = current.first();
                current = current.rest();
                {
                    SubLObject seqvar = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt12);
                    current = current.rest();
                    {
                        SubLObject num = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt12);
                        current = current.rest();
                        if (NIL == current) {
                            return makeBoolean(((NIL != com.cyc.cycjava.cycl.term.skolem_fn_functionP(fn)) && var_list.isList()) && (NIL != cycl_variables.el_varP(var)));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt12);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject unreified_skolem_fn_termP(final SubLObject v_term) {
        if (((NIL != list_utilities.proper_list_p(v_term)) && length(v_term).numGE(FOUR_INTEGER)) && length(v_term).numLE(FIVE_INTEGER)) {
            SubLObject fn = NIL;
            SubLObject var_list = NIL;
            SubLObject var = NIL;
            destructuring_bind_must_consp(v_term, v_term, $list12);
            fn = v_term.first();
            SubLObject current = v_term.rest();
            destructuring_bind_must_consp(current, v_term, $list12);
            var_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_term, $list12);
            var = current.first();
            current = current.rest();
            final SubLObject seqvar = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, v_term, $list12);
            current = current.rest();
            final SubLObject num = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, v_term, $list12);
            current = current.rest();
            if (NIL == current) {
                return makeBoolean(((NIL != skolem_fn_functionP(fn)) && var_list.isList()) && (NIL != cycl_variables.el_varP(var)));
            }
            cdestructuring_bind_error(v_term, $list12);
        }
        return NIL;
    }

    public static final SubLObject unreified_skolem_term_vars_alt(SubLObject sk_term) {
        if (sk_term.isCons()) {
            return second(sk_term);
        }
        return NIL;
    }

    public static SubLObject unreified_skolem_term_vars(final SubLObject sk_term) {
        if (sk_term.isCons()) {
            return second(sk_term);
        }
        return NIL;
    }

    public static final SubLObject skolem_fn_functionP_alt(SubLObject symbol) {
        return subl_promotions.memberP(symbol, czer_vars.$skolem_function_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject skolem_fn_functionP(final SubLObject symbol) {
        return subl_promotions.memberP(symbol, czer_vars.$skolem_function_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ground_nautP_alt(SubLObject naut, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        if (((NIL != possibly_naut_p(naut)) && (NIL == sequence_var(naut, UNPROVIDED))) && (NIL == list_utilities.cons_tree_find_if(varP, naut, UNPROVIDED))) {
            return com.cyc.cycjava.cycl.term.nautP(naut, varP);
        }
        return NIL;
    }

    public static SubLObject ground_nautP(final SubLObject naut, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        if (((NIL != possibly_naut_p(naut)) && (NIL == sequence_var(naut, UNPROVIDED))) && (NIL == list_utilities.cons_tree_find_if(varP, naut, UNPROVIDED))) {
            return nautP(naut, varP);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a naut which is ground at the HL,
    i.e. contains no HL variables.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a naut which is ground at the HL,\r\ni.e. contains no HL variables.")
    public static final SubLObject hl_ground_nautP_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.term.ground_nautP(v_object, symbol_function(VARIABLE_P));
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a naut which is ground at the HL,
    i.e. contains no HL variables.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a naut which is ground at the HL,\r\ni.e. contains no HL variables.")
    public static SubLObject hl_ground_nautP(final SubLObject v_object) {
        return ground_nautP(v_object, symbol_function(VARIABLE_P));
    }

    public static final SubLObject closed_nautP_alt(SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.term.nautP(v_object, varP)) && (NIL != closedP(v_object, varP)));
    }

    public static SubLObject closed_nautP(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        return makeBoolean((NIL != nautP(v_object, varP)) && (NIL != closedP(v_object, varP)));
    }

    public static final SubLObject open_nautP_alt(SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.term.nautP(v_object, varP)) && (NIL == closedP(v_object, varP)));
    }

    public static SubLObject open_nautP(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        return makeBoolean((NIL != nautP(v_object, varP)) && (NIL == closedP(v_object, varP)));
    }

    public static final SubLObject unground_nautP_alt(SubLObject nat, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym15$EL_VAR_);
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.term.nautP(nat, varP)) && (NIL == com.cyc.cycjava.cycl.term.ground_nautP(nat, varP)));
    }

    public static SubLObject unground_nautP(final SubLObject nat, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym15$EL_VAR_);
        }
        return makeBoolean((NIL != nautP(nat, varP)) && (NIL == ground_nautP(nat, varP)));
    }

    /**
     * is <object> a first-order non-atomic unreified term?
     */
    @LispMethod(comment = "is <object> a first-order non-atomic unreified term?")
    public static final SubLObject first_order_nautP_alt(SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != fort_types_interface.non_predicate_functionP(cycl_utilities.nat_functor(v_object))));
    }

    @LispMethod(comment = "is <object> a first-order non-atomic unreified term?")
    public static SubLObject first_order_nautP(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != fort_types_interface.non_predicate_functionP(cycl_utilities.nat_functor(v_object))));
    }/**
     * is <object> a first-order non-atomic unreified term?
     */


    public static final SubLObject kb_nautP_alt(SubLObject nat, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return com.cyc.cycjava.cycl.term.nautP(nat, varP);
    }

    public static SubLObject kb_nautP(final SubLObject nat, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return nautP(nat, varP);
    }

    public static final SubLObject nautP_alt(SubLObject nat, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym15$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != possibly_naut_p(nat)) {
                {
                    SubLObject functor = cycl_utilities.nat_functor(nat);
                    SubLObject nautP = funcall(varP, functor);
                    if (NIL == nautP) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                nautP = makeBoolean((NIL != fort_types_interface.non_predicate_functionP(functor)) || (NIL != (NIL != forts.fort_p(functor) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.term.meta_functionP(functor, NIL))));
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return nautP;
                }
            }
            return NIL;
        }
    }

    public static SubLObject nautP(final SubLObject nat, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym15$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != possibly_naut_p(nat)) {
            final SubLObject functor = cycl_utilities.nat_functor(nat);
            SubLObject nautP = funcall(varP, functor);
            if (NIL == nautP) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    nautP = makeBoolean((NIL != fort_types_interface.non_predicate_functionP(functor)) || (NIL != (NIL != forts.fort_p(functor) ? NIL : meta_functionP(functor, NIL))));
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return nautP;
        }
        return NIL;
    }

    /**
     * is FUNCTOR a function-denoting expression?
     */
    @LispMethod(comment = "is FUNCTOR a function-denoting expression?")
    public static final SubLObject meta_functionP_alt(SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(functor)) {
            return com.cyc.cycjava.cycl.term.meta_functionP(function_terms.term_of_unit(functor), mt);
        } else {
            if (NIL != com.cyc.cycjava.cycl.term.nautP(functor, UNPROVIDED)) {
                return genls.any_specP($$Function_Denotational, kb_accessors.result_isa(cycl_utilities.nat_functor(functor), mt), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "is FUNCTOR a function-denoting expression?")
    public static SubLObject meta_functionP(final SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(functor)) {
            return meta_functionP(function_terms.term_of_unit(functor), mt);
        }
        if (NIL != nautP(functor, UNPROVIDED)) {
            return genls.any_specP($$Function_Denotational, kb_accessors.result_isa(cycl_utilities.nat_functor(functor), mt), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }/**
     * is FUNCTOR a function-denoting expression?
     */


    /**
     *
     *
     * @return boolean; t iff TERM is a nat.
     */
    @LispMethod(comment = "@return boolean; t iff TERM is a nat.")
    public static final SubLObject function_termP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((((NIL != com.cyc.cycjava.cycl.term.relation_syntaxP(v_term, UNPROVIDED)) && ((NIL != cycl_variables.cyc_varP(cycl_utilities.nat_functor(v_term))) || (NIL != com.cyc.cycjava.cycl.term.function_symbolP(cycl_utilities.nat_functor(v_term))))) && ((NIL == wff_vars.$within_wffP$.getDynamicValue(thread)) || (NIL != com.cyc.cycjava.cycl.term.memoized_valid_fn_term_wrt_nestingP(v_term)))) || (NIL != cycl_utilities.find_ground_naut(v_term)));
        }
    }

    /**
     *
     *
     * @return boolean; t iff TERM is a nat.
     */
    @LispMethod(comment = "@return boolean; t iff TERM is a nat.")
    public static SubLObject function_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((NIL != relation_syntaxP(v_term, UNPROVIDED)) && ((NIL != cycl_variables.cyc_varP(cycl_utilities.nat_functor(v_term))) || (NIL != function_symbolP(cycl_utilities.nat_functor(v_term))))) && ((NIL == wff_vars.$within_wffP$.getDynamicValue(thread)) || (NIL != memoized_valid_fn_term_wrt_nestingP(v_term)))) || (NIL != cycl_utilities.find_ground_naut(v_term)));
    }

    public static final SubLObject function_symbolP_alt(SubLObject symbol) {
        if (NIL != forts.fort_p(symbol)) {
            return fort_types_interface.functionP(symbol);
        } else {
            return com.cyc.cycjava.cycl.term.represented_first_order_termP(symbol);
        }
    }

    public static SubLObject function_symbolP(final SubLObject symbol) {
        if (NIL != forts.fort_p(symbol)) {
            return fort_types_interface.functionP(symbol);
        }
        return represented_first_order_termP(symbol);
    }

    public static final SubLObject memoized_valid_fn_term_wrt_nestingP_internal_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.term.valid_fn_term_wrt_nestingP(v_term);
    }

    public static SubLObject memoized_valid_fn_term_wrt_nestingP_internal(final SubLObject v_term) {
        return valid_fn_term_wrt_nestingP(v_term);
    }

    public static final SubLObject memoized_valid_fn_term_wrt_nestingP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.term.memoized_valid_fn_term_wrt_nestingP_internal(v_term);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw20$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw20$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.term.memoized_valid_fn_term_wrt_nestingP_internal(v_term)));
                        memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject memoized_valid_fn_term_wrt_nestingP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_valid_fn_term_wrt_nestingP_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_valid_fn_term_wrt_nestingP_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject valid_fn_term_wrt_nestingP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != function_terms.within_term_functional_complexity_cutoffP(v_term)) {
                return T;
            } else {
                if (NIL != wff_vars.$within_wffP$.getDynamicValue(thread)) {
                    wff.note_wff_violation(list($MAL_FN_NESTING, v_term));
                }
            }
            return NIL;
        }
    }

    public static SubLObject valid_fn_term_wrt_nestingP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != function_terms.within_term_functional_complexity_cutoffP(v_term)) {
            return T;
        }
        if (NIL != wff_vars.$within_wffP$.getDynamicValue(thread)) {
            wff.note_wff_violation(list($MAL_FN_NESTING, v_term));
        }
        return NIL;
    }

    public static final SubLObject sentenceP_alt(SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym15$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != possibly_sentence_p(formula)) {
                {
                    SubLObject predicate = cycl_utilities.formula_arg0(formula);
                    SubLObject sentenceP = funcall(varP, predicate);
                    if (NIL == sentenceP) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                sentenceP = makeBoolean(((NIL != fort_types_interface.sentential_relation_p(predicate)) || (NIL != fort_types_interface.predicateP(predicate))) || (NIL != fort_types_interface.isa_predicateP(predicate, UNPROVIDED)));
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return sentenceP;
                }
            }
            return NIL;
        }
    }

    public static SubLObject sentenceP(final SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym15$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != possibly_sentence_p(formula)) {
            final SubLObject predicate = cycl_utilities.formula_arg0(formula);
            SubLObject sentenceP = funcall(varP, predicate);
            if (NIL == sentenceP) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    sentenceP = makeBoolean(((NIL != fort_types_interface.sentential_relation_p(predicate)) || (NIL != fort_types_interface.predicateP(predicate))) || (NIL != fort_types_interface.isa_predicateP(predicate, UNPROVIDED)));
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return sentenceP;
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a CycL formula (not necessarily
    well-formed) that could be expressed in first-order logic.  This means
    no non-constants in the arg0 position.  Non-constants in the arg0
    position would imply either quantification into the predicate or
    function position, or a relation-denoting function.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a CycL formula (not necessarily\r\nwell-formed) that could be expressed in first-order logic.  This means\r\nno non-constants in the arg0 position.  Non-constants in the arg0\r\nposition would imply either quantification into the predicate or\r\nfunction position, or a relation-denoting function.")
    public static final SubLObject first_order_formula_p_alt(SubLObject v_object) {
        return makeBoolean(NIL == cycl_utilities.expression_find_if(FORMULA_WITH_NON_CONSTANT_OPERATOR_P, v_object, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a CycL formula (not necessarily
    well-formed) that could be expressed in first-order logic.  This means
    no non-constants in the arg0 position.  Non-constants in the arg0
    position would imply either quantification into the predicate or
    function position, or a relation-denoting function.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a CycL formula (not necessarily\r\nwell-formed) that could be expressed in first-order logic.  This means\r\nno non-constants in the arg0 position.  Non-constants in the arg0\r\nposition would imply either quantification into the predicate or\r\nfunction position, or a relation-denoting function.")
    public static SubLObject first_order_formula_p(final SubLObject v_object) {
        return makeBoolean(NIL == cycl_utilities.expression_find_if(FORMULA_WITH_NON_CONSTANT_OPERATOR_P, v_object, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject formula_with_constant_operator_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != constant_p(cycl_utilities.formula_operator(v_object))));
    }

    public static SubLObject formula_with_constant_operator_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != constant_p(cycl_utilities.formula_operator(v_object))));
    }

    public static final SubLObject formula_with_non_constant_operator_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL == constant_p(cycl_utilities.formula_operator(v_object))));
    }

    public static SubLObject formula_with_non_constant_operator_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL == constant_p(cycl_utilities.formula_operator(v_object))));
    }

    /**
     *
     *
     * @return booleanp; whether CLAUSE could be expressed in first-order logic.
     * @see first-order-formula-p.
     */
    @LispMethod(comment = "@return booleanp; whether CLAUSE could be expressed in first-order logic.\r\n@see first-order-formula-p.")
    public static final SubLObject first_order_clause_p_alt(SubLObject clause) {
        {
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.neg_lits(clause);
            SubLObject asent = NIL;
            for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                {
                    SubLObject sense = $NEG;
                    if (NIL != com.cyc.cycjava.cycl.term.higher_order_formula_p(asent)) {
                        return NIL;
                    }
                }
                index_var = add(index_var, ONE_INTEGER);
            }
        }
        {
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.pos_lits(clause);
            SubLObject asent = NIL;
            for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                {
                    SubLObject sense = $POS;
                    if (NIL != com.cyc.cycjava.cycl.term.higher_order_formula_p(asent)) {
                        return NIL;
                    }
                }
                index_var = add(index_var, ONE_INTEGER);
            }
        }
        return T;
    }

    /**
     *
     *
     * @return booleanp; whether CLAUSE could be expressed in first-order logic.
     * @see first-order-formula-p.
     */
    @LispMethod(comment = "@return booleanp; whether CLAUSE could be expressed in first-order logic.\r\n@see first-order-formula-p.")
    public static SubLObject first_order_clause_p(final SubLObject clause) {
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $NEG;
            if (NIL != higher_order_formula_p(asent)) {
                return NIL;
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        index_var = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(clause);
        asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $POS;
            if (NIL != higher_order_formula_p(asent)) {
                return NIL;
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION could be expressed in first-order logic.
     * @see first-order-formula-p
     * @see first-order-clause-p
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION could be expressed in first-order logic.\r\n@see first-order-formula-p\r\n@see first-order-clause-p")
    public static final SubLObject first_order_assertion_p_alt(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return com.cyc.cycjava.cycl.term.first_order_formula_p(assertions_high.gaf_hl_formula(assertion));
        } else {
            return com.cyc.cycjava.cycl.term.first_order_clause_p(assertions_high.assertion_cnf(assertion));
        }
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION could be expressed in first-order logic.
     * @see first-order-formula-p
     * @see first-order-clause-p
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION could be expressed in first-order logic.\r\n@see first-order-formula-p\r\n@see first-order-clause-p")
    public static SubLObject first_order_assertion_p(final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return first_order_formula_p(assertions_high.gaf_hl_formula(assertion));
        }
        return first_order_clause_p(assertions_high.assertion_cnf(assertion));
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a CycL formula (not necessarily
    well-formed) that could NOT be expressed in first-order logic.  This means
    there is some  non-constant in the arg0 position.  Non-constants in the arg0
    position imply either quantification into the predicate or
    function position, or a relation-denoting function.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a CycL formula (not necessarily\r\nwell-formed) that could NOT be expressed in first-order logic.  This means\r\nthere is some  non-constant in the arg0 position.  Non-constants in the arg0\r\nposition imply either quantification into the predicate or\r\nfunction position, or a relation-denoting function.")
    public static final SubLObject higher_order_formula_p_alt(SubLObject v_object) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.term.first_order_formula_p(v_object));
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a CycL formula (not necessarily
    well-formed) that could NOT be expressed in first-order logic.  This means
    there is some  non-constant in the arg0 position.  Non-constants in the arg0
    position imply either quantification into the predicate or
    function position, or a relation-denoting function.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a CycL formula (not necessarily\r\nwell-formed) that could NOT be expressed in first-order logic.  This means\r\nthere is some  non-constant in the arg0 position.  Non-constants in the arg0\r\nposition imply either quantification into the predicate or\r\nfunction position, or a relation-denoting function.")
    public static SubLObject higher_order_formula_p(final SubLObject v_object) {
        return makeBoolean(NIL == first_order_formula_p(v_object));
    }

    /**
     *
     *
     * @return booleanp; whether CLAUSE could NOT be expressed in first-order logic.
     * @see higher-order-formula-p.
     */
    @LispMethod(comment = "@return booleanp; whether CLAUSE could NOT be expressed in first-order logic.\r\n@see higher-order-formula-p.")
    public static final SubLObject higher_order_clause_p_alt(SubLObject clause) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.term.first_order_clause_p(clause));
    }

    /**
     *
     *
     * @return booleanp; whether CLAUSE could NOT be expressed in first-order logic.
     * @see higher-order-formula-p.
     */
    @LispMethod(comment = "@return booleanp; whether CLAUSE could NOT be expressed in first-order logic.\r\n@see higher-order-formula-p.")
    public static SubLObject higher_order_clause_p(final SubLObject clause) {
        return makeBoolean(NIL == first_order_clause_p(clause));
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION could NOT be expressed in first-order logic.
     * @see first-order-assertion-p
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION could NOT be expressed in first-order logic.\r\n@see first-order-assertion-p")
    public static final SubLObject higher_order_assertion_p_alt(SubLObject assertion) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.term.first_order_assertion_p(assertion));
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION could NOT be expressed in first-order logic.
     * @see first-order-assertion-p
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION could NOT be expressed in first-order logic.\r\n@see first-order-assertion-p")
    public static SubLObject higher_order_assertion_p(final SubLObject assertion) {
        return makeBoolean(NIL == first_order_assertion_p(assertion));
    }

    public static final SubLObject relation_syntaxP_alt(SubLObject v_term, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((((NIL != czer_vars.$el_supports_dot_syntaxP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.term.dotted_argsP(v_term, varP))) && (NIL != wf_wrt_sequence_varsP(v_term))) || (NIL != list_utilities.proper_list_p(v_term)));
        }
    }

    public static SubLObject relation_syntaxP(final SubLObject v_term, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((NIL != czer_vars.$el_supports_dot_syntaxP$.getDynamicValue(thread)) && (NIL != dotted_argsP(v_term, varP))) && (NIL != wf_wrt_sequence_varsP(v_term))) || (NIL != list_utilities.proper_list_p(v_term)));
    }

    public static final SubLObject dotted_argsP_alt(SubLObject args, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        if (args.isCons()) {
            {
                SubLObject cdr = args.rest();
                if (cdr.isCons()) {
                    return com.cyc.cycjava.cycl.term.dotted_argsP(cdr, varP);
                } else {
                    if (NIL == cdr) {
                        return NIL;
                    } else {
                        return funcall(varP, cdr);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject dotted_argsP(final SubLObject args, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        if (!args.isCons()) {
            return NIL;
        }
        final SubLObject cdr = args.rest();
        if (cdr.isCons()) {
            return dotted_argsP(cdr, varP);
        }
        if (NIL == cdr) {
            return NIL;
        }
        return funcall(varP, cdr);
    }

    public static final SubLObject scalar_termP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != collection_defns.ibqeP(v_term, mt)) || ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != isa.isaP(v_term, $$ScalarInterval, mt, UNPROVIDED))));
    }

    public static SubLObject scalar_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != collection_defns.ibqeP(v_term, mt)) || ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != isa.isaP(v_term, $$ScalarInterval, mt, UNPROVIDED))));
    }

    public static final SubLObject ground_fn_termP_alt(SubLObject fn_term) {
        return com.cyc.cycjava.cycl.term.closed_fn_termP(fn_term);
    }

    public static SubLObject ground_fn_termP(final SubLObject fn_term) {
        return closed_fn_termP(fn_term);
    }

    public static final SubLObject closed_fn_termP_alt(SubLObject fn_term) {
        return com.cyc.cycjava.cycl.term.closed_functional_expressionP(fn_term);
    }

    public static SubLObject closed_fn_termP(final SubLObject fn_term) {
        return closed_functional_expressionP(fn_term);
    }

    public static final SubLObject closed_functional_expressionP_alt(SubLObject v_object) {
        return closedP(v_object, $sym26$VAR_SPEC_);
    }

    public static SubLObject closed_functional_expressionP(final SubLObject v_object) {
        return closedP(v_object, $sym25$VAR_SPEC_);
    }

    public static final SubLObject var_specP_alt(SubLObject v_object) {
        return makeBoolean(((((NIL != cycl_variables.el_varP(v_object)) || (NIL != cycl_variables.kb_varP(v_object))) || (NIL != cycl_variables.permissible_keyword_varP(v_object))) || (NIL != cycl_variables.generic_arg_varP(v_object))) || (NIL != com.cyc.cycjava.cycl.term.unreified_skolem_termP(v_object)));
    }

    public static SubLObject var_specP(final SubLObject v_object) {
        return makeBoolean(((((NIL != cycl_variables.el_varP(v_object)) || (NIL != cycl_variables.kb_varP(v_object))) || (NIL != cycl_variables.permissible_keyword_varP(v_object))) || (NIL != cycl_variables.generic_arg_varP(v_object))) || (NIL != unreified_skolem_termP(v_object)));
    }

    public static final SubLObject termP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.term.hl_term_p(v_object)) || (NIL != com.cyc.cycjava.cycl.term.second_order_termP(v_object, mt)));
    }

    public static SubLObject termP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != hl_term_p(v_object)) || (NIL != second_order_termP(v_object, mt)));
    }

    public static final SubLObject ground_termP_alt(SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return assertions_high.ground_assertionP(v_object);
        } else {
            if (NIL != nart_handles.nart_p(v_object)) {
                return com.cyc.cycjava.cycl.term.ground_termP(narts_high.nart_el_formula(v_object), UNPROVIDED);
            } else {
                if (v_object.isAtom()) {
                    return makeBoolean(NIL == funcall(varP, v_object));
                } else {
                    if (NIL != com.cyc.cycjava.cycl.term.second_order_termP(v_object, UNPROVIDED)) {
                        return groundP(v_object, varP);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject ground_termP(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return assertions_high.ground_assertionP(v_object);
        }
        if (NIL != nart_handles.nart_p(v_object)) {
            return ground_termP(narts_high.nart_el_formula(v_object), UNPROVIDED);
        }
        if (v_object.isAtom()) {
            return makeBoolean(NIL == funcall(varP, v_object));
        }
        if (NIL != second_order_termP(v_object, UNPROVIDED)) {
            return groundP(v_object, varP);
        }
        return NIL;
    }

    public static final SubLObject closed_termP_alt(SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return closedP(uncanonicalizer.assertion_el_formula(v_object), UNPROVIDED);
        } else {
            if (NIL != nart_handles.nart_p(v_object)) {
                return com.cyc.cycjava.cycl.term.closed_nautP(narts_high.nart_el_formula(v_object), UNPROVIDED);
            } else {
                if (v_object.isAtom()) {
                    return makeBoolean(NIL == funcall(varP, v_object));
                } else {
                    if (NIL != com.cyc.cycjava.cycl.term.second_order_termP(v_object, UNPROVIDED)) {
                        return closedP(v_object, varP);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject closed_termP(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return closedP(uncanonicalizer.assertion_el_formula(v_object), UNPROVIDED);
        }
        if (NIL != nart_handles.nart_p(v_object)) {
            return closed_nautP(narts_high.nart_el_formula(v_object), UNPROVIDED);
        }
        if (v_object.isAtom()) {
            return makeBoolean(NIL == funcall(varP, v_object));
        }
        if (NIL != second_order_termP(v_object, UNPROVIDED)) {
            return closedP(v_object, varP);
        }
        return NIL;
    }

    public static final SubLObject open_termP_alt(SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return makeBoolean(NIL == closedP(uncanonicalizer.assertion_el_formula(v_object), UNPROVIDED));
        } else {
            if (NIL != nart_handles.nart_p(v_object)) {
                return makeBoolean(NIL == com.cyc.cycjava.cycl.term.closed_nautP(narts_high.nart_el_formula(v_object), UNPROVIDED));
            } else {
                if (v_object.isAtom()) {
                    return funcall(varP, v_object);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.term.second_order_termP(v_object, UNPROVIDED)) {
                        return makeBoolean(NIL == closedP(v_object, varP));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject open_termP(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$CYC_VAR_);
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return makeBoolean(NIL == closedP(uncanonicalizer.assertion_el_formula(v_object), UNPROVIDED));
        }
        if (NIL != nart_handles.nart_p(v_object)) {
            return makeBoolean(NIL == closed_nautP(narts_high.nart_el_formula(v_object), UNPROVIDED));
        }
        if (v_object.isAtom()) {
            return funcall(varP, v_object);
        }
        if (NIL != second_order_termP(v_object, UNPROVIDED)) {
            return makeBoolean(NIL == closedP(v_object, varP));
        }
        return NIL;
    }

    public static SubLObject declare_term_file() {
        declareFunction("el_fort_p", "EL-FORT-P", 1, 0, false);
        declareFunction("kb_assertionP", "KB-ASSERTION?", 1, 0, false);
        new term.$kb_assertionP$UnaryFunction();
        declareFunction("lisp_itemP", "LISP-ITEM?", 1, 0, false);
        declareFunction("kb_predicateP", "KB-PREDICATE?", 1, 0, false);
        declareFunction("mt_designating_relationP", "MT-DESIGNATING-RELATION?", 1, 0, false);
        declareFunction("represented_first_order_termP", "REPRESENTED-FIRST-ORDER-TERM?", 1, 0, false);
        declareFunction("hl_term_p", "HL-TERM-P", 1, 0, false);
        declareFunction("canonical_hl_termP", "CANONICAL-HL-TERM?", 1, 0, false);
        declareFunction("first_order_termP", "FIRST-ORDER-TERM?", 1, 0, false);
        declareFunction("second_order_termP", "SECOND-ORDER-TERM?", 1, 1, false);
        declareFunction("kb_relationP", "KB-RELATION?", 1, 0, false);
        declareFunction("reified_skolem_termP", "REIFIED-SKOLEM-TERM?", 1, 0, false);
        declareFunction("reified_skolem_constant_termP", "REIFIED-SKOLEM-CONSTANT-TERM?", 1, 0, false);
        new term.$reified_skolem_constant_termP$UnaryFunction();
        declareFunction("skolem_constantP", "SKOLEM-CONSTANT?", 1, 0, false);
        new term.$skolem_constantP$UnaryFunction();
        declareFunction("reified_skolem_function_termP", "REIFIED-SKOLEM-FUNCTION-TERM?", 1, 0, false);
        declareFunction("reified_skolem_fnP", "REIFIED-SKOLEM-FN?", 1, 0, false);
        declareFunction("reified_skolem_fn_in_any_mtP", "REIFIED-SKOLEM-FN-IN-ANY-MT?", 1, 2, false);
        declareFunction("has_skolem_nameP", "HAS-SKOLEM-NAME?", 1, 0, false);
        declareFunction("fast_reified_skolemP", "FAST-REIFIED-SKOLEM?", 1, 0, false);
        new term.$fast_reified_skolemP$UnaryFunction();
        declareFunction("skolem_nartP", "SKOLEM-NART?", 1, 0, false);
        declareFunction("fast_skolem_nartP", "FAST-SKOLEM-NART?", 1, 0, false);
        declareFunction("fast_skolem_natP", "FAST-SKOLEM-NAT?", 1, 0, false);
        new term.$fast_skolem_natP$UnaryFunction();
        declareFunction("skolem_termP", "SKOLEM-TERM?", 1, 0, false);
        declareFunction("unreified_skolem_termP", "UNREIFIED-SKOLEM-TERM?", 1, 0, false);
        new term.$unreified_skolem_termP$UnaryFunction();
        declareFunction("unreified_skolem_fn_termP", "UNREIFIED-SKOLEM-FN-TERM?", 1, 0, false);
        declareFunction("unreified_skolem_term_vars", "UNREIFIED-SKOLEM-TERM-VARS", 1, 0, false);
        declareFunction("skolem_fn_functionP", "SKOLEM-FN-FUNCTION?", 1, 0, false);
        declareFunction("ground_nautP", "GROUND-NAUT?", 1, 1, false);
        declareFunction("hl_ground_nautP", "HL-GROUND-NAUT?", 1, 0, false);
        declareFunction("closed_nautP", "CLOSED-NAUT?", 1, 1, false);
        new term.$closed_nautP$UnaryFunction();
        new term.$closed_nautP$BinaryFunction();
        declareFunction("open_nautP", "OPEN-NAUT?", 1, 1, false);
        declareFunction("unground_nautP", "UNGROUND-NAUT?", 1, 1, false);
        declareFunction("first_order_nautP", "FIRST-ORDER-NAUT?", 1, 0, false);
        declareFunction("kb_nautP", "KB-NAUT?", 1, 1, false);
        declareFunction("nautP", "NAUT?", 1, 1, false);
        declareFunction("meta_functionP", "META-FUNCTION?", 1, 1, false);
        declareFunction("function_termP", "FUNCTION-TERM?", 1, 0, false);
        declareFunction("function_symbolP", "FUNCTION-SYMBOL?", 1, 0, false);
        declareFunction("memoized_valid_fn_term_wrt_nestingP_internal", "MEMOIZED-VALID-FN-TERM-WRT-NESTING?-INTERNAL", 1, 0, false);
        declareFunction("memoized_valid_fn_term_wrt_nestingP", "MEMOIZED-VALID-FN-TERM-WRT-NESTING?", 1, 0, false);
        declareFunction("valid_fn_term_wrt_nestingP", "VALID-FN-TERM-WRT-NESTING?", 1, 0, false);
        declareFunction("sentenceP", "SENTENCE?", 1, 1, false);
        declareFunction("first_order_formula_p", "FIRST-ORDER-FORMULA-P", 1, 0, false);
        declareFunction("formula_with_constant_operator_p", "FORMULA-WITH-CONSTANT-OPERATOR-P", 1, 0, false);
        declareFunction("formula_with_non_constant_operator_p", "FORMULA-WITH-NON-CONSTANT-OPERATOR-P", 1, 0, false);
        declareFunction("first_order_clause_p", "FIRST-ORDER-CLAUSE-P", 1, 0, false);
        declareFunction("first_order_assertion_p", "FIRST-ORDER-ASSERTION-P", 1, 0, false);
        declareFunction("higher_order_formula_p", "HIGHER-ORDER-FORMULA-P", 1, 0, false);
        declareFunction("higher_order_clause_p", "HIGHER-ORDER-CLAUSE-P", 1, 0, false);
        declareFunction("higher_order_assertion_p", "HIGHER-ORDER-ASSERTION-P", 1, 0, false);
        declareFunction("relation_syntaxP", "RELATION-SYNTAX?", 1, 1, false);
        declareFunction("dotted_argsP", "DOTTED-ARGS?", 1, 1, false);
        declareFunction("scalar_termP", "SCALAR-TERM?", 1, 1, false);
        declareFunction("ground_fn_termP", "GROUND-FN-TERM?", 1, 0, false);
        declareFunction("closed_fn_termP", "CLOSED-FN-TERM?", 1, 0, false);
        declareFunction("closed_functional_expressionP", "CLOSED-FUNCTIONAL-EXPRESSION?", 1, 0, false);
        declareFunction("var_specP", "VAR-SPEC?", 1, 0, false);
        new term.$var_specP$UnaryFunction();
        declareFunction("termP", "TERM?", 1, 1, false);
        declareFunction("ground_termP", "GROUND-TERM?", 1, 1, false);
        declareFunction("closed_termP", "CLOSED-TERM?", 1, 1, false);
        declareFunction("open_termP", "OPEN-TERM?", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_term_file() {
        return NIL;
    }

    public static SubLObject setup_term_file() {
        register_cyc_api_function(EL_FORT_P, $list1, $str2$Returns_t_iff_OBJECT_is_a_fort_or, NIL, $list3);
        register_cyc_api_function(HL_TERM_P, $list5, $str6$Returns_T_if_the_OBJ_is_a_valid_C, NIL, $list3);
        memoization_state.note_memoized_function($sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_term_file();
    }

    @Override
    public void initializeVariables() {
        init_term_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_term_file();
    }

    

    public static final class $kb_assertionP$UnaryFunction extends UnaryFunction {
        public $kb_assertionP$UnaryFunction() {
            super(extractFunctionNamed("KB-ASSERTION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return kb_assertionP(arg1);
        }
    }

    public static final class $reified_skolem_constant_termP$UnaryFunction extends UnaryFunction {
        public $reified_skolem_constant_termP$UnaryFunction() {
            super(extractFunctionNamed("REIFIED-SKOLEM-CONSTANT-TERM?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return reified_skolem_constant_termP(arg1);
        }
    }

    public static final class $skolem_constantP$UnaryFunction extends UnaryFunction {
        public $skolem_constantP$UnaryFunction() {
            super(extractFunctionNamed("SKOLEM-CONSTANT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return skolem_constantP(arg1);
        }
    }

    public static final class $fast_reified_skolemP$UnaryFunction extends UnaryFunction {
        public $fast_reified_skolemP$UnaryFunction() {
            super(extractFunctionNamed("FAST-REIFIED-SKOLEM?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fast_reified_skolemP(arg1);
        }
    }

    public static final class $fast_skolem_natP$UnaryFunction extends UnaryFunction {
        public $fast_skolem_natP$UnaryFunction() {
            super(extractFunctionNamed("FAST-SKOLEM-NAT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fast_skolem_natP(arg1);
        }
    }

    public static final class $unreified_skolem_termP$UnaryFunction extends UnaryFunction {
        public $unreified_skolem_termP$UnaryFunction() {
            super(extractFunctionNamed("UNREIFIED-SKOLEM-TERM?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return unreified_skolem_termP(arg1);
        }
    }

    public static final class $closed_nautP$UnaryFunction extends UnaryFunction {
        public $closed_nautP$UnaryFunction() {
            super(extractFunctionNamed("CLOSED-NAUT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return closed_nautP(arg1, UNPROVIDED);
        }
    }

    public static final class $closed_nautP$BinaryFunction extends BinaryFunction {
        public $closed_nautP$BinaryFunction() {
            super(extractFunctionNamed("CLOSED-NAUT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return closed_nautP(arg1, arg2);
        }
    }

    public static final class $var_specP$UnaryFunction extends UnaryFunction {
        public $var_specP$UnaryFunction() {
            super(extractFunctionNamed("VAR-SPEC?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return var_specP(arg1);
        }
    }

    static private final SubLList $list_alt1 = list(makeSymbol("OBJECT"));

    static private final SubLString $str_alt2$Returns_t_iff_OBJECT_is_a_fort_or = makeString("Returns t iff OBJECT is a fort or an EL formula.");

    static private final SubLList $list_alt3 = list(makeSymbol("BOOLEANP"));

    static private final SubLList $list_alt5 = list(makeSymbol("OBJ"));

    static private final SubLString $str_alt6$Returns_T_if_the_OBJ_is_a_valid_C = makeString("Returns T if the OBJ is a valid CycL HL term.");

    static private final SubLList $list_alt12 = list(makeSymbol("FN"), makeSymbol("VAR-LIST"), makeSymbol("VAR"), makeSymbol("&OPTIONAL"), makeSymbol("SEQVAR"), makeSymbol("NUM"));

    public static final SubLSymbol $kw20$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym26$VAR_SPEC_ = makeSymbol("VAR-SPEC?");
}

/**
 * Total time: 357 ms
 */
