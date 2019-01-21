package com.cyc.cycjava.cycl.inference.modules;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.subcollection_unwinder;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.encapsulation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.operation_queues;
import com.cyc.cycjava.cycl.transcript_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.fi_edit;
import com.cyc.cycjava.cycl.hl_transcript_tracing;
import com.cyc.cycjava.cycl.constants_low;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.reformulator_datastructures;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.pph_templates;
import com.cyc.cycjava.cycl.pph_functions;
import com.cyc.cycjava.cycl.tersifier;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.fi;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.tva_cache;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.tva_utilities;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.predicate_relevance_cache;
import com.cyc.cycjava.cycl.mt_relevance_cache;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.inference.harness.rule_after_adding;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class after_adding_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.after_adding_modules";
    public static final String myFingerPrint = "c970f052a455d7d122dfb380b7600b3d572585cb2eef92f653724136159aa181";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 1069L)
    private static SubLSymbol $cycl_functions_used_as_after_addings$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 3213L)
    private static SubLSymbol $inside_clear_genls_dependent_cachesP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4051L)
    private static SubLSymbol $inside_clear_isa_dependent_cachesP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4830L)
    private static SubLSymbol $inside_clear_quoted_isa_dependent_cachesP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14168L)
    private static SubLSymbol $true_rule_template$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14295L)
    public static SubLSymbol $true_rule_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 29939L)
    private static SubLSymbol $cyc_except_mt_repropagate_mt_contents_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 36624L)
    private static SubLSymbol $debug_do_create_from_descriptionP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 47219L)
    private static SubLSymbol $instantiate_from_subcollection_expression_constant_prefix$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$ARGUMENT_P;
    private static final SubLSymbol $sym2$DECACHE_AFTER_ADDINGS;
    private static final SubLSymbol $sym3$DECACHE_AFTER_REMOVINGS;
    private static final SubLSymbol $sym4$DECACHE_RULE_AFTER_ADDINGS;
    private static final SubLSymbol $sym5$DECACHE_RULE_AFTER_REMOVINGS;
    private static final SubLSymbol $sym6$CLEAR_MT_DEPENDENT_CACHES;
    private static final SubLSymbol $sym7$CLEAR_GENLS_DEPENDENT_CACHES;
    private static final SubLSymbol $sym8$CLEAR_ISA_DEPENDENT_CACHES;
    private static final SubLSymbol $sym9$CLEAR_QUOTED_ISA_DEPENDENT_CACHES;
    private static final SubLSymbol $sym10$CLEAR_GENL_PRED_DEPENDENT_CACHES;
    private static final SubLSymbol $sym11$ADD_TRANSITIVE_VIA_ARG;
    private static final SubLSymbol $sym12$REMOVE_TRANSITIVE_VIA_ARG;
    private static final SubLSymbol $sym13$ADD_TRANSITIVE_VIA_ARG_INVERSE;
    private static final SubLSymbol $sym14$REMOVE_TRANSITIVE_VIA_ARG_INVERSE;
    private static final SubLSymbol $sym15$CLEAR_CACHED_TVA_CHECKS;
    private static final SubLSymbol $sym16$CLEAR_CACHED_SOME_TVA_CHECKS;
    private static final SubLSymbol $sym17$CLEAR_CACHED_CVA_CHECKS;
    private static final SubLSymbol $sym18$CLEAR_CACHED_SOME_CVA_CHECKS;
    private static final SubLSymbol $sym19$SKOLEM_AFTER_REMOVING;
    private static final SubLSymbol $sym20$ADD_OLD_CONSTANT_NAME;
    private static final SubLSymbol $sym21$REMOVE_OLD_CONSTANT_NAME;
    private static final SubLObject $const22$isa;
    private static final SubLSymbol $sym23$PROPAGATE_TO_ISA;
    private static final SubLObject $const24$genls;
    private static final SubLSymbol $sym25$PROPAGATE_TO_GENLS;
    private static final SubLObject $const26$disjointWith;
    private static final SubLSymbol $sym27$PROPAGATE_TO_DISJOINTWITH;
    private static final SubLObject $const28$genlMt;
    private static final SubLSymbol $sym29$PROPAGATE_TO_GENLMT;
    private static final SubLObject $const30$genlPreds;
    private static final SubLSymbol $sym31$PROPAGATE_TO_GENLPREDS;
    private static final SubLObject $const32$negationPreds;
    private static final SubLSymbol $sym33$PROPAGATE_TO_NEGATIONPREDS;
    private static final SubLObject $const34$genlInverse;
    private static final SubLSymbol $sym35$PROPAGATE_TO_GENLINVERSE;
    private static final SubLObject $const36$negationInverse;
    private static final SubLSymbol $sym37$PROPAGATE_TO_NEGATIONINVERSE;
    private static final SubLSymbol $sym38$PROPAGATE_INVERSE_TO_ISA;
    private static final SubLSymbol $sym39$PROPAGATE_INVERSE_TO_GENLS;
    private static final SubLSymbol $sym40$PROPAGATE_INVERSE_TO_GENLMT;
    private static final SubLSymbol $sym41$PROPAGATE_INVERSE_TO_GENLPREDS;
    private static final SubLSymbol $sym42$PROPAGATE_INVERSE_TO_GENLINVERSE;
    private static final SubLList $list43;
    private static final SubLSymbol $kw44$GENLPREDS;
    private static final SubLSymbol $kw45$MONOTONIC;
    private static final SubLList $list46;
    private static final SubLObject $const47$ist;
    private static final SubLSymbol $sym48$ADD_IST;
    private static final SubLObject $const49$implies;
    private static final SubLList $list50;
    private static final SubLSymbol $kw51$CODE;
    private static final SubLSymbol $sym52$QUEUE_P;
    private static final SubLSymbol $sym53$ADD_TRUE_RULE;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$_TRUE_RULE_DEFINING_MT_;
    private static final SubLObject $const56$CoreCycLMt;
    private static final SubLObject $const57$trueRule;
    private static final SubLSymbol $sym58$FORT_P;
    private static final SubLObject $const59$ruleTemplateDirection;
    private static final SubLObject $const60$Forward_AssertionDirection;
    private static final SubLSymbol $kw61$FORWARD;
    private static final SubLObject $const62$Backward_AssertionDirection;
    private static final SubLSymbol $kw63$BACKWARD;
    private static final SubLSymbol $sym64$ADD_RULE_TEMPLATE_DIRECTION;
    private static final SubLSymbol $sym65$REMOVE_RULE_TEMPLATE_DIRECTION;
    private static final SubLSymbol $kw66$GAF;
    private static final SubLSymbol $kw67$TRUE;
    private static final SubLSymbol $sym68$DEDUCTION_P;
    private static final SubLSymbol $sym69$TRUE_RULE_SUPPORT_P;
    private static final SubLSymbol $sym70$REMOVE_DEPENDENT_TERM;
    private static final SubLObject $const71$arity;
    private static final SubLSymbol $sym72$PROPAGATE_TO_ARITY;
    private static final SubLSymbol $sym73$ADD_ARITY;
    private static final SubLSymbol $sym74$REMOVE_ARITY;
    private static final SubLObject $const75$arityMin;
    private static final SubLSymbol $sym76$PROPAGATE_TO_ARITY_MIN;
    private static final SubLSymbol $sym77$ADD_ARITY_MIN;
    private static final SubLSymbol $sym78$REMOVE_ARITY_MIN;
    private static final SubLObject $const79$arityMax;
    private static final SubLSymbol $sym80$PROPAGATE_TO_ARITY_MAX;
    private static final SubLSymbol $sym81$ADD_ARITY_MAX;
    private static final SubLSymbol $sym82$REMOVE_ARITY_MAX;
    private static final SubLSymbol $sym83$INTER_ARG_ISA_AFTER_ADDING;
    private static final SubLSymbol $sym84$INTER_ARG_ISA_AFTER_REMOVING;
    private static final SubLSymbol $sym85$INTER_ARG_FORMAT_AFTER_ADDING;
    private static final SubLSymbol $sym86$INTER_ARG_FORMAT_AFTER_REMOVING;
    private static final SubLSymbol $sym87$ADD_TO_CONTRACTION_HT;
    private static final SubLSymbol $sym88$REMOVE_FROM_CONTRACTION_HT;
    private static final SubLSymbol $sym89$ADD_GEN_TEMPLATE_EXPANSION;
    private static final SubLSymbol $sym90$REMOVE_GEN_TEMPLATE_EXPANSION;
    private static final SubLObject $const91$expansion;
    private static final SubLList $list92;
    private static final SubLObject $const93$expansionAxiom;
    private static final SubLSymbol $sym94$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $kw95$CNF;
    private static final SubLSymbol $sym96$NEG_LITS;
    private static final SubLObject $const97$True;
    private static final SubLSymbol $sym98$ADD_EXPANSION_AXIOM;
    private static final SubLSymbol $sym99$CYC_ADD_REFORMULATION_ASSERTION;
    private static final SubLSymbol $sym100$CYC_REMOVE_REFORMULATION_ASSERTION;
    private static final SubLList $list101;
    private static final SubLObject $const102$elementOf;
    private static final SubLObject $const103$TheSetOf;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$CYC_ADD_ELEMENT_OF;
    private static final SubLSymbol $sym106$CLEAR_UNIT_MULTIPLICATION_FACTOR_CACHES;
    private static final SubLSymbol $sym107$GAF_ASSERTION_;
    private static final SubLSymbol $sym108$RULE_ASSERTION_;
    private static final SubLSymbol $sym109$CYC_ADD_KNOWN_ANTECEDENT_RULE;
    private static final SubLSymbol $sym110$CYC_REMOVE_KNOWN_ANTECEDENT_RULE;
    private static final SubLSymbol $sym111$ADD_MERGED_CONSTANT_GUID;
    private static final SubLSymbol $sym112$REMOVE_MERGED_CONSTANT_GUID;
    private static final SubLInteger $int113$256;
    private static final SubLSymbol $kw114$MT;
    private static final SubLSymbol $kw115$BROAD_MT;
    private static final SubLString $str116$do_broad_mt_index;
    private static final SubLSymbol $sym117$STRINGP;
    private static final SubLSymbol $kw118$SKIP;
    private static final SubLSymbol $sym119$CYC_EXCEPT_MT_ADDED;
    private static final SubLString $str120$Skipping_propagating_mt_contents_;
    private static final SubLSymbol $sym121$CYC_EXCEPT_MT_REMOVED;
    private static final SubLSymbol $sym122$CYC_EXCEPT_ADDED;
    private static final SubLSymbol $sym123$CYC_EXCEPT_REMOVED;
    private static final SubLObject $const124$except;
    private static final SubLSymbol $kw125$UNKNOWN;
    private static final SubLSymbol $sym126$ADD_RELATION_INSTANCE_ALL;
    private static final SubLSymbol $sym127$REMOVE_RELATION_INSTANCE_ALL;
    private static final SubLSymbol $sym128$ADD_RELATION_ALL_INSTANCE;
    private static final SubLSymbol $sym129$REMOVE_RELATION_ALL_INSTANCE;
    private static final SubLString $str130$__do_create_from_description_mark;
    private static final SubLObject $const131$quotedIsa;
    private static final SubLObject $const132$InstantiatedConstant;
    private static final SubLObject $const133$BookkeepingMt;
    private static final SubLSymbol $sym134$FI_ASSERT;
    private static final SubLSymbol $sym135$QUOTE;
    private static final SubLList $list136;
    private static final SubLString $str137$__do_create_from_description_crea;
    private static final SubLSymbol $sym138$FI_TIMESTAMP_ASSERTION;
    private static final SubLSymbol $sym139$FI_TIMESTAMP_CONSTANT;
    private static final SubLString $str140$__do_create_from_description_afte;
    private static final SubLSymbol $sym141$_TERM;
    private static final SubLObject $const142$and;
    private static final SubLString $str143$__do_create_from_description_reus;
    private static final SubLString $str144$do_create_from_description_found_;
    private static final SubLString $str145$__do_create_from_description_reus;
    private static final SubLString $str146$__do_create_from_description_reus;
    private static final SubLString $str147$__do_create_from_description_reus;
    private static final SubLSymbol $kw148$ASSERTIVE;
    private static final SubLSymbol $sym149$DO_CREATE_FROM_DESCRIPTION;
    private static final SubLSymbol $sym150$INSTANTIATED_CONSTANT_P;
    private static final SubLSymbol $sym151$FIND_CONSTANT;
    private static final SubLSymbol $sym152$MAKE_VALID_CONSTANT_NAME;
    private static final SubLString $str153$do_create_from_description_multip;
    private static final SubLSymbol $sym154$_;
    private static final SubLSymbol $sym155$EXPRESSION_INSTANTIATED_CONSTANT_COUNT;
    private static final SubLSymbol $sym156$POSSIBLE_INSTANTIATED_CONSTANT_TO_REUSE_;
    private static final SubLSymbol $sym157$VALID_CONSTANT_;
    private static final SubLSymbol $sym158$DO_CREATE_FROM_DESCRIPTION_MULTIPLE;
    private static final SubLString $str159$INST;
    private static final SubLSymbol $sym160$NART_P;
    private static final SubLSymbol $sym161$NART_EL_FORMULA;
    private static final SubLSymbol $sym162$CONSTANT_INSTANTIATED_FROM_SUBCOLLECTION_EXPRESSION_P;
    private static final SubLSymbol $sym163$MAX;
    private static final SubLString $str164$More_than_one_terms_match_found_f;
    private static final SubLSymbol $sym165$FORT_NAME;
    private static final SubLList $list166;
    private static final SubLSymbol $sym167$INSTANTIATE_FROM_SUBCOLLECTION_EXPRESSION;
    private static final SubLString $str168$Finding_constants_with_no_asserti;
    private static final SubLString $str169$Killing_constants_with_no_asserti;
    private static final SubLString $str170$__Killing__A__;
    private static final SubLString $str171$___A_constants_killed__;
    private static final SubLString $str172$Finding_instantiated_constants_wi;
    private static final SubLSymbol $sym173$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const174$EverythingPSC;
    private static final SubLString $str175$Gathering_instantiated_constants;
    private static final SubLString $str176$Identifying_unused_instantiated_c;
    private static final SubLString $str177$cdolist;
    private static final SubLString $str178$Removing_;
    private static final SubLString $str179$_unused_instantiated_constant;
    private static final SubLString $str180$;
    private static final SubLString $str181$s;
    private static final SubLList $list182;
    private static final SubLSymbol $sym183$DEDUCTION_SUPPORTED_OBJECT;
    private static final SubLSymbol $sym184$ASSERTION_EL_FORMULA;
    private static final SubLObject $const185$doCreateFromDescription;
    private static final SubLObject $const186$doCreateFromDescription_Multiple;
    private static final SubLString $str187$could_not_determine_created_const;
    private static final SubLString $str188$too_many_instantiated_constant_ga;
    private static final SubLString $str189$not_enough_instantiated_constant_;
    private static final SubLList $list190;
    private static final SubLSymbol $sym191$RELEVANT_MT_IS_EQ;
    private static final SubLList $list192;
    private static final SubLSymbol $sym193$RETAIN_MT_CONTENTS;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 1270L)
    public static SubLObject decache_after_addings(final SubLObject argument, final SubLObject assertion) {
        assert after_adding_modules.NIL != arguments.argument_p(argument) : argument;
        if (after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_arg(assertion, (SubLObject)after_adding_modules.ONE_INTEGER);
            after_adding.recache_gaf_after_addings(pred);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 1553L)
    public static SubLObject decache_after_removings(final SubLObject argument, final SubLObject assertion) {
        assert after_adding_modules.NIL != arguments.argument_p(argument) : argument;
        if (after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_arg(assertion, (SubLObject)after_adding_modules.ONE_INTEGER);
            after_adding.recache_gaf_after_removings(pred);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 1846L)
    public static SubLObject decache_rule_after_addings(final SubLObject argument, final SubLObject assertion) {
        assert after_adding_modules.NIL != arguments.argument_p(argument) : argument;
        if (after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_arg(assertion, (SubLObject)after_adding_modules.ONE_INTEGER);
            rule_after_adding.recache_rule_after_addings(pred);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 2139L)
    public static SubLObject decache_rule_after_removings(final SubLObject argument, final SubLObject assertion) {
        assert after_adding_modules.NIL != arguments.argument_p(argument) : argument;
        if (after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_arg(assertion, (SubLObject)after_adding_modules.ONE_INTEGER);
            rule_after_adding.recache_rule_after_removings(pred);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 2442L)
    public static SubLObject clear_mt_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        return possibly_clear_mt_dependent_caches(argument, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 2656L)
    public static SubLObject possibly_clear_mt_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != memoization_state.clear_mt_dependent_cachesP()) {
            clear_mt_dependent_caches_int(argument, assertion);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 2838L)
    public static SubLObject clear_mt_dependent_caches_int(final SubLObject argument, final SubLObject assertion) {
        genl_mts.clear_all_base_mts();
        mt_relevance_cache.update_mt_relevance_cache(argument, assertion);
        predicate_relevance_cache.clear_predicate_relevance_cache();
        sdc.clear_cached_all_isa_sdct();
        tva_utilities.clear_cached_some_tva_for_predicate();
        SubLObject cdolist_list_var = memoization_state.$mt_dependent_cache_clear_callbacks$.getGlobalValue();
        SubLObject callback = (SubLObject)after_adding_modules.NIL;
        callback = cdolist_list_var.first();
        while (after_adding_modules.NIL != cdolist_list_var) {
            if (after_adding_modules.NIL != Symbols.fboundp(callback)) {
                Functions.funcall(callback);
            }
            cdolist_list_var = cdolist_list_var.rest();
            callback = cdolist_list_var.first();
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 3361L)
    public static SubLObject clear_genls_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL == after_adding_modules.$inside_clear_genls_dependent_cachesP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = after_adding_modules.$inside_clear_genls_dependent_cachesP$.currentBinding(thread);
            try {
                after_adding_modules.$inside_clear_genls_dependent_cachesP$.bind((SubLObject)after_adding_modules.T, thread);
                SubLObject cdolist_list_var = memoization_state.$genls_dependent_cache_clear_callbacks$.getGlobalValue();
                SubLObject callback = (SubLObject)after_adding_modules.NIL;
                callback = cdolist_list_var.first();
                while (after_adding_modules.NIL != cdolist_list_var) {
                    if (after_adding_modules.NIL != Symbols.fboundp(callback)) {
                        Functions.funcall(callback);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    callback = cdolist_list_var.first();
                }
                clear_isa_dependent_caches_internal();
                clear_quoted_isa_dependent_caches_internal();
            }
            finally {
                after_adding_modules.$inside_clear_genls_dependent_cachesP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 3832L)
    public static SubLObject clear_isa_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        clear_isa_dependent_caches_internal();
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4159L)
    public static SubLObject clear_isa_dependent_caches_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL == after_adding_modules.$inside_clear_isa_dependent_cachesP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = after_adding_modules.$inside_clear_isa_dependent_cachesP$.currentBinding(thread);
            try {
                after_adding_modules.$inside_clear_isa_dependent_cachesP$.bind((SubLObject)after_adding_modules.T, thread);
                sdc.clear_cached_all_isa_sdct();
                sksi_kb_accessors.clear_sksi_content_mts();
                SubLObject cdolist_list_var = memoization_state.$isa_dependent_cache_clear_callbacks$.getGlobalValue();
                SubLObject callback = (SubLObject)after_adding_modules.NIL;
                callback = cdolist_list_var.first();
                while (after_adding_modules.NIL != cdolist_list_var) {
                    if (after_adding_modules.NIL != Symbols.fboundp(callback)) {
                        Functions.funcall(callback);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    callback = cdolist_list_var.first();
                }
            }
            finally {
                after_adding_modules.$inside_clear_isa_dependent_cachesP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4573L)
    public static SubLObject clear_quoted_isa_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        clear_quoted_isa_dependent_caches_internal();
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4945L)
    public static SubLObject clear_quoted_isa_dependent_caches_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL == after_adding_modules.$inside_clear_quoted_isa_dependent_cachesP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = after_adding_modules.$inside_clear_quoted_isa_dependent_cachesP$.currentBinding(thread);
            try {
                after_adding_modules.$inside_clear_quoted_isa_dependent_cachesP$.bind((SubLObject)after_adding_modules.T, thread);
                SubLObject cdolist_list_var = memoization_state.$quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue();
                SubLObject callback = (SubLObject)after_adding_modules.NIL;
                callback = cdolist_list_var.first();
                while (after_adding_modules.NIL != cdolist_list_var) {
                    if (after_adding_modules.NIL != Symbols.fboundp(callback)) {
                        Functions.funcall(callback);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    callback = cdolist_list_var.first();
                }
            }
            finally {
                after_adding_modules.$inside_clear_quoted_isa_dependent_cachesP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 5301L)
    public static SubLObject clear_genl_pred_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        predicate_relevance_cache.clear_predicate_relevance_cache();
        tva_utilities.clear_cached_some_tva_for_predicate();
        SubLObject cdolist_list_var = memoization_state.$genl_preds_dependent_cache_clear_callbacks$.getGlobalValue();
        SubLObject callback = (SubLObject)after_adding_modules.NIL;
        callback = cdolist_list_var.first();
        while (after_adding_modules.NIL != cdolist_list_var) {
            if (after_adding_modules.NIL != Symbols.fboundp(callback)) {
                Functions.funcall(callback);
            }
            cdolist_list_var = cdolist_list_var.rest();
            callback = cdolist_list_var.first();
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 5724L)
    public static SubLObject add_transitive_via_arg(final SubLObject argument, final SubLObject assertion) {
        tva_cache.tva_cache_add_transitive_via_arg(assertion);
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6027L)
    public static SubLObject remove_transitive_via_arg(final SubLObject argument, final SubLObject assertion) {
        tva_cache.tva_cache_remove_transitive_via_arg(assertion);
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6181L)
    public static SubLObject add_transitive_via_arg_inverse(final SubLObject argument, final SubLObject assertion) {
        tva_cache.tva_cache_add_transitive_via_arg_inverse(assertion);
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6343L)
    public static SubLObject remove_transitive_via_arg_inverse(final SubLObject argument, final SubLObject assertion) {
        tva_cache.tva_cache_remove_transitive_via_arg_inverse(assertion);
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6513L)
    public static SubLObject clear_cached_tva_checks(final SubLObject argument, final SubLObject assertion) {
        tva_utilities.clear_cached_some_tva_for_predicate();
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6663L)
    public static SubLObject clear_cached_some_tva_checks(final SubLObject argument, final SubLObject assertion) {
        tva_utilities.clear_cached_some_tva_for_predicate();
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6818L)
    public static SubLObject clear_cached_cva_checks(final SubLObject argument, final SubLObject assertion) {
        tva_utilities.clear_cached_some_cva_for_predicate();
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 6968L)
    public static SubLObject clear_cached_some_cva_checks(final SubLObject argument, final SubLObject assertion) {
        tva_utilities.clear_cached_some_cva_for_predicate();
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 7123L)
    public static SubLObject skolem_after_removing(final SubLObject argument, final SubLObject assertion) {
        final SubLObject skolem_function = assertions_high.gaf_arg1(assertion);
        if (after_adding_modules.NIL == hl_macros.fort_being_removedP(skolem_function)) {
            cyc_kernel.cyc_kill(skolem_function);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 7474L)
    public static SubLObject add_old_constant_name(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject constant = assertions_high.gaf_arg(assertion, (SubLObject)after_adding_modules.ONE_INTEGER);
            final SubLObject string = assertions_high.gaf_arg(assertion, (SubLObject)after_adding_modules.TWO_INTEGER);
            if (after_adding_modules.NIL != constant_handles.constant_p(constant) && after_adding_modules.NIL == constant_handles.constant_p(constants_high.find_constant(string))) {
                ke.cache_old_constant_name(string, constant);
            }
            return (SubLObject)after_adding_modules.NIL;
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 7965L)
    public static SubLObject remove_old_constant_name(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject constant = assertions_high.gaf_arg(assertion, (SubLObject)after_adding_modules.ONE_INTEGER);
            final SubLObject string = assertions_high.gaf_arg(assertion, (SubLObject)after_adding_modules.TWO_INTEGER);
            if (after_adding_modules.NIL != constant_handles.constant_p(constant) && after_adding_modules.NIL == constant_handles.constant_p(constants_high.find_constant(string))) {
                ke.decache_old_constant_name(string, constant);
            }
            return (SubLObject)after_adding_modules.NIL;
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 8402L)
    public static SubLObject propagate_to_isa(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses(after_adding_modules.$const22$isa, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 8760L)
    public static SubLObject propagate_to_genls(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses(after_adding_modules.$const24$genls, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 8901L)
    public static SubLObject propagate_to_disjointwith(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses(after_adding_modules.$const26$disjointWith, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9056L)
    public static SubLObject propagate_to_genlmt(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses(after_adding_modules.$const28$genlMt, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9200L)
    public static SubLObject propagate_to_genlpreds(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses(after_adding_modules.$const30$genlPreds, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9350L)
    public static SubLObject propagate_to_negationpreds(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses(after_adding_modules.$const32$negationPreds, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9507L)
    public static SubLObject propagate_to_genlinverse(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses(after_adding_modules.$const34$genlInverse, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9660L)
    public static SubLObject propagate_to_negationinverse(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses(after_adding_modules.$const36$negationInverse, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 9821L)
    public static SubLObject propagate_inverse_to_isa(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses(after_adding_modules.$const22$isa, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 10053L)
    public static SubLObject propagate_inverse_to_genls(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses(after_adding_modules.$const24$genls, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 10205L)
    public static SubLObject propagate_inverse_to_genlmt(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses(after_adding_modules.$const28$genlMt, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 10360L)
    public static SubLObject propagate_inverse_to_genlpreds(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses(after_adding_modules.$const30$genlPreds, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 10521L)
    public static SubLObject propagate_inverse_to_genlinverse(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses(after_adding_modules.$const34$genlInverse, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 10685L)
    public static SubLObject propagate_sbhl_spec_pred_uses(final SubLObject sbhl_pred, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject formula = assertions_high.gaf_formula(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (el_utilities.literal_arity(formula, (SubLObject)after_adding_modules.UNPROVIDED).numE((SubLObject)after_adding_modules.TWO_INTEGER)) {
                SubLObject current;
                final SubLObject datum = current = formula;
                SubLObject pred = (SubLObject)after_adding_modules.NIL;
                SubLObject arg1 = (SubLObject)after_adding_modules.NIL;
                SubLObject arg2 = (SubLObject)after_adding_modules.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list43);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list43);
                arg1 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list43);
                arg2 = current.first();
                current = current.rest();
                if (after_adding_modules.NIL == current) {
                    if (after_adding_modules.NIL != genl_predicates.genl_predP(pred, sbhl_pred, mt, (SubLObject)after_adding_modules.UNPROVIDED)) {
                        final SubLObject result_formula = (SubLObject)ConsesLow.list(sbhl_pred, arg1, arg2);
                        final SubLObject more_support_formula = (SubLObject)ConsesLow.list(after_adding_modules.$const30$genlPreds, pred, sbhl_pred);
                        final SubLObject more_support = fi.make_el_support((SubLObject)after_adding_modules.$kw44$GENLPREDS, more_support_formula, mt, (SubLObject)after_adding_modules.$kw45$MONOTONIC);
                        final SubLObject supports = (SubLObject)ConsesLow.list(assertion, more_support);
                        fi.fi_add_argument_int(result_formula, mt, supports, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)after_adding_modules.$list43);
                }
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 11583L)
    public static SubLObject propagate_sbhl_spec_inverse_uses(final SubLObject sbhl_pred, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject formula = assertions_high.gaf_formula(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (el_utilities.literal_arity(formula, (SubLObject)after_adding_modules.UNPROVIDED).numE((SubLObject)after_adding_modules.TWO_INTEGER)) {
                SubLObject current;
                final SubLObject datum = current = formula;
                SubLObject pred = (SubLObject)after_adding_modules.NIL;
                SubLObject arg1 = (SubLObject)after_adding_modules.NIL;
                SubLObject arg2 = (SubLObject)after_adding_modules.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list43);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list43);
                arg1 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list43);
                arg2 = current.first();
                current = current.rest();
                if (after_adding_modules.NIL == current) {
                    if (after_adding_modules.NIL != genl_predicates.genl_inverseP(pred, sbhl_pred, mt, (SubLObject)after_adding_modules.UNPROVIDED)) {
                        final SubLObject result_formula = (SubLObject)ConsesLow.list(sbhl_pred, arg2, arg1);
                        final SubLObject more_support_formula = (SubLObject)ConsesLow.list(after_adding_modules.$const34$genlInverse, pred, sbhl_pred);
                        final SubLObject more_support = fi.make_el_support((SubLObject)after_adding_modules.$kw44$GENLPREDS, more_support_formula, mt, (SubLObject)after_adding_modules.$kw45$MONOTONIC);
                        final SubLObject supports = (SubLObject)ConsesLow.list(assertion, more_support);
                        fi.fi_add_argument_int(result_formula, mt, supports, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)after_adding_modules.$list43);
                }
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 12483L)
    public static SubLObject add_ist(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_assertionP(assertion)) {
            final SubLObject ist_formula = fi.assertion_fi_formula(assertion, (SubLObject)after_adding_modules.UNPROVIDED);
            final SubLObject direction = assertions_high.assertion_direction(assertion);
            SubLObject current;
            final SubLObject datum = current = ist_formula;
            SubLObject ist = (SubLObject)after_adding_modules.NIL;
            SubLObject mt = (SubLObject)after_adding_modules.NIL;
            SubLObject formula = (SubLObject)after_adding_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list46);
            ist = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list46);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list46);
            formula = current.first();
            current = current.rest();
            if (after_adding_modules.NIL == current) {
                if (ist.eql(after_adding_modules.$const47$ist)) {
                    final SubLObject hl_rule_support = add_ist_el_support(mt);
                    final SubLObject supports = (SubLObject)ConsesLow.list(hl_rule_support, assertion);
                    fi.fi_add_argument_int(formula, mt, supports, direction, (SubLObject)after_adding_modules.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)after_adding_modules.$list46);
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 13233L)
    public static SubLObject add_ist_el_support(final SubLObject mt) {
        final SubLObject hl_rule = (SubLObject)ConsesLow.listS(after_adding_modules.$const49$implies, (SubLObject)ConsesLow.listS(after_adding_modules.$const47$ist, mt, (SubLObject)after_adding_modules.$list50), (SubLObject)after_adding_modules.$list50);
        return fi.make_el_support((SubLObject)after_adding_modules.$kw51$CODE, hl_rule, mt, (SubLObject)after_adding_modules.$kw45$MONOTONIC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 13409L)
    public static SubLObject add_true_rule(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject template = assertions_high.gaf_arg1(assertion);
            final SubLObject rule_formula = assertions_high.gaf_arg2(assertion);
            final SubLObject direction = rule_template_direction(template, mt);
            final SubLObject true_rule_el_support = true_rule_el_support();
            final SubLObject supports = (SubLObject)ConsesLow.list(true_rule_el_support, assertion);
            final SubLObject environment = forward.get_forward_inference_environment();
            assert after_adding_modules.NIL != queues.queue_p(environment) : environment;
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                fi.fi_add_argument_int(rule_formula, mt, supports, direction, (SubLObject)after_adding_modules.UNPROVIDED);
            }
            finally {
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14363L)
    public static SubLObject true_rule_el_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_rule = after_adding_modules.$true_rule_template$.getDynamicValue(thread);
        return fi.make_el_support((SubLObject)after_adding_modules.$kw51$CODE, hl_rule, after_adding_modules.$true_rule_defining_mt$.getGlobalValue(), (SubLObject)after_adding_modules.$kw45$MONOTONIC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14525L)
    public static SubLObject true_rule_support_p(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL == assertion_handles.assertion_p(support) && after_adding_modules.$true_rule_template$.getDynamicValue(thread).equal(arguments.support_formula(support)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14684L)
    public static SubLObject rule_template_direction(final SubLObject rule_template, SubLObject mt) {
        if (mt == after_adding_modules.UNPROVIDED) {
            mt = (SubLObject)after_adding_modules.NIL;
        }
        assert after_adding_modules.NIL != forts.fort_p(rule_template) : rule_template;
        final SubLObject pcase_var;
        final SubLObject direction = pcase_var = kb_mapping_utilities.fpred_value_in_relevant_mts(rule_template, after_adding_modules.$const59$ruleTemplateDirection, mt, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
        if (pcase_var.eql(after_adding_modules.$const60$Forward_AssertionDirection)) {
            return (SubLObject)after_adding_modules.$kw61$FORWARD;
        }
        if (pcase_var.eql(after_adding_modules.$const62$Backward_AssertionDirection)) {
            return (SubLObject)after_adding_modules.$kw63$BACKWARD;
        }
        return (SubLObject)after_adding_modules.$kw63$BACKWARD;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 15062L)
    public static SubLObject add_rule_template_direction(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject template = assertions_high.gaf_arg1(assertion);
            final SubLObject direction = assertions_high.gaf_arg2(assertion);
            final SubLObject template_instantiations = rule_template_instantiations(template, mt);
            final SubLObject pcase_var = direction;
            if (pcase_var.eql(after_adding_modules.$const60$Forward_AssertionDirection)) {
                SubLObject cdolist_list_var = template_instantiations;
                SubLObject template_instantiation = (SubLObject)after_adding_modules.NIL;
                template_instantiation = cdolist_list_var.first();
                while (after_adding_modules.NIL != cdolist_list_var) {
                    tms.tms_change_direction(template_instantiation, (SubLObject)after_adding_modules.$kw61$FORWARD);
                    cdolist_list_var = cdolist_list_var.rest();
                    template_instantiation = cdolist_list_var.first();
                }
                forward.perform_forward_inference();
            }
            else if (pcase_var.eql(after_adding_modules.$const62$Backward_AssertionDirection)) {
                SubLObject cdolist_list_var = template_instantiations;
                SubLObject template_instantiation = (SubLObject)after_adding_modules.NIL;
                template_instantiation = cdolist_list_var.first();
                while (after_adding_modules.NIL != cdolist_list_var) {
                    tms.tms_change_direction(template_instantiation, (SubLObject)after_adding_modules.$kw63$BACKWARD);
                    cdolist_list_var = cdolist_list_var.rest();
                    template_instantiation = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 15930L)
    public static SubLObject remove_rule_template_direction(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject template = assertions_high.gaf_arg1(assertion);
            SubLObject cdolist_list_var;
            final SubLObject template_instantiations = cdolist_list_var = rule_template_instantiations(template, mt);
            SubLObject template_instantiation = (SubLObject)after_adding_modules.NIL;
            template_instantiation = cdolist_list_var.first();
            while (after_adding_modules.NIL != cdolist_list_var) {
                tms.tms_change_direction(template_instantiation, (SubLObject)after_adding_modules.$kw63$BACKWARD);
                cdolist_list_var = cdolist_list_var.rest();
                template_instantiation = cdolist_list_var.first();
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 16399L)
    public static SubLObject rule_template_instantiations(final SubLObject template, SubLObject mt) {
        if (mt == after_adding_modules.UNPROVIDED) {
            mt = (SubLObject)after_adding_modules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject instantiations = (SubLObject)after_adding_modules.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject pred_var = after_adding_modules.$const57$trueRule;
            if (after_adding_modules.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(template, (SubLObject)after_adding_modules.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(template, (SubLObject)after_adding_modules.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)after_adding_modules.NIL;
                final SubLObject token_var = (SubLObject)after_adding_modules.NIL;
                while (after_adding_modules.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (after_adding_modules.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)after_adding_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)after_adding_modules.$kw66$GAF, (SubLObject)after_adding_modules.$kw67$TRUE, (SubLObject)after_adding_modules.NIL);
                            SubLObject done_var_$1 = (SubLObject)after_adding_modules.NIL;
                            final SubLObject token_var_$2 = (SubLObject)after_adding_modules.NIL;
                            while (after_adding_modules.NIL == done_var_$1) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(ass));
                                if (after_adding_modules.NIL != valid_$3) {
                                    final SubLObject set_contents_var = assertions_high.assertion_dependents(ass);
                                    SubLObject basis_object;
                                    SubLObject state;
                                    SubLObject deduction;
                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)after_adding_modules.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); after_adding_modules.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        deduction = set_contents.do_set_contents_next(basis_object, state);
                                        if (after_adding_modules.NIL != set_contents.do_set_contents_element_validP(state, deduction) && after_adding_modules.NIL != rule_template_instantiation_deduction(deduction)) {
                                            instantiations = (SubLObject)ConsesLow.cons(deductions_high.deduction_supported_object(deduction), instantiations);
                                        }
                                    }
                                }
                                done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL == valid_$3);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)after_adding_modules.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (after_adding_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(instantiations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 16825L)
    public static SubLObject rule_template_instantiation_deduction(final SubLObject deduction) {
        assert after_adding_modules.NIL != deduction_handles.deduction_p(deduction) : deduction;
        return Sequences.find_if(Symbols.symbol_function((SubLObject)after_adding_modules.$sym69$TRUE_RULE_SUPPORT_P), deductions_high.deduction_supports(deduction), (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 17001L)
    public static SubLObject remove_dependent_term(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject dependent_term = assertions_high.gaf_arg1(assertion);
            if (after_adding_modules.NIL != forts.fort_p(dependent_term) && after_adding_modules.NIL == hl_macros.fort_being_removedP(dependent_term)) {
                final SubLObject independent_term = assertions_high.gaf_arg2(assertion);
                if (after_adding_modules.NIL != forts.fort_p(independent_term) && after_adding_modules.NIL != hl_macros.fort_being_removed_or_will_be_removedP(independent_term)) {
                    return cyc_kernel.cyc_kill(dependent_term);
                }
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 17725L)
    public static SubLObject propagate_to_arity(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses(after_adding_modules.$const71$arity, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 17927L)
    public static SubLObject add_arity(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_assertionP(assertion) && after_adding_modules.NIL != assertions_high.only_argument_of_assertion_p(assertion, argument)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject v_arity = assertions_high.gaf_arg2(assertion);
            arity.maybe_add_arity_for_relation(relation, v_arity);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 18243L)
    public static SubLObject remove_arity(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL == kb_accessors.assertion_still_thereP(assertion, (SubLObject)after_adding_modules.$kw67$TRUE)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject v_arity = assertions_high.gaf_arg2(assertion);
            arity.maybe_remove_arity_for_relation(relation, v_arity);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 18529L)
    public static SubLObject propagate_to_arity_min(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses(after_adding_modules.$const75$arityMin, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 18742L)
    public static SubLObject add_arity_min(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_assertionP(assertion) && after_adding_modules.NIL != assertions_high.only_argument_of_assertion_p(assertion, argument)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject arity_min = assertions_high.gaf_arg2(assertion);
            arity.maybe_add_arity_min_for_relation(relation, arity_min);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 19063L)
    public static SubLObject remove_arity_min(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL == kb_accessors.assertion_still_thereP(assertion, (SubLObject)after_adding_modules.$kw67$TRUE)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            arity.maybe_remove_arity_min_for_relation(relation);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 19315L)
    public static SubLObject propagate_to_arity_max(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses(after_adding_modules.$const79$arityMax, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 19528L)
    public static SubLObject add_arity_max(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_assertionP(assertion) && after_adding_modules.NIL != assertions_high.only_argument_of_assertion_p(assertion, argument)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject arity_max = assertions_high.gaf_arg2(assertion);
            arity.maybe_add_arity_max_for_relation(relation, arity_max);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 19849L)
    public static SubLObject remove_arity_max(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL == kb_accessors.assertion_still_thereP(assertion, (SubLObject)after_adding_modules.$kw67$TRUE)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            arity.maybe_remove_arity_max_for_relation(relation);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 20101L)
    public static SubLObject inter_arg_isa_after_adding(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_isa_assertion_somewhere_cache_add(reln);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 20417L)
    public static SubLObject inter_arg_isa_after_removing(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_isa_assertion_somewhere_cache_maybe_remove(reln);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 20678L)
    public static SubLObject inter_arg_format_after_adding(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_format_assertion_somewhere_cache_add(reln);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 21003L)
    public static SubLObject inter_arg_format_after_removing(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_format_assertion_somewhere_cache_maybe_remove(reln);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 21270L)
    public static SubLObject add_to_contraction_ht(final SubLObject argument, final SubLObject assertion) {
        return tersifier.add_assertion_to_contraction_ht(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 21633L)
    public static SubLObject remove_from_contraction_ht(final SubLObject argument, final SubLObject assertion) {
        return tersifier.remove_assertion_from_contraction_ht(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 21926L)
    public static SubLObject add_gen_template_expansion(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            if (after_adding_modules.NIL != pph_functions.pph_phrase_fnP(reln, (SubLObject)after_adding_modules.UNPROVIDED)) {
                pph_templates.reinitialize_gen_templates_referencing_phrase_fn(reln);
            }
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 22308L)
    public static SubLObject remove_gen_template_expansion(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            if (after_adding_modules.NIL != pph_functions.pph_phrase_fnP(reln, (SubLObject)after_adding_modules.UNPROVIDED)) {
                pph_templates.reinitialize_gen_templates_referencing_phrase_fn(reln);
            }
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 22695L)
    public static SubLObject add_expansion_axiom(final SubLObject argument, final SubLObject meta_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL != after_adding.initial_assertion_argumentP(argument, meta_assertion) && after_adding_modules.NIL != assertion_utilities.true_assertionP(meta_assertion)) {
            final SubLObject rm_pred = assertions_high.gaf_arg1(meta_assertion);
            final SubLObject assertion = assertions_high.gaf_arg2(meta_assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (after_adding_modules.NIL == kb_mapping_utilities.fpred_value_in_relevant_mts(rm_pred, after_adding_modules.$const91$expansion, mt, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED)) {
                final SubLObject add_expansion_axiom_assertion = czer_utilities.safe_find_gaf_genl_mts((SubLObject)after_adding_modules.$list92, mt);
                SubLObject validP = (SubLObject)after_adding_modules.T;
                if (after_adding_modules.NIL != add_expansion_axiom_assertion) {
                    final SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                    final SubLObject sibling_expansion_axioms = Sequences.remove(assertion, kb_mapping_utilities.pred_values_in_relevant_mts(rm_pred, after_adding_modules.$const93$expansionAxiom, mt, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED), (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                    SubLObject cnfs = (SubLObject)after_adding_modules.NIL;
                    SubLObject expansion = (SubLObject)after_adding_modules.NIL;
                    if (after_adding_modules.NIL != sibling_expansion_axioms) {
                        SubLObject invalidP = (SubLObject)after_adding_modules.NIL;
                        if (after_adding_modules.NIL == invalidP) {
                            SubLObject csome_list_var;
                            SubLObject sibling_expansion_axiom;
                            for (csome_list_var = sibling_expansion_axioms, sibling_expansion_axiom = (SubLObject)after_adding_modules.NIL, sibling_expansion_axiom = csome_list_var.first(); after_adding_modules.NIL == invalidP && after_adding_modules.NIL != csome_list_var; invalidP = (SubLObject)SubLObjectFactory.makeBoolean(!formula.equal(uncanonicalizer.assertion_el_formula(sibling_expansion_axiom))), csome_list_var = csome_list_var.rest(), sibling_expansion_axiom = csome_list_var.first()) {}
                        }
                        validP = (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL == invalidP);
                    }
                    if (after_adding_modules.NIL != validP) {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)after_adding_modules.$sym94$RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            wff.reset_wff_state();
                            cnfs = clausifier.clausal_form(formula, mt, (SubLObject)after_adding_modules.$kw95$CNF);
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                        if (cnfs.isList() && after_adding_modules.NIL != list_utilities.singletonP(Sequences.remove_duplicates(Mapping.mapcar(Symbols.symbol_function((SubLObject)after_adding_modules.$sym96$NEG_LITS), cnfs), Symbols.symbol_function((SubLObject)after_adding_modules.EQUAL), (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED))) {
                            SubLObject pred_neg_lit = (SubLObject)after_adding_modules.NIL;
                            SubLObject blist = (SubLObject)after_adding_modules.NIL;
                            final SubLObject cnf = cnfs.first();
                            final SubLObject neg_lits = clauses.neg_lits(cnf);
                            if (after_adding_modules.NIL == pred_neg_lit) {
                                SubLObject csome_list_var2 = neg_lits;
                                SubLObject neg_lit = (SubLObject)after_adding_modules.NIL;
                                neg_lit = csome_list_var2.first();
                                while (after_adding_modules.NIL == pred_neg_lit && after_adding_modules.NIL != csome_list_var2) {
                                    if (rm_pred.eql(el_utilities.literal_arg0(neg_lit, (SubLObject)after_adding_modules.UNPROVIDED))) {
                                        SubLObject argnum = (SubLObject)after_adding_modules.ZERO_INTEGER;
                                        SubLObject non_varP = (SubLObject)after_adding_modules.NIL;
                                        if (after_adding_modules.NIL == non_varP) {
                                            SubLObject csome_list_var_$5 = el_utilities.literal_args(neg_lit, (SubLObject)after_adding_modules.UNPROVIDED);
                                            SubLObject arg = (SubLObject)after_adding_modules.NIL;
                                            arg = csome_list_var_$5.first();
                                            while (after_adding_modules.NIL == non_varP && after_adding_modules.NIL != csome_list_var_$5) {
                                                argnum = Numbers.add(argnum, (SubLObject)after_adding_modules.ONE_INTEGER);
                                                if (after_adding_modules.NIL != cycl_variables.el_varP(arg)) {
                                                    blist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(arg, at_utilities.get_generic_arg(argnum)), blist);
                                                }
                                                else {
                                                    non_varP = (SubLObject)after_adding_modules.T;
                                                }
                                                csome_list_var_$5 = csome_list_var_$5.rest();
                                                arg = csome_list_var_$5.first();
                                            }
                                        }
                                        if (after_adding_modules.NIL == non_varP) {
                                            pred_neg_lit = neg_lit;
                                        }
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    neg_lit = csome_list_var2.first();
                                }
                            }
                            if (after_adding_modules.NIL != pred_neg_lit && after_adding_modules.NIL != blist) {
                                final SubLObject _prev_bind_3 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
                                try {
                                    wff_vars.$permit_generic_arg_variablesP$.bind((SubLObject)after_adding_modules.T, thread);
                                    final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)after_adding_modules.$sym94$RELEVANT_MT_IS_GENL_MT, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        expansion = simplifier.simplify_cycl_sentence(conses_high.sublis(blist, conses_high.subst(after_adding_modules.$const97$True, pred_neg_lit, formula, Symbols.symbol_function((SubLObject)after_adding_modules.EQUAL), (SubLObject)after_adding_modules.UNPROVIDED), (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED), (SubLObject)after_adding_modules.UNPROVIDED);
                                    }
                                    finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    if (after_adding_modules.NIL != el_utilities.el_formula_p(expansion) && after_adding_modules.NIL != wff.el_wffP(expansion, mt, (SubLObject)after_adding_modules.UNPROVIDED) && after_adding_modules.NIL == list_utilities.tree_find(rm_pred, expansion, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED)) {
                                        fi.fi_add_argument_int((SubLObject)ConsesLow.list(after_adding_modules.$const91$expansion, rm_pred, expansion), mt, (SubLObject)ConsesLow.list(meta_assertion, add_expansion_axiom_assertion), (SubLObject)after_adding_modules.$kw61$FORWARD, (SubLObject)after_adding_modules.T);
                                    }
                                }
                                finally {
                                    wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                    }
                }
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 25696L)
    public static SubLObject cyc_add_reformulation_assertion(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != after_adding.initial_assertion_argumentP(argument, assertion) && after_adding_modules.NIL != reformulator_datastructures.reformulator_initializedP() && after_adding_modules.NIL != reformulator_datastructures.reformulator_relevant_assertionP(assertion)) {
            reformulator_datastructures.add_reformulation_assertion(assertion);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 26211L)
    public static SubLObject cyc_remove_reformulation_assertion(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != after_adding.final_assertion_argumentP(argument, assertion) && after_adding_modules.NIL != reformulator_datastructures.reformulator_initializedP()) {
            reformulator_datastructures.remove_reformulation_assertion(assertion);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 26505L)
    public static SubLObject cyc_add_element_of(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != after_adding.initial_assertion_argumentP(argument, assertion) && after_adding_modules.NIL != assertion_utilities.true_assertionP(assertion)) {
            final SubLObject eo_formula = fi.assertion_fi_formula(assertion, (SubLObject)after_adding_modules.UNPROVIDED);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject current;
            final SubLObject datum = current = eo_formula;
            SubLObject eo = (SubLObject)after_adding_modules.NIL;
            SubLObject v_term = (SubLObject)after_adding_modules.NIL;
            SubLObject setexpr = (SubLObject)after_adding_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list101);
            eo = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list101);
            v_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)after_adding_modules.$list101);
            setexpr = current.first();
            current = current.rest();
            if (after_adding_modules.NIL == current) {
                if (eo.eql(after_adding_modules.$const102$elementOf) && after_adding_modules.NIL != el_utilities.el_formula_with_operator_p(setexpr, after_adding_modules.$const103$TheSetOf)) {
                    SubLObject current_$8;
                    final SubLObject datum_$7 = current_$8 = setexpr;
                    SubLObject tso = (SubLObject)after_adding_modules.NIL;
                    SubLObject var = (SubLObject)after_adding_modules.NIL;
                    SubLObject prop = (SubLObject)after_adding_modules.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)after_adding_modules.$list104);
                    tso = current_$8.first();
                    current_$8 = current_$8.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)after_adding_modules.$list104);
                    var = current_$8.first();
                    current_$8 = current_$8.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)after_adding_modules.$list104);
                    prop = current_$8.first();
                    current_$8 = current_$8.rest();
                    if (after_adding_modules.NIL == current_$8) {
                        final SubLObject transformed_conclusion = cycl_utilities.expression_subst(v_term, var, prop, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                        fi.fi_add_argument_int(transformed_conclusion, mt, (SubLObject)ConsesLow.list(assertion), (SubLObject)after_adding_modules.$kw61$FORWARD, (SubLObject)after_adding_modules.T);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$7, (SubLObject)after_adding_modules.$list104);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)after_adding_modules.$list101);
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 27300L)
    public static SubLObject clear_unit_multiplication_factor_caches(final SubLObject argument, final SubLObject assertion) {
        quantities.clear_get_definitional_unit_multiplication_factor();
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 27961L)
    public static SubLObject cyc_add_known_antecedent_rule(final SubLObject argument, final SubLObject assertion) {
        assert after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        final SubLObject rule = assertions_high.gaf_arg1(assertion);
        assert after_adding_modules.NIL != assertions_high.rule_assertionP(rule) : rule;
        removal_modules_known_antecedent_rule.declare_known_antecedent_rule_removal_module_for_rule(rule, (SubLObject)after_adding_modules.T);
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 28451L)
    public static SubLObject cyc_remove_known_antecedent_rule(final SubLObject argument, final SubLObject assertion) {
        assert after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        final SubLObject rule = assertions_high.gaf_arg1(assertion);
        assert after_adding_modules.NIL != assertions_high.rule_assertionP(rule) : rule;
        removal_modules_known_antecedent_rule.undeclare_known_antecedent_rule_removal_module_for_rule(rule, (SubLObject)after_adding_modules.T);
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 28849L)
    public static SubLObject add_merged_constant_guid(final SubLObject argument, final SubLObject assertion) {
        assert after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        final SubLObject constant = assertions_high.gaf_arg1(assertion);
        final SubLObject guid_string = assertions_high.gaf_arg2(assertion);
        final SubLObject guid = Guids.string_to_guid(guid_string);
        if (after_adding_modules.NIL != constant_handles.constant_p(constant) && after_adding_modules.NIL == constant_handles.constant_p(constants_high.find_constant_by_guid(guid))) {
            constants_low.install_constant_merged_guid(constant, guid);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 29425L)
    public static SubLObject remove_merged_constant_guid(final SubLObject argument, final SubLObject assertion) {
        assert after_adding_modules.NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        final SubLObject constant = assertions_high.gaf_arg1(assertion);
        final SubLObject guid_string = assertions_high.gaf_arg2(assertion);
        final SubLObject guid = Guids.string_to_guid(guid_string);
        if (after_adding_modules.NIL != constant_handles.constant_p(constant) && after_adding_modules.NIL == constant_handles.constant_p(constants_high.find_constant_by_guid(guid))) {
            constants_low.uninstall_constant_merged_guid(constant, guid);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 30060L)
    public static SubLObject cyc_except_mt_added(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL != after_adding.initial_assertion_argumentP(argument, assertion) && after_adding_modules.NIL != assertion_utilities.true_assertionP(assertion)) {
            if (after_adding_modules.NIL != hl_transcript_tracing.within_hl_evalP()) {
                return (SubLObject)after_adding_modules.NIL;
            }
            if (after_adding_modules.NIL == fi_edit.$within_fi_edit_add_old_exceptP$.getDynamicValue(thread)) {
                SubLObject sub_assertions = (SubLObject)after_adding_modules.NIL;
                final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(assertions_high.gaf_arg1(assertion));
                if (pcase_var.eql((SubLObject)after_adding_modules.$kw114$MT)) {
                    if (after_adding_modules.NIL != kb_mapping_macros.do_mt_index_key_validator(assertions_high.gaf_arg1(assertion), (SubLObject)after_adding_modules.NIL)) {
                        final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(assertions_high.gaf_arg1(assertion));
                        SubLObject final_index_iterator = (SubLObject)after_adding_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)after_adding_modules.NIL, (SubLObject)after_adding_modules.NIL, (SubLObject)after_adding_modules.NIL);
                            SubLObject done_var = (SubLObject)after_adding_modules.NIL;
                            final SubLObject token_var = (SubLObject)after_adding_modules.NIL;
                            while (after_adding_modules.NIL == done_var) {
                                final SubLObject sub_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(sub_assertion));
                                if (after_adding_modules.NIL != valid) {
                                    sub_assertions = (SubLObject)ConsesLow.cons(sub_assertion, sub_assertions);
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL == valid);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)after_adding_modules.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (after_adding_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)after_adding_modules.$kw115$BROAD_MT) && after_adding_modules.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(assertions_high.gaf_arg1(assertion), (SubLObject)after_adding_modules.NIL)) {
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = (SubLObject)after_adding_modules.$str116$do_broad_mt_index;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)after_adding_modules.ZERO_INTEGER;
                    assert after_adding_modules.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)after_adding_modules.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)after_adding_modules.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$9 = idx;
                            if (after_adding_modules.NIL == id_index.id_index_objects_empty_p(idx_$9, (SubLObject)after_adding_modules.$kw118$SKIP)) {
                                final SubLObject idx_$10 = idx_$9;
                                if (after_adding_modules.NIL == id_index.id_index_dense_objects_empty_p(idx_$10, (SubLObject)after_adding_modules.$kw118$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$10);
                                    final SubLObject backwardP_var = (SubLObject)after_adding_modules.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject sub_assertion2;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)after_adding_modules.NIL, v_iteration = (SubLObject)after_adding_modules.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)after_adding_modules.ONE_INTEGER)) {
                                        a_id = ((after_adding_modules.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)after_adding_modules.ONE_INTEGER) : v_iteration);
                                        a_handle = Vectors.aref(vector_var, a_id);
                                        if (after_adding_modules.NIL == id_index.id_index_tombstone_p(a_handle) || after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) {
                                            if (after_adding_modules.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                                a_handle = (SubLObject)after_adding_modules.$kw118$SKIP;
                                            }
                                            sub_assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (after_adding_modules.NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion2, assertions_high.gaf_arg1(assertion), (SubLObject)after_adding_modules.NIL, (SubLObject)after_adding_modules.NIL)) {
                                                sub_assertions = (SubLObject)ConsesLow.cons(sub_assertion2, sub_assertions);
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)after_adding_modules.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$11 = idx_$9;
                                if (after_adding_modules.NIL == id_index.id_index_sparse_objects_empty_p(idx_$11) || after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$11);
                                    SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$11);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$11);
                                    final SubLObject v_default = (SubLObject)((after_adding_modules.NIL != id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) ? after_adding_modules.NIL : after_adding_modules.$kw118$SKIP);
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                        if (after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP) || after_adding_modules.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                            final SubLObject sub_assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (after_adding_modules.NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion3, assertions_high.gaf_arg1(assertion), (SubLObject)after_adding_modules.NIL, (SubLObject)after_adding_modules.NIL)) {
                                                sub_assertions = (SubLObject)ConsesLow.cons(sub_assertion3, sub_assertions);
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)after_adding_modules.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        a_id2 = Numbers.add(a_id2, (SubLObject)after_adding_modules.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)after_adding_modules.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
                    }
                }
                assertion_utilities.remove_relevant_assertions_dependents(sub_assertions, assertions_high.assertion_mt(assertion));
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 31621L)
    public static SubLObject cyc_except_mt_removed(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL != after_adding.final_assertion_argumentP(argument, assertion) && after_adding_modules.NIL != assertion_utilities.true_assertionP(assertion)) {
            if (after_adding_modules.NIL != hl_transcript_tracing.within_hl_evalP()) {
                return (SubLObject)after_adding_modules.NIL;
            }
            final SubLObject num_mt_index = kb_indexing.num_mt_index(assertions_high.gaf_arg1(assertion));
            if (after_adding_modules.ZERO_INTEGER.numL(num_mt_index) && num_mt_index.numL(after_adding_modules.$cyc_except_mt_repropagate_mt_contents_cutoff$.getDynamicValue(thread))) {
                final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(assertions_high.gaf_arg1(assertion));
                if (pcase_var.eql((SubLObject)after_adding_modules.$kw114$MT)) {
                    if (after_adding_modules.NIL != kb_mapping_macros.do_mt_index_key_validator(assertions_high.gaf_arg1(assertion), (SubLObject)after_adding_modules.NIL)) {
                        final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(assertions_high.gaf_arg1(assertion));
                        SubLObject final_index_iterator = (SubLObject)after_adding_modules.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)after_adding_modules.NIL, (SubLObject)after_adding_modules.NIL, (SubLObject)after_adding_modules.NIL);
                            SubLObject done_var = (SubLObject)after_adding_modules.NIL;
                            final SubLObject token_var = (SubLObject)after_adding_modules.NIL;
                            while (after_adding_modules.NIL == done_var) {
                                final SubLObject sub_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(sub_assertion));
                                if (after_adding_modules.NIL != valid) {
                                    forward.queue_forward_assertion(sub_assertion);
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL == valid);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)after_adding_modules.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (after_adding_modules.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)after_adding_modules.$kw115$BROAD_MT) && after_adding_modules.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(assertions_high.gaf_arg1(assertion), (SubLObject)after_adding_modules.NIL)) {
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = (SubLObject)after_adding_modules.$str116$do_broad_mt_index;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)after_adding_modules.ZERO_INTEGER;
                    assert after_adding_modules.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)after_adding_modules.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)after_adding_modules.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$13 = idx;
                            if (after_adding_modules.NIL == id_index.id_index_objects_empty_p(idx_$13, (SubLObject)after_adding_modules.$kw118$SKIP)) {
                                final SubLObject idx_$14 = idx_$13;
                                if (after_adding_modules.NIL == id_index.id_index_dense_objects_empty_p(idx_$14, (SubLObject)after_adding_modules.$kw118$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$14);
                                    final SubLObject backwardP_var = (SubLObject)after_adding_modules.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject sub_assertion2;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)after_adding_modules.NIL, v_iteration = (SubLObject)after_adding_modules.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)after_adding_modules.ONE_INTEGER)) {
                                        a_id = ((after_adding_modules.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)after_adding_modules.ONE_INTEGER) : v_iteration);
                                        a_handle = Vectors.aref(vector_var, a_id);
                                        if (after_adding_modules.NIL == id_index.id_index_tombstone_p(a_handle) || after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) {
                                            if (after_adding_modules.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                                a_handle = (SubLObject)after_adding_modules.$kw118$SKIP;
                                            }
                                            sub_assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (after_adding_modules.NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion2, assertions_high.gaf_arg1(assertion), (SubLObject)after_adding_modules.NIL, (SubLObject)after_adding_modules.NIL)) {
                                                forward.queue_forward_assertion(sub_assertion2);
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)after_adding_modules.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$15 = idx_$13;
                                if (after_adding_modules.NIL == id_index.id_index_sparse_objects_empty_p(idx_$15) || after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$15);
                                    SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$15);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$15);
                                    final SubLObject v_default = (SubLObject)((after_adding_modules.NIL != id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) ? after_adding_modules.NIL : after_adding_modules.$kw118$SKIP);
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                        if (after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP) || after_adding_modules.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                            final SubLObject sub_assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (after_adding_modules.NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion3, assertions_high.gaf_arg1(assertion), (SubLObject)after_adding_modules.NIL, (SubLObject)after_adding_modules.NIL)) {
                                                forward.queue_forward_assertion(sub_assertion3);
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)after_adding_modules.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        a_id2 = Numbers.add(a_id2, (SubLObject)after_adding_modules.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)after_adding_modules.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
                    }
                }
            }
            else {
                Errors.warn((SubLObject)after_adding_modules.$str120$Skipping_propagating_mt_contents_, assertions_high.gaf_arg1(assertion));
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 32819L)
    public static SubLObject cyc_except_added(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL != after_adding.initial_assertion_argumentP(argument, assertion) && after_adding_modules.NIL != assertion_utilities.true_assertionP(assertion)) {
            if (after_adding_modules.NIL != hl_transcript_tracing.within_hl_evalP()) {
                return (SubLObject)after_adding_modules.NIL;
            }
            final SubLObject sub_assertion = assertions_high.gaf_arg1(assertion);
            if (after_adding_modules.NIL != except_of_hl_gaf_p(assertion)) {
                add_hl_gaf_denial(sub_assertion, assertion);
            }
            if (after_adding_modules.NIL == fi_edit.$within_fi_edit_add_old_exceptP$.getDynamicValue(thread)) {
                assertion_utilities.remove_relevant_assertion_dependents(sub_assertion, assertions_high.assertion_mt(assertion));
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 33849L)
    public static SubLObject cyc_except_removed(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != after_adding.final_assertion_argumentP(argument, assertion) && after_adding_modules.NIL != assertion_utilities.true_assertionP(assertion)) {
            if (after_adding_modules.NIL != hl_transcript_tracing.within_hl_evalP()) {
                return (SubLObject)after_adding_modules.NIL;
            }
            final SubLObject sub_assertion = assertions_high.gaf_arg1(assertion);
            if (after_adding_modules.NIL != except_of_hl_gaf_p(assertion)) {
                rem_hl_gaf_denial(sub_assertion, assertion);
            }
            forward.queue_forward_assertion(sub_assertion);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 34585L)
    public static SubLObject hl_gaf_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL != assertion_handles.assertion_p(v_object) && after_adding_modules.NIL != assertions_high.gaf_assertionP(v_object) && after_adding_modules.NIL != hl_supports.hl_predicate_p(assertions_high.gaf_predicate(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 34734L)
    public static SubLObject except_of_hl_gaf_p(final SubLObject v_object) {
        if (after_adding_modules.NIL != assertion_handles.assertion_p(v_object) && after_adding_modules.NIL != assertions_high.gaf_assertionP(v_object) && after_adding_modules.NIL != kb_utilities.kbeq(after_adding_modules.$const124$except, assertions_high.gaf_predicate(v_object))) {
            final SubLObject sub_assertion = assertions_high.gaf_arg1(v_object);
            return (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL != hl_gaf_p(sub_assertion) && after_adding_modules.NIL != hlmt.hlmt_equal(assertions_high.assertion_mt(v_object), assertions_high.assertion_mt(sub_assertion)));
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 35063L)
    public static SubLObject add_hl_gaf_denial(final SubLObject hl_gaf, final SubLObject except) {
        final SubLObject supports = (SubLObject)ConsesLow.list(except);
        final SubLObject truth = (SubLObject)after_adding_modules.$kw125$UNKNOWN;
        final SubLObject denial_deduction = tms.tms_add_deduction_for_assertion(hl_gaf, supports, truth, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
        return denial_deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 35304L)
    public static SubLObject rem_hl_gaf_denial(final SubLObject hl_gaf, final SubLObject except) {
        final SubLObject supports = (SubLObject)ConsesLow.list(except);
        final SubLObject truth = (SubLObject)after_adding_modules.$kw125$UNKNOWN;
        final SubLObject denial_deduction = deductions_high.find_deduction(hl_gaf, supports, truth);
        if (after_adding_modules.NIL != deduction_handles.deduction_p(denial_deduction)) {
            tms.tms_remove_deduction(denial_deduction);
            return hl_gaf;
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 35603L)
    public static SubLObject add_relation_instance_all(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != after_adding.initial_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_add_relation_instance_all_gaf(assertion);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 35965L)
    public static SubLObject remove_relation_instance_all(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != after_adding.final_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_remove_relation_instance_all_gaf(assertion);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 36186L)
    public static SubLObject add_relation_all_instance(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != after_adding.initial_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_add_relation_all_instance_gaf(assertion);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 36403L)
    public static SubLObject remove_relation_all_instance(final SubLObject argument, final SubLObject assertion) {
        if (after_adding_modules.NIL != after_adding.final_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_remove_relation_all_instance_gaf(assertion);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 36779L)
    public static SubLObject mark_constant_as_instantiated(final SubLObject constant, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL != after_adding_modules.$debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)after_adding_modules.T, (SubLObject)after_adding_modules.$str130$__do_create_from_description_mark, constant, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
        }
        SubLObject result = (SubLObject)after_adding_modules.NIL;
        if (after_adding_modules.NIL != constant_handles.constant_p(constant)) {
            final SubLObject sentence = el_utilities.make_binary_formula(after_adding_modules.$const131$quotedIsa, constant, after_adding_modules.$const132$InstantiatedConstant);
            if (after_adding_modules.NIL != control_vars.$use_transcriptP$.getDynamicValue(thread)) {
                result = fi.fi_assert_int(sentence, after_adding_modules.$const133$BookkeepingMt, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                transcript_utilities.transcript_form((SubLObject)ConsesLow.listS((SubLObject)after_adding_modules.$sym134$FI_ASSERT, (SubLObject)ConsesLow.list((SubLObject)after_adding_modules.$sym135$QUOTE, sentence), (SubLObject)after_adding_modules.$list136), (SubLObject)after_adding_modules.UNPROVIDED);
            }
            else {
                result = fi.fi_assert_int(sentence, after_adding_modules.$const133$BookkeepingMt, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
            }
            if (after_adding_modules.NIL != assertion) {
                fi.fi_add_argument_int(sentence, after_adding_modules.$const133$BookkeepingMt, (SubLObject)ConsesLow.list(assertion), assertions_high.assertion_direction(assertion), (SubLObject)after_adding_modules.UNPROVIDED);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 37483L)
    public static SubLObject cyc_create_new_instantiated_permanent(final SubLObject constant_name, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL != after_adding_modules.$debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)after_adding_modules.T, (SubLObject)after_adding_modules.$str137$__do_create_from_description_crea, constant_name, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
        }
        SubLObject constant = (SubLObject)after_adding_modules.NIL;
        SubLObject cyclist = (SubLObject)after_adding_modules.NIL;
        SubLObject time = (SubLObject)after_adding_modules.NIL;
        SubLObject why = (SubLObject)after_adding_modules.NIL;
        SubLObject second = (SubLObject)after_adding_modules.NIL;
        if (after_adding_modules.NIL != control_vars.$use_transcriptP$.getDynamicValue(thread)) {
            final SubLObject possible_fi_timestamp_assertion_op = operation_queues.local_queue_peek();
            if (after_adding_modules.$sym138$FI_TIMESTAMP_ASSERTION == possible_fi_timestamp_assertion_op.first()) {
                cyclist = list_utilities.quotify(encapsulation.unencapsulate(Eval.eval(ConsesLow.nth((SubLObject)after_adding_modules.ONE_INTEGER, possible_fi_timestamp_assertion_op))));
                time = ConsesLow.nth((SubLObject)after_adding_modules.TWO_INTEGER, possible_fi_timestamp_assertion_op);
                why = ConsesLow.nth((SubLObject)after_adding_modules.THREE_INTEGER, possible_fi_timestamp_assertion_op);
                second = ConsesLow.nth((SubLObject)after_adding_modules.FOUR_INTEGER, possible_fi_timestamp_assertion_op);
            }
            else {
                if (after_adding_modules.NIL == cyclist) {
                    cyclist = operation_communication.the_cyclist();
                }
                if (after_adding_modules.NIL == time) {
                    time = fi.the_date();
                }
                if (after_adding_modules.NIL == why) {
                    why = fi.ke_purpose();
                }
                if (after_adding_modules.NIL == second) {
                    second = fi.the_second();
                }
            }
        }
        if (after_adding_modules.NIL != control_vars.$use_transcriptP$.getDynamicValue(thread)) {
            constant = cyc_kernel.cyc_create_new_permanent(constant_name);
            fi.fi_timestamp_constant_int(cyclist, time, why, second);
            transcript_utilities.transcript_form((SubLObject)ConsesLow.list((SubLObject)after_adding_modules.$sym139$FI_TIMESTAMP_CONSTANT, cyclist, time, why, second), (SubLObject)after_adding_modules.UNPROVIDED);
        }
        else {
            constant = cyc_kernel.cyc_create_new_ephemeral(constant_name);
        }
        mark_constant_as_instantiated(constant, assertion);
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 39313L)
    public static SubLObject instantiated_constant_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL != constant_handles.constant_p(v_object) && after_adding_modules.NIL != isa.quoted_isa_in_any_mtP(v_object, after_adding_modules.$const132$InstantiatedConstant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 39461L)
    public static SubLObject possible_instantiated_constant_with_no_assertionsP(final SubLObject constant) {
        return (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL != constant_handles.constant_p(constant) && kb_indexing.num_index(constant).isZero());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 39615L)
    public static SubLObject instantiated_constant_with_one_assertionP(final SubLObject constant) {
        return (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL != constant_handles.constant_p(constant) && after_adding_modules.NIL != instantiated_constant_p(constant) && after_adding_modules.NIL != number_utilities.onep(kb_indexing.num_index(constant)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 39806L)
    public static SubLObject possible_instantiated_constant_to_reuseP(final SubLObject constant) {
        return (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL != possible_instantiated_constant_with_no_assertionsP(constant) || after_adding_modules.NIL != instantiated_constant_with_one_assertionP(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 40012L)
    public static SubLObject do_create_from_description(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL == after_adding.initial_assertion_argumentP(argument, assertion) || after_adding_modules.NIL == assertion_utilities.true_assertionP(assertion)) {
            return (SubLObject)after_adding_modules.NIL;
        }
        if (after_adding_modules.NIL != hl_transcript_tracing.within_hl_evalP()) {
            return (SubLObject)after_adding_modules.NIL;
        }
        if (after_adding_modules.NIL != after_adding_modules.$debug_do_create_from_descriptionP$.getDynamicValue(thread) && after_adding_modules.NIL != forward.current_forward_inference_rule()) {
            format_nil.force_format((SubLObject)after_adding_modules.T, (SubLObject)after_adding_modules.$str140$__do_create_from_description_afte, el_utilities.sefify(forward.current_forward_inference_rule()), (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
        }
        final SubLObject constant_name = string_utilities.make_valid_constant_name(assertions_high.gaf_arg1(assertion), (SubLObject)after_adding_modules.UNPROVIDED);
        final SubLObject pred = assertions_high.gaf_arg2(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject possible_constant = constants_high.find_constant(constant_name);
        final SubLObject existing_terms = ask_utilities.query_variable((SubLObject)after_adding_modules.$sym141$_TERM, el_utilities.make_binary_formula(after_adding_modules.$const142$and, el_utilities.make_ist_sentence(after_adding_modules.$const133$BookkeepingMt, el_utilities.make_binary_formula(after_adding_modules.$const131$quotedIsa, (SubLObject)after_adding_modules.$sym141$_TERM, after_adding_modules.$const132$InstantiatedConstant)), el_utilities.make_unary_formula(pred, (SubLObject)after_adding_modules.$sym141$_TERM)), mt, (SubLObject)after_adding_modules.UNPROVIDED);
        SubLObject v_term = (SubLObject)after_adding_modules.NIL;
        if (after_adding_modules.NIL != list_utilities.member_kbeqP(possible_constant, existing_terms)) {
            if (after_adding_modules.NIL != after_adding_modules.$debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)after_adding_modules.T, (SubLObject)after_adding_modules.$str143$__do_create_from_description_reus, possible_constant, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
            }
            v_term = possible_constant;
        }
        else if (after_adding_modules.NIL != existing_terms) {
            if (after_adding_modules.NIL != list_utilities.lengthG(existing_terms, (SubLObject)after_adding_modules.ONE_INTEGER, (SubLObject)after_adding_modules.UNPROVIDED)) {
                Errors.warn((SubLObject)after_adding_modules.$str144$do_create_from_description_found_, existing_terms, pred);
            }
            if (after_adding_modules.NIL != after_adding_modules.$debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)after_adding_modules.T, (SubLObject)after_adding_modules.$str145$__do_create_from_description_reus, existing_terms.first(), (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
            }
            v_term = existing_terms.first();
        }
        else if (after_adding_modules.NIL != possible_instantiated_constant_with_no_assertionsP(possible_constant)) {
            if (after_adding_modules.NIL != after_adding_modules.$debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)after_adding_modules.T, (SubLObject)after_adding_modules.$str146$__do_create_from_description_reus, possible_constant, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
            }
            mark_constant_as_instantiated(possible_constant, assertion);
            v_term = possible_constant;
        }
        else if (after_adding_modules.NIL != instantiated_constant_with_one_assertionP(possible_constant)) {
            if (after_adding_modules.NIL != after_adding_modules.$debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)after_adding_modules.T, (SubLObject)after_adding_modules.$str147$__do_create_from_description_reus, possible_constant, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
            }
            mark_constant_as_instantiated(possible_constant, assertion);
            v_term = possible_constant;
        }
        else if (after_adding_modules.NIL != constant_handles.valid_constantP(possible_constant, (SubLObject)after_adding_modules.UNPROVIDED)) {
            v_term = cyc_create_new_instantiated_permanent(constant_completion_high.uniquify_constant_name(constant_name, (SubLObject)after_adding_modules.UNPROVIDED), assertion);
        }
        else {
            v_term = cyc_create_new_instantiated_permanent(constant_name, assertion);
        }
        final SubLObject description_sentence = el_utilities.make_unary_formula(pred, v_term);
        SubLObject result = (SubLObject)after_adding_modules.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            kb_control_vars.$within_forward_inferenceP$.bind((SubLObject)after_adding_modules.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)after_adding_modules.T, thread);
            wff_vars.$wff_mode$.bind((SubLObject)after_adding_modules.$kw148$ASSERTIVE, thread);
            result = fi.fi_add_argument_int(description_sentence, mt, (SubLObject)ConsesLow.list(assertion), assertions_high.assertion_direction(assertion), (SubLObject)after_adding_modules.UNPROVIDED);
        }
        finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_3, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 43692L)
    public static SubLObject expression_instantiated_constant_count(final SubLObject expression) {
        return Sequences.length(cycl_utilities.expression_gather(expression, (SubLObject)after_adding_modules.$sym150$INSTANTIATED_CONSTANT_P, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 43837L)
    public static SubLObject expression_has_instantiated_constantP(final SubLObject expression) {
        return Numbers.plusp(expression_instantiated_constant_count(expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 43976L)
    public static SubLObject do_create_from_description_multiple(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL == after_adding.initial_assertion_argumentP(argument, assertion) || after_adding_modules.NIL == assertion_utilities.true_assertionP(assertion)) {
            return (SubLObject)after_adding_modules.NIL;
        }
        if (after_adding_modules.NIL != hl_transcript_tracing.within_hl_evalP()) {
            return (SubLObject)after_adding_modules.NIL;
        }
        final SubLObject pred = assertions_high.gaf_arg2(assertion);
        final SubLObject constant_names = el_utilities.el_list_items(assertions_high.gaf_arg1(assertion));
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject possible_constants = Mapping.mapcar((SubLObject)after_adding_modules.$sym151$FIND_CONSTANT, Mapping.mapcar((SubLObject)after_adding_modules.$sym152$MAKE_VALID_CONSTANT_NAME, constant_names));
        final SubLObject el_vars = (after_adding_modules.NIL != el_utilities.kappa_predicate_p(pred)) ? el_utilities.kappa_predicate_formal_args(pred) : el_utilities.sentence_free_variables(assertions_high.gaf_formula(assertion), (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
        final SubLObject existing_terms = ask_utilities.query_template(el_vars, make_do_create_from_description_query(el_vars, pred), mt, (SubLObject)after_adding_modules.UNPROVIDED);
        SubLObject terms = (SubLObject)after_adding_modules.NIL;
        if (after_adding_modules.NIL != subl_promotions.memberP(possible_constants, existing_terms, Symbols.symbol_function((SubLObject)after_adding_modules.EQUAL), (SubLObject)after_adding_modules.UNPROVIDED)) {
            terms = possible_constants;
        }
        else if (after_adding_modules.NIL != existing_terms) {
            if (after_adding_modules.NIL != list_utilities.lengthG(existing_terms, (SubLObject)after_adding_modules.ONE_INTEGER, (SubLObject)after_adding_modules.UNPROVIDED)) {
                Errors.warn((SubLObject)after_adding_modules.$str153$do_create_from_description_multip, existing_terms, pred);
            }
            terms = Sort.sort(existing_terms, (SubLObject)after_adding_modules.$sym154$_, (SubLObject)after_adding_modules.$sym155$EXPRESSION_INSTANTIATED_CONSTANT_COUNT).first();
        }
        else if (after_adding_modules.NIL != list_utilities.every_in_list((SubLObject)after_adding_modules.$sym156$POSSIBLE_INSTANTIATED_CONSTANT_TO_REUSE_, possible_constants, (SubLObject)after_adding_modules.UNPROVIDED)) {
            SubLObject cdolist_list_var = possible_constants;
            SubLObject constant = (SubLObject)after_adding_modules.NIL;
            constant = cdolist_list_var.first();
            while (after_adding_modules.NIL != cdolist_list_var) {
                mark_constant_as_instantiated(constant, assertion);
                cdolist_list_var = cdolist_list_var.rest();
                constant = cdolist_list_var.first();
            }
            terms = possible_constants;
        }
        else if (after_adding_modules.NIL != list_utilities.any_in_list((SubLObject)after_adding_modules.$sym157$VALID_CONSTANT_, possible_constants, (SubLObject)after_adding_modules.UNPROVIDED)) {
            SubLObject cdolist_list_var = constant_names;
            SubLObject constant_name = (SubLObject)after_adding_modules.NIL;
            constant_name = cdolist_list_var.first();
            while (after_adding_modules.NIL != cdolist_list_var) {
                terms = (SubLObject)ConsesLow.cons(cyc_create_new_instantiated_permanent(constant_completion_high.uniquify_constant_name(constant_name, (SubLObject)after_adding_modules.UNPROVIDED), assertion), terms);
                cdolist_list_var = cdolist_list_var.rest();
                constant_name = cdolist_list_var.first();
            }
            terms = Sequences.nreverse(terms);
        }
        else {
            SubLObject cdolist_list_var = constant_names;
            SubLObject constant_name = (SubLObject)after_adding_modules.NIL;
            constant_name = cdolist_list_var.first();
            while (after_adding_modules.NIL != cdolist_list_var) {
                terms = (SubLObject)ConsesLow.cons(cyc_create_new_instantiated_permanent(constant_name, assertion), terms);
                cdolist_list_var = cdolist_list_var.rest();
                constant_name = cdolist_list_var.first();
            }
            terms = Sequences.nreverse(terms);
        }
        final SubLObject description_sentence = (SubLObject)ConsesLow.cons(pred, terms);
        SubLObject result = (SubLObject)after_adding_modules.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            kb_control_vars.$within_forward_inferenceP$.bind((SubLObject)after_adding_modules.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)after_adding_modules.T, thread);
            wff_vars.$wff_mode$.bind((SubLObject)after_adding_modules.$kw148$ASSERTIVE, thread);
            result = fi.fi_add_argument_int(description_sentence, mt, (SubLObject)ConsesLow.list(assertion), assertions_high.assertion_direction(assertion), (SubLObject)after_adding_modules.UNPROVIDED);
        }
        finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_3, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 46891L)
    public static SubLObject make_do_create_from_description_query(final SubLObject el_vars, final SubLObject pred) {
        SubLObject conjuncts = (SubLObject)after_adding_modules.NIL;
        conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pred, el_vars), conjuncts);
        SubLObject cdolist_list_var = el_vars;
        SubLObject el_var = (SubLObject)after_adding_modules.NIL;
        el_var = cdolist_list_var.first();
        while (after_adding_modules.NIL != cdolist_list_var) {
            conjuncts = (SubLObject)ConsesLow.cons(el_utilities.make_ist_sentence(after_adding_modules.$const133$BookkeepingMt, el_utilities.make_binary_formula(after_adding_modules.$const131$quotedIsa, el_var, after_adding_modules.$const132$InstantiatedConstant)), conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            el_var = cdolist_list_var.first();
        }
        return el_utilities.make_conjunction(conjuncts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 47446L)
    public static SubLObject constant_instantiated_from_subcollection_expression_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL != constant_handles.constant_p(v_object) && after_adding_modules.NIL != string_utilities.starts_with(constants_high.constant_name(v_object), after_adding_modules.$instantiate_from_subcollection_expression_constant_prefix$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 47670L)
    public static SubLObject instantiate_from_subcollection_expression(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL != after_adding.initial_assertion_argumentP(argument, assertion) && after_adding_modules.NIL != assertion_utilities.true_assertionP(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject raw_subcollection_expression = assertions_high.gaf_arg1(assertion);
            SubLObject result = (SubLObject)after_adding_modules.NIL;
            thread.resetMultipleValues();
            SubLObject subcollection_expression = el_utilities.possibly_unquote_closed_formula(raw_subcollection_expression);
            final SubLObject subcollection_expression_quotedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            subcollection_expression = cycl_utilities.expression_transform(subcollection_expression, (SubLObject)after_adding_modules.$sym160$NART_P, (SubLObject)after_adding_modules.$sym161$NART_EL_FORMULA, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
            final SubLObject raw_unwound_sentence = subcollection_unwinder.scg_subcl_expand_signature_int(subcollection_expression);
            final SubLObject el_vars = el_utilities.sentence_free_variables(raw_unwound_sentence, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
            SubLObject existing_terms_list = ask_utilities.query_template(el_vars, raw_unwound_sentence, mt, (SubLObject)after_adding_modules.UNPROVIDED);
            SubLObject existing_terms = (SubLObject)after_adding_modules.NIL;
            if (after_adding_modules.NIL != list_utilities.singletonP(existing_terms_list)) {
                existing_terms = existing_terms_list.first();
            }
            else if (after_adding_modules.NIL != list_utilities.sublisp_boolean(existing_terms_list)) {
                final SubLObject existing_terms_list_hash = Hashtables.make_hash_table((SubLObject)after_adding_modules.ZERO_INTEGER, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                SubLObject cdolist_list_var = existing_terms_list;
                SubLObject existing_terms_entry = (SubLObject)after_adding_modules.NIL;
                existing_terms_entry = cdolist_list_var.first();
                while (after_adding_modules.NIL != cdolist_list_var) {
                    final SubLObject inst_constant_count = cycl_utilities.expression_gather(existing_terms_entry, (SubLObject)after_adding_modules.$sym162$CONSTANT_INSTANTIATED_FROM_SUBCOLLECTION_EXPRESSION_P, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                    hash_table_utilities.push_hash(Sequences.length(inst_constant_count), existing_terms_entry, existing_terms_list_hash);
                    cdolist_list_var = cdolist_list_var.rest();
                    existing_terms_entry = cdolist_list_var.first();
                }
                final SubLObject counts = hash_table_utilities.hash_table_keys(existing_terms_list_hash);
                final SubLObject max_count = (SubLObject)((after_adding_modules.NIL != counts) ? Functions.apply((SubLObject)after_adding_modules.$sym163$MAX, hash_table_utilities.hash_table_keys(existing_terms_list_hash)) : after_adding_modules.NIL);
                if (after_adding_modules.NIL != counts && after_adding_modules.ZERO_INTEGER.numL(max_count)) {
                    existing_terms_list = Hashtables.gethash(max_count, existing_terms_list_hash, (SubLObject)after_adding_modules.UNPROVIDED);
                    if (after_adding_modules.NIL != list_utilities.lengthG(existing_terms_list, (SubLObject)after_adding_modules.ONE_INTEGER, (SubLObject)after_adding_modules.UNPROVIDED)) {
                        Errors.warn((SubLObject)after_adding_modules.$str164$More_than_one_terms_match_found_f, assertion, existing_terms_list);
                    }
                    existing_terms = existing_terms_list.first();
                }
            }
            if (after_adding_modules.NIL == existing_terms) {
                final SubLObject variables_arg_constraints_dict = at_var_types.formula_variables_arg_constraints_dict(raw_unwound_sentence, mt, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                final SubLObject constant_name_hash = Hashtables.make_hash_table((SubLObject)after_adding_modules.ZERO_INTEGER, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(variables_arg_constraints_dict)); after_adding_modules.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject variable = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject isa_genl_qisa = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject v_isa = isa_genl_qisa.first();
                    final SubLObject genl = conses_high.second(isa_genl_qisa);
                    final SubLObject qisa = conses_high.third(isa_genl_qisa);
                    SubLObject cname_strings = (SubLObject)after_adding_modules.NIL;
                    if (after_adding_modules.NIL != genl) {
                        cname_strings = Mapping.mapcar((SubLObject)after_adding_modules.$sym165$FORT_NAME, genl);
                    }
                    else if (after_adding_modules.NIL != v_isa) {
                        cname_strings = Mapping.mapcar((SubLObject)after_adding_modules.$sym165$FORT_NAME, v_isa);
                    }
                    else if (after_adding_modules.NIL != qisa) {
                        cname_strings = Mapping.mapcar((SubLObject)after_adding_modules.$sym165$FORT_NAME, qisa);
                    }
                    else {
                        cname_strings = (SubLObject)after_adding_modules.$list166;
                    }
                    cname_strings = (SubLObject)ConsesLow.cons(after_adding_modules.$instantiate_from_subcollection_expression_constant_prefix$.getDynamicValue(thread), cname_strings);
                    Hashtables.sethash(variable, constant_name_hash, string_utilities.make_valid_constant_name(string_utilities.bunge(cname_strings, (SubLObject)Characters.CHAR_hyphen), (SubLObject)after_adding_modules.UNPROVIDED));
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                SubLObject cdolist_list_var2 = el_vars;
                SubLObject el_var = (SubLObject)after_adding_modules.NIL;
                el_var = cdolist_list_var2.first();
                while (after_adding_modules.NIL != cdolist_list_var2) {
                    existing_terms = (SubLObject)ConsesLow.cons(cyc_create_new_instantiated_permanent(constant_completion_high.uniquify_constant_name(Hashtables.gethash(el_var, constant_name_hash, (SubLObject)after_adding_modules.UNPROVIDED), (SubLObject)after_adding_modules.UNPROVIDED), assertion), existing_terms);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    el_var = cdolist_list_var2.first();
                }
                existing_terms = Sequences.nreverse(existing_terms);
            }
            SubLObject bound_unwound_sentence = conses_high.copy_list(raw_unwound_sentence);
            SubLObject el_var2 = (SubLObject)after_adding_modules.NIL;
            SubLObject el_var_$17 = (SubLObject)after_adding_modules.NIL;
            SubLObject existing_term = (SubLObject)after_adding_modules.NIL;
            SubLObject existing_term_$18 = (SubLObject)after_adding_modules.NIL;
            el_var2 = el_vars;
            el_var_$17 = el_var2.first();
            existing_term = existing_terms;
            existing_term_$18 = existing_term.first();
            while (after_adding_modules.NIL != existing_term || after_adding_modules.NIL != el_var2) {
                bound_unwound_sentence = cycl_utilities.expression_subst(existing_term_$18, el_var_$17, bound_unwound_sentence, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                el_var2 = el_var2.rest();
                el_var_$17 = el_var2.first();
                existing_term = existing_term.rest();
                existing_term_$18 = existing_term.first();
            }
            final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = wff_vars.$wff_mode$.currentBinding(thread);
            try {
                kb_control_vars.$within_forward_inferenceP$.bind((SubLObject)after_adding_modules.NIL, thread);
                czer_vars.$simplify_literalP$.bind((SubLObject)after_adding_modules.T, thread);
                wff_vars.$wff_mode$.bind((SubLObject)after_adding_modules.$kw148$ASSERTIVE, thread);
                result = fi.fi_add_argument_int(bound_unwound_sentence, mt, (SubLObject)ConsesLow.list(assertion), assertions_high.assertion_direction(assertion), (SubLObject)after_adding_modules.UNPROVIDED);
            }
            finally {
                wff_vars.$wff_mode$.rebind(_prev_bind_3, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 51301L)
    public static SubLObject show_constants_with_no_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = (SubLObject)after_adding_modules.$str168$Finding_constants_with_no_asserti;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)after_adding_modules.ZERO_INTEGER;
        assert after_adding_modules.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)after_adding_modules.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)after_adding_modules.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$19 = idx;
                if (after_adding_modules.NIL == id_index.id_index_objects_empty_p(idx_$19, (SubLObject)after_adding_modules.$kw118$SKIP)) {
                    final SubLObject idx_$20 = idx_$19;
                    if (after_adding_modules.NIL == id_index.id_index_dense_objects_empty_p(idx_$20, (SubLObject)after_adding_modules.$kw118$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$20);
                        final SubLObject backwardP_var = (SubLObject)after_adding_modules.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)after_adding_modules.NIL, v_iteration = (SubLObject)after_adding_modules.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)after_adding_modules.ONE_INTEGER)) {
                            id = ((after_adding_modules.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)after_adding_modules.ONE_INTEGER) : v_iteration);
                            c = Vectors.aref(vector_var, id);
                            if (after_adding_modules.NIL == id_index.id_index_tombstone_p(c) || after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) {
                                if (after_adding_modules.NIL != id_index.id_index_tombstone_p(c)) {
                                    c = (SubLObject)after_adding_modules.$kw118$SKIP;
                                }
                                if (kb_indexing.num_index(c).isZero()) {
                                    print_high.print(constants_high.constant_name(c), (SubLObject)after_adding_modules.UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)after_adding_modules.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$21 = idx_$19;
                    if (after_adding_modules.NIL == id_index.id_index_sparse_objects_empty_p(idx_$21) || after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$21);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$21);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$21);
                        final SubLObject v_default = (SubLObject)((after_adding_modules.NIL != id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) ? after_adding_modules.NIL : after_adding_modules.$kw118$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject c2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP) || after_adding_modules.NIL == id_index.id_index_tombstone_p(c2)) {
                                if (kb_indexing.num_index(c2).isZero()) {
                                    print_high.print(constants_high.constant_name(c2), (SubLObject)after_adding_modules.UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)after_adding_modules.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)after_adding_modules.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)after_adding_modules.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 51607L)
    public static SubLObject kill_constants_with_no_assertions_by_prefix(final SubLObject prefixes) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kill_count = (SubLObject)after_adding_modules.ZERO_INTEGER;
        SubLObject result = (SubLObject)after_adding_modules.NIL;
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = Sequences.cconcatenate((SubLObject)after_adding_modules.$str169$Killing_constants_with_no_asserti, format_nil.format_nil_s_no_copy(prefixes));
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)after_adding_modules.ZERO_INTEGER;
        assert after_adding_modules.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)after_adding_modules.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)after_adding_modules.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$23 = idx;
                if (after_adding_modules.NIL == id_index.id_index_objects_empty_p(idx_$23, (SubLObject)after_adding_modules.$kw118$SKIP)) {
                    final SubLObject idx_$24 = idx_$23;
                    if (after_adding_modules.NIL == id_index.id_index_dense_objects_empty_p(idx_$24, (SubLObject)after_adding_modules.$kw118$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$24);
                        final SubLObject backwardP_var = (SubLObject)after_adding_modules.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        SubLObject constant_name;
                        SubLObject killedP;
                        SubLObject csome_list_var;
                        SubLObject prefix;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)after_adding_modules.NIL, v_iteration = (SubLObject)after_adding_modules.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)after_adding_modules.ONE_INTEGER)) {
                            id = ((after_adding_modules.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)after_adding_modules.ONE_INTEGER) : v_iteration);
                            c = Vectors.aref(vector_var, id);
                            if (after_adding_modules.NIL == id_index.id_index_tombstone_p(c) || after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) {
                                if (after_adding_modules.NIL != id_index.id_index_tombstone_p(c)) {
                                    c = (SubLObject)after_adding_modules.$kw118$SKIP;
                                }
                                if (kb_indexing.num_index(c).isZero()) {
                                    constant_name = constants_high.constant_name(c);
                                    killedP = (SubLObject)after_adding_modules.NIL;
                                    if (after_adding_modules.NIL == killedP) {
                                        csome_list_var = prefixes;
                                        prefix = (SubLObject)after_adding_modules.NIL;
                                        prefix = csome_list_var.first();
                                        while (after_adding_modules.NIL == killedP && after_adding_modules.NIL != csome_list_var) {
                                            if (after_adding_modules.NIL != string_utilities.non_empty_stringP(prefix) && after_adding_modules.NIL != string_utilities.starts_with(constant_name, prefix)) {
                                                PrintLow.format((SubLObject)after_adding_modules.T, (SubLObject)after_adding_modules.$str170$__Killing__A__, c);
                                                fi.fi_kill_int(c);
                                                kill_count = Numbers.add(kill_count, (SubLObject)after_adding_modules.ONE_INTEGER);
                                                result = (SubLObject)ConsesLow.cons(constant_name, result);
                                                killedP = (SubLObject)after_adding_modules.T;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            prefix = csome_list_var.first();
                                        }
                                    }
                                }
                                sofar = Numbers.add(sofar, (SubLObject)after_adding_modules.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$25 = idx_$23;
                    if (after_adding_modules.NIL == id_index.id_index_sparse_objects_empty_p(idx_$25) || after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$25);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$25);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$25);
                        final SubLObject v_default = (SubLObject)((after_adding_modules.NIL != id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) ? after_adding_modules.NIL : after_adding_modules.$kw118$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject c2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP) || after_adding_modules.NIL == id_index.id_index_tombstone_p(c2)) {
                                if (kb_indexing.num_index(c2).isZero()) {
                                    final SubLObject constant_name2 = constants_high.constant_name(c2);
                                    SubLObject killedP2 = (SubLObject)after_adding_modules.NIL;
                                    if (after_adding_modules.NIL == killedP2) {
                                        SubLObject csome_list_var2 = prefixes;
                                        SubLObject prefix2 = (SubLObject)after_adding_modules.NIL;
                                        prefix2 = csome_list_var2.first();
                                        while (after_adding_modules.NIL == killedP2 && after_adding_modules.NIL != csome_list_var2) {
                                            if (after_adding_modules.NIL != string_utilities.non_empty_stringP(prefix2) && after_adding_modules.NIL != string_utilities.starts_with(constant_name2, prefix2)) {
                                                PrintLow.format((SubLObject)after_adding_modules.T, (SubLObject)after_adding_modules.$str170$__Killing__A__, c2);
                                                fi.fi_kill_int(c2);
                                                kill_count = Numbers.add(kill_count, (SubLObject)after_adding_modules.ONE_INTEGER);
                                                result = (SubLObject)ConsesLow.cons(constant_name2, result);
                                                killedP2 = (SubLObject)after_adding_modules.T;
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            prefix2 = csome_list_var2.first();
                                        }
                                    }
                                }
                                sofar = Numbers.add(sofar, (SubLObject)after_adding_modules.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)after_adding_modules.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)after_adding_modules.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        PrintLow.format((SubLObject)after_adding_modules.T, (SubLObject)after_adding_modules.$str171$___A_constants_killed__, kill_count);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 52255L)
    public static SubLObject show_unused_instantiated_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = (SubLObject)after_adding_modules.$str172$Finding_instantiated_constants_wi;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)after_adding_modules.ZERO_INTEGER;
        assert after_adding_modules.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)after_adding_modules.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)after_adding_modules.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$27 = idx;
                if (after_adding_modules.NIL == id_index.id_index_objects_empty_p(idx_$27, (SubLObject)after_adding_modules.$kw118$SKIP)) {
                    final SubLObject idx_$28 = idx_$27;
                    if (after_adding_modules.NIL == id_index.id_index_dense_objects_empty_p(idx_$28, (SubLObject)after_adding_modules.$kw118$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$28);
                        final SubLObject backwardP_var = (SubLObject)after_adding_modules.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)after_adding_modules.NIL, v_iteration = (SubLObject)after_adding_modules.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)after_adding_modules.ONE_INTEGER)) {
                            id = ((after_adding_modules.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)after_adding_modules.ONE_INTEGER) : v_iteration);
                            c = Vectors.aref(vector_var, id);
                            if (after_adding_modules.NIL == id_index.id_index_tombstone_p(c) || after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) {
                                if (after_adding_modules.NIL != id_index.id_index_tombstone_p(c)) {
                                    c = (SubLObject)after_adding_modules.$kw118$SKIP;
                                }
                                if (after_adding_modules.NIL != number_utilities.onep(kb_indexing.num_index(c)) && after_adding_modules.NIL != instantiated_constant_p(c)) {
                                    print_high.print(constants_high.constant_name(c), (SubLObject)after_adding_modules.UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)after_adding_modules.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$29 = idx_$27;
                    if (after_adding_modules.NIL == id_index.id_index_sparse_objects_empty_p(idx_$29) || after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$29);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$29);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$29);
                        final SubLObject v_default = (SubLObject)((after_adding_modules.NIL != id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP)) ? after_adding_modules.NIL : after_adding_modules.$kw118$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject c2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (after_adding_modules.NIL == id_index.id_index_skip_tombstones_p((SubLObject)after_adding_modules.$kw118$SKIP) || after_adding_modules.NIL == id_index.id_index_tombstone_p(c2)) {
                                if (after_adding_modules.NIL != number_utilities.onep(kb_indexing.num_index(c2)) && after_adding_modules.NIL != instantiated_constant_p(c2)) {
                                    print_high.print(constants_high.constant_name(c2), (SubLObject)after_adding_modules.UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)after_adding_modules.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)after_adding_modules.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)after_adding_modules.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 52504L)
    public static SubLObject forget_unused_instantiated_constants() {
        if (after_adding_modules.NIL != constant_handles.valid_constant(after_adding_modules.$const132$InstantiatedConstant, (SubLObject)after_adding_modules.T)) {
            return kill_unused_instantiated_constants();
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 52681L)
    public static SubLObject kill_unused_instantiated_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_instances = (SubLObject)after_adding_modules.NIL;
        SubLObject candidates = (SubLObject)after_adding_modules.NIL;
        SubLObject removed = (SubLObject)after_adding_modules.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)after_adding_modules.$sym173$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(after_adding_modules.$const174$EverythingPSC, thread);
            final SubLObject str = (SubLObject)after_adding_modules.$str175$Gathering_instantiated_constants;
            final SubLObject _prev_bind_0_$31 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_1_$32 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)after_adding_modules.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((after_adding_modules.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : after_adding_modules.T), thread);
                utilities_macros.noting_progress_preamble(str);
                v_instances = isa.all_quoted_instances(after_adding_modules.$const132$InstantiatedConstant, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$32, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$31, thread);
            }
            if (after_adding_modules.NIL != v_instances) {
                final SubLObject list_var = v_instances;
                final SubLObject _prev_bind_0_$32 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$33 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_13 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_14 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)after_adding_modules.$str176$Identifying_unused_instantiated_c, thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)after_adding_modules.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)after_adding_modules.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject v_term = (SubLObject)after_adding_modules.NIL;
                        v_term = csome_list_var.first();
                        while (after_adding_modules.NIL != csome_list_var) {
                            if (after_adding_modules.NIL != constant_handles.constant_p(v_term) && after_adding_modules.NIL != number_utilities.onep(kb_indexing.num_index(v_term))) {
                                candidates = (SubLObject)ConsesLow.cons(v_term, candidates);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)after_adding_modules.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            v_term = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)after_adding_modules.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                        }
                    }
                }
                finally {
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
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject candidate_count = Sequences.length(candidates);
        final SubLObject msg = Sequences.cconcatenate((SubLObject)after_adding_modules.$str178$Removing_, new SubLObject[] { format_nil.format_nil_a_no_copy(candidate_count), after_adding_modules.$str179$_unused_instantiated_constant, format_nil.format_nil_a_no_copy((SubLObject)((after_adding_modules.NIL != number_utilities.onep(candidate_count)) ? after_adding_modules.$str180$ : after_adding_modules.$str181$s)) });
        final SubLObject list_var2 = candidates;
        final SubLObject _prev_bind_15 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_16 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((after_adding_modules.NIL != msg) ? msg : after_adding_modules.$str177$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var2), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)after_adding_modules.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)after_adding_modules.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var2 = list_var2;
                SubLObject c = (SubLObject)after_adding_modules.NIL;
                c = csome_list_var2.first();
                while (after_adding_modules.NIL != csome_list_var2) {
                    final SubLObject constant_name = constants_high.constant_name(c);
                    PrintLow.format((SubLObject)after_adding_modules.T, (SubLObject)after_adding_modules.$str170$__Killing__A__, constant_name);
                    cyc_kernel.cyc_kill(c);
                    removed = (SubLObject)ConsesLow.cons(constant_name, removed);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)after_adding_modules.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var2 = csome_list_var2.rest();
                    c = csome_list_var2.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)after_adding_modules.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        }
        finally {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 53561L)
    public static SubLObject assert_missing_quoted_isa_instantiated_constant_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)after_adding_modules.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)after_adding_modules.$sym173$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(after_adding_modules.$const174$EverythingPSC, thread);
            SubLObject cdolist_list_var = (SubLObject)after_adding_modules.$list190;
            SubLObject do_create_predicate = (SubLObject)after_adding_modules.NIL;
            do_create_predicate = cdolist_list_var.first();
            while (after_adding_modules.NIL != cdolist_list_var) {
                final SubLObject pred_var = do_create_predicate;
                if (after_adding_modules.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)after_adding_modules.NIL;
                    final SubLObject _prev_bind_0_$37 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$38 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)after_adding_modules.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)after_adding_modules.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((after_adding_modules.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : after_adding_modules.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)after_adding_modules.NIL;
                        final SubLObject token_var = (SubLObject)after_adding_modules.NIL;
                        while (after_adding_modules.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (after_adding_modules.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)after_adding_modules.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)after_adding_modules.$kw66$GAF, (SubLObject)after_adding_modules.NIL, (SubLObject)after_adding_modules.NIL);
                                    SubLObject done_var_$39 = (SubLObject)after_adding_modules.NIL;
                                    final SubLObject token_var_$40 = (SubLObject)after_adding_modules.NIL;
                                    while (after_adding_modules.NIL == done_var_$39) {
                                        final SubLObject do_create_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                        final SubLObject valid_$41 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$40.eql(do_create_assertion));
                                        if (after_adding_modules.NIL != valid_$41 && after_adding_modules.NIL == list_utilities.member_kbeqP(assertions_high.assertion_mt(do_create_assertion), (SubLObject)after_adding_modules.$list182)) {
                                            final SubLObject do_create_dependents = Mapping.mapcar((SubLObject)after_adding_modules.$sym183$DEDUCTION_SUPPORTED_OBJECT, assertions_high.assertion_dependents(do_create_assertion));
                                            SubLObject instantiated_constant_gafs = (SubLObject)after_adding_modules.NIL;
                                            SubLObject cdolist_list_var_$42 = do_create_dependents;
                                            SubLObject do_create_dependent = (SubLObject)after_adding_modules.NIL;
                                            do_create_dependent = cdolist_list_var_$42.first();
                                            while (after_adding_modules.NIL != cdolist_list_var_$42) {
                                                if (after_adding_modules.NIL != assertion_utilities.gaf_assertion_with_pred_p(do_create_dependent, after_adding_modules.$const131$quotedIsa) && after_adding_modules.NIL != kb_utilities.kbeq(after_adding_modules.$const132$InstantiatedConstant, assertions_high.gaf_arg2(do_create_dependent))) {
                                                    instantiated_constant_gafs = (SubLObject)ConsesLow.cons(do_create_dependent, instantiated_constant_gafs);
                                                }
                                                cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                                                do_create_dependent = cdolist_list_var_$42.first();
                                            }
                                            if (after_adding_modules.NIL == instantiated_constant_gafs) {
                                                final SubLObject all_dependent_el_formulas = Mapping.mapcar((SubLObject)after_adding_modules.$sym184$ASSERTION_EL_FORMULA, do_create_dependents);
                                                final SubLObject possible_instantiated_constants = list_utilities.intersect_all(all_dependent_el_formulas, (SubLObject)after_adding_modules.UNPROVIDED, (SubLObject)after_adding_modules.UNPROVIDED);
                                                SubLObject add_quoted_isasP = (SubLObject)after_adding_modules.NIL;
                                                if (after_adding_modules.NIL != kb_utilities.kbeq(do_create_predicate, after_adding_modules.$const185$doCreateFromDescription) && after_adding_modules.NIL != list_utilities.singletonP(possible_instantiated_constants)) {
                                                    add_quoted_isasP = (SubLObject)after_adding_modules.T;
                                                }
                                                else if (after_adding_modules.NIL != kb_utilities.kbeq(do_create_predicate, after_adding_modules.$const186$doCreateFromDescription_Multiple) && after_adding_modules.NIL != list_utilities.lengthG(possible_instantiated_constants, (SubLObject)after_adding_modules.ONE_INTEGER, (SubLObject)after_adding_modules.UNPROVIDED)) {
                                                    add_quoted_isasP = (SubLObject)after_adding_modules.T;
                                                }
                                                else if (after_adding_modules.NIL != kb_utilities.kbeq(do_create_predicate, after_adding_modules.$const186$doCreateFromDescription_Multiple)) {
                                                    Errors.warn((SubLObject)after_adding_modules.$str187$could_not_determine_created_const, do_create_assertion);
                                                }
                                                if (after_adding_modules.NIL != add_quoted_isasP) {
                                                    SubLObject cdolist_list_var_$43 = possible_instantiated_constants;
                                                    SubLObject possible_instantiated_constant = (SubLObject)after_adding_modules.NIL;
                                                    possible_instantiated_constant = cdolist_list_var_$43.first();
                                                    while (after_adding_modules.NIL != cdolist_list_var_$43) {
                                                        count = Numbers.add(count, (SubLObject)after_adding_modules.ONE_INTEGER);
                                                        mark_constant_as_instantiated(possible_instantiated_constant, do_create_assertion);
                                                        cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                                        possible_instantiated_constant = cdolist_list_var_$43.first();
                                                    }
                                                }
                                            }
                                            else if (after_adding_modules.NIL != kb_utilities.kbeq(do_create_predicate, after_adding_modules.$const185$doCreateFromDescription) && after_adding_modules.NIL != list_utilities.lengthG(instantiated_constant_gafs, (SubLObject)after_adding_modules.ONE_INTEGER, (SubLObject)after_adding_modules.UNPROVIDED)) {
                                                Errors.warn((SubLObject)after_adding_modules.$str188$too_many_instantiated_constant_ga);
                                            }
                                            else if (after_adding_modules.NIL != kb_utilities.kbeq(do_create_predicate, after_adding_modules.$const186$doCreateFromDescription_Multiple) && after_adding_modules.NIL != list_utilities.singletonP(instantiated_constant_gafs)) {
                                                Errors.warn((SubLObject)after_adding_modules.$str189$not_enough_instantiated_constant_);
                                            }
                                        }
                                        done_var_$39 = (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL == valid_$41);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)after_adding_modules.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (after_adding_modules.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(after_adding_modules.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
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
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 55728L)
    public static SubLObject retain_mt_contents(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (after_adding_modules.NIL != after_adding.initial_assertion_argumentP(argument, assertion) && after_adding_modules.NIL != assertion_utilities.true_assertionP(assertion)) {
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = after_adding.$after_addings_disabledP$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)after_adding_modules.NIL, thread);
                after_adding.$after_addings_disabledP$.bind((SubLObject)after_adding_modules.T, thread);
                final SubLObject v_hlmt = assertions_high.gaf_arg1(assertion);
                final SubLObject _prev_bind_0_$45 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$46 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)after_adding_modules.$sym191$RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(v_hlmt, thread);
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(list_utilities.flatten(v_hlmt), (SubLObject)after_adding_modules.UNPROVIDED);
                    SubLObject mt_assertion = (SubLObject)after_adding_modules.NIL;
                    mt_assertion = cdolist_list_var.first();
                    while (after_adding_modules.NIL != cdolist_list_var) {
                        if (after_adding_modules.NIL != hlmt.hlmt_equalP(v_hlmt, hlmt.assertion_hlmt(mt_assertion))) {
                            cyc_kernel.cyc_add_argument(fi.assertion_hl_formula(mt_assertion, (SubLObject)after_adding_modules.UNPROVIDED), (SubLObject)ConsesLow.list(assertion), assertions_high.assertion_mt(mt_assertion), (SubLObject)after_adding_modules.$list192, (SubLObject)after_adding_modules.UNPROVIDED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mt_assertion = cdolist_list_var.first();
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$46, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$45, thread);
                }
            }
            finally {
                after_adding.$after_addings_disabledP$.rebind(_prev_bind_2, thread);
                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)after_adding_modules.NIL;
    }
    
    public static SubLObject declare_after_adding_modules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "decache_after_addings", "DECACHE-AFTER-ADDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "decache_after_removings", "DECACHE-AFTER-REMOVINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "decache_rule_after_addings", "DECACHE-RULE-AFTER-ADDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "decache_rule_after_removings", "DECACHE-RULE-AFTER-REMOVINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_mt_dependent_caches", "CLEAR-MT-DEPENDENT-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "possibly_clear_mt_dependent_caches", "POSSIBLY-CLEAR-MT-DEPENDENT-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_mt_dependent_caches_int", "CLEAR-MT-DEPENDENT-CACHES-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_genls_dependent_caches", "CLEAR-GENLS-DEPENDENT-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_isa_dependent_caches", "CLEAR-ISA-DEPENDENT-CACHES", 2, 0, false);
        new $clear_isa_dependent_caches$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_isa_dependent_caches_internal", "CLEAR-ISA-DEPENDENT-CACHES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_quoted_isa_dependent_caches", "CLEAR-QUOTED-ISA-DEPENDENT-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_quoted_isa_dependent_caches_internal", "CLEAR-QUOTED-ISA-DEPENDENT-CACHES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_genl_pred_dependent_caches", "CLEAR-GENL-PRED-DEPENDENT-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_transitive_via_arg", "ADD-TRANSITIVE-VIA-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_transitive_via_arg", "REMOVE-TRANSITIVE-VIA-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_transitive_via_arg_inverse", "ADD-TRANSITIVE-VIA-ARG-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_transitive_via_arg_inverse", "REMOVE-TRANSITIVE-VIA-ARG-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_cached_tva_checks", "CLEAR-CACHED-TVA-CHECKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_cached_some_tva_checks", "CLEAR-CACHED-SOME-TVA-CHECKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_cached_cva_checks", "CLEAR-CACHED-CVA-CHECKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_cached_some_cva_checks", "CLEAR-CACHED-SOME-CVA-CHECKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "skolem_after_removing", "SKOLEM-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_old_constant_name", "ADD-OLD-CONSTANT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_old_constant_name", "REMOVE-OLD-CONSTANT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_to_isa", "PROPAGATE-TO-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_to_genls", "PROPAGATE-TO-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_to_disjointwith", "PROPAGATE-TO-DISJOINTWITH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_to_genlmt", "PROPAGATE-TO-GENLMT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_to_genlpreds", "PROPAGATE-TO-GENLPREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_to_negationpreds", "PROPAGATE-TO-NEGATIONPREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_to_genlinverse", "PROPAGATE-TO-GENLINVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_to_negationinverse", "PROPAGATE-TO-NEGATIONINVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_inverse_to_isa", "PROPAGATE-INVERSE-TO-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_inverse_to_genls", "PROPAGATE-INVERSE-TO-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_inverse_to_genlmt", "PROPAGATE-INVERSE-TO-GENLMT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_inverse_to_genlpreds", "PROPAGATE-INVERSE-TO-GENLPREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_inverse_to_genlinverse", "PROPAGATE-INVERSE-TO-GENLINVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_sbhl_spec_pred_uses", "PROPAGATE-SBHL-SPEC-PRED-USES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_sbhl_spec_inverse_uses", "PROPAGATE-SBHL-SPEC-INVERSE-USES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_ist", "ADD-IST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_ist_el_support", "ADD-IST-EL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_true_rule", "ADD-TRUE-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "true_rule_el_support", "TRUE-RULE-EL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "true_rule_support_p", "TRUE-RULE-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "rule_template_direction", "RULE-TEMPLATE-DIRECTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_rule_template_direction", "ADD-RULE-TEMPLATE-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_rule_template_direction", "REMOVE-RULE-TEMPLATE-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "rule_template_instantiations", "RULE-TEMPLATE-INSTANTIATIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "rule_template_instantiation_deduction", "RULE-TEMPLATE-INSTANTIATION-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_dependent_term", "REMOVE-DEPENDENT-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_to_arity", "PROPAGATE-TO-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_arity", "ADD-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_arity", "REMOVE-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_to_arity_min", "PROPAGATE-TO-ARITY-MIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_arity_min", "ADD-ARITY-MIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_arity_min", "REMOVE-ARITY-MIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "propagate_to_arity_max", "PROPAGATE-TO-ARITY-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_arity_max", "ADD-ARITY-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_arity_max", "REMOVE-ARITY-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "inter_arg_isa_after_adding", "INTER-ARG-ISA-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "inter_arg_isa_after_removing", "INTER-ARG-ISA-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "inter_arg_format_after_adding", "INTER-ARG-FORMAT-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "inter_arg_format_after_removing", "INTER-ARG-FORMAT-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_to_contraction_ht", "ADD-TO-CONTRACTION-HT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_from_contraction_ht", "REMOVE-FROM-CONTRACTION-HT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_gen_template_expansion", "ADD-GEN-TEMPLATE-EXPANSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_gen_template_expansion", "REMOVE-GEN-TEMPLATE-EXPANSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_expansion_axiom", "ADD-EXPANSION-AXIOM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "cyc_add_reformulation_assertion", "CYC-ADD-REFORMULATION-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "cyc_remove_reformulation_assertion", "CYC-REMOVE-REFORMULATION-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "cyc_add_element_of", "CYC-ADD-ELEMENT-OF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "clear_unit_multiplication_factor_caches", "CLEAR-UNIT-MULTIPLICATION-FACTOR-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "cyc_add_known_antecedent_rule", "CYC-ADD-KNOWN-ANTECEDENT-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "cyc_remove_known_antecedent_rule", "CYC-REMOVE-KNOWN-ANTECEDENT-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_merged_constant_guid", "ADD-MERGED-CONSTANT-GUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_merged_constant_guid", "REMOVE-MERGED-CONSTANT-GUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "cyc_except_mt_added", "CYC-EXCEPT-MT-ADDED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "cyc_except_mt_removed", "CYC-EXCEPT-MT-REMOVED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "cyc_except_added", "CYC-EXCEPT-ADDED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "cyc_except_removed", "CYC-EXCEPT-REMOVED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "hl_gaf_p", "HL-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "except_of_hl_gaf_p", "EXCEPT-OF-HL-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_hl_gaf_denial", "ADD-HL-GAF-DENIAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "rem_hl_gaf_denial", "REM-HL-GAF-DENIAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_relation_instance_all", "ADD-RELATION-INSTANCE-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_relation_instance_all", "REMOVE-RELATION-INSTANCE-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "add_relation_all_instance", "ADD-RELATION-ALL-INSTANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "remove_relation_all_instance", "REMOVE-RELATION-ALL-INSTANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "mark_constant_as_instantiated", "MARK-CONSTANT-AS-INSTANTIATED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "cyc_create_new_instantiated_permanent", "CYC-CREATE-NEW-INSTANTIATED-PERMANENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "instantiated_constant_p", "INSTANTIATED-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "possible_instantiated_constant_with_no_assertionsP", "POSSIBLE-INSTANTIATED-CONSTANT-WITH-NO-ASSERTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "instantiated_constant_with_one_assertionP", "INSTANTIATED-CONSTANT-WITH-ONE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "possible_instantiated_constant_to_reuseP", "POSSIBLE-INSTANTIATED-CONSTANT-TO-REUSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "do_create_from_description", "DO-CREATE-FROM-DESCRIPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "expression_instantiated_constant_count", "EXPRESSION-INSTANTIATED-CONSTANT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "expression_has_instantiated_constantP", "EXPRESSION-HAS-INSTANTIATED-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "do_create_from_description_multiple", "DO-CREATE-FROM-DESCRIPTION-MULTIPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "make_do_create_from_description_query", "MAKE-DO-CREATE-FROM-DESCRIPTION-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "constant_instantiated_from_subcollection_expression_p", "CONSTANT-INSTANTIATED-FROM-SUBCOLLECTION-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "instantiate_from_subcollection_expression", "INSTANTIATE-FROM-SUBCOLLECTION-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "show_constants_with_no_assertions", "SHOW-CONSTANTS-WITH-NO-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "kill_constants_with_no_assertions_by_prefix", "KILL-CONSTANTS-WITH-NO-ASSERTIONS-BY-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "show_unused_instantiated_constants", "SHOW-UNUSED-INSTANTIATED-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "forget_unused_instantiated_constants", "FORGET-UNUSED-INSTANTIATED-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "kill_unused_instantiated_constants", "KILL-UNUSED-INSTANTIATED-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "assert_missing_quoted_isa_instantiated_constant_assertions", "ASSERT-MISSING-QUOTED-ISA-INSTANTIATED-CONSTANT-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.after_adding_modules", "retain_mt_contents", "RETAIN-MT-CONTENTS", 2, 0, false);
        return (SubLObject)after_adding_modules.NIL;
    }
    
    public static SubLObject init_after_adding_modules_file() {
        after_adding_modules.$cycl_functions_used_as_after_addings$ = SubLFiles.deflexical("*CYCL-FUNCTIONS-USED-AS-AFTER-ADDINGS*", (SubLObject)after_adding_modules.$list0);
        after_adding_modules.$inside_clear_genls_dependent_cachesP$ = SubLFiles.defparameter("*INSIDE-CLEAR-GENLS-DEPENDENT-CACHES?*", (SubLObject)after_adding_modules.NIL);
        after_adding_modules.$inside_clear_isa_dependent_cachesP$ = SubLFiles.defparameter("*INSIDE-CLEAR-ISA-DEPENDENT-CACHES?*", (SubLObject)after_adding_modules.NIL);
        after_adding_modules.$inside_clear_quoted_isa_dependent_cachesP$ = SubLFiles.defparameter("*INSIDE-CLEAR-QUOTED-ISA-DEPENDENT-CACHES?*", (SubLObject)after_adding_modules.NIL);
        after_adding_modules.$true_rule_template$ = SubLFiles.defparameter("*TRUE-RULE-TEMPLATE*", (SubLObject)after_adding_modules.$list54);
        after_adding_modules.$true_rule_defining_mt$ = SubLFiles.deflexical("*TRUE-RULE-DEFINING-MT*", (after_adding_modules.NIL != Symbols.boundp((SubLObject)after_adding_modules.$sym55$_TRUE_RULE_DEFINING_MT_)) ? after_adding_modules.$true_rule_defining_mt$.getGlobalValue() : after_adding_modules.$const56$CoreCycLMt);
        after_adding_modules.$cyc_except_mt_repropagate_mt_contents_cutoff$ = SubLFiles.defparameter("*CYC-EXCEPT-MT-REPROPAGATE-MT-CONTENTS-CUTOFF*", (SubLObject)after_adding_modules.$int113$256);
        after_adding_modules.$debug_do_create_from_descriptionP$ = SubLFiles.defparameter("*DEBUG-DO-CREATE-FROM-DESCRIPTION?*", (SubLObject)after_adding_modules.NIL);
        after_adding_modules.$instantiate_from_subcollection_expression_constant_prefix$ = SubLFiles.defparameter("*INSTANTIATE-FROM-SUBCOLLECTION-EXPRESSION-CONSTANT-PREFIX*", (SubLObject)after_adding_modules.$str159$INST);
        return (SubLObject)after_adding_modules.NIL;
    }
    
    public static SubLObject setup_after_adding_modules_file() {
        SubLObject cdolist_list_var = after_adding_modules.$cycl_functions_used_as_after_addings$.getGlobalValue();
        SubLObject symbol = (SubLObject)after_adding_modules.NIL;
        symbol = cdolist_list_var.first();
        while (after_adding_modules.NIL != cdolist_list_var) {
            utilities_macros.register_kb_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym2$DECACHE_AFTER_ADDINGS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym3$DECACHE_AFTER_REMOVINGS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym4$DECACHE_RULE_AFTER_ADDINGS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym5$DECACHE_RULE_AFTER_REMOVINGS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym6$CLEAR_MT_DEPENDENT_CACHES);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym7$CLEAR_GENLS_DEPENDENT_CACHES);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym8$CLEAR_ISA_DEPENDENT_CACHES);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym9$CLEAR_QUOTED_ISA_DEPENDENT_CACHES);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym10$CLEAR_GENL_PRED_DEPENDENT_CACHES);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym11$ADD_TRANSITIVE_VIA_ARG);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym12$REMOVE_TRANSITIVE_VIA_ARG);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym13$ADD_TRANSITIVE_VIA_ARG_INVERSE);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym14$REMOVE_TRANSITIVE_VIA_ARG_INVERSE);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym15$CLEAR_CACHED_TVA_CHECKS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym16$CLEAR_CACHED_SOME_TVA_CHECKS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym17$CLEAR_CACHED_CVA_CHECKS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym18$CLEAR_CACHED_SOME_CVA_CHECKS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym19$SKOLEM_AFTER_REMOVING);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym20$ADD_OLD_CONSTANT_NAME);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym21$REMOVE_OLD_CONSTANT_NAME);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym23$PROPAGATE_TO_ISA);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym25$PROPAGATE_TO_GENLS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym27$PROPAGATE_TO_DISJOINTWITH);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym29$PROPAGATE_TO_GENLMT);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym31$PROPAGATE_TO_GENLPREDS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym33$PROPAGATE_TO_NEGATIONPREDS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym35$PROPAGATE_TO_GENLINVERSE);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym37$PROPAGATE_TO_NEGATIONINVERSE);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym38$PROPAGATE_INVERSE_TO_ISA);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym39$PROPAGATE_INVERSE_TO_GENLS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym40$PROPAGATE_INVERSE_TO_GENLMT);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym41$PROPAGATE_INVERSE_TO_GENLPREDS);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym42$PROPAGATE_INVERSE_TO_GENLINVERSE);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym48$ADD_IST);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym53$ADD_TRUE_RULE);
        subl_macro_promotions.declare_defglobal((SubLObject)after_adding_modules.$sym55$_TRUE_RULE_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)after_adding_modules.$sym55$_TRUE_RULE_DEFINING_MT_, after_adding_modules.$const57$trueRule);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym64$ADD_RULE_TEMPLATE_DIRECTION);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym65$REMOVE_RULE_TEMPLATE_DIRECTION);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym70$REMOVE_DEPENDENT_TERM);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym72$PROPAGATE_TO_ARITY);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym73$ADD_ARITY);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym74$REMOVE_ARITY);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym76$PROPAGATE_TO_ARITY_MIN);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym77$ADD_ARITY_MIN);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym78$REMOVE_ARITY_MIN);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym80$PROPAGATE_TO_ARITY_MAX);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym81$ADD_ARITY_MAX);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym82$REMOVE_ARITY_MAX);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym83$INTER_ARG_ISA_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym84$INTER_ARG_ISA_AFTER_REMOVING);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym85$INTER_ARG_FORMAT_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym86$INTER_ARG_FORMAT_AFTER_REMOVING);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym87$ADD_TO_CONTRACTION_HT);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym88$REMOVE_FROM_CONTRACTION_HT);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym89$ADD_GEN_TEMPLATE_EXPANSION);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym90$REMOVE_GEN_TEMPLATE_EXPANSION);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym98$ADD_EXPANSION_AXIOM);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym99$CYC_ADD_REFORMULATION_ASSERTION);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym100$CYC_REMOVE_REFORMULATION_ASSERTION);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym105$CYC_ADD_ELEMENT_OF);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym106$CLEAR_UNIT_MULTIPLICATION_FACTOR_CACHES);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym109$CYC_ADD_KNOWN_ANTECEDENT_RULE);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym110$CYC_REMOVE_KNOWN_ANTECEDENT_RULE);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym111$ADD_MERGED_CONSTANT_GUID);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym112$REMOVE_MERGED_CONSTANT_GUID);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym119$CYC_EXCEPT_MT_ADDED);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym121$CYC_EXCEPT_MT_REMOVED);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym122$CYC_EXCEPT_ADDED);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym123$CYC_EXCEPT_REMOVED);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym126$ADD_RELATION_INSTANCE_ALL);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym127$REMOVE_RELATION_INSTANCE_ALL);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym128$ADD_RELATION_ALL_INSTANCE);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym129$REMOVE_RELATION_ALL_INSTANCE);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym149$DO_CREATE_FROM_DESCRIPTION);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym158$DO_CREATE_FROM_DESCRIPTION_MULTIPLE);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym167$INSTANTIATE_FROM_SUBCOLLECTION_EXPRESSION);
        utilities_macros.register_kb_function((SubLObject)after_adding_modules.$sym193$RETAIN_MT_CONTENTS);
        return (SubLObject)after_adding_modules.NIL;
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
        me = (SubLFile)new after_adding_modules();
        after_adding_modules.$cycl_functions_used_as_after_addings$ = null;
        after_adding_modules.$inside_clear_genls_dependent_cachesP$ = null;
        after_adding_modules.$inside_clear_isa_dependent_cachesP$ = null;
        after_adding_modules.$inside_clear_quoted_isa_dependent_cachesP$ = null;
        after_adding_modules.$true_rule_template$ = null;
        after_adding_modules.$true_rule_defining_mt$ = null;
        after_adding_modules.$cyc_except_mt_repropagate_mt_contents_cutoff$ = null;
        after_adding_modules.$debug_do_create_from_descriptionP$ = null;
        after_adding_modules.$instantiate_from_subcollection_expression_constant_prefix$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-PARAPHRASE-CACHES"));
        $sym1$ARGUMENT_P = SubLObjectFactory.makeSymbol("ARGUMENT-P");
        $sym2$DECACHE_AFTER_ADDINGS = SubLObjectFactory.makeSymbol("DECACHE-AFTER-ADDINGS");
        $sym3$DECACHE_AFTER_REMOVINGS = SubLObjectFactory.makeSymbol("DECACHE-AFTER-REMOVINGS");
        $sym4$DECACHE_RULE_AFTER_ADDINGS = SubLObjectFactory.makeSymbol("DECACHE-RULE-AFTER-ADDINGS");
        $sym5$DECACHE_RULE_AFTER_REMOVINGS = SubLObjectFactory.makeSymbol("DECACHE-RULE-AFTER-REMOVINGS");
        $sym6$CLEAR_MT_DEPENDENT_CACHES = SubLObjectFactory.makeSymbol("CLEAR-MT-DEPENDENT-CACHES");
        $sym7$CLEAR_GENLS_DEPENDENT_CACHES = SubLObjectFactory.makeSymbol("CLEAR-GENLS-DEPENDENT-CACHES");
        $sym8$CLEAR_ISA_DEPENDENT_CACHES = SubLObjectFactory.makeSymbol("CLEAR-ISA-DEPENDENT-CACHES");
        $sym9$CLEAR_QUOTED_ISA_DEPENDENT_CACHES = SubLObjectFactory.makeSymbol("CLEAR-QUOTED-ISA-DEPENDENT-CACHES");
        $sym10$CLEAR_GENL_PRED_DEPENDENT_CACHES = SubLObjectFactory.makeSymbol("CLEAR-GENL-PRED-DEPENDENT-CACHES");
        $sym11$ADD_TRANSITIVE_VIA_ARG = SubLObjectFactory.makeSymbol("ADD-TRANSITIVE-VIA-ARG");
        $sym12$REMOVE_TRANSITIVE_VIA_ARG = SubLObjectFactory.makeSymbol("REMOVE-TRANSITIVE-VIA-ARG");
        $sym13$ADD_TRANSITIVE_VIA_ARG_INVERSE = SubLObjectFactory.makeSymbol("ADD-TRANSITIVE-VIA-ARG-INVERSE");
        $sym14$REMOVE_TRANSITIVE_VIA_ARG_INVERSE = SubLObjectFactory.makeSymbol("REMOVE-TRANSITIVE-VIA-ARG-INVERSE");
        $sym15$CLEAR_CACHED_TVA_CHECKS = SubLObjectFactory.makeSymbol("CLEAR-CACHED-TVA-CHECKS");
        $sym16$CLEAR_CACHED_SOME_TVA_CHECKS = SubLObjectFactory.makeSymbol("CLEAR-CACHED-SOME-TVA-CHECKS");
        $sym17$CLEAR_CACHED_CVA_CHECKS = SubLObjectFactory.makeSymbol("CLEAR-CACHED-CVA-CHECKS");
        $sym18$CLEAR_CACHED_SOME_CVA_CHECKS = SubLObjectFactory.makeSymbol("CLEAR-CACHED-SOME-CVA-CHECKS");
        $sym19$SKOLEM_AFTER_REMOVING = SubLObjectFactory.makeSymbol("SKOLEM-AFTER-REMOVING");
        $sym20$ADD_OLD_CONSTANT_NAME = SubLObjectFactory.makeSymbol("ADD-OLD-CONSTANT-NAME");
        $sym21$REMOVE_OLD_CONSTANT_NAME = SubLObjectFactory.makeSymbol("REMOVE-OLD-CONSTANT-NAME");
        $const22$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym23$PROPAGATE_TO_ISA = SubLObjectFactory.makeSymbol("PROPAGATE-TO-ISA");
        $const24$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym25$PROPAGATE_TO_GENLS = SubLObjectFactory.makeSymbol("PROPAGATE-TO-GENLS");
        $const26$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $sym27$PROPAGATE_TO_DISJOINTWITH = SubLObjectFactory.makeSymbol("PROPAGATE-TO-DISJOINTWITH");
        $const28$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $sym29$PROPAGATE_TO_GENLMT = SubLObjectFactory.makeSymbol("PROPAGATE-TO-GENLMT");
        $const30$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $sym31$PROPAGATE_TO_GENLPREDS = SubLObjectFactory.makeSymbol("PROPAGATE-TO-GENLPREDS");
        $const32$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $sym33$PROPAGATE_TO_NEGATIONPREDS = SubLObjectFactory.makeSymbol("PROPAGATE-TO-NEGATIONPREDS");
        $const34$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $sym35$PROPAGATE_TO_GENLINVERSE = SubLObjectFactory.makeSymbol("PROPAGATE-TO-GENLINVERSE");
        $const36$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $sym37$PROPAGATE_TO_NEGATIONINVERSE = SubLObjectFactory.makeSymbol("PROPAGATE-TO-NEGATIONINVERSE");
        $sym38$PROPAGATE_INVERSE_TO_ISA = SubLObjectFactory.makeSymbol("PROPAGATE-INVERSE-TO-ISA");
        $sym39$PROPAGATE_INVERSE_TO_GENLS = SubLObjectFactory.makeSymbol("PROPAGATE-INVERSE-TO-GENLS");
        $sym40$PROPAGATE_INVERSE_TO_GENLMT = SubLObjectFactory.makeSymbol("PROPAGATE-INVERSE-TO-GENLMT");
        $sym41$PROPAGATE_INVERSE_TO_GENLPREDS = SubLObjectFactory.makeSymbol("PROPAGATE-INVERSE-TO-GENLPREDS");
        $sym42$PROPAGATE_INVERSE_TO_GENLINVERSE = SubLObjectFactory.makeSymbol("PROPAGATE-INVERSE-TO-GENLINVERSE");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $kw44$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $kw45$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IST"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"));
        $const47$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $sym48$ADD_IST = SubLObjectFactory.makeSymbol("ADD-IST");
        $const49$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FORMULA"));
        $kw51$CODE = SubLObjectFactory.makeKeyword("CODE");
        $sym52$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $sym53$ADD_TRUE_RULE = SubLObjectFactory.makeSymbol("ADD-TRUE-RULE");
        $list54 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueRule")), (SubLObject)SubLObjectFactory.makeSymbol("?TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA"));
        $sym55$_TRUE_RULE_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*TRUE-RULE-DEFINING-MT*");
        $const56$CoreCycLMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoreCycLMt"));
        $const57$trueRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueRule"));
        $sym58$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const59$ruleTemplateDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ruleTemplateDirection"));
        $const60$Forward_AssertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Forward-AssertionDirection"));
        $kw61$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $const62$Backward_AssertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Backward-AssertionDirection"));
        $kw63$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $sym64$ADD_RULE_TEMPLATE_DIRECTION = SubLObjectFactory.makeSymbol("ADD-RULE-TEMPLATE-DIRECTION");
        $sym65$REMOVE_RULE_TEMPLATE_DIRECTION = SubLObjectFactory.makeSymbol("REMOVE-RULE-TEMPLATE-DIRECTION");
        $kw66$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw67$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym68$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $sym69$TRUE_RULE_SUPPORT_P = SubLObjectFactory.makeSymbol("TRUE-RULE-SUPPORT-P");
        $sym70$REMOVE_DEPENDENT_TERM = SubLObjectFactory.makeSymbol("REMOVE-DEPENDENT-TERM");
        $const71$arity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity"));
        $sym72$PROPAGATE_TO_ARITY = SubLObjectFactory.makeSymbol("PROPAGATE-TO-ARITY");
        $sym73$ADD_ARITY = SubLObjectFactory.makeSymbol("ADD-ARITY");
        $sym74$REMOVE_ARITY = SubLObjectFactory.makeSymbol("REMOVE-ARITY");
        $const75$arityMin = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin"));
        $sym76$PROPAGATE_TO_ARITY_MIN = SubLObjectFactory.makeSymbol("PROPAGATE-TO-ARITY-MIN");
        $sym77$ADD_ARITY_MIN = SubLObjectFactory.makeSymbol("ADD-ARITY-MIN");
        $sym78$REMOVE_ARITY_MIN = SubLObjectFactory.makeSymbol("REMOVE-ARITY-MIN");
        $const79$arityMax = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMax"));
        $sym80$PROPAGATE_TO_ARITY_MAX = SubLObjectFactory.makeSymbol("PROPAGATE-TO-ARITY-MAX");
        $sym81$ADD_ARITY_MAX = SubLObjectFactory.makeSymbol("ADD-ARITY-MAX");
        $sym82$REMOVE_ARITY_MAX = SubLObjectFactory.makeSymbol("REMOVE-ARITY-MAX");
        $sym83$INTER_ARG_ISA_AFTER_ADDING = SubLObjectFactory.makeSymbol("INTER-ARG-ISA-AFTER-ADDING");
        $sym84$INTER_ARG_ISA_AFTER_REMOVING = SubLObjectFactory.makeSymbol("INTER-ARG-ISA-AFTER-REMOVING");
        $sym85$INTER_ARG_FORMAT_AFTER_ADDING = SubLObjectFactory.makeSymbol("INTER-ARG-FORMAT-AFTER-ADDING");
        $sym86$INTER_ARG_FORMAT_AFTER_REMOVING = SubLObjectFactory.makeSymbol("INTER-ARG-FORMAT-AFTER-REMOVING");
        $sym87$ADD_TO_CONTRACTION_HT = SubLObjectFactory.makeSymbol("ADD-TO-CONTRACTION-HT");
        $sym88$REMOVE_FROM_CONTRACTION_HT = SubLObjectFactory.makeSymbol("REMOVE-FROM-CONTRACTION-HT");
        $sym89$ADD_GEN_TEMPLATE_EXPANSION = SubLObjectFactory.makeSymbol("ADD-GEN-TEMPLATE-EXPANSION");
        $sym90$REMOVE_GEN_TEMPLATE_EXPANSION = SubLObjectFactory.makeSymbol("REMOVE-GEN-TEMPLATE-EXPANSION");
        $const91$expansion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion"));
        $list92 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("afterAdding")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansionAxiom")), (SubLObject)SubLObjectFactory.makeSymbol("ADD-EXPANSION-AXIOM"));
        $const93$expansionAxiom = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansionAxiom"));
        $sym94$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $kw95$CNF = SubLObjectFactory.makeKeyword("CNF");
        $sym96$NEG_LITS = SubLObjectFactory.makeSymbol("NEG-LITS");
        $const97$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $sym98$ADD_EXPANSION_AXIOM = SubLObjectFactory.makeSymbol("ADD-EXPANSION-AXIOM");
        $sym99$CYC_ADD_REFORMULATION_ASSERTION = SubLObjectFactory.makeSymbol("CYC-ADD-REFORMULATION-ASSERTION");
        $sym100$CYC_REMOVE_REFORMULATION_ASSERTION = SubLObjectFactory.makeSymbol("CYC-REMOVE-REFORMULATION-ASSERTION");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EO"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("SETEXPR"));
        $const102$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $const103$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TSO"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROP"));
        $sym105$CYC_ADD_ELEMENT_OF = SubLObjectFactory.makeSymbol("CYC-ADD-ELEMENT-OF");
        $sym106$CLEAR_UNIT_MULTIPLICATION_FACTOR_CACHES = SubLObjectFactory.makeSymbol("CLEAR-UNIT-MULTIPLICATION-FACTOR-CACHES");
        $sym107$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $sym108$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $sym109$CYC_ADD_KNOWN_ANTECEDENT_RULE = SubLObjectFactory.makeSymbol("CYC-ADD-KNOWN-ANTECEDENT-RULE");
        $sym110$CYC_REMOVE_KNOWN_ANTECEDENT_RULE = SubLObjectFactory.makeSymbol("CYC-REMOVE-KNOWN-ANTECEDENT-RULE");
        $sym111$ADD_MERGED_CONSTANT_GUID = SubLObjectFactory.makeSymbol("ADD-MERGED-CONSTANT-GUID");
        $sym112$REMOVE_MERGED_CONSTANT_GUID = SubLObjectFactory.makeSymbol("REMOVE-MERGED-CONSTANT-GUID");
        $int113$256 = SubLObjectFactory.makeInteger(256);
        $kw114$MT = SubLObjectFactory.makeKeyword("MT");
        $kw115$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $str116$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
        $sym117$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw118$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym119$CYC_EXCEPT_MT_ADDED = SubLObjectFactory.makeSymbol("CYC-EXCEPT-MT-ADDED");
        $str120$Skipping_propagating_mt_contents_ = SubLObjectFactory.makeString("Skipping propagating mt contents of ~S");
        $sym121$CYC_EXCEPT_MT_REMOVED = SubLObjectFactory.makeSymbol("CYC-EXCEPT-MT-REMOVED");
        $sym122$CYC_EXCEPT_ADDED = SubLObjectFactory.makeSymbol("CYC-EXCEPT-ADDED");
        $sym123$CYC_EXCEPT_REMOVED = SubLObjectFactory.makeSymbol("CYC-EXCEPT-REMOVED");
        $const124$except = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("except"));
        $kw125$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym126$ADD_RELATION_INSTANCE_ALL = SubLObjectFactory.makeSymbol("ADD-RELATION-INSTANCE-ALL");
        $sym127$REMOVE_RELATION_INSTANCE_ALL = SubLObjectFactory.makeSymbol("REMOVE-RELATION-INSTANCE-ALL");
        $sym128$ADD_RELATION_ALL_INSTANCE = SubLObjectFactory.makeSymbol("ADD-RELATION-ALL-INSTANCE");
        $sym129$REMOVE_RELATION_ALL_INSTANCE = SubLObjectFactory.makeSymbol("REMOVE-RELATION-ALL-INSTANCE");
        $str130$__do_create_from_description_mark = SubLObjectFactory.makeString("~&do-create-from-description marking as instantiated: ~S~%");
        $const131$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const132$InstantiatedConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstantiatedConstant"));
        $const133$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $sym134$FI_ASSERT = SubLObjectFactory.makeSymbol("FI-ASSERT");
        $sym135$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list136 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt")));
        $str137$__do_create_from_description_crea = SubLObjectFactory.makeString("~&do-create-from-description creating new instantiated constant: ~A~%");
        $sym138$FI_TIMESTAMP_ASSERTION = SubLObjectFactory.makeSymbol("FI-TIMESTAMP-ASSERTION");
        $sym139$FI_TIMESTAMP_CONSTANT = SubLObjectFactory.makeSymbol("FI-TIMESTAMP-CONSTANT");
        $str140$__do_create_from_description_afte = SubLObjectFactory.makeString("~&do-create-from-description after-adding called in forward inference using rule: ~S~%");
        $sym141$_TERM = SubLObjectFactory.makeSymbol("?TERM");
        $const142$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $str143$__do_create_from_description_reus = SubLObjectFactory.makeString("~&do-create-from-description reusing instantiated constant: ~S~%");
        $str144$do_create_from_description_found_ = SubLObjectFactory.makeString("do-create-from-description found multiple terms ~S matching description pred ~S~%");
        $str145$__do_create_from_description_reus = SubLObjectFactory.makeString("~&do-create-from-description reusing exiting term: ~S~%");
        $str146$__do_create_from_description_reus = SubLObjectFactory.makeString("~&do-create-from-description reusing bare constant: ~S~%");
        $str147$__do_create_from_description_reus = SubLObjectFactory.makeString("~&do-create-from-description reusing bare instantiated constant: ~S~%");
        $kw148$ASSERTIVE = SubLObjectFactory.makeKeyword("ASSERTIVE");
        $sym149$DO_CREATE_FROM_DESCRIPTION = SubLObjectFactory.makeSymbol("DO-CREATE-FROM-DESCRIPTION");
        $sym150$INSTANTIATED_CONSTANT_P = SubLObjectFactory.makeSymbol("INSTANTIATED-CONSTANT-P");
        $sym151$FIND_CONSTANT = SubLObjectFactory.makeSymbol("FIND-CONSTANT");
        $sym152$MAKE_VALID_CONSTANT_NAME = SubLObjectFactory.makeSymbol("MAKE-VALID-CONSTANT-NAME");
        $str153$do_create_from_description_multip = SubLObjectFactory.makeString("do-create-from-description-multiple found multiple terms~%~S~%matching description pred~%~S~%");
        $sym154$_ = SubLObjectFactory.makeSymbol(">");
        $sym155$EXPRESSION_INSTANTIATED_CONSTANT_COUNT = SubLObjectFactory.makeSymbol("EXPRESSION-INSTANTIATED-CONSTANT-COUNT");
        $sym156$POSSIBLE_INSTANTIATED_CONSTANT_TO_REUSE_ = SubLObjectFactory.makeSymbol("POSSIBLE-INSTANTIATED-CONSTANT-TO-REUSE?");
        $sym157$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $sym158$DO_CREATE_FROM_DESCRIPTION_MULTIPLE = SubLObjectFactory.makeSymbol("DO-CREATE-FROM-DESCRIPTION-MULTIPLE");
        $str159$INST = SubLObjectFactory.makeString("INST");
        $sym160$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym161$NART_EL_FORMULA = SubLObjectFactory.makeSymbol("NART-EL-FORMULA");
        $sym162$CONSTANT_INSTANTIATED_FROM_SUBCOLLECTION_EXPRESSION_P = SubLObjectFactory.makeSymbol("CONSTANT-INSTANTIATED-FROM-SUBCOLLECTION-EXPRESSION-P");
        $sym163$MAX = SubLObjectFactory.makeSymbol("MAX");
        $str164$More_than_one_terms_match_found_f = SubLObjectFactory.makeString("More than one terms match found for ~S.  Using first of: ~S");
        $sym165$FORT_NAME = SubLObjectFactory.makeSymbol("FORT-NAME");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("undeterminableName"));
        $sym167$INSTANTIATE_FROM_SUBCOLLECTION_EXPRESSION = SubLObjectFactory.makeSymbol("INSTANTIATE-FROM-SUBCOLLECTION-EXPRESSION");
        $str168$Finding_constants_with_no_asserti = SubLObjectFactory.makeString("Finding constants with no assertions");
        $str169$Killing_constants_with_no_asserti = SubLObjectFactory.makeString("Killing constants with no assertions and with prefix in ");
        $str170$__Killing__A__ = SubLObjectFactory.makeString("~&Killing ~A~%");
        $str171$___A_constants_killed__ = SubLObjectFactory.makeString("~&~A constants killed~%");
        $str172$Finding_instantiated_constants_wi = SubLObjectFactory.makeString("Finding instantiated constants with only one assertion");
        $sym173$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const174$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str175$Gathering_instantiated_constants = SubLObjectFactory.makeString("Gathering instantiated constants");
        $str176$Identifying_unused_instantiated_c = SubLObjectFactory.makeString("Identifying unused instantiated constants");
        $str177$cdolist = SubLObjectFactory.makeString("cdolist");
        $str178$Removing_ = SubLObjectFactory.makeString("Removing ");
        $str179$_unused_instantiated_constant = SubLObjectFactory.makeString(" unused instantiated constant");
        $str180$ = SubLObjectFactory.makeString("");
        $str181$s = SubLObjectFactory.makeString("s");
        $list182 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultiMediaAnalysisMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SPRLAnnotationGenerationMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DreamcatcherSKSIHelperMt")));
        $sym183$DEDUCTION_SUPPORTED_OBJECT = SubLObjectFactory.makeSymbol("DEDUCTION-SUPPORTED-OBJECT");
        $sym184$ASSERTION_EL_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-EL-FORMULA");
        $const185$doCreateFromDescription = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doCreateFromDescription"));
        $const186$doCreateFromDescription_Multiple = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doCreateFromDescription-Multiple"));
        $str187$could_not_determine_created_const = SubLObjectFactory.makeString("could not determine created constants for ~A");
        $str188$too_many_instantiated_constant_ga = SubLObjectFactory.makeString("too many instantiated constant gafs for ~A");
        $str189$not_enough_instantiated_constant_ = SubLObjectFactory.makeString("not enough instantiated constant gafs for ~A");
        $list190 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doCreateFromDescription")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doCreateFromDescription-Multiple")));
        $sym191$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $list192 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CHECK-WFF?"), (SubLObject)after_adding_modules.NIL);
        $sym193$RETAIN_MT_CONTENTS = SubLObjectFactory.makeSymbol("RETAIN-MT-CONTENTS");
    }
    
    public static final class $clear_isa_dependent_caches$BinaryFunction extends BinaryFunction
    {
        public $clear_isa_dependent_caches$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-ISA-DEPENDENT-CACHES"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return after_adding_modules.clear_isa_dependent_caches(arg1, arg2);
        }
    }
}

/*

	Total time: 1007 ms
	
*/