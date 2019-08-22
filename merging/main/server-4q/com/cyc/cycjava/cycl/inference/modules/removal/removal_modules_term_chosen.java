/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_term_chosen extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_term_chosen();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_chosen";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_term_chosen_pos_cost$ = makeSymbol("*DEFAULT-TERM-CHOSEN-POS-COST*");



    private static final SubLSymbol $REMOVAL_TERM_CHOSEN_POS = makeKeyword("REMOVAL-TERM-CHOSEN-POS");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termChosen"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termChosen"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-CHOSEN-POS-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-CHOSEN-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termChosen <whatever>)\nimmediately succeeds when ARG1 is fully bound\nimmediately fails when ARG1 is not fully bound."), makeKeyword("EXAMPLE"), makeString("(#$termChosen #$Dog)\n    (#$termChosen ?WHAT)") });

    public static final SubLObject removal_term_chosen_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_chosen.make_term_chosen_support(asent), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_term_chosen_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            backward.removal_add_node(make_term_chosen_support(asent), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject make_term_chosen_support_alt(SubLObject asent) {
        return arguments.make_hl_support($CODE, asent, mt_vars.$mt_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject make_term_chosen_support(final SubLObject asent) {
        return arguments.make_hl_support($CODE, asent, mt_vars.$mt_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject declare_removal_modules_term_chosen_file() {
        declareFunction("removal_term_chosen_pos_expand", "REMOVAL-TERM-CHOSEN-POS-EXPAND", 1, 1, false);
        declareFunction("make_term_chosen_support", "MAKE-TERM-CHOSEN-SUPPORT", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termChosen"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termChosen"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-CHOSEN-POS-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-CHOSEN-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termChosen <whatever>)\nimmediately succeeds when ARG1 is fully bound\nimmediately fails when ARG1 is not fully bound."), makeKeyword("EXAMPLE"), makeString("(#$termChosen #$Dog)\n    (#$termChosen ?WHAT)") });

    public static SubLObject init_removal_modules_term_chosen_file() {
        deflexical("*DEFAULT-TERM-CHOSEN-POS-COST*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_term_chosen_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$termChosen);
        inference_modules.inference_removal_module($REMOVAL_TERM_CHOSEN_POS, $list_alt2);
        return NIL;
    }

    public static SubLObject setup_removal_modules_term_chosen_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$termChosen);
            preference_modules.doomed_unless_arg_bindable($POS, $$termChosen, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_TERM_CHOSEN_POS, $list3);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_TERM_CHOSEN_POS, $list_alt2);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_term_chosen_file_Previous() {
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

    
}

/**
 * Total time: 16 ms
 */
