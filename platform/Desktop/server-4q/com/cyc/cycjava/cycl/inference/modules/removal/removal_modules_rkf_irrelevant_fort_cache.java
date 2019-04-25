package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_rkf_irrelevant_fort_cache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rkf_irrelevant_fort_cache";
    public static final String myFingerPrint = "10e0f1ae852209ba629c8f9720e0ed382815f1d6aa9ab1205cac741bee39aeb8";
    private static final SubLSymbol $kw0$REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_NEG;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$POS;
    private static final SubLSymbol $kw5$IRRELEVANT_EVERYWHERE;
    private static final SubLSymbol $kw6$RKF_IRRELEVANT_FORT_CACHE;
    private static final SubLSymbol $kw7$NEG;
    private static final SubLSymbol $kw8$IRRELEVANT_NOWHERE;
    private static final SubLSymbol $sym9$HL_JUSTIFY_RKF_IRRELEVANT_FORT_CACHE;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$HL_VERIFY_RKF_IRRELEVANT_FORT_CACHE;
    private static final SubLSymbol $sym12$SUPPORT_MT;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$HL_FORWARD_MT_COMBOS_RKF_IRRELEVANT_FORT_CACHE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 571L)
    public static SubLObject removal_rkf_irrelevant_fort_cache_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
        }
        return control_vars.$cheap_hl_module_check_cost$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 2098L)
    public static SubLObject removal_rkf_irrelevant_fort_cache_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
        }
        final SubLObject fort = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED);
        final SubLObject result = rkf_irrelevant_fort_cache.rkf_irrelevant_cache_lookup(fort);
        if (sense == removal_modules_rkf_irrelevant_fort_cache.$kw4$POS && result == removal_modules_rkf_irrelevant_fort_cache.$kw5$IRRELEVANT_EVERYWHERE) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rkf_irrelevant_fort_cache.$kw6$RKF_IRRELEVANT_FORT_CACHE, asent, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED), (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED);
        }
        else if (sense == removal_modules_rkf_irrelevant_fort_cache.$kw7$NEG && result == removal_modules_rkf_irrelevant_fort_cache.$kw8$IRRELEVANT_NOWHERE) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rkf_irrelevant_fort_cache.$kw6$RKF_IRRELEVANT_FORT_CACHE, cycl_utilities.negate(asent), (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED), (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED);
        }
        return (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 2607L)
    public static SubLObject hl_justify_rkf_irrelevant_fort_cache(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject literal = arguments.support_sentence(support);
        final SubLObject negatedP = cycl_utilities.negatedP(literal);
        final SubLObject sentence = el_utilities.literal_atomic_sentence(literal);
        final SubLObject truth = (removal_modules_rkf_irrelevant_fort_cache.NIL != negatedP) ? enumeration_types.inverse_truth(arguments.support_truth(support)) : arguments.support_truth(support);
        SubLObject supports = (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
        final SubLObject _prev_bind_0 = rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.currentBinding(thread);
        try {
            rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.bind((SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL, thread);
            final SubLObject bindings_and_supports = backward.removal_ask(sentence, arguments.support_mt(support), truth, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED);
            supports = conses_high.second(bindings_and_supports.first());
        }
        finally {
            rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 3124L)
    public static SubLObject hl_verify_rkf_irrelevant_fort_cache(final SubLObject support) {
        return list_utilities.sublisp_boolean(backward.removal_ask(arguments.support_sentence(support), arguments.support_mt(support), arguments.support_truth(support), (SubLObject)removal_modules_rkf_irrelevant_fort_cache.$list10));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 3420L)
    public static SubLObject hl_forward_mt_combos_rkf_irrelevant_fort_cache(final SubLObject support) {
        SubLObject supports = (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
        final SubLObject mts = Mapping.mapcar((SubLObject)removal_modules_rkf_irrelevant_fort_cache.$sym12$SUPPORT_MT, hl_justify_rkf_irrelevant_fort_cache(support));
        SubLObject hl_module = (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
        SubLObject el_sentence = (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
        SubLObject mt = (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
        SubLObject tv = (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.$list13);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.$list13);
        el_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.$list13);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.$list13);
        tv = current.first();
        current = current.rest();
        if (removal_modules_rkf_irrelevant_fort_cache.NIL == current) {
            SubLObject cdolist_list_var = genl_mts.max_floor_mts(mts, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED);
            SubLObject mt_$1 = (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
            mt_$1 = cdolist_list_var.first();
            while (removal_modules_rkf_irrelevant_fort_cache.NIL != cdolist_list_var) {
                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, el_sentence, mt_$1, tv), supports);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$1 = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.$list13);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 3811L)
    public static SubLObject removal_rkf_irrelevant_fort_cache_required(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.UNPROVIDED);
        final SubLObject pcase_var;
        final SubLObject value = pcase_var = (SubLObject)((removal_modules_rkf_irrelevant_fort_cache.NIL != rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.getDynamicValue(thread) && removal_modules_rkf_irrelevant_fort_cache.NIL != forts.fort_p(fort)) ? rkf_irrelevant_fort_cache.rkf_irrelevant_cache_lookup(fort) : removal_modules_rkf_irrelevant_fort_cache.NIL);
        if (pcase_var.eql((SubLObject)removal_modules_rkf_irrelevant_fort_cache.$kw5$IRRELEVANT_EVERYWHERE) || pcase_var.eql((SubLObject)removal_modules_rkf_irrelevant_fort_cache.$kw8$IRRELEVANT_NOWHERE)) {
            return (SubLObject)removal_modules_rkf_irrelevant_fort_cache.T;
        }
        return (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
    }
    
    public static SubLObject declare_removal_modules_rkf_irrelevant_fort_cache_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rkf_irrelevant_fort_cache", "removal_rkf_irrelevant_fort_cache_check_cost", "REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rkf_irrelevant_fort_cache", "removal_rkf_irrelevant_fort_cache_check_expand", "REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rkf_irrelevant_fort_cache", "hl_justify_rkf_irrelevant_fort_cache", "HL-JUSTIFY-RKF-IRRELEVANT-FORT-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rkf_irrelevant_fort_cache", "hl_verify_rkf_irrelevant_fort_cache", "HL-VERIFY-RKF-IRRELEVANT-FORT-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rkf_irrelevant_fort_cache", "hl_forward_mt_combos_rkf_irrelevant_fort_cache", "HL-FORWARD-MT-COMBOS-RKF-IRRELEVANT-FORT-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rkf_irrelevant_fort_cache", "removal_rkf_irrelevant_fort_cache_required", "REMOVAL-RKF-IRRELEVANT-FORT-CACHE-REQUIRED", 2, 0, false);
        return (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
    }
    
    public static SubLObject init_removal_modules_rkf_irrelevant_fort_cache_file() {
        return (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
    }
    
    public static SubLObject setup_removal_modules_rkf_irrelevant_fort_cache_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_rkf_irrelevant_fort_cache.$kw0$REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.$list1);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rkf_irrelevant_fort_cache.$kw2$REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_NEG, (SubLObject)removal_modules_rkf_irrelevant_fort_cache.$list3);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rkf_irrelevant_fort_cache.$sym9$HL_JUSTIFY_RKF_IRRELEVANT_FORT_CACHE);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rkf_irrelevant_fort_cache.$sym11$HL_VERIFY_RKF_IRRELEVANT_FORT_CACHE);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rkf_irrelevant_fort_cache.$sym14$HL_FORWARD_MT_COMBOS_RKF_IRRELEVANT_FORT_CACHE);
        return (SubLObject)removal_modules_rkf_irrelevant_fort_cache.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_rkf_irrelevant_fort_cache_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_rkf_irrelevant_fort_cache_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_rkf_irrelevant_fort_cache_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_rkf_irrelevant_fort_cache();
        $kw0$REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-POS");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantTerm")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-REQUIRED"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantTerm")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$keIrrelevantTerm <fort>) using the irrelevance cache"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$keIrrelevantTerm #$Poodle)\n    (#$keIrrelevantTerm (#$GovernmentFn #$France))") });
        $kw2$REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-NEG");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantTerm")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-REQUIRED"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantTerm")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$keIrrelevantTerm <fort>)) using the irrelevance cache"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$keIrrelevantTerm #$Poodle))\n    (#$not (#$keIrrelevantTerm (#$GovernmentFn #$France)))") });
        $kw4$POS = SubLObjectFactory.makeKeyword("POS");
        $kw5$IRRELEVANT_EVERYWHERE = SubLObjectFactory.makeKeyword("IRRELEVANT-EVERYWHERE");
        $kw6$RKF_IRRELEVANT_FORT_CACHE = SubLObjectFactory.makeKeyword("RKF-IRRELEVANT-FORT-CACHE");
        $kw7$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw8$IRRELEVANT_NOWHERE = SubLObjectFactory.makeKeyword("IRRELEVANT-NOWHERE");
        $sym9$HL_JUSTIFY_RKF_IRRELEVANT_FORT_CACHE = SubLObjectFactory.makeSymbol("HL-JUSTIFY-RKF-IRRELEVANT-FORT-CACHE");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-POS")), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)removal_modules_rkf_irrelevant_fort_cache.ONE_INTEGER);
        $sym11$HL_VERIFY_RKF_IRRELEVANT_FORT_CACHE = SubLObjectFactory.makeSymbol("HL-VERIFY-RKF-IRRELEVANT-FORT-CACHE");
        $sym12$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $sym14$HL_FORWARD_MT_COMBOS_RKF_IRRELEVANT_FORT_CACHE = SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-RKF-IRRELEVANT-FORT-CACHE");
    }
}

/*

	Total time: 140 ms
	
*/