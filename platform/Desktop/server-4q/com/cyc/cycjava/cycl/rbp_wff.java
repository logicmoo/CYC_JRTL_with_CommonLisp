package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
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
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rbp_wff extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rbp_wff";
    public static final String myFingerPrint = "f0e7453630eaa5b791755b8e7633e4ef7c1f31b721fff38243d0fce330c0c6de";
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 971L)
    public static SubLSymbol $rbp_wff_check_time$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 1087L)
    private static SubLSymbol $rbp_wff_checks_total$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 1176L)
    private static SubLSymbol $rbp_wff_checks_failed$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 1288L)
    public static SubLSymbol $rbp_show_non_wffP$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 1403L)
    private static SubLSymbol $rbp_wff_validation_count$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 1526L)
    private static SubLSymbol $rbp_wff_validation_false_pos$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 1665L)
    private static SubLSymbol $rbp_wff_validation_false_neg$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 1741L)
    private static SubLSymbol $rbp_wff_validate_setting$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 1894L)
    private static SubLSymbol $rbp_vocabulary_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 1951L)
    private static SubLSymbol $rbp_wff_quaternary_rmps$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 3247L)
    private static SubLSymbol $rbp_wf_nat_externalP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 4332L)
    private static SubLSymbol $rbp_wf_template_argsP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 7100L)
    public static SubLSymbol $rbp_wff_check_visibilityP$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 9199L)
    private static SubLSymbol $rbp_wf_natP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 16474L)
    private static SubLSymbol $rbp_wff_find_floor_mts_int_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 20765L)
    private static SubLSymbol $rbp_defining_mts_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 23108L)
    private static SubLSymbol $rbp_wff_test_fails_intP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 25583L)
    private static SubLSymbol $rbp_wff_constraints_prim_int_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 27936L)
    public static SubLSymbol $rbp_known_false_equals_non_wffP$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38225L)
    public static SubLSymbol $inter_arg_isa_predicate_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38421L)
    public static SubLSymbol $arg_not_isa_predicate_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38610L)
    private static SubLSymbol $rbp_get_iai_pred_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38879L)
    private static SubLSymbol $rbp_get_ani_pred_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 41196L)
    private static SubLSymbol $rbp_validate_iani_pairsP$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 43656L)
    private static SubLSymbol $rbp_wff_type_level_arg_nums_for_fn_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 45036L)
    private static SubLSymbol $rbp_wff_subcol_fns$;
    private static final SubLSymbol $sym0$_RBP_WFF_VALIDATION_COUNT_;
    private static final SubLSymbol $sym1$_RBP_WFF_VALIDATION_FALSE_POS_;
    private static final SubLSymbol $sym2$_RBP_WFF_VALIDATION_FALSE_NEG_;
    private static final SubLSymbol $sym3$_RBP_WFF_VALIDATE_SETTING_;
    private static final SubLSymbol $sym4$_RBP_VOCABULARY_MTS_;
    private static final SubLSymbol $kw5$UNINITIALIZED;
    private static final SubLSymbol $sym6$_RBP_WFF_QUATERNARY_RMPS_;
    private static final SubLString $str7$__Performed__D_wff_check_validati;
    private static final SubLList $list8;
    private static final SubLString $str9$__Found__D_false_positives___;
    private static final SubLString $str10$____S__;
    private static final SubLList $list11;
    private static final SubLString $str12$__Found__D_false_negatives___;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$PROGN;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$CLET;
    private static final SubLSymbol $sym18$RBP_WFF_VALIDATION_REPORT;
    private static final SubLSymbol $sym19$RBP_WF_NAT_EXTERNAL_;
    private static final SubLSymbol $sym20$_RBP_WF_NAT_EXTERNAL__CACHING_STATE_;
    private static final SubLInteger $int21$256;
    private static final SubLSymbol $kw22$REPLACE_ME;
    private static final SubLSymbol $sym23$RBP_WF_TEMPLATE_ARGS_;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$KEYWORDP;
    private static final SubLSymbol $kw26$ISA;
    private static final SubLSymbol $sym27$RBP_WFF_MAYBE_ISA_;
    private static final SubLSymbol $kw28$NOT_ISA;
    private static final SubLSymbol $sym29$RBP_WFF_NOT_ISA_;
    private static final SubLSymbol $kw30$GENL;
    private static final SubLSymbol $sym31$RBP_WFF_MAYBE_GENL_;
    private static final SubLSymbol $kw32$NOT_GENL;
    private static final SubLSymbol $sym33$NPP_NOT_GENL_;
    private static final SubLSymbol $kw34$NOT_DISJOINT;
    private static final SubLSymbol $sym35$NPP_NOT_DISJOINT_;
    private static final SubLSymbol $kw36$TYPE_GENL;
    private static final SubLSymbol $sym37$NPP_NOT_TYPE_DISJOINT_;
    private static final SubLSymbol $sym38$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const39$EverythingPSC;
    private static final SubLSymbol $sym40$_RBP_WF_TEMPLATE_ARGS__CACHING_STATE_;
    private static final SubLList $list41;
    private static final SubLString $str42$___S_not_sufficiently_defined_in_;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLString $str46$__Spent__4_2F_seconds_wff_checkin;
    private static final SubLString $str47$___D_of__D_items_wff_checked_were;
    private static final SubLSymbol $sym48$RBP_WF_NAT_;
    private static final SubLSymbol $sym49$_RBP_WF_NAT__CACHING_STATE_;
    private static final SubLObject $const50$InferencePSC;
    private static final SubLSymbol $sym51$RELEVANT_PRED_IS_SPEC_PRED;
    private static final SubLSymbol $kw52$GAF;
    private static final SubLSymbol $kw53$TRUE;
    private static final SubLSymbol $sym54$RELEVANT_PRED_IS_SPEC_INVERSE;
    private static final SubLObject $const55$typedGenlPreds;
    private static final SubLObject $const56$Collection;
    private static final SubLObject $const57$typeGenls;
    private static final SubLSymbol $kw58$ANY;
    private static final SubLSymbol $sym59$NORMAL_INFERENCE;
    private static final SubLSymbol $sym60$RELEVANT_MT_IS_GENL_MT;
    private static final SubLObject $const61$resultGenl;
    private static final SubLObject $const62$resultGenlArg;
    private static final SubLObject $const63$preservesGenlsInArg;
    private static final SubLSymbol $kw64$PERMISSIVE;
    private static final SubLSymbol $kw65$STRICT;
    private static final SubLObject $const66$Thing;
    private static final SubLObject $const67$CollectionType;
    private static final SubLSymbol $sym68$GENERALITY_ESTIMATE_;
    private static final SubLSymbol $sym69$RBP_WFF_FIND_FLOOR_MTS_INT;
    private static final SubLSymbol $sym70$_RBP_WFF_FIND_FLOOR_MTS_INT_CACHING_STATE_;
    private static final SubLInteger $int71$32;
    private static final SubLSymbol $sym72$MT_RELEVANT_TO_MT_;
    private static final SubLObject $const73$SpecsFn;
    private static final SubLObject $const74$CycLSentence_Assertible;
    private static final SubLObject $const75$TruthFunction;
    private static final SubLObject $const76$CollectionDenotingFunction;
    private static final SubLObject $const77$relationAllExists;
    private static final SubLSymbol $sym78$NPP_GENL_OR_ANY_;
    private static final SubLObject $const79$relationExistsAll;
    private static final SubLObject $const80$relationExistsUniqueAll;
    private static final SubLObject $const81$relationAllInstance;
    private static final SubLSymbol $sym82$NPP_ISA_OR_ANY_;
    private static final SubLObject $const83$relationInstanceAll;
    private static final SubLSymbol $sym84$RBP_DEFINING_MTS;
    private static final SubLSymbol $sym85$RBP_DEFINING_MT;
    private static final SubLSymbol $sym86$MT_VISIBLE_FROM_MT_;
    private static final SubLSymbol $sym87$_RBP_DEFINING_MTS_CACHING_STATE_;
    private static final SubLInteger $int88$512;
    private static final SubLObject $const89$BookkeepingMt;
    private static final SubLList $list90;
    private static final SubLObject $const91$genlMt_Vocabulary;
    private static final SubLObject $const92$VocabularyMicrotheory;
    private static final SubLSymbol $sym93$RBP_WFF_TEST_FAILS_INT_;
    private static final SubLObject $const94$SomeFn;
    private static final SubLString $str95$__RBP_Wff_check_failed___the_foll;
    private static final SubLSymbol $sym96$_RBP_WFF_TEST_FAILS_INT__CACHING_STATE_;
    private static final SubLObject $const97$Relation;
    private static final SubLSymbol $sym98$RBP_WFF_CONSTRAINTS_PRIM_INT_CACHED;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$_RBP_WFF_CONSTRAINTS_PRIM_INT_CACHED_CACHING_STATE_;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLList $list103;
    private static final SubLSymbol $kw104$MODIFIER;
    private static final SubLSymbol $kw105$HEAD;
    private static final SubLSymbol $sym106$CAR;
    private static final SubLObject $const107$isa;
    private static final SubLList $list108;
    private static final SubLObject $const109$BaseKB;
    private static final SubLList $list110;
    private static final SubLObject $const111$transitiveViaArgInverse;
    private static final SubLList $list112;
    private static final SubLObject $const113$arg2Format;
    private static final SubLList $list114;
    private static final SubLList $list115;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$_INTER_ARG_ISA_PREDICATE_MT_;
    private static final SubLObject $const118$InterArgIsaPredicate;
    private static final SubLSymbol $sym119$_ARG_NOT_ISA_PREDICATE_MT_;
    private static final SubLObject $const120$ArgNotIsaPredicate;
    private static final SubLSymbol $sym121$RBP_GET_IAI_PRED;
    private static final SubLSymbol $sym122$_PRED;
    private static final SubLObject $const123$and;
    private static final SubLList $list124;
    private static final SubLObject $const125$constrainsArgs;
    private static final SubLSymbol $sym126$_RBP_GET_IAI_PRED_CACHING_STATE_;
    private static final SubLSymbol $sym127$RBP_GET_ANI_PRED;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLObject $const130$constrainsArg;
    private static final SubLSymbol $sym131$_RBP_GET_ANI_PRED_CACHING_STATE_;
    private static final SubLObject $const132$genlPreds;
    private static final SubLSymbol $kw133$BREADTH;
    private static final SubLSymbol $kw134$DEPTH;
    private static final SubLSymbol $kw135$STACK;
    private static final SubLSymbol $kw136$QUEUE;
    private static final SubLSymbol $sym137$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw138$ERROR;
    private static final SubLString $str139$_A_is_not_a__A;
    private static final SubLSymbol $sym140$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw141$CERROR;
    private static final SubLString $str142$continue_anyway;
    private static final SubLSymbol $kw143$WARN;
    private static final SubLString $str144$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str145$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str146$attempting_to_bind_direction_link;
    private static final SubLString $str147$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const148$interArgNotIsa1_2;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$RBP_WFF_TYPE_LEVEL_ARG_NUMS_FOR_FN;
    private static final SubLSymbol $sym151$SPEC_;
    private static final SubLSymbol $sym152$_RBP_WFF_TYPE_LEVEL_ARG_NUMS_FOR_FN_CACHING_STATE_;
    private static final SubLInteger $int153$128;
    private static final SubLObject $const154$SubcollectionOfByFn;
    private static final SubLObject $const155$createdBy;
    private static final SubLList $list156;
    private static final SubLObject $const157$relationAllExistsCount;
    private static final SubLList $list158;
    private static final SubLObject $const159$SubcollectionRelationFunction;
    private static final SubLSymbol $kw160$FROM;
    private static final SubLSymbol $kw161$TO;
    private static final SubLObject $const162$SubcollectionRelationFunction_Can;
    private static final SubLObject $const163$SubcollectionRelationFunction_Inv;
    private static final SubLObject $const164$InstanceWithRelationFromFn;
    private static final SubLObject $const165$InstanceWithRelationToFn;
    private static final SubLObject $const166$TheNCArgIsas;
    private static final SubLSymbol $sym167$MIN_ARGN_ISA;
    private static final SubLObject $const168$TheNCArgGenls;
    private static final SubLSymbol $sym169$MIN_ARGN_GENL;
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 2013L)
    public static SubLObject rbp_wff_validation_reset() {
        rbp_wff.$rbp_wff_validation_count$.setGlobalValue((SubLObject)rbp_wff.ZERO_INTEGER);
        rbp_wff.$rbp_wff_validation_false_pos$.setGlobalValue((SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_wff_validation_false_neg$.setGlobalValue((SubLObject)rbp_wff.NIL);
        return (SubLObject)rbp_wff.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 2287L)
    public static SubLObject rbp_wff_validation_report(final SubLObject key) {
        final SubLObject s = (SubLObject)rbp_wff.T;
        PrintLow.format(s, (SubLObject)rbp_wff.$str7$__Performed__D_wff_check_validati, rbp_wff.$rbp_wff_validation_count$.getGlobalValue());
        if (rbp_wff.NIL != subl_promotions.memberP(key, (SubLObject)rbp_wff.$list8, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)) {
            PrintLow.format(s, (SubLObject)rbp_wff.$str9$__Found__D_false_positives___, Sequences.length(rbp_wff.$rbp_wff_validation_false_pos$.getGlobalValue()));
            SubLObject cdolist_list_var = rbp_wff.$rbp_wff_validation_false_pos$.getGlobalValue();
            SubLObject item = (SubLObject)rbp_wff.NIL;
            item = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                PrintLow.format(s, (SubLObject)rbp_wff.$str10$____S__, item);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        if (rbp_wff.NIL != subl_promotions.memberP(key, (SubLObject)rbp_wff.$list11, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)) {
            PrintLow.format(s, (SubLObject)rbp_wff.$str12$__Found__D_false_negatives___, Sequences.length(rbp_wff.$rbp_wff_validation_false_neg$.getGlobalValue()));
            SubLObject cdolist_list_var = rbp_wff.$rbp_wff_validation_false_neg$.getGlobalValue();
            SubLObject item = (SubLObject)rbp_wff.NIL;
            item = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                PrintLow.format(s, (SubLObject)rbp_wff.$str10$____S__, item);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        return (SubLObject)rbp_wff.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 2920L)
    public static SubLObject rbp_wff_validating(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)rbp_wff.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list13);
        key = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)rbp_wff.$sym14$PROGN, (SubLObject)rbp_wff.$list15, (SubLObject)rbp_wff.$list16, (SubLObject)ConsesLow.listS((SubLObject)rbp_wff.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rbp_wff.$sym3$_RBP_WFF_VALIDATE_SETTING_, key)), ConsesLow.append(body, (SubLObject)rbp_wff.NIL)), (SubLObject)ConsesLow.list((SubLObject)rbp_wff.$sym18$RBP_WFF_VALIDATION_REPORT, key));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 3247L)
    public static SubLObject clear_rbp_wf_nat_externalP() {
        final SubLObject cs = rbp_wff.$rbp_wf_nat_externalP_caching_state$.getGlobalValue();
        if (rbp_wff.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 3247L)
    public static SubLObject remove_rbp_wf_nat_externalP(final SubLObject nat, final SubLObject level) {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_wff.$rbp_wf_nat_externalP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(nat, level), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 3247L)
    public static SubLObject rbp_wf_nat_externalP_internal(final SubLObject nat, final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rbp_wff.NIL;
        final SubLObject validateP = Numbers.numG(level, (SubLObject)rbp_wff.ONE_INTEGER);
        final SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)rbp_wff.NIL, thread);
            ans = at_utilities.nat_wf_in_some_mtP(nat, (SubLObject)rbp_wff.NIL, validateP);
        }
        finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 3247L)
    public static SubLObject rbp_wf_nat_externalP(final SubLObject nat, final SubLObject level) {
        SubLObject caching_state = rbp_wff.$rbp_wf_nat_externalP_caching_state$.getGlobalValue();
        if (rbp_wff.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_wff.$sym19$RBP_WF_NAT_EXTERNAL_, (SubLObject)rbp_wff.$sym20$_RBP_WF_NAT_EXTERNAL__CACHING_STATE_, (SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.EQUALP, (SubLObject)rbp_wff.TWO_INTEGER, (SubLObject)rbp_wff.$int21$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(nat, level);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rbp_wff.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rbp_wff.NIL;
            collision = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (nat.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rbp_wff.NIL != cached_args && rbp_wff.NIL == cached_args.rest() && level.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_wf_nat_externalP_internal(nat, level)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(nat, level));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 3538L)
    public static SubLObject rbp_wff_check_formula_arg_position_replacements(final SubLObject formula, final SubLObject arg_position, final SubLObject replacements) {
        final SubLObject keyword = (SubLObject)rbp_wff.$kw22$REPLACE_ME;
        final SubLObject template = el_utilities.replace_formula_arg_position(arg_position, keyword, formula);
        SubLObject results = (SubLObject)rbp_wff.NIL;
        SubLObject cdolist_list_var = replacements;
        SubLObject replacement = (SubLObject)rbp_wff.NIL;
        replacement = cdolist_list_var.first();
        while (rbp_wff.NIL != cdolist_list_var) {
            final SubLObject keyword_bindings = (SubLObject)ConsesLow.list(bindings.make_variable_binding(keyword, replacement));
            final SubLObject wfP = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != rbp_wf_template_argsP(template, keyword_bindings, (SubLObject)rbp_wff.ONE_INTEGER) && rbp_wff.NIL != rbp_wf_template_argsP(template, keyword_bindings, (SubLObject)rbp_wff.TWO_INTEGER));
            results = (SubLObject)ConsesLow.cons(wfP, results);
            cdolist_list_var = cdolist_list_var.rest();
            replacement = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 4332L)
    public static SubLObject clear_rbp_wf_template_argsP() {
        final SubLObject cs = rbp_wff.$rbp_wf_template_argsP_caching_state$.getGlobalValue();
        if (rbp_wff.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 4332L)
    public static SubLObject remove_rbp_wf_template_argsP(final SubLObject template, final SubLObject keyword_bindings, final SubLObject level) {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_wff.$rbp_wf_template_argsP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(template, keyword_bindings, level), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 4332L)
    public static SubLObject rbp_wf_template_argsP_internal(final SubLObject template, final SubLObject keyword_bindings, final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        rbp_wff.$rbp_wff_checks_total$.setDynamicValue(Numbers.add(rbp_wff.$rbp_wff_checks_total$.getDynamicValue(thread), (SubLObject)rbp_wff.ONE_INTEGER), thread);
        SubLObject constraints = (SubLObject)rbp_wff.NIL;
        SubLObject malP = (SubLObject)rbp_wff.NIL;
        SubLObject time = (SubLObject)rbp_wff.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        malP = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == rbp_wff_bindings_visibleP(keyword_bindings));
        if (rbp_wff.NIL == malP) {
            if (level.eql((SubLObject)rbp_wff.ONE_INTEGER)) {
                constraints = rbp_wff_constraints_primary(template, keyword_bindings, (SubLObject)rbp_wff.UNPROVIDED);
            }
            else if (level.eql((SubLObject)rbp_wff.TWO_INTEGER)) {
                constraints = rbp_wff_constraints_secondary(template, keyword_bindings);
            }
            if (rbp_wff.NIL == malP) {
                SubLObject csome_list_var = constraints;
                SubLObject constraint = (SubLObject)rbp_wff.NIL;
                constraint = csome_list_var.first();
                while (rbp_wff.NIL == malP && rbp_wff.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = constraint;
                    SubLObject type = (SubLObject)rbp_wff.NIL;
                    SubLObject denot_temp = (SubLObject)rbp_wff.NIL;
                    SubLObject target = (SubLObject)rbp_wff.NIL;
                    SubLObject test_mt = (SubLObject)rbp_wff.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list24);
                    type = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list24);
                    denot_temp = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list24);
                    target = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list24);
                    test_mt = current.first();
                    current = current.rest();
                    if (rbp_wff.NIL == current) {
                        final SubLObject denot = rbp_subst_bindings(keyword_bindings, denot_temp);
                        if (rbp_wff.NIL == list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)rbp_wff.$sym25$KEYWORDP), denot, (SubLObject)rbp_wff.UNPROVIDED)) {
                            final SubLObject pcase_var = type;
                            if (pcase_var.eql((SubLObject)rbp_wff.$kw26$ISA)) {
                                malP = rbp_wff_test_failsP((SubLObject)rbp_wff.$sym27$RBP_WFF_MAYBE_ISA_, denot, target, test_mt);
                            }
                            else if (pcase_var.eql((SubLObject)rbp_wff.$kw28$NOT_ISA)) {
                                malP = rbp_wff_test_failsP((SubLObject)rbp_wff.$sym29$RBP_WFF_NOT_ISA_, denot, target, test_mt);
                            }
                            else if (pcase_var.eql((SubLObject)rbp_wff.$kw30$GENL)) {
                                malP = rbp_wff_test_failsP((SubLObject)rbp_wff.$sym31$RBP_WFF_MAYBE_GENL_, denot, target, test_mt);
                            }
                            else if (pcase_var.eql((SubLObject)rbp_wff.$kw32$NOT_GENL)) {
                                malP = rbp_wff_test_failsP((SubLObject)rbp_wff.$sym33$NPP_NOT_GENL_, denot, target, test_mt);
                            }
                            else if (pcase_var.eql((SubLObject)rbp_wff.$kw34$NOT_DISJOINT)) {
                                malP = rbp_wff_test_failsP((SubLObject)rbp_wff.$sym35$NPP_NOT_DISJOINT_, denot, target, test_mt);
                            }
                            else if (pcase_var.eql((SubLObject)rbp_wff.$kw36$TYPE_GENL)) {
                                malP = rbp_wff_test_failsP((SubLObject)rbp_wff.$sym37$NPP_NOT_TYPE_DISJOINT_, denot, target, test_mt);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rbp_wff.$list24);
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                }
            }
        }
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        rbp_wff.$rbp_wff_check_time$.setDynamicValue(Numbers.add(rbp_wff.$rbp_wff_check_time$.getDynamicValue(thread), time), thread);
        if (rbp_wff.NIL != malP) {
            rbp_wff.$rbp_wff_checks_failed$.setDynamicValue(Numbers.add(rbp_wff.$rbp_wff_checks_failed$.getDynamicValue(thread), (SubLObject)rbp_wff.ONE_INTEGER), thread);
        }
        if (rbp_wff.NIL != subl_promotions.memberP(rbp_wff.$rbp_wff_validate_setting$.getGlobalValue(), (SubLObject)((rbp_wff.NIL != malP) ? rbp_wff.$list11 : rbp_wff.$list8), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)) {
            final SubLObject nat = rbp_subst_bindings(keyword_bindings, template);
            rbp_wff.$rbp_wff_validation_count$.setGlobalValue(Numbers.add(rbp_wff.$rbp_wff_validation_count$.getGlobalValue(), (SubLObject)rbp_wff.ONE_INTEGER));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rbp_wff.$sym38$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(rbp_wff.$const39$EverythingPSC, thread);
                if (malP.eql(rbp_wf_nat_externalP(nat, level))) {
                    if (rbp_wff.NIL != malP) {
                        rbp_wff.$rbp_wff_validation_false_neg$.setGlobalValue((SubLObject)ConsesLow.cons(nat, rbp_wff.$rbp_wff_validation_false_neg$.getGlobalValue()));
                    }
                    else {
                        rbp_wff.$rbp_wff_validation_false_pos$.setGlobalValue((SubLObject)ConsesLow.cons(nat, rbp_wff.$rbp_wff_validation_false_pos$.getGlobalValue()));
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == malP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 4332L)
    public static SubLObject rbp_wf_template_argsP(final SubLObject template, final SubLObject keyword_bindings, final SubLObject level) {
        SubLObject caching_state = rbp_wff.$rbp_wf_template_argsP_caching_state$.getGlobalValue();
        if (rbp_wff.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_wff.$sym23$RBP_WF_TEMPLATE_ARGS_, (SubLObject)rbp_wff.$sym40$_RBP_WF_TEMPLATE_ARGS__CACHING_STATE_, (SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.EQUALP, (SubLObject)rbp_wff.THREE_INTEGER, (SubLObject)rbp_wff.$int21$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(template, keyword_bindings, level);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rbp_wff.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rbp_wff.NIL;
            collision = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (template.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (keyword_bindings.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rbp_wff.NIL != cached_args && rbp_wff.NIL == cached_args.rest() && level.equalp(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_wf_template_argsP_internal(template, keyword_bindings, level)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(template, keyword_bindings, level));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 6383L)
    public static SubLObject rbp_wff_bindings_visibleP(final SubLObject keyword_bindings) {
        SubLObject malP = (SubLObject)rbp_wff.NIL;
        if (rbp_wff.NIL == malP) {
            SubLObject csome_list_var = keyword_bindings;
            SubLObject binding = (SubLObject)rbp_wff.NIL;
            binding = csome_list_var.first();
            while (rbp_wff.NIL == malP && rbp_wff.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = binding;
                SubLObject keyword = (SubLObject)rbp_wff.NIL;
                SubLObject value = (SubLObject)rbp_wff.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list41);
                keyword = current.first();
                current = (value = current.rest());
                if (rbp_wff.NIL == rbp_wff_term_visibleP(value)) {
                    malP = (SubLObject)rbp_wff.T;
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == malP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 6666L)
    public static SubLObject rbp_wff_term_visibleP(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject visibleP = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != rbp_wff_term_visible_by_fiatP(value) || rbp_wff.NIL != rbp_wff_term_actually_visibleP(value));
        if (rbp_wff.NIL == visibleP && rbp_wff.NIL != rbp_wff.$rbp_show_non_wffP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)rbp_wff.T, (SubLObject)rbp_wff.$str42$___S_not_sufficiently_defined_in_, value, rbp_wff_domain_mt());
        }
        return visibleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 6984L)
    public static SubLObject rbp_wff_term_visible_by_fiatP(final SubLObject value) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == rbp_wff_term_visible_check_requiredP(value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 7263L)
    public static SubLObject rbp_wff_term_visible_check_requiredP(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != rbp_wff.$rbp_wff_check_visibilityP$.getDynamicValue(thread) && rbp_wff.NIL != rbp_wff_domain_mt_setP() && rbp_wff.NIL != kb_indexing_datastructures.indexed_term_p(value) && rbp_wff.NIL == parsing_utilities.nl_tagP(value, (SubLObject)rbp_wff.UNPROVIDED) && rbp_wff.NIL == subl_promotions.memberP(rbp_wff_domain_mt(), (SubLObject)rbp_wff.$list43, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED) && rbp_wff.NIL != hlmt.hlmt_p(rbp_defining_mt(value)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 7574L)
    public static SubLObject rbp_wff_term_actually_visibleP(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject visibleP = (SubLObject)rbp_wff.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(rbp_wff_domain_mt());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            visibleP = mt_relevance_macros.relevant_mtP(rbp_defining_mt(value));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return visibleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 7792L)
    public static SubLObject rbp_formula_variable_isa_constraints(final SubLObject formula, final SubLObject variable) {
        final SubLObject keyword_bindings = (SubLObject)ConsesLow.list(reader.bq_cons(variable, (SubLObject)rbp_wff.$list44));
        final SubLObject primary = rbp_wff_constraints_primary(formula, keyword_bindings, (SubLObject)rbp_wff.UNPROVIDED);
        final SubLObject secondary = rbp_wff_constraints_secondary(formula, keyword_bindings);
        SubLObject ans = (SubLObject)rbp_wff.NIL;
        SubLObject cdolist_list_var = ConsesLow.append(primary, secondary);
        SubLObject constraint = (SubLObject)rbp_wff.NIL;
        constraint = cdolist_list_var.first();
        while (rbp_wff.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint;
            SubLObject type = (SubLObject)rbp_wff.NIL;
            SubLObject v_term = (SubLObject)rbp_wff.NIL;
            SubLObject coll = (SubLObject)rbp_wff.NIL;
            SubLObject mt = (SubLObject)rbp_wff.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list45);
            type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list45);
            v_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list45);
            coll = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list45);
            mt = current.first();
            current = current.rest();
            if (rbp_wff.NIL == current) {
                if (v_term.eql(variable)) {
                    ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(type, coll, mt), ans);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rbp_wff.$list45);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 8311L)
    public static SubLObject rbp_wff_reset_metrics() {
        rbp_wff.$rbp_wff_check_time$.setDynamicValue((SubLObject)rbp_wff.ZERO_INTEGER);
        rbp_wff.$rbp_wff_checks_total$.setDynamicValue((SubLObject)rbp_wff.ZERO_INTEGER);
        rbp_wff.$rbp_wff_checks_failed$.setDynamicValue((SubLObject)rbp_wff.ZERO_INTEGER);
        return (SubLObject)rbp_wff.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 8471L)
    public static SubLObject rbp_wff_report_metrics(SubLObject stream) {
        if (stream == rbp_wff.UNPROVIDED) {
            stream = (SubLObject)rbp_wff.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(stream, (SubLObject)rbp_wff.$str46$__Spent__4_2F_seconds_wff_checkin, rbp_wff.$rbp_wff_check_time$.getDynamicValue(thread));
        PrintLow.format(stream, (SubLObject)rbp_wff.$str47$___D_of__D_items_wff_checked_were, rbp_wff.$rbp_wff_checks_failed$.getDynamicValue(thread), rbp_wff.$rbp_wff_checks_total$.getDynamicValue(thread));
        return (SubLObject)rbp_wff.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 8735L)
    public static SubLObject rbp_wff_clear_caches() {
        clear_rbp_defining_mts();
        clear_rbp_wff_find_floor_mts_int();
        clear_rbp_wf_natP();
        clear_rbp_get_iai_pred();
        clear_rbp_wff_test_fails_intP();
        clear_rbp_wff_constraints_prim_int_cached();
        clear_rbp_wf_template_argsP();
        clear_rbp_wff_type_level_arg_nums_for_fn();
        rbp_wff.$rbp_vocabulary_mts$.setGlobalValue((SubLObject)rbp_wff.$kw5$UNINITIALIZED);
        rbp_wff.$rbp_wff_quaternary_rmps$.setGlobalValue((SubLObject)rbp_wff.$kw5$UNINITIALIZED);
        return (SubLObject)rbp_wff.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 9199L)
    public static SubLObject clear_rbp_wf_natP() {
        final SubLObject cs = rbp_wff.$rbp_wf_natP_caching_state$.getGlobalValue();
        if (rbp_wff.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 9199L)
    public static SubLObject remove_rbp_wf_natP(final SubLObject nat, final SubLObject level) {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_wff.$rbp_wf_natP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(nat, level), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 9199L)
    public static SubLObject rbp_wf_natP_internal(final SubLObject nat, final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rbp_wff.NIL == term.nautP(nat, (SubLObject)rbp_wff.UNPROVIDED)) {
            return (SubLObject)rbp_wff.T;
        }
        thread.resetMultipleValues();
        final SubLObject template = rbp_wff_convert_nat(nat, (SubLObject)rbp_wff.UNPROVIDED);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean((!level.numG((SubLObject)rbp_wff.ZERO_INTEGER) || rbp_wff.NIL != rbp_wf_template_argsP(template, v_bindings, (SubLObject)rbp_wff.ONE_INTEGER)) && (!level.numG((SubLObject)rbp_wff.ONE_INTEGER) || rbp_wff.NIL != rbp_wf_template_argsP(template, v_bindings, (SubLObject)rbp_wff.TWO_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 9199L)
    public static SubLObject rbp_wf_natP(final SubLObject nat, final SubLObject level) {
        SubLObject caching_state = rbp_wff.$rbp_wf_natP_caching_state$.getGlobalValue();
        if (rbp_wff.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_wff.$sym48$RBP_WF_NAT_, (SubLObject)rbp_wff.$sym49$_RBP_WF_NAT__CACHING_STATE_, (SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.EQUALP, (SubLObject)rbp_wff.TWO_INTEGER, (SubLObject)rbp_wff.$int21$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(nat, level);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rbp_wff.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rbp_wff.NIL;
            collision = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (nat.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rbp_wff.NIL != cached_args && rbp_wff.NIL == cached_args.rest() && level.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_wf_natP_internal(nat, level)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(nat, level));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 9587L)
    public static SubLObject npp_genl_predP(final SubLObject obj1, final SubLObject obj2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rbp_wff.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rbp_wff.$sym38$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rbp_wff.$const39$EverythingPSC, thread);
            ans = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != forts.fort_p(obj1) && rbp_wff.NIL != forts.fort_p(obj2) && rbp_wff.NIL != genl_predicates.genl_predP(obj1, obj2, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 9867L)
    public static SubLObject npp_search_gafs_gp(final SubLObject predicate, final SubLObject v_object, final SubLObject opos, final SubLObject key, final SubLObject kpos, SubLObject test, SubLObject mt) {
        if (test == rbp_wff.UNPROVIDED) {
            test = (SubLObject)rbp_wff.EQUAL;
        }
        if (mt == rbp_wff.UNPROVIDED) {
            mt = rbp_wff.$const50$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject matches = (SubLObject)rbp_wff.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject _prev_bind_0_$1 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)rbp_wff.$sym51$RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(predicate, thread);
                final SubLObject pred_var = (SubLObject)rbp_wff.NIL;
                if (rbp_wff.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_object, opos, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_object, opos, pred_var);
                    SubLObject done_var = (SubLObject)rbp_wff.NIL;
                    final SubLObject token_var = (SubLObject)rbp_wff.NIL;
                    while (rbp_wff.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (rbp_wff.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)rbp_wff.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rbp_wff.$kw52$GAF, (SubLObject)rbp_wff.$kw53$TRUE, (SubLObject)rbp_wff.NIL);
                                SubLObject done_var_$3 = (SubLObject)rbp_wff.NIL;
                                final SubLObject token_var_$4 = (SubLObject)rbp_wff.NIL;
                                while (rbp_wff.NIL == done_var_$3) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(ass));
                                    if (rbp_wff.NIL != valid_$5 && rbp_wff.NIL != Functions.funcall(test, cycl_utilities.formula_arg(ass, kpos, (SubLObject)rbp_wff.UNPROVIDED), key)) {
                                        matches = (SubLObject)ConsesLow.cons(ass, matches);
                                    }
                                    done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid_$5);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rbp_wff.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (rbp_wff.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid);
                    }
                }
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_1_$2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$1, thread);
            }
            if (rbp_wff.NIL != kb_gp_mapping.dgaigp_binaryP(predicate)) {
                final SubLObject _prev_bind_0_$3 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)rbp_wff.$sym54$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(predicate, thread);
                    final SubLObject pred_var = (SubLObject)rbp_wff.NIL;
                    if (rbp_wff.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_object, arity.binary_arg_swap(opos), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_object, arity.binary_arg_swap(opos), pred_var);
                        SubLObject done_var = (SubLObject)rbp_wff.NIL;
                        final SubLObject token_var = (SubLObject)rbp_wff.NIL;
                        while (rbp_wff.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (rbp_wff.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)rbp_wff.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rbp_wff.$kw52$GAF, (SubLObject)rbp_wff.$kw53$TRUE, (SubLObject)rbp_wff.NIL);
                                    SubLObject done_var_$4 = (SubLObject)rbp_wff.NIL;
                                    final SubLObject token_var_$5 = (SubLObject)rbp_wff.NIL;
                                    while (rbp_wff.NIL == done_var_$4) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(ass));
                                        if (rbp_wff.NIL != valid_$6) {
                                            final SubLObject _prev_bind_0_$4 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                if (rbp_wff.NIL != Functions.funcall(test, cycl_utilities.formula_arg(ass, kpos, (SubLObject)rbp_wff.UNPROVIDED), key)) {
                                                    matches = (SubLObject)ConsesLow.cons(ass, matches);
                                                }
                                            }
                                            finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$4, thread);
                                            }
                                        }
                                        done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid_$6);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rbp_wff.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (rbp_wff.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid);
                        }
                    }
                }
                finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_1_$3, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.reverse(matches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 10204L)
    public static SubLObject npp_typed_genl_predP(final SubLObject obj1, final SubLObject obj2) {
        if (rbp_wff.NIL != forts.fort_p(obj1) && rbp_wff.NIL != forts.fort_p(obj2)) {
            return list_utilities.sublisp_boolean(npp_search_gafs_gp(rbp_wff.$const55$typedGenlPreds, obj1, (SubLObject)rbp_wff.ONE_INTEGER, obj2, (SubLObject)rbp_wff.TWO_INTEGER, (SubLObject)rbp_wff.EQL, (SubLObject)rbp_wff.UNPROVIDED));
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 10475L)
    public static SubLObject rbp_wff_maybe_genlP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = rbp_wff.$const50$InferencePSC;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != rbp_wff_maybe_isaP(obj1, rbp_wff.$const56$Collection, mt) && rbp_wff.NIL != rbp_wff_maybe_isaP(obj2, rbp_wff.$const56$Collection, mt) && rbp_wff.NIL != npp_not_disjointP(obj1, obj2, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 10699L)
    public static SubLObject npp_type_genlP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = rbp_wff.$const50$InferencePSC;
        }
        return cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(rbp_wff.$const57$typeGenls, obj1, obj2), mt, (SubLObject)rbp_wff.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 10943L)
    public static SubLObject npp_not_genlP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = (SubLObject)rbp_wff.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == npp_genlP(obj1, obj2, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 11040L)
    public static SubLObject npp_genlP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = (SubLObject)rbp_wff.NIL;
        }
        if (rbp_wff.NIL == term.el_fort_p(obj1) || rbp_wff.NIL == term.el_fort_p(obj2) || rbp_wff.NIL == npp_collectionP(obj2)) {
            return (SubLObject)rbp_wff.NIL;
        }
        if (rbp_wff.NIL != npp_genl_via_sbhlP(obj1, obj2, mt)) {
            return (SubLObject)rbp_wff.T;
        }
        if (obj1.equalp(obj2)) {
            return (SubLObject)rbp_wff.T;
        }
        if (rbp_wff.NIL != npp_naut_genl_via_result_genlP(obj1, obj2, mt)) {
            return (SubLObject)rbp_wff.T;
        }
        if (rbp_wff.NIL != npp_naut_genl_via_rgaP(obj1, obj2, mt)) {
            return (SubLObject)rbp_wff.T;
        }
        if (rbp_wff.NIL != npp_naut_genl_via_pgiaP(obj1, obj2, mt)) {
            return (SubLObject)rbp_wff.T;
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 11622L)
    public static SubLObject npp_genl_or_anyP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = rbp_wff.$const50$InferencePSC;
        }
        if (obj1.eql((SubLObject)rbp_wff.$kw58$ANY) || obj2.eql((SubLObject)rbp_wff.$kw58$ANY)) {
            return (SubLObject)rbp_wff.T;
        }
        return npp_genlP(obj1, obj2, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 11884L)
    public static SubLObject npp_genl_via_sbhlP(final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rbp_wff.NIL;
        if (rbp_wff.NIL != hlmt.hlmt_p(mt) && rbp_wff.$sym59$NORMAL_INFERENCE == psc.mt_inference_function(mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rbp_wff.$sym60$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                ans = genls.genlP(obj1, obj2, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rbp_wff.$sym38$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(rbp_wff.$const39$EverythingPSC, thread);
                ans = genls.genlP(obj1, obj2, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 12144L)
    public static SubLObject npp_naut_genl_via_result_genlP(final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        if (rbp_wff.NIL == term.nautP(obj1, (SubLObject)rbp_wff.UNPROVIDED)) {
            return (SubLObject)rbp_wff.NIL;
        }
        SubLObject successP = (SubLObject)rbp_wff.NIL;
        final SubLObject functor = cycl_utilities.nat_functor(obj1);
        if (rbp_wff.NIL != kb_indexing_datastructures.indexed_term_p(functor) && rbp_wff.NIL == successP) {
            SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_any_mt(functor, rbp_wff.$const61$resultGenl, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
            SubLObject coll = (SubLObject)rbp_wff.NIL;
            coll = csome_list_var.first();
            while (rbp_wff.NIL == successP && rbp_wff.NIL != csome_list_var) {
                if (rbp_wff.NIL != npp_genlP(coll, obj2, mt)) {
                    successP = (SubLObject)rbp_wff.T;
                }
                csome_list_var = csome_list_var.rest();
                coll = csome_list_var.first();
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 12544L)
    public static SubLObject npp_naut_genl_via_rgaP(final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        if (rbp_wff.NIL == term.nautP(obj1, (SubLObject)rbp_wff.UNPROVIDED)) {
            return (SubLObject)rbp_wff.NIL;
        }
        SubLObject successP = (SubLObject)rbp_wff.NIL;
        final SubLObject functor = cycl_utilities.nat_functor(obj1);
        if (rbp_wff.NIL != kb_indexing_datastructures.indexed_term_p(functor) && rbp_wff.NIL == successP) {
            SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_any_mt(functor, rbp_wff.$const62$resultGenlArg, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
            SubLObject arg = (SubLObject)rbp_wff.NIL;
            arg = csome_list_var.first();
            while (rbp_wff.NIL == successP && rbp_wff.NIL != csome_list_var) {
                if (rbp_wff.NIL != npp_genlP(cycl_utilities.nat_arg(obj1, arg, (SubLObject)rbp_wff.UNPROVIDED), obj2, mt)) {
                    successP = (SubLObject)rbp_wff.T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 12955L)
    public static SubLObject npp_naut_genl_via_pgiaP(final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        if (rbp_wff.NIL == term.nautP(obj1, (SubLObject)rbp_wff.UNPROVIDED) || !cycl_utilities.nat_functor(obj1).eql(cycl_utilities.nat_functor(obj2))) {
            return (SubLObject)rbp_wff.NIL;
        }
        SubLObject successP = (SubLObject)rbp_wff.NIL;
        final SubLObject functor = cycl_utilities.nat_functor(obj1);
        if (rbp_wff.NIL != kb_indexing_datastructures.indexed_term_p(functor) && rbp_wff.NIL == successP) {
            SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_any_mt(functor, rbp_wff.$const63$preservesGenlsInArg, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
            SubLObject arg = (SubLObject)rbp_wff.NIL;
            arg = csome_list_var.first();
            while (rbp_wff.NIL == successP && rbp_wff.NIL != csome_list_var) {
                if (rbp_wff.NIL != npp_genlP(cycl_utilities.nat_arg(obj1, arg, (SubLObject)rbp_wff.UNPROVIDED), cycl_utilities.nat_arg(obj2, arg, (SubLObject)rbp_wff.UNPROVIDED), mt)) {
                    successP = (SubLObject)rbp_wff.T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 13443L)
    public static SubLObject rbp_wff_not_isaP(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = rbp_wff.$const50$InferencePSC;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == rbp_wff_maybe_isaP(v_term, col, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 13567L)
    public static SubLObject rbp_wff_maybe_isaP(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = rbp_wff.$const50$InferencePSC;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != rbp_wff_isaP_int(v_term, col, mt, (SubLObject)rbp_wff.$kw64$PERMISSIVE) || (rbp_wff.NIL != forts.fort_p(v_term) && rbp_wff.NIL == isa.not_isaP(v_term, col, mt, (SubLObject)rbp_wff.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 13834L)
    public static SubLObject rbp_wff_isaP(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = rbp_wff.$const50$InferencePSC;
        }
        return rbp_wff_isaP_int(v_term, col, mt, (SubLObject)rbp_wff.$kw65$STRICT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 13955L)
    public static SubLObject rbp_wff_isaP_int(final SubLObject v_term, final SubLObject col, final SubLObject mt, final SubLObject naut_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rbp_wff.NIL != npp_isaP(v_term, col, mt)) {
            return (SubLObject)rbp_wff.T;
        }
        if (rbp_wff.NIL == term.nautP(v_term, (SubLObject)rbp_wff.UNPROVIDED)) {
            return (SubLObject)rbp_wff.NIL;
        }
        SubLObject ans = (SubLObject)rbp_wff.NIL;
        SubLObject doneP = (SubLObject)rbp_wff.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (rbp_wff.NIL == doneP) {
                SubLObject csome_list_var = isa.min_isa(v_term, mt, (SubLObject)rbp_wff.UNPROVIDED);
                SubLObject isa_col = (SubLObject)rbp_wff.NIL;
                isa_col = csome_list_var.first();
                while (rbp_wff.NIL == doneP && rbp_wff.NIL != csome_list_var) {
                    if (rbp_wff.NIL != npp_genlP(isa_col, col, mt)) {
                        ans = (SubLObject)rbp_wff.T;
                        doneP = (SubLObject)rbp_wff.T;
                    }
                    else if (rbp_wff.NIL != disjoint_with.collections_disjointP(isa_col, col, mt)) {
                        doneP = (SubLObject)rbp_wff.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    isa_col = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (rbp_wff.NIL != doneP) {
            return ans;
        }
        if (rbp_wff.$kw64$PERMISSIVE == naut_handling) {
            return (SubLObject)rbp_wff.T;
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 14687L)
    public static SubLObject npp_not_type_disjointP(final SubLObject denot, final SubLObject target, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = rbp_wff.$const50$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (target.eql(rbp_wff.$const66$Thing)) {
            return (SubLObject)rbp_wff.T;
        }
        SubLObject malP = (SubLObject)rbp_wff.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            malP = npp_do_ntdP(denot, target);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == malP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 15067L)
    public static SubLObject npp_do_ntdP(final SubLObject denot, final SubLObject target) {
        if (rbp_wff.NIL == isa.isaP(denot, rbp_wff.$const67$CollectionType, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)) {
            return (SubLObject)rbp_wff.T;
        }
        if (rbp_wff.NIL == kb_indexing_datastructures.indexed_term_p(denot)) {
            return (SubLObject)rbp_wff.NIL;
        }
        SubLObject malP = (SubLObject)rbp_wff.NIL;
        if (rbp_wff.NIL == malP) {
            SubLObject csome_list_var;
            SubLObject col;
            for (csome_list_var = kb_mapping_utilities.pred_values(denot, rbp_wff.$const57$typeGenls, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED), col = (SubLObject)rbp_wff.NIL, col = csome_list_var.first(); rbp_wff.NIL == malP && rbp_wff.NIL != csome_list_var; malP = disjoint_with.collections_disjointP(col, target, (SubLObject)rbp_wff.UNPROVIDED), csome_list_var = csome_list_var.rest(), col = csome_list_var.first()) {}
        }
        return malP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 15460L)
    public static SubLObject npp_not_disjointP(SubLObject denot, final SubLObject target, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = (SubLObject)rbp_wff.NIL;
        }
        denot = function_terms.naut_to_nart(denot);
        if (rbp_wff.NIL == term.el_fort_p(denot) || rbp_wff.NIL == term.el_fort_p(target)) {
            return (SubLObject)rbp_wff.T;
        }
        if (denot.eql(rbp_wff.$const66$Thing) || target.eql(rbp_wff.$const66$Thing)) {
            return (SubLObject)rbp_wff.T;
        }
        SubLObject mts = (SubLObject)((rbp_wff.NIL != hlmt.hlmt_p(mt)) ? ConsesLow.list(mt) : rbp_defining_mts((SubLObject)ConsesLow.list(denot, target)));
        SubLObject disjointP = (SubLObject)rbp_wff.NIL;
        if (rbp_wff.NIL != mt) {
            final SubLObject item_var = mt;
            if (rbp_wff.NIL == conses_high.member(item_var, mts, Symbols.symbol_function((SubLObject)rbp_wff.EQL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                mts = (SubLObject)ConsesLow.cons(item_var, mts);
            }
        }
        if (rbp_wff.NIL == disjointP) {
            SubLObject csome_list_var;
            SubLObject mt_$14;
            for (csome_list_var = mts, mt_$14 = (SubLObject)rbp_wff.NIL, mt_$14 = csome_list_var.first(); rbp_wff.NIL == disjointP && rbp_wff.NIL != csome_list_var; disjointP = disjoint_with.collections_disjointP(denot, target, mt_$14), csome_list_var = csome_list_var.rest(), mt_$14 = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == disjointP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 16130L)
    public static SubLObject rbp_wff_find_floor_mts(final SubLObject mts) {
        final SubLObject non_base_mts = Sequences.remove(mt_vars.$mt_root$.getGlobalValue(), mts, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
        final SubLObject sorted_mts = Sort.sort(non_base_mts, (SubLObject)rbp_wff.$sym68$GENERALITY_ESTIMATE_, (SubLObject)rbp_wff.UNPROVIDED);
        if (rbp_wff.NIL == mts) {
            return (SubLObject)rbp_wff.NIL;
        }
        if (rbp_wff.NIL == sorted_mts) {
            return (SubLObject)ConsesLow.list(mt_vars.$mt_root$.getGlobalValue());
        }
        if (rbp_wff.NIL != list_utilities.singletonP(sorted_mts)) {
            return sorted_mts;
        }
        return rbp_wff_find_floor_mts_int(sorted_mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 16474L)
    public static SubLObject clear_rbp_wff_find_floor_mts_int() {
        final SubLObject cs = rbp_wff.$rbp_wff_find_floor_mts_int_caching_state$.getGlobalValue();
        if (rbp_wff.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 16474L)
    public static SubLObject remove_rbp_wff_find_floor_mts_int(final SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_wff.$rbp_wff_find_floor_mts_int_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mts), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 16474L)
    public static SubLObject rbp_wff_find_floor_mts_int_internal(final SubLObject mts) {
        return genl_mts.max_floor_mts(remove_visible_mts(mts, (SubLObject)rbp_wff.UNPROVIDED), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 16474L)
    public static SubLObject rbp_wff_find_floor_mts_int(final SubLObject mts) {
        SubLObject caching_state = rbp_wff.$rbp_wff_find_floor_mts_int_caching_state$.getGlobalValue();
        if (rbp_wff.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_wff.$sym69$RBP_WFF_FIND_FLOOR_MTS_INT, (SubLObject)rbp_wff.$sym70$_RBP_WFF_FIND_FLOOR_MTS_INT_CACHING_STATE_, (SubLObject)rbp_wff.$int71$32, (SubLObject)rbp_wff.EQUAL, (SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_wff_find_floor_mts_int_internal(mts)));
            memoization_state.caching_state_put(caching_state, mts, results, (SubLObject)rbp_wff.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 16608L)
    public static SubLObject remove_visible_mts(final SubLObject mts, SubLObject key) {
        if (key == rbp_wff.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY);
        }
        return list_utilities.remove_subsumed_items(mts, (SubLObject)rbp_wff.$sym72$MT_RELEVANT_TO_MT_, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 16830L)
    public static SubLObject mt_visible_from_mtP(final SubLObject possibly_visible_mt, final SubLObject mt) {
        return mt_relevance_macros.mt_relevant_to_mtP(mt, possibly_visible_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 16945L)
    public static SubLObject npp_isaP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = rbp_wff.$const50$InferencePSC;
        }
        SubLObject ans = (SubLObject)rbp_wff.NIL;
        if (rbp_wff.NIL != el_utilities.possibly_naut_p(obj2) && cycl_utilities.nat_functor(obj2).eql(rbp_wff.$const73$SpecsFn)) {
            return npp_genlP(obj1, cycl_utilities.nat_arg1(obj2, (SubLObject)rbp_wff.UNPROVIDED), mt);
        }
        if (rbp_wff.NIL != term.el_fort_p(obj2) && rbp_wff.NIL != genls.genlP(rbp_wff.$const74$CycLSentence_Assertible, obj2, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED) && rbp_wff.NIL != rbp_wff_el_sentence_assertibleP(obj1)) {
            return (SubLObject)rbp_wff.T;
        }
        ans = at_defns.quick_quiet_has_typeP(obj1, obj2, mt);
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 17461L)
    public static SubLObject npp_isa_or_anyP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = rbp_wff.$const50$InferencePSC;
        }
        if (obj1.eql((SubLObject)rbp_wff.$kw58$ANY) || obj2.eql((SubLObject)rbp_wff.$kw58$ANY)) {
            return (SubLObject)rbp_wff.T;
        }
        return pph_utilities.pph_isaP(obj1, obj2, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 17727L)
    public static SubLObject rbp_wff_el_sentence_assertibleP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != el_utilities.el_formula_p(obj) && rbp_wff.NIL != forts.fort_p(cycl_utilities.formula_arg0(obj)) && rbp_wff.NIL != isa.isaP(cycl_utilities.formula_arg0(obj), rbp_wff.$const75$TruthFunction, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 17980L)
    public static SubLObject npp_individualP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == npp_collectionP(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 18121L)
    public static SubLObject npp_collectionP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject collP = (SubLObject)rbp_wff.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rbp_wff.$sym38$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rbp_wff.$const39$EverythingPSC, thread);
            if (rbp_wff.NIL != forts.fort_p(obj)) {
                collP = fort_types_interface.collectionP(obj);
            }
            else if (rbp_wff.NIL != el_utilities.possibly_naut_p(obj) && rbp_wff.NIL != narts_high.find_nart(obj)) {
                collP = npp_collectionP(narts_high.find_nart(obj));
            }
            else if (rbp_wff.NIL != el_utilities.possibly_naut_p(obj)) {
                final SubLObject op = cycl_utilities.nat_functor(obj);
                if (rbp_wff.NIL != kb_indexing_datastructures.indexed_term_p(op) && (rbp_wff.NIL != kb_mapping_utilities.some_pred_value(op, rbp_wff.$const62$resultGenlArg, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED) || rbp_wff.NIL != kb_mapping_utilities.some_pred_value(op, rbp_wff.$const61$resultGenl, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED) || rbp_wff.NIL != isa.isaP(op, rbp_wff.$const76$CollectionDenotingFunction, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED))) {
                    collP = (SubLObject)rbp_wff.T;
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return collP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 18716L)
    public static SubLObject rbp_relation_all_violationP(final SubLObject gaf, final SubLObject pred, final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = (SubLObject)rbp_wff.NIL;
        }
        SubLObject v_forward = (SubLObject)rbp_wff.NIL;
        SubLObject v_backward = (SubLObject)rbp_wff.NIL;
        final SubLObject pcase_var = cycl_utilities.formula_arg0(gaf);
        if (pcase_var.eql(rbp_wff.$const77$relationAllExists)) {
            v_forward = (SubLObject)rbp_wff.$sym78$NPP_GENL_OR_ANY_;
        }
        else if (pcase_var.eql(rbp_wff.$const79$relationExistsAll)) {
            v_backward = (SubLObject)rbp_wff.$sym78$NPP_GENL_OR_ANY_;
        }
        else if (pcase_var.eql(rbp_wff.$const80$relationExistsUniqueAll)) {
            v_backward = (SubLObject)rbp_wff.$sym78$NPP_GENL_OR_ANY_;
        }
        else if (pcase_var.eql(rbp_wff.$const81$relationAllInstance)) {
            v_forward = (SubLObject)rbp_wff.$sym82$NPP_ISA_OR_ANY_;
        }
        else {
            if (!pcase_var.eql(rbp_wff.$const83$relationInstanceAll)) {
                return (SubLObject)rbp_wff.NIL;
            }
            v_backward = (SubLObject)rbp_wff.$sym82$NPP_ISA_OR_ANY_;
        }
        if (rbp_wff.NIL == npp_genl_predP(pred, cycl_utilities.formula_arg1(gaf, (SubLObject)rbp_wff.UNPROVIDED)) && rbp_wff.NIL == npp_typed_genl_predP(cycl_utilities.formula_arg1(gaf, (SubLObject)rbp_wff.UNPROVIDED), pred)) {
            return (SubLObject)rbp_wff.NIL;
        }
        if (rbp_wff.NIL != v_backward) {
            return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == npp_genl_or_anyP(col2, cycl_utilities.formula_arg3(gaf, (SubLObject)rbp_wff.UNPROVIDED), mt) || rbp_wff.NIL == Functions.funcall(v_backward, col1, cycl_utilities.formula_arg2(gaf, (SubLObject)rbp_wff.UNPROVIDED), mt));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == npp_genl_or_anyP(col1, cycl_utilities.formula_arg2(gaf, (SubLObject)rbp_wff.UNPROVIDED), mt) || rbp_wff.NIL == Functions.funcall(v_forward, col2, cycl_utilities.formula_arg3(gaf, (SubLObject)rbp_wff.UNPROVIDED), mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 19606L)
    public static SubLObject rbp_relation_all_matchP(final SubLObject gaf, final SubLObject pred, final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = (SubLObject)rbp_wff.NIL;
        }
        SubLObject v_forward = (SubLObject)rbp_wff.NIL;
        SubLObject v_backward = (SubLObject)rbp_wff.NIL;
        final SubLObject pcase_var = cycl_utilities.formula_arg0(gaf);
        if (pcase_var.eql(rbp_wff.$const77$relationAllExists)) {
            v_forward = (SubLObject)rbp_wff.$sym78$NPP_GENL_OR_ANY_;
        }
        else if (pcase_var.eql(rbp_wff.$const79$relationExistsAll)) {
            v_backward = (SubLObject)rbp_wff.$sym78$NPP_GENL_OR_ANY_;
        }
        else if (pcase_var.eql(rbp_wff.$const80$relationExistsUniqueAll)) {
            v_backward = (SubLObject)rbp_wff.$sym78$NPP_GENL_OR_ANY_;
        }
        else if (pcase_var.eql(rbp_wff.$const81$relationAllInstance)) {
            v_forward = (SubLObject)rbp_wff.$sym82$NPP_ISA_OR_ANY_;
        }
        else {
            if (!pcase_var.eql(rbp_wff.$const83$relationInstanceAll)) {
                return (SubLObject)rbp_wff.NIL;
            }
            v_backward = (SubLObject)rbp_wff.$sym82$NPP_ISA_OR_ANY_;
        }
        if (rbp_wff.NIL == npp_genl_predP(cycl_utilities.formula_arg1(gaf, (SubLObject)rbp_wff.UNPROVIDED), pred) && rbp_wff.NIL == npp_typed_genl_predP(cycl_utilities.formula_arg1(gaf, (SubLObject)rbp_wff.UNPROVIDED), pred)) {
            return (SubLObject)rbp_wff.NIL;
        }
        if (rbp_wff.NIL != v_backward) {
            return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != npp_genl_or_anyP(col2, cycl_utilities.formula_arg2(gaf, (SubLObject)rbp_wff.UNPROVIDED), mt) && rbp_wff.NIL != Functions.funcall(v_backward, col1, cycl_utilities.formula_arg3(gaf, (SubLObject)rbp_wff.UNPROVIDED), mt));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != npp_genl_or_anyP(col1, cycl_utilities.formula_arg2(gaf, (SubLObject)rbp_wff.UNPROVIDED), mt) && rbp_wff.NIL != Functions.funcall(v_forward, col2, cycl_utilities.formula_arg3(gaf, (SubLObject)rbp_wff.UNPROVIDED), mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 20468L)
    public static SubLObject rbp_defining_mt(final SubLObject term_or_terms) {
        return rbp_defining_mts(term_or_terms).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 20765L)
    public static SubLObject clear_rbp_defining_mts() {
        final SubLObject cs = rbp_wff.$rbp_defining_mts_caching_state$.getGlobalValue();
        if (rbp_wff.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 20765L)
    public static SubLObject remove_rbp_defining_mts(final SubLObject term_or_terms) {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_wff.$rbp_defining_mts_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(term_or_terms), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 20765L)
    public static SubLObject rbp_defining_mts_internal(SubLObject term_or_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        term_or_terms = parsing_utilities.strip_nl_tags(term_or_terms, (SubLObject)rbp_wff.UNPROVIDED);
        if (term_or_terms.isList()) {
            final SubLObject defining_mts = Sequences.remove_duplicates(Mapping.mapcar((SubLObject)rbp_wff.$sym85$RBP_DEFINING_MT, term_or_terms), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
            return (SubLObject)((rbp_wff.NIL != conses_high.member((SubLObject)rbp_wff.NIL, defining_mts, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)) ? rbp_wff.NIL : rbp_wff_find_floor_mts(defining_mts));
        }
        if (rbp_wff.NIL != kb_indexing_datastructures.indexed_term_p(term_or_terms)) {
            final SubLObject defining_mt = kb_accessors.defining_mt(term_or_terms);
            SubLObject mts = (SubLObject)((rbp_wff.NIL != hlmt.hlmt_p(defining_mt)) ? ConsesLow.list(defining_mt) : rbp_wff.NIL);
            if (rbp_wff.NIL == mts) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rbp_wff.$sym38$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(rbp_wff.$const39$EverythingPSC, thread);
                    SubLObject cdolist_list_var;
                    final SubLObject assertions = cdolist_list_var = rbp_defining_assertions(term_or_terms);
                    SubLObject as = (SubLObject)rbp_wff.NIL;
                    as = cdolist_list_var.first();
                    while (rbp_wff.NIL != cdolist_list_var) {
                        final SubLObject mt = assertions_high.assertion_mt(as);
                        if (rbp_wff.NIL != rbp_vocabulary_mtP(mt)) {
                            SubLObject cdolist_list_var_$15 = rbp_theory_mts(mt);
                            SubLObject theory_mt = (SubLObject)rbp_wff.NIL;
                            theory_mt = cdolist_list_var_$15.first();
                            while (rbp_wff.NIL != cdolist_list_var_$15) {
                                final SubLObject item_var = theory_mt;
                                if (rbp_wff.NIL == conses_high.member(item_var, mts, Symbols.symbol_function((SubLObject)rbp_wff.EQL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                                    mts = (SubLObject)ConsesLow.cons(item_var, mts);
                                }
                                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                theory_mt = cdolist_list_var_$15.first();
                            }
                        }
                        else {
                            final SubLObject item_var2 = mt;
                            if (rbp_wff.NIL == conses_high.member(item_var2, mts, Symbols.symbol_function((SubLObject)rbp_wff.EQL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                                mts = (SubLObject)ConsesLow.cons(item_var2, mts);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        as = cdolist_list_var.first();
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            mts = list_utilities.remove_subsumed_items(mts, (SubLObject)rbp_wff.$sym86$MT_VISIBLE_FROM_MT_, (SubLObject)rbp_wff.UNPROVIDED);
            return (SubLObject)((rbp_wff.NIL != mts) ? mts : ConsesLow.list(mt_vars.$assertible_theory_mt_root$.getGlobalValue()));
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 20765L)
    public static SubLObject rbp_defining_mts(final SubLObject term_or_terms) {
        SubLObject caching_state = rbp_wff.$rbp_defining_mts_caching_state$.getGlobalValue();
        if (rbp_wff.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_wff.$sym84$RBP_DEFINING_MTS, (SubLObject)rbp_wff.$sym87$_RBP_DEFINING_MTS_CACHING_STATE_, (SubLObject)rbp_wff.$int88$512, (SubLObject)rbp_wff.EQL, (SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.$int21$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, term_or_terms, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_defining_mts_internal(term_or_terms)));
            memoization_state.caching_state_put(caching_state, term_or_terms, results, (SubLObject)rbp_wff.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 21891L)
    public static SubLObject rbp_defining_assertions(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rbp_wff.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rbp_wff.$sym38$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rbp_wff.$const39$EverythingPSC, thread);
            SubLObject cdolist_list_var = (SubLObject)rbp_wff.$list90;
            SubLObject defining_pred = (SubLObject)rbp_wff.NIL;
            defining_pred = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$16 = kb_mapping.gather_gaf_arg_index(v_term, (SubLObject)rbp_wff.ONE_INTEGER, defining_pred, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                SubLObject defining_assertion = (SubLObject)rbp_wff.NIL;
                defining_assertion = cdolist_list_var_$16.first();
                while (rbp_wff.NIL != cdolist_list_var_$16) {
                    final SubLObject col = assertions_high.gaf_arg2(defining_assertion);
                    final SubLObject mt = assertions_high.assertion_mt(defining_assertion);
                    if (!mt.eql(rbp_wff.$const89$BookkeepingMt) && rbp_wff.NIL == kb_accessors.anectP(col)) {
                        ans = (SubLObject)ConsesLow.cons(defining_assertion, ans);
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    defining_assertion = cdolist_list_var_$16.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                defining_pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 22417L)
    public static SubLObject rbp_theory_mts(final SubLObject vocab_mt) {
        return kb_mapping_utilities.pred_values(vocab_mt, rbp_wff.$const91$genlMt_Vocabulary, (SubLObject)rbp_wff.TWO_INTEGER, (SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 22584L)
    public static SubLObject rbp_vocabulary_mts() {
        if (rbp_wff.$rbp_vocabulary_mts$.getGlobalValue().eql((SubLObject)rbp_wff.$kw5$UNINITIALIZED)) {
            rbp_wff.$rbp_vocabulary_mts$.setGlobalValue(isa.all_fort_instances(rbp_wff.$const92$VocabularyMicrotheory, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED));
        }
        return rbp_wff.$rbp_vocabulary_mts$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 22787L)
    public static SubLObject rbp_vocabulary_mtP(final SubLObject mt) {
        return subl_promotions.memberP(mt, rbp_vocabulary_mts(), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 22904L)
    public static SubLObject rbp_wff_test_failsP(final SubLObject test, final SubLObject denot, final SubLObject target, SubLObject mt) {
        if (mt == rbp_wff.UNPROVIDED) {
            mt = (SubLObject)rbp_wff.NIL;
        }
        return rbp_wff_test_fails_intP(test, denot, target, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 23108L)
    public static SubLObject clear_rbp_wff_test_fails_intP() {
        final SubLObject cs = rbp_wff.$rbp_wff_test_fails_intP_caching_state$.getGlobalValue();
        if (rbp_wff.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 23108L)
    public static SubLObject remove_rbp_wff_test_fails_intP(final SubLObject test, final SubLObject denot, final SubLObject target, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_wff.$rbp_wff_test_fails_intP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(test, denot, target, mt), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 23108L)
    public static SubLObject rbp_wff_test_fails_intP_internal(final SubLObject test, final SubLObject denot, final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject passP = (SubLObject)rbp_wff.NIL;
        if (denot.isKeyword()) {
            passP = (SubLObject)rbp_wff.T;
        }
        else if (rbp_wff.NIL != rbp_wff_contains_strippable_nl_tagP(denot)) {
            final SubLObject stripped_denot = parsing_utilities.strip_nl_tags(denot, (SubLObject)rbp_wff.UNPROVIDED);
            final SubLObject _prev_bind_0 = rbp_wff.$rbp_show_non_wffP$.currentBinding(thread);
            try {
                rbp_wff.$rbp_show_non_wffP$.bind((SubLObject)rbp_wff.NIL, thread);
                if (!denot.equal(stripped_denot)) {
                    passP = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == rbp_wff_test_failsP(test, stripped_denot, target, mt) || (rbp_wff.NIL != npp_collectionP(stripped_denot) && rbp_wff.NIL == rbp_wff_test_failsP(test, (SubLObject)ConsesLow.list(rbp_wff.$const94$SomeFn, stripped_denot), target, mt)));
                }
            }
            finally {
                rbp_wff.$rbp_show_non_wffP$.rebind(_prev_bind_0, thread);
            }
        }
        else if (rbp_wff.NIL != Functions.funcall(test, denot, target, mt)) {
            passP = (SubLObject)rbp_wff.T;
        }
        if (rbp_wff.NIL == passP && rbp_wff.NIL != rbp_wff.$rbp_show_non_wffP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)rbp_wff.T, (SubLObject)rbp_wff.$str95$__RBP_Wff_check_failed___the_foll, (SubLObject)ConsesLow.list(test, denot, target, mt));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == passP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 23108L)
    public static SubLObject rbp_wff_test_fails_intP(final SubLObject test, final SubLObject denot, final SubLObject target, final SubLObject mt) {
        SubLObject caching_state = rbp_wff.$rbp_wff_test_fails_intP_caching_state$.getGlobalValue();
        if (rbp_wff.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_wff.$sym93$RBP_WFF_TEST_FAILS_INT_, (SubLObject)rbp_wff.$sym96$_RBP_WFF_TEST_FAILS_INT__CACHING_STATE_, (SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.EQUALP, (SubLObject)rbp_wff.FOUR_INTEGER, (SubLObject)rbp_wff.$int21$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(test, denot, target, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rbp_wff.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rbp_wff.NIL;
            collision = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (test.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (denot.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (target.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (rbp_wff.NIL != cached_args && rbp_wff.NIL == cached_args.rest() && mt.equalp(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_wff_test_fails_intP_internal(test, denot, target, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(test, denot, target, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 23989L)
    public static SubLObject rbp_wff_contains_strippable_nl_tagP(final SubLObject denot) {
        final SubLObject stripped_denot = parsing_utilities.strip_nl_tags(denot, (SubLObject)rbp_wff.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(!denot.equal(stripped_denot));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 24147L)
    public static SubLObject rbp_wff_convert_nat(final SubLObject nat, SubLObject kw_arg_num) {
        if (kw_arg_num == rbp_wff.UNPROVIDED) {
            kw_arg_num = (SubLObject)rbp_wff.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template_stack = (SubLObject)rbp_wff.NIL;
        SubLObject v_bindings = (SubLObject)rbp_wff.NIL;
        SubLObject stripped_nat = (SubLObject)rbp_wff.NIL;
        stripped_nat = parsing_utilities.strip_nl_tags(nat, (SubLObject)rbp_wff.UNPROVIDED);
        SubLObject list_var = (SubLObject)rbp_wff.NIL;
        SubLObject arg = (SubLObject)rbp_wff.NIL;
        SubLObject i = (SubLObject)rbp_wff.NIL;
        list_var = stripped_nat;
        arg = list_var.first();
        for (i = (SubLObject)rbp_wff.ZERO_INTEGER; rbp_wff.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), i = Numbers.add((SubLObject)rbp_wff.ONE_INTEGER, i)) {
            if (i.isZero()) {
                template_stack = (SubLObject)ConsesLow.cons(arg, template_stack);
            }
            else if (rbp_wff.NIL != term.nautP(arg, (SubLObject)rbp_wff.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject arg_template = rbp_wff_convert_nat(arg, kw_arg_num);
                final SubLObject arg_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                template_stack = (SubLObject)ConsesLow.cons(arg_template, template_stack);
                v_bindings = ConsesLow.append(v_bindings, arg_bindings);
                kw_arg_num = Numbers.add(kw_arg_num, Sequences.length(arg_bindings));
            }
            else if (rbp_wff.NIL != rbp_wff_isaP(arg, rbp_wff.$const97$Relation, (SubLObject)rbp_wff.UNPROVIDED)) {
                template_stack = (SubLObject)ConsesLow.cons(arg, template_stack);
            }
            else {
                final SubLObject keyword = at_utilities.get_generic_arg(kw_arg_num);
                kw_arg_num = Numbers.add(kw_arg_num, (SubLObject)rbp_wff.ONE_INTEGER);
                template_stack = (SubLObject)ConsesLow.cons(keyword, template_stack);
                v_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(keyword, arg), v_bindings);
            }
        }
        return Values.values(Sequences.reverse(template_stack), v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 25201L)
    public static SubLObject rbp_wff_constraints_primary(final SubLObject template, final SubLObject keyword_bindings, SubLObject type_level_args) {
        if (type_level_args == rbp_wff.UNPROVIDED) {
            type_level_args = (SubLObject)rbp_wff.NIL;
        }
        return (SubLObject)((rbp_wff.NIL != el_utilities.el_formula_p(template)) ? rbp_wff_constraints_prim_int_cached(template, keyword_bindings, type_level_args) : rbp_wff.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 25583L)
    public static SubLObject clear_rbp_wff_constraints_prim_int_cached() {
        final SubLObject cs = rbp_wff.$rbp_wff_constraints_prim_int_cached_caching_state$.getGlobalValue();
        if (rbp_wff.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 25583L)
    public static SubLObject remove_rbp_wff_constraints_prim_int_cached(final SubLObject template, final SubLObject keyword_bindings, final SubLObject type_level_args) {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_wff.$rbp_wff_constraints_prim_int_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(template, keyword_bindings, type_level_args), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 25583L)
    public static SubLObject rbp_wff_constraints_prim_int_cached_internal(SubLObject template, final SubLObject keyword_bindings, final SubLObject type_level_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        template = rbp_wff_instantiate_types(template, keyword_bindings);
        final SubLObject reln = cycl_utilities.formula_operator(template);
        SubLObject constraints = (SubLObject)rbp_wff.NIL;
        if (rbp_wff.NIL == kb_indexing_datastructures.indexed_term_p(reln)) {
            return rbp_constraints_for_parsed_preds(keyword_bindings, template);
        }
        final SubLObject check_top_level_constraintsP = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == fort_types_interface.logical_connective_p(reln) && rbp_wff.NIL == fort_types_interface.quantifier_p(reln));
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject argnum;
        SubLObject arg;
        SubLObject found_keywordP;
        SubLObject arg_cycl;
        SubLObject term_lookup_mt;
        SubLObject base_mt;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject csome_list_var;
        SubLObject binding;
        SubLObject constraint_cols;
        SubLObject iai_constraint_mt;
        SubLObject cdolist_list_var;
        SubLObject constraint_col;
        SubLObject not_isa_constraint_mt;
        SubLObject cdolist_list_var2;
        SubLObject isa_constraint;
        SubLObject genl_constraint;
        SubLObject nd_constraint;
        SubLObject current;
        SubLObject datum;
        SubLObject col;
        SubLObject mt;
        for (cdotimes_end_var = el_utilities.formula_arity(template, (SubLObject)rbp_wff.UNPROVIDED), i = (SubLObject)rbp_wff.NIL, i = (SubLObject)rbp_wff.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)rbp_wff.ONE_INTEGER)) {
            argnum = number_utilities.f_1X(i);
            arg = cycl_utilities.formula_arg(template, argnum, (SubLObject)rbp_wff.UNPROVIDED);
            if (rbp_wff.NIL != check_top_level_constraintsP) {
                found_keywordP = (SubLObject)rbp_wff.NIL;
                arg_cycl = (SubLObject)rbp_wff.NIL;
                term_lookup_mt = (SubLObject)rbp_wff.NIL;
                base_mt = rbp_wff_info_lookup_mt(reln);
                _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rbp_wff.$sym60$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(base_mt, thread);
                    if (rbp_wff.NIL == found_keywordP) {
                        csome_list_var = keyword_bindings;
                        binding = (SubLObject)rbp_wff.NIL;
                        binding = csome_list_var.first();
                        while (rbp_wff.NIL == found_keywordP && rbp_wff.NIL != csome_list_var) {
                            if (rbp_wff.NIL != list_utilities.tree_find(binding.first(), arg, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)) {
                                found_keywordP = (SubLObject)rbp_wff.T;
                                arg_cycl = binding.rest();
                                term_lookup_mt = rbp_wff_info_lookup_mt(arg_cycl);
                            }
                            csome_list_var = csome_list_var.rest();
                            binding = csome_list_var.first();
                        }
                    }
                    if (rbp_wff.NIL != found_keywordP) {
                        thread.resetMultipleValues();
                        constraint_cols = rbp_iai_constraints(template, keyword_bindings, argnum, type_level_args);
                        iai_constraint_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        cdolist_list_var = constraint_cols;
                        constraint_col = (SubLObject)rbp_wff.NIL;
                        constraint_col = cdolist_list_var.first();
                        while (rbp_wff.NIL != cdolist_list_var) {
                            constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rbp_wff.$kw26$ISA, arg, constraint_col, iai_constraint_mt), constraints);
                            cdolist_list_var = cdolist_list_var.rest();
                            constraint_col = cdolist_list_var.first();
                        }
                        thread.resetMultipleValues();
                        constraint_cols = rbp_not_isa_constraints(template, keyword_bindings, argnum, type_level_args);
                        not_isa_constraint_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        cdolist_list_var = constraint_cols;
                        constraint_col = (SubLObject)rbp_wff.NIL;
                        constraint_col = cdolist_list_var.first();
                        while (rbp_wff.NIL != cdolist_list_var) {
                            constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rbp_wff.$kw28$NOT_ISA, arg, constraint_col, not_isa_constraint_mt), constraints);
                            cdolist_list_var = cdolist_list_var.rest();
                            constraint_col = cdolist_list_var.first();
                        }
                        cdolist_list_var2 = rbp_isa_constraint_cols(template, argnum);
                        isa_constraint = (SubLObject)rbp_wff.NIL;
                        isa_constraint = cdolist_list_var2.first();
                        while (rbp_wff.NIL != cdolist_list_var2) {
                            constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rbp_wff.$kw26$ISA, arg, isa_constraint, term_lookup_mt), constraints);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            isa_constraint = cdolist_list_var2.first();
                        }
                        cdolist_list_var2 = rbp_genl_constraint_cols(template, argnum);
                        genl_constraint = (SubLObject)rbp_wff.NIL;
                        genl_constraint = cdolist_list_var2.first();
                        while (rbp_wff.NIL != cdolist_list_var2) {
                            constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rbp_wff.$kw30$GENL, arg, genl_constraint, term_lookup_mt), constraints);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            genl_constraint = cdolist_list_var2.first();
                        }
                        cdolist_list_var2 = rbp_iand_constraints(template, keyword_bindings, argnum, type_level_args);
                        nd_constraint = (SubLObject)rbp_wff.NIL;
                        nd_constraint = cdolist_list_var2.first();
                        while (rbp_wff.NIL != cdolist_list_var2) {
                            datum = (current = nd_constraint);
                            col = (SubLObject)rbp_wff.NIL;
                            mt = (SubLObject)rbp_wff.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list99);
                            col = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list99);
                            mt = current.first();
                            current = current.rest();
                            if (rbp_wff.NIL == current) {
                                constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rbp_wff.$kw34$NOT_DISJOINT, arg, col, mt), constraints);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rbp_wff.$list99);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            nd_constraint = cdolist_list_var2.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            if (rbp_wff.NIL != el_utilities.el_formula_p(arg)) {
                constraints = ConsesLow.append(constraints, rbp_wff_constraints_primary(arg, keyword_bindings, (SubLObject)rbp_wff.UNPROVIDED));
            }
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 25583L)
    public static SubLObject rbp_wff_constraints_prim_int_cached(final SubLObject template, final SubLObject keyword_bindings, final SubLObject type_level_args) {
        SubLObject caching_state = rbp_wff.$rbp_wff_constraints_prim_int_cached_caching_state$.getGlobalValue();
        if (rbp_wff.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_wff.$sym98$RBP_WFF_CONSTRAINTS_PRIM_INT_CACHED, (SubLObject)rbp_wff.$sym100$_RBP_WFF_CONSTRAINTS_PRIM_INT_CACHED_CACHING_STATE_, (SubLObject)rbp_wff.$int88$512, (SubLObject)rbp_wff.EQUALP, (SubLObject)rbp_wff.THREE_INTEGER, (SubLObject)rbp_wff.$int21$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(template, keyword_bindings, type_level_args);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rbp_wff.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rbp_wff.NIL;
            collision = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (template.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (keyword_bindings.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rbp_wff.NIL != cached_args && rbp_wff.NIL == cached_args.rest() && type_level_args.equalp(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_wff_constraints_prim_int_cached_internal(template, keyword_bindings, type_level_args)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(template, keyword_bindings, type_level_args));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 28058L)
    public static SubLObject rbp_isa_constraint_cols(final SubLObject template, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject reln = cycl_utilities.formula_operator(template);
        SubLObject constraint_cols = kb_accessors.argn_isa(reln, argnum, (SubLObject)rbp_wff.UNPROVIDED);
        if (rbp_wff.NIL != rbp_wff.$rbp_known_false_equals_non_wffP$.getDynamicValue(thread) && argnum.eql((SubLObject)rbp_wff.ONE_INTEGER) && rbp_wff.NIL != formula_pattern_match.formula_matches_pattern(template, (SubLObject)rbp_wff.$list101)) {
            final SubLObject item_var = cycl_utilities.formula_arg2(template, (SubLObject)rbp_wff.UNPROVIDED);
            if (rbp_wff.NIL == conses_high.member(item_var, constraint_cols, Symbols.symbol_function((SubLObject)rbp_wff.EQL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                constraint_cols = (SubLObject)ConsesLow.cons(item_var, constraint_cols);
            }
        }
        return constraint_cols;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 28622L)
    public static SubLObject rbp_genl_constraint_cols(final SubLObject template, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject reln = cycl_utilities.formula_operator(template);
        SubLObject constraint_cols = kb_accessors.argn_genl(reln, argnum, (SubLObject)rbp_wff.UNPROVIDED);
        if (rbp_wff.NIL != rbp_wff.$rbp_known_false_equals_non_wffP$.getDynamicValue(thread) && argnum.eql((SubLObject)rbp_wff.ONE_INTEGER) && rbp_wff.NIL != formula_pattern_match.formula_matches_pattern(template, (SubLObject)rbp_wff.$list102)) {
            final SubLObject item_var = cycl_utilities.formula_arg2(template, (SubLObject)rbp_wff.UNPROVIDED);
            if (rbp_wff.NIL == conses_high.member(item_var, constraint_cols, Symbols.symbol_function((SubLObject)rbp_wff.EQL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                constraint_cols = (SubLObject)ConsesLow.cons(item_var, constraint_cols);
            }
        }
        return constraint_cols;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 29142L)
    public static SubLObject rbp_constraints_for_parsed_preds(final SubLObject v_bindings, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rbp_wff.NIL == el_utilities.el_binary_formula_p(template)) {
            return (SubLObject)rbp_wff.NIL;
        }
        SubLObject the_pred = (SubLObject)rbp_wff.NIL;
        SubLObject arg1 = (SubLObject)rbp_wff.NIL;
        SubLObject arg2 = (SubLObject)rbp_wff.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(template, template, (SubLObject)rbp_wff.$list103);
        the_pred = template.first();
        SubLObject current = template.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, template, (SubLObject)rbp_wff.$list103);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, template, (SubLObject)rbp_wff.$list103);
        arg2 = current.first();
        current = current.rest();
        if (rbp_wff.NIL == current) {
            if (!the_pred.isKeyword()) {
                return (SubLObject)rbp_wff.NIL;
            }
            the_pred = rbp_template_predicate(template, v_bindings);
            if (rbp_wff.NIL != fort_types_interface.predicate_p(the_pred)) {
                SubLObject constraints = (SubLObject)rbp_wff.NIL;
                if (arg1.eql((SubLObject)rbp_wff.$kw104$MODIFIER) || arg1.eql((SubLObject)rbp_wff.$kw105$HEAD)) {
                    SubLObject cdolist_list_var = kb_accessors.argn_isa(the_pred, (SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.UNPROVIDED);
                    SubLObject col = (SubLObject)rbp_wff.NIL;
                    col = cdolist_list_var.first();
                    while (rbp_wff.NIL != cdolist_list_var) {
                        final SubLObject item_var = (SubLObject)ConsesLow.list((SubLObject)rbp_wff.$kw26$ISA, arg1, col, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                        if (rbp_wff.NIL == conses_high.member(item_var, constraints, (SubLObject)rbp_wff.EQUAL, Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                            constraints = (SubLObject)ConsesLow.cons(item_var, constraints);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    }
                    cdolist_list_var = kb_accessors.argn_genl(the_pred, (SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.UNPROVIDED);
                    col = (SubLObject)rbp_wff.NIL;
                    col = cdolist_list_var.first();
                    while (rbp_wff.NIL != cdolist_list_var) {
                        final SubLObject item_var = (SubLObject)ConsesLow.list((SubLObject)rbp_wff.$kw30$GENL, arg1, col, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                        if (rbp_wff.NIL == conses_high.member(item_var, constraints, (SubLObject)rbp_wff.EQUAL, Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                            constraints = (SubLObject)ConsesLow.cons(item_var, constraints);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    }
                }
                if (arg2.eql((SubLObject)rbp_wff.$kw104$MODIFIER) || arg2.eql((SubLObject)rbp_wff.$kw105$HEAD)) {
                    SubLObject cdolist_list_var = kb_accessors.argn_isa(the_pred, (SubLObject)rbp_wff.TWO_INTEGER, (SubLObject)rbp_wff.UNPROVIDED);
                    SubLObject col = (SubLObject)rbp_wff.NIL;
                    col = cdolist_list_var.first();
                    while (rbp_wff.NIL != cdolist_list_var) {
                        final SubLObject item_var = (SubLObject)ConsesLow.list((SubLObject)rbp_wff.$kw26$ISA, arg2, col, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                        if (rbp_wff.NIL == conses_high.member(item_var, constraints, (SubLObject)rbp_wff.EQUAL, Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                            constraints = (SubLObject)ConsesLow.cons(item_var, constraints);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    }
                    cdolist_list_var = kb_accessors.argn_genl(the_pred, (SubLObject)rbp_wff.TWO_INTEGER, (SubLObject)rbp_wff.UNPROVIDED);
                    col = (SubLObject)rbp_wff.NIL;
                    col = cdolist_list_var.first();
                    while (rbp_wff.NIL != cdolist_list_var) {
                        final SubLObject item_var = (SubLObject)ConsesLow.list((SubLObject)rbp_wff.$kw30$GENL, arg2, col, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                        if (rbp_wff.NIL == conses_high.member(item_var, constraints, (SubLObject)rbp_wff.EQUAL, Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                            constraints = (SubLObject)ConsesLow.cons(item_var, constraints);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    }
                }
                return constraints;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(template, (SubLObject)rbp_wff.$list103);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 30180L)
    public static SubLObject rbp_wff_instantiate_types(SubLObject template, final SubLObject keyword_bindings) {
        if (rbp_wff.NIL == el_utilities.el_conjunction_p(template)) {
            return template;
        }
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(template, Symbols.symbol_function((SubLObject)rbp_wff.$sym25$KEYWORDP), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
        SubLObject key = (SubLObject)rbp_wff.NIL;
        key = cdolist_list_var.first();
        while (rbp_wff.NIL != cdolist_list_var) {
            if (rbp_wff.NIL == subl_promotions.memberP(key, keyword_bindings, Symbols.symbol_function((SubLObject)rbp_wff.EQ), Symbols.symbol_function((SubLObject)rbp_wff.$sym106$CAR))) {
                SubLObject foundP = (SubLObject)rbp_wff.NIL;
                if (rbp_wff.NIL == foundP) {
                    SubLObject csome_list_var = cycl_utilities.formula_args(template, (SubLObject)rbp_wff.UNPROVIDED);
                    SubLObject conjunct = (SubLObject)rbp_wff.NIL;
                    conjunct = csome_list_var.first();
                    while (rbp_wff.NIL == foundP && rbp_wff.NIL != csome_list_var) {
                        if (rbp_wff.NIL != el_utilities.el_formula_p(conjunct) && cycl_utilities.formula_operator(conjunct).eql(rbp_wff.$const107$isa) && cycl_utilities.formula_arg1(conjunct, (SubLObject)rbp_wff.UNPROVIDED).eql(key) && rbp_wff.NIL != kb_indexing_datastructures.indexed_term_p(cycl_utilities.formula_arg2(conjunct, (SubLObject)rbp_wff.UNPROVIDED))) {
                            template = Sequences.remove(conjunct, template, Symbols.symbol_function((SubLObject)rbp_wff.EQUAL), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                            template = conses_high.subst((SubLObject)ConsesLow.list(rbp_wff.$const94$SomeFn, cycl_utilities.formula_arg2(conjunct, (SubLObject)rbp_wff.UNPROVIDED)), key, template, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                            foundP = (SubLObject)rbp_wff.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        conjunct = csome_list_var.first();
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 30949L)
    public static SubLObject rbp_wff_constraints_secondary(final SubLObject template, final SubLObject keyword_bindings) {
        if (!template.isCons() || rbp_wff.NIL == list_utilities.lengthG(template, (SubLObject)rbp_wff.TWO_INTEGER, (SubLObject)rbp_wff.UNPROVIDED)) {
            return (SubLObject)rbp_wff.NIL;
        }
        SubLObject raw_constraints = (SubLObject)rbp_wff.NIL;
        final SubLObject type_level_args = rbp_wff_type_level_args(template);
        SubLObject constraints = (SubLObject)rbp_wff.NIL;
        if (rbp_wff.NIL != formula_pattern_match.formula_matches_pattern(template, (SubLObject)rbp_wff.$list108)) {
            raw_constraints = rbp_wff_constraints_from_csf(template, keyword_bindings);
        }
        else if (rbp_wff.NIL != el_utilities.el_formula_p(template)) {
            final SubLObject embedded_pred = rbp_wff_embedded_pred(template);
            if (rbp_wff.NIL != embedded_pred) {
                final SubLObject embedded_args = rbp_wff_embedded_args(template);
                final SubLObject embedded_template = el_utilities.make_el_formula(embedded_pred, embedded_args, (SubLObject)rbp_wff.UNPROVIDED);
                raw_constraints = rbp_wff_constraints_primary(embedded_template, keyword_bindings, type_level_args);
            }
        }
        SubLObject cdolist_list_var = raw_constraints;
        SubLObject constraint = (SubLObject)rbp_wff.NIL;
        constraint = cdolist_list_var.first();
        while (rbp_wff.NIL != cdolist_list_var) {
            if (rbp_wff.NIL != subl_promotions.memberP(conses_high.second(constraint), type_level_args, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)) {
                final SubLObject pcase_var = constraint.first();
                if (pcase_var.eql((SubLObject)rbp_wff.$kw26$ISA) || pcase_var.eql((SubLObject)rbp_wff.$kw34$NOT_DISJOINT)) {
                    if (list_utilities.last_one(constraint).eql(rbp_wff.$const50$InferencePSC)) {
                        constraint = list_utilities.replace_last(constraint, rbp_wff.$const109$BaseKB);
                    }
                    constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)rbp_wff.$kw34$NOT_DISJOINT, constraint.rest()), constraints);
                }
                else if (pcase_var.eql((SubLObject)rbp_wff.$kw30$GENL)) {
                    constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)rbp_wff.$kw36$TYPE_GENL, constraint.rest()), constraints);
                }
                else if (pcase_var.eql((SubLObject)rbp_wff.$kw28$NOT_ISA)) {
                    constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)rbp_wff.$kw32$NOT_GENL, constraint.rest()), constraints);
                }
            }
            else {
                constraints = (SubLObject)ConsesLow.cons(constraint, constraints);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        if (rbp_wff.NIL != el_utilities.el_formula_p(template)) {
            cdolist_list_var = cycl_utilities.formula_args(template, (SubLObject)rbp_wff.UNPROVIDED);
            SubLObject arg = (SubLObject)rbp_wff.NIL;
            arg = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                constraints = ConsesLow.append(constraints, rbp_wff_constraints_secondary(arg, keyword_bindings));
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 32598L)
    public static SubLObject rbp_wff_constraints_from_csf(final SubLObject template, final SubLObject keyword_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constraints = (SubLObject)rbp_wff.NIL;
        thread.resetMultipleValues();
        final SubLObject coll = parsing_utilities.parse_collection_expression(template);
        final SubLObject var = thread.secondMultipleValue();
        SubLObject restrictions = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (rbp_wff.NIL != forts.fort_p(coll) || coll.isKeyword()) {
            restrictions = conses_high.subst(coll, var, restrictions, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = rbp_wff.$rbp_known_false_equals_non_wffP$.currentBinding(thread);
        try {
            rbp_wff.$rbp_known_false_equals_non_wffP$.bind((SubLObject)rbp_wff.T, thread);
            SubLObject cdolist_list_var = restrictions;
            SubLObject sub_template = (SubLObject)rbp_wff.NIL;
            sub_template = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                constraints = ConsesLow.append(constraints, rbp_wff_constraints_primary(sub_template, keyword_bindings, (SubLObject)rbp_wff.NIL), rbp_wff_constraints_secondary(sub_template, keyword_bindings));
                cdolist_list_var = cdolist_list_var.rest();
                sub_template = cdolist_list_var.first();
            }
        }
        finally {
            rbp_wff.$rbp_known_false_equals_non_wffP$.rebind(_prev_bind_0, thread);
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 33231L)
    public static SubLObject rbp_iand_constraints(final SubLObject template, final SubLObject keyword_bindings, final SubLObject argnum, final SubLObject type_level_args) {
        return rbp_iand_constraints_from_genls_format(template, keyword_bindings, argnum, type_level_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 33595L)
    public static SubLObject rbp_iand_constraints_from_genls_format(final SubLObject template, final SubLObject keyword_bindings, final SubLObject argnum, final SubLObject type_level_args) {
        final SubLObject formula = rbp_subst_bindings(keyword_bindings, template);
        final SubLObject reln = cycl_utilities.formula_operator(formula);
        SubLObject constraints = (SubLObject)rbp_wff.NIL;
        if (argnum.eql((SubLObject)rbp_wff.TWO_INTEGER) && rbp_wff.NIL == subl_promotions.memberP(cycl_utilities.formula_arg(template, argnum, (SubLObject)rbp_wff.UNPROVIDED), type_level_args, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED) && rbp_wff.NIL != rbp_reln_ok_for_genls_formatP(reln)) {
            final SubLObject ind_argnum = Numbers.subtract((SubLObject)rbp_wff.THREE_INTEGER, argnum);
            final SubLObject ind_arg = cycl_utilities.formula_arg(formula, ind_argnum, (SubLObject)rbp_wff.UNPROVIDED);
            final SubLObject mt_to_check = rbp_wff_info_lookup_mt((SubLObject)ConsesLow.list(ind_arg, reln));
            final SubLObject type_levelP = subl_promotions.memberP(cycl_utilities.formula_arg(template, ind_argnum, (SubLObject)rbp_wff.UNPROVIDED), type_level_args, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject col_pairs = cdolist_list_var = rbp_iand_cols_for_reln_from_genls_format(reln, mt_to_check);
            SubLObject col_pair = (SubLObject)rbp_wff.NIL;
            col_pair = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = col_pair;
                SubLObject ind_col = (SubLObject)rbp_wff.NIL;
                SubLObject dep_col = (SubLObject)rbp_wff.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list110);
                ind_col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list110);
                dep_col = current.first();
                current = current.rest();
                if (rbp_wff.NIL == current) {
                    final SubLObject ind_col_fort = function_terms.naut_to_nart(ind_col);
                    final SubLObject appliesP = (rbp_wff.NIL != type_levelP) ? npp_genlP(ind_arg, ind_col_fort, mt_to_check) : rbp_wff_isaP(ind_arg, ind_col_fort, mt_to_check);
                    if (rbp_wff.NIL != appliesP) {
                        final SubLObject item_var = (SubLObject)ConsesLow.list(dep_col, mt_to_check);
                        if (rbp_wff.NIL == conses_high.member(item_var, constraints, Symbols.symbol_function((SubLObject)rbp_wff.EQUAL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                            constraints = (SubLObject)ConsesLow.cons(item_var, constraints);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rbp_wff.$list110);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col_pair = cdolist_list_var.first();
            }
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 34916L)
    public static SubLObject rbp_wff_info_lookup_mt(final SubLObject v_object) {
        return (rbp_wff.NIL != rbp_wff_domain_mt_setP()) ? rbp_wff_domain_mt() : rbp_defining_mt(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 35138L)
    public static SubLObject rbp_wff_domain_mt_setP() {
        final SubLObject setP = hlmt.hlmt_p(rbp_wff_domain_mt());
        return setP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 35287L)
    public static SubLObject rbp_wff_domain_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return parsing_vars.$parsing_domain_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 35389L)
    public static SubLObject rbp_reln_ok_for_genls_formatP(final SubLObject reln) {
        final SubLObject mt_to_check = rbp_wff_info_lookup_mt(reln);
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != fort_types_interface.predicate_p(reln) && rbp_wff.NIL != rbp_binary_relationP(reln) && rbp_wff.NIL != backward.removal_ask((SubLObject)ConsesLow.listS(rbp_wff.$const111$transitiveViaArgInverse, reln, (SubLObject)rbp_wff.$list112), mt_to_check, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED) && rbp_wff.NIL != backward.removal_ask((SubLObject)ConsesLow.listS(rbp_wff.$const113$arg2Format, reln, (SubLObject)rbp_wff.$list114), mt_to_check, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 35727L)
    public static SubLObject rbp_iand_cols_for_reln_from_genls_format(final SubLObject reln, final SubLObject mt) {
        return ask_utilities.ask_template((SubLObject)rbp_wff.$list115, (SubLObject)ConsesLow.listS(rbp_wff.$const81$relationAllInstance, reln, (SubLObject)rbp_wff.$list115), mt, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 35957L)
    public static SubLObject rbp_iai_constraints(final SubLObject template, final SubLObject keyword_bindings, final SubLObject argnum, final SubLObject type_level_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = rbp_subst_bindings(keyword_bindings, template);
        final SubLObject reln = cycl_utilities.formula_operator(formula);
        final SubLObject predicateP = fort_types_interface.predicate_in_any_mtP(reln);
        final SubLObject v_arity = arity.arity(reln);
        SubLObject constraint_cols = (SubLObject)rbp_wff.NIL;
        if (rbp_wff.NIL != v_arity) {
            SubLObject end_var;
            SubLObject ind_argnum;
            SubLObject ind_arg;
            SubLObject mt_to_check;
            SubLObject type_levelP;
            SubLObject constraints;
            SubLObject mt_var;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject _prev_bind_3;
            SubLObject cdolist_list_var;
            SubLObject pred;
            SubLObject cdolist_list_var_$17;
            SubLObject constraint;
            SubLObject item_var;
            SubLObject supers;
            SubLObject cdolist_list_var2;
            SubLObject con;
            SubLObject current;
            SubLObject datum;
            SubLObject ind_col;
            SubLObject dep_col;
            SubLObject appliesP;
            SubLObject item_var2;
            for (end_var = number_utilities.f_1X(v_arity), ind_argnum = (SubLObject)rbp_wff.NIL, ind_argnum = (SubLObject)rbp_wff.ONE_INTEGER; !ind_argnum.numGE(end_var); ind_argnum = number_utilities.f_1X(ind_argnum)) {
                if (!argnum.eql(ind_argnum)) {
                    ind_arg = cycl_utilities.formula_arg(formula, ind_argnum, (SubLObject)rbp_wff.UNPROVIDED);
                    mt_to_check = rbp_wff_info_lookup_mt((SubLObject)ConsesLow.list(ind_arg, reln));
                    type_levelP = subl_promotions.memberP(ConsesLow.nth(ind_argnum, template), type_level_args, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                    constraints = (SubLObject)rbp_wff.NIL;
                    mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_to_check);
                    _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (rbp_wff.NIL != predicateP) {
                            cdolist_list_var = genl_predicates.all_genl_preds(reln, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                            pred = (SubLObject)rbp_wff.NIL;
                            pred = cdolist_list_var.first();
                            while (rbp_wff.NIL != cdolist_list_var) {
                                cdolist_list_var_$17 = rbp_get_iai_constraints(pred, ind_argnum, argnum);
                                constraint = (SubLObject)rbp_wff.NIL;
                                constraint = cdolist_list_var_$17.first();
                                while (rbp_wff.NIL != cdolist_list_var_$17) {
                                    item_var = constraint;
                                    if (rbp_wff.NIL == conses_high.member(item_var, constraints, Symbols.symbol_function((SubLObject)rbp_wff.EQUALP), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                                        constraints = (SubLObject)ConsesLow.cons(item_var, constraints);
                                    }
                                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                    constraint = cdolist_list_var_$17.first();
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                pred = cdolist_list_var.first();
                            }
                        }
                        else {
                            constraints = rbp_get_iai_constraints(reln, ind_argnum, argnum);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                    if (rbp_wff.NIL != constraints) {
                        supers = (SubLObject)((rbp_wff.NIL != forts.fort_p(ind_arg)) ? ((rbp_wff.NIL != type_levelP) ? genls.all_genls(ind_arg, mt_to_check, (SubLObject)rbp_wff.UNPROVIDED) : isa.all_isa(ind_arg, mt_to_check, (SubLObject)rbp_wff.UNPROVIDED)) : rbp_wff.NIL);
                        cdolist_list_var2 = constraints;
                        con = (SubLObject)rbp_wff.NIL;
                        con = cdolist_list_var2.first();
                        while (rbp_wff.NIL != cdolist_list_var2) {
                            datum = (current = con);
                            ind_col = (SubLObject)rbp_wff.NIL;
                            dep_col = (SubLObject)rbp_wff.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list110);
                            ind_col = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list110);
                            dep_col = current.first();
                            current = current.rest();
                            if (rbp_wff.NIL == current) {
                                appliesP = ((rbp_wff.NIL != type_levelP) ? ((rbp_wff.NIL != forts.fort_p(ind_arg) && rbp_wff.NIL != forts.fort_p(ind_col)) ? conses_high.member(ind_col, supers, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED) : npp_genlP(ind_arg, ind_col, mt_to_check)) : ((rbp_wff.NIL != forts.fort_p(ind_arg) && rbp_wff.NIL != forts.fort_p(ind_col)) ? conses_high.member(ind_col, supers, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED) : rbp_wff_isaP(ind_arg, ind_col, mt_to_check)));
                                if (rbp_wff.NIL != appliesP) {
                                    item_var2 = dep_col;
                                    if (rbp_wff.NIL == conses_high.member(item_var2, constraint_cols, Symbols.symbol_function((SubLObject)rbp_wff.EQUAL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                                        constraint_cols = (SubLObject)ConsesLow.cons(item_var2, constraint_cols);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rbp_wff.$list110);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            con = cdolist_list_var2.first();
                        }
                    }
                }
            }
        }
        if (rbp_wff.NIL == constraint_cols) {
            return Values.values((SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.NIL);
        }
        final SubLObject constraint_check_mt = rbp_wff_info_lookup_mt(formula);
        return Values.values(constraint_cols, constraint_check_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 37881L)
    public static SubLObject rbp_get_iai_constraints(final SubLObject reln, final SubLObject ind_argnum, final SubLObject dep_argnum) {
        final SubLObject iai_pred = rbp_get_iai_pred(ind_argnum, dep_argnum);
        return (SubLObject)((rbp_wff.NIL != iai_pred && rbp_wff.NIL != kb_indexing_datastructures.indexed_term_p(reln)) ? kb_mapping_utilities.pred_value_tuples(reln, iai_pred, (SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.$list116, (SubLObject)rbp_wff.UNPROVIDED) : rbp_wff.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38610L)
    public static SubLObject clear_rbp_get_iai_pred() {
        final SubLObject cs = rbp_wff.$rbp_get_iai_pred_caching_state$.getGlobalValue();
        if (rbp_wff.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38610L)
    public static SubLObject remove_rbp_get_iai_pred(final SubLObject ind_argnum, final SubLObject dep_argnum) {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_wff.$rbp_get_iai_pred_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(ind_argnum, dep_argnum), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38610L)
    public static SubLObject rbp_get_iai_pred_internal(final SubLObject ind_argnum, final SubLObject dep_argnum) {
        return ask_utilities.ask_template((SubLObject)rbp_wff.$sym122$_PRED, (SubLObject)ConsesLow.list(rbp_wff.$const123$and, (SubLObject)rbp_wff.$list124, (SubLObject)ConsesLow.list(rbp_wff.$const125$constrainsArgs, (SubLObject)rbp_wff.$sym122$_PRED, ind_argnum, dep_argnum)), rbp_wff.$inter_arg_isa_predicate_mt$.getGlobalValue(), (SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38610L)
    public static SubLObject rbp_get_iai_pred(final SubLObject ind_argnum, final SubLObject dep_argnum) {
        SubLObject caching_state = rbp_wff.$rbp_get_iai_pred_caching_state$.getGlobalValue();
        if (rbp_wff.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_wff.$sym121$RBP_GET_IAI_PRED, (SubLObject)rbp_wff.$sym126$_RBP_GET_IAI_PRED_CACHING_STATE_, (SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.EQ, (SubLObject)rbp_wff.TWO_INTEGER, (SubLObject)rbp_wff.$int71$32);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(ind_argnum, dep_argnum);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rbp_wff.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rbp_wff.NIL;
            collision = cdolist_list_var.first();
            while (rbp_wff.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (ind_argnum.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rbp_wff.NIL != cached_args && rbp_wff.NIL == cached_args.rest() && dep_argnum.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_get_iai_pred_internal(ind_argnum, dep_argnum)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(ind_argnum, dep_argnum));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38879L)
    public static SubLObject clear_rbp_get_ani_pred() {
        final SubLObject cs = rbp_wff.$rbp_get_ani_pred_caching_state$.getGlobalValue();
        if (rbp_wff.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38879L)
    public static SubLObject remove_rbp_get_ani_pred(final SubLObject argnum) {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_wff.$rbp_get_ani_pred_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(argnum), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38879L)
    public static SubLObject rbp_get_ani_pred_internal(final SubLObject argnum) {
        return ask_utilities.ask_template((SubLObject)rbp_wff.$sym122$_PRED, (SubLObject)ConsesLow.list(rbp_wff.$const123$and, (SubLObject)rbp_wff.$list128, (SubLObject)rbp_wff.$list129, (SubLObject)ConsesLow.list(rbp_wff.$const130$constrainsArg, (SubLObject)rbp_wff.$sym122$_PRED, argnum)), rbp_wff.$arg_not_isa_predicate_mt$.getGlobalValue(), (SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 38879L)
    public static SubLObject rbp_get_ani_pred(final SubLObject argnum) {
        SubLObject caching_state = rbp_wff.$rbp_get_ani_pred_caching_state$.getGlobalValue();
        if (rbp_wff.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_wff.$sym127$RBP_GET_ANI_PRED, (SubLObject)rbp_wff.$sym131$_RBP_GET_ANI_PRED_CACHING_STATE_, (SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.EQ, (SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.$int71$32);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, argnum, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_get_ani_pred_internal(argnum)));
            memoization_state.caching_state_put(caching_state, argnum, results, (SubLObject)rbp_wff.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 39153L)
    public static SubLObject rbp_not_isa_constraints(final SubLObject template, final SubLObject keyword_bindings, final SubLObject argnum, final SubLObject type_level_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = rbp_subst_bindings(keyword_bindings, template);
        final SubLObject reln = cycl_utilities.formula_operator(formula);
        final SubLObject reln_mt = rbp_wff_info_lookup_mt(reln);
        SubLObject constraint_cols = (SubLObject)rbp_wff.NIL;
        final SubLObject ani_pred = rbp_get_ani_pred(argnum);
        if (rbp_wff.NIL != kb_indexing_datastructures.indexed_term_p(ani_pred)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(reln_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (rbp_wff.NIL != fort_types_interface.predicate_p(reln)) {
                    final SubLObject module = sbhl_module_vars.get_sbhl_module(rbp_wff.$const132$genlPreds);
                    final SubLObject node_var = reln;
                    final SubLObject deck_type = (SubLObject)((rbp_wff.$kw133$BREADTH == rbp_wff.$kw134$DEPTH) ? rbp_wff.$kw135$STACK : rbp_wff.$kw136$QUEUE);
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject node_and_predicate_mode = (SubLObject)rbp_wff.NIL;
                    final SubLObject _prev_bind_0_$18 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)rbp_wff.NIL;
                            final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((rbp_wff.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((rbp_wff.NIL != tv_var) ? rbp_wff.$sym137$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (rbp_wff.NIL != tv_var && rbp_wff.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && rbp_wff.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)rbp_wff.$kw138$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.$str139$_A_is_not_a__A, tv_var, (SubLObject)rbp_wff.$sym140$SBHL_TRUE_TV_P, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)rbp_wff.$kw141$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.$str142$continue_anyway, (SubLObject)rbp_wff.$str139$_A_is_not_a__A, tv_var, (SubLObject)rbp_wff.$sym140$SBHL_TRUE_TV_P, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)rbp_wff.$kw143$WARN)) {
                                        Errors.warn((SubLObject)rbp_wff.$str139$_A_is_not_a__A, tv_var, (SubLObject)rbp_wff.$sym140$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)rbp_wff.$str144$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)rbp_wff.$str142$continue_anyway, (SubLObject)rbp_wff.$str139$_A_is_not_a__A, tv_var, (SubLObject)rbp_wff.$sym140$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$23 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rbp_wff.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                    if (rbp_wff.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || rbp_wff.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$22 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rbp_wff.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)rbp_wff.UNPROVIDED);
                                            for (node_and_predicate_mode = (SubLObject)ConsesLow.list(reln, sbhl_search_vars.genl_inverse_mode_p()); rbp_wff.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                final SubLObject node_var_$27 = node_and_predicate_mode.first();
                                                final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                                final SubLObject genl_pred = node_var_$27;
                                                final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    final SubLObject inverseP = predicate_mode;
                                                    if (rbp_wff.NIL == inverseP) {
                                                        final SubLObject pred_var = ani_pred;
                                                        if (rbp_wff.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl_pred, (SubLObject)rbp_wff.NIL, pred_var)) {
                                                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl_pred, (SubLObject)rbp_wff.NIL, pred_var);
                                                            SubLObject done_var = (SubLObject)rbp_wff.NIL;
                                                            final SubLObject token_var = (SubLObject)rbp_wff.NIL;
                                                            while (rbp_wff.NIL == done_var) {
                                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                                if (rbp_wff.NIL != valid) {
                                                                    SubLObject final_index_iterator = (SubLObject)rbp_wff.NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rbp_wff.$kw52$GAF, (SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.NIL);
                                                                        SubLObject done_var_$29 = (SubLObject)rbp_wff.NIL;
                                                                        final SubLObject token_var_$30 = (SubLObject)rbp_wff.NIL;
                                                                        while (rbp_wff.NIL == done_var_$29) {
                                                                            final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$30);
                                                                            final SubLObject valid_$31 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$30.eql(as));
                                                                            if (rbp_wff.NIL != valid_$31) {
                                                                                final SubLObject item_var = assertions_high.gaf_arg2(as);
                                                                                if (rbp_wff.NIL == conses_high.member(item_var, constraint_cols, Symbols.symbol_function((SubLObject)rbp_wff.EQL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                                                                                    constraint_cols = (SubLObject)ConsesLow.cons(item_var, constraint_cols);
                                                                                }
                                                                            }
                                                                            done_var_$29 = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid_$31);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rbp_wff.T, thread);
                                                                            final SubLObject _values = Values.getValuesAsVector();
                                                                            if (rbp_wff.NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                            Values.restoreValuesFromVector(_values);
                                                                        }
                                                                        finally {
                                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                                                        }
                                                                    }
                                                                }
                                                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid);
                                                            }
                                                        }
                                                    }
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                                    SubLObject module_var = (SubLObject)rbp_wff.NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (rbp_wff.NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$24 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((rbp_wff.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(rbp_wff.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(node_var_$27);
                                                            if (rbp_wff.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED));
                                                                if (rbp_wff.NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED));
                                                                    if (rbp_wff.NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); rbp_wff.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (rbp_wff.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$36;
                                                                                    for (iteration_state_$36 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); rbp_wff.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$36); iteration_state_$36 = dictionary_contents.do_dictionary_contents_next(iteration_state_$36)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$36);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (rbp_wff.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (rbp_wff.NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rbp_wff.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rbp_wff.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (rbp_wff.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && rbp_wff.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)rbp_wff.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)rbp_wff.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = (SubLObject)rbp_wff.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (rbp_wff.NIL != csome_list_var) {
                                                                                                        if (rbp_wff.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)rbp_wff.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)rbp_wff.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)rbp_wff.$str145$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$26, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$36);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$25, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)rbp_wff.FIVE_INTEGER, (SubLObject)rbp_wff.$str146$attempting_to_bind_direction_link, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (rbp_wff.NIL != obsolete.cnat_p(node, (SubLObject)rbp_wff.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$38;
                                                                final SubLObject new_list = cdolist_list_var_$38 = ((rbp_wff.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED)));
                                                                SubLObject generating_fn = (SubLObject)rbp_wff.NIL;
                                                                generating_fn = cdolist_list_var_$38.first();
                                                                while (rbp_wff.NIL != cdolist_list_var_$38) {
                                                                    final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                        if (rbp_wff.NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)rbp_wff.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); rbp_wff.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (rbp_wff.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && rbp_wff.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)rbp_wff.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)rbp_wff.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = (SubLObject)rbp_wff.NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (rbp_wff.NIL != csome_list_var2) {
                                                                                if (rbp_wff.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)rbp_wff.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)rbp_wff.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)rbp_wff.$str145$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$27, thread);
                                                                    }
                                                                    cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                                                    generating_fn = cdolist_list_var_$38.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$23, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$24, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$22, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$24, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$22, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)rbp_wff.TWO_INTEGER, (SubLObject)rbp_wff.$str147$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED)), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$23, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$21, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$20, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$20, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$19, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rbp_wff.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$18, thread);
                    }
                }
                else {
                    final SubLObject pred_var2 = ani_pred;
                    if (rbp_wff.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, (SubLObject)rbp_wff.NIL, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, (SubLObject)rbp_wff.NIL, pred_var2);
                        SubLObject done_var2 = (SubLObject)rbp_wff.NIL;
                        final SubLObject token_var2 = (SubLObject)rbp_wff.NIL;
                        while (rbp_wff.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (rbp_wff.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)rbp_wff.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)rbp_wff.$kw52$GAF, (SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.NIL);
                                    SubLObject done_var_$30 = (SubLObject)rbp_wff.NIL;
                                    final SubLObject token_var_$31 = (SubLObject)rbp_wff.NIL;
                                    while (rbp_wff.NIL == done_var_$30) {
                                        final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$31);
                                        final SubLObject valid_$32 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$31.eql(as2));
                                        if (rbp_wff.NIL != valid_$32) {
                                            final SubLObject item_var2 = assertions_high.gaf_arg2(as2);
                                            if (rbp_wff.NIL == conses_high.member(item_var2, constraint_cols, Symbols.symbol_function((SubLObject)rbp_wff.EQL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                                                constraint_cols = (SubLObject)ConsesLow.cons(item_var2, constraint_cols);
                                            }
                                        }
                                        done_var_$30 = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid_$32);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rbp_wff.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (rbp_wff.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid2);
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (rbp_wff.NIL != rbp_binary_relationP(reln)) {
            final SubLObject ind_argnum = Numbers.subtract((SubLObject)rbp_wff.THREE_INTEGER, argnum);
            final SubLObject ind_arg = cycl_utilities.formula_arg(formula, ind_argnum, (SubLObject)rbp_wff.UNPROVIDED);
            final SubLObject mt_to_check = rbp_wff_info_lookup_mt((SubLObject)ConsesLow.list(ind_arg, reln));
            final SubLObject pairs = rbp_iani_pairs(reln, ind_argnum, mt_to_check);
            SubLObject appliesP = (SubLObject)rbp_wff.NIL;
            SubLObject cdolist_list_var2 = pairs;
            SubLObject pair = (SubLObject)rbp_wff.NIL;
            pair = cdolist_list_var2.first();
            while (rbp_wff.NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject ind_col = (SubLObject)rbp_wff.NIL;
                SubLObject dep_col = (SubLObject)rbp_wff.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list110);
                ind_col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_wff.$list110);
                dep_col = current.first();
                current = current.rest();
                if (rbp_wff.NIL == current) {
                    final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(mt_to_check);
                    final SubLObject _prev_bind_6 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                        if (rbp_wff.NIL != subl_promotions.memberP(cycl_utilities.formula_arg(template, ind_argnum, (SubLObject)rbp_wff.UNPROVIDED), type_level_args, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)) {
                            appliesP = npp_genlP(ind_arg, ind_col, (SubLObject)rbp_wff.UNPROVIDED);
                        }
                        else {
                            appliesP = rbp_wff_isaP(ind_arg, ind_col, (SubLObject)rbp_wff.UNPROVIDED);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_8, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_7, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_6, thread);
                    }
                    if (rbp_wff.NIL != appliesP) {
                        final SubLObject item_var3 = dep_col;
                        if (rbp_wff.NIL == conses_high.member(item_var3, constraint_cols, Symbols.symbol_function((SubLObject)rbp_wff.EQUAL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                            constraint_cols = (SubLObject)ConsesLow.cons(item_var3, constraint_cols);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rbp_wff.$list110);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                pair = cdolist_list_var2.first();
            }
        }
        if (rbp_wff.NIL == constraint_cols) {
            return Values.values((SubLObject)rbp_wff.NIL, (SubLObject)rbp_wff.NIL);
        }
        SubLObject constraint_check_mt = rbp_wff_info_lookup_mt(formula);
        if (constraint_check_mt.eql(rbp_wff.$const50$InferencePSC)) {
            constraint_check_mt = rbp_wff.$const109$BaseKB;
        }
        return Values.values(constraint_cols, constraint_check_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 41093L)
    public static SubLObject rbp_binary_relationP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != fort_types_interface.relation_p(obj) && arity.arity(obj).eql((SubLObject)rbp_wff.TWO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 41351L)
    public static SubLObject rbp_iani_pairs(final SubLObject binary_reln, final SubLObject constrained_argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iani_pred = rbp_wff.$const148$interArgNotIsa1_2;
        SubLObject constraint_pairs = (SubLObject)rbp_wff.NIL;
        if (rbp_wff.NIL != kb_indexing_datastructures.indexed_term_p(iani_pred)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (rbp_wff.NIL != fort_types_interface.predicate_p(binary_reln)) {
                    final SubLObject module = sbhl_module_vars.get_sbhl_module(rbp_wff.$const132$genlPreds);
                    final SubLObject deck_type = (SubLObject)((rbp_wff.$kw133$BREADTH == rbp_wff.$kw134$DEPTH) ? rbp_wff.$kw135$STACK : rbp_wff.$kw136$QUEUE);
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject node_and_predicate_mode = (SubLObject)rbp_wff.NIL;
                    final SubLObject _prev_bind_0_$45 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)rbp_wff.NIL;
                            final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((rbp_wff.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((rbp_wff.NIL != tv_var) ? rbp_wff.$sym137$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (rbp_wff.NIL != tv_var && rbp_wff.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && rbp_wff.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)rbp_wff.$kw138$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.$str139$_A_is_not_a__A, tv_var, (SubLObject)rbp_wff.$sym140$SBHL_TRUE_TV_P, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)rbp_wff.$kw141$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.$str142$continue_anyway, (SubLObject)rbp_wff.$str139$_A_is_not_a__A, tv_var, (SubLObject)rbp_wff.$sym140$SBHL_TRUE_TV_P, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)rbp_wff.$kw143$WARN)) {
                                        Errors.warn((SubLObject)rbp_wff.$str139$_A_is_not_a__A, tv_var, (SubLObject)rbp_wff.$sym140$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)rbp_wff.$str144$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)rbp_wff.$str142$continue_anyway, (SubLObject)rbp_wff.$str139$_A_is_not_a__A, tv_var, (SubLObject)rbp_wff.$sym140$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$47 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$48 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$50 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rbp_wff.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                    if (rbp_wff.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || rbp_wff.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(binary_reln, sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$48 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$49 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$51 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rbp_wff.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(binary_reln, (SubLObject)rbp_wff.UNPROVIDED);
                                            for (node_and_predicate_mode = (SubLObject)ConsesLow.list(binary_reln, sbhl_search_vars.genl_inverse_mode_p()); rbp_wff.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                final SubLObject node_var_$54 = node_and_predicate_mode.first();
                                                final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                                final SubLObject genl_pred = node_var_$54;
                                                final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    final SubLObject inverseP = predicate_mode;
                                                    final SubLObject pred_var = iani_pred;
                                                    if (rbp_wff.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl_pred, (SubLObject)rbp_wff.ONE_INTEGER, pred_var)) {
                                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl_pred, (SubLObject)rbp_wff.ONE_INTEGER, pred_var);
                                                        SubLObject done_var = (SubLObject)rbp_wff.NIL;
                                                        final SubLObject token_var = (SubLObject)rbp_wff.NIL;
                                                        while (rbp_wff.NIL == done_var) {
                                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                            if (rbp_wff.NIL != valid) {
                                                                SubLObject final_index_iterator = (SubLObject)rbp_wff.NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rbp_wff.$kw52$GAF, (SubLObject)rbp_wff.$kw53$TRUE, (SubLObject)rbp_wff.NIL);
                                                                    SubLObject done_var_$56 = (SubLObject)rbp_wff.NIL;
                                                                    final SubLObject token_var_$57 = (SubLObject)rbp_wff.NIL;
                                                                    while (rbp_wff.NIL == done_var_$56) {
                                                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$57);
                                                                        final SubLObject valid_$58 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$57.eql(as));
                                                                        if (rbp_wff.NIL != valid_$58) {
                                                                            final SubLObject pair = rbp_iani_pair(as, constrained_argnum, inverseP);
                                                                            if (rbp_wff.NIL != rbp_iani_pair_ok_for_bin_predP(pair, binary_reln)) {
                                                                                final SubLObject item_var = pair;
                                                                                if (rbp_wff.NIL == conses_high.member(item_var, constraint_pairs, Symbols.symbol_function((SubLObject)rbp_wff.EQUAL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                                                                                    constraint_pairs = (SubLObject)ConsesLow.cons(item_var, constraint_pairs);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var_$56 = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid_$58);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rbp_wff.T, thread);
                                                                        final SubLObject _values = Values.getValuesAsVector();
                                                                        if (rbp_wff.NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                        Values.restoreValuesFromVector(_values);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                                                    }
                                                                }
                                                            }
                                                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid);
                                                        }
                                                    }
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                                    SubLObject module_var = (SubLObject)rbp_wff.NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (rbp_wff.NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$51 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((rbp_wff.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(rbp_wff.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(node_var_$54);
                                                            if (rbp_wff.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED));
                                                                if (rbp_wff.NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED));
                                                                    if (rbp_wff.NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); rbp_wff.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt_$62 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (rbp_wff.NIL != mt_relevance_macros.relevant_mtP(mt_$62)) {
                                                                                final SubLObject _prev_bind_0_$52 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$62, thread);
                                                                                    SubLObject iteration_state_$64;
                                                                                    for (iteration_state_$64 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); rbp_wff.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$64); iteration_state_$64 = dictionary_contents.do_dictionary_contents_next(iteration_state_$64)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$64);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (rbp_wff.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (rbp_wff.NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rbp_wff.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rbp_wff.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (rbp_wff.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && rbp_wff.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)rbp_wff.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)rbp_wff.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = (SubLObject)rbp_wff.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (rbp_wff.NIL != csome_list_var) {
                                                                                                        if (rbp_wff.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)rbp_wff.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)rbp_wff.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)rbp_wff.$str145$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$53, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$64);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$52, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)rbp_wff.FIVE_INTEGER, (SubLObject)rbp_wff.$str146$attempting_to_bind_direction_link, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (rbp_wff.NIL != obsolete.cnat_p(node, (SubLObject)rbp_wff.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$66;
                                                                final SubLObject new_list = cdolist_list_var_$66 = ((rbp_wff.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED)));
                                                                SubLObject generating_fn = (SubLObject)rbp_wff.NIL;
                                                                generating_fn = cdolist_list_var_$66.first();
                                                                while (rbp_wff.NIL != cdolist_list_var_$66) {
                                                                    final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                        if (rbp_wff.NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)rbp_wff.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); rbp_wff.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (rbp_wff.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && rbp_wff.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)rbp_wff.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)rbp_wff.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = (SubLObject)rbp_wff.NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (rbp_wff.NIL != csome_list_var2) {
                                                                                if (rbp_wff.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)rbp_wff.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)rbp_wff.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)rbp_wff.$str145$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$54, thread);
                                                                    }
                                                                    cdolist_list_var_$66 = cdolist_list_var_$66.rest();
                                                                    generating_fn = cdolist_list_var_$66.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$50, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$51, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$49, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$51, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$49, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$48, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)rbp_wff.TWO_INTEGER, (SubLObject)rbp_wff.$str147$Node__a_does_not_pass_sbhl_type_t, binary_reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)rbp_wff.UNPROVIDED)), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$50, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$48, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$47, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$47, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$46, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rbp_wff.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$45, thread);
                    }
                }
                else {
                    final SubLObject pred_var2 = iani_pred;
                    if (rbp_wff.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(binary_reln, (SubLObject)rbp_wff.ONE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(binary_reln, (SubLObject)rbp_wff.ONE_INTEGER, pred_var2);
                        SubLObject done_var2 = (SubLObject)rbp_wff.NIL;
                        final SubLObject token_var2 = (SubLObject)rbp_wff.NIL;
                        while (rbp_wff.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (rbp_wff.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)rbp_wff.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)rbp_wff.$kw52$GAF, (SubLObject)rbp_wff.$kw53$TRUE, (SubLObject)rbp_wff.NIL);
                                    SubLObject done_var_$57 = (SubLObject)rbp_wff.NIL;
                                    final SubLObject token_var_$58 = (SubLObject)rbp_wff.NIL;
                                    while (rbp_wff.NIL == done_var_$57) {
                                        final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$58);
                                        final SubLObject valid_$59 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$58.eql(as2));
                                        if (rbp_wff.NIL != valid_$59) {
                                            final SubLObject pair2 = rbp_iani_pair(as2, constrained_argnum, (SubLObject)rbp_wff.NIL);
                                            if (rbp_wff.NIL != rbp_iani_pair_ok_for_bin_predP(pair2, binary_reln)) {
                                                final SubLObject item_var2 = pair2;
                                                if (rbp_wff.NIL == conses_high.member(item_var2, constraint_pairs, Symbols.symbol_function((SubLObject)rbp_wff.EQUAL), Symbols.symbol_function((SubLObject)rbp_wff.IDENTITY))) {
                                                    constraint_pairs = (SubLObject)ConsesLow.cons(item_var2, constraint_pairs);
                                                }
                                            }
                                        }
                                        done_var_$57 = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid_$59);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rbp_wff.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (rbp_wff.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == valid2);
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return constraint_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 42527L)
    public static SubLObject rbp_iani_pair(final SubLObject as, final SubLObject constrained_argnum, final SubLObject inverseP) {
        SubLObject pair = (SubLObject)ConsesLow.list(assertions_high.gaf_arg2(as), assertions_high.gaf_arg3(as));
        if (constrained_argnum.eql((SubLObject)rbp_wff.TWO_INTEGER)) {
            pair = Sequences.nreverse(pair);
        }
        if (rbp_wff.NIL != inverseP) {
            pair = Sequences.nreverse(pair);
        }
        return pair;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 42778L)
    public static SubLObject rbp_iani_pair_ok_for_bin_predP(final SubLObject pair, final SubLObject binary_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1_type = (SubLObject)rbp_wff.NIL;
        SubLObject arg2_type = (SubLObject)rbp_wff.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pair, pair, (SubLObject)rbp_wff.$list149);
        arg1_type = pair.first();
        SubLObject current = pair.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pair, (SubLObject)rbp_wff.$list149);
        arg2_type = current.first();
        current = current.rest();
        if (rbp_wff.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == rbp_wff.$rbp_validate_iani_pairsP$.getDynamicValue(thread) || (rbp_wff.NIL != rbp_instances_admitted_for_arg_of_predP(arg1_type, (SubLObject)rbp_wff.ONE_INTEGER, binary_pred) && rbp_wff.NIL != rbp_instances_admitted_for_arg_of_predP(arg2_type, (SubLObject)rbp_wff.TWO_INTEGER, binary_pred)));
        }
        cdestructuring_bind.cdestructuring_bind_error(pair, (SubLObject)rbp_wff.$list149);
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 43093L)
    public static SubLObject rbp_instances_admitted_for_arg_of_predP(final SubLObject v_arg_type, final SubLObject arg_num, final SubLObject binary_pred) {
        SubLObject badP = (SubLObject)rbp_wff.NIL;
        if (rbp_wff.NIL == badP) {
            SubLObject csome_list_var = kb_accessors.argn_isa(binary_pred, arg_num, (SubLObject)rbp_wff.UNPROVIDED);
            SubLObject arg_isa = (SubLObject)rbp_wff.NIL;
            arg_isa = csome_list_var.first();
            while (rbp_wff.NIL == badP && rbp_wff.NIL != csome_list_var) {
                if (rbp_wff.NIL == npp_not_disjointP(v_arg_type, arg_isa, (SubLObject)rbp_wff.UNPROVIDED)) {
                    badP = (SubLObject)rbp_wff.T;
                }
                csome_list_var = csome_list_var.rest();
                arg_isa = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 43444L)
    public static SubLObject rbp_wff_type_level_args(final SubLObject nat) {
        final SubLObject fn = cycl_utilities.nat_functor(nat);
        SubLObject ans = (SubLObject)rbp_wff.NIL;
        SubLObject cdolist_list_var = rbp_wff_type_level_arg_nums_for_fn(fn);
        SubLObject arg_num = (SubLObject)rbp_wff.NIL;
        arg_num = cdolist_list_var.first();
        while (rbp_wff.NIL != cdolist_list_var) {
            ans = (SubLObject)ConsesLow.cons(cycl_utilities.nat_arg(nat, arg_num, (SubLObject)rbp_wff.UNPROVIDED), ans);
            cdolist_list_var = cdolist_list_var.rest();
            arg_num = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 43656L)
    public static SubLObject clear_rbp_wff_type_level_arg_nums_for_fn() {
        final SubLObject cs = rbp_wff.$rbp_wff_type_level_arg_nums_for_fn_caching_state$.getGlobalValue();
        if (rbp_wff.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 43656L)
    public static SubLObject remove_rbp_wff_type_level_arg_nums_for_fn(final SubLObject fn) {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_wff.$rbp_wff_type_level_arg_nums_for_fn_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(fn), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 43656L)
    public static SubLObject rbp_wff_type_level_arg_nums_for_fn_internal(final SubLObject fn) {
        SubLObject ans = (SubLObject)rbp_wff.NIL;
        final SubLObject v_arity = arity.arity(fn);
        if (v_arity.isInteger()) {
            SubLObject i;
            SubLObject arg_num;
            for (i = (SubLObject)rbp_wff.NIL, i = (SubLObject)rbp_wff.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)rbp_wff.ONE_INTEGER)) {
                arg_num = number_utilities.f_1X(i);
                if (rbp_wff.NIL != Sequences.find(rbp_wff.$const56$Collection, kb_accessors.argn_isa(fn, arg_num, (SubLObject)rbp_wff.UNPROVIDED), (SubLObject)rbp_wff.$sym151$SPEC_, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)) {
                    ans = (SubLObject)ConsesLow.cons(arg_num, ans);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 43656L)
    public static SubLObject rbp_wff_type_level_arg_nums_for_fn(final SubLObject fn) {
        SubLObject caching_state = rbp_wff.$rbp_wff_type_level_arg_nums_for_fn_caching_state$.getGlobalValue();
        if (rbp_wff.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_wff.$sym150$RBP_WFF_TYPE_LEVEL_ARG_NUMS_FOR_FN, (SubLObject)rbp_wff.$sym152$_RBP_WFF_TYPE_LEVEL_ARG_NUMS_FOR_FN_CACHING_STATE_, (SubLObject)rbp_wff.$int21$256, (SubLObject)rbp_wff.EQL, (SubLObject)rbp_wff.ONE_INTEGER, (SubLObject)rbp_wff.$int153$128);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fn, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_wff_type_level_arg_nums_for_fn_internal(fn)));
            memoization_state.caching_state_put(caching_state, fn, results, (SubLObject)rbp_wff.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 43970L)
    public static SubLObject rbp_wff_embedded_pred(final SubLObject formula) {
        if (rbp_wff.NIL == el_utilities.el_formula_p(formula)) {
            return (SubLObject)rbp_wff.NIL;
        }
        final SubLObject operator = cycl_utilities.formula_operator(formula);
        if (rbp_wff.NIL == forts.fort_p(operator)) {
            return (SubLObject)rbp_wff.NIL;
        }
        if (operator.eql(rbp_wff.$const154$SubcollectionOfByFn)) {
            return rbp_wff.$const155$createdBy;
        }
        if (rbp_wff.NIL != rbp_wff_subcol_fnP(operator)) {
            return cycl_utilities.nat_arg2(formula, (SubLObject)rbp_wff.UNPROVIDED);
        }
        if (rbp_wff.NIL != rbp_wff_ternary_rmpP(operator)) {
            return cycl_utilities.formula_arg1(formula, (SubLObject)rbp_wff.UNPROVIDED);
        }
        if (rbp_wff.NIL != rbp_wff_quaternary_rmpP(operator)) {
            return cycl_utilities.formula_arg1(formula, (SubLObject)rbp_wff.UNPROVIDED);
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 44495L)
    public static SubLObject rbp_wff_ternary_rmpP(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_wff.NIL != forts.fort_p(fort) && rbp_wff.NIL != fort_types_interface.predicate_p(fort) && arity.arity(fort).eql((SubLObject)rbp_wff.THREE_INTEGER) && rbp_wff.NIL != isa.isa_anyP(fort, (SubLObject)rbp_wff.$list156, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 44781L)
    public static SubLObject rbp_wff_quaternary_rmpP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rbp_wff.$rbp_wff_quaternary_rmps$.getGlobalValue() == rbp_wff.$kw5$UNINITIALIZED) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rbp_wff.$sym38$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(rbp_wff.$const39$EverythingPSC, thread);
                rbp_wff.$rbp_wff_quaternary_rmps$.setGlobalValue(genl_predicates.all_genl_preds(rbp_wff.$const157$relationAllExistsCount, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED));
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return subl_promotions.memberP(fort, rbp_wff.$rbp_wff_quaternary_rmps$.getGlobalValue(), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 45094L)
    public static SubLObject rbp_wff_subcol_fnP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rbp_wff.$rbp_wff_subcol_fns$.getGlobalValue() == rbp_wff.$kw5$UNINITIALIZED) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rbp_wff.$sym38$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(rbp_wff.$const39$EverythingPSC, thread);
                rbp_wff.$rbp_wff_subcol_fns$.setGlobalValue(ConsesLow.append((SubLObject)rbp_wff.$list158, isa.all_fort_instances(rbp_wff.$const159$SubcollectionRelationFunction, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED)));
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return subl_promotions.memberP(fort, rbp_wff.$rbp_wff_subcol_fns$.getGlobalValue(), (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 45422L)
    public static SubLObject rbp_wff_embedded_args(final SubLObject formula) {
        if (rbp_wff.NIL != term.nautP(formula, (SubLObject)rbp_wff.UNPROVIDED)) {
            final SubLObject fn = cycl_utilities.nat_functor(formula);
            final SubLObject pcase_var = cycl_utilities.nat_arity(formula, (SubLObject)rbp_wff.UNPROVIDED);
            if (pcase_var.eql((SubLObject)rbp_wff.THREE_INTEGER)) {
                final SubLObject pcase_var_$73 = rbp_wff_fn_direction(fn);
                if (pcase_var_$73.eql((SubLObject)rbp_wff.$kw160$FROM)) {
                    return (SubLObject)ConsesLow.list(cycl_utilities.nat_arg3(formula, (SubLObject)rbp_wff.UNPROVIDED), cycl_utilities.nat_arg1(formula, (SubLObject)rbp_wff.UNPROVIDED));
                }
                if (pcase_var_$73.eql((SubLObject)rbp_wff.$kw161$TO)) {
                    return (SubLObject)ConsesLow.list(cycl_utilities.nat_arg1(formula, (SubLObject)rbp_wff.UNPROVIDED), cycl_utilities.nat_arg3(formula, (SubLObject)rbp_wff.UNPROVIDED));
                }
                if (pcase_var_$73.eql((SubLObject)rbp_wff.$kw138$ERROR)) {
                    return (SubLObject)rbp_wff.NIL;
                }
            }
            else if (pcase_var.eql((SubLObject)rbp_wff.TWO_INTEGER)) {
                return (SubLObject)ConsesLow.list(cycl_utilities.nat_arg1(formula, (SubLObject)rbp_wff.UNPROVIDED), cycl_utilities.nat_arg2(formula, (SubLObject)rbp_wff.UNPROVIDED));
            }
        }
        else if (rbp_wff.NIL != el_utilities.el_formula_p(formula) && rbp_wff.NIL != rbp_wff_ternary_rmpP(cycl_utilities.formula_arg0(formula))) {
            return (SubLObject)ConsesLow.list(cycl_utilities.formula_arg2(formula, (SubLObject)rbp_wff.UNPROVIDED), cycl_utilities.formula_arg3(formula, (SubLObject)rbp_wff.UNPROVIDED));
        }
        return (SubLObject)rbp_wff.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 45978L)
    public static SubLObject rbp_wff_fn_direction(final SubLObject fn) {
        if (rbp_wff.NIL != rbp_wff_isaP(fn, rbp_wff.$const162$SubcollectionRelationFunction_Can, (SubLObject)rbp_wff.UNPROVIDED)) {
            return (SubLObject)rbp_wff.$kw161$TO;
        }
        if (rbp_wff.NIL != rbp_wff_isaP(fn, rbp_wff.$const163$SubcollectionRelationFunction_Inv, (SubLObject)rbp_wff.UNPROVIDED)) {
            return (SubLObject)rbp_wff.$kw160$FROM;
        }
        if (fn.eql(rbp_wff.$const164$InstanceWithRelationFromFn)) {
            return (SubLObject)rbp_wff.$kw160$FROM;
        }
        if (fn.eql(rbp_wff.$const165$InstanceWithRelationToFn)) {
            return (SubLObject)rbp_wff.$kw161$TO;
        }
        return (SubLObject)rbp_wff.$kw138$ERROR;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 46412L)
    public static SubLObject rbp_subst_bindings(final SubLObject v_bindings, final SubLObject template) {
        SubLObject ans = rbp_template_with_arg_manipulation(v_bindings, template);
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)rbp_wff.NIL;
        binding = cdolist_list_var.first();
        while (rbp_wff.NIL != cdolist_list_var) {
            ans = conses_high.subst(binding.rest(), binding.first(), ans, (SubLObject)rbp_wff.UNPROVIDED, (SubLObject)rbp_wff.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 46776L)
    public static SubLObject rbp_template_predicate(final SubLObject template, SubLObject v_bindings) {
        if (v_bindings == rbp_wff.UNPROVIDED) {
            v_bindings = (SubLObject)rbp_wff.NIL;
        }
        SubLObject prelim_pred = (SubLObject)rbp_wff.NIL;
        SubLObject true_pred = (SubLObject)rbp_wff.NIL;
        if (rbp_wff.NIL != el_utilities.el_binary_formula_p(template)) {
            prelim_pred = cycl_utilities.formula_arg0(template);
        }
        else if (rbp_wff.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(template)) {
            prelim_pred = parsing_utilities.subcollection_function_naut_pred(template);
        }
        if (prelim_pred.isKeyword() && rbp_wff.NIL == true_pred) {
            SubLObject csome_list_var = v_bindings;
            SubLObject binding = (SubLObject)rbp_wff.NIL;
            binding = csome_list_var.first();
            while (rbp_wff.NIL == true_pred && rbp_wff.NIL != csome_list_var) {
                if (binding.first().eql(prelim_pred)) {
                    true_pred = binding.rest();
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            }
        }
        return (rbp_wff.NIL != true_pred) ? true_pred : prelim_pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 47428L)
    public static SubLObject rbp_template_with_arg_manipulation(final SubLObject v_bindings, final SubLObject template) {
        return rbp_template_with_strengthened_args(v_bindings, rbp_template_with_arg_substitution(v_bindings, template));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 47618L)
    public static SubLObject rbp_template_with_arg_substitution(final SubLObject v_bindings, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rbp_wff.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(template)) {
            final SubLObject the_pred = rbp_template_predicate(template, v_bindings);
            SubLObject ans = template;
            if (rbp_wff.NIL != fort_types_interface.predicateP(the_pred)) {
                final SubLObject from_arg = parsing_utilities.subcollection_function_naut_from_arg(ans);
                final SubLObject to_arg = parsing_utilities.subcollection_function_naut_to_arg(ans);
                SubLObject func = (SubLObject)rbp_wff.NIL;
                if (from_arg.eql(rbp_wff.$const166$TheNCArgIsas)) {
                    func = Symbols.symbol_function((SubLObject)rbp_wff.$sym167$MIN_ARGN_ISA);
                }
                else if (from_arg.eql(rbp_wff.$const168$TheNCArgGenls)) {
                    func = Symbols.symbol_function((SubLObject)rbp_wff.$sym169$MIN_ARGN_GENL);
                }
                if (rbp_wff.NIL != func) {
                    SubLObject new_col = (SubLObject)rbp_wff.NIL;
                    SubLObject cdolist_list_var = Functions.funcall(func, the_pred, (SubLObject)rbp_wff.ONE_INTEGER, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                    SubLObject col = (SubLObject)rbp_wff.NIL;
                    col = cdolist_list_var.first();
                    while (rbp_wff.NIL != cdolist_list_var) {
                        if (rbp_wff.NIL == new_col || rbp_wff.NIL != npp_genlP(col, new_col, (SubLObject)rbp_wff.UNPROVIDED)) {
                            new_col = col;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    }
                    ans = parsing_utilities.subcollection_function_naut_with_new_from_arg(ans, new_col);
                }
                if (to_arg.eql(rbp_wff.$const166$TheNCArgIsas)) {
                    func = Symbols.symbol_function((SubLObject)rbp_wff.$sym167$MIN_ARGN_ISA);
                }
                else if (to_arg.eql(rbp_wff.$const168$TheNCArgGenls)) {
                    func = Symbols.symbol_function((SubLObject)rbp_wff.$sym169$MIN_ARGN_GENL);
                }
                else {
                    func = (SubLObject)rbp_wff.NIL;
                }
                if (rbp_wff.NIL != func) {
                    SubLObject new_col = (SubLObject)rbp_wff.NIL;
                    SubLObject cdolist_list_var = Functions.funcall(func, the_pred, (SubLObject)rbp_wff.TWO_INTEGER, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                    SubLObject col = (SubLObject)rbp_wff.NIL;
                    col = cdolist_list_var.first();
                    while (rbp_wff.NIL != cdolist_list_var) {
                        if (rbp_wff.NIL == new_col || rbp_wff.NIL != npp_genlP(col, new_col, (SubLObject)rbp_wff.UNPROVIDED)) {
                            new_col = col;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    }
                    ans = parsing_utilities.subcollection_function_naut_with_new_to_arg(ans, new_col);
                }
            }
            return ans;
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-wff.lisp", position = 49309L)
    public static SubLObject rbp_template_with_strengthened_args(final SubLObject v_bindings, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rbp_wff.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(template)) {
            final SubLObject the_pred = rbp_template_predicate(template, v_bindings);
            SubLObject ans = template;
            if (rbp_wff.NIL != fort_types_interface.predicate_p(the_pred)) {
                SubLObject from_arg = parsing_utilities.subcollection_function_naut_from_arg(ans);
                SubLObject to_arg = parsing_utilities.subcollection_function_naut_to_arg(ans);
                if (rbp_wff.NIL != forts.fort_p(from_arg)) {
                    SubLObject cdolist_list_var = kb_accessors.min_argn_isa(the_pred, (SubLObject)rbp_wff.ONE_INTEGER, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                    SubLObject col = (SubLObject)rbp_wff.NIL;
                    col = cdolist_list_var.first();
                    while (rbp_wff.NIL != cdolist_list_var) {
                        if (rbp_wff.NIL != npp_genlP(col, from_arg, (SubLObject)rbp_wff.UNPROVIDED)) {
                            from_arg = col;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    }
                    ans = parsing_utilities.subcollection_function_naut_with_new_from_arg(ans, from_arg);
                }
                if (rbp_wff.NIL != forts.fort_p(to_arg)) {
                    SubLObject cdolist_list_var = kb_accessors.min_argn_isa(the_pred, (SubLObject)rbp_wff.TWO_INTEGER, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                    SubLObject col = (SubLObject)rbp_wff.NIL;
                    col = cdolist_list_var.first();
                    while (rbp_wff.NIL != cdolist_list_var) {
                        if (rbp_wff.NIL != npp_genlP(col, to_arg, (SubLObject)rbp_wff.UNPROVIDED)) {
                            to_arg = col;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    }
                    ans = parsing_utilities.subcollection_function_naut_with_new_to_arg(ans, to_arg);
                }
            }
            return ans;
        }
        return template;
    }
    
    public static SubLObject declare_rbp_wff_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_validation_reset", "RBP-WFF-VALIDATION-RESET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_validation_report", "RBP-WFF-VALIDATION-REPORT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_validating", "RBP-WFF-VALIDATING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "clear_rbp_wf_nat_externalP", "CLEAR-RBP-WF-NAT-EXTERNAL?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "remove_rbp_wf_nat_externalP", "REMOVE-RBP-WF-NAT-EXTERNAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wf_nat_externalP_internal", "RBP-WF-NAT-EXTERNAL?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wf_nat_externalP", "RBP-WF-NAT-EXTERNAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_check_formula_arg_position_replacements", "RBP-WFF-CHECK-FORMULA-ARG-POSITION-REPLACEMENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "clear_rbp_wf_template_argsP", "CLEAR-RBP-WF-TEMPLATE-ARGS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "remove_rbp_wf_template_argsP", "REMOVE-RBP-WF-TEMPLATE-ARGS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wf_template_argsP_internal", "RBP-WF-TEMPLATE-ARGS?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wf_template_argsP", "RBP-WF-TEMPLATE-ARGS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_bindings_visibleP", "RBP-WFF-BINDINGS-VISIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_term_visibleP", "RBP-WFF-TERM-VISIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_term_visible_by_fiatP", "RBP-WFF-TERM-VISIBLE-BY-FIAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_term_visible_check_requiredP", "RBP-WFF-TERM-VISIBLE-CHECK-REQUIRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_term_actually_visibleP", "RBP-WFF-TERM-ACTUALLY-VISIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_formula_variable_isa_constraints", "RBP-FORMULA-VARIABLE-ISA-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_reset_metrics", "RBP-WFF-RESET-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_report_metrics", "RBP-WFF-REPORT-METRICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_clear_caches", "RBP-WFF-CLEAR-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "clear_rbp_wf_natP", "CLEAR-RBP-WF-NAT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "remove_rbp_wf_natP", "REMOVE-RBP-WF-NAT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wf_natP_internal", "RBP-WF-NAT?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wf_natP", "RBP-WF-NAT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_genl_predP", "NPP-GENL-PRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_search_gafs_gp", "NPP-SEARCH-GAFS-GP", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_typed_genl_predP", "NPP-TYPED-GENL-PRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_maybe_genlP", "RBP-WFF-MAYBE-GENL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_type_genlP", "NPP-TYPE-GENL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_not_genlP", "NPP-NOT-GENL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_genlP", "NPP-GENL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_genl_or_anyP", "NPP-GENL-OR-ANY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_genl_via_sbhlP", "NPP-GENL-VIA-SBHL?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_naut_genl_via_result_genlP", "NPP-NAUT-GENL-VIA-RESULT-GENL?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_naut_genl_via_rgaP", "NPP-NAUT-GENL-VIA-RGA?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_naut_genl_via_pgiaP", "NPP-NAUT-GENL-VIA-PGIA?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_not_isaP", "RBP-WFF-NOT-ISA?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_maybe_isaP", "RBP-WFF-MAYBE-ISA?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_isaP", "RBP-WFF-ISA?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_isaP_int", "RBP-WFF-ISA?-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_not_type_disjointP", "NPP-NOT-TYPE-DISJOINT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_do_ntdP", "NPP-DO-NTD?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_not_disjointP", "NPP-NOT-DISJOINT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_find_floor_mts", "RBP-WFF-FIND-FLOOR-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "clear_rbp_wff_find_floor_mts_int", "CLEAR-RBP-WFF-FIND-FLOOR-MTS-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "remove_rbp_wff_find_floor_mts_int", "REMOVE-RBP-WFF-FIND-FLOOR-MTS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_find_floor_mts_int_internal", "RBP-WFF-FIND-FLOOR-MTS-INT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_find_floor_mts_int", "RBP-WFF-FIND-FLOOR-MTS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "remove_visible_mts", "REMOVE-VISIBLE-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "mt_visible_from_mtP", "MT-VISIBLE-FROM-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_isaP", "NPP-ISA?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_isa_or_anyP", "NPP-ISA-OR-ANY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_el_sentence_assertibleP", "RBP-WFF-EL-SENTENCE-ASSERTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_individualP", "NPP-INDIVIDUAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "npp_collectionP", "NPP-COLLECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_relation_all_violationP", "RBP-RELATION-ALL-VIOLATION?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_relation_all_matchP", "RBP-RELATION-ALL-MATCH?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_defining_mt", "RBP-DEFINING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "clear_rbp_defining_mts", "CLEAR-RBP-DEFINING-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "remove_rbp_defining_mts", "REMOVE-RBP-DEFINING-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_defining_mts_internal", "RBP-DEFINING-MTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_defining_mts", "RBP-DEFINING-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_defining_assertions", "RBP-DEFINING-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_theory_mts", "RBP-THEORY-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_vocabulary_mts", "RBP-VOCABULARY-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_vocabulary_mtP", "RBP-VOCABULARY-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_test_failsP", "RBP-WFF-TEST-FAILS?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "clear_rbp_wff_test_fails_intP", "CLEAR-RBP-WFF-TEST-FAILS-INT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "remove_rbp_wff_test_fails_intP", "REMOVE-RBP-WFF-TEST-FAILS-INT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_test_fails_intP_internal", "RBP-WFF-TEST-FAILS-INT?-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_test_fails_intP", "RBP-WFF-TEST-FAILS-INT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_contains_strippable_nl_tagP", "RBP-WFF-CONTAINS-STRIPPABLE-NL-TAG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_convert_nat", "RBP-WFF-CONVERT-NAT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_constraints_primary", "RBP-WFF-CONSTRAINTS-PRIMARY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "clear_rbp_wff_constraints_prim_int_cached", "CLEAR-RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "remove_rbp_wff_constraints_prim_int_cached", "REMOVE-RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_constraints_prim_int_cached_internal", "RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_constraints_prim_int_cached", "RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_isa_constraint_cols", "RBP-ISA-CONSTRAINT-COLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_genl_constraint_cols", "RBP-GENL-CONSTRAINT-COLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_constraints_for_parsed_preds", "RBP-CONSTRAINTS-FOR-PARSED-PREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_instantiate_types", "RBP-WFF-INSTANTIATE-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_constraints_secondary", "RBP-WFF-CONSTRAINTS-SECONDARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_constraints_from_csf", "RBP-WFF-CONSTRAINTS-FROM-CSF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_iand_constraints", "RBP-IAND-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_iand_constraints_from_genls_format", "RBP-IAND-CONSTRAINTS-FROM-GENLS-FORMAT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_info_lookup_mt", "RBP-WFF-INFO-LOOKUP-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_domain_mt_setP", "RBP-WFF-DOMAIN-MT-SET?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_domain_mt", "RBP-WFF-DOMAIN-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_reln_ok_for_genls_formatP", "RBP-RELN-OK-FOR-GENLS-FORMAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_iand_cols_for_reln_from_genls_format", "RBP-IAND-COLS-FOR-RELN-FROM-GENLS-FORMAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_iai_constraints", "RBP-IAI-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_get_iai_constraints", "RBP-GET-IAI-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "clear_rbp_get_iai_pred", "CLEAR-RBP-GET-IAI-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "remove_rbp_get_iai_pred", "REMOVE-RBP-GET-IAI-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_get_iai_pred_internal", "RBP-GET-IAI-PRED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_get_iai_pred", "RBP-GET-IAI-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "clear_rbp_get_ani_pred", "CLEAR-RBP-GET-ANI-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "remove_rbp_get_ani_pred", "REMOVE-RBP-GET-ANI-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_get_ani_pred_internal", "RBP-GET-ANI-PRED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_get_ani_pred", "RBP-GET-ANI-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_not_isa_constraints", "RBP-NOT-ISA-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_binary_relationP", "RBP-BINARY-RELATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_iani_pairs", "RBP-IANI-PAIRS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_iani_pair", "RBP-IANI-PAIR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_iani_pair_ok_for_bin_predP", "RBP-IANI-PAIR-OK-FOR-BIN-PRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_instances_admitted_for_arg_of_predP", "RBP-INSTANCES-ADMITTED-FOR-ARG-OF-PRED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_type_level_args", "RBP-WFF-TYPE-LEVEL-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "clear_rbp_wff_type_level_arg_nums_for_fn", "CLEAR-RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "remove_rbp_wff_type_level_arg_nums_for_fn", "REMOVE-RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_type_level_arg_nums_for_fn_internal", "RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_type_level_arg_nums_for_fn", "RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_embedded_pred", "RBP-WFF-EMBEDDED-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_ternary_rmpP", "RBP-WFF-TERNARY-RMP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_quaternary_rmpP", "RBP-WFF-QUATERNARY-RMP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_subcol_fnP", "RBP-WFF-SUBCOL-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_embedded_args", "RBP-WFF-EMBEDDED-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_wff_fn_direction", "RBP-WFF-FN-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_subst_bindings", "RBP-SUBST-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_template_predicate", "RBP-TEMPLATE-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_template_with_arg_manipulation", "RBP-TEMPLATE-WITH-ARG-MANIPULATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_template_with_arg_substitution", "RBP-TEMPLATE-WITH-ARG-SUBSTITUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_wff", "rbp_template_with_strengthened_args", "RBP-TEMPLATE-WITH-STRENGTHENED-ARGS", 2, 0, false);
        return (SubLObject)rbp_wff.NIL;
    }
    
    public static SubLObject init_rbp_wff_file() {
        rbp_wff.$rbp_wff_check_time$ = SubLFiles.defparameter("*RBP-WFF-CHECK-TIME*", (SubLObject)rbp_wff.ZERO_INTEGER);
        rbp_wff.$rbp_wff_checks_total$ = SubLFiles.defparameter("*RBP-WFF-CHECKS-TOTAL*", (SubLObject)rbp_wff.ZERO_INTEGER);
        rbp_wff.$rbp_wff_checks_failed$ = SubLFiles.defparameter("*RBP-WFF-CHECKS-FAILED*", (SubLObject)rbp_wff.ZERO_INTEGER);
        rbp_wff.$rbp_show_non_wffP$ = SubLFiles.defparameter("*RBP-SHOW-NON-WFF?*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_wff_validation_count$ = SubLFiles.deflexical("*RBP-WFF-VALIDATION-COUNT*", (SubLObject)(maybeDefault((SubLObject)rbp_wff.$sym0$_RBP_WFF_VALIDATION_COUNT_, rbp_wff.$rbp_wff_validation_count$, rbp_wff.ZERO_INTEGER)));
        rbp_wff.$rbp_wff_validation_false_pos$ = SubLFiles.deflexical("*RBP-WFF-VALIDATION-FALSE-POS*", (SubLObject)(maybeDefault((SubLObject)rbp_wff.$sym1$_RBP_WFF_VALIDATION_FALSE_POS_, rbp_wff.$rbp_wff_validation_false_pos$, rbp_wff.NIL)));
        rbp_wff.$rbp_wff_validation_false_neg$ = SubLFiles.deflexical("*RBP-WFF-VALIDATION-FALSE-NEG*", (SubLObject)(maybeDefault((SubLObject)rbp_wff.$sym2$_RBP_WFF_VALIDATION_FALSE_NEG_, rbp_wff.$rbp_wff_validation_false_neg$, rbp_wff.NIL)));
        rbp_wff.$rbp_wff_validate_setting$ = SubLFiles.deflexical("*RBP-WFF-VALIDATE-SETTING*", (SubLObject)(maybeDefault((SubLObject)rbp_wff.$sym3$_RBP_WFF_VALIDATE_SETTING_, rbp_wff.$rbp_wff_validate_setting$, rbp_wff.NIL)));
        rbp_wff.$rbp_vocabulary_mts$ = SubLFiles.deflexical("*RBP-VOCABULARY-MTS*", (SubLObject)(maybeDefault((SubLObject)rbp_wff.$sym4$_RBP_VOCABULARY_MTS_, rbp_wff.$rbp_vocabulary_mts$, rbp_wff.$kw5$UNINITIALIZED)));
        rbp_wff.$rbp_wff_quaternary_rmps$ = SubLFiles.deflexical("*RBP-WFF-QUATERNARY-RMPS*", (SubLObject)(maybeDefault((SubLObject)rbp_wff.$sym6$_RBP_WFF_QUATERNARY_RMPS_, rbp_wff.$rbp_wff_quaternary_rmps$, rbp_wff.$kw5$UNINITIALIZED)));
        rbp_wff.$rbp_wf_nat_externalP_caching_state$ = SubLFiles.deflexical("*RBP-WF-NAT-EXTERNAL?-CACHING-STATE*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_wf_template_argsP_caching_state$ = SubLFiles.deflexical("*RBP-WF-TEMPLATE-ARGS?-CACHING-STATE*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_wff_check_visibilityP$ = SubLFiles.defparameter("*RBP-WFF-CHECK-VISIBILITY?*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_wf_natP_caching_state$ = SubLFiles.deflexical("*RBP-WF-NAT?-CACHING-STATE*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_wff_find_floor_mts_int_caching_state$ = SubLFiles.deflexical("*RBP-WFF-FIND-FLOOR-MTS-INT-CACHING-STATE*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_defining_mts_caching_state$ = SubLFiles.deflexical("*RBP-DEFINING-MTS-CACHING-STATE*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_wff_test_fails_intP_caching_state$ = SubLFiles.deflexical("*RBP-WFF-TEST-FAILS-INT?-CACHING-STATE*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_wff_constraints_prim_int_cached_caching_state$ = SubLFiles.deflexical("*RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED-CACHING-STATE*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_known_false_equals_non_wffP$ = SubLFiles.defparameter("*RBP-KNOWN-FALSE-EQUALS-NON-WFF?*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$inter_arg_isa_predicate_mt$ = SubLFiles.deflexical("*INTER-ARG-ISA-PREDICATE-MT*", maybeDefault((SubLObject)rbp_wff.$sym117$_INTER_ARG_ISA_PREDICATE_MT_, rbp_wff.$inter_arg_isa_predicate_mt$, rbp_wff.$const109$BaseKB));
        rbp_wff.$arg_not_isa_predicate_mt$ = SubLFiles.deflexical("*ARG-NOT-ISA-PREDICATE-MT*", maybeDefault((SubLObject)rbp_wff.$sym119$_ARG_NOT_ISA_PREDICATE_MT_, rbp_wff.$arg_not_isa_predicate_mt$, rbp_wff.$const109$BaseKB));
        rbp_wff.$rbp_get_iai_pred_caching_state$ = SubLFiles.deflexical("*RBP-GET-IAI-PRED-CACHING-STATE*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_get_ani_pred_caching_state$ = SubLFiles.deflexical("*RBP-GET-ANI-PRED-CACHING-STATE*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_validate_iani_pairsP$ = SubLFiles.defparameter("*RBP-VALIDATE-IANI-PAIRS?*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_wff_type_level_arg_nums_for_fn_caching_state$ = SubLFiles.deflexical("*RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN-CACHING-STATE*", (SubLObject)rbp_wff.NIL);
        rbp_wff.$rbp_wff_subcol_fns$ = SubLFiles.deflexical("*RBP-WFF-SUBCOL-FNS*", (SubLObject)rbp_wff.$kw5$UNINITIALIZED);
        return (SubLObject)rbp_wff.NIL;
    }
    
    public static SubLObject setup_rbp_wff_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)rbp_wff.$sym0$_RBP_WFF_VALIDATION_COUNT_);
        subl_macro_promotions.declare_defglobal((SubLObject)rbp_wff.$sym1$_RBP_WFF_VALIDATION_FALSE_POS_);
        subl_macro_promotions.declare_defglobal((SubLObject)rbp_wff.$sym2$_RBP_WFF_VALIDATION_FALSE_NEG_);
        subl_macro_promotions.declare_defglobal((SubLObject)rbp_wff.$sym3$_RBP_WFF_VALIDATE_SETTING_);
        subl_macro_promotions.declare_defglobal((SubLObject)rbp_wff.$sym4$_RBP_VOCABULARY_MTS_);
        subl_macro_promotions.declare_defglobal((SubLObject)rbp_wff.$sym6$_RBP_WFF_QUATERNARY_RMPS_);
        memoization_state.note_globally_cached_function((SubLObject)rbp_wff.$sym19$RBP_WF_NAT_EXTERNAL_);
        memoization_state.note_globally_cached_function((SubLObject)rbp_wff.$sym23$RBP_WF_TEMPLATE_ARGS_);
        memoization_state.note_globally_cached_function((SubLObject)rbp_wff.$sym48$RBP_WF_NAT_);
        memoization_state.note_globally_cached_function((SubLObject)rbp_wff.$sym69$RBP_WFF_FIND_FLOOR_MTS_INT);
        memoization_state.note_globally_cached_function((SubLObject)rbp_wff.$sym84$RBP_DEFINING_MTS);
        memoization_state.note_globally_cached_function((SubLObject)rbp_wff.$sym93$RBP_WFF_TEST_FAILS_INT_);
        memoization_state.note_globally_cached_function((SubLObject)rbp_wff.$sym98$RBP_WFF_CONSTRAINTS_PRIM_INT_CACHED);
        subl_macro_promotions.declare_defglobal((SubLObject)rbp_wff.$sym117$_INTER_ARG_ISA_PREDICATE_MT_);
        mt_vars.note_mt_var((SubLObject)rbp_wff.$sym117$_INTER_ARG_ISA_PREDICATE_MT_, rbp_wff.$const118$InterArgIsaPredicate);
        subl_macro_promotions.declare_defglobal((SubLObject)rbp_wff.$sym119$_ARG_NOT_ISA_PREDICATE_MT_);
        mt_vars.note_mt_var((SubLObject)rbp_wff.$sym119$_ARG_NOT_ISA_PREDICATE_MT_, rbp_wff.$const120$ArgNotIsaPredicate);
        memoization_state.note_globally_cached_function((SubLObject)rbp_wff.$sym121$RBP_GET_IAI_PRED);
        memoization_state.note_globally_cached_function((SubLObject)rbp_wff.$sym127$RBP_GET_ANI_PRED);
        memoization_state.note_globally_cached_function((SubLObject)rbp_wff.$sym150$RBP_WFF_TYPE_LEVEL_ARG_NUMS_FOR_FN);
        return (SubLObject)rbp_wff.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rbp_wff_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rbp_wff_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rbp_wff_file();
    }
    
    static {
        me = (SubLFile)new rbp_wff();
        rbp_wff.$rbp_wff_check_time$ = null;
        rbp_wff.$rbp_wff_checks_total$ = null;
        rbp_wff.$rbp_wff_checks_failed$ = null;
        rbp_wff.$rbp_show_non_wffP$ = null;
        rbp_wff.$rbp_wff_validation_count$ = null;
        rbp_wff.$rbp_wff_validation_false_pos$ = null;
        rbp_wff.$rbp_wff_validation_false_neg$ = null;
        rbp_wff.$rbp_wff_validate_setting$ = null;
        rbp_wff.$rbp_vocabulary_mts$ = null;
        rbp_wff.$rbp_wff_quaternary_rmps$ = null;
        rbp_wff.$rbp_wf_nat_externalP_caching_state$ = null;
        rbp_wff.$rbp_wf_template_argsP_caching_state$ = null;
        rbp_wff.$rbp_wff_check_visibilityP$ = null;
        rbp_wff.$rbp_wf_natP_caching_state$ = null;
        rbp_wff.$rbp_wff_find_floor_mts_int_caching_state$ = null;
        rbp_wff.$rbp_defining_mts_caching_state$ = null;
        rbp_wff.$rbp_wff_test_fails_intP_caching_state$ = null;
        rbp_wff.$rbp_wff_constraints_prim_int_cached_caching_state$ = null;
        rbp_wff.$rbp_known_false_equals_non_wffP$ = null;
        rbp_wff.$inter_arg_isa_predicate_mt$ = null;
        rbp_wff.$arg_not_isa_predicate_mt$ = null;
        rbp_wff.$rbp_get_iai_pred_caching_state$ = null;
        rbp_wff.$rbp_get_ani_pred_caching_state$ = null;
        rbp_wff.$rbp_validate_iani_pairsP$ = null;
        rbp_wff.$rbp_wff_type_level_arg_nums_for_fn_caching_state$ = null;
        rbp_wff.$rbp_wff_subcol_fns$ = null;
        $sym0$_RBP_WFF_VALIDATION_COUNT_ = SubLObjectFactory.makeSymbol("*RBP-WFF-VALIDATION-COUNT*");
        $sym1$_RBP_WFF_VALIDATION_FALSE_POS_ = SubLObjectFactory.makeSymbol("*RBP-WFF-VALIDATION-FALSE-POS*");
        $sym2$_RBP_WFF_VALIDATION_FALSE_NEG_ = SubLObjectFactory.makeSymbol("*RBP-WFF-VALIDATION-FALSE-NEG*");
        $sym3$_RBP_WFF_VALIDATE_SETTING_ = SubLObjectFactory.makeSymbol("*RBP-WFF-VALIDATE-SETTING*");
        $sym4$_RBP_VOCABULARY_MTS_ = SubLObjectFactory.makeSymbol("*RBP-VOCABULARY-MTS*");
        $kw5$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym6$_RBP_WFF_QUATERNARY_RMPS_ = SubLObjectFactory.makeSymbol("*RBP-WFF-QUATERNARY-RMPS*");
        $str7$__Performed__D_wff_check_validati = SubLObjectFactory.makeString("~&Performed ~D wff-check validations.~%");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $str9$__Found__D_false_positives___ = SubLObjectFactory.makeString("~&Found ~D false positives.~%");
        $str10$____S__ = SubLObjectFactory.makeString("~& ~S~%");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEG"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $str12$__Found__D_false_negatives___ = SubLObjectFactory.makeString("~&Found ~D false negatives.~%");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym14$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RBP-WFF-CLEAR-CACHES"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RBP-WFF-VALIDATION-RESET"));
        $sym17$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym18$RBP_WFF_VALIDATION_REPORT = SubLObjectFactory.makeSymbol("RBP-WFF-VALIDATION-REPORT");
        $sym19$RBP_WF_NAT_EXTERNAL_ = SubLObjectFactory.makeSymbol("RBP-WF-NAT-EXTERNAL?");
        $sym20$_RBP_WF_NAT_EXTERNAL__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-WF-NAT-EXTERNAL?-CACHING-STATE*");
        $int21$256 = SubLObjectFactory.makeInteger(256);
        $kw22$REPLACE_ME = SubLObjectFactory.makeKeyword("REPLACE-ME");
        $sym23$RBP_WF_TEMPLATE_ARGS_ = SubLObjectFactory.makeSymbol("RBP-WF-TEMPLATE-ARGS?");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT-TEMP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-MT"));
        $sym25$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $kw26$ISA = SubLObjectFactory.makeKeyword("ISA");
        $sym27$RBP_WFF_MAYBE_ISA_ = SubLObjectFactory.makeSymbol("RBP-WFF-MAYBE-ISA?");
        $kw28$NOT_ISA = SubLObjectFactory.makeKeyword("NOT-ISA");
        $sym29$RBP_WFF_NOT_ISA_ = SubLObjectFactory.makeSymbol("RBP-WFF-NOT-ISA?");
        $kw30$GENL = SubLObjectFactory.makeKeyword("GENL");
        $sym31$RBP_WFF_MAYBE_GENL_ = SubLObjectFactory.makeSymbol("RBP-WFF-MAYBE-GENL?");
        $kw32$NOT_GENL = SubLObjectFactory.makeKeyword("NOT-GENL");
        $sym33$NPP_NOT_GENL_ = SubLObjectFactory.makeSymbol("NPP-NOT-GENL?");
        $kw34$NOT_DISJOINT = SubLObjectFactory.makeKeyword("NOT-DISJOINT");
        $sym35$NPP_NOT_DISJOINT_ = SubLObjectFactory.makeSymbol("NPP-NOT-DISJOINT?");
        $kw36$TYPE_GENL = SubLObjectFactory.makeKeyword("TYPE-GENL");
        $sym37$NPP_NOT_TYPE_DISJOINT_ = SubLObjectFactory.makeSymbol("NPP-NOT-TYPE-DISJOINT?");
        $sym38$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const39$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym40$_RBP_WF_TEMPLATE_ARGS__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-WF-TEMPLATE-ARGS?-CACHING-STATE*");
        $list41 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str42$___S_not_sufficiently_defined_in_ = SubLObjectFactory.makeString("~&~S not sufficiently defined in ~S~%~%");
        $list43 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")));
        $list44 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("COLL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str46$__Spent__4_2F_seconds_wff_checkin = SubLObjectFactory.makeString("~&Spent ~4,2F seconds wff-checking.");
        $str47$___D_of__D_items_wff_checked_were = SubLObjectFactory.makeString("  ~D of ~D items wff-checked were non-wf.~%");
        $sym48$RBP_WF_NAT_ = SubLObjectFactory.makeSymbol("RBP-WF-NAT?");
        $sym49$_RBP_WF_NAT__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-WF-NAT?-CACHING-STATE*");
        $const50$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym51$RELEVANT_PRED_IS_SPEC_PRED = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
        $kw52$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw53$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym54$RELEVANT_PRED_IS_SPEC_INVERSE = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
        $const55$typedGenlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typedGenlPreds"));
        $const56$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $const57$typeGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeGenls"));
        $kw58$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym59$NORMAL_INFERENCE = SubLObjectFactory.makeSymbol("NORMAL-INFERENCE");
        $sym60$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $const61$resultGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenl"));
        $const62$resultGenlArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenlArg"));
        $const63$preservesGenlsInArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preservesGenlsInArg"));
        $kw64$PERMISSIVE = SubLObjectFactory.makeKeyword("PERMISSIVE");
        $kw65$STRICT = SubLObjectFactory.makeKeyword("STRICT");
        $const66$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const67$CollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionType"));
        $sym68$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE<");
        $sym69$RBP_WFF_FIND_FLOOR_MTS_INT = SubLObjectFactory.makeSymbol("RBP-WFF-FIND-FLOOR-MTS-INT");
        $sym70$_RBP_WFF_FIND_FLOOR_MTS_INT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-WFF-FIND-FLOOR-MTS-INT-CACHING-STATE*");
        $int71$32 = SubLObjectFactory.makeInteger(32);
        $sym72$MT_RELEVANT_TO_MT_ = SubLObjectFactory.makeSymbol("MT-RELEVANT-TO-MT?");
        $const73$SpecsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $const74$CycLSentence_Assertible = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence-Assertible"));
        $const75$TruthFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TruthFunction"));
        $const76$CollectionDenotingFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDenotingFunction"));
        $const77$relationAllExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists"));
        $sym78$NPP_GENL_OR_ANY_ = SubLObjectFactory.makeSymbol("NPP-GENL-OR-ANY?");
        $const79$relationExistsAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsAll"));
        $const80$relationExistsUniqueAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsUniqueAll"));
        $const81$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $sym82$NPP_ISA_OR_ANY_ = SubLObjectFactory.makeSymbol("NPP-ISA-OR-ANY?");
        $const83$relationInstanceAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceAll"));
        $sym84$RBP_DEFINING_MTS = SubLObjectFactory.makeSymbol("RBP-DEFINING-MTS");
        $sym85$RBP_DEFINING_MT = SubLObjectFactory.makeSymbol("RBP-DEFINING-MT");
        $sym86$MT_VISIBLE_FROM_MT_ = SubLObjectFactory.makeSymbol("MT-VISIBLE-FROM-MT?");
        $sym87$_RBP_DEFINING_MTS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-DEFINING-MTS-CACHING-STATE*");
        $int88$512 = SubLObjectFactory.makeInteger(512);
        $const89$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $list90 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $const91$genlMt_Vocabulary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt-Vocabulary"));
        $const92$VocabularyMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VocabularyMicrotheory"));
        $sym93$RBP_WFF_TEST_FAILS_INT_ = SubLObjectFactory.makeSymbol("RBP-WFF-TEST-FAILS-INT?");
        $const94$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $str95$__RBP_Wff_check_failed___the_foll = SubLObjectFactory.makeString("~&RBP Wff-check failed - the following returned NIL:~% ~S.~%");
        $sym96$_RBP_WFF_TEST_FAILS_INT__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-WFF-TEST-FAILS-INT?-CACHING-STATE*");
        $const97$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $sym98$RBP_WFF_CONSTRAINTS_PRIM_INT_CACHED = SubLObjectFactory.makeSymbol("RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $sym100$_RBP_WFF_CONSTRAINTS_PRIM_INT_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED-CACHING-STATE*");
        $list101 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NPP-COLLECTION?")));
        $list102 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NPP-COLLECTION?")));
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THE-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $kw104$MODIFIER = SubLObjectFactory.makeKeyword("MODIFIER");
        $kw105$HEAD = SubLObjectFactory.makeKeyword("HEAD");
        $sym106$CAR = SubLObjectFactory.makeSymbol("CAR");
        $const107$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list108 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA-P")));
        $const109$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IND-COL"), (SubLObject)SubLObjectFactory.makeSymbol("DEP-COL"));
        $const111$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $list112 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)rbp_wff.ONE_INTEGER);
        $const113$arg2Format = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Format"));
        $list114 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenlsFormat")));
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ARG1-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG2-TYPE"));
        $list116 = ConsesLow.list((SubLObject)rbp_wff.TWO_INTEGER, (SubLObject)rbp_wff.THREE_INTEGER);
        $sym117$_INTER_ARG_ISA_PREDICATE_MT_ = SubLObjectFactory.makeSymbol("*INTER-ARG-ISA-PREDICATE-MT*");
        $const118$InterArgIsaPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InterArgIsaPredicate"));
        $sym119$_ARG_NOT_ISA_PREDICATE_MT_ = SubLObjectFactory.makeSymbol("*ARG-NOT-ISA-PREDICATE-MT*");
        $const120$ArgNotIsaPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgNotIsaPredicate"));
        $sym121$RBP_GET_IAI_PRED = SubLObjectFactory.makeSymbol("RBP-GET-IAI-PRED");
        $sym122$_PRED = SubLObjectFactory.makeSymbol("?PRED");
        $const123$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list124 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InterArgIsaPredicate")));
        $const125$constrainsArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constrainsArgs"));
        $sym126$_RBP_GET_IAI_PRED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-GET-IAI-PRED-CACHING-STATE*");
        $sym127$RBP_GET_ANI_PRED = SubLObjectFactory.makeSymbol("RBP-GET-ANI-PRED");
        $list128 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgNotIsaPredicate")));
        $list129 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")));
        $const130$constrainsArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constrainsArg"));
        $sym131$_RBP_GET_ANI_PRED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-GET-ANI-PRED-CACHING-STATE*");
        $const132$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw133$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw134$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw135$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw136$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym137$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw138$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str139$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym140$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw141$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str142$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw143$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str144$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str145$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str146$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str147$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const148$interArgNotIsa1_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-2"));
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2-TYPE"));
        $sym150$RBP_WFF_TYPE_LEVEL_ARG_NUMS_FOR_FN = SubLObjectFactory.makeSymbol("RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN");
        $sym151$SPEC_ = SubLObjectFactory.makeSymbol("SPEC?");
        $sym152$_RBP_WFF_TYPE_LEVEL_ARG_NUMS_FOR_FN_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN-CACHING-STATE*");
        $int153$128 = SubLObjectFactory.makeInteger(128);
        $const154$SubcollectionOfByFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfByFn"));
        $const155$createdBy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("createdBy"));
        $list156 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TypeTypeTernaryRuleMacroPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TypeInstanceTernaryRuleMacroPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceTypeTernaryRuleMacroPredicate")));
        $const157$relationAllExistsCount = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsCount"));
        $list158 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceWithRelationFromFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceWithRelationToFn")));
        $const159$SubcollectionRelationFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction"));
        $kw160$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw161$TO = SubLObjectFactory.makeKeyword("TO");
        $const162$SubcollectionRelationFunction_Can = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-Canonical"));
        $const163$SubcollectionRelationFunction_Inv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-Inverse"));
        $const164$InstanceWithRelationFromFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceWithRelationFromFn"));
        $const165$InstanceWithRelationToFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceWithRelationToFn"));
        $const166$TheNCArgIsas = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCArgIsas"));
        $sym167$MIN_ARGN_ISA = SubLObjectFactory.makeSymbol("MIN-ARGN-ISA");
        $const168$TheNCArgGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCArgGenls"));
        $sym169$MIN_ARGN_GENL = SubLObjectFactory.makeSymbol("MIN-ARGN-GENL");
    }
}

/*

	Total time: 1875 ms
	
*/