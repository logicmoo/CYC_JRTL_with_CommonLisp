package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_candidate_noun_compounds;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_arg_n;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_gaf_components;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_consistent;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_transitivity;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hl_supports extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.hl_supports";
    public static final String myFingerPrint = "bc5022db65d40446972c8add764f9fdc1bc7a5297fe276a5f74ac44cbb62a329";
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 898L)
    private static SubLSymbol $hl_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 1863L)
    private static SubLSymbol $hl_support_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 2183L)
    private static SubLSymbol $hl_support_module_plist_indicators$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 9634L)
    public static SubLSymbol $hl_forward_mt_combos_max_recursion_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 9769L)
    private static SubLSymbol $debug_null_hl_forward_mt_combosP$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 21130L)
    public static SubLSymbol $perform_opaque_support_verification$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 24170L)
    public static SubLSymbol $bookkeeping_justification_assertion_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 24399L)
    private static SubLSymbol $cached_find_assertion_cycl_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 75895L)
    private static SubLSymbol $hl_forward_mt_combos_isa_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 96882L)
    public static SubLSymbol $default_hl_verify_query_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 98186L)
    public static SubLSymbol $default_hl_justify_query_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 98318L)
    public static SubLSymbol $within_hl_justify_queryP$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$FORT_P;
    private static final SubLSymbol $sym2$_HL_SUPPORT_MODULES_;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$HL_SUPPORT_MODULE_P;
    private static final SubLList $list5;
    private static final SubLString $str6$Return_T_iff_OBJECT_is_an_HL_supp;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$KEYWORDP;
    private static final SubLString $str9$_S_was_not_a_valid_hl_support_mod;
    private static final SubLSymbol $kw10$VERIFY;
    private static final SubLSymbol $kw11$JUSTIFY;
    private static final SubLSymbol $kw12$VALIDATE;
    private static final SubLSymbol $kw13$FORWARD_MT_COMBOS;
    private static final SubLSymbol $sym14$LIST;
    private static final SubLSymbol $sym15$SUPPORT_P;
    private static final SubLSymbol $sym16$HL_JUSTIFICATION_P;
    private static final SubLSymbol $sym17$APPEND;
    private static final SubLSymbol $sym18$HL_SUPPORT_P;
    private static final SubLSymbol $sym19$FORT_BEING_REMOVED_;
    private static final SubLSymbol $kw20$HL_SUPPORT_JUSTIFY;
    private static final SubLSymbol $sym21$VALID_SUPPORT_;
    private static final SubLString $str22$Throwing_out_HL_justification__S_;
    private static final SubLSymbol $kw23$OPAQUE;
    private static final SubLSymbol $kw24$MENTIONS;
    private static final SubLObject $const25$assertionExists;
    private static final SubLObject $const26$BaseKB;
    private static final SubLString $str27$Adding__S_to_supports_list_from__;
    private static final SubLSymbol $sym28$ASSERTION_P;
    private static final SubLString $str29$null_mt_combos_from__hl_forward_m;
    private static final SubLString $str30$bad_mt_combos_from__hl_forward_mt;
    private static final SubLSymbol $sym31$SUPPORT_MT;
    private static final SubLObject $const32$InferencePSC;
    private static final SubLSymbol $kw33$CODE;
    private static final SubLSymbol $sym34$HL_SUPPORT_MT;
    private static final SubLSymbol $sym35$TRUE;
    private static final SubLSymbol $sym36$GAF_ASSERTION_;
    private static final SubLSymbol $sym37$ASSERTED_ASSERTION_;
    private static final SubLSymbol $sym38$TERM_OF_UNIT_ASSERTION_P;
    private static final SubLSymbol $sym39$_;
    private static final SubLSymbol $sym40$ASSERTION_DEPENDENT_COUNT;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $kw44$ABDUCTION;
    private static final SubLSymbol $kw45$FALSE;
    private static final SubLSymbol $kw46$TRUE;
    private static final SubLSymbol $kw47$UNKNOWN;
    private static final SubLObject $const48$myCreator;
    private static final SubLObject $const49$myCreationPurpose;
    private static final SubLObject $const50$myCreationTime;
    private static final SubLObject $const51$myCreationSecond;
    private static final SubLObject $const52$different;
    private static final SubLSymbol $kw53$EVAL;
    private static final SubLObject $const54$BookkeepingMt;
    private static final SubLObject $const55$unknownSentence;
    private static final SubLSymbol $sym56$_BOOKKEEPING_JUSTIFICATION_ASSERTION_MT_;
    private static final SubLSymbol $sym57$CACHED_FIND_ASSERTION_CYCL;
    private static final SubLSymbol $sym58$_CACHED_FIND_ASSERTION_CYCL_CACHING_STATE_;
    private static final SubLSymbol $kw59$BOOKKEEPING;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLObject $const62$quotedIsa;
    private static final SubLList $list63;
    private static final SubLSymbol $kw64$DEFN;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $kw67$ELEMENTOF;
    private static final SubLList $list68;
    private static final SubLObject $const69$TheSet;
    private static final SubLObject $const70$TheSetOf;
    private static final SubLSymbol $kw71$SUBSETOF;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLSymbol $kw74$ASSERTION;
    private static final SubLObject $const75$True_JustificationTruth;
    private static final SubLObject $const76$False_JustificationTruth;
    private static final SubLSymbol $kw77$SIBLING_DISJOINT;
    private static final SubLList $list78;
    private static final SubLObject $const79$equalSymbols;
    private static final SubLObject $const80$equals;
    private static final SubLSymbol $kw81$NONE;
    private static final SubLSymbol $kw82$MINIMAL;
    private static final SubLSymbol $kw83$ARG_TYPE;
    private static final SubLSymbol $kw84$ALL;
    private static final SubLString $str85$Unexpected_intermediate_step_vali;
    private static final SubLSymbol $kw86$EQUALITY;
    private static final SubLList $list87;
    private static final SubLObject $const88$evaluate;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLObject $const91$IrreflexiveBinaryPredicate;
    private static final SubLObject $const92$ReflexiveBinaryPredicate;
    private static final SubLObject $const93$isa;
    private static final SubLObject $const94$admittedArgument;
    private static final SubLSymbol $kw95$ISA;
    private static final SubLSymbol $kw96$ADMIT;
    private static final SubLSymbol $sym97$MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET;
    private static final SubLSymbol $kw98$REFLEXIVE;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const103$EverythingPSC;
    private static final SubLObject $const104$reflexiveOn;
    private static final SubLSymbol $kw105$GAF;
    private static final SubLList $list106;
    private static final SubLSymbol $sym107$TERM__;
    private static final SubLSymbol $kw108$REFLEXIVE_ON;
    private static final SubLList $list109;
    private static final SubLSymbol $kw110$TRANSITIVITY;
    private static final SubLList $list111;
    private static final SubLSymbol $kw112$CONTEXTUAL_TRANSITIVITY;
    private static final SubLList $list113;
    private static final SubLSymbol $kw114$TRUE_DEF;
    private static final SubLSymbol $sym115$RELEVANT_MT_IS_ANY_MT;
    private static final SubLList $list116;
    private static final SubLSymbol $kw117$TVA;
    private static final SubLList $list118;
    private static final SubLList $list119;
    private static final SubLSymbol $kw120$RTV;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLObject $const123$not;
    private static final SubLSymbol $kw124$MINIMIZE;
    private static final SubLList $list125;
    private static final SubLSymbol $kw126$CONSISTENT;
    private static final SubLList $list127;
    private static final SubLSymbol $kw128$CONCEPTUALLY_RELATED;
    private static final SubLList $list129;
    private static final SubLObject $const130$admittedSentence;
    private static final SubLObject $const131$admittedNAT;
    private static final SubLList $list132;
    private static final SubLList $list133;
    private static final SubLSymbol $kw134$STRICT;
    private static final SubLSymbol $kw135$SKSI;
    private static final SubLList $list136;
    private static final SubLSymbol $kw137$CSQL;
    private static final SubLList $list138;
    private static final SubLSymbol $kw139$SOURCE_SCHEMA_OBJECT_FN;
    private static final SubLList $list140;
    private static final SubLSymbol $kw141$REFORMULATE;
    private static final SubLList $list142;
    private static final SubLList $list143;
    private static final SubLList $list144;
    private static final SubLList $list145;
    private static final SubLObject $const146$gafPredicate;
    private static final SubLObject $const147$gafArgument;
    private static final SubLString $str148$Unexpected_predicate___S;
    private static final SubLSymbol $sym149$_EXIT;
    private static final SubLList $list150;
    private static final SubLList $list151;
    private static final SubLSymbol $kw152$EXTERNAL;
    private static final SubLSymbol $kw153$EXTERNAL_EVAL;
    private static final SubLList $list154;
    private static final SubLSymbol $sym155$PCOND;
    private static final SubLSymbol $sym156$EL_NEGATION_P;
    private static final SubLSymbol $sym157$CLET;
    private static final SubLSymbol $sym158$FORMULA_ARG1;
    private static final SubLList $list159;
    private static final SubLSymbol $sym160$INVERSE_TV;
    private static final SubLSymbol $sym161$EL_FORMULA_P;
    private static final SubLSymbol $kw162$REGULARIZE;
    private static final SubLList $list163;
    private static final SubLSymbol $kw164$TRUE_MON;
    private static final SubLObject $const165$nearestIsa;
    private static final SubLObject $const166$nearestIsaOfType;
    private static final SubLObject $const167$elementOf;
    private static final SubLSymbol $sym168$HL_FORWARD_MT_COMBOS_ISA;
    private static final SubLList $list169;
    private static final SubLSymbol $sym170$_HL_FORWARD_MT_COMBOS_ISA_CACHING_STATE_;
    private static final SubLInteger $int171$1024;
    private static final SubLSymbol $sym172$CLEAR_HL_FORWARD_MT_COMBOS_ISA;
    private static final SubLList $list173;
    private static final SubLList $list174;
    private static final SubLList $list175;
    private static final SubLList $list176;
    private static final SubLSymbol $kw177$INCOMPATIBLEMT;
    private static final SubLList $list178;
    private static final SubLObject $const179$nearestGenls;
    private static final SubLObject $const180$nearestGenlsOfType;
    private static final SubLSymbol $kw181$GENLS;
    private static final SubLList $list182;
    private static final SubLObject $const183$genls;
    private static final SubLObject $const184$instancesOfDisjointCollections;
    private static final SubLList $list185;
    private static final SubLSymbol $kw186$DISJOINTWITH;
    private static final SubLList $list187;
    private static final SubLSymbol $kw188$GENLMT;
    private static final SubLList $list189;
    private static final SubLList $list190;
    private static final SubLObject $const191$genlPreds;
    private static final SubLObject $const192$genlInverse;
    private static final SubLSymbol $kw193$GENLPREDS;
    private static final SubLList $list194;
    private static final SubLObject $const195$negationPreds;
    private static final SubLObject $const196$negationInverse;
    private static final SubLSymbol $kw197$NEGATIONPREDS;
    private static final SubLList $list198;
    private static final SubLObject $const199$temporallySubsumes_TypeType;
    private static final SubLObject $const200$temporallySubsumes_InsType;
    private static final SubLObject $const201$duration;
    private static final SubLString $str202$Continue_anyway_;
    private static final SubLString $str203$Unsupported_predicate___a__for__T;
    private static final SubLSymbol $kw204$TIME;
    private static final SubLList $list205;
    private static final SubLSymbol $kw206$CYCLIFY;
    private static final SubLList $list207;
    private static final SubLSymbol $kw208$NC_PARSE;
    private static final SubLList $list209;
    private static final SubLSymbol $kw210$CANDIDATE_NC_TESTS;
    private static final SubLList $list211;
    private static final SubLSymbol $kw212$ASSERTED_ARG1_BINARY_PREDS;
    private static final SubLList $list213;
    private static final SubLSymbol $kw214$FCP;
    private static final SubLList $list215;
    private static final SubLSymbol $kw216$SHOP_EFFECT;
    private static final SubLList $list217;
    private static final SubLList $list218;
    private static final SubLObject $const219$ist_Asserted;
    private static final SubLSymbol $kw220$CONDITIONAL_SENTENCE_;
    private static final SubLList $list221;
    private static final SubLSymbol $kw222$MAX_NUMBER;
    private static final SubLList $list223;
    private static final SubLSymbol $kw224$QUERY;
    private static final SubLList $list225;
    private static final SubLString $str226$Halo_feature_not_supported__Suppo;
    private static final SubLString $str227$Halo_feature_not_supported__Suppo;
    private static final SubLSymbol $kw228$MATRIX_OF_REACTION_TYPE;
    private static final SubLList $list229;
    private static final SubLSymbol $sym230$HL_VERIFY_PARSE_TREE_RELATION;
    private static final SubLSymbol $sym231$HL_JUSTIFY_PARSE_TREE_RELATION;
    private static final SubLSymbol $kw232$PARSE_TREE;
    private static final SubLList $list233;
    private static final SubLSymbol $kw234$WORD_STRINGS;
    private static final SubLList $list235;
    private static final SubLSymbol $kw236$TERM_PHRASES;
    private static final SubLList $list237;
    private static final SubLSymbol $kw238$RKF_IRRELEVANT_FORT_CACHE;
    private static final SubLList $list239;
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 1377L)
    public static SubLObject hl_predicate_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, hl_supports.$hl_predicates$.getGlobalValue(), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 1459L)
    public static SubLObject non_hl_predicate_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL != forts.fort_p(v_object) && hl_supports.NIL == hl_predicate_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 1572L)
    public static SubLObject declare_hl_predicate(final SubLObject predicate) {
        assert hl_supports.NIL != forts.fort_p(predicate) : predicate;
        if (hl_supports.NIL == conses_high.member(predicate, hl_supports.$hl_predicates$.getGlobalValue(), Symbols.symbol_function((SubLObject)hl_supports.EQL), Symbols.symbol_function((SubLObject)hl_supports.IDENTITY))) {
            hl_supports.$hl_predicates$.setGlobalValue((SubLObject)ConsesLow.cons(predicate, hl_supports.$hl_predicates$.getGlobalValue()));
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 1706L)
    public static SubLObject undeclare_hl_predicate(final SubLObject predicate) {
        assert hl_supports.NIL != forts.fort_p(predicate) : predicate;
        hl_supports.$hl_predicates$.setGlobalValue(Sequences.remove(predicate, hl_supports.$hl_predicates$.getGlobalValue(), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED));
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 2075L)
    public static SubLObject hl_support_modules() {
        return hl_supports.$hl_support_modules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 2297L)
    public static SubLObject hl_support_module_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, hl_supports.$hl_support_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 2465L)
    public static SubLObject setup_hl_support_module(final SubLObject name, SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_supports.NIL != Types.keywordp(name) : name;
        SubLObject cdolist_list_var = hl_supports.$hl_support_module_plist_indicators$.getDynamicValue(thread);
        SubLObject indicator = (SubLObject)hl_supports.NIL;
        indicator = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            Symbols.remprop(name, indicator);
            cdolist_list_var = cdolist_list_var.rest();
            indicator = cdolist_list_var.first();
        }
        SubLObject indicator2 = (SubLObject)hl_supports.NIL;
        SubLObject value = (SubLObject)hl_supports.NIL;
        indicator2 = plist.first();
        value = conses_high.second(plist);
        while (hl_supports.NIL != plist) {
            if (hl_supports.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && hl_supports.NIL == conses_high.member(indicator2, hl_supports.$hl_support_module_plist_indicators$.getDynamicValue(thread), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED)) {
                Errors.error((SubLObject)hl_supports.$str9$_S_was_not_a_valid_hl_support_mod, indicator2);
            }
            Symbols.put(name, indicator2, value);
            plist = conses_high.cddr(plist);
            indicator2 = plist.first();
            value = conses_high.second(plist);
        }
        if (hl_supports.NIL == conses_high.member(name, hl_supports.$hl_support_modules$.getGlobalValue(), Symbols.symbol_function((SubLObject)hl_supports.EQL), Symbols.symbol_function((SubLObject)hl_supports.IDENTITY))) {
            hl_supports.$hl_support_modules$.setGlobalValue((SubLObject)ConsesLow.cons(name, hl_supports.$hl_support_modules$.getGlobalValue()));
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 3042L)
    public static SubLObject hl_support_module_verify_func(final SubLObject hl_support_module) {
        return Symbols.get(hl_support_module, (SubLObject)hl_supports.$kw10$VERIFY, (SubLObject)hl_supports.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 3154L)
    public static SubLObject hl_support_module_justify_func(final SubLObject hl_support_module) {
        return Symbols.get(hl_support_module, (SubLObject)hl_supports.$kw11$JUSTIFY, (SubLObject)hl_supports.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 3268L)
    public static SubLObject hl_support_module_validate_func(final SubLObject hl_support_module) {
        return Symbols.get(hl_support_module, (SubLObject)hl_supports.$kw12$VALIDATE, (SubLObject)hl_supports.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 3384L)
    public static SubLObject hl_support_module_forward_mt_combos_func(final SubLObject hl_support_module) {
        return Symbols.get(hl_support_module, (SubLObject)hl_supports.$kw13$FORWARD_MT_COMBOS, (SubLObject)hl_supports.$sym14$LIST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 3520L)
    public static SubLObject hl_verify(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_supports.NIL != arguments.support_p(support) : support;
        if (hl_supports.NIL != arguments.ill_formed_hl_supportP(support)) {
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject hl_module = arguments.support_module(support);
        if (hl_supports.NIL == hl_support_module_p(hl_module)) {
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject verify_func = hl_support_module_verify_func(hl_module);
        if (hl_supports.NIL == verify_func) {
            return (SubLObject)hl_supports.T;
        }
        SubLObject result = (SubLObject)hl_supports.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = Functions.funcall(verify_func, support);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.sublisp_boolean(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 4309L)
    public static SubLObject hl_justify(final SubLObject support) {
        assert hl_supports.NIL != arguments.support_p(support) : support;
        return arguments.support_justification(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 4510L)
    public static SubLObject hl_justify_expanded(final SubLObject support) {
        assert hl_supports.NIL != arguments.support_p(support) : support;
        final SubLObject justification = hl_justify(support);
        if (hl_supports.NIL != list_utilities.singletonP(justification) && support.equal(justification.first())) {
            return conses_high.copy_list(justification);
        }
        return hl_justification_expand(justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 4959L)
    public static SubLObject hl_justification_expand(final SubLObject justification) {
        assert hl_supports.NIL != arguments.hl_justification_p(justification) : justification;
        SubLObject sub_justifications = (SubLObject)hl_supports.NIL;
        SubLObject cdolist_list_var = justification;
        SubLObject sub_support = (SubLObject)hl_supports.NIL;
        sub_support = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            sub_justifications = (SubLObject)ConsesLow.cons(hl_justify_expanded(sub_support), sub_justifications);
            cdolist_list_var = cdolist_list_var.rest();
            sub_support = cdolist_list_var.first();
        }
        sub_justifications = Sequences.nreverse(sub_justifications);
        SubLObject expanded_justification = Functions.apply(Symbols.symbol_function((SubLObject)hl_supports.$sym17$APPEND), sub_justifications);
        expanded_justification = Sequences.delete_duplicates(expanded_justification, Symbols.symbol_function((SubLObject)hl_supports.EQUAL), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
        return expanded_justification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 5579L)
    public static SubLObject hl_support_justify(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_supports.NIL != arguments.hl_support_p(hl_support) : hl_support;
        if (hl_supports.NIL != cycl_utilities.expression_find_if((SubLObject)hl_supports.$sym19$FORT_BEING_REMOVED_, arguments.support_sentence(hl_support), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED) || hl_supports.NIL != cycl_utilities.expression_find_if((SubLObject)hl_supports.$sym19$FORT_BEING_REMOVED_, arguments.support_mt(hl_support), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED)) {
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject module = arguments.hl_support_module(hl_support);
        SubLObject justification = (SubLObject)hl_supports.NIL;
        if (hl_supports.NIL != hl_support_module_p(module)) {
            final SubLObject justify_func = hl_support_module_justify_func(module);
            if (hl_supports.NIL != justify_func) {
                final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if (hl_supports.NIL != last_metric_type && hl_supports.NIL != last_metric) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)hl_supports.ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)hl_supports.$kw20$HL_SUPPORT_JUSTIFY, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind(justify_func, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)hl_supports.NIL, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)hl_supports.NIL, thread);
                    try {
                        final SubLObject mt = arguments.hl_support_mt(hl_support);
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            justification = Functions.funcall(justify_func, hl_support);
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_supports.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics((SubLObject)hl_supports.$kw20$HL_SUPPORT_JUSTIFY, justify_func, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.NIL);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                }
                finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
                }
            }
            if (hl_supports.NIL == arguments.non_empty_hl_justification_p(justification)) {
                justification = hl_trivial_justification(hl_support);
            }
        }
        if (hl_supports.NIL == list_utilities.every_in_list((SubLObject)hl_supports.$sym21$VALID_SUPPORT_, justification, (SubLObject)hl_supports.UNPROVIDED)) {
            Errors.warn((SubLObject)hl_supports.$str22$Throwing_out_HL_justification__S_, justification, hl_support);
            return (SubLObject)hl_supports.NIL;
        }
        if (arguments.hl_support_module(hl_support) != hl_supports.$kw23$OPAQUE) {
            SubLObject cdolist_list_var = support_embedded_assertions(hl_support);
            SubLObject embedded_assertion = (SubLObject)hl_supports.NIL;
            embedded_assertion = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                if (hl_supports.NIL == list_utilities.member_kbeqP(embedded_assertion, justification)) {
                    final SubLObject item_var = arguments.make_hl_support((SubLObject)hl_supports.$kw24$MENTIONS, el_utilities.make_unary_formula(hl_supports.$const25$assertionExists, embedded_assertion), hl_supports.$const26$BaseKB, (SubLObject)hl_supports.UNPROVIDED);
                    if (hl_supports.NIL == conses_high.member(item_var, justification, Symbols.symbol_function((SubLObject)hl_supports.EQUAL), Symbols.symbol_function((SubLObject)hl_supports.IDENTITY))) {
                        justification = (SubLObject)ConsesLow.cons(item_var, justification);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                embedded_assertion = cdolist_list_var.first();
            }
        }
        return justification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 7183L)
    public static SubLObject hl_trivial_justification(final SubLObject support) {
        return (SubLObject)ConsesLow.list(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 7278L)
    public static SubLObject categorize_justification(final SubLObject justification) {
        assert hl_supports.NIL != arguments.hl_justification_p(justification) : justification;
        SubLObject rules = (SubLObject)hl_supports.NIL;
        SubLObject gafs = (SubLObject)hl_supports.NIL;
        SubLObject v_hl_supports = (SubLObject)hl_supports.NIL;
        SubLObject cdolist_list_var = justification;
        SubLObject support = (SubLObject)hl_supports.NIL;
        support = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            if (hl_supports.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
                support = kb_hl_supports_high.kb_hl_support_hl_support(support);
            }
            if (hl_supports.NIL != arguments.hl_support_p(support)) {
                final SubLObject item_var = support;
                if (hl_supports.NIL == conses_high.member(item_var, v_hl_supports, Symbols.symbol_function((SubLObject)hl_supports.EQUAL), Symbols.symbol_function((SubLObject)hl_supports.IDENTITY))) {
                    v_hl_supports = (SubLObject)ConsesLow.cons(item_var, v_hl_supports);
                }
            }
            else if (hl_supports.NIL != assertions_high.rule_assertionP(support)) {
                final SubLObject item_var = support;
                if (hl_supports.NIL == conses_high.member(item_var, rules, Symbols.symbol_function((SubLObject)hl_supports.EQL), Symbols.symbol_function((SubLObject)hl_supports.IDENTITY))) {
                    rules = (SubLObject)ConsesLow.cons(item_var, rules);
                }
            }
            else {
                final SubLObject item_var = support;
                if (hl_supports.NIL == conses_high.member(item_var, gafs, Symbols.symbol_function((SubLObject)hl_supports.EQL), Symbols.symbol_function((SubLObject)hl_supports.IDENTITY))) {
                    gafs = (SubLObject)ConsesLow.cons(item_var, gafs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        rules = assertion_utilities.sort_assertions(rules);
        gafs = assertion_utilities.sort_assertions(gafs);
        v_hl_supports = kb_utilities.sort_terms(v_hl_supports, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.T, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
        return Values.values(rules, gafs, v_hl_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 7987L)
    public static SubLObject supports_with_embedded_assertions(final SubLObject supports) {
        return ConsesLow.append(supports, supports_embedded_assertions(supports));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 8118L)
    public static SubLObject supports_embedded_assertions(final SubLObject supports) {
        SubLObject result = (SubLObject)hl_supports.NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)hl_supports.NIL;
        support = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = support_embedded_assertions(support);
            SubLObject missed_assertion = (SubLObject)hl_supports.NIL;
            missed_assertion = cdolist_list_var_$5.first();
            while (hl_supports.NIL != cdolist_list_var_$5) {
                if (hl_supports.NIL == list_utilities.member_kbeqP(missed_assertion, supports)) {
                    Errors.warn((SubLObject)hl_supports.$str27$Adding__S_to_supports_list_from__, missed_assertion, support);
                    result = (SubLObject)ConsesLow.cons(missed_assertion, result);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                missed_assertion = cdolist_list_var_$5.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 8549L)
    public static SubLObject support_embedded_assertions(final SubLObject support) {
        if (hl_supports.NIL != arguments.hl_support_p(support)) {
            return cycl_utilities.expression_gather(support, (SubLObject)hl_supports.$sym28$ASSERTION_P, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 8691L)
    public static SubLObject hl_validate(final SubLObject support, final SubLObject validation_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_supports.NIL != arguments.support_p(support) : support;
        final SubLObject hl_module = arguments.support_module(support);
        if (hl_supports.NIL == hl_support_module_p(hl_module)) {
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject validate_func = hl_support_module_validate_func(hl_module);
        if (hl_supports.NIL == validate_func) {
            return (SubLObject)hl_supports.T;
        }
        SubLObject result = (SubLObject)hl_supports.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = Functions.funcall(validate_func, support, validation_level);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 9351L)
    public static SubLObject hl_validate_wff_violations(final SubLObject support, final SubLObject validation_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_supports.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
        try {
            wff_vars.$wff_violations$.bind((SubLObject)hl_supports.NIL, thread);
            final SubLObject _prev_bind_0_$6 = at_vars.$noting_at_violationsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
            try {
                at_vars.$noting_at_violationsP$.bind((SubLObject)hl_supports.T, thread);
                at_vars.$accumulating_at_violationsP$.bind((SubLObject)hl_supports.T, thread);
                wff_vars.$noting_wff_violationsP$.bind((SubLObject)hl_supports.T, thread);
                wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)hl_supports.T, thread);
                hl_validate(support, validation_level);
            }
            finally {
                wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
                wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
                at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
                at_vars.$noting_at_violationsP$.rebind(_prev_bind_0_$6, thread);
            }
            result = wff_vars.$wff_violations$.getDynamicValue(thread);
        }
        finally {
            wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 9832L)
    public static SubLObject hl_forward_mt_combos(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module = arguments.support_module(support);
        assert hl_supports.NIL != hl_support_module_p(hl_module) : hl_module;
        SubLObject forward_mt_combos_func = hl_support_module_forward_mt_combos_func(hl_module);
        final SubLObject mt = arguments.support_mt(support);
        if (forward_mt_combos_func == hl_supports.$sym14$LIST || forward_mt_combos_func.eql(Symbols.symbol_function((SubLObject)hl_supports.$sym14$LIST))) {
            forward_mt_combos_func = (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL == forward_mt_combos_func || hl_supports.NIL == mt_relevance_macros.any_or_all_mts_relevant_to_mtP(mt)) {
            return (SubLObject)ConsesLow.list(support);
        }
        if (hl_supports.NIL != mt_vars.core_microtheory_p(mt)) {
            return (SubLObject)ConsesLow.list(support);
        }
        SubLObject mt_combos = (SubLObject)hl_supports.NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (hl_supports.NIL != last_metric_type && hl_supports.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)hl_supports.ZERO_INTEGER);
        }
        SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)hl_supports.$kw13$FORWARD_MT_COMBOS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind(forward_mt_combos_func, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)hl_supports.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)hl_supports.NIL, thread);
            try {
                mt_combos = Functions.funcall(forward_mt_combos_func, support);
            }
            finally {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_supports.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)hl_supports.$kw13$FORWARD_MT_COMBOS, forward_mt_combos_func, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        if (hl_supports.NIL == mt_combos) {
            if (hl_supports.NIL != hl_supports.$debug_null_hl_forward_mt_combosP$.getDynamicValue(thread)) {
                final SubLObject mts_from_justification = hl_forward_mt_combos_from_justification(support);
                Errors.warn((SubLObject)hl_supports.$str29$null_mt_combos_from__hl_forward_m, el_utilities.sefify(support), mts_from_justification);
            }
            return (SubLObject)ConsesLow.list(support);
        }
        if (hl_supports.NIL == list_utilities.every_in_list((SubLObject)hl_supports.$sym15$SUPPORT_P, mt_combos, (SubLObject)hl_supports.UNPROVIDED)) {
            Errors.warn((SubLObject)hl_supports.$str30$bad_mt_combos_from__hl_forward_mt, el_utilities.sefify(support));
            mt_combos = (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL == subl_promotions.positive_integer_p(hl_supports.$hl_forward_mt_combos_max_recursion_depth$.getDynamicValue(thread))) {
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL != list_utilities.singletonP(mt_combos) && hl_supports.NIL != arguments.support_equal(mt_combos.first(), support)) {
            mt_combos = (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL == mt_combos) {
            _prev_bind_0 = hl_supports.$hl_forward_mt_combos_max_recursion_depth$.currentBinding(thread);
            try {
                hl_supports.$hl_forward_mt_combos_max_recursion_depth$.bind(Numbers.subtract(hl_supports.$hl_forward_mt_combos_max_recursion_depth$.getDynamicValue(thread), (SubLObject)hl_supports.ONE_INTEGER), thread);
                mt_combos = hl_forward_mt_combos_from_justification(support);
            }
            finally {
                hl_supports.$hl_forward_mt_combos_max_recursion_depth$.rebind(_prev_bind_0, thread);
            }
        }
        if (hl_supports.NIL != mt_combos) {
            return mt_combos;
        }
        return (SubLObject)ConsesLow.list(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 12241L)
    public static SubLObject hl_forward_mt_combos_from_justification(final SubLObject support) {
        final SubLObject hl_module = arguments.support_module(support);
        final SubLObject justify_func = hl_support_module_justify_func(hl_module);
        SubLObject mt_lists = (SubLObject)hl_supports.NIL;
        SubLObject mt_combos = (SubLObject)hl_supports.NIL;
        if (hl_supports.NIL == justify_func) {
            return (SubLObject)ConsesLow.list(support);
        }
        SubLObject cdolist_list_var = Functions.funcall(justify_func, support);
        SubLObject sub_support = (SubLObject)hl_supports.NIL;
        sub_support = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            final SubLObject combo_supports = hl_forward_mt_combos(sub_support);
            mt_lists = (SubLObject)ConsesLow.cons(Mapping.mapcar((SubLObject)hl_supports.$sym31$SUPPORT_MT, combo_supports), mt_lists);
            cdolist_list_var = cdolist_list_var.rest();
            sub_support = cdolist_list_var.first();
        }
        cdolist_list_var = list_utilities.cartesian_product(mt_lists, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
        SubLObject mt_cartesian_product = (SubLObject)hl_supports.NIL;
        mt_cartesian_product = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            mt_cartesian_product = Sequences.remove(hl_supports.$const32$InferencePSC, mt_cartesian_product, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
            SubLObject cdolist_list_var_$8 = genl_mts.max_floor_mts(mt_cartesian_product, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
            SubLObject mt = (SubLObject)hl_supports.NIL;
            mt = cdolist_list_var_$8.first();
            while (hl_supports.NIL != cdolist_list_var_$8) {
                final SubLObject result_support = conses_high.copy_list(support);
                ConsesLow.set_nth((SubLObject)hl_supports.TWO_INTEGER, result_support, mt);
                mt_combos = (SubLObject)ConsesLow.cons(result_support, mt_combos);
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                mt = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_cartesian_product = cdolist_list_var.first();
        }
        return mt_combos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 13151L)
    public static SubLObject find_assertion_or_make_support(final SubLObject sentence, SubLObject mt) {
    	PrologSync.bp();
        if (mt == hl_supports.UNPROVIDED) {
            mt = (SubLObject)hl_supports.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_supports.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject assertion = czer_meta.find_assertion_cycl(sentence, (SubLObject)hl_supports.UNPROVIDED);
            if (hl_supports.NIL != assertion) {
                result = assertion;
            }
            else {
                result = arguments.make_hl_support((SubLObject)hl_supports.$kw33$CODE, sentence, mt, (SubLObject)hl_supports.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 13691L)
    public static SubLObject max_floor_mts_of_justification(final SubLObject justification) {
        SubLObject mt_lists = (SubLObject)hl_supports.NIL;
        SubLObject max_floor_mts = (SubLObject)hl_supports.NIL;
        SubLObject cdolist_list_var = justification;
        SubLObject support = (SubLObject)hl_supports.NIL;
        support = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            if (hl_supports.NIL != assertion_handles.assertion_p(support)) {
                mt_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertions_high.assertion_mt(support)), mt_lists);
            }
            else {
                final SubLObject new_supports = hl_forward_mt_combos(support);
                mt_lists = (SubLObject)ConsesLow.cons(Mapping.mapcar((SubLObject)hl_supports.$sym34$HL_SUPPORT_MT, new_supports), mt_lists);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2;
        final SubLObject mt_cartesian_product = cdolist_list_var2 = list_utilities.cartesian_product(mt_lists, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
        SubLObject mts = (SubLObject)hl_supports.NIL;
        mts = cdolist_list_var2.first();
        while (hl_supports.NIL != cdolist_list_var2) {
            final SubLObject max_floors = inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mts, (SubLObject)hl_supports.UNPROVIDED);
            max_floor_mts = ConsesLow.append(max_floor_mts, max_floors);
            cdolist_list_var2 = cdolist_list_var2.rest();
            mts = cdolist_list_var2.first();
        }
        if (hl_supports.NIL != list_utilities.lengthG(mt_cartesian_product, (SubLObject)hl_supports.ONE_INTEGER, (SubLObject)hl_supports.UNPROVIDED)) {
            max_floor_mts = genl_mts.max_mts(list_utilities.fast_delete_duplicates(max_floor_mts, Symbols.symbol_function((SubLObject)hl_supports.EQUAL), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED), (SubLObject)hl_supports.UNPROVIDED);
        }
        return max_floor_mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 14423L)
    public static SubLObject hl_justification_complete_backward_theory(final SubLObject justification, SubLObject query_mt, SubLObject justify_deductionP, SubLObject justify_hl_supportP) {
        if (query_mt == hl_supports.UNPROVIDED) {
            query_mt = (SubLObject)hl_supports.NIL;
        }
        if (justify_deductionP == hl_supports.UNPROVIDED) {
            justify_deductionP = (SubLObject)hl_supports.$sym35$TRUE;
        }
        if (justify_hl_supportP == hl_supports.UNPROVIDED) {
            justify_hl_supportP = (SubLObject)hl_supports.$sym35$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_supports.NIL != arguments.hl_justification_p(justification) : justification;
        thread.resetMultipleValues();
        final SubLObject rules = categorize_justification(justification);
        final SubLObject gafs = thread.secondMultipleValue();
        final SubLObject v_hl_supports = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject processed_rules = set.new_set(Symbols.symbol_function((SubLObject)hl_supports.EQL), (SubLObject)hl_supports.ZERO_INTEGER);
        final SubLObject processed_gafs = set.new_set(Symbols.symbol_function((SubLObject)hl_supports.EQL), (SubLObject)hl_supports.ZERO_INTEGER);
        final SubLObject processed_hl_supports = set.new_set(Symbols.symbol_function((SubLObject)hl_supports.EQUAL), (SubLObject)hl_supports.ZERO_INTEGER);
        SubLObject next_rules;
        SubLObject next_gafs;
        SubLObject next_hl_supports;
        for (SubLObject new_rules = set_utilities.make_set_from_list(rules, Symbols.symbol_function((SubLObject)hl_supports.EQL)), new_gafs = set_utilities.make_set_from_list(gafs, Symbols.symbol_function((SubLObject)hl_supports.EQL)), new_hl_supports = set_utilities.make_set_from_list(v_hl_supports, Symbols.symbol_function((SubLObject)hl_supports.EQUAL)); hl_supports.NIL == set.set_emptyP(new_rules) || hl_supports.NIL == set.set_emptyP(new_gafs) || hl_supports.NIL == set.set_emptyP(new_hl_supports); new_rules = next_rules, new_gafs = next_gafs, new_hl_supports = next_hl_supports) {
            next_rules = set.new_set(Symbols.symbol_function((SubLObject)hl_supports.EQL), (SubLObject)hl_supports.ZERO_INTEGER);
            next_gafs = set.new_set(Symbols.symbol_function((SubLObject)hl_supports.EQL), (SubLObject)hl_supports.ZERO_INTEGER);
            next_hl_supports = set.new_set(Symbols.symbol_function((SubLObject)hl_supports.EQUAL), (SubLObject)hl_supports.ZERO_INTEGER);
            SubLObject set_contents_var = set.do_set_internal(new_rules);
            SubLObject basis_object;
            SubLObject state;
            SubLObject rule;
            SubLObject rule_mt;
            SubLObject query_mt_support;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)hl_supports.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); hl_supports.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                rule = set_contents.do_set_contents_next(basis_object, state);
                if (hl_supports.NIL != set_contents.do_set_contents_element_validP(state, rule) && hl_supports.NIL == set.set_memberP(rule, processed_rules)) {
                    set.set_add(rule, processed_rules);
                    rule_mt = assertions_high.assertion_mt(rule);
                    query_mt_support = removal_modules_genlmt.possibly_make_query_mt_support(query_mt, rule_mt);
                    if (hl_supports.NIL != query_mt_support) {
                        set.set_add(query_mt_support, next_hl_supports);
                    }
                }
            }
            set_contents_var = set.do_set_internal(new_gafs);
            SubLObject gaf;
            SubLObject truth;
            SubLObject cdolist_list_var;
            SubLObject deduction;
            SubLObject supports;
            SubLObject rules_$9;
            SubLObject gafs_$10;
            SubLObject v_hl_supports_$11;
            SubLObject cdolist_list_var_$12;
            SubLObject rule2;
            SubLObject cdolist_list_var_$13;
            SubLObject gaf_$14;
            SubLObject cdolist_list_var_$14;
            SubLObject hl_support;
            SubLObject gaf_mt;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)hl_supports.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); hl_supports.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                gaf = set_contents.do_set_contents_next(basis_object, state);
                if (hl_supports.NIL != set_contents.do_set_contents_element_validP(state, gaf) && hl_supports.NIL == set.set_memberP(gaf, processed_gafs)) {
                    set.set_add(gaf, processed_gafs);
                    if (hl_supports.NIL == assertions_high.asserted_assertionP(gaf)) {
                        truth = assertions_high.assertion_truth(gaf);
                        cdolist_list_var = assertions_high.assertion_arguments(gaf);
                        deduction = (SubLObject)hl_supports.NIL;
                        deduction = cdolist_list_var.first();
                        while (hl_supports.NIL != cdolist_list_var) {
                            if (hl_supports.NIL != deduction_handles.deduction_p(deduction) && truth.eql(deductions_high.deduction_truth(deduction)) && hl_supports.NIL != Functions.funcall(justify_deductionP, deduction)) {
                                supports = deductions_high.deduction_supports(deduction);
                                thread.resetMultipleValues();
                                rules_$9 = categorize_justification(supports);
                                gafs_$10 = thread.secondMultipleValue();
                                v_hl_supports_$11 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                cdolist_list_var_$12 = rules_$9;
                                rule2 = (SubLObject)hl_supports.NIL;
                                rule2 = cdolist_list_var_$12.first();
                                while (hl_supports.NIL != cdolist_list_var_$12) {
                                    set.set_add(rule2, next_rules);
                                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                    rule2 = cdolist_list_var_$12.first();
                                }
                                cdolist_list_var_$13 = gafs_$10;
                                gaf_$14 = (SubLObject)hl_supports.NIL;
                                gaf_$14 = cdolist_list_var_$13.first();
                                while (hl_supports.NIL != cdolist_list_var_$13) {
                                    set.set_add(gaf_$14, next_gafs);
                                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                    gaf_$14 = cdolist_list_var_$13.first();
                                }
                                cdolist_list_var_$14 = v_hl_supports_$11;
                                hl_support = (SubLObject)hl_supports.NIL;
                                hl_support = cdolist_list_var_$14.first();
                                while (hl_supports.NIL != cdolist_list_var_$14) {
                                    set.set_add(hl_support, next_hl_supports);
                                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                    hl_support = cdolist_list_var_$14.first();
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            deduction = cdolist_list_var.first();
                        }
                    }
                    gaf_mt = assertions_high.assertion_mt(gaf);
                    query_mt_support = removal_modules_genlmt.possibly_make_query_mt_support(query_mt, gaf_mt);
                    if (hl_supports.NIL != query_mt_support) {
                        set.set_add(query_mt_support, next_hl_supports);
                    }
                }
            }
            set_contents_var = set.do_set_internal(new_hl_supports);
            SubLObject hl_support2;
            SubLObject supports2;
            SubLObject rules_$10;
            SubLObject gafs_$11;
            SubLObject v_hl_supports_$12;
            SubLObject cdolist_list_var2;
            SubLObject rule3;
            SubLObject gaf2;
            SubLObject hl_support_$19;
            SubLObject support_mt;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)hl_supports.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); hl_supports.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                hl_support2 = set_contents.do_set_contents_next(basis_object, state);
                if (hl_supports.NIL != set_contents.do_set_contents_element_validP(state, hl_support2) && hl_supports.NIL == set.set_memberP(hl_support2, processed_hl_supports)) {
                    set.set_add(hl_support2, processed_hl_supports);
                    if (hl_supports.NIL != Functions.funcall(justify_hl_supportP, hl_support2)) {
                        supports2 = hl_justify_expanded(hl_support2);
                        thread.resetMultipleValues();
                        rules_$10 = categorize_justification(supports2);
                        gafs_$11 = thread.secondMultipleValue();
                        v_hl_supports_$12 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        cdolist_list_var2 = rules_$10;
                        rule3 = (SubLObject)hl_supports.NIL;
                        rule3 = cdolist_list_var2.first();
                        while (hl_supports.NIL != cdolist_list_var2) {
                            set.set_add(rule3, next_rules);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            rule3 = cdolist_list_var2.first();
                        }
                        cdolist_list_var2 = gafs_$11;
                        gaf2 = (SubLObject)hl_supports.NIL;
                        gaf2 = cdolist_list_var2.first();
                        while (hl_supports.NIL != cdolist_list_var2) {
                            set.set_add(gaf2, next_gafs);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            gaf2 = cdolist_list_var2.first();
                        }
                        cdolist_list_var2 = v_hl_supports_$12;
                        hl_support_$19 = (SubLObject)hl_supports.NIL;
                        hl_support_$19 = cdolist_list_var2.first();
                        while (hl_supports.NIL != cdolist_list_var2) {
                            set.set_add(hl_support_$19, next_hl_supports);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            hl_support_$19 = cdolist_list_var2.first();
                        }
                    }
                    support_mt = arguments.hl_support_mt(hl_support2);
                    query_mt_support = removal_modules_genlmt.possibly_make_query_mt_support(query_mt, support_mt);
                    if (hl_supports.NIL != query_mt_support) {
                        set.set_add(query_mt_support, next_hl_supports);
                    }
                }
            }
        }
        final SubLObject theory_rules = arguments.sort_supports(set.set_element_list(processed_rules));
        final SubLObject theory_gafs = arguments.sort_supports(set.set_element_list(processed_gafs));
        final SubLObject theory_hl_supports = arguments.sort_supports(set.set_element_list(processed_hl_supports));
        final SubLObject theory = ConsesLow.nconc(theory_rules, theory_gafs);
        return Values.values(theory, theory_hl_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 18905L)
    public static SubLObject assertion_all_supporting_asserted_gafs(final SubLObject assertion) {
        assert hl_supports.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject justification = (SubLObject)ConsesLow.list(assertion);
        final SubLObject complete_backward_theory = hl_justification_complete_backward_theory(justification, (SubLObject)hl_supports.NIL, Symbols.symbol_function((SubLObject)hl_supports.$sym35$TRUE), Symbols.symbol_function((SubLObject)hl_supports.$sym35$TRUE));
        final SubLObject supporting_gafs = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)hl_supports.$sym36$GAF_ASSERTION_), complete_backward_theory, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
        SubLObject supporting_asserted_gafs = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)hl_supports.$sym37$ASSERTED_ASSERTION_), supporting_gafs, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
        supporting_asserted_gafs = Sequences.remove_if(Symbols.symbol_function((SubLObject)hl_supports.$sym38$TERM_OF_UNIT_ASSERTION_P), supporting_asserted_gafs, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
        supporting_asserted_gafs = Sort.sort(supporting_asserted_gafs, Symbols.symbol_function((SubLObject)hl_supports.$sym39$_), Symbols.symbol_function((SubLObject)hl_supports.$sym40$ASSERTION_DEPENDENT_COUNT));
        supporting_asserted_gafs = assertion_utilities.sort_assertions_via_term_rarity(supporting_asserted_gafs);
        return supporting_asserted_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 21391L)
    public static SubLObject hl_verify_opaque(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hl_supports.NIL == hl_supports.$perform_opaque_support_verification$.getDynamicValue(thread)) {
            return (SubLObject)hl_supports.T;
        }
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject v_answer = (SubLObject)hl_supports.NIL;
            final SubLObject _prev_bind_0 = hl_supports.$perform_opaque_support_verification$.currentBinding(thread);
            try {
                hl_supports.$perform_opaque_support_verification$.bind((SubLObject)hl_supports.NIL, thread);
                v_answer = ask_utilities.inference_literal_ask(literal, mt);
            }
            finally {
                hl_supports.$perform_opaque_support_verification$.rebind(_prev_bind_0, thread);
            }
            return list_utilities.sublisp_boolean(v_answer);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 21886L)
    public static SubLObject opaque_hl_support_p(final SubLObject support) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL == assertion_handles.assertion_p(support) && hl_supports.$kw23$OPAQUE == arguments.support_module(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 22422L)
    public static SubLObject hl_verify_bookkeeping(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject asent_truth = bookkeeping_store.bookkeeping_asent_truth(el_utilities.literal_atomic_sentence(literal));
        final SubLObject target_truth = (SubLObject)((hl_supports.NIL != cycl_utilities.negatedP(literal)) ? hl_supports.$kw45$FALSE : hl_supports.$kw46$TRUE);
        if (asent_truth == hl_supports.$kw47$UNKNOWN) {
            return (SubLObject)hl_supports.T;
        }
        return Equality.eq(asent_truth, target_truth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 23027L)
    public static SubLObject hl_justify_bookkeeping(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
            final SubLObject asent = el_utilities.literal_atomic_sentence(literal);
            final SubLObject why_not_sentences = bookkeeping_store.why_not_bookkeeping_asent(asent);
            SubLObject why_not_supports = (SubLObject)hl_supports.NIL;
            SubLObject cdolist_list_var = why_not_sentences;
            SubLObject why_not_sentence = (SubLObject)hl_supports.NIL;
            why_not_sentence = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                final SubLObject ass = cached_find_assertion_cycl(why_not_sentence);
                if (hl_supports.NIL != ass) {
                    why_not_supports = (SubLObject)ConsesLow.cons(ass, why_not_supports);
                }
                else {
                    SubLObject why_not_support = (SubLObject)hl_supports.NIL;
                    final SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate(why_not_sentence);
                    if (pcase_var.eql(hl_supports.$const48$myCreator) || pcase_var.eql(hl_supports.$const49$myCreationPurpose) || pcase_var.eql(hl_supports.$const50$myCreationTime) || pcase_var.eql(hl_supports.$const51$myCreationSecond)) {
                        why_not_support = removal_modules_bookkeeping.make_bookkeeping_hl_support(why_not_sentence);
                    }
                    else if (pcase_var.eql(hl_supports.$const52$different)) {
                        why_not_support = arguments.make_hl_support((SubLObject)hl_supports.$kw53$EVAL, why_not_sentence, hl_supports.$const54$BookkeepingMt, (SubLObject)hl_supports.UNPROVIDED);
                    }
                    else if (pcase_var.eql(hl_supports.$const55$unknownSentence)) {
                        why_not_support = arguments.make_hl_support((SubLObject)hl_supports.$kw23$OPAQUE, why_not_sentence, hl_supports.$const54$BookkeepingMt, (SubLObject)hl_supports.UNPROVIDED);
                    }
                    else {
                        why_not_support = arguments.make_hl_support((SubLObject)hl_supports.$kw23$OPAQUE, why_not_sentence, hl_supports.$const54$BookkeepingMt, (SubLObject)hl_supports.UNPROVIDED);
                    }
                    why_not_supports = (SubLObject)ConsesLow.cons(why_not_support, why_not_supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                why_not_sentence = cdolist_list_var.first();
            }
            return Sequences.nreverse(why_not_supports);
        }
        return (SubLObject)ConsesLow.list(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 24399L)
    public static SubLObject clear_cached_find_assertion_cycl() {
        final SubLObject cs = hl_supports.$cached_find_assertion_cycl_caching_state$.getGlobalValue();
        if (hl_supports.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 24399L)
    public static SubLObject remove_cached_find_assertion_cycl(final SubLObject asent) {
        return memoization_state.caching_state_remove_function_results_with_args(hl_supports.$cached_find_assertion_cycl_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(asent), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 24399L)
    public static SubLObject cached_find_assertion_cycl_internal(final SubLObject asent) {
        return czer_meta.find_assertion_cycl(asent, hl_supports.$bookkeeping_justification_assertion_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 24399L)
    public static SubLObject cached_find_assertion_cycl(final SubLObject asent) {
        SubLObject caching_state = hl_supports.$cached_find_assertion_cycl_caching_state$.getGlobalValue();
        if (hl_supports.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)hl_supports.$sym57$CACHED_FIND_ASSERTION_CYCL, (SubLObject)hl_supports.$sym58$_CACHED_FIND_ASSERTION_CYCL_CACHING_STATE_, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.EQUAL, (SubLObject)hl_supports.ONE_INTEGER, (SubLObject)hl_supports.EIGHT_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, asent, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_find_assertion_cycl_internal(asent)));
            memoization_state.caching_state_put(caching_state, asent, results, (SubLObject)hl_supports.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 24557L)
    public static SubLObject hl_forward_mt_combos_bookkeeping(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return (SubLObject)ConsesLow.list(arguments.make_hl_support(hl_module, literal, hl_supports.$const54$BookkeepingMt, tv));
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 25129L)
    public static SubLObject hl_verify_defn(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$21;
                final SubLObject datum_$20 = current_$21 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject v_object = (SubLObject)hl_supports.NIL;
                SubLObject collection = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)hl_supports.$list61);
                v_object = current_$21.first();
                current_$21 = current_$21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)hl_supports.$list61);
                collection = current_$21.first();
                current_$21 = current_$21.rest();
                if (hl_supports.NIL == current_$21) {
                    if (hl_supports.$const62$quotedIsa.eql(el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED))) {
                        return at_defns.quoted_defns_admitP(collection, v_object, mt);
                    }
                    return at_defns.defns_admitP(collection, v_object, mt);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$20, (SubLObject)hl_supports.$list61);
                }
            }
            else {
                SubLObject current_$22;
                final SubLObject datum_$21 = current_$22 = el_utilities.literal_args(el_utilities.literal_atomic_sentence(literal), (SubLObject)hl_supports.UNPROVIDED);
                SubLObject v_object = (SubLObject)hl_supports.NIL;
                SubLObject collection = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)hl_supports.$list61);
                v_object = current_$22.first();
                current_$22 = current_$22.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)hl_supports.$list61);
                collection = current_$22.first();
                current_$22 = current_$22.rest();
                if (hl_supports.NIL == current_$22) {
                    if (hl_supports.$const62$quotedIsa.eql(el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED))) {
                        return at_defns.quoted_defns_admitP(collection, v_object, mt);
                    }
                    return at_defns.defns_rejectP(collection, v_object, mt);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$21, (SubLObject)hl_supports.$list61);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 25984L)
    public static SubLObject hl_justify_defn(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$25;
                final SubLObject datum_$24 = current_$25 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject v_object = (SubLObject)hl_supports.NIL;
                SubLObject collection = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$25, datum_$24, (SubLObject)hl_supports.$list61);
                v_object = current_$25.first();
                current_$25 = current_$25.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$25, datum_$24, (SubLObject)hl_supports.$list61);
                collection = current_$25.first();
                current_$25 = current_$25.rest();
                if (hl_supports.NIL == current_$25) {
                    if (hl_supports.$const62$quotedIsa.eql(el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED))) {
                        return defns.hl_justify_quoted_isa_via_defns(v_object, collection, mt);
                    }
                    return at_defns.hl_justify_isa_via_defns(v_object, collection, mt);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$24, (SubLObject)hl_supports.$list61);
                }
            }
            else {
                SubLObject current_$26;
                final SubLObject datum_$25 = current_$26 = el_utilities.literal_args(el_utilities.literal_atomic_sentence(literal), (SubLObject)hl_supports.UNPROVIDED);
                SubLObject v_object = (SubLObject)hl_supports.NIL;
                SubLObject collection = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$26, datum_$25, (SubLObject)hl_supports.$list61);
                v_object = current_$26.first();
                current_$26 = current_$26.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$26, datum_$25, (SubLObject)hl_supports.$list61);
                collection = current_$26.first();
                current_$26 = current_$26.rest();
                if (hl_supports.NIL == current_$26) {
                    if (hl_supports.$const62$quotedIsa.eql(el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED))) {
                        return at_defns.hl_justify_not_quoted_isa_via_defns(v_object, collection, mt);
                    }
                    return at_defns.hl_justify_not_isa_via_defns(v_object, collection, mt);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$25, (SubLObject)hl_supports.$list61);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 26678L)
    public static SubLObject hl_forward_mt_combos_defn(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
                mts = (SubLObject)ConsesLow.list(mt);
            }
            else if (hl_supports.NIL != list_utilities.member_kbeqP(el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED), (SubLObject)hl_supports.$list63)) {
                final SubLObject pred = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject v_term = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject col = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    mts = ((hl_supports.NIL != kb_utilities.kbeq(pred, hl_supports.$const62$quotedIsa)) ? at_defns.max_mts_of_admitting_quoted_defns(v_term, col) : at_defns.max_mts_of_admitting_defns(v_term, col));
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                mts = (SubLObject)ConsesLow.list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$28 = (SubLObject)hl_supports.NIL;
            mt_$28 = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$28, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$28 = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 27599L)
    public static SubLObject hl_verify_elementof(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$30;
                final SubLObject datum_$29 = current_$30 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject element = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$30, datum_$29, (SubLObject)hl_supports.$list66);
                element = current_$30.first();
                current_$30 = current_$30.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$30, datum_$29, (SubLObject)hl_supports.$list66);
                final SubLObject temp = current_$30.rest();
                current_$30 = current_$30.first();
                SubLObject theset = (SubLObject)hl_supports.NIL;
                SubLObject args = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$30, datum_$29, (SubLObject)hl_supports.$list66);
                theset = current_$30.first();
                current_$30 = (args = current_$30.rest());
                current_$30 = temp;
                if (hl_supports.NIL == current_$30) {
                    return subl_promotions.memberP(element, args, Symbols.symbol_function((SubLObject)hl_supports.EQUAL), (SubLObject)hl_supports.UNPROVIDED);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$29, (SubLObject)hl_supports.$list66);
            }
            else {
                SubLObject current_$31;
                final SubLObject datum_$30 = current_$31 = el_utilities.literal_args(el_utilities.literal_atomic_sentence(literal), (SubLObject)hl_supports.UNPROVIDED);
                SubLObject element = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$31, datum_$30, (SubLObject)hl_supports.$list66);
                element = current_$31.first();
                current_$31 = current_$31.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$31, datum_$30, (SubLObject)hl_supports.$list66);
                final SubLObject temp = current_$31.rest();
                current_$31 = current_$31.first();
                SubLObject theset = (SubLObject)hl_supports.NIL;
                SubLObject args = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$31, datum_$30, (SubLObject)hl_supports.$list66);
                theset = current_$31.first();
                current_$31 = (args = current_$31.rest());
                current_$31 = temp;
                if (hl_supports.NIL == current_$31) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL == subl_promotions.memberP(element, args, Symbols.symbol_function((SubLObject)hl_supports.EQUAL), (SubLObject)hl_supports.UNPROVIDED));
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$30, (SubLObject)hl_supports.$list66);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 28114L)
    public static SubLObject hl_forward_mt_combos_elementof(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return (SubLObject)ConsesLow.list(arguments.make_hl_support(hl_module, literal, mt_vars.$element_of_defining_mt$.getGlobalValue(), tv));
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 28544L)
    public static SubLObject hl_verify_subsetof(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject subset = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject superset = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
                if (subset.isCons() && hl_supports.$const69$TheSet.eql(cycl_utilities.nat_functor(subset))) {
                    if (superset.isCons() && hl_supports.$const69$TheSet.eql(cycl_utilities.nat_functor(superset))) {
                        return conses_high.subsetp(subset, superset, Symbols.symbol_function((SubLObject)hl_supports.EQUAL), (SubLObject)hl_supports.UNPROVIDED);
                    }
                    if (hl_supports.NIL != forts.fort_p(superset)) {
                        return hl_verify_opaque(support);
                    }
                    if (superset.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(superset))) {
                        return hl_verify_opaque(support);
                    }
                }
                else if (subset.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(subset))) {
                    if (hl_supports.NIL != forts.fort_p(superset)) {
                        return hl_verify_opaque(support);
                    }
                    if (superset.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(superset))) {
                        return hl_verify_opaque(support);
                    }
                }
            }
            else {
                final SubLObject formula = el_utilities.literal_atomic_sentence(literal);
                final SubLObject subset2 = el_utilities.literal_arg1(formula, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject superset2 = el_utilities.literal_arg2(formula, (SubLObject)hl_supports.UNPROVIDED);
                if (subset2.isCons() && hl_supports.$const69$TheSet.eql(cycl_utilities.nat_functor(subset2))) {
                    if (superset2.isCons() && hl_supports.$const69$TheSet.eql(cycl_utilities.nat_functor(superset2))) {
                        return (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL == conses_high.subsetp(subset2, superset2, Symbols.symbol_function((SubLObject)hl_supports.EQUAL), (SubLObject)hl_supports.UNPROVIDED));
                    }
                    if (hl_supports.NIL != forts.fort_p(superset2)) {
                        return hl_verify_opaque(support);
                    }
                    if (superset2.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(superset2))) {
                        return hl_verify_opaque(support);
                    }
                }
                else if (subset2.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(subset2))) {
                    if (hl_supports.NIL != forts.fort_p(superset2)) {
                        return hl_verify_opaque(support);
                    }
                    if (superset2.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(superset2))) {
                        return hl_verify_opaque(support);
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 30972L)
    public static SubLObject hl_forward_mt_combos_subsetof(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject subset = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject superset = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
                if (hl_supports.NIL != el_utilities.el_empty_set_p(subset)) {
                    mts = (SubLObject)ConsesLow.list(mt_vars.$subset_of_defining_mt$.getGlobalValue());
                }
                else if (subset.isCons() && hl_supports.$const69$TheSet.eql(cycl_utilities.nat_functor(subset))) {
                    if (superset.isCons() && hl_supports.$const69$TheSet.eql(cycl_utilities.nat_functor(superset))) {
                        mts = (SubLObject)ConsesLow.list(mt_vars.$subset_of_defining_mt$.getGlobalValue());
                    }
                    else if (hl_supports.NIL != forts.fort_p(superset)) {
                        mts = (SubLObject)ConsesLow.list(mt);
                    }
                    else if (superset.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(superset))) {
                        mts = (SubLObject)ConsesLow.list(mt);
                    }
                }
                else if (subset.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(subset))) {
                    if (hl_supports.NIL != forts.fort_p(superset)) {
                        mts = (SubLObject)ConsesLow.list(mt);
                    }
                    else if (superset.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(superset))) {
                        mts = (SubLObject)ConsesLow.list(mt);
                    }
                }
            }
            else {
                final SubLObject formula = el_utilities.literal_atomic_sentence(literal);
                final SubLObject subset2 = el_utilities.literal_arg1(formula, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject superset2 = el_utilities.literal_arg2(formula, (SubLObject)hl_supports.UNPROVIDED);
                if (hl_supports.NIL != el_utilities.el_empty_set_p(superset2)) {
                    mts = (SubLObject)ConsesLow.list(mt_vars.$subset_of_defining_mt$.getGlobalValue());
                }
                else if (subset2.isCons() && hl_supports.$const69$TheSet.eql(cycl_utilities.nat_functor(subset2))) {
                    if (superset2.isCons() && hl_supports.$const69$TheSet.eql(cycl_utilities.nat_functor(superset2))) {
                        mts = (SubLObject)ConsesLow.list(mt_vars.$subset_of_defining_mt$.getGlobalValue());
                    }
                    else if (hl_supports.NIL != forts.fort_p(superset2)) {
                        mts = (SubLObject)ConsesLow.list(mt);
                    }
                    else if (superset2.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(superset2))) {
                        mts = (SubLObject)ConsesLow.list(mt);
                    }
                }
                else if (subset2.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(subset2))) {
                    if (hl_supports.NIL != forts.fort_p(superset2)) {
                        mts = (SubLObject)ConsesLow.list(mt);
                    }
                    else if (superset2.isCons() && hl_supports.$const70$TheSetOf.eql(cycl_utilities.nat_functor(superset2))) {
                        mts = (SubLObject)ConsesLow.list(mt);
                    }
                }
            }
            if (hl_supports.NIL != mts) {
                SubLObject cdolist_list_var = mts;
                SubLObject mt_$33 = (SubLObject)hl_supports.NIL;
                mt_$33 = cdolist_list_var.first();
                while (hl_supports.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$33, tv), ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt_$33 = cdolist_list_var.first();
                }
            }
            else {
                ans = (SubLObject)ConsesLow.list(support);
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 33717L)
    public static SubLObject hl_verify_sibling_disjoint(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$35;
                final SubLObject datum_$34 = current_$35 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject col1 = (SubLObject)hl_supports.NIL;
                SubLObject col2 = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$35, datum_$34, (SubLObject)hl_supports.$list73);
                col1 = current_$35.first();
                current_$35 = current_$35.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$35, datum_$34, (SubLObject)hl_supports.$list73);
                col2 = current_$35.first();
                current_$35 = current_$35.rest();
                if (hl_supports.NIL == current_$35) {
                    return sdc.sdcP(col1, col2, mt);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$34, (SubLObject)hl_supports.$list73);
            }
            else {
                SubLObject current_$36;
                final SubLObject datum_$35 = current_$36 = el_utilities.literal_args(el_utilities.literal_atomic_sentence(literal), (SubLObject)hl_supports.UNPROVIDED);
                SubLObject col1 = (SubLObject)hl_supports.NIL;
                SubLObject col2 = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$36, datum_$35, (SubLObject)hl_supports.$list73);
                col1 = current_$36.first();
                current_$36 = current_$36.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$36, datum_$35, (SubLObject)hl_supports.$list73);
                col2 = current_$36.first();
                current_$36 = current_$36.rest();
                if (hl_supports.NIL == current_$36) {
                    return (SubLObject)hl_supports.NIL;
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$35, (SubLObject)hl_supports.$list73);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 34238L)
    public static SubLObject hl_justify_sibling_disjoint(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$39;
                final SubLObject datum_$38 = current_$39 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject col1 = (SubLObject)hl_supports.NIL;
                SubLObject col2 = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$39, datum_$38, (SubLObject)hl_supports.$list73);
                col1 = current_$39.first();
                current_$39 = current_$39.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$39, datum_$38, (SubLObject)hl_supports.$list73);
                col2 = current_$39.first();
                current_$39 = current_$39.rest();
                if (hl_supports.NIL == current_$39) {
                    return sdc.why_sdcP(col1, col2, mt, (SubLObject)hl_supports.$kw74$ASSERTION);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$38, (SubLObject)hl_supports.$list73);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 34521L)
    public static SubLObject hl_forward_mt_combos_sibling_disjoint(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject col1 = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
            final SubLObject col2 = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject sdc_justification = (hl_supports.NIL == cycl_utilities.negatedP(literal)) ? disjoint_with.why_disjoint_withP(col1, col2, mt, hl_supports.$const75$True_JustificationTruth, (SubLObject)hl_supports.$kw74$ASSERTION) : disjoint_with.why_not_disjoint_withP(col1, col2, mt, hl_supports.$const76$False_JustificationTruth, (SubLObject)hl_supports.$kw74$ASSERTION);
                if (hl_supports.NIL != sdc_justification) {
                    mts = genl_mts.max_floor_mts(Mapping.mapcar((SubLObject)hl_supports.$sym31$SUPPORT_MT, sdc_justification), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
                }
                if (hl_supports.NIL == mts) {
                    mts = (SubLObject)ConsesLow.list(mt);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject max_mt = (SubLObject)hl_supports.NIL;
            max_mt = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, max_mt, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                max_mt = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 35506L)
    public static SubLObject hl_verify_equality(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
            final SubLObject negatedP = cycl_utilities.negatedP(literal);
            if (hl_supports.NIL != negatedP) {
                literal = el_utilities.literal_atomic_sentence(literal);
            }
            final SubLObject arg1 = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
            final SubLObject arg2 = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
            SubLObject ans = (SubLObject)hl_supports.NIL;
            final SubLObject _prev_bind_0 = control_vars.$perform_equals_unification$.currentBinding(thread);
            try {
                control_vars.$perform_equals_unification$.bind((SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL != control_vars.$perform_equals_unification$.getDynamicValue(thread) && !predicate.eql(hl_supports.$const79$equalSymbols)), thread);
                if (hl_supports.NIL != negatedP) {
                    ans = (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL == unification_utilities.term_unify(arg1, arg2, mt, (SubLObject)hl_supports.UNPROVIDED));
                }
                else {
                    ans = unification_utilities.term_unify(arg1, arg2, mt, (SubLObject)hl_supports.UNPROVIDED);
                }
            }
            finally {
                control_vars.$perform_equals_unification$.rebind(_prev_bind_0, thread);
            }
            return list_utilities.sublisp_boolean(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 36230L)
    public static SubLObject hl_forward_mt_combos_equality(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                if (el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED).eql(hl_supports.$const80$equals)) {
                    mts = equals.max_floor_mts_where_equals(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED));
                }
                else {
                    mts = (SubLObject)ConsesLow.list(mt_vars.$equals_defining_mt$.getGlobalValue());
                }
            }
            else {
                mts = (SubLObject)ConsesLow.list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$40 = (SubLObject)hl_supports.NIL;
            mt_$40 = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$40, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$40 = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 36763L)
    public static SubLObject hl_validate_equality(final SubLObject support, final SubLObject validation_level) {
        return hl_validate_default(support, validation_level);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 36884L)
    public static SubLObject hl_validate_default(final SubLObject support, final SubLObject validation_level) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (validation_level.eql((SubLObject)hl_supports.$kw81$NONE)) {
                return (SubLObject)hl_supports.T;
            }
            if (validation_level.eql((SubLObject)hl_supports.$kw82$MINIMAL)) {
                return hl_validate_literal_minimal(literal, mt);
            }
            if (validation_level.eql((SubLObject)hl_supports.$kw83$ARG_TYPE)) {
                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
            }
            if (validation_level.eql((SubLObject)hl_supports.$kw84$ALL)) {
                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
            }
            Errors.error((SubLObject)hl_supports.$str85$Unexpected_intermediate_step_vali, validation_level);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 37471L)
    public static SubLObject hl_validate_literal_minimal(final SubLObject literal, final SubLObject mt) {
        final SubLObject arg1 = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject arg2 = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
        if (arg1.equal(arg2)) {
            return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 37686L)
    public static SubLObject hl_justify_equality(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject justification = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL != genl_predicates.genl_predP(el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED), hl_supports.$const80$equals, mt, (SubLObject)hl_supports.UNPROVIDED)) {
                justification = equals.why_equals(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED), mt, tv);
            }
            return justification;
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 38248L)
    public static SubLObject hl_verify_eval(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
            if (predicate.eql(hl_supports.$const88$evaluate)) {
                final SubLObject arg1 = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject expression = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    thread.resetMultipleValues();
                    final SubLObject v_answer = relation_evaluation.cyc_evaluate(expression);
                    final SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    ans = (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL != validP && hl_supports.NIL != unification_utilities.term_unify(v_answer, arg1, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED));
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                final SubLObject negatedP = cycl_utilities.negatedP(literal);
                final SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    thread.resetMultipleValues();
                    final SubLObject v_answer = relation_evaluation.cyc_evaluate(atomic_sentence);
                    final SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    ans = (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL != validP && hl_supports.NIL != ((hl_supports.NIL != negatedP) ? SubLObjectFactory.makeBoolean(hl_supports.NIL == v_answer) : v_answer));
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 39124L)
    public static SubLObject hl_justify_eval(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justification = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
            if (predicate.eql(hl_supports.$const88$evaluate)) {
                final SubLObject result = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject expression = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
                if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        justification = relation_evaluation.cyc_evaluate_justify(expression);
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                else {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        thread.resetMultipleValues();
                        final SubLObject v_answer = relation_evaluation.cyc_evaluate(expression);
                        final SubLObject validP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (hl_supports.NIL != validP && hl_supports.NIL == unification_utilities.term_unify(v_answer, result, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED)) {
                            final SubLObject evaluate_support = removal_modules_evaluation.make_eval_support(removal_modules_evaluate.make_evaluate_sentence(v_answer, expression), (SubLObject)hl_supports.UNPROVIDED);
                            final SubLObject different_support = removal_modules_different.make_binary_different_eval_support(result, v_answer);
                            justification = (SubLObject)ConsesLow.list(evaluate_support, different_support);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            else if (predicate.eql(hl_supports.$const52$different)) {
                final SubLObject args = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                justification = equals.why_different(args);
            }
            else {
                final SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
                if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                    final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                        justification = relation_evaluation.cyc_evaluate_justify(atomic_sentence);
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_6, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    }
                }
                else {
                    final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                        thread.resetMultipleValues();
                        final SubLObject v_answer2 = relation_evaluation.cyc_evaluate(atomic_sentence);
                        final SubLObject validP2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (hl_supports.NIL != validP2 && hl_supports.NIL == v_answer2) {
                            final SubLObject unknown_support = removal_modules_true_sentence.make_unknown_sentence_support(atomic_sentence);
                            justification = (SubLObject)ConsesLow.list(unknown_support);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_6, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return justification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 41059L)
    public static SubLObject hl_verify_reflexive(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject negatedP = cycl_utilities.negatedP(literal);
            final SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
            SubLObject current_$42;
            final SubLObject datum_$41 = current_$42 = atomic_sentence;
            SubLObject pred = (SubLObject)hl_supports.NIL;
            SubLObject arg1 = (SubLObject)hl_supports.NIL;
            SubLObject arg2 = (SubLObject)hl_supports.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$42, datum_$41, (SubLObject)hl_supports.$list90);
            pred = current_$42.first();
            current_$42 = current_$42.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$42, datum_$41, (SubLObject)hl_supports.$list90);
            arg1 = current_$42.first();
            current_$42 = current_$42.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$42, datum_$41, (SubLObject)hl_supports.$list90);
            arg2 = current_$42.first();
            current_$42 = current_$42.rest();
            if (hl_supports.NIL == current_$42) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    ans = (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL != unification_utilities.term_unify(arg1, arg2, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED) && ((hl_supports.NIL == negatedP && hl_supports.NIL != kb_accessors.reflexive_predicateP(pred) && hl_supports.NIL != arg_type.semantically_valid_literalP(atomic_sentence, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.UNPROVIDED)) || (hl_supports.NIL != negatedP && hl_supports.NIL != kb_accessors.irreflexive_predicateP(pred) && hl_supports.NIL != inference_semantically_valid_irreflexive_literalP(atomic_sentence, (SubLObject)hl_supports.NIL))));
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$41, (SubLObject)hl_supports.$list90);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 41802L)
    public static SubLObject hl_justify_reflexive(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject negatedP = cycl_utilities.negatedP(literal);
            final SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
            SubLObject current_$44;
            final SubLObject datum_$43 = current_$44 = atomic_sentence;
            SubLObject pred = (SubLObject)hl_supports.NIL;
            SubLObject arg1 = (SubLObject)hl_supports.NIL;
            SubLObject arg2 = (SubLObject)hl_supports.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$44, datum_$43, (SubLObject)hl_supports.$list90);
            pred = current_$44.first();
            current_$44 = current_$44.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$44, datum_$43, (SubLObject)hl_supports.$list90);
            arg1 = current_$44.first();
            current_$44 = current_$44.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$44, datum_$43, (SubLObject)hl_supports.$list90);
            arg2 = current_$44.first();
            current_$44 = current_$44.rest();
            if (hl_supports.NIL == current_$44) {
                final SubLObject reflexive_col = (hl_supports.NIL != negatedP) ? hl_supports.$const91$IrreflexiveBinaryPredicate : hl_supports.$const92$ReflexiveBinaryPredicate;
                final SubLObject isa_sentence = el_utilities.make_binary_formula(hl_supports.$const93$isa, pred, reflexive_col);
                final SubLObject arg1_sentence = el_utilities.make_ternary_formula(hl_supports.$const94$admittedArgument, arg1, (SubLObject)hl_supports.ONE_INTEGER, pred);
                final SubLObject arg2_sentence = el_utilities.make_ternary_formula(hl_supports.$const94$admittedArgument, arg2, (SubLObject)hl_supports.TWO_INTEGER, pred);
                final SubLObject equals_sentence = (SubLObject)(arg1.equal(arg2) ? hl_supports.NIL : el_utilities.make_binary_formula(hl_supports.$const80$equals, arg1, arg2));
                final SubLObject isa_support = arguments.make_hl_support((SubLObject)hl_supports.$kw95$ISA, isa_sentence, mt, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject arg1_support = arguments.make_hl_support((SubLObject)hl_supports.$kw96$ADMIT, arg1_sentence, mt, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject arg2_support = arguments.make_hl_support((SubLObject)hl_supports.$kw96$ADMIT, arg2_sentence, mt, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject equals_support = (SubLObject)((hl_supports.NIL != equals_sentence) ? arguments.make_hl_support((SubLObject)hl_supports.$kw86$EQUALITY, equals_sentence, mt, (SubLObject)hl_supports.UNPROVIDED) : hl_supports.NIL);
                return (SubLObject)ConsesLow.listS(isa_support, arg1_support, arg2_support, ConsesLow.append((SubLObject)((hl_supports.NIL != equals_support) ? ConsesLow.list(equals_support) : hl_supports.NIL), (SubLObject)hl_supports.NIL));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$43, (SubLObject)hl_supports.$list90);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 42924L)
    public static SubLObject hl_forward_mt_combos_reflexive(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject negatedP = cycl_utilities.negatedP(literal);
            final SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
            final SubLObject mts = max_floor_mts_where_reflexive(atomic_sentence, negatedP);
            SubLObject ans = (SubLObject)hl_supports.NIL;
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$45 = (SubLObject)hl_supports.NIL;
            mt_$45 = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$45, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$45 = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 43338L)
    public static SubLObject inference_semantically_valid_irreflexive_literalP(final SubLObject literal, SubLObject mt) {
        if (mt == hl_supports.UNPROVIDED) {
            mt = (SubLObject)hl_supports.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)hl_supports.NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        try {
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)hl_supports.NIL, thread);
            ans = removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
        }
        finally {
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 43621L)
    public static SubLObject max_floor_mts_where_reflexive(final SubLObject literal, SubLObject negatedP) {
        if (negatedP == hl_supports.UNPROVIDED) {
            negatedP = (SubLObject)hl_supports.NIL;
        }
        final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject arg1 = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject arg1_isas = kb_accessors.arg1_isa(predicate, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject arg2 = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject arg2_isas = kb_accessors.arg2_isa(predicate, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject reflex_mts = (hl_supports.NIL != negatedP) ? isa.max_floor_mts_of_isa_paths(predicate, hl_supports.$const91$IrreflexiveBinaryPredicate, (SubLObject)hl_supports.UNPROVIDED) : isa.max_floor_mts_of_isa_paths(predicate, hl_supports.$const92$ReflexiveBinaryPredicate, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject unify_mts = equals.max_floor_mts_where_equals(arg1, arg2);
        final SubLObject arg1_mts = max_floor_mts_where_arg_constraints_met(arg1, arg1_isas, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject arg2_mts = max_floor_mts_where_arg_constraints_met(arg2, arg2_isas, (SubLObject)hl_supports.UNPROVIDED);
        SubLObject answer_mts = (SubLObject)hl_supports.NIL;
        if (arg1_mts.equal(arg2_mts)) {
            SubLObject cdolist_list_var = reflex_mts;
            SubLObject reflex_mt = (SubLObject)hl_supports.NIL;
            reflex_mt = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$46 = unify_mts;
                SubLObject unify_mt = (SubLObject)hl_supports.NIL;
                unify_mt = cdolist_list_var_$46.first();
                while (hl_supports.NIL != cdolist_list_var_$46) {
                    SubLObject cdolist_list_var_$47 = arg1_mts;
                    SubLObject arg1_mt = (SubLObject)hl_supports.NIL;
                    arg1_mt = cdolist_list_var_$47.first();
                    while (hl_supports.NIL != cdolist_list_var_$47) {
                        answer_mts = ConsesLow.append(answer_mts, inference_trampolines.inference_max_floor_mts_with_cycles_pruned((SubLObject)ConsesLow.list(reflex_mt, unify_mt, arg1_mt), (SubLObject)hl_supports.UNPROVIDED));
                        cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                        arg1_mt = cdolist_list_var_$47.first();
                    }
                    cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                    unify_mt = cdolist_list_var_$46.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                reflex_mt = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = reflex_mts;
            SubLObject reflex_mt = (SubLObject)hl_supports.NIL;
            reflex_mt = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$48 = unify_mts;
                SubLObject unify_mt = (SubLObject)hl_supports.NIL;
                unify_mt = cdolist_list_var_$48.first();
                while (hl_supports.NIL != cdolist_list_var_$48) {
                    SubLObject cdolist_list_var_$49 = arg1_mts;
                    SubLObject arg1_mt = (SubLObject)hl_supports.NIL;
                    arg1_mt = cdolist_list_var_$49.first();
                    while (hl_supports.NIL != cdolist_list_var_$49) {
                        SubLObject cdolist_list_var_$50 = arg2_mts;
                        SubLObject arg2_mt = (SubLObject)hl_supports.NIL;
                        arg2_mt = cdolist_list_var_$50.first();
                        while (hl_supports.NIL != cdolist_list_var_$50) {
                            answer_mts = ConsesLow.append(answer_mts, inference_trampolines.inference_max_floor_mts_with_cycles_pruned((SubLObject)ConsesLow.list(reflex_mt, unify_mt, arg1_mt, arg2_mt), (SubLObject)hl_supports.UNPROVIDED));
                            cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                            arg2_mt = cdolist_list_var_$50.first();
                        }
                        cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                        arg1_mt = cdolist_list_var_$49.first();
                    }
                    cdolist_list_var_$48 = cdolist_list_var_$48.rest();
                    unify_mt = cdolist_list_var_$48.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                reflex_mt = cdolist_list_var.first();
            }
        }
        return list_utilities.fast_delete_duplicates(answer_mts, Symbols.symbol_function((SubLObject)hl_supports.EQUAL), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 45621L)
    public static SubLObject max_floor_mts_where_arg_constraints_met_internal(final SubLObject v_term, final SubLObject collections, SubLObject tv) {
        if (tv == hl_supports.UNPROVIDED) {
            tv = (SubLObject)hl_supports.NIL;
        }
        SubLObject mt_combos = (SubLObject)hl_supports.NIL;
        SubLObject result = (SubLObject)hl_supports.NIL;
        SubLObject cdolist_list_var = collections;
        SubLObject collection = (SubLObject)hl_supports.NIL;
        collection = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            final SubLObject mt_combo = isa.max_floor_mts_of_isa_paths(v_term, collection, tv);
            if (hl_supports.NIL == mt_combo) {
                return (SubLObject)hl_supports.NIL;
            }
            mt_combos = (SubLObject)ConsesLow.cons(mt_combo, mt_combos);
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        }
        cdolist_list_var = list_utilities.cartesian_product(mt_combos, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
        SubLObject mt_combo2 = (SubLObject)hl_supports.NIL;
        mt_combo2 = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            result = ConsesLow.append(result, inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mt_combo2, (SubLObject)hl_supports.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            mt_combo2 = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 45621L)
    public static SubLObject max_floor_mts_where_arg_constraints_met(final SubLObject v_term, final SubLObject collections, SubLObject tv) {
        if (tv == hl_supports.UNPROVIDED) {
            tv = (SubLObject)hl_supports.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)hl_supports.NIL;
        if (hl_supports.NIL == v_memoization_state) {
            return max_floor_mts_where_arg_constraints_met_internal(v_term, collections, tv);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)hl_supports.$sym97$MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET, (SubLObject)hl_supports.UNPROVIDED);
        if (hl_supports.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)hl_supports.$sym97$MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET, (SubLObject)hl_supports.THREE_INTEGER, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.EQUAL, (SubLObject)hl_supports.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)hl_supports.$sym97$MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, collections, tv);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)hl_supports.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)hl_supports.NIL;
            collision = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (collections.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (hl_supports.NIL != cached_args && hl_supports.NIL == cached_args.rest() && tv.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(max_floor_mts_where_arg_constraints_met_internal(v_term, collections, tv)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, collections, tv));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 46118L)
    public static SubLObject hl_validate_reflexive(final SubLObject support, final SubLObject validation_level) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        if (validation_level != hl_supports.$kw81$NONE && hl_supports.NIL != inference_trampolines.inference_irreflexive_predicateP(el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED))) {
            return inference_semantically_valid_irreflexive_literalP(literal, mt);
        }
        return hl_validate_default(support, validation_level);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 46766L)
    public static SubLObject hl_verify_reflexive_on(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
                SubLObject current_$52;
                final SubLObject datum_$51 = current_$52 = cycl_utilities.formula_args(atomic_sentence, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject arg1 = (SubLObject)hl_supports.NIL;
                SubLObject arg2 = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$52, datum_$51, (SubLObject)hl_supports.$list100);
                arg1 = current_$52.first();
                current_$52 = current_$52.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$52, datum_$51, (SubLObject)hl_supports.$list100);
                arg2 = current_$52.first();
                current_$52 = current_$52.rest();
                if (hl_supports.NIL == current_$52) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        ans = (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL != unification_utilities.term_unify(arg1, arg2, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED) && hl_supports.NIL != list_utilities.non_empty_list_p(removal_modules_reflexive_on.supports_for_reflexive_on(literal, mt)));
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$51, (SubLObject)hl_supports.$list100);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 47333L)
    public static SubLObject hl_justify_reflexive_on(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
            return removal_modules_reflexive_on.supports_for_reflexive_on(literal, mt);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 47567L)
    public static SubLObject hl_forward_mt_combos_reflexive_on(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
                final SubLObject mts = max_floor_mts_where_reflexive_on(atomic_sentence);
                SubLObject ans = (SubLObject)hl_supports.NIL;
                SubLObject cdolist_list_var = mts;
                SubLObject mt_$53 = (SubLObject)hl_supports.NIL;
                mt_$53 = cdolist_list_var.first();
                while (hl_supports.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$53, tv), ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt_$53 = cdolist_list_var.first();
                }
                return Sequences.nreverse(ans);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 47975L)
    public static SubLObject max_floor_mts_where_reflexive_on(final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = (SubLObject)hl_supports.NIL;
        SubLObject arg1 = (SubLObject)hl_supports.NIL;
        SubLObject arg2 = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(literal, literal, (SubLObject)hl_supports.$list101);
        predicate = literal.first();
        SubLObject current = literal.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, literal, (SubLObject)hl_supports.$list101);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, literal, (SubLObject)hl_supports.$list101);
        arg2 = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mt_combos = (SubLObject)hl_supports.NIL;
            SubLObject answer_mts = (SubLObject)hl_supports.NIL;
            SubLObject reflex_mt_col_pairs = (SubLObject)hl_supports.NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hl_supports.$sym102$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(hl_supports.$const103$EverythingPSC, thread);
                final SubLObject pred_var = hl_supports.$const104$reflexiveOn;
                if (hl_supports.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)hl_supports.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)hl_supports.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)hl_supports.NIL;
                    final SubLObject token_var = (SubLObject)hl_supports.NIL;
                    while (hl_supports.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (hl_supports.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)hl_supports.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)hl_supports.$kw105$GAF, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.NIL);
                                SubLObject done_var_$54 = (SubLObject)hl_supports.NIL;
                                final SubLObject token_var_$55 = (SubLObject)hl_supports.NIL;
                                while (hl_supports.NIL == done_var_$54) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                    final SubLObject valid_$56 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$55.eql(gaf));
                                    if (hl_supports.NIL != valid_$56) {
                                        reflex_mt_col_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(assertions_high.assertion_mt(gaf), assertions_high.gaf_arg2(gaf)), reflex_mt_col_pairs);
                                    }
                                    done_var_$54 = (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL == valid_$56);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_supports.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (hl_supports.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var;
            final SubLObject unify_mts = cdolist_list_var = equals.max_floor_mts_where_equals(arg1, arg2);
            SubLObject unify_mt = (SubLObject)hl_supports.NIL;
            unify_mt = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$58 = reflex_mt_col_pairs;
                SubLObject cons = (SubLObject)hl_supports.NIL;
                cons = cdolist_list_var_$58.first();
                while (hl_supports.NIL != cdolist_list_var_$58) {
                    SubLObject current_$60;
                    final SubLObject datum_$59 = current_$60 = cons;
                    SubLObject reflex_mt = (SubLObject)hl_supports.NIL;
                    SubLObject col = (SubLObject)hl_supports.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$60, datum_$59, (SubLObject)hl_supports.$list106);
                    reflex_mt = current_$60.first();
                    current_$60 = (col = current_$60.rest());
                    final SubLObject isa1_mts = isa.max_floor_mts_of_isa_paths(arg1, col, (SubLObject)hl_supports.UNPROVIDED);
                    final SubLObject isa2_mts = arg1.equal(arg2) ? isa1_mts : isa.max_floor_mts_of_isa_paths(arg2, col, (SubLObject)hl_supports.UNPROVIDED);
                    SubLObject cdolist_list_var_$59 = isa1_mts;
                    SubLObject isa1_mt = (SubLObject)hl_supports.NIL;
                    isa1_mt = cdolist_list_var_$59.first();
                    while (hl_supports.NIL != cdolist_list_var_$59) {
                        SubLObject cdolist_list_var_$60 = isa2_mts;
                        SubLObject isa2_mt = (SubLObject)hl_supports.NIL;
                        isa2_mt = cdolist_list_var_$60.first();
                        while (hl_supports.NIL != cdolist_list_var_$60) {
                            SubLObject combo = (SubLObject)ConsesLow.list(reflex_mt, unify_mt, isa1_mt, isa2_mt);
                            combo = Sequences.delete_duplicates(combo, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
                            final SubLObject item_var;
                            combo = (item_var = Sort.sort(combo, Symbols.symbol_function((SubLObject)hl_supports.$sym107$TERM__), (SubLObject)hl_supports.UNPROVIDED));
                            if (hl_supports.NIL == conses_high.member(item_var, mt_combos, Symbols.symbol_function((SubLObject)hl_supports.EQUAL), Symbols.symbol_function((SubLObject)hl_supports.IDENTITY))) {
                                mt_combos = (SubLObject)ConsesLow.cons(item_var, mt_combos);
                            }
                            cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                            isa2_mt = cdolist_list_var_$60.first();
                        }
                        cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                        isa1_mt = cdolist_list_var_$59.first();
                    }
                    cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                    cons = cdolist_list_var_$58.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                unify_mt = cdolist_list_var.first();
            }
            SubLObject cdolist_list_var2 = mt_combos;
            SubLObject mt_combo = (SubLObject)hl_supports.NIL;
            mt_combo = cdolist_list_var2.first();
            while (hl_supports.NIL != cdolist_list_var2) {
                final SubLObject target_set = genl_mts.max_floor_mts(mt_combo, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
                answer_mts = ConsesLow.append(target_set, answer_mts);
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt_combo = cdolist_list_var2.first();
            }
            answer_mts = list_utilities.remove_duplicate_forts(answer_mts);
            SubLObject sane_mts = (SubLObject)hl_supports.NIL;
            cdolist_list_var = answer_mts;
            SubLObject answer_mt = (SubLObject)hl_supports.NIL;
            answer_mt = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                if (hl_supports.NIL != arg_type.semantically_valid_literalP(literal, answer_mt, (SubLObject)hl_supports.UNPROVIDED)) {
                    sane_mts = (SubLObject)ConsesLow.cons(answer_mt, sane_mts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                answer_mt = cdolist_list_var.first();
            }
            answer_mts = sane_mts;
            return answer_mts;
        }
        cdestructuring_bind.cdestructuring_bind_error(literal, (SubLObject)hl_supports.$list101);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 50170L)
    public static SubLObject transitivity_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL != arguments.support_p(v_object) && hl_supports.$kw110$TRANSITIVITY == arguments.support_module(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 50411L)
    public static SubLObject hl_verify_transitivity(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
                return (SubLObject)hl_supports.T;
            }
            SubLObject current_$64;
            final SubLObject datum_$63 = current_$64 = el_utilities.literal_atomic_sentence(literal);
            SubLObject predicate = (SubLObject)hl_supports.NIL;
            SubLObject arg1 = (SubLObject)hl_supports.NIL;
            SubLObject arg2 = (SubLObject)hl_supports.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$64, datum_$63, (SubLObject)hl_supports.$list101);
            predicate = current_$64.first();
            current_$64 = current_$64.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$64, datum_$63, (SubLObject)hl_supports.$list101);
            arg1 = current_$64.first();
            current_$64 = current_$64.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$64, datum_$63, (SubLObject)hl_supports.$list101);
            arg2 = current_$64.first();
            current_$64 = current_$64.rest();
            if (hl_supports.NIL == current_$64) {
                return removal_modules_transitivity.inference_transitivity_check_strict(predicate, arg1, arg2, mt, tv);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$63, (SubLObject)hl_supports.$list101);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 50765L)
    public static SubLObject hl_forward_mt_combos_transitivity(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$66;
                final SubLObject datum_$65 = current_$66 = el_utilities.literal_atomic_sentence(literal);
                SubLObject predicate = (SubLObject)hl_supports.NIL;
                SubLObject arg1 = (SubLObject)hl_supports.NIL;
                SubLObject arg2 = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$66, datum_$65, (SubLObject)hl_supports.$list101);
                predicate = current_$66.first();
                current_$66 = current_$66.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$66, datum_$65, (SubLObject)hl_supports.$list101);
                arg1 = current_$66.first();
                current_$66 = current_$66.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$66, datum_$65, (SubLObject)hl_supports.$list101);
                arg2 = current_$66.first();
                current_$66 = current_$66.rest();
                if (hl_supports.NIL == current_$66) {
                    mts = max_floor_mts_of_transitivity_paths(predicate, arg1, arg2, tv);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$65, (SubLObject)hl_supports.$list101);
                }
            }
            else {
                mts = (SubLObject)ConsesLow.list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$67 = (SubLObject)hl_supports.NIL;
            mt_$67 = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$67, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$67 = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 51273L)
    public static SubLObject hl_justify_transitivity(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
                return (SubLObject)hl_supports.NIL;
            }
            SubLObject current_$69;
            final SubLObject datum_$68 = current_$69 = el_utilities.literal_atomic_sentence(literal);
            SubLObject predicate = (SubLObject)hl_supports.NIL;
            SubLObject arg1 = (SubLObject)hl_supports.NIL;
            SubLObject arg2 = (SubLObject)hl_supports.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$69, datum_$68, (SubLObject)hl_supports.$list101);
            predicate = current_$69.first();
            current_$69 = current_$69.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$69, datum_$68, (SubLObject)hl_supports.$list101);
            arg1 = current_$69.first();
            current_$69 = current_$69.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$69, datum_$68, (SubLObject)hl_supports.$list101);
            arg2 = current_$69.first();
            current_$69 = current_$69.rest();
            if (hl_supports.NIL == current_$69) {
                return removal_modules_transitivity.inference_transitivity_justify(predicate, arg1, arg2, mt, tv);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$68, (SubLObject)hl_supports.$list101);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 51832L)
    public static SubLObject hl_verify_contextual_transitivity(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_supports.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
        try {
            gt_vars.$gt_handle_non_transitive_predicateP$.bind((SubLObject)hl_supports.T, thread);
            result = hl_verify_transitivity(support);
        }
        finally {
            gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 52254L)
    public static SubLObject hl_justify_contextual_transitivity(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_supports.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
        try {
            gt_vars.$gt_handle_non_transitive_predicateP$.bind((SubLObject)hl_supports.T, thread);
            result = hl_justify_transitivity(support);
        }
        finally {
            gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 52693L)
    public static SubLObject max_floor_mts_of_transitivity_paths(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, SubLObject tv) {
        if (tv == hl_supports.UNPROVIDED) {
            tv = (SubLObject)hl_supports.$kw114$TRUE_DEF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = (SubLObject)hl_supports.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hl_supports.$sym115$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(hl_supports.$const32$InferencePSC, thread);
            mts = ghl_search_methods.ghl_max_floor_mts_of_predicate_paths(predicate, arg1, arg2, tv);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 52935L)
    public static SubLObject hl_verify_tva(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_tva_lookup.inference_tva_check(asent, mt, (SubLObject)hl_supports.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 53185L)
    public static SubLObject hl_justify_tva(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_tva_lookup.inference_tva_justify(asent, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 53355L)
    public static SubLObject hl_forward_mt_combos_tva(final SubLObject support) {
        SubLObject mts = (SubLObject)hl_supports.NIL;
        SubLObject ans = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject cdolist_list_var;
            mts = (cdolist_list_var = removal_modules_tva_lookup.inference_tva_max_floor_mts(asent));
            SubLObject mt_$70 = (SubLObject)hl_supports.NIL;
            mt_$70 = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, asent, mt_$70, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$70 = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 53820L)
    public static SubLObject hl_verify_rtv(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_rtv.inference_rtv_check(asent, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 54034L)
    public static SubLObject hl_justify_rtv(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_rtv.inference_rtv_justify(asent, (SubLObject)hl_supports.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 54204L)
    public static SubLObject hl_forward_mt_combos_rtv(final SubLObject support) {
        SubLObject mts = (SubLObject)hl_supports.NIL;
        SubLObject ans = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject support_mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list119);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list119);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list119);
        support_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list119);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject cdolist_list_var;
            mts = (cdolist_list_var = removal_modules_rtv.inference_rtv_max_floor_mts(asent, support_mt));
            SubLObject mt = (SubLObject)hl_supports.NIL;
            mt = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, asent, mt, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list119);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 54667L)
    public static SubLObject hl_verify_minimize(final SubLObject support) {
        SubLObject ans = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject formula = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list122);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list122);
        formula = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list122);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list122);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject pcase_var;
            final SubLObject operator = pcase_var = cycl_utilities.formula_operator(formula);
            if (pcase_var.eql(hl_supports.$const123$not) || pcase_var.eql(hl_supports.$const55$unknownSentence)) {
                final SubLObject minimized_formula = cycl_utilities.formula_arg1(formula, (SubLObject)hl_supports.UNPROVIDED);
                ans = (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL == ask_utilities.inference_literal_ask(minimized_formula, mt));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list122);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 55246L)
    public static SubLObject hl_verify_consistent(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
            return removal_modules_consistent.inference_consistent_check(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), mt);
        }
        return removal_modules_consistent.inference_inconsistent_check(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 55589L)
    public static SubLObject hl_justify_consistent(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
            return hl_justify_query_int(cycl_utilities.negate(el_utilities.literal_arg1(cycl_utilities.negate(literal), (SubLObject)hl_supports.UNPROVIDED)), mt, (SubLObject)hl_supports.T);
        }
        return hl_justify_query_int(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), mt, (SubLObject)hl_supports.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 56038L)
    public static SubLObject hl_verify_conceptually_related(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
            return removal_modules_conceptually_related.conceptually_relatedP(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED), mt, (SubLObject)hl_supports.UNPROVIDED);
        }
        literal = el_utilities.literal_atomic_sentence(literal);
        return removal_modules_conceptually_related.not_conceptually_relatedP(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 56516L)
    public static SubLObject hl_justify_conceptually_related(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
            return removal_modules_conceptually_related.why_conceptually_relatedP(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED), mt);
        }
        literal = el_utilities.literal_atomic_sentence(literal);
        return removal_modules_conceptually_related.why_not_conceptually_relatedP(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 56927L)
    public static SubLObject hl_forward_mt_combos_conceptually_related(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject source = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject target = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
                mts = removal_modules_conceptually_related.max_floor_mts_of_conceptually_related_paths(source, target);
            }
            else {
                mts = (SubLObject)ConsesLow.list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$71 = (SubLObject)hl_supports.NIL;
            mt_$71 = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$71, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$71 = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 57674L)
    public static SubLObject hl_verify_admit(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject pcase_var;
            final SubLObject predicate = pcase_var = el_utilities.literal_arg0(literal, (SubLObject)hl_supports.UNPROVIDED);
            if (pcase_var.eql(hl_supports.$const94$admittedArgument)) {
                return hl_verify_admitted_argument(support);
            }
            if (pcase_var.eql(hl_supports.$const130$admittedSentence)) {
                return hl_verify_admitted_sentence(support);
            }
            if (pcase_var.eql(hl_supports.$const131$admittedNAT)) {
                return hl_verify_admitted_nat(support);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 58338L)
    public static SubLObject hl_forward_mt_combos_admit(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject pcase_var;
            final SubLObject predicate = pcase_var = el_utilities.literal_arg0(literal, (SubLObject)hl_supports.UNPROVIDED);
            if (pcase_var.eql(hl_supports.$const94$admittedArgument)) {
                return hl_forward_mt_combos_admitted_argument(support);
            }
            if (pcase_var.eql(hl_supports.$const130$admittedSentence)) {
                return hl_forward_mt_combos_admitted_sentence(support);
            }
            if (pcase_var.eql(hl_supports.$const131$admittedNAT)) {
                return hl_forward_mt_combos_admitted_nat(support);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 58778L)
    public static SubLObject hl_justify_admit(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject pcase_var;
            final SubLObject predicate = pcase_var = el_utilities.literal_arg0(literal, (SubLObject)hl_supports.UNPROVIDED);
            if (pcase_var.eql(hl_supports.$const94$admittedArgument)) {
                return hl_justify_admitted_argument(support);
            }
            if (pcase_var.eql(hl_supports.$const130$admittedSentence)) {
                return hl_justify_admitted_sentence(support);
            }
            if (pcase_var.eql(hl_supports.$const131$admittedNAT)) {
                return hl_justify_admitted_nat(support);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 59356L)
    public static SubLObject hl_verify_admitted_argument(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject current_$73;
            final SubLObject datum_$72 = current_$73 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
            SubLObject v_term = (SubLObject)hl_supports.NIL;
            SubLObject argnum = (SubLObject)hl_supports.NIL;
            SubLObject relation = (SubLObject)hl_supports.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$73, datum_$72, (SubLObject)hl_supports.$list133);
            v_term = current_$73.first();
            current_$73 = current_$73.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$73, datum_$72, (SubLObject)hl_supports.$list133);
            argnum = current_$73.first();
            current_$73 = current_$73.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$73, datum_$72, (SubLObject)hl_supports.$list133);
            relation = current_$73.first();
            current_$73 = current_$73.rest();
            if (hl_supports.NIL == current_$73) {
                if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL == at_admitted.admitted_argumentP(v_term, argnum, relation, mt));
                }
                return at_admitted.admitted_argumentP(v_term, argnum, relation, mt);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$72, (SubLObject)hl_supports.$list133);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 59731L)
    public static SubLObject hl_verify_admitted_sentence(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject sentence = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
        if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL == at_admitted.admitted_sentenceP(sentence, mt));
        }
        return at_admitted.admitted_sentenceP(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 60042L)
    public static SubLObject hl_verify_admitted_nat(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject nat = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
        if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(hl_supports.NIL == wff.el_wft_fastP(nat, mt));
        }
        return wff.el_wft_fastP(nat, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 60321L)
    public static SubLObject hl_forward_mt_combos_admitted_argument(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$75;
                final SubLObject datum_$74 = current_$75 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject v_term = (SubLObject)hl_supports.NIL;
                SubLObject argnum = (SubLObject)hl_supports.NIL;
                SubLObject relation = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$75, datum_$74, (SubLObject)hl_supports.$list133);
                v_term = current_$75.first();
                current_$75 = current_$75.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$75, datum_$74, (SubLObject)hl_supports.$list133);
                argnum = current_$75.first();
                current_$75 = current_$75.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$75, datum_$74, (SubLObject)hl_supports.$list133);
                relation = current_$75.first();
                current_$75 = current_$75.rest();
                if (hl_supports.NIL == current_$75) {
                    mts = at_utilities.max_floor_mts_of_admitted_arg(v_term, argnum, relation, (SubLObject)hl_supports.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$74, (SubLObject)hl_supports.$list133);
                }
            }
            else {
                mts = (SubLObject)ConsesLow.list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$76 = (SubLObject)hl_supports.NIL;
            mt_$76 = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$76, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$76 = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 60799L)
    public static SubLObject hl_forward_mt_combos_admitted_sentence(final SubLObject support) {
        return (SubLObject)ConsesLow.list(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 60899L)
    public static SubLObject hl_forward_mt_combos_admitted_nat(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject nat = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
                mts = at_utilities.max_floor_mts_of_nat(nat, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
            }
            else {
                mts = (SubLObject)ConsesLow.list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$77 = (SubLObject)hl_supports.NIL;
            mt_$77 = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$77, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$77 = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 61348L)
    public static SubLObject hl_justify_admitted_argument(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
                SubLObject current_$79;
                final SubLObject datum_$78 = current_$79 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject v_term = (SubLObject)hl_supports.NIL;
                SubLObject argnum = (SubLObject)hl_supports.NIL;
                SubLObject relation = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$79, datum_$78, (SubLObject)hl_supports.$list133);
                v_term = current_$79.first();
                current_$79 = current_$79.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$79, datum_$78, (SubLObject)hl_supports.$list133);
                argnum = current_$79.first();
                current_$79 = current_$79.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$79, datum_$78, (SubLObject)hl_supports.$list133);
                relation = current_$79.first();
                current_$79 = current_$79.rest();
                if (hl_supports.NIL == current_$79) {
                    return wff.why_not_wff_violations_to_supports(at_admitted.why_not_admitted_argument(v_term, argnum, relation, mt));
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$78, (SubLObject)hl_supports.$list133);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 61705L)
    public static SubLObject hl_justify_admitted_sentence(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
                final SubLObject sentence = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject why_not_wff_violations = (SubLObject)hl_supports.NIL;
                final SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_vars.$wff_mode$.currentBinding(thread);
                try {
                    wff_vars.$within_wffP$.bind((SubLObject)hl_supports.T, thread);
                    wff_vars.$wff_mode$.bind((SubLObject)hl_supports.$kw134$STRICT, thread);
                    why_not_wff_violations = at_admitted.why_not_admitted_sentence_wrt_asent_arg_constraints(sentence, mt);
                }
                finally {
                    wff_vars.$wff_mode$.rebind(_prev_bind_2, thread);
                    wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
                }
                return wff.why_not_wff_violations_to_supports(why_not_wff_violations);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 62351L)
    public static SubLObject hl_justify_admitted_nat(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
                final SubLObject nat = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
                return wff.why_not_wff_violations_to_supports(wff.why_not_wft(nat, mt, (SubLObject)hl_supports.UNPROVIDED));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 62639L)
    public static SubLObject hl_verify_sksi(final SubLObject support) {
        return list_utilities.sublisp_boolean(hl_justify_sksi(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 62639L)
    public static SubLObject hl_justify_sksi(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return sksi_hl_support_utilities.sksi_justify_int(literal, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 62639L)
    public static SubLObject hl_forward_mt_combos_sksi(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return (SubLObject)ConsesLow.list(mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 63316L)
    public static SubLObject hl_verify_csql(final SubLObject support) {
        return list_utilities.sublisp_boolean(hl_justify_csql(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 63316L)
    public static SubLObject hl_justify_csql(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return sksi_hl_support_utilities.csql_justify_int(literal, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 63316L)
    public static SubLObject hl_forward_mt_combos_csql(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return (SubLObject)ConsesLow.list(mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 64006L)
    public static SubLObject hl_verify_source_schema_object_fn(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return sksi_hl_support_utilities.source_schema_object_fn_hl_support_verify(literal, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 64006L)
    public static SubLObject hl_justify_source_schema_object_fn(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return sksi_hl_support_utilities.source_schema_object_fn_hl_support_justify(literal, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 64006L)
    public static SubLObject hl_forward_mt_combos_source_schema_object_fn(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return (SubLObject)ConsesLow.list(mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 65168L)
    public static SubLObject hl_justify_reformulate(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL != sksi_hl_support_utilities.sksi_reformulate_justify_applicableP(literal, mt)) {
                return sksi_hl_support_utilities.sksi_reformulate_justify_int(literal, mt);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 65775L)
    public static SubLObject hl_justify_assertion(final SubLObject support) {
        if (hl_supports.NIL != assertion_handles.assertion_p(support)) {
            return (SubLObject)ConsesLow.list(support);
        }
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject el_sentence = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list144);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        el_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject assertion = fi.sentence_assertion(el_sentence, mt);
            if (hl_supports.NIL != assertion_handles.assertion_p(assertion) && hl_supports.NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.tv_truth(tv)) && hl_supports.NIL != enumeration_types.el_strength_implies(assertions_high.assertion_strength(assertion), enumeration_types.tv_strength(tv))) {
                return (SubLObject)ConsesLow.list(assertion);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list144);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 66370L)
    public static SubLObject hl_verify_assertion(final SubLObject support) {
        return list_utilities.sublisp_boolean(hl_justify_assertion(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 66467L)
    public static SubLObject hl_forward_mt_combos_assertion(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject el_sentence = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list144);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        el_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list144);
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject pcase_var = mt;
        if (pcase_var.eql(hl_supports.$const32$InferencePSC)) {
            final SubLObject assertions = fi.sentence_assertions_in_any_mt(el_sentence);
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = (SubLObject)hl_supports.NIL;
            assertion = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                final SubLObject item_var = assertions_high.assertion_mt(assertion);
                if (hl_supports.NIL == conses_high.member(item_var, mts, Symbols.symbol_function((SubLObject)hl_supports.EQL), Symbols.symbol_function((SubLObject)hl_supports.IDENTITY))) {
                    mts = (SubLObject)ConsesLow.cons(item_var, mts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
            return mts;
        }
        return (SubLObject)ConsesLow.list(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 67067L)
    public static SubLObject hl_justify_gaf(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject el_sentence = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list144);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        el_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_module == hl_supports.$kw105$GAF && hl_supports.$kw46$TRUE == enumeration_types.tv_truth(tv)) {
                final SubLObject gaf_formula = cycl_utilities.formula_arg1(el_sentence, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject gaf = (SubLObject)hl_supports.NIL;
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    gaf = kb_indexing.find_gaf_in_relevant_mt(gaf_formula);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if (hl_supports.NIL != gaf) {
                    final SubLObject operator = cycl_utilities.formula_operator(el_sentence);
                    SubLObject code_rule_support = (SubLObject)hl_supports.NIL;
                    final SubLObject pcase_var = operator;
                    if (pcase_var.eql(hl_supports.$const146$gafPredicate)) {
                        code_rule_support = removal_modules_gaf_components.make_gaf_predicate_code_rule_support();
                    }
                    else if (pcase_var.eql(hl_supports.$const147$gafArgument)) {
                        code_rule_support = removal_modules_gaf_components.make_gaf_argument_code_rule_support();
                    }
                    else {
                        Errors.error((SubLObject)hl_supports.$str148$Unexpected_predicate___S, operator);
                    }
                    return (SubLObject)ConsesLow.list(code_rule_support, gaf);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list144);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 67878L)
    public static SubLObject hl_verify_gaf(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject el_sentence = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list144);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        el_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_module == hl_supports.$kw105$GAF && hl_supports.$kw46$TRUE == enumeration_types.tv_truth(tv)) {
                final SubLObject gaf_formula = cycl_utilities.formula_arg1(el_sentence, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (hl_supports.NIL != kb_indexing.find_gaf_in_relevant_mt(gaf_formula)) {
                        final SubLObject pcase_var;
                        final SubLObject operator = pcase_var = cycl_utilities.formula_operator(el_sentence);
                        if (pcase_var.eql(hl_supports.$const146$gafPredicate)) {
                            final SubLObject predicate = cycl_utilities.formula_arg2(el_sentence, (SubLObject)hl_supports.UNPROVIDED);
                            return removal_modules_formula_arg_n.formula_has_operatorP(gaf_formula, predicate);
                        }
                        if (pcase_var.eql(hl_supports.$const147$gafArgument)) {
                            final SubLObject argnum = cycl_utilities.formula_arg2(el_sentence, (SubLObject)hl_supports.UNPROVIDED);
                            final SubLObject v_term = cycl_utilities.formula_arg3(el_sentence, (SubLObject)hl_supports.UNPROVIDED);
                            return Equality.equal(v_term, cycl_utilities.formula_arg(el_sentence, argnum, (SubLObject)hl_supports.UNPROVIDED));
                        }
                        return (SubLObject)hl_supports.NIL;
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list144);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 68769L)
    public static SubLObject hl_forward_mt_combos_gaf(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject el_sentence = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list144);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        el_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list144);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_module == hl_supports.$kw105$GAF && hl_supports.$kw46$TRUE == enumeration_types.tv_truth(tv)) {
                final SubLObject gaf_formula = cycl_utilities.formula_arg1(el_sentence, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject result_mts = kb_indexing.gaf_mts(gaf_formula);
                SubLObject result_supports = (SubLObject)hl_supports.NIL;
                SubLObject cdolist_list_var = result_mts;
                SubLObject result_mt = (SubLObject)hl_supports.NIL;
                result_mt = cdolist_list_var.first();
                while (hl_supports.NIL != cdolist_list_var) {
                    result_supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, el_sentence, result_mt, tv), result_supports);
                    cdolist_list_var = cdolist_list_var.rest();
                    result_mt = cdolist_list_var.first();
                }
                return Sequences.nreverse(result_supports);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list144);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 69435L)
    public static SubLObject hl_justify_mentions(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject sentence = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list151);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list151);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list151);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list151);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, hl_supports.$const25$assertionExists)) {
                final SubLObject assertion = cycl_utilities.atomic_sentence_arg1(sentence, (SubLObject)hl_supports.UNPROVIDED);
                if (hl_supports.NIL != assertion_handles.valid_assertionP(assertion, (SubLObject)hl_supports.UNPROVIDED)) {
                    return (SubLObject)ConsesLow.list(assertion);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list151);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 69763L)
    public static SubLObject hl_verify_mentions(final SubLObject support) {
        return list_utilities.sublisp_boolean(hl_justify_mentions(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 69858L)
    public static SubLObject hl_forward_mt_combos_mentions(final SubLObject support) {
        return (SubLObject)ConsesLow.list(hl_supports.$const26$BaseKB);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 71289L)
    public static SubLObject possibly_with_negated_truth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_supports.$list154);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject literal_var = (SubLObject)hl_supports.NIL;
        SubLObject tv_var = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_supports.$list154);
        literal_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_supports.$list154);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_supports.$list154);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_supports.$list154);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)hl_supports.$sym155$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hl_supports.$sym156$EL_NEGATION_P, literal), (SubLObject)ConsesLow.listS((SubLObject)hl_supports.$sym157$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(literal_var, (SubLObject)ConsesLow.listS((SubLObject)hl_supports.$sym158$FORMULA_ARG1, literal, (SubLObject)hl_supports.$list159)), (SubLObject)ConsesLow.list(tv_var, (SubLObject)ConsesLow.list((SubLObject)hl_supports.$sym160$INVERSE_TV, tv))), ConsesLow.append(body, (SubLObject)hl_supports.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hl_supports.$sym161$EL_FORMULA_P, literal), (SubLObject)ConsesLow.listS((SubLObject)hl_supports.$sym157$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(literal_var, literal), (SubLObject)ConsesLow.list(tv_var, tv)), ConsesLow.append(body, (SubLObject)hl_supports.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_supports.$list154);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 71792L)
    public static SubLObject hl_justify_sbhl(final SubLObject support) {
        SubLObject result = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL != el_utilities.el_negation_p(literal)) {
                final SubLObject new_literal = cycl_utilities.formula_arg1(literal, (SubLObject)hl_supports.$kw162$REGULARIZE);
                final SubLObject new_tv = enumeration_types.inverse_tv(tv);
                SubLObject current_$81;
                final SubLObject datum_$80 = current_$81 = new_literal;
                SubLObject predicate = (SubLObject)hl_supports.NIL;
                SubLObject arg1 = (SubLObject)hl_supports.NIL;
                SubLObject arg2 = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$81, datum_$80, (SubLObject)hl_supports.$list101);
                predicate = current_$81.first();
                current_$81 = current_$81.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$81, datum_$80, (SubLObject)hl_supports.$list101);
                arg1 = current_$81.first();
                current_$81 = current_$81.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$81, datum_$80, (SubLObject)hl_supports.$list101);
                arg2 = current_$81.first();
                current_$81 = current_$81.rest();
                if (hl_supports.NIL == current_$81) {
                    result = hl_justify_sbhl_optimal(hl_module, predicate, arg1, arg2, mt, new_tv);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$80, (SubLObject)hl_supports.$list101);
                }
            }
            else if (hl_supports.NIL != el_utilities.el_formula_p(literal)) {
                final SubLObject new_literal = literal;
                final SubLObject new_tv = tv;
                SubLObject current_$82;
                final SubLObject datum_$81 = current_$82 = new_literal;
                SubLObject predicate = (SubLObject)hl_supports.NIL;
                SubLObject arg1 = (SubLObject)hl_supports.NIL;
                SubLObject arg2 = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$82, datum_$81, (SubLObject)hl_supports.$list101);
                predicate = current_$82.first();
                current_$82 = current_$82.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$82, datum_$81, (SubLObject)hl_supports.$list101);
                arg1 = current_$82.first();
                current_$82 = current_$82.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$82, datum_$81, (SubLObject)hl_supports.$list101);
                arg2 = current_$82.first();
                current_$82 = current_$82.rest();
                if (hl_supports.NIL == current_$82) {
                    result = hl_justify_sbhl_optimal(hl_module, predicate, arg1, arg2, mt, new_tv);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$81, (SubLObject)hl_supports.$list101);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 72145L)
    public static SubLObject hl_justify_sbhl_optimal(final SubLObject hl_module, final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        SubLObject result = (SubLObject)hl_supports.NIL;
        if (hl_supports.NIL != list_utilities.member_eqP(hl_module, (SubLObject)hl_supports.$list163) && hl_supports.$kw46$TRUE == enumeration_types.tv_truth(tv)) {
            if (hl_supports.NIL == mt_vars.core_microtheory_p(mt) && hl_supports.$kw114$TRUE_DEF == tv && hl_supports.NIL == result) {
                result = hl_justify_sbhl_optimal_int(predicate, arg1, arg2, hl_supports.$const26$BaseKB, (SubLObject)hl_supports.$kw164$TRUE_MON);
            }
            if (hl_supports.$kw114$TRUE_DEF == tv && hl_supports.NIL == result) {
                result = hl_justify_sbhl_optimal_int(predicate, arg1, arg2, mt, (SubLObject)hl_supports.$kw164$TRUE_MON);
            }
            if (hl_supports.NIL == mt_vars.core_microtheory_p(mt) && hl_supports.NIL == result) {
                result = hl_justify_sbhl_optimal_int(predicate, arg1, arg2, hl_supports.$const26$BaseKB, tv);
            }
        }
        if (hl_supports.NIL == result) {
            result = hl_justify_sbhl_optimal_int(predicate, arg1, arg2, mt, tv);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 73189L)
    public static SubLObject hl_justify_sbhl_optimal_int(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_supports.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = sbhl_search_methods.why_sbhl_relationP(sbhl_module_vars.get_sbhl_module(predicate), arg1, arg2, (SubLObject)hl_supports.NIL, sbhl_link_vars.support_tv_to_sbhl_tv(tv), (SubLObject)hl_supports.$kw74$ASSERTION);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 73457L)
    public static SubLObject hl_verify_isa(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
                SubLObject current_$85;
                final SubLObject datum_$84 = current_$85 = el_utilities.literal_args(el_utilities.literal_atomic_sentence(literal), (SubLObject)hl_supports.UNPROVIDED);
                SubLObject v_object = (SubLObject)hl_supports.NIL;
                SubLObject collection = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$85, datum_$84, (SubLObject)hl_supports.$list61);
                v_object = current_$85.first();
                current_$85 = current_$85.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$85, datum_$84, (SubLObject)hl_supports.$list61);
                collection = current_$85.first();
                current_$85 = current_$85.rest();
                if (hl_supports.NIL == current_$85) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(((hl_supports.NIL == inference_worker.currently_active_problem_store() || hl_supports.NIL != inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP(inference_worker.currently_active_problem_store())) && hl_supports.NIL != kb_accessors.completely_enumerable_collectionP(collection, mt) && hl_supports.NIL == at_defns.quiet_has_typeP(v_object, collection, mt)) || hl_supports.NIL != isa.not_isaP(v_object, collection, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv)));
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$84, (SubLObject)hl_supports.$list61);
            }
            else {
                final SubLObject pcase_var = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
                if (pcase_var.eql(hl_supports.$const165$nearestIsa)) {
                    return removal_modules_nearest_isa.hl_verify_nearest_isa(support);
                }
                if (pcase_var.eql(hl_supports.$const166$nearestIsaOfType)) {
                    return removal_modules_nearest_isa.hl_verify_nearest_isa_of_type(support);
                }
                SubLObject current_$86;
                final SubLObject datum_$85 = current_$86 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject v_object2 = (SubLObject)hl_supports.NIL;
                SubLObject collection2 = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$86, datum_$85, (SubLObject)hl_supports.$list61);
                v_object2 = current_$86.first();
                current_$86 = current_$86.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$86, datum_$85, (SubLObject)hl_supports.$list61);
                collection2 = current_$86.first();
                current_$86 = current_$86.rest();
                if (hl_supports.NIL == current_$86) {
                    return isa.isaP(v_object2, collection2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$85, (SubLObject)hl_supports.$list61);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 74651L)
    public static SubLObject hl_justify_isa(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject assertion = czer_meta.find_assertion_cycl(literal, mt);
        if (hl_supports.NIL != assertion) {
            return (SubLObject)ConsesLow.list(assertion);
        }
        final SubLObject pcase_var = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
        if (pcase_var.eql(hl_supports.$const167$elementOf)) {
            final SubLObject v_term = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
            final SubLObject col = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
            final SubLObject isa_asent = el_utilities.make_binary_formula(hl_supports.$const93$isa, v_term, col);
            final SubLObject support_literal = (hl_supports.NIL != cycl_utilities.negatedP(literal)) ? cycl_utilities.negate(isa_asent) : isa_asent;
            final SubLObject new_support = arguments.make_hl_support(hl_module, support_literal, mt, tv);
            return hl_justify_sbhl(new_support);
        }
        if (pcase_var.eql(hl_supports.$const165$nearestIsa)) {
            return removal_modules_nearest_isa.hl_justify_nearest_isa(support);
        }
        if (pcase_var.eql(hl_supports.$const166$nearestIsaOfType)) {
            return removal_modules_nearest_isa.hl_justify_nearest_isa_of_type(support);
        }
        if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
            return hl_justify_sbhl(support);
        }
        final SubLObject v_term = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject col = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
        if (hl_supports.NIL != kb_accessors.completely_enumerable_collectionP(col, mt)) {
            return justify_not_type_by_extent_known(v_term, col, mt);
        }
        return hl_justify_sbhl(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 75895L)
    public static SubLObject clear_hl_forward_mt_combos_isa() {
        final SubLObject cs = hl_supports.$hl_forward_mt_combos_isa_caching_state$.getGlobalValue();
        if (hl_supports.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 75895L)
    public static SubLObject remove_hl_forward_mt_combos_isa(final SubLObject support) {
        return memoization_state.caching_state_remove_function_results_with_args(hl_supports.$hl_forward_mt_combos_isa_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(support), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 75895L)
    public static SubLObject hl_forward_mt_combos_isa_internal(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject pcase_var = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
                if (pcase_var.eql(hl_supports.$const167$elementOf)) {
                    SubLObject current_$89;
                    final SubLObject datum_$88 = current_$89 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                    SubLObject arg1 = (SubLObject)hl_supports.NIL;
                    SubLObject arg2 = (SubLObject)hl_supports.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$89, datum_$88, (SubLObject)hl_supports.$list100);
                    arg1 = current_$89.first();
                    current_$89 = current_$89.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$89, datum_$88, (SubLObject)hl_supports.$list100);
                    arg2 = current_$89.first();
                    current_$89 = current_$89.rest();
                    if (hl_supports.NIL == current_$89) {
                        mts = inference_max_floor_mts_of_isa_paths(arg1, arg2);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$88, (SubLObject)hl_supports.$list100);
                    }
                }
                else if (pcase_var.eql(hl_supports.$const62$quotedIsa)) {
                    SubLObject current_$90;
                    final SubLObject datum_$89 = current_$90 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                    SubLObject arg1 = (SubLObject)hl_supports.NIL;
                    SubLObject arg2 = (SubLObject)hl_supports.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$90, datum_$89, (SubLObject)hl_supports.$list100);
                    arg1 = current_$90.first();
                    current_$90 = current_$90.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$90, datum_$89, (SubLObject)hl_supports.$list100);
                    arg2 = current_$90.first();
                    current_$90 = current_$90.rest();
                    if (hl_supports.NIL == current_$90) {
                        mts = inference_max_floor_mts_of_quoted_isa_paths(arg1, arg2);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$89, (SubLObject)hl_supports.$list100);
                    }
                }
                else if (pcase_var.eql(hl_supports.$const165$nearestIsa)) {
                    SubLObject current_$91;
                    final SubLObject datum_$90 = current_$91 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                    SubLObject arg1 = (SubLObject)hl_supports.NIL;
                    SubLObject arg2 = (SubLObject)hl_supports.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$91, datum_$90, (SubLObject)hl_supports.$list100);
                    arg1 = current_$91.first();
                    current_$91 = current_$91.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$91, datum_$90, (SubLObject)hl_supports.$list100);
                    arg2 = current_$91.first();
                    current_$91 = current_$91.rest();
                    if (hl_supports.NIL == current_$91) {
                        mts = inference_max_floor_mts_of_isa_paths(arg1, arg2);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$90, (SubLObject)hl_supports.$list100);
                    }
                }
                else if (pcase_var.eql(hl_supports.$const166$nearestIsaOfType)) {
                    SubLObject current_$92;
                    final SubLObject datum_$91 = current_$92 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                    SubLObject arg1 = (SubLObject)hl_supports.NIL;
                    SubLObject arg2 = (SubLObject)hl_supports.NIL;
                    SubLObject arg3 = (SubLObject)hl_supports.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$92, datum_$91, (SubLObject)hl_supports.$list169);
                    arg1 = current_$92.first();
                    current_$92 = current_$92.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$92, datum_$91, (SubLObject)hl_supports.$list169);
                    arg2 = current_$92.first();
                    current_$92 = current_$92.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$92, datum_$91, (SubLObject)hl_supports.$list169);
                    arg3 = current_$92.first();
                    current_$92 = current_$92.rest();
                    if (hl_supports.NIL == current_$92) {
                        final SubLObject mts2 = inference_max_floor_mts_of_isa_paths(arg1, arg3);
                        final SubLObject mts3 = inference_max_floor_mts_of_isa_paths(arg3, arg2);
                        SubLObject cdolist_list_var = mts2;
                        SubLObject mt2 = (SubLObject)hl_supports.NIL;
                        mt2 = cdolist_list_var.first();
                        while (hl_supports.NIL != cdolist_list_var) {
                            SubLObject cdolist_list_var_$96 = mts3;
                            SubLObject mt3 = (SubLObject)hl_supports.NIL;
                            mt3 = cdolist_list_var_$96.first();
                            while (hl_supports.NIL != cdolist_list_var_$96) {
                                mts = ConsesLow.append(mts, inference_trampolines.inference_max_floor_mts_with_cycles_pruned((SubLObject)ConsesLow.list(mt2, mt3), (SubLObject)hl_supports.UNPROVIDED));
                                cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                                mt3 = cdolist_list_var_$96.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            mt2 = cdolist_list_var.first();
                        }
                        mts = list_utilities.fast_delete_duplicates(mts, Symbols.symbol_function((SubLObject)hl_supports.EQUAL), (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED, (SubLObject)hl_supports.UNPROVIDED);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$91, (SubLObject)hl_supports.$list169);
                    }
                }
                else {
                    SubLObject current_$93;
                    final SubLObject datum_$92 = current_$93 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                    SubLObject arg1 = (SubLObject)hl_supports.NIL;
                    SubLObject arg2 = (SubLObject)hl_supports.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$93, datum_$92, (SubLObject)hl_supports.$list100);
                    arg1 = current_$93.first();
                    current_$93 = current_$93.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$93, datum_$92, (SubLObject)hl_supports.$list100);
                    arg2 = current_$93.first();
                    current_$93 = current_$93.rest();
                    if (hl_supports.NIL == current_$93) {
                        mts = inference_max_floor_mts_of_isa_paths(arg1, arg2);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$92, (SubLObject)hl_supports.$list100);
                    }
                }
            }
            else {
                mts = (SubLObject)ConsesLow.list(mt);
            }
            SubLObject cdolist_list_var2 = mts;
            SubLObject mt_$99 = (SubLObject)hl_supports.NIL;
            mt_$99 = cdolist_list_var2.first();
            while (hl_supports.NIL != cdolist_list_var2) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$99, tv), ans);
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt_$99 = cdolist_list_var2.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 75895L)
    public static SubLObject hl_forward_mt_combos_isa(final SubLObject support) {
        SubLObject caching_state = hl_supports.$hl_forward_mt_combos_isa_caching_state$.getGlobalValue();
        if (hl_supports.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)hl_supports.$sym168$HL_FORWARD_MT_COMBOS_ISA, (SubLObject)hl_supports.$sym170$_HL_FORWARD_MT_COMBOS_ISA_CACHING_STATE_, (SubLObject)hl_supports.$int171$1024, (SubLObject)hl_supports.EQUAL, (SubLObject)hl_supports.ONE_INTEGER, (SubLObject)hl_supports.ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback((SubLObject)hl_supports.$sym172$CLEAR_HL_FORWARD_MT_COMBOS_ISA);
            memoization_state.register_genls_dependent_cache_clear_callback((SubLObject)hl_supports.$sym172$CLEAR_HL_FORWARD_MT_COMBOS_ISA);
            memoization_state.register_mt_dependent_cache_clear_callback((SubLObject)hl_supports.$sym172$CLEAR_HL_FORWARD_MT_COMBOS_ISA);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, support, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(hl_forward_mt_combos_isa_internal(support)));
            memoization_state.caching_state_put(caching_state, support, results, (SubLObject)hl_supports.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 77620L)
    public static SubLObject justify_not_type_by_extent_known(final SubLObject v_term, final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject isa_sentence = el_utilities.make_binary_formula(hl_supports.$const93$isa, v_term, collection);
        SubLObject completeness_gaf = (SubLObject)hl_supports.NIL;
        SubLObject unknown_sentence_support = (SubLObject)hl_supports.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            completeness_gaf = kb_accessors.completely_enumerable_collection_gaf(collection, (SubLObject)hl_supports.UNPROVIDED);
            unknown_sentence_support = removal_modules_true_sentence.make_unknown_sentence_support(isa_sentence);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.list(completeness_gaf, unknown_sentence_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 78081L)
    public static SubLObject inference_max_floor_mts_of_isa_paths(final SubLObject v_term, final SubLObject collection) {
        final SubLObject min_mt_sets = isa.min_mts_of_isa_paths(v_term, collection, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject reduced_min_mt_sets = mt_vars.minimize_mt_sets_wrt_core(min_mt_sets);
        final SubLObject max_floor_mts = genl_mts.max_floor_mts_from_mt_sets(reduced_min_mt_sets);
        final SubLObject reduced_max_floor_mts = mt_vars.maximize_mts_wrt_core(max_floor_mts);
        return reduced_max_floor_mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 78520L)
    public static SubLObject inference_max_floor_mts_of_quoted_isa_paths(final SubLObject v_term, final SubLObject collection) {
        final SubLObject min_mt_sets = isa.min_mts_of_quoted_isa_paths(v_term, collection, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject reduced_min_mt_sets = mt_vars.minimize_mt_sets_wrt_core(min_mt_sets);
        final SubLObject max_floor_mts = genl_mts.max_floor_mts_from_mt_sets(reduced_min_mt_sets);
        final SubLObject reduced_max_floor_mts = mt_vars.maximize_mts_wrt_core(max_floor_mts);
        return reduced_max_floor_mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 78980L)
    public static SubLObject gaf_axioms(final SubLObject gafs, final SubLObject mt) {
        SubLObject result = (SubLObject)hl_supports.NIL;
        SubLObject assertion = (SubLObject)hl_supports.NIL;
        SubLObject cdolist_list_var = gafs;
        SubLObject gafXtv = (SubLObject)hl_supports.NIL;
        gafXtv = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = gafXtv;
            SubLObject gaf = (SubLObject)hl_supports.NIL;
            SubLObject tv = (SubLObject)hl_supports.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_supports.$list174);
            gaf = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_supports.$list174);
            tv = current.first();
            current = current.rest();
            if (hl_supports.NIL == current) {
                assertion = kb_indexing.find_gaf(gaf, mt);
                if (hl_supports.NIL == assertion && hl_supports.NIL != symmetric_hl_predP(gaf.first())) {
                    assertion = kb_indexing.find_gaf((SubLObject)ConsesLow.list(gaf.first(), conses_high.third(gaf), conses_high.second(gaf)), mt);
                }
                if (hl_supports.NIL != assertion) {
                    result = (SubLObject)ConsesLow.cons(assertion, result);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_supports.$list174);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gafXtv = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 79390L)
    public static SubLObject gaf_axioms_genl_mts(final SubLObject gafs, final SubLObject mt) {
        SubLObject result = (SubLObject)hl_supports.NIL;
        SubLObject assertion = (SubLObject)hl_supports.NIL;
        SubLObject cdolist_list_var = gafs;
        SubLObject gafXtv = (SubLObject)hl_supports.NIL;
        gafXtv = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = gafXtv;
            SubLObject gaf = (SubLObject)hl_supports.NIL;
            SubLObject tv = (SubLObject)hl_supports.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_supports.$list174);
            gaf = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_supports.$list174);
            tv = current.first();
            current = current.rest();
            if (hl_supports.NIL == current) {
                assertion = kb_indexing.find_gaf_genl_mts(gaf, mt);
                if (hl_supports.NIL == assertion && hl_supports.NIL != symmetric_hl_predP(gaf.first())) {
                    assertion = kb_indexing.find_gaf((SubLObject)ConsesLow.list(gaf.first(), conses_high.third(gaf), conses_high.second(gaf)), mt);
                }
                if (hl_supports.NIL != assertion) {
                    result = (SubLObject)ConsesLow.cons(assertion, result);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_supports.$list174);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gafXtv = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 79810L)
    public static SubLObject symmetric_hl_predP(final SubLObject pred) {
        return Types.consp(conses_high.member(pred, (SubLObject)hl_supports.$list175, Symbols.symbol_function((SubLObject)hl_supports.EQL), (SubLObject)hl_supports.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 79908L)
    public static SubLObject hl_verify_incompatible_mts(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
                return (SubLObject)hl_supports.NIL;
            }
            SubLObject current_$101;
            final SubLObject datum_$100 = current_$101 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
            SubLObject mt2 = (SubLObject)hl_supports.NIL;
            SubLObject mt3 = (SubLObject)hl_supports.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$101, datum_$100, (SubLObject)hl_supports.$list176);
            mt2 = current_$101.first();
            current_$101 = current_$101.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$101, datum_$100, (SubLObject)hl_supports.$list176);
            mt3 = current_$101.first();
            current_$101 = current_$101.rest();
            if (hl_supports.NIL == current_$101) {
                return negation_mt.incompatible_mtsP(mt2, mt3, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$100, (SubLObject)hl_supports.$list176);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 80296L)
    public static SubLObject hl_justify_incompatible_mts(final SubLObject support) {
        return hl_justify_sbhl(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 80578L)
    public static SubLObject hl_verify_genls(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
            literal = el_utilities.literal_atomic_sentence(literal);
            return removal_modules_genls.inference_not_genlP(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
        }
        final SubLObject pcase_var = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
        if (pcase_var.eql(hl_supports.$const179$nearestGenls)) {
            return removal_modules_nearest_isa.hl_verify_nearest_genls(support);
        }
        if (pcase_var.eql(hl_supports.$const180$nearestGenlsOfType)) {
            return removal_modules_nearest_isa.hl_verify_nearest_genls_of_type(support);
        }
        return removal_modules_genls.inference_genlP(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 81308L)
    public static SubLObject hl_justify_genls(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject pcase_var = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
        if (pcase_var.eql(hl_supports.$const179$nearestGenls)) {
            return removal_modules_nearest_isa.hl_justify_nearest_genls(support);
        }
        if (pcase_var.eql(hl_supports.$const180$nearestGenlsOfType)) {
            return removal_modules_nearest_isa.hl_justify_nearest_genls_of_type(support);
        }
        return hl_justify_sbhl(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 81693L)
    public static SubLObject hl_forward_mt_combos_genls(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject pcase_var = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
        if (pcase_var.eql(hl_supports.$const179$nearestGenls)) {
            return (SubLObject)ConsesLow.list(support);
        }
        if (pcase_var.eql(hl_supports.$const180$nearestGenlsOfType)) {
            return (SubLObject)ConsesLow.list(support);
        }
        SubLObject mts = (SubLObject)hl_supports.NIL;
        SubLObject ans = (SubLObject)hl_supports.NIL;
        if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
            mts = inference_max_floor_mts_of_genls_paths(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED));
        }
        else {
            mts = (SubLObject)ConsesLow.list(mt);
        }
        SubLObject cdolist_list_var = mts;
        SubLObject mt_$102 = (SubLObject)hl_supports.NIL;
        mt_$102 = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$102, tv), ans);
            cdolist_list_var = cdolist_list_var.rest();
            mt_$102 = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 82491L)
    public static SubLObject inference_max_floor_mts_of_genls_paths(final SubLObject spec, final SubLObject genl) {
        if (hl_supports.NIL != term.first_order_nautP(spec)) {
            return genls.max_floor_mts_of_nat_genls_paths(spec, genl, (SubLObject)hl_supports.UNPROVIDED);
        }
        final SubLObject min_mt_sets = sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(hl_supports.$const183$genls), spec, genl, (SubLObject)hl_supports.UNPROVIDED);
        final SubLObject reduced_min_mt_sets = mt_vars.minimize_mt_sets_wrt_core(min_mt_sets);
        final SubLObject max_floor_mts = sbhl_search_what_mts.sbhl_max_floor_mts_of_paths(reduced_min_mt_sets);
        final SubLObject reduced_max_floor_mts = mt_vars.maximize_mts_wrt_core(max_floor_mts);
        return reduced_max_floor_mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 83135L)
    public static SubLObject hl_verify_disjointwith(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind((SubLObject)hl_supports.T, thread);
            SubLObject hl_module = (SubLObject)hl_supports.NIL;
            SubLObject literal = (SubLObject)hl_supports.NIL;
            SubLObject mt = (SubLObject)hl_supports.NIL;
            SubLObject tv = (SubLObject)hl_supports.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
            hl_module = support.first();
            SubLObject current = support.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
            literal = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
            tv = current.first();
            current = current.rest();
            if (hl_supports.NIL == current) {
                if (el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED).eql(hl_supports.$const184$instancesOfDisjointCollections)) {
                    SubLObject current_$104;
                    final SubLObject datum_$103 = current_$104 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                    SubLObject term1 = (SubLObject)hl_supports.NIL;
                    SubLObject term2 = (SubLObject)hl_supports.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$104, datum_$103, (SubLObject)hl_supports.$list185);
                    term1 = current_$104.first();
                    current_$104 = current_$104.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$104, datum_$103, (SubLObject)hl_supports.$list185);
                    term2 = current_$104.first();
                    current_$104 = current_$104.rest();
                    if (hl_supports.NIL == current_$104) {
                        return list_utilities.sublisp_boolean(disjoint_with.why_instances_of_disjoint_collections(term1, term2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv)));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(datum_$103, (SubLObject)hl_supports.$list185);
                }
                else if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                    SubLObject current_$105;
                    final SubLObject datum_$104 = current_$105 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                    SubLObject col1 = (SubLObject)hl_supports.NIL;
                    SubLObject col2 = (SubLObject)hl_supports.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$105, datum_$104, (SubLObject)hl_supports.$list73);
                    col1 = current_$105.first();
                    current_$105 = current_$105.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$105, datum_$104, (SubLObject)hl_supports.$list73);
                    col2 = current_$105.first();
                    current_$105 = current_$105.rest();
                    if (hl_supports.NIL == current_$105) {
                        return disjoint_with.disjoint_withP(col1, col2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(datum_$104, (SubLObject)hl_supports.$list73);
                }
                else {
                    SubLObject current_$106;
                    final SubLObject datum_$105 = current_$106 = el_utilities.literal_args(el_utilities.literal_atomic_sentence(literal), (SubLObject)hl_supports.UNPROVIDED);
                    SubLObject col1 = (SubLObject)hl_supports.NIL;
                    SubLObject col2 = (SubLObject)hl_supports.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$106, datum_$105, (SubLObject)hl_supports.$list73);
                    col1 = current_$106.first();
                    current_$106 = current_$106.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$106, datum_$105, (SubLObject)hl_supports.$list73);
                    col2 = current_$106.first();
                    current_$106 = current_$106.rest();
                    if (hl_supports.NIL == current_$106) {
                        return disjoint_with.not_disjoint_withP(col1, col2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(datum_$105, (SubLObject)hl_supports.$list73);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            }
        }
        finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 83930L)
    public static SubLObject hl_justify_disjointwith(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind((SubLObject)hl_supports.T, thread);
            SubLObject hl_module = (SubLObject)hl_supports.NIL;
            SubLObject literal = (SubLObject)hl_supports.NIL;
            SubLObject mt = (SubLObject)hl_supports.NIL;
            SubLObject tv = (SubLObject)hl_supports.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
            hl_module = support.first();
            SubLObject current = support.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
            literal = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
            tv = current.first();
            current = current.rest();
            if (hl_supports.NIL == current) {
                if (!el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED).eql(hl_supports.$const184$instancesOfDisjointCollections)) {
                    return hl_justify_sbhl(support);
                }
                SubLObject current_$110;
                final SubLObject datum_$109 = current_$110 = el_utilities.literal_args(literal, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject term1 = (SubLObject)hl_supports.NIL;
                SubLObject term2 = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$110, datum_$109, (SubLObject)hl_supports.$list185);
                term1 = current_$110.first();
                current_$110 = current_$110.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$110, datum_$109, (SubLObject)hl_supports.$list185);
                term2 = current_$110.first();
                current_$110 = current_$110.rest();
                if (hl_supports.NIL == current_$110) {
                    return disjoint_with.why_instances_of_disjoint_collections(term1, term2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$109, (SubLObject)hl_supports.$list185);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            }
        }
        finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 84384L)
    public static SubLObject hl_forward_mt_combos_disjointwith(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind((SubLObject)hl_supports.T, thread);
            SubLObject hl_module = (SubLObject)hl_supports.NIL;
            SubLObject literal = (SubLObject)hl_supports.NIL;
            SubLObject mt = (SubLObject)hl_supports.NIL;
            SubLObject tv = (SubLObject)hl_supports.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
            hl_module = support.first();
            SubLObject current = support.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
            literal = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
            tv = current.first();
            current = current.rest();
            if (hl_supports.NIL == current) {
                final SubLObject col1 = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
                final SubLObject col2 = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
                SubLObject mts = (SubLObject)hl_supports.NIL;
                SubLObject ans = (SubLObject)hl_supports.NIL;
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0_$111 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                        mts = disjoint_with.max_floor_mts_of_disjoint_with_paths(col1, col2, (SubLObject)hl_supports.UNPROVIDED);
                    }
                    else {
                        mts = disjoint_with.max_floor_mts_of_not_disjoint_with_paths(col1, col2, (SubLObject)hl_supports.UNPROVIDED);
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$111, thread);
                }
                if (hl_supports.NIL == mts) {
                    mts = (SubLObject)ConsesLow.list(mt);
                }
                SubLObject cdolist_list_var = mts;
                SubLObject max_mt = (SubLObject)hl_supports.NIL;
                max_mt = cdolist_list_var.first();
                while (hl_supports.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, max_mt, tv), ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    max_mt = cdolist_list_var.first();
                }
                return Sequences.nreverse(ans);
            }
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 85222L)
    public static SubLObject hl_verify_genlmt(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL != cycl_utilities.negatedP(literal)) {
            final SubLObject asent = el_utilities.literal_atomic_sentence(literal);
            return genl_mts.not_genl_mtP(el_utilities.literal_arg1(asent, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(asent, (SubLObject)hl_supports.UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
        }
        return genl_mts.genl_mtP(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 85657L)
    public static SubLObject hl_justify_genlmt(final SubLObject support) {
        SubLObject just = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                just = genl_mts.why_genl_mtP(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED), mt, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.$kw74$ASSERTION);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return just;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 85995L)
    public static SubLObject hl_forward_mt_combos_genlmt(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                mts = genl_mts.max_floor_mts_of_genl_mt_paths(el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED), el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED));
            }
            else {
                mts = (SubLObject)ConsesLow.list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$112 = (SubLObject)hl_supports.NIL;
            mt_$112 = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$112, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$112 = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 86611L)
    public static SubLObject hl_verify_genlpreds(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$114;
                final SubLObject datum_$113 = current_$114 = literal;
                SubLObject predicate = (SubLObject)hl_supports.NIL;
                SubLObject spec = (SubLObject)hl_supports.NIL;
                SubLObject genl = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$114, datum_$113, (SubLObject)hl_supports.$list190);
                predicate = current_$114.first();
                current_$114 = current_$114.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$114, datum_$113, (SubLObject)hl_supports.$list190);
                spec = current_$114.first();
                current_$114 = current_$114.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$114, datum_$113, (SubLObject)hl_supports.$list190);
                genl = current_$114.first();
                current_$114 = current_$114.rest();
                if (hl_supports.NIL == current_$114) {
                    final SubLObject pcase_var = predicate;
                    if (pcase_var.eql(hl_supports.$const191$genlPreds)) {
                        return genl_predicates.genl_predicateP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                    if (pcase_var.eql(hl_supports.$const192$genlInverse)) {
                        return genl_predicates.genl_inverseP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$113, (SubLObject)hl_supports.$list190);
                }
            }
            else {
                SubLObject current_$115;
                final SubLObject datum_$114 = current_$115 = el_utilities.literal_atomic_sentence(literal);
                SubLObject predicate = (SubLObject)hl_supports.NIL;
                SubLObject spec = (SubLObject)hl_supports.NIL;
                SubLObject genl = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$115, datum_$114, (SubLObject)hl_supports.$list190);
                predicate = current_$115.first();
                current_$115 = current_$115.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$115, datum_$114, (SubLObject)hl_supports.$list190);
                spec = current_$115.first();
                current_$115 = current_$115.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$115, datum_$114, (SubLObject)hl_supports.$list190);
                genl = current_$115.first();
                current_$115 = current_$115.rest();
                if (hl_supports.NIL == current_$115) {
                    final SubLObject pcase_var = predicate;
                    if (pcase_var.eql(hl_supports.$const191$genlPreds)) {
                        return genl_predicates.not_genl_predicateP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                    if (pcase_var.eql(hl_supports.$const192$genlInverse)) {
                        return genl_predicates.not_genl_inverseP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$114, (SubLObject)hl_supports.$list190);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 87416L)
    public static SubLObject hl_justify_genlpreds(final SubLObject support) {
        return hl_justify_sbhl(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 87499L)
    public static SubLObject hl_forward_mt_combos_genlpreds(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$118;
                final SubLObject datum_$117 = current_$118 = literal;
                SubLObject predicate = (SubLObject)hl_supports.NIL;
                SubLObject spec = (SubLObject)hl_supports.NIL;
                SubLObject genl = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$118, datum_$117, (SubLObject)hl_supports.$list190);
                predicate = current_$118.first();
                current_$118 = current_$118.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$118, datum_$117, (SubLObject)hl_supports.$list190);
                spec = current_$118.first();
                current_$118 = current_$118.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$118, datum_$117, (SubLObject)hl_supports.$list190);
                genl = current_$118.first();
                current_$118 = current_$118.rest();
                if (hl_supports.NIL == current_$118) {
                    final SubLObject pcase_var = predicate;
                    if (pcase_var.eql(hl_supports.$const191$genlPreds)) {
                        mts = genl_predicates.max_floor_mts_of_genl_pred_paths(spec, genl);
                    }
                    else if (pcase_var.eql(hl_supports.$const192$genlInverse)) {
                        mts = genl_predicates.max_floor_mts_of_genl_inverse_paths(spec, genl, (SubLObject)hl_supports.UNPROVIDED);
                    }
                    else {
                        mts = (SubLObject)ConsesLow.list(mt);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$117, (SubLObject)hl_supports.$list190);
                }
            }
            else {
                mts = (SubLObject)ConsesLow.list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$119 = (SubLObject)hl_supports.NIL;
            mt_$119 = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$119, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$119 = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 88332L)
    public static SubLObject hl_verify_negationpreds(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (hl_supports.NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$121;
                final SubLObject datum_$120 = current_$121 = literal;
                SubLObject predicate = (SubLObject)hl_supports.NIL;
                SubLObject arg1 = (SubLObject)hl_supports.NIL;
                SubLObject arg2 = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$121, datum_$120, (SubLObject)hl_supports.$list101);
                predicate = current_$121.first();
                current_$121 = current_$121.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$121, datum_$120, (SubLObject)hl_supports.$list101);
                arg1 = current_$121.first();
                current_$121 = current_$121.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$121, datum_$120, (SubLObject)hl_supports.$list101);
                arg2 = current_$121.first();
                current_$121 = current_$121.rest();
                if (hl_supports.NIL == current_$121) {
                    final SubLObject pcase_var = predicate;
                    if (pcase_var.eql(hl_supports.$const195$negationPreds)) {
                        return negation_predicate.negation_predicateP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                    if (pcase_var.eql(hl_supports.$const196$negationInverse)) {
                        return negation_predicate.negation_inverseP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$120, (SubLObject)hl_supports.$list101);
                }
            }
            else {
                SubLObject current_$122;
                final SubLObject datum_$121 = current_$122 = el_utilities.literal_atomic_sentence(literal);
                SubLObject predicate = (SubLObject)hl_supports.NIL;
                SubLObject arg1 = (SubLObject)hl_supports.NIL;
                SubLObject arg2 = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$122, datum_$121, (SubLObject)hl_supports.$list101);
                predicate = current_$122.first();
                current_$122 = current_$122.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$122, datum_$121, (SubLObject)hl_supports.$list101);
                arg1 = current_$122.first();
                current_$122 = current_$122.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$122, datum_$121, (SubLObject)hl_supports.$list101);
                arg2 = current_$122.first();
                current_$122 = current_$122.rest();
                if (hl_supports.NIL == current_$122) {
                    final SubLObject pcase_var = predicate;
                    if (pcase_var.eql(hl_supports.$const195$negationPreds)) {
                        return negation_predicate.not_negation_predicateP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                    if (pcase_var.eql(hl_supports.$const196$negationInverse)) {
                        return negation_predicate.not_negation_inverseP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$121, (SubLObject)hl_supports.$list101);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 89193L)
    public static SubLObject hl_justify_negationpreds(final SubLObject support) {
        return hl_justify_sbhl(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 89280L)
    public static SubLObject hl_forward_mt_combos_negationpreds(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject mts = (SubLObject)hl_supports.NIL;
            SubLObject ans = (SubLObject)hl_supports.NIL;
            SubLObject cdolist_list_var;
            mts = (cdolist_list_var = (SubLObject)ConsesLow.list(mt));
            SubLObject mt_$124 = (SubLObject)hl_supports.NIL;
            mt_$124 = cdolist_list_var.first();
            while (hl_supports.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$124, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$124 = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 89799L)
    public static SubLObject hl_verify_time_sentence(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject pred = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
        if (pred.eql(hl_supports.$const199$temporallySubsumes_TypeType)) {
            final SubLObject arg1 = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
            final SubLObject arg2 = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
            return hlmt_relevance.bigger_time_typeP(arg1, arg2);
        }
        if (pred.eql(hl_supports.$const200$temporallySubsumes_InsType)) {
            final SubLObject interval = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
            final SubLObject type = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
            return hlmt_relevance.time_interval_subsumes_typeP(interval, type);
        }
        if (pred.eql(hl_supports.$const201$duration)) {
            final SubLObject interval = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
            final SubLObject duration = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
            return time_interval_utilities.time_interval_durationP(interval, duration);
        }
        if (hl_supports.NIL != sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
            return sbhl_time_modules.hl_verify_sbhl_time(support);
        }
        return Errors.cerror((SubLObject)hl_supports.$str202$Continue_anyway_, (SubLObject)hl_supports.$str203$Unsupported_predicate___a__for__T, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 90907L)
    public static SubLObject hl_true_mts_for_time_sentence(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL != sbhl_time_utilities.sbhl_time_predicate_p(el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED))) {
            return sbhl_time_modules.hl_forward_mt_combos_sbhl_time(support);
        }
        return (SubLObject)ConsesLow.list(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 91540L)
    public static SubLObject hl_validate_time(final SubLObject support, final SubLObject validation_level) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            if (validation_level.eql((SubLObject)hl_supports.$kw81$NONE)) {
                return (SubLObject)hl_supports.T;
            }
            if (validation_level.eql((SubLObject)hl_supports.$kw82$MINIMAL)) {
                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
            }
            if (validation_level.eql((SubLObject)hl_supports.$kw83$ARG_TYPE)) {
                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
            }
            if (validation_level.eql((SubLObject)hl_supports.$kw84$ALL)) {
                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
            }
            Errors.error((SubLObject)hl_supports.$str85$Unexpected_intermediate_step_vali, validation_level);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 92055L)
    public static SubLObject hl_justify_time_sentence(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
            return (SubLObject)hl_supports.NIL;
        }
        final SubLObject pred = el_utilities.literal_predicate(literal, (SubLObject)hl_supports.UNPROVIDED);
        if (pred.eql(hl_supports.$const199$temporallySubsumes_TypeType)) {
            final SubLObject arg1 = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
            final SubLObject arg2 = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
            return removal_modules_type_temporal_subsumption.why_bigger_time_typeP(arg1, arg2);
        }
        if (pred.eql(hl_supports.$const200$temporallySubsumes_InsType)) {
            final SubLObject interval = el_utilities.literal_arg1(literal, (SubLObject)hl_supports.UNPROVIDED);
            final SubLObject type = el_utilities.literal_arg2(literal, (SubLObject)hl_supports.UNPROVIDED);
            return removal_modules_type_temporal_subsumption.why_time_interval_subsumes_typeP(interval, type);
        }
        if (pred.eql(hl_supports.$const201$duration)) {
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL != sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
            return sbhl_time_modules.hl_justify_sbhl_time(support);
        }
        return Errors.cerror((SubLObject)hl_supports.$str202$Continue_anyway_, (SubLObject)hl_supports.$str203$Unsupported_predicate___a__for__T, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 93265L)
    public static SubLObject hl_verify_cyclify(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_cyclifier.cyclify_verify_general(asent, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 93265L)
    public static SubLObject hl_justify_cyclify(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_cyclifier.cyclify_justify_general(asent, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 93902L)
    public static SubLObject hl_verify_nc_parse(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_ncr_constraints.nc_parse_verify_general(asent, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 93902L)
    public static SubLObject hl_justify_nc_parse(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_ncr_constraints.nc_parse_justify_general(asent, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 94602L)
    public static SubLObject hl_verify_candidate_nc_test(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_candidate_noun_compounds.candidate_nc_test_verify_general(asent, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 94602L)
    public static SubLObject hl_justify_candidate_nc_test(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_candidate_noun_compounds.candidate_nc_test_justify_general(asent, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 95329L)
    public static SubLObject hl_verify_asserted_arg1_binary_preds(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_asserted_arg1_binary_preds.asserted_arg1_binary_preds_verify_general(asent, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 95641L)
    public static SubLObject hl_justify_asserted_arg1_binary_preds(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return removal_modules_asserted_arg1_binary_preds.asserted_arg1_binary_preds_justify_general(asent, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 96336L)
    public static SubLObject hl_verify_shop_effect(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 96635L)
    public static SubLObject hl_justify_shop_effect(final SubLObject support) {
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 97224L)
    public static SubLObject hl_verify_query(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            SubLObject query_properties = conses_high.copy_list(hl_supports.$default_hl_verify_query_properties$.getDynamicValue(thread));
            SubLObject result = (SubLObject)hl_supports.NIL;
            if (hl_supports.NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, hl_supports.$const219$ist_Asserted)) {
                final SubLObject assertion = czer_meta.find_assertion_cycl(el_utilities.designated_sentence(asent), el_utilities.designated_mt(asent));
                if (hl_supports.NIL != assertion) {
                    result = (SubLObject)ConsesLow.list(assertion);
                }
            }
            else {
                thread.resetMultipleValues();
                final SubLObject right_sentence = czer_utilities.unwrap_if_ist(asent, mt, (SubLObject)hl_supports.T);
                final SubLObject right_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (hl_supports.NIL != el_utilities.el_implication_p(right_sentence)) {
                    query_properties = conses_high.putf(query_properties, (SubLObject)hl_supports.$kw220$CONDITIONAL_SENTENCE_, (SubLObject)hl_supports.T);
                }
                result = inference_kernel.new_cyc_query(right_sentence, right_mt, query_properties);
            }
            return list_utilities.sublisp_boolean(result);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 98012L)
    public static SubLObject hl_justify_query(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return hl_justify_query_int(asent, mt, (SubLObject)hl_supports.T);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 98375L)
    public static SubLObject hl_justify_query_int(final SubLObject sentence, final SubLObject mt, final SubLObject return_one_answerP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_properties = conses_high.copy_list(hl_supports.$default_hl_justify_query_properties$.getDynamicValue(thread));
        if (hl_supports.NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, hl_supports.$const219$ist_Asserted)) {
            final SubLObject assertion = czer_meta.find_assertion_cycl(el_utilities.designated_sentence(sentence), el_utilities.designated_mt(sentence));
            if (hl_supports.NIL != assertion) {
                return (SubLObject)ConsesLow.list(assertion);
            }
        }
        else {
            thread.resetMultipleValues();
            final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)hl_supports.T);
            final SubLObject right_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (hl_supports.NIL != return_one_answerP) {
                query_properties = conses_high.putf(query_properties, (SubLObject)hl_supports.$kw222$MAX_NUMBER, (SubLObject)hl_supports.ONE_INTEGER);
            }
            if (hl_supports.NIL != el_utilities.el_implication_p(right_sentence)) {
                query_properties = conses_high.putf(query_properties, (SubLObject)hl_supports.$kw220$CONDITIONAL_SENTENCE_, (SubLObject)hl_supports.T);
            }
            final SubLObject _prev_bind_0 = hl_supports.$within_hl_justify_queryP$.currentBinding(thread);
            try {
                hl_supports.$within_hl_justify_queryP$.bind((SubLObject)hl_supports.T, thread);
                final SubLObject result = inference_kernel.new_cyc_query(right_sentence, right_mt, query_properties);
                return (hl_supports.NIL != return_one_answerP) ? result.first() : result;
            }
            finally {
                hl_supports.$within_hl_justify_queryP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 99242L)
    public static SubLObject hl_forward_mt_combos_of_query(final SubLObject support) {
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject asent = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list116);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list116);
            return (SubLObject)hl_supports.NIL;
        }
        if (hl_supports.NIL != el_utilities.ist_sentence_p(asent, (SubLObject)hl_supports.T)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(hl_module, asent, hl_supports.$const26$BaseKB, tv));
        }
        SubLObject query_supports_list = hl_justify_query_int(asent, mt, (SubLObject)hl_supports.NIL);
        SubLObject mt_combos = (SubLObject)hl_supports.NIL;
        if (hl_supports.NIL != list_utilities.singletonP(query_supports_list) && hl_supports.NIL != list_utilities.singletonP(list_utilities.only_one(query_supports_list)) && support.equal(list_utilities.only_one(list_utilities.only_one(query_supports_list)))) {
            query_supports_list = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)hl_supports.$kw23$OPAQUE, asent, mt, tv)));
        }
        SubLObject cdolist_list_var = query_supports_list;
        SubLObject query_supports = (SubLObject)hl_supports.NIL;
        query_supports = cdolist_list_var.first();
        while (hl_supports.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$125;
            final SubLObject mt_support_combos = cdolist_list_var_$125 = forward.compute_all_mt_and_support_combinations(query_supports, (SubLObject)hl_supports.UNPROVIDED);
            SubLObject mt_support_combo = (SubLObject)hl_supports.NIL;
            mt_support_combo = cdolist_list_var_$125.first();
            while (hl_supports.NIL != cdolist_list_var_$125) {
                SubLObject current_$127;
                final SubLObject datum_$126 = current_$127 = mt_support_combo;
                SubLObject combo_mts = (SubLObject)hl_supports.NIL;
                SubLObject combo_supports = (SubLObject)hl_supports.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$127, datum_$126, (SubLObject)hl_supports.$list223);
                combo_mts = current_$127.first();
                current_$127 = current_$127.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$127, datum_$126, (SubLObject)hl_supports.$list223);
                combo_supports = current_$127.first();
                current_$127 = current_$127.rest();
                if (hl_supports.NIL == current_$127) {
                    SubLObject cdolist_list_var_$126 = combo_mts;
                    SubLObject combo_mt = (SubLObject)hl_supports.NIL;
                    combo_mt = cdolist_list_var_$126.first();
                    while (hl_supports.NIL != cdolist_list_var_$126) {
                        mt_combos = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(hl_module, asent, combo_mt, tv), mt_combos);
                        cdolist_list_var_$126 = cdolist_list_var_$126.rest();
                        combo_mt = cdolist_list_var_$126.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$126, (SubLObject)hl_supports.$list223);
                }
                cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                mt_support_combo = cdolist_list_var_$125.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_supports = cdolist_list_var.first();
        }
        return mt_combos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 100495L)
    public static SubLObject hl_verify_matrix_of_reaction_type(final SubLObject support) {
        Errors.warn((SubLObject)hl_supports.$str226$Halo_feature_not_supported__Suppo, support);
        return (SubLObject)hl_supports.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 101254L)
    public static SubLObject hl_justify_matrix_of_reaction_type(final SubLObject support) {
        SubLObject justification = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            justification = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)hl_supports.$kw23$OPAQUE, literal, mt, tv));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return justification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 102348L)
    public static SubLObject hl_forward_mt_combos_matrix_of_reaction_type(final SubLObject support) {
        Errors.warn((SubLObject)hl_supports.$str227$Halo_feature_not_supported__Suppo, support);
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            return (SubLObject)ConsesLow.list(mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        return (SubLObject)hl_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 103840L)
    public static SubLObject hl_verify_parse_tree_relation(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject verifiedP = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                verifiedP = list_utilities.sublisp_boolean(removal_modules_parse_trees.removal_parse_tree_relation_answer_list(literal));
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return verifiedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-supports.lisp", position = 104258L)
    public static SubLObject hl_justify_parse_tree_relation(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justification = (SubLObject)hl_supports.NIL;
        SubLObject hl_module = (SubLObject)hl_supports.NIL;
        SubLObject literal = (SubLObject)hl_supports.NIL;
        SubLObject mt = (SubLObject)hl_supports.NIL;
        SubLObject tv = (SubLObject)hl_supports.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)hl_supports.$list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)hl_supports.$list42);
        tv = current.first();
        current = current.rest();
        if (hl_supports.NIL == current) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                justification = removal_modules_parse_trees.parse_tree_relation_supports(literal);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)hl_supports.$list42);
        }
        return justification;
    }
    
    public static SubLObject declare_hl_supports_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_predicate_p", "HL-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "non_hl_predicate_p", "NON-HL-PREDICATE-P", 1, 0, false);
        new $non_hl_predicate_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "declare_hl_predicate", "DECLARE-HL-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "undeclare_hl_predicate", "UNDECLARE-HL-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_support_modules", "HL-SUPPORT-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_support_module_p", "HL-SUPPORT-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "setup_hl_support_module", "SETUP-HL-SUPPORT-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_support_module_verify_func", "HL-SUPPORT-MODULE-VERIFY-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_support_module_justify_func", "HL-SUPPORT-MODULE-JUSTIFY-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_support_module_validate_func", "HL-SUPPORT-MODULE-VALIDATE-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_support_module_forward_mt_combos_func", "HL-SUPPORT-MODULE-FORWARD-MT-COMBOS-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify", "HL-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify", "HL-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_expanded", "HL-JUSTIFY-EXPANDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justification_expand", "HL-JUSTIFICATION-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_support_justify", "HL-SUPPORT-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_trivial_justification", "HL-TRIVIAL-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "categorize_justification", "CATEGORIZE-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "supports_with_embedded_assertions", "SUPPORTS-WITH-EMBEDDED-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "supports_embedded_assertions", "SUPPORTS-EMBEDDED-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "support_embedded_assertions", "SUPPORT-EMBEDDED-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_validate", "HL-VALIDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_validate_wff_violations", "HL-VALIDATE-WFF-VIOLATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos", "HL-FORWARD-MT-COMBOS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_from_justification", "HL-FORWARD-MT-COMBOS-FROM-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "find_assertion_or_make_support", "FIND-ASSERTION-OR-MAKE-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "max_floor_mts_of_justification", "MAX-FLOOR-MTS-OF-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justification_complete_backward_theory", "HL-JUSTIFICATION-COMPLETE-BACKWARD-THEORY", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "assertion_all_supporting_asserted_gafs", "ASSERTION-ALL-SUPPORTING-ASSERTED-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_opaque", "HL-VERIFY-OPAQUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "opaque_hl_support_p", "OPAQUE-HL-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_bookkeeping", "HL-VERIFY-BOOKKEEPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_bookkeeping", "HL-JUSTIFY-BOOKKEEPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "clear_cached_find_assertion_cycl", "CLEAR-CACHED-FIND-ASSERTION-CYCL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "remove_cached_find_assertion_cycl", "REMOVE-CACHED-FIND-ASSERTION-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "cached_find_assertion_cycl_internal", "CACHED-FIND-ASSERTION-CYCL-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "cached_find_assertion_cycl", "CACHED-FIND-ASSERTION-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_bookkeeping", "HL-FORWARD-MT-COMBOS-BOOKKEEPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_defn", "HL-VERIFY-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_defn", "HL-JUSTIFY-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_defn", "HL-FORWARD-MT-COMBOS-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_elementof", "HL-VERIFY-ELEMENTOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_elementof", "HL-FORWARD-MT-COMBOS-ELEMENTOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_subsetof", "HL-VERIFY-SUBSETOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_subsetof", "HL-FORWARD-MT-COMBOS-SUBSETOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_sibling_disjoint", "HL-VERIFY-SIBLING-DISJOINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_sibling_disjoint", "HL-JUSTIFY-SIBLING-DISJOINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_sibling_disjoint", "HL-FORWARD-MT-COMBOS-SIBLING-DISJOINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_equality", "HL-VERIFY-EQUALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_equality", "HL-FORWARD-MT-COMBOS-EQUALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_validate_equality", "HL-VALIDATE-EQUALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_validate_default", "HL-VALIDATE-DEFAULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_validate_literal_minimal", "HL-VALIDATE-LITERAL-MINIMAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_equality", "HL-JUSTIFY-EQUALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_eval", "HL-VERIFY-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_eval", "HL-JUSTIFY-EVAL", 1, 0, false);
        new $hl_justify_eval$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_reflexive", "HL-VERIFY-REFLEXIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_reflexive", "HL-JUSTIFY-REFLEXIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_reflexive", "HL-FORWARD-MT-COMBOS-REFLEXIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "inference_semantically_valid_irreflexive_literalP", "INFERENCE-SEMANTICALLY-VALID-IRREFLEXIVE-LITERAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "max_floor_mts_where_reflexive", "MAX-FLOOR-MTS-WHERE-REFLEXIVE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "max_floor_mts_where_arg_constraints_met_internal", "MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "max_floor_mts_where_arg_constraints_met", "MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_validate_reflexive", "HL-VALIDATE-REFLEXIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_reflexive_on", "HL-VERIFY-REFLEXIVE-ON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_reflexive_on", "HL-JUSTIFY-REFLEXIVE-ON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_reflexive_on", "HL-FORWARD-MT-COMBOS-REFLEXIVE-ON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "max_floor_mts_where_reflexive_on", "MAX-FLOOR-MTS-WHERE-REFLEXIVE-ON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "transitivity_support_p", "TRANSITIVITY-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_transitivity", "HL-VERIFY-TRANSITIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_transitivity", "HL-FORWARD-MT-COMBOS-TRANSITIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_transitivity", "HL-JUSTIFY-TRANSITIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_contextual_transitivity", "HL-VERIFY-CONTEXTUAL-TRANSITIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_contextual_transitivity", "HL-JUSTIFY-CONTEXTUAL-TRANSITIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "max_floor_mts_of_transitivity_paths", "MAX-FLOOR-MTS-OF-TRANSITIVITY-PATHS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_tva", "HL-VERIFY-TVA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_tva", "HL-JUSTIFY-TVA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_tva", "HL-FORWARD-MT-COMBOS-TVA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_rtv", "HL-VERIFY-RTV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_rtv", "HL-JUSTIFY-RTV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_rtv", "HL-FORWARD-MT-COMBOS-RTV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_minimize", "HL-VERIFY-MINIMIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_consistent", "HL-VERIFY-CONSISTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_consistent", "HL-JUSTIFY-CONSISTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_conceptually_related", "HL-VERIFY-CONCEPTUALLY-RELATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_conceptually_related", "HL-JUSTIFY-CONCEPTUALLY-RELATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_conceptually_related", "HL-FORWARD-MT-COMBOS-CONCEPTUALLY-RELATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_admit", "HL-VERIFY-ADMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_admit", "HL-FORWARD-MT-COMBOS-ADMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_admit", "HL-JUSTIFY-ADMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_admitted_argument", "HL-VERIFY-ADMITTED-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_admitted_sentence", "HL-VERIFY-ADMITTED-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_admitted_nat", "HL-VERIFY-ADMITTED-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_admitted_argument", "HL-FORWARD-MT-COMBOS-ADMITTED-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_admitted_sentence", "HL-FORWARD-MT-COMBOS-ADMITTED-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_admitted_nat", "HL-FORWARD-MT-COMBOS-ADMITTED-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_admitted_argument", "HL-JUSTIFY-ADMITTED-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_admitted_sentence", "HL-JUSTIFY-ADMITTED-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_admitted_nat", "HL-JUSTIFY-ADMITTED-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_sksi", "HL-VERIFY-SKSI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_sksi", "HL-JUSTIFY-SKSI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_sksi", "HL-FORWARD-MT-COMBOS-SKSI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_csql", "HL-VERIFY-CSQL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_csql", "HL-JUSTIFY-CSQL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_csql", "HL-FORWARD-MT-COMBOS-CSQL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_source_schema_object_fn", "HL-VERIFY-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_source_schema_object_fn", "HL-JUSTIFY-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_source_schema_object_fn", "HL-FORWARD-MT-COMBOS-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_reformulate", "HL-JUSTIFY-REFORMULATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_assertion", "HL-JUSTIFY-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_assertion", "HL-VERIFY-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_assertion", "HL-FORWARD-MT-COMBOS-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_gaf", "HL-JUSTIFY-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_gaf", "HL-VERIFY-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_gaf", "HL-FORWARD-MT-COMBOS-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_mentions", "HL-JUSTIFY-MENTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_mentions", "HL-VERIFY-MENTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_mentions", "HL-FORWARD-MT-COMBOS-MENTIONS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_supports", "possibly_with_negated_truth", "POSSIBLY-WITH-NEGATED-TRUTH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_sbhl", "HL-JUSTIFY-SBHL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_sbhl_optimal", "HL-JUSTIFY-SBHL-OPTIMAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_sbhl_optimal_int", "HL-JUSTIFY-SBHL-OPTIMAL-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_isa", "HL-VERIFY-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_isa", "HL-JUSTIFY-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "clear_hl_forward_mt_combos_isa", "CLEAR-HL-FORWARD-MT-COMBOS-ISA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "remove_hl_forward_mt_combos_isa", "REMOVE-HL-FORWARD-MT-COMBOS-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_isa_internal", "HL-FORWARD-MT-COMBOS-ISA-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_isa", "HL-FORWARD-MT-COMBOS-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "justify_not_type_by_extent_known", "JUSTIFY-NOT-TYPE-BY-EXTENT-KNOWN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "inference_max_floor_mts_of_isa_paths", "INFERENCE-MAX-FLOOR-MTS-OF-ISA-PATHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "inference_max_floor_mts_of_quoted_isa_paths", "INFERENCE-MAX-FLOOR-MTS-OF-QUOTED-ISA-PATHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "gaf_axioms", "GAF-AXIOMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "gaf_axioms_genl_mts", "GAF-AXIOMS-GENL-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "symmetric_hl_predP", "SYMMETRIC-HL-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_incompatible_mts", "HL-VERIFY-INCOMPATIBLE-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_incompatible_mts", "HL-JUSTIFY-INCOMPATIBLE-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_genls", "HL-VERIFY-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_genls", "HL-JUSTIFY-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_genls", "HL-FORWARD-MT-COMBOS-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "inference_max_floor_mts_of_genls_paths", "INFERENCE-MAX-FLOOR-MTS-OF-GENLS-PATHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_disjointwith", "HL-VERIFY-DISJOINTWITH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_disjointwith", "HL-JUSTIFY-DISJOINTWITH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_disjointwith", "HL-FORWARD-MT-COMBOS-DISJOINTWITH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_genlmt", "HL-VERIFY-GENLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_genlmt", "HL-JUSTIFY-GENLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_genlmt", "HL-FORWARD-MT-COMBOS-GENLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_genlpreds", "HL-VERIFY-GENLPREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_genlpreds", "HL-JUSTIFY-GENLPREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_genlpreds", "HL-FORWARD-MT-COMBOS-GENLPREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_negationpreds", "HL-VERIFY-NEGATIONPREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_negationpreds", "HL-JUSTIFY-NEGATIONPREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_negationpreds", "HL-FORWARD-MT-COMBOS-NEGATIONPREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_time_sentence", "HL-VERIFY-TIME-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_true_mts_for_time_sentence", "HL-TRUE-MTS-FOR-TIME-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_validate_time", "HL-VALIDATE-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_time_sentence", "HL-JUSTIFY-TIME-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_cyclify", "HL-VERIFY-CYCLIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_cyclify", "HL-JUSTIFY-CYCLIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_nc_parse", "HL-VERIFY-NC-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_nc_parse", "HL-JUSTIFY-NC-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_candidate_nc_test", "HL-VERIFY-CANDIDATE-NC-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_candidate_nc_test", "HL-JUSTIFY-CANDIDATE-NC-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_asserted_arg1_binary_preds", "HL-VERIFY-ASSERTED-ARG1-BINARY-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_asserted_arg1_binary_preds", "HL-JUSTIFY-ASSERTED-ARG1-BINARY-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_shop_effect", "HL-VERIFY-SHOP-EFFECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_shop_effect", "HL-JUSTIFY-SHOP-EFFECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_query", "HL-VERIFY-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_query", "HL-JUSTIFY-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_query_int", "HL-JUSTIFY-QUERY-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_of_query", "HL-FORWARD-MT-COMBOS-OF-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_matrix_of_reaction_type", "HL-VERIFY-MATRIX-OF-REACTION-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_matrix_of_reaction_type", "HL-JUSTIFY-MATRIX-OF-REACTION-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_forward_mt_combos_matrix_of_reaction_type", "HL-FORWARD-MT-COMBOS-MATRIX-OF-REACTION-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_verify_parse_tree_relation", "HL-VERIFY-PARSE-TREE-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_supports", "hl_justify_parse_tree_relation", "HL-JUSTIFY-PARSE-TREE-RELATION", 1, 0, false);
        return (SubLObject)hl_supports.NIL;
    }
    
    public static SubLObject init_hl_supports_file() {
        hl_supports.$hl_predicates$ = SubLFiles.deflexical("*HL-PREDICATES*", (SubLObject)hl_supports.$list0);
        hl_supports.$hl_support_modules$ = SubLFiles.deflexical("*HL-SUPPORT-MODULES*", (SubLObject)((hl_supports.NIL != Symbols.boundp((SubLObject)hl_supports.$sym2$_HL_SUPPORT_MODULES_)) ? hl_supports.$hl_support_modules$.getGlobalValue() : hl_supports.NIL));
        hl_supports.$hl_support_module_plist_indicators$ = SubLFiles.defparameter("*HL-SUPPORT-MODULE-PLIST-INDICATORS*", (SubLObject)hl_supports.$list3);
        hl_supports.$hl_forward_mt_combos_max_recursion_depth$ = SubLFiles.defparameter("*HL-FORWARD-MT-COMBOS-MAX-RECURSION-DEPTH*", (SubLObject)hl_supports.FIVE_INTEGER);
        hl_supports.$debug_null_hl_forward_mt_combosP$ = SubLFiles.defparameter("*DEBUG-NULL-HL-FORWARD-MT-COMBOS?*", (SubLObject)hl_supports.NIL);
        hl_supports.$perform_opaque_support_verification$ = SubLFiles.defparameter("*PERFORM-OPAQUE-SUPPORT-VERIFICATION*", (SubLObject)hl_supports.NIL);
        hl_supports.$bookkeeping_justification_assertion_mt$ = SubLFiles.deflexical("*BOOKKEEPING-JUSTIFICATION-ASSERTION-MT*", (hl_supports.NIL != Symbols.boundp((SubLObject)hl_supports.$sym56$_BOOKKEEPING_JUSTIFICATION_ASSERTION_MT_)) ? hl_supports.$bookkeeping_justification_assertion_mt$.getGlobalValue() : hl_supports.$const26$BaseKB);
        hl_supports.$cached_find_assertion_cycl_caching_state$ = SubLFiles.deflexical("*CACHED-FIND-ASSERTION-CYCL-CACHING-STATE*", (SubLObject)hl_supports.NIL);
        hl_supports.$hl_forward_mt_combos_isa_caching_state$ = SubLFiles.deflexical("*HL-FORWARD-MT-COMBOS-ISA-CACHING-STATE*", (SubLObject)hl_supports.NIL);
        hl_supports.$default_hl_verify_query_properties$ = SubLFiles.defparameter("*DEFAULT-HL-VERIFY-QUERY-PROPERTIES*", (SubLObject)hl_supports.$list218);
        hl_supports.$default_hl_justify_query_properties$ = SubLFiles.defparameter("*DEFAULT-HL-JUSTIFY-QUERY-PROPERTIES*", (SubLObject)hl_supports.$list221);
        hl_supports.$within_hl_justify_queryP$ = SubLFiles.defparameter("*WITHIN-HL-JUSTIFY-QUERY?*", (SubLObject)hl_supports.NIL);
        return (SubLObject)hl_supports.NIL;
    }
    
    public static SubLObject setup_hl_supports_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)hl_supports.$sym2$_HL_SUPPORT_MODULES_);
        utilities_macros.register_cyc_api_function((SubLObject)hl_supports.$sym4$HL_SUPPORT_MODULE_P, (SubLObject)hl_supports.$list5, (SubLObject)hl_supports.$str6$Return_T_iff_OBJECT_is_an_HL_supp, (SubLObject)hl_supports.NIL, (SubLObject)hl_supports.$list7);
        setup_hl_support_module((SubLObject)hl_supports.$kw33$CODE, (SubLObject)hl_supports.$list41);
        setup_hl_support_module((SubLObject)hl_supports.$kw23$OPAQUE, (SubLObject)hl_supports.$list43);
        setup_hl_support_module((SubLObject)hl_supports.$kw44$ABDUCTION, (SubLObject)hl_supports.$list41);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_supports.$sym56$_BOOKKEEPING_JUSTIFICATION_ASSERTION_MT_);
        mt_vars.note_mt_var((SubLObject)hl_supports.$sym56$_BOOKKEEPING_JUSTIFICATION_ASSERTION_MT_, (SubLObject)hl_supports.NIL);
        memoization_state.note_globally_cached_function((SubLObject)hl_supports.$sym57$CACHED_FIND_ASSERTION_CYCL);
        setup_hl_support_module((SubLObject)hl_supports.$kw59$BOOKKEEPING, (SubLObject)hl_supports.$list60);
        setup_hl_support_module((SubLObject)hl_supports.$kw64$DEFN, (SubLObject)hl_supports.$list65);
        setup_hl_support_module((SubLObject)hl_supports.$kw67$ELEMENTOF, (SubLObject)hl_supports.$list68);
        setup_hl_support_module((SubLObject)hl_supports.$kw71$SUBSETOF, (SubLObject)hl_supports.$list72);
        setup_hl_support_module((SubLObject)hl_supports.$kw77$SIBLING_DISJOINT, (SubLObject)hl_supports.$list78);
        setup_hl_support_module((SubLObject)hl_supports.$kw86$EQUALITY, (SubLObject)hl_supports.$list87);
        setup_hl_support_module((SubLObject)hl_supports.$kw53$EVAL, (SubLObject)hl_supports.$list89);
        memoization_state.note_memoized_function((SubLObject)hl_supports.$sym97$MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET);
        setup_hl_support_module((SubLObject)hl_supports.$kw98$REFLEXIVE, (SubLObject)hl_supports.$list99);
        setup_hl_support_module((SubLObject)hl_supports.$kw108$REFLEXIVE_ON, (SubLObject)hl_supports.$list109);
        setup_hl_support_module((SubLObject)hl_supports.$kw110$TRANSITIVITY, (SubLObject)hl_supports.$list111);
        setup_hl_support_module((SubLObject)hl_supports.$kw112$CONTEXTUAL_TRANSITIVITY, (SubLObject)hl_supports.$list113);
        setup_hl_support_module((SubLObject)hl_supports.$kw117$TVA, (SubLObject)hl_supports.$list118);
        setup_hl_support_module((SubLObject)hl_supports.$kw120$RTV, (SubLObject)hl_supports.$list121);
        setup_hl_support_module((SubLObject)hl_supports.$kw124$MINIMIZE, (SubLObject)hl_supports.$list125);
        setup_hl_support_module((SubLObject)hl_supports.$kw126$CONSISTENT, (SubLObject)hl_supports.$list127);
        setup_hl_support_module((SubLObject)hl_supports.$kw128$CONCEPTUALLY_RELATED, (SubLObject)hl_supports.$list129);
        setup_hl_support_module((SubLObject)hl_supports.$kw96$ADMIT, (SubLObject)hl_supports.$list132);
        setup_hl_support_module((SubLObject)hl_supports.$kw135$SKSI, (SubLObject)hl_supports.$list136);
        setup_hl_support_module((SubLObject)hl_supports.$kw137$CSQL, (SubLObject)hl_supports.$list138);
        setup_hl_support_module((SubLObject)hl_supports.$kw139$SOURCE_SCHEMA_OBJECT_FN, (SubLObject)hl_supports.$list140);
        setup_hl_support_module((SubLObject)hl_supports.$kw141$REFORMULATE, (SubLObject)hl_supports.$list142);
        setup_hl_support_module(arguments.$assertion_support_module$.getGlobalValue(), (SubLObject)hl_supports.$list143);
        setup_hl_support_module((SubLObject)hl_supports.$kw105$GAF, (SubLObject)hl_supports.$list145);
        setup_hl_support_module((SubLObject)hl_supports.$kw24$MENTIONS, (SubLObject)hl_supports.$list150);
        setup_hl_support_module((SubLObject)hl_supports.$kw152$EXTERNAL, (SubLObject)hl_supports.NIL);
        setup_hl_support_module((SubLObject)hl_supports.$kw153$EXTERNAL_EVAL, (SubLObject)hl_supports.NIL);
        memoization_state.note_globally_cached_function((SubLObject)hl_supports.$sym168$HL_FORWARD_MT_COMBOS_ISA);
        setup_hl_support_module((SubLObject)hl_supports.$kw95$ISA, (SubLObject)hl_supports.$list173);
        setup_hl_support_module((SubLObject)hl_supports.$kw177$INCOMPATIBLEMT, (SubLObject)hl_supports.$list178);
        setup_hl_support_module((SubLObject)hl_supports.$kw181$GENLS, (SubLObject)hl_supports.$list182);
        setup_hl_support_module((SubLObject)hl_supports.$kw186$DISJOINTWITH, (SubLObject)hl_supports.$list187);
        setup_hl_support_module((SubLObject)hl_supports.$kw188$GENLMT, (SubLObject)hl_supports.$list189);
        setup_hl_support_module((SubLObject)hl_supports.$kw193$GENLPREDS, (SubLObject)hl_supports.$list194);
        setup_hl_support_module((SubLObject)hl_supports.$kw197$NEGATIONPREDS, (SubLObject)hl_supports.$list198);
        setup_hl_support_module((SubLObject)hl_supports.$kw204$TIME, (SubLObject)hl_supports.$list205);
        setup_hl_support_module((SubLObject)hl_supports.$kw206$CYCLIFY, (SubLObject)hl_supports.$list207);
        setup_hl_support_module((SubLObject)hl_supports.$kw208$NC_PARSE, (SubLObject)hl_supports.$list209);
        setup_hl_support_module((SubLObject)hl_supports.$kw210$CANDIDATE_NC_TESTS, (SubLObject)hl_supports.$list211);
        setup_hl_support_module((SubLObject)hl_supports.$kw212$ASSERTED_ARG1_BINARY_PREDS, (SubLObject)hl_supports.$list213);
        setup_hl_support_module((SubLObject)hl_supports.$kw214$FCP, (SubLObject)hl_supports.$list215);
        setup_hl_support_module((SubLObject)hl_supports.$kw216$SHOP_EFFECT, (SubLObject)hl_supports.$list217);
        setup_hl_support_module((SubLObject)hl_supports.$kw224$QUERY, (SubLObject)hl_supports.$list225);
        setup_hl_support_module((SubLObject)hl_supports.$kw228$MATRIX_OF_REACTION_TYPE, (SubLObject)hl_supports.$list229);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_supports.$sym230$HL_VERIFY_PARSE_TREE_RELATION);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_supports.$sym231$HL_JUSTIFY_PARSE_TREE_RELATION);
        setup_hl_support_module((SubLObject)hl_supports.$kw232$PARSE_TREE, (SubLObject)hl_supports.$list233);
        setup_hl_support_module((SubLObject)hl_supports.$kw234$WORD_STRINGS, (SubLObject)hl_supports.$list235);
        setup_hl_support_module((SubLObject)hl_supports.$kw236$TERM_PHRASES, (SubLObject)hl_supports.$list237);
        setup_hl_support_module((SubLObject)hl_supports.$kw238$RKF_IRRELEVANT_FORT_CACHE, (SubLObject)hl_supports.$list239);
        return (SubLObject)hl_supports.NIL;
    }
    
    public void declareFunctions() {
        declare_hl_supports_file();
    }
    
    public void initializeVariables() {
        init_hl_supports_file();
    }
    
    public void runTopLevelForms() {
        setup_hl_supports_file();
    }
    
    static {
        me = (SubLFile)new hl_supports();
        hl_supports.$hl_predicates$ = null;
        hl_supports.$hl_support_modules$ = null;
        hl_supports.$hl_support_module_plist_indicators$ = null;
        hl_supports.$hl_forward_mt_combos_max_recursion_depth$ = null;
        hl_supports.$debug_null_hl_forward_mt_combosP$ = null;
        hl_supports.$perform_opaque_support_verification$ = null;
        hl_supports.$bookkeeping_justification_assertion_mt$ = null;
        hl_supports.$cached_find_assertion_cycl_caching_state$ = null;
        hl_supports.$hl_forward_mt_combos_isa_caching_state$ = null;
        hl_supports.$default_hl_verify_query_properties$ = null;
        hl_supports.$default_hl_justify_query_properties$ = null;
        hl_supports.$within_hl_justify_queryP$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("differentSymbols")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("incompatibleMt")) });
        $sym1$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym2$_HL_SUPPORT_MODULES_ = SubLObjectFactory.makeSymbol("*HL-SUPPORT-MODULES*");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDATE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"));
        $sym4$HL_SUPPORT_MODULE_P = SubLObjectFactory.makeSymbol("HL-SUPPORT-MODULE-P");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str6$Return_T_iff_OBJECT_is_an_HL_supp = SubLObjectFactory.makeString("Return T iff OBJECT is an HL support module.");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym8$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $str9$_S_was_not_a_valid_hl_support_mod = SubLObjectFactory.makeString("~S was not a valid hl-support-module indicator");
        $kw10$VERIFY = SubLObjectFactory.makeKeyword("VERIFY");
        $kw11$JUSTIFY = SubLObjectFactory.makeKeyword("JUSTIFY");
        $kw12$VALIDATE = SubLObjectFactory.makeKeyword("VALIDATE");
        $kw13$FORWARD_MT_COMBOS = SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS");
        $sym14$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym15$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $sym16$HL_JUSTIFICATION_P = SubLObjectFactory.makeSymbol("HL-JUSTIFICATION-P");
        $sym17$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym18$HL_SUPPORT_P = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $sym19$FORT_BEING_REMOVED_ = SubLObjectFactory.makeSymbol("FORT-BEING-REMOVED?");
        $kw20$HL_SUPPORT_JUSTIFY = SubLObjectFactory.makeKeyword("HL-SUPPORT-JUSTIFY");
        $sym21$VALID_SUPPORT_ = SubLObjectFactory.makeSymbol("VALID-SUPPORT?");
        $str22$Throwing_out_HL_justification__S_ = SubLObjectFactory.makeString("Throwing out HL justification ~S~%  with invalid support ~S");
        $kw23$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw24$MENTIONS = SubLObjectFactory.makeKeyword("MENTIONS");
        $const25$assertionExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionExists"));
        $const26$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $str27$Adding__S_to_supports_list_from__ = SubLObjectFactory.makeString("Adding ~S to supports list from ~S");
        $sym28$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str29$null_mt_combos_from__hl_forward_m = SubLObjectFactory.makeString("null mt-combos from (hl-forward-mt-combos ~S) but mts found from justification ~S");
        $str30$bad_mt_combos_from__hl_forward_mt = SubLObjectFactory.makeString("bad mt-combos from (hl-forward-mt-combos ~S)");
        $sym31$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $const32$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw33$CODE = SubLObjectFactory.makeKeyword("CODE");
        $sym34$HL_SUPPORT_MT = SubLObjectFactory.makeSymbol("HL-SUPPORT-MT");
        $sym35$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym36$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $sym37$ASSERTED_ASSERTION_ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $sym38$TERM_OF_UNIT_ASSERTION_P = SubLObjectFactory.makeSymbol("TERM-OF-UNIT-ASSERTION-P");
        $sym39$_ = SubLObjectFactory.makeSymbol("<");
        $sym40$ASSERTION_DEPENDENT_COUNT = SubLObjectFactory.makeSymbol("ASSERTION-DEPENDENT-COUNT");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-OPAQUE"));
        $kw44$ABDUCTION = SubLObjectFactory.makeKeyword("ABDUCTION");
        $kw45$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw46$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw47$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $const48$myCreator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator"));
        $const49$myCreationPurpose = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose"));
        $const50$myCreationTime = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime"));
        $const51$myCreationSecond = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationSecond"));
        $const52$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $kw53$EVAL = SubLObjectFactory.makeKeyword("EVAL");
        $const54$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $const55$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $sym56$_BOOKKEEPING_JUSTIFICATION_ASSERTION_MT_ = SubLObjectFactory.makeSymbol("*BOOKKEEPING-JUSTIFICATION-ASSERTION-MT*");
        $sym57$CACHED_FIND_ASSERTION_CYCL = SubLObjectFactory.makeSymbol("CACHED-FIND-ASSERTION-CYCL");
        $sym58$_CACHED_FIND_ASSERTION_CYCL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-FIND-ASSERTION-CYCL-CACHING-STATE*");
        $kw59$BOOKKEEPING = SubLObjectFactory.makeKeyword("BOOKKEEPING");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-BOOKKEEPING"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-BOOKKEEPING"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-BOOKKEEPING"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"));
        $const62$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $list63 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")));
        $kw64$DEFN = SubLObjectFactory.makeKeyword("DEFN");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-DEFN"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-DEFN"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-DEFN"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("THESET"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")));
        $kw67$ELEMENTOF = SubLObjectFactory.makeKeyword("ELEMENTOF");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-ELEMENTOF"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-ELEMENTOF"));
        $const69$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $const70$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $kw71$SUBSETOF = SubLObjectFactory.makeKeyword("SUBSETOF");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-SUBSETOF"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-SUBSETOF"));
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL1"), (SubLObject)SubLObjectFactory.makeSymbol("COL2"));
        $kw74$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $const75$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $const76$False_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False-JustificationTruth"));
        $kw77$SIBLING_DISJOINT = SubLObjectFactory.makeKeyword("SIBLING-DISJOINT");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-SIBLING-DISJOINT"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-SIBLING-DISJOINT"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-SIBLING-DISJOINT"));
        $const79$equalSymbols = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols"));
        $const80$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw81$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw82$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $kw83$ARG_TYPE = SubLObjectFactory.makeKeyword("ARG-TYPE");
        $kw84$ALL = SubLObjectFactory.makeKeyword("ALL");
        $str85$Unexpected_intermediate_step_vali = SubLObjectFactory.makeString("Unexpected intermediate step validation level ~s");
        $kw86$EQUALITY = SubLObjectFactory.makeKeyword("EQUALITY");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-EQUALITY"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-EQUALITY"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDATE"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VALIDATE-EQUALITY"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-EQUALITY"));
        $const88$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-EVAL"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-EVAL"));
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $const91$IrreflexiveBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IrreflexiveBinaryPredicate"));
        $const92$ReflexiveBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate"));
        $const93$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const94$admittedArgument = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedArgument"));
        $kw95$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw96$ADMIT = SubLObjectFactory.makeKeyword("ADMIT");
        $sym97$MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET = SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET");
        $kw98$REFLEXIVE = SubLObjectFactory.makeKeyword("REFLEXIVE");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-REFLEXIVE"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-REFLEXIVE"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDATE"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VALIDATE-REFLEXIVE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-REFLEXIVE"));
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $sym102$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const103$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const104$reflexiveOn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reflexiveOn"));
        $kw105$GAF = SubLObjectFactory.makeKeyword("GAF");
        $list106 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("REFLEX-MT"), (SubLObject)SubLObjectFactory.makeSymbol("COL"));
        $sym107$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $kw108$REFLEXIVE_ON = SubLObjectFactory.makeKeyword("REFLEXIVE-ON");
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-REFLEXIVE-ON"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-REFLEXIVE-ON"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-REFLEXIVE-ON"));
        $kw110$TRANSITIVITY = SubLObjectFactory.makeKeyword("TRANSITIVITY");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-TRANSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-TRANSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-TRANSITIVITY"));
        $kw112$CONTEXTUAL_TRANSITIVITY = SubLObjectFactory.makeKeyword("CONTEXTUAL-TRANSITIVITY");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-CONTEXTUAL-TRANSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-TRANSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-CONTEXTUAL-TRANSITIVITY"));
        $kw114$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $sym115$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $kw117$TVA = SubLObjectFactory.makeKeyword("TVA");
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-TVA"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-TVA"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-TVA"));
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $kw120$RTV = SubLObjectFactory.makeKeyword("RTV");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-RTV"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-RTV"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-RTV"));
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $const123$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $kw124$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-MINIMIZE"));
        $kw126$CONSISTENT = SubLObjectFactory.makeKeyword("CONSISTENT");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-CONSISTENT"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-CONSISTENT"));
        $kw128$CONCEPTUALLY_RELATED = SubLObjectFactory.makeKeyword("CONCEPTUALLY-RELATED");
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-CONCEPTUALLY-RELATED"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-CONCEPTUALLY-RELATED"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-CONCEPTUALLY-RELATED"));
        $const130$admittedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedSentence"));
        $const131$admittedNAT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedNAT"));
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-ADMIT"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-ADMIT"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-ADMIT"));
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION"));
        $kw134$STRICT = SubLObjectFactory.makeKeyword("STRICT");
        $kw135$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-SKSI"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-SKSI"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-SKSI"));
        $kw137$CSQL = SubLObjectFactory.makeKeyword("CSQL");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-CSQL"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-CSQL"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-CSQL"));
        $kw139$SOURCE_SCHEMA_OBJECT_FN = SubLObjectFactory.makeKeyword("SOURCE-SCHEMA-OBJECT-FN");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-SOURCE-SCHEMA-OBJECT-FN"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-SOURCE-SCHEMA-OBJECT-FN"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-SOURCE-SCHEMA-OBJECT-FN"));
        $kw141$REFORMULATE = SubLObjectFactory.makeKeyword("REFORMULATE");
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-REFORMULATE"));
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-ASSERTION"));
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-GAF"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-GAF"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-GAF"));
        $const146$gafPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gafPredicate"));
        $const147$gafArgument = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gafArgument"));
        $str148$Unexpected_predicate___S = SubLObjectFactory.makeString("Unexpected predicate: ~S");
        $sym149$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $list150 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-MENTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-MENTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-MENTIONS"));
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $kw152$EXTERNAL = SubLObjectFactory.makeKeyword("EXTERNAL");
        $kw153$EXTERNAL_EVAL = SubLObjectFactory.makeKeyword("EXTERNAL-EVAL");
        $list154 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("TV")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym155$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym156$EL_NEGATION_P = SubLObjectFactory.makeSymbol("EL-NEGATION-P");
        $sym157$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym158$FORMULA_ARG1 = SubLObjectFactory.makeSymbol("FORMULA-ARG1");
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REGULARIZE"));
        $sym160$INVERSE_TV = SubLObjectFactory.makeSymbol("INVERSE-TV");
        $sym161$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $kw162$REGULARIZE = SubLObjectFactory.makeKeyword("REGULARIZE");
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeKeyword("GENLS"));
        $kw164$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $const165$nearestIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa"));
        $const166$nearestIsaOfType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsaOfType"));
        $const167$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $sym168$HL_FORWARD_MT_COMBOS_ISA = SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-ISA");
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("ARG3"));
        $sym170$_HL_FORWARD_MT_COMBOS_ISA_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*HL-FORWARD-MT-COMBOS-ISA-CACHING-STATE*");
        $int171$1024 = SubLObjectFactory.makeInteger(1024);
        $sym172$CLEAR_HL_FORWARD_MT_COMBOS_ISA = SubLObjectFactory.makeSymbol("CLEAR-HL-FORWARD-MT-COMBOS-ISA");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-ISA"));
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $list175 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")));
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT1"), (SubLObject)SubLObjectFactory.makeSymbol("MT2"));
        $kw177$INCOMPATIBLEMT = SubLObjectFactory.makeKeyword("INCOMPATIBLEMT");
        $list178 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-INCOMPATIBLE-MTS"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-INCOMPATIBLE-MTS"));
        $const179$nearestGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls"));
        $const180$nearestGenlsOfType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlsOfType"));
        $kw181$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-GENLS"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-GENLS"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-GENLS"));
        $const183$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const184$instancesOfDisjointCollections = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instancesOfDisjointCollections"));
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM1"), (SubLObject)SubLObjectFactory.makeSymbol("TERM2"));
        $kw186$DISJOINTWITH = SubLObjectFactory.makeKeyword("DISJOINTWITH");
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-DISJOINTWITH"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-DISJOINTWITH"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-DISJOINTWITH"));
        $kw188$GENLMT = SubLObjectFactory.makeKeyword("GENLMT");
        $list189 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-GENLMT"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-GENLMT"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-GENLMT"));
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"));
        $const191$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const192$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $kw193$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-GENLPREDS"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-GENLPREDS"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-GENLPREDS"));
        $const195$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $const196$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $kw197$NEGATIONPREDS = SubLObjectFactory.makeKeyword("NEGATIONPREDS");
        $list198 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-NEGATIONPREDS"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-NEGATIONPREDS"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-NEGATIONPREDS"));
        $const199$temporallySubsumes_TypeType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType"));
        $const200$temporallySubsumes_InsType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType"));
        $const201$duration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration"));
        $str202$Continue_anyway_ = SubLObjectFactory.makeString("Continue anyway.");
        $str203$Unsupported_predicate___a__for__T = SubLObjectFactory.makeString("Unsupported predicate, ~a, for :TIME module");
        $kw204$TIME = SubLObjectFactory.makeKeyword("TIME");
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-TIME-SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TRUE-MTS-FOR-TIME-SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDATE"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VALIDATE-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-TIME-SENTENCE"));
        $kw206$CYCLIFY = SubLObjectFactory.makeKeyword("CYCLIFY");
        $list207 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-CYCLIFY"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-CYCLIFY"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)hl_supports.NIL);
        $kw208$NC_PARSE = SubLObjectFactory.makeKeyword("NC-PARSE");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-NC-PARSE"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-NC-PARSE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)hl_supports.NIL);
        $kw210$CANDIDATE_NC_TESTS = SubLObjectFactory.makeKeyword("CANDIDATE-NC-TESTS");
        $list211 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-CANDIDATE-NC-TEST"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-CANDIDATE-NC-TEST"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)hl_supports.NIL);
        $kw212$ASSERTED_ARG1_BINARY_PREDS = SubLObjectFactory.makeKeyword("ASSERTED-ARG1-BINARY-PREDS");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-ASSERTED-ARG1-BINARY-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-ASSERTED-ARG1-BINARY-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)hl_supports.NIL);
        $kw214$FCP = SubLObjectFactory.makeKeyword("FCP");
        $list215 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-FCP-VERIFY"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-FCP-JUSTIFY"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)hl_supports.NIL);
        $kw216$SHOP_EFFECT = SubLObjectFactory.makeKeyword("SHOP-EFFECT");
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-SHOP-EFFECT"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-SHOP-EFFECT"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)hl_supports.NIL);
        $list218 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)hl_supports.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"));
        $const219$ist_Asserted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $kw220$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $list221 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS"), (SubLObject)SubLObjectFactory.makeKeyword("PROOF"));
        $kw222$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $list223 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMBO-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("COMBO-SUPPORTS"));
        $kw224$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $list225 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-OF-QUERY"));
        $str226$Halo_feature_not_supported__Suppo = SubLObjectFactory.makeString("Halo feature not supported. Support unverifiable: ~a~%");
        $str227$Halo_feature_not_supported__Suppo = SubLObjectFactory.makeString("Halo feature not supported. Support-mts not computable: ~a~%");
        $kw228$MATRIX_OF_REACTION_TYPE = SubLObjectFactory.makeKeyword("MATRIX-OF-REACTION-TYPE");
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-MATRIX-OF-REACTION-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-MATRIX-OF-REACTION-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-MATRIX-OF-REACTION-TYPE"));
        $sym230$HL_VERIFY_PARSE_TREE_RELATION = SubLObjectFactory.makeSymbol("HL-VERIFY-PARSE-TREE-RELATION");
        $sym231$HL_JUSTIFY_PARSE_TREE_RELATION = SubLObjectFactory.makeSymbol("HL-JUSTIFY-PARSE-TREE-RELATION");
        $kw232$PARSE_TREE = SubLObjectFactory.makeKeyword("PARSE-TREE");
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-PARSE-TREE-RELATION"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-PARSE-TREE-RELATION"));
        $kw234$WORD_STRINGS = SubLObjectFactory.makeKeyword("WORD-STRINGS");
        $list235 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-WORD-STRINGS"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-WORD-STRINGS"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-WORD-STRINGS"));
        $kw236$TERM_PHRASES = SubLObjectFactory.makeKeyword("TERM-PHRASES");
        $list237 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-TERM-PHRASES"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-TERM-PHRASES"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-TERM-PHRASES"));
        $kw238$RKF_IRRELEVANT_FORT_CACHE = SubLObjectFactory.makeKeyword("RKF-IRRELEVANT-FORT-CACHE");
        $list239 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-RKF-IRRELEVANT-FORT-CACHE"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-RKF-IRRELEVANT-FORT-CACHE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-RKF-IRRELEVANT-FORT-CACHE"));
    }
    
    public static final class $non_hl_predicate_p$UnaryFunction extends UnaryFunction
    {
        public $non_hl_predicate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NON-HL-PREDICATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return hl_supports.non_hl_predicate_p(arg1);
        }
    }
    
    public static final class $hl_justify_eval$UnaryFunction extends UnaryFunction
    {
        public $hl_justify_eval$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-JUSTIFY-EVAL"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return hl_supports.hl_justify_eval(arg1);
        }
    }
}

/*

	Total time: 1590 ms
	
*/