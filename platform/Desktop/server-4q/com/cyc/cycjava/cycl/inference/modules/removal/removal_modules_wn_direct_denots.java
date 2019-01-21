package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.wordnet;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_wn_direct_denots extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_wn_direct_denots";
    public static final String myFingerPrint = "fd63d6bcc192803354f5543787ece60ae38892a6643de50ab9ddb0d6411d7ac0";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 735L)
    public static SubLSymbol $wn_direct_denots_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 2845L)
    public static SubLSymbol $result_of_wn_direct_denots$;
    private static final SubLObject $const0$termStringsViaWordNet;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLSymbol $kw3$REMOVAL_WN_DIRECT_DENOTS_CHECK_POS;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$REMOVAL_WN_DIRECT_DENOTS_CHECK_NEG;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$REMOVAL_WN_DIRECT_DENOTS_POS;
    private static final SubLList $list8;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 895L)
    public static SubLObject string_has_wn_direct_denotP(final SubLObject cyc_term, final SubLObject string) {
        final SubLObject result = wordnet.wn_direct_denots_of_string(string, (SubLObject)removal_modules_wn_direct_denots.UNPROVIDED);
        return subl_promotions.memberP(cyc_term, result, Symbols.symbol_function((SubLObject)removal_modules_wn_direct_denots.EQUAL), (SubLObject)removal_modules_wn_direct_denots.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 1796L)
    public static SubLObject string_has_wn_direct_denot_negP(final SubLObject cyc_term, final SubLObject string) {
        final SubLObject result = wordnet.wn_direct_denots_of_string(string, (SubLObject)removal_modules_wn_direct_denots.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_wn_direct_denots.NIL == subl_promotions.memberP(cyc_term, result, Symbols.symbol_function((SubLObject)removal_modules_wn_direct_denots.EQUAL), (SubLObject)removal_modules_wn_direct_denots.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 3000L)
    public static SubLObject removal_wn_direct_denots_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_wn_direct_denots.UNPROVIDED) {
            sense = (SubLObject)removal_modules_wn_direct_denots.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_wn_direct_denots.UNPROVIDED);
        removal_modules_wn_direct_denots.$result_of_wn_direct_denots$.setDynamicValue(wordnet.wn_direct_denots_of_string(string, (SubLObject)removal_modules_wn_direct_denots.UNPROVIDED), thread);
        return Sequences.length(removal_modules_wn_direct_denots.$result_of_wn_direct_denots$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 3267L)
    public static SubLObject wn_direct_denots_of_string_iterator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_wn_direct_denots.NIL != removal_modules_wn_direct_denots.$result_of_wn_direct_denots$.getDynamicValue(thread)) {
            return iteration.new_list_iterator(removal_modules_wn_direct_denots.$result_of_wn_direct_denots$.getDynamicValue(thread));
        }
        return (SubLObject)removal_modules_wn_direct_denots.NIL;
    }
    
    public static SubLObject declare_removal_modules_wn_direct_denots_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_wn_direct_denots", "string_has_wn_direct_denotP", "STRING-HAS-WN-DIRECT-DENOT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_wn_direct_denots", "string_has_wn_direct_denot_negP", "STRING-HAS-WN-DIRECT-DENOT-NEG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_wn_direct_denots", "removal_wn_direct_denots_pos_cost", "REMOVAL-WN-DIRECT-DENOTS-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_wn_direct_denots", "wn_direct_denots_of_string_iterator", "WN-DIRECT-DENOTS-OF-STRING-ITERATOR", 0, 0, false);
        return (SubLObject)removal_modules_wn_direct_denots.NIL;
    }
    
    public static SubLObject init_removal_modules_wn_direct_denots_file() {
        removal_modules_wn_direct_denots.$wn_direct_denots_check_cost$ = SubLFiles.defvar("*WN-DIRECT-DENOTS-CHECK-COST*", (SubLObject)removal_modules_wn_direct_denots.ONE_INTEGER);
        removal_modules_wn_direct_denots.$result_of_wn_direct_denots$ = SubLFiles.defvar("*RESULT-OF-WN-DIRECT-DENOTS*", (SubLObject)removal_modules_wn_direct_denots.NIL);
        return (SubLObject)removal_modules_wn_direct_denots.NIL;
    }
    
    public static SubLObject setup_removal_modules_wn_direct_denots_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_wn_direct_denots.$const0$termStringsViaWordNet);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_wn_direct_denots.$kw1$POS, removal_modules_wn_direct_denots.$const0$termStringsViaWordNet, (SubLObject)removal_modules_wn_direct_denots.TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_wn_direct_denots.$kw2$NEG, removal_modules_wn_direct_denots.$const0$termStringsViaWordNet);
        inference_modules.inference_removal_module((SubLObject)removal_modules_wn_direct_denots.$kw3$REMOVAL_WN_DIRECT_DENOTS_CHECK_POS, (SubLObject)removal_modules_wn_direct_denots.$list4);
        inference_modules.inference_removal_module((SubLObject)removal_modules_wn_direct_denots.$kw5$REMOVAL_WN_DIRECT_DENOTS_CHECK_NEG, (SubLObject)removal_modules_wn_direct_denots.$list6);
        inference_modules.inference_removal_module((SubLObject)removal_modules_wn_direct_denots.$kw7$REMOVAL_WN_DIRECT_DENOTS_POS, (SubLObject)removal_modules_wn_direct_denots.$list8);
        return (SubLObject)removal_modules_wn_direct_denots.NIL;
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
        me = (SubLFile)new removal_modules_wn_direct_denots();
        removal_modules_wn_direct_denots.$wn_direct_denots_check_cost$ = null;
        removal_modules_wn_direct_denots.$result_of_wn_direct_denots$ = null;
        $const0$termStringsViaWordNet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStringsViaWordNet"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw3$REMOVAL_WN_DIRECT_DENOTS_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-WN-DIRECT-DENOTS-CHECK-POS");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStringsViaWordNet")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStringsViaWordNet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*WN-DIRECT-DENOTS-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStringsViaWordNet")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-HAS-WN-DIRECT-DENOT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termStringsViaWordNet <fully-bound> <string>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termStringsViaWordNet #$AnimalWalkingProcess \"walk\")") });
        $kw5$REMOVAL_WN_DIRECT_DENOTS_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-WN-DIRECT-DENOTS-CHECK-NEG");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStringsViaWordNet")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStringsViaWordNet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*WN-DIRECT-DENOTS-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStringsViaWordNet")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-HAS-WN-DIRECT-DENOT-NEG?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$termStringsViaWordNet <fully-bound> <string>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$termStringsViaWordNet #$AnimalWalkingProcess \"rooster\"))") });
        $kw7$REMOVAL_WN_DIRECT_DENOTS_POS = SubLObjectFactory.makeKeyword("REMOVAL-WN-DIRECT-DENOTS-POS");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStringsViaWordNet")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStringsViaWordNet")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-WN-DIRECT-DENOTS-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStringsViaWordNet")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("WN-DIRECT-DENOTS-OF-STRING-ITERATOR")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStringsViaWordNet")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termStringsViaWordNet <not-fully-bound> <string>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termStringsViaWordNet ?X \"walk\")\n    (#$termStringsViaWordNet (#$JuvenileFn ?X) \"puppy\")") });
    }
}

/*

	Total time: 79 ms
	
*/