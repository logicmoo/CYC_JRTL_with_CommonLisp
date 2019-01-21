package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kbs_identification extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kbs_identification";
    public static final String myFingerPrint = "8a0f9c03d910b8b988851c59b3cd6859ab9f0a69684f917cbfc0442dd9906689";
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 1214L)
    private static SubLSymbol $kbs_raw_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 1435L)
    private static SubLSymbol $kbs_raw_constants_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 1581L)
    private static SubLSymbol $kbs_raw_constants_omission_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 1762L)
    private static SubLSymbol $kbs_definitional_constant_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 11696L)
    private static SubLSymbol $kbs_kbq_query_set_terms_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 11959L)
    private static SubLSymbol $kbs_skolems$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 14697L)
    private static SubLSymbol $kbs_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 14832L)
    private static SubLSymbol $kbs_constant_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 15932L)
    private static SubLSymbol $kbs_narts$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 18495L)
    private static SubLSymbol $kbs_forts$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 18608L)
    private static SubLSymbol $kbs_fort_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 23445L)
    private static SubLSymbol $kbs_ordered_definitional_predicate_sets$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 23801L)
    private static SubLSymbol $kbs_definitional_predicate_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 25887L)
    private static SubLSymbol $kbs_definitional_rule_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 27230L)
    private static SubLSymbol $kbs_assertion_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 35150L)
    private static SubLSymbol $kbs_deduction_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 37279L)
    private static SubLSymbol $kbs_fort_state_validP$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 37566L)
    private static SubLSymbol $kbs_state_validP$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 37769L)
    public static SubLSymbol $default_kbs_kappa_query_settings$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 38082L)
    public static SubLSymbol $kbs_kappa_query_settings$;
    private static final SubLSymbol $kw0$ISA;
    private static final SubLObject $const1$quotedIsa;
    private static final SubLObject $const2$InferencePSC;
    private static final SubLString $str3$Even_though_explicitly_included_v;
    private static final SubLObject $const4$isa;
    private static final SubLString $str5$The_constant_is_also_excluded_bec;
    private static final SubLObject $const6$not;
    private static final SubLSymbol $sym7$NON_KBS_RAW_CONSTANT_P;
    private static final SubLSymbol $sym8$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const9$EverythingPSC;
    private static final SubLInteger $int10$1000;
    private static final SubLSymbol $kw11$BREADTH;
    private static final SubLSymbol $kw12$QUEUE;
    private static final SubLSymbol $kw13$STACK;
    private static final SubLSymbol $sym14$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw15$ERROR;
    private static final SubLString $str16$_A_is_not_a__A;
    private static final SubLSymbol $sym17$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw18$CERROR;
    private static final SubLString $str19$continue_anyway;
    private static final SubLSymbol $kw20$WARN;
    private static final SubLString $str21$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str22$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str23$attempting_to_bind_direction_link;
    private static final SubLList $list24;
    private static final SubLString $str25$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym26$CONSTANT_P;
    private static final SubLString $str27$mapping_Cyc_constants;
    private static final SubLSymbol $sym28$STRINGP;
    private static final SubLSymbol $kw29$SKIP;
    private static final SubLObject $const30$CycLConstant;
    private static final SubLSymbol $kw31$GAF;
    private static final SubLString $str32$Overriding_constant__A_omission__;
    private static final SubLObject $const33$kbsProfileRetainTerm;
    private static final SubLObject $const34$kbsProfileRemoveFORT;
    private static final SubLString $str35$___S_constants_included_via_the_c;
    private static final SubLString $str36$___S_constants_omitted_via_the__A;
    private static final SubLString $str37$collections_;
    private static final SubLString $str38$;
    private static final SubLString $str39$_predicate_;
    private static final SubLString $str40$___S_total_constants_included___;
    private static final SubLString $str41$___S_total_constants_omitted___;
    private static final SubLString $str42$__Omitted_constants__;
    private static final SubLString $str43$_A_;
    private static final SubLString $str44$__;
    private static final SubLString $str45$____S_total_raw_KBS_constants_ide;
    private static final SubLSymbol $sym46$KBS_KBQ_QUERY_SET_TERMS;
    private static final SubLObject $const47$TheSetOf;
    private static final SubLSymbol $sym48$_Q;
    private static final SubLObject $const49$thereExists;
    private static final SubLSymbol $sym50$_T;
    private static final SubLObject $const51$and;
    private static final SubLList $list52;
    private static final SubLInteger $int53$300;
    private static final SubLSymbol $sym54$_KBS_KBQ_QUERY_SET_TERMS_CACHING_STATE_;
    private static final SubLString $str55$Continue;
    private static final SubLString $str56$compute_kbs_skolems_requirements_;
    private static final SubLObject $const57$SkolemFunction;
    private static final SubLString $str58$Computing_KBS_skolems;
    private static final SubLString $str59$cdolist;
    private static final SubLString $str60$____S_total_KBS_skolems_identifie;
    private static final SubLSymbol $sym61$KBS_SKOLEM_ASSERTION_FAST_FAIL_CONSTANT_P;
    private static final SubLString $str62$akb;
    private static final SubLObject $const63$TKBTerm_Proprietary;
    private static final SubLObject $const64$ProprietaryTerm;
    private static final SubLString $str65$cyfi;
    private static final SubLObject $const66$Cy_FiProprietaryTerm;
    private static final SubLObject $const67$ResearchCycConstant;
    private static final SubLObject $const68$ScaffoldingConstant;
    private static final SubLObject $const69$TerroristAgent;
    private static final SubLObject $const70$TerroristAct;
    private static final SubLObject $const71$HostileSocialAction;
    private static final SubLString $str72$research;
    private static final SubLSymbol $sym73$NON_KBS_CONSTANT_P;
    private static final SubLString $str74$Computing_KBS_narts;
    private static final SubLString $str75$____S_total_KBS_NARTs_identified_;
    private static final SubLString $str76$All_KB_subset_requirements_met_;
    private static final SubLString $str77$Also__the_following_GAFs_will_be_;
    private static final SubLSymbol $kw78$OPAQUE;
    private static final SubLSymbol $sym79$NON_KBS_FORT_P;
    private static final SubLString $str80$The_term_contains_terms_not_in_th;
    private static final SubLSymbol $sym81$KBS_DEFINITIONAL_FORT_P;
    private static final SubLSymbol $sym82$NULL;
    private static final SubLSymbol $sym83$KBS_DEFINITIONAL_FORT_PREDICATE_SETS;
    private static final SubLSymbol $sym84$FORT_P;
    private static final SubLSymbol $sym85$KBS_DEFINITIONAL_PREDICATE_SET_;
    private static final SubLSymbol $sym86$KBS_DEFINITIONAL_PREDICATE_SET_P;
    private static final SubLString $str87$The_assertion_s_microtheory_is_no;
    private static final SubLString $str88$The_assertion_was_explicitly_omit;
    private static final SubLString $str89$The_assertion_s_formula_contains_;
    private static final SubLString $str90$The_assertion_is_definitional_bec;
    private static final SubLString $str91$__The_predicate_is_definitional_;
    private static final SubLString $str92$__The_predicate_is_not_definition;
    private static final SubLString $str93$__But_the_assertion_contains_defi;
    private static final SubLString $str94$The_assertion_is_a_rule_containin;
    private static final SubLString $str95$Computing_KBS_assertions;
    private static final SubLSymbol $sym96$COMPUTE_NON_KBS_ASSERTION_P;
    private static final SubLString $str97$Computing_KBS_deductions;
    private static final SubLSymbol $sym98$KBS_RAW_CONSTANT_OMITTED_P;
    private static final SubLList $list99;
    private static final SubLString $str100$Preremoving_;
    private static final SubLString $str101$_assertions;
    private static final SubLString $str102$Only_unary_KAPPA_predicates_suppo;
    private static final SubLString $str103$Identifying_;
    private static final SubLString $str104$_PREREMOVED_ASSERTIONS_specificat;
    private static final SubLString $str105$Applying__PREREMOVED_ASSERTIONS_s;
    private static final SubLString $str106$_assertions_indentified_by_Kappa_;
    private static final SubLString $str107$Finished_applying__A___;
    private static final SubLString $str108$Invalid_pre_removal_specification;
    private static final SubLString $str109$Killing__A_assertion_for_KB_subse;
    private static final SubLString $str110$an;
    private static final SubLString $str111$prerun__Calling__A__;
    private static final SubLString $str112$post_kbs_forts__Calling__A___;
    private static final SubLString $str113$POST_KBS_FORTS__Unmark_NARTs_that;
    private static final SubLSymbol $sym114$ASSERTION_P;
    private static final SubLString $str115$__Unmarking_NART__A_with_formula_;
    private static final SubLString $str116$__No_NARTs_had_to_be_unmarked___;
    private static final SubLString $str117$___A_NARTs_with_HL_assertions_as_;
    private static final SubLString $str118$post_kbs_assertions__Calling__A__;
    private static final SubLString $str119$_kbs_raw_constants__is_null_;
    private static final SubLString $str120$_kbs_raw_constants_table__is_null;
    private static final SubLString $str121$_kbs_raw_constants_omission_table;
    private static final SubLString $str122$_kbs_skolems__is_null_;
    private static final SubLString $str123$_kbs_constants__is_null_;
    private static final SubLString $str124$_kbs_constant_table__is_null_;
    private static final SubLString $str125$_kbs_narts__is_null_;
    private static final SubLString $str126$_kbs_forts__is_null_;
    private static final SubLString $str127$_kbs_fort_table__is_null_;
    private static final SubLString $str128$_kbs_definitional_constant_table_;
    private static final SubLString $str129$_kbs_definitional_predicate_table;
    private static final SubLString $str130$_kbs_assertion_table__is_null_;
    private static final SubLString $str131$_kbs_deduction_table__is_null_;
    private static final SubLString $str132$______KB__S_KBS_statistics__;
    private static final SubLString $str133$__FORTs___________7___D__;
    private static final SubLString $str134$___Constants______7___D__;
    private static final SubLString $str135$_____def_only_____7___D__;
    private static final SubLString $str136$___NARTs__________7___D__;
    private static final SubLString $str137$__Assertions______7___D__;
    private static final SubLString $str138$__Deductions______7___D__;
    private static final SubLSymbol $sym139$ISA_MT_;
    private static final SubLString $str140$No_valid_KBS_available_;
    private static final SubLSymbol $kw141$MT;
    private static final SubLSymbol $kw142$BROAD_MT;
    private static final SubLString $str143$do_broad_mt_index;
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 1914L)
    public static SubLObject kbs_raw_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbs_identification.$kbs_raw_constants$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 2051L)
    public static SubLObject kbs_raw_constant_p(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL != constant_handles.constant_p(constant) && kbs_identification.NIL != Hashtables.gethash(constant, kbs_identification.$kbs_raw_constants_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 2187L)
    public static SubLObject why_kbs_raw_constantP(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kbs_identification.NIL;
        if (kbs_identification.NIL != kbs_raw_constant_p(constant)) {
            SubLObject cdolist_list_var;
            final SubLObject inclusion_cols = cdolist_list_var = Hashtables.gethash(constant, kbs_identification.$kbs_raw_constants_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED);
            SubLObject inclusion_col = (SubLObject)kbs_identification.NIL;
            inclusion_col = cdolist_list_var.first();
            while (kbs_identification.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)kbs_identification.$kw0$ISA, el_utilities.make_binary_formula(kbs_identification.$const1$quotedIsa, constant, inclusion_col), kbs_identification.$const2$InferencePSC, (SubLObject)kbs_identification.UNPROVIDED), result);
                cdolist_list_var = cdolist_list_var.rest();
                inclusion_col = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 2560L)
    public static SubLObject non_kbs_raw_constant_p(final SubLObject constant) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL != constant_handles.constant_p(constant) && kbs_identification.NIL == kbs_raw_constant_p(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 2692L)
    public static SubLObject why_non_kbs_raw_constantP(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)kbs_identification.NIL;
        if (kbs_identification.NIL != non_kbs_raw_constant_p(constant)) {
            SubLObject cdolist_list_var;
            final SubLObject inclusion_exclusion_cols_list = cdolist_list_var = Hashtables.gethash(constant, kbs_identification.$kbs_raw_constants_omission_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED);
            SubLObject inclusion_exclusion_cols = (SubLObject)kbs_identification.NIL;
            inclusion_exclusion_cols = cdolist_list_var.first();
            while (kbs_identification.NIL != cdolist_list_var) {
                final SubLObject inclusion_cols = inclusion_exclusion_cols.first();
                final SubLObject exclusion_cols = conses_high.second(inclusion_exclusion_cols);
                supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str3$Even_though_explicitly_included_v, supports);
                SubLObject cdolist_list_var_$1 = inclusion_cols;
                SubLObject inclusion_col = (SubLObject)kbs_identification.NIL;
                inclusion_col = cdolist_list_var_$1.first();
                while (kbs_identification.NIL != cdolist_list_var_$1) {
                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)kbs_identification.$kw0$ISA, el_utilities.make_binary_formula(kbs_identification.$const4$isa, constant, inclusion_col), kbs_identification.$const2$InferencePSC, (SubLObject)kbs_identification.UNPROVIDED), supports);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    inclusion_col = cdolist_list_var_$1.first();
                }
                supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str5$The_constant_is_also_excluded_bec, supports);
                SubLObject cdolist_list_var_$2 = exclusion_cols;
                SubLObject exclusion_col = (SubLObject)kbs_identification.NIL;
                exclusion_col = cdolist_list_var_$2.first();
                while (kbs_identification.NIL != cdolist_list_var_$2) {
                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)kbs_identification.$kw0$ISA, el_utilities.make_binary_formula(kbs_identification.$const4$isa, constant, exclusion_col), kbs_identification.$const2$InferencePSC, (SubLObject)kbs_identification.UNPROVIDED), supports);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    exclusion_col = cdolist_list_var_$2.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                inclusion_exclusion_cols = cdolist_list_var.first();
            }
        }
        if (kbs_identification.NIL == supports) {
            SubLObject cdolist_list_var2 = kbs_utilities.get_kbs_sections();
            SubLObject kbs_section = (SubLObject)kbs_identification.NIL;
            kbs_section = cdolist_list_var2.first();
            while (kbs_identification.NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$3 = kbs_utilities.get_kbs_section_collections(kbs_section);
                SubLObject inclusion_col2 = (SubLObject)kbs_identification.NIL;
                inclusion_col2 = cdolist_list_var_$3.first();
                while (kbs_identification.NIL != cdolist_list_var_$3) {
                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)kbs_identification.$kw0$ISA, el_utilities.make_unary_formula(kbs_identification.$const6$not, el_utilities.make_binary_formula(kbs_identification.$const4$isa, constant, inclusion_col2)), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED), supports);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    inclusion_col2 = cdolist_list_var_$3.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                kbs_section = cdolist_list_var2.first();
            }
        }
        return Sequences.nreverse(supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 3836L)
    public static SubLObject kbs_raw_constant_omitted_p(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.NIL != kbs_identification.$kbs_raw_constants_omission_table$.getDynamicValue(thread)) {
            return Hashtables.gethash(v_term, kbs_identification.$kbs_raw_constants_omission_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 3993L)
    public static SubLObject kbs_raw_el_formula_p(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == non_kbs_raw_el_formula_p(formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 4092L)
    public static SubLObject non_kbs_raw_el_formula_p(final SubLObject formula) {
        return list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym7$NON_KBS_RAW_CONSTANT_P), formula, (SubLObject)kbs_identification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 4201L)
    public static SubLObject reset_kbs_raw_constant_tables() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_identification.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbs_identification.$const9$EverythingPSC, thread);
            SubLObject inclusion_size = (SubLObject)kbs_identification.ZERO_INTEGER;
            SubLObject omission_size = (SubLObject)kbs_identification.ZERO_INTEGER;
            SubLObject cdolist_list_var = kbs_utilities.get_kbs_sections();
            SubLObject kbs_section = (SubLObject)kbs_identification.NIL;
            kbs_section = cdolist_list_var.first();
            while (kbs_identification.NIL != cdolist_list_var) {
                final SubLObject collections = kbs_utilities.get_kbs_section_collections(kbs_section);
                final SubLObject omission_predicate = kbs_utilities.get_kbs_section_omission_predicate(kbs_section);
                final SubLObject omission_collections = kbs_utilities.get_kbs_section_omission_collections(kbs_section);
                SubLObject cdolist_list_var_$4 = collections;
                SubLObject collection = (SubLObject)kbs_identification.NIL;
                collection = cdolist_list_var_$4.first();
                while (kbs_identification.NIL != cdolist_list_var_$4) {
                    inclusion_size = Numbers.add(inclusion_size, cardinality_estimates.instance_cardinality(collection));
                    inclusion_size = Numbers.add(inclusion_size, cardinality_estimates.quoted_instance_cardinality(collection));
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    collection = cdolist_list_var_$4.first();
                }
                if (kbs_identification.NIL != fort_types_interface.predicateP(omission_predicate)) {
                    omission_size = Numbers.add(omission_size, kb_indexing.num_predicate_extent_index(omission_predicate, (SubLObject)kbs_identification.UNPROVIDED));
                }
                SubLObject cdolist_list_var_$5 = omission_collections;
                SubLObject omission_collection = (SubLObject)kbs_identification.NIL;
                omission_collection = cdolist_list_var_$5.first();
                while (kbs_identification.NIL != cdolist_list_var_$5) {
                    omission_size = Numbers.add(omission_size, cardinality_estimates.instance_cardinality(omission_collection));
                    omission_size = Numbers.add(omission_size, cardinality_estimates.quoted_instance_cardinality(omission_collection));
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    omission_collection = cdolist_list_var_$5.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                kbs_section = cdolist_list_var.first();
            }
            kbs_identification.$kbs_raw_constants_table$.setDynamicValue(Hashtables.make_hash_table(inclusion_size, Symbols.symbol_function((SubLObject)kbs_identification.EQ), (SubLObject)kbs_identification.UNPROVIDED), thread);
            kbs_identification.$kbs_definitional_constant_table$.setDynamicValue(Hashtables.make_hash_table(inclusion_size, Symbols.symbol_function((SubLObject)kbs_identification.EQ), (SubLObject)kbs_identification.UNPROVIDED), thread);
            kbs_identification.$kbs_raw_constants_omission_table$.setDynamicValue(Hashtables.make_hash_table(omission_size, Symbols.symbol_function((SubLObject)kbs_identification.EQ), (SubLObject)kbs_identification.UNPROVIDED), thread);
            kbs_identification.$kbs_raw_constants$.setDynamicValue((SubLObject)kbs_identification.NIL, thread);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 5424L)
    public static SubLObject compute_kbs_raw_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_kbs_raw_constant_tables();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_identification.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbs_identification.$const9$EverythingPSC, thread);
            SubLObject cdolist_list_var = kbs_utilities.get_kbs_sections();
            SubLObject kbs_section = (SubLObject)kbs_identification.NIL;
            kbs_section = cdolist_list_var.first();
            while (kbs_identification.NIL != cdolist_list_var) {
                final SubLObject inclusion_collections = kbs_utilities.get_kbs_section_collections(kbs_section);
                final SubLObject inclusion_sets = kbs_utilities.get_kbs_section_sets(kbs_section);
                final SubLObject omission_collections = kbs_utilities.get_kbs_section_omission_collections(kbs_section);
                final SubLObject omission_predicate = kbs_utilities.get_kbs_section_omission_predicate(kbs_section);
                final SubLObject definitional_predicate_set = kbs_utilities.get_kbs_section_definitional_predicate_set(kbs_section);
                final SubLObject kbq_query_sets = kbs_utilities.get_kbs_section_kbq_query_sets(kbs_section);
                final SubLObject retained_terms = kbs_utilities.get_kbs_section_retained_terms(kbs_section);
                final SubLObject omission_terms = kbs_utilities.get_kbs_section_omission_terms(kbs_section);
                final SubLObject inclusion_constants_hash = Hashtables.make_hash_table((SubLObject)kbs_identification.$int10$1000, Symbols.symbol_function((SubLObject)kbs_identification.EQ), (SubLObject)kbs_identification.UNPROVIDED);
                final SubLObject omission_constants_hash = Hashtables.make_hash_table((SubLObject)kbs_identification.$int10$1000, Symbols.symbol_function((SubLObject)kbs_identification.EQ), (SubLObject)kbs_identification.UNPROVIDED);
                SubLObject inclusion_count = (SubLObject)kbs_identification.ZERO_INTEGER;
                SubLObject omission_count = (SubLObject)kbs_identification.ZERO_INTEGER;
                if (kbs_identification.NIL != list_utilities.non_empty_list_p(inclusion_collections)) {
                    SubLObject cdolist_list_var_$6 = inclusion_collections;
                    SubLObject inclusion_collection = (SubLObject)kbs_identification.NIL;
                    inclusion_collection = cdolist_list_var_$6.first();
                    while (kbs_identification.NIL != cdolist_list_var_$6) {
                        final SubLObject node_var = inclusion_collection;
                        final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$8 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa), thread);
                            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                SubLObject node_var_$9 = node_var;
                                final SubLObject deck_type = (SubLObject)kbs_identification.$kw13$STACK;
                                final SubLObject recur_deck = deck.create_deck(deck_type);
                                final SubLObject _prev_bind_0_$8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject tv_var = (SubLObject)kbs_identification.NIL;
                                        final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_tv$.bind((kbs_identification.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kbs_identification.NIL != tv_var) ? kbs_identification.$sym14$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                            if (kbs_identification.NIL != tv_var && kbs_identification.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kbs_identification.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                if (pcase_var.eql((SubLObject)kbs_identification.$kw15$ERROR)) {
                                                    sbhl_paranoia.sbhl_error((SubLObject)kbs_identification.ONE_INTEGER, (SubLObject)kbs_identification.$str16$_A_is_not_a__A, tv_var, (SubLObject)kbs_identification.$sym17$SBHL_TRUE_TV_P, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                                }
                                                else if (pcase_var.eql((SubLObject)kbs_identification.$kw18$CERROR)) {
                                                    sbhl_paranoia.sbhl_cerror((SubLObject)kbs_identification.ONE_INTEGER, (SubLObject)kbs_identification.$str19$continue_anyway, (SubLObject)kbs_identification.$str16$_A_is_not_a__A, tv_var, (SubLObject)kbs_identification.$sym17$SBHL_TRUE_TV_P, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                                }
                                                else if (pcase_var.eql((SubLObject)kbs_identification.$kw20$WARN)) {
                                                    Errors.warn((SubLObject)kbs_identification.$str16$_A_is_not_a__A, tv_var, (SubLObject)kbs_identification.$sym17$SBHL_TRUE_TV_P);
                                                }
                                                else {
                                                    Errors.warn((SubLObject)kbs_identification.$str21$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror((SubLObject)kbs_identification.$str19$continue_anyway, (SubLObject)kbs_identification.$str16$_A_is_not_a__A, tv_var, (SubLObject)kbs_identification.$sym17$SBHL_TRUE_TV_P);
                                                }
                                            }
                                            final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)), thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa))), thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_identification.NIL, thread);
                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)), thread);
                                                if (kbs_identification.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kbs_identification.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED))) {
                                                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$11 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa))), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_identification.NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$9, (SubLObject)kbs_identification.UNPROVIDED);
                                                        while (kbs_identification.NIL != node_var_$9) {
                                                            final SubLObject tt_node_var = node_var_$9;
                                                            SubLObject cdolist_list_var_$7;
                                                            final SubLObject accessible_modules = cdolist_list_var_$7 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa));
                                                            SubLObject module_var = (SubLObject)kbs_identification.NIL;
                                                            module_var = cdolist_list_var_$7.first();
                                                            while (kbs_identification.NIL != cdolist_list_var_$7) {
                                                                final SubLObject _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_identification.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_identification.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                    if (kbs_identification.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED));
                                                                        if (kbs_identification.NIL != d_link) {
                                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED));
                                                                            if (kbs_identification.NIL != mt_links) {
                                                                                SubLObject iteration_state;
                                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_identification.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbs_identification.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                        final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                            SubLObject iteration_state_$22;
                                                                                            for (iteration_state_$22 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_identification.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$22); iteration_state_$22 = dictionary_contents.do_dictionary_contents_next(iteration_state_$22)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$22);
                                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (kbs_identification.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                    final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        final SubLObject sol = link_nodes;
                                                                                                        if (kbs_identification.NIL != set.set_p(sol)) {
                                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                            SubLObject basis_object;
                                                                                                            SubLObject state;
                                                                                                            SubLObject constant;
                                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_identification.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_identification.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                constant = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                if (kbs_identification.NIL != set_contents.do_set_contents_element_validP(state, constant) && kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    if (kbs_identification.NIL != forts.fort_p(constant) && kbs_identification.NIL != constant_handles.constant_p(constant)) {
                                                                                                                        hash_table_utilities.pushnew_hash(constant, inclusion_collection, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if (sol.isList()) {
                                                                                                            SubLObject csome_list_var = sol;
                                                                                                            SubLObject constant2 = (SubLObject)kbs_identification.NIL;
                                                                                                            constant2 = csome_list_var.first();
                                                                                                            while (kbs_identification.NIL != csome_list_var) {
                                                                                                                if (kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    if (kbs_identification.NIL != forts.fort_p(constant2) && kbs_identification.NIL != constant_handles.constant_p(constant2)) {
                                                                                                                        hash_table_utilities.pushnew_hash(constant2, inclusion_collection, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                constant2 = csome_list_var.first();
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            Errors.error((SubLObject)kbs_identification.$str22$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$14, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$22);
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$13, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        }
                                                                        else {
                                                                            sbhl_paranoia.sbhl_error((SubLObject)kbs_identification.FIVE_INTEGER, (SubLObject)kbs_identification.$str23$attempting_to_bind_direction_link, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                                                        }
                                                                        if (kbs_identification.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED))) {
                                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                            SubLObject instance_tuple = (SubLObject)kbs_identification.NIL;
                                                                            instance_tuple = csome_list_var2.first();
                                                                            while (kbs_identification.NIL != csome_list_var2) {
                                                                                SubLObject current;
                                                                                final SubLObject datum = current = instance_tuple;
                                                                                SubLObject link_node = (SubLObject)kbs_identification.NIL;
                                                                                SubLObject mt2 = (SubLObject)kbs_identification.NIL;
                                                                                SubLObject tv2 = (SubLObject)kbs_identification.NIL;
                                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_identification.$list24);
                                                                                link_node = current.first();
                                                                                current = current.rest();
                                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_identification.$list24);
                                                                                mt2 = current.first();
                                                                                current = current.rest();
                                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_identification.$list24);
                                                                                tv2 = current.first();
                                                                                current = current.rest();
                                                                                if (kbs_identification.NIL == current) {
                                                                                    if (kbs_identification.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                        final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                            if (kbs_identification.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                    final SubLObject sol;
                                                                                                    final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                                    if (kbs_identification.NIL != set.set_p(sol)) {
                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                        SubLObject basis_object;
                                                                                                        SubLObject state;
                                                                                                        SubLObject constant;
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_identification.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_identification.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            constant = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if (kbs_identification.NIL != set_contents.do_set_contents_element_validP(state, constant) && kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (kbs_identification.NIL != forts.fort_p(constant) && kbs_identification.NIL != constant_handles.constant_p(constant)) {
                                                                                                                    hash_table_utilities.pushnew_hash(constant, inclusion_collection, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (sol.isList()) {
                                                                                                        SubLObject csome_list_var_$26 = sol;
                                                                                                        SubLObject constant2 = (SubLObject)kbs_identification.NIL;
                                                                                                        constant2 = csome_list_var_$26.first();
                                                                                                        while (kbs_identification.NIL != csome_list_var_$26) {
                                                                                                            if (kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (kbs_identification.NIL != forts.fort_p(constant2) && kbs_identification.NIL != constant_handles.constant_p(constant2)) {
                                                                                                                    hash_table_utilities.pushnew_hash(constant2, inclusion_collection, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$26 = csome_list_var_$26.rest();
                                                                                                            constant2 = csome_list_var_$26.first();
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)kbs_identification.$str22$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$16, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$15, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbs_identification.$list24);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                instance_tuple = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (kbs_identification.NIL != obsolete.cnat_p(node, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                        SubLObject cdolist_list_var_$8;
                                                                        final SubLObject new_list = cdolist_list_var_$8 = ((kbs_identification.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED)));
                                                                        SubLObject generating_fn = (SubLObject)kbs_identification.NIL;
                                                                        generating_fn = cdolist_list_var_$8.first();
                                                                        while (kbs_identification.NIL != cdolist_list_var_$8) {
                                                                            final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                final SubLObject sol2;
                                                                                final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                                if (kbs_identification.NIL != set.set_p(sol2)) {
                                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                    SubLObject basis_object2;
                                                                                    SubLObject state2;
                                                                                    SubLObject constant3;
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kbs_identification.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kbs_identification.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        constant3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if (kbs_identification.NIL != set_contents.do_set_contents_element_validP(state2, constant3) && kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(constant3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (kbs_identification.NIL != forts.fort_p(constant3) && kbs_identification.NIL != constant_handles.constant_p(constant3)) {
                                                                                                hash_table_utilities.pushnew_hash(constant3, inclusion_collection, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (sol2.isList()) {
                                                                                    SubLObject csome_list_var3 = sol2;
                                                                                    SubLObject constant4 = (SubLObject)kbs_identification.NIL;
                                                                                    constant4 = csome_list_var3.first();
                                                                                    while (kbs_identification.NIL != csome_list_var3) {
                                                                                        if (kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(constant4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (kbs_identification.NIL != forts.fort_p(constant4) && kbs_identification.NIL != constant_handles.constant_p(constant4)) {
                                                                                                hash_table_utilities.pushnew_hash(constant4, inclusion_collection, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        constant4 = csome_list_var3.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)kbs_identification.$str22$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$17, thread);
                                                                            }
                                                                            cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                                                                            generating_fn = cdolist_list_var_$8.first();
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$12, thread);
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$12, thread);
                                                                }
                                                                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                                                module_var = cdolist_list_var_$7.first();
                                                            }
                                                            SubLObject cdolist_list_var_$9;
                                                            final SubLObject accessible_modules2 = cdolist_list_var_$9 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)));
                                                            SubLObject module_var2 = (SubLObject)kbs_identification.NIL;
                                                            module_var2 = cdolist_list_var_$9.first();
                                                            while (kbs_identification.NIL != cdolist_list_var_$9) {
                                                                final SubLObject _prev_bind_0_$18 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_identification.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_identification.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$9);
                                                                    if (kbs_identification.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED));
                                                                        if (kbs_identification.NIL != d_link2) {
                                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED));
                                                                            if (kbs_identification.NIL != mt_links2) {
                                                                                SubLObject iteration_state2;
                                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kbs_identification.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbs_identification.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                        final SubLObject _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                            SubLObject iteration_state_$23;
                                                                                            for (iteration_state_$23 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kbs_identification.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$23); iteration_state_$23 = dictionary_contents.do_dictionary_contents_next(iteration_state_$23)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$23);
                                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (kbs_identification.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                    final SubLObject _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                                        if (kbs_identification.NIL != set.set_p(sol3)) {
                                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                            SubLObject basis_object3;
                                                                                                            SubLObject state3;
                                                                                                            SubLObject node_vars_link_node;
                                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)kbs_identification.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); kbs_identification.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                                if (kbs_identification.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if (sol3.isList()) {
                                                                                                            SubLObject csome_list_var4 = sol3;
                                                                                                            SubLObject node_vars_link_node2 = (SubLObject)kbs_identification.NIL;
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                            while (kbs_identification.NIL != csome_list_var4) {
                                                                                                                if (kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            Errors.error((SubLObject)kbs_identification.$str22$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$20, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$23);
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$19, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                            }
                                                                        }
                                                                        else {
                                                                            sbhl_paranoia.sbhl_error((SubLObject)kbs_identification.FIVE_INTEGER, (SubLObject)kbs_identification.$str23$attempting_to_bind_direction_link, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                                                        }
                                                                    }
                                                                    else if (kbs_identification.NIL != obsolete.cnat_p(node2, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                        SubLObject cdolist_list_var_$10;
                                                                        final SubLObject new_list2 = cdolist_list_var_$10 = ((kbs_identification.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED)));
                                                                        SubLObject generating_fn2 = (SubLObject)kbs_identification.NIL;
                                                                        generating_fn2 = cdolist_list_var_$10.first();
                                                                        while (kbs_identification.NIL != cdolist_list_var_$10) {
                                                                            final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                                final SubLObject sol4;
                                                                                final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                                if (kbs_identification.NIL != set.set_p(sol4)) {
                                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                    SubLObject basis_object4;
                                                                                    SubLObject state4;
                                                                                    SubLObject node_vars_link_node3;
                                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)kbs_identification.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); kbs_identification.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                        if (kbs_identification.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (sol4.isList()) {
                                                                                    SubLObject csome_list_var5 = sol4;
                                                                                    SubLObject node_vars_link_node4 = (SubLObject)kbs_identification.NIL;
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                    while (kbs_identification.NIL != csome_list_var5) {
                                                                                        if (kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)kbs_identification.$str22$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$21, thread);
                                                                            }
                                                                            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                                                                            generating_fn2 = cdolist_list_var_$10.first();
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$18, thread);
                                                                }
                                                                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                                                                module_var2 = cdolist_list_var_$9.first();
                                                            }
                                                            node_var_$9 = deck.deck_pop(recur_deck);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$17, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$11, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$11, thread);
                                                    }
                                                }
                                                else {
                                                    sbhl_paranoia.sbhl_warn((SubLObject)kbs_identification.TWO_INTEGER, (SubLObject)kbs_identification.$str25$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED)), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                                }
                                            }
                                            finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$10, thread);
                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$10, thread);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$9, thread);
                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$8, thread);
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                        }
                        SubLObject cdolist_list_var_$11 = kbs_utilities.all_quoted_instances_enhanced(inclusion_collection, (SubLObject)kbs_identification.NIL);
                        SubLObject constant5 = (SubLObject)kbs_identification.NIL;
                        constant5 = cdolist_list_var_$11.first();
                        while (kbs_identification.NIL != cdolist_list_var_$11) {
                            if (kbs_identification.NIL != constant_handles.constant_p(constant5)) {
                                hash_table_utilities.pushnew_hash(constant5, inclusion_collection, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                            }
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            constant5 = cdolist_list_var_$11.first();
                        }
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        inclusion_collection = cdolist_list_var_$6.first();
                    }
                }
                else if (kbs_identification.NIL != list_utilities.non_empty_list_p(inclusion_sets)) {
                    SubLObject cdolist_list_var_$12 = inclusion_sets;
                    SubLObject inclusion_set = (SubLObject)kbs_identification.NIL;
                    inclusion_set = cdolist_list_var_$12.first();
                    while (kbs_identification.NIL != cdolist_list_var_$12) {
                        final SubLObject set_contents_var5 = set.do_set_internal(inclusion_set);
                        SubLObject basis_object5;
                        SubLObject state5;
                        SubLObject constant6;
                        for (basis_object5 = set_contents.do_set_contents_basis_object(set_contents_var5), state5 = (SubLObject)kbs_identification.NIL, state5 = set_contents.do_set_contents_initial_state(basis_object5, set_contents_var5); kbs_identification.NIL == set_contents.do_set_contents_doneP(basis_object5, state5); state5 = set_contents.do_set_contents_update_state(state5)) {
                            constant6 = set_contents.do_set_contents_next(basis_object5, state5);
                            if (kbs_identification.NIL != set_contents.do_set_contents_element_validP(state5, constant6) && kbs_identification.NIL != constant_handles.constant_p(constant6)) {
                                hash_table_utilities.pushnew_hash(constant6, inclusion_set, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                            }
                        }
                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                        inclusion_set = cdolist_list_var_$12.first();
                    }
                }
                else if (kbs_identification.NIL != list_utilities.non_empty_list_p(kbq_query_sets)) {
                    SubLObject cdolist_list_var_$13 = kbq_query_sets;
                    SubLObject kbq_query_set = (SubLObject)kbs_identification.NIL;
                    kbq_query_set = cdolist_list_var_$13.first();
                    while (kbs_identification.NIL != cdolist_list_var_$13) {
                        final SubLObject cdohash_table = keyhash.do_keyhash_nodes(kbs_kbq_query_set_terms(kbq_query_set));
                        SubLObject v_term = (SubLObject)kbs_identification.NIL;
                        SubLObject the_value = (SubLObject)kbs_identification.NIL;
                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                v_term = Hashtables.getEntryKey(cdohash_entry);
                                the_value = Hashtables.getEntryValue(cdohash_entry);
                                if (kbs_identification.NIL != constant_handles.constant_p(v_term)) {
                                    hash_table_utilities.pushnew_hash(v_term, kbq_query_set, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                }
                                else {
                                    if (kbs_identification.NIL == nart_handles.nart_p(v_term)) {
                                        continue;
                                    }
                                    SubLObject cdolist_list_var_$14 = list_utilities.find_all_if((SubLObject)kbs_identification.$sym26$CONSTANT_P, narts_high.nart_el_formula(v_term), (SubLObject)kbs_identification.UNPROVIDED);
                                    SubLObject constant7 = (SubLObject)kbs_identification.NIL;
                                    constant7 = cdolist_list_var_$14.first();
                                    while (kbs_identification.NIL != cdolist_list_var_$14) {
                                        hash_table_utilities.pushnew_hash(constant7, kbq_query_set, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                        constant7 = cdolist_list_var_$14.first();
                                    }
                                }
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        kbq_query_set = cdolist_list_var_$13.first();
                    }
                }
                else {
                    final SubLObject idx = constant_handles.do_constants_table();
                    final SubLObject mess = (SubLObject)kbs_identification.$str27$mapping_Cyc_constants;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)kbs_identification.ZERO_INTEGER;
                    assert kbs_identification.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$24 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_identification.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_identification.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$45 = idx;
                            if (kbs_identification.NIL == id_index.id_index_objects_empty_p(idx_$45, (SubLObject)kbs_identification.$kw29$SKIP)) {
                                final SubLObject idx_$46 = idx_$45;
                                if (kbs_identification.NIL == id_index.id_index_dense_objects_empty_p(idx_$46, (SubLObject)kbs_identification.$kw29$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$46);
                                    final SubLObject backwardP_var = (SubLObject)kbs_identification.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject constant8;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_identification.NIL, v_iteration = (SubLObject)kbs_identification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_identification.ONE_INTEGER)) {
                                        id = ((kbs_identification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_identification.ONE_INTEGER) : v_iteration);
                                        constant8 = Vectors.aref(vector_var, id);
                                        if (kbs_identification.NIL == id_index.id_index_tombstone_p(constant8) || kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) {
                                            if (kbs_identification.NIL != id_index.id_index_tombstone_p(constant8)) {
                                                constant8 = (SubLObject)kbs_identification.$kw29$SKIP;
                                            }
                                            hash_table_utilities.pushnew_hash(constant8, kbs_identification.$const30$CycLConstant, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)kbs_identification.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$47 = idx_$45;
                                if (kbs_identification.NIL == id_index.id_index_sparse_objects_empty_p(idx_$47) || kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$47);
                                    SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$47);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$47);
                                    final SubLObject v_default = (SubLObject)((kbs_identification.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) ? kbs_identification.NIL : kbs_identification.$kw29$SKIP);
                                    while (id2.numL(end_id)) {
                                        final SubLObject constant9 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                        if (kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP) || kbs_identification.NIL == id_index.id_index_tombstone_p(constant9)) {
                                            hash_table_utilities.pushnew_hash(constant9, kbs_identification.$const30$CycLConstant, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)kbs_identification.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        id2 = Numbers.add(id2, (SubLObject)kbs_identification.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_7, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$14, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$24, thread);
                    }
                }
                SubLObject cdolist_list_var_$15 = omission_collections;
                SubLObject omission_collection = (SubLObject)kbs_identification.NIL;
                omission_collection = cdolist_list_var_$15.first();
                while (kbs_identification.NIL != cdolist_list_var_$15) {
                    final SubLObject node_var = omission_collection;
                    final SubLObject _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$15 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa), thread);
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            SubLObject node_var_$10 = node_var;
                            final SubLObject deck_type = (SubLObject)kbs_identification.$kw13$STACK;
                            final SubLObject recur_deck = deck.create_deck(deck_type);
                            final SubLObject _prev_bind_0_$27 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject tv_var = (SubLObject)kbs_identification.NIL;
                                    final SubLObject _prev_bind_0_$28 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$16 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind((kbs_identification.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kbs_identification.NIL != tv_var) ? kbs_identification.$sym14$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                        if (kbs_identification.NIL != tv_var && kbs_identification.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kbs_identification.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql((SubLObject)kbs_identification.$kw15$ERROR)) {
                                                sbhl_paranoia.sbhl_error((SubLObject)kbs_identification.ONE_INTEGER, (SubLObject)kbs_identification.$str16$_A_is_not_a__A, tv_var, (SubLObject)kbs_identification.$sym17$SBHL_TRUE_TV_P, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)kbs_identification.$kw18$CERROR)) {
                                                sbhl_paranoia.sbhl_cerror((SubLObject)kbs_identification.ONE_INTEGER, (SubLObject)kbs_identification.$str19$continue_anyway, (SubLObject)kbs_identification.$str16$_A_is_not_a__A, tv_var, (SubLObject)kbs_identification.$sym17$SBHL_TRUE_TV_P, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)kbs_identification.$kw20$WARN)) {
                                                Errors.warn((SubLObject)kbs_identification.$str16$_A_is_not_a__A, tv_var, (SubLObject)kbs_identification.$sym17$SBHL_TRUE_TV_P);
                                            }
                                            else {
                                                Errors.warn((SubLObject)kbs_identification.$str21$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror((SubLObject)kbs_identification.$str19$continue_anyway, (SubLObject)kbs_identification.$str16$_A_is_not_a__A, tv_var, (SubLObject)kbs_identification.$sym17$SBHL_TRUE_TV_P);
                                            }
                                        }
                                        final SubLObject _prev_bind_0_$29 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$17 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa))), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_identification.NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)), thread);
                                            if (kbs_identification.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kbs_identification.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED))) {
                                                final SubLObject _prev_bind_0_$30 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$18 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa))), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_identification.NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$10, (SubLObject)kbs_identification.UNPROVIDED);
                                                    while (kbs_identification.NIL != node_var_$10) {
                                                        final SubLObject tt_node_var = node_var_$10;
                                                        SubLObject cdolist_list_var_$16;
                                                        final SubLObject accessible_modules = cdolist_list_var_$16 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa));
                                                        SubLObject module_var = (SubLObject)kbs_identification.NIL;
                                                        module_var = cdolist_list_var_$16.first();
                                                        while (kbs_identification.NIL != cdolist_list_var_$16) {
                                                            final SubLObject _prev_bind_0_$31 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_identification.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_identification.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                if (kbs_identification.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED));
                                                                    if (kbs_identification.NIL != d_link) {
                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED));
                                                                        if (kbs_identification.NIL != mt_links) {
                                                                            SubLObject iteration_state;
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_identification.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (kbs_identification.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                    final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        SubLObject iteration_state_$24;
                                                                                        for (iteration_state_$24 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_identification.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$24); iteration_state_$24 = dictionary_contents.do_dictionary_contents_next(iteration_state_$24)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$24);
                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (kbs_identification.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    final SubLObject sol = link_nodes;
                                                                                                    if (kbs_identification.NIL != set.set_p(sol)) {
                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                        SubLObject basis_object;
                                                                                                        SubLObject state;
                                                                                                        SubLObject constant;
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_identification.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_identification.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            constant = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if (kbs_identification.NIL != set_contents.do_set_contents_element_validP(state, constant) && kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (kbs_identification.NIL != forts.fort_p(constant) && kbs_identification.NIL != constant_handles.constant_p(constant)) {
                                                                                                                    hash_table_utilities.pushnew_hash(constant, omission_collection, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject constant2 = (SubLObject)kbs_identification.NIL;
                                                                                                        constant2 = csome_list_var.first();
                                                                                                        while (kbs_identification.NIL != csome_list_var) {
                                                                                                            if (kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (kbs_identification.NIL != forts.fort_p(constant2) && kbs_identification.NIL != constant_handles.constant_p(constant2)) {
                                                                                                                    hash_table_utilities.pushnew_hash(constant2, omission_collection, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            constant2 = csome_list_var.first();
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)kbs_identification.$str22$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$33, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$24);
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$32, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    }
                                                                    else {
                                                                        sbhl_paranoia.sbhl_error((SubLObject)kbs_identification.FIVE_INTEGER, (SubLObject)kbs_identification.$str23$attempting_to_bind_direction_link, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                                                    }
                                                                    if (kbs_identification.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED))) {
                                                                        SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                        SubLObject instance_tuple = (SubLObject)kbs_identification.NIL;
                                                                        instance_tuple = csome_list_var2.first();
                                                                        while (kbs_identification.NIL != csome_list_var2) {
                                                                            SubLObject current;
                                                                            final SubLObject datum = current = instance_tuple;
                                                                            SubLObject link_node = (SubLObject)kbs_identification.NIL;
                                                                            SubLObject mt2 = (SubLObject)kbs_identification.NIL;
                                                                            SubLObject tv2 = (SubLObject)kbs_identification.NIL;
                                                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_identification.$list24);
                                                                            link_node = current.first();
                                                                            current = current.rest();
                                                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_identification.$list24);
                                                                            mt2 = current.first();
                                                                            current = current.rest();
                                                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_identification.$list24);
                                                                            tv2 = current.first();
                                                                            current = current.rest();
                                                                            if (kbs_identification.NIL == current) {
                                                                                if (kbs_identification.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                    final SubLObject _prev_bind_0_$34 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                        if (kbs_identification.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$35 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol;
                                                                                                final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                                if (kbs_identification.NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject constant;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_identification.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_identification.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        constant = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (kbs_identification.NIL != set_contents.do_set_contents_element_validP(state, constant) && kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (kbs_identification.NIL != forts.fort_p(constant) && kbs_identification.NIL != constant_handles.constant_p(constant)) {
                                                                                                                hash_table_utilities.pushnew_hash(constant, omission_collection, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$27 = sol;
                                                                                                    SubLObject constant2 = (SubLObject)kbs_identification.NIL;
                                                                                                    constant2 = csome_list_var_$27.first();
                                                                                                    while (kbs_identification.NIL != csome_list_var_$27) {
                                                                                                        if (kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (kbs_identification.NIL != forts.fort_p(constant2) && kbs_identification.NIL != constant_handles.constant_p(constant2)) {
                                                                                                                hash_table_utilities.pushnew_hash(constant2, omission_collection, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$27 = csome_list_var_$27.rest();
                                                                                                        constant2 = csome_list_var_$27.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)kbs_identification.$str22$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$35, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$34, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbs_identification.$list24);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            instance_tuple = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                }
                                                                else if (kbs_identification.NIL != obsolete.cnat_p(node, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$17;
                                                                    final SubLObject new_list = cdolist_list_var_$17 = ((kbs_identification.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED)));
                                                                    SubLObject generating_fn = (SubLObject)kbs_identification.NIL;
                                                                    generating_fn = cdolist_list_var_$17.first();
                                                                    while (kbs_identification.NIL != cdolist_list_var_$17) {
                                                                        final SubLObject _prev_bind_0_$36 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                            if (kbs_identification.NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject constant3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kbs_identification.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kbs_identification.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    constant3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if (kbs_identification.NIL != set_contents.do_set_contents_element_validP(state2, constant3) && kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(constant3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (kbs_identification.NIL != forts.fort_p(constant3) && kbs_identification.NIL != constant_handles.constant_p(constant3)) {
                                                                                            hash_table_utilities.pushnew_hash(constant3, omission_collection, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject constant4 = (SubLObject)kbs_identification.NIL;
                                                                                constant4 = csome_list_var3.first();
                                                                                while (kbs_identification.NIL != csome_list_var3) {
                                                                                    if (kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(constant4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (kbs_identification.NIL != forts.fort_p(constant4) && kbs_identification.NIL != constant_handles.constant_p(constant4)) {
                                                                                            hash_table_utilities.pushnew_hash(constant4, omission_collection, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    constant4 = csome_list_var3.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)kbs_identification.$str22$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$36, thread);
                                                                        }
                                                                        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                                                        generating_fn = cdolist_list_var_$17.first();
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$19, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$31, thread);
                                                            }
                                                            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                                            module_var = cdolist_list_var_$16.first();
                                                        }
                                                        SubLObject cdolist_list_var_$18;
                                                        final SubLObject accessible_modules2 = cdolist_list_var_$18 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_identification.$const4$isa)));
                                                        SubLObject module_var2 = (SubLObject)kbs_identification.NIL;
                                                        module_var2 = cdolist_list_var_$18.first();
                                                        while (kbs_identification.NIL != cdolist_list_var_$18) {
                                                            final SubLObject _prev_bind_0_$37 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_identification.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_identification.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                final SubLObject node2 = function_terms.naut_to_nart(node_var_$10);
                                                                if (kbs_identification.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                    final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED));
                                                                    if (kbs_identification.NIL != d_link2) {
                                                                        final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED));
                                                                        if (kbs_identification.NIL != mt_links2) {
                                                                            SubLObject iteration_state2;
                                                                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kbs_identification.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (kbs_identification.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                    final SubLObject _prev_bind_0_$38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                        SubLObject iteration_state_$25;
                                                                                        for (iteration_state_$25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kbs_identification.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$25); iteration_state_$25 = dictionary_contents.do_dictionary_contents_next(iteration_state_$25)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$25);
                                                                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (kbs_identification.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                final SubLObject _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                    final SubLObject sol3 = link_nodes4;
                                                                                                    if (kbs_identification.NIL != set.set_p(sol3)) {
                                                                                                        final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                        SubLObject basis_object3;
                                                                                                        SubLObject state3;
                                                                                                        SubLObject node_vars_link_node;
                                                                                                        for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)kbs_identification.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); kbs_identification.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                            if (kbs_identification.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (sol3.isList()) {
                                                                                                        SubLObject csome_list_var4 = sol3;
                                                                                                        SubLObject node_vars_link_node2 = (SubLObject)kbs_identification.NIL;
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                        while (kbs_identification.NIL != csome_list_var4) {
                                                                                                            if (kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)kbs_identification.$str22$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$39, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$25);
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$38, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                        }
                                                                    }
                                                                    else {
                                                                        sbhl_paranoia.sbhl_error((SubLObject)kbs_identification.FIVE_INTEGER, (SubLObject)kbs_identification.$str23$attempting_to_bind_direction_link, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (kbs_identification.NIL != obsolete.cnat_p(node2, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$19;
                                                                    final SubLObject new_list2 = cdolist_list_var_$19 = ((kbs_identification.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED)));
                                                                    SubLObject generating_fn2 = (SubLObject)kbs_identification.NIL;
                                                                    generating_fn2 = cdolist_list_var_$19.first();
                                                                    while (kbs_identification.NIL != cdolist_list_var_$19) {
                                                                        final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            final SubLObject sol4;
                                                                            final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                            if (kbs_identification.NIL != set.set_p(sol4)) {
                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                SubLObject basis_object4;
                                                                                SubLObject state4;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)kbs_identification.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); kbs_identification.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if (kbs_identification.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = (SubLObject)kbs_identification.NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (kbs_identification.NIL != csome_list_var5) {
                                                                                    if (kbs_identification.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kbs_identification.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kbs_identification.UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)kbs_identification.$str22$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$40, thread);
                                                                        }
                                                                        cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                                                                        generating_fn2 = cdolist_list_var_$19.first();
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$20, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$37, thread);
                                                            }
                                                            cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                                                            module_var2 = cdolist_list_var_$18.first();
                                                        }
                                                        node_var_$10 = deck.deck_pop(recur_deck);
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$18, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$18, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$30, thread);
                                                }
                                            }
                                            else {
                                                sbhl_paranoia.sbhl_warn((SubLObject)kbs_identification.TWO_INTEGER, (SubLObject)kbs_identification.$str25$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kbs_identification.UNPROVIDED)), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$17, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$29, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$16, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$28, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                                final SubLObject _values5 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values5);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$15, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$26, thread);
                    }
                    SubLObject cdolist_list_var_$20 = kbs_utilities.all_quoted_instances_enhanced(omission_collection, (SubLObject)kbs_identification.NIL);
                    SubLObject constant5 = (SubLObject)kbs_identification.NIL;
                    constant5 = cdolist_list_var_$20.first();
                    while (kbs_identification.NIL != cdolist_list_var_$20) {
                        if (kbs_identification.NIL != constant_handles.constant_p(constant5)) {
                            hash_table_utilities.pushnew_hash(constant5, omission_collection, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                        }
                        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                        constant5 = cdolist_list_var_$20.first();
                    }
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    omission_collection = cdolist_list_var_$15.first();
                }
                if (kbs_identification.NIL != fort_types_interface.predicateP(omission_predicate)) {
                    final SubLObject pred_var = omission_predicate;
                    if (kbs_identification.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = (SubLObject)kbs_identification.NIL;
                        final SubLObject _prev_bind_0_$43 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$21 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_13 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)kbs_identification.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((kbs_identification.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kbs_identification.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = (SubLObject)kbs_identification.NIL;
                            final SubLObject token_var = (SubLObject)kbs_identification.NIL;
                            while (kbs_identification.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (kbs_identification.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)kbs_identification.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kbs_identification.$kw31$GAF, (SubLObject)kbs_identification.NIL, (SubLObject)kbs_identification.NIL);
                                        SubLObject done_var_$85 = (SubLObject)kbs_identification.NIL;
                                        final SubLObject token_var_$86 = (SubLObject)kbs_identification.NIL;
                                        while (kbs_identification.NIL == done_var_$85) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$86);
                                            final SubLObject valid_$87 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$86.eql(ass));
                                            if (kbs_identification.NIL != valid_$87) {
                                                final SubLObject constant10 = assertions_high.gaf_arg1(ass);
                                                if (kbs_identification.NIL != constant_handles.constant_p(constant10)) {
                                                    hash_table_utilities.pushnew_hash(constant10, omission_predicate, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                                                }
                                            }
                                            done_var_$85 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == valid_$87);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                                            final SubLObject _values6 = Values.getValuesAsVector();
                                            if (kbs_identification.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values6);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == valid);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_13, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_12, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_11, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_10, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_9, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_8, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$21, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$43, thread);
                        }
                    }
                }
                SubLObject cdolist_list_var_$21 = retained_terms;
                SubLObject force_retained_term = (SubLObject)kbs_identification.NIL;
                force_retained_term = cdolist_list_var_$21.first();
                while (kbs_identification.NIL != cdolist_list_var_$21) {
                    if (kbs_identification.NIL != Hashtables.gethash(force_retained_term, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED)) {
                        Errors.warn((SubLObject)kbs_identification.$str32$Overriding_constant__A_omission__, force_retained_term, Hashtables.gethash(force_retained_term, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED));
                        Hashtables.remhash(force_retained_term, omission_constants_hash);
                    }
                    hash_table_utilities.pushnew_hash(force_retained_term, kbs_identification.$const33$kbsProfileRetainTerm, inclusion_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    force_retained_term = cdolist_list_var_$21.first();
                }
                SubLObject cdolist_list_var_$22 = omission_terms;
                SubLObject force_excluded_term = (SubLObject)kbs_identification.NIL;
                force_excluded_term = cdolist_list_var_$22.first();
                while (kbs_identification.NIL != cdolist_list_var_$22) {
                    hash_table_utilities.pushnew_hash(force_excluded_term, kbs_identification.$const34$kbsProfileRemoveFORT, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                    cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                    force_excluded_term = cdolist_list_var_$22.first();
                }
                SubLObject constant11 = (SubLObject)kbs_identification.NIL;
                SubLObject inclusion_reason = (SubLObject)kbs_identification.NIL;
                final Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator(inclusion_constants_hash);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                        final Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                        constant11 = Hashtables.getEntryKey(cdohash_entry2);
                        inclusion_reason = Hashtables.getEntryValue(cdohash_entry2);
                        final SubLObject exclusion_reason = Hashtables.gethash(constant11, omission_constants_hash, (SubLObject)kbs_identification.UNPROVIDED);
                        if (kbs_identification.NIL != exclusion_reason) {
                            if (kbs_identification.NIL == Hashtables.gethash(constant11, kbs_identification.$kbs_raw_constants_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED) && kbs_identification.NIL == Hashtables.gethash(constant11, kbs_identification.$kbs_raw_constants_omission_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED)) {
                                hash_table_utilities.pushnew_hash(constant11, (SubLObject)ConsesLow.list(inclusion_reason, exclusion_reason), kbs_identification.$kbs_raw_constants_omission_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED);
                                Hashtables.remhash(constant11, kbs_identification.$kbs_raw_constants_table$.getDynamicValue(thread));
                            }
                            omission_count = Numbers.add(omission_count, (SubLObject)kbs_identification.ONE_INTEGER);
                        }
                        else {
                            if (kbs_identification.NIL != definitional_predicate_set && kbs_identification.NIL == Hashtables.gethash(constant11, kbs_identification.$kbs_raw_constants_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED)) {
                                Hashtables.sethash(constant11, kbs_identification.$kbs_definitional_constant_table$.getDynamicValue(thread), definitional_predicate_set);
                            }
                            SubLObject cdolist_list_var_$23 = inclusion_reason;
                            SubLObject inclusion_reason_col = (SubLObject)kbs_identification.NIL;
                            inclusion_reason_col = cdolist_list_var_$23.first();
                            while (kbs_identification.NIL != cdolist_list_var_$23) {
                                hash_table_utilities.pushnew_hash(constant11, inclusion_reason_col, kbs_identification.$kbs_raw_constants_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED);
                                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                                inclusion_reason_col = cdolist_list_var_$23.first();
                            }
                            inclusion_count = Numbers.add(inclusion_count, (SubLObject)kbs_identification.ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator2);
                }
                PrintLow.format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str35$___S_constants_included_via_the_c, inclusion_count, inclusion_collections);
                if (kbs_identification.NIL != omission_collections || kbs_identification.NIL != omission_predicate) {
                    PrintLow.format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str36$___S_constants_omitted_via_the__A, new SubLObject[] { omission_count, (kbs_identification.NIL != omission_collections) ? kbs_identification.$str37$collections_ : kbs_identification.$str38$, (kbs_identification.NIL != omission_predicate) ? kbs_identification.$str39$_predicate_ : kbs_identification.$str38$, (kbs_identification.NIL != omission_collections) ? omission_collections : kbs_identification.$str38$, (kbs_identification.NIL != omission_predicate) ? omission_predicate : kbs_identification.$str38$ });
                }
                cdolist_list_var = cdolist_list_var.rest();
                kbs_section = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        PrintLow.format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str40$___S_total_constants_included___, Hashtables.hash_table_count(kbs_identification.$kbs_raw_constants_table$.getDynamicValue(thread)));
        PrintLow.format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str41$___S_total_constants_omitted___, Hashtables.hash_table_count(kbs_identification.$kbs_raw_constants_omission_table$.getDynamicValue(thread)));
        if (!kbs_identification.$int10$1000.numL(Hashtables.hash_table_count(kbs_identification.$kbs_raw_constants_omission_table$.getDynamicValue(thread)))) {
            PrintLow.format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str42$__Omitted_constants__);
            final SubLObject cdohash_table2 = kbs_identification.$kbs_raw_constants_omission_table$.getDynamicValue(thread);
            SubLObject constant12 = (SubLObject)kbs_identification.NIL;
            SubLObject reason = (SubLObject)kbs_identification.NIL;
            final Iterator cdohash_iterator3 = Hashtables.getEntrySetIterator(cdohash_table2);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator3)) {
                    final Map.Entry cdohash_entry3 = Hashtables.iteratorNextEntry(cdohash_iterator3);
                    constant12 = Hashtables.getEntryKey(cdohash_entry3);
                    reason = Hashtables.getEntryValue(cdohash_entry3);
                    PrintLow.format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str43$_A_, constant12);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator3);
            }
            PrintLow.format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str44$__);
        }
        final SubLObject cdohash_table2 = kbs_identification.$kbs_raw_constants_table$.getDynamicValue(thread);
        SubLObject constant12 = (SubLObject)kbs_identification.NIL;
        SubLObject v = (SubLObject)kbs_identification.NIL;
        final Iterator cdohash_iterator3 = Hashtables.getEntrySetIterator(cdohash_table2);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator3)) {
                final Map.Entry cdohash_entry3 = Hashtables.iteratorNextEntry(cdohash_iterator3);
                constant12 = Hashtables.getEntryKey(cdohash_entry3);
                v = Hashtables.getEntryValue(cdohash_entry3);
                if (kbs_identification.NIL == Hashtables.gethash(constant12, kbs_identification.$kbs_raw_constants_omission_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED)) {
                    kbs_identification.$kbs_raw_constants$.setDynamicValue((SubLObject)ConsesLow.cons(constant12, kbs_identification.$kbs_raw_constants$.getDynamicValue(thread)), thread);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator3);
        }
        PrintLow.format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str45$____S_total_raw_KBS_constants_ide, Sequences.length(kbs_identification.$kbs_raw_constants$.getDynamicValue(thread)));
        return kbs_identification.$kbs_raw_constants$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 11696L)
    public static SubLObject clear_kbs_kbq_query_set_terms() {
        final SubLObject cs = kbs_identification.$kbs_kbq_query_set_terms_caching_state$.getGlobalValue();
        if (kbs_identification.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 11696L)
    public static SubLObject remove_kbs_kbq_query_set_terms(final SubLObject kbq_query_set) {
        return memoization_state.caching_state_remove_function_results_with_args(kbs_identification.$kbs_kbq_query_set_terms_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(kbq_query_set), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 11696L)
    public static SubLObject kbs_kbq_query_set_terms_internal(final SubLObject kbq_query_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_utilities.gather_vocab_required_for_kbq_query_set((SubLObject)ConsesLow.list(kbs_identification.$const47$TheSetOf, (SubLObject)kbs_identification.$sym48$_Q, (SubLObject)ConsesLow.list(kbs_identification.$const49$thereExists, (SubLObject)kbs_identification.$sym50$_T, (SubLObject)ConsesLow.listS(kbs_identification.$const51$and, (SubLObject)ConsesLow.list(kbs_identification.$const4$isa, (SubLObject)kbs_identification.$sym50$_T, kbq_query_set), (SubLObject)kbs_identification.$list52))), (SubLObject)kbs_identification.$int53$300, (SubLObject)kbs_identification.NIL, StreamsLow.$standard_output$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 11696L)
    public static SubLObject kbs_kbq_query_set_terms(final SubLObject kbq_query_set) {
        SubLObject caching_state = kbs_identification.$kbs_kbq_query_set_terms_caching_state$.getGlobalValue();
        if (kbs_identification.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kbs_identification.$sym46$KBS_KBQ_QUERY_SET_TERMS, (SubLObject)kbs_identification.$sym54$_KBS_KBQ_QUERY_SET_TERMS_CACHING_STATE_, (SubLObject)kbs_identification.FIFTEEN_INTEGER, (SubLObject)kbs_identification.EQL, (SubLObject)kbs_identification.ONE_INTEGER, (SubLObject)kbs_identification.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, kbq_query_set, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(kbs_kbq_query_set_terms_internal(kbq_query_set)));
            memoization_state.caching_state_put(caching_state, kbq_query_set, results, (SubLObject)kbs_identification.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 12087L)
    public static SubLObject kbs_skolems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbs_identification.$kbs_skolems$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 12206L)
    public static SubLObject kbs_skolem_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, kbs_identification.$kbs_skolems$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 12296L)
    public static SubLObject compute_kbs_skolems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (kbs_identification.NIL == kbs_identification.$kbs_raw_constants$.getDynamicValue(thread) || !kbs_identification.$kbs_raw_constants_table$.getDynamicValue(thread).isHashtable() || !kbs_identification.$kbs_raw_constants_omission_table$.getDynamicValue(thread).isHashtable() || !kbs_identification.$kbs_definitional_constant_table$.getDynamicValue(thread).isHashtable()) {
                    Errors.cerror((SubLObject)kbs_identification.$str55$Continue, (SubLObject)kbs_identification.$str56$compute_kbs_skolems_requirements_);
                }
                SubLObject all_skolems = (SubLObject)kbs_identification.NIL;
                SubLObject kbs_skolems = (SubLObject)kbs_identification.NIL;
                final SubLObject _prev_bind_0_$92 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_identification.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(kbs_identification.$const9$EverythingPSC, thread);
                    all_skolems = isa.all_fort_instances(kbs_identification.$const57$SkolemFunction, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$92, thread);
                }
                final SubLObject list_var = all_skolems;
                final SubLObject _prev_bind_0_$93 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)kbs_identification.$str58$Computing_KBS_skolems, thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_identification.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_identification.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject skolem = (SubLObject)kbs_identification.NIL;
                        skolem = csome_list_var.first();
                        while (kbs_identification.NIL != csome_list_var) {
                            if (kbs_identification.NIL != compute_kbs_skolem_p(skolem)) {
                                kbs_skolems = (SubLObject)ConsesLow.cons(skolem, kbs_skolems);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kbs_identification.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            skolem = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_9, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_8, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$93, thread);
                }
                kbs_identification.$kbs_skolems$.setDynamicValue(kbs_skolems, thread);
                PrintLow.format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str60$____S_total_KBS_skolems_identifie, Sequences.length(kbs_identification.$kbs_skolems$.getDynamicValue(thread)));
            }
            finally {
                final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 13135L)
    public static SubLObject compute_kbs_skolem_p(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kbs_identification.NIL;
        if (kbs_identification.NIL != constant_handles.constant_p(skolem)) {
            final SubLObject defining_assertions = skolems.skolem_defn_assertions_robust(skolem, (SubLObject)kbs_identification.UNPROVIDED);
            if (kbs_identification.NIL != defining_assertions) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_identification.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(kbs_identification.$const9$EverythingPSC, thread);
                    SubLObject non_kbs;
                    SubLObject rest;
                    SubLObject assertion;
                    for (non_kbs = (SubLObject)kbs_identification.NIL, rest = (SubLObject)kbs_identification.NIL, rest = defining_assertions; kbs_identification.NIL == non_kbs && kbs_identification.NIL != rest; non_kbs = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == compute_kbs_skolem_assertion_p(skolem, assertion)), rest = rest.rest()) {
                        assertion = rest.first();
                    }
                    result = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == non_kbs);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 13570L)
    public static SubLObject compute_kbs_skolem_assertion_p(final SubLObject skolem, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym61$KBS_SKOLEM_ASSERTION_FAST_FAIL_CONSTANT_P), assertions_high.assertion_cons(assertion), (SubLObject)kbs_identification.UNPROVIDED)) {
            return (SubLObject)kbs_identification.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject el_formula = uncanonicalizer.assertion_el_formula_memoized(assertion);
        final SubLObject el_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (kbs_identification.NIL == el_formula || kbs_identification.NIL != list_utilities.tree_find(skolem, el_formula, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED) || kbs_identification.NIL != non_kbs_raw_el_formula_p(el_mt) || kbs_identification.NIL != non_kbs_raw_el_formula_p(el_formula)) {
            return (SubLObject)kbs_identification.NIL;
        }
        return (SubLObject)kbs_identification.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 14376L)
    public static SubLObject kbs_skolem_assertion_fast_fail_constant_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL != constant_handles.constant_p(v_object) && kbs_identification.NIL == kbs_raw_constant_p(v_object) && kbs_identification.NIL == fort_types_interface.skolem_function_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 14899L)
    public static SubLObject kbs_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbs_identification.$kbs_constants$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 15024L)
    public static SubLObject kbs_constant_p(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.getkeyhash(constant, kbs_identification.$kbs_constant_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 15121L)
    public static SubLObject non_kbs_constant_p(final SubLObject constant) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL != constant_handles.constant_p(constant) && kbs_identification.NIL == kbs_constant_p(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 15245L)
    public static SubLObject initialize_kbs_constant_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kbs_constants = kbs_constants();
        kbs_identification.$kbs_constant_table$.setDynamicValue(keyhash_utilities.keyhash_list_elements(kbs_constants, Symbols.symbol_function((SubLObject)kbs_identification.EQ), (SubLObject)kbs_identification.UNPROVIDED), thread);
        return keyhash.keyhash_count(kbs_identification.$kbs_constant_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 15542L)
    public static SubLObject compute_kbs_constants() {
        compute_kbs_raw_constants();
        compute_kbs_skolems();
        final SubLObject tiny_constants = core.all_core_constants();
        final SubLObject kbs_raw_constants = kbs_raw_constants();
        final SubLObject kbs_skolems = kbs_skolems();
        kbs_identification.$kbs_constants$.setDynamicValue(list_utilities.remove_duplicate_forts(Sequences.cconcatenate(tiny_constants, new SubLObject[] { kbs_raw_constants, kbs_skolems })));
        initialize_kbs_constant_table();
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 16033L)
    public static SubLObject kbs_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbs_identification.$kbs_narts$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 16146L)
    public static SubLObject kbs_nart_p(final SubLObject nart) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL != kbs_nart_formula_p(narts_high.nart_el_formula(nart)) && kbs_identification.NIL == list_utilities.member_equalP(nart, kbs_utilities.get_kbs_section_omission_terms(kbs_utilities.get_kbs_sections().first())) && kbs_identification.NIL != ((kbs_identification.NIL != Strings.stringE((SubLObject)kbs_identification.$str62$akb, kbs_utilities.get_kbs_name(), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED)) ? SubLObjectFactory.makeBoolean((kbs_identification.NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const63$TKBTerm_Proprietary) && kbs_identification.NIL == isa.isa_in_any_mtP(nart, kbs_identification.$const63$TKBTerm_Proprietary)) || kbs_identification.NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const64$ProprietaryTerm) || kbs_identification.NIL != isa.isa_in_any_mtP(nart, kbs_identification.$const64$ProprietaryTerm)) : ((kbs_identification.NIL != Strings.stringE((SubLObject)kbs_identification.$str65$cyfi, kbs_utilities.get_kbs_name(), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_identification.NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const66$Cy_FiProprietaryTerm) || kbs_identification.NIL != isa.isa_in_any_mtP(nart, kbs_identification.$const66$Cy_FiProprietaryTerm) || (kbs_identification.NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const67$ResearchCycConstant) && kbs_identification.NIL == isa.isa_in_any_mtP(nart, kbs_identification.$const67$ResearchCycConstant) && kbs_identification.NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const68$ScaffoldingConstant) && kbs_identification.NIL == isa.isa_in_any_mtP(nart, kbs_identification.$const68$ScaffoldingConstant)) || kbs_identification.NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const64$ProprietaryTerm) || kbs_identification.NIL != isa.isa_in_any_mtP(nart, kbs_identification.$const64$ProprietaryTerm) || kbs_identification.NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const69$TerroristAgent) || kbs_identification.NIL != isa.isa_in_any_mtP(nart, kbs_identification.$const69$TerroristAgent) || kbs_identification.NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const70$TerroristAct) || kbs_identification.NIL != isa.isa_in_any_mtP(nart, kbs_identification.$const70$TerroristAct) || kbs_identification.NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const71$HostileSocialAction) || kbs_identification.NIL != isa.isa_in_any_mtP(nart, kbs_identification.$const71$HostileSocialAction)) : ((kbs_identification.NIL != Strings.stringE((SubLObject)kbs_identification.$str72$research, kbs_utilities.get_kbs_name(), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_identification.NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const64$ProprietaryTerm) && kbs_identification.NIL == isa.isa_in_any_mtP(nart, kbs_identification.$const64$ProprietaryTerm) && kbs_identification.NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const69$TerroristAgent) && kbs_identification.NIL == isa.isa_in_any_mtP(nart, kbs_identification.$const69$TerroristAgent) && kbs_identification.NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const70$TerroristAct) && kbs_identification.NIL == isa.isa_in_any_mtP(nart, kbs_identification.$const70$TerroristAct) && kbs_identification.NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, kbs_identification.$const71$HostileSocialAction) && kbs_identification.NIL == isa.isa_in_any_mtP(nart, kbs_identification.$const71$HostileSocialAction)) : kbs_identification.T))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 18020L)
    public static SubLObject kbs_nart_formula_p(final SubLObject nart_formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nart_formula.isCons() && kbs_identification.NIL == list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym73$NON_KBS_CONSTANT_P), nart_formula, (SubLObject)kbs_identification.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 18214L)
    public static SubLObject compute_kbs_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject narts = (SubLObject)kbs_identification.NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = (SubLObject)kbs_identification.$str74$Computing_KBS_narts;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kbs_identification.ZERO_INTEGER;
        assert kbs_identification.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_identification.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_identification.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$96 = idx;
                if (kbs_identification.NIL == id_index.id_index_objects_empty_p(idx_$96, (SubLObject)kbs_identification.$kw29$SKIP)) {
                    final SubLObject idx_$97 = idx_$96;
                    if (kbs_identification.NIL == id_index.id_index_dense_objects_empty_p(idx_$97, (SubLObject)kbs_identification.$kw29$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$97);
                        final SubLObject backwardP_var = (SubLObject)kbs_identification.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_identification.NIL, v_iteration = (SubLObject)kbs_identification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_identification.ONE_INTEGER)) {
                            id = ((kbs_identification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_identification.ONE_INTEGER) : v_iteration);
                            nart = Vectors.aref(vector_var, id);
                            if (kbs_identification.NIL == id_index.id_index_tombstone_p(nart) || kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) {
                                if (kbs_identification.NIL != id_index.id_index_tombstone_p(nart)) {
                                    nart = (SubLObject)kbs_identification.$kw29$SKIP;
                                }
                                if (kbs_identification.NIL != kbs_nart_p(nart)) {
                                    narts = (SubLObject)ConsesLow.cons(nart, narts);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kbs_identification.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$98 = idx_$96;
                    if (kbs_identification.NIL == id_index.id_index_sparse_objects_empty_p(idx_$98) || kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$98);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$98);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$98);
                        final SubLObject v_default = (SubLObject)((kbs_identification.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) ? kbs_identification.NIL : kbs_identification.$kw29$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP) || kbs_identification.NIL == id_index.id_index_tombstone_p(nart2)) {
                                if (kbs_identification.NIL != kbs_nart_p(nart2)) {
                                    narts = (SubLObject)ConsesLow.cons(nart2, narts);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kbs_identification.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kbs_identification.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        kbs_identification.$kbs_narts$.setDynamicValue(narts, thread);
        PrintLow.format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str75$____S_total_KBS_NARTs_identified_, Sequences.length(kbs_identification.$kbs_narts$.getDynamicValue(thread)));
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 18647L)
    public static SubLObject kbs_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbs_identification.$kbs_forts$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 18762L)
    public static SubLObject kbs_fort_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.getkeyhash(fort, kbs_identification.$kbs_fort_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 18895L)
    public static SubLObject why_kbs_fortP(final SubLObject fort) {
        SubLObject supports = (SubLObject)kbs_identification.NIL;
        if (kbs_identification.NIL != constant_handles.constant_p(fort)) {
            SubLObject cdolist_list_var = why_kbs_raw_constantP(fort);
            SubLObject support = (SubLObject)kbs_identification.NIL;
            support = cdolist_list_var.first();
            while (kbs_identification.NIL != cdolist_list_var) {
                supports = (SubLObject)ConsesLow.cons(support, supports);
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        else {
            supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str76$All_KB_subset_requirements_met_, supports);
        }
        final SubLObject splicing_gafs = kbs_add_redundant.kbs_additional_redundant_definitional_info(fort);
        if (kbs_identification.NIL != splicing_gafs) {
            supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str38$, supports);
            supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str77$Also__the_following_GAFs_will_be_, supports);
            SubLObject cdolist_list_var2 = splicing_gafs;
            SubLObject splicing_gaf = (SubLObject)kbs_identification.NIL;
            splicing_gaf = cdolist_list_var2.first();
            while (kbs_identification.NIL != cdolist_list_var2) {
                final SubLObject formula = splicing_gaf.first();
                final SubLObject mt = conses_high.second(splicing_gaf);
                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)kbs_identification.$kw78$OPAQUE, formula, mt, (SubLObject)kbs_identification.UNPROVIDED), supports);
                cdolist_list_var2 = cdolist_list_var2.rest();
                splicing_gaf = cdolist_list_var2.first();
            }
        }
        return Sequences.nreverse(supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 19520L)
    public static SubLObject non_kbs_fort_p(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL != forts.fort_p(fort) && kbs_identification.NIL == kbs_fort_p(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 19685L)
    public static SubLObject why_non_kbs_fortP(final SubLObject fort) {
        if (kbs_identification.NIL != constant_handles.constant_p(fort)) {
            return why_non_kbs_raw_constantP(fort);
        }
        final SubLObject fort_el_formula = forts.fort_el_formula(fort);
        final SubLObject fort_non_forts = list_utilities.remove_duplicate_forts(list_utilities.tree_find_all_if((SubLObject)kbs_identification.$sym79$NON_KBS_FORT_P, fort_el_formula, (SubLObject)kbs_identification.UNPROVIDED));
        SubLObject supports = (SubLObject)kbs_identification.NIL;
        supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str80$The_term_contains_terms_not_in_th, supports);
        SubLObject cdolist_list_var = fort_non_forts;
        SubLObject fort_non_fort = (SubLObject)kbs_identification.NIL;
        fort_non_fort = cdolist_list_var.first();
        while (kbs_identification.NIL != cdolist_list_var) {
            supports = (SubLObject)ConsesLow.cons(fort_non_fort, supports);
            cdolist_list_var = cdolist_list_var.rest();
            fort_non_fort = cdolist_list_var.first();
        }
        return Sequences.nreverse(supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 20148L)
    public static SubLObject kbs_definitional_fort_p(final SubLObject fort) {
        if (kbs_identification.NIL != constant_handles.constant_p(fort)) {
            return kbs_definitional_constant_p(fort);
        }
        if (kbs_identification.NIL != nart_handles.nart_p(fort)) {
            return list_utilities.tree_find_if((SubLObject)kbs_identification.$sym81$KBS_DEFINITIONAL_FORT_P, narts_high.nart_el_formula(fort), (SubLObject)kbs_identification.UNPROVIDED);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 20390L)
    public static SubLObject non_kbs_definitional_fort_p(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == kbs_definitional_fort_p(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 20491L)
    public static SubLObject initialize_kbs_fort_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kbs_forts = kbs_forts();
        kbs_identification.$kbs_fort_table$.setDynamicValue(keyhash_utilities.keyhash_list_elements(kbs_forts, Symbols.symbol_function((SubLObject)kbs_identification.EQ), (SubLObject)kbs_identification.UNPROVIDED), thread);
        return keyhash.keyhash_count(kbs_identification.$kbs_fort_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 20762L)
    public static SubLObject unmark_kbs_fort(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.remkeyhash(fort, kbs_identification.$kbs_fort_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 20884L)
    public static SubLObject unmark_kbs_fort_and_dependents(final SubLObject fort) {
        SubLObject assertion_count = (SubLObject)kbs_identification.ZERO_INTEGER;
        SubLObject fort_count = (SubLObject)kbs_identification.ZERO_INTEGER;
        if (kbs_identification.NIL != kbs_fort_p(fort)) {
            unmark_kbs_fort(fort);
            fort_count = Numbers.add(fort_count, (SubLObject)kbs_identification.ONE_INTEGER);
            if (kbs_identification.NIL != kb_mapping_macros.do_term_index_key_validator(fort, (SubLObject)kbs_identification.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, (SubLObject)kbs_identification.NIL);
                SubLObject done_var = (SubLObject)kbs_identification.NIL;
                final SubLObject token_var = (SubLObject)kbs_identification.NIL;
                while (kbs_identification.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (kbs_identification.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)kbs_identification.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kbs_identification.NIL, (SubLObject)kbs_identification.NIL, (SubLObject)kbs_identification.NIL);
                            SubLObject done_var_$100 = (SubLObject)kbs_identification.NIL;
                            final SubLObject token_var_$101 = (SubLObject)kbs_identification.NIL;
                            while (kbs_identification.NIL == done_var_$100) {
                                final SubLObject a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$101);
                                final SubLObject valid_$102 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$101.eql(a));
                                if (kbs_identification.NIL != valid_$102 && kbs_identification.NIL != kb_mapping_macros.do_term_index_assertion_match_p(a, final_index_spec)) {
                                    if (kbs_identification.NIL != function_terms.tou_assertionP(a)) {
                                        unmark_kbs_fort_and_dependents(assertions_high.gaf_arg1(a));
                                    }
                                    if (kbs_identification.NIL != kbs_assertion_p(a)) {
                                        unmark_kbs_assertion(a);
                                        assertion_count = Numbers.add(assertion_count, (SubLObject)kbs_identification.ONE_INTEGER);
                                    }
                                }
                                done_var_$100 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == valid_$102);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)kbs_identification.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (kbs_identification.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == valid);
                }
            }
        }
        return Values.values(fort_count, assertion_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 21310L)
    public static SubLObject compute_kbs_forts() {
        compute_kbs_narts();
        final SubLObject kbs_constants = kbs_constants();
        final SubLObject kbs_narts = kbs_narts();
        kbs_identification.$kbs_forts$.setDynamicValue(Sequences.cconcatenate(kbs_constants, kbs_narts));
        initialize_kbs_fort_table();
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 21602L)
    public static SubLObject kbs_definitional_constant_predicate_sets(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.NIL != constant_handles.constant_p(constant)) {
            return Hashtables.gethash(constant, kbs_identification.$kbs_definitional_constant_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 22275L)
    public static SubLObject kbs_definitional_fort_predicate_sets(final SubLObject fort) {
        if (kbs_identification.NIL != constant_handles.constant_p(fort)) {
            return kbs_definitional_constant_predicate_sets(fort);
        }
        if (kbs_identification.NIL != nart_handles.nart_p(fort)) {
            return list_utilities.remove_duplicate_forts(Sequences.remove_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym82$NULL), Mapping.mapcar((SubLObject)kbs_identification.$sym83$KBS_DEFINITIONAL_FORT_PREDICATE_SETS, narts_high.nart_hl_formula(fort)), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED));
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 22594L)
    public static SubLObject kbs_definitional_constant_p(final SubLObject constant) {
        return list_utilities.sublisp_boolean(kbs_definitional_constant_predicate_sets(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 22723L)
    public static SubLObject non_kbs_definitional_constant_p(final SubLObject constant) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL != constant_handles.constant_p(constant) && kbs_identification.NIL == kbs_definitional_constant_predicate_sets(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 22886L)
    public static SubLObject tree_gather_relevant_kbs_definitional_predicate_sets(final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.$kbs_definitional_constant_table$.getDynamicValue(thread).isHashtable()) {
            final SubLObject tree_forts = list_utilities.fast_delete_duplicates(list_utilities.tree_gather(tree, (SubLObject)kbs_identification.$sym84$FORT_P, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
            final SubLObject predicate_sets_list = Sequences.remove_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym82$NULL), Mapping.mapcar((SubLObject)kbs_identification.$sym83$KBS_DEFINITIONAL_FORT_PREDICATE_SETS, tree_forts), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
            final SubLObject relevant_predicate_sets = list_utilities.fast_delete_duplicates(list_utilities.tree_gather(predicate_sets_list, (SubLObject)kbs_identification.$sym84$FORT_P, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
            final SubLObject sorted_relevant_predicate_sets = Sort.sort(relevant_predicate_sets, (SubLObject)kbs_identification.$sym85$KBS_DEFINITIONAL_PREDICATE_SET_, (SubLObject)kbs_identification.UNPROVIDED);
            return sorted_relevant_predicate_sets;
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 23858L)
    public static SubLObject kbs_definitional_predicate_set_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, kbs_identification.$kbs_ordered_definitional_predicate_sets$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 23999L)
    public static SubLObject kbs_definitional_predicate_setL(final SubLObject predicate_set1, final SubLObject predicate_set2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kbs_identification.NIL != kbs_definitional_predicate_set_p(predicate_set1) : predicate_set1;
        assert kbs_identification.NIL != kbs_definitional_predicate_set_p(predicate_set2) : predicate_set2;
        return Numbers.numG(Sequences.position(predicate_set1, kbs_identification.$kbs_ordered_definitional_predicate_sets$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED), Sequences.position(predicate_set2, kbs_identification.$kbs_ordered_definitional_predicate_sets$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 24358L)
    public static SubLObject kbs_predicate_definitional_predicate_sets(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.NIL != fort_types_interface.predicate_p(predicate)) {
            return Hashtables.gethash(predicate, kbs_identification.$kbs_definitional_predicate_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 24549L)
    public static SubLObject all_kbs_definitional_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.hash_table_keys(kbs_identification.$kbs_definitional_predicate_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 24665L)
    public static SubLObject kbs_definitional_predicate_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(Hashtables.gethash_without_values(v_object, kbs_identification.$kbs_definitional_predicate_table$.getDynamicValue(thread), (SubLObject)kbs_identification.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 24812L)
    public static SubLObject clear_kbs_definitional_predicate_table() {
        kbs_identification.$kbs_definitional_predicate_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)kbs_identification.$int10$1000, Symbols.symbol_function((SubLObject)kbs_identification.EQUAL), (SubLObject)kbs_identification.UNPROVIDED));
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 24976L)
    public static SubLObject initialize_kbs_definitional_predicate_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_kbs_definitional_predicate_table();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_identification.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbs_identification.$const9$EverythingPSC, thread);
            SubLObject cdolist_list_var = kbs_utilities.get_kbs_sections();
            SubLObject kbs_section = (SubLObject)kbs_identification.NIL;
            kbs_section = cdolist_list_var.first();
            while (kbs_identification.NIL != cdolist_list_var) {
                final SubLObject definitional_predicate_set = kbs_utilities.get_kbs_section_definitional_predicate_set(kbs_section);
                if (kbs_identification.NIL != definitional_predicate_set) {
                    final SubLObject item_var = definitional_predicate_set;
                    if (kbs_identification.NIL == conses_high.member(item_var, kbs_identification.$kbs_ordered_definitional_predicate_sets$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)kbs_identification.EQL), Symbols.symbol_function((SubLObject)kbs_identification.IDENTITY))) {
                        kbs_identification.$kbs_ordered_definitional_predicate_sets$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, kbs_identification.$kbs_ordered_definitional_predicate_sets$.getDynamicValue(thread)), thread);
                    }
                    SubLObject cdolist_list_var_$103 = kbs_utilities.all_quoted_instances_enhanced(definitional_predicate_set, (SubLObject)kbs_identification.UNPROVIDED);
                    SubLObject definitional_predicate = (SubLObject)kbs_identification.NIL;
                    definitional_predicate = cdolist_list_var_$103.first();
                    while (kbs_identification.NIL != cdolist_list_var_$103) {
                        final SubLObject old_value = Hashtables.gethash(definitional_predicate, kbs_identification.$kbs_definitional_predicate_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED);
                        final SubLObject new_value = (SubLObject)ConsesLow.cons(definitional_predicate_set, old_value);
                        Hashtables.sethash(definitional_predicate, kbs_identification.$kbs_definitional_predicate_table$.getDynamicValue(thread), new_value);
                        cdolist_list_var_$103 = cdolist_list_var_$103.rest();
                        definitional_predicate = cdolist_list_var_$103.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                kbs_section = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Hashtables.hash_table_count(kbs_identification.$kbs_definitional_predicate_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 25770L)
    public static SubLObject compute_kbs_definitional_predicates() {
        initialize_kbs_definitional_predicate_table();
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 26045L)
    public static SubLObject kbs_rule_definitional_predicate_sets(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash(rule, kbs_identification.$kbs_definitional_rule_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 26174L)
    public static SubLObject clear_kbs_definitional_rule_table() {
        kbs_identification.$kbs_definitional_rule_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)kbs_identification.$int10$1000, Symbols.symbol_function((SubLObject)kbs_identification.EQ), (SubLObject)kbs_identification.UNPROVIDED));
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 26325L)
    public static SubLObject initialize_kbs_definitional_rule_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_kbs_definitional_rule_table();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_identification.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbs_identification.$const9$EverythingPSC, thread);
            SubLObject cdolist_list_var = kbs_utilities.get_kbs_sections();
            SubLObject kbs_section = (SubLObject)kbs_identification.NIL;
            kbs_section = cdolist_list_var.first();
            while (kbs_identification.NIL != cdolist_list_var) {
                final SubLObject definitional_predicate_set = kbs_utilities.get_kbs_section_definitional_predicate_set(kbs_section);
                final SubLObject definitional_rule_predicate = kbs_utilities.get_kbs_section_definitional_rule_predicate(kbs_section);
                if (kbs_identification.NIL != definitional_rule_predicate) {
                    final SubLObject pred_var = definitional_rule_predicate;
                    if (kbs_identification.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = (SubLObject)kbs_identification.NIL;
                        final SubLObject _prev_bind_0_$104 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$105 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                            utilities_macros.$progress_notification_count$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)kbs_identification.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((kbs_identification.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kbs_identification.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = (SubLObject)kbs_identification.NIL;
                            final SubLObject token_var = (SubLObject)kbs_identification.NIL;
                            while (kbs_identification.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (kbs_identification.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)kbs_identification.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kbs_identification.$kw31$GAF, (SubLObject)kbs_identification.NIL, (SubLObject)kbs_identification.NIL);
                                        SubLObject done_var_$106 = (SubLObject)kbs_identification.NIL;
                                        final SubLObject token_var_$107 = (SubLObject)kbs_identification.NIL;
                                        while (kbs_identification.NIL == done_var_$106) {
                                            final SubLObject definitional_rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$107);
                                            final SubLObject valid_$108 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$107.eql(definitional_rule));
                                            if (kbs_identification.NIL != valid_$108) {
                                                final SubLObject rule_assertion = assertions_high.gaf_arg1(definitional_rule);
                                                final SubLObject old_value = Hashtables.gethash(rule_assertion, kbs_identification.$kbs_definitional_rule_table$.getDynamicValue(thread), (SubLObject)kbs_identification.UNPROVIDED);
                                                final SubLObject new_value = (SubLObject)ConsesLow.cons(definitional_predicate_set, old_value);
                                                Hashtables.sethash(rule_assertion, kbs_identification.$kbs_definitional_rule_table$.getDynamicValue(thread), new_value);
                                            }
                                            done_var_$106 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == valid_$108);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$105 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (kbs_identification.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == valid);
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
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$105, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$104, thread);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                kbs_section = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Hashtables.hash_table_count(kbs_identification.$kbs_definitional_rule_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 27123L)
    public static SubLObject compute_kbs_definitional_rules() {
        initialize_kbs_definitional_rule_table();
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 27441L)
    public static SubLObject kbs_assertion_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbs_identification.$kbs_assertion_table$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 27584L)
    public static SubLObject kbs_assertion_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.getkeyhash(assertion, kbs_identification.$kbs_assertion_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 27731L)
    public static SubLObject why_kbs_assertionP(final SubLObject assertion) {
        SubLObject supports = (SubLObject)kbs_identification.NIL;
        supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str76$All_KB_subset_requirements_met_, supports);
        return Sequences.nreverse(supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 27908L)
    public static SubLObject non_kbs_assertion_p(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL != assertion_handles.assertion_p(assertion) && kbs_identification.NIL == kbs_assertion_p(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 28090L)
    public static SubLObject why_non_kbs_assertionP(final SubLObject assertion) {
        if (kbs_identification.NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject supports = (SubLObject)kbs_identification.NIL;
            if (kbs_identification.NIL != non_kbs_fort_p(mt)) {
                supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str87$The_assertion_s_microtheory_is_no, supports);
                SubLObject cdolist_list_var = why_non_kbs_fortP(mt);
                SubLObject support = (SubLObject)kbs_identification.NIL;
                support = cdolist_list_var.first();
                while (kbs_identification.NIL != cdolist_list_var) {
                    supports = (SubLObject)ConsesLow.cons(support, supports);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                }
            }
            else if (kbs_identification.NIL != subl_promotions.memberP(assertion, kbs_utilities.get_kbs_section_omission_assertions(kbs_utilities.get_kbs_sections().first()), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED)) {
                supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str88$The_assertion_was_explicitly_omit, supports);
            }
            else {
                final SubLObject non_kbs_forts_in_cnf = list_utilities.remove_duplicate_forts(list_utilities.tree_find_all_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym79$NON_KBS_FORT_P), cnf, (SubLObject)kbs_identification.UNPROVIDED));
                if (kbs_identification.NIL != non_kbs_forts_in_cnf) {
                    supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str89$The_assertion_s_formula_contains_, supports);
                    SubLObject cdolist_list_var2 = non_kbs_forts_in_cnf;
                    SubLObject non_kbs_fort = (SubLObject)kbs_identification.NIL;
                    non_kbs_fort = cdolist_list_var2.first();
                    while (kbs_identification.NIL != cdolist_list_var2) {
                        SubLObject cdolist_list_var_$110 = why_non_kbs_fortP(non_kbs_fort);
                        SubLObject support2 = (SubLObject)kbs_identification.NIL;
                        support2 = cdolist_list_var_$110.first();
                        while (kbs_identification.NIL != cdolist_list_var_$110) {
                            supports = (SubLObject)ConsesLow.cons(support2, supports);
                            cdolist_list_var_$110 = cdolist_list_var_$110.rest();
                            support2 = cdolist_list_var_$110.first();
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        non_kbs_fort = cdolist_list_var2.first();
                    }
                }
                else if (kbs_identification.NIL != assertions_high.gaf_assertionP(assertion)) {
                    final SubLObject predicate = assertions_high.gaf_predicate(assertion);
                    final SubLObject predicate_predicate_sets = kbs_predicate_definitional_predicate_sets(predicate);
                    final SubLObject assertion_predicate_sets = tree_gather_relevant_kbs_definitional_predicate_sets(cnf);
                    if (kbs_identification.NIL == list_utilities.fast_subsetP(assertion_predicate_sets, predicate_predicate_sets, (SubLObject)kbs_identification.UNPROVIDED)) {
                        supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str90$The_assertion_is_definitional_bec, supports);
                        if (kbs_identification.NIL != predicate_predicate_sets) {
                            supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str91$__The_predicate_is_definitional_, supports);
                            SubLObject cdolist_list_var3 = predicate_predicate_sets;
                            SubLObject predicate_predicate_set = (SubLObject)kbs_identification.NIL;
                            predicate_predicate_set = cdolist_list_var3.first();
                            while (kbs_identification.NIL != cdolist_list_var3) {
                                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)kbs_identification.$kw0$ISA, el_utilities.make_binary_formula(kbs_identification.$const4$isa, predicate, predicate_predicate_set), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED), supports);
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                predicate_predicate_set = cdolist_list_var3.first();
                            }
                        }
                        else {
                            supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str92$__The_predicate_is_not_definition, supports);
                        }
                        supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str93$__But_the_assertion_contains_defi, supports);
                        SubLObject cdolist_list_var3 = assertion_predicate_sets;
                        SubLObject assertion_predicate_set = (SubLObject)kbs_identification.NIL;
                        assertion_predicate_set = cdolist_list_var3.first();
                        while (kbs_identification.NIL != cdolist_list_var3) {
                            supports = (SubLObject)ConsesLow.cons(assertion_predicate_set, supports);
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            assertion_predicate_set = cdolist_list_var3.first();
                        }
                    }
                }
                else {
                    final SubLObject assertion_predicate_sets2 = tree_gather_relevant_kbs_definitional_predicate_sets(cnf);
                    supports = (SubLObject)ConsesLow.cons((SubLObject)kbs_identification.$str94$The_assertion_is_a_rule_containin, supports);
                    SubLObject cdolist_list_var4 = assertion_predicate_sets2;
                    SubLObject assertion_predicate_set2 = (SubLObject)kbs_identification.NIL;
                    assertion_predicate_set2 = cdolist_list_var4.first();
                    while (kbs_identification.NIL != cdolist_list_var4) {
                        supports = (SubLObject)ConsesLow.cons(assertion_predicate_set2, supports);
                        cdolist_list_var4 = cdolist_list_var4.rest();
                        assertion_predicate_set2 = cdolist_list_var4.first();
                    }
                }
            }
            return Sequences.nreverse(supports);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 30639L)
    public static SubLObject initialize_kbs_assertion_table(final SubLObject kbs_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kbs_identification.$kbs_assertion_table$.setDynamicValue((SubLObject)kbs_identification.NIL, thread);
        kbs_identification.$kbs_assertion_table$.setDynamicValue(keyhash_utilities.keyhash_list_elements(kbs_assertions, Symbols.symbol_function((SubLObject)kbs_identification.EQ), (SubLObject)kbs_identification.UNPROVIDED), thread);
        return keyhash.keyhash_count(kbs_identification.$kbs_assertion_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 30940L)
    public static SubLObject mark_kbs_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.setkeyhash(assertion, kbs_identification.$kbs_assertion_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 31085L)
    public static SubLObject unmark_kbs_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.remkeyhash(assertion, kbs_identification.$kbs_assertion_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 31232L)
    public static SubLObject compute_kbs_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)kbs_identification.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kbs_identification.$str95$Computing_KBS_assertions;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kbs_identification.ZERO_INTEGER;
        assert kbs_identification.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_identification.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_identification.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$111 = idx;
                if (kbs_identification.NIL == id_index.id_index_objects_empty_p(idx_$111, (SubLObject)kbs_identification.$kw29$SKIP)) {
                    final SubLObject idx_$112 = idx_$111;
                    if (kbs_identification.NIL == id_index.id_index_dense_objects_empty_p(idx_$112, (SubLObject)kbs_identification.$kw29$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$112);
                        final SubLObject backwardP_var = (SubLObject)kbs_identification.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_identification.NIL, v_iteration = (SubLObject)kbs_identification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_identification.ONE_INTEGER)) {
                            a_id = ((kbs_identification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_identification.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kbs_identification.NIL == id_index.id_index_tombstone_p(a_handle) || kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) {
                                if (kbs_identification.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kbs_identification.$kw29$SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (kbs_identification.NIL != compute_kbs_assertion_p(assertion)) {
                                    assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kbs_identification.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$113 = idx_$111;
                    if (kbs_identification.NIL == id_index.id_index_sparse_objects_empty_p(idx_$113) || kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$113);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$113);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$113);
                        final SubLObject v_default = (SubLObject)((kbs_identification.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) ? kbs_identification.NIL : kbs_identification.$kw29$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP) || kbs_identification.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (kbs_identification.NIL != compute_kbs_assertion_p(assertion2)) {
                                    assertions = (SubLObject)ConsesLow.cons(assertion2, assertions);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kbs_identification.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kbs_identification.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        initialize_kbs_assertion_table(assertions);
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 32124L)
    public static SubLObject compute_kbs_assertion_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kbs_identification.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_identification.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbs_identification.$const9$EverythingPSC, thread);
            if (kbs_identification.NIL != assertion_handles.assertion_p(assertion)) {
                if (kbs_identification.NIL == kbs_assertion_references_excluded_termsP(assertion) && kbs_identification.NIL == kbs_definitionally_restricted_assertionP(assertion)) {
                    v_answer = (SubLObject)kbs_identification.T;
                }
                if (kbs_identification.NIL != assertions_high.gaf_assertionP(assertion) && (kbs_identification.NIL != genl_predicates.any_genl_predP(assertions_high.gaf_predicate(assertion), kbs_utilities.get_kbs_section_omission_predicate_extent(kbs_utilities.get_kbs_sections().first()), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED) || kbs_identification.NIL != genl_predicates.any_genl_inverseP(assertions_high.gaf_predicate(assertion), kbs_utilities.get_kbs_section_omission_predicate_extent(kbs_utilities.get_kbs_sections().first()), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED)) && kbs_identification.NIL == subl_promotions.memberP(assertion, kbs_utilities.get_kbs_section_retained_assertions(kbs_utilities.get_kbs_sections().first()), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED)) {
                    v_answer = (SubLObject)kbs_identification.NIL;
                }
                if (kbs_identification.NIL != v_answer && kbs_identification.NIL != subl_promotions.memberP(assertion, kbs_utilities.get_kbs_section_omission_assertions(kbs_utilities.get_kbs_sections().first()), (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED)) {
                    v_answer = (SubLObject)kbs_identification.NIL;
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 33053L)
    public static SubLObject compute_non_kbs_assertion_p(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL != assertion_handles.assertion_p(assertion) && kbs_identification.NIL == compute_kbs_assertion_p(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 33304L)
    public static SubLObject kbs_assertion_references_excluded_termsP(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL != non_kbs_fort_p(mt) || kbs_identification.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym79$NON_KBS_FORT_P), cnf, (SubLObject)kbs_identification.UNPROVIDED) || kbs_identification.NIL != ((kbs_identification.NIL != forts.fort_p(mt)) ? non_kbs_fort_p(mt) : list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym79$NON_KBS_FORT_P), mt, (SubLObject)kbs_identification.UNPROVIDED)) || kbs_identification.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym96$COMPUTE_NON_KBS_ASSERTION_P), cnf, (SubLObject)kbs_identification.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 33831L)
    public static SubLObject kbs_definitionally_restricted_assertionP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.NIL != hash_table_utilities.hash_table_empty_p(kbs_identification.$kbs_definitional_constant_table$.getDynamicValue(thread))) {
            return (SubLObject)kbs_identification.NIL;
        }
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        if (kbs_identification.NIL == list_utilities.tree_find_if((SubLObject)kbs_identification.$sym81$KBS_DEFINITIONAL_FORT_P, cnf, (SubLObject)kbs_identification.UNPROVIDED)) {
            return (SubLObject)kbs_identification.NIL;
        }
        final SubLObject assertion_predicate_sets = tree_gather_relevant_kbs_definitional_predicate_sets(cnf);
        if (kbs_identification.NIL != assertions_high.rule_assertionP(assertion)) {
            final SubLObject rule_predicate_sets = kbs_rule_definitional_predicate_sets(assertion);
            return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == list_utilities.fast_subsetP(assertion_predicate_sets, rule_predicate_sets, (SubLObject)kbs_identification.UNPROVIDED));
        }
        final SubLObject predicate = assertions_high.gaf_predicate(assertion);
        final SubLObject predicate_predicate_sets = kbs_predicate_definitional_predicate_sets(predicate);
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == list_utilities.fast_subsetP(assertion_predicate_sets, predicate_predicate_sets, (SubLObject)kbs_identification.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 35289L)
    public static SubLObject kbs_deduction_p(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.getkeyhash(deduction, kbs_identification.$kbs_deduction_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 35450L)
    public static SubLObject non_kbs_deduction_p(final SubLObject deduction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL != deduction_handles.deduction_p(deduction) && kbs_identification.NIL == kbs_deduction_p(deduction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 35632L)
    public static SubLObject initialize_kbs_deduction_table(final SubLObject kbs_deductions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kbs_identification.$kbs_deduction_table$.setDynamicValue((SubLObject)kbs_identification.NIL, thread);
        kbs_identification.$kbs_deduction_table$.setDynamicValue(keyhash_utilities.keyhash_list_elements(kbs_deductions, Symbols.symbol_function((SubLObject)kbs_identification.EQ), (SubLObject)kbs_identification.UNPROVIDED), thread);
        return keyhash.keyhash_count(kbs_identification.$kbs_deduction_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 35933L)
    public static SubLObject compute_kbs_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject deductions = (SubLObject)kbs_identification.NIL;
        final SubLObject list_var = keyhash_utilities.keyhash_element_list(kbs_assertion_table());
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)kbs_identification.$str97$Computing_KBS_deductions, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_identification.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_identification.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject assertion = (SubLObject)kbs_identification.NIL;
                assertion = csome_list_var.first();
                while (kbs_identification.NIL != csome_list_var) {
                    SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                    SubLObject argument = (SubLObject)kbs_identification.NIL;
                    argument = cdolist_list_var.first();
                    while (kbs_identification.NIL != cdolist_list_var) {
                        if (kbs_identification.NIL != compute_kbs_deduction_p(argument)) {
                            deductions = (SubLObject)ConsesLow.cons(argument, deductions);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        argument = cdolist_list_var.first();
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kbs_identification.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
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
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        initialize_kbs_deduction_table(deductions);
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 36312L)
    public static SubLObject compute_kbs_deduction_p(final SubLObject deduction) {
        SubLObject v_answer = (SubLObject)kbs_identification.NIL;
        if (kbs_identification.NIL != deduction_handles.deduction_p(deduction) && kbs_identification.NIL != kbs_assertion_p(deductions_high.deduction_supported_object(deduction))) {
            SubLObject invalidP;
            SubLObject rest;
            SubLObject support;
            for (invalidP = (SubLObject)kbs_identification.NIL, rest = (SubLObject)kbs_identification.NIL, rest = deductions_high.deduction_supports(deduction); kbs_identification.NIL == invalidP && kbs_identification.NIL != rest; invalidP = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == compute_kbs_support_p(support)), rest = rest.rest()) {
                support = rest.first();
            }
            v_answer = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == invalidP);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 36743L)
    public static SubLObject compute_kbs_support_p(final SubLObject support) {
        if (kbs_identification.NIL != arguments.support_p(support)) {
            if (kbs_identification.NIL != assertion_handles.assertion_p(support)) {
                return kbs_assertion_p(support);
            }
            final SubLObject mt = arguments.support_mt(support);
            if (kbs_identification.NIL == non_kbs_fort_p(mt) && kbs_identification.NIL == kbs_raw_constant_omitted_p(mt)) {
                final SubLObject formula = arguments.support_formula(support);
                if (kbs_identification.NIL == list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym79$NON_KBS_FORT_P), formula, (SubLObject)kbs_identification.UNPROVIDED) && kbs_identification.NIL == list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym98$KBS_RAW_CONSTANT_OMITTED_P), formula, (SubLObject)kbs_identification.UNPROVIDED)) {
                    return (SubLObject)kbs_identification.T;
                }
            }
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 37376L)
    public static SubLObject kbs_fort_state_validP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbs_identification.$kbs_fort_state_validP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 37608L)
    public static SubLObject kbs_state_validP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbs_identification.$kbs_state_validP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 38174L)
    public static SubLObject prepare_kbs_kb_destructive(SubLObject skip_functionsP) {
        if (skip_functionsP == kbs_identification.UNPROVIDED) {
            skip_functionsP = (SubLObject)kbs_identification.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject preremoved_assertion_identifying_predicates = cdolist_list_var = kbs_utilities.get_kbs_preremoved_assertions();
        SubLObject preremoved_assertion_identifying_predicate = (SubLObject)kbs_identification.NIL;
        preremoved_assertion_identifying_predicate = cdolist_list_var.first();
        while (kbs_identification.NIL != cdolist_list_var) {
            if (kbs_identification.NIL != forts.fort_p(preremoved_assertion_identifying_predicate)) {
                final SubLObject predicate = preremoved_assertion_identifying_predicate;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_identification.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(kbs_identification.$const9$EverythingPSC, thread);
                    final SubLObject pred_var = predicate;
                    if (kbs_identification.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = Sequences.cconcatenate((SubLObject)kbs_identification.$str100$Preremoving_, new SubLObject[] { format_nil.format_nil_s_no_copy(predicate), kbs_identification.$str101$_assertions });
                        final SubLObject _prev_bind_0_$116 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$117 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                            utilities_macros.$progress_notification_count$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)kbs_identification.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((kbs_identification.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kbs_identification.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = (SubLObject)kbs_identification.NIL;
                            final SubLObject token_var = (SubLObject)kbs_identification.NIL;
                            while (kbs_identification.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (kbs_identification.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)kbs_identification.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kbs_identification.$kw31$GAF, (SubLObject)kbs_identification.NIL, (SubLObject)kbs_identification.NIL);
                                        SubLObject done_var_$118 = (SubLObject)kbs_identification.NIL;
                                        final SubLObject token_var_$119 = (SubLObject)kbs_identification.NIL;
                                        while (kbs_identification.NIL == done_var_$118) {
                                            final SubLObject meta_a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$119);
                                            final SubLObject valid_$120 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$119.eql(meta_a));
                                            if (kbs_identification.NIL != valid_$120) {
                                                final SubLObject a = assertions_high.gaf_arg1(meta_a);
                                                kbs_handle_preremoved_assertion(a, predicate);
                                            }
                                            done_var_$118 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == valid_$120);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$117 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (kbs_identification.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == valid);
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
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$117, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$116, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else if (kbs_identification.NIL != el_utilities.kappa_predicate_p(preremoved_assertion_identifying_predicate)) {
                final SubLObject kappa = preremoved_assertion_identifying_predicate;
                if (kbs_identification.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !kbs_identification.ONE_INTEGER.numE(el_utilities.kappa_predicate_arity(kappa))) {
                    Errors.error((SubLObject)kbs_identification.$str102$Only_unary_KAPPA_predicates_suppo, kappa);
                }
                SubLObject assertions = (SubLObject)kbs_identification.NIL;
                final SubLObject str2 = Sequences.cconcatenate((SubLObject)kbs_identification.$str103$Identifying_, new SubLObject[] { format_nil.format_nil_s_no_copy(kappa), kbs_identification.$str101$_assertions });
                final SubLObject _prev_bind_9 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_13 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_14 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_15 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_16 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kbs_identification.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((kbs_identification.NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kbs_identification.T), thread);
                    utilities_macros.noting_progress_preamble(str2);
                    assertions = kbs_get_kappa_specified_assertions(kappa);
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_16, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_15, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_14, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_13, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_12, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_9, thread);
                }
                if (kbs_identification.NIL == assertions) {
                    Errors.warn((SubLObject)kbs_identification.$str104$_PREREMOVED_ASSERTIONS_specificat, kappa);
                }
                else {
                    Errors.warn((SubLObject)kbs_identification.$str105$Applying__PREREMOVED_ASSERTIONS_s, kappa);
                    final SubLObject list_var = assertions;
                    final SubLObject _prev_bind_17 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_18 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_19 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_20 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_21 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_22 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_23 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_24 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)((kbs_identification.NIL != Sequences.cconcatenate((SubLObject)kbs_identification.$str100$Preremoving_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(assertions)), kbs_identification.$str106$_assertions_indentified_by_Kappa_ })) ? Sequences.cconcatenate((SubLObject)kbs_identification.$str100$Preremoving_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(assertions)), kbs_identification.$str106$_assertions_indentified_by_Kappa_ }) : kbs_identification.$str59$cdolist), thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_identification.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_identification.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject assertion = (SubLObject)kbs_identification.NIL;
                            assertion = csome_list_var.first();
                            while (kbs_identification.NIL != csome_list_var) {
                                kbs_handle_preremoved_assertion(assertion, (SubLObject)kbs_identification.UNPROVIDED);
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kbs_identification.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                assertion = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$118 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_24, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_23, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_22, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_21, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_20, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_19, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_18, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_17, thread);
                    }
                    Errors.warn((SubLObject)kbs_identification.$str107$Finished_applying__A___, kappa);
                }
            }
            else {
                Errors.error((SubLObject)kbs_identification.$str108$Invalid_pre_removal_specification, preremoved_assertion_identifying_predicate);
            }
            cdolist_list_var = cdolist_list_var.rest();
            preremoved_assertion_identifying_predicate = cdolist_list_var.first();
        }
        if (kbs_identification.NIL == skip_functionsP) {
            do_prerun_kbs_fns();
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 40132L)
    public static SubLObject kbs_get_kappa_specified_assertions(final SubLObject kappa) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = el_utilities.kappa_predicate_query(kappa);
        final SubLObject variable = el_utilities.kappa_predicate_formal_args(kappa).first();
        final SubLObject v_bindings = ask_utilities.query_variable(variable, query, kbs_identification.$const2$InferencePSC, kbs_identification.$kbs_kappa_query_settings$.getDynamicValue(thread));
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 40495L)
    public static SubLObject kbs_handle_preremoved_assertion(final SubLObject a, SubLObject pred) {
        if (pred == kbs_identification.UNPROVIDED) {
            pred = (SubLObject)kbs_identification.NIL;
        }
        if (kbs_identification.NIL != assertion_handles.assertion_p(a) && kbs_identification.NIL != assertion_handles.valid_assertionP(a, (SubLObject)kbs_identification.UNPROVIDED)) {
            Errors.warn((SubLObject)kbs_identification.$str109$Killing__A_assertion_for_KB_subse, (SubLObject)((kbs_identification.NIL != forts.fort_p(pred)) ? pred : kbs_identification.$str110$an), a);
            cyc_kernel.cyc_unassert(canon_tl.assertion_tl_ist_formula(a), assertions_high.assertion_mt(a));
        }
        return a;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 40808L)
    public static SubLObject do_prerun_kbs_fns() {
        SubLObject cdolist_list_var = kbs_utilities.get_kbs_prerun_fns();
        SubLObject prerun_fn = (SubLObject)kbs_identification.NIL;
        prerun_fn = cdolist_list_var.first();
        while (kbs_identification.NIL != cdolist_list_var) {
            if (prerun_fn.isFunctionSpec()) {
                format_nil.force_format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str111$prerun__Calling__A__, prerun_fn, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                Functions.funcall(prerun_fn);
            }
            cdolist_list_var = cdolist_list_var.rest();
            prerun_fn = cdolist_list_var.first();
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 41029L)
    public static SubLObject identify_kbs_forts_and_assertions() {
        clear_kbs_state();
        prepare_kbs_kb_destructive((SubLObject)kbs_identification.T);
        identify_kbs_forts();
        identify_kbs_assertions();
        identify_kbs_deductions();
        kbs_identification.$kbs_state_validP$.setDynamicValue((SubLObject)kbs_identification.T);
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 41298L)
    public static SubLObject identify_kbs_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_kbs_state();
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)kbs_identification.TEN_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kbs_identification.T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                compute_kbs_constants();
                compute_kbs_forts();
                compute_kbs_definitional_predicates();
                compute_kbs_definitional_rules();
            }
            finally {
                final SubLObject _prev_bind_0_$123 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$123, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        kbs_identification.$kbs_fort_state_validP$.setDynamicValue((SubLObject)kbs_identification.T, thread);
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 41682L)
    public static SubLObject do_post_identify_kbs_forts_fns() {
        SubLObject cdolist_list_var = kbs_utilities.get_kbs_post_identify_forts_fns();
        SubLObject post_identify_forts_fn = (SubLObject)kbs_identification.NIL;
        post_identify_forts_fn = cdolist_list_var.first();
        while (kbs_identification.NIL != cdolist_list_var) {
            if (post_identify_forts_fn.isFunctionSpec()) {
                format_nil.force_format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str112$post_kbs_forts__Calling__A___, post_identify_forts_fn, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                Functions.funcall(post_identify_forts_fn);
            }
            cdolist_list_var = cdolist_list_var.rest();
            post_identify_forts_fn = cdolist_list_var.first();
        }
        perform_limitation_motivated_post_identify_cleanups();
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 42120L)
    public static SubLObject perform_limitation_motivated_post_identify_cleanups() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bad_narts = (SubLObject)kbs_identification.ZERO_INTEGER;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = (SubLObject)kbs_identification.$str113$POST_KBS_FORTS__Unmark_NARTs_that;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kbs_identification.ZERO_INTEGER;
        assert kbs_identification.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_identification.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_identification.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$124 = idx;
                if (kbs_identification.NIL == id_index.id_index_objects_empty_p(idx_$124, (SubLObject)kbs_identification.$kw29$SKIP)) {
                    final SubLObject idx_$125 = idx_$124;
                    if (kbs_identification.NIL == id_index.id_index_dense_objects_empty_p(idx_$125, (SubLObject)kbs_identification.$kw29$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$125);
                        final SubLObject backwardP_var = (SubLObject)kbs_identification.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject n;
                        SubLObject formula;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_identification.NIL, v_iteration = (SubLObject)kbs_identification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_identification.ONE_INTEGER)) {
                            id = ((kbs_identification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_identification.ONE_INTEGER) : v_iteration);
                            n = Vectors.aref(vector_var, id);
                            if (kbs_identification.NIL == id_index.id_index_tombstone_p(n) || kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) {
                                if (kbs_identification.NIL != id_index.id_index_tombstone_p(n)) {
                                    n = (SubLObject)kbs_identification.$kw29$SKIP;
                                }
                                formula = narts_high.nart_hl_formula(n);
                                if (kbs_identification.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym114$ASSERTION_P), cycl_utilities.el_formula_args(formula, (SubLObject)kbs_identification.UNPROVIDED), (SubLObject)kbs_identification.UNPROVIDED)) {
                                    unmark_kbs_fort(n);
                                    bad_narts = Numbers.add(bad_narts, (SubLObject)kbs_identification.ONE_INTEGER);
                                    format_nil.force_format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str115$__Unmarking_NART__A_with_formula_, nart_handles.nart_id(n), formula, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kbs_identification.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$126 = idx_$124;
                    if (kbs_identification.NIL == id_index.id_index_sparse_objects_empty_p(idx_$126) || kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$126);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$126);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$126);
                        final SubLObject v_default = (SubLObject)((kbs_identification.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) ? kbs_identification.NIL : kbs_identification.$kw29$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject n2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP) || kbs_identification.NIL == id_index.id_index_tombstone_p(n2)) {
                                final SubLObject formula2 = narts_high.nart_hl_formula(n2);
                                if (kbs_identification.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kbs_identification.$sym114$ASSERTION_P), cycl_utilities.el_formula_args(formula2, (SubLObject)kbs_identification.UNPROVIDED), (SubLObject)kbs_identification.UNPROVIDED)) {
                                    unmark_kbs_fort(n2);
                                    bad_narts = Numbers.add(bad_narts, (SubLObject)kbs_identification.ONE_INTEGER);
                                    format_nil.force_format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str115$__Unmarking_NART__A_with_formula_, nart_handles.nart_id(n2), formula2, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kbs_identification.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kbs_identification.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$127 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$127, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        if (bad_narts.isZero()) {
            format_nil.force_format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str116$__No_NARTs_had_to_be_unmarked___, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
        }
        else {
            format_nil.force_format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str117$___A_NARTs_with_HL_assertions_as_, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 43201L)
    public static SubLObject identify_kbs_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)kbs_identification.TEN_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kbs_identification.T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                compute_kbs_assertions();
            }
            finally {
                final SubLObject _prev_bind_0_$128 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 43453L)
    public static SubLObject do_post_identify_kbs_assertions_fns() {
        SubLObject cdolist_list_var = kbs_utilities.get_kbs_post_identify_assertions_fns();
        SubLObject post_identify_assertions_fn = (SubLObject)kbs_identification.NIL;
        post_identify_assertions_fn = cdolist_list_var.first();
        while (kbs_identification.NIL != cdolist_list_var) {
            if (post_identify_assertions_fn.isFunctionSpec()) {
                format_nil.force_format((SubLObject)kbs_identification.T, (SubLObject)kbs_identification.$str118$post_kbs_assertions__Calling__A__, post_identify_assertions_fn, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED, (SubLObject)kbs_identification.UNPROVIDED);
                Functions.funcall(post_identify_assertions_fn);
            }
            cdolist_list_var = cdolist_list_var.rest();
            post_identify_assertions_fn = cdolist_list_var.first();
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 43969L)
    public static SubLObject identify_kbs_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)kbs_identification.TEN_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kbs_identification.T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                compute_kbs_deductions();
            }
            finally {
                final SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 44226L)
    public static SubLObject clear_kbs_state() {
        kbs_identification.$kbs_fort_state_validP$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_state_validP$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_raw_constants$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_raw_constants_table$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_raw_constants_omission_table$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_skolems$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_constants$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_constant_table$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_narts$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_forts$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_fort_table$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_definitional_constant_table$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_definitional_predicate_table$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_assertion_table$.setDynamicValue((SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_deduction_table$.setDynamicValue((SubLObject)kbs_identification.NIL);
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 45057L)
    public static SubLObject why_kbs_state_invalidP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.NIL == kbs_identification.$kbs_raw_constants$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)kbs_identification.$str119$_kbs_raw_constants__is_null_);
        }
        if (!kbs_identification.$kbs_raw_constants_table$.getDynamicValue(thread).isHashtable()) {
            Errors.warn((SubLObject)kbs_identification.$str120$_kbs_raw_constants_table__is_null);
        }
        if (!kbs_identification.$kbs_raw_constants_omission_table$.getDynamicValue(thread).isHashtable()) {
            Errors.warn((SubLObject)kbs_identification.$str121$_kbs_raw_constants_omission_table);
        }
        if (kbs_identification.NIL == kbs_identification.$kbs_skolems$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)kbs_identification.$str122$_kbs_skolems__is_null_);
        }
        if (kbs_identification.NIL == kbs_identification.$kbs_constants$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)kbs_identification.$str123$_kbs_constants__is_null_);
        }
        if (kbs_identification.NIL == keyhash.keyhash_p(kbs_identification.$kbs_constant_table$.getDynamicValue(thread))) {
            Errors.warn((SubLObject)kbs_identification.$str124$_kbs_constant_table__is_null_);
        }
        if (kbs_identification.NIL == kbs_identification.$kbs_narts$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)kbs_identification.$str125$_kbs_narts__is_null_);
        }
        if (kbs_identification.NIL == kbs_identification.$kbs_forts$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)kbs_identification.$str126$_kbs_forts__is_null_);
        }
        if (kbs_identification.NIL == keyhash.keyhash_p(kbs_identification.$kbs_fort_table$.getDynamicValue(thread))) {
            Errors.warn((SubLObject)kbs_identification.$str127$_kbs_fort_table__is_null_);
        }
        if (!kbs_identification.$kbs_definitional_constant_table$.getDynamicValue(thread).isHashtable()) {
            Errors.warn((SubLObject)kbs_identification.$str128$_kbs_definitional_constant_table_);
        }
        if (!kbs_identification.$kbs_definitional_predicate_table$.getDynamicValue(thread).isHashtable()) {
            Errors.warn((SubLObject)kbs_identification.$str129$_kbs_definitional_predicate_table);
        }
        if (kbs_identification.NIL == keyhash.keyhash_p(kbs_identification.$kbs_assertion_table$.getDynamicValue(thread))) {
            Errors.warn((SubLObject)kbs_identification.$str130$_kbs_assertion_table__is_null_);
        }
        if (kbs_identification.NIL == keyhash.keyhash_p(kbs_identification.$kbs_deduction_table$.getDynamicValue(thread))) {
            Errors.warn((SubLObject)kbs_identification.$str131$_kbs_deduction_table__is_null_);
        }
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 46376L)
    public static SubLObject kbs_statistics(SubLObject stream) {
        if (stream == kbs_identification.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject fort_count = kbs_fort_count();
        final SubLObject constant_count = kbs_constant_count();
        final SubLObject nart_count = kbs_nart_count();
        final SubLObject assertion_count = kbs_assertion_count();
        final SubLObject deduction_count = kbs_deduction_count();
        final SubLObject definitional_constant_count = kbs_definitional_constant_count();
        PrintLow.format(stream, (SubLObject)kbs_identification.$str132$______KB__S_KBS_statistics__, control_vars.kb_loaded());
        PrintLow.format(stream, (SubLObject)kbs_identification.$str133$__FORTs___________7___D__, fort_count);
        PrintLow.format(stream, (SubLObject)kbs_identification.$str134$___Constants______7___D__, constant_count);
        if (definitional_constant_count.isPositive()) {
            PrintLow.format(stream, (SubLObject)kbs_identification.$str135$_____def_only_____7___D__, definitional_constant_count);
        }
        PrintLow.format(stream, (SubLObject)kbs_identification.$str136$___NARTs__________7___D__, nart_count);
        PrintLow.format(stream, (SubLObject)kbs_identification.$str137$__Assertions______7___D__, assertion_count);
        PrintLow.format(stream, (SubLObject)kbs_identification.$str138$__Deductions______7___D__, deduction_count);
        streams_high.terpri(stream);
        return (SubLObject)kbs_identification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 47285L)
    public static SubLObject kbs_fort_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.NIL != kbs_identification.$kbs_fort_table$.getDynamicValue(thread)) {
            return keyhash.keyhash_count(kbs_identification.$kbs_fort_table$.getDynamicValue(thread));
        }
        return (SubLObject)kbs_identification.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 47406L)
    public static SubLObject kbs_constant_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.NIL != kbs_identification.$kbs_constant_table$.getDynamicValue(thread)) {
            return keyhash.keyhash_count(kbs_identification.$kbs_constant_table$.getDynamicValue(thread));
        }
        return (SubLObject)kbs_identification.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 47539L)
    public static SubLObject kbs_nart_count() {
        return Numbers.subtract(kbs_fort_count(), kbs_constant_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 47624L)
    public static SubLObject kbs_definitional_constant_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.NIL != kbs_identification.$kbs_definitional_constant_table$.getDynamicValue(thread)) {
            return Hashtables.hash_table_count(kbs_identification.$kbs_definitional_constant_table$.getDynamicValue(thread));
        }
        return (SubLObject)kbs_identification.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 47799L)
    public static SubLObject kbs_assertion_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.NIL != kbs_identification.$kbs_assertion_table$.getDynamicValue(thread)) {
            return keyhash.keyhash_count(kbs_identification.$kbs_assertion_table$.getDynamicValue(thread));
        }
        return (SubLObject)kbs_identification.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 47935L)
    public static SubLObject kbs_deduction_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_identification.NIL != kbs_identification.$kbs_deduction_table$.getDynamicValue(thread)) {
            return keyhash.keyhash_count(kbs_identification.$kbs_deduction_table$.getDynamicValue(thread));
        }
        return (SubLObject)kbs_identification.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-identification.lisp", position = 48071L)
    public static SubLObject count_all_kbs_assertions_in_mt(final SubLObject mt, SubLObject type) {
        if (type == kbs_identification.UNPROVIDED) {
            type = (SubLObject)kbs_identification.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kbs_identification.NIL != fort_types_interface.isa_mtP(mt, (SubLObject)kbs_identification.UNPROVIDED) : mt;
        if (kbs_identification.NIL == kbs_state_validP()) {
            Errors.warn((SubLObject)kbs_identification.$str140$No_valid_KBS_available_);
            return (SubLObject)kbs_identification.NIL;
        }
        SubLObject count = (SubLObject)kbs_identification.ZERO_INTEGER;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(function_terms.naut_to_nart(mt));
        if (pcase_var.eql((SubLObject)kbs_identification.$kw141$MT)) {
            if (kbs_identification.NIL != kb_mapping_macros.do_mt_index_key_validator(function_terms.naut_to_nart(mt), type)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(function_terms.naut_to_nart(mt));
                SubLObject final_index_iterator = (SubLObject)kbs_identification.NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, type, (SubLObject)kbs_identification.NIL, (SubLObject)kbs_identification.NIL);
                    SubLObject done_var = (SubLObject)kbs_identification.NIL;
                    final SubLObject token_var = (SubLObject)kbs_identification.NIL;
                    while (kbs_identification.NIL == done_var) {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(assertion));
                        if (kbs_identification.NIL != valid && kbs_identification.NIL != kbs_assertion_p(assertion)) {
                            count = Numbers.add(count, (SubLObject)kbs_identification.ONE_INTEGER);
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbs_identification.NIL == valid);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (kbs_identification.NIL != final_index_iterator) {
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
        else if (pcase_var.eql((SubLObject)kbs_identification.$kw142$BROAD_MT) && kbs_identification.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(function_terms.naut_to_nart(mt), type)) {
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)kbs_identification.$str143$do_broad_mt_index;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kbs_identification.ZERO_INTEGER;
            assert kbs_identification.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_identification.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_identification.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_identification.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$130 = idx;
                    if (kbs_identification.NIL == id_index.id_index_objects_empty_p(idx_$130, (SubLObject)kbs_identification.$kw29$SKIP)) {
                        final SubLObject idx_$131 = idx_$130;
                        if (kbs_identification.NIL == id_index.id_index_dense_objects_empty_p(idx_$131, (SubLObject)kbs_identification.$kw29$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$131);
                            final SubLObject backwardP_var = (SubLObject)kbs_identification.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_identification.NIL, v_iteration = (SubLObject)kbs_identification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_identification.ONE_INTEGER)) {
                                a_id = ((kbs_identification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_identification.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (kbs_identification.NIL == id_index.id_index_tombstone_p(a_handle) || kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) {
                                    if (kbs_identification.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)kbs_identification.$kw29$SKIP;
                                    }
                                    assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (kbs_identification.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, function_terms.naut_to_nart(mt), type, (SubLObject)kbs_identification.NIL) && kbs_identification.NIL != kbs_assertion_p(assertion2)) {
                                        count = Numbers.add(count, (SubLObject)kbs_identification.ONE_INTEGER);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_identification.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$132 = idx_$130;
                        if (kbs_identification.NIL == id_index.id_index_sparse_objects_empty_p(idx_$132) || kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$132);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$132);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$132);
                            final SubLObject v_default = (SubLObject)((kbs_identification.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP)) ? kbs_identification.NIL : kbs_identification.$kw29$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (kbs_identification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_identification.$kw29$SKIP) || kbs_identification.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (kbs_identification.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, function_terms.naut_to_nart(mt), type, (SubLObject)kbs_identification.NIL) && kbs_identification.NIL != kbs_assertion_p(assertion3)) {
                                        count = Numbers.add(count, (SubLObject)kbs_identification.ONE_INTEGER);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_identification.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)kbs_identification.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$133 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_identification.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$133, thread);
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
        return count;
    }
    
    public static SubLObject declare_kbs_identification_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_raw_constants", "KBS-RAW-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_raw_constant_p", "KBS-RAW-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "why_kbs_raw_constantP", "WHY-KBS-RAW-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "non_kbs_raw_constant_p", "NON-KBS-RAW-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "why_non_kbs_raw_constantP", "WHY-NON-KBS-RAW-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_raw_constant_omitted_p", "KBS-RAW-CONSTANT-OMITTED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_raw_el_formula_p", "KBS-RAW-EL-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "non_kbs_raw_el_formula_p", "NON-KBS-RAW-EL-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "reset_kbs_raw_constant_tables", "RESET-KBS-RAW-CONSTANT-TABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_raw_constants", "COMPUTE-KBS-RAW-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "clear_kbs_kbq_query_set_terms", "CLEAR-KBS-KBQ-QUERY-SET-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "remove_kbs_kbq_query_set_terms", "REMOVE-KBS-KBQ-QUERY-SET-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_kbq_query_set_terms_internal", "KBS-KBQ-QUERY-SET-TERMS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_kbq_query_set_terms", "KBS-KBQ-QUERY-SET-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_skolems", "KBS-SKOLEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_skolem_p", "KBS-SKOLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_skolems", "COMPUTE-KBS-SKOLEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_skolem_p", "COMPUTE-KBS-SKOLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_skolem_assertion_p", "COMPUTE-KBS-SKOLEM-ASSERTION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_skolem_assertion_fast_fail_constant_p", "KBS-SKOLEM-ASSERTION-FAST-FAIL-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_constants", "KBS-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_constant_p", "KBS-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "non_kbs_constant_p", "NON-KBS-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "initialize_kbs_constant_table", "INITIALIZE-KBS-CONSTANT-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_constants", "COMPUTE-KBS-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_narts", "KBS-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_nart_p", "KBS-NART-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_nart_formula_p", "KBS-NART-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_narts", "COMPUTE-KBS-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_forts", "KBS-FORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_fort_p", "KBS-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "why_kbs_fortP", "WHY-KBS-FORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "non_kbs_fort_p", "NON-KBS-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "why_non_kbs_fortP", "WHY-NON-KBS-FORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_definitional_fort_p", "KBS-DEFINITIONAL-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "non_kbs_definitional_fort_p", "NON-KBS-DEFINITIONAL-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "initialize_kbs_fort_table", "INITIALIZE-KBS-FORT-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "unmark_kbs_fort", "UNMARK-KBS-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "unmark_kbs_fort_and_dependents", "UNMARK-KBS-FORT-AND-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_forts", "COMPUTE-KBS-FORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_definitional_constant_predicate_sets", "KBS-DEFINITIONAL-CONSTANT-PREDICATE-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_definitional_fort_predicate_sets", "KBS-DEFINITIONAL-FORT-PREDICATE-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_definitional_constant_p", "KBS-DEFINITIONAL-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "non_kbs_definitional_constant_p", "NON-KBS-DEFINITIONAL-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "tree_gather_relevant_kbs_definitional_predicate_sets", "TREE-GATHER-RELEVANT-KBS-DEFINITIONAL-PREDICATE-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_definitional_predicate_set_p", "KBS-DEFINITIONAL-PREDICATE-SET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_definitional_predicate_setL", "KBS-DEFINITIONAL-PREDICATE-SET<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_predicate_definitional_predicate_sets", "KBS-PREDICATE-DEFINITIONAL-PREDICATE-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "all_kbs_definitional_predicates", "ALL-KBS-DEFINITIONAL-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_definitional_predicate_p", "KBS-DEFINITIONAL-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "clear_kbs_definitional_predicate_table", "CLEAR-KBS-DEFINITIONAL-PREDICATE-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "initialize_kbs_definitional_predicate_table", "INITIALIZE-KBS-DEFINITIONAL-PREDICATE-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_definitional_predicates", "COMPUTE-KBS-DEFINITIONAL-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_rule_definitional_predicate_sets", "KBS-RULE-DEFINITIONAL-PREDICATE-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "clear_kbs_definitional_rule_table", "CLEAR-KBS-DEFINITIONAL-RULE-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "initialize_kbs_definitional_rule_table", "INITIALIZE-KBS-DEFINITIONAL-RULE-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_definitional_rules", "COMPUTE-KBS-DEFINITIONAL-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_assertion_table", "KBS-ASSERTION-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_assertion_p", "KBS-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "why_kbs_assertionP", "WHY-KBS-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "non_kbs_assertion_p", "NON-KBS-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "why_non_kbs_assertionP", "WHY-NON-KBS-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "initialize_kbs_assertion_table", "INITIALIZE-KBS-ASSERTION-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "mark_kbs_assertion", "MARK-KBS-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "unmark_kbs_assertion", "UNMARK-KBS-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_assertions", "COMPUTE-KBS-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_assertion_p", "COMPUTE-KBS-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_non_kbs_assertion_p", "COMPUTE-NON-KBS-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_assertion_references_excluded_termsP", "KBS-ASSERTION-REFERENCES-EXCLUDED-TERMS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_definitionally_restricted_assertionP", "KBS-DEFINITIONALLY-RESTRICTED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_deduction_p", "KBS-DEDUCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "non_kbs_deduction_p", "NON-KBS-DEDUCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "initialize_kbs_deduction_table", "INITIALIZE-KBS-DEDUCTION-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_deductions", "COMPUTE-KBS-DEDUCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_deduction_p", "COMPUTE-KBS-DEDUCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "compute_kbs_support_p", "COMPUTE-KBS-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_fort_state_validP", "KBS-FORT-STATE-VALID?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_state_validP", "KBS-STATE-VALID?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "prepare_kbs_kb_destructive", "PREPARE-KBS-KB-DESTRUCTIVE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_get_kappa_specified_assertions", "KBS-GET-KAPPA-SPECIFIED-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_handle_preremoved_assertion", "KBS-HANDLE-PREREMOVED-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "do_prerun_kbs_fns", "DO-PRERUN-KBS-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "identify_kbs_forts_and_assertions", "IDENTIFY-KBS-FORTS-AND-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "identify_kbs_forts", "IDENTIFY-KBS-FORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "do_post_identify_kbs_forts_fns", "DO-POST-IDENTIFY-KBS-FORTS-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "perform_limitation_motivated_post_identify_cleanups", "PERFORM-LIMITATION-MOTIVATED-POST-IDENTIFY-CLEANUPS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "identify_kbs_assertions", "IDENTIFY-KBS-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "do_post_identify_kbs_assertions_fns", "DO-POST-IDENTIFY-KBS-ASSERTIONS-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "identify_kbs_deductions", "IDENTIFY-KBS-DEDUCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "clear_kbs_state", "CLEAR-KBS-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "why_kbs_state_invalidP", "WHY-KBS-STATE-INVALID?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_statistics", "KBS-STATISTICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_fort_count", "KBS-FORT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_constant_count", "KBS-CONSTANT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_nart_count", "KBS-NART-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_definitional_constant_count", "KBS-DEFINITIONAL-CONSTANT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_assertion_count", "KBS-ASSERTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "kbs_deduction_count", "KBS-DEDUCTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_identification", "count_all_kbs_assertions_in_mt", "COUNT-ALL-KBS-ASSERTIONS-IN-MT", 1, 1, false);
        return (SubLObject)kbs_identification.NIL;
    }
    
    public static SubLObject init_kbs_identification_file() {
        kbs_identification.$kbs_raw_constants$ = SubLFiles.defvar("*KBS-RAW-CONSTANTS*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_raw_constants_table$ = SubLFiles.defvar("*KBS-RAW-CONSTANTS-TABLE*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_raw_constants_omission_table$ = SubLFiles.defvar("*KBS-RAW-CONSTANTS-OMISSION-TABLE*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_definitional_constant_table$ = SubLFiles.defvar("*KBS-DEFINITIONAL-CONSTANT-TABLE*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_kbq_query_set_terms_caching_state$ = SubLFiles.deflexical("*KBS-KBQ-QUERY-SET-TERMS-CACHING-STATE*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_skolems$ = SubLFiles.defvar("*KBS-SKOLEMS*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_constants$ = SubLFiles.defvar("*KBS-CONSTANTS*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_constant_table$ = SubLFiles.defvar("*KBS-CONSTANT-TABLE*", Hashtables.make_hash_table((SubLObject)kbs_identification.$int10$1000, Symbols.symbol_function((SubLObject)kbs_identification.EQ), (SubLObject)kbs_identification.UNPROVIDED));
        kbs_identification.$kbs_narts$ = SubLFiles.defvar("*KBS-NARTS*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_forts$ = SubLFiles.defvar("*KBS-FORTS*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_fort_table$ = SubLFiles.defvar("*KBS-FORT-TABLE*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_ordered_definitional_predicate_sets$ = SubLFiles.defvar("*KBS-ORDERED-DEFINITIONAL-PREDICATE-SETS*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_definitional_predicate_table$ = SubLFiles.defvar("*KBS-DEFINITIONAL-PREDICATE-TABLE*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_definitional_rule_table$ = SubLFiles.defvar("*KBS-DEFINITIONAL-RULE-TABLE*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_assertion_table$ = SubLFiles.defvar("*KBS-ASSERTION-TABLE*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_deduction_table$ = SubLFiles.defvar("*KBS-DEDUCTION-TABLE*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_fort_state_validP$ = SubLFiles.defvar("*KBS-FORT-STATE-VALID?*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$kbs_state_validP$ = SubLFiles.defvar("*KBS-STATE-VALID?*", (SubLObject)kbs_identification.NIL);
        kbs_identification.$default_kbs_kappa_query_settings$ = SubLFiles.deflexical("*DEFAULT-KBS-KAPPA-QUERY-SETTINGS*", (SubLObject)kbs_identification.$list99);
        kbs_identification.$kbs_kappa_query_settings$ = SubLFiles.defparameter("*KBS-KAPPA-QUERY-SETTINGS*", kbs_identification.$default_kbs_kappa_query_settings$.getGlobalValue());
        return (SubLObject)kbs_identification.NIL;
    }
    
    public static SubLObject setup_kbs_identification_file() {
        memoization_state.note_globally_cached_function((SubLObject)kbs_identification.$sym46$KBS_KBQ_QUERY_SET_TERMS);
        return (SubLObject)kbs_identification.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kbs_identification_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kbs_identification_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kbs_identification_file();
    }
    
    static {
        me = (SubLFile)new kbs_identification();
        kbs_identification.$kbs_raw_constants$ = null;
        kbs_identification.$kbs_raw_constants_table$ = null;
        kbs_identification.$kbs_raw_constants_omission_table$ = null;
        kbs_identification.$kbs_definitional_constant_table$ = null;
        kbs_identification.$kbs_kbq_query_set_terms_caching_state$ = null;
        kbs_identification.$kbs_skolems$ = null;
        kbs_identification.$kbs_constants$ = null;
        kbs_identification.$kbs_constant_table$ = null;
        kbs_identification.$kbs_narts$ = null;
        kbs_identification.$kbs_forts$ = null;
        kbs_identification.$kbs_fort_table$ = null;
        kbs_identification.$kbs_ordered_definitional_predicate_sets$ = null;
        kbs_identification.$kbs_definitional_predicate_table$ = null;
        kbs_identification.$kbs_definitional_rule_table$ = null;
        kbs_identification.$kbs_assertion_table$ = null;
        kbs_identification.$kbs_deduction_table$ = null;
        kbs_identification.$kbs_fort_state_validP$ = null;
        kbs_identification.$kbs_state_validP$ = null;
        kbs_identification.$default_kbs_kappa_query_settings$ = null;
        kbs_identification.$kbs_kappa_query_settings$ = null;
        $kw0$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const1$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const2$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $str3$Even_though_explicitly_included_v = SubLObjectFactory.makeString("Even though explicitly included via:");
        $const4$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str5$The_constant_is_also_excluded_bec = SubLObjectFactory.makeString("The constant is also excluded because:");
        $const6$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $sym7$NON_KBS_RAW_CONSTANT_P = SubLObjectFactory.makeSymbol("NON-KBS-RAW-CONSTANT-P");
        $sym8$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const9$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $int10$1000 = SubLObjectFactory.makeInteger(1000);
        $kw11$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw12$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw13$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym14$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw15$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str16$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym17$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw18$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str19$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw20$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str21$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str22$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str23$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str25$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym26$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $str27$mapping_Cyc_constants = SubLObjectFactory.makeString("mapping Cyc constants");
        $sym28$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw29$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $const30$CycLConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLConstant"));
        $kw31$GAF = SubLObjectFactory.makeKeyword("GAF");
        $str32$Overriding_constant__A_omission__ = SubLObjectFactory.makeString("Overriding constant ~A omission (~S) due to #$kbsProfileRetainTerm");
        $const33$kbsProfileRetainTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kbsProfileRetainTerm"));
        $const34$kbsProfileRemoveFORT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kbsProfileRemoveFORT"));
        $str35$___S_constants_included_via_the_c = SubLObjectFactory.makeString("~&~S constants included via the collections : ~S~%");
        $str36$___S_constants_omitted_via_the__A = SubLObjectFactory.makeString("~&~S constants omitted via the ~A ~A: ~A ~A~%");
        $str37$collections_ = SubLObjectFactory.makeString("collections ");
        $str38$ = SubLObjectFactory.makeString("");
        $str39$_predicate_ = SubLObjectFactory.makeString("/predicate ");
        $str40$___S_total_constants_included___ = SubLObjectFactory.makeString("~&~S total constants included.~%");
        $str41$___S_total_constants_omitted___ = SubLObjectFactory.makeString("~&~S total constants omitted.~%");
        $str42$__Omitted_constants__ = SubLObjectFactory.makeString("~&Omitted constants: ");
        $str43$_A_ = SubLObjectFactory.makeString("~A ");
        $str44$__ = SubLObjectFactory.makeString("~%");
        $str45$____S_total_raw_KBS_constants_ide = SubLObjectFactory.makeString(" ~&~S total raw KBS constants identified.~%");
        $sym46$KBS_KBQ_QUERY_SET_TERMS = SubLObjectFactory.makeSymbol("KBS-KBQ-QUERY-SET-TERMS");
        $const47$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $sym48$_Q = SubLObjectFactory.makeSymbol("?Q");
        $const49$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym50$_T = SubLObjectFactory.makeSymbol("?T");
        $const51$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("testQuery")), (SubLObject)SubLObjectFactory.makeSymbol("?T"), (SubLObject)SubLObjectFactory.makeSymbol("?Q")));
        $int53$300 = SubLObjectFactory.makeInteger(300);
        $sym54$_KBS_KBQ_QUERY_SET_TERMS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*KBS-KBQ-QUERY-SET-TERMS-CACHING-STATE*");
        $str55$Continue = SubLObjectFactory.makeString("Continue");
        $str56$compute_kbs_skolems_requirements_ = SubLObjectFactory.makeString("compute-kbs-skolems requirements not met.");
        $const57$SkolemFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunction"));
        $str58$Computing_KBS_skolems = SubLObjectFactory.makeString("Computing KBS skolems");
        $str59$cdolist = SubLObjectFactory.makeString("cdolist");
        $str60$____S_total_KBS_skolems_identifie = SubLObjectFactory.makeString(" ~&~S total KBS skolems identified.");
        $sym61$KBS_SKOLEM_ASSERTION_FAST_FAIL_CONSTANT_P = SubLObjectFactory.makeSymbol("KBS-SKOLEM-ASSERTION-FAST-FAIL-CONSTANT-P");
        $str62$akb = SubLObjectFactory.makeString("akb");
        $const63$TKBTerm_Proprietary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBTerm-Proprietary"));
        $const64$ProprietaryTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProprietaryTerm"));
        $str65$cyfi = SubLObjectFactory.makeString("cyfi");
        $const66$Cy_FiProprietaryTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cy-FiProprietaryTerm"));
        $const67$ResearchCycConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResearchCycConstant"));
        $const68$ScaffoldingConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScaffoldingConstant"));
        $const69$TerroristAgent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAgent"));
        $const70$TerroristAct = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAct"));
        $const71$HostileSocialAction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HostileSocialAction"));
        $str72$research = SubLObjectFactory.makeString("research");
        $sym73$NON_KBS_CONSTANT_P = SubLObjectFactory.makeSymbol("NON-KBS-CONSTANT-P");
        $str74$Computing_KBS_narts = SubLObjectFactory.makeString("Computing KBS narts");
        $str75$____S_total_KBS_NARTs_identified_ = SubLObjectFactory.makeString(" ~&~S total KBS NARTs identified.~%");
        $str76$All_KB_subset_requirements_met_ = SubLObjectFactory.makeString("All KB subset requirements met.");
        $str77$Also__the_following_GAFs_will_be_ = SubLObjectFactory.makeString("Also, the following GAFs will be spliced in:");
        $kw78$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $sym79$NON_KBS_FORT_P = SubLObjectFactory.makeSymbol("NON-KBS-FORT-P");
        $str80$The_term_contains_terms_not_in_th = SubLObjectFactory.makeString("The term contains terms not in the KB subset:");
        $sym81$KBS_DEFINITIONAL_FORT_P = SubLObjectFactory.makeSymbol("KBS-DEFINITIONAL-FORT-P");
        $sym82$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym83$KBS_DEFINITIONAL_FORT_PREDICATE_SETS = SubLObjectFactory.makeSymbol("KBS-DEFINITIONAL-FORT-PREDICATE-SETS");
        $sym84$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym85$KBS_DEFINITIONAL_PREDICATE_SET_ = SubLObjectFactory.makeSymbol("KBS-DEFINITIONAL-PREDICATE-SET<");
        $sym86$KBS_DEFINITIONAL_PREDICATE_SET_P = SubLObjectFactory.makeSymbol("KBS-DEFINITIONAL-PREDICATE-SET-P");
        $str87$The_assertion_s_microtheory_is_no = SubLObjectFactory.makeString("The assertion's microtheory is not in the KB subset:");
        $str88$The_assertion_was_explicitly_omit = SubLObjectFactory.makeString("The assertion was explicitly omitted via #$kbsProfileRemoveAssertion");
        $str89$The_assertion_s_formula_contains_ = SubLObjectFactory.makeString("The assertion's formula contains FORTs not in the KB subset:");
        $str90$The_assertion_is_definitional_bec = SubLObjectFactory.makeString("The assertion is definitional because:");
        $str91$__The_predicate_is_definitional_ = SubLObjectFactory.makeString("- The predicate is definitional:");
        $str92$__The_predicate_is_not_definition = SubLObjectFactory.makeString("- The predicate is not definitional.");
        $str93$__But_the_assertion_contains_defi = SubLObjectFactory.makeString("- But the assertion contains definitional terms for the KBS sections with the predicate sets:");
        $str94$The_assertion_is_a_rule_containin = SubLObjectFactory.makeString("The assertion is a rule containing definitional FORTs:");
        $str95$Computing_KBS_assertions = SubLObjectFactory.makeString("Computing KBS assertions");
        $sym96$COMPUTE_NON_KBS_ASSERTION_P = SubLObjectFactory.makeSymbol("COMPUTE-NON-KBS-ASSERTION-P");
        $str97$Computing_KBS_deductions = SubLObjectFactory.makeString("Computing KBS deductions");
        $sym98$KBS_RAW_CONSTANT_OMITTED_P = SubLObjectFactory.makeSymbol("KBS-RAW-CONSTANT-OMITTED-P");
        $list99 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("CONTINUABLE?"), kbs_identification.NIL, SubLObjectFactory.makeKeyword("MAX-NUMBER"), kbs_identification.NIL, SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), kbs_identification.NIL, SubLObjectFactory.makeKeyword("INFERENCE-MODE"), SubLObjectFactory.makeKeyword("MINIMAL"), SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS"), SubLObjectFactory.makeKeyword("BINDINGS"), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL") });
        $str100$Preremoving_ = SubLObjectFactory.makeString("Preremoving ");
        $str101$_assertions = SubLObjectFactory.makeString(" assertions");
        $str102$Only_unary_KAPPA_predicates_suppo = SubLObjectFactory.makeString("Only unary KAPPA predicates supported, not ~A.");
        $str103$Identifying_ = SubLObjectFactory.makeString("Identifying ");
        $str104$_PREREMOVED_ASSERTIONS_specificat = SubLObjectFactory.makeString(":PREREMOVED-ASSERTIONS specification ~A picked out no assertions.~%");
        $str105$Applying__PREREMOVED_ASSERTIONS_s = SubLObjectFactory.makeString("Applying :PREREMOVED-ASSERTIONS specification ~A .....~%");
        $str106$_assertions_indentified_by_Kappa_ = SubLObjectFactory.makeString(" assertions indentified by Kappa predicate");
        $str107$Finished_applying__A___ = SubLObjectFactory.makeString("Finished applying ~A.~%");
        $str108$Invalid_pre_removal_specification = SubLObjectFactory.makeString("Invalid pre-removal specification ~A.");
        $str109$Killing__A_assertion_for_KB_subse = SubLObjectFactory.makeString("Killing ~A assertion for KB subset: ~A~%");
        $str110$an = SubLObjectFactory.makeString("an");
        $str111$prerun__Calling__A__ = SubLObjectFactory.makeString("prerun: Calling ~A~%");
        $str112$post_kbs_forts__Calling__A___ = SubLObjectFactory.makeString("post-kbs-forts: Calling ~A.~%");
        $str113$POST_KBS_FORTS__Unmark_NARTs_that = SubLObjectFactory.makeString("POST-KBS-FORTS: Unmark NARTs that have HL assertions as arguments");
        $sym114$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str115$__Unmarking_NART__A_with_formula_ = SubLObjectFactory.makeString("~&Unmarking NART ~A with formula ~A ....~%");
        $str116$__No_NARTs_had_to_be_unmarked___ = SubLObjectFactory.makeString("~&No NARTs had to be unmarked.~%");
        $str117$___A_NARTs_with_HL_assertions_as_ = SubLObjectFactory.makeString("~&~A NARTs with HL assertions as arguments unmarked.~%");
        $str118$post_kbs_assertions__Calling__A__ = SubLObjectFactory.makeString("post-kbs-assertions: Calling ~A~%");
        $str119$_kbs_raw_constants__is_null_ = SubLObjectFactory.makeString("*kbs-raw-constants* is null.");
        $str120$_kbs_raw_constants_table__is_null = SubLObjectFactory.makeString("*kbs-raw-constants-table* is null.");
        $str121$_kbs_raw_constants_omission_table = SubLObjectFactory.makeString("*kbs-raw-constants-omission-table* is null.");
        $str122$_kbs_skolems__is_null_ = SubLObjectFactory.makeString("*kbs-skolems* is null.");
        $str123$_kbs_constants__is_null_ = SubLObjectFactory.makeString("*kbs-constants* is null.");
        $str124$_kbs_constant_table__is_null_ = SubLObjectFactory.makeString("*kbs-constant-table* is null.");
        $str125$_kbs_narts__is_null_ = SubLObjectFactory.makeString("*kbs-narts* is null.");
        $str126$_kbs_forts__is_null_ = SubLObjectFactory.makeString("*kbs-forts* is null.");
        $str127$_kbs_fort_table__is_null_ = SubLObjectFactory.makeString("*kbs-fort-table* is null.");
        $str128$_kbs_definitional_constant_table_ = SubLObjectFactory.makeString("*kbs-definitional-constant-table* is null.");
        $str129$_kbs_definitional_predicate_table = SubLObjectFactory.makeString("*kbs-definitional-predicate-table* is null.");
        $str130$_kbs_assertion_table__is_null_ = SubLObjectFactory.makeString("*kbs-assertion-table* is null.");
        $str131$_kbs_deduction_table__is_null_ = SubLObjectFactory.makeString("*kbs-deduction-table* is null.");
        $str132$______KB__S_KBS_statistics__ = SubLObjectFactory.makeString("~&;;; KB ~S KBS statistics~%");
        $str133$__FORTs___________7___D__ = SubLObjectFactory.makeString("~&FORTs        : ~7,' D~%");
        $str134$___Constants______7___D__ = SubLObjectFactory.makeString("~& Constants   : ~7,' D~%");
        $str135$_____def_only_____7___D__ = SubLObjectFactory.makeString("~&  (def only) : ~7,' D~%");
        $str136$___NARTs__________7___D__ = SubLObjectFactory.makeString("~& NARTs       : ~7,' D~%");
        $str137$__Assertions______7___D__ = SubLObjectFactory.makeString("~&Assertions   : ~7,' D~%");
        $str138$__Deductions______7___D__ = SubLObjectFactory.makeString("~&Deductions   : ~7,' D~%");
        $sym139$ISA_MT_ = SubLObjectFactory.makeSymbol("ISA-MT?");
        $str140$No_valid_KBS_available_ = SubLObjectFactory.makeString("No valid KBS available!");
        $kw141$MT = SubLObjectFactory.makeKeyword("MT");
        $kw142$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $str143$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
    }
}

/*

	Total time: 8188 ms
	
*/