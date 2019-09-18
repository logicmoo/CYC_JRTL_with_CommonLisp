/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      RECANONICALIZER
 *  source file: /cyc/top/cycl/recanonicalizer.lisp
 *  created:     2019/07/03 17:39:06
 */
public final class recanonicalizer extends SubLTranslatedFile implements V02 {
	// // Constructor
	private recanonicalizer() {
	}

	public static final SubLFile me = new recanonicalizer();

	// // Definitions
	/**
	 * whether to partially order the KB before recanonicalizing it, or to check for dependencies each time you recanoicalize an rf.
	 */
	// defparameter
	private static final SubLSymbol $preorder_rfsP$ = makeSymbol("*PREORDER-RFS?*");

	/**
	 * whether to consider unreified reifiable nats when computing the partial order
	 */
	// defparameter
	private static final SubLSymbol $order_wrt_unreified_reifiable_natsP$ = makeSymbol("*ORDER-WRT-UNREIFIED-REIFIABLE-NATS?*");

	/**
	 * whether to try to find and recanonicalize unreified reifiable subnats when recanonicalizing an unordered rf
	 */
	// defparameter
	private static final SubLSymbol $find_unreified_reifiable_subnatsP$ = makeSymbol("*FIND-UNREIFIED-REIFIABLE-SUBNATS?*");

	/**
	 * whether (and perhaps how) to robustly look up narts when we are specifically trying to find them to order them (or reify them if we can't find them)
	 */
	// defparameter
	private static final SubLSymbol $robust_lookup_during_nart_ordering$ = makeSymbol("*ROBUST-LOOKUP-DURING-NART-ORDERING*");

	/**
	 * whether (and perhaps how) to robustly look up narts while we're actually recanonicalizing rfs
	 */
	// defparameter
	private static final SubLSymbol $robust_nart_lookup_during_recanonicalization$ = makeSymbol("*ROBUST-NART-LOOKUP-DURING-RECANONICALIZATION*");

	/**
	 * whether to consider unreified assertions when computing the partial order
	 */
	// defparameter
	private static final SubLSymbol $order_wrt_unreified_assertionsP$ = makeSymbol("*ORDER-WRT-UNREIFIED-ASSERTIONS?*");

	/**
	 * whether to try to find and recanonicalize unreified reifiable sub-assertions when recanonicalizing an unordered rf
	 */
	// defparameter
	private static final SubLSymbol $find_unreified_sub_assertionsP$ = makeSymbol("*FIND-UNREIFIED-SUB-ASSERTIONS?*");

	/**
	 * whether (and perhaps how) to robustly look up assertions when we are specifically trying to find them to order them (or reify them if we can't find them)
	 */
	// defparameter
	private static final SubLSymbol $robust_lookup_during_assertion_ordering$ = makeSymbol("*ROBUST-LOOKUP-DURING-ASSERTION-ORDERING*");

	/**
	 * whether (and perhaps how) to robustly look up assertions while we're actually recanonicalizing rfs
	 */
	// defparameter
	private static final SubLSymbol $robust_assertion_lookup_during_recanonicalization$ = makeSymbol("*ROBUST-ASSERTION-LOOKUP-DURING-RECANONICALIZATION*");

	/**
	 * whether we're pushing meta-assertion lookup problem rfs onto a separate stack to be redone later.
	 */
	// defparameter
	private static final SubLSymbol $pushing_meta_problems_to_endP$ = makeSymbol("*PUSHING-META-PROBLEMS-TO-END?*");

	/**
	 * whether to recanonicalize rfs that reference the rf being recanonicalized
	 */
	// defparameter
	private static final SubLSymbol $recanonicalize_super_rfsP$ = makeSymbol("*RECANONICALIZE-SUPER-RFS?*");

	/**
	 * whether to fail on the recanonicalization of RF if there is an rf that references RF which is unrecanonicalizable.
	 */
	// defparameter
	private static final SubLSymbol $fail_on_unrecanonicalizable_super_rfP$ = makeSymbol("*FAIL-ON-UNRECANONICALIZABLE-SUPER-RF?*");

	/**
	 * lock on recanonicalization of more than one rf at a time
	 */
	// defparameter
	private static final SubLSymbol $recanonicalizer_lock$ = makeSymbol("*RECANONICALIZER-LOCK*");

	/**
	 * the number of examples considered while mapping through some data structure
	 */
	// defparameter
	private static final SubLSymbol $mapping_considered$ = makeSymbol("*MAPPING-CONSIDERED*");

	/**
	 * the number of 'hits' found while mapping through some data structure
	 */
	// defparameter
	private static final SubLSymbol $mapping_hits$ = makeSymbol("*MAPPING-HITS*");

	/**
	 * the number of qualifying examples found while mapping through some data structure
	 */
	// defparameter
	private static final SubLSymbol $mapping_qualifiers$ = makeSymbol("*MAPPING-QUALIFIERS*");

	/**
	 * stream used to archive recanoicalized assertions
	 */
	// defparameter
	private static final SubLSymbol $recan_archive_stream$ = makeSymbol("*RECAN-ARCHIVE-STREAM*");

	/**
	 * whether to actually modify the HL datastructures
	 */
	// defparameter
	private static final SubLSymbol $recanonicalization_modifies_kbP$ = makeSymbol("*RECANONICALIZATION-MODIFIES-KB?*");

	/**
	 * are we sorting all RFs in order of dependence before we start recanonicalizing?  Changing the default value will not affect behaviour - it is bound within the recanonicalizer.
	 */
	// defparameter
	private static final SubLSymbol $assume_partial_orderP$ = makeSymbol("*ASSUME-PARTIAL-ORDER?*");

	/**
	 * whether to print out messages to the screen
	 */
	// defparameter
	private static final SubLSymbol $recan_verboseP$ = makeSymbol("*RECAN-VERBOSE?*");

	/**
	 * whether to record information about recanonicalization in the global variables.
	 */
	// defparameter
	private static final SubLSymbol $recording_recan_statsP$ = makeSymbol("*RECORDING-RECAN-STATS?*");

	/**
	 * a stack to avoid recursively recanonicalizing the same rf
	 */
	// defparameter
	private static final SubLSymbol $recanonicalization_stack$ = makeSymbol("*RECANONICALIZATION-STACK*");

	/**
	 * whether we are recanonicalizing the entire KB
	 */
	// defparameter
	private static final SubLSymbol $recanonicalizing_kbP$ = makeSymbol("*RECANONICALIZING-KB?*");

	/**
	 * analyses which indicate that recanonicalization in place is possible
	 */
	// defparameter
	private static final SubLSymbol $recan_handled_analyses$ = makeSymbol("*RECAN-HANDLED-ANALYSES*");

	/**
	 * analyses which indicate that recanonicalization in place is not currently possible
	 */
	// defparameter
	private static final SubLSymbol $recan_unhandled_analyses$ = makeSymbol("*RECAN-UNHANDLED-ANALYSES*");

	/**
	 * analyses which indicate that recanonicalization in place cannot be performed due to an expected type of error
	 */
	// defparameter
	private static final SubLSymbol $recan_error_analyses$ = makeSymbol("*RECAN-ERROR-ANALYSES*");

	/**
	 * analysis which indicate that special handling is required, (e.g. this rf cannot be recanonicalized now, but may be recanonicalizable later.)
	 */
	// defparameter
	private static final SubLSymbol $recan_special_analyses$ = makeSymbol("*RECAN-SPECIAL-ANALYSES*");

	// defparameter
	private static final SubLSymbol $mapping_rf_id$ = makeSymbol("*MAPPING-RF-ID*");

	/**
	 * remove assertions from kb when not canonicalizable?
	 */
	// defparameter
	private static final SubLSymbol $exiling_canonical_misfit_assertionsP$ = makeSymbol("*EXILING-CANONICAL-MISFIT-ASSERTIONS?*");

	/**
	 * remove narts from kb when not canonicalizable?
	 */
	// defparameter
	private static final SubLSymbol $exiling_canonical_misfit_nartsP$ = makeSymbol("*EXILING-CANONICAL-MISFIT-NARTS?*");

	public static final class $recan_rf_native extends SubLStructNative {
		@Override
		public SubLStructDecl getStructDecl() {
			return recanonicalizer.$recan_rf_native.structDecl;
		}

		@Override
		public SubLObject getField2() {
			return $rf;
		}

		@Override
		public SubLObject getField3() {
			return $analysis;
		}

		@Override
		public SubLObject getField4() {
			return $recanonicalization;
		}

		@Override
		public SubLObject getField5() {
			return $extra_info;
		}

		@Override
		public SubLObject setField2(SubLObject value) {
			return $rf = value;
		}

		@Override
		public SubLObject setField3(SubLObject value) {
			return $analysis = value;
		}

		@Override
		public SubLObject setField4(SubLObject value) {
			return $recanonicalization = value;
		}

		@Override
		public SubLObject setField5(SubLObject value) {
			return $extra_info = value;
		}

		public SubLObject $rf = Lisp.NIL;

		public SubLObject $analysis = Lisp.NIL;

		public SubLObject $recanonicalization = Lisp.NIL;

		public SubLObject $extra_info = Lisp.NIL;

		private static final SubLStructDeclNative structDecl = makeStructDeclNative(recanonicalizer.$recan_rf_native.class, RECAN_RF, RECAN_RF_P, $list_alt17, $list_alt18, new String[] { "$rf", "$analysis", "$recanonicalization", "$extra_info" }, $list_alt19, $list_alt20, PRINT_RECAN_RF);
	}

	// defconstant
	public static final SubLSymbol $dtp_recan_rf$ = makeSymbol("*DTP-RECAN-RF*");

	public static final SubLObject recan_rf_print_function_trampoline(SubLObject v_object, SubLObject stream) {
		print_recan_rf(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static final SubLObject recan_rf_p(SubLObject v_object) {
		return v_object.getJavaClass() ==recanonicalizer.$recan_rf_native.class ? ((SubLObject) (T)) : NIL;
	}

	public static final class $recan_rf_p$UnaryFunction extends UnaryFunction {
		public $recan_rf_p$UnaryFunction() {
			super(extractFunctionNamed("RECAN-RF-P"));
		}

		@Override
		public SubLObject processItem(SubLObject arg1) {
			return recan_rf_p(arg1);
		}
	}

	public static final SubLObject recan_rf_rf(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, RECAN_RF_P);
		return v_object.getField2();
	}

	public static final SubLObject recan_rf_analysis(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, RECAN_RF_P);
		return v_object.getField3();
	}

	public static final SubLObject recan_rf_recanonicalization(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, RECAN_RF_P);
		return v_object.getField4();
	}

	public static final SubLObject recan_rf_extra_info(SubLObject v_object) {
		SubLSystemTrampolineFile.checkType(v_object, RECAN_RF_P);
		return v_object.getField5();
	}

	public static final SubLObject _csetf_recan_rf_rf(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, RECAN_RF_P);
		return v_object.setField2(value);
	}

	public static final SubLObject _csetf_recan_rf_analysis(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, RECAN_RF_P);
		return v_object.setField3(value);
	}

	public static final SubLObject _csetf_recan_rf_recanonicalization(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, RECAN_RF_P);
		return v_object.setField4(value);
	}

	public static final SubLObject _csetf_recan_rf_extra_info(SubLObject v_object, SubLObject value) {
		SubLSystemTrampolineFile.checkType(v_object, RECAN_RF_P);
		return v_object.setField5(value);
	}

	public static final SubLObject make_recan_rf(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		{
			SubLObject v_new = new recanonicalizer.$recan_rf_native();
			SubLObject next = NIL;
			for (next = arglist; NIL != next; next = cddr(next)) {
				{
					SubLObject current_arg = next.first();
					SubLObject current_value = cadr(next);
					SubLObject pcase_var = current_arg;
					if (pcase_var.eql($RF)) {
						_csetf_recan_rf_rf(v_new, current_value);
					} else if (pcase_var.eql($ANALYSIS)) {
						_csetf_recan_rf_analysis(v_new, current_value);
					} else if (pcase_var.eql($RECANONICALIZATION)) {
						_csetf_recan_rf_recanonicalization(v_new, current_value);
					} else if (pcase_var.eql($EXTRA_INFO)) {
						_csetf_recan_rf_extra_info(v_new, current_value);
					} else {
						Errors.error($str_alt35$Invalid_slot__S_for_construction_, current_arg);
					}

				}
			}
			return v_new;
		}
	}

	public static final SubLObject print_recan_rf(SubLObject v_object, SubLObject stream, SubLObject depth) {
		format(stream, $str_alt36$___a_RF__a_, recan_rf_analysis(v_object), recan_rf_rf(v_object));
		return NIL;
	}

	/**
	 *
	 *
	 * @return 0 list; a list of problems, or NIL if there were no problems.
	 * @return 1 integer; the number of RFs that failed to recanonicalize
	 * @return 2 integer; the number of RFs in need of recanonicalization and successfully recanonicalized
	 * @return 3 integer; the number of RFs that were already canonical
	 */
	public static final SubLObject recanonicalize_kb(SubLObject reallyP, SubLObject perform_diagnosticsP, SubLObject clear_existing_stateP) {
		if (reallyP == UNPROVIDED) {
			reallyP = $recanonicalization_modifies_kbP$.getDynamicValue();
		}
		if (perform_diagnosticsP == UNPROVIDED) {
			perform_diagnosticsP = T;
		}
		if (clear_existing_stateP == UNPROVIDED) {
			clear_existing_stateP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != perform_diagnosticsP) {
				{
					SubLObject problems = pre_recanonicalization_diagnostics();
					if (NIL != problems) {
						return problems;
					}
				}
			}
			{
				SubLObject _prev_bind_0 = $recanonicalization_modifies_kbP$.currentBinding(thread);
				SubLObject _prev_bind_1 = $recanonicalizing_kbP$.currentBinding(thread);
				SubLObject _prev_bind_2 = $recanonicalize_super_rfsP$.currentBinding(thread);
				SubLObject _prev_bind_3 = $fail_on_unrecanonicalizable_super_rfP$.currentBinding(thread);
				try {
					$recanonicalization_modifies_kbP$.bind(reallyP, thread);
					$recanonicalizing_kbP$.bind(T, thread);
					$recanonicalize_super_rfsP$.bind(NIL, thread);
					$fail_on_unrecanonicalizable_super_rfP$.bind(NIL, thread);
					{
						SubLObject _prev_bind_0_1 = $assume_partial_orderP$.currentBinding(thread);
						SubLObject _prev_bind_1_2 = $pushing_meta_problems_to_endP$.currentBinding(thread);
						try {
							$assume_partial_orderP$.bind($preorder_rfsP$.getDynamicValue(thread), thread);
							$pushing_meta_problems_to_endP$.bind(T, thread);
							{
								SubLObject rfs = (NIL != $preorder_rfsP$.getDynamicValue(thread)) ? ((SubLObject) (partially_order_rfs(all_rfs()))) : all_rfs();
								recanonicalize_rfs(rfs, clear_existing_stateP, T, UNPROVIDED);
							}
						} finally {
							$pushing_meta_problems_to_endP$.rebind(_prev_bind_1_2, thread);
							$assume_partial_orderP$.rebind(_prev_bind_0_1, thread);
						}
					}
					{
						SubLObject _prev_bind_0_3 = $assume_partial_orderP$.currentBinding(thread);
						SubLObject _prev_bind_1_4 = $pushing_meta_problems_to_endP$.currentBinding(thread);
						try {
							$assume_partial_orderP$.bind(NIL, thread);
							$pushing_meta_problems_to_endP$.bind(NIL, thread);
							recanonicalize_rfs($meta_problem_rfs$.getGlobalValue(), NIL, T, UNPROVIDED);
						} finally {
							$pushing_meta_problems_to_endP$.rebind(_prev_bind_1_4, thread);
							$assume_partial_orderP$.rebind(_prev_bind_0_3, thread);
						}
					}
				} finally {
					$fail_on_unrecanonicalizable_super_rfP$.rebind(_prev_bind_3, thread);
					$recanonicalize_super_rfsP$.rebind(_prev_bind_2, thread);
					$recanonicalizing_kbP$.rebind(_prev_bind_1, thread);
					$recanonicalization_modifies_kbP$.rebind(_prev_bind_0, thread);
				}
			}
			return values(recan_non_success_rfs(), recan_non_success_count(), recan_success_count(), recan_ort_count());
		}
	}

	/**
	 *
	 *
	 * @return list; a list of forts with problems that must be resolved before recanonicalization can proceed, NIL if there are no problems.
	 */
	public static final SubLObject pre_recanonicalization_diagnostics() {
		return kbi_relation.commutative_relations_without_common_arg_types(UNPROVIDED);
	}

	/**
	 *
	 *
	 * @return recan-rf; a structure containing RF and additional analysis of its recanonicalization,
	including the actual recanonicalization if applicable.
	 */
	public static final SubLObject recan_analyze_rf(SubLObject rf, SubLObject mt_list) {
		if (mt_list == UNPROVIDED) {
			mt_list = NIL;
		}
		if (NIL != rf_canonicalP(rf)) {
			return new_recan_rf(rf, $ORT, UNPROVIDED, UNPROVIDED);
		} else if (NIL == valid_rfP(rf)) {
			return new_recan_rf(rf, $INVALID, UNPROVIDED, UNPROVIDED);
		} else if (NIL == wf_rf_syntaxP(rf)) {
			return new_recan_rf(rf, $ILL_FORMED_SYNTAX, UNPROVIDED, UNPROVIDED);
		} else if (NIL != nart_handles.nart_p(rf)) {
			return recan_analyze_nart(rf, mt_list);
		} else if (NIL != assertion_handles.assertion_p(rf)) {
			return recan_analyze_assertion(rf);
		} else {
			return new_recan_rf(rf, $UNKNOWN, UNPROVIDED, UNPROVIDED);
		}

	}

	/**
	 *
	 *
	 * @return recan-rf; a structure containing RF and additional analysis of its recanonicalization,
	including the actual recanonicalization if applicable.
	 */
	public static final SubLObject recan_analyze_rf_by_id(SubLObject rf_id, SubLObject mt_list) {
		if (mt_list == UNPROVIDED) {
			mt_list = NIL;
		}
		return recan_analyze_rf(find_rf_by_id(rf_id), mt_list);
	}

	/**
	 *
	 *
	 * @return string; a string explaining the recanonicalization analysis of RF.
	 */
	public static final SubLObject explain_recan_analysis(SubLObject analysis) {
		{
			SubLObject result = NIL;
			SubLObject pcase_var = analysis;
			if (pcase_var.eql($ORT)) {
				result = $str_alt41$This_RF_recanonicalizes_to_itself;
			} else if (pcase_var.eql($VAR_RENAME)) {
				result = $str_alt43$I_know_how_to_recanonicalize_this;
			} else if (pcase_var.eql($REORDER)) {
				result = $str_alt45$I_know_how_to_recanonicalize_this;
			} else if (pcase_var.eql($REIFY)) {
				result = $str_alt47$I_know_how_to_recanonicalize_this;
			} else if (pcase_var.eql($VAR_RENAME_REIFY)) {
				result = $str_alt49$I_know_how_to_recanonicalize_this;
			} else if (pcase_var.eql($REORDER_REIFY)) {
				result = $str_alt51$I_know_how_to_recanonicalize_this;
			} else if (pcase_var.eql($NEW_TOU)) {
				result = $str_alt53$I_know_how_to_recanonicalize_this;
			} else if (pcase_var.eql($VAR_RENAME_TOU)) {
				result = $str_alt55$I_know_how_to_recanonicalize_this;
			} else if (pcase_var.eql($REORDER_TOU)) {
				result = $str_alt57$I_know_how_to_recanonicalize_this;
			} else if (pcase_var.eql($PARANOID)) {
				result = $str_alt59$I_know_how_to_recanonicalize_this;
			} else if (pcase_var.eql($ABNORMAL)) {
				result = $str_alt61$I_am_afraid_to_recanonicalize_thi;
			} else if (pcase_var.eql($POLY)) {
				result = $str_alt63$This_assertion_recanonicalizes_in;
			} else if (pcase_var.eql($INVALID)) {
				result = $str_alt64$This_RF_is_invalid__so_I_won_t_ev;
			} else if (pcase_var.eql($RECAN_INVALID)) {
				result = $str_alt66$The_recanonicalization_of_this_RF;
			} else if (pcase_var.eql($ILL_FORMED)) {
				result = $str_alt68$This_RF_is_semantically_ill_forme;
			} else if (pcase_var.eql($ILL_FORMED_SYNTAX)) {
				result = $str_alt69$This_RF_is_syntactically_ill_form;
			} else if (pcase_var.eql($META_PROBLEM)) {
				result = $str_alt71$This_RF_had_a_problem_finding_a_m;
			} else if (pcase_var.eql($SUPER_FAIL)) {
				result = $str_alt73$There_is_an_rf_which_references_t;
			} else if (pcase_var.eql($UNKNOWN)) {
				result = $str_alt74$I_don_t_know_how_to_recanonicaliz;
			} else {
				result = format(NIL, $str_alt75$I_can_t_explain_the_analysis_of_t, analysis);
			}

			return result;
		}
	}

	public static final SubLObject analysis_plus_reify(SubLObject analysis) {
		{
			SubLObject pcase_var = analysis;
			if (pcase_var.eql($ORT)) {
				return $REIFY;
			} else if (pcase_var.eql($VAR_RENAME)) {
				return $VAR_RENAME_REIFY;
			} else if (pcase_var.eql($REORDER)) {
				return $REORDER_REIFY;
			}

		}
		return $UNKNOWN;
	}

	public static final SubLObject analysis_plus_tou(SubLObject analysis) {
		{
			SubLObject pcase_var = analysis;
			if (pcase_var.eql($ORT)) {
				return $NEW_TOU;
			} else if (pcase_var.eql($VAR_RENAME)) {
				return $VAR_RENAME_TOU;
			} else if (pcase_var.eql($REORDER)) {
				return $REORDER_TOU;
			}

		}
		return $UNKNOWN;
	}

	public static final SubLObject recan_analyses() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return append($recan_handled_analyses$.getDynamicValue(thread), $recan_unhandled_analyses$.getDynamicValue(thread), $recan_error_analyses$.getDynamicValue(thread), $recan_special_analyses$.getDynamicValue(thread));
		}
	}

	public static final SubLObject recan_analysis_p(SubLObject v_object) {
		return makeBoolean(v_object.isKeyword() && (NIL != member(v_object, recan_analyses(), UNPROVIDED, UNPROVIDED)));
	}

	public static final SubLObject recanonicalizable_analysis_p(SubLObject v_object) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return subl_promotions.memberP(v_object, $recan_handled_analyses$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		}
	}

	public static final SubLObject unrecanonicalizable_analysis_p(SubLObject v_object) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return subl_promotions.memberP(v_object, $recan_unhandled_analyses$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		}
	}

	public static final SubLObject recan_error_analysis_p(SubLObject v_object) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return subl_promotions.memberP(v_object, $recan_error_analyses$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		}
	}

	public static final SubLObject recan_special_analysis_p(SubLObject v_object) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return subl_promotions.memberP(v_object, $recan_special_analyses$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		}
	}

	public static final SubLObject best_mts_for_nart(SubLObject nart) {
		{
			SubLObject floor_mts = at_utilities.max_floor_mts_of_nat(nart, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject mts_to_use = (NIL != floor_mts) ? ((SubLObject) (floor_mts)) : list(mt_vars.$tou_mt$.getGlobalValue());
			return mts_to_use;
		}
	}

	public static final SubLObject clear_best_mts_for_nart_cached() {
		{
			SubLObject cs = $best_mts_for_nart_cached_caching_state$.getGlobalValue();
			if (NIL != cs) {
				memoization_state.caching_state_clear(cs);
			}
		}
		return NIL;
	}

	public static final SubLObject remove_best_mts_for_nart_cached(SubLObject nart) {
		return memoization_state.caching_state_remove_function_results_with_args($best_mts_for_nart_cached_caching_state$.getGlobalValue(), list(nart), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject best_mts_for_nart_cached_internal(SubLObject nart) {
		return best_mts_for_nart(nart);
	}

	public static final SubLObject best_mts_for_nart_cached(SubLObject nart) {
		{
			SubLObject caching_state = $best_mts_for_nart_cached_caching_state$.getGlobalValue();
			if (NIL == caching_state) {
				caching_state = memoization_state.create_global_caching_state_for_name(BEST_MTS_FOR_NART_CACHED, $best_mts_for_nart_cached_caching_state$, NIL, EQ, ONE_INTEGER, $int$1024);
			}
			{
				SubLObject results = memoization_state.caching_state_lookup(caching_state, nart, $kw79$_MEMOIZED_ITEM_NOT_FOUND_);
				if (results == $kw79$_MEMOIZED_ITEM_NOT_FOUND_) {
					results = arg2(resetMultipleValues(), multiple_value_list(best_mts_for_nart_cached_internal(nart)));
					memoization_state.caching_state_put(caching_state, nart, results, UNPROVIDED);
				}
				return memoization_state.caching_results(results);
			}
		}
	}

	/**
	 * Returns NIL if NART does not need to be recanonicalized (if it recanonicalizes to itself).
	 * Returns the new formula for the nart if it does need to be recanonicalized.
	 * Uses MT if non-nil, otherwise computes a reasonable mt.
	 */
	public static final SubLObject recan_analyze_nart(SubLObject nart, SubLObject mt_list) {
		if (mt_list == UNPROVIDED) {
			mt_list = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject old_formula = narts_high.nart_hl_formula(nart);
				SubLObject mts_to_use = (NIL != mt_list) ? ((SubLObject) (mt_list)) : best_mts_for_nart_cached(nart);
				SubLObject new_formula = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
						mt_relevance_macros.$relevant_mts$.bind(mts_to_use, thread);
						new_formula = recanonicalize_term(old_formula, UNPROVIDED);
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
					}
				}
				if (NIL == el_utilities.el_formula_p(new_formula)) {
					return new_recan_rf(nart, $RECAN_INVALID, UNPROVIDED, UNPROVIDED);
				} else if (old_formula.equal(new_formula)) {
					return new_recan_rf(nart, $ORT, UNPROVIDED, UNPROVIDED);
				} else if (NIL != czer_main.terms_reorder_equalP(old_formula, new_formula)) {
					return new_recan_rf(nart, $REORDER, list(new_formula, mts_to_use), UNPROVIDED);
				}

				{
					SubLObject unreified_old_formula = unreify_rfs(old_formula);
					SubLObject unreified_new_formula = unreify_rfs(new_formula);
					if (unreified_old_formula.equal(unreified_new_formula)) {
						return new_recan_rf(nart, $REIFY, list(new_formula, mts_to_use), UNPROVIDED);
					}
				}
				return new_recan_rf(nart, $PARANOID, list(new_formula, mts_to_use), UNPROVIDED);
			}
		}
	}

	public static final SubLObject recan_analyze_assertion(SubLObject assertion) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject mt = assertions_high.assertion_mt(assertion);
				SubLObject formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
				SubLObject strength = assertions_high.assertion_strength(assertion);
				SubLObject old_cnf = assertions_high.assertion_cnf(assertion);
				SubLObject old_var_names = assertions_high.assertion_variable_names(assertion);
				SubLObject abnormalP = makeBoolean((NIL != czer_meta.has_exceptionP(assertion)) || (NIL != cycl_utilities.assertion_find($$abnormal, assertion, NIL, UNPROVIDED, UNPROVIDED)));
				SubLObject new_canon_versions = NIL;
				SubLObject ill_formed_meta_argsP = NIL;
				SubLObject analysis = NIL;
				{
					SubLObject _prev_bind_0 = czer_vars.$recan_ill_formed_meta_argsP$.currentBinding(thread);
					SubLObject _prev_bind_1 = czer_vars.$noting_ill_formed_meta_argsP$.currentBinding(thread);
					try {
						czer_vars.$recan_ill_formed_meta_argsP$.bind(NIL, thread);
						czer_vars.$noting_ill_formed_meta_argsP$.bind($pushing_meta_problems_to_endP$.getDynamicValue(thread), thread);
						new_canon_versions = recanonicalize_cycl(formula, mt);
						ill_formed_meta_argsP = czer_vars.$recan_ill_formed_meta_argsP$.getDynamicValue(thread);
					} finally {
						czer_vars.$noting_ill_formed_meta_argsP$.rebind(_prev_bind_1, thread);
						czer_vars.$recan_ill_formed_meta_argsP$.rebind(_prev_bind_0, thread);
					}
				}
				if (NIL != ill_formed_meta_argsP) {
					return new_recan_rf(assertion, $META_PROBLEM, new_canon_versions, UNPROVIDED);
				} else if (NIL == new_canon_versions) {
					return new_recan_rf(assertion, $ILL_FORMED, UNPROVIDED, UNPROVIDED);
				} else if (!new_canon_versions.isCons()) {
					return new_recan_rf(assertion, $RECAN_INVALID, UNPROVIDED, UNPROVIDED);
				} else if (ONE_INTEGER.numG(length(new_canon_versions))) {
					return new_recan_rf(assertion, $POLY, new_canon_versions, UNPROVIDED);
				}

				{
					SubLObject new_canon_version = new_canon_versions.first();
					SubLObject new_var_names = NIL;
					SubLObject new_canon_info = NIL;
					thread.resetMultipleValues();
					{
						SubLObject new_cnf = fi.fi_canonicalize(new_canon_version, T, strength);
						SubLObject new_variables = thread.secondMultipleValue();
						SubLObject new_hl_tv = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						new_var_names = Mapping.mapcar(symbol_function(EL_VAR_NAME), new_variables);
						new_canon_info = list(new_cnf, new_var_names, new_hl_tv);
						analysis = recan_analyze_assertion_int(old_cnf, new_cnf, old_var_names, new_var_names, abnormalP);
						if (NIL != analysis) {
							return new_recan_rf(assertion, analysis, new_canon_info, UNPROVIDED);
						} else {
							{
								SubLObject unreified_old_cnf = unreify_rfs(old_cnf);
								SubLObject unreified_new_cnf = unreify_rfs(new_cnf);
								analysis = recan_analyze_assertion_int(unreified_old_cnf, unreified_new_cnf, old_var_names, new_var_names, abnormalP);
								if (NIL != analysis) {
									return new_recan_rf(assertion, analysis_plus_reify(analysis), new_canon_info, UNPROVIDED);
								} else {
									{
										SubLObject unreified_old_ist_cnf = NIL;
										SubLObject unreified_new_ist_cnf = NIL;
										{
											SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
											try {
												czer_vars.$assertion_key$.bind(symbol_function(ASSERTION_IST_FORMULA), thread);
												unreified_old_ist_cnf = unreify_rfs(old_cnf);
												unreified_new_ist_cnf = unreify_rfs(new_cnf);
											} finally {
												czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
											}
										}
										analysis = recan_analyze_assertion_int(unreified_old_ist_cnf, unreified_new_ist_cnf, old_var_names, new_var_names, abnormalP);
										if (NIL != analysis) {
											return new_recan_rf(assertion, analysis_plus_reify(analysis), new_canon_info, UNPROVIDED);
										} else {
											{
												SubLObject re_reified_old_cnf = czer_main.canonicalize_functions_in_clause(unreified_old_cnf);
												SubLObject re_reified_new_cnf = czer_main.canonicalize_functions_in_clause(unreified_new_cnf);
												analysis = recan_analyze_assertion_int(re_reified_old_cnf, re_reified_new_cnf, old_var_names, new_var_names, abnormalP);
												if (NIL != analysis) {
													return new_recan_rf(assertion, analysis_plus_tou(analysis), new_canon_info, UNPROVIDED);
												} else {
													return new_recan_rf(assertion, $PARANOID, new_canon_info, UNPROVIDED);
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

	/**
	 *
	 *
	 * @return recan-analysis-p, or NIL if it can't determine one.
	 */
	public static final SubLObject recan_analyze_assertion_int(SubLObject old_cnf, SubLObject new_cnf, SubLObject old_var_names, SubLObject new_var_names, SubLObject abnormalP) {
		if (old_var_names.equal(new_var_names) && old_cnf.equal(new_cnf)) {
			return $ORT;
		} else if (NIL != abnormalP) {
			return $ABNORMAL;
		} else if (NIL != czer_utilities.ordered_cnf_unifyP(old_cnf, new_cnf)) {
			return $VAR_RENAME;
		} else if (NIL != czer_utilities.cnfs_reorder_equalP(old_cnf, new_cnf, UNPROVIDED)) {
			return $REORDER;
		} else {
			return NIL;
		}

	}

	public static final SubLObject recanonicalize_assertionP(SubLObject assertion, SubLObject check_non_canonP) {
		if (check_non_canonP == UNPROVIDED) {
			check_non_canonP = NIL;
		}
		if ((NIL == check_non_canonP) || (NIL != kbi_assertion.non_canonical_assertionP(assertion, UNPROVIDED))) {
			return makeBoolean(!((NIL != skolems.assertion_skolems(assertion)) || (NIL != kb_utilities.assertion_tous(assertion))));
		}
		return NIL;
	}

	public static final SubLObject recanonicalizing_rf(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt84);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject rf = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt84);
					rf = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return listS(CUNWIND_PROTECT, listS(PROGN, listS(CPUSH, rf, $list_alt88), append(body, NIL)), $list_alt89);
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt84);
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject recursively_recanonicalizingP(SubLObject rf) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return subl_promotions.memberP(rf, $recanonicalization_stack$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		}
	}

	/**
	 * Recanonicalizes all reified formulas in the list RFS.
	 *
	 * @param assume-partial-order?
	 * 		whether to assume that the rfs in the list RFS have already been sorted wrt dependency.
	 */
	public static final SubLObject recanonicalize_rfs(SubLObject rfs, SubLObject clear_existing_stateP, SubLObject record_statsP, SubLObject assume_partial_orderP) {
		if (assume_partial_orderP == UNPROVIDED) {
			assume_partial_orderP = $assume_partial_orderP$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject filename = recanonicalization_archive_filename();
				{
					SubLObject _prev_bind_0 = $recan_archive_stream$.currentBinding(thread);
					SubLObject _prev_bind_1 = $recording_recan_statsP$.currentBinding(thread);
					SubLObject _prev_bind_2 = $assume_partial_orderP$.currentBinding(thread);
					SubLObject _prev_bind_3 = $recanonicalization_stack$.currentBinding(thread);
					try {
						$recan_archive_stream$.bind(compatibility.open_text(filename, $OUTPUT, UNPROVIDED), thread);
						$recording_recan_statsP$.bind(record_statsP, thread);
						$assume_partial_orderP$.bind(assume_partial_orderP, thread);
						$recanonicalization_stack$.bind(NIL, thread);
						if (NIL != clear_existing_stateP) {
							clear_recanonicalizer_state();
						}
						{
							SubLObject lock = $recanonicalizer_lock$.getDynamicValue(thread);
							SubLObject release = NIL;
							try {
								release = seize_lock(lock);
								try {
									kbi_utilities.kbi_print_file_header($recan_archive_stream$.getDynamicValue(thread));
									recan_format(T, $str_alt91$_______a, filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									recan_format(T, $str_alt92$______date_performed___a__, numeric_date_utilities.timestring(UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									{
										SubLObject list_var = rfs;
										utilities_macros.$progress_note$.setDynamicValue(NIL != $recanonicalization_modifies_kbP$.getDynamicValue(thread) ? ((SubLObject) ($$$Recanonicalizing_RFs)) : $$$Pretending_to_recanonicalize_RFs, thread);
										utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
										utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
										utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
										{
											SubLObject _prev_bind_0_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
											SubLObject _prev_bind_1_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
											SubLObject _prev_bind_2_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
											SubLObject _prev_bind_3_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
											try {
												utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
												utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
												utilities_macros.$within_noting_percent_progress$.bind(T, thread);
												utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
												utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
												{
													SubLObject csome_list_var = list_var;
													SubLObject rf = NIL;
													for (rf = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), rf = csome_list_var.first()) {
														utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
														utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
														recanonicalize_rf(rf, UNPROVIDED);
													}
												}
												utilities_macros.noting_percent_progress_postamble();
											} finally {
												utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_8, thread);
												utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_7, thread);
												utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_6, thread);
												utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_5, thread);
											}
										}
									}
								} finally {
									{
										SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
										try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											if ($recan_archive_stream$.getDynamicValue(thread).isStream()) {
												close($recan_archive_stream$.getDynamicValue(thread), UNPROVIDED);
											}
										} finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
										}
									}
								}
							} finally {
								if (NIL != release) {
									release_lock(lock);
								}
							}
						}
					} finally {
						$recanonicalization_stack$.rebind(_prev_bind_3, thread);
						$assume_partial_orderP$.rebind(_prev_bind_2, thread);
						$recording_recan_statsP$.rebind(_prev_bind_1, thread);
						$recan_archive_stream$.rebind(_prev_bind_0, thread);
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject recanonicalize_rfs_by_ids(SubLObject rf_ids, SubLObject clear_existing_stateP, SubLObject record_statsP) {
		return recanonicalize_rfs(list_utilities.delete_if_not(symbol_function(RF_P), Mapping.mapcar(symbol_function(FIND_RF_BY_ID), rf_ids), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), clear_existing_stateP, record_statsP, UNPROVIDED);
	}

	/**
	 *
	 *
	 * @return :success if recanonicalization of RF succeeds,
	an error message if recanonicalization of RF fails.
	 */
	public static final SubLObject recanonicalize_rf(SubLObject rf, SubLObject mt_list) {
		if (mt_list == UNPROVIDED) {
			mt_list = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLSystemTrampolineFile.checkType(rf, REIFIED_FORMULA_P);
			{
				SubLObject result = NIL;
				if (NIL != recursively_recanonicalizingP(rf)) {
					result = format(NIL, $str_alt98$Tried_to_recursively_recanonicali, rf);
				} else {
					try {
						$recanonicalization_stack$.setDynamicValue(cons(rf, $recanonicalization_stack$.getDynamicValue(thread)), thread);
						result = recanonicalize_recan_rf(recan_analyze_rf(rf, mt_list));
					} finally {
						{
							SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								$recanonicalization_stack$.setDynamicValue($recanonicalization_stack$.getDynamicValue(thread).rest(), thread);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
							}
						}
					}
					if (NIL != $recanonicalize_super_rfsP$.getDynamicValue(thread)) {
						if ((NIL == recanonicalize_super_rfs(rf)) && (NIL != $fail_on_unrecanonicalizable_super_rfP$.getDynamicValue(thread))) {
							result = handle_rf_recan_error(rf, $SUPER_FAIL);
						}
					}
				}
				return result;
			}
		}
	}

	/**
	 *
	 *
	 * @return :success if recanonicalization of RF succeeds,
	an error message if recanonicalization of RF fails.
	 */
	public static final SubLObject recanonicalize_rf_by_id(SubLObject rf_id, SubLObject mt_list) {
		if (mt_list == UNPROVIDED) {
			mt_list = NIL;
		}
		SubLSystemTrampolineFile.checkType(rf_id, CONSP);
		{
			SubLObject rf = find_rf_by_id(rf_id);
			if (NIL != rf) {
				return recanonicalize_rf(rf, mt_list);
			} else {
				return format(NIL, $str_alt100$_s_is_not_a_valid_RF_id_, rf_id);
			}
		}
	}

	/**
	 *
	 *
	 * @return :success if recanonicalization of RECAN-RF succeeds or is not necessary,
	an error message if recanonicalization of RECAN-RF fails.
	 */
	public static final SubLObject recanonicalize_recan_rf(SubLObject recan_rf) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLSystemTrampolineFile.checkType(recan_rf, RECAN_RF_P);
			{
				SubLObject rf = recan_rf_rf(recan_rf);
				SubLObject analysis = recan_rf_analysis(recan_rf);
				if ($ORT == analysis) {
					if (NIL != $recording_recan_statsP$.getDynamicValue(thread)) {
						$recan_ort_rfs$.setGlobalValue(cons(rf, $recan_ort_rfs$.getGlobalValue()));
					}
					return $SUCCESS;
				} else {
					return really_recanonicalize_recan_rf(recan_rf);
				}
			}
		}
	}

	/**
	 *
	 *
	 * @return :success if recanonicalization of RECAN-RF succeeds,
	an error message if recanonicalization of RECAN-RF fails.
	 */
	public static final SubLObject really_recanonicalize_recan_rf(SubLObject recan_rf) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject rf = recan_rf_rf(recan_rf);
				SubLObject analysis = recan_rf_analysis(recan_rf);
				if (NIL != recan_error_analysis_p(analysis)) {
					return handle_rf_recan_error(rf, analysis);
				} else if (NIL != recan_special_analysis_p(analysis)) {
					return handle_rf_recan_special(rf, analysis);
				} else if (NIL != unrecanonicalizable_analysis_p(analysis)) {
					return handle_unrecanonicalizable_rf(rf, analysis);
				}

				SubLSystemTrampolineFile.checkType(analysis, RECANONICALIZABLE_ANALYSIS_P);
				if (NIL == $assume_partial_orderP$.getDynamicValue(thread)) {
					if (NIL == recanonicalize_subrfs(rf)) {
						return handle_rf_recan_error(rf, $str_alt103$RF_contains_an_unrecanonicalizabl);
					}
				}
				recan_format(T, NIL != $recanonicalization_modifies_kbP$.getDynamicValue(thread) ? ((SubLObject) ($str_alt104$_____recanonicalizing___s___a)) : $str_alt105$_____pretending_to_recanonicalize, rf_id(rf), rf, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				archive_recanonicalized_rf(rf);
				{
					SubLObject error_message = NIL;
					SubLObject result = NIL;
					try {
						{
							SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
							try {
								Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
								try {
									if (NIL != nart_handles.nart_p(rf)) {
										result = recanonicalize_recan_nart(recan_rf);
									} else if (NIL != assertion_handles.assertion_p(rf)) {
										result = recanonicalize_recan_assertion(recan_rf);
									}

								} catch (Throwable catch_var) {
									Errors.handleThrowable(catch_var, NIL);
								}
							} finally {
								Errors.$error_handler$.rebind(_prev_bind_0, thread);
							}
						}
					} catch (Throwable ccatch_env_var) {
						error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
					}
					if (NIL != error_message) {
						return handle_rf_recan_error(rf, error_message);
					} else if ($SUCCESS == result) {
						if (NIL != $recording_recan_statsP$.getDynamicValue(thread)) {
							$success_rf_analysis_pairs$.setGlobalValue(cons(list(rf, analysis), $success_rf_analysis_pairs$.getGlobalValue()));
						}
						recan_format(T, $str_alt107$__success_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						mark_rf_as_canonical(rf);
						return result;
					} else if ($UNKNOWN == result) {
						return handle_rf_recan_error(rf, format(NIL, $str_alt108$unable_to_recanonicalize__a_becau, new SubLObject[] { rf, analysis, explain_recan_analysis(analysis) }));
					} else {
						return handle_rf_recan_error(rf, result);
					}

				}
			}
		}
	}

	/**
	 *
	 *
	 * @return boolean; whether recanonicalization of all subrfs of RF succeeded.
	 * @unknown reifies new narts if it can't find existing ones (does not assert anything, though)
	 */
	public static final SubLObject recanonicalize_subrfs(SubLObject rf) {
		{
			SubLObject cdolist_list_var = not_ordering_rf_narts(rf, NIL);
			SubLObject subnart = NIL;
			for (subnart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), subnart = cdolist_list_var.first()) {
				if ($SUCCESS != recanonicalize_rf(subnart, UNPROVIDED)) {
					return NIL;
				}
			}
		}
		{
			SubLObject cdolist_list_var = not_ordering_rf_assertions(rf, NIL);
			SubLObject sub_assertion = NIL;
			for (sub_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sub_assertion = cdolist_list_var.first()) {
				if ($SUCCESS != recanonicalize_rf(sub_assertion, UNPROVIDED)) {
					return NIL;
				}
			}
		}
		return T;
	}

	/**
	 *
	 *
	 * @return boolean; whether recanonicalization of all super-rfs of RF (rfs that reference RF) succeeded.
	 */
	public static final SubLObject recanonicalize_super_rfs(SubLObject rf) {
		{
			SubLObject cdolist_list_var = super_rfs(rf);
			SubLObject super_rf = NIL;
			for (super_rf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), super_rf = cdolist_list_var.first()) {
				if ($SUCCESS != recanonicalize_rf(super_rf, UNPROVIDED)) {
					return NIL;
				}
			}
		}
		return T;
	}

	/**
	 *
	 *
	 * @return string; the error message (either ERROR or an explanation of it, if it's an analysis error keyword).
	 */
	public static final SubLObject handle_rf_recan_error(SubLObject rf, SubLObject error) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != $recording_recan_statsP$.getDynamicValue(thread)) {
				$error_rf_analysis_pairs$.setGlobalValue(cons(list(rf, error), $error_rf_analysis_pairs$.getGlobalValue()));
			}
			if (NIL != recan_error_analysis_p(error)) {
				error = explain_recan_analysis(error);
			} else if (!error.isString()) {
				error = string_utilities.object_to_string(error);
			}

			return recan_format(T, $str_alt109$_____error___s___a___a, rf_id(rf), rf, error, UNPROVIDED, UNPROVIDED);
		}
	}

	public static final SubLObject handle_unrecanonicalizable_rf(SubLObject rf, SubLObject analysis) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != $recording_recan_statsP$.getDynamicValue(thread)) {
				$unrecan_rf_analysis_pairs$.setGlobalValue(cons(list(rf, analysis), $unrecan_rf_analysis_pairs$.getGlobalValue()));
			}
			return recan_format(T, $str_alt110$_____unrecanonicalizable___s___a_, rf_id(rf), rf, explain_recan_analysis(analysis), UNPROVIDED, UNPROVIDED);
		}
	}

	public static final SubLObject handle_rf_recan_special(SubLObject rf, SubLObject special) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject pcase_var = special;
				if (pcase_var.eql($META_PROBLEM)) {
					if (NIL != $pushing_meta_problems_to_endP$.getDynamicValue(thread)) {
						$meta_problem_rfs$.setGlobalValue(cons(rf, $meta_problem_rfs$.getGlobalValue()));
						return recan_format(T, $str_alt111$_____wait___s___a___a, rf_id(rf), rf, $str_alt112$_meta_assertion_lookup_failure_, UNPROVIDED, UNPROVIDED);
					} else {
						handle_rf_recan_error(rf, special);
					}
				}
			}
			return handle_rf_recan_error(rf, format(NIL, $str_alt113$Unexpected_special_analysis__s, special));
		}
	}

	public static final SubLObject note_fail_recan_rf(SubLObject rf) {
		return NIL;
	}

	public static final SubLObject exile_canon_misfit_rf(SubLObject rf) {
		$exiled_rfs$.setGlobalValue(cons(rf_formula(rf), $exiled_rfs$.getGlobalValue()));
		if (NIL != nart_handles.nart_p(rf)) {
			fi.fi_kill_int(rf);
		} else if (NIL != assertion_handles.assertion_p(rf)) {
			fi.fi_unassert_int(assertions_high.assertion_formula(rf), assertions_high.assertion_mt(rf));
		}

		return NIL;
	}

	/**
	 * Recanonicalizes RECAN-NART without killing it, without perturbing any TMS or meta-information.
	 *
	 * @return :success if recanonicalization of RECAN-NART succeeds,
	an error message if recanonicalization of RECAN-NART fails.
	 */
	public static final SubLObject recanonicalize_recan_nart(SubLObject recan_nart) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject nart = recan_rf_rf(recan_nart);
				SubLObject analysis = recan_rf_analysis(recan_nart);
				SubLObject recan_info = recan_rf_recanonicalization(recan_nart);
				SubLObject new_formula = recan_info.first();
				SubLObject result = NIL;
				SubLSystemTrampolineFile.checkType(analysis, RECANONICALIZABLE_ANALYSIS_P);
				{
					SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
					try {
						Errors.$continue_cerrorP$.bind(T, thread);
						if (NIL != recanonicalizable_analysis_p(analysis)) {
							result = recanonicalize_easy_nart(nart, recan_info);
						} else {
							result = $UNKNOWN;
						}
					} finally {
						Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
					}
				}
				if ($SUCCESS == result) {
					recan_format(T, NIL != $recanonicalization_modifies_kbP$.getDynamicValue(thread) ? ((SubLObject) ($str_alt114$__result___a)) : $str_alt115$__intended_result___a, new_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				return result;
			}
		}
	}

	/**
	 *
	 *
	 * @return :success if recanonicalization of NART succeeds,
	an error message if recanonicalization of NART fails.
	 */
	public static final SubLObject recanonicalize_easy_nart(SubLObject nart, SubLObject recan_info) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = $SUCCESS;
				SubLObject new_formula = recan_info.first();
				SubLObject canonical_nart = NIL;
				if (NIL != $recanonicalization_modifies_kbP$.getDynamicValue(thread)) {
					{
						SubLObject _prev_bind_0 = czer_vars.$robust_assertion_lookup$.currentBinding(thread);
						try {
							czer_vars.$robust_assertion_lookup$.bind(NIL, thread);
							canonical_nart = narts_high.nart_lookup(new_formula);
						} finally {
							czer_vars.$robust_assertion_lookup$.rebind(_prev_bind_0, thread);
						}
					}
					result = (NIL != canonical_nart) ? ((SubLObject) (merge_uncanonical_nart(nart, canonical_nart))) : narts_low.reinstall_nart_hl_formula(nart, new_formula);
					if (T == result) {
						result = $SUCCESS;
					} else {
						result = format(NIL, $str_alt116$An_error_occurred_while_reinstall, result);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject recanonicalize_hard_nart(SubLObject nart, SubLObject recan_info) {
		return $str_alt117$Recanonicalization_of_hard_narts_;
	}

	public static final SubLObject recanonicalize_whack_nart(SubLObject nart, SubLObject recan_info) {
		return $str_alt118$Whacking_narts_is_not_supported_y;
	}

	/**
	 * UNCANONICAL-NART recanonicalizes to CANONICAL-NART, but they are different NARTs.
	 * Attempt to merge the uncanonical one onto the canonical one.
	 *
	 * @return boolean; t iff the merge succeeded (assumes success if not modifying KB)
	 */
	public static final SubLObject merge_uncanonical_nart(SubLObject uncanonical_nart, SubLObject canonical_nart) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == $recanonicalization_modifies_kbP$.getDynamicValue(thread)) {
				recan_format(T, $str_alt119$__intended_merge_onto___a, canonical_nart, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				return T;
			}
			recan_format(T, $str_alt120$__merging__a__onto__a, uncanonical_nart, canonical_nart, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			fi.fi_merge_int(uncanonical_nart, canonical_nart);
			if (NIL != nart_handles.valid_nartP(uncanonical_nart, UNPROVIDED)) {
				recan_format(T, $str_alt121$__merge_FAILED_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				$merge_failed_nart_pairs$.setGlobalValue(cons(list(uncanonical_nart, canonical_nart), $merge_failed_nart_pairs$.getGlobalValue()));
			} else {
				recan_format(T, $str_alt122$__merge_successful_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			return makeBoolean(NIL == nart_handles.valid_nartP(uncanonical_nart, UNPROVIDED));
		}
	}

	/**
	 *
	 *
	 * @return nart-hl-formula
	 */
	public static final SubLObject recanonicalize_term(SubLObject formula, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = mt_relevance_macros.$mt$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject new_canon_term = NIL;
				{
					SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
					SubLObject _prev_bind_1 = czer_vars.$controlP$.currentBinding(thread);
					SubLObject _prev_bind_2 = czer_vars.$control_1$.currentBinding(thread);
					SubLObject _prev_bind_3 = czer_vars.$control_2$.currentBinding(thread);
					SubLObject _prev_bind_4 = czer_vars.$control_3$.currentBinding(thread);
					SubLObject _prev_bind_5 = czer_vars.$control_4$.currentBinding(thread);
					SubLObject _prev_bind_6 = czer_vars.$control_5$.currentBinding(thread);
					SubLObject _prev_bind_7 = czer_vars.$control_6$.currentBinding(thread);
					SubLObject _prev_bind_8 = czer_vars.$recanonicalizingP$.currentBinding(thread);
					SubLObject _prev_bind_9 = czer_vars.$robust_assertion_lookup$.currentBinding(thread);
					SubLObject _prev_bind_10 = czer_vars.$robust_nart_lookup$.currentBinding(thread);
					try {
						control_vars.$within_assert$.bind(T, thread);
						czer_vars.$controlP$.bind(NIL, thread);
						czer_vars.$control_1$.bind(NIL, thread);
						czer_vars.$control_2$.bind(NIL, thread);
						czer_vars.$control_3$.bind(NIL, thread);
						czer_vars.$control_4$.bind(NIL, thread);
						czer_vars.$control_5$.bind(NIL, thread);
						czer_vars.$control_6$.bind(NIL, thread);
						czer_vars.$recanonicalizingP$.bind(T, thread);
						czer_vars.$robust_assertion_lookup$.bind($robust_assertion_lookup_during_recanonicalization$.getDynamicValue(thread), thread);
						czer_vars.$robust_nart_lookup$.bind($robust_nart_lookup_during_recanonicalization$.getDynamicValue(thread), thread);
						new_canon_term = czer_main.canonicalize_term(formula, mt);
					} finally {
						czer_vars.$robust_nart_lookup$.rebind(_prev_bind_10, thread);
						czer_vars.$robust_assertion_lookup$.rebind(_prev_bind_9, thread);
						czer_vars.$recanonicalizingP$.rebind(_prev_bind_8, thread);
						czer_vars.$control_6$.rebind(_prev_bind_7, thread);
						czer_vars.$control_5$.rebind(_prev_bind_6, thread);
						czer_vars.$control_4$.rebind(_prev_bind_5, thread);
						czer_vars.$control_3$.rebind(_prev_bind_4, thread);
						czer_vars.$control_2$.rebind(_prev_bind_3, thread);
						czer_vars.$control_1$.rebind(_prev_bind_2, thread);
						czer_vars.$controlP$.rebind(_prev_bind_1, thread);
						control_vars.$within_assert$.rebind(_prev_bind_0, thread);
					}
				}
				return NIL != nart_handles.nart_p(new_canon_term) ? ((SubLObject) (narts_high.nart_hl_formula(new_canon_term))) : new_canon_term;
			}
		}
	}

	/**
	 * Recanonicalizes RECAN-ASSERTION without killing it, without perturbing any TMS or meta-information.
	 *
	 * @return :success if recanonicalization of RECAN-ASSERTION succeeds,
	an error message if recanonicalization of RECAN-ASSERTION fails.
	 */
	public static final SubLObject recanonicalize_recan_assertion(SubLObject recan_assertion) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject assertion = recan_rf_rf(recan_assertion);
				SubLObject analysis = recan_rf_analysis(recan_assertion);
				SubLObject new_canon_info = recan_rf_recanonicalization(recan_assertion);
				SubLObject new_cnf = new_canon_info.first();
				SubLObject result = NIL;
				SubLSystemTrampolineFile.checkType(analysis, RECANONICALIZABLE_ANALYSIS_P);
				{
					SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
					try {
						Errors.$continue_cerrorP$.bind(T, thread);
						if (NIL != recanonicalizable_analysis_p(analysis)) {
							result = recanonicalize_easy_assertion(assertion, new_canon_info);
						} else {
							result = $UNKNOWN;
						}
					} finally {
						Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
					}
				}
				if ($SUCCESS == result) {
					recan_format(T, NIL != $recanonicalization_modifies_kbP$.getDynamicValue(thread) ? ((SubLObject) ($str_alt114$__result___a)) : $str_alt115$__intended_result___a, new_cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				return result;
			}
		}
	}

	public static final SubLObject recanonicalize_easy_assertion(SubLObject assertion, SubLObject recan_info) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject new_cnf = recan_info.first();
				SubLObject new_var_names = second(recan_info);
				SubLObject result = $SUCCESS;
				if (NIL != $recanonicalization_modifies_kbP$.getDynamicValue(thread)) {
					result = assertions_interface.kb_set_assertion_variable_names(assertion, new_var_names);
					if (T == result) {
						{
							SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
							try {
								Errors.$continue_cerrorP$.bind(T, thread);
								result = assertions_low.reconnect_assertion(assertion, new_cnf);
							} finally {
								Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
							}
						}
					}
					if (T == result) {
						result = $SUCCESS;
					} else {
						result = format(NIL, $str_alt123$An_error_occurred_while_resetting, result);
					}
				}
				return result;
			}
		}
	}

	/**
	 * Unasserts and reasserts ASSERTION.
	 * This will destroy any meta-assertions about this assertion,
	 * remove it as a support for any other assertion, and remove its dependents if they have no other arguments.
	 *
	 * @return boolean; t iff both the unassert and reassert were successful.
	 */
	public static final SubLObject unassert_and_reassert_assertion(SubLObject assertion) {
		{
			SubLObject mt = assertions_high.assertion_mt(assertion);
			SubLObject formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
			SubLObject strength = assertions_high.assertion_strength(assertion);
			SubLObject direction = assertions_high.assertion_direction(assertion);
			return makeBoolean((NIL != fi.fi_unassert_int(formula, mt)) && (NIL != fi.fi_assert_int(formula, mt, strength, direction)));
		}
	}

	public static final SubLObject merge_uncanonical_assertion(SubLObject uncanonical_assertion, SubLObject canonical_assertion) {
		return NIL;
	}

	public static final SubLObject recanonicalize_cycl(SubLObject formula, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = mt_relevance_macros.$mt$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject new_canon_versions = NIL;
				{
					SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
					SubLObject _prev_bind_1 = czer_vars.$controlP$.currentBinding(thread);
					SubLObject _prev_bind_2 = czer_vars.$control_1$.currentBinding(thread);
					SubLObject _prev_bind_3 = czer_vars.$control_2$.currentBinding(thread);
					SubLObject _prev_bind_4 = czer_vars.$control_3$.currentBinding(thread);
					SubLObject _prev_bind_5 = czer_vars.$control_4$.currentBinding(thread);
					SubLObject _prev_bind_6 = czer_vars.$control_5$.currentBinding(thread);
					SubLObject _prev_bind_7 = czer_vars.$control_6$.currentBinding(thread);
					SubLObject _prev_bind_8 = czer_vars.$recanonicalizingP$.currentBinding(thread);
					SubLObject _prev_bind_9 = czer_vars.$robust_assertion_lookup$.currentBinding(thread);
					SubLObject _prev_bind_10 = czer_vars.$robust_nart_lookup$.currentBinding(thread);
					SubLObject _prev_bind_11 = control_vars.$within_assert$.currentBinding(thread);
					SubLObject _prev_bind_12 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
					SubLObject _prev_bind_13 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
					SubLObject _prev_bind_14 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
					SubLObject _prev_bind_15 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
					SubLObject _prev_bind_16 = wff_utilities.$check_var_typesP$.currentBinding(thread);
					SubLObject _prev_bind_17 = czer_vars.$simplify_literalP$.currentBinding(thread);
					SubLObject _prev_bind_18 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
					SubLObject _prev_bind_19 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
					SubLObject _prev_bind_20 = wff_vars.$validate_constantsP$.currentBinding(thread);
					SubLObject _prev_bind_21 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
					try {
						control_vars.$within_assert$.bind(T, thread);
						czer_vars.$controlP$.bind(NIL, thread);
						czer_vars.$control_1$.bind(NIL, thread);
						czer_vars.$control_2$.bind(NIL, thread);
						czer_vars.$control_3$.bind(NIL, thread);
						czer_vars.$control_4$.bind(NIL, thread);
						czer_vars.$control_5$.bind(NIL, thread);
						czer_vars.$control_6$.bind(NIL, thread);
						czer_vars.$recanonicalizingP$.bind(T, thread);
						czer_vars.$robust_assertion_lookup$.bind($robust_assertion_lookup_during_recanonicalization$.getDynamicValue(thread), thread);
						czer_vars.$robust_nart_lookup$.bind($robust_nart_lookup_during_recanonicalization$.getDynamicValue(thread), thread);
						control_vars.$within_assert$.bind(NIL, thread);
						wff_utilities.$check_arg_typesP$.bind(NIL, thread);
						at_vars.$at_check_arg_typesP$.bind(NIL, thread);
						wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
						wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
						wff_utilities.$check_var_typesP$.bind(NIL, thread);
						czer_vars.$simplify_literalP$.bind(NIL, thread);
						at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
						at_vars.$at_check_arg_formatP$.bind(NIL, thread);
						wff_vars.$validate_constantsP$.bind(NIL, thread);
						system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
						new_canon_versions = czer_main.canonicalize_cycl(formula, mt);
					} finally {
						system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_21, thread);
						wff_vars.$validate_constantsP$.rebind(_prev_bind_20, thread);
						at_vars.$at_check_arg_formatP$.rebind(_prev_bind_19, thread);
						at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_18, thread);
						czer_vars.$simplify_literalP$.rebind(_prev_bind_17, thread);
						wff_utilities.$check_var_typesP$.rebind(_prev_bind_16, thread);
						wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_15, thread);
						wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_14, thread);
						at_vars.$at_check_arg_typesP$.rebind(_prev_bind_13, thread);
						wff_utilities.$check_arg_typesP$.rebind(_prev_bind_12, thread);
						control_vars.$within_assert$.rebind(_prev_bind_11, thread);
						czer_vars.$robust_nart_lookup$.rebind(_prev_bind_10, thread);
						czer_vars.$robust_assertion_lookup$.rebind(_prev_bind_9, thread);
						czer_vars.$recanonicalizingP$.rebind(_prev_bind_8, thread);
						czer_vars.$control_6$.rebind(_prev_bind_7, thread);
						czer_vars.$control_5$.rebind(_prev_bind_6, thread);
						czer_vars.$control_4$.rebind(_prev_bind_5, thread);
						czer_vars.$control_3$.rebind(_prev_bind_4, thread);
						czer_vars.$control_2$.rebind(_prev_bind_3, thread);
						czer_vars.$control_1$.rebind(_prev_bind_2, thread);
						czer_vars.$controlP$.rebind(_prev_bind_1, thread);
						control_vars.$within_assert$.rebind(_prev_bind_0, thread);
					}
				}
				return new_canon_versions;
			}
		}
	}

	public static final SubLObject recanonicalize_skolems(SubLObject v_skolems, SubLObject traceP) {
		if (traceP == UNPROVIDED) {
			traceP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject n = ZERO_INTEGER;
				SubLObject max = length(v_skolems);
				SubLObject list_var = v_skolems;
				utilities_macros.$progress_note$.setDynamicValue($$$cdolist, thread);
				utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
				utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
				utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
				{
					SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
					SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
					SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
					SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
					try {
						utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
						utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
						utilities_macros.$within_noting_percent_progress$.bind(T, thread);
						utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
						utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
						{
							SubLObject csome_list_var = list_var;
							SubLObject skolem = NIL;
							for (skolem = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), skolem = csome_list_var.first()) {
								utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
								utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
								n = add(n, ONE_INTEGER);
								if (NIL != recanonicalize_skolemP(skolem)) {
									if (NIL != traceP) {
										terpri(UNPROVIDED);
										format(T, $str_alt125$______a_of__a___a, new SubLObject[] { n, max, skolem });
										print(kb_accessors.all_term_assertions(skolem, T), UNPROVIDED);
										print(kbi_fort.diagnose_constant(skolem), UNPROVIDED);
									}
									thread.resetMultipleValues();
									{
										SubLObject new_skolems = recanonicalize_skolem(skolem);
										SubLObject diagnostics = thread.secondMultipleValue();
										thread.resetMultipleValues();
										if (NIL != traceP) {
											{
												SubLObject cdolist_list_var = new_skolems;
												SubLObject new_skolem = NIL;
												for (new_skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), new_skolem = cdolist_list_var.first()) {
													print(new_skolem, UNPROVIDED);
													print(kb_accessors.all_term_assertions(new_skolem, T), UNPROVIDED);
												}
											}
											print(diagnostics, UNPROVIDED);
										}
									}
								} else {
									if (NIL != traceP) {
										format(T, $str_alt126$____not_recanonicalizable___a, skolem);
									}
								}
							}
						}
						utilities_macros.noting_percent_progress_postamble();
					} finally {
						utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
						utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
						utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
						utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject recanonicalize_skolemP(SubLObject skolem) {
		{
			SubLObject skipP = NIL;
			if (NIL == skipP) {
				{
					SubLObject csome_list_var = all_sibling_skolems(skolem);
					SubLObject sibling = NIL;
					for (sibling = csome_list_var.first(); !((NIL != skipP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), sibling = csome_list_var.first()) {
						skipP = makeBoolean(NIL == recanonicalize_skolem_intP(sibling));
					}
				}
			}
			return makeBoolean(NIL == skipP);
		}
	}

	public static final SubLObject recanonicalize_skolem_intP(SubLObject skolem) {
		{
			SubLObject assertions = skolems.skolem_defn_assertions(skolem, UNPROVIDED);
			if (NIL != assertions) {
				{
					SubLObject mt = assertions_high.assertion_mt(assertions.first());
					SubLObject why = assertions_high.asserted_why(assertions.first());
					SubLObject el = uncanonicalizer.assertion_el_formula(assertions.first());
					SubLObject skipP = NIL;
					if (NIL == skipP) {
						{
							SubLObject csome_list_var = assertions;
							SubLObject assertion = NIL;
							for (assertion = csome_list_var.first(); !((NIL != skipP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), assertion = csome_list_var.first()) {
								if (!((((((mt == assertions_high.assertion_mt(assertion)) && (why == assertions_high.asserted_why(assertion))) && (NIL == assertions_high.assertion_dependents(assertion))) && (NIL == assertions_high.deduced_assertionP(assertion))) && (NIL == assertions_high.meta_assertionP(assertion))) && el.equal(uncanonicalizer.assertion_el_formula(assertion)))) {
									skipP = T;
								}
							}
						}
					}
					return makeBoolean(NIL == skipP);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject recanonicalize_skolem(SubLObject skolem) {
		if (NIL != recanonicalize_skolemP(skolem)) {
			return recanonicalize_skolem_int(skolem);
		}
		return NIL;
	}

	public static final SubLObject recanonicalize_skolem_int(SubLObject skolem) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_skolems = all_sibling_skolems(skolem);
				SubLObject skolems_assertions = Mapping.mapcar(symbol_function(SKOLEM_DEFN_ASSERTIONS), v_skolems);
				SubLObject skolems_assertions_specs = Mapping.mapcar(symbol_function(ALL_ASSERTIONS_RECAN_SPECS), skolems_assertions);
				SubLObject master_when = skolems_assertions_specs_when(skolems_assertions_specs);
				SubLObject master_by = skolems_assertions_specs_by(skolems_assertions_specs, master_when);
				SubLObject new_assertions = NIL;
				SubLObject new_skolems = NIL;
				SubLObject diagnostics = NIL;
				if (NIL == subl_promotions.memberP(NIL, skolems_assertions_specs, UNPROVIDED, UNPROVIDED)) {
					Mapping.mapcar(symbol_function(FI_KILL_INT), v_skolems);
					{
						SubLObject cdolist_list_var = skolems_assertions_specs;
						SubLObject skolem_assertions_specs = NIL;
						for (skolem_assertions_specs = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), skolem_assertions_specs = cdolist_list_var.first()) {
							{
								SubLObject cdolist_list_var_10 = skolem_assertions_specs;
								SubLObject assertions_spec = NIL;
								for (assertions_spec = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest(), assertions_spec = cdolist_list_var_10.first()) {
									{
										SubLObject cdolist_list_var_11 = assertions_spec;
										SubLObject assertion_spec = NIL;
										for (assertion_spec = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest(), assertion_spec = cdolist_list_var_11.first()) {
											{
												SubLObject datum = assertion_spec;
												SubLObject current = datum;
												SubLObject el = NIL;
												SubLObject mt = NIL;
												SubLObject by = NIL;
												SubLObject when = NIL;
												SubLObject why = NIL;
												destructuring_bind_must_consp(current, datum, $list_alt130);
												el = current.first();
												current = current.rest();
												destructuring_bind_must_consp(current, datum, $list_alt130);
												mt = current.first();
												current = current.rest();
												destructuring_bind_must_consp(current, datum, $list_alt130);
												by = current.first();
												current = current.rest();
												destructuring_bind_must_consp(current, datum, $list_alt130);
												when = current.first();
												current = current.rest();
												destructuring_bind_must_consp(current, datum, $list_alt130);
												why = current.first();
												current = current.rest();
												if (NIL == current) {
													if (NIL == master_when) {
														master_when = when;
													}
													if (NIL == master_by) {
														master_by = by;
													}
													fi.fi_assert_int(el, mt, UNPROVIDED, UNPROVIDED);
													{
														SubLObject cdolist_list_var_12 = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
														SubLObject new_assertion = NIL;
														for (new_assertion = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest(), new_assertion = cdolist_list_var_12.first()) {
															{
																SubLObject item_var = new_assertion;
																if (NIL == member(item_var, new_assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
																	new_assertions = cons(item_var, new_assertions);
																}
															}
															{
																SubLObject cdolist_list_var_13 = skolems.assertion_skolems(new_assertion);
																SubLObject new_skolem = NIL;
																for (new_skolem = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest(), new_skolem = cdolist_list_var_13.first()) {
																	if (NIL == subl_promotions.memberP(new_skolem, new_skolems, UNPROVIDED, UNPROVIDED)) {
																		new_skolems = cons(new_skolem, new_skolems);
																		fi.retimestamp_constant(new_skolem, master_by, master_when, why, UNPROVIDED);
																	}
																}
															}
														}
													}
													fi.fi_timestamp_assertion_int(master_by, master_when, why, UNPROVIDED);
												} else {
													cdestructuring_bind_error(datum, $list_alt130);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject cdolist_list_var = new_skolems;
						SubLObject new_skolem = NIL;
						for (new_skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), new_skolem = cdolist_list_var.first()) {
							diagnostics = nunion(diagnostics, kbi_fort.diagnose_constant(new_skolem), UNPROVIDED, UNPROVIDED);
						}
					}
					{
						SubLObject cdolist_list_var = new_assertions;
						SubLObject new_assertion = NIL;
						for (new_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), new_assertion = cdolist_list_var.first()) {
							diagnostics = nunion(diagnostics, kbi_assertion.diagnose_assertion(new_assertion), UNPROVIDED, UNPROVIDED);
						}
					}
					return values(nreverse(new_skolems), nreverse(diagnostics));
				}
			}
			return NIL;
		}
	}

	public static final SubLObject skolems_assertions_specs_when(SubLObject skolems_assertions_specs) {
		{
			SubLObject master_when = NIL;
			SubLObject cdolist_list_var = skolems_assertions_specs;
			SubLObject skolem_assertions_specs = NIL;
			for (skolem_assertions_specs = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), skolem_assertions_specs = cdolist_list_var.first()) {
				{
					SubLObject cdolist_list_var_14 = skolem_assertions_specs;
					SubLObject assertions_spec = NIL;
					for (assertions_spec = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest(), assertions_spec = cdolist_list_var_14.first()) {
						{
							SubLObject cdolist_list_var_15 = assertions_spec;
							SubLObject assertion_spec = NIL;
							for (assertion_spec = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest(), assertion_spec = cdolist_list_var_15.first()) {
								{
									SubLObject datum = assertion_spec;
									SubLObject current = datum;
									SubLObject el = NIL;
									SubLObject mt = NIL;
									SubLObject by = NIL;
									SubLObject when = NIL;
									SubLObject why = NIL;
									destructuring_bind_must_consp(current, datum, $list_alt130);
									el = current.first();
									current = current.rest();
									destructuring_bind_must_consp(current, datum, $list_alt130);
									mt = current.first();
									current = current.rest();
									destructuring_bind_must_consp(current, datum, $list_alt130);
									by = current.first();
									current = current.rest();
									destructuring_bind_must_consp(current, datum, $list_alt130);
									when = current.first();
									current = current.rest();
									destructuring_bind_must_consp(current, datum, $list_alt130);
									why = current.first();
									current = current.rest();
									if (NIL == current) {
										if ((NIL == master_when) || master_when.numG(when)) {
											master_when = when;
										}
									} else {
										cdestructuring_bind_error(datum, $list_alt130);
									}
								}
							}
						}
					}
				}
			}
			return master_when;
		}
	}

	public static final SubLObject skolems_assertions_specs_by(SubLObject skolems_assertions_specs, SubLObject master_when) {
		{
			SubLObject master_by = NIL;
			SubLObject cdolist_list_var = skolems_assertions_specs;
			SubLObject skolem_assertions_specs = NIL;
			for (skolem_assertions_specs = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), skolem_assertions_specs = cdolist_list_var.first()) {
				{
					SubLObject cdolist_list_var_16 = skolem_assertions_specs;
					SubLObject assertions_spec = NIL;
					for (assertions_spec = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest(), assertions_spec = cdolist_list_var_16.first()) {
						{
							SubLObject cdolist_list_var_17 = assertions_spec;
							SubLObject assertion_spec = NIL;
							for (assertion_spec = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest(), assertion_spec = cdolist_list_var_17.first()) {
								{
									SubLObject datum = assertion_spec;
									SubLObject current = datum;
									SubLObject el = NIL;
									SubLObject mt = NIL;
									SubLObject by = NIL;
									SubLObject when = NIL;
									SubLObject why = NIL;
									destructuring_bind_must_consp(current, datum, $list_alt130);
									el = current.first();
									current = current.rest();
									destructuring_bind_must_consp(current, datum, $list_alt130);
									mt = current.first();
									current = current.rest();
									destructuring_bind_must_consp(current, datum, $list_alt130);
									by = current.first();
									current = current.rest();
									destructuring_bind_must_consp(current, datum, $list_alt130);
									when = current.first();
									current = current.rest();
									destructuring_bind_must_consp(current, datum, $list_alt130);
									why = current.first();
									current = current.rest();
									if (NIL == current) {
										if (master_when.eql(when)) {
											return by;
										} else {
											if (NIL == master_by) {
												master_by = by;
											}
										}
									} else {
										cdestructuring_bind_error(datum, $list_alt130);
									}
								}
							}
						}
					}
				}
			}
			return master_by;
		}
	}

	public static final SubLObject assertions_recan_specs(SubLObject assertions) {
		{
			SubLObject assertions_specs = NIL;
			SubLObject cdolist_list_var = assertions;
			SubLObject assertion = NIL;
			for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
				{
					SubLObject el = uncanonicalizer.assertion_el_formula(assertion);
					SubLObject mt = assertions_high.assertion_mt(assertion);
					SubLObject by = assertions_high.asserted_by(assertion);
					SubLObject when = assertions_high.asserted_when(assertion);
					SubLObject why = assertions_high.asserted_why(assertion);
					SubLObject item_var = list(el, mt, by, when, why);
					if (NIL == member(item_var, assertions_specs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
						assertions_specs = cons(item_var, assertions_specs);
					}
				}
			}
			return assertions_specs;
		}
	}

	public static final SubLObject all_assertions_recan_specs(SubLObject assertions) {
		if (NIL != assertions) {
			return cons(assertions_recan_specs(assertions), all_assertions_recan_specs(remove_duplicates(list_utilities.mapappend(symbol_function(ALL_TERM_ASSERTIONS), assertions), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
		}
		return NIL;
	}

	public static final SubLObject all_star_term_assertions(SubLObject v_term) {
		{
			SubLObject ata = kb_accessors.all_term_assertions(v_term, UNPROVIDED);
			return remove_duplicates(nconc(ata, all_star_terms_assertions(ata, ata)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
	}

	public static final SubLObject all_star_terms_assertions(SubLObject terms, SubLObject done) {
		if (done == UNPROVIDED) {
			done = NIL;
		}
		if (NIL != terms) {
			{
				SubLObject ata = list_utilities.mapappend(symbol_function(ALL_TERM_ASSERTIONS), terms);
				return remove_duplicates(nconc(ata, all_star_terms_assertions(set_difference(ata, done, UNPROVIDED, UNPROVIDED), append(ata, done))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		}
		return NIL;
	}

	public static final SubLObject sibling_skolems(SubLObject skolem) {
		return list_utilities.remove_duplicate_forts(list_utilities.mapappend(symbol_function(ASSERTION_SKOLEMS), all_star_term_assertions(skolem)));
	}

	public static final SubLObject all_sibling_skolems(SubLObject skolem) {
		return all_sibling_skolems_int(sibling_skolems(skolem), UNPROVIDED);
	}

	public static final SubLObject all_sibling_skolems_int(SubLObject v_skolems, SubLObject siblings) {
		if (siblings == UNPROVIDED) {
			siblings = NIL;
		}
		if (NIL != v_skolems) {
			{
				SubLObject new_siblings = list_utilities.mapappend(symbol_function(SIBLING_SKOLEMS), v_skolems);
				SubLObject old_siblings = append(v_skolems, siblings);
				SubLObject todo_siblings = set_difference(new_siblings, old_siblings, UNPROVIDED, UNPROVIDED);
				return list_utilities.remove_duplicate_forts(append(new_siblings, all_sibling_skolems_int(todo_siblings, old_siblings)));
			}
		}
		return NIL;
	}

	public static final SubLObject why_delta_assertionP(SubLObject assertion, SubLObject skip_touP, SubLObject printP) {
		if (skip_touP == UNPROVIDED) {
			skip_touP = T;
		}
		if (printP == UNPROVIDED) {
			printP = T;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == ke_tools.bogus_assertionP(assertion)) {
				{
					SubLObject mt = assertions_high.assertion_mt(assertion);
					SubLObject formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
					SubLObject strength = assertions_high.assertion_strength(assertion);
					SubLObject canon_versions = NIL;
					SubLObject why_not_wff = NIL;
					{
						SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
						try {
							control_vars.$within_assert$.bind(T, thread);
							canon_versions = czer_main.canonicalize_cycl(formula, mt);
							why_not_wff = wff.why_not_wff(formula, mt, UNPROVIDED);
						} finally {
							control_vars.$within_assert$.rebind(_prev_bind_0, thread);
						}
					}
					if (!((NIL != skip_touP) && (formula.first() == $$termOfUnit))) {
						{
							SubLObject old_cnf = assertions_high.assertion_cnf(assertion);
							SubLObject new_cnf = fi.fi_canonicalize(canon_versions.first(), T, strength);
							if (!old_cnf.equal(new_cnf)) {
								$mapping_qualifiers$.setDynamicValue(add($mapping_qualifiers$.getDynamicValue(thread), ONE_INTEGER), thread);
								if (NIL != why_not_wff) {
									if (NIL != printP) {
										format(T, $str_alt135$______s__s__s______s_____s_____s, new SubLObject[] { $mapping_hits$.getDynamicValue(thread), $mapping_qualifiers$.getDynamicValue(thread), utilities_macros.$progress_sofar$.getDynamicValue(thread), assertion, old_cnf, why_not_wff });
									}
								} else if (NIL != czer_utilities.ordered_cnf_unifyP(old_cnf, new_cnf)) {
									if (NIL != printP) {
										format(T, $str_alt136$______s__s__s______s_____s_____s_, new SubLObject[] { $mapping_hits$.getDynamicValue(thread), $mapping_qualifiers$.getDynamicValue(thread), utilities_macros.$progress_sofar$.getDynamicValue(thread), assertion, old_cnf, new_cnf, $str_alt137$_equivalent_under_variable_renami });
									}
								} else if (NIL != czer_utilities.cnfs_reorder_equalP(old_cnf, new_cnf, UNPROVIDED)) {
									if (NIL != printP) {
										format(T, $str_alt136$______s__s__s______s_____s_____s_, new SubLObject[] { $mapping_hits$.getDynamicValue(thread), $mapping_qualifiers$.getDynamicValue(thread), utilities_macros.$progress_sofar$.getDynamicValue(thread), assertion, old_cnf, new_cnf, $str_alt138$_equivalent_under_literal_term_re });
									}
								} else if (NIL != czer_utilities.cnfs_reorder_equalP(old_cnf, clauses.make_cnf(set_difference(clauses.neg_lits(new_cnf), el_utilities.tou_lits(clauses.neg_lits(new_cnf)), symbol_function(EQUAL), UNPROVIDED), clauses.pos_lits(new_cnf)), UNPROVIDED)) {
									if (NIL != printP) {
										format(T, $str_alt136$______s__s__s______s_____s_____s_, new SubLObject[] { $mapping_hits$.getDynamicValue(thread), $mapping_qualifiers$.getDynamicValue(thread), utilities_macros.$progress_sofar$.getDynamicValue(thread), assertion, old_cnf, new_cnf, $str_alt139$_equivalent_save_new_termOfUnit_n });
									}
								} else {
									$mapping_hits$.setDynamicValue(add($mapping_hits$.getDynamicValue(thread), ONE_INTEGER), thread);
									if (NIL != printP) {
										format(T, $str_alt135$______s__s__s______s_____s_____s, new SubLObject[] { $mapping_hits$.getDynamicValue(thread), $mapping_qualifiers$.getDynamicValue(thread), utilities_macros.$progress_sofar$.getDynamicValue(thread), assertion, old_cnf, new_cnf });
									}
								}

								return T;
							}
						}
					}
				}
			}
			return NIL;
		}
	}

	// defparameter
	private static final SubLSymbol $assertion_diagnoses_table$ = makeSymbol("*ASSERTION-DIAGNOSES-TABLE*");

	public static final SubLObject assess_diagnoses_of_assertions(SubLObject assertions) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject diagnoses = NIL;
				SubLObject cdolist_list_var = assertions;
				SubLObject assertion = NIL;
				for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
					{
						SubLObject assertion_diagnoses = diagnose_assertion_plus(assertion);
						sethash(assertion_handles.assertion_id(assertion), $assertion_diagnoses_table$.getDynamicValue(thread), assertion_diagnoses);
						{
							SubLObject cdolist_list_var_18 = assertion_diagnoses;
							SubLObject diagnosis = NIL;
							for (diagnosis = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest(), diagnosis = cdolist_list_var_18.first()) {
								{
									SubLObject item_var = diagnosis;
									if (NIL == member(item_var, diagnoses, symbol_function(EQL), symbol_function(IDENTITY))) {
										diagnoses = cons(item_var, diagnoses);
									}
								}
							}
						}
					}
				}
				return diagnoses;
			}
		}
	}

	public static final SubLObject reassess_diagnoses_of_assertions(SubLObject assertions) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject diagnoses = NIL;
				SubLObject cdolist_list_var = assertions;
				SubLObject assertion = NIL;
				for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
					{
						SubLObject v_new = diagnose_assertion_plus(assertion);
						SubLObject old = gethash(assertion_handles.assertion_id(assertion), $assertion_diagnoses_table$.getDynamicValue(thread), UNPROVIDED);
						SubLObject delta_in = set_difference(v_new, old, UNPROVIDED, UNPROVIDED);
						SubLObject delta_out = remove($ASSERTION_NOT_CANONICAL, set_difference(old, v_new, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						if (NIL != delta_in) {
							print(list($DELTA_IN, delta_in, assertion), UNPROVIDED);
						}
						if (NIL != delta_out) {
							print(list($DELTA_OUT, delta_out, assertion), UNPROVIDED);
						}
						{
							SubLObject cdolist_list_var_19 = v_new;
							SubLObject diagnosis = NIL;
							for (diagnosis = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest(), diagnosis = cdolist_list_var_19.first()) {
								{
									SubLObject item_var = diagnosis;
									if (NIL == member(item_var, diagnoses, symbol_function(EQL), symbol_function(IDENTITY))) {
										diagnoses = cons(item_var, diagnoses);
									}
								}
							}
						}
					}
				}
				return diagnoses;
			}
		}
	}

	public static final SubLObject diagnose_assertion_plus(SubLObject assertion) {
		{
			SubLObject diagnoses = kbi_assertion.diagnose_assertion(assertion);
			if (NIL != subl_promotions.memberP($DIAGNOSE_ASSERTION_AXIOM, diagnoses, UNPROVIDED, UNPROVIDED)) {
				diagnoses = append(remove($DIAGNOSE_ASSERTION_AXIOM, diagnoses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), kbi_axiom.diagnose_axiom(assertions_low.assertion_hl_cnf(assertion), UNPROVIDED));
			}
			return diagnoses;
		}
	}

	public static final SubLObject mark_rf_as_canonical(SubLObject rf) {
		if (!$canonical_rf_hash$.getGlobalValue().isHashtable()) {
			init_canonical_rf_hash();
		}
		sethash(rf_id(rf), $canonical_rf_hash$.getGlobalValue(), $CANONICAL);
		return rf;
	}

	public static final SubLObject rf_canonicalP(SubLObject rf) {
		if (!$canonical_rf_hash$.getGlobalValue().isHashtable()) {
			return NIL;
		}
		return eq($CANONICAL, gethash(rf_id(rf), $canonical_rf_hash$.getGlobalValue(), UNPROVIDED));
	}

	public static final SubLObject init_canonical_rf_hash() {
		$canonical_rf_hash$.setGlobalValue(make_hash_table($int$1000, symbol_function(EQUAL), UNPROVIDED));
		return NIL;
	}

	public static final SubLObject recanonicalization_archive_filename() {
		return Filesys.construct_filename($list_alt146, file_utilities.clean_filename(format(NIL, $str_alt147$kb__a_on__a, control_vars.kb_loaded(), numeric_date_utilities.datestring(UNPROVIDED))), $$$text, T);
	}

	public static final SubLObject archive_recanonicalized_assertion(SubLObject assertion) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if ($recan_archive_stream$.getDynamicValue(thread).isStream()) {
				format($recan_archive_stream$.getDynamicValue(thread), $str_alt149$__s__s_, fi.assertion_fi_formula(assertion, UNPROVIDED), assertions_high.assertion_mt(assertion));
			}
			return NIL;
		}
	}

	public static final SubLObject archive_recanonicalized_nart(SubLObject nart) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if ($recan_archive_stream$.getDynamicValue(thread).isStream()) {
				format($recan_archive_stream$.getDynamicValue(thread), $str_alt150$_s, narts_high.nart_hl_formula(nart));
			}
			return NIL;
		}
	}

	public static final SubLObject archive_assertions(SubLObject assertions, SubLObject filename) {
		if (filename == UNPROVIDED) {
			filename = kbi_utilities.kbi_filename($str_alt151$archived_assertions, UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject stream = NIL;
				try {
					stream = compatibility.open_text(filename, $OUTPUT, UNPROVIDED);
					{
						SubLObject list_var = assertions;
						utilities_macros.$progress_note$.setDynamicValue($$$archiving_assertions, thread);
						utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
						utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
						utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
						{
							SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
							SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
							SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
							SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
							try {
								utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
								utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
								utilities_macros.$within_noting_percent_progress$.bind(T, thread);
								utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
								utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
								{
									SubLObject csome_list_var = list_var;
									SubLObject assertion = NIL;
									for (assertion = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), assertion = csome_list_var.first()) {
										utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
										utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
										{
											SubLObject _prev_bind_0_20 = utilities_macros.$progress_total$.currentBinding(thread);
											SubLObject _prev_bind_1_21 = utilities_macros.$progress_sofar$.currentBinding(thread);
											try {
												utilities_macros.$progress_total$.bind(NIL, thread);
												utilities_macros.$progress_sofar$.bind(NIL, thread);
												print(list(fi.assertion_fi_formula(assertion, UNPROVIDED), assertions_high.assertion_mt(assertion)), stream);
											} finally {
												utilities_macros.$progress_sofar$.rebind(_prev_bind_1_21, thread);
												utilities_macros.$progress_total$.rebind(_prev_bind_0_20, thread);
											}
										}
									}
								}
								utilities_macros.noting_percent_progress_postamble();
							} finally {
								utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
								utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
								utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
								utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
							}
						}
					}
				} finally {
					{
						SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							if (NIL != stream) {
								close(stream, UNPROVIDED);
							}
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
						}
					}
				}
			}
			return filename;
		}
	}

	public static final SubLObject unarchive_assertions(SubLObject filename) {
		if (filename == UNPROVIDED) {
			filename = kbi_utilities.kbi_filename($str_alt151$archived_assertions, UNPROVIDED);
		}
		{
			SubLObject stream = NIL;
			try {
				stream = compatibility.open_text(filename, $INPUT, UNPROVIDED);
				{
					SubLObject assertion_spec = NIL;
					for (assertion_spec = read_ignoring_errors(stream, NIL, $EOF); assertion_spec != $EOF; assertion_spec = read_ignoring_errors(stream, NIL, $EOF)) {
						if (NIL != list_utilities.doubletonP(assertion_spec)) {
							{
								SubLObject formula = assertion_spec.first();
								SubLObject mt = second(assertion_spec);
								SubLObject assertion = fi.fi_lookup_int(formula, mt);
								if (NIL != term.kb_assertionP(assertion)) {
									$unarchived_assertions$.setGlobalValue(cons(assertion, $unarchived_assertions$.getGlobalValue()));
								} else {
									$awol_unarchived_assertions$.setGlobalValue(cons(assertion, $awol_unarchived_assertions$.getGlobalValue()));
								}
							}
						} else {
							format(T, $str_alt155$__invalid_assertion_spec___s, assertion_spec);
						}
					}
				}
			} finally {
				{
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
						bind($is_thread_performing_cleanupP$, T);
						if (NIL != stream) {
							close(stream, UNPROVIDED);
						}
					} finally {
						rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
		}
		return length($unarchived_assertions$.getGlobalValue());
	}

	public static final SubLObject archive_assertions_tl(SubLObject assertions, SubLObject filename) {
		if (filename == UNPROVIDED) {
			filename = kbi_utilities.kbi_filename($str_alt156$archived_assertions_tl, UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject stream = NIL;
				try {
					stream = compatibility.open_text(filename, $OUTPUT, UNPROVIDED);
					{
						SubLObject list_var = assertions;
						utilities_macros.$progress_note$.setDynamicValue($$$archiving_assertions, thread);
						utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
						utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
						utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
						{
							SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
							SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
							SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
							SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
							try {
								utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
								utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
								utilities_macros.$within_noting_percent_progress$.bind(T, thread);
								utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
								utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
								{
									SubLObject csome_list_var = list_var;
									SubLObject assertion = NIL;
									for (assertion = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), assertion = csome_list_var.first()) {
										utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
										utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
										{
											SubLObject _prev_bind_0_22 = utilities_macros.$progress_total$.currentBinding(thread);
											SubLObject _prev_bind_1_23 = utilities_macros.$progress_sofar$.currentBinding(thread);
											try {
												utilities_macros.$progress_total$.bind(NIL, thread);
												utilities_macros.$progress_sofar$.bind(NIL, thread);
												print(list(canon_tl.assertion_tl_formula(assertion), canon_tl.hl_term_to_tl(assertions_high.assertion_mt(assertion))), stream);
											} finally {
												utilities_macros.$progress_sofar$.rebind(_prev_bind_1_23, thread);
												utilities_macros.$progress_total$.rebind(_prev_bind_0_22, thread);
											}
										}
									}
								}
								utilities_macros.noting_percent_progress_postamble();
							} finally {
								utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
								utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
								utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
								utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
							}
						}
					}
				} finally {
					{
						SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							if (NIL != stream) {
								close(stream, UNPROVIDED);
							}
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
						}
					}
				}
			}
			return filename;
		}
	}

	public static final SubLObject unarchive_assertions_tl(SubLObject filename) {
		if (filename == UNPROVIDED) {
			filename = kbi_utilities.kbi_filename($str_alt156$archived_assertions_tl, UNPROVIDED);
		}
		{
			SubLObject stream = NIL;
			try {
				stream = compatibility.open_text(filename, $INPUT, UNPROVIDED);
				{
					SubLObject assertion_spec = NIL;
					for (assertion_spec = read_ignoring_errors(stream, NIL, $EOF); assertion_spec != $EOF; assertion_spec = read_ignoring_errors(stream, NIL, $EOF)) {
						if (NIL != list_utilities.doubletonP(assertion_spec)) {
							{
								SubLObject formula = assertion_spec.first();
								SubLObject mt = canon_tl.tl_term_to_hl(second(assertion_spec));
								SubLObject assertion = canon_tl.find_assertion_from_tl_formula(formula, mt);
								if (NIL != term.kb_assertionP(assertion)) {
									$unarchived_assertions$.setGlobalValue(cons(assertion, $unarchived_assertions$.getGlobalValue()));
								} else {
									$awol_unarchived_assertions$.setGlobalValue(cons(assertion_spec, $awol_unarchived_assertions$.getGlobalValue()));
								}
							}
						} else {
							format(T, $str_alt155$__invalid_assertion_spec___s, assertion_spec);
						}
					}
				}
			} finally {
				{
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
						bind($is_thread_performing_cleanupP$, T);
						if (NIL != stream) {
							close(stream, UNPROVIDED);
						}
					} finally {
						rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
		}
		return length($unarchived_assertions$.getGlobalValue());
	}

	public static final SubLObject archive_assertions_ids(SubLObject assertions, SubLObject filename) {
		if (filename == UNPROVIDED) {
			filename = kbi_utilities.kbi_filename($str_alt157$archived_assertion_ids, UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject stream = NIL;
				try {
					stream = compatibility.open_text(filename, $OUTPUT, UNPROVIDED);
					{
						SubLObject list_var = assertions;
						utilities_macros.$progress_note$.setDynamicValue($$$archiving_assertion_ids, thread);
						utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
						utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
						utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
						{
							SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
							SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
							SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
							SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
							try {
								utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
								utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
								utilities_macros.$within_noting_percent_progress$.bind(T, thread);
								utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
								utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
								{
									SubLObject csome_list_var = list_var;
									SubLObject assertion = NIL;
									for (assertion = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), assertion = csome_list_var.first()) {
										utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
										utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
										print(assertion_handles.assertion_id(assertion), stream);
									}
								}
								utilities_macros.noting_percent_progress_postamble();
							} finally {
								utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
								utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
								utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
								utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
							}
						}
					}
				} finally {
					{
						SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							if (NIL != stream) {
								close(stream, UNPROVIDED);
							}
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
						}
					}
				}
			}
			return filename;
		}
	}

	public static final SubLObject unarchive_assertion_ids(SubLObject filename) {
		if (filename == UNPROVIDED) {
			filename = kbi_utilities.kbi_filename($str_alt159$mapping_results_ids, UNPROVIDED);
		}
		{
			SubLObject stream = NIL;
			try {
				stream = compatibility.open_text(filename, $INPUT, UNPROVIDED);
				{
					SubLObject id = NIL;
					for (id = read_ignoring_errors(stream, NIL, $EOF); id != $EOF; id = read_ignoring_errors(stream, NIL, $EOF)) {
						if (id.isInteger()) {
							{
								SubLObject assertion = assertion_handles.find_assertion_by_id(id);
								if (NIL != term.kb_assertionP(assertion)) {
									$unarchived_assertions$.setGlobalValue(cons(assertion, $unarchived_assertions$.getGlobalValue()));
								} else {
									format(T, $str_alt160$__no_assertion_for_id___s, id);
								}
							}
						} else {
							format(T, $str_alt161$__invalid_assertion_id___s, id);
						}
					}
				}
			} finally {
				{
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
						bind($is_thread_performing_cleanupP$, T);
						if (NIL != stream) {
							close(stream, UNPROVIDED);
						}
					} finally {
						rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
		}
		return length($unarchived_assertions$.getGlobalValue());
	}

	public static final SubLObject rf_p(SubLObject v_object) {
		return cycl_utilities.reified_formula_p(v_object);
	}

	public static final SubLObject rf_type(SubLObject rf) {
		if (NIL != nart_handles.nart_p(rf)) {
			return $NART;
		} else if (NIL != assertion_handles.assertion_p(rf)) {
			return $ASSERTION;
		}

		return NIL;
	}

	public static final SubLObject rf_raw_id(SubLObject rf) {
		if (NIL != nart_handles.nart_p(rf)) {
			return nart_handles.nart_id(rf);
		} else if (NIL != assertion_handles.assertion_p(rf)) {
			return assertion_handles.assertion_id(rf);
		}

		return NIL;
	}

	public static final SubLObject rf_id(SubLObject rf) {
		return cons(rf_type(rf), rf_raw_id(rf));
	}

	public static final SubLObject find_rf_by_id(SubLObject rf_id) {
		{
			SubLObject type = rf_id.first();
			SubLObject raw_id = rf_id.rest();
			if (raw_id.isInteger()) {
				{
					SubLObject pcase_var = type;
					if (pcase_var.eql($NART)) {
						return nart_handles.find_nart_by_id(raw_id);
					} else if (pcase_var.eql($ASSERTION)) {
						return assertion_handles.find_assertion_by_id(raw_id);
					}

				}
			}
		}
		return NIL;
	}

	public static final SubLObject find_rf(SubLObject formula) {
		{
			SubLObject nart = narts_high.find_nart(formula);
			return NIL != nart ? ((SubLObject) (nart)) : czer_meta.find_assertion_cycl(formula, UNPROVIDED);
		}
	}

	public static final SubLObject robustly_find_rf(SubLObject formula) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = czer_vars.$robust_assertion_lookup$.currentBinding(thread);
					SubLObject _prev_bind_1 = czer_vars.$robust_nart_lookup$.currentBinding(thread);
					try {
						czer_vars.$robust_assertion_lookup$.bind(T, thread);
						czer_vars.$robust_nart_lookup$.bind(T, thread);
						{
							SubLObject nart = czer_utilities.el_find_nart(formula);
							result = (NIL != nart) ? ((SubLObject) (nart)) : czer_meta.find_assertion_cycl(formula, UNPROVIDED);
						}
					} finally {
						czer_vars.$robust_nart_lookup$.rebind(_prev_bind_1, thread);
						czer_vars.$robust_assertion_lookup$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject rf_formula(SubLObject rf) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != nart_handles.nart_p(rf)) {
				return funcall(czer_vars.$nart_key$.getDynamicValue(thread), rf);
			} else if (NIL != assertion_handles.assertion_p(rf)) {
				return funcall(czer_vars.$assertion_key$.getDynamicValue(thread), rf);
			}

			return NIL;
		}
	}

	public static final SubLObject rf_expand(SubLObject rf) {
		if (NIL != nart_handles.nart_p(rf)) {
			return narts_high.nart_expand(rf);
		} else if (NIL != assertion_handles.assertion_p(rf)) {
			return fi.assertion_expand(rf);
		}

		return NIL;
	}

	/**
	 *
	 *
	 * @return list; a list of the narts mentioned in RF without duplicates but in no particular order.
	Recurses into subnarts and sub-assertions if PENETRATE-HL-STRUCTURES is true.
	 */
	public static final SubLObject rf_narts(SubLObject rf, SubLObject penetrate_hl_structuresP) {
		if (penetrate_hl_structuresP == UNPROVIDED) {
			penetrate_hl_structuresP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return cycl_utilities.formula_narts(funcall(czer_vars.$rf_key$.getDynamicValue(thread), rf), penetrate_hl_structuresP, UNPROVIDED);
		}
	}

	/**
	 *
	 *
	 * @return list; a list of the assertions mentioned in RF without duplicates but in no particular order.
	Recurses into subnarts and sub-assertions if PENETRATE-HL-STRUCTURES is true.
	 */
	public static final SubLObject rf_assertions(SubLObject rf, SubLObject penetrate_hl_structuresP) {
		if (penetrate_hl_structuresP == UNPROVIDED) {
			penetrate_hl_structuresP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return fi.sentence_assertions(funcall(czer_vars.$rf_key$.getDynamicValue(thread), rf), penetrate_hl_structuresP);
		}
	}

	/**
	 *
	 *
	 * @return boolean; t iff RF is syntactically well-formed.
	 */
	public static final SubLObject wf_rf_syntaxP(SubLObject rf) {
		if (NIL != nart_handles.nart_p(rf)) {
			return term.first_order_termP(narts_high.nart_hl_formula(rf));
		} else if (NIL != assertion_handles.assertion_p(rf)) {
			return el_grammar.el_sentence_p(fi.assertion_fi_formula(rf, UNPROVIDED));
		}

		return NIL;
	}

	public static final SubLObject valid_rfP(SubLObject rf) {
		if (NIL != nart_handles.nart_p(rf)) {
			return nart_handles.valid_nartP(rf, UNPROVIDED);
		} else if (NIL != assertion_handles.assertion_p(rf)) {
			return assertions_high.valid_assertion(rf, UNPROVIDED);
		}

		return NIL;
	}

	public static final SubLObject archive_recanonicalized_rf(SubLObject rf) {
		if (NIL != nart_handles.nart_p(rf)) {
			return archive_recanonicalized_nart(rf);
		} else if (NIL != assertion_handles.assertion_p(rf)) {
			return archive_recanonicalized_assertion(rf);
		}

		return NIL;
	}

	public static final SubLObject all_rfs() {
		return nconc(kb_utilities.all_narts(), kb_utilities.all_assertions());
	}

	public static final SubLObject unreify_rfs(SubLObject formula) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return transform_list_utilities.transform(formula, symbol_function(RF_P), czer_vars.$rf_key$.getDynamicValue(thread), UNPROVIDED);
		}
	}

	public static final SubLObject rf_count() {
		return add(nart_handles.nart_count(), assertion_handles.assertion_count());
	}

	/**
	 * Partially orders RFs, but adds the closure under subrf to the list RFS.
	 */
	public static final SubLObject partially_order_rfs_closure(SubLObject rfs) {
		return partially_order_rfs(rfs_closure(rfs));
	}

	/**
	 *
	 *
	 * @return list; RFS plus all the transitive subrfs of all rfs in RFS.
	 */
	public static final SubLObject rfs_closure(SubLObject rfs) {
		{
			SubLObject more_rfs = NIL;
			SubLObject cdolist_list_var = rfs;
			SubLObject rf = NIL;
			for (rf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rf = cdolist_list_var.first()) {
				more_rfs = cons(rf, more_rfs);
				{
					SubLObject subrfs = subrfs(rf, T);
					if (NIL != subrfs) {
						more_rfs = nconc(subrfs, more_rfs);
					}
				}
			}
			return more_rfs;
		}
	}

	public static final SubLObject inclusive_subrfs(SubLObject rf) {
		return cons(rf, subrfs(rf, T));
	}

	public static final SubLObject partially_order_rfs(SubLObject rfs) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject rfs_with_unknown_unreified_sub_assertions = NIL;
				SubLObject rfs_without_unknown_unreified_sub_assertions = NIL;
				SubLObject list_var = rfs;
				utilities_macros.$progress_note$.setDynamicValue($str_alt164$building_explicit_and_implicit_su, thread);
				utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
				utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
				utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
				{
					SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
					SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
					SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
					SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
					try {
						utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
						utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
						utilities_macros.$within_noting_percent_progress$.bind(T, thread);
						utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
						utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
						{
							SubLObject csome_list_var = list_var;
							SubLObject rf = NIL;
							for (rf = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), rf = csome_list_var.first()) {
								utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
								utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
								thread.resetMultipleValues();
								{
									SubLObject subrfs = ordering_subrfs_penetrating_cached(rf);
									SubLObject unknown_sub_assertionsP = thread.secondMultipleValue();
									thread.resetMultipleValues();
									if (NIL != unknown_sub_assertionsP) {
										rfs_with_unknown_unreified_sub_assertions = cons(rf, rfs_with_unknown_unreified_sub_assertions);
									} else {
										rfs_without_unknown_unreified_sub_assertions = cons(rf, rfs_without_unknown_unreified_sub_assertions);
									}
								}
							}
						}
						utilities_macros.noting_percent_progress_postamble();
					} finally {
						utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
						utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
						utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
						utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
					}
				}
				return nconc(partially_order_rfs_int(rfs_without_unknown_unreified_sub_assertions), partially_order_rfs_int(rfs_with_unknown_unreified_sub_assertions));
			}
		}
	}

	public static final SubLObject partially_order_rfs_int(SubLObject rfs) {
		{
			SubLObject ordered_rf_hash = make_hash_table(length(rfs), symbol_function(EQ), UNPROVIDED);
			SubLObject first_timeP = T;
			SubLObject result = NIL;
			SubLObject leftovers = NIL;
			SubLObject new_ordered_rfs = NIL;
			SubLObject unordered_rfs = NIL;
			SubLObject ordered_rfs = NIL;
			for (unordered_rfs = rfs, ordered_rfs = NIL; !((NIL == first_timeP) && (NIL == new_ordered_rfs)); unordered_rfs = hash_table_utilities.hash_existence_difference(hash_table_utilities.hash_list_elements(unordered_rfs, UNPROVIDED, UNPROVIDED, UNPROVIDED), ordered_rf_hash), ordered_rfs = nconc(ordered_rfs, new_ordered_rfs)) {
				new_ordered_rfs = rfs_with_no_subrfs_except(unordered_rfs, NIL != first_timeP ? ((SubLObject) (NIL)) : ordered_rf_hash);
				{
					SubLObject cdolist_list_var = new_ordered_rfs;
					SubLObject new_rf = NIL;
					for (new_rf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), new_rf = cdolist_list_var.first()) {
						sethash(new_rf, ordered_rf_hash, T);
					}
				}
				first_timeP = NIL;
			}
			result = ordered_rfs;
			leftovers = unordered_rfs;
			if (NIL != leftovers) {
				Errors.cerror($str_alt165$Risk_rf_mutual_dependency_conflic, $str_alt166$Could_not_order_the_rfs__A, leftovers);
			}
			return result;
		}
	}

	/**
	 * Returns all rfs in the list RFS which have no subrfs (or subsubrfs, etc) except maybe some subrfs in the hash EXCEPTION-HASH.
	 * Maintains the order of RFS.
	 */
	public static final SubLObject rfs_with_no_subrfs_except(SubLObject rfs, SubLObject exception_hash) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				SubLObject list_var = rfs;
				utilities_macros.$progress_note$.setDynamicValue($str_alt167$iteratively_partially_ordering_rf, thread);
				utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
				utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
				utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
				{
					SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
					SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
					SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
					SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
					try {
						utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
						utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
						utilities_macros.$within_noting_percent_progress$.bind(T, thread);
						utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
						utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
						{
							SubLObject csome_list_var = list_var;
							SubLObject rf = NIL;
							for (rf = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), rf = csome_list_var.first()) {
								utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
								utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
								{
									SubLObject subrfs = ordering_subrfs_penetrating_cached(rf);
									if ((NIL == subrfs) || (NIL != (NIL != exception_hash ? ((SubLObject) (hash_table_utilities.all_elements_in_hashP(subrfs, exception_hash))) : NIL))) {
										result = cons(rf, result);
									}
								}
							}
						}
						utilities_macros.noting_percent_progress_postamble();
					} finally {
						utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
						utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
						utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
						utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
					}
				}
				return nreverse(result);
			}
		}
	}

	public static final SubLObject partially_order_rfs_with_unreified_subrfs(SubLObject rfs) {
		return rfs;
	}

	public static final SubLObject subrfs(SubLObject rf, SubLObject penetrate_hl_structuresP) {
		{
			SubLObject formula = rf_formula(rf);
			return nconc(cycl_utilities.formula_narts(formula, penetrate_hl_structuresP, UNPROVIDED), cycl_utilities.formula_sub_assertions(formula, penetrate_hl_structuresP, UNPROVIDED));
		}
	}

	/**
	 *
	 *
	 * @return list of rfs; all rfs mentioning RF.
	 */
	public static final SubLObject super_rfs(SubLObject rf) {
		return nconc(NIL != nart_handles.nart_p(rf) ? ((SubLObject) (kb_indexing.dependent_narts(rf))) : NIL, kb_accessors.all_term_assertions(rf, T));
	}

	/**
	 * either @xref rf-narts or @xref existing-rf-narts, used during ordering
	 */
	public static final SubLObject ordering_rf_narts(SubLObject rf, SubLObject penetrate_hl_structuresP) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return NIL != $order_wrt_unreified_reifiable_natsP$.getDynamicValue(thread) ? ((SubLObject) (existing_rf_narts(rf, penetrate_hl_structuresP))) : rf_narts(rf, penetrate_hl_structuresP);
		}
	}

	/**
	 * either @xref rf-narts or @xref existing-rf-narts, used during not ordering
	 */
	public static final SubLObject not_ordering_rf_narts(SubLObject rf, SubLObject penetrate_hl_structuresP) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return NIL != $find_unreified_reifiable_subnatsP$.getDynamicValue(thread) ? ((SubLObject) (existing_rf_narts(rf, penetrate_hl_structuresP))) : rf_narts(rf, penetrate_hl_structuresP);
		}
	}

	/**
	 *
	 *
	 * @return list of narts; narts in the KB which are contained in FORMULA or should be referenced in the canonicalized version of FORMULA due to reification.
	 * @unknown This may create new narts in the process, but will not include the newly created narts in the returned list.
	 * @unknown (existing-rf-narts '(#$or (#$isa #$Muffet (#$JuvenileFn #$Dog)) (#$isa #$Muffet (#$JuvenileFn #$Gorilla)) t) -> (<NART:(#$JuvenileFn #$Dog)>) (assuming that young dog is reified but young gorilla is not)
	 */
	public static final SubLObject existing_rf_narts(SubLObject rf, SubLObject penetrate_hl_structuresP) {
		return list_utilities.fast_set_difference(all_rf_narts(rf, penetrate_hl_structuresP), rf_narts(rf, penetrate_hl_structuresP), UNPROVIDED);
	}

	/**
	 *
	 *
	 * @return list of narts; narts which are contained in FORMULA or should be referenced in the canonicalized version of FORMULA due to reification.
	 * @unknown This may create new narts in the process, and will add the newly created narts to the returned list.
	 * @unknown (all-rf-narts '(#$or (#$isa #$Muffet (#$JuvenileFn #$Dog)) (#$isa #$Muffet (#$JuvenileFn #$Gorilla)) t) -> (<NART:(#$JuvenileFn #$Dog)> <NART:(#$JuvenileFn #$Gorilla)>) (assuming that young dog is reified but young gorilla is not)
	 */
	public static final SubLObject all_rf_narts(SubLObject rf, SubLObject penetrate_hl_structuresP) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = czer_vars.$robust_nart_lookup$.currentBinding(thread);
					try {
						czer_vars.$robust_nart_lookup$.bind($robust_lookup_during_nart_ordering$.getDynamicValue(thread), thread);
						if (NIL != nart_handles.nart_p(rf)) {
							result = all_subnarts(rf, penetrate_hl_structuresP);
						} else if (NIL != assertion_handles.assertion_p(rf)) {
							result = all_assertion_narts(rf, penetrate_hl_structuresP);
						}

					} finally {
						czer_vars.$robust_nart_lookup$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject all_subnarts(SubLObject nart, SubLObject penetrate_hl_structuresP) {
		return cycl_utilities.formula_narts(czer_main.reify_relation_functions_in_mt_list(narts_high.nart_hl_formula(nart), best_mts_for_nart_cached(nart), UNPROVIDED), penetrate_hl_structuresP, UNPROVIDED);
	}

	public static final SubLObject all_assertion_narts(SubLObject assertion, SubLObject penetrate_hl_structuresP) {
		return cycl_utilities.formula_narts(czer_main.reify_functions_in_mt(list(unreify_rfs(assertions_high.assertion_cnf(assertion))), assertions_high.assertion_mt(assertion)), penetrate_hl_structuresP, UNPROVIDED);
	}

	/**
	 * either @xref rf-assertions or @xref existing-rf-assertions, used during ordering
	 */
	public static final SubLObject ordering_rf_assertions(SubLObject rf, SubLObject penetrate_hl_structuresP) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return NIL != $order_wrt_unreified_assertionsP$.getDynamicValue(thread) ? ((SubLObject) (existing_rf_assertions(rf, penetrate_hl_structuresP))) : rf_assertions(rf, penetrate_hl_structuresP);
		}
	}

	/**
	 * either @xref rf-assertions or @xref existing-rf-assertions, used during not ordering
	 */
	public static final SubLObject not_ordering_rf_assertions(SubLObject rf, SubLObject penetrate_hl_structuresP) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return NIL != $find_unreified_sub_assertionsP$.getDynamicValue(thread) ? ((SubLObject) (existing_rf_assertions(rf, penetrate_hl_structuresP))) : rf_assertions(rf, penetrate_hl_structuresP);
		}
	}

	/**
	 *
	 *
	 * @return list of assertions; assertions which should be referenced in the canonicalized version of FORMULA due to meta-predicates.
	 * @unknown (existing-rf-assertions '(#$comment (#$isa #$Muffet #$Poodle) "As it should be.") t) -> <AS:(#$isa #$Muffet #$Poodle)>
	 */
	public static final SubLObject existing_rf_assertions(SubLObject rf, SubLObject penetrate_hl_structuresP) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject formula = rf_formula(rf);
				SubLObject meta_literals = NIL;
				SubLObject ill_formed_meta_argsP = NIL;
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						meta_literals = cycl_utilities.formula_gather(formula, $sym170$SENTENCE_WITH_POSSIBLY_META_PREDICATE_, penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					} finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
					}
				}
				{
					SubLObject cdolist_list_var = meta_literals;
					SubLObject meta_lit = NIL;
					for (meta_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), meta_lit = cdolist_list_var.first()) {
						{
							SubLObject recanonicalized_meta_literal = NIL;
							{
								SubLObject _prev_bind_0 = czer_vars.$recan_ill_formed_meta_argsP$.currentBinding(thread);
								SubLObject _prev_bind_1 = czer_vars.$robust_assertion_lookup$.currentBinding(thread);
								try {
									czer_vars.$recan_ill_formed_meta_argsP$.bind(NIL, thread);
									czer_vars.$robust_assertion_lookup$.bind($robust_lookup_during_assertion_ordering$.getDynamicValue(thread), thread);
									recanonicalized_meta_literal = czer_meta.express_as_meta_formula(meta_lit);
									ill_formed_meta_argsP = makeBoolean((NIL != ill_formed_meta_argsP) || (NIL != czer_vars.$recan_ill_formed_meta_argsP$.getDynamicValue(thread)));
								} finally {
									czer_vars.$robust_assertion_lookup$.rebind(_prev_bind_1, thread);
									czer_vars.$recan_ill_formed_meta_argsP$.rebind(_prev_bind_0, thread);
								}
							}
							{
								SubLObject old_assertions = cycl_utilities.formula_sub_assertions(meta_lit, penetrate_hl_structuresP, UNPROVIDED);
								SubLObject all_assertions = cycl_utilities.formula_sub_assertions(recanonicalized_meta_literal, penetrate_hl_structuresP, UNPROVIDED);
								SubLObject new_assertions = list_utilities.fast_set_difference(all_assertions, old_assertions, symbol_function(EQ));
								result = nconc(result, new_assertions);
							}
						}
					}
				}
				return values(result, ill_formed_meta_argsP);
			}
		}
	}

	/**
	 * gets unreified assertions but not unreified reifiable nats
	 */
	public static final SubLObject ordering_subrfs(SubLObject rf, SubLObject penetrate_hl_structuresP) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject sub_assertions = ordering_rf_assertions(rf, penetrate_hl_structuresP);
				SubLObject unknown_assertionP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				return values(nconc(ordering_rf_narts(rf, penetrate_hl_structuresP), sub_assertions), unknown_assertionP);
			}
		}
	}

	public static final SubLObject clear_ordering_subrfs_penetrating_cached() {
		{
			SubLObject cs = $ordering_subrfs_penetrating_cached_caching_state$.getGlobalValue();
			if (NIL != cs) {
				memoization_state.caching_state_clear(cs);
			}
		}
		return NIL;
	}

	public static final SubLObject remove_ordering_subrfs_penetrating_cached(SubLObject rf) {
		return memoization_state.caching_state_remove_function_results_with_args($ordering_subrfs_penetrating_cached_caching_state$.getGlobalValue(), list(rf), UNPROVIDED, UNPROVIDED);
	}

	/**
	 * penetrate-hl-structures? is assumed to be t
	 */
	public static final SubLObject ordering_subrfs_penetrating_cached_internal(SubLObject rf) {
		return ordering_subrfs(rf, T);
	}

	public static final SubLObject ordering_subrfs_penetrating_cached(SubLObject rf) {
		{
			SubLObject caching_state = $ordering_subrfs_penetrating_cached_caching_state$.getGlobalValue();
			if (NIL == caching_state) {
				caching_state = memoization_state.create_global_caching_state_for_name(ORDERING_SUBRFS_PENETRATING_CACHED, $ordering_subrfs_penetrating_cached_caching_state$, NIL, EQ, ONE_INTEGER, $int$1024);
			}
			{
				SubLObject results = memoization_state.caching_state_lookup(caching_state, rf, $kw79$_MEMOIZED_ITEM_NOT_FOUND_);
				if (results == $kw79$_MEMOIZED_ITEM_NOT_FOUND_) {
					results = arg2(resetMultipleValues(), multiple_value_list(ordering_subrfs_penetrating_cached_internal(rf)));
					memoization_state.caching_state_put(caching_state, rf, results, UNPROVIDED);
				}
				return memoization_state.caching_results(results);
			}
		}
	}

	/**
	 *
	 *
	 * @return boolean; whether reification of all subnarts in RF succeeded.
	This is a sort of procedural version of @xref all-rf-narts.
	 */
	public static final SubLObject reify_all_rf_narts(SubLObject rf) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject _prev_bind_0 = czer_vars.$robust_nart_lookup$.currentBinding(thread);
				try {
					czer_vars.$robust_nart_lookup$.bind($robust_lookup_during_nart_ordering$.getDynamicValue(thread), thread);
					if (NIL != nart_handles.nart_p(rf)) {
						reify_all_subnarts(rf);
					} else if (NIL != assertion_handles.assertion_p(rf)) {
						reify_all_assertion_narts(rf);
					}

				} finally {
					czer_vars.$robust_nart_lookup$.rebind(_prev_bind_0, thread);
				}
			}
			return T;
		}
	}

	public static final SubLObject reify_all_subnarts(SubLObject nart) {
		return czer_main.reify_relation_functions_in_mt_list(narts_high.nart_hl_formula(unreify_rfs(nart)), best_mts_for_nart_cached(nart), UNPROVIDED);
	}

	public static final SubLObject reify_all_assertion_narts(SubLObject assertion) {
		return czer_main.reify_functions_in_mt(list(unreify_rfs(assertions_high.assertion_cnf(assertion))), assertions_high.assertion_mt(assertion));
	}

	public static final SubLObject new_recan_rf(SubLObject rf, SubLObject analysis, SubLObject recanonicalization, SubLObject extra_info) {
		if (recanonicalization == UNPROVIDED) {
			recanonicalization = NIL;
		}
		if (extra_info == UNPROVIDED) {
			extra_info = NIL;
		}
		{
			SubLObject recan_rf = make_recan_rf(UNPROVIDED);
			_csetf_recan_rf_rf(recan_rf, rf);
			_csetf_recan_rf_analysis(recan_rf, analysis);
			_csetf_recan_rf_recanonicalization(recan_rf, recanonicalization);
			_csetf_recan_rf_extra_info(recan_rf, extra_info);
			return recan_rf;
		}
	}

	public static final SubLObject recan_error_rf_analysis_pairs() {
		return $error_rf_analysis_pairs$.getGlobalValue();
	}

	public static final SubLObject recan_non_success_rf_analysis_pairs() {
		return append($error_rf_analysis_pairs$.getGlobalValue(), $unrecan_rf_analysis_pairs$.getGlobalValue());
	}

	public static final SubLObject recan_non_ort_rf_analysis_pairs() {
		return append($error_rf_analysis_pairs$.getGlobalValue(), $unrecan_rf_analysis_pairs$.getGlobalValue(), $success_rf_analysis_pairs$.getGlobalValue());
	}

	public static final SubLObject recan_success_rfs() {
		return Mapping.mapcar(symbol_function(FIRST), $success_rf_analysis_pairs$.getGlobalValue());
	}

	/**
	 * returns all RFs that were not either successfully recanonicalized or in no need of recanonicalization.
	 */
	public static final SubLObject recan_non_success_rfs() {
		return Mapping.mapcar(symbol_function(FIRST), recan_non_success_rf_analysis_pairs());
	}

	public static final SubLObject recan_ort_rfs() {
		return $recan_ort_rfs$.getGlobalValue();
	}

	/**
	 * returns all RFs that were not in need of recanonicalization.
	 */
	public static final SubLObject recan_non_ort_rfs() {
		return Mapping.mapcar(symbol_function(FIRST), recan_non_ort_rf_analysis_pairs());
	}

	public static final SubLObject print_rf_counts_by_analysis() {
		{
			SubLObject cdolist_list_var = recan_rf_counts_by_analysis();
			SubLObject thingy = NIL;
			for (thingy = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thingy = cdolist_list_var.first()) {
				print(thingy, UNPROVIDED);
			}
		}
		return NIL;
	}

	public static final SubLObject recan_rf_counts_by_analysis() {
		{
			SubLObject result = NIL;
			SubLObject cdolist_list_var = recan_analyses();
			SubLObject analysis = NIL;
			for (analysis = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), analysis = cdolist_list_var.first()) {
				result = cons(cons(analysis, recan_rf_count_with_analysis(analysis)), result);
			}
			result = cons(cons($$$unexpected_errors, recan_unexpected_error_count()), result);
			return nreverse(result);
		}
	}

	public static final SubLObject recan_rf_count_with_analysis(SubLObject analysis) {
		return length(recan_rfs_with_analysis(analysis));
	}

	/**
	 * returns all RFs with stored analysis ANALYSIS.
	 */
	public static final SubLObject recan_rfs_with_analysis(SubLObject analysis) {
		if ($ORT == analysis) {
			return recan_ort_rfs();
		} else {
			{
				SubLObject result = NIL;
				SubLObject cdolist_list_var = recan_non_ort_rf_analysis_pairs();
				SubLObject pair = NIL;
				for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
					if (second(pair) == analysis) {
						result = cons(pair.first(), result);
					}
				}
				return result;
			}
		}
	}

	/**
	 * returns all RFs which got unexpected errors during their recanonicalization.
	 */
	public static final SubLObject recan_unexpected_error_rf_analysis_pairs() {
		{
			SubLObject result = NIL;
			SubLObject cdolist_list_var = $error_rf_analysis_pairs$.getGlobalValue();
			SubLObject pair = NIL;
			for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
				if (NIL == recan_analysis_p(second(pair))) {
					result = cons(pair, result);
				}
			}
			return result;
		}
	}

	/**
	 * returns all RFs which got unexpected errors during their recanonicalization.
	 */
	public static final SubLObject recan_unexpected_error_rfs() {
		return list_utilities.nmapcar(symbol_function(FIRST), recan_unexpected_error_rf_analysis_pairs());
	}

	public static final SubLObject recan_unexpected_error_count() {
		return length(recan_unexpected_error_rfs());
	}

	public static final SubLObject recan_rf_count() {
		return add(recan_ort_count(), recan_non_ort_count());
	}

	public static final SubLObject recan_ort_count() {
		return length(recan_ort_rfs());
	}

	public static final SubLObject recan_non_ort_count() {
		return length(recan_non_ort_rfs());
	}

	public static final SubLObject recan_success_count() {
		return length(recan_success_rfs());
	}

	public static final SubLObject recan_non_success_count() {
		return length(recan_non_success_rfs());
	}

	public static final SubLObject percent_uncanonical() {
		return multiply($int$100, divide(recan_non_ort_count(), recan_rf_count()));
	}

	public static final SubLObject percent_of_kb_uncanonical() {
		return multiply($int$100, divide(recan_non_ort_count(), rf_count()));
	}

	public static final SubLObject percent_recan_success() {
		return multiply($int$100, divide(recan_success_count(), recan_non_ort_count()));
	}

	public static final SubLObject clear_recanonicalizer_state() {
		$mapping_rf_id$.setDynamicValue(NIL);
		$success_rf_analysis_pairs$.setGlobalValue(NIL);
		$unrecan_rf_analysis_pairs$.setGlobalValue(NIL);
		$error_rf_analysis_pairs$.setGlobalValue(NIL);
		$exiled_rfs$.setGlobalValue(NIL);
		$recan_ort_rfs$.setGlobalValue(NIL);
		$canonical_rf_hash$.setGlobalValue(NIL);
		$unarchived_assertions$.setGlobalValue(NIL);
		$awol_unarchived_assertions$.setGlobalValue(NIL);
		$merge_failed_nart_pairs$.setGlobalValue(NIL);
		clear_ordering_subrfs_penetrating_cached();
		clear_best_mts_for_nart_cached();
		return NIL;
	}

	public static final SubLObject formulas_reference_same_fortsP(SubLObject formula1, SubLObject formula2) {
		return list_utilities.sets_equalP(cycl_utilities.formula_forts(formula1, T, UNPROVIDED, UNPROVIDED), cycl_utilities.formula_forts(formula2, T, UNPROVIDED, UNPROVIDED), UNPROVIDED);
	}

	public static final SubLObject formulas_reference_same_constantsP(SubLObject formula1, SubLObject formula2) {
		return list_utilities.sets_equalP(cycl_utilities.formula_constants(formula1, T), cycl_utilities.formula_constants(formula2, T), UNPROVIDED);
	}

	/**
	 *
	 *
	 * @return boolean; t iff the forts in SUB are a subset (inclusive) if the forts in SUPER.
	 */
	public static final SubLObject formula_forts_subsetP(SubLObject sub, SubLObject v_super) {
		return subsetp(cycl_utilities.formula_forts(sub, T, UNPROVIDED, UNPROVIDED), cycl_utilities.formula_forts(v_super, T, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
	}

	/**
	 * Prints something to the archive stream, and optionally to the screen as well.
	 *
	 * @return string; the string it printed (or withheld from printing).
	 */
	public static final SubLObject recan_format(SubLObject screenP, SubLObject string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject printstring = format(NIL, string, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
				if ($recan_archive_stream$.getDynamicValue(thread).isStream()) {
					princ(printstring, $recan_archive_stream$.getDynamicValue(thread));
				}
				force_output($recan_archive_stream$.getDynamicValue(thread));
				if ((NIL != screenP) && (NIL != $recan_verboseP$.getDynamicValue(thread))) {
					princ(printstring, UNPROVIDED);
				}
				force_output(UNPROVIDED);
				return printstring;
			}
		}
	}

	/**
	 * Returns all narts in the list NARTS which have no subnarts (except maybe some subnarts in the list EXCEPTIONS).
	 * Maintains the order of NARTS.
	 */
	public static final SubLObject narts_with_no_subnarts_except(SubLObject narts, SubLObject exceptions) {
		if (exceptions == UNPROVIDED) {
			exceptions = NIL;
		}
		{
			SubLObject result = NIL;
			SubLObject cdolist_list_var = narts;
			SubLObject nart = NIL;
			for (nart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), nart = cdolist_list_var.first()) {
				if (NIL != subsetp(cycl_utilities.subnarts(nart, UNPROVIDED, UNPROVIDED), exceptions, symbol_function(EQ), UNPROVIDED)) {
					result = cons(nart, result);
				}
			}
			return nreverse(result);
		}
	}

	/**
	 * Returns all assertions in the list ASSERTIONS which have no subassertions (except maybe some subassertions in the list EXCEPTIONS).
	 * Maintains the order of ASSERTIONS.
	 */
	public static final SubLObject assertions_with_no_subassertions_except(SubLObject assertions, SubLObject exceptions) {
		if (exceptions == UNPROVIDED) {
			exceptions = NIL;
		}
		{
			SubLObject result = NIL;
			SubLObject cdolist_list_var = assertions;
			SubLObject assertion = NIL;
			for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
				if (NIL != subsetp(cycl_utilities.assertion_sub_assertions(assertion, UNPROVIDED, UNPROVIDED), exceptions, symbol_function(EQ), UNPROVIDED)) {
					result = cons(assertion, result);
				}
			}
			return nreverse(result);
		}
	}

	public static final SubLObject declare_recanonicalizer_file() {
		declareFunction("recan_rf_print_function_trampoline", "RECAN-RF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("recan_rf_p", "RECAN-RF-P", 1, 0, false);
		new recanonicalizer.$recan_rf_p$UnaryFunction();
		declareFunction("recan_rf_rf", "RECAN-RF-RF", 1, 0, false);
		declareFunction("recan_rf_analysis", "RECAN-RF-ANALYSIS", 1, 0, false);
		declareFunction("recan_rf_recanonicalization", "RECAN-RF-RECANONICALIZATION", 1, 0, false);
		declareFunction("recan_rf_extra_info", "RECAN-RF-EXTRA-INFO", 1, 0, false);
		declareFunction("_csetf_recan_rf_rf", "_CSETF-RECAN-RF-RF", 2, 0, false);
		declareFunction("_csetf_recan_rf_analysis", "_CSETF-RECAN-RF-ANALYSIS", 2, 0, false);
		declareFunction("_csetf_recan_rf_recanonicalization", "_CSETF-RECAN-RF-RECANONICALIZATION", 2, 0, false);
		declareFunction("_csetf_recan_rf_extra_info", "_CSETF-RECAN-RF-EXTRA-INFO", 2, 0, false);
		declareFunction("make_recan_rf", "MAKE-RECAN-RF", 0, 1, false);
		declareFunction("print_recan_rf", "PRINT-RECAN-RF", 3, 0, false);
		declareFunction("recanonicalize_kb", "RECANONICALIZE-KB", 0, 3, false);
		declareFunction("pre_recanonicalization_diagnostics", "PRE-RECANONICALIZATION-DIAGNOSTICS", 0, 0, false);
		declareFunction("recan_analyze_rf", "RECAN-ANALYZE-RF", 1, 1, false);
		declareFunction("recan_analyze_rf_by_id", "RECAN-ANALYZE-RF-BY-ID", 1, 1, false);
		declareFunction("explain_recan_analysis", "EXPLAIN-RECAN-ANALYSIS", 1, 0, false);
		declareFunction("analysis_plus_reify", "ANALYSIS-PLUS-REIFY", 1, 0, false);
		declareFunction("analysis_plus_tou", "ANALYSIS-PLUS-TOU", 1, 0, false);
		declareFunction("recan_analyses", "RECAN-ANALYSES", 0, 0, false);
		declareFunction("recan_analysis_p", "RECAN-ANALYSIS-P", 1, 0, false);
		declareFunction("recanonicalizable_analysis_p", "RECANONICALIZABLE-ANALYSIS-P", 1, 0, false);
		declareFunction("unrecanonicalizable_analysis_p", "UNRECANONICALIZABLE-ANALYSIS-P", 1, 0, false);
		declareFunction("recan_error_analysis_p", "RECAN-ERROR-ANALYSIS-P", 1, 0, false);
		declareFunction("recan_special_analysis_p", "RECAN-SPECIAL-ANALYSIS-P", 1, 0, false);
		declareFunction("best_mts_for_nart", "BEST-MTS-FOR-NART", 1, 0, false);
		declareFunction("clear_best_mts_for_nart_cached", "CLEAR-BEST-MTS-FOR-NART-CACHED", 0, 0, false);
		declareFunction("remove_best_mts_for_nart_cached", "REMOVE-BEST-MTS-FOR-NART-CACHED", 1, 0, false);
		declareFunction("best_mts_for_nart_cached_internal", "BEST-MTS-FOR-NART-CACHED-INTERNAL", 1, 0, false);
		declareFunction("best_mts_for_nart_cached", "BEST-MTS-FOR-NART-CACHED", 1, 0, false);
		declareFunction("recan_analyze_nart", "RECAN-ANALYZE-NART", 1, 1, false);
		declareFunction("recan_analyze_assertion", "RECAN-ANALYZE-ASSERTION", 1, 0, false);
		declareFunction("recan_analyze_assertion_int", "RECAN-ANALYZE-ASSERTION-INT", 5, 0, false);
		declareFunction("recanonicalize_assertionP", "RECANONICALIZE-ASSERTION?", 1, 1, false);
		declareMacro("recanonicalizing_rf", "RECANONICALIZING-RF");
		declareFunction("recursively_recanonicalizingP", "RECURSIVELY-RECANONICALIZING?", 1, 0, false);
		declareFunction("recanonicalize_rfs", "RECANONICALIZE-RFS", 3, 1, false);
		declareFunction("recanonicalize_rfs_by_ids", "RECANONICALIZE-RFS-BY-IDS", 3, 0, false);
		declareFunction("recanonicalize_rf", "RECANONICALIZE-RF", 1, 1, false);
		declareFunction("recanonicalize_rf_by_id", "RECANONICALIZE-RF-BY-ID", 1, 1, false);
		declareFunction("recanonicalize_recan_rf", "RECANONICALIZE-RECAN-RF", 1, 0, false);
		declareFunction("really_recanonicalize_recan_rf", "REALLY-RECANONICALIZE-RECAN-RF", 1, 0, false);
		declareFunction("recanonicalize_subrfs", "RECANONICALIZE-SUBRFS", 1, 0, false);
		declareFunction("recanonicalize_super_rfs", "RECANONICALIZE-SUPER-RFS", 1, 0, false);
		declareFunction("handle_rf_recan_error", "HANDLE-RF-RECAN-ERROR", 2, 0, false);
		declareFunction("handle_unrecanonicalizable_rf", "HANDLE-UNRECANONICALIZABLE-RF", 2, 0, false);
		declareFunction("handle_rf_recan_special", "HANDLE-RF-RECAN-SPECIAL", 2, 0, false);
		declareFunction("note_fail_recan_rf", "NOTE-FAIL-RECAN-RF", 1, 0, false);
		declareFunction("exile_canon_misfit_rf", "EXILE-CANON-MISFIT-RF", 1, 0, false);
		declareFunction("recanonicalize_recan_nart", "RECANONICALIZE-RECAN-NART", 1, 0, false);
		declareFunction("recanonicalize_easy_nart", "RECANONICALIZE-EASY-NART", 2, 0, false);
		declareFunction("recanonicalize_hard_nart", "RECANONICALIZE-HARD-NART", 2, 0, false);
		declareFunction("recanonicalize_whack_nart", "RECANONICALIZE-WHACK-NART", 2, 0, false);
		declareFunction("merge_uncanonical_nart", "MERGE-UNCANONICAL-NART", 2, 0, false);
		declareFunction("recanonicalize_term", "RECANONICALIZE-TERM", 1, 1, false);
		declareFunction("recanonicalize_recan_assertion", "RECANONICALIZE-RECAN-ASSERTION", 1, 0, false);
		declareFunction("recanonicalize_easy_assertion", "RECANONICALIZE-EASY-ASSERTION", 2, 0, false);
		declareFunction("unassert_and_reassert_assertion", "UNASSERT-AND-REASSERT-ASSERTION", 1, 0, false);
		declareFunction("merge_uncanonical_assertion", "MERGE-UNCANONICAL-ASSERTION", 2, 0, false);
		declareFunction("recanonicalize_cycl", "RECANONICALIZE-CYCL", 1, 1, false);
		declareFunction("recanonicalize_skolems", "RECANONICALIZE-SKOLEMS", 1, 1, false);
		declareFunction("recanonicalize_skolemP", "RECANONICALIZE-SKOLEM?", 1, 0, false);
		declareFunction("recanonicalize_skolem_intP", "RECANONICALIZE-SKOLEM-INT?", 1, 0, false);
		declareFunction("recanonicalize_skolem", "RECANONICALIZE-SKOLEM", 1, 0, false);
		declareFunction("recanonicalize_skolem_int", "RECANONICALIZE-SKOLEM-INT", 1, 0, false);
		declareFunction("skolems_assertions_specs_when", "SKOLEMS-ASSERTIONS-SPECS-WHEN", 1, 0, false);
		declareFunction("skolems_assertions_specs_by", "SKOLEMS-ASSERTIONS-SPECS-BY", 2, 0, false);
		declareFunction("assertions_recan_specs", "ASSERTIONS-RECAN-SPECS", 1, 0, false);
		declareFunction("all_assertions_recan_specs", "ALL-ASSERTIONS-RECAN-SPECS", 1, 0, false);
		declareFunction("all_star_term_assertions", "ALL-STAR-TERM-ASSERTIONS", 1, 0, false);
		declareFunction("all_star_terms_assertions", "ALL-STAR-TERMS-ASSERTIONS", 1, 1, false);
		declareFunction("sibling_skolems", "SIBLING-SKOLEMS", 1, 0, false);
		declareFunction("all_sibling_skolems", "ALL-SIBLING-SKOLEMS", 1, 0, false);
		declareFunction("all_sibling_skolems_int", "ALL-SIBLING-SKOLEMS-INT", 1, 1, false);
		declareFunction("why_delta_assertionP", "WHY-DELTA-ASSERTION?", 1, 2, false);
		declareFunction("assess_diagnoses_of_assertions", "ASSESS-DIAGNOSES-OF-ASSERTIONS", 1, 0, false);
		declareFunction("reassess_diagnoses_of_assertions", "REASSESS-DIAGNOSES-OF-ASSERTIONS", 1, 0, false);
		declareFunction("diagnose_assertion_plus", "DIAGNOSE-ASSERTION-PLUS", 1, 0, false);
		declareFunction("mark_rf_as_canonical", "MARK-RF-AS-CANONICAL", 1, 0, false);
		declareFunction("rf_canonicalP", "RF-CANONICAL?", 1, 0, false);
		declareFunction("init_canonical_rf_hash", "INIT-CANONICAL-RF-HASH", 0, 0, false);
		declareFunction("recanonicalization_archive_filename", "RECANONICALIZATION-ARCHIVE-FILENAME", 0, 0, false);
		declareFunction("archive_recanonicalized_assertion", "ARCHIVE-RECANONICALIZED-ASSERTION", 1, 0, false);
		declareFunction("archive_recanonicalized_nart", "ARCHIVE-RECANONICALIZED-NART", 1, 0, false);
		declareFunction("archive_assertions", "ARCHIVE-ASSERTIONS", 1, 1, false);
		declareFunction("unarchive_assertions", "UNARCHIVE-ASSERTIONS", 0, 1, false);
		declareFunction("archive_assertions_tl", "ARCHIVE-ASSERTIONS-TL", 1, 1, false);
		declareFunction("unarchive_assertions_tl", "UNARCHIVE-ASSERTIONS-TL", 0, 1, false);
		declareFunction("archive_assertions_ids", "ARCHIVE-ASSERTIONS-IDS", 1, 1, false);
		declareFunction("unarchive_assertion_ids", "UNARCHIVE-ASSERTION-IDS", 0, 1, false);
		declareFunction("rf_p", "RF-P", 1, 0, false);
		declareFunction("rf_type", "RF-TYPE", 1, 0, false);
		declareFunction("rf_raw_id", "RF-RAW-ID", 1, 0, false);
		declareFunction("rf_id", "RF-ID", 1, 0, false);
		declareFunction("find_rf_by_id", "FIND-RF-BY-ID", 1, 0, false);
		declareFunction("find_rf", "FIND-RF", 1, 0, false);
		declareFunction("robustly_find_rf", "ROBUSTLY-FIND-RF", 1, 0, false);
		declareFunction("rf_formula", "RF-FORMULA", 1, 0, false);
		declareFunction("rf_expand", "RF-EXPAND", 1, 0, false);
		declareFunction("rf_narts", "RF-NARTS", 1, 1, false);
		declareFunction("rf_assertions", "RF-ASSERTIONS", 1, 1, false);
		declareFunction("wf_rf_syntaxP", "WF-RF-SYNTAX?", 1, 0, false);
		declareFunction("valid_rfP", "VALID-RF?", 1, 0, false);
		declareFunction("archive_recanonicalized_rf", "ARCHIVE-RECANONICALIZED-RF", 1, 0, false);
		declareFunction("all_rfs", "ALL-RFS", 0, 0, false);
		declareFunction("unreify_rfs", "UNREIFY-RFS", 1, 0, false);
		declareFunction("rf_count", "RF-COUNT", 0, 0, false);
		declareFunction("partially_order_rfs_closure", "PARTIALLY-ORDER-RFS-CLOSURE", 1, 0, false);
		declareFunction("rfs_closure", "RFS-CLOSURE", 1, 0, false);
		declareFunction("inclusive_subrfs", "INCLUSIVE-SUBRFS", 1, 0, false);
		declareFunction("partially_order_rfs", "PARTIALLY-ORDER-RFS", 1, 0, false);
		declareFunction("partially_order_rfs_int", "PARTIALLY-ORDER-RFS-INT", 1, 0, false);
		declareFunction("rfs_with_no_subrfs_except", "RFS-WITH-NO-SUBRFS-EXCEPT", 2, 0, false);
		declareFunction("partially_order_rfs_with_unreified_subrfs", "PARTIALLY-ORDER-RFS-WITH-UNREIFIED-SUBRFS", 1, 0, false);
		declareFunction("subrfs", "SUBRFS", 2, 0, false);
		declareFunction("super_rfs", "SUPER-RFS", 1, 0, false);
		declareFunction("ordering_rf_narts", "ORDERING-RF-NARTS", 2, 0, false);
		declareFunction("not_ordering_rf_narts", "NOT-ORDERING-RF-NARTS", 2, 0, false);
		declareFunction("existing_rf_narts", "EXISTING-RF-NARTS", 2, 0, false);
		declareFunction("all_rf_narts", "ALL-RF-NARTS", 2, 0, false);
		declareFunction("all_subnarts", "ALL-SUBNARTS", 2, 0, false);
		declareFunction("all_assertion_narts", "ALL-ASSERTION-NARTS", 2, 0, false);
		declareFunction("ordering_rf_assertions", "ORDERING-RF-ASSERTIONS", 2, 0, false);
		declareFunction("not_ordering_rf_assertions", "NOT-ORDERING-RF-ASSERTIONS", 2, 0, false);
		declareFunction("existing_rf_assertions", "EXISTING-RF-ASSERTIONS", 2, 0, false);
		declareFunction("ordering_subrfs", "ORDERING-SUBRFS", 2, 0, false);
		declareFunction("clear_ordering_subrfs_penetrating_cached", "CLEAR-ORDERING-SUBRFS-PENETRATING-CACHED", 0, 0, false);
		declareFunction("remove_ordering_subrfs_penetrating_cached", "REMOVE-ORDERING-SUBRFS-PENETRATING-CACHED", 1, 0, false);
		declareFunction("ordering_subrfs_penetrating_cached_internal", "ORDERING-SUBRFS-PENETRATING-CACHED-INTERNAL", 1, 0, false);
		declareFunction("ordering_subrfs_penetrating_cached", "ORDERING-SUBRFS-PENETRATING-CACHED", 1, 0, false);
		declareFunction("reify_all_rf_narts", "REIFY-ALL-RF-NARTS", 1, 0, false);
		declareFunction("reify_all_subnarts", "REIFY-ALL-SUBNARTS", 1, 0, false);
		declareFunction("reify_all_assertion_narts", "REIFY-ALL-ASSERTION-NARTS", 1, 0, false);
		declareFunction("new_recan_rf", "NEW-RECAN-RF", 2, 2, false);
		declareFunction("recan_error_rf_analysis_pairs", "RECAN-ERROR-RF-ANALYSIS-PAIRS", 0, 0, false);
		declareFunction("recan_non_success_rf_analysis_pairs", "RECAN-NON-SUCCESS-RF-ANALYSIS-PAIRS", 0, 0, false);
		declareFunction("recan_non_ort_rf_analysis_pairs", "RECAN-NON-ORT-RF-ANALYSIS-PAIRS", 0, 0, false);
		declareFunction("recan_success_rfs", "RECAN-SUCCESS-RFS", 0, 0, false);
		declareFunction("recan_non_success_rfs", "RECAN-NON-SUCCESS-RFS", 0, 0, false);
		declareFunction("recan_ort_rfs", "RECAN-ORT-RFS", 0, 0, false);
		declareFunction("recan_non_ort_rfs", "RECAN-NON-ORT-RFS", 0, 0, false);
		declareFunction("print_rf_counts_by_analysis", "PRINT-RF-COUNTS-BY-ANALYSIS", 0, 0, false);
		declareFunction("recan_rf_counts_by_analysis", "RECAN-RF-COUNTS-BY-ANALYSIS", 0, 0, false);
		declareFunction("recan_rf_count_with_analysis", "RECAN-RF-COUNT-WITH-ANALYSIS", 1, 0, false);
		declareFunction("recan_rfs_with_analysis", "RECAN-RFS-WITH-ANALYSIS", 1, 0, false);
		declareFunction("recan_unexpected_error_rf_analysis_pairs", "RECAN-UNEXPECTED-ERROR-RF-ANALYSIS-PAIRS", 0, 0, false);
		declareFunction("recan_unexpected_error_rfs", "RECAN-UNEXPECTED-ERROR-RFS", 0, 0, false);
		declareFunction("recan_unexpected_error_count", "RECAN-UNEXPECTED-ERROR-COUNT", 0, 0, false);
		declareFunction("recan_rf_count", "RECAN-RF-COUNT", 0, 0, false);
		declareFunction("recan_ort_count", "RECAN-ORT-COUNT", 0, 0, false);
		declareFunction("recan_non_ort_count", "RECAN-NON-ORT-COUNT", 0, 0, false);
		declareFunction("recan_success_count", "RECAN-SUCCESS-COUNT", 0, 0, false);
		declareFunction("recan_non_success_count", "RECAN-NON-SUCCESS-COUNT", 0, 0, false);
		declareFunction("percent_uncanonical", "PERCENT-UNCANONICAL", 0, 0, false);
		declareFunction("percent_of_kb_uncanonical", "PERCENT-OF-KB-UNCANONICAL", 0, 0, false);
		declareFunction("percent_recan_success", "PERCENT-RECAN-SUCCESS", 0, 0, false);
		declareFunction("clear_recanonicalizer_state", "CLEAR-RECANONICALIZER-STATE", 0, 0, false);
		declareFunction("formulas_reference_same_fortsP", "FORMULAS-REFERENCE-SAME-FORTS?", 2, 0, false);
		declareFunction("formulas_reference_same_constantsP", "FORMULAS-REFERENCE-SAME-CONSTANTS?", 2, 0, false);
		declareFunction("formula_forts_subsetP", "FORMULA-FORTS-SUBSET?", 2, 0, false);
		declareFunction("recan_format", "RECAN-FORMAT", 2, 5, false);
		declareFunction("narts_with_no_subnarts_except", "NARTS-WITH-NO-SUBNARTS-EXCEPT", 1, 1, false);
		declareFunction("assertions_with_no_subassertions_except", "ASSERTIONS-WITH-NO-SUBASSERTIONS-EXCEPT", 1, 1, false);
		return NIL;
	}

	public static final SubLObject init_recanonicalizer_file() {
		defparameter("*PREORDER-RFS?*", NIL);
		defparameter("*ORDER-WRT-UNREIFIED-REIFIABLE-NATS?*", NIL);
		defparameter("*FIND-UNREIFIED-REIFIABLE-SUBNATS?*", NIL);
		defparameter("*ROBUST-LOOKUP-DURING-NART-ORDERING*", NIL);
		defparameter("*ROBUST-NART-LOOKUP-DURING-RECANONICALIZATION*", NIL);
		defparameter("*ORDER-WRT-UNREIFIED-ASSERTIONS?*", T);
		defparameter("*FIND-UNREIFIED-SUB-ASSERTIONS?*", T);
		defparameter("*ROBUST-LOOKUP-DURING-ASSERTION-ORDERING*", NIL);
		defparameter("*ROBUST-ASSERTION-LOOKUP-DURING-RECANONICALIZATION*", NIL);
		defparameter("*PUSHING-META-PROBLEMS-TO-END?*", NIL);
		defparameter("*RECANONICALIZE-SUPER-RFS?*", T);
		defparameter("*FAIL-ON-UNRECANONICALIZABLE-SUPER-RF?*", T);
		defparameter("*RECANONICALIZER-LOCK*", make_lock($$$recanonicalizer_lock));
		defparameter("*MAPPING-CONSIDERED*", ZERO_INTEGER);
		defparameter("*MAPPING-HITS*", ZERO_INTEGER);
		defparameter("*MAPPING-QUALIFIERS*", ZERO_INTEGER);
		defparameter("*RECAN-ARCHIVE-STREAM*", NIL);
		defparameter("*RECANONICALIZATION-MODIFIES-KB?*", NIL);
		defparameter("*ASSUME-PARTIAL-ORDER?*", NIL);
		defparameter("*RECAN-VERBOSE?*", T);
		defparameter("*RECORDING-RECAN-STATS?*", NIL);
		defparameter("*RECANONICALIZATION-STACK*", NIL);
		defparameter("*RECANONICALIZING-KB?*", NIL);
		defparameter("*RECAN-HANDLED-ANALYSES*", $list_alt1);
		defparameter("*RECAN-UNHANDLED-ANALYSES*", $list_alt2);
		defparameter("*RECAN-ERROR-ANALYSES*", $list_alt3);
		defparameter("*RECAN-SPECIAL-ANALYSES*", $list_alt4);
		defparameter("*MAPPING-RF-ID*", NIL);
		deflexical("*SUCCESS-RF-ANALYSIS-PAIRS*", NIL != boundp($success_rf_analysis_pairs$) ? ((SubLObject) ($success_rf_analysis_pairs$.getGlobalValue())) : NIL);
		deflexical("*UNRECAN-RF-ANALYSIS-PAIRS*", NIL != boundp($unrecan_rf_analysis_pairs$) ? ((SubLObject) ($unrecan_rf_analysis_pairs$.getGlobalValue())) : NIL);
		deflexical("*ERROR-RF-ANALYSIS-PAIRS*", NIL != boundp($error_rf_analysis_pairs$) ? ((SubLObject) ($error_rf_analysis_pairs$.getGlobalValue())) : NIL);
		deflexical("*RECAN-ORT-RFS*", NIL != boundp($recan_ort_rfs$) ? ((SubLObject) ($recan_ort_rfs$.getGlobalValue())) : NIL);
		deflexical("*META-PROBLEM-RFS*", NIL != boundp($meta_problem_rfs$) ? ((SubLObject) ($meta_problem_rfs$.getGlobalValue())) : NIL);
		deflexical("*EXILED-RFS*", NIL != boundp($exiled_rfs$) ? ((SubLObject) ($exiled_rfs$.getGlobalValue())) : NIL);
		deflexical("*CANONICAL-RF-HASH*", NIL != boundp($canonical_rf_hash$) ? ((SubLObject) ($canonical_rf_hash$.getGlobalValue())) : NIL);
		defparameter("*EXILING-CANONICAL-MISFIT-ASSERTIONS?*", NIL);
		deflexical("*UNARCHIVED-ASSERTIONS*", NIL != boundp($unarchived_assertions$) ? ((SubLObject) ($unarchived_assertions$.getGlobalValue())) : NIL);
		deflexical("*AWOL-UNARCHIVED-ASSERTIONS*", NIL != boundp($awol_unarchived_assertions$) ? ((SubLObject) ($awol_unarchived_assertions$.getGlobalValue())) : NIL);
		defparameter("*EXILING-CANONICAL-MISFIT-NARTS?*", NIL);
		deflexical("*MERGE-FAILED-NART-PAIRS*", NIL != boundp($merge_failed_nart_pairs$) ? ((SubLObject) ($merge_failed_nart_pairs$.getGlobalValue())) : NIL);
		defconstant("*DTP-RECAN-RF*", RECAN_RF);
		deflexical("*BEST-MTS-FOR-NART-CACHED-CACHING-STATE*", NIL);
		defparameter("*ASSERTION-DIAGNOSES-TABLE*", make_hash_table($int$1024, UNPROVIDED, UNPROVIDED));
		deflexical("*ORDERING-SUBRFS-PENETRATING-CACHED-CACHING-STATE*", NIL);
		return NIL;
	}

	public static final SubLObject setup_recanonicalizer_file() {
		subl_macro_promotions.declare_defglobal($success_rf_analysis_pairs$);
		subl_macro_promotions.declare_defglobal($unrecan_rf_analysis_pairs$);
		subl_macro_promotions.declare_defglobal($error_rf_analysis_pairs$);
		subl_macro_promotions.declare_defglobal($recan_ort_rfs$);
		subl_macro_promotions.declare_defglobal($meta_problem_rfs$);
		subl_macro_promotions.declare_defglobal($exiled_rfs$);
		subl_macro_promotions.declare_defglobal($canonical_rf_hash$);
		subl_macro_promotions.declare_defglobal($unarchived_assertions$);
		subl_macro_promotions.declare_defglobal($awol_unarchived_assertions$);
		subl_macro_promotions.declare_defglobal($merge_failed_nart_pairs$);
		register_method($print_object_method_table$.getGlobalValue(), $dtp_recan_rf$.getGlobalValue(), symbol_function(RECAN_RF_PRINT_FUNCTION_TRAMPOLINE));
		def_csetf(RECAN_RF_RF, _CSETF_RECAN_RF_RF);
		def_csetf(RECAN_RF_ANALYSIS, _CSETF_RECAN_RF_ANALYSIS);
		def_csetf(RECAN_RF_RECANONICALIZATION, _CSETF_RECAN_RF_RECANONICALIZATION);
		def_csetf(RECAN_RF_EXTRA_INFO, _CSETF_RECAN_RF_EXTRA_INFO);
		identity(RECAN_RF);
		memoization_state.note_globally_cached_function(BEST_MTS_FOR_NART_CACHED);
		memoization_state.note_globally_cached_function(ORDERING_SUBRFS_PENETRATING_CACHED);
		return NIL;
	}

	// // Internal Constants
	static private final SubLString $$$recanonicalizer_lock = makeString("recanonicalizer lock");

	static private final SubLList $list_alt1 = list(new SubLObject[] { makeKeyword("ORT"), makeKeyword("REIFY"), makeKeyword("VAR-RENAME"), makeKeyword("VAR-RENAME-REIFY"), makeKeyword("REORDER"), makeKeyword("REORDER-REIFY"), makeKeyword("NEW-TOU"), makeKeyword("VAR-RENAME-TOU"), makeKeyword("REORDER-TOU") });

	static private final SubLList $list_alt2 = list(makeKeyword("PARANOID"), $ABNORMAL, $POLY);

	static private final SubLList $list_alt3 = list(makeKeyword("INVALID"), makeKeyword("RECAN-INVALID"), makeKeyword("ILL-FORMED-SYNTAX"), makeKeyword("ILL-FORMED"), makeKeyword("SUPER-FAIL"), makeKeyword("UNKNOWN"));

	static private final SubLList $list_alt4 = list(makeKeyword("META-PROBLEM"));

	public static final SubLSymbol $success_rf_analysis_pairs$ = makeSymbol("*SUCCESS-RF-ANALYSIS-PAIRS*");

	public static final SubLSymbol $unrecan_rf_analysis_pairs$ = makeSymbol("*UNRECAN-RF-ANALYSIS-PAIRS*");

	public static final SubLSymbol $error_rf_analysis_pairs$ = makeSymbol("*ERROR-RF-ANALYSIS-PAIRS*");

	public static final SubLSymbol $recan_ort_rfs$ = makeSymbol("*RECAN-ORT-RFS*");

	public static final SubLSymbol $meta_problem_rfs$ = makeSymbol("*META-PROBLEM-RFS*");

	public static final SubLSymbol $exiled_rfs$ = makeSymbol("*EXILED-RFS*");

	public static final SubLSymbol $canonical_rf_hash$ = makeSymbol("*CANONICAL-RF-HASH*");

	public static final SubLSymbol $unarchived_assertions$ = makeSymbol("*UNARCHIVED-ASSERTIONS*");

	public static final SubLSymbol $awol_unarchived_assertions$ = makeSymbol("*AWOL-UNARCHIVED-ASSERTIONS*");

	public static final SubLSymbol $merge_failed_nart_pairs$ = makeSymbol("*MERGE-FAILED-NART-PAIRS*");

	private static final SubLSymbol RECAN_RF = makeSymbol("RECAN-RF");

	private static final SubLSymbol RECAN_RF_P = makeSymbol("RECAN-RF-P");

	static private final SubLList $list_alt17 = list(makeSymbol("RF"), makeSymbol("ANALYSIS"), makeSymbol("RECANONICALIZATION"), makeSymbol("EXTRA-INFO"));

	static private final SubLList $list_alt18 = list(makeKeyword("RF"), makeKeyword("ANALYSIS"), makeKeyword("RECANONICALIZATION"), makeKeyword("EXTRA-INFO"));

	static private final SubLList $list_alt19 = list(makeSymbol("RECAN-RF-RF"), makeSymbol("RECAN-RF-ANALYSIS"), makeSymbol("RECAN-RF-RECANONICALIZATION"), makeSymbol("RECAN-RF-EXTRA-INFO"));

	static private final SubLList $list_alt20 = list(makeSymbol("_CSETF-RECAN-RF-RF"), makeSymbol("_CSETF-RECAN-RF-ANALYSIS"), makeSymbol("_CSETF-RECAN-RF-RECANONICALIZATION"), makeSymbol("_CSETF-RECAN-RF-EXTRA-INFO"));

	private static final SubLSymbol PRINT_RECAN_RF = makeSymbol("PRINT-RECAN-RF");

	private static final SubLSymbol RECAN_RF_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RECAN-RF-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLSymbol RECAN_RF_RF = makeSymbol("RECAN-RF-RF");

	public static final SubLSymbol _CSETF_RECAN_RF_RF = makeSymbol("_CSETF-RECAN-RF-RF");

	private static final SubLSymbol RECAN_RF_ANALYSIS = makeSymbol("RECAN-RF-ANALYSIS");

	public static final SubLSymbol _CSETF_RECAN_RF_ANALYSIS = makeSymbol("_CSETF-RECAN-RF-ANALYSIS");

	private static final SubLSymbol RECAN_RF_RECANONICALIZATION = makeSymbol("RECAN-RF-RECANONICALIZATION");

	public static final SubLSymbol _CSETF_RECAN_RF_RECANONICALIZATION = makeSymbol("_CSETF-RECAN-RF-RECANONICALIZATION");

	private static final SubLSymbol RECAN_RF_EXTRA_INFO = makeSymbol("RECAN-RF-EXTRA-INFO");

	public static final SubLSymbol _CSETF_RECAN_RF_EXTRA_INFO = makeSymbol("_CSETF-RECAN-RF-EXTRA-INFO");

	private static final SubLSymbol $RF = makeKeyword("RF");

	private static final SubLSymbol $RECANONICALIZATION = makeKeyword("RECANONICALIZATION");

	private static final SubLSymbol $EXTRA_INFO = makeKeyword("EXTRA-INFO");

	static private final SubLString $str_alt35$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	static private final SubLString $str_alt36$___a_RF__a_ = makeString("#<~a-RF ~a>");

	private static final SubLSymbol $ORT = makeKeyword("ORT");

	private static final SubLSymbol $ILL_FORMED_SYNTAX = makeKeyword("ILL-FORMED-SYNTAX");

	static private final SubLString $str_alt41$This_RF_recanonicalizes_to_itself = makeString("This RF recanonicalizes to itself - no recanonicalization necessary.");

	private static final SubLSymbol $VAR_RENAME = makeKeyword("VAR-RENAME");

	static private final SubLString $str_alt43$I_know_how_to_recanonicalize_this = makeString("I know how to recanonicalize this RF in place; it needs to have variables renamed.");

	private static final SubLSymbol $REORDER = makeKeyword("REORDER");

	static private final SubLString $str_alt45$I_know_how_to_recanonicalize_this = makeString("I know how to recanonicalize this RF in place; it needs to have some literals/terms reordered, and perhaps variables renamed.");

	private static final SubLSymbol $REIFY = makeKeyword("REIFY");

	static private final SubLString $str_alt47$I_know_how_to_recanonicalize_this = makeString("I know how to recanonicalize this RF in place; it needs reification/unreification of RFs.");

	private static final SubLSymbol $VAR_RENAME_REIFY = makeKeyword("VAR-RENAME-REIFY");

	static private final SubLString $str_alt49$I_know_how_to_recanonicalize_this = makeString("I know how to recanonicalize this RF in place; it needs to have variables renamed and reification/unreification of RFs.");

	private static final SubLSymbol $REORDER_REIFY = makeKeyword("REORDER-REIFY");

	static private final SubLString $str_alt51$I_know_how_to_recanonicalize_this = makeString("I know how to recanonicalize this RF in place; it needs to have some literals/terms reordered, perhaps variables renamed, and reification/unreification of RFs.");

	private static final SubLSymbol $NEW_TOU = makeKeyword("NEW-TOU");

	static private final SubLString $str_alt53$I_know_how_to_recanonicalize_this = makeString("I know how to recanonicalize this RF in place; it needs a new termOfUnit neglit (or to drop one), and perhaps reification/unreification of RFs.");

	private static final SubLSymbol $VAR_RENAME_TOU = makeKeyword("VAR-RENAME-TOU");

	static private final SubLString $str_alt55$I_know_how_to_recanonicalize_this = makeString("I know how to recanonicalize this RF in place; it needs a new termOfUnit neglit (or to drop one), perhaps variables renamed, and perhaps reification/unreification of RFs.");

	private static final SubLSymbol $REORDER_TOU = makeKeyword("REORDER-TOU");

	static private final SubLString $str_alt57$I_know_how_to_recanonicalize_this = makeString("I know how to recanonicalize this RF in place; it needs a new termOfUnit neglit (or to drop one), perhaps some literals/terms reordered, perhaps variables renamed, and perhaps reification/unreification of RFs.");

	private static final SubLSymbol $PARANOID = makeKeyword("PARANOID");

	static private final SubLString $str_alt59$I_know_how_to_recanonicalize_this = makeString("I know how to recanonicalize this RF in place, but I can't guarantee that it will be logically equivalent and that it will preserve TMS.");

	static private final SubLString $str_alt61$I_am_afraid_to_recanonicalize_thi = makeString("I am afraid to recanonicalize this RF in place, because it has an #$abnormal statement made within it or about it, and I'm not confident that I could correctly rename the variables.");

	static private final SubLString $str_alt63$This_assertion_recanonicalizes_in = makeString("This assertion recanonicalizes into two or more assertions, so I don't know how to recanonicalize it.");

	static private final SubLString $str_alt64$This_RF_is_invalid__so_I_won_t_ev = makeString("This RF is invalid, so I won't even try to recanonicalize it.");

	private static final SubLSymbol $RECAN_INVALID = makeKeyword("RECAN-INVALID");

	static private final SubLString $str_alt66$The_recanonicalization_of_this_RF = makeString("The recanonicalization of this RF yields an error or other invalid result (perhaps the RF was ill-formed?), so I can't recanonicalize it.");

	static private final SubLString $str_alt68$This_RF_is_semantically_ill_forme = makeString("This RF is semantically ill-formed so I won't even try to recanonicalize it.");

	static private final SubLString $str_alt69$This_RF_is_syntactically_ill_form = makeString("This RF is syntactically ill-formed so I won't even try to recanonicalize it.");

	private static final SubLSymbol $META_PROBLEM = makeKeyword("META-PROBLEM");

	static private final SubLString $str_alt71$This_RF_had_a_problem_finding_a_m = makeString("This RF had a problem finding a meta-assertion, which may be because the meta-assertion it needs to find is uncanonical, so I want to wait to recanonicalize this one until all candidate meta-assertions are recanonicalized as well.");

	private static final SubLSymbol $SUPER_FAIL = makeKeyword("SUPER-FAIL");

	static private final SubLString $str_alt73$There_is_an_rf_which_references_t = makeString("There is an rf which references this rf which cannot be recanonicalized.");

	static private final SubLString $str_alt74$I_don_t_know_how_to_recanonicaliz = makeString("I don't know how to recanonicalize this RF.");

	static private final SubLString $str_alt75$I_can_t_explain_the_analysis_of_t = makeString("I can't explain the analysis of this RF, because I don't know what the analysis ~a means.");

	private static final SubLSymbol BEST_MTS_FOR_NART_CACHED = makeSymbol("BEST-MTS-FOR-NART-CACHED");

	public static final SubLSymbol $best_mts_for_nart_cached_caching_state$ = makeSymbol("*BEST-MTS-FOR-NART-CACHED-CACHING-STATE*");

	public static final SubLInteger $int$1024 = makeInteger(1024);

	public static final SubLSymbol $kw79$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

	public static final SubLObject $$abnormal = constant_handles.reader_make_constant_shell(makeString("abnormal"));

	private static final SubLSymbol EL_VAR_NAME = makeSymbol("EL-VAR-NAME");

	private static final SubLSymbol ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");

	static private final SubLList $list_alt84 = list(list(makeSymbol("RF")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt88 = list(makeSymbol("*RECANONICALIZATION-STACK*"));

	static private final SubLList $list_alt89 = list(list(makeSymbol("CPOP"), makeSymbol("*RECANONICALIZATION-STACK*")));

	static private final SubLString $str_alt91$_______a = makeString("~%;;; ~a");

	static private final SubLString $str_alt92$______date_performed___a__ = makeString("~%;;; date performed: ~a~%");

	static private final SubLString $$$Recanonicalizing_RFs = makeString("Recanonicalizing RFs");

	static private final SubLString $$$Pretending_to_recanonicalize_RFs = makeString("Pretending to recanonicalize RFs");

	private static final SubLSymbol RF_P = makeSymbol("RF-P");

	private static final SubLSymbol FIND_RF_BY_ID = makeSymbol("FIND-RF-BY-ID");

	private static final SubLSymbol REIFIED_FORMULA_P = makeSymbol("REIFIED-FORMULA-P");

	static private final SubLString $str_alt98$Tried_to_recursively_recanonicali = makeString("Tried to recursively recanonicalize ~a");

	static private final SubLString $str_alt100$_s_is_not_a_valid_RF_id_ = makeString("~s is not a valid RF id.");

	private static final SubLSymbol RECANONICALIZABLE_ANALYSIS_P = makeSymbol("RECANONICALIZABLE-ANALYSIS-P");

	static private final SubLString $str_alt103$RF_contains_an_unrecanonicalizabl = makeString("RF contains an unrecanonicalizable subrf, or an unfindable implicit subrf, which should have made it ill-formed.");

	static private final SubLString $str_alt104$_____recanonicalizing___s___a = makeString("~%~%[recanonicalizing] ~s~%~a");

	static private final SubLString $str_alt105$_____pretending_to_recanonicalize = makeString("~%~%[pretending to recanonicalize] ~s~%~a");

	static private final SubLString $str_alt107$__success_ = makeString("~%success.");

	static private final SubLString $str_alt108$unable_to_recanonicalize__a_becau = makeString("unable to recanonicalize ~a because it has the unknown analysis ~a (~a)");

	static private final SubLString $str_alt109$_____error___s___a___a = makeString("~%~%[error] ~s~%~a~%~a");

	static private final SubLString $str_alt110$_____unrecanonicalizable___s___a_ = makeString("~%~%[unrecanonicalizable] ~s~%~a~%~a");

	static private final SubLString $str_alt111$_____wait___s___a___a = makeString("~%~%[wait] ~s~%~a~%~a");

	static private final SubLString $str_alt112$_meta_assertion_lookup_failure_ = makeString("(meta-assertion lookup failure)");

	static private final SubLString $str_alt113$Unexpected_special_analysis__s = makeString("Unexpected special analysis ~s");

	static private final SubLString $str_alt114$__result___a = makeString("~%result: ~a");

	static private final SubLString $str_alt115$__intended_result___a = makeString("~%intended result: ~a");

	static private final SubLString $str_alt116$An_error_occurred_while_reinstall = makeString("An error occurred while reinstalling the NART's HL formula: ~s");

	static private final SubLString $str_alt117$Recanonicalization_of_hard_narts_ = makeString("Recanonicalization of hard narts is not supported yet.");

	static private final SubLString $str_alt118$Whacking_narts_is_not_supported_y = makeString("Whacking narts is not supported yet.");

	static private final SubLString $str_alt119$__intended_merge_onto___a = makeString("~%intended merge onto: ~a");

	static private final SubLString $str_alt120$__merging__a__onto__a = makeString("~%merging ~a~%onto ~a");

	static private final SubLString $str_alt121$__merge_FAILED_ = makeString("~%merge FAILED.");

	static private final SubLString $str_alt122$__merge_successful_ = makeString("~%merge successful.");

	static private final SubLString $str_alt123$An_error_occurred_while_resetting = makeString("An error occurred while resetting the assertion's variables and/or formula: ~s");

	static private final SubLString $$$cdolist = makeString("cdolist");

	static private final SubLString $str_alt125$______a_of__a___a = makeString("~%~%[~a of ~a] ~a");

	static private final SubLString $str_alt126$____not_recanonicalizable___a = makeString("~%~%not recanonicalizable: ~a");

	private static final SubLSymbol SKOLEM_DEFN_ASSERTIONS = makeSymbol("SKOLEM-DEFN-ASSERTIONS");

	private static final SubLSymbol ALL_ASSERTIONS_RECAN_SPECS = makeSymbol("ALL-ASSERTIONS-RECAN-SPECS");

	private static final SubLSymbol FI_KILL_INT = makeSymbol("FI-KILL-INT");

	static private final SubLList $list_alt130 = list(makeSymbol("EL"), makeSymbol("MT"), makeSymbol("BY"), makeSymbol("WHEN"), makeSymbol("WHY"));

	private static final SubLSymbol ALL_TERM_ASSERTIONS = makeSymbol("ALL-TERM-ASSERTIONS");

	private static final SubLSymbol ASSERTION_SKOLEMS = makeSymbol("ASSERTION-SKOLEMS");

	private static final SubLSymbol SIBLING_SKOLEMS = makeSymbol("SIBLING-SKOLEMS");

	public static final SubLObject $$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));

	static private final SubLString $str_alt135$______s__s__s______s_____s_____s = makeString("~%~%[~s/~s/~s]~%  ~s~%  ~s~%  ~s");

	static private final SubLString $str_alt136$______s__s__s______s_____s_____s_ = makeString("~%~%[~s/~s/~s]~%  ~s~%  ~s~%  ~s~%  ~a");

	static private final SubLString $str_alt137$_equivalent_under_variable_renami = makeString("[equivalent under variable renaming]");

	static private final SubLString $str_alt138$_equivalent_under_literal_term_re = makeString("[equivalent under literal/term re-ordering]");

	static private final SubLString $str_alt139$_equivalent_save_new_termOfUnit_n = makeString("[equivalent save new termOfUnit neg-lit]");

	private static final SubLSymbol $ASSERTION_NOT_CANONICAL = makeKeyword("ASSERTION-NOT-CANONICAL");

	private static final SubLSymbol $DELTA_IN = makeKeyword("DELTA-IN");

	private static final SubLSymbol $DELTA_OUT = makeKeyword("DELTA-OUT");

	private static final SubLSymbol $DIAGNOSE_ASSERTION_AXIOM = makeKeyword("DIAGNOSE-ASSERTION-AXIOM");

	private static final SubLSymbol $CANONICAL = makeKeyword("CANONICAL");

	static private final SubLList $list_alt146 = list(makeString("data"), makeString("kb-recanonicalizations"));

	static private final SubLString $str_alt147$kb__a_on__a = makeString("kb-~a-on-~a");

	static private final SubLString $$$text = makeString("text");

	static private final SubLString $str_alt149$__s__s_ = makeString("(~s ~s)");

	static private final SubLString $str_alt150$_s = makeString("~s");

	static private final SubLString $str_alt151$archived_assertions = makeString("archived-assertions");

	static private final SubLString $$$archiving_assertions = makeString("archiving assertions");

	static private final SubLString $str_alt155$__invalid_assertion_spec___s = makeString("~%invalid assertion spec: ~s");

	static private final SubLString $str_alt156$archived_assertions_tl = makeString("archived-assertions-tl");

	static private final SubLString $str_alt157$archived_assertion_ids = makeString("archived-assertion-ids");

	static private final SubLString $$$archiving_assertion_ids = makeString("archiving assertion ids");

	static private final SubLString $str_alt159$mapping_results_ids = makeString("mapping-results-ids");

	static private final SubLString $str_alt160$__no_assertion_for_id___s = makeString("~%no assertion for id: ~s");

	static private final SubLString $str_alt161$__invalid_assertion_id___s = makeString("~%invalid assertion id: ~s");

	static private final SubLString $str_alt164$building_explicit_and_implicit_su = makeString("building explicit and implicit subrf tables");

	static private final SubLString $str_alt165$Risk_rf_mutual_dependency_conflic = makeString("Risk rf mutual dependency conflict");

	static private final SubLString $str_alt166$Could_not_order_the_rfs__A = makeString("Could not order the rfs ~A");

	static private final SubLString $str_alt167$iteratively_partially_ordering_rf = makeString("iteratively partially ordering rfs");

	public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

	static private final SubLSymbol $sym170$SENTENCE_WITH_POSSIBLY_META_PREDICATE_ = makeSymbol("SENTENCE-WITH-POSSIBLY-META-PREDICATE?");

	private static final SubLSymbol ORDERING_SUBRFS_PENETRATING_CACHED = makeSymbol("ORDERING-SUBRFS-PENETRATING-CACHED");

	public static final SubLSymbol $ordering_subrfs_penetrating_cached_caching_state$ = makeSymbol("*ORDERING-SUBRFS-PENETRATING-CACHED-CACHING-STATE*");

	static private final SubLString $$$unexpected_errors = makeString("unexpected errors");

	// // Initializers
	@Override
	public void declareFunctions() {
		declare_recanonicalizer_file();
	}

	@Override
	public void initializeVariables() {
		init_recanonicalizer_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_recanonicalizer_file();
	}
}
