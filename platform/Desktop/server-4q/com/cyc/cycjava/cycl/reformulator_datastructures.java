package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_datastructures extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_datastructures";
    public static final String myFingerPrint = "978520eb13c7aa9f31b5c5c9a6af61d706b2306d6e7a8417fd07cdc4953d6760";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 3436L)
    private static SubLSymbol $reformulator_initialization_success_ratio$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 4180L)
    private static SubLSymbol $reformulator_core_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 7564L)
    private static SubLSymbol $default_reformulator_mode_precedence$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8007L)
    private static SubLSymbol $default_reformulation_directions_in_modes_for_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8227L)
    private static SubLSymbol $default_reformulation_recursion_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8427L)
    private static SubLSymbol $reformulator_irrelevant_forts$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8551L)
    private static SubLSymbol $reformulator_relevant_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8712L)
    private static SubLSymbol $reformulator_rule_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8861L)
    private static SubLSymbol $reformulator_rule_spec_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 9033L)
    private static SubLSymbol $reformulator_print_verbosity_level$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 9199L)
    public static SubLSymbol $reformulator_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 9415L)
    public static SubLSymbol $reformulator_memoization_state$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 20439L)
    private static SubLSymbol $reformulator_setting_keywords$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24047L)
    private static SubLSymbol $all_kb_reformulator_modes_caching_state$;
    private static final SubLFloat $float0$0_9;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$VALID_CONSTANT_;
    private static final SubLString $str3$A_KB_dependent_reformulator_funct;
    private static final SubLSymbol $sym4$REFORMULATOR_RELEVANT_ASSERTION_;
    private static final SubLSymbol $sym5$_DEFAULT_REFORMULATOR_MODE_PRECEDENCE_;
    private static final SubLSymbol $sym6$_DEFAULT_REFORMULATION_DIRECTIONS_IN_MODES_FOR_PREDS_;
    private static final SubLInteger $int7$35;
    private static final SubLSymbol $sym8$_REFORMULATOR_IRRELEVANT_FORTS_;
    private static final SubLSymbol $sym9$_REFORMULATOR_RELEVANT_PREDICATES_;
    private static final SubLSymbol $sym10$_REFORMULATOR_RULE_PREDICATES_;
    private static final SubLSymbol $sym11$_REFORMULATOR_RULE_SPEC_PREDS_;
    private static final SubLString $str12$Reformulator_Initialization_Updat;
    private static final SubLSymbol $kw13$UNINITIALIZED;
    private static final SubLSymbol $sym14$WITH_REFORMULATOR_MEMOIZATION_STATE;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$MEMOIZATION_STATE;
    private static final SubLSymbol $sym19$CLET;
    private static final SubLSymbol $sym20$CHECK_TYPE;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$WITH_REFORMULATOR_MEMOIZATION_STATE_INTERNAL;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$_REFORMULATOR_MEMOIZATION_STATE_;
    private static final SubLSymbol $sym25$WITH_MEMOIZATION_STATE;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$FIND_OR_CREATE_REFORMULATOR_MEMOIZATION_STATE;
    private static final SubLSymbol $sym28$WITH_REFORMULATOR_MEMOIZATION;
    private static final SubLSymbol $kw29$REUSED;
    private static final SubLSymbol $kw30$NEW;
    private static final SubLObject $const31$reformulationPrecondition;
    private static final SubLObject $const32$reformulationDirectionInMode;
    private static final SubLObject $const33$defaultReformulationDirectionInMo;
    private static final SubLObject $const34$reformulatorRuleProperties;
    private static final SubLObject $const35$defaultReformulatorModePrecedence;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$CDOHASH;
    private static final SubLSymbol $sym38$KEY;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLString $str42$Found_an_invalid_setting___s___ig;
    private static final SubLSymbol $kw43$REFORMULATE_SUBFORMULAS_;
    private static final SubLList $list44;
    private static final SubLSymbol $kw45$RECURSION_LIMIT;
    private static final SubLSymbol $kw46$MODES;
    private static final SubLSymbol $sym47$ALL_KB_REFORMULATOR_MODES;
    private static final SubLObject $const48$ReformulatorMode;
    private static final SubLSymbol $sym49$_ALL_KB_REFORMULATOR_MODES_CACHING_STATE_;
    private static final SubLString $str50$Found_invalid_reformulation_mode_;
    private static final SubLSymbol $kw51$WFF_ENFORCEMENT;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$USE_KB_REFORMULATOR_RULES_;
    private static final SubLSymbol $kw54$REFORMULATOR_RULES;
    private static final SubLString $str55$Found_invalid_reformulator_rule__;
    private static final SubLString $str56$Expected_a_list_of_reformulator_r;
    private static final SubLSymbol $kw57$SKIP_ASSERTIONS;
    private static final SubLSymbol $kw58$SKIP_SENTENCES;
    private static final SubLString $str59$Found_invalid_reformulator_rule_a;
    private static final SubLString $str60$Found_sentence_to_skip__s_which_d;
    private static final SubLSymbol $kw61$META_PREDICATES;
    private static final SubLObject $const62$UnaryPredicate;
    private static final SubLString $str63$Found_a_reformulator_meta_predica;
    private static final SubLSymbol $kw64$PRECONDITION_CHECKING;
    private static final SubLList $list65;
    private static final SubLSymbol $kw66$SEARCH_STRATEGY;
    private static final SubLList $list67;
    private static final SubLSymbol $kw68$FOCUS;
    private static final SubLString $str69$Found_invalid_reformulation_focus;
    private static final SubLSymbol $kw70$IGNORE_RL_MODULES;
    private static final SubLString $str71$Found_invalid__ignore_rl_modules_;
    private static final SubLSymbol $kw72$APPLY_FIRST_RECURSIVELY;
    private static final SubLString $str73$Found_invalid__apply_first_recurs;
    private static final SubLSymbol $kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_;
    private static final SubLSymbol $kw75$CLEAR_CACHES_;
    private static final SubLSymbol $kw76$REFORMULATE_ATOMS_;
    private static final SubLList $list77;
    private static final SubLSymbol $kw78$MAX_TIME;
    private static final SubLSymbol $kw79$COMPUTE_DEFAULT;
    private static final SubLString $str80$Found_invalid_value__s_for_settin;
    private static final SubLSymbol $kw81$TRUE;
    private static final SubLSymbol $kw82$KB;
    private static final SubLSymbol $kw83$REMOVAL_ONLY_ASK;
    private static final SubLSymbol $kw84$NO_SEARCH;
    private static final SubLSymbol $kw85$FALSE;
    private static final SubLString $str86$Tried_to_get_an_undefined_default;
    private static final SubLSymbol $sym87$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const88$EverythingPSC;
    private static final SubLObject $const89$ReformulatorIrrelevantFORT;
    private static final SubLObject $const90$ReformulatorDirectivePredicate;
    private static final SubLObject $const91$CycLReformulationRulePredicate;
    private static final SubLObject $const92$reformulatorRule;
    private static final SubLSymbol $sym93$GENL_MT_;
    private static final SubLSymbol $sym94$SECOND;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 1910L)
    public static SubLObject ensure_reformulator_initialized() {
        if (reformulator_datastructures.NIL != reformulator_initializedP()) {
            return (SubLObject)reformulator_datastructures.ZERO_INTEGER;
        }
        return initialize_reformulator();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 2614L)
    public static SubLObject reformulator_initializedP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_datastructures.NIL != reformulator_rules_initializedP() && reformulator_datastructures.NIL != reformulator_variables_initializedP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 2823L)
    public static SubLObject reformulator_rules_initializedP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_datastructures.NIL != kb_control_vars.reformulator_kb_loaded_p() && reformulator_datastructures.NIL != reformulator_rule_unifier_datastructures.reformulator_rules());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 2947L)
    public static SubLObject reformulator_variables_initializedP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_datastructures.NIL != kb_control_vars.reformulator_kb_loaded_p() && reformulator_datastructures.NIL != reformulator_irrelevant_forts() && reformulator_datastructures.NIL != default_reformulation_directions_in_modes_for_preds() && reformulator_datastructures.NIL != reformulator_rule_predicates() && reformulator_datastructures.NIL != reformulator_rule_spec_preds());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 3835L)
    public static SubLObject reformulator_fully_initializedP() {
        if (reformulator_datastructures.NIL != reformulator_initializedP()) {
            final SubLObject expected_count = reformulator_rule_unifier_datastructures.expected_reformulator_rule_count();
            final SubLObject actual_count = reformulator_rule_count();
            final SubLObject ratio = Numbers.divide(actual_count, expected_count);
            if (ratio.numGE(reformulator_datastructures.$reformulator_initialization_success_ratio$.getGlobalValue())) {
                return (SubLObject)reformulator_datastructures.T;
            }
        }
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 4405L)
    public static SubLObject initialize_reformulator_kb_feature() {
        if (reformulator_datastructures.NIL != list_utilities.every_in_list((SubLObject)reformulator_datastructures.$sym2$VALID_CONSTANT_, reformulator_datastructures.$reformulator_core_constants$.getGlobalValue(), (SubLObject)reformulator_datastructures.UNPROVIDED)) {
            kb_control_vars.set_reformulator_kb_loaded();
        }
        else {
            kb_control_vars.unset_reformulator_kb_loaded();
        }
        return kb_control_vars.reformulator_kb_loaded_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 4740L)
    public static SubLObject initialize_reformulator() {
        if (reformulator_datastructures.NIL == kb_control_vars.reformulator_kb_loaded_p()) {
            Errors.error((SubLObject)reformulator_datastructures.$str3$A_KB_dependent_reformulator_funct);
        }
        clear_reformulator_caches();
        return sync_reformulator_to_kb();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 5218L)
    public static SubLObject reformulator_rule_count() {
        if (reformulator_datastructures.NIL != kb_control_vars.reformulator_kb_loaded_p()) {
            return Hashtables.hash_table_count(reformulator_rule_unifier_datastructures.reformulator_rules());
        }
        return (SubLObject)reformulator_datastructures.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 5563L)
    public static SubLObject unassociated_reformulator_rule_count() {
        if (reformulator_datastructures.NIL != kb_control_vars.reformulator_kb_loaded_p()) {
            return Sequences.length(reformulator_rule_unifier_datastructures.unassociated_reformulator_rules());
        }
        return (SubLObject)reformulator_datastructures.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 5729L)
    public static SubLObject assertion_in_reformulatorP(final SubLObject assertion) {
        if (reformulator_datastructures.NIL != kb_control_vars.reformulator_kb_loaded_p()) {
            return list_utilities.sublisp_boolean(find_reformulator_rule_for_rule_assertion(assertion));
        }
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 5999L)
    public static SubLObject reformulator_relevant_assertionP(final SubLObject assertion) {
        return reformulator_relevant_assertion_pred_listP(assertion, reformulator_relevant_predicates());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 6678L)
    public static SubLObject add_reformulation_assertion(final SubLObject assertion) {
        if (reformulator_datastructures.NIL != assertions_high.code_assertionP(assertion)) {
            return (SubLObject)reformulator_datastructures.NIL;
        }
        assert reformulator_datastructures.NIL != reformulator_relevant_assertionP(assertion) : assertion;
        ensure_reformulator_initialized();
        clear_reformulator_caches();
        return add_reformulation_assertion_int(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 7065L)
    public static SubLObject remove_reformulation_assertion(final SubLObject assertion) {
        assert reformulator_datastructures.NIL != reformulator_relevant_assertionP(assertion) : assertion;
        ensure_reformulator_initialized();
        clear_reformulator_caches();
        return remove_reformulation_assertion_int(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 9596L)
    public static SubLObject with_reformulator_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)reformulator_datastructures.$sym14$WITH_REFORMULATOR_MEMOIZATION_STATE, (SubLObject)reformulator_datastructures.$list15, ConsesLow.append(body, (SubLObject)reformulator_datastructures.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 9937L)
    public static SubLObject with_new_reformulator_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)reformulator_datastructures.$sym14$WITH_REFORMULATOR_MEMOIZATION_STATE, (SubLObject)reformulator_datastructures.$list16, ConsesLow.append(body, (SubLObject)reformulator_datastructures.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 10177L)
    public static SubLObject with_reformulator_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_datastructures.$list17);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject memoization_state_form = (SubLObject)reformulator_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_datastructures.$list17);
        memoization_state_form = current.first();
        current = current.rest();
        if (reformulator_datastructures.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject v_memoization_state = (SubLObject)reformulator_datastructures.$sym18$MEMOIZATION_STATE;
            return (SubLObject)ConsesLow.list((SubLObject)reformulator_datastructures.$sym19$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_memoization_state, memoization_state_form)), (SubLObject)ConsesLow.listS((SubLObject)reformulator_datastructures.$sym20$CHECK_TYPE, v_memoization_state, (SubLObject)reformulator_datastructures.$list21), (SubLObject)ConsesLow.listS((SubLObject)reformulator_datastructures.$sym22$WITH_REFORMULATOR_MEMOIZATION_STATE_INTERNAL, (SubLObject)ConsesLow.list(v_memoization_state), ConsesLow.append(body, (SubLObject)reformulator_datastructures.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)reformulator_datastructures.$list17);
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 10612L)
    public static SubLObject with_reformulator_memoization_state_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_datastructures.$list23);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_memoization_state = (SubLObject)reformulator_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_datastructures.$list23);
        v_memoization_state = current.first();
        current = current.rest();
        if (reformulator_datastructures.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)reformulator_datastructures.$sym19$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)reformulator_datastructures.$sym24$_REFORMULATOR_MEMOIZATION_STATE_, v_memoization_state)), (SubLObject)ConsesLow.listS((SubLObject)reformulator_datastructures.$sym25$WITH_MEMOIZATION_STATE, (SubLObject)reformulator_datastructures.$list26, ConsesLow.append(body, (SubLObject)reformulator_datastructures.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)reformulator_datastructures.$list23);
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 10875L)
    public static SubLObject find_or_create_reformulator_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (reformulator_datastructures.NIL != memoization_state.memoization_state_p(reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread))) ? Values.values(reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread), (SubLObject)reformulator_datastructures.$kw29$REUSED) : Values.values(memoization_state.new_memoization_state((SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED), (SubLObject)reformulator_datastructures.$kw30$NEW);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 11155L)
    public static SubLObject add_reformulation_assertion_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_datastructures.NIL;
        if (reformulator_datastructures.NIL != reformulator_rule_assertionP(assertion)) {
            result = reformulator_rule_unifier_datastructures.add_reformulator_rule_assertion(assertion, reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
        }
        else if (reformulator_datastructures.NIL != reformulator_precondition_assertionP(assertion)) {
            result = reformulator_rule_unifier_datastructures.add_reformulator_precondition_assertion(assertion);
        }
        else if (reformulator_datastructures.NIL != reformulation_direction_assertionP(assertion)) {
            result = reformulator_rule_unifier_datastructures.add_reformulation_direction_assertion(assertion);
        }
        else if (reformulator_datastructures.NIL != default_reformulation_direction_for_pred_assertionP(assertion)) {
            result = add_default_reformulation_direction_for_pred_assertion(assertion);
        }
        else if (reformulator_datastructures.NIL != reformulator_rule_property_assertionP(assertion)) {
            result = reformulator_rule_unifier_datastructures.add_reformulator_rule_property_assertion(assertion);
        }
        else if (reformulator_datastructures.NIL != default_reformulator_mode_precedence_assertionP(assertion)) {
            result = add_default_reformulator_mode_precedence_assertion(assertion);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 12367L)
    public static SubLObject add_default_reformulation_direction_for_pred_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject direction = default_direction_in_mode_for_pred_assertion_direction_arg(assertion);
        final SubLObject mode = default_direction_in_mode_for_pred_assertion_mode_arg(assertion);
        final SubLObject rule_pred = default_direction_in_mode_for_pred_assertion_rule_pred_arg(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject direction_struct = reformulator_rule_unifier_datastructures.construct_reformulation_direction_struct(direction, mt);
        SubLObject release = (SubLObject)reformulator_datastructures.NIL;
        try {
            release = Locks.seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            reformulator_datastructures.$default_reformulation_directions_in_modes_for_preds$.setGlobalValue(add_default_direction_struct_in_mode_for_pred(rule_pred, mode, direction_struct, reformulator_datastructures.$default_reformulation_directions_in_modes_for_preds$.getGlobalValue()));
        }
        finally {
            if (reformulator_datastructures.NIL != release) {
                Locks.release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)reformulator_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 13182L)
    public static SubLObject add_default_reformulator_mode_precedence_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode_precedence = default_reformulator_mode_precedence_assertion_modes_arg(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject mode_precedence_struct = construct_default_mode_precedence_struct(mode_precedence, mt);
        SubLObject release = (SubLObject)reformulator_datastructures.NIL;
        try {
            release = Locks.seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            reformulator_datastructures.$default_reformulator_mode_precedence$.setGlobalValue(add_reformulator_info(mode_precedence_struct, reformulator_datastructures.$default_reformulator_mode_precedence$.getGlobalValue()));
        }
        finally {
            if (reformulator_datastructures.NIL != release) {
                Locks.release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)reformulator_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 13760L)
    public static SubLObject remove_reformulation_assertion_int(final SubLObject assertion) {
        SubLObject result = (SubLObject)reformulator_datastructures.NIL;
        if (reformulator_datastructures.NIL != reformulator_rule_assertionP(assertion)) {
            result = reformulator_rule_unifier_datastructures.remove_reformulator_rule_assertion(assertion);
        }
        else if (reformulator_datastructures.NIL != reformulator_precondition_assertionP(assertion)) {
            result = reformulator_rule_unifier_datastructures.remove_reformulator_precondition_assertion(assertion);
        }
        else if (reformulator_datastructures.NIL != reformulation_direction_assertionP(assertion)) {
            result = reformulator_rule_unifier_datastructures.remove_reformulation_direction_assertion(assertion);
        }
        else if (reformulator_datastructures.NIL != default_reformulation_direction_for_pred_assertionP(assertion)) {
            result = remove_default_reformulation_direction_for_pred_assertion(assertion);
        }
        else if (reformulator_datastructures.NIL != reformulator_rule_property_assertionP(assertion)) {
            result = reformulator_rule_unifier_datastructures.remove_reformulator_rule_property_assertion(assertion);
        }
        else if (reformulator_datastructures.NIL != default_reformulator_mode_precedence_assertionP(assertion)) {
            result = remove_default_reformulator_mode_precedence_assertion(assertion);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 14979L)
    public static SubLObject remove_default_reformulation_direction_for_pred_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject direction = default_direction_in_mode_for_pred_assertion_direction_arg(assertion);
        final SubLObject mode = default_direction_in_mode_for_pred_assertion_mode_arg(assertion);
        final SubLObject rule_pred = default_direction_in_mode_for_pred_assertion_rule_pred_arg(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject direction_struct = reformulator_rule_unifier_datastructures.construct_reformulation_direction_struct(direction, mt);
        SubLObject release = (SubLObject)reformulator_datastructures.NIL;
        try {
            release = Locks.seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            reformulator_datastructures.$default_reformulation_directions_in_modes_for_preds$.setGlobalValue(remove_default_direction_struct_in_mode_for_pred(rule_pred, mode, direction_struct, reformulator_datastructures.$default_reformulation_directions_in_modes_for_preds$.getGlobalValue()));
        }
        finally {
            if (reformulator_datastructures.NIL != release) {
                Locks.release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)reformulator_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 15811L)
    public static SubLObject remove_default_reformulator_mode_precedence_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode_precedence = default_reformulator_mode_precedence_assertion_modes_arg(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject mode_precedence_struct = construct_default_mode_precedence_struct(mode_precedence, mt);
        SubLObject release = (SubLObject)reformulator_datastructures.NIL;
        try {
            release = Locks.seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            reformulator_datastructures.$default_reformulator_mode_precedence$.setGlobalValue(remove_reformulator_info(mode_precedence_struct, reformulator_datastructures.$default_reformulator_mode_precedence$.getGlobalValue()));
        }
        finally {
            if (reformulator_datastructures.NIL != release) {
                Locks.release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)reformulator_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 16407L)
    public static SubLObject reformulator_rule_assertionP(final SubLObject assertion) {
        return reformulator_relevant_assertion_pred_listP(assertion, reformulator_rule_predicates());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 16710L)
    public static SubLObject reformulator_precondition_assertionP(final SubLObject assertion) {
        return reformulator_relevant_assertion_single_predP(assertion, reformulator_datastructures.$const31$reformulationPrecondition);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 16871L)
    public static SubLObject reformulation_direction_assertionP(final SubLObject assertion) {
        return reformulator_relevant_assertion_single_predP(assertion, reformulator_datastructures.$const32$reformulationDirectionInMode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 17033L)
    public static SubLObject default_reformulation_direction_for_pred_assertionP(final SubLObject assertion) {
        return reformulator_relevant_assertion_single_predP(assertion, reformulator_datastructures.$const33$defaultReformulationDirectionInMo);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 17226L)
    public static SubLObject reformulator_rule_property_assertionP(final SubLObject assertion) {
        return reformulator_relevant_assertion_single_predP(assertion, reformulator_datastructures.$const34$reformulatorRuleProperties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 17389L)
    public static SubLObject default_reformulator_mode_precedence_assertionP(final SubLObject assertion) {
        return reformulator_relevant_assertion_single_predP(assertion, reformulator_datastructures.$const35$defaultReformulatorModePrecedence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 17569L)
    public static SubLObject reformulator_relevant_assertion_pred_listP(final SubLObject assertion, final SubLObject pred_list) {
        return assertion_utilities.gaf_assertion_with_any_of_preds_p(assertion, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 17819L)
    public static SubLObject reformulator_relevant_assertion_single_predP(final SubLObject assertion, final SubLObject pred) {
        return assertion_utilities.gaf_assertion_with_pred_p(assertion, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 18029L)
    public static SubLObject default_reformulation_recursion_limit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_datastructures.$default_reformulation_recursion_limit$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 18474L)
    public static SubLObject default_reformulator_mode_precedence(final SubLObject mt) {
        SubLObject result = (SubLObject)reformulator_datastructures.NIL;
        if (reformulator_datastructures.NIL == result) {
            SubLObject csome_list_var = reformulator_datastructures.$default_reformulator_mode_precedence$.getGlobalValue();
            SubLObject mode_precedence_struct = (SubLObject)reformulator_datastructures.NIL;
            mode_precedence_struct = csome_list_var.first();
            while (reformulator_datastructures.NIL == result && reformulator_datastructures.NIL != csome_list_var) {
                if (reformulator_datastructures.NIL != reformulator_mode_precedence_accessible_from_mtP(mode_precedence_struct, mt)) {
                    result = mode_precedence_struct_modes(mode_precedence_struct);
                }
                csome_list_var = csome_list_var.rest();
                mode_precedence_struct = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 18911L)
    public static SubLObject reformulator_mode_precedence_accessible_from_mtP(final SubLObject mode_precedence_struct, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_datastructures.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            result = mt_relevance_macros.relevant_mtP(mode_precedence_struct_mt(mode_precedence_struct));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19152L)
    public static SubLObject default_reformulation_directions_in_modes_for_preds() {
        return reformulator_datastructures.$default_reformulation_directions_in_modes_for_preds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19290L)
    public static SubLObject reformulator_irrelevant_forts() {
        return reformulator_datastructures.$reformulator_irrelevant_forts$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19386L)
    public static SubLObject reformulator_relevant_predicates() {
        return reformulator_datastructures.$reformulator_relevant_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19486L)
    public static SubLObject reformulator_rule_predicates() {
        return reformulator_datastructures.$reformulator_rule_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19578L)
    public static SubLObject reformulator_rule_spec_preds() {
        return reformulator_datastructures.$reformulator_rule_spec_preds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19670L)
    public static SubLObject reformulator_print_verbosity_level() {
        return reformulator_datastructures.$reformulator_print_verbosity_level$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19774L)
    public static SubLObject do_reformulator_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_datastructures.$list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rr = (SubLObject)reformulator_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_datastructures.$list36);
        rr = current.first();
        current = current.rest();
        if (reformulator_datastructures.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)reformulator_datastructures.$sym37$CDOHASH, (SubLObject)ConsesLow.listS((SubLObject)reformulator_datastructures.$sym38$KEY, rr, (SubLObject)reformulator_datastructures.$list39), (SubLObject)reformulator_datastructures.$list40, ConsesLow.append(body, (SubLObject)reformulator_datastructures.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)reformulator_datastructures.$list36);
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 20139L)
    public static SubLObject find_reformulator_rule_for_rule_assertion(final SubLObject assertion) {
        if (reformulator_datastructures.NIL != reformulator_initializedP()) {
            return Hashtables.gethash(assertion, reformulator_rule_unifier_datastructures.reformulator_rules(), (SubLObject)reformulator_datastructures.UNPROVIDED);
        }
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 21098L)
    public static SubLObject valid_reformulator_setting_keyword_p(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.member(keyword, reformulator_datastructures.$reformulator_setting_keywords$.getDynamicValue(thread), (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 21343L)
    public static SubLObject fix_invalid_settings(final SubLObject settings, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fixed_settings = conses_high.copy_list(settings);
        SubLObject list_var = (SubLObject)reformulator_datastructures.NIL;
        SubLObject element = (SubLObject)reformulator_datastructures.NIL;
        SubLObject index = (SubLObject)reformulator_datastructures.NIL;
        list_var = settings;
        element = list_var.first();
        for (index = (SubLObject)reformulator_datastructures.ZERO_INTEGER; reformulator_datastructures.NIL != list_var; list_var = list_var.rest(), element = list_var.first(), index = Numbers.add((SubLObject)reformulator_datastructures.ONE_INTEGER, index)) {
            if (reformulator_datastructures.NIL != Numbers.evenp(index) && reformulator_datastructures.NIL == subl_promotions.memberP(element, reformulator_datastructures.$reformulator_setting_keywords$.getDynamicValue(thread), (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
                reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.$str42$Found_an_invalid_setting___s___ig, element, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
                fixed_settings = conses_high.remf(fixed_settings, element);
            }
        }
        fixed_settings = fix_reformulate_subformulasP(fixed_settings);
        fixed_settings = fix_recursion_limit(fixed_settings);
        fixed_settings = fix_reformulator_modes(fixed_settings, mt);
        fixed_settings = fix_wff_enforcement(fixed_settings);
        fixed_settings = fix_use_kb_reformulator_rulesP(fixed_settings);
        fixed_settings = fix_reformulator_rules(fixed_settings);
        fixed_settings = fix_skip_assertions(fixed_settings, mt);
        fixed_settings = fix_reformulator_meta_predicates(fixed_settings, mt);
        fixed_settings = fix_precondition_checking(fixed_settings);
        fixed_settings = fix_search_strategy(fixed_settings);
        fixed_settings = fix_reformulation_focus(fixed_settings);
        fixed_settings = fix_ignore_rl_modules(fixed_settings);
        fixed_settings = fix_apply_first_recursively(fixed_settings);
        fixed_settings = fix_eliminate_transitivity_in_reformulation_historyP(fixed_settings);
        fixed_settings = fix_clear_reformulator_cachesP(fixed_settings);
        fixed_settings = fix_reformulate_atomsP(fixed_settings);
        return fixed_settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 22956L)
    public static SubLObject get_reformulate_subformulasP(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw43$REFORMULATE_SUBFORMULAS_, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 23175L)
    public static SubLObject fix_reformulate_subformulasP(SubLObject settings) {
        final SubLObject result = get_reformulate_subformulasP(settings);
        if (reformulator_datastructures.NIL == subl_promotions.memberP(result, (SubLObject)reformulator_datastructures.$list44, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
            invalid_setting_value_warning((SubLObject)reformulator_datastructures.$kw43$REFORMULATE_SUBFORMULAS_, result);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw43$REFORMULATE_SUBFORMULAS_);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 23493L)
    public static SubLObject get_recursion_limit(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw45$RECURSION_LIMIT, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 23630L)
    public static SubLObject fix_recursion_limit(SubLObject settings) {
        final SubLObject result = get_recursion_limit(settings);
        if (!result.isInteger() && !result.numGE((SubLObject)reformulator_datastructures.ZERO_INTEGER)) {
            invalid_setting_value_warning((SubLObject)reformulator_datastructures.$kw45$RECURSION_LIMIT, result);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw45$RECURSION_LIMIT);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 23921L)
    public static SubLObject get_reformulator_modes(final SubLObject settings, final SubLObject mt) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw46$MODES, settings, mt, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24047L)
    public static SubLObject clear_all_kb_reformulator_modes() {
        final SubLObject cs = reformulator_datastructures.$all_kb_reformulator_modes_caching_state$.getGlobalValue();
        if (reformulator_datastructures.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24047L)
    public static SubLObject remove_all_kb_reformulator_modes() {
        return memoization_state.caching_state_remove_function_results_with_args(reformulator_datastructures.$all_kb_reformulator_modes_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(reformulator_datastructures.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24047L)
    public static SubLObject all_kb_reformulator_modes_internal() {
        return isa.all_fort_instances_in_all_mts(reformulator_datastructures.$const48$ReformulatorMode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24047L)
    public static SubLObject all_kb_reformulator_modes() {
        SubLObject caching_state = reformulator_datastructures.$all_kb_reformulator_modes_caching_state$.getGlobalValue();
        if (reformulator_datastructures.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)reformulator_datastructures.$sym47$ALL_KB_REFORMULATOR_MODES, (SubLObject)reformulator_datastructures.$sym49$_ALL_KB_REFORMULATOR_MODES_CACHING_STATE_, (SubLObject)reformulator_datastructures.NIL, (SubLObject)reformulator_datastructures.EQ, (SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)reformulator_datastructures.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_kb_reformulator_modes_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)reformulator_datastructures.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24171L)
    public static SubLObject fix_reformulator_modes(SubLObject settings, final SubLObject mt) {
        final SubLObject temp_result = get_reformulator_modes(settings, mt);
        SubLObject result = (SubLObject)reformulator_datastructures.NIL;
        SubLObject cdolist_list_var = temp_result;
        SubLObject mode = (SubLObject)reformulator_datastructures.NIL;
        mode = cdolist_list_var.first();
        while (reformulator_datastructures.NIL != cdolist_list_var) {
            if (reformulator_datastructures.NIL != subl_promotions.memberP(mode, all_kb_reformulator_modes(), (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(mode, result);
            }
            else {
                reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.$str50$Found_invalid_reformulation_mode_, mode, temp_result, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mode = cdolist_list_var.first();
        }
        if (reformulator_datastructures.NIL != result) {
            settings = conses_high.putf(settings, (SubLObject)reformulator_datastructures.$kw46$MODES, Sequences.nreverse(result));
        }
        else {
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw46$MODES);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24704L)
    public static SubLObject reformulator_primary_mode(final SubLObject modes) {
        return modes.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24780L)
    public static SubLObject reformulator_secondary_mode(final SubLObject modes) {
        return conses_high.second(modes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24859L)
    public static SubLObject reformulator_tertiary_mode(final SubLObject modes) {
        return conses_high.third(modes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24936L)
    public static SubLObject get_wff_enforcement(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw51$WFF_ENFORCEMENT, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 25077L)
    public static SubLObject fix_wff_enforcement(SubLObject settings) {
        final SubLObject result = get_wff_enforcement(settings);
        if (reformulator_datastructures.NIL == subl_promotions.memberP(result, (SubLObject)reformulator_datastructures.$list52, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
            invalid_setting_value_warning((SubLObject)reformulator_datastructures.$kw51$WFF_ENFORCEMENT, result);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw51$WFF_ENFORCEMENT);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 25370L)
    public static SubLObject get_use_kb_reformulator_rulesP(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw53$USE_KB_REFORMULATOR_RULES_, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 25540L)
    public static SubLObject fix_use_kb_reformulator_rulesP(SubLObject settings) {
        final SubLObject result = get_use_kb_reformulator_rulesP(settings);
        if (reformulator_datastructures.NIL == subl_promotions.memberP(result, (SubLObject)reformulator_datastructures.$list44, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
            invalid_setting_value_warning((SubLObject)reformulator_datastructures.$kw53$USE_KB_REFORMULATOR_RULES_, result);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw53$USE_KB_REFORMULATOR_RULES_);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 25868L)
    public static SubLObject get_reformulator_rules(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw54$REFORMULATOR_RULES, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 26014L)
    public static SubLObject fix_reformulator_rules(SubLObject settings) {
        final SubLObject explicit_reformulator_rules = get_reformulator_rules(settings);
        if (reformulator_datastructures.NIL != explicit_reformulator_rules) {
            final SubLObject fixed_rules = check_explicit_reformulator_rules(explicit_reformulator_rules);
            settings = conses_high.putf(settings, (SubLObject)reformulator_datastructures.$kw54$REFORMULATOR_RULES, fixed_rules);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 26357L)
    public static SubLObject check_explicit_reformulator_rules(final SubLObject reformulator_rules) {
        if (reformulator_rules.isList()) {
            SubLObject result = (SubLObject)reformulator_datastructures.NIL;
            SubLObject cdolist_list_var = reformulator_rules;
            SubLObject rr = (SubLObject)reformulator_datastructures.NIL;
            rr = cdolist_list_var.first();
            while (reformulator_datastructures.NIL != cdolist_list_var) {
                if (reformulator_datastructures.NIL != reformulator_rule_unifier_datastructures.reformulator_rule_p(rr)) {
                    result = (SubLObject)ConsesLow.cons(rr, result);
                }
                else {
                    reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.$str55$Found_invalid_reformulator_rule__, rr, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                rr = cdolist_list_var.first();
            }
            return Sequences.nreverse(result);
        }
        reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.$str56$Expected_a_list_of_reformulator_r, reformulator_rules, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 26817L)
    public static SubLObject get_reformulator_rule_skip_assertions(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw57$SKIP_ASSERTIONS, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 26972L)
    public static SubLObject fix_skip_assertions(SubLObject settings, final SubLObject mt) {
        SubLObject skip_assertions = get_reformulator_rule_skip_assertions(settings);
        final SubLObject skip_sentences = get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw58$SKIP_SENTENCES, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
        if (reformulator_datastructures.NIL != skip_sentences) {
            skip_assertions = ConsesLow.append(skip_assertions, find_assertions_for_sentences_to_be_skipped(skip_sentences, mt));
        }
        if (reformulator_datastructures.NIL != skip_assertions) {
            skip_assertions = check_skip_assertions(skip_assertions);
            settings = conses_high.putf(settings, (SubLObject)reformulator_datastructures.$kw57$SKIP_ASSERTIONS, skip_assertions);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 27575L)
    public static SubLObject check_skip_assertions(final SubLObject assertions) {
        SubLObject result = (SubLObject)reformulator_datastructures.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)reformulator_datastructures.NIL;
        assertion = cdolist_list_var.first();
        while (reformulator_datastructures.NIL != cdolist_list_var) {
            if (reformulator_datastructures.NIL != reformulator_rule_assertionP(assertion)) {
                result = (SubLObject)ConsesLow.cons(assertion, result);
            }
            else {
                reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.$str59$Found_invalid_reformulator_rule_a, assertion, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 27933L)
    public static SubLObject find_assertions_for_sentences_to_be_skipped(final SubLObject sentences, final SubLObject mt) {
        SubLObject result = (SubLObject)reformulator_datastructures.NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = (SubLObject)reformulator_datastructures.NIL;
        sentence = cdolist_list_var.first();
        while (reformulator_datastructures.NIL != cdolist_list_var) {
            final SubLObject assertion = czer_meta.find_visible_assertion_cycl(sentence, mt);
            if (reformulator_datastructures.NIL != assertion) {
                result = (SubLObject)ConsesLow.cons(assertion, result);
            }
            else {
                reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.$str60$Found_sentence_to_skip__s_which_d, sentence, mt, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 28341L)
    public static SubLObject get_reformulator_meta_predicates(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw61$META_PREDICATES, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 28491L)
    public static SubLObject fix_reformulator_meta_predicates(SubLObject settings, final SubLObject mt) {
        final SubLObject meta_predicates = get_reformulator_meta_predicates(settings);
        SubLObject result = (SubLObject)reformulator_datastructures.NIL;
        SubLObject cdolist_list_var = meta_predicates;
        SubLObject pred = (SubLObject)reformulator_datastructures.NIL;
        pred = cdolist_list_var.first();
        while (reformulator_datastructures.NIL != cdolist_list_var) {
            if (reformulator_datastructures.NIL != isa.isaP(pred, reformulator_datastructures.$const62$UnaryPredicate, mt, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(pred, result);
            }
            else {
                reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.$str63$Found_a_reformulator_meta_predica, pred, mt, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        if (reformulator_datastructures.NIL != result) {
            settings = conses_high.putf(settings, (SubLObject)reformulator_datastructures.$kw61$META_PREDICATES, Sequences.nreverse(result));
        }
        else {
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw61$META_PREDICATES);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 29028L)
    public static SubLObject get_precondition_checking(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw64$PRECONDITION_CHECKING, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 29183L)
    public static SubLObject fix_precondition_checking(SubLObject settings) {
        final SubLObject result = get_precondition_checking(settings);
        if (reformulator_datastructures.NIL == subl_promotions.memberP(result, (SubLObject)reformulator_datastructures.$list65, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
            invalid_setting_value_warning((SubLObject)reformulator_datastructures.$kw64$PRECONDITION_CHECKING, result);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw64$PRECONDITION_CHECKING);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 29530L)
    public static SubLObject get_search_strategy(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw66$SEARCH_STRATEGY, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 29667L)
    public static SubLObject fix_search_strategy(SubLObject settings) {
        final SubLObject result = get_search_strategy(settings);
        if (reformulator_datastructures.NIL == subl_promotions.memberP(result, (SubLObject)reformulator_datastructures.$list67, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
            invalid_setting_value_warning((SubLObject)reformulator_datastructures.$kw66$SEARCH_STRATEGY, result);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw66$SEARCH_STRATEGY);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 29983L)
    public static SubLObject get_reformulation_focus(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw68$FOCUS, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 30104L)
    public static SubLObject fix_reformulation_focus(SubLObject settings) {
        final SubLObject result = get_reformulation_focus(settings);
        if (reformulator_datastructures.NIL != result && reformulator_datastructures.NIL == subl_promotions.memberP(result, reformulator_module_harness.rl_module_names(), (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
            reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.$str69$Found_invalid_reformulation_focus, result, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw68$FOCUS);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 30425L)
    public static SubLObject get_ignore_rl_modules(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw70$IGNORE_RL_MODULES, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 30568L)
    public static SubLObject fix_ignore_rl_modules(SubLObject settings) {
        final SubLObject result = get_ignore_rl_modules(settings);
        SubLObject errorP = (SubLObject)reformulator_datastructures.NIL;
        if (result.isList()) {
            if (reformulator_datastructures.NIL == errorP) {
                SubLObject csome_list_var = result;
                SubLObject rl_module_name = (SubLObject)reformulator_datastructures.NIL;
                rl_module_name = csome_list_var.first();
                while (reformulator_datastructures.NIL == errorP && reformulator_datastructures.NIL != csome_list_var) {
                    if (reformulator_datastructures.NIL == subl_promotions.memberP(rl_module_name, reformulator_module_harness.rl_module_names(), (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
                        errorP = (SubLObject)reformulator_datastructures.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    rl_module_name = csome_list_var.first();
                }
            }
        }
        else {
            errorP = (SubLObject)reformulator_datastructures.T;
        }
        if (reformulator_datastructures.NIL != errorP) {
            reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.$str71$Found_invalid__ignore_rl_modules_, result, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw70$IGNORE_RL_MODULES);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 31032L)
    public static SubLObject get_apply_first_recursively(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw72$APPLY_FIRST_RECURSIVELY, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 31193L)
    public static SubLObject fix_apply_first_recursively(SubLObject settings) {
        final SubLObject result = get_apply_first_recursively(settings);
        SubLObject errorP = (SubLObject)reformulator_datastructures.NIL;
        if (result.isList()) {
            if (reformulator_datastructures.NIL == errorP) {
                SubLObject csome_list_var = result;
                SubLObject rl_module_name = (SubLObject)reformulator_datastructures.NIL;
                rl_module_name = csome_list_var.first();
                while (reformulator_datastructures.NIL == errorP && reformulator_datastructures.NIL != csome_list_var) {
                    if (reformulator_datastructures.NIL == subl_promotions.memberP(rl_module_name, reformulator_module_harness.rl_module_names(), (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
                        errorP = (SubLObject)reformulator_datastructures.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    rl_module_name = csome_list_var.first();
                }
            }
        }
        else {
            errorP = (SubLObject)reformulator_datastructures.T;
        }
        if (reformulator_datastructures.NIL != errorP) {
            reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.$str73$Found_invalid__apply_first_recurs, result, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw72$APPLY_FIRST_RECURSIVELY);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 31681L)
    public static SubLObject get_eliminate_transitivity_in_reformulation_historyP(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 31917L)
    public static SubLObject fix_eliminate_transitivity_in_reformulation_historyP(SubLObject settings) {
        final SubLObject result = get_eliminate_transitivity_in_reformulation_historyP(settings);
        if (reformulator_datastructures.NIL == subl_promotions.memberP(result, (SubLObject)reformulator_datastructures.$list44, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
            invalid_setting_value_warning((SubLObject)reformulator_datastructures.$kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_, result);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 32331L)
    public static SubLObject get_clear_reformulator_cachesP(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw75$CLEAR_CACHES_, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 32488L)
    public static SubLObject fix_clear_reformulator_cachesP(SubLObject settings) {
        final SubLObject result = get_clear_reformulator_cachesP(settings);
        if (reformulator_datastructures.NIL == subl_promotions.memberP(result, (SubLObject)reformulator_datastructures.$list44, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
            invalid_setting_value_warning((SubLObject)reformulator_datastructures.$kw75$CLEAR_CACHES_, result);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw75$CLEAR_CACHES_);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 32788L)
    public static SubLObject get_reformulate_atomsP(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw76$REFORMULATE_ATOMS_, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 32934L)
    public static SubLObject fix_reformulate_atomsP(SubLObject settings) {
        final SubLObject result = get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw76$REFORMULATE_ATOMS_, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
        if (reformulator_datastructures.NIL == subl_promotions.memberP(result, (SubLObject)reformulator_datastructures.$list77, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED)) {
            invalid_setting_value_warning((SubLObject)reformulator_datastructures.$kw76$REFORMULATE_ATOMS_, result);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw76$REFORMULATE_ATOMS_);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 33273L)
    public static SubLObject get_max_time(final SubLObject settings) {
        return get_reformulator_setting_for((SubLObject)reformulator_datastructures.$kw78$MAX_TIME, settings, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 33390L)
    public static SubLObject fix_max_time(SubLObject settings) {
        final SubLObject result = get_max_time(settings);
        if (reformulator_datastructures.NIL != result && (!result.isInteger() || !result.numGE((SubLObject)reformulator_datastructures.ZERO_INTEGER))) {
            invalid_setting_value_warning((SubLObject)reformulator_datastructures.$kw78$MAX_TIME, result);
            settings = conses_high.remf(settings, (SubLObject)reformulator_datastructures.$kw78$MAX_TIME);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 33691L)
    public static SubLObject get_reformulator_setting_for(final SubLObject indicator, final SubLObject settings, SubLObject mt, SubLObject v_default) {
        if (mt == reformulator_datastructures.UNPROVIDED) {
            mt = (SubLObject)reformulator_datastructures.NIL;
        }
        if (v_default == reformulator_datastructures.UNPROVIDED) {
            v_default = (SubLObject)reformulator_datastructures.$kw79$COMPUTE_DEFAULT;
        }
        return conses_high.getf(settings, indicator, v_default.eql((SubLObject)reformulator_datastructures.$kw79$COMPUTE_DEFAULT) ? reformulator_default_for_setting(indicator, mt) : v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 33980L)
    public static SubLObject invalid_setting_value_warning(final SubLObject setting, final SubLObject value) {
        reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.ZERO_INTEGER, (SubLObject)reformulator_datastructures.$str80$Found_invalid_value__s_for_settin, value, setting, reformulator_default_for_setting(setting, (SubLObject)reformulator_datastructures.UNPROVIDED), (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 34208L)
    public static SubLObject reformulator_default_for_setting(final SubLObject indicator, SubLObject mt) {
        if (mt == reformulator_datastructures.UNPROVIDED) {
            mt = (SubLObject)reformulator_datastructures.NIL;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw45$RECURSION_LIMIT)) {
            return default_reformulation_recursion_limit();
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw43$REFORMULATE_SUBFORMULAS_)) {
            return (SubLObject)reformulator_datastructures.$kw81$TRUE;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw46$MODES)) {
            return default_reformulator_mode_precedence(mt);
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw51$WFF_ENFORCEMENT)) {
            return (SubLObject)reformulator_datastructures.$kw82$KB;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw53$USE_KB_REFORMULATOR_RULES_)) {
            return (SubLObject)reformulator_datastructures.$kw81$TRUE;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw54$REFORMULATOR_RULES)) {
            return (SubLObject)reformulator_datastructures.NIL;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw57$SKIP_ASSERTIONS)) {
            return (SubLObject)reformulator_datastructures.NIL;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw58$SKIP_SENTENCES)) {
            return (SubLObject)reformulator_datastructures.NIL;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw61$META_PREDICATES)) {
            return (SubLObject)reformulator_datastructures.NIL;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw64$PRECONDITION_CHECKING)) {
            return (SubLObject)reformulator_datastructures.$kw83$REMOVAL_ONLY_ASK;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw66$SEARCH_STRATEGY)) {
            return (SubLObject)reformulator_datastructures.$kw84$NO_SEARCH;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw68$FOCUS)) {
            return (SubLObject)reformulator_datastructures.NIL;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw70$IGNORE_RL_MODULES)) {
            return (SubLObject)reformulator_datastructures.NIL;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw72$APPLY_FIRST_RECURSIVELY)) {
            return (SubLObject)reformulator_datastructures.NIL;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_)) {
            return (SubLObject)reformulator_datastructures.$kw85$FALSE;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw75$CLEAR_CACHES_)) {
            return (SubLObject)reformulator_datastructures.$kw85$FALSE;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw76$REFORMULATE_ATOMS_)) {
            return (SubLObject)reformulator_datastructures.$kw81$TRUE;
        }
        if (indicator.eql((SubLObject)reformulator_datastructures.$kw78$MAX_TIME)) {
            return (SubLObject)reformulator_datastructures.NIL;
        }
        reformulator_hub.ref_warn((SubLObject)reformulator_datastructures.TWO_INTEGER, (SubLObject)reformulator_datastructures.$str86$Tried_to_get_an_undefined_default, indicator, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 35160L)
    public static SubLObject sync_reformulator_to_kb() {
        initialize_reformulator_variables();
        return reformulator_rule_unifier_datastructures.initialize_reformulator_rules();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 36053L)
    public static SubLObject clear_reformulator_caches() {
        clear_all_kb_reformulator_modes();
        reformulator_hub.clear_all_kb_modal_operators();
        return (SubLObject)reformulator_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 36182L)
    public static SubLObject initialize_reformulator_variables() {
        initialize_reformulator_irrelevant_forts();
        initialize_reformulator_relevant_predicates();
        initialize_reformulator_rule_predicates();
        initialize_reformulator_rule_spec_preds();
        gather_default_reformulator_mode_precedence_from_kb();
        gather_default_reformulation_directions_in_modes_for_preds_from_kb();
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 36870L)
    public static SubLObject initialize_reformulator_irrelevant_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_datastructures.$sym87$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(reformulator_datastructures.$const88$EverythingPSC, thread);
            SubLObject release = (SubLObject)reformulator_datastructures.NIL;
            try {
                release = Locks.seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                reformulator_datastructures.$reformulator_irrelevant_forts$.setGlobalValue(isa.all_fort_instances(reformulator_datastructures.$const89$ReformulatorIrrelevantFORT, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED));
            }
            finally {
                if (reformulator_datastructures.NIL != release) {
                    Locks.release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)reformulator_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 37199L)
    public static SubLObject initialize_reformulator_relevant_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_datastructures.$sym87$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(reformulator_datastructures.$const88$EverythingPSC, thread);
            SubLObject release = (SubLObject)reformulator_datastructures.NIL;
            try {
                release = Locks.seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                reformulator_datastructures.$reformulator_relevant_predicates$.setGlobalValue(isa.all_fort_instances(reformulator_datastructures.$const90$ReformulatorDirectivePredicate, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED));
            }
            finally {
                if (reformulator_datastructures.NIL != release) {
                    Locks.release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)reformulator_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 37535L)
    public static SubLObject initialize_reformulator_rule_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_datastructures.$sym87$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(reformulator_datastructures.$const88$EverythingPSC, thread);
            SubLObject release = (SubLObject)reformulator_datastructures.NIL;
            try {
                release = Locks.seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                reformulator_datastructures.$reformulator_rule_predicates$.setGlobalValue(isa.all_fort_instances(reformulator_datastructures.$const91$CycLReformulationRulePredicate, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED));
            }
            finally {
                if (reformulator_datastructures.NIL != release) {
                    Locks.release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)reformulator_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 37767L)
    public static SubLObject initialize_reformulator_rule_spec_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_datastructures.$sym87$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(reformulator_datastructures.$const88$EverythingPSC, thread);
            SubLObject release = (SubLObject)reformulator_datastructures.NIL;
            try {
                release = Locks.seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                reformulator_datastructures.$reformulator_rule_spec_preds$.setGlobalValue(genl_predicates.all_spec_preds(reformulator_datastructures.$const92$reformulatorRule, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED));
            }
            finally {
                if (reformulator_datastructures.NIL != release) {
                    Locks.release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)reformulator_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 37983L)
    public static SubLObject gather_default_reformulator_mode_precedence_from_kb() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reformulator_datastructures.$default_reformulator_mode_precedence$.setGlobalValue((SubLObject)reformulator_datastructures.NIL);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_datastructures.$sym87$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(reformulator_datastructures.$const88$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject all_mode_precedence_assertions = cdolist_list_var = kb_mapping.gather_predicate_extent_index(reformulator_datastructures.$const35$defaultReformulatorModePrecedence, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
            SubLObject assertion = (SubLObject)reformulator_datastructures.NIL;
            assertion = cdolist_list_var.first();
            while (reformulator_datastructures.NIL != cdolist_list_var) {
                if (reformulator_datastructures.NIL != assertions_high.gaf_assertionP(assertion) && reformulator_datastructures.NIL == assertions_high.code_assertionP(assertion)) {
                    final SubLObject mode_precedence = default_reformulator_mode_precedence_assertion_modes_arg(assertion);
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject mode_precedence_struct = construct_default_mode_precedence_struct(mode_precedence, mt);
                    SubLObject release = (SubLObject)reformulator_datastructures.NIL;
                    try {
                        release = Locks.seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                        reformulator_datastructures.$default_reformulator_mode_precedence$.setGlobalValue(add_reformulator_info(mode_precedence_struct, reformulator_datastructures.$default_reformulator_mode_precedence$.getGlobalValue()));
                    }
                    finally {
                        if (reformulator_datastructures.NIL != release) {
                            Locks.release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)reformulator_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 38960L)
    public static SubLObject construct_default_mode_precedence_struct(final SubLObject mode_precedence, final SubLObject mt) {
        return (SubLObject)ConsesLow.list(mode_precedence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 39074L)
    public static SubLObject default_reformulator_mode_precedence_assertion_modes_arg(final SubLObject assertion) {
        return assertions_high.gaf_args(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 39190L)
    public static SubLObject mode_precedence_struct_modes(final SubLObject mode_precedence_struct) {
        return mode_precedence_struct.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 39301L)
    public static SubLObject mode_precedence_struct_mt(final SubLObject mode_precedence_struct) {
        return conses_high.second(mode_precedence_struct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 39410L)
    public static SubLObject gather_default_reformulation_directions_in_modes_for_preds_from_kb() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reformulator_datastructures.$default_reformulation_directions_in_modes_for_preds$.setGlobalValue((SubLObject)reformulator_datastructures.NIL);
        SubLObject cdolist_list_var = reformulator_rule_predicates();
        SubLObject rule_pred = (SubLObject)reformulator_datastructures.NIL;
        rule_pred = cdolist_list_var.first();
        while (reformulator_datastructures.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_datastructures.$sym87$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(reformulator_datastructures.$const88$EverythingPSC, thread);
                final SubLObject all_default_direction_assertions = kb_mapping.gather_gaf_arg_index(rule_pred, (SubLObject)reformulator_datastructures.THREE_INTEGER, reformulator_datastructures.$const33$defaultReformulationDirectionInMo, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
                SubLObject default_directions_for_pred = (SubLObject)reformulator_datastructures.NIL;
                SubLObject cdolist_list_var_$1 = all_default_direction_assertions;
                SubLObject assertion = (SubLObject)reformulator_datastructures.NIL;
                assertion = cdolist_list_var_$1.first();
                while (reformulator_datastructures.NIL != cdolist_list_var_$1) {
                    if (reformulator_datastructures.NIL != assertions_high.gaf_assertionP(assertion) && reformulator_datastructures.NIL == assertions_high.code_assertionP(assertion)) {
                        final SubLObject direction = default_direction_in_mode_for_pred_assertion_direction_arg(assertion);
                        final SubLObject mode = default_direction_in_mode_for_pred_assertion_mode_arg(assertion);
                        final SubLObject mt = assertions_high.assertion_mt(assertion);
                        final SubLObject direction_struct = reformulator_rule_unifier_datastructures.construct_reformulation_direction_struct(direction, mt);
                        default_directions_for_pred = reformulator_rule_unifier_datastructures.add_direction_struct_for_mode(mode, direction_struct, default_directions_for_pred);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    assertion = cdolist_list_var_$1.first();
                }
                SubLObject release = (SubLObject)reformulator_datastructures.NIL;
                try {
                    release = Locks.seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                    reformulator_datastructures.$default_reformulation_directions_in_modes_for_preds$.setGlobalValue(conses_high.putf(reformulator_datastructures.$default_reformulation_directions_in_modes_for_preds$.getGlobalValue(), rule_pred, default_directions_for_pred));
                }
                finally {
                    if (reformulator_datastructures.NIL != release) {
                        Locks.release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule_pred = cdolist_list_var.first();
        }
        return (SubLObject)reformulator_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 40780L)
    public static SubLObject default_direction_in_mode_for_pred_assertion_direction_arg(final SubLObject assertion) {
        return assertions_high.gaf_arg1(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 40899L)
    public static SubLObject default_direction_in_mode_for_pred_assertion_mode_arg(final SubLObject assertion) {
        return assertions_high.gaf_arg2(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 41012L)
    public static SubLObject default_direction_in_mode_for_pred_assertion_rule_pred_arg(final SubLObject assertion) {
        return assertions_high.gaf_arg3(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 41130L)
    public static SubLObject add_default_direction_struct_in_mode_for_pred(final SubLObject pred, final SubLObject mode, final SubLObject direction_struct, SubLObject current_direction_list) {
        SubLObject current_mode_directions_for_pred = mode_directions_for_pred(pred, mode, current_direction_list);
        current_mode_directions_for_pred = add_reformulator_info(direction_struct, current_mode_directions_for_pred);
        current_direction_list = substitute_mode_directions_for_pred(pred, mode, current_mode_directions_for_pred, current_direction_list);
        return current_direction_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 41767L)
    public static SubLObject remove_default_direction_struct_in_mode_for_pred(final SubLObject pred, final SubLObject mode, final SubLObject direction_struct, SubLObject current_direction_list) {
        SubLObject current_mode_directions_for_pred = mode_directions_for_pred(pred, mode, current_direction_list);
        if (reformulator_datastructures.NIL != current_mode_directions_for_pred) {
            current_mode_directions_for_pred = remove_reformulator_info(direction_struct, current_mode_directions_for_pred);
            current_direction_list = substitute_mode_directions_for_pred(pred, mode, current_mode_directions_for_pred, current_direction_list);
        }
        return current_direction_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 42461L)
    public static SubLObject substitute_mode_directions_for_pred(final SubLObject pred, final SubLObject mode, final SubLObject new_mode_directions_for_pred, final SubLObject direction_list) {
        SubLObject current_directions_for_pred = directions_for_pred(pred, direction_list);
        current_directions_for_pred = reformulator_rule_unifier_datastructures.substitute_directions_for_mode(mode, new_mode_directions_for_pred, current_directions_for_pred);
        return conses_high.putf(conses_high.remf(direction_list, pred), pred, current_directions_for_pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 42978L)
    public static SubLObject mode_directions_for_pred(final SubLObject pred, final SubLObject mode, final SubLObject directions) {
        return reformulator_rule_unifier_datastructures.directions_for_mode(mode, directions_for_pred(pred, directions));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 43120L)
    public static SubLObject directions_for_pred(final SubLObject pred, final SubLObject directions) {
        return conses_high.getf(directions, pred, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 43208L)
    public static SubLObject add_reformulator_info(final SubLObject ref_struct, final SubLObject struct_list) {
        return list_utilities.sort_adjoin(ref_struct, struct_list, Symbols.symbol_function((SubLObject)reformulator_datastructures.EQL), (SubLObject)reformulator_datastructures.$sym93$GENL_MT_, Symbols.symbol_function((SubLObject)reformulator_datastructures.$sym94$SECOND));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 43380L)
    public static SubLObject remove_reformulator_info(final SubLObject ref_struct, final SubLObject struct_list) {
        return Sequences.delete(ref_struct, struct_list, Symbols.symbol_function((SubLObject)reformulator_datastructures.EQUAL), (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED, (SubLObject)reformulator_datastructures.UNPROVIDED);
    }
    
    public static SubLObject declare_reformulator_datastructures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "ensure_reformulator_initialized", "ENSURE-REFORMULATOR-INITIALIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_initializedP", "REFORMULATOR-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_rules_initializedP", "REFORMULATOR-RULES-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_variables_initializedP", "REFORMULATOR-VARIABLES-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_fully_initializedP", "REFORMULATOR-FULLY-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "initialize_reformulator_kb_feature", "INITIALIZE-REFORMULATOR-KB-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "initialize_reformulator", "INITIALIZE-REFORMULATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_rule_count", "REFORMULATOR-RULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "unassociated_reformulator_rule_count", "UNASSOCIATED-REFORMULATOR-RULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "assertion_in_reformulatorP", "ASSERTION-IN-REFORMULATOR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_relevant_assertionP", "REFORMULATOR-RELEVANT-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "add_reformulation_assertion", "ADD-REFORMULATION-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "remove_reformulation_assertion", "REMOVE-REFORMULATION-ASSERTION", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.reformulator_datastructures", "with_reformulator_memoization", "WITH-REFORMULATOR-MEMOIZATION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.reformulator_datastructures", "with_new_reformulator_memoization_state", "WITH-NEW-REFORMULATOR-MEMOIZATION-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.reformulator_datastructures", "with_reformulator_memoization_state", "WITH-REFORMULATOR-MEMOIZATION-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.reformulator_datastructures", "with_reformulator_memoization_state_internal", "WITH-REFORMULATOR-MEMOIZATION-STATE-INTERNAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "find_or_create_reformulator_memoization_state", "FIND-OR-CREATE-REFORMULATOR-MEMOIZATION-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "add_reformulation_assertion_int", "ADD-REFORMULATION-ASSERTION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "add_default_reformulation_direction_for_pred_assertion", "ADD-DEFAULT-REFORMULATION-DIRECTION-FOR-PRED-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "add_default_reformulator_mode_precedence_assertion", "ADD-DEFAULT-REFORMULATOR-MODE-PRECEDENCE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "remove_reformulation_assertion_int", "REMOVE-REFORMULATION-ASSERTION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "remove_default_reformulation_direction_for_pred_assertion", "REMOVE-DEFAULT-REFORMULATION-DIRECTION-FOR-PRED-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "remove_default_reformulator_mode_precedence_assertion", "REMOVE-DEFAULT-REFORMULATOR-MODE-PRECEDENCE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_rule_assertionP", "REFORMULATOR-RULE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_precondition_assertionP", "REFORMULATOR-PRECONDITION-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulation_direction_assertionP", "REFORMULATION-DIRECTION-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "default_reformulation_direction_for_pred_assertionP", "DEFAULT-REFORMULATION-DIRECTION-FOR-PRED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_rule_property_assertionP", "REFORMULATOR-RULE-PROPERTY-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "default_reformulator_mode_precedence_assertionP", "DEFAULT-REFORMULATOR-MODE-PRECEDENCE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_relevant_assertion_pred_listP", "REFORMULATOR-RELEVANT-ASSERTION-PRED-LIST?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_relevant_assertion_single_predP", "REFORMULATOR-RELEVANT-ASSERTION-SINGLE-PRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "default_reformulation_recursion_limit", "DEFAULT-REFORMULATION-RECURSION-LIMIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "default_reformulator_mode_precedence", "DEFAULT-REFORMULATOR-MODE-PRECEDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_mode_precedence_accessible_from_mtP", "REFORMULATOR-MODE-PRECEDENCE-ACCESSIBLE-FROM-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "default_reformulation_directions_in_modes_for_preds", "DEFAULT-REFORMULATION-DIRECTIONS-IN-MODES-FOR-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_irrelevant_forts", "REFORMULATOR-IRRELEVANT-FORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_relevant_predicates", "REFORMULATOR-RELEVANT-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_rule_predicates", "REFORMULATOR-RULE-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_rule_spec_preds", "REFORMULATOR-RULE-SPEC-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_print_verbosity_level", "REFORMULATOR-PRINT-VERBOSITY-LEVEL", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.reformulator_datastructures", "do_reformulator_rules", "DO-REFORMULATOR-RULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "find_reformulator_rule_for_rule_assertion", "FIND-REFORMULATOR-RULE-FOR-RULE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "valid_reformulator_setting_keyword_p", "VALID-REFORMULATOR-SETTING-KEYWORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_invalid_settings", "FIX-INVALID-SETTINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_reformulate_subformulasP", "GET-REFORMULATE-SUBFORMULAS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_reformulate_subformulasP", "FIX-REFORMULATE-SUBFORMULAS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_recursion_limit", "GET-RECURSION-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_recursion_limit", "FIX-RECURSION-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_reformulator_modes", "GET-REFORMULATOR-MODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "clear_all_kb_reformulator_modes", "CLEAR-ALL-KB-REFORMULATOR-MODES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "remove_all_kb_reformulator_modes", "REMOVE-ALL-KB-REFORMULATOR-MODES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "all_kb_reformulator_modes_internal", "ALL-KB-REFORMULATOR-MODES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "all_kb_reformulator_modes", "ALL-KB-REFORMULATOR-MODES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_reformulator_modes", "FIX-REFORMULATOR-MODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_primary_mode", "REFORMULATOR-PRIMARY-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_secondary_mode", "REFORMULATOR-SECONDARY-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_tertiary_mode", "REFORMULATOR-TERTIARY-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_wff_enforcement", "GET-WFF-ENFORCEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_wff_enforcement", "FIX-WFF-ENFORCEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_use_kb_reformulator_rulesP", "GET-USE-KB-REFORMULATOR-RULES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_use_kb_reformulator_rulesP", "FIX-USE-KB-REFORMULATOR-RULES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_reformulator_rules", "GET-REFORMULATOR-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_reformulator_rules", "FIX-REFORMULATOR-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "check_explicit_reformulator_rules", "CHECK-EXPLICIT-REFORMULATOR-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_reformulator_rule_skip_assertions", "GET-REFORMULATOR-RULE-SKIP-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_skip_assertions", "FIX-SKIP-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "check_skip_assertions", "CHECK-SKIP-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "find_assertions_for_sentences_to_be_skipped", "FIND-ASSERTIONS-FOR-SENTENCES-TO-BE-SKIPPED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_reformulator_meta_predicates", "GET-REFORMULATOR-META-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_reformulator_meta_predicates", "FIX-REFORMULATOR-META-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_precondition_checking", "GET-PRECONDITION-CHECKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_precondition_checking", "FIX-PRECONDITION-CHECKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_search_strategy", "GET-SEARCH-STRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_search_strategy", "FIX-SEARCH-STRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_reformulation_focus", "GET-REFORMULATION-FOCUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_reformulation_focus", "FIX-REFORMULATION-FOCUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_ignore_rl_modules", "GET-IGNORE-RL-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_ignore_rl_modules", "FIX-IGNORE-RL-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_apply_first_recursively", "GET-APPLY-FIRST-RECURSIVELY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_apply_first_recursively", "FIX-APPLY-FIRST-RECURSIVELY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_eliminate_transitivity_in_reformulation_historyP", "GET-ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_eliminate_transitivity_in_reformulation_historyP", "FIX-ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_clear_reformulator_cachesP", "GET-CLEAR-REFORMULATOR-CACHES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_clear_reformulator_cachesP", "FIX-CLEAR-REFORMULATOR-CACHES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_reformulate_atomsP", "GET-REFORMULATE-ATOMS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_reformulate_atomsP", "FIX-REFORMULATE-ATOMS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_max_time", "GET-MAX-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "fix_max_time", "FIX-MAX-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "get_reformulator_setting_for", "GET-REFORMULATOR-SETTING-FOR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "invalid_setting_value_warning", "INVALID-SETTING-VALUE-WARNING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "reformulator_default_for_setting", "REFORMULATOR-DEFAULT-FOR-SETTING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "sync_reformulator_to_kb", "SYNC-REFORMULATOR-TO-KB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "clear_reformulator_caches", "CLEAR-REFORMULATOR-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "initialize_reformulator_variables", "INITIALIZE-REFORMULATOR-VARIABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "initialize_reformulator_irrelevant_forts", "INITIALIZE-REFORMULATOR-IRRELEVANT-FORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "initialize_reformulator_relevant_predicates", "INITIALIZE-REFORMULATOR-RELEVANT-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "initialize_reformulator_rule_predicates", "INITIALIZE-REFORMULATOR-RULE-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "initialize_reformulator_rule_spec_preds", "INITIALIZE-REFORMULATOR-RULE-SPEC-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "gather_default_reformulator_mode_precedence_from_kb", "GATHER-DEFAULT-REFORMULATOR-MODE-PRECEDENCE-FROM-KB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "construct_default_mode_precedence_struct", "CONSTRUCT-DEFAULT-MODE-PRECEDENCE-STRUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "default_reformulator_mode_precedence_assertion_modes_arg", "DEFAULT-REFORMULATOR-MODE-PRECEDENCE-ASSERTION-MODES-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "mode_precedence_struct_modes", "MODE-PRECEDENCE-STRUCT-MODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "mode_precedence_struct_mt", "MODE-PRECEDENCE-STRUCT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "gather_default_reformulation_directions_in_modes_for_preds_from_kb", "GATHER-DEFAULT-REFORMULATION-DIRECTIONS-IN-MODES-FOR-PREDS-FROM-KB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "default_direction_in_mode_for_pred_assertion_direction_arg", "DEFAULT-DIRECTION-IN-MODE-FOR-PRED-ASSERTION-DIRECTION-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "default_direction_in_mode_for_pred_assertion_mode_arg", "DEFAULT-DIRECTION-IN-MODE-FOR-PRED-ASSERTION-MODE-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "default_direction_in_mode_for_pred_assertion_rule_pred_arg", "DEFAULT-DIRECTION-IN-MODE-FOR-PRED-ASSERTION-RULE-PRED-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "add_default_direction_struct_in_mode_for_pred", "ADD-DEFAULT-DIRECTION-STRUCT-IN-MODE-FOR-PRED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "remove_default_direction_struct_in_mode_for_pred", "REMOVE-DEFAULT-DIRECTION-STRUCT-IN-MODE-FOR-PRED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "substitute_mode_directions_for_pred", "SUBSTITUTE-MODE-DIRECTIONS-FOR-PRED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "mode_directions_for_pred", "MODE-DIRECTIONS-FOR-PRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "directions_for_pred", "DIRECTIONS-FOR-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "add_reformulator_info", "ADD-REFORMULATOR-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_datastructures", "remove_reformulator_info", "REMOVE-REFORMULATOR-INFO", 2, 0, false);
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    public static SubLObject init_reformulator_datastructures_file() {
        reformulator_datastructures.$reformulator_initialization_success_ratio$ = SubLFiles.deflexical("*REFORMULATOR-INITIALIZATION-SUCCESS-RATIO*", (SubLObject)reformulator_datastructures.$float0$0_9);
        reformulator_datastructures.$reformulator_core_constants$ = SubLFiles.deflexical("*REFORMULATOR-CORE-CONSTANTS*", (SubLObject)reformulator_datastructures.$list1);
        reformulator_datastructures.$default_reformulator_mode_precedence$ = SubLFiles.deflexical("*DEFAULT-REFORMULATOR-MODE-PRECEDENCE*", (SubLObject)((reformulator_datastructures.NIL != Symbols.boundp((SubLObject)reformulator_datastructures.$sym5$_DEFAULT_REFORMULATOR_MODE_PRECEDENCE_)) ? reformulator_datastructures.$default_reformulator_mode_precedence$.getGlobalValue() : reformulator_datastructures.NIL));
        reformulator_datastructures.$default_reformulation_directions_in_modes_for_preds$ = SubLFiles.deflexical("*DEFAULT-REFORMULATION-DIRECTIONS-IN-MODES-FOR-PREDS*", (SubLObject)((reformulator_datastructures.NIL != Symbols.boundp((SubLObject)reformulator_datastructures.$sym6$_DEFAULT_REFORMULATION_DIRECTIONS_IN_MODES_FOR_PREDS_)) ? reformulator_datastructures.$default_reformulation_directions_in_modes_for_preds$.getGlobalValue() : reformulator_datastructures.NIL));
        reformulator_datastructures.$default_reformulation_recursion_limit$ = SubLFiles.defparameter("*DEFAULT-REFORMULATION-RECURSION-LIMIT*", (SubLObject)reformulator_datastructures.$int7$35);
        reformulator_datastructures.$reformulator_irrelevant_forts$ = SubLFiles.deflexical("*REFORMULATOR-IRRELEVANT-FORTS*", (SubLObject)((reformulator_datastructures.NIL != Symbols.boundp((SubLObject)reformulator_datastructures.$sym8$_REFORMULATOR_IRRELEVANT_FORTS_)) ? reformulator_datastructures.$reformulator_irrelevant_forts$.getGlobalValue() : reformulator_datastructures.NIL));
        reformulator_datastructures.$reformulator_relevant_predicates$ = SubLFiles.deflexical("*REFORMULATOR-RELEVANT-PREDICATES*", (SubLObject)((reformulator_datastructures.NIL != Symbols.boundp((SubLObject)reformulator_datastructures.$sym9$_REFORMULATOR_RELEVANT_PREDICATES_)) ? reformulator_datastructures.$reformulator_relevant_predicates$.getGlobalValue() : reformulator_datastructures.NIL));
        reformulator_datastructures.$reformulator_rule_predicates$ = SubLFiles.deflexical("*REFORMULATOR-RULE-PREDICATES*", (SubLObject)((reformulator_datastructures.NIL != Symbols.boundp((SubLObject)reformulator_datastructures.$sym10$_REFORMULATOR_RULE_PREDICATES_)) ? reformulator_datastructures.$reformulator_rule_predicates$.getGlobalValue() : reformulator_datastructures.NIL));
        reformulator_datastructures.$reformulator_rule_spec_preds$ = SubLFiles.deflexical("*REFORMULATOR-RULE-SPEC-PREDS*", (SubLObject)((reformulator_datastructures.NIL != Symbols.boundp((SubLObject)reformulator_datastructures.$sym11$_REFORMULATOR_RULE_SPEC_PREDS_)) ? reformulator_datastructures.$reformulator_rule_spec_preds$.getGlobalValue() : reformulator_datastructures.NIL));
        reformulator_datastructures.$reformulator_print_verbosity_level$ = SubLFiles.deflexical("*REFORMULATOR-PRINT-VERBOSITY-LEVEL*", (SubLObject)reformulator_datastructures.ONE_INTEGER);
        reformulator_datastructures.$reformulator_lock$ = SubLFiles.defparameter("*REFORMULATOR-LOCK*", Locks.make_lock((SubLObject)reformulator_datastructures.$str12$Reformulator_Initialization_Updat));
        reformulator_datastructures.$reformulator_memoization_state$ = SubLFiles.defparameter("*REFORMULATOR-MEMOIZATION-STATE*", (SubLObject)reformulator_datastructures.$kw13$UNINITIALIZED);
        reformulator_datastructures.$reformulator_setting_keywords$ = SubLFiles.defparameter("*REFORMULATOR-SETTING-KEYWORDS*", (SubLObject)reformulator_datastructures.$list41);
        reformulator_datastructures.$all_kb_reformulator_modes_caching_state$ = SubLFiles.deflexical("*ALL-KB-REFORMULATOR-MODES-CACHING-STATE*", (SubLObject)reformulator_datastructures.NIL);
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    public static SubLObject setup_reformulator_datastructures_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)reformulator_datastructures.$sym5$_DEFAULT_REFORMULATOR_MODE_PRECEDENCE_);
        subl_macro_promotions.declare_defglobal((SubLObject)reformulator_datastructures.$sym6$_DEFAULT_REFORMULATION_DIRECTIONS_IN_MODES_FOR_PREDS_);
        subl_macro_promotions.declare_defglobal((SubLObject)reformulator_datastructures.$sym8$_REFORMULATOR_IRRELEVANT_FORTS_);
        subl_macro_promotions.declare_defglobal((SubLObject)reformulator_datastructures.$sym9$_REFORMULATOR_RELEVANT_PREDICATES_);
        subl_macro_promotions.declare_defglobal((SubLObject)reformulator_datastructures.$sym10$_REFORMULATOR_RULE_PREDICATES_);
        subl_macro_promotions.declare_defglobal((SubLObject)reformulator_datastructures.$sym11$_REFORMULATOR_RULE_SPEC_PREDS_);
        access_macros.register_macro_helper((SubLObject)reformulator_datastructures.$sym27$FIND_OR_CREATE_REFORMULATOR_MEMOIZATION_STATE, (SubLObject)reformulator_datastructures.$sym28$WITH_REFORMULATOR_MEMOIZATION);
        memoization_state.note_globally_cached_function((SubLObject)reformulator_datastructures.$sym47$ALL_KB_REFORMULATOR_MODES);
        return (SubLObject)reformulator_datastructures.NIL;
    }
    
    public void declareFunctions() {
        declare_reformulator_datastructures_file();
    }
    
    public void initializeVariables() {
        init_reformulator_datastructures_file();
    }
    
    public void runTopLevelForms() {
        setup_reformulator_datastructures_file();
    }
    
    static {
        me = (SubLFile)new reformulator_datastructures();
        reformulator_datastructures.$reformulator_initialization_success_ratio$ = null;
        reformulator_datastructures.$reformulator_core_constants$ = null;
        reformulator_datastructures.$default_reformulator_mode_precedence$ = null;
        reformulator_datastructures.$default_reformulation_directions_in_modes_for_preds$ = null;
        reformulator_datastructures.$default_reformulation_recursion_limit$ = null;
        reformulator_datastructures.$reformulator_irrelevant_forts$ = null;
        reformulator_datastructures.$reformulator_relevant_predicates$ = null;
        reformulator_datastructures.$reformulator_rule_predicates$ = null;
        reformulator_datastructures.$reformulator_rule_spec_preds$ = null;
        reformulator_datastructures.$reformulator_print_verbosity_level$ = null;
        reformulator_datastructures.$reformulator_lock$ = null;
        reformulator_datastructures.$reformulator_memoization_state$ = null;
        reformulator_datastructures.$reformulator_setting_keywords$ = null;
        reformulator_datastructures.$all_kb_reformulator_modes_caching_state$ = null;
        $float0$0_9 = (SubLFloat)SubLObjectFactory.makeDouble(0.9);
        $list1 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorRule")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorEquals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorEquiv")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulationPrecondition")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorRuleProperties")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorDirectivePredicate")));
        $sym2$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $str3$A_KB_dependent_reformulator_funct = SubLObjectFactory.makeString("A KB-dependent reformulator function was called, but the current Cyc KB does not contain knowledge necessary for reformulation.");
        $sym4$REFORMULATOR_RELEVANT_ASSERTION_ = SubLObjectFactory.makeSymbol("REFORMULATOR-RELEVANT-ASSERTION?");
        $sym5$_DEFAULT_REFORMULATOR_MODE_PRECEDENCE_ = SubLObjectFactory.makeSymbol("*DEFAULT-REFORMULATOR-MODE-PRECEDENCE*");
        $sym6$_DEFAULT_REFORMULATION_DIRECTIONS_IN_MODES_FOR_PREDS_ = SubLObjectFactory.makeSymbol("*DEFAULT-REFORMULATION-DIRECTIONS-IN-MODES-FOR-PREDS*");
        $int7$35 = SubLObjectFactory.makeInteger(35);
        $sym8$_REFORMULATOR_IRRELEVANT_FORTS_ = SubLObjectFactory.makeSymbol("*REFORMULATOR-IRRELEVANT-FORTS*");
        $sym9$_REFORMULATOR_RELEVANT_PREDICATES_ = SubLObjectFactory.makeSymbol("*REFORMULATOR-RELEVANT-PREDICATES*");
        $sym10$_REFORMULATOR_RULE_PREDICATES_ = SubLObjectFactory.makeSymbol("*REFORMULATOR-RULE-PREDICATES*");
        $sym11$_REFORMULATOR_RULE_SPEC_PREDS_ = SubLObjectFactory.makeSymbol("*REFORMULATOR-RULE-SPEC-PREDS*");
        $str12$Reformulator_Initialization_Updat = SubLObjectFactory.makeString("Reformulator Initialization/Update");
        $kw13$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym14$WITH_REFORMULATOR_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-REFORMULATOR-MEMOIZATION-STATE");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-REFORMULATOR-MEMOIZATION-STATE")));
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MEMOIZATION-STATE")));
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-FORM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym18$MEMOIZATION_STATE = SubLObjectFactory.makeUninternedSymbol("MEMOIZATION-STATE");
        $sym19$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym20$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-P"));
        $sym22$WITH_REFORMULATOR_MEMOIZATION_STATE_INTERNAL = SubLObjectFactory.makeSymbol("WITH-REFORMULATOR-MEMOIZATION-STATE-INTERNAL");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym24$_REFORMULATOR_MEMOIZATION_STATE_ = SubLObjectFactory.makeSymbol("*REFORMULATOR-MEMOIZATION-STATE*");
        $sym25$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*REFORMULATOR-MEMOIZATION-STATE*"));
        $sym27$FIND_OR_CREATE_REFORMULATOR_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-REFORMULATOR-MEMOIZATION-STATE");
        $sym28$WITH_REFORMULATOR_MEMOIZATION = SubLObjectFactory.makeSymbol("WITH-REFORMULATOR-MEMOIZATION");
        $kw29$REUSED = SubLObjectFactory.makeKeyword("REUSED");
        $kw30$NEW = SubLObjectFactory.makeKeyword("NEW");
        $const31$reformulationPrecondition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulationPrecondition"));
        $const32$reformulationDirectionInMode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulationDirectionInMode"));
        $const33$defaultReformulationDirectionInMo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultReformulationDirectionInModeForPred"));
        $const34$reformulatorRuleProperties = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorRuleProperties"));
        $const35$defaultReformulatorModePrecedence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultReformulatorModePrecedence"));
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym37$CDOHASH = SubLObjectFactory.makeSymbol("CDOHASH");
        $sym38$KEY = SubLObjectFactory.makeSymbol("KEY");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFORMULATOR-RULES")));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"));
        $list41 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REFORMULATE-SUBFORMULAS?"), SubLObjectFactory.makeKeyword("RECURSION-LIMIT"), SubLObjectFactory.makeKeyword("MODES"), SubLObjectFactory.makeKeyword("WFF-ENFORCEMENT"), SubLObjectFactory.makeKeyword("USE-KB-REFORMULATOR-RULES?"), SubLObjectFactory.makeKeyword("REFORMULATOR-RULES"), SubLObjectFactory.makeKeyword("SKIP-ASSERTIONS"), SubLObjectFactory.makeKeyword("SKIP-SENTENCES"), SubLObjectFactory.makeKeyword("META-PREDICATES"), SubLObjectFactory.makeKeyword("PRECONDITION-CHECKING"), SubLObjectFactory.makeKeyword("SEARCH-STRATEGY"), SubLObjectFactory.makeKeyword("FOCUS"), SubLObjectFactory.makeKeyword("IGNORE-RL-MODULES"), SubLObjectFactory.makeKeyword("APPLY-FIRST-RECURSIVELY"), SubLObjectFactory.makeKeyword("ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY?"), SubLObjectFactory.makeKeyword("CLEAR-CACHES?"), SubLObjectFactory.makeKeyword("REFORMULATE-ATOMS?"), SubLObjectFactory.makeKeyword("MAX-TIME") });
        $str42$Found_an_invalid_setting___s___ig = SubLObjectFactory.makeString("Found an invalid setting: ~s - ignoring it~%");
        $kw43$REFORMULATE_SUBFORMULAS_ = SubLObjectFactory.makeKeyword("REFORMULATE-SUBFORMULAS?");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE"));
        $kw45$RECURSION_LIMIT = SubLObjectFactory.makeKeyword("RECURSION-LIMIT");
        $kw46$MODES = SubLObjectFactory.makeKeyword("MODES");
        $sym47$ALL_KB_REFORMULATOR_MODES = SubLObjectFactory.makeSymbol("ALL-KB-REFORMULATOR-MODES");
        $const48$ReformulatorMode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorMode"));
        $sym49$_ALL_KB_REFORMULATOR_MODES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ALL-KB-REFORMULATOR-MODES-CACHING-STATE*");
        $str50$Found_invalid_reformulation_mode_ = SubLObjectFactory.makeString("Found invalid reformulation mode ~s within reformulation mode precedence list ~s - ignoring the invalid mode");
        $kw51$WFF_ENFORCEMENT = SubLObjectFactory.makeKeyword("WFF-ENFORCEMENT");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"));
        $kw53$USE_KB_REFORMULATOR_RULES_ = SubLObjectFactory.makeKeyword("USE-KB-REFORMULATOR-RULES?");
        $kw54$REFORMULATOR_RULES = SubLObjectFactory.makeKeyword("REFORMULATOR-RULES");
        $str55$Found_invalid_reformulator_rule__ = SubLObjectFactory.makeString("Found invalid reformulator rule ~s among the rules explicitly specified - ignoring it");
        $str56$Expected_a_list_of_reformulator_r = SubLObjectFactory.makeString("Expected a list of reformulator rules, got ~s");
        $kw57$SKIP_ASSERTIONS = SubLObjectFactory.makeKeyword("SKIP-ASSERTIONS");
        $kw58$SKIP_SENTENCES = SubLObjectFactory.makeKeyword("SKIP-SENTENCES");
        $str59$Found_invalid_reformulator_rule_a = SubLObjectFactory.makeString("Found invalid reformulator rule assertion ~s among the assertions explicitly specified to be skipped -- ignoring it");
        $str60$Found_sentence_to_skip__s_which_d = SubLObjectFactory.makeString("Found sentence to skip ~s which did not correspond to a CycL assertion visible in mt ~s -- ignoring it~%");
        $kw61$META_PREDICATES = SubLObjectFactory.makeKeyword("META-PREDICATES");
        $const62$UnaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnaryPredicate"));
        $str63$Found_a_reformulator_meta_predica = SubLObjectFactory.makeString("Found a reformulator meta-predicate ~s which is not a unary predicate in mt ~s -- ignoring it~%");
        $kw64$PRECONDITION_CHECKING = SubLObjectFactory.makeKeyword("PRECONDITION-CHECKING");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ONLY-ASK"));
        $kw66$SEARCH_STRATEGY = SubLObjectFactory.makeKeyword("SEARCH-STRATEGY");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-SEARCH"));
        $kw68$FOCUS = SubLObjectFactory.makeKeyword("FOCUS");
        $str69$Found_invalid_reformulation_focus = SubLObjectFactory.makeString("Found invalid reformulation focus ~s - ignoring it");
        $kw70$IGNORE_RL_MODULES = SubLObjectFactory.makeKeyword("IGNORE-RL-MODULES");
        $str71$Found_invalid__ignore_rl_modules_ = SubLObjectFactory.makeString("Found invalid :ignore-rl-modules setting ~s - ignoring it");
        $kw72$APPLY_FIRST_RECURSIVELY = SubLObjectFactory.makeKeyword("APPLY-FIRST-RECURSIVELY");
        $str73$Found_invalid__apply_first_recurs = SubLObjectFactory.makeString("Found invalid :apply-first-recursively setting ~s - ignoring it");
        $kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_ = SubLObjectFactory.makeKeyword("ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY?");
        $kw75$CLEAR_CACHES_ = SubLObjectFactory.makeKeyword("CLEAR-CACHES?");
        $kw76$REFORMULATE_ATOMS_ = SubLObjectFactory.makeKeyword("REFORMULATE-ATOMS?");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE"), (SubLObject)SubLObjectFactory.makeKeyword("UNLESS-REWRITE-OF"));
        $kw78$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw79$COMPUTE_DEFAULT = SubLObjectFactory.makeKeyword("COMPUTE-DEFAULT");
        $str80$Found_invalid_value__s_for_settin = SubLObjectFactory.makeString("Found invalid value ~s for setting ~s - using the default value ~s instead~%");
        $kw81$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw82$KB = SubLObjectFactory.makeKeyword("KB");
        $kw83$REMOVAL_ONLY_ASK = SubLObjectFactory.makeKeyword("REMOVAL-ONLY-ASK");
        $kw84$NO_SEARCH = SubLObjectFactory.makeKeyword("NO-SEARCH");
        $kw85$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $str86$Tried_to_get_an_undefined_default = SubLObjectFactory.makeString("Tried to get an undefined default for setting ~s");
        $sym87$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const88$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const89$ReformulatorIrrelevantFORT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorIrrelevantFORT"));
        $const90$ReformulatorDirectivePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorDirectivePredicate"));
        $const91$CycLReformulationRulePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLReformulationRulePredicate"));
        $const92$reformulatorRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorRule"));
        $sym93$GENL_MT_ = SubLObjectFactory.makeSymbol("GENL-MT?");
        $sym94$SECOND = SubLObjectFactory.makeSymbol("SECOND");
    }
}

/*

	Total time: 316 ms
	
*/