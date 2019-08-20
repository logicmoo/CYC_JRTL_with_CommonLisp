package com.cyc.cycjava.cycl.inference.modules;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.constants_low;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.encapsulation;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.fi_edit;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.hl_transcript_tracing;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_cache;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.operation_queues;
import com.cyc.cycjava.cycl.pph_functions;
import com.cyc.cycjava.cycl.pph_templates;
import com.cyc.cycjava.cycl.predicate_relevance_cache;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.reformulator_datastructures;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subcollection_unwinder;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.tersifier;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.transcript_utilities;
import com.cyc.cycjava.cycl.tva_cache;
import com.cyc.cycjava.cycl.tva_utilities;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.rule_after_adding;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class after_adding_modules extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "c970f052a455d7d122dfb380b7600b3d572585cb2eef92f653724136159aa181";
    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 1000L)
    private static SubLSymbol $cycl_functions_used_as_after_addings$;
    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 3200L)
    private static SubLSymbol $inside_clear_genls_dependent_cachesP$;
    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4000L)
    private static SubLSymbol $inside_clear_isa_dependent_cachesP$;
    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4800L)
    private static SubLSymbol $inside_clear_quoted_isa_dependent_cachesP$;
    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14100L)
    private static SubLSymbol $true_rule_template$;
    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14200L)
    public static SubLSymbol $true_rule_defining_mt$;
    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 29900L)
    private static SubLSymbol $cyc_except_mt_repropagate_mt_contents_cutoff$;
    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 36600L)
    private static SubLSymbol $debug_do_create_from_descriptionP$;
    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 47200L)
    private static SubLSymbol $instantiate_from_subcollection_expression_constant_prefix$;
    private static SubLList $list0;
    private static SubLSymbol $sym1$ARGUMENT_P;
    private static SubLSymbol $sym2$DECACHE_AFTER_ADDINGS;
    private static SubLSymbol $sym3$DECACHE_AFTER_REMOVINGS;
    private static SubLSymbol $sym4$DECACHE_RULE_AFTER_ADDINGS;
    private static SubLSymbol $sym5$DECACHE_RULE_AFTER_REMOVINGS;
    private static SubLSymbol $sym6$CLEAR_MT_DEPENDENT_CACHES;
    private static SubLSymbol $sym7$CLEAR_GENLS_DEPENDENT_CACHES;
    private static SubLSymbol $sym8$CLEAR_ISA_DEPENDENT_CACHES;
    private static SubLSymbol $sym9$CLEAR_QUOTED_ISA_DEPENDENT_CACHES;
    private static SubLSymbol $sym10$CLEAR_GENL_PRED_DEPENDENT_CACHES;
    private static SubLSymbol $sym11$ADD_TRANSITIVE_VIA_ARG;
    private static SubLSymbol $sym12$REMOVE_TRANSITIVE_VIA_ARG;
    private static SubLSymbol $sym13$ADD_TRANSITIVE_VIA_ARG_INVERSE;
    private static SubLSymbol $sym14$REMOVE_TRANSITIVE_VIA_ARG_INVERSE;
    private static SubLSymbol $sym15$CLEAR_CACHED_TVA_CHECKS;
    private static SubLSymbol $sym16$CLEAR_CACHED_SOME_TVA_CHECKS;
    private static SubLSymbol $sym17$CLEAR_CACHED_CVA_CHECKS;
    private static SubLSymbol $sym18$CLEAR_CACHED_SOME_CVA_CHECKS;
    private static SubLSymbol $sym19$SKOLEM_AFTER_REMOVING;
    private static SubLSymbol $sym20$ADD_OLD_CONSTANT_NAME;
    private static SubLSymbol $sym21$REMOVE_OLD_CONSTANT_NAME;
    private static SubLObject $$isa;
    private static SubLSymbol $sym23$PROPAGATE_TO_ISA;
    private static SubLObject $$genls;
    private static SubLSymbol $sym25$PROPAGATE_TO_GENLS;
    private static SubLObject $$disjointWith;
    private static SubLSymbol $sym27$PROPAGATE_TO_DISJOINTWITH;
    private static SubLObject $$genlMt;
    private static SubLSymbol $sym29$PROPAGATE_TO_GENLMT;
    private static SubLObject $$genlPreds;
    private static SubLSymbol $sym31$PROPAGATE_TO_GENLPREDS;
    private static SubLObject $$negationPreds;
    private static SubLSymbol $sym33$PROPAGATE_TO_NEGATIONPREDS;
    private static SubLObject $$genlInverse;
    private static SubLSymbol $sym35$PROPAGATE_TO_GENLINVERSE;
    private static SubLObject $$negationInverse;
    private static SubLSymbol $sym37$PROPAGATE_TO_NEGATIONINVERSE;
    private static SubLSymbol $sym38$PROPAGATE_INVERSE_TO_ISA;
    private static SubLSymbol $sym39$PROPAGATE_INVERSE_TO_GENLS;
    private static SubLSymbol $sym40$PROPAGATE_INVERSE_TO_GENLMT;
    private static SubLSymbol $sym41$PROPAGATE_INVERSE_TO_GENLPREDS;
    private static SubLSymbol $sym42$PROPAGATE_INVERSE_TO_GENLINVERSE;
    private static SubLList $list43;
    private static SubLSymbol $GENLPREDS;
    private static SubLSymbol $MONOTONIC;
    private static SubLList $list46;
    private static SubLObject $$ist;
    private static SubLSymbol $sym48$ADD_IST;
    private static SubLObject $$implies;
    private static SubLList $list50;
    private static SubLSymbol $CODE;
    private static SubLSymbol $sym52$QUEUE_P;
    private static SubLSymbol $sym53$ADD_TRUE_RULE;
    private static SubLList $list54;
    private static SubLSymbol $sym55$_TRUE_RULE_DEFINING_MT_;
    private static SubLObject $$CoreCycLMt;
    private static SubLObject $$trueRule;
    private static SubLSymbol $sym58$FORT_P;
    private static SubLObject $$ruleTemplateDirection;
    private static SubLObject $$Forward_AssertionDirection;
    private static SubLSymbol $FORWARD;
    private static SubLObject $$Backward_AssertionDirection;
    private static SubLSymbol $BACKWARD;
    private static SubLSymbol $sym64$ADD_RULE_TEMPLATE_DIRECTION;
    private static SubLSymbol $sym65$REMOVE_RULE_TEMPLATE_DIRECTION;
    private static SubLSymbol $GAF;
    private static SubLSymbol $TRUE;
    private static SubLSymbol $sym68$DEDUCTION_P;
    private static SubLSymbol $sym69$TRUE_RULE_SUPPORT_P;
    private static SubLSymbol $sym70$REMOVE_DEPENDENT_TERM;
    private static SubLObject $$arity;
    private static SubLSymbol $sym72$PROPAGATE_TO_ARITY;
    private static SubLSymbol $sym73$ADD_ARITY;
    private static SubLSymbol $sym74$REMOVE_ARITY;
    private static SubLObject $$arityMin;
    private static SubLSymbol $sym76$PROPAGATE_TO_ARITY_MIN;
    private static SubLSymbol $sym77$ADD_ARITY_MIN;
    private static SubLSymbol $sym78$REMOVE_ARITY_MIN;
    private static SubLObject $$arityMax;
    private static SubLSymbol $sym80$PROPAGATE_TO_ARITY_MAX;
    private static SubLSymbol $sym81$ADD_ARITY_MAX;
    private static SubLSymbol $sym82$REMOVE_ARITY_MAX;
    private static SubLSymbol $sym83$INTER_ARG_ISA_AFTER_ADDING;
    private static SubLSymbol $sym84$INTER_ARG_ISA_AFTER_REMOVING;
    private static SubLSymbol $sym85$INTER_ARG_FORMAT_AFTER_ADDING;
    private static SubLSymbol $sym86$INTER_ARG_FORMAT_AFTER_REMOVING;
    private static SubLSymbol $sym87$ADD_TO_CONTRACTION_HT;
    private static SubLSymbol $sym88$REMOVE_FROM_CONTRACTION_HT;
    private static SubLSymbol $sym89$ADD_GEN_TEMPLATE_EXPANSION;
    private static SubLSymbol $sym90$REMOVE_GEN_TEMPLATE_EXPANSION;
    private static SubLObject $$expansion;
    private static SubLList $list92;
    private static SubLObject $$expansionAxiom;
    private static SubLSymbol $sym94$RELEVANT_MT_IS_GENL_MT;
    private static SubLSymbol $CNF;
    private static SubLSymbol $sym96$NEG_LITS;
    private static SubLObject $$True;
    private static SubLSymbol $sym98$ADD_EXPANSION_AXIOM;
    private static SubLSymbol $sym99$CYC_ADD_REFORMULATION_ASSERTION;
    private static SubLSymbol $sym100$CYC_REMOVE_REFORMULATION_ASSERTION;
    private static SubLList $list101;
    private static SubLObject $$elementOf;
    private static SubLObject $$TheSetOf;
    private static SubLList $list104;
    private static SubLSymbol $sym105$CYC_ADD_ELEMENT_OF;
    private static SubLSymbol $sym106$CLEAR_UNIT_MULTIPLICATION_FACTOR_CACHES;
    private static SubLSymbol $sym107$GAF_ASSERTION_;
    private static SubLSymbol $sym108$RULE_ASSERTION_;
    private static SubLSymbol $sym109$CYC_ADD_KNOWN_ANTECEDENT_RULE;
    private static SubLSymbol $sym110$CYC_REMOVE_KNOWN_ANTECEDENT_RULE;
    private static SubLSymbol $sym111$ADD_MERGED_CONSTANT_GUID;
    private static SubLSymbol $sym112$REMOVE_MERGED_CONSTANT_GUID;
    private static SubLInteger $int$256;
    private static SubLSymbol $MT;
    private static SubLSymbol $BROAD_MT;
    private static SubLString $str116$do_broad_mt_index;
    private static SubLSymbol $sym117$STRINGP;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym119$CYC_EXCEPT_MT_ADDED;
    private static SubLString $str120$Skipping_propagating_mt_contents_;
    private static SubLSymbol $sym121$CYC_EXCEPT_MT_REMOVED;
    private static SubLSymbol $sym122$CYC_EXCEPT_ADDED;
    private static SubLSymbol $sym123$CYC_EXCEPT_REMOVED;
    private static SubLObject $$except;
    private static SubLSymbol $UNKNOWN;
    private static SubLSymbol $sym126$ADD_RELATION_INSTANCE_ALL;
    private static SubLSymbol $sym127$REMOVE_RELATION_INSTANCE_ALL;
    private static SubLSymbol $sym128$ADD_RELATION_ALL_INSTANCE;
    private static SubLSymbol $sym129$REMOVE_RELATION_ALL_INSTANCE;
    private static SubLString $str130$__do_create_from_description_mark;
    private static SubLObject $$quotedIsa;
    private static SubLObject $$InstantiatedConstant;
    private static SubLObject $$BookkeepingMt;
    private static SubLSymbol $sym134$FI_ASSERT;
    private static SubLSymbol $sym135$QUOTE;
    private static SubLList $list136;
    private static SubLString $str137$__do_create_from_description_crea;
    private static SubLSymbol $sym138$FI_TIMESTAMP_ASSERTION;
    private static SubLSymbol $sym139$FI_TIMESTAMP_CONSTANT;
    private static SubLString $str140$__do_create_from_description_afte;
    private static SubLSymbol $sym141$_TERM;
    private static SubLObject $$and;
    private static SubLString $str143$__do_create_from_description_reus;
    private static SubLString $str144$do_create_from_description_found_;
    private static SubLString $str145$__do_create_from_description_reus;
    private static SubLString $str146$__do_create_from_description_reus;
    private static SubLString $str147$__do_create_from_description_reus;
    private static SubLSymbol $ASSERTIVE;
    private static SubLSymbol $sym149$DO_CREATE_FROM_DESCRIPTION;
    private static SubLSymbol $sym150$INSTANTIATED_CONSTANT_P;
    private static SubLSymbol $sym151$FIND_CONSTANT;
    private static SubLSymbol $sym152$MAKE_VALID_CONSTANT_NAME;
    private static SubLString $str153$do_create_from_description_multip;
    private static SubLSymbol $sym154$_;
    private static SubLSymbol $sym155$EXPRESSION_INSTANTIATED_CONSTANT_COUNT;
    private static SubLSymbol $sym156$POSSIBLE_INSTANTIATED_CONSTANT_TO_REUSE_;
    private static SubLSymbol $sym157$VALID_CONSTANT_;
    private static SubLSymbol $sym158$DO_CREATE_FROM_DESCRIPTION_MULTIPLE;
    private static SubLString $str159$INST;
    private static SubLSymbol $sym160$NART_P;
    private static SubLSymbol $sym161$NART_EL_FORMULA;
    private static SubLSymbol $sym162$CONSTANT_INSTANTIATED_FROM_SUBCOLLECTION_EXPRESSION_P;
    private static SubLSymbol $sym163$MAX;
    private static SubLString $str164$More_than_one_terms_match_found_f;
    private static SubLSymbol $sym165$FORT_NAME;
    private static SubLList $list166;
    private static SubLSymbol $sym167$INSTANTIATE_FROM_SUBCOLLECTION_EXPRESSION;
    private static SubLString $str168$Finding_constants_with_no_asserti;
    private static SubLString $str169$Killing_constants_with_no_asserti;
    private static SubLString $str170$__Killing__A__;
    private static SubLString $str171$___A_constants_killed__;
    private static SubLString $str172$Finding_instantiated_constants_wi;
    private static SubLSymbol $sym173$RELEVANT_MT_IS_EVERYTHING;
    private static SubLObject $$EverythingPSC;
    private static SubLString $str175$Gathering_instantiated_constants;
    private static SubLString $str176$Identifying_unused_instantiated_c;
    private static SubLString $str177$cdolist;
    private static SubLString $str178$Removing_;
    private static SubLString $str179$_unused_instantiated_constant;
    private static SubLString $str180$;
    private static SubLString $str181$s;
    private static SubLList $list182;
    private static SubLSymbol $sym183$DEDUCTION_SUPPORTED_OBJECT;
    private static SubLSymbol $sym184$ASSERTION_EL_FORMULA;
    private static SubLObject $$doCreateFromDescription;
    private static SubLObject $$doCreateFromDescription_Multiple;
    private static SubLString $str187$could_not_determine_created_const;
    private static SubLString $str188$too_many_instantiated_constant_ga;
    private static SubLString $str189$not_enough_instantiated_constant_;
    private static SubLList $list190;
    private static SubLSymbol $sym191$RELEVANT_MT_IS_EQ;
    private static SubLList $list192;
    private static SubLSymbol $sym193$RETAIN_MT_CONTENTS;

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 1200L)
    public static SubLObject decache_after_addings(SubLObject argument, SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : argument;
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject pred = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            after_adding.recache_gaf_after_addings(pred);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 1500L)
    public static SubLObject decache_after_removings(SubLObject argument, SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : argument;
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject pred = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            after_adding.recache_gaf_after_removings(pred);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 1800L)
    public static SubLObject decache_rule_after_addings(SubLObject argument, SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : argument;
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject pred = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            rule_after_adding.recache_rule_after_addings(pred);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 2100L)
    public static SubLObject decache_rule_after_removings(SubLObject argument, SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : argument;
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject pred = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            rule_after_adding.recache_rule_after_removings(pred);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 2400L)
    public static SubLObject clear_mt_dependent_caches(SubLObject argument, SubLObject assertion) {
        return possibly_clear_mt_dependent_caches(argument, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 2600L)
    public static SubLObject possibly_clear_mt_dependent_caches(SubLObject argument, SubLObject assertion) {
        if (NIL != memoization_state.clear_mt_dependent_cachesP()) {
            clear_mt_dependent_caches_int(argument, assertion);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 2800L)
    public static SubLObject clear_mt_dependent_caches_int(SubLObject argument, SubLObject assertion) {
        genl_mts.clear_all_base_mts();
        mt_relevance_cache.update_mt_relevance_cache(argument, assertion);
        predicate_relevance_cache.clear_predicate_relevance_cache();
        sdc.clear_cached_all_isa_sdct();
        tva_utilities.clear_cached_some_tva_for_predicate();
        SubLObject cdolist_list_var = memoization_state.$mt_dependent_cache_clear_callbacks$.getGlobalValue();
        SubLObject callback = NIL;
        callback = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != Symbols.fboundp(callback)) {
                Functions.funcall(callback);
            }
            cdolist_list_var = cdolist_list_var.rest();
            callback = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 3300L)
    public static SubLObject clear_genls_dependent_caches(SubLObject argument, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $inside_clear_genls_dependent_cachesP$.getDynamicValue(thread)) {
            SubLObject _prev_bind_0 = $inside_clear_genls_dependent_cachesP$.currentBinding(thread);
            try {
                $inside_clear_genls_dependent_cachesP$.bind(T, thread);
                SubLObject cdolist_list_var = memoization_state.$genls_dependent_cache_clear_callbacks$.getGlobalValue();
                SubLObject callback = NIL;
                callback = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != Symbols.fboundp(callback)) {
                        Functions.funcall(callback);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    callback = cdolist_list_var.first();
                }
                clear_isa_dependent_caches_internal();
                clear_quoted_isa_dependent_caches_internal();
            } finally {
                $inside_clear_genls_dependent_cachesP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 3800L)
    public static SubLObject clear_isa_dependent_caches(SubLObject argument, SubLObject assertion) {
        clear_isa_dependent_caches_internal();
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4100L)
    public static SubLObject clear_isa_dependent_caches_internal() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $inside_clear_isa_dependent_cachesP$.getDynamicValue(thread)) {
            SubLObject _prev_bind_0 = $inside_clear_isa_dependent_cachesP$.currentBinding(thread);
            try {
                $inside_clear_isa_dependent_cachesP$.bind(T, thread);
                sdc.clear_cached_all_isa_sdct();
                sksi_kb_accessors.clear_sksi_content_mts();
                SubLObject cdolist_list_var = memoization_state.$isa_dependent_cache_clear_callbacks$.getGlobalValue();
                SubLObject callback = NIL;
                callback = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != Symbols.fboundp(callback)) {
                        Functions.funcall(callback);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    callback = cdolist_list_var.first();
                }
            } finally {
                $inside_clear_isa_dependent_cachesP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4500L)
    public static SubLObject clear_quoted_isa_dependent_caches(SubLObject argument, SubLObject assertion) {
        clear_quoted_isa_dependent_caches_internal();
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4900L)
    public static SubLObject clear_quoted_isa_dependent_caches_internal() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $inside_clear_quoted_isa_dependent_cachesP$.getDynamicValue(thread)) {
            SubLObject _prev_bind_0 = $inside_clear_quoted_isa_dependent_cachesP$.currentBinding(thread);
            try {
                $inside_clear_quoted_isa_dependent_cachesP$.bind(T, thread);
                SubLObject cdolist_list_var = memoization_state.$quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue();
                SubLObject callback = NIL;
                callback = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != Symbols.fboundp(callback)) {
                        Functions.funcall(callback);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    callback = cdolist_list_var.first();
                }
            } finally {
                $inside_clear_quoted_isa_dependent_cachesP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 5300L)
    public static SubLObject clear_genl_pred_dependent_caches(SubLObject argument, SubLObject assertion) {
        predicate_relevance_cache.clear_predicate_relevance_cache();
        tva_utilities.clear_cached_some_tva_for_predicate();
        SubLObject cdolist_list_var = memoization_state.$genl_preds_dependent_cache_clear_callbacks$.getGlobalValue();
        SubLObject callback = NIL;
        callback = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != Symbols.fboundp(callback)) {
                Functions.funcall(callback);
            }
            cdolist_list_var = cdolist_list_var.rest();
            callback = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 5700L)
    public static SubLObject add_transitive_via_arg(SubLObject argument, SubLObject assertion) {
        tva_cache.tva_cache_add_transitive_via_arg(assertion);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6000L)
    public static SubLObject remove_transitive_via_arg(SubLObject argument, SubLObject assertion) {
        tva_cache.tva_cache_remove_transitive_via_arg(assertion);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6100L)
    public static SubLObject add_transitive_via_arg_inverse(SubLObject argument, SubLObject assertion) {
        tva_cache.tva_cache_add_transitive_via_arg_inverse(assertion);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6300L)
    public static SubLObject remove_transitive_via_arg_inverse(SubLObject argument, SubLObject assertion) {
        tva_cache.tva_cache_remove_transitive_via_arg_inverse(assertion);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6500L)
    public static SubLObject clear_cached_tva_checks(SubLObject argument, SubLObject assertion) {
        tva_utilities.clear_cached_some_tva_for_predicate();
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6600L)
    public static SubLObject clear_cached_some_tva_checks(SubLObject argument, SubLObject assertion) {
        tva_utilities.clear_cached_some_tva_for_predicate();
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6800L)
    public static SubLObject clear_cached_cva_checks(SubLObject argument, SubLObject assertion) {
        tva_utilities.clear_cached_some_cva_for_predicate();
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6900L)
    public static SubLObject clear_cached_some_cva_checks(SubLObject argument, SubLObject assertion) {
        tva_utilities.clear_cached_some_cva_for_predicate();
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 7100L)
    public static SubLObject skolem_after_removing(SubLObject argument, SubLObject assertion) {
        SubLObject skolem_function = assertions_high.gaf_arg1(assertion);
        if (NIL == hl_macros.fort_being_removedP(skolem_function)) {
            cyc_kernel.cyc_kill(skolem_function);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 7400L)
    public static SubLObject add_old_constant_name(SubLObject argument, SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject constant = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            SubLObject string = assertions_high.gaf_arg(assertion, TWO_INTEGER);
            if (isConstSym(constant) && !isConstSym(constants_high.find_constant(string))) {
                ke.cache_old_constant_name(string, constant);
            }
            return NIL;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 7900L)
    public static SubLObject remove_old_constant_name(SubLObject argument, SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject constant = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            SubLObject string = assertions_high.gaf_arg(assertion, TWO_INTEGER);
            if (isConstSym(constant) && !isConstSym(constants_high.find_constant(string))) {
                ke.decache_old_constant_name(string, constant);
            }
            return NIL;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 8400L)
    public static SubLObject propagate_to_isa(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$isa, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 8700L)
    public static SubLObject propagate_to_genls(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$genls, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 8900L)
    public static SubLObject propagate_to_disjointwith(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$disjointWith, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9000L)
    public static SubLObject propagate_to_genlmt(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$genlMt, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9200L)
    public static SubLObject propagate_to_genlpreds(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$genlPreds, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9300L)
    public static SubLObject propagate_to_negationpreds(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$negationPreds, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9500L)
    public static SubLObject propagate_to_genlinverse(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$genlInverse, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9600L)
    public static SubLObject propagate_to_negationinverse(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$negationInverse, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9800L)
    public static SubLObject propagate_inverse_to_isa(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses($$isa, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 10000L)
    public static SubLObject propagate_inverse_to_genls(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses($$genls, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 10200L)
    public static SubLObject propagate_inverse_to_genlmt(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses($$genlMt, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 10300L)
    public static SubLObject propagate_inverse_to_genlpreds(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses($$genlPreds, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 10500L)
    public static SubLObject propagate_inverse_to_genlinverse(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses($$genlInverse, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 10600L)
    public static SubLObject propagate_sbhl_spec_pred_uses(SubLObject sbhl_pred, SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            SubLObject formula = assertions_high.gaf_formula(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if (el_utilities.literal_arity(formula, UNPROVIDED).numE(TWO_INTEGER)) {
                SubLObject current;
                SubLObject datum = current = formula;
                SubLObject pred = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list43);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list43);
                arg1 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list43);
                arg2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != genl_predicates.genl_predP(pred, sbhl_pred, mt, UNPROVIDED)) {
                        SubLObject result_formula = list(sbhl_pred, arg1, arg2);
                        SubLObject more_support_formula = list($$genlPreds, pred, sbhl_pred);
                        SubLObject more_support = fi.make_el_support($GENLPREDS, more_support_formula, mt, $MONOTONIC);
                        SubLObject supports = list(assertion, more_support);
                        fi.fi_add_argument_int(result_formula, mt, supports, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list43);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 11500L)
    public static SubLObject propagate_sbhl_spec_inverse_uses(SubLObject sbhl_pred, SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            SubLObject formula = assertions_high.gaf_formula(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if (el_utilities.literal_arity(formula, UNPROVIDED).numE(TWO_INTEGER)) {
                SubLObject current;
                SubLObject datum = current = formula;
                SubLObject pred = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list43);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list43);
                arg1 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list43);
                arg2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != genl_predicates.genl_inverseP(pred, sbhl_pred, mt, UNPROVIDED)) {
                        SubLObject result_formula = list(sbhl_pred, arg2, arg1);
                        SubLObject more_support_formula = list($$genlInverse, pred, sbhl_pred);
                        SubLObject more_support = fi.make_el_support($GENLPREDS, more_support_formula, mt, $MONOTONIC);
                        SubLObject supports = list(assertion, more_support);
                        fi.fi_add_argument_int(result_formula, mt, supports, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list43);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 12400L)
    public static SubLObject add_ist(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.true_assertionP(assertion)) {
            SubLObject ist_formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
            SubLObject direction = assertions_high.assertion_direction(assertion);
            SubLObject current;
            SubLObject datum = current = ist_formula;
            SubLObject ist = NIL;
            SubLObject mt = NIL;
            SubLObject formula = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list46);
            ist = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list46);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list46);
            formula = current.first();
            current = current.rest();
            if (NIL == current) {
                if (ist.eql($$ist)) {
                    SubLObject hl_rule_support = add_ist_el_support(mt);
                    SubLObject supports = list(hl_rule_support, assertion);
                    fi.fi_add_argument_int(formula, mt, supports, direction, UNPROVIDED);
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list46);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 13200L)
    public static SubLObject add_ist_el_support(SubLObject mt) {
        SubLObject hl_rule = listS($$implies, listS($$ist, mt, $list50), $list50);
        return fi.make_el_support($CODE, hl_rule, mt, $MONOTONIC);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 13400L)
    public static SubLObject add_true_rule(SubLObject argument, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject template = assertions_high.gaf_arg1(assertion);
            SubLObject rule_formula = assertions_high.gaf_arg2(assertion);
            SubLObject direction = rule_template_direction(template, mt);
            SubLObject true_rule_el_support = true_rule_el_support();
            SubLObject supports = list(true_rule_el_support, assertion);
            SubLObject environment = forward.get_forward_inference_environment();
            assert NIL != queues.queue_p(environment) : environment;
            SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                fi.fi_add_argument_int(rule_formula, mt, supports, direction, UNPROVIDED);
            } finally {
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14300L)
    public static SubLObject true_rule_el_support() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_rule = $true_rule_template$.getDynamicValue(thread);
        return fi.make_el_support($CODE, hl_rule, $true_rule_defining_mt$.getGlobalValue(), $MONOTONIC);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14500L)
    public static SubLObject true_rule_support_p(SubLObject support) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == assertion_handles.assertion_p(support) && $true_rule_template$.getDynamicValue(thread).equal(arguments.support_formula(support)));
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14600L)
    public static SubLObject rule_template_direction(SubLObject rule_template, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(rule_template) : rule_template;
        SubLObject pcase_var;
        SubLObject direction = pcase_var = kb_mapping_utilities.fpred_value_in_relevant_mts(rule_template, $$ruleTemplateDirection, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (pcase_var.eql($$Forward_AssertionDirection)) {
            return $FORWARD;
        }
        if (pcase_var.eql($$Backward_AssertionDirection)) {
            return $BACKWARD;
        }
        return $BACKWARD;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 15000L)
    public static SubLObject add_rule_template_direction(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject template = assertions_high.gaf_arg1(assertion);
            SubLObject direction = assertions_high.gaf_arg2(assertion);
            SubLObject template_instantiations = rule_template_instantiations(template, mt);
            SubLObject pcase_var = direction;
            if (pcase_var.eql($$Forward_AssertionDirection)) {
                SubLObject cdolist_list_var = template_instantiations;
                SubLObject template_instantiation = NIL;
                template_instantiation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    tms.tms_change_direction(template_instantiation, $FORWARD);
                    cdolist_list_var = cdolist_list_var.rest();
                    template_instantiation = cdolist_list_var.first();
                }
                forward.perform_forward_inference();
            } else if (pcase_var.eql($$Backward_AssertionDirection)) {
                SubLObject cdolist_list_var = template_instantiations;
                SubLObject template_instantiation = NIL;
                template_instantiation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    tms.tms_change_direction(template_instantiation, $BACKWARD);
                    cdolist_list_var = cdolist_list_var.rest();
                    template_instantiation = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 15900L)
    public static SubLObject remove_rule_template_direction(SubLObject argument, SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject template = assertions_high.gaf_arg1(assertion);
            SubLObject cdolist_list_var;
            SubLObject template_instantiations = cdolist_list_var = rule_template_instantiations(template, mt);
            SubLObject template_instantiation = NIL;
            template_instantiation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                tms.tms_change_direction(template_instantiation, $BACKWARD);
                cdolist_list_var = cdolist_list_var.rest();
                template_instantiation = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 16300L)
    public static SubLObject rule_template_instantiations(SubLObject template, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject instantiations = NIL;
        SubLObject mt_var = mt;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject pred_var = $$trueRule;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(template, ONE_INTEGER, pred_var)) {
                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(template, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$1 = NIL;
                            SubLObject token_var_$2 = NIL;
                            while (NIL == done_var_$1) {
                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(ass));
                                if (NIL != valid_$3) {
                                    SubLObject set_contents_var = assertions_high.assertion_dependents(ass);
                                    SubLObject basis_object;
                                    SubLObject state;
                                    SubLObject deduction;
                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                            state); state = set_contents.do_set_contents_update_state(state)) {
                                        deduction = set_contents.do_set_contents_next(basis_object, state);
                                        if (NIL != set_contents.do_set_contents_element_validP(state, deduction) && NIL != rule_template_instantiation_deduction(deduction)) {
                                            instantiations = cons(deductions_high.deduction_supported_object(deduction), instantiations);
                                        }
                                    }
                                }
                                done_var_$1 = makeBoolean(NIL == valid_$3);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(instantiations);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 16800L)
    public static SubLObject rule_template_instantiation_deduction(SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : deduction;
        return Sequences.find_if(Symbols.symbol_function($sym69$TRUE_RULE_SUPPORT_P), deductions_high.deduction_supports(deduction), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 17000L)
    public static SubLObject remove_dependent_term(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            SubLObject dependent_term = assertions_high.gaf_arg1(assertion);
            if (NIL != forts.fort_p(dependent_term) && NIL == hl_macros.fort_being_removedP(dependent_term)) {
                SubLObject independent_term = assertions_high.gaf_arg2(assertion);
                if (NIL != forts.fort_p(independent_term) && NIL != hl_macros.fort_being_removed_or_will_be_removedP(independent_term)) {
                    return cyc_kernel.cyc_kill(dependent_term);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 17700L)
    public static SubLObject propagate_to_arity(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$arity, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 17900L)
    public static SubLObject add_arity(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.true_assertionP(assertion) && NIL != assertions_high.only_argument_of_assertion_p(assertion, argument)) {
            SubLObject relation = assertions_high.gaf_arg1(assertion);
            SubLObject v_arity = assertions_high.gaf_arg2(assertion);
            arity.maybe_add_arity_for_relation(relation, v_arity);
        }
        return assertion;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 18200L)
    public static SubLObject remove_arity(SubLObject argument, SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            SubLObject relation = assertions_high.gaf_arg1(assertion);
            SubLObject v_arity = assertions_high.gaf_arg2(assertion);
            arity.maybe_remove_arity_for_relation(relation, v_arity);
        }
        return assertion;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 18500L)
    public static SubLObject propagate_to_arity_min(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$arityMin, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 18700L)
    public static SubLObject add_arity_min(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.true_assertionP(assertion) && NIL != assertions_high.only_argument_of_assertion_p(assertion, argument)) {
            SubLObject relation = assertions_high.gaf_arg1(assertion);
            SubLObject arity_min = assertions_high.gaf_arg2(assertion);
            arity.maybe_add_arity_min_for_relation(relation, arity_min);
        }
        return assertion;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 19000L)
    public static SubLObject remove_arity_min(SubLObject argument, SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            SubLObject relation = assertions_high.gaf_arg1(assertion);
            arity.maybe_remove_arity_min_for_relation(relation);
        }
        return assertion;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 19300L)
    public static SubLObject propagate_to_arity_max(SubLObject argument, SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$arityMax, assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 19500L)
    public static SubLObject add_arity_max(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.true_assertionP(assertion) && NIL != assertions_high.only_argument_of_assertion_p(assertion, argument)) {
            SubLObject relation = assertions_high.gaf_arg1(assertion);
            SubLObject arity_max = assertions_high.gaf_arg2(assertion);
            arity.maybe_add_arity_max_for_relation(relation, arity_max);
        }
        return assertion;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 19800L)
    public static SubLObject remove_arity_max(SubLObject argument, SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            SubLObject relation = assertions_high.gaf_arg1(assertion);
            arity.maybe_remove_arity_max_for_relation(relation);
        }
        return assertion;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 20100L)
    public static SubLObject inter_arg_isa_after_adding(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_isa_assertion_somewhere_cache_add(reln);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 20400L)
    public static SubLObject inter_arg_isa_after_removing(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_isa_assertion_somewhere_cache_maybe_remove(reln);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 20600L)
    public static SubLObject inter_arg_format_after_adding(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_format_assertion_somewhere_cache_add(reln);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 21000L)
    public static SubLObject inter_arg_format_after_removing(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_format_assertion_somewhere_cache_maybe_remove(reln);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 21200L)
    public static SubLObject add_to_contraction_ht(SubLObject argument, SubLObject assertion) {
        return tersifier.add_assertion_to_contraction_ht(assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 21600L)
    public static SubLObject remove_from_contraction_ht(SubLObject argument, SubLObject assertion) {
        return tersifier.remove_assertion_from_contraction_ht(assertion);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 21900L)
    public static SubLObject add_gen_template_expansion(SubLObject argument, SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject reln = assertions_high.gaf_arg1(assertion);
            if (NIL != pph_functions.pph_phrase_fnP(reln, UNPROVIDED)) {
                pph_templates.reinitialize_gen_templates_referencing_phrase_fn(reln);
            }
        }
        return assertion;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 22300L)
    public static SubLObject remove_gen_template_expansion(SubLObject argument, SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject reln = assertions_high.gaf_arg1(assertion);
            if (NIL != pph_functions.pph_phrase_fnP(reln, UNPROVIDED)) {
                pph_templates.reinitialize_gen_templates_referencing_phrase_fn(reln);
            }
        }
        return assertion;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 22600L)
    public static SubLObject add_expansion_axiom(SubLObject argument, SubLObject meta_assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != after_adding.initial_assertion_argumentP(argument, meta_assertion) && NIL != assertion_utilities.true_assertionP(meta_assertion)) {
            SubLObject rm_pred = assertions_high.gaf_arg1(meta_assertion);
            SubLObject assertion = assertions_high.gaf_arg2(meta_assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if (NIL == kb_mapping_utilities.fpred_value_in_relevant_mts(rm_pred, $$expansion, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                SubLObject add_expansion_axiom_assertion = czer_utilities.safe_find_gaf_genl_mts($list92, mt);
                SubLObject validP = T;
                if (NIL != add_expansion_axiom_assertion) {
                    SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                    SubLObject sibling_expansion_axioms = Sequences.remove(assertion, kb_mapping_utilities.pred_values_in_relevant_mts(rm_pred, $$expansionAxiom, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cnfs = NIL;
                    SubLObject expansion = NIL;
                    if (NIL != sibling_expansion_axioms) {
                        SubLObject invalidP = NIL;
                        if (NIL == invalidP) {
                            SubLObject csome_list_var;
                            SubLObject sibling_expansion_axiom;
                            for (csome_list_var = sibling_expansion_axioms, sibling_expansion_axiom = NIL, sibling_expansion_axiom = csome_list_var.first(); NIL == invalidP
                                    && NIL != csome_list_var; invalidP = makeBoolean(!formula.equal(uncanonicalizer.assertion_el_formula(sibling_expansion_axiom))), csome_list_var = csome_list_var.rest(), sibling_expansion_axiom = csome_list_var.first()) {
                            }
                        }
                        validP = makeBoolean(NIL == invalidP);
                    }
                    if (NIL != validP) {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind($sym94$RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            wff.reset_wff_state();
                            cnfs = clausifier.clausal_form(formula, mt, $CNF);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                        if (cnfs.isList() && NIL != list_utilities.singletonP(Sequences.remove_duplicates(Mapping.mapcar(Symbols.symbol_function($sym96$NEG_LITS), cnfs), Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            SubLObject pred_neg_lit = NIL;
                            SubLObject blist = NIL;
                            SubLObject cnf = cnfs.first();
                            SubLObject neg_lits = clauses.neg_lits(cnf);
                            if (NIL == pred_neg_lit) {
                                SubLObject csome_list_var2 = neg_lits;
                                SubLObject neg_lit = NIL;
                                neg_lit = csome_list_var2.first();
                                while (NIL == pred_neg_lit && NIL != csome_list_var2) {
                                    if (rm_pred.eql(el_utilities.literal_arg0(neg_lit, UNPROVIDED))) {
                                        SubLObject argnum = ZERO_INTEGER;
                                        SubLObject non_varP = NIL;
                                        if (NIL == non_varP) {
                                            SubLObject csome_list_var_$5 = el_utilities.literal_args(neg_lit, UNPROVIDED);
                                            SubLObject arg = NIL;
                                            arg = csome_list_var_$5.first();
                                            while (NIL == non_varP && NIL != csome_list_var_$5) {
                                                argnum = Numbers.add(argnum, ONE_INTEGER);
                                                if (NIL != cycl_variables.el_varP(arg)) {
                                                    blist = cons(cons(arg, at_utilities.get_generic_arg(argnum)), blist);
                                                } else {
                                                    non_varP = T;
                                                }
                                                csome_list_var_$5 = csome_list_var_$5.rest();
                                                arg = csome_list_var_$5.first();
                                            }
                                        }
                                        if (NIL == non_varP) {
                                            pred_neg_lit = neg_lit;
                                        }
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    neg_lit = csome_list_var2.first();
                                }
                            }
                            if (NIL != pred_neg_lit && NIL != blist) {
                                SubLObject _prev_bind_3 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
                                try {
                                    wff_vars.$permit_generic_arg_variablesP$.bind(T, thread);
                                    SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind($sym94$RELEVANT_MT_IS_GENL_MT, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        expansion = simplifier.simplify_cycl_sentence(conses_high.sublis(blist, conses_high.subst($$True, pred_neg_lit, formula, Symbols.symbol_function(EQUAL), UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    if (NIL != el_utilities.el_formula_p(expansion) && NIL != wff.el_wffP(expansion, mt, UNPROVIDED) && NIL == list_utilities.tree_find(rm_pred, expansion, UNPROVIDED, UNPROVIDED)) {
                                        fi.fi_add_argument_int(list($$expansion, rm_pred, expansion), mt, list(meta_assertion, add_expansion_axiom_assertion), $FORWARD, T);
                                    }
                                } finally {
                                    wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 25600L)
    public static SubLObject cyc_add_reformulation_assertion(SubLObject argument, SubLObject assertion) {
        if (NIL != after_adding.initial_assertion_argumentP(argument, assertion) && NIL != reformulator_datastructures.reformulator_initializedP() && NIL != reformulator_datastructures.reformulator_relevant_assertionP(assertion)) {
            reformulator_datastructures.add_reformulation_assertion(assertion);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 26200L)
    public static SubLObject cyc_remove_reformulation_assertion(SubLObject argument, SubLObject assertion) {
        if (NIL != after_adding.final_assertion_argumentP(argument, assertion) && NIL != reformulator_datastructures.reformulator_initializedP()) {
            reformulator_datastructures.remove_reformulation_assertion(assertion);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 26500L)
    public static SubLObject cyc_add_element_of(SubLObject argument, SubLObject assertion) {
        if (NIL != after_adding.initial_assertion_argumentP(argument, assertion) && NIL != assertion_utilities.true_assertionP(assertion)) {
            SubLObject eo_formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject current;
            SubLObject datum = current = eo_formula;
            SubLObject eo = NIL;
            SubLObject v_term = NIL;
            SubLObject setexpr = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list101);
            eo = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list101);
            v_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list101);
            setexpr = current.first();
            current = current.rest();
            if (NIL == current) {
                if (eo.eql($$elementOf) && NIL != el_utilities.el_formula_with_operator_p(setexpr, $$TheSetOf)) {
                    SubLObject current_$8;
                    SubLObject datum_$7 = current_$8 = setexpr;
                    SubLObject tso = NIL;
                    SubLObject var = NIL;
                    SubLObject prop = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, $list104);
                    tso = current_$8.first();
                    current_$8 = current_$8.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, $list104);
                    var = current_$8.first();
                    current_$8 = current_$8.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, $list104);
                    prop = current_$8.first();
                    current_$8 = current_$8.rest();
                    if (NIL == current_$8) {
                        SubLObject transformed_conclusion = cycl_utilities.expression_subst(v_term, var, prop, UNPROVIDED, UNPROVIDED);
                        fi.fi_add_argument_int(transformed_conclusion, mt, list(assertion), $FORWARD, T);
                    } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$7, $list104);
                    }
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list101);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 27300L)
    public static SubLObject clear_unit_multiplication_factor_caches(SubLObject argument, SubLObject assertion) {
        quantities.clear_get_definitional_unit_multiplication_factor();
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 27900L)
    public static SubLObject cyc_add_known_antecedent_rule(SubLObject argument, SubLObject assertion) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        SubLObject rule = assertions_high.gaf_arg1(assertion);
        assert NIL != assertions_high.rule_assertionP(rule) : rule;
        removal_modules_known_antecedent_rule.declare_known_antecedent_rule_removal_module_for_rule(rule, T);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 28400L)
    public static SubLObject cyc_remove_known_antecedent_rule(SubLObject argument, SubLObject assertion) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        SubLObject rule = assertions_high.gaf_arg1(assertion);
        assert NIL != assertions_high.rule_assertionP(rule) : rule;
        removal_modules_known_antecedent_rule.undeclare_known_antecedent_rule_removal_module_for_rule(rule, T);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 28800L)
    public static SubLObject add_merged_constant_guid(SubLObject argument, SubLObject assertion) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        SubLObject constant = assertions_high.gaf_arg1(assertion);
        SubLObject guid_string = assertions_high.gaf_arg2(assertion);
        SubLObject guid = Guids.string_to_guid(guid_string);
        if (isConstSym(constant) && !isConstSym(constants_high.find_constant_by_guid(guid))) {
            constants_low.install_constant_merged_guid(constant, guid);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 29400L)
    public static SubLObject remove_merged_constant_guid(SubLObject argument, SubLObject assertion) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        SubLObject constant = assertions_high.gaf_arg1(assertion);
        SubLObject guid_string = assertions_high.gaf_arg2(assertion);
        SubLObject guid = Guids.string_to_guid(guid_string);
        if (isConstSym(constant) && !isConstSym(constants_high.find_constant_by_guid(guid))) {
            constants_low.uninstall_constant_merged_guid(constant, guid);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 30000L)
    public static SubLObject cyc_except_mt_added(SubLObject argument, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != after_adding.initial_assertion_argumentP(argument, assertion) && NIL != assertion_utilities.true_assertionP(assertion)) {
            if (NIL != hl_transcript_tracing.within_hl_evalP()) {
                return NIL;
            }
            if (NIL == fi_edit.$within_fi_edit_add_old_exceptP$.getDynamicValue(thread)) {
                SubLObject sub_assertions = NIL;
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(assertions_high.gaf_arg1(assertion));
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(assertions_high.gaf_arg1(assertion), NIL)) {
                        SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(assertions_high.gaf_arg1(assertion));
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject sub_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(sub_assertion));
                                if (NIL != valid) {
                                    sub_assertions = cons(sub_assertion, sub_assertions);
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } finally {
                            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else if (pcase_var.eql($BROAD_MT) && NIL != kb_mapping_macros.do_broad_mt_index_key_validator(assertions_high.gaf_arg1(assertion), NIL)) {
                    SubLObject idx = assertion_handles.do_assertions_table();
                    SubLObject mess = $str116$do_broad_mt_index;
                    SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != Types.stringp(mess) : mess;
                    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            SubLObject idx_$9 = idx;
                            if (NIL == id_index.id_index_objects_empty_p(idx_$9, $SKIP)) {
                                SubLObject idx_$10 = idx_$9;
                                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$10);
                                    SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject sub_assertion2;
                                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                        a_id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                                        a_handle = Vectors.aref(vector_var, a_id);
                                        if (NIL == id_index.id_index_tombstone_p(a_handle) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                            if (NIL != id_index.id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            sub_assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion2, assertions_high.gaf_arg1(assertion), NIL, NIL)) {
                                                sub_assertions = cons(sub_assertion2, sub_assertions);
                                            }
                                            sofar = Numbers.add(sofar, ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                SubLObject idx_$11 = idx_$9;
                                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$11) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                    SubLObject sparse = id_index.id_index_sparse_objects(idx_$11);
                                    SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$11);
                                    SubLObject end_id = id_index.id_index_next_id(idx_$11);
                                    SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                        if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                            SubLObject sub_assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion3, assertions_high.gaf_arg1(assertion), NIL, NIL)) {
                                                sub_assertions = cons(sub_assertion3, sub_assertions);
                                            }
                                            sofar = Numbers.add(sofar, ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        a_id2 = Numbers.add(a_id2, ONE_INTEGER);
                                    }
                                }
                            }
                        } finally {
                            SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
                    }
                }
                assertion_utilities.remove_relevant_assertions_dependents(sub_assertions, assertions_high.assertion_mt(assertion));
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 31600L)
    public static SubLObject cyc_except_mt_removed(SubLObject argument, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != after_adding.final_assertion_argumentP(argument, assertion) && NIL != assertion_utilities.true_assertionP(assertion)) {
            if (NIL != hl_transcript_tracing.within_hl_evalP()) {
                return NIL;
            }
            SubLObject num_mt_index = kb_indexing.num_mt_index(assertions_high.gaf_arg1(assertion));
            if (ZERO_INTEGER.numL(num_mt_index) && num_mt_index.numL($cyc_except_mt_repropagate_mt_contents_cutoff$.getDynamicValue(thread))) {
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(assertions_high.gaf_arg1(assertion));
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(assertions_high.gaf_arg1(assertion), NIL)) {
                        SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(assertions_high.gaf_arg1(assertion));
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject sub_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(sub_assertion));
                                if (NIL != valid) {
                                    forward.queue_forward_assertion(sub_assertion);
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } finally {
                            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else if (pcase_var.eql($BROAD_MT) && NIL != kb_mapping_macros.do_broad_mt_index_key_validator(assertions_high.gaf_arg1(assertion), NIL)) {
                    SubLObject idx = assertion_handles.do_assertions_table();
                    SubLObject mess = $str116$do_broad_mt_index;
                    SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != Types.stringp(mess) : mess;
                    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            SubLObject idx_$13 = idx;
                            if (NIL == id_index.id_index_objects_empty_p(idx_$13, $SKIP)) {
                                SubLObject idx_$14 = idx_$13;
                                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
                                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$14);
                                    SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject sub_assertion2;
                                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                        a_id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                                        a_handle = Vectors.aref(vector_var, a_id);
                                        if (NIL == id_index.id_index_tombstone_p(a_handle) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                            if (NIL != id_index.id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            sub_assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion2, assertions_high.gaf_arg1(assertion), NIL, NIL)) {
                                                forward.queue_forward_assertion(sub_assertion2);
                                            }
                                            sofar = Numbers.add(sofar, ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                SubLObject idx_$15 = idx_$13;
                                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$15) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                    SubLObject sparse = id_index.id_index_sparse_objects(idx_$15);
                                    SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$15);
                                    SubLObject end_id = id_index.id_index_next_id(idx_$15);
                                    SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                        if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                            SubLObject sub_assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion3, assertions_high.gaf_arg1(assertion), NIL, NIL)) {
                                                forward.queue_forward_assertion(sub_assertion3);
                                            }
                                            sofar = Numbers.add(sofar, ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        a_id2 = Numbers.add(a_id2, ONE_INTEGER);
                                    }
                                }
                            }
                        } finally {
                            SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
                    }
                }
            } else {
                Errors.warn($str120$Skipping_propagating_mt_contents_, assertions_high.gaf_arg1(assertion));
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 32800L)
    public static SubLObject cyc_except_added(SubLObject argument, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != after_adding.initial_assertion_argumentP(argument, assertion) && NIL != assertion_utilities.true_assertionP(assertion)) {
            if (NIL != hl_transcript_tracing.within_hl_evalP()) {
                return NIL;
            }
            SubLObject sub_assertion = assertions_high.gaf_arg1(assertion);
            if (NIL != except_of_hl_gaf_p(assertion)) {
                add_hl_gaf_denial(sub_assertion, assertion);
            }
            if (NIL == fi_edit.$within_fi_edit_add_old_exceptP$.getDynamicValue(thread)) {
                assertion_utilities.remove_relevant_assertion_dependents(sub_assertion, assertions_high.assertion_mt(assertion));
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 33800L)
    public static SubLObject cyc_except_removed(SubLObject argument, SubLObject assertion) {
        if (NIL != after_adding.final_assertion_argumentP(argument, assertion) && NIL != assertion_utilities.true_assertionP(assertion)) {
            if (NIL != hl_transcript_tracing.within_hl_evalP()) {
                return NIL;
            }
            SubLObject sub_assertion = assertions_high.gaf_arg1(assertion);
            if (NIL != except_of_hl_gaf_p(assertion)) {
                rem_hl_gaf_denial(sub_assertion, assertion);
            }
            forward.queue_forward_assertion(sub_assertion);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 34500L)
    public static SubLObject hl_gaf_p(SubLObject v_object) {
        return makeBoolean(NIL != assertion_handles.assertion_p(v_object) && NIL != assertions_high.gaf_assertionP(v_object) && NIL != hl_supports.hl_predicate_p(assertions_high.gaf_predicate(v_object)));
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 34700L)
    public static SubLObject except_of_hl_gaf_p(SubLObject v_object) {
        if (NIL != assertion_handles.assertion_p(v_object) && NIL != assertions_high.gaf_assertionP(v_object) && NIL != kb_utilities.kbeq($$except, assertions_high.gaf_predicate(v_object))) {
            SubLObject sub_assertion = assertions_high.gaf_arg1(v_object);
            return makeBoolean(NIL != hl_gaf_p(sub_assertion) && NIL != hlmt.hlmt_equal(assertions_high.assertion_mt(v_object), assertions_high.assertion_mt(sub_assertion)));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 35000L)
    public static SubLObject add_hl_gaf_denial(SubLObject hl_gaf, SubLObject except) {
        SubLObject supports = list(except);
        SubLObject truth = $UNKNOWN;
        SubLObject denial_deduction = tms.tms_add_deduction_for_assertion(hl_gaf, supports, truth, UNPROVIDED, UNPROVIDED);
        return denial_deduction;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 35300L)
    public static SubLObject rem_hl_gaf_denial(SubLObject hl_gaf, SubLObject except) {
        SubLObject supports = list(except);
        SubLObject truth = $UNKNOWN;
        SubLObject denial_deduction = deductions_high.find_deduction(hl_gaf, supports, truth);
        if (NIL != deduction_handles.deduction_p(denial_deduction)) {
            tms.tms_remove_deduction(denial_deduction);
            return hl_gaf;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 35600L)
    public static SubLObject add_relation_instance_all(SubLObject argument, SubLObject assertion) {
        if (NIL != after_adding.initial_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_add_relation_instance_all_gaf(assertion);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 35900L)
    public static SubLObject remove_relation_instance_all(SubLObject argument, SubLObject assertion) {
        if (NIL != after_adding.final_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_remove_relation_instance_all_gaf(assertion);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 36100L)
    public static SubLObject add_relation_all_instance(SubLObject argument, SubLObject assertion) {
        if (NIL != after_adding.initial_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_add_relation_all_instance_gaf(assertion);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 36400L)
    public static SubLObject remove_relation_all_instance(SubLObject argument, SubLObject assertion) {
        if (NIL != after_adding.final_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_remove_relation_all_instance_gaf(assertion);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 36700L)
    public static SubLObject mark_constant_as_instantiated(SubLObject constant, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
            format_nil.force_format(T, $str130$__do_create_from_description_mark, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject result = NIL;
        if (isConstSym(constant)) {
            SubLObject sentence = el_utilities.make_binary_formula($$quotedIsa, constant, $$InstantiatedConstant);
            if (NIL != control_vars.$use_transcriptP$.getDynamicValue(thread)) {
                result = fi.fi_assert_int(sentence, $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                transcript_utilities.transcript_form(listS($sym134$FI_ASSERT, list($sym135$QUOTE, sentence), $list136), UNPROVIDED);
            } else {
                result = fi.fi_assert_int(sentence, $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != assertion) {
                fi.fi_add_argument_int(sentence, $$BookkeepingMt, list(assertion), assertions_high.assertion_direction(assertion), UNPROVIDED);
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 37400L)
    public static SubLObject cyc_create_new_instantiated_permanent(SubLObject constant_name, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
            format_nil.force_format(T, $str137$__do_create_from_description_crea, constant_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject constant = NIL;
        SubLObject cyclist = NIL;
        SubLObject time = NIL;
        SubLObject why = NIL;
        SubLObject second = NIL;
        if (NIL != control_vars.$use_transcriptP$.getDynamicValue(thread)) {
            SubLObject possible_fi_timestamp_assertion_op = operation_queues.local_queue_peek();
            if ($sym138$FI_TIMESTAMP_ASSERTION == possible_fi_timestamp_assertion_op.first()) {
                cyclist = list_utilities.quotify(encapsulation.unencapsulate(Eval.eval(nth(ONE_INTEGER, possible_fi_timestamp_assertion_op))));
                time = nth(TWO_INTEGER, possible_fi_timestamp_assertion_op);
                why = nth(THREE_INTEGER, possible_fi_timestamp_assertion_op);
                second = nth(FOUR_INTEGER, possible_fi_timestamp_assertion_op);
            } else {
                if (NIL == cyclist) {
                    cyclist = operation_communication.the_cyclist();
                }
                if (NIL == time) {
                    time = fi.the_date();
                }
                if (NIL == why) {
                    why = fi.ke_purpose();
                }
                if (NIL == second) {
                    second = fi.the_second();
                }
            }
        }
        if (NIL != control_vars.$use_transcriptP$.getDynamicValue(thread)) {
            constant = cyc_kernel.cyc_create_new_permanent(constant_name);
            fi.fi_timestamp_constant_int(cyclist, time, why, second);
            transcript_utilities.transcript_form(list($sym139$FI_TIMESTAMP_CONSTANT, cyclist, time, why, second), UNPROVIDED);
        } else {
            constant = cyc_kernel.cyc_create_new_ephemeral(constant_name);
        }
        mark_constant_as_instantiated(constant, assertion);
        return constant;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 39300L)
    public static SubLObject instantiated_constant_p(SubLObject v_object) {
        return makeBoolean(isConstSym(v_object) && NIL != isa.quoted_isa_in_any_mtP(v_object, $$InstantiatedConstant));
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 39400L)
    public static SubLObject possible_instantiated_constant_with_no_assertionsP(SubLObject constant) {
        return makeBoolean(isConstSym(constant) && kb_indexing.num_index(constant).isZero());
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 39600L)
    public static SubLObject instantiated_constant_with_one_assertionP(SubLObject constant) {
        return makeBoolean(isConstSym(constant) && NIL != instantiated_constant_p(constant) && NIL != number_utilities.onep(kb_indexing.num_index(constant)));
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 39800L)
    public static SubLObject possible_instantiated_constant_to_reuseP(SubLObject constant) {
        return makeBoolean(NIL != possible_instantiated_constant_with_no_assertionsP(constant) || NIL != instantiated_constant_with_one_assertionP(constant));
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 40000L)
    public static SubLObject do_create_from_description(SubLObject argument, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == after_adding.initial_assertion_argumentP(argument, assertion) || NIL == assertion_utilities.true_assertionP(assertion)) {
            return NIL;
        }
        if (NIL != hl_transcript_tracing.within_hl_evalP()) {
            return NIL;
        }
        if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread) && NIL != forward.current_forward_inference_rule()) {
            format_nil.force_format(T, $str140$__do_create_from_description_afte, el_utilities.sefify(forward.current_forward_inference_rule()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject constant_name = string_utilities.make_valid_constant_name(assertions_high.gaf_arg1(assertion), UNPROVIDED);
        SubLObject pred = assertions_high.gaf_arg2(assertion);
        SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject possible_constant = constants_high.find_constant(constant_name);
        SubLObject existing_terms = ask_utilities.query_variable($sym141$_TERM,
                el_utilities.make_binary_formula($$and, el_utilities.make_ist_sentence($$BookkeepingMt, el_utilities.make_binary_formula($$quotedIsa, $sym141$_TERM, $$InstantiatedConstant)), el_utilities.make_unary_formula(pred, $sym141$_TERM)), mt, UNPROVIDED);
        SubLObject v_term = NIL;
        if (NIL != list_utilities.member_kbeqP(possible_constant, existing_terms)) {
            if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str143$__do_create_from_description_reus, possible_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            v_term = possible_constant;
        } else if (NIL != existing_terms) {
            if (NIL != list_utilities.lengthG(existing_terms, ONE_INTEGER, UNPROVIDED)) {
                Errors.warn($str144$do_create_from_description_found_, existing_terms, pred);
            }
            if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str145$__do_create_from_description_reus, existing_terms.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            v_term = existing_terms.first();
        } else if (NIL != possible_instantiated_constant_with_no_assertionsP(possible_constant)) {
            if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str146$__do_create_from_description_reus, possible_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            mark_constant_as_instantiated(possible_constant, assertion);
            v_term = possible_constant;
        } else if (NIL != instantiated_constant_with_one_assertionP(possible_constant)) {
            if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str147$__do_create_from_description_reus, possible_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            mark_constant_as_instantiated(possible_constant, assertion);
            v_term = possible_constant;
        } else if (NIL != constant_handles.valid_constantP(possible_constant, UNPROVIDED)) {
            v_term = cyc_create_new_instantiated_permanent(constant_completion_high.uniquify_constant_name(constant_name, UNPROVIDED), assertion);
        } else {
            v_term = cyc_create_new_instantiated_permanent(constant_name, assertion);
        }
        SubLObject description_sentence = el_utilities.make_unary_formula(pred, v_term);
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
        SubLObject _prev_bind_3 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(T, thread);
            wff_vars.$wff_mode$.bind($ASSERTIVE, thread);
            result = fi.fi_add_argument_int(description_sentence, mt, list(assertion), assertions_high.assertion_direction(assertion), UNPROVIDED);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_3, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 43600L)
    public static SubLObject expression_instantiated_constant_count(SubLObject expression) {
        return Sequences.length(cycl_utilities.expression_gather(expression, $sym150$INSTANTIATED_CONSTANT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 43800L)
    public static SubLObject expression_has_instantiated_constantP(SubLObject expression) {
        return Numbers.plusp(expression_instantiated_constant_count(expression));
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 43900L)
    public static SubLObject do_create_from_description_multiple(SubLObject argument, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == after_adding.initial_assertion_argumentP(argument, assertion) || NIL == assertion_utilities.true_assertionP(assertion)) {
            return NIL;
        }
        if (NIL != hl_transcript_tracing.within_hl_evalP()) {
            return NIL;
        }
        SubLObject pred = assertions_high.gaf_arg2(assertion);
        SubLObject constant_names = el_utilities.el_list_items(assertions_high.gaf_arg1(assertion));
        SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject possible_constants = Mapping.mapcar($sym151$FIND_CONSTANT, Mapping.mapcar($sym152$MAKE_VALID_CONSTANT_NAME, constant_names));
        SubLObject el_vars = (NIL != el_utilities.kappa_predicate_p(pred)) ? el_utilities.kappa_predicate_formal_args(pred) : el_utilities.sentence_free_variables(assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject existing_terms = ask_utilities.query_template(el_vars, make_do_create_from_description_query(el_vars, pred), mt, UNPROVIDED);
        SubLObject terms = NIL;
        if (NIL != subl_promotions.memberP(possible_constants, existing_terms, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
            terms = possible_constants;
        } else if (NIL != existing_terms) {
            if (NIL != list_utilities.lengthG(existing_terms, ONE_INTEGER, UNPROVIDED)) {
                Errors.warn($str153$do_create_from_description_multip, existing_terms, pred);
            }
            terms = Sort.sort(existing_terms, $sym154$_, $sym155$EXPRESSION_INSTANTIATED_CONSTANT_COUNT).first();
        } else if (NIL != list_utilities.every_in_list($sym156$POSSIBLE_INSTANTIATED_CONSTANT_TO_REUSE_, possible_constants, UNPROVIDED)) {
            SubLObject cdolist_list_var = possible_constants;
            SubLObject constant = NIL;
            constant = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                mark_constant_as_instantiated(constant, assertion);
                cdolist_list_var = cdolist_list_var.rest();
                constant = cdolist_list_var.first();
            }
            terms = possible_constants;
        } else if (NIL != list_utilities.any_in_list($sym157$VALID_CONSTANT_, possible_constants, UNPROVIDED)) {
            SubLObject cdolist_list_var = constant_names;
            SubLObject constant_name = NIL;
            constant_name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                terms = cons(cyc_create_new_instantiated_permanent(constant_completion_high.uniquify_constant_name(constant_name, UNPROVIDED), assertion), terms);
                cdolist_list_var = cdolist_list_var.rest();
                constant_name = cdolist_list_var.first();
            }
            terms = Sequences.nreverse(terms);
        } else {
            SubLObject cdolist_list_var = constant_names;
            SubLObject constant_name = NIL;
            constant_name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                terms = cons(cyc_create_new_instantiated_permanent(constant_name, assertion), terms);
                cdolist_list_var = cdolist_list_var.rest();
                constant_name = cdolist_list_var.first();
            }
            terms = Sequences.nreverse(terms);
        }
        SubLObject description_sentence = cons(pred, terms);
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
        SubLObject _prev_bind_3 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(T, thread);
            wff_vars.$wff_mode$.bind($ASSERTIVE, thread);
            result = fi.fi_add_argument_int(description_sentence, mt, list(assertion), assertions_high.assertion_direction(assertion), UNPROVIDED);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_3, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 46800L)
    public static SubLObject make_do_create_from_description_query(SubLObject el_vars, SubLObject pred) {
        SubLObject conjuncts = NIL;
        conjuncts = cons(cons(pred, el_vars), conjuncts);
        SubLObject cdolist_list_var = el_vars;
        SubLObject el_var = NIL;
        el_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            conjuncts = cons(el_utilities.make_ist_sentence($$BookkeepingMt, el_utilities.make_binary_formula($$quotedIsa, el_var, $$InstantiatedConstant)), conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            el_var = cdolist_list_var.first();
        }
        return el_utilities.make_conjunction(conjuncts);
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 47400L)
    public static SubLObject constant_instantiated_from_subcollection_expression_p(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(isConstSym(v_object) && NIL != string_utilities.starts_with(constants_high.constant_name(v_object), $instantiate_from_subcollection_expression_constant_prefix$.getDynamicValue(thread)));
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 47600L)
    public static SubLObject instantiate_from_subcollection_expression(SubLObject argument, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != after_adding.initial_assertion_argumentP(argument, assertion) && NIL != assertion_utilities.true_assertionP(assertion)) {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject raw_subcollection_expression = assertions_high.gaf_arg1(assertion);
            SubLObject result = NIL;
            thread.resetMultipleValues();
            SubLObject subcollection_expression = el_utilities.possibly_unquote_closed_formula(raw_subcollection_expression);
            SubLObject subcollection_expression_quotedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            subcollection_expression = cycl_utilities.expression_transform(subcollection_expression, $sym160$NART_P, $sym161$NART_EL_FORMULA, UNPROVIDED, UNPROVIDED);
            SubLObject raw_unwound_sentence = subcollection_unwinder.scg_subcl_expand_signature_int(subcollection_expression);
            SubLObject el_vars = el_utilities.sentence_free_variables(raw_unwound_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject existing_terms_list = ask_utilities.query_template(el_vars, raw_unwound_sentence, mt, UNPROVIDED);
            SubLObject existing_terms = NIL;
            if (NIL != list_utilities.singletonP(existing_terms_list)) {
                existing_terms = existing_terms_list.first();
            } else if (NIL != list_utilities.sublisp_boolean(existing_terms_list)) {
                SubLObject existing_terms_list_hash = Hashtables.make_hash_table(ZERO_INTEGER, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = existing_terms_list;
                SubLObject existing_terms_entry = NIL;
                existing_terms_entry = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject inst_constant_count = cycl_utilities.expression_gather(existing_terms_entry, $sym162$CONSTANT_INSTANTIATED_FROM_SUBCOLLECTION_EXPRESSION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    hash_table_utilities.push_hash(Sequences.length(inst_constant_count), existing_terms_entry, existing_terms_list_hash);
                    cdolist_list_var = cdolist_list_var.rest();
                    existing_terms_entry = cdolist_list_var.first();
                }
                SubLObject counts = hash_table_utilities.hash_table_keys(existing_terms_list_hash);
                SubLObject max_count = (NIL != counts) ? Functions.apply($sym163$MAX, hash_table_utilities.hash_table_keys(existing_terms_list_hash)) : NIL;
                if (NIL != counts && ZERO_INTEGER.numL(max_count)) {
                    existing_terms_list = Hashtables.gethash(max_count, existing_terms_list_hash, UNPROVIDED);
                    if (NIL != list_utilities.lengthG(existing_terms_list, ONE_INTEGER, UNPROVIDED)) {
                        Errors.warn($str164$More_than_one_terms_match_found_f, assertion, existing_terms_list);
                    }
                    existing_terms = existing_terms_list.first();
                }
            }
            if (NIL == existing_terms) {
                SubLObject variables_arg_constraints_dict = at_var_types.formula_variables_arg_constraints_dict(raw_unwound_sentence, mt, UNPROVIDED, UNPROVIDED);
                SubLObject constant_name_hash = Hashtables.make_hash_table(ZERO_INTEGER, UNPROVIDED, UNPROVIDED);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(variables_arg_constraints_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(
                        iteration_state)) {
                    thread.resetMultipleValues();
                    SubLObject variable = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    SubLObject isa_genl_qisa = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject v_isa = isa_genl_qisa.first();
                    SubLObject genl = conses_high.second(isa_genl_qisa);
                    SubLObject qisa = conses_high.third(isa_genl_qisa);
                    SubLObject cname_strings = NIL;
                    if (NIL != genl) {
                        cname_strings = Mapping.mapcar($sym165$FORT_NAME, genl);
                    } else if (NIL != v_isa) {
                        cname_strings = Mapping.mapcar($sym165$FORT_NAME, v_isa);
                    } else if (NIL != qisa) {
                        cname_strings = Mapping.mapcar($sym165$FORT_NAME, qisa);
                    } else {
                        cname_strings = $list166;
                    }
                    cname_strings = cons($instantiate_from_subcollection_expression_constant_prefix$.getDynamicValue(thread), cname_strings);
                    Hashtables.sethash(variable, constant_name_hash, string_utilities.make_valid_constant_name(string_utilities.bunge(cname_strings, Characters.CHAR_hyphen), UNPROVIDED));
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                SubLObject cdolist_list_var2 = el_vars;
                SubLObject el_var = NIL;
                el_var = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    existing_terms = ConsesLow.cons(cyc_create_new_instantiated_permanent(constant_completion_high.uniquify_constant_name(Hashtables.gethash(el_var, constant_name_hash, UNPROVIDED), UNPROVIDED), assertion), existing_terms);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    el_var = cdolist_list_var2.first();
                }
                existing_terms = Sequences.nreverse(existing_terms);
            }
            SubLObject bound_unwound_sentence = conses_high.copy_list(raw_unwound_sentence);
            SubLObject el_var2 = NIL;
            SubLObject el_var_$17 = NIL;
            SubLObject existing_term = NIL;
            SubLObject existing_term_$18 = NIL;
            el_var2 = el_vars;
            el_var_$17 = el_var2.first();
            existing_term = existing_terms;
            existing_term_$18 = existing_term.first();
            while (NIL != existing_term || NIL != el_var2) {
                bound_unwound_sentence = cycl_utilities.expression_subst(existing_term_$18, el_var_$17, bound_unwound_sentence, UNPROVIDED, UNPROVIDED);
                el_var2 = el_var2.rest();
                el_var_$17 = el_var2.first();
                existing_term = existing_term.rest();
                existing_term_$18 = existing_term.first();
            }
            SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
            SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
            SubLObject _prev_bind_3 = wff_vars.$wff_mode$.currentBinding(thread);
            try {
                kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
                czer_vars.$simplify_literalP$.bind(T, thread);
                wff_vars.$wff_mode$.bind($ASSERTIVE, thread);
                result = fi.fi_add_argument_int(bound_unwound_sentence, mt, list(assertion), assertions_high.assertion_direction(assertion), UNPROVIDED);
            } finally {
                wff_vars.$wff_mode$.rebind(_prev_bind_3, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 51300L)
    public static SubLObject show_constants_with_no_assertions() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject idx = constant_handles.do_constants_table();
        SubLObject mess = $str168$Finding_constants_with_no_asserti;
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp(mess) : mess;
        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                SubLObject idx_$19 = idx;
                if (NIL == id_index.id_index_objects_empty_p(idx_$19, $SKIP)) {
                    SubLObject idx_$20 = idx_$19;
                    if (NIL == id_index.id_index_dense_objects_empty_p(idx_$20, $SKIP)) {
                        SubLObject vector_var = id_index.id_index_dense_objects(idx_$20);
                        SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                            c = Vectors.aref(vector_var, id);
                            if (NIL == id_index.id_index_tombstone_p(c) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(c)) {
                                    c = $SKIP;
                                }
                                if (kb_indexing.num_index(c).isZero()) {
                                    print_high.print(constants_high.constant_name(c), UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    SubLObject idx_$21 = idx_$19;
                    if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$21) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        SubLObject sparse = id_index.id_index_sparse_objects(idx_$21);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$21);
                        SubLObject end_id = id_index.id_index_next_id(idx_$21);
                        SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            SubLObject c2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(c2)) {
                                if (kb_indexing.num_index(c2).isZero()) {
                                    print_high.print(constants_high.constant_name(c2), UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, ONE_INTEGER);
                        }
                    }
                }
            } finally {
                SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                }
            }
        } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 51600L)
    public static SubLObject kill_constants_with_no_assertions_by_prefix(SubLObject prefixes) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kill_count = ZERO_INTEGER;
        SubLObject result = NIL;
        SubLObject idx = constant_handles.do_constants_table();
        SubLObject mess = Sequences.cconcatenate($str169$Killing_constants_with_no_asserti, format_nil.format_nil_s_no_copy(prefixes));
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp(mess) : mess;
        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                SubLObject idx_$23 = idx;
                if (NIL == id_index.id_index_objects_empty_p(idx_$23, $SKIP)) {
                    SubLObject idx_$24 = idx_$23;
                    if (NIL == id_index.id_index_dense_objects_empty_p(idx_$24, $SKIP)) {
                        SubLObject vector_var = id_index.id_index_dense_objects(idx_$24);
                        SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        SubLObject constant_name;
                        SubLObject killedP;
                        SubLObject csome_list_var;
                        SubLObject prefix;
                        for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                            c = Vectors.aref(vector_var, id);
                            if (NIL == id_index.id_index_tombstone_p(c) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(c)) {
                                    c = $SKIP;
                                }
                                if (kb_indexing.num_index(c).isZero()) {
                                    constant_name = constants_high.constant_name(c);
                                    killedP = NIL;
                                    if (NIL == killedP) {
                                        csome_list_var = prefixes;
                                        prefix = NIL;
                                        prefix = csome_list_var.first();
                                        while (NIL == killedP && NIL != csome_list_var) {
                                            if (NIL != string_utilities.non_empty_stringP(prefix) && NIL != string_utilities.starts_with(constant_name, prefix)) {
                                                PrintLow.format(T, $str170$__Killing__A__, c);
                                                fi.fi_kill_int(c);
                                                kill_count = Numbers.add(kill_count, ONE_INTEGER);
                                                result = cons(constant_name, result);
                                                killedP = T;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            prefix = csome_list_var.first();
                                        }
                                    }
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    SubLObject idx_$25 = idx_$23;
                    if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$25) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        SubLObject sparse = id_index.id_index_sparse_objects(idx_$25);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$25);
                        SubLObject end_id = id_index.id_index_next_id(idx_$25);
                        SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            SubLObject c2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(c2)) {
                                if (kb_indexing.num_index(c2).isZero()) {
                                    SubLObject constant_name2 = constants_high.constant_name(c2);
                                    SubLObject killedP2 = NIL;
                                    if (NIL == killedP2) {
                                        SubLObject csome_list_var2 = prefixes;
                                        SubLObject prefix2 = NIL;
                                        prefix2 = csome_list_var2.first();
                                        while (NIL == killedP2 && NIL != csome_list_var2) {
                                            if (NIL != string_utilities.non_empty_stringP(prefix2) && NIL != string_utilities.starts_with(constant_name2, prefix2)) {
                                                PrintLow.format(T, $str170$__Killing__A__, c2);
                                                fi.fi_kill_int(c2);
                                                kill_count = Numbers.add(kill_count, ONE_INTEGER);
                                                result = cons(constant_name2, result);
                                                killedP2 = T;
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            prefix2 = csome_list_var2.first();
                                        }
                                    }
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, ONE_INTEGER);
                        }
                    }
                }
            } finally {
                SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                }
            }
        } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        PrintLow.format(T, $str171$___A_constants_killed__, kill_count);
        return result;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 52200L)
    public static SubLObject show_unused_instantiated_constants() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject idx = constant_handles.do_constants_table();
        SubLObject mess = $str172$Finding_instantiated_constants_wi;
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp(mess) : mess;
        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                SubLObject idx_$27 = idx;
                if (NIL == id_index.id_index_objects_empty_p(idx_$27, $SKIP)) {
                    SubLObject idx_$28 = idx_$27;
                    if (NIL == id_index.id_index_dense_objects_empty_p(idx_$28, $SKIP)) {
                        SubLObject vector_var = id_index.id_index_dense_objects(idx_$28);
                        SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                            c = Vectors.aref(vector_var, id);
                            if (NIL == id_index.id_index_tombstone_p(c) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(c)) {
                                    c = $SKIP;
                                }
                                if (NIL != number_utilities.onep(kb_indexing.num_index(c)) && NIL != instantiated_constant_p(c)) {
                                    print_high.print(constants_high.constant_name(c), UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    SubLObject idx_$29 = idx_$27;
                    if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$29) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        SubLObject sparse = id_index.id_index_sparse_objects(idx_$29);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$29);
                        SubLObject end_id = id_index.id_index_next_id(idx_$29);
                        SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            SubLObject c2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(c2)) {
                                if (NIL != number_utilities.onep(kb_indexing.num_index(c2)) && NIL != instantiated_constant_p(c2)) {
                                    print_high.print(constants_high.constant_name(c2), UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, ONE_INTEGER);
                        }
                    }
                }
            } finally {
                SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 52500L)
    public static SubLObject forget_unused_instantiated_constants() {
        if (NIL != constant_handles.valid_constant($$InstantiatedConstant, T)) {
            return kill_unused_instantiated_constants();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 52600L)
    public static SubLObject kill_unused_instantiated_constants() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_instances = NIL;
        SubLObject candidates = NIL;
        SubLObject removed = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym173$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject str = $str175$Gathering_instantiated_constants;
            SubLObject _prev_bind_0_$31 = utilities_macros.$progress_start_time$.currentBinding(thread);
            SubLObject _prev_bind_1_$32 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind(T, thread);
                utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                utilities_macros.noting_progress_preamble(str);
                v_instances = isa.all_quoted_instances($$InstantiatedConstant, UNPROVIDED, UNPROVIDED);
                utilities_macros.noting_progress_postamble();
            } finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$32, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$31, thread);
            }
            if (NIL != v_instances) {
                SubLObject list_var = v_instances;
                SubLObject _prev_bind_0_$32 = utilities_macros.$progress_note$.currentBinding(thread);
                SubLObject _prev_bind_1_$33 = utilities_macros.$progress_start_time$.currentBinding(thread);
                SubLObject _prev_bind_9 = utilities_macros.$progress_total$.currentBinding(thread);
                SubLObject _prev_bind_10 = utilities_macros.$progress_sofar$.currentBinding(thread);
                SubLObject _prev_bind_11 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                SubLObject _prev_bind_12 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                SubLObject _prev_bind_13 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                SubLObject _prev_bind_14 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind($str176$Identifying_unused_instantiated_c, thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject v_term = NIL;
                        v_term = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if (isConstSym(v_term) && NIL != number_utilities.onep(kb_indexing.num_index(v_term))) {
                                candidates = cons(v_term, candidates);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            v_term = csome_list_var.first();
                        }
                    } finally {
                        SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                            SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                        }
                    }
                } finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_14, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_13, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_12, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$33, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$32, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject candidate_count = Sequences.length(candidates);
        SubLObject msg = Sequences.cconcatenate($str178$Removing_, new SubLObject[] { format_nil.format_nil_a_no_copy(candidate_count), $str179$_unused_instantiated_constant, format_nil.format_nil_a_no_copy((NIL != number_utilities.onep(candidate_count)) ? $str180$ : $str181$s) });
        SubLObject list_var2 = candidates;
        SubLObject _prev_bind_15 = utilities_macros.$progress_note$.currentBinding(thread);
        SubLObject _prev_bind_16 = utilities_macros.$progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((NIL != msg) ? msg : $str177$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var2), thread);
            utilities_macros.$progress_sofar$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var2 = list_var2;
                SubLObject c = NIL;
                c = csome_list_var2.first();
                while (NIL != csome_list_var2) {
                    SubLObject constant_name = constants_high.constant_name(c);
                    PrintLow.format(T, $str170$__Killing__A__, constant_name);
                    cyc_kernel.cyc_kill(c);
                    removed = cons(constant_name, removed);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var2 = csome_list_var2.rest();
                    c = csome_list_var2.first();
                }
            } finally {
                SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_16, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_15, thread);
        }
        return removed;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 53500L)
    public static SubLObject assert_missing_quoted_isa_instantiated_constant_assertions() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym173$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = $list190;
            SubLObject do_create_predicate = NIL;
            do_create_predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject pred_var = do_create_predicate;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    SubLObject str = NIL;
                    SubLObject _prev_bind_0_$37 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    SubLObject _prev_bind_1_$38 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind(T, thread);
                        utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                        utilities_macros.noting_progress_preamble(str);
                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$39 = NIL;
                                    SubLObject token_var_$40 = NIL;
                                    while (NIL == done_var_$39) {
                                        SubLObject do_create_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                        SubLObject valid_$41 = makeBoolean(!token_var_$40.eql(do_create_assertion));
                                        if (NIL != valid_$41 && NIL == list_utilities.member_kbeqP(assertions_high.assertion_mt(do_create_assertion), $list182)) {
                                            SubLObject do_create_dependents = Mapping.mapcar($sym183$DEDUCTION_SUPPORTED_OBJECT, assertions_high.assertion_dependents(do_create_assertion));
                                            SubLObject instantiated_constant_gafs = NIL;
                                            SubLObject cdolist_list_var_$42 = do_create_dependents;
                                            SubLObject do_create_dependent = NIL;
                                            do_create_dependent = cdolist_list_var_$42.first();
                                            while (NIL != cdolist_list_var_$42) {
                                                if (NIL != assertion_utilities.gaf_assertion_with_pred_p(do_create_dependent, $$quotedIsa) && NIL != kb_utilities.kbeq($$InstantiatedConstant, assertions_high.gaf_arg2(do_create_dependent))) {
                                                    instantiated_constant_gafs = cons(do_create_dependent, instantiated_constant_gafs);
                                                }
                                                cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                                                do_create_dependent = cdolist_list_var_$42.first();
                                            }
                                            if (NIL == instantiated_constant_gafs) {
                                                SubLObject all_dependent_el_formulas = Mapping.mapcar($sym184$ASSERTION_EL_FORMULA, do_create_dependents);
                                                SubLObject possible_instantiated_constants = list_utilities.intersect_all(all_dependent_el_formulas, UNPROVIDED, UNPROVIDED);
                                                SubLObject add_quoted_isasP = NIL;
                                                if (NIL != kb_utilities.kbeq(do_create_predicate, $$doCreateFromDescription) && NIL != list_utilities.singletonP(possible_instantiated_constants)) {
                                                    add_quoted_isasP = T;
                                                } else if (NIL != kb_utilities.kbeq(do_create_predicate, $$doCreateFromDescription_Multiple) && NIL != list_utilities.lengthG(possible_instantiated_constants, ONE_INTEGER, UNPROVIDED)) {
                                                    add_quoted_isasP = T;
                                                } else if (NIL != kb_utilities.kbeq(do_create_predicate, $$doCreateFromDescription_Multiple)) {
                                                    Errors.warn($str187$could_not_determine_created_const, do_create_assertion);
                                                }
                                                if (NIL != add_quoted_isasP) {
                                                    SubLObject cdolist_list_var_$43 = possible_instantiated_constants;
                                                    SubLObject possible_instantiated_constant = NIL;
                                                    possible_instantiated_constant = cdolist_list_var_$43.first();
                                                    while (NIL != cdolist_list_var_$43) {
                                                        count = Numbers.add(count, ONE_INTEGER);
                                                        mark_constant_as_instantiated(possible_instantiated_constant, do_create_assertion);
                                                        cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                                        possible_instantiated_constant = cdolist_list_var_$43.first();
                                                    }
                                                }
                                            } else if (NIL != kb_utilities.kbeq(do_create_predicate, $$doCreateFromDescription) && NIL != list_utilities.lengthG(instantiated_constant_gafs, ONE_INTEGER, UNPROVIDED)) {
                                                Errors.warn($str188$too_many_instantiated_constant_ga);
                                            } else if (NIL != kb_utilities.kbeq(do_create_predicate, $$doCreateFromDescription_Multiple) && NIL != list_utilities.singletonP(instantiated_constant_gafs)) {
                                                Errors.warn($str189$not_enough_instantiated_constant_);
                                            }
                                        }
                                        done_var_$39 = makeBoolean(NIL == valid_$41);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    } finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$38, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$37, thread);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                do_create_predicate = cdolist_list_var.first();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 55700L)
    public static SubLObject retain_mt_contents(SubLObject argument, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != after_adding.initial_assertion_argumentP(argument, assertion) && NIL != assertion_utilities.true_assertionP(assertion)) {
            SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
            SubLObject _prev_bind_2 = after_adding.$after_addings_disabledP$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                after_adding.$after_addings_disabledP$.bind(T, thread);
                SubLObject v_hlmt = assertions_high.gaf_arg1(assertion);
                SubLObject _prev_bind_0_$45 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1_$46 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind($sym191$RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(v_hlmt, thread);
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(list_utilities.flatten(v_hlmt), UNPROVIDED);
                    SubLObject mt_assertion = NIL;
                    mt_assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != hlmt.hlmt_equalP(v_hlmt, hlmt.assertion_hlmt(mt_assertion))) {
                            cyc_kernel.cyc_add_argument(fi.assertion_hl_formula(mt_assertion, UNPROVIDED), list(assertion), assertions_high.assertion_mt(mt_assertion), $list192, UNPROVIDED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mt_assertion = cdolist_list_var.first();
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$46, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$45, thread);
                }
            } finally {
                after_adding.$after_addings_disabledP$.rebind(_prev_bind_2, thread);
                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject declare_after_adding_modules_file() {
        declareFunction("decache_after_addings", "DECACHE-AFTER-ADDINGS", 2, 0, false);
        declareFunction("decache_after_removings", "DECACHE-AFTER-REMOVINGS", 2, 0, false);
        declareFunction("decache_rule_after_addings", "DECACHE-RULE-AFTER-ADDINGS", 2, 0, false);
        declareFunction("decache_rule_after_removings", "DECACHE-RULE-AFTER-REMOVINGS", 2, 0, false);
        declareFunction("clear_mt_dependent_caches", "CLEAR-MT-DEPENDENT-CACHES", 2, 0, false);
        declareFunction("possibly_clear_mt_dependent_caches", "POSSIBLY-CLEAR-MT-DEPENDENT-CACHES", 2, 0, false);
        declareFunction("clear_mt_dependent_caches_int", "CLEAR-MT-DEPENDENT-CACHES-INT", 2, 0, false);
        declareFunction("clear_genls_dependent_caches", "CLEAR-GENLS-DEPENDENT-CACHES", 2, 0, false);
        declareFunction("clear_isa_dependent_caches", "CLEAR-ISA-DEPENDENT-CACHES", 2, 0, false);
        new $clear_isa_dependent_caches$BinaryFunction();
        declareFunction("clear_isa_dependent_caches_internal", "CLEAR-ISA-DEPENDENT-CACHES-INTERNAL", 0, 0, false);
        declareFunction("clear_quoted_isa_dependent_caches", "CLEAR-QUOTED-ISA-DEPENDENT-CACHES", 2, 0, false);
        declareFunction("clear_quoted_isa_dependent_caches_internal", "CLEAR-QUOTED-ISA-DEPENDENT-CACHES-INTERNAL", 0, 0, false);
        declareFunction("clear_genl_pred_dependent_caches", "CLEAR-GENL-PRED-DEPENDENT-CACHES", 2, 0, false);
        declareFunction("add_transitive_via_arg", "ADD-TRANSITIVE-VIA-ARG", 2, 0, false);
        declareFunction("remove_transitive_via_arg", "REMOVE-TRANSITIVE-VIA-ARG", 2, 0, false);
        declareFunction("add_transitive_via_arg_inverse", "ADD-TRANSITIVE-VIA-ARG-INVERSE", 2, 0, false);
        declareFunction("remove_transitive_via_arg_inverse", "REMOVE-TRANSITIVE-VIA-ARG-INVERSE", 2, 0, false);
        declareFunction("clear_cached_tva_checks", "CLEAR-CACHED-TVA-CHECKS", 2, 0, false);
        declareFunction("clear_cached_some_tva_checks", "CLEAR-CACHED-SOME-TVA-CHECKS", 2, 0, false);
        declareFunction("clear_cached_cva_checks", "CLEAR-CACHED-CVA-CHECKS", 2, 0, false);
        declareFunction("clear_cached_some_cva_checks", "CLEAR-CACHED-SOME-CVA-CHECKS", 2, 0, false);
        declareFunction("skolem_after_removing", "SKOLEM-AFTER-REMOVING", 2, 0, false);
        declareFunction("add_old_constant_name", "ADD-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction("remove_old_constant_name", "REMOVE-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction("propagate_to_isa", "PROPAGATE-TO-ISA", 2, 0, false);
        declareFunction("propagate_to_genls", "PROPAGATE-TO-GENLS", 2, 0, false);
        declareFunction("propagate_to_disjointwith", "PROPAGATE-TO-DISJOINTWITH", 2, 0, false);
        declareFunction("propagate_to_genlmt", "PROPAGATE-TO-GENLMT", 2, 0, false);
        declareFunction("propagate_to_genlpreds", "PROPAGATE-TO-GENLPREDS", 2, 0, false);
        declareFunction("propagate_to_negationpreds", "PROPAGATE-TO-NEGATIONPREDS", 2, 0, false);
        declareFunction("propagate_to_genlinverse", "PROPAGATE-TO-GENLINVERSE", 2, 0, false);
        declareFunction("propagate_to_negationinverse", "PROPAGATE-TO-NEGATIONINVERSE", 2, 0, false);
        declareFunction("propagate_inverse_to_isa", "PROPAGATE-INVERSE-TO-ISA", 2, 0, false);
        declareFunction("propagate_inverse_to_genls", "PROPAGATE-INVERSE-TO-GENLS", 2, 0, false);
        declareFunction("propagate_inverse_to_genlmt", "PROPAGATE-INVERSE-TO-GENLMT", 2, 0, false);
        declareFunction("propagate_inverse_to_genlpreds", "PROPAGATE-INVERSE-TO-GENLPREDS", 2, 0, false);
        declareFunction("propagate_inverse_to_genlinverse", "PROPAGATE-INVERSE-TO-GENLINVERSE", 2, 0, false);
        declareFunction("propagate_sbhl_spec_pred_uses", "PROPAGATE-SBHL-SPEC-PRED-USES", 2, 0, false);
        declareFunction("propagate_sbhl_spec_inverse_uses", "PROPAGATE-SBHL-SPEC-INVERSE-USES", 2, 0, false);
        declareFunction("add_ist", "ADD-IST", 2, 0, false);
        declareFunction("add_ist_el_support", "ADD-IST-EL-SUPPORT", 1, 0, false);
        declareFunction("add_true_rule", "ADD-TRUE-RULE", 2, 0, false);
        declareFunction("true_rule_el_support", "TRUE-RULE-EL-SUPPORT", 0, 0, false);
        declareFunction("true_rule_support_p", "TRUE-RULE-SUPPORT-P", 1, 0, false);
        declareFunction("rule_template_direction", "RULE-TEMPLATE-DIRECTION", 1, 1, false);
        declareFunction("add_rule_template_direction", "ADD-RULE-TEMPLATE-DIRECTION", 2, 0, false);
        declareFunction("remove_rule_template_direction", "REMOVE-RULE-TEMPLATE-DIRECTION", 2, 0, false);
        declareFunction("rule_template_instantiations", "RULE-TEMPLATE-INSTANTIATIONS", 1, 1, false);
        declareFunction("rule_template_instantiation_deduction", "RULE-TEMPLATE-INSTANTIATION-DEDUCTION", 1, 0, false);
        declareFunction("remove_dependent_term", "REMOVE-DEPENDENT-TERM", 2, 0, false);
        declareFunction("propagate_to_arity", "PROPAGATE-TO-ARITY", 2, 0, false);
        declareFunction("add_arity", "ADD-ARITY", 2, 0, false);
        declareFunction("remove_arity", "REMOVE-ARITY", 2, 0, false);
        declareFunction("propagate_to_arity_min", "PROPAGATE-TO-ARITY-MIN", 2, 0, false);
        declareFunction("add_arity_min", "ADD-ARITY-MIN", 2, 0, false);
        declareFunction("remove_arity_min", "REMOVE-ARITY-MIN", 2, 0, false);
        declareFunction("propagate_to_arity_max", "PROPAGATE-TO-ARITY-MAX", 2, 0, false);
        declareFunction("add_arity_max", "ADD-ARITY-MAX", 2, 0, false);
        declareFunction("remove_arity_max", "REMOVE-ARITY-MAX", 2, 0, false);
        declareFunction("inter_arg_isa_after_adding", "INTER-ARG-ISA-AFTER-ADDING", 2, 0, false);
        declareFunction("inter_arg_isa_after_removing", "INTER-ARG-ISA-AFTER-REMOVING", 2, 0, false);
        declareFunction("inter_arg_format_after_adding", "INTER-ARG-FORMAT-AFTER-ADDING", 2, 0, false);
        declareFunction("inter_arg_format_after_removing", "INTER-ARG-FORMAT-AFTER-REMOVING", 2, 0, false);
        declareFunction("add_to_contraction_ht", "ADD-TO-CONTRACTION-HT", 2, 0, false);
        declareFunction("remove_from_contraction_ht", "REMOVE-FROM-CONTRACTION-HT", 2, 0, false);
        declareFunction("add_gen_template_expansion", "ADD-GEN-TEMPLATE-EXPANSION", 2, 0, false);
        declareFunction("remove_gen_template_expansion", "REMOVE-GEN-TEMPLATE-EXPANSION", 2, 0, false);
        declareFunction("add_expansion_axiom", "ADD-EXPANSION-AXIOM", 2, 0, false);
        declareFunction("cyc_add_reformulation_assertion", "CYC-ADD-REFORMULATION-ASSERTION", 2, 0, false);
        declareFunction("cyc_remove_reformulation_assertion", "CYC-REMOVE-REFORMULATION-ASSERTION", 2, 0, false);
        declareFunction("cyc_add_element_of", "CYC-ADD-ELEMENT-OF", 2, 0, false);
        declareFunction("clear_unit_multiplication_factor_caches", "CLEAR-UNIT-MULTIPLICATION-FACTOR-CACHES", 2, 0, false);
        declareFunction("cyc_add_known_antecedent_rule", "CYC-ADD-KNOWN-ANTECEDENT-RULE", 2, 0, false);
        declareFunction("cyc_remove_known_antecedent_rule", "CYC-REMOVE-KNOWN-ANTECEDENT-RULE", 2, 0, false);
        declareFunction("add_merged_constant_guid", "ADD-MERGED-CONSTANT-GUID", 2, 0, false);
        declareFunction("remove_merged_constant_guid", "REMOVE-MERGED-CONSTANT-GUID", 2, 0, false);
        declareFunction("cyc_except_mt_added", "CYC-EXCEPT-MT-ADDED", 2, 0, false);
        declareFunction("cyc_except_mt_removed", "CYC-EXCEPT-MT-REMOVED", 2, 0, false);
        declareFunction("cyc_except_added", "CYC-EXCEPT-ADDED", 2, 0, false);
        declareFunction("cyc_except_removed", "CYC-EXCEPT-REMOVED", 2, 0, false);
        declareFunction("hl_gaf_p", "HL-GAF-P", 1, 0, false);
        declareFunction("except_of_hl_gaf_p", "EXCEPT-OF-HL-GAF-P", 1, 0, false);
        declareFunction("add_hl_gaf_denial", "ADD-HL-GAF-DENIAL", 2, 0, false);
        declareFunction("rem_hl_gaf_denial", "REM-HL-GAF-DENIAL", 2, 0, false);
        declareFunction("add_relation_instance_all", "ADD-RELATION-INSTANCE-ALL", 2, 0, false);
        declareFunction("remove_relation_instance_all", "REMOVE-RELATION-INSTANCE-ALL", 2, 0, false);
        declareFunction("add_relation_all_instance", "ADD-RELATION-ALL-INSTANCE", 2, 0, false);
        declareFunction("remove_relation_all_instance", "REMOVE-RELATION-ALL-INSTANCE", 2, 0, false);
        declareFunction("mark_constant_as_instantiated", "MARK-CONSTANT-AS-INSTANTIATED", 2, 0, false);
        declareFunction("cyc_create_new_instantiated_permanent", "CYC-CREATE-NEW-INSTANTIATED-PERMANENT", 2, 0, false);
        declareFunction("instantiated_constant_p", "INSTANTIATED-CONSTANT-P", 1, 0, false);
        declareFunction("possible_instantiated_constant_with_no_assertionsP", "POSSIBLE-INSTANTIATED-CONSTANT-WITH-NO-ASSERTIONS?", 1, 0, false);
        declareFunction("instantiated_constant_with_one_assertionP", "INSTANTIATED-CONSTANT-WITH-ONE-ASSERTION?", 1, 0, false);
        declareFunction("possible_instantiated_constant_to_reuseP", "POSSIBLE-INSTANTIATED-CONSTANT-TO-REUSE?", 1, 0, false);
        declareFunction("do_create_from_description", "DO-CREATE-FROM-DESCRIPTION", 2, 0, false);
        declareFunction("expression_instantiated_constant_count", "EXPRESSION-INSTANTIATED-CONSTANT-COUNT", 1, 0, false);
        declareFunction("expression_has_instantiated_constantP", "EXPRESSION-HAS-INSTANTIATED-CONSTANT?", 1, 0, false);
        declareFunction("do_create_from_description_multiple", "DO-CREATE-FROM-DESCRIPTION-MULTIPLE", 2, 0, false);
        declareFunction("make_do_create_from_description_query", "MAKE-DO-CREATE-FROM-DESCRIPTION-QUERY", 2, 0, false);
        declareFunction("constant_instantiated_from_subcollection_expression_p", "CONSTANT-INSTANTIATED-FROM-SUBCOLLECTION-EXPRESSION-P", 1, 0, false);
        declareFunction("instantiate_from_subcollection_expression", "INSTANTIATE-FROM-SUBCOLLECTION-EXPRESSION", 2, 0, false);
        declareFunction("show_constants_with_no_assertions", "SHOW-CONSTANTS-WITH-NO-ASSERTIONS", 0, 0, false);
        declareFunction("kill_constants_with_no_assertions_by_prefix", "KILL-CONSTANTS-WITH-NO-ASSERTIONS-BY-PREFIX", 1, 0, false);
        declareFunction("show_unused_instantiated_constants", "SHOW-UNUSED-INSTANTIATED-CONSTANTS", 0, 0, false);
        declareFunction("forget_unused_instantiated_constants", "FORGET-UNUSED-INSTANTIATED-CONSTANTS", 0, 0, false);
        declareFunction("kill_unused_instantiated_constants", "KILL-UNUSED-INSTANTIATED-CONSTANTS", 0, 0, false);
        declareFunction("assert_missing_quoted_isa_instantiated_constant_assertions", "ASSERT-MISSING-QUOTED-ISA-INSTANTIATED-CONSTANT-ASSERTIONS", 0, 0, false);
        declareFunction("retain_mt_contents", "RETAIN-MT-CONTENTS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_after_adding_modules_file() {
        $cycl_functions_used_as_after_addings$ = deflexical("*CYCL-FUNCTIONS-USED-AS-AFTER-ADDINGS*", $list0);
        $inside_clear_genls_dependent_cachesP$ = defparameter("*INSIDE-CLEAR-GENLS-DEPENDENT-CACHES?*", NIL);
        $inside_clear_isa_dependent_cachesP$ = defparameter("*INSIDE-CLEAR-ISA-DEPENDENT-CACHES?*", NIL);
        $inside_clear_quoted_isa_dependent_cachesP$ = SubLFiles.defparameter("*INSIDE-CLEAR-QUOTED-ISA-DEPENDENT-CACHES?*", NIL);
        $true_rule_template$ = defparameter("*TRUE-RULE-TEMPLATE*", $list54);
        $true_rule_defining_mt$ = deflexical("*TRUE-RULE-DEFINING-MT*", maybeDefault($sym55$_TRUE_RULE_DEFINING_MT_, $true_rule_defining_mt$, $$CoreCycLMt));
        $cyc_except_mt_repropagate_mt_contents_cutoff$ = SubLFiles.defparameter("*CYC-EXCEPT-MT-REPROPAGATE-MT-CONTENTS-CUTOFF*", $int$256);
        $debug_do_create_from_descriptionP$ = defparameter("*DEBUG-DO-CREATE-FROM-DESCRIPTION?*", NIL);
        $instantiate_from_subcollection_expression_constant_prefix$ = SubLFiles.defparameter("*INSTANTIATE-FROM-SUBCOLLECTION-EXPRESSION-CONSTANT-PREFIX*", $str159$INST);
        return NIL;
    }

    public static SubLObject setup_after_adding_modules_file() {
        SubLObject cdolist_list_var = $cycl_functions_used_as_after_addings$.getGlobalValue();
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            utilities_macros.register_kb_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        utilities_macros.register_kb_function($sym2$DECACHE_AFTER_ADDINGS);
        utilities_macros.register_kb_function($sym3$DECACHE_AFTER_REMOVINGS);
        utilities_macros.register_kb_function($sym4$DECACHE_RULE_AFTER_ADDINGS);
        utilities_macros.register_kb_function($sym5$DECACHE_RULE_AFTER_REMOVINGS);
        utilities_macros.register_kb_function($sym6$CLEAR_MT_DEPENDENT_CACHES);
        utilities_macros.register_kb_function($sym7$CLEAR_GENLS_DEPENDENT_CACHES);
        utilities_macros.register_kb_function($sym8$CLEAR_ISA_DEPENDENT_CACHES);
        utilities_macros.register_kb_function($sym9$CLEAR_QUOTED_ISA_DEPENDENT_CACHES);
        utilities_macros.register_kb_function($sym10$CLEAR_GENL_PRED_DEPENDENT_CACHES);
        utilities_macros.register_kb_function($sym11$ADD_TRANSITIVE_VIA_ARG);
        utilities_macros.register_kb_function($sym12$REMOVE_TRANSITIVE_VIA_ARG);
        utilities_macros.register_kb_function($sym13$ADD_TRANSITIVE_VIA_ARG_INVERSE);
        utilities_macros.register_kb_function($sym14$REMOVE_TRANSITIVE_VIA_ARG_INVERSE);
        utilities_macros.register_kb_function($sym15$CLEAR_CACHED_TVA_CHECKS);
        utilities_macros.register_kb_function($sym16$CLEAR_CACHED_SOME_TVA_CHECKS);
        utilities_macros.register_kb_function($sym17$CLEAR_CACHED_CVA_CHECKS);
        utilities_macros.register_kb_function($sym18$CLEAR_CACHED_SOME_CVA_CHECKS);
        utilities_macros.register_kb_function($sym19$SKOLEM_AFTER_REMOVING);
        utilities_macros.register_kb_function($sym20$ADD_OLD_CONSTANT_NAME);
        utilities_macros.register_kb_function($sym21$REMOVE_OLD_CONSTANT_NAME);
        utilities_macros.register_kb_function($sym23$PROPAGATE_TO_ISA);
        utilities_macros.register_kb_function($sym25$PROPAGATE_TO_GENLS);
        utilities_macros.register_kb_function($sym27$PROPAGATE_TO_DISJOINTWITH);
        utilities_macros.register_kb_function($sym29$PROPAGATE_TO_GENLMT);
        utilities_macros.register_kb_function($sym31$PROPAGATE_TO_GENLPREDS);
        utilities_macros.register_kb_function($sym33$PROPAGATE_TO_NEGATIONPREDS);
        utilities_macros.register_kb_function($sym35$PROPAGATE_TO_GENLINVERSE);
        utilities_macros.register_kb_function($sym37$PROPAGATE_TO_NEGATIONINVERSE);
        utilities_macros.register_kb_function($sym38$PROPAGATE_INVERSE_TO_ISA);
        utilities_macros.register_kb_function($sym39$PROPAGATE_INVERSE_TO_GENLS);
        utilities_macros.register_kb_function($sym40$PROPAGATE_INVERSE_TO_GENLMT);
        utilities_macros.register_kb_function($sym41$PROPAGATE_INVERSE_TO_GENLPREDS);
        utilities_macros.register_kb_function($sym42$PROPAGATE_INVERSE_TO_GENLINVERSE);
        utilities_macros.register_kb_function($sym48$ADD_IST);
        utilities_macros.register_kb_function($sym53$ADD_TRUE_RULE);
        subl_macro_promotions.declare_defglobal($sym55$_TRUE_RULE_DEFINING_MT_);
        mt_vars.note_mt_var($sym55$_TRUE_RULE_DEFINING_MT_, $$trueRule);
        utilities_macros.register_kb_function($sym64$ADD_RULE_TEMPLATE_DIRECTION);
        utilities_macros.register_kb_function($sym65$REMOVE_RULE_TEMPLATE_DIRECTION);
        utilities_macros.register_kb_function($sym70$REMOVE_DEPENDENT_TERM);
        utilities_macros.register_kb_function($sym72$PROPAGATE_TO_ARITY);
        utilities_macros.register_kb_function($sym73$ADD_ARITY);
        utilities_macros.register_kb_function($sym74$REMOVE_ARITY);
        utilities_macros.register_kb_function($sym76$PROPAGATE_TO_ARITY_MIN);
        utilities_macros.register_kb_function($sym77$ADD_ARITY_MIN);
        utilities_macros.register_kb_function($sym78$REMOVE_ARITY_MIN);
        utilities_macros.register_kb_function($sym80$PROPAGATE_TO_ARITY_MAX);
        utilities_macros.register_kb_function($sym81$ADD_ARITY_MAX);
        utilities_macros.register_kb_function($sym82$REMOVE_ARITY_MAX);
        utilities_macros.register_kb_function($sym83$INTER_ARG_ISA_AFTER_ADDING);
        utilities_macros.register_kb_function($sym84$INTER_ARG_ISA_AFTER_REMOVING);
        utilities_macros.register_kb_function($sym85$INTER_ARG_FORMAT_AFTER_ADDING);
        utilities_macros.register_kb_function($sym86$INTER_ARG_FORMAT_AFTER_REMOVING);
        utilities_macros.register_kb_function($sym87$ADD_TO_CONTRACTION_HT);
        utilities_macros.register_kb_function($sym88$REMOVE_FROM_CONTRACTION_HT);
        utilities_macros.register_kb_function($sym89$ADD_GEN_TEMPLATE_EXPANSION);
        utilities_macros.register_kb_function($sym90$REMOVE_GEN_TEMPLATE_EXPANSION);
        utilities_macros.register_kb_function($sym98$ADD_EXPANSION_AXIOM);
        utilities_macros.register_kb_function($sym99$CYC_ADD_REFORMULATION_ASSERTION);
        utilities_macros.register_kb_function($sym100$CYC_REMOVE_REFORMULATION_ASSERTION);
        utilities_macros.register_kb_function($sym105$CYC_ADD_ELEMENT_OF);
        utilities_macros.register_kb_function($sym106$CLEAR_UNIT_MULTIPLICATION_FACTOR_CACHES);
        utilities_macros.register_kb_function($sym109$CYC_ADD_KNOWN_ANTECEDENT_RULE);
        utilities_macros.register_kb_function($sym110$CYC_REMOVE_KNOWN_ANTECEDENT_RULE);
        utilities_macros.register_kb_function($sym111$ADD_MERGED_CONSTANT_GUID);
        utilities_macros.register_kb_function($sym112$REMOVE_MERGED_CONSTANT_GUID);
        utilities_macros.register_kb_function($sym119$CYC_EXCEPT_MT_ADDED);
        utilities_macros.register_kb_function($sym121$CYC_EXCEPT_MT_REMOVED);
        utilities_macros.register_kb_function($sym122$CYC_EXCEPT_ADDED);
        utilities_macros.register_kb_function($sym123$CYC_EXCEPT_REMOVED);
        utilities_macros.register_kb_function($sym126$ADD_RELATION_INSTANCE_ALL);
        utilities_macros.register_kb_function($sym127$REMOVE_RELATION_INSTANCE_ALL);
        utilities_macros.register_kb_function($sym128$ADD_RELATION_ALL_INSTANCE);
        utilities_macros.register_kb_function($sym129$REMOVE_RELATION_ALL_INSTANCE);
        utilities_macros.register_kb_function($sym149$DO_CREATE_FROM_DESCRIPTION);
        utilities_macros.register_kb_function($sym158$DO_CREATE_FROM_DESCRIPTION_MULTIPLE);
        utilities_macros.register_kb_function($sym167$INSTANTIATE_FROM_SUBCOLLECTION_EXPRESSION);
        utilities_macros.register_kb_function($sym193$RETAIN_MT_CONTENTS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_after_adding_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_after_adding_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_after_adding_modules_file();
    }

    static {
        me = new after_adding_modules();
        $cycl_functions_used_as_after_addings$ = null;
        $inside_clear_genls_dependent_cachesP$ = null;
        $inside_clear_isa_dependent_cachesP$ = null;
        $inside_clear_quoted_isa_dependent_cachesP$ = null;
        $true_rule_template$ = null;
        $true_rule_defining_mt$ = null;
        $cyc_except_mt_repropagate_mt_contents_cutoff$ = null;
        $debug_do_create_from_descriptionP$ = null;
        $instantiate_from_subcollection_expression_constant_prefix$ = null;
        $list0 = list(makeSymbol("CLEAR-PARAPHRASE-CACHES"));
        $sym1$ARGUMENT_P = makeSymbol("ARGUMENT-P");
        $sym2$DECACHE_AFTER_ADDINGS = makeSymbol("DECACHE-AFTER-ADDINGS");
        $sym3$DECACHE_AFTER_REMOVINGS = makeSymbol("DECACHE-AFTER-REMOVINGS");
        $sym4$DECACHE_RULE_AFTER_ADDINGS = makeSymbol("DECACHE-RULE-AFTER-ADDINGS");
        $sym5$DECACHE_RULE_AFTER_REMOVINGS = makeSymbol("DECACHE-RULE-AFTER-REMOVINGS");
        $sym6$CLEAR_MT_DEPENDENT_CACHES = makeSymbol("CLEAR-MT-DEPENDENT-CACHES");
        $sym7$CLEAR_GENLS_DEPENDENT_CACHES = makeSymbol("CLEAR-GENLS-DEPENDENT-CACHES");
        $sym8$CLEAR_ISA_DEPENDENT_CACHES = makeSymbol("CLEAR-ISA-DEPENDENT-CACHES");
        $sym9$CLEAR_QUOTED_ISA_DEPENDENT_CACHES = makeSymbol("CLEAR-QUOTED-ISA-DEPENDENT-CACHES");
        $sym10$CLEAR_GENL_PRED_DEPENDENT_CACHES = makeSymbol("CLEAR-GENL-PRED-DEPENDENT-CACHES");
        $sym11$ADD_TRANSITIVE_VIA_ARG = makeSymbol("ADD-TRANSITIVE-VIA-ARG");
        $sym12$REMOVE_TRANSITIVE_VIA_ARG = makeSymbol("REMOVE-TRANSITIVE-VIA-ARG");
        $sym13$ADD_TRANSITIVE_VIA_ARG_INVERSE = makeSymbol("ADD-TRANSITIVE-VIA-ARG-INVERSE");
        $sym14$REMOVE_TRANSITIVE_VIA_ARG_INVERSE = makeSymbol("REMOVE-TRANSITIVE-VIA-ARG-INVERSE");
        $sym15$CLEAR_CACHED_TVA_CHECKS = makeSymbol("CLEAR-CACHED-TVA-CHECKS");
        $sym16$CLEAR_CACHED_SOME_TVA_CHECKS = makeSymbol("CLEAR-CACHED-SOME-TVA-CHECKS");
        $sym17$CLEAR_CACHED_CVA_CHECKS = makeSymbol("CLEAR-CACHED-CVA-CHECKS");
        $sym18$CLEAR_CACHED_SOME_CVA_CHECKS = makeSymbol("CLEAR-CACHED-SOME-CVA-CHECKS");
        $sym19$SKOLEM_AFTER_REMOVING = makeSymbol("SKOLEM-AFTER-REMOVING");
        $sym20$ADD_OLD_CONSTANT_NAME = makeSymbol("ADD-OLD-CONSTANT-NAME");
        $sym21$REMOVE_OLD_CONSTANT_NAME = makeSymbol("REMOVE-OLD-CONSTANT-NAME");
        $$isa = makeConstSym(("isa"));
        $sym23$PROPAGATE_TO_ISA = makeSymbol("PROPAGATE-TO-ISA");
        $$genls = makeConstSym(("genls"));
        $sym25$PROPAGATE_TO_GENLS = makeSymbol("PROPAGATE-TO-GENLS");
        $$disjointWith = makeConstSym(("disjointWith"));
        $sym27$PROPAGATE_TO_DISJOINTWITH = makeSymbol("PROPAGATE-TO-DISJOINTWITH");
        $$genlMt = makeConstSym(("genlMt"));
        $sym29$PROPAGATE_TO_GENLMT = makeSymbol("PROPAGATE-TO-GENLMT");
        $$genlPreds = makeConstSym(("genlPreds"));
        $sym31$PROPAGATE_TO_GENLPREDS = makeSymbol("PROPAGATE-TO-GENLPREDS");
        $$negationPreds = makeConstSym(("negationPreds"));
        $sym33$PROPAGATE_TO_NEGATIONPREDS = makeSymbol("PROPAGATE-TO-NEGATIONPREDS");
        $$genlInverse = makeConstSym(("genlInverse"));
        $sym35$PROPAGATE_TO_GENLINVERSE = makeSymbol("PROPAGATE-TO-GENLINVERSE");
        $$negationInverse = makeConstSym(("negationInverse"));
        $sym37$PROPAGATE_TO_NEGATIONINVERSE = makeSymbol("PROPAGATE-TO-NEGATIONINVERSE");
        $sym38$PROPAGATE_INVERSE_TO_ISA = makeSymbol("PROPAGATE-INVERSE-TO-ISA");
        $sym39$PROPAGATE_INVERSE_TO_GENLS = makeSymbol("PROPAGATE-INVERSE-TO-GENLS");
        $sym40$PROPAGATE_INVERSE_TO_GENLMT = makeSymbol("PROPAGATE-INVERSE-TO-GENLMT");
        $sym41$PROPAGATE_INVERSE_TO_GENLPREDS = makeSymbol("PROPAGATE-INVERSE-TO-GENLPREDS");
        $sym42$PROPAGATE_INVERSE_TO_GENLINVERSE = makeSymbol("PROPAGATE-INVERSE-TO-GENLINVERSE");
        $list43 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));
        $GENLPREDS = makeKeyword("GENLPREDS");
        $MONOTONIC = makeKeyword("MONOTONIC");
        $list46 = list(makeSymbol("IST"), makeSymbol("MT"), makeSymbol("FORMULA"));
        $$ist = makeConstSym(("ist"));
        $sym48$ADD_IST = makeSymbol("ADD-IST");
        $$implies = makeConstSym(("implies"));
        $list50 = list(makeSymbol("?FORMULA"));
        $CODE = makeKeyword("CODE");
        $sym52$QUEUE_P = makeSymbol("QUEUE-P");
        $sym53$ADD_TRUE_RULE = makeSymbol("ADD-TRUE-RULE");
        $list54 = list(makeConstSym(("implies")), list(makeConstSym(("trueRule")), makeSymbol("?TEMPLATE"), makeSymbol("?FORMULA")), makeSymbol("?FORMULA"));
        $sym55$_TRUE_RULE_DEFINING_MT_ = makeSymbol("*TRUE-RULE-DEFINING-MT*");
        $$CoreCycLMt = makeConstSym(("CoreCycLMt"));
        $$trueRule = makeConstSym(("trueRule"));
        $sym58$FORT_P = makeSymbol("FORT-P");
        $$ruleTemplateDirection = makeConstSym(("ruleTemplateDirection"));
        $$Forward_AssertionDirection = makeConstSym(("Forward-AssertionDirection"));
        $FORWARD = makeKeyword("FORWARD");
        $$Backward_AssertionDirection = makeConstSym(("Backward-AssertionDirection"));
        $BACKWARD = makeKeyword("BACKWARD");
        $sym64$ADD_RULE_TEMPLATE_DIRECTION = makeSymbol("ADD-RULE-TEMPLATE-DIRECTION");
        $sym65$REMOVE_RULE_TEMPLATE_DIRECTION = makeSymbol("REMOVE-RULE-TEMPLATE-DIRECTION");
        $GAF = makeKeyword("GAF");
        $TRUE = makeKeyword("TRUE");
        $sym68$DEDUCTION_P = makeSymbol("DEDUCTION-P");
        $sym69$TRUE_RULE_SUPPORT_P = makeSymbol("TRUE-RULE-SUPPORT-P");
        $sym70$REMOVE_DEPENDENT_TERM = makeSymbol("REMOVE-DEPENDENT-TERM");
        $$arity = makeConstSym(("arity"));
        $sym72$PROPAGATE_TO_ARITY = makeSymbol("PROPAGATE-TO-ARITY");
        $sym73$ADD_ARITY = makeSymbol("ADD-ARITY");
        $sym74$REMOVE_ARITY = makeSymbol("REMOVE-ARITY");
        $$arityMin = makeConstSym(("arityMin"));
        $sym76$PROPAGATE_TO_ARITY_MIN = makeSymbol("PROPAGATE-TO-ARITY-MIN");
        $sym77$ADD_ARITY_MIN = makeSymbol("ADD-ARITY-MIN");
        $sym78$REMOVE_ARITY_MIN = makeSymbol("REMOVE-ARITY-MIN");
        $$arityMax = makeConstSym(("arityMax"));
        $sym80$PROPAGATE_TO_ARITY_MAX = makeSymbol("PROPAGATE-TO-ARITY-MAX");
        $sym81$ADD_ARITY_MAX = makeSymbol("ADD-ARITY-MAX");
        $sym82$REMOVE_ARITY_MAX = makeSymbol("REMOVE-ARITY-MAX");
        $sym83$INTER_ARG_ISA_AFTER_ADDING = makeSymbol("INTER-ARG-ISA-AFTER-ADDING");
        $sym84$INTER_ARG_ISA_AFTER_REMOVING = makeSymbol("INTER-ARG-ISA-AFTER-REMOVING");
        $sym85$INTER_ARG_FORMAT_AFTER_ADDING = makeSymbol("INTER-ARG-FORMAT-AFTER-ADDING");
        $sym86$INTER_ARG_FORMAT_AFTER_REMOVING = makeSymbol("INTER-ARG-FORMAT-AFTER-REMOVING");
        $sym87$ADD_TO_CONTRACTION_HT = makeSymbol("ADD-TO-CONTRACTION-HT");
        $sym88$REMOVE_FROM_CONTRACTION_HT = makeSymbol("REMOVE-FROM-CONTRACTION-HT");
        $sym89$ADD_GEN_TEMPLATE_EXPANSION = makeSymbol("ADD-GEN-TEMPLATE-EXPANSION");
        $sym90$REMOVE_GEN_TEMPLATE_EXPANSION = makeSymbol("REMOVE-GEN-TEMPLATE-EXPANSION");
        $$expansion = makeConstSym(("expansion"));
        $list92 = list(makeConstSym(("afterAdding")), makeConstSym(("expansionAxiom")), makeSymbol("ADD-EXPANSION-AXIOM"));
        $$expansionAxiom = makeConstSym(("expansionAxiom"));
        $sym94$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $CNF = makeKeyword("CNF");
        $sym96$NEG_LITS = makeSymbol("NEG-LITS");
        $$True = makeConstSym(("True"));
        $sym98$ADD_EXPANSION_AXIOM = makeSymbol("ADD-EXPANSION-AXIOM");
        $sym99$CYC_ADD_REFORMULATION_ASSERTION = makeSymbol("CYC-ADD-REFORMULATION-ASSERTION");
        $sym100$CYC_REMOVE_REFORMULATION_ASSERTION = makeSymbol("CYC-REMOVE-REFORMULATION-ASSERTION");
        $list101 = list(makeSymbol("EO"), makeSymbol("TERM"), makeSymbol("SETEXPR"));
        $$elementOf = makeConstSym(("elementOf"));
        $$TheSetOf = makeConstSym(("TheSetOf"));
        $list104 = list(makeSymbol("TSO"), makeSymbol("VAR"), makeSymbol("PROP"));
        $sym105$CYC_ADD_ELEMENT_OF = makeSymbol("CYC-ADD-ELEMENT-OF");
        $sym106$CLEAR_UNIT_MULTIPLICATION_FACTOR_CACHES = makeSymbol("CLEAR-UNIT-MULTIPLICATION-FACTOR-CACHES");
        $sym107$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
        $sym108$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
        $sym109$CYC_ADD_KNOWN_ANTECEDENT_RULE = makeSymbol("CYC-ADD-KNOWN-ANTECEDENT-RULE");
        $sym110$CYC_REMOVE_KNOWN_ANTECEDENT_RULE = makeSymbol("CYC-REMOVE-KNOWN-ANTECEDENT-RULE");
        $sym111$ADD_MERGED_CONSTANT_GUID = makeSymbol("ADD-MERGED-CONSTANT-GUID");
        $sym112$REMOVE_MERGED_CONSTANT_GUID = makeSymbol("REMOVE-MERGED-CONSTANT-GUID");
        $int$256 = makeInteger(256);
        $MT = makeKeyword("MT");
        $BROAD_MT = makeKeyword("BROAD-MT");
        $str116$do_broad_mt_index = makeString("do-broad-mt-index");
        $sym117$STRINGP = makeSymbol("STRINGP");
        $SKIP = makeKeyword("SKIP");
        $sym119$CYC_EXCEPT_MT_ADDED = makeSymbol("CYC-EXCEPT-MT-ADDED");
        $str120$Skipping_propagating_mt_contents_ = makeString("Skipping propagating mt contents of ~S");
        $sym121$CYC_EXCEPT_MT_REMOVED = makeSymbol("CYC-EXCEPT-MT-REMOVED");
        $sym122$CYC_EXCEPT_ADDED = makeSymbol("CYC-EXCEPT-ADDED");
        $sym123$CYC_EXCEPT_REMOVED = makeSymbol("CYC-EXCEPT-REMOVED");
        $$except = makeConstSym(("except"));
        $UNKNOWN = makeKeyword("UNKNOWN");
        $sym126$ADD_RELATION_INSTANCE_ALL = makeSymbol("ADD-RELATION-INSTANCE-ALL");
        $sym127$REMOVE_RELATION_INSTANCE_ALL = makeSymbol("REMOVE-RELATION-INSTANCE-ALL");
        $sym128$ADD_RELATION_ALL_INSTANCE = makeSymbol("ADD-RELATION-ALL-INSTANCE");
        $sym129$REMOVE_RELATION_ALL_INSTANCE = makeSymbol("REMOVE-RELATION-ALL-INSTANCE");
        $str130$__do_create_from_description_mark = makeString("~&do-create-from-description marking as instantiated: ~S~%");
        $$quotedIsa = makeConstSym(("quotedIsa"));
        $$InstantiatedConstant = makeConstSym(("InstantiatedConstant"));
        $$BookkeepingMt = makeConstSym(("BookkeepingMt"));
        $sym134$FI_ASSERT = makeSymbol("FI-ASSERT");
        $sym135$QUOTE = makeSymbol("QUOTE");
        $list136 = list(makeConstSym(("BookkeepingMt")));
        $str137$__do_create_from_description_crea = makeString("~&do-create-from-description creating new instantiated constant: ~A~%");
        $sym138$FI_TIMESTAMP_ASSERTION = makeSymbol("FI-TIMESTAMP-ASSERTION");
        $sym139$FI_TIMESTAMP_CONSTANT = makeSymbol("FI-TIMESTAMP-CONSTANT");
        $str140$__do_create_from_description_afte = makeString("~&do-create-from-description after-adding called in forward inference using rule: ~S~%");
        $sym141$_TERM = makeSymbol("?TERM");
        $$and = makeConstSym(("and"));
        $str143$__do_create_from_description_reus = makeString("~&do-create-from-description reusing instantiated constant: ~S~%");
        $str144$do_create_from_description_found_ = makeString("do-create-from-description found multiple terms ~S matching description pred ~S~%");
        $str145$__do_create_from_description_reus = makeString("~&do-create-from-description reusing exiting term: ~S~%");
        $str146$__do_create_from_description_reus = makeString("~&do-create-from-description reusing bare constant: ~S~%");
        $str147$__do_create_from_description_reus = makeString("~&do-create-from-description reusing bare instantiated constant: ~S~%");
        $ASSERTIVE = makeKeyword("ASSERTIVE");
        $sym149$DO_CREATE_FROM_DESCRIPTION = makeSymbol("DO-CREATE-FROM-DESCRIPTION");
        $sym150$INSTANTIATED_CONSTANT_P = makeSymbol("INSTANTIATED-CONSTANT-P");
        $sym151$FIND_CONSTANT = makeSymbol("FIND-CONSTANT");
        $sym152$MAKE_VALID_CONSTANT_NAME = makeSymbol("MAKE-VALID-CONSTANT-NAME");
        $str153$do_create_from_description_multip = makeString("do-create-from-description-multiple found multiple terms~%~S~%matching description pred~%~S~%");
        $sym154$_ = makeSymbol(">");
        $sym155$EXPRESSION_INSTANTIATED_CONSTANT_COUNT = makeSymbol("EXPRESSION-INSTANTIATED-CONSTANT-COUNT");
        $sym156$POSSIBLE_INSTANTIATED_CONSTANT_TO_REUSE_ = makeSymbol("POSSIBLE-INSTANTIATED-CONSTANT-TO-REUSE?");
        $sym157$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");
        $sym158$DO_CREATE_FROM_DESCRIPTION_MULTIPLE = makeSymbol("DO-CREATE-FROM-DESCRIPTION-MULTIPLE");
        $str159$INST = makeString("INST");
        $sym160$NART_P = makeSymbol("NART-P");
        $sym161$NART_EL_FORMULA = makeSymbol("NART-EL-FORMULA");
        $sym162$CONSTANT_INSTANTIATED_FROM_SUBCOLLECTION_EXPRESSION_P = makeSymbol("CONSTANT-INSTANTIATED-FROM-SUBCOLLECTION-EXPRESSION-P");
        $sym163$MAX = makeSymbol("MAX");
        $str164$More_than_one_terms_match_found_f = makeString("More than one terms match found for ~S.  Using first of: ~S");
        $sym165$FORT_NAME = makeSymbol("FORT-NAME");
        $list166 = list(makeString("undeterminableName"));
        $sym167$INSTANTIATE_FROM_SUBCOLLECTION_EXPRESSION = makeSymbol("INSTANTIATE-FROM-SUBCOLLECTION-EXPRESSION");
        $str168$Finding_constants_with_no_asserti = makeString("Finding constants with no assertions");
        $str169$Killing_constants_with_no_asserti = makeString("Killing constants with no assertions and with prefix in ");
        $str170$__Killing__A__ = makeString("~&Killing ~A~%");
        $str171$___A_constants_killed__ = makeString("~&~A constants killed~%");
        $str172$Finding_instantiated_constants_wi = makeString("Finding instantiated constants with only one assertion");
        $sym173$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $$EverythingPSC = makeConstSym(("EverythingPSC"));
        $str175$Gathering_instantiated_constants = makeString("Gathering instantiated constants");
        $str176$Identifying_unused_instantiated_c = makeString("Identifying unused instantiated constants");
        $str177$cdolist = makeString("cdolist");
        $str178$Removing_ = makeString("Removing ");
        $str179$_unused_instantiated_constant = makeString(" unused instantiated constant");
        $str180$ = makeString("");
        $str181$s = makeString("s");
        $list182 = list(makeConstSym(("MultiMediaAnalysisMt")), makeConstSym(("SPRLAnnotationGenerationMt")), makeConstSym(("DreamcatcherSKSIHelperMt")));
        $sym183$DEDUCTION_SUPPORTED_OBJECT = makeSymbol("DEDUCTION-SUPPORTED-OBJECT");
        $sym184$ASSERTION_EL_FORMULA = makeSymbol("ASSERTION-EL-FORMULA");
        $$doCreateFromDescription = makeConstSym(("doCreateFromDescription"));
        $$doCreateFromDescription_Multiple = makeConstSym(("doCreateFromDescription-Multiple"));
        $str187$could_not_determine_created_const = makeString("could not determine created constants for ~A");
        $str188$too_many_instantiated_constant_ga = makeString("too many instantiated constant gafs for ~A");
        $str189$not_enough_instantiated_constant_ = makeString("not enough instantiated constant gafs for ~A");
        $list190 = list(makeConstSym(("doCreateFromDescription")), makeConstSym(("doCreateFromDescription-Multiple")));
        $sym191$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
        $list192 = list(makeKeyword("CHECK-WFF?"), NIL);
        $sym193$RETAIN_MT_CONTENTS = makeSymbol("RETAIN-MT-CONTENTS");
    }

    public static class $clear_isa_dependent_caches$BinaryFunction extends BinaryFunction {
        public $clear_isa_dependent_caches$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-ISA-DEPENDENT-CACHES"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return clear_isa_dependent_caches(arg1, arg2);
        }
    }
}
/*
 *
 * Total time: 1007 ms
 *
 */