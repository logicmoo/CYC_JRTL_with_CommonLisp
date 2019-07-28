package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.rkf_scenario_constructor;
import com.cyc.cycjava.cycl.rtp.iterative_template_parser;
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
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.rkf_scenario_constructor.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THIRTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rkf_scenario_constructor extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_scenario_constructor();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_scenario_constructor";

    public static final String myFingerPrint = "8a911fc93b5ce88a445713d2007bf11e0d346b38de6cf2da8272d1bb69d1af97";

    // defparameter
    private static final SubLSymbol $sc_parsing_mt$ = makeSymbol("*SC-PARSING-MT*");

    // defparameter
    private static final SubLSymbol $sc_semantic_mt$ = makeSymbol("*SC-SEMANTIC-MT*");

    // defparameter
    private static final SubLSymbol $sc_storage_mt$ = makeSymbol("*SC-STORAGE-MT*");

    // defparameter
    private static final SubLSymbol $sc_generation_mt$ = makeSymbol("*SC-GENERATION-MT*");

    // deflexical
    /**
     * Lock for controlling modifications to scenario constructor datastructures.
     */
    private static final SubLSymbol $sc_lock$ = makeSymbol("*SC-LOCK*");





    // defconstant
    public static final SubLSymbol $dtp_sc_session$ = makeSymbol("*DTP-SC-SESSION*");

    // defconstant
    public static final SubLSymbol $dtp_sc_state$ = makeSymbol("*DTP-SC-STATE*");

    // deflexical
    private static final SubLSymbol $rkf_sc_state_empty_limitations$ = makeSymbol("*RKF-SC-STATE-EMPTY-LIMITATIONS*");

    // defparameter
    private static final SubLSymbol $sc_rtp_category$ = makeSymbol("*SC-RTP-CATEGORY*");

    // defparameter
    private static final SubLSymbol $sc_rtp_syntactic_mt$ = makeSymbol("*SC-RTP-SYNTACTIC-MT*");

    private static final SubLObject $$EBertTemplateMt = reader_make_constant_shell(makeString("EBertTemplateMt"));

    private static final SubLObject $$MassMediaMt = reader_make_constant_shell(makeString("MassMediaMt"));

    private static final SubLObject $$ScenarioDescriptionMt = reader_make_constant_shell(makeString("ScenarioDescriptionMt"));

    private static final SubLObject $$EnglishParaphraseMt = reader_make_constant_shell(makeString("EnglishParaphraseMt"));

    public static final SubLString $$$Scenario_Constructor_Lock = makeString("Scenario Constructor Lock");



    public static final SubLList $list6 = list(makeSymbol("*SC-LOCK*"));

    public static final SubLSymbol $sc_isg$ = makeSymbol("*SC-ISG*");

    public static final SubLSymbol $sc_index$ = makeSymbol("*SC-INDEX*");

    public static final SubLSymbol SC_SESSION = makeSymbol("SC-SESSION");

    public static final SubLSymbol SC_SESSION_P = makeSymbol("SC-SESSION-P");

    public static final SubLList $list11 = list(makeSymbol("ID"), makeSymbol("STATE"), makeSymbol("PHRASE"), makeSymbol("CANDIDATE-SCENARIOS"), makeSymbol("PERMISSION"), makeSymbol("SCENARIO"), makeSymbol("INTERNAL-STATE"));

    public static final SubLList $list12 = list(makeKeyword("ID"), makeKeyword("STATE"), makeKeyword("PHRASE"), makeKeyword("CANDIDATE-SCENARIOS"), makeKeyword("PERMISSION"), makeKeyword("SCENARIO"), makeKeyword("INTERNAL-STATE"));

    public static final SubLList $list13 = list(makeSymbol("SC-SESSION-ID"), makeSymbol("SC-SESSION-STATE"), makeSymbol("SC-SESSION-PHRASE"), makeSymbol("SC-SESSION-CANDIDATE-SCENARIOS"), makeSymbol("SC-SESSION-PERMISSION"), makeSymbol("SC-SESSION-SCENARIO"), makeSymbol("SC-SESSION-INTERNAL-STATE"));

    public static final SubLList $list14 = list(makeSymbol("_CSETF-SC-SESSION-ID"), makeSymbol("_CSETF-SC-SESSION-STATE"), makeSymbol("_CSETF-SC-SESSION-PHRASE"), makeSymbol("_CSETF-SC-SESSION-CANDIDATE-SCENARIOS"), makeSymbol("_CSETF-SC-SESSION-PERMISSION"), makeSymbol("_CSETF-SC-SESSION-SCENARIO"), makeSymbol("_CSETF-SC-SESSION-INTERNAL-STATE"));



    public static final SubLSymbol SC_SESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SC-SESSION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list17 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SC-SESSION-P"));

    private static final SubLSymbol SC_SESSION_ID = makeSymbol("SC-SESSION-ID");

    private static final SubLSymbol _CSETF_SC_SESSION_ID = makeSymbol("_CSETF-SC-SESSION-ID");

    private static final SubLSymbol SC_SESSION_STATE = makeSymbol("SC-SESSION-STATE");

    private static final SubLSymbol _CSETF_SC_SESSION_STATE = makeSymbol("_CSETF-SC-SESSION-STATE");

    private static final SubLSymbol SC_SESSION_PHRASE = makeSymbol("SC-SESSION-PHRASE");

    private static final SubLSymbol _CSETF_SC_SESSION_PHRASE = makeSymbol("_CSETF-SC-SESSION-PHRASE");

    private static final SubLSymbol SC_SESSION_CANDIDATE_SCENARIOS = makeSymbol("SC-SESSION-CANDIDATE-SCENARIOS");

    private static final SubLSymbol _CSETF_SC_SESSION_CANDIDATE_SCENARIOS = makeSymbol("_CSETF-SC-SESSION-CANDIDATE-SCENARIOS");

    private static final SubLSymbol SC_SESSION_PERMISSION = makeSymbol("SC-SESSION-PERMISSION");

    private static final SubLSymbol _CSETF_SC_SESSION_PERMISSION = makeSymbol("_CSETF-SC-SESSION-PERMISSION");

    private static final SubLSymbol SC_SESSION_SCENARIO = makeSymbol("SC-SESSION-SCENARIO");

    private static final SubLSymbol _CSETF_SC_SESSION_SCENARIO = makeSymbol("_CSETF-SC-SESSION-SCENARIO");

    private static final SubLSymbol SC_SESSION_INTERNAL_STATE = makeSymbol("SC-SESSION-INTERNAL-STATE");

    private static final SubLSymbol _CSETF_SC_SESSION_INTERNAL_STATE = makeSymbol("_CSETF-SC-SESSION-INTERNAL-STATE");















    private static final SubLString $str39$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SC_SESSION = makeSymbol("MAKE-SC-SESSION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SC_SESSION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SC-SESSION-METHOD");

    private static final SubLSymbol SC_STATE_P = makeSymbol("SC-STATE-P");



    public static final SubLList $list47 = list(makeKeyword("EDIT"), makeKeyword("VIEW"));

    private static final SubLString $str48$Error___a_is_not_a_known_scenario = makeString("Error: ~a is not a known scenario construction permission type.");

    private static final SubLSymbol SM_SCENARIO_P = makeSymbol("SM-SCENARIO-P");





    private static final SubLSymbol SC_STATE = makeSymbol("SC-STATE");

    private static final SubLList $list53 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("INTERACTION"), makeSymbol("ACTIVE-SESSION"), makeSymbol("CONSTRUCTION-SESSIONS"), makeSymbol("BROWSING-SESSIONS"), makeSymbol("MERGE-INFO"), makeSymbol("PARSING-MT"), makeSymbol("GENERATION-MT"), makeSymbol("DOMAIN-MT"), makeSymbol("DOMAIN-INTERACTION-MT"), makeSymbol("SCENARIO-INTERACTION-MT"), makeSymbol("GEN-POINTS"), makeSymbol("STATE") });

    private static final SubLList $list54 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("INTERACTION"), makeKeyword("ACTIVE-SESSION"), makeKeyword("CONSTRUCTION-SESSIONS"), makeKeyword("BROWSING-SESSIONS"), makeKeyword("MERGE-INFO"), makeKeyword("PARSING-MT"), makeKeyword("GENERATION-MT"), makeKeyword("DOMAIN-MT"), makeKeyword("DOMAIN-INTERACTION-MT"), makeKeyword("SCENARIO-INTERACTION-MT"), makeKeyword("GEN-POINTS"), makeKeyword("STATE") });

    private static final SubLList $list55 = list(new SubLObject[]{ makeSymbol("SC-STATE-ID"), makeSymbol("SC-STATE-INTERACTION"), makeSymbol("SC-STATE-ACTIVE-SESSION"), makeSymbol("SC-STATE-CONSTRUCTION-SESSIONS"), makeSymbol("SC-STATE-BROWSING-SESSIONS"), makeSymbol("SC-STATE-MERGE-INFO"), makeSymbol("SC-STATE-PARSING-MT"), makeSymbol("SC-STATE-GENERATION-MT"), makeSymbol("SC-STATE-DOMAIN-MT"), makeSymbol("SC-STATE-DOMAIN-INTERACTION-MT"), makeSymbol("SC-STATE-SCENARIO-INTERACTION-MT"), makeSymbol("SC-STATE-GEN-POINTS"), makeSymbol("SC-STATE-STATE") });

    private static final SubLList $list56 = list(new SubLObject[]{ makeSymbol("_CSETF-SC-STATE-ID"), makeSymbol("_CSETF-SC-STATE-INTERACTION"), makeSymbol("_CSETF-SC-STATE-ACTIVE-SESSION"), makeSymbol("_CSETF-SC-STATE-CONSTRUCTION-SESSIONS"), makeSymbol("_CSETF-SC-STATE-BROWSING-SESSIONS"), makeSymbol("_CSETF-SC-STATE-MERGE-INFO"), makeSymbol("_CSETF-SC-STATE-PARSING-MT"), makeSymbol("_CSETF-SC-STATE-GENERATION-MT"), makeSymbol("_CSETF-SC-STATE-DOMAIN-MT"), makeSymbol("_CSETF-SC-STATE-DOMAIN-INTERACTION-MT"), makeSymbol("_CSETF-SC-STATE-SCENARIO-INTERACTION-MT"), makeSymbol("_CSETF-SC-STATE-GEN-POINTS"), makeSymbol("_CSETF-SC-STATE-STATE") });

    private static final SubLSymbol SC_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SC-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list58 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SC-STATE-P"));

    private static final SubLSymbol SC_STATE_ID = makeSymbol("SC-STATE-ID");

    private static final SubLSymbol _CSETF_SC_STATE_ID = makeSymbol("_CSETF-SC-STATE-ID");

    private static final SubLSymbol SC_STATE_INTERACTION = makeSymbol("SC-STATE-INTERACTION");

    private static final SubLSymbol _CSETF_SC_STATE_INTERACTION = makeSymbol("_CSETF-SC-STATE-INTERACTION");

    private static final SubLSymbol SC_STATE_ACTIVE_SESSION = makeSymbol("SC-STATE-ACTIVE-SESSION");

    private static final SubLSymbol _CSETF_SC_STATE_ACTIVE_SESSION = makeSymbol("_CSETF-SC-STATE-ACTIVE-SESSION");

    private static final SubLSymbol SC_STATE_CONSTRUCTION_SESSIONS = makeSymbol("SC-STATE-CONSTRUCTION-SESSIONS");

    private static final SubLSymbol _CSETF_SC_STATE_CONSTRUCTION_SESSIONS = makeSymbol("_CSETF-SC-STATE-CONSTRUCTION-SESSIONS");

    private static final SubLSymbol SC_STATE_BROWSING_SESSIONS = makeSymbol("SC-STATE-BROWSING-SESSIONS");

    private static final SubLSymbol _CSETF_SC_STATE_BROWSING_SESSIONS = makeSymbol("_CSETF-SC-STATE-BROWSING-SESSIONS");

    private static final SubLSymbol SC_STATE_MERGE_INFO = makeSymbol("SC-STATE-MERGE-INFO");

    private static final SubLSymbol _CSETF_SC_STATE_MERGE_INFO = makeSymbol("_CSETF-SC-STATE-MERGE-INFO");

    private static final SubLSymbol SC_STATE_PARSING_MT = makeSymbol("SC-STATE-PARSING-MT");

    private static final SubLSymbol _CSETF_SC_STATE_PARSING_MT = makeSymbol("_CSETF-SC-STATE-PARSING-MT");

    private static final SubLSymbol SC_STATE_GENERATION_MT = makeSymbol("SC-STATE-GENERATION-MT");

    private static final SubLSymbol _CSETF_SC_STATE_GENERATION_MT = makeSymbol("_CSETF-SC-STATE-GENERATION-MT");

    private static final SubLSymbol SC_STATE_DOMAIN_MT = makeSymbol("SC-STATE-DOMAIN-MT");

    private static final SubLSymbol _CSETF_SC_STATE_DOMAIN_MT = makeSymbol("_CSETF-SC-STATE-DOMAIN-MT");

    private static final SubLSymbol SC_STATE_DOMAIN_INTERACTION_MT = makeSymbol("SC-STATE-DOMAIN-INTERACTION-MT");

    private static final SubLSymbol _CSETF_SC_STATE_DOMAIN_INTERACTION_MT = makeSymbol("_CSETF-SC-STATE-DOMAIN-INTERACTION-MT");

    private static final SubLSymbol SC_STATE_SCENARIO_INTERACTION_MT = makeSymbol("SC-STATE-SCENARIO-INTERACTION-MT");

    private static final SubLSymbol _CSETF_SC_STATE_SCENARIO_INTERACTION_MT = makeSymbol("_CSETF-SC-STATE-SCENARIO-INTERACTION-MT");

    private static final SubLSymbol SC_STATE_GEN_POINTS = makeSymbol("SC-STATE-GEN-POINTS");

    private static final SubLSymbol _CSETF_SC_STATE_GEN_POINTS = makeSymbol("_CSETF-SC-STATE-GEN-POINTS");

    private static final SubLSymbol SC_STATE_STATE = makeSymbol("SC-STATE-STATE");

    private static final SubLSymbol _CSETF_SC_STATE_STATE = makeSymbol("_CSETF-SC-STATE-STATE");

















    private static final SubLSymbol $DOMAIN_INTERACTION_MT = makeKeyword("DOMAIN-INTERACTION-MT");

    private static final SubLSymbol $SCENARIO_INTERACTION_MT = makeKeyword("SCENARIO-INTERACTION-MT");



    private static final SubLSymbol MAKE_SC_STATE = makeSymbol("MAKE-SC-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SC_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SC-STATE-METHOD");



    private static final SubLSymbol SC_CONSTRUCTION_SESSION_P = makeSymbol("SC-CONSTRUCTION-SESSION-P");

    private static final SubLSymbol SC_BROWSING_SESSION_P = makeSymbol("SC-BROWSING-SESSION-P");

    private static final SubLSymbol SM_MERGE_INFO_P = makeSymbol("SM-MERGE-INFO-P");



























    private static final SubLSymbol SC_ITP_SEQUEL = makeSymbol("SC-ITP-SEQUEL");



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol SM_CONSTRAINT_RECORD_P = makeSymbol("SM-CONSTRAINT-RECORD-P");



    private static final SubLSymbol SM_GEN_POINT_WITHOUT_POSITIONS_P = makeSymbol("SM-GEN-POINT-WITHOUT-POSITIONS-P");

    public static SubLObject sc_parsing_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sc_parsing_mt$.getDynamicValue(thread);
    }

    public static SubLObject sc_semantic_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sc_semantic_mt$.getDynamicValue(thread);
    }

    public static SubLObject sc_storage_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sc_storage_mt$.getDynamicValue(thread);
    }

    public static SubLObject sc_generation_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sc_generation_mt$.getDynamicValue(thread);
    }

    public static SubLObject with_sc_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list6, append(body, NIL));
    }

    public static SubLObject sc_find_session_by_id(final SubLObject id) {
        return sc_find_object_by_id(id);
    }

    public static SubLObject sc_find_session_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject session = sc_find_session_by_id(id);
        return session;
    }

    public static SubLObject sc_find_state_by_id(final SubLObject id) {
        return sc_find_object_by_id(id);
    }

    public static SubLObject sc_find_state_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject state = sc_find_state_by_id(id);
        return state;
    }

    public static SubLObject next_sc_id() {
        return integer_sequence_generator.integer_sequence_generator_next($sc_isg$.getGlobalValue());
    }

    public static SubLObject sc_add_object(final SubLObject id, final SubLObject v_object) {
        return dictionary.dictionary_enter($sc_index$.getGlobalValue(), id, v_object);
    }

    public static SubLObject sc_rem_object(final SubLObject id) {
        return dictionary.dictionary_remove($sc_index$.getGlobalValue(), id);
    }

    public static SubLObject sc_find_object_by_id(final SubLObject id) {
        return dictionary.dictionary_lookup($sc_index$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject sc_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sc_session_p(final SubLObject v_object) {
        return v_object.getClass() == rkf_scenario_constructor.$sc_session_native.class ? T : NIL;
    }

    public static SubLObject sc_session_id(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject sc_session_state(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject sc_session_phrase(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject sc_session_candidate_scenarios(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject sc_session_permission(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject sc_session_scenario(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject sc_session_internal_state(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_sc_session_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sc_session_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sc_session_phrase(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sc_session_candidate_scenarios(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sc_session_permission(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sc_session_scenario(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sc_session_internal_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "rkf_scenario_constructor.sc_session_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_sc_session(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new rkf_scenario_constructor.$sc_session_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_sc_session_id(v_new, current_value);
            } else
                if (pcase_var.eql($STATE)) {
                    _csetf_sc_session_state(v_new, current_value);
                } else
                    if (pcase_var.eql($PHRASE)) {
                        _csetf_sc_session_phrase(v_new, current_value);
                    } else
                        if (pcase_var.eql($CANDIDATE_SCENARIOS)) {
                            _csetf_sc_session_candidate_scenarios(v_new, current_value);
                        } else
                            if (pcase_var.eql($PERMISSION)) {
                                _csetf_sc_session_permission(v_new, current_value);
                            } else
                                if (pcase_var.eql($SCENARIO)) {
                                    _csetf_sc_session_scenario(v_new, current_value);
                                } else
                                    if (pcase_var.eql($INTERNAL_STATE)) {
                                        _csetf_sc_session_internal_state(v_new, current_value);
                                    } else {
                                        Errors.error($str39$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sc_session(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SC_SESSION, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, sc_session_id(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, sc_session_state(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASE, sc_session_phrase(obj));
        funcall(visitor_fn, obj, $SLOT, $CANDIDATE_SCENARIOS, sc_session_candidate_scenarios(obj));
        funcall(visitor_fn, obj, $SLOT, $PERMISSION, sc_session_permission(obj));
        funcall(visitor_fn, obj, $SLOT, $SCENARIO, sc_session_scenario(obj));
        funcall(visitor_fn, obj, $SLOT, $INTERNAL_STATE, sc_session_internal_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_SC_SESSION, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sc_session_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sc_session(obj, visitor_fn);
    }

    public static SubLObject sc_new_session(final SubLObject state, final SubLObject permission, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        final SubLObject session = make_sc_session(UNPROVIDED);
        final SubLObject id = next_sc_id();
        if (NIL != phrase) {
            sc_set_session_phrase(session, phrase);
        }
        sc_set_session_permission(session, permission);
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_session_state(session, state);
            _csetf_sc_session_id(session, id);
            _csetf_sc_session_internal_state(session, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            sc_add_object(id, session);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static SubLObject sc_set_session_phrase(final SubLObject session, final SubLObject phrase) {
        assert NIL != sc_session_p(session) : "rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) " + session;
        assert NIL != stringp(phrase) : "Types.stringp(phrase) " + "CommonSymbols.NIL != Types.stringp(phrase) " + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_session_phrase(session, phrase);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static SubLObject sc_set_session_permission(final SubLObject session, final SubLObject permission) {
        if (NIL == subl_promotions.memberP(permission, $list47, UNPROVIDED, UNPROVIDED)) {
            Errors.error($str48$Error___a_is_not_a_known_scenario, permission);
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_session_permission(session, permission);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static SubLObject sc_add_session_candidate_scenarios(final SubLObject session, final SubLObject scenarios) {
        SubLObject cdolist_list_var = scenarios;
        SubLObject v_scenario = NIL;
        v_scenario = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sc_add_session_candidate_scenario(session, v_scenario);
            cdolist_list_var = cdolist_list_var.rest();
            v_scenario = cdolist_list_var.first();
        } 
        return session;
    }

    public static SubLObject sc_add_session_candidate_scenario(final SubLObject session, final SubLObject v_scenario) {
        assert NIL != sc_session_p(session) : "rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) " + session;
        assert NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            if (NIL == member(v_scenario, sc_session_candidate_scenarios(session), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_sc_session_candidate_scenarios(session, cons(v_scenario, sc_session_candidate_scenarios(session)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static SubLObject sc_rem_candidate_scenario(final SubLObject session, final SubLObject v_scenario) {
        assert NIL != sc_session_p(session) : "rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) " + session;
        assert NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_session_candidate_scenarios(session, remove(v_scenario, sc_session_candidate_scenarios(session), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static SubLObject sc_set_session_scenario(final SubLObject session, final SubLObject v_scenario) {
        assert NIL != sc_session_p(session) : "rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) " + session;
        assert NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_session_scenario(session, v_scenario);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static SubLObject sc_construction_session_p(final SubLObject v_object) {
        return makeBoolean((NIL != sc_session_p(v_object)) && (sc_session_permission(v_object) == $EDIT));
    }

    public static SubLObject sc_browsing_session_p(final SubLObject v_object) {
        return makeBoolean((NIL != sc_session_p(v_object)) && (sc_session_permission(v_object) == $VIEW));
    }

    public static SubLObject sc_cleanup_session(final SubLObject session) {
        assert NIL != sc_session_p(session) : "rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) " + session;
        final SubLObject id = sc_session_id(session);
        final SubLObject v_scenario = sc_session_scenario(session);
        if (NIL != v_scenario) {
            rkf_scenario_manipulator.sm_cleanup_scenario(v_scenario);
        }
        SubLObject cdolist_list_var = sc_session_candidate_scenarios(session);
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_scenario_manipulator.sm_cleanup_scenario(candidate);
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        return sc_rem_object(id);
    }

    public static SubLObject sc_session_state_lookup(final SubLObject session, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return dictionary.dictionary_lookup(sc_session_internal_state(session), key, v_default);
    }

    public static SubLObject sc_session_state_update(final SubLObject session, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(sc_session_internal_state(session), key, value);
    }

    public static SubLObject sc_session_state_clear(final SubLObject session, final SubLObject key) {
        return dictionary.dictionary_remove(sc_session_internal_state(session), key);
    }

    public static SubLObject sc_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sc_state_p(final SubLObject v_object) {
        return v_object.getClass() == rkf_scenario_constructor.$sc_state_native.class ? T : NIL;
    }

    public static SubLObject sc_state_id(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject sc_state_interaction(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject sc_state_active_session(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject sc_state_construction_sessions(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject sc_state_browsing_sessions(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject sc_state_merge_info(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject sc_state_parsing_mt(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject sc_state_generation_mt(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject sc_state_domain_mt(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject sc_state_domain_interaction_mt(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject sc_state_scenario_interaction_mt(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject sc_state_gen_points(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject sc_state_state(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.getField14();
    }

    public static SubLObject _csetf_sc_state_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sc_state_interaction(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sc_state_active_session(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sc_state_construction_sessions(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sc_state_browsing_sessions(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sc_state_merge_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sc_state_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sc_state_generation_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sc_state_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_sc_state_domain_interaction_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_sc_state_scenario_interaction_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_sc_state_gen_points(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_sc_state_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "rkf_scenario_constructor.sc_state_p(v_object) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(v_object) " + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject make_sc_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new rkf_scenario_constructor.$sc_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_sc_state_id(v_new, current_value);
            } else
                if (pcase_var.eql($INTERACTION)) {
                    _csetf_sc_state_interaction(v_new, current_value);
                } else
                    if (pcase_var.eql($ACTIVE_SESSION)) {
                        _csetf_sc_state_active_session(v_new, current_value);
                    } else
                        if (pcase_var.eql($CONSTRUCTION_SESSIONS)) {
                            _csetf_sc_state_construction_sessions(v_new, current_value);
                        } else
                            if (pcase_var.eql($BROWSING_SESSIONS)) {
                                _csetf_sc_state_browsing_sessions(v_new, current_value);
                            } else
                                if (pcase_var.eql($MERGE_INFO)) {
                                    _csetf_sc_state_merge_info(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PARSING_MT)) {
                                        _csetf_sc_state_parsing_mt(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($GENERATION_MT)) {
                                            _csetf_sc_state_generation_mt(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($DOMAIN_MT)) {
                                                _csetf_sc_state_domain_mt(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($DOMAIN_INTERACTION_MT)) {
                                                    _csetf_sc_state_domain_interaction_mt(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($SCENARIO_INTERACTION_MT)) {
                                                        _csetf_sc_state_scenario_interaction_mt(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($GEN_POINTS)) {
                                                            _csetf_sc_state_gen_points(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($STATE)) {
                                                                _csetf_sc_state_state(v_new, current_value);
                                                            } else {
                                                                Errors.error($str39$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sc_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SC_STATE, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, sc_state_id(obj));
        funcall(visitor_fn, obj, $SLOT, $INTERACTION, sc_state_interaction(obj));
        funcall(visitor_fn, obj, $SLOT, $ACTIVE_SESSION, sc_state_active_session(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRUCTION_SESSIONS, sc_state_construction_sessions(obj));
        funcall(visitor_fn, obj, $SLOT, $BROWSING_SESSIONS, sc_state_browsing_sessions(obj));
        funcall(visitor_fn, obj, $SLOT, $MERGE_INFO, sc_state_merge_info(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSING_MT, sc_state_parsing_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $GENERATION_MT, sc_state_generation_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $DOMAIN_MT, sc_state_domain_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $DOMAIN_INTERACTION_MT, sc_state_domain_interaction_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $SCENARIO_INTERACTION_MT, sc_state_scenario_interaction_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $GEN_POINTS, sc_state_gen_points(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, sc_state_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_SC_STATE, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sc_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sc_state(obj, visitor_fn);
    }

    public static SubLObject sc_new_state() {
        final SubLObject state = make_sc_state(UNPROVIDED);
        final SubLObject id = next_sc_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_state_id(state, id);
            _csetf_sc_state_state(state, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            sc_add_object(id, state);
            initialize_sc_state_mts(state);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject cleanup_sc_state(final SubLObject state) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        final SubLObject id = sc_state_id(state);
        final SubLObject success = sc_rem_object(id);
        return success;
    }

    public static SubLObject note_sc_state_interaction(final SubLObject state, final SubLObject interaction) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        assert NIL != user_interaction_agenda.user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_state_interaction(state, interaction);
            initialize_sc_state_mts(state);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sc_add_us_construction_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        assert NIL != sc_construction_session_p(session) : "rkf_scenario_constructor.sc_construction_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_construction_session_p(session) " + session;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            if (NIL == member(session, sc_state_construction_sessions(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_sc_state_construction_sessions(state, cons(session, sc_state_construction_sessions(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject retire_sc_us_construction_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        assert NIL != sc_construction_session_p(session) : "rkf_scenario_constructor.sc_construction_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_construction_session_p(session) " + session;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_state_construction_sessions(state, remove(session, sc_state_construction_sessions(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            sc_cleanup_session(session);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject deactivate_and_retire_sc_us_construction_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        assert NIL != sc_construction_session_p(session) : "rkf_scenario_constructor.sc_construction_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_construction_session_p(session) " + session;
        deactivate_active_sc_session(state);
        retire_sc_us_construction_session(state, session);
        return NIL;
    }

    public static SubLObject sc_add_us_browsing_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        assert NIL != sc_browsing_session_p(session) : "rkf_scenario_constructor.sc_browsing_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_browsing_session_p(session) " + session;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            if (NIL == member(session, sc_state_browsing_sessions(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_sc_state_browsing_sessions(state, cons(session, sc_state_browsing_sessions(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject retire_sc_us_browsing_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        assert NIL != sc_browsing_session_p(session) : "rkf_scenario_constructor.sc_browsing_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_browsing_session_p(session) " + session;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_state_browsing_sessions(state, remove(session, sc_state_browsing_sessions(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            sc_cleanup_session(session);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sc_activate_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        assert NIL != sc_session_p(session) : "rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) " + session;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_state_active_session(state, session);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject deactivate_active_sc_session(final SubLObject state) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_state_active_session(state, NIL);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sc_set_state_merge_info(final SubLObject state, final SubLObject merge_info) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        assert NIL != rkf_scenario_manipulator.sm_merge_info_p(merge_info) : "rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + merge_info;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_state_merge_info(state, merge_info);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sc_rem_state_merge_info(final SubLObject state) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        final SubLObject merge_info = sc_state_merge_info(state);
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_state_merge_info(state, NIL);
            rkf_scenario_manipulator.sm_cleanup_merge_info(merge_info);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject initialize_sc_state_mts(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        final SubLObject interaction = sc_state_interaction(state);
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                final SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                final SubLObject scenario_interaction_mt = user_interaction_agenda.uia_ensure_scenario_interaction_mt(v_agenda);
                _csetf_sc_state_parsing_mt(state, user_interaction_agenda.uia_parsing_interaction_mt(v_agenda));
                _csetf_sc_state_generation_mt(state, user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED));
                _csetf_sc_state_domain_mt(state, user_interaction_agenda.uia_domain_mt(v_agenda));
                _csetf_sc_state_domain_interaction_mt(state, user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
                _csetf_sc_state_scenario_interaction_mt(state, scenario_interaction_mt);
            } else {
                _csetf_sc_state_parsing_mt(state, $sc_parsing_mt$.getDynamicValue(thread));
                _csetf_sc_state_generation_mt(state, $sc_generation_mt$.getDynamicValue(thread));
                _csetf_sc_state_domain_mt(state, $sc_semantic_mt$.getDynamicValue(thread));
                _csetf_sc_state_domain_interaction_mt(state, $sc_storage_mt$.getDynamicValue(thread));
                _csetf_sc_state_scenario_interaction_mt(state, $$ScenarioDescriptionMt);
            }
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sc_set_state_gen_points(final SubLObject state, final SubLObject gen_points) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        assert NIL != listp(gen_points) : "Types.listp(gen_points) " + "CommonSymbols.NIL != Types.listp(gen_points) " + gen_points;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_state_gen_points(state, gen_points);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sc_clear_state_gen_points(final SubLObject state) {
        assert NIL != sc_state_p(state) : "rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) " + state;
        SubLObject release = NIL;
        try {
            release = seize_lock($sc_lock$.getGlobalValue());
            _csetf_sc_state_gen_points(state, NIL);
        } finally {
            if (NIL != release) {
                release_lock($sc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sc_state_active_scenario(final SubLObject state) {
        final SubLObject session = sc_state_active_session(state);
        return sc_session_scenario(session);
    }

    public static SubLObject sc_state_active_scenario_incomplete(final SubLObject state) {
        final SubLObject v_scenario = sc_state_active_scenario(state);
        return sublisp_null(rkf_scenario_manipulator.sm_scenario_constraints(v_scenario));
    }

    public static SubLObject sc_state_current_act(final SubLObject state) {
        final SubLObject interaction = sc_state_interaction(state);
        final SubLObject act = user_interaction_agenda.ui_state_lookup(interaction, $SC_ACT, UNPROVIDED);
        if (NIL != act) {
            return act;
        }
        if (NIL != sc_state_merge_info(state)) {
            return $MERGE;
        }
        if (NIL != sc_state_gen_points(state)) {
            return $GENERALIZE;
        }
        if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_SENTENCE, NIL)) {
            return $PARSE_CONSTRAINT;
        }
        if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_PHRASE, NIL)) {
            return $PARSE_TERM;
        }
        if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $SCENARIO_PHRASE, NIL)) {
            return $PARSE_SCENARIO;
        }
        if (NIL == sc_state_active_session(state)) {
            return $OPEN;
        }
        return $CONSTRUCT;
    }

    public static SubLObject sc_state_update(final SubLObject sc_state, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(sc_state_state(sc_state), key, value);
    }

    public static SubLObject sc_state_lookup(final SubLObject sc_state, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return dictionary.dictionary_lookup(sc_state_state(sc_state), key, v_default);
    }

    public static SubLObject sc_state_clear(final SubLObject sc_state, final SubLObject key) {
        return dictionary.dictionary_remove(sc_state_state(sc_state), key);
    }

    public static SubLObject rkf_sc_new_limitations() {
        return NIL;
    }

    public static SubLObject rkf_sc_add_limitation(final SubLObject limitations, final SubLObject key, final SubLObject value) {
        if (NIL == limitations) {
            return list(key, value);
        }
        return putf(limitations, key, value);
    }

    public static SubLObject rkf_sc_get_limitation(final SubLObject limitations, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(limitations, key, v_default);
    }

    public static SubLObject sc_state_note_limitations(final SubLObject sc_state, final SubLObject limitations) {
        return sc_state_update(sc_state, $LIMITATIONS, limitations);
    }

    public static SubLObject sc_state_get_limitations(final SubLObject sc_state) {
        return sc_state_lookup(sc_state, $LIMITATIONS, $rkf_sc_state_empty_limitations$.getGlobalValue());
    }

    public static SubLObject sc_concept_harvester(final SubLObject string, final SubLObject category, final SubLObject syntactic_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = rkf_concept_harvester.$rkf_ch_template_parses_method$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $sc_rtp_category$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $sc_rtp_syntactic_mt$.currentBinding(thread);
        try {
            rkf_concept_harvester.$rkf_ch_template_parses_method$.bind(SC_ITP_SEQUEL, thread);
            parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
            $sc_rtp_category$.bind(category, thread);
            $sc_rtp_syntactic_mt$.bind(syntactic_mt, thread);
            result = rkf_concept_harvester.rkf_concept_harvester(string);
        } finally {
            $sc_rtp_syntactic_mt$.rebind(_prev_bind_4, thread);
            $sc_rtp_category$.rebind(_prev_bind_3, thread);
            parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
            rkf_concept_harvester.$rkf_ch_template_parses_method$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sc_itp_sequel(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return iterative_template_parser.rtp_parse_exp(string, $sc_rtp_category$.getDynamicValue(thread), $sc_rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject sc_act_new_state() {
        final SubLObject state = sc_new_state();
        return state;
    }

    public static SubLObject sc_act_initialize_scenario(final SubLObject state, final SubLObject session, final SubLObject phrase) {
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_new_scenario(phrase, NIL, session);
        _csetf_sc_session_scenario(session, v_scenario);
        return session;
    }

    public static SubLObject sc_act_new_state_with_phrase(final SubLObject phrase) {
        final SubLObject state = sc_new_state();
        final SubLObject session = sc_act_initialize_construction_session(state, phrase);
        final SubLObject candidate_scenarios = NIL;
        if (NIL == candidate_scenarios) {
            final SubLObject v_scenario = rkf_scenario_manipulator.sm_new_scenario(phrase, NIL, session);
            _csetf_sc_session_scenario(session, v_scenario);
        }
        return state;
    }

    public static SubLObject sc_act_initialize_construction_session(final SubLObject state, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        final SubLObject session = sc_new_session(state, $EDIT, phrase);
        sc_add_us_construction_session(state, session);
        sc_activate_session(state, session);
        return session;
    }

    public static SubLObject sc_act_new_state_with_construction_scenario(final SubLObject v_scenario, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        final SubLObject state = sc_new_state();
        final SubLObject session = sc_new_session(state, $EDIT, phrase);
        sc_set_session_scenario(session, v_scenario);
        sc_add_us_construction_session(state, session);
        sc_activate_session(state, session);
        return state;
    }

    public static SubLObject sc_act_set_session_scenario(final SubLObject session, final SubLObject v_scenario) {
        return sc_set_session_scenario(session, v_scenario);
    }

    public static SubLObject sc_act_read_scenario(final SubLObject state, final SubLObject scenario_spec, final SubLObject phrase) {
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        return rkf_scenario_manipulator.sm_act_read_scenario(scenario_spec, phrase, domain_interaction_mt);
    }

    public static SubLObject sc_act_suggest_scenarios(final SubLObject state, final SubLObject phrase) {
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        final SubLObject scenario_expression = sc_act_determine_scenario_expression(state, phrase);
        if (NIL != scenario_expression) {
            final SubLObject v_scenario = sc_act_initialize_scenario_from_expression(state, scenario_expression, phrase);
            return list(v_scenario);
        }
        return NIL;
    }

    public static SubLObject sc_act_determine_scenario_expression(final SubLObject state, final SubLObject phrase) {
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        return sc_determine_scenario_expression_int(phrase, parsing_mt, domain_interaction_mt);
    }

    public static SubLObject sc_act_initialize_scenario_from_expression(final SubLObject state, final SubLObject scenario_expression, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        final SubLObject scenario_interaction_mt = sc_state_scenario_interaction_mt(state);
        final SubLObject scenario_parsing_mt = sc_state_parsing_mt(state);
        return rkf_scenario_manipulator.sm_act_initialize_scenario_from_expression(scenario_expression, phrase, scenario_interaction_mt, scenario_parsing_mt);
    }

    public static SubLObject sc_determine_scenario_expression_int(final SubLObject phrase, final SubLObject parsing_mt, final SubLObject domain_interaction_mt) {
        final SubLObject candidates = rkf_scenario_manipulator.sm_extract_candidate_scenario_expressions(phrase, parsing_mt, domain_interaction_mt);
        final SubLObject scenario_expression = candidates.first();
        return scenario_expression;
    }

    public static SubLObject sc_act_suggest_new_indexical_type(final SubLObject session, final SubLObject indexical_phrase) {
        final SubLObject state = sc_session_state(session);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        return rkf_scenario_manipulator.sm_act_suggest_new_indexical_type(indexical_phrase, parsing_mt, domain_interaction_mt);
    }

    public static SubLObject sc_act_add_new_indexical_multiple(final SubLObject session, final SubLObject indexical_phrase, final SubLObject many_isas, final SubLObject many_genls) {
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        final SubLObject v_scenario = sc_session_scenario(session);
        SubLObject indexical_isas = NIL;
        SubLObject indexical_genls = NIL;
        SubLObject cdolist_list_var = many_isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_formula_p(v_isa)) {
                v_isa = narts_high.find_nart(v_isa);
            }
            indexical_isas = cons(v_isa, indexical_isas);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        cdolist_list_var = many_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_formula_p(genl)) {
                genl = narts_high.find_nart(genl);
            }
            indexical_genls = cons(genl, indexical_genls);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        rkf_scenario_manipulator.sm_act_add_new_indexical(v_scenario, indexical_phrase, indexical_isas, indexical_genls);
        return session;
    }

    public static SubLObject sc_act_add_new_indexical(final SubLObject session, final SubLObject indexical_phrase, SubLObject indexical_isa, SubLObject indexical_genls) {
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        final SubLObject v_scenario = sc_session_scenario(session);
        if (NIL != el_formula_p(indexical_isa)) {
            indexical_isa = narts_high.find_nart(indexical_isa);
        }
        if (NIL != el_formula_p(indexical_genls)) {
            indexical_genls = narts_high.find_nart(indexical_genls);
        }
        rkf_scenario_manipulator.sm_act_add_new_indexical(v_scenario, indexical_phrase, indexical_isa, indexical_genls);
        return session;
    }

    public static SubLObject sc_act_find_indexical(final SubLObject session, final SubLObject indexical_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        return rkf_scenario_manipulator.sm_act_find_indexical(v_scenario, indexical_phrase, UNPROVIDED);
    }

    public static SubLObject sc_act_remove_indexical(final SubLObject session, final SubLObject indexical_record) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_remove_indexical(v_scenario, indexical_record, mt);
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        return session;
    }

    public static SubLObject sc_act_suggest_differences(final SubLObject session, final SubLObject indexical) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject mt = sc_state_domain_interaction_mt(state);
        SubLObject results = NIL;
        results = rkf_scenario_manipulator.sm_act_suggest_differences(v_scenario, indexical, mt);
        return results;
    }

    public static SubLObject sc_act_distinguish_indexicals(final SubLObject session, final SubLObject indexical_a, final SubLObject indexical_b) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_distinguish_indexicals(v_scenario, indexical_a, indexical_b, mt);
        return session;
    }

    public static SubLObject sc_act_add_indexical_phrase(final SubLObject session, final SubLObject indexical_record, final SubLObject indexical_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_add_indexical_phrase(v_scenario, indexical_record, indexical_phrase);
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        return session;
    }

    public static SubLObject sc_act_remove_indexical_phrase(final SubLObject session, final SubLObject indexical_record, final SubLObject indexical_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_remove_indexical_phrase(v_scenario, indexical_record, indexical_phrase);
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        return session;
    }

    public static SubLObject sc_act_remove_isaXgenls_constraint(final SubLObject session, final SubLObject indexical_record, final SubLObject collection, final SubLObject domain_interaction_mt, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $$isa;
        }
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_remove_isaXgenls_constraint(v_scenario, indexical_record, collection, domain_interaction_mt, type);
        return session;
    }

    public static SubLObject sc_act_suggest_new_constraint(final SubLObject session, final SubLObject nl_sentence) {
        final SubLObject state = sc_session_state(session);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject indexical_records = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        return rkf_scenario_manipulator.sm_act_suggest_constraint_cycl_from_text(nl_sentence, indexical_records, parsing_mt, domain_interaction_mt);
    }

    public static SubLObject sc_act_add_new_constraint(final SubLObject session, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        thread.resetMultipleValues();
        final SubLObject temp = rkf_scenario_manipulator.sm_act_add_scenario_constraint(v_scenario, sentence, domain_interaction_mt);
        final SubLObject status = thread.secondMultipleValue();
        final SubLObject irec = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        final SubLObject index_col = thread.fifthMultipleValue();
        final SubLObject rel_col = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return values(status, irec, predicate, index_col, rel_col);
    }

    public static SubLObject sc_act_remove_constraint(final SubLObject session, final SubLObject constraint_record) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_remove_constraint(v_scenario, constraint_record, domain_interaction_mt);
        return session;
    }

    public static SubLObject sc_act_remove_all_constraints(final SubLObject session) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_remove_all_constraints(v_scenario, domain_interaction_mt);
        return session;
    }

    public static SubLObject sc_act_import_constraint(final SubLObject session, final SubLObject constraint) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_import_constraint(v_scenario, constraint, domain_interaction_mt);
        return session;
    }

    public static SubLObject sc_act_modify_phrase(final SubLObject session, final SubLObject new_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_modify_phrase(v_scenario, new_phrase);
        sc_set_session_phrase(session, new_phrase);
        return session;
    }

    public static SubLObject sc_act_construct_indexical_table(final SubLObject session) {
        SubLObject indexical_table = sc_session_state_lookup(session, $INDEXICAL_TABLE, UNPROVIDED);
        if (NIL == indexical_table) {
            final SubLObject v_scenario = sc_session_scenario(session);
            indexical_table = rkf_scenario_manipulator.sm_act_construct_indexical_table(v_scenario);
            sc_session_state_update(session, $INDEXICAL_TABLE, indexical_table);
        }
        return indexical_table;
    }

    public static SubLObject sc_act_constraint_record_nl_sentence(final SubLObject state, final SubLObject v_scenario, final SubLObject constraint_record) {
        assert NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) : "rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + constraint_record;
        final SubLObject generation_mt = sc_state_generation_mt(state);
        final SubLObject domain_mt = sc_state_domain_interaction_mt(state);
        final SubLObject indexical_records = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        return rkf_scenario_manipulator.sm_act_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
    }

    public static SubLObject sc_act_propose_sentence_adjustment(final SubLObject state, final SubLObject cycl_sentence) {
        assert NIL != el_formula_p(cycl_sentence) : "el_utilities.el_formula_p(cycl_sentence) " + "CommonSymbols.NIL != el_utilities.el_formula_p(cycl_sentence) " + cycl_sentence;
        final SubLObject session = sc_state_active_session(state);
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject domain_mt = sc_state_domain_interaction_mt(state);
        return rkf_scenario_manipulator.sm_act_propose_sentence_adjustments(v_scenario, cycl_sentence, domain_mt);
    }

    public static SubLObject sc_act_merge_register_from_scenario(final SubLObject state, final SubLObject from_scenario) {
        SubLObject merge_info = sc_state_merge_info(state);
        if (NIL == merge_info) {
            merge_info = rkf_scenario_manipulator.sm_new_merge_info();
            sc_set_state_merge_info(state, merge_info);
        }
        rkf_scenario_manipulator.sm_set_merge_info_from_scenario(merge_info, from_scenario);
        return merge_info;
    }

    public static SubLObject sc_act_merge_register_to_scenario(final SubLObject state, final SubLObject to_scenario) {
        SubLObject merge_info = sc_state_merge_info(state);
        if (NIL == merge_info) {
            merge_info = rkf_scenario_manipulator.sm_new_merge_info();
            sc_set_state_merge_info(state, merge_info);
        }
        rkf_scenario_manipulator.sm_set_merge_info_to_scenario(merge_info, to_scenario);
        return merge_info;
    }

    public static SubLObject sc_act_merge_register_align_to(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject merge_info = sc_state_merge_info(state);
        rkf_scenario_manipulator.sm_set_merge_info_align_to(merge_info, indexical_record);
        return merge_info;
    }

    public static SubLObject sc_act_merge_register_align_from(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject merge_info = sc_state_merge_info(state);
        rkf_scenario_manipulator.sm_set_merge_info_align_from(merge_info, indexical_record);
        return merge_info;
    }

    public static SubLObject sc_act_merge_update_indexical_equivalences(final SubLObject state) {
        final SubLObject merge_info = sc_state_merge_info(state);
        rkf_scenario_manipulator.update_sm_merge_info_indexical_equivalences(merge_info);
        return merge_info;
    }

    public static SubLObject sc_act_abandon_merge(final SubLObject state) {
        sc_rem_state_merge_info(state);
        return state;
    }

    public static SubLObject sc_act_merge_scenarios(final SubLObject state) {
        final SubLObject merge_info = sc_state_merge_info(state);
        final SubLObject from_scenario = rkf_scenario_manipulator.sm_merge_info_from_scenario(merge_info);
        final SubLObject to_scenario = rkf_scenario_manipulator.sm_merge_info_to_scenario(merge_info);
        final SubLObject indexical_equivalences = rkf_scenario_manipulator.sm_merge_info_indexical_equivalences(merge_info);
        rkf_scenario_manipulator.sm_act_merge_scenarios(to_scenario, from_scenario, indexical_equivalences);
        sc_rem_state_merge_info(state);
        return state;
    }

    public static SubLObject sc_state_merge_from_scenario(final SubLObject state) {
        final SubLObject merge_info = sc_state_merge_info(state);
        return rkf_scenario_manipulator.sm_merge_info_from_scenario(merge_info);
    }

    public static SubLObject sc_indexical_record_alignedP(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject merge_info = sc_state_merge_info(state);
        if (NIL != merge_info) {
            final SubLObject indexical_equivalences = rkf_scenario_manipulator.sm_merge_info_indexical_equivalences(merge_info);
            return cycl_utilities.expression_find(indexical_record, indexical_equivalences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject sc_act_generalize_scenario(final SubLObject state, final SubLObject v_scenario) {
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        final SubLObject generation_mt = sc_state_generation_mt(state);
        SubLObject gen_points = rkf_scenario_manipulator.sm_act_compute_scenario_generalization_points(v_scenario, domain_interaction_mt);
        sc_set_state_gen_points(state, gen_points);
        gen_points = remove_if(symbol_function(SM_GEN_POINT_WITHOUT_POSITIONS_P), gen_points, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject result = rkf_scenario_manipulator.sm_act_generalize_scenario_with_gen_points(v_scenario, gen_points, domain_interaction_mt, generation_mt);
        sc_clear_state_gen_points(state);
        return result;
    }

    public static SubLObject sc_act_save_scenario(final SubLObject state, final SubLObject v_scenario, final SubLObject template) {
        final SubLObject storage_mt = sc_state_scenario_interaction_mt(state);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        return rkf_scenario_manipulator.sm_act_save_scenario(v_scenario, template, storage_mt, parsing_mt);
    }

    public static SubLObject sc_act_enumerate_saved_scenarios(final SubLObject state) {
        final SubLObject storage_mt = sc_state_scenario_interaction_mt(state);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        return rkf_scenario_manipulator.sm_act_enumerate_saved_scenarios(storage_mt, parsing_mt);
    }

    public static SubLObject sc_act_discard_template(final SubLObject state, final SubLObject v_scenario, final SubLObject template) {
        return rkf_scenario_manipulator.sm_act_discard_template(v_scenario, template);
    }

    public static SubLObject sc_act_compute_unused_indexicals(final SubLObject v_scenario) {
        return rkf_scenario_manipulator.sm_act_compute_unused_indexicals(v_scenario);
    }

    public static SubLObject sc_act_discard_session(final SubLObject session) {
        final SubLObject state = sc_session_state(session);
        deactivate_and_retire_sc_us_construction_session(state, session);
        return NIL;
    }

    public static SubLObject sc_act_activate_session(final SubLObject state, final SubLObject session) {
        return sc_activate_session(state, session);
    }

    public static SubLObject sc_act_set_indexical_record_var(final SubLObject indexical_record, final SubLObject var) {
        return rkf_scenario_manipulator.sm_act_set_indexical_record_var(indexical_record, var);
    }

    public static SubLObject declare_rkf_scenario_constructor_file() {
        declareFunction(me, "sc_parsing_mt", "SC-PARSING-MT", 0, 0, false);
        declareFunction(me, "sc_semantic_mt", "SC-SEMANTIC-MT", 0, 0, false);
        declareFunction(me, "sc_storage_mt", "SC-STORAGE-MT", 0, 0, false);
        declareFunction(me, "sc_generation_mt", "SC-GENERATION-MT", 0, 0, false);
        declareMacro(me, "with_sc_lock", "WITH-SC-LOCK");
        declareFunction(me, "sc_find_session_by_id", "SC-FIND-SESSION-BY-ID", 1, 0, false);
        declareFunction(me, "sc_find_session_by_id_string", "SC-FIND-SESSION-BY-ID-STRING", 1, 0, false);
        declareFunction(me, "sc_find_state_by_id", "SC-FIND-STATE-BY-ID", 1, 0, false);
        declareFunction(me, "sc_find_state_by_id_string", "SC-FIND-STATE-BY-ID-STRING", 1, 0, false);
        declareFunction(me, "next_sc_id", "NEXT-SC-ID", 0, 0, false);
        declareFunction(me, "sc_add_object", "SC-ADD-OBJECT", 2, 0, false);
        declareFunction(me, "sc_rem_object", "SC-REM-OBJECT", 1, 0, false);
        declareFunction(me, "sc_find_object_by_id", "SC-FIND-OBJECT-BY-ID", 1, 0, false);
        declareFunction(me, "sc_session_print_function_trampoline", "SC-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sc_session_p", "SC-SESSION-P", 1, 0, false);
        new rkf_scenario_constructor.$sc_session_p$UnaryFunction();
        declareFunction(me, "sc_session_id", "SC-SESSION-ID", 1, 0, false);
        declareFunction(me, "sc_session_state", "SC-SESSION-STATE", 1, 0, false);
        declareFunction(me, "sc_session_phrase", "SC-SESSION-PHRASE", 1, 0, false);
        declareFunction(me, "sc_session_candidate_scenarios", "SC-SESSION-CANDIDATE-SCENARIOS", 1, 0, false);
        declareFunction(me, "sc_session_permission", "SC-SESSION-PERMISSION", 1, 0, false);
        declareFunction(me, "sc_session_scenario", "SC-SESSION-SCENARIO", 1, 0, false);
        declareFunction(me, "sc_session_internal_state", "SC-SESSION-INTERNAL-STATE", 1, 0, false);
        declareFunction(me, "_csetf_sc_session_id", "_CSETF-SC-SESSION-ID", 2, 0, false);
        declareFunction(me, "_csetf_sc_session_state", "_CSETF-SC-SESSION-STATE", 2, 0, false);
        declareFunction(me, "_csetf_sc_session_phrase", "_CSETF-SC-SESSION-PHRASE", 2, 0, false);
        declareFunction(me, "_csetf_sc_session_candidate_scenarios", "_CSETF-SC-SESSION-CANDIDATE-SCENARIOS", 2, 0, false);
        declareFunction(me, "_csetf_sc_session_permission", "_CSETF-SC-SESSION-PERMISSION", 2, 0, false);
        declareFunction(me, "_csetf_sc_session_scenario", "_CSETF-SC-SESSION-SCENARIO", 2, 0, false);
        declareFunction(me, "_csetf_sc_session_internal_state", "_CSETF-SC-SESSION-INTERNAL-STATE", 2, 0, false);
        declareFunction(me, "make_sc_session", "MAKE-SC-SESSION", 0, 1, false);
        declareFunction(me, "visit_defstruct_sc_session", "VISIT-DEFSTRUCT-SC-SESSION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sc_session_method", "VISIT-DEFSTRUCT-OBJECT-SC-SESSION-METHOD", 2, 0, false);
        declareFunction(me, "sc_new_session", "SC-NEW-SESSION", 2, 1, false);
        declareFunction(me, "sc_set_session_phrase", "SC-SET-SESSION-PHRASE", 2, 0, false);
        declareFunction(me, "sc_set_session_permission", "SC-SET-SESSION-PERMISSION", 2, 0, false);
        declareFunction(me, "sc_add_session_candidate_scenarios", "SC-ADD-SESSION-CANDIDATE-SCENARIOS", 2, 0, false);
        declareFunction(me, "sc_add_session_candidate_scenario", "SC-ADD-SESSION-CANDIDATE-SCENARIO", 2, 0, false);
        declareFunction(me, "sc_rem_candidate_scenario", "SC-REM-CANDIDATE-SCENARIO", 2, 0, false);
        declareFunction(me, "sc_set_session_scenario", "SC-SET-SESSION-SCENARIO", 2, 0, false);
        declareFunction(me, "sc_construction_session_p", "SC-CONSTRUCTION-SESSION-P", 1, 0, false);
        declareFunction(me, "sc_browsing_session_p", "SC-BROWSING-SESSION-P", 1, 0, false);
        declareFunction(me, "sc_cleanup_session", "SC-CLEANUP-SESSION", 1, 0, false);
        declareFunction(me, "sc_session_state_lookup", "SC-SESSION-STATE-LOOKUP", 2, 1, false);
        declareFunction(me, "sc_session_state_update", "SC-SESSION-STATE-UPDATE", 3, 0, false);
        declareFunction(me, "sc_session_state_clear", "SC-SESSION-STATE-CLEAR", 2, 0, false);
        declareFunction(me, "sc_state_print_function_trampoline", "SC-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sc_state_p", "SC-STATE-P", 1, 0, false);
        new rkf_scenario_constructor.$sc_state_p$UnaryFunction();
        declareFunction(me, "sc_state_id", "SC-STATE-ID", 1, 0, false);
        declareFunction(me, "sc_state_interaction", "SC-STATE-INTERACTION", 1, 0, false);
        declareFunction(me, "sc_state_active_session", "SC-STATE-ACTIVE-SESSION", 1, 0, false);
        declareFunction(me, "sc_state_construction_sessions", "SC-STATE-CONSTRUCTION-SESSIONS", 1, 0, false);
        declareFunction(me, "sc_state_browsing_sessions", "SC-STATE-BROWSING-SESSIONS", 1, 0, false);
        declareFunction(me, "sc_state_merge_info", "SC-STATE-MERGE-INFO", 1, 0, false);
        declareFunction(me, "sc_state_parsing_mt", "SC-STATE-PARSING-MT", 1, 0, false);
        declareFunction(me, "sc_state_generation_mt", "SC-STATE-GENERATION-MT", 1, 0, false);
        declareFunction(me, "sc_state_domain_mt", "SC-STATE-DOMAIN-MT", 1, 0, false);
        declareFunction(me, "sc_state_domain_interaction_mt", "SC-STATE-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction(me, "sc_state_scenario_interaction_mt", "SC-STATE-SCENARIO-INTERACTION-MT", 1, 0, false);
        declareFunction(me, "sc_state_gen_points", "SC-STATE-GEN-POINTS", 1, 0, false);
        declareFunction(me, "sc_state_state", "SC-STATE-STATE", 1, 0, false);
        declareFunction(me, "_csetf_sc_state_id", "_CSETF-SC-STATE-ID", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_interaction", "_CSETF-SC-STATE-INTERACTION", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_active_session", "_CSETF-SC-STATE-ACTIVE-SESSION", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_construction_sessions", "_CSETF-SC-STATE-CONSTRUCTION-SESSIONS", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_browsing_sessions", "_CSETF-SC-STATE-BROWSING-SESSIONS", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_merge_info", "_CSETF-SC-STATE-MERGE-INFO", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_parsing_mt", "_CSETF-SC-STATE-PARSING-MT", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_generation_mt", "_CSETF-SC-STATE-GENERATION-MT", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_domain_mt", "_CSETF-SC-STATE-DOMAIN-MT", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_domain_interaction_mt", "_CSETF-SC-STATE-DOMAIN-INTERACTION-MT", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_scenario_interaction_mt", "_CSETF-SC-STATE-SCENARIO-INTERACTION-MT", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_gen_points", "_CSETF-SC-STATE-GEN-POINTS", 2, 0, false);
        declareFunction(me, "_csetf_sc_state_state", "_CSETF-SC-STATE-STATE", 2, 0, false);
        declareFunction(me, "make_sc_state", "MAKE-SC-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_sc_state", "VISIT-DEFSTRUCT-SC-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sc_state_method", "VISIT-DEFSTRUCT-OBJECT-SC-STATE-METHOD", 2, 0, false);
        declareFunction(me, "sc_new_state", "SC-NEW-STATE", 0, 0, false);
        declareFunction(me, "cleanup_sc_state", "CLEANUP-SC-STATE", 1, 0, false);
        declareFunction(me, "note_sc_state_interaction", "NOTE-SC-STATE-INTERACTION", 2, 0, false);
        declareFunction(me, "sc_add_us_construction_session", "SC-ADD-US-CONSTRUCTION-SESSION", 2, 0, false);
        declareFunction(me, "retire_sc_us_construction_session", "RETIRE-SC-US-CONSTRUCTION-SESSION", 2, 0, false);
        declareFunction(me, "deactivate_and_retire_sc_us_construction_session", "DEACTIVATE-AND-RETIRE-SC-US-CONSTRUCTION-SESSION", 2, 0, false);
        declareFunction(me, "sc_add_us_browsing_session", "SC-ADD-US-BROWSING-SESSION", 2, 0, false);
        declareFunction(me, "retire_sc_us_browsing_session", "RETIRE-SC-US-BROWSING-SESSION", 2, 0, false);
        declareFunction(me, "sc_activate_session", "SC-ACTIVATE-SESSION", 2, 0, false);
        declareFunction(me, "deactivate_active_sc_session", "DEACTIVATE-ACTIVE-SC-SESSION", 1, 0, false);
        declareFunction(me, "sc_set_state_merge_info", "SC-SET-STATE-MERGE-INFO", 2, 0, false);
        declareFunction(me, "sc_rem_state_merge_info", "SC-REM-STATE-MERGE-INFO", 1, 0, false);
        declareFunction(me, "initialize_sc_state_mts", "INITIALIZE-SC-STATE-MTS", 1, 0, false);
        declareFunction(me, "sc_set_state_gen_points", "SC-SET-STATE-GEN-POINTS", 2, 0, false);
        declareFunction(me, "sc_clear_state_gen_points", "SC-CLEAR-STATE-GEN-POINTS", 1, 0, false);
        declareFunction(me, "sc_state_active_scenario", "SC-STATE-ACTIVE-SCENARIO", 1, 0, false);
        declareFunction(me, "sc_state_active_scenario_incomplete", "SC-STATE-ACTIVE-SCENARIO-INCOMPLETE", 1, 0, false);
        declareFunction(me, "sc_state_current_act", "SC-STATE-CURRENT-ACT", 1, 0, false);
        declareFunction(me, "sc_state_update", "SC-STATE-UPDATE", 3, 0, false);
        declareFunction(me, "sc_state_lookup", "SC-STATE-LOOKUP", 2, 1, false);
        declareFunction(me, "sc_state_clear", "SC-STATE-CLEAR", 2, 0, false);
        declareFunction(me, "rkf_sc_new_limitations", "RKF-SC-NEW-LIMITATIONS", 0, 0, false);
        declareFunction(me, "rkf_sc_add_limitation", "RKF-SC-ADD-LIMITATION", 3, 0, false);
        declareFunction(me, "rkf_sc_get_limitation", "RKF-SC-GET-LIMITATION", 2, 1, false);
        declareFunction(me, "sc_state_note_limitations", "SC-STATE-NOTE-LIMITATIONS", 2, 0, false);
        declareFunction(me, "sc_state_get_limitations", "SC-STATE-GET-LIMITATIONS", 1, 0, false);
        declareFunction(me, "sc_concept_harvester", "SC-CONCEPT-HARVESTER", 3, 0, false);
        declareFunction(me, "sc_itp_sequel", "SC-ITP-SEQUEL", 1, 0, false);
        declareFunction(me, "sc_act_new_state", "SC-ACT-NEW-STATE", 0, 0, false);
        declareFunction(me, "sc_act_initialize_scenario", "SC-ACT-INITIALIZE-SCENARIO", 3, 0, false);
        declareFunction(me, "sc_act_new_state_with_phrase", "SC-ACT-NEW-STATE-WITH-PHRASE", 1, 0, false);
        declareFunction(me, "sc_act_initialize_construction_session", "SC-ACT-INITIALIZE-CONSTRUCTION-SESSION", 1, 1, false);
        declareFunction(me, "sc_act_new_state_with_construction_scenario", "SC-ACT-NEW-STATE-WITH-CONSTRUCTION-SCENARIO", 1, 1, false);
        declareFunction(me, "sc_act_set_session_scenario", "SC-ACT-SET-SESSION-SCENARIO", 2, 0, false);
        declareFunction(me, "sc_act_read_scenario", "SC-ACT-READ-SCENARIO", 3, 0, false);
        declareFunction(me, "sc_act_suggest_scenarios", "SC-ACT-SUGGEST-SCENARIOS", 2, 0, false);
        declareFunction(me, "sc_act_determine_scenario_expression", "SC-ACT-DETERMINE-SCENARIO-EXPRESSION", 2, 0, false);
        declareFunction(me, "sc_act_initialize_scenario_from_expression", "SC-ACT-INITIALIZE-SCENARIO-FROM-EXPRESSION", 2, 1, false);
        declareFunction(me, "sc_determine_scenario_expression_int", "SC-DETERMINE-SCENARIO-EXPRESSION-INT", 3, 0, false);
        declareFunction(me, "sc_act_suggest_new_indexical_type", "SC-ACT-SUGGEST-NEW-INDEXICAL-TYPE", 2, 0, false);
        declareFunction(me, "sc_act_add_new_indexical_multiple", "SC-ACT-ADD-NEW-INDEXICAL-MULTIPLE", 4, 0, false);
        declareFunction(me, "sc_act_add_new_indexical", "SC-ACT-ADD-NEW-INDEXICAL", 4, 0, false);
        declareFunction(me, "sc_act_find_indexical", "SC-ACT-FIND-INDEXICAL", 2, 0, false);
        declareFunction(me, "sc_act_remove_indexical", "SC-ACT-REMOVE-INDEXICAL", 2, 0, false);
        declareFunction(me, "sc_act_suggest_differences", "SC-ACT-SUGGEST-DIFFERENCES", 2, 0, false);
        declareFunction(me, "sc_act_distinguish_indexicals", "SC-ACT-DISTINGUISH-INDEXICALS", 3, 0, false);
        declareFunction(me, "sc_act_add_indexical_phrase", "SC-ACT-ADD-INDEXICAL-PHRASE", 3, 0, false);
        declareFunction(me, "sc_act_remove_indexical_phrase", "SC-ACT-REMOVE-INDEXICAL-PHRASE", 3, 0, false);
        declareFunction(me, "sc_act_remove_isaXgenls_constraint", "SC-ACT-REMOVE-ISA/GENLS-CONSTRAINT", 4, 1, false);
        declareFunction(me, "sc_act_suggest_new_constraint", "SC-ACT-SUGGEST-NEW-CONSTRAINT", 2, 0, false);
        declareFunction(me, "sc_act_add_new_constraint", "SC-ACT-ADD-NEW-CONSTRAINT", 2, 0, false);
        declareFunction(me, "sc_act_remove_constraint", "SC-ACT-REMOVE-CONSTRAINT", 2, 0, false);
        declareFunction(me, "sc_act_remove_all_constraints", "SC-ACT-REMOVE-ALL-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "sc_act_import_constraint", "SC-ACT-IMPORT-CONSTRAINT", 2, 0, false);
        declareFunction(me, "sc_act_modify_phrase", "SC-ACT-MODIFY-PHRASE", 2, 0, false);
        declareFunction(me, "sc_act_construct_indexical_table", "SC-ACT-CONSTRUCT-INDEXICAL-TABLE", 1, 0, false);
        declareFunction(me, "sc_act_constraint_record_nl_sentence", "SC-ACT-CONSTRAINT-RECORD-NL-SENTENCE", 3, 0, false);
        declareFunction(me, "sc_act_propose_sentence_adjustment", "SC-ACT-PROPOSE-SENTENCE-ADJUSTMENT", 2, 0, false);
        declareFunction(me, "sc_act_merge_register_from_scenario", "SC-ACT-MERGE-REGISTER-FROM-SCENARIO", 2, 0, false);
        declareFunction(me, "sc_act_merge_register_to_scenario", "SC-ACT-MERGE-REGISTER-TO-SCENARIO", 2, 0, false);
        declareFunction(me, "sc_act_merge_register_align_to", "SC-ACT-MERGE-REGISTER-ALIGN-TO", 2, 0, false);
        declareFunction(me, "sc_act_merge_register_align_from", "SC-ACT-MERGE-REGISTER-ALIGN-FROM", 2, 0, false);
        declareFunction(me, "sc_act_merge_update_indexical_equivalences", "SC-ACT-MERGE-UPDATE-INDEXICAL-EQUIVALENCES", 1, 0, false);
        declareFunction(me, "sc_act_abandon_merge", "SC-ACT-ABANDON-MERGE", 1, 0, false);
        declareFunction(me, "sc_act_merge_scenarios", "SC-ACT-MERGE-SCENARIOS", 1, 0, false);
        declareFunction(me, "sc_state_merge_from_scenario", "SC-STATE-MERGE-FROM-SCENARIO", 1, 0, false);
        declareFunction(me, "sc_indexical_record_alignedP", "SC-INDEXICAL-RECORD-ALIGNED?", 2, 0, false);
        declareFunction(me, "sc_act_generalize_scenario", "SC-ACT-GENERALIZE-SCENARIO", 2, 0, false);
        declareFunction(me, "sc_act_save_scenario", "SC-ACT-SAVE-SCENARIO", 3, 0, false);
        declareFunction(me, "sc_act_enumerate_saved_scenarios", "SC-ACT-ENUMERATE-SAVED-SCENARIOS", 1, 0, false);
        declareFunction(me, "sc_act_discard_template", "SC-ACT-DISCARD-TEMPLATE", 3, 0, false);
        declareFunction(me, "sc_act_compute_unused_indexicals", "SC-ACT-COMPUTE-UNUSED-INDEXICALS", 1, 0, false);
        declareFunction(me, "sc_act_discard_session", "SC-ACT-DISCARD-SESSION", 1, 0, false);
        declareFunction(me, "sc_act_activate_session", "SC-ACT-ACTIVATE-SESSION", 2, 0, false);
        declareFunction(me, "sc_act_set_indexical_record_var", "SC-ACT-SET-INDEXICAL-RECORD-VAR", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_scenario_constructor_file() {
        defparameter("*SC-PARSING-MT*", $$EBertTemplateMt);
        defparameter("*SC-SEMANTIC-MT*", $$MassMediaMt);
        defparameter("*SC-STORAGE-MT*", $$ScenarioDescriptionMt);
        defparameter("*SC-GENERATION-MT*", $$EnglishParaphraseMt);
        deflexical("*SC-LOCK*", make_lock($$$Scenario_Constructor_Lock));
        deflexical("*SC-ISG*", SubLTrampolineFile.maybeDefault($sc_isg$, $sc_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        deflexical("*SC-INDEX*", SubLTrampolineFile.maybeDefault($sc_index$, $sc_index$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-SC-SESSION*", SC_SESSION);
        defconstant("*DTP-SC-STATE*", SC_STATE);
        deflexical("*RKF-SC-STATE-EMPTY-LIMITATIONS*", rkf_sc_new_limitations());
        defparameter("*SC-RTP-CATEGORY*", NIL);
        defparameter("*SC-RTP-SYNTACTIC-MT*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_scenario_constructor_file() {
        declare_defglobal($sc_isg$);
        declare_defglobal($sc_index$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sc_session$.getGlobalValue(), symbol_function(SC_SESSION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list17);
        def_csetf(SC_SESSION_ID, _CSETF_SC_SESSION_ID);
        def_csetf(SC_SESSION_STATE, _CSETF_SC_SESSION_STATE);
        def_csetf(SC_SESSION_PHRASE, _CSETF_SC_SESSION_PHRASE);
        def_csetf(SC_SESSION_CANDIDATE_SCENARIOS, _CSETF_SC_SESSION_CANDIDATE_SCENARIOS);
        def_csetf(SC_SESSION_PERMISSION, _CSETF_SC_SESSION_PERMISSION);
        def_csetf(SC_SESSION_SCENARIO, _CSETF_SC_SESSION_SCENARIO);
        def_csetf(SC_SESSION_INTERNAL_STATE, _CSETF_SC_SESSION_INTERNAL_STATE);
        identity(SC_SESSION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sc_session$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SC_SESSION_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sc_state$.getGlobalValue(), symbol_function(SC_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list58);
        def_csetf(SC_STATE_ID, _CSETF_SC_STATE_ID);
        def_csetf(SC_STATE_INTERACTION, _CSETF_SC_STATE_INTERACTION);
        def_csetf(SC_STATE_ACTIVE_SESSION, _CSETF_SC_STATE_ACTIVE_SESSION);
        def_csetf(SC_STATE_CONSTRUCTION_SESSIONS, _CSETF_SC_STATE_CONSTRUCTION_SESSIONS);
        def_csetf(SC_STATE_BROWSING_SESSIONS, _CSETF_SC_STATE_BROWSING_SESSIONS);
        def_csetf(SC_STATE_MERGE_INFO, _CSETF_SC_STATE_MERGE_INFO);
        def_csetf(SC_STATE_PARSING_MT, _CSETF_SC_STATE_PARSING_MT);
        def_csetf(SC_STATE_GENERATION_MT, _CSETF_SC_STATE_GENERATION_MT);
        def_csetf(SC_STATE_DOMAIN_MT, _CSETF_SC_STATE_DOMAIN_MT);
        def_csetf(SC_STATE_DOMAIN_INTERACTION_MT, _CSETF_SC_STATE_DOMAIN_INTERACTION_MT);
        def_csetf(SC_STATE_SCENARIO_INTERACTION_MT, _CSETF_SC_STATE_SCENARIO_INTERACTION_MT);
        def_csetf(SC_STATE_GEN_POINTS, _CSETF_SC_STATE_GEN_POINTS);
        def_csetf(SC_STATE_STATE, _CSETF_SC_STATE_STATE);
        identity(SC_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sc_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SC_STATE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_scenario_constructor_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_scenario_constructor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_scenario_constructor_file();
    }

    static {






































































































































    }

    public static final class $sc_session_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $state;

        public SubLObject $phrase;

        public SubLObject $candidate_scenarios;

        public SubLObject $permission;

        public SubLObject $scenario;

        public SubLObject $internal_state;

        private static final SubLStructDeclNative structDecl;

        public $sc_session_native() {
            this.$id = Lisp.NIL;
            this.$state = Lisp.NIL;
            this.$phrase = Lisp.NIL;
            this.$candidate_scenarios = Lisp.NIL;
            this.$permission = Lisp.NIL;
            this.$scenario = Lisp.NIL;
            this.$internal_state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$state;
        }

        @Override
        public SubLObject getField4() {
            return this.$phrase;
        }

        @Override
        public SubLObject getField5() {
            return this.$candidate_scenarios;
        }

        @Override
        public SubLObject getField6() {
            return this.$permission;
        }

        @Override
        public SubLObject getField7() {
            return this.$scenario;
        }

        @Override
        public SubLObject getField8() {
            return this.$internal_state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$state = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$phrase = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$candidate_scenarios = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$permission = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$scenario = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$internal_state = value;
        }

        static {
            structDecl = makeStructDeclNative(rkf_scenario_constructor.$sc_session_native.class, SC_SESSION, SC_SESSION_P, $list11, $list12, new String[]{ "$id", "$state", "$phrase", "$candidate_scenarios", "$permission", "$scenario", "$internal_state" }, $list13, $list14, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sc_session_p$UnaryFunction extends UnaryFunction {
        public $sc_session_p$UnaryFunction() {
            super(extractFunctionNamed("SC-SESSION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sc_session_p(arg1);
        }
    }

    public static final class $sc_state_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $interaction;

        public SubLObject $active_session;

        public SubLObject $construction_sessions;

        public SubLObject $browsing_sessions;

        public SubLObject $merge_info;

        public SubLObject $parsing_mt;

        public SubLObject $generation_mt;

        public SubLObject $domain_mt;

        public SubLObject $domain_interaction_mt;

        public SubLObject $scenario_interaction_mt;

        public SubLObject $gen_points;

        public SubLObject $state;

        private static final SubLStructDeclNative structDecl;

        public $sc_state_native() {
            this.$id = Lisp.NIL;
            this.$interaction = Lisp.NIL;
            this.$active_session = Lisp.NIL;
            this.$construction_sessions = Lisp.NIL;
            this.$browsing_sessions = Lisp.NIL;
            this.$merge_info = Lisp.NIL;
            this.$parsing_mt = Lisp.NIL;
            this.$generation_mt = Lisp.NIL;
            this.$domain_mt = Lisp.NIL;
            this.$domain_interaction_mt = Lisp.NIL;
            this.$scenario_interaction_mt = Lisp.NIL;
            this.$gen_points = Lisp.NIL;
            this.$state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$interaction;
        }

        @Override
        public SubLObject getField4() {
            return this.$active_session;
        }

        @Override
        public SubLObject getField5() {
            return this.$construction_sessions;
        }

        @Override
        public SubLObject getField6() {
            return this.$browsing_sessions;
        }

        @Override
        public SubLObject getField7() {
            return this.$merge_info;
        }

        @Override
        public SubLObject getField8() {
            return this.$parsing_mt;
        }

        @Override
        public SubLObject getField9() {
            return this.$generation_mt;
        }

        @Override
        public SubLObject getField10() {
            return this.$domain_mt;
        }

        @Override
        public SubLObject getField11() {
            return this.$domain_interaction_mt;
        }

        @Override
        public SubLObject getField12() {
            return this.$scenario_interaction_mt;
        }

        @Override
        public SubLObject getField13() {
            return this.$gen_points;
        }

        @Override
        public SubLObject getField14() {
            return this.$state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$interaction = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$active_session = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$construction_sessions = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$browsing_sessions = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$merge_info = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$parsing_mt = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$generation_mt = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$domain_mt = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$domain_interaction_mt = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$scenario_interaction_mt = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$gen_points = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$state = value;
        }

        static {
            structDecl = makeStructDeclNative(rkf_scenario_constructor.$sc_state_native.class, SC_STATE, SC_STATE_P, $list53, $list54, new String[]{ "$id", "$interaction", "$active_session", "$construction_sessions", "$browsing_sessions", "$merge_info", "$parsing_mt", "$generation_mt", "$domain_mt", "$domain_interaction_mt", "$scenario_interaction_mt", "$gen_points", "$state" }, $list55, $list56, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sc_state_p$UnaryFunction extends UnaryFunction {
        public $sc_state_p$UnaryFunction() {
            super(extractFunctionNamed("SC-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sc_state_p(arg1);
        }
    }
}

/**
 * Total time: 398 ms
 */
