/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class obsolete extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new obsolete();

    public static final String myName = "com.cyc.cycjava.cycl.obsolete";

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol NAT_P = makeSymbol("NAT-P");

    static private final SubLList $list1 = list(makeSymbol("NART-P"), makeSymbol("CYCL-NAT-P"));

    static private final SubLString $str2$NAT_P_is_obsolete___use_NART_P_or = makeString("NAT-P is obsolete ; use NART-P or CYCL-NAT-P");

    private static final SubLSymbol FIND_NAT = makeSymbol("FIND-NAT");

    static private final SubLList $list4 = list(makeSymbol("NART-P"));

    static private final SubLString $str5$FIND_NAT_is_obsolete___use_FIND_N = makeString("FIND-NAT is obsolete ; use FIND-NART");

    private static final SubLSymbol CYCL_SYSTEM_NUMBER = makeSymbol("CYCL-SYSTEM-NUMBER");

    static private final SubLList $list7 = list(makeSymbol("CYC-REVISION-NUMBERS"));

    private static final SubLSymbol CYCL_PATCH_NUMBER = makeSymbol("CYCL-PATCH-NUMBER");

    static private final SubLSymbol $sym9$EL_TEMPLATE_ARG_ = makeSymbol("EL-TEMPLATE-ARG?");

    static private final SubLList $list10 = list(makeSymbol("LEAVE-SOME-TERMS-AT-EL-FOR-ARG?"));

    static private final SubLSymbol $sym11$NAT_ = makeSymbol("NAT?");

    static private final SubLList $list12 = list(makeSymbol("NAUT?"));

    static private final SubLSymbol $sym13$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLSymbol $sym14$RELATIONSHIP_ = makeSymbol("RELATIONSHIP?");

    static private final SubLList $list15 = list(makeSymbol("RELATION?"));

    static private final SubLSymbol $sym16$REIFIED_NAT_ = makeSymbol("REIFIED-NAT?");

    static private final SubLList $list17 = list(makeSymbol("NAUT-WITH-CORRESPONDING-NART?"));

    static private final SubLSymbol $sym18$REIFIABLE_NAT_ = makeSymbol("REIFIABLE-NAT?");

    static private final SubLList $list19 = list(makeSymbol("REIFIABLE-NAUT?"));

    static private final SubLSymbol $sym20$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLSymbol $sym21$KB_NAT_ = makeSymbol("KB-NAT?");

    static private final SubLList $list22 = list(makeSymbol("KB-NAUT?"));

    static private final SubLSymbol $sym24$NAUT_IN_MT_ = makeSymbol("NAUT-IN-MT?");

    static private final SubLSymbol $sym26$GNAT_ = makeSymbol("GNAT?");

    static private final SubLList $list27 = list(makeSymbol("GROUND-NAUT?"));

    private static final SubLSymbol GNAT_P = makeSymbol("GNAT-P");

    static private final SubLList $list29 = list(makeSymbol("HL-GROUND-NAUT?"));

    private static final SubLSymbol FIND_GNAT = makeSymbol("FIND-GNAT");

    static private final SubLList $list31 = list(makeSymbol("FIND-GROUND-NAUT"));

    private static final SubLSymbol CNAT_P = makeSymbol("CNAT-P");

    static private final SubLList $list33 = list(makeSymbol("CLOSED-NAUT?"));

    private static final SubLSymbol CLOSED_NAT_P = makeSymbol("CLOSED-NAT-P");

    private static final SubLSymbol REIFY_ARG_WHEN_CNAT = makeSymbol("REIFY-ARG-WHEN-CNAT");

    static private final SubLList $list36 = list(makeSymbol("REIFY-ARG-WHEN-CLOSED-NAUT"));

    private static final SubLSymbol REIFY_WHEN_CNAT = makeSymbol("REIFY-WHEN-CNAT");

    static private final SubLList $list38 = list(makeSymbol("REIFY-WHEN-CLOSED-NAUT"));

    private static final SubLSymbol FORTIFY = makeSymbol("FORTIFY");

    private static final SubLSymbol FIND_WHEN_CNAT = makeSymbol("FIND-WHEN-CNAT");

    static private final SubLList $list41 = list(makeSymbol("FIND-WHEN-CLOSED-NAUT"));

    private static final SubLSymbol FIND_CNAT = makeSymbol("FIND-CNAT");

    private static final SubLSymbol FIND_CLOSED_NAUT = makeSymbol("FIND-CLOSED-NAUT");

    static private final SubLList $list43 = list(FIND_CLOSED_NAUT);

    private static final SubLSymbol OPEN_NAT_P = makeSymbol("OPEN-NAT-P");

    static private final SubLList $list45 = list(makeSymbol("OPEN-NAUT?"));

    static private final SubLSymbol $sym46$FO_NAT_ = makeSymbol("FO-NAT?");

    static private final SubLList $list47 = list(makeSymbol("FIRST-ORDER-NAUT?"));

    private static final SubLSymbol NAT_NOT_GNAT = makeSymbol("NAT-NOT-GNAT");

    static private final SubLList $list49 = list(makeSymbol("UNGROUND-NAUT?"));

    private static final SubLSymbol FORMULA_FREE_VARIABLES = makeSymbol("FORMULA-FREE-VARIABLES");

    static private final SubLList $list51 = list(makeSymbol("SENTENCE-FREE-VARIABLES"));

    private static final SubLSymbol FORMULA_VARIABLES = makeSymbol("FORMULA-VARIABLES");

    static private final SubLList $list53 = list(makeSymbol("SENTENCE-VARIABLES"));

    private static final SubLSymbol COMPLETE_COLLECTION_EXTENT = makeSymbol("COMPLETE-COLLECTION-EXTENT");

    static private final SubLList $list55 = list(makeSymbol("COMPLETELY-ENUMERABLE-COLLECTION?"));

    private static final SubLSymbol COMPLETE_EXTENT_KNOWN = makeSymbol("COMPLETE-EXTENT-KNOWN");

    static private final SubLList $list57 = list(makeSymbol("COMPLETE-EXTENT-ENUMERABLE?"));

    static private final SubLSymbol $sym58$BOOLEAN_ = makeSymbol("BOOLEAN?");

    static private final SubLList $list59 = list(makeSymbol("BOOLEANP"));

    // Definitions
    /**
     * obsolete -- use NART-P
     */
    @LispMethod(comment = "obsolete -- use NART-P")
    public static final SubLObject nat_p_alt(SubLObject v_object) {
	Errors.warn($str2$NAT_P_is_obsolete___use_NART_P_or);
	return nart_handles.nart_p(v_object);
    }

    // Definitions
    /**
     * obsolete -- use NART-P
     */
    @LispMethod(comment = "obsolete -- use NART-P")
    public static SubLObject nat_p(final SubLObject v_object) {
	Errors.warn($str2$NAT_P_is_obsolete___use_NART_P_or);
	return nart_handles.nart_p(v_object);
    }

    /**
     * obsolete -- use FIND-NART
     */
    @LispMethod(comment = "obsolete -- use FIND-NART")
    public static final SubLObject find_nat_alt(SubLObject nat_formula) {
	Errors.warn($str5$FIND_NAT_is_obsolete___use_FIND_N);
	return narts_high.find_nart(nat_formula);
    }

    /**
     * obsolete -- use FIND-NART
     */
    @LispMethod(comment = "obsolete -- use FIND-NART")
    public static SubLObject find_nat(final SubLObject nat_formula) {
	Errors.warn($str5$FIND_NAT_is_obsolete___use_FIND_N);
	return narts_high.find_nart(nat_formula);
    }

    /**
     * obsolete -- use CYC-REVISION-NUMBERS
     */
    @LispMethod(comment = "obsolete -- use CYC-REVISION-NUMBERS")
    public static final SubLObject cycl_system_number_alt() {
	{
	    SubLObject number = system_info.cyc_revision_numbers().first();
	    return number.isInteger() ? ((SubLObject) (number)) : ZERO_INTEGER;
	}
    }

    /**
     * obsolete -- use CYC-REVISION-NUMBERS
     */
    @LispMethod(comment = "obsolete -- use CYC-REVISION-NUMBERS")
    public static SubLObject cycl_system_number() {
	final SubLObject number = system_info.cyc_revision_numbers().first();
	return number.isInteger() ? number : ZERO_INTEGER;
    }

    /**
     * obsolete -- use CYC-REVISION-NUMBERS
     */
    @LispMethod(comment = "obsolete -- use CYC-REVISION-NUMBERS")
    public static SubLObject cycl_patch_number() {
	final SubLObject number = second(system_info.cyc_revision_numbers());
	return number.isInteger() ? number : ZERO_INTEGER;
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an EL formula template.
    (note: variables within such templates are not canonicalized)
     * @unknown deprecated in favour of @xref leave-some-terms-at-el-for-arg?
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an EL formula template.\r\n(note: variables within such templates are not canonicalized)\r\n@unknown deprecated in favour of @xref leave-some-terms-at-el-for-arg?")
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

    public static final SubLObject kb_natP_alt(SubLObject nat, SubLObject varP) {
	if (varP == UNPROVIDED) {
	    varP = symbol_function(VARIABLE_P);
	}
	return term.kb_nautP(nat, varP);
    }

    public static SubLObject kb_natP(final SubLObject nat, SubLObject varP) {
	if (varP == UNPROVIDED) {
	    varP = symbol_function(VARIABLE_P);
	}
	return term.kb_nautP(nat, varP);
    }

    public static final SubLObject naut_in_mtP_alt(SubLObject v_object, SubLObject mt, SubLObject varP) {
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	if (varP == UNPROVIDED) {
	    varP = symbol_function($sym13$EL_VAR_);
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject nautP = NIL;
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		    try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
			mt_relevance_macros.$mt$.bind(mt, thread);
			nautP = term.nautP(v_object, varP);
		    } finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		    }
		}
		return nautP;
	    }
	}
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

    public static final SubLObject gnatP_alt(SubLObject nat, SubLObject varP) {
	if (varP == UNPROVIDED) {
	    varP = symbol_function($sym20$CYC_VAR_);
	}
	return term.ground_nautP(nat, varP);
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

    public static final SubLObject reify_arg_when_cnat_alt(SubLObject reln, SubLObject psn) {
	return cycl_utilities.reify_arg_when_closed_naut(reln, psn);
    }

    public static SubLObject reify_arg_when_cnat(final SubLObject reln, final SubLObject psn) {
	return cycl_utilities.reify_arg_when_closed_naut(reln, psn);
    }

    public static final SubLObject reify_when_cnat_alt(SubLObject v_object) {
	return cycl_utilities.reify_when_closed_naut(v_object);
    }

    public static SubLObject reify_when_cnat(final SubLObject v_object) {
	return cycl_utilities.reify_when_closed_naut(v_object);
    }

    public static final SubLObject fortify_alt(SubLObject v_object) {
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

    public static final SubLObject fo_natP_alt(SubLObject v_object) {
	return term.first_order_nautP(v_object);
    }

    public static SubLObject fo_natP(final SubLObject v_object) {
	return term.first_order_nautP(v_object);
    }

    public static final SubLObject nat_not_gnat_alt(SubLObject nat, SubLObject varP) {
	if (varP == UNPROVIDED) {
	    varP = symbol_function($sym13$EL_VAR_);
	}
	return term.unground_nautP(nat, varP);
    }

    public static SubLObject nat_not_gnat(final SubLObject nat, SubLObject varP) {
	if (varP == UNPROVIDED) {
	    varP = symbol_function($sym13$EL_VAR_);
	}
	return term.unground_nautP(nat, varP);
    }

    public static final SubLObject formula_free_variables_alt(SubLObject formula, SubLObject bound_vars, SubLObject varP, SubLObject include_sequence_varsP) {
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

    public static final SubLObject formula_variables_alt(SubLObject formula, SubLObject varP, SubLObject include_sequence_varsP) {
	if (varP == UNPROVIDED) {
	    varP = $sym20$CYC_VAR_;
	}
	if (include_sequence_varsP == UNPROVIDED) {
	    include_sequence_varsP = T;
	}
	return sentence_variables(formula, varP, include_sequence_varsP);
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

    public static final SubLObject complete_collection_extent_alt(SubLObject collection, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	return makeBoolean((NIL != forts.fort_p(collection)) && (NIL != kb_accessors.completely_enumerable_collectionP(collection, mt)));
    }

    public static SubLObject complete_collection_extent(final SubLObject collection, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	return makeBoolean((NIL != forts.fort_p(collection)) && (NIL != kb_accessors.completely_enumerable_collectionP(collection, mt)));
    }

    public static final SubLObject complete_extent_known_alt(SubLObject predicate, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	return kb_accessors.complete_extent_enumerableP(predicate, mt);
    }

    public static SubLObject complete_extent_known(final SubLObject predicate, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	return kb_accessors.complete_extent_enumerableP(predicate, mt);
    }

    public static final SubLObject booleanP_alt(SubLObject v_object) {
	return makeBoolean((NIL == v_object) || (v_object == T));
    }

    public static SubLObject booleanP(final SubLObject v_object) {
	return makeBoolean((NIL == v_object) || (v_object == T));
    }

    public static SubLObject declare_obsolete_file() {
	declareFunction("nat_p", "NAT-P", 1, 0, false);
	declareFunction("find_nat", "FIND-NAT", 1, 0, false);
	declareFunction("cycl_system_number", "CYCL-SYSTEM-NUMBER", 0, 0, false);
	declareFunction("cycl_patch_number", "CYCL-PATCH-NUMBER", 0, 0, false);
	declareFunction("el_template_argP", "EL-TEMPLATE-ARG?", 2, 1, false);
	declareFunction("natP", "NAT?", 1, 1, false);
	declareFunction("relationshipP", "RELATIONSHIP?", 1, 0, false);
	declareFunction("reified_natP", "REIFIED-NAT?", 1, 0, false);
	declareFunction("reifiable_natP", "REIFIABLE-NAT?", 1, 2, false);
	declareFunction("kb_natP", "KB-NAT?", 1, 1, false);
	declareFunction("naut_in_mtP", "NAUT-IN-MT?", 1, 2, false);
	declareFunction("gnatP", "GNAT?", 1, 1, false);
	declareFunction("gnat_p", "GNAT-P", 1, 0, false);
	declareFunction("find_gnat", "FIND-GNAT", 1, 0, false);
	declareFunction("cnat_p", "CNAT-P", 1, 1, false);
	declareFunction("closed_nat_p", "CLOSED-NAT-P", 1, 1, false);
	declareFunction("reify_arg_when_cnat", "REIFY-ARG-WHEN-CNAT", 2, 0, false);
	declareFunction("reify_when_cnat", "REIFY-WHEN-CNAT", 1, 0, false);
	declareFunction("fortify", "FORTIFY", 1, 0, false);
	declareFunction("find_when_cnat", "FIND-WHEN-CNAT", 1, 0, false);
	declareFunction("find_cnat", "FIND-CNAT", 1, 0, false);
	declareFunction("open_nat_p", "OPEN-NAT-P", 1, 1, false);
	declareFunction("fo_natP", "FO-NAT?", 1, 0, false);
	declareFunction("nat_not_gnat", "NAT-NOT-GNAT", 1, 1, false);
	declareFunction("formula_free_variables", "FORMULA-FREE-VARIABLES", 1, 3, false);
	declareFunction("formula_variables", "FORMULA-VARIABLES", 1, 2, false);
	declareFunction("complete_collection_extent", "COMPLETE-COLLECTION-EXTENT", 1, 1, false);
	declareFunction("complete_extent_known", "COMPLETE-EXTENT-KNOWN", 1, 1, false);
	declareFunction("booleanP", "BOOLEAN?", 1, 0, false);
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
