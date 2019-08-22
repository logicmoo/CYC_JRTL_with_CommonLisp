package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_kb_estimates extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_kb_estimates();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.modules.removal.removal_modules_kb_estimates";


    private static final SubLObject $$termGeneralityEstimate = reader_make_constant_shell(makeString("termGeneralityEstimate"));



    private static final SubLSymbol $REMOVAL_TERM_GENERALITY_ESTIMATE_POS_CHECK = makeKeyword("REMOVAL-TERM-GENERALITY-ESTIMATE-POS-CHECK");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termGeneralityEstimate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termGeneralityEstimate")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-GENERALITY-ESTIMATE-POS"), makeKeyword("DOCUMENTATION"), makeString("(#$termGeneralityEstimate <TERM> ?GENERALITY-ESTIMATE)"), makeKeyword("EXAMPLE"), makeString("(#$termGeneralityEstimate #$Dog ?NUM)") });



    public static SubLObject removal_term_generality_estimate_pos(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject answer_num = cardinality_estimates.generality_estimate(v_term);
        final SubLObject v_bindings = unification_utilities.term_unify(answer_num, num, UNPROVIDED, UNPROVIDED);
        if (NIL != v_bindings) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_kb_estimates_file() {
        declareFunction("removal_term_generality_estimate_pos", "REMOVAL-TERM-GENERALITY-ESTIMATE-POS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_kb_estimates_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_kb_estimates_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$termGeneralityEstimate);
        preference_modules.doomed_unless_arg_bindable($POS, $$termGeneralityEstimate, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_TERM_GENERALITY_ESTIMATE_POS_CHECK, $list3);
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

    
}

/**
 * Total time: 65 ms
 */
