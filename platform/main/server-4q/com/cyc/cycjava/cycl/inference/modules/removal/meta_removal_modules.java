/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      META-REMOVAL-MODULES
 * source file: /cyc/top/cycl/inference/modules/removal/meta-removal-modules.lisp
 * created:     2019/07/03 17:37:44
 */
public final class meta_removal_modules extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new meta_removal_modules();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules";


    private static final SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");

    static private final SubLList $list2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("META-REMOVAL-COMPLETELY-ENUMERABLE-POS-REQUIRED"), $COST, makeSymbol("META-REMOVAL-COMPLETE-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <not fully bound>))\n    via indirection, by execution of other tactics on the problem\n    and completeness meta-knowledge about the sentence."), makeKeyword("EXAMPLE"), makeString("(#$borderingCountries #$Canada ?WHAT)\n    given other tactics to solve this and\n    (#$completeExtentEnumerable #$borderingCountries)") });

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");

    static private final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("META-REMOVAL-COMPLETELY-DECIDABLE-POS-REQUIRED"), $COST, makeSymbol("META-REMOVAL-COMPLETE-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <fully bound>))\n    via indirection, by execution of other tactics on the problem\n    and completeness meta-knowledge about the sentence."), makeKeyword("EXAMPLE"), makeString("(#$borderingCountries #$Canada #$Mexico)\n    given other tactics to solve this and\n    (#$completeExtentDecidable #$borderingCountries)") });

    // Definitions
    public static final SubLObject meta_removal_complete_pos_required_alt() {
        {
            SubLObject problem = inference_worker.currently_active_problem();
            if (NIL != problem) {
                return makeBoolean((NIL != inference_datastructures_problem.problem_has_possible_removal_tacticP(problem, $TACTICAL)) && (NIL == inference_datastructures_problem.problem_has_complete_possible_removal_tacticP(problem, $TACTICAL)));
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject meta_removal_complete_pos_required() {
        final SubLObject problem = inference_worker.currently_active_problem();
        if (NIL != problem) {
            return makeBoolean((NIL != inference_datastructures_problem.problem_has_possible_removal_tacticP(problem, $TACTICAL)) && (NIL == inference_datastructures_problem.problem_has_complete_possible_removal_tacticP(problem, $TACTICAL)));
        }
        return NIL;
    }

    public static final SubLObject meta_removal_complete_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject productivity = inference_datastructures_problem.problem_total_deductive_removal_productivity(inference_worker.currently_active_problem());
            return inference_datastructures_enumerated_types.cost_for_productivity(productivity);
        }
    }

    public static SubLObject meta_removal_complete_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject productivity = inference_datastructures_problem.problem_total_deductive_removal_productivity(inference_worker.currently_active_problem());
        return inference_datastructures_enumerated_types.cost_for_productivity(productivity);
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("META-REMOVAL-COMPLETELY-ENUMERABLE-POS-REQUIRED"), $COST, makeSymbol("META-REMOVAL-COMPLETE-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <not fully bound>))\n    via indirection, by execution of other tactics on the problem\n    and completeness meta-knowledge about the sentence."), makeKeyword("EXAMPLE"), makeString("(#$borderingCountries #$Canada ?WHAT)\n    given other tactics to solve this and\n    (#$completeExtentEnumerable #$borderingCountries)") });

    public static final SubLObject meta_removal_completely_enumerable_pos_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules.meta_removal_complete_pos_required()) && (NIL != inference_completeness_utilities.inference_completely_enumerable_asentP(asent, mt_relevance_macros.inference_relevant_mt())));
    }

    public static SubLObject meta_removal_completely_enumerable_pos_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != ist_sentence_p(asent, T)) {
            asent = designated_sentence(asent);
        }
        return makeBoolean((NIL != meta_removal_complete_pos_required()) && (NIL != inference_completeness_utilities.inference_completely_enumerable_asentP(asent, mt_relevance_macros.inference_relevant_mt())));
    }

    public static final SubLObject meta_removal_completely_decidable_pos_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules.meta_removal_complete_pos_required()) && (NIL != inference_completeness_utilities.inference_completely_decidable_asentP(asent, mt_relevance_macros.inference_relevant_mt())));
    }

    public static SubLObject meta_removal_completely_decidable_pos_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != ist_sentence_p(asent, T)) {
            asent = designated_sentence(asent);
        }
        return makeBoolean((NIL != meta_removal_complete_pos_required()) && (NIL != inference_completeness_utilities.inference_completely_decidable_asentP(asent, mt_relevance_macros.inference_relevant_mt())));
    }

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("META-REMOVAL-COMPLETELY-DECIDABLE-POS-REQUIRED"), $COST, makeSymbol("META-REMOVAL-COMPLETE-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <fully bound>))\n    via indirection, by execution of other tactics on the problem\n    and completeness meta-knowledge about the sentence."), makeKeyword("EXAMPLE"), makeString("(#$borderingCountries #$Canada #$Mexico)\n    given other tactics to solve this and\n    (#$completeExtentDecidable #$borderingCountries)") });

    public static SubLObject declare_meta_removal_modules_file() {
        declareFunction("meta_removal_complete_pos_required", "META-REMOVAL-COMPLETE-POS-REQUIRED", 0, 0, false);
        declareFunction("meta_removal_complete_pos_cost", "META-REMOVAL-COMPLETE-POS-COST", 1, 1, false);
        declareFunction("meta_removal_completely_enumerable_pos_required", "META-REMOVAL-COMPLETELY-ENUMERABLE-POS-REQUIRED", 1, 1, false);
        declareFunction("meta_removal_completely_decidable_pos_required", "META-REMOVAL-COMPLETELY-DECIDABLE-POS-REQUIRED", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_meta_removal_modules_file() {
        return NIL;
    }

    public static SubLObject setup_meta_removal_modules_file() {
        inference_modules.inference_meta_removal_module($META_REMOVAL_COMPLETELY_ENUMERABLE_POS, $list2);
        inference_modules.inference_meta_removal_module($META_REMOVAL_COMPLETELY_DECIDABLE_POS, $list4);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_meta_removal_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_meta_removal_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_meta_removal_modules_file();
    }

    static {
    }
}

/**
 * Total time: 20 ms
 */
