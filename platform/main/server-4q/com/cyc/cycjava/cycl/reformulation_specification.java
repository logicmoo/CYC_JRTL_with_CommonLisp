package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.reformulation_specification;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.reformulation_specification.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class reformulation_specification extends SubLTranslatedFile {
    public static final SubLFile me = new reformulation_specification();

    public static final String myName = "com.cyc.cycjava.cycl.reformulation_specification";

    public static final String myFingerPrint = "30f7776870a6b7fc2360256abb834da437f5929e6827fa8420146739b0c0dd28";

    private static final SubLObject $$ReformulationSpecification = reader_make_constant_shell(makeString("ReformulationSpecification"));



    public static final SubLSymbol VALID_REFORMULATOR_SETTING_KEYWORD_P = makeSymbol("VALID-REFORMULATOR-SETTING-KEYWORD-P");

    public static final SubLList $list3 = list(makeSymbol("?PRED"), makeSymbol("?POSITION"));

    private static final SubLObject $$useMetaPredicateInReformulation = reader_make_constant_shell(makeString("useMetaPredicateInReformulation"));



    public static final SubLSymbol $sym6$_ = makeSymbol("<");





    public static final SubLList $list9 = list(makeSymbol("?RULE"), makeSymbol("?POSITION"));

    private static final SubLObject $$useRuleInReformulation = reader_make_constant_shell(makeString("useRuleInReformulation"));

    private static final SubLSymbol $IGNORE_RL_MODULES = makeKeyword("IGNORE-RL-MODULES");

    public static final SubLList $list12 = list(makeSymbol("?MODULE"), makeSymbol("?POSITION"));

    private static final SubLObject $$ignoreModuleInReformulation = reader_make_constant_shell(makeString("ignoreModuleInReformulation"));

    public static SubLObject load_reformulation_specification_from_kb(final SubLObject refspec_id, final SubLObject mt) {
        SubLObject settings = NIL;
        if (NIL != isa.isaP(refspec_id, $$ReformulationSpecification, mt, UNPROVIDED)) {
            settings = load_refspec_behaviour_wrt_recursion(refspec_id, settings, mt);
            settings = load_refspec_caching(refspec_id, settings, mt);
            settings = load_refspec_modes(refspec_id, settings, mt);
            settings = load_refspec_precondition_checking(refspec_id, settings, mt);
            settings = load_refspec_reformulation_history(refspec_id, settings, mt);
            settings = load_refspec_reformulator_rules_to_use(refspec_id, settings, mt);
            settings = load_refspec_search_strategy(refspec_id, settings, mt);
            settings = load_refspec_use_of_rl_modules(refspec_id, settings, mt);
            settings = load_refspec_well_formedness_constraints_to_impose(refspec_id, settings, mt);
        }
        return settings;
    }

    public static SubLObject reformulate_cycl_via_specification(final SubLObject cycl, final SubLObject mt, final SubLObject refspec_id, SubLObject refspec_mt) {
        if (refspec_mt == UNPROVIDED) {
            refspec_mt = NIL;
        }
        if (NIL == refspec_mt) {
            refspec_mt = mt;
        }
        return reformulator_hub.reformulate_cycl(cycl, mt, load_reformulation_specification_from_kb(refspec_id, refspec_mt));
    }

    public static SubLObject load_refspec_behaviour_wrt_recursion(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt) {
        return settings;
    }

    public static SubLObject load_refspec_caching(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt) {
        return settings;
    }

    public static SubLObject load_refspec_modes(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt) {
        return settings;
    }

    public static SubLObject load_refspec_precondition_checking(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt) {
        return settings;
    }

    public static SubLObject load_refspec_reformulation_history(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt) {
        return settings;
    }

    public static SubLObject load_refspec_reformulator_rules_to_use(final SubLObject refspec_id, SubLObject settings, final SubLObject mt) {
        settings = load_refspec_explicit_reformulator_rules(refspec_id, settings, mt);
        settings = load_refspec_meta_predicates(refspec_id, settings, mt);
        return settings;
    }

    public static SubLObject load_refspec_meta_predicates(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt) {
        assert NIL != reformulator_datastructures.valid_reformulator_setting_keyword_p($META_PREDICATES) : "reformulator_datastructures.valid_reformulator_setting_keyword_p(reformulation_specification.$kw1$META_PREDICATES) " + "CommonSymbols.NIL != reformulator_datastructures.valid_reformulator_setting_keyword_p(reformulation_specification.$kw1$META_PREDICATES) " + $META_PREDICATES;
        final SubLObject predicate_specs = ask_utilities.ask_template($list3, listS($$useMetaPredicateInReformulation, refspec_id, $list3), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != predicate_specs ? putf(settings, $META_PREDICATES, Mapping.mapcar(symbol_function(FIRST), Sort.sort(predicate_specs, symbol_function($sym6$_), symbol_function(SECOND)))) : settings;
    }

    public static SubLObject load_refspec_explicit_reformulator_rules(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt) {
        assert NIL != reformulator_datastructures.valid_reformulator_setting_keyword_p($REFORMULATOR_RULES) : "reformulator_datastructures.valid_reformulator_setting_keyword_p(reformulation_specification.$kw8$REFORMULATOR_RULES) " + "CommonSymbols.NIL != reformulator_datastructures.valid_reformulator_setting_keyword_p(reformulation_specification.$kw8$REFORMULATOR_RULES) " + $REFORMULATOR_RULES;
        final SubLObject rule_specs = ask_utilities.ask_template($list9, listS($$useRuleInReformulation, refspec_id, $list9), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject rule_formula_specs = Sort.sort(rule_specs, symbol_function($sym6$_), symbol_function(SECOND));
        SubLObject reformulator_rules = NIL;
        SubLObject cdolist_list_var = rule_formula_specs;
        SubLObject rule_formula_spec = NIL;
        rule_formula_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rule_formula = rule_formula_spec.first();
            final SubLObject rule_assertion = czer_meta.find_assertion_cycl(rule_formula, mt);
            final SubLObject reformulator_rule = (NIL != assertion_handles.assertion_p(rule_assertion)) ? reformulator_datastructures.find_reformulator_rule_for_rule_assertion(rule_assertion) : NIL;
            if (NIL != reformulator_rule_unifier_datastructures.reformulator_rule_p(reformulator_rule)) {
                reformulator_rules = cons(reformulator_rule, reformulator_rules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule_formula_spec = cdolist_list_var.first();
        } 
        return NIL != reformulator_rules ? putf(settings, $REFORMULATOR_RULES, nreverse(reformulator_rules)) : settings;
    }

    public static SubLObject load_refspec_search_strategy(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt) {
        return settings;
    }

    public static SubLObject load_refspec_use_of_rl_modules(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt) {
        return settings;
    }

    public static SubLObject load_refspec_well_formedness_constraints_to_impose(final SubLObject refspec_id, SubLObject settings, final SubLObject mt) {
        settings = load_refspec_ignore_rl_modules(refspec_id, settings, mt);
        return settings;
    }

    public static SubLObject load_refspec_ignore_rl_modules(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt) {
        assert NIL != reformulator_datastructures.valid_reformulator_setting_keyword_p($IGNORE_RL_MODULES) : "reformulator_datastructures.valid_reformulator_setting_keyword_p(reformulation_specification.$kw11$IGNORE_RL_MODULES) " + "CommonSymbols.NIL != reformulator_datastructures.valid_reformulator_setting_keyword_p(reformulation_specification.$kw11$IGNORE_RL_MODULES) " + $IGNORE_RL_MODULES;
        final SubLObject module_specs = ask_utilities.ask_template($list12, listS($$ignoreModuleInReformulation, refspec_id, $list12), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != module_specs ? putf(settings, $IGNORE_RL_MODULES, Mapping.mapcar(symbol_function(FIRST), Sort.sort(module_specs, symbol_function($sym6$_), symbol_function(SECOND)))) : settings;
    }

    public static SubLObject declare_reformulation_specification_file() {
        declareFunction(me, "load_reformulation_specification_from_kb", "LOAD-REFORMULATION-SPECIFICATION-FROM-KB", 2, 0, false);
        declareFunction(me, "reformulate_cycl_via_specification", "REFORMULATE-CYCL-VIA-SPECIFICATION", 3, 1, false);
        declareFunction(me, "load_refspec_behaviour_wrt_recursion", "LOAD-REFSPEC-BEHAVIOUR-WRT-RECURSION", 3, 0, false);
        declareFunction(me, "load_refspec_caching", "LOAD-REFSPEC-CACHING", 3, 0, false);
        declareFunction(me, "load_refspec_modes", "LOAD-REFSPEC-MODES", 3, 0, false);
        declareFunction(me, "load_refspec_precondition_checking", "LOAD-REFSPEC-PRECONDITION-CHECKING", 3, 0, false);
        declareFunction(me, "load_refspec_reformulation_history", "LOAD-REFSPEC-REFORMULATION-HISTORY", 3, 0, false);
        declareFunction(me, "load_refspec_reformulator_rules_to_use", "LOAD-REFSPEC-REFORMULATOR-RULES-TO-USE", 3, 0, false);
        declareFunction(me, "load_refspec_meta_predicates", "LOAD-REFSPEC-META-PREDICATES", 3, 0, false);
        declareFunction(me, "load_refspec_explicit_reformulator_rules", "LOAD-REFSPEC-EXPLICIT-REFORMULATOR-RULES", 3, 0, false);
        declareFunction(me, "load_refspec_search_strategy", "LOAD-REFSPEC-SEARCH-STRATEGY", 3, 0, false);
        declareFunction(me, "load_refspec_use_of_rl_modules", "LOAD-REFSPEC-USE-OF-RL-MODULES", 3, 0, false);
        declareFunction(me, "load_refspec_well_formedness_constraints_to_impose", "LOAD-REFSPEC-WELL-FORMEDNESS-CONSTRAINTS-TO-IMPOSE", 3, 0, false);
        declareFunction(me, "load_refspec_ignore_rl_modules", "LOAD-REFSPEC-IGNORE-RL-MODULES", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulation_specification_file() {
        return NIL;
    }

    public static SubLObject setup_reformulation_specification_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulation_specification_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulation_specification_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulation_specification_file();
    }

    static {















    }
}

/**
 * Total time: 147 ms
 */
