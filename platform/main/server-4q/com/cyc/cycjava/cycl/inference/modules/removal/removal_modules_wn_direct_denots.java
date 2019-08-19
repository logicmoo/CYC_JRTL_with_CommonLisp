package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.wordnet;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_wn_direct_denots extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_wn_direct_denots";
    public static String myFingerPrint = "fd63d6bcc192803354f5543787ece60ae38892a6643de50ab9ddb0d6411d7ac0";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 700L)
    public static SubLSymbol $wn_direct_denots_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 2800L)
    public static SubLSymbol $result_of_wn_direct_denots$;
    private static SubLObject $$termStringsViaWordNet;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_WN_DIRECT_DENOTS_CHECK_POS;
    private static SubLList $list4;
    private static SubLSymbol $REMOVAL_WN_DIRECT_DENOTS_CHECK_NEG;
    private static SubLList $list6;
    private static SubLSymbol $REMOVAL_WN_DIRECT_DENOTS_POS;
    private static SubLList $list8;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 800L)
    public static SubLObject string_has_wn_direct_denotP(SubLObject cyc_term, SubLObject string) {
        SubLObject result = wordnet.wn_direct_denots_of_string(string, UNPROVIDED);
        return subl_promotions.memberP(cyc_term, result, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 1700L)
    public static SubLObject string_has_wn_direct_denot_negP(SubLObject cyc_term, SubLObject string) {
        SubLObject result = wordnet.wn_direct_denots_of_string(string, UNPROVIDED);
        return makeBoolean(NIL == subl_promotions.memberP(cyc_term, result, Symbols.symbol_function(EQUAL), UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 3000L)
    public static SubLObject removal_wn_direct_denots_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        $result_of_wn_direct_denots$.setDynamicValue(wordnet.wn_direct_denots_of_string(string, UNPROVIDED), thread);
        return Sequences.length($result_of_wn_direct_denots$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 3200L)
    public static SubLObject wn_direct_denots_of_string_iterator() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $result_of_wn_direct_denots$.getDynamicValue(thread)) {
            return iteration.new_list_iterator($result_of_wn_direct_denots$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_wn_direct_denots_file() {
        declareFunction(myName, "string_has_wn_direct_denotP", "STRING-HAS-WN-DIRECT-DENOT?", 2, 0, false);
        declareFunction(myName, "string_has_wn_direct_denot_negP", "STRING-HAS-WN-DIRECT-DENOT-NEG?", 2, 0, false);
        declareFunction(myName, "removal_wn_direct_denots_pos_cost", "REMOVAL-WN-DIRECT-DENOTS-POS-COST", 1, 1, false);
        declareFunction(myName, "wn_direct_denots_of_string_iterator", "WN-DIRECT-DENOTS-OF-STRING-ITERATOR", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_wn_direct_denots_file() {
        $wn_direct_denots_check_cost$ = defvar("*WN-DIRECT-DENOTS-CHECK-COST*", ONE_INTEGER);
        $result_of_wn_direct_denots$ = defvar("*RESULT-OF-WN-DIRECT-DENOTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_removal_modules_wn_direct_denots_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$termStringsViaWordNet);
        preference_modules.doomed_unless_arg_bindable($POS, $$termStringsViaWordNet, TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$termStringsViaWordNet);
        inference_modules.inference_removal_module($REMOVAL_WN_DIRECT_DENOTS_CHECK_POS, $list4);
        inference_modules.inference_removal_module($REMOVAL_WN_DIRECT_DENOTS_CHECK_NEG, $list6);
        inference_modules.inference_removal_module($REMOVAL_WN_DIRECT_DENOTS_POS, $list8);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_wn_direct_denots_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_wn_direct_denots_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_wn_direct_denots_file();
    }

    static {
        me = new removal_modules_wn_direct_denots();
        $wn_direct_denots_check_cost$ = null;
        $result_of_wn_direct_denots$ = null;
        $$termStringsViaWordNet = makeConstSym(("termStringsViaWordNet"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $REMOVAL_WN_DIRECT_DENOTS_CHECK_POS = makeKeyword("REMOVAL-WN-DIRECT-DENOTS-CHECK-POS");
        $list4 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("termStringsViaWordNet")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termStringsViaWordNet")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*WN-DIRECT-DENOTS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("termStringsViaWordNet")), list(makeKeyword("BIND"), makeSymbol("CYC-TERM")), list(makeKeyword("BIND"), makeSymbol("STRING"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("CYC-TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("STRING-HAS-WN-DIRECT-DENOT?"), list(makeKeyword("VALUE"), makeSymbol("CYC-TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$termStringsViaWordNet <fully-bound> <string>)"), makeKeyword("EXAMPLE"), makeString("(#$termStringsViaWordNet #$AnimalWalkingProcess \"walk\")") });
        $REMOVAL_WN_DIRECT_DENOTS_CHECK_NEG = makeKeyword("REMOVAL-WN-DIRECT-DENOTS-CHECK-NEG");
        $list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("termStringsViaWordNet")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termStringsViaWordNet")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*WN-DIRECT-DENOTS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("termStringsViaWordNet")), list(makeKeyword("BIND"), makeSymbol("CYC-TERM")), list(makeKeyword("BIND"), makeSymbol("STRING"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("CYC-TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("STRING-HAS-WN-DIRECT-DENOT-NEG?"), list(makeKeyword("VALUE"), makeSymbol("CYC-TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$termStringsViaWordNet <fully-bound> <string>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$termStringsViaWordNet #$AnimalWalkingProcess \"rooster\"))") });
        $REMOVAL_WN_DIRECT_DENOTS_POS = makeKeyword("REMOVAL-WN-DIRECT-DENOTS-POS");
        $list8 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("termStringsViaWordNet")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termStringsViaWordNet")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")),
                makeKeyword("COST"), makeSymbol("REMOVAL-WN-DIRECT-DENOTS-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("termStringsViaWordNet")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("WN-DIRECT-DENOTS-OF-STRING-ITERATOR")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("termStringsViaWordNet")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$termStringsViaWordNet <not-fully-bound> <string>)"), makeKeyword("EXAMPLE"), makeString("(#$termStringsViaWordNet ?X \"walk\")\n    (#$termStringsViaWordNet (#$JuvenileFn ?X) \"puppy\")") });
    }
}
/*
 *
 * Total time: 79 ms
 *
 */