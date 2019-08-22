package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.sentence_variables;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class obsolete extends SubLTranslatedFile {
    public static final SubLFile me = new obsolete();

    public static final String myName = "com.cyc.cycjava.cycl.obsolete";

    public static final String myFingerPrint = "d78a5b58569f74e31ad851a2d2c15f0e379ed7a90f789a9f7f75c7fc99ea2dbc";

    // Internal Constants
    public static final SubLSymbol NAT_P = makeSymbol("NAT-P");

    public static final SubLList $list1 = list(makeSymbol("NART-P"), makeSymbol("CYCL-NAT-P"));

    public static final SubLString $str2$NAT_P_is_obsolete___use_NART_P_or = makeString("NAT-P is obsolete ; use NART-P or CYCL-NAT-P");

    public static final SubLSymbol FIND_NAT = makeSymbol("FIND-NAT");

    public static final SubLList $list4 = list(makeSymbol("NART-P"));

    public static final SubLString $str5$FIND_NAT_is_obsolete___use_FIND_N = makeString("FIND-NAT is obsolete ; use FIND-NART");

    public static final SubLSymbol CYCL_SYSTEM_NUMBER = makeSymbol("CYCL-SYSTEM-NUMBER");

    public static final SubLList $list7 = list(makeSymbol("CYC-REVISION-NUMBERS"));

    public static final SubLSymbol CYCL_PATCH_NUMBER = makeSymbol("CYCL-PATCH-NUMBER");

    public static final SubLSymbol $sym9$EL_TEMPLATE_ARG_ = makeSymbol("EL-TEMPLATE-ARG?");

    public static final SubLList $list10 = list(makeSymbol("LEAVE-SOME-TERMS-AT-EL-FOR-ARG?"));

    public static final SubLSymbol $sym11$NAT_ = makeSymbol("NAT?");

    public static final SubLList $list12 = list(makeSymbol("NAUT?"));

    public static final SubLSymbol $sym13$EL_VAR_ = makeSymbol("EL-VAR?");

    public static final SubLSymbol $sym14$RELATIONSHIP_ = makeSymbol("RELATIONSHIP?");

    public static final SubLList $list15 = list(makeSymbol("RELATION?"));

    public static final SubLSymbol $sym16$REIFIED_NAT_ = makeSymbol("REIFIED-NAT?");

    public static final SubLList $list17 = list(makeSymbol("NAUT-WITH-CORRESPONDING-NART?"));

    public static final SubLSymbol $sym18$REIFIABLE_NAT_ = makeSymbol("REIFIABLE-NAT?");

    public static final SubLList $list19 = list(makeSymbol("REIFIABLE-NAUT?"));

    public static final SubLSymbol $sym20$CYC_VAR_ = makeSymbol("CYC-VAR?");

    public static final SubLSymbol $sym21$KB_NAT_ = makeSymbol("KB-NAT?");

    public static final SubLList $list22 = list(makeSymbol("KB-NAUT?"));



    public static final SubLSymbol $sym24$NAUT_IN_MT_ = makeSymbol("NAUT-IN-MT?");



    public static final SubLSymbol $sym26$GNAT_ = makeSymbol("GNAT?");

    public static final SubLList $list27 = list(makeSymbol("GROUND-NAUT?"));

    public static final SubLSymbol GNAT_P = makeSymbol("GNAT-P");

    public static final SubLList $list29 = list(makeSymbol("HL-GROUND-NAUT?"));

    public static final SubLSymbol FIND_GNAT = makeSymbol("FIND-GNAT");

    public static final SubLList $list31 = list(makeSymbol("FIND-GROUND-NAUT"));

    public static final SubLSymbol CNAT_P = makeSymbol("CNAT-P");

    public static final SubLList $list33 = list(makeSymbol("CLOSED-NAUT?"));

    public static final SubLSymbol CLOSED_NAT_P = makeSymbol("CLOSED-NAT-P");

    public static final SubLSymbol REIFY_ARG_WHEN_CNAT = makeSymbol("REIFY-ARG-WHEN-CNAT");

    public static final SubLList $list36 = list(makeSymbol("REIFY-ARG-WHEN-CLOSED-NAUT"));

    public static final SubLSymbol REIFY_WHEN_CNAT = makeSymbol("REIFY-WHEN-CNAT");

    public static final SubLList $list38 = list(makeSymbol("REIFY-WHEN-CLOSED-NAUT"));

    public static final SubLSymbol FORTIFY = makeSymbol("FORTIFY");

    public static final SubLSymbol FIND_WHEN_CNAT = makeSymbol("FIND-WHEN-CNAT");

    public static final SubLList $list41 = list(makeSymbol("FIND-WHEN-CLOSED-NAUT"));

    public static final SubLSymbol FIND_CNAT = makeSymbol("FIND-CNAT");

    public static final SubLList $list43 = list(makeSymbol("FIND-CLOSED-NAUT"));

    public static final SubLSymbol OPEN_NAT_P = makeSymbol("OPEN-NAT-P");

    public static final SubLList $list45 = list(makeSymbol("OPEN-NAUT?"));

    public static final SubLSymbol $sym46$FO_NAT_ = makeSymbol("FO-NAT?");

    public static final SubLList $list47 = list(makeSymbol("FIRST-ORDER-NAUT?"));

    public static final SubLSymbol NAT_NOT_GNAT = makeSymbol("NAT-NOT-GNAT");

    public static final SubLList $list49 = list(makeSymbol("UNGROUND-NAUT?"));

    public static final SubLSymbol FORMULA_FREE_VARIABLES = makeSymbol("FORMULA-FREE-VARIABLES");

    public static final SubLList $list51 = list(makeSymbol("SENTENCE-FREE-VARIABLES"));

    public static final SubLSymbol FORMULA_VARIABLES = makeSymbol("FORMULA-VARIABLES");

    public static final SubLList $list53 = list(makeSymbol("SENTENCE-VARIABLES"));

    public static final SubLSymbol COMPLETE_COLLECTION_EXTENT = makeSymbol("COMPLETE-COLLECTION-EXTENT");

    public static final SubLList $list55 = list(makeSymbol("COMPLETELY-ENUMERABLE-COLLECTION?"));

    public static final SubLSymbol COMPLETE_EXTENT_KNOWN = makeSymbol("COMPLETE-EXTENT-KNOWN");

    public static final SubLList $list57 = list(makeSymbol("COMPLETE-EXTENT-ENUMERABLE?"));

    public static final SubLSymbol $sym58$BOOLEAN_ = makeSymbol("BOOLEAN?");

    public static final SubLList $list59 = list(makeSymbol("BOOLEANP"));

    public static SubLObject nat_p(final SubLObject v_object) {
        Errors.warn($str2$NAT_P_is_obsolete___use_NART_P_or);
        return nart_handles.nart_p(v_object);
    }

    public static SubLObject find_nat(final SubLObject nat_formula) {
        Errors.warn($str5$FIND_NAT_is_obsolete___use_FIND_N);
        return narts_high.find_nart(nat_formula);
    }

    public static SubLObject cycl_system_number() {
        final SubLObject number = system_info.cyc_revision_numbers().first();
        return number.isInteger() ? number : ZERO_INTEGER;
    }

    public static SubLObject cycl_patch_number() {
        final SubLObject number = second(system_info.cyc_revision_numbers());
        return number.isInteger() ? number : ZERO_INTEGER;
    }

    public static SubLObject el_template_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return czer_utilities.leave_some_terms_at_el_for_argP(relation, argnum, mt);
        }
        return NIL;
    }

    public static SubLObject natP(final SubLObject nat, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$EL_VAR_);
        }
        return term.nautP(nat, varP);
    }

    public static SubLObject relationshipP(final SubLObject v_object) {
        return kb_accessors.relationP(v_object);
    }

    public static SubLObject reified_natP(final SubLObject v_term) {
        return czer_utilities.naut_with_corresponding_nartP(v_term);
    }

    public static SubLObject reifiable_natP(final SubLObject v_term, SubLObject varP, SubLObject mt) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym20$CYC_VAR_);
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return czer_utilities.reifiable_nautP(v_term, varP, mt);
    }

    public static SubLObject kb_natP(final SubLObject nat, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return term.kb_nautP(nat, varP);
    }

    public static SubLObject naut_in_mtP(final SubLObject v_object, SubLObject mt, SubLObject varP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nautP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            nautP = term.nautP(v_object, varP);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return nautP;
    }

    public static SubLObject gnatP(final SubLObject nat, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym20$CYC_VAR_);
        }
        return term.ground_nautP(nat, varP);
    }

    public static SubLObject gnat_p(final SubLObject nat) {
        return term.hl_ground_nautP(nat);
    }

    public static SubLObject find_gnat(final SubLObject v_object) {
        return cycl_utilities.find_ground_naut(v_object);
    }

    public static SubLObject cnat_p(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym20$CYC_VAR_);
        }
        return term.closed_nautP(v_object, varP);
    }

    public static SubLObject closed_nat_p(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym20$CYC_VAR_);
        }
        return term.closed_nautP(v_object, varP);
    }

    public static SubLObject reify_arg_when_cnat(final SubLObject reln, final SubLObject psn) {
        return cycl_utilities.reify_arg_when_closed_naut(reln, psn);
    }

    public static SubLObject reify_when_cnat(final SubLObject v_object) {
        return cycl_utilities.reify_when_closed_naut(v_object);
    }

    public static SubLObject fortify(final SubLObject v_object) {
        return cycl_utilities.reify_when_closed_naut(v_object);
    }

    public static SubLObject find_when_cnat(final SubLObject v_object) {
        return cycl_utilities.find_when_closed_naut(v_object);
    }

    public static SubLObject find_cnat(final SubLObject v_object) {
        return cycl_utilities.find_closed_naut(v_object);
    }

    public static SubLObject open_nat_p(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym20$CYC_VAR_);
        }
        return term.open_nautP(v_object, varP);
    }

    public static SubLObject fo_natP(final SubLObject v_object) {
        return term.first_order_nautP(v_object);
    }

    public static SubLObject nat_not_gnat(final SubLObject nat, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym13$EL_VAR_);
        }
        return term.unground_nautP(nat, varP);
    }

    public static SubLObject formula_free_variables(final SubLObject formula, SubLObject bound_vars, SubLObject varP, SubLObject include_sequence_varsP) {
        if (bound_vars == UNPROVIDED) {
            bound_vars = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = $sym20$CYC_VAR_;
        }
        if (include_sequence_varsP == UNPROVIDED) {
            include_sequence_varsP = T;
        }
        return sentence_free_variables(formula, bound_vars, varP, include_sequence_varsP);
    }

    public static SubLObject formula_variables(final SubLObject formula, SubLObject varP, SubLObject include_sequence_varsP) {
        if (varP == UNPROVIDED) {
            varP = $sym20$CYC_VAR_;
        }
        if (include_sequence_varsP == UNPROVIDED) {
            include_sequence_varsP = T;
        }
        return sentence_variables(formula, varP, include_sequence_varsP);
    }

    public static SubLObject complete_collection_extent(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(collection)) && (NIL != kb_accessors.completely_enumerable_collectionP(collection, mt)));
    }

    public static SubLObject complete_extent_known(final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_accessors.complete_extent_enumerableP(predicate, mt);
    }

    public static SubLObject booleanP(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || (v_object == T));
    }

    public static SubLObject declare_obsolete_file() {
        declareFunction(me, "nat_p", "NAT-P", 1, 0, false);
        declareFunction(me, "find_nat", "FIND-NAT", 1, 0, false);
        declareFunction(me, "cycl_system_number", "CYCL-SYSTEM-NUMBER", 0, 0, false);
        declareFunction(me, "cycl_patch_number", "CYCL-PATCH-NUMBER", 0, 0, false);
        declareFunction(me, "el_template_argP", "EL-TEMPLATE-ARG?", 2, 1, false);
        declareFunction(me, "natP", "NAT?", 1, 1, false);
        declareFunction(me, "relationshipP", "RELATIONSHIP?", 1, 0, false);
        declareFunction(me, "reified_natP", "REIFIED-NAT?", 1, 0, false);
        declareFunction(me, "reifiable_natP", "REIFIABLE-NAT?", 1, 2, false);
        declareFunction(me, "kb_natP", "KB-NAT?", 1, 1, false);
        declareFunction(me, "naut_in_mtP", "NAUT-IN-MT?", 1, 2, false);
        declareFunction(me, "gnatP", "GNAT?", 1, 1, false);
        declareFunction(me, "gnat_p", "GNAT-P", 1, 0, false);
        declareFunction(me, "find_gnat", "FIND-GNAT", 1, 0, false);
        declareFunction(me, "cnat_p", "CNAT-P", 1, 1, false);
        declareFunction(me, "closed_nat_p", "CLOSED-NAT-P", 1, 1, false);
        declareFunction(me, "reify_arg_when_cnat", "REIFY-ARG-WHEN-CNAT", 2, 0, false);
        declareFunction(me, "reify_when_cnat", "REIFY-WHEN-CNAT", 1, 0, false);
        declareFunction(me, "fortify", "FORTIFY", 1, 0, false);
        declareFunction(me, "find_when_cnat", "FIND-WHEN-CNAT", 1, 0, false);
        declareFunction(me, "find_cnat", "FIND-CNAT", 1, 0, false);
        declareFunction(me, "open_nat_p", "OPEN-NAT-P", 1, 1, false);
        declareFunction(me, "fo_natP", "FO-NAT?", 1, 0, false);
        declareFunction(me, "nat_not_gnat", "NAT-NOT-GNAT", 1, 1, false);
        declareFunction(me, "formula_free_variables", "FORMULA-FREE-VARIABLES", 1, 3, false);
        declareFunction(me, "formula_variables", "FORMULA-VARIABLES", 1, 2, false);
        declareFunction(me, "complete_collection_extent", "COMPLETE-COLLECTION-EXTENT", 1, 1, false);
        declareFunction(me, "complete_extent_known", "COMPLETE-EXTENT-KNOWN", 1, 1, false);
        declareFunction(me, "booleanP", "BOOLEAN?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_obsolete_file() {
        return NIL;
    }

    public static SubLObject setup_obsolete_file() {
        define_obsolete_register(NAT_P, $list1);
        define_obsolete_register(FIND_NAT, $list4);
        define_obsolete_register(CYCL_SYSTEM_NUMBER, $list7);
        define_obsolete_register(CYCL_PATCH_NUMBER, $list7);
        define_obsolete_register($sym9$EL_TEMPLATE_ARG_, $list10);
        define_obsolete_register($sym11$NAT_, $list12);
        define_obsolete_register($sym14$RELATIONSHIP_, $list15);
        define_obsolete_register($sym16$REIFIED_NAT_, $list17);
        define_obsolete_register($sym18$REIFIABLE_NAT_, $list19);
        define_obsolete_register($sym21$KB_NAT_, $list22);
        define_obsolete_register($sym24$NAUT_IN_MT_, NIL);
        define_obsolete_register($sym26$GNAT_, $list27);
        define_obsolete_register(GNAT_P, $list29);
        define_obsolete_register(FIND_GNAT, $list31);
        define_obsolete_register(CNAT_P, $list33);
        define_obsolete_register(CLOSED_NAT_P, $list33);
        define_obsolete_register(REIFY_ARG_WHEN_CNAT, $list36);
        define_obsolete_register(REIFY_WHEN_CNAT, $list38);
        define_obsolete_register(FORTIFY, $list38);
        define_obsolete_register(FIND_WHEN_CNAT, $list41);
        define_obsolete_register(FIND_CNAT, $list43);
        define_obsolete_register(OPEN_NAT_P, $list45);
        define_obsolete_register($sym46$FO_NAT_, $list47);
        define_obsolete_register(NAT_NOT_GNAT, $list49);
        define_obsolete_register(FORMULA_FREE_VARIABLES, $list51);
        define_obsolete_register(FORMULA_VARIABLES, $list53);
        define_obsolete_register(COMPLETE_COLLECTION_EXTENT, $list55);
        define_obsolete_register(COMPLETE_EXTENT_KNOWN, $list57);
        define_obsolete_register($sym58$BOOLEAN_, $list59);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_obsolete_file();
    }

    @Override
    public void initializeVariables() {
        init_obsolete_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_obsolete_file();
    }

    
}

/**
 * Total time: 137 ms
 */
