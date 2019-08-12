/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.cycl_utilities.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-WORKER-SPLIT
 * source file: /cyc/top/cycl/inference/harness/inference-worker-split.lisp
 * created:     2019/07/03 17:37:40
 */
public final class inference_worker_split extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_worker_split();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_split";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $split_module$ = makeSymbol("*SPLIT-MODULE*");

    // deflexical
    /**
     * The default preference level used for split tactics. Splits are independent
     * of each other, so no bindings from one half could possibly make the other
     * half any more solvable. Hence, all splits should be preferred by default.
     * However, if any split is disallowed, the entire problem should be deemed
     * no-good.
     */
    @LispMethod(comment = "The default preference level used for split tactics. Splits are independent\r\nof each other, so no bindings from one half could possibly make the other\r\nhalf any more solvable. Hence, all splits should be preferred by default.\r\nHowever, if any split is disallowed, the entire problem should be deemed\r\nno-good.\ndeflexical\nThe default preference level used for split tactics. Splits are independent\nof each other, so no bindings from one half could possibly make the other\nhalf any more solvable. Hence, all splits should be preferred by default.\nHowever, if any split is disallowed, the entire problem should be deemed\nno-good.")
    public static final SubLSymbol $split_tactic_default_preference_level$ = makeSymbol("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $split_tactic_default_preference_level_justification$ = makeSymbol("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*");

    // defparameter
    // Temporary control variable, @todo hard-code to T
    /**
     * Temporary control variable, @todo hard-code to T
     */
    @LispMethod(comment = "Temporary control variable, @todo hard-code to T\ndefparameter")
    public static final SubLSymbol $meta_split_tactics_enabledP$ = makeSymbol("*META-SPLIT-TACTICS-ENABLED?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $meta_split_tactic_default_preference_level$ = makeSymbol("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $meta_split_tactic_default_preference_level_justification$ = makeSymbol("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*");

    // defparameter
    // If you set this to non-nil, it will trump the following variables.
    /**
     * If you set this to non-nil, it will trump the following variables.
     */
    @LispMethod(comment = "If you set this to non-nil, it will trump the following variables.\ndefparameter")
    private static final SubLSymbol $meta_split_criteria$ = makeSymbol("*META-SPLIT-CRITERIA*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $meta_split_tactics_do_single_literals_firstP$ = makeSymbol("*META-SPLIT-TACTICS-DO-SINGLE-LITERALS-FIRST?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $meta_split_favors_problem_reuseP$ = makeSymbol("*META-SPLIT-FAVORS-PROBLEM-REUSE?*");

    static private final SubLList $list1 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("INDEX-VAR"), makeSymbol("SPLIT-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym2$SPLIT_LINK_VAR = makeUninternedSymbol("SPLIT-LINK-VAR");

    private static final SubLSymbol DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS_NUMBERED = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS-NUMBERED");

    static private final SubLSymbol $sym6$PROBLEM_LINK_INDEX_OPEN_ = makeSymbol("PROBLEM-LINK-INDEX-OPEN?");

    static private final SubLString $str7$_s_is_not_a_supporting_mapped_pro = makeString("~s is not a supporting mapped problem of ~s.");

    static private final SubLString $str8$couldn_t_find_any_split_tactics_f = makeString("couldn't find any split tactics for ~s");

    private static final SubLSymbol $sym9$HL_VAR_ = makeSymbol("HL-VAR?");

    private static final SubLString $str11$Could_not_find_the_link_for__a = makeString("Could not find the link for ~a");

    private static final SubLSymbol SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");

    private static final SubLString $str13$Generalized_tactic__a_did_not_ind = makeString("Generalized tactic ~a did not indicate a valid supporting mapped problem");

    private static final SubLString $str14$Tried_to_make_a_split_link_with_l = makeString("Tried to make a split link with less than two supporting problems: ~a");

    private static final SubLString $$$the_default_for_split_tactics = makeString("the default for split tactics");

    public static final SubLSymbol $determine_new_split_tactics_module$ = makeSymbol("*DETERMINE-NEW-SPLIT-TACTICS-MODULE*");

    private static final SubLSymbol $DETERMINE_NEW_SPLIT_TACTICS = makeKeyword("DETERMINE-NEW-SPLIT-TACTICS");

    static private final SubLString $str24$the_default_for_meta_split_tactic = makeString("the default for meta-split tactics");

    static private final SubLString $str26$unexpected_meta_structural_tactic = makeString("unexpected meta-structural tactic ~s");

    static private final SubLList $list27 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ALL-SINGLE-LITERAL"), makeKeyword("ALL-THE-REST"));

    static private final SubLList $list28 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ONE-CLOSED-PROBLEM-REUSE"), makeKeyword("ALL-SINGLE-LITERAL-PROBLEM-REUSE"), makeKeyword("ONE-CLOSED"), makeKeyword("ALL-THE-REST"));

    static private final SubLList $list29 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ONE-CLOSED"), makeKeyword("ALL-THE-REST"));

    private static final SubLSymbol $ONE_NO_GOOD = makeKeyword("ONE-NO-GOOD");

    private static final SubLSymbol $ALL_SINGLE_LITERAL = makeKeyword("ALL-SINGLE-LITERAL");

    private static final SubLSymbol $ALL_PROBLEM_REUSE = makeKeyword("ALL-PROBLEM-REUSE");

    private static final SubLSymbol $ONE_CLOSED_PROBLEM_REUSE = makeKeyword("ONE-CLOSED-PROBLEM-REUSE");

    private static final SubLSymbol $ALL_SINGLE_LITERAL_PROBLEM_REUSE = makeKeyword("ALL-SINGLE-LITERAL-PROBLEM-REUSE");

    private static final SubLSymbol $ALL_THE_REST = makeKeyword("ALL-THE-REST");

    static private final SubLString $str37$Unknown_meta_split_criterion__s = makeString("Unknown meta-split criterion ~s");

    static private final SubLList $list38 = list(makeSymbol("INDEX"), makeSymbol("SUPPORTING-PROBLEM"));

    // Definitions
    public static final SubLObject split_link_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($SPLIT == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    // Definitions
    public static SubLObject split_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($SPLIT == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    /**
     *
     *
     * @return split-link-p, either the already existing one or a new one.
     */
    @LispMethod(comment = "@return split-link-p, either the already existing one or a new one.")
    public static final SubLObject maybe_new_split_link_alt(SubLObject supported_problem, SubLObject dnf_clause) {
        {
            SubLObject split_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.problem_first_split_argument_link(supported_problem);
            if (NIL == split_link) {
                {
                    SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
                    SubLObject supporting_mapped_problems = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.find_or_create_split_link_supporting_problems(store, dnf_clause);
                    split_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.new_split_link(supported_problem, supporting_mapped_problems);
                }
            }
            return split_link;
        }
    }

    /**
     *
     *
     * @return split-link-p, either the already existing one or a new one.
     */
    @LispMethod(comment = "@return split-link-p, either the already existing one or a new one.")
    public static SubLObject maybe_new_split_link(final SubLObject supported_problem, final SubLObject dnf_clause) {
        SubLObject split_link = problem_first_split_argument_link(supported_problem);
        if (NIL == split_link) {
            final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
            final SubLObject supporting_mapped_problems = find_or_create_split_link_supporting_problems(store, dnf_clause, supported_problem);
            split_link = new_split_link(supported_problem, supporting_mapped_problems);
        }
        return split_link;
    }

    public static final SubLObject new_split_link_alt(SubLObject supported_problem, SubLObject supporting_mapped_problems) {
        {
            SubLObject split_link = inference_datastructures_problem_link.new_problem_link($SPLIT, supported_problem);
            SubLObject cdolist_list_var = supporting_mapped_problems;
            SubLObject supporting_mapped_problem = NIL;
            for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, split_link);
            }
            inference_worker.propagate_problem_link(split_link);
            return split_link;
        }
    }

    public static SubLObject new_split_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problems) {
        final SubLObject split_link = inference_datastructures_problem_link.new_problem_link($SPLIT, supported_problem);
        SubLObject cdolist_list_var = supporting_mapped_problems;
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, split_link);
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        } 
        inference_worker.propagate_problem_link(split_link);
        return split_link;
    }

    public static final SubLObject destroy_split_link_alt(SubLObject split_link) {
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.split_link_tactics_int(split_link);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
                    inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
                }
            }
        }
        return NIL;
    }

    public static SubLObject destroy_split_link(final SubLObject split_link) {
        SubLObject cdolist_list_var = split_link_tactics_int(split_link);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
                inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject do_split_link_open_supporting_mapped_problems_numbered_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject supporting_mapped_problem_var = NIL;
                    SubLObject index_var = NIL;
                    SubLObject split_link = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    supporting_mapped_problem_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    index_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    split_link = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject split_link_var = $sym2$SPLIT_LINK_VAR;
                            return list(CLET, list(list(split_link_var, split_link)), list(DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS_NUMBERED, list(supporting_mapped_problem_var, index_var, split_link_var), listS(PWHEN, list($sym6$PROBLEM_LINK_INDEX_OPEN_, split_link_var, index_var), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt1);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_split_link_open_supporting_mapped_problems_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_mapped_problem_var = NIL;
        SubLObject index_var = NIL;
        SubLObject split_link = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        supporting_mapped_problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        index_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        split_link = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject split_link_var = $sym2$SPLIT_LINK_VAR;
            return list(CLET, list(list(split_link_var, split_link)), list(DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS_NUMBERED, list(supporting_mapped_problem_var, index_var, split_link_var), listS(PWHEN, list($sym6$PROBLEM_LINK_INDEX_OPEN_, split_link_var, index_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list1);
        return NIL;
    }

    public static final SubLObject split_link_tactic_alt(SubLObject split_link, SubLObject supporting_mapped_problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subl_promotions.memberP(supporting_mapped_problem, inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link), symbol_function(EQ), UNPROVIDED)) {
                    Errors.error($str_alt7$_s_is_not_a_supporting_mapped_pro, supporting_mapped_problem, split_link);
                }
            }
            {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
                SubLObject tactic = NIL;
                for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(tactic, $split_module$.getDynamicValue(thread))) {
                        {
                            SubLObject candidate_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.find_split_tactic_supporting_mapped_problem(tactic);
                            if (candidate_mapped_problem == supporting_mapped_problem) {
                                return tactic;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject split_link_tactic(final SubLObject split_link, final SubLObject supporting_mapped_problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(supporting_mapped_problem, inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link), symbol_function(EQ), UNPROVIDED))) {
            Errors.error($str7$_s_is_not_a_supporting_mapped_pro, supporting_mapped_problem, split_link);
        }
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(tactic, $split_module$.getDynamicValue(thread))) {
                final SubLObject candidate_mapped_problem = find_split_tactic_supporting_mapped_problem(tactic);
                if (candidate_mapped_problem.eql(supporting_mapped_problem)) {
                    return tactic;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static final SubLObject split_link_tactics_alt(SubLObject split_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tactics = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.split_link_tactics_int(split_link);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == tactics) {
                        Errors.error($str_alt8$couldn_t_find_any_split_tactics_f, split_link);
                    }
                }
                return tactics;
            }
        }
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static SubLObject split_link_tactics(final SubLObject split_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tactics = split_link_tactics_int(split_link);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == tactics)) {
            Errors.error($str8$couldn_t_find_any_split_tactics_f, split_link);
        }
        return tactics;
    }

    public static final SubLObject split_link_tactics_int_alt(SubLObject split_link) {
        {
            SubLObject tactics = NIL;
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_split.generalized_split_tactic_p(tactic)) {
                    tactics = cons(tactic, tactics);
                }
            }
            return nreverse(tactics);
        }
    }

    public static SubLObject split_link_tactics_int(final SubLObject split_link) {
        SubLObject tactics = NIL;
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != generalized_split_tactic_p(tactic)) {
                tactics = cons(tactic, tactics);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return nreverse(tactics);
    }

    /**
     * Closes all open supporting mapped problems of SPLIT-LINK and considers that they could be irrelevant.
     */
    @LispMethod(comment = "Closes all open supporting mapped problems of SPLIT-LINK and considers that they could be irrelevant.")
    public static final SubLObject close_split_link_alt(SubLObject split_link) {
        {
            SubLObject split_link_var = split_link;
            SubLObject index = ZERO_INTEGER;
            SubLObject link_var = split_link_var;
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject supporting_mapped_problem = NIL;
            for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                    if (NIL != inference_datastructures_problem_link.problem_link_index_openP(split_link_var, index)) {
                        inference_datastructures_problem_link.problem_link_close_index(split_link, index);
                        inference_worker.consider_that_mapped_problem_could_be_irrelevant(supporting_mapped_problem, split_link);
                    }
                    index = add(index, ONE_INTEGER);
                }
            }
        }
        return NIL;
    }

    /**
     * Closes all open supporting mapped problems of SPLIT-LINK and considers that they could be irrelevant.
     */
    @LispMethod(comment = "Closes all open supporting mapped problems of SPLIT-LINK and considers that they could be irrelevant.")
    public static SubLObject close_split_link(final SubLObject split_link) {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, supporting_mapped_problem)) {
                if (NIL != inference_datastructures_problem_link.problem_link_index_openP(split_link, index)) {
                    inference_datastructures_problem_link.problem_link_close_index(split_link, index);
                    inference_worker.consider_that_mapped_problem_could_be_irrelevant(supporting_mapped_problem, split_link);
                }
                index = add(index, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject find_or_create_split_link_supporting_problems(SubLObject store, SubLObject dnf_clause) {
        {
            SubLObject split_clauses = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.determine_shared_variable_islands(dnf_clause);
            SubLObject supporting_mapped_problems = NIL;
            SubLObject cdolist_list_var = split_clauses;
            SubLObject subquery = NIL;
            for (subquery = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subquery = cdolist_list_var.first()) {
                {
                    SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, subquery, UNPROVIDED);
                    supporting_mapped_problems = cons(supporting_mapped_problem, supporting_mapped_problems);
                }
            }
            return nreverse(supporting_mapped_problems);
        }
    }

    public static SubLObject find_or_create_split_link_supporting_problems(final SubLObject store, final SubLObject dnf_clause, final SubLObject supported_problem) {
        final SubLObject split_clauses = determine_shared_variable_islands(dnf_clause);
        final SubLObject supported_problem_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        SubLObject supporting_mapped_problems = NIL;
        SubLObject cdolist_list_var = split_clauses;
        SubLObject subquery = NIL;
        subquery = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject subquery_free_hl_vars = variables.sort_hl_variable_list_memoized(intersection(cycl_utilities.expression_gather(subquery, $sym9$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), supported_problem_free_hl_vars, UNPROVIDED, UNPROVIDED));
            final SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, subquery, subquery_free_hl_vars, UNPROVIDED);
            supporting_mapped_problems = cons(supporting_mapped_problem, supporting_mapped_problems);
            cdolist_list_var = cdolist_list_var.rest();
            subquery = cdolist_list_var.first();
        } 
        return nreverse(supporting_mapped_problems);
    }

    public static final SubLObject split_tactic_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && ($split_module$.getDynamicValue(thread) == inference_datastructures_tactic.tactic_hl_module(v_object)));
        }
    }

    public static SubLObject split_tactic_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && $split_module$.getDynamicValue(thread).eql(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }

    public static final SubLObject new_split_tactic_alt(SubLObject supported_problem, SubLObject index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tactic = inference_datastructures_tactic.new_tactic(supported_problem, $split_module$.getDynamicValue(thread), index);
                SubLObject prob = supported_problem;
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
                                if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                    {
                                        SubLObject inference_var = inference;
                                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                        SubLObject state = NIL;
                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            {
                                                SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
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
                return tactic;
            }
        }
    }

    public static SubLObject new_split_tactic(final SubLObject supported_problem, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(supported_problem, $split_module$.getDynamicValue(thread), index);
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$1 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$1);
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
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$2 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$2)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$2);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }

    public static final SubLObject split_tactic_supporting_mapped_problem_index_alt(SubLObject tactic) {
        return inference_datastructures_tactic.tactic_data(tactic);
    }

    public static SubLObject split_tactic_supporting_mapped_problem_index(final SubLObject tactic) {
        return inference_datastructures_tactic.tactic_data(tactic);
    }

    public static final SubLObject split_tactic_link_alt(SubLObject split_tactic) {
        {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
            SubLObject split_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.problem_sole_split_argument_link(problem);
            if (NIL != split_link) {
                return split_link;
            } else {
                return Errors.error($str_alt10$Could_not_find_the_link_for__a, split_tactic);
            }
        }
    }

    public static SubLObject split_tactic_link(final SubLObject split_tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
        final SubLObject split_link = problem_sole_split_argument_link(problem);
        if (NIL != split_link) {
            return split_link;
        }
        return Errors.error($str11$Could_not_find_the_link_for__a, split_tactic);
    }

    public static final SubLObject find_split_tactic_supporting_mapped_problem_alt(SubLObject tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(tactic, SPLIT_TACTIC_P);
            {
                SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.split_tactic_supporting_mapped_problem_index(tactic);
                SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.split_tactic_link(tactic);
                SubLObject supporting_mapped_problem = inference_datastructures_problem_link.find_supporting_mapped_problem_by_index(link, index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == supporting_mapped_problem) {
                        Errors.error($str_alt12$Generalized_tactic__a_did_not_ind, tactic);
                    }
                }
                return values(supporting_mapped_problem, link);
            }
        }
    }

    public static SubLObject find_split_tactic_supporting_mapped_problem(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != split_tactic_p(tactic) : "! inference_worker_split.split_tactic_p(tactic) " + ("inference_worker_split.split_tactic_p(tactic) " + "CommonSymbols.NIL != inference_worker_split.split_tactic_p(tactic) ") + tactic;
        final SubLObject index = split_tactic_supporting_mapped_problem_index(tactic);
        final SubLObject link = split_tactic_link(tactic);
        final SubLObject supporting_mapped_problem = inference_datastructures_problem_link.find_supporting_mapped_problem_by_index(link, index);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == supporting_mapped_problem)) {
            Errors.error($str13$Generalized_tactic__a_did_not_ind, tactic);
        }
        return values(supporting_mapped_problem, link);
    }

    public static final SubLObject find_split_tactic_supporting_problem_alt(SubLObject tactic) {
        return inference_datastructures_problem_link.mapped_problem_problem(com.cyc.cycjava.cycl.inference.harness.inference_worker_split.find_split_tactic_supporting_mapped_problem(tactic));
    }

    public static SubLObject find_split_tactic_supporting_problem(final SubLObject tactic) {
        return inference_datastructures_problem_link.mapped_problem_problem(find_split_tactic_supporting_mapped_problem(tactic));
    }

    /**
     * Discards all split tactics on TACTIC's problem, other than TACTIC.
     */
    @LispMethod(comment = "Discards all split tactics on TACTIC\'s problem, other than TACTIC.")
    public static final SubLObject discard_all_other_possible_split_tactics_alt(SubLObject tactic) {
        if (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))) {
            {
                SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
                return inference_worker.discard_possible_tactics_int(problem, NIL, NIL, $SPLIT, tactic, NIL);
            }
        }
        return NIL;
    }

    /**
     * Discards all split tactics on TACTIC's problem, other than TACTIC.
     */
    @LispMethod(comment = "Discards all split tactics on TACTIC\'s problem, other than TACTIC.")
    public static SubLObject discard_all_other_possible_split_tactics(final SubLObject tactic) {
        if (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            return inference_worker.discard_possible_tactics_int(problem, NIL, NIL, $SPLIT, tactic, NIL);
        }
        return NIL;
    }

    public static final SubLObject determine_new_split_tactics_alt(SubLObject supported_problem, SubLObject dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject split_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.maybe_new_split_link(supported_problem, dnf_clause);
                SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(split_link);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!supporting_problem_count.numG(ONE_INTEGER)) {
                        Errors.error($str_alt13$Tried_to_make_a_split_link_with_l, split_link);
                    }
                }
                inference_worker.consider_that_problem_could_be_no_good(supported_problem, NIL, $TACTICAL, T);
                if (NIL == inference_worker.no_good_problem_p(supported_problem, $TACTICAL)) {
                    {
                        SubLObject index = ZERO_INTEGER;
                        SubLObject link_var = split_link;
                        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                        SubLObject supporting_mapped_problem = NIL;
                        for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_worker_split.new_split_tactic(supported_problem, index);
                                index = add(index, ONE_INTEGER);
                            }
                        }
                    }
                }
            }
            return supported_problem;
        }
    }

    public static SubLObject determine_new_split_tactics(final SubLObject supported_problem, final SubLObject dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject split_link = maybe_new_split_link(supported_problem, dnf_clause);
        final SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(split_link);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!supporting_problem_count.numG(ONE_INTEGER))) {
            Errors.error($str14$Tried_to_make_a_split_link_with_l, split_link);
        }
        inference_worker.consider_that_problem_could_be_no_good(supported_problem, NIL, $TACTICAL, T);
        if (NIL == inference_worker.no_good_problem_p(supported_problem, $TACTICAL)) {
            SubLObject index = ZERO_INTEGER;
            final SubLObject link_var = split_link;
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                    new_split_tactic(supported_problem, index);
                    index = add(index, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            } 
        }
        return supported_problem;
    }

    public static final SubLObject compute_strategic_properties_of_split_tactic_alt(SubLObject tactic, SubLObject supporting_problem, SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
                if (NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject preference_level = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.compute_split_tactic_preference_level(problem, supporting_problem, $TACTICAL);
                        SubLObject justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        inference_datastructures_tactic.set_tactic_preference_level(tactic, preference_level, justification);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject strategic_preference_level = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.compute_split_tactic_preference_level(problem, supporting_problem, strategy);
                    SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, strategic_preference_level, justification);
                }
                {
                    SubLObject strategic_productivity = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.compute_split_tactic_productivity(problem, supporting_problem, strategy);
                    inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, strategic_productivity);
                }
            }
            return tactic;
        }
    }

    public static SubLObject compute_strategic_properties_of_split_tactic(final SubLObject tactic, final SubLObject supporting_problem, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        if (NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
            thread.resetMultipleValues();
            final SubLObject preference_level = compute_split_tactic_preference_level(problem, supporting_problem, $TACTICAL);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_datastructures_tactic.set_tactic_preference_level(tactic, preference_level, justification);
        }
        thread.resetMultipleValues();
        final SubLObject strategic_preference_level = compute_split_tactic_preference_level(problem, supporting_problem, strategy);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, strategic_preference_level, justification);
        final SubLObject strategic_productivity = compute_split_tactic_productivity(problem, supporting_problem, strategy);
        inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, strategic_productivity);
        return tactic;
    }

    public static final SubLObject compute_split_tactic_productivity_alt(SubLObject supported_problem, SubLObject supporting_problem, SubLObject strategy) {
        return inference_lookahead_productivity.memoized_problem_max_removal_productivity(supporting_problem, strategy);
    }

    public static SubLObject compute_split_tactic_productivity(final SubLObject supported_problem, final SubLObject supporting_problem, final SubLObject strategy) {
        return inference_lookahead_productivity.memoized_problem_max_removal_productivity(supporting_problem, strategy);
    }

    public static final SubLObject compute_split_tactic_preference_level_alt(SubLObject supported_problem, SubLObject supporting_problem, SubLObject strategic_context) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject supporting_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(supporting_problem, strategic_context, NIL);
                SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (supporting_preference_level != $DISALLOWED) {
                    supporting_preference_level = $split_tactic_default_preference_level$.getGlobalValue();
                    justification = $split_tactic_default_preference_level_justification$.getGlobalValue();
                }
                return values(supporting_preference_level, justification);
            }
        }
    }

    public static SubLObject compute_split_tactic_preference_level(final SubLObject supported_problem, final SubLObject supporting_problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject supporting_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(supporting_problem, strategic_context, NIL);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == preference_modules.disallowed_or_doomed_preference_level_p(supporting_preference_level)) {
            supporting_preference_level = $split_tactic_default_preference_level$.getGlobalValue();
            justification = $split_tactic_default_preference_level_justification$.getGlobalValue();
        }
        return values(supporting_preference_level, justification);
    }

    public static final SubLObject execute_split_tactic_alt(SubLObject tactic) {
        {
            SubLObject split_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.split_tactic_link(tactic);
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.split_tactic_supporting_mapped_problem_index(tactic);
            inference_worker.problem_link_open_and_repropagate_index(split_link, index);
        }
        return tactic;
    }

    public static SubLObject execute_split_tactic(final SubLObject tactic) {
        final SubLObject split_link = split_tactic_link(tactic);
        final SubLObject index = split_tactic_supporting_mapped_problem_index(tactic);
        inference_worker.problem_link_open_and_repropagate_index(split_link, index);
        return tactic;
    }

    /**
     * PROBLEM should have exactly one argument link which is a split link.
     * Signals an error if this is not the case.
     */
    @LispMethod(comment = "PROBLEM should have exactly one argument link which is a split link.\r\nSignals an error if this is not the case.\nPROBLEM should have exactly one argument link which is a split link.\nSignals an error if this is not the case.")
    public static final SubLObject problem_sole_split_argument_link_alt(SubLObject problem) {
        return inference_datastructures_problem.problem_sole_argument_link_of_type(problem, $SPLIT);
    }

    /**
     * PROBLEM should have exactly one argument link which is a split link.
     * Signals an error if this is not the case.
     */
    @LispMethod(comment = "PROBLEM should have exactly one argument link which is a split link.\r\nSignals an error if this is not the case.\nPROBLEM should have exactly one argument link which is a split link.\nSignals an error if this is not the case.")
    public static SubLObject problem_sole_split_argument_link(final SubLObject problem) {
        return inference_datastructures_problem.problem_sole_argument_link_of_type(problem, $SPLIT);
    }

    /**
     *
     *
     * @return nil or split-link-p
     */
    @LispMethod(comment = "@return nil or split-link-p")
    public static final SubLObject problem_first_split_argument_link_alt(SubLObject problem) {
        return inference_datastructures_problem.problem_first_argument_link_of_type(problem, $SPLIT);
    }

    /**
     *
     *
     * @return nil or split-link-p
     */
    @LispMethod(comment = "@return nil or split-link-p")
    public static SubLObject problem_first_split_argument_link(final SubLObject problem) {
        return inference_datastructures_problem.problem_first_argument_link_of_type(problem, $SPLIT);
    }

    public static final SubLObject problem_has_split_argument_linkP_alt(SubLObject problem) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.harness.inference_worker_split.problem_first_split_argument_link(problem));
    }

    public static SubLObject problem_has_split_argument_linkP(final SubLObject problem) {
        return list_utilities.sublisp_boolean(problem_first_split_argument_link(problem));
    }

    public static final SubLObject split_tactic_lookahead_problem_alt(SubLObject split_tactic) {
        {
            SubLObject supporting_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.find_split_tactic_supporting_mapped_problem(split_tactic);
            return inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
        }
    }

    public static SubLObject split_tactic_lookahead_problem(final SubLObject split_tactic) {
        final SubLObject supporting_mapped_problem = find_split_tactic_supporting_mapped_problem(split_tactic);
        return inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
    }

    public static final SubLObject split_link_supporting_problems_with_variables_alt(SubLObject split_link) {
        {
            SubLObject result = NIL;
            SubLObject link_var = split_link;
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject supporting_mapped_problem = NIL;
            for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                    {
                        SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                        SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                        if (NIL != inference_datastructures_problem.open_problem_p(problem)) {
                            result = cons(problem, result);
                        }
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject split_link_supporting_problems_with_variables(final SubLObject split_link) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, supporting_mapped_problem)) {
                final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (NIL != inference_datastructures_problem.open_problem_p(problem)) {
                    result = cons(problem, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     *
     *
     * @return 0 proof-p
     * @return 1 whether the returned proof was newly created
     */
    @LispMethod(comment = "@return 0 proof-p\r\n@return 1 whether the returned proof was newly created")
    public static final SubLObject new_split_proof_alt(SubLObject link, SubLObject subproofs_with_sub_bindings) {
        return inference_worker_join_ordered.new_conjunctive_proof(link, subproofs_with_sub_bindings);
    }

    /**
     *
     *
     * @return 0 proof-p
     * @return 1 whether the returned proof was newly created
     */
    @LispMethod(comment = "@return 0 proof-p\r\n@return 1 whether the returned proof was newly created")
    public static SubLObject new_split_proof(final SubLObject link, final SubLObject subproofs_with_sub_bindings) {
        return inference_worker_join_ordered.new_conjunctive_proof(link, subproofs_with_sub_bindings);
    }

    public static final SubLObject split_proof_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && ($SPLIT == inference_datastructures_proof.proof_type(v_object)));
    }

    public static SubLObject split_proof_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && ($SPLIT == inference_datastructures_proof.proof_type(v_object)));
    }

    /**
     * First we translate the subproofs' bindings into terms of SPLIT-LINK's
     * supported problem, then we cartesian-product them and make new proofs.
     */
    @LispMethod(comment = "First we translate the subproofs\' bindings into terms of SPLIT-LINK\'s\r\nsupported problem, then we cartesian-product them and make new proofs.\nFirst we translate the subproofs\' bindings into terms of SPLIT-LINK\'s\nsupported problem, then we cartesian-product them and make new proofs.")
    public static final SubLObject bubble_up_proof_to_split_link_alt(SubLObject supporting_proof, SubLObject my_variable_map, SubLObject split_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject proofs = NIL;
                SubLObject supporting_mapped_proof_lists_by_supporting_problem = NIL;
                SubLObject my_supporting_problem = inference_datastructures_proof.proof_supported_problem(supporting_proof);
                {
                    SubLObject link_var = split_link;
                    SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    SubLObject supporting_mapped_problem = NIL;
                    for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            {
                                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                                if ((supporting_problem == my_supporting_problem) && (NIL != bindings.bindings_equalP(variable_map, my_variable_map))) {
                                    {
                                        SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(supporting_proof);
                                        SubLObject sub_proof_bindings = bindings.transfer_variable_map_to_bindings(my_variable_map, proof_bindings);
                                        supporting_mapped_proof_lists_by_supporting_problem = cons(list(cons(supporting_proof, sub_proof_bindings)), supporting_mapped_proof_lists_by_supporting_problem);
                                    }
                                } else {
                                    {
                                        SubLObject proofs_with_bindings = NIL;
                                        SubLObject status_var = $PROVEN;
                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(supporting_problem));
                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                SubLObject proof_list = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject cdolist_list_var_1 = proof_list;
                                                    SubLObject proof = NIL;
                                                    for (proof = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , proof = cdolist_list_var_1.first()) {
                                                        if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                                                            {
                                                                SubLObject sub_proof_bindings = bindings.transfer_variable_map_to_bindings(variable_map, inference_datastructures_proof.proof_bindings(proof));
                                                                proofs_with_bindings = cons(cons(proof, sub_proof_bindings), proofs_with_bindings);
                                                            }
                                                        }
                                                    }
                                                }
                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                            }
                                        } 
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        supporting_mapped_proof_lists_by_supporting_problem = cons(proofs_with_bindings, supporting_mapped_proof_lists_by_supporting_problem);
                                    }
                                }
                            }
                        }
                    }
                }
                supporting_mapped_proof_lists_by_supporting_problem = nreverse(supporting_mapped_proof_lists_by_supporting_problem);
                {
                    SubLObject mapped_subproof_lists = list_utilities.cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = mapped_subproof_lists;
                    SubLObject mapped_subproof_list = NIL;
                    for (mapped_subproof_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapped_subproof_list = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject proof = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.new_split_proof(split_link, mapped_subproof_list);
                            SubLObject newP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != newP) {
                                proofs = cons(proof, proofs);
                            } else {
                                inference_worker.possibly_note_proof_processed(supporting_proof);
                            }
                        }
                    }
                }
                proofs = nreverse(proofs);
                {
                    SubLObject cdolist_list_var = proofs;
                    SubLObject proof = NIL;
                    for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                        inference_worker.bubble_up_proof(proof);
                    }
                }
                return proofs;
            }
        }
    }

    /**
     * First we translate the subproofs' bindings into terms of SPLIT-LINK's
     * supported problem, then we cartesian-product them and make new proofs.
     */
    @LispMethod(comment = "First we translate the subproofs\' bindings into terms of SPLIT-LINK\'s\r\nsupported problem, then we cartesian-product them and make new proofs.\nFirst we translate the subproofs\' bindings into terms of SPLIT-LINK\'s\nsupported problem, then we cartesian-product them and make new proofs.")
    public static SubLObject bubble_up_proof_to_split_link(final SubLObject supporting_proof, final SubLObject my_variable_map, final SubLObject split_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proofs = NIL;
        SubLObject supporting_mapped_proof_lists_by_supporting_problem = NIL;
        final SubLObject my_supporting_problem = inference_datastructures_proof.proof_supported_problem(supporting_proof);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, supporting_mapped_problem)) {
                final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (supporting_problem.eql(my_supporting_problem) && (NIL != bindings.bindings_equalP(variable_map, my_variable_map))) {
                    final SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(supporting_proof);
                    final SubLObject sub_proof_bindings = bindings.transfer_variable_map_to_bindings(my_variable_map, proof_bindings);
                    supporting_mapped_proof_lists_by_supporting_problem = cons(list(cons(supporting_proof, sub_proof_bindings)), supporting_mapped_proof_lists_by_supporting_problem);
                } else {
                    SubLObject proofs_with_bindings = NIL;
                    final SubLObject status_var = $PROVEN;
                    SubLObject iteration_state;
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(supporting_problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        final SubLObject proof_list = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject cdolist_list_var_$3 = proof_list;
                        SubLObject proof = NIL;
                        proof = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                                final SubLObject sub_proof_bindings2 = bindings.transfer_variable_map_to_bindings(variable_map, inference_datastructures_proof.proof_bindings(proof));
                                proofs_with_bindings = cons(cons(proof, sub_proof_bindings2), proofs_with_bindings);
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            proof = cdolist_list_var_$3.first();
                        } 
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    supporting_mapped_proof_lists_by_supporting_problem = cons(proofs_with_bindings, supporting_mapped_proof_lists_by_supporting_problem);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        } 
        supporting_mapped_proof_lists_by_supporting_problem = nreverse(supporting_mapped_proof_lists_by_supporting_problem);
        final SubLObject mapped_subproof_lists = cdolist_list_var = list_utilities.cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject mapped_subproof_list = NIL;
        mapped_subproof_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject proof2 = new_split_proof(split_link, mapped_subproof_list);
            final SubLObject newP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != newP) {
                proofs = cons(proof2, proofs);
            } else {
                inference_worker.possibly_note_proof_processed(supporting_proof);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_subproof_list = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2;
        proofs = cdolist_list_var2 = nreverse(proofs);
        SubLObject proof3 = NIL;
        proof3 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            inference_worker.bubble_up_proof(proof3);
            cdolist_list_var2 = cdolist_list_var2.rest();
            proof3 = cdolist_list_var2.first();
        } 
        return proofs;
    }

    public static final SubLObject all_literals_connected_by_shared_varsP_alt(SubLObject dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
                SubLObject contextualized_asent = NIL;
                for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                    if (NIL != hl_ground_tree_p(contextualized_asent)) {
                        return NIL;
                    }
                }
            }
            {
                SubLObject cdolist_list_var = clauses.pos_lits(dnf_clause);
                SubLObject contextualized_asent = NIL;
                for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                    if (NIL != hl_ground_tree_p(contextualized_asent)) {
                        return NIL;
                    }
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject connected_groups = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.categorize_clause_variables_via_literals(dnf_clause);
                SubLObject isolated_groups = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean((NIL == isolated_groups) && (NIL != list_utilities.singletonP(connected_groups)));
            }
        }
    }

    public static SubLObject all_literals_connected_by_shared_varsP(final SubLObject dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != hl_ground_tree_p(contextualized_asent)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        cdolist_list_var = clauses.pos_lits(dnf_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != hl_ground_tree_p(contextualized_asent)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        thread.resetMultipleValues();
        final SubLObject connected_groups = categorize_clause_variables_via_literals(dnf_clause);
        final SubLObject isolated_groups = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean((NIL == isolated_groups) && (NIL != list_utilities.singletonP(connected_groups)));
    }

    /**
     *
     *
     * @return list of problem-query-p
     */
    @LispMethod(comment = "@return list of problem-query-p")
    public static final SubLObject determine_shared_variable_islands_alt(SubLObject dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject islands = NIL;
                if (NIL != hl_ground_tree_p(dnf_clause)) {
                    {
                        SubLObject index = ZERO_INTEGER;
                        SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
                        SubLObject contextualized_asent = NIL;
                        for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                            {
                                SubLObject sense = $NEG;
                                SubLObject island = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
                                islands = cons(island, islands);
                            }
                            index = add(index, ONE_INTEGER);
                        }
                    }
                    {
                        SubLObject index = ZERO_INTEGER;
                        SubLObject cdolist_list_var = clauses.pos_lits(dnf_clause);
                        SubLObject contextualized_asent = NIL;
                        for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                            {
                                SubLObject sense = $POS;
                                SubLObject island = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
                                islands = cons(island, islands);
                            }
                            index = add(index, ONE_INTEGER);
                        }
                    }
                } else {
                    {
                        SubLObject sensified_clause = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.sensify_contextualized_clause(dnf_clause);
                        thread.resetMultipleValues();
                        {
                            SubLObject connected_groups = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.categorize_sensified_clause_variables_via_literals(sensified_clause);
                            SubLObject isolated_groups = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject cdolist_list_var = connected_groups;
                                SubLObject group = NIL;
                                for (group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , group = cdolist_list_var.first()) {
                                    {
                                        SubLObject island = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.categorized_group_to_problem_query(group);
                                        islands = cons(island, islands);
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = isolated_groups;
                                SubLObject group = NIL;
                                for (group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , group = cdolist_list_var.first()) {
                                    {
                                        SubLObject island = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.categorized_group_to_problem_query(group);
                                        islands = cons(island, islands);
                                    }
                                }
                            }
                        }
                    }
                }
                return list_utilities.fast_delete_duplicates(islands, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return list of problem-query-p
     */
    @LispMethod(comment = "@return list of problem-query-p")
    public static SubLObject determine_shared_variable_islands(final SubLObject dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject islands = NIL;
        if (NIL != hl_ground_tree_p(dnf_clause)) {
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sense = $NEG;
                final SubLObject island = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
                islands = cons(island, islands);
                index = add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            } 
            index = ZERO_INTEGER;
            cdolist_list_var = clauses.pos_lits(dnf_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sense = $POS;
                final SubLObject island = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
                islands = cons(island, islands);
                index = add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            } 
        } else {
            final SubLObject sensified_clause = sensify_contextualized_clause(dnf_clause);
            thread.resetMultipleValues();
            final SubLObject connected_groups = categorize_sensified_clause_variables_via_literals(sensified_clause);
            final SubLObject isolated_groups = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var2 = connected_groups;
            SubLObject group = NIL;
            group = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject island2 = categorized_group_to_problem_query(group);
                islands = cons(island2, islands);
                cdolist_list_var2 = cdolist_list_var2.rest();
                group = cdolist_list_var2.first();
            } 
            cdolist_list_var2 = isolated_groups;
            group = NIL;
            group = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject island2 = categorized_group_to_problem_query(group);
                islands = cons(island2, islands);
                cdolist_list_var2 = cdolist_list_var2.rest();
                group = cdolist_list_var2.first();
            } 
        }
        return list_utilities.fast_delete_duplicates(islands, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject categorize_clause_variables_via_literals_alt(SubLObject clause) {
        {
            SubLObject all_hl_vars = list_utilities.tree_gather(clause, HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject all_literals = clause_utilities.all_literals_as_asents(clause);
            return graph_utilities.categorize_nodes_via_links(all_hl_vars, all_literals, UNPROVIDED);
        }
    }

    public static SubLObject categorize_clause_variables_via_literals(final SubLObject clause) {
        final SubLObject all_hl_vars = list_utilities.tree_gather(clause, HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject all_literals = clause_utilities.all_literals_as_asents(clause);
        return graph_utilities.categorize_nodes_via_links(all_hl_vars, all_literals, UNPROVIDED);
    }

    public static final SubLObject categorize_sensified_clause_variables_via_literals_alt(SubLObject sensified_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ground_groups = NIL;
                SubLObject cdolist_list_var = sensified_clause;
                SubLObject sensified_literal = NIL;
                for (sensified_literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sensified_literal = cdolist_list_var.first()) {
                    if (NIL != hl_ground_tree_p(sensified_literal)) {
                        {
                            SubLObject group = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.ground_sensified_literal_to_categorized_group(sensified_literal);
                            ground_groups = cons(group, ground_groups);
                        }
                    }
                }
                {
                    SubLObject all_hl_vars = list_utilities.tree_gather(sensified_clause, HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject all_literals = sensified_clause;
                    thread.resetMultipleValues();
                    {
                        SubLObject connected_groups = graph_utilities.categorize_nodes_via_links(all_hl_vars, all_literals, UNPROVIDED);
                        SubLObject isolated_groups = thread.secondMultipleValue();
                        SubLObject naked_groups = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        return values(connected_groups, nconc(ground_groups, isolated_groups));
                    }
                }
            }
        }
    }

    public static SubLObject categorize_sensified_clause_variables_via_literals(final SubLObject sensified_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ground_groups = NIL;
        SubLObject cdolist_list_var = sensified_clause;
        SubLObject sensified_literal = NIL;
        sensified_literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != hl_ground_tree_p(sensified_literal)) {
                final SubLObject group = ground_sensified_literal_to_categorized_group(sensified_literal);
                ground_groups = cons(group, ground_groups);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sensified_literal = cdolist_list_var.first();
        } 
        final SubLObject all_hl_vars = list_utilities.tree_gather(sensified_clause, HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject connected_groups = graph_utilities.categorize_nodes_via_links(all_hl_vars, sensified_clause, UNPROVIDED);
        final SubLObject isolated_groups = thread.secondMultipleValue();
        final SubLObject naked_groups = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(connected_groups, nconc(ground_groups, isolated_groups));
    }

    public static final SubLObject sensify_contextualized_clause_alt(SubLObject clause) {
        {
            SubLObject literals = NIL;
            {
                SubLObject index = ZERO_INTEGER;
                SubLObject cdolist_list_var = clauses.neg_lits(clause);
                SubLObject contextualized_asent = NIL;
                for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                    literals = cons(negate(contextualized_asent), literals);
                    index = add(index, ONE_INTEGER);
                }
            }
            {
                SubLObject index = ZERO_INTEGER;
                SubLObject cdolist_list_var = clauses.pos_lits(clause);
                SubLObject contextualized_asent = NIL;
                for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                    literals = cons(contextualized_asent, literals);
                    index = add(index, ONE_INTEGER);
                }
            }
            return nreverse(literals);
        }
    }

    public static SubLObject sensify_contextualized_clause(final SubLObject clause) {
        SubLObject literals = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            literals = cons(cycl_utilities.negate(contextualized_asent), literals);
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        index = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            literals = cons(contextualized_asent, literals);
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        return nreverse(literals);
    }

    /**
     *
     *
     * @return 0 asent
     * @return 1 sense
     */
    @LispMethod(comment = "@return 0 asent\r\n@return 1 sense")
    public static final SubLObject unmake_sensified_literal_alt(SubLObject sensified_literal) {
        if (NIL != el_negation_p(sensified_literal)) {
            return values(literal_atomic_sentence(sensified_literal), $NEG);
        } else {
            return values(sensified_literal, $POS);
        }
    }

    /**
     *
     *
     * @return 0 asent
     * @return 1 sense
     */
    @LispMethod(comment = "@return 0 asent\r\n@return 1 sense")
    public static SubLObject unmake_sensified_literal(final SubLObject sensified_literal) {
        if (NIL != el_negation_p(sensified_literal)) {
            return values(literal_atomic_sentence(sensified_literal), $NEG);
        }
        return values(sensified_literal, $POS);
    }

    public static final SubLObject ground_sensified_literal_to_categorized_group_alt(SubLObject sensified_literal) {
        return list(NIL, list(sensified_literal));
    }

    public static SubLObject ground_sensified_literal_to_categorized_group(final SubLObject sensified_literal) {
        return list(NIL, list(sensified_literal));
    }

    /**
     * Takes the return value of @xref categorize-variables-via-literals and turns it
     * into a problem query.
     *
     * @return problem-query-p
     */
    @LispMethod(comment = "Takes the return value of @xref categorize-variables-via-literals and turns it\r\ninto a problem query.\r\n\r\n@return problem-query-p\nTakes the return value of @xref categorize-variables-via-literals and turns it\ninto a problem query.")
    public static final SubLObject categorized_group_to_problem_query_alt(SubLObject group) {
        {
            SubLObject neg_lits = NIL;
            SubLObject pos_lits = NIL;
            SubLObject group_lits = second(group);
            SubLObject cdolist_list_var = group_lits;
            SubLObject literal = NIL;
            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                if (NIL != el_negation_p(literal)) {
                    neg_lits = cons(literal_atomic_sentence(literal), neg_lits);
                } else {
                    pos_lits = cons(literal, pos_lits);
                }
            }
            neg_lits = nreverse(neg_lits);
            pos_lits = nreverse(pos_lits);
            return inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.make_clause(neg_lits, pos_lits));
        }
    }

    /**
     * Takes the return value of @xref categorize-variables-via-literals and turns it
     * into a problem query.
     *
     * @return problem-query-p
     */
    @LispMethod(comment = "Takes the return value of @xref categorize-variables-via-literals and turns it\r\ninto a problem query.\r\n\r\n@return problem-query-p\nTakes the return value of @xref categorize-variables-via-literals and turns it\ninto a problem query.")
    public static SubLObject categorized_group_to_problem_query(final SubLObject group) {
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        SubLObject cdolist_list_var;
        final SubLObject group_lits = cdolist_list_var = second(group);
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_negation_p(literal)) {
                neg_lits = cons(literal_atomic_sentence(literal), neg_lits);
            } else {
                pos_lits = cons(literal, pos_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        neg_lits = nreverse(neg_lits);
        pos_lits = nreverse(pos_lits);
        return inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.make_clause(neg_lits, pos_lits));
    }

    public static final SubLObject meta_split_tactics_enabledP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $meta_split_tactics_enabledP$.getDynamicValue(thread);
        }
    }

    public static SubLObject meta_split_tactics_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $meta_split_tactics_enabledP$.getDynamicValue(thread);
    }

    public static final SubLObject meta_split_tactic_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && ($determine_new_split_tactics_module$.getGlobalValue() == inference_datastructures_tactic.tactic_hl_module(v_object)));
    }

    public static SubLObject meta_split_tactic_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && $determine_new_split_tactics_module$.getGlobalValue().eql(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }

    public static final SubLObject generalized_split_tactic_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_split.split_tactic_p(v_object)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_tactic_p(v_object)));
    }

    public static SubLObject generalized_split_tactic_p(final SubLObject v_object) {
        return makeBoolean((NIL != split_tactic_p(v_object)) || (NIL != meta_split_tactic_p(v_object)));
    }

    public static final SubLObject meta_split_tactic_link_alt(SubLObject meta_split_tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_split.split_tactic_link(meta_split_tactic);
    }

    public static SubLObject meta_split_tactic_link(final SubLObject meta_split_tactic) {
        return split_tactic_link(meta_split_tactic);
    }

    public static final SubLObject meta_split_tactic_todo_indices_alt(SubLObject meta_split_tactic) {
        return inference_datastructures_tactic.tactic_data(meta_split_tactic);
    }

    public static SubLObject meta_split_tactic_todo_indices(final SubLObject meta_split_tactic) {
        return inference_datastructures_tactic.tactic_data(meta_split_tactic);
    }

    public static final SubLObject meta_split_tactic_index_doneP_alt(SubLObject meta_split_tactic, SubLObject index) {
        {
            SubLObject todo_indices = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_tactic_todo_indices(meta_split_tactic);
            return makeBoolean(NIL == list_utilities.member_eqP(index, todo_indices));
        }
    }

    public static SubLObject meta_split_tactic_index_doneP(final SubLObject meta_split_tactic, final SubLObject index) {
        final SubLObject todo_indices = meta_split_tactic_todo_indices(meta_split_tactic);
        return makeBoolean(NIL == list_utilities.member_eqP(index, todo_indices));
    }

    public static final SubLObject meta_split_tactic_productivity_alt(SubLObject meta_split_tactic) {
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(length(com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_tactic_todo_indices(meta_split_tactic)));
    }

    public static SubLObject meta_split_tactic_productivity(final SubLObject meta_split_tactic) {
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(length(meta_split_tactic_todo_indices(meta_split_tactic)));
    }

    public static final SubLObject determine_new_meta_split_tactics_alt(SubLObject supported_problem, SubLObject dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject split_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.maybe_new_split_link(supported_problem, dnf_clause);
                SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(split_link);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!supporting_problem_count.numG(ONE_INTEGER)) {
                        Errors.error($str_alt13$Tried_to_make_a_split_link_with_l, split_link);
                    }
                }
                inference_worker.consider_that_problem_could_be_no_good(supported_problem, NIL, $TACTICAL, T);
                if (NIL == inference_worker.no_good_problem_p(supported_problem, $TACTICAL)) {
                    com.cyc.cycjava.cycl.inference.harness.inference_worker_split.new_meta_split_tactic(supported_problem);
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject determine_new_meta_split_tactics(final SubLObject supported_problem, final SubLObject dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject split_link = maybe_new_split_link(supported_problem, dnf_clause);
        final SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(split_link);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!supporting_problem_count.numG(ONE_INTEGER))) {
            Errors.error($str14$Tried_to_make_a_split_link_with_l, split_link);
        }
        inference_worker.consider_that_problem_could_be_no_good(supported_problem, NIL, $TACTICAL, T);
        if (NIL == inference_worker.no_good_problem_p(supported_problem, $TACTICAL)) {
            new_meta_split_tactic(supported_problem);
            return T;
        }
        return NIL;
    }

    public static final SubLObject new_meta_split_tactic_alt(SubLObject problem) {
        {
            SubLObject split_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.problem_sole_split_argument_link(problem);
            SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(split_link);
            SubLObject todo_indices = copy_list(list_utilities.num_list(supporting_problem_count, UNPROVIDED));
            SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, $determine_new_split_tactics_module$.getGlobalValue(), todo_indices);
            inference_datastructures_tactic.note_tactic_progress_iterator(tactic, com.cyc.cycjava.cycl.inference.harness.inference_worker_split.new_meta_split_progress_iterator(tactic));
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
                                if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                    {
                                        SubLObject inference_var = inference;
                                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                        SubLObject state = NIL;
                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            {
                                                SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
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
            return tactic;
        }
    }

    public static SubLObject new_meta_split_tactic(final SubLObject problem) {
        final SubLObject split_link = problem_sole_split_argument_link(problem);
        final SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(split_link);
        final SubLObject todo_indices = copy_list(list_utilities.num_list(supporting_problem_count, UNPROVIDED));
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, $determine_new_split_tactics_module$.getGlobalValue(), todo_indices);
        inference_datastructures_tactic.note_tactic_progress_iterator(tactic, new_meta_split_progress_iterator(tactic));
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
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
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
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }

    public static final SubLObject compute_strategic_properties_of_meta_split_tactic_alt(SubLObject tactic, SubLObject strategy) {
        if (NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
            inference_datastructures_tactic.set_tactic_preference_level(tactic, $meta_split_tactic_default_preference_level$.getGlobalValue(), $meta_split_tactic_default_preference_level_justification$.getGlobalValue());
        }
        inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, $meta_split_tactic_default_preference_level$.getGlobalValue(), $meta_split_tactic_default_preference_level_justification$.getGlobalValue());
        inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, ZERO_INTEGER);
        return tactic;
    }

    public static SubLObject compute_strategic_properties_of_meta_split_tactic(final SubLObject tactic, final SubLObject strategy) {
        if (NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
            inference_datastructures_tactic.set_tactic_preference_level(tactic, $meta_split_tactic_default_preference_level$.getGlobalValue(), $meta_split_tactic_default_preference_level_justification$.getGlobalValue());
        }
        inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, $meta_split_tactic_default_preference_level$.getGlobalValue(), $meta_split_tactic_default_preference_level_justification$.getGlobalValue());
        inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, ZERO_INTEGER);
        return tactic;
    }

    public static final SubLObject new_meta_split_progress_iterator_alt(SubLObject tactic) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($META_STRUCTURAL, tactic, NIL);
    }

    public static SubLObject new_meta_split_progress_iterator(final SubLObject tactic) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($META_STRUCTURAL, tactic, NIL);
    }

    public static final SubLObject meta_structural_progress_iterator_doneP_alt(SubLObject tactic) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_tactic_p(tactic)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_progress_iterator_doneP(tactic);
        } else {
            return Errors.error($str_alt26$unexpected_meta_structural_tactic, tactic);
        }
    }

    public static SubLObject meta_structural_progress_iterator_doneP(final SubLObject tactic) {
        if (NIL != meta_split_tactic_p(tactic)) {
            return meta_split_progress_iterator_doneP(tactic);
        }
        return Errors.error($str26$unexpected_meta_structural_tactic, tactic);
    }

    public static final SubLObject meta_split_progress_iterator_doneP_alt(SubLObject tactic) {
        {
            SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
            SubLObject todo_indices = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_tactic_todo_indices(tactic);
            return makeBoolean((NIL == todo_indices) || (NIL != inference_worker.no_good_problem_p(supported_problem, $TACTICAL)));
        }
    }

    public static SubLObject meta_split_progress_iterator_doneP(final SubLObject tactic) {
        final SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject todo_indices = meta_split_tactic_todo_indices(tactic);
        return makeBoolean((NIL == todo_indices) || (NIL != inference_worker.no_good_problem_p(supported_problem, $TACTICAL)));
    }

    public static final SubLObject meta_split_criteria_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $meta_split_criteria$.getDynamicValue(thread)) {
                return $meta_split_criteria$.getDynamicValue(thread);
            } else {
                if (NIL != $meta_split_tactics_do_single_literals_firstP$.getDynamicValue(thread)) {
                    return $list_alt27;
                } else {
                    if (NIL != $meta_split_favors_problem_reuseP$.getDynamicValue(thread)) {
                        return $list_alt28;
                    } else {
                        return $list_alt29;
                    }
                }
            }
        }
    }

    public static SubLObject meta_split_criteria() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $meta_split_criteria$.getDynamicValue(thread)) {
            return $meta_split_criteria$.getDynamicValue(thread);
        }
        if (NIL != $meta_split_tactics_do_single_literals_firstP$.getDynamicValue(thread)) {
            return $list27;
        }
        if (NIL != $meta_split_favors_problem_reuseP$.getDynamicValue(thread)) {
            return $list28;
        }
        return $list29;
    }

    public static final SubLObject execute_meta_split_tactic_alt(SubLObject tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
                if (NIL == inference_datastructures_problem.tactically_no_good_problem_p(supported_problem)) {
                    {
                        SubLObject split_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_tactic_link(tactic);
                        SubLObject problem_index_pairs = NIL;
                        SubLObject doneP = NIL;
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_criteria();
                                SubLObject meta_split_criterion = NIL;
                                for (meta_split_criterion = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , meta_split_criterion = csome_list_var.first()) {
                                    {
                                        SubLObject index = ZERO_INTEGER;
                                        SubLObject link_var = split_link;
                                        SubLObject rest = NIL;
                                        for (rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                            {
                                                SubLObject supporting_mapped_problem = rest.first();
                                                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                                                    if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_tactic_index_doneP(tactic, index)) {
                                                        {
                                                            SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject applicableP = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_criterion_applicableP(meta_split_criterion, supporting_problem);
                                                                SubLObject stop_after_each_oneP = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != applicableP) {
                                                                    problem_index_pairs = cons(list(index, supporting_problem), problem_index_pairs);
                                                                    if (NIL != stop_after_each_oneP) {
                                                                        doneP = T;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    index = add(index, ONE_INTEGER);
                                                }
                                            }
                                        }
                                    }
                                    if (NIL != problem_index_pairs) {
                                        doneP = T;
                                    }
                                }
                            }
                        }
                        com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_tactic_create_and_activate_split_tactics(tactic, supported_problem, problem_index_pairs);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject execute_meta_split_tactic(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        if (NIL == inference_datastructures_problem.tactically_no_good_problem_p(supported_problem)) {
            final SubLObject split_link = meta_split_tactic_link(tactic);
            SubLObject problem_index_pairs = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                SubLObject csome_list_var = meta_split_criteria();
                SubLObject meta_split_criterion = NIL;
                meta_split_criterion = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    SubLObject index = ZERO_INTEGER;
                    final SubLObject link_var = split_link;
                    SubLObject rest;
                    SubLObject supporting_mapped_problem;
                    SubLObject supporting_problem;
                    SubLObject applicableP;
                    SubLObject stop_after_each_oneP;
                    for (rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                        supporting_mapped_problem = rest.first();
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            if (NIL == meta_split_tactic_index_doneP(tactic, index)) {
                                supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                thread.resetMultipleValues();
                                applicableP = meta_split_criterion_applicableP(meta_split_criterion, supporting_problem);
                                stop_after_each_oneP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != applicableP) {
                                    problem_index_pairs = cons(list(index, supporting_problem), problem_index_pairs);
                                    if (NIL != stop_after_each_oneP) {
                                        doneP = T;
                                    }
                                }
                            }
                            index = add(index, ONE_INTEGER);
                        }
                    }
                    if (NIL != problem_index_pairs) {
                        doneP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    meta_split_criterion = csome_list_var.first();
                } 
            }
            meta_split_tactic_create_and_activate_split_tactics(tactic, supported_problem, problem_index_pairs);
        }
        return NIL;
    }

    /**
     *
     *
     * @return 0 booleanp; whether META-SPLIT-CRITERION applies to CONJUNCT-PROBLEM
     * @return 1 booleanp; If NIL, all tactics leading to conjunct problems that pass the applicability
    test will be activated as a group.  If T, the first problem passing the applicability test
    will be activated by itself.
     */
    @LispMethod(comment = "@return 0 booleanp; whether META-SPLIT-CRITERION applies to CONJUNCT-PROBLEM\r\n@return 1 booleanp; If NIL, all tactics leading to conjunct problems that pass the applicability\r\ntest will be activated as a group.  If T, the first problem passing the applicability test\r\nwill be activated by itself.")
    public static final SubLObject meta_split_criterion_applicableP_alt(SubLObject meta_split_criterion, SubLObject conjunct_problem) {
        {
            SubLObject pcase_var = meta_split_criterion;
            if (pcase_var.eql($ONE_NO_GOOD)) {
                return values(inference_datastructures_problem.tactically_no_good_problem_p(conjunct_problem), T);
            } else {
                if (pcase_var.eql($ALL_SINGLE_LITERAL)) {
                    return values(inference_datastructures_problem.single_literal_problem_p(conjunct_problem), NIL);
                } else {
                    if (pcase_var.eql($ALL_PROBLEM_REUSE)) {
                        return values(numG(inference_datastructures_problem.problem_dependent_link_count(conjunct_problem), ONE_INTEGER), NIL);
                    } else {
                        if (pcase_var.eql($ONE_CLOSED)) {
                            return values(inference_datastructures_problem.closed_problem_p(conjunct_problem), T);
                        } else {
                            if (pcase_var.eql($ONE_CLOSED_PROBLEM_REUSE)) {
                                return values(makeBoolean((NIL != inference_datastructures_problem.closed_problem_p(conjunct_problem)) && inference_datastructures_problem.problem_dependent_link_count(conjunct_problem).numG(ONE_INTEGER)), T);
                            } else {
                                if (pcase_var.eql($ALL_SINGLE_LITERAL_PROBLEM_REUSE)) {
                                    return values(makeBoolean((NIL != inference_datastructures_problem.single_literal_problem_p(conjunct_problem)) && inference_datastructures_problem.problem_dependent_link_count(conjunct_problem).numG(ONE_INTEGER)), NIL);
                                } else {
                                    if (pcase_var.eql($ALL_THE_REST)) {
                                        return values(T, NIL);
                                    } else {
                                        return Errors.error($str_alt37$Unknown_meta_split_criterion__s, meta_split_criterion);
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
     * @return 0 booleanp; whether META-SPLIT-CRITERION applies to CONJUNCT-PROBLEM
     * @return 1 booleanp; If NIL, all tactics leading to conjunct problems that pass the applicability
    test will be activated as a group.  If T, the first problem passing the applicability test
    will be activated by itself.
     */
    @LispMethod(comment = "@return 0 booleanp; whether META-SPLIT-CRITERION applies to CONJUNCT-PROBLEM\r\n@return 1 booleanp; If NIL, all tactics leading to conjunct problems that pass the applicability\r\ntest will be activated as a group.  If T, the first problem passing the applicability test\r\nwill be activated by itself.")
    public static SubLObject meta_split_criterion_applicableP(final SubLObject meta_split_criterion, final SubLObject conjunct_problem) {
        if (meta_split_criterion.eql($ONE_NO_GOOD)) {
            return values(inference_datastructures_problem.tactically_no_good_problem_p(conjunct_problem), T);
        }
        if (meta_split_criterion.eql($ALL_SINGLE_LITERAL)) {
            return values(inference_datastructures_problem.single_literal_problem_p(conjunct_problem), NIL);
        }
        if (meta_split_criterion.eql($ALL_PROBLEM_REUSE)) {
            return values(numG(inference_datastructures_problem.problem_dependent_link_count(conjunct_problem), ONE_INTEGER), NIL);
        }
        if (meta_split_criterion.eql($ONE_CLOSED)) {
            return values(inference_datastructures_problem.closed_problem_p(conjunct_problem), T);
        }
        if (meta_split_criterion.eql($ONE_CLOSED_PROBLEM_REUSE)) {
            return values(makeBoolean((NIL != inference_datastructures_problem.closed_problem_p(conjunct_problem)) && inference_datastructures_problem.problem_dependent_link_count(conjunct_problem).numG(ONE_INTEGER)), T);
        }
        if (meta_split_criterion.eql($ALL_SINGLE_LITERAL_PROBLEM_REUSE)) {
            return values(makeBoolean((NIL != inference_datastructures_problem.single_literal_problem_p(conjunct_problem)) && inference_datastructures_problem.problem_dependent_link_count(conjunct_problem).numG(ONE_INTEGER)), NIL);
        }
        if (meta_split_criterion.eql($ALL_THE_REST)) {
            return values(T, NIL);
        }
        return Errors.error($str37$Unknown_meta_split_criterion__s, meta_split_criterion);
    }

    public static final SubLObject meta_split_tactic_create_and_activate_split_tactics_alt(SubLObject meta_split_tactic, SubLObject supported_problem, SubLObject problem_index_pairs) {
        {
            SubLObject split_tactics = NIL;
            SubLObject cdolist_list_var = problem_index_pairs;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject index = NIL;
                    SubLObject supporting_problem = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    index = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    supporting_problem = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject split_tactic = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_tactic_create_one_split_tactic(meta_split_tactic, supported_problem, index);
                            split_tactics = cons(split_tactic, split_tactics);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt38);
                    }
                }
            }
            com.cyc.cycjava.cycl.inference.harness.inference_worker_split.note_split_tactics_strategically_possible(split_tactics);
            return split_tactics;
        }
    }

    public static SubLObject meta_split_tactic_create_and_activate_split_tactics(final SubLObject meta_split_tactic, final SubLObject supported_problem, final SubLObject problem_index_pairs) {
        SubLObject split_tactics = NIL;
        SubLObject cdolist_list_var = problem_index_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject index = NIL;
            SubLObject supporting_problem = NIL;
            destructuring_bind_must_consp(current, datum, $list38);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list38);
            supporting_problem = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject split_tactic = meta_split_tactic_create_one_split_tactic(meta_split_tactic, supported_problem, index);
                split_tactics = cons(split_tactic, split_tactics);
            } else {
                cdestructuring_bind_error(datum, $list38);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        note_split_tactics_strategically_possible(split_tactics);
        return split_tactics;
    }

    public static final SubLObject meta_split_tactic_create_one_split_tactic_alt(SubLObject meta_split_tactic, SubLObject supported_problem, SubLObject index) {
        com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_tactic_note_split_tactic_done(meta_split_tactic, index);
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_split.new_split_tactic(supported_problem, index);
    }

    public static SubLObject meta_split_tactic_create_one_split_tactic(final SubLObject meta_split_tactic, final SubLObject supported_problem, final SubLObject index) {
        meta_split_tactic_note_split_tactic_done(meta_split_tactic, index);
        return new_split_tactic(supported_problem, index);
    }

    public static final SubLObject meta_split_tactic_note_split_tactic_done_alt(SubLObject tactic, SubLObject index) {
        {
            SubLObject todo_indices = com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_split_tactic_todo_indices(tactic);
            todo_indices = delete(index, todo_indices, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            inference_datastructures_tactic.set_meta_split_tactic_data(tactic, todo_indices);
        }
        return tactic;
    }

    public static SubLObject meta_split_tactic_note_split_tactic_done(final SubLObject tactic, final SubLObject index) {
        SubLObject todo_indices = meta_split_tactic_todo_indices(tactic);
        todo_indices = delete(index, todo_indices, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        inference_datastructures_tactic.set_meta_split_tactic_data(tactic, todo_indices);
        return tactic;
    }

    public static final SubLObject note_split_tactics_strategically_possible_alt(SubLObject split_tactics) {
        if (NIL != split_tactics) {
            {
                SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(split_tactics.first());
                SubLObject prob = supported_problem;
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
                                if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                    {
                                        SubLObject inference_var = inference;
                                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                        SubLObject state = NIL;
                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            {
                                                SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                    inference_tactician.strategy_note_split_tactics_strategically_possible(strategy, split_tactics);
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
        }
        return NIL;
    }

    public static SubLObject note_split_tactics_strategically_possible(final SubLObject split_tactics) {
        if (NIL != split_tactics) {
            final SubLObject prob;
            final SubLObject supported_problem = prob = inference_datastructures_tactic.tactic_problem(split_tactics.first());
            final SubLObject store = inference_datastructures_problem.problem_store(prob);
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
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
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
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                        inference_tactician.strategy_note_split_tactics_strategically_possible(strategy, split_tactics);
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
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                                final SubLObject inference_var2 = inference2;
                                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                        inference_tactician.strategy_note_split_tactics_strategically_possible(strategy2, split_tactics);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_inference_worker_split_file_alt() {
        declareFunction("split_link_p", "SPLIT-LINK-P", 1, 0, false);
        declareFunction("maybe_new_split_link", "MAYBE-NEW-SPLIT-LINK", 2, 0, false);
        declareFunction("new_split_link", "NEW-SPLIT-LINK", 2, 0, false);
        declareFunction("destroy_split_link", "DESTROY-SPLIT-LINK", 1, 0, false);
        declareMacro("do_split_link_open_supporting_mapped_problems_numbered", "DO-SPLIT-LINK-OPEN-SUPPORTING-MAPPED-PROBLEMS-NUMBERED");
        declareFunction("split_link_tactic", "SPLIT-LINK-TACTIC", 2, 0, false);
        declareFunction("split_link_tactics", "SPLIT-LINK-TACTICS", 1, 0, false);
        declareFunction("split_link_tactics_int", "SPLIT-LINK-TACTICS-INT", 1, 0, false);
        declareFunction("close_split_link", "CLOSE-SPLIT-LINK", 1, 0, false);
        declareFunction("find_or_create_split_link_supporting_problems", "FIND-OR-CREATE-SPLIT-LINK-SUPPORTING-PROBLEMS", 2, 0, false);
        declareFunction("split_tactic_p", "SPLIT-TACTIC-P", 1, 0, false);
        declareFunction("new_split_tactic", "NEW-SPLIT-TACTIC", 2, 0, false);
        declareFunction("split_tactic_supporting_mapped_problem_index", "SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM-INDEX", 1, 0, false);
        declareFunction("split_tactic_link", "SPLIT-TACTIC-LINK", 1, 0, false);
        declareFunction("find_split_tactic_supporting_mapped_problem", "FIND-SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("find_split_tactic_supporting_problem", "FIND-SPLIT-TACTIC-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction("discard_all_other_possible_split_tactics", "DISCARD-ALL-OTHER-POSSIBLE-SPLIT-TACTICS", 1, 0, false);
        declareFunction("determine_new_split_tactics", "DETERMINE-NEW-SPLIT-TACTICS", 2, 0, false);
        declareFunction("compute_strategic_properties_of_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-SPLIT-TACTIC", 3, 0, false);
        declareFunction("compute_split_tactic_productivity", "COMPUTE-SPLIT-TACTIC-PRODUCTIVITY", 3, 0, false);
        declareFunction("compute_split_tactic_preference_level", "COMPUTE-SPLIT-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction("execute_split_tactic", "EXECUTE-SPLIT-TACTIC", 1, 0, false);
        declareFunction("problem_sole_split_argument_link", "PROBLEM-SOLE-SPLIT-ARGUMENT-LINK", 1, 0, false);
        declareFunction("problem_first_split_argument_link", "PROBLEM-FIRST-SPLIT-ARGUMENT-LINK", 1, 0, false);
        declareFunction("problem_has_split_argument_linkP", "PROBLEM-HAS-SPLIT-ARGUMENT-LINK?", 1, 0, false);
        declareFunction("split_tactic_lookahead_problem", "SPLIT-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
        declareFunction("split_link_supporting_problems_with_variables", "SPLIT-LINK-SUPPORTING-PROBLEMS-WITH-VARIABLES", 1, 0, false);
        declareFunction("new_split_proof", "NEW-SPLIT-PROOF", 2, 0, false);
        declareFunction("split_proof_p", "SPLIT-PROOF-P", 1, 0, false);
        declareFunction("bubble_up_proof_to_split_link", "BUBBLE-UP-PROOF-TO-SPLIT-LINK", 3, 0, false);
        declareFunction("all_literals_connected_by_shared_varsP", "ALL-LITERALS-CONNECTED-BY-SHARED-VARS?", 1, 0, false);
        declareFunction("determine_shared_variable_islands", "DETERMINE-SHARED-VARIABLE-ISLANDS", 1, 0, false);
        declareFunction("categorize_clause_variables_via_literals", "CATEGORIZE-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false);
        declareFunction("categorize_sensified_clause_variables_via_literals", "CATEGORIZE-SENSIFIED-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false);
        declareFunction("sensify_contextualized_clause", "SENSIFY-CONTEXTUALIZED-CLAUSE", 1, 0, false);
        declareFunction("unmake_sensified_literal", "UNMAKE-SENSIFIED-LITERAL", 1, 0, false);
        declareFunction("ground_sensified_literal_to_categorized_group", "GROUND-SENSIFIED-LITERAL-TO-CATEGORIZED-GROUP", 1, 0, false);
        declareFunction("categorized_group_to_problem_query", "CATEGORIZED-GROUP-TO-PROBLEM-QUERY", 1, 0, false);
        declareFunction("meta_split_tactics_enabledP", "META-SPLIT-TACTICS-ENABLED?", 0, 0, false);
        declareFunction("meta_split_tactic_p", "META-SPLIT-TACTIC-P", 1, 0, false);
        declareFunction("generalized_split_tactic_p", "GENERALIZED-SPLIT-TACTIC-P", 1, 0, false);
        declareFunction("meta_split_tactic_link", "META-SPLIT-TACTIC-LINK", 1, 0, false);
        declareFunction("meta_split_tactic_todo_indices", "META-SPLIT-TACTIC-TODO-INDICES", 1, 0, false);
        declareFunction("meta_split_tactic_index_doneP", "META-SPLIT-TACTIC-INDEX-DONE?", 2, 0, false);
        declareFunction("meta_split_tactic_productivity", "META-SPLIT-TACTIC-PRODUCTIVITY", 1, 0, false);
        declareFunction("determine_new_meta_split_tactics", "DETERMINE-NEW-META-SPLIT-TACTICS", 2, 0, false);
        declareFunction("new_meta_split_tactic", "NEW-META-SPLIT-TACTIC", 1, 0, false);
        declareFunction("compute_strategic_properties_of_meta_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-SPLIT-TACTIC", 2, 0, false);
        declareFunction("new_meta_split_progress_iterator", "NEW-META-SPLIT-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction("meta_structural_progress_iterator_doneP", "META-STRUCTURAL-PROGRESS-ITERATOR-DONE?", 1, 0, false);
        declareFunction("meta_split_progress_iterator_doneP", "META-SPLIT-PROGRESS-ITERATOR-DONE?", 1, 0, false);
        declareFunction("meta_split_criteria", "META-SPLIT-CRITERIA", 0, 0, false);
        declareFunction("execute_meta_split_tactic", "EXECUTE-META-SPLIT-TACTIC", 1, 0, false);
        declareFunction("meta_split_criterion_applicableP", "META-SPLIT-CRITERION-APPLICABLE?", 2, 0, false);
        declareFunction("meta_split_tactic_create_and_activate_split_tactics", "META-SPLIT-TACTIC-CREATE-AND-ACTIVATE-SPLIT-TACTICS", 3, 0, false);
        declareFunction("meta_split_tactic_create_one_split_tactic", "META-SPLIT-TACTIC-CREATE-ONE-SPLIT-TACTIC", 3, 0, false);
        declareFunction("meta_split_tactic_note_split_tactic_done", "META-SPLIT-TACTIC-NOTE-SPLIT-TACTIC-DONE", 2, 0, false);
        declareFunction("note_split_tactics_strategically_possible", "NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_worker_split_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("split_link_p", "SPLIT-LINK-P", 1, 0, false);
            declareFunction("maybe_new_split_link", "MAYBE-NEW-SPLIT-LINK", 2, 0, false);
            declareFunction("new_split_link", "NEW-SPLIT-LINK", 2, 0, false);
            declareFunction("destroy_split_link", "DESTROY-SPLIT-LINK", 1, 0, false);
            declareMacro("do_split_link_open_supporting_mapped_problems_numbered", "DO-SPLIT-LINK-OPEN-SUPPORTING-MAPPED-PROBLEMS-NUMBERED");
            declareFunction("split_link_tactic", "SPLIT-LINK-TACTIC", 2, 0, false);
            declareFunction("split_link_tactics", "SPLIT-LINK-TACTICS", 1, 0, false);
            declareFunction("split_link_tactics_int", "SPLIT-LINK-TACTICS-INT", 1, 0, false);
            declareFunction("close_split_link", "CLOSE-SPLIT-LINK", 1, 0, false);
            declareFunction("find_or_create_split_link_supporting_problems", "FIND-OR-CREATE-SPLIT-LINK-SUPPORTING-PROBLEMS", 3, 0, false);
            declareFunction("split_tactic_p", "SPLIT-TACTIC-P", 1, 0, false);
            declareFunction("new_split_tactic", "NEW-SPLIT-TACTIC", 2, 0, false);
            declareFunction("split_tactic_supporting_mapped_problem_index", "SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM-INDEX", 1, 0, false);
            declareFunction("split_tactic_link", "SPLIT-TACTIC-LINK", 1, 0, false);
            declareFunction("find_split_tactic_supporting_mapped_problem", "FIND-SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("find_split_tactic_supporting_problem", "FIND-SPLIT-TACTIC-SUPPORTING-PROBLEM", 1, 0, false);
            declareFunction("discard_all_other_possible_split_tactics", "DISCARD-ALL-OTHER-POSSIBLE-SPLIT-TACTICS", 1, 0, false);
            declareFunction("determine_new_split_tactics", "DETERMINE-NEW-SPLIT-TACTICS", 2, 0, false);
            declareFunction("compute_strategic_properties_of_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-SPLIT-TACTIC", 3, 0, false);
            declareFunction("compute_split_tactic_productivity", "COMPUTE-SPLIT-TACTIC-PRODUCTIVITY", 3, 0, false);
            declareFunction("compute_split_tactic_preference_level", "COMPUTE-SPLIT-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
            declareFunction("execute_split_tactic", "EXECUTE-SPLIT-TACTIC", 1, 0, false);
            declareFunction("problem_sole_split_argument_link", "PROBLEM-SOLE-SPLIT-ARGUMENT-LINK", 1, 0, false);
            declareFunction("problem_first_split_argument_link", "PROBLEM-FIRST-SPLIT-ARGUMENT-LINK", 1, 0, false);
            declareFunction("problem_has_split_argument_linkP", "PROBLEM-HAS-SPLIT-ARGUMENT-LINK?", 1, 0, false);
            declareFunction("split_tactic_lookahead_problem", "SPLIT-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
            declareFunction("split_link_supporting_problems_with_variables", "SPLIT-LINK-SUPPORTING-PROBLEMS-WITH-VARIABLES", 1, 0, false);
            declareFunction("new_split_proof", "NEW-SPLIT-PROOF", 2, 0, false);
            declareFunction("split_proof_p", "SPLIT-PROOF-P", 1, 0, false);
            declareFunction("bubble_up_proof_to_split_link", "BUBBLE-UP-PROOF-TO-SPLIT-LINK", 3, 0, false);
            declareFunction("all_literals_connected_by_shared_varsP", "ALL-LITERALS-CONNECTED-BY-SHARED-VARS?", 1, 0, false);
            declareFunction("determine_shared_variable_islands", "DETERMINE-SHARED-VARIABLE-ISLANDS", 1, 0, false);
            declareFunction("categorize_clause_variables_via_literals", "CATEGORIZE-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false);
            declareFunction("categorize_sensified_clause_variables_via_literals", "CATEGORIZE-SENSIFIED-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false);
            declareFunction("sensify_contextualized_clause", "SENSIFY-CONTEXTUALIZED-CLAUSE", 1, 0, false);
            declareFunction("unmake_sensified_literal", "UNMAKE-SENSIFIED-LITERAL", 1, 0, false);
            declareFunction("ground_sensified_literal_to_categorized_group", "GROUND-SENSIFIED-LITERAL-TO-CATEGORIZED-GROUP", 1, 0, false);
            declareFunction("categorized_group_to_problem_query", "CATEGORIZED-GROUP-TO-PROBLEM-QUERY", 1, 0, false);
            declareFunction("meta_split_tactics_enabledP", "META-SPLIT-TACTICS-ENABLED?", 0, 0, false);
            declareFunction("meta_split_tactic_p", "META-SPLIT-TACTIC-P", 1, 0, false);
            declareFunction("generalized_split_tactic_p", "GENERALIZED-SPLIT-TACTIC-P", 1, 0, false);
            declareFunction("meta_split_tactic_link", "META-SPLIT-TACTIC-LINK", 1, 0, false);
            declareFunction("meta_split_tactic_todo_indices", "META-SPLIT-TACTIC-TODO-INDICES", 1, 0, false);
            declareFunction("meta_split_tactic_index_doneP", "META-SPLIT-TACTIC-INDEX-DONE?", 2, 0, false);
            declareFunction("meta_split_tactic_productivity", "META-SPLIT-TACTIC-PRODUCTIVITY", 1, 0, false);
            declareFunction("determine_new_meta_split_tactics", "DETERMINE-NEW-META-SPLIT-TACTICS", 2, 0, false);
            declareFunction("new_meta_split_tactic", "NEW-META-SPLIT-TACTIC", 1, 0, false);
            declareFunction("compute_strategic_properties_of_meta_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-SPLIT-TACTIC", 2, 0, false);
            declareFunction("new_meta_split_progress_iterator", "NEW-META-SPLIT-PROGRESS-ITERATOR", 1, 0, false);
            declareFunction("meta_structural_progress_iterator_doneP", "META-STRUCTURAL-PROGRESS-ITERATOR-DONE?", 1, 0, false);
            declareFunction("meta_split_progress_iterator_doneP", "META-SPLIT-PROGRESS-ITERATOR-DONE?", 1, 0, false);
            declareFunction("meta_split_criteria", "META-SPLIT-CRITERIA", 0, 0, false);
            declareFunction("execute_meta_split_tactic", "EXECUTE-META-SPLIT-TACTIC", 1, 0, false);
            declareFunction("meta_split_criterion_applicableP", "META-SPLIT-CRITERION-APPLICABLE?", 2, 0, false);
            declareFunction("meta_split_tactic_create_and_activate_split_tactics", "META-SPLIT-TACTIC-CREATE-AND-ACTIVATE-SPLIT-TACTICS", 3, 0, false);
            declareFunction("meta_split_tactic_create_one_split_tactic", "META-SPLIT-TACTIC-CREATE-ONE-SPLIT-TACTIC", 3, 0, false);
            declareFunction("meta_split_tactic_note_split_tactic_done", "META-SPLIT-TACTIC-NOTE-SPLIT-TACTIC-DONE", 2, 0, false);
            declareFunction("note_split_tactics_strategically_possible", "NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("find_or_create_split_link_supporting_problems", "FIND-OR-CREATE-SPLIT-LINK-SUPPORTING-PROBLEMS", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_split_file_Previous() {
        declareFunction("split_link_p", "SPLIT-LINK-P", 1, 0, false);
        declareFunction("maybe_new_split_link", "MAYBE-NEW-SPLIT-LINK", 2, 0, false);
        declareFunction("new_split_link", "NEW-SPLIT-LINK", 2, 0, false);
        declareFunction("destroy_split_link", "DESTROY-SPLIT-LINK", 1, 0, false);
        declareMacro("do_split_link_open_supporting_mapped_problems_numbered", "DO-SPLIT-LINK-OPEN-SUPPORTING-MAPPED-PROBLEMS-NUMBERED");
        declareFunction("split_link_tactic", "SPLIT-LINK-TACTIC", 2, 0, false);
        declareFunction("split_link_tactics", "SPLIT-LINK-TACTICS", 1, 0, false);
        declareFunction("split_link_tactics_int", "SPLIT-LINK-TACTICS-INT", 1, 0, false);
        declareFunction("close_split_link", "CLOSE-SPLIT-LINK", 1, 0, false);
        declareFunction("find_or_create_split_link_supporting_problems", "FIND-OR-CREATE-SPLIT-LINK-SUPPORTING-PROBLEMS", 3, 0, false);
        declareFunction("split_tactic_p", "SPLIT-TACTIC-P", 1, 0, false);
        declareFunction("new_split_tactic", "NEW-SPLIT-TACTIC", 2, 0, false);
        declareFunction("split_tactic_supporting_mapped_problem_index", "SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM-INDEX", 1, 0, false);
        declareFunction("split_tactic_link", "SPLIT-TACTIC-LINK", 1, 0, false);
        declareFunction("find_split_tactic_supporting_mapped_problem", "FIND-SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("find_split_tactic_supporting_problem", "FIND-SPLIT-TACTIC-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction("discard_all_other_possible_split_tactics", "DISCARD-ALL-OTHER-POSSIBLE-SPLIT-TACTICS", 1, 0, false);
        declareFunction("determine_new_split_tactics", "DETERMINE-NEW-SPLIT-TACTICS", 2, 0, false);
        declareFunction("compute_strategic_properties_of_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-SPLIT-TACTIC", 3, 0, false);
        declareFunction("compute_split_tactic_productivity", "COMPUTE-SPLIT-TACTIC-PRODUCTIVITY", 3, 0, false);
        declareFunction("compute_split_tactic_preference_level", "COMPUTE-SPLIT-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction("execute_split_tactic", "EXECUTE-SPLIT-TACTIC", 1, 0, false);
        declareFunction("problem_sole_split_argument_link", "PROBLEM-SOLE-SPLIT-ARGUMENT-LINK", 1, 0, false);
        declareFunction("problem_first_split_argument_link", "PROBLEM-FIRST-SPLIT-ARGUMENT-LINK", 1, 0, false);
        declareFunction("problem_has_split_argument_linkP", "PROBLEM-HAS-SPLIT-ARGUMENT-LINK?", 1, 0, false);
        declareFunction("split_tactic_lookahead_problem", "SPLIT-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
        declareFunction("split_link_supporting_problems_with_variables", "SPLIT-LINK-SUPPORTING-PROBLEMS-WITH-VARIABLES", 1, 0, false);
        declareFunction("new_split_proof", "NEW-SPLIT-PROOF", 2, 0, false);
        declareFunction("split_proof_p", "SPLIT-PROOF-P", 1, 0, false);
        declareFunction("bubble_up_proof_to_split_link", "BUBBLE-UP-PROOF-TO-SPLIT-LINK", 3, 0, false);
        declareFunction("all_literals_connected_by_shared_varsP", "ALL-LITERALS-CONNECTED-BY-SHARED-VARS?", 1, 0, false);
        declareFunction("determine_shared_variable_islands", "DETERMINE-SHARED-VARIABLE-ISLANDS", 1, 0, false);
        declareFunction("categorize_clause_variables_via_literals", "CATEGORIZE-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false);
        declareFunction("categorize_sensified_clause_variables_via_literals", "CATEGORIZE-SENSIFIED-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false);
        declareFunction("sensify_contextualized_clause", "SENSIFY-CONTEXTUALIZED-CLAUSE", 1, 0, false);
        declareFunction("unmake_sensified_literal", "UNMAKE-SENSIFIED-LITERAL", 1, 0, false);
        declareFunction("ground_sensified_literal_to_categorized_group", "GROUND-SENSIFIED-LITERAL-TO-CATEGORIZED-GROUP", 1, 0, false);
        declareFunction("categorized_group_to_problem_query", "CATEGORIZED-GROUP-TO-PROBLEM-QUERY", 1, 0, false);
        declareFunction("meta_split_tactics_enabledP", "META-SPLIT-TACTICS-ENABLED?", 0, 0, false);
        declareFunction("meta_split_tactic_p", "META-SPLIT-TACTIC-P", 1, 0, false);
        declareFunction("generalized_split_tactic_p", "GENERALIZED-SPLIT-TACTIC-P", 1, 0, false);
        declareFunction("meta_split_tactic_link", "META-SPLIT-TACTIC-LINK", 1, 0, false);
        declareFunction("meta_split_tactic_todo_indices", "META-SPLIT-TACTIC-TODO-INDICES", 1, 0, false);
        declareFunction("meta_split_tactic_index_doneP", "META-SPLIT-TACTIC-INDEX-DONE?", 2, 0, false);
        declareFunction("meta_split_tactic_productivity", "META-SPLIT-TACTIC-PRODUCTIVITY", 1, 0, false);
        declareFunction("determine_new_meta_split_tactics", "DETERMINE-NEW-META-SPLIT-TACTICS", 2, 0, false);
        declareFunction("new_meta_split_tactic", "NEW-META-SPLIT-TACTIC", 1, 0, false);
        declareFunction("compute_strategic_properties_of_meta_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-SPLIT-TACTIC", 2, 0, false);
        declareFunction("new_meta_split_progress_iterator", "NEW-META-SPLIT-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction("meta_structural_progress_iterator_doneP", "META-STRUCTURAL-PROGRESS-ITERATOR-DONE?", 1, 0, false);
        declareFunction("meta_split_progress_iterator_doneP", "META-SPLIT-PROGRESS-ITERATOR-DONE?", 1, 0, false);
        declareFunction("meta_split_criteria", "META-SPLIT-CRITERIA", 0, 0, false);
        declareFunction("execute_meta_split_tactic", "EXECUTE-META-SPLIT-TACTIC", 1, 0, false);
        declareFunction("meta_split_criterion_applicableP", "META-SPLIT-CRITERION-APPLICABLE?", 2, 0, false);
        declareFunction("meta_split_tactic_create_and_activate_split_tactics", "META-SPLIT-TACTIC-CREATE-AND-ACTIVATE-SPLIT-TACTICS", 3, 0, false);
        declareFunction("meta_split_tactic_create_one_split_tactic", "META-SPLIT-TACTIC-CREATE-ONE-SPLIT-TACTIC", 3, 0, false);
        declareFunction("meta_split_tactic_note_split_tactic_done", "META-SPLIT-TACTIC-NOTE-SPLIT-TACTIC-DONE", 2, 0, false);
        declareFunction("note_split_tactics_strategically_possible", "NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("INDEX-VAR"), makeSymbol("SPLIT-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt7$_s_is_not_a_supporting_mapped_pro = makeString("~s is not a supporting mapped problem of ~s.");

    static private final SubLString $str_alt8$couldn_t_find_any_split_tactics_f = makeString("couldn't find any split tactics for ~s");

    static private final SubLString $str_alt10$Could_not_find_the_link_for__a = makeString("Could not find the link for ~a");

    static private final SubLString $str_alt12$Generalized_tactic__a_did_not_ind = makeString("Generalized tactic ~a did not indicate a valid supporting mapped problem");

    public static final SubLObject init_inference_worker_split_file_alt() {
        defparameter("*SPLIT-MODULE*", inference_modules.inference_structural_module($SPLIT, UNPROVIDED));
        deflexical("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $PREFERRED);
        deflexical("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $$$the_default_for_split_tactics);
        defparameter("*META-SPLIT-TACTICS-ENABLED?*", T);
        deflexical("*DETERMINE-NEW-SPLIT-TACTICS-MODULE*", NIL != boundp($determine_new_split_tactics_module$) ? ((SubLObject) ($determine_new_split_tactics_module$.getGlobalValue())) : inference_modules.inference_meta_structural_module($DETERMINE_NEW_SPLIT_TACTICS, UNPROVIDED));
        deflexical("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $PREFERRED);
        deflexical("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $str_alt24$the_default_for_meta_split_tactic);
        defparameter("*META-SPLIT-CRITERIA*", NIL);
        defparameter("*META-SPLIT-TACTICS-DO-SINGLE-LITERALS-FIRST?*", T);
        defparameter("*META-SPLIT-FAVORS-PROBLEM-REUSE?*", T);
        return NIL;
    }

    public static SubLObject init_inference_worker_split_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*SPLIT-MODULE*", inference_modules.inference_structural_module($SPLIT, UNPROVIDED));
            deflexical("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $PREFERRED);
            deflexical("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $$$the_default_for_split_tactics);
            defparameter("*META-SPLIT-TACTICS-ENABLED?*", T);
            deflexical("*DETERMINE-NEW-SPLIT-TACTICS-MODULE*", SubLTrampolineFile.maybeDefault($determine_new_split_tactics_module$, $determine_new_split_tactics_module$, () -> inference_modules.inference_meta_structural_module($DETERMINE_NEW_SPLIT_TACTICS, UNPROVIDED)));
            deflexical("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $PREFERRED);
            deflexical("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $str24$the_default_for_meta_split_tactic);
            defparameter("*META-SPLIT-CRITERIA*", NIL);
            defparameter("*META-SPLIT-TACTICS-DO-SINGLE-LITERALS-FIRST?*", T);
            defparameter("*META-SPLIT-FAVORS-PROBLEM-REUSE?*", T);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*DETERMINE-NEW-SPLIT-TACTICS-MODULE*", NIL != boundp($determine_new_split_tactics_module$) ? ((SubLObject) ($determine_new_split_tactics_module$.getGlobalValue())) : inference_modules.inference_meta_structural_module($DETERMINE_NEW_SPLIT_TACTICS, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_inference_worker_split_file_Previous() {
        defparameter("*SPLIT-MODULE*", inference_modules.inference_structural_module($SPLIT, UNPROVIDED));
        deflexical("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $PREFERRED);
        deflexical("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $$$the_default_for_split_tactics);
        defparameter("*META-SPLIT-TACTICS-ENABLED?*", T);
        deflexical("*DETERMINE-NEW-SPLIT-TACTICS-MODULE*", SubLTrampolineFile.maybeDefault($determine_new_split_tactics_module$, $determine_new_split_tactics_module$, () -> inference_modules.inference_meta_structural_module($DETERMINE_NEW_SPLIT_TACTICS, UNPROVIDED)));
        deflexical("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $PREFERRED);
        deflexical("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $str24$the_default_for_meta_split_tactic);
        defparameter("*META-SPLIT-CRITERIA*", NIL);
        defparameter("*META-SPLIT-TACTICS-DO-SINGLE-LITERALS-FIRST?*", T);
        defparameter("*META-SPLIT-FAVORS-PROBLEM-REUSE?*", T);
        return NIL;
    }

    static private final SubLString $str_alt13$Tried_to_make_a_split_link_with_l = makeString("Tried to make a split link with less than two supporting problems: ~a");

    static private final SubLString $str_alt24$the_default_for_meta_split_tactic = makeString("the default for meta-split tactics");

    static private final SubLString $str_alt26$unexpected_meta_structural_tactic = makeString("unexpected meta-structural tactic ~s");

    static private final SubLList $list_alt27 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ALL-SINGLE-LITERAL"), makeKeyword("ALL-THE-REST"));

    static private final SubLList $list_alt28 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ONE-CLOSED-PROBLEM-REUSE"), makeKeyword("ALL-SINGLE-LITERAL-PROBLEM-REUSE"), makeKeyword("ONE-CLOSED"), makeKeyword("ALL-THE-REST"));

    public static SubLObject setup_inference_worker_split_file() {
        declare_defglobal($determine_new_split_tactics_module$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_worker_split_file();
    }

    static private final SubLList $list_alt29 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ONE-CLOSED"), makeKeyword("ALL-THE-REST"));

    @Override
    public void initializeVariables() {
        init_inference_worker_split_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_worker_split_file();
    }

    static {
    }

    static private final SubLString $str_alt37$Unknown_meta_split_criterion__s = makeString("Unknown meta-split criterion ~s");

    static private final SubLList $list_alt38 = list(makeSymbol("INDEX"), makeSymbol("SUPPORTING-PROBLEM"));
}

/**
 * Total time: 241 ms
 */
