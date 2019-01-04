package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class forward_harness extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.forward_harness";
    public static final String myFingerPrint = "a4ab7139be5f1262430b4441ee2ba044c74a482b2c4eced600bb28815c3679f9";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLSymbol $dtp_forward_propagation_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLSymbol $dtp_forward_triggering$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLSymbol $dtp_skeletal_proof$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLSymbol $dtp_placeable_proof$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 22442L)
    private static SubLSymbol $forward_propagation_generated_triggerings$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 25421L)
    private static SubLSymbol $forward_propagation_generated_skeletal_proofs$;
    private static final SubLSymbol $sym0$FORWARD_PROPAGATION_STATE;
    private static final SubLSymbol $sym1$FORWARD_PROPAGATION_STATE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_FORWARD_PROPAGATION_STATE;
    private static final SubLSymbol $sym7$FORWARD_PROPAGATION_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$FORWARD_PS_ASSERTIONS_WORKING_SET;
    private static final SubLSymbol $sym10$_CSETF_FORWARD_PS_ASSERTIONS_WORKING_SET;
    private static final SubLSymbol $sym11$FORWARD_PS_TRIGGERINGS_WORKING_SET;
    private static final SubLSymbol $sym12$_CSETF_FORWARD_PS_TRIGGERINGS_WORKING_SET;
    private static final SubLSymbol $sym13$FORWARD_PS_SKELETAL_PROOFS_WORKING_SET;
    private static final SubLSymbol $sym14$_CSETF_FORWARD_PS_SKELETAL_PROOFS_WORKING_SET;
    private static final SubLSymbol $sym15$FORWARD_PS_PLACEABLE_PROOFS_WORKING_SET;
    private static final SubLSymbol $sym16$_CSETF_FORWARD_PS_PLACEABLE_PROOFS_WORKING_SET;
    private static final SubLSymbol $sym17$FORWARD_PS_PROPAGATION_MT;
    private static final SubLSymbol $sym18$_CSETF_FORWARD_PS_PROPAGATION_MT;
    private static final SubLSymbol $kw19$ASSERTIONS_WORKING_SET;
    private static final SubLSymbol $kw20$TRIGGERINGS_WORKING_SET;
    private static final SubLSymbol $kw21$SKELETAL_PROOFS_WORKING_SET;
    private static final SubLSymbol $kw22$PLACEABLE_PROOFS_WORKING_SET;
    private static final SubLSymbol $kw23$PROPAGATION_MT;
    private static final SubLString $str24$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw25$BEGIN;
    private static final SubLSymbol $sym26$MAKE_FORWARD_PROPAGATION_STATE;
    private static final SubLSymbol $kw27$SLOT;
    private static final SubLSymbol $kw28$END;
    private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATION_STATE_METHOD;
    private static final SubLString $str30$__A__A__A__A_;
    private static final SubLSymbol $sym31$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym32$ASSERTION_P;
    private static final SubLSymbol $sym33$POSSIBLY_HLMT_P;
    private static final SubLSymbol $sym34$FORWARD_TRIGGERING;
    private static final SubLSymbol $sym35$FORWARD_TRIGGERING_P;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$PRINT_FORWARD_TRIGGERING;
    private static final SubLSymbol $sym41$FORWARD_TRIGGERING_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$FORWARD_TRIG_RULE;
    private static final SubLSymbol $sym44$_CSETF_FORWARD_TRIG_RULE;
    private static final SubLSymbol $sym45$FORWARD_TRIG_SOURCE_ASENT;
    private static final SubLSymbol $sym46$_CSETF_FORWARD_TRIG_SOURCE_ASENT;
    private static final SubLSymbol $sym47$FORWARD_TRIG_SOURCE_TRUTH;
    private static final SubLSymbol $sym48$_CSETF_FORWARD_TRIG_SOURCE_TRUTH;
    private static final SubLSymbol $sym49$FORWARD_TRIG_TARGET_ASENT;
    private static final SubLSymbol $sym50$_CSETF_FORWARD_TRIG_TARGET_ASENT;
    private static final SubLSymbol $sym51$FORWARD_TRIG_TARGET_TRUTH;
    private static final SubLSymbol $sym52$_CSETF_FORWARD_TRIG_TARGET_TRUTH;
    private static final SubLSymbol $sym53$FORWARD_TRIG_QUERY_DNF;
    private static final SubLSymbol $sym54$_CSETF_FORWARD_TRIG_QUERY_DNF;
    private static final SubLSymbol $sym55$FORWARD_TRIG_PRAGMATIC_DNF;
    private static final SubLSymbol $sym56$_CSETF_FORWARD_TRIG_PRAGMATIC_DNF;
    private static final SubLSymbol $sym57$FORWARD_TRIG_PROPAGATION_MT;
    private static final SubLSymbol $sym58$_CSETF_FORWARD_TRIG_PROPAGATION_MT;
    private static final SubLSymbol $sym59$FORWARD_TRIG_RESTRICTED_EXAMINE_ASENT;
    private static final SubLSymbol $sym60$_CSETF_FORWARD_TRIG_RESTRICTED_EXAMINE_ASENT;
    private static final SubLSymbol $sym61$FORWARD_TRIG_TRIGGER_BINDINGS;
    private static final SubLSymbol $sym62$_CSETF_FORWARD_TRIG_TRIGGER_BINDINGS;
    private static final SubLSymbol $sym63$FORWARD_TRIG_TRIGGER_SUPPORTS;
    private static final SubLSymbol $sym64$_CSETF_FORWARD_TRIG_TRIGGER_SUPPORTS;
    private static final SubLSymbol $kw65$RULE;
    private static final SubLSymbol $kw66$SOURCE_ASENT;
    private static final SubLSymbol $kw67$SOURCE_TRUTH;
    private static final SubLSymbol $kw68$TARGET_ASENT;
    private static final SubLSymbol $kw69$TARGET_TRUTH;
    private static final SubLSymbol $kw70$QUERY_DNF;
    private static final SubLSymbol $kw71$PRAGMATIC_DNF;
    private static final SubLSymbol $kw72$RESTRICTED_EXAMINE_ASENT;
    private static final SubLSymbol $kw73$TRIGGER_BINDINGS;
    private static final SubLSymbol $kw74$TRIGGER_SUPPORTS;
    private static final SubLSymbol $sym75$MAKE_FORWARD_TRIGGERING;
    private static final SubLSymbol $sym76$VISIT_DEFSTRUCT_OBJECT_FORWARD_TRIGGERING_METHOD;
    private static final SubLInteger $int77$213;
    private static final SubLSymbol $sym78$SXHASH_FORWARD_TRIGGERING_METHOD;
    private static final SubLString $str79$TRIG_;
    private static final SubLString $str80$rule__S_;
    private static final SubLString $str81$__A_S;
    private static final SubLSymbol $kw82$TRUE;
    private static final SubLString $str83$;
    private static final SubLString $str84$__not_;
    private static final SubLString $str85$_to__A_S;
    private static final SubLSymbol $sym86$SKELETAL_PROOF;
    private static final SubLSymbol $sym87$SKELETAL_PROOF_P;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$PRINT_SKELETAL_PROOF;
    private static final SubLSymbol $sym93$SKELETAL_PROOF_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$SKEL_PROOF_CONCLUDED_ASENT;
    private static final SubLSymbol $sym96$_CSETF_SKEL_PROOF_CONCLUDED_ASENT;
    private static final SubLSymbol $sym97$SKEL_PROOF_CONCLUDED_TRUTH;
    private static final SubLSymbol $sym98$_CSETF_SKEL_PROOF_CONCLUDED_TRUTH;
    private static final SubLSymbol $sym99$SKEL_PROOF_TRIGGER_BINDINGS;
    private static final SubLSymbol $sym100$_CSETF_SKEL_PROOF_TRIGGER_BINDINGS;
    private static final SubLSymbol $sym101$SKEL_PROOF_INFERENCE_BINDINGS;
    private static final SubLSymbol $sym102$_CSETF_SKEL_PROOF_INFERENCE_BINDINGS;
    private static final SubLSymbol $sym103$SKEL_PROOF_CONCLUDED_SUPPORTS;
    private static final SubLSymbol $sym104$_CSETF_SKEL_PROOF_CONCLUDED_SUPPORTS;
    private static final SubLSymbol $sym105$SKEL_PROOF_PRAGMATIC_SUPPORTS;
    private static final SubLSymbol $sym106$_CSETF_SKEL_PROOF_PRAGMATIC_SUPPORTS;
    private static final SubLSymbol $sym107$SKEL_PROOF_RULE;
    private static final SubLSymbol $sym108$_CSETF_SKEL_PROOF_RULE;
    private static final SubLSymbol $sym109$SKEL_PROOF_PROPAGATION_MT;
    private static final SubLSymbol $sym110$_CSETF_SKEL_PROOF_PROPAGATION_MT;
    private static final SubLSymbol $kw111$CONCLUDED_ASENT;
    private static final SubLSymbol $kw112$CONCLUDED_TRUTH;
    private static final SubLSymbol $kw113$INFERENCE_BINDINGS;
    private static final SubLSymbol $kw114$CONCLUDED_SUPPORTS;
    private static final SubLSymbol $kw115$PRAGMATIC_SUPPORTS;
    private static final SubLSymbol $sym116$MAKE_SKELETAL_PROOF;
    private static final SubLSymbol $sym117$VISIT_DEFSTRUCT_OBJECT_SKELETAL_PROOF_METHOD;
    private static final SubLInteger $int118$217;
    private static final SubLSymbol $sym119$SXHASH_SKELETAL_PROOF_METHOD;
    private static final SubLString $str120$_A_S;
    private static final SubLSymbol $sym121$PLACEABLE_PROOF;
    private static final SubLSymbol $sym122$PLACEABLE_PROOF_P;
    private static final SubLList $list123;
    private static final SubLList $list124;
    private static final SubLList $list125;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$PRINT_PLACEABLE_PROOF;
    private static final SubLSymbol $sym128$PLACEABLE_PROOF_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$PLAC_PROOF_CONCLUDED_ASENT;
    private static final SubLSymbol $sym131$_CSETF_PLAC_PROOF_CONCLUDED_ASENT;
    private static final SubLSymbol $sym132$PLAC_PROOF_CONCLUDED_MT;
    private static final SubLSymbol $sym133$_CSETF_PLAC_PROOF_CONCLUDED_MT;
    private static final SubLSymbol $sym134$PLAC_PROOF_CONCLUDED_TRUTH;
    private static final SubLSymbol $sym135$_CSETF_PLAC_PROOF_CONCLUDED_TRUTH;
    private static final SubLSymbol $sym136$PLAC_PROOF_ASSERTIBLE;
    private static final SubLSymbol $sym137$_CSETF_PLAC_PROOF_ASSERTIBLE;
    private static final SubLSymbol $kw138$CONCLUDED_MT;
    private static final SubLSymbol $kw139$ASSERTIBLE;
    private static final SubLSymbol $sym140$MAKE_PLACEABLE_PROOF;
    private static final SubLSymbol $sym141$VISIT_DEFSTRUCT_OBJECT_PLACEABLE_PROOF_METHOD;
    private static final SubLInteger $int142$219;
    private static final SubLSymbol $sym143$SXHASH_PLACEABLE_PROOF_METHOD;
    private static final SubLString $str144$_A_S_in__S;
    private static final SubLSymbol $sym145$QUEUE_P;
    private static final SubLSymbol $sym146$FORWARD_PROPAGATE_NOTE_GENERATED_TRIGGERING;
    private static final SubLSymbol $sym147$FORWARD_PROPAGATE_NOTE_GENERATED_SKELETAL_PROOF;
    private static final SubLSymbol $sym148$PLACEABLE_PROOF_ASSERTIBLE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject forward_propagation_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_forward_propagation_state(v_object, stream, (SubLObject)forward_harness.ZERO_INTEGER);
        return (SubLObject)forward_harness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject forward_propagation_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $forward_propagation_state_native.class) ? forward_harness.T : forward_harness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject forward_ps_assertions_working_set(final SubLObject v_object) {
        assert forward_harness.NIL != forward_propagation_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject forward_ps_triggerings_working_set(final SubLObject v_object) {
        assert forward_harness.NIL != forward_propagation_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject forward_ps_skeletal_proofs_working_set(final SubLObject v_object) {
        assert forward_harness.NIL != forward_propagation_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject forward_ps_placeable_proofs_working_set(final SubLObject v_object) {
        assert forward_harness.NIL != forward_propagation_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject forward_ps_propagation_mt(final SubLObject v_object) {
        assert forward_harness.NIL != forward_propagation_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject _csetf_forward_ps_assertions_working_set(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_propagation_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject _csetf_forward_ps_triggerings_working_set(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_propagation_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject _csetf_forward_ps_skeletal_proofs_working_set(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_propagation_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject _csetf_forward_ps_placeable_proofs_working_set(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_propagation_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject _csetf_forward_ps_propagation_mt(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_propagation_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject make_forward_propagation_state(SubLObject arglist) {
        if (arglist == forward_harness.UNPROVIDED) {
            arglist = (SubLObject)forward_harness.NIL;
        }
        final SubLObject v_new = (SubLObject)new $forward_propagation_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)forward_harness.NIL, next = arglist; forward_harness.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)forward_harness.$kw19$ASSERTIONS_WORKING_SET)) {
                _csetf_forward_ps_assertions_working_set(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw20$TRIGGERINGS_WORKING_SET)) {
                _csetf_forward_ps_triggerings_working_set(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw21$SKELETAL_PROOFS_WORKING_SET)) {
                _csetf_forward_ps_skeletal_proofs_working_set(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw22$PLACEABLE_PROOFS_WORKING_SET)) {
                _csetf_forward_ps_placeable_proofs_working_set(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw23$PROPAGATION_MT)) {
                _csetf_forward_ps_propagation_mt(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)forward_harness.$str24$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject visit_defstruct_forward_propagation_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw25$BEGIN, (SubLObject)forward_harness.$sym26$MAKE_FORWARD_PROPAGATION_STATE, (SubLObject)forward_harness.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw19$ASSERTIONS_WORKING_SET, forward_ps_assertions_working_set(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw20$TRIGGERINGS_WORKING_SET, forward_ps_triggerings_working_set(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw21$SKELETAL_PROOFS_WORKING_SET, forward_ps_skeletal_proofs_working_set(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw22$PLACEABLE_PROOFS_WORKING_SET, forward_ps_placeable_proofs_working_set(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw23$PROPAGATION_MT, forward_ps_propagation_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw28$END, (SubLObject)forward_harness.$sym26$MAKE_FORWARD_PROPAGATION_STATE, (SubLObject)forward_harness.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2045L)
    public static SubLObject visit_defstruct_object_forward_propagation_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_forward_propagation_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 2828L)
    public static SubLObject print_forward_propagation_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward_harness.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)forward_harness.T, (SubLObject)forward_harness.T);
            final SubLObject assertions_count = forward_propagation_state_assertions_size(v_object);
            final SubLObject triggerings_count = forward_propagation_state_triggerings_size(v_object);
            final SubLObject skeletal_count = forward_propagation_state_skeletal_proofs_size(v_object);
            final SubLObject placeable_count = forward_propagation_state_placeable_proofs_size(v_object);
            PrintLow.format(stream, (SubLObject)forward_harness.$str30$__A__A__A__A_, new SubLObject[] { assertions_count, triggerings_count, skeletal_count, placeable_count });
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)forward_harness.T, (SubLObject)forward_harness.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 3440L)
    public static SubLObject new_forward_propagation_state(SubLObject initial_assertions, SubLObject propagation_mt) {
        if (initial_assertions == forward_harness.UNPROVIDED) {
            initial_assertions = (SubLObject)forward_harness.NIL;
        }
        if (propagation_mt == forward_harness.UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLObject list_var = initial_assertions;
        assert forward_harness.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)forward_harness.NIL;
        elem = cdolist_list_var.first();
        while (forward_harness.NIL != cdolist_list_var) {
            assert forward_harness.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert forward_harness.NIL != hlmt.possibly_hlmt_p(propagation_mt) : propagation_mt;
        final SubLObject forward_ps = make_forward_propagation_state((SubLObject)forward_harness.UNPROVIDED);
        final SubLObject initial_size = Sequences.length(initial_assertions);
        _csetf_forward_ps_assertions_working_set(forward_ps, set_utilities.make_set_from_list(initial_assertions, Symbols.symbol_function((SubLObject)forward_harness.EQL)));
        _csetf_forward_ps_triggerings_working_set(forward_ps, set.new_set(Symbols.symbol_function((SubLObject)forward_harness.EQ), initial_size));
        _csetf_forward_ps_skeletal_proofs_working_set(forward_ps, set.new_set(Symbols.symbol_function((SubLObject)forward_harness.EQ), initial_size));
        _csetf_forward_ps_placeable_proofs_working_set(forward_ps, set.new_set(Symbols.symbol_function((SubLObject)forward_harness.EQ), initial_size));
        _csetf_forward_ps_propagation_mt(forward_ps, propagation_mt);
        return forward_ps;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 4291L)
    public static SubLObject forward_propagation_state_propagation_mt(final SubLObject forward_state) {
        assert forward_harness.NIL != forward_propagation_state_p(forward_state) : forward_state;
        return forward_ps_propagation_mt(forward_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 4607L)
    public static SubLObject forward_propagation_state_assertions_size(final SubLObject forward_state) {
        assert forward_harness.NIL != forward_propagation_state_p(forward_state) : forward_state;
        return set.set_size(forward_ps_assertions_working_set(forward_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 4810L)
    public static SubLObject forward_propagation_some_assertionsP(final SubLObject forward_ps) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!forward_propagation_state_assertions_size(forward_ps).isZero());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 4956L)
    public static SubLObject forward_propagation_state_triggerings_size(final SubLObject forward_state) {
        assert forward_harness.NIL != forward_propagation_state_p(forward_state) : forward_state;
        return set.set_size(forward_ps_triggerings_working_set(forward_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 5161L)
    public static SubLObject forward_propagation_some_triggeringsP(final SubLObject forward_ps) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!forward_propagation_state_triggerings_size(forward_ps).isZero());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 5309L)
    public static SubLObject forward_propagation_state_skeletal_proofs_size(final SubLObject forward_state) {
        assert forward_harness.NIL != forward_propagation_state_p(forward_state) : forward_state;
        return set.set_size(forward_ps_skeletal_proofs_working_set(forward_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 5522L)
    public static SubLObject forward_propagation_some_skeletal_proofsP(final SubLObject forward_ps) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!forward_propagation_state_skeletal_proofs_size(forward_ps).isZero());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 5678L)
    public static SubLObject forward_propagation_state_placeable_proofs_size(final SubLObject forward_state) {
        assert forward_harness.NIL != forward_propagation_state_p(forward_state) : forward_state;
        return set.set_size(forward_ps_placeable_proofs_working_set(forward_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 5893L)
    public static SubLObject forward_propagation_some_placeable_proofsP(final SubLObject forward_ps) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!forward_propagation_state_placeable_proofs_size(forward_ps).isZero());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 6051L)
    public static SubLObject forward_propagation_add_assertions(final SubLObject forward_ps, final SubLObject new_assertions) {
        return set_utilities.set_add_all(new_assertions, forward_ps_assertions_working_set(forward_ps));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 6230L)
    public static SubLObject forward_propagation_remove_assertions(final SubLObject forward_ps, final SubLObject assertions_to_process_next) {
        return set_utilities.set_remove_all(assertions_to_process_next, forward_ps_assertions_working_set(forward_ps));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 6425L)
    public static SubLObject forward_propagation_add_triggerings(final SubLObject forward_ps, final SubLObject new_triggerings) {
        return set_utilities.set_add_all(new_triggerings, forward_ps_triggerings_working_set(forward_ps));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 6595L)
    public static SubLObject forward_propagation_remove_triggerings(final SubLObject forward_ps, final SubLObject triggerings_to_process_next) {
        return set_utilities.set_remove_all(triggerings_to_process_next, forward_ps_triggerings_working_set(forward_ps));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 6794L)
    public static SubLObject forward_propagation_add_skeletal_proofs(final SubLObject forward_ps, final SubLObject new_skeletal_proofs) {
        return set_utilities.set_add_all(new_skeletal_proofs, forward_ps_skeletal_proofs_working_set(forward_ps));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 6980L)
    public static SubLObject forward_propagation_remove_skeletal_proofs(final SubLObject forward_ps, final SubLObject skeletal_proofs_to_process_next) {
        return set_utilities.set_remove_all(skeletal_proofs_to_process_next, forward_ps_skeletal_proofs_working_set(forward_ps));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 7195L)
    public static SubLObject forward_propagation_add_placeable_proofs(final SubLObject forward_ps, final SubLObject new_placeable_proofs) {
        return set_utilities.set_add_all(new_placeable_proofs, forward_ps_placeable_proofs_working_set(forward_ps));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 7385L)
    public static SubLObject forward_propagation_remove_placeable_proofs(final SubLObject forward_ps, final SubLObject placeable_proofs_to_process_next) {
        return set_utilities.set_remove_all(placeable_proofs_to_process_next, forward_ps_placeable_proofs_working_set(forward_ps));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_triggering_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_forward_triggering(v_object, stream, (SubLObject)forward_harness.ZERO_INTEGER);
        return (SubLObject)forward_harness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_triggering_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $forward_triggering_native.class) ? forward_harness.T : forward_harness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_trig_rule(final SubLObject v_object) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_trig_source_asent(final SubLObject v_object) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_trig_source_truth(final SubLObject v_object) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_trig_target_asent(final SubLObject v_object) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_trig_target_truth(final SubLObject v_object) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_trig_query_dnf(final SubLObject v_object) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_trig_pragmatic_dnf(final SubLObject v_object) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_trig_propagation_mt(final SubLObject v_object) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_trig_restricted_examine_asent(final SubLObject v_object) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_trig_trigger_bindings(final SubLObject v_object) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject forward_trig_trigger_supports(final SubLObject v_object) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject _csetf_forward_trig_rule(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject _csetf_forward_trig_source_asent(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject _csetf_forward_trig_source_truth(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject _csetf_forward_trig_target_asent(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject _csetf_forward_trig_target_truth(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject _csetf_forward_trig_query_dnf(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject _csetf_forward_trig_pragmatic_dnf(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject _csetf_forward_trig_propagation_mt(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject _csetf_forward_trig_restricted_examine_asent(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject _csetf_forward_trig_trigger_bindings(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject _csetf_forward_trig_trigger_supports(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != forward_triggering_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject make_forward_triggering(SubLObject arglist) {
        if (arglist == forward_harness.UNPROVIDED) {
            arglist = (SubLObject)forward_harness.NIL;
        }
        final SubLObject v_new = (SubLObject)new $forward_triggering_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)forward_harness.NIL, next = arglist; forward_harness.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)forward_harness.$kw65$RULE)) {
                _csetf_forward_trig_rule(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw66$SOURCE_ASENT)) {
                _csetf_forward_trig_source_asent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw67$SOURCE_TRUTH)) {
                _csetf_forward_trig_source_truth(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw68$TARGET_ASENT)) {
                _csetf_forward_trig_target_asent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw69$TARGET_TRUTH)) {
                _csetf_forward_trig_target_truth(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw70$QUERY_DNF)) {
                _csetf_forward_trig_query_dnf(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw71$PRAGMATIC_DNF)) {
                _csetf_forward_trig_pragmatic_dnf(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw23$PROPAGATION_MT)) {
                _csetf_forward_trig_propagation_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw72$RESTRICTED_EXAMINE_ASENT)) {
                _csetf_forward_trig_restricted_examine_asent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw73$TRIGGER_BINDINGS)) {
                _csetf_forward_trig_trigger_bindings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw74$TRIGGER_SUPPORTS)) {
                _csetf_forward_trig_trigger_supports(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)forward_harness.$str24$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject visit_defstruct_forward_triggering(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw25$BEGIN, (SubLObject)forward_harness.$sym75$MAKE_FORWARD_TRIGGERING, (SubLObject)forward_harness.ELEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw65$RULE, forward_trig_rule(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw66$SOURCE_ASENT, forward_trig_source_asent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw67$SOURCE_TRUTH, forward_trig_source_truth(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw68$TARGET_ASENT, forward_trig_target_asent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw69$TARGET_TRUTH, forward_trig_target_truth(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw70$QUERY_DNF, forward_trig_query_dnf(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw71$PRAGMATIC_DNF, forward_trig_pragmatic_dnf(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw23$PROPAGATION_MT, forward_trig_propagation_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw72$RESTRICTED_EXAMINE_ASENT, forward_trig_restricted_examine_asent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw73$TRIGGER_BINDINGS, forward_trig_trigger_bindings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw74$TRIGGER_SUPPORTS, forward_trig_trigger_supports(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw28$END, (SubLObject)forward_harness.$sym75$MAKE_FORWARD_TRIGGERING, (SubLObject)forward_harness.ELEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8116L)
    public static SubLObject visit_defstruct_object_forward_triggering_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_forward_triggering(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8481L)
    public static SubLObject sxhash_forward_triggering_method(final SubLObject v_object) {
        final SubLObject sxhash = (SubLObject)forward_harness.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)forward_harness.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)forward_harness.$int77$213;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(forward_trig_rule(v_object))), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(forward_trig_source_asent(v_object))), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(forward_trig_target_asent(v_object))), composite_state), composite_hash);
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 8900L)
    public static SubLObject print_forward_triggering(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule = forward_trig_rule(v_object);
        final SubLObject rule_id = assertion_handles.assertion_id(rule);
        final SubLObject source_asent = forward_trig_source_asent(v_object);
        final SubLObject source_truth = forward_trig_source_truth(v_object);
        final SubLObject target_asent = forward_trig_target_asent(v_object);
        final SubLObject target_truth = forward_trig_target_truth(v_object);
        final SubLObject source_pred = (SubLObject)((forward_harness.NIL != source_asent) ? cycl_utilities.atomic_sentence_predicate(source_asent) : forward_harness.NIL);
        final SubLObject target_pred = (SubLObject)((forward_harness.NIL != target_asent) ? cycl_utilities.atomic_sentence_predicate(target_asent) : forward_harness.NIL);
        if (forward_harness.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)forward_harness.NIL, (SubLObject)forward_harness.NIL);
            PrintLow.format(stream, (SubLObject)forward_harness.$str79$TRIG_);
            PrintLow.format(stream, (SubLObject)forward_harness.$str80$rule__S_, rule_id);
            if (forward_harness.NIL != source_pred) {
                PrintLow.format(stream, (SubLObject)forward_harness.$str81$__A_S, (SubLObject)((forward_harness.$kw82$TRUE == source_truth) ? forward_harness.$str83$ : forward_harness.$str84$__not_), source_pred);
            }
            PrintLow.format(stream, (SubLObject)forward_harness.$str85$_to__A_S, (SubLObject)((forward_harness.$kw82$TRUE == target_truth) ? forward_harness.$str83$ : forward_harness.$str84$__not_), target_pred);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)forward_harness.T, (SubLObject)forward_harness.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 9775L)
    public static SubLObject new_forward_triggering(final SubLObject rule, final SubLObject source_asent, final SubLObject source_truth, final SubLObject target_asent, final SubLObject target_truth, final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject restricted_examine_asent, final SubLObject trigger_bindings, final SubLObject trigger_supports) {
        return make_forward_triggering((SubLObject)ConsesLow.list(new SubLObject[] { forward_harness.$kw65$RULE, rule, forward_harness.$kw66$SOURCE_ASENT, source_asent, forward_harness.$kw67$SOURCE_TRUTH, source_truth, forward_harness.$kw68$TARGET_ASENT, target_asent, forward_harness.$kw69$TARGET_TRUTH, target_truth, forward_harness.$kw70$QUERY_DNF, query_dnf, forward_harness.$kw71$PRAGMATIC_DNF, pragmatic_dnf, forward_harness.$kw23$PROPAGATION_MT, propagation_mt, forward_harness.$kw72$RESTRICTED_EXAMINE_ASENT, restricted_examine_asent, forward_harness.$kw73$TRIGGER_BINDINGS, trigger_bindings, forward_harness.$kw74$TRIGGER_SUPPORTS, trigger_supports }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 10427L)
    public static SubLObject forward_triggering_rule(final SubLObject triggering) {
        assert forward_harness.NIL != forward_triggering_p(triggering) : triggering;
        return forward_trig_rule(triggering);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 10580L)
    public static SubLObject forward_triggering_source_asent(final SubLObject triggering) {
        assert forward_harness.NIL != forward_triggering_p(triggering) : triggering;
        return forward_trig_source_asent(triggering);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 10737L)
    public static SubLObject forward_triggering_source_truth(final SubLObject triggering) {
        assert forward_harness.NIL != forward_triggering_p(triggering) : triggering;
        return forward_trig_source_truth(triggering);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 10894L)
    public static SubLObject forward_triggering_target_asent(final SubLObject triggering) {
        assert forward_harness.NIL != forward_triggering_p(triggering) : triggering;
        return forward_trig_target_asent(triggering);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 11051L)
    public static SubLObject forward_triggering_target_truth(final SubLObject triggering) {
        assert forward_harness.NIL != forward_triggering_p(triggering) : triggering;
        return forward_trig_target_truth(triggering);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 11208L)
    public static SubLObject forward_triggering_query_dnf(final SubLObject triggering) {
        assert forward_harness.NIL != forward_triggering_p(triggering) : triggering;
        return forward_trig_query_dnf(triggering);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 11359L)
    public static SubLObject forward_triggering_pragmatic_dnf(final SubLObject triggering) {
        assert forward_harness.NIL != forward_triggering_p(triggering) : triggering;
        return forward_trig_pragmatic_dnf(triggering);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 11518L)
    public static SubLObject forward_triggering_propagation_mt(final SubLObject triggering) {
        assert forward_harness.NIL != forward_triggering_p(triggering) : triggering;
        return forward_trig_propagation_mt(triggering);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 11757L)
    public static SubLObject forward_triggering_restricted_examine_asent(final SubLObject triggering) {
        assert forward_harness.NIL != forward_triggering_p(triggering) : triggering;
        return forward_trig_restricted_examine_asent(triggering);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 11938L)
    public static SubLObject forward_triggering_trigger_bindings(final SubLObject triggering) {
        assert forward_harness.NIL != forward_triggering_p(triggering) : triggering;
        return forward_trig_trigger_bindings(triggering);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12103L)
    public static SubLObject forward_triggering_trigger_supports(final SubLObject triggering) {
        assert forward_harness.NIL != forward_triggering_p(triggering) : triggering;
        return forward_trig_trigger_supports(triggering);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject skeletal_proof_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_skeletal_proof(v_object, stream, (SubLObject)forward_harness.ZERO_INTEGER);
        return (SubLObject)forward_harness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject skeletal_proof_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $skeletal_proof_native.class) ? forward_harness.T : forward_harness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject skel_proof_concluded_asent(final SubLObject v_object) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject skel_proof_concluded_truth(final SubLObject v_object) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject skel_proof_trigger_bindings(final SubLObject v_object) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject skel_proof_inference_bindings(final SubLObject v_object) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject skel_proof_concluded_supports(final SubLObject v_object) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject skel_proof_pragmatic_supports(final SubLObject v_object) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject skel_proof_rule(final SubLObject v_object) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject skel_proof_propagation_mt(final SubLObject v_object) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject _csetf_skel_proof_concluded_asent(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject _csetf_skel_proof_concluded_truth(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject _csetf_skel_proof_trigger_bindings(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject _csetf_skel_proof_inference_bindings(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject _csetf_skel_proof_concluded_supports(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject _csetf_skel_proof_pragmatic_supports(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject _csetf_skel_proof_rule(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject _csetf_skel_proof_propagation_mt(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != skeletal_proof_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject make_skeletal_proof(SubLObject arglist) {
        if (arglist == forward_harness.UNPROVIDED) {
            arglist = (SubLObject)forward_harness.NIL;
        }
        final SubLObject v_new = (SubLObject)new $skeletal_proof_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)forward_harness.NIL, next = arglist; forward_harness.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)forward_harness.$kw111$CONCLUDED_ASENT)) {
                _csetf_skel_proof_concluded_asent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw112$CONCLUDED_TRUTH)) {
                _csetf_skel_proof_concluded_truth(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw73$TRIGGER_BINDINGS)) {
                _csetf_skel_proof_trigger_bindings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw113$INFERENCE_BINDINGS)) {
                _csetf_skel_proof_inference_bindings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw114$CONCLUDED_SUPPORTS)) {
                _csetf_skel_proof_concluded_supports(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw115$PRAGMATIC_SUPPORTS)) {
                _csetf_skel_proof_pragmatic_supports(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw65$RULE)) {
                _csetf_skel_proof_rule(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw23$PROPAGATION_MT)) {
                _csetf_skel_proof_propagation_mt(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)forward_harness.$str24$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject visit_defstruct_skeletal_proof(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw25$BEGIN, (SubLObject)forward_harness.$sym116$MAKE_SKELETAL_PROOF, (SubLObject)forward_harness.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw111$CONCLUDED_ASENT, skel_proof_concluded_asent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw112$CONCLUDED_TRUTH, skel_proof_concluded_truth(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw73$TRIGGER_BINDINGS, skel_proof_trigger_bindings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw113$INFERENCE_BINDINGS, skel_proof_inference_bindings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw114$CONCLUDED_SUPPORTS, skel_proof_concluded_supports(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw115$PRAGMATIC_SUPPORTS, skel_proof_pragmatic_supports(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw65$RULE, skel_proof_rule(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw23$PROPAGATION_MT, skel_proof_propagation_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw28$END, (SubLObject)forward_harness.$sym116$MAKE_SKELETAL_PROOF, (SubLObject)forward_harness.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12659L)
    public static SubLObject visit_defstruct_object_skeletal_proof_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_skeletal_proof(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 12962L)
    public static SubLObject sxhash_skeletal_proof_method(final SubLObject v_object) {
        SubLObject sxhash = (SubLObject)forward_harness.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)forward_harness.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)forward_harness.$int118$217;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(skel_proof_concluded_asent(v_object))), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(skel_proof_rule(v_object))), composite_state), composite_hash));
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 13298L)
    public static SubLObject print_skeletal_proof(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject concluded_asent = skel_proof_concluded_asent(v_object);
        final SubLObject concluded_truth = skel_proof_concluded_truth(v_object);
        if (forward_harness.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)forward_harness.T, (SubLObject)forward_harness.T);
            PrintLow.format(stream, (SubLObject)forward_harness.$str120$_A_S, (SubLObject)((forward_harness.$kw82$TRUE == concluded_truth) ? forward_harness.$str83$ : forward_harness.$str84$__not_), concluded_asent);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)forward_harness.T, (SubLObject)forward_harness.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 13670L)
    public static SubLObject new_skeletal_proof(final SubLObject concluded_asent, final SubLObject concluded_truth, final SubLObject trigger_bindings, final SubLObject inference_bindings, final SubLObject concluded_supports, final SubLObject pragmatic_supports, final SubLObject rule, final SubLObject propagation_mt) {
        return make_skeletal_proof((SubLObject)ConsesLow.list(new SubLObject[] { forward_harness.$kw111$CONCLUDED_ASENT, concluded_asent, forward_harness.$kw112$CONCLUDED_TRUTH, concluded_truth, forward_harness.$kw73$TRIGGER_BINDINGS, trigger_bindings, forward_harness.$kw113$INFERENCE_BINDINGS, inference_bindings, forward_harness.$kw114$CONCLUDED_SUPPORTS, concluded_supports, forward_harness.$kw115$PRAGMATIC_SUPPORTS, pragmatic_supports, forward_harness.$kw65$RULE, rule, forward_harness.$kw23$PROPAGATION_MT, propagation_mt }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 14201L)
    public static SubLObject skeletal_proof_concluded_asent(final SubLObject skeletal_proof) {
        assert forward_harness.NIL != skeletal_proof_p(skeletal_proof) : skeletal_proof;
        return skel_proof_concluded_asent(skeletal_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 14378L)
    public static SubLObject skeletal_proof_concluded_truth(final SubLObject skeletal_proof) {
        assert forward_harness.NIL != skeletal_proof_p(skeletal_proof) : skeletal_proof;
        return skel_proof_concluded_truth(skeletal_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 14544L)
    public static SubLObject skeletal_proof_trigger_bindings(final SubLObject skeletal_proof) {
        assert forward_harness.NIL != skeletal_proof_p(skeletal_proof) : skeletal_proof;
        return skel_proof_trigger_bindings(skeletal_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 14712L)
    public static SubLObject skeletal_proof_inference_bindings(final SubLObject skeletal_proof) {
        assert forward_harness.NIL != skeletal_proof_p(skeletal_proof) : skeletal_proof;
        return skel_proof_inference_bindings(skeletal_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 14884L)
    public static SubLObject skeletal_proof_concluded_supports(final SubLObject skeletal_proof) {
        assert forward_harness.NIL != skeletal_proof_p(skeletal_proof) : skeletal_proof;
        return skel_proof_concluded_supports(skeletal_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15056L)
    public static SubLObject skeletal_proof_pragmatic_supports(final SubLObject skeletal_proof) {
        assert forward_harness.NIL != skeletal_proof_p(skeletal_proof) : skeletal_proof;
        return skel_proof_pragmatic_supports(skeletal_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15228L)
    public static SubLObject skeletal_proof_rule(final SubLObject skeletal_proof) {
        assert forward_harness.NIL != skeletal_proof_p(skeletal_proof) : skeletal_proof;
        return skel_proof_rule(skeletal_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15372L)
    public static SubLObject skeletal_proof_propagation_mt(final SubLObject skeletal_proof) {
        assert forward_harness.NIL != skeletal_proof_p(skeletal_proof) : skeletal_proof;
        return skel_proof_propagation_mt(skeletal_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject placeable_proof_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_placeable_proof(v_object, stream, (SubLObject)forward_harness.ZERO_INTEGER);
        return (SubLObject)forward_harness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject placeable_proof_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $placeable_proof_native.class) ? forward_harness.T : forward_harness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject plac_proof_concluded_asent(final SubLObject v_object) {
        assert forward_harness.NIL != placeable_proof_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject plac_proof_concluded_mt(final SubLObject v_object) {
        assert forward_harness.NIL != placeable_proof_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject plac_proof_concluded_truth(final SubLObject v_object) {
        assert forward_harness.NIL != placeable_proof_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject plac_proof_assertible(final SubLObject v_object) {
        assert forward_harness.NIL != placeable_proof_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject _csetf_plac_proof_concluded_asent(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != placeable_proof_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject _csetf_plac_proof_concluded_mt(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != placeable_proof_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject _csetf_plac_proof_concluded_truth(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != placeable_proof_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject _csetf_plac_proof_assertible(final SubLObject v_object, final SubLObject value) {
        assert forward_harness.NIL != placeable_proof_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject make_placeable_proof(SubLObject arglist) {
        if (arglist == forward_harness.UNPROVIDED) {
            arglist = (SubLObject)forward_harness.NIL;
        }
        final SubLObject v_new = (SubLObject)new $placeable_proof_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)forward_harness.NIL, next = arglist; forward_harness.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)forward_harness.$kw111$CONCLUDED_ASENT)) {
                _csetf_plac_proof_concluded_asent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw138$CONCLUDED_MT)) {
                _csetf_plac_proof_concluded_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw112$CONCLUDED_TRUTH)) {
                _csetf_plac_proof_concluded_truth(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forward_harness.$kw139$ASSERTIBLE)) {
                _csetf_plac_proof_assertible(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)forward_harness.$str24$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject visit_defstruct_placeable_proof(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw25$BEGIN, (SubLObject)forward_harness.$sym140$MAKE_PLACEABLE_PROOF, (SubLObject)forward_harness.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw111$CONCLUDED_ASENT, plac_proof_concluded_asent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw138$CONCLUDED_MT, plac_proof_concluded_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw112$CONCLUDED_TRUTH, plac_proof_concluded_truth(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw27$SLOT, (SubLObject)forward_harness.$kw139$ASSERTIBLE, plac_proof_assertible(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forward_harness.$kw28$END, (SubLObject)forward_harness.$sym140$MAKE_PLACEABLE_PROOF, (SubLObject)forward_harness.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 15807L)
    public static SubLObject visit_defstruct_object_placeable_proof_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_placeable_proof(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 16041L)
    public static SubLObject sxhash_placeable_proof_method(final SubLObject v_object) {
        SubLObject sxhash = (SubLObject)forward_harness.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)forward_harness.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)forward_harness.$int142$219;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(plac_proof_concluded_asent(v_object))), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(plac_proof_concluded_mt(v_object))), composite_state), composite_hash));
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 16378L)
    public static SubLObject print_placeable_proof(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject concluded_asent = plac_proof_concluded_asent(v_object);
        final SubLObject concluded_mt = plac_proof_concluded_mt(v_object);
        final SubLObject concluded_truth = plac_proof_concluded_truth(v_object);
        if (forward_harness.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)forward_harness.T, (SubLObject)forward_harness.T);
            PrintLow.format(stream, (SubLObject)forward_harness.$str144$_A_S_in__S, new SubLObject[] { (forward_harness.$kw82$TRUE == concluded_truth) ? forward_harness.$str83$ : forward_harness.$str84$__not_, concluded_asent, concluded_mt });
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)forward_harness.T, (SubLObject)forward_harness.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 16840L)
    public static SubLObject new_placeable_proof_from_assertible(final SubLObject assertible) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject argument_spec = hl_storage_modules.hl_assertible_argument_spec(assertible);
        final SubLObject hl_assertion_spec_var_$1;
        final SubLObject hl_assertion_spec_var = hl_assertion_spec_var_$1 = hl_storage_modules.hl_assertible_hl_assertion_spec(assertible);
        final SubLObject cnf = hl_storage_modules.hl_assertion_spec_cnf(hl_assertion_spec_var_$1);
        final SubLObject concluded_mt = hl_storage_modules.hl_assertion_spec_mt(hl_assertion_spec_var_$1);
        thread.resetMultipleValues();
        final SubLObject concluded_asent = clause_utilities.asent_truth_from_atomic_clause(cnf);
        final SubLObject concluded_truth = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return make_placeable_proof((SubLObject)ConsesLow.list((SubLObject)forward_harness.$kw111$CONCLUDED_ASENT, concluded_asent, (SubLObject)forward_harness.$kw138$CONCLUDED_MT, concluded_mt, (SubLObject)forward_harness.$kw112$CONCLUDED_TRUTH, concluded_truth, (SubLObject)forward_harness.$kw139$ASSERTIBLE, assertible));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 17313L)
    public static SubLObject placeable_proof_concluded_asent(final SubLObject placeable_proof) {
        assert forward_harness.NIL != placeable_proof_p(placeable_proof) : placeable_proof;
        return plac_proof_concluded_asent(placeable_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 17483L)
    public static SubLObject placeable_proof_concluded_mt(final SubLObject placeable_proof) {
        assert forward_harness.NIL != placeable_proof_p(placeable_proof) : placeable_proof;
        return plac_proof_concluded_mt(placeable_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 17647L)
    public static SubLObject placeable_proof_concluded_truth(final SubLObject placeable_proof) {
        assert forward_harness.NIL != placeable_proof_p(placeable_proof) : placeable_proof;
        return plac_proof_concluded_truth(placeable_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 17817L)
    public static SubLObject placeable_proof_assertible(final SubLObject placeable_proof) {
        assert forward_harness.NIL != placeable_proof_p(placeable_proof) : placeable_proof;
        return plac_proof_assertible(placeable_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 17977L)
    public static SubLObject forward_propagate_assertion_to_quiescence(final SubLObject assertion, SubLObject propagation_mt) {
        if (propagation_mt == forward_harness.UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        assert forward_harness.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return forward_propagate_assertions_to_quiescence((SubLObject)ConsesLow.list(assertion), propagation_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 19269L)
    public static SubLObject forward_propagate_assertions_to_quiescence(final SubLObject assertions, SubLObject propagation_mt) {
        if (propagation_mt == forward_harness.UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward_harness.NIL != list_utilities.non_dotted_list_p(assertions) : assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = (SubLObject)forward_harness.NIL;
        elem = cdolist_list_var.first();
        while (forward_harness.NIL != cdolist_list_var) {
            assert forward_harness.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject forward_ps = new_forward_propagation_state(assertions, propagation_mt);
        SubLObject total_triggerings = (SubLObject)forward_harness.ZERO_INTEGER;
        SubLObject total_skeletal_proofs = (SubLObject)forward_harness.ZERO_INTEGER;
        SubLObject total_placeable_proofs = (SubLObject)forward_harness.ZERO_INTEGER;
        SubLObject total_new_assertions = (SubLObject)forward_harness.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        try {
            kb_control_vars.$within_forward_inferenceP$.bind((SubLObject)forward_harness.T, thread);
            final SubLObject environment = forward.get_forward_inference_environment();
            assert forward_harness.NIL != queues.queue_p(environment) : environment;
            final SubLObject _prev_bind_0_$2 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward_harness.NIL, thread);
                try {
                    SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)forward_harness.TEN_INTEGER);
                    final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)forward_harness.T, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                        try {
                            final SubLObject local_state;
                            final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)forward_harness.UNPROVIDED, (SubLObject)forward_harness.UNPROVIDED, (SubLObject)forward_harness.UNPROVIDED, (SubLObject)forward_harness.UNPROVIDED);
                            final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    while (forward_harness.NIL == forward_propagation_state_exhaustedP(forward_ps)) {
                                        if (forward_harness.NIL != forward_propagation_some_placeable_proofsP(forward_ps)) {
                                            total_new_assertions = Numbers.add(total_new_assertions, forward_propagation_process_some_placeable_proofs(forward_ps));
                                        }
                                        else if (forward_harness.NIL != forward_propagation_some_skeletal_proofsP(forward_ps)) {
                                            total_placeable_proofs = Numbers.add(total_placeable_proofs, forward_propagation_process_some_skeletal_proofs(forward_ps));
                                        }
                                        else if (forward_harness.NIL != forward_propagation_some_triggeringsP(forward_ps)) {
                                            total_skeletal_proofs = Numbers.add(total_skeletal_proofs, forward_propagation_process_some_triggerings(forward_ps));
                                        }
                                        else {
                                            total_triggerings = Numbers.add(total_triggerings, forward_propagation_process_some_assertions(forward_ps));
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_harness.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_harness.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$4, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$3, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_harness.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        forward.clear_current_forward_problem_store();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            }
            finally {
                utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$2, thread);
            }
        }
        finally {
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.list(total_new_assertions, total_triggerings, total_skeletal_proofs, total_placeable_proofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 20836L)
    public static SubLObject forward_propagation_state_exhaustedP(final SubLObject forward_ps) {
        return (SubLObject)SubLObjectFactory.makeBoolean(forward_harness.NIL == forward_propagation_some_assertionsP(forward_ps) && forward_harness.NIL == forward_propagation_some_triggeringsP(forward_ps) && forward_harness.NIL == forward_propagation_some_skeletal_proofsP(forward_ps) && forward_harness.NIL == forward_propagation_some_placeable_proofsP(forward_ps));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 21175L)
    public static SubLObject forward_propagation_process_some_assertions(final SubLObject forward_ps) {
        SubLObject assertions_to_process_next = forward_propagation_select_next_assertions(forward_ps);
        SubLObject total_added = (SubLObject)forward_harness.ZERO_INTEGER;
        assertions_to_process_next = forward_propatation_sort_assertions(assertions_to_process_next);
        forward_propagation_remove_assertions(forward_ps, assertions_to_process_next);
        SubLObject cdolist_list_var = assertions_to_process_next;
        SubLObject assertion = (SubLObject)forward_harness.NIL;
        assertion = cdolist_list_var.first();
        while (forward_harness.NIL != cdolist_list_var) {
            final SubLObject triggerings = forward_propagation_generate_triggerings(forward_ps, assertion);
            if (forward_harness.NIL != triggerings) {
                forward_propagation_add_triggerings(forward_ps, triggerings);
                total_added = Numbers.add(total_added, Sequences.length(triggerings));
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return total_added;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 22035L)
    public static SubLObject forward_propagation_select_next_assertions(final SubLObject forward_ps) {
        final SubLObject next_assertions = set.set_element_list(forward_ps_assertions_working_set(forward_ps));
        return next_assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 22306L)
    public static SubLObject forward_propatation_sort_assertions(final SubLObject assertions_to_process_next) {
        return assertion_utilities.sort_assertions(assertions_to_process_next);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 22513L)
    public static SubLObject forward_propagation_generate_triggerings(final SubLObject forward_ps, final SubLObject source_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject propagation_mt = forward_propagation_state_propagation_mt(forward_ps);
        SubLObject triggerings = (SubLObject)forward_harness.NIL;
        final SubLObject _prev_bind_0 = forward_harness.$forward_propagation_generated_triggerings$.currentBinding(thread);
        final SubLObject _prev_bind_2 = forward.$handle_one_forward_propagation_callback$.currentBinding(thread);
        try {
            forward_harness.$forward_propagation_generated_triggerings$.bind((SubLObject)forward_harness.NIL, thread);
            forward.$handle_one_forward_propagation_callback$.bind((SubLObject)forward_harness.$sym146$FORWARD_PROPAGATE_NOTE_GENERATED_TRIGGERING, thread);
            if (forward_harness.NIL != assertions_high.rule_assertionP(source_support)) {
                forward.forward_propagate_rule(source_support, propagation_mt);
            }
            else {
                forward.forward_propagate_asent_support(source_support, propagation_mt);
            }
            triggerings = Sequences.nreverse(forward_harness.$forward_propagation_generated_triggerings$.getDynamicValue(thread));
        }
        finally {
            forward.$handle_one_forward_propagation_callback$.rebind(_prev_bind_2, thread);
            forward_harness.$forward_propagation_generated_triggerings$.rebind(_prev_bind_0, thread);
        }
        return triggerings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 23268L)
    public static SubLObject forward_propagate_note_generated_triggering(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject target_asent, final SubLObject target_truth, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source_support = (SubLObject)((forward_harness.NIL != trigger_supports) ? trigger_supports.first() : forward_harness.NIL);
        final SubLObject source_asent = (SubLObject)((forward_harness.NIL != source_support) ? arguments.support_sentence(source_support) : forward_harness.NIL);
        final SubLObject source_truth = (SubLObject)((forward_harness.NIL != source_support) ? arguments.support_truth(source_support) : forward_harness.NIL);
        final SubLObject restricted_examine_asent = forward.$forward_non_trigger_literal_restricted_examine_asent$.getDynamicValue(thread);
        final SubLObject triggering = new_forward_triggering(rule, source_asent, source_truth, target_asent, target_truth, query_dnf, pragmatic_dnf, propagation_mt, restricted_examine_asent, trigger_bindings, trigger_supports);
        forward_harness.$forward_propagation_generated_triggerings$.setDynamicValue((SubLObject)ConsesLow.cons(triggering, forward_harness.$forward_propagation_generated_triggerings$.getDynamicValue(thread)), thread);
        return triggering;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 24132L)
    public static SubLObject forward_propagation_process_some_triggerings(final SubLObject forward_ps) {
        SubLObject triggerings_to_process_next = forward_propagation_select_next_triggerings(forward_ps);
        SubLObject total_added = (SubLObject)forward_harness.ZERO_INTEGER;
        triggerings_to_process_next = forward_propatation_sort_triggerings(triggerings_to_process_next);
        forward_propagation_remove_triggerings(forward_ps, triggerings_to_process_next);
        SubLObject cdolist_list_var = triggerings_to_process_next;
        SubLObject triggering = (SubLObject)forward_harness.NIL;
        triggering = cdolist_list_var.first();
        while (forward_harness.NIL != cdolist_list_var) {
            final SubLObject skeletal_proofs = forward_propagation_generate_skeletal_proofs(triggering);
            if (forward_harness.NIL != skeletal_proofs) {
                forward_propagation_add_skeletal_proofs(forward_ps, skeletal_proofs);
                total_added = Numbers.add(total_added, Sequences.length(skeletal_proofs));
            }
            cdolist_list_var = cdolist_list_var.rest();
            triggering = cdolist_list_var.first();
        }
        return total_added;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 25040L)
    public static SubLObject forward_propagation_select_next_triggerings(final SubLObject forward_ps) {
        final SubLObject next_triggerings = set.set_element_list(forward_ps_triggerings_working_set(forward_ps));
        return next_triggerings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 25239L)
    public static SubLObject forward_propatation_sort_triggerings(final SubLObject triggerings_to_process_next) {
        return triggerings_to_process_next;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 25496L)
    public static SubLObject forward_propagation_generate_skeletal_proofs(final SubLObject triggering) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule = forward_triggering_rule(triggering);
        final SubLObject target_asent = forward_triggering_target_asent(triggering);
        final SubLObject target_truth = forward_triggering_target_truth(triggering);
        final SubLObject query_dnf = forward_triggering_query_dnf(triggering);
        final SubLObject pragmatic_dnf = forward_triggering_pragmatic_dnf(triggering);
        final SubLObject propagation_mt = forward_triggering_propagation_mt(triggering);
        final SubLObject restricted_examine_asent = forward_triggering_restricted_examine_asent(triggering);
        final SubLObject trigger_bindings = forward_triggering_trigger_bindings(triggering);
        final SubLObject trigger_supports = forward_triggering_trigger_supports(triggering);
        SubLObject skeletal_proofs = (SubLObject)forward_harness.NIL;
        final SubLObject _prev_bind_0 = forward_harness.$forward_propagation_generated_skeletal_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_2 = forward.$forward_non_trigger_literal_restricted_examine_asent$.currentBinding(thread);
        final SubLObject _prev_bind_3 = forward.$add_forward_deductions_from_supports_callback$.currentBinding(thread);
        try {
            forward_harness.$forward_propagation_generated_skeletal_proofs$.bind((SubLObject)forward_harness.NIL, thread);
            forward.$forward_non_trigger_literal_restricted_examine_asent$.bind(restricted_examine_asent, thread);
            forward.$add_forward_deductions_from_supports_callback$.bind((SubLObject)forward_harness.$sym147$FORWARD_PROPAGATE_NOTE_GENERATED_SKELETAL_PROOF, thread);
            forward.handle_one_forward_propagation(query_dnf, pragmatic_dnf, propagation_mt, target_asent, target_truth, trigger_bindings, rule, trigger_supports);
            skeletal_proofs = Sequences.nreverse(forward_harness.$forward_propagation_generated_skeletal_proofs$.getDynamicValue(thread));
        }
        finally {
            forward.$add_forward_deductions_from_supports_callback$.rebind(_prev_bind_3, thread);
            forward.$forward_non_trigger_literal_restricted_examine_asent$.rebind(_prev_bind_2, thread);
            forward_harness.$forward_propagation_generated_skeletal_proofs$.rebind(_prev_bind_0, thread);
        }
        return skeletal_proofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 26829L)
    public static SubLObject forward_propagate_note_generated_skeletal_proof(final SubLObject propagation_mt, final SubLObject concluded_asent, final SubLObject concluded_truth, final SubLObject concluded_supports, final SubLObject pragmatic_supports, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject skeletal_proof = new_skeletal_proof(concluded_asent, concluded_truth, trigger_bindings, inference_bindings, concluded_supports, pragmatic_supports, rule, propagation_mt);
        forward_harness.$forward_propagation_generated_skeletal_proofs$.setDynamicValue((SubLObject)ConsesLow.cons(skeletal_proof, forward_harness.$forward_propagation_generated_skeletal_proofs$.getDynamicValue(thread)), thread);
        return skeletal_proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 27344L)
    public static SubLObject forward_propagation_process_some_skeletal_proofs(final SubLObject forward_ps) {
        SubLObject skeletal_proofs_to_process_next = forward_propagation_select_next_skeletal_proofs(forward_ps);
        SubLObject total_added = (SubLObject)forward_harness.ZERO_INTEGER;
        skeletal_proofs_to_process_next = forward_propatation_sort_skeletal_proofs(skeletal_proofs_to_process_next);
        forward_propagation_remove_skeletal_proofs(forward_ps, skeletal_proofs_to_process_next);
        SubLObject cdolist_list_var = skeletal_proofs_to_process_next;
        SubLObject skeletal_proof = (SubLObject)forward_harness.NIL;
        skeletal_proof = cdolist_list_var.first();
        while (forward_harness.NIL != cdolist_list_var) {
            final SubLObject placeable_proofs = forward_propagation_generate_placeable_proofs(skeletal_proof);
            if (forward_harness.NIL != placeable_proofs) {
                forward_propagation_add_placeable_proofs(forward_ps, placeable_proofs);
                total_added = Numbers.add(total_added, Sequences.length(placeable_proofs));
            }
            cdolist_list_var = cdolist_list_var.rest();
            skeletal_proof = cdolist_list_var.first();
        }
        return total_added;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 28236L)
    public static SubLObject forward_propagation_select_next_skeletal_proofs(final SubLObject forward_ps) {
        final SubLObject next_skeletal_proofs = set.set_element_list(forward_ps_skeletal_proofs_working_set(forward_ps));
        return next_skeletal_proofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 28451L)
    public static SubLObject forward_propatation_sort_skeletal_proofs(final SubLObject skeletal_proofs_to_process_next) {
        return skeletal_proofs_to_process_next;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 28616L)
    public static SubLObject forward_propagation_generate_placeable_proofs(final SubLObject skeletal_proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject concluded_asent = skeletal_proof_concluded_asent(skeletal_proof);
        final SubLObject concluded_truth = skeletal_proof_concluded_truth(skeletal_proof);
        final SubLObject trigger_bindings = skeletal_proof_trigger_bindings(skeletal_proof);
        final SubLObject inference_bindings = skeletal_proof_inference_bindings(skeletal_proof);
        final SubLObject concluded_supports = skeletal_proof_concluded_supports(skeletal_proof);
        final SubLObject pragmatic_supports = skeletal_proof_pragmatic_supports(skeletal_proof);
        final SubLObject rule = skeletal_proof_rule(skeletal_proof);
        final SubLObject propagation_mt = skeletal_proof_propagation_mt(skeletal_proof);
        SubLObject placeable_proofs = (SubLObject)forward_harness.NIL;
        final SubLObject _prev_bind_0 = forward.$forward_inference_assertibles_queue$.currentBinding(thread);
        try {
            forward.$forward_inference_assertibles_queue$.bind(queues.create_queue((SubLObject)forward_harness.UNPROVIDED), thread);
            forward.add_forward_deductions_from_supports(propagation_mt, concluded_asent, concluded_truth, concluded_supports, pragmatic_supports, rule, trigger_bindings, inference_bindings);
            SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(forward.$forward_inference_assertibles_queue$.getDynamicValue(thread));
            SubLObject assertible = (SubLObject)forward_harness.NIL;
            assertible = cdolist_list_var.first();
            while (forward_harness.NIL != cdolist_list_var) {
                final SubLObject placeable_proof = new_placeable_proof_from_assertible(assertible);
                placeable_proofs = (SubLObject)ConsesLow.cons(placeable_proof, placeable_proofs);
                cdolist_list_var = cdolist_list_var.rest();
                assertible = cdolist_list_var.first();
            }
        }
        finally {
            forward.$forward_inference_assertibles_queue$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(placeable_proofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 29818L)
    public static SubLObject forward_propagation_process_some_placeable_proofs(final SubLObject forward_ps) {
        SubLObject placeable_proofs_to_process_next = forward_propagation_select_next_placeable_proofs(forward_ps);
        SubLObject total_added = (SubLObject)forward_harness.ZERO_INTEGER;
        placeable_proofs_to_process_next = forward_propatation_sort_placeable_proofs(placeable_proofs_to_process_next);
        forward_propagation_remove_placeable_proofs(forward_ps, placeable_proofs_to_process_next);
        final SubLObject assertibles_queue = forward_propagation_assertibles_queue_from_placeable_proofs(placeable_proofs_to_process_next);
        final SubLObject new_assertions = forward.forward_propagate_handle_batched_assertibles(assertibles_queue, (SubLObject)forward_harness.T);
        if (forward_harness.NIL != new_assertions) {
            memoization_state.clear_all_current_memoization();
            forward_propagation_add_assertions(forward_ps, new_assertions);
            total_added = Numbers.add(total_added, Sequences.length(new_assertions));
        }
        return total_added;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 30804L)
    public static SubLObject forward_propagation_select_next_placeable_proofs(final SubLObject forward_ps) {
        final SubLObject next_placeable_proofs = set.set_element_list(forward_ps_placeable_proofs_working_set(forward_ps));
        return next_placeable_proofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 31023L)
    public static SubLObject forward_propatation_sort_placeable_proofs(final SubLObject placeable_proofs_to_process_next) {
        return placeable_proofs_to_process_next;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-harness.lisp", position = 31191L)
    public static SubLObject forward_propagation_assertibles_queue_from_placeable_proofs(final SubLObject placeable_proofs) {
        final SubLObject assertibles = Mapping.mapcar(Symbols.symbol_function((SubLObject)forward_harness.$sym148$PLACEABLE_PROOF_ASSERTIBLE), placeable_proofs);
        final SubLObject assertibles_queue = queues.create_queue(assertibles);
        return assertibles_queue;
    }
    
    public static SubLObject declare_forward_harness_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_state_print_function_trampoline", "FORWARD-PROPAGATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_state_p", "FORWARD-PROPAGATION-STATE-P", 1, 0, false);
        new $forward_propagation_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_ps_assertions_working_set", "FORWARD-PS-ASSERTIONS-WORKING-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_ps_triggerings_working_set", "FORWARD-PS-TRIGGERINGS-WORKING-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_ps_skeletal_proofs_working_set", "FORWARD-PS-SKELETAL-PROOFS-WORKING-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_ps_placeable_proofs_working_set", "FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_ps_propagation_mt", "FORWARD-PS-PROPAGATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_ps_assertions_working_set", "_CSETF-FORWARD-PS-ASSERTIONS-WORKING-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_ps_triggerings_working_set", "_CSETF-FORWARD-PS-TRIGGERINGS-WORKING-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_ps_skeletal_proofs_working_set", "_CSETF-FORWARD-PS-SKELETAL-PROOFS-WORKING-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_ps_placeable_proofs_working_set", "_CSETF-FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_ps_propagation_mt", "_CSETF-FORWARD-PS-PROPAGATION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "make_forward_propagation_state", "MAKE-FORWARD-PROPAGATION-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "visit_defstruct_forward_propagation_state", "VISIT-DEFSTRUCT-FORWARD-PROPAGATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "visit_defstruct_object_forward_propagation_state_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-PROPAGATION-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "print_forward_propagation_state", "PRINT-FORWARD-PROPAGATION-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "new_forward_propagation_state", "NEW-FORWARD-PROPAGATION-STATE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_state_propagation_mt", "FORWARD-PROPAGATION-STATE-PROPAGATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_state_assertions_size", "FORWARD-PROPAGATION-STATE-ASSERTIONS-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_some_assertionsP", "FORWARD-PROPAGATION-SOME-ASSERTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_state_triggerings_size", "FORWARD-PROPAGATION-STATE-TRIGGERINGS-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_some_triggeringsP", "FORWARD-PROPAGATION-SOME-TRIGGERINGS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_state_skeletal_proofs_size", "FORWARD-PROPAGATION-STATE-SKELETAL-PROOFS-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_some_skeletal_proofsP", "FORWARD-PROPAGATION-SOME-SKELETAL-PROOFS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_state_placeable_proofs_size", "FORWARD-PROPAGATION-STATE-PLACEABLE-PROOFS-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_some_placeable_proofsP", "FORWARD-PROPAGATION-SOME-PLACEABLE-PROOFS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_add_assertions", "FORWARD-PROPAGATION-ADD-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_remove_assertions", "FORWARD-PROPAGATION-REMOVE-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_add_triggerings", "FORWARD-PROPAGATION-ADD-TRIGGERINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_remove_triggerings", "FORWARD-PROPAGATION-REMOVE-TRIGGERINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_add_skeletal_proofs", "FORWARD-PROPAGATION-ADD-SKELETAL-PROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_remove_skeletal_proofs", "FORWARD-PROPAGATION-REMOVE-SKELETAL-PROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_add_placeable_proofs", "FORWARD-PROPAGATION-ADD-PLACEABLE-PROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_remove_placeable_proofs", "FORWARD-PROPAGATION-REMOVE-PLACEABLE-PROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_print_function_trampoline", "FORWARD-TRIGGERING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_p", "FORWARD-TRIGGERING-P", 1, 0, false);
        new $forward_triggering_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_trig_rule", "FORWARD-TRIG-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_trig_source_asent", "FORWARD-TRIG-SOURCE-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_trig_source_truth", "FORWARD-TRIG-SOURCE-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_trig_target_asent", "FORWARD-TRIG-TARGET-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_trig_target_truth", "FORWARD-TRIG-TARGET-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_trig_query_dnf", "FORWARD-TRIG-QUERY-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_trig_pragmatic_dnf", "FORWARD-TRIG-PRAGMATIC-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_trig_propagation_mt", "FORWARD-TRIG-PROPAGATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_trig_restricted_examine_asent", "FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_trig_trigger_bindings", "FORWARD-TRIG-TRIGGER-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_trig_trigger_supports", "FORWARD-TRIG-TRIGGER-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_trig_rule", "_CSETF-FORWARD-TRIG-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_trig_source_asent", "_CSETF-FORWARD-TRIG-SOURCE-ASENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_trig_source_truth", "_CSETF-FORWARD-TRIG-SOURCE-TRUTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_trig_target_asent", "_CSETF-FORWARD-TRIG-TARGET-ASENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_trig_target_truth", "_CSETF-FORWARD-TRIG-TARGET-TRUTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_trig_query_dnf", "_CSETF-FORWARD-TRIG-QUERY-DNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_trig_pragmatic_dnf", "_CSETF-FORWARD-TRIG-PRAGMATIC-DNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_trig_propagation_mt", "_CSETF-FORWARD-TRIG-PROPAGATION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_trig_restricted_examine_asent", "_CSETF-FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_trig_trigger_bindings", "_CSETF-FORWARD-TRIG-TRIGGER-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_forward_trig_trigger_supports", "_CSETF-FORWARD-TRIG-TRIGGER-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "make_forward_triggering", "MAKE-FORWARD-TRIGGERING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "visit_defstruct_forward_triggering", "VISIT-DEFSTRUCT-FORWARD-TRIGGERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "visit_defstruct_object_forward_triggering_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-TRIGGERING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "sxhash_forward_triggering_method", "SXHASH-FORWARD-TRIGGERING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "print_forward_triggering", "PRINT-FORWARD-TRIGGERING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "new_forward_triggering", "NEW-FORWARD-TRIGGERING", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_rule", "FORWARD-TRIGGERING-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_source_asent", "FORWARD-TRIGGERING-SOURCE-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_source_truth", "FORWARD-TRIGGERING-SOURCE-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_target_asent", "FORWARD-TRIGGERING-TARGET-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_target_truth", "FORWARD-TRIGGERING-TARGET-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_query_dnf", "FORWARD-TRIGGERING-QUERY-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_pragmatic_dnf", "FORWARD-TRIGGERING-PRAGMATIC-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_propagation_mt", "FORWARD-TRIGGERING-PROPAGATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_restricted_examine_asent", "FORWARD-TRIGGERING-RESTRICTED-EXAMINE-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_trigger_bindings", "FORWARD-TRIGGERING-TRIGGER-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_triggering_trigger_supports", "FORWARD-TRIGGERING-TRIGGER-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skeletal_proof_print_function_trampoline", "SKELETAL-PROOF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skeletal_proof_p", "SKELETAL-PROOF-P", 1, 0, false);
        new $skeletal_proof_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skel_proof_concluded_asent", "SKEL-PROOF-CONCLUDED-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skel_proof_concluded_truth", "SKEL-PROOF-CONCLUDED-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skel_proof_trigger_bindings", "SKEL-PROOF-TRIGGER-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skel_proof_inference_bindings", "SKEL-PROOF-INFERENCE-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skel_proof_concluded_supports", "SKEL-PROOF-CONCLUDED-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skel_proof_pragmatic_supports", "SKEL-PROOF-PRAGMATIC-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skel_proof_rule", "SKEL-PROOF-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skel_proof_propagation_mt", "SKEL-PROOF-PROPAGATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_skel_proof_concluded_asent", "_CSETF-SKEL-PROOF-CONCLUDED-ASENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_skel_proof_concluded_truth", "_CSETF-SKEL-PROOF-CONCLUDED-TRUTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_skel_proof_trigger_bindings", "_CSETF-SKEL-PROOF-TRIGGER-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_skel_proof_inference_bindings", "_CSETF-SKEL-PROOF-INFERENCE-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_skel_proof_concluded_supports", "_CSETF-SKEL-PROOF-CONCLUDED-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_skel_proof_pragmatic_supports", "_CSETF-SKEL-PROOF-PRAGMATIC-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_skel_proof_rule", "_CSETF-SKEL-PROOF-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_skel_proof_propagation_mt", "_CSETF-SKEL-PROOF-PROPAGATION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "make_skeletal_proof", "MAKE-SKELETAL-PROOF", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "visit_defstruct_skeletal_proof", "VISIT-DEFSTRUCT-SKELETAL-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "visit_defstruct_object_skeletal_proof_method", "VISIT-DEFSTRUCT-OBJECT-SKELETAL-PROOF-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "sxhash_skeletal_proof_method", "SXHASH-SKELETAL-PROOF-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "print_skeletal_proof", "PRINT-SKELETAL-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "new_skeletal_proof", "NEW-SKELETAL-PROOF", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skeletal_proof_concluded_asent", "SKELETAL-PROOF-CONCLUDED-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skeletal_proof_concluded_truth", "SKELETAL-PROOF-CONCLUDED-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skeletal_proof_trigger_bindings", "SKELETAL-PROOF-TRIGGER-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skeletal_proof_inference_bindings", "SKELETAL-PROOF-INFERENCE-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skeletal_proof_concluded_supports", "SKELETAL-PROOF-CONCLUDED-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skeletal_proof_pragmatic_supports", "SKELETAL-PROOF-PRAGMATIC-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skeletal_proof_rule", "SKELETAL-PROOF-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "skeletal_proof_propagation_mt", "SKELETAL-PROOF-PROPAGATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "placeable_proof_print_function_trampoline", "PLACEABLE-PROOF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "placeable_proof_p", "PLACEABLE-PROOF-P", 1, 0, false);
        new $placeable_proof_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "plac_proof_concluded_asent", "PLAC-PROOF-CONCLUDED-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "plac_proof_concluded_mt", "PLAC-PROOF-CONCLUDED-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "plac_proof_concluded_truth", "PLAC-PROOF-CONCLUDED-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "plac_proof_assertible", "PLAC-PROOF-ASSERTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_plac_proof_concluded_asent", "_CSETF-PLAC-PROOF-CONCLUDED-ASENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_plac_proof_concluded_mt", "_CSETF-PLAC-PROOF-CONCLUDED-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_plac_proof_concluded_truth", "_CSETF-PLAC-PROOF-CONCLUDED-TRUTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "_csetf_plac_proof_assertible", "_CSETF-PLAC-PROOF-ASSERTIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "make_placeable_proof", "MAKE-PLACEABLE-PROOF", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "visit_defstruct_placeable_proof", "VISIT-DEFSTRUCT-PLACEABLE-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "visit_defstruct_object_placeable_proof_method", "VISIT-DEFSTRUCT-OBJECT-PLACEABLE-PROOF-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "sxhash_placeable_proof_method", "SXHASH-PLACEABLE-PROOF-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "print_placeable_proof", "PRINT-PLACEABLE-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "new_placeable_proof_from_assertible", "NEW-PLACEABLE-PROOF-FROM-ASSERTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "placeable_proof_concluded_asent", "PLACEABLE-PROOF-CONCLUDED-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "placeable_proof_concluded_mt", "PLACEABLE-PROOF-CONCLUDED-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "placeable_proof_concluded_truth", "PLACEABLE-PROOF-CONCLUDED-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "placeable_proof_assertible", "PLACEABLE-PROOF-ASSERTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagate_assertion_to_quiescence", "FORWARD-PROPAGATE-ASSERTION-TO-QUIESCENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagate_assertions_to_quiescence", "FORWARD-PROPAGATE-ASSERTIONS-TO-QUIESCENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_state_exhaustedP", "FORWARD-PROPAGATION-STATE-EXHAUSTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_process_some_assertions", "FORWARD-PROPAGATION-PROCESS-SOME-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_select_next_assertions", "FORWARD-PROPAGATION-SELECT-NEXT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propatation_sort_assertions", "FORWARD-PROPATATION-SORT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_generate_triggerings", "FORWARD-PROPAGATION-GENERATE-TRIGGERINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagate_note_generated_triggering", "FORWARD-PROPAGATE-NOTE-GENERATED-TRIGGERING", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_process_some_triggerings", "FORWARD-PROPAGATION-PROCESS-SOME-TRIGGERINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_select_next_triggerings", "FORWARD-PROPAGATION-SELECT-NEXT-TRIGGERINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propatation_sort_triggerings", "FORWARD-PROPATATION-SORT-TRIGGERINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_generate_skeletal_proofs", "FORWARD-PROPAGATION-GENERATE-SKELETAL-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagate_note_generated_skeletal_proof", "FORWARD-PROPAGATE-NOTE-GENERATED-SKELETAL-PROOF", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_process_some_skeletal_proofs", "FORWARD-PROPAGATION-PROCESS-SOME-SKELETAL-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_select_next_skeletal_proofs", "FORWARD-PROPAGATION-SELECT-NEXT-SKELETAL-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propatation_sort_skeletal_proofs", "FORWARD-PROPATATION-SORT-SKELETAL-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_generate_placeable_proofs", "FORWARD-PROPAGATION-GENERATE-PLACEABLE-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_process_some_placeable_proofs", "FORWARD-PROPAGATION-PROCESS-SOME-PLACEABLE-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_select_next_placeable_proofs", "FORWARD-PROPAGATION-SELECT-NEXT-PLACEABLE-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propatation_sort_placeable_proofs", "FORWARD-PROPATATION-SORT-PLACEABLE-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_harness", "forward_propagation_assertibles_queue_from_placeable_proofs", "FORWARD-PROPAGATION-ASSERTIBLES-QUEUE-FROM-PLACEABLE-PROOFS", 1, 0, false);
        return (SubLObject)forward_harness.NIL;
    }
    
    public static SubLObject init_forward_harness_file() {
        forward_harness.$dtp_forward_propagation_state$ = SubLFiles.defconstant("*DTP-FORWARD-PROPAGATION-STATE*", (SubLObject)forward_harness.$sym0$FORWARD_PROPAGATION_STATE);
        forward_harness.$dtp_forward_triggering$ = SubLFiles.defconstant("*DTP-FORWARD-TRIGGERING*", (SubLObject)forward_harness.$sym34$FORWARD_TRIGGERING);
        forward_harness.$dtp_skeletal_proof$ = SubLFiles.defconstant("*DTP-SKELETAL-PROOF*", (SubLObject)forward_harness.$sym86$SKELETAL_PROOF);
        forward_harness.$dtp_placeable_proof$ = SubLFiles.defconstant("*DTP-PLACEABLE-PROOF*", (SubLObject)forward_harness.$sym121$PLACEABLE_PROOF);
        forward_harness.$forward_propagation_generated_triggerings$ = SubLFiles.defparameter("*FORWARD-PROPAGATION-GENERATED-TRIGGERINGS*", (SubLObject)forward_harness.NIL);
        forward_harness.$forward_propagation_generated_skeletal_proofs$ = SubLFiles.defparameter("*FORWARD-PROPAGATION-GENERATED-SKELETAL-PROOFS*", (SubLObject)forward_harness.NIL);
        return (SubLObject)forward_harness.NIL;
    }
    
    public static SubLObject setup_forward_harness_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), forward_harness.$dtp_forward_propagation_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)forward_harness.$sym7$FORWARD_PROPAGATION_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)forward_harness.$list8);
        Structures.def_csetf((SubLObject)forward_harness.$sym9$FORWARD_PS_ASSERTIONS_WORKING_SET, (SubLObject)forward_harness.$sym10$_CSETF_FORWARD_PS_ASSERTIONS_WORKING_SET);
        Structures.def_csetf((SubLObject)forward_harness.$sym11$FORWARD_PS_TRIGGERINGS_WORKING_SET, (SubLObject)forward_harness.$sym12$_CSETF_FORWARD_PS_TRIGGERINGS_WORKING_SET);
        Structures.def_csetf((SubLObject)forward_harness.$sym13$FORWARD_PS_SKELETAL_PROOFS_WORKING_SET, (SubLObject)forward_harness.$sym14$_CSETF_FORWARD_PS_SKELETAL_PROOFS_WORKING_SET);
        Structures.def_csetf((SubLObject)forward_harness.$sym15$FORWARD_PS_PLACEABLE_PROOFS_WORKING_SET, (SubLObject)forward_harness.$sym16$_CSETF_FORWARD_PS_PLACEABLE_PROOFS_WORKING_SET);
        Structures.def_csetf((SubLObject)forward_harness.$sym17$FORWARD_PS_PROPAGATION_MT, (SubLObject)forward_harness.$sym18$_CSETF_FORWARD_PS_PROPAGATION_MT);
        Equality.identity((SubLObject)forward_harness.$sym0$FORWARD_PROPAGATION_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), forward_harness.$dtp_forward_propagation_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)forward_harness.$sym29$VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATION_STATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), forward_harness.$dtp_forward_triggering$.getGlobalValue(), Symbols.symbol_function((SubLObject)forward_harness.$sym41$FORWARD_TRIGGERING_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)forward_harness.$list42);
        Structures.def_csetf((SubLObject)forward_harness.$sym43$FORWARD_TRIG_RULE, (SubLObject)forward_harness.$sym44$_CSETF_FORWARD_TRIG_RULE);
        Structures.def_csetf((SubLObject)forward_harness.$sym45$FORWARD_TRIG_SOURCE_ASENT, (SubLObject)forward_harness.$sym46$_CSETF_FORWARD_TRIG_SOURCE_ASENT);
        Structures.def_csetf((SubLObject)forward_harness.$sym47$FORWARD_TRIG_SOURCE_TRUTH, (SubLObject)forward_harness.$sym48$_CSETF_FORWARD_TRIG_SOURCE_TRUTH);
        Structures.def_csetf((SubLObject)forward_harness.$sym49$FORWARD_TRIG_TARGET_ASENT, (SubLObject)forward_harness.$sym50$_CSETF_FORWARD_TRIG_TARGET_ASENT);
        Structures.def_csetf((SubLObject)forward_harness.$sym51$FORWARD_TRIG_TARGET_TRUTH, (SubLObject)forward_harness.$sym52$_CSETF_FORWARD_TRIG_TARGET_TRUTH);
        Structures.def_csetf((SubLObject)forward_harness.$sym53$FORWARD_TRIG_QUERY_DNF, (SubLObject)forward_harness.$sym54$_CSETF_FORWARD_TRIG_QUERY_DNF);
        Structures.def_csetf((SubLObject)forward_harness.$sym55$FORWARD_TRIG_PRAGMATIC_DNF, (SubLObject)forward_harness.$sym56$_CSETF_FORWARD_TRIG_PRAGMATIC_DNF);
        Structures.def_csetf((SubLObject)forward_harness.$sym57$FORWARD_TRIG_PROPAGATION_MT, (SubLObject)forward_harness.$sym58$_CSETF_FORWARD_TRIG_PROPAGATION_MT);
        Structures.def_csetf((SubLObject)forward_harness.$sym59$FORWARD_TRIG_RESTRICTED_EXAMINE_ASENT, (SubLObject)forward_harness.$sym60$_CSETF_FORWARD_TRIG_RESTRICTED_EXAMINE_ASENT);
        Structures.def_csetf((SubLObject)forward_harness.$sym61$FORWARD_TRIG_TRIGGER_BINDINGS, (SubLObject)forward_harness.$sym62$_CSETF_FORWARD_TRIG_TRIGGER_BINDINGS);
        Structures.def_csetf((SubLObject)forward_harness.$sym63$FORWARD_TRIG_TRIGGER_SUPPORTS, (SubLObject)forward_harness.$sym64$_CSETF_FORWARD_TRIG_TRIGGER_SUPPORTS);
        Equality.identity((SubLObject)forward_harness.$sym34$FORWARD_TRIGGERING);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), forward_harness.$dtp_forward_triggering$.getGlobalValue(), Symbols.symbol_function((SubLObject)forward_harness.$sym76$VISIT_DEFSTRUCT_OBJECT_FORWARD_TRIGGERING_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), forward_harness.$dtp_forward_triggering$.getGlobalValue(), Symbols.symbol_function((SubLObject)forward_harness.$sym78$SXHASH_FORWARD_TRIGGERING_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), forward_harness.$dtp_skeletal_proof$.getGlobalValue(), Symbols.symbol_function((SubLObject)forward_harness.$sym93$SKELETAL_PROOF_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)forward_harness.$list94);
        Structures.def_csetf((SubLObject)forward_harness.$sym95$SKEL_PROOF_CONCLUDED_ASENT, (SubLObject)forward_harness.$sym96$_CSETF_SKEL_PROOF_CONCLUDED_ASENT);
        Structures.def_csetf((SubLObject)forward_harness.$sym97$SKEL_PROOF_CONCLUDED_TRUTH, (SubLObject)forward_harness.$sym98$_CSETF_SKEL_PROOF_CONCLUDED_TRUTH);
        Structures.def_csetf((SubLObject)forward_harness.$sym99$SKEL_PROOF_TRIGGER_BINDINGS, (SubLObject)forward_harness.$sym100$_CSETF_SKEL_PROOF_TRIGGER_BINDINGS);
        Structures.def_csetf((SubLObject)forward_harness.$sym101$SKEL_PROOF_INFERENCE_BINDINGS, (SubLObject)forward_harness.$sym102$_CSETF_SKEL_PROOF_INFERENCE_BINDINGS);
        Structures.def_csetf((SubLObject)forward_harness.$sym103$SKEL_PROOF_CONCLUDED_SUPPORTS, (SubLObject)forward_harness.$sym104$_CSETF_SKEL_PROOF_CONCLUDED_SUPPORTS);
        Structures.def_csetf((SubLObject)forward_harness.$sym105$SKEL_PROOF_PRAGMATIC_SUPPORTS, (SubLObject)forward_harness.$sym106$_CSETF_SKEL_PROOF_PRAGMATIC_SUPPORTS);
        Structures.def_csetf((SubLObject)forward_harness.$sym107$SKEL_PROOF_RULE, (SubLObject)forward_harness.$sym108$_CSETF_SKEL_PROOF_RULE);
        Structures.def_csetf((SubLObject)forward_harness.$sym109$SKEL_PROOF_PROPAGATION_MT, (SubLObject)forward_harness.$sym110$_CSETF_SKEL_PROOF_PROPAGATION_MT);
        Equality.identity((SubLObject)forward_harness.$sym86$SKELETAL_PROOF);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), forward_harness.$dtp_skeletal_proof$.getGlobalValue(), Symbols.symbol_function((SubLObject)forward_harness.$sym117$VISIT_DEFSTRUCT_OBJECT_SKELETAL_PROOF_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), forward_harness.$dtp_skeletal_proof$.getGlobalValue(), Symbols.symbol_function((SubLObject)forward_harness.$sym119$SXHASH_SKELETAL_PROOF_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), forward_harness.$dtp_placeable_proof$.getGlobalValue(), Symbols.symbol_function((SubLObject)forward_harness.$sym128$PLACEABLE_PROOF_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)forward_harness.$list129);
        Structures.def_csetf((SubLObject)forward_harness.$sym130$PLAC_PROOF_CONCLUDED_ASENT, (SubLObject)forward_harness.$sym131$_CSETF_PLAC_PROOF_CONCLUDED_ASENT);
        Structures.def_csetf((SubLObject)forward_harness.$sym132$PLAC_PROOF_CONCLUDED_MT, (SubLObject)forward_harness.$sym133$_CSETF_PLAC_PROOF_CONCLUDED_MT);
        Structures.def_csetf((SubLObject)forward_harness.$sym134$PLAC_PROOF_CONCLUDED_TRUTH, (SubLObject)forward_harness.$sym135$_CSETF_PLAC_PROOF_CONCLUDED_TRUTH);
        Structures.def_csetf((SubLObject)forward_harness.$sym136$PLAC_PROOF_ASSERTIBLE, (SubLObject)forward_harness.$sym137$_CSETF_PLAC_PROOF_ASSERTIBLE);
        Equality.identity((SubLObject)forward_harness.$sym121$PLACEABLE_PROOF);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), forward_harness.$dtp_placeable_proof$.getGlobalValue(), Symbols.symbol_function((SubLObject)forward_harness.$sym141$VISIT_DEFSTRUCT_OBJECT_PLACEABLE_PROOF_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), forward_harness.$dtp_placeable_proof$.getGlobalValue(), Symbols.symbol_function((SubLObject)forward_harness.$sym143$SXHASH_PLACEABLE_PROOF_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)forward_harness.$sym146$FORWARD_PROPAGATE_NOTE_GENERATED_TRIGGERING);
        utilities_macros.note_funcall_helper_function((SubLObject)forward_harness.$sym147$FORWARD_PROPAGATE_NOTE_GENERATED_SKELETAL_PROOF);
        return (SubLObject)forward_harness.NIL;
    }
    
    public void declareFunctions() {
        declare_forward_harness_file();
    }
    
    public void initializeVariables() {
        init_forward_harness_file();
    }
    
    public void runTopLevelForms() {
        setup_forward_harness_file();
    }
    
    static {
        me = (SubLFile)new forward_harness();
        forward_harness.$dtp_forward_propagation_state$ = null;
        forward_harness.$dtp_forward_triggering$ = null;
        forward_harness.$dtp_skeletal_proof$ = null;
        forward_harness.$dtp_placeable_proof$ = null;
        forward_harness.$forward_propagation_generated_triggerings$ = null;
        forward_harness.$forward_propagation_generated_skeletal_proofs$ = null;
        $sym0$FORWARD_PROPAGATION_STATE = SubLObjectFactory.makeSymbol("FORWARD-PROPAGATION-STATE");
        $sym1$FORWARD_PROPAGATION_STATE_P = SubLObjectFactory.makeSymbol("FORWARD-PROPAGATION-STATE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGERINGS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("SKELETAL-PROOFS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("PLACEABLE-PROOFS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("PROPAGATION-MT"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTIONS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeKeyword("TRIGGERINGS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeKeyword("SKELETAL-PROOFS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeKeyword("PLACEABLE-PROOFS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeKeyword("PROPAGATION-MT"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORWARD-PS-ASSERTIONS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-PS-TRIGGERINGS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-PS-SKELETAL-PROOFS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-PS-PROPAGATION-MT"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORWARD-PS-ASSERTIONS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORWARD-PS-TRIGGERINGS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORWARD-PS-SKELETAL-PROOFS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORWARD-PS-PROPAGATION-MT"));
        $sym6$PRINT_FORWARD_PROPAGATION_STATE = SubLObjectFactory.makeSymbol("PRINT-FORWARD-PROPAGATION-STATE");
        $sym7$FORWARD_PROPAGATION_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FORWARD-PROPAGATION-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-PROPAGATION-STATE-P"));
        $sym9$FORWARD_PS_ASSERTIONS_WORKING_SET = SubLObjectFactory.makeSymbol("FORWARD-PS-ASSERTIONS-WORKING-SET");
        $sym10$_CSETF_FORWARD_PS_ASSERTIONS_WORKING_SET = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-PS-ASSERTIONS-WORKING-SET");
        $sym11$FORWARD_PS_TRIGGERINGS_WORKING_SET = SubLObjectFactory.makeSymbol("FORWARD-PS-TRIGGERINGS-WORKING-SET");
        $sym12$_CSETF_FORWARD_PS_TRIGGERINGS_WORKING_SET = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-PS-TRIGGERINGS-WORKING-SET");
        $sym13$FORWARD_PS_SKELETAL_PROOFS_WORKING_SET = SubLObjectFactory.makeSymbol("FORWARD-PS-SKELETAL-PROOFS-WORKING-SET");
        $sym14$_CSETF_FORWARD_PS_SKELETAL_PROOFS_WORKING_SET = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-PS-SKELETAL-PROOFS-WORKING-SET");
        $sym15$FORWARD_PS_PLACEABLE_PROOFS_WORKING_SET = SubLObjectFactory.makeSymbol("FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET");
        $sym16$_CSETF_FORWARD_PS_PLACEABLE_PROOFS_WORKING_SET = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET");
        $sym17$FORWARD_PS_PROPAGATION_MT = SubLObjectFactory.makeSymbol("FORWARD-PS-PROPAGATION-MT");
        $sym18$_CSETF_FORWARD_PS_PROPAGATION_MT = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-PS-PROPAGATION-MT");
        $kw19$ASSERTIONS_WORKING_SET = SubLObjectFactory.makeKeyword("ASSERTIONS-WORKING-SET");
        $kw20$TRIGGERINGS_WORKING_SET = SubLObjectFactory.makeKeyword("TRIGGERINGS-WORKING-SET");
        $kw21$SKELETAL_PROOFS_WORKING_SET = SubLObjectFactory.makeKeyword("SKELETAL-PROOFS-WORKING-SET");
        $kw22$PLACEABLE_PROOFS_WORKING_SET = SubLObjectFactory.makeKeyword("PLACEABLE-PROOFS-WORKING-SET");
        $kw23$PROPAGATION_MT = SubLObjectFactory.makeKeyword("PROPAGATION-MT");
        $str24$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw25$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym26$MAKE_FORWARD_PROPAGATION_STATE = SubLObjectFactory.makeSymbol("MAKE-FORWARD-PROPAGATION-STATE");
        $kw27$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw28$END = SubLObjectFactory.makeKeyword("END");
        $sym29$VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATION_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-PROPAGATION-STATE-METHOD");
        $str30$__A__A__A__A_ = SubLObjectFactory.makeString("(~A,~A,~A,~A)");
        $sym31$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym32$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym33$POSSIBLY_HLMT_P = SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P");
        $sym34$FORWARD_TRIGGERING = SubLObjectFactory.makeSymbol("FORWARD-TRIGGERING");
        $sym35$FORWARD_TRIGGERING_P = SubLObjectFactory.makeSymbol("FORWARD-TRIGGERING-P");
        $list36 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("RULE"), SubLObjectFactory.makeSymbol("SOURCE-ASENT"), SubLObjectFactory.makeSymbol("SOURCE-TRUTH"), SubLObjectFactory.makeSymbol("TARGET-ASENT"), SubLObjectFactory.makeSymbol("TARGET-TRUTH"), SubLObjectFactory.makeSymbol("QUERY-DNF"), SubLObjectFactory.makeSymbol("PRAGMATIC-DNF"), SubLObjectFactory.makeSymbol("PROPAGATION-MT"), SubLObjectFactory.makeSymbol("RESTRICTED-EXAMINE-ASENT"), SubLObjectFactory.makeSymbol("TRIGGER-BINDINGS"), SubLObjectFactory.makeSymbol("TRIGGER-SUPPORTS") });
        $list37 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("RULE"), SubLObjectFactory.makeKeyword("SOURCE-ASENT"), SubLObjectFactory.makeKeyword("SOURCE-TRUTH"), SubLObjectFactory.makeKeyword("TARGET-ASENT"), SubLObjectFactory.makeKeyword("TARGET-TRUTH"), SubLObjectFactory.makeKeyword("QUERY-DNF"), SubLObjectFactory.makeKeyword("PRAGMATIC-DNF"), SubLObjectFactory.makeKeyword("PROPAGATION-MT"), SubLObjectFactory.makeKeyword("RESTRICTED-EXAMINE-ASENT"), SubLObjectFactory.makeKeyword("TRIGGER-BINDINGS"), SubLObjectFactory.makeKeyword("TRIGGER-SUPPORTS") });
        $list38 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FORWARD-TRIG-RULE"), SubLObjectFactory.makeSymbol("FORWARD-TRIG-SOURCE-ASENT"), SubLObjectFactory.makeSymbol("FORWARD-TRIG-SOURCE-TRUTH"), SubLObjectFactory.makeSymbol("FORWARD-TRIG-TARGET-ASENT"), SubLObjectFactory.makeSymbol("FORWARD-TRIG-TARGET-TRUTH"), SubLObjectFactory.makeSymbol("FORWARD-TRIG-QUERY-DNF"), SubLObjectFactory.makeSymbol("FORWARD-TRIG-PRAGMATIC-DNF"), SubLObjectFactory.makeSymbol("FORWARD-TRIG-PROPAGATION-MT"), SubLObjectFactory.makeSymbol("FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT"), SubLObjectFactory.makeSymbol("FORWARD-TRIG-TRIGGER-BINDINGS"), SubLObjectFactory.makeSymbol("FORWARD-TRIG-TRIGGER-SUPPORTS") });
        $list39 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-RULE"), SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-SOURCE-ASENT"), SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-SOURCE-TRUTH"), SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-TARGET-ASENT"), SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-TARGET-TRUTH"), SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-QUERY-DNF"), SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-PRAGMATIC-DNF"), SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-PROPAGATION-MT"), SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT"), SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-TRIGGER-BINDINGS"), SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-TRIGGER-SUPPORTS") });
        $sym40$PRINT_FORWARD_TRIGGERING = SubLObjectFactory.makeSymbol("PRINT-FORWARD-TRIGGERING");
        $sym41$FORWARD_TRIGGERING_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FORWARD-TRIGGERING-PRINT-FUNCTION-TRAMPOLINE");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-TRIGGERING-P"));
        $sym43$FORWARD_TRIG_RULE = SubLObjectFactory.makeSymbol("FORWARD-TRIG-RULE");
        $sym44$_CSETF_FORWARD_TRIG_RULE = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-RULE");
        $sym45$FORWARD_TRIG_SOURCE_ASENT = SubLObjectFactory.makeSymbol("FORWARD-TRIG-SOURCE-ASENT");
        $sym46$_CSETF_FORWARD_TRIG_SOURCE_ASENT = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-SOURCE-ASENT");
        $sym47$FORWARD_TRIG_SOURCE_TRUTH = SubLObjectFactory.makeSymbol("FORWARD-TRIG-SOURCE-TRUTH");
        $sym48$_CSETF_FORWARD_TRIG_SOURCE_TRUTH = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-SOURCE-TRUTH");
        $sym49$FORWARD_TRIG_TARGET_ASENT = SubLObjectFactory.makeSymbol("FORWARD-TRIG-TARGET-ASENT");
        $sym50$_CSETF_FORWARD_TRIG_TARGET_ASENT = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-TARGET-ASENT");
        $sym51$FORWARD_TRIG_TARGET_TRUTH = SubLObjectFactory.makeSymbol("FORWARD-TRIG-TARGET-TRUTH");
        $sym52$_CSETF_FORWARD_TRIG_TARGET_TRUTH = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-TARGET-TRUTH");
        $sym53$FORWARD_TRIG_QUERY_DNF = SubLObjectFactory.makeSymbol("FORWARD-TRIG-QUERY-DNF");
        $sym54$_CSETF_FORWARD_TRIG_QUERY_DNF = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-QUERY-DNF");
        $sym55$FORWARD_TRIG_PRAGMATIC_DNF = SubLObjectFactory.makeSymbol("FORWARD-TRIG-PRAGMATIC-DNF");
        $sym56$_CSETF_FORWARD_TRIG_PRAGMATIC_DNF = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-PRAGMATIC-DNF");
        $sym57$FORWARD_TRIG_PROPAGATION_MT = SubLObjectFactory.makeSymbol("FORWARD-TRIG-PROPAGATION-MT");
        $sym58$_CSETF_FORWARD_TRIG_PROPAGATION_MT = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-PROPAGATION-MT");
        $sym59$FORWARD_TRIG_RESTRICTED_EXAMINE_ASENT = SubLObjectFactory.makeSymbol("FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT");
        $sym60$_CSETF_FORWARD_TRIG_RESTRICTED_EXAMINE_ASENT = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT");
        $sym61$FORWARD_TRIG_TRIGGER_BINDINGS = SubLObjectFactory.makeSymbol("FORWARD-TRIG-TRIGGER-BINDINGS");
        $sym62$_CSETF_FORWARD_TRIG_TRIGGER_BINDINGS = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-TRIGGER-BINDINGS");
        $sym63$FORWARD_TRIG_TRIGGER_SUPPORTS = SubLObjectFactory.makeSymbol("FORWARD-TRIG-TRIGGER-SUPPORTS");
        $sym64$_CSETF_FORWARD_TRIG_TRIGGER_SUPPORTS = SubLObjectFactory.makeSymbol("_CSETF-FORWARD-TRIG-TRIGGER-SUPPORTS");
        $kw65$RULE = SubLObjectFactory.makeKeyword("RULE");
        $kw66$SOURCE_ASENT = SubLObjectFactory.makeKeyword("SOURCE-ASENT");
        $kw67$SOURCE_TRUTH = SubLObjectFactory.makeKeyword("SOURCE-TRUTH");
        $kw68$TARGET_ASENT = SubLObjectFactory.makeKeyword("TARGET-ASENT");
        $kw69$TARGET_TRUTH = SubLObjectFactory.makeKeyword("TARGET-TRUTH");
        $kw70$QUERY_DNF = SubLObjectFactory.makeKeyword("QUERY-DNF");
        $kw71$PRAGMATIC_DNF = SubLObjectFactory.makeKeyword("PRAGMATIC-DNF");
        $kw72$RESTRICTED_EXAMINE_ASENT = SubLObjectFactory.makeKeyword("RESTRICTED-EXAMINE-ASENT");
        $kw73$TRIGGER_BINDINGS = SubLObjectFactory.makeKeyword("TRIGGER-BINDINGS");
        $kw74$TRIGGER_SUPPORTS = SubLObjectFactory.makeKeyword("TRIGGER-SUPPORTS");
        $sym75$MAKE_FORWARD_TRIGGERING = SubLObjectFactory.makeSymbol("MAKE-FORWARD-TRIGGERING");
        $sym76$VISIT_DEFSTRUCT_OBJECT_FORWARD_TRIGGERING_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-TRIGGERING-METHOD");
        $int77$213 = SubLObjectFactory.makeInteger(213);
        $sym78$SXHASH_FORWARD_TRIGGERING_METHOD = SubLObjectFactory.makeSymbol("SXHASH-FORWARD-TRIGGERING-METHOD");
        $str79$TRIG_ = SubLObjectFactory.makeString("TRIG ");
        $str80$rule__S_ = SubLObjectFactory.makeString("rule ~S:");
        $str81$__A_S = SubLObjectFactory.makeString(" ~A~S");
        $kw82$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str83$ = SubLObjectFactory.makeString("");
        $str84$__not_ = SubLObjectFactory.makeString("#$not ");
        $str85$_to__A_S = SubLObjectFactory.makeString(" to ~A~S");
        $sym86$SKELETAL_PROOF = SubLObjectFactory.makeSymbol("SKELETAL-PROOF");
        $sym87$SKELETAL_PROOF_P = SubLObjectFactory.makeSymbol("SKELETAL-PROOF-P");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONCLUDED-ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("CONCLUDED-TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONCLUDED-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("PRAGMATIC-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("PROPAGATION-MT"));
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONCLUDED-ASENT"), (SubLObject)SubLObjectFactory.makeKeyword("CONCLUDED-TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRIGGER-BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("CONCLUDED-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("PRAGMATIC-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("RULE"), (SubLObject)SubLObjectFactory.makeKeyword("PROPAGATION-MT"));
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKEL-PROOF-CONCLUDED-ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("SKEL-PROOF-CONCLUDED-TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("SKEL-PROOF-TRIGGER-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SKEL-PROOF-INFERENCE-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SKEL-PROOF-CONCLUDED-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("SKEL-PROOF-PRAGMATIC-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("SKEL-PROOF-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("SKEL-PROOF-PROPAGATION-MT"));
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-TRIGGER-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-INFERENCE-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-PRAGMATIC-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-PROPAGATION-MT"));
        $sym92$PRINT_SKELETAL_PROOF = SubLObjectFactory.makeSymbol("PRINT-SKELETAL-PROOF");
        $sym93$SKELETAL_PROOF_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SKELETAL-PROOF-PRINT-FUNCTION-TRAMPOLINE");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SKELETAL-PROOF-P"));
        $sym95$SKEL_PROOF_CONCLUDED_ASENT = SubLObjectFactory.makeSymbol("SKEL-PROOF-CONCLUDED-ASENT");
        $sym96$_CSETF_SKEL_PROOF_CONCLUDED_ASENT = SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-ASENT");
        $sym97$SKEL_PROOF_CONCLUDED_TRUTH = SubLObjectFactory.makeSymbol("SKEL-PROOF-CONCLUDED-TRUTH");
        $sym98$_CSETF_SKEL_PROOF_CONCLUDED_TRUTH = SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-TRUTH");
        $sym99$SKEL_PROOF_TRIGGER_BINDINGS = SubLObjectFactory.makeSymbol("SKEL-PROOF-TRIGGER-BINDINGS");
        $sym100$_CSETF_SKEL_PROOF_TRIGGER_BINDINGS = SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-TRIGGER-BINDINGS");
        $sym101$SKEL_PROOF_INFERENCE_BINDINGS = SubLObjectFactory.makeSymbol("SKEL-PROOF-INFERENCE-BINDINGS");
        $sym102$_CSETF_SKEL_PROOF_INFERENCE_BINDINGS = SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-INFERENCE-BINDINGS");
        $sym103$SKEL_PROOF_CONCLUDED_SUPPORTS = SubLObjectFactory.makeSymbol("SKEL-PROOF-CONCLUDED-SUPPORTS");
        $sym104$_CSETF_SKEL_PROOF_CONCLUDED_SUPPORTS = SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-SUPPORTS");
        $sym105$SKEL_PROOF_PRAGMATIC_SUPPORTS = SubLObjectFactory.makeSymbol("SKEL-PROOF-PRAGMATIC-SUPPORTS");
        $sym106$_CSETF_SKEL_PROOF_PRAGMATIC_SUPPORTS = SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-PRAGMATIC-SUPPORTS");
        $sym107$SKEL_PROOF_RULE = SubLObjectFactory.makeSymbol("SKEL-PROOF-RULE");
        $sym108$_CSETF_SKEL_PROOF_RULE = SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-RULE");
        $sym109$SKEL_PROOF_PROPAGATION_MT = SubLObjectFactory.makeSymbol("SKEL-PROOF-PROPAGATION-MT");
        $sym110$_CSETF_SKEL_PROOF_PROPAGATION_MT = SubLObjectFactory.makeSymbol("_CSETF-SKEL-PROOF-PROPAGATION-MT");
        $kw111$CONCLUDED_ASENT = SubLObjectFactory.makeKeyword("CONCLUDED-ASENT");
        $kw112$CONCLUDED_TRUTH = SubLObjectFactory.makeKeyword("CONCLUDED-TRUTH");
        $kw113$INFERENCE_BINDINGS = SubLObjectFactory.makeKeyword("INFERENCE-BINDINGS");
        $kw114$CONCLUDED_SUPPORTS = SubLObjectFactory.makeKeyword("CONCLUDED-SUPPORTS");
        $kw115$PRAGMATIC_SUPPORTS = SubLObjectFactory.makeKeyword("PRAGMATIC-SUPPORTS");
        $sym116$MAKE_SKELETAL_PROOF = SubLObjectFactory.makeSymbol("MAKE-SKELETAL-PROOF");
        $sym117$VISIT_DEFSTRUCT_OBJECT_SKELETAL_PROOF_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SKELETAL-PROOF-METHOD");
        $int118$217 = SubLObjectFactory.makeInteger(217);
        $sym119$SXHASH_SKELETAL_PROOF_METHOD = SubLObjectFactory.makeSymbol("SXHASH-SKELETAL-PROOF-METHOD");
        $str120$_A_S = SubLObjectFactory.makeString("~A~S");
        $sym121$PLACEABLE_PROOF = SubLObjectFactory.makeSymbol("PLACEABLE-PROOF");
        $sym122$PLACEABLE_PROOF_P = SubLObjectFactory.makeSymbol("PLACEABLE-PROOF-P");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONCLUDED-ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("CONCLUDED-MT"), (SubLObject)SubLObjectFactory.makeSymbol("CONCLUDED-TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIBLE"));
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONCLUDED-ASENT"), (SubLObject)SubLObjectFactory.makeKeyword("CONCLUDED-MT"), (SubLObject)SubLObjectFactory.makeKeyword("CONCLUDED-TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTIBLE"));
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAC-PROOF-CONCLUDED-ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("PLAC-PROOF-CONCLUDED-MT"), (SubLObject)SubLObjectFactory.makeSymbol("PLAC-PROOF-CONCLUDED-TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("PLAC-PROOF-ASSERTIBLE"));
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PLAC-PROOF-ASSERTIBLE"));
        $sym127$PRINT_PLACEABLE_PROOF = SubLObjectFactory.makeSymbol("PRINT-PLACEABLE-PROOF");
        $sym128$PLACEABLE_PROOF_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PLACEABLE-PROOF-PRINT-FUNCTION-TRAMPOLINE");
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PLACEABLE-PROOF-P"));
        $sym130$PLAC_PROOF_CONCLUDED_ASENT = SubLObjectFactory.makeSymbol("PLAC-PROOF-CONCLUDED-ASENT");
        $sym131$_CSETF_PLAC_PROOF_CONCLUDED_ASENT = SubLObjectFactory.makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-ASENT");
        $sym132$PLAC_PROOF_CONCLUDED_MT = SubLObjectFactory.makeSymbol("PLAC-PROOF-CONCLUDED-MT");
        $sym133$_CSETF_PLAC_PROOF_CONCLUDED_MT = SubLObjectFactory.makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-MT");
        $sym134$PLAC_PROOF_CONCLUDED_TRUTH = SubLObjectFactory.makeSymbol("PLAC-PROOF-CONCLUDED-TRUTH");
        $sym135$_CSETF_PLAC_PROOF_CONCLUDED_TRUTH = SubLObjectFactory.makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-TRUTH");
        $sym136$PLAC_PROOF_ASSERTIBLE = SubLObjectFactory.makeSymbol("PLAC-PROOF-ASSERTIBLE");
        $sym137$_CSETF_PLAC_PROOF_ASSERTIBLE = SubLObjectFactory.makeSymbol("_CSETF-PLAC-PROOF-ASSERTIBLE");
        $kw138$CONCLUDED_MT = SubLObjectFactory.makeKeyword("CONCLUDED-MT");
        $kw139$ASSERTIBLE = SubLObjectFactory.makeKeyword("ASSERTIBLE");
        $sym140$MAKE_PLACEABLE_PROOF = SubLObjectFactory.makeSymbol("MAKE-PLACEABLE-PROOF");
        $sym141$VISIT_DEFSTRUCT_OBJECT_PLACEABLE_PROOF_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PLACEABLE-PROOF-METHOD");
        $int142$219 = SubLObjectFactory.makeInteger(219);
        $sym143$SXHASH_PLACEABLE_PROOF_METHOD = SubLObjectFactory.makeSymbol("SXHASH-PLACEABLE-PROOF-METHOD");
        $str144$_A_S_in__S = SubLObjectFactory.makeString("~A~S in ~S");
        $sym145$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $sym146$FORWARD_PROPAGATE_NOTE_GENERATED_TRIGGERING = SubLObjectFactory.makeSymbol("FORWARD-PROPAGATE-NOTE-GENERATED-TRIGGERING");
        $sym147$FORWARD_PROPAGATE_NOTE_GENERATED_SKELETAL_PROOF = SubLObjectFactory.makeSymbol("FORWARD-PROPAGATE-NOTE-GENERATED-SKELETAL-PROOF");
        $sym148$PLACEABLE_PROOF_ASSERTIBLE = SubLObjectFactory.makeSymbol("PLACEABLE-PROOF-ASSERTIBLE");
    }
    
    public static final class $forward_propagation_state_native extends SubLStructNative
    {
        public SubLObject $assertions_working_set;
        public SubLObject $triggerings_working_set;
        public SubLObject $skeletal_proofs_working_set;
        public SubLObject $placeable_proofs_working_set;
        public SubLObject $propagation_mt;
        private static final SubLStructDeclNative structDecl;
        
        public $forward_propagation_state_native() {
            this.$assertions_working_set = (SubLObject)CommonSymbols.NIL;
            this.$triggerings_working_set = (SubLObject)CommonSymbols.NIL;
            this.$skeletal_proofs_working_set = (SubLObject)CommonSymbols.NIL;
            this.$placeable_proofs_working_set = (SubLObject)CommonSymbols.NIL;
            this.$propagation_mt = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$forward_propagation_state_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$assertions_working_set;
        }
        
        public SubLObject getField3() {
            return this.$triggerings_working_set;
        }
        
        public SubLObject getField4() {
            return this.$skeletal_proofs_working_set;
        }
        
        public SubLObject getField5() {
            return this.$placeable_proofs_working_set;
        }
        
        public SubLObject getField6() {
            return this.$propagation_mt;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$assertions_working_set = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$triggerings_working_set = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$skeletal_proofs_working_set = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$placeable_proofs_working_set = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$propagation_mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$forward_propagation_state_native.class, forward_harness.$sym0$FORWARD_PROPAGATION_STATE, forward_harness.$sym1$FORWARD_PROPAGATION_STATE_P, forward_harness.$list2, forward_harness.$list3, new String[] { "$assertions_working_set", "$triggerings_working_set", "$skeletal_proofs_working_set", "$placeable_proofs_working_set", "$propagation_mt" }, forward_harness.$list4, forward_harness.$list5, forward_harness.$sym6$PRINT_FORWARD_PROPAGATION_STATE);
        }
    }
    
    public static final class $forward_propagation_state_p$UnaryFunction extends UnaryFunction
    {
        public $forward_propagation_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-PROPAGATION-STATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return forward_harness.forward_propagation_state_p(arg1);
        }
    }
    
    public static final class $forward_triggering_native extends SubLStructNative
    {
        public SubLObject $rule;
        public SubLObject $source_asent;
        public SubLObject $source_truth;
        public SubLObject $target_asent;
        public SubLObject $target_truth;
        public SubLObject $query_dnf;
        public SubLObject $pragmatic_dnf;
        public SubLObject $propagation_mt;
        public SubLObject $restricted_examine_asent;
        public SubLObject $trigger_bindings;
        public SubLObject $trigger_supports;
        private static final SubLStructDeclNative structDecl;
        
        public $forward_triggering_native() {
            this.$rule = (SubLObject)CommonSymbols.NIL;
            this.$source_asent = (SubLObject)CommonSymbols.NIL;
            this.$source_truth = (SubLObject)CommonSymbols.NIL;
            this.$target_asent = (SubLObject)CommonSymbols.NIL;
            this.$target_truth = (SubLObject)CommonSymbols.NIL;
            this.$query_dnf = (SubLObject)CommonSymbols.NIL;
            this.$pragmatic_dnf = (SubLObject)CommonSymbols.NIL;
            this.$propagation_mt = (SubLObject)CommonSymbols.NIL;
            this.$restricted_examine_asent = (SubLObject)CommonSymbols.NIL;
            this.$trigger_bindings = (SubLObject)CommonSymbols.NIL;
            this.$trigger_supports = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$forward_triggering_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$rule;
        }
        
        public SubLObject getField3() {
            return this.$source_asent;
        }
        
        public SubLObject getField4() {
            return this.$source_truth;
        }
        
        public SubLObject getField5() {
            return this.$target_asent;
        }
        
        public SubLObject getField6() {
            return this.$target_truth;
        }
        
        public SubLObject getField7() {
            return this.$query_dnf;
        }
        
        public SubLObject getField8() {
            return this.$pragmatic_dnf;
        }
        
        public SubLObject getField9() {
            return this.$propagation_mt;
        }
        
        public SubLObject getField10() {
            return this.$restricted_examine_asent;
        }
        
        public SubLObject getField11() {
            return this.$trigger_bindings;
        }
        
        public SubLObject getField12() {
            return this.$trigger_supports;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$rule = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$source_asent = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$source_truth = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$target_asent = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$target_truth = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$query_dnf = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$pragmatic_dnf = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$propagation_mt = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$restricted_examine_asent = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$trigger_bindings = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$trigger_supports = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$forward_triggering_native.class, forward_harness.$sym34$FORWARD_TRIGGERING, forward_harness.$sym35$FORWARD_TRIGGERING_P, forward_harness.$list36, forward_harness.$list37, new String[] { "$rule", "$source_asent", "$source_truth", "$target_asent", "$target_truth", "$query_dnf", "$pragmatic_dnf", "$propagation_mt", "$restricted_examine_asent", "$trigger_bindings", "$trigger_supports" }, forward_harness.$list38, forward_harness.$list39, forward_harness.$sym40$PRINT_FORWARD_TRIGGERING);
        }
    }
    
    public static final class $forward_triggering_p$UnaryFunction extends UnaryFunction
    {
        public $forward_triggering_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-TRIGGERING-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return forward_harness.forward_triggering_p(arg1);
        }
    }
    
    public static final class $skeletal_proof_native extends SubLStructNative
    {
        public SubLObject $concluded_asent;
        public SubLObject $concluded_truth;
        public SubLObject $trigger_bindings;
        public SubLObject $inference_bindings;
        public SubLObject $concluded_supports;
        public SubLObject $pragmatic_supports;
        public SubLObject $rule;
        public SubLObject $propagation_mt;
        private static final SubLStructDeclNative structDecl;
        
        public $skeletal_proof_native() {
            this.$concluded_asent = (SubLObject)CommonSymbols.NIL;
            this.$concluded_truth = (SubLObject)CommonSymbols.NIL;
            this.$trigger_bindings = (SubLObject)CommonSymbols.NIL;
            this.$inference_bindings = (SubLObject)CommonSymbols.NIL;
            this.$concluded_supports = (SubLObject)CommonSymbols.NIL;
            this.$pragmatic_supports = (SubLObject)CommonSymbols.NIL;
            this.$rule = (SubLObject)CommonSymbols.NIL;
            this.$propagation_mt = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$skeletal_proof_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$concluded_asent;
        }
        
        public SubLObject getField3() {
            return this.$concluded_truth;
        }
        
        public SubLObject getField4() {
            return this.$trigger_bindings;
        }
        
        public SubLObject getField5() {
            return this.$inference_bindings;
        }
        
        public SubLObject getField6() {
            return this.$concluded_supports;
        }
        
        public SubLObject getField7() {
            return this.$pragmatic_supports;
        }
        
        public SubLObject getField8() {
            return this.$rule;
        }
        
        public SubLObject getField9() {
            return this.$propagation_mt;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$concluded_asent = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$concluded_truth = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$trigger_bindings = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$inference_bindings = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$concluded_supports = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$pragmatic_supports = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$rule = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$propagation_mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$skeletal_proof_native.class, forward_harness.$sym86$SKELETAL_PROOF, forward_harness.$sym87$SKELETAL_PROOF_P, forward_harness.$list88, forward_harness.$list89, new String[] { "$concluded_asent", "$concluded_truth", "$trigger_bindings", "$inference_bindings", "$concluded_supports", "$pragmatic_supports", "$rule", "$propagation_mt" }, forward_harness.$list90, forward_harness.$list91, forward_harness.$sym92$PRINT_SKELETAL_PROOF);
        }
    }
    
    public static final class $skeletal_proof_p$UnaryFunction extends UnaryFunction
    {
        public $skeletal_proof_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKELETAL-PROOF-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return forward_harness.skeletal_proof_p(arg1);
        }
    }
    
    public static final class $placeable_proof_native extends SubLStructNative
    {
        public SubLObject $concluded_asent;
        public SubLObject $concluded_mt;
        public SubLObject $concluded_truth;
        public SubLObject $assertible;
        private static final SubLStructDeclNative structDecl;
        
        public $placeable_proof_native() {
            this.$concluded_asent = (SubLObject)CommonSymbols.NIL;
            this.$concluded_mt = (SubLObject)CommonSymbols.NIL;
            this.$concluded_truth = (SubLObject)CommonSymbols.NIL;
            this.$assertible = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$placeable_proof_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$concluded_asent;
        }
        
        public SubLObject getField3() {
            return this.$concluded_mt;
        }
        
        public SubLObject getField4() {
            return this.$concluded_truth;
        }
        
        public SubLObject getField5() {
            return this.$assertible;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$concluded_asent = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$concluded_mt = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$concluded_truth = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$assertible = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$placeable_proof_native.class, forward_harness.$sym121$PLACEABLE_PROOF, forward_harness.$sym122$PLACEABLE_PROOF_P, forward_harness.$list123, forward_harness.$list124, new String[] { "$concluded_asent", "$concluded_mt", "$concluded_truth", "$assertible" }, forward_harness.$list125, forward_harness.$list126, forward_harness.$sym127$PRINT_PLACEABLE_PROOF);
        }
    }
    
    public static final class $placeable_proof_p$UnaryFunction extends UnaryFunction
    {
        public $placeable_proof_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PLACEABLE-PROOF-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return forward_harness.placeable_proof_p(arg1);
        }
    }
}

/*

	Total time: 983 ms
	
*/