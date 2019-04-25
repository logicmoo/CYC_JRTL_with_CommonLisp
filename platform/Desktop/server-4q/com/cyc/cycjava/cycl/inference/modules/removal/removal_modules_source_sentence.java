package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_source_sentence extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_sentence";
    public static final String myFingerPrint = "d1d990d34b4d5902ba6d51b765f0af2938c0d6ce38cf598b342384f760f86471";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 802L)
    private static SubLSymbol $default_source_sentence_check_cost$;
    private static final SubLObject $const0$sourceSentence;
    private static final SubLSymbol $kw1$REMOVAL_SOURCE_SENTENCE_LOOKUP_POS;
    private static final SubLList $list2;
    private static final SubLObject $const3$TheCurrentCycKB;
    private static final SubLSymbol $kw4$POS;
    private static final SubLSymbol $kw5$STRICT;
    private static final SubLSymbol $kw6$RETURN;
    private static final SubLSymbol $kw7$BINDINGS_AND_SUPPORTS;
    private static final SubLSymbol $kw8$ALLOWED_MODULES;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$REMOVAL_SOURCE_SENTENCE_CHECK_NEG;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$OPAQUE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 1758L)
    public static SubLObject removal_source_sentence_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_source_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_source_sentence.NIL;
        }
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_source_sentence.UNPROVIDED);
        final SubLObject subsentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_source_sentence.UNPROVIDED);
        return removal_source_sentence_lookup_pos_cost_int(source, subsentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 2026L)
    public static SubLObject removal_source_sentence_lookup_pos_cost_int(SubLObject source, final SubLObject sentence) {
        if (removal_modules_source_sentence.NIL != variables.fully_bound_p(sentence)) {
            return removal_modules_source_sentence.$default_source_sentence_check_cost$.getGlobalValue();
        }
        if (removal_modules_source_sentence.NIL != el_utilities.atomic_sentenceP(sentence)) {
            if (source.eql(removal_modules_source_sentence.$const3$TheCurrentCycKB)) {
                return inference_utilities.literal_removal_cost(sentence, (SubLObject)removal_modules_source_sentence.$kw4$POS, (SubLObject)removal_modules_source_sentence.UNPROVIDED, (SubLObject)removal_modules_source_sentence.UNPROVIDED);
            }
            return sksi_query_utilities.sksi_sentence_cost(sentence, (SubLObject)removal_modules_source_sentence.$kw4$POS, source);
        }
        else {
            if (removal_modules_source_sentence.NIL == el_utilities.el_conjunction_p(sentence)) {
                return (SubLObject)removal_modules_source_sentence.NIL;
            }
            if (source.eql(removal_modules_source_sentence.$const3$TheCurrentCycKB)) {
                return removal_modules_kb_sentence.removal_kb_sentence_lookup_pos_conjunction_cost(sentence);
            }
            final SubLObject mt = inference_datastructures_inference.inference_mt(inference_macros.current_controlling_inference());
            final SubLObject contextualized_dnf_clause = inference_czer.inference_canonicalize_ask_memoized(sentence, mt, (SubLObject)removal_modules_source_sentence.NIL).first();
            final SubLObject cost = sksi_conjunctive_removal_modules_cost.sksi_query_cost_contextualized_dnf(contextualized_dnf_clause, source);
            return cost;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 2924L)
    public static SubLObject removal_source_sentence_lookup_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_source_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_source_sentence.NIL;
        }
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_source_sentence.UNPROVIDED);
        final SubLObject subsentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_source_sentence.UNPROVIDED);
        final SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
        if (source.eql(removal_modules_source_sentence.$const3$TheCurrentCycKB)) {
            return removal_modules_kb_sentence.removal_kb_sentence_lookup_pos_expand_subsentence(subsentence, mt, sense);
        }
        return removal_source_sentence_lookup_pos_expand_int(source, subsentence, mt, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 3476L)
    public static SubLObject removal_source_sentence_lookup_pos_expand_int(final SubLObject sks, final SubLObject subsentence, final SubLObject mt, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject allowed_modules_list = sksi_infrastructure_utilities.sks_to_allowed_modules_list(sks);
        final SubLObject _prev_bind_0 = sksi_macros.$sksi_default_ms_type_check_strength$.currentBinding(thread);
        try {
            sksi_macros.$sksi_default_ms_type_check_strength$.bind((SubLObject)removal_modules_source_sentence.$kw5$STRICT, thread);
            SubLObject cdolist_list_var;
            final SubLObject result = cdolist_list_var = ask_utilities.inference_recursive_query(subsentence, mt, (SubLObject)ConsesLow.list((SubLObject)removal_modules_source_sentence.$kw6$RETURN, (SubLObject)removal_modules_source_sentence.$kw7$BINDINGS_AND_SUPPORTS, (SubLObject)removal_modules_source_sentence.$kw8$ALLOWED_MODULES, allowed_modules_list));
            SubLObject bindings_and_supports = (SubLObject)removal_modules_source_sentence.NIL;
            bindings_and_supports = cdolist_list_var.first();
            while (removal_modules_source_sentence.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = bindings_and_supports;
                SubLObject v_bindings = (SubLObject)removal_modules_source_sentence.NIL;
                SubLObject supports = (SubLObject)removal_modules_source_sentence.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_source_sentence.$list9);
                v_bindings = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_source_sentence.$list9);
                supports = current.first();
                current = current.rest();
                if (removal_modules_source_sentence.NIL == current) {
                    backward.removal_add_node(supports.first(), v_bindings, supports.rest());
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_source_sentence.$list9);
                }
                cdolist_list_var = cdolist_list_var.rest();
                bindings_and_supports = cdolist_list_var.first();
            }
        }
        finally {
            sksi_macros.$sksi_default_ms_type_check_strength$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)removal_modules_source_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 4778L)
    public static SubLObject removal_source_sentence_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_source_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_source_sentence.NIL;
        }
        return removal_modules_source_sentence.$default_source_sentence_check_cost$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 4928L)
    public static SubLObject removal_source_sentence_lookup_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_source_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_source_sentence.NIL;
        }
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_source_sentence.UNPROVIDED);
        final SubLObject subsentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_source_sentence.UNPROVIDED);
        final SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
        if (source.eql(removal_modules_source_sentence.$const3$TheCurrentCycKB)) {
            return removal_modules_kb_sentence.removal_kb_sentence_check_neg_expand_subsentence(subsentence, mt, sense);
        }
        return removal_source_sentence_lookup_neg_expand_int(source, subsentence, mt, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 5479L)
    public static SubLObject removal_source_sentence_lookup_neg_expand_int(final SubLObject sks, final SubLObject subsentence, final SubLObject mt, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject allowed_modules_list = sksi_infrastructure_utilities.sks_to_allowed_modules_list(sks);
        final SubLObject _prev_bind_0 = sksi_macros.$sksi_default_ms_type_check_strength$.currentBinding(thread);
        try {
            sksi_macros.$sksi_default_ms_type_check_strength$.bind((SubLObject)removal_modules_source_sentence.$kw5$STRICT, thread);
            final SubLObject result = ask_utilities.inference_recursive_query(subsentence, mt, (SubLObject)ConsesLow.list((SubLObject)removal_modules_source_sentence.$kw8$ALLOWED_MODULES, allowed_modules_list));
            if (removal_modules_source_sentence.NIL == result) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_source_sentence.$kw12$OPAQUE, el_utilities.make_negation(subsentence), mt, (SubLObject)removal_modules_source_sentence.UNPROVIDED), (SubLObject)removal_modules_source_sentence.UNPROVIDED, (SubLObject)removal_modules_source_sentence.UNPROVIDED);
            }
        }
        finally {
            sksi_macros.$sksi_default_ms_type_check_strength$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)removal_modules_source_sentence.NIL;
    }
    
    public static SubLObject declare_removal_modules_source_sentence_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_sentence", "removal_source_sentence_lookup_pos_cost", "REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_sentence", "removal_source_sentence_lookup_pos_cost_int", "REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-COST-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_sentence", "removal_source_sentence_lookup_pos_expand", "REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_sentence", "removal_source_sentence_lookup_pos_expand_int", "REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-EXPAND-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_sentence", "removal_source_sentence_lookup_neg_cost", "REMOVAL-SOURCE-SENTENCE-LOOKUP-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_sentence", "removal_source_sentence_lookup_neg_expand", "REMOVAL-SOURCE-SENTENCE-LOOKUP-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_sentence", "removal_source_sentence_lookup_neg_expand_int", "REMOVAL-SOURCE-SENTENCE-LOOKUP-NEG-EXPAND-INT", 4, 0, false);
        return (SubLObject)removal_modules_source_sentence.NIL;
    }
    
    public static SubLObject init_removal_modules_source_sentence_file() {
        removal_modules_source_sentence.$default_source_sentence_check_cost$ = SubLFiles.deflexical("*DEFAULT-SOURCE-SENTENCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        return (SubLObject)removal_modules_source_sentence.NIL;
    }
    
    public static SubLObject setup_removal_modules_source_sentence_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_source_sentence.$const0$sourceSentence);
        inference_modules.inference_removal_module((SubLObject)removal_modules_source_sentence.$kw1$REMOVAL_SOURCE_SENTENCE_LOOKUP_POS, (SubLObject)removal_modules_source_sentence.$list2);
        inference_modules.inference_removal_module((SubLObject)removal_modules_source_sentence.$kw10$REMOVAL_SOURCE_SENTENCE_CHECK_NEG, (SubLObject)removal_modules_source_sentence.$list11);
        return (SubLObject)removal_modules_source_sentence.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_source_sentence_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_source_sentence_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_source_sentence_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_source_sentence();
        removal_modules_source_sentence.$default_source_sentence_check_cost$ = null;
        $const0$sourceSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceSentence"));
        $kw1$REMOVAL_SOURCE_SENTENCE_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-SOURCE-SENTENCE-LOOKUP-POS");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sourceSentence <SOURCE> \n                      (:or\n                        (:fully-bound . :fully-bound)\n                        ((:test inference-predicate-p) . :anything)\n                        (#$and . :anything)\n                      ))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$sourceSentence #$NWS-KS (#$weather #$CityOfLosAngelesCA ?WHAT))") });
        $const3$TheCurrentCycKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCurrentCycKB"));
        $kw4$POS = SubLObjectFactory.makeKeyword("POS");
        $kw5$STRICT = SubLObjectFactory.makeKeyword("STRICT");
        $kw6$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw7$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $kw8$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $kw10$REMOVAL_SOURCE_SENTENCE_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-SOURCE-SENTENCE-CHECK-NEG");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-SOURCE-SENTENCE-LOOKUP-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SOURCE-SENTENCE-LOOKUP-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$sourceSentence <fully-bound> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$sourceSentence #$NWS-KS (#$weather #$CityOfLosAngelesCA #$Snowy)))") });
        $kw12$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
    }
}

/*

	Total time: 95 ms
	
*/