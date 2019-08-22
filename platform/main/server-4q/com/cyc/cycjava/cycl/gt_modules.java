/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gt_modules extends SubLTranslatedFile implements V12 {
	// Definitions
	public static final SubLObject tm_dependents(SubLObject fort, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
					SubLObject _prev_bind_1 = gt_vars.$gt_link_type$.currentBinding(thread);
					SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
					SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
					SubLObject _prev_bind_4 = gt_vars.$gt_marking_table$.currentBinding(thread);
					try {
						gt_vars.$gt_pred$.bind($$tmBroaderTerm, thread);
						gt_vars.$gt_link_type$.bind($ASSERTION, thread);
						gt_vars.$gt_index_arg$.bind(ONE_INTEGER, thread);
						gt_vars.$gt_gather_arg$.bind(TWO_INTEGER, thread);
						gt_vars.$gt_marking_table$.bind(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
						result = gt_methods.gtm_all_dependent_inferiors(fort, mt);
					} finally {
						gt_vars.$gt_marking_table$.rebind(_prev_bind_4, thread);
						gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
						gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
						gt_vars.$gt_link_type$.rebind(_prev_bind_1, thread);
						gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject narrower_terms(SubLObject fort, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
					SubLObject _prev_bind_1 = gt_vars.$gt_link_type$.currentBinding(thread);
					SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
					SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
					SubLObject _prev_bind_4 = gt_vars.$gt_marking_table$.currentBinding(thread);
					try {
						gt_vars.$gt_pred$.bind($$tmBroaderTerm, thread);
						gt_vars.$gt_link_type$.bind($ASSERTION, thread);
						gt_vars.$gt_index_arg$.bind(ONE_INTEGER, thread);
						gt_vars.$gt_gather_arg$.bind(TWO_INTEGER, thread);
						gt_vars.$gt_marking_table$.bind(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
						result = gt_methods.gtm_max_inferiors(fort, mt);
					} finally {
						gt_vars.$gt_marking_table$.rebind(_prev_bind_4, thread);
						gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
						gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
						gt_vars.$gt_link_type$.rebind(_prev_bind_1, thread);
						gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject narrower_termP(SubLObject superior, SubLObject inferior, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
					SubLObject _prev_bind_1 = gt_vars.$gt_link_type$.currentBinding(thread);
					SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
					SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
					SubLObject _prev_bind_4 = gt_vars.$gt_marking_table$.currentBinding(thread);
					try {
						gt_vars.$gt_pred$.bind($$tmBroaderTerm, thread);
						gt_vars.$gt_link_type$.bind($ASSERTION, thread);
						gt_vars.$gt_index_arg$.bind(ONE_INTEGER, thread);
						gt_vars.$gt_gather_arg$.bind(TWO_INTEGER, thread);
						gt_vars.$gt_marking_table$.bind(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
						result = gt_methods.gtm_has_inferiorP(superior, inferior, mt);
					} finally {
						gt_vars.$gt_marking_table$.rebind(_prev_bind_4, thread);
						gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
						gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
						gt_vars.$gt_link_type$.rebind(_prev_bind_1, thread);
						gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject broader_terms(SubLObject fort, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
					SubLObject _prev_bind_1 = gt_vars.$gt_link_type$.currentBinding(thread);
					SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
					SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
					SubLObject _prev_bind_4 = gt_vars.$gt_marking_table$.currentBinding(thread);
					try {
						gt_vars.$gt_pred$.bind($$tmBroaderTerm, thread);
						gt_vars.$gt_link_type$.bind($ASSERTION, thread);
						gt_vars.$gt_index_arg$.bind(ONE_INTEGER, thread);
						gt_vars.$gt_gather_arg$.bind(TWO_INTEGER, thread);
						gt_vars.$gt_marking_table$.bind(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
						result = gt_methods.gtm_min_superiors(fort, mt);
					} finally {
						gt_vars.$gt_marking_table$.rebind(_prev_bind_4, thread);
						gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
						gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
						gt_vars.$gt_link_type$.rebind(_prev_bind_1, thread);
						gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject broader_termP(SubLObject inferior, SubLObject superior, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
					SubLObject _prev_bind_1 = gt_vars.$gt_link_type$.currentBinding(thread);
					SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
					SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
					SubLObject _prev_bind_4 = gt_vars.$gt_marking_table$.currentBinding(thread);
					try {
						gt_vars.$gt_pred$.bind($$tmBroaderTerm, thread);
						gt_vars.$gt_link_type$.bind($ASSERTION, thread);
						gt_vars.$gt_index_arg$.bind(ONE_INTEGER, thread);
						gt_vars.$gt_gather_arg$.bind(TWO_INTEGER, thread);
						gt_vars.$gt_marking_table$.bind(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
						result = gt_methods.gtm_has_superiorP(inferior, superior, mt);
					} finally {
						gt_vars.$gt_marking_table$.rebind(_prev_bind_4, thread);
						gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
						gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
						gt_vars.$gt_link_type$.rebind(_prev_bind_1, thread);
						gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject all_narrower_terms(SubLObject fort, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
					SubLObject _prev_bind_1 = gt_vars.$gt_link_type$.currentBinding(thread);
					SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
					SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
					SubLObject _prev_bind_4 = gt_vars.$gt_marking_table$.currentBinding(thread);
					try {
						gt_vars.$gt_pred$.bind($$tmBroaderTerm, thread);
						gt_vars.$gt_link_type$.bind($ASSERTION, thread);
						gt_vars.$gt_index_arg$.bind(ONE_INTEGER, thread);
						gt_vars.$gt_gather_arg$.bind(TWO_INTEGER, thread);
						gt_vars.$gt_marking_table$.bind(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
						result = gt_methods.gtm_all_inferiors(fort, mt);
					} finally {
						gt_vars.$gt_marking_table$.rebind(_prev_bind_4, thread);
						gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
						gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
						gt_vars.$gt_link_type$.rebind(_prev_bind_1, thread);
						gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject all_broader_terms(SubLObject fort, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
					SubLObject _prev_bind_1 = gt_vars.$gt_link_type$.currentBinding(thread);
					SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
					SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
					SubLObject _prev_bind_4 = gt_vars.$gt_marking_table$.currentBinding(thread);
					try {
						gt_vars.$gt_pred$.bind($$tmBroaderTerm, thread);
						gt_vars.$gt_link_type$.bind($ASSERTION, thread);
						gt_vars.$gt_index_arg$.bind(ONE_INTEGER, thread);
						gt_vars.$gt_gather_arg$.bind(TWO_INTEGER, thread);
						gt_vars.$gt_marking_table$.bind(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
						result = gt_methods.gtm_all_superiors(fort, mt);
					} finally {
						gt_vars.$gt_marking_table$.rebind(_prev_bind_4, thread);
						gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
						gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
						gt_vars.$gt_link_type$.rebind(_prev_bind_1, thread);
						gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLFile me = new gt_modules();

	public static final SubLObject declare_gt_modules_file_alt() {
		declareFunction("tm_dependents", "TM-DEPENDENTS", 1, 1, false);
		declareFunction("narrower_termP", "NARROWER-TERM?", 2, 1, false);
		declareFunction("broader_termP", "BROADER-TERM?", 2, 1, false);
		declareFunction("all_narrower_terms", "ALL-NARROWER-TERMS", 1, 1, false);
		declareFunction("all_broader_terms", "ALL-BROADER-TERMS", 1, 1, false);
		declareFunction("narrower_terms", "NARROWER-TERMS", 1, 1, false);
		declareFunction("broader_terms", "BROADER-TERMS", 1, 1, false);
		return NIL;
	}

	public static SubLObject declare_gt_modules_file() {
		if (SubLFiles.USE_V1) {
		}
		if (SubLFiles.USE_V2) {
			declareFunction("tm_dependents", "TM-DEPENDENTS", 1, 1, false);
			declareFunction("narrower_termP", "NARROWER-TERM?", 2, 1, false);
			declareFunction("broader_termP", "BROADER-TERM?", 2, 1, false);
			declareFunction("all_narrower_terms", "ALL-NARROWER-TERMS", 1, 1, false);
			declareFunction("all_broader_terms", "ALL-BROADER-TERMS", 1, 1, false);
			declareFunction("narrower_terms", "NARROWER-TERMS", 1, 1, false);
			declareFunction("broader_terms", "BROADER-TERMS", 1, 1, false);
		}
		return NIL;
	}

	public static SubLObject declare_gt_modules_file_Previous() {
		return NIL;
	}

	public static SubLObject init_gt_modules_file() {
		return NIL;
	}

	public static final SubLObject setup_gt_modules_file_alt() {
		transitivity.setup_transitivity_module($THESAURUS, $list_alt1);
		{
			SubLObject item_var = $THESAURUS;
			if (NIL == member(item_var, gt_vars.$transitivity_modules$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
				gt_vars.$transitivity_modules$.setDynamicValue(cons(item_var, gt_vars.$transitivity_modules$.getDynamicValue()));
			}
		}
		return NIL;
	}

	public static SubLObject setup_gt_modules_file() {
		if (SubLFiles.USE_V1) {
		}
		if (SubLFiles.USE_V2) {
			transitivity.setup_transitivity_module($THESAURUS, $list_alt1);
			{
				SubLObject item_var = $THESAURUS;
				if (NIL == member(item_var, gt_vars.$transitivity_modules$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
					gt_vars.$transitivity_modules$.setDynamicValue(cons(item_var, gt_vars.$transitivity_modules$.getDynamicValue()));
				}
			}
		}
		return NIL;
	}

	public static SubLObject setup_gt_modules_file_Previous() {
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_gt_modules_file();
	}

	@Override
	public void initializeVariables() {
		init_gt_modules_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_gt_modules_file();
	}

	

	// Internal Constants
	@LispMethod(comment = "Internal Constants")
	private static final SubLSymbol $THESAURUS = makeKeyword("THESAURUS");

	static private final SubLList $list_alt1 = list(new SubLObject[] { makeKeyword("PREDICATE"), reader_make_constant_shell("tmBroaderTerm"), makeKeyword("INDEX-ARG"), ONE_INTEGER, makeKeyword("GATHER-ARG"), TWO_INTEGER, makeKeyword("MIN-SUPERIORS"), makeSymbol("BROADER-TERMS"), makeKeyword("MAX-INFERIORS"), makeSymbol("NARROWER-TERMS"), makeKeyword("ALL-SUPERIORS"), makeSymbol("ALL-BROADER-TERMS"),
			makeKeyword("ALL-INFERIORS"), makeSymbol("ALL-NARROWER-TERMS"), makeKeyword("HAS-SUPERIOR?"), makeSymbol("BROADER-TERM?"), makeKeyword("HAS-INFERIOR?"), makeSymbol("NARROWER-TERM?"), makeKeyword("ALL-DEPENDENT-INFERIORS"), makeSymbol("TM-DEPENDENTS") });

	public static final SubLInteger $int$128 = makeInteger(128);
}

/**
 * Total time: 63 ms
 */
