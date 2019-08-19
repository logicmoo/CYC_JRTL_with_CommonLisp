package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_term_chosen extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_chosen";
    public static String myFingerPrint = "280c322a755fbbde25db3f34a3a7dd3a917a45f314ed1a9615cf1d35a72385f6";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-chosen.lisp", position = 700L)
    private static SubLSymbol $default_term_chosen_pos_cost$;
    private static SubLObject $$termChosen;
    private static SubLSymbol $POS;
    private static SubLSymbol $REMOVAL_TERM_CHOSEN_POS;
    private static SubLList $list3;
    private static SubLSymbol $CODE;
    private static SubLSymbol $TRUE_MON;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-chosen.lisp", position = 700L)
    public static SubLObject removal_term_chosen_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            backward.removal_add_node(make_term_chosen_support(asent), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-chosen.lisp", position = 1500L)
    public static SubLObject make_term_chosen_support(SubLObject asent) {
        return arguments.make_hl_support($CODE, asent, mt_vars.$mt_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject declare_removal_modules_term_chosen_file() {
        declareFunction(myName, "removal_term_chosen_pos_expand", "REMOVAL-TERM-CHOSEN-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "make_term_chosen_support", "MAKE-TERM-CHOSEN-SUPPORT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_term_chosen_file() {
        $default_term_chosen_pos_cost$ = deflexical("*DEFAULT-TERM-CHOSEN-POS-COST*", ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_term_chosen_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$termChosen);
        preference_modules.doomed_unless_arg_bindable($POS, $$termChosen, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_TERM_CHOSEN_POS, $list3);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_term_chosen_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_term_chosen_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_term_chosen_file();
    }

    static {
        me = new removal_modules_term_chosen();
        $default_term_chosen_pos_cost$ = null;
        $$termChosen = makeConstSym(("termChosen"));
        $POS = makeKeyword("POS");
        $REMOVAL_TERM_CHOSEN_POS = makeKeyword("REMOVAL-TERM-CHOSEN-POS");
        $list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("termChosen")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termChosen")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-TERM-CHOSEN-POS-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-CHOSEN-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$termChosen <whatever>)\nimmediately succeeds when ARG1 is fully bound\nimmediately fails when ARG1 is not fully bound."), makeKeyword("EXAMPLE"), makeString("(#$termChosen #$Dog)\n    (#$termChosen ?WHAT)") });
        $CODE = makeKeyword("CODE");
        $TRUE_MON = makeKeyword("TRUE-MON");
    }
}
/*
 *
 * Total time: 16 ms
 *
 */