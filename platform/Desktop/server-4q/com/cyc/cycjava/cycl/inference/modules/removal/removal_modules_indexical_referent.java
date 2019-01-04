package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_indexical_referent extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent";
    public static final String myFingerPrint = "444b80a153d9c7d846c2cf8e88c50c035bb731c92ef7c5d1e5727db6d5463b68";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 905L)
    private static SubLSymbol $indexical_referent_expansions$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 2400L)
    private static SubLSymbol $default_indexical_referent_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 5732L)
    private static SubLSymbol $indexical_the_cyc_process_owner_caching_state$;
    private static final SubLSymbol $sym0$CYC_INDEXICAL_REFERENT;
    private static final SubLObject $const1$indexicalReferent;
    private static final SubLSymbol $kw2$POS;
    private static final SubLSymbol $kw3$REMOVAL_INDEXICAL_REFERENT_POS;
    private static final SubLList $list4;
    private static final SubLObject $const5$HypotheticalContext;
    private static final SubLObject $const6$termDependsOn;
    private static final SubLObject $const7$QueryMt;
    private static final SubLSymbol $sym8$INDEXICAL_QUERY_MT;
    private static final SubLObject $const9$HypothesisMt;
    private static final SubLSymbol $sym10$INDEXICAL_HYPOTHESIS_MT;
    private static final SubLObject $const11$HypothesisMonadMt;
    private static final SubLSymbol $sym12$INDEXICAL_HYPOTHESIS_MONAD_MT;
    private static final SubLObject $const13$TheUser;
    private static final SubLSymbol $sym14$INDEXICAL_THE_USER;
    private static final SubLObject $const15$GeneralCycKE;
    private static final SubLObject $const16$ThePurpose;
    private static final SubLSymbol $sym17$INDEXICAL_THE_PURPOSE;
    private static final SubLSymbol $sym18$INDEXICAL_THE_CYC_PROCESS_OWNER;
    private static final SubLSymbol $sym19$_INDEXICAL_THE_CYC_PROCESS_OWNER_CACHING_STATE_;
    private static final SubLObject $const20$TheCycProcessOwner;
    private static final SubLObject $const21$TheCurrentKBNumber;
    private static final SubLSymbol $sym22$INDEXICAL_THE_CURRENT_KB_NUMBER;
    private static final SubLObject $const23$TheCurrentSystemNumber;
    private static final SubLSymbol $sym24$INDEXICAL_THE_CURRENT_SYSTEM_NUMBER;
    private static final SubLObject $const25$TheCurrentHostName;
    private static final SubLSymbol $sym26$INDEXICAL_THE_CURRENT_HOST_NAME;
    private static final SubLObject $const27$ThisInference;
    private static final SubLSymbol $sym28$INDEXICAL_THIS_INFERENCE;
    private static final SubLObject $const29$ThisProblemStore;
    private static final SubLSymbol $sym30$INDEXICAL_THIS_PROBLEM_STORE;
    private static final SubLObject $const31$Now;
    private static final SubLSymbol $sym32$INDEXICAL_NOW;
    private static final SubLObject $const33$Now_Indexical;
    private static final SubLObject $const34$Today_Indexical;
    private static final SubLSymbol $sym35$INDEXICAL_TODAY;
    private static final SubLObject $const36$Tomorrow_Indexical;
    private static final SubLSymbol $sym37$INDEXICAL_TOMORROW;
    private static final SubLObject $const38$Yesterday_Indexical;
    private static final SubLSymbol $sym39$INDEXICAL_YESTERDAY;
    private static final SubLObject $const40$SecondsSince1970_Indexical;
    private static final SubLSymbol $sym41$INDEXICAL_SECONDS_SINCE_1970;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 1227L)
    public static SubLObject register_indexical_referent_expansion(final SubLObject indexical, final SubLObject method) {
        removal_modules_indexical_referent.$indexical_referent_expansions$.setGlobalValue(list_utilities.alist_enter(removal_modules_indexical_referent.$indexical_referent_expansions$.getGlobalValue(), indexical, method, Symbols.symbol_function((SubLObject)removal_modules_indexical_referent.EQUAL)));
        return (SubLObject)removal_modules_indexical_referent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 1431L)
    public static SubLObject cyc_indexical_referent(final SubLObject indexical) {
        if (removal_modules_indexical_referent.NIL == indexical_referent_term_p(indexical)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject referent = indexical_referent_expand(indexical);
        if (removal_modules_indexical_referent.NIL == referent) {
            relation_evaluation.throw_unevaluatable();
        }
        return referent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 2198L)
    public static SubLObject indexical_referent_term_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(list_utilities.alist_lookup(removal_modules_indexical_referent.$indexical_referent_expansions$.getGlobalValue(), v_object, Symbols.symbol_function((SubLObject)removal_modules_indexical_referent.EQUAL), (SubLObject)removal_modules_indexical_referent.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 2460L)
    public static SubLObject indexical_referent_expand(final SubLObject v_term) {
        final SubLObject method = list_utilities.alist_lookup(removal_modules_indexical_referent.$indexical_referent_expansions$.getGlobalValue(), v_term, Symbols.symbol_function((SubLObject)removal_modules_indexical_referent.EQUAL), (SubLObject)removal_modules_indexical_referent.UNPROVIDED);
        if (removal_modules_indexical_referent.NIL != subl_promotions.function_symbol_p(method)) {
            return Functions.funcall(method);
        }
        return (SubLObject)removal_modules_indexical_referent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 2659L)
    public static SubLObject temporal_indexical_expand(final SubLObject indexical) {
        return indexical_referent_expand(indexical);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 3395L)
    public static SubLObject indexical_query_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt;
        SubLObject genl_mt;
        for (mt = mt_relevance_macros.$mt$.getDynamicValue(thread); removal_modules_indexical_referent.NIL != hlmt.hlmt_p(mt) && removal_modules_indexical_referent.NIL != isa.isa_in_any_mtP(mt, removal_modules_indexical_referent.$const5$HypotheticalContext); genl_mt = (mt = kb_mapping_utilities.fpred_value_in_any_mt(mt, removal_modules_indexical_referent.$const6$termDependsOn, (SubLObject)removal_modules_indexical_referent.UNPROVIDED, (SubLObject)removal_modules_indexical_referent.UNPROVIDED, (SubLObject)removal_modules_indexical_referent.UNPROVIDED))) {}
        if (removal_modules_indexical_referent.NIL != hlmt.hlmt_p(mt)) {
            return mt;
        }
        return (SubLObject)removal_modules_indexical_referent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 4081L)
    public static SubLObject indexical_hypothesis_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        mt = highest_hypothetical_dependent_genl_mt(mt);
        if (removal_modules_indexical_referent.NIL != hlmt.hlmt_p(mt)) {
            return mt;
        }
        return (SubLObject)removal_modules_indexical_referent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 4301L)
    public static SubLObject highest_hypothetical_dependent_genl_mt(SubLObject mt) {
        while (removal_modules_indexical_referent.NIL != hlmt.hlmt_p(mt) && removal_modules_indexical_referent.NIL != isa.isa_in_any_mtP(mt, removal_modules_indexical_referent.$const5$HypotheticalContext)) {
            final SubLObject genl_mt = kb_mapping_utilities.fpred_value_in_any_mt(mt, removal_modules_indexical_referent.$const6$termDependsOn, (SubLObject)removal_modules_indexical_referent.UNPROVIDED, (SubLObject)removal_modules_indexical_referent.UNPROVIDED, (SubLObject)removal_modules_indexical_referent.UNPROVIDED);
            if (removal_modules_indexical_referent.NIL == isa.isa_in_any_mtP(genl_mt, removal_modules_indexical_referent.$const5$HypotheticalContext)) {
                return mt;
            }
            mt = genl_mt;
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 4800L)
    public static SubLObject indexical_hypothesis_monad_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        mt = highest_hypothetical_dependent_genl_mt(mt);
        if (removal_modules_indexical_referent.NIL != hlmt.hlmt_p(mt)) {
            return hlmt.hlmt_monad_mt(mt);
        }
        return (SubLObject)removal_modules_indexical_referent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 5149L)
    public static SubLObject indexical_the_user() {
        return operation_communication.the_cyclist();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 5322L)
    public static SubLObject indexical_the_purpose() {
        SubLObject purpose = fi.ke_purpose();
        if (removal_modules_indexical_referent.NIL == purpose) {
            purpose = removal_modules_indexical_referent.$const15$GeneralCycKE;
        }
        return purpose;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 5732L)
    public static SubLObject clear_indexical_the_cyc_process_owner() {
        final SubLObject cs = removal_modules_indexical_referent.$indexical_the_cyc_process_owner_caching_state$.getGlobalValue();
        if (removal_modules_indexical_referent.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)removal_modules_indexical_referent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 5732L)
    public static SubLObject remove_indexical_the_cyc_process_owner() {
        return memoization_state.caching_state_remove_function_results_with_args(removal_modules_indexical_referent.$indexical_the_cyc_process_owner_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(removal_modules_indexical_referent.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)removal_modules_indexical_referent.UNPROVIDED, (SubLObject)removal_modules_indexical_referent.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 5732L)
    public static SubLObject indexical_the_cyc_process_owner_internal() {
        return kb_accessors.guess_the_cyclist_from_user_name((SubLObject)removal_modules_indexical_referent.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 5732L)
    public static SubLObject indexical_the_cyc_process_owner() {
        SubLObject caching_state = removal_modules_indexical_referent.$indexical_the_cyc_process_owner_caching_state$.getGlobalValue();
        if (removal_modules_indexical_referent.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)removal_modules_indexical_referent.$sym18$INDEXICAL_THE_CYC_PROCESS_OWNER, (SubLObject)removal_modules_indexical_referent.$sym19$_INDEXICAL_THE_CYC_PROCESS_OWNER_CACHING_STATE_, (SubLObject)removal_modules_indexical_referent.NIL, (SubLObject)removal_modules_indexical_referent.EQL, (SubLObject)removal_modules_indexical_referent.ZERO_INTEGER, (SubLObject)removal_modules_indexical_referent.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)removal_modules_indexical_referent.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(indexical_the_cyc_process_owner_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)removal_modules_indexical_referent.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 6075L)
    public static SubLObject indexical_the_current_kb_number() {
        return operation_communication.kb_version_string();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 6401L)
    public static SubLObject indexical_the_current_system_number() {
        return system_info.cyc_revision_string();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 6725L)
    public static SubLObject indexical_the_current_host_name() {
        return Environment.get_machine_name((SubLObject)removal_modules_indexical_referent.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 6899L)
    public static SubLObject indexical_this_inference() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (removal_modules_indexical_referent.NIL != inference) {
            return removal_modules_inference_reflection.cycl_inference_decode(inference);
        }
        return (SubLObject)removal_modules_indexical_referent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 7209L)
    public static SubLObject indexical_this_problem_store() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (removal_modules_indexical_referent.NIL != inference) {
            final SubLObject problem_store = inference_datastructures_inference.inference_problem_store(inference);
            return removal_modules_inference_reflection.cycl_problem_store_decode(problem_store);
        }
        return (SubLObject)removal_modules_indexical_referent.NIL;
    }
    
    public static SubLObject declare_removal_modules_indexical_referent_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "register_indexical_referent_expansion", "REGISTER-INDEXICAL-REFERENT-EXPANSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "cyc_indexical_referent", "CYC-INDEXICAL-REFERENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_referent_term_p", "INDEXICAL-REFERENT-TERM-P", 1, 0, false);
        new $indexical_referent_term_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_referent_expand", "INDEXICAL-REFERENT-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "temporal_indexical_expand", "TEMPORAL-INDEXICAL-EXPAND", 1, 0, false);
        new $temporal_indexical_expand$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_query_mt", "INDEXICAL-QUERY-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_hypothesis_mt", "INDEXICAL-HYPOTHESIS-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "highest_hypothetical_dependent_genl_mt", "HIGHEST-HYPOTHETICAL-DEPENDENT-GENL-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_hypothesis_monad_mt", "INDEXICAL-HYPOTHESIS-MONAD-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_the_user", "INDEXICAL-THE-USER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_the_purpose", "INDEXICAL-THE-PURPOSE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "clear_indexical_the_cyc_process_owner", "CLEAR-INDEXICAL-THE-CYC-PROCESS-OWNER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "remove_indexical_the_cyc_process_owner", "REMOVE-INDEXICAL-THE-CYC-PROCESS-OWNER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_the_cyc_process_owner_internal", "INDEXICAL-THE-CYC-PROCESS-OWNER-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_the_cyc_process_owner", "INDEXICAL-THE-CYC-PROCESS-OWNER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_the_current_kb_number", "INDEXICAL-THE-CURRENT-KB-NUMBER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_the_current_system_number", "INDEXICAL-THE-CURRENT-SYSTEM-NUMBER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_the_current_host_name", "INDEXICAL-THE-CURRENT-HOST-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_this_inference", "INDEXICAL-THIS-INFERENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent", "indexical_this_problem_store", "INDEXICAL-THIS-PROBLEM-STORE", 0, 0, false);
        return (SubLObject)removal_modules_indexical_referent.NIL;
    }
    
    public static SubLObject init_removal_modules_indexical_referent_file() {
        removal_modules_indexical_referent.$indexical_referent_expansions$ = SubLFiles.deflexical("*INDEXICAL-REFERENT-EXPANSIONS*", (SubLObject)removal_modules_indexical_referent.NIL);
        removal_modules_indexical_referent.$default_indexical_referent_cost$ = SubLFiles.defparameter("*DEFAULT-INDEXICAL-REFERENT-COST*", (SubLObject)removal_modules_indexical_referent.ONE_INTEGER);
        removal_modules_indexical_referent.$indexical_the_cyc_process_owner_caching_state$ = SubLFiles.deflexical("*INDEXICAL-THE-CYC-PROCESS-OWNER-CACHING-STATE*", (SubLObject)removal_modules_indexical_referent.NIL);
        return (SubLObject)removal_modules_indexical_referent.NIL;
    }
    
    public static SubLObject setup_removal_modules_indexical_referent_file() {
        utilities_macros.register_kb_function((SubLObject)removal_modules_indexical_referent.$sym0$CYC_INDEXICAL_REFERENT);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_indexical_referent.$const1$indexicalReferent);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_indexical_referent.$kw2$POS, removal_modules_indexical_referent.$const1$indexicalReferent, (SubLObject)removal_modules_indexical_referent.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_indexical_referent.$kw3$REMOVAL_INDEXICAL_REFERENT_POS, (SubLObject)removal_modules_indexical_referent.$list4);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const7$QueryMt, (SubLObject)removal_modules_indexical_referent.$sym8$INDEXICAL_QUERY_MT);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const9$HypothesisMt, (SubLObject)removal_modules_indexical_referent.$sym10$INDEXICAL_HYPOTHESIS_MT);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const11$HypothesisMonadMt, (SubLObject)removal_modules_indexical_referent.$sym12$INDEXICAL_HYPOTHESIS_MONAD_MT);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const13$TheUser, (SubLObject)removal_modules_indexical_referent.$sym14$INDEXICAL_THE_USER);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const16$ThePurpose, (SubLObject)removal_modules_indexical_referent.$sym17$INDEXICAL_THE_PURPOSE);
        memoization_state.note_globally_cached_function((SubLObject)removal_modules_indexical_referent.$sym18$INDEXICAL_THE_CYC_PROCESS_OWNER);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const20$TheCycProcessOwner, (SubLObject)removal_modules_indexical_referent.$sym18$INDEXICAL_THE_CYC_PROCESS_OWNER);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const21$TheCurrentKBNumber, (SubLObject)removal_modules_indexical_referent.$sym22$INDEXICAL_THE_CURRENT_KB_NUMBER);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const23$TheCurrentSystemNumber, (SubLObject)removal_modules_indexical_referent.$sym24$INDEXICAL_THE_CURRENT_SYSTEM_NUMBER);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const25$TheCurrentHostName, (SubLObject)removal_modules_indexical_referent.$sym26$INDEXICAL_THE_CURRENT_HOST_NAME);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const27$ThisInference, (SubLObject)removal_modules_indexical_referent.$sym28$INDEXICAL_THIS_INFERENCE);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const29$ThisProblemStore, (SubLObject)removal_modules_indexical_referent.$sym30$INDEXICAL_THIS_PROBLEM_STORE);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const31$Now, (SubLObject)removal_modules_indexical_referent.$sym32$INDEXICAL_NOW);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const33$Now_Indexical, (SubLObject)removal_modules_indexical_referent.$sym32$INDEXICAL_NOW);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const34$Today_Indexical, (SubLObject)removal_modules_indexical_referent.$sym35$INDEXICAL_TODAY);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const36$Tomorrow_Indexical, (SubLObject)removal_modules_indexical_referent.$sym37$INDEXICAL_TOMORROW);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const38$Yesterday_Indexical, (SubLObject)removal_modules_indexical_referent.$sym39$INDEXICAL_YESTERDAY);
        register_indexical_referent_expansion(removal_modules_indexical_referent.$const40$SecondsSince1970_Indexical, (SubLObject)removal_modules_indexical_referent.$sym41$INDEXICAL_SECONDS_SINCE_1970);
        return (SubLObject)removal_modules_indexical_referent.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_indexical_referent_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_indexical_referent_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_indexical_referent_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_indexical_referent();
        removal_modules_indexical_referent.$indexical_referent_expansions$ = null;
        removal_modules_indexical_referent.$default_indexical_referent_cost$ = null;
        removal_modules_indexical_referent.$indexical_the_cyc_process_owner_caching_state$ = null;
        $sym0$CYC_INDEXICAL_REFERENT = SubLObjectFactory.makeSymbol("CYC-INDEXICAL-REFERENT");
        $const1$indexicalReferent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent"));
        $kw2$POS = SubLObjectFactory.makeKeyword("POS");
        $kw3$REMOVAL_INDEXICAL_REFERENT_POS = SubLObjectFactory.makeKeyword("REMOVAL-INDEXICAL-REFERENT-POS");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL-REFERENT-TERM-P"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-INDEXICAL-REFERENT-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL-REFERENT-EXPAND"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")) });
        $const5$HypotheticalContext = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypotheticalContext"));
        $const6$termDependsOn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termDependsOn"));
        $const7$QueryMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryMt"));
        $sym8$INDEXICAL_QUERY_MT = SubLObjectFactory.makeSymbol("INDEXICAL-QUERY-MT");
        $const9$HypothesisMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypothesisMt"));
        $sym10$INDEXICAL_HYPOTHESIS_MT = SubLObjectFactory.makeSymbol("INDEXICAL-HYPOTHESIS-MT");
        $const11$HypothesisMonadMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypothesisMonadMt"));
        $sym12$INDEXICAL_HYPOTHESIS_MONAD_MT = SubLObjectFactory.makeSymbol("INDEXICAL-HYPOTHESIS-MONAD-MT");
        $const13$TheUser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheUser"));
        $sym14$INDEXICAL_THE_USER = SubLObjectFactory.makeSymbol("INDEXICAL-THE-USER");
        $const15$GeneralCycKE = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralCycKE"));
        $const16$ThePurpose = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThePurpose"));
        $sym17$INDEXICAL_THE_PURPOSE = SubLObjectFactory.makeSymbol("INDEXICAL-THE-PURPOSE");
        $sym18$INDEXICAL_THE_CYC_PROCESS_OWNER = SubLObjectFactory.makeSymbol("INDEXICAL-THE-CYC-PROCESS-OWNER");
        $sym19$_INDEXICAL_THE_CYC_PROCESS_OWNER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*INDEXICAL-THE-CYC-PROCESS-OWNER-CACHING-STATE*");
        $const20$TheCycProcessOwner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCycProcessOwner"));
        $const21$TheCurrentKBNumber = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCurrentKBNumber"));
        $sym22$INDEXICAL_THE_CURRENT_KB_NUMBER = SubLObjectFactory.makeSymbol("INDEXICAL-THE-CURRENT-KB-NUMBER");
        $const23$TheCurrentSystemNumber = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCurrentSystemNumber"));
        $sym24$INDEXICAL_THE_CURRENT_SYSTEM_NUMBER = SubLObjectFactory.makeSymbol("INDEXICAL-THE-CURRENT-SYSTEM-NUMBER");
        $const25$TheCurrentHostName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCurrentHostName"));
        $sym26$INDEXICAL_THE_CURRENT_HOST_NAME = SubLObjectFactory.makeSymbol("INDEXICAL-THE-CURRENT-HOST-NAME");
        $const27$ThisInference = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThisInference"));
        $sym28$INDEXICAL_THIS_INFERENCE = SubLObjectFactory.makeSymbol("INDEXICAL-THIS-INFERENCE");
        $const29$ThisProblemStore = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThisProblemStore"));
        $sym30$INDEXICAL_THIS_PROBLEM_STORE = SubLObjectFactory.makeSymbol("INDEXICAL-THIS-PROBLEM-STORE");
        $const31$Now = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now"));
        $sym32$INDEXICAL_NOW = SubLObjectFactory.makeSymbol("INDEXICAL-NOW");
        $const33$Now_Indexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now-Indexical"));
        $const34$Today_Indexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Today-Indexical"));
        $sym35$INDEXICAL_TODAY = SubLObjectFactory.makeSymbol("INDEXICAL-TODAY");
        $const36$Tomorrow_Indexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Tomorrow-Indexical"));
        $sym37$INDEXICAL_TOMORROW = SubLObjectFactory.makeSymbol("INDEXICAL-TOMORROW");
        $const38$Yesterday_Indexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Yesterday-Indexical"));
        $sym39$INDEXICAL_YESTERDAY = SubLObjectFactory.makeSymbol("INDEXICAL-YESTERDAY");
        $const40$SecondsSince1970_Indexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondsSince1970-Indexical"));
        $sym41$INDEXICAL_SECONDS_SINCE_1970 = SubLObjectFactory.makeSymbol("INDEXICAL-SECONDS-SINCE-1970");
    }
    
    public static final class $indexical_referent_term_p$UnaryFunction extends UnaryFunction
    {
        public $indexical_referent_term_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INDEXICAL-REFERENT-TERM-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_indexical_referent.indexical_referent_term_p(arg1);
        }
    }
    
    public static final class $temporal_indexical_expand$UnaryFunction extends UnaryFunction
    {
        public $temporal_indexical_expand$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TEMPORAL-INDEXICAL-EXPAND"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_indexical_referent.temporal_indexical_expand(arg1);
        }
    }
}

/*

	Total time: 102 ms
	
*/