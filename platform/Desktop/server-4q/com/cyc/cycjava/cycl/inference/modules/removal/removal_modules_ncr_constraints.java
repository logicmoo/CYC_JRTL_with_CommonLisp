package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.noun_compound_parser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.rbp_rule_bank;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_ncr_constraints extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints";
    public static final String myFingerPrint = "0ea956e5ff688f5585061f1c6a0b4357c99d41af6570db53de7ae2a3a1cf34de";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 18764L)
    private static SubLSymbol $excluded_nc_rules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 19394L)
    private static SubLSymbol $basic_nc_rule_count$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 19959L)
    private static SubLSymbol $derived_nc_rule_count$;
    private static final SubLObject $const0$satisfiesHeadSyntacticConstraints;
    private static final SubLSymbol $kw1$REMOVAL_LOOKUP_POS;
    private static final SubLSymbol $kw2$NCR_NODE_SATISFIES_HEAD_SYN_POS_UNIFY_ARG2;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$NCR_NODE_SATISFIES_HEAD_SYN_POS_CHECK;
    private static final SubLList $list5;
    private static final SubLObject $const6$satisfiesHeadSemanticConstraintsF;
    private static final SubLSymbol $kw7$NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG2;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG_3;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARGS_2_AND_3;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$NCR_NODE_SATISFIES_HEAD_SEM_POS_CHECK;
    private static final SubLList $list14;
    private static final SubLObject $const15$satisfiesModifierSyntacticConstra;
    private static final SubLSymbol $kw16$NCR_NODE_SATISFIES_MOD_SYN_POS_UNIFY_ARG2;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$NCR_NODE_SATISFIES_MOD_SYN_POS_CHECK;
    private static final SubLList $list19;
    private static final SubLObject $const20$satisfiesModifierSemanticConstrai;
    private static final SubLSymbol $kw21$NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG2;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG_3;
    private static final SubLList $list24;
    private static final SubLSymbol $kw25$NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARGS_2_AND_3;
    private static final SubLList $list26;
    private static final SubLSymbol $kw27$NCR_NODE_SATISFIES_MOD_SEM_POS_CHECK;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$NCR_NODE_SATISFIES_HEAD_SYN_REQUIRE_ARG1_FULLY_BOUND;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$NCR_NODE_SATISFIES_HEAD_SEM_REQUIRE_ARG1_FULLY_BOUND;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$NCR_NODE_SATISFIES_MOD_SYN_REQUIRE_ARG1_FULLY_BOUND;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$NCR_NODE_SATISFIES_MOD_SEM_REQUIRE_ARG1_FULLY_BOUND;
    private static final SubLList $list36;
    private static final SubLSymbol $kw37$ALL;
    private static final SubLObject $const38$InferencePSC;
    private static final SubLSymbol $kw39$UNINITIALIZED;
    private static final SubLObject $const40$wordForms;
    private static final SubLSymbol $sym41$_WU;
    private static final SubLSymbol $sym42$__POS_PRED;
    private static final SubLSymbol $sym43$_RULE;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLSymbol $kw47$HEAD;
    private static final SubLSymbol $kw48$SYNTACTIC;
    private static final SubLSymbol $kw49$MODIFIER;
    private static final SubLSymbol $kw50$SEMANTIC;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 14974L)
    public static SubLObject check_potential_ncr_for_node(final SubLObject rule_cycl, final SubLObject node, final SubLObject o_type, SubLObject given_denot, SubLObject mode, SubLObject traced_rules) {
        if (given_denot == removal_modules_ncr_constraints.UNPROVIDED) {
            given_denot = (SubLObject)removal_modules_ncr_constraints.NIL;
        }
        if (mode == removal_modules_ncr_constraints.UNPROVIDED) {
            mode = (SubLObject)removal_modules_ncr_constraints.$kw37$ALL;
        }
        if (traced_rules == removal_modules_ncr_constraints.UNPROVIDED) {
            traced_rules = (SubLObject)removal_modules_ncr_constraints.NIL;
        }
        final SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl_w_initialized_rb(rule_cycl);
        SubLObject results = (SubLObject)removal_modules_ncr_constraints.NIL;
        if (removal_modules_ncr_constraints.NIL != rule) {
            results = get_potential_ncrs_for_node_w_denot(node, o_type, given_denot, (SubLObject)ConsesLow.list(rule), mode, traced_rules);
        }
        return subl_promotions.memberP(rule_cycl, results, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 15424L)
    public static SubLObject get_potential_ncrs_for_node(final SubLObject node, final SubLObject o_type, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == removal_modules_ncr_constraints.UNPROVIDED) {
            rule_list = (SubLObject)removal_modules_ncr_constraints.$kw37$ALL;
        }
        if (mode == removal_modules_ncr_constraints.UNPROVIDED) {
            mode = (SubLObject)removal_modules_ncr_constraints.$kw37$ALL;
        }
        if (traced_rules == removal_modules_ncr_constraints.UNPROVIDED) {
            traced_rules = (SubLObject)removal_modules_ncr_constraints.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
        final SubLObject mt = (removal_modules_ncr_constraints.NIL != content_mt) ? content_mt : removal_modules_ncr_constraints.$const38$InferencePSC;
        SubLObject paired_results = (SubLObject)removal_modules_ncr_constraints.NIL;
        final SubLObject denot_list = parsing_utilities.syntactic_node_proposed_meanings(node, mt, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
        final SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        try {
            parsing_vars.$parse_tree_mt$.bind(mt, thread);
            SubLObject cdolist_list_var = denot_list;
            SubLObject denot = (SubLObject)removal_modules_ncr_constraints.NIL;
            denot = cdolist_list_var.first();
            while (removal_modules_ncr_constraints.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1;
                final SubLObject results = cdolist_list_var_$1 = get_potential_ncrs_for_node_w_denot_int(node, o_type, denot, rule_list, mode, traced_rules);
                SubLObject rule = (SubLObject)removal_modules_ncr_constraints.NIL;
                rule = cdolist_list_var_$1.first();
                while (removal_modules_ncr_constraints.NIL != cdolist_list_var_$1) {
                    paired_results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(denot, rule), paired_results);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    rule = cdolist_list_var_$1.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                denot = cdolist_list_var.first();
            }
        }
        finally {
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
        }
        return paired_results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 16032L)
    public static SubLObject get_potential_ncrs_for_node_w_denot(final SubLObject node, final SubLObject o_type, final SubLObject given_denot, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == removal_modules_ncr_constraints.UNPROVIDED) {
            rule_list = (SubLObject)removal_modules_ncr_constraints.$kw37$ALL;
        }
        if (mode == removal_modules_ncr_constraints.UNPROVIDED) {
            mode = (SubLObject)removal_modules_ncr_constraints.$kw37$ALL;
        }
        if (traced_rules == removal_modules_ncr_constraints.UNPROVIDED) {
            traced_rules = (SubLObject)removal_modules_ncr_constraints.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)removal_modules_ncr_constraints.NIL;
        final SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
        final SubLObject mt = (removal_modules_ncr_constraints.NIL != content_mt) ? content_mt : removal_modules_ncr_constraints.$const38$InferencePSC;
        final SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        try {
            parsing_vars.$parse_tree_mt$.bind(mt, thread);
            ans = get_potential_ncrs_for_node_w_denot_int(node, o_type, given_denot, rule_list, mode, traced_rules);
        }
        finally {
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 16460L)
    public static SubLObject get_potential_denots_for_node_w_rule(final SubLObject node, final SubLObject o_type, final SubLObject rule_cycl, SubLObject mode, SubLObject traced_rules) {
        if (mode == removal_modules_ncr_constraints.UNPROVIDED) {
            mode = (SubLObject)removal_modules_ncr_constraints.$kw37$ALL;
        }
        if (traced_rules == removal_modules_ncr_constraints.UNPROVIDED) {
            traced_rules = (SubLObject)removal_modules_ncr_constraints.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)removal_modules_ncr_constraints.NIL;
        SubLObject pair_list = (SubLObject)removal_modules_ncr_constraints.NIL;
        final SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
        final SubLObject mt = (removal_modules_ncr_constraints.NIL != content_mt) ? content_mt : removal_modules_ncr_constraints.$const38$InferencePSC;
        final SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl_w_initialized_rb(rule_cycl);
        if (removal_modules_ncr_constraints.NIL != rule) {
            final SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
            try {
                parsing_vars.$parse_tree_mt$.bind(mt, thread);
                pair_list = get_potential_ncrs_for_node(node, o_type, (SubLObject)ConsesLow.list(rule), mode, traced_rules);
            }
            finally {
                parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var = pair_list;
            SubLObject pair = (SubLObject)removal_modules_ncr_constraints.NIL;
            pair = cdolist_list_var.first();
            while (removal_modules_ncr_constraints.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(pair.first(), ans);
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 17003L)
    public static SubLObject get_potential_ncrs_for_node_w_denot_int(final SubLObject node, final SubLObject o_type, final SubLObject given_denot, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == removal_modules_ncr_constraints.UNPROVIDED) {
            rule_list = (SubLObject)removal_modules_ncr_constraints.$kw37$ALL;
        }
        if (mode == removal_modules_ncr_constraints.UNPROVIDED) {
            mode = (SubLObject)removal_modules_ncr_constraints.$kw37$ALL;
        }
        if (traced_rules == removal_modules_ncr_constraints.UNPROVIDED) {
            traced_rules = (SubLObject)removal_modules_ncr_constraints.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject blocks = get_blocks_for_node_w_denot(node, given_denot, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
        SubLObject results = (SubLObject)removal_modules_ncr_constraints.NIL;
        if (removal_modules_ncr_constraints.$excluded_nc_rules$.getDynamicValue(thread).equal((SubLObject)removal_modules_ncr_constraints.$kw39$UNINITIALIZED)) {
            get_excluded_nc_rules();
        }
        SubLObject cdolist_list_var = blocks;
        SubLObject block = (SubLObject)removal_modules_ncr_constraints.NIL;
        block = cdolist_list_var.first();
        while (removal_modules_ncr_constraints.NIL != cdolist_list_var) {
            final SubLObject rules = noun_compound_parser.inference_rbp_rb_search(block, o_type, rule_list, mode, traced_rules);
            if (removal_modules_ncr_constraints.NIL != rules) {
                SubLObject cdolist_list_var_$2 = rules;
                SubLObject rule = (SubLObject)removal_modules_ncr_constraints.NIL;
                rule = cdolist_list_var_$2.first();
                while (removal_modules_ncr_constraints.NIL != cdolist_list_var_$2) {
                    final SubLObject rule_cycl = rbp_rule_bank.rbp_find_cycl_from_rule(rule);
                    if (removal_modules_ncr_constraints.NIL == subl_promotions.memberP(rule_cycl, removal_modules_ncr_constraints.$excluded_nc_rules$.getDynamicValue(thread), (SubLObject)removal_modules_ncr_constraints.UNPROVIDED, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED)) {
                        results = list_utilities.adjoin_to_end(rule_cycl, results, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 17761L)
    public static SubLObject get_blocks_for_node_w_denot(final SubLObject node, final SubLObject denot, SubLObject mt) {
        if (mt == removal_modules_ncr_constraints.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        final SubLObject string = parsing_utilities.syntactic_node_string(node);
        final SubLObject index_1 = parsing_utilities.syntactic_node_start_offset(node);
        final SubLObject index_2 = Numbers.add(index_1, Sequences.length(string));
        final SubLObject pos = parsing_utilities.syntactic_node_category(node);
        final SubLObject pos_pred = parsing_utilities.syntactic_node_agreement_pred(node);
        final SubLObject new_blocks = get_blocks_from_node_info(string, denot, index_1, index_2, pos, pos_pred, mt);
        return new_blocks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 18191L)
    public static SubLObject get_blocks_from_node_info(final SubLObject string, final SubLObject denot, final SubLObject index_1, final SubLObject index_2, final SubLObject pos, final SubLObject pos_pred, final SubLObject mt) {
        final SubLObject query_sentence = (SubLObject)((removal_modules_ncr_constraints.NIL != pos_pred) ? ConsesLow.list(removal_modules_ncr_constraints.$const40$wordForms, (SubLObject)removal_modules_ncr_constraints.$sym41$_WU, pos_pred, string) : ConsesLow.list(removal_modules_ncr_constraints.$const40$wordForms, (SubLObject)removal_modules_ncr_constraints.$sym41$_WU, (SubLObject)removal_modules_ncr_constraints.$sym42$__POS_PRED, string));
        SubLObject word_units = ask_utilities.query_variable((SubLObject)removal_modules_ncr_constraints.$sym41$_WU, query_sentence, mt, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
        SubLObject new_blocks = (SubLObject)removal_modules_ncr_constraints.NIL;
        if (removal_modules_ncr_constraints.NIL != list_utilities.empty_list_p(word_units)) {
            word_units = (SubLObject)ConsesLow.cons((SubLObject)removal_modules_ncr_constraints.NIL, word_units);
        }
        SubLObject cdolist_list_var = word_units;
        SubLObject wu = (SubLObject)removal_modules_ncr_constraints.NIL;
        wu = cdolist_list_var.first();
        while (removal_modules_ncr_constraints.NIL != cdolist_list_var) {
            final SubLObject new_block = noun_compound_parser.inference_new_noun_compound_block(index_1, index_2, (SubLObject)removal_modules_ncr_constraints.ONE_INTEGER, string, wu, (SubLObject)removal_modules_ncr_constraints.NIL, denot, pos, pos_pred, (SubLObject)removal_modules_ncr_constraints.NIL);
            new_blocks = (SubLObject)ConsesLow.cons(new_block, new_blocks);
            cdolist_list_var = cdolist_list_var.rest();
            wu = cdolist_list_var.first();
        }
        return new_blocks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 19032L)
    public static SubLObject get_excluded_nc_rules() {
        final SubLObject rules = ask_utilities.query_variable((SubLObject)removal_modules_ncr_constraints.$sym43$_RULE, (SubLObject)removal_modules_ncr_constraints.$list44, removal_modules_ncr_constraints.$const38$InferencePSC, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
        removal_modules_ncr_constraints.$excluded_nc_rules$.setDynamicValue(rules);
        return (SubLObject)removal_modules_ncr_constraints.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 19476L)
    public static SubLObject get_basic_nc_rule_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_ncr_constraints.$basic_nc_rule_count$.getDynamicValue(thread).equal((SubLObject)removal_modules_ncr_constraints.$kw39$UNINITIALIZED)) {
            set_basic_nc_rule_count();
        }
        return removal_modules_ncr_constraints.$basic_nc_rule_count$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 19636L)
    public static SubLObject set_basic_nc_rule_count() {
        final SubLObject rule_count = Sequences.length(ask_utilities.query_variable((SubLObject)removal_modules_ncr_constraints.$sym43$_RULE, (SubLObject)removal_modules_ncr_constraints.$list45, removal_modules_ncr_constraints.$const38$InferencePSC, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED));
        final SubLObject derived_rule_count = get_derived_nc_rule_count();
        final SubLObject basic_rule_count = Numbers.subtract(rule_count, derived_rule_count);
        removal_modules_ncr_constraints.$basic_nc_rule_count$.setDynamicValue(basic_rule_count);
        return (SubLObject)removal_modules_ncr_constraints.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 20022L)
    public static SubLObject get_derived_nc_rule_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_ncr_constraints.$derived_nc_rule_count$.getDynamicValue(thread).equal((SubLObject)removal_modules_ncr_constraints.$kw39$UNINITIALIZED)) {
            set_derived_nc_rule_count();
        }
        return removal_modules_ncr_constraints.$derived_nc_rule_count$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 20190L)
    public static SubLObject set_derived_nc_rule_count() {
        final SubLObject derived_rule_count = Sequences.length(ask_utilities.query_variable((SubLObject)removal_modules_ncr_constraints.$sym43$_RULE, (SubLObject)removal_modules_ncr_constraints.$list46, removal_modules_ncr_constraints.$const38$InferencePSC, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED));
        removal_modules_ncr_constraints.$derived_nc_rule_count$.setDynamicValue(derived_rule_count);
        return (SubLObject)removal_modules_ncr_constraints.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 20423L)
    public static SubLObject nc_parse_verify_general(final SubLObject asent, final SubLObject mt) {
        final SubLObject pred = cycl_utilities.formula_arg0(asent);
        final SubLObject node = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
        final SubLObject rule = cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
        final SubLObject pcase_var = pred;
        if (pcase_var.eql(removal_modules_ncr_constraints.$const0$satisfiesHeadSyntacticConstraints)) {
            return check_potential_ncr_for_node(rule, node, (SubLObject)removal_modules_ncr_constraints.$kw47$HEAD, (SubLObject)removal_modules_ncr_constraints.NIL, (SubLObject)removal_modules_ncr_constraints.$kw48$SYNTACTIC, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
        }
        if (pcase_var.eql(removal_modules_ncr_constraints.$const15$satisfiesModifierSyntacticConstra)) {
            return check_potential_ncr_for_node(rule, node, (SubLObject)removal_modules_ncr_constraints.$kw49$MODIFIER, (SubLObject)removal_modules_ncr_constraints.NIL, (SubLObject)removal_modules_ncr_constraints.$kw48$SYNTACTIC, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
        }
        if (pcase_var.eql(removal_modules_ncr_constraints.$const6$satisfiesHeadSemanticConstraintsF)) {
            final SubLObject denot = cycl_utilities.formula_arg3(asent, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
            return check_potential_ncr_for_node(rule, node, (SubLObject)removal_modules_ncr_constraints.$kw47$HEAD, denot, (SubLObject)removal_modules_ncr_constraints.$kw50$SEMANTIC, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
        }
        if (pcase_var.eql(removal_modules_ncr_constraints.$const20$satisfiesModifierSemanticConstrai)) {
            final SubLObject denot = cycl_utilities.formula_arg3(asent, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
            return check_potential_ncr_for_node(rule, node, (SubLObject)removal_modules_ncr_constraints.$kw49$MODIFIER, denot, (SubLObject)removal_modules_ncr_constraints.$kw50$SEMANTIC, (SubLObject)removal_modules_ncr_constraints.UNPROVIDED);
        }
        return (SubLObject)removal_modules_ncr_constraints.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp", position = 21314L)
    public static SubLObject nc_parse_justify_general(final SubLObject asent, final SubLObject mt) {
        final SubLObject supports = (SubLObject)removal_modules_ncr_constraints.NIL;
        return supports;
    }
    
    public static SubLObject declare_removal_modules_ncr_constraints_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "check_potential_ncr_for_node", "CHECK-POTENTIAL-NCR-FOR-NODE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "get_potential_ncrs_for_node", "GET-POTENTIAL-NCRS-FOR-NODE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "get_potential_ncrs_for_node_w_denot", "GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "get_potential_denots_for_node_w_rule", "GET-POTENTIAL-DENOTS-FOR-NODE-W-RULE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "get_potential_ncrs_for_node_w_denot_int", "GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT-INT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "get_blocks_for_node_w_denot", "GET-BLOCKS-FOR-NODE-W-DENOT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "get_blocks_from_node_info", "GET-BLOCKS-FROM-NODE-INFO", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "get_excluded_nc_rules", "GET-EXCLUDED-NC-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "get_basic_nc_rule_count", "GET-BASIC-NC-RULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "set_basic_nc_rule_count", "SET-BASIC-NC-RULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "get_derived_nc_rule_count", "GET-DERIVED-NC-RULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "set_derived_nc_rule_count", "SET-DERIVED-NC-RULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "nc_parse_verify_general", "NC-PARSE-VERIFY-GENERAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints", "nc_parse_justify_general", "NC-PARSE-JUSTIFY-GENERAL", 2, 0, false);
        return (SubLObject)removal_modules_ncr_constraints.NIL;
    }
    
    public static SubLObject init_removal_modules_ncr_constraints_file() {
        removal_modules_ncr_constraints.$excluded_nc_rules$ = SubLFiles.defparameter("*EXCLUDED-NC-RULES*", (SubLObject)removal_modules_ncr_constraints.$kw39$UNINITIALIZED);
        removal_modules_ncr_constraints.$basic_nc_rule_count$ = SubLFiles.defparameter("*BASIC-NC-RULE-COUNT*", (SubLObject)removal_modules_ncr_constraints.$kw39$UNINITIALIZED);
        removal_modules_ncr_constraints.$derived_nc_rule_count$ = SubLFiles.defparameter("*DERIVED-NC-RULE-COUNT*", (SubLObject)removal_modules_ncr_constraints.$kw39$UNINITIALIZED);
        return (SubLObject)removal_modules_ncr_constraints.NIL;
    }
    
    public static SubLObject setup_removal_modules_ncr_constraints_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_ncr_constraints.$const0$satisfiesHeadSyntacticConstraints);
        inference_modules.inference_removal_module_use_generic(removal_modules_ncr_constraints.$const0$satisfiesHeadSyntacticConstraints, (SubLObject)removal_modules_ncr_constraints.$kw1$REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw2$NCR_NODE_SATISFIES_HEAD_SYN_POS_UNIFY_ARG2, (SubLObject)removal_modules_ncr_constraints.$list3);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw4$NCR_NODE_SATISFIES_HEAD_SYN_POS_CHECK, (SubLObject)removal_modules_ncr_constraints.$list5);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_ncr_constraints.$const6$satisfiesHeadSemanticConstraintsF);
        inference_modules.inference_removal_module_use_generic(removal_modules_ncr_constraints.$const6$satisfiesHeadSemanticConstraintsF, (SubLObject)removal_modules_ncr_constraints.$kw1$REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw7$NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG2, (SubLObject)removal_modules_ncr_constraints.$list8);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw9$NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG_3, (SubLObject)removal_modules_ncr_constraints.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw11$NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARGS_2_AND_3, (SubLObject)removal_modules_ncr_constraints.$list12);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw13$NCR_NODE_SATISFIES_HEAD_SEM_POS_CHECK, (SubLObject)removal_modules_ncr_constraints.$list14);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_ncr_constraints.$const15$satisfiesModifierSyntacticConstra);
        inference_modules.inference_removal_module_use_generic(removal_modules_ncr_constraints.$const15$satisfiesModifierSyntacticConstra, (SubLObject)removal_modules_ncr_constraints.$kw1$REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw16$NCR_NODE_SATISFIES_MOD_SYN_POS_UNIFY_ARG2, (SubLObject)removal_modules_ncr_constraints.$list17);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw18$NCR_NODE_SATISFIES_MOD_SYN_POS_CHECK, (SubLObject)removal_modules_ncr_constraints.$list19);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_ncr_constraints.$const20$satisfiesModifierSemanticConstrai);
        inference_modules.inference_removal_module_use_generic(removal_modules_ncr_constraints.$const20$satisfiesModifierSemanticConstrai, (SubLObject)removal_modules_ncr_constraints.$kw1$REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw21$NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG2, (SubLObject)removal_modules_ncr_constraints.$list22);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw23$NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG_3, (SubLObject)removal_modules_ncr_constraints.$list24);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw25$NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARGS_2_AND_3, (SubLObject)removal_modules_ncr_constraints.$list26);
        inference_modules.inference_removal_module((SubLObject)removal_modules_ncr_constraints.$kw27$NCR_NODE_SATISFIES_MOD_SEM_POS_CHECK, (SubLObject)removal_modules_ncr_constraints.$list28);
        preference_modules.inference_preference_module((SubLObject)removal_modules_ncr_constraints.$kw29$NCR_NODE_SATISFIES_HEAD_SYN_REQUIRE_ARG1_FULLY_BOUND, (SubLObject)removal_modules_ncr_constraints.$list30);
        preference_modules.inference_preference_module((SubLObject)removal_modules_ncr_constraints.$kw31$NCR_NODE_SATISFIES_HEAD_SEM_REQUIRE_ARG1_FULLY_BOUND, (SubLObject)removal_modules_ncr_constraints.$list32);
        preference_modules.inference_preference_module((SubLObject)removal_modules_ncr_constraints.$kw33$NCR_NODE_SATISFIES_MOD_SYN_REQUIRE_ARG1_FULLY_BOUND, (SubLObject)removal_modules_ncr_constraints.$list34);
        preference_modules.inference_preference_module((SubLObject)removal_modules_ncr_constraints.$kw35$NCR_NODE_SATISFIES_MOD_SEM_REQUIRE_ARG1_FULLY_BOUND, (SubLObject)removal_modules_ncr_constraints.$list36);
        return (SubLObject)removal_modules_ncr_constraints.NIL;
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
        me = (SubLFile)new removal_modules_ncr_constraints();
        removal_modules_ncr_constraints.$excluded_nc_rules$ = null;
        removal_modules_ncr_constraints.$basic_nc_rule_count$ = null;
        removal_modules_ncr_constraints.$derived_nc_rule_count$ = null;
        $const0$satisfiesHeadSyntacticConstraints = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSyntacticConstraintsForNCR"));
        $kw1$REMOVAL_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-LOOKUP-POS");
        $kw2$NCR_NODE_SATISFIES_HEAD_SYN_POS_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-HEAD-SYN-POS-UNIFY-ARG2");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSyntacticConstraintsForNCR")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSyntacticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-BASIC-NC-RULE-COUNT")), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSyntacticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("HEAD"), (SubLObject)removal_modules_ncr_constraints.NIL, (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("SYNTACTIC")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSyntacticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesHeadSyntacticConstraintsForNCR <node> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesHeadSyntacticConstraintsForNCR #$LinkageLexicalNode-443 ?NCRULE)") });
        $kw4$NCR_NODE_SATISFIES_HEAD_SYN_POS_CHECK = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-HEAD-SYN-POS-CHECK");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSyntacticConstraintsForNCR")), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_ncr_constraints.T, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSyntacticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_ncr_constraints.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSyntacticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("HEAD"), (SubLObject)removal_modules_ncr_constraints.NIL, (SubLObject)SubLObjectFactory.makeKeyword("SYNTACTIC")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesHeadSyntacticConstraintsForNCR <node> <rule>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesHeadSyntacticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR)") });
        $const6$satisfiesHeadSemanticConstraintsF = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR"));
        $kw7$NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-UNIFY-ARG2");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DERIVED-NC-RULE-COUNT")), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTIC")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <not-fully-bound> <denot>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443  ?RULE #$StormAsEvent)") });
        $kw9$NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG_3 = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-UNIFY-ARG-3");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_ncr_constraints.TWO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POTENTIAL-DENOTS-FOR-NODE-W-RULE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTIC")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <rule> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR ?DENOT)") });
        $kw11$NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARGS_2_AND_3 = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-UNIFY-ARGS-2-AND-3");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)removal_modules_ncr_constraints.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DERIVED-NC-RULE-COUNT"))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("HEAD"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTIC")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <not-fully-bound> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443  ?NCRULE ?DENOT)") });
        $kw13$NCR_NODE_SATISFIES_HEAD_SEM_POS_CHECK = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-CHECK");
        $list14 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_ncr_constraints.T, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_ncr_constraints.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTIC")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <rule> <denot>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR #$StormAsEvent)") });
        $const15$satisfiesModifierSyntacticConstra = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSyntacticConstraintsForNCR"));
        $kw16$NCR_NODE_SATISFIES_MOD_SYN_POS_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-MOD-SYN-POS-UNIFY-ARG2");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSyntacticConstraintsForNCR")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSyntacticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DERIVED-NC-RULE-COUNT")), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSyntacticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIER"), (SubLObject)removal_modules_ncr_constraints.NIL, (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("SYNTACTIC")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSyntacticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesModifierSyntacticConstraintsForNCR <node> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesModifierSyntacticConstraintsForNCR #$LinkageLexicalNode-34  ?NCRULE)") });
        $kw18$NCR_NODE_SATISFIES_MOD_SYN_POS_CHECK = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-MOD-SYN-POS-CHECK");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSyntacticConstraintsForNCR")), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_ncr_constraints.T, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSyntacticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_ncr_constraints.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSyntacticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIER"), (SubLObject)removal_modules_ncr_constraints.NIL, (SubLObject)SubLObjectFactory.makeKeyword("SYNTACTIC")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesModifierSyntacticConstraintsForNCR <node> <rule>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesModifierSyntacticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR)") });
        $const20$satisfiesModifierSemanticConstrai = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR"));
        $kw21$NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-UNIFY-ARG2");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DERIVED-NC-RULE-COUNT")), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTIC")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <not-fully-bound> <denot>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 ?NCRULE #$CalendarSummer)") });
        $kw23$NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG_3 = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-UNIFY-ARG-3");
        $list24 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_ncr_constraints.TWO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POTENTIAL-DENOTS-FOR-NODE-W-RULE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTIC")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <rule> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR ?DENOT)") });
        $kw25$NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARGS_2_AND_3 = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-UNIFY-ARGS-2-AND-3");
        $list26 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)removal_modules_ncr_constraints.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DERIVED-NC-RULE-COUNT"))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIER"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTIC")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <not-fully-bound> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 ?NCRULE ?DENOT)") });
        $kw27$NCR_NODE_SATISFIES_MOD_SEM_POS_CHECK = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-CHECK");
        $list28 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_ncr_constraints.T, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_ncr_constraints.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTIC")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("NC-PARSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <rule> <denot>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR #$CalendarSummer)") });
        $kw29$NCR_NODE_SATISFIES_HEAD_SYN_REQUIRE_ARG1_FULLY_BOUND = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-HEAD-SYN-REQUIRE-ARG1-FULLY-BOUND");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSyntacticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $kw31$NCR_NODE_SATISFIES_HEAD_SEM_REQUIRE_ARG1_FULLY_BOUND = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-REQUIRE-ARG1-FULLY-BOUND");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesHeadSemanticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $kw33$NCR_NODE_SATISFIES_MOD_SYN_REQUIRE_ARG1_FULLY_BOUND = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-MOD-SYN-REQUIRE-ARG1-FULLY-BOUND");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSyntacticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $kw35$NCR_NODE_SATISFIES_MOD_SEM_REQUIRE_ARG1_FULLY_BOUND = SubLObjectFactory.makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-REQUIRE-ARG1-FULLY-BOUND");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("satisfiesModifierSemanticConstraintsForNCR")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $kw37$ALL = SubLObjectFactory.makeKeyword("ALL");
        $const38$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw39$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $const40$wordForms = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms"));
        $sym41$_WU = SubLObjectFactory.makeSymbol("?WU");
        $sym42$__POS_PRED = SubLObjectFactory.makeSymbol("??POS-PRED");
        $sym43$_RULE = SubLObjectFactory.makeSymbol("?RULE");
        $list44 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?CONSTR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ncRuleConstraint")), (SubLObject)SubLObjectFactory.makeSymbol("?RULE"), (SubLObject)SubLObjectFactory.makeSymbol("?CONSTR")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argN")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)removal_modules_ncr_constraints.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?CONSTR")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounCompoundRuleIndexicalTerm-Direct"))))));
        $list45 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?RULE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounCompoundRule")));
        $list46 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?RULE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DerivedNounCompoundRule")));
        $kw47$HEAD = SubLObjectFactory.makeKeyword("HEAD");
        $kw48$SYNTACTIC = SubLObjectFactory.makeKeyword("SYNTACTIC");
        $kw49$MODIFIER = SubLObjectFactory.makeKeyword("MODIFIER");
        $kw50$SEMANTIC = SubLObjectFactory.makeKeyword("SEMANTIC");
    }
}

/*

	Total time: 166 ms
	
*/