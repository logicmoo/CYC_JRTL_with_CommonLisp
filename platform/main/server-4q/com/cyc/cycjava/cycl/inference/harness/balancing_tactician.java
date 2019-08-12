/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.assertion_utilities.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.*;
import static com.cyc.cycjava.cycl.inference.harness.removal_tactician.*;
import static com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.set_contents.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class balancing_tactician extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @return NIL or removal-strategy-p.  If T-STRATEGY is controlled by a balancing strategy,
    return the unique removal strategy also controlled by that balancing strategy.
    Otherwise return NIL.
     */
    @LispMethod(comment = "@return NIL or removal-strategy-p.  If T-STRATEGY is controlled by a balancing strategy,\r\nreturn the unique removal strategy also controlled by that balancing strategy.\r\nOtherwise return NIL.")
    public static final SubLObject transformation_strategy_sibling_removal_strategy(SubLObject t_strategy) {
        SubLTrampolineFile.checkType(t_strategy, TRANSFORMATION_STRATEGY_P);
        {
            SubLObject bal_strategy = inference_tactician.controlling_strategy(t_strategy);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_p(bal_strategy)) {
                return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_sole_removal_substrategy(bal_strategy);
            }
        }
        return NIL;
    }

    public static final SubLObject balancing_tactician_allows_split_tactic_to_be_thrown_away_wrt_removalP(SubLObject strategy, SubLObject substrategy, SubLObject split_tactic) {
        SubLTrampolineFile.checkType(substrategy, REMOVAL_STRATEGY_P);
        {
            SubLObject lookahead_problem = inference_worker_split.split_tactic_lookahead_problem(split_tactic);
            return makeBoolean((NIL != lookahead_problem) && (NIL != inference_worker.finished_problem_p(lookahead_problem, strategy)));
        }
    }

    public static final SubLFile me = new balancing_tactician();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.balancing_tactician";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_balancing_tactician_data$ = makeSymbol("*DTP-BALANCING-TACTICIAN-DATA*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $balancing_tactician_early_removal_productivity_limit$ = makeSymbol("*BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*");

    // defparameter
    /**
     * When deciding whether a problem is motivated via residual transformation, if
     * the rule used on the transformation link is a self looping rule and this fix
     * is enabled, prevents the motivation from flowing.
     */
    @LispMethod(comment = "When deciding whether a problem is motivated via residual transformation, if\r\nthe rule used on the transformation link is a self looping rule and this fix\r\nis enabled, prevents the motivation from flowing.\ndefparameter\nWhen deciding whether a problem is motivated via residual transformation, if\nthe rule used on the transformation link is a self looping rule and this fix\nis enabled, prevents the motivation from flowing.")
    private static final SubLSymbol $balancing_tactician_self_looping_rule_fix_enabledP$ = makeSymbol("*BALANCING-TACTICIAN-SELF-LOOPING-RULE-FIX-ENABLED?*");

    // defvar
    /**
     * It seems correct to ensure that the motivating join-ordered link has T before
     * using it to motivate the creation of a new root. However, turning this to NIL
     * causes 13 haystacks to become answerable. Leviathan @todo investigate why,
     * and try to come up with a more principled fix.
     */
    @LispMethod(comment = "It seems correct to ensure that the motivating join-ordered link has T before\r\nusing it to motivate the creation of a new root. However, turning this to NIL\r\ncauses 13 haystacks to become answerable. Leviathan @todo investigate why,\r\nand try to come up with a more principled fix.\ndefvar\nIt seems correct to ensure that the motivating join-ordered link has T before\nusing it to motivate the creation of a new root. However, turning this to NIL\ncauses 13 haystacks to become answerable. Leviathan @todo investigate why,\nand try to come up with a more principled fix.")
    public static final SubLSymbol $balancing_tactician_new_roots_check_for_t_on_jo_linkP$ = makeSymbol("*BALANCING-TACTICIAN-NEW-ROOTS-CHECK-FOR-T-ON-JO-LINK?*");

    // defparameter
    /**
     * There ought to be two triggers for new root creation via an RT link: the
     * motivation transformation link getting T, or the motivating join-ordered link
     * getting T. Leviathan experiments indicated that we actually gain more
     * completeness by refraining from triggering via join-ordered T, but more
     * recent work requires this to be T for correctness.
     */
    @LispMethod(comment = "There ought to be two triggers for new root creation via an RT link: the\r\nmotivation transformation link getting T, or the motivating join-ordered link\r\ngetting T. Leviathan experiments indicated that we actually gain more\r\ncompleteness by refraining from triggering via join-ordered T, but more\r\nrecent work requires this to be T for correctness.\ndefparameter\nThere ought to be two triggers for new root creation via an RT link: the\nmotivation transformation link getting T, or the motivating join-ordered link\ngetting T. Leviathan experiments indicated that we actually gain more\ncompleteness by refraining from triggering via join-ordered T, but more\nrecent work requires this to be T for correctness.")
    private static final SubLSymbol $balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$ = makeSymbol("*BALANCING-TACTICIAN-NEW-ROOTS-TRIGGERED-BY-T-ON-JO-LINK?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $balancing_tactician_is_tactically_hardcoreP$ = makeSymbol("*BALANCING-TACTICIAN-IS-TACTICALLY-HARDCORE?*");

    static private final SubLList $list1 = list(new SubLObject[]{ $NAME, makeString("Balancing Tactician"), makeKeyword("COMMENT"), makeString("A balancing tactician type which delegates to a new-root tactician,\n a transformation tactician, and a single removal tactician."), makeKeyword("CONSTRUCTOR"), makeSymbol("BALANCING-TACTICIAN-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("BALANCING-TACTICIAN-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("BALANCING-TACTICIAN-DO-ONE-STEP"), makeKeyword("INITIAL-RELEVANT-STRATEGIES"), makeSymbol("BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES"), makeKeyword("INITIALIZE-PROPERTIES"), makeSymbol("BALANCING-TACTICIAN-INITIALIZE-PROPERTIES"), makeKeyword("UPDATE-PROPERTIES"), makeSymbol("BALANCING-TACTICIAN-UPDATE-PROPERTIES"), makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeSymbol("BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeKeyword("CONTINUATION-POSSIBLE?"), makeSymbol("BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeSymbol("BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?"), makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK"), makeKeyword("NEW-TACTIC"), makeSymbol("IGNORE"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("IGNORE"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("FALSE"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("FALSE"), makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?"), makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?"), makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE") });

    private static final SubLSymbol BALANCING_TACTICIAN_DATA = makeSymbol("BALANCING-TACTICIAN-DATA");

    private static final SubLSymbol BALANCING_TACTICIAN_DATA_P = makeSymbol("BALANCING-TACTICIAN-DATA-P");

    static private final SubLList $list4 = list(makeSymbol("NEW-ROOT-SUBSTRATEGY"), makeSymbol("TRANSFORMATION-SUBSTRATEGY"), makeSymbol("REMOVAL-SUBSTRATEGIES"));

    static private final SubLList $list5 = list(makeKeyword("NEW-ROOT-SUBSTRATEGY"), makeKeyword("TRANSFORMATION-SUBSTRATEGY"), makeKeyword("REMOVAL-SUBSTRATEGIES"));

    static private final SubLList $list6 = list(makeSymbol("BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), makeSymbol("BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), makeSymbol("BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES"));

    static private final SubLList $list7 = list(makeSymbol("_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), makeSymbol("_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), makeSymbol("_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES"));

    private static final SubLSymbol BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BALANCING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list10 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("BALANCING-TACTICIAN-DATA-P"));

    private static final SubLSymbol BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY = makeSymbol("BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY");

    private static final SubLSymbol _CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY = makeSymbol("_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY");

    private static final SubLSymbol BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY = makeSymbol("BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY");

    private static final SubLSymbol _CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY = makeSymbol("_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY");

    private static final SubLSymbol BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES = makeSymbol("BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES");

    private static final SubLSymbol _CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES = makeSymbol("_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES");

    private static final SubLSymbol $NEW_ROOT_SUBSTRATEGY = makeKeyword("NEW-ROOT-SUBSTRATEGY");

    private static final SubLString $str20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_BALANCING_TACTICIAN_DATA = makeSymbol("MAKE-BALANCING-TACTICIAN-DATA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_BALANCING_TACTICIAN_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-BALANCING-TACTICIAN-DATA-METHOD");

    private static final SubLList $list26 = list(makeKeyword("BALANCING"), makeKeyword("STRIPING"), makeKeyword("ABDUCTIVE"));

    private static final SubLList $list27 = list(list(makeSymbol("SUBSTRATEGY-VAR"), makeSymbol("STRATEGY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list28 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol BALANCING_TACTICIAN_ALL_SUBSTRATEGIES = makeSymbol("BALANCING-TACTICIAN-ALL-SUBSTRATEGIES");

    private static final SubLSymbol DO_BALANCING_TACTICIAN_SUBSTRATEGIES = makeSymbol("DO-BALANCING-TACTICIAN-SUBSTRATEGIES");

    private static final SubLSymbol BALANCING_TACTICIAN_SPINELESS_SUBSTRATEGY_P = makeSymbol("BALANCING-TACTICIAN-SPINELESS-SUBSTRATEGY-P");

    private static final SubLSymbol BALANCING_TACTICIAN_INITIALIZE = makeSymbol("BALANCING-TACTICIAN-INITIALIZE");

    private static final SubLSymbol BALANCING_TACTICIAN_P = makeSymbol("BALANCING-TACTICIAN-P");

    private static final SubLSymbol $sym41$BALANCING_TACTICIAN_DONE_ = makeSymbol("BALANCING-TACTICIAN-DONE?");

    private static final SubLSymbol BALANCING_TACTICIAN_DO_ONE_STEP = makeSymbol("BALANCING-TACTICIAN-DO-ONE-STEP");

    private static final SubLSymbol $RECONSIDER_SET_ASIDES = makeKeyword("RECONSIDER-SET-ASIDES");

    private static final SubLSymbol $PROPAGATE_ANSWER_LINK = makeKeyword("PROPAGATE-ANSWER-LINK");

    private static final SubLString $str48$_a_do_one_step___a__ = makeString("~a do-one-step: ~a~%");

    private static final SubLSymbol $sym49$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_ = makeSymbol("BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?");

    private static final SubLSymbol $sym50$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_PROBLEM_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?");

    private static final SubLSymbol $sym51$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_PROBLEM_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?");

    private static final SubLSymbol $sym52$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?");

    private static final SubLSymbol $sym53$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?");

    private static final SubLSymbol BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES = makeSymbol("BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES");

    private static final SubLSymbol BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED = makeSymbol("BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED");

    private static final SubLSymbol BALANCING_TACTICIAN_INITIALIZE_PROPERTIES = makeSymbol("BALANCING-TACTICIAN-INITIALIZE-PROPERTIES");

    private static final SubLSymbol BALANCING_TACTICIAN_UPDATE_PROPERTIES = makeSymbol("BALANCING-TACTICIAN-UPDATE-PROPERTIES");

    private static final SubLSymbol BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES = makeSymbol("BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES");

    private static final SubLSymbol BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM = makeSymbol("BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM");

    private static final SubLSymbol BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK = makeSymbol("BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK");

    private static final SubLSymbol BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT = makeSymbol("BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT");

    private static final SubLSymbol BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED = makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED");

    private static final SubLSymbol TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");

    private static final SubLSymbol CONNECTED_CONJUNCTION_TACTIC_P = makeSymbol("CONNECTED-CONJUNCTION-TACTIC-P");

    private static final SubLSymbol SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");

    private static final SubLSymbol REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");

    private static final SubLSymbol $sym75$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV = makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?");

    private static final SubLSymbol $sym76$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?");

    private static final SubLSymbol $COMPLETE_REMOVAL_TACTIC_NO_GOOD = makeKeyword("COMPLETE-REMOVAL-TACTIC-NO-GOOD");

    private static final SubLSymbol BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE = makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE");

    public static final SubLObject balancing_tactician_data_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject balancing_tactician_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject balancing_tactician_data_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.balancing_tactician.$balancing_tactician_data_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject balancing_tactician_data_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.balancing_tactician.$balancing_tactician_data_native.class ? T : NIL;
    }

    public static final SubLObject bal_tac_data_new_root_substrategy_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCING_TACTICIAN_DATA_P);
        return v_object.getField2();
    }

    public static SubLObject bal_tac_data_new_root_substrategy(final SubLObject v_object) {
        assert NIL != balancing_tactician.balancing_tactician_data_p(v_object) : "! balancing_tactician.balancing_tactician_data_p(v_object) " + "balancing_tactician.balancing_tactician_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject bal_tac_data_transformation_substrategy_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCING_TACTICIAN_DATA_P);
        return v_object.getField3();
    }

    public static SubLObject bal_tac_data_transformation_substrategy(final SubLObject v_object) {
        assert NIL != balancing_tactician.balancing_tactician_data_p(v_object) : "! balancing_tactician.balancing_tactician_data_p(v_object) " + "balancing_tactician.balancing_tactician_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject bal_tac_data_removal_substrategies_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCING_TACTICIAN_DATA_P);
        return v_object.getField4();
    }

    public static SubLObject bal_tac_data_removal_substrategies(final SubLObject v_object) {
        assert NIL != balancing_tactician.balancing_tactician_data_p(v_object) : "! balancing_tactician.balancing_tactician_data_p(v_object) " + "balancing_tactician.balancing_tactician_data_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_bal_tac_data_new_root_substrategy_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCING_TACTICIAN_DATA_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_bal_tac_data_new_root_substrategy(final SubLObject v_object, final SubLObject value) {
        assert NIL != balancing_tactician.balancing_tactician_data_p(v_object) : "! balancing_tactician.balancing_tactician_data_p(v_object) " + "balancing_tactician.balancing_tactician_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_bal_tac_data_transformation_substrategy_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCING_TACTICIAN_DATA_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_bal_tac_data_transformation_substrategy(final SubLObject v_object, final SubLObject value) {
        assert NIL != balancing_tactician.balancing_tactician_data_p(v_object) : "! balancing_tactician.balancing_tactician_data_p(v_object) " + "balancing_tactician.balancing_tactician_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_bal_tac_data_removal_substrategies_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCING_TACTICIAN_DATA_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_bal_tac_data_removal_substrategies(final SubLObject v_object, final SubLObject value) {
        assert NIL != balancing_tactician.balancing_tactician_data_p(v_object) : "! balancing_tactician.balancing_tactician_data_p(v_object) " + "balancing_tactician.balancing_tactician_data_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_balancing_tactician_data_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.balancing_tactician.$balancing_tactician_data_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NEW_ROOT_SUBSTRATEGY)) {
                        com.cyc.cycjava.cycl.inference.harness.balancing_tactician._csetf_bal_tac_data_new_root_substrategy(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TRANSFORMATION_SUBSTRATEGY)) {
                            com.cyc.cycjava.cycl.inference.harness.balancing_tactician._csetf_bal_tac_data_transformation_substrategy(v_new, current_value);
                        } else {
                            if (pcase_var.eql($REMOVAL_SUBSTRATEGIES)) {
                                com.cyc.cycjava.cycl.inference.harness.balancing_tactician._csetf_bal_tac_data_removal_substrategies(v_new, current_value);
                            } else {
                                Errors.error($str_alt19$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_balancing_tactician_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.balancing_tactician.$balancing_tactician_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql(balancing_tactician.$NEW_ROOT_SUBSTRATEGY)) {
                balancing_tactician._csetf_bal_tac_data_new_root_substrategy(v_new, current_value);
            } else
                if (pcase_var.eql($TRANSFORMATION_SUBSTRATEGY)) {
                    balancing_tactician._csetf_bal_tac_data_transformation_substrategy(v_new, current_value);
                } else
                    if (pcase_var.eql($REMOVAL_SUBSTRATEGIES)) {
                        balancing_tactician._csetf_bal_tac_data_removal_substrategies(v_new, current_value);
                    } else {
                        Errors.error(balancing_tactician.$str20$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_balancing_tactician_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, balancing_tactician.MAKE_BALANCING_TACTICIAN_DATA, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, balancing_tactician.$NEW_ROOT_SUBSTRATEGY, balancing_tactician.bal_tac_data_new_root_substrategy(obj));
        funcall(visitor_fn, obj, $SLOT, $TRANSFORMATION_SUBSTRATEGY, balancing_tactician.bal_tac_data_transformation_substrategy(obj));
        funcall(visitor_fn, obj, $SLOT, $REMOVAL_SUBSTRATEGIES, balancing_tactician.bal_tac_data_removal_substrategies(obj));
        funcall(visitor_fn, obj, $END, balancing_tactician.MAKE_BALANCING_TACTICIAN_DATA, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_balancing_tactician_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return balancing_tactician.visit_defstruct_balancing_tactician_data(obj, visitor_fn);
    }

    public static final SubLObject balancing_tactician_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(v_object)) && (NIL != list_utilities.member_eqP(inference_datastructures_strategy.strategy_type(v_object), $list_alt20)));
    }

    public static SubLObject balancing_tactician_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(v_object)) && (NIL != member_eqP(inference_datastructures_strategy.strategy_type(v_object), balancing_tactician.$list26)));
    }

    public static final SubLObject do_balancing_tactician_substrategies_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject substrategy_var = NIL;
                    SubLObject strategy = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    substrategy_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    strategy = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            if (NIL == member(current_1, $list_alt22, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt21);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(CSOME, list(substrategy_var, list(BALANCING_TACTICIAN_ALL_SUBSTRATEGIES, strategy), done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_balancing_tactician_substrategies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, balancing_tactician.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject substrategy_var = NIL;
        SubLObject strategy = NIL;
        destructuring_bind_must_consp(current, datum, balancing_tactician.$list27);
        substrategy_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, balancing_tactician.$list27);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, balancing_tactician.$list27);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, balancing_tactician.$list27);
            if (NIL == member(current_$1, balancing_tactician.$list28, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == balancing_tactician.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, balancing_tactician.$list27);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CSOME, list(substrategy_var, list(balancing_tactician.BALANCING_TACTICIAN_ALL_SUBSTRATEGIES, strategy), done), append(body, NIL));
    }

    public static final SubLObject do_balancing_tactician_spineful_substrategies_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject substrategy_var = NIL;
                    SubLObject strategy = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    substrategy_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    strategy = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            if (NIL == member(current_2, $list_alt22, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt21);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_BALANCING_TACTICIAN_SUBSTRATEGIES, list(substrategy_var, strategy, $DONE, done), listS(PUNLESS, list(BALANCING_TACTICIAN_SPINELESS_SUBSTRATEGY_P, substrategy_var), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_balancing_tactician_spineful_substrategies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, balancing_tactician.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject substrategy_var = NIL;
        SubLObject strategy = NIL;
        destructuring_bind_must_consp(current, datum, balancing_tactician.$list27);
        substrategy_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, balancing_tactician.$list27);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, balancing_tactician.$list27);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, balancing_tactician.$list27);
            if (NIL == member(current_$2, balancing_tactician.$list28, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == balancing_tactician.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, balancing_tactician.$list27);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(balancing_tactician.DO_BALANCING_TACTICIAN_SUBSTRATEGIES, list(substrategy_var, strategy, $DONE, done), listS(PUNLESS, list(balancing_tactician.BALANCING_TACTICIAN_SPINELESS_SUBSTRATEGY_P, substrategy_var), append(body, NIL)));
    }

    public static final SubLObject new_balancing_tactician_data_alt(SubLObject new_root_substrategy, SubLObject transformation_substrategy, SubLObject removal_substrategies) {
        {
            SubLObject data = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.make_balancing_tactician_data(UNPROVIDED);
            com.cyc.cycjava.cycl.inference.harness.balancing_tactician._csetf_bal_tac_data_new_root_substrategy(data, new_root_substrategy);
            com.cyc.cycjava.cycl.inference.harness.balancing_tactician._csetf_bal_tac_data_transformation_substrategy(data, transformation_substrategy);
            com.cyc.cycjava.cycl.inference.harness.balancing_tactician._csetf_bal_tac_data_removal_substrategies(data, removal_substrategies);
            return data;
        }
    }

    public static SubLObject new_balancing_tactician_data(final SubLObject new_root_substrategy, final SubLObject transformation_substrategy, final SubLObject removal_substrategies) {
        final SubLObject data = balancing_tactician.make_balancing_tactician_data(UNPROVIDED);
        balancing_tactician._csetf_bal_tac_data_new_root_substrategy(data, new_root_substrategy);
        balancing_tactician._csetf_bal_tac_data_transformation_substrategy(data, transformation_substrategy);
        balancing_tactician._csetf_bal_tac_data_removal_substrategies(data, removal_substrategies);
        return data;
    }

    public static final SubLObject balancing_tactician_initialize_alt(SubLObject strategy) {
        inference_datastructures_strategy.set_strategy_data(strategy, com.cyc.cycjava.cycl.inference.harness.balancing_tactician.new_balancing_tactician_data_from_inference(inference_datastructures_strategy.strategy_inference(strategy)));
        return strategy;
    }

    public static SubLObject balancing_tactician_initialize(final SubLObject strategy) {
        inference_datastructures_strategy.set_strategy_data(strategy, balancing_tactician.new_balancing_tactician_data_from_inference(inference_datastructures_strategy.strategy_inference(strategy)));
        return strategy;
    }

    public static final SubLObject new_balancing_tactician_data_from_inference_alt(SubLObject inference) {
        {
            SubLObject new_root_substrategy = inference_datastructures_strategy.new_strategy($NEW_ROOT, inference);
            SubLObject transformation_substrategy = inference_datastructures_strategy.new_strategy($TRANSFORMATION, inference);
            SubLObject sole_removal_substrategy = inference_datastructures_strategy.new_strategy($REMOVAL, inference);
            return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.new_balancing_tactician_data(new_root_substrategy, transformation_substrategy, list(sole_removal_substrategy));
        }
    }

    public static SubLObject new_balancing_tactician_data_from_inference(final SubLObject inference) {
        final SubLObject new_root_substrategy = inference_datastructures_strategy.new_strategy($NEW_ROOT, inference);
        final SubLObject transformation_substrategy = inference_datastructures_strategy.new_strategy($TRANSFORMATION, inference);
        final SubLObject sole_removal_substrategy = inference_datastructures_strategy.new_strategy($REMOVAL, inference);
        return balancing_tactician.new_balancing_tactician_data(new_root_substrategy, transformation_substrategy, list(sole_removal_substrategy));
    }

    public static final SubLObject balancing_tactician_new_root_substrategy_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCING_TACTICIAN_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.bal_tac_data_new_root_substrategy(data);
        }
    }

    public static SubLObject balancing_tactician_new_root_substrategy(final SubLObject strategy) {
        assert NIL != balancing_tactician.balancing_tactician_p(strategy) : "! balancing_tactician.balancing_tactician_p(strategy) " + ("balancing_tactician.balancing_tactician_p(strategy) " + "CommonSymbols.NIL != balancing_tactician.balancing_tactician_p(strategy) ") + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return balancing_tactician.bal_tac_data_new_root_substrategy(data);
    }

    public static final SubLObject balancing_tactician_transformation_substrategy_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCING_TACTICIAN_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.bal_tac_data_transformation_substrategy(data);
        }
    }

    public static SubLObject balancing_tactician_transformation_substrategy(final SubLObject strategy) {
        assert NIL != balancing_tactician.balancing_tactician_p(strategy) : "! balancing_tactician.balancing_tactician_p(strategy) " + ("balancing_tactician.balancing_tactician_p(strategy) " + "CommonSymbols.NIL != balancing_tactician.balancing_tactician_p(strategy) ") + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return balancing_tactician.bal_tac_data_transformation_substrategy(data);
    }

    public static final SubLObject balancing_tactician_removal_substrategies_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCING_TACTICIAN_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.bal_tac_data_removal_substrategies(data);
        }
    }

    public static SubLObject balancing_tactician_removal_substrategies(final SubLObject strategy) {
        assert NIL != balancing_tactician.balancing_tactician_p(strategy) : "! balancing_tactician.balancing_tactician_p(strategy) " + ("balancing_tactician.balancing_tactician_p(strategy) " + "CommonSymbols.NIL != balancing_tactician.balancing_tactician_p(strategy) ") + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return balancing_tactician.bal_tac_data_removal_substrategies(data);
    }

    public static final SubLObject balancing_tactician_sole_removal_substrategy_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCING_TACTICIAN_P);
        return list_utilities.only_one(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_removal_substrategies(strategy));
    }

    public static SubLObject balancing_tactician_sole_removal_substrategy(final SubLObject strategy) {
        assert NIL != balancing_tactician.balancing_tactician_p(strategy) : "! balancing_tactician.balancing_tactician_p(strategy) " + ("balancing_tactician.balancing_tactician_p(strategy) " + "CommonSymbols.NIL != balancing_tactician.balancing_tactician_p(strategy) ") + strategy;
        return only_one(balancing_tactician.balancing_tactician_removal_substrategies(strategy));
    }

    /**
     *
     *
     * @unknown result is not destructible
     */
    @LispMethod(comment = "@unknown result is not destructible")
    public static final SubLObject balancing_tactician_all_substrategies_alt(SubLObject strategy) {
        return listS(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_new_root_substrategy(strategy), com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_transformation_substrategy(strategy), com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_removal_substrategies(strategy));
    }

    /**
     *
     *
     * @unknown result is not destructible
     */
    @LispMethod(comment = "@unknown result is not destructible")
    public static SubLObject balancing_tactician_all_substrategies(final SubLObject strategy) {
        return listS(balancing_tactician.balancing_tactician_new_root_substrategy(strategy), balancing_tactician.balancing_tactician_transformation_substrategy(strategy), balancing_tactician.balancing_tactician_removal_substrategies(strategy));
    }

    public static final SubLObject balancing_tactician_problem_motivated_wrt_nP_alt(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_new_root_substrategy(strategy));
    }

    public static SubLObject balancing_tactician_problem_motivated_wrt_nP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, balancing_tactician.balancing_tactician_new_root_substrategy(strategy));
    }

    public static final SubLObject balancing_tactician_problem_motivated_wrt_rP_alt(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy));
    }

    public static SubLObject balancing_tactician_problem_motivated_wrt_rP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy));
    }

    public static final SubLObject balancing_tactician_problem_motivated_wrt_tP_alt(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_transformation_substrategy(strategy));
    }

    public static SubLObject balancing_tactician_problem_motivated_wrt_tP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, balancing_tactician.balancing_tactician_transformation_substrategy(strategy));
    }

    public static final SubLObject balancing_tactician_link_head_motivated_wrt_rP_alt(SubLObject strategy, SubLObject link_head) {
        return inference_tactician.substrategy_link_head_motivatedP(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy), link_head);
    }

    public static SubLObject balancing_tactician_link_head_motivated_wrt_rP(final SubLObject strategy, final SubLObject link_head) {
        return inference_tactician.substrategy_link_head_motivatedP(balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy), link_head);
    }

    public static final SubLObject balancing_tactician_substrategy_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(v_object)) && (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_p(inference_tactician.controlling_strategy(v_object))));
    }

    public static SubLObject balancing_tactician_substrategy_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(v_object)) && (NIL != balancing_tactician.balancing_tactician_p(inference_tactician.controlling_strategy(v_object))));
    }

    public static final SubLObject balancing_tactician_proper_substrategy_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(v_object)) && (NIL == com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_p(v_object))) && (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_p(inference_tactician.controlling_strategy(v_object))));
    }

    public static SubLObject balancing_tactician_proper_substrategy_p(final SubLObject v_object) {
        return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(v_object)) && (NIL == balancing_tactician.balancing_tactician_p(v_object))) && (NIL != balancing_tactician.balancing_tactician_p(inference_tactician.controlling_strategy(v_object))));
    }

    public static final SubLObject balancing_tactician_spineless_substrategy_p_alt(SubLObject v_object) {
        return new_root_tactician.new_root_strategy_p(v_object);
    }

    public static SubLObject balancing_tactician_spineless_substrategy_p(final SubLObject v_object) {
        return new_root_tactician.new_root_strategy_p(v_object);
    }

    public static final SubLObject balancing_tactician_doneP_alt(SubLObject strategy) {
        {
            SubLObject not_yet_doneP = NIL;
            if (NIL == not_yet_doneP) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
                    SubLObject substrategy = NIL;
                    for (substrategy = csome_list_var.first(); !((NIL != not_yet_doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , substrategy = csome_list_var.first()) {
                        if (NIL == inference_tactician.strategy_doneP(substrategy)) {
                            not_yet_doneP = T;
                        }
                    }
                }
            }
            return makeBoolean(NIL == not_yet_doneP);
        }
    }

    public static SubLObject balancing_tactician_doneP(final SubLObject strategy) {
        SubLObject not_yet_doneP = NIL;
        if (NIL == not_yet_doneP) {
            SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = NIL;
            substrategy = csome_list_var.first();
            while ((NIL == not_yet_doneP) && (NIL != csome_list_var)) {
                if (NIL == inference_tactician.strategy_doneP(substrategy)) {
                    not_yet_doneP = T;
                }
                csome_list_var = csome_list_var.rest();
                substrategy = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == not_yet_doneP);
    }

    public static final SubLObject balancing_tactician_do_one_step_alt(SubLObject strategy) {
        {
            SubLObject result = $UNINTERESTING;
            while ($UNINTERESTING == result) {
                result = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_do_one_step_int(strategy);
            } 
            return eq($DONE, result);
        }
    }

    public static SubLObject balancing_tactician_do_one_step(final SubLObject strategy) {
        SubLObject result;
        for (result = $UNINTERESTING; $UNINTERESTING == result; result = balancing_tactician.balancing_tactician_do_one_step_int(strategy)) {
        }
        return eq($DONE, result);
    }

    public static final SubLObject balancing_tactician_do_one_step_int_alt(SubLObject strategy) {
        {
            SubLObject result = NIL;
            if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_should_reconsider_set_asidesP(strategy)) {
                com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_reconsider_set_asides(strategy);
                result = $UNINTERESTING;
            } else {
                if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
                    {
                        SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference_datastructures_strategy.strategy_inference(strategy));
                        SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
                        SubLObject n_strategy = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_new_root_substrategy(strategy);
                        inference_tactician.substrategy_motivate_strategem(n_strategy, root_problem);
                        inference_worker.possibly_propagate_answer_link(answer_link);
                    }
                    result = $INTERESTING;
                } else {
                    if (NIL == inference_tactician.strategy_doneP(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy))) {
                        result = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.substrategy_do_one_step_interestingness(inference_tactician.substrategy_do_one_step(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy)));
                    } else {
                        if (NIL == inference_tactician.strategy_doneP(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_new_root_substrategy(strategy))) {
                            {
                                SubLObject n_strategy = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_new_root_substrategy(strategy);
                                SubLObject r_strategy = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy);
                                SubLObject t_strategy = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_transformation_substrategy(strategy);
                                SubLObject new_root = inference_tactician.substrategy_peek_next_strategem(n_strategy);
                                result = inference_tactician.substrategy_do_one_step(n_strategy);
                                {
                                    SubLObject re_addP = NIL;
                                    if (NIL == com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_problem_motivated_wrt_rP(strategy, new_root)) {
                                        re_addP = T;
                                        inference_tactician.substrategy_motivate_strategem(r_strategy, new_root);
                                    } else {
                                        if ((NIL == com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_problem_motivated_wrt_tP(strategy, new_root)) && (NIL == inference_tactician.strategy_throws_away_all_transformationP(t_strategy))) {
                                            re_addP = T;
                                            inference_tactician.substrategy_motivate_strategem(t_strategy, new_root);
                                        }
                                    }
                                    if (NIL != re_addP) {
                                        inference_tactician.substrategy_activate_strategem(n_strategy, new_root);
                                    }
                                }
                            }
                        } else {
                            if (NIL == inference_tactician.strategy_doneP(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_transformation_substrategy(strategy))) {
                                result = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.substrategy_do_one_step_interestingness(inference_tactician.substrategy_do_one_step(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_transformation_substrategy(strategy)));
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject balancing_tactician_do_one_step_int(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject action = NIL;
        if (NIL != balancing_tactician.balancing_tactician_should_reconsider_set_asidesP(strategy)) {
            balancing_tactician.balancing_tactician_reconsider_set_asides(strategy);
            action = balancing_tactician.$RECONSIDER_SET_ASIDES;
            result = $UNINTERESTING;
        } else
            if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
                final SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference_datastructures_strategy.strategy_inference(strategy));
                final SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
                final SubLObject n_strategy = balancing_tactician.balancing_tactician_new_root_substrategy(strategy);
                inference_tactician.substrategy_motivate_strategem(n_strategy, root_problem);
                inference_worker.possibly_propagate_answer_link(answer_link);
                action = balancing_tactician.$PROPAGATE_ANSWER_LINK;
                result = $INTERESTING;
            } else
                if (NIL == inference_tactician.strategy_doneP(balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy))) {
                    action = balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy);
                    result = balancing_tactician.substrategy_do_one_step_interestingness(inference_tactician.substrategy_do_one_step(balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy)));
                } else
                    if (NIL == inference_tactician.strategy_doneP(balancing_tactician.balancing_tactician_new_root_substrategy(strategy))) {
                        final SubLObject n_strategy2 = balancing_tactician.balancing_tactician_new_root_substrategy(strategy);
                        final SubLObject r_strategy = balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy);
                        final SubLObject t_strategy = balancing_tactician.balancing_tactician_transformation_substrategy(strategy);
                        final SubLObject new_root = inference_tactician.substrategy_peek_next_strategem(n_strategy2);
                        action = n_strategy2;
                        result = inference_tactician.substrategy_do_one_step(n_strategy2);
                        SubLObject re_addP = NIL;
                        if (NIL == balancing_tactician.balancing_tactician_problem_motivated_wrt_rP(strategy, new_root)) {
                            re_addP = T;
                            action = list($MOTIVATION, r_strategy, new_root);
                            inference_tactician.substrategy_motivate_strategem(r_strategy, new_root);
                        } else
                            if ((NIL == balancing_tactician.balancing_tactician_problem_motivated_wrt_tP(strategy, new_root)) && (NIL == inference_tactician.strategy_throws_away_all_transformationP(t_strategy))) {
                                re_addP = T;
                                action = list($MOTIVATION, t_strategy, new_root);
                                inference_tactician.substrategy_motivate_strategem(t_strategy, new_root);
                            }

                        if (NIL != re_addP) {
                            inference_tactician.substrategy_activate_strategem(n_strategy2, new_root);
                        }
                    } else
                        if (NIL == inference_tactician.strategy_doneP(balancing_tactician.balancing_tactician_transformation_substrategy(strategy))) {
                            action = balancing_tactician.balancing_tactician_transformation_substrategy(strategy);
                            result = balancing_tactician.substrategy_do_one_step_interestingness(inference_tactician.substrategy_do_one_step(balancing_tactician.balancing_tactician_transformation_substrategy(strategy)));
                        }




        if ($inference_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            format_nil.force_format(T, balancing_tactician.$str48$_a_do_one_step___a__, strategy, action, NIL, NIL, NIL, NIL, NIL, NIL);
        }
        return result;
    }

    public static final SubLObject balancing_tactician_should_reconsider_set_asidesP_alt(SubLObject strategy) {
        {
            SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = NIL;
            for (substrategy = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , substrategy = csome_list_var.first()) {
                if (NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(substrategy)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_should_reconsider_set_asidesP(final SubLObject strategy) {
        SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(substrategy)) {
                return T;
            }
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject balancing_tactician_reconsider_set_asides_alt(SubLObject strategy) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = NIL;
            for (substrategy = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , substrategy = csome_list_var.first()) {
                count = add(count, inference_tactician.strategy_reconsider_set_asides(substrategy));
            }
            return count;
        }
    }

    public static SubLObject balancing_tactician_reconsider_set_asides(final SubLObject strategy) {
        SubLObject count = ZERO_INTEGER;
        SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            count = add(count, inference_tactician.strategy_reconsider_set_asides(substrategy));
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        } 
        return count;
    }

    /**
     * Substrategies return T if they're done (an uninteresting quiescence) and NIL otherwise.
     * This is used to keep the balancing tactician's notion of :max-step in line with other strategies'.
     */
    @LispMethod(comment = "Substrategies return T if they\'re done (an uninteresting quiescence) and NIL otherwise.\r\nThis is used to keep the balancing tactician\'s notion of :max-step in line with other strategies\'.\nSubstrategies return T if they\'re done (an uninteresting quiescence) and NIL otherwise.\nThis is used to keep the balancing tactician\'s notion of :max-step in line with other strategies\'.")
    public static final SubLObject substrategy_do_one_step_interestingness_alt(SubLObject substrategy_return_value) {
        return NIL != substrategy_return_value ? ((SubLObject) ($UNINTERESTING)) : $INTERESTING;
    }

    /**
     * Substrategies return T if they're done (an uninteresting quiescence) and NIL otherwise.
     * This is used to keep the balancing tactician's notion of :max-step in line with other strategies'.
     */
    @LispMethod(comment = "Substrategies return T if they\'re done (an uninteresting quiescence) and NIL otherwise.\r\nThis is used to keep the balancing tactician\'s notion of :max-step in line with other strategies\'.\nSubstrategies return T if they\'re done (an uninteresting quiescence) and NIL otherwise.\nThis is used to keep the balancing tactician\'s notion of :max-step in line with other strategies\'.")
    public static SubLObject substrategy_do_one_step_interestingness(final SubLObject substrategy_return_value) {
        return NIL != substrategy_return_value ? $UNINTERESTING : $INTERESTING;
    }

    public static final SubLObject balancing_tactician_continuation_possibleP_alt(SubLObject strategy) {
        {
            SubLObject continuation_possibleP = NIL;
            if (NIL == continuation_possibleP) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
                    SubLObject substrategy = NIL;
                    for (substrategy = csome_list_var.first(); !((NIL != continuation_possibleP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , substrategy = csome_list_var.first()) {
                        if (NIL != inference_tactician.strategy_continuation_possibleP(substrategy)) {
                            continuation_possibleP = T;
                        }
                    }
                }
            }
            return continuation_possibleP;
        }
    }

    public static SubLObject balancing_tactician_continuation_possibleP(final SubLObject strategy) {
        SubLObject continuation_possibleP = NIL;
        if (NIL == continuation_possibleP) {
            SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = NIL;
            substrategy = csome_list_var.first();
            while ((NIL == continuation_possibleP) && (NIL != csome_list_var)) {
                if (NIL != inference_tactician.strategy_continuation_possibleP(substrategy)) {
                    continuation_possibleP = T;
                }
                csome_list_var = csome_list_var.rest();
                substrategy = csome_list_var.first();
            } 
        }
        return continuation_possibleP;
    }

    public static SubLObject balancing_tactician_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem) {
        SubLObject dont_throw_awayP = NIL;
        if (NIL == dont_throw_awayP) {
            SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = NIL;
            sub_strategy = csome_list_var.first();
            while ((NIL == dont_throw_awayP) && (NIL != csome_list_var)) {
                if (NIL == balancing_tactician.balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_throw_awayP = makeBoolean(NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_problemP(sub_strategy, problem, UNPROVIDED));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == dont_throw_awayP);
    }

    public static SubLObject balancing_tactician_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem) {
        SubLObject dont_set_asideP = NIL;
        if (NIL == dont_set_asideP) {
            SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = NIL;
            sub_strategy = csome_list_var.first();
            while ((NIL == dont_set_asideP) && (NIL != csome_list_var)) {
                if (NIL == balancing_tactician.balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_set_asideP = makeBoolean(NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_set_aside_problemP(sub_strategy, problem));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == dont_set_asideP);
    }

    public static final SubLObject balancing_tactician_chooses_to_throw_away_tacticP_alt(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        {
            SubLObject dont_throw_awayP = NIL;
            if (NIL == dont_throw_awayP) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
                    SubLObject sub_strategy = NIL;
                    for (sub_strategy = csome_list_var.first(); !((NIL != dont_throw_awayP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sub_strategy = csome_list_var.first()) {
                        if (NIL == com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                            dont_throw_awayP = makeBoolean(NIL == strategy_chooses_to_throw_away_tacticP(sub_strategy, tactic, problem_already_consideredP, siblings_already_consideredP));
                        }
                    }
                }
            }
            return makeBoolean(NIL == dont_throw_awayP);
        }
    }

    public static SubLObject balancing_tactician_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        SubLObject dont_throw_awayP = NIL;
        if (NIL == dont_throw_awayP) {
            SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = NIL;
            sub_strategy = csome_list_var.first();
            while ((NIL == dont_throw_awayP) && (NIL != csome_list_var)) {
                if (NIL == balancing_tactician.balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_throw_awayP = makeBoolean(NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_tacticP(sub_strategy, tactic, problem_already_consideredP, siblings_already_consideredP));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == dont_throw_awayP);
    }

    public static final SubLObject balancing_tactician_chooses_to_set_aside_tacticP_alt(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        {
            SubLObject dont_set_asideP = NIL;
            if (NIL == dont_set_asideP) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
                    SubLObject sub_strategy = NIL;
                    for (sub_strategy = csome_list_var.first(); !((NIL != dont_set_asideP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sub_strategy = csome_list_var.first()) {
                        if (NIL == com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                            dont_set_asideP = makeBoolean(NIL == strategy_chooses_to_set_aside_tacticP(sub_strategy, tactic, problem_already_consideredP, siblings_already_consideredP));
                        }
                    }
                }
            }
            return makeBoolean(NIL == dont_set_asideP);
        }
    }

    public static SubLObject balancing_tactician_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        SubLObject dont_set_asideP = NIL;
        if (NIL == dont_set_asideP) {
            SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = NIL;
            sub_strategy = csome_list_var.first();
            while ((NIL == dont_set_asideP) && (NIL != csome_list_var)) {
                if (NIL == balancing_tactician.balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_set_asideP = makeBoolean(NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_set_aside_tacticP(sub_strategy, tactic, problem_already_consideredP, siblings_already_consideredP));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == dont_set_asideP);
    }

    public static final SubLObject balancing_tactician_throw_away_uninteresting_set_asides_alt(SubLObject strategy) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = NIL;
            for (substrategy = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , substrategy = csome_list_var.first()) {
                count = add(count, inference_tactician.strategy_throw_away_uninteresting_set_asides(substrategy));
            }
            return count;
        }
    }

    public static SubLObject balancing_tactician_throw_away_uninteresting_set_asides(final SubLObject strategy) {
        SubLObject count = ZERO_INTEGER;
        SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            count = add(count, inference_tactician.strategy_throw_away_uninteresting_set_asides(substrategy));
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        } 
        return count;
    }

    public static final SubLObject balancing_tactician_note_inference_dynamic_properties_updated_alt(SubLObject strategy) {
        {
            SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = NIL;
            for (substrategy = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , substrategy = csome_list_var.first()) {
                inference_tactician.strategy_note_inference_dynamic_properties_updated(substrategy);
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_note_inference_dynamic_properties_updated(final SubLObject strategy) {
        SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            inference_tactician.strategy_note_inference_dynamic_properties_updated(substrategy);
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject balancing_tactician_initialize_properties_alt(SubLObject strategy, SubLObject strategy_static_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_static_properties);
        {
            SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = NIL;
            for (substrategy = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , substrategy = csome_list_var.first()) {
                inference_tactician.strategy_initialize_properties(substrategy, strategy_static_properties);
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_initialize_properties(final SubLObject strategy, final SubLObject strategy_static_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_static_properties);
        SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            inference_tactician.strategy_initialize_properties(substrategy, strategy_static_properties);
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject balancing_tactician_update_properties_alt(SubLObject strategy, SubLObject strategy_dynamic_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_dynamic_properties);
        {
            SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = NIL;
            for (substrategy = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , substrategy = csome_list_var.first()) {
                inference_tactician.strategy_update_properties(substrategy, strategy_dynamic_properties);
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_update_properties(final SubLObject strategy, final SubLObject strategy_dynamic_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_dynamic_properties);
        SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            inference_tactician.strategy_update_properties(substrategy, strategy_dynamic_properties);
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject balancing_tactician_initial_relevant_strategies_alt(SubLObject strategy) {
        return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
    }

    public static SubLObject balancing_tactician_initial_relevant_strategies(final SubLObject strategy) {
        return balancing_tactician.balancing_tactician_all_substrategies(strategy);
    }

    public static final SubLObject balancing_tactician_possibly_activate_problem_alt(SubLObject strategy, SubLObject problem) {
        if (NIL == inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_problem_is_the_rest_of_an_early_removalP(strategy, problem)) {
                com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, problem);
            } else {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_problem_is_the_result_of_a_simplificationP(strategy, problem)) {
                    com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, problem);
                }
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_possibly_activate_problem(final SubLObject strategy, final SubLObject problem) {
        if (NIL == inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
            if (NIL != balancing_tactician.balancing_tactician_problem_is_the_rest_of_an_early_removalP(strategy, problem)) {
                balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, problem);
            } else
                if (NIL != balancing_tactician.balancing_tactician_problem_is_the_result_of_a_simplificationP(strategy, problem)) {
                    balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, problem);
                }

        }
        return NIL;
    }

    /**
     * if you are a restricted non-focal problem of some early removal link,
     * you get N.  you're the rest of an early removal.
     */
    @LispMethod(comment = "if you are a restricted non-focal problem of some early removal link,\r\nyou get N.  you\'re the rest of an early removal.\nif you are a restricted non-focal problem of some early removal link,\nyou get N.  you\'re the rest of an early removal.")
    public static final SubLObject balancing_tactician_problem_is_the_rest_of_an_early_removalP_alt(SubLObject strategy, SubLObject problem) {
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                            {
                                SubLObject non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                                SubLObject set_contents_var_3 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                                SubLObject basis_object_4 = set_contents.do_set_contents_basis_object(set_contents_var_3);
                                SubLObject state_5 = NIL;
                                for (state_5 = set_contents.do_set_contents_initial_state(basis_object_4, set_contents_var_3); NIL == set_contents.do_set_contents_doneP(basis_object_4, state_5); state_5 = set_contents.do_set_contents_update_state(state_5)) {
                                    {
                                        SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object_4, state_5);
                                        if (NIL != set_contents.do_set_contents_element_validP(state_5, join_ordered_link)) {
                                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
                                                if (NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link)) {
                                                    if (non_focal_problem == inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link)) {
                                                        if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(strategy, problem, join_ordered_link)) {
                                                            return T;
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
        return NIL;
    }

    /**
     * if you are a restricted non-focal problem of some early removal link,
     * you get N.  you're the rest of an early removal.
     */
    @LispMethod(comment = "if you are a restricted non-focal problem of some early removal link,\r\nyou get N.  you\'re the rest of an early removal.\nif you are a restricted non-focal problem of some early removal link,\nyou get N.  you\'re the rest of an early removal.")
    public static SubLObject balancing_tactician_problem_is_the_rest_of_an_early_removalP(final SubLObject strategy, final SubLObject problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject restriction_link;
        SubLObject non_focal_problem;
        SubLObject set_contents_var_$3;
        SubLObject basis_object_$4;
        SubLObject state_$5;
        SubLObject join_ordered_link;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            restriction_link = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, restriction_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION))) {
                non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                set_contents_var_$3 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                for (basis_object_$4 = do_set_contents_basis_object(set_contents_var_$3), state_$5 = NIL, state_$5 = do_set_contents_initial_state(basis_object_$4, set_contents_var_$3); NIL == do_set_contents_doneP(basis_object_$4, state_$5); state_$5 = do_set_contents_update_state(state_$5)) {
                    join_ordered_link = do_set_contents_next(basis_object_$4, state_$5);
                    if (((((NIL != do_set_contents_element_validP(state_$5, join_ordered_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED))) && (NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link))) && non_focal_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link))) && (NIL != balancing_tactician.balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(strategy, problem, join_ordered_link))) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP_alt(SubLObject strategy, SubLObject problem, SubLObject join_ordered_link) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_treats_restricted_non_focal_as_new_rootP(strategy, join_ordered_link)) {
            return T;
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_early_removal_linkP(strategy, join_ordered_link)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(final SubLObject strategy, final SubLObject problem, final SubLObject join_ordered_link) {
        if (NIL != balancing_tactician.balancing_tactician_treats_restricted_non_focal_as_new_rootP(strategy, join_ordered_link)) {
            return T;
        }
        if (NIL != balancing_tactician.balancing_tactician_early_removal_linkP(strategy, join_ordered_link)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject balancing_tactician_treats_restricted_non_focal_as_new_rootP_alt(SubLObject strategy, SubLObject join_ordered_link) {
        return makeBoolean((NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_unbound_predicateP(join_ordered_link)) || (NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP(join_ordered_link)));
    }

    public static SubLObject balancing_tactician_treats_restricted_non_focal_as_new_rootP(final SubLObject strategy, final SubLObject join_ordered_link) {
        return makeBoolean((NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_unbound_predicateP(join_ordered_link)) || (NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP(join_ordered_link)));
    }

    /**
     * you're join-ordered, you have R, your supported problem has N, your lookahead problem is complete, you're cheap, and you're open.
     */
    @LispMethod(comment = "you\'re join-ordered, you have R, your supported problem has N, your lookahead problem is complete, you\'re cheap, and you\'re open.")
    public static final SubLObject balancing_tactician_early_removal_linkP_alt(SubLObject strategy, SubLObject link) {
        SubLTrampolineFile.checkType(strategy, BALANCING_TACTICIAN_P);
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        {
            SubLObject r_strategy = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy);
            return makeBoolean((((((NIL != inference_worker_join_ordered.join_ordered_link_p(link)) && (NIL != inference_datastructures_problem_link.problem_link_openP(link))) && (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.substrategy_connected_conjunction_link_motivatedP(r_strategy, link))) && (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link)))) && ($COMPLETE == inference_worker.problem_generalized_removal_completeness(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(inference_worker_join_ordered.join_ordered_link_tactic(link)), r_strategy))) && (NIL != inference_tactician.join_ordered_link_early_removal_cheapP(link, strategy)));
        }
    }

    /**
     * you're join-ordered, you have R, your supported problem has N, your lookahead problem is complete, you're cheap, and you're open.
     */
    @LispMethod(comment = "you\'re join-ordered, you have R, your supported problem has N, your lookahead problem is complete, you\'re cheap, and you\'re open.")
    public static SubLObject balancing_tactician_early_removal_linkP(final SubLObject strategy, final SubLObject link) {
        assert NIL != balancing_tactician.balancing_tactician_p(strategy) : "! balancing_tactician.balancing_tactician_p(strategy) " + ("balancing_tactician.balancing_tactician_p(strategy) " + "CommonSymbols.NIL != balancing_tactician.balancing_tactician_p(strategy) ") + strategy;
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        final SubLObject r_strategy = balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy);
        return makeBoolean((((((NIL != inference_worker_join_ordered.join_ordered_link_p(link)) && (NIL != inference_datastructures_problem_link.problem_link_openP(link))) && (NIL != balancing_tactician.substrategy_connected_conjunction_link_motivatedP(r_strategy, link))) && (NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link)))) && ($COMPLETE == inference_worker.problem_generalized_removal_completeness(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(inference_worker_join_ordered.join_ordered_link_tactic(link)), r_strategy))) && (NIL != inference_tactician.join_ordered_link_early_removal_cheapP(link, strategy)));
    }

    public static final SubLObject substrategy_connected_conjunction_link_motivatedP_alt(SubLObject substrategy, SubLObject connected_conjunction_link) {
        {
            SubLObject link_head = inference_worker.connected_conjunction_link_tactic(connected_conjunction_link);
            return inference_tactician.substrategy_link_head_motivatedP(substrategy, link_head);
        }
    }

    public static SubLObject substrategy_connected_conjunction_link_motivatedP(final SubLObject substrategy, final SubLObject connected_conjunction_link) {
        final SubLObject link_head = inference_worker.connected_conjunction_link_tactic(connected_conjunction_link);
        return inference_tactician.substrategy_link_head_motivatedP(substrategy, link_head);
    }

    public static final SubLObject balancing_tactician_problem_is_the_result_of_a_simplificationP_alt(SubLObject strategy, SubLObject problem) {
        if (NIL != inference_worker_restriction.problem_is_a_simplificationP(problem)) {
            {
                SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject simplification_link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, simplification_link)) {
                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(simplification_link, $SIMPLIFICATION)) {
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(simplification_link))) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_problem_is_the_result_of_a_simplificationP(final SubLObject strategy, final SubLObject problem) {
        if (NIL != inference_worker_restriction.problem_is_a_simplificationP(problem)) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject simplification_link;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                simplification_link = do_set_contents_next(basis_object, state);
                if (((NIL != do_set_contents_element_validP(state, simplification_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(simplification_link, $SIMPLIFICATION))) && (NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(simplification_link)))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balancing_tactician_note_argument_link_alt(SubLObject strategy, SubLObject link) {
        if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            {
                SubLObject rt_link = link;
                SubLObject t_strategy = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_transformation_substrategy(strategy);
                SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
                if (NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, t_link)) {
                    com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_substrategy_link_motivated(strategy, t_strategy, t_link);
                }
            }
        } else {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_note_argument_link(final SubLObject strategy, final SubLObject link) {
        if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            final SubLObject t_strategy = balancing_tactician.balancing_tactician_transformation_substrategy(strategy);
            final SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link);
            if (NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, t_link)) {
                balancing_tactician.balancing_tactician_substrategy_link_motivated(strategy, t_strategy, t_link);
            }
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject balancing_tactician_early_removal_productivity_limit_alt(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $balancing_tactician_early_removal_productivity_limit$.getDynamicValue(thread);
        }
    }

    public static SubLObject balancing_tactician_early_removal_productivity_limit(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return balancing_tactician.$balancing_tactician_early_removal_productivity_limit$.getDynamicValue(thread);
    }

    public static final SubLObject balancing_tactician_substrategy_strategem_motivated_alt(SubLObject strategy, SubLObject substrategy, SubLObject strategem) {
        if (NIL != inference_datastructures_problem.problem_p(strategem)) {
            return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_substrategy_problem_motivated(strategy, substrategy, strategem);
        } else {
            if (NIL != inference_datastructures_problem_link.problem_link_p(strategem)) {
                return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_substrategy_link_motivated(strategy, substrategy, strategem);
            } else {
                if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
                    return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_substrategy_tactic_motivated(strategy, substrategy, strategem);
                }
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_substrategy_strategem_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject strategem) {
        if (NIL != inference_datastructures_problem.problem_p(strategem)) {
            return balancing_tactician.balancing_tactician_substrategy_problem_motivated(strategy, substrategy, strategem);
        }
        if (NIL != inference_datastructures_problem_link.problem_link_p(strategem)) {
            return balancing_tactician.balancing_tactician_substrategy_link_motivated(strategy, substrategy, strategem);
        }
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return balancing_tactician.balancing_tactician_substrategy_tactic_motivated(strategy, substrategy, strategem);
        }
        return NIL;
    }

    public static final SubLObject balancing_tactician_substrategy_problem_motivated_alt(SubLObject strategy, SubLObject substrategy, SubLObject problem) {
        inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
        if (NIL != new_root_tactician.new_root_strategy_p(substrategy)) {
            {
                SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject split_link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, split_link)) {
                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $SPLIT)) {
                                com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_propagate_new_root_motivation_down_split_link(strategy, split_link);
                            }
                        }
                    }
                }
            }
            {
                SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject union_link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, union_link)) {
                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, $UNION)) {
                                com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_propagate_new_root_motivation_down_union_link(strategy, union_link);
                            }
                        }
                    }
                }
            }
            {
                SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $JOIN_ORDERED)) {
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_early_removal_linkP(strategy, link)) {
                                    {
                                        SubLObject link_var = link;
                                        SubLObject set_contents_var_6 = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                                        SubLObject basis_object_7 = set_contents.do_set_contents_basis_object(set_contents_var_6);
                                        SubLObject state_8 = NIL;
                                        for (state_8 = set_contents.do_set_contents_initial_state(basis_object_7, set_contents_var_6); NIL == set_contents.do_set_contents_doneP(basis_object_7, state_8); state_8 = set_contents.do_set_contents_update_state(state_8)) {
                                            {
                                                SubLObject restriction_link = set_contents.do_set_contents_next(basis_object_7, state_8);
                                                if (NIL != set_contents.do_set_contents_element_validP(state_8, restriction_link)) {
                                                    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                                                        if (NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var)) {
                                                            {
                                                                SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                                                                com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, restricted_non_focal_problem);
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
        return NIL;
    }

    public static SubLObject balancing_tactician_substrategy_problem_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject problem) {
        inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
        if (NIL != new_root_tactician.new_root_strategy_p(substrategy)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject split_link;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                split_link = do_set_contents_next(basis_object, state);
                if ((NIL != do_set_contents_element_validP(state, split_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $SPLIT))) {
                    balancing_tactician.balancing_tactician_possibly_propagate_new_root_motivation_down_split_link(strategy, split_link);
                }
            }
            set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject union_link;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                union_link = do_set_contents_next(basis_object, state);
                if ((NIL != do_set_contents_element_validP(state, union_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, $UNION))) {
                    balancing_tactician.balancing_tactician_possibly_propagate_new_root_motivation_down_union_link(strategy, union_link);
                }
            }
            set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject link;
            SubLObject link_var;
            SubLObject set_contents_var_$6;
            SubLObject basis_object_$7;
            SubLObject state_$8;
            SubLObject restriction_link;
            SubLObject restricted_non_focal_problem;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                link = do_set_contents_next(basis_object, state);
                if (((NIL != do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $JOIN_ORDERED))) && (NIL != balancing_tactician.balancing_tactician_early_removal_linkP(strategy, link))) {
                    link_var = link;
                    set_contents_var_$6 = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                    for (basis_object_$7 = do_set_contents_basis_object(set_contents_var_$6), state_$8 = NIL, state_$8 = do_set_contents_initial_state(basis_object_$7, set_contents_var_$6); NIL == do_set_contents_doneP(basis_object_$7, state_$8); state_$8 = do_set_contents_update_state(state_$8)) {
                        restriction_link = do_set_contents_next(basis_object_$7, state_$8);
                        if (((NIL != do_set_contents_element_validP(state_$8, restriction_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION))) && (NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var))) {
                            restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                            balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, restricted_non_focal_problem);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balancing_tactician_substrategy_link_motivated_alt(SubLObject strategy, SubLObject substrategy, SubLObject link) {
        SubLTrampolineFile.checkType(substrategy, TRANSFORMATION_STRATEGY_P);
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        if (NIL != inference_worker_transformation.transformation_link_p(link)) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_chooses_to_make_d_a_new_rootP(strategy, link)) {
                {
                    SubLObject residual_problem = inference_worker_transformation.transformation_link_supporting_problem(link);
                    return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, residual_problem);
                }
            } else {
                {
                    SubLObject count = ZERO_INTEGER;
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_transformation_new_root_candidates(strategy, link);
                    SubLObject new_root = NIL;
                    for (new_root = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_root = cdolist_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, new_root)) {
                            count = add(count, ONE_INTEGER);
                        }
                    }
                    return count;
                }
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_substrategy_link_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject link) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : "! transformation_tactician_datastructures.transformation_strategy_p(substrategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(substrategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) ") + substrategy;
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        if (NIL != inference_worker_transformation.transformation_link_p(link)) {
            if (NIL == balancing_tactician.balancing_tactician_chooses_to_make_d_a_new_rootP(strategy, link)) {
                SubLObject count = ZERO_INTEGER;
                SubLObject cdolist_list_var = balancing_tactician.balancing_tactician_transformation_new_root_candidates(strategy, link);
                SubLObject new_root = NIL;
                new_root = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, new_root)) {
                        count = add(count, ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    new_root = cdolist_list_var.first();
                } 
                return count;
            }
            if (NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_rP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link))) {
                final SubLObject residual_problem = inference_worker_transformation.transformation_link_supporting_problem(link);
                return balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, residual_problem);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY chooses that 'D', rather than '(^ A D), should
    be a new root.  'D' is the supporting transformed problem of T-LINK, and '(^ A D) is
    a residual conjunction problem of some residual transformation argument link of D.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY chooses that \'D\', rather than \'(^ A D), should\r\nbe a new root.  \'D\' is the supporting transformed problem of T-LINK, and \'(^ A D) is\r\na residual conjunction problem of some residual transformation argument link of D.")
    public static final SubLObject balancing_tactician_chooses_to_make_d_a_new_rootP_alt(SubLObject strategy, SubLObject t_link) {
        return sublisp_null(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_residual_conjunction_new_root_candidates(strategy, t_link));
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY chooses that 'D', rather than '(^ A D), should
    be a new root.  'D' is the supporting transformed problem of T-LINK, and '(^ A D) is
    a residual conjunction problem of some residual transformation argument link of D.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY chooses that \'D\', rather than \'(^ A D), should\r\nbe a new root.  \'D\' is the supporting transformed problem of T-LINK, and \'(^ A D) is\r\na residual conjunction problem of some residual transformation argument link of D.")
    public static SubLObject balancing_tactician_chooses_to_make_d_a_new_rootP(final SubLObject strategy, final SubLObject t_link) {
        return sublisp_null(balancing_tactician.balancing_tactician_residual_conjunction_new_root_candidates(strategy, t_link));
    }

    public static final SubLObject balancing_tactician_residual_conjunction_new_root_candidates_alt(SubLObject strategy, SubLObject t_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject t_strategy = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_transformation_substrategy(strategy);
                SubLObject new_roots = NIL;
                if ((NIL == $balancing_tactician_self_looping_rule_fix_enabledP$.getDynamicValue(thread)) || (NIL == assertion_utilities.self_expanding_ruleP(inference_worker_transformation.transformation_link_rule_assertion(t_link)))) {
                    {
                        SubLObject t_link_var = t_link;
                        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link_var);
                        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject jo_link_var = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, jo_link_var)) {
                                    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED)) {
                                        {
                                            SubLObject jo_link_var_9 = jo_link_var;
                                            SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_9);
                                            SubLObject set_contents_var_10 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                                            SubLObject basis_object_11 = set_contents.do_set_contents_basis_object(set_contents_var_10);
                                            SubLObject state_12 = NIL;
                                            for (state_12 = set_contents.do_set_contents_initial_state(basis_object_11, set_contents_var_10); NIL == set_contents.do_set_contents_doneP(basis_object_11, state_12); state_12 = set_contents.do_set_contents_update_state(state_12)) {
                                                {
                                                    SubLObject rt_link = set_contents.do_set_contents_next(basis_object_11, state_12);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state_12, rt_link)) {
                                                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)) {
                                                            if (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_9)) {
                                                                if (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link_var)) {
                                                                    {
                                                                        SubLObject candidate_new_root = inference_worker_residual_transformation.residual_transformation_link_supporting_problem(rt_link);
                                                                        if ((NIL != inference_datastructures_problem.problem_relevant_to_strategyP(candidate_new_root, t_strategy)) || (NIL != inference_datastructures_strategy.problem_motivatedP(candidate_new_root, t_strategy))) {
                                                                            {
                                                                                SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
                                                                                SubLObject jo_tactic = inference_worker_join_ordered.join_ordered_link_tactic(jo_link);
                                                                                if ((NIL == $balancing_tactician_new_roots_check_for_t_on_jo_linkP$.getDynamicValue(thread)) || (NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, jo_tactic))) {
                                                                                    new_roots = cons(candidate_new_root, new_roots);
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
                return nreverse(new_roots);
            }
        }
    }

    public static SubLObject balancing_tactician_residual_conjunction_new_root_candidates(final SubLObject strategy, final SubLObject t_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject t_strategy = balancing_tactician.balancing_tactician_transformation_substrategy(strategy);
        SubLObject new_roots = NIL;
        if ((NIL == balancing_tactician.$balancing_tactician_self_looping_rule_fix_enabledP$.getDynamicValue(thread)) || (NIL == self_expanding_ruleP(inference_worker_transformation.transformation_link_rule_assertion(t_link)))) {
            final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject jo_link_var;
            SubLObject jo_link_var_$9;
            SubLObject motivating_conjunction_problem;
            SubLObject set_contents_var_$10;
            SubLObject basis_object_$11;
            SubLObject state_$12;
            SubLObject rt_link;
            SubLObject candidate_new_root;
            SubLObject jo_link;
            SubLObject jo_tactic;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                jo_link_var = do_set_contents_next(basis_object, state);
                if ((NIL != do_set_contents_element_validP(state, jo_link_var)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED))) {
                    jo_link_var_$9 = jo_link_var;
                    motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$9);
                    set_contents_var_$10 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                    for (basis_object_$11 = do_set_contents_basis_object(set_contents_var_$10), state_$12 = NIL, state_$12 = do_set_contents_initial_state(basis_object_$11, set_contents_var_$10); NIL == do_set_contents_doneP(basis_object_$11, state_$12); state_$12 = do_set_contents_update_state(state_$12)) {
                        rt_link = do_set_contents_next(basis_object_$11, state_$12);
                        if ((((NIL != do_set_contents_element_validP(state_$12, rt_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION))) && (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$9))) && (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link))) {
                            candidate_new_root = inference_worker_residual_transformation.residual_transformation_link_supporting_problem(rt_link);
                            if ((NIL != inference_datastructures_problem.problem_relevant_to_strategyP(candidate_new_root, t_strategy)) || (NIL != inference_datastructures_strategy.problem_motivatedP(candidate_new_root, t_strategy))) {
                                jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
                                jo_tactic = inference_worker_join_ordered.join_ordered_link_tactic(jo_link);
                                if ((NIL == balancing_tactician.$balancing_tactician_new_roots_check_for_t_on_jo_linkP$.getDynamicValue(thread)) || (NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, jo_tactic))) {
                                    new_roots = cons(candidate_new_root, new_roots);
                                }
                            }
                        }
                    }
                }
            }
        }
        return nreverse(new_roots);
    }

    public static final SubLObject balancing_tactician_transformation_new_root_candidates_alt(SubLObject strategy, SubLObject t_link) {
        if (NIL != inference_tactician.transformation_link_leads_to_term_chosen_dead_endP(t_link)) {
            return inference_tactician.all_restricted_non_focals_around_transformation_link(t_link);
        } else {
            return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_residual_conjunction_new_root_candidates(strategy, t_link);
        }
    }

    public static SubLObject balancing_tactician_transformation_new_root_candidates(final SubLObject strategy, final SubLObject t_link) {
        if (NIL != inference_tactician.transformation_link_leads_to_term_chosen_dead_endP(t_link)) {
            return inference_tactician.all_restricted_non_focals_around_transformation_link(t_link);
        }
        return balancing_tactician.balancing_tactician_residual_conjunction_new_root_candidates(strategy, t_link);
    }

    public static final SubLObject balancing_tactician_possibly_make_new_root_alt(SubLObject strategy, SubLObject problem) {
        return inference_tactician.substrategy_motivate_strategem(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_new_root_substrategy(strategy), problem);
    }

    public static SubLObject balancing_tactician_possibly_make_new_root(final SubLObject strategy, final SubLObject problem) {
        return inference_tactician.substrategy_motivate_strategem(balancing_tactician.balancing_tactician_new_root_substrategy(strategy), problem);
    }

    public static final SubLObject balancing_tactician_substrategy_tactic_motivated_alt(SubLObject strategy, SubLObject substrategy, SubLObject tactic) {
        if (NIL != inference_worker.connected_conjunction_tactic_p(tactic)) {
            return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_substrategy_connected_conjunction_tactic_motivated(strategy, substrategy, tactic);
        } else {
            if (NIL != inference_worker_split.split_tactic_p(tactic)) {
                return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_substrategy_split_tactic_motivated(strategy, substrategy, tactic);
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_substrategy_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject tactic) {
        if (NIL != inference_worker.connected_conjunction_tactic_p(tactic)) {
            return balancing_tactician.balancing_tactician_substrategy_connected_conjunction_tactic_motivated(strategy, substrategy, tactic);
        }
        if (NIL != inference_worker_split.split_tactic_p(tactic)) {
            return balancing_tactician.balancing_tactician_substrategy_split_tactic_motivated(strategy, substrategy, tactic);
        }
        return NIL;
    }

    public static final SubLObject balancing_tactician_substrategy_connected_conjunction_tactic_motivated_alt(SubLObject strategy, SubLObject substrategy, SubLObject cc_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(substrategy, TRANSFORMATION_STRATEGY_P);
            SubLTrampolineFile.checkType(cc_tactic, CONNECTED_CONJUNCTION_TACTIC_P);
            if (NIL != $balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$.getDynamicValue(thread)) {
                {
                    SubLObject link = inference_worker.connected_conjunction_tactic_link(cc_tactic);
                    if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                        {
                            SubLObject jo_link_var = link;
                            SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var);
                            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject rt_link = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, rt_link)) {
                                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)) {
                                            if (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var)) {
                                                com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link(strategy, rt_link);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject balancing_tactician_substrategy_connected_conjunction_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject cc_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : "! transformation_tactician_datastructures.transformation_strategy_p(substrategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(substrategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) ") + substrategy;
        assert NIL != inference_worker.connected_conjunction_tactic_p(cc_tactic) : "! inference_worker.connected_conjunction_tactic_p(cc_tactic) " + ("inference_worker.connected_conjunction_tactic_p(cc_tactic) " + "CommonSymbols.NIL != inference_worker.connected_conjunction_tactic_p(cc_tactic) ") + cc_tactic;
        if (NIL != balancing_tactician.$balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$.getDynamicValue(thread)) {
            final SubLObject link = inference_worker.connected_conjunction_tactic_link(cc_tactic);
            if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                final SubLObject jo_link_var = link;
                final SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var);
                final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject rt_link;
                for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                    rt_link = do_set_contents_next(basis_object, state);
                    if (((NIL != do_set_contents_element_validP(state, rt_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION))) && (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var))) {
                        balancing_tactician.balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link(strategy, rt_link);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * When a new RT link is created, we need to check if we're already motivated to make a new root.
     * This can happen when the transformation link already exists and has T,
     * and a join-ordered link has just been opened, providing the impetus for RT-LINK's creation.
     */
    @LispMethod(comment = "When a new RT link is created, we need to check if we\'re already motivated to make a new root.\r\nThis can happen when the transformation link already exists and has T,\r\nand a join-ordered link has just been opened, providing the impetus for RT-LINK\'s creation.\nWhen a new RT link is created, we need to check if we\'re already motivated to make a new root.\nThis can happen when the transformation link already exists and has T,\nand a join-ordered link has just been opened, providing the impetus for RT-LINK\'s creation.")
    public static final SubLObject balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link_alt(SubLObject strategy, SubLObject rt_link) {
        {
            SubLObject t_strategy = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_transformation_substrategy(strategy);
            SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
            if (NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, t_link)) {
                return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_substrategy_link_motivated(strategy, t_strategy, t_link);
            }
        }
        return NIL;
    }

    /**
     * When a new RT link is created, we need to check if we're already motivated to make a new root.
     * This can happen when the transformation link already exists and has T,
     * and a join-ordered link has just been opened, providing the impetus for RT-LINK's creation.
     */
    @LispMethod(comment = "When a new RT link is created, we need to check if we\'re already motivated to make a new root.\r\nThis can happen when the transformation link already exists and has T,\r\nand a join-ordered link has just been opened, providing the impetus for RT-LINK\'s creation.\nWhen a new RT link is created, we need to check if we\'re already motivated to make a new root.\nThis can happen when the transformation link already exists and has T,\nand a join-ordered link has just been opened, providing the impetus for RT-LINK\'s creation.")
    public static SubLObject balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link(final SubLObject strategy, final SubLObject rt_link) {
        final SubLObject t_strategy = balancing_tactician.balancing_tactician_transformation_substrategy(strategy);
        final SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
        if (NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, t_link)) {
            return balancing_tactician.balancing_tactician_substrategy_link_motivated(strategy, t_strategy, t_link);
        }
        return NIL;
    }

    public static final SubLObject balancing_tactician_substrategy_split_tactic_motivated_alt(SubLObject strategy, SubLObject substrategy, SubLObject split_tactic) {
        SubLTrampolineFile.checkType(substrategy, TRANSFORMATION_STRATEGY_P);
        SubLTrampolineFile.checkType(split_tactic, SPLIT_TACTIC_P);
        com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_propagate_new_root_motivation_down_split_link(strategy, inference_worker_split.split_tactic_link(split_tactic));
        {
            SubLObject r_strategy = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_problem_motivated_wrt_rP(strategy, inference_datastructures_tactic.tactic_problem(split_tactic))) {
                return inference_tactician.substrategy_reconsider_split_set_asides(r_strategy, split_tactic);
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_substrategy_split_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject split_tactic) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : "! transformation_tactician_datastructures.transformation_strategy_p(substrategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(substrategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) ") + substrategy;
        assert NIL != inference_worker_split.split_tactic_p(split_tactic) : "! inference_worker_split.split_tactic_p(split_tactic) " + ("inference_worker_split.split_tactic_p(split_tactic) " + "CommonSymbols.NIL != inference_worker_split.split_tactic_p(split_tactic) ") + split_tactic;
        balancing_tactician.balancing_tactician_possibly_propagate_new_root_motivation_down_split_link(strategy, inference_worker_split.split_tactic_link(split_tactic));
        final SubLObject r_strategy = balancing_tactician.balancing_tactician_sole_removal_substrategy(strategy);
        if (NIL != inference_datastructures_strategy.problem_motivatedP(inference_datastructures_tactic.tactic_problem(split_tactic), r_strategy)) {
            return inference_tactician.substrategy_reconsider_split_set_asides(r_strategy, split_tactic);
        }
        return NIL;
    }

    /**
     * When SPLIT-LINK's supported problem has N, then for each of SPLIT-LINK's supporting problems that has T,
     * N will propagate down to that supporting problem.
     * The link doesn't necessarily need to be open.
     * This is a generalization of 'transformation', in the sense that transformation means
     * 'try to find new roots'.  In this case, it's creating new new roots by propagating down split links
     * instead of by transformation.
     */
    @LispMethod(comment = "When SPLIT-LINK\'s supported problem has N, then for each of SPLIT-LINK\'s supporting problems that has T,\r\nN will propagate down to that supporting problem.\r\nThe link doesn\'t necessarily need to be open.\r\nThis is a generalization of \'transformation\', in the sense that transformation means\r\n\'try to find new roots\'.  In this case, it\'s creating new new roots by propagating down split links\r\ninstead of by transformation.\nWhen SPLIT-LINK\'s supported problem has N, then for each of SPLIT-LINK\'s supporting problems that has T,\nN will propagate down to that supporting problem.\nThe link doesn\'t necessarily need to be open.\nThis is a generalization of \'transformation\', in the sense that transformation means\n\'try to find new roots\'.  In this case, it\'s creating new new roots by propagating down split links\ninstead of by transformation.")
    public static final SubLObject balancing_tactician_possibly_propagate_new_root_motivation_down_split_link_alt(SubLObject strategy, SubLObject split_link) {
        {
            SubLObject count = ZERO_INTEGER;
            if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(split_link))) {
                {
                    SubLObject link_var = split_link;
                    SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    SubLObject supporting_mapped_problem = NIL;
                    for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            {
                                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_problem_motivated_wrt_tP(strategy, supporting_problem)) {
                                    if (NIL != inference_tactician.substrategy_motivate_strategem(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_new_root_substrategy(strategy), supporting_problem)) {
                                        count = add(count, ONE_INTEGER);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return count;
        }
    }

    /**
     * When SPLIT-LINK's supported problem has N, then for each of SPLIT-LINK's supporting problems that has T,
     * N will propagate down to that supporting problem.
     * The link doesn't necessarily need to be open.
     * This is a generalization of 'transformation', in the sense that transformation means
     * 'try to find new roots'.  In this case, it's creating new new roots by propagating down split links
     * instead of by transformation.
     */
    @LispMethod(comment = "When SPLIT-LINK\'s supported problem has N, then for each of SPLIT-LINK\'s supporting problems that has T,\r\nN will propagate down to that supporting problem.\r\nThe link doesn\'t necessarily need to be open.\r\nThis is a generalization of \'transformation\', in the sense that transformation means\r\n\'try to find new roots\'.  In this case, it\'s creating new new roots by propagating down split links\r\ninstead of by transformation.\nWhen SPLIT-LINK\'s supported problem has N, then for each of SPLIT-LINK\'s supporting problems that has T,\nN will propagate down to that supporting problem.\nThe link doesn\'t necessarily need to be open.\nThis is a generalization of \'transformation\', in the sense that transformation means\n\'try to find new roots\'.  In this case, it\'s creating new new roots by propagating down split links\ninstead of by transformation.")
    public static SubLObject balancing_tactician_possibly_propagate_new_root_motivation_down_split_link(final SubLObject strategy, final SubLObject split_link) {
        SubLObject count = ZERO_INTEGER;
        if (NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(split_link))) {
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, supporting_mapped_problem)) {
                    final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    if ((NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_tP(strategy, supporting_problem)) && (NIL != inference_tactician.substrategy_motivate_strategem(balancing_tactician.balancing_tactician_new_root_substrategy(strategy), supporting_problem))) {
                        count = add(count, ONE_INTEGER);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            } 
        }
        return count;
    }

    public static final SubLObject balancing_tactician_substrategy_union_tactic_motivated_alt(SubLObject strategy, SubLObject substrategy, SubLObject union_tactic) {
        if (NIL != transformation_strategy_p(substrategy)) {
            return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_propagate_new_root_motivation_down_union_link(strategy, inference_worker_union.union_tactic_link(union_tactic));
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_substrategy_union_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject union_tactic) {
        if (NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy)) {
            return balancing_tactician.balancing_tactician_possibly_propagate_new_root_motivation_down_union_link(strategy, inference_worker_union.union_tactic_link(union_tactic));
        }
        return NIL;
    }

    /**
     * When UNION-LINK's supported problem has N and UNION-LINK's supporting problem has T,
     * N will propagate down to the supporting problem.  The link doesn't necessarily need to be open.
     * This is a generalization of 'transformation', in the sense that transformation means
     * 'try to find new roots'.  In this case, each disjunct counts as a new root since it is independent
     * and solving it will yield a solution of the original problem.
     */
    @LispMethod(comment = "When UNION-LINK\'s supported problem has N and UNION-LINK\'s supporting problem has T,\r\nN will propagate down to the supporting problem.  The link doesn\'t necessarily need to be open.\r\nThis is a generalization of \'transformation\', in the sense that transformation means\r\n\'try to find new roots\'.  In this case, each disjunct counts as a new root since it is independent\r\nand solving it will yield a solution of the original problem.\nWhen UNION-LINK\'s supported problem has N and UNION-LINK\'s supporting problem has T,\nN will propagate down to the supporting problem.  The link doesn\'t necessarily need to be open.\nThis is a generalization of \'transformation\', in the sense that transformation means\n\'try to find new roots\'.  In this case, each disjunct counts as a new root since it is independent\nand solving it will yield a solution of the original problem.")
    public static final SubLObject balancing_tactician_possibly_propagate_new_root_motivation_down_union_link_alt(SubLObject strategy, SubLObject union_link) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(union_link))) {
            {
                SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(union_link);
                if (NIL != com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_problem_motivated_wrt_tP(strategy, supporting_problem)) {
                    return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, supporting_problem);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "When UNION-LINK\'s supported problem has N and UNION-LINK\'s supporting problem has T,\r\nN will propagate down to the supporting problem.  The link doesn\'t necessarily need to be open.\r\nThis is a generalization of \'transformation\', in the sense that transformation means\r\n\'try to find new roots\'.  In this case, each disjunct counts as a new root since it is independent\r\nand solving it will yield a solution of the original problem.\nWhen UNION-LINK\'s supported problem has N and UNION-LINK\'s supporting problem has T,\nN will propagate down to the supporting problem.  The link doesn\'t necessarily need to be open.\nThis is a generalization of \'transformation\', in the sense that transformation means\n\'try to find new roots\'.  In this case, each disjunct counts as a new root since it is independent\nand solving it will yield a solution of the original problem.")
    public static SubLObject balancing_tactician_possibly_propagate_new_root_motivation_down_union_link(final SubLObject strategy, final SubLObject union_link) {
        if (NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(union_link))) {
            final SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(union_link);
            if (NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_tP(strategy, supporting_problem)) {
                return balancing_tactician.balancing_tactician_possibly_make_new_root(strategy, supporting_problem);
            }
        }
        return NIL;
    }

    public static final SubLObject balancing_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP_alt(SubLObject strategy, SubLObject substrategy, SubLObject split_tactic) {
        SubLTrampolineFile.checkType(substrategy, REMOVAL_STRATEGY_P);
        return makeBoolean(NIL == inference_tactician.substrategy_link_head_motivatedP(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_transformation_substrategy(strategy), split_tactic));
    }

    public static SubLObject balancing_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP(final SubLObject strategy, final SubLObject substrategy, final SubLObject split_tactic) {
        assert NIL != removal_tactician.removal_strategy_p(substrategy) : "! removal_tactician.removal_strategy_p(substrategy) " + ("removal_tactician.removal_strategy_p(substrategy) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(substrategy) ") + substrategy;
        return makeBoolean(NIL == inference_tactician.substrategy_link_head_motivatedP(balancing_tactician.balancing_tactician_transformation_substrategy(strategy), split_tactic));
    }

    public static final SubLObject balancing_tactician_chooses_to_totally_throw_away_tacticP_alt(SubLObject strategy, SubLObject substrategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        return com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP);
    }

    public static SubLObject balancing_tactician_chooses_to_totally_throw_away_tacticP(final SubLObject strategy, final SubLObject substrategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        return balancing_tactician.balancing_tactician_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP);
    }

    public static final SubLObject balancing_tactician_substrategy_problem_status_change_alt(SubLObject strategy, SubLObject substrategy, SubLObject problem, SubLObject old_status, SubLObject new_status) {
        com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_recompute_problem_status(strategy, problem);
        if ((NIL != removal_strategy_p(substrategy)) && (NIL != problem_has_executed_a_complete_removal_tacticP(problem, substrategy))) {
            if ((NIL == inference_datastructures_enumerated_types.no_good_problem_status_p(old_status)) && (NIL != inference_datastructures_enumerated_types.no_good_problem_status_p(new_status))) {
                com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_make_problem_no_good(strategy, problem);
                return $COMPLETE_REMOVAL_TACTIC_NO_GOOD;
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_substrategy_problem_status_change(final SubLObject strategy, final SubLObject substrategy, final SubLObject problem, final SubLObject old_status, final SubLObject new_status) {
        balancing_tactician.balancing_tactician_recompute_problem_status(strategy, problem);
        if ((((NIL != removal_tactician.removal_strategy_p(substrategy)) && (NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, substrategy))) && (NIL == inference_datastructures_enumerated_types.no_good_problem_status_p(old_status))) && (NIL != inference_datastructures_enumerated_types.no_good_problem_status_p(new_status))) {
            balancing_tactician.balancing_tactician_make_problem_no_good(strategy, problem);
            return balancing_tactician.$COMPLETE_REMOVAL_TACTIC_NO_GOOD;
        }
        return NIL;
    }

    public static final SubLObject balancing_tactician_recompute_problem_status_alt(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject weakest_strategic_status = $FINISHED;
                SubLObject most_sensible_provability_status = $NO_GOOD;
                SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
                SubLObject substrategy = NIL;
                for (substrategy = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , substrategy = csome_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_spineless_substrategy_p(substrategy)) {
                        {
                            SubLObject strategic_status = inference_datastructures_strategy.problem_strategic_status(problem, substrategy);
                            if (NIL != inference_datastructures_enumerated_types.tactical_status_weakerP(strategic_status, weakest_strategic_status)) {
                                weakest_strategic_status = strategic_status;
                            }
                        }
                        {
                            SubLObject provability_status = inference_datastructures_strategy.problem_provability_status(problem, substrategy);
                            SubLObject pcase_var = provability_status;
                            if (pcase_var.eql($NO_GOOD)) {
                            } else {
                                if (pcase_var.eql($GOOD)) {
                                    most_sensible_provability_status = $GOOD;
                                } else {
                                    if (pcase_var.eql($NEUTRAL)) {
                                        most_sensible_provability_status = $NEUTRAL;
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject status = inference_datastructures_enumerated_types.problem_status_from_tactical_status_and_provability_status(weakest_strategic_status, most_sensible_provability_status);
                    inference_datastructures_strategy.set_problem_raw_strategic_status(problem, strategy, status);
                    if (NIL != $balancing_tactician_is_tactically_hardcoreP$.getDynamicValue(thread)) {
                        if ((NIL != inference_tactician.strategy_controls_problem_storeP(strategy)) && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))) {
                            com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_possibly_propagate_strategic_status_to_tactical_status(problem, most_sensible_provability_status, weakest_strategic_status);
                        }
                    }
                    return status;
                }
            }
        }
    }

    public static SubLObject balancing_tactician_recompute_problem_status(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject weakest_strategic_status = $FINISHED;
        SubLObject most_sensible_provability_status = $NO_GOOD;
        SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL == balancing_tactician.balancing_tactician_spineless_substrategy_p(substrategy)) {
                final SubLObject strategic_status = inference_datastructures_strategy.problem_strategic_status(problem, substrategy);
                if (NIL != inference_datastructures_enumerated_types.tactical_status_unionP(strategic_status, weakest_strategic_status)) {
                    weakest_strategic_status = strategic_status;
                }
                final SubLObject pcase_var;
                final SubLObject provability_status = pcase_var = inference_datastructures_strategy.problem_provability_status(problem, substrategy);
                if (!pcase_var.eql($NO_GOOD)) {
                    if (pcase_var.eql($GOOD)) {
                        most_sensible_provability_status = $NEUTRAL;
                    } else
                        if (pcase_var.eql($NEUTRAL)) {
                            most_sensible_provability_status = $NEUTRAL;
                        }

                }
            }
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        } 
        if (($POSSIBLE == weakest_strategic_status) && ($NO_GOOD == most_sensible_provability_status)) {
            weakest_strategic_status = $PENDING;
        }
        final SubLObject status = inference_datastructures_enumerated_types.problem_status_from_tactical_status_and_provability_status(weakest_strategic_status, most_sensible_provability_status);
        inference_datastructures_strategy.set_problem_raw_strategic_status(problem, strategy, status);
        if ((((NIL != balancing_tactician.$balancing_tactician_is_tactically_hardcoreP$.getDynamicValue(thread)) && (NIL != inference_tactician.strategy_controls_problem_storeP(strategy))) && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))) && (NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy))) {
            balancing_tactician.balancing_tactician_possibly_propagate_strategic_status_to_tactical_status(problem, most_sensible_provability_status, weakest_strategic_status);
        }
        return status;
    }

    public static final SubLObject balancing_tactician_possibly_propagate_strategic_status_to_tactical_status_alt(SubLObject problem, SubLObject most_sensible_provability_status, SubLObject weakest_strategic_status) {
        if ($NO_GOOD == most_sensible_provability_status) {
            inference_worker.make_problem_no_good(problem, NIL, $TACTICAL);
        }
        if ($PENDING == weakest_strategic_status) {
            inference_worker.discard_all_possible_tactics(problem);
            inference_worker.possibly_note_problem_pending(problem, $TACTICAL);
        }
        if ($FINISHED == weakest_strategic_status) {
            inference_worker.possibly_note_problem_finished(problem, $TACTICAL);
        }
        return problem;
    }

    public static SubLObject balancing_tactician_possibly_propagate_strategic_status_to_tactical_status(final SubLObject problem, final SubLObject most_sensible_provability_status, final SubLObject weakest_strategic_status) {
        if ($NO_GOOD == most_sensible_provability_status) {
            inference_worker.make_problem_no_good(problem, NIL, $TACTICAL);
        }
        if ($PENDING == weakest_strategic_status) {
            inference_worker.discard_all_possible_tactics(problem);
            inference_worker.possibly_note_problem_pending(problem, $TACTICAL);
        }
        if ($FINISHED == weakest_strategic_status) {
            inference_worker.possibly_note_problem_finished(problem, $TACTICAL);
        }
        return problem;
    }

    public static final SubLObject balancing_tactician_make_problem_no_good_alt(SubLObject strategy, SubLObject problem) {
        inference_worker.make_problem_no_good(problem, NIL, strategy);
        {
            SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = NIL;
            for (sub_strategy = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , sub_strategy = csome_list_var.first()) {
                inference_worker.make_problem_no_good(problem, NIL, sub_strategy);
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_make_problem_no_good(final SubLObject strategy, final SubLObject problem) {
        inference_worker.make_problem_no_good(problem, NIL, strategy);
        SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
        SubLObject sub_strategy = NIL;
        sub_strategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            inference_worker.make_problem_no_good(problem, NIL, sub_strategy);
            csome_list_var = csome_list_var.rest();
            sub_strategy = csome_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject balancing_tactician_make_problem_pending_alt(SubLObject strategy, SubLObject problem) {
        {
            SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = NIL;
            for (sub_strategy = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , sub_strategy = csome_list_var.first()) {
                inference_worker.possibly_note_problem_pending(problem, sub_strategy);
            }
        }
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $CONNECTED_CONJUNCTION)) {
                            com.cyc.cycjava.cycl.inference.harness.balancing_tactician.balancing_tactician_make_problem_pending(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject balancing_tactician_make_problem_pending(final SubLObject strategy, final SubLObject problem) {
        SubLObject csome_list_var = balancing_tactician.balancing_tactician_all_substrategies(strategy);
        SubLObject sub_strategy = NIL;
        sub_strategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            inference_worker.possibly_note_problem_pending(problem, sub_strategy);
            csome_list_var = csome_list_var.rest();
            sub_strategy = csome_list_var.first();
        } 
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            link = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $CONNECTED_CONJUNCTION))) {
                balancing_tactician.balancing_tactician_make_problem_pending(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link));
            }
        }
        return NIL;
    }

    public static final SubLObject declare_balancing_tactician_file_alt() {
        declareFunction("balancing_tactician_data_print_function_trampoline", "BALANCING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("balancing_tactician_data_p", "BALANCING-TACTICIAN-DATA-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.balancing_tactician.$balancing_tactician_data_p$UnaryFunction();
        declareFunction("bal_tac_data_new_root_substrategy", "BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
        declareFunction("bal_tac_data_transformation_substrategy", "BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
        declareFunction("bal_tac_data_removal_substrategies", "BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 1, 0, false);
        declareFunction("_csetf_bal_tac_data_new_root_substrategy", "_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 2, 0, false);
        declareFunction("_csetf_bal_tac_data_transformation_substrategy", "_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 2, 0, false);
        declareFunction("_csetf_bal_tac_data_removal_substrategies", "_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 2, 0, false);
        declareFunction("make_balancing_tactician_data", "MAKE-BALANCING-TACTICIAN-DATA", 0, 1, false);
        declareFunction("balancing_tactician_p", "BALANCING-TACTICIAN-P", 1, 0, false);
        declareMacro("do_balancing_tactician_substrategies", "DO-BALANCING-TACTICIAN-SUBSTRATEGIES");
        declareMacro("do_balancing_tactician_spineful_substrategies", "DO-BALANCING-TACTICIAN-SPINEFUL-SUBSTRATEGIES");
        declareFunction("new_balancing_tactician_data", "NEW-BALANCING-TACTICIAN-DATA", 3, 0, false);
        declareFunction("balancing_tactician_initialize", "BALANCING-TACTICIAN-INITIALIZE", 1, 0, false);
        declareFunction("new_balancing_tactician_data_from_inference", "NEW-BALANCING-TACTICIAN-DATA-FROM-INFERENCE", 1, 0, false);
        declareFunction("balancing_tactician_new_root_substrategy", "BALANCING-TACTICIAN-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
        declareFunction("balancing_tactician_transformation_substrategy", "BALANCING-TACTICIAN-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
        declareFunction("balancing_tactician_removal_substrategies", "BALANCING-TACTICIAN-REMOVAL-SUBSTRATEGIES", 1, 0, false);
        declareFunction("balancing_tactician_sole_removal_substrategy", "BALANCING-TACTICIAN-SOLE-REMOVAL-SUBSTRATEGY", 1, 0, false);
        declareFunction("balancing_tactician_all_substrategies", "BALANCING-TACTICIAN-ALL-SUBSTRATEGIES", 1, 0, false);
        declareFunction("balancing_tactician_problem_motivated_wrt_nP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-N?", 2, 0, false);
        declareFunction("balancing_tactician_problem_motivated_wrt_rP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-R?", 2, 0, false);
        declareFunction("balancing_tactician_problem_motivated_wrt_tP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-T?", 2, 0, false);
        declareFunction("balancing_tactician_link_head_motivated_wrt_rP", "BALANCING-TACTICIAN-LINK-HEAD-MOTIVATED-WRT-R?", 2, 0, false);
        declareFunction("balancing_tactician_substrategy_p", "BALANCING-TACTICIAN-SUBSTRATEGY-P", 1, 0, false);
        declareFunction("balancing_tactician_proper_substrategy_p", "BALANCING-TACTICIAN-PROPER-SUBSTRATEGY-P", 1, 0, false);
        declareFunction("balancing_tactician_spineless_substrategy_p", "BALANCING-TACTICIAN-SPINELESS-SUBSTRATEGY-P", 1, 0, false);
        declareFunction("balancing_tactician_doneP", "BALANCING-TACTICIAN-DONE?", 1, 0, false);
        declareFunction("balancing_tactician_do_one_step", "BALANCING-TACTICIAN-DO-ONE-STEP", 1, 0, false);
        declareFunction("balancing_tactician_do_one_step_int", "BALANCING-TACTICIAN-DO-ONE-STEP-INT", 1, 0, false);
        declareFunction("balancing_tactician_should_reconsider_set_asidesP", "BALANCING-TACTICIAN-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
        declareFunction("balancing_tactician_reconsider_set_asides", "BALANCING-TACTICIAN-RECONSIDER-SET-ASIDES", 1, 0, false);
        declareFunction("substrategy_do_one_step_interestingness", "SUBSTRATEGY-DO-ONE-STEP-INTERESTINGNESS", 1, 0, false);
        declareFunction("balancing_tactician_continuation_possibleP", "BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?", 1, 0, false);
        declareFunction("balancing_tactician_chooses_to_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false);
        declareFunction("balancing_tactician_chooses_to_set_aside_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false);
        declareFunction("balancing_tactician_throw_away_uninteresting_set_asides", "BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
        declareFunction("balancing_tactician_note_inference_dynamic_properties_updated", "BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
        declareFunction("balancing_tactician_initialize_properties", "BALANCING-TACTICIAN-INITIALIZE-PROPERTIES", 2, 0, false);
        declareFunction("balancing_tactician_update_properties", "BALANCING-TACTICIAN-UPDATE-PROPERTIES", 2, 0, false);
        declareFunction("balancing_tactician_initial_relevant_strategies", "BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction("balancing_tactician_possibly_activate_problem", "BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("balancing_tactician_problem_is_the_rest_of_an_early_removalP", "BALANCING-TACTICIAN-PROBLEM-IS-THE-REST-OF-AN-EARLY-REMOVAL?", 2, 0, false);
        declareFunction("balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-PROPAGATE-NEW-ROOT-MOTIVATION-TO-RESTRICTED-NON-FOCAL-PROBLEM?", 3, 0, false);
        declareFunction("balancing_tactician_treats_restricted_non_focal_as_new_rootP", "BALANCING-TACTICIAN-TREATS-RESTRICTED-NON-FOCAL-AS-NEW-ROOT?", 2, 0, false);
        declareFunction("balancing_tactician_early_removal_linkP", "BALANCING-TACTICIAN-EARLY-REMOVAL-LINK?", 2, 0, false);
        declareFunction("substrategy_connected_conjunction_link_motivatedP", "SUBSTRATEGY-CONNECTED-CONJUNCTION-LINK-MOTIVATED?", 2, 0, false);
        declareFunction("balancing_tactician_problem_is_the_result_of_a_simplificationP", "BALANCING-TACTICIAN-PROBLEM-IS-THE-RESULT-OF-A-SIMPLIFICATION?", 2, 0, false);
        declareFunction("balancing_tactician_note_argument_link", "BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK", 2, 0, false);
        declareFunction("balancing_tactician_early_removal_productivity_limit", "BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction("balancing_tactician_substrategy_strategem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_substrategy_problem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_substrategy_link_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-LINK-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_chooses_to_make_d_a_new_rootP", "BALANCING-TACTICIAN-CHOOSES-TO-MAKE-D-A-NEW-ROOT?", 2, 0, false);
        declareFunction("balancing_tactician_residual_conjunction_new_root_candidates", "BALANCING-TACTICIAN-RESIDUAL-CONJUNCTION-NEW-ROOT-CANDIDATES", 2, 0, false);
        declareFunction("balancing_tactician_transformation_new_root_candidates", "BALANCING-TACTICIAN-TRANSFORMATION-NEW-ROOT-CANDIDATES", 2, 0, false);
        declareFunction("balancing_tactician_possibly_make_new_root", "BALANCING-TACTICIAN-POSSIBLY-MAKE-NEW-ROOT", 2, 0, false);
        declareFunction("balancing_tactician_substrategy_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_substrategy_connected_conjunction_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-CONNECTED-CONJUNCTION-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link", "BALANCING-TACTICIAN-POSSIBLY-MOTIVATE-NEW-ROOT-VIA-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("balancing_tactician_substrategy_split_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-SPLIT-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_possibly_propagate_new_root_motivation_down_split_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-SPLIT-LINK", 2, 0, false);
        declareFunction("balancing_tactician_substrategy_union_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-UNION-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_possibly_propagate_new_root_motivation_down_union_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-UNION-LINK", 2, 0, false);
        declareFunction("balancing_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP", "BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?", 3, 0, false);
        declareFunction("balancing_tactician_allows_split_tactic_to_be_thrown_away_wrt_removalP", "BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-THROWN-AWAY-WRT-REMOVAL?", 3, 0, false);
        declareFunction("balancing_tactician_chooses_to_totally_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 5, 0, false);
        declareFunction("balancing_tactician_substrategy_problem_status_change", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE", 5, 0, false);
        declareFunction("balancing_tactician_recompute_problem_status", "BALANCING-TACTICIAN-RECOMPUTE-PROBLEM-STATUS", 2, 0, false);
        declareFunction("balancing_tactician_possibly_propagate_strategic_status_to_tactical_status", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-STRATEGIC-STATUS-TO-TACTICAL-STATUS", 3, 0, false);
        declareFunction("balancing_tactician_make_problem_no_good", "BALANCING-TACTICIAN-MAKE-PROBLEM-NO-GOOD", 2, 0, false);
        declareFunction("balancing_tactician_make_problem_pending", "BALANCING-TACTICIAN-MAKE-PROBLEM-PENDING", 2, 0, false);
        declareFunction("transformation_strategy_sibling_removal_strategy", "TRANSFORMATION-STRATEGY-SIBLING-REMOVAL-STRATEGY", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_balancing_tactician_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("balancing_tactician_data_print_function_trampoline", "BALANCING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("balancing_tactician_data_p", "BALANCING-TACTICIAN-DATA-P", 1, 0, false);
            new balancing_tactician.$balancing_tactician_data_p$UnaryFunction();
            declareFunction("bal_tac_data_new_root_substrategy", "BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
            declareFunction("bal_tac_data_transformation_substrategy", "BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
            declareFunction("bal_tac_data_removal_substrategies", "BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 1, 0, false);
            declareFunction("_csetf_bal_tac_data_new_root_substrategy", "_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 2, 0, false);
            declareFunction("_csetf_bal_tac_data_transformation_substrategy", "_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 2, 0, false);
            declareFunction("_csetf_bal_tac_data_removal_substrategies", "_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 2, 0, false);
            declareFunction("make_balancing_tactician_data", "MAKE-BALANCING-TACTICIAN-DATA", 0, 1, false);
            declareFunction("visit_defstruct_balancing_tactician_data", "VISIT-DEFSTRUCT-BALANCING-TACTICIAN-DATA", 2, 0, false);
            declareFunction("visit_defstruct_object_balancing_tactician_data_method", "VISIT-DEFSTRUCT-OBJECT-BALANCING-TACTICIAN-DATA-METHOD", 2, 0, false);
            declareFunction("balancing_tactician_p", "BALANCING-TACTICIAN-P", 1, 0, false);
            declareMacro("do_balancing_tactician_substrategies", "DO-BALANCING-TACTICIAN-SUBSTRATEGIES");
            declareMacro("do_balancing_tactician_spineful_substrategies", "DO-BALANCING-TACTICIAN-SPINEFUL-SUBSTRATEGIES");
            declareFunction("new_balancing_tactician_data", "NEW-BALANCING-TACTICIAN-DATA", 3, 0, false);
            declareFunction("balancing_tactician_initialize", "BALANCING-TACTICIAN-INITIALIZE", 1, 0, false);
            declareFunction("new_balancing_tactician_data_from_inference", "NEW-BALANCING-TACTICIAN-DATA-FROM-INFERENCE", 1, 0, false);
            declareFunction("balancing_tactician_new_root_substrategy", "BALANCING-TACTICIAN-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
            declareFunction("balancing_tactician_transformation_substrategy", "BALANCING-TACTICIAN-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
            declareFunction("balancing_tactician_removal_substrategies", "BALANCING-TACTICIAN-REMOVAL-SUBSTRATEGIES", 1, 0, false);
            declareFunction("balancing_tactician_sole_removal_substrategy", "BALANCING-TACTICIAN-SOLE-REMOVAL-SUBSTRATEGY", 1, 0, false);
            declareFunction("balancing_tactician_all_substrategies", "BALANCING-TACTICIAN-ALL-SUBSTRATEGIES", 1, 0, false);
            declareFunction("balancing_tactician_problem_motivated_wrt_nP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-N?", 2, 0, false);
            declareFunction("balancing_tactician_problem_motivated_wrt_rP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-R?", 2, 0, false);
            declareFunction("balancing_tactician_problem_motivated_wrt_tP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-T?", 2, 0, false);
            declareFunction("balancing_tactician_link_head_motivated_wrt_rP", "BALANCING-TACTICIAN-LINK-HEAD-MOTIVATED-WRT-R?", 2, 0, false);
            declareFunction("balancing_tactician_substrategy_p", "BALANCING-TACTICIAN-SUBSTRATEGY-P", 1, 0, false);
            declareFunction("balancing_tactician_proper_substrategy_p", "BALANCING-TACTICIAN-PROPER-SUBSTRATEGY-P", 1, 0, false);
            declareFunction("balancing_tactician_spineless_substrategy_p", "BALANCING-TACTICIAN-SPINELESS-SUBSTRATEGY-P", 1, 0, false);
            declareFunction("balancing_tactician_doneP", "BALANCING-TACTICIAN-DONE?", 1, 0, false);
            declareFunction("balancing_tactician_do_one_step", "BALANCING-TACTICIAN-DO-ONE-STEP", 1, 0, false);
            declareFunction("balancing_tactician_do_one_step_int", "BALANCING-TACTICIAN-DO-ONE-STEP-INT", 1, 0, false);
            declareFunction("balancing_tactician_should_reconsider_set_asidesP", "BALANCING-TACTICIAN-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
            declareFunction("balancing_tactician_reconsider_set_asides", "BALANCING-TACTICIAN-RECONSIDER-SET-ASIDES", 1, 0, false);
            declareFunction("substrategy_do_one_step_interestingness", "SUBSTRATEGY-DO-ONE-STEP-INTERESTINGNESS", 1, 0, false);
            declareFunction("balancing_tactician_continuation_possibleP", "BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?", 1, 0, false);
            declareFunction("balancing_tactician_chooses_to_throw_away_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
            declareFunction("balancing_tactician_chooses_to_set_aside_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
            declareFunction("balancing_tactician_chooses_to_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false);
            declareFunction("balancing_tactician_chooses_to_set_aside_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false);
            declareFunction("balancing_tactician_throw_away_uninteresting_set_asides", "BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
            declareFunction("balancing_tactician_note_inference_dynamic_properties_updated", "BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
            declareFunction("balancing_tactician_initialize_properties", "BALANCING-TACTICIAN-INITIALIZE-PROPERTIES", 2, 0, false);
            declareFunction("balancing_tactician_update_properties", "BALANCING-TACTICIAN-UPDATE-PROPERTIES", 2, 0, false);
            declareFunction("balancing_tactician_initial_relevant_strategies", "BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
            declareFunction("balancing_tactician_possibly_activate_problem", "BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
            declareFunction("balancing_tactician_problem_is_the_rest_of_an_early_removalP", "BALANCING-TACTICIAN-PROBLEM-IS-THE-REST-OF-AN-EARLY-REMOVAL?", 2, 0, false);
            declareFunction("balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-PROPAGATE-NEW-ROOT-MOTIVATION-TO-RESTRICTED-NON-FOCAL-PROBLEM?", 3, 0, false);
            declareFunction("balancing_tactician_treats_restricted_non_focal_as_new_rootP", "BALANCING-TACTICIAN-TREATS-RESTRICTED-NON-FOCAL-AS-NEW-ROOT?", 2, 0, false);
            declareFunction("balancing_tactician_early_removal_linkP", "BALANCING-TACTICIAN-EARLY-REMOVAL-LINK?", 2, 0, false);
            declareFunction("substrategy_connected_conjunction_link_motivatedP", "SUBSTRATEGY-CONNECTED-CONJUNCTION-LINK-MOTIVATED?", 2, 0, false);
            declareFunction("balancing_tactician_problem_is_the_result_of_a_simplificationP", "BALANCING-TACTICIAN-PROBLEM-IS-THE-RESULT-OF-A-SIMPLIFICATION?", 2, 0, false);
            declareFunction("balancing_tactician_note_argument_link", "BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK", 2, 0, false);
            declareFunction("balancing_tactician_early_removal_productivity_limit", "BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
            declareFunction("balancing_tactician_substrategy_strategem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED", 3, 0, false);
            declareFunction("balancing_tactician_substrategy_problem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-MOTIVATED", 3, 0, false);
            declareFunction("balancing_tactician_substrategy_link_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-LINK-MOTIVATED", 3, 0, false);
            declareFunction("balancing_tactician_chooses_to_make_d_a_new_rootP", "BALANCING-TACTICIAN-CHOOSES-TO-MAKE-D-A-NEW-ROOT?", 2, 0, false);
            declareFunction("balancing_tactician_residual_conjunction_new_root_candidates", "BALANCING-TACTICIAN-RESIDUAL-CONJUNCTION-NEW-ROOT-CANDIDATES", 2, 0, false);
            declareFunction("balancing_tactician_transformation_new_root_candidates", "BALANCING-TACTICIAN-TRANSFORMATION-NEW-ROOT-CANDIDATES", 2, 0, false);
            declareFunction("balancing_tactician_possibly_make_new_root", "BALANCING-TACTICIAN-POSSIBLY-MAKE-NEW-ROOT", 2, 0, false);
            declareFunction("balancing_tactician_substrategy_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-TACTIC-MOTIVATED", 3, 0, false);
            declareFunction("balancing_tactician_substrategy_connected_conjunction_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-CONNECTED-CONJUNCTION-TACTIC-MOTIVATED", 3, 0, false);
            declareFunction("balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link", "BALANCING-TACTICIAN-POSSIBLY-MOTIVATE-NEW-ROOT-VIA-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
            declareFunction("balancing_tactician_substrategy_split_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-SPLIT-TACTIC-MOTIVATED", 3, 0, false);
            declareFunction("balancing_tactician_possibly_propagate_new_root_motivation_down_split_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-SPLIT-LINK", 2, 0, false);
            declareFunction("balancing_tactician_substrategy_union_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-UNION-TACTIC-MOTIVATED", 3, 0, false);
            declareFunction("balancing_tactician_possibly_propagate_new_root_motivation_down_union_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-UNION-LINK", 2, 0, false);
            declareFunction("balancing_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP", "BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?", 3, 0, false);
            declareFunction("balancing_tactician_chooses_to_totally_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 5, 0, false);
            declareFunction("balancing_tactician_substrategy_problem_status_change", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE", 5, 0, false);
            declareFunction("balancing_tactician_recompute_problem_status", "BALANCING-TACTICIAN-RECOMPUTE-PROBLEM-STATUS", 2, 0, false);
            declareFunction("balancing_tactician_possibly_propagate_strategic_status_to_tactical_status", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-STRATEGIC-STATUS-TO-TACTICAL-STATUS", 3, 0, false);
            declareFunction("balancing_tactician_make_problem_no_good", "BALANCING-TACTICIAN-MAKE-PROBLEM-NO-GOOD", 2, 0, false);
            declareFunction("balancing_tactician_make_problem_pending", "BALANCING-TACTICIAN-MAKE-PROBLEM-PENDING", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("balancing_tactician_allows_split_tactic_to_be_thrown_away_wrt_removalP", "BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-THROWN-AWAY-WRT-REMOVAL?", 3, 0, false);
            declareFunction("transformation_strategy_sibling_removal_strategy", "TRANSFORMATION-STRATEGY-SIBLING-REMOVAL-STRATEGY", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_balancing_tactician_file_Previous() {
        declareFunction("balancing_tactician_data_print_function_trampoline", "BALANCING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("balancing_tactician_data_p", "BALANCING-TACTICIAN-DATA-P", 1, 0, false);
        new balancing_tactician.$balancing_tactician_data_p$UnaryFunction();
        declareFunction("bal_tac_data_new_root_substrategy", "BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
        declareFunction("bal_tac_data_transformation_substrategy", "BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
        declareFunction("bal_tac_data_removal_substrategies", "BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 1, 0, false);
        declareFunction("_csetf_bal_tac_data_new_root_substrategy", "_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 2, 0, false);
        declareFunction("_csetf_bal_tac_data_transformation_substrategy", "_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 2, 0, false);
        declareFunction("_csetf_bal_tac_data_removal_substrategies", "_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 2, 0, false);
        declareFunction("make_balancing_tactician_data", "MAKE-BALANCING-TACTICIAN-DATA", 0, 1, false);
        declareFunction("visit_defstruct_balancing_tactician_data", "VISIT-DEFSTRUCT-BALANCING-TACTICIAN-DATA", 2, 0, false);
        declareFunction("visit_defstruct_object_balancing_tactician_data_method", "VISIT-DEFSTRUCT-OBJECT-BALANCING-TACTICIAN-DATA-METHOD", 2, 0, false);
        declareFunction("balancing_tactician_p", "BALANCING-TACTICIAN-P", 1, 0, false);
        declareMacro("do_balancing_tactician_substrategies", "DO-BALANCING-TACTICIAN-SUBSTRATEGIES");
        declareMacro("do_balancing_tactician_spineful_substrategies", "DO-BALANCING-TACTICIAN-SPINEFUL-SUBSTRATEGIES");
        declareFunction("new_balancing_tactician_data", "NEW-BALANCING-TACTICIAN-DATA", 3, 0, false);
        declareFunction("balancing_tactician_initialize", "BALANCING-TACTICIAN-INITIALIZE", 1, 0, false);
        declareFunction("new_balancing_tactician_data_from_inference", "NEW-BALANCING-TACTICIAN-DATA-FROM-INFERENCE", 1, 0, false);
        declareFunction("balancing_tactician_new_root_substrategy", "BALANCING-TACTICIAN-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
        declareFunction("balancing_tactician_transformation_substrategy", "BALANCING-TACTICIAN-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
        declareFunction("balancing_tactician_removal_substrategies", "BALANCING-TACTICIAN-REMOVAL-SUBSTRATEGIES", 1, 0, false);
        declareFunction("balancing_tactician_sole_removal_substrategy", "BALANCING-TACTICIAN-SOLE-REMOVAL-SUBSTRATEGY", 1, 0, false);
        declareFunction("balancing_tactician_all_substrategies", "BALANCING-TACTICIAN-ALL-SUBSTRATEGIES", 1, 0, false);
        declareFunction("balancing_tactician_problem_motivated_wrt_nP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-N?", 2, 0, false);
        declareFunction("balancing_tactician_problem_motivated_wrt_rP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-R?", 2, 0, false);
        declareFunction("balancing_tactician_problem_motivated_wrt_tP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-T?", 2, 0, false);
        declareFunction("balancing_tactician_link_head_motivated_wrt_rP", "BALANCING-TACTICIAN-LINK-HEAD-MOTIVATED-WRT-R?", 2, 0, false);
        declareFunction("balancing_tactician_substrategy_p", "BALANCING-TACTICIAN-SUBSTRATEGY-P", 1, 0, false);
        declareFunction("balancing_tactician_proper_substrategy_p", "BALANCING-TACTICIAN-PROPER-SUBSTRATEGY-P", 1, 0, false);
        declareFunction("balancing_tactician_spineless_substrategy_p", "BALANCING-TACTICIAN-SPINELESS-SUBSTRATEGY-P", 1, 0, false);
        declareFunction("balancing_tactician_doneP", "BALANCING-TACTICIAN-DONE?", 1, 0, false);
        declareFunction("balancing_tactician_do_one_step", "BALANCING-TACTICIAN-DO-ONE-STEP", 1, 0, false);
        declareFunction("balancing_tactician_do_one_step_int", "BALANCING-TACTICIAN-DO-ONE-STEP-INT", 1, 0, false);
        declareFunction("balancing_tactician_should_reconsider_set_asidesP", "BALANCING-TACTICIAN-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
        declareFunction("balancing_tactician_reconsider_set_asides", "BALANCING-TACTICIAN-RECONSIDER-SET-ASIDES", 1, 0, false);
        declareFunction("substrategy_do_one_step_interestingness", "SUBSTRATEGY-DO-ONE-STEP-INTERESTINGNESS", 1, 0, false);
        declareFunction("balancing_tactician_continuation_possibleP", "BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?", 1, 0, false);
        declareFunction("balancing_tactician_chooses_to_throw_away_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
        declareFunction("balancing_tactician_chooses_to_set_aside_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        declareFunction("balancing_tactician_chooses_to_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false);
        declareFunction("balancing_tactician_chooses_to_set_aside_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false);
        declareFunction("balancing_tactician_throw_away_uninteresting_set_asides", "BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
        declareFunction("balancing_tactician_note_inference_dynamic_properties_updated", "BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
        declareFunction("balancing_tactician_initialize_properties", "BALANCING-TACTICIAN-INITIALIZE-PROPERTIES", 2, 0, false);
        declareFunction("balancing_tactician_update_properties", "BALANCING-TACTICIAN-UPDATE-PROPERTIES", 2, 0, false);
        declareFunction("balancing_tactician_initial_relevant_strategies", "BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction("balancing_tactician_possibly_activate_problem", "BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("balancing_tactician_problem_is_the_rest_of_an_early_removalP", "BALANCING-TACTICIAN-PROBLEM-IS-THE-REST-OF-AN-EARLY-REMOVAL?", 2, 0, false);
        declareFunction("balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-PROPAGATE-NEW-ROOT-MOTIVATION-TO-RESTRICTED-NON-FOCAL-PROBLEM?", 3, 0, false);
        declareFunction("balancing_tactician_treats_restricted_non_focal_as_new_rootP", "BALANCING-TACTICIAN-TREATS-RESTRICTED-NON-FOCAL-AS-NEW-ROOT?", 2, 0, false);
        declareFunction("balancing_tactician_early_removal_linkP", "BALANCING-TACTICIAN-EARLY-REMOVAL-LINK?", 2, 0, false);
        declareFunction("substrategy_connected_conjunction_link_motivatedP", "SUBSTRATEGY-CONNECTED-CONJUNCTION-LINK-MOTIVATED?", 2, 0, false);
        declareFunction("balancing_tactician_problem_is_the_result_of_a_simplificationP", "BALANCING-TACTICIAN-PROBLEM-IS-THE-RESULT-OF-A-SIMPLIFICATION?", 2, 0, false);
        declareFunction("balancing_tactician_note_argument_link", "BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK", 2, 0, false);
        declareFunction("balancing_tactician_early_removal_productivity_limit", "BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction("balancing_tactician_substrategy_strategem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_substrategy_problem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_substrategy_link_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-LINK-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_chooses_to_make_d_a_new_rootP", "BALANCING-TACTICIAN-CHOOSES-TO-MAKE-D-A-NEW-ROOT?", 2, 0, false);
        declareFunction("balancing_tactician_residual_conjunction_new_root_candidates", "BALANCING-TACTICIAN-RESIDUAL-CONJUNCTION-NEW-ROOT-CANDIDATES", 2, 0, false);
        declareFunction("balancing_tactician_transformation_new_root_candidates", "BALANCING-TACTICIAN-TRANSFORMATION-NEW-ROOT-CANDIDATES", 2, 0, false);
        declareFunction("balancing_tactician_possibly_make_new_root", "BALANCING-TACTICIAN-POSSIBLY-MAKE-NEW-ROOT", 2, 0, false);
        declareFunction("balancing_tactician_substrategy_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_substrategy_connected_conjunction_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-CONNECTED-CONJUNCTION-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link", "BALANCING-TACTICIAN-POSSIBLY-MOTIVATE-NEW-ROOT-VIA-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("balancing_tactician_substrategy_split_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-SPLIT-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_possibly_propagate_new_root_motivation_down_split_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-SPLIT-LINK", 2, 0, false);
        declareFunction("balancing_tactician_substrategy_union_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-UNION-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction("balancing_tactician_possibly_propagate_new_root_motivation_down_union_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-UNION-LINK", 2, 0, false);
        declareFunction("balancing_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP", "BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?", 3, 0, false);
        declareFunction("balancing_tactician_chooses_to_totally_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 5, 0, false);
        declareFunction("balancing_tactician_substrategy_problem_status_change", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE", 5, 0, false);
        declareFunction("balancing_tactician_recompute_problem_status", "BALANCING-TACTICIAN-RECOMPUTE-PROBLEM-STATUS", 2, 0, false);
        declareFunction("balancing_tactician_possibly_propagate_strategic_status_to_tactical_status", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-STRATEGIC-STATUS-TO-TACTICAL-STATUS", 3, 0, false);
        declareFunction("balancing_tactician_make_problem_no_good", "BALANCING-TACTICIAN-MAKE-PROBLEM-NO-GOOD", 2, 0, false);
        declareFunction("balancing_tactician_make_problem_pending", "BALANCING-TACTICIAN-MAKE-PROBLEM-PENDING", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_balancing_tactician_file() {
        defconstant("*DTP-BALANCING-TACTICIAN-DATA*", balancing_tactician.BALANCING_TACTICIAN_DATA);
        defvar("*BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(backward.$transformation_early_removal_threshold$.getDynamicValue()));
        defparameter("*BALANCING-TACTICIAN-SELF-LOOPING-RULE-FIX-ENABLED?*", T);
        defvar("*BALANCING-TACTICIAN-NEW-ROOTS-CHECK-FOR-T-ON-JO-LINK?*", T);
        defparameter("*BALANCING-TACTICIAN-NEW-ROOTS-TRIGGERED-BY-T-ON-JO-LINK?*", T);
        defparameter("*BALANCING-TACTICIAN-IS-TACTICALLY-HARDCORE?*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ $NAME, makeString("Balancing Tactician"), makeKeyword("COMMENT"), makeString("A balancing tactician type which delegates to a new-root tactician,\n a transformation tactician, and multiple removal tacticians."), makeKeyword("CONSTRUCTOR"), makeSymbol("BALANCING-TACTICIAN-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("BALANCING-TACTICIAN-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("BALANCING-TACTICIAN-DO-ONE-STEP"), makeKeyword("INITIAL-RELEVANT-STRATEGIES"), makeSymbol("BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES"), makeKeyword("INITIALIZE-PROPERTIES"), makeSymbol("BALANCING-TACTICIAN-INITIALIZE-PROPERTIES"), makeKeyword("UPDATE-PROPERTIES"), makeSymbol("BALANCING-TACTICIAN-UPDATE-PROPERTIES"), makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeSymbol("BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeKeyword("CONTINUATION-POSSIBLE?"), makeSymbol("BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeSymbol("BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK"), makeKeyword("NEW-TACTIC"), makeSymbol("IGNORE"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("IGNORE"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("FALSE"), makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?"), makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?"), makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-THROWN-AWAY-WRT-REMOVAL"), makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-THROWN-AWAY-WRT-REMOVAL?"), makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE") });

    public static final SubLObject setup_balancing_tactician_file_alt() {
        inference_tactician.inference_strategy_type($BALANCING, $list_alt1);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_balancing_tactician_data$.getGlobalValue(), symbol_function(BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY, _CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY);
        def_csetf(BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY, _CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY);
        def_csetf(BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES, _CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES);
        identity(BALANCING_TACTICIAN_DATA);
        note_funcall_helper_function(BALANCING_TACTICIAN_INITIALIZE);
        note_funcall_helper_function($sym35$BALANCING_TACTICIAN_DONE_);
        note_funcall_helper_function(BALANCING_TACTICIAN_DO_ONE_STEP);
        note_funcall_helper_function($sym39$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_);
        note_funcall_helper_function($sym40$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_);
        note_funcall_helper_function($sym41$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_);
        note_funcall_helper_function(BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES);
        note_funcall_helper_function(BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED);
        note_funcall_helper_function(BALANCING_TACTICIAN_INITIALIZE_PROPERTIES);
        note_funcall_helper_function(BALANCING_TACTICIAN_UPDATE_PROPERTIES);
        note_funcall_helper_function(BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES);
        note_funcall_helper_function(BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM);
        note_funcall_helper_function(BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK);
        note_funcall_helper_function(BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT);
        note_funcall_helper_function(BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED);
        note_funcall_helper_function($sym63$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV);
        note_funcall_helper_function($sym64$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_THROWN_AWAY_WRT_REM);
        note_funcall_helper_function($sym65$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_);
        note_funcall_helper_function(BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE);
        return NIL;
    }

    public static SubLObject setup_balancing_tactician_file() {
        if (SubLFiles.USE_V1) {
            inference_tactician.inference_strategy_type($BALANCING, balancing_tactician.$list1);
            register_method($print_object_method_table$.getGlobalValue(), balancing_tactician.$dtp_balancing_tactician_data$.getGlobalValue(), symbol_function(balancing_tactician.BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(balancing_tactician.$list10);
            def_csetf(balancing_tactician.BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY, balancing_tactician._CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY);
            def_csetf(balancing_tactician.BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY, balancing_tactician._CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY);
            def_csetf(balancing_tactician.BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES, balancing_tactician._CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES);
            identity(balancing_tactician.BALANCING_TACTICIAN_DATA);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), balancing_tactician.$dtp_balancing_tactician_data$.getGlobalValue(), symbol_function(balancing_tactician.VISIT_DEFSTRUCT_OBJECT_BALANCING_TACTICIAN_DATA_METHOD));
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_INITIALIZE);
            note_funcall_helper_function(balancing_tactician.$sym41$BALANCING_TACTICIAN_DONE_);
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_DO_ONE_STEP);
            note_funcall_helper_function(balancing_tactician.$sym49$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_);
            note_funcall_helper_function(balancing_tactician.$sym50$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_PROBLEM_);
            note_funcall_helper_function(balancing_tactician.$sym51$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_PROBLEM_);
            note_funcall_helper_function(balancing_tactician.$sym52$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_);
            note_funcall_helper_function(balancing_tactician.$sym53$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_);
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES);
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED);
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_INITIALIZE_PROPERTIES);
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_UPDATE_PROPERTIES);
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES);
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM);
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK);
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT);
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED);
            note_funcall_helper_function(balancing_tactician.$sym75$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV);
            note_funcall_helper_function(balancing_tactician.$sym76$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_);
            note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE);
        }
        if (SubLFiles.USE_V2) {
            note_funcall_helper_function($sym35$BALANCING_TACTICIAN_DONE_);
            note_funcall_helper_function($sym39$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_);
            note_funcall_helper_function($sym40$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_);
            note_funcall_helper_function($sym41$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_);
            note_funcall_helper_function($sym63$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV);
            note_funcall_helper_function($sym64$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_THROWN_AWAY_WRT_REM);
            note_funcall_helper_function($sym65$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_);
        }
        return NIL;
    }

    public static SubLObject setup_balancing_tactician_file_Previous() {
        inference_tactician.inference_strategy_type($BALANCING, balancing_tactician.$list1);
        register_method($print_object_method_table$.getGlobalValue(), balancing_tactician.$dtp_balancing_tactician_data$.getGlobalValue(), symbol_function(balancing_tactician.BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(balancing_tactician.$list10);
        def_csetf(balancing_tactician.BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY, balancing_tactician._CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY);
        def_csetf(balancing_tactician.BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY, balancing_tactician._CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY);
        def_csetf(balancing_tactician.BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES, balancing_tactician._CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES);
        identity(balancing_tactician.BALANCING_TACTICIAN_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), balancing_tactician.$dtp_balancing_tactician_data$.getGlobalValue(), symbol_function(balancing_tactician.VISIT_DEFSTRUCT_OBJECT_BALANCING_TACTICIAN_DATA_METHOD));
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_INITIALIZE);
        note_funcall_helper_function(balancing_tactician.$sym41$BALANCING_TACTICIAN_DONE_);
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_DO_ONE_STEP);
        note_funcall_helper_function(balancing_tactician.$sym49$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_);
        note_funcall_helper_function(balancing_tactician.$sym50$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_PROBLEM_);
        note_funcall_helper_function(balancing_tactician.$sym51$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_PROBLEM_);
        note_funcall_helper_function(balancing_tactician.$sym52$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_);
        note_funcall_helper_function(balancing_tactician.$sym53$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_);
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES);
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED);
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_INITIALIZE_PROPERTIES);
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_UPDATE_PROPERTIES);
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES);
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM);
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK);
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT);
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED);
        note_funcall_helper_function(balancing_tactician.$sym75$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV);
        note_funcall_helper_function(balancing_tactician.$sym76$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_);
        note_funcall_helper_function(balancing_tactician.BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE);
        return NIL;
    }

    static private final SubLList $list_alt4 = list(makeSymbol("NEW-ROOT-SUBSTRATEGY"), makeSymbol("TRANSFORMATION-SUBSTRATEGY"), makeSymbol("REMOVAL-SUBSTRATEGIES"));

    static private final SubLList $list_alt5 = list(makeKeyword("NEW-ROOT-SUBSTRATEGY"), makeKeyword("TRANSFORMATION-SUBSTRATEGY"), makeKeyword("REMOVAL-SUBSTRATEGIES"));

    static private final SubLList $list_alt6 = list(makeSymbol("BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), makeSymbol("BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), makeSymbol("BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES"));

    static private final SubLList $list_alt7 = list(makeSymbol("_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), makeSymbol("_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), makeSymbol("_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES"));

    @Override
    public void declareFunctions() {
        balancing_tactician.declare_balancing_tactician_file();
    }

    @Override
    public void initializeVariables() {
        balancing_tactician.init_balancing_tactician_file();
    }

    @Override
    public void runTopLevelForms() {
        balancing_tactician.setup_balancing_tactician_file();
    }

    static {
    }

    public static final class $balancing_tactician_data_native extends SubLStructNative {
        public SubLObject $new_root_substrategy;

        public SubLObject $transformation_substrategy;

        public SubLObject $removal_substrategies;

        private static final SubLStructDeclNative structDecl;

        public $balancing_tactician_data_native() {
            balancing_tactician.$balancing_tactician_data_native.this.$new_root_substrategy = Lisp.NIL;
            balancing_tactician.$balancing_tactician_data_native.this.$transformation_substrategy = Lisp.NIL;
            balancing_tactician.$balancing_tactician_data_native.this.$removal_substrategies = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return balancing_tactician.$balancing_tactician_data_native.this.$new_root_substrategy;
        }

        @Override
        public SubLObject getField3() {
            return balancing_tactician.$balancing_tactician_data_native.this.$transformation_substrategy;
        }

        @Override
        public SubLObject getField4() {
            return balancing_tactician.$balancing_tactician_data_native.this.$removal_substrategies;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return balancing_tactician.$balancing_tactician_data_native.this.$new_root_substrategy = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return balancing_tactician.$balancing_tactician_data_native.this.$transformation_substrategy = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return balancing_tactician.$balancing_tactician_data_native.this.$removal_substrategies = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.harness.balancing_tactician.$balancing_tactician_data_native.class, balancing_tactician.BALANCING_TACTICIAN_DATA, balancing_tactician.BALANCING_TACTICIAN_DATA_P, balancing_tactician.$list4, balancing_tactician.$list5, new String[]{ "$new_root_substrategy", "$transformation_substrategy", "$removal_substrategies" }, balancing_tactician.$list6, balancing_tactician.$list7, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLString $str_alt19$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt20 = list(makeKeyword("BALANCING"));

    static private final SubLList $list_alt21 = list(list(makeSymbol("SUBSTRATEGY-VAR"), makeSymbol("STRATEGY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt22 = list($DONE);

    public static final class $balancing_tactician_data_p$UnaryFunction extends UnaryFunction {
        public $balancing_tactician_data_p$UnaryFunction() {
            super(extractFunctionNamed("BALANCING-TACTICIAN-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return balancing_tactician.balancing_tactician_data_p(arg1);
        }
    }

    static private final SubLSymbol $sym35$BALANCING_TACTICIAN_DONE_ = makeSymbol("BALANCING-TACTICIAN-DONE?");

    static private final SubLSymbol $sym39$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_ = makeSymbol("BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?");

    static private final SubLSymbol $sym40$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?");

    static private final SubLSymbol $sym41$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?");

    static private final SubLSymbol $sym63$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV = makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?");

    static private final SubLSymbol $sym64$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_THROWN_AWAY_WRT_REM = makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-THROWN-AWAY-WRT-REMOVAL?");

    static private final SubLSymbol $sym65$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?");
}

/**
 * Total time: 232 ms
 */
