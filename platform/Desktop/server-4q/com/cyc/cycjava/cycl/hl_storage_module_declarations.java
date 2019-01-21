package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_perform_subl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hl_storage_module_declarations extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.hl_storage_module_declarations";
    public static final String myFingerPrint = "152d53f29f6df3033e0fb8736589180fc5dad9b276e8ab7477b9a754b77352ba";
    private static final SubLSymbol $kw0$REGULAR_KB_ASSERTION;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ASSERTED_ARGUMENT;
    private static final SubLSymbol $sym3$ASSERTED_ARGUMENT_SPEC_P;
    private static final SubLSymbol $kw4$DEDUCTION;
    private static final SubLSymbol $sym5$DEDUCTION_SPEC_P;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$HL_ADD_AS_KB_ASSERTION;
    private static final SubLSymbol $sym8$VARIABLE_NAME;
    private static final SubLSymbol $kw9$UNCHANGED;
    private static final SubLSymbol $kw10$FLIPPED;
    private static final SubLSymbol $kw11$FALSE;
    private static final SubLSymbol $kw12$ARGUMENT_ALREADY_PRESENT;
    private static final SubLString $str13$Argument_for__S_in__S_is_already_;
    private static final SubLSymbol $kw14$GENERIC_ERROR;
    private static final SubLString $str15$Unable_to_add_argument_for__S_in_;
    private static final SubLSymbol $sym16$HL_REMOVE_AS_KB_ASSERTION;
    private static final SubLSymbol $kw17$ASSERTION_NOT_PRESENT;
    private static final SubLString $str18$Formula__S_in_mt__S_is_not_in_the;
    private static final SubLSymbol $kw19$ASSERTION_NOT_LOCAL;
    private static final SubLString $str20$Formula__S_in_mt__S_is_not_locall;
    private static final SubLSymbol $kw21$ARGUMENT_NOT_PRESENT;
    private static final SubLString $str22$Argument__S___for__S_in_mt__S_is_;
    private static final SubLSymbol $sym23$CNF_P;
    private static final SubLSymbol $sym24$HLMT_P;
    private static final SubLSymbol $kw25$IST;
    private static final SubLList $list26;
    private static final SubLObject $const27$ist;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$CONSTANT_NAME;
    private static final SubLList $list31;
    private static final SubLObject $const32$constantName;
    private static final SubLList $list33;
    private static final SubLSymbol $kw34$ASSERTION_DIRECTION;
    private static final SubLList $list35;
    private static final SubLObject $const36$assertionDirection;
    private static final SubLList $list37;
    private static final SubLSymbol $kw38$INDEXICAL_THE_USER;
    private static final SubLList $list39;
    private static final SubLObject $const40$indexicalReferent;
    private static final SubLList $list41;
    private static final SubLObject $const42$TheUser;
    private static final SubLObject $const43$performSubL;
    private static final SubLSymbol $kw44$PERFORM_SUBL;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLObject $const48$repropagateAssertion;
    private static final SubLSymbol $kw49$REPROPAGATE_ASSERTION;
    private static final SubLList $list50;
    private static final SubLObject $const51$reconsiderAssertionDeductions;
    private static final SubLSymbol $kw52$RECONSIDER_ASSERTION_DEDUCTIONS;
    private static final SubLList $list53;
    private static final SubLObject $const54$sksRegistered;
    private static final SubLSymbol $kw55$SKS_REGISTERED;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$SKS_REGISTERED_HL_STORAGE_APPLICABLE_;
    private static final SubLSymbol $sym59$SKS_REGISTERED_HL_STORAGE_INCOMPLETENESS;
    private static final SubLString $str60$HL_Storage_Module_Category;
    private static final SubLString $str61$Regular_KB_Assertion_Module_Categ;
    private static final SubLString $str62$HL_Storage_Module_Test_Suite;
    private static final SubLObject $const63$assert;
    private static final SubLSymbol $kw64$ASSERT;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$BOOLEAN;
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 1537L)
    public static SubLObject regular_kb_assertion_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_storage_module_declarations.NIL == bookkeeping_store.my_creator_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map) && hl_storage_module_declarations.NIL == bookkeeping_store.my_creation_time_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map) && hl_storage_module_declarations.NIL == bookkeeping_store.my_creation_purpose_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map) && hl_storage_module_declarations.NIL == bookkeeping_store.my_creation_second_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map) && hl_storage_module_declarations.NIL == ist_assertion_applicableP(argument_spec, cnf, mt, direction, variable_map) && hl_storage_module_declarations.NIL == assertion_direction_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map) && hl_storage_module_declarations.NIL == perform_subl_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map) && hl_storage_module_declarations.NIL == indexical_the_user_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map) && hl_storage_module_declarations.NIL == constant_name_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 2849L)
    public static SubLObject regular_kb_assertion_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 3016L)
    public static SubLObject hl_add_as_kb_assertion(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject pcase_var;
        final SubLObject argument_type = pcase_var = arguments.argument_spec_type(argument_spec);
        if (pcase_var.eql((SubLObject)hl_storage_module_declarations.$kw2$ASSERTED_ARGUMENT)) {
            assert hl_storage_module_declarations.NIL != arguments.asserted_argument_spec_p(argument_spec) : argument_spec;
            final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
            return hl_assert_as_kb_assertion(cnf, mt, strength_spec, direction, variable_map);
        }
        else {
            if (!pcase_var.eql((SubLObject)hl_storage_module_declarations.$kw4$DEDUCTION)) {
                fi.signal_fi_error((SubLObject)hl_storage_module_declarations.$list6);
                return (SubLObject)hl_storage_module_declarations.NIL;
            }
            assert hl_storage_module_declarations.NIL != deductions_high.deduction_spec_p(argument_spec) : argument_spec;
            final SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
            final SubLObject v_bindings = deductions_high.deduction_spec_bindings(argument_spec);
            final SubLObject pragmatic_support_mts = deductions_high.deduction_spec_pragmatic_support_mts(argument_spec);
            return hl_deduce_as_kb_deduction(cnf, mt, supports, direction, variable_map, v_bindings, pragmatic_support_mts);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 3948L)
    public static SubLObject hl_assert_as_kb_assertion(final SubLObject cnf, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_storage_module_declarations.NIL;
        final SubLObject canon_version = (SubLObject)ConsesLow.list(cnf, variable_map);
        thread.resetMultipleValues();
        final SubLObject cnf_$1 = fi.fi_canonicalize(canon_version, (SubLObject)hl_storage_module_declarations.T, strength);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject var_names = Mapping.mapcar((SubLObject)hl_storage_module_declarations.$sym8$VARIABLE_NAME, v_variables);
        SubLObject assertion = kb_indexing.find_assertion(cnf_$1, mt);
        final SubLObject pre_existing_assertionP = (SubLObject)SubLObjectFactory.makeBoolean(hl_storage_module_declarations.NIL != assertion);
        if (hl_storage_module_declarations.NIL == assertion_handles.valid_assertionP(assertion, (SubLObject)hl_storage_module_declarations.UNPROVIDED)) {
            assertion = assertions_high.create_assertion(cnf_$1, mt, var_names, direction, enumeration_types.tv_truth(hl_tv), enumeration_types.tv_strength(hl_tv), arguments.create_asserted_argument((SubLObject)hl_storage_module_declarations.NIL, hl_tv));
        }
        if (hl_storage_module_declarations.NIL != assertion) {
            thread.resetMultipleValues();
            final SubLObject new_assertion = fi.hl_assert_update_asserted_argument(assertion, hl_tv, direction, pre_existing_assertionP);
            final SubLObject truth_status = thread.secondMultipleValue();
            final SubLObject strength_status = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (truth_status != hl_storage_module_declarations.$kw9$UNCHANGED) {
                if (truth_status == hl_storage_module_declarations.$kw10$FLIPPED) {
                    kb_modification_event.post_kb_modify_remove_assertion_event(new_assertion, (SubLObject)hl_storage_module_declarations.$kw11$FALSE);
                }
                final SubLObject intuitive_cnf = assertions_high.intuitive_assertion_cnf(new_assertion);
                kb_modification_event.post_kb_modify_create_assertion_event(intuitive_cnf, mt);
            }
            result = new_assertion;
        }
        else {
            result = (SubLObject)hl_storage_module_declarations.NIL;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 5390L)
    public static SubLObject hl_deduce_as_kb_deduction(final SubLObject cnf, final SubLObject mt, final SubLObject supports, final SubLObject direction, final SubLObject variable_map, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == hl_storage_module_declarations.UNPROVIDED) {
            v_bindings = (SubLObject)hl_storage_module_declarations.NIL;
        }
        if (pragmatic_support_mts == hl_storage_module_declarations.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)hl_storage_module_declarations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_version = (SubLObject)ConsesLow.list(cnf, variable_map);
        thread.resetMultipleValues();
        final SubLObject cnf_$2 = fi.fi_canonicalize(canon_version, (SubLObject)hl_storage_module_declarations.T, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject var_names = Mapping.mapcar((SubLObject)hl_storage_module_declarations.$sym8$VARIABLE_NAME, v_variables);
        final SubLObject support_truth = enumeration_types.tv_truth(hl_tv);
        final SubLObject supports_copy = conses_high.copy_tree(supports);
        thread.resetMultipleValues();
        final SubLObject deduction = tms.tms_add_deduction_for_cnf(cnf_$2, mt, supports_copy, support_truth, direction, var_names, v_bindings, pragmatic_support_mts);
        final SubLObject redundantP = thread.secondMultipleValue();
        final SubLObject newly_createdP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (hl_storage_module_declarations.NIL != newly_createdP) {
            final SubLObject intuitive_cnf = assertions_high.intuitive_cnf(cnf_$2, support_truth);
            kb_modification_event.post_kb_modify_create_assertion_event(intuitive_cnf, mt);
        }
        if (hl_storage_module_declarations.NIL != redundantP || hl_storage_module_declarations.NIL != deduction_handles.deduction_p(deduction)) {
            if (hl_storage_module_declarations.NIL != redundantP) {
                final SubLObject formula = clauses.cnf_formula(cnf_$2, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
                fi.signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)hl_storage_module_declarations.$kw12$ARGUMENT_ALREADY_PRESENT, (SubLObject)hl_storage_module_declarations.$str13$Argument_for__S_in__S_is_already_, formula, mt));
            }
            return deduction;
        }
        final SubLObject formula = clauses.cnf_formula(cnf_$2, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)hl_storage_module_declarations.$kw14$GENERIC_ERROR, (SubLObject)hl_storage_module_declarations.$str15$Unable_to_add_argument_for__S_in_, formula, mt));
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 6622L)
    public static SubLObject hl_remove_as_kb_assertion(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLObject pcase_var;
        final SubLObject argument_type = pcase_var = arguments.argument_spec_type(argument_spec);
        if (pcase_var.eql((SubLObject)hl_storage_module_declarations.$kw2$ASSERTED_ARGUMENT)) {
            assert hl_storage_module_declarations.NIL != arguments.asserted_argument_spec_p(argument_spec) : argument_spec;
            final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
            return hl_unassert_as_kb_assertion(cnf, mt);
        }
        else {
            if (!pcase_var.eql((SubLObject)hl_storage_module_declarations.$kw4$DEDUCTION)) {
                fi.signal_fi_error((SubLObject)hl_storage_module_declarations.$list6);
                return (SubLObject)hl_storage_module_declarations.NIL;
            }
            assert hl_storage_module_declarations.NIL != deductions_high.deduction_spec_p(argument_spec) : argument_spec;
            final SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
            return hl_undeduce_as_kb_deduction(cnf, mt, supports);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 7333L)
    public static SubLObject hl_unassert_as_kb_assertion(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_version = (SubLObject)ConsesLow.list(cnf, (SubLObject)hl_storage_module_declarations.NIL);
        thread.resetMultipleValues();
        final SubLObject cnf_$3 = fi.fi_canonicalize(canon_version, (SubLObject)hl_storage_module_declarations.T, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject existing_assertion = kb_indexing.find_assertion(cnf_$3, mt);
        if (hl_storage_module_declarations.NIL == existing_assertion) {
            final SubLObject formula = clauses.cnf_formula(cnf_$3, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
            fi.signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)hl_storage_module_declarations.$kw17$ASSERTION_NOT_PRESENT, (SubLObject)hl_storage_module_declarations.$str18$Formula__S_in_mt__S_is_not_in_the, formula, mt));
        }
        else {
            thread.resetMultipleValues();
            final SubLObject asserted_argument = assertions_high.get_asserted_argument_and_more(existing_assertion);
            final SubLObject last_asserted_argumentP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (hl_storage_module_declarations.NIL == asserted_argument) {
                final SubLObject formula2 = clauses.cnf_formula(cnf_$3, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
                fi.signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)hl_storage_module_declarations.$kw19$ASSERTION_NOT_LOCAL, (SubLObject)hl_storage_module_declarations.$str20$Formula__S_in_mt__S_is_not_locall, formula2, mt));
            }
            else {
                hl_transcript_tracing.note_hlt_unassert(existing_assertion);
                tms.tms_remove_argument(asserted_argument, existing_assertion, last_asserted_argumentP);
            }
        }
        return (SubLObject)hl_storage_module_declarations.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 8318L)
    public static SubLObject hl_undeduce_as_kb_deduction(final SubLObject cnf, final SubLObject mt, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_version = (SubLObject)ConsesLow.list(cnf, (SubLObject)hl_storage_module_declarations.NIL);
        thread.resetMultipleValues();
        final SubLObject cnf_$4 = fi.fi_canonicalize(canon_version, (SubLObject)hl_storage_module_declarations.T, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject existing_assertion = kb_indexing.find_assertion(cnf_$4, mt);
        if (hl_storage_module_declarations.NIL == existing_assertion) {
            final SubLObject formula = clauses.cnf_formula(cnf_$4, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
            fi.signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)hl_storage_module_declarations.$kw17$ASSERTION_NOT_PRESENT, (SubLObject)hl_storage_module_declarations.$str18$Formula__S_in_mt__S_is_not_in_the, formula, mt));
        }
        else {
            final SubLObject support_truth = enumeration_types.tv_truth(hl_tv);
            final SubLObject deduction_present = tms.tms_remove_deduction_for_assertion(existing_assertion, supports, support_truth);
            if (hl_storage_module_declarations.NIL == deduction_present) {
                final SubLObject formula2 = clauses.cnf_formula(cnf_$4, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
                fi.signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)hl_storage_module_declarations.$kw21$ARGUMENT_NOT_PRESENT, (SubLObject)hl_storage_module_declarations.$str22$Argument__S___for__S_in_mt__S_is_, supports, formula2, mt));
            }
        }
        return (SubLObject)hl_storage_module_declarations.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 9217L)
    public static SubLObject hl_remove_all_as_kb_assertion(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_storage_module_declarations.NIL != clauses.cnf_p(cnf) : cnf;
        assert hl_storage_module_declarations.NIL != hlmt.hlmt_p(mt) : mt;
        final SubLObject canon_version = (SubLObject)ConsesLow.list(cnf, (SubLObject)hl_storage_module_declarations.NIL);
        thread.resetMultipleValues();
        final SubLObject cnf_$5 = fi.fi_canonicalize(canon_version, (SubLObject)hl_storage_module_declarations.T, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject existing_assertion = kb_indexing.find_assertion(cnf_$5, mt);
        if (hl_storage_module_declarations.NIL == existing_assertion) {
            final SubLObject formula = clauses.cnf_formula(cnf_$5, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
            fi.signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)hl_storage_module_declarations.$kw17$ASSERTION_NOT_PRESENT, (SubLObject)hl_storage_module_declarations.$str18$Formula__S_in_mt__S_is_not_in_the, formula, mt));
        }
        else {
            hl_transcript_tracing.note_hlt_remove_assertion(existing_assertion);
            tms.tms_remove_assertion(existing_assertion);
        }
        return (SubLObject)hl_storage_module_declarations.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 10448L)
    public static SubLObject ist_assertion_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (hl_storage_module_declarations.NIL != clauses.atomic_clause_p(cnf)) {
            final SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
            if (hl_storage_module_declarations.NIL != el_utilities.el_formula_with_operator_p(asent, hl_storage_module_declarations.$const27$ist)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings((SubLObject)hl_storage_module_declarations.$list28, asent);
            }
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 10819L)
    public static SubLObject ist_assertion_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 10979L)
    public static SubLObject hl_add_as_ist_assertion(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        SubLObject result = (SubLObject)hl_storage_module_declarations.NIL;
        final SubLObject negatedP = clause_utilities.neg_atomic_cnf_p(cnf);
        final SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
        final SubLObject sub_mt = el_utilities.designated_mt(asent);
        final SubLObject subsentence = (hl_storage_module_declarations.NIL != negatedP) ? cycl_utilities.negate(el_utilities.designated_sentence(asent)) : el_utilities.designated_sentence(asent);
        SubLObject cdolist_list_var;
        final SubLObject canon_versions = cdolist_list_var = czer_main.canonicalize_wf_assert_sentence(subsentence, sub_mt);
        SubLObject canon_version = (SubLObject)hl_storage_module_declarations.NIL;
        canon_version = cdolist_list_var.first();
        while (hl_storage_module_declarations.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_version;
            SubLObject sub_cnf = (SubLObject)hl_storage_module_declarations.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_module_declarations.$list29);
            sub_cnf = current.first();
            current = current.rest();
            final SubLObject sub_variable_map = (SubLObject)(current.isCons() ? current.first() : hl_storage_module_declarations.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_module_declarations.$list29);
            current = current.rest();
            final SubLObject query_free_vars = (SubLObject)(current.isCons() ? current.first() : hl_storage_module_declarations.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_module_declarations.$list29);
            current = current.rest();
            if (hl_storage_module_declarations.NIL == current) {
                result = hl_storage_modules.hl_add_argument(argument_spec, sub_cnf, sub_mt, direction, sub_variable_map);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_storage_module_declarations.$list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_version = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 11850L)
    public static SubLObject hl_remove_as_ist_assertion(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        SubLObject result = (SubLObject)hl_storage_module_declarations.NIL;
        final SubLObject negatedP = clause_utilities.neg_atomic_cnf_p(cnf);
        final SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
        final SubLObject sub_mt = el_utilities.designated_mt(asent);
        final SubLObject subsentence = (hl_storage_module_declarations.NIL != negatedP) ? cycl_utilities.negate(el_utilities.designated_sentence(asent)) : el_utilities.designated_sentence(asent);
        SubLObject cdolist_list_var;
        final SubLObject canon_versions = cdolist_list_var = czer_main.canonicalize_unassert_sentence(subsentence, sub_mt);
        SubLObject canon_version = (SubLObject)hl_storage_module_declarations.NIL;
        canon_version = cdolist_list_var.first();
        while (hl_storage_module_declarations.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_version;
            SubLObject sub_cnf = (SubLObject)hl_storage_module_declarations.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_module_declarations.$list29);
            sub_cnf = current.first();
            current = current.rest();
            final SubLObject sub_variable_map = (SubLObject)(current.isCons() ? current.first() : hl_storage_module_declarations.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_module_declarations.$list29);
            current = current.rest();
            final SubLObject query_free_vars = (SubLObject)(current.isCons() ? current.first() : hl_storage_module_declarations.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_module_declarations.$list29);
            current = current.rest();
            if (hl_storage_module_declarations.NIL == current) {
                result = hl_storage_modules.hl_remove_argument(argument_spec, sub_cnf, sub_mt);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_storage_module_declarations.$list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_version = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 12683L)
    public static SubLObject hl_remove_all_as_ist_assertion(final SubLObject cnf, final SubLObject mt) {
        SubLObject result = (SubLObject)hl_storage_module_declarations.NIL;
        final SubLObject negatedP = clause_utilities.neg_atomic_cnf_p(cnf);
        final SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
        final SubLObject sub_mt = el_utilities.designated_mt(asent);
        final SubLObject subsentence = (hl_storage_module_declarations.NIL != negatedP) ? cycl_utilities.negate(el_utilities.designated_sentence(asent)) : el_utilities.designated_sentence(asent);
        SubLObject cdolist_list_var;
        final SubLObject canon_versions = cdolist_list_var = czer_main.canonicalize_assert(subsentence, sub_mt);
        SubLObject canon_version = (SubLObject)hl_storage_module_declarations.NIL;
        canon_version = cdolist_list_var.first();
        while (hl_storage_module_declarations.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_version;
            SubLObject sub_cnf = (SubLObject)hl_storage_module_declarations.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_module_declarations.$list29);
            sub_cnf = current.first();
            current = current.rest();
            final SubLObject sub_variable_map = (SubLObject)(current.isCons() ? current.first() : hl_storage_module_declarations.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_module_declarations.$list29);
            current = current.rest();
            final SubLObject query_free_vars = (SubLObject)(current.isCons() ? current.first() : hl_storage_module_declarations.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_module_declarations.$list29);
            current = current.rest();
            if (hl_storage_module_declarations.NIL == current) {
                result = hl_storage_modules.hl_remove_all_arguments(sub_cnf, sub_mt);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_storage_module_declarations.$list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_version = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 14101L)
    public static SubLObject constant_name_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (hl_storage_module_declarations.NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (hl_storage_module_declarations.NIL != el_utilities.el_formula_with_operator_p(asent, hl_storage_module_declarations.$const32$constantName)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings((SubLObject)hl_storage_module_declarations.$list33, asent);
            }
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 14642L)
    public static SubLObject constant_name_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 14953L)
    public static SubLObject constant_name_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        final SubLObject new_name = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        final SubLObject current_name = constants_high.constant_name(constant);
        if (hl_storage_module_declarations.NIL != constant_handles.constant_p(constant) && hl_storage_module_declarations.NIL != constant_completion_high.valid_constant_name_p(new_name) && !new_name.equal(current_name)) {
            return cyc_kernel.cyc_rename(constant, new_name);
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 15522L)
    public static SubLObject constant_name_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        final SubLObject expected_name = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        final SubLObject current_name = constants_high.constant_name(constant);
        if (hl_storage_module_declarations.NIL != constant_handles.constant_p(constant) && hl_storage_module_declarations.NIL != constant_completion_high.valid_constant_name_p(expected_name) && expected_name.equal(current_name)) {
            return (SubLObject)hl_storage_module_declarations.NIL;
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 16124L)
    public static SubLObject constant_name_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return constant_name_hl_storage_unassert((SubLObject)hl_storage_module_declarations.NIL, cnf, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 16932L)
    public static SubLObject assertion_direction_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (hl_storage_module_declarations.NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (hl_storage_module_declarations.NIL != el_utilities.el_formula_with_operator_p(asent, hl_storage_module_declarations.$const36$assertionDirection)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings((SubLObject)hl_storage_module_declarations.$list37, asent);
            }
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 17515L)
    public static SubLObject assertion_direction_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 17834L)
    public static SubLObject assertion_direction_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject assertion = cycl_utilities.sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        final SubLObject new_dir = removal_modules_assertion_mt.cycl_direction_to_direction(cycl_utilities.sentence_arg2(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED));
        final SubLObject orig_dir = assertions_high.assertion_direction(assertion);
        if (!new_dir.eql(orig_dir)) {
            tms.tms_change_direction(assertion, new_dir);
        }
        return (SubLObject)hl_storage_module_declarations.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 18372L)
    public static SubLObject assertion_direction_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return (SubLObject)hl_storage_module_declarations.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 18727L)
    public static SubLObject assertion_direction_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return assertion_direction_hl_storage_unassert((SubLObject)hl_storage_module_declarations.NIL, cnf, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 19540L)
    public static SubLObject indexical_the_user_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (hl_storage_module_declarations.NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (hl_storage_module_declarations.NIL != el_utilities.el_formula_with_operator_p(asent, hl_storage_module_declarations.$const40$indexicalReferent)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings((SubLObject)hl_storage_module_declarations.$list41, asent);
            }
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 20116L)
    public static SubLObject indexical_the_user_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 20447L)
    public static SubLObject indexical_the_user_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject cyclist = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        if (hl_storage_module_declarations.NIL != forts.fort_p(cyclist) && hl_storage_module_declarations.NIL != kb_accessors.cyclistP(cyclist) && !hl_storage_module_declarations.$const42$TheUser.eql(cyclist)) {
            operation_communication.set_the_cyclist(cyclist);
            return Equality.equal(cyclist, operation_communication.the_cyclist());
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 20979L)
    public static SubLObject indexical_the_user_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject cyclist = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        if (hl_storage_module_declarations.NIL != forts.fort_p(cyclist) && hl_storage_module_declarations.NIL != kb_accessors.cyclistP(cyclist) && cyclist.equal(operation_communication.the_cyclist())) {
            operation_communication.set_the_cyclist(system_parameters.$default_cyclist_name$.getDynamicValue(thread));
            return (SubLObject)SubLObjectFactory.makeBoolean(!cyclist.equal(operation_communication.the_cyclist()));
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 21509L)
    public static SubLObject indexical_the_user_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return indexical_the_user_hl_storage_unassert((SubLObject)hl_storage_module_declarations.NIL, cnf, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 22459L)
    public static SubLObject perform_subl_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (hl_storage_module_declarations.NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (hl_storage_module_declarations.NIL != el_utilities.el_formula_with_operator_p(asent, hl_storage_module_declarations.$const43$performSubL)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings((SubLObject)hl_storage_module_declarations.$list46, asent);
            }
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 23042L)
    public static SubLObject perform_subl_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)hl_storage_module_declarations.$list47;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 23372L)
    public static SubLObject perform_subl_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject subl = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        return removal_modules_perform_subl.inference_perform_subl(subl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 23732L)
    public static SubLObject perform_subl_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return (SubLObject)hl_storage_module_declarations.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 23951L)
    public static SubLObject perform_subl_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return perform_subl_hl_storage_unassert((SubLObject)hl_storage_module_declarations.NIL, cnf, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 25163L)
    public static SubLObject repropagate_assertion_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (hl_storage_module_declarations.NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (hl_storage_module_declarations.NIL != el_utilities.el_formula_with_operator_p(asent, hl_storage_module_declarations.$const48$repropagateAssertion)) {
                return assertion_handles.assertion_p(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED));
            }
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 25625L)
    public static SubLObject repropagate_assertion_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)hl_storage_module_declarations.$list47;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 25973L)
    public static SubLObject repropagate_assertion_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        if (hl_storage_module_declarations.NIL != assertions_high.forward_assertionP(arg1)) {
            forward.queue_or_repropagate_forward_assertion(arg1);
            return (SubLObject)hl_storage_module_declarations.T;
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 26420L)
    public static SubLObject repropagate_assertion_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return (SubLObject)hl_storage_module_declarations.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 26596L)
    public static SubLObject repropagate_assertion_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        repropagate_assertion_hl_storage_unassert((SubLObject)hl_storage_module_declarations.NIL, cnf, mt);
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 27730L)
    public static SubLObject reconsider_assertion_deductions_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (hl_storage_module_declarations.NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (hl_storage_module_declarations.NIL != el_utilities.el_formula_with_operator_p(asent, hl_storage_module_declarations.$const51$reconsiderAssertionDeductions)) {
                return assertion_handles.assertion_p(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED));
            }
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 28220L)
    public static SubLObject reconsider_assertion_deductions_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)hl_storage_module_declarations.$list47;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 28587L)
    public static SubLObject reconsider_assertion_deductions_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        tms.tms_reconsider_assertion_deductions(arg1);
        return (SubLObject)hl_storage_module_declarations.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 29026L)
    public static SubLObject reconsider_assertion_deductions_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return (SubLObject)hl_storage_module_declarations.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 29212L)
    public static SubLObject reconsider_assertion_deductions_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return reconsider_assertion_deductions_hl_storage_unassert((SubLObject)hl_storage_module_declarations.NIL, cnf, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 30086L)
    public static SubLObject sks_registered_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (hl_storage_module_declarations.NIL != clauses.atomic_clause_p(cnf)) {
            final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
            if (hl_storage_module_declarations.NIL != el_utilities.el_formula_with_operator_p(asent, hl_storage_module_declarations.$const54$sksRegistered)) {
                return formula_pattern_match.pattern_matches_formula_without_bindings((SubLObject)hl_storage_module_declarations.$list57, asent);
            }
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 30566L)
    public static SubLObject sks_registered_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)hl_storage_module_declarations.$list47;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 30896L)
    public static SubLObject sks_registered_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        if (hl_storage_module_declarations.NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            return sks_registered_hl_storage_assert_int(source);
        }
        return sks_registered_hl_storage_unassert_int(source);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 31369L)
    public static SubLObject sks_registered_hl_storage_assert_int(SubLObject source) {
        sksi_sks_manager.register_sksi_removal_modules_for_skses((SubLObject)ConsesLow.list(source));
        return sksi_infrastructure_utilities.external_source_activated_in_imageP(source);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 31546L)
    public static SubLObject sks_registered_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        return sks_registered_hl_storage_unassert_int(source);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 31895L)
    public static SubLObject sks_registered_hl_storage_unassert_int(SubLObject source) {
        sksi_sks_manager.deregister_sksi_removal_modules_for_skses((SubLObject)ConsesLow.list(source));
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_storage_module_declarations.NIL == sksi_infrastructure_utilities.external_source_activated_in_imageP(source));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 32081L)
    public static SubLObject sks_registered_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return sks_registered_hl_storage_unassert((SubLObject)hl_storage_module_declarations.NIL, cnf, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 37597L)
    public static SubLObject assert_hl_storage_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (hl_storage_module_declarations.NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (hl_storage_module_declarations.NIL != el_utilities.el_formula_with_operator_p(asent, hl_storage_module_declarations.$const63$assert)) {
                return variables.fully_bound_p(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED));
            }
        }
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 38018L)
    public static SubLObject assert_hl_storage_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)hl_storage_module_declarations.$list47;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 38337L)
    public static SubLObject assert_hl_storage_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        SubLObject results = (SubLObject)hl_storage_module_declarations.NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions = czer_main.canonicalize_assert_sentence(arg1, mt);
        final SubLObject canon_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = canon_versions;
        SubLObject canon_version = (SubLObject)hl_storage_module_declarations.NIL;
        canon_version = cdolist_list_var.first();
        while (hl_storage_module_declarations.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = canon_version;
            SubLObject cnf_$6 = (SubLObject)hl_storage_module_declarations.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_module_declarations.$list66);
            cnf_$6 = current.first();
            current = current.rest();
            final SubLObject variable_map_$7 = (SubLObject)(current.isCons() ? current.first() : hl_storage_module_declarations.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_module_declarations.$list66);
            current = current.rest();
            final SubLObject query_free_vars = (SubLObject)(current.isCons() ? current.first() : hl_storage_module_declarations.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_module_declarations.$list66);
            current = current.rest();
            if (hl_storage_module_declarations.NIL == current) {
                if (hl_storage_module_declarations.NIL == direction) {
                    final SubLObject version_direction = fi.fi_cnf_default_direction(cnf_$6);
                }
                results = (SubLObject)ConsesLow.cons(hl_add_as_kb_assertion(argument_spec, cnf_$6, canon_mt, direction, variable_map_$7), results);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_storage_module_declarations.$list66);
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_version = cdolist_list_var.first();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_storage_module_declarations.NIL != results && hl_storage_module_declarations.NIL != list_utilities.every_in_list((SubLObject)hl_storage_module_declarations.$sym67$BOOLEAN, results, (SubLObject)hl_storage_module_declarations.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 39225L)
    public static SubLObject assert_hl_storage_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return (SubLObject)hl_storage_module_declarations.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 39388L)
    public static SubLObject assert_hl_storage_unassert_all(final SubLObject cnf, final SubLObject mt) {
        return assert_hl_storage_unassert((SubLObject)hl_storage_module_declarations.NIL, cnf, mt);
    }
    
    public static SubLObject declare_hl_storage_module_declarations_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "regular_kb_assertion_applicableP", "REGULAR-KB-ASSERTION-APPLICABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "regular_kb_assertion_incompleteness", "REGULAR-KB-ASSERTION-INCOMPLETENESS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "hl_add_as_kb_assertion", "HL-ADD-AS-KB-ASSERTION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "hl_assert_as_kb_assertion", "HL-ASSERT-AS-KB-ASSERTION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "hl_deduce_as_kb_deduction", "HL-DEDUCE-AS-KB-DEDUCTION", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "hl_remove_as_kb_assertion", "HL-REMOVE-AS-KB-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "hl_unassert_as_kb_assertion", "HL-UNASSERT-AS-KB-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "hl_undeduce_as_kb_deduction", "HL-UNDEDUCE-AS-KB-DEDUCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "hl_remove_all_as_kb_assertion", "HL-REMOVE-ALL-AS-KB-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "ist_assertion_applicableP", "IST-ASSERTION-APPLICABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "ist_assertion_incompleteness", "IST-ASSERTION-INCOMPLETENESS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "hl_add_as_ist_assertion", "HL-ADD-AS-IST-ASSERTION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "hl_remove_as_ist_assertion", "HL-REMOVE-AS-IST-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "hl_remove_all_as_ist_assertion", "HL-REMOVE-ALL-AS-IST-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "constant_name_hl_storage_applicableP", "CONSTANT-NAME-HL-STORAGE-APPLICABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "constant_name_hl_storage_incompleteness", "CONSTANT-NAME-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "constant_name_hl_storage_assert", "CONSTANT-NAME-HL-STORAGE-ASSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "constant_name_hl_storage_unassert", "CONSTANT-NAME-HL-STORAGE-UNASSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "constant_name_hl_storage_unassert_all", "CONSTANT-NAME-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "assertion_direction_hl_storage_applicableP", "ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "assertion_direction_hl_storage_incompleteness", "ASSERTION-DIRECTION-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "assertion_direction_hl_storage_assert", "ASSERTION-DIRECTION-HL-STORAGE-ASSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "assertion_direction_hl_storage_unassert", "ASSERTION-DIRECTION-HL-STORAGE-UNASSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "assertion_direction_hl_storage_unassert_all", "ASSERTION-DIRECTION-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "indexical_the_user_hl_storage_applicableP", "INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "indexical_the_user_hl_storage_incompleteness", "INDEXICAL-THE-USER-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "indexical_the_user_hl_storage_assert", "INDEXICAL-THE-USER-HL-STORAGE-ASSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "indexical_the_user_hl_storage_unassert", "INDEXICAL-THE-USER-HL-STORAGE-UNASSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "indexical_the_user_hl_storage_unassert_all", "INDEXICAL-THE-USER-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "perform_subl_hl_storage_applicableP", "PERFORM-SUBL-HL-STORAGE-APPLICABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "perform_subl_hl_storage_incompleteness", "PERFORM-SUBL-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "perform_subl_hl_storage_assert", "PERFORM-SUBL-HL-STORAGE-ASSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "perform_subl_hl_storage_unassert", "PERFORM-SUBL-HL-STORAGE-UNASSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "perform_subl_hl_storage_unassert_all", "PERFORM-SUBL-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "repropagate_assertion_hl_storage_applicableP", "REPROPAGATE-ASSERTION-HL-STORAGE-APPLICABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "repropagate_assertion_hl_storage_incompleteness", "REPROPAGATE-ASSERTION-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "repropagate_assertion_hl_storage_assert", "REPROPAGATE-ASSERTION-HL-STORAGE-ASSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "repropagate_assertion_hl_storage_unassert", "REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "repropagate_assertion_hl_storage_unassert_all", "REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "reconsider_assertion_deductions_hl_storage_applicableP", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-APPLICABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "reconsider_assertion_deductions_hl_storage_incompleteness", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "reconsider_assertion_deductions_hl_storage_assert", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-ASSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "reconsider_assertion_deductions_hl_storage_unassert", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "reconsider_assertion_deductions_hl_storage_unassert_all", "RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "sks_registered_hl_storage_applicableP", "SKS-REGISTERED-HL-STORAGE-APPLICABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "sks_registered_hl_storage_incompleteness", "SKS-REGISTERED-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "sks_registered_hl_storage_assert", "SKS-REGISTERED-HL-STORAGE-ASSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "sks_registered_hl_storage_assert_int", "SKS-REGISTERED-HL-STORAGE-ASSERT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "sks_registered_hl_storage_unassert", "SKS-REGISTERED-HL-STORAGE-UNASSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "sks_registered_hl_storage_unassert_int", "SKS-REGISTERED-HL-STORAGE-UNASSERT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "sks_registered_hl_storage_unassert_all", "SKS-REGISTERED-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "assert_hl_storage_applicableP", "ASSERT-HL-STORAGE-APPLICABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "assert_hl_storage_incompleteness", "ASSERT-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "assert_hl_storage_assert", "ASSERT-HL-STORAGE-ASSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "assert_hl_storage_unassert", "ASSERT-HL-STORAGE-UNASSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_module_declarations", "assert_hl_storage_unassert_all", "ASSERT-HL-STORAGE-UNASSERT-ALL", 2, 0, false);
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    public static SubLObject init_hl_storage_module_declarations_file() {
        return (SubLObject)hl_storage_module_declarations.NIL;
    }
    
    public static SubLObject setup_hl_storage_module_declarations_file() {
        hl_storage_modules.hl_storage_module((SubLObject)hl_storage_module_declarations.$kw0$REGULAR_KB_ASSERTION, (SubLObject)hl_storage_module_declarations.$list1);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_storage_module_declarations.$sym7$HL_ADD_AS_KB_ASSERTION);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_storage_module_declarations.$sym16$HL_REMOVE_AS_KB_ASSERTION);
        hl_storage_modules.hl_storage_module((SubLObject)hl_storage_module_declarations.$kw25$IST, (SubLObject)hl_storage_module_declarations.$list26);
        hl_storage_modules.hl_storage_module((SubLObject)hl_storage_module_declarations.$kw30$CONSTANT_NAME, (SubLObject)hl_storage_module_declarations.$list31);
        hl_storage_modules.hl_storage_module((SubLObject)hl_storage_module_declarations.$kw34$ASSERTION_DIRECTION, (SubLObject)hl_storage_module_declarations.$list35);
        hl_storage_modules.hl_storage_module((SubLObject)hl_storage_module_declarations.$kw38$INDEXICAL_THE_USER, (SubLObject)hl_storage_module_declarations.$list39);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate(hl_storage_module_declarations.$const43$performSubL);
        hl_storage_modules.hl_storage_module((SubLObject)hl_storage_module_declarations.$kw44$PERFORM_SUBL, (SubLObject)hl_storage_module_declarations.$list45);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate(hl_storage_module_declarations.$const48$repropagateAssertion);
        hl_storage_modules.hl_storage_module((SubLObject)hl_storage_module_declarations.$kw49$REPROPAGATE_ASSERTION, (SubLObject)hl_storage_module_declarations.$list50);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate(hl_storage_module_declarations.$const51$reconsiderAssertionDeductions);
        hl_storage_modules.hl_storage_module((SubLObject)hl_storage_module_declarations.$kw52$RECONSIDER_ASSERTION_DEDUCTIONS, (SubLObject)hl_storage_module_declarations.$list53);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate(hl_storage_module_declarations.$const54$sksRegistered);
        hl_storage_modules.hl_storage_module((SubLObject)hl_storage_module_declarations.$kw55$SKS_REGISTERED, (SubLObject)hl_storage_module_declarations.$list56);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_storage_module_declarations.$sym58$SKS_REGISTERED_HL_STORAGE_APPLICABLE_);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_storage_module_declarations.$sym59$SKS_REGISTERED_HL_STORAGE_INCOMPLETENESS);
        sunit_external.define_test_category((SubLObject)hl_storage_module_declarations.$str60$HL_Storage_Module_Category, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        sunit_external.define_test_category((SubLObject)hl_storage_module_declarations.$str61$Regular_KB_Assertion_Module_Categ, (SubLObject)ConsesLow.list((SubLObject)hl_storage_module_declarations.$str60$HL_Storage_Module_Category));
        sunit_external.define_test_suite((SubLObject)hl_storage_module_declarations.$str62$HL_Storage_Module_Test_Suite, (SubLObject)ConsesLow.list((SubLObject)hl_storage_module_declarations.$str60$HL_Storage_Module_Category), (SubLObject)hl_storage_module_declarations.UNPROVIDED, (SubLObject)hl_storage_module_declarations.UNPROVIDED);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate(hl_storage_module_declarations.$const63$assert);
        hl_storage_modules.hl_storage_module((SubLObject)hl_storage_module_declarations.$kw64$ASSERT, (SubLObject)hl_storage_module_declarations.$list65);
        return (SubLObject)hl_storage_module_declarations.NIL;
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
    
    static {
        me = (SubLFile)new hl_storage_module_declarations();
        $kw0$REGULAR_KB_ASSERTION = SubLObjectFactory.makeKeyword("REGULAR-KB-ASSERTION");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Regular KB Assertion"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("REGULAR-KB-ASSERTION-APPLICABLE?"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("REGULAR-KB-ASSERTION-INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("HL-ADD-AS-KB-ASSERTION"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("HL-REMOVE-AS-KB-ASSERTION"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("HL-REMOVE-ALL-AS-KB-ASSERTION") });
        $kw2$ASSERTED_ARGUMENT = SubLObjectFactory.makeKeyword("ASSERTED-ARGUMENT");
        $sym3$ASSERTED_ARGUMENT_SPEC_P = SubLObjectFactory.makeSymbol("ASSERTED-ARGUMENT-SPEC-P");
        $kw4$DEDUCTION = SubLObjectFactory.makeKeyword("DEDUCTION");
        $sym5$DEDUCTION_SPEC_P = SubLObjectFactory.makeSymbol("DEDUCTION-SPEC-P");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENERIC-ERROR"), (SubLObject)SubLObjectFactory.makeString("Unknown argument type ~S"));
        $sym7$HL_ADD_AS_KB_ASSERTION = SubLObjectFactory.makeSymbol("HL-ADD-AS-KB-ASSERTION");
        $sym8$VARIABLE_NAME = SubLObjectFactory.makeSymbol("VARIABLE-NAME");
        $kw9$UNCHANGED = SubLObjectFactory.makeKeyword("UNCHANGED");
        $kw10$FLIPPED = SubLObjectFactory.makeKeyword("FLIPPED");
        $kw11$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw12$ARGUMENT_ALREADY_PRESENT = SubLObjectFactory.makeKeyword("ARGUMENT-ALREADY-PRESENT");
        $str13$Argument_for__S_in__S_is_already_ = SubLObjectFactory.makeString("Argument for ~S in ~S is already present");
        $kw14$GENERIC_ERROR = SubLObjectFactory.makeKeyword("GENERIC-ERROR");
        $str15$Unable_to_add_argument_for__S_in_ = SubLObjectFactory.makeString("Unable to add argument for ~S in ~S");
        $sym16$HL_REMOVE_AS_KB_ASSERTION = SubLObjectFactory.makeSymbol("HL-REMOVE-AS-KB-ASSERTION");
        $kw17$ASSERTION_NOT_PRESENT = SubLObjectFactory.makeKeyword("ASSERTION-NOT-PRESENT");
        $str18$Formula__S_in_mt__S_is_not_in_the = SubLObjectFactory.makeString("Formula ~S in mt ~S is not in the KB");
        $kw19$ASSERTION_NOT_LOCAL = SubLObjectFactory.makeKeyword("ASSERTION-NOT-LOCAL");
        $str20$Formula__S_in_mt__S_is_not_locall = SubLObjectFactory.makeString("Formula ~S in mt ~S is not locally in the KB");
        $kw21$ARGUMENT_NOT_PRESENT = SubLObjectFactory.makeKeyword("ARGUMENT-NOT-PRESENT");
        $str22$Argument__S___for__S_in_mt__S_is_ = SubLObjectFactory.makeString("Argument ~S ~%for ~S in mt ~S is not already present");
        $sym23$CNF_P = SubLObjectFactory.makeSymbol("CNF-P");
        $sym24$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $kw25$IST = SubLObjectFactory.makeKeyword("IST");
        $list26 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("ist"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("IST-ASSERTION-APPLICABLE?"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("IST-ASSERTION-INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("HL-ADD-AS-IST-ASSERTION"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("HL-REMOVE-AS-IST-ASSERTION"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("HL-REMOVE-ALL-AS-IST-ASSERTION") });
        $const27$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $list28 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-CNF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-VARIABLE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-FREE-VARS"));
        $kw30$CONSTANT_NAME = SubLObjectFactory.makeKeyword("CONSTANT-NAME");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("constantName"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("CONSTANT-NAME-HL-STORAGE-APPLICABLE?"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("CONSTANT-NAME-HL-STORAGE-INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("CONSTANT-NAME-HL-STORAGE-ASSERT"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("CONSTANT-NAME-HL-STORAGE-UNASSERT"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("CONSTANT-NAME-HL-STORAGE-UNASSERT-ALL") });
        $const32$constantName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName"));
        $list33 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"));
        $kw34$ASSERTION_DIRECTION = SubLObjectFactory.makeKeyword("ASSERTION-DIRECTION");
        $list35 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("assertionDirection"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-ASSERT"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-UNASSERT"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-UNASSERT-ALL") });
        $const36$assertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection"));
        $list37 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION-P")));
        $kw38$INDEXICAL_THE_USER = SubLObjectFactory.makeKeyword("INDEXICAL-THE-USER");
        $list39 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("indexicalReferent TheUser"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-ASSERT"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-UNASSERT"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-UNASSERT-ALL") });
        $const40$indexicalReferent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent"));
        $list41 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheUser")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"));
        $const42$TheUser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheUser"));
        $const43$performSubL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL"));
        $kw44$PERFORM_SUBL = SubLObjectFactory.makeKeyword("PERFORM-SUBL");
        $list45 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("performSubL"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("PERFORM-SUBL-HL-STORAGE-APPLICABLE?"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("PERFORM-SUBL-HL-STORAGE-INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("PERFORM-SUBL-HL-STORAGE-ASSERT"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("PERFORM-SUBL-HL-STORAGE-UNASSERT"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("PERFORM-SUBL-HL-STORAGE-UNASSERT-ALL") });
        $list46 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"))), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))));
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"));
        $const48$repropagateAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("repropagateAssertion"));
        $kw49$REPROPAGATE_ASSERTION = SubLObjectFactory.makeKeyword("REPROPAGATE-ASSERTION");
        $list50 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("repropagateAssertion"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("repropagateAssertion")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-APPLICABLE?"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-ASSERT"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("REPROPAGATE-ASSERTION-HL-STORAGE-UNASSERT-ALL") });
        $const51$reconsiderAssertionDeductions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reconsiderAssertionDeductions"));
        $kw52$RECONSIDER_ASSERTION_DEDUCTIONS = SubLObjectFactory.makeKeyword("RECONSIDER-ASSERTION-DEDUCTIONS");
        $list53 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("reconsiderAssertionDeductions"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reconsiderAssertionDeductions")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-APPLICABLE?"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-ASSERT"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("RECONSIDER-ASSERTION-DEDUCTIONS-HL-STORAGE-UNASSERT-ALL") });
        $const54$sksRegistered = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered"));
        $kw55$SKS_REGISTERED = SubLObjectFactory.makeKeyword("SKS-REGISTERED");
        $list56 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("sksRegistered"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("SKS-REGISTERED-HL-STORAGE-APPLICABLE?"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("SKS-REGISTERED-HL-STORAGE-INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("SKS-REGISTERED-HL-STORAGE-ASSERT"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("SKS-REGISTERED-HL-STORAGE-UNASSERT"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("SKS-REGISTERED-HL-STORAGE-UNASSERT-ALL") });
        $list57 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"));
        $sym58$SKS_REGISTERED_HL_STORAGE_APPLICABLE_ = SubLObjectFactory.makeSymbol("SKS-REGISTERED-HL-STORAGE-APPLICABLE?");
        $sym59$SKS_REGISTERED_HL_STORAGE_INCOMPLETENESS = SubLObjectFactory.makeSymbol("SKS-REGISTERED-HL-STORAGE-INCOMPLETENESS");
        $str60$HL_Storage_Module_Category = SubLObjectFactory.makeString("HL Storage Module Category");
        $str61$Regular_KB_Assertion_Module_Categ = SubLObjectFactory.makeString("Regular KB Assertion Module Category");
        $str62$HL_Storage_Module_Test_Suite = SubLObjectFactory.makeString("HL Storage Module Test Suite");
        $const63$assert = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assert"));
        $kw64$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $list65 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("assert"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assert")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("ASSERT-HL-STORAGE-APPLICABLE?"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("ASSERT-HL-STORAGE-INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("ASSERT-HL-STORAGE-ASSERT"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("ASSERT-HL-STORAGE-UNASSERT"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("ASSERT-HL-STORAGE-UNASSERT-ALL") });
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-FREE-VARS"));
        $sym67$BOOLEAN = SubLObjectFactory.makeSymbol("BOOLEAN");
    }
}

/*

	Total time: 308 ms
	
*/