package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.wordnet;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_wn_direct_denots extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_wn_direct_denots();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_wn_direct_denots";

    public static final String myFingerPrint = "fd63d6bcc192803354f5543787ece60ae38892a6643de50ab9ddb0d6411d7ac0";

    // defvar
    // Definitions
    public static final SubLSymbol $wn_direct_denots_check_cost$ = makeSymbol("*WN-DIRECT-DENOTS-CHECK-COST*");

    // defvar
    public static final SubLSymbol $result_of_wn_direct_denots$ = makeSymbol("*RESULT-OF-WN-DIRECT-DENOTS*");

    private static final SubLObject $$termStringsViaWordNet = reader_make_constant_shell(makeString("termStringsViaWordNet"));





    private static final SubLSymbol $REMOVAL_WN_DIRECT_DENOTS_CHECK_POS = makeKeyword("REMOVAL-WN-DIRECT-DENOTS-CHECK-POS");

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termStringsViaWordNet")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termStringsViaWordNet")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*WN-DIRECT-DENOTS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("termStringsViaWordNet")), list(makeKeyword("BIND"), makeSymbol("CYC-TERM")), list(makeKeyword("BIND"), makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("CYC-TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("STRING-HAS-WN-DIRECT-DENOT?"), list(makeKeyword("VALUE"), makeSymbol("CYC-TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("DOCUMENTATION"), makeString("(#$termStringsViaWordNet <fully-bound> <string>)"), makeKeyword("EXAMPLE"), makeString("(#$termStringsViaWordNet #$AnimalWalkingProcess \"walk\")") });

    private static final SubLSymbol $REMOVAL_WN_DIRECT_DENOTS_CHECK_NEG = makeKeyword("REMOVAL-WN-DIRECT-DENOTS-CHECK-NEG");

    public static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termStringsViaWordNet")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termStringsViaWordNet")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*WN-DIRECT-DENOTS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("termStringsViaWordNet")), list(makeKeyword("BIND"), makeSymbol("CYC-TERM")), list(makeKeyword("BIND"), makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("CYC-TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("STRING-HAS-WN-DIRECT-DENOT-NEG?"), list(makeKeyword("VALUE"), makeSymbol("CYC-TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$termStringsViaWordNet <fully-bound> <string>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$termStringsViaWordNet #$AnimalWalkingProcess \"rooster\"))") });

    private static final SubLSymbol $REMOVAL_WN_DIRECT_DENOTS_POS = makeKeyword("REMOVAL-WN-DIRECT-DENOTS-POS");

    private static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termStringsViaWordNet")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termStringsViaWordNet")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-WN-DIRECT-DENOTS-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("termStringsViaWordNet")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("WN-DIRECT-DENOTS-OF-STRING-ITERATOR")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("termStringsViaWordNet")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("DOCUMENTATION"), makeString("(#$termStringsViaWordNet <not-fully-bound> <string>)"), makeKeyword("EXAMPLE"), makeString("(#$termStringsViaWordNet ?X \"walk\")\n    (#$termStringsViaWordNet (#$JuvenileFn ?X) \"puppy\")") });

    public static SubLObject string_has_wn_direct_denotP(final SubLObject cyc_term, final SubLObject string) {
        final SubLObject result = wordnet.wn_direct_denots_of_string(string, UNPROVIDED);
        return subl_promotions.memberP(cyc_term, result, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject string_has_wn_direct_denot_negP(final SubLObject cyc_term, final SubLObject string) {
        final SubLObject result = wordnet.wn_direct_denots_of_string(string, UNPROVIDED);
        return makeBoolean(NIL == subl_promotions.memberP(cyc_term, result, symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject removal_wn_direct_denots_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        $result_of_wn_direct_denots$.setDynamicValue(wordnet.wn_direct_denots_of_string(string, UNPROVIDED), thread);
        return length($result_of_wn_direct_denots$.getDynamicValue(thread));
    }

    public static SubLObject wn_direct_denots_of_string_iterator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $result_of_wn_direct_denots$.getDynamicValue(thread)) {
            return iteration.new_list_iterator($result_of_wn_direct_denots$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_wn_direct_denots_file() {
        declareFunction(me, "string_has_wn_direct_denotP", "STRING-HAS-WN-DIRECT-DENOT?", 2, 0, false);
        declareFunction(me, "string_has_wn_direct_denot_negP", "STRING-HAS-WN-DIRECT-DENOT-NEG?", 2, 0, false);
        declareFunction(me, "removal_wn_direct_denots_pos_cost", "REMOVAL-WN-DIRECT-DENOTS-POS-COST", 1, 1, false);
        declareFunction(me, "wn_direct_denots_of_string_iterator", "WN-DIRECT-DENOTS-OF-STRING-ITERATOR", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_wn_direct_denots_file() {
        defvar("*WN-DIRECT-DENOTS-CHECK-COST*", ONE_INTEGER);
        defvar("*RESULT-OF-WN-DIRECT-DENOTS*", NIL);
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

    
}

/**
 * Total time: 79 ms
 */
