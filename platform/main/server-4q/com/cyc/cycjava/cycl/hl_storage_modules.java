package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.hl_storage_modules.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;

public final class hl_storage_modules extends SubLTranslatedFile {
	public static final SubLFile me = new hl_storage_modules();

	public static final String myName = "com.cyc.cycjava.cycl.hl_storage_modules";

	public static final String myFingerPrint = "99ed41b198c69db701e9e4c8a6f44c4592173ccb31a13ea7704094b7eae5783c";

	// deflexical
	private static final SubLSymbol $hl_storage_module_properties$ = makeSymbol("*HL-STORAGE-MODULE-PROPERTIES*");

	// defparameter
	private static final SubLSymbol $successful_hl_storage_modules$ = makeSymbol("*SUCCESSFUL-HL-STORAGE-MODULES*");

	// deflexical
	/**
	 * Whether the HL storage modules should robustly try to remove a
	 * decontextualized assertible from the mt given by the user in addition to
	 * removing it from its proper, decontextualized mt. This can happen for example
	 * when a predicate is asserted to be decontextualized _after_ some assertions
	 * have already been made with it in other mts.
	 */
	private static final SubLSymbol $robustly_remove_uncanonical_decontextualized_assertiblesP$ = makeSymbol("*ROBUSTLY-REMOVE-UNCANONICAL-DECONTEXTUALIZED-ASSERTIBLES?*");

	// Internal Constants
	public static final SubLSymbol $hl_storage_modules$ = makeSymbol("*HL-STORAGE-MODULES*");

	public static final SubLSymbol $predicate_generic_hl_storage_modules$ = makeSymbol("*PREDICATE-GENERIC-HL-STORAGE-MODULES*");

	public static final SubLSymbol $predicate_specific_hl_storage_modules_table$ = makeSymbol("*PREDICATE-SPECIFIC-HL-STORAGE-MODULES-TABLE*");

	public static final SubLSymbol $argument_type_specific_hl_storage_modules_table$ = makeSymbol("*ARGUMENT-TYPE-SPECIFIC-HL-STORAGE-MODULES-TABLE*");

	public static final SubLList $list11 = list(makeSymbol("HL-STORAGE-MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $currently_executing_hl_storage_module$ = makeSymbol("*CURRENTLY-EXECUTING-HL-STORAGE-MODULE*");

	public static final SubLList $list14 = cons(makeSymbol("DISPREFERRED-HL-MODULE"), makeSymbol("PREFERRED-MODULES"));

	public static final SubLList propKeywords = list(new SubLObject[] { makeKeyword("PRETTY-NAME"), makeKeyword("MODULE-SUBTYPE"), makeKeyword("MODULE-SOURCE"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("SENSE"), makeKeyword("DIRECTION"), makeKeyword("REQUIRED-MT"), makeKeyword("PREDICATE"), makeKeyword("ANY-PREDICATES"), makeKeyword("APPLICABILITY-PATTERN"), makeKeyword("APPLICABILITY"), makeKeyword("SUPPLANTS"),
			makeKeyword("EXCLUSIVE"), makeKeyword("PREFERRED-OVER"), makeKeyword("INCOMPLETENESS"), makeKeyword("ADD"), makeKeyword("REMOVE"), makeKeyword("REMOVE-ALL"), makeKeyword("DOCUMENTATION") });

	public static final SubLSymbol HL_STORAGE_MODULE_PROPERTY_P = makeSymbol("HL-STORAGE-MODULE-PROPERTY-P");

	public static final SubLList $list32 = list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("PRETTY-NAME"), makeSymbol("MODULE-SUBTYPE"), makeSymbol("MODULE-SOURCE"), makeSymbol("ARGUMENT-TYPE"), makeSymbol("SENSE"), makeSymbol("DIRECTION"), makeSymbol("REQUIRED-MT"), makeSymbol("PREDICATE"), makeSymbol("ANY-PREDICATES"), makeSymbol("APPLICABILITY-PATTERN"), makeSymbol("APPLICABILITY"), makeSymbol("SUPPLANTS"),
			makeSymbol("EXCLUSIVE"), makeSymbol("PREFERRED-OVER"), makeSymbol("INCOMPLETENESS"), makeSymbol("ADD"), makeSymbol("REMOVE"), makeSymbol("REMOVE-ALL"), makeSymbol("DOCUMENTATION") });

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	public static final SubLSymbol ARGUMENT_TYPE_P = makeSymbol("ARGUMENT-TYPE-P");

	public static final SubLSymbol HL_STORAGE_MODULE_APPLICABILITY_PATTERN_P = makeSymbol("HL-STORAGE-MODULE-APPLICABILITY-PATTERN-P");

	public static final SubLList $list47 = list(makeKeyword("ANYTHING"), makeKeyword("NOTHING"));

	public static final SubLSymbol $solely_specific_hl_storage_module_predicate_store$ = makeSymbol("*SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE*");

	private static final SubLInteger $int$50 = makeInteger(50);

	public static final SubLList $list53 = list(makeSymbol("CNF"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"), makeSymbol("VARIABLE-MAP"));

	public static final SubLList $list54 = list(list(makeSymbol("HL-ASSERTION-SPEC-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym55$ASS = makeUninternedSymbol("ASS");

	public static final SubLSymbol $sym56$ASENT = makeUninternedSymbol("ASENT");

	public static final SubLSymbol DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");

	public static final SubLSymbol ASSERTION_TO_HL_ASSERTION_SPEC = makeSymbol("ASSERTION-TO-HL-ASSERTION-SPEC");

	public static final SubLSymbol DO_BOOKKEEPING_ASENTS = makeSymbol("DO-BOOKKEEPING-ASENTS");

	public static final SubLSymbol BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC = makeSymbol("BOOKKEEPING-ASENT-TO-HL-ASSERTION-SPEC");

	public static final SubLList $list62 = list(list(makeSymbol("CNF"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"), makeSymbol("VARIABLE-MAP")), makeSymbol("HL-ASSERTION-SPEC"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym63$HL_ASSERTION_SPEC_VAR = makeUninternedSymbol("HL-ASSERTION-SPEC-VAR");

	public static final SubLSymbol HL_ASSERTION_SPEC_CNF = makeSymbol("HL-ASSERTION-SPEC-CNF");

	public static final SubLSymbol HL_ASSERTION_SPEC_MT = makeSymbol("HL-ASSERTION-SPEC-MT");

	public static final SubLSymbol HL_ASSERTION_SPEC_DIRECTION = makeSymbol("HL-ASSERTION-SPEC-DIRECTION");

	public static final SubLSymbol HL_ASSERTION_SPEC_VARIABLE_MAP = makeSymbol("HL-ASSERTION-SPEC-VARIABLE-MAP");

	public static final SubLList $list68 = list(list(makeSymbol("HL-ASSERTIBLE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym69$ASS = makeUninternedSymbol("ASS");

	public static final SubLSymbol $sym70$ASENT = makeUninternedSymbol("ASENT");

	public static final SubLSymbol $sym71$ASSERTIBLES = makeUninternedSymbol("ASSERTIBLES");

	public static final SubLSymbol ASSERTION_TO_HL_ASSERTIBLES = makeSymbol("ASSERTION-TO-HL-ASSERTIBLES");

	public static final SubLSymbol BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE = makeSymbol("BOOKKEEPING-ASENT-TO-HL-ASSERTIBLE");

	public static final SubLList $list75 = list(list(makeSymbol("ARGUMENT-SPEC"), makeSymbol("CNF"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"), makeSymbol("VARIABLE-MAP")), makeSymbol("HL-ASSERTIBLE"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym76$HL_ASSERTIBLE_VAR = makeUninternedSymbol("HL-ASSERTIBLE-VAR");

	public static final SubLSymbol $sym77$HL_ASSERTION_SPEC_VAR = makeUninternedSymbol("HL-ASSERTION-SPEC-VAR");

	public static final SubLSymbol HL_ASSERTIBLE_ARGUMENT_SPEC = makeSymbol("HL-ASSERTIBLE-ARGUMENT-SPEC");

	public static final SubLSymbol HL_ASSERTIBLE_HL_ASSERTION_SPEC = makeSymbol("HL-ASSERTIBLE-HL-ASSERTION-SPEC");

	public static final SubLSymbol DESTRUCTURE_HL_ASSERTION_SPEC = makeSymbol("DESTRUCTURE-HL-ASSERTION-SPEC");

	private static final SubLSymbol HL_ASSERTIBLE_P = makeSymbol("HL-ASSERTIBLE-P");

	private static final SubLSymbol ARGUMENT_SPEC_P = makeSymbol("ARGUMENT-SPEC-P");

	private static final SubLSymbol TL_ADD_ARGUMENT = makeSymbol("TL-ADD-ARGUMENT");

	private static final SubLSymbol TL_REMOVE_ARGUMENT = makeSymbol("TL-REMOVE-ARGUMENT");

	private static final SubLSymbol TL_REMOVE_ALL_ARGUMENTS = makeSymbol("TL-REMOVE-ALL-ARGUMENTS");

	private static final SubLList $list88 = list(list(makeSymbol("*SUCCESSFUL-HL-STORAGE-MODULES*"), list(makeSymbol("NEW-SET"))));

	private static final SubLString $str89$Unexpected_HL_storage_action__a = makeString("Unexpected HL storage action ~a");

	private static final SubLSymbol $dummy_asserted_argument_spec$ = makeSymbol("*DUMMY-ASSERTED-ARGUMENT-SPEC*");

	private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

	private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

	private static final SubLList $list95 = list(makeSymbol("CANON-CNF"), makeSymbol("&OPTIONAL"), makeSymbol("BINDING-LIST"));

	static final boolean assertionsDisabledSynth = true;

	public static SubLObject hl_storage_module(final SubLObject name, final SubLObject plist) {
		final SubLObject hl_module = setup_hl_storage_module(name, plist);
		return hl_module;
	}

	public static SubLObject undeclare_hl_storage_module(final SubLObject name) {
		final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
		if (NIL != hl_module) {
			remove_hl_storage_module(hl_module);
			final SubLObject pred = hl_storage_module_predicate(hl_module);
			if (NIL != forts.fort_p(pred)) {
				remove_hl_storage_module_from_predicate_specific_hl_module_cache(pred, hl_module);
			} else {
				remove_hl_storage_module_from_generic_hl_module_cache(hl_module);
			}
		}
		return name;
	}

	public static SubLObject try_hl_add_modules(final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
		assert NIL != consp(hl_modules) : "Types.consp(hl_modules) " + "CommonSymbols.NIL != Types.consp(hl_modules) " + hl_modules;
		assert NIL != list_utilities.non_dotted_list_p(hl_modules) : "list_utilities.non_dotted_list_p(hl_modules) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(hl_modules) " + hl_modules;
		SubLObject cdolist_list_var = hl_modules;
		SubLObject elem = NIL;
		elem = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			assert NIL != inference_modules.hl_module_p(elem) : "inference_modules.hl_module_p(elem) " + "CommonSymbols.NIL != inference_modules.hl_module_p(elem) " + elem;
			cdolist_list_var = cdolist_list_var.rest();
			elem = cdolist_list_var.first();
		}
		return try_hl_storage_modules_int(hl_modules, argument_spec, cnf, mt, direction, variable_map, $ADD, UNPROVIDED);
	}

	public static SubLObject try_hl_remove_modules(final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
		assert NIL != consp(hl_modules) : "Types.consp(hl_modules) " + "CommonSymbols.NIL != Types.consp(hl_modules) " + hl_modules;
		assert NIL != list_utilities.non_dotted_list_p(hl_modules) : "list_utilities.non_dotted_list_p(hl_modules) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(hl_modules) " + hl_modules;
		SubLObject cdolist_list_var = hl_modules;
		SubLObject elem = NIL;
		elem = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			assert NIL != inference_modules.hl_module_p(elem) : "inference_modules.hl_module_p(elem) " + "CommonSymbols.NIL != inference_modules.hl_module_p(elem) " + elem;
			cdolist_list_var = cdolist_list_var.rest();
			elem = cdolist_list_var.first();
		}
		return try_hl_storage_modules_int(hl_modules, argument_spec, cnf, mt, NIL, NIL, $REMOVE, UNPROVIDED);
	}

	public static SubLObject try_hl_remove_all_modules(final SubLObject hl_modules, final SubLObject cnf, final SubLObject mt) {
		assert NIL != consp(hl_modules) : "Types.consp(hl_modules) " + "CommonSymbols.NIL != Types.consp(hl_modules) " + hl_modules;
		assert NIL != list_utilities.non_dotted_list_p(hl_modules) : "list_utilities.non_dotted_list_p(hl_modules) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(hl_modules) " + hl_modules;
		SubLObject cdolist_list_var = hl_modules;
		SubLObject elem = NIL;
		elem = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			assert NIL != inference_modules.hl_module_p(elem) : "inference_modules.hl_module_p(elem) " + "CommonSymbols.NIL != inference_modules.hl_module_p(elem) " + elem;
			cdolist_list_var = cdolist_list_var.rest();
			elem = cdolist_list_var.first();
		}
		return try_hl_storage_modules_int(hl_modules, NIL, cnf, mt, NIL, NIL, $REMOVE_ALL, UNPROVIDED);
	}

	public static SubLObject hl_storage_modules_for_predicate_and_argument_type(final SubLObject predicate, final SubLObject argument_type) {
		return keyhash_utilities.fast_intersection(hl_storage_modules_for_predicate(predicate), hl_storage_modules_for_argument_type(argument_type), UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject hl_storage_modules_for_predicate(final SubLObject predicate) {
		return copy_list(dictionary.dictionary_lookup($predicate_specific_hl_storage_modules_table$.getGlobalValue(), predicate, UNPROVIDED));
	}

	public static SubLObject predicate_has_specific_hl_storage_modulesP(final SubLObject predicate) {
		return list_utilities.sublisp_boolean(hl_storage_modules_for_predicate(predicate));
	}

	public static SubLObject predicates_with_specific_hl_storage_modules() {
		return dictionary.dictionary_keys($predicate_specific_hl_storage_modules_table$.getGlobalValue());
	}

	public static SubLObject predicate_generic_hl_storage_modules() {
		return set.set_element_list($predicate_generic_hl_storage_modules$.getGlobalValue());
	}

	public static SubLObject hl_storage_modules_for_argument_type(final SubLObject argument_type) {
		final SubLObject v_genls = arguments.argument_type_genls(argument_type);
		SubLObject hl_modules = NIL;
		SubLObject cdolist_list_var = v_genls;
		SubLObject genl = NIL;
		genl = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			hl_modules = nconc(hl_modules, hl_storage_modules_for_just_argument_type(genl));
			cdolist_list_var = cdolist_list_var.rest();
			genl = cdolist_list_var.first();
		}
		return hl_modules;
	}

	public static SubLObject generic_hl_storage_modules() {
		return keyhash_utilities.fast_intersection(predicate_generic_hl_storage_modules(), hl_storage_modules_for_argument_type($ARGUMENT), UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject generic_hl_storage_module_count() {
		return list_length(generic_hl_storage_modules());
	}

	public static SubLObject hl_storage_modules_for_just_argument_type(final SubLObject argument_type) {
		return copy_list(dictionary.dictionary_lookup_without_values($argument_type_specific_hl_storage_modules_table$.getGlobalValue(), argument_type, UNPROVIDED));
	}

	public static SubLObject currently_executing_hl_storage_module() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $currently_executing_hl_storage_module$.getDynamicValue(thread);
	}

	public static SubLObject within_hl_storage_module_execution(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject hl_storage_module = NIL;
		destructuring_bind_must_consp(current, datum, $list11);
		hl_storage_module = current.first();
		final SubLObject body;
		current = body = current.rest();
		return listS(CLET, list(list($currently_executing_hl_storage_module$, hl_storage_module)), append(body, NIL));
	}

	public static SubLObject try_hl_storage_modules_int(final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map, final SubLObject action, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject successP = NIL;
		final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
		final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
		final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
		final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
		try {
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, FOUR_INTEGER), thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
			thread.resetMultipleValues();
			final SubLObject applicable_hl_modules = applicable_hl_storage_modules(hl_modules, argument_spec, cnf, mt, direction, variable_map);
			final SubLObject dispreferred_hl_modules = thread.secondMultipleValue();
			thread.resetMultipleValues();
			final SubLObject sorted_applicable_hl_modules = sort_hl_storage_modules_by_cost(applicable_hl_modules, argument_spec, cnf, mt, direction, variable_map);
			if (NIL == successP) {
				SubLObject csome_list_var = sorted_applicable_hl_modules;
				SubLObject hl_module = NIL;
				hl_module = csome_list_var.first();
				while ((NIL == successP) && (NIL != csome_list_var)) {
					successP = apply_hl_storage_module(hl_module, argument_spec, cnf, mt, direction, variable_map, action, v_default);
					if (NIL != successP) {
						note_successful_hl_storage_module(hl_module);
					}
					csome_list_var = csome_list_var.rest();
					hl_module = csome_list_var.first();
				}
			}
			if (NIL == successP) {
				final SubLObject sorted_dispreferred_hl_modules = sort_dispreferred_hl_storage_modules_by_cost(dispreferred_hl_modules, argument_spec, cnf, mt, direction, variable_map);
				SubLObject rest;
				SubLObject cons;
				SubLObject current;
				SubLObject datum;
				SubLObject dispreferred_hl_module;
				SubLObject preferred_modules;
				SubLObject dispreferP;
				SubLObject csome_list_var2;
				SubLObject preferred_module;
				for (rest = NIL, rest = sorted_dispreferred_hl_modules; (NIL == successP) && (NIL != rest); rest = rest.rest()) {
					cons = rest.first();
					datum = current = cons;
					dispreferred_hl_module = NIL;
					preferred_modules = NIL;
					destructuring_bind_must_consp(current, datum, $list14);
					dispreferred_hl_module = current.first();
					current = preferred_modules = current.rest();
					dispreferP = NIL;
					if (NIL == dispreferP) {
						csome_list_var2 = preferred_modules;
						preferred_module = NIL;
						preferred_module = csome_list_var2.first();
						while ((NIL == dispreferP) && (NIL != csome_list_var2)) {
							if (NIL != hl_storage_module_successfulP(preferred_module)) {
								dispreferP = T;
							}
							csome_list_var2 = csome_list_var2.rest();
							preferred_module = csome_list_var2.first();
						}
					}
					if (NIL == dispreferP) {
						successP = apply_hl_storage_module(dispreferred_hl_module, argument_spec, cnf, mt, direction, variable_map, action, v_default);
						if (NIL != successP) {
							note_successful_hl_storage_module(dispreferred_hl_module);
						}
					}
				}
			}
		} finally {
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
		}
		return successP;
	}

	public static SubLObject apply_hl_storage_module(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map, final SubLObject action, final SubLObject v_default) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject successP = NIL;
		final SubLObject _prev_bind_0 = $currently_executing_hl_storage_module$.currentBinding(thread);
		try {
			$currently_executing_hl_storage_module$.bind(hl_module, thread);
			if (action.eql($ADD)) {
				successP = hl_storage_module_add(hl_module, argument_spec, cnf, mt, direction, variable_map, v_default);
			} else if (action.eql($REMOVE)) {
				successP = hl_storage_module_remove(hl_module, argument_spec, cnf, mt, v_default);
			} else if (action.eql($REMOVE_ALL)) {
				successP = hl_storage_module_remove_all(hl_module, cnf, mt, v_default);
			}

		} finally {
			$currently_executing_hl_storage_module$.rebind(_prev_bind_0, thread);
		}
		return successP;
	}

	public static SubLObject hl_storage_module_name(final SubLObject hl_module) {
		return inference_modules.hl_module_name(hl_module);
	}

	public static SubLObject hl_storage_module_applicableP(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
		final SubLObject applicable_func = hl_storage_module_applicability_func(hl_module);
		if (NIL != fboundp(applicable_func)) {
			return funcall(applicable_func, argument_spec, cnf, mt, direction, variable_map);
		}
		return hl_storage_module_applicable_intP(hl_module, argument_spec, cnf, mt, direction, variable_map);
	}

	public static SubLObject applicable_hl_storage_modules(final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject supplanted_hl_modules = NIL;
		SubLObject dispreferred_hl_modules = NIL;
		SubLObject applicable_hl_modules = NIL;
		SubLObject exclusive_foundP = NIL;
		if (NIL == exclusive_foundP) {
			SubLObject csome_list_var = hl_modules;
			SubLObject hl_module = NIL;
			hl_module = csome_list_var.first();
			while ((NIL == exclusive_foundP) && (NIL != csome_list_var)) {
				if ((NIL == subl_promotions.memberP(hl_module, supplanted_hl_modules, UNPROVIDED, UNPROVIDED)) && ((NIL != list_utilities.alist_lookup_without_values(dispreferred_hl_modules, hl_module, UNPROVIDED, UNPROVIDED)) || (NIL != hl_storage_module_applicableP(hl_module, argument_spec, cnf, mt, direction, variable_map)))) {
					final SubLObject exclusive_func = hl_storage_module_exclusive_func(hl_module);
					if ((NIL == exclusive_func) || (exclusive_func.isFunctionSpec() && (NIL != funcall(exclusive_func, argument_spec, cnf, mt, direction, variable_map)))) {
						if (NIL != exclusive_func) {
							thread.resetMultipleValues();
							final SubLObject exclusive_foundP_$1 = update_supplanted_hl_storage_modules_wrt_applicable_modules(hl_module, applicable_hl_modules, supplanted_hl_modules);
							final SubLObject applicable_hl_modules_$2 = thread.secondMultipleValue();
							final SubLObject supplanted_hl_modules_$3 = thread.thirdMultipleValue();
							thread.resetMultipleValues();
							exclusive_foundP = exclusive_foundP_$1;
							applicable_hl_modules = applicable_hl_modules_$2;
							supplanted_hl_modules = supplanted_hl_modules_$3;
						}
						if (NIL == exclusive_foundP) {
							thread.resetMultipleValues();
							final SubLObject applicable_hl_modules_$3 = update_dispreferred_hl_storage_modules_wrt_applicable_modules(hl_module, applicable_hl_modules, dispreferred_hl_modules, hl_modules, argument_spec, cnf, mt, direction, variable_map);
							final SubLObject dispreferred_hl_modules_$5 = thread.secondMultipleValue();
							thread.resetMultipleValues();
							applicable_hl_modules = applicable_hl_modules_$3;
							dispreferred_hl_modules = dispreferred_hl_modules_$5;
						}
						if ((NIL != exclusive_foundP) || (NIL == list_utilities.alist_lookup(dispreferred_hl_modules, hl_module, UNPROVIDED, UNPROVIDED))) {
							applicable_hl_modules = cons(hl_module, applicable_hl_modules);
						}
					}
				}
				csome_list_var = csome_list_var.rest();
				hl_module = csome_list_var.first();
			}
		}
		return values(nreverse(applicable_hl_modules), NIL != exclusive_foundP ? NIL : dispreferred_hl_modules);
	}

	public static SubLObject update_dispreferred_hl_storage_modules_wrt_applicable_modules(final SubLObject hl_module, SubLObject applicable_hl_modules, SubLObject dispreferred_hl_modules, final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
		final SubLObject pcase_var;
		final SubLObject preferred_over_info = pcase_var = hl_storage_module_preferred_over_info(hl_module);
		SubLObject cdolist_list_var;
		final SubLObject newly_dispreferred_module_names = cdolist_list_var = preferred_over_info;
		SubLObject dispreferred_module_name = NIL;
		dispreferred_module_name = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject dispreferred_hl_module = inference_modules.find_hl_module_by_name(dispreferred_module_name);
			if (NIL != subl_promotions.memberP(dispreferred_hl_module, hl_modules, UNPROVIDED, UNPROVIDED)) {
				if (NIL != subl_promotions.memberP(dispreferred_hl_module, applicable_hl_modules, UNPROVIDED, UNPROVIDED)) {
					applicable_hl_modules = delete(dispreferred_hl_module, applicable_hl_modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					dispreferred_hl_modules = list_utilities.alist_push(dispreferred_hl_modules, dispreferred_hl_module, hl_module, UNPROVIDED);
				} else if (NIL != list_utilities.alist_lookup(dispreferred_hl_modules, dispreferred_hl_module, UNPROVIDED, UNPROVIDED)) {
					dispreferred_hl_modules = list_utilities.alist_push(dispreferred_hl_modules, dispreferred_hl_module, hl_module, UNPROVIDED);
				} else if (NIL != hl_storage_module_applicableP(dispreferred_hl_module, argument_spec, cnf, mt, direction, variable_map)) {
					dispreferred_hl_modules = list_utilities.alist_push(dispreferred_hl_modules, dispreferred_hl_module, hl_module, UNPROVIDED);
				}

			}
			cdolist_list_var = cdolist_list_var.rest();
			dispreferred_module_name = cdolist_list_var.first();
		}
		return values(applicable_hl_modules, dispreferred_hl_modules);
	}

	public static SubLObject update_supplanted_hl_storage_modules_wrt_applicable_modules(final SubLObject hl_module, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
		final SubLObject supplants_info = hl_storage_module_supplants_info(hl_module);
		SubLObject exclusive_foundP = NIL;
		final SubLObject pcase_var = supplants_info;
		if (pcase_var.eql($ALL)) {
			applicable_hl_modules = NIL;
			exclusive_foundP = T;
		} else {
			SubLObject cdolist_list_var;
			final SubLObject newly_supplanted_module_names = cdolist_list_var = supplants_info;
			SubLObject supplanted_module_name = NIL;
			supplanted_module_name = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				final SubLObject supplanted_hl_module = inference_modules.find_hl_module_by_name(supplanted_module_name);
				supplanted_hl_modules = cons(supplanted_hl_module, supplanted_hl_modules);
				applicable_hl_modules = delete(supplanted_hl_module, applicable_hl_modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				cdolist_list_var = cdolist_list_var.rest();
				supplanted_module_name = cdolist_list_var.first();
			}
		}
		return values(exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
	}

	public static SubLObject sort_hl_storage_modules_by_cost(final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
		return hl_modules;
	}

	public static SubLObject sort_dispreferred_hl_storage_modules_by_cost(final SubLObject dispreferred_hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
		return dispreferred_hl_modules;
	}

	public static SubLObject hl_storage_module_incompleteness(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		final SubLObject incompleteness_func = get_hl_storage_module_property(hl_module, $INCOMPLETENESS);
		return NIL != incompleteness_func ? funcall(incompleteness_func, argument_spec, cnf, mt, direction, variable_map) : v_default;
	}

	public static SubLObject hl_storage_module_add(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		final SubLObject add_func = get_hl_storage_module_property(hl_module, $ADD);
		return NIL != add_func ? funcall(add_func, argument_spec, cnf, mt, direction, variable_map) : v_default;
	}

	public static SubLObject hl_storage_module_remove(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		final SubLObject remove_func = get_hl_storage_module_property(hl_module, $REMOVE);
		return NIL != remove_func ? funcall(remove_func, argument_spec, cnf, mt) : v_default;
	}

	public static SubLObject hl_storage_module_remove_all(final SubLObject hl_module, final SubLObject cnf, final SubLObject mt, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		final SubLObject remove_all_func = get_hl_storage_module_property(hl_module, $REMOVE_ALL);
		return NIL != remove_all_func ? funcall(remove_all_func, cnf, mt) : v_default;
	}

	public static SubLObject hl_storage_module_argument_type(final SubLObject hl_module) {
		return get_hl_storage_module_property(hl_module, $ARGUMENT_TYPE);
	}

	public static SubLObject hl_storage_module_sense(final SubLObject hl_module) {
		return get_hl_storage_module_property(hl_module, $SENSE);
	}

	public static SubLObject hl_storage_module_direction(final SubLObject hl_module) {
		return get_hl_storage_module_property(hl_module, $DIRECTION);
	}

	public static SubLObject hl_storage_module_required_mt(final SubLObject hl_module) {
		return get_hl_storage_module_property(hl_module, $REQUIRED_MT);
	}

	public static SubLObject hl_storage_module_predicate(final SubLObject hl_module) {
		return get_hl_storage_module_property(hl_module, $PREDICATE);
	}

	public static SubLObject hl_storage_module_any_predicates(final SubLObject hl_module) {
		return get_hl_storage_module_property(hl_module, $ANY_PREDICATES);
	}

	public static SubLObject hl_storage_module_applicability_func(final SubLObject hl_module) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject applicability_func = get_hl_storage_module_property(hl_module, $APPLICABILITY);
		final SubLObject defaultP = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != defaultP) {
			return NIL;
		}
		return applicability_func;
	}

	public static SubLObject hl_storage_module_applicability_pattern(final SubLObject hl_module) {
		return get_hl_storage_module_property(hl_module, $APPLICABILITY_PATTERN);
	}

	public static SubLObject hl_storage_module_exclusive_func(final SubLObject hl_module) {
		return get_hl_storage_module_property(hl_module, $EXCLUSIVE);
	}

	public static SubLObject hl_storage_module_supplants_info(final SubLObject hl_module) {
		return get_hl_storage_module_property(hl_module, $SUPPLANTS);
	}

	public static SubLObject hl_storage_module_preferred_over_info(final SubLObject hl_module) {
		return get_hl_storage_module_property(hl_module, $PREFERRED_OVER);
	}

	public static SubLObject get_hl_storage_module_property(final SubLObject hl_module, final SubLObject indicator) {
		return inference_modules.hl_module_property(hl_module, indicator);
	}

	public static SubLObject reclassify_hl_storage_modules() {
		clear_hl_storage_module_indexes();
		rebuild_solely_specific_hl_storage_module_predicate_store();
		final SubLObject set_contents_var = set.do_set_internal($hl_storage_modules$.getGlobalValue());
		SubLObject basis_object;
		SubLObject state;
		SubLObject hl_module;
		SubLObject predicate;
		SubLObject argument_type;
		for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
			hl_module = set_contents.do_set_contents_next(basis_object, state);
			if (NIL != set_contents.do_set_contents_element_validP(state, hl_module)) {
				predicate = hl_storage_module_predicate(hl_module);
				argument_type = hl_storage_module_argument_type(hl_module);
				classify_hl_storage_module(hl_module, predicate, argument_type);
			}
		}
		return NIL;
	}

	public static SubLObject hl_storage_module_properties() {
		return $hl_storage_module_properties$.getGlobalValue();
	}

	public static SubLObject hl_storage_module_property_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $hl_storage_module_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject remove_hl_storage_module(final SubLObject hl_module) {
		final SubLObject argument_type = hl_storage_module_argument_type(hl_module);
		inference_modules.remove_hl_module(hl_module);
		dictionary_utilities.dictionary_remove_from_value($argument_type_specific_hl_storage_modules_table$.getGlobalValue(), argument_type, hl_module, UNPROVIDED, UNPROVIDED);
		set.set_remove(hl_module, $hl_storage_modules$.getGlobalValue());
		return $hl_storage_modules$.getGlobalValue();
	}

	public static SubLObject remove_hl_storage_module_from_generic_hl_module_cache(final SubLObject hl_module) {
		set.set_remove(hl_module, $predicate_generic_hl_storage_modules$.getGlobalValue());
		return $predicate_generic_hl_storage_modules$.getGlobalValue();
	}

	public static SubLObject remove_hl_storage_module_from_predicate_specific_hl_module_cache(final SubLObject pred, final SubLObject hl_module) {
		return dictionary_utilities.dictionary_remove_from_value($predicate_specific_hl_storage_modules_table$.getGlobalValue(), pred, hl_module, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject clear_hl_storage_module_indexes() {
		$predicate_generic_hl_storage_modules$.setGlobalValue(set.new_set(symbol_function(EQL), UNPROVIDED));
		dictionary.clear_dictionary($predicate_specific_hl_storage_modules_table$.getGlobalValue());
		return NIL;
	}

	public static SubLObject setup_hl_storage_module(final SubLObject name, final SubLObject plist) {
		assert NIL != keywordp(name) : "Types.keywordp(name) " + name;
		assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + plist;
		SubLObject remainder;
		SubLObject property;
		SubLObject value;
		for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
			property = remainder.first();
			value = cadr(remainder);
			final SubLObject hl_storage_module_property_p2 = hl_storage_module_property_p(property);
			assert NIL != hl_storage_module_property_p2 : "hl_storage_modules.hl_storage_module_property_p(property) " + property;
		}
		SubLObject allow_other_keys_p = SubLMain.BOOTY_HACKZ ? T : NIL;
		SubLObject rest = plist;
		SubLObject bad = NIL;
		SubLObject current_$6 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, plist, $list32);
			current_$6 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, plist, $list32);
			if (NIL == member(current_$6, propKeywords, UNPROVIDED, UNPROVIDED)) {
				bad = current_$6;
			}
			if (current_$6 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(plist, $list32);
		}
		final SubLObject pretty_name_tail = property_list_member($PRETTY_NAME, plist);
		final SubLObject pretty_name = (NIL != pretty_name_tail) ? cadr(pretty_name_tail) : NIL;
		final SubLObject module_subtype_tail = property_list_member($MODULE_SUBTYPE, plist);
		final SubLObject module_subtype = (NIL != module_subtype_tail) ? cadr(module_subtype_tail) : NIL;
		final SubLObject module_source_tail = property_list_member($MODULE_SOURCE, plist);
		final SubLObject module_source = (NIL != module_source_tail) ? cadr(module_source_tail) : NIL;
		final SubLObject argument_type_tail = property_list_member($ARGUMENT_TYPE, plist);
		final SubLObject argument_type = (NIL != argument_type_tail) ? cadr(argument_type_tail) : NIL;
		final SubLObject sense_tail = property_list_member($SENSE, plist);
		final SubLObject sense = (NIL != sense_tail) ? cadr(sense_tail) : NIL;
		final SubLObject direction_tail = property_list_member($DIRECTION, plist);
		final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
		final SubLObject required_mt_tail = property_list_member($REQUIRED_MT, plist);
		final SubLObject required_mt = (NIL != required_mt_tail) ? cadr(required_mt_tail) : NIL;
		final SubLObject predicate_tail = property_list_member($PREDICATE, plist);
		final SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
		final SubLObject any_predicates_tail = property_list_member($ANY_PREDICATES, plist);
		final SubLObject any_predicates = (NIL != any_predicates_tail) ? cadr(any_predicates_tail) : NIL;
		final SubLObject applicability_pattern_tail = property_list_member($APPLICABILITY_PATTERN, plist);
		final SubLObject applicability_pattern = (NIL != applicability_pattern_tail) ? cadr(applicability_pattern_tail) : NIL;
		final SubLObject applicability_tail = property_list_member($APPLICABILITY, plist);
		final SubLObject applicability = (NIL != applicability_tail) ? cadr(applicability_tail) : NIL;
		final SubLObject supplants_tail = property_list_member($SUPPLANTS, plist);
		final SubLObject supplants = (NIL != supplants_tail) ? cadr(supplants_tail) : NIL;
		final SubLObject exclusive_tail = property_list_member($EXCLUSIVE, plist);
		final SubLObject exclusive = (NIL != exclusive_tail) ? cadr(exclusive_tail) : NIL;
		final SubLObject preferred_over_tail = property_list_member($PREFERRED_OVER, plist);
		final SubLObject preferred_over = (NIL != preferred_over_tail) ? cadr(preferred_over_tail) : NIL;
		final SubLObject incompleteness_tail = property_list_member($INCOMPLETENESS, plist);
		final SubLObject incompleteness = (NIL != incompleteness_tail) ? cadr(incompleteness_tail) : NIL;
		final SubLObject add_tail = property_list_member($ADD, plist);
		final SubLObject add = (NIL != add_tail) ? cadr(add_tail) : NIL;
		final SubLObject remove_tail = property_list_member($REMOVE, plist);
		final SubLObject remove = (NIL != remove_tail) ? cadr(remove_tail) : NIL;
		final SubLObject remove_all_tail = property_list_member($REMOVE_ALL, plist);
		final SubLObject remove_all = (NIL != remove_all_tail) ? cadr(remove_all_tail) : NIL;
		final SubLObject documentation_tail = property_list_member($DOCUMENTATION, plist);
		final SubLObject documentation = (NIL != documentation_tail) ? cadr(documentation_tail) : NIL;
		assert NIL != stringp(pretty_name) : "Types.stringp(pretty_name) " + "CommonSymbols.NIL != Types.stringp(pretty_name) " + pretty_name;
		assert NIL != arguments.argument_type_p(argument_type) : "arguments.argument_type_p(argument_type) " + "CommonSymbols.NIL != arguments.argument_type_p(argument_type) " + argument_type;
		assert NIL != symbolp(incompleteness) : "Types.symbolp(incompleteness) " + "CommonSymbols.NIL != Types.symbolp(incompleteness) " + incompleteness;
		assert NIL != symbolp(add) : "Types.symbolp(add) " + "CommonSymbols.NIL != Types.symbolp(add) " + add;
		assert NIL != symbolp(remove) : "Types.symbolp(remove) " + "CommonSymbols.NIL != Types.symbolp(remove) " + remove;
		assert NIL != symbolp(remove_all) : "Types.symbolp(remove_all) " + "CommonSymbols.NIL != Types.symbolp(remove_all) " + remove_all;
		if (NIL != applicability) {
			assert NIL != symbolp(applicability) : "Types.symbolp(applicability) " + "CommonSymbols.NIL != Types.symbolp(applicability) " + applicability;
		} else {
			assert NIL != hlmt.hlmt_p(required_mt) : "hlmt.hlmt_p(required_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(required_mt) " + required_mt;
			assert NIL != hl_storage_module_applicability_pattern_p(applicability_pattern) : "hl_storage_modules.hl_storage_module_applicability_pattern_p(applicability_pattern) " + "CommonSymbols.NIL != hl_storage_modules.hl_storage_module_applicability_pattern_p(applicability_pattern) " + applicability_pattern;
			if (((NIL != sense) && (!assertionsDisabledSynth)) && (NIL == enumeration_types.sense_p(sense))) {
				throw new AssertionError(sense);
			}
			if (((NIL != direction) && (!assertionsDisabledSynth)) && (NIL == enumeration_types.direction_p(direction))) {
				throw new AssertionError(direction);
			}
		}
		if (((NIL != module_subtype) && (!assertionsDisabledSynth)) && (NIL == keywordp(module_subtype))) {
			throw new AssertionError(module_subtype);
		}
		if (((NIL != module_source) && (!assertionsDisabledSynth)) && (NIL == forts.fort_p(module_source))) {
			throw new AssertionError(module_source);
		}
		if (NIL != supplants) {
			final SubLObject list_var = supplants;
			assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
			SubLObject cdolist_list_var = list_var;
			SubLObject elem = NIL;
			elem = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				assert NIL != keywordp(elem) : "Types.keywordp(elem) " + "CommonSymbols.NIL != Types.keywordp(elem) " + elem;
				cdolist_list_var = cdolist_list_var.rest();
				elem = cdolist_list_var.first();
			}
		}
		if (((NIL != exclusive) && (!assertionsDisabledSynth)) && (NIL == symbolp(exclusive))) {
			throw new AssertionError(exclusive);
		}
		if (NIL != preferred_over) {
			final SubLObject list_var = preferred_over;
			assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
			SubLObject cdolist_list_var = list_var;
			SubLObject elem = NIL;
			elem = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				assert NIL != keywordp(elem) : "Types.keywordp(elem) " + "CommonSymbols.NIL != Types.keywordp(elem) " + elem;
				cdolist_list_var = cdolist_list_var.rest();
				elem = cdolist_list_var.first();
			}
		}
		if (((NIL != predicate) && (!assertionsDisabledSynth)) && (NIL == constant_p(predicate))) {
			throw new AssertionError(predicate);
		}
		if (NIL != any_predicates) {
			final SubLObject list_var = any_predicates;
			assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
			SubLObject cdolist_list_var = list_var;
			SubLObject elem = NIL;
			elem = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
				cdolist_list_var = cdolist_list_var.rest();
				elem = cdolist_list_var.first();
			}
		}
		if (((NIL != documentation) && (!assertionsDisabledSynth)) && (NIL == stringp(documentation))) {
			throw new AssertionError(documentation);
		}
		return register_hl_storage_module(name, plist);
	}

	public static SubLObject hl_storage_module_applicability_pattern_p(final SubLObject pattern) {
		return makeBoolean((NIL != subl_promotions.memberP(pattern, $list47, UNPROVIDED, UNPROVIDED)) || pattern.isList());
	}

	public static SubLObject register_hl_storage_module(final SubLObject name, final SubLObject plist) {
		final SubLObject hl_module = inference_modules.setup_module(name, $STORAGE, plist);
		set.set_add(hl_module, $hl_storage_modules$.getGlobalValue());
		final SubLObject predicate = getf(plist, $PREDICATE, UNPROVIDED);
		final SubLObject argument_type = getf(plist, $ARGUMENT_TYPE, UNPROVIDED);
		classify_hl_storage_module(hl_module, predicate, argument_type);
		return hl_module;
	}

	public static SubLObject classify_hl_storage_module(final SubLObject hl_module, final SubLObject predicate, final SubLObject argument_type) {
		if (NIL != predicate) {
			register_predicate_specific_hl_storage_module(hl_module, predicate);
		} else {
			register_predicate_generic_hl_storage_module(hl_module);
		}
		register_argument_type_specific_hl_storage_module(hl_module, argument_type);
		return NIL;
	}

	public static SubLObject register_predicate_specific_hl_storage_module(final SubLObject hl_module, final SubLObject predicate) {
		return dictionary_utilities.dictionary_pushnew($predicate_specific_hl_storage_modules_table$.getGlobalValue(), predicate, hl_module, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject register_predicate_generic_hl_storage_module(final SubLObject hl_module) {
		set.set_add(hl_module, $predicate_generic_hl_storage_modules$.getGlobalValue());
		return hl_module;
	}

	public static SubLObject register_argument_type_specific_hl_storage_module(final SubLObject hl_module, final SubLObject argument_type) {
		return dictionary_utilities.dictionary_pushnew($argument_type_specific_hl_storage_modules_table$.getGlobalValue(), argument_type, hl_module, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject hl_storage_modules() {
		return set.set_element_list($hl_storage_modules$.getGlobalValue());
	}

	public static SubLObject hl_storage_module_count() {
		return set.set_size($hl_storage_modules$.getGlobalValue());
	}

	public static SubLObject hl_storage_module_applicable_intP(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
		final SubLObject sentence = clauses.cnf_formula(cnf, UNPROVIDED);
		final SubLObject predicate = cycl_utilities.formula_operator(sentence);
		return makeBoolean((((((NIL != hl_storage_module_sense_relevant_p(hl_module, cnf)) && (NIL != hl_storage_module_direction_relevant_p(hl_module, direction))) && (NIL != hl_storage_module_argument_type_relevant_p(hl_module, argument_spec))) && (NIL != hl_storage_module_predicate_relevant_p(hl_module, predicate))) && (NIL != hl_storage_module_required_mt_relevant_p(hl_module, mt)))
				&& (NIL != hl_storage_module_applicability_pattern_matched_p(hl_module, sentence)));
	}

	public static SubLObject hl_storage_module_sense_relevant_p(final SubLObject hl_module, final SubLObject cnf) {
		final SubLObject module_sense = hl_storage_module_sense(hl_module);
		if (NIL == module_sense) {
			return T;
		}
		if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
			return eq(module_sense, $POS);
		}
		if (NIL != clause_utilities.neg_atomic_cnf_p(cnf)) {
			return eq(module_sense, $NEG);
		}
		return NIL;
	}

	public static SubLObject hl_storage_module_direction_relevant_p(final SubLObject hl_module, final SubLObject direction) {
		if (NIL == direction) {
			return T;
		}
		final SubLObject module_direction = hl_storage_module_direction(hl_module);
		return makeBoolean((NIL == module_direction) || module_direction.eql(direction));
	}

	public static SubLObject hl_storage_module_argument_type_relevant_p(final SubLObject hl_module, final SubLObject argument_spec) {
		if (NIL == argument_spec) {
			return T;
		}
		final SubLObject module_argument_type = hl_storage_module_argument_type(hl_module);
		return T;
	}

	public static SubLObject hl_storage_module_predicate_relevant_p(final SubLObject hl_module, final SubLObject predicate) {
		final SubLObject module_predicate = hl_storage_module_predicate(hl_module);
		final SubLObject module_any_preds = hl_storage_module_any_predicates(hl_module);
		return makeBoolean((((NIL == module_predicate) && (NIL == module_any_preds)) || ((NIL == module_any_preds) && module_predicate.eql(predicate))) || ((NIL == module_predicate) && (NIL != subl_promotions.memberP(predicate, module_any_preds, UNPROVIDED, UNPROVIDED))));
	}

	public static SubLObject hl_storage_module_required_mt_relevant_p(final SubLObject hl_module, final SubLObject mt) {
		final SubLObject module_mt = hl_storage_module_required_mt(hl_module);
		return mt_relevance_macros.mt_relevant_to_mtP(mt, module_mt);
	}

	public static SubLObject hl_storage_module_applicability_pattern_matched_p(final SubLObject hl_module, final SubLObject sentence) {
		final SubLObject pattern = hl_storage_module_applicability_pattern(hl_module);
		return formula_pattern_match.pattern_matches_formula(pattern, sentence);
	}

	public static SubLObject clear_solely_specific_hl_storage_module_predicate_store() {
		set.clear_set($solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
		return NIL;
	}

	public static SubLObject rebuild_solely_specific_hl_storage_module_predicate_store() {
		return set.set_rebuild($solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
	}

	public static SubLObject register_solely_specific_hl_storage_module_predicate(final SubLObject predicate) {
		return set.set_add(predicate, $solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
	}

	public static SubLObject deregister_solely_specific_hl_storage_module_predicate(final SubLObject predicate) {
		return set.set_remove(predicate, $solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
	}

	public static SubLObject solely_specific_hl_storage_module_predicateP(final SubLObject predicate) {
		return set.set_memberP(predicate, $solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
	}

	public static SubLObject hl_assertion_spec_p(final SubLObject v_object) {
		if (v_object.isCons() && (NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED))) {
			SubLObject cnf = NIL;
			SubLObject mt = NIL;
			destructuring_bind_must_consp(v_object, v_object, $list53);
			cnf = v_object.first();
			SubLObject current = v_object.rest();
			destructuring_bind_must_consp(current, v_object, $list53);
			mt = current.first();
			current = current.rest();
			final SubLObject direction = (current.isCons()) ? current.first() : NIL;
			destructuring_bind_must_listp(current, v_object, $list53);
			current = current.rest();
			final SubLObject variable_map = (current.isCons()) ? current.first() : NIL;
			destructuring_bind_must_listp(current, v_object, $list53);
			current = current.rest();
			if (NIL == current) {
				return makeBoolean((((NIL != clauses.cnf_p(cnf)) && (NIL != hlmt.hlmt_p(mt))) && ((NIL == direction) || (NIL != enumeration_types.direction_p(direction)))) && variable_map.isList());
			}
			cdestructuring_bind_error(v_object, $list53);
		}
		return NIL;
	}

	public static SubLObject new_hl_assertion_spec(final SubLObject cnf, final SubLObject mt, SubLObject direction, SubLObject variable_map) {
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		if (variable_map == UNPROVIDED) {
			variable_map = NIL;
		}
		return list(cnf, mt, direction, variable_map);
	}

	public static SubLObject do_hl_assertion_specs(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list54);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject hl_assertion_spec_var = NIL;
		destructuring_bind_must_consp(current, datum, $list54);
		hl_assertion_spec_var = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject ass = $sym55$ASS;
			final SubLObject asent = $sym56$ASENT;
			return list(PROGN, list(DO_ASSERTIONS, list(ass), listS(CLET, list(list(hl_assertion_spec_var, list(ASSERTION_TO_HL_ASSERTION_SPEC, ass))), append(body, NIL))), list(DO_BOOKKEEPING_ASENTS, list(asent), listS(CLET, list(list(hl_assertion_spec_var, list(BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC, asent))), append(body, NIL))));
		}
		cdestructuring_bind_error(datum, $list54);
		return NIL;
	}

	public static SubLObject destructure_hl_assertion_spec(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list62);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject cnf = NIL;
		SubLObject mt = NIL;
		destructuring_bind_must_consp(current, datum, $list62);
		cnf = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list62);
		mt = current.first();
		current = current.rest();
		final SubLObject direction = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list62);
		current = current.rest();
		final SubLObject variable_map = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list62);
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject hl_assertion_spec = NIL;
			destructuring_bind_must_consp(current, datum, $list62);
			hl_assertion_spec = current.first();
			final SubLObject body;
			current = body = current.rest();
			final SubLObject hl_assertion_spec_var = $sym63$HL_ASSERTION_SPEC_VAR;
			return listS(CLET, listS(list(hl_assertion_spec_var, hl_assertion_spec), list(cnf, list(HL_ASSERTION_SPEC_CNF, hl_assertion_spec_var)), list(mt, list(HL_ASSERTION_SPEC_MT, hl_assertion_spec_var)),
					append(NIL != direction ? list(list(direction, list(HL_ASSERTION_SPEC_DIRECTION, hl_assertion_spec_var))) : NIL, NIL != variable_map ? list(list(variable_map, list(HL_ASSERTION_SPEC_VARIABLE_MAP, hl_assertion_spec_var))) : NIL, NIL)), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list62);
		return NIL;
	}

	public static SubLObject hl_assertion_spec_cnf(final SubLObject hl_assertion_spec) {
		return hl_assertion_spec.first();
	}

	public static SubLObject hl_assertion_spec_mt(final SubLObject hl_assertion_spec) {
		return second(hl_assertion_spec);
	}

	public static SubLObject hl_assertion_spec_direction(final SubLObject hl_assertion_spec) {
		return third(hl_assertion_spec);
	}

	public static SubLObject hl_assertion_spec_variable_map(final SubLObject hl_assertion_spec) {
		return fourth(hl_assertion_spec);
	}

	public static SubLObject hl_assertible_p(final SubLObject v_object) {
		return makeBoolean(((NIL != list_utilities.doubletonP(v_object)) && (NIL != hl_assertion_spec_p(v_object.first()))) && (NIL != arguments.argument_spec_p(second(v_object))));
	}

	public static SubLObject new_hl_assertible(final SubLObject hl_assertion_spec, final SubLObject argument_spec) {
		return list(hl_assertion_spec, argument_spec);
	}

	public static SubLObject do_hl_assertibles(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list68);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject hl_assertible_var = NIL;
		destructuring_bind_must_consp(current, datum, $list68);
		hl_assertible_var = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject ass = $sym69$ASS;
			final SubLObject asent = $sym70$ASENT;
			final SubLObject assertibles = $sym71$ASSERTIBLES;
			return list(PROGN, list(DO_ASSERTIONS, list(ass), list(CLET, list(list(assertibles, list(ASSERTION_TO_HL_ASSERTIBLES, ass))), listS(CDOLIST, list(hl_assertible_var, assertibles), append(body, NIL)))), list(DO_BOOKKEEPING_ASENTS, list(asent), listS(CLET, list(list(hl_assertible_var, list(BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE, asent))), append(body, NIL))));
		}
		cdestructuring_bind_error(datum, $list68);
		return NIL;
	}

	public static SubLObject destructure_hl_assertible(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list75);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject argument_spec = NIL;
		SubLObject cnf = NIL;
		SubLObject mt = NIL;
		destructuring_bind_must_consp(current, datum, $list75);
		argument_spec = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list75);
		cnf = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list75);
		mt = current.first();
		current = current.rest();
		final SubLObject direction = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list75);
		current = current.rest();
		final SubLObject variable_map = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list75);
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject hl_assertible = NIL;
			destructuring_bind_must_consp(current, datum, $list75);
			hl_assertible = current.first();
			final SubLObject body;
			current = body = current.rest();
			final SubLObject hl_assertible_var = $sym76$HL_ASSERTIBLE_VAR;
			final SubLObject hl_assertion_spec_var = $sym77$HL_ASSERTION_SPEC_VAR;
			return list(CLET, list(list(hl_assertible_var, hl_assertible), list(argument_spec, list(HL_ASSERTIBLE_ARGUMENT_SPEC, hl_assertible_var)), list(hl_assertion_spec_var, list(HL_ASSERTIBLE_HL_ASSERTION_SPEC, hl_assertible_var))), listS(DESTRUCTURE_HL_ASSERTION_SPEC, list(cnf, mt, direction, variable_map), hl_assertion_spec_var, append(body, NIL)));
		}
		cdestructuring_bind_error(datum, $list75);
		return NIL;
	}

	public static SubLObject hl_assertible_hl_assertion_spec(final SubLObject hl_assertible) {
		return hl_assertible.first();
	}

	public static SubLObject hl_assertible_argument_spec(final SubLObject hl_assertible) {
		return second(hl_assertible);
	}

	public static SubLObject hl_add_assertible(final SubLObject hl_assertible) {
		assert NIL != hl_assertible_p(hl_assertible) : "hl_storage_modules.hl_assertible_p(hl_assertible) " + "CommonSymbols.NIL != hl_storage_modules.hl_assertible_p(hl_assertible) " + hl_assertible;
		final SubLObject argument_spec = hl_assertible_argument_spec(hl_assertible);
		final SubLObject hl_assertion_spec_var_$7;
		final SubLObject hl_assertion_spec_var = hl_assertion_spec_var_$7 = hl_assertible_hl_assertion_spec(hl_assertible);
		final SubLObject cnf = hl_assertion_spec_cnf(hl_assertion_spec_var_$7);
		final SubLObject mt = hl_assertion_spec_mt(hl_assertion_spec_var_$7);
		final SubLObject direction = hl_assertion_spec_direction(hl_assertion_spec_var_$7);
		final SubLObject variable_map = hl_assertion_spec_variable_map(hl_assertion_spec_var_$7);
		return hl_add_argument(argument_spec, cnf, mt, direction, variable_map);
	}

	public static SubLObject hl_add_argument(final SubLObject argument_spec, final SubLObject cnf, SubLObject mt, final SubLObject direction, SubLObject variable_map) {
		if (variable_map == UNPROVIDED) {
			variable_map = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != arguments.argument_spec_p(argument_spec) : "arguments.argument_spec_p(argument_spec) " + "CommonSymbols.NIL != arguments.argument_spec_p(argument_spec) " + argument_spec;
		assert NIL != clauses.cnf_p(cnf) : "clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) " + cnf;
		assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
		assert NIL != enumeration_types.direction_p(direction) : "enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) " + direction;
		assert NIL != listp(variable_map) : "Types.listp(variable_map) " + "CommonSymbols.NIL != Types.listp(variable_map) " + variable_map;
		janus.janus_note_argument(argument_spec, cnf, mt, direction, variable_map);
		if (NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread)) {
			kb_control_vars.record_hl_transcript_operation(list(TL_ADD_ARGUMENT, list_utilities.quotify(argument_spec), list_utilities.quotify(cnf), list_utilities.quotify(mt), list_utilities.quotify(direction), list_utilities.quotify(variable_map)));
		}
		if (NIL != hlmt.hlmts_supportedP()) {
			mt = hlmt_czer.canonicalize_hlmt(mt);
		}
		return hl_store_perform_action_int($ADD, argument_spec, cnf, mt, direction, variable_map);
	}

	public static SubLObject tl_add_argument(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, SubLObject variable_map) {
		if (variable_map == UNPROVIDED) {
			variable_map = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
		try {
			kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
			result = hl_add_argument(canon_tl.transform_tl_terms_to_hl(argument_spec), canon_tl.transform_tl_terms_to_hl(cnf), canon_tl.transform_tl_terms_to_hl(mt), direction, canon_tl.transform_tl_terms_to_hl(variable_map));
			if (NIL != assertion_handles.assertion_p(result)) {
			}
			assertions_high.tl_cache_assertion(canon_tl.hl_term_to_tl(result), result);
		} finally {
			kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject hl_remove_assertible(final SubLObject hl_assertible) {
		assert NIL != hl_assertible_p(hl_assertible) : "hl_storage_modules.hl_assertible_p(hl_assertible) " + "CommonSymbols.NIL != hl_storage_modules.hl_assertible_p(hl_assertible) " + hl_assertible;
		final SubLObject argument_spec = hl_assertible_argument_spec(hl_assertible);
		final SubLObject hl_assertion_spec_var_$8;
		final SubLObject hl_assertion_spec_var = hl_assertion_spec_var_$8 = hl_assertible_hl_assertion_spec(hl_assertible);
		final SubLObject cnf = hl_assertion_spec_cnf(hl_assertion_spec_var_$8);
		final SubLObject mt = hl_assertion_spec_mt(hl_assertion_spec_var_$8);
		return hl_remove_argument(argument_spec, cnf, mt);
	}

	public static SubLObject hl_remove_argument(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != arguments.argument_spec_p(argument_spec) : "arguments.argument_spec_p(argument_spec) " + "CommonSymbols.NIL != arguments.argument_spec_p(argument_spec) " + argument_spec;
		assert NIL != clauses.cnf_p(cnf) : "clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) " + cnf;
		assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
		if (NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread)) {
			kb_control_vars.record_hl_transcript_operation(list(TL_REMOVE_ARGUMENT, list_utilities.quotify(argument_spec), list_utilities.quotify(cnf), list_utilities.quotify(mt)));
		}
		return hl_store_perform_action_int($REMOVE, argument_spec, cnf, mt, NIL, NIL);
	}

	public static SubLObject tl_remove_argument(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
		try {
			kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
			result = hl_remove_argument(canon_tl.transform_tl_terms_to_hl(argument_spec), canon_tl.transform_tl_terms_to_hl(cnf), canon_tl.transform_tl_terms_to_hl(mt));
		} finally {
			kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject hl_remove_all_arguments(final SubLObject cnf, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != clauses.cnf_p(cnf) : "clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) " + cnf;
		assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
		if (NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread)) {
			kb_control_vars.record_hl_transcript_operation(list(TL_REMOVE_ALL_ARGUMENTS, list_utilities.quotify(cnf), list_utilities.quotify(mt)));
		}
		return hl_store_perform_action_int($REMOVE_ALL, NIL, cnf, mt, NIL, NIL);
	}

	public static SubLObject tl_remove_all_arguments(final SubLObject cnf, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
		try {
			kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
			result = hl_remove_all_arguments(canon_tl.transform_tl_terms_to_hl(cnf), canon_tl.transform_tl_terms_to_hl(mt));
		} finally {
			kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject with_new_successful_hl_storage_modules_info(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CLET, $list88, append(body, NIL));
	}

	public static SubLObject note_successful_hl_storage_module(final SubLObject hl_module) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		set.set_add(hl_module, $successful_hl_storage_modules$.getDynamicValue(thread));
		return $successful_hl_storage_modules$.getDynamicValue(thread);
	}

	public static SubLObject hl_storage_module_successfulP(final SubLObject hl_module) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return set.set_memberP(hl_module, $successful_hl_storage_modules$.getDynamicValue(thread));
	}

	public static SubLObject hl_store_perform_action_int(final SubLObject action, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject successP = NIL;
		SubLObject solely_specificP = NIL;
		final SubLObject argument_type = (NIL != argument_spec) ? arguments.argument_spec_type(argument_spec) : NIL;
		final SubLObject _prev_bind_0 = $successful_hl_storage_modules$.currentBinding(thread);
		try {
			$successful_hl_storage_modules$.bind(set.new_set(UNPROVIDED, UNPROVIDED), thread);
			if (NIL != clauses.atomic_clause_p(cnf)) {
				final SubLObject predicate = clause_utilities.atomic_cnf_predicate(cnf);
				final SubLObject predicate_specific_modules = (NIL != argument_type) ? hl_storage_modules_for_predicate_and_argument_type(predicate, argument_type) : hl_storage_modules_for_predicate(predicate);
				solely_specificP = solely_specific_hl_storage_module_predicateP(predicate);
				if (NIL != predicate_specific_modules) {
					successP = hl_perform_action_with_storage_modules_int(action, predicate_specific_modules, argument_spec, cnf, mt, direction, variable_map);
				}
			}
			if ((NIL == successP) && (NIL == solely_specificP)) {
				final SubLObject predicate_generic_modules = (NIL != argument_type) ? hl_storage_modules_for_argument_type(argument_type) : generic_hl_storage_modules();
				if (NIL != predicate_generic_modules) {
					successP = hl_perform_action_with_storage_modules_int(action, predicate_generic_modules, argument_spec, cnf, mt, direction, variable_map);
				}
			}
		} finally {
			$successful_hl_storage_modules$.rebind(_prev_bind_0, thread);
		}
		return successP;
	}

	public static SubLObject hl_perform_action_with_storage_modules_int(final SubLObject action, final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
		final SubLObject actual_mt = kb_accessors.possibly_convention_mt_for_decontextualized_cnf(mt, cnf);
		if (action.eql($ADD)) {
			final SubLObject successP = try_hl_add_modules(hl_modules, argument_spec, cnf, actual_mt, direction, variable_map);
			return successP;
		}
		if (action.eql($REMOVE)) {
			SubLObject successP = try_hl_remove_modules(hl_modules, argument_spec, cnf, actual_mt);
			if ((NIL != $robustly_remove_uncanonical_decontextualized_assertiblesP$.getGlobalValue()) && (NIL == hlmt.hlmt_equal(mt, actual_mt))) {
				final SubLObject robust_successP = try_hl_remove_modules(hl_modules, argument_spec, cnf, mt);
				successP = makeBoolean((NIL != successP) || (NIL != robust_successP));
			}
			return successP;
		}
		if (action.eql($REMOVE_ALL)) {
			SubLObject successP = try_hl_remove_all_modules(hl_modules, cnf, actual_mt);
			if ((NIL != $robustly_remove_uncanonical_decontextualized_assertiblesP$.getGlobalValue()) && (NIL == hlmt.hlmt_equal(mt, actual_mt))) {
				final SubLObject robust_successP = try_hl_remove_all_modules(hl_modules, cnf, mt);
				successP = makeBoolean((NIL != successP) || (NIL != robust_successP));
			}
			return successP;
		}
		Errors.error($str89$Unexpected_HL_storage_action__a, action);
		return NIL;
	}

	public static SubLObject hl_assert(final SubLObject cnf, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject variable_map) {
		if (variable_map == UNPROVIDED) {
			variable_map = NIL;
		}
		final SubLObject argument_spec = arguments.create_asserted_argument_spec(strength);
		return hl_add_argument(argument_spec, cnf, mt, direction, variable_map);
	}

	public static SubLObject hl_unassert(final SubLObject cnf, final SubLObject mt) {
		final SubLObject argument_spec = $dummy_asserted_argument_spec$.getGlobalValue();
		return hl_remove_argument(argument_spec, cnf, mt);
	}

	public static SubLObject hl_add_deduction(final SubLObject cnf, final SubLObject mt, final SubLObject supports, final SubLObject direction, SubLObject variable_map, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
		if (variable_map == UNPROVIDED) {
			variable_map = NIL;
		}
		if (v_bindings == UNPROVIDED) {
			v_bindings = NIL;
		}
		if (pragmatic_support_mts == UNPROVIDED) {
			pragmatic_support_mts = NIL;
		}
		final SubLObject deduction_spec = deductions_high.create_deduction_spec(supports, v_bindings, pragmatic_support_mts);
		return hl_add_argument(deduction_spec, cnf, mt, direction, variable_map);
	}

	public static SubLObject hl_add_deduction_for_gaf(final SubLObject asent, final SubLObject truth, final SubLObject mt, final SubLObject supports, SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == $allow_backward_gafs$.getDynamicValue(thread)) {
			direction = $FORWARD;
		}
		final SubLObject gaf_formula = cycl_utilities.possibly_negate(asent, truth);
		final SubLObject canon_cnfs = czer_main.canonicalize_gaf(gaf_formula, mt);
		if ((NIL == canon_cnfs) || $$False.eql(canon_cnfs)) {
			conflicts.handle_invalid_deduction_conflict(asent, truth, mt);
			return NIL;
		}
		if (!$$True.eql(canon_cnfs)) {
			SubLObject cdolist_list_var = canon_cnfs;
			SubLObject canon_cnf_bind_list_pair = NIL;
			canon_cnf_bind_list_pair = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject current;
				final SubLObject datum = current = canon_cnf_bind_list_pair;
				SubLObject canon_cnf = NIL;
				destructuring_bind_must_consp(current, datum, $list95);
				canon_cnf = current.first();
				current = current.rest();
				final SubLObject binding_list = (current.isCons()) ? current.first() : NIL;
				destructuring_bind_must_listp(current, datum, $list95);
				current = current.rest();
				if (NIL == current) {
					assert NIL != clauses.cnf_p(canon_cnf) : "clauses.cnf_p(canon_cnf) " + "CommonSymbols.NIL != clauses.cnf_p(canon_cnf) " + canon_cnf;
					if (((NIL != $filter_deductions_for_trivially_derivable_gafs$.getDynamicValue(thread)) && (NIL != clauses.atomic_clause_p(canon_cnf))) && (NIL != tms.atomic_cnf_trivially_derivable(canon_cnf, mt))) {
						return NIL;
					}
					return hl_add_deduction(canon_cnf, mt, supports, direction, binding_list, UNPROVIDED, UNPROVIDED);
				} else {
					cdestructuring_bind_error(datum, $list95);
					cdolist_list_var = cdolist_list_var.rest();
					canon_cnf_bind_list_pair = cdolist_list_var.first();
				}
			}
		}
		return NIL;
	}

	public static SubLObject hl_remove_deduction(final SubLObject cnf, final SubLObject mt, final SubLObject supports) {
		final SubLObject deduction_spec = deductions_high.create_deduction_spec(supports, UNPROVIDED, UNPROVIDED);
		return hl_remove_argument(deduction_spec, cnf, mt);
	}

	public static SubLObject declare_hl_storage_modules_file() {
		declareFunction(me, "hl_storage_module", "HL-STORAGE-MODULE", 2, 0, false);
		declareFunction(me, "undeclare_hl_storage_module", "UNDECLARE-HL-STORAGE-MODULE", 1, 0, false);
		declareFunction(me, "try_hl_add_modules", "TRY-HL-ADD-MODULES", 6, 0, false);
		declareFunction(me, "try_hl_remove_modules", "TRY-HL-REMOVE-MODULES", 4, 0, false);
		declareFunction(me, "try_hl_remove_all_modules", "TRY-HL-REMOVE-ALL-MODULES", 3, 0, false);
		declareFunction(me, "hl_storage_modules_for_predicate_and_argument_type", "HL-STORAGE-MODULES-FOR-PREDICATE-AND-ARGUMENT-TYPE", 2, 0, false);
		declareFunction(me, "hl_storage_modules_for_predicate", "HL-STORAGE-MODULES-FOR-PREDICATE", 1, 0, false);
		declareFunction(me, "predicate_has_specific_hl_storage_modulesP", "PREDICATE-HAS-SPECIFIC-HL-STORAGE-MODULES?", 1, 0, false);
		declareFunction(me, "predicates_with_specific_hl_storage_modules", "PREDICATES-WITH-SPECIFIC-HL-STORAGE-MODULES", 0, 0, false);
		declareFunction(me, "predicate_generic_hl_storage_modules", "PREDICATE-GENERIC-HL-STORAGE-MODULES", 0, 0, false);
		declareFunction(me, "hl_storage_modules_for_argument_type", "HL-STORAGE-MODULES-FOR-ARGUMENT-TYPE", 1, 0, false);
		declareFunction(me, "generic_hl_storage_modules", "GENERIC-HL-STORAGE-MODULES", 0, 0, false);
		declareFunction(me, "generic_hl_storage_module_count", "GENERIC-HL-STORAGE-MODULE-COUNT", 0, 0, false);
		declareFunction(me, "hl_storage_modules_for_just_argument_type", "HL-STORAGE-MODULES-FOR-JUST-ARGUMENT-TYPE", 1, 0, false);
		declareFunction(me, "currently_executing_hl_storage_module", "CURRENTLY-EXECUTING-HL-STORAGE-MODULE", 0, 0, false);
		declareMacro(me, "within_hl_storage_module_execution", "WITHIN-HL-STORAGE-MODULE-EXECUTION");
		declareFunction(me, "try_hl_storage_modules_int", "TRY-HL-STORAGE-MODULES-INT", 7, 1, false);
		declareFunction(me, "apply_hl_storage_module", "APPLY-HL-STORAGE-MODULE", 8, 0, false);
		declareFunction(me, "hl_storage_module_name", "HL-STORAGE-MODULE-NAME", 1, 0, false);
		declareFunction(me, "hl_storage_module_applicableP", "HL-STORAGE-MODULE-APPLICABLE?", 6, 0, false);
		declareFunction(me, "applicable_hl_storage_modules", "APPLICABLE-HL-STORAGE-MODULES", 6, 0, false);
		declareFunction(me, "update_dispreferred_hl_storage_modules_wrt_applicable_modules", "UPDATE-DISPREFERRED-HL-STORAGE-MODULES-WRT-APPLICABLE-MODULES", 9, 0, false);
		declareFunction(me, "update_supplanted_hl_storage_modules_wrt_applicable_modules", "UPDATE-SUPPLANTED-HL-STORAGE-MODULES-WRT-APPLICABLE-MODULES", 3, 0, false);
		declareFunction(me, "sort_hl_storage_modules_by_cost", "SORT-HL-STORAGE-MODULES-BY-COST", 6, 0, false);
		declareFunction(me, "sort_dispreferred_hl_storage_modules_by_cost", "SORT-DISPREFERRED-HL-STORAGE-MODULES-BY-COST", 6, 0, false);
		declareFunction(me, "hl_storage_module_incompleteness", "HL-STORAGE-MODULE-INCOMPLETENESS", 6, 1, false);
		declareFunction(me, "hl_storage_module_add", "HL-STORAGE-MODULE-ADD", 6, 1, false);
		declareFunction(me, "hl_storage_module_remove", "HL-STORAGE-MODULE-REMOVE", 4, 1, false);
		declareFunction(me, "hl_storage_module_remove_all", "HL-STORAGE-MODULE-REMOVE-ALL", 3, 1, false);
		declareFunction(me, "hl_storage_module_argument_type", "HL-STORAGE-MODULE-ARGUMENT-TYPE", 1, 0, false);
		declareFunction(me, "hl_storage_module_sense", "HL-STORAGE-MODULE-SENSE", 1, 0, false);
		declareFunction(me, "hl_storage_module_direction", "HL-STORAGE-MODULE-DIRECTION", 1, 0, false);
		declareFunction(me, "hl_storage_module_required_mt", "HL-STORAGE-MODULE-REQUIRED-MT", 1, 0, false);
		declareFunction(me, "hl_storage_module_predicate", "HL-STORAGE-MODULE-PREDICATE", 1, 0, false);
		declareFunction(me, "hl_storage_module_any_predicates", "HL-STORAGE-MODULE-ANY-PREDICATES", 1, 0, false);
		declareFunction(me, "hl_storage_module_applicability_func", "HL-STORAGE-MODULE-APPLICABILITY-FUNC", 1, 0, false);
		declareFunction(me, "hl_storage_module_applicability_pattern", "HL-STORAGE-MODULE-APPLICABILITY-PATTERN", 1, 0, false);
		declareFunction(me, "hl_storage_module_exclusive_func", "HL-STORAGE-MODULE-EXCLUSIVE-FUNC", 1, 0, false);
		declareFunction(me, "hl_storage_module_supplants_info", "HL-STORAGE-MODULE-SUPPLANTS-INFO", 1, 0, false);
		declareFunction(me, "hl_storage_module_preferred_over_info", "HL-STORAGE-MODULE-PREFERRED-OVER-INFO", 1, 0, false);
		declareFunction(me, "get_hl_storage_module_property", "GET-HL-STORAGE-MODULE-PROPERTY", 2, 0, false);
		declareFunction(me, "reclassify_hl_storage_modules", "RECLASSIFY-HL-STORAGE-MODULES", 0, 0, false);
		declareFunction(me, "hl_storage_module_properties", "HL-STORAGE-MODULE-PROPERTIES", 0, 0, false);
		declareFunction(me, "hl_storage_module_property_p", "HL-STORAGE-MODULE-PROPERTY-P", 1, 0, false);
		declareFunction(me, "remove_hl_storage_module", "REMOVE-HL-STORAGE-MODULE", 1, 0, false);
		declareFunction(me, "remove_hl_storage_module_from_generic_hl_module_cache", "REMOVE-HL-STORAGE-MODULE-FROM-GENERIC-HL-MODULE-CACHE", 1, 0, false);
		declareFunction(me, "remove_hl_storage_module_from_predicate_specific_hl_module_cache", "REMOVE-HL-STORAGE-MODULE-FROM-PREDICATE-SPECIFIC-HL-MODULE-CACHE", 2, 0, false);
		declareFunction(me, "clear_hl_storage_module_indexes", "CLEAR-HL-STORAGE-MODULE-INDEXES", 0, 0, false);
		declareFunction(me, "setup_hl_storage_module", "SETUP-HL-STORAGE-MODULE", 2, 0, false);
		declareFunction(me, "hl_storage_module_applicability_pattern_p", "HL-STORAGE-MODULE-APPLICABILITY-PATTERN-P", 1, 0, false);
		declareFunction(me, "register_hl_storage_module", "REGISTER-HL-STORAGE-MODULE", 2, 0, false);
		declareFunction(me, "classify_hl_storage_module", "CLASSIFY-HL-STORAGE-MODULE", 3, 0, false);
		declareFunction(me, "register_predicate_specific_hl_storage_module", "REGISTER-PREDICATE-SPECIFIC-HL-STORAGE-MODULE", 2, 0, false);
		declareFunction(me, "register_predicate_generic_hl_storage_module", "REGISTER-PREDICATE-GENERIC-HL-STORAGE-MODULE", 1, 0, false);
		declareFunction(me, "register_argument_type_specific_hl_storage_module", "REGISTER-ARGUMENT-TYPE-SPECIFIC-HL-STORAGE-MODULE", 2, 0, false);
		declareFunction(me, "hl_storage_modules", "HL-STORAGE-MODULES", 0, 0, false);
		declareFunction(me, "hl_storage_module_count", "HL-STORAGE-MODULE-COUNT", 0, 0, false);
		declareFunction(me, "hl_storage_module_applicable_intP", "HL-STORAGE-MODULE-APPLICABLE-INT?", 6, 0, false);
		declareFunction(me, "hl_storage_module_sense_relevant_p", "HL-STORAGE-MODULE-SENSE-RELEVANT-P", 2, 0, false);
		declareFunction(me, "hl_storage_module_direction_relevant_p", "HL-STORAGE-MODULE-DIRECTION-RELEVANT-P", 2, 0, false);
		declareFunction(me, "hl_storage_module_argument_type_relevant_p", "HL-STORAGE-MODULE-ARGUMENT-TYPE-RELEVANT-P", 2, 0, false);
		declareFunction(me, "hl_storage_module_predicate_relevant_p", "HL-STORAGE-MODULE-PREDICATE-RELEVANT-P", 2, 0, false);
		declareFunction(me, "hl_storage_module_required_mt_relevant_p", "HL-STORAGE-MODULE-REQUIRED-MT-RELEVANT-P", 2, 0, false);
		declareFunction(me, "hl_storage_module_applicability_pattern_matched_p", "HL-STORAGE-MODULE-APPLICABILITY-PATTERN-MATCHED-P", 2, 0, false);
		declareFunction(me, "clear_solely_specific_hl_storage_module_predicate_store", "CLEAR-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE", 0, 0, false);
		declareFunction(me, "rebuild_solely_specific_hl_storage_module_predicate_store", "REBUILD-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE", 0, 0, false);
		declareFunction(me, "register_solely_specific_hl_storage_module_predicate", "REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE", 1, 0, false);
		declareFunction(me, "deregister_solely_specific_hl_storage_module_predicate", "DEREGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE", 1, 0, false);
		declareFunction(me, "solely_specific_hl_storage_module_predicateP", "SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE?", 1, 0, false);
		declareFunction(me, "hl_assertion_spec_p", "HL-ASSERTION-SPEC-P", 1, 0, false);
		declareFunction(me, "new_hl_assertion_spec", "NEW-HL-ASSERTION-SPEC", 2, 2, false);
		declareMacro(me, "do_hl_assertion_specs", "DO-HL-ASSERTION-SPECS");
		declareMacro(me, "destructure_hl_assertion_spec", "DESTRUCTURE-HL-ASSERTION-SPEC");
		declareFunction(me, "hl_assertion_spec_cnf", "HL-ASSERTION-SPEC-CNF", 1, 0, false);
		declareFunction(me, "hl_assertion_spec_mt", "HL-ASSERTION-SPEC-MT", 1, 0, false);
		declareFunction(me, "hl_assertion_spec_direction", "HL-ASSERTION-SPEC-DIRECTION", 1, 0, false);
		declareFunction(me, "hl_assertion_spec_variable_map", "HL-ASSERTION-SPEC-VARIABLE-MAP", 1, 0, false);
		declareFunction(me, "hl_assertible_p", "HL-ASSERTIBLE-P", 1, 0, false);
		declareFunction(me, "new_hl_assertible", "NEW-HL-ASSERTIBLE", 2, 0, false);
		declareMacro(me, "do_hl_assertibles", "DO-HL-ASSERTIBLES");
		declareMacro(me, "destructure_hl_assertible", "DESTRUCTURE-HL-ASSERTIBLE");
		declareFunction(me, "hl_assertible_hl_assertion_spec", "HL-ASSERTIBLE-HL-ASSERTION-SPEC", 1, 0, false);
		declareFunction(me, "hl_assertible_argument_spec", "HL-ASSERTIBLE-ARGUMENT-SPEC", 1, 0, false);
		declareFunction(me, "hl_add_assertible", "HL-ADD-ASSERTIBLE", 1, 0, false);
		declareFunction(me, "hl_add_argument", "HL-ADD-ARGUMENT", 4, 1, false);
		declareFunction(me, "tl_add_argument", "TL-ADD-ARGUMENT", 4, 1, false);
		declareFunction(me, "hl_remove_assertible", "HL-REMOVE-ASSERTIBLE", 1, 0, false);
		declareFunction(me, "hl_remove_argument", "HL-REMOVE-ARGUMENT", 3, 0, false);
		declareFunction(me, "tl_remove_argument", "TL-REMOVE-ARGUMENT", 3, 0, false);
		declareFunction(me, "hl_remove_all_arguments", "HL-REMOVE-ALL-ARGUMENTS", 2, 0, false);
		declareFunction(me, "tl_remove_all_arguments", "TL-REMOVE-ALL-ARGUMENTS", 2, 0, false);
		declareMacro(me, "with_new_successful_hl_storage_modules_info", "WITH-NEW-SUCCESSFUL-HL-STORAGE-MODULES-INFO");
		declareFunction(me, "note_successful_hl_storage_module", "NOTE-SUCCESSFUL-HL-STORAGE-MODULE", 1, 0, false);
		declareFunction(me, "hl_storage_module_successfulP", "HL-STORAGE-MODULE-SUCCESSFUL?", 1, 0, false);
		declareFunction(me, "hl_store_perform_action_int", "HL-STORE-PERFORM-ACTION-INT", 6, 0, false);
		declareFunction(me, "hl_perform_action_with_storage_modules_int", "HL-PERFORM-ACTION-WITH-STORAGE-MODULES-INT", 7, 0, false);
		declareFunction(me, "hl_assert", "HL-ASSERT", 4, 1, false);
		declareFunction(me, "hl_unassert", "HL-UNASSERT", 2, 0, false);
		declareFunction(me, "hl_add_deduction", "HL-ADD-DEDUCTION", 4, 3, false);
		declareFunction(me, "hl_add_deduction_for_gaf", "HL-ADD-DEDUCTION-FOR-GAF", 5, 0, false);
		declareFunction(me, "hl_remove_deduction", "HL-REMOVE-DEDUCTION", 3, 0, false);
		return NIL;
	}

	public static SubLObject init_hl_storage_modules_file() {
		deflexical("*HL-STORAGE-MODULES*", SubLTrampolineFile.maybeDefault($hl_storage_modules$, $hl_storage_modules$, () -> set.new_set(symbol_function(EQL), UNPROVIDED)));
		deflexical("*PREDICATE-GENERIC-HL-STORAGE-MODULES*", SubLTrampolineFile.maybeDefault($predicate_generic_hl_storage_modules$, $predicate_generic_hl_storage_modules$, () -> set.new_set(symbol_function(EQL), UNPROVIDED)));
		deflexical("*PREDICATE-SPECIFIC-HL-STORAGE-MODULES-TABLE*", SubLTrampolineFile.maybeDefault($predicate_specific_hl_storage_modules_table$, $predicate_specific_hl_storage_modules_table$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
		deflexical("*ARGUMENT-TYPE-SPECIFIC-HL-STORAGE-MODULES-TABLE*", SubLTrampolineFile.maybeDefault($argument_type_specific_hl_storage_modules_table$, $argument_type_specific_hl_storage_modules_table$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
		defparameter("*CURRENTLY-EXECUTING-HL-STORAGE-MODULE*", NIL);
		deflexical("*HL-STORAGE-MODULE-PROPERTIES*", propKeywords);
		deflexical("*SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE*", SubLTrampolineFile.maybeDefault($solely_specific_hl_storage_module_predicate_store$, $solely_specific_hl_storage_module_predicate_store$, () -> set.new_set(EQL, $int$50)));
		defparameter("*SUCCESSFUL-HL-STORAGE-MODULES*", NIL);
		deflexical("*ROBUSTLY-REMOVE-UNCANONICAL-DECONTEXTUALIZED-ASSERTIBLES?*", T);
		deflexical("*DUMMY-ASSERTED-ARGUMENT-SPEC*", SubLTrampolineFile.maybeDefault($dummy_asserted_argument_spec$, $dummy_asserted_argument_spec$, () -> arguments.create_asserted_argument_spec($UNSPECIFIED)));
		return NIL;
	}

	public static SubLObject setup_hl_storage_modules_file() {
		declare_defglobal($hl_storage_modules$);
		declare_defglobal($predicate_generic_hl_storage_modules$);
		declare_defglobal($predicate_specific_hl_storage_modules_table$);
		declare_defglobal($argument_type_specific_hl_storage_modules_table$);
		declare_defglobal($solely_specific_hl_storage_module_predicate_store$);
		declare_defglobal($dummy_asserted_argument_spec$);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_hl_storage_modules_file();
	}

	@Override
	public void initializeVariables() {
		init_hl_storage_modules_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_hl_storage_modules_file();
	}

	static {

	}
}

/**
 * Total time: 539 ms synthetic
 */
