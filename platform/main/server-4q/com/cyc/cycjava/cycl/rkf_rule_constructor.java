/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.$rkf_mt$;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.copy_formula;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_implication;
import static com.cyc.cycjava.cycl.el_utilities.possibly_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.hlmt.hlmt_equal;
import static com.cyc.cycjava.cycl.list_utilities.remove_if_not;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_act_constraint_record_nl_sentence;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_act_import_constraint;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_act_remove_all_constraints;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_act_share_scenario_term;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_act_suggest_constraint_cycl_from_text;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_act_suggest_new_indexical_type;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_act_suggest_scenarios;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_constraint_record_sentence;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_number;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_p;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_record_indexical;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_record_var;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_type;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_new_constraint_record;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_new_indexical;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_new_indexical_record;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_new_scenario;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_scenario_constraints;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_scenario_p;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_scenario_phrase;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_scenario_terms;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.user_interaction_agenda.ui_agenda;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_domain_interaction_mt;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_domain_mt;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_generation_interaction_mt;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_parsing_interaction_mt;
import static com.cyc.cycjava.cycl.user_interaction_agenda.user_interaction_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-RULE-CONSTRUCTOR
 * source file: /cyc/top/cycl/rkf-rule-constructor.lisp
 * created:     2019/07/03 17:38:01
 */
public final class rkf_rule_constructor extends SubLTranslatedFile implements V12 {
    public static final class $rc_state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$text;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$interaction;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$if_scenario;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$then_scenario;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$lhs;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$rhs;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$parsing_mt;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$generation_mt;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$domain_mt;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$domain_interaction_mt;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$var_map;
        }

        public SubLObject getField14() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$exceptions;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$text = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$interaction = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$if_scenario = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$then_scenario = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$lhs = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$rhs = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$parsing_mt = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$generation_mt = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$domain_mt = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$domain_interaction_mt = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$var_map = value;
        }

        public SubLObject setField14(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.this.$exceptions = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $text = Lisp.NIL;

        public SubLObject $interaction = Lisp.NIL;

        public SubLObject $if_scenario = Lisp.NIL;

        public SubLObject $then_scenario = Lisp.NIL;

        public SubLObject $lhs = Lisp.NIL;

        public SubLObject $rhs = Lisp.NIL;

        public SubLObject $parsing_mt = Lisp.NIL;

        public SubLObject $generation_mt = Lisp.NIL;

        public SubLObject $domain_mt = Lisp.NIL;

        public SubLObject $domain_interaction_mt = Lisp.NIL;

        public SubLObject $var_map = Lisp.NIL;

        public SubLObject $exceptions = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.class, RC_STATE, RC_STATE_P, $list_alt54, $list_alt55, new String[]{ "$id", "$text", "$interaction", "$if_scenario", "$then_scenario", "$lhs", "$rhs", "$parsing_mt", "$generation_mt", "$domain_mt", "$domain_interaction_mt", "$var_map", "$exceptions" }, $list_alt56, $list_alt57, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $rc_rhs_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.this.$nl_sentence;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.this.$constraints;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.this.$existential_term;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.this.$cycl;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.this.$nl_sentence = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.this.$constraints = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.this.$existential_term = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.this.$cycl = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $nl_sentence = Lisp.NIL;

        public SubLObject $constraints = Lisp.NIL;

        public SubLObject $existential_term = Lisp.NIL;

        public SubLObject $cycl = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.class, RC_RHS, RC_RHS_P, $list_alt34, $list_alt35, new String[]{ "$id", "$nl_sentence", "$constraints", "$existential_term", "$cycl" }, $list_alt36, $list_alt37, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $rc_lhs_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.this.$nl_sentence;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.this.$constraints;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.this.$terms;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.this.$cycl;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.this.$nl_sentence = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.this.$constraints = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.this.$terms = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.this.$cycl = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $nl_sentence = Lisp.NIL;

        public SubLObject $constraints = Lisp.NIL;

        public SubLObject $terms = Lisp.NIL;

        public SubLObject $cycl = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.class, RC_LHS, RC_LHS_P, $list_alt7, $list_alt8, new String[]{ "$id", "$nl_sentence", "$constraints", "$terms", "$cycl" }, $list_alt9, $list_alt10, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new rkf_rule_constructor();



    // deflexical
    // Definitions
    /**
     * Lock for controlling modifications to rule constructor datastructures.
     */
    @LispMethod(comment = "Lock for controlling modifications to rule constructor datastructures.\ndeflexical")
    private static final SubLSymbol $rc_lock$ = makeSymbol("*RC-LOCK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rc_lhs$ = makeSymbol("*DTP-RC-LHS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rc_rhs$ = makeSymbol("*DTP-RC-RHS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rc_state$ = makeSymbol("*DTP-RC-STATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$Rule_Constructor_Lock = makeString("Rule Constructor Lock");

    static private final SubLList $list2 = list(makeSymbol("*RC-LOCK*"));

    public static final SubLSymbol $rc_isg$ = makeSymbol("*RC-ISG*");

    public static final SubLSymbol $rc_index$ = makeSymbol("*RC-INDEX*");

    private static final SubLSymbol RC_LHS = makeSymbol("RC-LHS");

    private static final SubLSymbol RC_LHS_P = makeSymbol("RC-LHS-P");

    static private final SubLList $list7 = list(makeSymbol("ID"), makeSymbol("NL-SENTENCE"), makeSymbol("CONSTRAINTS"), makeSymbol("TERMS"), makeSymbol("CYCL"));

    static private final SubLList $list8 = list(makeKeyword("ID"), makeKeyword("NL-SENTENCE"), makeKeyword("CONSTRAINTS"), makeKeyword("TERMS"), $CYCL);

    static private final SubLList $list9 = list(makeSymbol("RC-LHS-ID"), makeSymbol("RC-LHS-NL-SENTENCE"), makeSymbol("RC-LHS-CONSTRAINTS"), makeSymbol("RC-LHS-TERMS"), makeSymbol("RC-LHS-CYCL"));

    static private final SubLList $list10 = list(makeSymbol("_CSETF-RC-LHS-ID"), makeSymbol("_CSETF-RC-LHS-NL-SENTENCE"), makeSymbol("_CSETF-RC-LHS-CONSTRAINTS"), makeSymbol("_CSETF-RC-LHS-TERMS"), makeSymbol("_CSETF-RC-LHS-CYCL"));

    private static final SubLSymbol RC_LHS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RC-LHS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list13 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RC-LHS-P"));

    private static final SubLSymbol RC_LHS_ID = makeSymbol("RC-LHS-ID");

    private static final SubLSymbol _CSETF_RC_LHS_ID = makeSymbol("_CSETF-RC-LHS-ID");

    private static final SubLSymbol RC_LHS_NL_SENTENCE = makeSymbol("RC-LHS-NL-SENTENCE");

    private static final SubLSymbol _CSETF_RC_LHS_NL_SENTENCE = makeSymbol("_CSETF-RC-LHS-NL-SENTENCE");

    private static final SubLSymbol RC_LHS_CONSTRAINTS = makeSymbol("RC-LHS-CONSTRAINTS");

    private static final SubLSymbol _CSETF_RC_LHS_CONSTRAINTS = makeSymbol("_CSETF-RC-LHS-CONSTRAINTS");

    private static final SubLSymbol RC_LHS_TERMS = makeSymbol("RC-LHS-TERMS");

    private static final SubLSymbol _CSETF_RC_LHS_TERMS = makeSymbol("_CSETF-RC-LHS-TERMS");

    private static final SubLSymbol RC_LHS_CYCL = makeSymbol("RC-LHS-CYCL");

    private static final SubLSymbol _CSETF_RC_LHS_CYCL = makeSymbol("_CSETF-RC-LHS-CYCL");

    private static final SubLString $str29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_RC_LHS = makeSymbol("MAKE-RC-LHS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RC_LHS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RC-LHS-METHOD");

    private static final SubLSymbol RC_RHS = makeSymbol("RC-RHS");

    private static final SubLSymbol RC_RHS_P = makeSymbol("RC-RHS-P");

    private static final SubLList $list40 = list(makeSymbol("ID"), makeSymbol("NL-SENTENCE"), makeSymbol("CONSTRAINTS"), makeSymbol("EXISTENTIAL-TERM"), makeSymbol("CYCL"));

    private static final SubLList $list41 = list(makeKeyword("ID"), makeKeyword("NL-SENTENCE"), makeKeyword("CONSTRAINTS"), makeKeyword("EXISTENTIAL-TERM"), $CYCL);

    private static final SubLList $list42 = list(makeSymbol("RC-RHS-ID"), makeSymbol("RC-RHS-NL-SENTENCE"), makeSymbol("RC-RHS-CONSTRAINTS"), makeSymbol("RC-RHS-EXISTENTIAL-TERM"), makeSymbol("RC-RHS-CYCL"));

    private static final SubLList $list43 = list(makeSymbol("_CSETF-RC-RHS-ID"), makeSymbol("_CSETF-RC-RHS-NL-SENTENCE"), makeSymbol("_CSETF-RC-RHS-CONSTRAINTS"), makeSymbol("_CSETF-RC-RHS-EXISTENTIAL-TERM"), makeSymbol("_CSETF-RC-RHS-CYCL"));

    private static final SubLSymbol RC_RHS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RC-RHS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list45 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RC-RHS-P"));

    private static final SubLSymbol RC_RHS_ID = makeSymbol("RC-RHS-ID");

    private static final SubLSymbol _CSETF_RC_RHS_ID = makeSymbol("_CSETF-RC-RHS-ID");

    private static final SubLSymbol RC_RHS_NL_SENTENCE = makeSymbol("RC-RHS-NL-SENTENCE");

    private static final SubLSymbol _CSETF_RC_RHS_NL_SENTENCE = makeSymbol("_CSETF-RC-RHS-NL-SENTENCE");

    private static final SubLSymbol RC_RHS_CONSTRAINTS = makeSymbol("RC-RHS-CONSTRAINTS");

    private static final SubLSymbol _CSETF_RC_RHS_CONSTRAINTS = makeSymbol("_CSETF-RC-RHS-CONSTRAINTS");

    private static final SubLSymbol RC_RHS_EXISTENTIAL_TERM = makeSymbol("RC-RHS-EXISTENTIAL-TERM");

    private static final SubLSymbol _CSETF_RC_RHS_EXISTENTIAL_TERM = makeSymbol("_CSETF-RC-RHS-EXISTENTIAL-TERM");

    private static final SubLSymbol RC_RHS_CYCL = makeSymbol("RC-RHS-CYCL");

    private static final SubLSymbol _CSETF_RC_RHS_CYCL = makeSymbol("_CSETF-RC-RHS-CYCL");

    private static final SubLSymbol MAKE_RC_RHS = makeSymbol("MAKE-RC-RHS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RC_RHS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RC-RHS-METHOD");

    private static final SubLSymbol SM_CONSTRAINT_RECORD_P = makeSymbol("SM-CONSTRAINT-RECORD-P");

    private static final SubLSymbol SM_INDEXICAL_RECORD_P = makeSymbol("SM-INDEXICAL-RECORD-P");

    private static final SubLSymbol RC_STATE = makeSymbol("RC-STATE");

    private static final SubLSymbol RC_STATE_P = makeSymbol("RC-STATE-P");

    private static final SubLList $list63 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("TEXT"), makeSymbol("INTERACTION"), makeSymbol("IF-SCENARIO"), makeSymbol("THEN-SCENARIO"), makeSymbol("LHS"), makeSymbol("RHS"), makeSymbol("PARSING-MT"), makeSymbol("GENERATION-MT"), makeSymbol("DOMAIN-MT"), makeSymbol("DOMAIN-INTERACTION-MT"), makeSymbol("VAR-MAP"), makeSymbol("EXCEPTIONS") });

    private static final SubLList $list64 = list(new SubLObject[]{ makeKeyword("ID"), $TEXT, makeKeyword("INTERACTION"), makeKeyword("IF-SCENARIO"), makeKeyword("THEN-SCENARIO"), makeKeyword("LHS"), makeKeyword("RHS"), makeKeyword("PARSING-MT"), makeKeyword("GENERATION-MT"), makeKeyword("DOMAIN-MT"), makeKeyword("DOMAIN-INTERACTION-MT"), makeKeyword("VAR-MAP"), makeKeyword("EXCEPTIONS") });

    private static final SubLList $list65 = list(new SubLObject[]{ makeSymbol("RC-STATE-ID"), makeSymbol("RC-STATE-TEXT"), makeSymbol("RC-STATE-INTERACTION"), makeSymbol("RC-STATE-IF-SCENARIO"), makeSymbol("RC-STATE-THEN-SCENARIO"), makeSymbol("RC-STATE-LHS"), makeSymbol("RC-STATE-RHS"), makeSymbol("RC-STATE-PARSING-MT"), makeSymbol("RC-STATE-GENERATION-MT"), makeSymbol("RC-STATE-DOMAIN-MT"), makeSymbol("RC-STATE-DOMAIN-INTERACTION-MT"), makeSymbol("RC-STATE-VAR-MAP"), makeSymbol("RC-STATE-EXCEPTIONS") });

    private static final SubLList $list66 = list(new SubLObject[]{ makeSymbol("_CSETF-RC-STATE-ID"), makeSymbol("_CSETF-RC-STATE-TEXT"), makeSymbol("_CSETF-RC-STATE-INTERACTION"), makeSymbol("_CSETF-RC-STATE-IF-SCENARIO"), makeSymbol("_CSETF-RC-STATE-THEN-SCENARIO"), makeSymbol("_CSETF-RC-STATE-LHS"), makeSymbol("_CSETF-RC-STATE-RHS"), makeSymbol("_CSETF-RC-STATE-PARSING-MT"), makeSymbol("_CSETF-RC-STATE-GENERATION-MT"), makeSymbol("_CSETF-RC-STATE-DOMAIN-MT"), makeSymbol("_CSETF-RC-STATE-DOMAIN-INTERACTION-MT"), makeSymbol("_CSETF-RC-STATE-VAR-MAP"), makeSymbol("_CSETF-RC-STATE-EXCEPTIONS") });

    private static final SubLSymbol RC_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RC-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list68 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RC-STATE-P"));

    private static final SubLSymbol RC_STATE_ID = makeSymbol("RC-STATE-ID");

    private static final SubLSymbol _CSETF_RC_STATE_ID = makeSymbol("_CSETF-RC-STATE-ID");

    private static final SubLSymbol RC_STATE_TEXT = makeSymbol("RC-STATE-TEXT");

    private static final SubLSymbol _CSETF_RC_STATE_TEXT = makeSymbol("_CSETF-RC-STATE-TEXT");

    private static final SubLSymbol RC_STATE_INTERACTION = makeSymbol("RC-STATE-INTERACTION");

    private static final SubLSymbol _CSETF_RC_STATE_INTERACTION = makeSymbol("_CSETF-RC-STATE-INTERACTION");

    private static final SubLSymbol RC_STATE_IF_SCENARIO = makeSymbol("RC-STATE-IF-SCENARIO");

    private static final SubLSymbol _CSETF_RC_STATE_IF_SCENARIO = makeSymbol("_CSETF-RC-STATE-IF-SCENARIO");

    private static final SubLSymbol RC_STATE_THEN_SCENARIO = makeSymbol("RC-STATE-THEN-SCENARIO");

    private static final SubLSymbol _CSETF_RC_STATE_THEN_SCENARIO = makeSymbol("_CSETF-RC-STATE-THEN-SCENARIO");

    private static final SubLSymbol RC_STATE_LHS = makeSymbol("RC-STATE-LHS");

    private static final SubLSymbol _CSETF_RC_STATE_LHS = makeSymbol("_CSETF-RC-STATE-LHS");

    private static final SubLSymbol RC_STATE_RHS = makeSymbol("RC-STATE-RHS");

    private static final SubLSymbol _CSETF_RC_STATE_RHS = makeSymbol("_CSETF-RC-STATE-RHS");

    private static final SubLSymbol RC_STATE_PARSING_MT = makeSymbol("RC-STATE-PARSING-MT");

    private static final SubLSymbol _CSETF_RC_STATE_PARSING_MT = makeSymbol("_CSETF-RC-STATE-PARSING-MT");

    private static final SubLSymbol RC_STATE_GENERATION_MT = makeSymbol("RC-STATE-GENERATION-MT");

    private static final SubLSymbol _CSETF_RC_STATE_GENERATION_MT = makeSymbol("_CSETF-RC-STATE-GENERATION-MT");

    private static final SubLSymbol RC_STATE_DOMAIN_MT = makeSymbol("RC-STATE-DOMAIN-MT");

    private static final SubLSymbol _CSETF_RC_STATE_DOMAIN_MT = makeSymbol("_CSETF-RC-STATE-DOMAIN-MT");

    private static final SubLSymbol RC_STATE_DOMAIN_INTERACTION_MT = makeSymbol("RC-STATE-DOMAIN-INTERACTION-MT");

    private static final SubLSymbol _CSETF_RC_STATE_DOMAIN_INTERACTION_MT = makeSymbol("_CSETF-RC-STATE-DOMAIN-INTERACTION-MT");

    private static final SubLSymbol RC_STATE_VAR_MAP = makeSymbol("RC-STATE-VAR-MAP");

    private static final SubLSymbol _CSETF_RC_STATE_VAR_MAP = makeSymbol("_CSETF-RC-STATE-VAR-MAP");

    private static final SubLSymbol RC_STATE_EXCEPTIONS = makeSymbol("RC-STATE-EXCEPTIONS");

    private static final SubLSymbol _CSETF_RC_STATE_EXCEPTIONS = makeSymbol("_CSETF-RC-STATE-EXCEPTIONS");

    private static final SubLSymbol $DOMAIN_INTERACTION_MT = makeKeyword("DOMAIN-INTERACTION-MT");

    private static final SubLSymbol MAKE_RC_STATE = makeSymbol("MAKE-RC-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RC_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RC-STATE-METHOD");

    private static final SubLSymbol SM_SCENARIO_P = makeSymbol("SM-SCENARIO-P");

    private static final SubLSymbol $sym112$DOUBLETON_ = makeSymbol("DOUBLETON?");

    private static final SubLString $$$If_ = makeString("If ");

    private static final SubLString $str114$__then_ = makeString(", then ");

    private static final SubLSymbol $INSERT_EXPLICIT_TYPE_CONSTRAINTS = makeKeyword("INSERT-EXPLICIT-TYPE-CONSTRAINTS");

    private static final SubLSymbol RKF_ADD_OBJECT_VAR_MAP_ENTRY_RC_STATE_METHOD = makeSymbol("RKF-ADD-OBJECT-VAR-MAP-ENTRY-RC-STATE-METHOD");







    private static final SubLList $list120 = list(makeSymbol("EL-VARIABLE"), makeSymbol("INDEXICAL"));

    private static final SubLString $$$Exceptions = makeString("Exceptions");

    private static final SubLString $str122$Then_Clause = makeString("Then-Clause");

    private static final SubLList $list124 = list(makeSymbol("VAR"), makeSymbol("INDEXICAL-RECORD"));

    public static final SubLObject with_rc_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt2, append(body, NIL));
        }
    }

    public static SubLObject with_rc_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list2, append(body, NIL));
    }

    public static final SubLObject rc_find_lhs_by_id_alt(SubLObject id) {
        return rc_find_object_by_id(id);
    }

    public static SubLObject rc_find_lhs_by_id(final SubLObject id) {
        return rc_find_object_by_id(id);
    }

    public static final SubLObject rc_find_lhs_by_id_string_alt(SubLObject id_string) {
        {
            SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject lhs = rc_find_lhs_by_id(id);
            return lhs;
        }
    }

    public static SubLObject rc_find_lhs_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject lhs = rc_find_lhs_by_id(id);
        return lhs;
    }

    public static final SubLObject rc_find_rhs_by_id_alt(SubLObject id) {
        return rc_find_object_by_id(id);
    }

    public static SubLObject rc_find_rhs_by_id(final SubLObject id) {
        return rc_find_object_by_id(id);
    }

    public static final SubLObject rc_find_rhs_by_id_string_alt(SubLObject id_string) {
        {
            SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject rhs = rc_find_rhs_by_id(id);
            return rhs;
        }
    }

    public static SubLObject rc_find_rhs_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject rhs = rc_find_rhs_by_id(id);
        return rhs;
    }

    public static final SubLObject rc_find_state_by_id_alt(SubLObject id) {
        return rc_find_object_by_id(id);
    }

    public static SubLObject rc_find_state_by_id(final SubLObject id) {
        return rc_find_object_by_id(id);
    }

    public static final SubLObject rc_find_state_by_id_string_alt(SubLObject id_string) {
        {
            SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject state = rc_find_state_by_id(id);
            return state;
        }
    }

    public static SubLObject rc_find_state_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject state = rc_find_state_by_id(id);
        return state;
    }

    public static final SubLObject rc_next_id_alt() {
        return integer_sequence_generator.integer_sequence_generator_next($rc_isg$.getGlobalValue());
    }

    public static SubLObject rc_next_id() {
        return integer_sequence_generator.integer_sequence_generator_next($rc_isg$.getGlobalValue());
    }

    public static final SubLObject rc_add_object_alt(SubLObject id, SubLObject v_object) {
        return dictionary.dictionary_enter($rc_index$.getGlobalValue(), id, v_object);
    }

    public static SubLObject rc_add_object(final SubLObject id, final SubLObject v_object) {
        return dictionary.dictionary_enter($rc_index$.getGlobalValue(), id, v_object);
    }

    public static final SubLObject rc_rem_object_alt(SubLObject id) {
        return dictionary.dictionary_remove($rc_index$.getGlobalValue(), id);
    }

    public static SubLObject rc_rem_object(final SubLObject id) {
        return dictionary.dictionary_remove($rc_index$.getGlobalValue(), id);
    }

    public static final SubLObject rc_find_object_by_id_alt(SubLObject id) {
        return dictionary.dictionary_lookup($rc_index$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject rc_find_object_by_id(final SubLObject id) {
        return dictionary.dictionary_lookup($rc_index$.getGlobalValue(), id, UNPROVIDED);
    }

    public static final SubLObject rc_lhs_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rc_lhs_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rc_lhs_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rc_lhs_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native.class ? T : NIL;
    }

    public static final SubLObject rc_lhs_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_LHS_P);
        return v_object.getField2();
    }

    public static SubLObject rc_lhs_id(final SubLObject v_object) {
        assert NIL != rc_lhs_p(v_object) : "! rkf_rule_constructor.rc_lhs_p(v_object) " + "rkf_rule_constructor.rc_lhs_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rc_lhs_nl_sentence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_LHS_P);
        return v_object.getField3();
    }

    public static SubLObject rc_lhs_nl_sentence(final SubLObject v_object) {
        assert NIL != rc_lhs_p(v_object) : "! rkf_rule_constructor.rc_lhs_p(v_object) " + "rkf_rule_constructor.rc_lhs_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rc_lhs_constraints_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_LHS_P);
        return v_object.getField4();
    }

    public static SubLObject rc_lhs_constraints(final SubLObject v_object) {
        assert NIL != rc_lhs_p(v_object) : "! rkf_rule_constructor.rc_lhs_p(v_object) " + "rkf_rule_constructor.rc_lhs_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rc_lhs_terms_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_LHS_P);
        return v_object.getField5();
    }

    public static SubLObject rc_lhs_terms(final SubLObject v_object) {
        assert NIL != rc_lhs_p(v_object) : "! rkf_rule_constructor.rc_lhs_p(v_object) " + "rkf_rule_constructor.rc_lhs_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rc_lhs_cycl_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_LHS_P);
        return v_object.getField6();
    }

    public static SubLObject rc_lhs_cycl(final SubLObject v_object) {
        assert NIL != rc_lhs_p(v_object) : "! rkf_rule_constructor.rc_lhs_p(v_object) " + "rkf_rule_constructor.rc_lhs_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_rc_lhs_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_LHS_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rc_lhs_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_lhs_p(v_object) : "! rkf_rule_constructor.rc_lhs_p(v_object) " + "rkf_rule_constructor.rc_lhs_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rc_lhs_nl_sentence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_LHS_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rc_lhs_nl_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_lhs_p(v_object) : "! rkf_rule_constructor.rc_lhs_p(v_object) " + "rkf_rule_constructor.rc_lhs_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rc_lhs_constraints_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_LHS_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rc_lhs_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_lhs_p(v_object) : "! rkf_rule_constructor.rc_lhs_p(v_object) " + "rkf_rule_constructor.rc_lhs_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rc_lhs_terms_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_LHS_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rc_lhs_terms(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_lhs_p(v_object) : "! rkf_rule_constructor.rc_lhs_p(v_object) " + "rkf_rule_constructor.rc_lhs_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rc_lhs_cycl_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_LHS_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rc_lhs_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_lhs_p(v_object) : "! rkf_rule_constructor.rc_lhs_p(v_object) " + "rkf_rule_constructor.rc_lhs_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_rc_lhs_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_rc_lhs_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NL_SENTENCE)) {
                            _csetf_rc_lhs_nl_sentence(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CONSTRAINTS)) {
                                _csetf_rc_lhs_constraints(v_new, current_value);
                            } else {
                                if (pcase_var.eql($TERMS)) {
                                    _csetf_rc_lhs_terms(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CYCL)) {
                                        _csetf_rc_lhs_cycl(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt28$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_rc_lhs(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_lhs_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_rc_lhs_id(v_new, current_value);
            } else
                if (pcase_var.eql($NL_SENTENCE)) {
                    _csetf_rc_lhs_nl_sentence(v_new, current_value);
                } else
                    if (pcase_var.eql($CONSTRAINTS)) {
                        _csetf_rc_lhs_constraints(v_new, current_value);
                    } else
                        if (pcase_var.eql($TERMS)) {
                            _csetf_rc_lhs_terms(v_new, current_value);
                        } else
                            if (pcase_var.eql($CYCL)) {
                                _csetf_rc_lhs_cycl(v_new, current_value);
                            } else {
                                Errors.error($str29$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rc_lhs(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RC_LHS, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, rc_lhs_id(obj));
        funcall(visitor_fn, obj, $SLOT, $NL_SENTENCE, rc_lhs_nl_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINTS, rc_lhs_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $TERMS, rc_lhs_terms(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCL, rc_lhs_cycl(obj));
        funcall(visitor_fn, obj, $END, MAKE_RC_LHS, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rc_lhs_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rc_lhs(obj, visitor_fn);
    }

    public static final SubLObject rc_new_lhs_alt() {
        {
            SubLObject lhs = make_rc_lhs(UNPROVIDED);
            SubLObject id = rc_next_id();
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_lhs_id(lhs, id);
                rc_add_object(id, lhs);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return lhs;
        }
    }

    public static SubLObject rc_new_lhs() {
        final SubLObject lhs = make_rc_lhs(UNPROVIDED);
        final SubLObject id = rc_next_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_lhs_id(lhs, id);
            rc_add_object(id, lhs);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return lhs;
    }

    public static final SubLObject rc_cleanup_lhs_alt(SubLObject lhs) {
        SubLTrampolineFile.checkType(lhs, RC_LHS_P);
        {
            SubLObject id = rc_lhs_id(lhs);
            SubLObject success = rc_rem_object(id);
            return success;
        }
    }

    public static SubLObject rc_cleanup_lhs(final SubLObject lhs) {
        assert NIL != rc_lhs_p(lhs) : "! rkf_rule_constructor.rc_lhs_p(lhs) " + ("rkf_rule_constructor.rc_lhs_p(lhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_lhs_p(lhs) ") + lhs;
        final SubLObject id = rc_lhs_id(lhs);
        final SubLObject success = rc_rem_object(id);
        return success;
    }

    public static final SubLObject rc_set_lhs_nl_sentence_alt(SubLObject lhs, SubLObject nl_sentence) {
        SubLTrampolineFile.checkType(lhs, RC_LHS_P);
        SubLTrampolineFile.checkType(nl_sentence, STRINGP);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_lhs_nl_sentence(lhs, nl_sentence);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return lhs;
    }

    public static SubLObject rc_set_lhs_nl_sentence(final SubLObject lhs, final SubLObject nl_sentence) {
        assert NIL != rc_lhs_p(lhs) : "! rkf_rule_constructor.rc_lhs_p(lhs) " + ("rkf_rule_constructor.rc_lhs_p(lhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_lhs_p(lhs) ") + lhs;
        assert NIL != stringp(nl_sentence) : "! stringp(nl_sentence) " + ("Types.stringp(nl_sentence) " + "CommonSymbols.NIL != Types.stringp(nl_sentence) ") + nl_sentence;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_lhs_nl_sentence(lhs, nl_sentence);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return lhs;
    }

    public static final SubLObject rc_set_lhs_constraints_alt(SubLObject lhs, SubLObject constraints) {
        SubLTrampolineFile.checkType(lhs, RC_LHS_P);
        SubLTrampolineFile.checkType(constraints, LISTP);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_lhs_constraints(lhs, constraints);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return lhs;
    }

    public static SubLObject rc_set_lhs_constraints(final SubLObject lhs, final SubLObject constraints) {
        assert NIL != rc_lhs_p(lhs) : "! rkf_rule_constructor.rc_lhs_p(lhs) " + ("rkf_rule_constructor.rc_lhs_p(lhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_lhs_p(lhs) ") + lhs;
        assert NIL != listp(constraints) : "! listp(constraints) " + ("Types.listp(constraints) " + "CommonSymbols.NIL != Types.listp(constraints) ") + constraints;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_lhs_constraints(lhs, constraints);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return lhs;
    }

    public static final SubLObject rc_set_lhs_terms_alt(SubLObject lhs, SubLObject terms) {
        SubLTrampolineFile.checkType(lhs, RC_LHS_P);
        SubLTrampolineFile.checkType(terms, LISTP);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_lhs_terms(lhs, terms);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return lhs;
    }

    public static SubLObject rc_set_lhs_terms(final SubLObject lhs, final SubLObject terms) {
        assert NIL != rc_lhs_p(lhs) : "! rkf_rule_constructor.rc_lhs_p(lhs) " + ("rkf_rule_constructor.rc_lhs_p(lhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_lhs_p(lhs) ") + lhs;
        assert NIL != listp(terms) : "! listp(terms) " + ("Types.listp(terms) " + "CommonSymbols.NIL != Types.listp(terms) ") + terms;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_lhs_terms(lhs, terms);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return lhs;
    }

    public static final SubLObject rc_set_lhs_cycl_alt(SubLObject lhs, SubLObject cycl) {
        SubLTrampolineFile.checkType(lhs, RC_LHS_P);
        SubLTrampolineFile.checkType(cycl, POSSIBLY_SENTENCE_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_lhs_cycl(lhs, cycl);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return lhs;
    }

    public static SubLObject rc_set_lhs_cycl(final SubLObject lhs, final SubLObject cycl) {
        assert NIL != rc_lhs_p(lhs) : "! rkf_rule_constructor.rc_lhs_p(lhs) " + ("rkf_rule_constructor.rc_lhs_p(lhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_lhs_p(lhs) ") + lhs;
        assert NIL != possibly_sentence_p(cycl) : "! el_utilities.possibly_sentence_p(cycl) " + ("el_utilities.possibly_sentence_p(cycl) " + "CommonSymbols.NIL != el_utilities.possibly_sentence_p(cycl) ") + cycl;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_lhs_cycl(lhs, cycl);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return lhs;
    }

    public static final SubLObject rc_rhs_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rc_rhs_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rc_rhs_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rc_rhs_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native.class ? T : NIL;
    }

    public static final SubLObject rc_rhs_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_RHS_P);
        return v_object.getField2();
    }

    public static SubLObject rc_rhs_id(final SubLObject v_object) {
        assert NIL != rc_rhs_p(v_object) : "! rkf_rule_constructor.rc_rhs_p(v_object) " + "rkf_rule_constructor.rc_rhs_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rc_rhs_nl_sentence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_RHS_P);
        return v_object.getField3();
    }

    public static SubLObject rc_rhs_nl_sentence(final SubLObject v_object) {
        assert NIL != rc_rhs_p(v_object) : "! rkf_rule_constructor.rc_rhs_p(v_object) " + "rkf_rule_constructor.rc_rhs_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rc_rhs_constraints_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_RHS_P);
        return v_object.getField4();
    }

    public static SubLObject rc_rhs_constraints(final SubLObject v_object) {
        assert NIL != rc_rhs_p(v_object) : "! rkf_rule_constructor.rc_rhs_p(v_object) " + "rkf_rule_constructor.rc_rhs_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rc_rhs_existential_term_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_RHS_P);
        return v_object.getField5();
    }

    public static SubLObject rc_rhs_existential_term(final SubLObject v_object) {
        assert NIL != rc_rhs_p(v_object) : "! rkf_rule_constructor.rc_rhs_p(v_object) " + "rkf_rule_constructor.rc_rhs_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rc_rhs_cycl_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_RHS_P);
        return v_object.getField6();
    }

    public static SubLObject rc_rhs_cycl(final SubLObject v_object) {
        assert NIL != rc_rhs_p(v_object) : "! rkf_rule_constructor.rc_rhs_p(v_object) " + "rkf_rule_constructor.rc_rhs_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_rc_rhs_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_RHS_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rc_rhs_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_rhs_p(v_object) : "! rkf_rule_constructor.rc_rhs_p(v_object) " + "rkf_rule_constructor.rc_rhs_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rc_rhs_nl_sentence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_RHS_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rc_rhs_nl_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_rhs_p(v_object) : "! rkf_rule_constructor.rc_rhs_p(v_object) " + "rkf_rule_constructor.rc_rhs_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rc_rhs_constraints_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_RHS_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rc_rhs_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_rhs_p(v_object) : "! rkf_rule_constructor.rc_rhs_p(v_object) " + "rkf_rule_constructor.rc_rhs_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rc_rhs_existential_term_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_RHS_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rc_rhs_existential_term(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_rhs_p(v_object) : "! rkf_rule_constructor.rc_rhs_p(v_object) " + "rkf_rule_constructor.rc_rhs_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rc_rhs_cycl_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_RHS_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rc_rhs_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_rhs_p(v_object) : "! rkf_rule_constructor.rc_rhs_p(v_object) " + "rkf_rule_constructor.rc_rhs_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_rc_rhs_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_rc_rhs_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NL_SENTENCE)) {
                            _csetf_rc_rhs_nl_sentence(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CONSTRAINTS)) {
                                _csetf_rc_rhs_constraints(v_new, current_value);
                            } else {
                                if (pcase_var.eql($EXISTENTIAL_TERM)) {
                                    _csetf_rc_rhs_existential_term(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CYCL)) {
                                        _csetf_rc_rhs_cycl(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt28$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_rc_rhs(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_rhs_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_rc_rhs_id(v_new, current_value);
            } else
                if (pcase_var.eql($NL_SENTENCE)) {
                    _csetf_rc_rhs_nl_sentence(v_new, current_value);
                } else
                    if (pcase_var.eql($CONSTRAINTS)) {
                        _csetf_rc_rhs_constraints(v_new, current_value);
                    } else
                        if (pcase_var.eql($EXISTENTIAL_TERM)) {
                            _csetf_rc_rhs_existential_term(v_new, current_value);
                        } else
                            if (pcase_var.eql($CYCL)) {
                                _csetf_rc_rhs_cycl(v_new, current_value);
                            } else {
                                Errors.error($str29$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rc_rhs(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RC_RHS, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, rc_rhs_id(obj));
        funcall(visitor_fn, obj, $SLOT, $NL_SENTENCE, rc_rhs_nl_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINTS, rc_rhs_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $EXISTENTIAL_TERM, rc_rhs_existential_term(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCL, rc_rhs_cycl(obj));
        funcall(visitor_fn, obj, $END, MAKE_RC_RHS, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rc_rhs_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rc_rhs(obj, visitor_fn);
    }

    public static final SubLObject rc_new_rhs_alt() {
        {
            SubLObject rhs = make_rc_rhs(UNPROVIDED);
            SubLObject id = rc_next_id();
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_rhs_id(rhs, id);
                rc_add_object(id, rhs);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return rhs;
        }
    }

    public static SubLObject rc_new_rhs() {
        final SubLObject rhs = make_rc_rhs(UNPROVIDED);
        final SubLObject id = rc_next_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_rhs_id(rhs, id);
            rc_add_object(id, rhs);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }

    public static final SubLObject rc_cleanup_rhs_alt(SubLObject rhs) {
        SubLTrampolineFile.checkType(rhs, RC_RHS_P);
        {
            SubLObject id = rc_rhs_id(rhs);
            SubLObject success = rc_rem_object(id);
            return success;
        }
    }

    public static SubLObject rc_cleanup_rhs(final SubLObject rhs) {
        assert NIL != rc_rhs_p(rhs) : "! rkf_rule_constructor.rc_rhs_p(rhs) " + ("rkf_rule_constructor.rc_rhs_p(rhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_rhs_p(rhs) ") + rhs;
        final SubLObject id = rc_rhs_id(rhs);
        final SubLObject success = rc_rem_object(id);
        return success;
    }

    public static final SubLObject rc_set_rhs_nl_sentence_alt(SubLObject rhs, SubLObject nl_sentence) {
        SubLTrampolineFile.checkType(rhs, RC_RHS_P);
        SubLTrampolineFile.checkType(nl_sentence, STRINGP);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_rhs_nl_sentence(rhs, nl_sentence);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return rhs;
    }

    public static SubLObject rc_set_rhs_nl_sentence(final SubLObject rhs, final SubLObject nl_sentence) {
        assert NIL != rc_rhs_p(rhs) : "! rkf_rule_constructor.rc_rhs_p(rhs) " + ("rkf_rule_constructor.rc_rhs_p(rhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_rhs_p(rhs) ") + rhs;
        assert NIL != stringp(nl_sentence) : "! stringp(nl_sentence) " + ("Types.stringp(nl_sentence) " + "CommonSymbols.NIL != Types.stringp(nl_sentence) ") + nl_sentence;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_rhs_nl_sentence(rhs, nl_sentence);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }

    public static final SubLObject rc_set_rhs_constraints_alt(SubLObject rhs, SubLObject constraints) {
        SubLTrampolineFile.checkType(rhs, RC_RHS_P);
        SubLTrampolineFile.checkType(constraints, LISTP);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_rhs_constraints(rhs, constraints);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return rhs;
    }

    public static SubLObject rc_set_rhs_constraints(final SubLObject rhs, final SubLObject constraints) {
        assert NIL != rc_rhs_p(rhs) : "! rkf_rule_constructor.rc_rhs_p(rhs) " + ("rkf_rule_constructor.rc_rhs_p(rhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_rhs_p(rhs) ") + rhs;
        assert NIL != listp(constraints) : "! listp(constraints) " + ("Types.listp(constraints) " + "CommonSymbols.NIL != Types.listp(constraints) ") + constraints;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_rhs_constraints(rhs, constraints);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }

    public static final SubLObject rc_add_rhs_constraint_alt(SubLObject rhs, SubLObject constraint) {
        SubLTrampolineFile.checkType(rhs, RC_RHS_P);
        SubLTrampolineFile.checkType(constraint, SM_CONSTRAINT_RECORD_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_rhs_constraints(rhs, cons(constraint, rc_rhs_constraints(rhs)));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return rhs;
    }

    public static SubLObject rc_add_rhs_constraint(final SubLObject rhs, final SubLObject constraint) {
        assert NIL != rc_rhs_p(rhs) : "! rkf_rule_constructor.rc_rhs_p(rhs) " + ("rkf_rule_constructor.rc_rhs_p(rhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_rhs_p(rhs) ") + rhs;
        assert NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint) : "! rkf_scenario_manipulator.sm_constraint_record_p(constraint) " + ("rkf_scenario_manipulator.sm_constraint_record_p(constraint) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint) ") + constraint;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_rhs_constraints(rhs, cons(constraint, rc_rhs_constraints(rhs)));
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }

    public static final SubLObject rc_set_rhs_existential_term_alt(SubLObject rhs, SubLObject existential_term) {
        SubLTrampolineFile.checkType(rhs, RC_RHS_P);
        SubLTrampolineFile.checkType(existential_term, SM_INDEXICAL_RECORD_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_rhs_existential_term(rhs, existential_term);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return rhs;
    }

    public static SubLObject rc_set_rhs_existential_term(final SubLObject rhs, final SubLObject existential_term) {
        assert NIL != rc_rhs_p(rhs) : "! rkf_rule_constructor.rc_rhs_p(rhs) " + ("rkf_rule_constructor.rc_rhs_p(rhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_rhs_p(rhs) ") + rhs;
        assert NIL != rkf_scenario_manipulator.sm_indexical_record_p(existential_term) : "! rkf_scenario_manipulator.sm_indexical_record_p(existential_term) " + ("rkf_scenario_manipulator.sm_indexical_record_p(existential_term) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(existential_term) ") + existential_term;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_rhs_existential_term(rhs, existential_term);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }

    public static final SubLObject rc_set_rhs_cycl_alt(SubLObject rhs, SubLObject cycl) {
        SubLTrampolineFile.checkType(rhs, RC_RHS_P);
        SubLTrampolineFile.checkType(cycl, POSSIBLY_SENTENCE_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_rhs_cycl(rhs, cycl);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return rhs;
    }

    public static SubLObject rc_set_rhs_cycl(final SubLObject rhs, final SubLObject cycl) {
        assert NIL != rc_rhs_p(rhs) : "! rkf_rule_constructor.rc_rhs_p(rhs) " + ("rkf_rule_constructor.rc_rhs_p(rhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_rhs_p(rhs) ") + rhs;
        assert NIL != possibly_sentence_p(cycl) : "! el_utilities.possibly_sentence_p(cycl) " + ("el_utilities.possibly_sentence_p(cycl) " + "CommonSymbols.NIL != el_utilities.possibly_sentence_p(cycl) ") + cycl;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_rhs_cycl(rhs, cycl);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }

    public static final SubLObject rc_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rc_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rc_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rc_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native.class ? T : NIL;
    }

    public static final SubLObject rc_state_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject rc_state_id(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rc_state_text_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject rc_state_text(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rc_state_interaction_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject rc_state_interaction(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rc_state_if_scenario_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject rc_state_if_scenario(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rc_state_then_scenario_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject rc_state_then_scenario(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject rc_state_lhs_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject rc_state_lhs(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject rc_state_rhs_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject rc_state_rhs(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject rc_state_parsing_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField9();
    }

    public static SubLObject rc_state_parsing_mt(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject rc_state_generation_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField10();
    }

    public static SubLObject rc_state_generation_mt(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject rc_state_domain_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField11();
    }

    public static SubLObject rc_state_domain_mt(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject rc_state_domain_interaction_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField12();
    }

    public static SubLObject rc_state_domain_interaction_mt(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject rc_state_var_map_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField13();
    }

    public static SubLObject rc_state_var_map(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject rc_state_exceptions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.getField14();
    }

    public static SubLObject rc_state_exceptions(final SubLObject v_object) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject _csetf_rc_state_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rc_state_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rc_state_text_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rc_state_text(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rc_state_interaction_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rc_state_interaction(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rc_state_if_scenario_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rc_state_if_scenario(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rc_state_then_scenario_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rc_state_then_scenario(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_rc_state_lhs_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rc_state_lhs(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_rc_state_rhs_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rc_state_rhs(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_rc_state_parsing_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rc_state_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_rc_state_generation_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_rc_state_generation_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_rc_state_domain_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_rc_state_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_rc_state_domain_interaction_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_rc_state_domain_interaction_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_rc_state_var_map_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_rc_state_var_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_rc_state_exceptions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RC_STATE_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_rc_state_exceptions(final SubLObject v_object, final SubLObject value) {
        assert NIL != rc_state_p(v_object) : "! rkf_rule_constructor.rc_state_p(v_object) " + "rkf_rule_constructor.rc_state_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject make_rc_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_rc_state_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TEXT)) {
                            _csetf_rc_state_text(v_new, current_value);
                        } else {
                            if (pcase_var.eql($INTERACTION)) {
                                _csetf_rc_state_interaction(v_new, current_value);
                            } else {
                                if (pcase_var.eql($IF_SCENARIO)) {
                                    _csetf_rc_state_if_scenario(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($THEN_SCENARIO)) {
                                        _csetf_rc_state_then_scenario(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($LHS)) {
                                            _csetf_rc_state_lhs(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($RHS)) {
                                                _csetf_rc_state_rhs(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($PARSING_MT)) {
                                                    _csetf_rc_state_parsing_mt(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($GENERATION_MT)) {
                                                        _csetf_rc_state_generation_mt(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($DOMAIN_MT)) {
                                                            _csetf_rc_state_domain_mt(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($DOMAIN_INTERACTION_MT)) {
                                                                _csetf_rc_state_domain_interaction_mt(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($VAR_MAP)) {
                                                                    _csetf_rc_state_var_map(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($EXCEPTIONS)) {
                                                                        _csetf_rc_state_exceptions(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str_alt28$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_rc_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_rule_constructor.$rc_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_rc_state_id(v_new, current_value);
            } else
                if (pcase_var.eql($TEXT)) {
                    _csetf_rc_state_text(v_new, current_value);
                } else
                    if (pcase_var.eql($INTERACTION)) {
                        _csetf_rc_state_interaction(v_new, current_value);
                    } else
                        if (pcase_var.eql($IF_SCENARIO)) {
                            _csetf_rc_state_if_scenario(v_new, current_value);
                        } else
                            if (pcase_var.eql($THEN_SCENARIO)) {
                                _csetf_rc_state_then_scenario(v_new, current_value);
                            } else
                                if (pcase_var.eql($LHS)) {
                                    _csetf_rc_state_lhs(v_new, current_value);
                                } else
                                    if (pcase_var.eql($RHS)) {
                                        _csetf_rc_state_rhs(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PARSING_MT)) {
                                            _csetf_rc_state_parsing_mt(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($GENERATION_MT)) {
                                                _csetf_rc_state_generation_mt(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($DOMAIN_MT)) {
                                                    _csetf_rc_state_domain_mt(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($DOMAIN_INTERACTION_MT)) {
                                                        _csetf_rc_state_domain_interaction_mt(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($VAR_MAP)) {
                                                            _csetf_rc_state_var_map(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($EXCEPTIONS)) {
                                                                _csetf_rc_state_exceptions(v_new, current_value);
                                                            } else {
                                                                Errors.error($str29$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rc_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RC_STATE, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, rc_state_id(obj));
        funcall(visitor_fn, obj, $SLOT, $TEXT, rc_state_text(obj));
        funcall(visitor_fn, obj, $SLOT, $INTERACTION, rc_state_interaction(obj));
        funcall(visitor_fn, obj, $SLOT, $IF_SCENARIO, rc_state_if_scenario(obj));
        funcall(visitor_fn, obj, $SLOT, $THEN_SCENARIO, rc_state_then_scenario(obj));
        funcall(visitor_fn, obj, $SLOT, $LHS, rc_state_lhs(obj));
        funcall(visitor_fn, obj, $SLOT, $RHS, rc_state_rhs(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSING_MT, rc_state_parsing_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $GENERATION_MT, rc_state_generation_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $DOMAIN_MT, rc_state_domain_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $DOMAIN_INTERACTION_MT, rc_state_domain_interaction_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $VAR_MAP, rc_state_var_map(obj));
        funcall(visitor_fn, obj, $SLOT, $EXCEPTIONS, rc_state_exceptions(obj));
        funcall(visitor_fn, obj, $END, MAKE_RC_STATE, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rc_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rc_state(obj, visitor_fn);
    }

    public static final SubLObject rc_new_state_alt() {
        {
            SubLObject state = make_rc_state(UNPROVIDED);
            SubLObject id = rc_next_id();
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_id(state, id);
                rc_add_object(id, state);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return state;
        }
    }

    public static SubLObject rc_new_state() {
        final SubLObject state = make_rc_state(UNPROVIDED);
        final SubLObject id = rc_next_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_id(state, id);
            rc_add_object(id, state);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_cleanup_state_alt(SubLObject state) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        {
            SubLObject id = rc_state_id(state);
            SubLObject success = rc_rem_object(id);
            return success;
        }
    }

    public static SubLObject rc_cleanup_state(final SubLObject state) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        final SubLObject id = rc_state_id(state);
        final SubLObject success = rc_rem_object(id);
        return success;
    }

    public static final SubLObject rc_set_state_text_alt(SubLObject state, SubLObject text) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(text, STRINGP);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_text(state, text);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_text(final SubLObject state, final SubLObject text) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != stringp(text) : "! stringp(text) " + ("Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) ") + text;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_text(state, text);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_set_state_interaction_alt(SubLObject state, SubLObject interaction) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_interaction(state, interaction);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_interaction(final SubLObject state, final SubLObject interaction) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != user_interaction_agenda.user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_interaction(state, interaction);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_set_state_if_scenario_alt(SubLObject state, SubLObject v_scenario) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(v_scenario, SM_SCENARIO_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_if_scenario(state, v_scenario);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_if_scenario(final SubLObject state, final SubLObject v_scenario) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : "! rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + ("rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) ") + v_scenario;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_if_scenario(state, v_scenario);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_set_state_then_scenario_alt(SubLObject state, SubLObject v_scenario) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(v_scenario, SM_SCENARIO_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_then_scenario(state, v_scenario);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_then_scenario(final SubLObject state, final SubLObject v_scenario) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : "! rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + ("rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) ") + v_scenario;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_then_scenario(state, v_scenario);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_set_state_lhs_alt(SubLObject state, SubLObject lhs) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(lhs, RC_LHS_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_lhs(state, lhs);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_lhs(final SubLObject state, final SubLObject lhs) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != rc_lhs_p(lhs) : "! rkf_rule_constructor.rc_lhs_p(lhs) " + ("rkf_rule_constructor.rc_lhs_p(lhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_lhs_p(lhs) ") + lhs;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_lhs(state, lhs);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_set_state_rhs_alt(SubLObject state, SubLObject rhs) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(rhs, RC_RHS_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_rhs(state, rhs);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_rhs(final SubLObject state, final SubLObject rhs) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != rc_rhs_p(rhs) : "! rkf_rule_constructor.rc_rhs_p(rhs) " + ("rkf_rule_constructor.rc_rhs_p(rhs) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_rhs_p(rhs) ") + rhs;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_rhs(state, rhs);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_set_state_parsing_mt_alt(SubLObject state, SubLObject parsing_mt) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(parsing_mt, HLMT_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_parsing_mt(state, parsing_mt);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_parsing_mt(final SubLObject state, final SubLObject parsing_mt) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != hlmt.hlmt_p(parsing_mt) : "! hlmt.hlmt_p(parsing_mt) " + ("hlmt.hlmt_p(parsing_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(parsing_mt) ") + parsing_mt;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_parsing_mt(state, parsing_mt);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_set_state_generation_mt_alt(SubLObject state, SubLObject generation_mt) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(generation_mt, HLMT_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_generation_mt(state, generation_mt);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_generation_mt(final SubLObject state, final SubLObject generation_mt) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != hlmt.hlmt_p(generation_mt) : "! hlmt.hlmt_p(generation_mt) " + ("hlmt.hlmt_p(generation_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(generation_mt) ") + generation_mt;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_generation_mt(state, generation_mt);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_set_state_domain_mt_alt(SubLObject state, SubLObject domain_mt) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(domain_mt, HLMT_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_domain_mt(state, domain_mt);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_domain_mt(final SubLObject state, final SubLObject domain_mt) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != hlmt.hlmt_p(domain_mt) : "! hlmt.hlmt_p(domain_mt) " + ("hlmt.hlmt_p(domain_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(domain_mt) ") + domain_mt;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_domain_mt(state, domain_mt);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_set_state_domain_interaction_mt_alt(SubLObject state, SubLObject domain_interaction_mt) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(domain_interaction_mt, HLMT_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_domain_interaction_mt(state, domain_interaction_mt);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_domain_interaction_mt(final SubLObject state, final SubLObject domain_interaction_mt) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != hlmt.hlmt_p(domain_interaction_mt) : "! hlmt.hlmt_p(domain_interaction_mt) " + ("hlmt.hlmt_p(domain_interaction_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(domain_interaction_mt) ") + domain_interaction_mt;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_domain_interaction_mt(state, domain_interaction_mt);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_add_state_var_map_entry_alt(SubLObject state, SubLObject entry) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(entry, $sym100$DOUBLETON_);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_var_map(state, cons(entry, rc_state_var_map(state)));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_add_state_var_map_entry(final SubLObject state, final SubLObject entry) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != list_utilities.doubletonP(entry) : "! list_utilities.doubletonP(entry) " + ("list_utilities.doubletonP(entry) " + "CommonSymbols.NIL != list_utilities.doubletonP(entry) ") + entry;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_var_map(state, cons(entry, rc_state_var_map(state)));
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_set_state_var_map_alt(SubLObject state, SubLObject var_map) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(var_map, LISTP);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_var_map(state, var_map);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_var_map(final SubLObject state, final SubLObject var_map) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != listp(var_map) : "! listp(var_map) " + ("Types.listp(var_map) " + "CommonSymbols.NIL != Types.listp(var_map) ") + var_map;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_var_map(state, var_map);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_set_state_exceptions_alt(SubLObject state, SubLObject exceptions) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(exceptions, LISTP);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_rc_state_exceptions(state, exceptions);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_set_state_exceptions(final SubLObject state, final SubLObject exceptions) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != listp(exceptions) : "! listp(exceptions) " + ("Types.listp(exceptions) " + "CommonSymbols.NIL != Types.listp(exceptions) ") + exceptions;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            _csetf_rc_state_exceptions(state, exceptions);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_add_state_exception_alt(SubLObject state, SubLObject v_scenario) {
        SubLTrampolineFile.checkType(state, RC_STATE_P);
        SubLTrampolineFile.checkType(v_scenario, SM_SCENARIO_P);
        {
            SubLObject lock = $rc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject exceptions = rc_state_exceptions(state);
                    SubLObject item_var = v_scenario;
                    if (NIL == member(item_var, exceptions, symbol_function(EQL), symbol_function(IDENTITY))) {
                        exceptions = cons(item_var, exceptions);
                    }
                    _csetf_rc_state_exceptions(state, exceptions);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rc_add_state_exception(final SubLObject state, final SubLObject v_scenario) {
        assert NIL != rc_state_p(state) : "! rkf_rule_constructor.rc_state_p(state) " + ("rkf_rule_constructor.rc_state_p(state) " + "CommonSymbols.NIL != rkf_rule_constructor.rc_state_p(state) ") + state;
        assert NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : "! rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + ("rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) ") + v_scenario;
        SubLObject release = NIL;
        try {
            release = seize_lock($rc_lock$.getGlobalValue());
            SubLObject exceptions = rc_state_exceptions(state);
            if (NIL == member(v_scenario, exceptions, symbol_function(EQL), symbol_function(IDENTITY))) {
                exceptions = cons(v_scenario, exceptions);
            }
            _csetf_rc_state_exceptions(state, exceptions);
        } finally {
            if (NIL != release) {
                release_lock($rc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rc_ensure_state_lhs_alt(SubLObject state) {
        {
            SubLObject lhs = rc_state_lhs(state);
            if (NIL == rc_lhs_p(lhs)) {
                lhs = rc_new_lhs();
                rc_set_state_lhs(state, lhs);
            }
            return lhs;
        }
    }

    public static SubLObject rc_ensure_state_lhs(final SubLObject state) {
        SubLObject lhs = rc_state_lhs(state);
        if (NIL == rc_lhs_p(lhs)) {
            lhs = rc_new_lhs();
            rc_set_state_lhs(state, lhs);
        }
        return lhs;
    }

    public static final SubLObject rc_ensure_state_rhs_alt(SubLObject state) {
        {
            SubLObject rhs = rc_state_rhs(state);
            if (NIL == rc_rhs_p(rhs)) {
                rhs = rc_new_rhs();
                rc_set_state_rhs(state, rhs);
            }
            return rhs;
        }
    }

    public static SubLObject rc_ensure_state_rhs(final SubLObject state) {
        SubLObject rhs = rc_state_rhs(state);
        if (NIL == rc_rhs_p(rhs)) {
            rhs = rc_new_rhs();
            rc_set_state_rhs(state, rhs);
        }
        return rhs;
    }

    public static final SubLObject rc_state_complete_lhs_p_alt(SubLObject state) {
        {
            SubLObject lhs = rc_state_lhs(state);
            if (NIL != rc_lhs_p(lhs)) {
                return rc_lhs_cycl(lhs);
            }
        }
        return NIL;
    }

    public static SubLObject rc_state_complete_lhs_p(final SubLObject state) {
        final SubLObject lhs = rc_state_lhs(state);
        if (NIL != rc_lhs_p(lhs)) {
            return rc_lhs_cycl(lhs);
        }
        return NIL;
    }

    public static final SubLObject rc_rule_ready_p_alt(SubLObject state) {
        return rc_act_construct_rule_cycl(state);
    }

    public static SubLObject rc_rule_ready_p(final SubLObject state) {
        return rc_act_construct_rule_cycl(state);
    }

    public static final SubLObject rc_act_new_state_alt() {
        {
            SubLObject state = rc_new_state();
            return state;
        }
    }

    public static SubLObject rc_act_new_state() {
        final SubLObject state = rc_new_state();
        return state;
    }

    public static final SubLObject rc_act_new_state_with_text_alt(SubLObject text) {
        {
            SubLObject state = rc_act_new_state();
            rc_set_state_text(state, text);
            return state;
        }
    }

    public static SubLObject rc_act_new_state_with_text(final SubLObject text) {
        final SubLObject state = rc_act_new_state();
        rc_set_state_text(state, text);
        return state;
    }

    public static final SubLObject rc_act_new_state_with_if_then_alt(SubLObject if_sentence, SubLObject then_sentence) {
        {
            SubLObject state = rc_act_new_state();
            SubLObject lhs = rc_new_lhs();
            SubLObject rhs = rc_new_rhs();
            rc_set_lhs_nl_sentence(lhs, if_sentence);
            rc_set_rhs_nl_sentence(rhs, then_sentence);
            rc_set_state_lhs(state, lhs);
            rc_set_state_rhs(state, rhs);
            {
                SubLObject text = cconcatenate($str_alt101$If_, new SubLObject[]{ if_sentence, $str_alt102$__then_, then_sentence });
                rc_set_state_text(state, text);
            }
            return state;
        }
    }

    public static SubLObject rc_act_new_state_with_if_then(final SubLObject if_sentence, final SubLObject then_sentence) {
        final SubLObject state = rc_act_new_state();
        final SubLObject lhs = rc_new_lhs();
        final SubLObject rhs = rc_new_rhs();
        rc_set_lhs_nl_sentence(lhs, if_sentence);
        rc_set_rhs_nl_sentence(rhs, then_sentence);
        rc_set_state_lhs(state, lhs);
        rc_set_state_rhs(state, rhs);
        final SubLObject text = cconcatenate($$$If_, new SubLObject[]{ if_sentence, $str114$__then_, then_sentence });
        rc_set_state_text(state, text);
        return state;
    }

    public static final SubLObject rc_act_note_state_interaction_alt(SubLObject state, SubLObject interaction) {
        rc_set_state_interaction(state, interaction);
        rc_act_initialize_state_context(state);
        return state;
    }

    public static SubLObject rc_act_note_state_interaction(final SubLObject state, final SubLObject interaction) {
        rc_set_state_interaction(state, interaction);
        rc_act_initialize_state_context(state);
        return state;
    }

    public static final SubLObject rc_act_note_state_if_scenario_alt(SubLObject state, SubLObject if_scenario) {
        return rc_set_state_if_scenario(state, if_scenario);
    }

    public static SubLObject rc_act_note_state_if_scenario(final SubLObject state, final SubLObject if_scenario) {
        return rc_set_state_if_scenario(state, if_scenario);
    }

    public static final SubLObject rc_act_note_state_then_scenario_alt(SubLObject state, SubLObject then_scenario) {
        return rc_set_state_then_scenario(state, then_scenario);
    }

    public static SubLObject rc_act_note_state_then_scenario(final SubLObject state, final SubLObject then_scenario) {
        return rc_set_state_then_scenario(state, then_scenario);
    }

    public static final SubLObject rc_act_initialize_state_context_alt(SubLObject state) {
        if (NIL != user_interaction_p(rc_state_interaction(state))) {
            {
                SubLObject v_agenda = ui_agenda(rc_state_interaction(state));
                rc_set_state_parsing_mt(state, uia_parsing_interaction_mt(v_agenda));
                rc_set_state_generation_mt(state, uia_generation_interaction_mt(v_agenda, UNPROVIDED));
                rc_set_state_domain_mt(state, uia_domain_mt(v_agenda));
                rc_set_state_domain_interaction_mt(state, uia_domain_interaction_mt(v_agenda));
            }
        }
        return state;
    }

    public static SubLObject rc_act_initialize_state_context(final SubLObject state) {
        if (NIL != user_interaction_agenda.user_interaction_p(rc_state_interaction(state))) {
            final SubLObject v_agenda = user_interaction_agenda.ui_agenda(rc_state_interaction(state));
            rc_set_state_parsing_mt(state, user_interaction_agenda.uia_parsing_interaction_mt(v_agenda));
            rc_set_state_generation_mt(state, user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED));
            rc_set_state_domain_mt(state, user_interaction_agenda.uia_domain_mt(v_agenda));
            rc_set_state_domain_interaction_mt(state, user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
        }
        return state;
    }

    public static final SubLObject rc_act_lhs_constraint_nl_sentence_alt(SubLObject state, SubLObject constraint_record) {
        {
            SubLObject generation_mt = rc_state_generation_mt(state);
            SubLObject domain_mt = rc_state_domain_interaction_mt(state);
            SubLObject lhs = rc_state_lhs(state);
            SubLObject indexical_records = rc_lhs_terms(lhs);
            return sm_act_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
        }
    }

    public static SubLObject rc_act_lhs_constraint_nl_sentence(final SubLObject state, final SubLObject constraint_record) {
        final SubLObject generation_mt = rc_state_generation_mt(state);
        final SubLObject domain_mt = rc_state_domain_interaction_mt(state);
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject indexical_records = rc_lhs_terms(lhs);
        return rkf_scenario_manipulator.sm_act_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
    }

    public static final SubLObject rc_act_suggest_scenarios_alt(SubLObject state, SubLObject nl_sentence) {
        {
            SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
            SubLObject parsing_mt = rc_state_parsing_mt(state);
            return sm_act_suggest_scenarios(nl_sentence, domain_interaction_mt, parsing_mt);
        }
    }

    public static SubLObject rc_act_suggest_scenarios(final SubLObject state, final SubLObject nl_sentence) {
        final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
        final SubLObject parsing_mt = rc_state_parsing_mt(state);
        return rkf_scenario_manipulator.sm_act_suggest_scenarios(nl_sentence, domain_interaction_mt, parsing_mt);
    }

    public static final SubLObject rc_act_initialize_lhs_from_scenario_alt(SubLObject state) {
        {
            SubLObject lhs = rc_ensure_state_lhs(state);
            SubLObject v_scenario = rc_state_if_scenario(state);
            SubLObject scenario_phrase = sm_scenario_phrase(v_scenario);
            SubLObject constraint_records = sm_scenario_constraints(v_scenario);
            SubLObject indexical_records = sm_scenario_terms(v_scenario);
            rc_set_lhs_constraints(lhs, constraint_records);
            rc_set_lhs_terms(lhs, indexical_records);
            if (NIL != scenario_phrase) {
                rc_set_lhs_and_full_sentence(state, scenario_phrase);
            }
            rc_act_compute_and_record_lhs_cycl(state);
            return lhs;
        }
    }

    public static SubLObject rc_act_initialize_lhs_from_scenario(final SubLObject state) {
        final SubLObject lhs = rc_ensure_state_lhs(state);
        final SubLObject v_scenario = rc_state_if_scenario(state);
        final SubLObject scenario_phrase = rkf_scenario_manipulator.sm_scenario_phrase(v_scenario);
        final SubLObject constraint_records = rkf_scenario_manipulator.sm_scenario_constraints(v_scenario);
        final SubLObject indexical_records = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        rc_set_lhs_constraints(lhs, constraint_records);
        rc_set_lhs_terms(lhs, indexical_records);
        if (NIL != scenario_phrase) {
            rc_set_lhs_and_full_sentence(state, scenario_phrase);
        }
        rc_act_compute_and_record_lhs_cycl(state);
        return lhs;
    }

    public static final SubLObject rc_act_compute_and_record_lhs_cycl_alt(SubLObject state) {
        {
            SubLObject lhs = rc_state_lhs(state);
            SubLObject constraint_records = rc_lhs_constraints(lhs);
            SubLObject indexical_records = rc_lhs_terms(lhs);
            rkf_query_constructor.rkf_compute_and_record_variables(state, indexical_records);
            {
                SubLObject cycl = NIL;
                SubLObject mt = rc_state_domain_interaction_mt(state);
                cycl = rkf_query_constructor.rkf_compute_cycl_from_parts(constraint_records, indexical_records, NIL, NIL, $INSERT_EXPLICIT_TYPE_CONSTRAINTS, mt);
                rc_set_lhs_cycl(lhs, cycl);
                return cycl;
            }
        }
    }

    public static SubLObject rc_act_compute_and_record_lhs_cycl(final SubLObject state) {
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject constraint_records = rc_lhs_constraints(lhs);
        final SubLObject indexical_records = rc_lhs_terms(lhs);
        rkf_query_constructor.rkf_compute_and_record_variables(state, indexical_records);
        SubLObject cycl = NIL;
        final SubLObject mt = rc_state_domain_interaction_mt(state);
        cycl = rkf_query_constructor.rkf_compute_cycl_from_parts(constraint_records, indexical_records, NIL, NIL, $INSERT_EXPLICIT_TYPE_CONSTRAINTS, mt);
        rc_set_lhs_cycl(lhs, cycl);
        return cycl;
    }

    public static final SubLObject rc_set_lhs_and_full_sentence_alt(SubLObject state, SubLObject lhs_nl_sentence) {
        {
            SubLObject lhs = rc_state_lhs(state);
            SubLObject rhs = rc_state_rhs(state);
            SubLObject rhs_nl_sentence = rc_rhs_nl_sentence(rhs);
            SubLObject full_nl_sentence = cconcatenate($str_alt101$If_, new SubLObject[]{ lhs_nl_sentence, $str_alt102$__then_, rhs_nl_sentence });
            rc_set_lhs_nl_sentence(lhs, lhs_nl_sentence);
            rc_set_state_text(state, full_nl_sentence);
        }
        return state;
    }

    public static SubLObject rc_set_lhs_and_full_sentence(final SubLObject state, final SubLObject lhs_nl_sentence) {
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject rhs = rc_state_rhs(state);
        final SubLObject rhs_nl_sentence = rc_rhs_nl_sentence(rhs);
        final SubLObject full_nl_sentence = cconcatenate($$$If_, new SubLObject[]{ lhs_nl_sentence, $str114$__then_, rhs_nl_sentence });
        rc_set_lhs_nl_sentence(lhs, lhs_nl_sentence);
        rc_set_state_text(state, full_nl_sentence);
        return state;
    }

    public static final SubLObject rkf_add_object_var_map_entry_rc_state_method_alt(SubLObject v_object, SubLObject item) {
        return rc_add_state_var_map_entry(v_object, item);
    }

    public static SubLObject rkf_add_object_var_map_entry_rc_state_method(final SubLObject v_object, final SubLObject item) {
        return rc_add_state_var_map_entry(v_object, item);
    }

    public static final SubLObject rc_act_suggest_rhs_constraint_alt(SubLObject state, SubLObject nl_sentence) {
        {
            SubLObject lhs = rc_state_lhs(state);
            SubLObject parsing_mt = rc_state_parsing_mt(state);
            SubLObject semantic_mt = rc_state_domain_interaction_mt(state);
            if (NIL != rc_lhs_p(lhs)) {
                {
                    SubLObject indexical_records = rc_lhs_terms(lhs);
                    SubLObject cycl_sentences = sm_act_suggest_constraint_cycl_from_text(nl_sentence, indexical_records, parsing_mt, semantic_mt);
                    return cycl_sentences;
                }
            }
        }
        return NIL;
    }

    public static SubLObject rc_act_suggest_rhs_constraint(final SubLObject state, final SubLObject nl_sentence) {
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject parsing_mt = rc_state_parsing_mt(state);
        final SubLObject semantic_mt = rc_state_domain_interaction_mt(state);
        if (NIL != rc_lhs_p(lhs)) {
            final SubLObject indexical_records = rc_lhs_terms(lhs);
            final SubLObject cycl_sentences = rkf_scenario_manipulator.sm_act_suggest_constraint_cycl_from_text(nl_sentence, indexical_records, parsing_mt, semantic_mt);
            return cycl_sentences;
        }
        return NIL;
    }

    public static final SubLObject rc_act_add_rhs_constraint_alt(SubLObject state, SubLObject cycl_sentence) {
        {
            SubLObject rhs = rc_ensure_state_rhs(state);
            SubLObject constraint_record = sm_new_constraint_record(cycl_sentence);
            rc_add_rhs_constraint(rhs, constraint_record);
            rc_act_compute_and_record_rhs_cycl(state);
            return state;
        }
    }

    public static SubLObject rc_act_add_rhs_constraint(final SubLObject state, final SubLObject cycl_sentence) {
        final SubLObject rhs = rc_ensure_state_rhs(state);
        final SubLObject constraint_record = rkf_scenario_manipulator.sm_new_constraint_record(cycl_sentence);
        rc_add_rhs_constraint(rhs, constraint_record);
        rc_act_compute_and_record_rhs_cycl(state);
        return state;
    }

    public static final SubLObject rc_act_set_rhs_constraint_alt(SubLObject state, SubLObject cycl_sentence) {
        {
            SubLObject rhs = rc_ensure_state_rhs(state);
            SubLObject constraint_record = sm_new_constraint_record(cycl_sentence);
            rc_set_rhs_constraints(rhs, list(constraint_record));
            rc_act_compute_and_record_rhs_cycl(state);
            return state;
        }
    }

    public static SubLObject rc_act_set_rhs_constraint(final SubLObject state, final SubLObject cycl_sentence) {
        final SubLObject rhs = rc_ensure_state_rhs(state);
        final SubLObject constraint_record = rkf_scenario_manipulator.sm_new_constraint_record(cycl_sentence);
        rc_set_rhs_constraints(rhs, list(constraint_record));
        rc_act_compute_and_record_rhs_cycl(state);
        return state;
    }

    public static final SubLObject rc_act_suggest_rhs_existentential_type_alt(SubLObject state, SubLObject indexical_phrase) {
        {
            SubLObject parsing_mt = rc_state_parsing_mt(state);
            SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
            return sm_act_suggest_new_indexical_type(indexical_phrase, parsing_mt, domain_interaction_mt);
        }
    }

    public static SubLObject rc_act_suggest_rhs_existentential_type(final SubLObject state, final SubLObject indexical_phrase) {
        final SubLObject parsing_mt = rc_state_parsing_mt(state);
        final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
        return rkf_scenario_manipulator.sm_act_suggest_new_indexical_type(indexical_phrase, parsing_mt, domain_interaction_mt);
    }

    public static final SubLObject rc_act_add_existential_of_type_alt(SubLObject state, SubLObject indexical_phrase, SubLObject type) {
        {
            SubLObject indexical_number = rc_next_indexical_number_of_type(state, type);
            SubLObject indexical = sm_new_indexical(type, indexical_number);
            SubLObject indexical_record = sm_new_indexical_record(indexical, list(indexical_phrase), UNPROVIDED, UNPROVIDED);
            SubLObject rhs = rc_state_rhs(state);
            rc_set_rhs_existential_term(rhs, indexical_record);
            return state;
        }
    }

    public static SubLObject rc_act_add_existential_of_type(final SubLObject state, final SubLObject indexical_phrase, final SubLObject type) {
        final SubLObject indexical_number = rc_next_indexical_number_of_type(state, type);
        final SubLObject indexical = rkf_scenario_manipulator.sm_new_indexical(type, indexical_number);
        final SubLObject indexical_record = rkf_scenario_manipulator.sm_new_indexical_record(indexical, list(indexical_phrase), UNPROVIDED, UNPROVIDED);
        final SubLObject rhs = rc_state_rhs(state);
        rc_set_rhs_existential_term(rhs, indexical_record);
        return state;
    }

    public static final SubLObject rc_act_compute_and_record_rhs_cycl_alt(SubLObject state) {
        {
            SubLObject rhs = rc_state_rhs(state);
            SubLObject existential = rc_rhs_existential_term(rhs);
            SubLObject constraint_records = rc_rhs_constraints(rhs);
            SubLObject lhs = rc_state_lhs(state);
            SubLObject indexical_records = rc_lhs_terms(lhs);
            SubLObject cycl = NIL;
            if (NIL != existential) {
                rkf_query_constructor.rkf_compute_and_record_variables(state, list(existential));
                indexical_records = cons(existential, indexical_records);
            }
            {
                SubLObject cycl_1 = NIL;
                cycl_1 = rkf_query_constructor.rkf_compute_cycl_from_parts(constraint_records, indexical_records, NIL != existential ? ((SubLObject) (list(existential))) : NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                rc_set_rhs_cycl(rhs, cycl_1);
            }
            {
                SubLObject then_scenario = rc_act_ensure_then_scenario(state);
                SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
                SubLObject cdolist_list_var = constraint_records;
                SubLObject constraint_record = NIL;
                for (constraint_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_record = cdolist_list_var.first()) {
                    sm_act_import_constraint(then_scenario, constraint_record, domain_interaction_mt);
                }
            }
            return cycl;
        }
    }

    public static SubLObject rc_act_compute_and_record_rhs_cycl(final SubLObject state) {
        final SubLObject rhs = rc_state_rhs(state);
        final SubLObject existential = rc_rhs_existential_term(rhs);
        final SubLObject constraint_records = rc_rhs_constraints(rhs);
        final SubLObject lhs = rc_state_lhs(state);
        SubLObject indexical_records = rc_lhs_terms(lhs);
        final SubLObject cycl = NIL;
        if (NIL != existential) {
            rkf_query_constructor.rkf_compute_and_record_variables(state, list(existential));
            indexical_records = cons(existential, indexical_records);
        }
        SubLObject cycl_$1 = NIL;
        cycl_$1 = rkf_query_constructor.rkf_compute_cycl_from_parts(constraint_records, indexical_records, NIL != existential ? list(existential) : NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        rc_set_rhs_cycl(rhs, cycl_$1);
        final SubLObject then_scenario = rc_act_ensure_then_scenario(state);
        final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_scenario_manipulator.sm_act_import_constraint(then_scenario, constraint_record, domain_interaction_mt);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        return cycl;
    }

    public static final SubLObject rc_act_set_rhs_nl_sentence_alt(SubLObject state, SubLObject rhs_nl_sentence) {
        {
            SubLObject rhs = rc_state_rhs(state);
            SubLObject lhs = rc_state_lhs(state);
            SubLObject lhs_nl_sentence = rc_lhs_nl_sentence(lhs);
            SubLObject new_full_sentence = cconcatenate($str_alt101$If_, new SubLObject[]{ lhs_nl_sentence, $str_alt102$__then_, rhs_nl_sentence });
            rc_set_rhs_nl_sentence(rhs, rhs_nl_sentence);
            rc_set_state_text(state, new_full_sentence);
        }
        return state;
    }

    public static SubLObject rc_act_set_rhs_nl_sentence(final SubLObject state, final SubLObject rhs_nl_sentence) {
        final SubLObject rhs = rc_state_rhs(state);
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject lhs_nl_sentence = rc_lhs_nl_sentence(lhs);
        final SubLObject new_full_sentence = cconcatenate($$$If_, new SubLObject[]{ lhs_nl_sentence, $str114$__then_, rhs_nl_sentence });
        rc_set_rhs_nl_sentence(rhs, rhs_nl_sentence);
        rc_set_state_text(state, new_full_sentence);
        return state;
    }

    public static final SubLObject rc_next_indexical_number_of_type_alt(SubLObject state, SubLObject type) {
        {
            SubLObject lhs = rc_state_lhs(state);
            SubLObject terms = rc_lhs_terms(lhs);
            SubLObject number = ZERO_INTEGER;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject indexical = sm_indexical_record_indexical(v_term);
                    SubLObject indexical_type = sm_indexical_type(indexical);
                    SubLObject indexical_number = sm_indexical_number(indexical);
                    if (type == indexical_type) {
                        number = add(ONE_INTEGER, max(number, indexical_number));
                    }
                }
            }
            return number;
        }
    }

    public static SubLObject rc_next_indexical_number_of_type(final SubLObject state, final SubLObject type) {
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject terms = rc_lhs_terms(lhs);
        SubLObject number = ZERO_INTEGER;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(v_term);
            final SubLObject indexical_type = rkf_scenario_manipulator.sm_indexical_type(indexical);
            final SubLObject indexical_number = rkf_scenario_manipulator.sm_indexical_number(indexical);
            if (type.eql(indexical_type)) {
                number = add(ONE_INTEGER, max(number, indexical_number));
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return number;
    }

    public static final SubLObject rc_act_construct_rule_cycl_alt(SubLObject state) {
        {
            SubLObject lhs = rc_state_lhs(state);
            SubLObject lhs_cycl = rc_lhs_cycl(lhs);
            SubLObject rhs = rc_state_rhs(state);
            SubLObject rhs_cycl = rc_rhs_cycl(rhs);
            SubLObject rule_cycl = NIL;
            if ((NIL != lhs_cycl) && (NIL != rhs_cycl)) {
                rule_cycl = make_implication(lhs_cycl, rhs_cycl);
            }
            return rule_cycl;
        }
    }

    public static SubLObject rc_act_construct_rule_cycl(final SubLObject state) {
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject lhs_cycl = rc_lhs_cycl(lhs);
        final SubLObject rhs = rc_state_rhs(state);
        final SubLObject rhs_cycl = rc_rhs_cycl(rhs);
        SubLObject rule_cycl = NIL;
        if ((NIL != lhs_cycl) && (NIL != rhs_cycl)) {
            rule_cycl = make_implication(lhs_cycl, rhs_cycl);
        }
        return rule_cycl;
    }

    public static final SubLObject rc_act_assert_rule_alt(SubLObject state) {
        {
            SubLObject rule_cycl = rc_act_construct_rule_cycl(state);
            SubLObject assert_mt = rc_state_domain_interaction_mt(state);
            SubLObject result = rkf_assertion_utilities.rkf_assert(rule_cycl, assert_mt, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = rc_state_exceptions(state);
            SubLObject exception = NIL;
            for (exception = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , exception = cdolist_list_var.first()) {
                {
                    SubLObject except_clause = rc_act_compute_cycl_for_exception(state, exception, rule_cycl, assert_mt);
                    rkf_assertion_utilities.rkf_assert(except_clause, assert_mt, UNPROVIDED, UNPROVIDED);
                }
            }
            return result;
        }
    }

    public static SubLObject rc_act_assert_rule(final SubLObject state) {
        final SubLObject rule_cycl = rc_act_construct_rule_cycl(state);
        final SubLObject assert_mt = rc_state_domain_interaction_mt(state);
        final SubLObject result = rkf_assertion_utilities.rkf_assert(rule_cycl, assert_mt, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = rc_state_exceptions(state);
        SubLObject exception = NIL;
        exception = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject except_clause = rc_act_compute_cycl_for_exception(state, exception, rule_cycl, assert_mt);
            rkf_assertion_utilities.rkf_assert(except_clause, assert_mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            exception = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject rc_act_compute_cycl_for_exception_alt(SubLObject state, SubLObject exception, SubLObject rule_cycl, SubLObject mt) {
        if ((NIL != singletonP(sm_scenario_terms(exception))) && (NIL != singletonP(sm_scenario_constraints(exception)))) {
            return rc_act_compute_except_for_expression(state, exception, rule_cycl, mt);
        } else {
            return rc_act_compute_except_when_expression(state, exception, rule_cycl, mt);
        }
    }

    public static SubLObject rc_act_compute_cycl_for_exception(final SubLObject state, final SubLObject exception, final SubLObject rule_cycl, final SubLObject mt) {
        if ((NIL != list_utilities.singletonP(rkf_scenario_manipulator.sm_scenario_terms(exception))) && (NIL != list_utilities.singletonP(rkf_scenario_manipulator.sm_scenario_constraints(exception)))) {
            return rc_act_compute_except_for_expression(state, exception, rule_cycl, mt);
        }
        return rc_act_compute_except_when_expression(state, exception, rule_cycl, mt);
    }

    public static final SubLObject rc_act_compute_except_when_expression_alt(SubLObject state, SubLObject exception, SubLObject rule_cycl, SubLObject mt) {
        {
            SubLObject constraints = sm_scenario_constraints(exception);
            SubLObject existential_terms = NIL;
            SubLObject assumed_constraints = NIL;
            SubLObject terms = sm_scenario_terms(exception);
            SubLObject exception_clause = rkf_query_constructor.rkf_compute_cycl_from_parts(constraints, terms, existential_terms, assumed_constraints, UNPROVIDED, UNPROVIDED);
            if (NIL == hlmt_equal(mt, rc_state_domain_interaction_mt(state))) {
                rule_cycl = make_binary_formula($$ist, mt, rule_cycl);
                exception_clause = rc_adjust_exception_clause_vars_to_foreign_rule(exception_clause, rc_state_var_map(state));
            }
            return make_binary_formula($$exceptWhen, exception_clause, rule_cycl);
        }
    }

    public static SubLObject rc_act_compute_except_when_expression(final SubLObject state, final SubLObject exception, SubLObject rule_cycl, final SubLObject mt) {
        final SubLObject constraints = rkf_scenario_manipulator.sm_scenario_constraints(exception);
        final SubLObject existential_terms = NIL;
        final SubLObject assumed_constraints = NIL;
        final SubLObject terms = rkf_scenario_manipulator.sm_scenario_terms(exception);
        SubLObject exception_clause = rkf_query_constructor.rkf_compute_cycl_from_parts(constraints, terms, existential_terms, assumed_constraints, UNPROVIDED, UNPROVIDED);
        if (NIL == hlmt.hlmt_equal(mt, rc_state_domain_interaction_mt(state))) {
            rule_cycl = make_binary_formula($$ist, mt, rule_cycl);
            exception_clause = rc_adjust_exception_clause_vars_to_foreign_rule(exception_clause, rc_state_var_map(state));
        }
        return make_binary_formula($$exceptWhen, exception_clause, rule_cycl);
    }

    public static final SubLObject rc_act_compute_except_for_expression_alt(SubLObject state, SubLObject exception, SubLObject rule_cycl, SubLObject mt) {
        {
            SubLObject constraints = sm_scenario_constraints(exception);
            SubLObject exception_term = rc_find_the_exception_term(constraints);
            if (NIL == hlmt_equal(mt, rc_state_domain_interaction_mt(state))) {
                rule_cycl = make_binary_formula($$ist, mt, rule_cycl);
            }
            return make_binary_formula($$exceptFor, exception_term, rule_cycl);
        }
    }

    public static SubLObject rc_act_compute_except_for_expression(final SubLObject state, final SubLObject exception, SubLObject rule_cycl, final SubLObject mt) {
        final SubLObject constraints = rkf_scenario_manipulator.sm_scenario_constraints(exception);
        final SubLObject exception_term = rc_find_the_exception_term(constraints);
        if (NIL == hlmt.hlmt_equal(mt, rc_state_domain_interaction_mt(state))) {
            rule_cycl = make_binary_formula($$ist, mt, rule_cycl);
        }
        return make_binary_formula($$exceptFor, exception_term, rule_cycl);
    }

    /**
     * We can assume here that constraints is a singleton.
     */
    @LispMethod(comment = "We can assume here that constraints is a singleton.")
    public static final SubLObject rc_find_the_exception_term_alt(SubLObject constraints) {
        {
            SubLObject constraint = constraints.first();
            SubLObject formula = sm_constraint_record_sentence(constraint);
            return NIL != sm_indexical_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)) ? ((SubLObject) (cycl_utilities.formula_arg2(formula, UNPROVIDED))) : cycl_utilities.formula_arg1(formula, UNPROVIDED);
        }
    }

    @LispMethod(comment = "We can assume here that constraints is a singleton.")
    public static SubLObject rc_find_the_exception_term(final SubLObject constraints) {
        final SubLObject constraint = constraints.first();
        final SubLObject formula = rkf_scenario_manipulator.sm_constraint_record_sentence(constraint);
        return NIL != rkf_scenario_manipulator.sm_indexical_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)) ? cycl_utilities.formula_arg2(formula, UNPROVIDED) : cycl_utilities.formula_arg1(formula, UNPROVIDED);
    }

    /**
     * Because we are working from an existing rule, we cannot use our vars,
     * we have to use theirs. Fortunately, this is only true for the exception
     * clause, so we can simply do a pattern replace via the varmap.
     */
    @LispMethod(comment = "Because we are working from an existing rule, we cannot use our vars,\r\nwe have to use theirs. Fortunately, this is only true for the exception\r\nclause, so we can simply do a pattern replace via the varmap.\nBecause we are working from an existing rule, we cannot use our vars,\nwe have to use theirs. Fortunately, this is only true for the exception\nclause, so we can simply do a pattern replace via the varmap.")
    public static final SubLObject rc_adjust_exception_clause_vars_to_foreign_rule_alt(SubLObject clause, SubLObject var_map) {
        {
            SubLObject new_clause = copy_formula(clause);
            SubLObject cdolist_list_var = var_map;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                {
                    SubLObject datum = var;
                    SubLObject current = datum;
                    SubLObject el_variable = NIL;
                    SubLObject indexical = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt108);
                    el_variable = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt108);
                    indexical = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject scenario_el_variable = sm_indexical_record_var(indexical);
                            if (el_variable != scenario_el_variable) {
                                nsubst(el_variable, scenario_el_variable, new_clause, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt108);
                    }
                }
            }
            return new_clause;
        }
    }

    @LispMethod(comment = "Because we are working from an existing rule, we cannot use our vars,\r\nwe have to use theirs. Fortunately, this is only true for the exception\r\nclause, so we can simply do a pattern replace via the varmap.\nBecause we are working from an existing rule, we cannot use our vars,\nwe have to use theirs. Fortunately, this is only true for the exception\nclause, so we can simply do a pattern replace via the varmap.")
    public static SubLObject rc_adjust_exception_clause_vars_to_foreign_rule(final SubLObject clause, final SubLObject var_map) {
        final SubLObject new_clause = copy_formula(clause);
        SubLObject cdolist_list_var = var_map;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = var;
            SubLObject el_variable = NIL;
            SubLObject indexical = NIL;
            destructuring_bind_must_consp(current, datum, $list120);
            el_variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list120);
            indexical = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject scenario_el_variable = rkf_scenario_manipulator.sm_indexical_record_var(indexical);
                if (!el_variable.eql(scenario_el_variable)) {
                    nsubst(el_variable, scenario_el_variable, new_clause, UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list120);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return new_clause;
    }

    public static final SubLObject rc_act_construct_exception_scenario_alt(SubLObject state) {
        {
            SubLObject v_scenario = sm_new_scenario($$$Exceptions, UNPROVIDED, UNPROVIDED);
            SubLObject varmap = rc_state_var_map(state);
            SubLObject cdolist_list_var = varmap;
            SubLObject variable = NIL;
            for (variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable = cdolist_list_var.first()) {
                {
                    SubLObject datum = variable;
                    SubLObject current = datum;
                    SubLObject el_variable = NIL;
                    SubLObject indexical = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt108);
                    el_variable = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt108);
                    indexical = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        sm_act_share_scenario_term(v_scenario, indexical);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt108);
                    }
                }
            }
            return v_scenario;
        }
    }

    public static SubLObject rc_act_construct_exception_scenario(final SubLObject state) {
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_new_scenario($$$Exceptions, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject varmap = cdolist_list_var = rc_state_var_map(state);
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = variable;
            SubLObject el_variable = NIL;
            SubLObject indexical = NIL;
            destructuring_bind_must_consp(current, datum, $list120);
            el_variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list120);
            indexical = current.first();
            current = current.rest();
            if (NIL == current) {
                rkf_scenario_manipulator.sm_act_share_scenario_term(v_scenario, indexical);
            } else {
                cdestructuring_bind_error(datum, $list120);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        return v_scenario;
    }

    public static final SubLObject rc_act_add_new_exception_scenario_alt(SubLObject state, SubLObject exception) {
        return rc_add_state_exception(state, exception);
    }

    public static SubLObject rc_act_add_new_exception_scenario(final SubLObject state, final SubLObject exception) {
        return rc_add_state_exception(state, exception);
    }

    public static final SubLObject rc_act_exception_constraints_alt(SubLObject state, SubLObject exception) {
        return sm_scenario_constraints(exception);
    }

    public static SubLObject rc_act_exception_constraints(final SubLObject state, final SubLObject exception) {
        return rkf_scenario_manipulator.sm_scenario_constraints(exception);
    }

    public static final SubLObject rc_act_ensure_then_scenario_alt(SubLObject state) {
        {
            SubLObject v_scenario = rc_state_then_scenario(state);
            if (NIL == sm_scenario_p(v_scenario)) {
                v_scenario = rc_act_construct_then_scenario(state);
                rc_set_state_then_scenario(state, v_scenario);
            }
            return v_scenario;
        }
    }

    public static SubLObject rc_act_ensure_then_scenario(final SubLObject state) {
        SubLObject v_scenario = rc_state_then_scenario(state);
        if (NIL == rkf_scenario_manipulator.sm_scenario_p(v_scenario)) {
            v_scenario = rc_act_construct_then_scenario(state);
            rc_set_state_then_scenario(state, v_scenario);
        }
        return v_scenario;
    }

    public static final SubLObject rc_act_construct_then_scenario_alt(SubLObject state) {
        {
            SubLObject v_scenario = sm_new_scenario($str_alt110$Then_Clause, UNPROVIDED, UNPROVIDED);
            SubLObject varmap = rc_state_var_map(state);
            SubLObject cdolist_list_var = varmap;
            SubLObject variable = NIL;
            for (variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable = cdolist_list_var.first()) {
                {
                    SubLObject datum = variable;
                    SubLObject current = datum;
                    SubLObject el_variable = NIL;
                    SubLObject indexical = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt108);
                    el_variable = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt108);
                    indexical = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        sm_act_share_scenario_term(v_scenario, indexical);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt108);
                    }
                }
            }
            return v_scenario;
        }
    }

    public static SubLObject rc_act_construct_then_scenario(final SubLObject state) {
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_new_scenario($str122$Then_Clause, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject varmap = cdolist_list_var = rc_state_var_map(state);
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = variable;
            SubLObject el_variable = NIL;
            SubLObject indexical = NIL;
            destructuring_bind_must_consp(current, datum, $list120);
            el_variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list120);
            indexical = current.first();
            current = current.rest();
            if (NIL == current) {
                rkf_scenario_manipulator.sm_act_share_scenario_term(v_scenario, indexical);
            } else {
                cdestructuring_bind_error(datum, $list120);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        return v_scenario;
    }

    public static final SubLObject rc_act_update_then_scenario_alt(SubLObject state, SubLObject then_scenario) {
        {
            SubLObject constraints = sm_scenario_constraints(then_scenario);
            rc_set_rhs_constraints(rc_state_rhs(state), constraints);
        }
        rc_act_compute_and_record_rhs_cycl(state);
        return state;
    }

    public static SubLObject rc_act_update_then_scenario(final SubLObject state, final SubLObject then_scenario) {
        final SubLObject constraints = rkf_scenario_manipulator.sm_scenario_constraints(then_scenario);
        rc_set_rhs_constraints(rc_state_rhs(state), constraints);
        rc_act_compute_and_record_rhs_cycl(state);
        return state;
    }

    public static final SubLObject rc_act_initialize_rule_for_consequent_alt(SubLObject state, SubLObject consequent, SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
                SubLObject generation_mt = rc_state_generation_mt(state);
                thread.resetMultipleValues();
                {
                    SubLObject v_scenario = sm_act_initialize_scenario_from_cycl(consequent, domain_interaction_mt, generation_mt);
                    SubLObject var_map = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    rc_set_state_var_map(state, var_map);
                    {
                        SubLObject lhs = rc_ensure_state_lhs(state);
                        rc_set_lhs_terms(lhs, Mapping.mapcar(SECOND, var_map));
                    }
                    {
                        SubLObject rhs = rc_ensure_state_rhs(state);
                        rc_set_rhs_cycl(rhs, consequent);
                        rc_set_rhs_nl_sentence(rhs, phrase);
                        rc_set_rhs_constraints(rhs, sm_scenario_constraints(v_scenario));
                    }
                    sm_act_remove_all_constraints(v_scenario, domain_interaction_mt);
                    rc_set_state_if_scenario(state, v_scenario);
                }
            }
            return state;
        }
    }

    public static SubLObject rc_act_initialize_rule_for_consequent(final SubLObject state, final SubLObject consequent, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
        final SubLObject generation_mt = rc_state_generation_mt(state);
        thread.resetMultipleValues();
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl(consequent, domain_interaction_mt, generation_mt);
        final SubLObject var_map = thread.secondMultipleValue();
        thread.resetMultipleValues();
        rc_set_state_var_map(state, var_map);
        final SubLObject lhs = rc_ensure_state_lhs(state);
        rc_set_lhs_terms(lhs, Mapping.mapcar(SECOND, var_map));
        final SubLObject rhs = rc_ensure_state_rhs(state);
        rc_set_rhs_cycl(rhs, consequent);
        rc_set_rhs_nl_sentence(rhs, phrase);
        rc_set_rhs_constraints(rhs, rkf_scenario_manipulator.sm_scenario_constraints(v_scenario));
        rkf_scenario_manipulator.sm_act_remove_all_constraints(v_scenario, domain_interaction_mt);
        rc_set_state_if_scenario(state, v_scenario);
        return state;
    }

    public static final SubLObject rc_act_initialize_rule_from_cycl_alt(SubLObject state, SubLObject implication_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != rc_valid_implication(implication_sentence)) {
                {
                    SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
                    SubLObject generation_mt = rc_state_generation_mt(state);
                    thread.resetMultipleValues();
                    {
                        SubLObject connective = unmake_binary_formula(implication_sentence);
                        SubLObject lhs_sentence = thread.secondMultipleValue();
                        SubLObject rhs_sentence = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject v_scenario = sm_act_initialize_scenario_from_cycl(lhs_sentence, domain_interaction_mt, generation_mt);
                            SubLObject var_map = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            rc_set_state_var_map(state, var_map);
                            rc_set_state_if_scenario(state, v_scenario);
                            {
                                SubLObject lhs = rc_act_initialize_lhs_from_scenario(state);
                                SubLObject rhs = rc_act_initialize_rhs_from_cycl(state, rhs_sentence);
                                rc_set_state_lhs(state, lhs);
                                rc_set_state_rhs(state, rhs);
                            }
                        }
                    }
                }
            }
            return state;
        }
    }

    public static SubLObject rc_act_initialize_rule_from_cycl(final SubLObject state, final SubLObject implication_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != rc_valid_implication(implication_sentence)) {
            final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
            final SubLObject generation_mt = rc_state_generation_mt(state);
            thread.resetMultipleValues();
            final SubLObject connective = unmake_binary_formula(implication_sentence);
            final SubLObject lhs_sentence = thread.secondMultipleValue();
            final SubLObject rhs_sentence = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl(lhs_sentence, domain_interaction_mt, generation_mt);
            final SubLObject var_map = thread.secondMultipleValue();
            thread.resetMultipleValues();
            rc_set_state_var_map(state, var_map);
            rc_set_state_if_scenario(state, v_scenario);
            final SubLObject lhs = rc_act_initialize_lhs_from_scenario(state);
            final SubLObject rhs = rc_act_initialize_rhs_from_cycl(state, rhs_sentence);
            rc_set_state_lhs(state, lhs);
            rc_set_state_rhs(state, rhs);
        }
        return state;
    }

    /**
     * returns T IFF CYCL-SENTENCE is of the form that can be imported into the
     * Rule Constructor.
     */
    @LispMethod(comment = "returns T IFF CYCL-SENTENCE is of the form that can be imported into the\r\nRule Constructor.\nreturns T IFF CYCL-SENTENCE is of the form that can be imported into the\nRule Constructor.")
    public static final SubLObject rc_valid_implication_alt(SubLObject cycl_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == el_implication_p(cycl_utilities.hl_to_el(cycl_sentence))) {
                return NIL;
            }
            thread.resetMultipleValues();
            {
                SubLObject connective = unmake_binary_formula(cycl_sentence);
                SubLObject lhs = thread.secondMultipleValue();
                SubLObject rhs = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (!(((NIL != el_conjunction_p(lhs)) || (NIL != atomic_sentenceP(lhs))) && (NIL != atomic_sentenceP(rhs)))) {
                    return NIL;
                }
                return T;
            }
        }
    }

    @LispMethod(comment = "returns T IFF CYCL-SENTENCE is of the form that can be imported into the\r\nRule Constructor.\nreturns T IFF CYCL-SENTENCE is of the form that can be imported into the\nRule Constructor.")
    public static SubLObject rc_valid_implication(final SubLObject cycl_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_implication_p(cycl_utilities.hl_to_el(cycl_sentence))) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject connective = unmake_binary_formula(cycl_sentence);
        final SubLObject lhs = thread.secondMultipleValue();
        final SubLObject rhs = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (((NIL == el_conjunction_p(lhs)) && (NIL == atomic_sentenceP(lhs))) || (NIL == atomic_sentenceP(rhs))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject rc_act_initialize_rhs_from_cycl_alt(SubLObject state, SubLObject cycl_sentence) {
        {
            SubLObject rhs = rc_ensure_state_rhs(state);
            SubLObject var_map = rc_state_var_map(state);
            SubLObject rhs_cycl = copy_formula(cycl_sentence);
            SubLObject cdolist_list_var = var_map;
            SubLObject var_map_entry = NIL;
            for (var_map_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var_map_entry = cdolist_list_var.first()) {
                {
                    SubLObject datum = var_map_entry;
                    SubLObject current = datum;
                    SubLObject var = NIL;
                    SubLObject indexical_record = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    indexical_record = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject indexical = sm_indexical_record_indexical(indexical_record);
                            cycl_utilities.expression_nsubst(indexical, var, rhs_cycl, UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt112);
                    }
                }
            }
            rc_act_set_rhs_constraint(state, rhs_cycl);
            {
                SubLObject constraint_record = rc_rhs_constraints(rhs).first();
                rc_act_lhs_constraint_nl_sentence(state, constraint_record);
            }
            rc_act_compute_and_record_rhs_cycl(state);
            return rhs;
        }
    }

    public static SubLObject rc_act_initialize_rhs_from_cycl(final SubLObject state, final SubLObject cycl_sentence) {
        final SubLObject rhs = rc_ensure_state_rhs(state);
        final SubLObject var_map = rc_state_var_map(state);
        final SubLObject rhs_cycl = copy_formula(cycl_sentence);
        SubLObject cdolist_list_var = var_map;
        SubLObject var_map_entry = NIL;
        var_map_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = var_map_entry;
            SubLObject var = NIL;
            SubLObject indexical_record = NIL;
            destructuring_bind_must_consp(current, datum, $list124);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list124);
            indexical_record = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record);
                cycl_utilities.expression_nsubst(indexical, var, rhs_cycl, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list124);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var_map_entry = cdolist_list_var.first();
        } 
        rc_act_set_rhs_constraint(state, rhs_cycl);
        final SubLObject constraint_record = rc_rhs_constraints(rhs).first();
        rc_act_lhs_constraint_nl_sentence(state, constraint_record);
        rc_act_compute_and_record_rhs_cycl(state);
        return rhs;
    }

    /**
     * Find the assertion for a given sentence that can come from a range of Mts
     * by first retrieving its term mentioning set and then pairing it down to
     * the true spec-mt.
     */
    @LispMethod(comment = "Find the assertion for a given sentence that can come from a range of Mts\r\nby first retrieving its term mentioning set and then pairing it down to\r\nthe true spec-mt.\nFind the assertion for a given sentence that can come from a range of Mts\nby first retrieving its term mentioning set and then pairing it down to\nthe true spec-mt.")
    public static final SubLObject rkf_find_assertion_for_sentence_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            SubLObject assertions = rkf_similar_assertions_locator(sentence, mt);
            SubLObject solution = NIL;
            if (NIL == solution) {
                {
                    SubLObject csome_list_var = assertions;
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != solution) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        {
                            SubLObject found = czer_meta.find_assertion_cycl(sentence, assertions_high.assertion_mt(assertion));
                            if (found == assertion) {
                                solution = assertion;
                            }
                        }
                    }
                }
            }
            return solution;
        }
    }

    @LispMethod(comment = "Find the assertion for a given sentence that can come from a range of Mts\r\nby first retrieving its term mentioning set and then pairing it down to\r\nthe true spec-mt.\nFind the assertion for a given sentence that can come from a range of Mts\nby first retrieving its term mentioning set and then pairing it down to\nthe true spec-mt.")
    public static SubLObject rkf_find_assertion_for_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLObject assertions = rkf_similar_assertions_locator(sentence, mt);
        SubLObject solution = NIL;
        if (NIL == solution) {
            SubLObject csome_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = csome_list_var.first();
            while ((NIL == solution) && (NIL != csome_list_var)) {
                final SubLObject found = czer_meta.find_assertion_cycl(sentence, assertions_high.assertion_mt(assertion));
                if (found.eql(assertion)) {
                    solution = assertion;
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            } 
        }
        return solution;
    }

    public static final SubLObject rkf_similar_assertions_locator_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject terms = remove_if_not(INDEXED_TERM_P, rkf_gather_similar_assertion_terms(sentence, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject assertions = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        assertions = virtual_indexing.assertions_mentioning_terms(terms, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return assertions;
            }
        }
    }

    public static SubLObject rkf_similar_assertions_locator(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms = list_utilities.remove_if_not(INDEXED_TERM_P, rkf_gather_similar_assertion_terms(sentence, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            assertions = virtual_indexing.assertions_mentioning_terms(terms, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    /**
     * Get the pieces out that the canonicalizer would leave around.
     */
    @LispMethod(comment = "Get the pieces out that the canonicalizer would leave around.")
    public static final SubLObject rkf_gather_similar_assertion_terms_alt(SubLObject sentence, SubLObject mt) {
        {
            SubLObject cnf = czer_main.el_to_hl(sentence, mt);
            return virtual_indexing.terms_for_overlap_index(cnf);
        }
    }

    @LispMethod(comment = "Get the pieces out that the canonicalizer would leave around.")
    public static SubLObject rkf_gather_similar_assertion_terms(final SubLObject sentence, final SubLObject mt) {
        final SubLObject cnf = czer_main.el_to_hl(sentence, mt);
        return virtual_indexing.terms_for_overlap_index(cnf);
    }

    public static SubLObject declare_rkf_rule_constructor_file() {
        declareMacro("with_rc_lock", "WITH-RC-LOCK");
        declareFunction("rc_find_lhs_by_id", "RC-FIND-LHS-BY-ID", 1, 0, false);
        declareFunction("rc_find_lhs_by_id_string", "RC-FIND-LHS-BY-ID-STRING", 1, 0, false);
        declareFunction("rc_find_rhs_by_id", "RC-FIND-RHS-BY-ID", 1, 0, false);
        declareFunction("rc_find_rhs_by_id_string", "RC-FIND-RHS-BY-ID-STRING", 1, 0, false);
        declareFunction("rc_find_state_by_id", "RC-FIND-STATE-BY-ID", 1, 0, false);
        declareFunction("rc_find_state_by_id_string", "RC-FIND-STATE-BY-ID-STRING", 1, 0, false);
        declareFunction("rc_next_id", "RC-NEXT-ID", 0, 0, false);
        declareFunction("rc_add_object", "RC-ADD-OBJECT", 2, 0, false);
        declareFunction("rc_rem_object", "RC-REM-OBJECT", 1, 0, false);
        declareFunction("rc_find_object_by_id", "RC-FIND-OBJECT-BY-ID", 1, 0, false);
        declareFunction("rc_lhs_print_function_trampoline", "RC-LHS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rc_lhs_p", "RC-LHS-P", 1, 0, false);
        new rkf_rule_constructor.$rc_lhs_p$UnaryFunction();
        declareFunction("rc_lhs_id", "RC-LHS-ID", 1, 0, false);
        declareFunction("rc_lhs_nl_sentence", "RC-LHS-NL-SENTENCE", 1, 0, false);
        declareFunction("rc_lhs_constraints", "RC-LHS-CONSTRAINTS", 1, 0, false);
        declareFunction("rc_lhs_terms", "RC-LHS-TERMS", 1, 0, false);
        declareFunction("rc_lhs_cycl", "RC-LHS-CYCL", 1, 0, false);
        declareFunction("_csetf_rc_lhs_id", "_CSETF-RC-LHS-ID", 2, 0, false);
        declareFunction("_csetf_rc_lhs_nl_sentence", "_CSETF-RC-LHS-NL-SENTENCE", 2, 0, false);
        declareFunction("_csetf_rc_lhs_constraints", "_CSETF-RC-LHS-CONSTRAINTS", 2, 0, false);
        declareFunction("_csetf_rc_lhs_terms", "_CSETF-RC-LHS-TERMS", 2, 0, false);
        declareFunction("_csetf_rc_lhs_cycl", "_CSETF-RC-LHS-CYCL", 2, 0, false);
        declareFunction("make_rc_lhs", "MAKE-RC-LHS", 0, 1, false);
        declareFunction("visit_defstruct_rc_lhs", "VISIT-DEFSTRUCT-RC-LHS", 2, 0, false);
        declareFunction("visit_defstruct_object_rc_lhs_method", "VISIT-DEFSTRUCT-OBJECT-RC-LHS-METHOD", 2, 0, false);
        declareFunction("rc_new_lhs", "RC-NEW-LHS", 0, 0, false);
        declareFunction("rc_cleanup_lhs", "RC-CLEANUP-LHS", 1, 0, false);
        declareFunction("rc_set_lhs_nl_sentence", "RC-SET-LHS-NL-SENTENCE", 2, 0, false);
        declareFunction("rc_set_lhs_constraints", "RC-SET-LHS-CONSTRAINTS", 2, 0, false);
        declareFunction("rc_set_lhs_terms", "RC-SET-LHS-TERMS", 2, 0, false);
        declareFunction("rc_set_lhs_cycl", "RC-SET-LHS-CYCL", 2, 0, false);
        declareFunction("rc_rhs_print_function_trampoline", "RC-RHS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rc_rhs_p", "RC-RHS-P", 1, 0, false);
        new rkf_rule_constructor.$rc_rhs_p$UnaryFunction();
        declareFunction("rc_rhs_id", "RC-RHS-ID", 1, 0, false);
        declareFunction("rc_rhs_nl_sentence", "RC-RHS-NL-SENTENCE", 1, 0, false);
        declareFunction("rc_rhs_constraints", "RC-RHS-CONSTRAINTS", 1, 0, false);
        declareFunction("rc_rhs_existential_term", "RC-RHS-EXISTENTIAL-TERM", 1, 0, false);
        declareFunction("rc_rhs_cycl", "RC-RHS-CYCL", 1, 0, false);
        declareFunction("_csetf_rc_rhs_id", "_CSETF-RC-RHS-ID", 2, 0, false);
        declareFunction("_csetf_rc_rhs_nl_sentence", "_CSETF-RC-RHS-NL-SENTENCE", 2, 0, false);
        declareFunction("_csetf_rc_rhs_constraints", "_CSETF-RC-RHS-CONSTRAINTS", 2, 0, false);
        declareFunction("_csetf_rc_rhs_existential_term", "_CSETF-RC-RHS-EXISTENTIAL-TERM", 2, 0, false);
        declareFunction("_csetf_rc_rhs_cycl", "_CSETF-RC-RHS-CYCL", 2, 0, false);
        declareFunction("make_rc_rhs", "MAKE-RC-RHS", 0, 1, false);
        declareFunction("visit_defstruct_rc_rhs", "VISIT-DEFSTRUCT-RC-RHS", 2, 0, false);
        declareFunction("visit_defstruct_object_rc_rhs_method", "VISIT-DEFSTRUCT-OBJECT-RC-RHS-METHOD", 2, 0, false);
        declareFunction("rc_new_rhs", "RC-NEW-RHS", 0, 0, false);
        declareFunction("rc_cleanup_rhs", "RC-CLEANUP-RHS", 1, 0, false);
        declareFunction("rc_set_rhs_nl_sentence", "RC-SET-RHS-NL-SENTENCE", 2, 0, false);
        declareFunction("rc_set_rhs_constraints", "RC-SET-RHS-CONSTRAINTS", 2, 0, false);
        declareFunction("rc_add_rhs_constraint", "RC-ADD-RHS-CONSTRAINT", 2, 0, false);
        declareFunction("rc_set_rhs_existential_term", "RC-SET-RHS-EXISTENTIAL-TERM", 2, 0, false);
        declareFunction("rc_set_rhs_cycl", "RC-SET-RHS-CYCL", 2, 0, false);
        declareFunction("rc_state_print_function_trampoline", "RC-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rc_state_p", "RC-STATE-P", 1, 0, false);
        new rkf_rule_constructor.$rc_state_p$UnaryFunction();
        declareFunction("rc_state_id", "RC-STATE-ID", 1, 0, false);
        declareFunction("rc_state_text", "RC-STATE-TEXT", 1, 0, false);
        declareFunction("rc_state_interaction", "RC-STATE-INTERACTION", 1, 0, false);
        declareFunction("rc_state_if_scenario", "RC-STATE-IF-SCENARIO", 1, 0, false);
        declareFunction("rc_state_then_scenario", "RC-STATE-THEN-SCENARIO", 1, 0, false);
        declareFunction("rc_state_lhs", "RC-STATE-LHS", 1, 0, false);
        declareFunction("rc_state_rhs", "RC-STATE-RHS", 1, 0, false);
        declareFunction("rc_state_parsing_mt", "RC-STATE-PARSING-MT", 1, 0, false);
        declareFunction("rc_state_generation_mt", "RC-STATE-GENERATION-MT", 1, 0, false);
        declareFunction("rc_state_domain_mt", "RC-STATE-DOMAIN-MT", 1, 0, false);
        declareFunction("rc_state_domain_interaction_mt", "RC-STATE-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction("rc_state_var_map", "RC-STATE-VAR-MAP", 1, 0, false);
        declareFunction("rc_state_exceptions", "RC-STATE-EXCEPTIONS", 1, 0, false);
        declareFunction("_csetf_rc_state_id", "_CSETF-RC-STATE-ID", 2, 0, false);
        declareFunction("_csetf_rc_state_text", "_CSETF-RC-STATE-TEXT", 2, 0, false);
        declareFunction("_csetf_rc_state_interaction", "_CSETF-RC-STATE-INTERACTION", 2, 0, false);
        declareFunction("_csetf_rc_state_if_scenario", "_CSETF-RC-STATE-IF-SCENARIO", 2, 0, false);
        declareFunction("_csetf_rc_state_then_scenario", "_CSETF-RC-STATE-THEN-SCENARIO", 2, 0, false);
        declareFunction("_csetf_rc_state_lhs", "_CSETF-RC-STATE-LHS", 2, 0, false);
        declareFunction("_csetf_rc_state_rhs", "_CSETF-RC-STATE-RHS", 2, 0, false);
        declareFunction("_csetf_rc_state_parsing_mt", "_CSETF-RC-STATE-PARSING-MT", 2, 0, false);
        declareFunction("_csetf_rc_state_generation_mt", "_CSETF-RC-STATE-GENERATION-MT", 2, 0, false);
        declareFunction("_csetf_rc_state_domain_mt", "_CSETF-RC-STATE-DOMAIN-MT", 2, 0, false);
        declareFunction("_csetf_rc_state_domain_interaction_mt", "_CSETF-RC-STATE-DOMAIN-INTERACTION-MT", 2, 0, false);
        declareFunction("_csetf_rc_state_var_map", "_CSETF-RC-STATE-VAR-MAP", 2, 0, false);
        declareFunction("_csetf_rc_state_exceptions", "_CSETF-RC-STATE-EXCEPTIONS", 2, 0, false);
        declareFunction("make_rc_state", "MAKE-RC-STATE", 0, 1, false);
        declareFunction("visit_defstruct_rc_state", "VISIT-DEFSTRUCT-RC-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_rc_state_method", "VISIT-DEFSTRUCT-OBJECT-RC-STATE-METHOD", 2, 0, false);
        declareFunction("rc_new_state", "RC-NEW-STATE", 0, 0, false);
        declareFunction("rc_cleanup_state", "RC-CLEANUP-STATE", 1, 0, false);
        declareFunction("rc_set_state_text", "RC-SET-STATE-TEXT", 2, 0, false);
        declareFunction("rc_set_state_interaction", "RC-SET-STATE-INTERACTION", 2, 0, false);
        declareFunction("rc_set_state_if_scenario", "RC-SET-STATE-IF-SCENARIO", 2, 0, false);
        declareFunction("rc_set_state_then_scenario", "RC-SET-STATE-THEN-SCENARIO", 2, 0, false);
        declareFunction("rc_set_state_lhs", "RC-SET-STATE-LHS", 2, 0, false);
        declareFunction("rc_set_state_rhs", "RC-SET-STATE-RHS", 2, 0, false);
        declareFunction("rc_set_state_parsing_mt", "RC-SET-STATE-PARSING-MT", 2, 0, false);
        declareFunction("rc_set_state_generation_mt", "RC-SET-STATE-GENERATION-MT", 2, 0, false);
        declareFunction("rc_set_state_domain_mt", "RC-SET-STATE-DOMAIN-MT", 2, 0, false);
        declareFunction("rc_set_state_domain_interaction_mt", "RC-SET-STATE-DOMAIN-INTERACTION-MT", 2, 0, false);
        declareFunction("rc_add_state_var_map_entry", "RC-ADD-STATE-VAR-MAP-ENTRY", 2, 0, false);
        declareFunction("rc_set_state_var_map", "RC-SET-STATE-VAR-MAP", 2, 0, false);
        declareFunction("rc_set_state_exceptions", "RC-SET-STATE-EXCEPTIONS", 2, 0, false);
        declareFunction("rc_add_state_exception", "RC-ADD-STATE-EXCEPTION", 2, 0, false);
        declareFunction("rc_ensure_state_lhs", "RC-ENSURE-STATE-LHS", 1, 0, false);
        declareFunction("rc_ensure_state_rhs", "RC-ENSURE-STATE-RHS", 1, 0, false);
        declareFunction("rc_state_complete_lhs_p", "RC-STATE-COMPLETE-LHS-P", 1, 0, false);
        declareFunction("rc_rule_ready_p", "RC-RULE-READY-P", 1, 0, false);
        declareFunction("rc_act_new_state", "RC-ACT-NEW-STATE", 0, 0, false);
        declareFunction("rc_act_new_state_with_text", "RC-ACT-NEW-STATE-WITH-TEXT", 1, 0, false);
        declareFunction("rc_act_new_state_with_if_then", "RC-ACT-NEW-STATE-WITH-IF-THEN", 2, 0, false);
        declareFunction("rc_act_note_state_interaction", "RC-ACT-NOTE-STATE-INTERACTION", 2, 0, false);
        declareFunction("rc_act_note_state_if_scenario", "RC-ACT-NOTE-STATE-IF-SCENARIO", 2, 0, false);
        declareFunction("rc_act_note_state_then_scenario", "RC-ACT-NOTE-STATE-THEN-SCENARIO", 2, 0, false);
        declareFunction("rc_act_initialize_state_context", "RC-ACT-INITIALIZE-STATE-CONTEXT", 1, 0, false);
        declareFunction("rc_act_lhs_constraint_nl_sentence", "RC-ACT-LHS-CONSTRAINT-NL-SENTENCE", 2, 0, false);
        declareFunction("rc_act_suggest_scenarios", "RC-ACT-SUGGEST-SCENARIOS", 2, 0, false);
        declareFunction("rc_act_initialize_lhs_from_scenario", "RC-ACT-INITIALIZE-LHS-FROM-SCENARIO", 1, 0, false);
        declareFunction("rc_act_compute_and_record_lhs_cycl", "RC-ACT-COMPUTE-AND-RECORD-LHS-CYCL", 1, 0, false);
        declareFunction("rc_set_lhs_and_full_sentence", "RC-SET-LHS-AND-FULL-SENTENCE", 2, 0, false);
        declareFunction("rkf_add_object_var_map_entry_rc_state_method", "RKF-ADD-OBJECT-VAR-MAP-ENTRY-RC-STATE-METHOD", 2, 0, false);
        declareFunction("rc_act_suggest_rhs_constraint", "RC-ACT-SUGGEST-RHS-CONSTRAINT", 2, 0, false);
        declareFunction("rc_act_add_rhs_constraint", "RC-ACT-ADD-RHS-CONSTRAINT", 2, 0, false);
        declareFunction("rc_act_set_rhs_constraint", "RC-ACT-SET-RHS-CONSTRAINT", 2, 0, false);
        declareFunction("rc_act_suggest_rhs_existentential_type", "RC-ACT-SUGGEST-RHS-EXISTENTENTIAL-TYPE", 2, 0, false);
        declareFunction("rc_act_add_existential_of_type", "RC-ACT-ADD-EXISTENTIAL-OF-TYPE", 3, 0, false);
        declareFunction("rc_act_compute_and_record_rhs_cycl", "RC-ACT-COMPUTE-AND-RECORD-RHS-CYCL", 1, 0, false);
        declareFunction("rc_act_set_rhs_nl_sentence", "RC-ACT-SET-RHS-NL-SENTENCE", 2, 0, false);
        declareFunction("rc_next_indexical_number_of_type", "RC-NEXT-INDEXICAL-NUMBER-OF-TYPE", 2, 0, false);
        declareFunction("rc_act_construct_rule_cycl", "RC-ACT-CONSTRUCT-RULE-CYCL", 1, 0, false);
        declareFunction("rc_act_assert_rule", "RC-ACT-ASSERT-RULE", 1, 0, false);
        declareFunction("rc_act_compute_cycl_for_exception", "RC-ACT-COMPUTE-CYCL-FOR-EXCEPTION", 4, 0, false);
        declareFunction("rc_act_compute_except_when_expression", "RC-ACT-COMPUTE-EXCEPT-WHEN-EXPRESSION", 4, 0, false);
        declareFunction("rc_act_compute_except_for_expression", "RC-ACT-COMPUTE-EXCEPT-FOR-EXPRESSION", 4, 0, false);
        declareFunction("rc_find_the_exception_term", "RC-FIND-THE-EXCEPTION-TERM", 1, 0, false);
        declareFunction("rc_adjust_exception_clause_vars_to_foreign_rule", "RC-ADJUST-EXCEPTION-CLAUSE-VARS-TO-FOREIGN-RULE", 2, 0, false);
        declareFunction("rc_act_construct_exception_scenario", "RC-ACT-CONSTRUCT-EXCEPTION-SCENARIO", 1, 0, false);
        declareFunction("rc_act_add_new_exception_scenario", "RC-ACT-ADD-NEW-EXCEPTION-SCENARIO", 2, 0, false);
        declareFunction("rc_act_exception_constraints", "RC-ACT-EXCEPTION-CONSTRAINTS", 2, 0, false);
        declareFunction("rc_act_ensure_then_scenario", "RC-ACT-ENSURE-THEN-SCENARIO", 1, 0, false);
        declareFunction("rc_act_construct_then_scenario", "RC-ACT-CONSTRUCT-THEN-SCENARIO", 1, 0, false);
        declareFunction("rc_act_update_then_scenario", "RC-ACT-UPDATE-THEN-SCENARIO", 2, 0, false);
        declareFunction("rc_act_initialize_rule_for_consequent", "RC-ACT-INITIALIZE-RULE-FOR-CONSEQUENT", 3, 0, false);
        declareFunction("rc_act_initialize_rule_from_cycl", "RC-ACT-INITIALIZE-RULE-FROM-CYCL", 2, 0, false);
        declareFunction("rc_valid_implication", "RC-VALID-IMPLICATION", 1, 0, false);
        declareFunction("rc_act_initialize_rhs_from_cycl", "RC-ACT-INITIALIZE-RHS-FROM-CYCL", 2, 0, false);
        declareFunction("rkf_find_assertion_for_sentence", "RKF-FIND-ASSERTION-FOR-SENTENCE", 1, 1, false);
        declareFunction("rkf_similar_assertions_locator", "RKF-SIMILAR-ASSERTIONS-LOCATOR", 1, 1, false);
        declareFunction("rkf_gather_similar_assertion_terms", "RKF-GATHER-SIMILAR-ASSERTION-TERMS", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("*RC-LOCK*"));

    static private final SubLList $list_alt7 = list(makeSymbol("ID"), makeSymbol("NL-SENTENCE"), makeSymbol("CONSTRAINTS"), makeSymbol("TERMS"), makeSymbol("CYCL"));

    static private final SubLList $list_alt8 = list(makeKeyword("ID"), makeKeyword("NL-SENTENCE"), makeKeyword("CONSTRAINTS"), makeKeyword("TERMS"), $CYCL);

    static private final SubLList $list_alt9 = list(makeSymbol("RC-LHS-ID"), makeSymbol("RC-LHS-NL-SENTENCE"), makeSymbol("RC-LHS-CONSTRAINTS"), makeSymbol("RC-LHS-TERMS"), makeSymbol("RC-LHS-CYCL"));

    static private final SubLList $list_alt10 = list(makeSymbol("_CSETF-RC-LHS-ID"), makeSymbol("_CSETF-RC-LHS-NL-SENTENCE"), makeSymbol("_CSETF-RC-LHS-CONSTRAINTS"), makeSymbol("_CSETF-RC-LHS-TERMS"), makeSymbol("_CSETF-RC-LHS-CYCL"));

    static private final SubLString $str_alt28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt34 = list(makeSymbol("ID"), makeSymbol("NL-SENTENCE"), makeSymbol("CONSTRAINTS"), makeSymbol("EXISTENTIAL-TERM"), makeSymbol("CYCL"));

    static private final SubLList $list_alt35 = list(makeKeyword("ID"), makeKeyword("NL-SENTENCE"), makeKeyword("CONSTRAINTS"), makeKeyword("EXISTENTIAL-TERM"), $CYCL);

    static private final SubLList $list_alt36 = list(makeSymbol("RC-RHS-ID"), makeSymbol("RC-RHS-NL-SENTENCE"), makeSymbol("RC-RHS-CONSTRAINTS"), makeSymbol("RC-RHS-EXISTENTIAL-TERM"), makeSymbol("RC-RHS-CYCL"));

    static private final SubLList $list_alt37 = list(makeSymbol("_CSETF-RC-RHS-ID"), makeSymbol("_CSETF-RC-RHS-NL-SENTENCE"), makeSymbol("_CSETF-RC-RHS-CONSTRAINTS"), makeSymbol("_CSETF-RC-RHS-EXISTENTIAL-TERM"), makeSymbol("_CSETF-RC-RHS-CYCL"));

    public static final SubLObject init_rkf_rule_constructor_file_alt() {
        deflexical("*RC-LOCK*", make_lock($$$Rule_Constructor_Lock));
        deflexical("*RC-ISG*", NIL != boundp($rc_isg$) ? ((SubLObject) ($rc_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*RC-INDEX*", NIL != boundp($rc_index$) ? ((SubLObject) ($rc_index$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-RC-LHS*", RC_LHS);
        defconstant("*DTP-RC-RHS*", RC_RHS);
        defconstant("*DTP-RC-STATE*", RC_STATE);
        return NIL;
    }

    public static SubLObject init_rkf_rule_constructor_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*RC-LOCK*", make_lock($$$Rule_Constructor_Lock));
            deflexical("*RC-ISG*", SubLTrampolineFile.maybeDefault($rc_isg$, $rc_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            deflexical("*RC-INDEX*", SubLTrampolineFile.maybeDefault($rc_index$, $rc_index$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            defconstant("*DTP-RC-LHS*", RC_LHS);
            defconstant("*DTP-RC-RHS*", RC_RHS);
            defconstant("*DTP-RC-STATE*", RC_STATE);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RC-ISG*", NIL != boundp($rc_isg$) ? ((SubLObject) ($rc_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            deflexical("*RC-INDEX*", NIL != boundp($rc_index$) ? ((SubLObject) ($rc_index$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_rkf_rule_constructor_file_Previous() {
        deflexical("*RC-LOCK*", make_lock($$$Rule_Constructor_Lock));
        deflexical("*RC-ISG*", SubLTrampolineFile.maybeDefault($rc_isg$, $rc_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        deflexical("*RC-INDEX*", SubLTrampolineFile.maybeDefault($rc_index$, $rc_index$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-RC-LHS*", RC_LHS);
        defconstant("*DTP-RC-RHS*", RC_RHS);
        defconstant("*DTP-RC-STATE*", RC_STATE);
        return NIL;
    }

    static private final SubLList $list_alt54 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("TEXT"), makeSymbol("INTERACTION"), makeSymbol("IF-SCENARIO"), makeSymbol("THEN-SCENARIO"), makeSymbol("LHS"), makeSymbol("RHS"), makeSymbol("PARSING-MT"), makeSymbol("GENERATION-MT"), makeSymbol("DOMAIN-MT"), makeSymbol("DOMAIN-INTERACTION-MT"), makeSymbol("VAR-MAP"), makeSymbol("EXCEPTIONS") });

    public static SubLObject setup_rkf_rule_constructor_file() {
        declare_defglobal($rc_isg$);
        declare_defglobal($rc_index$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rc_lhs$.getGlobalValue(), symbol_function(RC_LHS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list13);
        def_csetf(RC_LHS_ID, _CSETF_RC_LHS_ID);
        def_csetf(RC_LHS_NL_SENTENCE, _CSETF_RC_LHS_NL_SENTENCE);
        def_csetf(RC_LHS_CONSTRAINTS, _CSETF_RC_LHS_CONSTRAINTS);
        def_csetf(RC_LHS_TERMS, _CSETF_RC_LHS_TERMS);
        def_csetf(RC_LHS_CYCL, _CSETF_RC_LHS_CYCL);
        identity(RC_LHS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rc_lhs$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RC_LHS_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rc_rhs$.getGlobalValue(), symbol_function(RC_RHS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list45);
        def_csetf(RC_RHS_ID, _CSETF_RC_RHS_ID);
        def_csetf(RC_RHS_NL_SENTENCE, _CSETF_RC_RHS_NL_SENTENCE);
        def_csetf(RC_RHS_CONSTRAINTS, _CSETF_RC_RHS_CONSTRAINTS);
        def_csetf(RC_RHS_EXISTENTIAL_TERM, _CSETF_RC_RHS_EXISTENTIAL_TERM);
        def_csetf(RC_RHS_CYCL, _CSETF_RC_RHS_CYCL);
        identity(RC_RHS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rc_rhs$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RC_RHS_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rc_state$.getGlobalValue(), symbol_function(RC_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list68);
        def_csetf(RC_STATE_ID, _CSETF_RC_STATE_ID);
        def_csetf(RC_STATE_TEXT, _CSETF_RC_STATE_TEXT);
        def_csetf(RC_STATE_INTERACTION, _CSETF_RC_STATE_INTERACTION);
        def_csetf(RC_STATE_IF_SCENARIO, _CSETF_RC_STATE_IF_SCENARIO);
        def_csetf(RC_STATE_THEN_SCENARIO, _CSETF_RC_STATE_THEN_SCENARIO);
        def_csetf(RC_STATE_LHS, _CSETF_RC_STATE_LHS);
        def_csetf(RC_STATE_RHS, _CSETF_RC_STATE_RHS);
        def_csetf(RC_STATE_PARSING_MT, _CSETF_RC_STATE_PARSING_MT);
        def_csetf(RC_STATE_GENERATION_MT, _CSETF_RC_STATE_GENERATION_MT);
        def_csetf(RC_STATE_DOMAIN_MT, _CSETF_RC_STATE_DOMAIN_MT);
        def_csetf(RC_STATE_DOMAIN_INTERACTION_MT, _CSETF_RC_STATE_DOMAIN_INTERACTION_MT);
        def_csetf(RC_STATE_VAR_MAP, _CSETF_RC_STATE_VAR_MAP);
        def_csetf(RC_STATE_EXCEPTIONS, _CSETF_RC_STATE_EXCEPTIONS);
        identity(RC_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rc_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RC_STATE_METHOD));
        register_method(rkf_query_constructor.$rkf_add_object_var_map_entry_method_table$.getGlobalValue(), $dtp_rc_state$.getGlobalValue(), symbol_function(RKF_ADD_OBJECT_VAR_MAP_ENTRY_RC_STATE_METHOD));
        return NIL;
    }

    static private final SubLList $list_alt55 = list(new SubLObject[]{ makeKeyword("ID"), $TEXT, makeKeyword("INTERACTION"), makeKeyword("IF-SCENARIO"), makeKeyword("THEN-SCENARIO"), makeKeyword("LHS"), makeKeyword("RHS"), makeKeyword("PARSING-MT"), makeKeyword("GENERATION-MT"), makeKeyword("DOMAIN-MT"), makeKeyword("DOMAIN-INTERACTION-MT"), makeKeyword("VAR-MAP"), makeKeyword("EXCEPTIONS") });

    static private final SubLList $list_alt56 = list(new SubLObject[]{ makeSymbol("RC-STATE-ID"), makeSymbol("RC-STATE-TEXT"), makeSymbol("RC-STATE-INTERACTION"), makeSymbol("RC-STATE-IF-SCENARIO"), makeSymbol("RC-STATE-THEN-SCENARIO"), makeSymbol("RC-STATE-LHS"), makeSymbol("RC-STATE-RHS"), makeSymbol("RC-STATE-PARSING-MT"), makeSymbol("RC-STATE-GENERATION-MT"), makeSymbol("RC-STATE-DOMAIN-MT"), makeSymbol("RC-STATE-DOMAIN-INTERACTION-MT"), makeSymbol("RC-STATE-VAR-MAP"), makeSymbol("RC-STATE-EXCEPTIONS") });

    static private final SubLList $list_alt57 = list(new SubLObject[]{ makeSymbol("_CSETF-RC-STATE-ID"), makeSymbol("_CSETF-RC-STATE-TEXT"), makeSymbol("_CSETF-RC-STATE-INTERACTION"), makeSymbol("_CSETF-RC-STATE-IF-SCENARIO"), makeSymbol("_CSETF-RC-STATE-THEN-SCENARIO"), makeSymbol("_CSETF-RC-STATE-LHS"), makeSymbol("_CSETF-RC-STATE-RHS"), makeSymbol("_CSETF-RC-STATE-PARSING-MT"), makeSymbol("_CSETF-RC-STATE-GENERATION-MT"), makeSymbol("_CSETF-RC-STATE-DOMAIN-MT"), makeSymbol("_CSETF-RC-STATE-DOMAIN-INTERACTION-MT"), makeSymbol("_CSETF-RC-STATE-VAR-MAP"), makeSymbol("_CSETF-RC-STATE-EXCEPTIONS") });

    @Override
    public void declareFunctions() {
        declare_rkf_rule_constructor_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_rule_constructor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_rule_constructor_file();
    }

    static {
    }

    static private final SubLSymbol $sym100$DOUBLETON_ = makeSymbol("DOUBLETON?");

    static private final SubLString $str_alt101$If_ = makeString("If ");

    static private final SubLString $str_alt102$__then_ = makeString(", then ");

    static private final SubLList $list_alt108 = list(makeSymbol("EL-VARIABLE"), makeSymbol("INDEXICAL"));

    static private final SubLString $str_alt110$Then_Clause = makeString("Then-Clause");

    static private final SubLList $list_alt112 = list(makeSymbol("VAR"), makeSymbol("INDEXICAL-RECORD"));

    public static final class $rc_lhs_p$UnaryFunction extends UnaryFunction {
        public $rc_lhs_p$UnaryFunction() {
            super(extractFunctionNamed("RC-LHS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rc_lhs_p(arg1);
        }
    }

    public static final class $rc_rhs_p$UnaryFunction extends UnaryFunction {
        public $rc_rhs_p$UnaryFunction() {
            super(extractFunctionNamed("RC-RHS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rc_rhs_p(arg1);
        }
    }

    public static final class $rc_state_p$UnaryFunction extends UnaryFunction {
        public $rc_state_p$UnaryFunction() {
            super(extractFunctionNamed("RC-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rc_state_p(arg1);
        }
    }
}

/**
 * Total time: 429 ms
 */
