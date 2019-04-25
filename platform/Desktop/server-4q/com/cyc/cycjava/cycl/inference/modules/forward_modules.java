package com.cyc.cycjava.cycl.inference.modules;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.pragma_induction;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class forward_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.forward_modules";
    public static final String myFingerPrint = "dd3a325d8a9a7a7e20b036b53ac8460ee5b0329bf7869144464dec69d553dc94";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 740L)
    private static SubLSymbol $forward_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 2023L)
    private static SubLSymbol $forward_tactic_specs$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 2229L)
    private static SubLSymbol $prevent_forward_triggering_via_evaluatable_predicate_antecedent_literalsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15705L)
    private static SubLSymbol $cached_all_specs_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25649L)
    private static SubLSymbol $cached_all_genl_mts_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27751L)
    private static SubLSymbol $cached_all_spec_mts_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39332L)
    private static SubLSymbol $cached_all_genl_preds_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39491L)
    private static SubLSymbol $cached_all_genl_inverses_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55612L)
    private static SubLSymbol $cached_all_negation_preds_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58221L)
    private static SubLSymbol $cached_all_negation_inverses_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 64490L)
    public static SubLSymbol $gaf_predicate_forward_inference_enabledP$;
    private static final SubLSymbol $kw0$FORWARD;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw4$DONE;
    private static final SubLSymbol $sym5$DO_LIST;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$DO_FORWARD_MODULES_LIST;
    private static final SubLSymbol $sym8$DO_FORWARD_MODULES;
    private static final SubLSymbol $kw9$QUERY;
    private static final SubLSymbol $sym10$TMS_ASSERTION_BEING_REMOVED_;
    private static final SubLSymbol $sym11$FORWARD_TACTIC_SPEC_RULE;
    private static final SubLSymbol $sym12$FORWARD_TACTIC_SPEC_;
    private static final SubLSymbol $sym13$KBEQ;
    private static final SubLSymbol $kw14$ALL;
    private static final SubLSymbol $kw15$FORWARD_TACTIC_SPECS;
    private static final SubLSymbol $kw16$NO_RULE;
    private static final SubLSymbol $kw17$NEG;
    private static final SubLSymbol $kw18$RULE;
    private static final SubLSymbol $kw19$POS;
    private static final SubLSymbol $kw20$FORWARD_NORMAL_POS;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$FORWARD_NORMAL_NEG;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$FORWARD_ISA;
    private static final SubLList $list25;
    private static final SubLObject $const26$isa;
    private static final SubLSymbol $kw27$GENLS;
    private static final SubLObject $const28$genls;
    private static final SubLSymbol $sym29$FORWARD_INFERENCE_ALL_GENLS;
    private static final SubLSymbol $kw30$FORWARD_NOT_ISA;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$CACHED_ALL_SPECS;
    private static final SubLSymbol $sym33$_CACHED_ALL_SPECS_CACHING_STATE_;
    private static final SubLInteger $int34$64;
    private static final SubLSymbol $sym35$CLEAR_CACHED_ALL_SPECS;
    private static final SubLSymbol $kw36$FORWARD_QUOTED_ISA;
    private static final SubLList $list37;
    private static final SubLObject $const38$quotedIsa;
    private static final SubLSymbol $kw39$FORWARD_NOT_QUOTED_ISA;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$FORWARD_GENLS;
    private static final SubLList $list42;
    private static final SubLSymbol $kw43$FORWARD_NOT_GENLS;
    private static final SubLList $list44;
    private static final SubLSymbol $kw45$FORWARD_GENLMT;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$CACHED_ALL_GENL_MTS;
    private static final SubLSymbol $sym48$_CACHED_ALL_GENL_MTS_CACHING_STATE_;
    private static final SubLSymbol $sym49$CLEAR_CACHED_ALL_GENL_MTS;
    private static final SubLObject $const50$genlMt;
    private static final SubLSymbol $kw51$GENLMT;
    private static final SubLSymbol $kw52$FORWARD_NOT_GENLMT;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$CACHED_ALL_SPEC_MTS;
    private static final SubLSymbol $sym55$_CACHED_ALL_SPEC_MTS_CACHING_STATE_;
    private static final SubLSymbol $sym56$CLEAR_CACHED_ALL_SPEC_MTS;
    private static final SubLSymbol $kw57$FORWARD_SYMMETRIC_POS;
    private static final SubLList $list58;
    private static final SubLSymbol $kw59$ISA;
    private static final SubLList $list60;
    private static final SubLSymbol $kw61$FORWARD_SYMMETRIC_NEG;
    private static final SubLList $list62;
    private static final SubLSymbol $kw63$FORWARD_ASYMMETRIC;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $kw67$FORWARD_COMMUTATIVE_POS;
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLList $list70;
    private static final SubLSymbol $kw71$FORWARD_COMMUTATIVE_NEG;
    private static final SubLList $list72;
    private static final SubLSymbol $kw73$FORWARD_GENLPREDS_GAF;
    private static final SubLList $list74;
    private static final SubLObject $const75$genlPreds;
    private static final SubLObject $const76$genlInverse;
    private static final SubLSymbol $sym77$CACHED_ALL_GENL_PREDS;
    private static final SubLSymbol $sym78$_CACHED_ALL_GENL_PREDS_CACHING_STATE_;
    private static final SubLSymbol $sym79$CLEAR_CACHED_ALL_GENL_PREDS;
    private static final SubLSymbol $sym80$CACHED_ALL_GENL_INVERSES;
    private static final SubLSymbol $sym81$_CACHED_ALL_GENL_INVERSES_CACHING_STATE_;
    private static final SubLSymbol $sym82$CLEAR_CACHED_ALL_GENL_INVERSES;
    private static final SubLSymbol $kw83$GENLPREDS;
    private static final SubLSymbol $kw84$FORWARD_NOT_GENLPREDS_GAF;
    private static final SubLList $list85;
    private static final SubLSymbol $kw86$FORWARD_GENLPREDS_POS;
    private static final SubLList $list87;
    private static final SubLSymbol $kw88$FORWARD_GENLINVERSE_GAF;
    private static final SubLList $list89;
    private static final SubLSymbol $kw90$FORWARD_NOT_GENLINVERSE_GAF;
    private static final SubLList $list91;
    private static final SubLSymbol $kw92$FORWARD_GENLINVERSE_POS;
    private static final SubLList $list93;
    private static final SubLSymbol $kw94$FORWARD_NEGATIONPREDS;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$CACHED_ALL_NEGATION_PREDS;
    private static final SubLSymbol $sym97$_CACHED_ALL_NEGATION_PREDS_CACHING_STATE_;
    private static final SubLSymbol $sym98$CLEAR_CACHED_ALL_NEGATION_PREDS;
    private static final SubLList $list99;
    private static final SubLSymbol $kw100$NEGATIONPREDS;
    private static final SubLObject $const101$negationPreds;
    private static final SubLSymbol $kw102$FORWARD_NEGATIONINVERSE;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$CACHED_ALL_NEGATION_INVERSES;
    private static final SubLSymbol $sym105$_CACHED_ALL_NEGATION_INVERSES_CACHING_STATE_;
    private static final SubLSymbol $sym106$CLEAR_CACHED_ALL_NEGATION_INVERSES;
    private static final SubLList $list107;
    private static final SubLObject $const108$negationInverse;
    private static final SubLSymbol $kw109$FORWARD_EVAL_POS;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLSymbol $kw112$FORWARD_EVAL_NEG;
    private static final SubLList $list113;
    private static final SubLSymbol $kw114$FORWARD_TERM_OF_UNIT;
    private static final SubLList $list115;
    private static final SubLObject $const116$termOfUnit;
    private static final SubLSymbol $kw117$FORWARD_NAT_FUNCTION;
    private static final SubLList $list118;
    private static final SubLObject $const119$natFunction;
    private static final SubLSymbol $kw120$FORWARD_GAF_PREDICATE;
    private static final SubLList $list121;
    private static final SubLObject $const122$gafPredicate;
    private static final SubLSymbol $kw123$GAF;
    private static final SubLSymbol $kw124$TRUE_MON;
    private static final SubLSymbol $kw125$FORWARD_UNBOUND_PRED_POS;
    private static final SubLList $list126;
    private static final SubLSymbol $kw127$FORWARD_UNBOUND_PRED_NEG;
    private static final SubLList $list128;
    private static final SubLSymbol $kw129$FORWARD_ASSERTIVE_WFF_UNBOUND_PRED_POS;
    private static final SubLList $list130;
    private static final SubLSymbol $kw131$FORWARD_IST_POS;
    private static final SubLList $list132;
    private static final SubLObject $const133$BaseKB;
    private static final SubLSymbol $kw134$FORWARD_IST_NEG;
    private static final SubLList $list135;
    private static final SubLObject $const136$ist;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 951L)
    public static SubLObject forward_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.copy_list(forward_modules.$forward_modules$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1028L)
    public static SubLObject forward_module_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.length(forward_modules.$forward_modules$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1104L)
    public static SubLObject forward_module_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL != inference_modules.hl_module_p(v_object) && forward_modules.NIL != conses_high.member(v_object, forward_modules.$forward_modules$.getDynamicValue(thread), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1223L)
    public static SubLObject forward_module(final SubLObject name, final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item_var;
        final SubLObject hl_module = item_var = inference_modules.setup_module(name, (SubLObject)forward_modules.$kw0$FORWARD, plist);
        if (forward_modules.NIL == conses_high.member(item_var, forward_modules.$forward_modules$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)forward_modules.EQL), Symbols.symbol_function((SubLObject)forward_modules.IDENTITY))) {
            forward_modules.$forward_modules$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, forward_modules.$forward_modules$.getDynamicValue(thread)), thread);
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1448L)
    public static SubLObject undeclare_forward_module(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (forward_modules.NIL != hl_module) {
            inference_modules.remove_hl_module(hl_module);
            forward_modules.$forward_modules$.setDynamicValue(Sequences.delete(hl_module, forward_modules.$forward_modules$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)forward_modules.EQL), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED), thread);
            return hl_module;
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1749L)
    public static SubLObject do_forward_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forward_modules.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)forward_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forward_modules.$list1);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)forward_modules.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)forward_modules.NIL;
        SubLObject current_$1 = (SubLObject)forward_modules.NIL;
        while (forward_modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)forward_modules.$list1);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)forward_modules.$list1);
            if (forward_modules.NIL == conses_high.member(current_$1, (SubLObject)forward_modules.$list2, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)) {
                bad = (SubLObject)forward_modules.T;
            }
            if (current_$1 == forward_modules.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (forward_modules.NIL != bad && forward_modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)forward_modules.$list1);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)forward_modules.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((forward_modules.NIL != done_tail) ? conses_high.cadr(done_tail) : forward_modules.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)forward_modules.$sym5$DO_LIST, (SubLObject)ConsesLow.list(hl_module, (SubLObject)forward_modules.$list6, (SubLObject)forward_modules.$kw4$DONE, done), ConsesLow.append(body, (SubLObject)forward_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1917L)
    public static SubLObject do_forward_modules_list() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return forward_modules.$forward_modules$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 2331L)
    public static SubLObject forward_examine_asent_triggering_allowedP(final SubLObject examine_asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == el_utilities.default_forward_non_trigger_literal_litP(examine_asent) && (forward_modules.NIL == el_utilities.atomic_sentenceP(examine_asent) || forward_modules.NIL == relation_evaluation.evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(examine_asent), (SubLObject)forward_modules.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 2598L)
    public static SubLObject forward_module_callback(final SubLObject trigger_asent, final SubLObject trigger_sense, final SubLObject examine_asent, SubLObject trigger_support, final SubLObject rule, SubLObject trigger_supports) {
        if (trigger_supports == forward_modules.UNPROVIDED) {
            trigger_supports = (SubLObject)forward_modules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward_modules.NIL != backward.$force_query_supports_in_forward_inferenceP$.getDynamicValue(thread)) {
            if (forward_modules.NIL != forward.current_forward_inference_gaf()) {
                trigger_support = forward.current_forward_inference_gaf();
            }
            if (forward_modules.NIL != trigger_support) {
                trigger_support = arguments.make_hl_support((SubLObject)forward_modules.$kw9$QUERY, arguments.support_sentence(trigger_support), arguments.support_mt(trigger_support), arguments.support_tv(trigger_support));
                trigger_supports = (SubLObject)forward_modules.NIL;
            }
        }
        if (forward_modules.NIL != forward_examine_asent_triggering_allowedP(examine_asent)) {
            forward_modules.$forward_tactic_specs$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(trigger_asent, trigger_sense, examine_asent, trigger_support, rule, trigger_supports), forward_modules.$forward_tactic_specs$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 3310L)
    public static SubLObject forward_tactic_specs(final SubLObject source_asent, final SubLObject source_sense, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward_modules.NIL;
        if (forward_modules.NIL != forward.forward_inference_allowed_rules()) {
            final SubLObject _prev_bind_0 = forward_modules.$forward_tactic_specs$.currentBinding(thread);
            try {
                forward_modules.$forward_tactic_specs$.bind((SubLObject)forward_modules.NIL, thread);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(propagation_mt);
                final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject cdolist_list_var = forward_hl_modules(source_asent, source_sense);
                    SubLObject forward_hl_module = (SubLObject)forward_modules.NIL;
                    forward_hl_module = cdolist_list_var.first();
                    while (forward_modules.NIL != cdolist_list_var) {
                        forward_hl_module_apply(forward_hl_module, source_asent);
                        cdolist_list_var = cdolist_list_var.rest();
                        forward_hl_module = cdolist_list_var.first();
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$2, thread);
                }
                result = list_utilities.fast_delete_duplicates(forward_modules.$forward_tactic_specs$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)forward_modules.EQUAL), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != tms.tms_any_assertion_being_removedP()) {
                    result = Sequences.remove_if((SubLObject)forward_modules.$sym10$TMS_ASSERTION_BEING_REMOVED_, result, (SubLObject)forward_modules.$sym11$FORWARD_TACTIC_SPEC_RULE, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
                }
            }
            finally {
                forward_modules.$forward_tactic_specs$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var2 = wff.assertive_wff_rules();
        SubLObject assertive_wff_rule = (SubLObject)forward_modules.NIL;
        assertive_wff_rule = cdolist_list_var2.first();
        while (forward_modules.NIL != cdolist_list_var2) {
            final SubLObject possible_assertive_wff_rule_forward_tactic_spec = Sequences.find(assertive_wff_rule, result, (SubLObject)forward_modules.$sym13$KBEQ, (SubLObject)forward_modules.$sym11$FORWARD_TACTIC_SPEC_RULE, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
            if (forward_modules.NIL != possible_assertive_wff_rule_forward_tactic_spec) {
                result = list_utilities.nmove_to_front(possible_assertive_wff_rule_forward_tactic_spec, result, (SubLObject)forward_modules.EQUAL);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            assertive_wff_rule = cdolist_list_var2.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 4976L)
    public static SubLObject forward_tactic_spec_rule(final SubLObject forward_tactic_spec) {
        return conses_high.fifth(forward_tactic_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 5077L)
    public static SubLObject forward_tactic_specL(final SubLObject forward_tactic_spec_1, final SubLObject forward_tactic_spec_2) {
        final SubLObject forward_tactic_spec_1_rule = forward_tactic_spec_rule(forward_tactic_spec_1);
        final SubLObject forward_tactic_spec_1_assertive_wff_ruleP = wff.assertive_wff_ruleP(forward_tactic_spec_1_rule);
        final SubLObject forward_tactic_spec_2_rule = forward_tactic_spec_rule(forward_tactic_spec_2);
        final SubLObject forward_tactic_spec_2_assertive_wff_ruleP = wff.assertive_wff_ruleP(forward_tactic_spec_2_rule);
        if (forward_modules.NIL != forward_tactic_spec_1_assertive_wff_ruleP && forward_modules.NIL == forward_tactic_spec_2_assertive_wff_ruleP) {
            return (SubLObject)forward_modules.T;
        }
        if (forward_modules.NIL == forward_tactic_spec_1_assertive_wff_ruleP && forward_modules.NIL != forward_tactic_spec_2_assertive_wff_ruleP) {
            return (SubLObject)forward_modules.NIL;
        }
        return Numbers.numL(assertion_handles.assertion_id(forward_tactic_spec_1_rule), assertion_handles.assertion_id(forward_tactic_spec_2_rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 5900L)
    public static SubLObject forward_hl_modules(final SubLObject asent, final SubLObject sense) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject hl_modules = (SubLObject)forward_modules.NIL;
        SubLObject supplanted_modules = (SubLObject)forward_modules.NIL;
        SubLObject exclusive_foundP;
        SubLObject rest;
        SubLObject hl_module;
        SubLObject exclusive_func;
        SubLObject pcase_var;
        SubLObject supplants_info;
        SubLObject cdolist_list_var;
        SubLObject newly_supplanted_module_names;
        SubLObject supplanted_module_name;
        SubLObject supplanted_module;
        SubLObject required_func;
        for (exclusive_foundP = (SubLObject)forward_modules.NIL, rest = (SubLObject)forward_modules.NIL, rest = do_forward_modules_list(); forward_modules.NIL == exclusive_foundP && forward_modules.NIL != rest; rest = rest.rest()) {
            hl_module = rest.first();
            if (forward_modules.NIL != inference_modules.hl_module_activeP(hl_module, (SubLObject)forward_modules.NIL) && (forward_modules.NIL == supplanted_modules || forward_modules.NIL == conses_high.member(hl_module, supplanted_modules, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)) && forward_modules.NIL != inference_modules.hl_module_sense_relevant_p(hl_module, sense) && forward_modules.NIL != inference_modules.hl_module_predicate_relevant_p(hl_module, predicate) && forward_modules.NIL != inference_modules.hl_module_required_pattern_matched_p(hl_module, asent)) {
                exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                if (forward_modules.NIL == exclusive_func || forward_modules.NIL != Functions.funcall(exclusive_func, asent)) {
                    if (forward_modules.NIL != exclusive_func) {
                        supplants_info = (pcase_var = inference_modules.hl_module_supplants_info(hl_module));
                        if (pcase_var.eql((SubLObject)forward_modules.$kw14$ALL)) {
                            hl_modules = (SubLObject)forward_modules.NIL;
                            exclusive_foundP = (SubLObject)forward_modules.T;
                        }
                        else {
                            newly_supplanted_module_names = (cdolist_list_var = supplants_info);
                            supplanted_module_name = (SubLObject)forward_modules.NIL;
                            supplanted_module_name = cdolist_list_var.first();
                            while (forward_modules.NIL != cdolist_list_var) {
                                supplanted_module = inference_modules.find_hl_module_by_name(supplanted_module_name);
                                if (forward_modules.NIL != supplanted_module) {
                                    supplanted_modules = (SubLObject)ConsesLow.cons(supplanted_module, supplanted_modules);
                                    hl_modules = list_utilities.delete_first(supplanted_module, hl_modules, Symbols.symbol_function((SubLObject)forward_modules.EQL));
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                supplanted_module_name = cdolist_list_var.first();
                            }
                        }
                    }
                    required_func = inference_modules.hl_module_required_func(hl_module);
                    if (forward_modules.NIL == required_func || forward_modules.NIL != Functions.funcall(required_func, asent)) {
                        hl_modules = (SubLObject)ConsesLow.cons(hl_module, hl_modules);
                    }
                }
            }
        }
        return Sequences.nreverse(hl_modules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 7789L)
    public static SubLObject forward_hl_module_apply(final SubLObject forward_hl_module, final SubLObject source_asent) {
        final SubLObject candidate_rules = forward_hl_module_rule_select(forward_hl_module, source_asent);
        final SubLObject rules = (SubLObject)((forward_modules.NIL != candidate_rules) ? forward_hl_module_rule_filter(forward_hl_module, source_asent, candidate_rules) : forward_modules.NIL);
        return forward_hl_module_expand(forward_hl_module, source_asent, rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 8147L)
    public static SubLObject forward_inference_rule_select_via_allowed_rulesP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == forward.forward_inference_all_rules_allowedP() && forward.forward_inference_allowed_rules().isList());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 8375L)
    public static SubLObject forward_hl_module_rule_select(final SubLObject forward_hl_module, final SubLObject source_asent) {
        if (forward_modules.NIL != forward_inference_rule_select_via_allowed_rulesP()) {
            return forward.forward_inference_allowed_rules();
        }
        final SubLObject rule_select_method = inference_modules.hl_module_rule_select_func(forward_hl_module);
        return (SubLObject)(rule_select_method.isFunctionSpec() ? Functions.funcall(rule_select_method, source_asent) : forward_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 8819L)
    public static SubLObject forward_hl_module_rule_filter(final SubLObject forward_hl_module, final SubLObject source_asent, SubLObject rules) {
        if (forward_modules.NIL != forward_inference_rule_select_via_allowed_rulesP()) {
            final SubLObject rule_filter_method = inference_modules.hl_module_rule_filter_func(forward_hl_module);
            if (rule_filter_method.isFunctionSpec()) {
                SubLObject filtered_rules = (SubLObject)forward_modules.NIL;
                SubLObject cdolist_list_var = rules;
                SubLObject rule = (SubLObject)forward_modules.NIL;
                rule = cdolist_list_var.first();
                while (forward_modules.NIL != cdolist_list_var) {
                    if (forward_modules.NIL != Functions.funcall(rule_filter_method, source_asent, rule)) {
                        filtered_rules = (SubLObject)ConsesLow.cons(rule, filtered_rules);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rule = cdolist_list_var.first();
                }
                rules = Sequences.nreverse(filtered_rules);
            }
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 9395L)
    public static SubLObject forward_hl_module_expand(final SubLObject forward_hl_module, final SubLObject source_asent, final SubLObject rules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expand_function = inference_modules.hl_module_expand_func(forward_hl_module);
        if (expand_function.isFunctionSpec()) {
            final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if (forward_modules.NIL != last_metric_type && forward_modules.NIL != last_metric) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)forward_modules.ZERO_INTEGER);
            }
            final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)forward_modules.$kw15$FORWARD_TACTIC_SPECS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind(expand_function, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)forward_modules.NIL, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)forward_modules.$kw16$NO_RULE, thread);
                try {
                    SubLObject cdolist_list_var = rules;
                    SubLObject rule = (SubLObject)forward_modules.NIL;
                    rule = cdolist_list_var.first();
                    while (forward_modules.NIL != cdolist_list_var) {
                        Functions.funcall(expand_function, source_asent, rule);
                        cdolist_list_var = cdolist_list_var.rest();
                        rule = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_modules.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics((SubLObject)forward_modules.$kw15$FORWARD_TACTIC_SPECS, expand_function, (SubLObject)forward_modules.NIL, (SubLObject)forward_modules.$kw16$NO_RULE, (SubLObject)forward_modules.NIL);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            }
            finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 9791L)
    public static SubLObject all_antecedent_predicate_forward_rules(final SubLObject pred) {
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)forward_modules.NIL;
        direction = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, (SubLObject)forward_modules.$kw17$NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, (SubLObject)forward_modules.$kw17$NEG, direction);
                SubLObject done_var = (SubLObject)forward_modules.NIL;
                final SubLObject token_var = (SubLObject)forward_modules.NIL;
                while (forward_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (forward_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                            SubLObject done_var_$4 = (SubLObject)forward_modules.NIL;
                            final SubLObject token_var_$5 = (SubLObject)forward_modules.NIL;
                            while (forward_modules.NIL == done_var_$4) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(rule));
                                if (forward_modules.NIL != valid_$6) {
                                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                                }
                                done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$6);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (forward_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        rules = list_utilities.fast_delete_duplicates(rules, Symbols.symbol_function((SubLObject)forward_modules.EQL), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 10285L)
    public static SubLObject all_consequent_predicate_forward_rules(final SubLObject pred) {
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)forward_modules.NIL;
        direction = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, (SubLObject)forward_modules.$kw19$POS, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, (SubLObject)forward_modules.$kw19$POS, direction);
                SubLObject done_var = (SubLObject)forward_modules.NIL;
                final SubLObject token_var = (SubLObject)forward_modules.NIL;
                while (forward_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (forward_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                            SubLObject done_var_$7 = (SubLObject)forward_modules.NIL;
                            final SubLObject token_var_$8 = (SubLObject)forward_modules.NIL;
                            while (forward_modules.NIL == done_var_$7) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(rule));
                                if (forward_modules.NIL != valid_$9) {
                                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                                }
                                done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$9);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (forward_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        rules = list_utilities.fast_delete_duplicates(rules, Symbols.symbol_function((SubLObject)forward_modules.EQL), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 10587L)
    public static SubLObject all_ist_predicate_forward_rules(final SubLObject pred) {
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)forward_modules.NIL;
        direction = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = genl_predicates.all_genl_preds(pred, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject genl_pred = (SubLObject)forward_modules.NIL;
            genl_pred = cdolist_list_var_$10.first();
            while (forward_modules.NIL != cdolist_list_var_$10) {
                if (forward_modules.NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(genl_pred, (SubLObject)forward_modules.NIL, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(genl_pred, (SubLObject)forward_modules.NIL, direction);
                    SubLObject done_var = (SubLObject)forward_modules.NIL;
                    final SubLObject token_var = (SubLObject)forward_modules.NIL;
                    while (forward_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (forward_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                SubLObject done_var_$11 = (SubLObject)forward_modules.NIL;
                                final SubLObject token_var_$12 = (SubLObject)forward_modules.NIL;
                                while (forward_modules.NIL == done_var_$11) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                                    final SubLObject valid_$13 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$12.eql(rule));
                                    if (forward_modules.NIL != valid_$13) {
                                        rules = (SubLObject)ConsesLow.cons(rule, rules);
                                    }
                                    done_var_$11 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$13);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (forward_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                    }
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                genl_pred = cdolist_list_var_$10.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        rules = list_utilities.fast_delete_duplicates(rules, Symbols.symbol_function((SubLObject)forward_modules.EQL), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 11222L)
    public static SubLObject forward_normal_pos_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 11362L)
    public static SubLObject forward_normal_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_normal_pos_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 11477L)
    public static SubLObject forward_normal_pos_expand(final SubLObject asent, final SubLObject rule) {
        SubLObject cdolist_list_var = forward_normal_pos_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            forward_module_callback(asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, (SubLObject)forward_modules.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 11677L)
    public static SubLObject forward_normal_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 12311L)
    public static SubLObject forward_normal_neg_rule_select(final SubLObject asent) {
        return all_consequent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 12451L)
    public static SubLObject forward_normal_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_normal_neg_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 12566L)
    public static SubLObject forward_normal_neg_expand(final SubLObject asent, final SubLObject rule) {
        SubLObject cdolist_list_var = forward_normal_neg_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            forward_module_callback(asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, (SubLObject)forward_modules.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 12766L)
    public static SubLObject forward_normal_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.pos_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 13644L)
    public static SubLObject forward_isa_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = forward_inference_all_genls(col);
        SubLObject genl = (SubLObject)forward_modules.NIL;
        genl = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)forward_modules.NIL;
            direction = cdolist_list_var_$14.first();
            while (forward_modules.NIL != cdolist_list_var_$14) {
                if (forward_modules.NIL != kb_mapping_macros.do_isa_rule_index_key_validator(genl, (SubLObject)forward_modules.$kw17$NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(genl, (SubLObject)forward_modules.$kw17$NEG, direction);
                    SubLObject done_var = (SubLObject)forward_modules.NIL;
                    final SubLObject token_var = (SubLObject)forward_modules.NIL;
                    while (forward_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (forward_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                SubLObject done_var_$15 = (SubLObject)forward_modules.NIL;
                                final SubLObject token_var_$16 = (SubLObject)forward_modules.NIL;
                                while (forward_modules.NIL == done_var_$15) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$16);
                                    final SubLObject valid_$17 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$16.eql(rule));
                                    if (forward_modules.NIL != valid_$17) {
                                        rules = (SubLObject)ConsesLow.cons(rule, rules);
                                    }
                                    done_var_$15 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$17);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (forward_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                    }
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                direction = cdolist_list_var_$14.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 14008L)
    public static SubLObject forward_isa_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_isa_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 14109L)
    public static SubLObject forward_isa_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind((SubLObject)forward_modules.T, thread);
            SubLObject cdolist_list_var = forward_isa_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                final SubLObject genl = cycl_utilities.atomic_sentence_arg2(examine_lit, (SubLObject)forward_modules.UNPROVIDED);
                final SubLObject forward_asent = (SubLObject)ConsesLow.list(forward_modules.$const26$isa, arg1, genl);
                final SubLObject more_supports = (SubLObject)(genl.eql(arg2) ? forward_modules.NIL : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw27$GENLS, (SubLObject)ConsesLow.list(forward_modules.$const28$genls, arg2, genl), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
                forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 14660L)
    public static SubLObject forward_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.$const26$isa.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_col) && forward_modules.NIL != forward_inference_genlP(source_col, rule_col)) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15196L)
    public static SubLObject forward_inference_genlP(final SubLObject source_col, final SubLObject rule_col) {
        return list_utilities.member_kbeqP(rule_col, forward_inference_all_genls(source_col));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15333L)
    public static SubLObject forward_inference_all_genls_internal(final SubLObject col) {
        return genls.all_genls(col, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15333L)
    public static SubLObject forward_inference_all_genls(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)forward_modules.NIL;
        if (forward_modules.NIL == v_memoization_state) {
            return forward_inference_all_genls_internal(col);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)forward_modules.$sym29$FORWARD_INFERENCE_ALL_GENLS, (SubLObject)forward_modules.UNPROVIDED);
        if (forward_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)forward_modules.$sym29$FORWARD_INFERENCE_ALL_GENLS, (SubLObject)forward_modules.ONE_INTEGER, (SubLObject)forward_modules.NIL, (SubLObject)forward_modules.EQL, (SubLObject)forward_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)forward_modules.$sym29$FORWARD_INFERENCE_ALL_GENLS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(forward_inference_all_genls_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, (SubLObject)forward_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15705L)
    public static SubLObject clear_cached_all_specs() {
        final SubLObject cs = forward_modules.$cached_all_specs_caching_state$.getGlobalValue();
        if (forward_modules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15705L)
    public static SubLObject remove_cached_all_specs(final SubLObject col) {
        return memoization_state.caching_state_remove_function_results_with_args(forward_modules.$cached_all_specs_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(col), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15705L)
    public static SubLObject cached_all_specs_internal(final SubLObject col) {
        return genls.all_specs(col, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15705L)
    public static SubLObject cached_all_specs(final SubLObject col) {
        SubLObject caching_state = forward_modules.$cached_all_specs_caching_state$.getGlobalValue();
        if (forward_modules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)forward_modules.$sym32$CACHED_ALL_SPECS, (SubLObject)forward_modules.$sym33$_CACHED_ALL_SPECS_CACHING_STATE_, (SubLObject)forward_modules.$int34$64, (SubLObject)forward_modules.EQL, (SubLObject)forward_modules.ONE_INTEGER, (SubLObject)forward_modules.ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback((SubLObject)forward_modules.$sym35$CLEAR_CACHED_ALL_SPECS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_all_specs_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, (SubLObject)forward_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15847L)
    public static SubLObject forward_not_isa_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = cached_all_specs(col);
        SubLObject spec = (SubLObject)forward_modules.NIL;
        spec = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$18 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)forward_modules.NIL;
            direction = cdolist_list_var_$18.first();
            while (forward_modules.NIL != cdolist_list_var_$18) {
                if (forward_modules.NIL != kb_mapping_macros.do_isa_rule_index_key_validator(spec, (SubLObject)forward_modules.$kw19$POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(spec, (SubLObject)forward_modules.$kw19$POS, direction);
                    SubLObject done_var = (SubLObject)forward_modules.NIL;
                    final SubLObject token_var = (SubLObject)forward_modules.NIL;
                    while (forward_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (forward_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                SubLObject done_var_$19 = (SubLObject)forward_modules.NIL;
                                final SubLObject token_var_$20 = (SubLObject)forward_modules.NIL;
                                while (forward_modules.NIL == done_var_$19) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                    final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(rule));
                                    if (forward_modules.NIL != valid_$21) {
                                        rules = (SubLObject)ConsesLow.cons(rule, rules);
                                    }
                                    done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$21);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (forward_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                    }
                }
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                direction = cdolist_list_var_$18.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 16204L)
    public static SubLObject forward_not_isa_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_not_isa_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 16313L)
    public static SubLObject forward_not_isa_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind((SubLObject)forward_modules.T, thread);
            SubLObject cdolist_list_var = forward_not_isa_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                final SubLObject spec = cycl_utilities.atomic_sentence_arg2(examine_lit, (SubLObject)forward_modules.UNPROVIDED);
                final SubLObject forward_asent = (SubLObject)ConsesLow.list(forward_modules.$const26$isa, arg1, spec);
                final SubLObject more_supports = (SubLObject)(spec.eql(arg2) ? forward_modules.NIL : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw27$GENLS, (SubLObject)ConsesLow.list(forward_modules.$const28$genls, spec, arg2), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
                forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 16872L)
    public static SubLObject forward_not_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject all_specs = cached_all_specs(source_col);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.pos_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.$const26$isa.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_col) && forward_modules.NIL != list_utilities.member_kbeqP(rule_col, all_specs)) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 18037L)
    public static SubLObject forward_quoted_isa_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = forward_inference_all_genls(col);
        SubLObject genl = (SubLObject)forward_modules.NIL;
        genl = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$22 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)forward_modules.NIL;
            direction = cdolist_list_var_$22.first();
            while (forward_modules.NIL != cdolist_list_var_$22) {
                if (forward_modules.NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(genl, (SubLObject)forward_modules.$kw17$NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(genl, (SubLObject)forward_modules.$kw17$NEG, direction);
                    SubLObject done_var = (SubLObject)forward_modules.NIL;
                    final SubLObject token_var = (SubLObject)forward_modules.NIL;
                    while (forward_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (forward_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                SubLObject done_var_$23 = (SubLObject)forward_modules.NIL;
                                final SubLObject token_var_$24 = (SubLObject)forward_modules.NIL;
                                while (forward_modules.NIL == done_var_$23) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                    final SubLObject valid_$25 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$24.eql(rule));
                                    if (forward_modules.NIL != valid_$25) {
                                        rules = (SubLObject)ConsesLow.cons(rule, rules);
                                    }
                                    done_var_$23 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$25);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (forward_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                    }
                }
                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                direction = cdolist_list_var_$22.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 18415L)
    public static SubLObject forward_quoted_isa_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_quoted_isa_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 18530L)
    public static SubLObject forward_quoted_isa_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind((SubLObject)forward_modules.T, thread);
            SubLObject cdolist_list_var = forward_quoted_isa_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                final SubLObject genl = cycl_utilities.atomic_sentence_arg2(examine_lit, (SubLObject)forward_modules.UNPROVIDED);
                final SubLObject forward_asent = (SubLObject)ConsesLow.list(forward_modules.$const38$quotedIsa, arg1, genl);
                final SubLObject more_supports = (SubLObject)(genl.eql(arg2) ? forward_modules.NIL : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw27$GENLS, (SubLObject)ConsesLow.list(forward_modules.$const28$genls, arg2, genl), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
                forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 19101L)
    public static SubLObject forward_quoted_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.$const38$quotedIsa.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_col) && forward_modules.NIL != forward_inference_genlP(source_col, rule_col)) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 19983L)
    public static SubLObject forward_not_quoted_isa_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = cached_all_specs(col);
        SubLObject spec = (SubLObject)forward_modules.NIL;
        spec = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$26 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)forward_modules.NIL;
            direction = cdolist_list_var_$26.first();
            while (forward_modules.NIL != cdolist_list_var_$26) {
                if (forward_modules.NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(spec, (SubLObject)forward_modules.$kw19$POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(spec, (SubLObject)forward_modules.$kw19$POS, direction);
                    SubLObject done_var = (SubLObject)forward_modules.NIL;
                    final SubLObject token_var = (SubLObject)forward_modules.NIL;
                    while (forward_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (forward_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                SubLObject done_var_$27 = (SubLObject)forward_modules.NIL;
                                final SubLObject token_var_$28 = (SubLObject)forward_modules.NIL;
                                while (forward_modules.NIL == done_var_$27) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$28);
                                    final SubLObject valid_$29 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$28.eql(rule));
                                    if (forward_modules.NIL != valid_$29) {
                                        rules = (SubLObject)ConsesLow.cons(rule, rules);
                                    }
                                    done_var_$27 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$29);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (forward_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                    }
                }
                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                direction = cdolist_list_var_$26.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 20354L)
    public static SubLObject forward_not_quoted_isa_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_not_quoted_isa_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 20477L)
    public static SubLObject forward_not_quoted_isa_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind((SubLObject)forward_modules.T, thread);
            SubLObject cdolist_list_var = forward_not_quoted_isa_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                final SubLObject spec = cycl_utilities.atomic_sentence_arg2(examine_lit, (SubLObject)forward_modules.UNPROVIDED);
                final SubLObject forward_asent = (SubLObject)ConsesLow.list(forward_modules.$const38$quotedIsa, arg1, spec);
                final SubLObject more_supports = (SubLObject)(spec.eql(arg2) ? forward_modules.NIL : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw27$GENLS, (SubLObject)ConsesLow.list(forward_modules.$const28$genls, spec, arg2), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
                forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 21056L)
    public static SubLObject forward_not_quoted_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject all_specs = cached_all_specs(source_col);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.pos_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.$const38$quotedIsa.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_col) && forward_modules.NIL != list_utilities.member_kbeqP(rule_col, all_specs)) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 21906L)
    public static SubLObject forward_genls_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = forward_inference_all_genls(col);
        SubLObject genl = (SubLObject)forward_modules.NIL;
        genl = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$30 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)forward_modules.NIL;
            direction = cdolist_list_var_$30.first();
            while (forward_modules.NIL != cdolist_list_var_$30) {
                if (forward_modules.NIL != kb_mapping_macros.do_genls_rule_index_key_validator(genl, (SubLObject)forward_modules.$kw17$NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(genl, (SubLObject)forward_modules.$kw17$NEG, direction);
                    SubLObject done_var = (SubLObject)forward_modules.NIL;
                    final SubLObject token_var = (SubLObject)forward_modules.NIL;
                    while (forward_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (forward_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                SubLObject done_var_$31 = (SubLObject)forward_modules.NIL;
                                final SubLObject token_var_$32 = (SubLObject)forward_modules.NIL;
                                while (forward_modules.NIL == done_var_$31) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                                    final SubLObject valid_$33 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$32.eql(rule));
                                    if (forward_modules.NIL != valid_$33) {
                                        rules = (SubLObject)ConsesLow.cons(rule, rules);
                                    }
                                    done_var_$31 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$33);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (forward_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                    }
                }
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                direction = cdolist_list_var_$30.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 22274L)
    public static SubLObject forward_genls_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genls_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 22379L)
    public static SubLObject forward_genls_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind((SubLObject)forward_modules.T, thread);
            SubLObject cdolist_list_var = forward_genls_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                final SubLObject genl = cycl_utilities.atomic_sentence_arg2(examine_lit, (SubLObject)forward_modules.UNPROVIDED);
                final SubLObject forward_asent = (SubLObject)ConsesLow.list(forward_modules.$const28$genls, arg1, genl);
                final SubLObject more_supports = (SubLObject)(genl.eql(arg2) ? forward_modules.NIL : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw27$GENLS, (SubLObject)ConsesLow.list(forward_modules.$const28$genls, arg2, genl), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
                forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 22934L)
    public static SubLObject forward_genls_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.$const28$genls.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_col) && forward_modules.NIL != forward_inference_genlP(source_col, rule_col)) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 23767L)
    public static SubLObject forward_not_genls_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = cached_all_specs(col);
        SubLObject spec = (SubLObject)forward_modules.NIL;
        spec = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$34 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)forward_modules.NIL;
            direction = cdolist_list_var_$34.first();
            while (forward_modules.NIL != cdolist_list_var_$34) {
                if (forward_modules.NIL != kb_mapping_macros.do_genls_rule_index_key_validator(spec, (SubLObject)forward_modules.$kw19$POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(spec, (SubLObject)forward_modules.$kw19$POS, direction);
                    SubLObject done_var = (SubLObject)forward_modules.NIL;
                    final SubLObject token_var = (SubLObject)forward_modules.NIL;
                    while (forward_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (forward_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                SubLObject done_var_$35 = (SubLObject)forward_modules.NIL;
                                final SubLObject token_var_$36 = (SubLObject)forward_modules.NIL;
                                while (forward_modules.NIL == done_var_$35) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                    final SubLObject valid_$37 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$36.eql(rule));
                                    if (forward_modules.NIL != valid_$37) {
                                        rules = (SubLObject)ConsesLow.cons(rule, rules);
                                    }
                                    done_var_$35 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$37);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (forward_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                    }
                }
                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                direction = cdolist_list_var_$34.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 24128L)
    public static SubLObject forward_not_genls_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_not_genls_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 24241L)
    public static SubLObject forward_not_genls_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind((SubLObject)forward_modules.T, thread);
            SubLObject cdolist_list_var = forward_genls_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                final SubLObject spec = cycl_utilities.atomic_sentence_arg2(examine_lit, (SubLObject)forward_modules.UNPROVIDED);
                final SubLObject forward_asent = (SubLObject)ConsesLow.list(forward_modules.$const28$genls, arg1, spec);
                final SubLObject more_supports = (SubLObject)(spec.eql(arg2) ? forward_modules.NIL : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw27$GENLS, (SubLObject)ConsesLow.list(forward_modules.$const28$genls, spec, arg2), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
                forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 24800L)
    public static SubLObject forward_not_genls_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject all_specs = cached_all_specs(source_col);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.pos_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.$const28$genls.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_col) && forward_modules.NIL != list_utilities.member_kbeqP(rule_col, all_specs)) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25649L)
    public static SubLObject clear_cached_all_genl_mts() {
        final SubLObject cs = forward_modules.$cached_all_genl_mts_caching_state$.getGlobalValue();
        if (forward_modules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25649L)
    public static SubLObject remove_cached_all_genl_mts(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(forward_modules.$cached_all_genl_mts_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mt), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25649L)
    public static SubLObject cached_all_genl_mts_internal(final SubLObject mt) {
        return genl_mts.all_genl_mts(mt, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25649L)
    public static SubLObject cached_all_genl_mts(final SubLObject mt) {
        SubLObject caching_state = forward_modules.$cached_all_genl_mts_caching_state$.getGlobalValue();
        if (forward_modules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)forward_modules.$sym47$CACHED_ALL_GENL_MTS, (SubLObject)forward_modules.$sym48$_CACHED_ALL_GENL_MTS_CACHING_STATE_, (SubLObject)forward_modules.$int34$64, (SubLObject)forward_modules.EQL, (SubLObject)forward_modules.ONE_INTEGER, (SubLObject)forward_modules.ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback((SubLObject)forward_modules.$sym49$CLEAR_CACHED_ALL_GENL_MTS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_all_genl_mts_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)forward_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25797L)
    public static SubLObject forward_genlmt_rule_select(final SubLObject asent) {
        final SubLObject mt = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = cached_all_genl_mts(mt);
        SubLObject genl_mt = (SubLObject)forward_modules.NIL;
        genl_mt = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$38 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)forward_modules.NIL;
            direction = cdolist_list_var_$38.first();
            while (forward_modules.NIL != cdolist_list_var_$38) {
                if (forward_modules.NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, (SubLObject)forward_modules.$kw17$NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, (SubLObject)forward_modules.$kw17$NEG, direction);
                    SubLObject done_var = (SubLObject)forward_modules.NIL;
                    final SubLObject token_var = (SubLObject)forward_modules.NIL;
                    while (forward_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (forward_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                SubLObject done_var_$39 = (SubLObject)forward_modules.NIL;
                                final SubLObject token_var_$40 = (SubLObject)forward_modules.NIL;
                                while (forward_modules.NIL == done_var_$39) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                    final SubLObject valid_$41 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$40.eql(rule));
                                    if (forward_modules.NIL != valid_$41) {
                                        rules = (SubLObject)ConsesLow.cons(rule, rules);
                                    }
                                    done_var_$39 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$41);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (forward_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                    }
                }
                cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                direction = cdolist_list_var_$38.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_mt = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 26164L)
    public static SubLObject forward_genlmt_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genlmt_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 26271L)
    public static SubLObject forward_genlmt_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject cdolist_list_var = forward_genlmt_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            final SubLObject genl_mt = cycl_utilities.atomic_sentence_arg2(examine_lit, (SubLObject)forward_modules.UNPROVIDED);
            final SubLObject forward_asent = (SubLObject)ConsesLow.list(forward_modules.$const50$genlMt, arg1, genl_mt);
            final SubLObject more_supports = (SubLObject)(genl_mt.eql(arg2) ? forward_modules.NIL : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw51$GENLMT, (SubLObject)ConsesLow.list(forward_modules.$const50$genlMt, arg2, genl_mt), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
            forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 26804L)
    public static SubLObject forward_genlmt_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject source_mt = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject all_genl_mts = cached_all_genl_mts(source_mt);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_mt;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.$const50$genlMt.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_mt = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_mt) && forward_modules.NIL != ((forward_modules.NIL != forts.fort_p(rule_mt)) ? list_utilities.member_kbeqP(rule_mt, all_genl_mts) : genl_mts.genl_mtP(source_mt, rule_mt, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED))) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27751L)
    public static SubLObject clear_cached_all_spec_mts() {
        final SubLObject cs = forward_modules.$cached_all_spec_mts_caching_state$.getGlobalValue();
        if (forward_modules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27751L)
    public static SubLObject remove_cached_all_spec_mts(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(forward_modules.$cached_all_spec_mts_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mt), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27751L)
    public static SubLObject cached_all_spec_mts_internal(final SubLObject mt) {
        return genl_mts.all_spec_mts(mt, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27751L)
    public static SubLObject cached_all_spec_mts(final SubLObject mt) {
        SubLObject caching_state = forward_modules.$cached_all_spec_mts_caching_state$.getGlobalValue();
        if (forward_modules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)forward_modules.$sym54$CACHED_ALL_SPEC_MTS, (SubLObject)forward_modules.$sym55$_CACHED_ALL_SPEC_MTS_CACHING_STATE_, (SubLObject)forward_modules.$int34$64, (SubLObject)forward_modules.EQL, (SubLObject)forward_modules.ONE_INTEGER, (SubLObject)forward_modules.ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback((SubLObject)forward_modules.$sym56$CLEAR_CACHED_ALL_SPEC_MTS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_all_spec_mts_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)forward_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27899L)
    public static SubLObject forward_not_genlmt_rule_select(final SubLObject asent) {
        final SubLObject mt = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = cached_all_spec_mts(mt);
        SubLObject spec_mt = (SubLObject)forward_modules.NIL;
        spec_mt = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$42 = backward_utilities.relevant_directions();
            SubLObject direction = (SubLObject)forward_modules.NIL;
            direction = cdolist_list_var_$42.first();
            while (forward_modules.NIL != cdolist_list_var_$42) {
                if (forward_modules.NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(spec_mt, (SubLObject)forward_modules.$kw19$POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(spec_mt, (SubLObject)forward_modules.$kw19$POS, direction);
                    SubLObject done_var = (SubLObject)forward_modules.NIL;
                    final SubLObject token_var = (SubLObject)forward_modules.NIL;
                    while (forward_modules.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (forward_modules.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                SubLObject done_var_$43 = (SubLObject)forward_modules.NIL;
                                final SubLObject token_var_$44 = (SubLObject)forward_modules.NIL;
                                while (forward_modules.NIL == done_var_$43) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                                    final SubLObject valid_$45 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$44.eql(rule));
                                    if (forward_modules.NIL != valid_$45) {
                                        rules = (SubLObject)ConsesLow.cons(rule, rules);
                                    }
                                    done_var_$43 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$45);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (forward_modules.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                    }
                }
                cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                direction = cdolist_list_var_$42.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_mt = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 28270L)
    public static SubLObject forward_not_genlmt_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_not_genlmt_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 28385L)
    public static SubLObject forward_not_genlmt_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject cdolist_list_var = forward_not_genlmt_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            final SubLObject spec_mt = cycl_utilities.atomic_sentence_arg2(examine_lit, (SubLObject)forward_modules.UNPROVIDED);
            final SubLObject forward_asent = (SubLObject)ConsesLow.list(forward_modules.$const50$genlMt, spec_mt, arg1);
            final SubLObject more_supports = (SubLObject)(spec_mt.eql(arg2) ? forward_modules.NIL : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw51$GENLMT, (SubLObject)ConsesLow.list(forward_modules.$const50$genlMt, spec_mt, arg2), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
            forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 28926L)
    public static SubLObject forward_not_genlmt_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject source_mt = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject all_spec_mts = cached_all_spec_mts(source_mt);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_mt;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.pos_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.$const50$genlMt.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_mt = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_mt) && forward_modules.NIL != ((forward_modules.NIL != forts.fort_p(rule_mt)) ? list_utilities.member_kbeqP(rule_mt, all_spec_mts) : genl_mts.spec_mtP(source_mt, rule_mt, (SubLObject)forward_modules.UNPROVIDED))) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 30005L)
    public static SubLObject forward_symmetric_pos_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 30163L)
    public static SubLObject forward_symmetric_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_symmetric_pos_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 30284L)
    public static SubLObject forward_symmetric_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject forward_asent = removal_modules_symmetry.symmetric_literal(asent);
        final SubLObject more_supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw59$ISA, (SubLObject)ConsesLow.listS(forward_modules.$const26$isa, pred, (SubLObject)forward_modules.$list60), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED));
        SubLObject cdolist_list_var = forward_symmetric_pos_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 30711L)
    public static SubLObject forward_symmetric_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 31498L)
    public static SubLObject forward_symmetric_neg_rule_select(final SubLObject asent) {
        return all_consequent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 31641L)
    public static SubLObject forward_symmetric_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_symmetric_neg_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 31762L)
    public static SubLObject forward_symmetric_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject forward_asent = removal_modules_symmetry.symmetric_literal(asent);
        final SubLObject more_supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw59$ISA, (SubLObject)ConsesLow.listS(forward_modules.$const26$isa, pred, (SubLObject)forward_modules.$list60), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED));
        SubLObject cdolist_list_var = forward_symmetric_neg_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 32189L)
    public static SubLObject forward_symmetric_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.pos_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 32930L)
    public static SubLObject forward_asymmetric_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = (SubLObject)forward_modules.$list65;
        return (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread) && forward_modules.NIL != formula_pattern_match.formula_matches_pattern(asent, pattern));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 33216L)
    public static SubLObject forward_asymmetric_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 33356L)
    public static SubLObject forward_asymmetric_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward_modules.NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue(thread) || forward_modules.NIL != list_utilities.lengthG(pragma_induction.rule_pos_lits(rule), (SubLObject)forward_modules.ONE_INTEGER, (SubLObject)forward_modules.UNPROVIDED)) {
            return forward_asymmetric_expand_int(asent, rule, (SubLObject)forward_modules.T);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 33562L)
    public static SubLObject forward_asymmetric_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject forward_asent = removal_modules_symmetry.symmetric_literal(asent);
        final SubLObject more_supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw59$ISA, (SubLObject)ConsesLow.listS(forward_modules.$const26$isa, pred, (SubLObject)forward_modules.$list66), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED));
        SubLObject cdolist_list_var = forward_asymmetric_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 33984L)
    public static SubLObject forward_asymmetric_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.pos_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 34838L)
    public static SubLObject forward_commutative_pos_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 34998L)
    public static SubLObject forward_commutative_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_commutative_pos_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 35123L)
    public static SubLObject forward_commutative_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject more_supports = (SubLObject)((forward_modules.NIL != inference_trampolines.inference_commutative_predicate_p(pred)) ? ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw59$ISA, (SubLObject)ConsesLow.listS(forward_modules.$const26$isa, pred, (SubLObject)forward_modules.$list69), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)) : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw59$ISA, (SubLObject)ConsesLow.listS(forward_modules.$const26$isa, pred, (SubLObject)forward_modules.$list70), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
        if (forward_modules.NIL != el_utilities.el_binary_formula_p(asent)) {
            final SubLObject forward_asent = removal_modules_symmetry.symmetric_asent(asent);
            SubLObject cdolist_list_var = forward_commutative_pos_expand_int(forward_asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations(asent, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject forward_asent2 = (SubLObject)forward_modules.NIL;
            forward_asent2 = cdolist_list_var2.first();
            while (forward_modules.NIL != cdolist_list_var2) {
                if (!forward_asent2.equal(asent)) {
                    SubLObject cdolist_list_var_$46 = forward_commutative_pos_expand_int(forward_asent2, rule, (SubLObject)forward_modules.UNPROVIDED);
                    SubLObject examine_lit2 = (SubLObject)forward_modules.NIL;
                    examine_lit2 = cdolist_list_var_$46.first();
                    while (forward_modules.NIL != cdolist_list_var_$46) {
                        forward_module_callback(forward_asent2, (SubLObject)forward_modules.$kw19$POS, examine_lit2, (SubLObject)forward_modules.NIL, rule, more_supports);
                        cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                        examine_lit2 = cdolist_list_var_$46.first();
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                forward_asent2 = cdolist_list_var2.first();
            }
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 35715L)
    public static SubLObject forward_commutative_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 36574L)
    public static SubLObject forward_commutative_neg_rule_select(final SubLObject asent) {
        return all_consequent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 36719L)
    public static SubLObject forward_commutative_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_commutative_neg_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 36844L)
    public static SubLObject forward_commutative_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject more_supports = (SubLObject)((forward_modules.NIL != inference_trampolines.inference_commutative_predicate_p(pred)) ? ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw59$ISA, (SubLObject)ConsesLow.listS(forward_modules.$const26$isa, pred, (SubLObject)forward_modules.$list69), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)) : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw59$ISA, (SubLObject)ConsesLow.listS(forward_modules.$const26$isa, pred, (SubLObject)forward_modules.$list70), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
        if (forward_modules.NIL != el_utilities.el_binary_formula_p(asent)) {
            final SubLObject forward_asent = removal_modules_symmetry.symmetric_asent(asent);
            SubLObject cdolist_list_var = forward_commutative_neg_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations(asent, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject forward_asent2 = (SubLObject)forward_modules.NIL;
            forward_asent2 = cdolist_list_var2.first();
            while (forward_modules.NIL != cdolist_list_var2) {
                if (!forward_asent2.equal(asent)) {
                    SubLObject cdolist_list_var_$47 = forward_commutative_neg_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
                    SubLObject examine_lit2 = (SubLObject)forward_modules.NIL;
                    examine_lit2 = cdolist_list_var_$47.first();
                    while (forward_modules.NIL != cdolist_list_var_$47) {
                        forward_module_callback(forward_asent2, (SubLObject)forward_modules.$kw17$NEG, examine_lit2, (SubLObject)forward_modules.NIL, rule, more_supports);
                        cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                        examine_lit2 = cdolist_list_var_$47.first();
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                forward_asent2 = cdolist_list_var2.first();
            }
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 37428L)
    public static SubLObject forward_commutative_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.pos_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 38278L)
    public static SubLObject forward_genlpreds_gaf_rule_select(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        final SubLObject genl_preds = Sequences.remove(pred, cached_all_genl_preds(pred), Symbols.symbol_function((SubLObject)forward_modules.EQL), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)forward_modules.NIL;
        direction = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(forward_modules.$const75$genlPreds, (SubLObject)forward_modules.$kw17$NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(forward_modules.$const75$genlPreds, (SubLObject)forward_modules.$kw17$NEG, direction);
                SubLObject done_var = (SubLObject)forward_modules.NIL;
                final SubLObject token_var = (SubLObject)forward_modules.NIL;
                while (forward_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (forward_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                            SubLObject done_var_$48 = (SubLObject)forward_modules.NIL;
                            final SubLObject token_var_$49 = (SubLObject)forward_modules.NIL;
                            while (forward_modules.NIL == done_var_$48) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$49);
                                final SubLObject valid_$50 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$49.eql(rule));
                                if (forward_modules.NIL != valid_$50) {
                                    SubLObject selectedP = (SubLObject)forward_modules.NIL;
                                    final SubLObject predicate_var = forward_modules.$const75$genlPreds;
                                    final SubLObject assertion_var = rule;
                                    final SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                    SubLObject rest;
                                    SubLObject lit;
                                    SubLObject rule_pred;
                                    for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); forward_modules.NIL == selectedP && forward_modules.NIL != rest; rest = rest.rest()) {
                                        lit = rest.first();
                                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                                            rule_pred = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                                            if (forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, genl_preds)) {
                                                rules = (SubLObject)ConsesLow.cons(rule, rules);
                                                selectedP = (SubLObject)forward_modules.T;
                                            }
                                        }
                                    }
                                }
                                done_var_$48 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$50);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (forward_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        final SubLObject genl_inverses = cached_all_genl_inverses(pred);
        cdolist_list_var = backward_utilities.relevant_directions();
        direction = (SubLObject)forward_modules.NIL;
        direction = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(forward_modules.$const76$genlInverse, (SubLObject)forward_modules.$kw17$NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(forward_modules.$const76$genlInverse, (SubLObject)forward_modules.$kw17$NEG, direction);
                SubLObject done_var = (SubLObject)forward_modules.NIL;
                final SubLObject token_var = (SubLObject)forward_modules.NIL;
                while (forward_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (forward_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                            SubLObject done_var_$49 = (SubLObject)forward_modules.NIL;
                            final SubLObject token_var_$50 = (SubLObject)forward_modules.NIL;
                            while (forward_modules.NIL == done_var_$49) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$50);
                                final SubLObject valid_$51 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$50.eql(rule));
                                if (forward_modules.NIL != valid_$51) {
                                    SubLObject selectedP = (SubLObject)forward_modules.NIL;
                                    final SubLObject predicate_var = forward_modules.$const76$genlInverse;
                                    final SubLObject assertion_var = rule;
                                    final SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                    SubLObject rest;
                                    SubLObject lit;
                                    SubLObject rule_pred;
                                    for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); forward_modules.NIL == selectedP && forward_modules.NIL != rest; rest = rest.rest()) {
                                        lit = rest.first();
                                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                                            rule_pred = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                                            if (forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, genl_inverses)) {
                                                rules = (SubLObject)ConsesLow.cons(rule, rules);
                                                selectedP = (SubLObject)forward_modules.T;
                                            }
                                        }
                                    }
                                }
                                done_var_$49 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$51);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (forward_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39332L)
    public static SubLObject clear_cached_all_genl_preds() {
        final SubLObject cs = forward_modules.$cached_all_genl_preds_caching_state$.getGlobalValue();
        if (forward_modules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39332L)
    public static SubLObject remove_cached_all_genl_preds(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args(forward_modules.$cached_all_genl_preds_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39332L)
    public static SubLObject cached_all_genl_preds_internal(final SubLObject pred) {
        return genl_predicates.all_genl_preds(pred, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39332L)
    public static SubLObject cached_all_genl_preds(final SubLObject pred) {
        SubLObject caching_state = forward_modules.$cached_all_genl_preds_caching_state$.getGlobalValue();
        if (forward_modules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)forward_modules.$sym77$CACHED_ALL_GENL_PREDS, (SubLObject)forward_modules.$sym78$_CACHED_ALL_GENL_PREDS_CACHING_STATE_, (SubLObject)forward_modules.$int34$64, (SubLObject)forward_modules.EQL, (SubLObject)forward_modules.ONE_INTEGER, (SubLObject)forward_modules.ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)forward_modules.$sym79$CLEAR_CACHED_ALL_GENL_PREDS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_all_genl_preds_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)forward_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39491L)
    public static SubLObject clear_cached_all_genl_inverses() {
        final SubLObject cs = forward_modules.$cached_all_genl_inverses_caching_state$.getGlobalValue();
        if (forward_modules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39491L)
    public static SubLObject remove_cached_all_genl_inverses(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args(forward_modules.$cached_all_genl_inverses_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39491L)
    public static SubLObject cached_all_genl_inverses_internal(final SubLObject pred) {
        return genl_predicates.all_genl_inverses(pred, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39491L)
    public static SubLObject cached_all_genl_inverses(final SubLObject pred) {
        SubLObject caching_state = forward_modules.$cached_all_genl_inverses_caching_state$.getGlobalValue();
        if (forward_modules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)forward_modules.$sym80$CACHED_ALL_GENL_INVERSES, (SubLObject)forward_modules.$sym81$_CACHED_ALL_GENL_INVERSES_CACHING_STATE_, (SubLObject)forward_modules.$int34$64, (SubLObject)forward_modules.EQL, (SubLObject)forward_modules.ONE_INTEGER, (SubLObject)forward_modules.ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)forward_modules.$sym82$CLEAR_CACHED_ALL_GENL_INVERSES);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_all_genl_inverses_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)forward_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39656L)
    public static SubLObject forward_genlpreds_gaf_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genlpreds_gaf_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39777L)
    public static SubLObject forward_genlpreds_gaf_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject cdolist_list_var = forward_genlpreds_gaf_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            final SubLObject examine_pred = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject genl_pred_or_inverse = cycl_utilities.atomic_sentence_arg2(examine_lit, (SubLObject)forward_modules.UNPROVIDED);
            final SubLObject forward_asent = (SubLObject)ConsesLow.list(examine_pred, arg1, genl_pred_or_inverse);
            final SubLObject more_supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw83$GENLPREDS, (SubLObject)ConsesLow.list(examine_pred, arg2, genl_pred_or_inverse), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED));
            forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 40415L)
    public static SubLObject forward_genlpreds_gaf_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject all_genl_preds = cached_all_genl_preds(pred);
        final SubLObject all_genl_inverses = cached_all_genl_inverses(pred);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        SubLObject predicate_var = forward_modules.$const75$genlPreds;
        SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_pred = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_pred) && forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, all_genl_preds)) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        predicate_var = forward_modules.$const76$genlInverse;
        cnf_var = assertions_high.assertion_cnf(rule);
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_pred = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_pred) && forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, all_genl_inverses)) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 41656L)
    public static SubLObject forward_not_genlpreds_gaf_rule_select(final SubLObject asent) {
        return forward_normal_neg_rule_select(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 41778L)
    public static SubLObject forward_not_genlpreds_gaf_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_normal_neg_rule_filter(asent, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 41910L)
    public static SubLObject forward_not_genlpreds_gaf_expand(final SubLObject asent, final SubLObject rule) {
        return forward_normal_neg_expand(asent, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 42689L)
    public static SubLObject forward_genlpreds_pos_rule_select(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = Sequences.remove(pred, cached_all_genl_preds(pred), Symbols.symbol_function((SubLObject)forward_modules.EQL), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject genl_pred = (SubLObject)forward_modules.NIL;
        genl_pred = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL == hl_supports.hl_predicate_p(genl_pred)) {
                SubLObject cdolist_list_var_$54 = backward_utilities.relevant_directions();
                SubLObject direction = (SubLObject)forward_modules.NIL;
                direction = cdolist_list_var_$54.first();
                while (forward_modules.NIL != cdolist_list_var_$54) {
                    if (forward_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(genl_pred, (SubLObject)forward_modules.$kw17$NEG, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(genl_pred, (SubLObject)forward_modules.$kw17$NEG, direction);
                        SubLObject done_var = (SubLObject)forward_modules.NIL;
                        final SubLObject token_var = (SubLObject)forward_modules.NIL;
                        while (forward_modules.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (forward_modules.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                    SubLObject done_var_$55 = (SubLObject)forward_modules.NIL;
                                    final SubLObject token_var_$56 = (SubLObject)forward_modules.NIL;
                                    while (forward_modules.NIL == done_var_$55) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$56);
                                        final SubLObject valid_$57 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$56.eql(rule));
                                        if (forward_modules.NIL != valid_$57) {
                                            rules = (SubLObject)ConsesLow.cons(rule, rules);
                                        }
                                        done_var_$55 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$57);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (forward_modules.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                        }
                    }
                    cdolist_list_var_$54 = cdolist_list_var_$54.rest();
                    direction = cdolist_list_var_$54.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_pred = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 43091L)
    public static SubLObject forward_genlpreds_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genlpreds_pos_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 43212L)
    public static SubLObject forward_genlpreds_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject args = cycl_utilities.atomic_sentence_args(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject cdolist_list_var = forward_genlpreds_pos_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            final SubLObject genl_pred = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject forward_asent = reader.bq_cons(genl_pred, ConsesLow.append(args, (SubLObject)forward_modules.NIL));
            final SubLObject more_supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw83$GENLPREDS, (SubLObject)ConsesLow.list(forward_modules.$const75$genlPreds, pred, genl_pred), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED));
            forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 43733L)
    public static SubLObject forward_genlpreds_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject all_genl_preds = cached_all_genl_preds(pred);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            rule_pred = cycl_utilities.atomic_sentence_predicate(lit);
            if (forward_modules.NIL != variables.fully_bound_p(rule_pred) && !pred.eql(rule_pred) && forward_modules.NIL == hl_supports.hl_predicate_p(rule_pred) && forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, all_genl_preds)) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 47146L)
    public static SubLObject forward_genlinverse_gaf_rule_select(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        final SubLObject genl_preds = Sequences.remove(pred, cached_all_genl_preds(pred), Symbols.symbol_function((SubLObject)forward_modules.EQL), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)forward_modules.NIL;
        direction = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(forward_modules.$const76$genlInverse, (SubLObject)forward_modules.$kw17$NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(forward_modules.$const76$genlInverse, (SubLObject)forward_modules.$kw17$NEG, direction);
                SubLObject done_var = (SubLObject)forward_modules.NIL;
                final SubLObject token_var = (SubLObject)forward_modules.NIL;
                while (forward_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (forward_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                            SubLObject done_var_$58 = (SubLObject)forward_modules.NIL;
                            final SubLObject token_var_$59 = (SubLObject)forward_modules.NIL;
                            while (forward_modules.NIL == done_var_$58) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$59);
                                final SubLObject valid_$60 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$59.eql(rule));
                                if (forward_modules.NIL != valid_$60) {
                                    SubLObject selectedP = (SubLObject)forward_modules.NIL;
                                    final SubLObject predicate_var = forward_modules.$const75$genlPreds;
                                    final SubLObject assertion_var = rule;
                                    final SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                    SubLObject rest;
                                    SubLObject lit;
                                    SubLObject rule_pred;
                                    for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); forward_modules.NIL == selectedP && forward_modules.NIL != rest; rest = rest.rest()) {
                                        lit = rest.first();
                                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                                            rule_pred = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                                            if (forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, genl_preds)) {
                                                rules = (SubLObject)ConsesLow.cons(rule, rules);
                                                selectedP = (SubLObject)forward_modules.T;
                                            }
                                        }
                                    }
                                }
                                done_var_$58 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$60);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (forward_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        final SubLObject genl_inverses = cached_all_genl_inverses(pred);
        cdolist_list_var = backward_utilities.relevant_directions();
        direction = (SubLObject)forward_modules.NIL;
        direction = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(forward_modules.$const75$genlPreds, (SubLObject)forward_modules.$kw17$NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(forward_modules.$const75$genlPreds, (SubLObject)forward_modules.$kw17$NEG, direction);
                SubLObject done_var = (SubLObject)forward_modules.NIL;
                final SubLObject token_var = (SubLObject)forward_modules.NIL;
                while (forward_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (forward_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                            SubLObject done_var_$59 = (SubLObject)forward_modules.NIL;
                            final SubLObject token_var_$60 = (SubLObject)forward_modules.NIL;
                            while (forward_modules.NIL == done_var_$59) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$60);
                                final SubLObject valid_$61 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$60.eql(rule));
                                if (forward_modules.NIL != valid_$61) {
                                    SubLObject selectedP = (SubLObject)forward_modules.NIL;
                                    final SubLObject predicate_var = forward_modules.$const76$genlInverse;
                                    final SubLObject assertion_var = rule;
                                    final SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                    SubLObject rest;
                                    SubLObject lit;
                                    SubLObject rule_pred;
                                    for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); forward_modules.NIL == selectedP && forward_modules.NIL != rest; rest = rest.rest()) {
                                        lit = rest.first();
                                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                                            rule_pred = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                                            if (forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, genl_inverses)) {
                                                rules = (SubLObject)ConsesLow.cons(rule, rules);
                                                selectedP = (SubLObject)forward_modules.T;
                                            }
                                        }
                                    }
                                }
                                done_var_$59 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$61);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (forward_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 48202L)
    public static SubLObject forward_genlinverse_gaf_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genlinverse_gaf_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 48327L)
    public static SubLObject forward_genlinverse_gaf_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject cdolist_list_var = forward_genlinverse_gaf_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            final SubLObject examine_pred = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject genl_pred_or_inverse = cycl_utilities.atomic_sentence_arg2(examine_lit, (SubLObject)forward_modules.UNPROVIDED);
            final SubLObject forward_asent = (SubLObject)ConsesLow.list(examine_pred, arg1, genl_pred_or_inverse);
            final SubLObject more_supports = (SubLObject)(examine_pred.eql(forward_modules.$const76$genlInverse) ? ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw83$GENLPREDS, (SubLObject)ConsesLow.list(forward_modules.$const75$genlPreds, arg2, genl_pred_or_inverse), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)) : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw83$GENLPREDS, (SubLObject)ConsesLow.list(forward_modules.$const76$genlInverse, arg2, genl_pred_or_inverse), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
            forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 49097L)
    public static SubLObject forward_genlinverse_gaf_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject all_genl_preds = cached_all_genl_preds(pred);
        final SubLObject all_genl_inverses = cached_all_genl_inverses(pred);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        SubLObject predicate_var = forward_modules.$const76$genlInverse;
        SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_pred = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_pred) && forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, all_genl_preds)) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        predicate_var = forward_modules.$const75$genlPreds;
        cnf_var = assertions_high.assertion_cnf(rule);
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_pred = cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != variables.fully_bound_p(rule_pred) && forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, all_genl_inverses)) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 50351L)
    public static SubLObject forward_not_genlinverse_gaf_rule_select(final SubLObject asent) {
        return forward_normal_neg_rule_select(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 50475L)
    public static SubLObject forward_not_genlinverse_gaf_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_normal_neg_rule_filter(asent, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 50609L)
    public static SubLObject forward_not_genlinverse_gaf_expand(final SubLObject asent, final SubLObject rule) {
        return forward_normal_neg_expand(asent, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 51176L)
    public static SubLObject forward_genlinverse_pos_rule_select(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = cached_all_genl_inverses(pred);
        SubLObject genl_inverse = (SubLObject)forward_modules.NIL;
        genl_inverse = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL == hl_supports.hl_predicate_p(genl_inverse)) {
                SubLObject cdolist_list_var_$64 = backward_utilities.relevant_directions();
                SubLObject direction = (SubLObject)forward_modules.NIL;
                direction = cdolist_list_var_$64.first();
                while (forward_modules.NIL != cdolist_list_var_$64) {
                    if (forward_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(genl_inverse, (SubLObject)forward_modules.$kw17$NEG, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(genl_inverse, (SubLObject)forward_modules.$kw17$NEG, direction);
                        SubLObject done_var = (SubLObject)forward_modules.NIL;
                        final SubLObject token_var = (SubLObject)forward_modules.NIL;
                        while (forward_modules.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (forward_modules.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                    SubLObject done_var_$65 = (SubLObject)forward_modules.NIL;
                                    final SubLObject token_var_$66 = (SubLObject)forward_modules.NIL;
                                    while (forward_modules.NIL == done_var_$65) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                        final SubLObject valid_$67 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$66.eql(rule));
                                        if (forward_modules.NIL != valid_$67) {
                                            rules = (SubLObject)ConsesLow.cons(rule, rules);
                                        }
                                        done_var_$65 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$67);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (forward_modules.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                        }
                    }
                    cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                    direction = cdolist_list_var_$64.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_inverse = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 51572L)
    public static SubLObject forward_genlinverse_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genlinverse_pos_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 51697L)
    public static SubLObject forward_genlinverse_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject cdolist_list_var = forward_genlinverse_pos_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            final SubLObject genl_inverse = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject forward_asent = (SubLObject)ConsesLow.list(genl_inverse, arg2, arg1);
            final SubLObject more_supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw83$GENLPREDS, (SubLObject)ConsesLow.list(forward_modules.$const76$genlInverse, pred, genl_inverse), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED));
            forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 52273L)
    public static SubLObject forward_genlinverse_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject all_genl_inverses = cached_all_genl_inverses(pred);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            rule_pred = cycl_utilities.atomic_sentence_predicate(lit);
            if (forward_modules.NIL != variables.fully_bound_p(rule_pred) && forward_modules.NIL == hl_supports.hl_predicate_p(rule_pred) && forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, all_genl_inverses)) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55612L)
    public static SubLObject clear_cached_all_negation_preds() {
        final SubLObject cs = forward_modules.$cached_all_negation_preds_caching_state$.getGlobalValue();
        if (forward_modules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55612L)
    public static SubLObject remove_cached_all_negation_preds(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args(forward_modules.$cached_all_negation_preds_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55612L)
    public static SubLObject cached_all_negation_preds_internal(final SubLObject pred) {
        return negation_predicate.all_negation_preds(pred, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55612L)
    public static SubLObject cached_all_negation_preds(final SubLObject pred) {
        SubLObject caching_state = forward_modules.$cached_all_negation_preds_caching_state$.getGlobalValue();
        if (forward_modules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)forward_modules.$sym96$CACHED_ALL_NEGATION_PREDS, (SubLObject)forward_modules.$sym97$_CACHED_ALL_NEGATION_PREDS_CACHING_STATE_, (SubLObject)forward_modules.$int34$64, (SubLObject)forward_modules.EQL, (SubLObject)forward_modules.ONE_INTEGER, (SubLObject)forward_modules.ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)forward_modules.$sym98$CLEAR_CACHED_ALL_NEGATION_PREDS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_all_negation_preds_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)forward_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55779L)
    public static SubLObject forward_negationpreds_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward_modules.NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread)) {
            final SubLObject pattern = (SubLObject)forward_modules.$list99;
            return formula_pattern_match.formula_matches_pattern(asent, pattern);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 56072L)
    public static SubLObject forward_negationpreds_rule_select(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = cached_all_negation_preds(pred);
        SubLObject negation_pred = (SubLObject)forward_modules.NIL;
        negation_pred = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL == hl_supports.hl_predicate_p(negation_pred)) {
                SubLObject cdolist_list_var_$68 = backward_utilities.relevant_directions();
                SubLObject direction = (SubLObject)forward_modules.NIL;
                direction = cdolist_list_var_$68.first();
                while (forward_modules.NIL != cdolist_list_var_$68) {
                    if (forward_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(negation_pred, (SubLObject)forward_modules.$kw19$POS, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(negation_pred, (SubLObject)forward_modules.$kw19$POS, direction);
                        SubLObject done_var = (SubLObject)forward_modules.NIL;
                        final SubLObject token_var = (SubLObject)forward_modules.NIL;
                        while (forward_modules.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (forward_modules.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                    SubLObject done_var_$69 = (SubLObject)forward_modules.NIL;
                                    final SubLObject token_var_$70 = (SubLObject)forward_modules.NIL;
                                    while (forward_modules.NIL == done_var_$69) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$70);
                                        final SubLObject valid_$71 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$70.eql(rule));
                                        if (forward_modules.NIL != valid_$71 && (forward_modules.NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue(thread) || forward_modules.NIL != list_utilities.lengthG(pragma_induction.rule_pos_lits(rule), (SubLObject)forward_modules.ONE_INTEGER, (SubLObject)forward_modules.UNPROVIDED))) {
                                            rules = (SubLObject)ConsesLow.cons(rule, rules);
                                        }
                                        done_var_$69 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$71);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_modules.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (forward_modules.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                        }
                    }
                    cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                    direction = cdolist_list_var_$68.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            negation_pred = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 56560L)
    public static SubLObject forward_negationpreds_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_negationpreds_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 56681L)
    public static SubLObject forward_negationpreds_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject args = cycl_utilities.atomic_sentence_args(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject cdolist_list_var = forward_negationpreds_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            final SubLObject negation_pred = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject forward_asent = reader.bq_cons(negation_pred, ConsesLow.append(args, (SubLObject)forward_modules.NIL));
            final SubLObject more_supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw100$NEGATIONPREDS, (SubLObject)ConsesLow.list(forward_modules.$const101$negationPreds, pred, negation_pred), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED));
            forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 57218L)
    public static SubLObject forward_negationpreds_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject negation_preds = cached_all_negation_preds(pred);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            rule_pred = cycl_utilities.atomic_sentence_predicate(lit);
            if (forward_modules.NIL != variables.fully_bound_p(rule_pred) && forward_modules.NIL == hl_supports.hl_predicate_p(rule_pred) && forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, negation_preds)) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58221L)
    public static SubLObject clear_cached_all_negation_inverses() {
        final SubLObject cs = forward_modules.$cached_all_negation_inverses_caching_state$.getGlobalValue();
        if (forward_modules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58221L)
    public static SubLObject remove_cached_all_negation_inverses(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args(forward_modules.$cached_all_negation_inverses_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58221L)
    public static SubLObject cached_all_negation_inverses_internal(final SubLObject pred) {
        return negation_predicate.all_negation_inverses(pred, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58221L)
    public static SubLObject cached_all_negation_inverses(final SubLObject pred) {
        SubLObject caching_state = forward_modules.$cached_all_negation_inverses_caching_state$.getGlobalValue();
        if (forward_modules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)forward_modules.$sym104$CACHED_ALL_NEGATION_INVERSES, (SubLObject)forward_modules.$sym105$_CACHED_ALL_NEGATION_INVERSES_CACHING_STATE_, (SubLObject)forward_modules.$int34$64, (SubLObject)forward_modules.EQL, (SubLObject)forward_modules.ONE_INTEGER, (SubLObject)forward_modules.ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)forward_modules.$sym106$CLEAR_CACHED_ALL_NEGATION_INVERSES);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_all_negation_inverses_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)forward_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58394L)
    public static SubLObject forward_negationinverse_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward_modules.NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread)) {
            final SubLObject pattern = (SubLObject)forward_modules.$list107;
            return formula_pattern_match.formula_matches_pattern(asent, pattern);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58697L)
    public static SubLObject forward_negationinverse_rule_select(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = cached_all_negation_inverses(pred);
        SubLObject negation_inverse = (SubLObject)forward_modules.NIL;
        negation_inverse = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL == hl_supports.hl_predicate_p(negation_inverse)) {
                SubLObject cdolist_list_var_$72 = backward_utilities.relevant_directions();
                SubLObject direction = (SubLObject)forward_modules.NIL;
                direction = cdolist_list_var_$72.first();
                while (forward_modules.NIL != cdolist_list_var_$72) {
                    if (forward_modules.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(negation_inverse, (SubLObject)forward_modules.$kw19$POS, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(negation_inverse, (SubLObject)forward_modules.$kw19$POS, direction);
                        SubLObject done_var = (SubLObject)forward_modules.NIL;
                        final SubLObject token_var = (SubLObject)forward_modules.NIL;
                        while (forward_modules.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (forward_modules.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                                    SubLObject done_var_$73 = (SubLObject)forward_modules.NIL;
                                    final SubLObject token_var_$74 = (SubLObject)forward_modules.NIL;
                                    while (forward_modules.NIL == done_var_$73) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$74);
                                        final SubLObject valid_$75 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$74.eql(rule));
                                        if (forward_modules.NIL != valid_$75 && (forward_modules.NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue(thread) || forward_modules.NIL != list_utilities.lengthG(pragma_induction.rule_pos_lits(rule), (SubLObject)forward_modules.ONE_INTEGER, (SubLObject)forward_modules.UNPROVIDED))) {
                                            rules = (SubLObject)ConsesLow.cons(rule, rules);
                                        }
                                        done_var_$73 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$75);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_modules.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (forward_modules.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                        }
                    }
                    cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                    direction = cdolist_list_var_$72.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            negation_inverse = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 59199L)
    public static SubLObject forward_negationinverse_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_negationinverse_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 59324L)
    public static SubLObject forward_negationinverse_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject cdolist_list_var = forward_negationinverse_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            final SubLObject negation_inverse = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject forward_asent = (SubLObject)ConsesLow.list(negation_inverse, arg2, arg1);
            final SubLObject more_supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw100$NEGATIONPREDS, (SubLObject)ConsesLow.list(forward_modules.$const108$negationInverse, pred, negation_inverse), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED));
            forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 59925L)
    public static SubLObject forward_negationinverse_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject all_negation_inverses = cached_all_negation_inverses(pred);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            rule_pred = cycl_utilities.atomic_sentence_predicate(lit);
            if (forward_modules.NIL != variables.fully_bound_p(rule_pred) && forward_modules.NIL == hl_supports.hl_predicate_p(rule_pred) && forward_modules.NIL != list_utilities.member_kbeqP(rule_pred, all_negation_inverses)) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 60766L)
    public static SubLObject forward_eval_exclusive_pos(final SubLObject asent) {
        final SubLObject pattern = (SubLObject)forward_modules.$list111;
        return formula_pattern_match.formula_matches_pattern(asent, pattern);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 60994L)
    public static SubLObject forward_eval_expand_pos(final SubLObject asent, final SubLObject rule) {
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 61336L)
    public static SubLObject forward_eval_exclusive_neg(final SubLObject asent) {
        final SubLObject pattern = (SubLObject)forward_modules.$list111;
        return formula_pattern_match.formula_matches_pattern(asent, pattern);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 61564L)
    public static SubLObject forward_eval_expand_neg(final SubLObject asent, final SubLObject rule) {
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 61983L)
    public static SubLObject forward_term_of_unit_rule_select(final SubLObject asent) {
        final SubLObject function = cycl_utilities.nat_function(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED));
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)forward_modules.NIL;
        direction = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL != kb_mapping_macros.do_function_rule_index_key_validator(function, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(function, direction);
                SubLObject done_var = (SubLObject)forward_modules.NIL;
                final SubLObject token_var = (SubLObject)forward_modules.NIL;
                while (forward_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (forward_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                            SubLObject done_var_$76 = (SubLObject)forward_modules.NIL;
                            final SubLObject token_var_$77 = (SubLObject)forward_modules.NIL;
                            while (forward_modules.NIL == done_var_$76) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$77);
                                final SubLObject valid_$78 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$77.eql(rule));
                                if (forward_modules.NIL != valid_$78) {
                                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                                }
                                done_var_$76 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$78);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (forward_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 62268L)
    public static SubLObject forward_term_of_unit_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_term_of_unit_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 62387L)
    public static SubLObject forward_term_of_unit_expand(final SubLObject asent, final SubLObject rule) {
        SubLObject cdolist_list_var = forward_term_of_unit_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
        SubLObject examine_lit = (SubLObject)forward_modules.NIL;
        examine_lit = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            forward_module_callback(asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, (SubLObject)forward_modules.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 62591L)
    public static SubLObject forward_term_of_unit_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject function = cycl_utilities.nat_function(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED));
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject predicate_var = forward_modules.$const116$termOfUnit;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_function;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_function = cycl_utilities.nat_function(cycl_utilities.atomic_sentence_arg2(lit, (SubLObject)forward_modules.UNPROVIDED));
                if (function.eql(rule_function)) {
                    examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 63397L)
    public static SubLObject forward_nat_function_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules(forward_modules.$const119$natFunction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 63536L)
    public static SubLObject forward_nat_function_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_nat_function_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 63655L)
    public static SubLObject forward_nat_function_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject nart = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)forward_modules.UNPROVIDED);
        final SubLObject function = cycl_utilities.nat_function(formula);
        if (forward_modules.NIL != function) {
            final SubLObject more_supports = removal_modules_natfunction.additional_nat_function_supports();
            final SubLObject forward_asent = (SubLObject)ConsesLow.list(forward_modules.$const119$natFunction, nart, function);
            SubLObject cdolist_list_var = forward_nat_function_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 64150L)
    public static SubLObject forward_nat_function_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject predicate_var = forward_modules.$const119$natFunction;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 64991L)
    public static SubLObject forward_gaf_predicate_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return forward_modules.$gaf_predicate_forward_inference_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 65116L)
    public static SubLObject forward_gaf_predicate_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules(forward_modules.$const122$gafPredicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 65257L)
    public static SubLObject forward_gaf_predicate_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_gaf_predicate_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 65378L)
    public static SubLObject forward_gaf_predicate_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_operator(asent);
        if (forward_modules.NIL != pred) {
            final SubLObject source_gaf = forward.current_forward_inference_gaf();
            final SubLObject source_gaf_mt = (SubLObject)((forward_modules.NIL != source_gaf) ? arguments.support_mt(source_gaf) : forward_modules.NIL);
            final SubLObject trigger_mt = (forward_modules.NIL != source_gaf_mt) ? source_gaf_mt : mt_relevance_macros.$mt$.getDynamicValue(thread);
            final SubLObject forward_asent = el_utilities.make_binary_formula(forward_modules.$const122$gafPredicate, asent, pred);
            final SubLObject trigger_support = arguments.make_hl_support((SubLObject)forward_modules.$kw123$GAF, forward_asent, trigger_mt, (SubLObject)forward_modules.$kw124$TRUE_MON);
            SubLObject cdolist_list_var = forward_gaf_predicate_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                forward_module_callback(forward_asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, trigger_support, rule, (SubLObject)forward_modules.NIL);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 66131L)
    public static SubLObject forward_gaf_predicate_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject predicate_var = forward_modules.$const122$gafPredicate;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 66846L)
    public static SubLObject forward_unbound_pred_pos_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$unbound_rule_backchain_enabled$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 66964L)
    public static SubLObject forward_unbound_pred_pos_rule_select(final SubLObject asent) {
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)forward_modules.NIL;
        direction = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator((SubLObject)forward_modules.$kw17$NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator((SubLObject)forward_modules.$kw17$NEG, direction);
                SubLObject done_var = (SubLObject)forward_modules.NIL;
                final SubLObject token_var = (SubLObject)forward_modules.NIL;
                while (forward_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (forward_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                            SubLObject done_var_$79 = (SubLObject)forward_modules.NIL;
                            final SubLObject token_var_$80 = (SubLObject)forward_modules.NIL;
                            while (forward_modules.NIL == done_var_$79) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$80);
                                final SubLObject valid_$81 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$80.eql(rule));
                                if (forward_modules.NIL != valid_$81) {
                                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                                }
                                done_var_$79 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$81);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (forward_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 67225L)
    public static SubLObject forward_unbound_pred_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_unbound_pred_pos_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 67352L)
    public static SubLObject forward_unbound_pred_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind((SubLObject)forward_modules.T, thread);
            SubLObject cdolist_list_var = forward_unbound_pred_pos_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                forward_module_callback(asent, (SubLObject)forward_modules.$kw19$POS, examine_lit, (SubLObject)forward_modules.NIL, rule, (SubLObject)forward_modules.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 67604L)
    public static SubLObject forward_unbound_pred_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 68355L)
    public static SubLObject forward_unbound_pred_neg_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$unbound_rule_backchain_enabled$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 68473L)
    public static SubLObject forward_unbound_pred_neg_rule_select(final SubLObject asent) {
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)forward_modules.NIL;
        direction = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            if (forward_modules.NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator((SubLObject)forward_modules.$kw19$POS, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator((SubLObject)forward_modules.$kw19$POS, direction);
                SubLObject done_var = (SubLObject)forward_modules.NIL;
                final SubLObject token_var = (SubLObject)forward_modules.NIL;
                while (forward_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (forward_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)forward_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)forward_modules.$kw18$RULE, (SubLObject)forward_modules.NIL, direction);
                            SubLObject done_var_$82 = (SubLObject)forward_modules.NIL;
                            final SubLObject token_var_$83 = (SubLObject)forward_modules.NIL;
                            while (forward_modules.NIL == done_var_$82) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$83);
                                final SubLObject valid_$84 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$83.eql(rule));
                                if (forward_modules.NIL != valid_$84) {
                                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                                }
                                done_var_$82 = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid_$84);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)forward_modules.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (forward_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_modules.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 68734L)
    public static SubLObject forward_unbound_pred_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_unbound_pred_neg_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 68861L)
    public static SubLObject forward_unbound_pred_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind((SubLObject)forward_modules.T, thread);
            SubLObject cdolist_list_var = forward_unbound_pred_neg_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                forward_module_callback(asent, (SubLObject)forward_modules.$kw17$NEG, examine_lit, (SubLObject)forward_modules.NIL, rule, (SubLObject)forward_modules.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 69113L)
    public static SubLObject forward_unbound_pred_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.pos_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 70027L)
    public static SubLObject forward_assertive_wff_unbound_pred_pos_required(final SubLObject asent) {
        return wff_vars.wff_assertiveP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 70143L)
    public static SubLObject forward_assertive_wff_unbound_pred_pos_rule_select(final SubLObject asent) {
        SubLObject rules = (SubLObject)forward_modules.NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = (SubLObject)forward_modules.NIL;
        direction = cdolist_list_var.first();
        while (forward_modules.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$85 = wff.assertive_wff_rules();
            SubLObject rule = (SubLObject)forward_modules.NIL;
            rule = cdolist_list_var_$85.first();
            while (forward_modules.NIL != cdolist_list_var_$85) {
                if (direction.eql(assertions_high.assertion_direction(rule))) {
                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                }
                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                rule = cdolist_list_var_$85.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 70450L)
    public static SubLObject forward_assertive_wff_unbound_pred_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_unbound_pred_pos_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 70591L)
    public static SubLObject forward_assertive_wff_unbound_pred_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject trigger_gaf = forward.current_forward_inference_gaf();
        if (forward_modules.NIL != trigger_gaf && forward_modules.NIL != wff.strictly_wff_in_all_spec_mtsP(asent, arguments.support_mt(trigger_gaf), (SubLObject)forward_modules.UNPROVIDED)) {
            return (SubLObject)forward_modules.NIL;
        }
        return forward_unbound_pred_pos_expand(asent, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 71202L)
    public static SubLObject forward_ist_pos_rule_select(final SubLObject asent) {
        return all_ist_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 71332L)
    public static SubLObject forward_ist_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_ist_pos_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 71441L)
    public static SubLObject forward_ist_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject trigger_assertion = forward.current_forward_inference_assertion();
        if (forward_modules.NIL != trigger_assertion) {
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject mt = arguments.support_mt(trigger_assertion);
            final SubLObject args = cycl_utilities.atomic_sentence_args(asent, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject cdolist_list_var = forward_ist_pos_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                final SubLObject genl_pred = cycl_utilities.atomic_sentence_predicate(cycl_utilities.atomic_sentence_arg2(examine_lit, (SubLObject)forward_modules.UNPROVIDED));
                final SubLObject forward_asent = reader.bq_cons(genl_pred, ConsesLow.append(args, (SubLObject)forward_modules.NIL));
                final SubLObject more_supports = (SubLObject)((forward_modules.NIL != kb_utilities.kbeq(pred, genl_pred)) ? forward_modules.NIL : ConsesLow.list(arguments.make_hl_support((SubLObject)forward_modules.$kw83$GENLPREDS, (SubLObject)ConsesLow.list(forward_modules.$const75$genlPreds, pred, genl_pred), (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)));
                final SubLObject trigger_support = arguments.make_hl_support((SubLObject)forward_modules.$kw9$QUERY, arguments.support_el_ist_sentence(trigger_assertion), forward_modules.$const133$BaseKB, (SubLObject)forward_modules.UNPROVIDED);
                forward_module_callback(el_utilities.make_ist_sentence(mt, forward_asent), (SubLObject)forward_modules.$kw19$POS, examine_lit, trigger_support, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 72303L)
    public static SubLObject forward_ist_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject sub_sentence;
        SubLObject sub_pred;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.NIL != el_utilities.ist_sentence_p(lit, kb_indexing.spec_preds_of_ist_indexing_enabledP())) {
                sub_sentence = el_utilities.literal_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL == el_utilities.el_negation_p(sub_sentence)) {
                    sub_pred = el_utilities.literal_predicate(sub_sentence, (SubLObject)forward_modules.UNPROVIDED);
                    if (forward_modules.NIL != forts.fort_p(sub_pred) && forward_modules.NIL != genl_predicates.genl_predP(pred, sub_pred, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)) {
                        examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                    }
                }
            }
        }
        cnf_var = assertions_high.assertion_cnf(rule);
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.pos_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (forward_modules.NIL != el_utilities.ist_sentence_p(lit, kb_indexing.spec_preds_of_ist_indexing_enabledP())) {
                sub_sentence = el_utilities.literal_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != el_utilities.el_negation_p(sub_sentence)) {
                    sub_pred = el_utilities.literal_predicate(sub_sentence, (SubLObject)forward_modules.UNPROVIDED);
                    if (forward_modules.NIL != forts.fort_p(sub_pred) && forward_modules.NIL != genl_predicates.genl_predP(pred, sub_pred, (SubLObject)forward_modules.UNPROVIDED, (SubLObject)forward_modules.UNPROVIDED)) {
                        examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                    }
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 73628L)
    public static SubLObject forward_ist_neg_rule_select(final SubLObject asent) {
        return all_ist_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 73758L)
    public static SubLObject forward_ist_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_ist_neg_expand_int(asent, rule, (SubLObject)forward_modules.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 73867L)
    public static SubLObject forward_ist_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject trigger_assertion = forward.current_forward_inference_assertion();
        if (forward_modules.NIL != trigger_assertion) {
            final SubLObject mt = arguments.support_mt(trigger_assertion);
            SubLObject cdolist_list_var = forward_ist_neg_expand_int(asent, rule, (SubLObject)forward_modules.UNPROVIDED);
            SubLObject examine_lit = (SubLObject)forward_modules.NIL;
            examine_lit = cdolist_list_var.first();
            while (forward_modules.NIL != cdolist_list_var) {
                final SubLObject trigger_support = arguments.make_hl_support((SubLObject)forward_modules.$kw9$QUERY, arguments.support_el_ist_sentence(trigger_assertion), forward_modules.$const133$BaseKB, (SubLObject)forward_modules.UNPROVIDED);
                forward_module_callback(el_utilities.make_ist_sentence(mt, el_utilities.make_negation(asent)), (SubLObject)forward_modules.$kw19$POS, examine_lit, trigger_support, rule, (SubLObject)forward_modules.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            }
        }
        return (SubLObject)forward_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 74385L)
    public static SubLObject forward_ist_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == forward_modules.UNPROVIDED) {
            booleanP = (SubLObject)forward_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = (SubLObject)forward_modules.NIL;
        SubLObject predicate_var = forward_modules.$const136$ist;
        SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject sub_sentence;
        SubLObject sub_pred;
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.pos_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                sub_sentence = el_utilities.literal_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL == el_utilities.el_negation_p(sub_sentence)) {
                    sub_pred = el_utilities.literal_predicate(sub_sentence, (SubLObject)forward_modules.UNPROVIDED);
                    if (pred.eql(sub_pred)) {
                        examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                    }
                }
            }
        }
        predicate_var = forward_modules.$const136$ist;
        cnf_var = assertions_high.assertion_cnf(rule);
        for (rest = (SubLObject)forward_modules.NIL, rest = clauses.neg_lits(cnf_var); (forward_modules.NIL == booleanP || forward_modules.NIL == examine_lits) && forward_modules.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                sub_sentence = el_utilities.literal_arg2(lit, (SubLObject)forward_modules.UNPROVIDED);
                if (forward_modules.NIL != el_utilities.el_negation_p(sub_sentence)) {
                    sub_pred = el_utilities.literal_predicate(sub_sentence, (SubLObject)forward_modules.UNPROVIDED);
                    if (pred.eql(sub_pred)) {
                        examine_lits = (SubLObject)ConsesLow.cons(lit, examine_lits);
                    }
                }
            }
        }
        return (forward_modules.NIL != booleanP) ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }
    
    public static SubLObject declare_forward_modules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_modules", "FORWARD-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_module_count", "FORWARD-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_module_p", "FORWARD-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_module", "FORWARD-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "undeclare_forward_module", "UNDECLARE-FORWARD-MODULE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.forward_modules", "do_forward_modules", "DO-FORWARD-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "do_forward_modules_list", "DO-FORWARD-MODULES-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_examine_asent_triggering_allowedP", "FORWARD-EXAMINE-ASENT-TRIGGERING-ALLOWED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_module_callback", "FORWARD-MODULE-CALLBACK", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_tactic_specs", "FORWARD-TACTIC-SPECS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_tactic_spec_rule", "FORWARD-TACTIC-SPEC-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_tactic_specL", "FORWARD-TACTIC-SPEC<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_hl_modules", "FORWARD-HL-MODULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_hl_module_apply", "FORWARD-HL-MODULE-APPLY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_inference_rule_select_via_allowed_rulesP", "FORWARD-INFERENCE-RULE-SELECT-VIA-ALLOWED-RULES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_hl_module_rule_select", "FORWARD-HL-MODULE-RULE-SELECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_hl_module_rule_filter", "FORWARD-HL-MODULE-RULE-FILTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_hl_module_expand", "FORWARD-HL-MODULE-EXPAND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "all_antecedent_predicate_forward_rules", "ALL-ANTECEDENT-PREDICATE-FORWARD-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "all_consequent_predicate_forward_rules", "ALL-CONSEQUENT-PREDICATE-FORWARD-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "all_ist_predicate_forward_rules", "ALL-IST-PREDICATE-FORWARD-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_normal_pos_rule_select", "FORWARD-NORMAL-POS-RULE-SELECT", 1, 0, false);
        new $forward_normal_pos_rule_select$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_normal_pos_rule_filter", "FORWARD-NORMAL-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_normal_pos_expand", "FORWARD-NORMAL-POS-EXPAND", 2, 0, false);
        new $forward_normal_pos_expand$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_normal_pos_expand_int", "FORWARD-NORMAL-POS-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_normal_neg_rule_select", "FORWARD-NORMAL-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_normal_neg_rule_filter", "FORWARD-NORMAL-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_normal_neg_expand", "FORWARD-NORMAL-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_normal_neg_expand_int", "FORWARD-NORMAL-NEG-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_isa_rule_select", "FORWARD-ISA-RULE-SELECT", 1, 0, false);
        new $forward_isa_rule_select$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_isa_rule_filter", "FORWARD-ISA-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_isa_expand", "FORWARD-ISA-EXPAND", 2, 0, false);
        new $forward_isa_expand$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_isa_expand_int", "FORWARD-ISA-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_inference_genlP", "FORWARD-INFERENCE-GENL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_inference_all_genls_internal", "FORWARD-INFERENCE-ALL-GENLS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_inference_all_genls", "FORWARD-INFERENCE-ALL-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "clear_cached_all_specs", "CLEAR-CACHED-ALL-SPECS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "remove_cached_all_specs", "REMOVE-CACHED-ALL-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_specs_internal", "CACHED-ALL-SPECS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_specs", "CACHED-ALL-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_isa_rule_select", "FORWARD-NOT-ISA-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_isa_rule_filter", "FORWARD-NOT-ISA-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_isa_expand", "FORWARD-NOT-ISA-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_isa_expand_int", "FORWARD-NOT-ISA-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_quoted_isa_rule_select", "FORWARD-QUOTED-ISA-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_quoted_isa_rule_filter", "FORWARD-QUOTED-ISA-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_quoted_isa_expand", "FORWARD-QUOTED-ISA-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_quoted_isa_expand_int", "FORWARD-QUOTED-ISA-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_quoted_isa_rule_select", "FORWARD-NOT-QUOTED-ISA-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_quoted_isa_rule_filter", "FORWARD-NOT-QUOTED-ISA-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_quoted_isa_expand", "FORWARD-NOT-QUOTED-ISA-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_quoted_isa_expand_int", "FORWARD-NOT-QUOTED-ISA-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genls_rule_select", "FORWARD-GENLS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genls_rule_filter", "FORWARD-GENLS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genls_expand", "FORWARD-GENLS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genls_expand_int", "FORWARD-GENLS-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genls_rule_select", "FORWARD-NOT-GENLS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genls_rule_filter", "FORWARD-NOT-GENLS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genls_expand", "FORWARD-NOT-GENLS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genls_expand_int", "FORWARD-NOT-GENLS-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "clear_cached_all_genl_mts", "CLEAR-CACHED-ALL-GENL-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "remove_cached_all_genl_mts", "REMOVE-CACHED-ALL-GENL-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_genl_mts_internal", "CACHED-ALL-GENL-MTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_genl_mts", "CACHED-ALL-GENL-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlmt_rule_select", "FORWARD-GENLMT-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlmt_rule_filter", "FORWARD-GENLMT-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlmt_expand", "FORWARD-GENLMT-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlmt_expand_int", "FORWARD-GENLMT-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "clear_cached_all_spec_mts", "CLEAR-CACHED-ALL-SPEC-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "remove_cached_all_spec_mts", "REMOVE-CACHED-ALL-SPEC-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_spec_mts_internal", "CACHED-ALL-SPEC-MTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_spec_mts", "CACHED-ALL-SPEC-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genlmt_rule_select", "FORWARD-NOT-GENLMT-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genlmt_rule_filter", "FORWARD-NOT-GENLMT-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genlmt_expand", "FORWARD-NOT-GENLMT-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genlmt_expand_int", "FORWARD-NOT-GENLMT-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_symmetric_pos_rule_select", "FORWARD-SYMMETRIC-POS-RULE-SELECT", 1, 0, false);
        new $forward_symmetric_pos_rule_select$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_symmetric_pos_rule_filter", "FORWARD-SYMMETRIC-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_symmetric_pos_expand", "FORWARD-SYMMETRIC-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_symmetric_pos_expand_int", "FORWARD-SYMMETRIC-POS-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_symmetric_neg_rule_select", "FORWARD-SYMMETRIC-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_symmetric_neg_rule_filter", "FORWARD-SYMMETRIC-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_symmetric_neg_expand", "FORWARD-SYMMETRIC-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_symmetric_neg_expand_int", "FORWARD-SYMMETRIC-NEG-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_asymmetric_required", "FORWARD-ASYMMETRIC-REQUIRED", 1, 0, false);
        new $forward_asymmetric_required$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_asymmetric_rule_select", "FORWARD-ASYMMETRIC-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_asymmetric_rule_filter", "FORWARD-ASYMMETRIC-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_asymmetric_expand", "FORWARD-ASYMMETRIC-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_asymmetric_expand_int", "FORWARD-ASYMMETRIC-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_commutative_pos_rule_select", "FORWARD-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_commutative_pos_rule_filter", "FORWARD-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_commutative_pos_expand", "FORWARD-COMMUTATIVE-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_commutative_pos_expand_int", "FORWARD-COMMUTATIVE-POS-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_commutative_neg_rule_select", "FORWARD-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_commutative_neg_rule_filter", "FORWARD-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_commutative_neg_expand", "FORWARD-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_commutative_neg_expand_int", "FORWARD-COMMUTATIVE-NEG-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlpreds_gaf_rule_select", "FORWARD-GENLPREDS-GAF-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "clear_cached_all_genl_preds", "CLEAR-CACHED-ALL-GENL-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "remove_cached_all_genl_preds", "REMOVE-CACHED-ALL-GENL-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_genl_preds_internal", "CACHED-ALL-GENL-PREDS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_genl_preds", "CACHED-ALL-GENL-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "clear_cached_all_genl_inverses", "CLEAR-CACHED-ALL-GENL-INVERSES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "remove_cached_all_genl_inverses", "REMOVE-CACHED-ALL-GENL-INVERSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_genl_inverses_internal", "CACHED-ALL-GENL-INVERSES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_genl_inverses", "CACHED-ALL-GENL-INVERSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlpreds_gaf_rule_filter", "FORWARD-GENLPREDS-GAF-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlpreds_gaf_expand", "FORWARD-GENLPREDS-GAF-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlpreds_gaf_expand_int", "FORWARD-GENLPREDS-GAF-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genlpreds_gaf_rule_select", "FORWARD-NOT-GENLPREDS-GAF-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genlpreds_gaf_rule_filter", "FORWARD-NOT-GENLPREDS-GAF-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genlpreds_gaf_expand", "FORWARD-NOT-GENLPREDS-GAF-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlpreds_pos_rule_select", "FORWARD-GENLPREDS-POS-RULE-SELECT", 1, 0, false);
        new $forward_genlpreds_pos_rule_select$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlpreds_pos_rule_filter", "FORWARD-GENLPREDS-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlpreds_pos_expand", "FORWARD-GENLPREDS-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlpreds_pos_expand_int", "FORWARD-GENLPREDS-POS-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlinverse_gaf_rule_select", "FORWARD-GENLINVERSE-GAF-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlinverse_gaf_rule_filter", "FORWARD-GENLINVERSE-GAF-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlinverse_gaf_expand", "FORWARD-GENLINVERSE-GAF-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlinverse_gaf_expand_int", "FORWARD-GENLINVERSE-GAF-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genlinverse_gaf_rule_select", "FORWARD-NOT-GENLINVERSE-GAF-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genlinverse_gaf_rule_filter", "FORWARD-NOT-GENLINVERSE-GAF-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_not_genlinverse_gaf_expand", "FORWARD-NOT-GENLINVERSE-GAF-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlinverse_pos_rule_select", "FORWARD-GENLINVERSE-POS-RULE-SELECT", 1, 0, false);
        new $forward_genlinverse_pos_rule_select$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlinverse_pos_rule_filter", "FORWARD-GENLINVERSE-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlinverse_pos_expand", "FORWARD-GENLINVERSE-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_genlinverse_pos_expand_int", "FORWARD-GENLINVERSE-POS-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "clear_cached_all_negation_preds", "CLEAR-CACHED-ALL-NEGATION-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "remove_cached_all_negation_preds", "REMOVE-CACHED-ALL-NEGATION-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_negation_preds_internal", "CACHED-ALL-NEGATION-PREDS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_negation_preds", "CACHED-ALL-NEGATION-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_negationpreds_required", "FORWARD-NEGATIONPREDS-REQUIRED", 1, 0, false);
        new $forward_negationpreds_required$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_negationpreds_rule_select", "FORWARD-NEGATIONPREDS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_negationpreds_rule_filter", "FORWARD-NEGATIONPREDS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_negationpreds_expand", "FORWARD-NEGATIONPREDS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_negationpreds_expand_int", "FORWARD-NEGATIONPREDS-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "clear_cached_all_negation_inverses", "CLEAR-CACHED-ALL-NEGATION-INVERSES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "remove_cached_all_negation_inverses", "REMOVE-CACHED-ALL-NEGATION-INVERSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_negation_inverses_internal", "CACHED-ALL-NEGATION-INVERSES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "cached_all_negation_inverses", "CACHED-ALL-NEGATION-INVERSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_negationinverse_required", "FORWARD-NEGATIONINVERSE-REQUIRED", 1, 0, false);
        new $forward_negationinverse_required$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_negationinverse_rule_select", "FORWARD-NEGATIONINVERSE-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_negationinverse_rule_filter", "FORWARD-NEGATIONINVERSE-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_negationinverse_expand", "FORWARD-NEGATIONINVERSE-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_negationinverse_expand_int", "FORWARD-NEGATIONINVERSE-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_eval_exclusive_pos", "FORWARD-EVAL-EXCLUSIVE-POS", 1, 0, false);
        new $forward_eval_exclusive_pos$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_eval_expand_pos", "FORWARD-EVAL-EXPAND-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_eval_exclusive_neg", "FORWARD-EVAL-EXCLUSIVE-NEG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_eval_expand_neg", "FORWARD-EVAL-EXPAND-NEG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_term_of_unit_rule_select", "FORWARD-TERM-OF-UNIT-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_term_of_unit_rule_filter", "FORWARD-TERM-OF-UNIT-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_term_of_unit_expand", "FORWARD-TERM-OF-UNIT-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_term_of_unit_expand_int", "FORWARD-TERM-OF-UNIT-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_nat_function_rule_select", "FORWARD-NAT-FUNCTION-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_nat_function_rule_filter", "FORWARD-NAT-FUNCTION-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_nat_function_expand", "FORWARD-NAT-FUNCTION-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_nat_function_expand_int", "FORWARD-NAT-FUNCTION-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_gaf_predicate_required", "FORWARD-GAF-PREDICATE-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_gaf_predicate_rule_select", "FORWARD-GAF-PREDICATE-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_gaf_predicate_rule_filter", "FORWARD-GAF-PREDICATE-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_gaf_predicate_expand", "FORWARD-GAF-PREDICATE-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_gaf_predicate_expand_int", "FORWARD-GAF-PREDICATE-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_unbound_pred_pos_required", "FORWARD-UNBOUND-PRED-POS-REQUIRED", 1, 0, false);
        new $forward_unbound_pred_pos_required$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_unbound_pred_pos_rule_select", "FORWARD-UNBOUND-PRED-POS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_unbound_pred_pos_rule_filter", "FORWARD-UNBOUND-PRED-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_unbound_pred_pos_expand", "FORWARD-UNBOUND-PRED-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_unbound_pred_pos_expand_int", "FORWARD-UNBOUND-PRED-POS-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_unbound_pred_neg_required", "FORWARD-UNBOUND-PRED-NEG-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_unbound_pred_neg_rule_select", "FORWARD-UNBOUND-PRED-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_unbound_pred_neg_rule_filter", "FORWARD-UNBOUND-PRED-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_unbound_pred_neg_expand", "FORWARD-UNBOUND-PRED-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_unbound_pred_neg_expand_int", "FORWARD-UNBOUND-PRED-NEG-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_assertive_wff_unbound_pred_pos_required", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_assertive_wff_unbound_pred_pos_rule_select", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_assertive_wff_unbound_pred_pos_rule_filter", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_assertive_wff_unbound_pred_pos_expand", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_ist_pos_rule_select", "FORWARD-IST-POS-RULE-SELECT", 1, 0, false);
        new $forward_ist_pos_rule_select$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_ist_pos_rule_filter", "FORWARD-IST-POS-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_ist_pos_expand", "FORWARD-IST-POS-EXPAND", 2, 0, false);
        new $forward_ist_pos_expand$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_ist_pos_expand_int", "FORWARD-IST-POS-EXPAND-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_ist_neg_rule_select", "FORWARD-IST-NEG-RULE-SELECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_ist_neg_rule_filter", "FORWARD-IST-NEG-RULE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_ist_neg_expand", "FORWARD-IST-NEG-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.forward_modules", "forward_ist_neg_expand_int", "FORWARD-IST-NEG-EXPAND-INT", 2, 1, false);
        return (SubLObject)forward_modules.NIL;
    }
    
    public static SubLObject init_forward_modules_file() {
        forward_modules.$forward_modules$ = SubLFiles.defparameter("*FORWARD-MODULES*", (SubLObject)forward_modules.NIL);
        forward_modules.$forward_tactic_specs$ = SubLFiles.defparameter("*FORWARD-TACTIC-SPECS*", (SubLObject)forward_modules.NIL);
        forward_modules.$prevent_forward_triggering_via_evaluatable_predicate_antecedent_literalsP$ = SubLFiles.defparameter("*PREVENT-FORWARD-TRIGGERING-VIA-EVALUATABLE-PREDICATE-ANTECEDENT-LITERALS?*", (SubLObject)forward_modules.T);
        forward_modules.$cached_all_specs_caching_state$ = SubLFiles.deflexical("*CACHED-ALL-SPECS-CACHING-STATE*", (SubLObject)forward_modules.NIL);
        forward_modules.$cached_all_genl_mts_caching_state$ = SubLFiles.deflexical("*CACHED-ALL-GENL-MTS-CACHING-STATE*", (SubLObject)forward_modules.NIL);
        forward_modules.$cached_all_spec_mts_caching_state$ = SubLFiles.deflexical("*CACHED-ALL-SPEC-MTS-CACHING-STATE*", (SubLObject)forward_modules.NIL);
        forward_modules.$cached_all_genl_preds_caching_state$ = SubLFiles.deflexical("*CACHED-ALL-GENL-PREDS-CACHING-STATE*", (SubLObject)forward_modules.NIL);
        forward_modules.$cached_all_genl_inverses_caching_state$ = SubLFiles.deflexical("*CACHED-ALL-GENL-INVERSES-CACHING-STATE*", (SubLObject)forward_modules.NIL);
        forward_modules.$cached_all_negation_preds_caching_state$ = SubLFiles.deflexical("*CACHED-ALL-NEGATION-PREDS-CACHING-STATE*", (SubLObject)forward_modules.NIL);
        forward_modules.$cached_all_negation_inverses_caching_state$ = SubLFiles.deflexical("*CACHED-ALL-NEGATION-INVERSES-CACHING-STATE*", (SubLObject)forward_modules.NIL);
        forward_modules.$gaf_predicate_forward_inference_enabledP$ = SubLFiles.defvar("*GAF-PREDICATE-FORWARD-INFERENCE-ENABLED?*", (SubLObject)forward_modules.NIL);
        return (SubLObject)forward_modules.NIL;
    }
    
    public static SubLObject setup_forward_modules_file() {
        access_macros.register_macro_helper((SubLObject)forward_modules.$sym7$DO_FORWARD_MODULES_LIST, (SubLObject)forward_modules.$sym8$DO_FORWARD_MODULES);
        forward_module((SubLObject)forward_modules.$kw20$FORWARD_NORMAL_POS, (SubLObject)forward_modules.$list21);
        forward_module((SubLObject)forward_modules.$kw22$FORWARD_NORMAL_NEG, (SubLObject)forward_modules.$list23);
        forward_module((SubLObject)forward_modules.$kw24$FORWARD_ISA, (SubLObject)forward_modules.$list25);
        memoization_state.note_memoized_function((SubLObject)forward_modules.$sym29$FORWARD_INFERENCE_ALL_GENLS);
        forward_module((SubLObject)forward_modules.$kw30$FORWARD_NOT_ISA, (SubLObject)forward_modules.$list31);
        memoization_state.note_globally_cached_function((SubLObject)forward_modules.$sym32$CACHED_ALL_SPECS);
        forward_module((SubLObject)forward_modules.$kw36$FORWARD_QUOTED_ISA, (SubLObject)forward_modules.$list37);
        forward_module((SubLObject)forward_modules.$kw39$FORWARD_NOT_QUOTED_ISA, (SubLObject)forward_modules.$list40);
        forward_module((SubLObject)forward_modules.$kw41$FORWARD_GENLS, (SubLObject)forward_modules.$list42);
        forward_module((SubLObject)forward_modules.$kw43$FORWARD_NOT_GENLS, (SubLObject)forward_modules.$list44);
        forward_module((SubLObject)forward_modules.$kw45$FORWARD_GENLMT, (SubLObject)forward_modules.$list46);
        memoization_state.note_globally_cached_function((SubLObject)forward_modules.$sym47$CACHED_ALL_GENL_MTS);
        forward_module((SubLObject)forward_modules.$kw52$FORWARD_NOT_GENLMT, (SubLObject)forward_modules.$list53);
        memoization_state.note_globally_cached_function((SubLObject)forward_modules.$sym54$CACHED_ALL_SPEC_MTS);
        forward_module((SubLObject)forward_modules.$kw57$FORWARD_SYMMETRIC_POS, (SubLObject)forward_modules.$list58);
        forward_module((SubLObject)forward_modules.$kw61$FORWARD_SYMMETRIC_NEG, (SubLObject)forward_modules.$list62);
        forward_module((SubLObject)forward_modules.$kw63$FORWARD_ASYMMETRIC, (SubLObject)forward_modules.$list64);
        forward_module((SubLObject)forward_modules.$kw67$FORWARD_COMMUTATIVE_POS, (SubLObject)forward_modules.$list68);
        forward_module((SubLObject)forward_modules.$kw71$FORWARD_COMMUTATIVE_NEG, (SubLObject)forward_modules.$list72);
        forward_module((SubLObject)forward_modules.$kw73$FORWARD_GENLPREDS_GAF, (SubLObject)forward_modules.$list74);
        memoization_state.note_globally_cached_function((SubLObject)forward_modules.$sym77$CACHED_ALL_GENL_PREDS);
        memoization_state.note_globally_cached_function((SubLObject)forward_modules.$sym80$CACHED_ALL_GENL_INVERSES);
        forward_module((SubLObject)forward_modules.$kw84$FORWARD_NOT_GENLPREDS_GAF, (SubLObject)forward_modules.$list85);
        forward_module((SubLObject)forward_modules.$kw86$FORWARD_GENLPREDS_POS, (SubLObject)forward_modules.$list87);
        forward_module((SubLObject)forward_modules.$kw88$FORWARD_GENLINVERSE_GAF, (SubLObject)forward_modules.$list89);
        forward_module((SubLObject)forward_modules.$kw90$FORWARD_NOT_GENLINVERSE_GAF, (SubLObject)forward_modules.$list91);
        forward_module((SubLObject)forward_modules.$kw92$FORWARD_GENLINVERSE_POS, (SubLObject)forward_modules.$list93);
        forward_module((SubLObject)forward_modules.$kw94$FORWARD_NEGATIONPREDS, (SubLObject)forward_modules.$list95);
        memoization_state.note_globally_cached_function((SubLObject)forward_modules.$sym96$CACHED_ALL_NEGATION_PREDS);
        forward_module((SubLObject)forward_modules.$kw102$FORWARD_NEGATIONINVERSE, (SubLObject)forward_modules.$list103);
        memoization_state.note_globally_cached_function((SubLObject)forward_modules.$sym104$CACHED_ALL_NEGATION_INVERSES);
        forward_module((SubLObject)forward_modules.$kw109$FORWARD_EVAL_POS, (SubLObject)forward_modules.$list110);
        forward_module((SubLObject)forward_modules.$kw112$FORWARD_EVAL_NEG, (SubLObject)forward_modules.$list113);
        forward_module((SubLObject)forward_modules.$kw114$FORWARD_TERM_OF_UNIT, (SubLObject)forward_modules.$list115);
        forward_module((SubLObject)forward_modules.$kw117$FORWARD_NAT_FUNCTION, (SubLObject)forward_modules.$list118);
        forward_module((SubLObject)forward_modules.$kw120$FORWARD_GAF_PREDICATE, (SubLObject)forward_modules.$list121);
        forward_module((SubLObject)forward_modules.$kw125$FORWARD_UNBOUND_PRED_POS, (SubLObject)forward_modules.$list126);
        forward_module((SubLObject)forward_modules.$kw127$FORWARD_UNBOUND_PRED_NEG, (SubLObject)forward_modules.$list128);
        forward_module((SubLObject)forward_modules.$kw129$FORWARD_ASSERTIVE_WFF_UNBOUND_PRED_POS, (SubLObject)forward_modules.$list130);
        forward_module((SubLObject)forward_modules.$kw131$FORWARD_IST_POS, (SubLObject)forward_modules.$list132);
        forward_module((SubLObject)forward_modules.$kw134$FORWARD_IST_NEG, (SubLObject)forward_modules.$list135);
        return (SubLObject)forward_modules.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_forward_modules_file();
    }
    
    @Override
	public void initializeVariables() {
        init_forward_modules_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_forward_modules_file();
    }
    
    static {
        me = (SubLFile)new forward_modules();
        forward_modules.$forward_modules$ = null;
        forward_modules.$forward_tactic_specs$ = null;
        forward_modules.$prevent_forward_triggering_via_evaluatable_predicate_antecedent_literalsP$ = null;
        forward_modules.$cached_all_specs_caching_state$ = null;
        forward_modules.$cached_all_genl_mts_caching_state$ = null;
        forward_modules.$cached_all_spec_mts_caching_state$ = null;
        forward_modules.$cached_all_genl_preds_caching_state$ = null;
        forward_modules.$cached_all_genl_inverses_caching_state$ = null;
        forward_modules.$cached_all_negation_preds_caching_state$ = null;
        forward_modules.$cached_all_negation_inverses_caching_state$ = null;
        forward_modules.$gaf_predicate_forward_inference_enabledP$ = null;
        $kw0$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw3$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw4$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym5$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-FORWARD-MODULES-LIST"));
        $sym7$DO_FORWARD_MODULES_LIST = SubLObjectFactory.makeSymbol("DO-FORWARD-MODULES-LIST");
        $sym8$DO_FORWARD_MODULES = SubLObjectFactory.makeSymbol("DO-FORWARD-MODULES");
        $kw9$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $sym10$TMS_ASSERTION_BEING_REMOVED_ = SubLObjectFactory.makeSymbol("TMS-ASSERTION-BEING-REMOVED?");
        $sym11$FORWARD_TACTIC_SPEC_RULE = SubLObjectFactory.makeSymbol("FORWARD-TACTIC-SPEC-RULE");
        $sym12$FORWARD_TACTIC_SPEC_ = SubLObjectFactory.makeSymbol("FORWARD-TACTIC-SPEC<");
        $sym13$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $kw14$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw15$FORWARD_TACTIC_SPECS = SubLObjectFactory.makeKeyword("FORWARD-TACTIC-SPECS");
        $kw16$NO_RULE = SubLObjectFactory.makeKeyword("NO-RULE");
        $kw17$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw18$RULE = SubLObjectFactory.makeKeyword("RULE");
        $kw19$POS = SubLObjectFactory.makeKeyword("POS");
        $kw20$FORWARD_NORMAL_POS = SubLObjectFactory.makeKeyword("FORWARD-NORMAL-POS");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("RULE-SELECT"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-NORMAL-POS-RULE-SELECT"), (SubLObject)SubLObjectFactory.makeKeyword("RULE-FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-NORMAL-POS-RULE-FILTER"), (SubLObject)SubLObjectFactory.makeKeyword("EXPAND"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-NORMAL-POS-EXPAND"));
        $kw22$FORWARD_NORMAL_NEG = SubLObjectFactory.makeKeyword("FORWARD-NORMAL-NEG");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("NEG"), (SubLObject)SubLObjectFactory.makeKeyword("RULE-SELECT"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-NORMAL-NEG-RULE-SELECT"), (SubLObject)SubLObjectFactory.makeKeyword("RULE-FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-NORMAL-NEG-RULE-FILTER"), (SubLObject)SubLObjectFactory.makeKeyword("EXPAND"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-NORMAL-NEG-EXPAND"));
        $kw24$FORWARD_ISA = SubLObjectFactory.makeKeyword("FORWARD-ISA");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-ISA-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-ISA-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-ISA-EXPAND") });
        $const26$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw27$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $const28$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym29$FORWARD_INFERENCE_ALL_GENLS = SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-ALL-GENLS");
        $kw30$FORWARD_NOT_ISA = SubLObjectFactory.makeKeyword("FORWARD-NOT-ISA");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-NOT-ISA-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-NOT-ISA-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-NOT-ISA-EXPAND") });
        $sym32$CACHED_ALL_SPECS = SubLObjectFactory.makeSymbol("CACHED-ALL-SPECS");
        $sym33$_CACHED_ALL_SPECS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-ALL-SPECS-CACHING-STATE*");
        $int34$64 = SubLObjectFactory.makeInteger(64);
        $sym35$CLEAR_CACHED_ALL_SPECS = SubLObjectFactory.makeSymbol("CLEAR-CACHED-ALL-SPECS");
        $kw36$FORWARD_QUOTED_ISA = SubLObjectFactory.makeKeyword("FORWARD-QUOTED-ISA");
        $list37 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-QUOTED-ISA-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-QUOTED-ISA-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-QUOTED-ISA-EXPAND") });
        $const38$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $kw39$FORWARD_NOT_QUOTED_ISA = SubLObjectFactory.makeKeyword("FORWARD-NOT-QUOTED-ISA");
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-NOT-QUOTED-ISA-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-NOT-QUOTED-ISA-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-NOT-QUOTED-ISA-EXPAND") });
        $kw41$FORWARD_GENLS = SubLObjectFactory.makeKeyword("FORWARD-GENLS");
        $list42 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-GENLS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-GENLS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-GENLS-EXPAND") });
        $kw43$FORWARD_NOT_GENLS = SubLObjectFactory.makeKeyword("FORWARD-NOT-GENLS");
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLS-EXPAND") });
        $kw45$FORWARD_GENLMT = SubLObjectFactory.makeKeyword("FORWARD-GENLMT");
        $list46 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-GENLMT-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-GENLMT-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-GENLMT-EXPAND") });
        $sym47$CACHED_ALL_GENL_MTS = SubLObjectFactory.makeSymbol("CACHED-ALL-GENL-MTS");
        $sym48$_CACHED_ALL_GENL_MTS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-ALL-GENL-MTS-CACHING-STATE*");
        $sym49$CLEAR_CACHED_ALL_GENL_MTS = SubLObjectFactory.makeSymbol("CLEAR-CACHED-ALL-GENL-MTS");
        $const50$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $kw51$GENLMT = SubLObjectFactory.makeKeyword("GENLMT");
        $kw52$FORWARD_NOT_GENLMT = SubLObjectFactory.makeKeyword("FORWARD-NOT-GENLMT");
        $list53 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLMT-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLMT-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLMT-EXPAND") });
        $sym54$CACHED_ALL_SPEC_MTS = SubLObjectFactory.makeSymbol("CACHED-ALL-SPEC-MTS");
        $sym55$_CACHED_ALL_SPEC_MTS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-ALL-SPEC-MTS-CACHING-STATE*");
        $sym56$CLEAR_CACHED_ALL_SPEC_MTS = SubLObjectFactory.makeSymbol("CLEAR-CACHED-ALL-SPEC-MTS");
        $kw57$FORWARD_SYMMETRIC_POS = SubLObjectFactory.makeKeyword("FORWARD-SYMMETRIC-POS");
        $list58 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-SYMMETRIC-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-SYMMETRIC-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-SYMMETRIC-POS-EXPAND") });
        $kw59$ISA = SubLObjectFactory.makeKeyword("ISA");
        $list60 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate")));
        $kw61$FORWARD_SYMMETRIC_NEG = SubLObjectFactory.makeKeyword("FORWARD-SYMMETRIC-NEG");
        $list62 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-SYMMETRIC-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-SYMMETRIC-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-SYMMETRIC-NEG-EXPAND") });
        $kw63$FORWARD_ASYMMETRIC = SubLObjectFactory.makeKeyword("FORWARD-ASYMMETRIC");
        $list64 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("FORWARD-ASYMMETRIC-REQUIRED"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-ASYMMETRIC-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-ASYMMETRIC-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-ASYMMETRIC-EXPAND") });
        $list65 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ASYMMETRIC-PREDICATE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list66 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AsymmetricBinaryPredicate")));
        $kw67$FORWARD_COMMUTATIVE_POS = SubLObjectFactory.makeKeyword("FORWARD-COMMUTATIVE-POS");
        $list68 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-COMMUTATIVE-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-COMMUTATIVE-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-COMMUTATIVE-POS-EXPAND") });
        $list69 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommutativePredicate")));
        $list70 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PartiallyCommutativePredicate")));
        $kw71$FORWARD_COMMUTATIVE_NEG = SubLObjectFactory.makeKeyword("FORWARD-COMMUTATIVE-NEG");
        $list72 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-COMMUTATIVE-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-COMMUTATIVE-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-COMMUTATIVE-NEG-EXPAND") });
        $kw73$FORWARD_GENLPREDS_GAF = SubLObjectFactory.makeKeyword("FORWARD-GENLPREDS-GAF");
        $list74 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")))), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-GENLPREDS-GAF-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-GENLPREDS-GAF-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-GENLPREDS-GAF-EXPAND") });
        $const75$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const76$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $sym77$CACHED_ALL_GENL_PREDS = SubLObjectFactory.makeSymbol("CACHED-ALL-GENL-PREDS");
        $sym78$_CACHED_ALL_GENL_PREDS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-ALL-GENL-PREDS-CACHING-STATE*");
        $sym79$CLEAR_CACHED_ALL_GENL_PREDS = SubLObjectFactory.makeSymbol("CLEAR-CACHED-ALL-GENL-PREDS");
        $sym80$CACHED_ALL_GENL_INVERSES = SubLObjectFactory.makeSymbol("CACHED-ALL-GENL-INVERSES");
        $sym81$_CACHED_ALL_GENL_INVERSES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-ALL-GENL-INVERSES-CACHING-STATE*");
        $sym82$CLEAR_CACHED_ALL_GENL_INVERSES = SubLObjectFactory.makeSymbol("CLEAR-CACHED-ALL-GENL-INVERSES");
        $kw83$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $kw84$FORWARD_NOT_GENLPREDS_GAF = SubLObjectFactory.makeKeyword("FORWARD-NOT-GENLPREDS-GAF");
        $list85 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLPREDS-GAF-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLPREDS-GAF-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLPREDS-GAF-EXPAND") });
        $kw86$FORWARD_GENLPREDS_POS = SubLObjectFactory.makeKeyword("FORWARD-GENLPREDS-POS");
        $list87 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-GENLPREDS-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-GENLPREDS-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-GENLPREDS-POS-EXPAND") });
        $kw88$FORWARD_GENLINVERSE_GAF = SubLObjectFactory.makeKeyword("FORWARD-GENLINVERSE-GAF");
        $list89 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")))), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-GENLINVERSE-GAF-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-GENLINVERSE-GAF-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-GENLINVERSE-GAF-EXPAND") });
        $kw90$FORWARD_NOT_GENLINVERSE_GAF = SubLObjectFactory.makeKeyword("FORWARD-NOT-GENLINVERSE-GAF");
        $list91 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLINVERSE-GAF-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLINVERSE-GAF-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-NOT-GENLINVERSE-GAF-EXPAND") });
        $kw92$FORWARD_GENLINVERSE_POS = SubLObjectFactory.makeKeyword("FORWARD-GENLINVERSE-POS");
        $list93 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-GENLINVERSE-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-GENLINVERSE-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-GENLINVERSE-POS-EXPAND") });
        $kw94$FORWARD_NEGATIONPREDS = SubLObjectFactory.makeKeyword("FORWARD-NEGATIONPREDS");
        $list95 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("FORWARD-NEGATIONPREDS-REQUIRED"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-NEGATIONPREDS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-NEGATIONPREDS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-NEGATIONPREDS-EXPAND") });
        $sym96$CACHED_ALL_NEGATION_PREDS = SubLObjectFactory.makeSymbol("CACHED-ALL-NEGATION-PREDS");
        $sym97$_CACHED_ALL_NEGATION_PREDS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-ALL-NEGATION-PREDS-CACHING-STATE*");
        $sym98$CLEAR_CACHED_ALL_NEGATION_PREDS = SubLObjectFactory.makeSymbol("CLEAR-CACHED-ALL-NEGATION-PREDS");
        $list99 = (SubLList)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $kw100$NEGATIONPREDS = SubLObjectFactory.makeKeyword("NEGATIONPREDS");
        $const101$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $kw102$FORWARD_NEGATIONINVERSE = SubLObjectFactory.makeKeyword("FORWARD-NEGATIONINVERSE");
        $list103 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("FORWARD-NEGATIONINVERSE-REQUIRED"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-NEGATIONINVERSE-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-NEGATIONINVERSE-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-NEGATIONINVERSE-EXPAND") });
        $sym104$CACHED_ALL_NEGATION_INVERSES = SubLObjectFactory.makeSymbol("CACHED-ALL-NEGATION-INVERSES");
        $sym105$_CACHED_ALL_NEGATION_INVERSES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-ALL-NEGATION-INVERSES-CACHING-STATE*");
        $sym106$CLEAR_CACHED_ALL_NEGATION_INVERSES = SubLObjectFactory.makeSymbol("CLEAR-CACHED-ALL-NEGATION-INVERSES");
        $list107 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $const108$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $kw109$FORWARD_EVAL_POS = SubLObjectFactory.makeKeyword("FORWARD-EVAL-POS");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("EXCLUSIVE"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-EVAL-EXCLUSIVE-POS"), (SubLObject)SubLObjectFactory.makeKeyword("EXPAND"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-EVAL-EXPAND-POS"));
        $list111 = (SubLList)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-EVALUATABLE-PREDICATE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $kw112$FORWARD_EVAL_NEG = SubLObjectFactory.makeKeyword("FORWARD-EVAL-NEG");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("NEG"), (SubLObject)SubLObjectFactory.makeKeyword("EXCLUSIVE"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-EVAL-EXCLUSIVE-NEG"), (SubLObject)SubLObjectFactory.makeKeyword("EXPAND"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-EVAL-EXPAND-NEG"));
        $kw114$FORWARD_TERM_OF_UNIT = SubLObjectFactory.makeKeyword("FORWARD-TERM-OF-UNIT");
        $list115 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-TERM-OF-UNIT-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-TERM-OF-UNIT-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-TERM-OF-UNIT-EXPAND") });
        $const116$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $kw117$FORWARD_NAT_FUNCTION = SubLObjectFactory.makeKeyword("FORWARD-NAT-FUNCTION");
        $list118 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-NAT-FUNCTION-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-NAT-FUNCTION-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-NAT-FUNCTION-EXPAND") });
        $const119$natFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction"));
        $kw120$FORWARD_GAF_PREDICATE = SubLObjectFactory.makeKeyword("FORWARD-GAF-PREDICATE");
        $list121 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("FORWARD-GAF-PREDICATE-REQUIRED"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-GAF-PREDICATE-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-GAF-PREDICATE-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-GAF-PREDICATE-EXPAND") });
        $const122$gafPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gafPredicate"));
        $kw123$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw124$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw125$FORWARD_UNBOUND_PRED_POS = SubLObjectFactory.makeKeyword("FORWARD-UNBOUND-PRED-POS");
        $list126 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("FORWARD-UNBOUND-PRED-POS-REQUIRED"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-UNBOUND-PRED-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-UNBOUND-PRED-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-UNBOUND-PRED-POS-EXPAND") });
        $kw127$FORWARD_UNBOUND_PRED_NEG = SubLObjectFactory.makeKeyword("FORWARD-UNBOUND-PRED-NEG");
        $list128 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("FORWARD-UNBOUND-PRED-NEG-REQUIRED"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-UNBOUND-PRED-NEG-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-UNBOUND-PRED-NEG-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-UNBOUND-PRED-NEG-EXPAND") });
        $kw129$FORWARD_ASSERTIVE_WFF_UNBOUND_PRED_POS = SubLObjectFactory.makeKeyword("FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS");
        $list130 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-REQUIRED"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeSymbol("FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeSymbol("FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-EXPAND") });
        $kw131$FORWARD_IST_POS = SubLObjectFactory.makeKeyword("FORWARD-IST-POS");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("RULE-SELECT"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-IST-POS-RULE-SELECT"), (SubLObject)SubLObjectFactory.makeKeyword("RULE-FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-IST-POS-RULE-FILTER"), (SubLObject)SubLObjectFactory.makeKeyword("EXPAND"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-IST-POS-EXPAND"));
        $const133$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw134$FORWARD_IST_NEG = SubLObjectFactory.makeKeyword("FORWARD-IST-NEG");
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("NEG"), (SubLObject)SubLObjectFactory.makeKeyword("RULE-SELECT"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-IST-NEG-RULE-SELECT"), (SubLObject)SubLObjectFactory.makeKeyword("RULE-FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-IST-NEG-RULE-FILTER"), (SubLObject)SubLObjectFactory.makeKeyword("EXPAND"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-IST-NEG-EXPAND"));
        $const136$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
    }
    
    public static final class $forward_normal_pos_rule_select$UnaryFunction extends UnaryFunction
    {
        public $forward_normal_pos_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-NORMAL-POS-RULE-SELECT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forward_modules.forward_normal_pos_rule_select(arg1);
        }
    }
    
    public static final class $forward_normal_pos_expand$BinaryFunction extends BinaryFunction
    {
        public $forward_normal_pos_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-NORMAL-POS-EXPAND"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return forward_modules.forward_normal_pos_expand(arg1, arg2);
        }
    }
    
    public static final class $forward_isa_rule_select$UnaryFunction extends UnaryFunction
    {
        public $forward_isa_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-ISA-RULE-SELECT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forward_modules.forward_isa_rule_select(arg1);
        }
    }
    
    public static final class $forward_isa_expand$BinaryFunction extends BinaryFunction
    {
        public $forward_isa_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-ISA-EXPAND"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return forward_modules.forward_isa_expand(arg1, arg2);
        }
    }
    
    public static final class $forward_symmetric_pos_rule_select$UnaryFunction extends UnaryFunction
    {
        public $forward_symmetric_pos_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-SYMMETRIC-POS-RULE-SELECT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forward_modules.forward_symmetric_pos_rule_select(arg1);
        }
    }
    
    public static final class $forward_asymmetric_required$UnaryFunction extends UnaryFunction
    {
        public $forward_asymmetric_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-ASYMMETRIC-REQUIRED"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forward_modules.forward_asymmetric_required(arg1);
        }
    }
    
    public static final class $forward_genlpreds_pos_rule_select$UnaryFunction extends UnaryFunction
    {
        public $forward_genlpreds_pos_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-GENLPREDS-POS-RULE-SELECT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forward_modules.forward_genlpreds_pos_rule_select(arg1);
        }
    }
    
    public static final class $forward_genlinverse_pos_rule_select$UnaryFunction extends UnaryFunction
    {
        public $forward_genlinverse_pos_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-GENLINVERSE-POS-RULE-SELECT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forward_modules.forward_genlinverse_pos_rule_select(arg1);
        }
    }
    
    public static final class $forward_negationpreds_required$UnaryFunction extends UnaryFunction
    {
        public $forward_negationpreds_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-NEGATIONPREDS-REQUIRED"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forward_modules.forward_negationpreds_required(arg1);
        }
    }
    
    public static final class $forward_negationinverse_required$UnaryFunction extends UnaryFunction
    {
        public $forward_negationinverse_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-NEGATIONINVERSE-REQUIRED"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forward_modules.forward_negationinverse_required(arg1);
        }
    }
    
    public static final class $forward_eval_exclusive_pos$UnaryFunction extends UnaryFunction
    {
        public $forward_eval_exclusive_pos$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-EVAL-EXCLUSIVE-POS"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forward_modules.forward_eval_exclusive_pos(arg1);
        }
    }
    
    public static final class $forward_unbound_pred_pos_required$UnaryFunction extends UnaryFunction
    {
        public $forward_unbound_pred_pos_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-UNBOUND-PRED-POS-REQUIRED"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forward_modules.forward_unbound_pred_pos_required(arg1);
        }
    }
    
    public static final class $forward_ist_pos_rule_select$UnaryFunction extends UnaryFunction
    {
        public $forward_ist_pos_rule_select$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-IST-POS-RULE-SELECT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forward_modules.forward_ist_pos_rule_select(arg1);
        }
    }
    
    public static final class $forward_ist_pos_expand$BinaryFunction extends BinaryFunction
    {
        public $forward_ist_pos_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-IST-POS-EXPAND"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return forward_modules.forward_ist_pos_expand(arg1, arg2);
        }
    }
}

/*

	Total time: 1238 ms
	
*/