/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.inference.harness.inference_proof_spec.merge_2_proof_specs;
import static com.cyc.cycjava.cycl.inference.modules.preference_modules.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

// import static *;
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-DATASTRUCTURES-STRATEGY
 * source file: /cyc/top/cycl/inference/harness/inference-datastructures-strategy.lisp
 * created:     2019/07/03 17:37:38
 */
public final class inference_datastructures_strategy extends SubLTranslatedFile implements V12 {
	public static SubLObject uninterestingness_cache_thrown_away_wrt_transformation_code(SubLObject flags) {
		return bytes.ldb($uninterestingness_cache_thrown_away_wrt_transformation_byte$.getGlobalValue(), flags);
	}

	public static SubLObject uninterestingness_cache_thrown_away_wrt_removal_code(SubLObject flags) {
		return bytes.ldb($uninterestingness_cache_thrown_away_wrt_removal_byte$.getGlobalValue(), flags);
	}

	public static SubLObject uninterestingness_cache_thrown_away_wrt_new_root_code(SubLObject flags) {
		return bytes.ldb($uninterestingness_cache_thrown_away_wrt_new_root_byte$.getGlobalValue(), flags);
	}

	public static SubLObject uninterestingness_cache_thrown_away_code(SubLObject flags) {
		return bytes.ldb($uninterestingness_cache_thrown_away_byte$.getGlobalValue(), flags);
	}

	public static SubLObject uninterestingness_cache_set_aside_wrt_transformation_code(SubLObject flags) {
		return bytes.ldb($uninterestingness_cache_set_aside_wrt_transformation_byte$.getGlobalValue(), flags);
	}

	public static SubLObject uninterestingness_cache_set_aside_wrt_removal_code(SubLObject flags) {
		return bytes.ldb($uninterestingness_cache_set_aside_wrt_removal_byte$.getGlobalValue(), flags);
	}

	public static SubLObject uninterestingness_cache_set_aside_wrt_new_root_code(SubLObject flags) {
		return bytes.ldb($uninterestingness_cache_set_aside_wrt_new_root_byte$.getGlobalValue(), flags);
	}

	public static SubLObject uninterestingness_cache_set_aside_code(SubLObject flags) {
		return bytes.ldb($uninterestingness_cache_set_aside_byte$.getGlobalValue(), flags);
	}

	public static SubLObject tactic_thrown_away_cache_transformation_status(SubLObject tactic, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_thrown_away_wrt_transformation_code(tactic_strategic_flags(tactic, strategy)));
	}

	public static SubLObject tactic_thrown_away_cache_status_wrt_motivation(SubLObject tactic, SubLObject strategy,
			SubLObject motivation) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == $uninterestingness_cache_lookup_enabledP$.getDynamicValue(thread)) {
				return $RECOMPUTE;
			}
			{
				SubLObject pcase_var = motivation;
				if (pcase_var.eql($REMOVAL)) {
					return tactic_thrown_away_cache_removal_status(tactic, strategy);
				} else {
					if (pcase_var.eql($TRANSFORMATION)) {
						return tactic_thrown_away_cache_transformation_status(tactic, strategy);
					} else {
						if (pcase_var.eql($NEW_ROOT)) {
							return tactic_thrown_away_cache_new_root_status(tactic, strategy);
						} else {
							return Errors.error($str_alt147$unexpected_motivation__s, motivation);
						}
					}
				}
			}
		}
	}

	public static SubLObject tactic_thrown_away_cache_removal_status(SubLObject tactic, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_thrown_away_wrt_removal_code(tactic_strategic_flags(tactic, strategy)));
	}

	public static SubLObject tactic_thrown_away_cache_new_root_status(SubLObject tactic, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_thrown_away_wrt_new_root_code(tactic_strategic_flags(tactic, strategy)));
	}

	public static SubLObject tactic_strategic_flags(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
			return tact_strategic_properties_flags(tactic_strategic_properties);
		}
	}

	public static SubLObject tactic_set_aside_cache_transformation_status(SubLObject tactic, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_set_aside_wrt_transformation_code(tactic_strategic_flags(tactic, strategy)));
	}

	public static SubLObject tactic_set_aside_cache_status_wrt_motivation(SubLObject tactic, SubLObject strategy,
			SubLObject motivation) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == $uninterestingness_cache_lookup_enabledP$.getDynamicValue(thread)) {
				return $RECOMPUTE;
			}
			{
				SubLObject pcase_var = motivation;
				if (pcase_var.eql($REMOVAL)) {
					return tactic_set_aside_cache_removal_status(tactic, strategy);
				} else {
					if (pcase_var.eql($TRANSFORMATION)) {
						return tactic_set_aside_cache_transformation_status(tactic, strategy);
					} else {
						if (pcase_var.eql($NEW_ROOT)) {
							return tactic_set_aside_cache_new_root_status(tactic, strategy);
						} else {
							return Errors.error($str_alt147$unexpected_motivation__s, motivation);
						}
					}
				}
			}
		}
	}

	public static SubLObject tactic_set_aside_cache_removal_status(SubLObject tactic, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_set_aside_wrt_removal_code(tactic_strategic_flags(tactic, strategy)));
	}

	public static SubLObject tactic_set_aside_cache_new_root_status(SubLObject tactic, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_set_aside_wrt_new_root_code(tactic_strategic_flags(tactic, strategy)));
	}

	public static SubLObject tact_strategic_properties_flags(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, TACTIC_STRATEGIC_PROPERTIES_P);
		return v_object.getField5();
	}

	public static SubLObject set_uninterestingness_cache_thrown_away_wrt_transformation_code(SubLObject flags,
			SubLObject code) {
		return bytes.dpb(code, $uninterestingness_cache_thrown_away_wrt_transformation_byte$.getGlobalValue(), flags);
	}

	public static SubLObject set_uninterestingness_cache_thrown_away_wrt_removal_code(SubLObject flags,
			SubLObject code) {
		return bytes.dpb(code, $uninterestingness_cache_thrown_away_wrt_removal_byte$.getGlobalValue(), flags);
	}

	public static SubLObject set_uninterestingness_cache_thrown_away_wrt_new_root_code(SubLObject flags,
			SubLObject code) {
		return bytes.dpb(code, $uninterestingness_cache_thrown_away_wrt_new_root_byte$.getGlobalValue(), flags);
	}

	public static SubLObject set_uninterestingness_cache_thrown_away_code(SubLObject flags, SubLObject code) {
		return bytes.dpb(code, $uninterestingness_cache_thrown_away_byte$.getGlobalValue(), flags);
	}

	public static SubLObject set_uninterestingness_cache_set_aside_wrt_transformation_code(SubLObject flags,
			SubLObject code) {
		return bytes.dpb(code, $uninterestingness_cache_set_aside_wrt_transformation_byte$.getGlobalValue(), flags);
	}

	public static SubLObject set_uninterestingness_cache_set_aside_wrt_removal_code(SubLObject flags, SubLObject code) {
		return bytes.dpb(code, $uninterestingness_cache_set_aside_wrt_removal_byte$.getGlobalValue(), flags);
	}

	public static SubLObject set_uninterestingness_cache_set_aside_wrt_new_root_code(SubLObject flags,
			SubLObject code) {
		return bytes.dpb(code, $uninterestingness_cache_set_aside_wrt_new_root_byte$.getGlobalValue(), flags);
	}

	public static SubLObject set_uninterestingness_cache_set_aside_code(SubLObject flags, SubLObject code) {
		return bytes.dpb(code, $uninterestingness_cache_set_aside_byte$.getGlobalValue(), flags);
	}

	public static SubLObject set_tactic_thrown_away_wrt_transformation(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_thrown_away_wrt_removal(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_removal_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_thrown_away_wrt_new_root(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_new_root_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_thrown_away_wrt(SubLObject tactic, SubLObject strategy, SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_tactic_thrown_away_wrt_removal(tactic, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_tactic_thrown_away_wrt_transformation(tactic, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_tactic_thrown_away_wrt_new_root(tactic, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject set_tactic_strategic_flags(SubLObject tactic, SubLObject strategy, SubLObject flags) {
		SubLTrampolineFile.checkType(flags, FIXNUMP);
		{
			SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
			_csetf_tact_strategic_properties_flags(tactic_strategic_properties, flags);
		}
		return flags;
	}

	public static SubLObject set_tactic_set_aside_wrt_transformation(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_set_aside_wrt_removal(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_removal_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_set_aside_wrt_new_root(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_new_root_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_set_aside_wrt(SubLObject tactic, SubLObject strategy, SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_tactic_set_aside_wrt_removal(tactic, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_tactic_set_aside_wrt_transformation(tactic, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_tactic_set_aside_wrt_new_root(tactic, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject set_tactic_recompute_thrown_away_wrt_transformation(SubLObject tactic,
			SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_recompute_thrown_away_wrt_removal(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_removal_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_recompute_thrown_away_wrt_new_root(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_new_root_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_recompute_thrown_away_wrt_all_motivations(SubLObject tactic,
			SubLObject strategy) {
		if (NIL != balancing_tactician.balancing_tactician_substrategy_p(strategy)) {
			set_tactic_recompute_thrown_away(tactic, strategy);
		} else {
			set_tactic_recompute_thrown_away_wrt_removal(tactic, strategy);
			set_tactic_recompute_thrown_away_wrt_transformation(tactic, strategy);
			set_tactic_recompute_thrown_away_wrt_new_root(tactic, strategy);
		}
		return NIL;
	}

	public static SubLObject set_tactic_recompute_thrown_away_wrt(SubLObject tactic, SubLObject strategy,
			SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_tactic_recompute_thrown_away_wrt_removal(tactic, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_tactic_recompute_thrown_away_wrt_transformation(tactic, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_tactic_recompute_thrown_away_wrt_new_root(tactic, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject set_tactic_recompute_set_aside_wrt_transformation(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_recompute_set_aside_wrt_removal(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_removal_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_recompute_set_aside_wrt_new_root(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_new_root_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations(
			SubLObject tactic) {
		{
			SubLObject prob = inference_datastructures_tactic.tactic_problem(tactic);
			SubLObject store = inference_datastructures_problem.problem_store(prob);
			SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
			if (NIL == do_id_index_empty_p(idx, $SKIP)) {
				{
					SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
					SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
					SubLObject inference = NIL;
					while (NIL != id) {
						inference = do_id_index_state_object(idx, $SKIP, id, state_var);
						if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
							if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob,
									inference)) {
								{
									SubLObject inference_var = inference;
									SubLObject set_contents_var = set.do_set_internal(
											inference_datastructures_inference.inference_strategy_set(inference_var));
									SubLObject basis_object = set_contents
											.do_set_contents_basis_object(set_contents_var);
									SubLObject state = NIL;
									for (state = set_contents.do_set_contents_initial_state(basis_object,
											set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
													state); state = set_contents.do_set_contents_update_state(state)) {
										{
											SubLObject strategy = set_contents.do_set_contents_next(basis_object,
													state);
											if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
												set_tactic_recompute_set_aside_wrt_all_motivations(tactic, strategy);
											}
										}
									}
								}
							}
						}
						id = do_id_index_next_id(idx, NIL, id, state_var);
						state_var = do_id_index_next_state(idx, NIL, id, state_var);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject set_tactic_recompute_set_aside_wrt_all_motivations(SubLObject tactic,
			SubLObject strategy) {
		if (NIL != balancing_tactician.balancing_tactician_substrategy_p(strategy)) {
			set_tactic_recompute_set_aside(tactic, strategy);
		} else {
			set_tactic_recompute_set_aside_wrt_removal(tactic, strategy);
			set_tactic_recompute_set_aside_wrt_transformation(tactic, strategy);
			set_tactic_recompute_set_aside_wrt_new_root(tactic, strategy);
		}
		return NIL;
	}

	public static SubLObject set_tactic_recompute_set_aside_wrt(SubLObject tactic, SubLObject strategy,
			SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_tactic_recompute_set_aside_wrt_removal(tactic, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_tactic_recompute_set_aside_wrt_transformation(tactic, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_tactic_recompute_set_aside_wrt_new_root(tactic, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject set_tactic_not_thrown_away_wrt_transformation(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_not_thrown_away_wrt_removal(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_removal_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_not_thrown_away_wrt_new_root(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_new_root_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_not_thrown_away_wrt(SubLObject tactic, SubLObject strategy,
			SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_tactic_not_thrown_away_wrt_removal(tactic, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_tactic_not_thrown_away_wrt_transformation(tactic, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_tactic_not_thrown_away_wrt_new_root(tactic, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject set_tactic_not_set_aside_wrt_transformation(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_not_set_aside_wrt_removal(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_removal_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_not_set_aside_wrt_new_root(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_new_root_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_not_set_aside_wrt(SubLObject tactic, SubLObject strategy,
			SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_tactic_not_set_aside_wrt_removal(tactic, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_tactic_not_set_aside_wrt_transformation(tactic, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_tactic_not_set_aside_wrt_new_root(tactic, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject set_problem_thrown_away_wrt_transformation(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_thrown_away_wrt_removal(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_removal_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_thrown_away_wrt_new_root(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_new_root_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_thrown_away_wrt(SubLObject problem, SubLObject strategy,
			SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_problem_thrown_away_wrt_removal(problem, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_problem_thrown_away_wrt_transformation(problem, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_problem_thrown_away_wrt_new_root(problem, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(
			SubLObject problem) {
		{
			SubLObject prob = problem;
			SubLObject store = inference_datastructures_problem.problem_store(prob);
			SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
			if (NIL == do_id_index_empty_p(idx, $SKIP)) {
				{
					SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
					SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
					SubLObject inference = NIL;
					while (NIL != id) {
						inference = do_id_index_state_object(idx, $SKIP, id, state_var);
						if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
							if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob,
									inference)) {
								{
									SubLObject inference_var = inference;
									SubLObject set_contents_var = set.do_set_internal(
											inference_datastructures_inference.inference_strategy_set(inference_var));
									SubLObject basis_object = set_contents
											.do_set_contents_basis_object(set_contents_var);
									SubLObject state = NIL;
									for (state = set_contents.do_set_contents_initial_state(basis_object,
											set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
													state); state = set_contents.do_set_contents_update_state(state)) {
										{
											SubLObject strategy = set_contents.do_set_contents_next(basis_object,
													state);
											if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
												set_problem_tactics_recompute_thrown_away_wrt_all_motivations(problem,
														strategy);
											}
										}
									}
								}
							}
						}
						id = do_id_index_next_id(idx, NIL, id, state_var);
						state_var = do_id_index_next_state(idx, NIL, id, state_var);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject set_problem_tactics_recompute_thrown_away_wrt_all_motivations(SubLObject problem,
			SubLObject strategy) {
		{
			SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
			SubLObject tactic = NIL;
			for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
					.rest(), tactic = cdolist_list_var.first()) {
				set_tactic_recompute_thrown_away_wrt_all_motivations(tactic, strategy);
			}
		}
		return NIL;
	}

	public static SubLObject set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations(
			SubLObject problem) {
		{
			SubLObject prob = problem;
			SubLObject store = inference_datastructures_problem.problem_store(prob);
			SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
			if (NIL == do_id_index_empty_p(idx, $SKIP)) {
				{
					SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
					SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
					SubLObject inference = NIL;
					while (NIL != id) {
						inference = do_id_index_state_object(idx, $SKIP, id, state_var);
						if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
							if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob,
									inference)) {
								{
									SubLObject inference_var = inference;
									SubLObject set_contents_var = set.do_set_internal(
											inference_datastructures_inference.inference_strategy_set(inference_var));
									SubLObject basis_object = set_contents
											.do_set_contents_basis_object(set_contents_var);
									SubLObject state = NIL;
									for (state = set_contents.do_set_contents_initial_state(basis_object,
											set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
													state); state = set_contents.do_set_contents_update_state(state)) {
										{
											SubLObject strategy = set_contents.do_set_contents_next(basis_object,
													state);
											if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
												set_problem_tactics_recompute_set_aside_wrt_all_motivations(problem,
														strategy);
											}
										}
									}
								}
							}
						}
						id = do_id_index_next_id(idx, NIL, id, state_var);
						state_var = do_id_index_next_state(idx, NIL, id, state_var);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject set_problem_tactics_recompute_set_aside_wrt_all_motivations(SubLObject problem,
			SubLObject strategy) {
		{
			SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
			SubLObject tactic = NIL;
			for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
					.rest(), tactic = cdolist_list_var.first()) {
				set_tactic_recompute_set_aside_wrt_all_motivations(tactic, strategy);
			}
		}
		return NIL;
	}

	public static SubLObject set_problem_strategic_flags(SubLObject problem, SubLObject strategy, SubLObject flags) {
		SubLTrampolineFile.checkType(flags, FIXNUMP);
		{
			SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
			_csetf_prob_strategic_properties_flags(problem_strategic_properties, flags);
		}
		return flags;
	}

	public static SubLObject set_problem_set_aside_wrt_transformation(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_set_aside_wrt_removal(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_removal_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_set_aside_wrt_new_root(SubLObject problem, SubLObject strategy) {
		return NIL;
	}

	public static SubLObject set_problem_set_aside_wrt(SubLObject problem, SubLObject strategy, SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_problem_set_aside_wrt_removal(problem, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_problem_set_aside_wrt_transformation(problem, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_problem_set_aside_wrt_new_root(problem, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject set_problem_recompute_thrown_away_wrt_transformation(SubLObject problem,
			SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_recompute_thrown_away_wrt_removal(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_removal_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_recompute_thrown_away_wrt_new_root(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_new_root_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(
			SubLObject problem) {
		{
			SubLObject prob = problem;
			SubLObject store = inference_datastructures_problem.problem_store(prob);
			SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
			if (NIL == do_id_index_empty_p(idx, $SKIP)) {
				{
					SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
					SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
					SubLObject inference = NIL;
					while (NIL != id) {
						inference = do_id_index_state_object(idx, $SKIP, id, state_var);
						if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
							if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob,
									inference)) {
								{
									SubLObject inference_var = inference;
									SubLObject set_contents_var = set.do_set_internal(
											inference_datastructures_inference.inference_strategy_set(inference_var));
									SubLObject basis_object = set_contents
											.do_set_contents_basis_object(set_contents_var);
									SubLObject state = NIL;
									for (state = set_contents.do_set_contents_initial_state(basis_object,
											set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
													state); state = set_contents.do_set_contents_update_state(state)) {
										{
											SubLObject strategy = set_contents.do_set_contents_next(basis_object,
													state);
											if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
												set_problem_recompute_thrown_away_wrt_all_motivations(problem,
														strategy);
											}
										}
									}
								}
							}
						}
						id = do_id_index_next_id(idx, NIL, id, state_var);
						state_var = do_id_index_next_state(idx, NIL, id, state_var);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject set_problem_recompute_thrown_away_wrt_all_motivations(SubLObject problem,
			SubLObject strategy) {
		if (NIL != balancing_tactician.balancing_tactician_substrategy_p(strategy)) {
			set_problem_recompute_thrown_away(problem, strategy);
		} else {
			set_problem_recompute_thrown_away_wrt_removal(problem, strategy);
			set_problem_recompute_thrown_away_wrt_transformation(problem, strategy);
			set_problem_recompute_thrown_away_wrt_new_root(problem, strategy);
		}
		return NIL;
	}

	public static SubLObject set_problem_recompute_thrown_away_wrt(SubLObject problem, SubLObject strategy,
			SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_problem_recompute_thrown_away_wrt_removal(problem, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_problem_recompute_thrown_away_wrt_transformation(problem, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_problem_recompute_thrown_away_wrt_new_root(problem, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject set_problem_recompute_set_aside_wrt_transformation(SubLObject problem,
			SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_recompute_set_aside_wrt_removal(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_removal_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_recompute_set_aside_wrt_new_root(SubLObject problem, SubLObject strategy) {
		return NIL;
	}

	public static SubLObject set_problem_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations(
			SubLObject problem) {
		{
			SubLObject prob = problem;
			SubLObject store = inference_datastructures_problem.problem_store(prob);
			SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
			if (NIL == do_id_index_empty_p(idx, $SKIP)) {
				{
					SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
					SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
					SubLObject inference = NIL;
					while (NIL != id) {
						inference = do_id_index_state_object(idx, $SKIP, id, state_var);
						if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
							if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob,
									inference)) {
								{
									SubLObject inference_var = inference;
									SubLObject set_contents_var = set.do_set_internal(
											inference_datastructures_inference.inference_strategy_set(inference_var));
									SubLObject basis_object = set_contents
											.do_set_contents_basis_object(set_contents_var);
									SubLObject state = NIL;
									for (state = set_contents.do_set_contents_initial_state(basis_object,
											set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
													state); state = set_contents.do_set_contents_update_state(state)) {
										{
											SubLObject strategy = set_contents.do_set_contents_next(basis_object,
													state);
											if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
												set_problem_recompute_set_aside_wrt_all_motivations(problem, strategy);
											}
										}
									}
								}
							}
						}
						id = do_id_index_next_id(idx, NIL, id, state_var);
						state_var = do_id_index_next_state(idx, NIL, id, state_var);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject set_problem_recompute_set_aside_wrt_all_motivations(SubLObject problem,
			SubLObject strategy) {
		if (NIL != balancing_tactician.balancing_tactician_substrategy_p(strategy)) {
			set_problem_recompute_set_aside(problem, strategy);
		} else {
			set_problem_recompute_set_aside_wrt_removal(problem, strategy);
			set_problem_recompute_set_aside_wrt_transformation(problem, strategy);
			set_problem_recompute_set_aside_wrt_new_root(problem, strategy);
		}
		return NIL;
	}

	public static SubLObject set_problem_recompute_set_aside_wrt(SubLObject problem, SubLObject strategy,
			SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_problem_recompute_set_aside_wrt_removal(problem, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_problem_recompute_set_aside_wrt_transformation(problem, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_problem_recompute_set_aside_wrt_new_root(problem, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject set_problem_not_thrown_away_wrt_transformation(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_not_thrown_away_wrt_removal(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_removal_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_not_thrown_away_wrt_new_root(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_new_root_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_not_thrown_away_wrt(SubLObject problem, SubLObject strategy,
			SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_problem_not_thrown_away_wrt_removal(problem, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_problem_not_thrown_away_wrt_transformation(problem, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_problem_not_thrown_away_wrt_new_root(problem, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject set_problem_not_set_aside_wrt_transformation(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_transformation_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_not_set_aside_wrt_removal(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_removal_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_not_set_aside_wrt_new_root(SubLObject problem, SubLObject strategy) {
		return NIL;
	}

	public static SubLObject set_problem_not_set_aside_wrt(SubLObject problem, SubLObject strategy,
			SubLObject motivation) {
		{
			SubLObject pcase_var = motivation;
			if (pcase_var.eql($REMOVAL)) {
				return set_problem_not_set_aside_wrt_removal(problem, strategy);
			} else {
				if (pcase_var.eql($TRANSFORMATION)) {
					return set_problem_not_set_aside_wrt_transformation(problem, strategy);
				} else {
					if (pcase_var.eql($NEW_ROOT)) {
						return set_problem_not_set_aside_wrt_new_root(problem, strategy);
					} else {
						return Errors.error($str_alt147$unexpected_motivation__s, motivation);
					}
				}
			}
		}
	}

	public static SubLObject problem_thrown_away_cache_transformation_status(SubLObject problem, SubLObject strategy) {
		return decode_uninterestingness_cache_code(uninterestingness_cache_thrown_away_wrt_transformation_code(
				problem_strategic_flags(problem, strategy)));
	}

	public static SubLObject problem_thrown_away_cache_status_wrt_motivation(SubLObject problem, SubLObject strategy,
			SubLObject motivation) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == $uninterestingness_cache_lookup_enabledP$.getDynamicValue(thread)) {
				return $RECOMPUTE;
			}
			{
				SubLObject pcase_var = motivation;
				if (pcase_var.eql($REMOVAL)) {
					return problem_thrown_away_cache_removal_status(problem, strategy);
				} else {
					if (pcase_var.eql($TRANSFORMATION)) {
						return problem_thrown_away_cache_transformation_status(problem, strategy);
					} else {
						if (pcase_var.eql($NEW_ROOT)) {
							return problem_thrown_away_cache_new_root_status(problem, strategy);
						} else {
							return Errors.error($str_alt147$unexpected_motivation__s, motivation);
						}
					}
				}
			}
		}
	}

	public static SubLObject problem_thrown_away_cache_removal_status(SubLObject problem, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_thrown_away_wrt_removal_code(problem_strategic_flags(problem, strategy)));
	}

	public static SubLObject problem_thrown_away_cache_new_root_status(SubLObject problem, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_thrown_away_wrt_new_root_code(problem_strategic_flags(problem, strategy)));
	}

	public static SubLObject problem_strategic_flags(SubLObject problem, SubLObject strategy) {
		{
			SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
			return prob_strategic_properties_flags(problem_strategic_properties);
		}
	}

	public static SubLObject problem_set_aside_cache_transformation_status(SubLObject problem, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_set_aside_wrt_transformation_code(problem_strategic_flags(problem, strategy)));
	}

	public static SubLObject problem_set_aside_cache_status_wrt_motivation(SubLObject problem, SubLObject strategy,
			SubLObject motivation) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == $uninterestingness_cache_lookup_enabledP$.getDynamicValue(thread)) {
				return $RECOMPUTE;
			}
			{
				SubLObject pcase_var = motivation;
				if (pcase_var.eql($REMOVAL)) {
					return problem_set_aside_cache_removal_status(problem, strategy);
				} else {
					if (pcase_var.eql($TRANSFORMATION)) {
						return problem_set_aside_cache_transformation_status(problem, strategy);
					} else {
						if (pcase_var.eql($NEW_ROOT)) {
							return NIL;
						} else {
							return Errors.error($str_alt147$unexpected_motivation__s, motivation);
						}
					}
				}
			}
		}
	}

	public static SubLObject problem_set_aside_cache_removal_status(SubLObject problem, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_set_aside_wrt_removal_code(problem_strategic_flags(problem, strategy)));
	}

	public static SubLObject problem_set_aside_cache_new_root_status(SubLObject problem, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_set_aside_wrt_new_root_code(problem_strategic_flags(problem, strategy)));
	}

	public static SubLObject prob_strategic_properties_flags(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, PROBLEM_STRATEGIC_PROPERTIES_P);
		return v_object.getField5();
	}

	public static SubLObject encode_uninterestingness_cache_status(SubLObject status) {
		if ($RECOMPUTE == status) {
			return ZERO_INTEGER;
		} else {
			if (T == status) {
				return ONE_INTEGER;
			} else {
				if (NIL == status) {
					return TWO_INTEGER;
				} else {
					return Errors.error($str_alt112$invalid_uninterestingness_cache_s, status);
				}
			}
		}
	}

	public static SubLObject decode_uninterestingness_cache_code(SubLObject code) {
		{
			SubLObject pcase_var = code;
			if (pcase_var.eql(ZERO_INTEGER)) {
				return $RECOMPUTE;
			} else {
				if (pcase_var.eql(ONE_INTEGER)) {
					return T;
				} else {
					if (pcase_var.eql(TWO_INTEGER)) {
						return NIL;
					} else {
						return Errors.error($str_alt111$invalid_uninterestingness_cache_c, code);
					}
				}
			}
		}
	}

	public static SubLObject _csetf_tact_strategic_properties_flags(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, TACTIC_STRATEGIC_PROPERTIES_P);
		return (($tactic_strategic_properties_native) v_object).$flags = (value);
	}

	public static SubLObject _csetf_prob_strategic_properties_flags(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, PROBLEM_STRATEGIC_PROPERTIES_P);
		return (($tactic_strategic_properties_native) v_object).$flags;
	}

	static private final SubLString $str_alt168$ = makeString("");

	public static final SubLSymbol $strategy_type_store$ = makeSymbol("*STRATEGY-TYPE-STORE*");

	// defconstant
	@LispMethod(comment = "defconstant")
	private static final SubLSymbol $uninterestingness_cache_set_aside_byte$ = makeSymbol(
			"*UNINTERESTINGNESS-CACHE-SET-ASIDE-BYTE*");

	// defconstant
	@LispMethod(comment = "defconstant")
	private static final SubLSymbol $uninterestingness_cache_thrown_away_byte$ = makeSymbol(
			"*UNINTERESTINGNESS-CACHE-THROWN-AWAY-BYTE*");

	// defconstant
	@LispMethod(comment = "defconstant")
	private static final SubLSymbol $uninterestingness_cache_set_aside_wrt_new_root_byte$ = makeSymbol(
			"*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-NEW-ROOT-BYTE*");

	// defconstant
	@LispMethod(comment = "defconstant")
	private static final SubLSymbol $uninterestingness_cache_set_aside_wrt_transformation_byte$ = makeSymbol(
			"*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-TRANSFORMATION-BYTE*");

	// defconstant
	@LispMethod(comment = "defconstant")
	private static final SubLSymbol $uninterestingness_cache_set_aside_wrt_removal_byte$ = makeSymbol(
			"*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-REMOVAL-BYTE*");

	// defconstant
	@LispMethod(comment = "defconstant")
	private static final SubLSymbol $uninterestingness_cache_thrown_away_wrt_new_root_byte$ = makeSymbol(
			"*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-NEW-ROOT-BYTE*");

	// defconstant
	@LispMethod(comment = "defconstant")
	private static final SubLSymbol $uninterestingness_cache_thrown_away_wrt_transformation_byte$ = makeSymbol(
			"*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-TRANSFORMATION-BYTE*");

	// defconstant
	@LispMethod(comment = "defconstant")
	private static final SubLSymbol $uninterestingness_cache_thrown_away_wrt_removal_byte$ = makeSymbol(
			"*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-REMOVAL-BYTE*");

	/**
	 * all :recompute
	 */
	// defconstant
	@LispMethod(comment = "all :recompute\ndefconstant")
	private static final SubLSymbol $default_uninterestingness_flags$ = makeSymbol("*DEFAULT-UNINTERESTINGNESS-FLAGS*");

	public static final SubLFile me = new inference_datastructures_strategy();

	public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy";

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dtp_strategy$ = makeSymbol("*DTP-STRATEGY*");

	// defparameter
	@LispMethod(comment = "defparameter")
	private static final SubLSymbol $uninterestingness_cache_lookup_enabledP$ = makeSymbol(
			"*UNINTERESTINGNESS-CACHE-LOOKUP-ENABLED?*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dtp_problem_strategic_properties$ = makeSymbol(
			"*DTP-PROBLEM-STRATEGIC-PROPERTIES*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dtp_tactic_strategic_properties$ = makeSymbol("*DTP-TACTIC-STRATEGIC-PROPERTIES*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $default_uninterestingness_cache_value$ = makeSymbol(
			"*DEFAULT-UNINTERESTINGNESS-CACHE-VALUE*");

	private static final SubLSymbol STRATEGY_P = makeSymbol("STRATEGY-P");

	static private final SubLList $list2 = list(new SubLObject[] { makeSymbol("SUID"), makeSymbol("INFERENCE"),
			makeSymbol("RESULT-UNIQUENESS-CRITERION"), makeSymbol("ACTIVE-PROBLEMS"), makeSymbol("MOTIVATED-PROBLEMS"),
			makeSymbol("SET-ASIDE-PROBLEMS"), makeSymbol("SHOULD-RECONSIDER-SET-ASIDES?"),
			makeSymbol("PRODUCTIVITY-LIMIT"), makeSymbol("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"),
			makeSymbol("PROOF-SPEC"), makeSymbol("PROBLEM-PROOF-SPEC-INDEX"), makeSymbol("PROBLEM-STRATEGIC-INDEX"),
			makeSymbol("MEMOIZATION-STATE"), makeSymbol("STEP-COUNT"), makeSymbol("TYPE"), makeSymbol("DATA") });

	static private final SubLList $list3 = list(new SubLObject[] { $SUID, makeKeyword("INFERENCE"),
			makeKeyword("RESULT-UNIQUENESS-CRITERION"), makeKeyword("ACTIVE-PROBLEMS"),
			makeKeyword("MOTIVATED-PROBLEMS"), makeKeyword("SET-ASIDE-PROBLEMS"),
			makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?"), makeKeyword("PRODUCTIVITY-LIMIT"),
			makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PROOF-SPEC"),
			makeKeyword("PROBLEM-PROOF-SPEC-INDEX"), makeKeyword("PROBLEM-STRATEGIC-INDEX"),
			makeKeyword("MEMOIZATION-STATE"), makeKeyword("STEP-COUNT"), $TYPE, $DATA });

	static private final SubLList $list4 = list(new SubLObject[] { makeSymbol("STRAT-SUID"),
			makeSymbol("STRAT-INFERENCE"), makeSymbol("STRAT-RESULT-UNIQUENESS-CRITERION"),
			makeSymbol("STRAT-ACTIVE-PROBLEMS"), makeSymbol("STRAT-MOTIVATED-PROBLEMS"),
			makeSymbol("STRAT-SET-ASIDE-PROBLEMS"), makeSymbol("STRAT-SHOULD-RECONSIDER-SET-ASIDES?"),
			makeSymbol("STRAT-PRODUCTIVITY-LIMIT"), makeSymbol("STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"),
			makeSymbol("STRAT-PROOF-SPEC"), makeSymbol("STRAT-PROBLEM-PROOF-SPEC-INDEX"),
			makeSymbol("STRAT-PROBLEM-STRATEGIC-INDEX"), makeSymbol("STRAT-MEMOIZATION-STATE"),
			makeSymbol("STRAT-STEP-COUNT"), makeSymbol("STRAT-TYPE"), makeSymbol("STRAT-DATA") });

	static private final SubLList $list5 = list(new SubLObject[] { makeSymbol("_CSETF-STRAT-SUID"),
			makeSymbol("_CSETF-STRAT-INFERENCE"), makeSymbol("_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION"),
			makeSymbol("_CSETF-STRAT-ACTIVE-PROBLEMS"), makeSymbol("_CSETF-STRAT-MOTIVATED-PROBLEMS"),
			makeSymbol("_CSETF-STRAT-SET-ASIDE-PROBLEMS"), makeSymbol("_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?"),
			makeSymbol("_CSETF-STRAT-PRODUCTIVITY-LIMIT"),
			makeSymbol("_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeSymbol("_CSETF-STRAT-PROOF-SPEC"),
			makeSymbol("_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX"), makeSymbol("_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX"),
			makeSymbol("_CSETF-STRAT-MEMOIZATION-STATE"), makeSymbol("_CSETF-STRAT-STEP-COUNT"),
			makeSymbol("_CSETF-STRAT-TYPE"), makeSymbol("_CSETF-STRAT-DATA") });

	private static final SubLSymbol PRINT_STRATEGY = makeSymbol("PRINT-STRATEGY");

	private static final SubLSymbol STRATEGY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol(
			"STRATEGY-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("STRATEGY-P"));

	private static final SubLSymbol STRAT_SUID = makeSymbol("STRAT-SUID");

	private static final SubLSymbol _CSETF_STRAT_SUID = makeSymbol("_CSETF-STRAT-SUID");

	private static final SubLSymbol STRAT_INFERENCE = makeSymbol("STRAT-INFERENCE");

	private static final SubLSymbol _CSETF_STRAT_INFERENCE = makeSymbol("_CSETF-STRAT-INFERENCE");

	private static final SubLSymbol STRAT_RESULT_UNIQUENESS_CRITERION = makeSymbol("STRAT-RESULT-UNIQUENESS-CRITERION");

	private static final SubLSymbol _CSETF_STRAT_RESULT_UNIQUENESS_CRITERION = makeSymbol(
			"_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION");

	private static final SubLSymbol STRAT_ACTIVE_PROBLEMS = makeSymbol("STRAT-ACTIVE-PROBLEMS");

	private static final SubLSymbol _CSETF_STRAT_ACTIVE_PROBLEMS = makeSymbol("_CSETF-STRAT-ACTIVE-PROBLEMS");

	private static final SubLSymbol STRAT_MOTIVATED_PROBLEMS = makeSymbol("STRAT-MOTIVATED-PROBLEMS");

	private static final SubLSymbol _CSETF_STRAT_MOTIVATED_PROBLEMS = makeSymbol("_CSETF-STRAT-MOTIVATED-PROBLEMS");

	private static final SubLSymbol STRAT_SET_ASIDE_PROBLEMS = makeSymbol("STRAT-SET-ASIDE-PROBLEMS");

	private static final SubLSymbol _CSETF_STRAT_SET_ASIDE_PROBLEMS = makeSymbol("_CSETF-STRAT-SET-ASIDE-PROBLEMS");

	private static final SubLSymbol $sym21$STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = makeSymbol(
			"STRAT-SHOULD-RECONSIDER-SET-ASIDES?");

	private static final SubLSymbol $sym22$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = makeSymbol(
			"_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?");

	private static final SubLSymbol STRAT_PRODUCTIVITY_LIMIT = makeSymbol("STRAT-PRODUCTIVITY-LIMIT");

	private static final SubLSymbol _CSETF_STRAT_PRODUCTIVITY_LIMIT = makeSymbol("_CSETF-STRAT-PRODUCTIVITY-LIMIT");

	private static final SubLSymbol STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeSymbol(
			"STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");

	private static final SubLSymbol _CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeSymbol(
			"_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");

	private static final SubLSymbol STRAT_PROOF_SPEC = makeSymbol("STRAT-PROOF-SPEC");

	private static final SubLSymbol _CSETF_STRAT_PROOF_SPEC = makeSymbol("_CSETF-STRAT-PROOF-SPEC");

	private static final SubLSymbol STRAT_PROBLEM_PROOF_SPEC_INDEX = makeSymbol("STRAT-PROBLEM-PROOF-SPEC-INDEX");

	private static final SubLSymbol _CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX = makeSymbol(
			"_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX");

	private static final SubLSymbol STRAT_PROBLEM_STRATEGIC_INDEX = makeSymbol("STRAT-PROBLEM-STRATEGIC-INDEX");

	private static final SubLSymbol _CSETF_STRAT_PROBLEM_STRATEGIC_INDEX = makeSymbol(
			"_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX");

	private static final SubLSymbol STRAT_MEMOIZATION_STATE = makeSymbol("STRAT-MEMOIZATION-STATE");

	private static final SubLSymbol _CSETF_STRAT_MEMOIZATION_STATE = makeSymbol("_CSETF-STRAT-MEMOIZATION-STATE");

	private static final SubLSymbol STRAT_STEP_COUNT = makeSymbol("STRAT-STEP-COUNT");

	private static final SubLSymbol _CSETF_STRAT_STEP_COUNT = makeSymbol("_CSETF-STRAT-STEP-COUNT");

	private static final SubLSymbol STRAT_TYPE = makeSymbol("STRAT-TYPE");

	private static final SubLSymbol _CSETF_STRAT_TYPE = makeSymbol("_CSETF-STRAT-TYPE");

	private static final SubLSymbol STRAT_DATA = makeSymbol("STRAT-DATA");

	private static final SubLSymbol _CSETF_STRAT_DATA = makeSymbol("_CSETF-STRAT-DATA");

	private static final SubLSymbol $RESULT_UNIQUENESS_CRITERION = makeKeyword("RESULT-UNIQUENESS-CRITERION");

	private static final SubLSymbol $SET_ASIDE_PROBLEMS = makeKeyword("SET-ASIDE-PROBLEMS");

	private static final SubLSymbol $kw47$SHOULD_RECONSIDER_SET_ASIDES_ = makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?");

	private static final SubLSymbol $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword(
			"REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");

	private static final SubLSymbol $PROBLEM_PROOF_SPEC_INDEX = makeKeyword("PROBLEM-PROOF-SPEC-INDEX");

	private static final SubLSymbol $PROBLEM_STRATEGIC_INDEX = makeKeyword("PROBLEM-STRATEGIC-INDEX");

	private static final SubLString $str57$Invalid_slot__S_for_construction_ = makeString(
			"Invalid slot ~S for construction function");

	private static final SubLSymbol MAKE_STRATEGY = makeSymbol("MAKE-STRATEGY");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_STRATEGY_METHOD = makeSymbol(
			"VISIT-DEFSTRUCT-OBJECT-STRATEGY-METHOD");

	private static final SubLString $str64$_Invalid_STRATEGY__s_ = makeString("<Invalid STRATEGY ~s>");

	private static final SubLString $str65$__a_STRATEGY__a__a_for_inference_ = makeString(
			"<~a STRATEGY ~a.~a for inference ~a.~a>");

	private static final SubLSymbol SXHASH_STRATEGY_METHOD = makeSymbol("SXHASH-STRATEGY-METHOD");

	private static final SubLSymbol STRATEGY_TYPE_P = makeSymbol("STRATEGY-TYPE-P");

	private static final SubLString $$$strategy_memoization_state = makeString("strategy memoization state");

	private static final SubLSymbol STRATEGY_ACTIVE_PROBLEMS = makeSymbol("STRATEGY-ACTIVE-PROBLEMS");

	private static final SubLSymbol DO_STRATEGY_ACTIVE_PROBLEMS = makeSymbol("DO-STRATEGY-ACTIVE-PROBLEMS");

	private static final SubLSymbol STRATEGY_MOTIVATED_PROBLEMS = makeSymbol("STRATEGY-MOTIVATED-PROBLEMS");

	private static final SubLSymbol DO_STRATEGY_MOTIVATED_PROBLEMS = makeSymbol("DO-STRATEGY-MOTIVATED-PROBLEMS");

	private static final SubLSymbol STRATEGY_SET_ASIDE_PROBLEMS = makeSymbol("STRATEGY-SET-ASIDE-PROBLEMS");

	private static final SubLSymbol DO_STRATEGY_SET_ASIDE_PROBLEMS = makeSymbol("DO-STRATEGY-SET-ASIDE-PROBLEMS");

	private static final SubLSymbol RESULT_UNIQUENESS_CRITERION_P = makeSymbol("RESULT-UNIQUENESS-CRITERION-P");

	private static final SubLSymbol PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");

	private static final SubLSymbol PROOF_SPEC_P = makeSymbol("PROOF-SPEC-P");

	private static final SubLList $list80 = list(
			list(makeSymbol("PROBLEM-VAR"), makeSymbol("STRATEGY"), makeSymbol("&KEY"), makeSymbol("DONE")),
			makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list81 = list($DONE);

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	private static final SubLList $list86 = list(makeSymbol("STRATEGY"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym87$STRATEGY_VAR = makeUninternedSymbol("STRATEGY-VAR");

	private static final SubLSymbol $sym88$STATE_VAR = makeUninternedSymbol("STATE-VAR");

	private static final SubLSymbol STRATEGY_MEMOIZATION_STATE = makeSymbol("STRATEGY-MEMOIZATION-STATE");

	public static final SubLSymbol $current_strategy_wrt_memoization$ = makeSymbol(
			"*CURRENT-STRATEGY-WRT-MEMOIZATION*");

	private static final SubLSymbol WITH_STRATEGY_MEMOIZATION_STATE = makeSymbol("WITH-STRATEGY-MEMOIZATION-STATE");

	private static final SubLSymbol CURRENT_STRATEGY_WRT_MEMOIZATION = makeSymbol("CURRENT-STRATEGY-WRT-MEMOIZATION");

	private static final SubLSymbol VALID_PROBLEM_P = makeSymbol("VALID-PROBLEM-P");

	private static final SubLSymbol STRATEGY_PROPERTY_P = makeSymbol("STRATEGY-PROPERTY-P");

	private static final SubLString $str101$Unexpected_strategy_property__s_w = makeString(
			"Unexpected strategy property ~s with value ~s");

	private static final SubLSymbol STRATEGY_PROPERTIES_P = makeSymbol("STRATEGY-PROPERTIES-P");

	private static final SubLSymbol $SUBSTRATEGY_STRATEGEM_MOTIVATED = makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED");

	private static final SubLList $list104 = list(list(makeSymbol("STRATEGY"), makeSymbol("PROBLEM")),
			makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym105$STRATEGY_VAR = makeUninternedSymbol("STRATEGY-VAR");

	private static final SubLSymbol $sym106$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");

	private static final SubLSymbol STRATEGY_NOTE_PROBLEM_ACTIVE = makeSymbol("STRATEGY-NOTE-PROBLEM-ACTIVE");

	private static final SubLSymbol STRATEGY_NOTE_PROBLEM_INACTIVE = makeSymbol("STRATEGY-NOTE-PROBLEM-INACTIVE");

	private static final SubLSymbol POSSIBLY_REACTIVATE_PROBLEM = makeSymbol("POSSIBLY-REACTIVATE-PROBLEM");

	private static final SubLString $str111$balancing_tactician_does_not_impl = makeString(
			"balancing tactician does not implement ~a");

	private static final SubLString $str112$Unexpected_strategy_type__a = makeString("Unexpected strategy type ~a");

	// private static final SubLSymbol $strategy_type_store$ = makeSymbol("*STRATEGY-TYPE-STORE*");
	// 
	// private static final SubLSymbol STRATEGY_TYPE_PROPERTY_P = makeSymbol("STRATEGY-TYPE-PROPERTY-P");
	// 
	// private static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES = makeSymbol("PROBLEM-STRATEGIC-PROPERTIES");
	// 
	// private static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES_P = makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-P");
	@LispMethod(comment = "private static final SubLSymbol $strategy_type_store$ = makeSymbol(\"*STRATEGY-TYPE-STORE*\");\nprivate static final SubLSymbol STRATEGY_TYPE_PROPERTY_P = makeSymbol(\"STRATEGY-TYPE-PROPERTY-P\");\nprivate static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES = makeSymbol(\"PROBLEM-STRATEGIC-PROPERTIES\");\nprivate static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES_P = makeSymbol(\"PROBLEM-STRATEGIC-PROPERTIES-P\");")
	private static final SubLList $list119 = list(makeSymbol("STATUS"), makeSymbol("TACTIC-STRATEGIC-PROPERTY-INDEX"),
			makeSymbol("POSSIBLE-TACTIC-COUNT"), makeKeyword("FLAGS"), makeSymbol("UNINTERESTINGNESS"));

	private static final SubLList $list120 = list(makeKeyword("STATUS"), makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX"),
			makeKeyword("POSSIBLE-TACTIC-COUNT"), makeKeyword("FLAGS"), makeKeyword("UNINTERESTINGNESS"));

	private static final SubLList $list121 = list(makeSymbol("PROB-STRATEGIC-PROPERTIES-STATUS"),
			makeSymbol("PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX"),
			makeSymbol("PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT"),
			makeSymbol("PROB-STRATEGIC-PROPERTIES-FLAGS"), makeSymbol("PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));

	private static final SubLList $list122 = list(makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS"),
			makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX"),
			makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT"),
			makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-FLAGS"),
			makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));

	// private static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE");
	@LispMethod(comment = "private static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol(\"PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE\");")
	private static final SubLList $list125 = list(makeSymbol("OPTIMIZE-FUNCALL"),
			makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-P"));

	// private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol("PROB-STRATEGIC-PROPERTIES-STATUS");
	// 
	// private static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS");
	// 
	// private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol("PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX");
	// 
	// private static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX");
	// 
	// private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol("PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT");
	// 
	// private static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT");
	@LispMethod(comment = "private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol(\"PROB-STRATEGIC-PROPERTIES-STATUS\");\nprivate static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol(\"_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS\");\nprivate static final SubLSymbol PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol(\"PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX\");\nprivate static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol(\"_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX\");\nprivate static final SubLSymbol PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol(\"PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT\");\nprivate static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol(\"_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT\");")
	private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol(
			"PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");

	private static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol(
			"_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");

	// private static final SubLSymbol $TACTIC_STRATEGIC_PROPERTY_INDEX = makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX");
	// 
	// private static final SubLSymbol $POSSIBLE_TACTIC_COUNT = makeKeyword("POSSIBLE-TACTIC-COUNT");
	@LispMethod(comment = "private static final SubLSymbol $TACTIC_STRATEGIC_PROPERTY_INDEX = makeKeyword(\"TACTIC-STRATEGIC-PROPERTY-INDEX\");\nprivate static final SubLSymbol $POSSIBLE_TACTIC_COUNT = makeKeyword(\"POSSIBLE-TACTIC-COUNT\");")
	private static final SubLSymbol MAKE_PROBLEM_STRATEGIC_PROPERTIES = makeSymbol("MAKE-PROBLEM-STRATEGIC-PROPERTIES");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROBLEM_STRATEGIC_PROPERTIES_METHOD = makeSymbol(
			"VISIT-DEFSTRUCT-OBJECT-PROBLEM-STRATEGIC-PROPERTIES-METHOD");

	// private static final SubLSymbol STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");
	@LispMethod(comment = "private static final SubLSymbol STRATEGIC_CONTEXT_P = makeSymbol(\"STRATEGIC-CONTEXT-P\");")
	private static final SubLString $str146$poking_good_status__s_into_proble = makeString(
			"poking good status ~s into problem ~s wrt strategy ~s");

	private static final SubLSymbol $POSSIBLE_NO_GOOD = makeKeyword("POSSIBLE-NO-GOOD");

	private static final SubLString $str148$_possible_no_good__s_wrt__s = makeString(":possible-no-good ~s wrt ~s");

	private static final SubLSymbol UNINTERESTINGNESS_CACHE_VALUE_P = makeSymbol("UNINTERESTINGNESS-CACHE-VALUE-P");

	// private static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES = makeSymbol("TACTIC-STRATEGIC-PROPERTIES");
	// private static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES_P = makeSymbol("TACTIC-STRATEGIC-PROPERTIES-P");
	@LispMethod(comment = "private static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES = makeSymbol(\"TACTIC-STRATEGIC-PROPERTIES\");\nprivate static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES_P = makeSymbol(\"TACTIC-STRATEGIC-PROPERTIES-P\");")
	private static final SubLList $list156 = list(makeSymbol("PREFERENCE-LEVEL"),
			makeSymbol("PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("PRODUCTIVITY"), makeSymbol("UNINTERESTINGNESS"));

	private static final SubLList $list157 = list(makeKeyword("PREFERENCE-LEVEL"),
			makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), makeKeyword("PRODUCTIVITY"),
			makeKeyword("UNINTERESTINGNESS"));

	private static final SubLList $list158 = list(makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL"),
			makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION"),
			makeSymbol("TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY"),
			makeSymbol("TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));

	private static final SubLList $list159 = list(makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL"),
			makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION"),
			makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY"),
			makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));

	// private static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE");
	@LispMethod(comment = "private static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol(\"TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE\");")
	private static final SubLList $list161 = list(makeSymbol("OPTIMIZE-FUNCALL"),
			makeSymbol("TACTIC-STRATEGIC-PROPERTIES-P"));

	private static final SubLSymbol TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL = makeSymbol(
			"TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL");

	private static final SubLSymbol _CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL = makeSymbol(
			"_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL");

	private static final SubLSymbol TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol(
			"TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION");

	private static final SubLSymbol _CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol(
			"_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION");

	private static final SubLSymbol TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY = makeSymbol(
			"TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY");

	private static final SubLSymbol _CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY = makeSymbol(
			"_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY");

	private static final SubLSymbol TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol(
			"TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");

	private static final SubLSymbol _CSETF_TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol(
			"_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");

	private static final SubLSymbol $PREFERENCE_LEVEL_JUSTIFICATION = makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION");

	private static final SubLSymbol MAKE_TACTIC_STRATEGIC_PROPERTIES = makeSymbol("MAKE-TACTIC-STRATEGIC-PROPERTIES");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TACTIC_STRATEGIC_PROPERTIES_METHOD = makeSymbol(
			"VISIT-DEFSTRUCT-OBJECT-TACTIC-STRATEGIC-PROPERTIES-METHOD");

	private static final SubLString $str175$ = makeString("");

	private static final SubLString $str178$structural_tactic__s_cannot_have_ = makeString(
			"structural tactic ~s cannot have a completeness");

	private static final SubLString $str179$content_tactic__s_cannot_have_a_p = makeString(
			"content tactic ~s cannot have a preference level");

	private static final SubLString $str180$content_tactic__s_cannot_have_a_p = makeString(
			"content tactic ~s cannot have a preference level justification");

	private static final SubLSymbol GENERALIZED_CONJUNCTIVE_TACTIC_P = makeSymbol("GENERALIZED-CONJUNCTIVE-TACTIC-P");

	private static final SubLSymbol PREFERENCE_LEVEL_P = makeSymbol("PREFERENCE-LEVEL-P");

	private static final SubLSymbol UNINTERESTINGNESS_CACHE_CONDITIONS_P = makeSymbol(
			"UNINTERESTINGNESS-CACHE-CONDITIONS-P");

	public static SubLObject strategy_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
		print_strategy(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject strategy_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		inference_datastructures_strategy.print_strategy(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject strategy_p_alt(SubLObject v_object) {
		return v_object.getClass() == $strategy_native.class ? ((SubLObject) (T)) : NIL;
	}

	public static SubLObject strategy_p(final SubLObject v_object) {
		return v_object.getClass() == inference_datastructures_strategy.$strategy_native.class ? T : NIL;
	}

	public static SubLObject strat_suid_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$suid;
	}

	public static SubLObject strat_suid(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField2();
	}

	public static SubLObject strat_inference_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$inference;
	}

	public static SubLObject strat_inference(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField3();
	}

	public static SubLObject strat_result_uniqueness_criterion_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$result_uniqueness_criterion;
	}

	public static SubLObject strat_result_uniqueness_criterion(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField4();
	}

	public static SubLObject strat_active_problems_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$active_problems;
	}

	public static SubLObject strat_active_problems(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField5();
	}

	public static SubLObject strat_motivated_problems_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$motivated_problems;
	}

	public static SubLObject strat_motivated_problems(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField6();
	}

	public static SubLObject strat_set_aside_problems_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$set_aside_problems;
	}

	public static SubLObject strat_set_aside_problems(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField7();
	}

	public static SubLObject strat_should_reconsider_set_asidesP_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$should_reconsider_set_asidesP;
	}

	public static SubLObject strat_should_reconsider_set_asidesP(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField8();
	}

	public static SubLObject strat_productivity_limit_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$productivity_limit;
	}

	public static SubLObject strat_productivity_limit(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField9();
	}

	public static SubLObject strat_removal_backtracking_productivity_limit_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$productivity_limit;
	}

	public static SubLObject strat_removal_backtracking_productivity_limit(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField10();
	}

	public static SubLObject strat_proof_spec_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$proof_spec;
	}

	public static SubLObject strat_proof_spec(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField11();
	}

	public static SubLObject strat_problem_proof_spec_index_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$problem_proof_spec_index;
	}

	public static SubLObject strat_problem_proof_spec_index(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField12();
	}

	public static SubLObject strat_problem_strategic_index_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$problem_strategic_index;
	}

	public static SubLObject strat_problem_strategic_index(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField13();
	}

	public static SubLObject strat_memoization_state_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$memoization_state;
	}

	public static SubLObject strat_memoization_state(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField14();
	}

	public static SubLObject strat_step_count(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField15();
	}

	public static SubLObject strat_type_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$type;
	}

	public static SubLObject strat_type(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField16();
	}

	public static SubLObject strat_data_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$data;
	}

	public static SubLObject strat_data(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.getField17();
	}

	public static SubLObject _csetf_strat_suid_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$suid = (value);
	}

	public static SubLObject _csetf_strat_suid(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_strat_inference_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$inference = (value);
	}

	public static SubLObject _csetf_strat_inference(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static SubLObject _csetf_strat_result_uniqueness_criterion_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$result_uniqueness_criterion = (value);
	}

	public static SubLObject _csetf_strat_result_uniqueness_criterion(final SubLObject v_object,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField4(value);
	}

	public static SubLObject _csetf_strat_active_problems_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$active_problems = (value);
	}

	public static SubLObject _csetf_strat_active_problems(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField5(value);
	}

	public static SubLObject _csetf_strat_motivated_problems_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$motivated_problems = (value);
	}

	public static SubLObject _csetf_strat_motivated_problems(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField6(value);
	}

	public static SubLObject _csetf_strat_set_aside_problems_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$set_aside_problems = (value);
	}

	public static SubLObject _csetf_strat_set_aside_problems(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField7(value);
	}

	public static SubLObject _csetf_strat_should_reconsider_set_asidesP_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$should_reconsider_set_asidesP = (value);
	}

	public static SubLObject _csetf_strat_should_reconsider_set_asidesP(final SubLObject v_object,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField8(value);
	}

	public static SubLObject _csetf_strat_productivity_limit_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$productivity_limit = (value);
	}

	public static SubLObject _csetf_strat_productivity_limit(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField9(value);
	}

	public static SubLObject _csetf_strat_removal_backtracking_productivity_limit_alt(SubLObject v_object,
			SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$productivity_limit = (value);
	}

	public static SubLObject _csetf_strat_removal_backtracking_productivity_limit(final SubLObject v_object,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField10(value);
	}

	public static SubLObject _csetf_strat_proof_spec_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$proof_spec = (value);
	}

	public static SubLObject _csetf_strat_proof_spec(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField11(value);
	}

	public static SubLObject _csetf_strat_problem_proof_spec_index_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$problem_proof_spec_index = (value);
	}

	public static SubLObject _csetf_strat_problem_proof_spec_index(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField12(value);
	}

	public static SubLObject _csetf_strat_problem_strategic_index_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$problem_strategic_index = (value);
	}

	public static SubLObject _csetf_strat_problem_strategic_index(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField13(value);
	}

	public static SubLObject _csetf_strat_memoization_state_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$memoization_state = (value);
	}

	public static SubLObject _csetf_strat_memoization_state(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField14(value);
	}

	public static SubLObject _csetf_strat_step_count(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField15(value);
	}

	public static SubLObject _csetf_strat_type_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$type = (value);
	}

	public static SubLObject _csetf_strat_type(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField16(value);
	}

	public static SubLObject _csetf_strat_data_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, inference_datastructures_strategy.STRATEGY_P);
		return (($strategy_native) v_object).$data = (value);
	}

	public static SubLObject _csetf_strat_data(final SubLObject v_object, final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(v_object) : "! inference_datastructures_strategy.strategy_p(v_object) "
						+ "inference_datastructures_strategy.strategy_p error :" + v_object;
		return v_object.setField17(value);
	}

	public static SubLObject make_strategy_alt(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		{
			SubLObject v_new = new $strategy_native();
			SubLObject next = NIL;
			for (next = arglist; NIL != next; next = cddr(next)) {
				{
					SubLObject current_arg = next.first();
					SubLObject current_value = cadr(next);
					SubLObject pcase_var = current_arg;
					if (pcase_var.eql($SUID)) {
						_csetf_strat_suid(v_new, current_value);
					} else {
						if (pcase_var.eql($INFERENCE)) {
							_csetf_strat_inference(v_new, current_value);
						} else {
							if (pcase_var.eql($RESULT_UNIQUENESS_CRITERION)) {
								_csetf_strat_result_uniqueness_criterion(v_new, current_value);
							} else {
								if (pcase_var.eql($ACTIVE_PROBLEMS)) {
									_csetf_strat_active_problems(v_new, current_value);
								} else {
									if (pcase_var.eql($MOTIVATED_PROBLEMS)) {
										_csetf_strat_motivated_problems(v_new, current_value);
									} else {
										if (pcase_var.eql($SET_ASIDE_PROBLEMS)) {
											_csetf_strat_set_aside_problems(v_new, current_value);
										} else {
											if (pcase_var.eql($kw44$SHOULD_RECONSIDER_SET_ASIDES_)) {
												_csetf_strat_should_reconsider_set_asidesP(v_new, current_value);
											} else {
												if (pcase_var.eql($PRODUCTIVITY_LIMIT)) {
													_csetf_strat_productivity_limit(v_new, current_value);
												} else {
													if (pcase_var.eql($REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
														_csetf_strat_removal_backtracking_productivity_limit(v_new,
																current_value);
													} else {
														if (pcase_var.eql($PROOF_SPEC)) {
															_csetf_strat_proof_spec(v_new, current_value);
														} else {
															if (pcase_var.eql($PROBLEM_PROOF_SPEC_INDEX)) {
																_csetf_strat_problem_proof_spec_index(v_new,
																		current_value);
															} else {
																if (pcase_var.eql($PROBLEM_STRATEGIC_INDEX)) {
																	_csetf_strat_problem_strategic_index(v_new,
																			current_value);
																} else {
																	if (pcase_var.eql($MEMOIZATION_STATE)) {
																		_csetf_strat_memoization_state(v_new,
																				current_value);
																	} else {
																		if (pcase_var.eql($TYPE)) {
																			_csetf_strat_type(v_new, current_value);
																		} else {
																			if (pcase_var.eql($DATA)) {
																				_csetf_strat_data(v_new, current_value);
																			} else {
																				Errors.error(
																						$str_alt53$Invalid_slot__S_for_construction_,
																						current_arg);
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			return v_new;
		}
	}

	public static SubLObject make_strategy(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new inference_datastructures_strategy.$strategy_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($SUID)) {
				inference_datastructures_strategy._csetf_strat_suid(v_new, current_value);
			} else if (pcase_var.eql($INFERENCE)) {
				inference_datastructures_strategy._csetf_strat_inference(v_new, current_value);
			} else if (pcase_var.eql(inference_datastructures_strategy.$RESULT_UNIQUENESS_CRITERION)) {
				inference_datastructures_strategy._csetf_strat_result_uniqueness_criterion(v_new, current_value);
			} else if (pcase_var.eql($ACTIVE_PROBLEMS)) {
				inference_datastructures_strategy._csetf_strat_active_problems(v_new, current_value);
			} else if (pcase_var.eql($MOTIVATED_PROBLEMS)) {
				inference_datastructures_strategy._csetf_strat_motivated_problems(v_new, current_value);
			} else if (pcase_var.eql(inference_datastructures_strategy.$SET_ASIDE_PROBLEMS)) {
				inference_datastructures_strategy._csetf_strat_set_aside_problems(v_new, current_value);
			} else if (pcase_var.eql(inference_datastructures_strategy.$kw47$SHOULD_RECONSIDER_SET_ASIDES_)) {
				inference_datastructures_strategy._csetf_strat_should_reconsider_set_asidesP(v_new, current_value);
			} else if (pcase_var.eql($PRODUCTIVITY_LIMIT)) {
				inference_datastructures_strategy._csetf_strat_productivity_limit(v_new, current_value);
			} else if (pcase_var.eql(inference_datastructures_strategy.$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
				inference_datastructures_strategy._csetf_strat_removal_backtracking_productivity_limit(v_new,
						current_value);
			} else if (pcase_var.eql($PROOF_SPEC)) {
				inference_datastructures_strategy._csetf_strat_proof_spec(v_new, current_value);
			} else if (pcase_var.eql(inference_datastructures_strategy.$PROBLEM_PROOF_SPEC_INDEX)) {
				inference_datastructures_strategy._csetf_strat_problem_proof_spec_index(v_new, current_value);
			} else if (pcase_var.eql(inference_datastructures_strategy.$PROBLEM_STRATEGIC_INDEX)) {
				inference_datastructures_strategy._csetf_strat_problem_strategic_index(v_new, current_value);
			} else if (pcase_var.eql($MEMOIZATION_STATE)) {
				inference_datastructures_strategy._csetf_strat_memoization_state(v_new, current_value);
			} else if (pcase_var.eql($STEP_COUNT)) {
				inference_datastructures_strategy._csetf_strat_step_count(v_new, current_value);
			} else if (pcase_var.eql($TYPE)) {
				inference_datastructures_strategy._csetf_strat_type(v_new, current_value);
			} else if (pcase_var.eql($DATA)) {
				inference_datastructures_strategy._csetf_strat_data(v_new, current_value);
			} else {
				Errors.error(inference_datastructures_strategy.$str57$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_strategy(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, inference_datastructures_strategy.MAKE_STRATEGY, SIXTEEN_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $SUID, inference_datastructures_strategy.strat_suid(obj));
		funcall(visitor_fn, obj, $SLOT, $INFERENCE, inference_datastructures_strategy.strat_inference(obj));
		funcall(visitor_fn, obj, $SLOT, inference_datastructures_strategy.$RESULT_UNIQUENESS_CRITERION,
				inference_datastructures_strategy.strat_result_uniqueness_criterion(obj));
		funcall(visitor_fn, obj, $SLOT, $ACTIVE_PROBLEMS, inference_datastructures_strategy.strat_active_problems(obj));
		funcall(visitor_fn, obj, $SLOT, $MOTIVATED_PROBLEMS,
				inference_datastructures_strategy.strat_motivated_problems(obj));
		funcall(visitor_fn, obj, $SLOT, inference_datastructures_strategy.$SET_ASIDE_PROBLEMS,
				inference_datastructures_strategy.strat_set_aside_problems(obj));
		funcall(visitor_fn, obj, $SLOT, inference_datastructures_strategy.$kw47$SHOULD_RECONSIDER_SET_ASIDES_,
				inference_datastructures_strategy.strat_should_reconsider_set_asidesP(obj));
		funcall(visitor_fn, obj, $SLOT, $PRODUCTIVITY_LIMIT,
				inference_datastructures_strategy.strat_productivity_limit(obj));
		funcall(visitor_fn, obj, $SLOT, inference_datastructures_strategy.$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT,
				inference_datastructures_strategy.strat_removal_backtracking_productivity_limit(obj));
		funcall(visitor_fn, obj, $SLOT, $PROOF_SPEC, inference_datastructures_strategy.strat_proof_spec(obj));
		funcall(visitor_fn, obj, $SLOT, inference_datastructures_strategy.$PROBLEM_PROOF_SPEC_INDEX,
				inference_datastructures_strategy.strat_problem_proof_spec_index(obj));
		funcall(visitor_fn, obj, $SLOT, inference_datastructures_strategy.$PROBLEM_STRATEGIC_INDEX,
				inference_datastructures_strategy.strat_problem_strategic_index(obj));
		funcall(visitor_fn, obj, $SLOT, $MEMOIZATION_STATE,
				inference_datastructures_strategy.strat_memoization_state(obj));
		funcall(visitor_fn, obj, $SLOT, $STEP_COUNT, inference_datastructures_strategy.strat_step_count(obj));
		funcall(visitor_fn, obj, $SLOT, $TYPE, inference_datastructures_strategy.strat_type(obj));
		funcall(visitor_fn, obj, $SLOT, $DATA, inference_datastructures_strategy.strat_data(obj));
		funcall(visitor_fn, obj, $END, inference_datastructures_strategy.MAKE_STRATEGY, SIXTEEN_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_strategy_method(final SubLObject obj, final SubLObject visitor_fn) {
		return inference_datastructures_strategy.visit_defstruct_strategy(obj, visitor_fn);
	}

	public static SubLObject valid_strategy_p_alt(SubLObject v_object) {
		return makeBoolean((NIL != strategy_p(v_object)) && (NIL == strategy_invalid_p(v_object)));
	}

	public static SubLObject valid_strategy_p(final SubLObject v_object) {
		return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(v_object))
				&& (NIL == inference_datastructures_strategy.strategy_invalid_p(v_object)));
	}

	public static SubLObject strategy_invalid_p_alt(SubLObject strategy) {
		return eq($FREE, strategy_type(strategy));
	}

	public static SubLObject strategy_invalid_p(final SubLObject strategy) {
		return eq($FREE, inference_datastructures_strategy.strategy_type(strategy));
	}

	public static SubLObject print_strategy_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
		if (NIL != strategy_invalid_p(v_object)) {
			format(stream, $str_alt55$_Invalid_STRATEGY__s_, strat_suid(v_object));
		} else {
			{
				SubLObject strategy_type = strategy_type(v_object);
				SubLObject strategy_id = strategy_suid(v_object);
				SubLObject inference = strategy_inference(v_object);
				SubLObject inference_id = (NIL != inference)
						? ((SubLObject) (inference_datastructures_inference.inference_suid(inference)))
						: NIL;
				SubLObject store = (NIL != inference)
						? ((SubLObject) (inference_datastructures_inference.inference_problem_store(inference)))
						: NIL;
				SubLObject store_id = (NIL != store)
						? ((SubLObject) (inference_datastructures_problem_store.problem_store_suid(store)))
						: NIL;
				format(stream, $str_alt56$__a_STRATEGY__a__a_for_inference_,
						new SubLObject[] { strategy_type, store_id, strategy_id, store_id, inference_id });
			}
		}
		return NIL;
	}

	public static SubLObject print_strategy(final SubLObject v_object, final SubLObject stream,
			final SubLObject depth) {
		if (NIL != inference_datastructures_strategy.strategy_invalid_p(v_object)) {
			format(stream, inference_datastructures_strategy.$str64$_Invalid_STRATEGY__s_,
					inference_datastructures_strategy.strat_suid(v_object));
		} else {
			final SubLObject strategy_type = inference_datastructures_strategy.strategy_type(v_object);
			final SubLObject strategy_id = inference_datastructures_strategy.strategy_suid(v_object);
			final SubLObject inference = inference_datastructures_strategy.strategy_inference(v_object);
			final SubLObject inference_id = (NIL != inference)
					? inference_datastructures_inference.inference_suid(inference)
					: NIL;
			final SubLObject store = (NIL != inference)
					? inference_datastructures_inference.inference_problem_store(inference)
					: NIL;
			final SubLObject store_id = (NIL != store)
					? inference_datastructures_problem_store.problem_store_suid(store)
					: NIL;
			format(stream, inference_datastructures_strategy.$str65$__a_STRATEGY__a__a_for_inference_,
					new SubLObject[] { strategy_type, store_id, strategy_id, store_id, inference_id });
		}
		return NIL;
	}

	public static SubLObject sxhash_strategy_method_alt(SubLObject v_object) {
		return strat_suid(v_object);
	}

	public static SubLObject sxhash_strategy_method(final SubLObject v_object) {
		return inference_datastructures_strategy.strat_suid(v_object);
	}

	public static SubLObject new_strategy_alt(SubLObject type, SubLObject inference) {
		SubLTrampolineFile.checkType(type, STRATEGY_TYPE_P);
		SubLTrampolineFile.checkType(inference, INFERENCE_P);
		{
			SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
			SubLObject suid = inference_datastructures_problem_store.problem_store_new_strategy_id(store);
			SubLObject strategy = make_strategy(UNPROVIDED);
			_csetf_strat_suid(strategy, suid);
			_csetf_strat_inference(strategy, inference);
			_csetf_strat_result_uniqueness_criterion(strategy, NIL);
			_csetf_strat_active_problems(strategy, set.new_set(symbol_function(EQ), UNPROVIDED));
			_csetf_strat_motivated_problems(strategy, set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ)));
			_csetf_strat_set_aside_problems(strategy, set.new_set(symbol_function(EQ), UNPROVIDED));
			_csetf_strat_problem_proof_spec_index(strategy, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
			_csetf_strat_should_reconsider_set_asidesP(strategy, NIL);
			_csetf_strat_productivity_limit(strategy,
					inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue());
			_csetf_strat_removal_backtracking_productivity_limit(strategy,
					inference_datastructures_enumerated_types.$default_removal_backtracking_productivity_limit$
							.getGlobalValue());
			_csetf_strat_proof_spec(strategy,
					inference_datastructures_enumerated_types.$default_proof_spec$.getGlobalValue());
			_csetf_strat_problem_strategic_index(strategy,
					make_hash_table(ONE_INTEGER, symbol_function(EQ), UNPROVIDED));
			_csetf_strat_memoization_state(strategy,
					memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
			_csetf_strat_type(strategy, type);
			_csetf_strat_data(strategy, NIL);
			{
				SubLObject subconstructor = strategy_type_property(type, $CONSTRUCTOR);
				funcall(subconstructor, strategy);
			}
			inference_datastructures_problem_store.add_problem_store_strategy(store, strategy);
			inference_datastructures_inference.add_inference_strategy(inference, strategy);
			return strategy;
		}
	}

	public static SubLObject new_strategy(final SubLObject type, final SubLObject inference) {
		assert NIL != inference_datastructures_strategy
				.strategy_type_p(type) : "! inference_datastructures_strategy.strategy_type_p(type) "
						+ ("inference_datastructures_strategy.strategy_type_p(type) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_type_p(type) ")
						+ type;
		assert NIL != inference_datastructures_inference
				.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) "
						+ ("inference_datastructures_inference.inference_p(inference) "
								+ "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ")
						+ inference;
		final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
		final SubLObject suid = inference_datastructures_problem_store.problem_store_new_strategy_id(store);
		final SubLObject strategy = inference_datastructures_strategy.make_strategy(UNPROVIDED);
		inference_datastructures_strategy._csetf_strat_suid(strategy, suid);
		inference_datastructures_strategy._csetf_strat_inference(strategy, inference);
		inference_datastructures_strategy._csetf_strat_result_uniqueness_criterion(strategy, NIL);
		inference_datastructures_strategy._csetf_strat_active_problems(strategy,
				set.new_set(symbol_function(EQ), UNPROVIDED));
		inference_datastructures_strategy._csetf_strat_motivated_problems(strategy,
				set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ)));
		inference_datastructures_strategy._csetf_strat_set_aside_problems(strategy,
				set.new_set(symbol_function(EQ), UNPROVIDED));
		inference_datastructures_strategy._csetf_strat_problem_proof_spec_index(strategy,
				dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		inference_datastructures_strategy._csetf_strat_should_reconsider_set_asidesP(strategy, NIL);
		inference_datastructures_strategy._csetf_strat_productivity_limit(strategy,
				inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue());
		inference_datastructures_strategy._csetf_strat_removal_backtracking_productivity_limit(strategy,
				inference_datastructures_enumerated_types.$default_removal_backtracking_productivity_limit$
						.getGlobalValue());
		inference_datastructures_strategy._csetf_strat_proof_spec(strategy,
				inference_datastructures_enumerated_types.$default_proof_spec$.getGlobalValue());
		inference_datastructures_strategy._csetf_strat_problem_strategic_index(strategy,
				make_hash_table(ONE_INTEGER, symbol_function(EQ), UNPROVIDED));
		inference_datastructures_strategy._csetf_strat_memoization_state(strategy,
				memoization_state.new_memoization_state(inference_datastructures_strategy.$$$strategy_memoization_state,
						UNPROVIDED, UNPROVIDED, UNPROVIDED));
		inference_datastructures_strategy._csetf_strat_step_count(strategy, ZERO_INTEGER);
		inference_datastructures_strategy._csetf_strat_type(strategy, type);
		inference_datastructures_strategy._csetf_strat_data(strategy, NIL);
		final SubLObject subconstructor = inference_datastructures_strategy.strategy_type_property(type, $CONSTRUCTOR);
		funcall(subconstructor, strategy);
		inference_datastructures_problem_store.add_problem_store_strategy(store, strategy);
		inference_datastructures_inference.add_inference_strategy(inference, strategy);
		return strategy;
	}

	public static SubLObject destroy_strategy_alt(SubLObject strategy) {
		if (NIL != valid_strategy_p(strategy)) {
			note_strategy_invalid(strategy);
			inference_datastructures_problem_store.remove_problem_store_strategy(strategy_problem_store(strategy),
					strategy);
			inference_datastructures_inference.remove_inference_strategy(strategy_inference(strategy), strategy);
			return destroy_strategy_int(strategy);
		}
		return NIL;
	}

	public static SubLObject destroy_strategy(final SubLObject strategy) {
		if (NIL != inference_datastructures_strategy.valid_strategy_p(strategy)) {
			inference_datastructures_strategy.note_strategy_invalid(strategy);
			inference_datastructures_problem_store.remove_problem_store_strategy(
					inference_datastructures_strategy.strategy_problem_store(strategy), strategy);
			inference_datastructures_inference.remove_inference_strategy(
					inference_datastructures_strategy.strategy_inference(strategy), strategy);
			return inference_datastructures_strategy.destroy_strategy_int(strategy);
		}
		return NIL;
	}

	public static SubLObject destroy_problem_store_strategy_alt(SubLObject strategy) {
		if (NIL != valid_strategy_p(strategy)) {
			note_strategy_invalid(strategy);
			return destroy_strategy_int(strategy);
		}
		return NIL;
	}

	public static SubLObject destroy_problem_store_strategy(final SubLObject strategy) {
		if (NIL != inference_datastructures_strategy.valid_strategy_p(strategy)) {
			inference_datastructures_strategy.note_strategy_invalid(strategy);
			return inference_datastructures_strategy.destroy_strategy_int(strategy);
		}
		return NIL;
	}

	public static SubLObject destroy_inference_strategy_alt(SubLObject strategy) {
		if (NIL != valid_strategy_p(strategy)) {
			note_strategy_invalid(strategy);
			inference_datastructures_problem_store.remove_problem_store_strategy(strategy_problem_store(strategy),
					strategy);
			return destroy_strategy_int(strategy);
		}
		return NIL;
	}

	public static SubLObject destroy_inference_strategy(final SubLObject strategy) {
		if (NIL != inference_datastructures_strategy.valid_strategy_p(strategy)) {
			inference_datastructures_strategy.note_strategy_invalid(strategy);
			inference_datastructures_problem_store.remove_problem_store_strategy(
					inference_datastructures_strategy.strategy_problem_store(strategy), strategy);
			return inference_datastructures_strategy.destroy_strategy_int(strategy);
		}
		return NIL;
	}

	public static SubLObject destroy_strategy_int_alt(SubLObject strategy) {
		_csetf_strat_data(strategy, $FREE);
		_csetf_strat_proof_spec(strategy, $FREE);
		_csetf_strat_removal_backtracking_productivity_limit(strategy, $FREE);
		_csetf_strat_productivity_limit(strategy, $FREE);
		_csetf_strat_should_reconsider_set_asidesP(strategy, $FREE);
		memoization_state.clear_all_memoization(strategy_memoization_state(strategy));
		_csetf_strat_memoization_state(strategy, $FREE);
		dictionary.clear_dictionary(strat_problem_proof_spec_index(strategy));
		_csetf_strat_problem_proof_spec_index(strategy, $FREE);
		clrhash(strat_problem_strategic_index(strategy));
		_csetf_strat_problem_strategic_index(strategy, $FREE);
		set.clear_set(strat_set_aside_problems(strategy));
		_csetf_strat_set_aside_problems(strategy, $FREE);
		set.clear_set(strat_active_problems(strategy));
		_csetf_strat_active_problems(strategy, $FREE);
		set_contents.clear_set_contents(strat_motivated_problems(strategy));
		_csetf_strat_motivated_problems(strategy, $FREE);
		_csetf_strat_result_uniqueness_criterion(strategy, $FREE);
		_csetf_strat_inference(strategy, $FREE);
		return NIL;
	}

	public static SubLObject destroy_strategy_int(final SubLObject strategy) {
		inference_datastructures_strategy._csetf_strat_data(strategy, $FREE);
		inference_datastructures_strategy._csetf_strat_proof_spec(strategy, $FREE);
		inference_datastructures_strategy._csetf_strat_removal_backtracking_productivity_limit(strategy, $FREE);
		inference_datastructures_strategy._csetf_strat_productivity_limit(strategy, $FREE);
		inference_datastructures_strategy._csetf_strat_should_reconsider_set_asidesP(strategy, $FREE);
		memoization_state.clear_all_memoization(inference_datastructures_strategy.strategy_memoization_state(strategy));
		inference_datastructures_strategy._csetf_strat_memoization_state(strategy, $FREE);
		dictionary.clear_dictionary(inference_datastructures_strategy.strat_problem_proof_spec_index(strategy));
		inference_datastructures_strategy._csetf_strat_problem_proof_spec_index(strategy, $FREE);
		clrhash(inference_datastructures_strategy.strat_problem_strategic_index(strategy));
		inference_datastructures_strategy._csetf_strat_problem_strategic_index(strategy, $FREE);
		set.clear_set(inference_datastructures_strategy.strat_set_aside_problems(strategy));
		inference_datastructures_strategy._csetf_strat_set_aside_problems(strategy, $FREE);
		set.clear_set(inference_datastructures_strategy.strat_active_problems(strategy));
		inference_datastructures_strategy._csetf_strat_active_problems(strategy, $FREE);
		set_contents.clear_set_contents(inference_datastructures_strategy.strat_motivated_problems(strategy));
		inference_datastructures_strategy._csetf_strat_motivated_problems(strategy, $FREE);
		inference_datastructures_strategy._csetf_strat_result_uniqueness_criterion(strategy, $FREE);
		inference_datastructures_strategy._csetf_strat_inference(strategy, $FREE);
		return NIL;
	}

	public static SubLObject note_strategy_invalid_alt(SubLObject strategy) {
		_csetf_strat_type(strategy, $FREE);
		return strategy;
	}

	public static SubLObject note_strategy_invalid(final SubLObject strategy) {
		inference_datastructures_strategy._csetf_strat_type(strategy, $FREE);
		return strategy;
	}

	public static SubLObject remove_strategy_problem_alt(SubLObject strategy, SubLObject problem) {
		strategy_note_problem_inactive(strategy, problem);
		strategy_note_problem_unmotivated(strategy, problem);
		strategy_clear_problem_set_aside(strategy, problem);
		remove_problem_strategic_properties(problem, strategy);
		return NIL;
	}

	public static SubLObject remove_strategy_problem(final SubLObject strategy, final SubLObject problem) {
		inference_datastructures_strategy.strategy_note_problem_inactive(strategy, problem);
		inference_datastructures_strategy.strategy_note_problem_unmotivated(strategy, problem);
		inference_datastructures_strategy.strategy_clear_problem_set_aside(strategy, problem);
		inference_datastructures_strategy.remove_problem_strategic_properties(problem, strategy);
		return NIL;
	}

	public static SubLObject strategy_suid_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_suid(strategy);
	}

	public static SubLObject strategy_suid(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_suid(strategy);
	}

	public static SubLObject strategy_inference_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_inference(strategy);
	}

	public static SubLObject strategy_inference(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_inference(strategy);
	}

	public static SubLObject strategy_local_result_uniqueness_criterion_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_result_uniqueness_criterion(strategy);
	}

	public static SubLObject strategy_local_result_uniqueness_criterion(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_result_uniqueness_criterion(strategy);
	}

	public static SubLObject strategy_problem_strategic_index_alt(SubLObject strategy) {
		return strat_problem_strategic_index(strategy);
	}

	public static SubLObject strategy_problem_strategic_index(final SubLObject strategy) {
		return inference_datastructures_strategy.strat_problem_strategic_index(strategy);
	}

	public static SubLObject strategy_type_alt(SubLObject strategy) {
		return strat_type(strategy);
	}

	public static SubLObject strategy_type(final SubLObject strategy) {
		return inference_datastructures_strategy.strat_type(strategy);
	}

	public static SubLObject strategy_data_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_data(strategy);
	}

	public static SubLObject strategy_data(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_data(strategy);
	}

	public static SubLObject strategy_active_problems_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_active_problems(strategy);
	}

	public static SubLObject strategy_active_problems(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_active_problems(strategy);
	}

	public static SubLObject strategy_motivated_problems_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_motivated_problems(strategy);
	}

	public static SubLObject strategy_motivated_problems(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_motivated_problems(strategy);
	}

	public static SubLObject strategy_set_aside_problems_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_set_aside_problems(strategy);
	}

	public static SubLObject strategy_set_aside_problems(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_set_aside_problems(strategy);
	}

	public static SubLObject strategy_should_reconsider_set_asidesP_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_should_reconsider_set_asidesP(strategy);
	}

	public static SubLObject strategy_should_reconsider_set_asidesP(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_should_reconsider_set_asidesP(strategy);
	}

	/**
	 *
	 *
	 * @return productivity-p
	If a tactic's productivity meets or exceeds this limit, it will be
	ignored instead of executed.
	 */
	@LispMethod(comment = "@return productivity-p\r\nIf a tactic\'s productivity meets or exceeds this limit, it will be\r\nignored instead of executed.")
	public static SubLObject strategy_productivity_limit_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_productivity_limit(strategy);
	}

	/**
	 *
	 *
	 * @return productivity-p
	If a tactic's productivity meets or exceeds this limit, it will be
	ignored instead of executed.
	 */
	@LispMethod(comment = "@return productivity-p\r\nIf a tactic\'s productivity meets or exceeds this limit, it will be\r\nignored instead of executed.")
	public static SubLObject strategy_productivity_limit(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_productivity_limit(strategy);
	}

	/**
	 *
	 *
	 * @return productivity-p
	If a tactic's productivity meets or exceeds this limit, it will not be
	considered for removal backtracking.
	 */
	@LispMethod(comment = "@return productivity-p\r\nIf a tactic\'s productivity meets or exceeds this limit, it will not be\r\nconsidered for removal backtracking.")
	public static SubLObject strategy_removal_backtracking_productivity_limit_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_removal_backtracking_productivity_limit(strategy);
	}

	/**
	 *
	 *
	 * @return productivity-p
	If a tactic's productivity meets or exceeds this limit, it will not be
	considered for removal backtracking.
	 */
	@LispMethod(comment = "@return productivity-p\r\nIf a tactic\'s productivity meets or exceeds this limit, it will not be\r\nconsidered for removal backtracking.")
	public static SubLObject strategy_removal_backtracking_productivity_limit(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_removal_backtracking_productivity_limit(strategy);
	}

	/**
	 *
	 *
	 * @return proof-spec-p
	The proof spec that this strategy is allowed to apply.
	 */
	@LispMethod(comment = "@return proof-spec-p\r\nThe proof spec that this strategy is allowed to apply.")
	public static SubLObject strategy_proof_spec_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_proof_spec(strategy);
	}

	/**
	 *
	 *
	 * @return proof-spec-p
	The proof spec that this strategy is allowed to apply.
	 */
	@LispMethod(comment = "@return proof-spec-p\r\nThe proof spec that this strategy is allowed to apply.")
	public static SubLObject strategy_proof_spec(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_proof_spec(strategy);
	}

	/**
	 *
	 *
	 * @return #'EQ dictionary of problem-p -> proof-spec-p
	 */
	@LispMethod(comment = "@return #\'EQ dictionary of problem-p -> proof-spec-p")
	public static SubLObject strategy_problem_proof_spec_index_alt(SubLObject strategy) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		return strat_problem_proof_spec_index(strategy);
	}

	/**
	 *
	 *
	 * @return #'EQ dictionary of problem-p -> proof-spec-p
	 */
	@LispMethod(comment = "@return #\'EQ dictionary of problem-p -> proof-spec-p")
	public static SubLObject strategy_problem_proof_spec_index(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_problem_proof_spec_index(strategy);
	}

	public static SubLObject strategy_step_count(final SubLObject strategy) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		return inference_datastructures_strategy.strat_step_count(strategy);
	}

	public static SubLObject set_strategy_result_uniqueness_criterion_alt(SubLObject strategy,
			SubLObject result_uniqueness_criterion) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		SubLTrampolineFile.checkType(result_uniqueness_criterion, RESULT_UNIQUENESS_CRITERION_P);
		_csetf_strat_result_uniqueness_criterion(strategy, result_uniqueness_criterion);
		return strategy;
	}

	public static SubLObject set_strategy_result_uniqueness_criterion(final SubLObject strategy,
			final SubLObject result_uniqueness_criterion) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		assert NIL != inference_datastructures_enumerated_types.result_uniqueness_criterion_p(
				result_uniqueness_criterion) : "! inference_datastructures_enumerated_types.result_uniqueness_criterion_p(result_uniqueness_criterion) "
						+ ("inference_datastructures_enumerated_types.result_uniqueness_criterion_p(result_uniqueness_criterion) "
								+ "CommonSymbols.NIL != inference_datastructures_enumerated_types.result_uniqueness_criterion_p(result_uniqueness_criterion) ")
						+ result_uniqueness_criterion;
		inference_datastructures_strategy._csetf_strat_result_uniqueness_criterion(strategy,
				result_uniqueness_criterion);
		return strategy;
	}

	public static SubLObject set_strategy_productivity_limit_alt(SubLObject strategy, SubLObject productivity_limit) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		SubLTrampolineFile.checkType(productivity_limit, PRODUCTIVITY_P);
		_csetf_strat_productivity_limit(strategy, productivity_limit);
		return strategy;
	}

	public static SubLObject set_strategy_productivity_limit(final SubLObject strategy,
			final SubLObject productivity_limit) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		assert NIL != inference_datastructures_enumerated_types.productivity_p(
				productivity_limit) : "! inference_datastructures_enumerated_types.productivity_p(productivity_limit) "
						+ ("inference_datastructures_enumerated_types.productivity_p(productivity_limit) "
								+ "CommonSymbols.NIL != inference_datastructures_enumerated_types.productivity_p(productivity_limit) ")
						+ productivity_limit;
		inference_datastructures_strategy._csetf_strat_productivity_limit(strategy, productivity_limit);
		return strategy;
	}

	public static SubLObject set_strategy_removal_backtracking_productivity_limit_alt(SubLObject strategy,
			SubLObject productivity_limit) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		SubLTrampolineFile.checkType(productivity_limit, PRODUCTIVITY_P);
		_csetf_strat_removal_backtracking_productivity_limit(strategy, productivity_limit);
		return strategy;
	}

	public static SubLObject set_strategy_removal_backtracking_productivity_limit(final SubLObject strategy,
			final SubLObject productivity_limit) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		assert NIL != inference_datastructures_enumerated_types.productivity_p(
				productivity_limit) : "! inference_datastructures_enumerated_types.productivity_p(productivity_limit) "
						+ ("inference_datastructures_enumerated_types.productivity_p(productivity_limit) "
								+ "CommonSymbols.NIL != inference_datastructures_enumerated_types.productivity_p(productivity_limit) ")
						+ productivity_limit;
		inference_datastructures_strategy._csetf_strat_removal_backtracking_productivity_limit(strategy,
				productivity_limit);
		return strategy;
	}

	public static SubLObject set_strategy_proof_spec_alt(SubLObject strategy, SubLObject proof_spec) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		SubLTrampolineFile.checkType(proof_spec, PROOF_SPEC_P);
		_csetf_strat_proof_spec(strategy, proof_spec);
		return strategy;
	}

	public static SubLObject set_strategy_proof_spec(final SubLObject strategy, final SubLObject proof_spec) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		assert NIL != inference_proof_spec.proof_spec_p(proof_spec) : "! inference_proof_spec.proof_spec_p(proof_spec) "
				+ ("inference_proof_spec.proof_spec_p(proof_spec) "
						+ "CommonSymbols.NIL != inference_proof_spec.proof_spec_p(proof_spec) ")
				+ proof_spec;
		inference_datastructures_strategy._csetf_strat_proof_spec(strategy, proof_spec);
		return strategy;
	}

	public static SubLObject set_strategy_data_alt(SubLObject strategy, SubLObject data) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		_csetf_strat_data(strategy, data);
		return strategy;
	}

	public static SubLObject set_strategy_data(final SubLObject strategy, final SubLObject data) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		inference_datastructures_strategy._csetf_strat_data(strategy, data);
		return strategy;
	}

	public static SubLObject do_strategy_active_problems_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt70);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject problem_var = NIL;
					SubLObject strategy = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt70);
					problem_var = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt70);
					strategy = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = NIL;
						SubLObject rest = current;
						SubLObject bad = NIL;
						SubLObject current_1 = NIL;
						for (; NIL != rest;) {
							destructuring_bind_must_consp(rest, datum, $list_alt70);
							current_1 = rest.first();
							rest = rest.rest();
							destructuring_bind_must_consp(rest, datum, $list_alt70);
							if (NIL == member(current_1, $list_alt71, UNPROVIDED, UNPROVIDED)) {
								bad = T;
							}
							if (current_1 == $ALLOW_OTHER_KEYS) {
								allow_other_keys_p = rest.first();
							}
							rest = rest.rest();
						}
						if ((NIL != bad) && (NIL == allow_other_keys_p)) {
							cdestructuring_bind_error(datum, $list_alt70);
						}
						{
							SubLObject done_tail = property_list_member($DONE, current);
							SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
							current = temp;
							{
								SubLObject body = current;
								return listS(DO_SET,
										list(problem_var, list(STRATEGY_ACTIVE_PROBLEMS, strategy), $DONE, done),
										append(body, NIL));
							}
						}
					}
				}
			}
		}
	}

	public static SubLObject do_strategy_active_problems(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list80);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject problem_var = NIL;
		SubLObject strategy = NIL;
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list80);
		problem_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list80);
		strategy = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$1 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, inference_datastructures_strategy.$list80);
			current_$1 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, inference_datastructures_strategy.$list80);
			if (NIL == member(current_$1, inference_datastructures_strategy.$list81, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$1 == inference_datastructures_strategy.$ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, inference_datastructures_strategy.$list80);
		}
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		return listS(DO_SET, list(problem_var,
				list(inference_datastructures_strategy.STRATEGY_ACTIVE_PROBLEMS, strategy), $DONE, done),
				append(body, NIL));
	}

	public static SubLObject do_strategy_motivated_problems_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt70);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject problem_var = NIL;
					SubLObject strategy = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt70);
					problem_var = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt70);
					strategy = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = NIL;
						SubLObject rest = current;
						SubLObject bad = NIL;
						SubLObject current_2 = NIL;
						for (; NIL != rest;) {
							destructuring_bind_must_consp(rest, datum, $list_alt70);
							current_2 = rest.first();
							rest = rest.rest();
							destructuring_bind_must_consp(rest, datum, $list_alt70);
							if (NIL == member(current_2, $list_alt71, UNPROVIDED, UNPROVIDED)) {
								bad = T;
							}
							if (current_2 == $ALLOW_OTHER_KEYS) {
								allow_other_keys_p = rest.first();
							}
							rest = rest.rest();
						}
						if ((NIL != bad) && (NIL == allow_other_keys_p)) {
							cdestructuring_bind_error(datum, $list_alt70);
						}
						{
							SubLObject done_tail = property_list_member($DONE, current);
							SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
							current = temp;
							{
								SubLObject body = current;
								return listS(DO_SET_CONTENTS,
										list(problem_var, list(STRATEGY_MOTIVATED_PROBLEMS, strategy), $DONE, done),
										append(body, NIL));
							}
						}
					}
				}
			}
		}
	}

	public static SubLObject do_strategy_motivated_problems(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list80);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject problem_var = NIL;
		SubLObject strategy = NIL;
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list80);
		problem_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list80);
		strategy = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$2 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, inference_datastructures_strategy.$list80);
			current_$2 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, inference_datastructures_strategy.$list80);
			if (NIL == member(current_$2, inference_datastructures_strategy.$list81, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$2 == inference_datastructures_strategy.$ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, inference_datastructures_strategy.$list80);
		}
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		return listS(
				DO_SET_CONTENTS, list(problem_var,
						list(inference_datastructures_strategy.STRATEGY_MOTIVATED_PROBLEMS, strategy), $DONE, done),
				append(body, NIL));
	}

	public static SubLObject do_strategy_set_aside_problems_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt70);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject problem_var = NIL;
					SubLObject strategy = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt70);
					problem_var = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt70);
					strategy = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = NIL;
						SubLObject rest = current;
						SubLObject bad = NIL;
						SubLObject current_3 = NIL;
						for (; NIL != rest;) {
							destructuring_bind_must_consp(rest, datum, $list_alt70);
							current_3 = rest.first();
							rest = rest.rest();
							destructuring_bind_must_consp(rest, datum, $list_alt70);
							if (NIL == member(current_3, $list_alt71, UNPROVIDED, UNPROVIDED)) {
								bad = T;
							}
							if (current_3 == $ALLOW_OTHER_KEYS) {
								allow_other_keys_p = rest.first();
							}
							rest = rest.rest();
						}
						if ((NIL != bad) && (NIL == allow_other_keys_p)) {
							cdestructuring_bind_error(datum, $list_alt70);
						}
						{
							SubLObject done_tail = property_list_member($DONE, current);
							SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
							current = temp;
							{
								SubLObject body = current;
								return listS(DO_SET,
										list(problem_var, list(STRATEGY_SET_ASIDE_PROBLEMS, strategy), $DONE, done),
										append(body, NIL));
							}
						}
					}
				}
			}
		}
	}

	public static SubLObject do_strategy_set_aside_problems(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list80);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject problem_var = NIL;
		SubLObject strategy = NIL;
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list80);
		problem_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list80);
		strategy = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$3 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, inference_datastructures_strategy.$list80);
			current_$3 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, inference_datastructures_strategy.$list80);
			if (NIL == member(current_$3, inference_datastructures_strategy.$list81, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$3 == inference_datastructures_strategy.$ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, inference_datastructures_strategy.$list80);
		}
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		return listS(DO_SET, list(problem_var,
				list(inference_datastructures_strategy.STRATEGY_SET_ASIDE_PROBLEMS, strategy), $DONE, done),
				append(body, NIL));
	}

	public static SubLObject with_strategy_memoization_state_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject strategy = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt76);
			strategy = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				SubLObject strategy_var = $sym77$STRATEGY_VAR;
				SubLObject state_var = $sym78$STATE_VAR;
				return list(CLET,
						list(list(strategy_var, strategy),
								list(state_var, list(STRATEGY_MEMOIZATION_STATE, strategy_var)),
								list($current_strategy_wrt_memoization$, strategy_var)),
						listS(WITH_MEMOIZATION_STATE, list(state_var), append(body, NIL)));
			}
		}
	}

	public static SubLObject with_strategy_memoization_state(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject strategy = NIL;
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list86);
		strategy = current.first();
		final SubLObject body;
		current = body = current.rest();
		final SubLObject strategy_var = inference_datastructures_strategy.$sym87$STRATEGY_VAR;
		final SubLObject state_var = inference_datastructures_strategy.$sym88$STATE_VAR;
		return list(CLET,
				list(list(strategy_var, strategy),
						list(state_var,
								list(inference_datastructures_strategy.STRATEGY_MEMOIZATION_STATE, strategy_var)),
						list(inference_datastructures_strategy.$current_strategy_wrt_memoization$, strategy_var)),
				listS(WITH_MEMOIZATION_STATE, list(state_var), append(body, NIL)));
	}

	public static SubLObject strategy_memoization_state_alt(SubLObject strategy) {
		return strat_memoization_state(strategy);
	}

	public static SubLObject strategy_memoization_state(final SubLObject strategy) {
		return inference_datastructures_strategy.strat_memoization_state(strategy);
	}

	public static SubLObject current_strategy_wrt_memoization_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return $current_strategy_wrt_memoization$.getDynamicValue(thread);
		}
	}

	public static SubLObject current_strategy_wrt_memoization() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return inference_datastructures_strategy.$current_strategy_wrt_memoization$.getDynamicValue(thread);
	}

	public static SubLObject strategic_context_inference_alt(SubLObject strategic_context) {
		return NIL != strategy_p(strategic_context) ? ((SubLObject) (strategy_inference(strategic_context))) : NIL;
	}

	public static SubLObject strategic_context_inference(final SubLObject strategic_context) {
		return NIL != inference_datastructures_strategy.strategy_p(strategic_context)
				? inference_datastructures_strategy.strategy_inference(strategic_context)
				: NIL;
	}

	/**
	 *
	 *
	 * @return answer-link-p; The answer-link of the inference of STRATEGY.
	 */
	@LispMethod(comment = "@return answer-link-p; The answer-link of the inference of STRATEGY.")
	public static SubLObject strategy_answer_link_alt(SubLObject strategy) {
		return inference_datastructures_inference.inference_root_link(strategy_inference(strategy));
	}

	/**
	 *
	 *
	 * @return answer-link-p; The answer-link of the inference of STRATEGY.
	 */
	@LispMethod(comment = "@return answer-link-p; The answer-link of the inference of STRATEGY.")
	public static SubLObject strategy_answer_link(final SubLObject strategy) {
		return inference_datastructures_inference
				.inference_root_link(inference_datastructures_strategy.strategy_inference(strategy));
	}

	/**
	 * Return T iff the answer-link of the inference of STRATEGY has been propagated
	 * and has not been closed thereafter.
	 */
	@LispMethod(comment = "Return T iff the answer-link of the inference of STRATEGY has been propagated\r\nand has not been closed thereafter.\nReturn T iff the answer-link of the inference of STRATEGY has been propagated\nand has not been closed thereafter.")
	public static SubLObject strategy_answer_link_propagatedP_alt(SubLObject strategy) {
		return inference_worker_answer.answer_link_propagatedP(strategy_answer_link(strategy));
	}

	/**
	 * Return T iff the answer-link of the inference of STRATEGY has been propagated
	 * and has not been closed thereafter.
	 */
	@LispMethod(comment = "Return T iff the answer-link of the inference of STRATEGY has been propagated\r\nand has not been closed thereafter.\nReturn T iff the answer-link of the inference of STRATEGY has been propagated\nand has not been closed thereafter.")
	public static SubLObject strategy_answer_link_propagatedP(final SubLObject strategy) {
		return inference_worker_answer
				.answer_link_propagatedP(inference_datastructures_strategy.strategy_answer_link(strategy));
	}

	/**
	 * Return T iff the answer-link of the inference of STRATEGY ought to be propagated.
	 */
	@LispMethod(comment = "Return T iff the answer-link of the inference of STRATEGY ought to be propagated.")
	public static SubLObject strategy_should_propagate_answer_linkP_alt(SubLObject strategy) {
		if (NIL != strategy_answer_link_propagatedP(strategy)) {
			return NIL;
		} else {
			if ((NIL != inference_worker.inference_deems_answer_link_should_be_closedP(strategy_inference(strategy),
					strategy_answer_link(strategy)))
					&& (NIL != inference_datastructures_inference
							.inference_has_some_answerP(strategy_inference(strategy)))) {
				return NIL;
			} else {
				return T;
			}
		}
	}

	/**
	 * Return T iff the answer-link of the inference of STRATEGY ought to be propagated.
	 */
	@LispMethod(comment = "Return T iff the answer-link of the inference of STRATEGY ought to be propagated.")
	public static SubLObject strategy_should_propagate_answer_linkP(final SubLObject strategy) {
		if (NIL != inference_datastructures_strategy.strategy_answer_link_propagatedP(strategy)) {
			return NIL;
		}
		if ((NIL != inference_worker.inference_deems_answer_link_should_be_closedP(
				inference_datastructures_strategy.strategy_inference(strategy),
				inference_datastructures_strategy.strategy_answer_link(strategy)))
				&& (NIL != inference_datastructures_inference
						.inference_has_some_answerP(inference_datastructures_strategy.strategy_inference(strategy)))) {
			return NIL;
		}
		return T;
	}

	/**
	 *
	 *
	 * @return problem-p; The root problem of the inference of STRATEGY.
	 */
	@LispMethod(comment = "@return problem-p; The root problem of the inference of STRATEGY.")
	public static SubLObject strategy_root_problem_alt(SubLObject strategy) {
		return inference_datastructures_inference.inference_root_problem(strategy_inference(strategy));
	}

	/**
	 *
	 *
	 * @return problem-p; The root problem of the inference of STRATEGY.
	 */
	@LispMethod(comment = "@return problem-p; The root problem of the inference of STRATEGY.")
	public static SubLObject strategy_root_problem(final SubLObject strategy) {
		return inference_datastructures_inference
				.inference_root_problem(inference_datastructures_strategy.strategy_inference(strategy));
	}

	public static SubLObject strategy_continuableP_alt(SubLObject strategy) {
		return inference_datastructures_inference.inference_continuableP(strategy_inference(strategy));
	}

	public static SubLObject strategy_continuableP(final SubLObject strategy) {
		return inference_datastructures_inference
				.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy));
	}

	public static SubLObject problem_active_in_strategyP_alt(SubLObject problem, SubLObject strategy) {
		return set.set_memberP(problem, strategy_active_problems(strategy));
	}

	public static SubLObject problem_active_in_strategyP(final SubLObject problem, final SubLObject strategy) {
		return set.set_memberP(problem, inference_datastructures_strategy.strategy_active_problems(strategy));
	}

	public static SubLObject problem_motivatedP_alt(SubLObject problem, SubLObject strategy) {
		return set_contents.set_contents_memberP(problem, strategy_motivated_problems(strategy), symbol_function(EQ));
	}

	public static SubLObject problem_motivatedP(final SubLObject problem, final SubLObject strategy) {
		return set_contents.set_contents_memberP(problem,
				inference_datastructures_strategy.strategy_motivated_problems(strategy), symbol_function(EQ));
	}

	public static SubLObject problem_set_aside_in_strategyP_alt(SubLObject problem, SubLObject strategy) {
		return set.set_memberP(problem, strategy_set_aside_problems(strategy));
	}

	public static SubLObject problem_set_aside_in_strategyP(final SubLObject problem, final SubLObject strategy) {
		return set.set_memberP(problem, inference_datastructures_strategy.strategy_set_aside_problems(strategy));
	}

	public static SubLObject strategy_has_some_set_aside_problemsP_alt(SubLObject strategy) {
		return makeBoolean(NIL == set.set_emptyP(strategy_set_aside_problems(strategy)));
	}

	public static SubLObject strategy_has_some_set_aside_problemsP(final SubLObject strategy) {
		return makeBoolean(
				NIL == set.set_emptyP(inference_datastructures_strategy.strategy_set_aside_problems(strategy)));
	}

	public static SubLObject strategy_all_valid_set_aside_problems_alt(SubLObject strategy) {
		return list_utilities.delete_if_not(VALID_PROBLEM_P,
				set.set_element_list(strategy_set_aside_problems(strategy)), UNPROVIDED, UNPROVIDED, UNPROVIDED,
				UNPROVIDED);
	}

	public static SubLObject strategy_all_valid_set_aside_problems(final SubLObject strategy) {
		return list_utilities.delete_if_not(inference_datastructures_strategy.VALID_PROBLEM_P,
				set.set_element_list(inference_datastructures_strategy.strategy_set_aside_problems(strategy)),
				UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject strategy_problem_store_alt(SubLObject strategy) {
		return inference_datastructures_inference.inference_problem_store(strategy_inference(strategy));
	}

	public static SubLObject strategy_problem_store(final SubLObject strategy) {
		return inference_datastructures_inference
				.inference_problem_store(inference_datastructures_strategy.strategy_inference(strategy));
	}

	/**
	 * Locally specified result uniqueness criteria on the strategy (if any)
	 * override the one from the inference.
	 */
	@LispMethod(comment = "Locally specified result uniqueness criteria on the strategy (if any)\r\noverride the one from the inference.\nLocally specified result uniqueness criteria on the strategy (if any)\noverride the one from the inference.")
	public static SubLObject strategy_result_uniqueness_criterion_alt(SubLObject strategy) {
		{
			SubLObject local_criterion = strategy_local_result_uniqueness_criterion(strategy);
			if (NIL != local_criterion) {
				return local_criterion;
			} else {
				{
					SubLObject inference = strategy_inference(strategy);
					return inference_datastructures_inference.inference_result_uniqueness_criterion(inference);
				}
			}
		}
	}

	/**
	 * Locally specified result uniqueness criteria on the strategy (if any)
	 * override the one from the inference.
	 */
	@LispMethod(comment = "Locally specified result uniqueness criteria on the strategy (if any)\r\noverride the one from the inference.\nLocally specified result uniqueness criteria on the strategy (if any)\noverride the one from the inference.")
	public static SubLObject strategy_result_uniqueness_criterion(final SubLObject strategy) {
		final SubLObject local_criterion = inference_datastructures_strategy
				.strategy_local_result_uniqueness_criterion(strategy);
		if (NIL != local_criterion) {
			return local_criterion;
		}
		final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
		return inference_datastructures_inference.inference_result_uniqueness_criterion(inference);
	}

	public static SubLObject strategy_unique_wrt_proofsP_alt(SubLObject strategy) {
		return eq($PROOF, strategy_result_uniqueness_criterion(strategy));
	}

	public static SubLObject strategy_unique_wrt_proofsP(final SubLObject strategy) {
		return eq($PROOF, inference_datastructures_strategy.strategy_result_uniqueness_criterion(strategy));
	}

	public static SubLObject strategy_unique_wrt_bindingsP_alt(SubLObject strategy) {
		return eq($BINDINGS, strategy_result_uniqueness_criterion(strategy));
	}

	public static SubLObject strategy_unique_wrt_bindingsP(final SubLObject strategy) {
		return eq($BINDINGS, inference_datastructures_strategy.strategy_result_uniqueness_criterion(strategy));
	}

	public static SubLObject strategy_wants_one_answerP_alt(SubLObject strategy) {
		return NIL;
	}

	public static SubLObject strategy_wants_one_answerP(final SubLObject strategy) {
		return NIL;
	}

	public static SubLObject strategy_active_problem_count_alt(SubLObject strategy) {
		return set.set_size(strategy_active_problems(strategy));
	}

	public static SubLObject strategy_active_problem_count(final SubLObject strategy) {
		return set.set_size(inference_datastructures_strategy.strategy_active_problems(strategy));
	}

	public static SubLObject strategy_motivated_problem_count_alt(SubLObject strategy) {
		return set_contents.set_contents_size(strategy_motivated_problems(strategy));
	}

	public static SubLObject strategy_motivated_problem_count(final SubLObject strategy) {
		return set_contents.set_contents_size(inference_datastructures_strategy.strategy_motivated_problems(strategy));
	}

	public static SubLObject strategy_set_aside_problem_count_alt(SubLObject strategy) {
		return set.set_size(strategy_set_aside_problems(strategy));
	}

	public static SubLObject strategy_set_aside_problem_count(final SubLObject strategy) {
		return set.set_size(inference_datastructures_strategy.strategy_set_aside_problems(strategy));
	}

	/**
	 *
	 *
	 * @unknown proof-spec-p
	 */
	@LispMethod(comment = "@unknown proof-spec-p")
	public static SubLObject strategy_problem_proof_spec_alt(SubLObject strategy, SubLObject problem) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		SubLTrampolineFile.checkType(problem, PROBLEM_P);
		return dictionary.dictionary_lookup_without_values(strategy_problem_proof_spec_index(strategy), problem,
				$ANYTHING);
	}

	/**
	 *
	 *
	 * @unknown proof-spec-p
	 */
	@LispMethod(comment = "@unknown proof-spec-p")
	public static SubLObject strategy_problem_proof_spec(final SubLObject strategy, final SubLObject problem) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		assert NIL != inference_datastructures_problem
				.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) "
						+ ("inference_datastructures_problem.problem_p(problem) "
								+ "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ")
						+ problem;
		return dictionary.dictionary_lookup_without_values(
				inference_datastructures_strategy.strategy_problem_proof_spec_index(strategy), problem, $ANYTHING);
	}

	public static SubLObject set_strategy_property_alt(SubLObject strategy, SubLObject property, SubLObject value) {
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		SubLTrampolineFile.checkType(property, STRATEGY_PROPERTY_P);
		{
			SubLObject pcase_var = property;
			if (pcase_var.eql($PRODUCTIVITY_LIMIT)) {
				set_strategy_productivity_limit(strategy, value);
			} else {
				if (pcase_var.eql($REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
					set_strategy_removal_backtracking_productivity_limit(strategy, value);
				} else {
					if (pcase_var.eql($PROOF_SPEC)) {
						set_strategy_proof_spec(strategy, value);
					} else {
						Errors.error($str_alt91$Unexpected_strategy_property__s_w, property, value);
					}
				}
			}
		}
		return strategy;
	}

	public static SubLObject set_strategy_property(final SubLObject strategy, final SubLObject property,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		assert NIL != inference_datastructures_enumerated_types.strategy_property_p(
				property) : "! inference_datastructures_enumerated_types.strategy_property_p(property) "
						+ ("inference_datastructures_enumerated_types.strategy_property_p(property) "
								+ "CommonSymbols.NIL != inference_datastructures_enumerated_types.strategy_property_p(property) ")
						+ property;
		if (property.eql($PRODUCTIVITY_LIMIT)) {
			inference_datastructures_strategy.set_strategy_productivity_limit(strategy, value);
		} else if (property.eql(inference_datastructures_strategy.$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
			inference_datastructures_strategy.set_strategy_removal_backtracking_productivity_limit(strategy, value);
		} else if (property.eql($PROOF_SPEC)) {
			inference_datastructures_strategy.set_strategy_proof_spec(strategy, value);
		} else {
			Errors.error(inference_datastructures_strategy.$str101$Unexpected_strategy_property__s_w, property, value);
		}

		return strategy;
	}

	public static SubLObject copy_strategy_properties(final SubLObject source_strategy,
			final SubLObject target_strategy) {
		inference_datastructures_strategy.set_strategy_productivity_limit(target_strategy,
				inference_datastructures_strategy.strategy_productivity_limit(source_strategy));
		inference_datastructures_strategy.set_strategy_removal_backtracking_productivity_limit(target_strategy,
				inference_datastructures_strategy.strategy_removal_backtracking_productivity_limit(source_strategy));
		inference_datastructures_strategy.set_strategy_proof_spec(target_strategy,
				inference_datastructures_strategy.strategy_proof_spec(source_strategy));
		return target_strategy;
	}

	public static SubLObject set_strategy_properties_alt(SubLObject strategy, SubLObject strategy_properties) {
		SubLTrampolineFile.checkType(strategy_properties, STRATEGY_PROPERTIES_P);
		{
			SubLObject remainder = NIL;
			for (remainder = strategy_properties; NIL != remainder; remainder = cddr(remainder)) {
				{
					SubLObject property = remainder.first();
					SubLObject value = cadr(remainder);
					set_strategy_property(strategy, property, value);
				}
			}
		}
		return strategy;
	}

	public static SubLObject set_strategy_properties(final SubLObject strategy, final SubLObject strategy_properties) {
		assert NIL != inference_datastructures_enumerated_types.strategy_properties_p(
				strategy_properties) : "! inference_datastructures_enumerated_types.strategy_properties_p(strategy_properties) "
						+ ("inference_datastructures_enumerated_types.strategy_properties_p(strategy_properties) "
								+ "CommonSymbols.NIL != inference_datastructures_enumerated_types.strategy_properties_p(strategy_properties) ")
						+ strategy_properties;
		SubLObject remainder;
		SubLObject property;
		SubLObject value;
		for (remainder = NIL, remainder = strategy_properties; NIL != remainder; remainder = cddr(remainder)) {
			property = remainder.first();
			value = cadr(remainder);
			inference_datastructures_strategy.set_strategy_property(strategy, property, value);
		}
		return strategy;
	}

	public static SubLObject strategy_note_problem_active_alt(SubLObject strategy, SubLObject problem) {
		set.set_add(problem, strategy_active_problems(strategy));
		return strategy;
	}

	public static SubLObject strategy_note_problem_active(final SubLObject strategy, final SubLObject problem) {
		set.set_add(problem, inference_datastructures_strategy.strategy_active_problems(strategy));
		return strategy;
	}

	public static SubLObject strategy_note_problem_inactive_alt(SubLObject strategy, SubLObject problem) {
		set.set_remove(problem, strategy_active_problems(strategy));
		return strategy;
	}

	public static SubLObject strategy_note_problem_inactive(final SubLObject strategy, final SubLObject problem) {
		set.set_remove(problem, inference_datastructures_strategy.strategy_active_problems(strategy));
		return strategy;
	}

	public static SubLObject strategy_note_problem_motivated_alt(SubLObject strategy, SubLObject problem) {
		{
			SubLObject motivated_problems = strategy_motivated_problems(strategy);
			_csetf_strat_motivated_problems(strategy,
					set_contents.set_contents_add(problem, motivated_problems, symbol_function(EQ)));
		}
		controlling_strategy_callback(strategy, $SUBSTRATEGY_STRATEGEM_MOTIVATED, problem, UNPROVIDED, UNPROVIDED,
				UNPROVIDED);
		return strategy;
	}

	public static SubLObject strategy_note_problem_motivated(final SubLObject strategy, final SubLObject problem) {
		final SubLObject motivated_problems = inference_datastructures_strategy.strategy_motivated_problems(strategy);
		inference_datastructures_strategy._csetf_strat_motivated_problems(strategy,
				set_contents.set_contents_add(problem, motivated_problems, symbol_function(EQ)));
		inference_datastructures_strategy.controlling_strategy_callback(strategy,
				inference_datastructures_strategy.$SUBSTRATEGY_STRATEGEM_MOTIVATED, problem, UNPROVIDED, UNPROVIDED,
				UNPROVIDED);
		return strategy;
	}

	public static SubLObject strategy_note_problem_unmotivated_alt(SubLObject strategy, SubLObject problem) {
		set_contents.set_contents_delete(problem, strategy_motivated_problems(strategy), symbol_function(EQ));
		return strategy;
	}

	public static SubLObject strategy_note_problem_unmotivated(final SubLObject strategy, final SubLObject problem) {
		set_contents.set_contents_delete(problem,
				inference_datastructures_strategy.strategy_motivated_problems(strategy), symbol_function(EQ));
		return strategy;
	}

	public static SubLObject strategy_note_problem_set_aside_alt(SubLObject strategy, SubLObject problem) {
		set.set_add(problem, strategy_set_aside_problems(strategy));
		return strategy;
	}

	public static SubLObject strategy_note_problem_set_aside(final SubLObject strategy, final SubLObject problem) {
		set.set_add(problem, inference_datastructures_strategy.strategy_set_aside_problems(strategy));
		return strategy;
	}

	public static SubLObject strategy_clear_problem_set_aside_alt(SubLObject strategy, SubLObject problem) {
		set.set_remove(problem, strategy_set_aside_problems(strategy));
		return strategy;
	}

	public static SubLObject strategy_clear_problem_set_aside(final SubLObject strategy, final SubLObject problem) {
		set.set_remove(problem, inference_datastructures_strategy.strategy_set_aside_problems(strategy));
		return strategy;
	}

	public static SubLObject strategy_clear_set_asides_alt(SubLObject strategy) {
		set.clear_set(strategy_set_aside_problems(strategy));
		return strategy;
	}

	public static SubLObject strategy_clear_set_asides(final SubLObject strategy) {
		set.clear_set(inference_datastructures_strategy.strategy_set_aside_problems(strategy));
		return strategy;
	}

	public static SubLObject note_strategy_should_reconsider_set_asides_alt(SubLObject strategy) {
		_csetf_strat_should_reconsider_set_asidesP(strategy, T);
		return strategy;
	}

	public static SubLObject note_strategy_should_reconsider_set_asides(final SubLObject strategy) {
		inference_datastructures_strategy._csetf_strat_should_reconsider_set_asidesP(strategy, T);
		return strategy;
	}

	public static SubLObject clear_strategy_should_reconsider_set_asides_alt(SubLObject strategy) {
		_csetf_strat_should_reconsider_set_asidesP(strategy, NIL);
		return strategy;
	}

	public static SubLObject clear_strategy_should_reconsider_set_asides(final SubLObject strategy) {
		inference_datastructures_strategy._csetf_strat_should_reconsider_set_asidesP(strategy, NIL);
		return strategy;
	}

	/**
	 * Notes that PROBLEM is active in STRATEGY during the execution of BODY,
	 * then after BODY is done, removes it and possibly adds it back.
	 */
	@LispMethod(comment = "Notes that PROBLEM is active in STRATEGY during the execution of BODY,\r\nthen after BODY is done, removes it and possibly adds it back.\nNotes that PROBLEM is active in STRATEGY during the execution of BODY,\nthen after BODY is done, removes it and possibly adds it back.")
	public static SubLObject with_strategically_active_problem_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt94);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject strategy = NIL;
					SubLObject problem = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt94);
					strategy = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt94);
					problem = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							SubLObject strategy_var = $sym95$STRATEGY_VAR;
							SubLObject problem_var = $sym96$PROBLEM_VAR;
							return listS(CLET, list(list(strategy_var, strategy), list(problem_var, problem)),
									list(STRATEGY_NOTE_PROBLEM_ACTIVE, strategy_var, problem_var),
									append(body, list(list(STRATEGY_NOTE_PROBLEM_INACTIVE, strategy_var, problem_var),
											list(POSSIBLY_REACTIVATE_PROBLEM, strategy_var, problem_var))));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt94);
					}
				}
			}
		}
		return NIL;
	}

	/**
	 * Notes that PROBLEM is active in STRATEGY during the execution of BODY,
	 * then after BODY is done, removes it and possibly adds it back.
	 */
	@LispMethod(comment = "Notes that PROBLEM is active in STRATEGY during the execution of BODY,\r\nthen after BODY is done, removes it and possibly adds it back.\nNotes that PROBLEM is active in STRATEGY during the execution of BODY,\nthen after BODY is done, removes it and possibly adds it back.")
	public static SubLObject with_strategically_active_problem(final SubLObject macroform,
			final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list104);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject strategy = NIL;
		SubLObject problem = NIL;
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list104);
		strategy = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, inference_datastructures_strategy.$list104);
		problem = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject strategy_var = inference_datastructures_strategy.$sym105$STRATEGY_VAR;
			final SubLObject problem_var = inference_datastructures_strategy.$sym106$PROBLEM_VAR;
			return listS(CLET, list(list(strategy_var, strategy), list(problem_var, problem)),
					list(inference_datastructures_strategy.STRATEGY_NOTE_PROBLEM_ACTIVE, strategy_var, problem_var),
					append(body,
							list(list(inference_datastructures_strategy.STRATEGY_NOTE_PROBLEM_INACTIVE, strategy_var,
									problem_var),
									list(inference_datastructures_strategy.POSSIBLY_REACTIVATE_PROBLEM, strategy_var,
											problem_var))));
		}
		cdestructuring_bind_error(datum, inference_datastructures_strategy.$list104);
		return NIL;
	}

	/**
	 * Merge PROOF-SPEC into the existing proof-specs for PROBLEM wrt STRATEGY.
	 *
	 * @return boolean ; T iff the proof spec changed as a result.
	 */
	@LispMethod(comment = "Merge PROOF-SPEC into the existing proof-specs for PROBLEM wrt STRATEGY.\r\n\r\n@return boolean ; T iff the proof spec changed as a result.")
	public static SubLObject strategy_note_problem_proof_spec_alt(SubLObject strategy, SubLObject problem,
			SubLObject proof_spec) {
		SubLTrampolineFile.checkType(problem, PROBLEM_P);
		{
			SubLObject old_value = dictionary
					.dictionary_lookup_without_values(strategy_problem_proof_spec_index(strategy), problem, $NOTHING);
			SubLObject new_value = merge_2_proof_specs(old_value, proof_spec);
			if (!new_value.equal(old_value)) {
				dictionary.dictionary_enter(strategy_problem_proof_spec_index(strategy), problem, new_value);
				set_problem_recompute_thrown_away_wrt_all_motivations(problem, strategy);
				return T;
			}
			return NIL;
		}
	}

	/**
	 * Merge PROOF-SPEC into the existing proof-specs for PROBLEM wrt STRATEGY.
	 *
	 * @return boolean ; T iff the proof spec changed as a result.
	 */
	@LispMethod(comment = "Merge PROOF-SPEC into the existing proof-specs for PROBLEM wrt STRATEGY.\r\n\r\n@return boolean ; T iff the proof spec changed as a result.")
	public static SubLObject strategy_note_problem_proof_spec(final SubLObject strategy, final SubLObject problem,
			final SubLObject proof_spec) {
		assert NIL != inference_datastructures_problem
				.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) "
						+ ("inference_datastructures_problem.problem_p(problem) "
								+ "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ")
						+ problem;
		final SubLObject old_value = dictionary.dictionary_lookup_without_values(
				inference_datastructures_strategy.strategy_problem_proof_spec_index(strategy), problem, $NOTHING);
		final SubLObject new_value = inference_proof_spec.merge_2_proof_specs(old_value, proof_spec);
		if (!new_value.equal(old_value)) {
			dictionary.dictionary_enter(inference_datastructures_strategy.strategy_problem_proof_spec_index(strategy),
					problem, new_value);
			inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy);
			return T;
		}
		return NIL;
	}

	public static SubLObject increment_strategy_step_count(final SubLObject strategy) {
		SubLObject step_count = inference_datastructures_strategy.strat_step_count(strategy);
		step_count = add(step_count, ONE_INTEGER);
		inference_datastructures_strategy._csetf_strat_step_count(strategy, step_count);
		return step_count;
	}

	public static SubLObject strategy_dispatch_alt(SubLObject strategy, SubLObject method_type, SubLObject arg1,
			SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
		SubLObject arg1_providedP = makeBoolean(arg1 != UNPROVIDED);
		SubLObject arg2_providedP = makeBoolean(arg2 != UNPROVIDED);
		SubLObject arg3_providedP = makeBoolean(arg3 != UNPROVIDED);
		SubLObject arg4_providedP = makeBoolean(arg4 != UNPROVIDED);
		SubLObject arg5_providedP = makeBoolean(arg5 != UNPROVIDED);
		if (arg1 == UNPROVIDED) {
			arg1 = NIL;
		}
		if (arg2 == UNPROVIDED) {
			arg2 = NIL;
		}
		if (arg3 == UNPROVIDED) {
			arg3 = NIL;
		}
		if (arg4 == UNPROVIDED) {
			arg4 = NIL;
		}
		if (arg5 == UNPROVIDED) {
			arg5 = NIL;
		}
		{
			SubLObject handler_func = strategy_dispatch_handler(strategy, method_type);
			if (NIL == handler_func) {
				handler_func = inference_datastructures_enumerated_types.strategy_default_method_handler(method_type);
			}
			if ((NIL == handler_func) && (NIL != balancing_tactician.balancing_tactician_p(strategy))) {
				return Errors.error($str_alt101$balancing_tactician_does_not_impl, method_type);
			}
			if (NIL != arg5_providedP) {
				return strategy_dispatch_funcall_5(handler_func, strategy, arg1, arg2, arg3, arg4, arg5);
			} else {
				if (NIL != arg4_providedP) {
					return strategy_dispatch_funcall_4(handler_func, strategy, arg1, arg2, arg3, arg4);
				} else {
					if (NIL != arg3_providedP) {
						return strategy_dispatch_funcall_3(handler_func, strategy, arg1, arg2, arg3);
					} else {
						if (NIL != arg2_providedP) {
							return strategy_dispatch_funcall_2(handler_func, strategy, arg1, arg2);
						} else {
							if (NIL != arg1_providedP) {
								return strategy_dispatch_funcall_1(handler_func, strategy, arg1);
							} else {
								return strategy_dispatch_funcall_0(handler_func, strategy);
							}
						}
					}
				}
			}
		}
	}

	public static SubLObject strategy_dispatch(final SubLObject strategy, final SubLObject method_type, SubLObject arg1,
			SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
		final SubLObject arg1_providedP = makeBoolean(arg1 != UNPROVIDED);
		final SubLObject arg2_providedP = makeBoolean(arg2 != UNPROVIDED);
		final SubLObject arg3_providedP = makeBoolean(arg3 != UNPROVIDED);
		final SubLObject arg4_providedP = makeBoolean(arg4 != UNPROVIDED);
		final SubLObject arg5_providedP = makeBoolean(arg5 != UNPROVIDED);
		if (arg1 == UNPROVIDED) {
			arg1 = NIL;
		}
		if (arg2 == UNPROVIDED) {
			arg2 = NIL;
		}
		if (arg3 == UNPROVIDED) {
			arg3 = NIL;
		}
		if (arg4 == UNPROVIDED) {
			arg4 = NIL;
		}
		if (arg5 == UNPROVIDED) {
			arg5 = NIL;
		}
		SubLObject handler_func = inference_datastructures_strategy.strategy_dispatch_handler(strategy, method_type);
		if (NIL == handler_func) {
			handler_func = inference_datastructures_enumerated_types.strategy_default_method_handler(method_type);
		}
		if ((NIL == handler_func) && (NIL != balancing_tactician.balancing_tactician_p(strategy))) {
			return Errors.error(inference_datastructures_strategy.$str111$balancing_tactician_does_not_impl,
					method_type);
		}
		if (NIL != arg5_providedP) {
			return inference_datastructures_strategy.strategy_dispatch_funcall_5(handler_func, strategy, arg1, arg2,
					arg3, arg4, arg5);
		}
		if (NIL != arg4_providedP) {
			return inference_datastructures_strategy.strategy_dispatch_funcall_4(handler_func, strategy, arg1, arg2,
					arg3, arg4);
		}
		if (NIL != arg3_providedP) {
			return inference_datastructures_strategy.strategy_dispatch_funcall_3(handler_func, strategy, arg1, arg2,
					arg3);
		}
		if (NIL != arg2_providedP) {
			return inference_datastructures_strategy.strategy_dispatch_funcall_2(handler_func, strategy, arg1, arg2);
		}
		if (NIL != arg1_providedP) {
			return inference_datastructures_strategy.strategy_dispatch_funcall_1(handler_func, strategy, arg1);
		}
		return inference_datastructures_strategy.strategy_dispatch_funcall_0(handler_func, strategy);
	}

	public static SubLObject strategy_dispatch_handler_alt(SubLObject strategy, SubLObject method_type) {
		{
			SubLObject strategy_type = strategy_type(strategy);
			return inference_tactician.strategy_type_dispatch_handler(strategy_type, method_type);
		}
	}

	public static SubLObject strategy_dispatch_handler(final SubLObject strategy, final SubLObject method_type) {
		final SubLObject strategy_type = inference_datastructures_strategy.strategy_type(strategy);
		return inference_tactician.strategy_type_dispatch_handler(strategy_type, method_type);
	}

	public static SubLObject strategy_dispatch_funcall_0_alt(SubLObject func, SubLObject strategy) {
		{
			SubLObject pcase_var = func;
			if (pcase_var.eql(BALANCED_STRATEGY_DEFAULT_SELECT_BEST_STRATEGEM)) {
				return inference_balanced_tactician_execution.balanced_strategy_default_select_best_strategem(strategy);
			} else {
				if (pcase_var.eql(BALANCED_STRATEGY_DO_ONE_STEP)) {
					return inference_balanced_tactician_execution.balanced_strategy_do_one_step(strategy);
				} else {
					if (pcase_var.eql($sym104$BALANCED_STRATEGY_DONE_)) {
						return inference_balanced_tactician_execution.balanced_strategy_doneP(strategy);
					} else {
						return funcall(func, strategy);
					}
				}
			}
		}
	}

	public static SubLObject strategy_dispatch_funcall_0(final SubLObject func, final SubLObject strategy) {
		return funcall(func, strategy);
	}

	public static SubLObject strategy_dispatch_funcall_1_alt(SubLObject func, SubLObject strategy, SubLObject arg1) {
		{
			SubLObject pcase_var = func;
			if (pcase_var.eql(BALANCED_STRATEGY_POSSIBLY_ACTIVATE_PROBLEM)) {
				return inference_balanced_tactician_motivation.balanced_strategy_possibly_activate_problem(strategy,
						arg1);
			} else {
				return funcall(func, strategy, arg1);
			}
		}
	}

	public static SubLObject strategy_dispatch_funcall_1(final SubLObject func, final SubLObject strategy,
			final SubLObject arg1) {
		return funcall(func, strategy, arg1);
	}

	public static SubLObject strategy_dispatch_funcall_2_alt(SubLObject func, SubLObject strategy, SubLObject arg1,
			SubLObject arg2) {
		{
			SubLObject pcase_var = func;
			return funcall(func, strategy, arg1, arg2);
		}
	}

	public static SubLObject strategy_dispatch_funcall_2(final SubLObject func, final SubLObject strategy,
			final SubLObject arg1, final SubLObject arg2) {
		return funcall(func, strategy, arg1, arg2);
	}

	public static SubLObject strategy_dispatch_funcall_3_alt(SubLObject func, SubLObject strategy, SubLObject arg1,
			SubLObject arg2, SubLObject arg3) {
		{
			SubLObject pcase_var = func;
			return funcall(func, strategy, arg1, arg2, arg3);
		}
	}

	public static SubLObject strategy_dispatch_funcall_3(final SubLObject func, final SubLObject strategy,
			final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
		return funcall(func, strategy, arg1, arg2, arg3);
	}

	public static SubLObject strategy_dispatch_funcall_4_alt(SubLObject func, SubLObject strategy, SubLObject arg1,
			SubLObject arg2, SubLObject arg3, SubLObject arg4) {
		{
			SubLObject pcase_var = func;
			return funcall(func, strategy, arg1, arg2, arg3, arg4);
		}
	}

	public static SubLObject strategy_dispatch_funcall_4(final SubLObject func, final SubLObject strategy,
			final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
		return funcall(func, strategy, arg1, arg2, arg3, arg4);
	}

	public static SubLObject strategy_dispatch_funcall_5_alt(SubLObject func, SubLObject strategy, SubLObject arg1,
			SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
		{
			SubLObject pcase_var = func;
			return funcall(func, strategy, arg1, arg2, arg3, arg4, arg5);
		}
	}

	public static SubLObject strategy_dispatch_funcall_5(final SubLObject func, final SubLObject strategy,
			final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4,
			final SubLObject arg5) {
		return funcall(func, strategy, arg1, arg2, arg3, arg4, arg5);
	}

	public static SubLObject strategy_dispatch_unexpected_strategy_type_error_alt(SubLObject strategy) {
		return Errors.error($str_alt106$Unexpected_strategy_type__a, strategy);
	}

	public static SubLObject strategy_dispatch_unexpected_strategy_type_error(final SubLObject strategy) {
		return Errors.error(inference_datastructures_strategy.$str112$Unexpected_strategy_type__a, strategy);
	}

	public static SubLObject controlling_strategy_callback_alt(SubLObject substrategy, SubLObject method_type,
			SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
		SubLObject arg1_providedP = makeBoolean(arg1 != UNPROVIDED);
		SubLObject arg2_providedP = makeBoolean(arg2 != UNPROVIDED);
		SubLObject arg3_providedP = makeBoolean(arg3 != UNPROVIDED);
		SubLObject arg4_providedP = makeBoolean(arg4 != UNPROVIDED);
		if (arg1 == UNPROVIDED) {
			arg1 = NIL;
		}
		if (arg2 == UNPROVIDED) {
			arg2 = NIL;
		}
		if (arg3 == UNPROVIDED) {
			arg3 = NIL;
		}
		if (arg4 == UNPROVIDED) {
			arg4 = NIL;
		}
		{
			SubLObject controlling_strategy = inference_tactician.controlling_strategy(substrategy);
			if (substrategy != controlling_strategy) {
				if (NIL != arg4_providedP) {
					return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2, arg3, arg4);
				} else {
					if (NIL != arg3_providedP) {
						return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2, arg3,
								UNPROVIDED);
					} else {
						if (NIL != arg2_providedP) {
							return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2,
									UNPROVIDED, UNPROVIDED);
						} else {
							if (NIL != arg1_providedP) {
								return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1,
										UNPROVIDED, UNPROVIDED, UNPROVIDED);
							} else {
								return strategy_dispatch(controlling_strategy, method_type, substrategy, UNPROVIDED,
										UNPROVIDED, UNPROVIDED, UNPROVIDED);
							}
						}
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject controlling_strategy_callback(final SubLObject substrategy, final SubLObject method_type,
			SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
		final SubLObject arg1_providedP = makeBoolean(arg1 != UNPROVIDED);
		final SubLObject arg2_providedP = makeBoolean(arg2 != UNPROVIDED);
		final SubLObject arg3_providedP = makeBoolean(arg3 != UNPROVIDED);
		final SubLObject arg4_providedP = makeBoolean(arg4 != UNPROVIDED);
		if (arg1 == UNPROVIDED) {
			arg1 = NIL;
		}
		if (arg2 == UNPROVIDED) {
			arg2 = NIL;
		}
		if (arg3 == UNPROVIDED) {
			arg3 = NIL;
		}
		if (arg4 == UNPROVIDED) {
			arg4 = NIL;
		}
		final SubLObject controlling_strategy = inference_tactician.controlling_strategy(substrategy);
		if (substrategy.eql(controlling_strategy)) {
			return NIL;
		}
		if (NIL != arg4_providedP) {
			return inference_datastructures_strategy.strategy_dispatch(controlling_strategy, method_type, substrategy,
					arg1, arg2, arg3, arg4);
		}
		if (NIL != arg3_providedP) {
			return inference_datastructures_strategy.strategy_dispatch(controlling_strategy, method_type, substrategy,
					arg1, arg2, arg3, UNPROVIDED);
		}
		if (NIL != arg2_providedP) {
			return inference_datastructures_strategy.strategy_dispatch(controlling_strategy, method_type, substrategy,
					arg1, arg2, UNPROVIDED, UNPROVIDED);
		}
		if (NIL != arg1_providedP) {
			return inference_datastructures_strategy.strategy_dispatch(controlling_strategy, method_type, substrategy,
					arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return inference_datastructures_strategy.strategy_dispatch(controlling_strategy, method_type, substrategy,
				UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject strategy_type_p_alt(SubLObject v_object) {
		return dictionary.dictionary_lookup($strategy_type_store$.getGlobalValue(), v_object, UNPROVIDED);
	}

	public static SubLObject strategy_type_p(final SubLObject v_object) {
		return dictionary.dictionary_lookup($strategy_type_store$.getGlobalValue(), v_object, UNPROVIDED);
	}

	public static SubLObject new_strategy_type_alt(SubLObject type, SubLObject plist) {
		SubLTrampolineFile.checkType(plist, PROPERTY_LIST_P);
		deregister_strategy_type(type);
		{
			SubLObject remainder = NIL;
			for (remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
				{
					SubLObject property = remainder.first();
					SubLObject value = cadr(remainder);
					set_strategy_type_property(type, property, value);
				}
			}
		}
		return type;
	}

	public static SubLObject new_strategy_type(final SubLObject type, final SubLObject plist) {
		assert NIL != list_utilities.property_list_p(plist) : "! list_utilities.property_list_p(plist) "
				+ ("list_utilities.property_list_p(plist) "
						+ "CommonSymbols.NIL != list_utilities.property_list_p(plist) ")
				+ plist;
		inference_datastructures_strategy.deregister_strategy_type(type);
		SubLObject remainder;
		SubLObject property;
		SubLObject value;
		for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
			property = remainder.first();
			value = cadr(remainder);
			inference_datastructures_strategy.set_strategy_type_property(type, property, value);
		}
		return type;
	}

	public static SubLObject deregister_strategy_type_alt(SubLObject type) {
		return dictionary.dictionary_remove($strategy_type_store$.getGlobalValue(), type);
	}

	public static SubLObject deregister_strategy_type(final SubLObject type) {
		return dictionary.dictionary_remove($strategy_type_store$.getGlobalValue(), type);
	}

	public static SubLObject clear_strategy_type_store_alt() {
		dictionary.clear_dictionary($strategy_type_store$.getGlobalValue());
		return NIL;
	}

	public static SubLObject clear_strategy_type_store() {
		dictionary.clear_dictionary($strategy_type_store$.getGlobalValue());
		return NIL;
	}

	public static SubLObject strategy_type_property_alt(SubLObject type, SubLObject property) {
		return dictionary_utilities.dictionary_getf($strategy_type_store$.getGlobalValue(), type, property, UNPROVIDED);
	}

	public static SubLObject strategy_type_property(final SubLObject type, final SubLObject property) {
		return dictionary_utilities.dictionary_getf($strategy_type_store$.getGlobalValue(), type, property, UNPROVIDED);
	}

	public static SubLObject set_strategy_type_property_alt(SubLObject type, SubLObject property, SubLObject value) {
		SubLTrampolineFile.checkType(property, STRATEGY_TYPE_PROPERTY_P);
		return dictionary_utilities.dictionary_putf($strategy_type_store$.getGlobalValue(), type, property, value);
	}

	public static SubLObject set_strategy_type_property(final SubLObject type, final SubLObject property,
			final SubLObject value) {
		assert NIL != inference_datastructures_enumerated_types.strategy_type_property_p(
				property) : "! inference_datastructures_enumerated_types.strategy_type_property_p(property) "
						+ ("inference_datastructures_enumerated_types.strategy_type_property_p(property) "
								+ "CommonSymbols.NIL != inference_datastructures_enumerated_types.strategy_type_property_p(property) ")
						+ property;
		return dictionary_utilities.dictionary_putf($strategy_type_store$.getGlobalValue(), type, property, value);
	}

	public static SubLObject default_uninterestingness_cache_value() {
		return make_vector(TWO_INTEGER, $RECOMPUTE);
	}

	public static SubLObject problem_strategic_properties_print_function_trampoline_alt(SubLObject v_object,
			SubLObject stream) {
		compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject problem_strategic_properties_print_function_trampoline(final SubLObject v_object,
			final SubLObject stream) {
		compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject problem_strategic_properties_p_alt(SubLObject v_object) {
		return v_object.getClass() == inference_datastructures_strategy.$problem_strategic_properties_native.class
				? ((SubLObject) (T))
				: NIL;
	}

	public static SubLObject problem_strategic_properties_p(final SubLObject v_object) {
		return v_object.getClass() == inference_datastructures_strategy.$problem_strategic_properties_native.class ? T
				: NIL;
	}

	public static SubLObject prob_strategic_properties_status_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, PROBLEM_STRATEGIC_PROPERTIES_P);
		return v_object.getField2();
	}

	public static SubLObject prob_strategic_properties_status(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy.problem_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.problem_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.problem_strategic_properties_p error :" + v_object;
		return v_object.getField2();
	}

	public static SubLObject prob_strategic_properties_tactic_strategic_property_index_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, PROBLEM_STRATEGIC_PROPERTIES_P);
		return v_object.getField3();
	}

	public static SubLObject prob_strategic_properties_tactic_strategic_property_index(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy.problem_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.problem_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.problem_strategic_properties_p error :" + v_object;
		return v_object.getField3();
	}

	public static SubLObject prob_strategic_properties_possible_tactic_count_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, PROBLEM_STRATEGIC_PROPERTIES_P);
		return v_object.getField4();
	}

	public static SubLObject prob_strategic_properties_possible_tactic_count(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy.problem_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.problem_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.problem_strategic_properties_p error :" + v_object;
		return v_object.getField4();
	}

	public static SubLObject prob_strategic_properties_uninterestingness(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy.problem_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.problem_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.problem_strategic_properties_p error :" + v_object;
		return v_object.getField5();
	}

	public static SubLObject _csetf_prob_strategic_properties_status_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, PROBLEM_STRATEGIC_PROPERTIES_P);
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_prob_strategic_properties_status(final SubLObject v_object,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy.problem_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.problem_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.problem_strategic_properties_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_prob_strategic_properties_tactic_strategic_property_index_alt(SubLObject v_object,
			SubLObject value) {
		SubLTrampolineFile.checkType(v_object, PROBLEM_STRATEGIC_PROPERTIES_P);
		return v_object.setField3(value);
	}

	public static SubLObject _csetf_prob_strategic_properties_tactic_strategic_property_index(final SubLObject v_object,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy.problem_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.problem_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.problem_strategic_properties_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static SubLObject _csetf_prob_strategic_properties_possible_tactic_count_alt(SubLObject v_object,
			SubLObject value) {
		SubLTrampolineFile.checkType(v_object, PROBLEM_STRATEGIC_PROPERTIES_P);
		return v_object.setField4(value);
	}

	public static SubLObject _csetf_prob_strategic_properties_possible_tactic_count(final SubLObject v_object,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy.problem_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.problem_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.problem_strategic_properties_p error :" + v_object;
		return v_object.setField4(value);
	}

	public static SubLObject _csetf_prob_strategic_properties_uninterestingness(final SubLObject v_object,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy.problem_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.problem_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.problem_strategic_properties_p error :" + v_object;
		return v_object.setField5(value);
	}

	public static SubLObject make_problem_strategic_properties_alt(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		{
			SubLObject v_new = new inference_datastructures_strategy.$problem_strategic_properties_native();
			SubLObject next = NIL;
			for (next = arglist; NIL != next; next = cddr(next)) {
				{
					SubLObject current_arg = next.first();
					SubLObject current_value = cadr(next);
					SubLObject pcase_var = current_arg;
					if (pcase_var.eql($STATUS)) {
						_csetf_prob_strategic_properties_status(v_new, current_value);
					} else {
						if (pcase_var.eql($TACTIC_STRATEGIC_PROPERTY_INDEX)) {
							_csetf_prob_strategic_properties_tactic_strategic_property_index(v_new, current_value);
						} else {
							if (pcase_var.eql($POSSIBLE_TACTIC_COUNT)) {
								_csetf_prob_strategic_properties_possible_tactic_count(v_new, current_value);
							} else {
								if (pcase_var.eql($FLAGS)) {
									_csetf_prob_strategic_properties_flags(v_new, current_value);
								} else {
									Errors.error($str_alt53$Invalid_slot__S_for_construction_, current_arg);
								}
							}
						}
					}
				}
			}
			return v_new;
		}
	}

	public static SubLObject make_problem_strategic_properties(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new inference_datastructures_strategy.$problem_strategic_properties_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($STATUS)) {
				inference_datastructures_strategy._csetf_prob_strategic_properties_status(v_new, current_value);
			} else if (pcase_var.eql($TACTIC_STRATEGIC_PROPERTY_INDEX)) {
				inference_datastructures_strategy
						._csetf_prob_strategic_properties_tactic_strategic_property_index(v_new, current_value);
			} else if (pcase_var.eql($POSSIBLE_TACTIC_COUNT)) {
				inference_datastructures_strategy._csetf_prob_strategic_properties_possible_tactic_count(v_new,
						current_value);
			} else if (pcase_var.eql($UNINTERESTINGNESS)) {
				inference_datastructures_strategy._csetf_prob_strategic_properties_uninterestingness(v_new,
						current_value);
			} else {
				Errors.error(inference_datastructures_strategy.$str57$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_problem_strategic_properties(final SubLObject obj,
			final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, inference_datastructures_strategy.MAKE_PROBLEM_STRATEGIC_PROPERTIES,
				FOUR_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $STATUS,
				inference_datastructures_strategy.prob_strategic_properties_status(obj));
		funcall(visitor_fn, obj, $SLOT, $TACTIC_STRATEGIC_PROPERTY_INDEX,
				inference_datastructures_strategy.prob_strategic_properties_tactic_strategic_property_index(obj));
		funcall(visitor_fn, obj, $SLOT, $POSSIBLE_TACTIC_COUNT,
				inference_datastructures_strategy.prob_strategic_properties_possible_tactic_count(obj));
		funcall(visitor_fn, obj, $SLOT, $UNINTERESTINGNESS,
				inference_datastructures_strategy.prob_strategic_properties_uninterestingness(obj));
		funcall(visitor_fn, obj, $END, inference_datastructures_strategy.MAKE_PROBLEM_STRATEGIC_PROPERTIES,
				FOUR_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_problem_strategic_properties_method(final SubLObject obj,
			final SubLObject visitor_fn) {
		return inference_datastructures_strategy.visit_defstruct_problem_strategic_properties(obj, visitor_fn);
	}

	public static SubLObject new_problem_strategic_properties_alt() {
		{
			SubLObject problem_strategic_properties = make_problem_strategic_properties(UNPROVIDED);
			_csetf_prob_strategic_properties_status(problem_strategic_properties, $NEW);
			_csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties, NIL);
			_csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, ZERO_INTEGER);
			_csetf_prob_strategic_properties_flags(problem_strategic_properties,
					$default_uninterestingness_flags$.getGlobalValue());
			return problem_strategic_properties;
		}
	}

	public static SubLObject new_problem_strategic_properties() {
		final SubLObject problem_strategic_properties = inference_datastructures_strategy
				.make_problem_strategic_properties(UNPROVIDED);
		inference_datastructures_strategy._csetf_prob_strategic_properties_status(problem_strategic_properties, $NEW);
		inference_datastructures_strategy
				._csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties, NIL);
		inference_datastructures_strategy
				._csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, ZERO_INTEGER);
		inference_datastructures_strategy._csetf_prob_strategic_properties_uninterestingness(
				problem_strategic_properties,
				inference_datastructures_strategy.default_uninterestingness_cache_value());
		return problem_strategic_properties;
	}

	/**
	 *
	 *
	 * @return problem-strategic-properties-p or NIL if uninitialized
	 */
	@LispMethod(comment = "@return problem-strategic-properties-p or NIL if uninitialized")
	public static SubLObject problem_strategic_properties_int_alt(SubLObject problem, SubLObject strategy) {
		SubLTrampolineFile.checkType(problem, PROBLEM_P);
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		{
			SubLObject problem_strategic_properties = gethash_without_values(problem,
					strategy_problem_strategic_index(strategy), UNPROVIDED);
			return problem_strategic_properties;
		}
	}

	/**
	 *
	 *
	 * @return problem-strategic-properties-p or NIL if uninitialized
	 */
	@LispMethod(comment = "@return problem-strategic-properties-p or NIL if uninitialized")
	public static SubLObject problem_strategic_properties_int(final SubLObject problem, final SubLObject strategy) {
		assert NIL != inference_datastructures_problem
				.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) "
						+ ("inference_datastructures_problem.problem_p(problem) "
								+ "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ")
						+ problem;
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		final SubLObject problem_strategic_properties = gethash_without_values(problem,
				inference_datastructures_strategy.strategy_problem_strategic_index(strategy), UNPROVIDED);
		return problem_strategic_properties;
	}

	public static SubLObject set_problem_strategic_properties_alt(SubLObject problem, SubLObject strategy,
			SubLObject v_properties) {
		SubLTrampolineFile.checkType(problem, PROBLEM_P);
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		SubLTrampolineFile.checkType(v_properties, PROBLEM_STRATEGIC_PROPERTIES_P);
		{
			SubLObject hash = strategy_problem_strategic_index(strategy);
			sethash(problem, hash, v_properties);
		}
		return problem;
	}

	public static SubLObject set_problem_strategic_properties(final SubLObject problem, final SubLObject strategy,
			final SubLObject v_properties) {
		assert NIL != inference_datastructures_problem
				.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) "
						+ ("inference_datastructures_problem.problem_p(problem) "
								+ "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ")
						+ problem;
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		assert NIL != inference_datastructures_strategy.problem_strategic_properties_p(
				v_properties) : "! inference_datastructures_strategy.problem_strategic_properties_p(v_properties) "
						+ ("inference_datastructures_strategy.problem_strategic_properties_p(v_properties) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.problem_strategic_properties_p(v_properties) ")
						+ v_properties;
		final SubLObject hash = inference_datastructures_strategy.strategy_problem_strategic_index(strategy);
		sethash(problem, hash, v_properties);
		return problem;
	}

	public static SubLObject remove_problem_strategic_properties_alt(SubLObject problem, SubLObject strategy) {
		{
			SubLObject hash = strategy_problem_strategic_index(strategy);
			remhash(problem, hash);
		}
		return problem;
	}

	public static SubLObject remove_problem_strategic_properties(final SubLObject problem, final SubLObject strategy) {
		final SubLObject hash = inference_datastructures_strategy.strategy_problem_strategic_index(strategy);
		remhash(problem, hash);
		return problem;
	}

	/**
	 * Initializes the problem-strategic-properties if they do not exist yet.
	 */
	@LispMethod(comment = "Initializes the problem-strategic-properties if they do not exist yet.")
	public static SubLObject problem_strategic_properties_alt(SubLObject problem, SubLObject strategy) {
		{
			SubLObject problem_strategic_properties = problem_strategic_properties_int(problem, strategy);
			if (NIL == problem_strategic_properties_p(problem_strategic_properties)) {
				problem_strategic_properties = new_problem_strategic_properties();
				set_problem_strategic_properties(problem, strategy, problem_strategic_properties);
			}
			return problem_strategic_properties;
		}
	}

	@LispMethod(comment = "Initializes the problem-strategic-properties if they do not exist yet.")
	public static SubLObject problem_strategic_properties(final SubLObject problem, final SubLObject strategy) {
		SubLObject problem_strategic_properties = inference_datastructures_strategy
				.problem_strategic_properties_int(problem, strategy);
		if (NIL == inference_datastructures_strategy.problem_strategic_properties_p(problem_strategic_properties)) {
			problem_strategic_properties = inference_datastructures_strategy.new_problem_strategic_properties();
			inference_datastructures_strategy.set_problem_strategic_properties(problem, strategy,
					problem_strategic_properties);
		}
		return problem_strategic_properties;
	}

	/**
	 * Initializes the tactic-properties-vector if it does not exist yet.
	 */
	@LispMethod(comment = "Initializes the tactic-properties-vector if it does not exist yet.")
	public static SubLObject problem_strategic_properties_tactic_strategic_property_index_alt(SubLObject problem,
			SubLObject problem_strategic_properties) {
		{
			SubLObject tactic_properties_vector = prob_strategic_properties_tactic_strategic_property_index(
					problem_strategic_properties);
			if (!tactic_properties_vector.isVector()) {
				tactic_properties_vector = make_vector(inference_datastructures_problem.problem_tactic_count(problem),
						UNPROVIDED);
				_csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties,
						tactic_properties_vector);
			}
			if (length(tactic_properties_vector).numL(inference_datastructures_problem.problem_tactic_count(problem))) {
				tactic_properties_vector = vector_utilities.extend_vector_to(tactic_properties_vector,
						inference_datastructures_problem.problem_tactic_count(problem), UNPROVIDED);
				_csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties,
						tactic_properties_vector);
			}
			return tactic_properties_vector;
		}
	}

	@LispMethod(comment = "Initializes the tactic-properties-vector if it does not exist yet.")
	public static SubLObject problem_strategic_properties_tactic_strategic_property_index(final SubLObject problem,
			final SubLObject problem_strategic_properties) {
		SubLObject tactic_properties_vector = inference_datastructures_strategy
				.prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties);
		if (!tactic_properties_vector.isVector()) {
			tactic_properties_vector = make_vector(inference_datastructures_problem.problem_tactic_count(problem),
					UNPROVIDED);
			inference_datastructures_strategy._csetf_prob_strategic_properties_tactic_strategic_property_index(
					problem_strategic_properties, tactic_properties_vector);
		}
		if (length(tactic_properties_vector).numL(inference_datastructures_problem.problem_tactic_count(problem))) {
			tactic_properties_vector = vector_utilities.extend_vector_to(tactic_properties_vector,
					inference_datastructures_problem.problem_tactic_count(problem), UNPROVIDED);
			inference_datastructures_strategy._csetf_prob_strategic_properties_tactic_strategic_property_index(
					problem_strategic_properties, tactic_properties_vector);
		}
		return tactic_properties_vector;
	}

	public static SubLObject problem_dwimmed_strategic_status(final SubLObject problem, final SubLObject strategy) {
		final SubLObject strategic_status = inference_datastructures_strategy.problem_raw_strategic_status(problem,
				strategy);
		if (NIL != inference_worker.problem_goodP(problem)) {
			final SubLObject dwimmed_status = inference_worker.good_version_of_problem_status(strategic_status);
			return dwimmed_status;
		}
		return strategic_status;
	}

	public static SubLObject problem_raw_strategic_status_alt(SubLObject problem, SubLObject strategy) {
		{
			SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
			SubLObject strategic_status = prob_strategic_properties_status(problem_strategic_properties);
			if (($NEW == strategic_status) && ($NEW != inference_datastructures_problem.problem_status(problem))) {
				return $UNEXAMINED;
			} else {
				return strategic_status;
			}
		}
	}

	public static SubLObject problem_raw_strategic_status(final SubLObject problem, final SubLObject strategy) {
		final SubLObject problem_strategic_properties = inference_datastructures_strategy
				.problem_strategic_properties(problem, strategy);
		final SubLObject strategic_status = inference_datastructures_strategy
				.prob_strategic_properties_status(problem_strategic_properties);
		if (($NEW == strategic_status) && ($NEW != inference_datastructures_problem.problem_status(problem))) {
			return $UNEXAMINED;
		}
		return strategic_status;
	}

	public static SubLObject problem_weak_strategic_status(final SubLObject problem, final SubLObject strategy) {
		final SubLObject status = inference_datastructures_strategy.problem_raw_strategic_status(problem, strategy);
		final SubLObject weak_tactical_status = inference_datastructures_enumerated_types
				.tactical_status_from_problem_status(status);
		return weak_tactical_status;
	}

	public static SubLObject problem_strategic_status_alt(SubLObject problem, SubLObject strategy) {
		{
			SubLObject status = problem_raw_strategic_status(problem, strategy);
			SubLObject weak_tactical_status = inference_datastructures_enumerated_types
					.tactical_status_from_problem_status(status);
			if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) {
				return $FINISHED;
			} else {
				return weak_tactical_status;
			}
		}
	}

	public static SubLObject problem_strategic_status(final SubLObject problem, final SubLObject strategy) {
		final SubLObject weak_tactical_status = inference_datastructures_strategy.problem_weak_strategic_status(problem,
				strategy);
		if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) {
			return $FINISHED;
		}
		return weak_tactical_status;
	}

	public static SubLObject problem_strategic_provability_status_alt(SubLObject problem, SubLObject strategy) {
		{
			SubLObject status = problem_raw_strategic_status(problem, strategy);
			SubLObject weak_provability_status = inference_datastructures_enumerated_types
					.provability_status_from_problem_status(status);
			if (($NEUTRAL == weak_provability_status)
					&& (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
				return $GOOD;
			} else {
				if (($NEUTRAL == weak_provability_status)
						&& (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
					return $NO_GOOD;
				} else {
					return weak_provability_status;
				}
			}
		}
	}

	public static SubLObject problem_strategic_provability_status(final SubLObject problem, final SubLObject strategy) {
		final SubLObject status = inference_datastructures_strategy.problem_dwimmed_strategic_status(problem, strategy);
		final SubLObject weak_provability_status = inference_datastructures_enumerated_types
				.provability_status_from_problem_status(status);
		if (($NEUTRAL == weak_provability_status)
				&& (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
			return $NO_GOOD;
		}
		return weak_provability_status;
	}

	/**
	 * If STRATEGIC-CONTEXT is :tactical, returns PROBLEM's tactical status.
	 * If STRATEGIC-CONTEXT is STRATEGY, returns PROBLEM's strategic status wrt STRATEGY.
	 */
	@LispMethod(comment = "If STRATEGIC-CONTEXT is :tactical, returns PROBLEM\'s tactical status.\r\nIf STRATEGIC-CONTEXT is STRATEGY, returns PROBLEM\'s strategic status wrt STRATEGY.\nIf STRATEGIC-CONTEXT is :tactical, returns PROBLEM\'s tactical status.\nIf STRATEGIC-CONTEXT is STRATEGY, returns PROBLEM\'s strategic status wrt STRATEGY.")
	public static SubLObject problem_tactical_or_strategic_status_alt(SubLObject problem,
			SubLObject strategic_context) {
		SubLTrampolineFile.checkType(strategic_context, STRATEGIC_CONTEXT_P);
		return NIL != strategy_p(strategic_context)
				? ((SubLObject) (problem_strategic_status(problem, strategic_context)))
				: inference_datastructures_problem.problem_tactical_status(problem);
	}

	@LispMethod(comment = "If STRATEGIC-CONTEXT is :tactical, returns PROBLEM\'s tactical status.\r\nIf STRATEGIC-CONTEXT is STRATEGY, returns PROBLEM\'s strategic status wrt STRATEGY.\nIf STRATEGIC-CONTEXT is :tactical, returns PROBLEM\'s tactical status.\nIf STRATEGIC-CONTEXT is STRATEGY, returns PROBLEM\'s strategic status wrt STRATEGY.")
	public static SubLObject problem_tactical_or_strategic_status(final SubLObject problem,
			final SubLObject strategic_context) {
		assert NIL != inference_worker
				.strategic_context_p(strategic_context) : "! inference_worker.strategic_context_p(strategic_context) "
						+ ("inference_worker.strategic_context_p(strategic_context) "
								+ "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) ")
						+ strategic_context;
		return NIL != inference_datastructures_strategy.strategy_p(strategic_context)
				? inference_datastructures_strategy.problem_strategic_status(problem, strategic_context)
				: inference_datastructures_problem.problem_tactical_status(problem);
	}

	/**
	 * If STRATEGIC-CONTEXT is :tactical, returns PROBLEM's tactical provability status.
	 * If STRATEGIC-CONTEXT is STRATEGY, returns PROBLEM's strategic provability status wrt STRATEGY.
	 */
	@LispMethod(comment = "If STRATEGIC-CONTEXT is :tactical, returns PROBLEM\'s tactical provability status.\r\nIf STRATEGIC-CONTEXT is STRATEGY, returns PROBLEM\'s strategic provability status wrt STRATEGY.\nIf STRATEGIC-CONTEXT is :tactical, returns PROBLEM\'s tactical provability status.\nIf STRATEGIC-CONTEXT is STRATEGY, returns PROBLEM\'s strategic provability status wrt STRATEGY.")
	public static SubLObject problem_provability_status_alt(SubLObject problem, SubLObject strategic_context) {
		SubLTrampolineFile.checkType(strategic_context, STRATEGIC_CONTEXT_P);
		return NIL != strategy_p(strategic_context)
				? ((SubLObject) (problem_strategic_provability_status(problem, strategic_context)))
				: inference_datastructures_problem.problem_tactical_provability_status(problem);
	}

	@LispMethod(comment = "If STRATEGIC-CONTEXT is :tactical, returns PROBLEM\'s tactical provability status.\r\nIf STRATEGIC-CONTEXT is STRATEGY, returns PROBLEM\'s strategic provability status wrt STRATEGY.\nIf STRATEGIC-CONTEXT is :tactical, returns PROBLEM\'s tactical provability status.\nIf STRATEGIC-CONTEXT is STRATEGY, returns PROBLEM\'s strategic provability status wrt STRATEGY.")
	public static SubLObject problem_provability_status(final SubLObject problem, final SubLObject strategic_context) {
		assert NIL != inference_worker
				.strategic_context_p(strategic_context) : "! inference_worker.strategic_context_p(strategic_context) "
						+ ("inference_worker.strategic_context_p(strategic_context) "
								+ "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) ")
						+ strategic_context;
		return NIL != inference_datastructures_strategy.strategy_p(strategic_context)
				? inference_datastructures_strategy.problem_strategic_provability_status(problem, strategic_context)
				: inference_datastructures_problem.problem_tactical_provability_status(problem);
	}

	public static SubLObject set_problem_raw_strategic_status_alt(SubLObject problem, SubLObject strategy,
			SubLObject status) {
		{
			SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
			_csetf_prob_strategic_properties_status(problem_strategic_properties, status);
		}
		return problem;
	}

	public static SubLObject set_problem_raw_strategic_status(final SubLObject problem, final SubLObject strategy,
			final SubLObject status) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
				&& (NIL != inference_datastructures_enumerated_types.good_problem_status_p(status))) {
			Errors.error(inference_datastructures_strategy.$str146$poking_good_status__s_into_proble, status, problem,
					strategy);
		}
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
				&& (inference_datastructures_strategy.$POSSIBLE_NO_GOOD == status)) {
			Errors.error(inference_datastructures_strategy.$str148$_possible_no_good__s_wrt__s, problem, strategy);
		}
		final SubLObject problem_strategic_properties = inference_datastructures_strategy
				.problem_strategic_properties(problem, strategy);
		inference_datastructures_strategy._csetf_prob_strategic_properties_status(problem_strategic_properties, status);
		return problem;
	}

	public static SubLObject strategically_unexamined_problem_p_alt(SubLObject problem, SubLObject strategy) {
		return eq($UNEXAMINED, problem_strategic_status(problem, strategy));
	}

	public static SubLObject strategically_unexamined_problem_p(final SubLObject problem, final SubLObject strategy) {
		return eq($UNEXAMINED, inference_datastructures_strategy.problem_strategic_status(problem, strategy));
	}

	public static SubLObject strategically_examined_problem_p_alt(SubLObject problem, SubLObject strategy) {
		return eq($EXAMINED, problem_strategic_status(problem, strategy));
	}

	public static SubLObject strategically_examined_problem_p(final SubLObject problem, final SubLObject strategy) {
		return eq($EXAMINED, inference_datastructures_strategy.problem_strategic_status(problem, strategy));
	}

	public static SubLObject strategically_possible_problem_p_alt(SubLObject problem, SubLObject strategy) {
		return eq($POSSIBLE, problem_strategic_status(problem, strategy));
	}

	public static SubLObject strategically_possible_problem_p(final SubLObject problem, final SubLObject strategy) {
		return eq($POSSIBLE, inference_datastructures_strategy.problem_strategic_status(problem, strategy));
	}

	public static SubLObject strategically_pending_problem_p_alt(SubLObject problem, SubLObject strategy) {
		return eq($PENDING, problem_strategic_status(problem, strategy));
	}

	public static SubLObject strategically_pending_problem_p(final SubLObject problem, final SubLObject strategy) {
		return eq($PENDING, inference_datastructures_strategy.problem_strategic_status(problem, strategy));
	}

	public static SubLObject strategically_finished_problem_p_alt(SubLObject problem, SubLObject strategy) {
		return eq($FINISHED, problem_strategic_status(problem, strategy));
	}

	public static SubLObject strategically_finished_problem_p(final SubLObject problem, final SubLObject strategy) {
		return eq($FINISHED, inference_datastructures_strategy.problem_strategic_status(problem, strategy));
	}

	public static SubLObject strategically_no_good_problem_p_alt(SubLObject problem, SubLObject strategy) {
		return eq($NO_GOOD, problem_strategic_provability_status(problem, strategy));
	}

	public static SubLObject strategically_no_good_problem_p(final SubLObject problem, final SubLObject strategy) {
		return eq($NO_GOOD, inference_datastructures_strategy.problem_strategic_provability_status(problem, strategy));
	}

	public static SubLObject strategically_neutral_problem_p_alt(SubLObject problem, SubLObject strategy) {
		return eq($NEUTRAL, problem_strategic_provability_status(problem, strategy));
	}

	public static SubLObject strategically_neutral_problem_p(final SubLObject problem, final SubLObject strategy) {
		return eq($NEUTRAL, inference_datastructures_strategy.problem_strategic_provability_status(problem, strategy));
	}

	public static SubLObject strategically_good_problem_p_alt(SubLObject problem, SubLObject strategy) {
		return eq($GOOD, problem_strategic_provability_status(problem, strategy));
	}

	public static SubLObject strategically_good_problem_p(final SubLObject problem, final SubLObject strategy) {
		return inference_worker.problem_goodP(problem);
	}

	public static SubLObject strategically_potentially_possible_problem_p_alt(SubLObject problem, SubLObject strategy) {
		return makeBoolean((NIL != strategically_possible_problem_p(problem, strategy))
				|| (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)));
	}

	public static SubLObject strategically_potentially_possible_problem_p(final SubLObject problem,
			final SubLObject strategy) {
		return makeBoolean(
				(NIL != inference_datastructures_strategy.strategically_possible_problem_p(problem, strategy))
						|| (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)));
	}

	public static SubLObject strategically_not_potentially_possible_problem_p_alt(SubLObject problem,
			SubLObject strategy) {
		return makeBoolean(((NIL != strategically_examined_problem_p(problem, strategy))
				|| (NIL != strategically_pending_problem_p(problem, strategy)))
				|| (NIL != strategically_finished_problem_p(problem, strategy)));
	}

	public static SubLObject strategically_not_potentially_possible_problem_p(final SubLObject problem,
			final SubLObject strategy) {
		return makeBoolean(((NIL != inference_datastructures_strategy.strategically_examined_problem_p(problem,
				strategy))
				|| (NIL != inference_datastructures_strategy.strategically_pending_problem_p(problem, strategy)))
				|| (NIL != inference_datastructures_strategy.strategically_finished_problem_p(problem, strategy)));
	}

	public static SubLObject strategically_totally_no_good_problem_p_alt(SubLObject problem, SubLObject strategy) {
		return strategically_no_good_problem_p(problem, inference_tactician.controlling_strategy(strategy));
	}

	public static SubLObject strategically_totally_no_good_problem_p(final SubLObject problem,
			final SubLObject strategy) {
		return inference_datastructures_strategy.strategically_no_good_problem_p(problem,
				inference_tactician.controlling_strategy(strategy));
	}

	public static SubLObject problem_strategic_uninterestingness(final SubLObject problem, final SubLObject strategy) {
		final SubLObject problem_strategic_properties = inference_datastructures_strategy
				.problem_strategic_properties(problem, strategy);
		return inference_datastructures_strategy
				.prob_strategic_properties_uninterestingness(problem_strategic_properties);
	}

	public static SubLObject set_problem_strategic_uninterestingness(final SubLObject problem,
			final SubLObject strategy, final SubLObject uninterestingness) {
		assert NIL != inference_datastructures_strategy.uninterestingness_cache_value_p(
				uninterestingness) : "! inference_datastructures_strategy.uninterestingness_cache_value_p(uninterestingness) "
						+ ("inference_datastructures_strategy.uninterestingness_cache_value_p(uninterestingness) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.uninterestingness_cache_value_p(uninterestingness) ")
						+ uninterestingness;
		final SubLObject problem_strategic_properties = inference_datastructures_strategy
				.problem_strategic_properties(problem, strategy);
		inference_datastructures_strategy
				._csetf_prob_strategic_properties_uninterestingness(problem_strategic_properties, uninterestingness);
		return uninterestingness;
	}

	public static SubLObject set_just_problem_thrown_away(final SubLObject problem, final SubLObject strategy,
			final SubLObject conditions) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.problem_strategic_uninterestingness(problem, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_thrown_away_value(uninterestingness, T, conditions);
		return inference_datastructures_strategy.set_problem_strategic_uninterestingness(problem, strategy,
				new_uninterestingness);
	}

	public static SubLObject set_just_problem_not_thrown_away(final SubLObject problem, final SubLObject strategy,
			final SubLObject conditions) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.problem_strategic_uninterestingness(problem, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_thrown_away_value(uninterestingness, NIL, conditions);
		return inference_datastructures_strategy.set_problem_strategic_uninterestingness(problem, strategy,
				new_uninterestingness);
	}

	public static SubLObject set_just_problem_recompute_thrown_away(final SubLObject problem,
			final SubLObject strategy) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.problem_strategic_uninterestingness(problem, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_thrown_away_value(uninterestingness, $RECOMPUTE, $ALL);
		return inference_datastructures_strategy.set_problem_strategic_uninterestingness(problem, strategy,
				new_uninterestingness);
	}

	public static SubLObject set_just_problem_set_aside(final SubLObject problem, final SubLObject strategy,
			final SubLObject conditions) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.problem_strategic_uninterestingness(problem, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_set_aside_value(uninterestingness, T, conditions);
		return inference_datastructures_strategy.set_problem_strategic_uninterestingness(problem, strategy,
				new_uninterestingness);
	}

	public static SubLObject set_just_problem_not_set_aside(final SubLObject problem, final SubLObject strategy,
			final SubLObject conditions) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.problem_strategic_uninterestingness(problem, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_set_aside_value(uninterestingness, NIL, conditions);
		return inference_datastructures_strategy.set_problem_strategic_uninterestingness(problem, strategy,
				new_uninterestingness);
	}

	public static SubLObject set_just_problem_recompute_set_aside(final SubLObject problem, final SubLObject strategy) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.problem_strategic_uninterestingness(problem, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_set_aside_value(uninterestingness, $RECOMPUTE, $ALL);
		return inference_datastructures_strategy.set_problem_strategic_uninterestingness(problem, strategy,
				new_uninterestingness);
	}

	public static SubLObject problem_thrown_away_cache_status(SubLObject problem, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_thrown_away_code(problem_strategic_flags(problem, strategy)));
	}

	public static SubLObject problem_thrown_away_cache_status(final SubLObject problem, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		return inference_datastructures_strategy.thrown_away_cache_status_from_uninterestingness(
				inference_datastructures_strategy.problem_strategic_uninterestingness(problem, strategy), conditions);
	}

	public static SubLObject problem_set_aside_cache_status(SubLObject problem, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_set_aside_code(problem_strategic_flags(problem, strategy)));
	}

	public static SubLObject problem_set_aside_cache_status(final SubLObject problem, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		return inference_datastructures_strategy.set_aside_cache_status_from_uninterestingness(
				inference_datastructures_strategy.problem_strategic_uninterestingness(problem, strategy), conditions);
	}

	public static SubLObject set_problem_thrown_away(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_thrown_away(final SubLObject problem, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		return inference_datastructures_strategy.set_just_problem_thrown_away(problem, strategy, conditions);
	}

	public static SubLObject set_problem_not_thrown_away(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_not_thrown_away(final SubLObject problem, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		return inference_datastructures_strategy.set_just_problem_not_thrown_away(problem, strategy, conditions);
	}

	public static SubLObject set_problem_set_aside(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_set_aside(final SubLObject problem, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		inference_datastructures_strategy.set_just_problem_set_aside(problem, strategy, conditions);
		return NIL;
	}

	public static SubLObject set_problem_not_set_aside(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_not_set_aside(final SubLObject problem, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		return inference_datastructures_strategy.set_just_problem_not_set_aside(problem, strategy, conditions);
	}

	public static SubLObject set_problem_recompute_thrown_away_alt(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_recompute_thrown_away(final SubLObject problem, final SubLObject strategy) {
		return inference_datastructures_strategy.set_just_problem_recompute_thrown_away(problem, strategy);
	}

	public static SubLObject set_problem_recompute_set_aside_alt(SubLObject problem, SubLObject strategy) {
		{
			SubLObject flags = problem_strategic_flags(problem, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_problem_strategic_flags(problem, strategy, new_flags);
		}
	}

	public static SubLObject set_problem_recompute_set_aside(final SubLObject problem, final SubLObject strategy) {
		return inference_datastructures_strategy.set_just_problem_recompute_set_aside(problem, strategy);
	}

	public static SubLObject tactic_strategic_properties_print_function_trampoline_alt(SubLObject v_object,
			SubLObject stream) {
		compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject tactic_strategic_properties_print_function_trampoline(final SubLObject v_object,
			final SubLObject stream) {
		compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject tactic_strategic_properties_p(final SubLObject v_object) {
		return v_object.getClass() == $tactic_strategic_properties_native.class ? T : NIL;
	}

	public static SubLObject tact_strategic_properties_preference_level_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, TACTIC_STRATEGIC_PROPERTIES_P);
		return v_object.getField2();
	}

	public static SubLObject tact_strategic_properties_preference_level(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy.tactic_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.tactic_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.tactic_strategic_properties_p error :" + v_object;
		return v_object.getField2();
	}

	public static SubLObject tact_strategic_properties_preference_level_justification_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, TACTIC_STRATEGIC_PROPERTIES_P);
		return v_object.getField3();
	}

	public static SubLObject tact_strategic_properties_preference_level_justification(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy.tactic_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.tactic_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.tactic_strategic_properties_p error :" + v_object;
		return v_object.getField3();
	}

	public static SubLObject tact_strategic_properties_productivity_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, TACTIC_STRATEGIC_PROPERTIES_P);
		return v_object.getField4();
	}

	public static SubLObject tact_strategic_properties_productivity(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy.tactic_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.tactic_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.tactic_strategic_properties_p error :" + v_object;
		return v_object.getField4();
	}

	public static SubLObject tact_strategic_properties_uninterestingness(final SubLObject v_object) {
		assert NIL != inference_datastructures_strategy.tactic_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.tactic_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.tactic_strategic_properties_p error :" + v_object;
		return v_object.getField5();
	}

	public static SubLObject _csetf_tact_strategic_properties_preference_level_alt(SubLObject v_object,
			SubLObject value) {
		SubLTrampolineFile.checkType(v_object, TACTIC_STRATEGIC_PROPERTIES_P);
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_tact_strategic_properties_preference_level(final SubLObject v_object,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy.tactic_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.tactic_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.tactic_strategic_properties_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_tact_strategic_properties_preference_level_justification_alt(SubLObject v_object,
			SubLObject value) {
		SubLTrampolineFile.checkType(v_object, TACTIC_STRATEGIC_PROPERTIES_P);
		return v_object.setField3(value);
	}

	public static SubLObject _csetf_tact_strategic_properties_preference_level_justification(final SubLObject v_object,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy.tactic_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.tactic_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.tactic_strategic_properties_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static SubLObject _csetf_tact_strategic_properties_productivity_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, TACTIC_STRATEGIC_PROPERTIES_P);
		return v_object.setField4(value);
	}

	public static SubLObject _csetf_tact_strategic_properties_productivity(final SubLObject v_object,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy.tactic_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.tactic_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.tactic_strategic_properties_p error :" + v_object;
		return v_object.setField4(value);
	}

	public static SubLObject _csetf_tact_strategic_properties_uninterestingness(final SubLObject v_object,
			final SubLObject value) {
		assert NIL != inference_datastructures_strategy.tactic_strategic_properties_p(
				v_object) : "! inference_datastructures_strategy.tactic_strategic_properties_p(v_object) "
						+ "inference_datastructures_strategy.tactic_strategic_properties_p error :" + v_object;
		return (($tactic_strategic_properties_native) v_object).$uninterestingness = (value);
	}

	public static SubLObject make_tactic_strategic_properties_alt(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		{
			SubLObject v_new = new $tactic_strategic_properties_native(NIL);
			SubLObject next = NIL;
			for (next = arglist; NIL != next; next = cddr(next)) {
				{
					SubLObject current_arg = next.first();
					SubLObject current_value = cadr(next);
					SubLObject pcase_var = current_arg;
					if (pcase_var.eql($PREFERENCE_LEVEL)) {
						_csetf_tact_strategic_properties_preference_level(v_new, current_value);
					} else {
						if (pcase_var.eql($PREFERENCE_LEVEL_JUSTIFICATION)) {
							_csetf_tact_strategic_properties_preference_level_justification(v_new, current_value);
						} else {
							if (pcase_var.eql($PRODUCTIVITY)) {
								_csetf_tact_strategic_properties_productivity(v_new, current_value);
							} else {
								if (pcase_var.eql($FLAGS)) {
									_csetf_tact_strategic_properties_flags(v_new, current_value);
								} else {
									Errors.error($str_alt53$Invalid_slot__S_for_construction_, current_arg);
								}
							}
						}
					}
				}
			}
			return v_new;
		}
	}

	public static final class $tactic_strategic_properties_native extends SubLStructNative {
		public $tactic_strategic_properties_native(SubLObject un) {
			$uninterestingness = un;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return $tactic_strategic_properties_native.structDecl;
		}

		@Override
		public SubLObject getField2() {
			return $preference_level;
		}

		@Override
		public SubLObject getField3() {
			return $preference_level_justification;
		}

		@Override
		public SubLObject getField4() {
			return $productivity;
		}

		@Override
		public SubLObject getField5() {
			return $flags;
		}

		@Override
		public SubLObject setField2(SubLObject value) {
			return $preference_level = value;
		}

		@Override
		public SubLObject setField3(SubLObject value) {
			return $preference_level_justification = value;
		}

		@Override
		public SubLObject setField4(SubLObject value) {
			return $productivity = value;
		}

		@Override
		public SubLObject setField5(SubLObject value) {
			return $flags = value;
		}

		public SubLObject $preference_level = Lisp.NIL;

		public SubLObject $preference_level_justification = Lisp.NIL;

		public SubLObject $productivity = Lisp.NIL;

		public SubLObject $flags = Lisp.NIL;

		public SubLObject $uninterestingness;

		private static final SubLStructDeclNative structDecl = makeStructDeclNative(
				$tactic_strategic_properties_native.class, TACTIC_STRATEGIC_PROPERTIES, TACTIC_STRATEGIC_PROPERTIES_P,
				new String[] { "$preference_level", "$preference_level_justification", "$productivity", "$flags",
						"$uninterestingness" },
				DEFAULT_STRUCT_PRINT_FUNCTION);
	}

	public static SubLObject make_tactic_strategic_properties(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new $tactic_strategic_properties_native(NIL);
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($PREFERENCE_LEVEL)) {
				inference_datastructures_strategy._csetf_tact_strategic_properties_preference_level(v_new,
						current_value);
			} else if (pcase_var.eql(inference_datastructures_strategy.$PREFERENCE_LEVEL_JUSTIFICATION)) {
				inference_datastructures_strategy._csetf_tact_strategic_properties_preference_level_justification(v_new,
						current_value);
			} else if (pcase_var.eql($PRODUCTIVITY)) {
				inference_datastructures_strategy._csetf_tact_strategic_properties_productivity(v_new, current_value);
			} else if (pcase_var.eql($UNINTERESTINGNESS)) {
				inference_datastructures_strategy._csetf_tact_strategic_properties_uninterestingness(v_new,
						current_value);
			} else {
				Errors.error(inference_datastructures_strategy.$str57$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_tactic_strategic_properties(final SubLObject obj,
			final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, inference_datastructures_strategy.MAKE_TACTIC_STRATEGIC_PROPERTIES,
				FOUR_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $PREFERENCE_LEVEL,
				inference_datastructures_strategy.tact_strategic_properties_preference_level(obj));
		funcall(visitor_fn, obj, $SLOT, inference_datastructures_strategy.$PREFERENCE_LEVEL_JUSTIFICATION,
				inference_datastructures_strategy.tact_strategic_properties_preference_level_justification(obj));
		funcall(visitor_fn, obj, $SLOT, $PRODUCTIVITY,
				inference_datastructures_strategy.tact_strategic_properties_productivity(obj));
		funcall(visitor_fn, obj, $SLOT, $UNINTERESTINGNESS,
				inference_datastructures_strategy.tact_strategic_properties_uninterestingness(obj));
		funcall(visitor_fn, obj, $END, inference_datastructures_strategy.MAKE_TACTIC_STRATEGIC_PROPERTIES,
				FOUR_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_tactic_strategic_properties_method(final SubLObject obj,
			final SubLObject visitor_fn) {
		return inference_datastructures_strategy.visit_defstruct_tactic_strategic_properties(obj, visitor_fn);
	}

	public static SubLObject new_tactic_strategic_properties_alt() {
		{
			SubLObject tactic_strategic_properties = make_tactic_strategic_properties(UNPROVIDED);
			_csetf_tact_strategic_properties_preference_level(tactic_strategic_properties, $DISALLOWED);
			_csetf_tact_strategic_properties_preference_level_justification(tactic_strategic_properties, $str_alt168$);
			_csetf_tact_strategic_properties_productivity(tactic_strategic_properties,
					number_utilities.positive_infinity());
			_csetf_tact_strategic_properties_flags(tactic_strategic_properties,
					$default_uninterestingness_flags$.getGlobalValue());
			return tactic_strategic_properties;
		}
	}

	public static SubLObject new_tactic_strategic_properties() {
		final SubLObject tactic_strategic_properties = inference_datastructures_strategy
				.make_tactic_strategic_properties(UNPROVIDED);
		inference_datastructures_strategy._csetf_tact_strategic_properties_preference_level(tactic_strategic_properties,
				preference_modules.$default_preference_level$.getGlobalValue());
		inference_datastructures_strategy._csetf_tact_strategic_properties_preference_level_justification(
				tactic_strategic_properties, inference_datastructures_strategy.$str175$);
		inference_datastructures_strategy._csetf_tact_strategic_properties_productivity(tactic_strategic_properties,
				number_utilities.positive_infinity());
		inference_datastructures_strategy._csetf_tact_strategic_properties_uninterestingness(
				tactic_strategic_properties, inference_datastructures_strategy.default_uninterestingness_cache_value());
		return tactic_strategic_properties;
	}

	/**
	 *
	 *
	 * @return tactic-strategic-properties-p or NIL if uninitialized
	 */
	@LispMethod(comment = "@return tactic-strategic-properties-p or NIL if uninitialized")
	public static SubLObject tactic_strategic_properties_int_alt(SubLObject tactic, SubLObject strategy) {
		SubLTrampolineFile.checkType(tactic, TACTIC_P);
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		{
			SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
			SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
			if (NIL != problem_strategic_properties_p(problem_strategic_properties)) {
				{
					SubLObject tactic_properties_vector = problem_strategic_properties_tactic_strategic_property_index(
							problem, problem_strategic_properties);
					if (tactic_properties_vector.isVector()) {
						{
							SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid(tactic);
							return aref(tactic_properties_vector, tactic_suid);
						}
					}
				}
			}
		}
		return NIL;
	}

	/**
	 *
	 *
	 * @return tactic-strategic-properties-p or NIL if uninitialized
	 */
	@LispMethod(comment = "@return tactic-strategic-properties-p or NIL if uninitialized")
	public static SubLObject tactic_strategic_properties_int(final SubLObject tactic, final SubLObject strategy) {
		assert NIL != inference_datastructures_tactic
				.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) "
						+ ("inference_datastructures_tactic.tactic_p(tactic) "
								+ "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ")
						+ tactic;
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
		final SubLObject problem_strategic_properties = inference_datastructures_strategy
				.problem_strategic_properties(problem, strategy);
		if (NIL != inference_datastructures_strategy.problem_strategic_properties_p(problem_strategic_properties)) {
			final SubLObject tactic_properties_vector = inference_datastructures_strategy
					.problem_strategic_properties_tactic_strategic_property_index(problem,
							problem_strategic_properties);
			if (tactic_properties_vector.isVector()) {
				final SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid(tactic);
				return aref(tactic_properties_vector, tactic_suid);
			}
		}
		return NIL;
	}

	public static SubLObject set_tactic_strategic_properties_alt(SubLObject tactic, SubLObject strategy,
			SubLObject v_properties) {
		SubLTrampolineFile.checkType(tactic, TACTIC_P);
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		SubLTrampolineFile.checkType(v_properties, TACTIC_STRATEGIC_PROPERTIES_P);
		{
			SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
			SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
			SubLObject tactic_properties_vector = problem_strategic_properties_tactic_strategic_property_index(problem,
					problem_strategic_properties);
			SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid(tactic);
			set_aref(tactic_properties_vector, tactic_suid, v_properties);
		}
		return tactic;
	}

	public static SubLObject set_tactic_strategic_properties(final SubLObject tactic, final SubLObject strategy,
			final SubLObject v_properties) {
		assert NIL != inference_datastructures_tactic
				.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) "
						+ ("inference_datastructures_tactic.tactic_p(tactic) "
								+ "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ")
						+ tactic;
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		assert NIL != inference_datastructures_strategy.tactic_strategic_properties_p(
				v_properties) : "! inference_datastructures_strategy.tactic_strategic_properties_p(v_properties) "
						+ ("inference_datastructures_strategy.tactic_strategic_properties_p(v_properties) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.tactic_strategic_properties_p(v_properties) ")
						+ v_properties;
		final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
		final SubLObject problem_strategic_properties = inference_datastructures_strategy
				.problem_strategic_properties(problem, strategy);
		final SubLObject tactic_properties_vector = inference_datastructures_strategy
				.problem_strategic_properties_tactic_strategic_property_index(problem, problem_strategic_properties);
		final SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid(tactic);
		set_aref(tactic_properties_vector, tactic_suid, v_properties);
		return tactic;
	}

	/**
	 * Initializes the tactic-strategic-properties if they do not exist yet.
	 */
	@LispMethod(comment = "Initializes the tactic-strategic-properties if they do not exist yet.")
	public static SubLObject tactic_strategic_properties_alt(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject tactic_strategic_properties = tactic_strategic_properties_int(tactic, strategy);
			if (NIL == tactic_strategic_properties_p(tactic_strategic_properties)) {
				tactic_strategic_properties = new_tactic_strategic_properties();
				set_tactic_strategic_properties(tactic, strategy, tactic_strategic_properties);
			}
			return tactic_strategic_properties;
		}
	}

	@LispMethod(comment = "Initializes the tactic-strategic-properties if they do not exist yet.")
	public static SubLObject tactic_strategic_properties(final SubLObject tactic, final SubLObject strategy) {
		SubLObject tactic_strategic_properties = inference_datastructures_strategy
				.tactic_strategic_properties_int(tactic, strategy);
		if (NIL == inference_datastructures_strategy.tactic_strategic_properties_p(tactic_strategic_properties)) {
			tactic_strategic_properties = inference_datastructures_strategy.new_tactic_strategic_properties();
			inference_datastructures_strategy.set_tactic_strategic_properties(tactic, strategy,
					tactic_strategic_properties);
		}
		return tactic_strategic_properties;
	}

	public static SubLObject tactic_strategic_completeness_alt(SubLObject tactic, SubLObject strategic_context) {
		SubLTrampolineFile.checkType(strategic_context, STRATEGIC_CONTEXT_P);
		if ($TACTICAL == strategic_context) {
			return inference_datastructures_tactic.tactic_completeness(tactic);
		} else {
			if (NIL != inference_worker.content_tactic_p(tactic)) {
				return inference_datastructures_tactic.tactic_completeness(tactic);
			} else {
				return Errors.error($str_alt171$structural_tactic__s_cannot_have_, tactic);
			}
		}
	}

	public static SubLObject tactic_strategic_completeness(final SubLObject tactic,
			final SubLObject strategic_context) {
		assert NIL != inference_worker
				.strategic_context_p(strategic_context) : "! inference_worker.strategic_context_p(strategic_context) "
						+ ("inference_worker.strategic_context_p(strategic_context) "
								+ "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) ")
						+ strategic_context;
		if ($TACTICAL == strategic_context) {
			return inference_datastructures_tactic.tactic_completeness(tactic);
		}
		if (NIL != inference_worker.content_tactic_p(tactic)) {
			return inference_datastructures_tactic.tactic_completeness(tactic);
		}
		return Errors.error(inference_datastructures_strategy.$str178$structural_tactic__s_cannot_have_, tactic);
	}

	public static SubLObject tactic_strategic_preference_level_alt(SubLObject tactic, SubLObject strategic_context) {
		SubLTrampolineFile.checkType(strategic_context, STRATEGIC_CONTEXT_P);
		if ($TACTICAL == strategic_context) {
			return inference_datastructures_tactic.tactic_preference_level(tactic);
		} else {
			if (NIL != inference_worker.generalized_structural_tactic_p(tactic)) {
				{
					SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
					return tact_strategic_properties_preference_level(tactic_strategic_properties);
				}
			} else {
				return Errors.error($str_alt172$content_tactic__s_cannot_have_a_p, tactic);
			}
		}
	}

	public static SubLObject tactic_strategic_preference_level(final SubLObject tactic,
			final SubLObject strategic_context) {
		assert NIL != inference_worker
				.strategic_context_p(strategic_context) : "! inference_worker.strategic_context_p(strategic_context) "
						+ ("inference_worker.strategic_context_p(strategic_context) "
								+ "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) ")
						+ strategic_context;
		if ($TACTICAL == strategic_context) {
			return inference_datastructures_tactic.tactic_preference_level(tactic);
		}
		if (NIL != inference_worker.generalized_structural_tactic_p(tactic)) {
			final SubLObject tactic_strategic_properties = inference_datastructures_strategy
					.tactic_strategic_properties(tactic, strategic_context);
			return inference_datastructures_strategy
					.tact_strategic_properties_preference_level(tactic_strategic_properties);
		}
		return Errors.error(inference_datastructures_strategy.$str179$content_tactic__s_cannot_have_a_p, tactic);
	}

	public static SubLObject tactic_strategic_preference_level_justification_alt(SubLObject tactic,
			SubLObject strategic_context) {
		SubLTrampolineFile.checkType(strategic_context, STRATEGIC_CONTEXT_P);
		if ($TACTICAL == strategic_context) {
			return inference_datastructures_tactic.tactic_preference_level_justification(tactic);
		} else {
			if (NIL != inference_worker.generalized_structural_tactic_p(tactic)) {
				{
					SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
					return tact_strategic_properties_preference_level_justification(tactic_strategic_properties);
				}
			} else {
				return Errors.error($str_alt173$content_tactic__s_cannot_have_a_p, tactic);
			}
		}
	}

	public static SubLObject tactic_strategic_preference_level_justification(final SubLObject tactic,
			final SubLObject strategic_context) {
		assert NIL != inference_worker
				.strategic_context_p(strategic_context) : "! inference_worker.strategic_context_p(strategic_context) "
						+ ("inference_worker.strategic_context_p(strategic_context) "
								+ "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) ")
						+ strategic_context;
		if ($TACTICAL == strategic_context) {
			return inference_datastructures_tactic.tactic_preference_level_justification(tactic);
		}
		if (NIL != inference_worker.generalized_structural_tactic_p(tactic)) {
			final SubLObject tactic_strategic_properties = inference_datastructures_strategy
					.tactic_strategic_properties(tactic, strategic_context);
			return inference_datastructures_strategy
					.tact_strategic_properties_preference_level_justification(tactic_strategic_properties);
		}
		return Errors.error(inference_datastructures_strategy.$str180$content_tactic__s_cannot_have_a_p, tactic);
	}

	/**
	 *
	 *
	 * @unknown 
	 */
	@LispMethod(comment = "@unknown")
	public static SubLObject tactic_strategic_dwimmed_completeness_alt(SubLObject tactic,
			SubLObject strategic_context) {
		if (NIL != inference_worker.content_tactic_p(tactic)) {
			return tactic_strategic_completeness(tactic, strategic_context);
		} else {
			return preference_level_to_completeness(tactic_strategic_preference_level(tactic, strategic_context));
		}
	}

	/**
	 *
	 *
	 * @unknown 
	 */
	@LispMethod(comment = "@unknown")
	public static SubLObject tactic_strategic_dwimmed_completeness(final SubLObject tactic,
			final SubLObject strategic_context) {
		if (NIL != inference_worker.content_tactic_p(tactic)) {
			return inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context);
		}
		return preference_modules.preference_level_to_completeness(
				inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
	}

	public static SubLObject conjunctive_tactic_strategic_preference_level_alt(SubLObject tactic,
			SubLObject strategic_context) {
		SubLTrampolineFile.checkType(tactic, GENERALIZED_CONJUNCTIVE_TACTIC_P);
		if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
			return completeness_to_preference_level(tactic_strategic_completeness(tactic, strategic_context));
		} else {
			return tactic_strategic_preference_level(tactic, strategic_context);
		}
	}

	public static SubLObject conjunctive_tactic_strategic_preference_level(final SubLObject tactic,
			final SubLObject strategic_context) {
		assert NIL != inference_worker.generalized_conjunctive_tactic_p(
				tactic) : "! inference_worker.generalized_conjunctive_tactic_p(tactic) "
						+ ("inference_worker.generalized_conjunctive_tactic_p(tactic) "
								+ "CommonSymbols.NIL != inference_worker.generalized_conjunctive_tactic_p(tactic) ")
						+ tactic;
		if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
			return preference_modules.completeness_to_preference_level(
					inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
		}
		return inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
	}

	public static SubLObject conjunctive_tactic_strategic_preference_level_justification_alt(SubLObject tactic,
			SubLObject strategic_context) {
		SubLTrampolineFile.checkType(tactic, GENERALIZED_CONJUNCTIVE_TACTIC_P);
		if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
			return string_utilities.str(tactic_strategic_completeness(tactic, strategic_context));
		} else {
			return tactic_strategic_preference_level_justification(tactic, strategic_context);
		}
	}

	public static SubLObject conjunctive_tactic_strategic_preference_level_justification(final SubLObject tactic,
			final SubLObject strategic_context) {
		assert NIL != inference_worker.generalized_conjunctive_tactic_p(
				tactic) : "! inference_worker.generalized_conjunctive_tactic_p(tactic) "
						+ ("inference_worker.generalized_conjunctive_tactic_p(tactic) "
								+ "CommonSymbols.NIL != inference_worker.generalized_conjunctive_tactic_p(tactic) ")
						+ tactic;
		if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
			return string_utilities
					.str(inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
		}
		return inference_datastructures_strategy.tactic_strategic_preference_level_justification(tactic,
				strategic_context);
	}

	public static SubLObject tactic_strategic_productivity_alt(SubLObject tactic, SubLObject strategic_context) {
		if ($TACTICAL == strategic_context) {
			return inference_datastructures_tactic.tactic_productivity(tactic);
		} else {
			if (NIL != inference_worker.content_tactic_p(tactic)) {
				return inference_datastructures_tactic.tactic_productivity(tactic);
			} else {
				{
					SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
					return tact_strategic_properties_productivity(tactic_strategic_properties);
				}
			}
		}
	}

	public static SubLObject tactic_strategic_productivity(final SubLObject tactic,
			final SubLObject strategic_context) {
		if ($TACTICAL == strategic_context) {
			return inference_datastructures_tactic.tactic_productivity(tactic);
		}
		if (NIL != inference_worker.content_tactic_p(tactic)) {
			return inference_datastructures_tactic.tactic_productivity(tactic);
		}
		final SubLObject tactic_strategic_properties = inference_datastructures_strategy
				.tactic_strategic_properties(tactic, strategic_context);
		return inference_datastructures_strategy.tact_strategic_properties_productivity(tactic_strategic_properties);
	}

	public static SubLObject tactic_strategically_preferredP_alt(SubLObject tactic, SubLObject strategy) {
		return eq($PREFERRED, tactic_strategic_preference_level(tactic, strategy));
	}

	public static SubLObject tactic_strategically_preferredP(final SubLObject tactic, final SubLObject strategy) {
		return eq($PREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategy));
	}

	public static SubLObject set_tactic_strategic_preference_level_alt(SubLObject tactic, SubLObject strategy,
			SubLObject preference_level, SubLObject justification) {
		SubLTrampolineFile.checkType(preference_level, PREFERENCE_LEVEL_P);
		{
			SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
			_csetf_tact_strategic_properties_preference_level(tactic_strategic_properties, preference_level);
			_csetf_tact_strategic_properties_preference_level_justification(tactic_strategic_properties, justification);
		}
		return tactic;
	}

	public static SubLObject set_tactic_strategic_preference_level(final SubLObject tactic, final SubLObject strategy,
			final SubLObject preference_level, final SubLObject justification) {
		assert NIL != preference_modules
				.preference_level_p(preference_level) : "! preference_modules.preference_level_p(preference_level) "
						+ ("preference_modules.preference_level_p(preference_level) "
								+ "CommonSymbols.NIL != preference_modules.preference_level_p(preference_level) ")
						+ preference_level;
		final SubLObject tactic_strategic_properties = inference_datastructures_strategy
				.tactic_strategic_properties(tactic, strategy);
		inference_datastructures_strategy._csetf_tact_strategic_properties_preference_level(tactic_strategic_properties,
				preference_level);
		inference_datastructures_strategy._csetf_tact_strategic_properties_preference_level_justification(
				tactic_strategic_properties, justification);
		return tactic;
	}

	public static SubLObject set_tactic_strategic_productivity_alt(SubLObject tactic, SubLObject strategy,
			SubLObject productivity) {
		{
			SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
			_csetf_tact_strategic_properties_productivity(tactic_strategic_properties, productivity);
		}
		return tactic;
	}

	public static SubLObject set_tactic_strategic_productivity(final SubLObject tactic, final SubLObject strategy,
			final SubLObject productivity) {
		final SubLObject tactic_strategic_properties = inference_datastructures_strategy
				.tactic_strategic_properties(tactic, strategy);
		inference_datastructures_strategy._csetf_tact_strategic_properties_productivity(tactic_strategic_properties,
				productivity);
		return tactic;
	}

	public static SubLObject problem_strategically_possible_tactic_count_alt(SubLObject problem, SubLObject strategy) {
		SubLTrampolineFile.checkType(problem, PROBLEM_P);
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		{
			SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
			return prob_strategic_properties_possible_tactic_count(problem_strategic_properties);
		}
	}

	public static SubLObject problem_strategically_possible_tactic_count(final SubLObject problem,
			final SubLObject strategy) {
		assert NIL != inference_datastructures_problem
				.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) "
						+ ("inference_datastructures_problem.problem_p(problem) "
								+ "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ")
						+ problem;
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		final SubLObject problem_strategic_properties = inference_datastructures_strategy
				.problem_strategic_properties(problem, strategy);
		return inference_datastructures_strategy
				.prob_strategic_properties_possible_tactic_count(problem_strategic_properties);
	}

	public static SubLObject problem_note_tactic_strategically_possible_alt(SubLObject problem, SubLObject tactic,
			SubLObject strategy) {
		SubLTrampolineFile.checkType(problem, PROBLEM_P);
		SubLTrampolineFile.checkType(tactic, TACTIC_P);
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		{
			SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
			_csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties,
					add(prob_strategic_properties_possible_tactic_count(problem_strategic_properties), ONE_INTEGER));
		}
		return problem;
	}

	public static SubLObject problem_note_tactic_strategically_possible(final SubLObject problem,
			final SubLObject tactic, final SubLObject strategy) {
		assert NIL != inference_datastructures_problem
				.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) "
						+ ("inference_datastructures_problem.problem_p(problem) "
								+ "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ")
						+ problem;
		assert NIL != inference_datastructures_tactic
				.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) "
						+ ("inference_datastructures_tactic.tactic_p(tactic) "
								+ "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ")
						+ tactic;
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		final SubLObject problem_strategic_properties = inference_datastructures_strategy
				.problem_strategic_properties(problem, strategy);
		inference_datastructures_strategy._csetf_prob_strategic_properties_possible_tactic_count(
				problem_strategic_properties, add(inference_datastructures_strategy
						.prob_strategic_properties_possible_tactic_count(problem_strategic_properties), ONE_INTEGER));
		return problem;
	}

	public static SubLObject problem_note_tactic_not_strategically_possible_alt(SubLObject problem, SubLObject tactic,
			SubLObject strategy) {
		SubLTrampolineFile.checkType(problem, PROBLEM_P);
		SubLTrampolineFile.checkType(tactic, TACTIC_P);
		SubLTrampolineFile.checkType(strategy, STRATEGY_P);
		{
			SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
			_csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, subtract(
					prob_strategic_properties_possible_tactic_count(problem_strategic_properties), ONE_INTEGER));
		}
		return problem;
	}

	public static SubLObject problem_note_tactic_not_strategically_possible(final SubLObject problem,
			final SubLObject tactic, final SubLObject strategy) {
		assert NIL != inference_datastructures_problem
				.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) "
						+ ("inference_datastructures_problem.problem_p(problem) "
								+ "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ")
						+ problem;
		assert NIL != inference_datastructures_tactic
				.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) "
						+ ("inference_datastructures_tactic.tactic_p(tactic) "
								+ "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ")
						+ tactic;
		assert NIL != inference_datastructures_strategy
				.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) "
						+ ("inference_datastructures_strategy.strategy_p(strategy) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ")
						+ strategy;
		final SubLObject problem_strategic_properties = inference_datastructures_strategy
				.problem_strategic_properties(problem, strategy);
		inference_datastructures_strategy._csetf_prob_strategic_properties_possible_tactic_count(
				problem_strategic_properties, subtract(inference_datastructures_strategy
						.prob_strategic_properties_possible_tactic_count(problem_strategic_properties), ONE_INTEGER));
		return problem;
	}

	public static SubLObject problem_note_all_tactics_not_strategically_possible_alt(SubLObject problem,
			SubLObject strategy) {
		{
			SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
			_csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, ZERO_INTEGER);
		}
		return problem;
	}

	public static SubLObject problem_note_all_tactics_not_strategically_possible(final SubLObject problem,
			final SubLObject strategy) {
		final SubLObject problem_strategic_properties = inference_datastructures_strategy
				.problem_strategic_properties(problem, strategy);
		inference_datastructures_strategy
				._csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, ZERO_INTEGER);
		return problem;
	}

	public static SubLObject tactic_strategic_uninterestingness(final SubLObject tactic, final SubLObject strategy) {
		final SubLObject tactic_strategic_properties = inference_datastructures_strategy
				.tactic_strategic_properties(tactic, strategy);
		return inference_datastructures_strategy
				.tact_strategic_properties_uninterestingness(tactic_strategic_properties);
	}

	public static SubLObject set_tactic_strategic_uninterestingness(final SubLObject tactic, final SubLObject strategy,
			final SubLObject uninterestingness) {
		assert NIL != inference_datastructures_strategy.uninterestingness_cache_value_p(
				uninterestingness) : "! inference_datastructures_strategy.uninterestingness_cache_value_p(uninterestingness) "
						+ ("inference_datastructures_strategy.uninterestingness_cache_value_p(uninterestingness) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.uninterestingness_cache_value_p(uninterestingness) ")
						+ uninterestingness;
		final SubLObject tactic_strategic_properties = inference_datastructures_strategy
				.tactic_strategic_properties(tactic, strategy);
		inference_datastructures_strategy
				._csetf_tact_strategic_properties_uninterestingness(tactic_strategic_properties, uninterestingness);
		return uninterestingness;
	}

	public static SubLObject thrown_away_cache_status_from_uninterestingness(final SubLObject uninterestingness,
			final SubLObject conditions) {
		return inference_datastructures_strategy.cache_status_for_conditions(aref(uninterestingness, ZERO_INTEGER),
				conditions);
	}

	public static SubLObject set_aside_cache_status_from_uninterestingness(final SubLObject uninterestingness,
			final SubLObject conditions) {
		return inference_datastructures_strategy.cache_status_for_conditions(aref(uninterestingness, ONE_INTEGER),
				conditions);
	}

	public static SubLObject note_uninterestingness_cache_thrown_away_value(final SubLObject uninterestingness,
			final SubLObject value, final SubLObject conditions) {
		assert NIL != inference_datastructures_strategy.uninterestingness_cache_conditions_p(
				conditions) : "! inference_datastructures_strategy.uninterestingness_cache_conditions_p(conditions) "
						+ ("inference_datastructures_strategy.uninterestingness_cache_conditions_p(conditions) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.uninterestingness_cache_conditions_p(conditions) ")
						+ conditions;
		SubLObject cache_status = aref(uninterestingness, ZERO_INTEGER);
		if ((SubLMain.BOOTY_HACKZ || true) && uninterestingness == NIL)
			return uninterestingness;
		cache_status = inference_datastructures_strategy.modify_cache_status_for_value_and_conditions(cache_status,
				value, conditions);
		set_aref(uninterestingness, ZERO_INTEGER, cache_status);
		return uninterestingness;
	}

	public static SubLObject note_uninterestingness_cache_set_aside_value(final SubLObject uninterestingness,
			final SubLObject value, final SubLObject conditions) {
		assert NIL != inference_datastructures_strategy.uninterestingness_cache_conditions_p(
				conditions) : "! inference_datastructures_strategy.uninterestingness_cache_conditions_p(conditions) "
						+ ("inference_datastructures_strategy.uninterestingness_cache_conditions_p(conditions) "
								+ "CommonSymbols.NIL != inference_datastructures_strategy.uninterestingness_cache_conditions_p(conditions) ")
						+ conditions;
		SubLObject cache_status = aref(uninterestingness, ONE_INTEGER);
		if ((SubLMain.BOOTY_HACKZ || true) && uninterestingness == NIL)
			return uninterestingness;
		cache_status = inference_datastructures_strategy.modify_cache_status_for_value_and_conditions(cache_status,
				value, conditions);
		set_aref(uninterestingness, ONE_INTEGER, cache_status);
		return uninterestingness;
	}

	public static SubLObject uninterestingness_cache_value_p(final SubLObject v_object) {
		return makeBoolean(((v_object.isVector() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED)))
				&& (NIL != inference_datastructures_strategy.thrown_away_cache_value_p(aref(v_object, ZERO_INTEGER))))
				&& (NIL != inference_datastructures_strategy.set_aside_cache_value_p(aref(v_object, ONE_INTEGER))));
	}

	public static SubLObject uninterestingness_cache_conditions_p(final SubLObject v_object) {
		return makeBoolean(($ALL == v_object)
				|| (v_object.isCons() && (NIL != list_utilities.every_in_list(BOOLEANP, v_object, UNPROVIDED))));
	}

	public static SubLObject uninterestingness_cache_conditions_list_p(final SubLObject v_object) {
		return makeBoolean(v_object.isList() && (NIL != list_utilities.every_in_list(
				inference_datastructures_strategy.UNINTERESTINGNESS_CACHE_CONDITIONS_P, v_object, UNPROVIDED)));
	}

	public static SubLObject thrown_away_cache_value_p(final SubLObject v_object) {
		return inference_datastructures_strategy.ignore_cache_value_p(v_object);
	}

	public static SubLObject set_aside_cache_value_p(final SubLObject v_object) {
		return inference_datastructures_strategy.ignore_cache_value_p(v_object);
	}

	public static SubLObject ignore_cache_value_p(final SubLObject v_object) {
		return makeBoolean(($RECOMPUTE == v_object)
				|| (((NIL != list_utilities.doubletonP(v_object)) && (NIL != inference_datastructures_strategy
						.uninterestingness_cache_conditions_list_p(v_object.first())))
						&& (NIL != inference_datastructures_strategy
								.uninterestingness_cache_conditions_list_p(second(v_object)))));
	}

	public static SubLObject set_just_tactic_thrown_away(final SubLObject tactic, final SubLObject strategy,
			final SubLObject conditions) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.tactic_strategic_uninterestingness(tactic, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_thrown_away_value(uninterestingness, T, conditions);
		return inference_datastructures_strategy.set_tactic_strategic_uninterestingness(tactic, strategy,
				new_uninterestingness);
	}

	public static SubLObject set_just_tactic_not_thrown_away(final SubLObject tactic, final SubLObject strategy,
			final SubLObject conditions) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.tactic_strategic_uninterestingness(tactic, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_thrown_away_value(uninterestingness, NIL, conditions);
		return inference_datastructures_strategy.set_tactic_strategic_uninterestingness(tactic, strategy,
				new_uninterestingness);
	}

	public static SubLObject set_just_tactic_recompute_thrown_away(final SubLObject tactic, final SubLObject strategy) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.tactic_strategic_uninterestingness(tactic, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_thrown_away_value(uninterestingness, $RECOMPUTE, $ALL);
		return inference_datastructures_strategy.set_tactic_strategic_uninterestingness(tactic, strategy,
				new_uninterestingness);
	}

	public static SubLObject set_just_tactic_set_aside(final SubLObject tactic, final SubLObject strategy,
			final SubLObject conditions) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.tactic_strategic_uninterestingness(tactic, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_set_aside_value(uninterestingness, T, conditions);
		return inference_datastructures_strategy.set_tactic_strategic_uninterestingness(tactic, strategy,
				new_uninterestingness);
	}

	public static SubLObject set_just_tactic_not_set_aside(final SubLObject tactic, final SubLObject strategy,
			final SubLObject conditions) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.tactic_strategic_uninterestingness(tactic, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_set_aside_value(uninterestingness, NIL, conditions);
		return inference_datastructures_strategy.set_tactic_strategic_uninterestingness(tactic, strategy,
				new_uninterestingness);
	}

	public static SubLObject set_just_tactic_recompute_set_aside(final SubLObject tactic, final SubLObject strategy) {
		final SubLObject uninterestingness = inference_datastructures_strategy
				.tactic_strategic_uninterestingness(tactic, strategy);
		final SubLObject new_uninterestingness = inference_datastructures_strategy
				.note_uninterestingness_cache_set_aside_value(uninterestingness, $RECOMPUTE, $ALL);
		return inference_datastructures_strategy.set_tactic_strategic_uninterestingness(tactic, strategy,
				new_uninterestingness);
	}

	public static SubLObject tactic_thrown_away_cache_status(SubLObject tactic, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_thrown_away_code(tactic_strategic_flags(tactic, strategy)));
	}

	public static SubLObject tactic_thrown_away_cache_status(final SubLObject tactic, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		return inference_datastructures_strategy.thrown_away_cache_status_from_uninterestingness(
				inference_datastructures_strategy.tactic_strategic_uninterestingness(tactic, strategy), conditions);
	}

	public static SubLObject tactic_set_aside_cache_status(SubLObject tactic, SubLObject strategy) {
		return decode_uninterestingness_cache_code(
				uninterestingness_cache_set_aside_code(tactic_strategic_flags(tactic, strategy)));
	}

	public static SubLObject tactic_set_aside_cache_status(final SubLObject tactic, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		return inference_datastructures_strategy.set_aside_cache_status_from_uninterestingness(
				inference_datastructures_strategy.tactic_strategic_uninterestingness(tactic, strategy), conditions);
	}

	public static SubLObject set_tactic_thrown_away(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_thrown_away(final SubLObject tactic, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		inference_datastructures_strategy.set_just_tactic_thrown_away(tactic, strategy, conditions);
		return NIL;
	}

	public static SubLObject set_tactic_not_thrown_away(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_not_thrown_away(final SubLObject tactic, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		return inference_datastructures_strategy.set_just_tactic_not_thrown_away(tactic, strategy, conditions);
	}

	public static SubLObject set_tactic_recompute_thrown_away_alt(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_thrown_away_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_recompute_thrown_away(final SubLObject tactic, final SubLObject strategy) {
		inference_datastructures_strategy.set_just_tactic_recompute_thrown_away(tactic, strategy);
		inference_datastructures_strategy.set_just_problem_recompute_thrown_away(
				inference_datastructures_tactic.tactic_problem(tactic), strategy);
		return NIL;
	}

	public static SubLObject set_tactic_set_aside(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_code(flags,
					encode_uninterestingness_cache_status(T));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_set_aside(final SubLObject tactic, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		inference_datastructures_strategy.set_just_tactic_set_aside(tactic, strategy, conditions);
		return NIL;
	}

	public static SubLObject set_tactic_not_set_aside(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_code(flags,
					encode_uninterestingness_cache_status(NIL));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_not_set_aside(final SubLObject tactic, final SubLObject strategy,
			SubLObject conditions) {
		if (conditions == UNPROVIDED) {
			conditions = $ALL;
		}
		return inference_datastructures_strategy.set_just_tactic_not_set_aside(tactic, strategy, conditions);
	}

	public static SubLObject set_tactic_recompute_set_aside_alt(SubLObject tactic, SubLObject strategy) {
		{
			SubLObject flags = tactic_strategic_flags(tactic, strategy);
			SubLObject new_flags = set_uninterestingness_cache_set_aside_code(flags,
					encode_uninterestingness_cache_status($RECOMPUTE));
			return set_tactic_strategic_flags(tactic, strategy, new_flags);
		}
	}

	public static SubLObject set_tactic_recompute_set_aside(final SubLObject tactic, final SubLObject strategy) {
		inference_datastructures_strategy.set_just_tactic_recompute_set_aside(tactic, strategy);
		if ((NIL == inference_datastructures_strategy.strategy_continuableP(strategy))
				&& (NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy))) {
			inference_datastructures_strategy.set_just_tactic_recompute_thrown_away(tactic, strategy);
		}
		inference_datastructures_strategy
				.set_just_problem_recompute_set_aside(inference_datastructures_tactic.tactic_problem(tactic), strategy);
		return NIL;
	}

	public static SubLObject set_problem_recompute_thrown_away_wrt_all_relevant_strategies(final SubLObject problem) {
		final SubLObject store = inference_datastructures_problem.problem_store(problem);
		final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
		if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
			final SubLObject idx_$4 = idx;
			if (NIL == id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
				final SubLObject vector_var = id_index_dense_objects(idx_$4);
				final SubLObject backwardP_var = NIL;
				SubLObject length;
				SubLObject v_iteration;
				SubLObject id;
				SubLObject inference;
				SubLObject inference_var;
				SubLObject set_var;
				SubLObject set_contents_var;
				SubLObject basis_object;
				SubLObject state;
				SubLObject strategy;
				for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration
						.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
					id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
					inference = aref(vector_var, id);
					if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
						if (NIL != id_index_tombstone_p(inference)) {
							inference = $SKIP;
						}
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem,
								inference)) {
							inference_var = inference;
							set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
							set_contents_var = set.do_set_internal(set_var);
							for (basis_object = set_contents.do_set_contents_basis_object(
									set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(
											basis_object,
											set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
													state); state = set_contents.do_set_contents_update_state(state)) {
								strategy = set_contents.do_set_contents_next(basis_object, state);
								if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
									inference_datastructures_strategy.set_problem_recompute_thrown_away(problem,
											strategy);
								}
							}
						}
					}
				}
			}
			final SubLObject idx_$5 = idx;
			if (NIL == id_index_sparse_objects_empty_p(idx_$5)) {
				final SubLObject cdohash_table = id_index_sparse_objects(idx_$5);
				SubLObject id2 = NIL;
				SubLObject inference2 = NIL;
				final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
				try {
					while (iteratorHasNext(cdohash_iterator)) {
						final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
						id2 = getEntryKey(cdohash_entry);
						inference2 = getEntryValue(cdohash_entry);
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem,
								inference2)) {
							final SubLObject inference_var2 = inference2;
							final SubLObject set_var2 = inference_datastructures_inference
									.inference_strategy_set(inference_var2);
							final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
							SubLObject basis_object2;
							SubLObject state2;
							SubLObject strategy2;
							for (basis_object2 = set_contents.do_set_contents_basis_object(
									set_contents_var2), state2 = NIL, state2 = set_contents
											.do_set_contents_initial_state(basis_object2,
													set_contents_var2); NIL == set_contents.do_set_contents_doneP(
															basis_object2, state2); state2 = set_contents
																	.do_set_contents_update_state(state2)) {
								strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
								if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
									inference_datastructures_strategy.set_problem_recompute_thrown_away(problem,
											strategy2);
								}
							}
						}
					}
				} finally {
					releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return NIL;
	}

	public static SubLObject set_problem_recompute_set_aside_wrt_all_relevant_strategies(final SubLObject problem) {
		final SubLObject store = inference_datastructures_problem.problem_store(problem);
		final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
		if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
			final SubLObject idx_$6 = idx;
			if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
				final SubLObject vector_var = id_index_dense_objects(idx_$6);
				final SubLObject backwardP_var = NIL;
				SubLObject length;
				SubLObject v_iteration;
				SubLObject id;
				SubLObject inference;
				SubLObject inference_var;
				SubLObject set_var;
				SubLObject set_contents_var;
				SubLObject basis_object;
				SubLObject state;
				SubLObject strategy;
				for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration
						.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
					id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
					inference = aref(vector_var, id);
					if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
						if (NIL != id_index_tombstone_p(inference)) {
							inference = $SKIP;
						}
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem,
								inference)) {
							inference_var = inference;
							set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
							set_contents_var = set.do_set_internal(set_var);
							for (basis_object = set_contents.do_set_contents_basis_object(
									set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(
											basis_object,
											set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
													state); state = set_contents.do_set_contents_update_state(state)) {
								strategy = set_contents.do_set_contents_next(basis_object, state);
								if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
									inference_datastructures_strategy.set_problem_recompute_set_aside(problem,
											strategy);
								}
							}
						}
					}
				}
			}
			final SubLObject idx_$7 = idx;
			if (NIL == id_index_sparse_objects_empty_p(idx_$7)) {
				final SubLObject cdohash_table = id_index_sparse_objects(idx_$7);
				SubLObject id2 = NIL;
				SubLObject inference2 = NIL;
				final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
				try {
					while (iteratorHasNext(cdohash_iterator)) {
						final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
						id2 = getEntryKey(cdohash_entry);
						inference2 = getEntryValue(cdohash_entry);
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem,
								inference2)) {
							final SubLObject inference_var2 = inference2;
							final SubLObject set_var2 = inference_datastructures_inference
									.inference_strategy_set(inference_var2);
							final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
							SubLObject basis_object2;
							SubLObject state2;
							SubLObject strategy2;
							for (basis_object2 = set_contents.do_set_contents_basis_object(
									set_contents_var2), state2 = NIL, state2 = set_contents
											.do_set_contents_initial_state(basis_object2,
													set_contents_var2); NIL == set_contents.do_set_contents_doneP(
															basis_object2, state2); state2 = set_contents
																	.do_set_contents_update_state(state2)) {
								strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
								if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
									inference_datastructures_strategy.set_problem_recompute_set_aside(problem,
											strategy2);
								}
							}
						}
					}
				} finally {
					releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return NIL;
	}

	public static SubLObject set_tactic_recompute_thrown_away_wrt_all_relevant_strategies(final SubLObject tactic) {
		final SubLObject prob = inference_datastructures_tactic.tactic_problem(tactic);
		final SubLObject store = inference_datastructures_problem.problem_store(prob);
		final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
		if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
			final SubLObject idx_$8 = idx;
			if (NIL == id_index_dense_objects_empty_p(idx_$8, $SKIP)) {
				final SubLObject vector_var = id_index_dense_objects(idx_$8);
				final SubLObject backwardP_var = NIL;
				SubLObject length;
				SubLObject v_iteration;
				SubLObject id;
				SubLObject inference;
				SubLObject inference_var;
				SubLObject set_var;
				SubLObject set_contents_var;
				SubLObject basis_object;
				SubLObject state;
				SubLObject strategy;
				for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration
						.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
					id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
					inference = aref(vector_var, id);
					if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
						if (NIL != id_index_tombstone_p(inference)) {
							inference = $SKIP;
						}
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
							inference_var = inference;
							set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
							set_contents_var = set.do_set_internal(set_var);
							for (basis_object = set_contents.do_set_contents_basis_object(
									set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(
											basis_object,
											set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
													state); state = set_contents.do_set_contents_update_state(state)) {
								strategy = set_contents.do_set_contents_next(basis_object, state);
								if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
									inference_datastructures_strategy.set_tactic_recompute_thrown_away(tactic,
											strategy);
								}
							}
						}
					}
				}
			}
			final SubLObject idx_$9 = idx;
			if (NIL == id_index_sparse_objects_empty_p(idx_$9)) {
				final SubLObject cdohash_table = id_index_sparse_objects(idx_$9);
				SubLObject id2 = NIL;
				SubLObject inference2 = NIL;
				final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
				try {
					while (iteratorHasNext(cdohash_iterator)) {
						final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
						id2 = getEntryKey(cdohash_entry);
						inference2 = getEntryValue(cdohash_entry);
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
							final SubLObject inference_var2 = inference2;
							final SubLObject set_var2 = inference_datastructures_inference
									.inference_strategy_set(inference_var2);
							final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
							SubLObject basis_object2;
							SubLObject state2;
							SubLObject strategy2;
							for (basis_object2 = set_contents.do_set_contents_basis_object(
									set_contents_var2), state2 = NIL, state2 = set_contents
											.do_set_contents_initial_state(basis_object2,
													set_contents_var2); NIL == set_contents.do_set_contents_doneP(
															basis_object2, state2); state2 = set_contents
																	.do_set_contents_update_state(state2)) {
								strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
								if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
									inference_datastructures_strategy.set_tactic_recompute_thrown_away(tactic,
											strategy2);
								}
							}
						}
					}
				} finally {
					releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return NIL;
	}

	public static SubLObject set_tactic_recompute_set_aside_wrt_all_relevant_strategies(final SubLObject tactic) {
		final SubLObject prob = inference_datastructures_tactic.tactic_problem(tactic);
		final SubLObject store = inference_datastructures_problem.problem_store(prob);
		final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
		if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
			final SubLObject idx_$10 = idx;
			if (NIL == id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
				final SubLObject vector_var = id_index_dense_objects(idx_$10);
				final SubLObject backwardP_var = NIL;
				SubLObject length;
				SubLObject v_iteration;
				SubLObject id;
				SubLObject inference;
				SubLObject inference_var;
				SubLObject set_var;
				SubLObject set_contents_var;
				SubLObject basis_object;
				SubLObject state;
				SubLObject strategy;
				for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration
						.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
					id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
					inference = aref(vector_var, id);
					if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
						if (NIL != id_index_tombstone_p(inference)) {
							inference = $SKIP;
						}
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
							inference_var = inference;
							set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
							set_contents_var = set.do_set_internal(set_var);
							for (basis_object = set_contents.do_set_contents_basis_object(
									set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(
											basis_object,
											set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
													state); state = set_contents.do_set_contents_update_state(state)) {
								strategy = set_contents.do_set_contents_next(basis_object, state);
								if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
									inference_datastructures_strategy.set_tactic_recompute_set_aside(tactic, strategy);
								}
							}
						}
					}
				}
			}
			final SubLObject idx_$11 = idx;
			if (NIL == id_index_sparse_objects_empty_p(idx_$11)) {
				final SubLObject cdohash_table = id_index_sparse_objects(idx_$11);
				SubLObject id2 = NIL;
				SubLObject inference2 = NIL;
				final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
				try {
					while (iteratorHasNext(cdohash_iterator)) {
						final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
						id2 = getEntryKey(cdohash_entry);
						inference2 = getEntryValue(cdohash_entry);
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
							final SubLObject inference_var2 = inference2;
							final SubLObject set_var2 = inference_datastructures_inference
									.inference_strategy_set(inference_var2);
							final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
							SubLObject basis_object2;
							SubLObject state2;
							SubLObject strategy2;
							for (basis_object2 = set_contents.do_set_contents_basis_object(
									set_contents_var2), state2 = NIL, state2 = set_contents
											.do_set_contents_initial_state(basis_object2,
													set_contents_var2); NIL == set_contents.do_set_contents_doneP(
															basis_object2, state2); state2 = set_contents
																	.do_set_contents_update_state(state2)) {
								strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
								if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
									inference_datastructures_strategy.set_tactic_recompute_set_aside(tactic, strategy2);
								}
							}
						}
					}
				} finally {
					releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return NIL;
	}

	public static SubLObject set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(
			final SubLObject problem) {
		final SubLObject store = inference_datastructures_problem.problem_store(problem);
		final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
		if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
			final SubLObject idx_$12 = idx;
			if (NIL == id_index_dense_objects_empty_p(idx_$12, $SKIP)) {
				final SubLObject vector_var = id_index_dense_objects(idx_$12);
				final SubLObject backwardP_var = NIL;
				SubLObject length;
				SubLObject v_iteration;
				SubLObject id;
				SubLObject inference;
				SubLObject inference_var;
				SubLObject set_var;
				SubLObject set_contents_var;
				SubLObject basis_object;
				SubLObject state;
				SubLObject strategy;
				for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration
						.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
					id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
					inference = aref(vector_var, id);
					if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
						if (NIL != id_index_tombstone_p(inference)) {
							inference = $SKIP;
						}
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem,
								inference)) {
							inference_var = inference;
							set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
							set_contents_var = set.do_set_internal(set_var);
							for (basis_object = set_contents.do_set_contents_basis_object(
									set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(
											basis_object,
											set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
													state); state = set_contents.do_set_contents_update_state(state)) {
								strategy = set_contents.do_set_contents_next(basis_object, state);
								if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
									inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away(problem,
											strategy);
								}
							}
						}
					}
				}
			}
			final SubLObject idx_$13 = idx;
			if (NIL == id_index_sparse_objects_empty_p(idx_$13)) {
				final SubLObject cdohash_table = id_index_sparse_objects(idx_$13);
				SubLObject id2 = NIL;
				SubLObject inference2 = NIL;
				final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
				try {
					while (iteratorHasNext(cdohash_iterator)) {
						final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
						id2 = getEntryKey(cdohash_entry);
						inference2 = getEntryValue(cdohash_entry);
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem,
								inference2)) {
							final SubLObject inference_var2 = inference2;
							final SubLObject set_var2 = inference_datastructures_inference
									.inference_strategy_set(inference_var2);
							final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
							SubLObject basis_object2;
							SubLObject state2;
							SubLObject strategy2;
							for (basis_object2 = set_contents.do_set_contents_basis_object(
									set_contents_var2), state2 = NIL, state2 = set_contents
											.do_set_contents_initial_state(basis_object2,
													set_contents_var2); NIL == set_contents.do_set_contents_doneP(
															basis_object2, state2); state2 = set_contents
																	.do_set_contents_update_state(state2)) {
								strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
								if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
									inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away(problem,
											strategy2);
								}
							}
						}
					}
				} finally {
					releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return NIL;
	}

	public static SubLObject set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies(
			final SubLObject problem) {
		final SubLObject store = inference_datastructures_problem.problem_store(problem);
		final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
		if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
			final SubLObject idx_$14 = idx;
			if (NIL == id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
				final SubLObject vector_var = id_index_dense_objects(idx_$14);
				final SubLObject backwardP_var = NIL;
				SubLObject length;
				SubLObject v_iteration;
				SubLObject id;
				SubLObject inference;
				SubLObject inference_var;
				SubLObject set_var;
				SubLObject set_contents_var;
				SubLObject basis_object;
				SubLObject state;
				SubLObject strategy;
				for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration
						.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
					id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
					inference = aref(vector_var, id);
					if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
						if (NIL != id_index_tombstone_p(inference)) {
							inference = $SKIP;
						}
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem,
								inference)) {
							inference_var = inference;
							set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
							set_contents_var = set.do_set_internal(set_var);
							for (basis_object = set_contents.do_set_contents_basis_object(
									set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(
											basis_object,
											set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
													state); state = set_contents.do_set_contents_update_state(state)) {
								strategy = set_contents.do_set_contents_next(basis_object, state);
								if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
									inference_datastructures_strategy.set_problem_tactics_recompute_set_aside(problem,
											strategy);
								}
							}
						}
					}
				}
			}
			final SubLObject idx_$15 = idx;
			if (NIL == id_index_sparse_objects_empty_p(idx_$15)) {
				final SubLObject cdohash_table = id_index_sparse_objects(idx_$15);
				SubLObject id2 = NIL;
				SubLObject inference2 = NIL;
				final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
				try {
					while (iteratorHasNext(cdohash_iterator)) {
						final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
						id2 = getEntryKey(cdohash_entry);
						inference2 = getEntryValue(cdohash_entry);
						if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem,
								inference2)) {
							final SubLObject inference_var2 = inference2;
							final SubLObject set_var2 = inference_datastructures_inference
									.inference_strategy_set(inference_var2);
							final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
							SubLObject basis_object2;
							SubLObject state2;
							SubLObject strategy2;
							for (basis_object2 = set_contents.do_set_contents_basis_object(
									set_contents_var2), state2 = NIL, state2 = set_contents
											.do_set_contents_initial_state(basis_object2,
													set_contents_var2); NIL == set_contents.do_set_contents_doneP(
															basis_object2, state2); state2 = set_contents
																	.do_set_contents_update_state(state2)) {
								strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
								if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
									inference_datastructures_strategy.set_problem_tactics_recompute_set_aside(problem,
											strategy2);
								}
							}
						}
					}
				} finally {
					releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return NIL;
	}

	public static SubLObject set_problem_tactics_recompute_thrown_away(final SubLObject problem,
			final SubLObject strategy) {
		SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
		SubLObject tactic = NIL;
		tactic = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			inference_datastructures_strategy.set_just_tactic_recompute_thrown_away(tactic, strategy);
			cdolist_list_var = cdolist_list_var.rest();
			tactic = cdolist_list_var.first();
		}
		inference_datastructures_strategy.set_just_problem_recompute_thrown_away(problem, strategy);
		return NIL;
	}

	public static SubLObject set_problem_tactics_recompute_set_aside(final SubLObject problem,
			final SubLObject strategy) {
		SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
		SubLObject tactic = NIL;
		tactic = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			inference_datastructures_strategy.set_just_tactic_recompute_set_aside(tactic, strategy);
			cdolist_list_var = cdolist_list_var.rest();
			tactic = cdolist_list_var.first();
		}
		inference_datastructures_strategy.set_just_problem_recompute_set_aside(problem, strategy);
		return NIL;
	}

	public static SubLObject cache_status_known_for_conditionsP(final SubLObject cache_status, final SubLObject value,
			final SubLObject conditions) {
		return eq(value, inference_datastructures_strategy.cache_status_for_conditions(cache_status, conditions));
	}

	public static SubLObject cache_status_for_conditions(final SubLObject cache_status, final SubLObject conditions) {
		if (cache_status == $RECOMPUTE) {
			return $RECOMPUTE;
		}
		if (cache_status
				.eql(inference_datastructures_strategy.$default_uninterestingness_cache_value$.getGlobalValue())) {
			return $RECOMPUTE;
		}
		if (NIL != inference_datastructures_strategy.any_conditions_implyP(nth(ZERO_INTEGER, cache_status), conditions,
				NIL)) {
			return T;
		}
		if (NIL != inference_datastructures_strategy.any_conditions_implyP(nth(ONE_INTEGER, cache_status), conditions,
				T)) {
			return NIL;
		}
		return $RECOMPUTE;
	}

	public static SubLObject modify_cache_status_for_value_and_conditions(SubLObject cache_status,
			final SubLObject value, final SubLObject conditions) {
		if (value == $RECOMPUTE) {
			cache_status = inference_datastructures_strategy.$default_uninterestingness_cache_value$.getGlobalValue();
		} else if (NIL == inference_datastructures_strategy.cache_status_known_for_conditionsP(cache_status, value,
				conditions)) {
			if ((cache_status == $RECOMPUTE) || cache_status
					.eql(inference_datastructures_strategy.$default_uninterestingness_cache_value$.getGlobalValue())) {
				cache_status = copy_list(
						inference_datastructures_strategy.$default_uninterestingness_cache_value$.getGlobalValue());
			}
			final SubLObject conditions_nth = (NIL != value) ? ZERO_INTEGER : ONE_INTEGER;
			final SubLObject current_conditions_list = nth(conditions_nth, cache_status);
			SubLObject new_conditions_list = NIL;
			if (conditions == $ALL) {
				new_conditions_list = list($ALL);
			} else {
				new_conditions_list = cons(conditions, new_conditions_list);
				SubLObject cdolist_list_var = current_conditions_list;
				SubLObject current_conditions = NIL;
				current_conditions = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (NIL == inference_datastructures_strategy.conditions_implyP(conditions, current_conditions,
							makeBoolean(NIL == value))) {
						new_conditions_list = cons(current_conditions, new_conditions_list);
					}
					cdolist_list_var = cdolist_list_var.rest();
					current_conditions = cdolist_list_var.first();
				}
			}
			set_nth(conditions_nth, cache_status, new_conditions_list);
		}

		return cache_status;
	}

	public static SubLObject any_conditions_implyP(final SubLObject p_conditions_list, final SubLObject q_conditions,
			final SubLObject negP) {
		SubLObject cdolist_list_var = p_conditions_list;
		SubLObject p_conditions = NIL;
		p_conditions = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != inference_datastructures_strategy.conditions_implyP(p_conditions, q_conditions, negP)) {
				return T;
			}
			cdolist_list_var = cdolist_list_var.rest();
			p_conditions = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject conditions_implyP(final SubLObject p_conditions, final SubLObject q_conditions,
			SubLObject negP) {
		if (negP == UNPROVIDED) {
			negP = NIL;
		}
		if (p_conditions == $ALL) {
			return T;
		}
		if (q_conditions == $ALL) {
			return NIL;
		}
		return NIL == negP ? inference_datastructures_strategy.conditions_booleanly_implyP(p_conditions, q_conditions)
				: inference_datastructures_strategy.conditions_booleanly_implyP(q_conditions, p_conditions);
	}

	public static SubLObject conditions_booleanly_implyP(final SubLObject p_conditions, final SubLObject q_conditions) {
		SubLObject p_condition = NIL;
		SubLObject p_condition_$16 = NIL;
		SubLObject q_condition = NIL;
		SubLObject q_condition_$17 = NIL;
		p_condition = p_conditions;
		p_condition_$16 = p_condition.first();
		q_condition = q_conditions;
		q_condition_$17 = q_condition.first();
		while ((NIL != q_condition) || (NIL != p_condition)) {
			if ((NIL != p_condition_$16) && (NIL == q_condition_$17)) {
				return NIL;
			}
			p_condition = p_condition.rest();
			p_condition_$16 = p_condition.first();
			q_condition = q_condition.rest();
			q_condition_$17 = q_condition.first();
		}
		return T;
	}

	public static SubLObject declare_inference_datastructures_strategy_file_alt() {
		declareFunction("strategy_print_function_trampoline", "STRATEGY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("strategy_p", "STRATEGY-P", 1, 0, false);
		new $strategy_p$UnaryFunction();
		declareFunction("strat_suid", "STRAT-SUID", 1, 0, false);
		declareFunction("strat_inference", "STRAT-INFERENCE", 1, 0, false);
		declareFunction("strat_result_uniqueness_criterion", "STRAT-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
		declareFunction("strat_active_problems", "STRAT-ACTIVE-PROBLEMS", 1, 0, false);
		declareFunction("strat_motivated_problems", "STRAT-MOTIVATED-PROBLEMS", 1, 0, false);
		declareFunction("strat_set_aside_problems", "STRAT-SET-ASIDE-PROBLEMS", 1, 0, false);
		declareFunction("strat_should_reconsider_set_asidesP", "STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
		declareFunction("strat_productivity_limit", "STRAT-PRODUCTIVITY-LIMIT", 1, 0, false);
		declareFunction("strat_removal_backtracking_productivity_limit",
				"STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
		declareFunction("strat_proof_spec", "STRAT-PROOF-SPEC", 1, 0, false);
		declareFunction("strat_problem_proof_spec_index", "STRAT-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
		declareFunction("strat_problem_strategic_index", "STRAT-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
		declareFunction("strat_memoization_state", "STRAT-MEMOIZATION-STATE", 1, 0, false);
		declareFunction("strat_type", "STRAT-TYPE", 1, 0, false);
		declareFunction("strat_data", "STRAT-DATA", 1, 0, false);
		declareFunction("_csetf_strat_suid", "_CSETF-STRAT-SUID", 2, 0, false);
		declareFunction("_csetf_strat_inference", "_CSETF-STRAT-INFERENCE", 2, 0, false);
		declareFunction("_csetf_strat_result_uniqueness_criterion", "_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION", 2, 0,
				false);
		declareFunction("_csetf_strat_active_problems", "_CSETF-STRAT-ACTIVE-PROBLEMS", 2, 0, false);
		declareFunction("_csetf_strat_motivated_problems", "_CSETF-STRAT-MOTIVATED-PROBLEMS", 2, 0, false);
		declareFunction("_csetf_strat_set_aside_problems", "_CSETF-STRAT-SET-ASIDE-PROBLEMS", 2, 0, false);
		declareFunction("_csetf_strat_should_reconsider_set_asidesP", "_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 2,
				0, false);
		declareFunction("_csetf_strat_productivity_limit", "_CSETF-STRAT-PRODUCTIVITY-LIMIT", 2, 0, false);
		declareFunction("_csetf_strat_removal_backtracking_productivity_limit",
				"_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
		declareFunction("_csetf_strat_proof_spec", "_CSETF-STRAT-PROOF-SPEC", 2, 0, false);
		declareFunction("_csetf_strat_problem_proof_spec_index", "_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX", 2, 0, false);
		declareFunction("_csetf_strat_problem_strategic_index", "_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX", 2, 0, false);
		declareFunction("_csetf_strat_memoization_state", "_CSETF-STRAT-MEMOIZATION-STATE", 2, 0, false);
		declareFunction("_csetf_strat_type", "_CSETF-STRAT-TYPE", 2, 0, false);
		declareFunction("_csetf_strat_data", "_CSETF-STRAT-DATA", 2, 0, false);
		declareFunction("make_strategy", "MAKE-STRATEGY", 0, 1, false);
		declareFunction("valid_strategy_p", "VALID-STRATEGY-P", 1, 0, false);
		declareFunction("strategy_invalid_p", "STRATEGY-INVALID-P", 1, 0, false);
		declareFunction("print_strategy", "PRINT-STRATEGY", 3, 0, false);
		declareFunction("sxhash_strategy_method", "SXHASH-STRATEGY-METHOD", 1, 0, false);
		new $sxhash_strategy_method$UnaryFunction();
		declareFunction("new_strategy", "NEW-STRATEGY", 2, 0, false);
		declareFunction("destroy_strategy", "DESTROY-STRATEGY", 1, 0, false);
		declareFunction("destroy_problem_store_strategy", "DESTROY-PROBLEM-STORE-STRATEGY", 1, 0, false);
		declareFunction("destroy_inference_strategy", "DESTROY-INFERENCE-STRATEGY", 1, 0, false);
		declareFunction("destroy_strategy_int", "DESTROY-STRATEGY-INT", 1, 0, false);
		declareFunction("note_strategy_invalid", "NOTE-STRATEGY-INVALID", 1, 0, false);
		declareFunction("remove_strategy_problem", "REMOVE-STRATEGY-PROBLEM", 2, 0, false);
		declareFunction("strategy_suid", "STRATEGY-SUID", 1, 0, false);
		declareFunction("strategy_inference", "STRATEGY-INFERENCE", 1, 0, false);
		declareFunction("strategy_local_result_uniqueness_criterion", "STRATEGY-LOCAL-RESULT-UNIQUENESS-CRITERION", 1,
				0, false);
		declareFunction("strategy_problem_strategic_index", "STRATEGY-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
		declareFunction("strategy_type", "STRATEGY-TYPE", 1, 0, false);
		declareFunction("strategy_data", "STRATEGY-DATA", 1, 0, false);
		declareFunction("strategy_active_problems", "STRATEGY-ACTIVE-PROBLEMS", 1, 0, false);
		declareFunction("strategy_motivated_problems", "STRATEGY-MOTIVATED-PROBLEMS", 1, 0, false);
		declareFunction("strategy_set_aside_problems", "STRATEGY-SET-ASIDE-PROBLEMS", 1, 0, false);
		declareFunction("strategy_should_reconsider_set_asidesP", "STRATEGY-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0,
				false);
		declareFunction("strategy_productivity_limit", "STRATEGY-PRODUCTIVITY-LIMIT", 1, 0, false);
		declareFunction("strategy_removal_backtracking_productivity_limit",
				"STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
		declareFunction("strategy_proof_spec", "STRATEGY-PROOF-SPEC", 1, 0, false);
		declareFunction("strategy_problem_proof_spec_index", "STRATEGY-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
		declareFunction("set_strategy_result_uniqueness_criterion", "SET-STRATEGY-RESULT-UNIQUENESS-CRITERION", 2, 0,
				false);
		declareFunction("set_strategy_productivity_limit", "SET-STRATEGY-PRODUCTIVITY-LIMIT", 2, 0, false);
		declareFunction("set_strategy_removal_backtracking_productivity_limit",
				"SET-STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
		declareFunction("set_strategy_proof_spec", "SET-STRATEGY-PROOF-SPEC", 2, 0, false);
		declareFunction("set_strategy_data", "SET-STRATEGY-DATA", 2, 0, false);
		declareMacro("do_strategy_active_problems", "DO-STRATEGY-ACTIVE-PROBLEMS");
		declareMacro("do_strategy_motivated_problems", "DO-STRATEGY-MOTIVATED-PROBLEMS");
		declareMacro("do_strategy_set_aside_problems", "DO-STRATEGY-SET-ASIDE-PROBLEMS");
		declareMacro("with_strategy_memoization_state", "WITH-STRATEGY-MEMOIZATION-STATE");
		declareFunction("strategy_memoization_state", "STRATEGY-MEMOIZATION-STATE", 1, 0, false);
		declareFunction("current_strategy_wrt_memoization", "CURRENT-STRATEGY-WRT-MEMOIZATION", 0, 0, false);
		declareFunction("strategic_context_inference", "STRATEGIC-CONTEXT-INFERENCE", 1, 0, false);
		declareFunction("strategy_answer_link", "STRATEGY-ANSWER-LINK", 1, 0, false);
		declareFunction("strategy_answer_link_propagatedP", "STRATEGY-ANSWER-LINK-PROPAGATED?", 1, 0, false);
		declareFunction("strategy_should_propagate_answer_linkP", "STRATEGY-SHOULD-PROPAGATE-ANSWER-LINK?", 1, 0,
				false);
		declareFunction("strategy_root_problem", "STRATEGY-ROOT-PROBLEM", 1, 0, false);
		declareFunction("strategy_continuableP", "STRATEGY-CONTINUABLE?", 1, 0, false);
		declareFunction("problem_active_in_strategyP", "PROBLEM-ACTIVE-IN-STRATEGY?", 2, 0, false);
		declareFunction("problem_motivatedP", "PROBLEM-MOTIVATED?", 2, 0, false);
		declareFunction("problem_set_aside_in_strategyP", "PROBLEM-SET-ASIDE-IN-STRATEGY?", 2, 0, false);
		declareFunction("strategy_has_some_set_aside_problemsP", "STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?", 1, 0, false);
		declareFunction("strategy_all_valid_set_aside_problems", "STRATEGY-ALL-VALID-SET-ASIDE-PROBLEMS", 1, 0, false);
		declareFunction("strategy_problem_store", "STRATEGY-PROBLEM-STORE", 1, 0, false);
		declareFunction("strategy_result_uniqueness_criterion", "STRATEGY-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
		declareFunction("strategy_unique_wrt_proofsP", "STRATEGY-UNIQUE-WRT-PROOFS?", 1, 0, false);
		declareFunction("strategy_unique_wrt_bindingsP", "STRATEGY-UNIQUE-WRT-BINDINGS?", 1, 0, false);
		declareFunction("strategy_wants_one_answerP", "STRATEGY-WANTS-ONE-ANSWER?", 1, 0, false);
		declareFunction("strategy_active_problem_count", "STRATEGY-ACTIVE-PROBLEM-COUNT", 1, 0, false);
		declareFunction("strategy_motivated_problem_count", "STRATEGY-MOTIVATED-PROBLEM-COUNT", 1, 0, false);
		declareFunction("strategy_set_aside_problem_count", "STRATEGY-SET-ASIDE-PROBLEM-COUNT", 1, 0, false);
		declareFunction("strategy_problem_proof_spec", "STRATEGY-PROBLEM-PROOF-SPEC", 2, 0, false);
		declareFunction("set_strategy_property", "SET-STRATEGY-PROPERTY", 3, 0, false);
		declareFunction("set_strategy_properties", "SET-STRATEGY-PROPERTIES", 2, 0, false);
		declareFunction("strategy_note_problem_active", "STRATEGY-NOTE-PROBLEM-ACTIVE", 2, 0, false);
		declareFunction("strategy_note_problem_inactive", "STRATEGY-NOTE-PROBLEM-INACTIVE", 2, 0, false);
		declareFunction("strategy_note_problem_motivated", "STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
		declareFunction("strategy_note_problem_unmotivated", "STRATEGY-NOTE-PROBLEM-UNMOTIVATED", 2, 0, false);
		declareFunction("strategy_note_problem_set_aside", "STRATEGY-NOTE-PROBLEM-SET-ASIDE", 2, 0, false);
		declareFunction("strategy_clear_problem_set_aside", "STRATEGY-CLEAR-PROBLEM-SET-ASIDE", 2, 0, false);
		declareFunction("strategy_clear_set_asides", "STRATEGY-CLEAR-SET-ASIDES", 1, 0, false);
		declareFunction("note_strategy_should_reconsider_set_asides", "NOTE-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1,
				0, false);
		declareFunction("clear_strategy_should_reconsider_set_asides", "CLEAR-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1,
				0, false);
		declareMacro("with_strategically_active_problem", "WITH-STRATEGICALLY-ACTIVE-PROBLEM");
		declareFunction("strategy_note_problem_proof_spec", "STRATEGY-NOTE-PROBLEM-PROOF-SPEC", 3, 0, false);
		declareFunction("strategy_dispatch", "STRATEGY-DISPATCH", 2, 5, false);
		declareFunction("strategy_dispatch_handler", "STRATEGY-DISPATCH-HANDLER", 2, 0, false);
		declareFunction("strategy_dispatch_funcall_0", "STRATEGY-DISPATCH-FUNCALL-0", 2, 0, false);
		declareFunction("strategy_dispatch_funcall_1", "STRATEGY-DISPATCH-FUNCALL-1", 3, 0, false);
		declareFunction("strategy_dispatch_funcall_2", "STRATEGY-DISPATCH-FUNCALL-2", 4, 0, false);
		declareFunction("strategy_dispatch_funcall_3", "STRATEGY-DISPATCH-FUNCALL-3", 5, 0, false);
		declareFunction("strategy_dispatch_funcall_4", "STRATEGY-DISPATCH-FUNCALL-4", 6, 0, false);
		declareFunction("strategy_dispatch_funcall_5", "STRATEGY-DISPATCH-FUNCALL-5", 7, 0, false);
		declareFunction("strategy_dispatch_unexpected_strategy_type_error",
				"STRATEGY-DISPATCH-UNEXPECTED-STRATEGY-TYPE-ERROR", 1, 0, false);
		declareFunction("controlling_strategy_callback", "CONTROLLING-STRATEGY-CALLBACK", 2, 4, false);
		declareFunction("strategy_type_p", "STRATEGY-TYPE-P", 1, 0, false);
		declareFunction("new_strategy_type", "NEW-STRATEGY-TYPE", 2, 0, false);
		declareFunction("deregister_strategy_type", "DEREGISTER-STRATEGY-TYPE", 1, 0, false);
		declareFunction("clear_strategy_type_store", "CLEAR-STRATEGY-TYPE-STORE", 0, 0, false);
		declareFunction("strategy_type_property", "STRATEGY-TYPE-PROPERTY", 2, 0, false);
		declareFunction("set_strategy_type_property", "SET-STRATEGY-TYPE-PROPERTY", 3, 0, false);
		declareFunction("uninterestingness_cache_thrown_away_wrt_removal_code",
				"UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-REMOVAL-CODE", 1, 0, false);
		declareFunction("uninterestingness_cache_thrown_away_wrt_transformation_code",
				"UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-TRANSFORMATION-CODE", 1, 0, false);
		declareFunction("uninterestingness_cache_thrown_away_wrt_new_root_code",
				"UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-NEW-ROOT-CODE", 1, 0, false);
		declareFunction("uninterestingness_cache_set_aside_wrt_removal_code",
				"UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-REMOVAL-CODE", 1, 0, false);
		declareFunction("uninterestingness_cache_set_aside_wrt_transformation_code",
				"UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-TRANSFORMATION-CODE", 1, 0, false);
		declareFunction("uninterestingness_cache_set_aside_wrt_new_root_code",
				"UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-NEW-ROOT-CODE", 1, 0, false);
		declareFunction("uninterestingness_cache_thrown_away_code", "UNINTERESTINGNESS-CACHE-THROWN-AWAY-CODE", 1, 0,
				false);
		declareFunction("uninterestingness_cache_set_aside_code", "UNINTERESTINGNESS-CACHE-SET-ASIDE-CODE", 1, 0,
				false);
		declareFunction("set_uninterestingness_cache_thrown_away_wrt_removal_code",
				"SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-REMOVAL-CODE", 2, 0, false);
		declareFunction("set_uninterestingness_cache_thrown_away_wrt_transformation_code",
				"SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-TRANSFORMATION-CODE", 2, 0, false);
		declareFunction("set_uninterestingness_cache_thrown_away_wrt_new_root_code",
				"SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-NEW-ROOT-CODE", 2, 0, false);
		declareFunction("set_uninterestingness_cache_set_aside_wrt_removal_code",
				"SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-REMOVAL-CODE", 2, 0, false);
		declareFunction("set_uninterestingness_cache_set_aside_wrt_transformation_code",
				"SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-TRANSFORMATION-CODE", 2, 0, false);
		declareFunction("set_uninterestingness_cache_set_aside_wrt_new_root_code",
				"SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-NEW-ROOT-CODE", 2, 0, false);
		declareFunction("set_uninterestingness_cache_thrown_away_code", "SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-CODE",
				2, 0, false);
		declareFunction("set_uninterestingness_cache_set_aside_code", "SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-CODE", 2,
				0, false);
		declareFunction("decode_uninterestingness_cache_code", "DECODE-UNINTERESTINGNESS-CACHE-CODE", 1, 0, false);
		declareFunction("encode_uninterestingness_cache_status", "ENCODE-UNINTERESTINGNESS-CACHE-STATUS", 1, 0, false);
		declareFunction("problem_strategic_properties_print_function_trampoline",
				"PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("problem_strategic_properties_p", "PROBLEM-STRATEGIC-PROPERTIES-P", 1, 0, false);
		new $problem_strategic_properties_p$UnaryFunction();
		declareFunction("prob_strategic_properties_status", "PROB-STRATEGIC-PROPERTIES-STATUS", 1, 0, false);
		declareFunction("prob_strategic_properties_tactic_strategic_property_index",
				"PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 1, 0, false);
		declareFunction("prob_strategic_properties_possible_tactic_count",
				"PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 1, 0, false);
		declareFunction("prob_strategic_properties_flags", "PROB-STRATEGIC-PROPERTIES-FLAGS", 1, 0, false);
		declareFunction("_csetf_prob_strategic_properties_status", "_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS", 2, 0,
				false);
		declareFunction("_csetf_prob_strategic_properties_tactic_strategic_property_index",
				"_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
		declareFunction("_csetf_prob_strategic_properties_possible_tactic_count",
				"_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 2, 0, false);
		declareFunction("_csetf_prob_strategic_properties_flags", "_CSETF-PROB-STRATEGIC-PROPERTIES-FLAGS", 2, 0,
				false);
		declareFunction("make_problem_strategic_properties", "MAKE-PROBLEM-STRATEGIC-PROPERTIES", 0, 1, false);
		declareFunction("new_problem_strategic_properties", "NEW-PROBLEM-STRATEGIC-PROPERTIES", 0, 0, false);
		declareFunction("problem_strategic_properties_int", "PROBLEM-STRATEGIC-PROPERTIES-INT", 2, 0, false);
		declareFunction("set_problem_strategic_properties", "SET-PROBLEM-STRATEGIC-PROPERTIES", 3, 0, false);
		declareFunction("remove_problem_strategic_properties", "REMOVE-PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
		declareFunction("problem_strategic_properties", "PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
		declareFunction("problem_strategic_properties_tactic_strategic_property_index",
				"PROBLEM-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
		declareFunction("problem_raw_strategic_status", "PROBLEM-RAW-STRATEGIC-STATUS", 2, 0, false);
		declareFunction("problem_strategic_status", "PROBLEM-STRATEGIC-STATUS", 2, 0, false);
		declareFunction("problem_strategic_provability_status", "PROBLEM-STRATEGIC-PROVABILITY-STATUS", 2, 0, false);
		declareFunction("problem_tactical_or_strategic_status", "PROBLEM-TACTICAL-OR-STRATEGIC-STATUS", 2, 0, false);
		declareFunction("problem_provability_status", "PROBLEM-PROVABILITY-STATUS", 2, 0, false);
		declareFunction("set_problem_raw_strategic_status", "SET-PROBLEM-RAW-STRATEGIC-STATUS", 3, 0, false);
		declareFunction("strategically_unexamined_problem_p", "STRATEGICALLY-UNEXAMINED-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_examined_problem_p", "STRATEGICALLY-EXAMINED-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_possible_problem_p", "STRATEGICALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_pending_problem_p", "STRATEGICALLY-PENDING-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_finished_problem_p", "STRATEGICALLY-FINISHED-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_no_good_problem_p", "STRATEGICALLY-NO-GOOD-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_neutral_problem_p", "STRATEGICALLY-NEUTRAL-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_good_problem_p", "STRATEGICALLY-GOOD-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_potentially_possible_problem_p", "STRATEGICALLY-POTENTIALLY-POSSIBLE-PROBLEM-P",
				2, 0, false);
		declareFunction("strategically_not_potentially_possible_problem_p",
				"STRATEGICALLY-NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_totally_no_good_problem_p", "STRATEGICALLY-TOTALLY-NO-GOOD-PROBLEM-P", 2, 0,
				false);
		declareFunction("problem_strategic_flags", "PROBLEM-STRATEGIC-FLAGS", 2, 0, false);
		declareFunction("set_problem_strategic_flags", "SET-PROBLEM-STRATEGIC-FLAGS", 3, 0, false);
		declareFunction("problem_thrown_away_cache_status", "PROBLEM-THROWN-AWAY-CACHE-STATUS", 2, 0, false);
		declareFunction("problem_thrown_away_cache_removal_status", "PROBLEM-THROWN-AWAY-CACHE-REMOVAL-STATUS", 2, 0,
				false);
		declareFunction("problem_thrown_away_cache_transformation_status",
				"PROBLEM-THROWN-AWAY-CACHE-TRANSFORMATION-STATUS", 2, 0, false);
		declareFunction("problem_thrown_away_cache_new_root_status", "PROBLEM-THROWN-AWAY-CACHE-NEW-ROOT-STATUS", 2, 0,
				false);
		declareFunction("problem_set_aside_cache_removal_status", "PROBLEM-SET-ASIDE-CACHE-REMOVAL-STATUS", 2, 0,
				false);
		declareFunction("problem_set_aside_cache_status", "PROBLEM-SET-ASIDE-CACHE-STATUS", 2, 0, false);
		declareFunction("problem_set_aside_cache_transformation_status",
				"PROBLEM-SET-ASIDE-CACHE-TRANSFORMATION-STATUS", 2, 0, false);
		declareFunction("problem_set_aside_cache_new_root_status", "PROBLEM-SET-ASIDE-CACHE-NEW-ROOT-STATUS", 2, 0,
				false);
		declareFunction("set_problem_thrown_away", "SET-PROBLEM-THROWN-AWAY", 2, 0, false);
		declareFunction("set_problem_not_thrown_away", "SET-PROBLEM-NOT-THROWN-AWAY", 2, 0, false);
		declareFunction("set_problem_recompute_thrown_away", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0, false);
		declareFunction("set_problem_thrown_away_wrt_removal", "SET-PROBLEM-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
		declareFunction("set_problem_not_thrown_away_wrt_removal", "SET-PROBLEM-NOT-THROWN-AWAY-WRT-REMOVAL", 2, 0,
				false);
		declareFunction("set_problem_recompute_thrown_away_wrt_removal",
				"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
		declareFunction("set_problem_thrown_away_wrt_transformation", "SET-PROBLEM-THROWN-AWAY-WRT-TRANSFORMATION", 2,
				0, false);
		declareFunction("set_problem_not_thrown_away_wrt_transformation",
				"SET-PROBLEM-NOT-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
		declareFunction("set_problem_recompute_thrown_away_wrt_transformation",
				"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
		declareFunction("set_problem_thrown_away_wrt_new_root", "SET-PROBLEM-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
		declareFunction("set_problem_not_thrown_away_wrt_new_root", "SET-PROBLEM-NOT-THROWN-AWAY-WRT-NEW-ROOT", 2, 0,
				false);
		declareFunction("set_problem_recompute_thrown_away_wrt_new_root",
				"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
		declareFunction("set_problem_set_aside", "SET-PROBLEM-SET-ASIDE", 2, 0, false);
		declareFunction("set_problem_not_set_aside", "SET-PROBLEM-NOT-SET-ASIDE", 2, 0, false);
		declareFunction("set_problem_recompute_set_aside", "SET-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0, false);
		declareFunction("set_problem_set_aside_wrt_removal", "SET-PROBLEM-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
		declareFunction("set_problem_not_set_aside_wrt_removal", "SET-PROBLEM-NOT-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
		declareFunction("set_problem_recompute_set_aside_wrt_removal", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-REMOVAL", 2,
				0, false);
		declareFunction("set_problem_set_aside_wrt_transformation", "SET-PROBLEM-SET-ASIDE-WRT-TRANSFORMATION", 2, 0,
				false);
		declareFunction("set_problem_not_set_aside_wrt_transformation", "SET-PROBLEM-NOT-SET-ASIDE-WRT-TRANSFORMATION",
				2, 0, false);
		declareFunction("set_problem_recompute_set_aside_wrt_transformation",
				"SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
		declareFunction("set_problem_set_aside_wrt_new_root", "SET-PROBLEM-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
		declareFunction("set_problem_not_set_aside_wrt_new_root", "SET-PROBLEM-NOT-SET-ASIDE-WRT-NEW-ROOT", 2, 0,
				false);
		declareFunction("set_problem_recompute_set_aside_wrt_new_root", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-NEW-ROOT",
				2, 0, false);
		declareFunction("set_problem_thrown_away_wrt", "SET-PROBLEM-THROWN-AWAY-WRT", 3, 0, false);
		declareFunction("set_problem_not_thrown_away_wrt", "SET-PROBLEM-NOT-THROWN-AWAY-WRT", 3, 0, false);
		declareFunction("set_problem_recompute_thrown_away_wrt", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT", 3, 0, false);
		declareFunction("set_problem_set_aside_wrt", "SET-PROBLEM-SET-ASIDE-WRT", 3, 0, false);
		declareFunction("set_problem_not_set_aside_wrt", "SET-PROBLEM-NOT-SET-ASIDE-WRT", 3, 0, false);
		declareFunction("set_problem_recompute_set_aside_wrt", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT", 3, 0, false);
		declareFunction("problem_thrown_away_cache_status_wrt_motivation",
				"PROBLEM-THROWN-AWAY-CACHE-STATUS-WRT-MOTIVATION", 3, 0, false);
		declareFunction("set_problem_recompute_thrown_away_wrt_all_motivations",
				"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-ALL-MOTIVATIONS", 2, 0, false);
		declareFunction("set_problem_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations",
				"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
		declareFunction("problem_set_aside_cache_status_wrt_motivation",
				"PROBLEM-SET-ASIDE-CACHE-STATUS-WRT-MOTIVATION", 3, 0, false);
		declareFunction("set_problem_recompute_set_aside_wrt_all_motivations",
				"SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-ALL-MOTIVATIONS", 2, 0, false);
		declareFunction("set_problem_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations",
				"SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
		declareFunction("tactic_strategic_properties_print_function_trampoline",
				"TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("tactic_strategic_properties_p", "TACTIC-STRATEGIC-PROPERTIES-P", 1, 0, false);
		new $tactic_strategic_properties_p$UnaryFunction();
		declareFunction("tact_strategic_properties_preference_level", "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 1,
				0, false);
		declareFunction("tact_strategic_properties_preference_level_justification",
				"TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
		declareFunction("tact_strategic_properties_productivity", "TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 1, 0,
				false);
		declareFunction("tact_strategic_properties_flags", "TACT-STRATEGIC-PROPERTIES-FLAGS", 1, 0, false);
		declareFunction("_csetf_tact_strategic_properties_preference_level",
				"_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 2, 0, false);
		declareFunction("_csetf_tact_strategic_properties_preference_level_justification",
				"_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
		declareFunction("_csetf_tact_strategic_properties_productivity",
				"_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 2, 0, false);
		declareFunction("_csetf_tact_strategic_properties_flags", "_CSETF-TACT-STRATEGIC-PROPERTIES-FLAGS", 2, 0,
				false);
		declareFunction("make_tactic_strategic_properties", "MAKE-TACTIC-STRATEGIC-PROPERTIES", 0, 1, false);
		declareFunction("new_tactic_strategic_properties", "NEW-TACTIC-STRATEGIC-PROPERTIES", 0, 0, false);
		declareFunction("tactic_strategic_properties_int", "TACTIC-STRATEGIC-PROPERTIES-INT", 2, 0, false);
		declareFunction("set_tactic_strategic_properties", "SET-TACTIC-STRATEGIC-PROPERTIES", 3, 0, false);
		declareFunction("tactic_strategic_properties", "TACTIC-STRATEGIC-PROPERTIES", 2, 0, false);
		declareFunction("tactic_strategic_completeness", "TACTIC-STRATEGIC-COMPLETENESS", 2, 0, false);
		declareFunction("tactic_strategic_preference_level", "TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
		declareFunction("tactic_strategic_preference_level_justification",
				"TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
		declareFunction("tactic_strategic_dwimmed_completeness", "TACTIC-STRATEGIC-DWIMMED-COMPLETENESS", 2, 0, false);
		declareFunction("conjunctive_tactic_strategic_preference_level",
				"CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
		declareFunction("conjunctive_tactic_strategic_preference_level_justification",
				"CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
		declareFunction("tactic_strategic_productivity", "TACTIC-STRATEGIC-PRODUCTIVITY", 2, 0, false);
		declareFunction("tactic_strategically_preferredP", "TACTIC-STRATEGICALLY-PREFERRED?", 2, 0, false);
		declareFunction("set_tactic_strategic_preference_level", "SET-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 4, 0, false);
		declareFunction("set_tactic_strategic_productivity", "SET-TACTIC-STRATEGIC-PRODUCTIVITY", 3, 0, false);
		declareFunction("tactic_strategic_flags", "TACTIC-STRATEGIC-FLAGS", 2, 0, false);
		declareFunction("set_tactic_strategic_flags", "SET-TACTIC-STRATEGIC-FLAGS", 3, 0, false);
		declareFunction("tactic_thrown_away_cache_status", "TACTIC-THROWN-AWAY-CACHE-STATUS", 2, 0, false);
		declareFunction("tactic_thrown_away_cache_removal_status", "TACTIC-THROWN-AWAY-CACHE-REMOVAL-STATUS", 2, 0,
				false);
		declareFunction("tactic_thrown_away_cache_transformation_status",
				"TACTIC-THROWN-AWAY-CACHE-TRANSFORMATION-STATUS", 2, 0, false);
		declareFunction("tactic_thrown_away_cache_new_root_status", "TACTIC-THROWN-AWAY-CACHE-NEW-ROOT-STATUS", 2, 0,
				false);
		declareFunction("tactic_set_aside_cache_status", "TACTIC-SET-ASIDE-CACHE-STATUS", 2, 0, false);
		declareFunction("tactic_set_aside_cache_removal_status", "TACTIC-SET-ASIDE-CACHE-REMOVAL-STATUS", 2, 0, false);
		declareFunction("tactic_set_aside_cache_transformation_status", "TACTIC-SET-ASIDE-CACHE-TRANSFORMATION-STATUS",
				2, 0, false);
		declareFunction("tactic_set_aside_cache_new_root_status", "TACTIC-SET-ASIDE-CACHE-NEW-ROOT-STATUS", 2, 0,
				false);
		declareFunction("set_tactic_thrown_away", "SET-TACTIC-THROWN-AWAY", 2, 0, false);
		declareFunction("set_tactic_not_thrown_away", "SET-TACTIC-NOT-THROWN-AWAY", 2, 0, false);
		declareFunction("set_tactic_recompute_thrown_away", "SET-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0, false);
		declareFunction("set_tactic_thrown_away_wrt_removal", "SET-TACTIC-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
		declareFunction("set_tactic_not_thrown_away_wrt_removal", "SET-TACTIC-NOT-THROWN-AWAY-WRT-REMOVAL", 2, 0,
				false);
		declareFunction("set_tactic_recompute_thrown_away_wrt_removal", "SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-REMOVAL",
				2, 0, false);
		declareFunction("set_tactic_thrown_away_wrt_transformation", "SET-TACTIC-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0,
				false);
		declareFunction("set_tactic_not_thrown_away_wrt_transformation",
				"SET-TACTIC-NOT-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
		declareFunction("set_tactic_recompute_thrown_away_wrt_transformation",
				"SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
		declareFunction("set_tactic_thrown_away_wrt_new_root", "SET-TACTIC-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
		declareFunction("set_tactic_not_thrown_away_wrt_new_root", "SET-TACTIC-NOT-THROWN-AWAY-WRT-NEW-ROOT", 2, 0,
				false);
		declareFunction("set_tactic_recompute_thrown_away_wrt_new_root",
				"SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
		declareFunction("set_tactic_set_aside", "SET-TACTIC-SET-ASIDE", 2, 0, false);
		declareFunction("set_tactic_not_set_aside", "SET-TACTIC-NOT-SET-ASIDE", 2, 0, false);
		declareFunction("set_tactic_recompute_set_aside", "SET-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false);
		declareFunction("set_tactic_set_aside_wrt_removal", "SET-TACTIC-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
		declareFunction("set_tactic_not_set_aside_wrt_removal", "SET-TACTIC-NOT-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
		declareFunction("set_tactic_recompute_set_aside_wrt_removal", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-REMOVAL", 2,
				0, false);
		declareFunction("set_tactic_set_aside_wrt_transformation", "SET-TACTIC-SET-ASIDE-WRT-TRANSFORMATION", 2, 0,
				false);
		declareFunction("set_tactic_not_set_aside_wrt_transformation", "SET-TACTIC-NOT-SET-ASIDE-WRT-TRANSFORMATION", 2,
				0, false);
		declareFunction("set_tactic_recompute_set_aside_wrt_transformation",
				"SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
		declareFunction("set_tactic_set_aside_wrt_new_root", "SET-TACTIC-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
		declareFunction("set_tactic_not_set_aside_wrt_new_root", "SET-TACTIC-NOT-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
		declareFunction("set_tactic_recompute_set_aside_wrt_new_root", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-NEW-ROOT", 2,
				0, false);
		declareFunction("set_tactic_thrown_away_wrt", "SET-TACTIC-THROWN-AWAY-WRT", 3, 0, false);
		declareFunction("set_tactic_not_thrown_away_wrt", "SET-TACTIC-NOT-THROWN-AWAY-WRT", 3, 0, false);
		declareFunction("set_tactic_recompute_thrown_away_wrt", "SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT", 3, 0, false);
		declareFunction("set_tactic_set_aside_wrt", "SET-TACTIC-SET-ASIDE-WRT", 3, 0, false);
		declareFunction("set_tactic_not_set_aside_wrt", "SET-TACTIC-NOT-SET-ASIDE-WRT", 3, 0, false);
		declareFunction("set_tactic_recompute_set_aside_wrt", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT", 3, 0, false);
		declareFunction("tactic_thrown_away_cache_status_wrt_motivation",
				"TACTIC-THROWN-AWAY-CACHE-STATUS-WRT-MOTIVATION", 3, 0, false);
		declareFunction("set_tactic_recompute_thrown_away_wrt_all_motivations",
				"SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-ALL-MOTIVATIONS", 2, 0, false);
		declareFunction("set_problem_tactics_recompute_thrown_away_wrt_all_motivations",
				"SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY-WRT-ALL-MOTIVATIONS", 2, 0, false);
		declareFunction("set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations",
				"SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0,
				false);
		declareFunction("tactic_set_aside_cache_status_wrt_motivation", "TACTIC-SET-ASIDE-CACHE-STATUS-WRT-MOTIVATION",
				3, 0, false);
		declareFunction("set_tactic_recompute_set_aside_wrt_all_motivations",
				"SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-ALL-MOTIVATIONS", 2, 0, false);
		declareFunction("set_tactic_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations",
				"SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
		declareFunction("set_problem_tactics_recompute_set_aside_wrt_all_motivations",
				"SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE-WRT-ALL-MOTIVATIONS", 2, 0, false);
		declareFunction("set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations",
				"SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
		declareFunction("problem_strategically_possible_tactic_count", "PROBLEM-STRATEGICALLY-POSSIBLE-TACTIC-COUNT", 2,
				0, false);
		declareFunction("problem_note_tactic_strategically_possible", "PROBLEM-NOTE-TACTIC-STRATEGICALLY-POSSIBLE", 3,
				0, false);
		declareFunction("problem_note_tactic_not_strategically_possible",
				"PROBLEM-NOTE-TACTIC-NOT-STRATEGICALLY-POSSIBLE", 3, 0, false);
		declareFunction("problem_note_all_tactics_not_strategically_possible",
				"PROBLEM-NOTE-ALL-TACTICS-NOT-STRATEGICALLY-POSSIBLE", 2, 0, false);
		return NIL;
	}

	public static SubLObject declare_inference_datastructures_strategy_file() {
		if (SubLFiles.USE_V1) {
			declareFunction("strategy_print_function_trampoline", "STRATEGY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
			declareFunction("strategy_p", "STRATEGY-P", 1, 0, false);
			new inference_datastructures_strategy.$strategy_p$UnaryFunction();
			declareFunction("strat_suid", "STRAT-SUID", 1, 0, false);
			declareFunction("strat_inference", "STRAT-INFERENCE", 1, 0, false);
			declareFunction("strat_result_uniqueness_criterion", "STRAT-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
			declareFunction("strat_active_problems", "STRAT-ACTIVE-PROBLEMS", 1, 0, false);
			declareFunction("strat_motivated_problems", "STRAT-MOTIVATED-PROBLEMS", 1, 0, false);
			declareFunction("strat_set_aside_problems", "STRAT-SET-ASIDE-PROBLEMS", 1, 0, false);
			declareFunction("strat_should_reconsider_set_asidesP", "STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
			declareFunction("strat_productivity_limit", "STRAT-PRODUCTIVITY-LIMIT", 1, 0, false);
			declareFunction("strat_removal_backtracking_productivity_limit",
					"STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
			declareFunction("strat_proof_spec", "STRAT-PROOF-SPEC", 1, 0, false);
			declareFunction("strat_problem_proof_spec_index", "STRAT-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
			declareFunction("strat_problem_strategic_index", "STRAT-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
			declareFunction("strat_memoization_state", "STRAT-MEMOIZATION-STATE", 1, 0, false);
			declareFunction("strat_step_count", "STRAT-STEP-COUNT", 1, 0, false);
			declareFunction("strat_type", "STRAT-TYPE", 1, 0, false);
			declareFunction("strat_data", "STRAT-DATA", 1, 0, false);
			declareFunction("_csetf_strat_suid", "_CSETF-STRAT-SUID", 2, 0, false);
			declareFunction("_csetf_strat_inference", "_CSETF-STRAT-INFERENCE", 2, 0, false);
			declareFunction("_csetf_strat_result_uniqueness_criterion", "_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION", 2,
					0, false);
			declareFunction("_csetf_strat_active_problems", "_CSETF-STRAT-ACTIVE-PROBLEMS", 2, 0, false);
			declareFunction("_csetf_strat_motivated_problems", "_CSETF-STRAT-MOTIVATED-PROBLEMS", 2, 0, false);
			declareFunction("_csetf_strat_set_aside_problems", "_CSETF-STRAT-SET-ASIDE-PROBLEMS", 2, 0, false);
			declareFunction("_csetf_strat_should_reconsider_set_asidesP", "_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?",
					2, 0, false);
			declareFunction("_csetf_strat_productivity_limit", "_CSETF-STRAT-PRODUCTIVITY-LIMIT", 2, 0, false);
			declareFunction("_csetf_strat_removal_backtracking_productivity_limit",
					"_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
			declareFunction("_csetf_strat_proof_spec", "_CSETF-STRAT-PROOF-SPEC", 2, 0, false);
			declareFunction("_csetf_strat_problem_proof_spec_index", "_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX", 2, 0,
					false);
			declareFunction("_csetf_strat_problem_strategic_index", "_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX", 2, 0,
					false);
			declareFunction("_csetf_strat_memoization_state", "_CSETF-STRAT-MEMOIZATION-STATE", 2, 0, false);
			declareFunction("_csetf_strat_step_count", "_CSETF-STRAT-STEP-COUNT", 2, 0, false);
			declareFunction("_csetf_strat_type", "_CSETF-STRAT-TYPE", 2, 0, false);
			declareFunction("_csetf_strat_data", "_CSETF-STRAT-DATA", 2, 0, false);
			declareFunction("make_strategy", "MAKE-STRATEGY", 0, 1, false);
			declareFunction("visit_defstruct_strategy", "VISIT-DEFSTRUCT-STRATEGY", 2, 0, false);
			declareFunction("visit_defstruct_object_strategy_method", "VISIT-DEFSTRUCT-OBJECT-STRATEGY-METHOD", 2, 0,
					false);
			declareFunction("valid_strategy_p", "VALID-STRATEGY-P", 1, 0, false);
			declareFunction("strategy_invalid_p", "STRATEGY-INVALID-P", 1, 0, false);
			declareFunction("print_strategy", "PRINT-STRATEGY", 3, 0, false);
			declareFunction("sxhash_strategy_method", "SXHASH-STRATEGY-METHOD", 1, 0, false);
			new inference_datastructures_strategy.$sxhash_strategy_method$UnaryFunction();
			declareFunction("new_strategy", "NEW-STRATEGY", 2, 0, false);
			declareFunction("destroy_strategy", "DESTROY-STRATEGY", 1, 0, false);
			declareFunction("destroy_problem_store_strategy", "DESTROY-PROBLEM-STORE-STRATEGY", 1, 0, false);
			declareFunction("destroy_inference_strategy", "DESTROY-INFERENCE-STRATEGY", 1, 0, false);
			declareFunction("destroy_strategy_int", "DESTROY-STRATEGY-INT", 1, 0, false);
			declareFunction("note_strategy_invalid", "NOTE-STRATEGY-INVALID", 1, 0, false);
			declareFunction("remove_strategy_problem", "REMOVE-STRATEGY-PROBLEM", 2, 0, false);
			declareFunction("strategy_suid", "STRATEGY-SUID", 1, 0, false);
			declareFunction("strategy_inference", "STRATEGY-INFERENCE", 1, 0, false);
			declareFunction("strategy_local_result_uniqueness_criterion", "STRATEGY-LOCAL-RESULT-UNIQUENESS-CRITERION",
					1, 0, false);
			declareFunction("strategy_problem_strategic_index", "STRATEGY-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
			declareFunction("strategy_type", "STRATEGY-TYPE", 1, 0, false);
			declareFunction("strategy_data", "STRATEGY-DATA", 1, 0, false);
			declareFunction("strategy_active_problems", "STRATEGY-ACTIVE-PROBLEMS", 1, 0, false);
			declareFunction("strategy_motivated_problems", "STRATEGY-MOTIVATED-PROBLEMS", 1, 0, false);
			declareFunction("strategy_set_aside_problems", "STRATEGY-SET-ASIDE-PROBLEMS", 1, 0, false);
			declareFunction("strategy_should_reconsider_set_asidesP", "STRATEGY-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0,
					false);
			declareFunction("strategy_productivity_limit", "STRATEGY-PRODUCTIVITY-LIMIT", 1, 0, false);
			declareFunction("strategy_removal_backtracking_productivity_limit",
					"STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
			declareFunction("strategy_proof_spec", "STRATEGY-PROOF-SPEC", 1, 0, false);
			declareFunction("strategy_problem_proof_spec_index", "STRATEGY-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
			declareFunction("strategy_step_count", "STRATEGY-STEP-COUNT", 1, 0, false);
			declareFunction("set_strategy_result_uniqueness_criterion", "SET-STRATEGY-RESULT-UNIQUENESS-CRITERION", 2,
					0, false);
			declareFunction("set_strategy_productivity_limit", "SET-STRATEGY-PRODUCTIVITY-LIMIT", 2, 0, false);
			declareFunction("set_strategy_removal_backtracking_productivity_limit",
					"SET-STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
			declareFunction("set_strategy_proof_spec", "SET-STRATEGY-PROOF-SPEC", 2, 0, false);
			declareFunction("set_strategy_data", "SET-STRATEGY-DATA", 2, 0, false);
			declareMacro("do_strategy_active_problems", "DO-STRATEGY-ACTIVE-PROBLEMS");
			declareMacro("do_strategy_motivated_problems", "DO-STRATEGY-MOTIVATED-PROBLEMS");
			declareMacro("do_strategy_set_aside_problems", "DO-STRATEGY-SET-ASIDE-PROBLEMS");
			declareMacro("with_strategy_memoization_state", "WITH-STRATEGY-MEMOIZATION-STATE");
			declareFunction("strategy_memoization_state", "STRATEGY-MEMOIZATION-STATE", 1, 0, false);
			declareFunction("current_strategy_wrt_memoization", "CURRENT-STRATEGY-WRT-MEMOIZATION", 0, 0, false);
			declareFunction("strategic_context_inference", "STRATEGIC-CONTEXT-INFERENCE", 1, 0, false);
			declareFunction("strategy_answer_link", "STRATEGY-ANSWER-LINK", 1, 0, false);
			declareFunction("strategy_answer_link_propagatedP", "STRATEGY-ANSWER-LINK-PROPAGATED?", 1, 0, false);
			declareFunction("strategy_should_propagate_answer_linkP", "STRATEGY-SHOULD-PROPAGATE-ANSWER-LINK?", 1, 0,
					false);
			declareFunction("strategy_root_problem", "STRATEGY-ROOT-PROBLEM", 1, 0, false);
			declareFunction("strategy_continuableP", "STRATEGY-CONTINUABLE?", 1, 0, false);
			declareFunction("problem_active_in_strategyP", "PROBLEM-ACTIVE-IN-STRATEGY?", 2, 0, false);
			declareFunction("problem_motivatedP", "PROBLEM-MOTIVATED?", 2, 0, false);
			declareFunction("problem_set_aside_in_strategyP", "PROBLEM-SET-ASIDE-IN-STRATEGY?", 2, 0, false);
			declareFunction("strategy_has_some_set_aside_problemsP", "STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?", 1, 0,
					false);
			declareFunction("strategy_all_valid_set_aside_problems", "STRATEGY-ALL-VALID-SET-ASIDE-PROBLEMS", 1, 0,
					false);
			declareFunction("strategy_problem_store", "STRATEGY-PROBLEM-STORE", 1, 0, false);
			declareFunction("strategy_result_uniqueness_criterion", "STRATEGY-RESULT-UNIQUENESS-CRITERION", 1, 0,
					false);
			declareFunction("strategy_unique_wrt_proofsP", "STRATEGY-UNIQUE-WRT-PROOFS?", 1, 0, false);
			declareFunction("strategy_unique_wrt_bindingsP", "STRATEGY-UNIQUE-WRT-BINDINGS?", 1, 0, false);
			declareFunction("strategy_wants_one_answerP", "STRATEGY-WANTS-ONE-ANSWER?", 1, 0, false);
			declareFunction("strategy_active_problem_count", "STRATEGY-ACTIVE-PROBLEM-COUNT", 1, 0, false);
			declareFunction("strategy_motivated_problem_count", "STRATEGY-MOTIVATED-PROBLEM-COUNT", 1, 0, false);
			declareFunction("strategy_set_aside_problem_count", "STRATEGY-SET-ASIDE-PROBLEM-COUNT", 1, 0, false);
			declareFunction("strategy_problem_proof_spec", "STRATEGY-PROBLEM-PROOF-SPEC", 2, 0, false);
			declareFunction("set_strategy_property", "SET-STRATEGY-PROPERTY", 3, 0, false);
			declareFunction("copy_strategy_properties", "COPY-STRATEGY-PROPERTIES", 2, 0, false);
			declareFunction("set_strategy_properties", "SET-STRATEGY-PROPERTIES", 2, 0, false);
			declareFunction("strategy_note_problem_active", "STRATEGY-NOTE-PROBLEM-ACTIVE", 2, 0, false);
			declareFunction("strategy_note_problem_inactive", "STRATEGY-NOTE-PROBLEM-INACTIVE", 2, 0, false);
			declareFunction("strategy_note_problem_motivated", "STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
			declareFunction("strategy_note_problem_unmotivated", "STRATEGY-NOTE-PROBLEM-UNMOTIVATED", 2, 0, false);
			declareFunction("strategy_note_problem_set_aside", "STRATEGY-NOTE-PROBLEM-SET-ASIDE", 2, 0, false);
			declareFunction("strategy_clear_problem_set_aside", "STRATEGY-CLEAR-PROBLEM-SET-ASIDE", 2, 0, false);
			declareFunction("strategy_clear_set_asides", "STRATEGY-CLEAR-SET-ASIDES", 1, 0, false);
			declareFunction("note_strategy_should_reconsider_set_asides", "NOTE-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES",
					1, 0, false);
			declareFunction("clear_strategy_should_reconsider_set_asides",
					"CLEAR-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1, 0, false);
			declareMacro("with_strategically_active_problem", "WITH-STRATEGICALLY-ACTIVE-PROBLEM");
			declareFunction("strategy_note_problem_proof_spec", "STRATEGY-NOTE-PROBLEM-PROOF-SPEC", 3, 0, false);
			declareFunction("increment_strategy_step_count", "INCREMENT-STRATEGY-STEP-COUNT", 1, 0, false);
			declareFunction("strategy_dispatch", "STRATEGY-DISPATCH", 2, 5, false);
			declareFunction("strategy_dispatch_handler", "STRATEGY-DISPATCH-HANDLER", 2, 0, false);
			declareFunction("strategy_dispatch_funcall_0", "STRATEGY-DISPATCH-FUNCALL-0", 2, 0, false);
			declareFunction("strategy_dispatch_funcall_1", "STRATEGY-DISPATCH-FUNCALL-1", 3, 0, false);
			declareFunction("strategy_dispatch_funcall_2", "STRATEGY-DISPATCH-FUNCALL-2", 4, 0, false);
			declareFunction("strategy_dispatch_funcall_3", "STRATEGY-DISPATCH-FUNCALL-3", 5, 0, false);
			declareFunction("strategy_dispatch_funcall_4", "STRATEGY-DISPATCH-FUNCALL-4", 6, 0, false);
			declareFunction("strategy_dispatch_funcall_5", "STRATEGY-DISPATCH-FUNCALL-5", 7, 0, false);
			declareFunction("strategy_dispatch_unexpected_strategy_type_error",
					"STRATEGY-DISPATCH-UNEXPECTED-STRATEGY-TYPE-ERROR", 1, 0, false);
			declareFunction("controlling_strategy_callback", "CONTROLLING-STRATEGY-CALLBACK", 2, 4, false);
			declareFunction("strategy_type_p", "STRATEGY-TYPE-P", 1, 0, false);
			declareFunction("new_strategy_type", "NEW-STRATEGY-TYPE", 2, 0, false);
			declareFunction("deregister_strategy_type", "DEREGISTER-STRATEGY-TYPE", 1, 0, false);
			declareFunction("clear_strategy_type_store", "CLEAR-STRATEGY-TYPE-STORE", 0, 0, false);
			declareFunction("strategy_type_property", "STRATEGY-TYPE-PROPERTY", 2, 0, false);
			declareFunction("set_strategy_type_property", "SET-STRATEGY-TYPE-PROPERTY", 3, 0, false);
			declareFunction("default_uninterestingness_cache_value", "DEFAULT-UNINTERESTINGNESS-CACHE-VALUE", 0, 0,
					false);
			declareFunction("problem_strategic_properties_print_function_trampoline",
					"PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
			declareFunction("problem_strategic_properties_p", "PROBLEM-STRATEGIC-PROPERTIES-P", 1, 0, false);
			new inference_datastructures_strategy.$problem_strategic_properties_p$UnaryFunction();
			declareFunction("prob_strategic_properties_status", "PROB-STRATEGIC-PROPERTIES-STATUS", 1, 0, false);
			declareFunction("prob_strategic_properties_tactic_strategic_property_index",
					"PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 1, 0, false);
			declareFunction("prob_strategic_properties_possible_tactic_count",
					"PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 1, 0, false);
			declareFunction("prob_strategic_properties_uninterestingness",
					"PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 1, 0, false);
			declareFunction("_csetf_prob_strategic_properties_status", "_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS", 2, 0,
					false);
			declareFunction("_csetf_prob_strategic_properties_tactic_strategic_property_index",
					"_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
			declareFunction("_csetf_prob_strategic_properties_possible_tactic_count",
					"_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 2, 0, false);
			declareFunction("_csetf_prob_strategic_properties_uninterestingness",
					"_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 2, 0, false);
			declareFunction("make_problem_strategic_properties", "MAKE-PROBLEM-STRATEGIC-PROPERTIES", 0, 1, false);
			declareFunction("visit_defstruct_problem_strategic_properties",
					"VISIT-DEFSTRUCT-PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
			declareFunction("visit_defstruct_object_problem_strategic_properties_method",
					"VISIT-DEFSTRUCT-OBJECT-PROBLEM-STRATEGIC-PROPERTIES-METHOD", 2, 0, false);
			declareFunction("new_problem_strategic_properties", "NEW-PROBLEM-STRATEGIC-PROPERTIES", 0, 0, false);
			declareFunction("problem_strategic_properties_int", "PROBLEM-STRATEGIC-PROPERTIES-INT", 2, 0, false);
			declareFunction("set_problem_strategic_properties", "SET-PROBLEM-STRATEGIC-PROPERTIES", 3, 0, false);
			declareFunction("remove_problem_strategic_properties", "REMOVE-PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
			declareFunction("problem_strategic_properties", "PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
			declareFunction("problem_strategic_properties_tactic_strategic_property_index",
					"PROBLEM-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
			declareFunction("problem_dwimmed_strategic_status", "PROBLEM-DWIMMED-STRATEGIC-STATUS", 2, 0, false);
			declareFunction("problem_raw_strategic_status", "PROBLEM-RAW-STRATEGIC-STATUS", 2, 0, false);
			declareFunction("problem_weak_strategic_status", "PROBLEM-WEAK-STRATEGIC-STATUS", 2, 0, false);
			declareFunction("problem_strategic_status", "PROBLEM-STRATEGIC-STATUS", 2, 0, false);
			declareFunction("problem_strategic_provability_status", "PROBLEM-STRATEGIC-PROVABILITY-STATUS", 2, 0,
					false);
			declareFunction("problem_tactical_or_strategic_status", "PROBLEM-TACTICAL-OR-STRATEGIC-STATUS", 2, 0,
					false);
			declareFunction("problem_provability_status", "PROBLEM-PROVABILITY-STATUS", 2, 0, false);
			declareFunction("set_problem_raw_strategic_status", "SET-PROBLEM-RAW-STRATEGIC-STATUS", 3, 0, false);
			declareFunction("strategically_unexamined_problem_p", "STRATEGICALLY-UNEXAMINED-PROBLEM-P", 2, 0, false);
			declareFunction("strategically_examined_problem_p", "STRATEGICALLY-EXAMINED-PROBLEM-P", 2, 0, false);
			declareFunction("strategically_possible_problem_p", "STRATEGICALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
			declareFunction("strategically_pending_problem_p", "STRATEGICALLY-PENDING-PROBLEM-P", 2, 0, false);
			declareFunction("strategically_finished_problem_p", "STRATEGICALLY-FINISHED-PROBLEM-P", 2, 0, false);
			declareFunction("strategically_no_good_problem_p", "STRATEGICALLY-NO-GOOD-PROBLEM-P", 2, 0, false);
			declareFunction("strategically_neutral_problem_p", "STRATEGICALLY-NEUTRAL-PROBLEM-P", 2, 0, false);
			declareFunction("strategically_good_problem_p", "STRATEGICALLY-GOOD-PROBLEM-P", 2, 0, false);
			declareFunction("strategically_potentially_possible_problem_p",
					"STRATEGICALLY-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
			declareFunction("strategically_not_potentially_possible_problem_p",
					"STRATEGICALLY-NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
			declareFunction("strategically_totally_no_good_problem_p", "STRATEGICALLY-TOTALLY-NO-GOOD-PROBLEM-P", 2, 0,
					false);
			declareFunction("problem_strategic_uninterestingness", "PROBLEM-STRATEGIC-UNINTERESTINGNESS", 2, 0, false);
			declareFunction("set_problem_strategic_uninterestingness", "SET-PROBLEM-STRATEGIC-UNINTERESTINGNESS", 3, 0,
					false);
			declareFunction("set_just_problem_thrown_away", "SET-JUST-PROBLEM-THROWN-AWAY", 3, 0, false);
			declareFunction("set_just_problem_not_thrown_away", "SET-JUST-PROBLEM-NOT-THROWN-AWAY", 3, 0, false);
			declareFunction("set_just_problem_recompute_thrown_away", "SET-JUST-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0,
					false);
			declareFunction("set_just_problem_set_aside", "SET-JUST-PROBLEM-SET-ASIDE", 3, 0, false);
			declareFunction("set_just_problem_not_set_aside", "SET-JUST-PROBLEM-NOT-SET-ASIDE", 3, 0, false);
			declareFunction("set_just_problem_recompute_set_aside", "SET-JUST-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0,
					false);
			declareFunction("problem_thrown_away_cache_status", "PROBLEM-THROWN-AWAY-CACHE-STATUS", 2, 1, false);
			declareFunction("problem_set_aside_cache_status", "PROBLEM-SET-ASIDE-CACHE-STATUS", 2, 1, false);
			declareFunction("set_problem_thrown_away", "SET-PROBLEM-THROWN-AWAY", 2, 1, false);
			declareFunction("set_problem_not_thrown_away", "SET-PROBLEM-NOT-THROWN-AWAY", 2, 1, false);
			declareFunction("set_problem_set_aside", "SET-PROBLEM-SET-ASIDE", 2, 1, false);
			declareFunction("set_problem_not_set_aside", "SET-PROBLEM-NOT-SET-ASIDE", 2, 1, false);
			declareFunction("set_problem_recompute_thrown_away", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0, false);
			declareFunction("set_problem_recompute_set_aside", "SET-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0, false);
			declareFunction("tactic_strategic_properties_print_function_trampoline",
					"TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
			declareFunction("tactic_strategic_properties_p", "TACTIC-STRATEGIC-PROPERTIES-P", 1, 0, false);
			new inference_datastructures_strategy.$tactic_strategic_properties_p$UnaryFunction();
			declareFunction("tact_strategic_properties_preference_level", "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL",
					1, 0, false);
			declareFunction("tact_strategic_properties_preference_level_justification",
					"TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
			declareFunction("tact_strategic_properties_productivity", "TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 1, 0,
					false);
			declareFunction("tact_strategic_properties_uninterestingness",
					"TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 1, 0, false);
			declareFunction("_csetf_tact_strategic_properties_preference_level",
					"_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 2, 0, false);
			declareFunction("_csetf_tact_strategic_properties_preference_level_justification",
					"_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
			declareFunction("_csetf_tact_strategic_properties_productivity",
					"_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 2, 0, false);
			declareFunction("_csetf_tact_strategic_properties_uninterestingness",
					"_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 2, 0, false);
			declareFunction("make_tactic_strategic_properties", "MAKE-TACTIC-STRATEGIC-PROPERTIES", 0, 1, false);
			declareFunction("visit_defstruct_tactic_strategic_properties",
					"VISIT-DEFSTRUCT-TACTIC-STRATEGIC-PROPERTIES", 2, 0, false);
			declareFunction("visit_defstruct_object_tactic_strategic_properties_method",
					"VISIT-DEFSTRUCT-OBJECT-TACTIC-STRATEGIC-PROPERTIES-METHOD", 2, 0, false);
			declareFunction("new_tactic_strategic_properties", "NEW-TACTIC-STRATEGIC-PROPERTIES", 0, 0, false);
			declareFunction("tactic_strategic_properties_int", "TACTIC-STRATEGIC-PROPERTIES-INT", 2, 0, false);
			declareFunction("set_tactic_strategic_properties", "SET-TACTIC-STRATEGIC-PROPERTIES", 3, 0, false);
			declareFunction("tactic_strategic_properties", "TACTIC-STRATEGIC-PROPERTIES", 2, 0, false);
			declareFunction("tactic_strategic_completeness", "TACTIC-STRATEGIC-COMPLETENESS", 2, 0, false);
			declareFunction("tactic_strategic_preference_level", "TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
			declareFunction("tactic_strategic_preference_level_justification",
					"TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
			declareFunction("tactic_strategic_dwimmed_completeness", "TACTIC-STRATEGIC-DWIMMED-COMPLETENESS", 2, 0,
					false);
			declareFunction("conjunctive_tactic_strategic_preference_level",
					"CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
			declareFunction("conjunctive_tactic_strategic_preference_level_justification",
					"CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
			declareFunction("tactic_strategic_productivity", "TACTIC-STRATEGIC-PRODUCTIVITY", 2, 0, false);
			declareFunction("tactic_strategically_preferredP", "TACTIC-STRATEGICALLY-PREFERRED?", 2, 0, false);
			declareFunction("set_tactic_strategic_preference_level", "SET-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 4, 0,
					false);
			declareFunction("set_tactic_strategic_productivity", "SET-TACTIC-STRATEGIC-PRODUCTIVITY", 3, 0, false);
			declareFunction("problem_strategically_possible_tactic_count",
					"PROBLEM-STRATEGICALLY-POSSIBLE-TACTIC-COUNT", 2, 0, false);
			declareFunction("problem_note_tactic_strategically_possible", "PROBLEM-NOTE-TACTIC-STRATEGICALLY-POSSIBLE",
					3, 0, false);
			declareFunction("problem_note_tactic_not_strategically_possible",
					"PROBLEM-NOTE-TACTIC-NOT-STRATEGICALLY-POSSIBLE", 3, 0, false);
			declareFunction("problem_note_all_tactics_not_strategically_possible",
					"PROBLEM-NOTE-ALL-TACTICS-NOT-STRATEGICALLY-POSSIBLE", 2, 0, false);
			declareFunction("tactic_strategic_uninterestingness", "TACTIC-STRATEGIC-UNINTERESTINGNESS", 2, 0, false);
			declareFunction("set_tactic_strategic_uninterestingness", "SET-TACTIC-STRATEGIC-UNINTERESTINGNESS", 3, 0,
					false);
			declareFunction("thrown_away_cache_status_from_uninterestingness",
					"THROWN-AWAY-CACHE-STATUS-FROM-UNINTERESTINGNESS", 2, 0, false);
			declareFunction("set_aside_cache_status_from_uninterestingness",
					"SET-ASIDE-CACHE-STATUS-FROM-UNINTERESTINGNESS", 2, 0, false);
			declareFunction("note_uninterestingness_cache_thrown_away_value",
					"NOTE-UNINTERESTINGNESS-CACHE-THROWN-AWAY-VALUE", 3, 0, false);
			declareFunction("note_uninterestingness_cache_set_aside_value",
					"NOTE-UNINTERESTINGNESS-CACHE-SET-ASIDE-VALUE", 3, 0, false);
			declareFunction("uninterestingness_cache_value_p", "UNINTERESTINGNESS-CACHE-VALUE-P", 1, 0, false);
			declareFunction("uninterestingness_cache_conditions_p", "UNINTERESTINGNESS-CACHE-CONDITIONS-P", 1, 0,
					false);
			declareFunction("uninterestingness_cache_conditions_list_p", "UNINTERESTINGNESS-CACHE-CONDITIONS-LIST-P", 1,
					0, false);
			declareFunction("thrown_away_cache_value_p", "THROWN-AWAY-CACHE-VALUE-P", 1, 0, false);
			declareFunction("set_aside_cache_value_p", "SET-ASIDE-CACHE-VALUE-P", 1, 0, false);
			declareFunction("ignore_cache_value_p", "IGNORE-CACHE-VALUE-P", 1, 0, false);
			declareFunction("set_just_tactic_thrown_away", "SET-JUST-TACTIC-THROWN-AWAY", 3, 0, false);
			declareFunction("set_just_tactic_not_thrown_away", "SET-JUST-TACTIC-NOT-THROWN-AWAY", 3, 0, false);
			declareFunction("set_just_tactic_recompute_thrown_away", "SET-JUST-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0,
					false);
			declareFunction("set_just_tactic_set_aside", "SET-JUST-TACTIC-SET-ASIDE", 3, 0, false);
			declareFunction("set_just_tactic_not_set_aside", "SET-JUST-TACTIC-NOT-SET-ASIDE", 3, 0, false);
			declareFunction("set_just_tactic_recompute_set_aside", "SET-JUST-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false);
			declareFunction("tactic_thrown_away_cache_status", "TACTIC-THROWN-AWAY-CACHE-STATUS", 2, 1, false);
			declareFunction("tactic_set_aside_cache_status", "TACTIC-SET-ASIDE-CACHE-STATUS", 2, 1, false);
			declareFunction("set_tactic_thrown_away", "SET-TACTIC-THROWN-AWAY", 2, 1, false);
			declareFunction("set_tactic_not_thrown_away", "SET-TACTIC-NOT-THROWN-AWAY", 2, 1, false);
			declareFunction("set_tactic_recompute_thrown_away", "SET-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0, false);
			declareFunction("set_tactic_set_aside", "SET-TACTIC-SET-ASIDE", 2, 1, false);
			declareFunction("set_tactic_not_set_aside", "SET-TACTIC-NOT-SET-ASIDE", 2, 1, false);
			declareFunction("set_tactic_recompute_set_aside", "SET-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false);
			declareFunction("set_problem_recompute_thrown_away_wrt_all_relevant_strategies",
					"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
			declareFunction("set_problem_recompute_set_aside_wrt_all_relevant_strategies",
					"SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
			declareFunction("set_tactic_recompute_thrown_away_wrt_all_relevant_strategies",
					"SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
			declareFunction("set_tactic_recompute_set_aside_wrt_all_relevant_strategies",
					"SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
			declareFunction("set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies",
					"SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
			declareFunction("set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies",
					"SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
			declareFunction("set_problem_tactics_recompute_thrown_away", "SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY", 2,
					0, false);
			declareFunction("set_problem_tactics_recompute_set_aside", "SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE", 2, 0,
					false);
			declareFunction("cache_status_known_for_conditionsP", "CACHE-STATUS-KNOWN-FOR-CONDITIONS?", 3, 0, false);
			declareFunction("cache_status_for_conditions", "CACHE-STATUS-FOR-CONDITIONS", 2, 0, false);
			declareFunction("modify_cache_status_for_value_and_conditions",
					"MODIFY-CACHE-STATUS-FOR-VALUE-AND-CONDITIONS", 3, 0, false);
			declareFunction("any_conditions_implyP", "ANY-CONDITIONS-IMPLY?", 3, 0, false);
			declareFunction("conditions_implyP", "CONDITIONS-IMPLY?", 2, 1, false);
			declareFunction("conditions_booleanly_implyP", "CONDITIONS-BOOLEANLY-IMPLY?", 2, 0, false);
		}
		if (SubLFiles.USE_V2) {
			declareFunction("uninterestingness_cache_thrown_away_wrt_removal_code",
					"UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-REMOVAL-CODE", 1, 0, false);
			declareFunction("uninterestingness_cache_thrown_away_wrt_transformation_code",
					"UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-TRANSFORMATION-CODE", 1, 0, false);
			declareFunction("uninterestingness_cache_thrown_away_wrt_new_root_code",
					"UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-NEW-ROOT-CODE", 1, 0, false);
			declareFunction("uninterestingness_cache_set_aside_wrt_removal_code",
					"UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-REMOVAL-CODE", 1, 0, false);
			declareFunction("uninterestingness_cache_set_aside_wrt_transformation_code",
					"UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-TRANSFORMATION-CODE", 1, 0, false);
			declareFunction("uninterestingness_cache_set_aside_wrt_new_root_code",
					"UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-NEW-ROOT-CODE", 1, 0, false);
			declareFunction("uninterestingness_cache_thrown_away_code", "UNINTERESTINGNESS-CACHE-THROWN-AWAY-CODE", 1,
					0, false);
			declareFunction("uninterestingness_cache_set_aside_code", "UNINTERESTINGNESS-CACHE-SET-ASIDE-CODE", 1, 0,
					false);
			declareFunction("set_uninterestingness_cache_thrown_away_wrt_removal_code",
					"SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-REMOVAL-CODE", 2, 0, false);
			declareFunction("set_uninterestingness_cache_thrown_away_wrt_transformation_code",
					"SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-TRANSFORMATION-CODE", 2, 0, false);
			declareFunction("set_uninterestingness_cache_thrown_away_wrt_new_root_code",
					"SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-NEW-ROOT-CODE", 2, 0, false);
			declareFunction("set_uninterestingness_cache_set_aside_wrt_removal_code",
					"SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-REMOVAL-CODE", 2, 0, false);
			declareFunction("set_uninterestingness_cache_set_aside_wrt_transformation_code",
					"SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-TRANSFORMATION-CODE", 2, 0, false);
			declareFunction("set_uninterestingness_cache_set_aside_wrt_new_root_code",
					"SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-NEW-ROOT-CODE", 2, 0, false);
			declareFunction("set_uninterestingness_cache_thrown_away_code",
					"SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-CODE", 2, 0, false);
			declareFunction("set_uninterestingness_cache_set_aside_code", "SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-CODE",
					2, 0, false);
			declareFunction("decode_uninterestingness_cache_code", "DECODE-UNINTERESTINGNESS-CACHE-CODE", 1, 0, false);
			declareFunction("encode_uninterestingness_cache_status", "ENCODE-UNINTERESTINGNESS-CACHE-STATUS", 1, 0,
					false);
			declareFunction("prob_strategic_properties_flags", "PROB-STRATEGIC-PROPERTIES-FLAGS", 1, 0, false);
			declareFunction("_csetf_prob_strategic_properties_flags", "_CSETF-PROB-STRATEGIC-PROPERTIES-FLAGS", 2, 0,
					false);
			declareFunction("problem_strategic_flags", "PROBLEM-STRATEGIC-FLAGS", 2, 0, false);
			declareFunction("set_problem_strategic_flags", "SET-PROBLEM-STRATEGIC-FLAGS", 3, 0, false);
			declareFunction("problem_thrown_away_cache_status", "PROBLEM-THROWN-AWAY-CACHE-STATUS", 2, 0, false);
			declareFunction("problem_thrown_away_cache_removal_status", "PROBLEM-THROWN-AWAY-CACHE-REMOVAL-STATUS", 2,
					0, false);
			declareFunction("problem_thrown_away_cache_transformation_status",
					"PROBLEM-THROWN-AWAY-CACHE-TRANSFORMATION-STATUS", 2, 0, false);
			declareFunction("problem_thrown_away_cache_new_root_status", "PROBLEM-THROWN-AWAY-CACHE-NEW-ROOT-STATUS", 2,
					0, false);
			declareFunction("problem_set_aside_cache_removal_status", "PROBLEM-SET-ASIDE-CACHE-REMOVAL-STATUS", 2, 0,
					false);
			declareFunction("problem_set_aside_cache_status", "PROBLEM-SET-ASIDE-CACHE-STATUS", 2, 0, false);
			declareFunction("problem_set_aside_cache_transformation_status",
					"PROBLEM-SET-ASIDE-CACHE-TRANSFORMATION-STATUS", 2, 0, false);
			declareFunction("problem_set_aside_cache_new_root_status", "PROBLEM-SET-ASIDE-CACHE-NEW-ROOT-STATUS", 2, 0,
					false);
			declareFunction("set_problem_thrown_away", "SET-PROBLEM-THROWN-AWAY", 2, 0, false);
			declareFunction("set_problem_not_thrown_away", "SET-PROBLEM-NOT-THROWN-AWAY", 2, 0, false);
			declareFunction("set_problem_thrown_away_wrt_removal", "SET-PROBLEM-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
			declareFunction("set_problem_not_thrown_away_wrt_removal", "SET-PROBLEM-NOT-THROWN-AWAY-WRT-REMOVAL", 2, 0,
					false);
			declareFunction("set_problem_recompute_thrown_away_wrt_removal",
					"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
			declareFunction("set_problem_thrown_away_wrt_transformation", "SET-PROBLEM-THROWN-AWAY-WRT-TRANSFORMATION",
					2, 0, false);
			declareFunction("set_problem_not_thrown_away_wrt_transformation",
					"SET-PROBLEM-NOT-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
			declareFunction("set_problem_recompute_thrown_away_wrt_transformation",
					"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
			declareFunction("set_problem_thrown_away_wrt_new_root", "SET-PROBLEM-THROWN-AWAY-WRT-NEW-ROOT", 2, 0,
					false);
			declareFunction("set_problem_not_thrown_away_wrt_new_root", "SET-PROBLEM-NOT-THROWN-AWAY-WRT-NEW-ROOT", 2,
					0, false);
			declareFunction("set_problem_recompute_thrown_away_wrt_new_root",
					"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
			declareFunction("set_problem_set_aside", "SET-PROBLEM-SET-ASIDE", 2, 0, false);
			declareFunction("set_problem_not_set_aside", "SET-PROBLEM-NOT-SET-ASIDE", 2, 0, false);
			declareFunction("set_problem_set_aside_wrt_removal", "SET-PROBLEM-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
			declareFunction("set_problem_not_set_aside_wrt_removal", "SET-PROBLEM-NOT-SET-ASIDE-WRT-REMOVAL", 2, 0,
					false);
			declareFunction("set_problem_recompute_set_aside_wrt_removal",
					"SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
			declareFunction("set_problem_set_aside_wrt_transformation", "SET-PROBLEM-SET-ASIDE-WRT-TRANSFORMATION", 2,
					0, false);
			declareFunction("set_problem_not_set_aside_wrt_transformation",
					"SET-PROBLEM-NOT-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
			declareFunction("set_problem_recompute_set_aside_wrt_transformation",
					"SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
			declareFunction("set_problem_set_aside_wrt_new_root", "SET-PROBLEM-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
			declareFunction("set_problem_not_set_aside_wrt_new_root", "SET-PROBLEM-NOT-SET-ASIDE-WRT-NEW-ROOT", 2, 0,
					false);
			declareFunction("set_problem_recompute_set_aside_wrt_new_root",
					"SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
			declareFunction("set_problem_thrown_away_wrt", "SET-PROBLEM-THROWN-AWAY-WRT", 3, 0, false);
			declareFunction("set_problem_not_thrown_away_wrt", "SET-PROBLEM-NOT-THROWN-AWAY-WRT", 3, 0, false);
			declareFunction("set_problem_recompute_thrown_away_wrt", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT", 3, 0,
					false);
			declareFunction("set_problem_set_aside_wrt", "SET-PROBLEM-SET-ASIDE-WRT", 3, 0, false);
			declareFunction("set_problem_not_set_aside_wrt", "SET-PROBLEM-NOT-SET-ASIDE-WRT", 3, 0, false);
			declareFunction("set_problem_recompute_set_aside_wrt", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT", 3, 0, false);
			declareFunction("problem_thrown_away_cache_status_wrt_motivation",
					"PROBLEM-THROWN-AWAY-CACHE-STATUS-WRT-MOTIVATION", 3, 0, false);
			declareFunction("set_problem_recompute_thrown_away_wrt_all_motivations",
					"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-ALL-MOTIVATIONS", 2, 0, false);
			declareFunction("set_problem_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations",
					"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
			declareFunction("problem_set_aside_cache_status_wrt_motivation",
					"PROBLEM-SET-ASIDE-CACHE-STATUS-WRT-MOTIVATION", 3, 0, false);
			declareFunction("set_problem_recompute_set_aside_wrt_all_motivations",
					"SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-ALL-MOTIVATIONS", 2, 0, false);
			declareFunction("set_problem_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations",
					"SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
			declareFunction("tact_strategic_properties_flags", "TACT-STRATEGIC-PROPERTIES-FLAGS", 1, 0, false);
			declareFunction("_csetf_tact_strategic_properties_flags", "_CSETF-TACT-STRATEGIC-PROPERTIES-FLAGS", 2, 0,
					false);
			declareFunction("tactic_strategic_flags", "TACTIC-STRATEGIC-FLAGS", 2, 0, false);
			declareFunction("set_tactic_strategic_flags", "SET-TACTIC-STRATEGIC-FLAGS", 3, 0, false);
			declareFunction("tactic_thrown_away_cache_status", "TACTIC-THROWN-AWAY-CACHE-STATUS", 2, 0, false);
			declareFunction("tactic_thrown_away_cache_removal_status", "TACTIC-THROWN-AWAY-CACHE-REMOVAL-STATUS", 2, 0,
					false);
			declareFunction("tactic_thrown_away_cache_transformation_status",
					"TACTIC-THROWN-AWAY-CACHE-TRANSFORMATION-STATUS", 2, 0, false);
			declareFunction("tactic_thrown_away_cache_new_root_status", "TACTIC-THROWN-AWAY-CACHE-NEW-ROOT-STATUS", 2,
					0, false);
			declareFunction("tactic_set_aside_cache_status", "TACTIC-SET-ASIDE-CACHE-STATUS", 2, 0, false);
			declareFunction("tactic_set_aside_cache_removal_status", "TACTIC-SET-ASIDE-CACHE-REMOVAL-STATUS", 2, 0,
					false);
			declareFunction("tactic_set_aside_cache_transformation_status",
					"TACTIC-SET-ASIDE-CACHE-TRANSFORMATION-STATUS", 2, 0, false);
			declareFunction("tactic_set_aside_cache_new_root_status", "TACTIC-SET-ASIDE-CACHE-NEW-ROOT-STATUS", 2, 0,
					false);
			declareFunction("set_tactic_thrown_away", "SET-TACTIC-THROWN-AWAY", 2, 0, false);
			declareFunction("set_tactic_not_thrown_away", "SET-TACTIC-NOT-THROWN-AWAY", 2, 0, false);
			declareFunction("set_tactic_thrown_away_wrt_removal", "SET-TACTIC-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
			declareFunction("set_tactic_not_thrown_away_wrt_removal", "SET-TACTIC-NOT-THROWN-AWAY-WRT-REMOVAL", 2, 0,
					false);
			declareFunction("set_tactic_recompute_thrown_away_wrt_removal",
					"SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
			declareFunction("set_tactic_thrown_away_wrt_transformation", "SET-TACTIC-THROWN-AWAY-WRT-TRANSFORMATION", 2,
					0, false);
			declareFunction("set_tactic_not_thrown_away_wrt_transformation",
					"SET-TACTIC-NOT-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
			declareFunction("set_tactic_recompute_thrown_away_wrt_transformation",
					"SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
			declareFunction("set_tactic_thrown_away_wrt_new_root", "SET-TACTIC-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
			declareFunction("set_tactic_not_thrown_away_wrt_new_root", "SET-TACTIC-NOT-THROWN-AWAY-WRT-NEW-ROOT", 2, 0,
					false);
			declareFunction("set_tactic_recompute_thrown_away_wrt_new_root",
					"SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
			declareFunction("set_tactic_set_aside", "SET-TACTIC-SET-ASIDE", 2, 0, false);
			declareFunction("set_tactic_not_set_aside", "SET-TACTIC-NOT-SET-ASIDE", 2, 0, false);
			declareFunction("set_tactic_set_aside_wrt_removal", "SET-TACTIC-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
			declareFunction("set_tactic_not_set_aside_wrt_removal", "SET-TACTIC-NOT-SET-ASIDE-WRT-REMOVAL", 2, 0,
					false);
			declareFunction("set_tactic_recompute_set_aside_wrt_removal", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-REMOVAL",
					2, 0, false);
			declareFunction("set_tactic_set_aside_wrt_transformation", "SET-TACTIC-SET-ASIDE-WRT-TRANSFORMATION", 2, 0,
					false);
			declareFunction("set_tactic_not_set_aside_wrt_transformation",
					"SET-TACTIC-NOT-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
			declareFunction("set_tactic_recompute_set_aside_wrt_transformation",
					"SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
			declareFunction("set_tactic_set_aside_wrt_new_root", "SET-TACTIC-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
			declareFunction("set_tactic_not_set_aside_wrt_new_root", "SET-TACTIC-NOT-SET-ASIDE-WRT-NEW-ROOT", 2, 0,
					false);
			declareFunction("set_tactic_recompute_set_aside_wrt_new_root",
					"SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
			declareFunction("set_tactic_thrown_away_wrt", "SET-TACTIC-THROWN-AWAY-WRT", 3, 0, false);
			declareFunction("set_tactic_not_thrown_away_wrt", "SET-TACTIC-NOT-THROWN-AWAY-WRT", 3, 0, false);
			declareFunction("set_tactic_recompute_thrown_away_wrt", "SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT", 3, 0,
					false);
			declareFunction("set_tactic_set_aside_wrt", "SET-TACTIC-SET-ASIDE-WRT", 3, 0, false);
			declareFunction("set_tactic_not_set_aside_wrt", "SET-TACTIC-NOT-SET-ASIDE-WRT", 3, 0, false);
			declareFunction("set_tactic_recompute_set_aside_wrt", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT", 3, 0, false);
			declareFunction("tactic_thrown_away_cache_status_wrt_motivation",
					"TACTIC-THROWN-AWAY-CACHE-STATUS-WRT-MOTIVATION", 3, 0, false);
			declareFunction("set_tactic_recompute_thrown_away_wrt_all_motivations",
					"SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-ALL-MOTIVATIONS", 2, 0, false);
			declareFunction("set_problem_tactics_recompute_thrown_away_wrt_all_motivations",
					"SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY-WRT-ALL-MOTIVATIONS", 2, 0, false);
			declareFunction("set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations",
					"SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0,
					false);
			declareFunction("tactic_set_aside_cache_status_wrt_motivation",
					"TACTIC-SET-ASIDE-CACHE-STATUS-WRT-MOTIVATION", 3, 0, false);
			declareFunction("set_tactic_recompute_set_aside_wrt_all_motivations",
					"SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-ALL-MOTIVATIONS", 2, 0, false);
			declareFunction("set_tactic_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations",
					"SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
			declareFunction("set_problem_tactics_recompute_set_aside_wrt_all_motivations",
					"SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE-WRT-ALL-MOTIVATIONS", 2, 0, false);
			declareFunction("set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations",
					"SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0,
					false);
		}
		return NIL;
	}

	public static SubLObject declare_inference_datastructures_strategy_file_Previous() {
		declareFunction("strategy_print_function_trampoline", "STRATEGY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("strategy_p", "STRATEGY-P", 1, 0, false);
		new inference_datastructures_strategy.$strategy_p$UnaryFunction();
		declareFunction("strat_suid", "STRAT-SUID", 1, 0, false);
		declareFunction("strat_inference", "STRAT-INFERENCE", 1, 0, false);
		declareFunction("strat_result_uniqueness_criterion", "STRAT-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
		declareFunction("strat_active_problems", "STRAT-ACTIVE-PROBLEMS", 1, 0, false);
		declareFunction("strat_motivated_problems", "STRAT-MOTIVATED-PROBLEMS", 1, 0, false);
		declareFunction("strat_set_aside_problems", "STRAT-SET-ASIDE-PROBLEMS", 1, 0, false);
		declareFunction("strat_should_reconsider_set_asidesP", "STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
		declareFunction("strat_productivity_limit", "STRAT-PRODUCTIVITY-LIMIT", 1, 0, false);
		declareFunction("strat_removal_backtracking_productivity_limit",
				"STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
		declareFunction("strat_proof_spec", "STRAT-PROOF-SPEC", 1, 0, false);
		declareFunction("strat_problem_proof_spec_index", "STRAT-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
		declareFunction("strat_problem_strategic_index", "STRAT-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
		declareFunction("strat_memoization_state", "STRAT-MEMOIZATION-STATE", 1, 0, false);
		declareFunction("strat_step_count", "STRAT-STEP-COUNT", 1, 0, false);
		declareFunction("strat_type", "STRAT-TYPE", 1, 0, false);
		declareFunction("strat_data", "STRAT-DATA", 1, 0, false);
		declareFunction("_csetf_strat_suid", "_CSETF-STRAT-SUID", 2, 0, false);
		declareFunction("_csetf_strat_inference", "_CSETF-STRAT-INFERENCE", 2, 0, false);
		declareFunction("_csetf_strat_result_uniqueness_criterion", "_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION", 2, 0,
				false);
		declareFunction("_csetf_strat_active_problems", "_CSETF-STRAT-ACTIVE-PROBLEMS", 2, 0, false);
		declareFunction("_csetf_strat_motivated_problems", "_CSETF-STRAT-MOTIVATED-PROBLEMS", 2, 0, false);
		declareFunction("_csetf_strat_set_aside_problems", "_CSETF-STRAT-SET-ASIDE-PROBLEMS", 2, 0, false);
		declareFunction("_csetf_strat_should_reconsider_set_asidesP", "_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 2,
				0, false);
		declareFunction("_csetf_strat_productivity_limit", "_CSETF-STRAT-PRODUCTIVITY-LIMIT", 2, 0, false);
		declareFunction("_csetf_strat_removal_backtracking_productivity_limit",
				"_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
		declareFunction("_csetf_strat_proof_spec", "_CSETF-STRAT-PROOF-SPEC", 2, 0, false);
		declareFunction("_csetf_strat_problem_proof_spec_index", "_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX", 2, 0, false);
		declareFunction("_csetf_strat_problem_strategic_index", "_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX", 2, 0, false);
		declareFunction("_csetf_strat_memoization_state", "_CSETF-STRAT-MEMOIZATION-STATE", 2, 0, false);
		declareFunction("_csetf_strat_step_count", "_CSETF-STRAT-STEP-COUNT", 2, 0, false);
		declareFunction("_csetf_strat_type", "_CSETF-STRAT-TYPE", 2, 0, false);
		declareFunction("_csetf_strat_data", "_CSETF-STRAT-DATA", 2, 0, false);
		declareFunction("make_strategy", "MAKE-STRATEGY", 0, 1, false);
		declareFunction("visit_defstruct_strategy", "VISIT-DEFSTRUCT-STRATEGY", 2, 0, false);
		declareFunction("visit_defstruct_object_strategy_method", "VISIT-DEFSTRUCT-OBJECT-STRATEGY-METHOD", 2, 0,
				false);
		declareFunction("valid_strategy_p", "VALID-STRATEGY-P", 1, 0, false);
		declareFunction("strategy_invalid_p", "STRATEGY-INVALID-P", 1, 0, false);
		declareFunction("print_strategy", "PRINT-STRATEGY", 3, 0, false);
		declareFunction("sxhash_strategy_method", "SXHASH-STRATEGY-METHOD", 1, 0, false);
		new inference_datastructures_strategy.$sxhash_strategy_method$UnaryFunction();
		declareFunction("new_strategy", "NEW-STRATEGY", 2, 0, false);
		declareFunction("destroy_strategy", "DESTROY-STRATEGY", 1, 0, false);
		declareFunction("destroy_problem_store_strategy", "DESTROY-PROBLEM-STORE-STRATEGY", 1, 0, false);
		declareFunction("destroy_inference_strategy", "DESTROY-INFERENCE-STRATEGY", 1, 0, false);
		declareFunction("destroy_strategy_int", "DESTROY-STRATEGY-INT", 1, 0, false);
		declareFunction("note_strategy_invalid", "NOTE-STRATEGY-INVALID", 1, 0, false);
		declareFunction("remove_strategy_problem", "REMOVE-STRATEGY-PROBLEM", 2, 0, false);
		declareFunction("strategy_suid", "STRATEGY-SUID", 1, 0, false);
		declareFunction("strategy_inference", "STRATEGY-INFERENCE", 1, 0, false);
		declareFunction("strategy_local_result_uniqueness_criterion", "STRATEGY-LOCAL-RESULT-UNIQUENESS-CRITERION", 1,
				0, false);
		declareFunction("strategy_problem_strategic_index", "STRATEGY-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
		declareFunction("strategy_type", "STRATEGY-TYPE", 1, 0, false);
		declareFunction("strategy_data", "STRATEGY-DATA", 1, 0, false);
		declareFunction("strategy_active_problems", "STRATEGY-ACTIVE-PROBLEMS", 1, 0, false);
		declareFunction("strategy_motivated_problems", "STRATEGY-MOTIVATED-PROBLEMS", 1, 0, false);
		declareFunction("strategy_set_aside_problems", "STRATEGY-SET-ASIDE-PROBLEMS", 1, 0, false);
		declareFunction("strategy_should_reconsider_set_asidesP", "STRATEGY-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0,
				false);
		declareFunction("strategy_productivity_limit", "STRATEGY-PRODUCTIVITY-LIMIT", 1, 0, false);
		declareFunction("strategy_removal_backtracking_productivity_limit",
				"STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
		declareFunction("strategy_proof_spec", "STRATEGY-PROOF-SPEC", 1, 0, false);
		declareFunction("strategy_problem_proof_spec_index", "STRATEGY-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
		declareFunction("strategy_step_count", "STRATEGY-STEP-COUNT", 1, 0, false);
		declareFunction("set_strategy_result_uniqueness_criterion", "SET-STRATEGY-RESULT-UNIQUENESS-CRITERION", 2, 0,
				false);
		declareFunction("set_strategy_productivity_limit", "SET-STRATEGY-PRODUCTIVITY-LIMIT", 2, 0, false);
		declareFunction("set_strategy_removal_backtracking_productivity_limit",
				"SET-STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
		declareFunction("set_strategy_proof_spec", "SET-STRATEGY-PROOF-SPEC", 2, 0, false);
		declareFunction("set_strategy_data", "SET-STRATEGY-DATA", 2, 0, false);
		declareMacro("do_strategy_active_problems", "DO-STRATEGY-ACTIVE-PROBLEMS");
		declareMacro("do_strategy_motivated_problems", "DO-STRATEGY-MOTIVATED-PROBLEMS");
		declareMacro("do_strategy_set_aside_problems", "DO-STRATEGY-SET-ASIDE-PROBLEMS");
		declareMacro("with_strategy_memoization_state", "WITH-STRATEGY-MEMOIZATION-STATE");
		declareFunction("strategy_memoization_state", "STRATEGY-MEMOIZATION-STATE", 1, 0, false);
		declareFunction("current_strategy_wrt_memoization", "CURRENT-STRATEGY-WRT-MEMOIZATION", 0, 0, false);
		declareFunction("strategic_context_inference", "STRATEGIC-CONTEXT-INFERENCE", 1, 0, false);
		declareFunction("strategy_answer_link", "STRATEGY-ANSWER-LINK", 1, 0, false);
		declareFunction("strategy_answer_link_propagatedP", "STRATEGY-ANSWER-LINK-PROPAGATED?", 1, 0, false);
		declareFunction("strategy_should_propagate_answer_linkP", "STRATEGY-SHOULD-PROPAGATE-ANSWER-LINK?", 1, 0,
				false);
		declareFunction("strategy_root_problem", "STRATEGY-ROOT-PROBLEM", 1, 0, false);
		declareFunction("strategy_continuableP", "STRATEGY-CONTINUABLE?", 1, 0, false);
		declareFunction("problem_active_in_strategyP", "PROBLEM-ACTIVE-IN-STRATEGY?", 2, 0, false);
		declareFunction("problem_motivatedP", "PROBLEM-MOTIVATED?", 2, 0, false);
		declareFunction("problem_set_aside_in_strategyP", "PROBLEM-SET-ASIDE-IN-STRATEGY?", 2, 0, false);
		declareFunction("strategy_has_some_set_aside_problemsP", "STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?", 1, 0, false);
		declareFunction("strategy_all_valid_set_aside_problems", "STRATEGY-ALL-VALID-SET-ASIDE-PROBLEMS", 1, 0, false);
		declareFunction("strategy_problem_store", "STRATEGY-PROBLEM-STORE", 1, 0, false);
		declareFunction("strategy_result_uniqueness_criterion", "STRATEGY-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
		declareFunction("strategy_unique_wrt_proofsP", "STRATEGY-UNIQUE-WRT-PROOFS?", 1, 0, false);
		declareFunction("strategy_unique_wrt_bindingsP", "STRATEGY-UNIQUE-WRT-BINDINGS?", 1, 0, false);
		declareFunction("strategy_wants_one_answerP", "STRATEGY-WANTS-ONE-ANSWER?", 1, 0, false);
		declareFunction("strategy_active_problem_count", "STRATEGY-ACTIVE-PROBLEM-COUNT", 1, 0, false);
		declareFunction("strategy_motivated_problem_count", "STRATEGY-MOTIVATED-PROBLEM-COUNT", 1, 0, false);
		declareFunction("strategy_set_aside_problem_count", "STRATEGY-SET-ASIDE-PROBLEM-COUNT", 1, 0, false);
		declareFunction("strategy_problem_proof_spec", "STRATEGY-PROBLEM-PROOF-SPEC", 2, 0, false);
		declareFunction("set_strategy_property", "SET-STRATEGY-PROPERTY", 3, 0, false);
		declareFunction("copy_strategy_properties", "COPY-STRATEGY-PROPERTIES", 2, 0, false);
		declareFunction("set_strategy_properties", "SET-STRATEGY-PROPERTIES", 2, 0, false);
		declareFunction("strategy_note_problem_active", "STRATEGY-NOTE-PROBLEM-ACTIVE", 2, 0, false);
		declareFunction("strategy_note_problem_inactive", "STRATEGY-NOTE-PROBLEM-INACTIVE", 2, 0, false);
		declareFunction("strategy_note_problem_motivated", "STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
		declareFunction("strategy_note_problem_unmotivated", "STRATEGY-NOTE-PROBLEM-UNMOTIVATED", 2, 0, false);
		declareFunction("strategy_note_problem_set_aside", "STRATEGY-NOTE-PROBLEM-SET-ASIDE", 2, 0, false);
		declareFunction("strategy_clear_problem_set_aside", "STRATEGY-CLEAR-PROBLEM-SET-ASIDE", 2, 0, false);
		declareFunction("strategy_clear_set_asides", "STRATEGY-CLEAR-SET-ASIDES", 1, 0, false);
		declareFunction("note_strategy_should_reconsider_set_asides", "NOTE-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1,
				0, false);
		declareFunction("clear_strategy_should_reconsider_set_asides", "CLEAR-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1,
				0, false);
		declareMacro("with_strategically_active_problem", "WITH-STRATEGICALLY-ACTIVE-PROBLEM");
		declareFunction("strategy_note_problem_proof_spec", "STRATEGY-NOTE-PROBLEM-PROOF-SPEC", 3, 0, false);
		declareFunction("increment_strategy_step_count", "INCREMENT-STRATEGY-STEP-COUNT", 1, 0, false);
		declareFunction("strategy_dispatch", "STRATEGY-DISPATCH", 2, 5, false);
		declareFunction("strategy_dispatch_handler", "STRATEGY-DISPATCH-HANDLER", 2, 0, false);
		declareFunction("strategy_dispatch_funcall_0", "STRATEGY-DISPATCH-FUNCALL-0", 2, 0, false);
		declareFunction("strategy_dispatch_funcall_1", "STRATEGY-DISPATCH-FUNCALL-1", 3, 0, false);
		declareFunction("strategy_dispatch_funcall_2", "STRATEGY-DISPATCH-FUNCALL-2", 4, 0, false);
		declareFunction("strategy_dispatch_funcall_3", "STRATEGY-DISPATCH-FUNCALL-3", 5, 0, false);
		declareFunction("strategy_dispatch_funcall_4", "STRATEGY-DISPATCH-FUNCALL-4", 6, 0, false);
		declareFunction("strategy_dispatch_funcall_5", "STRATEGY-DISPATCH-FUNCALL-5", 7, 0, false);
		declareFunction("strategy_dispatch_unexpected_strategy_type_error",
				"STRATEGY-DISPATCH-UNEXPECTED-STRATEGY-TYPE-ERROR", 1, 0, false);
		declareFunction("controlling_strategy_callback", "CONTROLLING-STRATEGY-CALLBACK", 2, 4, false);
		declareFunction("strategy_type_p", "STRATEGY-TYPE-P", 1, 0, false);
		declareFunction("new_strategy_type", "NEW-STRATEGY-TYPE", 2, 0, false);
		declareFunction("deregister_strategy_type", "DEREGISTER-STRATEGY-TYPE", 1, 0, false);
		declareFunction("clear_strategy_type_store", "CLEAR-STRATEGY-TYPE-STORE", 0, 0, false);
		declareFunction("strategy_type_property", "STRATEGY-TYPE-PROPERTY", 2, 0, false);
		declareFunction("set_strategy_type_property", "SET-STRATEGY-TYPE-PROPERTY", 3, 0, false);
		declareFunction("default_uninterestingness_cache_value", "DEFAULT-UNINTERESTINGNESS-CACHE-VALUE", 0, 0, false);
		declareFunction("problem_strategic_properties_print_function_trampoline",
				"PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("problem_strategic_properties_p", "PROBLEM-STRATEGIC-PROPERTIES-P", 1, 0, false);
		new inference_datastructures_strategy.$problem_strategic_properties_p$UnaryFunction();
		declareFunction("prob_strategic_properties_status", "PROB-STRATEGIC-PROPERTIES-STATUS", 1, 0, false);
		declareFunction("prob_strategic_properties_tactic_strategic_property_index",
				"PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 1, 0, false);
		declareFunction("prob_strategic_properties_possible_tactic_count",
				"PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 1, 0, false);
		declareFunction("prob_strategic_properties_uninterestingness", "PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 1,
				0, false);
		declareFunction("_csetf_prob_strategic_properties_status", "_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS", 2, 0,
				false);
		declareFunction("_csetf_prob_strategic_properties_tactic_strategic_property_index",
				"_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
		declareFunction("_csetf_prob_strategic_properties_possible_tactic_count",
				"_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 2, 0, false);
		declareFunction("_csetf_prob_strategic_properties_uninterestingness",
				"_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 2, 0, false);
		declareFunction("make_problem_strategic_properties", "MAKE-PROBLEM-STRATEGIC-PROPERTIES", 0, 1, false);
		declareFunction("visit_defstruct_problem_strategic_properties", "VISIT-DEFSTRUCT-PROBLEM-STRATEGIC-PROPERTIES",
				2, 0, false);
		declareFunction("visit_defstruct_object_problem_strategic_properties_method",
				"VISIT-DEFSTRUCT-OBJECT-PROBLEM-STRATEGIC-PROPERTIES-METHOD", 2, 0, false);
		declareFunction("new_problem_strategic_properties", "NEW-PROBLEM-STRATEGIC-PROPERTIES", 0, 0, false);
		declareFunction("problem_strategic_properties_int", "PROBLEM-STRATEGIC-PROPERTIES-INT", 2, 0, false);
		declareFunction("set_problem_strategic_properties", "SET-PROBLEM-STRATEGIC-PROPERTIES", 3, 0, false);
		declareFunction("remove_problem_strategic_properties", "REMOVE-PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
		declareFunction("problem_strategic_properties", "PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
		declareFunction("problem_strategic_properties_tactic_strategic_property_index",
				"PROBLEM-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
		declareFunction("problem_dwimmed_strategic_status", "PROBLEM-DWIMMED-STRATEGIC-STATUS", 2, 0, false);
		declareFunction("problem_raw_strategic_status", "PROBLEM-RAW-STRATEGIC-STATUS", 2, 0, false);
		declareFunction("problem_weak_strategic_status", "PROBLEM-WEAK-STRATEGIC-STATUS", 2, 0, false);
		declareFunction("problem_strategic_status", "PROBLEM-STRATEGIC-STATUS", 2, 0, false);
		declareFunction("problem_strategic_provability_status", "PROBLEM-STRATEGIC-PROVABILITY-STATUS", 2, 0, false);
		declareFunction("problem_tactical_or_strategic_status", "PROBLEM-TACTICAL-OR-STRATEGIC-STATUS", 2, 0, false);
		declareFunction("problem_provability_status", "PROBLEM-PROVABILITY-STATUS", 2, 0, false);
		declareFunction("set_problem_raw_strategic_status", "SET-PROBLEM-RAW-STRATEGIC-STATUS", 3, 0, false);
		declareFunction("strategically_unexamined_problem_p", "STRATEGICALLY-UNEXAMINED-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_examined_problem_p", "STRATEGICALLY-EXAMINED-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_possible_problem_p", "STRATEGICALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_pending_problem_p", "STRATEGICALLY-PENDING-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_finished_problem_p", "STRATEGICALLY-FINISHED-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_no_good_problem_p", "STRATEGICALLY-NO-GOOD-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_neutral_problem_p", "STRATEGICALLY-NEUTRAL-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_good_problem_p", "STRATEGICALLY-GOOD-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_potentially_possible_problem_p", "STRATEGICALLY-POTENTIALLY-POSSIBLE-PROBLEM-P",
				2, 0, false);
		declareFunction("strategically_not_potentially_possible_problem_p",
				"STRATEGICALLY-NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
		declareFunction("strategically_totally_no_good_problem_p", "STRATEGICALLY-TOTALLY-NO-GOOD-PROBLEM-P", 2, 0,
				false);
		declareFunction("problem_strategic_uninterestingness", "PROBLEM-STRATEGIC-UNINTERESTINGNESS", 2, 0, false);
		declareFunction("set_problem_strategic_uninterestingness", "SET-PROBLEM-STRATEGIC-UNINTERESTINGNESS", 3, 0,
				false);
		declareFunction("set_just_problem_thrown_away", "SET-JUST-PROBLEM-THROWN-AWAY", 3, 0, false);
		declareFunction("set_just_problem_not_thrown_away", "SET-JUST-PROBLEM-NOT-THROWN-AWAY", 3, 0, false);
		declareFunction("set_just_problem_recompute_thrown_away", "SET-JUST-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0,
				false);
		declareFunction("set_just_problem_set_aside", "SET-JUST-PROBLEM-SET-ASIDE", 3, 0, false);
		declareFunction("set_just_problem_not_set_aside", "SET-JUST-PROBLEM-NOT-SET-ASIDE", 3, 0, false);
		declareFunction("set_just_problem_recompute_set_aside", "SET-JUST-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0, false);
		declareFunction("problem_thrown_away_cache_status", "PROBLEM-THROWN-AWAY-CACHE-STATUS", 2, 1, false);
		declareFunction("problem_set_aside_cache_status", "PROBLEM-SET-ASIDE-CACHE-STATUS", 2, 1, false);
		declareFunction("set_problem_thrown_away", "SET-PROBLEM-THROWN-AWAY", 2, 1, false);
		declareFunction("set_problem_not_thrown_away", "SET-PROBLEM-NOT-THROWN-AWAY", 2, 1, false);
		declareFunction("set_problem_set_aside", "SET-PROBLEM-SET-ASIDE", 2, 1, false);
		declareFunction("set_problem_not_set_aside", "SET-PROBLEM-NOT-SET-ASIDE", 2, 1, false);
		declareFunction("set_problem_recompute_thrown_away", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0, false);
		declareFunction("set_problem_recompute_set_aside", "SET-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0, false);
		declareFunction("tactic_strategic_properties_print_function_trampoline",
				"TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("tactic_strategic_properties_p", "TACTIC-STRATEGIC-PROPERTIES-P", 1, 0, false);
		new inference_datastructures_strategy.$tactic_strategic_properties_p$UnaryFunction();
		declareFunction("tact_strategic_properties_preference_level", "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 1,
				0, false);
		declareFunction("tact_strategic_properties_preference_level_justification",
				"TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
		declareFunction("tact_strategic_properties_productivity", "TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 1, 0,
				false);
		declareFunction("tact_strategic_properties_uninterestingness", "TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 1,
				0, false);
		declareFunction("_csetf_tact_strategic_properties_preference_level",
				"_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 2, 0, false);
		declareFunction("_csetf_tact_strategic_properties_preference_level_justification",
				"_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
		declareFunction("_csetf_tact_strategic_properties_productivity",
				"_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 2, 0, false);
		declareFunction("_csetf_tact_strategic_properties_uninterestingness",
				"_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 2, 0, false);
		declareFunction("make_tactic_strategic_properties", "MAKE-TACTIC-STRATEGIC-PROPERTIES", 0, 1, false);
		declareFunction("visit_defstruct_tactic_strategic_properties", "VISIT-DEFSTRUCT-TACTIC-STRATEGIC-PROPERTIES", 2,
				0, false);
		declareFunction("visit_defstruct_object_tactic_strategic_properties_method",
				"VISIT-DEFSTRUCT-OBJECT-TACTIC-STRATEGIC-PROPERTIES-METHOD", 2, 0, false);
		declareFunction("new_tactic_strategic_properties", "NEW-TACTIC-STRATEGIC-PROPERTIES", 0, 0, false);
		declareFunction("tactic_strategic_properties_int", "TACTIC-STRATEGIC-PROPERTIES-INT", 2, 0, false);
		declareFunction("set_tactic_strategic_properties", "SET-TACTIC-STRATEGIC-PROPERTIES", 3, 0, false);
		declareFunction("tactic_strategic_properties", "TACTIC-STRATEGIC-PROPERTIES", 2, 0, false);
		declareFunction("tactic_strategic_completeness", "TACTIC-STRATEGIC-COMPLETENESS", 2, 0, false);
		declareFunction("tactic_strategic_preference_level", "TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
		declareFunction("tactic_strategic_preference_level_justification",
				"TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
		declareFunction("tactic_strategic_dwimmed_completeness", "TACTIC-STRATEGIC-DWIMMED-COMPLETENESS", 2, 0, false);
		declareFunction("conjunctive_tactic_strategic_preference_level",
				"CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
		declareFunction("conjunctive_tactic_strategic_preference_level_justification",
				"CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
		declareFunction("tactic_strategic_productivity", "TACTIC-STRATEGIC-PRODUCTIVITY", 2, 0, false);
		declareFunction("tactic_strategically_preferredP", "TACTIC-STRATEGICALLY-PREFERRED?", 2, 0, false);
		declareFunction("set_tactic_strategic_preference_level", "SET-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 4, 0, false);
		declareFunction("set_tactic_strategic_productivity", "SET-TACTIC-STRATEGIC-PRODUCTIVITY", 3, 0, false);
		declareFunction("problem_strategically_possible_tactic_count", "PROBLEM-STRATEGICALLY-POSSIBLE-TACTIC-COUNT", 2,
				0, false);
		declareFunction("problem_note_tactic_strategically_possible", "PROBLEM-NOTE-TACTIC-STRATEGICALLY-POSSIBLE", 3,
				0, false);
		declareFunction("problem_note_tactic_not_strategically_possible",
				"PROBLEM-NOTE-TACTIC-NOT-STRATEGICALLY-POSSIBLE", 3, 0, false);
		declareFunction("problem_note_all_tactics_not_strategically_possible",
				"PROBLEM-NOTE-ALL-TACTICS-NOT-STRATEGICALLY-POSSIBLE", 2, 0, false);
		declareFunction("tactic_strategic_uninterestingness", "TACTIC-STRATEGIC-UNINTERESTINGNESS", 2, 0, false);
		declareFunction("set_tactic_strategic_uninterestingness", "SET-TACTIC-STRATEGIC-UNINTERESTINGNESS", 3, 0,
				false);
		declareFunction("thrown_away_cache_status_from_uninterestingness",
				"THROWN-AWAY-CACHE-STATUS-FROM-UNINTERESTINGNESS", 2, 0, false);
		declareFunction("set_aside_cache_status_from_uninterestingness",
				"SET-ASIDE-CACHE-STATUS-FROM-UNINTERESTINGNESS", 2, 0, false);
		declareFunction("note_uninterestingness_cache_thrown_away_value",
				"NOTE-UNINTERESTINGNESS-CACHE-THROWN-AWAY-VALUE", 3, 0, false);
		declareFunction("note_uninterestingness_cache_set_aside_value", "NOTE-UNINTERESTINGNESS-CACHE-SET-ASIDE-VALUE",
				3, 0, false);
		declareFunction("uninterestingness_cache_value_p", "UNINTERESTINGNESS-CACHE-VALUE-P", 1, 0, false);
		declareFunction("uninterestingness_cache_conditions_p", "UNINTERESTINGNESS-CACHE-CONDITIONS-P", 1, 0, false);
		declareFunction("uninterestingness_cache_conditions_list_p", "UNINTERESTINGNESS-CACHE-CONDITIONS-LIST-P", 1, 0,
				false);
		declareFunction("thrown_away_cache_value_p", "THROWN-AWAY-CACHE-VALUE-P", 1, 0, false);
		declareFunction("set_aside_cache_value_p", "SET-ASIDE-CACHE-VALUE-P", 1, 0, false);
		declareFunction("ignore_cache_value_p", "IGNORE-CACHE-VALUE-P", 1, 0, false);
		declareFunction("set_just_tactic_thrown_away", "SET-JUST-TACTIC-THROWN-AWAY", 3, 0, false);
		declareFunction("set_just_tactic_not_thrown_away", "SET-JUST-TACTIC-NOT-THROWN-AWAY", 3, 0, false);
		declareFunction("set_just_tactic_recompute_thrown_away", "SET-JUST-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0, false);
		declareFunction("set_just_tactic_set_aside", "SET-JUST-TACTIC-SET-ASIDE", 3, 0, false);
		declareFunction("set_just_tactic_not_set_aside", "SET-JUST-TACTIC-NOT-SET-ASIDE", 3, 0, false);
		declareFunction("set_just_tactic_recompute_set_aside", "SET-JUST-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false);
		declareFunction("tactic_thrown_away_cache_status", "TACTIC-THROWN-AWAY-CACHE-STATUS", 2, 1, false);
		declareFunction("tactic_set_aside_cache_status", "TACTIC-SET-ASIDE-CACHE-STATUS", 2, 1, false);
		declareFunction("set_tactic_thrown_away", "SET-TACTIC-THROWN-AWAY", 2, 1, false);
		declareFunction("set_tactic_not_thrown_away", "SET-TACTIC-NOT-THROWN-AWAY", 2, 1, false);
		declareFunction("set_tactic_recompute_thrown_away", "SET-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0, false);
		declareFunction("set_tactic_set_aside", "SET-TACTIC-SET-ASIDE", 2, 1, false);
		declareFunction("set_tactic_not_set_aside", "SET-TACTIC-NOT-SET-ASIDE", 2, 1, false);
		declareFunction("set_tactic_recompute_set_aside", "SET-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false);
		declareFunction("set_problem_recompute_thrown_away_wrt_all_relevant_strategies",
				"SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
		declareFunction("set_problem_recompute_set_aside_wrt_all_relevant_strategies",
				"SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
		declareFunction("set_tactic_recompute_thrown_away_wrt_all_relevant_strategies",
				"SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
		declareFunction("set_tactic_recompute_set_aside_wrt_all_relevant_strategies",
				"SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
		declareFunction("set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies",
				"SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
		declareFunction("set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies",
				"SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
		declareFunction("set_problem_tactics_recompute_thrown_away", "SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY", 2, 0,
				false);
		declareFunction("set_problem_tactics_recompute_set_aside", "SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE", 2, 0,
				false);
		declareFunction("cache_status_known_for_conditionsP", "CACHE-STATUS-KNOWN-FOR-CONDITIONS?", 3, 0, false);
		declareFunction("cache_status_for_conditions", "CACHE-STATUS-FOR-CONDITIONS", 2, 0, false);
		declareFunction("modify_cache_status_for_value_and_conditions", "MODIFY-CACHE-STATUS-FOR-VALUE-AND-CONDITIONS",
				3, 0, false);
		declareFunction("any_conditions_implyP", "ANY-CONDITIONS-IMPLY?", 3, 0, false);
		declareFunction("conditions_implyP", "CONDITIONS-IMPLY?", 2, 1, false);
		declareFunction("conditions_booleanly_implyP", "CONDITIONS-BOOLEANLY-IMPLY?", 2, 0, false);
		return NIL;
	}

	static private final SubLList $list_alt2 = list(new SubLObject[] { makeSymbol("SUID"), makeSymbol("INFERENCE"),
			makeSymbol("RESULT-UNIQUENESS-CRITERION"), makeSymbol("ACTIVE-PROBLEMS"), makeSymbol("MOTIVATED-PROBLEMS"),
			makeSymbol("SET-ASIDE-PROBLEMS"), makeSymbol("SHOULD-RECONSIDER-SET-ASIDES?"),
			makeSymbol("PRODUCTIVITY-LIMIT"), makeSymbol("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"),
			makeSymbol("PROOF-SPEC"), makeSymbol("PROBLEM-PROOF-SPEC-INDEX"), makeSymbol("PROBLEM-STRATEGIC-INDEX"),
			makeSymbol("MEMOIZATION-STATE"), makeSymbol("TYPE"), makeSymbol("DATA") });

	static private final SubLList $list_alt3 = list(
			new SubLObject[] { $SUID, makeKeyword("INFERENCE"), makeKeyword("RESULT-UNIQUENESS-CRITERION"),
					makeKeyword("ACTIVE-PROBLEMS"), makeKeyword("MOTIVATED-PROBLEMS"),
					makeKeyword("SET-ASIDE-PROBLEMS"), makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?"),
					makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"),
					makeKeyword("PROOF-SPEC"), makeKeyword("PROBLEM-PROOF-SPEC-INDEX"),
					makeKeyword("PROBLEM-STRATEGIC-INDEX"), makeKeyword("MEMOIZATION-STATE"), $TYPE, $DATA });

	static private final SubLList $list_alt4 = list(
			new SubLObject[] { makeSymbol("STRAT-SUID"), makeSymbol("STRAT-INFERENCE"),
					makeSymbol("STRAT-RESULT-UNIQUENESS-CRITERION"), makeSymbol("STRAT-ACTIVE-PROBLEMS"),
					makeSymbol("STRAT-MOTIVATED-PROBLEMS"), makeSymbol("STRAT-SET-ASIDE-PROBLEMS"),
					makeSymbol("STRAT-SHOULD-RECONSIDER-SET-ASIDES?"), makeSymbol("STRAT-PRODUCTIVITY-LIMIT"),
					makeSymbol("STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeSymbol("STRAT-PROOF-SPEC"),
					makeSymbol("STRAT-PROBLEM-PROOF-SPEC-INDEX"), makeSymbol("STRAT-PROBLEM-STRATEGIC-INDEX"),
					makeSymbol("STRAT-MEMOIZATION-STATE"), makeSymbol("STRAT-TYPE"), makeSymbol("STRAT-DATA") });

	static private final SubLList $list_alt5 = list(new SubLObject[] { makeSymbol("_CSETF-STRAT-SUID"),
			makeSymbol("_CSETF-STRAT-INFERENCE"), makeSymbol("_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION"),
			makeSymbol("_CSETF-STRAT-ACTIVE-PROBLEMS"), makeSymbol("_CSETF-STRAT-MOTIVATED-PROBLEMS"),
			makeSymbol("_CSETF-STRAT-SET-ASIDE-PROBLEMS"), makeSymbol("_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?"),
			makeSymbol("_CSETF-STRAT-PRODUCTIVITY-LIMIT"),
			makeSymbol("_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeSymbol("_CSETF-STRAT-PROOF-SPEC"),
			makeSymbol("_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX"), makeSymbol("_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX"),
			makeSymbol("_CSETF-STRAT-MEMOIZATION-STATE"), makeSymbol("_CSETF-STRAT-TYPE"),
			makeSymbol("_CSETF-STRAT-DATA") });

	static private final SubLSymbol $sym20$STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = makeSymbol(
			"STRAT-SHOULD-RECONSIDER-SET-ASIDES?");

	static private final SubLSymbol $sym21$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = makeSymbol(
			"_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?");

	public static final SubLSymbol $kw44$SHOULD_RECONSIDER_SET_ASIDES_ = makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?");

	static private final SubLString $str_alt53$Invalid_slot__S_for_construction_ = makeString(
			"Invalid slot ~S for construction function");

	static private final SubLString $str_alt55$_Invalid_STRATEGY__s_ = makeString("<Invalid STRATEGY ~s>");

	static private final SubLString $str_alt56$__a_STRATEGY__a__a_for_inference_ = makeString(
			"<~a STRATEGY ~a.~a for inference ~a.~a>");

	public static SubLObject init_inference_datastructures_strategy_file_alt() {
		defconstant("*DTP-STRATEGY*", STRATEGY);
		defparameter("*CURRENT-STRATEGY-WRT-MEMOIZATION*", NIL);
		deflexical("*STRATEGY-TYPE-STORE*",
				NIL != boundp($strategy_type_store$) ? ((SubLObject) ($strategy_type_store$.getGlobalValue()))
						: dictionary.new_dictionary(symbol_function(EQ), FIVE_INTEGER));
		defparameter("*UNINTERESTINGNESS-CACHE-LOOKUP-ENABLED?*", T);
		defconstant("*DEFAULT-UNINTERESTINGNESS-FLAGS*", ZERO_INTEGER);
		defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-REMOVAL-BYTE*",
				bytes.sublisp_byte(TWO_INTEGER, ZERO_INTEGER));
		defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-TRANSFORMATION-BYTE*",
				bytes.sublisp_byte(TWO_INTEGER, TWO_INTEGER));
		defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-NEW-ROOT-BYTE*",
				bytes.sublisp_byte(TWO_INTEGER, FOUR_INTEGER));
		defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-REMOVAL-BYTE*",
				bytes.sublisp_byte(TWO_INTEGER, SIX_INTEGER));
		defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-TRANSFORMATION-BYTE*",
				bytes.sublisp_byte(TWO_INTEGER, EIGHT_INTEGER));
		defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-NEW-ROOT-BYTE*",
				bytes.sublisp_byte(TWO_INTEGER, TEN_INTEGER));
		defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-BYTE*", bytes.sublisp_byte(TWO_INTEGER, TWELVE_INTEGER));
		defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-BYTE*", bytes.sublisp_byte(TWO_INTEGER, FOURTEEN_INTEGER));
		defconstant("*DTP-PROBLEM-STRATEGIC-PROPERTIES*", PROBLEM_STRATEGIC_PROPERTIES);
		defconstant("*DTP-TACTIC-STRATEGIC-PROPERTIES*", TACTIC_STRATEGIC_PROPERTIES);
		return NIL;
	}

	public static SubLObject init_inference_datastructures_strategy_file() {
		if (SubLFiles.USE_V1) {
			defconstant("*DTP-STRATEGY*", STRATEGY);
			defparameter("*CURRENT-STRATEGY-WRT-MEMOIZATION*", NIL);
			deflexical("*STRATEGY-TYPE-STORE*", SubLTrampolineFile.maybeDefault($strategy_type_store$,
					$strategy_type_store$, () -> dictionary.new_dictionary(symbol_function(EQ), FIVE_INTEGER)));
			defparameter("*UNINTERESTINGNESS-CACHE-LOOKUP-ENABLED?*", T);
			defconstant("*DTP-PROBLEM-STRATEGIC-PROPERTIES*", PROBLEM_STRATEGIC_PROPERTIES);
			defconstant("*DTP-TACTIC-STRATEGIC-PROPERTIES*", TACTIC_STRATEGIC_PROPERTIES);
			deflexical("*DEFAULT-UNINTERESTINGNESS-CACHE-VALUE*", list(NIL, NIL));
		}
		if (SubLFiles.USE_V2) {
			deflexical("*STRATEGY-TYPE-STORE*",
					NIL != boundp($strategy_type_store$) ? ((SubLObject) ($strategy_type_store$.getGlobalValue()))
							: dictionary.new_dictionary(symbol_function(EQ), FIVE_INTEGER));
			defconstant("*DEFAULT-UNINTERESTINGNESS-FLAGS*", ZERO_INTEGER);
			defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-REMOVAL-BYTE*",
					bytes.sublisp_byte(TWO_INTEGER, ZERO_INTEGER));
			defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-TRANSFORMATION-BYTE*",
					bytes.sublisp_byte(TWO_INTEGER, TWO_INTEGER));
			defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-NEW-ROOT-BYTE*",
					bytes.sublisp_byte(TWO_INTEGER, FOUR_INTEGER));
			defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-REMOVAL-BYTE*",
					bytes.sublisp_byte(TWO_INTEGER, SIX_INTEGER));
			defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-TRANSFORMATION-BYTE*",
					bytes.sublisp_byte(TWO_INTEGER, EIGHT_INTEGER));
			defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-NEW-ROOT-BYTE*",
					bytes.sublisp_byte(TWO_INTEGER, TEN_INTEGER));
			defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-BYTE*", bytes.sublisp_byte(TWO_INTEGER, TWELVE_INTEGER));
			defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-BYTE*", bytes.sublisp_byte(TWO_INTEGER, FOURTEEN_INTEGER));
		}
		return NIL;
	}

	public static SubLObject init_inference_datastructures_strategy_file_Previous() {
		defconstant("*DTP-STRATEGY*", STRATEGY);
		defparameter("*CURRENT-STRATEGY-WRT-MEMOIZATION*", NIL);
		deflexical("*STRATEGY-TYPE-STORE*", SubLTrampolineFile.maybeDefault($strategy_type_store$,
				$strategy_type_store$, () -> dictionary.new_dictionary(symbol_function(EQ), FIVE_INTEGER)));
		defparameter("*UNINTERESTINGNESS-CACHE-LOOKUP-ENABLED?*", T);
		defconstant("*DTP-PROBLEM-STRATEGIC-PROPERTIES*", PROBLEM_STRATEGIC_PROPERTIES);
		defconstant("*DTP-TACTIC-STRATEGIC-PROPERTIES*", TACTIC_STRATEGIC_PROPERTIES);
		deflexical("*DEFAULT-UNINTERESTINGNESS-CACHE-VALUE*", list(NIL, NIL));
		return NIL;
	}

	static private final SubLList $list_alt70 = list(
			list(makeSymbol("PROBLEM-VAR"), makeSymbol("STRATEGY"), makeSymbol("&KEY"), makeSymbol("DONE")),
			makeSymbol("&BODY"), makeSymbol("BODY"));

	public static SubLObject setup_inference_datastructures_strategy_file_alt() {
		register_method($print_object_method_table$.getGlobalValue(), $dtp_strategy$.getGlobalValue(),
				symbol_function(STRATEGY_PRINT_FUNCTION_TRAMPOLINE));
		def_csetf(STRAT_SUID, _CSETF_STRAT_SUID);
		def_csetf(STRAT_INFERENCE, _CSETF_STRAT_INFERENCE);
		def_csetf(STRAT_RESULT_UNIQUENESS_CRITERION, _CSETF_STRAT_RESULT_UNIQUENESS_CRITERION);
		def_csetf(STRAT_ACTIVE_PROBLEMS, _CSETF_STRAT_ACTIVE_PROBLEMS);
		def_csetf(STRAT_MOTIVATED_PROBLEMS, _CSETF_STRAT_MOTIVATED_PROBLEMS);
		def_csetf(STRAT_SET_ASIDE_PROBLEMS, _CSETF_STRAT_SET_ASIDE_PROBLEMS);
		def_csetf($sym20$STRAT_SHOULD_RECONSIDER_SET_ASIDES_, $sym21$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_);
		def_csetf(STRAT_PRODUCTIVITY_LIMIT, _CSETF_STRAT_PRODUCTIVITY_LIMIT);
		def_csetf(STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, _CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT);
		def_csetf(STRAT_PROOF_SPEC, _CSETF_STRAT_PROOF_SPEC);
		def_csetf(STRAT_PROBLEM_PROOF_SPEC_INDEX, _CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX);
		def_csetf(STRAT_PROBLEM_STRATEGIC_INDEX, _CSETF_STRAT_PROBLEM_STRATEGIC_INDEX);
		def_csetf(STRAT_MEMOIZATION_STATE, _CSETF_STRAT_MEMOIZATION_STATE);
		def_csetf(STRAT_TYPE, _CSETF_STRAT_TYPE);
		def_csetf(STRAT_DATA, _CSETF_STRAT_DATA);
		identity(STRATEGY);
		register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_strategy$.getGlobalValue(),
				symbol_function(SXHASH_STRATEGY_METHOD));
		register_macro_helper(STRATEGY_ACTIVE_PROBLEMS, DO_STRATEGY_ACTIVE_PROBLEMS);
		register_macro_helper(STRATEGY_MOTIVATED_PROBLEMS, DO_STRATEGY_MOTIVATED_PROBLEMS);
		register_macro_helper(STRATEGY_SET_ASIDE_PROBLEMS, DO_STRATEGY_SET_ASIDE_PROBLEMS);
		register_macro_helper(STRATEGY_MEMOIZATION_STATE, WITH_STRATEGY_MEMOIZATION_STATE);
		register_macro_helper(CURRENT_STRATEGY_WRT_MEMOIZATION, WITH_STRATEGY_MEMOIZATION_STATE);
		declare_defglobal($strategy_type_store$);
		register_method($print_object_method_table$.getGlobalValue(),
				$dtp_problem_strategic_properties$.getGlobalValue(),
				symbol_function(PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
		def_csetf(PROB_STRATEGIC_PROPERTIES_STATUS, _CSETF_PROB_STRATEGIC_PROPERTIES_STATUS);
		def_csetf(PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX,
				_CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX);
		def_csetf(PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT,
				_CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT);
		def_csetf(PROB_STRATEGIC_PROPERTIES_FLAGS, _CSETF_PROB_STRATEGIC_PROPERTIES_FLAGS);
		identity(PROBLEM_STRATEGIC_PROPERTIES);
		register_method($print_object_method_table$.getGlobalValue(),
				$dtp_tactic_strategic_properties$.getGlobalValue(),
				symbol_function(TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
		def_csetf(TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL, _CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL);
		def_csetf(TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION,
				_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION);
		def_csetf(TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY, _CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY);
		def_csetf(TACT_STRATEGIC_PROPERTIES_FLAGS, _CSETF_TACT_STRATEGIC_PROPERTIES_FLAGS);
		identity(TACTIC_STRATEGIC_PROPERTIES);
		return NIL;
	}

	public static SubLObject setup_inference_datastructures_strategy_file() {
		if (SubLFiles.USE_V1) {
			register_method($print_object_method_table$.getGlobalValue(),
					inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(),
					symbol_function(inference_datastructures_strategy.STRATEGY_PRINT_FUNCTION_TRAMPOLINE));
			SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_strategy.$list8);
			def_csetf(inference_datastructures_strategy.STRAT_SUID,
					inference_datastructures_strategy._CSETF_STRAT_SUID);
			def_csetf(inference_datastructures_strategy.STRAT_INFERENCE,
					inference_datastructures_strategy._CSETF_STRAT_INFERENCE);
			def_csetf(inference_datastructures_strategy.STRAT_RESULT_UNIQUENESS_CRITERION,
					inference_datastructures_strategy._CSETF_STRAT_RESULT_UNIQUENESS_CRITERION);
			def_csetf(inference_datastructures_strategy.STRAT_ACTIVE_PROBLEMS,
					inference_datastructures_strategy._CSETF_STRAT_ACTIVE_PROBLEMS);
			def_csetf(inference_datastructures_strategy.STRAT_MOTIVATED_PROBLEMS,
					inference_datastructures_strategy._CSETF_STRAT_MOTIVATED_PROBLEMS);
			def_csetf(inference_datastructures_strategy.STRAT_SET_ASIDE_PROBLEMS,
					inference_datastructures_strategy._CSETF_STRAT_SET_ASIDE_PROBLEMS);
			def_csetf(inference_datastructures_strategy.$sym21$STRAT_SHOULD_RECONSIDER_SET_ASIDES_,
					inference_datastructures_strategy.$sym22$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_);
			def_csetf(inference_datastructures_strategy.STRAT_PRODUCTIVITY_LIMIT,
					inference_datastructures_strategy._CSETF_STRAT_PRODUCTIVITY_LIMIT);
			def_csetf(inference_datastructures_strategy.STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT,
					inference_datastructures_strategy._CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT);
			def_csetf(inference_datastructures_strategy.STRAT_PROOF_SPEC,
					inference_datastructures_strategy._CSETF_STRAT_PROOF_SPEC);
			def_csetf(inference_datastructures_strategy.STRAT_PROBLEM_PROOF_SPEC_INDEX,
					inference_datastructures_strategy._CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX);
			def_csetf(inference_datastructures_strategy.STRAT_PROBLEM_STRATEGIC_INDEX,
					inference_datastructures_strategy._CSETF_STRAT_PROBLEM_STRATEGIC_INDEX);
			def_csetf(inference_datastructures_strategy.STRAT_MEMOIZATION_STATE,
					inference_datastructures_strategy._CSETF_STRAT_MEMOIZATION_STATE);
			def_csetf(inference_datastructures_strategy.STRAT_STEP_COUNT,
					inference_datastructures_strategy._CSETF_STRAT_STEP_COUNT);
			def_csetf(inference_datastructures_strategy.STRAT_TYPE,
					inference_datastructures_strategy._CSETF_STRAT_TYPE);
			def_csetf(inference_datastructures_strategy.STRAT_DATA,
					inference_datastructures_strategy._CSETF_STRAT_DATA);
			identity(STRATEGY);
			register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
					inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(),
					symbol_function(inference_datastructures_strategy.VISIT_DEFSTRUCT_OBJECT_STRATEGY_METHOD));
			register_method(Sxhash.$sxhash_method_table$.getGlobalValue(),
					inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(),
					symbol_function(inference_datastructures_strategy.SXHASH_STRATEGY_METHOD));
			register_macro_helper(inference_datastructures_strategy.STRATEGY_ACTIVE_PROBLEMS,
					inference_datastructures_strategy.DO_STRATEGY_ACTIVE_PROBLEMS);
			register_macro_helper(inference_datastructures_strategy.STRATEGY_MOTIVATED_PROBLEMS,
					inference_datastructures_strategy.DO_STRATEGY_MOTIVATED_PROBLEMS);
			register_macro_helper(inference_datastructures_strategy.STRATEGY_SET_ASIDE_PROBLEMS,
					inference_datastructures_strategy.DO_STRATEGY_SET_ASIDE_PROBLEMS);
			register_macro_helper(inference_datastructures_strategy.STRATEGY_MEMOIZATION_STATE,
					inference_datastructures_strategy.WITH_STRATEGY_MEMOIZATION_STATE);
			register_macro_helper(inference_datastructures_strategy.CURRENT_STRATEGY_WRT_MEMOIZATION,
					inference_datastructures_strategy.WITH_STRATEGY_MEMOIZATION_STATE);
			declare_defglobal($strategy_type_store$);
			register_method($print_object_method_table$.getGlobalValue(),
					inference_datastructures_strategy.$dtp_problem_strategic_properties$.getGlobalValue(),
					symbol_function(PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
			SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_strategy.$list125);
			def_csetf(PROB_STRATEGIC_PROPERTIES_STATUS, _CSETF_PROB_STRATEGIC_PROPERTIES_STATUS);
			def_csetf(PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX,
					_CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX);
			def_csetf(PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT,
					_CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT);
			def_csetf(inference_datastructures_strategy.PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS,
					inference_datastructures_strategy._CSETF_PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS);
			identity(PROBLEM_STRATEGIC_PROPERTIES);
			register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
					inference_datastructures_strategy.$dtp_problem_strategic_properties$.getGlobalValue(),
					symbol_function(
							inference_datastructures_strategy.VISIT_DEFSTRUCT_OBJECT_PROBLEM_STRATEGIC_PROPERTIES_METHOD));
			register_method($print_object_method_table$.getGlobalValue(),
					inference_datastructures_strategy.$dtp_tactic_strategic_properties$.getGlobalValue(),
					symbol_function(TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
			SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_strategy.$list161);
			def_csetf(inference_datastructures_strategy.TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL,
					inference_datastructures_strategy._CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL);
			def_csetf(inference_datastructures_strategy.TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION,
					inference_datastructures_strategy._CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION);
			def_csetf(inference_datastructures_strategy.TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY,
					inference_datastructures_strategy._CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY);
			def_csetf(inference_datastructures_strategy.TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS,
					inference_datastructures_strategy._CSETF_TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS);
			identity(TACTIC_STRATEGIC_PROPERTIES);
			register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
					inference_datastructures_strategy.$dtp_tactic_strategic_properties$.getGlobalValue(),
					symbol_function(
							inference_datastructures_strategy.VISIT_DEFSTRUCT_OBJECT_TACTIC_STRATEGIC_PROPERTIES_METHOD));
		}
		if (SubLFiles.USE_V2) {
			def_csetf($sym20$STRAT_SHOULD_RECONSIDER_SET_ASIDES_, $sym21$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_);
			def_csetf(PROB_STRATEGIC_PROPERTIES_FLAGS, _CSETF_PROB_STRATEGIC_PROPERTIES_FLAGS);
			def_csetf(TACT_STRATEGIC_PROPERTIES_FLAGS, _CSETF_TACT_STRATEGIC_PROPERTIES_FLAGS);
		}
		return NIL;
	}

	public static SubLObject setup_inference_datastructures_strategy_file_Previous() {
		register_method($print_object_method_table$.getGlobalValue(),
				inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(),
				symbol_function(inference_datastructures_strategy.STRATEGY_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_strategy.$list8);
		def_csetf(inference_datastructures_strategy.STRAT_SUID, inference_datastructures_strategy._CSETF_STRAT_SUID);
		def_csetf(inference_datastructures_strategy.STRAT_INFERENCE,
				inference_datastructures_strategy._CSETF_STRAT_INFERENCE);
		def_csetf(inference_datastructures_strategy.STRAT_RESULT_UNIQUENESS_CRITERION,
				inference_datastructures_strategy._CSETF_STRAT_RESULT_UNIQUENESS_CRITERION);
		def_csetf(inference_datastructures_strategy.STRAT_ACTIVE_PROBLEMS,
				inference_datastructures_strategy._CSETF_STRAT_ACTIVE_PROBLEMS);
		def_csetf(inference_datastructures_strategy.STRAT_MOTIVATED_PROBLEMS,
				inference_datastructures_strategy._CSETF_STRAT_MOTIVATED_PROBLEMS);
		def_csetf(inference_datastructures_strategy.STRAT_SET_ASIDE_PROBLEMS,
				inference_datastructures_strategy._CSETF_STRAT_SET_ASIDE_PROBLEMS);
		def_csetf(inference_datastructures_strategy.$sym21$STRAT_SHOULD_RECONSIDER_SET_ASIDES_,
				inference_datastructures_strategy.$sym22$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_);
		def_csetf(inference_datastructures_strategy.STRAT_PRODUCTIVITY_LIMIT,
				inference_datastructures_strategy._CSETF_STRAT_PRODUCTIVITY_LIMIT);
		def_csetf(inference_datastructures_strategy.STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT,
				inference_datastructures_strategy._CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT);
		def_csetf(inference_datastructures_strategy.STRAT_PROOF_SPEC,
				inference_datastructures_strategy._CSETF_STRAT_PROOF_SPEC);
		def_csetf(inference_datastructures_strategy.STRAT_PROBLEM_PROOF_SPEC_INDEX,
				inference_datastructures_strategy._CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX);
		def_csetf(inference_datastructures_strategy.STRAT_PROBLEM_STRATEGIC_INDEX,
				inference_datastructures_strategy._CSETF_STRAT_PROBLEM_STRATEGIC_INDEX);
		def_csetf(inference_datastructures_strategy.STRAT_MEMOIZATION_STATE,
				inference_datastructures_strategy._CSETF_STRAT_MEMOIZATION_STATE);
		def_csetf(inference_datastructures_strategy.STRAT_STEP_COUNT,
				inference_datastructures_strategy._CSETF_STRAT_STEP_COUNT);
		def_csetf(inference_datastructures_strategy.STRAT_TYPE, inference_datastructures_strategy._CSETF_STRAT_TYPE);
		def_csetf(inference_datastructures_strategy.STRAT_DATA, inference_datastructures_strategy._CSETF_STRAT_DATA);
		identity(STRATEGY);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(),
				symbol_function(inference_datastructures_strategy.VISIT_DEFSTRUCT_OBJECT_STRATEGY_METHOD));
		register_method(Sxhash.$sxhash_method_table$.getGlobalValue(),
				inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(),
				symbol_function(inference_datastructures_strategy.SXHASH_STRATEGY_METHOD));
		register_macro_helper(inference_datastructures_strategy.STRATEGY_ACTIVE_PROBLEMS,
				inference_datastructures_strategy.DO_STRATEGY_ACTIVE_PROBLEMS);
		register_macro_helper(inference_datastructures_strategy.STRATEGY_MOTIVATED_PROBLEMS,
				inference_datastructures_strategy.DO_STRATEGY_MOTIVATED_PROBLEMS);
		register_macro_helper(inference_datastructures_strategy.STRATEGY_SET_ASIDE_PROBLEMS,
				inference_datastructures_strategy.DO_STRATEGY_SET_ASIDE_PROBLEMS);
		register_macro_helper(inference_datastructures_strategy.STRATEGY_MEMOIZATION_STATE,
				inference_datastructures_strategy.WITH_STRATEGY_MEMOIZATION_STATE);
		register_macro_helper(inference_datastructures_strategy.CURRENT_STRATEGY_WRT_MEMOIZATION,
				inference_datastructures_strategy.WITH_STRATEGY_MEMOIZATION_STATE);
		declare_defglobal($strategy_type_store$);
		register_method($print_object_method_table$.getGlobalValue(),
				inference_datastructures_strategy.$dtp_problem_strategic_properties$.getGlobalValue(),
				symbol_function(PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_strategy.$list125);
		def_csetf(PROB_STRATEGIC_PROPERTIES_STATUS, _CSETF_PROB_STRATEGIC_PROPERTIES_STATUS);
		def_csetf(PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX,
				_CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX);
		def_csetf(PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT,
				_CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT);
		def_csetf(inference_datastructures_strategy.PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS,
				inference_datastructures_strategy._CSETF_PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS);
		identity(PROBLEM_STRATEGIC_PROPERTIES);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				inference_datastructures_strategy.$dtp_problem_strategic_properties$.getGlobalValue(), symbol_function(
						inference_datastructures_strategy.VISIT_DEFSTRUCT_OBJECT_PROBLEM_STRATEGIC_PROPERTIES_METHOD));
		register_method($print_object_method_table$.getGlobalValue(),
				inference_datastructures_strategy.$dtp_tactic_strategic_properties$.getGlobalValue(),
				symbol_function(TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_strategy.$list161);
		def_csetf(inference_datastructures_strategy.TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL,
				inference_datastructures_strategy._CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL);
		def_csetf(inference_datastructures_strategy.TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION,
				inference_datastructures_strategy._CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION);
		def_csetf(inference_datastructures_strategy.TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY,
				inference_datastructures_strategy._CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY);
		def_csetf(inference_datastructures_strategy.TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS,
				inference_datastructures_strategy._CSETF_TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS);
		identity(TACTIC_STRATEGIC_PROPERTIES);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				inference_datastructures_strategy.$dtp_tactic_strategic_properties$.getGlobalValue(), symbol_function(
						inference_datastructures_strategy.VISIT_DEFSTRUCT_OBJECT_TACTIC_STRATEGIC_PROPERTIES_METHOD));
		return NIL;
	}

	static private final SubLList $list_alt71 = list($DONE);

	static private final SubLList $list_alt76 = list(makeSymbol("STRATEGY"), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLSymbol $sym77$STRATEGY_VAR = makeUninternedSymbol("STRATEGY-VAR");

	static private final SubLSymbol $sym78$STATE_VAR = makeUninternedSymbol("STATE-VAR");

	static private final SubLString $str_alt91$Unexpected_strategy_property__s_w = makeString(
			"Unexpected strategy property ~s with value ~s");

	static private final SubLList $list_alt94 = list(list(makeSymbol("STRATEGY"), makeSymbol("PROBLEM")),
			makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLSymbol $sym95$STRATEGY_VAR = makeUninternedSymbol("STRATEGY-VAR");

	static private final SubLSymbol $sym96$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");

	static private final SubLString $str_alt101$balancing_tactician_does_not_impl = makeString(
			"balancing tactician does not implement ~a");

	private static final SubLSymbol BALANCED_STRATEGY_DEFAULT_SELECT_BEST_STRATEGEM = makeSymbol(
			"BALANCED-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM");

	private static final SubLSymbol BALANCED_STRATEGY_DO_ONE_STEP = makeSymbol("BALANCED-STRATEGY-DO-ONE-STEP");

	static private final SubLSymbol $sym104$BALANCED_STRATEGY_DONE_ = makeSymbol("BALANCED-STRATEGY-DONE?");

	private static final SubLSymbol BALANCED_STRATEGY_POSSIBLY_ACTIVATE_PROBLEM = makeSymbol(
			"BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM");

	static private final SubLString $str_alt106$Unexpected_strategy_type__a = makeString("Unexpected strategy type ~a");

	private static final SubLSymbol STRATEGY_TYPE_PROPERTY_P = makeSymbol("STRATEGY-TYPE-PROPERTY-P");

	static private final SubLString $str_alt111$invalid_uninterestingness_cache_c = makeString(
			"invalid uninterestingness cache code ~s");

	static private final SubLString $str_alt112$invalid_uninterestingness_cache_s = makeString(
			"invalid uninterestingness cache status ~s");

	private static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES = makeSymbol("PROBLEM-STRATEGIC-PROPERTIES");

	private static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES_P = makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-P");

	static private final SubLList $list_alt115 = list(makeSymbol("STATUS"),
			makeSymbol("TACTIC-STRATEGIC-PROPERTY-INDEX"), makeSymbol("POSSIBLE-TACTIC-COUNT"), makeSymbol("FLAGS"));

	static private final SubLList $list_alt116 = list(makeKeyword("STATUS"),
			makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX"), makeKeyword("POSSIBLE-TACTIC-COUNT"), makeKeyword("FLAGS"));

	@Override
	public void declareFunctions() {
		inference_datastructures_strategy.declare_inference_datastructures_strategy_file();
	}

	static private final SubLList $list_alt117 = list(makeSymbol("PROB-STRATEGIC-PROPERTIES-STATUS"),
			makeSymbol("PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX"),
			makeSymbol("PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT"),
			makeSymbol("PROB-STRATEGIC-PROPERTIES-FLAGS"));

	@Override
	public void initializeVariables() {
		inference_datastructures_strategy.init_inference_datastructures_strategy_file();
	}

	@Override
	public void runTopLevelForms() {
		inference_datastructures_strategy.setup_inference_datastructures_strategy_file();
	}

	static {
	}

	public static final class $strategy_native extends SubLStructNative {
		public SubLObject $suid;

		public SubLObject $inference;

		public SubLObject $result_uniqueness_criterion;

		public SubLObject $active_problems;

		public SubLObject $motivated_problems;

		public SubLObject $set_aside_problems;

		public SubLObject $should_reconsider_set_asidesP;

		public SubLObject $productivity_limit;

		public SubLObject $removal_backtracking_productivity_limit;

		public SubLObject $proof_spec;

		public SubLObject $problem_proof_spec_index;

		public SubLObject $problem_strategic_index;

		public SubLObject $memoization_state;

		public SubLObject $step_count;

		public SubLObject $type;

		public SubLObject $data;

		private static final SubLStructDeclNative structDecl;

		public $strategy_native() {
			this.$suid = Lisp.NIL;
			this.$inference = Lisp.NIL;
			this.$result_uniqueness_criterion = Lisp.NIL;
			this.$active_problems = Lisp.NIL;
			this.$motivated_problems = Lisp.NIL;
			this.$set_aside_problems = Lisp.NIL;
			this.$should_reconsider_set_asidesP = Lisp.NIL;
			this.$productivity_limit = Lisp.NIL;
			this.$removal_backtracking_productivity_limit = Lisp.NIL;
			this.$proof_spec = Lisp.NIL;
			this.$problem_proof_spec_index = Lisp.NIL;
			this.$problem_strategic_index = Lisp.NIL;
			this.$memoization_state = Lisp.NIL;
			this.$step_count = Lisp.NIL;
			this.$type = Lisp.NIL;
			this.$data = Lisp.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return this.$suid;
		}

		@Override
		public SubLObject getField3() {
			return this.$inference;
		}

		@Override
		public SubLObject getField4() {
			return this.$result_uniqueness_criterion;
		}

		@Override
		public SubLObject getField5() {
			return this.$active_problems;
		}

		@Override
		public SubLObject getField6() {
			return this.$motivated_problems;
		}

		@Override
		public SubLObject getField7() {
			return this.$set_aside_problems;
		}

		@Override
		public SubLObject getField8() {
			return this.$should_reconsider_set_asidesP;
		}

		@Override
		public SubLObject getField9() {
			return this.$productivity_limit;
		}

		@Override
		public SubLObject getField10() {
			return this.$removal_backtracking_productivity_limit;
		}

		@Override
		public SubLObject getField11() {
			return this.$proof_spec;
		}

		@Override
		public SubLObject getField12() {
			return this.$problem_proof_spec_index;
		}

		@Override
		public SubLObject getField13() {
			return this.$problem_strategic_index;
		}

		@Override
		public SubLObject getField14() {
			return this.$memoization_state;
		}

		@Override
		public SubLObject getField15() {
			return this.$step_count;
		}

		@Override
		public SubLObject getField16() {
			return this.$type;
		}

		@Override
		public SubLObject getField17() {
			return this.$data;
		}

		@Override
		public SubLObject setField2(final SubLObject value) {
			return this.$suid = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value) {
			return this.$inference = value;
		}

		@Override
		public SubLObject setField4(final SubLObject value) {
			return this.$result_uniqueness_criterion = value;
		}

		@Override
		public SubLObject setField5(final SubLObject value) {
			return this.$active_problems = value;
		}

		@Override
		public SubLObject setField6(final SubLObject value) {
			return this.$motivated_problems = value;
		}

		@Override
		public SubLObject setField7(final SubLObject value) {
			return this.$set_aside_problems = value;
		}

		@Override
		public SubLObject setField8(final SubLObject value) {
			return this.$should_reconsider_set_asidesP = value;
		}

		@Override
		public SubLObject setField9(final SubLObject value) {
			return this.$productivity_limit = value;
		}

		@Override
		public SubLObject setField10(final SubLObject value) {
			return this.$removal_backtracking_productivity_limit = value;
		}

		@Override
		public SubLObject setField11(final SubLObject value) {
			return this.$proof_spec = value;
		}

		@Override
		public SubLObject setField12(final SubLObject value) {
			return this.$problem_proof_spec_index = value;
		}

		@Override
		public SubLObject setField13(final SubLObject value) {
			return this.$problem_strategic_index = value;
		}

		@Override
		public SubLObject setField14(final SubLObject value) {
			return this.$memoization_state = value;
		}

		@Override
		public SubLObject setField15(final SubLObject value) {
			return this.$step_count = value;
		}

		@Override
		public SubLObject setField16(final SubLObject value) {
			return this.$type = value;
		}

		@Override
		public SubLObject setField17(final SubLObject value) {
			return this.$data = value;
		}

		static {
			structDecl = makeStructDeclNative(inference_datastructures_strategy.$strategy_native.class, STRATEGY,
					inference_datastructures_strategy.STRATEGY_P, inference_datastructures_strategy.$list2,
					inference_datastructures_strategy.$list3,
					new String[] { "$suid", "$inference", "$result_uniqueness_criterion", "$active_problems",
							"$motivated_problems", "$set_aside_problems", "$should_reconsider_set_asidesP",
							"$productivity_limit", "$removal_backtracking_productivity_limit", "$proof_spec",
							"$problem_proof_spec_index", "$problem_strategic_index", "$memoization_state",
							"$step_count", "$type", "$data" },
					inference_datastructures_strategy.$list4, inference_datastructures_strategy.$list5,
					inference_datastructures_strategy.PRINT_STRATEGY);
		}
	}

	static private final SubLList $list_alt118 = list(makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS"),
			makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX"),
			makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT"),
			makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-FLAGS"));

	private static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol(
			"PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol("PROB-STRATEGIC-PROPERTIES-STATUS");

	public static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol(
			"_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS");

	private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol(
			"PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX");

	public static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol(
			"_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX");

	private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol(
			"PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT");

	public static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol(
			"_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT");

	private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_FLAGS = makeSymbol("PROB-STRATEGIC-PROPERTIES-FLAGS");

	public static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_FLAGS = makeSymbol(
			"_CSETF-PROB-STRATEGIC-PROPERTIES-FLAGS");

	private static final SubLSymbol $TACTIC_STRATEGIC_PROPERTY_INDEX = makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX");

	private static final SubLSymbol $POSSIBLE_TACTIC_COUNT = makeKeyword("POSSIBLE-TACTIC-COUNT");

	private static final SubLSymbol STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");

	static private final SubLString $str_alt147$unexpected_motivation__s = makeString("unexpected motivation ~s");

	private static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES = makeSymbol("TACTIC-STRATEGIC-PROPERTIES");

	private static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES_P = makeSymbol("TACTIC-STRATEGIC-PROPERTIES-P");

	static private final SubLList $list_alt151 = list(makeSymbol("PREFERENCE-LEVEL"),
			makeSymbol("PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("PRODUCTIVITY"), makeSymbol("FLAGS"));

	static private final SubLList $list_alt152 = list(makeKeyword("PREFERENCE-LEVEL"),
			makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), makeKeyword("PRODUCTIVITY"), makeKeyword("FLAGS"));

	static private final SubLList $list_alt153 = list(makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL"),
			makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION"),
			makeSymbol("TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY"), makeSymbol("TACT-STRATEGIC-PROPERTIES-FLAGS"));

	static private final SubLList $list_alt154 = list(makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL"),
			makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION"),
			makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY"),
			makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-FLAGS"));

	private static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol(
			"TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLSymbol TACT_STRATEGIC_PROPERTIES_FLAGS = makeSymbol("TACT-STRATEGIC-PROPERTIES-FLAGS");

	public static final SubLSymbol _CSETF_TACT_STRATEGIC_PROPERTIES_FLAGS = makeSymbol(
			"_CSETF-TACT-STRATEGIC-PROPERTIES-FLAGS");

	static private final SubLString $str_alt171$structural_tactic__s_cannot_have_ = makeString(
			"structural tactic ~s cannot have a completeness");

	static private final SubLString $str_alt172$content_tactic__s_cannot_have_a_p = makeString(
			"content tactic ~s cannot have a preference level");

	static private final SubLString $str_alt173$content_tactic__s_cannot_have_a_p = makeString(
			"content tactic ~s cannot have a preference level justification");

	public static final class $strategy_p$UnaryFunction extends UnaryFunction {
		public $strategy_p$UnaryFunction() {
			super(extractFunctionNamed("STRATEGY-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return inference_datastructures_strategy.strategy_p(arg1);
		}
	}

	public static final class $sxhash_strategy_method$UnaryFunction extends UnaryFunction {
		public $sxhash_strategy_method$UnaryFunction() {
			super(extractFunctionNamed("SXHASH-STRATEGY-METHOD"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return inference_datastructures_strategy.sxhash_strategy_method(arg1);
		}
	}

	public static final class $problem_strategic_properties_native extends SubLStructNative {
		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return $status;
		}

		@Override
		public SubLObject getField3() {
			return $tactic_strategic_property_index;
		}

		@Override
		public SubLObject getField4() {
			return $possible_tactic_count;
		}

		// public SubLObject getField5() {
		// return $flags;
		// }
		@Override
		public SubLObject setField2(SubLObject value) {
			return $status = value;
		}

		@Override
		public SubLObject setField3(SubLObject value) {
			return $tactic_strategic_property_index = value;
		}

		@Override
		public SubLObject setField4(SubLObject value) {
			return $possible_tactic_count = value;
		}

		// public SubLObject setField5(SubLObject value) {
		// return $flags = value;
		// }
		public SubLObject $status = Lisp.NIL;

		public SubLObject $tactic_strategic_property_index = Lisp.NIL;

		public SubLObject $possible_tactic_count = Lisp.NIL;

		public SubLObject $flags = Lisp.NIL;

		// private static final SubLStructDeclNative structDecl = makeStructDeclNative($problem_strategic_properties_native.class, PROBLEM_STRATEGIC_PROPERTIES, PROBLEM_STRATEGIC_PROPERTIES_P, $list115, $list116,
		// new String[] { "$status", "$tactic_strategic_property_index", "$possible_tactic_count", "$flags" }, $list117, $list118, DEFAULT_STRUCT_PRINT_FUNCTION);
		// }
		// public static final class $problem_strategic_properties_native extends SubLStructNative {
		// public SubLObject $status;
		// public SubLObject $tactic_strategic_property_index;
		// public SubLObject $possible_tactic_count;
		public SubLObject $uninterestingness;

		private static final SubLStructDeclNative structDecl;

		public $problem_strategic_properties_native() {
			this.$status = Lisp.NIL;
			this.$tactic_strategic_property_index = Lisp.NIL;
			this.$possible_tactic_count = Lisp.NIL;
			$flags = Lisp.NIL;
			this.$uninterestingness = Lisp.NIL;
		}

		// 
		// @Override
		// public SubLStructDecl getStructDecl() {
		// return structDecl;
		// }
		// 
		// @Override
		// public SubLObject getField2() {
		// return this.$status;
		// }
		// 
		// @Override
		// public SubLObject getField3() {
		// return this.$tactic_strategic_property_index;
		// }
		// 
		// @Override
		// public SubLObject getField4() {
		// return this.$possible_tactic_count;
		// }
		// @Override
		// public SubLObject getField6() {
		// return this.$uninterestingness;
		// }
		// 
		// @Override
		// public SubLObject setField2(final SubLObject value) {
		// return this.$status = value;
		// }
		// 
		// @Override
		// public SubLObject setField3(final SubLObject value) {
		// return this.$tactic_strategic_property_index = value;
		// }
		// 
		// @Override
		// public SubLObject setField4(final SubLObject value) {
		// return this.$possible_tactic_count = value;
		// }
		// 
		// @Override
		// public SubLObject setField5(final SubLObject value) {
		// return this.$uninterestingness = value;
		// }
		static {
			structDecl = makeStructDeclNative(
					inference_datastructures_strategy.$problem_strategic_properties_native.class,
					PROBLEM_STRATEGIC_PROPERTIES, PROBLEM_STRATEGIC_PROPERTIES_P,
					inference_datastructures_strategy.$list119, inference_datastructures_strategy.$list120,
					new String[] { "$status", "$tactic_strategic_property_index", "$possible_tactic_count", "$flags",
							"$uninterestingness" },
					inference_datastructures_strategy.$list121, inference_datastructures_strategy.$list122,
					DEFAULT_STRUCT_PRINT_FUNCTION);
		}
	}

	public static final class $problem_strategic_properties_p$UnaryFunction extends UnaryFunction {
		public $problem_strategic_properties_p$UnaryFunction() {
			super(extractFunctionNamed("PROBLEM-STRATEGIC-PROPERTIES-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return inference_datastructures_strategy.problem_strategic_properties_p(arg1);
		}
	}

	public static final class $tactic_strategic_properties_p$UnaryFunction extends UnaryFunction {
		public $tactic_strategic_properties_p$UnaryFunction() {
			super(extractFunctionNamed("TACTIC-STRATEGIC-PROPERTIES-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return inference_datastructures_strategy.tactic_strategic_properties_p(arg1);
		}
	}
}

/**
 * Total time: 824 ms
 */
