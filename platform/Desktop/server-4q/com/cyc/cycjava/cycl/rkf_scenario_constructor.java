package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.rtp.iterative_template_parser;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_scenario_constructor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_scenario_constructor";
    public static final String myFingerPrint = "8a911fc93b5ce88a445713d2007bf11e0d346b38de6cf2da8272d1bb69d1af97";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 3316L)
    private static SubLSymbol $sc_parsing_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 3533L)
    private static SubLSymbol $sc_semantic_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 3587L)
    private static SubLSymbol $sc_storage_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 3650L)
    private static SubLSymbol $sc_generation_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 3964L)
    private static SubLSymbol $sc_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 4824L)
    private static SubLSymbol $sc_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 4949L)
    private static SubLSymbol $sc_index$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLSymbol $dtp_sc_session$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLSymbol $dtp_sc_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 16137L)
    private static SubLSymbol $rkf_sc_state_empty_limitations$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 16485L)
    private static SubLSymbol $sc_rtp_category$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 16600L)
    private static SubLSymbol $sc_rtp_syntactic_mt$;
    private static final SubLObject $const0$EBertTemplateMt;
    private static final SubLObject $const1$MassMediaMt;
    private static final SubLObject $const2$ScenarioDescriptionMt;
    private static final SubLObject $const3$EnglishParaphraseMt;
    private static final SubLString $str4$Scenario_Constructor_Lock;
    private static final SubLSymbol $sym5$WITH_LOCK_HELD;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$_SC_ISG_;
    private static final SubLSymbol $sym8$_SC_INDEX_;
    private static final SubLSymbol $sym9$SC_SESSION;
    private static final SubLSymbol $sym10$SC_SESSION_P;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym16$SC_SESSION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$SC_SESSION_ID;
    private static final SubLSymbol $sym19$_CSETF_SC_SESSION_ID;
    private static final SubLSymbol $sym20$SC_SESSION_STATE;
    private static final SubLSymbol $sym21$_CSETF_SC_SESSION_STATE;
    private static final SubLSymbol $sym22$SC_SESSION_PHRASE;
    private static final SubLSymbol $sym23$_CSETF_SC_SESSION_PHRASE;
    private static final SubLSymbol $sym24$SC_SESSION_CANDIDATE_SCENARIOS;
    private static final SubLSymbol $sym25$_CSETF_SC_SESSION_CANDIDATE_SCENARIOS;
    private static final SubLSymbol $sym26$SC_SESSION_PERMISSION;
    private static final SubLSymbol $sym27$_CSETF_SC_SESSION_PERMISSION;
    private static final SubLSymbol $sym28$SC_SESSION_SCENARIO;
    private static final SubLSymbol $sym29$_CSETF_SC_SESSION_SCENARIO;
    private static final SubLSymbol $sym30$SC_SESSION_INTERNAL_STATE;
    private static final SubLSymbol $sym31$_CSETF_SC_SESSION_INTERNAL_STATE;
    private static final SubLSymbol $kw32$ID;
    private static final SubLSymbol $kw33$STATE;
    private static final SubLSymbol $kw34$PHRASE;
    private static final SubLSymbol $kw35$CANDIDATE_SCENARIOS;
    private static final SubLSymbol $kw36$PERMISSION;
    private static final SubLSymbol $kw37$SCENARIO;
    private static final SubLSymbol $kw38$INTERNAL_STATE;
    private static final SubLString $str39$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw40$BEGIN;
    private static final SubLSymbol $sym41$MAKE_SC_SESSION;
    private static final SubLSymbol $kw42$SLOT;
    private static final SubLSymbol $kw43$END;
    private static final SubLSymbol $sym44$VISIT_DEFSTRUCT_OBJECT_SC_SESSION_METHOD;
    private static final SubLSymbol $sym45$SC_STATE_P;
    private static final SubLSymbol $sym46$STRINGP;
    private static final SubLList $list47;
    private static final SubLString $str48$Error___a_is_not_a_known_scenario;
    private static final SubLSymbol $sym49$SM_SCENARIO_P;
    private static final SubLSymbol $kw50$EDIT;
    private static final SubLSymbol $kw51$VIEW;
    private static final SubLSymbol $sym52$SC_STATE;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$SC_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$SC_STATE_ID;
    private static final SubLSymbol $sym60$_CSETF_SC_STATE_ID;
    private static final SubLSymbol $sym61$SC_STATE_INTERACTION;
    private static final SubLSymbol $sym62$_CSETF_SC_STATE_INTERACTION;
    private static final SubLSymbol $sym63$SC_STATE_ACTIVE_SESSION;
    private static final SubLSymbol $sym64$_CSETF_SC_STATE_ACTIVE_SESSION;
    private static final SubLSymbol $sym65$SC_STATE_CONSTRUCTION_SESSIONS;
    private static final SubLSymbol $sym66$_CSETF_SC_STATE_CONSTRUCTION_SESSIONS;
    private static final SubLSymbol $sym67$SC_STATE_BROWSING_SESSIONS;
    private static final SubLSymbol $sym68$_CSETF_SC_STATE_BROWSING_SESSIONS;
    private static final SubLSymbol $sym69$SC_STATE_MERGE_INFO;
    private static final SubLSymbol $sym70$_CSETF_SC_STATE_MERGE_INFO;
    private static final SubLSymbol $sym71$SC_STATE_PARSING_MT;
    private static final SubLSymbol $sym72$_CSETF_SC_STATE_PARSING_MT;
    private static final SubLSymbol $sym73$SC_STATE_GENERATION_MT;
    private static final SubLSymbol $sym74$_CSETF_SC_STATE_GENERATION_MT;
    private static final SubLSymbol $sym75$SC_STATE_DOMAIN_MT;
    private static final SubLSymbol $sym76$_CSETF_SC_STATE_DOMAIN_MT;
    private static final SubLSymbol $sym77$SC_STATE_DOMAIN_INTERACTION_MT;
    private static final SubLSymbol $sym78$_CSETF_SC_STATE_DOMAIN_INTERACTION_MT;
    private static final SubLSymbol $sym79$SC_STATE_SCENARIO_INTERACTION_MT;
    private static final SubLSymbol $sym80$_CSETF_SC_STATE_SCENARIO_INTERACTION_MT;
    private static final SubLSymbol $sym81$SC_STATE_GEN_POINTS;
    private static final SubLSymbol $sym82$_CSETF_SC_STATE_GEN_POINTS;
    private static final SubLSymbol $sym83$SC_STATE_STATE;
    private static final SubLSymbol $sym84$_CSETF_SC_STATE_STATE;
    private static final SubLSymbol $kw85$INTERACTION;
    private static final SubLSymbol $kw86$ACTIVE_SESSION;
    private static final SubLSymbol $kw87$CONSTRUCTION_SESSIONS;
    private static final SubLSymbol $kw88$BROWSING_SESSIONS;
    private static final SubLSymbol $kw89$MERGE_INFO;
    private static final SubLSymbol $kw90$PARSING_MT;
    private static final SubLSymbol $kw91$GENERATION_MT;
    private static final SubLSymbol $kw92$DOMAIN_MT;
    private static final SubLSymbol $kw93$DOMAIN_INTERACTION_MT;
    private static final SubLSymbol $kw94$SCENARIO_INTERACTION_MT;
    private static final SubLSymbol $kw95$GEN_POINTS;
    private static final SubLSymbol $sym96$MAKE_SC_STATE;
    private static final SubLSymbol $sym97$VISIT_DEFSTRUCT_OBJECT_SC_STATE_METHOD;
    private static final SubLSymbol $sym98$USER_INTERACTION_P;
    private static final SubLSymbol $sym99$SC_CONSTRUCTION_SESSION_P;
    private static final SubLSymbol $sym100$SC_BROWSING_SESSION_P;
    private static final SubLSymbol $sym101$SM_MERGE_INFO_P;
    private static final SubLSymbol $sym102$LISTP;
    private static final SubLSymbol $kw103$SC_ACT;
    private static final SubLSymbol $kw104$MERGE;
    private static final SubLSymbol $kw105$GENERALIZE;
    private static final SubLSymbol $kw106$CONSTRAINT_SENTENCE;
    private static final SubLSymbol $kw107$PARSE_CONSTRAINT;
    private static final SubLSymbol $kw108$INDEXICAL_PHRASE;
    private static final SubLSymbol $kw109$PARSE_TERM;
    private static final SubLSymbol $kw110$SCENARIO_PHRASE;
    private static final SubLSymbol $kw111$PARSE_SCENARIO;
    private static final SubLSymbol $kw112$OPEN;
    private static final SubLSymbol $kw113$CONSTRUCT;
    private static final SubLSymbol $kw114$LIMITATIONS;
    private static final SubLSymbol $sym115$SC_ITP_SEQUEL;
    private static final SubLSymbol $kw116$INDEXICAL_TABLE;
    private static final SubLObject $const117$isa;
    private static final SubLSymbol $sym118$SM_CONSTRAINT_RECORD_P;
    private static final SubLSymbol $sym119$EL_FORMULA_P;
    private static final SubLSymbol $sym120$SM_GEN_POINT_WITHOUT_POSITIONS_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 3715L)
    public static SubLObject sc_parsing_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_scenario_constructor.$sc_parsing_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 3776L)
    public static SubLObject sc_semantic_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_scenario_constructor.$sc_semantic_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 3838L)
    public static SubLObject sc_storage_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_scenario_constructor.$sc_storage_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 3898L)
    public static SubLObject sc_generation_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_scenario_constructor.$sc_generation_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 4183L)
    public static SubLObject with_sc_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_scenario_constructor.$sym5$WITH_LOCK_HELD, (SubLObject)rkf_scenario_constructor.$list6, ConsesLow.append(body, (SubLObject)rkf_scenario_constructor.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 4277L)
    public static SubLObject sc_find_session_by_id(final SubLObject id) {
        return sc_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 4442L)
    public static SubLObject sc_find_session_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED);
        final SubLObject session = sc_find_session_by_id(id);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 4599L)
    public static SubLObject sc_find_state_by_id(final SubLObject id) {
        return sc_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 4675L)
    public static SubLObject sc_find_state_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED);
        final SubLObject state = sc_find_state_by_id(id);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5046L)
    public static SubLObject next_sc_id() {
        return integer_sequence_generator.integer_sequence_generator_next(rkf_scenario_constructor.$sc_isg$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5153L)
    public static SubLObject sc_add_object(final SubLObject id, final SubLObject v_object) {
        return dictionary.dictionary_enter(rkf_scenario_constructor.$sc_index$.getGlobalValue(), id, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5296L)
    public static SubLObject sc_rem_object(final SubLObject id) {
        return dictionary.dictionary_remove(rkf_scenario_constructor.$sc_index$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5426L)
    public static SubLObject sc_find_object_by_id(final SubLObject id) {
        return dictionary.dictionary_lookup(rkf_scenario_constructor.$sc_index$.getGlobalValue(), id, (SubLObject)rkf_scenario_constructor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject sc_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_scenario_constructor.ZERO_INTEGER);
        return (SubLObject)rkf_scenario_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject sc_session_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sc_session_native.class) ? rkf_scenario_constructor.T : rkf_scenario_constructor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject sc_session_id(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject sc_session_state(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject sc_session_phrase(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject sc_session_candidate_scenarios(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject sc_session_permission(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject sc_session_scenario(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject sc_session_internal_state(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject _csetf_sc_session_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject _csetf_sc_session_state(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject _csetf_sc_session_phrase(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject _csetf_sc_session_candidate_scenarios(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject _csetf_sc_session_permission(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject _csetf_sc_session_scenario(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject _csetf_sc_session_internal_state(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_session_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject make_sc_session(SubLObject arglist) {
        if (arglist == rkf_scenario_constructor.UNPROVIDED) {
            arglist = (SubLObject)rkf_scenario_constructor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sc_session_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_scenario_constructor.NIL, next = arglist; rkf_scenario_constructor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw32$ID)) {
                _csetf_sc_session_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw33$STATE)) {
                _csetf_sc_session_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw34$PHRASE)) {
                _csetf_sc_session_phrase(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw35$CANDIDATE_SCENARIOS)) {
                _csetf_sc_session_candidate_scenarios(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw36$PERMISSION)) {
                _csetf_sc_session_permission(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw37$SCENARIO)) {
                _csetf_sc_session_scenario(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw38$INTERNAL_STATE)) {
                _csetf_sc_session_internal_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_scenario_constructor.$str39$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject visit_defstruct_sc_session(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw40$BEGIN, (SubLObject)rkf_scenario_constructor.$sym41$MAKE_SC_SESSION, (SubLObject)rkf_scenario_constructor.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw32$ID, sc_session_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw33$STATE, sc_session_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw34$PHRASE, sc_session_phrase(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw35$CANDIDATE_SCENARIOS, sc_session_candidate_scenarios(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw36$PERMISSION, sc_session_permission(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw37$SCENARIO, sc_session_scenario(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw38$INTERNAL_STATE, sc_session_internal_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw43$END, (SubLObject)rkf_scenario_constructor.$sym41$MAKE_SC_SESSION, (SubLObject)rkf_scenario_constructor.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5512L)
    public static SubLObject visit_defstruct_object_sc_session_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sc_session(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 5944L)
    public static SubLObject sc_new_session(final SubLObject state, final SubLObject permission, SubLObject phrase) {
        if (phrase == rkf_scenario_constructor.UNPROVIDED) {
            phrase = (SubLObject)rkf_scenario_constructor.NIL;
        }
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        final SubLObject session = make_sc_session((SubLObject)rkf_scenario_constructor.UNPROVIDED);
        final SubLObject id = next_sc_id();
        if (rkf_scenario_constructor.NIL != phrase) {
            sc_set_session_phrase(session, phrase);
        }
        sc_set_session_permission(session, permission);
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_session_state(session, state);
            _csetf_sc_session_id(session, id);
            _csetf_sc_session_internal_state(session, dictionary.new_dictionary((SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED));
            sc_add_object(id, session);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 6444L)
    public static SubLObject sc_set_session_phrase(final SubLObject session, final SubLObject phrase) {
        assert rkf_scenario_constructor.NIL != sc_session_p(session) : session;
        assert rkf_scenario_constructor.NIL != Types.stringp(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_session_phrase(session, phrase);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 6647L)
    public static SubLObject sc_set_session_permission(final SubLObject session, final SubLObject permission) {
        if (rkf_scenario_constructor.NIL == subl_promotions.memberP(permission, (SubLObject)rkf_scenario_constructor.$list47, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED)) {
            Errors.error((SubLObject)rkf_scenario_constructor.$str48$Error___a_is_not_a_known_scenario, permission);
        }
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_session_permission(session, permission);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 7037L)
    public static SubLObject sc_add_session_candidate_scenarios(final SubLObject session, final SubLObject scenarios) {
        SubLObject cdolist_list_var = scenarios;
        SubLObject v_scenario = (SubLObject)rkf_scenario_constructor.NIL;
        v_scenario = cdolist_list_var.first();
        while (rkf_scenario_constructor.NIL != cdolist_list_var) {
            sc_add_session_candidate_scenario(session, v_scenario);
            cdolist_list_var = cdolist_list_var.rest();
            v_scenario = cdolist_list_var.first();
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 7223L)
    public static SubLObject sc_add_session_candidate_scenario(final SubLObject session, final SubLObject v_scenario) {
        assert rkf_scenario_constructor.NIL != sc_session_p(session) : session;
        assert rkf_scenario_constructor.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : v_scenario;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            if (rkf_scenario_constructor.NIL == conses_high.member(v_scenario, sc_session_candidate_scenarios(session), Symbols.symbol_function((SubLObject)rkf_scenario_constructor.EQL), Symbols.symbol_function((SubLObject)rkf_scenario_constructor.IDENTITY))) {
                _csetf_sc_session_candidate_scenarios(session, (SubLObject)ConsesLow.cons(v_scenario, sc_session_candidate_scenarios(session)));
            }
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 7466L)
    public static SubLObject sc_rem_candidate_scenario(final SubLObject session, final SubLObject v_scenario) {
        assert rkf_scenario_constructor.NIL != sc_session_p(session) : session;
        assert rkf_scenario_constructor.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : v_scenario;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_session_candidate_scenarios(session, Sequences.remove(v_scenario, sc_session_candidate_scenarios(session), (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED));
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 7752L)
    public static SubLObject sc_set_session_scenario(final SubLObject session, final SubLObject v_scenario) {
        assert rkf_scenario_constructor.NIL != sc_session_p(session) : session;
        assert rkf_scenario_constructor.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : v_scenario;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_session_scenario(session, v_scenario);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 8046L)
    public static SubLObject sc_construction_session_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_scenario_constructor.NIL != sc_session_p(v_object) && sc_session_permission(v_object) == rkf_scenario_constructor.$kw50$EDIT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 8183L)
    public static SubLObject sc_browsing_session_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_scenario_constructor.NIL != sc_session_p(v_object) && sc_session_permission(v_object) == rkf_scenario_constructor.$kw51$VIEW);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 8316L)
    public static SubLObject sc_cleanup_session(final SubLObject session) {
        assert rkf_scenario_constructor.NIL != sc_session_p(session) : session;
        final SubLObject id = sc_session_id(session);
        final SubLObject v_scenario = sc_session_scenario(session);
        if (rkf_scenario_constructor.NIL != v_scenario) {
            rkf_scenario_manipulator.sm_cleanup_scenario(v_scenario);
        }
        SubLObject cdolist_list_var = sc_session_candidate_scenarios(session);
        SubLObject candidate = (SubLObject)rkf_scenario_constructor.NIL;
        candidate = cdolist_list_var.first();
        while (rkf_scenario_constructor.NIL != cdolist_list_var) {
            rkf_scenario_manipulator.sm_cleanup_scenario(candidate);
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        return sc_rem_object(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 8724L)
    public static SubLObject sc_session_state_lookup(final SubLObject session, final SubLObject key, SubLObject v_default) {
        if (v_default == rkf_scenario_constructor.UNPROVIDED) {
            v_default = (SubLObject)rkf_scenario_constructor.NIL;
        }
        return dictionary.dictionary_lookup(sc_session_internal_state(session), key, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 8877L)
    public static SubLObject sc_session_state_update(final SubLObject session, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(sc_session_internal_state(session), key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9016L)
    public static SubLObject sc_session_state_clear(final SubLObject session, final SubLObject key) {
        return dictionary.dictionary_remove(sc_session_internal_state(session), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_scenario_constructor.ZERO_INTEGER);
        return (SubLObject)rkf_scenario_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sc_state_native.class) ? rkf_scenario_constructor.T : rkf_scenario_constructor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_id(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_interaction(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_active_session(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_construction_sessions(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_browsing_sessions(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_merge_info(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_parsing_mt(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_generation_mt(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_domain_mt(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_domain_interaction_mt(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_scenario_interaction_mt(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_gen_points(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject sc_state_state(final SubLObject v_object) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_interaction(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_active_session(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_construction_sessions(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_browsing_sessions(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_merge_info(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_generation_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_domain_interaction_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_scenario_interaction_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_gen_points(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject _csetf_sc_state_state(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_constructor.NIL != sc_state_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject make_sc_state(SubLObject arglist) {
        if (arglist == rkf_scenario_constructor.UNPROVIDED) {
            arglist = (SubLObject)rkf_scenario_constructor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sc_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_scenario_constructor.NIL, next = arglist; rkf_scenario_constructor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw32$ID)) {
                _csetf_sc_state_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw85$INTERACTION)) {
                _csetf_sc_state_interaction(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw86$ACTIVE_SESSION)) {
                _csetf_sc_state_active_session(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw87$CONSTRUCTION_SESSIONS)) {
                _csetf_sc_state_construction_sessions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw88$BROWSING_SESSIONS)) {
                _csetf_sc_state_browsing_sessions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw89$MERGE_INFO)) {
                _csetf_sc_state_merge_info(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw90$PARSING_MT)) {
                _csetf_sc_state_parsing_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw91$GENERATION_MT)) {
                _csetf_sc_state_generation_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw92$DOMAIN_MT)) {
                _csetf_sc_state_domain_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw93$DOMAIN_INTERACTION_MT)) {
                _csetf_sc_state_domain_interaction_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw94$SCENARIO_INTERACTION_MT)) {
                _csetf_sc_state_scenario_interaction_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw95$GEN_POINTS)) {
                _csetf_sc_state_gen_points(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_constructor.$kw33$STATE)) {
                _csetf_sc_state_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_scenario_constructor.$str39$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject visit_defstruct_sc_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw40$BEGIN, (SubLObject)rkf_scenario_constructor.$sym96$MAKE_SC_STATE, (SubLObject)rkf_scenario_constructor.THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw32$ID, sc_state_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw85$INTERACTION, sc_state_interaction(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw86$ACTIVE_SESSION, sc_state_active_session(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw87$CONSTRUCTION_SESSIONS, sc_state_construction_sessions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw88$BROWSING_SESSIONS, sc_state_browsing_sessions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw89$MERGE_INFO, sc_state_merge_info(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw90$PARSING_MT, sc_state_parsing_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw91$GENERATION_MT, sc_state_generation_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw92$DOMAIN_MT, sc_state_domain_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw93$DOMAIN_INTERACTION_MT, sc_state_domain_interaction_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw94$SCENARIO_INTERACTION_MT, sc_state_scenario_interaction_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw95$GEN_POINTS, sc_state_gen_points(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw42$SLOT, (SubLObject)rkf_scenario_constructor.$kw33$STATE, sc_state_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_constructor.$kw43$END, (SubLObject)rkf_scenario_constructor.$sym96$MAKE_SC_STATE, (SubLObject)rkf_scenario_constructor.THIRTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9142L)
    public static SubLObject visit_defstruct_object_sc_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sc_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9701L)
    public static SubLObject sc_new_state() {
        final SubLObject state = make_sc_state((SubLObject)rkf_scenario_constructor.UNPROVIDED);
        final SubLObject id = next_sc_id();
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_state_id(state, id);
            _csetf_sc_state_state(state, dictionary.new_dictionary((SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED));
            sc_add_object(id, state);
            initialize_sc_state_mts(state);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 9986L)
    public static SubLObject cleanup_sc_state(final SubLObject state) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        final SubLObject id = sc_state_id(state);
        final SubLObject success = sc_rem_object(id);
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 10190L)
    public static SubLObject note_sc_state_interaction(final SubLObject state, final SubLObject interaction) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        assert rkf_scenario_constructor.NIL != user_interaction_agenda.user_interaction_p(interaction) : interaction;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_state_interaction(state, interaction);
            initialize_sc_state_mts(state);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 10452L)
    public static SubLObject sc_add_us_construction_session(final SubLObject state, final SubLObject session) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        assert rkf_scenario_constructor.NIL != sc_construction_session_p(session) : session;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            if (rkf_scenario_constructor.NIL == conses_high.member(session, sc_state_construction_sessions(state), Symbols.symbol_function((SubLObject)rkf_scenario_constructor.EQL), Symbols.symbol_function((SubLObject)rkf_scenario_constructor.IDENTITY))) {
                _csetf_sc_state_construction_sessions(state, (SubLObject)ConsesLow.cons(session, sc_state_construction_sessions(state)));
            }
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 10691L)
    public static SubLObject retire_sc_us_construction_session(final SubLObject state, final SubLObject session) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        assert rkf_scenario_constructor.NIL != sc_construction_session_p(session) : session;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_state_construction_sessions(state, Sequences.remove(session, sc_state_construction_sessions(state), (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED));
            sc_cleanup_session(session);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 11015L)
    public static SubLObject deactivate_and_retire_sc_us_construction_session(final SubLObject state, final SubLObject session) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        assert rkf_scenario_constructor.NIL != sc_construction_session_p(session) : session;
        deactivate_active_sc_session(state);
        retire_sc_us_construction_session(state, session);
        return (SubLObject)rkf_scenario_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 11282L)
    public static SubLObject sc_add_us_browsing_session(final SubLObject state, final SubLObject session) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        assert rkf_scenario_constructor.NIL != sc_browsing_session_p(session) : session;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            if (rkf_scenario_constructor.NIL == conses_high.member(session, sc_state_browsing_sessions(state), Symbols.symbol_function((SubLObject)rkf_scenario_constructor.EQL), Symbols.symbol_function((SubLObject)rkf_scenario_constructor.IDENTITY))) {
                _csetf_sc_state_browsing_sessions(state, (SubLObject)ConsesLow.cons(session, sc_state_browsing_sessions(state)));
            }
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 11514L)
    public static SubLObject retire_sc_us_browsing_session(final SubLObject state, final SubLObject session) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        assert rkf_scenario_constructor.NIL != sc_browsing_session_p(session) : session;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_state_browsing_sessions(state, Sequences.remove(session, sc_state_browsing_sessions(state), (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED));
            sc_cleanup_session(session);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 11822L)
    public static SubLObject sc_activate_session(final SubLObject state, final SubLObject session) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        assert rkf_scenario_constructor.NIL != sc_session_p(session) : session;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_state_active_session(state, session);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 12027L)
    public static SubLObject deactivate_active_sc_session(final SubLObject state) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_state_active_session(state, (SubLObject)rkf_scenario_constructor.NIL);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 12193L)
    public static SubLObject sc_set_state_merge_info(final SubLObject state, final SubLObject merge_info) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        assert rkf_scenario_constructor.NIL != rkf_scenario_manipulator.sm_merge_info_p(merge_info) : merge_info;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_state_merge_info(state, merge_info);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 12410L)
    public static SubLObject sc_rem_state_merge_info(final SubLObject state) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        final SubLObject merge_info = sc_state_merge_info(state);
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_state_merge_info(state, (SubLObject)rkf_scenario_constructor.NIL);
            rkf_scenario_manipulator.sm_cleanup_merge_info(merge_info);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 12664L)
    public static SubLObject initialize_sc_state_mts(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        final SubLObject interaction = sc_state_interaction(state);
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            if (rkf_scenario_constructor.NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                final SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                final SubLObject scenario_interaction_mt = user_interaction_agenda.uia_ensure_scenario_interaction_mt(v_agenda);
                _csetf_sc_state_parsing_mt(state, user_interaction_agenda.uia_parsing_interaction_mt(v_agenda));
                _csetf_sc_state_generation_mt(state, user_interaction_agenda.uia_generation_interaction_mt(v_agenda, (SubLObject)rkf_scenario_constructor.UNPROVIDED));
                _csetf_sc_state_domain_mt(state, user_interaction_agenda.uia_domain_mt(v_agenda));
                _csetf_sc_state_domain_interaction_mt(state, user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
                _csetf_sc_state_scenario_interaction_mt(state, scenario_interaction_mt);
            }
            else {
                _csetf_sc_state_parsing_mt(state, rkf_scenario_constructor.$sc_parsing_mt$.getDynamicValue(thread));
                _csetf_sc_state_generation_mt(state, rkf_scenario_constructor.$sc_generation_mt$.getDynamicValue(thread));
                _csetf_sc_state_domain_mt(state, rkf_scenario_constructor.$sc_semantic_mt$.getDynamicValue(thread));
                _csetf_sc_state_domain_interaction_mt(state, rkf_scenario_constructor.$sc_storage_mt$.getDynamicValue(thread));
                _csetf_sc_state_scenario_interaction_mt(state, rkf_scenario_constructor.$const2$ScenarioDescriptionMt);
            }
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 13758L)
    public static SubLObject sc_set_state_gen_points(final SubLObject state, final SubLObject gen_points) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        assert rkf_scenario_constructor.NIL != Types.listp(gen_points) : gen_points;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_state_gen_points(state, gen_points);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 13965L)
    public static SubLObject sc_clear_state_gen_points(final SubLObject state) {
        assert rkf_scenario_constructor.NIL != sc_state_p(state) : state;
        SubLObject release = (SubLObject)rkf_scenario_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            _csetf_sc_state_gen_points(state, (SubLObject)rkf_scenario_constructor.NIL);
        }
        finally {
            if (rkf_scenario_constructor.NIL != release) {
                Locks.release_lock(rkf_scenario_constructor.$sc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 14124L)
    public static SubLObject sc_state_active_scenario(final SubLObject state) {
        final SubLObject session = sc_state_active_session(state);
        return sc_session_scenario(session);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 14280L)
    public static SubLObject sc_state_active_scenario_incomplete(final SubLObject state) {
        final SubLObject v_scenario = sc_state_active_scenario(state);
        return Types.sublisp_null(rkf_scenario_manipulator.sm_scenario_constraints(v_scenario));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 14587L)
    public static SubLObject sc_state_current_act(final SubLObject state) {
        final SubLObject interaction = sc_state_interaction(state);
        final SubLObject act = user_interaction_agenda.ui_state_lookup(interaction, (SubLObject)rkf_scenario_constructor.$kw103$SC_ACT, (SubLObject)rkf_scenario_constructor.UNPROVIDED);
        if (rkf_scenario_constructor.NIL != act) {
            return act;
        }
        if (rkf_scenario_constructor.NIL != sc_state_merge_info(state)) {
            return (SubLObject)rkf_scenario_constructor.$kw104$MERGE;
        }
        if (rkf_scenario_constructor.NIL != sc_state_gen_points(state)) {
            return (SubLObject)rkf_scenario_constructor.$kw105$GENERALIZE;
        }
        if (rkf_scenario_constructor.NIL != user_interaction_agenda.ui_state_lookup(interaction, (SubLObject)rkf_scenario_constructor.$kw106$CONSTRAINT_SENTENCE, (SubLObject)rkf_scenario_constructor.NIL)) {
            return (SubLObject)rkf_scenario_constructor.$kw107$PARSE_CONSTRAINT;
        }
        if (rkf_scenario_constructor.NIL != user_interaction_agenda.ui_state_lookup(interaction, (SubLObject)rkf_scenario_constructor.$kw108$INDEXICAL_PHRASE, (SubLObject)rkf_scenario_constructor.NIL)) {
            return (SubLObject)rkf_scenario_constructor.$kw109$PARSE_TERM;
        }
        if (rkf_scenario_constructor.NIL != user_interaction_agenda.ui_state_lookup(interaction, (SubLObject)rkf_scenario_constructor.$kw110$SCENARIO_PHRASE, (SubLObject)rkf_scenario_constructor.NIL)) {
            return (SubLObject)rkf_scenario_constructor.$kw111$PARSE_SCENARIO;
        }
        if (rkf_scenario_constructor.NIL == sc_state_active_session(state)) {
            return (SubLObject)rkf_scenario_constructor.$kw112$OPEN;
        }
        return (SubLObject)rkf_scenario_constructor.$kw113$CONSTRUCT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 15350L)
    public static SubLObject sc_state_update(final SubLObject sc_state, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(sc_state_state(sc_state), key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 15521L)
    public static SubLObject sc_state_lookup(final SubLObject sc_state, final SubLObject key, SubLObject v_default) {
        if (v_default == rkf_scenario_constructor.UNPROVIDED) {
            v_default = (SubLObject)rkf_scenario_constructor.NIL;
        }
        return dictionary.dictionary_lookup(sc_state_state(sc_state), key, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 15656L)
    public static SubLObject sc_state_clear(final SubLObject sc_state, final SubLObject key) {
        return dictionary.dictionary_remove(sc_state_state(sc_state), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 15764L)
    public static SubLObject rkf_sc_new_limitations() {
        return (SubLObject)rkf_scenario_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 15853L)
    public static SubLObject rkf_sc_add_limitation(final SubLObject limitations, final SubLObject key, final SubLObject value) {
        if (rkf_scenario_constructor.NIL == limitations) {
            return (SubLObject)ConsesLow.list(key, value);
        }
        return conses_high.putf(limitations, key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 16019L)
    public static SubLObject rkf_sc_get_limitation(final SubLObject limitations, final SubLObject key, SubLObject v_default) {
        if (v_default == rkf_scenario_constructor.UNPROVIDED) {
            v_default = (SubLObject)rkf_scenario_constructor.NIL;
        }
        return conses_high.getf(limitations, key, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 16223L)
    public static SubLObject sc_state_note_limitations(final SubLObject sc_state, final SubLObject limitations) {
        return sc_state_update(sc_state, (SubLObject)rkf_scenario_constructor.$kw114$LIMITATIONS, limitations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 16351L)
    public static SubLObject sc_state_get_limitations(final SubLObject sc_state) {
        return sc_state_lookup(sc_state, (SubLObject)rkf_scenario_constructor.$kw114$LIMITATIONS, rkf_scenario_constructor.$rkf_sc_state_empty_limitations$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 16649L)
    public static SubLObject sc_concept_harvester(final SubLObject string, final SubLObject category, final SubLObject syntactic_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_scenario_constructor.NIL;
        final SubLObject _prev_bind_0 = rkf_concept_harvester.$rkf_ch_template_parses_method$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = rkf_scenario_constructor.$sc_rtp_category$.currentBinding(thread);
        final SubLObject _prev_bind_4 = rkf_scenario_constructor.$sc_rtp_syntactic_mt$.currentBinding(thread);
        try {
            rkf_concept_harvester.$rkf_ch_template_parses_method$.bind((SubLObject)rkf_scenario_constructor.$sym115$SC_ITP_SEQUEL, thread);
            parsing_vars.$npp_use_nl_tagsP$.bind((SubLObject)rkf_scenario_constructor.NIL, thread);
            rkf_scenario_constructor.$sc_rtp_category$.bind(category, thread);
            rkf_scenario_constructor.$sc_rtp_syntactic_mt$.bind(syntactic_mt, thread);
            result = rkf_concept_harvester.rkf_concept_harvester(string);
        }
        finally {
            rkf_scenario_constructor.$sc_rtp_syntactic_mt$.rebind(_prev_bind_4, thread);
            rkf_scenario_constructor.$sc_rtp_category$.rebind(_prev_bind_3, thread);
            parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
            rkf_concept_harvester.$rkf_ch_template_parses_method$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 17082L)
    public static SubLObject sc_itp_sequel(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return iterative_template_parser.rtp_parse_exp(string, rkf_scenario_constructor.$sc_rtp_category$.getDynamicValue(thread), rkf_scenario_constructor.$sc_rtp_syntactic_mt$.getDynamicValue(thread), (SubLObject)rkf_scenario_constructor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 17217L)
    public static SubLObject sc_act_new_state() {
        final SubLObject state = sc_new_state();
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 17607L)
    public static SubLObject sc_act_initialize_scenario(final SubLObject state, final SubLObject session, final SubLObject phrase) {
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_new_scenario(phrase, (SubLObject)rkf_scenario_constructor.NIL, session);
        _csetf_sc_session_scenario(session, v_scenario);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 18133L)
    public static SubLObject sc_act_new_state_with_phrase(final SubLObject phrase) {
        final SubLObject state = sc_new_state();
        final SubLObject session = sc_act_initialize_construction_session(state, phrase);
        final SubLObject candidate_scenarios = (SubLObject)rkf_scenario_constructor.NIL;
        if (rkf_scenario_constructor.NIL == candidate_scenarios) {
            final SubLObject v_scenario = rkf_scenario_manipulator.sm_new_scenario(phrase, (SubLObject)rkf_scenario_constructor.NIL, session);
            _csetf_sc_session_scenario(session, v_scenario);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 18861L)
    public static SubLObject sc_act_initialize_construction_session(final SubLObject state, SubLObject phrase) {
        if (phrase == rkf_scenario_constructor.UNPROVIDED) {
            phrase = (SubLObject)rkf_scenario_constructor.NIL;
        }
        final SubLObject session = sc_new_session(state, (SubLObject)rkf_scenario_constructor.$kw50$EDIT, phrase);
        sc_add_us_construction_session(state, session);
        sc_activate_session(state, session);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 19261L)
    public static SubLObject sc_act_new_state_with_construction_scenario(final SubLObject v_scenario, SubLObject phrase) {
        if (phrase == rkf_scenario_constructor.UNPROVIDED) {
            phrase = (SubLObject)rkf_scenario_constructor.NIL;
        }
        final SubLObject state = sc_new_state();
        final SubLObject session = sc_new_session(state, (SubLObject)rkf_scenario_constructor.$kw50$EDIT, phrase);
        sc_set_session_scenario(session, v_scenario);
        sc_add_us_construction_session(state, session);
        sc_activate_session(state, session);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 19763L)
    public static SubLObject sc_act_set_session_scenario(final SubLObject session, final SubLObject v_scenario) {
        return sc_set_session_scenario(session, v_scenario);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 19971L)
    public static SubLObject sc_act_read_scenario(final SubLObject state, final SubLObject scenario_spec, final SubLObject phrase) {
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        return rkf_scenario_manipulator.sm_act_read_scenario(scenario_spec, phrase, domain_interaction_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 20377L)
    public static SubLObject sc_act_suggest_scenarios(final SubLObject state, final SubLObject phrase) {
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        final SubLObject scenario_expression = sc_act_determine_scenario_expression(state, phrase);
        if (rkf_scenario_constructor.NIL != scenario_expression) {
            final SubLObject v_scenario = sc_act_initialize_scenario_from_expression(state, scenario_expression, phrase);
            return (SubLObject)ConsesLow.list(v_scenario);
        }
        return (SubLObject)rkf_scenario_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 21200L)
    public static SubLObject sc_act_determine_scenario_expression(final SubLObject state, final SubLObject phrase) {
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        return sc_determine_scenario_expression_int(phrase, parsing_mt, domain_interaction_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 21669L)
    public static SubLObject sc_act_initialize_scenario_from_expression(final SubLObject state, final SubLObject scenario_expression, SubLObject phrase) {
        if (phrase == rkf_scenario_constructor.UNPROVIDED) {
            phrase = (SubLObject)rkf_scenario_constructor.NIL;
        }
        final SubLObject scenario_interaction_mt = sc_state_scenario_interaction_mt(state);
        final SubLObject scenario_parsing_mt = sc_state_parsing_mt(state);
        return rkf_scenario_manipulator.sm_act_initialize_scenario_from_expression(scenario_expression, phrase, scenario_interaction_mt, scenario_parsing_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 22363L)
    public static SubLObject sc_determine_scenario_expression_int(final SubLObject phrase, final SubLObject parsing_mt, final SubLObject domain_interaction_mt) {
        final SubLObject candidates = rkf_scenario_manipulator.sm_extract_candidate_scenario_expressions(phrase, parsing_mt, domain_interaction_mt);
        final SubLObject scenario_expression = candidates.first();
        return scenario_expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 22661L)
    public static SubLObject sc_act_suggest_new_indexical_type(final SubLObject session, final SubLObject indexical_phrase) {
        final SubLObject state = sc_session_state(session);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        return rkf_scenario_manipulator.sm_act_suggest_new_indexical_type(indexical_phrase, parsing_mt, domain_interaction_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 23288L)
    public static SubLObject sc_act_add_new_indexical_multiple(final SubLObject session, final SubLObject indexical_phrase, final SubLObject many_isas, final SubLObject many_genls) {
        sc_session_state_clear(session, (SubLObject)rkf_scenario_constructor.$kw116$INDEXICAL_TABLE);
        final SubLObject v_scenario = sc_session_scenario(session);
        SubLObject indexical_isas = (SubLObject)rkf_scenario_constructor.NIL;
        SubLObject indexical_genls = (SubLObject)rkf_scenario_constructor.NIL;
        SubLObject cdolist_list_var = many_isas;
        SubLObject v_isa = (SubLObject)rkf_scenario_constructor.NIL;
        v_isa = cdolist_list_var.first();
        while (rkf_scenario_constructor.NIL != cdolist_list_var) {
            if (rkf_scenario_constructor.NIL != el_utilities.el_formula_p(v_isa)) {
                v_isa = narts_high.find_nart(v_isa);
            }
            indexical_isas = (SubLObject)ConsesLow.cons(v_isa, indexical_isas);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        cdolist_list_var = many_genls;
        SubLObject genl = (SubLObject)rkf_scenario_constructor.NIL;
        genl = cdolist_list_var.first();
        while (rkf_scenario_constructor.NIL != cdolist_list_var) {
            if (rkf_scenario_constructor.NIL != el_utilities.el_formula_p(genl)) {
                genl = narts_high.find_nart(genl);
            }
            indexical_genls = (SubLObject)ConsesLow.cons(genl, indexical_genls);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        rkf_scenario_manipulator.sm_act_add_new_indexical(v_scenario, indexical_phrase, indexical_isas, indexical_genls);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 24160L)
    public static SubLObject sc_act_add_new_indexical(final SubLObject session, final SubLObject indexical_phrase, SubLObject indexical_isa, SubLObject indexical_genls) {
        sc_session_state_clear(session, (SubLObject)rkf_scenario_constructor.$kw116$INDEXICAL_TABLE);
        final SubLObject v_scenario = sc_session_scenario(session);
        if (rkf_scenario_constructor.NIL != el_utilities.el_formula_p(indexical_isa)) {
            indexical_isa = narts_high.find_nart(indexical_isa);
        }
        if (rkf_scenario_constructor.NIL != el_utilities.el_formula_p(indexical_genls)) {
            indexical_genls = narts_high.find_nart(indexical_genls);
        }
        rkf_scenario_manipulator.sm_act_add_new_indexical(v_scenario, indexical_phrase, indexical_isa, indexical_genls);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 25061L)
    public static SubLObject sc_act_find_indexical(final SubLObject session, final SubLObject indexical_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        return rkf_scenario_manipulator.sm_act_find_indexical(v_scenario, indexical_phrase, (SubLObject)rkf_scenario_constructor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 25369L)
    public static SubLObject sc_act_remove_indexical(final SubLObject session, final SubLObject indexical_record) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_remove_indexical(v_scenario, indexical_record, mt);
        sc_session_state_clear(session, (SubLObject)rkf_scenario_constructor.$kw116$INDEXICAL_TABLE);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 25947L)
    public static SubLObject sc_act_suggest_differences(final SubLObject session, final SubLObject indexical) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject mt = sc_state_domain_interaction_mt(state);
        SubLObject results = (SubLObject)rkf_scenario_constructor.NIL;
        results = rkf_scenario_manipulator.sm_act_suggest_differences(v_scenario, indexical, mt);
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 26390L)
    public static SubLObject sc_act_distinguish_indexicals(final SubLObject session, final SubLObject indexical_a, final SubLObject indexical_b) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_distinguish_indexicals(v_scenario, indexical_a, indexical_b, mt);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 26719L)
    public static SubLObject sc_act_add_indexical_phrase(final SubLObject session, final SubLObject indexical_record, final SubLObject indexical_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_add_indexical_phrase(v_scenario, indexical_record, indexical_phrase);
        sc_session_state_clear(session, (SubLObject)rkf_scenario_constructor.$kw116$INDEXICAL_TABLE);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 27321L)
    public static SubLObject sc_act_remove_indexical_phrase(final SubLObject session, final SubLObject indexical_record, final SubLObject indexical_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_remove_indexical_phrase(v_scenario, indexical_record, indexical_phrase);
        sc_session_state_clear(session, (SubLObject)rkf_scenario_constructor.$kw116$INDEXICAL_TABLE);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 27949L)
    public static SubLObject sc_act_remove_isaXgenls_constraint(final SubLObject session, final SubLObject indexical_record, final SubLObject collection, final SubLObject domain_interaction_mt, SubLObject type) {
        if (type == rkf_scenario_constructor.UNPROVIDED) {
            type = rkf_scenario_constructor.$const117$isa;
        }
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_remove_isaXgenls_constraint(v_scenario, indexical_record, collection, domain_interaction_mt, type);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 28661L)
    public static SubLObject sc_act_suggest_new_constraint(final SubLObject session, final SubLObject nl_sentence) {
        final SubLObject state = sc_session_state(session);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject indexical_records = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        return rkf_scenario_manipulator.sm_act_suggest_constraint_cycl_from_text(nl_sentence, indexical_records, parsing_mt, domain_interaction_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 29334L)
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
        return Values.values(status, irec, predicate, index_col, rel_col);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 29957L)
    public static SubLObject sc_act_remove_constraint(final SubLObject session, final SubLObject constraint_record) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_remove_constraint(v_scenario, constraint_record, domain_interaction_mt);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 30529L)
    public static SubLObject sc_act_remove_all_constraints(final SubLObject session) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_remove_all_constraints(v_scenario, domain_interaction_mt);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 30953L)
    public static SubLObject sc_act_import_constraint(final SubLObject session, final SubLObject constraint) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_import_constraint(v_scenario, constraint, domain_interaction_mt);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 31424L)
    public static SubLObject sc_act_modify_phrase(final SubLObject session, final SubLObject new_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_modify_phrase(v_scenario, new_phrase);
        sc_set_session_phrase(session, new_phrase);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 31874L)
    public static SubLObject sc_act_construct_indexical_table(final SubLObject session) {
        SubLObject indexical_table = sc_session_state_lookup(session, (SubLObject)rkf_scenario_constructor.$kw116$INDEXICAL_TABLE, (SubLObject)rkf_scenario_constructor.UNPROVIDED);
        if (rkf_scenario_constructor.NIL == indexical_table) {
            final SubLObject v_scenario = sc_session_scenario(session);
            indexical_table = rkf_scenario_manipulator.sm_act_construct_indexical_table(v_scenario);
            sc_session_state_update(session, (SubLObject)rkf_scenario_constructor.$kw116$INDEXICAL_TABLE, indexical_table);
        }
        return indexical_table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 32403L)
    public static SubLObject sc_act_constraint_record_nl_sentence(final SubLObject state, final SubLObject v_scenario, final SubLObject constraint_record) {
        assert rkf_scenario_constructor.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) : constraint_record;
        final SubLObject generation_mt = sc_state_generation_mt(state);
        final SubLObject domain_mt = sc_state_domain_interaction_mt(state);
        final SubLObject indexical_records = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        return rkf_scenario_manipulator.sm_act_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 33159L)
    public static SubLObject sc_act_propose_sentence_adjustment(final SubLObject state, final SubLObject cycl_sentence) {
        assert rkf_scenario_constructor.NIL != el_utilities.el_formula_p(cycl_sentence) : cycl_sentence;
        final SubLObject session = sc_state_active_session(state);
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject domain_mt = sc_state_domain_interaction_mt(state);
        return rkf_scenario_manipulator.sm_act_propose_sentence_adjustments(v_scenario, cycl_sentence, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 33779L)
    public static SubLObject sc_act_merge_register_from_scenario(final SubLObject state, final SubLObject from_scenario) {
        SubLObject merge_info = sc_state_merge_info(state);
        if (rkf_scenario_constructor.NIL == merge_info) {
            merge_info = rkf_scenario_manipulator.sm_new_merge_info();
            sc_set_state_merge_info(state, merge_info);
        }
        rkf_scenario_manipulator.sm_set_merge_info_from_scenario(merge_info, from_scenario);
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 34406L)
    public static SubLObject sc_act_merge_register_to_scenario(final SubLObject state, final SubLObject to_scenario) {
        SubLObject merge_info = sc_state_merge_info(state);
        if (rkf_scenario_constructor.NIL == merge_info) {
            merge_info = rkf_scenario_manipulator.sm_new_merge_info();
            sc_set_state_merge_info(state, merge_info);
        }
        rkf_scenario_manipulator.sm_set_merge_info_to_scenario(merge_info, to_scenario);
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 34948L)
    public static SubLObject sc_act_merge_register_align_to(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject merge_info = sc_state_merge_info(state);
        rkf_scenario_manipulator.sm_set_merge_info_align_to(merge_info, indexical_record);
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 35464L)
    public static SubLObject sc_act_merge_register_align_from(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject merge_info = sc_state_merge_info(state);
        rkf_scenario_manipulator.sm_set_merge_info_align_from(merge_info, indexical_record);
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 36002L)
    public static SubLObject sc_act_merge_update_indexical_equivalences(final SubLObject state) {
        final SubLObject merge_info = sc_state_merge_info(state);
        rkf_scenario_manipulator.update_sm_merge_info_indexical_equivalences(merge_info);
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 36424L)
    public static SubLObject sc_act_abandon_merge(final SubLObject state) {
        sc_rem_state_merge_info(state);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 36624L)
    public static SubLObject sc_act_merge_scenarios(final SubLObject state) {
        final SubLObject merge_info = sc_state_merge_info(state);
        final SubLObject from_scenario = rkf_scenario_manipulator.sm_merge_info_from_scenario(merge_info);
        final SubLObject to_scenario = rkf_scenario_manipulator.sm_merge_info_to_scenario(merge_info);
        final SubLObject indexical_equivalences = rkf_scenario_manipulator.sm_merge_info_indexical_equivalences(merge_info);
        rkf_scenario_manipulator.sm_act_merge_scenarios(to_scenario, from_scenario, indexical_equivalences);
        sc_rem_state_merge_info(state);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 37211L)
    public static SubLObject sc_state_merge_from_scenario(final SubLObject state) {
        final SubLObject merge_info = sc_state_merge_info(state);
        return rkf_scenario_manipulator.sm_merge_info_from_scenario(merge_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 37380L)
    public static SubLObject sc_indexical_record_alignedP(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject merge_info = sc_state_merge_info(state);
        if (rkf_scenario_constructor.NIL != merge_info) {
            final SubLObject indexical_equivalences = rkf_scenario_manipulator.sm_merge_info_indexical_equivalences(merge_info);
            return cycl_utilities.expression_find(indexical_record, indexical_equivalences, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED);
        }
        return (SubLObject)rkf_scenario_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 37681L)
    public static SubLObject sc_act_generalize_scenario(final SubLObject state, final SubLObject v_scenario) {
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        final SubLObject generation_mt = sc_state_generation_mt(state);
        SubLObject gen_points = rkf_scenario_manipulator.sm_act_compute_scenario_generalization_points(v_scenario, domain_interaction_mt);
        sc_set_state_gen_points(state, gen_points);
        gen_points = Sequences.remove_if(Symbols.symbol_function((SubLObject)rkf_scenario_constructor.$sym120$SM_GEN_POINT_WITHOUT_POSITIONS_P), gen_points, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED);
        final SubLObject result = rkf_scenario_manipulator.sm_act_generalize_scenario_with_gen_points(v_scenario, gen_points, domain_interaction_mt, generation_mt);
        sc_clear_state_gen_points(state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 38723L)
    public static SubLObject sc_act_save_scenario(final SubLObject state, final SubLObject v_scenario, final SubLObject template) {
        final SubLObject storage_mt = sc_state_scenario_interaction_mt(state);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        return rkf_scenario_manipulator.sm_act_save_scenario(v_scenario, template, storage_mt, parsing_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 39086L)
    public static SubLObject sc_act_enumerate_saved_scenarios(final SubLObject state) {
        final SubLObject storage_mt = sc_state_scenario_interaction_mt(state);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        return rkf_scenario_manipulator.sm_act_enumerate_saved_scenarios(storage_mt, parsing_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 39506L)
    public static SubLObject sc_act_discard_template(final SubLObject state, final SubLObject v_scenario, final SubLObject template) {
        return rkf_scenario_manipulator.sm_act_discard_template(v_scenario, template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 39767L)
    public static SubLObject sc_act_compute_unused_indexicals(final SubLObject v_scenario) {
        return rkf_scenario_manipulator.sm_act_compute_unused_indexicals(v_scenario);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 39999L)
    public static SubLObject sc_act_discard_session(final SubLObject session) {
        final SubLObject state = sc_session_state(session);
        deactivate_and_retire_sc_us_construction_session(state, session);
        return (SubLObject)rkf_scenario_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 40247L)
    public static SubLObject sc_act_activate_session(final SubLObject state, final SubLObject session) {
        return sc_activate_session(state, session);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-constructor.lisp", position = 40423L)
    public static SubLObject sc_act_set_indexical_record_var(final SubLObject indexical_record, final SubLObject var) {
        return rkf_scenario_manipulator.sm_act_set_indexical_record_var(indexical_record, var);
    }
    
    public static SubLObject declare_rkf_scenario_constructor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_parsing_mt", "SC-PARSING-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_semantic_mt", "SC-SEMANTIC-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_storage_mt", "SC-STORAGE-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_generation_mt", "SC-GENERATION-MT", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_scenario_constructor", "with_sc_lock", "WITH-SC-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_find_session_by_id", "SC-FIND-SESSION-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_find_session_by_id_string", "SC-FIND-SESSION-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_find_state_by_id", "SC-FIND-STATE-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_find_state_by_id_string", "SC-FIND-STATE-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "next_sc_id", "NEXT-SC-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_add_object", "SC-ADD-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_rem_object", "SC-REM-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_find_object_by_id", "SC-FIND-OBJECT-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_print_function_trampoline", "SC-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_p", "SC-SESSION-P", 1, 0, false);
        new $sc_session_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_id", "SC-SESSION-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_state", "SC-SESSION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_phrase", "SC-SESSION-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_candidate_scenarios", "SC-SESSION-CANDIDATE-SCENARIOS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_permission", "SC-SESSION-PERMISSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_scenario", "SC-SESSION-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_internal_state", "SC-SESSION-INTERNAL-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_session_id", "_CSETF-SC-SESSION-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_session_state", "_CSETF-SC-SESSION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_session_phrase", "_CSETF-SC-SESSION-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_session_candidate_scenarios", "_CSETF-SC-SESSION-CANDIDATE-SCENARIOS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_session_permission", "_CSETF-SC-SESSION-PERMISSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_session_scenario", "_CSETF-SC-SESSION-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_session_internal_state", "_CSETF-SC-SESSION-INTERNAL-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "make_sc_session", "MAKE-SC-SESSION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "visit_defstruct_sc_session", "VISIT-DEFSTRUCT-SC-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "visit_defstruct_object_sc_session_method", "VISIT-DEFSTRUCT-OBJECT-SC-SESSION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_new_session", "SC-NEW-SESSION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_set_session_phrase", "SC-SET-SESSION-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_set_session_permission", "SC-SET-SESSION-PERMISSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_add_session_candidate_scenarios", "SC-ADD-SESSION-CANDIDATE-SCENARIOS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_add_session_candidate_scenario", "SC-ADD-SESSION-CANDIDATE-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_rem_candidate_scenario", "SC-REM-CANDIDATE-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_set_session_scenario", "SC-SET-SESSION-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_construction_session_p", "SC-CONSTRUCTION-SESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_browsing_session_p", "SC-BROWSING-SESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_cleanup_session", "SC-CLEANUP-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_state_lookup", "SC-SESSION-STATE-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_state_update", "SC-SESSION-STATE-UPDATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_session_state_clear", "SC-SESSION-STATE-CLEAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_print_function_trampoline", "SC-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_p", "SC-STATE-P", 1, 0, false);
        new $sc_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_id", "SC-STATE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_interaction", "SC-STATE-INTERACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_active_session", "SC-STATE-ACTIVE-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_construction_sessions", "SC-STATE-CONSTRUCTION-SESSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_browsing_sessions", "SC-STATE-BROWSING-SESSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_merge_info", "SC-STATE-MERGE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_parsing_mt", "SC-STATE-PARSING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_generation_mt", "SC-STATE-GENERATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_domain_mt", "SC-STATE-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_domain_interaction_mt", "SC-STATE-DOMAIN-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_scenario_interaction_mt", "SC-STATE-SCENARIO-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_gen_points", "SC-STATE-GEN-POINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_state", "SC-STATE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_id", "_CSETF-SC-STATE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_interaction", "_CSETF-SC-STATE-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_active_session", "_CSETF-SC-STATE-ACTIVE-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_construction_sessions", "_CSETF-SC-STATE-CONSTRUCTION-SESSIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_browsing_sessions", "_CSETF-SC-STATE-BROWSING-SESSIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_merge_info", "_CSETF-SC-STATE-MERGE-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_parsing_mt", "_CSETF-SC-STATE-PARSING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_generation_mt", "_CSETF-SC-STATE-GENERATION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_domain_mt", "_CSETF-SC-STATE-DOMAIN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_domain_interaction_mt", "_CSETF-SC-STATE-DOMAIN-INTERACTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_scenario_interaction_mt", "_CSETF-SC-STATE-SCENARIO-INTERACTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_gen_points", "_CSETF-SC-STATE-GEN-POINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "_csetf_sc_state_state", "_CSETF-SC-STATE-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "make_sc_state", "MAKE-SC-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "visit_defstruct_sc_state", "VISIT-DEFSTRUCT-SC-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "visit_defstruct_object_sc_state_method", "VISIT-DEFSTRUCT-OBJECT-SC-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_new_state", "SC-NEW-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "cleanup_sc_state", "CLEANUP-SC-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "note_sc_state_interaction", "NOTE-SC-STATE-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_add_us_construction_session", "SC-ADD-US-CONSTRUCTION-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "retire_sc_us_construction_session", "RETIRE-SC-US-CONSTRUCTION-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "deactivate_and_retire_sc_us_construction_session", "DEACTIVATE-AND-RETIRE-SC-US-CONSTRUCTION-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_add_us_browsing_session", "SC-ADD-US-BROWSING-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "retire_sc_us_browsing_session", "RETIRE-SC-US-BROWSING-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_activate_session", "SC-ACTIVATE-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "deactivate_active_sc_session", "DEACTIVATE-ACTIVE-SC-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_set_state_merge_info", "SC-SET-STATE-MERGE-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_rem_state_merge_info", "SC-REM-STATE-MERGE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "initialize_sc_state_mts", "INITIALIZE-SC-STATE-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_set_state_gen_points", "SC-SET-STATE-GEN-POINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_clear_state_gen_points", "SC-CLEAR-STATE-GEN-POINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_active_scenario", "SC-STATE-ACTIVE-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_active_scenario_incomplete", "SC-STATE-ACTIVE-SCENARIO-INCOMPLETE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_current_act", "SC-STATE-CURRENT-ACT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_update", "SC-STATE-UPDATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_lookup", "SC-STATE-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_clear", "SC-STATE-CLEAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "rkf_sc_new_limitations", "RKF-SC-NEW-LIMITATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "rkf_sc_add_limitation", "RKF-SC-ADD-LIMITATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "rkf_sc_get_limitation", "RKF-SC-GET-LIMITATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_note_limitations", "SC-STATE-NOTE-LIMITATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_get_limitations", "SC-STATE-GET-LIMITATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_concept_harvester", "SC-CONCEPT-HARVESTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_itp_sequel", "SC-ITP-SEQUEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_new_state", "SC-ACT-NEW-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_initialize_scenario", "SC-ACT-INITIALIZE-SCENARIO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_new_state_with_phrase", "SC-ACT-NEW-STATE-WITH-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_initialize_construction_session", "SC-ACT-INITIALIZE-CONSTRUCTION-SESSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_new_state_with_construction_scenario", "SC-ACT-NEW-STATE-WITH-CONSTRUCTION-SCENARIO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_set_session_scenario", "SC-ACT-SET-SESSION-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_read_scenario", "SC-ACT-READ-SCENARIO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_suggest_scenarios", "SC-ACT-SUGGEST-SCENARIOS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_determine_scenario_expression", "SC-ACT-DETERMINE-SCENARIO-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_initialize_scenario_from_expression", "SC-ACT-INITIALIZE-SCENARIO-FROM-EXPRESSION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_determine_scenario_expression_int", "SC-DETERMINE-SCENARIO-EXPRESSION-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_suggest_new_indexical_type", "SC-ACT-SUGGEST-NEW-INDEXICAL-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_add_new_indexical_multiple", "SC-ACT-ADD-NEW-INDEXICAL-MULTIPLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_add_new_indexical", "SC-ACT-ADD-NEW-INDEXICAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_find_indexical", "SC-ACT-FIND-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_remove_indexical", "SC-ACT-REMOVE-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_suggest_differences", "SC-ACT-SUGGEST-DIFFERENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_distinguish_indexicals", "SC-ACT-DISTINGUISH-INDEXICALS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_add_indexical_phrase", "SC-ACT-ADD-INDEXICAL-PHRASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_remove_indexical_phrase", "SC-ACT-REMOVE-INDEXICAL-PHRASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_remove_isaXgenls_constraint", "SC-ACT-REMOVE-ISA/GENLS-CONSTRAINT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_suggest_new_constraint", "SC-ACT-SUGGEST-NEW-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_add_new_constraint", "SC-ACT-ADD-NEW-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_remove_constraint", "SC-ACT-REMOVE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_remove_all_constraints", "SC-ACT-REMOVE-ALL-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_import_constraint", "SC-ACT-IMPORT-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_modify_phrase", "SC-ACT-MODIFY-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_construct_indexical_table", "SC-ACT-CONSTRUCT-INDEXICAL-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_constraint_record_nl_sentence", "SC-ACT-CONSTRAINT-RECORD-NL-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_propose_sentence_adjustment", "SC-ACT-PROPOSE-SENTENCE-ADJUSTMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_merge_register_from_scenario", "SC-ACT-MERGE-REGISTER-FROM-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_merge_register_to_scenario", "SC-ACT-MERGE-REGISTER-TO-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_merge_register_align_to", "SC-ACT-MERGE-REGISTER-ALIGN-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_merge_register_align_from", "SC-ACT-MERGE-REGISTER-ALIGN-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_merge_update_indexical_equivalences", "SC-ACT-MERGE-UPDATE-INDEXICAL-EQUIVALENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_abandon_merge", "SC-ACT-ABANDON-MERGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_merge_scenarios", "SC-ACT-MERGE-SCENARIOS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_state_merge_from_scenario", "SC-STATE-MERGE-FROM-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_indexical_record_alignedP", "SC-INDEXICAL-RECORD-ALIGNED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_generalize_scenario", "SC-ACT-GENERALIZE-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_save_scenario", "SC-ACT-SAVE-SCENARIO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_enumerate_saved_scenarios", "SC-ACT-ENUMERATE-SAVED-SCENARIOS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_discard_template", "SC-ACT-DISCARD-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_compute_unused_indexicals", "SC-ACT-COMPUTE-UNUSED-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_discard_session", "SC-ACT-DISCARD-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_activate_session", "SC-ACT-ACTIVATE-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_constructor", "sc_act_set_indexical_record_var", "SC-ACT-SET-INDEXICAL-RECORD-VAR", 2, 0, false);
        return (SubLObject)rkf_scenario_constructor.NIL;
    }
    
    public static SubLObject init_rkf_scenario_constructor_file() {
        rkf_scenario_constructor.$sc_parsing_mt$ = SubLFiles.defparameter("*SC-PARSING-MT*", rkf_scenario_constructor.$const0$EBertTemplateMt);
        rkf_scenario_constructor.$sc_semantic_mt$ = SubLFiles.defparameter("*SC-SEMANTIC-MT*", rkf_scenario_constructor.$const1$MassMediaMt);
        rkf_scenario_constructor.$sc_storage_mt$ = SubLFiles.defparameter("*SC-STORAGE-MT*", rkf_scenario_constructor.$const2$ScenarioDescriptionMt);
        rkf_scenario_constructor.$sc_generation_mt$ = SubLFiles.defparameter("*SC-GENERATION-MT*", rkf_scenario_constructor.$const3$EnglishParaphraseMt);
        rkf_scenario_constructor.$sc_lock$ = SubLFiles.deflexical("*SC-LOCK*", Locks.make_lock((SubLObject)rkf_scenario_constructor.$str4$Scenario_Constructor_Lock));
        rkf_scenario_constructor.$sc_isg$ = SubLFiles.deflexical("*SC-ISG*", (rkf_scenario_constructor.NIL != Symbols.boundp((SubLObject)rkf_scenario_constructor.$sym7$_SC_ISG_)) ? rkf_scenario_constructor.$sc_isg$.getGlobalValue() : integer_sequence_generator.new_integer_sequence_generator((SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED));
        rkf_scenario_constructor.$sc_index$ = SubLFiles.deflexical("*SC-INDEX*", (rkf_scenario_constructor.NIL != Symbols.boundp((SubLObject)rkf_scenario_constructor.$sym8$_SC_INDEX_)) ? rkf_scenario_constructor.$sc_index$.getGlobalValue() : dictionary.new_dictionary((SubLObject)rkf_scenario_constructor.UNPROVIDED, (SubLObject)rkf_scenario_constructor.UNPROVIDED));
        rkf_scenario_constructor.$dtp_sc_session$ = SubLFiles.defconstant("*DTP-SC-SESSION*", (SubLObject)rkf_scenario_constructor.$sym9$SC_SESSION);
        rkf_scenario_constructor.$dtp_sc_state$ = SubLFiles.defconstant("*DTP-SC-STATE*", (SubLObject)rkf_scenario_constructor.$sym52$SC_STATE);
        rkf_scenario_constructor.$rkf_sc_state_empty_limitations$ = SubLFiles.deflexical("*RKF-SC-STATE-EMPTY-LIMITATIONS*", rkf_sc_new_limitations());
        rkf_scenario_constructor.$sc_rtp_category$ = SubLFiles.defparameter("*SC-RTP-CATEGORY*", (SubLObject)rkf_scenario_constructor.NIL);
        rkf_scenario_constructor.$sc_rtp_syntactic_mt$ = SubLFiles.defparameter("*SC-RTP-SYNTACTIC-MT*", (SubLObject)rkf_scenario_constructor.NIL);
        return (SubLObject)rkf_scenario_constructor.NIL;
    }
    
    public static SubLObject setup_rkf_scenario_constructor_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_scenario_constructor.$sym7$_SC_ISG_);
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_scenario_constructor.$sym8$_SC_INDEX_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_scenario_constructor.$dtp_sc_session$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_constructor.$sym16$SC_SESSION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_scenario_constructor.$list17);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym18$SC_SESSION_ID, (SubLObject)rkf_scenario_constructor.$sym19$_CSETF_SC_SESSION_ID);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym20$SC_SESSION_STATE, (SubLObject)rkf_scenario_constructor.$sym21$_CSETF_SC_SESSION_STATE);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym22$SC_SESSION_PHRASE, (SubLObject)rkf_scenario_constructor.$sym23$_CSETF_SC_SESSION_PHRASE);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym24$SC_SESSION_CANDIDATE_SCENARIOS, (SubLObject)rkf_scenario_constructor.$sym25$_CSETF_SC_SESSION_CANDIDATE_SCENARIOS);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym26$SC_SESSION_PERMISSION, (SubLObject)rkf_scenario_constructor.$sym27$_CSETF_SC_SESSION_PERMISSION);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym28$SC_SESSION_SCENARIO, (SubLObject)rkf_scenario_constructor.$sym29$_CSETF_SC_SESSION_SCENARIO);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym30$SC_SESSION_INTERNAL_STATE, (SubLObject)rkf_scenario_constructor.$sym31$_CSETF_SC_SESSION_INTERNAL_STATE);
        Equality.identity((SubLObject)rkf_scenario_constructor.$sym9$SC_SESSION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_scenario_constructor.$dtp_sc_session$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_constructor.$sym44$VISIT_DEFSTRUCT_OBJECT_SC_SESSION_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_scenario_constructor.$dtp_sc_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_constructor.$sym57$SC_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_scenario_constructor.$list58);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym59$SC_STATE_ID, (SubLObject)rkf_scenario_constructor.$sym60$_CSETF_SC_STATE_ID);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym61$SC_STATE_INTERACTION, (SubLObject)rkf_scenario_constructor.$sym62$_CSETF_SC_STATE_INTERACTION);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym63$SC_STATE_ACTIVE_SESSION, (SubLObject)rkf_scenario_constructor.$sym64$_CSETF_SC_STATE_ACTIVE_SESSION);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym65$SC_STATE_CONSTRUCTION_SESSIONS, (SubLObject)rkf_scenario_constructor.$sym66$_CSETF_SC_STATE_CONSTRUCTION_SESSIONS);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym67$SC_STATE_BROWSING_SESSIONS, (SubLObject)rkf_scenario_constructor.$sym68$_CSETF_SC_STATE_BROWSING_SESSIONS);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym69$SC_STATE_MERGE_INFO, (SubLObject)rkf_scenario_constructor.$sym70$_CSETF_SC_STATE_MERGE_INFO);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym71$SC_STATE_PARSING_MT, (SubLObject)rkf_scenario_constructor.$sym72$_CSETF_SC_STATE_PARSING_MT);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym73$SC_STATE_GENERATION_MT, (SubLObject)rkf_scenario_constructor.$sym74$_CSETF_SC_STATE_GENERATION_MT);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym75$SC_STATE_DOMAIN_MT, (SubLObject)rkf_scenario_constructor.$sym76$_CSETF_SC_STATE_DOMAIN_MT);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym77$SC_STATE_DOMAIN_INTERACTION_MT, (SubLObject)rkf_scenario_constructor.$sym78$_CSETF_SC_STATE_DOMAIN_INTERACTION_MT);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym79$SC_STATE_SCENARIO_INTERACTION_MT, (SubLObject)rkf_scenario_constructor.$sym80$_CSETF_SC_STATE_SCENARIO_INTERACTION_MT);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym81$SC_STATE_GEN_POINTS, (SubLObject)rkf_scenario_constructor.$sym82$_CSETF_SC_STATE_GEN_POINTS);
        Structures.def_csetf((SubLObject)rkf_scenario_constructor.$sym83$SC_STATE_STATE, (SubLObject)rkf_scenario_constructor.$sym84$_CSETF_SC_STATE_STATE);
        Equality.identity((SubLObject)rkf_scenario_constructor.$sym52$SC_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_scenario_constructor.$dtp_sc_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_constructor.$sym97$VISIT_DEFSTRUCT_OBJECT_SC_STATE_METHOD));
        return (SubLObject)rkf_scenario_constructor.NIL;
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
        me = (SubLFile)new rkf_scenario_constructor();
        rkf_scenario_constructor.$sc_parsing_mt$ = null;
        rkf_scenario_constructor.$sc_semantic_mt$ = null;
        rkf_scenario_constructor.$sc_storage_mt$ = null;
        rkf_scenario_constructor.$sc_generation_mt$ = null;
        rkf_scenario_constructor.$sc_lock$ = null;
        rkf_scenario_constructor.$sc_isg$ = null;
        rkf_scenario_constructor.$sc_index$ = null;
        rkf_scenario_constructor.$dtp_sc_session$ = null;
        rkf_scenario_constructor.$dtp_sc_state$ = null;
        rkf_scenario_constructor.$rkf_sc_state_empty_limitations$ = null;
        rkf_scenario_constructor.$sc_rtp_category$ = null;
        rkf_scenario_constructor.$sc_rtp_syntactic_mt$ = null;
        $const0$EBertTemplateMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EBertTemplateMt"));
        $const1$MassMediaMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassMediaMt"));
        $const2$ScenarioDescriptionMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScenarioDescriptionMt"));
        $const3$EnglishParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt"));
        $str4$Scenario_Constructor_Lock = SubLObjectFactory.makeString("Scenario Constructor Lock");
        $sym5$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SC-LOCK*"));
        $sym7$_SC_ISG_ = SubLObjectFactory.makeSymbol("*SC-ISG*");
        $sym8$_SC_INDEX_ = SubLObjectFactory.makeSymbol("*SC-INDEX*");
        $sym9$SC_SESSION = SubLObjectFactory.makeSymbol("SC-SESSION");
        $sym10$SC_SESSION_P = SubLObjectFactory.makeSymbol("SC-SESSION-P");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-SCENARIOS"), (SubLObject)SubLObjectFactory.makeSymbol("PERMISSION"), (SubLObject)SubLObjectFactory.makeSymbol("SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STATE"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE"), (SubLObject)SubLObjectFactory.makeKeyword("CANDIDATE-SCENARIOS"), (SubLObject)SubLObjectFactory.makeKeyword("PERMISSION"), (SubLObject)SubLObjectFactory.makeKeyword("SCENARIO"), (SubLObject)SubLObjectFactory.makeKeyword("INTERNAL-STATE"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SC-SESSION-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SC-SESSION-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("SC-SESSION-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("SC-SESSION-CANDIDATE-SCENARIOS"), (SubLObject)SubLObjectFactory.makeSymbol("SC-SESSION-PERMISSION"), (SubLObject)SubLObjectFactory.makeSymbol("SC-SESSION-SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("SC-SESSION-INTERNAL-STATE"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-CANDIDATE-SCENARIOS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-PERMISSION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-INTERNAL-STATE"));
        $sym15$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym16$SC_SESSION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SC-SESSION-PRINT-FUNCTION-TRAMPOLINE");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SC-SESSION-P"));
        $sym18$SC_SESSION_ID = SubLObjectFactory.makeSymbol("SC-SESSION-ID");
        $sym19$_CSETF_SC_SESSION_ID = SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-ID");
        $sym20$SC_SESSION_STATE = SubLObjectFactory.makeSymbol("SC-SESSION-STATE");
        $sym21$_CSETF_SC_SESSION_STATE = SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-STATE");
        $sym22$SC_SESSION_PHRASE = SubLObjectFactory.makeSymbol("SC-SESSION-PHRASE");
        $sym23$_CSETF_SC_SESSION_PHRASE = SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-PHRASE");
        $sym24$SC_SESSION_CANDIDATE_SCENARIOS = SubLObjectFactory.makeSymbol("SC-SESSION-CANDIDATE-SCENARIOS");
        $sym25$_CSETF_SC_SESSION_CANDIDATE_SCENARIOS = SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-CANDIDATE-SCENARIOS");
        $sym26$SC_SESSION_PERMISSION = SubLObjectFactory.makeSymbol("SC-SESSION-PERMISSION");
        $sym27$_CSETF_SC_SESSION_PERMISSION = SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-PERMISSION");
        $sym28$SC_SESSION_SCENARIO = SubLObjectFactory.makeSymbol("SC-SESSION-SCENARIO");
        $sym29$_CSETF_SC_SESSION_SCENARIO = SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-SCENARIO");
        $sym30$SC_SESSION_INTERNAL_STATE = SubLObjectFactory.makeSymbol("SC-SESSION-INTERNAL-STATE");
        $sym31$_CSETF_SC_SESSION_INTERNAL_STATE = SubLObjectFactory.makeSymbol("_CSETF-SC-SESSION-INTERNAL-STATE");
        $kw32$ID = SubLObjectFactory.makeKeyword("ID");
        $kw33$STATE = SubLObjectFactory.makeKeyword("STATE");
        $kw34$PHRASE = SubLObjectFactory.makeKeyword("PHRASE");
        $kw35$CANDIDATE_SCENARIOS = SubLObjectFactory.makeKeyword("CANDIDATE-SCENARIOS");
        $kw36$PERMISSION = SubLObjectFactory.makeKeyword("PERMISSION");
        $kw37$SCENARIO = SubLObjectFactory.makeKeyword("SCENARIO");
        $kw38$INTERNAL_STATE = SubLObjectFactory.makeKeyword("INTERNAL-STATE");
        $str39$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw40$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym41$MAKE_SC_SESSION = SubLObjectFactory.makeSymbol("MAKE-SC-SESSION");
        $kw42$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw43$END = SubLObjectFactory.makeKeyword("END");
        $sym44$VISIT_DEFSTRUCT_OBJECT_SC_SESSION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SC-SESSION-METHOD");
        $sym45$SC_STATE_P = SubLObjectFactory.makeSymbol("SC-STATE-P");
        $sym46$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EDIT"), (SubLObject)SubLObjectFactory.makeKeyword("VIEW"));
        $str48$Error___a_is_not_a_known_scenario = SubLObjectFactory.makeString("Error: ~a is not a known scenario construction permission type.");
        $sym49$SM_SCENARIO_P = SubLObjectFactory.makeSymbol("SM-SCENARIO-P");
        $kw50$EDIT = SubLObjectFactory.makeKeyword("EDIT");
        $kw51$VIEW = SubLObjectFactory.makeKeyword("VIEW");
        $sym52$SC_STATE = SubLObjectFactory.makeSymbol("SC-STATE");
        $list53 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("INTERACTION"), SubLObjectFactory.makeSymbol("ACTIVE-SESSION"), SubLObjectFactory.makeSymbol("CONSTRUCTION-SESSIONS"), SubLObjectFactory.makeSymbol("BROWSING-SESSIONS"), SubLObjectFactory.makeSymbol("MERGE-INFO"), SubLObjectFactory.makeSymbol("PARSING-MT"), SubLObjectFactory.makeSymbol("GENERATION-MT"), SubLObjectFactory.makeSymbol("DOMAIN-MT"), SubLObjectFactory.makeSymbol("DOMAIN-INTERACTION-MT"), SubLObjectFactory.makeSymbol("SCENARIO-INTERACTION-MT"), SubLObjectFactory.makeSymbol("GEN-POINTS"), SubLObjectFactory.makeSymbol("STATE") });
        $list54 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("INTERACTION"), SubLObjectFactory.makeKeyword("ACTIVE-SESSION"), SubLObjectFactory.makeKeyword("CONSTRUCTION-SESSIONS"), SubLObjectFactory.makeKeyword("BROWSING-SESSIONS"), SubLObjectFactory.makeKeyword("MERGE-INFO"), SubLObjectFactory.makeKeyword("PARSING-MT"), SubLObjectFactory.makeKeyword("GENERATION-MT"), SubLObjectFactory.makeKeyword("DOMAIN-MT"), SubLObjectFactory.makeKeyword("DOMAIN-INTERACTION-MT"), SubLObjectFactory.makeKeyword("SCENARIO-INTERACTION-MT"), SubLObjectFactory.makeKeyword("GEN-POINTS"), SubLObjectFactory.makeKeyword("STATE") });
        $list55 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SC-STATE-ID"), SubLObjectFactory.makeSymbol("SC-STATE-INTERACTION"), SubLObjectFactory.makeSymbol("SC-STATE-ACTIVE-SESSION"), SubLObjectFactory.makeSymbol("SC-STATE-CONSTRUCTION-SESSIONS"), SubLObjectFactory.makeSymbol("SC-STATE-BROWSING-SESSIONS"), SubLObjectFactory.makeSymbol("SC-STATE-MERGE-INFO"), SubLObjectFactory.makeSymbol("SC-STATE-PARSING-MT"), SubLObjectFactory.makeSymbol("SC-STATE-GENERATION-MT"), SubLObjectFactory.makeSymbol("SC-STATE-DOMAIN-MT"), SubLObjectFactory.makeSymbol("SC-STATE-DOMAIN-INTERACTION-MT"), SubLObjectFactory.makeSymbol("SC-STATE-SCENARIO-INTERACTION-MT"), SubLObjectFactory.makeSymbol("SC-STATE-GEN-POINTS"), SubLObjectFactory.makeSymbol("SC-STATE-STATE") });
        $list56 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-ID"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-INTERACTION"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-ACTIVE-SESSION"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-CONSTRUCTION-SESSIONS"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-BROWSING-SESSIONS"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-MERGE-INFO"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-PARSING-MT"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-GENERATION-MT"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-DOMAIN-MT"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-DOMAIN-INTERACTION-MT"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-SCENARIO-INTERACTION-MT"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-GEN-POINTS"), SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-STATE") });
        $sym57$SC_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SC-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SC-STATE-P"));
        $sym59$SC_STATE_ID = SubLObjectFactory.makeSymbol("SC-STATE-ID");
        $sym60$_CSETF_SC_STATE_ID = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-ID");
        $sym61$SC_STATE_INTERACTION = SubLObjectFactory.makeSymbol("SC-STATE-INTERACTION");
        $sym62$_CSETF_SC_STATE_INTERACTION = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-INTERACTION");
        $sym63$SC_STATE_ACTIVE_SESSION = SubLObjectFactory.makeSymbol("SC-STATE-ACTIVE-SESSION");
        $sym64$_CSETF_SC_STATE_ACTIVE_SESSION = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-ACTIVE-SESSION");
        $sym65$SC_STATE_CONSTRUCTION_SESSIONS = SubLObjectFactory.makeSymbol("SC-STATE-CONSTRUCTION-SESSIONS");
        $sym66$_CSETF_SC_STATE_CONSTRUCTION_SESSIONS = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-CONSTRUCTION-SESSIONS");
        $sym67$SC_STATE_BROWSING_SESSIONS = SubLObjectFactory.makeSymbol("SC-STATE-BROWSING-SESSIONS");
        $sym68$_CSETF_SC_STATE_BROWSING_SESSIONS = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-BROWSING-SESSIONS");
        $sym69$SC_STATE_MERGE_INFO = SubLObjectFactory.makeSymbol("SC-STATE-MERGE-INFO");
        $sym70$_CSETF_SC_STATE_MERGE_INFO = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-MERGE-INFO");
        $sym71$SC_STATE_PARSING_MT = SubLObjectFactory.makeSymbol("SC-STATE-PARSING-MT");
        $sym72$_CSETF_SC_STATE_PARSING_MT = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-PARSING-MT");
        $sym73$SC_STATE_GENERATION_MT = SubLObjectFactory.makeSymbol("SC-STATE-GENERATION-MT");
        $sym74$_CSETF_SC_STATE_GENERATION_MT = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-GENERATION-MT");
        $sym75$SC_STATE_DOMAIN_MT = SubLObjectFactory.makeSymbol("SC-STATE-DOMAIN-MT");
        $sym76$_CSETF_SC_STATE_DOMAIN_MT = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-DOMAIN-MT");
        $sym77$SC_STATE_DOMAIN_INTERACTION_MT = SubLObjectFactory.makeSymbol("SC-STATE-DOMAIN-INTERACTION-MT");
        $sym78$_CSETF_SC_STATE_DOMAIN_INTERACTION_MT = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-DOMAIN-INTERACTION-MT");
        $sym79$SC_STATE_SCENARIO_INTERACTION_MT = SubLObjectFactory.makeSymbol("SC-STATE-SCENARIO-INTERACTION-MT");
        $sym80$_CSETF_SC_STATE_SCENARIO_INTERACTION_MT = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-SCENARIO-INTERACTION-MT");
        $sym81$SC_STATE_GEN_POINTS = SubLObjectFactory.makeSymbol("SC-STATE-GEN-POINTS");
        $sym82$_CSETF_SC_STATE_GEN_POINTS = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-GEN-POINTS");
        $sym83$SC_STATE_STATE = SubLObjectFactory.makeSymbol("SC-STATE-STATE");
        $sym84$_CSETF_SC_STATE_STATE = SubLObjectFactory.makeSymbol("_CSETF-SC-STATE-STATE");
        $kw85$INTERACTION = SubLObjectFactory.makeKeyword("INTERACTION");
        $kw86$ACTIVE_SESSION = SubLObjectFactory.makeKeyword("ACTIVE-SESSION");
        $kw87$CONSTRUCTION_SESSIONS = SubLObjectFactory.makeKeyword("CONSTRUCTION-SESSIONS");
        $kw88$BROWSING_SESSIONS = SubLObjectFactory.makeKeyword("BROWSING-SESSIONS");
        $kw89$MERGE_INFO = SubLObjectFactory.makeKeyword("MERGE-INFO");
        $kw90$PARSING_MT = SubLObjectFactory.makeKeyword("PARSING-MT");
        $kw91$GENERATION_MT = SubLObjectFactory.makeKeyword("GENERATION-MT");
        $kw92$DOMAIN_MT = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $kw93$DOMAIN_INTERACTION_MT = SubLObjectFactory.makeKeyword("DOMAIN-INTERACTION-MT");
        $kw94$SCENARIO_INTERACTION_MT = SubLObjectFactory.makeKeyword("SCENARIO-INTERACTION-MT");
        $kw95$GEN_POINTS = SubLObjectFactory.makeKeyword("GEN-POINTS");
        $sym96$MAKE_SC_STATE = SubLObjectFactory.makeSymbol("MAKE-SC-STATE");
        $sym97$VISIT_DEFSTRUCT_OBJECT_SC_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SC-STATE-METHOD");
        $sym98$USER_INTERACTION_P = SubLObjectFactory.makeSymbol("USER-INTERACTION-P");
        $sym99$SC_CONSTRUCTION_SESSION_P = SubLObjectFactory.makeSymbol("SC-CONSTRUCTION-SESSION-P");
        $sym100$SC_BROWSING_SESSION_P = SubLObjectFactory.makeSymbol("SC-BROWSING-SESSION-P");
        $sym101$SM_MERGE_INFO_P = SubLObjectFactory.makeSymbol("SM-MERGE-INFO-P");
        $sym102$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $kw103$SC_ACT = SubLObjectFactory.makeKeyword("SC-ACT");
        $kw104$MERGE = SubLObjectFactory.makeKeyword("MERGE");
        $kw105$GENERALIZE = SubLObjectFactory.makeKeyword("GENERALIZE");
        $kw106$CONSTRAINT_SENTENCE = SubLObjectFactory.makeKeyword("CONSTRAINT-SENTENCE");
        $kw107$PARSE_CONSTRAINT = SubLObjectFactory.makeKeyword("PARSE-CONSTRAINT");
        $kw108$INDEXICAL_PHRASE = SubLObjectFactory.makeKeyword("INDEXICAL-PHRASE");
        $kw109$PARSE_TERM = SubLObjectFactory.makeKeyword("PARSE-TERM");
        $kw110$SCENARIO_PHRASE = SubLObjectFactory.makeKeyword("SCENARIO-PHRASE");
        $kw111$PARSE_SCENARIO = SubLObjectFactory.makeKeyword("PARSE-SCENARIO");
        $kw112$OPEN = SubLObjectFactory.makeKeyword("OPEN");
        $kw113$CONSTRUCT = SubLObjectFactory.makeKeyword("CONSTRUCT");
        $kw114$LIMITATIONS = SubLObjectFactory.makeKeyword("LIMITATIONS");
        $sym115$SC_ITP_SEQUEL = SubLObjectFactory.makeSymbol("SC-ITP-SEQUEL");
        $kw116$INDEXICAL_TABLE = SubLObjectFactory.makeKeyword("INDEXICAL-TABLE");
        $const117$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym118$SM_CONSTRAINT_RECORD_P = SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-P");
        $sym119$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym120$SM_GEN_POINT_WITHOUT_POSITIONS_P = SubLObjectFactory.makeSymbol("SM-GEN-POINT-WITHOUT-POSITIONS-P");
    }
    
    public static final class $sc_session_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $state;
        public SubLObject $phrase;
        public SubLObject $candidate_scenarios;
        public SubLObject $permission;
        public SubLObject $scenario;
        public SubLObject $internal_state;
        private static final SubLStructDeclNative structDecl;
        
        public $sc_session_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$phrase = (SubLObject)CommonSymbols.NIL;
            this.$candidate_scenarios = (SubLObject)CommonSymbols.NIL;
            this.$permission = (SubLObject)CommonSymbols.NIL;
            this.$scenario = (SubLObject)CommonSymbols.NIL;
            this.$internal_state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sc_session_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sc_session_native.class, rkf_scenario_constructor.$sym9$SC_SESSION, rkf_scenario_constructor.$sym10$SC_SESSION_P, rkf_scenario_constructor.$list11, rkf_scenario_constructor.$list12, new String[] { "$id", "$state", "$phrase", "$candidate_scenarios", "$permission", "$scenario", "$internal_state" }, rkf_scenario_constructor.$list13, rkf_scenario_constructor.$list14, rkf_scenario_constructor.$sym15$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $sc_session_p$UnaryFunction extends UnaryFunction
    {
        public $sc_session_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SC-SESSION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_scenario_constructor.sc_session_p(arg1);
        }
    }
    
    public static final class $sc_state_native extends SubLStructNative
    {
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
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$interaction = (SubLObject)CommonSymbols.NIL;
            this.$active_session = (SubLObject)CommonSymbols.NIL;
            this.$construction_sessions = (SubLObject)CommonSymbols.NIL;
            this.$browsing_sessions = (SubLObject)CommonSymbols.NIL;
            this.$merge_info = (SubLObject)CommonSymbols.NIL;
            this.$parsing_mt = (SubLObject)CommonSymbols.NIL;
            this.$generation_mt = (SubLObject)CommonSymbols.NIL;
            this.$domain_mt = (SubLObject)CommonSymbols.NIL;
            this.$domain_interaction_mt = (SubLObject)CommonSymbols.NIL;
            this.$scenario_interaction_mt = (SubLObject)CommonSymbols.NIL;
            this.$gen_points = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sc_state_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sc_state_native.class, rkf_scenario_constructor.$sym52$SC_STATE, rkf_scenario_constructor.$sym45$SC_STATE_P, rkf_scenario_constructor.$list53, rkf_scenario_constructor.$list54, new String[] { "$id", "$interaction", "$active_session", "$construction_sessions", "$browsing_sessions", "$merge_info", "$parsing_mt", "$generation_mt", "$domain_mt", "$domain_interaction_mt", "$scenario_interaction_mt", "$gen_points", "$state" }, rkf_scenario_constructor.$list55, rkf_scenario_constructor.$list56, rkf_scenario_constructor.$sym15$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $sc_state_p$UnaryFunction extends UnaryFunction
    {
        public $sc_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SC-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_scenario_constructor.sc_state_p(arg1);
        }
    }
}

/*

	Total time: 398 ms
	
*/