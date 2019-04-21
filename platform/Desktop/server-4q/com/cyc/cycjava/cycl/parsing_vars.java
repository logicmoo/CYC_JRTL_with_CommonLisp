package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parsing_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.parsing_vars";
    public static final String myFingerPrint = "f5e107487ca626328189cac14256db4f5516339d6b736a9fab3ab2063b72402b";
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 786L)
    private static SubLSymbol $nl_core_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1561L)
    public static SubLSymbol $perform_np_parser_expansion$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1682L)
    public static SubLSymbol $perform_vp_parser_expansion$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1786L)
    public static SubLSymbol $rkf_template_wff_filter_level$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1894L)
    public static SubLSymbol $np_wff_filter_level$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1941L)
    public static SubLSymbol $np_wff_filter_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2148L)
    public static SubLSymbol $guess_semantics_for_unknown_wordsP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2295L)
    public static SubLSymbol $psp_clear_caches_each_parseP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2433L)
    public static SubLSymbol $bypass_psp_cachesP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2560L)
    public static SubLSymbol $npp_use_strings_for_semanticsP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2734L)
    public static SubLSymbol $npp_max_rules_per_compound$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 2899L)
    public static SubLSymbol $rbp_include_word_unitsP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3009L)
    public static SubLSymbol $rbp_bypass_deverbal_filtersP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3162L)
    public static SubLSymbol $rbp_apply_all_filters_regardlessP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3342L)
    public static SubLSymbol $rbp_filter_violations_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3623L)
    public static SubLSymbol $rbp_bypass_block_unificationP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3742L)
    public static SubLSymbol $rbp_reformulate_resultsP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 3913L)
    public static SubLSymbol $evaluate_nl_reformulator_resultsP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4066L)
    public static SubLSymbol $npp_use_nl_tagsP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4161L)
    public static SubLSymbol $use_ternary_np_tagsP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4285L)
    private static SubLSymbol $nl_tag_cycl_placeholder$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4438L)
    public static SubLSymbol $psp_lexicon$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4649L)
    public static SubLSymbol $psp_reformulateP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4693L)
    public static SubLSymbol $psp_pos_pred_filterP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4821L)
    public static SubLSymbol $psp_pos_pred_filter_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5041L)
    public static SubLSymbol $parser_cycl_blacklist$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5143L)
    public static SubLSymbol $psp_indexical_map$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5324L)
    public static SubLSymbol $psp_return_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5589L)
    public static SubLSymbol $psp_verboseP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5631L)
    public static SubLSymbol $psp_chart$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5734L)
    public static SubLSymbol $psp_chart_consolidate_edgesP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 5931L)
    public static SubLSymbol $psp_use_lookahead_for_bad_edgesP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6114L)
    public static SubLSymbol $psp_chart_start_index$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6228L)
    public static SubLSymbol $psp_chart_end_index$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6390L)
    public static SubLSymbol $psp_extra_charts$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6523L)
    public static SubLSymbol $psp_dont_destroy_chartP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6649L)
    public static SubLSymbol $psp_rule_lookup_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6756L)
    public static SubLSymbol $psp_concept_filters$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 6915L)
    public static SubLSymbol $parsing_domain_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7067L)
    public static SubLSymbol $rbp_rule_lookup_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7165L)
    public static SubLSymbol $psp_gap_type_allowed$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7319L)
    public static SubLSymbol $psp_generality_preference$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7523L)
    public static SubLSymbol $psp_parse_to_match$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7632L)
    public static SubLSymbol $psp_min_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 7914L)
    public static SubLSymbol $psp_max_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 8083L)
    public static SubLSymbol $psp_weight_type$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 8236L)
    private static SubLSymbol $psp_environmental_globals_new$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9524L)
    public static SubLSymbol $psp_max_edges_per_span$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9654L)
    public static SubLSymbol $psp_max_edges_per_chart$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9788L)
    public static SubLSymbol $psp_cached_interface_helper_clearing_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10062L)
    public static SubLSymbol $variable_uniquification_store$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10275L)
    public static SubLSymbol $linkage_creation_rules$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10559L)
    public static SubLSymbol $parse_tree_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10761L)
    public static SubLSymbol $parse_tree_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10992L)
    public static SubLSymbol $use_strict_syntactic_node_checkingP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11060L)
    public static SubLSymbol $parse_root_node$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11155L)
    public static SubLSymbol $parse_tokenization$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11256L)
    public static SubLSymbol $parse_tokenization_offset$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11597L)
    public static SubLSymbol $reify_parse_nodesP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11708L)
    public static SubLSymbol $storing_cyclifier_wff_results$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11837L)
    public static SubLSymbol $cyclifier_wff_checking_results$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11943L)
    public static SubLSymbol $numeral_parser_case_sensitiveP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 12119L)
    public static SubLSymbol $fscp_verboseP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 12162L)
    public static SubLSymbol $speaker_referent$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$VALID_CONSTANT_;
    private static final SubLSymbol $kw2$NL_TAG_CYCL_PLACEHOLDER;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$EVERYTHING;
    private static final SubLObject $const5$EnglishMt;
    private static final SubLObject $const6$CurrentWorldDataCollectorMt_NonHo;
    private static final SubLSymbol $kw7$NONE;
    private static final SubLSymbol $kw8$GENERAL;
    private static final SubLInteger $int9$255;
    private static final SubLSymbol $kw10$INTEGER;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$PSP_ENVIRONMENTAL_GLOBAL_PAIR;
    private static final SubLSymbol $sym13$BOUNDP;
    private static final SubLInteger $int14$2120;
    private static final SubLInteger $int15$100000;
    private static final SubLSymbol $sym16$_PSP_CACHED_INTERFACE_HELPER_CLEARING_FUNCTIONS_;
    private static final SubLSymbol $kw17$CLEARED;
    private static final SubLSymbol $kw18$DEFAULT;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$CLET;
    private static final SubLSymbol $sym21$_PARSE_TREE_MT_;
    private static final SubLString $str22$NL;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$_PARSE_TREE_PREFIX_;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $kw27$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw28$OFFSET;
    private static final SubLSymbol $sym29$_PARSE_TOKENIZATION_;
    private static final SubLSymbol $sym30$_PARSE_TOKENIZATION_OFFSET_;
    private static final SubLString $str31$data_nl_wff_results_cyclifier_wff;
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 1224L)
    public static SubLObject initialize_nl_kb_feature() {
        if (parsing_vars.NIL != list_utilities.every_in_list((SubLObject)parsing_vars.$sym1$VALID_CONSTANT_, parsing_vars.$nl_core_constants$.getGlobalValue(), (SubLObject)parsing_vars.UNPROVIDED)) {
            kb_control_vars.set_nl_kb_loaded();
        }
        else {
            kb_control_vars.unset_nl_kb_loaded();
        }
        return kb_control_vars.nl_kb_loaded_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 4358L)
    public static SubLObject nl_tag_cycl_placeholder() {
        return parsing_vars.$nl_tag_cycl_placeholder$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9088L)
    public static SubLObject psp_environmental_state() {
        return Mapping.mapcar((SubLObject)parsing_vars.$sym12$PSP_ENVIRONMENTAL_GLOBAL_PAIR, list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)parsing_vars.$sym13$BOUNDP), parsing_vars.$psp_environmental_globals_new$.getGlobalValue(), (SubLObject)parsing_vars.UNPROVIDED, (SubLObject)parsing_vars.UNPROVIDED, (SubLObject)parsing_vars.UNPROVIDED, (SubLObject)parsing_vars.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9367L)
    public static SubLObject psp_environmental_global_pair(final SubLObject global) {
        return (SubLObject)ConsesLow.list(global, Symbols.symbol_value(global));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 9863L)
    public static SubLObject psp_clear_interface_helper_caches() {
        SubLObject cdolist_list_var = parsing_vars.$psp_cached_interface_helper_clearing_functions$.getGlobalValue();
        SubLObject clearer = (SubLObject)parsing_vars.NIL;
        clearer = cdolist_list_var.first();
        while (parsing_vars.NIL != cdolist_list_var) {
            if (parsing_vars.NIL != Symbols.fboundp(clearer)) {
                Functions.funcall(clearer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clearer = cdolist_list_var.first();
        }
        return (SubLObject)parsing_vars.$kw17$CLEARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10376L)
    public static SubLObject use_default_linkage_creation_rulesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)parsing_vars.$kw18$DEFAULT, parsing_vars.$linkage_creation_rules$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10481L)
    public static SubLObject linkage_creation_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return parsing_vars.$linkage_creation_rules$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10654L)
    public static SubLObject with_parse_tree_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)parsing_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_vars.$list19);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)parsing_vars.$sym20$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_vars.$sym21$_PARSE_TREE_MT_, mt)), ConsesLow.append(body, (SubLObject)parsing_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 10869L)
    public static SubLObject with_parse_tree_prefix(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject prefix = (SubLObject)parsing_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_vars.$list23);
        prefix = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)parsing_vars.$sym20$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_vars.$sym24$_PARSE_TREE_PREFIX_, prefix)), ConsesLow.append(body, (SubLObject)parsing_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-vars.lisp", position = 11396L)
    public static SubLObject with_parse_tokenization(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_vars.$list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tokenization = (SubLObject)parsing_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_vars.$list25);
        tokenization = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)parsing_vars.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)parsing_vars.NIL;
        SubLObject current_$1 = (SubLObject)parsing_vars.NIL;
        while (parsing_vars.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_vars.$list25);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_vars.$list25);
            if (parsing_vars.NIL == conses_high.member(current_$1, (SubLObject)parsing_vars.$list26, (SubLObject)parsing_vars.UNPROVIDED, (SubLObject)parsing_vars.UNPROVIDED)) {
                bad = (SubLObject)parsing_vars.T;
            }
            if (current_$1 == parsing_vars.$kw27$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (parsing_vars.NIL != bad && parsing_vars.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_vars.$list25);
        }
        final SubLObject offset_tail = cdestructuring_bind.property_list_member((SubLObject)parsing_vars.$kw28$OFFSET, current);
        final SubLObject offset = (SubLObject)((parsing_vars.NIL != offset_tail) ? conses_high.cadr(offset_tail) : parsing_vars.ZERO_INTEGER);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)parsing_vars.$sym20$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_vars.$sym29$_PARSE_TOKENIZATION_, tokenization), (SubLObject)ConsesLow.list((SubLObject)parsing_vars.$sym30$_PARSE_TOKENIZATION_OFFSET_, offset)), ConsesLow.append(body, (SubLObject)parsing_vars.NIL));
    }
    
    public static SubLObject declare_parsing_vars_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_vars", "initialize_nl_kb_feature", "INITIALIZE-NL-KB-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_vars", "nl_tag_cycl_placeholder", "NL-TAG-CYCL-PLACEHOLDER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_vars", "psp_environmental_state", "PSP-ENVIRONMENTAL-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_vars", "psp_environmental_global_pair", "PSP-ENVIRONMENTAL-GLOBAL-PAIR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_vars", "psp_clear_interface_helper_caches", "PSP-CLEAR-INTERFACE-HELPER-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_vars", "use_default_linkage_creation_rulesP", "USE-DEFAULT-LINKAGE-CREATION-RULES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_vars", "linkage_creation_rules", "LINKAGE-CREATION-RULES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_vars", "with_parse_tree_mt", "WITH-PARSE-TREE-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_vars", "with_parse_tree_prefix", "WITH-PARSE-TREE-PREFIX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_vars", "with_parse_tokenization", "WITH-PARSE-TOKENIZATION");
        return (SubLObject)parsing_vars.NIL;
    }
    
    public static SubLObject init_parsing_vars_file() {
        parsing_vars.$nl_core_constants$ = SubLFiles.deflexical("*NL-CORE-CONSTANTS*", (SubLObject)parsing_vars.$list0);
        parsing_vars.$perform_np_parser_expansion$ = SubLFiles.defparameter("*PERFORM-NP-PARSER-EXPANSION*", (SubLObject)parsing_vars.T);
        parsing_vars.$perform_vp_parser_expansion$ = SubLFiles.defparameter("*PERFORM-VP-PARSER-EXPANSION*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$rkf_template_wff_filter_level$ = SubLFiles.defparameter("*RKF-TEMPLATE-WFF-FILTER-LEVEL*", (SubLObject)parsing_vars.TWO_INTEGER);
        parsing_vars.$np_wff_filter_level$ = SubLFiles.defparameter("*NP-WFF-FILTER-LEVEL*", (SubLObject)parsing_vars.TWO_INTEGER);
        parsing_vars.$np_wff_filter_mts$ = SubLFiles.defparameter("*NP-WFF-FILTER-MTS*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$guess_semantics_for_unknown_wordsP$ = SubLFiles.defparameter("*GUESS-SEMANTICS-FOR-UNKNOWN-WORDS?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$psp_clear_caches_each_parseP$ = SubLFiles.defparameter("*PSP-CLEAR-CACHES-EACH-PARSE?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$bypass_psp_cachesP$ = SubLFiles.defparameter("*BYPASS-PSP-CACHES?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$npp_use_strings_for_semanticsP$ = SubLFiles.defparameter("*NPP-USE-STRINGS-FOR-SEMANTICS?*", (SubLObject)parsing_vars.T);
        parsing_vars.$npp_max_rules_per_compound$ = SubLFiles.defparameter("*NPP-MAX-RULES-PER-COMPOUND*", (SubLObject)parsing_vars.THREE_INTEGER);
        parsing_vars.$rbp_include_word_unitsP$ = SubLFiles.defparameter("*RBP-INCLUDE-WORD-UNITS?*", (SubLObject)parsing_vars.T);
        parsing_vars.$rbp_bypass_deverbal_filtersP$ = SubLFiles.defparameter("*RBP-BYPASS-DEVERBAL-FILTERS?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$rbp_apply_all_filters_regardlessP$ = SubLFiles.defparameter("*RBP-APPLY-ALL-FILTERS-REGARDLESS?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$rbp_filter_violations_limit$ = SubLFiles.defparameter("*RBP-FILTER-VIOLATIONS-LIMIT*", (SubLObject)parsing_vars.TWO_INTEGER);
        parsing_vars.$rbp_bypass_block_unificationP$ = SubLFiles.defparameter("*RBP-BYPASS-BLOCK-UNIFICATION?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$rbp_reformulate_resultsP$ = SubLFiles.defparameter("*RBP-REFORMULATE-RESULTS?*", (SubLObject)parsing_vars.T);
        parsing_vars.$evaluate_nl_reformulator_resultsP$ = SubLFiles.defparameter("*EVALUATE-NL-REFORMULATOR-RESULTS?*", (SubLObject)parsing_vars.T);
        parsing_vars.$npp_use_nl_tagsP$ = SubLFiles.defparameter("*NPP-USE-NL-TAGS?*", (SubLObject)parsing_vars.T);
        parsing_vars.$use_ternary_np_tagsP$ = SubLFiles.defparameter("*USE-TERNARY-NP-TAGS?*", (SubLObject)parsing_vars.T);
        parsing_vars.$nl_tag_cycl_placeholder$ = SubLFiles.deflexical("*NL-TAG-CYCL-PLACEHOLDER*", (SubLObject)parsing_vars.$kw2$NL_TAG_CYCL_PLACEHOLDER);
        parsing_vars.$psp_lexicon$ = SubLFiles.defparameter("*PSP-LEXICON*", misc_utilities.uninitialized());
        parsing_vars.$psp_reformulateP$ = SubLFiles.defparameter("*PSP-REFORMULATE?*", (SubLObject)parsing_vars.T);
        parsing_vars.$psp_pos_pred_filterP$ = SubLFiles.defparameter("*PSP-POS-PRED-FILTER?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$psp_pos_pred_filter_preds$ = SubLFiles.defparameter("*PSP-POS-PRED-FILTER-PREDS*", (SubLObject)parsing_vars.$list3);
        parsing_vars.$parser_cycl_blacklist$ = SubLFiles.defvar("*PARSER-CYCL-BLACKLIST*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$psp_indexical_map$ = SubLFiles.defparameter("*PSP-INDEXICAL-MAP*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$psp_return_mode$ = SubLFiles.defparameter("*PSP-RETURN-MODE*", (SubLObject)parsing_vars.$kw4$EVERYTHING);
        parsing_vars.$psp_verboseP$ = SubLFiles.defparameter("*PSP-VERBOSE?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$psp_chart$ = SubLFiles.defparameter("*PSP-CHART*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$psp_chart_consolidate_edgesP$ = SubLFiles.defparameter("*PSP-CHART-CONSOLIDATE-EDGES?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$psp_use_lookahead_for_bad_edgesP$ = SubLFiles.defparameter("*PSP-USE-LOOKAHEAD-FOR-BAD-EDGES?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$psp_chart_start_index$ = SubLFiles.defparameter("*PSP-CHART-START-INDEX*", (SubLObject)parsing_vars.ZERO_INTEGER);
        parsing_vars.$psp_chart_end_index$ = SubLFiles.defparameter("*PSP-CHART-END-INDEX*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$psp_extra_charts$ = SubLFiles.defparameter("*PSP-EXTRA-CHARTS*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$psp_dont_destroy_chartP$ = SubLFiles.defparameter("*PSP-DONT-DESTROY-CHART?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$psp_rule_lookup_mt$ = SubLFiles.deflexical("*PSP-RULE-LOOKUP-MT*", parsing_vars.$const5$EnglishMt);
        parsing_vars.$psp_concept_filters$ = SubLFiles.defparameter("*PSP-CONCEPT-FILTERS*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$parsing_domain_mt$ = SubLFiles.defparameter("*PARSING-DOMAIN-MT*", parsing_vars.$const6$CurrentWorldDataCollectorMt_NonHo);
        parsing_vars.$rbp_rule_lookup_mt$ = SubLFiles.deflexical("*RBP-RULE-LOOKUP-MT*", parsing_vars.$const5$EnglishMt);
        parsing_vars.$psp_gap_type_allowed$ = SubLFiles.defparameter("*PSP-GAP-TYPE-ALLOWED*", (SubLObject)parsing_vars.$kw7$NONE);
        parsing_vars.$psp_generality_preference$ = SubLFiles.defparameter("*PSP-GENERALITY-PREFERENCE*", (SubLObject)parsing_vars.$kw8$GENERAL);
        parsing_vars.$psp_parse_to_match$ = SubLFiles.defparameter("*PSP-PARSE-TO-MATCH*", misc_utilities.uninitialized());
        parsing_vars.$psp_min_weight$ = SubLFiles.defconstant("*PSP-MIN-WEIGHT*", (SubLObject)parsing_vars.ZERO_INTEGER);
        parsing_vars.$psp_max_weight$ = SubLFiles.defconstant("*PSP-MAX-WEIGHT*", (SubLObject)parsing_vars.$int9$255);
        parsing_vars.$psp_weight_type$ = SubLFiles.defconstant("*PSP-WEIGHT-TYPE*", (SubLObject)parsing_vars.$kw10$INTEGER);
        parsing_vars.$psp_environmental_globals_new$ = SubLFiles.deflexical("*PSP-ENVIRONMENTAL-GLOBALS-NEW*", ConsesLow.append((SubLObject)parsing_vars.$list11, lexicon_vars.lexicon_filters()));
        parsing_vars.$psp_max_edges_per_span$ = SubLFiles.defparameter("*PSP-MAX-EDGES-PER-SPAN*", (SubLObject)parsing_vars.$int14$2120);
        parsing_vars.$psp_max_edges_per_chart$ = SubLFiles.defparameter("*PSP-MAX-EDGES-PER-CHART*", (SubLObject)parsing_vars.$int15$100000);
        parsing_vars.$psp_cached_interface_helper_clearing_functions$ = SubLFiles.deflexical("*PSP-CACHED-INTERFACE-HELPER-CLEARING-FUNCTIONS*", (SubLObject)(maybeDefault((SubLObject)parsing_vars.$sym16$_PSP_CACHED_INTERFACE_HELPER_CLEARING_FUNCTIONS_, parsing_vars.$psp_cached_interface_helper_clearing_functions$, parsing_vars.NIL)));
        parsing_vars.$variable_uniquification_store$ = SubLFiles.defparameter("*VARIABLE-UNIQUIFICATION-STORE*", dictionary.new_dictionary((SubLObject)parsing_vars.EQUALP, (SubLObject)parsing_vars.UNPROVIDED));
        parsing_vars.$linkage_creation_rules$ = SubLFiles.defparameter("*LINKAGE-CREATION-RULES*", (SubLObject)parsing_vars.$kw18$DEFAULT);
        parsing_vars.$parse_tree_mt$ = SubLFiles.defparameter("*PARSE-TREE-MT*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$parse_tree_prefix$ = SubLFiles.defparameter("*PARSE-TREE-PREFIX*", (SubLObject)parsing_vars.$str22$NL);
        parsing_vars.$use_strict_syntactic_node_checkingP$ = SubLFiles.defparameter("*USE-STRICT-SYNTACTIC-NODE-CHECKING?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$parse_root_node$ = SubLFiles.defparameter("*PARSE-ROOT-NODE*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$parse_tokenization$ = SubLFiles.defparameter("*PARSE-TOKENIZATION*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$parse_tokenization_offset$ = SubLFiles.defparameter("*PARSE-TOKENIZATION-OFFSET*", (SubLObject)parsing_vars.ZERO_INTEGER);
        parsing_vars.$reify_parse_nodesP$ = SubLFiles.defparameter("*REIFY-PARSE-NODES?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$storing_cyclifier_wff_results$ = SubLFiles.defparameter("*STORING-CYCLIFIER-WFF-RESULTS*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$cyclifier_wff_checking_results$ = SubLFiles.defparameter("*CYCLIFIER-WFF-CHECKING-RESULTS*", (SubLObject)parsing_vars.$str31$data_nl_wff_results_cyclifier_wff);
        parsing_vars.$numeral_parser_case_sensitiveP$ = SubLFiles.defparameter("*NUMERAL-PARSER-CASE-SENSITIVE?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$fscp_verboseP$ = SubLFiles.defparameter("*FSCP-VERBOSE?*", (SubLObject)parsing_vars.NIL);
        parsing_vars.$speaker_referent$ = SubLFiles.defparameter("*SPEAKER-REFERENT*", (SubLObject)parsing_vars.NIL);
        return (SubLObject)parsing_vars.NIL;
    }
    
    public static SubLObject setup_parsing_vars_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)parsing_vars.$sym16$_PSP_CACHED_INTERFACE_HELPER_CLEARING_FUNCTIONS_);
        return (SubLObject)parsing_vars.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_parsing_vars_file();
    }
    
    @Override
	public void initializeVariables() {
        init_parsing_vars_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_parsing_vars_file();
    }
    
    static {
        me = (SubLFile)new parsing_vars();
        parsing_vars.$nl_core_constants$ = null;
        parsing_vars.$perform_np_parser_expansion$ = null;
        parsing_vars.$perform_vp_parser_expansion$ = null;
        parsing_vars.$rkf_template_wff_filter_level$ = null;
        parsing_vars.$np_wff_filter_level$ = null;
        parsing_vars.$np_wff_filter_mts$ = null;
        parsing_vars.$guess_semantics_for_unknown_wordsP$ = null;
        parsing_vars.$psp_clear_caches_each_parseP$ = null;
        parsing_vars.$bypass_psp_cachesP$ = null;
        parsing_vars.$npp_use_strings_for_semanticsP$ = null;
        parsing_vars.$npp_max_rules_per_compound$ = null;
        parsing_vars.$rbp_include_word_unitsP$ = null;
        parsing_vars.$rbp_bypass_deverbal_filtersP$ = null;
        parsing_vars.$rbp_apply_all_filters_regardlessP$ = null;
        parsing_vars.$rbp_filter_violations_limit$ = null;
        parsing_vars.$rbp_bypass_block_unificationP$ = null;
        parsing_vars.$rbp_reformulate_resultsP$ = null;
        parsing_vars.$evaluate_nl_reformulator_resultsP$ = null;
        parsing_vars.$npp_use_nl_tagsP$ = null;
        parsing_vars.$use_ternary_np_tagsP$ = null;
        parsing_vars.$nl_tag_cycl_placeholder$ = null;
        parsing_vars.$psp_lexicon$ = null;
        parsing_vars.$psp_reformulateP$ = null;
        parsing_vars.$psp_pos_pred_filterP$ = null;
        parsing_vars.$psp_pos_pred_filter_preds$ = null;
        parsing_vars.$parser_cycl_blacklist$ = null;
        parsing_vars.$psp_indexical_map$ = null;
        parsing_vars.$psp_return_mode$ = null;
        parsing_vars.$psp_verboseP$ = null;
        parsing_vars.$psp_chart$ = null;
        parsing_vars.$psp_chart_consolidate_edgesP$ = null;
        parsing_vars.$psp_use_lookahead_for_bad_edgesP$ = null;
        parsing_vars.$psp_chart_start_index$ = null;
        parsing_vars.$psp_chart_end_index$ = null;
        parsing_vars.$psp_extra_charts$ = null;
        parsing_vars.$psp_dont_destroy_chartP$ = null;
        parsing_vars.$psp_rule_lookup_mt$ = null;
        parsing_vars.$psp_concept_filters$ = null;
        parsing_vars.$parsing_domain_mt$ = null;
        parsing_vars.$rbp_rule_lookup_mt$ = null;
        parsing_vars.$psp_gap_type_allowed$ = null;
        parsing_vars.$psp_generality_preference$ = null;
        parsing_vars.$psp_parse_to_match$ = null;
        parsing_vars.$psp_min_weight$ = null;
        parsing_vars.$psp_max_weight$ = null;
        parsing_vars.$psp_weight_type$ = null;
        parsing_vars.$psp_environmental_globals_new$ = null;
        parsing_vars.$psp_max_edges_per_span$ = null;
        parsing_vars.$psp_max_edges_per_chart$ = null;
        parsing_vars.$psp_cached_interface_helper_clearing_functions$ = null;
        parsing_vars.$variable_uniquification_store$ = null;
        parsing_vars.$linkage_creation_rules$ = null;
        parsing_vars.$parse_tree_mt$ = null;
        parsing_vars.$parse_tree_prefix$ = null;
        parsing_vars.$use_strict_syntactic_node_checkingP$ = null;
        parsing_vars.$parse_root_node$ = null;
        parsing_vars.$parse_tokenization$ = null;
        parsing_vars.$parse_tokenization_offset$ = null;
        parsing_vars.$reify_parse_nodesP$ = null;
        parsing_vars.$storing_cyclifier_wff_results$ = null;
        parsing_vars.$cyclifier_wff_checking_results$ = null;
        parsing_vars.$numeral_parser_case_sensitiveP$ = null;
        parsing_vars.$fscp_verboseP$ = null;
        parsing_vars.$speaker_referent$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DataForNLMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLUtteranceAttribute")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLTagFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn-3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfSpeech")) });
        $sym1$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $kw2$NL_TAG_CYCL_PLACEHOLDER = SubLObjectFactory.makeKeyword("NL-TAG-CYCL-PLACEHOLDER");
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("stockTickerSymbol")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryCodeDigraph")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("executableProgramName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("internetCountryCode")));
        $kw4$EVERYTHING = SubLObjectFactory.makeKeyword("EVERYTHING");
        $const5$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $const6$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $kw7$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw8$GENERAL = SubLObjectFactory.makeKeyword("GENERAL");
        $int9$255 = SubLObjectFactory.makeInteger(255);
        $kw10$INTEGER = SubLObjectFactory.makeKeyword("INTEGER");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), SubLObjectFactory.makeSymbol("*GUESS-SEMANTICS-FOR-UNKNOWN-WORDS?*"), SubLObjectFactory.makeSymbol("*PARSING-TIMEOUT-TIME*"), SubLObjectFactory.makeSymbol("*NPP-USE-NL-TAGS?*"), SubLObjectFactory.makeSymbol("*PSP-USE-TERM-LEXICON?*"), SubLObjectFactory.makeSymbol("*NP-WFF-FILTER-LEVEL*"), SubLObjectFactory.makeSymbol("*PSP-GAP-TYPE-ALLOWED*"), SubLObjectFactory.makeSymbol("*PSP-INDEXICAL-MAP*"), SubLObjectFactory.makeSymbol("*PSP-MAX-EDGES-PER-SPAN*"), SubLObjectFactory.makeSymbol("*PSP-MAX-EDGES-PER-CHART*"), SubLObjectFactory.makeSymbol("*USE-TERNARY-NP-TAGS?*"), SubLObjectFactory.makeSymbol("*PSP-REFORMULATE?*"), SubLObjectFactory.makeSymbol("*PSP-POS-PRED-FILTER?*"), SubLObjectFactory.makeSymbol("*PSP-POS-PRED-FILTER-PREDS*"), SubLObjectFactory.makeSymbol("*PARSER-CYCL-BLACKLIST*"), SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*"), SubLObjectFactory.makeSymbol("*PARSING-DOMAIN-MT*"), SubLObjectFactory.makeSymbol("*PSP-RETURN-MODE*"), SubLObjectFactory.makeSymbol("*PSP-PARSE-TO-MATCH*"), SubLObjectFactory.makeSymbol("*PSP-GENERALITY-PREFERENCE*"), SubLObjectFactory.makeSymbol("*PSP-CONCEPT-FILTERS*") });
        $sym12$PSP_ENVIRONMENTAL_GLOBAL_PAIR = SubLObjectFactory.makeSymbol("PSP-ENVIRONMENTAL-GLOBAL-PAIR");
        $sym13$BOUNDP = SubLObjectFactory.makeSymbol("BOUNDP");
        $int14$2120 = SubLObjectFactory.makeInteger(2120);
        $int15$100000 = SubLObjectFactory.makeInteger(100000);
        $sym16$_PSP_CACHED_INTERFACE_HELPER_CLEARING_FUNCTIONS_ = SubLObjectFactory.makeSymbol("*PSP-CACHED-INTERFACE-HELPER-CLEARING-FUNCTIONS*");
        $kw17$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
        $kw18$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym20$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym21$_PARSE_TREE_MT_ = SubLObjectFactory.makeSymbol("*PARSE-TREE-MT*");
        $str22$NL = SubLObjectFactory.makeString("NL");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym24$_PARSE_TREE_PREFIX_ = SubLObjectFactory.makeSymbol("*PARSE-TREE-PREFIX*");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OFFSET"), (SubLObject)parsing_vars.ZERO_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OFFSET"));
        $kw27$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw28$OFFSET = SubLObjectFactory.makeKeyword("OFFSET");
        $sym29$_PARSE_TOKENIZATION_ = SubLObjectFactory.makeSymbol("*PARSE-TOKENIZATION*");
        $sym30$_PARSE_TOKENIZATION_OFFSET_ = SubLObjectFactory.makeSymbol("*PARSE-TOKENIZATION-OFFSET*");
        $str31$data_nl_wff_results_cyclifier_wff = SubLObjectFactory.makeString("data/nl/wff-results/cyclifier-wff-results.txt");
    }
}

/*

	Total time: 111 ms
	
*/