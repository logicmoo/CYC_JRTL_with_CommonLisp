package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.noun_compound_parser;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.rbp_rule_bank;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_ncr_constraints extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "0ea956e5ff688f5585061f1c6a0b4357c99d41af6570db53de7ae2a3a1cf34de";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 18700L)
    private static SubLSymbol $excluded_nc_rules$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 19300L)
    private static SubLSymbol $basic_nc_rule_count$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 19900L)
    private static SubLSymbol $derived_nc_rule_count$;
    private static SubLObject $$satisfiesHeadSyntacticConstraints;
    private static SubLSymbol $REMOVAL_LOOKUP_POS;
    private static SubLSymbol $NCR_NODE_SATISFIES_HEAD_SYN_POS_UNIFY_ARG2;
    private static SubLList $list3;
    private static SubLSymbol $NCR_NODE_SATISFIES_HEAD_SYN_POS_CHECK;
    private static SubLList $list5;
    private static SubLObject $$satisfiesHeadSemanticConstraintsF;
    private static SubLSymbol $NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG2;
    private static SubLList $list8;
    private static SubLSymbol $NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG_3;
    private static SubLList $list10;
    private static SubLSymbol $NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARGS_2_AND_3;
    private static SubLList $list12;
    private static SubLSymbol $NCR_NODE_SATISFIES_HEAD_SEM_POS_CHECK;
    private static SubLList $list14;
    private static SubLObject $$satisfiesModifierSyntacticConstra;
    private static SubLSymbol $NCR_NODE_SATISFIES_MOD_SYN_POS_UNIFY_ARG2;
    private static SubLList $list17;
    private static SubLSymbol $NCR_NODE_SATISFIES_MOD_SYN_POS_CHECK;
    private static SubLList $list19;
    private static SubLObject $$satisfiesModifierSemanticConstrai;
    private static SubLSymbol $NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG2;
    private static SubLList $list22;
    private static SubLSymbol $NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG_3;
    private static SubLList $list24;
    private static SubLSymbol $NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARGS_2_AND_3;
    private static SubLList $list26;
    private static SubLSymbol $NCR_NODE_SATISFIES_MOD_SEM_POS_CHECK;
    private static SubLList $list28;
    private static SubLSymbol $NCR_NODE_SATISFIES_HEAD_SYN_REQUIRE_ARG1_FULLY_BOUND;
    private static SubLList $list30;
    private static SubLSymbol $NCR_NODE_SATISFIES_HEAD_SEM_REQUIRE_ARG1_FULLY_BOUND;
    private static SubLList $list32;
    private static SubLSymbol $NCR_NODE_SATISFIES_MOD_SYN_REQUIRE_ARG1_FULLY_BOUND;
    private static SubLList $list34;
    private static SubLSymbol $NCR_NODE_SATISFIES_MOD_SEM_REQUIRE_ARG1_FULLY_BOUND;
    private static SubLList $list36;
    private static SubLSymbol $ALL;
    private static SubLObject $$InferencePSC;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLObject $$wordForms;
    private static SubLSymbol $sym41$_WU;
    private static SubLSymbol $sym42$__POS_PRED;
    private static SubLSymbol $sym43$_RULE;
    private static SubLList $list44;
    private static SubLList $list45;
    private static SubLList $list46;
    private static SubLSymbol $HEAD;
    private static SubLSymbol $SYNTACTIC;
    private static SubLSymbol $MODIFIER;
    private static SubLSymbol $SEMANTIC;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 14900L)
    public static SubLObject check_potential_ncr_for_node(SubLObject rule_cycl, SubLObject node, SubLObject o_type, SubLObject given_denot, SubLObject mode, SubLObject traced_rules) {
        if (given_denot == UNPROVIDED) {
            given_denot = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl_w_initialized_rb(rule_cycl);
        SubLObject results = NIL;
        if (NIL != rule) {
            results = get_potential_ncrs_for_node_w_denot(node, o_type, given_denot, list(rule), mode, traced_rules);
        }
        return subl_promotions.memberP(rule_cycl, results, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 15400L)
    public static SubLObject get_potential_ncrs_for_node(SubLObject node, SubLObject o_type, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == UNPROVIDED) {
            rule_list = $ALL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
        SubLObject mt = (NIL != content_mt) ? content_mt : $$InferencePSC;
        SubLObject paired_results = NIL;
        SubLObject denot_list = parsing_utilities.syntactic_node_proposed_meanings(node, mt, UNPROVIDED);
        SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        try {
            parsing_vars.$parse_tree_mt$.bind(mt, thread);
            SubLObject cdolist_list_var = denot_list;
            SubLObject denot = NIL;
            denot = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1;
                SubLObject results = cdolist_list_var_$1 = get_potential_ncrs_for_node_w_denot_int(node, o_type, denot, rule_list, mode, traced_rules);
                SubLObject rule = NIL;
                rule = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    paired_results = cons(list(denot, rule), paired_results);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    rule = cdolist_list_var_$1.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                denot = cdolist_list_var.first();
            }
        } finally {
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
        }
        return paired_results;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 16000L)
    public static SubLObject get_potential_ncrs_for_node_w_denot(SubLObject node, SubLObject o_type, SubLObject given_denot, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == UNPROVIDED) {
            rule_list = $ALL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
        SubLObject mt = (NIL != content_mt) ? content_mt : $$InferencePSC;
        SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        try {
            parsing_vars.$parse_tree_mt$.bind(mt, thread);
            ans = get_potential_ncrs_for_node_w_denot_int(node, o_type, given_denot, rule_list, mode, traced_rules);
        } finally {
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 16400L)
    public static SubLObject get_potential_denots_for_node_w_rule(SubLObject node, SubLObject o_type, SubLObject rule_cycl, SubLObject mode, SubLObject traced_rules) {
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject pair_list = NIL;
        SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
        SubLObject mt = (NIL != content_mt) ? content_mt : $$InferencePSC;
        SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl_w_initialized_rb(rule_cycl);
        if (NIL != rule) {
            SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
            try {
                parsing_vars.$parse_tree_mt$.bind(mt, thread);
                pair_list = get_potential_ncrs_for_node(node, o_type, list(rule), mode, traced_rules);
            } finally {
                parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var = pair_list;
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(pair.first(), ans);
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
        }
        return ans;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 17000L)
    public static SubLObject get_potential_ncrs_for_node_w_denot_int(SubLObject node, SubLObject o_type, SubLObject given_denot, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == UNPROVIDED) {
            rule_list = $ALL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject blocks = get_blocks_for_node_w_denot(node, given_denot, UNPROVIDED);
        SubLObject results = NIL;
        if ($excluded_nc_rules$.getDynamicValue(thread).equal($UNINITIALIZED)) {
            get_excluded_nc_rules();
        }
        SubLObject cdolist_list_var = blocks;
        SubLObject block = NIL;
        block = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject rules = noun_compound_parser.inference_rbp_rb_search(block, o_type, rule_list, mode, traced_rules);
            if (NIL != rules) {
                SubLObject cdolist_list_var_$2 = rules;
                SubLObject rule = NIL;
                rule = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    SubLObject rule_cycl = rbp_rule_bank.rbp_find_cycl_from_rule(rule);
                    if (NIL == subl_promotions.memberP(rule_cycl, $excluded_nc_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        results = list_utilities.adjoin_to_end(rule_cycl, results, UNPROVIDED);
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    rule = cdolist_list_var_$2.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            block = cdolist_list_var.first();
        }
        return results;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 17700L)
    public static SubLObject get_blocks_for_node_w_denot(SubLObject node, SubLObject denot, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        SubLObject string = parsing_utilities.syntactic_node_string(node);
        SubLObject index_1 = parsing_utilities.syntactic_node_start_offset(node);
        SubLObject index_2 = Numbers.add(index_1, Sequences.length(string));
        SubLObject pos = parsing_utilities.syntactic_node_category(node);
        SubLObject pos_pred = parsing_utilities.syntactic_node_agreement_pred(node);
        SubLObject new_blocks = get_blocks_from_node_info(string, denot, index_1, index_2, pos, pos_pred, mt);
        return new_blocks;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 18100L)
    public static SubLObject get_blocks_from_node_info(SubLObject string, SubLObject denot, SubLObject index_1, SubLObject index_2, SubLObject pos, SubLObject pos_pred, SubLObject mt) {
        SubLObject query_sentence = (NIL != pos_pred) ? list($$wordForms, $sym41$_WU, pos_pred, string) : list($$wordForms, $sym41$_WU, $sym42$__POS_PRED, string);
        SubLObject word_units = ask_utilities.query_variable($sym41$_WU, query_sentence, mt, UNPROVIDED);
        SubLObject new_blocks = NIL;
        if (NIL != list_utilities.empty_list_p(word_units)) {
            word_units = cons(NIL, word_units);
        }
        SubLObject cdolist_list_var = word_units;
        SubLObject wu = NIL;
        wu = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_block = noun_compound_parser.inference_new_noun_compound_block(index_1, index_2, ONE_INTEGER, string, wu, NIL, denot, pos, pos_pred, NIL);
            new_blocks = cons(new_block, new_blocks);
            cdolist_list_var = cdolist_list_var.rest();
            wu = cdolist_list_var.first();
        }
        return new_blocks;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 19000L)
    public static SubLObject get_excluded_nc_rules() {
        SubLObject rules = ask_utilities.query_variable($sym43$_RULE, $list44, $$InferencePSC, UNPROVIDED);
        $excluded_nc_rules$.setDynamicValue(rules);
        return T;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 19400L)
    public static SubLObject get_basic_nc_rule_count() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ($basic_nc_rule_count$.getDynamicValue(thread).equal($UNINITIALIZED)) {
            set_basic_nc_rule_count();
        }
        return $basic_nc_rule_count$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 19600L)
    public static SubLObject set_basic_nc_rule_count() {
        SubLObject rule_count = Sequences.length(ask_utilities.query_variable($sym43$_RULE, $list45, $$InferencePSC, UNPROVIDED));
        SubLObject derived_rule_count = get_derived_nc_rule_count();
        SubLObject basic_rule_count = Numbers.subtract(rule_count, derived_rule_count);
        $basic_nc_rule_count$.setDynamicValue(basic_rule_count);
        return T;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 20000L)
    public static SubLObject get_derived_nc_rule_count() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ($derived_nc_rule_count$.getDynamicValue(thread).equal($UNINITIALIZED)) {
            set_derived_nc_rule_count();
        }
        return $derived_nc_rule_count$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 20100L)
    public static SubLObject set_derived_nc_rule_count() {
        SubLObject derived_rule_count = Sequences.length(ask_utilities.query_variable($sym43$_RULE, $list46, $$InferencePSC, UNPROVIDED));
        $derived_nc_rule_count$.setDynamicValue(derived_rule_count);
        return T;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 20400L)
    public static SubLObject nc_parse_verify_general(SubLObject asent, SubLObject mt) {
        SubLObject pred = cycl_utilities.formula_arg0(asent);
        SubLObject node = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        SubLObject rule = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        SubLObject pcase_var = pred;
        if (pcase_var.eql($$satisfiesHeadSyntacticConstraints)) {
            return check_potential_ncr_for_node(rule, node, $HEAD, NIL, $SYNTACTIC, UNPROVIDED);
        }
        if (pcase_var.eql($$satisfiesModifierSyntacticConstra)) {
            return check_potential_ncr_for_node(rule, node, $MODIFIER, NIL, $SYNTACTIC, UNPROVIDED);
        }
        if (pcase_var.eql($$satisfiesHeadSemanticConstraintsF)) {
            SubLObject denot = cycl_utilities.formula_arg3(asent, UNPROVIDED);
            return check_potential_ncr_for_node(rule, node, $HEAD, denot, $SEMANTIC, UNPROVIDED);
        }
        if (pcase_var.eql($$satisfiesModifierSemanticConstrai)) {
            SubLObject denot = cycl_utilities.formula_arg3(asent, UNPROVIDED);
            return check_potential_ncr_for_node(rule, node, $MODIFIER, denot, $SEMANTIC, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 21300L)
    public static SubLObject nc_parse_justify_general(SubLObject asent, SubLObject mt) {
        SubLObject supports = NIL;
        return supports;
    }

    public static SubLObject declare_removal_modules_ncr_constraints_file() {
        declareFunction("check_potential_ncr_for_node", "CHECK-POTENTIAL-NCR-FOR-NODE", 3, 3, false);
        declareFunction("get_potential_ncrs_for_node", "GET-POTENTIAL-NCRS-FOR-NODE", 2, 3, false);
        declareFunction("get_potential_ncrs_for_node_w_denot", "GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT", 3, 3, false);
        declareFunction("get_potential_denots_for_node_w_rule", "GET-POTENTIAL-DENOTS-FOR-NODE-W-RULE", 3, 2, false);
        declareFunction("get_potential_ncrs_for_node_w_denot_int", "GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT-INT", 3, 3, false);
        declareFunction("get_blocks_for_node_w_denot", "GET-BLOCKS-FOR-NODE-W-DENOT", 2, 1, false);
        declareFunction("get_blocks_from_node_info", "GET-BLOCKS-FROM-NODE-INFO", 7, 0, false);
        declareFunction("get_excluded_nc_rules", "GET-EXCLUDED-NC-RULES", 0, 0, false);
        declareFunction("get_basic_nc_rule_count", "GET-BASIC-NC-RULE-COUNT", 0, 0, false);
        declareFunction("set_basic_nc_rule_count", "SET-BASIC-NC-RULE-COUNT", 0, 0, false);
        declareFunction("get_derived_nc_rule_count", "GET-DERIVED-NC-RULE-COUNT", 0, 0, false);
        declareFunction("set_derived_nc_rule_count", "SET-DERIVED-NC-RULE-COUNT", 0, 0, false);
        declareFunction("nc_parse_verify_general", "NC-PARSE-VERIFY-GENERAL", 2, 0, false);
        declareFunction("nc_parse_justify_general", "NC-PARSE-JUSTIFY-GENERAL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_ncr_constraints_file() {
        $excluded_nc_rules$ = defparameter("*EXCLUDED-NC-RULES*", $UNINITIALIZED);
        $basic_nc_rule_count$ = defparameter("*BASIC-NC-RULE-COUNT*", $UNINITIALIZED);
        $derived_nc_rule_count$ = defparameter("*DERIVED-NC-RULE-COUNT*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_removal_modules_ncr_constraints_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$satisfiesHeadSyntacticConstraints);
        inference_modules.inference_removal_module_use_generic($$satisfiesHeadSyntacticConstraints, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SYN_POS_UNIFY_ARG2, $list3);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SYN_POS_CHECK, $list5);
        inference_modules.register_solely_specific_removal_module_predicate($$satisfiesHeadSemanticConstraintsF);
        inference_modules.inference_removal_module_use_generic($$satisfiesHeadSemanticConstraintsF, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG2, $list8);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG_3, $list10);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARGS_2_AND_3, $list12);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SEM_POS_CHECK, $list14);
        inference_modules.register_solely_specific_removal_module_predicate($$satisfiesModifierSyntacticConstra);
        inference_modules.inference_removal_module_use_generic($$satisfiesModifierSyntacticConstra, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SYN_POS_UNIFY_ARG2, $list17);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SYN_POS_CHECK, $list19);
        inference_modules.register_solely_specific_removal_module_predicate($$satisfiesModifierSemanticConstrai);
        inference_modules.inference_removal_module_use_generic($$satisfiesModifierSemanticConstrai, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG2, $list22);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG_3, $list24);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARGS_2_AND_3, $list26);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SEM_POS_CHECK, $list28);
        preference_modules.inference_preference_module($NCR_NODE_SATISFIES_HEAD_SYN_REQUIRE_ARG1_FULLY_BOUND, $list30);
        preference_modules.inference_preference_module($NCR_NODE_SATISFIES_HEAD_SEM_REQUIRE_ARG1_FULLY_BOUND, $list32);
        preference_modules.inference_preference_module($NCR_NODE_SATISFIES_MOD_SYN_REQUIRE_ARG1_FULLY_BOUND, $list34);
        preference_modules.inference_preference_module($NCR_NODE_SATISFIES_MOD_SEM_REQUIRE_ARG1_FULLY_BOUND, $list36);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_ncr_constraints_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_ncr_constraints_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_ncr_constraints_file();
    }

    static {
        me = new removal_modules_ncr_constraints();
        $excluded_nc_rules$ = null;
        $basic_nc_rule_count$ = null;
        $derived_nc_rule_count$ = null;
        $$satisfiesHeadSyntacticConstraints = makeConstSym(("satisfiesHeadSyntacticConstraintsForNCR"));
        $REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");
        $NCR_NODE_SATISFIES_HEAD_SYN_POS_UNIFY_ARG2 = makeKeyword("NCR-NODE-SATISFIES-HEAD-SYN-POS-UNIFY-ARG2");
        $list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesHeadSyntacticConstraintsForNCR")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("satisfiesHeadSyntacticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-BASIC-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesHeadSyntacticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("HEAD"), NIL, makeKeyword("ALL"), makeKeyword("SYNTACTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("satisfiesHeadSyntacticConstraintsForNCR")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"),
                makeString("(#$satisfiesHeadSyntacticConstraintsForNCR <node> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSyntacticConstraintsForNCR #$LinkageLexicalNode-443 ?NCRULE)") });
        $NCR_NODE_SATISFIES_HEAD_SYN_POS_CHECK = makeKeyword("NCR-NODE-SATISFIES-HEAD-SYN-POS-CHECK");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesHeadSyntacticConstraintsForNCR")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("satisfiesHeadSyntacticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesHeadSyntacticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), list(makeKeyword("BIND"), makeSymbol("RULE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("HEAD"), NIL, makeKeyword("SYNTACTIC")),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSyntacticConstraintsForNCR <node> <rule>)"), makeKeyword("EXAMPLE"),
                makeString("(#$satisfiesHeadSyntacticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR)") });
        $$satisfiesHeadSemanticConstraintsF = makeConstSym(("satisfiesHeadSemanticConstraintsForNCR"));
        $NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG2 = makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-UNIFY-ARG2");
        $list8 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-DERIVED-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DENOT"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("HEAD"), list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("ALL"), makeKeyword("SEMANTIC")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DENOT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"),
                makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <not-fully-bound> <denot>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443  ?RULE #$StormAsEvent)") });
        $NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG_3 = makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-UNIFY-ARG-3");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), TWO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), list(makeKeyword("BIND"), makeSymbol("RULE")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-POTENTIAL-DENOTS-FOR-NODE-W-RULE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("HEAD"), list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("SEMANTIC")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"),
                makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <rule> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR ?DENOT)") });
        $NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARGS_2_AND_3 = makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-UNIFY-ARGS-2-AND-3");
        $list12 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), makeKeyword("REQUIRED-PATTERN"),
                        list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("*"), TWO_INTEGER, list(makeSymbol("GET-DERIVED-NC-RULE-COUNT"))),
                        makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))),
                        makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("HEAD"), makeKeyword("ALL"), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                        list(makeKeyword("TUPLE"), list(makeSymbol("DENOT"), makeSymbol("RULE")),
                                list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))),
                        makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <not-fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"),
                        makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443  ?NCRULE ?DENOT)") });
        $NCR_NODE_SATISFIES_HEAD_SEM_POS_CHECK = makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-CHECK");
        $list14 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), list(makeKeyword("BIND"), makeSymbol("RULE")), list(makeKeyword("BIND"), makeSymbol("DENOT"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("HEAD"), list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("SEMANTIC")),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <rule> <denot>)"), makeKeyword("EXAMPLE"),
                makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR #$StormAsEvent)") });
        $$satisfiesModifierSyntacticConstra = makeConstSym(("satisfiesModifierSyntacticConstraintsForNCR"));
        $NCR_NODE_SATISFIES_MOD_SYN_POS_UNIFY_ARG2 = makeKeyword("NCR-NODE-SATISFIES-MOD-SYN-POS-UNIFY-ARG2");
        $list17 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesModifierSyntacticConstraintsForNCR")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("satisfiesModifierSyntacticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-DERIVED-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesModifierSyntacticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), NIL, makeKeyword("ALL"), makeKeyword("SYNTACTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("satisfiesModifierSyntacticConstraintsForNCR")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"),
                makeString("(#$satisfiesModifierSyntacticConstraintsForNCR <node> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSyntacticConstraintsForNCR #$LinkageLexicalNode-34  ?NCRULE)") });
        $NCR_NODE_SATISFIES_MOD_SYN_POS_CHECK = makeKeyword("NCR-NODE-SATISFIES-MOD-SYN-POS-CHECK");
        $list19 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesModifierSyntacticConstraintsForNCR")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("satisfiesModifierSyntacticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesModifierSyntacticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), list(makeKeyword("BIND"), makeSymbol("RULE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), NIL, makeKeyword("SYNTACTIC")),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSyntacticConstraintsForNCR <node> <rule>)"), makeKeyword("EXAMPLE"),
                makeString("(#$satisfiesModifierSyntacticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR)") });
        $$satisfiesModifierSemanticConstrai = makeConstSym(("satisfiesModifierSemanticConstraintsForNCR"));
        $NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG2 = makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-UNIFY-ARG2");
        $list22 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-DERIVED-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DENOT"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("ALL"), makeKeyword("SEMANTIC")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DENOT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"),
                makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <not-fully-bound> <denot>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 ?NCRULE #$CalendarSummer)") });
        $NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG_3 = makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-UNIFY-ARG-3");
        $list24 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), TWO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), list(makeKeyword("BIND"), makeSymbol("RULE")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-POTENTIAL-DENOTS-FOR-NODE-W-RULE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("SEMANTIC")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"),
                makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <rule> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR ?DENOT)") });
        $NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARGS_2_AND_3 = makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-UNIFY-ARGS-2-AND-3");
        $list26 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("*"), TWO_INTEGER, list(makeSymbol("GET-DERIVED-NC-RULE-COUNT"))),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), makeKeyword("ALL"), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("DENOT"), makeSymbol("RULE")),
                        list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <not-fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 ?NCRULE ?DENOT)") });
        $NCR_NODE_SATISFIES_MOD_SEM_POS_CHECK = makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-CHECK");
        $list28 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), list(makeKeyword("BIND"), makeSymbol("NODE")), list(makeKeyword("BIND"), makeSymbol("RULE")), list(makeKeyword("BIND"), makeSymbol("DENOT"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("SEMANTIC")),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <rule> <denot>)"), makeKeyword("EXAMPLE"),
                makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR #$CalendarSummer)") });
        $NCR_NODE_SATISFIES_HEAD_SYN_REQUIRE_ARG1_FULLY_BOUND = makeKeyword("NCR-NODE-SATISFIES-HEAD-SYN-REQUIRE-ARG1-FULLY-BOUND");
        $list30 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("satisfiesHeadSyntacticConstraintsForNCR")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
        $NCR_NODE_SATISFIES_HEAD_SEM_REQUIRE_ARG1_FULLY_BOUND = makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-REQUIRE-ARG1-FULLY-BOUND");
        $list32 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("satisfiesHeadSemanticConstraintsForNCR")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("DISALLOWED"));
        $NCR_NODE_SATISFIES_MOD_SYN_REQUIRE_ARG1_FULLY_BOUND = makeKeyword("NCR-NODE-SATISFIES-MOD-SYN-REQUIRE-ARG1-FULLY-BOUND");
        $list34 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("satisfiesModifierSyntacticConstraintsForNCR")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
        $NCR_NODE_SATISFIES_MOD_SEM_REQUIRE_ARG1_FULLY_BOUND = makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-REQUIRE-ARG1-FULLY-BOUND");
        $list36 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("satisfiesModifierSemanticConstraintsForNCR")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("DISALLOWED"));
        $ALL = makeKeyword("ALL");
        $$InferencePSC = makeConstSym(("InferencePSC"));
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $$wordForms = makeConstSym(("wordForms"));
        $sym41$_WU = makeSymbol("?WU");
        $sym42$__POS_PRED = makeSymbol("??POS-PRED");
        $sym43$_RULE = makeSymbol("?RULE");
        $list44 = list(makeConstSym(("thereExists")), makeSymbol("?TERM"), list(makeConstSym(("thereExists")), makeSymbol("?CONSTR"), list(makeConstSym(("and")), list(makeConstSym(("ncRuleConstraint")), makeSymbol("?RULE"), makeSymbol("?CONSTR")),
                list(makeConstSym(("argN")), makeSymbol("?TERM"), TWO_INTEGER, makeSymbol("?CONSTR")), list(makeConstSym(("isa")), makeSymbol("?TERM"), makeConstSym(("NounCompoundRuleIndexicalTerm-Direct"))))));
        $list45 = list(makeConstSym(("isa")), makeSymbol("?RULE"), makeConstSym(("NounCompoundRule")));
        $list46 = list(makeConstSym(("isa")), makeSymbol("?RULE"), makeConstSym(("DerivedNounCompoundRule")));
        $HEAD = makeKeyword("HEAD");
        $SYNTACTIC = makeKeyword("SYNTACTIC");
        $MODIFIER = makeKeyword("MODIFIER");
        $SEMANTIC = makeKeyword("SEMANTIC");
    }
}
/*
 *
 * Total time: 166 ms
 *
 */