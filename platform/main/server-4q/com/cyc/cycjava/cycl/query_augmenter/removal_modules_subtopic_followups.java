/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.query_augmenter;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      REMOVAL-MODULES-SUBTOPIC-FOLLOWUPS
 *  source file: /cyc/top/cycl/query-augmenter/removal-modules-subtopic-followups.lisp
 *  created:     2019/07/03 17:38:57
 */
public final class removal_modules_subtopic_followups extends SubLTranslatedFile implements V02 {
    // // Constructor
    private removal_modules_subtopic_followups() {
    }

    public static final SubLFile me = new removal_modules_subtopic_followups();


    // // Definitions
    public static final SubLObject removal_subtopic_followups_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject subtopic_functions = query_augmenter_subtopic_followups.qa_valid_subtopics_for_term(v_term);
                SubLObject cdolist_list_var = subtopic_functions;
                SubLObject subtopic_function = NIL;
                for (subtopic_function = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subtopic_function = cdolist_list_var.first()) {
                    {
                        SubLObject subtopic_term = list(subtopic_function, v_term);
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg2, subtopic_term, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject formula = list($$qaSubtopicFollowups, v_term, subtopic_term);
                                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_removal_modules_subtopic_followups_file() {
        declareFunction("removal_subtopic_followups_pos_expand", "REMOVAL-SUBTOPIC-FOLLOWUPS-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_subtopic_followups_file() {
        return NIL;
    }

    public static final SubLObject setup_removal_modules_subtopic_followups_file() {
                inference_modules.inference_removal_module($REMOVAL_SUBTOPIC_FOLLOWUPS_POS, $list_alt1);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $REMOVAL_SUBTOPIC_FOLLOWUPS_POS = makeKeyword("REMOVAL-SUBTOPIC-FOLLOWUPS-POS");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("qaSubtopicFollowups")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("qaSubtopicFollowups")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeDouble(0.5), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBTOPIC-FOLLOWUPS-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("Get bindings for arg2 in \n    (#$qaSubtopicFollowups <fully-bound> <not-fully-bound>)\n    from #$subTopicFnTakes*, #$subTopicFnException*."), makeKeyword("EXAMPLE"), makeString("(#$qaSubtopicFollowups #$Dog ?concept)\n    (#$qaSubtopicFollowups (#$JuvenileFn #$Capybara) ?concept)\n    (#$qaSubtopicFollowups #$Automobile (?func #$Automobile))\n   ") });

    public static final SubLObject $$qaSubtopicFollowups = constant_handles.reader_make_constant_shell(makeString("qaSubtopicFollowups"));



    // // Initializers
    public void declareFunctions() {
        declare_removal_modules_subtopic_followups_file();
    }

    public void initializeVariables() {
        init_removal_modules_subtopic_followups_file();
    }

    public void runTopLevelForms() {
        setup_removal_modules_subtopic_followups_file();
    }
}

