/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.user_interaction_agenda.*;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-SCENARIO-CONSTRUCTOR
 * source file: /cyc/top/cycl/rkf-scenario-constructor.lisp
 * created:     2019/07/03 17:38:00
 */
public final class rkf_scenario_constructor extends SubLTranslatedFile implements V12 {
    public static final class $sc_state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$interaction;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$active_session;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$construction_sessions;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$browsing_sessions;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$merge_info;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$parsing_mt;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$generation_mt;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$domain_mt;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$domain_interaction_mt;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$scenario_interaction_mt;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$gen_points;
        }

        public SubLObject getField14() {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$state;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$interaction = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$active_session = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$construction_sessions = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$browsing_sessions = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$merge_info = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$parsing_mt = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$generation_mt = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$domain_mt = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$domain_interaction_mt = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$scenario_interaction_mt = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$gen_points = value;
        }

        public SubLObject setField14(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.this.$state = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $interaction = Lisp.NIL;

        public SubLObject $active_session = Lisp.NIL;

        public SubLObject $construction_sessions = Lisp.NIL;

        public SubLObject $browsing_sessions = Lisp.NIL;

        public SubLObject $merge_info = Lisp.NIL;

        public SubLObject $parsing_mt = Lisp.NIL;

        public SubLObject $generation_mt = Lisp.NIL;

        public SubLObject $domain_mt = Lisp.NIL;

        public SubLObject $domain_interaction_mt = Lisp.NIL;

        public SubLObject $scenario_interaction_mt = Lisp.NIL;

        public SubLObject $gen_points = Lisp.NIL;

        public SubLObject $state = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.class, SC_STATE, SC_STATE_P, $list_alt47, $list_alt48, new String[]{ "$id", "$interaction", "$active_session", "$construction_sessions", "$browsing_sessions", "$merge_info", "$parsing_mt", "$generation_mt", "$domain_mt", "$domain_interaction_mt", "$scenario_interaction_mt", "$gen_points", "$state" }, $list_alt49, $list_alt50, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new rkf_scenario_constructor();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_scenario_constructor";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sc_parsing_mt$ = makeSymbol("*SC-PARSING-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sc_semantic_mt$ = makeSymbol("*SC-SEMANTIC-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sc_storage_mt$ = makeSymbol("*SC-STORAGE-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sc_generation_mt$ = makeSymbol("*SC-GENERATION-MT*");

    // deflexical
    /**
     * Lock for controlling modifications to scenario constructor datastructures.
     */
    @LispMethod(comment = "Lock for controlling modifications to scenario constructor datastructures.\ndeflexical")
    private static final SubLSymbol $sc_lock$ = makeSymbol("*SC-LOCK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sc_session$ = makeSymbol("*DTP-SC-SESSION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sc_state$ = makeSymbol("*DTP-SC-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rkf_sc_state_empty_limitations$ = makeSymbol("*RKF-SC-STATE-EMPTY-LIMITATIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sc_rtp_category$ = makeSymbol("*SC-RTP-CATEGORY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sc_rtp_syntactic_mt$ = makeSymbol("*SC-RTP-SYNTACTIC-MT*");









    static private final SubLString $$$Scenario_Constructor_Lock = makeString("Scenario Constructor Lock");

    static private final SubLList $list6 = list(makeSymbol("*SC-LOCK*"));

    public static final SubLSymbol $sc_isg$ = makeSymbol("*SC-ISG*");

    public static final SubLSymbol $sc_index$ = makeSymbol("*SC-INDEX*");

    private static final SubLSymbol SC_SESSION = makeSymbol("SC-SESSION");

    private static final SubLSymbol SC_SESSION_P = makeSymbol("SC-SESSION-P");

    static private final SubLList $list11 = list(makeSymbol("ID"), makeSymbol("STATE"), makeSymbol("PHRASE"), makeSymbol("CANDIDATE-SCENARIOS"), makeSymbol("PERMISSION"), makeSymbol("SCENARIO"), makeSymbol("INTERNAL-STATE"));

    static private final SubLList $list12 = list(makeKeyword("ID"), makeKeyword("STATE"), makeKeyword("PHRASE"), makeKeyword("CANDIDATE-SCENARIOS"), makeKeyword("PERMISSION"), makeKeyword("SCENARIO"), makeKeyword("INTERNAL-STATE"));

    static private final SubLList $list13 = list(makeSymbol("SC-SESSION-ID"), makeSymbol("SC-SESSION-STATE"), makeSymbol("SC-SESSION-PHRASE"), makeSymbol("SC-SESSION-CANDIDATE-SCENARIOS"), makeSymbol("SC-SESSION-PERMISSION"), makeSymbol("SC-SESSION-SCENARIO"), makeSymbol("SC-SESSION-INTERNAL-STATE"));

    static private final SubLList $list14 = list(makeSymbol("_CSETF-SC-SESSION-ID"), makeSymbol("_CSETF-SC-SESSION-STATE"), makeSymbol("_CSETF-SC-SESSION-PHRASE"), makeSymbol("_CSETF-SC-SESSION-CANDIDATE-SCENARIOS"), makeSymbol("_CSETF-SC-SESSION-PERMISSION"), makeSymbol("_CSETF-SC-SESSION-SCENARIO"), makeSymbol("_CSETF-SC-SESSION-INTERNAL-STATE"));

    private static final SubLSymbol SC_SESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SC-SESSION-PRINT-FUNCTION-TRAMPOLINE");

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

    static private final SubLList $list47 = list($EDIT, $VIEW);

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



    private static final SubLSymbol SM_CONSTRAINT_RECORD_P = makeSymbol("SM-CONSTRAINT-RECORD-P");

    private static final SubLSymbol SM_GEN_POINT_WITHOUT_POSITIONS_P = makeSymbol("SM-GEN-POINT-WITHOUT-POSITIONS-P");

    public static final SubLObject sc_parsing_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sc_parsing_mt$.getDynamicValue(thread);
        }
    }

    public static SubLObject sc_parsing_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sc_parsing_mt$.getDynamicValue(thread);
    }

    public static final SubLObject sc_semantic_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sc_semantic_mt$.getDynamicValue(thread);
        }
    }

    public static SubLObject sc_semantic_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sc_semantic_mt$.getDynamicValue(thread);
    }

    public static final SubLObject sc_storage_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sc_storage_mt$.getDynamicValue(thread);
        }
    }

    public static SubLObject sc_storage_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sc_storage_mt$.getDynamicValue(thread);
    }

    public static final SubLObject sc_generation_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sc_generation_mt$.getDynamicValue(thread);
        }
    }

    public static SubLObject sc_generation_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sc_generation_mt$.getDynamicValue(thread);
    }

    public static final SubLObject with_sc_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt6, append(body, NIL));
        }
    }

    public static SubLObject with_sc_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list6, append(body, NIL));
    }

    public static final SubLObject sc_find_session_by_id_alt(SubLObject id) {
        return sc_find_object_by_id(id);
    }

    public static SubLObject sc_find_session_by_id(final SubLObject id) {
        return sc_find_object_by_id(id);
    }

    public static final SubLObject sc_find_session_by_id_string_alt(SubLObject id_string) {
        {
            SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject session = sc_find_session_by_id(id);
            return session;
        }
    }

    public static SubLObject sc_find_session_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject session = sc_find_session_by_id(id);
        return session;
    }

    public static final SubLObject sc_find_state_by_id_alt(SubLObject id) {
        return sc_find_object_by_id(id);
    }

    public static SubLObject sc_find_state_by_id(final SubLObject id) {
        return sc_find_object_by_id(id);
    }

    public static final SubLObject sc_find_state_by_id_string_alt(SubLObject id_string) {
        {
            SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject state = sc_find_state_by_id(id);
            return state;
        }
    }

    public static SubLObject sc_find_state_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject state = sc_find_state_by_id(id);
        return state;
    }

    public static final SubLObject next_sc_id_alt() {
        return integer_sequence_generator.integer_sequence_generator_next($sc_isg$.getGlobalValue());
    }

    public static SubLObject next_sc_id() {
        return integer_sequence_generator.integer_sequence_generator_next($sc_isg$.getGlobalValue());
    }

    public static final SubLObject sc_add_object_alt(SubLObject id, SubLObject v_object) {
        return dictionary.dictionary_enter($sc_index$.getGlobalValue(), id, v_object);
    }

    public static SubLObject sc_add_object(final SubLObject id, final SubLObject v_object) {
        return dictionary.dictionary_enter($sc_index$.getGlobalValue(), id, v_object);
    }

    public static final SubLObject sc_rem_object_alt(SubLObject id) {
        return dictionary.dictionary_remove($sc_index$.getGlobalValue(), id);
    }

    public static SubLObject sc_rem_object(final SubLObject id) {
        return dictionary.dictionary_remove($sc_index$.getGlobalValue(), id);
    }

    public static final SubLObject sc_find_object_by_id_alt(SubLObject id) {
        return dictionary.dictionary_lookup($sc_index$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject sc_find_object_by_id(final SubLObject id) {
        return dictionary.dictionary_lookup($sc_index$.getGlobalValue(), id, UNPROVIDED);
    }

    public static final SubLObject sc_session_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sc_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sc_session_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_session_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sc_session_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_session_native.class ? T : NIL;
    }

    public static final SubLObject sc_session_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.getField2();
    }

    public static SubLObject sc_session_id(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sc_session_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.getField3();
    }

    public static SubLObject sc_session_state(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sc_session_phrase_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.getField4();
    }

    public static SubLObject sc_session_phrase(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject sc_session_candidate_scenarios_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.getField5();
    }

    public static SubLObject sc_session_candidate_scenarios(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject sc_session_permission_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.getField6();
    }

    public static SubLObject sc_session_permission(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject sc_session_scenario_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.getField7();
    }

    public static SubLObject sc_session_scenario(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject sc_session_internal_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.getField8();
    }

    public static SubLObject sc_session_internal_state(final SubLObject v_object) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_sc_session_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sc_session_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sc_session_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sc_session_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sc_session_phrase_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sc_session_phrase(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sc_session_candidate_scenarios_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sc_session_candidate_scenarios(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sc_session_permission_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sc_session_permission(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sc_session_scenario_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sc_session_scenario(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sc_session_internal_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_SESSION_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sc_session_internal_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_session_p(v_object) : "! rkf_scenario_constructor.sc_session_p(v_object) " + "rkf_scenario_constructor.sc_session_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_sc_session_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_session_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_sc_session_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($STATE)) {
                            _csetf_sc_session_state(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PHRASE)) {
                                _csetf_sc_session_phrase(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CANDIDATE_SCENARIOS)) {
                                    _csetf_sc_session_candidate_scenarios(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PERMISSION)) {
                                        _csetf_sc_session_permission(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($SCENARIO)) {
                                            _csetf_sc_session_scenario(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($INTERNAL_STATE)) {
                                                _csetf_sc_session_internal_state(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt38$Invalid_slot__S_for_construction_, current_arg);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_sc_session(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_session_native();
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

    public static final SubLObject sc_new_session_alt(SubLObject state, SubLObject permission, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        {
            SubLObject session = make_sc_session(UNPROVIDED);
            SubLObject id = next_sc_id();
            if (NIL != phrase) {
                sc_set_session_phrase(session, phrase);
            }
            sc_set_session_permission(session, permission);
            {
                SubLObject lock = $sc_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    _csetf_sc_session_state(session, state);
                    _csetf_sc_session_id(session, id);
                    _csetf_sc_session_internal_state(session, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
                    sc_add_object(id, session);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return session;
        }
    }

    public static SubLObject sc_new_session(final SubLObject state, final SubLObject permission, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
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

    public static final SubLObject sc_set_session_phrase_alt(SubLObject session, SubLObject phrase) {
        SubLTrampolineFile.checkType(session, SC_SESSION_P);
        SubLTrampolineFile.checkType(phrase, STRINGP);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_session_phrase(session, phrase);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject sc_set_session_phrase(final SubLObject session, final SubLObject phrase) {
        assert NIL != sc_session_p(session) : "! rkf_scenario_constructor.sc_session_p(session) " + ("rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) ") + session;
        assert NIL != stringp(phrase) : "! stringp(phrase) " + ("Types.stringp(phrase) " + "CommonSymbols.NIL != Types.stringp(phrase) ") + phrase;
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

    public static final SubLObject sc_set_session_permission_alt(SubLObject session, SubLObject permission) {
        if (NIL == subl_promotions.memberP(permission, $list_alt41, UNPROVIDED, UNPROVIDED)) {
            Errors.error($str_alt42$Error___a_is_not_a_known_scenario, permission);
        }
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_session_permission(session, permission);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
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

    public static final SubLObject sc_add_session_candidate_scenarios_alt(SubLObject session, SubLObject scenarios) {
        {
            SubLObject cdolist_list_var = scenarios;
            SubLObject v_scenario = NIL;
            for (v_scenario = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_scenario = cdolist_list_var.first()) {
                sc_add_session_candidate_scenario(session, v_scenario);
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

    public static final SubLObject sc_add_session_candidate_scenario_alt(SubLObject session, SubLObject v_scenario) {
        SubLTrampolineFile.checkType(session, SC_SESSION_P);
        SubLTrampolineFile.checkType(v_scenario, SM_SCENARIO_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = v_scenario;
                    if (NIL == member(item_var, sc_session_candidate_scenarios(session), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_sc_session_candidate_scenarios(session, cons(item_var, sc_session_candidate_scenarios(session)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject sc_add_session_candidate_scenario(final SubLObject session, final SubLObject v_scenario) {
        assert NIL != sc_session_p(session) : "! rkf_scenario_constructor.sc_session_p(session) " + ("rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) ") + session;
        assert NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : "! rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + ("rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) ") + v_scenario;
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

    public static final SubLObject sc_rem_candidate_scenario_alt(SubLObject session, SubLObject v_scenario) {
        SubLTrampolineFile.checkType(session, SC_SESSION_P);
        SubLTrampolineFile.checkType(v_scenario, SM_SCENARIO_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_session_candidate_scenarios(session, remove(v_scenario, sc_session_candidate_scenarios(session), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject sc_rem_candidate_scenario(final SubLObject session, final SubLObject v_scenario) {
        assert NIL != sc_session_p(session) : "! rkf_scenario_constructor.sc_session_p(session) " + ("rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) ") + session;
        assert NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : "! rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + ("rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) ") + v_scenario;
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

    public static final SubLObject sc_set_session_scenario_alt(SubLObject session, SubLObject v_scenario) {
        SubLTrampolineFile.checkType(session, SC_SESSION_P);
        SubLTrampolineFile.checkType(v_scenario, SM_SCENARIO_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_session_scenario(session, v_scenario);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject sc_set_session_scenario(final SubLObject session, final SubLObject v_scenario) {
        assert NIL != sc_session_p(session) : "! rkf_scenario_constructor.sc_session_p(session) " + ("rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) ") + session;
        assert NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : "! rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + ("rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) ") + v_scenario;
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

    public static final SubLObject sc_construction_session_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != sc_session_p(v_object)) && (sc_session_permission(v_object) == $EDIT));
    }

    public static SubLObject sc_construction_session_p(final SubLObject v_object) {
        return makeBoolean((NIL != sc_session_p(v_object)) && (sc_session_permission(v_object) == $EDIT));
    }

    public static final SubLObject sc_browsing_session_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != sc_session_p(v_object)) && (sc_session_permission(v_object) == $VIEW));
    }

    public static SubLObject sc_browsing_session_p(final SubLObject v_object) {
        return makeBoolean((NIL != sc_session_p(v_object)) && (sc_session_permission(v_object) == $VIEW));
    }

    public static final SubLObject sc_cleanup_session_alt(SubLObject session) {
        SubLTrampolineFile.checkType(session, SC_SESSION_P);
        {
            SubLObject id = sc_session_id(session);
            SubLObject v_scenario = sc_session_scenario(session);
            if (NIL != v_scenario) {
                sm_cleanup_scenario(v_scenario);
            }
            {
                SubLObject cdolist_list_var = sc_session_candidate_scenarios(session);
                SubLObject candidate = NIL;
                for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                    sm_cleanup_scenario(candidate);
                }
            }
            return sc_rem_object(id);
        }
    }

    public static SubLObject sc_cleanup_session(final SubLObject session) {
        assert NIL != sc_session_p(session) : "! rkf_scenario_constructor.sc_session_p(session) " + ("rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) ") + session;
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

    public static final SubLObject sc_session_state_lookup_alt(SubLObject session, SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return dictionary.dictionary_lookup(sc_session_internal_state(session), key, v_default);
    }

    public static SubLObject sc_session_state_lookup(final SubLObject session, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return dictionary.dictionary_lookup(sc_session_internal_state(session), key, v_default);
    }

    public static final SubLObject sc_session_state_update_alt(SubLObject session, SubLObject key, SubLObject value) {
        return dictionary.dictionary_enter(sc_session_internal_state(session), key, value);
    }

    public static SubLObject sc_session_state_update(final SubLObject session, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(sc_session_internal_state(session), key, value);
    }

    public static final SubLObject sc_session_state_clear_alt(SubLObject session, SubLObject key) {
        return dictionary.dictionary_remove(sc_session_internal_state(session), key);
    }

    public static SubLObject sc_session_state_clear(final SubLObject session, final SubLObject key) {
        return dictionary.dictionary_remove(sc_session_internal_state(session), key);
    }

    public static final SubLObject sc_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sc_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sc_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sc_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native.class ? T : NIL;
    }

    public static final SubLObject sc_state_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject sc_state_id(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sc_state_interaction_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject sc_state_interaction(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sc_state_active_session_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject sc_state_active_session(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject sc_state_construction_sessions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject sc_state_construction_sessions(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject sc_state_browsing_sessions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject sc_state_browsing_sessions(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject sc_state_merge_info_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject sc_state_merge_info(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject sc_state_parsing_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject sc_state_parsing_mt(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject sc_state_generation_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField9();
    }

    public static SubLObject sc_state_generation_mt(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject sc_state_domain_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField10();
    }

    public static SubLObject sc_state_domain_mt(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject sc_state_domain_interaction_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField11();
    }

    public static SubLObject sc_state_domain_interaction_mt(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject sc_state_scenario_interaction_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField12();
    }

    public static SubLObject sc_state_scenario_interaction_mt(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject sc_state_gen_points_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField13();
    }

    public static SubLObject sc_state_gen_points(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject sc_state_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.getField14();
    }

    public static SubLObject sc_state_state(final SubLObject v_object) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject _csetf_sc_state_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sc_state_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sc_state_interaction_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sc_state_interaction(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sc_state_active_session_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sc_state_active_session(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sc_state_construction_sessions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sc_state_construction_sessions(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sc_state_browsing_sessions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sc_state_browsing_sessions(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sc_state_merge_info_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sc_state_merge_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sc_state_parsing_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sc_state_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_sc_state_generation_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sc_state_generation_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_sc_state_domain_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_sc_state_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_sc_state_domain_interaction_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_sc_state_domain_interaction_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_sc_state_scenario_interaction_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_sc_state_scenario_interaction_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_sc_state_gen_points_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_sc_state_gen_points(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_sc_state_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SC_STATE_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_sc_state_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != sc_state_p(v_object) : "! rkf_scenario_constructor.sc_state_p(v_object) " + "rkf_scenario_constructor.sc_state_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject make_sc_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_sc_state_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($INTERACTION)) {
                            _csetf_sc_state_interaction(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ACTIVE_SESSION)) {
                                _csetf_sc_state_active_session(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CONSTRUCTION_SESSIONS)) {
                                    _csetf_sc_state_construction_sessions(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($BROWSING_SESSIONS)) {
                                        _csetf_sc_state_browsing_sessions(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($MERGE_INFO)) {
                                            _csetf_sc_state_merge_info(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($PARSING_MT)) {
                                                _csetf_sc_state_parsing_mt(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($GENERATION_MT)) {
                                                    _csetf_sc_state_generation_mt(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($DOMAIN_MT)) {
                                                        _csetf_sc_state_domain_mt(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($DOMAIN_INTERACTION_MT)) {
                                                            _csetf_sc_state_domain_interaction_mt(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($SCENARIO_INTERACTION_MT)) {
                                                                _csetf_sc_state_scenario_interaction_mt(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($GEN_POINTS)) {
                                                                    _csetf_sc_state_gen_points(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($STATE)) {
                                                                        _csetf_sc_state_state(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str_alt38$Invalid_slot__S_for_construction_, current_arg);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_sc_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_state_native();
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

    public static final SubLObject sc_new_state_alt() {
        {
            SubLObject state = make_sc_state(UNPROVIDED);
            SubLObject id = next_sc_id();
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_state_id(state, id);
                _csetf_sc_state_state(state, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
                sc_add_object(id, state);
                initialize_sc_state_mts(state);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return state;
        }
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

    public static final SubLObject cleanup_sc_state_alt(SubLObject state) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        {
            SubLObject id = sc_state_id(state);
            SubLObject success = sc_rem_object(id);
            return success;
        }
    }

    public static SubLObject cleanup_sc_state(final SubLObject state) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
        final SubLObject id = sc_state_id(state);
        final SubLObject success = sc_rem_object(id);
        return success;
    }

    public static final SubLObject note_sc_state_interaction_alt(SubLObject state, SubLObject interaction) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_state_interaction(state, interaction);
                initialize_sc_state_mts(state);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject note_sc_state_interaction(final SubLObject state, final SubLObject interaction) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
        assert NIL != user_interaction_agenda.user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
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

    public static final SubLObject sc_add_us_construction_session_alt(SubLObject state, SubLObject session) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        SubLTrampolineFile.checkType(session, SC_CONSTRUCTION_SESSION_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = session;
                    if (NIL == member(item_var, sc_state_construction_sessions(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_sc_state_construction_sessions(state, cons(item_var, sc_state_construction_sessions(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject sc_add_us_construction_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
        assert NIL != sc_construction_session_p(session) : "! rkf_scenario_constructor.sc_construction_session_p(session) " + ("rkf_scenario_constructor.sc_construction_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_construction_session_p(session) ") + session;
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

    public static final SubLObject retire_sc_us_construction_session_alt(SubLObject state, SubLObject session) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        SubLTrampolineFile.checkType(session, SC_CONSTRUCTION_SESSION_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_state_construction_sessions(state, remove(session, sc_state_construction_sessions(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                sc_cleanup_session(session);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject retire_sc_us_construction_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
        assert NIL != sc_construction_session_p(session) : "! rkf_scenario_constructor.sc_construction_session_p(session) " + ("rkf_scenario_constructor.sc_construction_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_construction_session_p(session) ") + session;
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

    public static final SubLObject deactivate_and_retire_sc_us_construction_session_alt(SubLObject state, SubLObject session) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        SubLTrampolineFile.checkType(session, SC_CONSTRUCTION_SESSION_P);
        deactivate_active_sc_session(state);
        retire_sc_us_construction_session(state, session);
        return NIL;
    }

    public static SubLObject deactivate_and_retire_sc_us_construction_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
        assert NIL != sc_construction_session_p(session) : "! rkf_scenario_constructor.sc_construction_session_p(session) " + ("rkf_scenario_constructor.sc_construction_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_construction_session_p(session) ") + session;
        deactivate_active_sc_session(state);
        retire_sc_us_construction_session(state, session);
        return NIL;
    }

    public static final SubLObject sc_add_us_browsing_session_alt(SubLObject state, SubLObject session) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        SubLTrampolineFile.checkType(session, SC_BROWSING_SESSION_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = session;
                    if (NIL == member(item_var, sc_state_browsing_sessions(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_sc_state_browsing_sessions(state, cons(item_var, sc_state_browsing_sessions(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject sc_add_us_browsing_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
        assert NIL != sc_browsing_session_p(session) : "! rkf_scenario_constructor.sc_browsing_session_p(session) " + ("rkf_scenario_constructor.sc_browsing_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_browsing_session_p(session) ") + session;
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

    public static final SubLObject retire_sc_us_browsing_session_alt(SubLObject state, SubLObject session) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        SubLTrampolineFile.checkType(session, SC_BROWSING_SESSION_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_state_browsing_sessions(state, remove(session, sc_state_browsing_sessions(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                sc_cleanup_session(session);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject retire_sc_us_browsing_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
        assert NIL != sc_browsing_session_p(session) : "! rkf_scenario_constructor.sc_browsing_session_p(session) " + ("rkf_scenario_constructor.sc_browsing_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_browsing_session_p(session) ") + session;
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

    public static final SubLObject sc_activate_session_alt(SubLObject state, SubLObject session) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        SubLTrampolineFile.checkType(session, SC_SESSION_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_state_active_session(state, session);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject sc_activate_session(final SubLObject state, final SubLObject session) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
        assert NIL != sc_session_p(session) : "! rkf_scenario_constructor.sc_session_p(session) " + ("rkf_scenario_constructor.sc_session_p(session) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_session_p(session) ") + session;
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

    public static final SubLObject deactivate_active_sc_session_alt(SubLObject state) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_state_active_session(state, NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject deactivate_active_sc_session(final SubLObject state) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
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

    public static final SubLObject sc_set_state_merge_info_alt(SubLObject state, SubLObject merge_info) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        SubLTrampolineFile.checkType(merge_info, SM_MERGE_INFO_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_state_merge_info(state, merge_info);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject sc_set_state_merge_info(final SubLObject state, final SubLObject merge_info) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
        assert NIL != rkf_scenario_manipulator.sm_merge_info_p(merge_info) : "! rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + ("rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_merge_info_p(merge_info) ") + merge_info;
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

    public static final SubLObject sc_rem_state_merge_info_alt(SubLObject state) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        {
            SubLObject merge_info = sc_state_merge_info(state);
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_state_merge_info(state, NIL);
                sm_cleanup_merge_info(merge_info);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject sc_rem_state_merge_info(final SubLObject state) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
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

    public static final SubLObject initialize_sc_state_mts_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(state, SC_STATE_P);
            {
                SubLObject interaction = sc_state_interaction(state);
                SubLObject lock = $sc_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != user_interaction_p(interaction)) {
                        {
                            SubLObject v_agenda = ui_agenda(interaction);
                            SubLObject scenario_interaction_mt = uia_ensure_scenario_interaction_mt(v_agenda);
                            _csetf_sc_state_parsing_mt(state, uia_parsing_interaction_mt(v_agenda));
                            _csetf_sc_state_generation_mt(state, uia_generation_interaction_mt(v_agenda, UNPROVIDED));
                            _csetf_sc_state_domain_mt(state, uia_domain_mt(v_agenda));
                            _csetf_sc_state_domain_interaction_mt(state, uia_domain_interaction_mt(v_agenda));
                            _csetf_sc_state_scenario_interaction_mt(state, scenario_interaction_mt);
                        }
                    } else {
                        _csetf_sc_state_parsing_mt(state, $sc_parsing_mt$.getDynamicValue(thread));
                        _csetf_sc_state_generation_mt(state, $sc_generation_mt$.getDynamicValue(thread));
                        _csetf_sc_state_domain_mt(state, $sc_semantic_mt$.getDynamicValue(thread));
                        _csetf_sc_state_domain_interaction_mt(state, $sc_storage_mt$.getDynamicValue(thread));
                        _csetf_sc_state_scenario_interaction_mt(state, $$ScenarioDescriptionMt);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return state;
        }
    }

    public static SubLObject initialize_sc_state_mts(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
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

    public static final SubLObject sc_set_state_gen_points_alt(SubLObject state, SubLObject gen_points) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        SubLTrampolineFile.checkType(gen_points, LISTP);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_state_gen_points(state, gen_points);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject sc_set_state_gen_points(final SubLObject state, final SubLObject gen_points) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
        assert NIL != listp(gen_points) : "! listp(gen_points) " + ("Types.listp(gen_points) " + "CommonSymbols.NIL != Types.listp(gen_points) ") + gen_points;
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

    public static final SubLObject sc_clear_state_gen_points_alt(SubLObject state) {
        SubLTrampolineFile.checkType(state, SC_STATE_P);
        {
            SubLObject lock = $sc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_sc_state_gen_points(state, NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject sc_clear_state_gen_points(final SubLObject state) {
        assert NIL != sc_state_p(state) : "! rkf_scenario_constructor.sc_state_p(state) " + ("rkf_scenario_constructor.sc_state_p(state) " + "CommonSymbols.NIL != rkf_scenario_constructor.sc_state_p(state) ") + state;
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

    public static final SubLObject sc_state_active_scenario_alt(SubLObject state) {
        {
            SubLObject session = sc_state_active_session(state);
            return sc_session_scenario(session);
        }
    }

    public static SubLObject sc_state_active_scenario(final SubLObject state) {
        final SubLObject session = sc_state_active_session(state);
        return sc_session_scenario(session);
    }

    /**
     * The active scenario is incomplete if it lacks constraints.
     */
    @LispMethod(comment = "The active scenario is incomplete if it lacks constraints.")
    public static final SubLObject sc_state_active_scenario_incomplete_alt(SubLObject state) {
        {
            SubLObject v_scenario = sc_state_active_scenario(state);
            return sublisp_null(sm_scenario_constraints(v_scenario));
        }
    }

    @LispMethod(comment = "The active scenario is incomplete if it lacks constraints.")
    public static SubLObject sc_state_active_scenario_incomplete(final SubLObject state) {
        final SubLObject v_scenario = sc_state_active_scenario(state);
        return sublisp_null(rkf_scenario_manipulator.sm_scenario_constraints(v_scenario));
    }

    public static final SubLObject sc_state_current_act_alt(SubLObject state) {
        {
            SubLObject interaction = sc_state_interaction(state);
            SubLObject act = ui_state_lookup(interaction, $SC_ACT, UNPROVIDED);
            if (NIL != act) {
                return act;
            }
            if (NIL != sc_state_merge_info(state)) {
                return $MERGE;
            } else {
                if (NIL != sc_state_gen_points(state)) {
                    return $GENERALIZE;
                } else {
                    if (NIL != ui_state_lookup(interaction, $CONSTRAINT_SENTENCE, NIL)) {
                        return $PARSE_CONSTRAINT;
                    } else {
                        if (NIL != ui_state_lookup(interaction, $INDEXICAL_PHRASE, NIL)) {
                            return $PARSE_TERM;
                        } else {
                            if (NIL != ui_state_lookup(interaction, $SCENARIO_PHRASE, NIL)) {
                                return $PARSE_SCENARIO;
                            } else {
                                if (NIL == sc_state_active_session(state)) {
                                    return $OPEN;
                                } else {
                                    return $CONSTRUCT;
                                }
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject sc_state_update_alt(SubLObject sc_state, SubLObject key, SubLObject value) {
        return dictionary.dictionary_enter(sc_state_state(sc_state), key, value);
    }

    public static SubLObject sc_state_update(final SubLObject sc_state, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(sc_state_state(sc_state), key, value);
    }

    public static final SubLObject sc_state_lookup_alt(SubLObject sc_state, SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return dictionary.dictionary_lookup(sc_state_state(sc_state), key, v_default);
    }

    public static SubLObject sc_state_lookup(final SubLObject sc_state, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return dictionary.dictionary_lookup(sc_state_state(sc_state), key, v_default);
    }

    public static final SubLObject sc_state_clear_alt(SubLObject sc_state, SubLObject key) {
        return dictionary.dictionary_remove(sc_state_state(sc_state), key);
    }

    public static SubLObject sc_state_clear(final SubLObject sc_state, final SubLObject key) {
        return dictionary.dictionary_remove(sc_state_state(sc_state), key);
    }

    public static final SubLObject rkf_sc_new_limitations_alt() {
        return NIL;
    }

    public static SubLObject rkf_sc_new_limitations() {
        return NIL;
    }

    public static final SubLObject rkf_sc_add_limitation_alt(SubLObject limitations, SubLObject key, SubLObject value) {
        if (NIL == limitations) {
            return list(key, value);
        } else {
            return putf(limitations, key, value);
        }
    }

    public static SubLObject rkf_sc_add_limitation(final SubLObject limitations, final SubLObject key, final SubLObject value) {
        if (NIL == limitations) {
            return list(key, value);
        }
        return putf(limitations, key, value);
    }

    public static final SubLObject rkf_sc_get_limitation_alt(SubLObject limitations, SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(limitations, key, v_default);
    }

    public static SubLObject rkf_sc_get_limitation(final SubLObject limitations, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(limitations, key, v_default);
    }

    public static final SubLObject sc_state_note_limitations_alt(SubLObject sc_state, SubLObject limitations) {
        return sc_state_update(sc_state, $LIMITATIONS, limitations);
    }

    public static SubLObject sc_state_note_limitations(final SubLObject sc_state, final SubLObject limitations) {
        return sc_state_update(sc_state, $LIMITATIONS, limitations);
    }

    public static final SubLObject sc_state_get_limitations_alt(SubLObject sc_state) {
        return sc_state_lookup(sc_state, $LIMITATIONS, $rkf_sc_state_empty_limitations$.getGlobalValue());
    }

    public static SubLObject sc_state_get_limitations(final SubLObject sc_state) {
        return sc_state_lookup(sc_state, $LIMITATIONS, $rkf_sc_state_empty_limitations$.getGlobalValue());
    }

    public static final SubLObject sc_concept_harvester_alt(SubLObject string, SubLObject category, SubLObject syntactic_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = rkf_concept_harvester.$rkf_ch_template_parses_method$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $sc_rtp_category$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $sc_rtp_syntactic_mt$.currentBinding(thread);
                    try {
                        rkf_concept_harvester.$rkf_ch_template_parses_method$.bind(SC_ITP_SEQUEL, thread);
                        parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
                        $sc_rtp_category$.bind(category, thread);
                        $sc_rtp_syntactic_mt$.bind(syntactic_mt, thread);
                        result = rkf_concept_harvester.rkf_concept_harvester(string);
                    } finally {
                        $sc_rtp_syntactic_mt$.rebind(_prev_bind_3, thread);
                        $sc_rtp_category$.rebind(_prev_bind_2, thread);
                        parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_1, thread);
                        rkf_concept_harvester.$rkf_ch_template_parses_method$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
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

    public static final SubLObject sc_itp_sequel_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return iterative_template_parser.rtp_parse_exp(string, $sc_rtp_category$.getDynamicValue(thread), $sc_rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject sc_itp_sequel(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return iterative_template_parser.rtp_parse_exp(string, $sc_rtp_category$.getDynamicValue(thread), $sc_rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     *
     *
     * @return sc-state-p
    Generate a new state with no sessions, and return it.
     */
    @LispMethod(comment = "@return sc-state-p\r\nGenerate a new state with no sessions, and return it.")
    public static final SubLObject sc_act_new_state_alt() {
        {
            SubLObject state = sc_new_state();
            return state;
        }
    }

    /**
     *
     *
     * @return sc-state-p
    Generate a new state with no sessions, and return it.
     */
    @LispMethod(comment = "@return sc-state-p\r\nGenerate a new state with no sessions, and return it.")
    public static SubLObject sc_act_new_state() {
        final SubLObject state = sc_new_state();
        return state;
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param SESSION
    sc-session-p
     * 		
     * @param PHRASE
    stringp
     * 		
     * @return sc-session-p
    Given a scenario-describing string (PHRASE) input by the interaction of STATE,
    initialize a new scenario for SESSION.  This should be called if we fail to
    find a stored scenario matching PHRASE.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param SESSION\nsc-session-p\r\n\t\t\r\n@param PHRASE\nstringp\r\n\t\t\r\n@return sc-session-p\r\nGiven a scenario-describing string (PHRASE) input by the interaction of STATE,\r\ninitialize a new scenario for SESSION.  This should be called if we fail to\r\nfind a stored scenario matching PHRASE.")
    public static final SubLObject sc_act_initialize_scenario_alt(SubLObject state, SubLObject session, SubLObject phrase) {
        {
            SubLObject v_scenario = sm_new_scenario(phrase, NIL, session);
            _csetf_sc_session_scenario(session, v_scenario);
            return session;
        }
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param SESSION
    sc-session-p
     * 		
     * @param PHRASE
    stringp
     * 		
     * @return sc-session-p
    Given a scenario-describing string (PHRASE) input by the interaction of STATE,
    initialize a new scenario for SESSION.  This should be called if we fail to
    find a stored scenario matching PHRASE.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param SESSION\nsc-session-p\r\n\t\t\r\n@param PHRASE\nstringp\r\n\t\t\r\n@return sc-session-p\r\nGiven a scenario-describing string (PHRASE) input by the interaction of STATE,\r\ninitialize a new scenario for SESSION.  This should be called if we fail to\r\nfind a stored scenario matching PHRASE.")
    public static SubLObject sc_act_initialize_scenario(final SubLObject state, final SubLObject session, final SubLObject phrase) {
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_new_scenario(phrase, NIL, session);
        _csetf_sc_session_scenario(session, v_scenario);
        return session;
    }

    /**
     *
     *
     * @param PHRASE
    stringp
     * 		
     * @return sc-state-p
    Given a phrase, generate a new state with a construction session with PHRASE,
    and return the state.
     */
    @LispMethod(comment = "@param PHRASE\nstringp\r\n\t\t\r\n@return sc-state-p\r\nGiven a phrase, generate a new state with a construction session with PHRASE,\r\nand return the state.")
    public static final SubLObject sc_act_new_state_with_phrase_alt(SubLObject phrase) {
        {
            SubLObject state = sc_new_state();
            SubLObject session = sc_act_initialize_construction_session(state, phrase);
            SubLObject candidate_scenarios = NIL;
            if (NIL == candidate_scenarios) {
                {
                    SubLObject v_scenario = sm_new_scenario(phrase, NIL, session);
                    _csetf_sc_session_scenario(session, v_scenario);
                }
            }
            return state;
        }
    }

    /**
     *
     *
     * @param PHRASE
    stringp
     * 		
     * @return sc-state-p
    Given a phrase, generate a new state with a construction session with PHRASE,
    and return the state.
     */
    @LispMethod(comment = "@param PHRASE\nstringp\r\n\t\t\r\n@return sc-state-p\r\nGiven a phrase, generate a new state with a construction session with PHRASE,\r\nand return the state.")
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

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param PHRASE
     * 		stringp
     * 		Generate a new session for STATE and make it active.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param PHRASE\r\n\t\tstringp\r\n\t\tGenerate a new session for STATE and make it active.")
    public static final SubLObject sc_act_initialize_construction_session_alt(SubLObject state, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        {
            SubLObject session = sc_new_session(state, $EDIT, phrase);
            sc_add_us_construction_session(state, session);
            sc_activate_session(state, session);
            return session;
        }
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param PHRASE
     * 		stringp
     * 		Generate a new session for STATE and make it active.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param PHRASE\r\n\t\tstringp\r\n\t\tGenerate a new session for STATE and make it active.")
    public static SubLObject sc_act_initialize_construction_session(final SubLObject state, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        final SubLObject session = sc_new_session(state, $EDIT, phrase);
        sc_add_us_construction_session(state, session);
        sc_activate_session(state, session);
        return session;
    }

    /**
     *
     *
     * @param SCENARIO
    sm-scenario-p
     * 		
     * @param PHRASE
     * 		stringp
     * 		Generate a new STATE, give it a construction session with SCENARIO, and set the phrase
     * 		to PHRASE (if present).
     */
    @LispMethod(comment = "@param SCENARIO\nsm-scenario-p\r\n\t\t\r\n@param PHRASE\r\n\t\tstringp\r\n\t\tGenerate a new STATE, give it a construction session with SCENARIO, and set the phrase\r\n\t\tto PHRASE (if present).")
    public static final SubLObject sc_act_new_state_with_construction_scenario_alt(SubLObject v_scenario, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        {
            SubLObject state = sc_new_state();
            SubLObject session = sc_new_session(state, $EDIT, phrase);
            sc_set_session_scenario(session, v_scenario);
            sc_add_us_construction_session(state, session);
            sc_activate_session(state, session);
            return state;
        }
    }

    /**
     *
     *
     * @param SCENARIO
    sm-scenario-p
     * 		
     * @param PHRASE
     * 		stringp
     * 		Generate a new STATE, give it a construction session with SCENARIO, and set the phrase
     * 		to PHRASE (if present).
     */
    @LispMethod(comment = "@param SCENARIO\nsm-scenario-p\r\n\t\t\r\n@param PHRASE\r\n\t\tstringp\r\n\t\tGenerate a new STATE, give it a construction session with SCENARIO, and set the phrase\r\n\t\tto PHRASE (if present).")
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

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param SCENARIO
    sm-scenario-p
     * 		
     * @return sc-session-p
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param SCENARIO\nsm-scenario-p\r\n\t\t\r\n@return sc-session-p")
    public static final SubLObject sc_act_set_session_scenario_alt(SubLObject session, SubLObject v_scenario) {
        return sc_set_session_scenario(session, v_scenario);
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param SCENARIO
    sm-scenario-p
     * 		
     * @return sc-session-p
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param SCENARIO\nsm-scenario-p\r\n\t\t\r\n@return sc-session-p")
    public static SubLObject sc_act_set_session_scenario(final SubLObject session, final SubLObject v_scenario) {
        return sc_set_session_scenario(session, v_scenario);
    }

    /**
     *
     *
     * @param state
    sc-state-p
     * 		
     * @param SCENARIO-SPEC
    sm-scenario-spec-p
     * 		
     * @return sm-scenario-p
     */
    @LispMethod(comment = "@param state\nsc-state-p\r\n\t\t\r\n@param SCENARIO-SPEC\nsm-scenario-spec-p\r\n\t\t\r\n@return sm-scenario-p")
    public static final SubLObject sc_act_read_scenario_alt(SubLObject state, SubLObject scenario_spec, SubLObject phrase) {
        {
            SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
            return sm_act_read_scenario(scenario_spec, phrase, domain_interaction_mt);
        }
    }

    /**
     *
     *
     * @param state
    sc-state-p
     * 		
     * @param SCENARIO-SPEC
    sm-scenario-spec-p
     * 		
     * @return sm-scenario-p
     */
    @LispMethod(comment = "@param state\nsc-state-p\r\n\t\t\r\n@param SCENARIO-SPEC\nsm-scenario-spec-p\r\n\t\t\r\n@return sm-scenario-p")
    public static SubLObject sc_act_read_scenario(final SubLObject state, final SubLObject scenario_spec, final SubLObject phrase) {
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        return rkf_scenario_manipulator.sm_act_read_scenario(scenario_spec, phrase, domain_interaction_mt);
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param PHRASE
    stringp
     * 		
     * @return list of <sm-scenario-p>
    Parses PHRASE in an attempt to retrieve stored scenarios.  Returns a list of
    candidate scenarios.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param PHRASE\nstringp\r\n\t\t\r\n@return list of <sm-scenario-p>\r\nParses PHRASE in an attempt to retrieve stored scenarios.  Returns a list of\r\ncandidate scenarios.")
    public static final SubLObject sc_act_suggest_scenarios_alt(SubLObject state, SubLObject phrase) {
        {
            SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
            SubLObject parsing_mt = sc_state_parsing_mt(state);
            SubLObject scenario_expression = sc_act_determine_scenario_expression(state, phrase);
            if (NIL != scenario_expression) {
                {
                    SubLObject v_scenario = sc_act_initialize_scenario_from_expression(state, scenario_expression, phrase);
                    return list(v_scenario);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param PHRASE
    stringp
     * 		
     * @return list of <sm-scenario-p>
    Parses PHRASE in an attempt to retrieve stored scenarios.  Returns a list of
    candidate scenarios.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param PHRASE\nstringp\r\n\t\t\r\n@return list of <sm-scenario-p>\r\nParses PHRASE in an attempt to retrieve stored scenarios.  Returns a list of\r\ncandidate scenarios.")
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

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param PHRASE
    stringp
     * 		
     * @return <sm-scenario-expression-p>
    Parses PHRASE in an attempt to retrieve stored scenarios.  Returns a single scenario expression.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param PHRASE\nstringp\r\n\t\t\r\n@return <sm-scenario-expression-p>\r\nParses PHRASE in an attempt to retrieve stored scenarios.  Returns a single scenario expression.")
    public static final SubLObject sc_act_determine_scenario_expression_alt(SubLObject state, SubLObject phrase) {
        {
            SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
            SubLObject parsing_mt = sc_state_parsing_mt(state);
            return sc_determine_scenario_expression_int(phrase, parsing_mt, domain_interaction_mt);
        }
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param PHRASE
    stringp
     * 		
     * @return <sm-scenario-expression-p>
    Parses PHRASE in an attempt to retrieve stored scenarios.  Returns a single scenario expression.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param PHRASE\nstringp\r\n\t\t\r\n@return <sm-scenario-expression-p>\r\nParses PHRASE in an attempt to retrieve stored scenarios.  Returns a single scenario expression.")
    public static SubLObject sc_act_determine_scenario_expression(final SubLObject state, final SubLObject phrase) {
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        return sc_determine_scenario_expression_int(phrase, parsing_mt, domain_interaction_mt);
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param SCENARIO-EXPRESSION
    sm-scenario-expression-p
     * 		
     * @param PHRASE
     * 		stringp or NIL
     * @return <sm-scenario-p>
    Use information in SCENARIO-EXPRESSION and the mt context of STATE to initialize a new
    scenario datastructure that uses PHRASE.  Returns this initialized scenario.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param SCENARIO-EXPRESSION\nsm-scenario-expression-p\r\n\t\t\r\n@param PHRASE\r\n\t\tstringp or NIL\r\n@return <sm-scenario-p>\r\nUse information in SCENARIO-EXPRESSION and the mt context of STATE to initialize a new\r\nscenario datastructure that uses PHRASE.  Returns this initialized scenario.")
    public static final SubLObject sc_act_initialize_scenario_from_expression_alt(SubLObject state, SubLObject scenario_expression, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        {
            SubLObject scenario_interaction_mt = sc_state_scenario_interaction_mt(state);
            SubLObject scenario_parsing_mt = sc_state_parsing_mt(state);
            return sm_act_initialize_scenario_from_expression(scenario_expression, phrase, scenario_interaction_mt, scenario_parsing_mt);
        }
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param SCENARIO-EXPRESSION
    sm-scenario-expression-p
     * 		
     * @param PHRASE
     * 		stringp or NIL
     * @return <sm-scenario-p>
    Use information in SCENARIO-EXPRESSION and the mt context of STATE to initialize a new
    scenario datastructure that uses PHRASE.  Returns this initialized scenario.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param SCENARIO-EXPRESSION\nsm-scenario-expression-p\r\n\t\t\r\n@param PHRASE\r\n\t\tstringp or NIL\r\n@return <sm-scenario-p>\r\nUse information in SCENARIO-EXPRESSION and the mt context of STATE to initialize a new\r\nscenario datastructure that uses PHRASE.  Returns this initialized scenario.")
    public static SubLObject sc_act_initialize_scenario_from_expression(final SubLObject state, final SubLObject scenario_expression, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        final SubLObject scenario_interaction_mt = sc_state_scenario_interaction_mt(state);
        final SubLObject scenario_parsing_mt = sc_state_parsing_mt(state);
        return rkf_scenario_manipulator.sm_act_initialize_scenario_from_expression(scenario_expression, phrase, scenario_interaction_mt, scenario_parsing_mt);
    }

    public static final SubLObject sc_determine_scenario_expression_int_alt(SubLObject phrase, SubLObject parsing_mt, SubLObject domain_interaction_mt) {
        {
            SubLObject candidates = sm_extract_candidate_scenario_expressions(phrase, parsing_mt, domain_interaction_mt);
            SubLObject scenario_expression = candidates.first();
            return scenario_expression;
        }
    }

    public static SubLObject sc_determine_scenario_expression_int(final SubLObject phrase, final SubLObject parsing_mt, final SubLObject domain_interaction_mt) {
        final SubLObject candidates = rkf_scenario_manipulator.sm_extract_candidate_scenario_expressions(phrase, parsing_mt, domain_interaction_mt);
        final SubLObject scenario_expression = candidates.first();
        return scenario_expression;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-PHRASE
    stringp
     * 		
     * @return list of <collection-in-any-mt?>
    Parse INDEXICAL-PHRASE, and return a list of collections the phrase can denote.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-PHRASE\nstringp\r\n\t\t\r\n@return list of <collection-in-any-mt?>\r\nParse INDEXICAL-PHRASE, and return a list of collections the phrase can denote.")
    public static final SubLObject sc_act_suggest_new_indexical_type_alt(SubLObject session, SubLObject indexical_phrase) {
        {
            SubLObject state = sc_session_state(session);
            SubLObject parsing_mt = sc_state_parsing_mt(state);
            SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
            return sm_act_suggest_new_indexical_type(indexical_phrase, parsing_mt, domain_interaction_mt);
        }
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-PHRASE
    stringp
     * 		
     * @return list of <collection-in-any-mt?>
    Parse INDEXICAL-PHRASE, and return a list of collections the phrase can denote.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-PHRASE\nstringp\r\n\t\t\r\n@return list of <collection-in-any-mt?>\r\nParse INDEXICAL-PHRASE, and return a list of collections the phrase can denote.")
    public static SubLObject sc_act_suggest_new_indexical_type(final SubLObject session, final SubLObject indexical_phrase) {
        final SubLObject state = sc_session_state(session);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        return rkf_scenario_manipulator.sm_act_suggest_new_indexical_type(indexical_phrase, parsing_mt, domain_interaction_mt);
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-PHRASE
    stringp
     * 		
     * @param MANY-ISAS
     * 		LIST of COLLECTION-IN-ANY-MT
     * @param MANY-GENLS
     * 		LIST pf collection-in-any-mt
     * @return sc-session-p

    Perform the addition of multiple new indexical sessions.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-PHRASE\nstringp\r\n\t\t\r\n@param MANY-ISAS\r\n\t\tLIST of COLLECTION-IN-ANY-MT\r\n@param MANY-GENLS\r\n\t\tLIST pf collection-in-any-mt\r\n@return sc-session-p\r\n\r\nPerform the addition of multiple new indexical sessions.")
    public static final SubLObject sc_act_add_new_indexical_multiple_alt(SubLObject session, SubLObject indexical_phrase, SubLObject many_isas, SubLObject many_genls) {
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        {
            SubLObject v_scenario = sc_session_scenario(session);
            SubLObject indexical_isas = NIL;
            SubLObject indexical_genls = NIL;
            {
                SubLObject cdolist_list_var = many_isas;
                SubLObject v_isa = NIL;
                for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                    if (NIL != el_formula_p(v_isa)) {
                        v_isa = narts_high.find_nart(v_isa);
                    }
                    indexical_isas = cons(v_isa, indexical_isas);
                }
            }
            {
                SubLObject cdolist_list_var = many_genls;
                SubLObject genl = NIL;
                for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                    if (NIL != el_formula_p(genl)) {
                        genl = narts_high.find_nart(genl);
                    }
                    indexical_genls = cons(genl, indexical_genls);
                }
            }
            sm_act_add_new_indexical(v_scenario, indexical_phrase, indexical_isas, indexical_genls);
        }
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-PHRASE
    stringp
     * 		
     * @param MANY-ISAS
     * 		LIST of COLLECTION-IN-ANY-MT
     * @param MANY-GENLS
     * 		LIST pf collection-in-any-mt
     * @return sc-session-p

    Perform the addition of multiple new indexical sessions.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-PHRASE\nstringp\r\n\t\t\r\n@param MANY-ISAS\r\n\t\tLIST of COLLECTION-IN-ANY-MT\r\n@param MANY-GENLS\r\n\t\tLIST pf collection-in-any-mt\r\n@return sc-session-p\r\n\r\nPerform the addition of multiple new indexical sessions.")
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

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-PHRASE
    stringp
     * 		
     * @param INDEXICAL-ISA
    collection-in-any-mt
     * 		
     * @param INDEXICAL-GENLS
    collection-in-any-mt
     * 		
     * @return sc-session-p

    Find or create an indexical, bundle it with INDEXICAL-PHRASE
    into an indexical record, record INDEXICAL-ISA INDEXICAL-GENLS,
    and record the indexical record on the scenario for SESSION.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-PHRASE\nstringp\r\n\t\t\r\n@param INDEXICAL-ISA\ncollection-in-any-mt\r\n\t\t\r\n@param INDEXICAL-GENLS\ncollection-in-any-mt\r\n\t\t\r\n@return sc-session-p\r\n\r\nFind or create an indexical, bundle it with INDEXICAL-PHRASE\r\ninto an indexical record, record INDEXICAL-ISA INDEXICAL-GENLS,\r\nand record the indexical record on the scenario for SESSION.")
    public static final SubLObject sc_act_add_new_indexical_alt(SubLObject session, SubLObject indexical_phrase, SubLObject indexical_isa, SubLObject indexical_genls) {
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        {
            SubLObject v_scenario = sc_session_scenario(session);
            if (NIL != el_formula_p(indexical_isa)) {
                indexical_isa = narts_high.find_nart(indexical_isa);
            }
            if (NIL != el_formula_p(indexical_genls)) {
                indexical_genls = narts_high.find_nart(indexical_genls);
            }
            sm_act_add_new_indexical(v_scenario, indexical_phrase, indexical_isa, indexical_genls);
        }
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-PHRASE
    stringp
     * 		
     * @param INDEXICAL-ISA
    collection-in-any-mt
     * 		
     * @param INDEXICAL-GENLS
    collection-in-any-mt
     * 		
     * @return sc-session-p

    Find or create an indexical, bundle it with INDEXICAL-PHRASE
    into an indexical record, record INDEXICAL-ISA INDEXICAL-GENLS,
    and record the indexical record on the scenario for SESSION.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-PHRASE\nstringp\r\n\t\t\r\n@param INDEXICAL-ISA\ncollection-in-any-mt\r\n\t\t\r\n@param INDEXICAL-GENLS\ncollection-in-any-mt\r\n\t\t\r\n@return sc-session-p\r\n\r\nFind or create an indexical, bundle it with INDEXICAL-PHRASE\r\ninto an indexical record, record INDEXICAL-ISA INDEXICAL-GENLS,\r\nand record the indexical record on the scenario for SESSION.")
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

    /**
     * Retrieve the indexical identified by the given phrase.
     */
    @LispMethod(comment = "Retrieve the indexical identified by the given phrase.")
    public static final SubLObject sc_act_find_indexical_alt(SubLObject session, SubLObject indexical_phrase) {
        {
            SubLObject v_scenario = sc_session_scenario(session);
            return sm_act_find_indexical(v_scenario, indexical_phrase, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Retrieve the indexical identified by the given phrase.")
    public static SubLObject sc_act_find_indexical(final SubLObject session, final SubLObject indexical_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        return rkf_scenario_manipulator.sm_act_find_indexical(v_scenario, indexical_phrase, UNPROVIDED);
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @return sc-session-p
    Remove INDEXICAL-RECORD from SESSION's scenario.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@return sc-session-p\r\nRemove INDEXICAL-RECORD from SESSION\'s scenario.")
    public static final SubLObject sc_act_remove_indexical_alt(SubLObject session, SubLObject indexical_record) {
        {
            SubLObject v_scenario = sc_session_scenario(session);
            SubLObject state = sc_session_state(session);
            SubLObject mt = sc_state_domain_interaction_mt(state);
            sm_act_remove_indexical(v_scenario, indexical_record, mt);
        }
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @return sc-session-p
    Remove INDEXICAL-RECORD from SESSION's scenario.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@return sc-session-p\r\nRemove INDEXICAL-RECORD from SESSION\'s scenario.")
    public static SubLObject sc_act_remove_indexical(final SubLObject session, final SubLObject indexical_record) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_remove_indexical(v_scenario, indexical_record, mt);
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        return session;
    }

    public static final SubLObject sc_act_suggest_differences_alt(SubLObject session, SubLObject indexical) {
        {
            SubLObject v_scenario = sc_session_scenario(session);
            SubLObject state = sc_session_state(session);
            SubLObject mt = sc_state_domain_interaction_mt(state);
            SubLObject results = NIL;
            results = sm_act_suggest_differences(v_scenario, indexical, mt);
            return results;
        }
    }

    public static SubLObject sc_act_suggest_differences(final SubLObject session, final SubLObject indexical) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject mt = sc_state_domain_interaction_mt(state);
        SubLObject results = NIL;
        results = rkf_scenario_manipulator.sm_act_suggest_differences(v_scenario, indexical, mt);
        return results;
    }

    public static final SubLObject sc_act_distinguish_indexicals_alt(SubLObject session, SubLObject indexical_a, SubLObject indexical_b) {
        {
            SubLObject v_scenario = sc_session_scenario(session);
            SubLObject state = sc_session_state(session);
            SubLObject mt = sc_state_domain_interaction_mt(state);
            sm_act_distinguish_indexicals(v_scenario, indexical_a, indexical_b, mt);
        }
        return session;
    }

    public static SubLObject sc_act_distinguish_indexicals(final SubLObject session, final SubLObject indexical_a, final SubLObject indexical_b) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_distinguish_indexicals(v_scenario, indexical_a, indexical_b, mt);
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @param INDEXICAL-PHRASE
    stringp
     * 		
     * @return sc-session-p
    Add INDEXICAL-PHRASE as another phrase on INDEXICAL-RECORD in SESSION's scenario.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@param INDEXICAL-PHRASE\nstringp\r\n\t\t\r\n@return sc-session-p\r\nAdd INDEXICAL-PHRASE as another phrase on INDEXICAL-RECORD in SESSION\'s scenario.")
    public static final SubLObject sc_act_add_indexical_phrase_alt(SubLObject session, SubLObject indexical_record, SubLObject indexical_phrase) {
        {
            SubLObject v_scenario = sc_session_scenario(session);
            sm_act_add_indexical_phrase(v_scenario, indexical_record, indexical_phrase);
        }
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @param INDEXICAL-PHRASE
    stringp
     * 		
     * @return sc-session-p
    Add INDEXICAL-PHRASE as another phrase on INDEXICAL-RECORD in SESSION's scenario.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@param INDEXICAL-PHRASE\nstringp\r\n\t\t\r\n@return sc-session-p\r\nAdd INDEXICAL-PHRASE as another phrase on INDEXICAL-RECORD in SESSION\'s scenario.")
    public static SubLObject sc_act_add_indexical_phrase(final SubLObject session, final SubLObject indexical_record, final SubLObject indexical_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_add_indexical_phrase(v_scenario, indexical_record, indexical_phrase);
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @param INDEXICAL-PHRASE
    stringp
     * 		
     * @return sc-session-p
    Remove INDEXICAL-PHRASE as one of the phrases denoting INDEXICAL-RECORD in SESSION's scenario.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@param INDEXICAL-PHRASE\nstringp\r\n\t\t\r\n@return sc-session-p\r\nRemove INDEXICAL-PHRASE as one of the phrases denoting INDEXICAL-RECORD in SESSION\'s scenario.")
    public static final SubLObject sc_act_remove_indexical_phrase_alt(SubLObject session, SubLObject indexical_record, SubLObject indexical_phrase) {
        {
            SubLObject v_scenario = sc_session_scenario(session);
            sm_act_remove_indexical_phrase(v_scenario, indexical_record, indexical_phrase);
        }
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @param INDEXICAL-PHRASE
    stringp
     * 		
     * @return sc-session-p
    Remove INDEXICAL-PHRASE as one of the phrases denoting INDEXICAL-RECORD in SESSION's scenario.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@param INDEXICAL-PHRASE\nstringp\r\n\t\t\r\n@return sc-session-p\r\nRemove INDEXICAL-PHRASE as one of the phrases denoting INDEXICAL-RECORD in SESSION\'s scenario.")
    public static SubLObject sc_act_remove_indexical_phrase(final SubLObject session, final SubLObject indexical_record, final SubLObject indexical_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_remove_indexical_phrase(v_scenario, indexical_record, indexical_phrase);
        sc_session_state_clear(session, $INDEXICAL_TABLE);
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @return sc-session-p
     * @param COLLECTION
    fort-p
     * 		
     * @param DOMAIN-INTERACTION-MT
    hlmt-p
     * 		
     * @param TYPE
     * 		(member? TYPE (list #$isa #$genls))
     * 		remove an isa/genls constraint on the indexical record
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@return sc-session-p\r\n@param COLLECTION\nfort-p\r\n\t\t\r\n@param DOMAIN-INTERACTION-MT\nhlmt-p\r\n\t\t\r\n@param TYPE\r\n\t\t(member? TYPE (list #$isa #$genls))\r\n\t\tremove an isa/genls constraint on the indexical record")
    public static final SubLObject sc_act_remove_isaXgenls_constraint_alt(SubLObject session, SubLObject indexical_record, SubLObject collection, SubLObject domain_interaction_mt, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $$isa;
        }
        {
            SubLObject v_scenario = sc_session_scenario(session);
            sm_act_remove_isaXgenls_constraint(v_scenario, indexical_record, collection, domain_interaction_mt, type);
        }
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @return sc-session-p
     * @param COLLECTION
    fort-p
     * 		
     * @param DOMAIN-INTERACTION-MT
    hlmt-p
     * 		
     * @param TYPE
     * 		(member? TYPE (list #$isa #$genls))
     * 		remove an isa/genls constraint on the indexical record
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@return sc-session-p\r\n@param COLLECTION\nfort-p\r\n\t\t\r\n@param DOMAIN-INTERACTION-MT\nhlmt-p\r\n\t\t\r\n@param TYPE\r\n\t\t(member? TYPE (list #$isa #$genls))\r\n\t\tremove an isa/genls constraint on the indexical record")
    public static SubLObject sc_act_remove_isaXgenls_constraint(final SubLObject session, final SubLObject indexical_record, final SubLObject collection, final SubLObject domain_interaction_mt, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $$isa;
        }
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_remove_isaXgenls_constraint(v_scenario, indexical_record, collection, domain_interaction_mt, type);
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param NL-SENTENCE
    stringp
     * 		
     * @return sentences
    Parse NL-SENTENCE and return a list of sentences that it could denote.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param NL-SENTENCE\nstringp\r\n\t\t\r\n@return sentences\r\nParse NL-SENTENCE and return a list of sentences that it could denote.")
    public static final SubLObject sc_act_suggest_new_constraint_alt(SubLObject session, SubLObject nl_sentence) {
        {
            SubLObject state = sc_session_state(session);
            SubLObject parsing_mt = sc_state_parsing_mt(state);
            SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
            SubLObject v_scenario = sc_session_scenario(session);
            SubLObject indexical_records = sm_scenario_terms(v_scenario);
            return sm_act_suggest_constraint_cycl_from_text(nl_sentence, indexical_records, parsing_mt, domain_interaction_mt);
        }
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param NL-SENTENCE
    stringp
     * 		
     * @return sentences
    Parse NL-SENTENCE and return a list of sentences that it could denote.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param NL-SENTENCE\nstringp\r\n\t\t\r\n@return sentences\r\nParse NL-SENTENCE and return a list of sentences that it could denote.")
    public static SubLObject sc_act_suggest_new_constraint(final SubLObject session, final SubLObject nl_sentence) {
        final SubLObject state = sc_session_state(session);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject indexical_records = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        return rkf_scenario_manipulator.sm_act_suggest_constraint_cycl_from_text(nl_sentence, indexical_records, parsing_mt, domain_interaction_mt);
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param SENTENCE
    el-formula-p
     * 		
     * @return sc-session-p
    Construct a constraint-record from SENTENCE and add it to SESSION's scenario.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param SENTENCE\nel-formula-p\r\n\t\t\r\n@return sc-session-p\r\nConstruct a constraint-record from SENTENCE and add it to SESSION\'s scenario.")
    public static final SubLObject sc_act_add_new_constraint_alt(SubLObject session, SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_scenario = sc_session_scenario(session);
                SubLObject state = sc_session_state(session);
                SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
                thread.resetMultipleValues();
                {
                    SubLObject temp = sm_act_add_scenario_constraint(v_scenario, sentence, domain_interaction_mt);
                    SubLObject status = thread.secondMultipleValue();
                    SubLObject irec = thread.thirdMultipleValue();
                    SubLObject predicate = thread.fourthMultipleValue();
                    SubLObject index_col = thread.fifthMultipleValue();
                    SubLObject rel_col = thread.sixthMultipleValue();
                    thread.resetMultipleValues();
                    return values(status, irec, predicate, index_col, rel_col);
                }
            }
        }
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param SENTENCE
    el-formula-p
     * 		
     * @return sc-session-p
    Construct a constraint-record from SENTENCE and add it to SESSION's scenario.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param SENTENCE\nel-formula-p\r\n\t\t\r\n@return sc-session-p\r\nConstruct a constraint-record from SENTENCE and add it to SESSION\'s scenario.")
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

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param CONSTRAINT-RECORD
    sm-constraint-record-p
     * 		
     * @return sc-session-p
    Remove CONSTRAINT-RECORD from the scenario belonging to SESSION.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param CONSTRAINT-RECORD\nsm-constraint-record-p\r\n\t\t\r\n@return sc-session-p\r\nRemove CONSTRAINT-RECORD from the scenario belonging to SESSION.")
    public static final SubLObject sc_act_remove_constraint_alt(SubLObject session, SubLObject constraint_record) {
        {
            SubLObject v_scenario = sc_session_scenario(session);
            SubLObject state = sc_session_state(session);
            SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
            sm_act_remove_constraint(v_scenario, constraint_record, domain_interaction_mt);
        }
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param CONSTRAINT-RECORD
    sm-constraint-record-p
     * 		
     * @return sc-session-p
    Remove CONSTRAINT-RECORD from the scenario belonging to SESSION.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param CONSTRAINT-RECORD\nsm-constraint-record-p\r\n\t\t\r\n@return sc-session-p\r\nRemove CONSTRAINT-RECORD from the scenario belonging to SESSION.")
    public static SubLObject sc_act_remove_constraint(final SubLObject session, final SubLObject constraint_record) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_remove_constraint(v_scenario, constraint_record, domain_interaction_mt);
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @return sc-session-p
    Remove all CONSTRAINT-RECORDs from the scenario belonging to SESSION.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@return sc-session-p\r\nRemove all CONSTRAINT-RECORDs from the scenario belonging to SESSION.")
    public static final SubLObject sc_act_remove_all_constraints_alt(SubLObject session) {
        {
            SubLObject v_scenario = sc_session_scenario(session);
            SubLObject state = sc_session_state(session);
            SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
            sm_act_remove_all_constraints(v_scenario, domain_interaction_mt);
        }
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @return sc-session-p
    Remove all CONSTRAINT-RECORDs from the scenario belonging to SESSION.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@return sc-session-p\r\nRemove all CONSTRAINT-RECORDs from the scenario belonging to SESSION.")
    public static SubLObject sc_act_remove_all_constraints(final SubLObject session) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_remove_all_constraints(v_scenario, domain_interaction_mt);
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param CONSTRAINT-RECORD
    sm-constraint-record-p
     * 		
     * @return sc-session-p
    Add a constraint from another context to the session.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param CONSTRAINT-RECORD\nsm-constraint-record-p\r\n\t\t\r\n@return sc-session-p\r\nAdd a constraint from another context to the session.")
    public static final SubLObject sc_act_import_constraint_alt(SubLObject session, SubLObject constraint) {
        {
            SubLObject v_scenario = sc_session_scenario(session);
            SubLObject state = sc_session_state(session);
            SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
            sm_act_import_constraint(v_scenario, constraint, domain_interaction_mt);
        }
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param CONSTRAINT-RECORD
    sm-constraint-record-p
     * 		
     * @return sc-session-p
    Add a constraint from another context to the session.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param CONSTRAINT-RECORD\nsm-constraint-record-p\r\n\t\t\r\n@return sc-session-p\r\nAdd a constraint from another context to the session.")
    public static SubLObject sc_act_import_constraint(final SubLObject session, final SubLObject constraint) {
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject state = sc_session_state(session);
        final SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
        rkf_scenario_manipulator.sm_act_import_constraint(v_scenario, constraint, domain_interaction_mt);
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param NEW-PHRASE
    stringp
     * 		
     * @return sc-session-p
    Update the phrase for SESSION and its scenario to be NEW-PHRASE.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param NEW-PHRASE\nstringp\r\n\t\t\r\n@return sc-session-p\r\nUpdate the phrase for SESSION and its scenario to be NEW-PHRASE.")
    public static final SubLObject sc_act_modify_phrase_alt(SubLObject session, SubLObject new_phrase) {
        {
            SubLObject v_scenario = sc_session_scenario(session);
            sm_act_modify_phrase(v_scenario, new_phrase);
        }
        sc_set_session_phrase(session, new_phrase);
        return session;
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param NEW-PHRASE
    stringp
     * 		
     * @return sc-session-p
    Update the phrase for SESSION and its scenario to be NEW-PHRASE.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param NEW-PHRASE\nstringp\r\n\t\t\r\n@return sc-session-p\r\nUpdate the phrase for SESSION and its scenario to be NEW-PHRASE.")
    public static SubLObject sc_act_modify_phrase(final SubLObject session, final SubLObject new_phrase) {
        final SubLObject v_scenario = sc_session_scenario(session);
        rkf_scenario_manipulator.sm_act_modify_phrase(v_scenario, new_phrase);
        sc_set_session_phrase(session, new_phrase);
        return session;
    }

    public static final SubLObject sc_act_construct_indexical_table_alt(SubLObject session) {
        {
            SubLObject indexical_table = sc_session_state_lookup(session, $INDEXICAL_TABLE, UNPROVIDED);
            if (NIL == indexical_table) {
                {
                    SubLObject v_scenario = sc_session_scenario(session);
                    indexical_table = sm_act_construct_indexical_table(v_scenario);
                    sc_session_state_update(session, $INDEXICAL_TABLE, indexical_table);
                }
            }
            return indexical_table;
        }
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

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param CONSTRAINT-RECORD
    sm-constraint-record-p
     * 		
     * @return string
    Generates an NL string for CONSTRAINT-RECORD's sentence.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param CONSTRAINT-RECORD\nsm-constraint-record-p\r\n\t\t\r\n@return string\r\nGenerates an NL string for CONSTRAINT-RECORD\'s sentence.")
    public static final SubLObject sc_act_constraint_record_nl_sentence_alt(SubLObject state, SubLObject v_scenario, SubLObject constraint_record) {
        SubLTrampolineFile.checkType(constraint_record, SM_CONSTRAINT_RECORD_P);
        {
            SubLObject generation_mt = sc_state_generation_mt(state);
            SubLObject domain_mt = sc_state_domain_interaction_mt(state);
            SubLObject indexical_records = sm_scenario_terms(v_scenario);
            return sm_act_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
        }
    }

    /**
     *
     *
     * @param SESSION
    sc-session-p
     * 		
     * @param CONSTRAINT-RECORD
    sm-constraint-record-p
     * 		
     * @return string
    Generates an NL string for CONSTRAINT-RECORD's sentence.
     */
    @LispMethod(comment = "@param SESSION\nsc-session-p\r\n\t\t\r\n@param CONSTRAINT-RECORD\nsm-constraint-record-p\r\n\t\t\r\n@return string\r\nGenerates an NL string for CONSTRAINT-RECORD\'s sentence.")
    public static SubLObject sc_act_constraint_record_nl_sentence(final SubLObject state, final SubLObject v_scenario, final SubLObject constraint_record) {
        assert NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) : "! rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + ("rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) ") + constraint_record;
        final SubLObject generation_mt = sc_state_generation_mt(state);
        final SubLObject domain_mt = sc_state_domain_interaction_mt(state);
        final SubLObject indexical_records = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        return rkf_scenario_manipulator.sm_act_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @return adjustment description
    Given a CycL sentence, find location in the sentence where indexicals could go.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@return adjustment description\r\nGiven a CycL sentence, find location in the sentence where indexicals could go.")
    public static final SubLObject sc_act_propose_sentence_adjustment_alt(SubLObject state, SubLObject cycl_sentence) {
        SubLTrampolineFile.checkType(cycl_sentence, EL_FORMULA_P);
        {
            SubLObject session = sc_state_active_session(state);
            SubLObject v_scenario = sc_session_scenario(session);
            SubLObject domain_mt = sc_state_domain_interaction_mt(state);
            return sm_act_propose_sentence_adjustments(v_scenario, cycl_sentence, domain_mt);
        }
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @return adjustment description
    Given a CycL sentence, find location in the sentence where indexicals could go.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@return adjustment description\r\nGiven a CycL sentence, find location in the sentence where indexicals could go.")
    public static SubLObject sc_act_propose_sentence_adjustment(final SubLObject state, final SubLObject cycl_sentence) {
        assert NIL != el_formula_p(cycl_sentence) : "! el_utilities.el_formula_p(cycl_sentence) " + ("el_utilities.el_formula_p(cycl_sentence) " + "CommonSymbols.NIL != el_utilities.el_formula_p(cycl_sentence) ") + cycl_sentence;
        final SubLObject session = sc_state_active_session(state);
        final SubLObject v_scenario = sc_session_scenario(session);
        final SubLObject domain_mt = sc_state_domain_interaction_mt(state);
        return rkf_scenario_manipulator.sm_act_propose_sentence_adjustments(v_scenario, cycl_sentence, domain_mt);
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param FROM-SCENARIO
    sm-scenario-p
     * 		
     * @return sm-merge-info-p
    Register the fact that the interaction of STATE wishes to merge in the contents
    of FROM-SCENARIO to the to- scenario.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param FROM-SCENARIO\nsm-scenario-p\r\n\t\t\r\n@return sm-merge-info-p\r\nRegister the fact that the interaction of STATE wishes to merge in the contents\r\nof FROM-SCENARIO to the to- scenario.")
    public static final SubLObject sc_act_merge_register_from_scenario_alt(SubLObject state, SubLObject from_scenario) {
        {
            SubLObject merge_info = sc_state_merge_info(state);
            if (NIL == merge_info) {
                merge_info = sm_new_merge_info();
                sc_set_state_merge_info(state, merge_info);
            }
            sm_set_merge_info_from_scenario(merge_info, from_scenario);
            return merge_info;
        }
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param FROM-SCENARIO
    sm-scenario-p
     * 		
     * @return sm-merge-info-p
    Register the fact that the interaction of STATE wishes to merge in the contents
    of FROM-SCENARIO to the to- scenario.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param FROM-SCENARIO\nsm-scenario-p\r\n\t\t\r\n@return sm-merge-info-p\r\nRegister the fact that the interaction of STATE wishes to merge in the contents\r\nof FROM-SCENARIO to the to- scenario.")
    public static SubLObject sc_act_merge_register_from_scenario(final SubLObject state, final SubLObject from_scenario) {
        SubLObject merge_info = sc_state_merge_info(state);
        if (NIL == merge_info) {
            merge_info = rkf_scenario_manipulator.sm_new_merge_info();
            sc_set_state_merge_info(state, merge_info);
        }
        rkf_scenario_manipulator.sm_set_merge_info_from_scenario(merge_info, from_scenario);
        return merge_info;
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param TO-SCENARIO
    sm-scenario-p
     * 		
     * @return sm-merge-info-p
    Register the fact that the interaction of STATE wishes to merge in the contents
    of the from- scenario to TO-SCENARIO.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param TO-SCENARIO\nsm-scenario-p\r\n\t\t\r\n@return sm-merge-info-p\r\nRegister the fact that the interaction of STATE wishes to merge in the contents\r\nof the from- scenario to TO-SCENARIO.")
    public static final SubLObject sc_act_merge_register_to_scenario_alt(SubLObject state, SubLObject to_scenario) {
        {
            SubLObject merge_info = sc_state_merge_info(state);
            if (NIL == merge_info) {
                merge_info = sm_new_merge_info();
                sc_set_state_merge_info(state, merge_info);
            }
            sm_set_merge_info_to_scenario(merge_info, to_scenario);
            return merge_info;
        }
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param TO-SCENARIO
    sm-scenario-p
     * 		
     * @return sm-merge-info-p
    Register the fact that the interaction of STATE wishes to merge in the contents
    of the from- scenario to TO-SCENARIO.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param TO-SCENARIO\nsm-scenario-p\r\n\t\t\r\n@return sm-merge-info-p\r\nRegister the fact that the interaction of STATE wishes to merge in the contents\r\nof the from- scenario to TO-SCENARIO.")
    public static SubLObject sc_act_merge_register_to_scenario(final SubLObject state, final SubLObject to_scenario) {
        SubLObject merge_info = sc_state_merge_info(state);
        if (NIL == merge_info) {
            merge_info = rkf_scenario_manipulator.sm_new_merge_info();
            sc_set_state_merge_info(state, merge_info);
        }
        rkf_scenario_manipulator.sm_set_merge_info_to_scenario(merge_info, to_scenario);
        return merge_info;
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @return sm-merge-info-p
    Register the fact that the interaction of STATE has chosen INDEXICAL-RECORD
    (one of the indexical records of the active editing session) as the term
    to align an indexical of the from-session to.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@return sm-merge-info-p\r\nRegister the fact that the interaction of STATE has chosen INDEXICAL-RECORD\r\n(one of the indexical records of the active editing session) as the term\r\nto align an indexical of the from-session to.")
    public static final SubLObject sc_act_merge_register_align_to_alt(SubLObject state, SubLObject indexical_record) {
        {
            SubLObject merge_info = sc_state_merge_info(state);
            sm_set_merge_info_align_to(merge_info, indexical_record);
            return merge_info;
        }
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @return sm-merge-info-p
    Register the fact that the interaction of STATE has chosen INDEXICAL-RECORD
    (one of the indexical records of the active editing session) as the term
    to align an indexical of the from-session to.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@return sm-merge-info-p\r\nRegister the fact that the interaction of STATE has chosen INDEXICAL-RECORD\r\n(one of the indexical records of the active editing session) as the term\r\nto align an indexical of the from-session to.")
    public static SubLObject sc_act_merge_register_align_to(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject merge_info = sc_state_merge_info(state);
        rkf_scenario_manipulator.sm_set_merge_info_align_to(merge_info, indexical_record);
        return merge_info;
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @return sm-merge-info-p
    Register the fact that the interaction of STATE has chosen INDEXICAL-RECORD
    (one of the indexical records of the session that will be merged in) as the term
    to align to an indexical of the active editing session.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@return sm-merge-info-p\r\nRegister the fact that the interaction of STATE has chosen INDEXICAL-RECORD\r\n(one of the indexical records of the session that will be merged in) as the term\r\nto align to an indexical of the active editing session.")
    public static final SubLObject sc_act_merge_register_align_from_alt(SubLObject state, SubLObject indexical_record) {
        {
            SubLObject merge_info = sc_state_merge_info(state);
            sm_set_merge_info_align_from(merge_info, indexical_record);
            return merge_info;
        }
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @param INDEXICAL-RECORD
    sm-indexical-record-p
     * 		
     * @return sm-merge-info-p
    Register the fact that the interaction of STATE has chosen INDEXICAL-RECORD
    (one of the indexical records of the session that will be merged in) as the term
    to align to an indexical of the active editing session.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@param INDEXICAL-RECORD\nsm-indexical-record-p\r\n\t\t\r\n@return sm-merge-info-p\r\nRegister the fact that the interaction of STATE has chosen INDEXICAL-RECORD\r\n(one of the indexical records of the session that will be merged in) as the term\r\nto align to an indexical of the active editing session.")
    public static SubLObject sc_act_merge_register_align_from(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject merge_info = sc_state_merge_info(state);
        rkf_scenario_manipulator.sm_set_merge_info_align_from(merge_info, indexical_record);
        return merge_info;
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @return sm-merge-info-p
    Place the previously selected 'align-from' and 'align-to' indexicals as
    a pair on the list of indexical equivalences for the merge in progress
    for STATE.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@return sm-merge-info-p\r\nPlace the previously selected \'align-from\' and \'align-to\' indexicals as\r\na pair on the list of indexical equivalences for the merge in progress\r\nfor STATE.")
    public static final SubLObject sc_act_merge_update_indexical_equivalences_alt(SubLObject state) {
        {
            SubLObject merge_info = sc_state_merge_info(state);
            update_sm_merge_info_indexical_equivalences(merge_info);
            return merge_info;
        }
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @return sm-merge-info-p
    Place the previously selected 'align-from' and 'align-to' indexicals as
    a pair on the list of indexical equivalences for the merge in progress
    for STATE.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@return sm-merge-info-p\r\nPlace the previously selected \'align-from\' and \'align-to\' indexicals as\r\na pair on the list of indexical equivalences for the merge in progress\r\nfor STATE.")
    public static SubLObject sc_act_merge_update_indexical_equivalences(final SubLObject state) {
        final SubLObject merge_info = sc_state_merge_info(state);
        rkf_scenario_manipulator.update_sm_merge_info_indexical_equivalences(merge_info);
        return merge_info;
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @return sc-state-p
    Clear out the state of a merge that is in progress.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@return sc-state-p\r\nClear out the state of a merge that is in progress.")
    public static final SubLObject sc_act_abandon_merge_alt(SubLObject state) {
        sc_rem_state_merge_info(state);
        return state;
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @return sc-state-p
    Clear out the state of a merge that is in progress.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@return sc-state-p\r\nClear out the state of a merge that is in progress.")
    public static SubLObject sc_act_abandon_merge(final SubLObject state) {
        sc_rem_state_merge_info(state);
        return state;
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @return sc-state-p
    Using the merge state that is stored on STATE, perform the merge
    and clear out the state of the merge.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@return sc-state-p\r\nUsing the merge state that is stored on STATE, perform the merge\r\nand clear out the state of the merge.")
    public static final SubLObject sc_act_merge_scenarios_alt(SubLObject state) {
        {
            SubLObject merge_info = sc_state_merge_info(state);
            SubLObject from_scenario = sm_merge_info_from_scenario(merge_info);
            SubLObject to_scenario = sm_merge_info_to_scenario(merge_info);
            SubLObject indexical_equivalences = sm_merge_info_indexical_equivalences(merge_info);
            sm_act_merge_scenarios(to_scenario, from_scenario, indexical_equivalences);
            sc_rem_state_merge_info(state);
        }
        return state;
    }

    /**
     *
     *
     * @param STATE
    sc-state-p
     * 		
     * @return sc-state-p
    Using the merge state that is stored on STATE, perform the merge
    and clear out the state of the merge.
     */
    @LispMethod(comment = "@param STATE\nsc-state-p\r\n\t\t\r\n@return sc-state-p\r\nUsing the merge state that is stored on STATE, perform the merge\r\nand clear out the state of the merge.")
    public static SubLObject sc_act_merge_scenarios(final SubLObject state) {
        final SubLObject merge_info = sc_state_merge_info(state);
        final SubLObject from_scenario = rkf_scenario_manipulator.sm_merge_info_from_scenario(merge_info);
        final SubLObject to_scenario = rkf_scenario_manipulator.sm_merge_info_to_scenario(merge_info);
        final SubLObject indexical_equivalences = rkf_scenario_manipulator.sm_merge_info_indexical_equivalences(merge_info);
        rkf_scenario_manipulator.sm_act_merge_scenarios(to_scenario, from_scenario, indexical_equivalences);
        sc_rem_state_merge_info(state);
        return state;
    }

    public static final SubLObject sc_state_merge_from_scenario_alt(SubLObject state) {
        {
            SubLObject merge_info = sc_state_merge_info(state);
            return sm_merge_info_from_scenario(merge_info);
        }
    }

    public static SubLObject sc_state_merge_from_scenario(final SubLObject state) {
        final SubLObject merge_info = sc_state_merge_info(state);
        return rkf_scenario_manipulator.sm_merge_info_from_scenario(merge_info);
    }

    public static final SubLObject sc_indexical_record_alignedP_alt(SubLObject state, SubLObject indexical_record) {
        {
            SubLObject merge_info = sc_state_merge_info(state);
            if (NIL != merge_info) {
                {
                    SubLObject indexical_equivalences = sm_merge_info_indexical_equivalences(merge_info);
                    return cycl_utilities.expression_find(indexical_record, indexical_equivalences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject sc_indexical_record_alignedP(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject merge_info = sc_state_merge_info(state);
        if (NIL != merge_info) {
            final SubLObject indexical_equivalences = rkf_scenario_manipulator.sm_merge_info_indexical_equivalences(merge_info);
            return cycl_utilities.expression_find(indexical_record, indexical_equivalences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject sc_act_generalize_scenario_alt(SubLObject state, SubLObject v_scenario) {
        {
            SubLObject domain_interaction_mt = sc_state_domain_interaction_mt(state);
            SubLObject generation_mt = sc_state_generation_mt(state);
            SubLObject gen_points = sm_act_compute_scenario_generalization_points(v_scenario, domain_interaction_mt);
            sc_set_state_gen_points(state, gen_points);
            gen_points = remove_if(symbol_function(SM_GEN_POINT_WITHOUT_POSITIONS_P), gen_points, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject result = sm_act_generalize_scenario_with_gen_points(v_scenario, gen_points, domain_interaction_mt, generation_mt);
                sc_clear_state_gen_points(state);
                return result;
            }
        }
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

    /**
     *
     *
     * @param STATE
     * 		
     * @param SCENARIO
     * 		
     * @param TEMPLATE
     * 		
     */
    @LispMethod(comment = "@param STATE\r\n\t\t\r\n@param SCENARIO\r\n\t\t\r\n@param TEMPLATE")
    public static final SubLObject sc_act_save_scenario_alt(SubLObject state, SubLObject v_scenario, SubLObject template) {
        {
            SubLObject storage_mt = sc_state_scenario_interaction_mt(state);
            SubLObject parsing_mt = sc_state_parsing_mt(state);
            return sm_act_save_scenario(v_scenario, template, storage_mt, parsing_mt);
        }
    }

    /**
     *
     *
     * @param STATE
     * 		
     * @param SCENARIO
     * 		
     * @param TEMPLATE
     * 		
     */
    @LispMethod(comment = "@param STATE\r\n\t\t\r\n@param SCENARIO\r\n\t\t\r\n@param TEMPLATE")
    public static SubLObject sc_act_save_scenario(final SubLObject state, final SubLObject v_scenario, final SubLObject template) {
        final SubLObject storage_mt = sc_state_scenario_interaction_mt(state);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        return rkf_scenario_manipulator.sm_act_save_scenario(v_scenario, template, storage_mt, parsing_mt);
    }

    /**
     *
     *
     * @param STATE
     * 		provide a list of all of the scenario terms that could be loaded
     */
    @LispMethod(comment = "@param STATE\r\n\t\tprovide a list of all of the scenario terms that could be loaded")
    public static final SubLObject sc_act_enumerate_saved_scenarios_alt(SubLObject state) {
        {
            SubLObject storage_mt = sc_state_scenario_interaction_mt(state);
            SubLObject parsing_mt = sc_state_parsing_mt(state);
            return sm_act_enumerate_saved_scenarios(storage_mt, parsing_mt);
        }
    }

    /**
     *
     *
     * @param STATE
     * 		provide a list of all of the scenario terms that could be loaded
     */
    @LispMethod(comment = "@param STATE\r\n\t\tprovide a list of all of the scenario terms that could be loaded")
    public static SubLObject sc_act_enumerate_saved_scenarios(final SubLObject state) {
        final SubLObject storage_mt = sc_state_scenario_interaction_mt(state);
        final SubLObject parsing_mt = sc_state_parsing_mt(state);
        return rkf_scenario_manipulator.sm_act_enumerate_saved_scenarios(storage_mt, parsing_mt);
    }

    /**
     *
     *
     * @param STATE
     * 		
     * @param SCENARIO
     * 		
     * @param TEMPLATE
     * 		
     */
    @LispMethod(comment = "@param STATE\r\n\t\t\r\n@param SCENARIO\r\n\t\t\r\n@param TEMPLATE")
    public static final SubLObject sc_act_discard_template_alt(SubLObject state, SubLObject v_scenario, SubLObject template) {
        return sm_act_discard_template(v_scenario, template);
    }

    /**
     *
     *
     * @param STATE
     * 		
     * @param SCENARIO
     * 		
     * @param TEMPLATE
     * 		
     */
    @LispMethod(comment = "@param STATE\r\n\t\t\r\n@param SCENARIO\r\n\t\t\r\n@param TEMPLATE")
    public static SubLObject sc_act_discard_template(final SubLObject state, final SubLObject v_scenario, final SubLObject template) {
        return rkf_scenario_manipulator.sm_act_discard_template(v_scenario, template);
    }

    public static final SubLObject sc_act_compute_unused_indexicals_alt(SubLObject v_scenario) {
        return sm_act_compute_unused_indexicals(v_scenario);
    }

    public static SubLObject sc_act_compute_unused_indexicals(final SubLObject v_scenario) {
        return rkf_scenario_manipulator.sm_act_compute_unused_indexicals(v_scenario);
    }

    public static final SubLObject sc_act_discard_session_alt(SubLObject session) {
        {
            SubLObject state = sc_session_state(session);
            deactivate_and_retire_sc_us_construction_session(state, session);
            return NIL;
        }
    }

    public static SubLObject sc_act_discard_session(final SubLObject session) {
        final SubLObject state = sc_session_state(session);
        deactivate_and_retire_sc_us_construction_session(state, session);
        return NIL;
    }

    public static final SubLObject sc_act_activate_session_alt(SubLObject state, SubLObject session) {
        return sc_activate_session(state, session);
    }

    public static SubLObject sc_act_activate_session(final SubLObject state, final SubLObject session) {
        return sc_activate_session(state, session);
    }

    public static final SubLObject sc_act_set_indexical_record_var_alt(SubLObject indexical_record, SubLObject var) {
        return sm_act_set_indexical_record_var(indexical_record, var);
    }

    public static SubLObject sc_act_set_indexical_record_var(final SubLObject indexical_record, final SubLObject var) {
        return rkf_scenario_manipulator.sm_act_set_indexical_record_var(indexical_record, var);
    }

    public static SubLObject declare_rkf_scenario_constructor_file() {
        declareFunction("sc_parsing_mt", "SC-PARSING-MT", 0, 0, false);
        declareFunction("sc_semantic_mt", "SC-SEMANTIC-MT", 0, 0, false);
        declareFunction("sc_storage_mt", "SC-STORAGE-MT", 0, 0, false);
        declareFunction("sc_generation_mt", "SC-GENERATION-MT", 0, 0, false);
        declareMacro("with_sc_lock", "WITH-SC-LOCK");
        declareFunction("sc_find_session_by_id", "SC-FIND-SESSION-BY-ID", 1, 0, false);
        declareFunction("sc_find_session_by_id_string", "SC-FIND-SESSION-BY-ID-STRING", 1, 0, false);
        declareFunction("sc_find_state_by_id", "SC-FIND-STATE-BY-ID", 1, 0, false);
        declareFunction("sc_find_state_by_id_string", "SC-FIND-STATE-BY-ID-STRING", 1, 0, false);
        declareFunction("next_sc_id", "NEXT-SC-ID", 0, 0, false);
        declareFunction("sc_add_object", "SC-ADD-OBJECT", 2, 0, false);
        declareFunction("sc_rem_object", "SC-REM-OBJECT", 1, 0, false);
        declareFunction("sc_find_object_by_id", "SC-FIND-OBJECT-BY-ID", 1, 0, false);
        declareFunction("sc_session_print_function_trampoline", "SC-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sc_session_p", "SC-SESSION-P", 1, 0, false);
        new rkf_scenario_constructor.$sc_session_p$UnaryFunction();
        declareFunction("sc_session_id", "SC-SESSION-ID", 1, 0, false);
        declareFunction("sc_session_state", "SC-SESSION-STATE", 1, 0, false);
        declareFunction("sc_session_phrase", "SC-SESSION-PHRASE", 1, 0, false);
        declareFunction("sc_session_candidate_scenarios", "SC-SESSION-CANDIDATE-SCENARIOS", 1, 0, false);
        declareFunction("sc_session_permission", "SC-SESSION-PERMISSION", 1, 0, false);
        declareFunction("sc_session_scenario", "SC-SESSION-SCENARIO", 1, 0, false);
        declareFunction("sc_session_internal_state", "SC-SESSION-INTERNAL-STATE", 1, 0, false);
        declareFunction("_csetf_sc_session_id", "_CSETF-SC-SESSION-ID", 2, 0, false);
        declareFunction("_csetf_sc_session_state", "_CSETF-SC-SESSION-STATE", 2, 0, false);
        declareFunction("_csetf_sc_session_phrase", "_CSETF-SC-SESSION-PHRASE", 2, 0, false);
        declareFunction("_csetf_sc_session_candidate_scenarios", "_CSETF-SC-SESSION-CANDIDATE-SCENARIOS", 2, 0, false);
        declareFunction("_csetf_sc_session_permission", "_CSETF-SC-SESSION-PERMISSION", 2, 0, false);
        declareFunction("_csetf_sc_session_scenario", "_CSETF-SC-SESSION-SCENARIO", 2, 0, false);
        declareFunction("_csetf_sc_session_internal_state", "_CSETF-SC-SESSION-INTERNAL-STATE", 2, 0, false);
        declareFunction("make_sc_session", "MAKE-SC-SESSION", 0, 1, false);
        declareFunction("visit_defstruct_sc_session", "VISIT-DEFSTRUCT-SC-SESSION", 2, 0, false);
        declareFunction("visit_defstruct_object_sc_session_method", "VISIT-DEFSTRUCT-OBJECT-SC-SESSION-METHOD", 2, 0, false);
        declareFunction("sc_new_session", "SC-NEW-SESSION", 2, 1, false);
        declareFunction("sc_set_session_phrase", "SC-SET-SESSION-PHRASE", 2, 0, false);
        declareFunction("sc_set_session_permission", "SC-SET-SESSION-PERMISSION", 2, 0, false);
        declareFunction("sc_add_session_candidate_scenarios", "SC-ADD-SESSION-CANDIDATE-SCENARIOS", 2, 0, false);
        declareFunction("sc_add_session_candidate_scenario", "SC-ADD-SESSION-CANDIDATE-SCENARIO", 2, 0, false);
        declareFunction("sc_rem_candidate_scenario", "SC-REM-CANDIDATE-SCENARIO", 2, 0, false);
        declareFunction("sc_set_session_scenario", "SC-SET-SESSION-SCENARIO", 2, 0, false);
        declareFunction("sc_construction_session_p", "SC-CONSTRUCTION-SESSION-P", 1, 0, false);
        declareFunction("sc_browsing_session_p", "SC-BROWSING-SESSION-P", 1, 0, false);
        declareFunction("sc_cleanup_session", "SC-CLEANUP-SESSION", 1, 0, false);
        declareFunction("sc_session_state_lookup", "SC-SESSION-STATE-LOOKUP", 2, 1, false);
        declareFunction("sc_session_state_update", "SC-SESSION-STATE-UPDATE", 3, 0, false);
        declareFunction("sc_session_state_clear", "SC-SESSION-STATE-CLEAR", 2, 0, false);
        declareFunction("sc_state_print_function_trampoline", "SC-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sc_state_p", "SC-STATE-P", 1, 0, false);
        new rkf_scenario_constructor.$sc_state_p$UnaryFunction();
        declareFunction("sc_state_id", "SC-STATE-ID", 1, 0, false);
        declareFunction("sc_state_interaction", "SC-STATE-INTERACTION", 1, 0, false);
        declareFunction("sc_state_active_session", "SC-STATE-ACTIVE-SESSION", 1, 0, false);
        declareFunction("sc_state_construction_sessions", "SC-STATE-CONSTRUCTION-SESSIONS", 1, 0, false);
        declareFunction("sc_state_browsing_sessions", "SC-STATE-BROWSING-SESSIONS", 1, 0, false);
        declareFunction("sc_state_merge_info", "SC-STATE-MERGE-INFO", 1, 0, false);
        declareFunction("sc_state_parsing_mt", "SC-STATE-PARSING-MT", 1, 0, false);
        declareFunction("sc_state_generation_mt", "SC-STATE-GENERATION-MT", 1, 0, false);
        declareFunction("sc_state_domain_mt", "SC-STATE-DOMAIN-MT", 1, 0, false);
        declareFunction("sc_state_domain_interaction_mt", "SC-STATE-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction("sc_state_scenario_interaction_mt", "SC-STATE-SCENARIO-INTERACTION-MT", 1, 0, false);
        declareFunction("sc_state_gen_points", "SC-STATE-GEN-POINTS", 1, 0, false);
        declareFunction("sc_state_state", "SC-STATE-STATE", 1, 0, false);
        declareFunction("_csetf_sc_state_id", "_CSETF-SC-STATE-ID", 2, 0, false);
        declareFunction("_csetf_sc_state_interaction", "_CSETF-SC-STATE-INTERACTION", 2, 0, false);
        declareFunction("_csetf_sc_state_active_session", "_CSETF-SC-STATE-ACTIVE-SESSION", 2, 0, false);
        declareFunction("_csetf_sc_state_construction_sessions", "_CSETF-SC-STATE-CONSTRUCTION-SESSIONS", 2, 0, false);
        declareFunction("_csetf_sc_state_browsing_sessions", "_CSETF-SC-STATE-BROWSING-SESSIONS", 2, 0, false);
        declareFunction("_csetf_sc_state_merge_info", "_CSETF-SC-STATE-MERGE-INFO", 2, 0, false);
        declareFunction("_csetf_sc_state_parsing_mt", "_CSETF-SC-STATE-PARSING-MT", 2, 0, false);
        declareFunction("_csetf_sc_state_generation_mt", "_CSETF-SC-STATE-GENERATION-MT", 2, 0, false);
        declareFunction("_csetf_sc_state_domain_mt", "_CSETF-SC-STATE-DOMAIN-MT", 2, 0, false);
        declareFunction("_csetf_sc_state_domain_interaction_mt", "_CSETF-SC-STATE-DOMAIN-INTERACTION-MT", 2, 0, false);
        declareFunction("_csetf_sc_state_scenario_interaction_mt", "_CSETF-SC-STATE-SCENARIO-INTERACTION-MT", 2, 0, false);
        declareFunction("_csetf_sc_state_gen_points", "_CSETF-SC-STATE-GEN-POINTS", 2, 0, false);
        declareFunction("_csetf_sc_state_state", "_CSETF-SC-STATE-STATE", 2, 0, false);
        declareFunction("make_sc_state", "MAKE-SC-STATE", 0, 1, false);
        declareFunction("visit_defstruct_sc_state", "VISIT-DEFSTRUCT-SC-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_sc_state_method", "VISIT-DEFSTRUCT-OBJECT-SC-STATE-METHOD", 2, 0, false);
        declareFunction("sc_new_state", "SC-NEW-STATE", 0, 0, false);
        declareFunction("cleanup_sc_state", "CLEANUP-SC-STATE", 1, 0, false);
        declareFunction("note_sc_state_interaction", "NOTE-SC-STATE-INTERACTION", 2, 0, false);
        declareFunction("sc_add_us_construction_session", "SC-ADD-US-CONSTRUCTION-SESSION", 2, 0, false);
        declareFunction("retire_sc_us_construction_session", "RETIRE-SC-US-CONSTRUCTION-SESSION", 2, 0, false);
        declareFunction("deactivate_and_retire_sc_us_construction_session", "DEACTIVATE-AND-RETIRE-SC-US-CONSTRUCTION-SESSION", 2, 0, false);
        declareFunction("sc_add_us_browsing_session", "SC-ADD-US-BROWSING-SESSION", 2, 0, false);
        declareFunction("retire_sc_us_browsing_session", "RETIRE-SC-US-BROWSING-SESSION", 2, 0, false);
        declareFunction("sc_activate_session", "SC-ACTIVATE-SESSION", 2, 0, false);
        declareFunction("deactivate_active_sc_session", "DEACTIVATE-ACTIVE-SC-SESSION", 1, 0, false);
        declareFunction("sc_set_state_merge_info", "SC-SET-STATE-MERGE-INFO", 2, 0, false);
        declareFunction("sc_rem_state_merge_info", "SC-REM-STATE-MERGE-INFO", 1, 0, false);
        declareFunction("initialize_sc_state_mts", "INITIALIZE-SC-STATE-MTS", 1, 0, false);
        declareFunction("sc_set_state_gen_points", "SC-SET-STATE-GEN-POINTS", 2, 0, false);
        declareFunction("sc_clear_state_gen_points", "SC-CLEAR-STATE-GEN-POINTS", 1, 0, false);
        declareFunction("sc_state_active_scenario", "SC-STATE-ACTIVE-SCENARIO", 1, 0, false);
        declareFunction("sc_state_active_scenario_incomplete", "SC-STATE-ACTIVE-SCENARIO-INCOMPLETE", 1, 0, false);
        declareFunction("sc_state_current_act", "SC-STATE-CURRENT-ACT", 1, 0, false);
        declareFunction("sc_state_update", "SC-STATE-UPDATE", 3, 0, false);
        declareFunction("sc_state_lookup", "SC-STATE-LOOKUP", 2, 1, false);
        declareFunction("sc_state_clear", "SC-STATE-CLEAR", 2, 0, false);
        declareFunction("rkf_sc_new_limitations", "RKF-SC-NEW-LIMITATIONS", 0, 0, false);
        declareFunction("rkf_sc_add_limitation", "RKF-SC-ADD-LIMITATION", 3, 0, false);
        declareFunction("rkf_sc_get_limitation", "RKF-SC-GET-LIMITATION", 2, 1, false);
        declareFunction("sc_state_note_limitations", "SC-STATE-NOTE-LIMITATIONS", 2, 0, false);
        declareFunction("sc_state_get_limitations", "SC-STATE-GET-LIMITATIONS", 1, 0, false);
        declareFunction("sc_concept_harvester", "SC-CONCEPT-HARVESTER", 3, 0, false);
        declareFunction("sc_itp_sequel", "SC-ITP-SEQUEL", 1, 0, false);
        declareFunction("sc_act_new_state", "SC-ACT-NEW-STATE", 0, 0, false);
        declareFunction("sc_act_initialize_scenario", "SC-ACT-INITIALIZE-SCENARIO", 3, 0, false);
        declareFunction("sc_act_new_state_with_phrase", "SC-ACT-NEW-STATE-WITH-PHRASE", 1, 0, false);
        declareFunction("sc_act_initialize_construction_session", "SC-ACT-INITIALIZE-CONSTRUCTION-SESSION", 1, 1, false);
        declareFunction("sc_act_new_state_with_construction_scenario", "SC-ACT-NEW-STATE-WITH-CONSTRUCTION-SCENARIO", 1, 1, false);
        declareFunction("sc_act_set_session_scenario", "SC-ACT-SET-SESSION-SCENARIO", 2, 0, false);
        declareFunction("sc_act_read_scenario", "SC-ACT-READ-SCENARIO", 3, 0, false);
        declareFunction("sc_act_suggest_scenarios", "SC-ACT-SUGGEST-SCENARIOS", 2, 0, false);
        declareFunction("sc_act_determine_scenario_expression", "SC-ACT-DETERMINE-SCENARIO-EXPRESSION", 2, 0, false);
        declareFunction("sc_act_initialize_scenario_from_expression", "SC-ACT-INITIALIZE-SCENARIO-FROM-EXPRESSION", 2, 1, false);
        declareFunction("sc_determine_scenario_expression_int", "SC-DETERMINE-SCENARIO-EXPRESSION-INT", 3, 0, false);
        declareFunction("sc_act_suggest_new_indexical_type", "SC-ACT-SUGGEST-NEW-INDEXICAL-TYPE", 2, 0, false);
        declareFunction("sc_act_add_new_indexical_multiple", "SC-ACT-ADD-NEW-INDEXICAL-MULTIPLE", 4, 0, false);
        declareFunction("sc_act_add_new_indexical", "SC-ACT-ADD-NEW-INDEXICAL", 4, 0, false);
        declareFunction("sc_act_find_indexical", "SC-ACT-FIND-INDEXICAL", 2, 0, false);
        declareFunction("sc_act_remove_indexical", "SC-ACT-REMOVE-INDEXICAL", 2, 0, false);
        declareFunction("sc_act_suggest_differences", "SC-ACT-SUGGEST-DIFFERENCES", 2, 0, false);
        declareFunction("sc_act_distinguish_indexicals", "SC-ACT-DISTINGUISH-INDEXICALS", 3, 0, false);
        declareFunction("sc_act_add_indexical_phrase", "SC-ACT-ADD-INDEXICAL-PHRASE", 3, 0, false);
        declareFunction("sc_act_remove_indexical_phrase", "SC-ACT-REMOVE-INDEXICAL-PHRASE", 3, 0, false);
        declareFunction("sc_act_remove_isaXgenls_constraint", "SC-ACT-REMOVE-ISA/GENLS-CONSTRAINT", 4, 1, false);
        declareFunction("sc_act_suggest_new_constraint", "SC-ACT-SUGGEST-NEW-CONSTRAINT", 2, 0, false);
        declareFunction("sc_act_add_new_constraint", "SC-ACT-ADD-NEW-CONSTRAINT", 2, 0, false);
        declareFunction("sc_act_remove_constraint", "SC-ACT-REMOVE-CONSTRAINT", 2, 0, false);
        declareFunction("sc_act_remove_all_constraints", "SC-ACT-REMOVE-ALL-CONSTRAINTS", 1, 0, false);
        declareFunction("sc_act_import_constraint", "SC-ACT-IMPORT-CONSTRAINT", 2, 0, false);
        declareFunction("sc_act_modify_phrase", "SC-ACT-MODIFY-PHRASE", 2, 0, false);
        declareFunction("sc_act_construct_indexical_table", "SC-ACT-CONSTRUCT-INDEXICAL-TABLE", 1, 0, false);
        declareFunction("sc_act_constraint_record_nl_sentence", "SC-ACT-CONSTRAINT-RECORD-NL-SENTENCE", 3, 0, false);
        declareFunction("sc_act_propose_sentence_adjustment", "SC-ACT-PROPOSE-SENTENCE-ADJUSTMENT", 2, 0, false);
        declareFunction("sc_act_merge_register_from_scenario", "SC-ACT-MERGE-REGISTER-FROM-SCENARIO", 2, 0, false);
        declareFunction("sc_act_merge_register_to_scenario", "SC-ACT-MERGE-REGISTER-TO-SCENARIO", 2, 0, false);
        declareFunction("sc_act_merge_register_align_to", "SC-ACT-MERGE-REGISTER-ALIGN-TO", 2, 0, false);
        declareFunction("sc_act_merge_register_align_from", "SC-ACT-MERGE-REGISTER-ALIGN-FROM", 2, 0, false);
        declareFunction("sc_act_merge_update_indexical_equivalences", "SC-ACT-MERGE-UPDATE-INDEXICAL-EQUIVALENCES", 1, 0, false);
        declareFunction("sc_act_abandon_merge", "SC-ACT-ABANDON-MERGE", 1, 0, false);
        declareFunction("sc_act_merge_scenarios", "SC-ACT-MERGE-SCENARIOS", 1, 0, false);
        declareFunction("sc_state_merge_from_scenario", "SC-STATE-MERGE-FROM-SCENARIO", 1, 0, false);
        declareFunction("sc_indexical_record_alignedP", "SC-INDEXICAL-RECORD-ALIGNED?", 2, 0, false);
        declareFunction("sc_act_generalize_scenario", "SC-ACT-GENERALIZE-SCENARIO", 2, 0, false);
        declareFunction("sc_act_save_scenario", "SC-ACT-SAVE-SCENARIO", 3, 0, false);
        declareFunction("sc_act_enumerate_saved_scenarios", "SC-ACT-ENUMERATE-SAVED-SCENARIOS", 1, 0, false);
        declareFunction("sc_act_discard_template", "SC-ACT-DISCARD-TEMPLATE", 3, 0, false);
        declareFunction("sc_act_compute_unused_indexicals", "SC-ACT-COMPUTE-UNUSED-INDEXICALS", 1, 0, false);
        declareFunction("sc_act_discard_session", "SC-ACT-DISCARD-SESSION", 1, 0, false);
        declareFunction("sc_act_activate_session", "SC-ACT-ACTIVATE-SESSION", 2, 0, false);
        declareFunction("sc_act_set_indexical_record_var", "SC-ACT-SET-INDEXICAL-RECORD-VAR", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_rkf_scenario_constructor_file_alt() {
        defparameter("*SC-PARSING-MT*", $$EBertTemplateMt);
        defparameter("*SC-SEMANTIC-MT*", $$MassMediaMt);
        defparameter("*SC-STORAGE-MT*", $$ScenarioDescriptionMt);
        defparameter("*SC-GENERATION-MT*", $$EnglishParaphraseMt);
        deflexical("*SC-LOCK*", make_lock($$$Scenario_Constructor_Lock));
        deflexical("*SC-ISG*", NIL != boundp($sc_isg$) ? ((SubLObject) ($sc_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*SC-INDEX*", NIL != boundp($sc_index$) ? ((SubLObject) ($sc_index$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-SC-SESSION*", SC_SESSION);
        defconstant("*DTP-SC-STATE*", SC_STATE);
        deflexical("*RKF-SC-STATE-EMPTY-LIMITATIONS*", rkf_sc_new_limitations());
        defparameter("*SC-RTP-CATEGORY*", NIL);
        defparameter("*SC-RTP-SYNTACTIC-MT*", NIL);
        return NIL;
    }

    public static SubLObject init_rkf_scenario_constructor_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SC-ISG*", NIL != boundp($sc_isg$) ? ((SubLObject) ($sc_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            deflexical("*SC-INDEX*", NIL != boundp($sc_index$) ? ((SubLObject) ($sc_index$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_rkf_scenario_constructor_file_Previous() {
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
            rkf_scenario_constructor.$sc_session_native.this.$id = Lisp.NIL;
            rkf_scenario_constructor.$sc_session_native.this.$state = Lisp.NIL;
            rkf_scenario_constructor.$sc_session_native.this.$phrase = Lisp.NIL;
            rkf_scenario_constructor.$sc_session_native.this.$candidate_scenarios = Lisp.NIL;
            rkf_scenario_constructor.$sc_session_native.this.$permission = Lisp.NIL;
            rkf_scenario_constructor.$sc_session_native.this.$scenario = Lisp.NIL;
            rkf_scenario_constructor.$sc_session_native.this.$internal_state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rkf_scenario_constructor.$sc_session_native.this.$id;
        }

        @Override
        public SubLObject getField3() {
            return rkf_scenario_constructor.$sc_session_native.this.$state;
        }

        @Override
        public SubLObject getField4() {
            return rkf_scenario_constructor.$sc_session_native.this.$phrase;
        }

        @Override
        public SubLObject getField5() {
            return rkf_scenario_constructor.$sc_session_native.this.$candidate_scenarios;
        }

        @Override
        public SubLObject getField6() {
            return rkf_scenario_constructor.$sc_session_native.this.$permission;
        }

        @Override
        public SubLObject getField7() {
            return rkf_scenario_constructor.$sc_session_native.this.$scenario;
        }

        @Override
        public SubLObject getField8() {
            return rkf_scenario_constructor.$sc_session_native.this.$internal_state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rkf_scenario_constructor.$sc_session_native.this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rkf_scenario_constructor.$sc_session_native.this.$state = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rkf_scenario_constructor.$sc_session_native.this.$phrase = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rkf_scenario_constructor.$sc_session_native.this.$candidate_scenarios = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rkf_scenario_constructor.$sc_session_native.this.$permission = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return rkf_scenario_constructor.$sc_session_native.this.$scenario = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return rkf_scenario_constructor.$sc_session_native.this.$internal_state = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_scenario_constructor.$sc_session_native.class, SC_SESSION, SC_SESSION_P, $list11, $list12, new String[]{ "$id", "$state", "$phrase", "$candidate_scenarios", "$permission", "$scenario", "$internal_state" }, $list13, $list14, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLList $list_alt6 = list(makeSymbol("*SC-LOCK*"));

    static private final SubLList $list_alt11 = list(makeSymbol("ID"), makeSymbol("STATE"), makeSymbol("PHRASE"), makeSymbol("CANDIDATE-SCENARIOS"), makeSymbol("PERMISSION"), makeSymbol("SCENARIO"), makeSymbol("INTERNAL-STATE"));

    static private final SubLList $list_alt12 = list(makeKeyword("ID"), makeKeyword("STATE"), makeKeyword("PHRASE"), makeKeyword("CANDIDATE-SCENARIOS"), makeKeyword("PERMISSION"), makeKeyword("SCENARIO"), makeKeyword("INTERNAL-STATE"));

    static private final SubLList $list_alt13 = list(makeSymbol("SC-SESSION-ID"), makeSymbol("SC-SESSION-STATE"), makeSymbol("SC-SESSION-PHRASE"), makeSymbol("SC-SESSION-CANDIDATE-SCENARIOS"), makeSymbol("SC-SESSION-PERMISSION"), makeSymbol("SC-SESSION-SCENARIO"), makeSymbol("SC-SESSION-INTERNAL-STATE"));

    static private final SubLList $list_alt14 = list(makeSymbol("_CSETF-SC-SESSION-ID"), makeSymbol("_CSETF-SC-SESSION-STATE"), makeSymbol("_CSETF-SC-SESSION-PHRASE"), makeSymbol("_CSETF-SC-SESSION-CANDIDATE-SCENARIOS"), makeSymbol("_CSETF-SC-SESSION-PERMISSION"), makeSymbol("_CSETF-SC-SESSION-SCENARIO"), makeSymbol("_CSETF-SC-SESSION-INTERNAL-STATE"));

    public static final class $sc_session_p$UnaryFunction extends UnaryFunction {
        public $sc_session_p$UnaryFunction() {
            super(extractFunctionNamed("SC-SESSION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sc_session_p(arg1);
        }
    }

    static private final SubLString $str_alt38$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt41 = list($EDIT, $VIEW);

    static private final SubLString $str_alt42$Error___a_is_not_a_known_scenario = makeString("Error: ~a is not a known scenario construction permission type.");

    static private final SubLList $list_alt47 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("INTERACTION"), makeSymbol("ACTIVE-SESSION"), makeSymbol("CONSTRUCTION-SESSIONS"), makeSymbol("BROWSING-SESSIONS"), makeSymbol("MERGE-INFO"), makeSymbol("PARSING-MT"), makeSymbol("GENERATION-MT"), makeSymbol("DOMAIN-MT"), makeSymbol("DOMAIN-INTERACTION-MT"), makeSymbol("SCENARIO-INTERACTION-MT"), makeSymbol("GEN-POINTS"), makeSymbol("STATE") });

    static private final SubLList $list_alt48 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("INTERACTION"), makeKeyword("ACTIVE-SESSION"), makeKeyword("CONSTRUCTION-SESSIONS"), makeKeyword("BROWSING-SESSIONS"), makeKeyword("MERGE-INFO"), makeKeyword("PARSING-MT"), makeKeyword("GENERATION-MT"), makeKeyword("DOMAIN-MT"), makeKeyword("DOMAIN-INTERACTION-MT"), makeKeyword("SCENARIO-INTERACTION-MT"), makeKeyword("GEN-POINTS"), makeKeyword("STATE") });

    static private final SubLList $list_alt49 = list(new SubLObject[]{ makeSymbol("SC-STATE-ID"), makeSymbol("SC-STATE-INTERACTION"), makeSymbol("SC-STATE-ACTIVE-SESSION"), makeSymbol("SC-STATE-CONSTRUCTION-SESSIONS"), makeSymbol("SC-STATE-BROWSING-SESSIONS"), makeSymbol("SC-STATE-MERGE-INFO"), makeSymbol("SC-STATE-PARSING-MT"), makeSymbol("SC-STATE-GENERATION-MT"), makeSymbol("SC-STATE-DOMAIN-MT"), makeSymbol("SC-STATE-DOMAIN-INTERACTION-MT"), makeSymbol("SC-STATE-SCENARIO-INTERACTION-MT"), makeSymbol("SC-STATE-GEN-POINTS"), makeSymbol("SC-STATE-STATE") });

    static private final SubLList $list_alt50 = list(new SubLObject[]{ makeSymbol("_CSETF-SC-STATE-ID"), makeSymbol("_CSETF-SC-STATE-INTERACTION"), makeSymbol("_CSETF-SC-STATE-ACTIVE-SESSION"), makeSymbol("_CSETF-SC-STATE-CONSTRUCTION-SESSIONS"), makeSymbol("_CSETF-SC-STATE-BROWSING-SESSIONS"), makeSymbol("_CSETF-SC-STATE-MERGE-INFO"), makeSymbol("_CSETF-SC-STATE-PARSING-MT"), makeSymbol("_CSETF-SC-STATE-GENERATION-MT"), makeSymbol("_CSETF-SC-STATE-DOMAIN-MT"), makeSymbol("_CSETF-SC-STATE-DOMAIN-INTERACTION-MT"), makeSymbol("_CSETF-SC-STATE-SCENARIO-INTERACTION-MT"), makeSymbol("_CSETF-SC-STATE-GEN-POINTS"), makeSymbol("_CSETF-SC-STATE-STATE") });

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
