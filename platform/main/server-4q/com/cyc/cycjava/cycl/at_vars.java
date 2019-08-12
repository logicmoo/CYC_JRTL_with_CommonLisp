/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      AT-VARS
 * source file: /cyc/top/cycl/at-vars.lisp
 * created:     2019/07/03 17:37:19
 */
public final class at_vars extends SubLTranslatedFile implements V12 {
    public static final SubLSymbol $suf_quoted_function_cache$ = makeSymbol("*SUF-QUOTED-FUNCTION-CACHE*");

    public static final SubLSymbol $suf_function_cache$ = makeSymbol("*SUF-FUNCTION-CACHE*");

    public static final SubLSymbol $suf_quoted_defn_cache$ = makeSymbol("*SUF-QUOTED-DEFN-CACHE*");

    public static final SubLSymbol $suf_defn_cache$ = makeSymbol("*SUF-DEFN-CACHE*");

    public static final SubLFile me = new at_vars();

 public static final String myName = "com.cyc.cycjava.cycl.at_vars";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $at_check_inter_assert_format_wXo_arg_indexP$ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $at_check_inter_assert_format_wXo_arg_index_gaf_count_threshold$ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $at_arg1$ = makeSymbol("*AT-ARG1*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $at_arg2$ = makeSymbol("*AT-ARG2*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $semantic_dnf_hl_filtering_enabled$ = makeSymbol("*SEMANTIC-DNF-HL-FILTERING-ENABLED*");

    public static final SubLSymbol $at_check_inter_arg_not_genlP$ = makeSymbol("*AT-CHECK-INTER-ARG-NOT-GENL?*");

    public static final SubLSymbol $at_check_inter_arg_isa_genlP$ = makeSymbol("*AT-CHECK-INTER-ARG-ISA-GENL?*");

    public static final SubLSymbol $at_check_inter_arg_genl_isaP$ = makeSymbol("*AT-CHECK-INTER-ARG-GENL-ISA?*");

    private static final SubLList $list26 = list(makeKeyword("ASYMMETRIC-PREDICATE"), makeKeyword("ANTI-SYMMETRIC-PREDICATE"), makeKeyword("IRREFLEXIVE-PREDICATE"), makeKeyword("ANTI-TRANSITIVE-PREDICATE"), makeKeyword("NEGATION-PREDS"), makeKeyword("NEGATION-INVERSES"));

    public static final SubLSymbol $at_pred_constraints$ = makeSymbol("*AT-PRED-CONSTRAINTS*");

    public static final SubLSymbol $at_predicate_violations$ = makeSymbol("*AT-PREDICATE-VIOLATIONS*");

    private static final SubLSymbol $sym29$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*");

    private static final SubLSymbol $sym31$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*");

    public static final SubLSymbol $fag_search_limit$ = makeSymbol("*FAG-SEARCH-LIMIT*");

    public static final SubLSymbol $at_gaf_search_limit$ = makeSymbol("*AT-GAF-SEARCH-LIMIT*");

    public static final SubLSymbol $at_include_isa_literal_constraints$ = makeSymbol("*AT-INCLUDE-ISA-LITERAL-CONSTRAINTS*");

    public static final SubLSymbol $at_include_genl_literal_constraints$ = makeSymbol("*AT-INCLUDE-GENL-LITERAL-CONSTRAINTS*");

    public static final SubLSymbol $at_format_violations$ = makeSymbol("*AT-FORMAT-VIOLATIONS*");

    public static final SubLSymbol $at_different_violations$ = makeSymbol("*AT-DIFFERENT-VIOLATIONS*");

    public static final SubLSymbol $at_trace_level$ = makeSymbol("*AT-TRACE-LEVEL*");

    public static final SubLSymbol $at_test_level$ = makeSymbol("*AT-TEST-LEVEL*");

    public static final SubLSymbol $at_result$ = makeSymbol("*AT-RESULT*");

    public static final SubLSymbol $at_isa_constraints$ = makeSymbol("*AT-ISA-CONSTRAINTS*");

    public static final SubLSymbol $at_genl_constraints$ = makeSymbol("*AT-GENL-CONSTRAINTS*");

    public static final SubLSymbol $at_format_constraints$ = makeSymbol("*AT-FORMAT-CONSTRAINTS*");

    public static final SubLSymbol $at_different_constraints$ = makeSymbol("*AT-DIFFERENT-CONSTRAINTS*");

    public static final SubLSymbol $at_isa_assertions$ = makeSymbol("*AT-ISA-ASSERTIONS*");

    public static final SubLSymbol $at_genl_assertions$ = makeSymbol("*AT-GENL-ASSERTIONS*");

    public static final SubLSymbol $at_format_assertions$ = makeSymbol("*AT-FORMAT-ASSERTIONS*");

    public static final SubLSymbol $at_different_assertions$ = makeSymbol("*AT-DIFFERENT-ASSERTIONS*");

    public static final SubLSymbol $at_mode$ = makeSymbol("*AT-MODE*");

    public static final SubLSymbol $at_constraint_type$ = makeSymbol("*AT-CONSTRAINT-TYPE*");

    public static final SubLSymbol $at_arg_type$ = makeSymbol("*AT-ARG-TYPE*");

    public static final SubLSymbol $at_base_fn$ = makeSymbol("*AT-BASE-FN*");

    public static final SubLSymbol $at_formula$ = makeSymbol("*AT-FORMULA*");

    public static final SubLSymbol $at_pred$ = makeSymbol("*AT-PRED*");

    public static final SubLSymbol $at_inverse$ = makeSymbol("*AT-INVERSE*");

    public static final SubLSymbol $at_reln$ = makeSymbol("*AT-RELN*");

    public static final SubLSymbol $at_arg$ = makeSymbol("*AT-ARG*");

    public static final SubLSymbol $at_argnum$ = makeSymbol("*AT-ARGNUM*");

    private static final SubLSymbol $sym90$_AT_ARG1_ = makeSymbol("*AT-ARG1*");

    private static final SubLSymbol $sym91$_AT_ARG2_ = makeSymbol("*AT-ARG2*");

    public static final SubLSymbol $at_ind_argnum$ = makeSymbol("*AT-IND-ARGNUM*");

    public static final SubLSymbol $at_ind_arg$ = makeSymbol("*AT-IND-ARG*");

    public static final SubLSymbol $at_ind_isa$ = makeSymbol("*AT-IND-ISA*");

    public static final SubLSymbol $at_ind_genl$ = makeSymbol("*AT-IND-GENL*");

    public static final SubLSymbol $at_arg_isa$ = makeSymbol("*AT-ARG-ISA*");

    public static final SubLSymbol $at_source$ = makeSymbol("*AT-SOURCE*");

    public static final SubLSymbol $at_profile_term$ = makeSymbol("*AT-PROFILE-TERM*");

    public static final SubLSymbol $at_constraint_gaf$ = makeSymbol("*AT-CONSTRAINT-GAF*");

    public static final SubLSymbol $at_var_isa$ = makeSymbol("*AT-VAR-ISA*");

    public static final SubLSymbol $at_var_genl$ = makeSymbol("*AT-VAR-GENL*");

    public static final SubLSymbol $at_var_types_standard$ = makeSymbol("*AT-VAR-TYPES-STANDARD*");

    public static final SubLSymbol $current_at_violation$ = makeSymbol("*CURRENT-AT-VIOLATION*");

    public static final SubLSymbol $at_violations$ = makeSymbol("*AT-VIOLATIONS*");

    public static final SubLSymbol $at_disjoins_space$ = makeSymbol("*AT-DISJOINS-SPACE*");

    public static final SubLSymbol $at_isa_space$ = makeSymbol("*AT-ISA-SPACE*");

    public static final SubLSymbol $at_genls_space$ = makeSymbol("*AT-GENLS-SPACE*");

    public static final SubLSymbol $at_additional_defn_checking$ = makeSymbol("*AT-ADDITIONAL-DEFN-CHECKING*");

    public static final SubLSymbol $at_collection_specific_defns$ = makeSymbol("*AT-COLLECTION-SPECIFIC-DEFNS*");

    public static final SubLSymbol $defn_trace_level$ = makeSymbol("*DEFN-TRACE-LEVEL*");

    public static final SubLSymbol $defn_test_level$ = makeSymbol("*DEFN-TEST-LEVEL*");

    public static final SubLSymbol $defn_meter_caches$ = makeSymbol("*DEFN-METER-CACHES*");

    public static final SubLSymbol $defn_collection$ = makeSymbol("*DEFN-COLLECTION*");

    private static final SubLList $list128 = list(list(makeSymbol("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*"), NIL));

    public static final SubLSymbol $at_defn$ = makeSymbol("*AT-DEFN*");

    public static final SubLSymbol $at_defns$ = makeSymbol("*AT-DEFNS*");

    public static final SubLSymbol $at_function$ = makeSymbol("*AT-FUNCTION*");

    public static final SubLSymbol $at_functions$ = makeSymbol("*AT-FUNCTIONS*");

    public static final SubLSymbol $defn_fn_history_default_size$ = makeSymbol("*DEFN-FN-HISTORY-DEFAULT-SIZE*");

    public static final SubLSymbol $defn_col_history_default_size$ = makeSymbol("*DEFN-COL-HISTORY-DEFAULT-SIZE*");

    public static final SubLSymbol $defn_col_history$ = makeSymbol("*DEFN-COL-HISTORY*");

    public static final SubLSymbol $quoted_defn_col_history$ = makeSymbol("*QUOTED-DEFN-COL-HISTORY*");

    public static final SubLSymbol $defn_fn_history$ = makeSymbol("*DEFN-FN-HISTORY*");

    public static final SubLSymbol $quoted_defn_fn_history$ = makeSymbol("*QUOTED-DEFN-FN-HISTORY*");

    public static final SubLSymbol $defn_stack$ = makeSymbol("*DEFN-STACK*");

    private static final SubLSymbol $NO_DEFINING_MTS = makeKeyword("NO-DEFINING-MTS");

    private static final SubLSymbol $NO_ARG_TYPES = makeKeyword("NO-ARG-TYPES");

    private static final SubLSymbol $NO_ARG_FORMAT = makeKeyword("NO-ARG-FORMAT");

    public static final SubLObject at_check_arg_types_p_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $at_check_arg_typesP$.getDynamicValue(thread);
	}
    }

    public static SubLObject at_check_arg_types_p() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $at_check_arg_typesP$.getDynamicValue(thread);
    }

    public static final SubLObject at_check_defining_mts_p_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return makeBoolean((NIL != $at_check_defining_mtsP$.getDynamicValue(thread)) && (NIL != $at_possibly_check_defining_mtsP$.getDynamicValue(thread)));
	}
    }

    public static SubLObject at_check_defining_mts_p() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean((NIL != $at_check_defining_mtsP$.getDynamicValue(thread)) && (NIL != $at_possibly_check_defining_mtsP$.getDynamicValue(thread)));
    }

    /**
     *
     *
     * @return boolean, t iff the formula being canonicalized isa a termOfUnit gaf?
     */
    @LispMethod(comment = "@return boolean, t iff the formula being canonicalized isa a termOfUnit gaf?")
    public static final SubLObject within_tou_gafP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $within_tou_gafP$.getDynamicValue(thread);
	}
    }

    /**
     *
     *
     * @return boolean, t iff the formula being canonicalized isa a termOfUnit gaf?
     */
    @LispMethod(comment = "@return boolean, t iff the formula being canonicalized isa a termOfUnit gaf?")
    public static SubLObject within_tou_gafP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $within_tou_gafP$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return boolean; must there be some arg-isa constraint applicable
    to an arg for a given arg, relation, argnum to be wf?
     */
    @LispMethod(comment = "@return boolean; must there be some arg-isa constraint applicable\r\nto an arg for a given arg, relation, argnum to be wf?")
    public static final SubLObject at_some_arg_isa_requiredP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $at_some_arg_isa_requiredP$.getDynamicValue(thread);
	}
    }

    /**
     *
     *
     * @return boolean; must there be some arg-isa constraint applicable
    to an arg for a given arg, relation, argnum to be wf?
     */
    @LispMethod(comment = "@return boolean; must there be some arg-isa constraint applicable\r\nto an arg for a given arg, relation, argnum to be wf?")
    public static SubLObject at_some_arg_isa_requiredP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $at_some_arg_isa_requiredP$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return boolean; during arg-type analysis do we consider
    multi-arg (argsIsa) constraints for specified args (arg1)
     */
    @LispMethod(comment = "@return boolean; during arg-type analysis do we consider\r\nmulti-arg (argsIsa) constraints for specified args (arg1)")
    public static final SubLObject consider_multiargs_at_predP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $at_consider_multiargs_at_predP$.getDynamicValue(thread);
	}
    }

    /**
     *
     *
     * @return boolean; during arg-type analysis do we consider
    multi-arg (argsIsa) constraints for specified args (arg1)
     */
    @LispMethod(comment = "@return boolean; during arg-type analysis do we consider\r\nmulti-arg (argsIsa) constraints for specified args (arg1)")
    public static SubLObject consider_multiargs_at_predP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $at_consider_multiargs_at_predP$.getDynamicValue(thread);
    }

    public static final SubLObject at_searching_genl_predsP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $at_search_genl_predsP$.getDynamicValue(thread);
	}
    }

    public static SubLObject at_searching_genl_predsP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $at_search_genl_predsP$.getDynamicValue(thread);
    }

    public static final SubLObject at_searching_genl_inversesP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $at_search_genl_inversesP$.getDynamicValue(thread);
	}
    }

    public static SubLObject at_searching_genl_inversesP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $at_search_genl_inversesP$.getDynamicValue(thread);
    }

    /**
     * the collection with which the current defn is associated
     * (calling defns declared via declare-collection-specific-defn)
     */
    @LispMethod(comment = "the collection with which the current defn is associated\r\n(calling defns declared via declare-collection-specific-defn)\nthe collection with which the current defn is associated\n(calling defns declared via declare-collection-specific-defn)")
    public static final SubLObject defn_collection_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $defn_collection$.getDynamicValue(thread);
	}
    }

    /**
     * the collection with which the current defn is associated
     * (calling defns declared via declare-collection-specific-defn)
     */
    @LispMethod(comment = "the collection with which the current defn is associated\r\n(calling defns declared via declare-collection-specific-defn)\nthe collection with which the current defn is associated\n(calling defns declared via declare-collection-specific-defn)")
    public static SubLObject defn_collection() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $defn_collection$.getDynamicValue(thread);
    }

    public static final SubLObject permitting_denotational_terms_admitted_by_defn_via_isaP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $permitting_denotational_terms_admitted_by_defn_via_isaP$.getDynamicValue(thread);
	}
    }

    public static SubLObject permitting_denotational_terms_admitted_by_defn_via_isaP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $permitting_denotational_terms_admitted_by_defn_via_isaP$.getDynamicValue(thread);
    }

    public static final SubLObject without_permitting_denotational_terms_admitted_by_defn_via_isaP_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject body = current;
	    return listS(CLET, $list_alt244, append(body, NIL));
	}
    }

    public static SubLObject without_permitting_denotational_terms_admitted_by_defn_via_isaP(final SubLObject macroform, final SubLObject environment) {
	final SubLObject datum = macroform.rest();
	final SubLObject body;
	final SubLObject current = body = datum;
	return listS(CLET, $list128, append(body, NIL));
    }

    public static final SubLObject new_at_parameter_state_from_context_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != com.cyc.cycjava.cycl.at_vars.default_at_parameter_stateP()) {
		return $DEFAULT;
	    } else {
		if (NIL != com.cyc.cycjava.cycl.at_vars.no_defining_mts_at_parameter_stateP()) {
		    return $NO_DEFINING_MTS;
		} else {
		    if (NIL != com.cyc.cycjava.cycl.at_vars.no_arg_types_at_parameter_stateP()) {
			return $NO_ARG_TYPES;
		    } else {
			if (NIL != com.cyc.cycjava.cycl.at_vars.no_arg_format_at_parameter_stateP()) {
			    return $NO_ARG_FORMAT;
			} else {
			    {
				SubLObject state = list(new SubLObject[] { $at_check_arg_typesP$.getDynamicValue(thread), $at_check_defining_mtsP$.getDynamicValue(thread), $at_check_arg_genlsP$.getDynamicValue(thread), $at_check_arg_formatP$.getDynamicValue(thread),
					$at_check_arg_isaP$.getDynamicValue(thread), $at_check_not_isa_disjointP$.getDynamicValue(thread), $at_check_inter_arg_differentP$.getDynamicValue(thread), $at_check_inter_arg_isaP$.getDynamicValue(thread), $at_check_inter_arg_genlP$.getDynamicValue(thread),
					$at_check_inter_arg_formatP$.getDynamicValue(thread), $at_check_relator_constraintsP$.getDynamicValue(thread), $at_some_arg_isa_requiredP$.getDynamicValue(thread), wff_vars.wff_mode() });
				return state;
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject new_at_parameter_state_from_context() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != default_at_parameter_stateP()) {
	    return $DEFAULT;
	}
	if (NIL != no_defining_mts_at_parameter_stateP()) {
	    return $NO_DEFINING_MTS;
	}
	if (NIL != no_arg_types_at_parameter_stateP()) {
	    return $NO_ARG_TYPES;
	}
	if (NIL != no_arg_format_at_parameter_stateP()) {
	    return $NO_ARG_FORMAT;
	}
	final SubLObject state = list(new SubLObject[] { $at_check_arg_typesP$.getDynamicValue(thread), $at_check_defining_mtsP$.getDynamicValue(thread), $at_check_arg_genlsP$.getDynamicValue(thread), $at_check_arg_formatP$.getDynamicValue(thread), $at_check_arg_isaP$.getDynamicValue(thread),
		$at_check_not_isa_disjointP$.getDynamicValue(thread), $at_check_inter_arg_differentP$.getDynamicValue(thread), $at_check_inter_arg_isaP$.getDynamicValue(thread), $at_check_inter_arg_genlP$.getDynamicValue(thread), $at_check_inter_arg_formatP$.getDynamicValue(thread),
		$at_check_relator_constraintsP$.getDynamicValue(thread), $at_some_arg_isa_requiredP$.getDynamicValue(thread), wff_vars.wff_mode() });
	return state;
    }

    public static final SubLObject default_at_parameter_stateP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return makeBoolean(((((((((((((NIL != $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL != $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_formatP$.getDynamicValue(thread)))
		    && (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread)))
		    && (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread)))
		    && (NIL != wff_vars.wff_strictP()));
	}
    }

    public static SubLObject default_at_parameter_stateP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean(((((((((((((NIL != $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL != $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_formatP$.getDynamicValue(thread)))
		&& (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread)))
		&& (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread)))
		&& (NIL != wff_vars.wff_strictP()));
    }

    public static final SubLObject no_defining_mts_at_parameter_stateP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return makeBoolean(((((((((((((NIL != $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL == $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_formatP$.getDynamicValue(thread)))
		    && (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread)))
		    && (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread)))
		    && (NIL != wff_vars.wff_strictP()));
	}
    }

    public static SubLObject no_defining_mts_at_parameter_stateP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean(((((((((((((NIL != $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL == $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_formatP$.getDynamicValue(thread)))
		&& (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread)))
		&& (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread)))
		&& (NIL != wff_vars.wff_strictP()));
    }

    public static final SubLObject no_arg_types_at_parameter_stateP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return makeBoolean(((((((((((((NIL == $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL == $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_formatP$.getDynamicValue(thread)))
		    && (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread)))
		    && (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread)))
		    && (NIL != wff_vars.wff_strictP()));
	}
    }

    public static SubLObject no_arg_types_at_parameter_stateP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean(((((((((((((NIL == $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL == $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_formatP$.getDynamicValue(thread)))
		&& (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread)))
		&& (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread)))
		&& (NIL != wff_vars.wff_strictP()));
    }

    public static final SubLObject no_arg_format_at_parameter_stateP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return makeBoolean(((((((((((((NIL != $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL == $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL == $at_check_arg_formatP$.getDynamicValue(thread)))
		    && (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread)))
		    && (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread)))
		    && (NIL != wff_vars.wff_strictP()));
	}
    }

    public static SubLObject no_arg_format_at_parameter_stateP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean(((((((((((((NIL != $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL == $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL == $at_check_arg_formatP$.getDynamicValue(thread)))
		&& (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread)))
		&& (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread)))
		&& (NIL != wff_vars.wff_strictP()));
    }

    public static SubLObject declare_at_vars_file() {
	declareFunction("at_check_arg_types_p", "AT-CHECK-ARG-TYPES-P", 0, 0, false);
	declareFunction("at_check_defining_mts_p", "AT-CHECK-DEFINING-MTS-P", 0, 0, false);
	declareFunction("within_tou_gafP", "WITHIN-TOU-GAF?", 0, 0, false);
	declareFunction("at_some_arg_isa_requiredP", "AT-SOME-ARG-ISA-REQUIRED?", 0, 0, false);
	declareFunction("consider_multiargs_at_predP", "CONSIDER-MULTIARGS-AT-PRED?", 0, 0, false);
	declareFunction("at_searching_genl_predsP", "AT-SEARCHING-GENL-PREDS?", 0, 0, false);
	declareFunction("at_searching_genl_inversesP", "AT-SEARCHING-GENL-INVERSES?", 0, 0, false);
	declareFunction("defn_collection", "DEFN-COLLECTION", 0, 0, false);
	declareFunction("permitting_denotational_terms_admitted_by_defn_via_isaP", "PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?", 0, 0, false);
	declareMacro("without_permitting_denotational_terms_admitted_by_defn_via_isaP", "WITHOUT-PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?");
	declareFunction("new_at_parameter_state_from_context", "NEW-AT-PARAMETER-STATE-FROM-CONTEXT", 0, 0, false);
	declareFunction("default_at_parameter_stateP", "DEFAULT-AT-PARAMETER-STATE?", 0, 0, false);
	declareFunction("no_defining_mts_at_parameter_stateP", "NO-DEFINING-MTS-AT-PARAMETER-STATE?", 0, 0, false);
	declareFunction("no_arg_types_at_parameter_stateP", "NO-ARG-TYPES-AT-PARAMETER-STATE?", 0, 0, false);
	declareFunction("no_arg_format_at_parameter_stateP", "NO-ARG-FORMAT-AT-PARAMETER-STATE?", 0, 0, false);
	return NIL;
    }

    public static final SubLObject init_at_vars_file_alt() {
	defparameter("*SEMANTIC-DNF-HL-FILTERING-ENABLED*", NIL);
	defparameter("*AT-CHECK-FN-SYMBOL?*", T);
	defparameter("*AT-CHECK-ARG-GENLS?*", T);
	defparameter("*AT-CHECK-ARG-ISA?*", T);
	defparameter("*AT-CHECK-ARG-QUOTED-ISA?*", T);
	defparameter("*AT-CHECK-ARG-NOT-ISA?*", T);
	defparameter("*AT-CHECK-ARG-TYPES?*", T);
	defparameter("*AT-POSSIBLY-CHECK-DEFINING-MTS?*", NIL);
	defparameter("*AT-CHECK-DEFINING-MTS?*", T);
	defparameter("*AT-CHECK-INTER-ARG-ISA?*", T);
	defparameter("*AT-CHECK-INTER-ARG-NOT-ISA?*", T);
	defparameter("*AT-CHECK-INTER-ARG-GENL?*", NIL);
	defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*", T);
	defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-GENL?*", T);
	defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-FORMAT?*", T);
	defparameter("*AT-CHECK-NOT-ISA-DISJOINT?*", T);
	defparameter("*AT-CHECK-NOT-QUOTED-ISA-DISJOINT?*", T);
	defparameter("*AT-CHECK-NOT-GENLS-DISJOINT?*", T);
	defparameter("*AT-CHECK-NOT-MDW?*", T);
	defparameter("*AT-CHECK-NOT-SDC?*", T);
	defparameter("*AT-CHECK-ARG-FORMAT?*", T);
	defparameter("*AT-CHECK-SEF?*", T);
	defparameter("*AT-CHECK-RELATOR-CONSTRAINTS?*", T);
	defparameter("*AT-ENSURE-CONSISTENCY?*", NIL);
	defparameter("*AT-PRED-CONSTRAINTS*", $list_alt48);
	defparameter("*AT-PREDICATE-VIOLATIONS*", NIL);
	defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*", T);
	defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*", $int$100);
	defparameter("*FAG-SEARCH-LIMIT*", NIL);
	defparameter("*AT-GAF-SEARCH-LIMIT*", $int$100);
	defparameter("*AT-CHECK-INTER-ARG-FORMAT?*", T);
	defparameter("*AT-CHECK-INTER-ARG-DIFFERENT?*", T);
	defparameter("*AT-CHECK-GENL-PREDS?*", T);
	defparameter("*AT-CHECK-GENL-INVERSES?*", T);
	defparameter("*AT-INCLUDE-ISA-LITERAL-CONSTRAINTS*", T);
	defparameter("*AT-INCLUDE-GENL-LITERAL-CONSTRAINTS*", T);
	defparameter("*GATHER-AT-CONSTRAINTS?*", NIL);
	defparameter("*GATHER-AT-ASSERTIONS?*", NIL);
	defparameter("*GATHER-AT-FORMAT-VIOLATIONS?*", NIL);
	defparameter("*GATHER-AT-DIFFERENT-VIOLATIONS?*", NIL);
	defparameter("*GATHER-AT-PREDICATE-VIOLATIONS?*", NIL);
	defparameter("*AT-FORMAT-VIOLATIONS*", NIL);
	defparameter("*AT-DIFFERENT-VIOLATIONS*", NIL);
	defparameter("*WITHIN-AT-SUGGESTION?*", NIL);
	defparameter("*WITHIN-AT-MAPPING?*", NIL);
	defparameter("*AT-BREAK-ON-FAILURE?*", NIL);
	defparameter("*ACCUMULATING-AT-VIOLATIONS?*", NIL);
	defparameter("*NOTING-AT-VIOLATIONS?*", NIL);
	defparameter("*AT-TRACE-LEVEL*", ONE_INTEGER);
	defparameter("*AT-TEST-LEVEL*", THREE_INTEGER);
	defparameter("*APPRAISING-DISJUNCT?*", NIL);
	defparameter("*WITHIN-DECONTEXTUALIZED?*", NIL);
	defparameter("*WITHIN-DISJUNCTION?*", NIL);
	defparameter("*WITHIN-CONJUNCTION?*", NIL);
	defparameter("*WITHIN-NEGATED-DISJUNCTION?*", NIL);
	defparameter("*WITHIN-NEGATED-CONJUNCTION?*", NIL);
	defparameter("*WITHIN-FUNCTION?*", NIL);
	defparameter("*WITHIN-PREDICATE?*", NIL);
	defparameter("*WITHIN-TOU-GAF?*", NIL);
	defparameter("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*", T);
	defparameter("*AT-RELAX-ARG-CONSTRAINTS-FOR-OPAQUE-EXPANSION-NATS?*", T);
	defparameter("*AT-ADMIT-CONSISTENT-NAUTS?*", T);
	defparameter("*AT-ADMIT-CONSISTENT-NARTS?*", T);
	defparameter("*AT-RESULT*", NIL);
	defparameter("*AT-SOME-ARG-ISA?*", NIL);
	defparameter("*AT-SOME-ARG-ISA-REQUIRED?*", NIL);
	defparameter("*AT-CONSIDER-MULTIARGS-AT-PRED?*", T);
	defparameter("*AT-ISA-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-GENL-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-FORMAT-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-DIFFERENT-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-ISA-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-GENL-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-FORMAT-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-DIFFERENT-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-MODE*", NIL);
	defparameter("*AT-CONSTRAINT-TYPE*", NIL);
	defparameter("*AT-ARG-TYPE*", NIL);
	defparameter("*AT-BASE-FN*", NIL);
	defparameter("*AT-FORMULA*", NIL);
	defparameter("*AT-PRED*", NIL);
	defparameter("*AT-INVERSE*", NIL);
	defparameter("*AT-RELN*", NIL);
	defparameter("*AT-ARG*", NIL);
	defparameter("*AT-ARGNUM*", NIL);
	defparameter("*AT-ARG1*", NIL);
	defparameter("*AT-ARG2*", NIL);
	defparameter("*AT-IND-ARGNUM*", NIL);
	defparameter("*AT-IND-ARG*", NIL);
	defparameter("*AT-IND-ISA*", NIL);
	defparameter("*AT-IND-GENL*", NIL);
	defparameter("*AT-ARG-ISA*", NIL);
	defparameter("*AT-SOURCE*", NIL);
	defparameter("*AT-MAPPING-GENL-INVERSES?*", NIL);
	defparameter("*AT-SEARCH-GENL-PREDS?*", T);
	defparameter("*AT-SEARCH-GENL-INVERSES?*", T);
	defparameter("*AT-PROFILE-TERM*", NIL);
	defparameter("*AT-CONSTRAINT-GAF*", NIL);
	defparameter("*INCLUDE-AT-CONSTRAINT-GAF?*", T);
	defparameter("*AT-VAR-ISA*", NIL);
	defparameter("*AT-VAR-GENL*", NIL);
	defparameter("*AT-VAR-TYPES-STANDARD*", $NOT_DISJOINT);
	defparameter("*AT-ASSUME-CONJUNCTS-INDEPENDENT?*", T);
	defparameter("*CURRENT-AT-VIOLATION*", NIL);
	defparameter("*AT-VIOLATIONS*", NIL);
	defparameter("*AT-DISJOINS-SPACE*", NIL);
	defparameter("*AT-ISA-SPACE*", NIL);
	defparameter("*AT-GENLS-SPACE*", NIL);
	defparameter("*AT-DEFNS-AVAILABLE?*", T);
	defparameter("*AT-APPLY-NECESSARY-DEFNS?*", T);
	defparameter("*SORT-SUF-DEFN-ASSERTIONS?*", T);
	defparameter("*SORT-SUF-FUNCTION-ASSERTIONS?*", NIL);
	defvar("*AT-COLLECTION-SPECIFIC-DEFNS*", NIL);
	defparameter("*DEFN-TRACE-LEVEL*", ONE_INTEGER);
	defparameter("*DEFN-TEST-LEVEL*", THREE_INTEGER);
	defparameter("*DEFN-METERS?*", NIL);
	defvar("*SUF-DEFN-CACHE*", make_hash_table($int$256, UNPROVIDED, UNPROVIDED));
	defvar("*SUF-QUOTED-DEFN-CACHE*", make_hash_table($int$200, UNPROVIDED, UNPROVIDED));
	defparameter("*DEFN-METER-CACHES*", NIL);
	defparameter("*DEFN-COLLECTION*", NIL);
	defparameter("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*", T);
	defparameter("*AT-DEFN*", NIL);
	defparameter("*AT-DEFNS*", NIL);
	defvar("*SUF-FUNCTION-CACHE*", make_hash_table($int$256, UNPROVIDED, UNPROVIDED));
	defvar("*SUF-QUOTED-FUNCTION-CACHE*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-FUNCTION*", NIL);
	defparameter("*AT-FUNCTIONS*", NIL);
	defparameter("*DEFN-FN-HISTORY-DEFAULT-SIZE*", $int$32);
	defparameter("*DEFN-COL-HISTORY-DEFAULT-SIZE*", $int$64);
	defparameter("*DEFN-COL-HISTORY*", $UNINITIALIZED);
	defparameter("*QUOTED-DEFN-COL-HISTORY*", $UNINITIALIZED);
	defparameter("*DEFN-FN-HISTORY*", $UNINITIALIZED);
	defparameter("*QUOTED-DEFN-FN-HISTORY*", $UNINITIALIZED);
	defparameter("*DEFN-STACK*", $UNINITIALIZED);
	return NIL;
    }

    public static SubLObject init_at_vars_file() {
	if (SubLFiles.USE_V1) {
	    defparameter("*SEMANTIC-DNF-HL-FILTERING-ENABLED*", NIL);
	    defparameter("*AT-CHECK-FN-SYMBOL?*", T);
	    defparameter("*AT-CHECK-ARG-GENLS?*", T);
	    defparameter("*AT-CHECK-ARG-ISA?*", T);
	    defparameter("*AT-CHECK-ARG-QUOTED-ISA?*", T);
	    defparameter("*AT-CHECK-ARG-NOT-ISA?*", T);
	    defparameter("*AT-CHECK-ARG-TYPES?*", T);
	    defparameter("*AT-POSSIBLY-CHECK-DEFINING-MTS?*", NIL);
	    defparameter("*AT-CHECK-DEFINING-MTS?*", T);
	    defparameter("*AT-CHECK-INTER-ARG-ISA?*", T);
	    defparameter("*AT-CHECK-INTER-ARG-NOT-ISA?*", T);
	    defparameter("*AT-CHECK-INTER-ARG-GENL?*", NIL);
	    defparameter("*AT-CHECK-INTER-ARG-NOT-GENL?*", T);
	    defparameter("*AT-CHECK-INTER-ARG-ISA-GENL?*", T);
	    defparameter("*AT-CHECK-INTER-ARG-GENL-ISA?*", T);
	    defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*", T);
	    defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-GENL?*", T);
	    defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-FORMAT?*", T);
	    defparameter("*AT-CHECK-NOT-ISA-DISJOINT?*", T);
	    defparameter("*AT-CHECK-NOT-QUOTED-ISA-DISJOINT?*", T);
	    defparameter("*AT-CHECK-NOT-GENLS-DISJOINT?*", T);
	    defparameter("*AT-CHECK-NOT-MDW?*", T);
	    defparameter("*AT-CHECK-NOT-SDC?*", T);
	    defparameter("*AT-CHECK-ARG-FORMAT?*", T);
	    defparameter("*AT-CHECK-RELATOR-CONSTRAINTS?*", T);
	    defparameter("*AT-ENSURE-CONSISTENCY?*", NIL);
	    defparameter("*AT-PRED-CONSTRAINTS*", $list26);
	    defparameter("*AT-PREDICATE-VIOLATIONS*", NIL);
	    defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*", T);
	    defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*", $int$100);
	    defparameter("*FAG-SEARCH-LIMIT*", NIL);
	    defparameter("*AT-GAF-SEARCH-LIMIT*", $int$100);
	    defparameter("*AT-CHECK-INTER-ARG-FORMAT?*", T);
	    defparameter("*AT-CHECK-INTER-ARG-DIFFERENT?*", T);
	    defparameter("*AT-CHECK-GENL-PREDS?*", T);
	    defparameter("*AT-CHECK-GENL-INVERSES?*", T);
	    defparameter("*AT-INCLUDE-ISA-LITERAL-CONSTRAINTS*", T);
	    defparameter("*AT-INCLUDE-GENL-LITERAL-CONSTRAINTS*", T);
	    defparameter("*GATHER-AT-CONSTRAINTS?*", NIL);
	    defparameter("*GATHER-AT-ASSERTIONS?*", NIL);
	    defparameter("*GATHER-AT-FORMAT-VIOLATIONS?*", NIL);
	    defparameter("*GATHER-AT-DIFFERENT-VIOLATIONS?*", NIL);
	    defparameter("*GATHER-AT-PREDICATE-VIOLATIONS?*", NIL);
	    defparameter("*AT-FORMAT-VIOLATIONS*", NIL);
	    defparameter("*AT-DIFFERENT-VIOLATIONS*", NIL);
	    defparameter("*WITHIN-AT-SUGGESTION?*", NIL);
	    defparameter("*WITHIN-AT-MAPPING?*", NIL);
	    defparameter("*AT-BREAK-ON-FAILURE?*", NIL);
	    defparameter("*ACCUMULATING-AT-VIOLATIONS?*", NIL);
	    defparameter("*NOTING-AT-VIOLATIONS?*", NIL);
	    defparameter("*AT-TRACE-LEVEL*", ONE_INTEGER);
	    defparameter("*AT-TEST-LEVEL*", THREE_INTEGER);
	    defparameter("*APPRAISING-DISJUNCT?*", NIL);
	    defparameter("*WITHIN-DECONTEXTUALIZED?*", NIL);
	    defparameter("*WITHIN-DISJUNCTION?*", NIL);
	    defparameter("*WITHIN-CONJUNCTION?*", NIL);
	    defparameter("*WITHIN-NEGATED-DISJUNCTION?*", NIL);
	    defparameter("*WITHIN-NEGATED-CONJUNCTION?*", NIL);
	    defparameter("*WITHIN-FUNCTION?*", NIL);
	    defparameter("*WITHIN-PREDICATE?*", NIL);
	    defparameter("*WITHIN-TOU-GAF?*", NIL);
	    defparameter("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*", T);
	    defparameter("*AT-RELAX-ARG-CONSTRAINTS-FOR-OPAQUE-EXPANSION-NATS?*", T);
	    defparameter("*AT-ADMIT-CONSISTENT-NAUTS?*", T);
	    defparameter("*AT-ADMIT-CONSISTENT-NARTS?*", NIL);
	    defparameter("*AT-RESULT*", NIL);
	    defparameter("*AT-SOME-ARG-ISA?*", NIL);
	    defparameter("*AT-SOME-ARG-ISA-REQUIRED?*", NIL);
	    defparameter("*AT-CONSIDER-MULTIARGS-AT-PRED?*", T);
	    defparameter("*AT-ISA-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	    defparameter("*AT-GENL-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	    defparameter("*AT-FORMAT-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	    defparameter("*AT-DIFFERENT-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	    defparameter("*AT-ISA-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	    defparameter("*AT-GENL-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	    defparameter("*AT-FORMAT-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	    defparameter("*AT-DIFFERENT-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	    defparameter("*AT-MODE*", NIL);
	    defparameter("*AT-CONSTRAINT-TYPE*", NIL);
	    defparameter("*AT-ARG-TYPE*", NIL);
	    defparameter("*AT-BASE-FN*", NIL);
	    defparameter("*AT-FORMULA*", NIL);
	    defparameter("*AT-PRED*", NIL);
	    defparameter("*AT-INVERSE*", NIL);
	    defparameter("*AT-RELN*", NIL);
	    defparameter("*AT-ARG*", NIL);
	    defparameter("*AT-ARGNUM*", NIL);
	    defparameter("*AT-ARG1*", NIL);
	    defparameter("*AT-ARG2*", NIL);
	    defparameter("*AT-IND-ARGNUM*", NIL);
	    defparameter("*AT-IND-ARG*", NIL);
	    defparameter("*AT-IND-ISA*", NIL);
	    defparameter("*AT-IND-GENL*", NIL);
	    defparameter("*AT-ARG-ISA*", NIL);
	    defparameter("*AT-SOURCE*", NIL);
	    defparameter("*AT-MAPPING-GENL-INVERSES?*", NIL);
	    defparameter("*AT-SEARCH-GENL-PREDS?*", T);
	    defparameter("*AT-SEARCH-GENL-INVERSES?*", T);
	    defparameter("*AT-PROFILE-TERM*", NIL);
	    defparameter("*AT-CONSTRAINT-GAF*", NIL);
	    defparameter("*INCLUDE-AT-CONSTRAINT-GAF?*", T);
	    defparameter("*AT-VAR-ISA*", NIL);
	    defparameter("*AT-VAR-GENL*", NIL);
	    defparameter("*AT-VAR-TYPES-STANDARD*", $NOT_DISJOINT);
	    defparameter("*AT-ASSUME-CONJUNCTS-INDEPENDENT?*", T);
	    defparameter("*CURRENT-AT-VIOLATION*", NIL);
	    defparameter("*AT-VIOLATIONS*", NIL);
	    defparameter("*AT-DISJOINS-SPACE*", NIL);
	    defparameter("*AT-ISA-SPACE*", NIL);
	    defparameter("*AT-GENLS-SPACE*", NIL);
	    defparameter("*AT-DEFNS-AVAILABLE?*", T);
	    defparameter("*AT-APPLY-NECESSARY-DEFNS?*", T);
	    defparameter("*AT-ADDITIONAL-DEFN-CHECKING*", $DISJOINT);
	    defparameter("*SORT-SUF-DEFN-ASSERTIONS?*", T);
	    defparameter("*SORT-SUF-FUNCTION-ASSERTIONS?*", NIL);
	    defvar("*AT-COLLECTION-SPECIFIC-DEFNS*", NIL);
	    defparameter("*DEFN-TRACE-LEVEL*", ONE_INTEGER);
	    defparameter("*DEFN-TEST-LEVEL*", THREE_INTEGER);
	    defparameter("*DEFN-METERS?*", NIL);
	    defparameter("*DEFN-METER-CACHES*", NIL);
	    defparameter("*DEFN-COLLECTION*", NIL);
	    defparameter("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*", T);
	    defparameter("*AT-DEFN*", NIL);
	    defparameter("*AT-DEFNS*", NIL);
	    defparameter("*AT-FUNCTION*", NIL);
	    defparameter("*AT-FUNCTIONS*", NIL);
	    defparameter("*DEFN-FN-HISTORY-DEFAULT-SIZE*", ZERO_INTEGER);
	    defparameter("*DEFN-COL-HISTORY-DEFAULT-SIZE*", ZERO_INTEGER);
	    defparameter("*DEFN-COL-HISTORY*", $UNINITIALIZED);
	    defparameter("*QUOTED-DEFN-COL-HISTORY*", $UNINITIALIZED);
	    defparameter("*DEFN-FN-HISTORY*", $UNINITIALIZED);
	    defparameter("*QUOTED-DEFN-FN-HISTORY*", $UNINITIALIZED);
	    defparameter("*DEFN-STACK*", $UNINITIALIZED);
	}
	if (SubLFiles.USE_V2) {
	    defparameter("*AT-CHECK-SEF?*", T);
	    defparameter("*AT-PRED-CONSTRAINTS*", $list_alt48);
	    defparameter("*AT-ADMIT-CONSISTENT-NARTS?*", T);
	    defvar("*SUF-DEFN-CACHE*", make_hash_table($int$256, UNPROVIDED, UNPROVIDED));
	    defvar("*SUF-QUOTED-DEFN-CACHE*", make_hash_table($int$200, UNPROVIDED, UNPROVIDED));
	    defvar("*SUF-FUNCTION-CACHE*", make_hash_table($int$256, UNPROVIDED, UNPROVIDED));
	    defvar("*SUF-QUOTED-FUNCTION-CACHE*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	    defparameter("*DEFN-FN-HISTORY-DEFAULT-SIZE*", $int$32);
	    defparameter("*DEFN-COL-HISTORY-DEFAULT-SIZE*", $int$64);
	}
	return NIL;
    }

    public static SubLObject init_at_vars_file_Previous() {
	defparameter("*SEMANTIC-DNF-HL-FILTERING-ENABLED*", NIL);
	defparameter("*AT-CHECK-FN-SYMBOL?*", T);
	defparameter("*AT-CHECK-ARG-GENLS?*", T);
	defparameter("*AT-CHECK-ARG-ISA?*", T);
	defparameter("*AT-CHECK-ARG-QUOTED-ISA?*", T);
	defparameter("*AT-CHECK-ARG-NOT-ISA?*", T);
	defparameter("*AT-CHECK-ARG-TYPES?*", T);
	defparameter("*AT-POSSIBLY-CHECK-DEFINING-MTS?*", NIL);
	defparameter("*AT-CHECK-DEFINING-MTS?*", T);
	defparameter("*AT-CHECK-INTER-ARG-ISA?*", T);
	defparameter("*AT-CHECK-INTER-ARG-NOT-ISA?*", T);
	defparameter("*AT-CHECK-INTER-ARG-GENL?*", NIL);
	defparameter("*AT-CHECK-INTER-ARG-NOT-GENL?*", T);
	defparameter("*AT-CHECK-INTER-ARG-ISA-GENL?*", T);
	defparameter("*AT-CHECK-INTER-ARG-GENL-ISA?*", T);
	defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*", T);
	defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-GENL?*", T);
	defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-FORMAT?*", T);
	defparameter("*AT-CHECK-NOT-ISA-DISJOINT?*", T);
	defparameter("*AT-CHECK-NOT-QUOTED-ISA-DISJOINT?*", T);
	defparameter("*AT-CHECK-NOT-GENLS-DISJOINT?*", T);
	defparameter("*AT-CHECK-NOT-MDW?*", T);
	defparameter("*AT-CHECK-NOT-SDC?*", T);
	defparameter("*AT-CHECK-ARG-FORMAT?*", T);
	defparameter("*AT-CHECK-RELATOR-CONSTRAINTS?*", T);
	defparameter("*AT-ENSURE-CONSISTENCY?*", NIL);
	defparameter("*AT-PRED-CONSTRAINTS*", $list26);
	defparameter("*AT-PREDICATE-VIOLATIONS*", NIL);
	defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*", T);
	defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*", $int$100);
	defparameter("*FAG-SEARCH-LIMIT*", NIL);
	defparameter("*AT-GAF-SEARCH-LIMIT*", $int$100);
	defparameter("*AT-CHECK-INTER-ARG-FORMAT?*", T);
	defparameter("*AT-CHECK-INTER-ARG-DIFFERENT?*", T);
	defparameter("*AT-CHECK-GENL-PREDS?*", T);
	defparameter("*AT-CHECK-GENL-INVERSES?*", T);
	defparameter("*AT-INCLUDE-ISA-LITERAL-CONSTRAINTS*", T);
	defparameter("*AT-INCLUDE-GENL-LITERAL-CONSTRAINTS*", T);
	defparameter("*GATHER-AT-CONSTRAINTS?*", NIL);
	defparameter("*GATHER-AT-ASSERTIONS?*", NIL);
	defparameter("*GATHER-AT-FORMAT-VIOLATIONS?*", NIL);
	defparameter("*GATHER-AT-DIFFERENT-VIOLATIONS?*", NIL);
	defparameter("*GATHER-AT-PREDICATE-VIOLATIONS?*", NIL);
	defparameter("*AT-FORMAT-VIOLATIONS*", NIL);
	defparameter("*AT-DIFFERENT-VIOLATIONS*", NIL);
	defparameter("*WITHIN-AT-SUGGESTION?*", NIL);
	defparameter("*WITHIN-AT-MAPPING?*", NIL);
	defparameter("*AT-BREAK-ON-FAILURE?*", NIL);
	defparameter("*ACCUMULATING-AT-VIOLATIONS?*", NIL);
	defparameter("*NOTING-AT-VIOLATIONS?*", NIL);
	defparameter("*AT-TRACE-LEVEL*", ONE_INTEGER);
	defparameter("*AT-TEST-LEVEL*", THREE_INTEGER);
	defparameter("*APPRAISING-DISJUNCT?*", NIL);
	defparameter("*WITHIN-DECONTEXTUALIZED?*", NIL);
	defparameter("*WITHIN-DISJUNCTION?*", NIL);
	defparameter("*WITHIN-CONJUNCTION?*", NIL);
	defparameter("*WITHIN-NEGATED-DISJUNCTION?*", NIL);
	defparameter("*WITHIN-NEGATED-CONJUNCTION?*", NIL);
	defparameter("*WITHIN-FUNCTION?*", NIL);
	defparameter("*WITHIN-PREDICATE?*", NIL);
	defparameter("*WITHIN-TOU-GAF?*", NIL);
	defparameter("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*", T);
	defparameter("*AT-RELAX-ARG-CONSTRAINTS-FOR-OPAQUE-EXPANSION-NATS?*", T);
	defparameter("*AT-ADMIT-CONSISTENT-NAUTS?*", T);
	defparameter("*AT-ADMIT-CONSISTENT-NARTS?*", NIL);
	defparameter("*AT-RESULT*", NIL);
	defparameter("*AT-SOME-ARG-ISA?*", NIL);
	defparameter("*AT-SOME-ARG-ISA-REQUIRED?*", NIL);
	defparameter("*AT-CONSIDER-MULTIARGS-AT-PRED?*", T);
	defparameter("*AT-ISA-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-GENL-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-FORMAT-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-DIFFERENT-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-ISA-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-GENL-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-FORMAT-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-DIFFERENT-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
	defparameter("*AT-MODE*", NIL);
	defparameter("*AT-CONSTRAINT-TYPE*", NIL);
	defparameter("*AT-ARG-TYPE*", NIL);
	defparameter("*AT-BASE-FN*", NIL);
	defparameter("*AT-FORMULA*", NIL);
	defparameter("*AT-PRED*", NIL);
	defparameter("*AT-INVERSE*", NIL);
	defparameter("*AT-RELN*", NIL);
	defparameter("*AT-ARG*", NIL);
	defparameter("*AT-ARGNUM*", NIL);
	defparameter("*AT-ARG1*", NIL);
	defparameter("*AT-ARG2*", NIL);
	defparameter("*AT-IND-ARGNUM*", NIL);
	defparameter("*AT-IND-ARG*", NIL);
	defparameter("*AT-IND-ISA*", NIL);
	defparameter("*AT-IND-GENL*", NIL);
	defparameter("*AT-ARG-ISA*", NIL);
	defparameter("*AT-SOURCE*", NIL);
	defparameter("*AT-MAPPING-GENL-INVERSES?*", NIL);
	defparameter("*AT-SEARCH-GENL-PREDS?*", T);
	defparameter("*AT-SEARCH-GENL-INVERSES?*", T);
	defparameter("*AT-PROFILE-TERM*", NIL);
	defparameter("*AT-CONSTRAINT-GAF*", NIL);
	defparameter("*INCLUDE-AT-CONSTRAINT-GAF?*", T);
	defparameter("*AT-VAR-ISA*", NIL);
	defparameter("*AT-VAR-GENL*", NIL);
	defparameter("*AT-VAR-TYPES-STANDARD*", $NOT_DISJOINT);
	defparameter("*AT-ASSUME-CONJUNCTS-INDEPENDENT?*", T);
	defparameter("*CURRENT-AT-VIOLATION*", NIL);
	defparameter("*AT-VIOLATIONS*", NIL);
	defparameter("*AT-DISJOINS-SPACE*", NIL);
	defparameter("*AT-ISA-SPACE*", NIL);
	defparameter("*AT-GENLS-SPACE*", NIL);
	defparameter("*AT-DEFNS-AVAILABLE?*", T);
	defparameter("*AT-APPLY-NECESSARY-DEFNS?*", T);
	defparameter("*AT-ADDITIONAL-DEFN-CHECKING*", $DISJOINT);
	defparameter("*SORT-SUF-DEFN-ASSERTIONS?*", T);
	defparameter("*SORT-SUF-FUNCTION-ASSERTIONS?*", NIL);
	defvar("*AT-COLLECTION-SPECIFIC-DEFNS*", NIL);
	defparameter("*DEFN-TRACE-LEVEL*", ONE_INTEGER);
	defparameter("*DEFN-TEST-LEVEL*", THREE_INTEGER);
	defparameter("*DEFN-METERS?*", NIL);
	defparameter("*DEFN-METER-CACHES*", NIL);
	defparameter("*DEFN-COLLECTION*", NIL);
	defparameter("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*", T);
	defparameter("*AT-DEFN*", NIL);
	defparameter("*AT-DEFNS*", NIL);
	defparameter("*AT-FUNCTION*", NIL);
	defparameter("*AT-FUNCTIONS*", NIL);
	defparameter("*DEFN-FN-HISTORY-DEFAULT-SIZE*", ZERO_INTEGER);
	defparameter("*DEFN-COL-HISTORY-DEFAULT-SIZE*", ZERO_INTEGER);
	defparameter("*DEFN-COL-HISTORY*", $UNINITIALIZED);
	defparameter("*QUOTED-DEFN-COL-HISTORY*", $UNINITIALIZED);
	defparameter("*DEFN-FN-HISTORY*", $UNINITIALIZED);
	defparameter("*QUOTED-DEFN-FN-HISTORY*", $UNINITIALIZED);
	defparameter("*DEFN-STACK*", $UNINITIALIZED);
	return NIL;
    }

    public static final SubLObject setup_at_vars_file_alt() {
	{
	    SubLObject item_var = $semantic_dnf_hl_filtering_enabled$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($semantic_dnf_hl_filtering_enabled$, $str_alt1$should_the_inference_engine_use_a);
	{
	    SubLObject item_var = $at_check_fn_symbolP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_fn_symbolP$, $str_alt3$require_function_symbols_be_insta);
	{
	    SubLObject item_var = $at_check_arg_genlsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_arg_genlsP$, $str_alt5$enforce___argGenl_constraints_);
	{
	    SubLObject item_var = $at_check_arg_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_arg_isaP$, $str_alt7$enforce_argIsa_constraints_);
	{
	    SubLObject item_var = $at_check_arg_quoted_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_arg_quoted_isaP$, $str_alt9$enforce_argQuotedIsa_constraints_);
	{
	    SubLObject item_var = $at_check_arg_not_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_arg_not_isaP$, $str_alt11$enforce_argNotIsa_constraints_);
	{
	    SubLObject item_var = $at_check_arg_typesP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_arg_typesP$, $str_alt13$enforce_arg_typing_constraints_);
	{
	    SubLObject item_var = $at_possibly_check_defining_mtsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_possibly_check_defining_mtsP$, $str_alt15$is___definingMt_constraint_enforc);
	{
	    SubLObject item_var = $at_check_defining_mtsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_defining_mtsP$, $str_alt17$enforce___definingMt_constraints_);
	{
	    SubLObject item_var = $at_check_inter_arg_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_inter_arg_isaP$, $str_alt19$enforce___interArgIsa_constraints);
	{
	    SubLObject item_var = $at_check_inter_arg_not_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_inter_arg_not_isaP$, $str_alt21$enforce___interArgNotIsa_constrai);
	{
	    SubLObject item_var = $at_check_inter_arg_genlP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_inter_arg_genlP$, $str_alt23$enforce___interArgGenl_constraint);
	{
	    SubLObject item_var = $at_check_non_constant_inter_arg_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_non_constant_inter_arg_isaP$, $str_alt25$enforce_interArgIsa_constraints_f);
	{
	    SubLObject item_var = $at_check_non_constant_inter_arg_genlP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_non_constant_inter_arg_genlP$, $str_alt27$enforce_interArgGenl_constraints_);
	{
	    SubLObject item_var = $at_check_non_constant_inter_arg_formatP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_non_constant_inter_arg_formatP$, $str_alt29$enforce_interArgFormat1_2__and_si);
	{
	    SubLObject item_var = $at_check_not_isa_disjointP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_not_isa_disjointP$, $str_alt31$enforce___argIsa_constraints_for_);
	{
	    SubLObject item_var = $at_check_not_quoted_isa_disjointP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_not_quoted_isa_disjointP$, $str_alt33$enforce___argQuotedIsa_constraint);
	{
	    SubLObject item_var = $at_check_not_genls_disjointP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_not_genls_disjointP$, $str_alt35$enforce___argGenl_constraints_for);
	{
	    SubLObject item_var = $at_check_not_mdwP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_not_mdwP$, $str_alt37$enforce__not_disjoint_constraints);
	{
	    SubLObject item_var = $at_check_not_sdcP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_not_sdcP$, $str_alt39$enforce__not_disjoint_constraints);
	{
	    SubLObject item_var = $at_check_arg_formatP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_arg_formatP$, $str_alt41$enforce___argformat_constraints_);
	{
	    SubLObject item_var = $at_check_sefP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_sefP$, $str_alt43$enforce___singleEntryFormatInArgs);
	{
	    SubLObject item_var = $at_check_relator_constraintsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_relator_constraintsP$, $str_alt45$enforce_asymmetric_predicate_and_);
	{
	    SubLObject item_var = $at_ensure_consistencyP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_ensure_consistencyP$, $str_alt47$enforce_consistency_at_constraint);
	{
	    SubLObject item_var = $at_pred_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_pred_constraints$, NIL);
	{
	    SubLObject item_var = $at_predicate_violations$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_predicate_violations$, $$$relevant_at_predicate_violations);
	{
	    SubLObject item_var = $sym52$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($sym52$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__, $str_alt53$enforce_inter_assert_formats_even);
	{
	    SubLObject item_var = $sym55$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($sym55$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_, $str_alt56$max_number_of_relevant_gafs_to_pe);
	{
	    SubLObject item_var = $fag_search_limit$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($fag_search_limit$, $str_alt58$max_number_of_relevant_gafs_to_pe);
	{
	    SubLObject item_var = $at_gaf_search_limit$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_gaf_search_limit$, $str_alt60$default_max_number_of_relevant_ga);
	{
	    SubLObject item_var = $at_check_inter_arg_formatP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_inter_arg_formatP$, $str_alt62$enforce___interArgFormat1_2__and_);
	{
	    SubLObject item_var = $at_check_inter_arg_differentP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_inter_arg_differentP$, $str_alt64$enforce___interArgDifferent__and_);
	{
	    SubLObject item_var = $at_check_genl_predsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_genl_predsP$, $str_alt66$enforce_arg_constraints_of_genlPr);
	{
	    SubLObject item_var = $at_check_genl_inversesP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_check_genl_inversesP$, $str_alt68$enforce_arg_constraints_of_genlIn);
	{
	    SubLObject item_var = $at_include_isa_literal_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_include_isa_literal_constraints$, $str_alt70$include_explicit___isa_literals_w);
	{
	    SubLObject item_var = $at_include_genl_literal_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_include_genl_literal_constraints$, $str_alt72$include_explicit___genls_literals);
	{
	    SubLObject item_var = $gather_at_constraintsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gather_at_constraintsP$, $str_alt74$collect_applicable_at_constraints);
	{
	    SubLObject item_var = $gather_at_assertionsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gather_at_assertionsP$, $str_alt76$collect_applicable_at_assertions_);
	{
	    SubLObject item_var = $gather_at_format_violationsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gather_at_format_violationsP$, $str_alt78$collect_relevant_at_format_violat);
	{
	    SubLObject item_var = $gather_at_different_violationsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gather_at_different_violationsP$, $str_alt80$collect_relevant_at_different_vio);
	{
	    SubLObject item_var = $gather_at_predicate_violationsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gather_at_predicate_violationsP$, $str_alt82$collect_relevant_at_predicate_vio);
	{
	    SubLObject item_var = $at_format_violations$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_format_violations$, $$$relevant_at_format_violations);
	{
	    SubLObject item_var = $at_different_violations$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_different_violations$, $$$relevant_at_different_violations);
	{
	    SubLObject item_var = $within_at_suggestionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($within_at_suggestionP$, $str_alt88$is_at_module_currently_trying_to_);
	{
	    SubLObject item_var = $within_at_mappingP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($within_at_mappingP$, $str_alt90$is_at_module_currently_executing_);
	{
	    SubLObject item_var = $at_break_on_failureP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_break_on_failureP$, $str_alt92$break_when_an_at_violation_is_enc);
	{
	    SubLObject item_var = $accumulating_at_violationsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($accumulating_at_violationsP$, $str_alt94$continue_at_checks_even_after_con);
	{
	    SubLObject item_var = $noting_at_violationsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($noting_at_violationsP$, $str_alt96$should_arg_type_violations_be_rec);
	{
	    SubLObject item_var = $at_trace_level$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_trace_level$, $str_alt98$controls_extent_of_tracing__warni);
	{
	    SubLObject item_var = $at_test_level$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_test_level$, $str_alt100$controls_extent_of_testing_for_th);
	{
	    SubLObject item_var = $appraising_disjunctP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($appraising_disjunctP$, $str_alt102$is_the_formula_being_considered_b);
	{
	    SubLObject item_var = $within_decontextualizedP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($within_decontextualizedP$, $str_alt104$is_the_formula_being_considered_b);
	{
	    SubLObject item_var = $within_disjunctionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($within_disjunctionP$, $str_alt106$is_the_subformula_being_canonical);
	{
	    SubLObject item_var = $within_conjunctionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($within_conjunctionP$, $str_alt108$is_the_subformula_being_canonical);
	{
	    SubLObject item_var = $within_negated_disjunctionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($within_negated_disjunctionP$, $str_alt110$is_the_subformula_being_canonical);
	{
	    SubLObject item_var = $within_negated_conjunctionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($within_negated_conjunctionP$, $str_alt112$is_the_subformula_being_canonical);
	{
	    SubLObject item_var = $within_functionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($within_functionP$, $str_alt114$is_the_formula_being_canonicalize);
	{
	    SubLObject item_var = $within_predicateP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($within_predicateP$, $str_alt116$is_the_formula_being_canonicalize);
	{
	    SubLObject item_var = $within_tou_gafP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($within_tou_gafP$, $str_alt118$is_the_formula_being_canonicalize);
	{
	    SubLObject item_var = $relax_arg_constraints_for_disjunctionsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($relax_arg_constraints_for_disjunctionsP$, $str_alt120$should_arg_type_constraints_be_we);
	{
	    SubLObject item_var = $at_relax_arg_constraints_for_opaque_expansion_natsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_relax_arg_constraints_for_opaque_expansion_natsP$, $str_alt122$within_expansions_should_arg_type);
	{
	    SubLObject item_var = $at_admit_consistent_nautsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_admit_consistent_nautsP$, $str_alt124$should_the_arg_type_module_admit_);
	register_html_state_variable($at_admit_consistent_nautsP$);
	register_html_interface_variable($at_admit_consistent_nautsP$);
	{
	    SubLObject item_var = $at_admit_consistent_nartsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_admit_consistent_nartsP$, $str_alt126$should_the_arg_type_module_admit_);
	register_html_state_variable($at_admit_consistent_nartsP$);
	register_html_interface_variable($at_admit_consistent_nartsP$);
	{
	    SubLObject item_var = $at_result$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_result$, $str_alt128$accumulates_results_of_current_at);
	{
	    SubLObject item_var = $at_some_arg_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_some_arg_isaP$, $str_alt130$is_any_arg_isa_constraint_found_d);
	{
	    SubLObject item_var = $at_some_arg_isa_requiredP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_some_arg_isa_requiredP$, $str_alt132$must_there_be_some_arg_isa_constr);
	{
	    SubLObject item_var = $at_consider_multiargs_at_predP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_consider_multiargs_at_predP$, $str_alt134$during_arg_type_analysis_do_we_co);
	{
	    SubLObject item_var = $at_isa_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_isa_constraints$, $str_alt137$accumulates_applicable_at_isa_con);
	{
	    SubLObject item_var = $at_genl_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_genl_constraints$, $str_alt139$accumulates_applicable_at_genl_co);
	{
	    SubLObject item_var = $at_format_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_format_constraints$, $str_alt141$accumulates_applicable_at_format_);
	{
	    SubLObject item_var = $at_different_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_different_constraints$, $str_alt143$accumulates_applicable_at_differe);
	{
	    SubLObject item_var = $at_isa_assertions$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_isa_assertions$, $str_alt145$accumulates_applicable_at_isa_ass);
	{
	    SubLObject item_var = $at_genl_assertions$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_genl_assertions$, $str_alt147$accumulates_applicable_at_genl_as);
	{
	    SubLObject item_var = $at_format_assertions$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_format_assertions$, $str_alt149$accumulates_applicable_at_format_);
	{
	    SubLObject item_var = $at_different_assertions$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_different_assertions$, $str_alt151$accumulates_applicable_at_differe);
	{
	    SubLObject item_var = $at_mode$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_mode$, $str_alt153$the_type_of_at_test_currently_bei);
	{
	    SubLObject item_var = $at_constraint_type$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_constraint_type$, $str_alt155$the_type_of_at_constraint_current);
	{
	    SubLObject item_var = $at_arg_type$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_arg_type$, $str_alt157$type_of_arg_being_considered_with);
	{
	    SubLObject item_var = $at_base_fn$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_base_fn$, $str_alt159$fn_applied_to_each_applicable_arg);
	{
	    SubLObject item_var = $at_formula$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_formula$, $$$the_formula_being_appraised);
	{
	    SubLObject item_var = $at_pred$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_pred$, $str_alt163$the_current_at_module_constraint_);
	{
	    SubLObject item_var = $at_inverse$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_inverse$, $str_alt165$the_inverse_of_the_current_at_mod);
	{
	    SubLObject item_var = $at_reln$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_reln$, $str_alt167$the_relation_whose_args_are_curre);
	{
	    SubLObject item_var = $at_arg$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_arg$, $str_alt169$the_particular_arg_that_is_curren);
	{
	    SubLObject item_var = $at_argnum$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_argnum$, $str_alt171$the_position_of_the_arg_that_is_c);
	{
	    SubLObject item_var = $sym172$_AT_ARG1_;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($sym172$_AT_ARG1_, $str_alt173$the_1st_arg_of_the_literal_or_fun);
	{
	    SubLObject item_var = $sym174$_AT_ARG2_;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($sym174$_AT_ARG2_, $str_alt175$the_2nd_arg_of_the_literal_or_fun);
	{
	    SubLObject item_var = $at_ind_argnum$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_ind_argnum$, $str_alt177$the_position_of_the_independent_a);
	{
	    SubLObject item_var = $at_ind_arg$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_ind_arg$, $str_alt179$the_independent_arg_that_is_const);
	{
	    SubLObject item_var = $at_ind_isa$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_ind_isa$, $str_alt181$the_isa_of_the_independent_arg_th);
	{
	    SubLObject item_var = $at_ind_genl$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_ind_genl$, $str_alt183$the_genl_of_the_independent_arg_t);
	{
	    SubLObject item_var = $at_arg_isa$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_arg_isa$, $str_alt185$the_isa_of_the_dependent_arg_that);
	{
	    SubLObject item_var = $at_source$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_source$, $str_alt187$the_constant_indexing_the_current);
	{
	    SubLObject item_var = $at_mapping_genl_inversesP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_mapping_genl_inversesP$, $str_alt189$dynamic_state_variable__are_we_lo);
	{
	    SubLObject item_var = $at_search_genl_predsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_search_genl_predsP$, $str_alt191$consider_genlPreds_during_current);
	{
	    SubLObject item_var = $at_search_genl_inversesP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_search_genl_inversesP$, $str_alt193$consider_genlInverses_during_curr);
	{
	    SubLObject item_var = $at_profile_term$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_profile_term$, $str_alt195$the_term__var__constant_______tha);
	{
	    SubLObject item_var = $at_constraint_gaf$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_constraint_gaf$, $str_alt197$the_arg_type_constraint_assertion);
	{
	    SubLObject item_var = $include_at_constraint_gafP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($include_at_constraint_gafP$, $str_alt199$boolean__should_errors_reference_);
	{
	    SubLObject item_var = $at_var_isa$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_var_isa$, $str_alt201$the_accumulating_inter_reference_);
	{
	    SubLObject item_var = $at_var_genl$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_var_genl$, $str_alt203$the_accumulating_inter_reference_);
	{
	    SubLObject item_var = $at_var_types_standard$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_var_types_standard$, $str_alt206$the_standard_for_acceptable_arg_t);
	{
	    SubLObject item_var = $at_assume_conjuncts_independentP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_assume_conjuncts_independentP$, $str_alt208$Whether_arg_type_checking_for_var);
	{
	    SubLObject item_var = $current_at_violation$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($current_at_violation$, $str_alt210$description_of_most_recent_violat);
	{
	    SubLObject item_var = $at_violations$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_violations$, $str_alt212$descriptions_of_how_a_relational_);
	{
	    SubLObject item_var = $at_disjoins_space$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_disjoins_space$, $str_alt214$sbhl_space_used_for_marking_disjo);
	{
	    SubLObject item_var = $at_isa_space$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_isa_space$, $str_alt216$sbhl_space_used_for_marking_all_i);
	{
	    SubLObject item_var = $at_genls_space$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_genls_space$, $str_alt218$sbhl_space_used_for_marking_all_g);
	{
	    SubLObject item_var = $at_defns_availableP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_defns_availableP$, $str_alt220$make_defns_available_for_at_queri);
	{
	    SubLObject item_var = $at_apply_necessary_defnsP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_apply_necessary_defnsP$, $str_alt222$enforce_all_applicable_necessary_);
	{
	    SubLObject item_var = $sort_suf_defn_assertionsP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($sort_suf_defn_assertionsP$, $str_alt224$are_the_cached_suf_defn_assertion);
	{
	    SubLObject item_var = $sort_suf_function_assertionsP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($sort_suf_function_assertionsP$, $str_alt226$are_the_cached_suf_function_asser);
	{
	    SubLObject item_var = $at_collection_specific_defns$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_collection_specific_defns$, $str_alt228$defns_which_reference__defn_colle);
	{
	    SubLObject item_var = $defn_trace_level$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($defn_trace_level$, $str_alt98$controls_extent_of_tracing__warni);
	{
	    SubLObject item_var = $defn_test_level$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($defn_test_level$, $str_alt100$controls_extent_of_testing_for_th);
	{
	    SubLObject item_var = $defn_metersP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($defn_metersP$, $str_alt232$activate_metering_of_functions_wi);
	{
	    SubLObject item_var = $suf_defn_cache$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($suf_defn_cache$, NIL);
	{
	    SubLObject item_var = $suf_quoted_defn_cache$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($suf_quoted_defn_cache$, NIL);
	{
	    SubLObject item_var = $defn_meter_caches$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($defn_meter_caches$, $str_alt238$list_of_caches_used_for_metering_);
	{
	    SubLObject item_var = $defn_collection$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($defn_collection$, $str_alt240$the_collection_with_which_the_cur);
	{
	    SubLObject item_var = $permitting_denotational_terms_admitted_by_defn_via_isaP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($permitting_denotational_terms_admitted_by_defn_via_isaP$, $str_alt242$should_defns_admit_a_denotation_t);
	{
	    SubLObject item_var = $at_defn$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_defn$, $str_alt246$current_defn_assertion_being_cons);
	{
	    SubLObject item_var = $at_defns$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_defns$, $str_alt248$current_defn_assertions_being_con);
	{
	    SubLObject item_var = $suf_function_cache$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($suf_function_cache$, NIL);
	{
	    SubLObject item_var = $suf_quoted_function_cache$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($suf_quoted_function_cache$, NIL);
	{
	    SubLObject item_var = $at_function$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_function$, $str_alt252$current_sufficient_function_asser);
	{
	    SubLObject item_var = $at_functions$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($at_functions$, $str_alt254$current_sufficient_function_asser);
	{
	    SubLObject item_var = $defn_fn_history_default_size$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($defn_fn_history_default_size$, $str_alt257$the_initial_size_of_each_nested_d);
	{
	    SubLObject item_var = $defn_col_history_default_size$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($defn_col_history_default_size$, $str_alt259$the_initial_size_of_each_nested_d);
	{
	    SubLObject item_var = $defn_col_history$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($defn_col_history$, $str_alt262$the_cache_used__by_the_current_de);
	{
	    SubLObject item_var = $quoted_defn_col_history$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($quoted_defn_col_history$, $str_alt264$the_cache_used__by_the_current_qu);
	{
	    SubLObject item_var = $defn_fn_history$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($defn_fn_history$, $str_alt266$the_cache_used__by_the_current_de);
	{
	    SubLObject item_var = $quoted_defn_fn_history$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($quoted_defn_fn_history$, $str_alt268$the_cache_used__by_the_current_qu);
	{
	    SubLObject item_var = $defn_stack$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($defn_stack$, $str_alt270$A_stack_of_defns_being_called__to);
	return NIL;
    }

    public static SubLObject setup_at_vars_file() {
	if (SubLFiles.USE_V1) {
	    SubLObject item_var = $semantic_dnf_hl_filtering_enabled$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_fn_symbolP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_arg_genlsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_arg_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_arg_quoted_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_arg_not_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_arg_typesP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_possibly_check_defining_mtsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_defining_mtsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_inter_arg_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_inter_arg_not_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_inter_arg_genlP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_inter_arg_not_genlP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_inter_arg_isa_genlP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_inter_arg_genl_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_non_constant_inter_arg_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_non_constant_inter_arg_genlP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_non_constant_inter_arg_formatP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_not_isa_disjointP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_not_quoted_isa_disjointP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_not_genls_disjointP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_not_mdwP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_not_sdcP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_arg_formatP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_relator_constraintsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_ensure_consistencyP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_pred_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_predicate_violations$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $sym29$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $sym31$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $fag_search_limit$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_gaf_search_limit$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_inter_arg_formatP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_inter_arg_differentP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_genl_predsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_check_genl_inversesP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_include_isa_literal_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_include_genl_literal_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $gather_at_constraintsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $gather_at_assertionsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $gather_at_format_violationsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $gather_at_different_violationsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $gather_at_predicate_violationsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_format_violations$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_different_violations$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $within_at_suggestionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $within_at_mappingP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_break_on_failureP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $accumulating_at_violationsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $noting_at_violationsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_trace_level$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_test_level$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $appraising_disjunctP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $within_decontextualizedP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $within_disjunctionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $within_conjunctionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $within_negated_disjunctionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $within_negated_conjunctionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $within_functionP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $within_predicateP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $within_tou_gafP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $relax_arg_constraints_for_disjunctionsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_relax_arg_constraints_for_opaque_expansion_natsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_admit_consistent_nautsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_admit_consistent_nartsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_result$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_some_arg_isaP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_some_arg_isa_requiredP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_consider_multiargs_at_predP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_isa_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_genl_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_format_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_different_constraints$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_isa_assertions$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_genl_assertions$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_format_assertions$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_different_assertions$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_mode$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_constraint_type$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_arg_type$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_base_fn$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_formula$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_pred$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_inverse$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_reln$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_arg$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_argnum$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $sym90$_AT_ARG1_;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $sym91$_AT_ARG2_;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_ind_argnum$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_ind_arg$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_ind_isa$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_ind_genl$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_arg_isa$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_source$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_mapping_genl_inversesP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_search_genl_predsP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_search_genl_inversesP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_profile_term$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_constraint_gaf$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $include_at_constraint_gafP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_var_isa$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_var_genl$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_var_types_standard$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_assume_conjuncts_independentP$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $current_at_violation$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_violations$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_disjoins_space$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_isa_space$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_genls_space$;
	    if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_defns_availableP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_apply_necessary_defnsP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_additional_defn_checking$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $sort_suf_defn_assertionsP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $sort_suf_function_assertionsP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_collection_specific_defns$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $defn_trace_level$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $defn_test_level$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $defn_metersP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $defn_meter_caches$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $defn_collection$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $permitting_denotational_terms_admitted_by_defn_via_isaP$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_defn$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_defns$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_function$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $at_functions$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $defn_fn_history_default_size$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $defn_col_history_default_size$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $defn_col_history$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $quoted_defn_col_history$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $defn_fn_history$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $quoted_defn_fn_history$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	    item_var = $defn_stack$;
	    if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	    }
	}
	if (SubLFiles.USE_V2) {
	    {
		SubLObject item_var = $semantic_dnf_hl_filtering_enabled$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($semantic_dnf_hl_filtering_enabled$, $str_alt1$should_the_inference_engine_use_a);
	    {
		SubLObject item_var = $at_check_fn_symbolP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_fn_symbolP$, $str_alt3$require_function_symbols_be_insta);
	    {
		SubLObject item_var = $at_check_arg_genlsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_arg_genlsP$, $str_alt5$enforce___argGenl_constraints_);
	    {
		SubLObject item_var = $at_check_arg_isaP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_arg_isaP$, $str_alt7$enforce_argIsa_constraints_);
	    {
		SubLObject item_var = $at_check_arg_quoted_isaP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_arg_quoted_isaP$, $str_alt9$enforce_argQuotedIsa_constraints_);
	    {
		SubLObject item_var = $at_check_arg_not_isaP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_arg_not_isaP$, $str_alt11$enforce_argNotIsa_constraints_);
	    {
		SubLObject item_var = $at_check_arg_typesP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_arg_typesP$, $str_alt13$enforce_arg_typing_constraints_);
	    {
		SubLObject item_var = $at_possibly_check_defining_mtsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_possibly_check_defining_mtsP$, $str_alt15$is___definingMt_constraint_enforc);
	    {
		SubLObject item_var = $at_check_defining_mtsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_defining_mtsP$, $str_alt17$enforce___definingMt_constraints_);
	    {
		SubLObject item_var = $at_check_inter_arg_isaP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_inter_arg_isaP$, $str_alt19$enforce___interArgIsa_constraints);
	    {
		SubLObject item_var = $at_check_inter_arg_not_isaP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_inter_arg_not_isaP$, $str_alt21$enforce___interArgNotIsa_constrai);
	    {
		SubLObject item_var = $at_check_inter_arg_genlP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_inter_arg_genlP$, $str_alt23$enforce___interArgGenl_constraint);
	    {
		SubLObject item_var = $at_check_non_constant_inter_arg_isaP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_non_constant_inter_arg_isaP$, $str_alt25$enforce_interArgIsa_constraints_f);
	    {
		SubLObject item_var = $at_check_non_constant_inter_arg_genlP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_non_constant_inter_arg_genlP$, $str_alt27$enforce_interArgGenl_constraints_);
	    {
		SubLObject item_var = $at_check_non_constant_inter_arg_formatP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_non_constant_inter_arg_formatP$, $str_alt29$enforce_interArgFormat1_2__and_si);
	    {
		SubLObject item_var = $at_check_not_isa_disjointP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_not_isa_disjointP$, $str_alt31$enforce___argIsa_constraints_for_);
	    {
		SubLObject item_var = $at_check_not_quoted_isa_disjointP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_not_quoted_isa_disjointP$, $str_alt33$enforce___argQuotedIsa_constraint);
	    {
		SubLObject item_var = $at_check_not_genls_disjointP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_not_genls_disjointP$, $str_alt35$enforce___argGenl_constraints_for);
	    {
		SubLObject item_var = $at_check_not_mdwP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_not_mdwP$, $str_alt37$enforce__not_disjoint_constraints);
	    {
		SubLObject item_var = $at_check_not_sdcP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_not_sdcP$, $str_alt39$enforce__not_disjoint_constraints);
	    {
		SubLObject item_var = $at_check_arg_formatP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_arg_formatP$, $str_alt41$enforce___argformat_constraints_);
	    {
		SubLObject item_var = $at_check_sefP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_sefP$, $str_alt43$enforce___singleEntryFormatInArgs);
	    {
		SubLObject item_var = $at_check_relator_constraintsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_relator_constraintsP$, $str_alt45$enforce_asymmetric_predicate_and_);
	    {
		SubLObject item_var = $at_ensure_consistencyP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_ensure_consistencyP$, $str_alt47$enforce_consistency_at_constraint);
	    {
		SubLObject item_var = $at_pred_constraints$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_pred_constraints$, NIL);
	    {
		SubLObject item_var = $at_predicate_violations$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_predicate_violations$, $$$relevant_at_predicate_violations);
	    {
		SubLObject item_var = $sym52$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($sym52$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__, $str_alt53$enforce_inter_assert_formats_even);
	    {
		SubLObject item_var = $sym55$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($sym55$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_, $str_alt56$max_number_of_relevant_gafs_to_pe);
	    {
		SubLObject item_var = $fag_search_limit$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($fag_search_limit$, $str_alt58$max_number_of_relevant_gafs_to_pe);
	    {
		SubLObject item_var = $at_gaf_search_limit$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_gaf_search_limit$, $str_alt60$default_max_number_of_relevant_ga);
	    {
		SubLObject item_var = $at_check_inter_arg_formatP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_inter_arg_formatP$, $str_alt62$enforce___interArgFormat1_2__and_);
	    {
		SubLObject item_var = $at_check_inter_arg_differentP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_inter_arg_differentP$, $str_alt64$enforce___interArgDifferent__and_);
	    {
		SubLObject item_var = $at_check_genl_predsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_genl_predsP$, $str_alt66$enforce_arg_constraints_of_genlPr);
	    {
		SubLObject item_var = $at_check_genl_inversesP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_check_genl_inversesP$, $str_alt68$enforce_arg_constraints_of_genlIn);
	    {
		SubLObject item_var = $at_include_isa_literal_constraints$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_include_isa_literal_constraints$, $str_alt70$include_explicit___isa_literals_w);
	    {
		SubLObject item_var = $at_include_genl_literal_constraints$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_include_genl_literal_constraints$, $str_alt72$include_explicit___genls_literals);
	    {
		SubLObject item_var = $gather_at_constraintsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gather_at_constraintsP$, $str_alt74$collect_applicable_at_constraints);
	    {
		SubLObject item_var = $gather_at_assertionsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gather_at_assertionsP$, $str_alt76$collect_applicable_at_assertions_);
	    {
		SubLObject item_var = $gather_at_format_violationsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gather_at_format_violationsP$, $str_alt78$collect_relevant_at_format_violat);
	    {
		SubLObject item_var = $gather_at_different_violationsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gather_at_different_violationsP$, $str_alt80$collect_relevant_at_different_vio);
	    {
		SubLObject item_var = $gather_at_predicate_violationsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gather_at_predicate_violationsP$, $str_alt82$collect_relevant_at_predicate_vio);
	    {
		SubLObject item_var = $at_format_violations$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_format_violations$, $$$relevant_at_format_violations);
	    {
		SubLObject item_var = $at_different_violations$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_different_violations$, $$$relevant_at_different_violations);
	    {
		SubLObject item_var = $within_at_suggestionP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($within_at_suggestionP$, $str_alt88$is_at_module_currently_trying_to_);
	    {
		SubLObject item_var = $within_at_mappingP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($within_at_mappingP$, $str_alt90$is_at_module_currently_executing_);
	    {
		SubLObject item_var = $at_break_on_failureP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_break_on_failureP$, $str_alt92$break_when_an_at_violation_is_enc);
	    {
		SubLObject item_var = $accumulating_at_violationsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($accumulating_at_violationsP$, $str_alt94$continue_at_checks_even_after_con);
	    {
		SubLObject item_var = $noting_at_violationsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($noting_at_violationsP$, $str_alt96$should_arg_type_violations_be_rec);
	    {
		SubLObject item_var = $at_trace_level$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_trace_level$, $str_alt98$controls_extent_of_tracing__warni);
	    {
		SubLObject item_var = $at_test_level$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_test_level$, $str_alt100$controls_extent_of_testing_for_th);
	    {
		SubLObject item_var = $appraising_disjunctP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($appraising_disjunctP$, $str_alt102$is_the_formula_being_considered_b);
	    {
		SubLObject item_var = $within_decontextualizedP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($within_decontextualizedP$, $str_alt104$is_the_formula_being_considered_b);
	    {
		SubLObject item_var = $within_disjunctionP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($within_disjunctionP$, $str_alt106$is_the_subformula_being_canonical);
	    {
		SubLObject item_var = $within_conjunctionP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($within_conjunctionP$, $str_alt108$is_the_subformula_being_canonical);
	    {
		SubLObject item_var = $within_negated_disjunctionP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($within_negated_disjunctionP$, $str_alt110$is_the_subformula_being_canonical);
	    {
		SubLObject item_var = $within_negated_conjunctionP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($within_negated_conjunctionP$, $str_alt112$is_the_subformula_being_canonical);
	    {
		SubLObject item_var = $within_functionP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($within_functionP$, $str_alt114$is_the_formula_being_canonicalize);
	    {
		SubLObject item_var = $within_predicateP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($within_predicateP$, $str_alt116$is_the_formula_being_canonicalize);
	    {
		SubLObject item_var = $within_tou_gafP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($within_tou_gafP$, $str_alt118$is_the_formula_being_canonicalize);
	    {
		SubLObject item_var = $relax_arg_constraints_for_disjunctionsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($relax_arg_constraints_for_disjunctionsP$, $str_alt120$should_arg_type_constraints_be_we);
	    {
		SubLObject item_var = $at_relax_arg_constraints_for_opaque_expansion_natsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_relax_arg_constraints_for_opaque_expansion_natsP$, $str_alt122$within_expansions_should_arg_type);
	    {
		SubLObject item_var = $at_admit_consistent_nautsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_admit_consistent_nautsP$, $str_alt124$should_the_arg_type_module_admit_);
	    register_html_state_variable($at_admit_consistent_nautsP$);
	    register_html_interface_variable($at_admit_consistent_nautsP$);
	    {
		SubLObject item_var = $at_admit_consistent_nartsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_admit_consistent_nartsP$, $str_alt126$should_the_arg_type_module_admit_);
	    register_html_state_variable($at_admit_consistent_nartsP$);
	    register_html_interface_variable($at_admit_consistent_nartsP$);
	    {
		SubLObject item_var = $at_result$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_result$, $str_alt128$accumulates_results_of_current_at);
	    {
		SubLObject item_var = $at_some_arg_isaP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_some_arg_isaP$, $str_alt130$is_any_arg_isa_constraint_found_d);
	    {
		SubLObject item_var = $at_some_arg_isa_requiredP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_some_arg_isa_requiredP$, $str_alt132$must_there_be_some_arg_isa_constr);
	    {
		SubLObject item_var = $at_consider_multiargs_at_predP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_consider_multiargs_at_predP$, $str_alt134$during_arg_type_analysis_do_we_co);
	    {
		SubLObject item_var = $at_isa_constraints$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_isa_constraints$, $str_alt137$accumulates_applicable_at_isa_con);
	    {
		SubLObject item_var = $at_genl_constraints$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_genl_constraints$, $str_alt139$accumulates_applicable_at_genl_co);
	    {
		SubLObject item_var = $at_format_constraints$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_format_constraints$, $str_alt141$accumulates_applicable_at_format_);
	    {
		SubLObject item_var = $at_different_constraints$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_different_constraints$, $str_alt143$accumulates_applicable_at_differe);
	    {
		SubLObject item_var = $at_isa_assertions$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_isa_assertions$, $str_alt145$accumulates_applicable_at_isa_ass);
	    {
		SubLObject item_var = $at_genl_assertions$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_genl_assertions$, $str_alt147$accumulates_applicable_at_genl_as);
	    {
		SubLObject item_var = $at_format_assertions$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_format_assertions$, $str_alt149$accumulates_applicable_at_format_);
	    {
		SubLObject item_var = $at_different_assertions$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_different_assertions$, $str_alt151$accumulates_applicable_at_differe);
	    {
		SubLObject item_var = $at_mode$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_mode$, $str_alt153$the_type_of_at_test_currently_bei);
	    {
		SubLObject item_var = $at_constraint_type$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_constraint_type$, $str_alt155$the_type_of_at_constraint_current);
	    {
		SubLObject item_var = $at_arg_type$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_arg_type$, $str_alt157$type_of_arg_being_considered_with);
	    {
		SubLObject item_var = $at_base_fn$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_base_fn$, $str_alt159$fn_applied_to_each_applicable_arg);
	    {
		SubLObject item_var = $at_formula$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_formula$, $$$the_formula_being_appraised);
	    {
		SubLObject item_var = $at_pred$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_pred$, $str_alt163$the_current_at_module_constraint_);
	    {
		SubLObject item_var = $at_inverse$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_inverse$, $str_alt165$the_inverse_of_the_current_at_mod);
	    {
		SubLObject item_var = $at_reln$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_reln$, $str_alt167$the_relation_whose_args_are_curre);
	    {
		SubLObject item_var = $at_arg$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_arg$, $str_alt169$the_particular_arg_that_is_curren);
	    {
		SubLObject item_var = $at_argnum$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_argnum$, $str_alt171$the_position_of_the_arg_that_is_c);
	    {
		SubLObject item_var = $sym172$_AT_ARG1_;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($sym172$_AT_ARG1_, $str_alt173$the_1st_arg_of_the_literal_or_fun);
	    {
		SubLObject item_var = $sym174$_AT_ARG2_;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($sym174$_AT_ARG2_, $str_alt175$the_2nd_arg_of_the_literal_or_fun);
	    {
		SubLObject item_var = $at_ind_argnum$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_ind_argnum$, $str_alt177$the_position_of_the_independent_a);
	    {
		SubLObject item_var = $at_ind_arg$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_ind_arg$, $str_alt179$the_independent_arg_that_is_const);
	    {
		SubLObject item_var = $at_ind_isa$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_ind_isa$, $str_alt181$the_isa_of_the_independent_arg_th);
	    {
		SubLObject item_var = $at_ind_genl$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_ind_genl$, $str_alt183$the_genl_of_the_independent_arg_t);
	    {
		SubLObject item_var = $at_arg_isa$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_arg_isa$, $str_alt185$the_isa_of_the_dependent_arg_that);
	    {
		SubLObject item_var = $at_source$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_source$, $str_alt187$the_constant_indexing_the_current);
	    {
		SubLObject item_var = $at_mapping_genl_inversesP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_mapping_genl_inversesP$, $str_alt189$dynamic_state_variable__are_we_lo);
	    {
		SubLObject item_var = $at_search_genl_predsP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_search_genl_predsP$, $str_alt191$consider_genlPreds_during_current);
	    {
		SubLObject item_var = $at_search_genl_inversesP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_search_genl_inversesP$, $str_alt193$consider_genlInverses_during_curr);
	    {
		SubLObject item_var = $at_profile_term$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_profile_term$, $str_alt195$the_term__var__constant_______tha);
	    {
		SubLObject item_var = $at_constraint_gaf$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_constraint_gaf$, $str_alt197$the_arg_type_constraint_assertion);
	    {
		SubLObject item_var = $include_at_constraint_gafP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($include_at_constraint_gafP$, $str_alt199$boolean__should_errors_reference_);
	    {
		SubLObject item_var = $at_var_isa$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_var_isa$, $str_alt201$the_accumulating_inter_reference_);
	    {
		SubLObject item_var = $at_var_genl$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_var_genl$, $str_alt203$the_accumulating_inter_reference_);
	    {
		SubLObject item_var = $at_var_types_standard$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_var_types_standard$, $str_alt206$the_standard_for_acceptable_arg_t);
	    {
		SubLObject item_var = $at_assume_conjuncts_independentP$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_assume_conjuncts_independentP$, $str_alt208$Whether_arg_type_checking_for_var);
	    {
		SubLObject item_var = $current_at_violation$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($current_at_violation$, $str_alt210$description_of_most_recent_violat);
	    {
		SubLObject item_var = $at_violations$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_violations$, $str_alt212$descriptions_of_how_a_relational_);
	    {
		SubLObject item_var = $at_disjoins_space$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_disjoins_space$, $str_alt214$sbhl_space_used_for_marking_disjo);
	    {
		SubLObject item_var = $at_isa_space$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_isa_space$, $str_alt216$sbhl_space_used_for_marking_all_i);
	    {
		SubLObject item_var = $at_genls_space$;
		if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_genls_space$, $str_alt218$sbhl_space_used_for_marking_all_g);
	    {
		SubLObject item_var = $at_defns_availableP$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_defns_availableP$, $str_alt220$make_defns_available_for_at_queri);
	    {
		SubLObject item_var = $at_apply_necessary_defnsP$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_apply_necessary_defnsP$, $str_alt222$enforce_all_applicable_necessary_);
	    {
		SubLObject item_var = $sort_suf_defn_assertionsP$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($sort_suf_defn_assertionsP$, $str_alt224$are_the_cached_suf_defn_assertion);
	    {
		SubLObject item_var = $sort_suf_function_assertionsP$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($sort_suf_function_assertionsP$, $str_alt226$are_the_cached_suf_function_asser);
	    {
		SubLObject item_var = $at_collection_specific_defns$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_collection_specific_defns$, $str_alt228$defns_which_reference__defn_colle);
	    {
		SubLObject item_var = $defn_trace_level$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($defn_trace_level$, $str_alt98$controls_extent_of_tracing__warni);
	    {
		SubLObject item_var = $defn_test_level$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($defn_test_level$, $str_alt100$controls_extent_of_testing_for_th);
	    {
		SubLObject item_var = $defn_metersP$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($defn_metersP$, $str_alt232$activate_metering_of_functions_wi);
	    {
		SubLObject item_var = $suf_defn_cache$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($suf_defn_cache$, NIL);
	    {
		SubLObject item_var = $suf_quoted_defn_cache$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($suf_quoted_defn_cache$, NIL);
	    {
		SubLObject item_var = $defn_meter_caches$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($defn_meter_caches$, $str_alt238$list_of_caches_used_for_metering_);
	    {
		SubLObject item_var = $defn_collection$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($defn_collection$, $str_alt240$the_collection_with_which_the_cur);
	    {
		SubLObject item_var = $permitting_denotational_terms_admitted_by_defn_via_isaP$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($permitting_denotational_terms_admitted_by_defn_via_isaP$, $str_alt242$should_defns_admit_a_denotation_t);
	    {
		SubLObject item_var = $at_defn$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_defn$, $str_alt246$current_defn_assertion_being_cons);
	    {
		SubLObject item_var = $at_defns$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_defns$, $str_alt248$current_defn_assertions_being_con);
	    {
		SubLObject item_var = $suf_function_cache$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($suf_function_cache$, NIL);
	    {
		SubLObject item_var = $suf_quoted_function_cache$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($suf_quoted_function_cache$, NIL);
	    {
		SubLObject item_var = $at_function$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_function$, $str_alt252$current_sufficient_function_asser);
	    {
		SubLObject item_var = $at_functions$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($at_functions$, $str_alt254$current_sufficient_function_asser);
	    {
		SubLObject item_var = $defn_fn_history_default_size$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($defn_fn_history_default_size$, $str_alt257$the_initial_size_of_each_nested_d);
	    {
		SubLObject item_var = $defn_col_history_default_size$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($defn_col_history_default_size$, $str_alt259$the_initial_size_of_each_nested_d);
	    {
		SubLObject item_var = $defn_col_history$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($defn_col_history$, $str_alt262$the_cache_used__by_the_current_de);
	    {
		SubLObject item_var = $quoted_defn_col_history$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($quoted_defn_col_history$, $str_alt264$the_cache_used__by_the_current_qu);
	    {
		SubLObject item_var = $defn_fn_history$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($defn_fn_history$, $str_alt266$the_cache_used__by_the_current_de);
	    {
		SubLObject item_var = $quoted_defn_fn_history$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($quoted_defn_fn_history$, $str_alt268$the_cache_used__by_the_current_qu);
	    {
		SubLObject item_var = $defn_stack$;
		if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($defn_stack$, $str_alt270$A_stack_of_defns_being_called__to);
	}
	return NIL;
    }

    public static SubLObject setup_at_vars_file_Previous() {
	SubLObject item_var = $semantic_dnf_hl_filtering_enabled$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_fn_symbolP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_arg_genlsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_arg_isaP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_arg_quoted_isaP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_arg_not_isaP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_arg_typesP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_possibly_check_defining_mtsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_defining_mtsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_inter_arg_isaP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_inter_arg_not_isaP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_inter_arg_genlP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_inter_arg_not_genlP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_inter_arg_isa_genlP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_inter_arg_genl_isaP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_non_constant_inter_arg_isaP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_non_constant_inter_arg_genlP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_non_constant_inter_arg_formatP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_not_isa_disjointP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_not_quoted_isa_disjointP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_not_genls_disjointP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_not_mdwP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_not_sdcP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_arg_formatP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_relator_constraintsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_ensure_consistencyP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_pred_constraints$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_predicate_violations$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $sym29$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $sym31$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $fag_search_limit$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_gaf_search_limit$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_inter_arg_formatP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_inter_arg_differentP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_genl_predsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_check_genl_inversesP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_include_isa_literal_constraints$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_include_genl_literal_constraints$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $gather_at_constraintsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $gather_at_assertionsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $gather_at_format_violationsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $gather_at_different_violationsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $gather_at_predicate_violationsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_format_violations$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_different_violations$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $within_at_suggestionP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $within_at_mappingP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_break_on_failureP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $accumulating_at_violationsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $noting_at_violationsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_trace_level$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_test_level$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $appraising_disjunctP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $within_decontextualizedP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $within_disjunctionP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $within_conjunctionP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $within_negated_disjunctionP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $within_negated_conjunctionP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $within_functionP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $within_predicateP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $within_tou_gafP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $relax_arg_constraints_for_disjunctionsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_relax_arg_constraints_for_opaque_expansion_natsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_admit_consistent_nautsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_admit_consistent_nartsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_result$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_some_arg_isaP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_some_arg_isa_requiredP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_consider_multiargs_at_predP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_isa_constraints$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_genl_constraints$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_format_constraints$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_different_constraints$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_isa_assertions$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_genl_assertions$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_format_assertions$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_different_assertions$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_mode$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_constraint_type$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_arg_type$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_base_fn$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_formula$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_pred$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_inverse$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_reln$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_arg$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_argnum$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $sym90$_AT_ARG1_;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $sym91$_AT_ARG2_;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_ind_argnum$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_ind_arg$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_ind_isa$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_ind_genl$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_arg_isa$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_source$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_mapping_genl_inversesP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_search_genl_predsP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_search_genl_inversesP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_profile_term$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_constraint_gaf$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $include_at_constraint_gafP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_var_isa$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_var_genl$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_var_types_standard$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_assume_conjuncts_independentP$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $current_at_violation$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_violations$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_disjoins_space$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_isa_space$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_genls_space$;
	if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
	}
	item_var = $at_defns_availableP$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $at_apply_necessary_defnsP$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $at_additional_defn_checking$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $sort_suf_defn_assertionsP$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $sort_suf_function_assertionsP$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $at_collection_specific_defns$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $defn_trace_level$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $defn_test_level$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $defn_metersP$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $defn_meter_caches$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $defn_collection$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $permitting_denotational_terms_admitted_by_defn_via_isaP$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $at_defn$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $at_defns$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $at_function$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $at_functions$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $defn_fn_history_default_size$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $defn_col_history_default_size$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $defn_col_history$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $quoted_defn_col_history$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $defn_fn_history$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $quoted_defn_fn_history$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	item_var = $defn_stack$;
	if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
	}
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_at_vars_file();
    }

    @Override
    public void initializeVariables() {
	init_at_vars_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_at_vars_file();
    }

    static {
    }

    static private final SubLString $str_alt1$should_the_inference_engine_use_a = makeString("should the inference engine use arg-type tests in order to filter-out non-wff inferences?");

    public static final SubLSymbol $at_check_fn_symbolP$ = makeSymbol("*AT-CHECK-FN-SYMBOL?*");

    static private final SubLString $str_alt3$require_function_symbols_be_insta = makeString("require function symbols be instances of #$Function-Denotational ?");

    public static final SubLSymbol $at_check_arg_genlsP$ = makeSymbol("*AT-CHECK-ARG-GENLS?*");

    static private final SubLString $str_alt5$enforce___argGenl_constraints_ = makeString("enforce #$argGenl constraints?");

    public static final SubLSymbol $at_check_arg_isaP$ = makeSymbol("*AT-CHECK-ARG-ISA?*");

    static private final SubLString $str_alt7$enforce_argIsa_constraints_ = makeString("enforce argIsa constraints?");

    public static final SubLSymbol $at_check_arg_quoted_isaP$ = makeSymbol("*AT-CHECK-ARG-QUOTED-ISA?*");

    static private final SubLString $str_alt9$enforce_argQuotedIsa_constraints_ = makeString("enforce argQuotedIsa constraints?");

    public static final SubLSymbol $at_check_arg_not_isaP$ = makeSymbol("*AT-CHECK-ARG-NOT-ISA?*");

    static private final SubLString $str_alt11$enforce_argNotIsa_constraints_ = makeString("enforce argNotIsa constraints?");

    public static final SubLSymbol $at_check_arg_typesP$ = makeSymbol("*AT-CHECK-ARG-TYPES?*");

    static private final SubLString $str_alt13$enforce_arg_typing_constraints_ = makeString("enforce arg-typing constraints?");

    public static final SubLSymbol $at_possibly_check_defining_mtsP$ = makeSymbol("*AT-POSSIBLY-CHECK-DEFINING-MTS?*");

    static private final SubLString $str_alt15$is___definingMt_constraint_enforc = makeString("is #$definingMt constraint enforcement available?");

    public static final SubLSymbol $at_check_defining_mtsP$ = makeSymbol("*AT-CHECK-DEFINING-MTS?*");

    static private final SubLString $str_alt17$enforce___definingMt_constraints_ = makeString("enforce #$definingMt constraints?");

    public static final SubLSymbol $at_check_inter_arg_isaP$ = makeSymbol("*AT-CHECK-INTER-ARG-ISA?*");

    static private final SubLString $str_alt19$enforce___interArgIsa_constraints = makeString("enforce #$interArgIsa constraints?");

    public static final SubLSymbol $at_check_inter_arg_not_isaP$ = makeSymbol("*AT-CHECK-INTER-ARG-NOT-ISA?*");

    static private final SubLString $str_alt21$enforce___interArgNotIsa_constrai = makeString("enforce #$interArgNotIsa constraints?");

    public static final SubLSymbol $at_check_inter_arg_genlP$ = makeSymbol("*AT-CHECK-INTER-ARG-GENL?*");

    static private final SubLString $str_alt23$enforce___interArgGenl_constraint = makeString("enforce #$interArgGenl constraints?");

    public static final SubLSymbol $at_check_non_constant_inter_arg_isaP$ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*");

    static private final SubLString $str_alt25$enforce_interArgIsa_constraints_f = makeString("enforce interArgIsa constraints for non-constants?");

    public static final SubLSymbol $at_check_non_constant_inter_arg_genlP$ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-GENL?*");

    static private final SubLString $str_alt27$enforce_interArgGenl_constraints_ = makeString("enforce interArgGenl constraints for non-constants?");

    public static final SubLSymbol $at_check_non_constant_inter_arg_formatP$ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-FORMAT?*");

    static private final SubLString $str_alt29$enforce_interArgFormat1_2__and_si = makeString("enforce interArgFormat1-2 (and similar) constraints for non-constants?");

    public static final SubLSymbol $at_check_not_isa_disjointP$ = makeSymbol("*AT-CHECK-NOT-ISA-DISJOINT?*");

    static private final SubLString $str_alt31$enforce___argIsa_constraints_for_ = makeString("enforce #$argIsa constraints for non-constants?");

    public static final SubLSymbol $at_check_not_quoted_isa_disjointP$ = makeSymbol("*AT-CHECK-NOT-QUOTED-ISA-DISJOINT?*");

    static private final SubLString $str_alt33$enforce___argQuotedIsa_constraint = makeString("enforce #$argQuotedIsa constraints for non-constants?");

    public static final SubLSymbol $at_check_not_genls_disjointP$ = makeSymbol("*AT-CHECK-NOT-GENLS-DISJOINT?*");

    static private final SubLString $str_alt35$enforce___argGenl_constraints_for = makeString("enforce #$argGenl constraints for non-constants?");

    public static final SubLSymbol $at_check_not_mdwP$ = makeSymbol("*AT-CHECK-NOT-MDW?*");

    static private final SubLString $str_alt37$enforce__not_disjoint_constraints = makeString("enforce :not-disjoint constraints using mdw module?");

    public static final SubLSymbol $at_check_not_sdcP$ = makeSymbol("*AT-CHECK-NOT-SDC?*");

    static private final SubLString $str_alt39$enforce__not_disjoint_constraints = makeString("enforce :not-disjoint constraints using sdc module?");

    public static final SubLSymbol $at_check_arg_formatP$ = makeSymbol("*AT-CHECK-ARG-FORMAT?*");

    static private final SubLString $str_alt41$enforce___argformat_constraints_ = makeString("enforce #$argformat constraints?");

    public static final SubLSymbol $at_check_sefP$ = makeSymbol("*AT-CHECK-SEF?*");

    static private final SubLString $str_alt43$enforce___singleEntryFormatInArgs = makeString("enforce #$singleEntryFormatInArgs #$argformat constraints?");

    public static final SubLSymbol $at_check_relator_constraintsP$ = makeSymbol("*AT-CHECK-RELATOR-CONSTRAINTS?*");

    static private final SubLString $str_alt45$enforce_asymmetric_predicate_and_ = makeString("enforce asymmetric-predicate and similar constraints?");

    public static final SubLSymbol $at_ensure_consistencyP$ = makeSymbol("*AT-ENSURE-CONSISTENCY?*");

    static private final SubLString $str_alt47$enforce_consistency_at_constraint = makeString("enforce consistency at constraint standard (:not-isa-disjoint et al) in addition to entails standard (:isa et al)?");

    static private final SubLList $list_alt48 = list(makeKeyword("ASYMMETRIC-PREDICATE"), makeKeyword("ANTI-SYMMETRIC-PREDICATE"), makeKeyword("IRREFLEXIVE-PREDICATE"), makeKeyword("ANTI-TRANSITIVE-PREDICATE"), makeKeyword("NEGATION-PREDS"), makeKeyword("NEGATION-INVERSES"));

    static private final SubLString $$$relevant_at_predicate_violations = makeString("relevant at predicate violations");

    static private final SubLSymbol $sym52$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*");

    static private final SubLString $str_alt53$enforce_inter_assert_formats_even = makeString("enforce inter-assert formats even when pred is only index?");

    static private final SubLSymbol $sym55$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*");

    static private final SubLString $str_alt56$max_number_of_relevant_gafs_to_pe = makeString("max number of relevant gafs to permit enforcing inter-assert formats when pred is only index?");

    static private final SubLString $str_alt58$max_number_of_relevant_gafs_to_pe = makeString("max number of relevant gafs to permit using find-accessible-gaf?");

    static private final SubLString $str_alt60$default_max_number_of_relevant_ga = makeString("default max number of relevant gafs to permit enforcing at constraints using find-accessible-gaf (e.g., negation-preds et al)?");

    public static final SubLSymbol $at_check_inter_arg_formatP$ = makeSymbol("*AT-CHECK-INTER-ARG-FORMAT?*");

    static private final SubLString $str_alt62$enforce___interArgFormat1_2__and_ = makeString("enforce #$interArgFormat1-2 (and similar) constraints?");

    public static final SubLSymbol $at_check_inter_arg_differentP$ = makeSymbol("*AT-CHECK-INTER-ARG-DIFFERENT?*");

    static private final SubLString $str_alt64$enforce___interArgDifferent__and_ = makeString("enforce #$interArgDifferent (and similar) constraints?");

    public static final SubLSymbol $at_check_genl_predsP$ = makeSymbol("*AT-CHECK-GENL-PREDS?*");

    static private final SubLString $str_alt66$enforce_arg_constraints_of_genlPr = makeString("enforce arg-constraints of genlPreds?");

    public static final SubLSymbol $at_check_genl_inversesP$ = makeSymbol("*AT-CHECK-GENL-INVERSES?*");

    static private final SubLString $str_alt68$enforce_arg_constraints_of_genlIn = makeString("enforce arg-constraints of genlInverse?");

    static private final SubLString $str_alt70$include_explicit___isa_literals_w = makeString("include explicit #$isa literals when computing type constraints?");

    static private final SubLString $str_alt72$include_explicit___genls_literals = makeString("include explicit #$genls literals when computing type constraints?");

    public static final SubLSymbol $gather_at_constraintsP$ = makeSymbol("*GATHER-AT-CONSTRAINTS?*");

    static private final SubLString $str_alt74$collect_applicable_at_constraints = makeString("collect applicable at constraints?");

    public static final SubLSymbol $gather_at_assertionsP$ = makeSymbol("*GATHER-AT-ASSERTIONS?*");

    static private final SubLString $str_alt76$collect_applicable_at_assertions_ = makeString("collect applicable at assertions?");

    public static final SubLSymbol $gather_at_format_violationsP$ = makeSymbol("*GATHER-AT-FORMAT-VIOLATIONS?*");

    static private final SubLString $str_alt78$collect_relevant_at_format_violat = makeString("collect relevant at format violations?");

    public static final SubLSymbol $gather_at_different_violationsP$ = makeSymbol("*GATHER-AT-DIFFERENT-VIOLATIONS?*");

    static private final SubLString $str_alt80$collect_relevant_at_different_vio = makeString("collect relevant at different violations?");

    public static final SubLSymbol $gather_at_predicate_violationsP$ = makeSymbol("*GATHER-AT-PREDICATE-VIOLATIONS?*");

    static private final SubLString $str_alt82$collect_relevant_at_predicate_vio = makeString("collect relevant at predicate violations (e.g., asymmetry, negationPreds)?");

    static private final SubLString $$$relevant_at_format_violations = makeString("relevant at format violations");

    static private final SubLString $$$relevant_at_different_violations = makeString("relevant at different violations");

    public static final SubLSymbol $within_at_suggestionP$ = makeSymbol("*WITHIN-AT-SUGGESTION?*");

    static private final SubLString $str_alt88$is_at_module_currently_trying_to_ = makeString("is at module currently trying to formula a suggested fix?");

    public static final SubLSymbol $within_at_mappingP$ = makeSymbol("*WITHIN-AT-MAPPING?*");

    static private final SubLString $str_alt90$is_at_module_currently_executing_ = makeString("is at module currently executing a mapping search?");

    public static final SubLSymbol $at_break_on_failureP$ = makeSymbol("*AT-BREAK-ON-FAILURE?*");

    static private final SubLString $str_alt92$break_when_an_at_violation_is_enc = makeString("break when an at violation is encountered?");

    public static final SubLSymbol $accumulating_at_violationsP$ = makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*");

    static private final SubLString $str_alt94$continue_at_checks_even_after_con = makeString("continue at checks even after constraint failure?");

    public static final SubLSymbol $noting_at_violationsP$ = makeSymbol("*NOTING-AT-VIOLATIONS?*");

    static private final SubLString $str_alt96$should_arg_type_violations_be_rec = makeString("should arg-type violations be recorded for presentation?");

    static private final SubLString $str_alt98$controls_extent_of_tracing__warni = makeString("controls extent of tracing, warnings, etc., for the arg-type module [0 .. 5]");

    static private final SubLString $str_alt100$controls_extent_of_testing_for_th = makeString("controls extent of testing for the arg-type module [0 .. 5]");

    public static final SubLSymbol $appraising_disjunctP$ = makeSymbol("*APPRAISING-DISJUNCT?*");

    static private final SubLString $str_alt102$is_the_formula_being_considered_b = makeString("is the formula being considered by the arg-type module a disjoined sub-formula?");

    public static final SubLSymbol $within_decontextualizedP$ = makeSymbol("*WITHIN-DECONTEXTUALIZED?*");

    static private final SubLString $str_alt104$is_the_formula_being_considered_b = makeString("is the formula being considered by arg-type module a decontextualized literal?");

    public static final SubLSymbol $within_disjunctionP$ = makeSymbol("*WITHIN-DISJUNCTION?*");

    static private final SubLString $str_alt106$is_the_subformula_being_canonical = makeString("is the subformula being canonicalized within a disjunction?");

    public static final SubLSymbol $within_conjunctionP$ = makeSymbol("*WITHIN-CONJUNCTION?*");

    static private final SubLString $str_alt108$is_the_subformula_being_canonical = makeString("is the subformula being canonicalized within a conjunction?");

    public static final SubLSymbol $within_negated_disjunctionP$ = makeSymbol("*WITHIN-NEGATED-DISJUNCTION?*");

    static private final SubLString $str_alt110$is_the_subformula_being_canonical = makeString("is the subformula being canonicalized within both negation and disjunction?");

    public static final SubLSymbol $within_negated_conjunctionP$ = makeSymbol("*WITHIN-NEGATED-CONJUNCTION?*");

    static private final SubLString $str_alt112$is_the_subformula_being_canonical = makeString("is the subformula being canonicalized within both negation and conjunction?");

    public static final SubLSymbol $within_functionP$ = makeSymbol("*WITHIN-FUNCTION?*");

    static private final SubLString $str_alt114$is_the_formula_being_canonicalize = makeString("is the formula being canonicalized referenced within a function expression?");

    public static final SubLSymbol $within_predicateP$ = makeSymbol("*WITHIN-PREDICATE?*");

    static private final SubLString $str_alt116$is_the_formula_being_canonicalize = makeString("is the formula being canonicalized referenced within a predicate?");

    public static final SubLSymbol $within_tou_gafP$ = makeSymbol("*WITHIN-TOU-GAF?*");

    static private final SubLString $str_alt118$is_the_formula_being_canonicalize = makeString("is the formula being canonicalized a termOfUnit gaf?");

    public static final SubLSymbol $relax_arg_constraints_for_disjunctionsP$ = makeSymbol("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*");

    static private final SubLString $str_alt120$should_arg_type_constraints_be_we = makeString("should arg-type constraints be weakened (possibly-true vs provably-true) within disjuncts?");

    public static final SubLSymbol $at_relax_arg_constraints_for_opaque_expansion_natsP$ = makeSymbol("*AT-RELAX-ARG-CONSTRAINTS-FOR-OPAQUE-EXPANSION-NATS?*");

    static private final SubLString $str_alt122$within_expansions_should_arg_type = makeString("within expansions should arg-type constraints be forgiven for expandable nats?");

    public static final SubLSymbol $at_admit_consistent_nautsP$ = makeSymbol("*AT-ADMIT-CONSISTENT-NAUTS?*");

    static private final SubLString $str_alt124$should_the_arg_type_module_admit_ = makeString("should the arg-type module admit unreified function terms that are consistent (i.e., possibly-true vs provably-true) wrt arg-type constraints?");

    public static final SubLSymbol $at_admit_consistent_nartsP$ = makeSymbol("*AT-ADMIT-CONSISTENT-NARTS?*");

    static private final SubLString $str_alt126$should_the_arg_type_module_admit_ = makeString("should the arg-type module admit reified function terms that are consistent (i.e., possibly-true vs provably-true) wrt arg-type constraints?");

    static private final SubLString $str_alt128$accumulates_results_of_current_at = makeString("accumulates results of current at query");

    public static final SubLSymbol $at_some_arg_isaP$ = makeSymbol("*AT-SOME-ARG-ISA?*");

    static private final SubLString $str_alt130$is_any_arg_isa_constraint_found_d = makeString("is any arg-isa constraint found during at arg-isa analysis for a given arg, relation and argnum?");

    public static final SubLSymbol $at_some_arg_isa_requiredP$ = makeSymbol("*AT-SOME-ARG-ISA-REQUIRED?*");

    static private final SubLString $str_alt132$must_there_be_some_arg_isa_constr = makeString("must there be some arg-isa constraint applicable to an arg for a given arg, relation, argnum to be wf?");

    public static final SubLSymbol $at_consider_multiargs_at_predP$ = makeSymbol("*AT-CONSIDER-MULTIARGS-AT-PRED?*");

    static private final SubLString $str_alt134$during_arg_type_analysis_do_we_co = makeString("during arg-type analysis do we consider multi-arg (argsIsa) constraints for specified args (arg1)");

    static private final SubLString $str_alt137$accumulates_applicable_at_isa_con = makeString("accumulates applicable at isa constraints");

    static private final SubLString $str_alt139$accumulates_applicable_at_genl_co = makeString("accumulates applicable at genl constraints");

    static private final SubLString $str_alt141$accumulates_applicable_at_format_ = makeString("accumulates applicable at format constraints");

    static private final SubLString $str_alt143$accumulates_applicable_at_differe = makeString("accumulates applicable at different constraints");

    static private final SubLString $str_alt145$accumulates_applicable_at_isa_ass = makeString("accumulates applicable at isa assertions");

    static private final SubLString $str_alt147$accumulates_applicable_at_genl_as = makeString("accumulates applicable at genl assertions");

    static private final SubLString $str_alt149$accumulates_applicable_at_format_ = makeString("accumulates applicable at format assertions");

    static private final SubLString $str_alt151$accumulates_applicable_at_differe = makeString("accumulates applicable at different assertions");

    static private final SubLString $str_alt153$the_type_of_at_test_currently_bei = makeString("the type of at test currently being applied (e.g., :arg-genls)");

    static private final SubLString $str_alt155$the_type_of_at_constraint_current = makeString("the type of at constraint currently being applied (e.g., :isa :genls)");

    static private final SubLString $str_alt157$type_of_arg_being_considered_with = makeString("type of arg being considered within arg-type search [:naut :weak-fort :strong-fort]");

    static private final SubLString $str_alt159$fn_applied_to_each_applicable_arg = makeString("fn applied to each applicable arg-constraint assertion during at search");

    static private final SubLString $$$the_formula_being_appraised = makeString("the formula being appraised");

    static private final SubLString $str_alt163$the_current_at_module_constraint_ = makeString("the current at-module constraint pred (e.g., #$interArgIsa1-2)");

    static private final SubLString $str_alt165$the_inverse_of_the_current_at_mod = makeString("the inverse of the current at-module constraint pred (e.g., #$interArgIsa2-1)");

    static private final SubLString $str_alt167$the_relation_whose_args_are_curre = makeString("the relation whose args are currently being appraised");

    static private final SubLString $str_alt169$the_particular_arg_that_is_curren = makeString("the particular arg that is currently being appraised");

    static private final SubLString $str_alt171$the_position_of_the_arg_that_is_c = makeString("the position of the arg that is currently being appraised");

    static private final SubLSymbol $sym172$_AT_ARG1_ = makeSymbol("*AT-ARG1*");

    static private final SubLString $str_alt173$the_1st_arg_of_the_literal_or_fun = makeString("the 1st arg of the literal or function-term that is currently being appraised");

    static private final SubLSymbol $sym174$_AT_ARG2_ = makeSymbol("*AT-ARG2*");

    static private final SubLString $str_alt175$the_2nd_arg_of_the_literal_or_fun = makeString("the 2nd arg of the literal or function-term that is currently being appraised");

    static private final SubLString $str_alt177$the_position_of_the_independent_a = makeString("the position of the independent arg that is constraining the dependent arg");

    static private final SubLString $str_alt179$the_independent_arg_that_is_const = makeString("the independent arg that is constraining the dependent arg being appraised");

    static private final SubLString $str_alt181$the_isa_of_the_independent_arg_th = makeString("the isa of the independent arg that is constraining the dependent arg");

    static private final SubLString $str_alt183$the_genl_of_the_independent_arg_t = makeString("the genl of the independent arg that is constraining the dependent arg");

    static private final SubLString $str_alt185$the_isa_of_the_dependent_arg_that = makeString("the isa of the dependent arg that is being appraised");

    static private final SubLString $str_alt187$the_constant_indexing_the_current = makeString("the constant indexing the current at constraint (e.g., may be a genlPred of *at-reln*)");

    public static final SubLSymbol $at_mapping_genl_inversesP$ = makeSymbol("*AT-MAPPING-GENL-INVERSES?*");

    static private final SubLString $str_alt189$dynamic_state_variable__are_we_lo = makeString("dynamic state variable: are we looking at inverses instead of genlPreds?");

    public static final SubLSymbol $at_search_genl_predsP$ = makeSymbol("*AT-SEARCH-GENL-PREDS?*");

    static private final SubLString $str_alt191$consider_genlPreds_during_current = makeString("consider genlPreds during current at search?");

    public static final SubLSymbol $at_search_genl_inversesP$ = makeSymbol("*AT-SEARCH-GENL-INVERSES?*");

    static private final SubLString $str_alt193$consider_genlInverses_during_curr = makeString("consider genlInverses during current at search?");

    static private final SubLString $str_alt195$the_term__var__constant_______tha = makeString("the term (var, constant, ...) that is being profiled during this at analysis");

    static private final SubLString $str_alt197$the_arg_type_constraint_assertion = makeString("the arg-type constraint assertion currently being considered.");

    public static final SubLSymbol $include_at_constraint_gafP$ = makeSymbol("*INCLUDE-AT-CONSTRAINT-GAF?*");

    static private final SubLString $str_alt199$boolean__should_errors_reference_ = makeString("boolean: should errors reference the arg-type constraint assertion currently being considered.");

    static private final SubLString $str_alt201$the_accumulating_inter_reference_ = makeString("the accumulating inter-reference isa constraints applicable to a given variable in a formula");

    static private final SubLString $str_alt203$the_accumulating_inter_reference_ = makeString("the accumulating inter-reference genl constraints applicable to a given variable in a formula");

    static private final SubLString $str_alt206$the_standard_for_acceptable_arg_t = makeString("the standard for acceptable arg-type constraints applicable to variables.");

    public static final SubLSymbol $at_assume_conjuncts_independentP$ = makeSymbol("*AT-ASSUME-CONJUNCTS-INDEPENDENT?*");

    static private final SubLString $str_alt208$Whether_arg_type_checking_for_var = makeString(
	    "Whether arg-type checking for variables in a conjunction should assume that each of the conjuncts is independent.\n   This is true, for example, during assert, but false, for example, when wff-checking the results of some parsers.");

    static private final SubLString $str_alt210$description_of_most_recent_violat = makeString("description of most recent violation of applicable arg-type constraints");

    static private final SubLString $str_alt212$descriptions_of_how_a_relational_ = makeString("descriptions of how a relational expresion is not valid wrt arg-type constraints");

    static private final SubLString $str_alt214$sbhl_space_used_for_marking_disjo = makeString("sbhl space used for marking disjoins of arg types");

    static private final SubLString $str_alt216$sbhl_space_used_for_marking_all_i = makeString("sbhl space used for marking all-isa of arg");

    static private final SubLString $str_alt218$sbhl_space_used_for_marking_all_g = makeString("sbhl space used for marking all-genls of arg");

    public static final SubLSymbol $at_defns_availableP$ = makeSymbol("*AT-DEFNS-AVAILABLE?*");

    static private final SubLString $str_alt220$make_defns_available_for_at_queri = makeString("make defns available for at queries?");

    public static final SubLSymbol $at_apply_necessary_defnsP$ = makeSymbol("*AT-APPLY-NECESSARY-DEFNS?*");

    static private final SubLString $str_alt222$enforce_all_applicable_necessary_ = makeString("enforce all applicable necessary defns during defn query?");

    public static final SubLSymbol $sort_suf_defn_assertionsP$ = makeSymbol("*SORT-SUF-DEFN-ASSERTIONS?*");

    static private final SubLString $str_alt224$are_the_cached_suf_defn_assertion = makeString("are the cached suf-defn assertions sorted to promote some optimality criteria?");

    public static final SubLSymbol $sort_suf_function_assertionsP$ = makeSymbol("*SORT-SUF-FUNCTION-ASSERTIONS?*");

    static private final SubLString $str_alt226$are_the_cached_suf_function_asser = makeString("are the cached suf-function assertions sorted to promote some optimality criteria?");

    static private final SubLString $str_alt228$defns_which_reference__defn_colle = makeString("defns which reference (defn-collection) and so cannot be cached in defn-fn-histories");

    public static final SubLSymbol $defn_metersP$ = makeSymbol("*DEFN-METERS?*");

    static private final SubLString $str_alt232$activate_metering_of_functions_wi = makeString("activate metering of functions within defn module?");

    public static final SubLInteger $int$200 = makeInteger(200);

    static private final SubLString $str_alt238$list_of_caches_used_for_metering_ = makeString("list of caches used for metering functions in defn module");

    static private final SubLString $str_alt240$the_collection_with_which_the_cur = makeString("the collection with which the current defn is associated");

    public static final SubLSymbol $permitting_denotational_terms_admitted_by_defn_via_isaP$ = makeSymbol("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*");

    static private final SubLString $str_alt242$should_defns_admit_a_denotation_t = makeString("should defns admit a denotation term that #$isa the *defn-collection* ?");

    static private final SubLList $list_alt244 = list(list(makeSymbol("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*"), NIL));

    static private final SubLString $str_alt246$current_defn_assertion_being_cons = makeString("current defn-assertion being considered");

    static private final SubLString $str_alt248$current_defn_assertions_being_con = makeString("current defn-assertions being considered");

    static private final SubLString $str_alt252$current_sufficient_function_asser = makeString("current sufficient-function assertion being considered");

    static private final SubLString $str_alt254$current_sufficient_function_asser = makeString("current sufficient-function assertions being considered");

    static private final SubLString $str_alt257$the_initial_size_of_each_nested_d = makeString("the initial size of each nested defn-function cache");

    static private final SubLString $str_alt259$the_initial_size_of_each_nested_d = makeString("the initial size of each nested defn-collection cache");

    static private final SubLString $str_alt262$the_cache_used__by_the_current_de = makeString("the cache used (by the current defn invocation) to prevent multiple calls to a single defn collection");

    static private final SubLString $str_alt264$the_cache_used__by_the_current_qu = makeString("the cache used (by the current quoted defn invocation) to prevent multiple calls to a single defn collection");

    static private final SubLString $str_alt266$the_cache_used__by_the_current_de = makeString("the cache used (by the current defn invocation) to prevent multiple calls to a single defn function");

    static private final SubLString $str_alt268$the_cache_used__by_the_current_qu = makeString("the cache used (by the current quoted defn invocation) to prevent multiple calls to a single defn function");

    static private final SubLString $str_alt270$A_stack_of_defns_being_called__to = makeString(
	    "A stack of defns being called, to prevent infinite recursion.  The key for the hashtable is the collection-defn function, and the value is a list of arguments.  It's a list because it's fine to recurse on a defn with a different argument.");
}

/**
 * Total time: 677 ms
 */
