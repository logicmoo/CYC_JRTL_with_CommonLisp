package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class hl_storage_module_declarations extends SubLTranslatedFile {
    public static final SubLFile me = new hl_storage_module_declarations();

    public static final String myName = "com.cyc.cycjava.cycl.hl_storage_module_declarations";

    public static final String myFingerPrint = "152d53f29f6df3033e0fb8736589180fc5dad9b276e8ab7477b9a754b77352ba";

    private static final SubLSymbol $REGULAR_KB_ASSERTION = makeKeyword("REGULAR-KB-ASSERTION");

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("Regular KB Assertion"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("APPLICABILITY"), makeSymbol("REGULAR-KB-ASSERTION-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("REGULAR-KB-ASSERTION-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("HL-ADD-AS-KB-ASSERTION"), makeKeyword("REMOVE"), makeSymbol("HL-REMOVE-AS-KB-ASSERTION"), makeKeyword("REMOVE-ALL"), makeSymbol("HL-REMOVE-ALL-AS-KB-ASSERTION") });



    public static final SubLSymbol ASSERTED_ARGUMENT_SPEC_P = makeSymbol("ASSERTED-ARGUMENT-SPEC-P");



    public static final SubLSymbol DEDUCTION_SPEC_P = makeSymbol("DEDUCTION-SPEC-P");

    public static final SubLList $list6 = list(makeKeyword("GENERIC-ERROR"), makeString("Unknown argument type ~S"));

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







    public static final SubLList $list26 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("ist"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("ist")), makeKeyword("APPLICABILITY"), makeSymbol("IST-ASSERTION-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("IST-ASSERTION-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("HL-ADD-AS-IST-ASSERTION"), makeKeyword("REMOVE"), makeSymbol("HL-REMOVE-AS-IST-ASSERTION"), makeKeyword("REMOVE-ALL"), makeSymbol("HL-REMOVE-ALL-AS-IST-ASSERTION") });

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    public static final SubLList $list28 = list(reader_make_constant_shell(makeString("ist")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    private static final SubLList $list29 = list(makeSymbol("SUB-CNF"), makeSymbol("&OPTIONAL"), makeSymbol("SUB-VARIABLE-MAP"), makeSymbol("QUERY-FREE-VARS"));



    private static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("constantName"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantName")), makeKeyword("APPLICABILITY"), makeSymbol("CONSTANT-NAME-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("CONSTANT-NAME-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("CONSTANT-NAME-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("CONSTANT-NAME-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("CONSTANT-NAME-HL-STORAGE-UNASSERT-ALL") });

    private static final SubLObject $$constantName = reader_make_constant_shell(makeString("constantName"));

    private static final SubLList $list33 = list(reader_make_constant_shell(makeString("constantName")), makeKeyword("CONSTANT"), makeKeyword("STRING"));



    private static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("assertionDirection"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionDirection")), makeKeyword("APPLICABILITY"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-UNASSERT-ALL") });

    private static final SubLObject $$assertionDirection = reader_make_constant_shell(makeString("assertionDirection"));

    private static final SubLList $list37 = list(reader_make_constant_shell(makeString("assertionDirection")), makeKeyword("ASSERTION"), list(makeKeyword("TEST"), makeSymbol("CYCL-DIRECTION-P")));

    private static final SubLSymbol $INDEXICAL_THE_USER = makeKeyword("INDEXICAL-THE-USER");

    private static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("indexicalReferent TheUser"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("indexicalReferent")), makeKeyword("APPLICABILITY"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-UNASSERT-ALL") });

    private static final SubLObject $$indexicalReferent = reader_make_constant_shell(makeString("indexicalReferent"));

    public static final SubLList $list41 = list(reader_make_constant_shell(makeString("indexicalReferent")), reader_make_constant_shell(makeString("TheUser")), makeKeyword("FULLY-BOUND"));

    private static final SubLObject $$TheUser = reader_make_constant_shell(makeString("TheUser"));

    private static final SubLObject $$performSubL = reader_make_constant_shell(makeString("performSubL"));



    private static final SubLList $list45 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("performSubL"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("performSubL")), makeKeyword("APPLICABILITY"), makeSymbol("PERFORM-SUBL-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("PERFORM-SUBL-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("PERFORM-SUBL-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("PERFORM-SUBL-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("PERFORM-SUBL-HL-STORAGE-UNASSERT-ALL") });

    private static final SubLList $list46 = list(reader_make_constant_shell(makeString("performSubL")), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("SubLQuoteFn")), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell(makeString("ExpandSubLFn")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("LISTP"))), makeKeyword("FULLY-BOUND"))));

    public static final SubLList $list47 = list(makeKeyword("MT"), makeKeyword("DIRECTION"), makeKeyword("STRENGTH"));

    private static final SubLObject $$repropagateAssertion = reader_make_constant_shell(makeString("repropagateAssertion"));



    private static final SubLList $list50 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("repropagateAssertion"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("repropagateAssertion")), makeKeyword("APPLICABILITY"), makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT-ALL") });

    private static final SubLObject $$reconsiderAssertionDeductions = reader_make_constant_shell(makeString("reconsiderAssertionDeductions"));

    private static final SubLSymbol $RECONSIDER_ASSERTION_DEDUCTIONS = makeKeyword("RECONSIDER-ASSERTION-DEDUCTIONS");

    private static final SubLList $list53 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("reconsiderAssertionDeductions"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("reconsiderAssertionDeductions")), makeKeyword("APPLICABILITY"), makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT-ALL") });

    private static final SubLObject $$sksRegistered = reader_make_constant_shell(makeString("sksRegistered"));



    private static final SubLList $list56 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("sksRegistered"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("APPLICABILITY"), makeSymbol("SKS-REGISTERED-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("SKS-REGISTERED-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("SKS-REGISTERED-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("SKS-REGISTERED-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("SKS-REGISTERED-HL-STORAGE-UNASSERT-ALL") });

    private static final SubLList $list57 = list(reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("FULLY-BOUND"));

    private static final SubLSymbol $sym58$SKS_REGISTERED_HL_STORAGE_APPLICABLE_ = makeSymbol("SKS-REGISTERED-HL-STORAGE-APPLICABLE?");

    private static final SubLSymbol SKS_REGISTERED_HL_STORAGE_INCOMPLETENESS = makeSymbol("SKS-REGISTERED-HL-STORAGE-INCOMPLETENESS");

    private static final SubLString $$$HL_Storage_Module_Category = makeString("HL Storage Module Category");

    private static final SubLString $str61$Regular_KB_Assertion_Module_Categ = makeString("Regular KB Assertion Module Category");

    private static final SubLString $$$HL_Storage_Module_Test_Suite = makeString("HL Storage Module Test Suite");

    private static final SubLObject $$assert = reader_make_constant_shell(makeString("assert"));



    private static final SubLList $list65 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("assert"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assert")), makeKeyword("APPLICABILITY"), makeSymbol("ASSERT-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("ASSERT-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("ASSERT-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("ASSERT-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("ASSERT-HL-STORAGE-UNASSERT-ALL") });

    private static final SubLList $list66 = list(makeSymbol("CNF"), makeSymbol("&OPTIONAL"), makeSymbol("VARIABLE-MAP"), makeSymbol("QUERY-FREE-VARS"));



    public static SubLObject regular_kb_assertion_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return makeBoolean(((((((((NIL == bookkeeping_store.my_creator_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map)) && (NIL == bookkeeping_store.my_creation_time_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == bookkeeping_store.my_creation_purpose_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == bookkeeping_store.my_creation_second_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == ist_assertion_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == assertion_direction_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == perform_subl_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == indexical_the_user_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))) && (NIL == constant_name_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map)));
    }

    public static SubLObject regular_kb_assertion_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return NIL;
    }

    public static SubLObject hl_add_as_kb_assertion(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject pcase_var;
        final SubLObject argument_type = pcase_var = arguments.argument_spec_type(argument_spec);
        if (pcase_var.eql($ASSERTED_ARGUMENT)) {
            assert NIL != arguments.asserted_argument_spec_p(argument_spec) : "arguments.asserted_argument_spec_p(argument_spec) " + "CommonSymbols.NIL != arguments.asserted_argument_spec_p(argument_spec) " + argument_spec;
            final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
            return hl_assert_as_kb_assertion(cnf, mt, strength_spec, direction, variable_map);
        } else {
            if (!pcase_var.eql($DEDUCTION)) {
                fi.signal_fi_error($list6);
                return NIL;
            }
            assert NIL != deductions_high.deduction_spec_p(argument_spec) : "deductions_high.deduction_spec_p(argument_spec) " + "CommonSymbols.NIL != deductions_high.deduction_spec_p(argument_spec) " + argument_spec;
            final SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
            final SubLObject v_bindings = deductions_high.deduction_spec_bindings(argument_spec);
            final SubLObject pragmatic_support_mts = deductions_high.deduction_spec_pragmatic_support_mts(argument_spec);
            return hl_deduce_as_kb_deduction(cnf, mt, supports, direction, variable_map, v_bindings, pragmatic_support_mts);
        }
    }

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

    public static SubLObject hl_remove_as_kb_assertion(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLObject pcase_var;
        final SubLObject argument_type = pcase_var = arguments.argument_spec_type(argument_spec);
        if (pcase_var.eql($ASSERTED_ARGUMENT)) {
            assert NIL != arguments.asserted_argument_spec_p(argument_spec) : "arguments.asserted_argument_spec_p(argument_spec) " + "CommonSymbols.NIL != arguments.asserted_argument_spec_p(argument_spec) " + argument_spec;
            final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
            return hl_unassert_as_kb_assertion(cnf, mt);
        } else {
            if (!pcase_var.eql($DEDUCTION)) {
                fi.signal_fi_error($list6);
                return NIL;
            }
            assert NIL != deductions_high.deduction_spec_p(argument_spec) : "deductions_high.deduction_spec_p(argument_spec) " + "CommonSymbols.NIL != deductions_high.deduction_spec_p(argument_spec) " + argument_spec;
            final SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
            return hl_undeduce_as_kb_deduction(cnf, mt, supports);
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

    public static SubLObject hl_remove_all_as_kb_assertion(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != clauses.cnf_p(cnf) : "clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) " + cnf;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
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

    public static SubLObject ist_assertion_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clauses.atomic_clause_p(cnf)) {
            final SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$ist)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings($list28, asent);
            }
        }
        return NIL;
    }

    public static SubLObject ist_assertion_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return NIL;
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

    public static SubLObject constant_name_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$constantName)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings($list33, asent);
            }
        }
        return NIL;
    }

    public static SubLObject constant_name_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return NIL;
    }

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

    public static SubLObject assertion_direction_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$assertionDirection)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings($list37, asent);
            }
        }
        return NIL;
    }

    public static SubLObject assertion_direction_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return NIL;
    }

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

    public static SubLObject assertion_direction_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return T;
    }

    public static SubLObject assertion_direction_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return assertion_direction_hl_storage_unassert(NIL, cnf, mt);
    }

    public static SubLObject indexical_the_user_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$indexicalReferent)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings($list41, asent);
            }
        }
        return NIL;
    }

    public static SubLObject indexical_the_user_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return NIL;
    }

    public static SubLObject indexical_the_user_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject cyclist = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (((NIL != forts.fort_p(cyclist)) && (NIL != kb_accessors.cyclistP(cyclist))) && (!$$TheUser.eql(cyclist))) {
            operation_communication.set_the_cyclist(cyclist);
            return equal(cyclist, operation_communication.the_cyclist());
        }
        return NIL;
    }

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

    public static SubLObject perform_subl_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (NIL != el_formula_with_operator_p(asent, $$performSubL)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings($list46, asent);
            }
        }
        return NIL;
    }

    public static SubLObject perform_subl_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return $list47;
    }

    public static SubLObject perform_subl_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject subl = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return removal_modules_perform_subl.inference_perform_subl(subl);
    }

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

    public static SubLObject assert_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return T;
    }

    public static SubLObject assert_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return assert_hl_storage_unassert(NIL, cnf, mt);
    }

    public static SubLObject declare_hl_storage_module_declarations_file() {
        declareFunction(me, "regular_kb_assertion_applicableP", "REGULAR-KB-ASSERTION-APPLICABLE?", 5, 0, false);
        declareFunction(me, "regular_kb_assertion_incompleteness", "REGULAR-KB-ASSERTION-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "hl_add_as_kb_assertion", "HL-ADD-AS-KB-ASSERTION", 5, 0, false);
        declareFunction(me, "hl_assert_as_kb_assertion", "HL-ASSERT-AS-KB-ASSERTION", 5, 0, false);
        declareFunction(me, "hl_deduce_as_kb_deduction", "HL-DEDUCE-AS-KB-DEDUCTION", 5, 2, false);
        declareFunction(me, "hl_remove_as_kb_assertion", "HL-REMOVE-AS-KB-ASSERTION", 3, 0, false);
        declareFunction(me, "hl_unassert_as_kb_assertion", "HL-UNASSERT-AS-KB-ASSERTION", 2, 0, false);
        declareFunction(me, "hl_undeduce_as_kb_deduction", "HL-UNDEDUCE-AS-KB-DEDUCTION", 3, 0, false);
        declareFunction(me, "hl_remove_all_as_kb_assertion", "HL-REMOVE-ALL-AS-KB-ASSERTION", 2, 0, false);
        declareFunction(me, "ist_assertion_applicableP", "IST-ASSERTION-APPLICABLE?", 5, 0, false);
        declareFunction(me, "ist_assertion_incompleteness", "IST-ASSERTION-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "hl_add_as_ist_assertion", "HL-ADD-AS-IST-ASSERTION", 5, 0, false);
        declareFunction(me, "hl_remove_as_ist_assertion", "HL-REMOVE-AS-IST-ASSERTION", 3, 0, false);
        declareFunction(me, "hl_remove_all_as_ist_assertion", "HL-REMOVE-ALL-AS-IST-ASSERTION", 2, 0, false);
        declareFunction(me, "constant_name_hl_storage_applicableP", "CONSTANT-NAME-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "constant_name_hl_storage_incompleteness", "CONSTANT-NAME-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "constant_name_hl_storage_assert", "CONSTANT-NAME-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction(me, "constant_name_hl_storage_unassert", "CONSTANT-NAME-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction(me, "constant_name_hl_storage_unassert_all", "CONSTANT-NAME-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction(me, "assertion_direction_hl_storage_applicableP", "ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "assertion_direction_hl_storage_incompleteness", "ASSERTION-DIRECTION-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "assertion_direction_hl_storage_assert", "ASSERTION-DIRECTION-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction(me, "assertion_direction_hl_storage_unassert", "ASSERTION-DIRECTION-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction(me, "assertion_direction_hl_storage_unassert_all", "ASSERTION-DIRECTION-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction(me, "indexical_the_user_hl_storage_applicableP", "INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "indexical_the_user_hl_storage_incompleteness", "INDEXICAL-THE-USER-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "indexical_the_user_hl_storage_assert", "INDEXICAL-THE-USER-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction(me, "indexical_the_user_hl_storage_unassert", "INDEXICAL-THE-USER-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction(me, "indexical_the_user_hl_storage_unassert_all", "INDEXICAL-THE-USER-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction(me, "perform_subl_hl_storage_applicableP", "PERFORM-SUBL-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "perform_subl_hl_storage_incompleteness", "PERFORM-SUBL-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "perform_subl_hl_storage_assert", "PERFORM-SUBL-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction(me, "perform_subl_hl_storage_unassert", "PERFORM-SUBL-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction(me, "perform_subl_hl_storage_unassert_all", "PERFORM-SUBL-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction(me, "repropagate_assertion_hl_storage_applicableP", "REPROPAGATE-ASSERTION-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "repropagate_assertion_hl_storage_incompleteness", "REPROPAGATE-ASSERTION-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "repropagate_assertion_hl_storage_assert", "REPROPAGATE-ASSERTION-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction(me, "repropagate_assertion_hl_storage_unassert", "REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction(me, "repropagate_assertion_hl_storage_unassert_all", "REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction(me, "reconsider_assertion_deductions_hl_storage_applicableP", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "reconsider_assertion_deductions_hl_storage_incompleteness", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "reconsider_assertion_deductions_hl_storage_assert", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction(me, "reconsider_assertion_deductions_hl_storage_unassert", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction(me, "reconsider_assertion_deductions_hl_storage_unassert_all", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction(me, "sks_registered_hl_storage_applicableP", "SKS-REGISTERED-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "sks_registered_hl_storage_incompleteness", "SKS-REGISTERED-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "sks_registered_hl_storage_assert", "SKS-REGISTERED-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction(me, "sks_registered_hl_storage_assert_int", "SKS-REGISTERED-HL-STORAGE-ASSERT-INT", 1, 0, false);
        declareFunction(me, "sks_registered_hl_storage_unassert", "SKS-REGISTERED-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction(me, "sks_registered_hl_storage_unassert_int", "SKS-REGISTERED-HL-STORAGE-UNASSERT-INT", 1, 0, false);
        declareFunction(me, "sks_registered_hl_storage_unassert_all", "SKS-REGISTERED-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        declareFunction(me, "assert_hl_storage_applicableP", "ASSERT-HL-STORAGE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "assert_hl_storage_incompleteness", "ASSERT-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "assert_hl_storage_assert", "ASSERT-HL-STORAGE-ASSERT", 5, 0, false);
        declareFunction(me, "assert_hl_storage_unassert", "ASSERT-HL-STORAGE-UNASSERT", 3, 0, false);
        declareFunction(me, "assert_hl_storage_unassert_all", "ASSERT-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_hl_storage_module_declarations_file() {
        return NIL;
    }

    public static SubLObject setup_hl_storage_module_declarations_file() {
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

    
}

/**
 * Total time: 308 ms
 */
