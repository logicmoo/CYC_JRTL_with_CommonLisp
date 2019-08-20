package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_kb_estimates extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myFingerPrint = "61327860202280ad9b985f2ce37a9df245a017107e6311ca16de10c838a9ddef";
	private static SubLObject $const0$termGeneralityEstimate;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $kw$REMOVAL_TERM_GENERALITY_ESTIMATE_POS_CHECK;
	private static SubLList $list3;
	private static SubLSymbol $kw$OPAQUE;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-kb-estimates.lisp", position = 1600L)
	public static SubLObject removal_term_generality_estimate_pos(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject answer_num = cardinality_estimates.generality_estimate(v_term);
		SubLObject v_bindings = unification_utilities.term_unify(answer_num, num, UNPROVIDED, UNPROVIDED);
		if (NIL != v_bindings) {
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject declare_removal_modules_kb_estimates_file() {
		declareFunction("removal_term_generality_estimate_pos", "REMOVAL-TERM-GENERALITY-ESTIMATE-POS", 1, 1,
				false);
		return NIL;
	}

	public static SubLObject init_removal_modules_kb_estimates_file() {
		return NIL;
	}

	public static SubLObject setup_removal_modules_kb_estimates_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$termGeneralityEstimate);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$termGeneralityEstimate, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_TERM_GENERALITY_ESTIMATE_POS_CHECK, $list3);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_kb_estimates_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_kb_estimates_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_kb_estimates_file();
	}

	static {
		me = new removal_modules_kb_estimates();
		$const0$termGeneralityEstimate = constant_handles
				.reader_make_constant_shell(makeString("termGeneralityEstimate"));
		$kw$POS = makeKeyword("POS");
		$kw$REMOVAL_TERM_GENERALITY_ESTIMATE_POS_CHECK = makeKeyword("REMOVAL-TERM-GENERALITY-ESTIMATE-POS-CHECK");
		$list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("termGeneralityEstimate")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("termGeneralityEstimate")),
						makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-GENERALITY-ESTIMATE-POS"),
				makeKeyword("DOCUMENTATION"), makeString("(#$termGeneralityEstimate <TERM> ?GENERALITY-ESTIMATE)"),
				makeKeyword("EXAMPLE"), makeString("(#$termGeneralityEstimate #$Dog ?NUM)") });
		$kw$OPAQUE = makeKeyword("OPAQUE");
	}
}
/*
 *
 * Total time: 65 ms
 *
 */