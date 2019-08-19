package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_tactician extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.removal_tactician";
    public static String myFingerPrint = "b18065b17f747e85484ef1e15647b3555122545603621e4fcd7addc77defe05a";
    private static SubLSymbol $REMOVAL;
    private static SubLList $list1;
    private static SubLSymbol $sym2$REMOVAL_STRATEGY_INITIALIZE;

    @SubL(source = "cycl/inference/harness/removal-tactician.lisp", position = 2700L)
    public static SubLObject removal_strategy_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_strategy.strategy_p(v_object) && $REMOVAL == inference_datastructures_strategy.strategy_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/removal-tactician.lisp", position = 2900L)
    public static SubLObject removal_strategy_initialize(SubLObject strategy) {
        SubLObject removal_index = stacks.create_stack();
        SubLObject data = removal_tactician_datastructures.new_removal_strategy_data(removal_index);
        inference_datastructures_strategy.set_strategy_data(strategy, data);
        return strategy;
    }

    public static SubLObject declare_removal_tactician_file() {
        declareFunction(myName, "removal_strategy_p", "REMOVAL-STRATEGY-P", 1, 0, false);
        declareFunction(myName, "removal_strategy_initialize", "REMOVAL-STRATEGY-INITIALIZE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_tactician_file() {
        return NIL;
    }

    public static SubLObject setup_removal_tactician_file() {
        inference_tactician.inference_strategy_type($REMOVAL, $list1);
        utilities_macros.note_funcall_helper_function($sym2$REMOVAL_STRATEGY_INITIALIZE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_tactician_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_tactician_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_tactician_file();
    }

    static {
        me = new removal_tactician();
        $REMOVAL = makeKeyword("REMOVAL");
        $list1 = list(new SubLObject[] { makeKeyword("NAME"), makeString("The REMOVAL Tactician"), makeKeyword("COMMENT"), makeString("The REMOVAL Tactician needs no introduction."), makeKeyword("CONSTRUCTOR"), makeSymbol("REMOVAL-STRATEGY-INITIALIZE"), makeKeyword("DONE?"),
                makeSymbol("REMOVAL-STRATEGY-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("REMOVAL-STRATEGY-DO-ONE-STEP"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("SELECT-BEST-STRATEGEM"),
                makeSymbol("REMOVAL-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM"), makeKeyword("EXECUTE-STRATEGEM"), makeSymbol("REMOVAL-STRATEGY-EXECUTE-STRATEGEM"), makeKeyword("RECONSIDER-SET-ASIDES"), makeSymbol("REMOVAL-STRATEGY-RECONSIDER-SET-ASIDES"),
                makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("QUIESCE"), makeSymbol("REMOVAL-STRATEGY-QUIESCE"), makeKeyword("NEW-TACTIC"), makeSymbol("REMOVAL-STRATEGY-NOTE-NEW-TACTIC"),
                makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeSymbol("REMOVAL-STRATEGY-CATEGORIZE-STRATEGEMS"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("REMOVAL-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE"), makeKeyword("PROBLEM-COULD-BE-PENDING"),
                makeSymbol("REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("REMOVAL-STRATEGY-PROBLEM-NOTHING-TO-DO?"), makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?"),
                makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?"), makeKeyword("SET-ASIDE-TACTIC"),
                makeSymbol("REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("IGNORE"), makeKeyword("MOTIVATE-STRATEGEM"), makeSymbol("REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM"), makeKeyword("LINK-HEAD-MOTIVATED?"),
                makeSymbol("REMOVAL-STRATEGY-LINK-HEAD-MOTIVATED?"), makeKeyword("RECONSIDER-SPLIT-SET-ASIDES"), makeSymbol("REMOVAL-STRATEGY-POSSIBLY-RECONSIDER-SPLIT-SET-ASIDES") });
        $sym2$REMOVAL_STRATEGY_INITIALIZE = makeSymbol("REMOVAL-STRATEGY-INITIALIZE");
    }
}
/*
 *
 * Total time: 16 ms
 *
 */