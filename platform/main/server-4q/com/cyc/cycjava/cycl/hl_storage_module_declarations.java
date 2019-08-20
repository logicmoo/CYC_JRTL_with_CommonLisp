/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.designated_sentence;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.enumeration_types.tv_truth;
import static com.cyc.cycjava.cycl.kb_indexing.find_assertion;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_perform_subl;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      HL-STORAGE-MODULE-DECLARATIONS
 * source file: /cyc/top/cycl/hl-storage-module-declarations.lisp
 * created:     2019/07/03 17:37:54
 */
public final class hl_storage_module_declarations extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_regular_kb_assertion_module_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, REGULAR_KB_ASSERTION_MODULE_TEST_CASE, TEST_CONSTANT, NIL);
        classes.subloop_initialize_slot(new_instance, REGULAR_KB_ASSERTION_MODULE_TEST_CASE, TEST_SENTENCE, NIL);
        classes.subloop_initialize_slot(new_instance, REGULAR_KB_ASSERTION_MODULE_TEST_CASE, TEST_MT, NIL);
        classes.subloop_initialize_slot(new_instance, REGULAR_KB_ASSERTION_MODULE_TEST_CASE, TEST_SUPPORT_ASSERTION, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_regular_kb_assertion_module_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_hl_storage_module_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_hl_storage_module_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_regular_kb_assertion_module_test_case_test_support_assertion(SubLObject regular_kb_assertion_module_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(regular_kb_assertion_module_test_case, value, SIX_INTEGER, TEST_SUPPORT_ASSERTION);
    }

    public static final SubLObject set_regular_kb_assertion_module_test_case_test_sentence(SubLObject regular_kb_assertion_module_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(regular_kb_assertion_module_test_case, value, FOUR_INTEGER, TEST_SENTENCE);
    }

    public static final SubLObject set_regular_kb_assertion_module_test_case_test_mt(SubLObject regular_kb_assertion_module_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(regular_kb_assertion_module_test_case, value, FIVE_INTEGER, TEST_MT);
    }

    public static final SubLObject set_regular_kb_assertion_module_test_case_test_constant(SubLObject regular_kb_assertion_module_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(regular_kb_assertion_module_test_case, value, THREE_INTEGER, TEST_CONSTANT);
    }

    public static final SubLObject regular_kb_assertion_module_test_case_p(SubLObject regular_kb_assertion_module_test_case) {
        return classes.subloop_instanceof_class(regular_kb_assertion_module_test_case, REGULAR_KB_ASSERTION_MODULE_TEST_CASE);
    }

    public static final SubLObject hl_storage_module_test_case_p(SubLObject hl_storage_module_test_case) {
        return classes.subloop_instanceof_class(hl_storage_module_test_case, HL_STORAGE_MODULE_TEST_CASE);
    }

    public static final SubLObject get_regular_kb_assertion_module_test_case_test_support_assertion(SubLObject regular_kb_assertion_module_test_case) {
        return classes.subloop_get_access_protected_instance_slot(regular_kb_assertion_module_test_case, SIX_INTEGER, TEST_SUPPORT_ASSERTION);
    }

    public static final SubLObject get_regular_kb_assertion_module_test_case_test_sentence(SubLObject regular_kb_assertion_module_test_case) {
        return classes.subloop_get_access_protected_instance_slot(regular_kb_assertion_module_test_case, FOUR_INTEGER, TEST_SENTENCE);
    }

    public static final SubLObject get_regular_kb_assertion_module_test_case_test_mt(SubLObject regular_kb_assertion_module_test_case) {
        return classes.subloop_get_access_protected_instance_slot(regular_kb_assertion_module_test_case, FIVE_INTEGER, TEST_MT);
    }

    public static final SubLObject get_regular_kb_assertion_module_test_case_test_constant(SubLObject regular_kb_assertion_module_test_case) {
        return classes.subloop_get_access_protected_instance_slot(regular_kb_assertion_module_test_case, THREE_INTEGER, TEST_CONSTANT);
    }

    public static final SubLFile me = new hl_storage_module_declarations();



    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $REGULAR_KB_ASSERTION = makeKeyword("REGULAR-KB-ASSERTION");

    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("Regular KB Assertion"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("APPLICABILITY"), makeSymbol("REGULAR-KB-ASSERTION-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("REGULAR-KB-ASSERTION-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("HL-ADD-AS-KB-ASSERTION"), makeKeyword("REMOVE"), makeSymbol("HL-REMOVE-AS-KB-ASSERTION"), makeKeyword("REMOVE-ALL"), makeSymbol("HL-REMOVE-ALL-AS-KB-ASSERTION") });

    private static final SubLSymbol ASSERTED_ARGUMENT_SPEC_P = makeSymbol("ASSERTED-ARGUMENT-SPEC-P");

    private static final SubLSymbol DEDUCTION_SPEC_P = makeSymbol("DEDUCTION-SPEC-P");

    static private final SubLList $list6 = list(makeKeyword("GENERIC-ERROR"), makeString("Unknown argument type ~S"));

    private static final SubLSymbol HL_ADD_AS_KB_ASSERTION = makeSymbol("HL-ADD-AS-KB-ASSERTION");

    private static final SubLSymbol $ARGUMENT_ALREADY_PRESENT = makeKeyword("ARGUMENT-ALREADY-PRESENT");

    private static final SubLString $str13$Argument_for__S_in__S_is_already_ = makeString("Argument for ~S in ~S is already present");

    private static final SubLString $str15$Unable_to_add_argument_for__S_in_ = makeString("Unable to add argument for ~S in ~S");

    private static final SubLSymbol HL_REMOVE_AS_KB_ASSERTION = makeSymbol("HL-REMOVE-AS-KB-ASSERTION");

    private static final SubLSymbol $ASSERTION_NOT_PRESENT = makeKeyword("ASSERTION-NOT-PRESENT");

    private static final SubLString $str18$Formula__S_in_mt__S_is_not_in_the = makeString("Formula ~S in mt ~S is not in the KB");

    private static final SubLSymbol $ASSERTION_NOT_LOCAL = makeKeyword("ASSERTION-NOT-LOCAL");

    private static final SubLString $str20$Formula__S_in_mt__S_is_not_locall = makeString("Formula ~S in mt ~S is not locally in the KB");

    private static final SubLSymbol $ARGUMENT_NOT_PRESENT = makeKeyword("ARGUMENT-NOT-PRESENT");

    private static final SubLString $str22$Argument__S___for__S_in_mt__S_is_ = makeString("Argument ~S ~%for ~S in mt ~S is not already present");

    static private final SubLList $list26 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("ist"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("ist"), makeKeyword("APPLICABILITY"), makeSymbol("IST-ASSERTION-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("IST-ASSERTION-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("HL-ADD-AS-IST-ASSERTION"), makeKeyword("REMOVE"), makeSymbol("HL-REMOVE-AS-IST-ASSERTION"), makeKeyword("REMOVE-ALL"), makeSymbol("HL-REMOVE-ALL-AS-IST-ASSERTION") });



    static private final SubLList $list28 = list(reader_make_constant_shell("ist"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    private static final SubLList $list29 = list(makeSymbol("SUB-CNF"), makeSymbol("&OPTIONAL"), makeSymbol("SUB-VARIABLE-MAP"), makeSymbol("QUERY-FREE-VARS"));

    private static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("constantName"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("constantName"), makeKeyword("APPLICABILITY"), makeSymbol("CONSTANT-NAME-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("CONSTANT-NAME-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("CONSTANT-NAME-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("CONSTANT-NAME-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("CONSTANT-NAME-HL-STORAGE-UNASSERT-ALL") });



    private static final SubLList $list33 = list(reader_make_constant_shell("constantName"), makeKeyword("CONSTANT"), makeKeyword("STRING"));

    private static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("assertionDirection"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionDirection"), makeKeyword("APPLICABILITY"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-UNASSERT-ALL") });



    private static final SubLList $list37 = list(reader_make_constant_shell("assertionDirection"), makeKeyword("ASSERTION"), list($TEST, makeSymbol("CYCL-DIRECTION-P")));

    private static final SubLSymbol $INDEXICAL_THE_USER = makeKeyword("INDEXICAL-THE-USER");

    private static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("indexicalReferent TheUser"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("indexicalReferent"), makeKeyword("APPLICABILITY"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-UNASSERT-ALL") });



    static private final SubLList $list41 = list(reader_make_constant_shell("indexicalReferent"), reader_make_constant_shell("TheUser"), makeKeyword("FULLY-BOUND"));





    private static final SubLList $list45 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("performSubL"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("performSubL"), makeKeyword("APPLICABILITY"), makeSymbol("PERFORM-SUBL-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("PERFORM-SUBL-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("PERFORM-SUBL-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("PERFORM-SUBL-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("PERFORM-SUBL-HL-STORAGE-UNASSERT-ALL") });

    private static final SubLList $list46 = list(reader_make_constant_shell("performSubL"), list(makeKeyword("OR"), list(reader_make_constant_shell("SubLQuoteFn"), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell("ExpandSubLFn"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("LISTP"))), makeKeyword("FULLY-BOUND"))));

    static private final SubLList $list47 = list(makeKeyword("MT"), makeKeyword("DIRECTION"), makeKeyword("STRENGTH"));



    private static final SubLList $list50 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("repropagateAssertion"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("repropagateAssertion"), makeKeyword("APPLICABILITY"), makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT-ALL") });



    private static final SubLSymbol $RECONSIDER_ASSERTION_DEDUCTIONS = makeKeyword("RECONSIDER-ASSERTION-DEDUCTIONS");

    private static final SubLList $list53 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("reconsiderAssertionDeductions"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("reconsiderAssertionDeductions"), makeKeyword("APPLICABILITY"), makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT-ALL") });



    private static final SubLList $list56 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("sksRegistered"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("sksRegistered"), makeKeyword("APPLICABILITY"), makeSymbol("SKS-REGISTERED-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("SKS-REGISTERED-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("SKS-REGISTERED-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("SKS-REGISTERED-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("SKS-REGISTERED-HL-STORAGE-UNASSERT-ALL") });

    private static final SubLList $list57 = list(reader_make_constant_shell("sksRegistered"), makeKeyword("FULLY-BOUND"));

    private static final SubLSymbol $sym58$SKS_REGISTERED_HL_STORAGE_APPLICABLE_ = makeSymbol("SKS-REGISTERED-HL-STORAGE-APPLICABLE?");

    private static final SubLSymbol SKS_REGISTERED_HL_STORAGE_INCOMPLETENESS = makeSymbol("SKS-REGISTERED-HL-STORAGE-INCOMPLETENESS");

    private static final SubLString $$$HL_Storage_Module_Category = makeString("HL Storage Module Category");

    private static final SubLString $str61$Regular_KB_Assertion_Module_Categ = makeString("Regular KB Assertion Module Category");

    private static final SubLString $$$HL_Storage_Module_Test_Suite = makeString("HL Storage Module Test Suite");



    private static final SubLList $list65 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("assert"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("assert"), makeKeyword("APPLICABILITY"), makeSymbol("ASSERT-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("ASSERT-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("ASSERT-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("ASSERT-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("ASSERT-HL-STORAGE-UNASSERT-ALL") });

    private static final SubLList $list66 = list(makeSymbol("CNF"), makeSymbol("&OPTIONAL"), makeSymbol("VARIABLE-MAP"), makeSymbol("QUERY-FREE-VARS"));

    // Definitions
    public static final SubLObject regular_kb_assertion_applicableP_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        return makeBoolean(((((((((NIL == bookkeeping_store.my_creator_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map)) && (NIL == bookkeeping_store.my_creation_time_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == bookkeeping_store.my_creation_purpose_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == bookkeeping_store.my_creation_second_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == com.cyc.cycjava.cycl.hl_storage_module_declarations.ist_assertion_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == com.cyc.cycjava.cycl.hl_storage_module_declarations.assertion_direction_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == com.cyc.cycjava.cycl.hl_storage_module_declarations.perform_subl_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == com.cyc.cycjava.cycl.hl_storage_module_declarations.indexical_the_user_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == com.cyc.cycjava.cycl.hl_storage_module_declarations.constant_name_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map)));
    }

    // Definitions
    public static SubLObject regular_kb_assertion_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return makeBoolean(((((((((NIL == bookkeeping_store.my_creator_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map)) && (NIL == bookkeeping_store.my_creation_time_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == bookkeeping_store.my_creation_purpose_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == bookkeeping_store.my_creation_second_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == ist_assertion_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == assertion_direction_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == perform_subl_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == indexical_the_user_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == constant_name_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map)));
    }

    public static final SubLObject regular_kb_assertion_incompleteness_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        return NIL;
    }

    public static SubLObject regular_kb_assertion_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return NIL;
    }

    public static final SubLObject hl_add_as_kb_assertion_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        {
            SubLObject argument_type = arguments.argument_spec_type(argument_spec);
            SubLObject pcase_var = argument_type;
            if (pcase_var.eql($ASSERTED_ARGUMENT)) {
                SubLTrampolineFile.checkType(argument_spec, ASSERTED_ARGUMENT_SPEC_P);
                {
                    SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
                    return com.cyc.cycjava.cycl.hl_storage_module_declarations.hl_assert_as_kb_assertion(cnf, mt, strength_spec, direction, variable_map);
                }
            } else {
                if (pcase_var.eql($DEDUCTION)) {
                    SubLTrampolineFile.checkType(argument_spec, DEDUCTION_SPEC_P);
                    {
                        SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
                        return com.cyc.cycjava.cycl.hl_storage_module_declarations.hl_deduce_as_kb_deduction(cnf, mt, supports, direction, variable_map);
                    }
                } else {
                    fi.signal_fi_error($list_alt6);
                    return NIL;
                }
            }
        }
    }

    public static SubLObject hl_add_as_kb_assertion(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject pcase_var;
        final SubLObject argument_type = pcase_var = arguments.argument_spec_type(argument_spec);
        if (pcase_var.eql($ASSERTED_ARGUMENT)) {
            assert NIL != arguments.asserted_argument_spec_p(argument_spec) : "! arguments.asserted_argument_spec_p(argument_spec) " + ("arguments.asserted_argument_spec_p(argument_spec) " + "CommonSymbols.NIL != arguments.asserted_argument_spec_p(argument_spec) ") + argument_spec;
            final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
            return hl_assert_as_kb_assertion(cnf, mt, strength_spec, direction, variable_map);
        } else {
            if (!pcase_var.eql($DEDUCTION)) {
                fi.signal_fi_error($list6);
                return NIL;
            }
            assert NIL != deductions_high.deduction_spec_p(argument_spec) : "! deductions_high.deduction_spec_p(argument_spec) " + ("deductions_high.deduction_spec_p(argument_spec) " + "CommonSymbols.NIL != deductions_high.deduction_spec_p(argument_spec) ") + argument_spec;
            final SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
            final SubLObject v_bindings = deductions_high.deduction_spec_bindings(argument_spec);
            final SubLObject pragmatic_support_mts = deductions_high.deduction_spec_pragmatic_support_mts(argument_spec);
            return hl_deduce_as_kb_deduction(cnf, mt, supports, direction, variable_map, v_bindings, pragmatic_support_mts);
        }
    }

    /**
     *
     *
     * @return boolean; whether the assert succeeded
     */
    @LispMethod(comment = "@return boolean; whether the assert succeeded")
    public static final SubLObject hl_assert_as_kb_assertion_alt(SubLObject cnf, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject variable_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_version = list(cnf, variable_map);
                thread.resetMultipleValues();
                {
                    SubLObject cnf_1 = fi.fi_canonicalize(canon_version, T, strength);
                    SubLObject v_variables = thread.secondMultipleValue();
                    SubLObject hl_tv = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject var_names = Mapping.mapcar(VARIABLE_NAME, v_variables);
                        SubLObject assertion = assertions_high.find_or_create_assertion(cnf_1, mt, var_names, direction);
                        if (NIL != assertion) {
                            return fi.hl_assert_update_asserted_argument(assertion, hl_tv, direction);
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return boolean; whether the assert succeeded
     */
    @LispMethod(comment = "@return boolean; whether the assert succeeded")
    public static SubLObject hl_assert_as_kb_assertion(final SubLObject cnf, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject canon_version = list(cnf, variable_map);
        thread.resetMultipleValues();
        final SubLObject cnf_$1 = fi.fi_canonicalize(canon_version, T, strength);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject var_names = Mapping.mapcar(VARIABLE_NAME, v_variables);
        SubLObject assertion = kb_indexing.find_assertion(cnf_$1, mt);
        final SubLObject pre_existing_assertionP = makeBoolean(NIL != assertion);
        if (NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            assertion = assertions_high.create_assertion(cnf_$1, mt, var_names, direction, enumeration_types.tv_truth(hl_tv), enumeration_types.tv_strength(hl_tv), arguments.create_asserted_argument(NIL, hl_tv));
        }
        if (NIL != assertion) {
            thread.resetMultipleValues();
            final SubLObject new_assertion = fi.hl_assert_update_asserted_argument(assertion, hl_tv, direction, pre_existing_assertionP);
            final SubLObject truth_status = thread.secondMultipleValue();
            final SubLObject strength_status = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (truth_status != $UNCHANGED) {
                if (truth_status == $FLIPPED) {
                    kb_modification_event.post_kb_modify_remove_assertion_event(new_assertion, $FALSE);
                }
                final SubLObject intuitive_cnf = assertions_high.intuitive_assertion_cnf(new_assertion);
                kb_modification_event.post_kb_modify_create_assertion_event(intuitive_cnf, mt);
            }
            result = new_assertion;
        } else {
            result = NIL;
        }
        return result;
    }

    /**
     *
     *
     * @return boolean; whether the deduce succeeded
     */
    @LispMethod(comment = "@return boolean; whether the deduce succeeded")
    public static final SubLObject hl_deduce_as_kb_deduction(SubLObject cnf, SubLObject mt, SubLObject supports, SubLObject direction, SubLObject variable_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_version = list(cnf, variable_map);
                thread.resetMultipleValues();
                {
                    SubLObject cnf_2 = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
                    SubLObject v_variables = thread.secondMultipleValue();
                    SubLObject hl_tv = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject var_names = Mapping.mapcar(VARIABLE_NAME, v_variables);
                        SubLObject support_truth = tv_truth(hl_tv);
                        SubLObject supports_copy = copy_tree(supports);
                        thread.resetMultipleValues();
                        {
                            SubLObject deduction = tms.tms_add_deduction_for_cnf(cnf_2, mt, supports_copy, support_truth, direction, var_names);
                            SubLObject redundantP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != redundantP) || (NIL != deduction_handles.deduction_p(deduction))) {
                                if (NIL != redundantP) {
                                    {
                                        SubLObject formula = clauses.cnf_formula(cnf_2, UNPROVIDED);
                                        fi.signal_fi_warning(list($ARGUMENT_ALREADY_PRESENT, $str_alt9$Argument_for__S_in__S_is_already_, formula, mt));
                                    }
                                }
                                return deduction;
                            } else {
                                {
                                    SubLObject formula = clauses.cnf_formula(cnf_2, UNPROVIDED);
                                    fi.signal_fi_error(list($GENERIC_ERROR, $str_alt11$Unable_to_add_argument_for__S_in_, formula, mt));
                                    return NIL;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject hl_deduce_as_kb_deduction(final SubLObject cnf, final SubLObject mt, final SubLObject supports, final SubLObject direction, final SubLObject variable_map, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_version = list(cnf, variable_map);
        thread.resetMultipleValues();
        final SubLObject cnf_$2 = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject var_names = Mapping.mapcar(VARIABLE_NAME, v_variables);
        final SubLObject support_truth = enumeration_types.tv_truth(hl_tv);
        final SubLObject supports_copy = copy_tree(supports);
        thread.resetMultipleValues();
        final SubLObject deduction = tms.tms_add_deduction_for_cnf(cnf_$2, mt, supports_copy, support_truth, direction, var_names, v_bindings, pragmatic_support_mts);
        final SubLObject redundantP = thread.secondMultipleValue();
        final SubLObject newly_createdP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != newly_createdP) {
            final SubLObject intuitive_cnf = assertions_high.intuitive_cnf(cnf_$2, support_truth);
            kb_modification_event.post_kb_modify_create_assertion_event(intuitive_cnf, mt);
        }
        if ((NIL != redundantP) || (NIL != deduction_handles.deduction_p(deduction))) {
            if (NIL != redundantP) {
                final SubLObject formula = clauses.cnf_formula(cnf_$2, UNPROVIDED);
                fi.signal_fi_warning(list($ARGUMENT_ALREADY_PRESENT, $str13$Argument_for__S_in__S_is_already_, formula, mt));
            }
            return deduction;
        }
        final SubLObject formula = clauses.cnf_formula(cnf_$2, UNPROVIDED);
        fi.signal_fi_error(list($GENERIC_ERROR, $str15$Unable_to_add_argument_for__S_in_, formula, mt));
        return NIL;
    }

    public static final SubLObject hl_remove_as_kb_assertion_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt) {
        {
            SubLObject argument_type = arguments.argument_spec_type(argument_spec);
            SubLObject pcase_var = argument_type;
            if (pcase_var.eql($ASSERTED_ARGUMENT)) {
                SubLTrampolineFile.checkType(argument_spec, ASSERTED_ARGUMENT_SPEC_P);
                {
                    SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
                    return com.cyc.cycjava.cycl.hl_storage_module_declarations.hl_unassert_as_kb_assertion(cnf, mt);
                }
            } else {
                if (pcase_var.eql($DEDUCTION)) {
                    SubLTrampolineFile.checkType(argument_spec, DEDUCTION_SPEC_P);
                    {
                        SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
                        return com.cyc.cycjava.cycl.hl_storage_module_declarations.hl_undeduce_as_kb_deduction(cnf, mt, supports);
                    }
                } else {
                    fi.signal_fi_error($list_alt6);
                    return NIL;
                }
            }
        }
    }

    public static SubLObject hl_remove_as_kb_assertion(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLObject pcase_var;
        final SubLObject argument_type = pcase_var = arguments.argument_spec_type(argument_spec);
        if (pcase_var.eql($ASSERTED_ARGUMENT)) {
            assert NIL != arguments.asserted_argument_spec_p(argument_spec) : "! arguments.asserted_argument_spec_p(argument_spec) " + ("arguments.asserted_argument_spec_p(argument_spec) " + "CommonSymbols.NIL != arguments.asserted_argument_spec_p(argument_spec) ") + argument_spec;
            final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
            return hl_unassert_as_kb_assertion(cnf, mt);
        } else {
            if (!pcase_var.eql($DEDUCTION)) {
                fi.signal_fi_error($list6);
                return NIL;
            }
            assert NIL != deductions_high.deduction_spec_p(argument_spec) : "! deductions_high.deduction_spec_p(argument_spec) " + ("deductions_high.deduction_spec_p(argument_spec) " + "CommonSymbols.NIL != deductions_high.deduction_spec_p(argument_spec) ") + argument_spec;
            final SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
            return hl_undeduce_as_kb_deduction(cnf, mt, supports);
        }
    }

    public static final SubLObject hl_unassert_as_kb_assertion_alt(SubLObject cnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_version = list(cnf, NIL);
                thread.resetMultipleValues();
                {
                    SubLObject cnf_3 = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
                    SubLObject v_variables = thread.secondMultipleValue();
                    SubLObject hl_tv = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject already_thereP = find_assertion(cnf_3, mt);
                        if (NIL == already_thereP) {
                            {
                                SubLObject formula = clauses.cnf_formula(cnf_3, UNPROVIDED);
                                fi.signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str_alt13$Formula__S_in_mt__S_is_not_in_the, formula, mt));
                            }
                        } else {
                            {
                                SubLObject asserted_argument = assertions_high.get_asserted_argument(already_thereP);
                                if (NIL == asserted_argument) {
                                    {
                                        SubLObject formula = clauses.cnf_formula(cnf_3, UNPROVIDED);
                                        fi.signal_fi_warning(list($ASSERTION_NOT_LOCAL, $str_alt15$Formula__S_in_mt__S_is_not_locall, formula, mt));
                                    }
                                } else {
                                    tms.tms_remove_argument(asserted_argument, already_thereP);
                                }
                            }
                        }
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject hl_unassert_as_kb_assertion(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_version = list(cnf, NIL);
        thread.resetMultipleValues();
        final SubLObject cnf_$3 = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject existing_assertion = kb_indexing.find_assertion(cnf_$3, mt);
        if (NIL == existing_assertion) {
            final SubLObject formula = clauses.cnf_formula(cnf_$3, UNPROVIDED);
            fi.signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str18$Formula__S_in_mt__S_is_not_in_the, formula, mt));
        } else {
            thread.resetMultipleValues();
            final SubLObject asserted_argument = assertions_high.get_asserted_argument_and_more(existing_assertion);
            final SubLObject last_asserted_argumentP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == asserted_argument) {
                final SubLObject formula2 = clauses.cnf_formula(cnf_$3, UNPROVIDED);
                fi.signal_fi_warning(list($ASSERTION_NOT_LOCAL, $str20$Formula__S_in_mt__S_is_not_locall, formula2, mt));
            } else {
                hl_transcript_tracing.note_hlt_unassert(existing_assertion);
                tms.tms_remove_argument(asserted_argument, existing_assertion, last_asserted_argumentP);
            }
        }
        return T;
    }

    public static final SubLObject hl_undeduce_as_kb_deduction_alt(SubLObject cnf, SubLObject mt, SubLObject supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_version = list(cnf, NIL);
                thread.resetMultipleValues();
                {
                    SubLObject cnf_4 = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
                    SubLObject v_variables = thread.secondMultipleValue();
                    SubLObject hl_tv = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject assertion = find_assertion(cnf_4, mt);
                        if (NIL == assertion) {
                            {
                                SubLObject formula = clauses.cnf_formula(cnf_4, UNPROVIDED);
                                fi.signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str_alt13$Formula__S_in_mt__S_is_not_in_the, formula, mt));
                            }
                        } else {
                            {
                                SubLObject support_truth = tv_truth(hl_tv);
                                SubLObject deduction_present = tms.tms_remove_deduction_for_assertion(assertion, supports, support_truth);
                                if (NIL == deduction_present) {
                                    {
                                        SubLObject formula = clauses.cnf_formula(cnf_4, UNPROVIDED);
                                        fi.signal_fi_warning(list($ARGUMENT_NOT_PRESENT, $str_alt17$Argument__S___for__S_in_mt__S_is_, supports, formula, mt));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject hl_undeduce_as_kb_deduction(final SubLObject cnf, final SubLObject mt, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_version = list(cnf, NIL);
        thread.resetMultipleValues();
        final SubLObject cnf_$4 = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject existing_assertion = kb_indexing.find_assertion(cnf_$4, mt);
        if (NIL == existing_assertion) {
            final SubLObject formula = clauses.cnf_formula(cnf_$4, UNPROVIDED);
            fi.signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str18$Formula__S_in_mt__S_is_not_in_the, formula, mt));
        } else {
            final SubLObject support_truth = enumeration_types.tv_truth(hl_tv);
            final SubLObject deduction_present = tms.tms_remove_deduction_for_assertion(existing_assertion, supports, support_truth);
            if (NIL == deduction_present) {
                final SubLObject formula2 = clauses.cnf_formula(cnf_$4, UNPROVIDED);
                fi.signal_fi_warning(list($ARGUMENT_NOT_PRESENT, $str22$Argument__S___for__S_in_mt__S_is_, supports, formula2, mt));
            }
        }
        return T;
    }

    public static final SubLObject hl_remove_all_as_kb_assertion_alt(SubLObject cnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(cnf, CNF_P);
            SubLTrampolineFile.checkType(mt, HLMT_P);
            {
                SubLObject canon_version = list(cnf, NIL);
                thread.resetMultipleValues();
                {
                    SubLObject cnf_5 = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
                    SubLObject v_variables = thread.secondMultipleValue();
                    SubLObject hl_tv = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject assertion = find_assertion(cnf_5, mt);
                        if (NIL == assertion) {
                            {
                                SubLObject formula = clauses.cnf_formula(cnf_5, UNPROVIDED);
                                fi.signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str_alt13$Formula__S_in_mt__S_is_not_in_the, formula, mt));
                            }
                        } else {
                            tms.tms_remove_assertion(assertion);
                        }
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject hl_remove_all_as_kb_assertion(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != clauses.cnf_p(cnf) : "! clauses.cnf_p(cnf) " + ("clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) ") + cnf;
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        final SubLObject canon_version = list(cnf, NIL);
        thread.resetMultipleValues();
        final SubLObject cnf_$5 = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject existing_assertion = kb_indexing.find_assertion(cnf_$5, mt);
        if (NIL == existing_assertion) {
            final SubLObject formula = clauses.cnf_formula(cnf_$5, UNPROVIDED);
            fi.signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str18$Formula__S_in_mt__S_is_not_in_the, formula, mt));
        } else {
            hl_transcript_tracing.note_hlt_remove_assertion(existing_assertion);
            tms.tms_remove_assertion(existing_assertion);
        }
        return T;
    }

    public static final SubLObject ist_assertion_applicableP_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        if (NIL != clauses.atomic_clause_p(cnf)) {
            {
                SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
                if (NIL != el_formula_with_operator_p(asent, $$ist)) {
                    return formula_pattern_match.pattern_matches_formula_without_bindings($list_alt23, asent);
                }
            }
        }
        return NIL;
    }

    public static SubLObject ist_assertion_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clauses.atomic_clause_p(cnf)) {
            final SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$ist)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings($list28, asent);
            }
        }
        return NIL;
    }

    public static final SubLObject ist_assertion_incompleteness_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        return NIL;
    }

    public static SubLObject ist_assertion_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return NIL;
    }

    public static final SubLObject hl_add_as_ist_assertion_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        {
            SubLObject result = NIL;
            SubLObject negatedP = clause_utilities.neg_atomic_cnf_p(cnf);
            SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
            SubLObject sub_mt = designated_mt(asent);
            SubLObject subsentence = (NIL != negatedP) ? ((SubLObject) (cycl_utilities.negate(designated_sentence(asent)))) : designated_sentence(asent);
            SubLObject canon_versions = czer_main.canonicalize_wf_assert_sentence(subsentence, sub_mt);
            SubLObject cdolist_list_var = canon_versions;
            SubLObject canon_version = NIL;
            for (canon_version = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , canon_version = cdolist_list_var.first()) {
                {
                    SubLObject datum = canon_version;
                    SubLObject current = datum;
                    SubLObject sub_cnf = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    sub_cnf = current.first();
                    current = current.rest();
                    {
                        SubLObject sub_variable_map = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt24);
                        current = current.rest();
                        {
                            SubLObject query_free_vars = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt24);
                            current = current.rest();
                            if (NIL == current) {
                                result = hl_storage_modules.hl_add_argument(argument_spec, sub_cnf, sub_mt, direction, sub_variable_map);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt24);
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject hl_add_as_ist_assertion(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        SubLObject result = NIL;
        final SubLObject negatedP = clause_utilities.neg_atomic_cnf_p(cnf);
        final SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
        final SubLObject sub_mt = designated_mt(asent);
        final SubLObject subsentence = (NIL != negatedP) ? cycl_utilities.negate(designated_sentence(asent)) : designated_sentence(asent);
        SubLObject cdolist_list_var;
        final SubLObject canon_versions = cdolist_list_var = czer_main.canonicalize_wf_assert_sentence(subsentence, sub_mt);
        SubLObject canon_version = NIL;
        canon_version = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_version;
            SubLObject sub_cnf = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            sub_cnf = current.first();
            current = current.rest();
            final SubLObject sub_variable_map = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list29);
            current = current.rest();
            final SubLObject query_free_vars = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list29);
            current = current.rest();
            if (NIL == current) {
                result = hl_storage_modules.hl_add_argument(argument_spec, sub_cnf, sub_mt, direction, sub_variable_map);
            } else {
                cdestructuring_bind_error(datum, $list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_version = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject hl_remove_as_ist_assertion_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject negatedP = clause_utilities.neg_atomic_cnf_p(cnf);
            SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
            SubLObject sub_mt = designated_mt(asent);
            SubLObject subsentence = (NIL != negatedP) ? ((SubLObject) (cycl_utilities.negate(designated_sentence(asent)))) : designated_sentence(asent);
            SubLObject canon_versions = czer_main.canonicalize_unassert_sentence(subsentence, sub_mt);
            SubLObject cdolist_list_var = canon_versions;
            SubLObject canon_version = NIL;
            for (canon_version = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , canon_version = cdolist_list_var.first()) {
                {
                    SubLObject datum = canon_version;
                    SubLObject current = datum;
                    SubLObject sub_cnf = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    sub_cnf = current.first();
                    current = current.rest();
                    {
                        SubLObject sub_variable_map = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt24);
                        current = current.rest();
                        {
                            SubLObject query_free_vars = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt24);
                            current = current.rest();
                            if (NIL == current) {
                                result = hl_storage_modules.hl_remove_argument(argument_spec, sub_cnf, sub_mt);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt24);
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject hl_remove_as_ist_assertion(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        SubLObject result = NIL;
        final SubLObject negatedP = clause_utilities.neg_atomic_cnf_p(cnf);
        final SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
        final SubLObject sub_mt = designated_mt(asent);
        final SubLObject subsentence = (NIL != negatedP) ? cycl_utilities.negate(designated_sentence(asent)) : designated_sentence(asent);
        SubLObject cdolist_list_var;
        final SubLObject canon_versions = cdolist_list_var = czer_main.canonicalize_unassert_sentence(subsentence, sub_mt);
        SubLObject canon_version = NIL;
        canon_version = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_version;
            SubLObject sub_cnf = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            sub_cnf = current.first();
            current = current.rest();
            final SubLObject sub_variable_map = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list29);
            current = current.rest();
            final SubLObject query_free_vars = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list29);
            current = current.rest();
            if (NIL == current) {
                result = hl_storage_modules.hl_remove_argument(argument_spec, sub_cnf, sub_mt);
            } else {
                cdestructuring_bind_error(datum, $list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_version = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject hl_remove_all_as_ist_assertion_alt(SubLObject cnf, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject negatedP = clause_utilities.neg_atomic_cnf_p(cnf);
            SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
            SubLObject sub_mt = designated_mt(asent);
            SubLObject subsentence = (NIL != negatedP) ? ((SubLObject) (cycl_utilities.negate(designated_sentence(asent)))) : designated_sentence(asent);
            SubLObject canon_versions = czer_main.canonicalize_assert(subsentence, sub_mt);
            SubLObject cdolist_list_var = canon_versions;
            SubLObject canon_version = NIL;
            for (canon_version = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , canon_version = cdolist_list_var.first()) {
                {
                    SubLObject datum = canon_version;
                    SubLObject current = datum;
                    SubLObject sub_cnf = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    sub_cnf = current.first();
                    current = current.rest();
                    {
                        SubLObject sub_variable_map = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt24);
                        current = current.rest();
                        {
                            SubLObject query_free_vars = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt24);
                            current = current.rest();
                            if (NIL == current) {
                                result = hl_storage_modules.hl_remove_all_arguments(sub_cnf, sub_mt);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt24);
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject hl_remove_all_as_ist_assertion(final SubLObject cnf, final SubLObject mt) {
        SubLObject result = NIL;
        final SubLObject negatedP = clause_utilities.neg_atomic_cnf_p(cnf);
        final SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
        final SubLObject sub_mt = designated_mt(asent);
        final SubLObject subsentence = (NIL != negatedP) ? cycl_utilities.negate(designated_sentence(asent)) : designated_sentence(asent);
        SubLObject cdolist_list_var;
        final SubLObject canon_versions = cdolist_list_var = czer_main.canonicalize_assert(subsentence, sub_mt);
        SubLObject canon_version = NIL;
        canon_version = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_version;
            SubLObject sub_cnf = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            sub_cnf = current.first();
            current = current.rest();
            final SubLObject sub_variable_map = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list29);
            current = current.rest();
            final SubLObject query_free_vars = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list29);
            current = current.rest();
            if (NIL == current) {
                result = hl_storage_modules.hl_remove_all_arguments(sub_cnf, sub_mt);
            } else {
                cdestructuring_bind_error(datum, $list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_version = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @return booleanp; Returns whether the hl-storage-module for #$constantName is applicable.
     */
    @LispMethod(comment = "@return booleanp; Returns whether the hl-storage-module for #$constantName is applicable.")
    public static final SubLObject constant_name_hl_storage_applicableP_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
                if (NIL != el_formula_with_operator_p(asent, $$constantName)) {
                    return formula_pattern_match.pattern_matches_formula_without_bindings($list_alt28, asent);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; Returns whether the hl-storage-module for #$constantName is applicable.
     */
    @LispMethod(comment = "@return booleanp; Returns whether the hl-storage-module for #$constantName is applicable.")
    public static SubLObject constant_name_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$constantName)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings($list33, asent);
            }
        }
        return NIL;
    }

    /**
     * Returns the ways in which the arguments are incomplete in meeting requirements
     * for the #$constantName hl-storage-module.
     */
    @LispMethod(comment = "Returns the ways in which the arguments are incomplete in meeting requirements\r\nfor the #$constantName hl-storage-module.\nReturns the ways in which the arguments are incomplete in meeting requirements\nfor the #$constantName hl-storage-module.")
    public static final SubLObject constant_name_hl_storage_incompleteness_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        return NIL;
    }

    /**
     * Returns the ways in which the arguments are incomplete in meeting requirements
     * for the #$constantName hl-storage-module.
     */
    @LispMethod(comment = "Returns the ways in which the arguments are incomplete in meeting requirements\r\nfor the #$constantName hl-storage-module.\nReturns the ways in which the arguments are incomplete in meeting requirements\nfor the #$constantName hl-storage-module.")
    public static SubLObject constant_name_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return NIL;
    }

    /**
     *
     *
     * @return booleanp;  Stores the #$constantName CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Stores the #$constantName CNF, and returns T if nothing goes wrong.")
    public static final SubLObject constant_name_hl_storage_assert_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        {
            SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject new_name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject current_name = constants_high.constant_name(constant);
            if (((NIL != constant_p(constant)) && (NIL != constant_completion_high.valid_constant_name_p(new_name))) && (!new_name.equal(current_name))) {
                return cyc_kernel.cyc_rename(constant, new_name);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp;  Stores the #$constantName CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Stores the #$constantName CNF, and returns T if nothing goes wrong.")
    public static SubLObject constant_name_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject new_name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject current_name = constants_high.constant_name(constant);
        if (((NIL != constant_p(constant)) && (NIL != constant_completion_high.valid_constant_name_p(new_name))) && (!new_name.equal(current_name))) {
            return cyc_kernel.cyc_rename(constant, new_name);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp;  Removes the #$constantName CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Removes the #$constantName CNF, and returns T if nothing goes wrong.")
    public static final SubLObject constant_name_hl_storage_unassert_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt) {
        {
            SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject expected_name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject current_name = constants_high.constant_name(constant);
            if (((NIL != constant_p(constant)) && (NIL != constant_completion_high.valid_constant_name_p(expected_name))) && expected_name.equal(current_name)) {
                return NIL;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp;  Removes the #$constantName CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Removes the #$constantName CNF, and returns T if nothing goes wrong.")
    public static SubLObject constant_name_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject expected_name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject current_name = constants_high.constant_name(constant);
        if (((NIL != constant_p(constant)) && (NIL != constant_completion_high.valid_constant_name_p(expected_name))) && expected_name.equal(current_name)) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject constant_name_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return constant_name_hl_storage_unassert(NIL, cnf, mt);
    }

    /**
     *
     *
     * @return booleanp; Returns whether the hl-storage-module for #$assertionDirection is applicable.
     */
    @LispMethod(comment = "@return booleanp; Returns whether the hl-storage-module for #$assertionDirection is applicable.")
    public static final SubLObject assertion_direction_hl_storage_applicableP_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
                if (NIL != el_formula_with_operator_p(asent, $$assertionDirection)) {
                    return formula_pattern_match.pattern_matches_formula_without_bindings($list_alt32, asent);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; Returns whether the hl-storage-module for #$assertionDirection is applicable.
     */
    @LispMethod(comment = "@return booleanp; Returns whether the hl-storage-module for #$assertionDirection is applicable.")
    public static SubLObject assertion_direction_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$assertionDirection)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings($list37, asent);
            }
        }
        return NIL;
    }

    /**
     * Returns the ways in which the arguments are incomplete in meeting requirements for the #$assertionDirection hl-storage-module.
     */
    @LispMethod(comment = "Returns the ways in which the arguments are incomplete in meeting requirements for the #$assertionDirection hl-storage-module.")
    public static final SubLObject assertion_direction_hl_storage_incompleteness_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        return NIL;
    }

    /**
     * Returns the ways in which the arguments are incomplete in meeting requirements for the #$assertionDirection hl-storage-module.
     */
    @LispMethod(comment = "Returns the ways in which the arguments are incomplete in meeting requirements for the #$assertionDirection hl-storage-module.")
    public static SubLObject assertion_direction_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return NIL;
    }

    /**
     *
     *
     * @return booleanp;  Stores the #$assertionDirection CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Stores the #$assertionDirection CNF, and returns T if nothing goes wrong.")
    public static final SubLObject assertion_direction_hl_storage_assert_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        {
            SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            SubLObject assertion = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject new_dir = removal_modules_assertion_mt.cycl_direction_to_direction(cycl_utilities.sentence_arg2(asent, UNPROVIDED));
            SubLObject orig_dir = assertions_high.assertion_direction(assertion);
            if (new_dir != orig_dir) {
                tms.tms_change_direction(assertion, new_dir);
            }
        }
        return T;
    }

    /**
     *
     *
     * @return booleanp;  Stores the #$assertionDirection CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Stores the #$assertionDirection CNF, and returns T if nothing goes wrong.")
    public static SubLObject assertion_direction_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject assertion = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
        final SubLObject new_dir = removal_modules_assertion_mt.cycl_direction_to_direction(cycl_utilities.sentence_arg2(asent, UNPROVIDED));
        final SubLObject orig_dir = assertions_high.assertion_direction(assertion);
        if (!new_dir.eql(orig_dir)) {
            tms.tms_change_direction(assertion, new_dir);
        }
        return T;
    }

    /**
     *
     *
     * @return booleanp;  Removes the #$assertionDirection CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Removes the #$assertionDirection CNF, and returns T if nothing goes wrong.")
    public static final SubLObject assertion_direction_hl_storage_unassert_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt) {
        return T;
    }

    /**
     *
     *
     * @return booleanp;  Removes the #$assertionDirection CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Removes the #$assertionDirection CNF, and returns T if nothing goes wrong.")
    public static SubLObject assertion_direction_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return T;
    }

    public static SubLObject assertion_direction_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return assertion_direction_hl_storage_unassert(NIL, cnf, mt);
    }

    /**
     *
     *
     * @return booleanp; Returns whether the hl-storage-module for #$indexicalReferent #$TheUser is applicable.
     */
    @LispMethod(comment = "@return booleanp; Returns whether the hl-storage-module for #$indexicalReferent #$TheUser is applicable.")
    public static final SubLObject indexical_the_user_hl_storage_applicableP_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
                if (NIL != el_formula_with_operator_p(asent, $$indexicalReferent)) {
                    return formula_pattern_match.pattern_matches_formula_without_bindings($list_alt36, asent);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; Returns whether the hl-storage-module for #$indexicalReferent #$TheUser is applicable.
     */
    @LispMethod(comment = "@return booleanp; Returns whether the hl-storage-module for #$indexicalReferent #$TheUser is applicable.")
    public static SubLObject indexical_the_user_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$indexicalReferent)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings($list41, asent);
            }
        }
        return NIL;
    }

    /**
     * Returns the ways in which the arguments are incomplete in meeting requirements
     * for the #$indexicalReferent #$TheUser hl-storage-module.
     */
    @LispMethod(comment = "Returns the ways in which the arguments are incomplete in meeting requirements\r\nfor the #$indexicalReferent #$TheUser hl-storage-module.\nReturns the ways in which the arguments are incomplete in meeting requirements\nfor the #$indexicalReferent #$TheUser hl-storage-module.")
    public static final SubLObject indexical_the_user_hl_storage_incompleteness_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        return NIL;
    }

    /**
     * Returns the ways in which the arguments are incomplete in meeting requirements
     * for the #$indexicalReferent #$TheUser hl-storage-module.
     */
    @LispMethod(comment = "Returns the ways in which the arguments are incomplete in meeting requirements\r\nfor the #$indexicalReferent #$TheUser hl-storage-module.\nReturns the ways in which the arguments are incomplete in meeting requirements\nfor the #$indexicalReferent #$TheUser hl-storage-module.")
    public static SubLObject indexical_the_user_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return NIL;
    }

    /**
     *
     *
     * @return booleanp;  Stores the #$indexicalReferent CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Stores the #$indexicalReferent CNF, and returns T if nothing goes wrong.")
    public static final SubLObject indexical_the_user_hl_storage_assert_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        {
            SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            SubLObject cyclist = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (((NIL != forts.fort_p(cyclist)) && (NIL != kb_accessors.cyclistP(cyclist))) && ($$TheUser != cyclist)) {
                operation_communication.set_the_cyclist(cyclist);
                return equal(cyclist, operation_communication.the_cyclist());
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp;  Stores the #$indexicalReferent CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Stores the #$indexicalReferent CNF, and returns T if nothing goes wrong.")
    public static SubLObject indexical_the_user_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject cyclist = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (((NIL != forts.fort_p(cyclist)) && (NIL != kb_accessors.cyclistP(cyclist))) && (!$$TheUser.eql(cyclist))) {
            operation_communication.set_the_cyclist(cyclist);
            return equal(cyclist, operation_communication.the_cyclist());
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp;  Removes the #$indexicalReferent #$TheUser CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Removes the #$indexicalReferent #$TheUser CNF, and returns T if nothing goes wrong.")
    public static final SubLObject indexical_the_user_hl_storage_unassert_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
                SubLObject cyclist = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (((NIL != forts.fort_p(cyclist)) && (NIL != kb_accessors.cyclistP(cyclist))) && cyclist.equal(operation_communication.the_cyclist())) {
                    operation_communication.set_the_cyclist(system_parameters.$default_cyclist_name$.getDynamicValue(thread));
                    return makeBoolean(!cyclist.equal(operation_communication.the_cyclist()));
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return booleanp;  Removes the #$indexicalReferent #$TheUser CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Removes the #$indexicalReferent #$TheUser CNF, and returns T if nothing goes wrong.")
    public static SubLObject indexical_the_user_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject cyclist = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (((NIL != forts.fort_p(cyclist)) && (NIL != kb_accessors.cyclistP(cyclist))) && cyclist.equal(operation_communication.the_cyclist())) {
            operation_communication.set_the_cyclist(system_parameters.$default_cyclist_name$.getDynamicValue(thread));
            return makeBoolean(!cyclist.equal(operation_communication.the_cyclist()));
        }
        return NIL;
    }

    public static SubLObject indexical_the_user_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return indexical_the_user_hl_storage_unassert(NIL, cnf, mt);
    }

    /**
     *
     *
     * @return booleanp; Returns whether the hl-storage-module for #$performSubL is applicable.
     */
    @LispMethod(comment = "@return booleanp; Returns whether the hl-storage-module for #$performSubL is applicable.")
    public static final SubLObject perform_subl_hl_storage_applicableP_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
                if (NIL != el_formula_with_operator_p(asent, $$performSubL)) {
                    return formula_pattern_match.pattern_matches_formula_without_bindings($list_alt41, asent);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; Returns whether the hl-storage-module for #$performSubL is applicable.
     */
    @LispMethod(comment = "@return booleanp; Returns whether the hl-storage-module for #$performSubL is applicable.")
    public static SubLObject perform_subl_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$performSubL)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings($list46, asent);
            }
        }
        return NIL;
    }

    /**
     * Returns the ways in which the arguments are incomplete in meeting requirements for the #$performSubL hl-storage-module.
     */
    @LispMethod(comment = "Returns the ways in which the arguments are incomplete in meeting requirements for the #$performSubL hl-storage-module.")
    public static final SubLObject perform_subl_hl_storage_incompleteness_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        return $list_alt42;
    }

    @LispMethod(comment = "Returns the ways in which the arguments are incomplete in meeting requirements for the #$performSubL hl-storage-module.")
    public static SubLObject perform_subl_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return $list47;
    }

    /**
     *
     *
     * @return booleanp;  Executes the #$performSubL CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Executes the #$performSubL CNF, and returns T if nothing goes wrong.")
    public static final SubLObject perform_subl_hl_storage_assert_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        {
            SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            SubLObject subl = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            return removal_modules_perform_subl.inference_perform_subl(subl);
        }
    }

    /**
     *
     *
     * @return booleanp;  Executes the #$performSubL CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Executes the #$performSubL CNF, and returns T if nothing goes wrong.")
    public static SubLObject perform_subl_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject subl = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return removal_modules_perform_subl.inference_perform_subl(subl);
    }

    /**
     *
     *
     * @return booleanp;  Removes the #$performSubL CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Removes the #$performSubL CNF, and returns T if nothing goes wrong.")
    public static final SubLObject perform_subl_hl_storage_unassert_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt) {
        return T;
    }

    /**
     *
     *
     * @return booleanp;  Removes the #$performSubL CNF, and returns T if nothing goes wrong.
     */
    @LispMethod(comment = "@return booleanp;  Removes the #$performSubL CNF, and returns T if nothing goes wrong.")
    public static SubLObject perform_subl_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return T;
    }

    public static SubLObject perform_subl_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return perform_subl_hl_storage_unassert(NIL, cnf, mt);
    }

    public static SubLObject repropagate_assertion_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$repropagateAssertion)) {
                return assertion_handles.assertion_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
            }
        }
        return NIL;
    }

    public static SubLObject repropagate_assertion_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return $list47;
    }

    public static SubLObject repropagate_assertion_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != assertions_high.forward_assertionP(arg1)) {
            forward.queue_or_repropagate_forward_assertion(arg1);
            return T;
        }
        return NIL;
    }

    public static SubLObject repropagate_assertion_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return T;
    }

    public static SubLObject repropagate_assertion_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        repropagate_assertion_hl_storage_unassert(NIL, cnf, mt);
        return NIL;
    }

    public static SubLObject reconsider_assertion_deductions_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$reconsiderAssertionDeductions)) {
                return assertion_handles.assertion_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
            }
        }
        return NIL;
    }

    public static SubLObject reconsider_assertion_deductions_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return $list47;
    }

    public static SubLObject reconsider_assertion_deductions_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        tms.tms_reconsider_assertion_deductions(arg1);
        return T;
    }

    public static SubLObject reconsider_assertion_deductions_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return T;
    }

    public static SubLObject reconsider_assertion_deductions_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return reconsider_assertion_deductions_hl_storage_unassert(NIL, cnf, mt);
    }

    public static SubLObject sks_registered_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clauses.atomic_clause_p(cnf)) {
            final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$sksRegistered)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings($list57, asent);
            }
        }
        return NIL;
    }

    public static SubLObject sks_registered_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return $list47;
    }

    public static SubLObject sks_registered_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            return sks_registered_hl_storage_assert_int(source);
        }
        return sks_registered_hl_storage_unassert_int(source);
    }

    public static SubLObject sks_registered_hl_storage_assert_int(SubLObject source) {
        sksi_sks_manager.register_sksi_removal_modules_for_skses(list(source));
        return sksi_infrastructure_utilities.external_source_activated_in_imageP(source);
    }

    public static SubLObject sks_registered_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return sks_registered_hl_storage_unassert_int(source);
    }

    public static SubLObject sks_registered_hl_storage_unassert_int(SubLObject source) {
        sksi_sks_manager.deregister_sksi_removal_modules_for_skses(list(source));
        return makeBoolean(NIL == sksi_infrastructure_utilities.external_source_activated_in_imageP(source));
    }

    public static SubLObject sks_registered_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return sks_registered_hl_storage_unassert(NIL, cnf, mt);
    }

    public static SubLObject assert_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$assert)) {
                return variables.fully_bound_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("Regular KB Assertion"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("APPLICABILITY"), makeSymbol("REGULAR-KB-ASSERTION-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("REGULAR-KB-ASSERTION-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("HL-ADD-AS-KB-ASSERTION"), makeKeyword("REMOVE"), makeSymbol("HL-REMOVE-AS-KB-ASSERTION"), makeKeyword("REMOVE-ALL"), makeSymbol("HL-REMOVE-ALL-AS-KB-ASSERTION") });

    public static SubLObject assert_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return $list47;
    }

    public static SubLObject assert_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject results = NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions = czer_main.canonicalize_assert_sentence(arg1, mt);
        final SubLObject canon_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = canon_versions;
        SubLObject canon_version = NIL;
        canon_version = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_version;
            SubLObject cnf_$6 = NIL;
            destructuring_bind_must_consp(current, datum, $list66);
            cnf_$6 = current.first();
            current = current.rest();
            final SubLObject variable_map_$7 = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list66);
            current = current.rest();
            final SubLObject query_free_vars = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list66);
            current = current.rest();
            if (NIL == current) {
                if (NIL == direction) {
                    final SubLObject version_direction = fi.fi_cnf_default_direction(cnf_$6);
                }
                results = cons(hl_add_as_kb_assertion(argument_spec, cnf_$6, canon_mt, direction, variable_map_$7), results);
            } else {
                cdestructuring_bind_error(datum, $list66);
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_version = cdolist_list_var.first();
        } 
        return makeBoolean((NIL != results) && (NIL != list_utilities.every_in_list(BOOLEAN, results, UNPROVIDED)));
    }

    static private final SubLList $list_alt6 = list(makeKeyword("GENERIC-ERROR"), makeString("Unknown argument type ~S"));

    static private final SubLString $str_alt9$Argument_for__S_in__S_is_already_ = makeString("Argument for ~S in ~S is already present");

    static private final SubLString $str_alt11$Unable_to_add_argument_for__S_in_ = makeString("Unable to add argument for ~S in ~S");

    static private final SubLString $str_alt13$Formula__S_in_mt__S_is_not_in_the = makeString("Formula ~S in mt ~S is not in the KB");

    static private final SubLString $str_alt15$Formula__S_in_mt__S_is_not_locall = makeString("Formula ~S in mt ~S is not locally in the KB");

    static private final SubLString $str_alt17$Argument__S___for__S_in_mt__S_is_ = makeString("Argument ~S ~%for ~S in mt ~S is not already present");

    static private final SubLList $list_alt21 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("ist"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("ist"), makeKeyword("APPLICABILITY"), makeSymbol("IST-ASSERTION-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("IST-ASSERTION-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("HL-ADD-AS-IST-ASSERTION"), makeKeyword("REMOVE"), makeSymbol("HL-REMOVE-AS-IST-ASSERTION"), makeKeyword("REMOVE-ALL"), makeSymbol("HL-REMOVE-ALL-AS-IST-ASSERTION") });

    static private final SubLList $list_alt23 = list(reader_make_constant_shell("ist"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    public static SubLObject assert_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return T;
    }

    static private final SubLList $list_alt24 = list(makeSymbol("SUB-CNF"), makeSymbol("&OPTIONAL"), makeSymbol("SUB-VARIABLE-MAP"), makeSymbol("QUERY-FREE-VARS"));

    public static SubLObject assert_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return assert_hl_storage_unassert(NIL, cnf, mt);
    }

    static private final SubLList $list_alt26 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("constantName"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("constantName"), makeKeyword("APPLICABILITY"), makeSymbol("CONSTANT-NAME-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("CONSTANT-NAME-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("CONSTANT-NAME-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("CONSTANT-NAME-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("CONSTANT-NAME-HL-STORAGE-UNASSERT") });

    public static final SubLObject declare_hl_storage_module_declarations_file_alt() {
        declareFunction("regular_kb_assertion_applicableP", "REGULAR-KB-ASSERTION-APPLICABLE?", 5, 0, false);
        declareFunction("regular_kb_assertion_incompleteness", "REGULAR-KB-ASSERTION-INCOMPLETENESS", 5, 0, false);
        declareFunction("hl_add_as_kb_assertion", "HL-ADD-AS-KB-ASSERTION", 5, 0, false);
        declareFunction("hl_assert_as_kb_assertion", "HL-ASSERT-AS-KB-ASSERTION", 5, 0, false);
        declareFunction("hl_deduce_as_kb_deduction", "HL-DEDUCE-AS-KB-DEDUCTION", 5, 0, false);
        declareFunction("hl_remove_as_kb_assertion", "HL-REMOVE-AS-KB-ASSERTION", 3, 0, false);
        declareFunction("hl_unassert_as_kb_assertion", "HL-UNASSERT-AS-KB-ASSERTION", 2, 0, false);
        declareFunction("hl_undeduce_as_kb_deduction", "HL-UNDEDUCE-AS-KB-DEDUCTION", 3, 0, false);
        declareFunction("hl_remove_all_as_kb_assertion", "HL-REMOVE-ALL-AS-KB-ASSERTION", 2, 0, false);
        declareFunction("ist_assertion_applicableP", "IST-ASSERTION-APPLICABLE?", 5, 0, false);
        declareFunction("ist_assertion_incompleteness", "IST-ASSERTION-INCOMPLETENESS", 5, 0, false);
        declareFunction("hl_add_as_ist_assertion", "HL-ADD-AS-IST-ASSERTION", 5, 0, false);
        declareFunction("hl_remove_as_ist_assertion", "HL-REMOVE-AS-IST-ASSERTION", 3, 0, false);
        declareFunction("hl_remove_all_as_ist_assertion", "HL-REMOVE-ALL-AS-IST-ASSERTION", 2, 0, false);
        declareFunction("constant_name_hl_storage_applicableP", "CONSTANT-NAME-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("constant_name_hl_storage_incompleteness", "CONSTANT-NAME-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("constant_name_hl_storage_assert", "CONSTANT-NAME-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("constant_name_hl_storage_unassert", "CONSTANT-NAME-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("assertion_direction_hl_storage_applicableP", "ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("assertion_direction_hl_storage_incompleteness", "ASSERTION-DIRECTION-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("assertion_direction_hl_storage_assert", "ASSERTION-DIRECTION-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("assertion_direction_hl_storage_unassert", "ASSERTION-DIRECTION-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("indexical_the_user_hl_storage_applicableP", "INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("indexical_the_user_hl_storage_incompleteness", "INDEXICAL-THE-USER-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("indexical_the_user_hl_storage_assert", "INDEXICAL-THE-USER-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("indexical_the_user_hl_storage_unassert", "INDEXICAL-THE-USER-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("perform_subl_hl_storage_applicableP", "PERFORM-SUBL-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("perform_subl_hl_storage_incompleteness", "PERFORM-SUBL-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("perform_subl_hl_storage_assert", "PERFORM-SUBL-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("perform_subl_hl_storage_unassert", "PERFORM-SUBL-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("subloop_reserved_initialize_hl_storage_module_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-HL-STORAGE-MODULE-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_hl_storage_module_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-HL-STORAGE-MODULE-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("hl_storage_module_test_case_p", "HL-STORAGE-MODULE-TEST-CASE-P", 1, 0, false);
        declareFunction("get_regular_kb_assertion_module_test_case_test_support_assertion", "GET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-SUPPORT-ASSERTION", 1, 0, false);
        declareFunction("set_regular_kb_assertion_module_test_case_test_support_assertion", "SET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-SUPPORT-ASSERTION", 2, 0, false);
        declareFunction("get_regular_kb_assertion_module_test_case_test_mt", "GET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-MT", 1, 0, false);
        declareFunction("set_regular_kb_assertion_module_test_case_test_mt", "SET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-MT", 2, 0, false);
        declareFunction("get_regular_kb_assertion_module_test_case_test_sentence", "GET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-SENTENCE", 1, 0, false);
        declareFunction("set_regular_kb_assertion_module_test_case_test_sentence", "SET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-SENTENCE", 2, 0, false);
        declareFunction("get_regular_kb_assertion_module_test_case_test_constant", "GET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-CONSTANT", 1, 0, false);
        declareFunction("set_regular_kb_assertion_module_test_case_test_constant", "SET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-CONSTANT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_regular_kb_assertion_module_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_regular_kb_assertion_module_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("regular_kb_assertion_module_test_case_p", "REGULAR-KB-ASSERTION-MODULE-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_hl_storage_module_declarations_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("regular_kb_assertion_applicableP", "REGULAR-KB-ASSERTION-APPLICABLE?", 5, 0, false);
            declareFunction("regular_kb_assertion_incompleteness", "REGULAR-KB-ASSERTION-INCOMPLETENESS", 5, 0, false);
            declareFunction("hl_add_as_kb_assertion", "HL-ADD-AS-KB-ASSERTION", 5, 0, false);
            declareFunction("hl_assert_as_kb_assertion", "HL-ASSERT-AS-KB-ASSERTION", 5, 0, false);
            declareFunction("hl_deduce_as_kb_deduction", "HL-DEDUCE-AS-KB-DEDUCTION", 5, 2, false);
            declareFunction("hl_remove_as_kb_assertion", "HL-REMOVE-AS-KB-ASSERTION", 3, 0, false);
            declareFunction("hl_unassert_as_kb_assertion", "HL-UNASSERT-AS-KB-ASSERTION", 2, 0, false);
            declareFunction("hl_undeduce_as_kb_deduction", "HL-UNDEDUCE-AS-KB-DEDUCTION", 3, 0, false);
            declareFunction("hl_remove_all_as_kb_assertion", "HL-REMOVE-ALL-AS-KB-ASSERTION", 2, 0, false);
            declareFunction("ist_assertion_applicableP", "IST-ASSERTION-APPLICABLE?", 5, 0, false);
            declareFunction("ist_assertion_incompleteness", "IST-ASSERTION-INCOMPLETENESS", 5, 0, false);
            declareFunction("hl_add_as_ist_assertion", "HL-ADD-AS-IST-ASSERTION", 5, 0, false);
            declareFunction("hl_remove_as_ist_assertion", "HL-REMOVE-AS-IST-ASSERTION", 3, 0, false);
            declareFunction("hl_remove_all_as_ist_assertion", "HL-REMOVE-ALL-AS-IST-ASSERTION", 2, 0, false);
            declareFunction("constant_name_hl_storage_applicableP", "CONSTANT-NAME-HL-STORAGE-APPLICABLE?", 5, 0, false);
            declareFunction("constant_name_hl_storage_incompleteness", "CONSTANT-NAME-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
            declareFunction("constant_name_hl_storage_assert", "CONSTANT-NAME-HL-STORAGE-ASSERT", 5, 0, false);
            declareFunction("constant_name_hl_storage_unassert", "CONSTANT-NAME-HL-STORAGE-UNASSERT", 3, 0, false);
            declareFunction("constant_name_hl_storage_unassert_all", "CONSTANT-NAME-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
            declareFunction("assertion_direction_hl_storage_applicableP", "ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?", 5, 0, false);
            declareFunction("assertion_direction_hl_storage_incompleteness", "ASSERTION-DIRECTION-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
            declareFunction("assertion_direction_hl_storage_assert", "ASSERTION-DIRECTION-HL-STORAGE-ASSERT", 5, 0, false);
            declareFunction("assertion_direction_hl_storage_unassert", "ASSERTION-DIRECTION-HL-STORAGE-UNASSERT", 3, 0, false);
            declareFunction("assertion_direction_hl_storage_unassert_all", "ASSERTION-DIRECTION-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
            declareFunction("indexical_the_user_hl_storage_applicableP", "INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?", 5, 0, false);
            declareFunction("indexical_the_user_hl_storage_incompleteness", "INDEXICAL-THE-USER-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
            declareFunction("indexical_the_user_hl_storage_assert", "INDEXICAL-THE-USER-HL-STORAGE-ASSERT", 5, 0, false);
            declareFunction("indexical_the_user_hl_storage_unassert", "INDEXICAL-THE-USER-HL-STORAGE-UNASSERT", 3, 0, false);
            declareFunction("indexical_the_user_hl_storage_unassert_all", "INDEXICAL-THE-USER-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
            declareFunction("perform_subl_hl_storage_applicableP", "PERFORM-SUBL-HL-STORAGE-APPLICABLE?", 5, 0, false);
            declareFunction("perform_subl_hl_storage_incompleteness", "PERFORM-SUBL-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
            declareFunction("perform_subl_hl_storage_assert", "PERFORM-SUBL-HL-STORAGE-ASSERT", 5, 0, false);
            declareFunction("perform_subl_hl_storage_unassert", "PERFORM-SUBL-HL-STORAGE-UNASSERT", 3, 0, false);
            declareFunction("perform_subl_hl_storage_unassert_all", "PERFORM-SUBL-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
            declareFunction("repropagate_assertion_hl_storage_applicableP", "REPROPAGATE-ASSERTION-HL-STORAGE-APPLICABLE?", 5, 0, false);
            declareFunction("repropagate_assertion_hl_storage_incompleteness", "REPROPAGATE-ASSERTION-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
            declareFunction("repropagate_assertion_hl_storage_assert", "REPROPAGATE-ASSERTION-HL-STORAGE-ASSERT", 5, 0, false);
            declareFunction("repropagate_assertion_hl_storage_unassert", "REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT", 3, 0, false);
            declareFunction("repropagate_assertion_hl_storage_unassert_all", "REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
            declareFunction("reconsider_assertion_deductions_hl_storage_applicableP", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-APPLICABLE?", 5, 0, false);
            declareFunction("reconsider_assertion_deductions_hl_storage_incompleteness", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
            declareFunction("reconsider_assertion_deductions_hl_storage_assert", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-ASSERT", 5, 0, false);
            declareFunction("reconsider_assertion_deductions_hl_storage_unassert", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT", 3, 0, false);
            declareFunction("reconsider_assertion_deductions_hl_storage_unassert_all", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
            declareFunction("sks_registered_hl_storage_applicableP", "SKS-REGISTERED-HL-STORAGE-APPLICABLE?", 5, 0, false);
            declareFunction("sks_registered_hl_storage_incompleteness", "SKS-REGISTERED-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
            declareFunction("sks_registered_hl_storage_assert", "SKS-REGISTERED-HL-STORAGE-ASSERT", 5, 0, false);
            declareFunction("sks_registered_hl_storage_assert_int", "SKS-REGISTERED-HL-STORAGE-ASSERT-INT", 1, 0, false);
            declareFunction("sks_registered_hl_storage_unassert", "SKS-REGISTERED-HL-STORAGE-UNASSERT", 3, 0, false);
            declareFunction("sks_registered_hl_storage_unassert_int", "SKS-REGISTERED-HL-STORAGE-UNASSERT-INT", 1, 0, false);
            declareFunction("sks_registered_hl_storage_unassert_all", "SKS-REGISTERED-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
            declareFunction("assert_hl_storage_applicableP", "ASSERT-HL-STORAGE-APPLICABLE?", 5, 0, false);
            declareFunction("assert_hl_storage_incompleteness", "ASSERT-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
            declareFunction("assert_hl_storage_assert", "ASSERT-HL-STORAGE-ASSERT", 5, 0, false);
            declareFunction("assert_hl_storage_unassert", "ASSERT-HL-STORAGE-UNASSERT", 3, 0, false);
            declareFunction("assert_hl_storage_unassert_all", "ASSERT-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("hl_deduce_as_kb_deduction", "HL-DEDUCE-AS-KB-DEDUCTION", 5, 0, false);
            declareFunction("subloop_reserved_initialize_hl_storage_module_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-HL-STORAGE-MODULE-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_hl_storage_module_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-HL-STORAGE-MODULE-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("hl_storage_module_test_case_p", "HL-STORAGE-MODULE-TEST-CASE-P", 1, 0, false);
            declareFunction("get_regular_kb_assertion_module_test_case_test_support_assertion", "GET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-SUPPORT-ASSERTION", 1, 0, false);
            declareFunction("set_regular_kb_assertion_module_test_case_test_support_assertion", "SET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-SUPPORT-ASSERTION", 2, 0, false);
            declareFunction("get_regular_kb_assertion_module_test_case_test_mt", "GET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-MT", 1, 0, false);
            declareFunction("set_regular_kb_assertion_module_test_case_test_mt", "SET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-MT", 2, 0, false);
            declareFunction("get_regular_kb_assertion_module_test_case_test_sentence", "GET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-SENTENCE", 1, 0, false);
            declareFunction("set_regular_kb_assertion_module_test_case_test_sentence", "SET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-SENTENCE", 2, 0, false);
            declareFunction("get_regular_kb_assertion_module_test_case_test_constant", "GET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-CONSTANT", 1, 0, false);
            declareFunction("set_regular_kb_assertion_module_test_case_test_constant", "SET-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-TEST-CONSTANT", 2, 0, false);
            declareFunction("subloop_reserved_initialize_regular_kb_assertion_module_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_regular_kb_assertion_module_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("regular_kb_assertion_module_test_case_p", "REGULAR-KB-ASSERTION-MODULE-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_hl_storage_module_declarations_file_Previous() {
        declareFunction("regular_kb_assertion_applicableP", "REGULAR-KB-ASSERTION-APPLICABLE?", 5, 0, false);
        declareFunction("regular_kb_assertion_incompleteness", "REGULAR-KB-ASSERTION-INCOMPLETENESS", 5, 0, false);
        declareFunction("hl_add_as_kb_assertion", "HL-ADD-AS-KB-ASSERTION", 5, 0, false);
        declareFunction("hl_assert_as_kb_assertion", "HL-ASSERT-AS-KB-ASSERTION", 5, 0, false);
        declareFunction("hl_deduce_as_kb_deduction", "HL-DEDUCE-AS-KB-DEDUCTION", 5, 2, false);
        declareFunction("hl_remove_as_kb_assertion", "HL-REMOVE-AS-KB-ASSERTION", 3, 0, false);
        declareFunction("hl_unassert_as_kb_assertion", "HL-UNASSERT-AS-KB-ASSERTION", 2, 0, false);
        declareFunction("hl_undeduce_as_kb_deduction", "HL-UNDEDUCE-AS-KB-DEDUCTION", 3, 0, false);
        declareFunction("hl_remove_all_as_kb_assertion", "HL-REMOVE-ALL-AS-KB-ASSERTION", 2, 0, false);
        declareFunction("ist_assertion_applicableP", "IST-ASSERTION-APPLICABLE?", 5, 0, false);
        declareFunction("ist_assertion_incompleteness", "IST-ASSERTION-INCOMPLETENESS", 5, 0, false);
        declareFunction("hl_add_as_ist_assertion", "HL-ADD-AS-IST-ASSERTION", 5, 0, false);
        declareFunction("hl_remove_as_ist_assertion", "HL-REMOVE-AS-IST-ASSERTION", 3, 0, false);
        declareFunction("hl_remove_all_as_ist_assertion", "HL-REMOVE-ALL-AS-IST-ASSERTION", 2, 0, false);
        declareFunction("constant_name_hl_storage_applicableP", "CONSTANT-NAME-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("constant_name_hl_storage_incompleteness", "CONSTANT-NAME-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("constant_name_hl_storage_assert", "CONSTANT-NAME-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("constant_name_hl_storage_unassert", "CONSTANT-NAME-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("constant_name_hl_storage_unassert_all", "CONSTANT-NAME-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction("assertion_direction_hl_storage_applicableP", "ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("assertion_direction_hl_storage_incompleteness", "ASSERTION-DIRECTION-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("assertion_direction_hl_storage_assert", "ASSERTION-DIRECTION-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("assertion_direction_hl_storage_unassert", "ASSERTION-DIRECTION-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("assertion_direction_hl_storage_unassert_all", "ASSERTION-DIRECTION-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction("indexical_the_user_hl_storage_applicableP", "INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("indexical_the_user_hl_storage_incompleteness", "INDEXICAL-THE-USER-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("indexical_the_user_hl_storage_assert", "INDEXICAL-THE-USER-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("indexical_the_user_hl_storage_unassert", "INDEXICAL-THE-USER-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("indexical_the_user_hl_storage_unassert_all", "INDEXICAL-THE-USER-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction("perform_subl_hl_storage_applicableP", "PERFORM-SUBL-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("perform_subl_hl_storage_incompleteness", "PERFORM-SUBL-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("perform_subl_hl_storage_assert", "PERFORM-SUBL-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("perform_subl_hl_storage_unassert", "PERFORM-SUBL-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("perform_subl_hl_storage_unassert_all", "PERFORM-SUBL-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction("repropagate_assertion_hl_storage_applicableP", "REPROPAGATE-ASSERTION-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("repropagate_assertion_hl_storage_incompleteness", "REPROPAGATE-ASSERTION-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("repropagate_assertion_hl_storage_assert", "REPROPAGATE-ASSERTION-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("repropagate_assertion_hl_storage_unassert", "REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("repropagate_assertion_hl_storage_unassert_all", "REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction("reconsider_assertion_deductions_hl_storage_applicableP", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("reconsider_assertion_deductions_hl_storage_incompleteness", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("reconsider_assertion_deductions_hl_storage_assert", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("reconsider_assertion_deductions_hl_storage_unassert", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("reconsider_assertion_deductions_hl_storage_unassert_all", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction("sks_registered_hl_storage_applicableP", "SKS-REGISTERED-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("sks_registered_hl_storage_incompleteness", "SKS-REGISTERED-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("sks_registered_hl_storage_assert", "SKS-REGISTERED-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("sks_registered_hl_storage_assert_int", "SKS-REGISTERED-HL-STORAGE-ASSERT-INT", 1, 0, false);
        declareFunction("sks_registered_hl_storage_unassert", "SKS-REGISTERED-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("sks_registered_hl_storage_unassert_int", "SKS-REGISTERED-HL-STORAGE-UNASSERT-INT", 1, 0, false);
        declareFunction("sks_registered_hl_storage_unassert_all", "SKS-REGISTERED-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction("assert_hl_storage_applicableP", "ASSERT-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction("assert_hl_storage_incompleteness", "ASSERT-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction("assert_hl_storage_assert", "ASSERT-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction("assert_hl_storage_unassert", "ASSERT-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction("assert_hl_storage_unassert_all", "ASSERT-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt28 = list(reader_make_constant_shell("constantName"), makeKeyword("CONSTANT"), makeKeyword("STRING"));

    static private final SubLList $list_alt30 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("assertionDirection"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionDirection"), makeKeyword("APPLICABILITY"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-UNASSERT") });

    static private final SubLList $list_alt32 = list(reader_make_constant_shell("assertionDirection"), makeKeyword("ASSERTION"), list($TEST, makeSymbol("CYCL-DIRECTION-P")));

    static private final SubLList $list_alt34 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("indexicalReferent TheUser"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("indexicalReferent"), makeKeyword("APPLICABILITY"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-UNASSERT") });

    static private final SubLList $list_alt36 = list(reader_make_constant_shell("indexicalReferent"), reader_make_constant_shell("TheUser"), makeKeyword("FULLY-BOUND"));

    static private final SubLList $list_alt40 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("performSubL"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell("performSubL"), makeKeyword("APPLICABILITY"), makeSymbol("PERFORM-SUBL-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("PERFORM-SUBL-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("PERFORM-SUBL-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("PERFORM-SUBL-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("PERFORM-SUBL-HL-STORAGE-UNASSERT") });

    static private final SubLList $list_alt41 = list(reader_make_constant_shell("performSubL"), list(makeKeyword("OR"), list(reader_make_constant_shell("SubLQuoteFn"), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell("ExpandSubLFn"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("LISTP"))), makeKeyword("FULLY-BOUND"))));

    static private final SubLList $list_alt42 = list(makeKeyword("MT"), makeKeyword("DIRECTION"), makeKeyword("STRENGTH"));

    static private final SubLString $str_alt44$Regular_KB_Assertion_Module_Categ = makeString("Regular KB Assertion Module Category");

    private static final SubLSymbol HL_STORAGE_MODULE_TEST_CASE = makeSymbol("HL-STORAGE-MODULE-TEST-CASE");

    static private final SubLList $list_alt47 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_HL_STORAGE_MODULE_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HL-STORAGE-MODULE-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_HL_STORAGE_MODULE_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HL-STORAGE-MODULE-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt62$hl_storage_module_declarations = makeString("hl-storage-module-declarations");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt64 = list(makeString("HL Storage Module Category"));

    private static final SubLSymbol REGULAR_KB_ASSERTION_MODULE_TEST_CASE = makeSymbol("REGULAR-KB-ASSERTION-MODULE-TEST-CASE");

    static private final SubLList $list_alt67 = list(list(makeSymbol("TEST-CONSTANT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("TEST-SENTENCE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("TEST-MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("TEST-SUPPORT-ASSERTION"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST"), NIL, makeKeyword("PROTECTED")));

    public static SubLObject init_hl_storage_module_declarations_file() {
        return NIL;
    }

    private static final SubLSymbol TEST_SUPPORT_ASSERTION = makeSymbol("TEST-SUPPORT-ASSERTION");

    public static final SubLObject setup_hl_storage_module_declarations_file_alt() {
        hl_storage_modules.hl_storage_module($REGULAR_KB_ASSERTION, $list_alt1);
        hl_storage_modules.hl_storage_module($IST, $list_alt21);
        hl_storage_modules.hl_storage_module($CONSTANT_NAME, $list_alt26);
        hl_storage_modules.hl_storage_module($ASSERTION_DIRECTION, $list_alt30);
        hl_storage_modules.hl_storage_module($INDEXICAL_THE_USER, $list_alt34);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$performSubL);
        hl_storage_modules.hl_storage_module($PERFORM_SUBL, $list_alt40);
        sunit_external.define_test_category($$$HL_Storage_Module_Category, UNPROVIDED);
        sunit_external.define_test_category($str_alt44$Regular_KB_Assertion_Module_Categ, list($$$HL_Storage_Module_Category));
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(HL_STORAGE_MODULE_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(HL_STORAGE_MODULE_TEST_CASE);
        classes.subloop_new_class(HL_STORAGE_MODULE_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt47);
        classes.class_set_implements_slot_listeners(HL_STORAGE_MODULE_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(HL_STORAGE_MODULE_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_HL_STORAGE_MODULE_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(HL_STORAGE_MODULE_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_HL_STORAGE_MODULE_TEST_CASE_INSTANCE);
        com.cyc.cycjava.cycl.hl_storage_module_declarations.subloop_reserved_initialize_hl_storage_module_test_case_class(HL_STORAGE_MODULE_TEST_CASE);
        sunit_macros.define_test_case_postamble(HL_STORAGE_MODULE_TEST_CASE, $str_alt62$hl_storage_module_declarations, $$$cycl, $list_alt64);
        sunit_macros.def_test_method_register(HL_STORAGE_MODULE_TEST_CASE, TEST);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(REGULAR_KB_ASSERTION_MODULE_TEST_CASE);
        classes.subloop_new_class(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt67);
        classes.class_set_implements_slot_listeners(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, $sym72$SUBLOOP_RESERVED_INITIALIZE_REGULAR_KB_ASSERTION_MODULE_TEST_CASE);
        classes.subloop_note_instance_initialization_function(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, $sym73$SUBLOOP_RESERVED_INITIALIZE_REGULAR_KB_ASSERTION_MODULE_TEST_CASE);
        com.cyc.cycjava.cycl.hl_storage_module_declarations.subloop_reserved_initialize_regular_kb_assertion_module_test_case_class(REGULAR_KB_ASSERTION_MODULE_TEST_CASE);
        sunit_macros.define_test_case_postamble(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, $str_alt74$hl_storage_modules, $$$cycl, $list_alt75);
        sunit_macros.def_test_method_register(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, TEST);
        sunit_external.define_test_suite($$$HL_Storage_Module_Test_Suite, list($$$HL_Storage_Module_Category), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject setup_hl_storage_module_declarations_file() {
        if (SubLFiles.USE_V1) {
            hl_storage_modules.hl_storage_module($REGULAR_KB_ASSERTION, $list1);
            note_funcall_helper_function(HL_ADD_AS_KB_ASSERTION);
            note_funcall_helper_function(HL_REMOVE_AS_KB_ASSERTION);
            hl_storage_modules.hl_storage_module($IST, $list26);
            hl_storage_modules.hl_storage_module($CONSTANT_NAME, $list31);
            hl_storage_modules.hl_storage_module($ASSERTION_DIRECTION, $list35);
            hl_storage_modules.hl_storage_module($INDEXICAL_THE_USER, $list39);
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$performSubL);
            hl_storage_modules.hl_storage_module($PERFORM_SUBL, $list45);
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$repropagateAssertion);
            hl_storage_modules.hl_storage_module($REPROPAGATE_ASSERTION, $list50);
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$reconsiderAssertionDeductions);
            hl_storage_modules.hl_storage_module($RECONSIDER_ASSERTION_DEDUCTIONS, $list53);
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$sksRegistered);
            hl_storage_modules.hl_storage_module($SKS_REGISTERED, $list56);
            note_funcall_helper_function($sym58$SKS_REGISTERED_HL_STORAGE_APPLICABLE_);
            note_funcall_helper_function(SKS_REGISTERED_HL_STORAGE_INCOMPLETENESS);
            sunit_external.define_test_category($$$HL_Storage_Module_Category, UNPROVIDED);
            sunit_external.define_test_category($str61$Regular_KB_Assertion_Module_Categ, list($$$HL_Storage_Module_Category));
            sunit_external.define_test_suite($$$HL_Storage_Module_Test_Suite, list($$$HL_Storage_Module_Category), UNPROVIDED, UNPROVIDED);
            hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$assert);
            hl_storage_modules.hl_storage_module($ASSERT, $list65);
        }
        if (SubLFiles.USE_V2) {
            hl_storage_modules.hl_storage_module($IST, $list_alt21);
            hl_storage_modules.hl_storage_module($CONSTANT_NAME, $list_alt26);
            hl_storage_modules.hl_storage_module($ASSERTION_DIRECTION, $list_alt30);
            hl_storage_modules.hl_storage_module($INDEXICAL_THE_USER, $list_alt34);
            hl_storage_modules.hl_storage_module($PERFORM_SUBL, $list_alt40);
            sunit_external.define_test_category($str_alt44$Regular_KB_Assertion_Module_Categ, list($$$HL_Storage_Module_Category));
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(HL_STORAGE_MODULE_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(HL_STORAGE_MODULE_TEST_CASE);
            classes.subloop_new_class(HL_STORAGE_MODULE_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt47);
            classes.class_set_implements_slot_listeners(HL_STORAGE_MODULE_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(HL_STORAGE_MODULE_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_HL_STORAGE_MODULE_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(HL_STORAGE_MODULE_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_HL_STORAGE_MODULE_TEST_CASE_INSTANCE);
            com.cyc.cycjava.cycl.hl_storage_module_declarations.subloop_reserved_initialize_hl_storage_module_test_case_class(HL_STORAGE_MODULE_TEST_CASE);
            sunit_macros.define_test_case_postamble(HL_STORAGE_MODULE_TEST_CASE, $str_alt62$hl_storage_module_declarations, $$$cycl, $list_alt64);
            sunit_macros.def_test_method_register(HL_STORAGE_MODULE_TEST_CASE, TEST);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(REGULAR_KB_ASSERTION_MODULE_TEST_CASE);
            classes.subloop_new_class(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt67);
            classes.class_set_implements_slot_listeners(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, $sym72$SUBLOOP_RESERVED_INITIALIZE_REGULAR_KB_ASSERTION_MODULE_TEST_CASE);
            classes.subloop_note_instance_initialization_function(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, $sym73$SUBLOOP_RESERVED_INITIALIZE_REGULAR_KB_ASSERTION_MODULE_TEST_CASE);
            com.cyc.cycjava.cycl.hl_storage_module_declarations.subloop_reserved_initialize_regular_kb_assertion_module_test_case_class(REGULAR_KB_ASSERTION_MODULE_TEST_CASE);
            sunit_macros.define_test_case_postamble(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, $str_alt74$hl_storage_modules, $$$cycl, $list_alt75);
            sunit_macros.def_test_method_register(REGULAR_KB_ASSERTION_MODULE_TEST_CASE, TEST);
        }
        return NIL;
    }

    public static SubLObject setup_hl_storage_module_declarations_file_Previous() {
        hl_storage_modules.hl_storage_module($REGULAR_KB_ASSERTION, $list1);
        note_funcall_helper_function(HL_ADD_AS_KB_ASSERTION);
        note_funcall_helper_function(HL_REMOVE_AS_KB_ASSERTION);
        hl_storage_modules.hl_storage_module($IST, $list26);
        hl_storage_modules.hl_storage_module($CONSTANT_NAME, $list31);
        hl_storage_modules.hl_storage_module($ASSERTION_DIRECTION, $list35);
        hl_storage_modules.hl_storage_module($INDEXICAL_THE_USER, $list39);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$performSubL);
        hl_storage_modules.hl_storage_module($PERFORM_SUBL, $list45);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$repropagateAssertion);
        hl_storage_modules.hl_storage_module($REPROPAGATE_ASSERTION, $list50);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$reconsiderAssertionDeductions);
        hl_storage_modules.hl_storage_module($RECONSIDER_ASSERTION_DEDUCTIONS, $list53);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$sksRegistered);
        hl_storage_modules.hl_storage_module($SKS_REGISTERED, $list56);
        note_funcall_helper_function($sym58$SKS_REGISTERED_HL_STORAGE_APPLICABLE_);
        note_funcall_helper_function(SKS_REGISTERED_HL_STORAGE_INCOMPLETENESS);
        sunit_external.define_test_category($$$HL_Storage_Module_Category, UNPROVIDED);
        sunit_external.define_test_category($str61$Regular_KB_Assertion_Module_Categ, list($$$HL_Storage_Module_Category));
        sunit_external.define_test_suite($$$HL_Storage_Module_Test_Suite, list($$$HL_Storage_Module_Category), UNPROVIDED, UNPROVIDED);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$assert);
        hl_storage_modules.hl_storage_module($ASSERT, $list65);
        return NIL;
    }

    private static final SubLSymbol TEST_MT = makeSymbol("TEST-MT");

    private static final SubLSymbol TEST_SENTENCE = makeSymbol("TEST-SENTENCE");

    private static final SubLSymbol TEST_CONSTANT = makeSymbol("TEST-CONSTANT");

    static private final SubLSymbol $sym72$SUBLOOP_RESERVED_INITIALIZE_REGULAR_KB_ASSERTION_MODULE_TEST_CASE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-CLASS");

    static private final SubLSymbol $sym73$SUBLOOP_RESERVED_INITIALIZE_REGULAR_KB_ASSERTION_MODULE_TEST_CASE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REGULAR-KB-ASSERTION-MODULE-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt74$hl_storage_modules = makeString("hl-storage-modules");

    static private final SubLList $list_alt75 = list(makeString("Regular KB Assertion Module Category"));

    @Override
    public void declareFunctions() {
        declare_hl_storage_module_declarations_file();
    }

    @Override
    public void initializeVariables() {
        init_hl_storage_module_declarations_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_hl_storage_module_declarations_file();
    }

    static {
    }
}

/**
 * Total time: 308 ms
 */
